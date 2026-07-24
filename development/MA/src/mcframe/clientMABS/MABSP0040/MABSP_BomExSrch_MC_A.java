package mcframe.clientMABS.MABSP0040;

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
import mcframe.clientMABS.MABSP0040.MABSP_BomExSrch_MC.MA_MABSL0040_Srch01Caller;
import mcframe.clientMABS.MABSP0040.MABSP_BomExSrch_MC.MA_MABSL0040_Srch02Caller;

/**
 * 画面"MABSP_BomExSrch"パネルクラスです。<p>
 *
 * ＢＯＭに対する展開情報を参照します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_BomExSrch_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABS";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABSP0040";

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
	 * EX1,Explosion,1;EX2,Implosion,2 EX1,正展開,1;EX2,逆展開,2.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_EX1 = null;
	public MCRadioButton Cnd_ope_EX2 = null;
	public MCLabel Cnd_base_dt_Label = null;
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDateField Cnd_base_dt = null;
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
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCTextField Cnd_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCTextField Cnd_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCTextField Cnd_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCTextField Cnd_sno4_mng_typ = null;
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Cnd_ver_no_p_PPanel;
	public MCTextComboBox Cnd_ver_no;	// [Cnd]の[ver_no_p.ver_no]を[Cnd_ver_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCLabel Cnd_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextComboBox Cnd_bom_ptn = null;
	/**
	 * Copy BOM pattern 構成パタン引継ぎ.<p>
	 *
	 */
	public MCCheckBox Cnd_bom_ptn_flg = null;
	/**
	 * Phantom item explosion 架空品展開.<p>
	 *
	 */
	public MCCheckBox Cnd_ph_ex_flg = null;
	public MCLabel Cnd_max_hrrchy_Label = null;
	/**
	 * Max. hierarchy 最大階層.<p>
	 *
	 */
	public MCNumberField Cnd_max_hrrchy = null;
	public MCLabel Cnd_base_qty_Label = null;
	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public MCNumberField Cnd_base_qty = null;
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
	// [TopDtl]ブロック関連のField定義
	public MCPanel TopDtlPanel = null;
	// [TopDtl]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0040.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D Dtl_hrrchy_p_PPanel;
	public MCColumnConfig columnDtl_ext;// [Dtl]の[hrrchy_p.ext]を[columnDtl_ext]としてエイリアス定義。
	public MCColumnConfig columnDtl_extno;// [Dtl]の[hrrchy_p.extno]を[columnDtl_extno]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_extno;// [Dtl]の[hrrchy_p.par_extno]を[columnDtl_par_extno]としてエイリアス定義。
	public MCColumnConfig columnDtl_loop_flg;// [Dtl]の[hrrchy_p.loop_flg]を[columnDtl_loop_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_leaf_str;// [Dtl]の[hrrchy_p.leaf_str]を[columnDtl_leaf_str]としてエイリアス定義。
	/**
	 * Bottom 最下位.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bottom_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
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
	/**
	 * By-product 副産品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_byprod_flg = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_mng_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_mng_typ = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_mng_typ = null;
	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_flg = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_mng_typ = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_cd = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dec_place = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl_ver_no_p_PPanel;
	public MCColumnConfig columnDtl_ver_no;// [Dtl]の[ver_no_p.ver_no]を[columnDtl_ver_no]としてエイリアス定義。
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_ptn = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_nm = null;
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_seq = null;
	/**
	 * Phantom 架空.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ph_flg = null;
	/**
	 * Phantom BOM pattern 架空構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ph_bom_ptn = null;
	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_itm_flg = null;
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_grp_cd = null;
	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_grp_nm = null;
	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_itm_typ = null;
	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_itm_typ_nm = null;
	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_itm_ratio = null;
	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_alloc_prio = null;
	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ1 = null;
	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ_nm1 = null;
	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ2 = null;
	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ_nm2 = null;
	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ3 = null;
	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ_nm3 = null;
	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ4 = null;
	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ_nm4 = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Dtl_min_sno_p_PPanel;
	public MCColumnConfig columnDtl_min_sno1;// [Dtl]の[min_sno_p.sno1]を[columnDtl_min_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_min_sno2;// [Dtl]の[min_sno_p.sno2]を[columnDtl_min_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_min_sno3;// [Dtl]の[min_sno_p.sno3]を[columnDtl_min_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_min_sno4;// [Dtl]の[min_sno_p.sno4]を[columnDtl_min_sno4]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Dtl_max_sno_p_PPanel;
	public MCColumnConfig columnDtl_max_sno1;// [Dtl]の[max_sno_p.sno1]を[columnDtl_max_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_max_sno2;// [Dtl]の[max_sno_p.sno2]を[columnDtl_max_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_max_sno3;// [Dtl]の[max_sno_p.sno3]を[columnDtl_max_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_max_sno4;// [Dtl]の[max_sno_p.sno4]を[columnDtl_max_sno4]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Dtl_dt_p_PPanel;
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[dt_p.st_dt]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[dt_p.end_dt]を[columnDtl_end_dt]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_unit_nm = null;
	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty6_p_PPanel;
	public MCColumnConfig columnDtl_conv_inpt_qty;// [Dtl]の[qty6_p.qty]を[columnDtl_conv_inpt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty5_p_PPanel;
	public MCColumnConfig columnDtl_conv_rqmt_qty;// [Dtl]の[qty5_p.qty]を[columnDtl_conv_rqmt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty1_p_PPanel;
	public MCColumnConfig columnDtl_par_inst_qty;// [Dtl]の[qty1_p.qty]を[columnDtl_par_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty3_p_PPanel;
	public MCColumnConfig columnDtl_chd_inpt_qty;// [Dtl]の[qty3_p.qty]を[columnDtl_chd_inpt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty2_p_PPanel;
	public MCColumnConfig columnDtl_chd_rqmt_qty;// [Dtl]の[qty2_p.qty]を[columnDtl_chd_rqmt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty4_p_PPanel;
	public MCColumnConfig columnDtl_fxd_chd_rqmt_qty;// [Dtl]の[qty4_p.qty]を[columnDtl_fxd_chd_rqmt_qty]としてエイリアス定義。
	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_offst_typ = null;
	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_offst_typ_nm = null;
	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_offst = null;
	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bkf_typ = null;
	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bkf_typ_nm = null;
	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inst_lot_fix_flg = null;
	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_mix_flg = null;
	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_mix_flg = null;
	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_ctl_typ = null;
	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_ctl_typ_nm = null;
	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_main_itm_flg = null;
	/**
	 * For yield calculation 収率計算用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_yield_calc_flg = null;
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_ctl_typ = null;
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_ctl_typ_nm = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chng_no = null;
	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_no_bom = null;
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_cost_flg = null;
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
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Search (Breakdown of details) 検索する（詳細）.<p>
	 *
	 */
	public MCButton DtlBtn_srch_dtl = null;
	/**
	 * Explosion 正展開.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABSP0040_EX1 = null;
	/**
	 * Implosion 逆展開.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABSP0040_EX2 = null;
	// [BtmDtl]ブロック関連のField定義
	public MCPanel BtmDtlPanel = null;
	// [BtmDtl]ブロックの項目のField定義
	// [DtlTab]ブロック関連のField定義
	public MCPanel DtlTabPanel = null;
	public MCTabbedPane DtlTabTab = null;
	// [DtlTab]ブロックの項目のField定義
	// [Wrk1Dtl]ブロック関連のField定義
	public MCPanel Wrk1DtlPanel = null;
	public MCScrollPane Wrk1DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0040.Wrk1DtlR> Wrk1DtlTable = null;
	// [Wrk1Dtl]ブロックの項目のField定義
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_del_flg = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk1Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_itm_cd;// [Wrk1Dtl]の[itm_p.itm_cd]を[columnWrk1Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_itm_sub1;// [Wrk1Dtl]の[itm_p.itm_sub1]を[columnWrk1Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_itm_sub2;// [Wrk1Dtl]の[itm_p.itm_sub2]を[columnWrk1Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_itm_sub3;// [Wrk1Dtl]の[itm_p.itm_sub3]を[columnWrk1Dtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_itm_nm;// [Wrk1Dtl]の[itm_p.itm_nm]を[columnWrk1Dtl_itm_nm]としてエイリアス定義。
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_stk_mng_typ = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_asset_mng_typ = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_unit_cd = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_dec_place = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sno4_mng_typ = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_itm_typ_d_nm = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_mfg_loc_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場･物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場･物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_site_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sppl_nm = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_maker_nm = null;
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rqst_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rqst_loc_nm = null;
	/**
	 * Requested location WG cd. 依頼先場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rqst_loc_wg_cd = null;
	/**
	 * Requested location WG name 依頼先場所ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rqst_loc_wg_nm = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_bom_ptn = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk1Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_st_dt;// [Wrk1Dtl]の[dt_p.st_dt]を[columnWrk1Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_end_dt;// [Wrk1Dtl]の[dt_p.end_dt]を[columnWrk1Dtl_end_dt]としてエイリアス定義。
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_oper_ptn = null;
	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_mfg_lt = null;
	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_mfg_lt_add_qty = null;
	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_purc_lt = null;
	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_purc_lt_add_qty = null;
	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_accpt_insp_lt = null;
	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_buf_lt = null;
	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_ord_fix_pd = null;
	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sz_day_week_typ = null;
	/**
	 * Aggregation (by day of week) type name 曜日まとめ区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sz_day_week_typ_nm = null;
	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sz_week = null;
	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_lot_sz_pd = null;
	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_min_lot_qty = null;
	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_batch_lot_qty = null;
	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_max_lot_qty = null;
	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_max_order = null;
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_prio = null;
	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_order_ratio = null;
	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_yield_schd_qty = null;
	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_mfg_inst_qty = null;
	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_fxd_rqmt_qty = null;
	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_lot_issue_typ = null;
	/**
	 * Lot numbering timing type name ロット発番タイミング区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_lot_issue_typ_nm = null;
	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_bkf_flg = null;
	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_ln_stk_flg = null;
	/**
	 * For long LT 先行手配対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_pre_po_tgt_flg = null;
	/**
	 * Issue record sheet at mfg. order 製造指図時記録書発行.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_inst_rec_issue_flg = null;
	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_no_mfg_aprv_flg = null;
	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_itm_lower_yield = null;
	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_itm_std_yield = null;
	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_itm_upper_yield = null;
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_purc_id_typ = null;
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_purc_id_typ_nm = null;
	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rqst_wg_cd = null;
	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rqst_wg_nm = null;
	/**
	 * PO batch 発注バッチ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_po_batch_flg = null;
	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rsrc_cd1 = null;
	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rsrc_nm1 = null;
	/**
	 * Resource unit name 1 資源単位名１.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rsrc_unit_nm1 = null;
	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rsrc_std_qty1 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk1Dtl_qty1_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_rsrc_unit_qty1;// [Wrk1Dtl]の[qty1_p.qty]を[columnWrk1Dtl_rsrc_unit_qty1]としてエイリアス定義。
	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rsrc_cd2 = null;
	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rsrc_nm2 = null;
	/**
	 * Resource unit name 2 資源単位名２.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rsrc_unit_nm2 = null;
	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rsrc_std_qty2 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk1Dtl_qty2_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_rsrc_unit_qty2;// [Wrk1Dtl]の[qty2_p.qty]を[columnWrk1Dtl_rsrc_unit_qty2]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Wrk1Dtl_sno_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_sno1;// [Wrk1Dtl]の[sno_p.sno1]を[columnWrk1Dtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_sno2;// [Wrk1Dtl]の[sno_p.sno2]を[columnWrk1Dtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_sno3;// [Wrk1Dtl]の[sno_p.sno3]を[columnWrk1Dtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_sno4;// [Wrk1Dtl]の[sno_p.sno4]を[columnWrk1Dtl_sno4]としてエイリアス定義。
	/**
	 * Not for MRP ＭＲＰ対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_not_mrp_flg = null;
	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_cost_ratio = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_del_ts = null;
	// [Wrk2Dtl]ブロック関連のField定義
	public MCPanel Wrk2DtlPanel = null;
	public MCScrollPane Wrk2DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0040.Wrk2DtlR> Wrk2DtlTable = null;
	// [Wrk2Dtl]ブロックの項目のField定義
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk2Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_itm_cd;// [Wrk2Dtl]の[itm_p.itm_cd]を[columnWrk2Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_itm_sub1;// [Wrk2Dtl]の[itm_p.itm_sub1]を[columnWrk2Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_itm_sub2;// [Wrk2Dtl]の[itm_p.itm_sub2]を[columnWrk2Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_itm_sub3;// [Wrk2Dtl]の[itm_p.itm_sub3]を[columnWrk2Dtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_itm_nm;// [Wrk2Dtl]の[itm_p.itm_nm]を[columnWrk2Dtl_itm_nm]としてエイリアス定義。
	/**
	 * Item unit cd. 品目単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_itm_unit_cd = null;
	/**
	 * Item number of decimal places 品目小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_itm_dec_place = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_itm_typ_d_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_loc_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_wg_nm = null;
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_ptn = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_nm = null;
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_seq = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk2Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_st_dt;// [Wrk2Dtl]の[dt_p.st_dt]を[columnWrk2Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_end_dt;// [Wrk2Dtl]の[dt_p.end_dt]を[columnWrk2Dtl_end_dt]としてエイリアス定義。
	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_disp_seq = null;
	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_lt = null;
	/**
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_lt_add_qty = null;
	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_offst_typ = null;
	/**
	 * Operation offset type name 工程オフセット区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_offst_typ_nm = null;
	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_offst = null;
	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_offst_add_qty = null;
	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_unit_cd = null;
	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_def_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk2Dtl_qty1_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_oper_std_qty;// [Wrk2Dtl]の[qty1_p.qty]を[columnWrk2Dtl_oper_std_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk2Dtl_qty2_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_oper_conv_qty;// [Wrk2Dtl]の[qty2_p.qty]を[columnWrk2Dtl_oper_conv_qty]としてエイリアス定義。
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_dec_place = null;
	/**
	 * Rounding type (Conversion) 換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_unit_conv_rnd_typ = null;
	/**
	 * Rounding type name (Conversion) 換算端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_unit_conv_rnd_typ_nm = null;
	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_yield_oper_flg = null;
	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_yield_oper_ratio = null;
	/**
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_inst_grp = null;
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_loc_cd = null;
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_loc_nm = null;
	/**
	 * Expiration base date use operation 期限起算日使用工程.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_lmt_fr_dt_flg = null;
	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_lower_yield = null;
	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_std_yield = null;
	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_oper_upper_yield = null;
	/**
	 * WIP progress rate 仕掛進捗率.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_wip_rate = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Wrk2Dtl_sno_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_sno1;// [Wrk2Dtl]の[sno_p.sno1]を[columnWrk2Dtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_sno2;// [Wrk2Dtl]の[sno_p.sno2]を[columnWrk2Dtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_sno3;// [Wrk2Dtl]の[sno_p.sno3]を[columnWrk2Dtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_sno4;// [Wrk2Dtl]の[sno_p.sno4]を[columnWrk2Dtl_sno4]としてエイリアス定義。
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_not_cost_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_del_ts = null;
	// [Wrk3Dtl]ブロック関連のField定義
	public MCPanel Wrk3DtlPanel = null;
	public MCScrollPane Wrk3DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0040.Wrk3DtlR> Wrk3DtlTable = null;
	// [Wrk3Dtl]ブロックの項目のField定義
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk3Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk3Dtl_itm_cd;// [Wrk3Dtl]の[itm_p.itm_cd]を[columnWrk3Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk3Dtl_itm_sub1;// [Wrk3Dtl]の[itm_p.itm_sub1]を[columnWrk3Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk3Dtl_itm_sub2;// [Wrk3Dtl]の[itm_p.itm_sub2]を[columnWrk3Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk3Dtl_itm_sub3;// [Wrk3Dtl]の[itm_p.itm_sub3]を[columnWrk3Dtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnWrk3Dtl_itm_nm;// [Wrk3Dtl]の[itm_p.itm_nm]を[columnWrk3Dtl_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_itm_typ_d_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_loc_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_wg_nm = null;
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_oper_ptn = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_oper_nm = null;
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_oper_seq = null;
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_wk_cost_cd = null;
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_wk_cost_nm = null;
	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_wk_cost_unit_nm = null;
	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_wk_cost_unit_dec_place = null;
	/**
	 * Work element unit rounding type 工数管理単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_wk_cost_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk3Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk3Dtl_st_dt;// [Wrk3Dtl]の[dt_p.st_dt]を[columnWrk3Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk3Dtl_end_dt;// [Wrk3Dtl]の[dt_p.end_dt]を[columnWrk3Dtl_end_dt]としてエイリアス定義。
	/**
	 * Man-hour (Constant) 工数（固定）.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_fxd_wk_cost = null;
	/**
	 * Man-hour (Qty.-dependent) 工数（数量依存）.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_wk_cost = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk3Dtl_qty_p_PPanel;
	public MCColumnConfig columnWrk3Dtl_base_qty;// [Wrk3Dtl]の[qty_p.qty]を[columnWrk3Dtl_base_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_base_unit_nm = null;
	/**
	 * Item number of decimal places 品目小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_itm_dec_place = null;
	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_wk_cost_calc_flg = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_disp_seq = null;
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_not_cost_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_ts = null;
	// [Wrk4Dtl]ブロック関連のField定義
	public MCPanel Wrk4DtlPanel = null;
	public MCScrollPane Wrk4DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0040.Wrk4DtlR> Wrk4DtlTable = null;
	// [Wrk4Dtl]ブロックの項目のField定義
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk4Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk4Dtl_itm_cd;// [Wrk4Dtl]の[itm_p.itm_cd]を[columnWrk4Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk4Dtl_itm_sub1;// [Wrk4Dtl]の[itm_p.itm_sub1]を[columnWrk4Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk4Dtl_itm_sub2;// [Wrk4Dtl]の[itm_p.itm_sub2]を[columnWrk4Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk4Dtl_itm_sub3;// [Wrk4Dtl]の[itm_p.itm_sub3]を[columnWrk4Dtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnWrk4Dtl_itm_nm;// [Wrk4Dtl]の[itm_p.itm_nm]を[columnWrk4Dtl_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_itm_typ_d_nm = null;
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_loc_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_wg_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_loc_grp_nm = null;
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_prio = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_del_ts = null;
	// [Wrk5Dtl]ブロック関連のField定義
	public MCPanel Wrk5DtlPanel = null;
	public MCScrollPane Wrk5DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0040.Wrk5DtlR> Wrk5DtlTable = null;
	// [Wrk5Dtl]ブロックの項目のField定義
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk5Dtl_Itm_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_itm_cd;// [Wrk5Dtl]の[Itm_p.itm_cd]を[columnWrk5Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_itm_sub1;// [Wrk5Dtl]の[Itm_p.itm_sub1]を[columnWrk5Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_itm_sub2;// [Wrk5Dtl]の[Itm_p.itm_sub2]を[columnWrk5Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_itm_sub3;// [Wrk5Dtl]の[Itm_p.itm_sub3]を[columnWrk5Dtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_itm_nm;// [Wrk5Dtl]の[Itm_p.itm_nm]を[columnWrk5Dtl_itm_nm]としてエイリアス定義。
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_dec_place = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_itm_typ_d_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_loc_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk5Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_st_dt;// [Wrk5Dtl]の[dt_p.st_dt]を[columnWrk5Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_end_dt;// [Wrk5Dtl]の[dt_p.end_dt]を[columnWrk5Dtl_end_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk5Dtl_qty1_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_buf_qty;// [Wrk5Dtl]の[qty1_p.qty]を[columnWrk5Dtl_buf_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk5Dtl_qty2_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_rord_stk_qty;// [Wrk5Dtl]の[qty2_p.qty]を[columnWrk5Dtl_rord_stk_qty]としてエイリアス定義。
	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_gi_schd_flg = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk5Dtl_qty3_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_rord_rqst_qty;// [Wrk5Dtl]の[qty3_p.qty]を[columnWrk5Dtl_rord_rqst_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_base_unit_nm = null;
	/**
	 * Lot sizing ロットサイジング.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_lot_sizing_flg = null;
	/**
	 * GI location at reorder point cd. 発注点出庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_gi_loc_cd = null;
	/**
	 * GI location at reorder point name 発注点出庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_gi_loc_nm = null;
	/**
	 * For GI rack/line at reorder point 発注点出庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_gi_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Wrk5Dtl_str_ln1_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_gi_str_ln_cd;// [Wrk5Dtl]の[str_ln1_p.str_ln_cd]を[columnWrk5Dtl_gi_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_gi_str_ln_nm;// [Wrk5Dtl]の[str_ln1_p.str_ln_nm]を[columnWrk5Dtl_gi_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_gi_str_ln_cd_none_flg;// [Wrk5Dtl]の[str_ln1_p.str_ln_cd_none_flg]を[columnWrk5Dtl_gi_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Input item GI location cd. 投入品出庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_inpt_gi_loc_cd = null;
	/**
	 * Input item GI location name 投入品出庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_inpt_gi_loc_nm = null;
	/**
	 * For input item GI rack/line 投入品出庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_inpt_gi_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Wrk5Dtl_str_ln2_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_inpt_gi_str_ln_cd;// [Wrk5Dtl]の[str_ln2_p.str_ln_cd]を[columnWrk5Dtl_inpt_gi_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_inpt_gi_str_ln_nm;// [Wrk5Dtl]の[str_ln2_p.str_ln_nm]を[columnWrk5Dtl_inpt_gi_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_inpt_gi_str_ln_cd_none_flg;// [Wrk5Dtl]の[str_ln2_p.str_ln_cd_none_flg]を[columnWrk5Dtl_inpt_gi_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Shipping item GI location cd. 出荷品出庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ship_gi_loc_cd = null;
	/**
	 * Shipping item GI location name 出荷品出庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ship_gi_loc_nm = null;
	/**
	 * For shipping item GI rack/line 出荷品出庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ship_gi_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Wrk5Dtl_str_ln3_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_ship_gi_str_ln_cd;// [Wrk5Dtl]の[str_ln3_p.str_ln_cd]を[columnWrk5Dtl_ship_gi_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_ship_gi_str_ln_nm;// [Wrk5Dtl]の[str_ln3_p.str_ln_nm]を[columnWrk5Dtl_ship_gi_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_ship_gi_str_ln_cd_none_flg;// [Wrk5Dtl]の[str_ln3_p.str_ln_cd_none_flg]を[columnWrk5Dtl_ship_gi_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_del_ts = null;
	// [Wrk6Dtl]ブロック関連のField定義
	public MCPanel Wrk6DtlPanel = null;
	public MCScrollPane Wrk6DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0040.Wrk6DtlR> Wrk6DtlTable = null;
	// [Wrk6Dtl]ブロックの項目のField定義
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk6Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk6Dtl_itm_cd;// [Wrk6Dtl]の[itm_p.itm_cd]を[columnWrk6Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk6Dtl_itm_sub1;// [Wrk6Dtl]の[itm_p.itm_sub1]を[columnWrk6Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk6Dtl_itm_sub2;// [Wrk6Dtl]の[itm_p.itm_sub2]を[columnWrk6Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk6Dtl_itm_sub3;// [Wrk6Dtl]の[itm_p.itm_sub3]を[columnWrk6Dtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnWrk6Dtl_itm_nm;// [Wrk6Dtl]の[itm_p.itm_nm]を[columnWrk6Dtl_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_itm_typ_d_nm = null;
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_insp_ptn_cd = null;
	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_insp_ptn_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk6Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk6Dtl_st_dt;// [Wrk6Dtl]の[dt_p.st_dt]を[columnWrk6Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk6Dtl_end_dt;// [Wrk6Dtl]の[dt_p.end_dt]を[columnWrk6Dtl_end_dt]としてエイリアス定義。
	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_insp_mtd_typ = null;
	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_insp_mtd_typ_nm = null;
	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_insp_lt = null;
	/**
	 * Specific inspection No. 規格書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_insp_std_no = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_unit_cd = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk6Dtl_qty_p_PPanel;
	public MCColumnConfig columnWrk6Dtl_spl_qty;// [Wrk6Dtl]の[qty_p.qty]を[columnWrk6Dtl_spl_qty]としてエイリアス定義。
	/**
	 * Specific inspection required 規格検査必須.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_std_req_flg = null;
	/**
	 * Specific inspection confirmation required 規格検査確認必須.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_std_cnf_req_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_del_ts = null;
	// [Wrk7Dtl]ブロック関連のField定義
	public MCPanel Wrk7DtlPanel = null;
	public MCScrollPane Wrk7DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0040.Wrk7DtlR> Wrk7DtlTable = null;
	// [Wrk7Dtl]ブロックの項目のField定義
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk7Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk7Dtl_itm_cd;// [Wrk7Dtl]の[itm_p.itm_cd]を[columnWrk7Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk7Dtl_itm_sub1;// [Wrk7Dtl]の[itm_p.itm_sub1]を[columnWrk7Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk7Dtl_itm_sub2;// [Wrk7Dtl]の[itm_p.itm_sub2]を[columnWrk7Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk7Dtl_itm_sub3;// [Wrk7Dtl]の[itm_p.itm_sub3]を[columnWrk7Dtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnWrk7Dtl_itm_nm;// [Wrk7Dtl]の[itm_p.itm_nm]を[columnWrk7Dtl_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_itm_typ_d_nm = null;
	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_lmt_ctl_flg = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_mfg_loc_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_sppl_nm = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_maker_nm = null;
	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_from_site_cd = null;
	/**
	 * Shipping point factory/distribution warehouse name 出荷元工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_from_site_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_to_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_to_site_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk7Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk7Dtl_st_dt;// [Wrk7Dtl]の[dt_p.st_dt]を[columnWrk7Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk7Dtl_end_dt;// [Wrk7Dtl]の[dt_p.end_dt]を[columnWrk7Dtl_end_dt]としてエイリアス定義。
	/**
	 * Not for inspection 検査対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_no_insp_flg = null;
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_insp_ptn_cd = null;
	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_insp_ptn_nm = null;
	/**
	 * Not for market release decision 市場出荷判定対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_no_mrkt_judg_flg = null;
	/**
	 * Not for factory release approval 工場出荷承認対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_no_plnt_aprv_flg = null;
	/**
	 * Not for inspection approval 検査承認対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_no_insp_aprv_flg = null;
	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_lmt_dt_frm_typ = null;
	/**
	 * Expiration base date type name 期限起算日区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_lmt_dt_frm_typ_nm = null;
	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_vld_pd = null;
	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_lmt_pd = null;
	/**
	 * Valid period (At time of the extension) 有効期間（延長時）.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_lot_insp_vld_pd = null;
	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_calc_pd_typ = null;
	/**
	 * Period calculation type name 期間計算区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_calc_pd_typ_nm = null;
	/**
	 * Expiration base date type (Extended) 期限起算日区分（延長時）.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_lot_insp_lmt_dt_frm_typ = null;
	/**
	 * Expiration base date type name (Extended) 期限起算日区分名（延長時）.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm = null;
	/**
	 * Inspection order timing type 検査指図タイミング区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_insp_inst_issue_typ = null;
	/**
	 * Inspection order timing type name 検査指図タイミング区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_insp_inst_issue_typ_nm = null;
	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_insp_offst = null;
	/**
	 * Report issued at inspection order 検査指図時成績書発行.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_inst_rslt_issue_flg = null;
	/**
	 * Prior inspection valid 先行検査有効.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_pre_insp_valid_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_del_ts = null;
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

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABSL0040_Srch01]のCallerの作成 */
	protected MABSP_BomExSrch_MC.MA_MABSL0040_Srch01Caller createMA_MABSL0040_Srch01() {
		MABSP_BomExSrch_MC.MA_MABSL0040_Srch01Caller<MABSP_BomExSrch, MA_MABSL0040_Srch01Bridge>
		caller = ((MABSP_BomExSrch_MC)this).new MA_MABSL0040_Srch01Caller<MABSP_BomExSrch, MA_MABSL0040_Srch01Bridge>(
					(MABSP_BomExSrch)this, new MA_MABSL0040_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL0040_Srch01]の呼び出し */
	protected void callMA_MABSL0040_Srch01() {
		MCCaller caller = createMA_MABSL0040_Srch01();
		caller.exec();
	}
	/** [MA_MABSL0040_Srch02]のCallerの作成 */
	protected MABSP_BomExSrch_MC.MA_MABSL0040_Srch02Caller createMA_MABSL0040_Srch02() {
		MABSP_BomExSrch_MC.MA_MABSL0040_Srch02Caller<MABSP_BomExSrch, MA_MABSL0040_Srch02Bridge>
		caller = ((MABSP_BomExSrch_MC)this).new MA_MABSL0040_Srch02Caller<MABSP_BomExSrch, MA_MABSL0040_Srch02Bridge>(
					(MABSP_BomExSrch)this, new MA_MABSL0040_Srch02Bridge());
		return caller;
	}
	/** [MA_MABSL0040_Srch02]の呼び出し */
	protected void callMA_MABSL0040_Srch02() {
		MCCaller caller = createMA_MABSL0040_Srch02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0040.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0040.DtlR> aDtlL;
	/** [Cnd2]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0040.Cnd2R aCnd2R;
	/** [Wrk1Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0040.Wrk1DtlR> aWrk1DtlL;
	/** [Wrk2Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0040.Wrk2DtlR> aWrk2DtlL;
	/** [Wrk3Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0040.Wrk3DtlR> aWrk3DtlL;
	/** [Wrk4Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0040.Wrk4DtlR> aWrk4DtlL;
	/** [Wrk5Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0040.Wrk5DtlR> aWrk5DtlL;
	/** [Wrk6Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0040.Wrk6DtlR> aWrk6DtlL;
	/** [Wrk7Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0040.Wrk7DtlR> aWrk7DtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP0040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0040.CndR createCndR() {
		return mcframe.clientMABS.MABSP0040.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP0040.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP0040.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP0040.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0040.DtlR.class);
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
	 * 項目コピーによってaCnd2Rを設定します。
	 *
	 * aCnd2Rのインスタンスは変更されません。
	 *
	 * @param row Cnd2R
	 */
	public void setCnd2R(mcframe.clientMABS.MABSP0040.Cnd2R row) {
		if (row != null) {
			MCRow.copyall(getCnd2R(), row);
		}
	}

	/**
	 * [Cnd2]ブロックのコンテナaCnd2Rを返します。
	 *
	 * @return Cnd2R
	 */
	public mcframe.clientMABS.MABSP0040.Cnd2R getCnd2R() {
		return aCnd2R;
	}

	/**
	 * aCnd2Rを作成します。
	 *
	 * @return Cnd2R
	 */
	public mcframe.clientMABS.MABSP0040.Cnd2R createCnd2R() {
		return mcframe.clientMABS.MABSP0040.Cnd2R.create();
	}

	/**
	 * コピーによってaWrk1DtlLを設定します。
	 *
	 * aWrk1DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk1DtlL
	 */
	public void setWrk1DtlL(MCList<mcframe.clientMABS.MABSP0040.Wrk1DtlR> aList) {
		if (getWrk1DtlL() != aList) {
			getWrk1DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk1Dtl]ブロックのコンテナaWrk1DtlLを返します。
	 *
	 * @return Wrk1DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk1DtlR> getWrk1DtlL() {
		return aWrk1DtlL;
	}

	/**
	 * aWrk1DtlRを作成します。
	 *
	 * @return Wrk1DtlR
	 */
	public mcframe.clientMABS.MABSP0040.Wrk1DtlR createWrk1DtlR() {
		return mcframe.clientMABS.MABSP0040.Wrk1DtlR.create();
	}

	/**
	 * aWrk1DtlLを作成します。
	 *
	 * @return Wrk1DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk1DtlR> createWrk1DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0040.Wrk1DtlR.class);
	}

	/**
	 * Wrk1DtlTableを初期化します。
	 */
	protected void createWrk1DtlTable(){
		if(Wrk1DtlTable == null){
			Wrk1DtlTable = beansFactory.createTable2("Wrk1Dtl.table");
		}
	}

	/**
	 * コピーによってaWrk2DtlLを設定します。
	 *
	 * aWrk2DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk2DtlL
	 */
	public void setWrk2DtlL(MCList<mcframe.clientMABS.MABSP0040.Wrk2DtlR> aList) {
		if (getWrk2DtlL() != aList) {
			getWrk2DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk2Dtl]ブロックのコンテナaWrk2DtlLを返します。
	 *
	 * @return Wrk2DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk2DtlR> getWrk2DtlL() {
		return aWrk2DtlL;
	}

	/**
	 * aWrk2DtlRを作成します。
	 *
	 * @return Wrk2DtlR
	 */
	public mcframe.clientMABS.MABSP0040.Wrk2DtlR createWrk2DtlR() {
		return mcframe.clientMABS.MABSP0040.Wrk2DtlR.create();
	}

	/**
	 * aWrk2DtlLを作成します。
	 *
	 * @return Wrk2DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk2DtlR> createWrk2DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0040.Wrk2DtlR.class);
	}

	/**
	 * Wrk2DtlTableを初期化します。
	 */
	protected void createWrk2DtlTable(){
		if(Wrk2DtlTable == null){
			Wrk2DtlTable = beansFactory.createTable2("Wrk2Dtl.table");
		}
	}

	/**
	 * コピーによってaWrk3DtlLを設定します。
	 *
	 * aWrk3DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk3DtlL
	 */
	public void setWrk3DtlL(MCList<mcframe.clientMABS.MABSP0040.Wrk3DtlR> aList) {
		if (getWrk3DtlL() != aList) {
			getWrk3DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk3Dtl]ブロックのコンテナaWrk3DtlLを返します。
	 *
	 * @return Wrk3DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk3DtlR> getWrk3DtlL() {
		return aWrk3DtlL;
	}

	/**
	 * aWrk3DtlRを作成します。
	 *
	 * @return Wrk3DtlR
	 */
	public mcframe.clientMABS.MABSP0040.Wrk3DtlR createWrk3DtlR() {
		return mcframe.clientMABS.MABSP0040.Wrk3DtlR.create();
	}

	/**
	 * aWrk3DtlLを作成します。
	 *
	 * @return Wrk3DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk3DtlR> createWrk3DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0040.Wrk3DtlR.class);
	}

	/**
	 * Wrk3DtlTableを初期化します。
	 */
	protected void createWrk3DtlTable(){
		if(Wrk3DtlTable == null){
			Wrk3DtlTable = beansFactory.createTable2("Wrk3Dtl.table");
		}
	}

	/**
	 * コピーによってaWrk4DtlLを設定します。
	 *
	 * aWrk4DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk4DtlL
	 */
	public void setWrk4DtlL(MCList<mcframe.clientMABS.MABSP0040.Wrk4DtlR> aList) {
		if (getWrk4DtlL() != aList) {
			getWrk4DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk4Dtl]ブロックのコンテナaWrk4DtlLを返します。
	 *
	 * @return Wrk4DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk4DtlR> getWrk4DtlL() {
		return aWrk4DtlL;
	}

	/**
	 * aWrk4DtlRを作成します。
	 *
	 * @return Wrk4DtlR
	 */
	public mcframe.clientMABS.MABSP0040.Wrk4DtlR createWrk4DtlR() {
		return mcframe.clientMABS.MABSP0040.Wrk4DtlR.create();
	}

	/**
	 * aWrk4DtlLを作成します。
	 *
	 * @return Wrk4DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk4DtlR> createWrk4DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0040.Wrk4DtlR.class);
	}

	/**
	 * Wrk4DtlTableを初期化します。
	 */
	protected void createWrk4DtlTable(){
		if(Wrk4DtlTable == null){
			Wrk4DtlTable = beansFactory.createTable2("Wrk4Dtl.table");
		}
	}

	/**
	 * コピーによってaWrk5DtlLを設定します。
	 *
	 * aWrk5DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk5DtlL
	 */
	public void setWrk5DtlL(MCList<mcframe.clientMABS.MABSP0040.Wrk5DtlR> aList) {
		if (getWrk5DtlL() != aList) {
			getWrk5DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk5Dtl]ブロックのコンテナaWrk5DtlLを返します。
	 *
	 * @return Wrk5DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk5DtlR> getWrk5DtlL() {
		return aWrk5DtlL;
	}

	/**
	 * aWrk5DtlRを作成します。
	 *
	 * @return Wrk5DtlR
	 */
	public mcframe.clientMABS.MABSP0040.Wrk5DtlR createWrk5DtlR() {
		return mcframe.clientMABS.MABSP0040.Wrk5DtlR.create();
	}

	/**
	 * aWrk5DtlLを作成します。
	 *
	 * @return Wrk5DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk5DtlR> createWrk5DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0040.Wrk5DtlR.class);
	}

	/**
	 * Wrk5DtlTableを初期化します。
	 */
	protected void createWrk5DtlTable(){
		if(Wrk5DtlTable == null){
			Wrk5DtlTable = beansFactory.createTable2("Wrk5Dtl.table");
		}
	}

	/**
	 * コピーによってaWrk6DtlLを設定します。
	 *
	 * aWrk6DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk6DtlL
	 */
	public void setWrk6DtlL(MCList<mcframe.clientMABS.MABSP0040.Wrk6DtlR> aList) {
		if (getWrk6DtlL() != aList) {
			getWrk6DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk6Dtl]ブロックのコンテナaWrk6DtlLを返します。
	 *
	 * @return Wrk6DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk6DtlR> getWrk6DtlL() {
		return aWrk6DtlL;
	}

	/**
	 * aWrk6DtlRを作成します。
	 *
	 * @return Wrk6DtlR
	 */
	public mcframe.clientMABS.MABSP0040.Wrk6DtlR createWrk6DtlR() {
		return mcframe.clientMABS.MABSP0040.Wrk6DtlR.create();
	}

	/**
	 * aWrk6DtlLを作成します。
	 *
	 * @return Wrk6DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk6DtlR> createWrk6DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0040.Wrk6DtlR.class);
	}

	/**
	 * Wrk6DtlTableを初期化します。
	 */
	protected void createWrk6DtlTable(){
		if(Wrk6DtlTable == null){
			Wrk6DtlTable = beansFactory.createTable2("Wrk6Dtl.table");
		}
	}

	/**
	 * コピーによってaWrk7DtlLを設定します。
	 *
	 * aWrk7DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk7DtlL
	 */
	public void setWrk7DtlL(MCList<mcframe.clientMABS.MABSP0040.Wrk7DtlR> aList) {
		if (getWrk7DtlL() != aList) {
			getWrk7DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk7Dtl]ブロックのコンテナaWrk7DtlLを返します。
	 *
	 * @return Wrk7DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk7DtlR> getWrk7DtlL() {
		return aWrk7DtlL;
	}

	/**
	 * aWrk7DtlRを作成します。
	 *
	 * @return Wrk7DtlR
	 */
	public mcframe.clientMABS.MABSP0040.Wrk7DtlR createWrk7DtlR() {
		return mcframe.clientMABS.MABSP0040.Wrk7DtlR.create();
	}

	/**
	 * aWrk7DtlLを作成します。
	 *
	 * @return Wrk7DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0040.Wrk7DtlR> createWrk7DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0040.Wrk7DtlR.class);
	}

	/**
	 * Wrk7DtlTableを初期化します。
	 */
	protected void createWrk7DtlTable(){
		if(Wrk7DtlTable == null){
			Wrk7DtlTable = beansFactory.createTable2("Wrk7Dtl.table");
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
		if(!MCCollectionUtil.contains(ret, getCnd2R())) ret.add(getCnd2R());
		if(!MCCollectionUtil.contains(ret, getWrk1DtlL())) ret.add(getWrk1DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk2DtlL())) ret.add(getWrk2DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk3DtlL())) ret.add(getWrk3DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk4DtlL())) ret.add(getWrk4DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk5DtlL())) ret.add(getWrk5DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk6DtlL())) ret.add(getWrk6DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk7DtlL())) ret.add(getWrk7DtlL());
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
		if(aCnt == getCnd2R()) return "Cnd2";
		if(aCnt == getWrk1DtlL()) return "Wrk1Dtl";
		if(aCnt == getWrk2DtlL()) return "Wrk2Dtl";
		if(aCnt == getWrk3DtlL()) return "Wrk3Dtl";
		if(aCnt == getWrk4DtlL()) return "Wrk4Dtl";
		if(aCnt == getWrk5DtlL()) return "Wrk5Dtl";
		if(aCnt == getWrk6DtlL()) return "Wrk6Dtl";
		if(aCnt == getWrk7DtlL()) return "Wrk7Dtl";
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
		if(bId.equals("Cnd2")) return getCnd2R();
		if(bId.equals("Wrk1Dtl")) return getWrk1DtlL();
		if(bId.equals("Wrk2Dtl")) return getWrk2DtlL();
		if(bId.equals("Wrk3Dtl")) return getWrk3DtlL();
		if(bId.equals("Wrk4Dtl")) return getWrk4DtlL();
		if(bId.equals("Wrk5Dtl")) return getWrk5DtlL();
		if(bId.equals("Wrk6Dtl")) return getWrk6DtlL();
		if(bId.equals("Wrk7Dtl")) return getWrk7DtlL();
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
		ret.add(TopDtlPanel);
		ret.add(HdrPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(BtmDtlPanel);
		ret.add(DtlTabPanel);
		ret.add(Wrk1DtlPanel);
		ret.add(Wrk2DtlPanel);
		ret.add(Wrk3DtlPanel);
		ret.add(Wrk4DtlPanel);
		ret.add(Wrk5DtlPanel);
		ret.add(Wrk6DtlPanel);
		ret.add(Wrk7DtlPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_BomExSrch_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aCnd2R = createCnd2R();
		aWrk1DtlL = createWrk1DtlL();
		aWrk2DtlL = createWrk2DtlL();
		aWrk3DtlL = createWrk3DtlL();
		aWrk4DtlL = createWrk4DtlL();
		aWrk5DtlL = createWrk5DtlL();
		aWrk6DtlL = createWrk6DtlL();
		aWrk7DtlL = createWrk7DtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_BomExSrch_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aCnd2R = createCnd2R();
		aWrk1DtlL = createWrk1DtlL();
		createWrk1DtlTable();
		Wrk1DtlTable.setRowName(name);
		aWrk2DtlL = createWrk2DtlL();
		createWrk2DtlTable();
		Wrk2DtlTable.setRowName(name);
		aWrk3DtlL = createWrk3DtlL();
		createWrk3DtlTable();
		Wrk3DtlTable.setRowName(name);
		aWrk4DtlL = createWrk4DtlL();
		createWrk4DtlTable();
		Wrk4DtlTable.setRowName(name);
		aWrk5DtlL = createWrk5DtlL();
		createWrk5DtlTable();
		Wrk5DtlTable.setRowName(name);
		aWrk6DtlL = createWrk6DtlL();
		createWrk6DtlTable();
		Wrk6DtlTable.setRowName(name);
		aWrk7DtlL = createWrk7DtlL();
		createWrk7DtlTable();
		Wrk7DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABSP_BomExSrch_MC.jbCreateScreenOpe((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateTop((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateFold((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateCnd((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateCtrl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateRPnl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateTopDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateHdr((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateDtlBtn((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateBtmDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateDtlTab((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateWrk1Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateWrk2Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateWrk3Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateWrk4Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateWrk5Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateWrk6Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbCreateWrk7Dtl((MABSP_BomExSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_BomExSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_BomExSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_BomExSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_BomExSrch p) {
		p.Cnd_itm_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm());
		p.Cnd_itm_PPanel.setName("Cnd.itm");
		p.Cnd_itm_cd = p.Cnd_itm_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
		p.Cnd_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.create(p.getCndR().ver_no_p());
		p.Cnd_ver_no_p_PPanel.setName("Cnd.ver_no_p");
		p.Cnd_ver_no = p.Cnd_ver_no_p_PPanel.VerNo_ver_no;
		p.Cnd_ver_no.addAliasName("Cnd.ver_no", p);
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
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_BomExSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MABSP_BomExSrch p) {
	}

	/**
	 * [TopDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTopDtl(MABSP_BomExSrch p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MABSP_BomExSrch p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_BomExSrch p) {
		p.Dtl_hrrchy_p_PPanel = mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.create(mcframe.clientMABS.MABSP0040.DtlR.$hrrchy_p);
		p.Dtl_hrrchy_p_PPanel.setName("Dtl.hrrchy_p");
		p.columnDtl_ext = p.Dtl_hrrchy_p_PPanel.columnHrrchy_ext;
		p.columnDtl_ext.addAliasName("Dtl.ext", p);
		p.columnDtl_extno = p.Dtl_hrrchy_p_PPanel.columnHrrchy_extno;
		p.columnDtl_extno.addAliasName("Dtl.extno", p);
		p.columnDtl_par_extno = p.Dtl_hrrchy_p_PPanel.columnHrrchy_par_extno;
		p.columnDtl_par_extno.addAliasName("Dtl.par_extno", p);
		p.columnDtl_loop_flg = p.Dtl_hrrchy_p_PPanel.columnHrrchy_loop_flg;
		p.columnDtl_loop_flg.addAliasName("Dtl.loop_flg", p);
		p.columnDtl_leaf_str = p.Dtl_hrrchy_p_PPanel.columnHrrchy_leaf_str;
		p.columnDtl_leaf_str.addAliasName("Dtl.leaf_str", p);
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0040.DtlR.$itm_p);
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
		p.Dtl_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMABS.MABSP0040.DtlR.$ver_no_p);
		p.Dtl_ver_no_p_PPanel.setName("Dtl.ver_no_p");
		p.columnDtl_ver_no = p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl_ver_no.addAliasName("Dtl.ver_no", p);
		p.Dtl_min_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMABS.MABSP0040.DtlR.$min_sno_p);
		p.Dtl_min_sno_p_PPanel.setName("Dtl.min_sno_p");
		p.columnDtl_min_sno1 = p.Dtl_min_sno_p_PPanel.columnSno_sno1;
		p.columnDtl_min_sno1.addAliasName("Dtl.min_sno1", p);
		p.columnDtl_min_sno2 = p.Dtl_min_sno_p_PPanel.columnSno_sno2;
		p.columnDtl_min_sno2.addAliasName("Dtl.min_sno2", p);
		p.columnDtl_min_sno3 = p.Dtl_min_sno_p_PPanel.columnSno_sno3;
		p.columnDtl_min_sno3.addAliasName("Dtl.min_sno3", p);
		p.columnDtl_min_sno4 = p.Dtl_min_sno_p_PPanel.columnSno_sno4;
		p.columnDtl_min_sno4.addAliasName("Dtl.min_sno4", p);
		p.Dtl_max_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMABS.MABSP0040.DtlR.$max_sno_p);
		p.Dtl_max_sno_p_PPanel.setName("Dtl.max_sno_p");
		p.columnDtl_max_sno1 = p.Dtl_max_sno_p_PPanel.columnSno_sno1;
		p.columnDtl_max_sno1.addAliasName("Dtl.max_sno1", p);
		p.columnDtl_max_sno2 = p.Dtl_max_sno_p_PPanel.columnSno_sno2;
		p.columnDtl_max_sno2.addAliasName("Dtl.max_sno2", p);
		p.columnDtl_max_sno3 = p.Dtl_max_sno_p_PPanel.columnSno_sno3;
		p.columnDtl_max_sno3.addAliasName("Dtl.max_sno3", p);
		p.columnDtl_max_sno4 = p.Dtl_max_sno_p_PPanel.columnSno_sno4;
		p.columnDtl_max_sno4.addAliasName("Dtl.max_sno4", p);
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0040.DtlR.$dt_p);
		p.Dtl_dt_p_PPanel.setName("Dtl.dt_p");
		p.columnDtl_st_dt = p.Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_end_dt = p.Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
		p.Dtl_qty6_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.DtlR.$qty6_p);
		p.Dtl_qty6_p_PPanel.setName("Dtl.qty6_p");
		p.columnDtl_conv_inpt_qty = p.Dtl_qty6_p_PPanel.columnQty_qty;
		p.columnDtl_conv_inpt_qty.addAliasName("Dtl.conv_inpt_qty", p);
		p.Dtl_qty5_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.DtlR.$qty5_p);
		p.Dtl_qty5_p_PPanel.setName("Dtl.qty5_p");
		p.columnDtl_conv_rqmt_qty = p.Dtl_qty5_p_PPanel.columnQty_qty;
		p.columnDtl_conv_rqmt_qty.addAliasName("Dtl.conv_rqmt_qty", p);
		p.Dtl_qty1_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.DtlR.$qty1_p);
		p.Dtl_qty1_p_PPanel.setName("Dtl.qty1_p");
		p.columnDtl_par_inst_qty = p.Dtl_qty1_p_PPanel.columnQty_qty;
		p.columnDtl_par_inst_qty.addAliasName("Dtl.par_inst_qty", p);
		p.Dtl_qty3_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.DtlR.$qty3_p);
		p.Dtl_qty3_p_PPanel.setName("Dtl.qty3_p");
		p.columnDtl_chd_inpt_qty = p.Dtl_qty3_p_PPanel.columnQty_qty;
		p.columnDtl_chd_inpt_qty.addAliasName("Dtl.chd_inpt_qty", p);
		p.Dtl_qty2_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.DtlR.$qty2_p);
		p.Dtl_qty2_p_PPanel.setName("Dtl.qty2_p");
		p.columnDtl_chd_rqmt_qty = p.Dtl_qty2_p_PPanel.columnQty_qty;
		p.columnDtl_chd_rqmt_qty.addAliasName("Dtl.chd_rqmt_qty", p);
		p.Dtl_qty4_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.DtlR.$qty4_p);
		p.Dtl_qty4_p_PPanel.setName("Dtl.qty4_p");
		p.columnDtl_fxd_chd_rqmt_qty = p.Dtl_qty4_p_PPanel.columnQty_qty;
		p.columnDtl_fxd_chd_rqmt_qty.addAliasName("Dtl.fxd_chd_rqmt_qty", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABSP_BomExSrch p) {
	}

	/**
	 * [BtmDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtmDtl(MABSP_BomExSrch p) {
	}

	/**
	 * [DtlTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlTab(MABSP_BomExSrch p) {
	}

	/**
	 * [Wrk1Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1Dtl(MABSP_BomExSrch p) {
		p.Wrk1Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0040.Wrk1DtlR.$itm_p);
		p.Wrk1Dtl_itm_p_PPanel.setName("Wrk1Dtl.itm_p");
		p.columnWrk1Dtl_itm_cd = p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk1Dtl_itm_cd.addAliasName("Wrk1Dtl.itm_cd", p);
		p.columnWrk1Dtl_itm_sub1 = p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk1Dtl_itm_sub1.addAliasName("Wrk1Dtl.itm_sub1", p);
		p.columnWrk1Dtl_itm_sub2 = p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk1Dtl_itm_sub2.addAliasName("Wrk1Dtl.itm_sub2", p);
		p.columnWrk1Dtl_itm_sub3 = p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk1Dtl_itm_sub3.addAliasName("Wrk1Dtl.itm_sub3", p);
		p.columnWrk1Dtl_itm_nm = p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnWrk1Dtl_itm_nm.addAliasName("Wrk1Dtl.itm_nm", p);
		p.Wrk1Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0040.Wrk1DtlR.$dt_p);
		p.Wrk1Dtl_dt_p_PPanel.setName("Wrk1Dtl.dt_p");
		p.columnWrk1Dtl_st_dt = p.Wrk1Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk1Dtl_st_dt.addAliasName("Wrk1Dtl.st_dt", p);
		p.columnWrk1Dtl_end_dt = p.Wrk1Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk1Dtl_end_dt.addAliasName("Wrk1Dtl.end_dt", p);
		p.Wrk1Dtl_qty1_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.Wrk1DtlR.$qty1_p);
		p.Wrk1Dtl_qty1_p_PPanel.setName("Wrk1Dtl.qty1_p");
		p.columnWrk1Dtl_rsrc_unit_qty1 = p.Wrk1Dtl_qty1_p_PPanel.columnQty_qty;
		p.columnWrk1Dtl_rsrc_unit_qty1.addAliasName("Wrk1Dtl.rsrc_unit_qty1", p);
		p.Wrk1Dtl_qty2_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.Wrk1DtlR.$qty2_p);
		p.Wrk1Dtl_qty2_p_PPanel.setName("Wrk1Dtl.qty2_p");
		p.columnWrk1Dtl_rsrc_unit_qty2 = p.Wrk1Dtl_qty2_p_PPanel.columnQty_qty;
		p.columnWrk1Dtl_rsrc_unit_qty2.addAliasName("Wrk1Dtl.rsrc_unit_qty2", p);
		p.Wrk1Dtl_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMABS.MABSP0040.Wrk1DtlR.$sno_p);
		p.Wrk1Dtl_sno_p_PPanel.setName("Wrk1Dtl.sno_p");
		p.columnWrk1Dtl_sno1 = p.Wrk1Dtl_sno_p_PPanel.columnSno_sno1;
		p.columnWrk1Dtl_sno1.addAliasName("Wrk1Dtl.sno1", p);
		p.columnWrk1Dtl_sno2 = p.Wrk1Dtl_sno_p_PPanel.columnSno_sno2;
		p.columnWrk1Dtl_sno2.addAliasName("Wrk1Dtl.sno2", p);
		p.columnWrk1Dtl_sno3 = p.Wrk1Dtl_sno_p_PPanel.columnSno_sno3;
		p.columnWrk1Dtl_sno3.addAliasName("Wrk1Dtl.sno3", p);
		p.columnWrk1Dtl_sno4 = p.Wrk1Dtl_sno_p_PPanel.columnSno_sno4;
		p.columnWrk1Dtl_sno4.addAliasName("Wrk1Dtl.sno4", p);
	}

	/**
	 * [Wrk2Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2Dtl(MABSP_BomExSrch p) {
		p.Wrk2Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0040.Wrk2DtlR.$itm_p);
		p.Wrk2Dtl_itm_p_PPanel.setName("Wrk2Dtl.itm_p");
		p.columnWrk2Dtl_itm_cd = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk2Dtl_itm_cd.addAliasName("Wrk2Dtl.itm_cd", p);
		p.columnWrk2Dtl_itm_sub1 = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk2Dtl_itm_sub1.addAliasName("Wrk2Dtl.itm_sub1", p);
		p.columnWrk2Dtl_itm_sub2 = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk2Dtl_itm_sub2.addAliasName("Wrk2Dtl.itm_sub2", p);
		p.columnWrk2Dtl_itm_sub3 = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk2Dtl_itm_sub3.addAliasName("Wrk2Dtl.itm_sub3", p);
		p.columnWrk2Dtl_itm_nm = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnWrk2Dtl_itm_nm.addAliasName("Wrk2Dtl.itm_nm", p);
		p.Wrk2Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0040.Wrk2DtlR.$dt_p);
		p.Wrk2Dtl_dt_p_PPanel.setName("Wrk2Dtl.dt_p");
		p.columnWrk2Dtl_st_dt = p.Wrk2Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk2Dtl_st_dt.addAliasName("Wrk2Dtl.st_dt", p);
		p.columnWrk2Dtl_end_dt = p.Wrk2Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk2Dtl_end_dt.addAliasName("Wrk2Dtl.end_dt", p);
		p.Wrk2Dtl_qty1_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.Wrk2DtlR.$qty1_p);
		p.Wrk2Dtl_qty1_p_PPanel.setName("Wrk2Dtl.qty1_p");
		p.columnWrk2Dtl_oper_std_qty = p.Wrk2Dtl_qty1_p_PPanel.columnQty_qty;
		p.columnWrk2Dtl_oper_std_qty.addAliasName("Wrk2Dtl.oper_std_qty", p);
		p.Wrk2Dtl_qty2_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.Wrk2DtlR.$qty2_p);
		p.Wrk2Dtl_qty2_p_PPanel.setName("Wrk2Dtl.qty2_p");
		p.columnWrk2Dtl_oper_conv_qty = p.Wrk2Dtl_qty2_p_PPanel.columnQty_qty;
		p.columnWrk2Dtl_oper_conv_qty.addAliasName("Wrk2Dtl.oper_conv_qty", p);
		p.Wrk2Dtl_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMABS.MABSP0040.Wrk2DtlR.$sno_p);
		p.Wrk2Dtl_sno_p_PPanel.setName("Wrk2Dtl.sno_p");
		p.columnWrk2Dtl_sno1 = p.Wrk2Dtl_sno_p_PPanel.columnSno_sno1;
		p.columnWrk2Dtl_sno1.addAliasName("Wrk2Dtl.sno1", p);
		p.columnWrk2Dtl_sno2 = p.Wrk2Dtl_sno_p_PPanel.columnSno_sno2;
		p.columnWrk2Dtl_sno2.addAliasName("Wrk2Dtl.sno2", p);
		p.columnWrk2Dtl_sno3 = p.Wrk2Dtl_sno_p_PPanel.columnSno_sno3;
		p.columnWrk2Dtl_sno3.addAliasName("Wrk2Dtl.sno3", p);
		p.columnWrk2Dtl_sno4 = p.Wrk2Dtl_sno_p_PPanel.columnSno_sno4;
		p.columnWrk2Dtl_sno4.addAliasName("Wrk2Dtl.sno4", p);
	}

	/**
	 * [Wrk3Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3Dtl(MABSP_BomExSrch p) {
		p.Wrk3Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0040.Wrk3DtlR.$itm_p);
		p.Wrk3Dtl_itm_p_PPanel.setName("Wrk3Dtl.itm_p");
		p.columnWrk3Dtl_itm_cd = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk3Dtl_itm_cd.addAliasName("Wrk3Dtl.itm_cd", p);
		p.columnWrk3Dtl_itm_sub1 = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk3Dtl_itm_sub1.addAliasName("Wrk3Dtl.itm_sub1", p);
		p.columnWrk3Dtl_itm_sub2 = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk3Dtl_itm_sub2.addAliasName("Wrk3Dtl.itm_sub2", p);
		p.columnWrk3Dtl_itm_sub3 = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk3Dtl_itm_sub3.addAliasName("Wrk3Dtl.itm_sub3", p);
		p.columnWrk3Dtl_itm_nm = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnWrk3Dtl_itm_nm.addAliasName("Wrk3Dtl.itm_nm", p);
		p.Wrk3Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0040.Wrk3DtlR.$dt_p);
		p.Wrk3Dtl_dt_p_PPanel.setName("Wrk3Dtl.dt_p");
		p.columnWrk3Dtl_st_dt = p.Wrk3Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk3Dtl_st_dt.addAliasName("Wrk3Dtl.st_dt", p);
		p.columnWrk3Dtl_end_dt = p.Wrk3Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk3Dtl_end_dt.addAliasName("Wrk3Dtl.end_dt", p);
		p.Wrk3Dtl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.Wrk3DtlR.$qty_p);
		p.Wrk3Dtl_qty_p_PPanel.setName("Wrk3Dtl.qty_p");
		p.columnWrk3Dtl_base_qty = p.Wrk3Dtl_qty_p_PPanel.columnQty_qty;
		p.columnWrk3Dtl_base_qty.addAliasName("Wrk3Dtl.base_qty", p);
	}

	/**
	 * [Wrk4Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk4Dtl(MABSP_BomExSrch p) {
		p.Wrk4Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0040.Wrk4DtlR.$itm_p);
		p.Wrk4Dtl_itm_p_PPanel.setName("Wrk4Dtl.itm_p");
		p.columnWrk4Dtl_itm_cd = p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk4Dtl_itm_cd.addAliasName("Wrk4Dtl.itm_cd", p);
		p.columnWrk4Dtl_itm_sub1 = p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk4Dtl_itm_sub1.addAliasName("Wrk4Dtl.itm_sub1", p);
		p.columnWrk4Dtl_itm_sub2 = p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk4Dtl_itm_sub2.addAliasName("Wrk4Dtl.itm_sub2", p);
		p.columnWrk4Dtl_itm_sub3 = p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk4Dtl_itm_sub3.addAliasName("Wrk4Dtl.itm_sub3", p);
		p.columnWrk4Dtl_itm_nm = p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnWrk4Dtl_itm_nm.addAliasName("Wrk4Dtl.itm_nm", p);
	}

	/**
	 * [Wrk5Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk5Dtl(MABSP_BomExSrch p) {
		p.Wrk5Dtl_Itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0040.Wrk5DtlR.$Itm_p);
		p.Wrk5Dtl_Itm_p_PPanel.setName("Wrk5Dtl.Itm_p");
		p.columnWrk5Dtl_itm_cd = p.Wrk5Dtl_Itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk5Dtl_itm_cd.addAliasName("Wrk5Dtl.itm_cd", p);
		p.columnWrk5Dtl_itm_sub1 = p.Wrk5Dtl_Itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk5Dtl_itm_sub1.addAliasName("Wrk5Dtl.itm_sub1", p);
		p.columnWrk5Dtl_itm_sub2 = p.Wrk5Dtl_Itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk5Dtl_itm_sub2.addAliasName("Wrk5Dtl.itm_sub2", p);
		p.columnWrk5Dtl_itm_sub3 = p.Wrk5Dtl_Itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk5Dtl_itm_sub3.addAliasName("Wrk5Dtl.itm_sub3", p);
		p.columnWrk5Dtl_itm_nm = p.Wrk5Dtl_Itm_p_PPanel.columnItm_itm_nm;
		p.columnWrk5Dtl_itm_nm.addAliasName("Wrk5Dtl.itm_nm", p);
		p.Wrk5Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0040.Wrk5DtlR.$dt_p);
		p.Wrk5Dtl_dt_p_PPanel.setName("Wrk5Dtl.dt_p");
		p.columnWrk5Dtl_st_dt = p.Wrk5Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk5Dtl_st_dt.addAliasName("Wrk5Dtl.st_dt", p);
		p.columnWrk5Dtl_end_dt = p.Wrk5Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk5Dtl_end_dt.addAliasName("Wrk5Dtl.end_dt", p);
		p.Wrk5Dtl_qty1_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.Wrk5DtlR.$qty1_p);
		p.Wrk5Dtl_qty1_p_PPanel.setName("Wrk5Dtl.qty1_p");
		p.columnWrk5Dtl_buf_qty = p.Wrk5Dtl_qty1_p_PPanel.columnQty_qty;
		p.columnWrk5Dtl_buf_qty.addAliasName("Wrk5Dtl.buf_qty", p);
		p.Wrk5Dtl_qty2_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.Wrk5DtlR.$qty2_p);
		p.Wrk5Dtl_qty2_p_PPanel.setName("Wrk5Dtl.qty2_p");
		p.columnWrk5Dtl_rord_stk_qty = p.Wrk5Dtl_qty2_p_PPanel.columnQty_qty;
		p.columnWrk5Dtl_rord_stk_qty.addAliasName("Wrk5Dtl.rord_stk_qty", p);
		p.Wrk5Dtl_qty3_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.Wrk5DtlR.$qty3_p);
		p.Wrk5Dtl_qty3_p_PPanel.setName("Wrk5Dtl.qty3_p");
		p.columnWrk5Dtl_rord_rqst_qty = p.Wrk5Dtl_qty3_p_PPanel.columnQty_qty;
		p.columnWrk5Dtl_rord_rqst_qty.addAliasName("Wrk5Dtl.rord_rqst_qty", p);
		p.Wrk5Dtl_str_ln1_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMABS.MABSP0040.Wrk5DtlR.$str_ln1_p);
		p.Wrk5Dtl_str_ln1_p_PPanel.setName("Wrk5Dtl.str_ln1_p");
		p.columnWrk5Dtl_gi_str_ln_cd = p.Wrk5Dtl_str_ln1_p_PPanel.columnStrLn_str_ln_cd;
		p.columnWrk5Dtl_gi_str_ln_cd.addAliasName("Wrk5Dtl.gi_str_ln_cd", p);
		p.columnWrk5Dtl_gi_str_ln_nm = p.Wrk5Dtl_str_ln1_p_PPanel.columnStrLn_str_ln_nm;
		p.columnWrk5Dtl_gi_str_ln_nm.addAliasName("Wrk5Dtl.gi_str_ln_nm", p);
		p.columnWrk5Dtl_gi_str_ln_cd_none_flg = p.Wrk5Dtl_str_ln1_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnWrk5Dtl_gi_str_ln_cd_none_flg.addAliasName("Wrk5Dtl.gi_str_ln_cd_none_flg", p);
		p.Wrk5Dtl_str_ln2_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMABS.MABSP0040.Wrk5DtlR.$str_ln2_p);
		p.Wrk5Dtl_str_ln2_p_PPanel.setName("Wrk5Dtl.str_ln2_p");
		p.columnWrk5Dtl_inpt_gi_str_ln_cd = p.Wrk5Dtl_str_ln2_p_PPanel.columnStrLn_str_ln_cd;
		p.columnWrk5Dtl_inpt_gi_str_ln_cd.addAliasName("Wrk5Dtl.inpt_gi_str_ln_cd", p);
		p.columnWrk5Dtl_inpt_gi_str_ln_nm = p.Wrk5Dtl_str_ln2_p_PPanel.columnStrLn_str_ln_nm;
		p.columnWrk5Dtl_inpt_gi_str_ln_nm.addAliasName("Wrk5Dtl.inpt_gi_str_ln_nm", p);
		p.columnWrk5Dtl_inpt_gi_str_ln_cd_none_flg = p.Wrk5Dtl_str_ln2_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnWrk5Dtl_inpt_gi_str_ln_cd_none_flg.addAliasName("Wrk5Dtl.inpt_gi_str_ln_cd_none_flg", p);
		p.Wrk5Dtl_str_ln3_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMABS.MABSP0040.Wrk5DtlR.$str_ln3_p);
		p.Wrk5Dtl_str_ln3_p_PPanel.setName("Wrk5Dtl.str_ln3_p");
		p.columnWrk5Dtl_ship_gi_str_ln_cd = p.Wrk5Dtl_str_ln3_p_PPanel.columnStrLn_str_ln_cd;
		p.columnWrk5Dtl_ship_gi_str_ln_cd.addAliasName("Wrk5Dtl.ship_gi_str_ln_cd", p);
		p.columnWrk5Dtl_ship_gi_str_ln_nm = p.Wrk5Dtl_str_ln3_p_PPanel.columnStrLn_str_ln_nm;
		p.columnWrk5Dtl_ship_gi_str_ln_nm.addAliasName("Wrk5Dtl.ship_gi_str_ln_nm", p);
		p.columnWrk5Dtl_ship_gi_str_ln_cd_none_flg = p.Wrk5Dtl_str_ln3_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnWrk5Dtl_ship_gi_str_ln_cd_none_flg.addAliasName("Wrk5Dtl.ship_gi_str_ln_cd_none_flg", p);
	}

	/**
	 * [Wrk6Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk6Dtl(MABSP_BomExSrch p) {
		p.Wrk6Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0040.Wrk6DtlR.$itm_p);
		p.Wrk6Dtl_itm_p_PPanel.setName("Wrk6Dtl.itm_p");
		p.columnWrk6Dtl_itm_cd = p.Wrk6Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk6Dtl_itm_cd.addAliasName("Wrk6Dtl.itm_cd", p);
		p.columnWrk6Dtl_itm_sub1 = p.Wrk6Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk6Dtl_itm_sub1.addAliasName("Wrk6Dtl.itm_sub1", p);
		p.columnWrk6Dtl_itm_sub2 = p.Wrk6Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk6Dtl_itm_sub2.addAliasName("Wrk6Dtl.itm_sub2", p);
		p.columnWrk6Dtl_itm_sub3 = p.Wrk6Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk6Dtl_itm_sub3.addAliasName("Wrk6Dtl.itm_sub3", p);
		p.columnWrk6Dtl_itm_nm = p.Wrk6Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnWrk6Dtl_itm_nm.addAliasName("Wrk6Dtl.itm_nm", p);
		p.Wrk6Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0040.Wrk6DtlR.$dt_p);
		p.Wrk6Dtl_dt_p_PPanel.setName("Wrk6Dtl.dt_p");
		p.columnWrk6Dtl_st_dt = p.Wrk6Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk6Dtl_st_dt.addAliasName("Wrk6Dtl.st_dt", p);
		p.columnWrk6Dtl_end_dt = p.Wrk6Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk6Dtl_end_dt.addAliasName("Wrk6Dtl.end_dt", p);
		p.Wrk6Dtl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0040.Wrk6DtlR.$qty_p);
		p.Wrk6Dtl_qty_p_PPanel.setName("Wrk6Dtl.qty_p");
		p.columnWrk6Dtl_spl_qty = p.Wrk6Dtl_qty_p_PPanel.columnQty_qty;
		p.columnWrk6Dtl_spl_qty.addAliasName("Wrk6Dtl.spl_qty", p);
	}

	/**
	 * [Wrk7Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk7Dtl(MABSP_BomExSrch p) {
		p.Wrk7Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0040.Wrk7DtlR.$itm_p);
		p.Wrk7Dtl_itm_p_PPanel.setName("Wrk7Dtl.itm_p");
		p.columnWrk7Dtl_itm_cd = p.Wrk7Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk7Dtl_itm_cd.addAliasName("Wrk7Dtl.itm_cd", p);
		p.columnWrk7Dtl_itm_sub1 = p.Wrk7Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk7Dtl_itm_sub1.addAliasName("Wrk7Dtl.itm_sub1", p);
		p.columnWrk7Dtl_itm_sub2 = p.Wrk7Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk7Dtl_itm_sub2.addAliasName("Wrk7Dtl.itm_sub2", p);
		p.columnWrk7Dtl_itm_sub3 = p.Wrk7Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk7Dtl_itm_sub3.addAliasName("Wrk7Dtl.itm_sub3", p);
		p.columnWrk7Dtl_itm_nm = p.Wrk7Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnWrk7Dtl_itm_nm.addAliasName("Wrk7Dtl.itm_nm", p);
		p.Wrk7Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0040.Wrk7DtlR.$dt_p);
		p.Wrk7Dtl_dt_p_PPanel.setName("Wrk7Dtl.dt_p");
		p.columnWrk7Dtl_st_dt = p.Wrk7Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk7Dtl_st_dt.addAliasName("Wrk7Dtl.st_dt", p);
		p.columnWrk7Dtl_end_dt = p.Wrk7Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk7Dtl_end_dt.addAliasName("Wrk7Dtl.end_dt", p);
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
	
	
	/** [Cnd_itm_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_PPanel_Itm_itm_cd_p = createCnd_itm_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ");
		}
		return Cnd_itm_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_itm_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_itm_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_itm_PPanel_Itm_itm_sub1_p == null) {
			Cnd_itm_PPanel_Itm_itm_sub1_p = createCnd_itm_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ");
		}
		return Cnd_itm_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_itm_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_itm_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_itm_PPanel_Itm_itm_sub2_p == null) {
			Cnd_itm_PPanel_Itm_itm_sub2_p = createCnd_itm_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ");
		}
		return Cnd_itm_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_itm_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_itm_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_itm_PPanel_Itm_itm_sub3_p == null) {
			Cnd_itm_PPanel_Itm_itm_sub3_p = createCnd_itm_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ");
		}
		return Cnd_itm_PPanel_Itm_itm_sub3_p;
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
	
	
	/** [Dtl_ph_bom_ptn_ListPutter]の定義 */
	private MCListPutter Dtl_ph_bom_ptn_p = null;

	/**
	 * [Dtl_ph_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ph_bom_ptn_ListPutter() {
		if (Dtl_ph_bom_ptn_p == null) {
			Dtl_ph_bom_ptn_p = createDtl_ph_bom_ptn_ListPutter(columnDtl_ph_bom_ptn, "ph_bom_ptn");

		}
		return Dtl_ph_bom_ptn_p;
	}
	
	
	/** [Dtl_alt_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_alt_grp_cd_p = null;

	/**
	 * [Dtl_alt_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alt_grp_cd_ListPutter() {
		if (Dtl_alt_grp_cd_p == null) {
			Dtl_alt_grp_cd_p = createDtl_alt_grp_cd_ListPutter(columnDtl_alt_grp_cd, "alt_grp_cd");

		}
		return Dtl_alt_grp_cd_p;
	}
	
	
	/** [Dtl_alt_itm_typ_ListPutter]の定義 */
	private MCListPutter Dtl_alt_itm_typ_p = null;

	/**
	 * [Dtl_alt_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alt_itm_typ_ListPutter() {
		if (Dtl_alt_itm_typ_p == null) {
			Dtl_alt_itm_typ_p = createDtl_alt_itm_typ_ListPutter(columnDtl_alt_itm_typ, "alt_itm_typ");

		}
		return Dtl_alt_itm_typ_p;
	}
	
	
	/** [Dtl_sno_typ1_ListPutter]の定義 */
	private MCListPutter Dtl_sno_typ1_p = null;

	/**
	 * [Dtl_sno_typ1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno_typ1_ListPutter() {
		if (Dtl_sno_typ1_p == null) {
			Dtl_sno_typ1_p = createDtl_sno_typ1_ListPutter(columnDtl_sno_typ1, "sno_typ1");

		}
		return Dtl_sno_typ1_p;
	}
	
	
	/** [Dtl_sno_typ2_ListPutter]の定義 */
	private MCListPutter Dtl_sno_typ2_p = null;

	/**
	 * [Dtl_sno_typ2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno_typ2_ListPutter() {
		if (Dtl_sno_typ2_p == null) {
			Dtl_sno_typ2_p = createDtl_sno_typ2_ListPutter(columnDtl_sno_typ2, "sno_typ2");

		}
		return Dtl_sno_typ2_p;
	}
	
	
	/** [Dtl_sno_typ3_ListPutter]の定義 */
	private MCListPutter Dtl_sno_typ3_p = null;

	/**
	 * [Dtl_sno_typ3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno_typ3_ListPutter() {
		if (Dtl_sno_typ3_p == null) {
			Dtl_sno_typ3_p = createDtl_sno_typ3_ListPutter(columnDtl_sno_typ3, "sno_typ3");

		}
		return Dtl_sno_typ3_p;
	}
	
	
	/** [Dtl_sno_typ4_ListPutter]の定義 */
	private MCListPutter Dtl_sno_typ4_p = null;

	/**
	 * [Dtl_sno_typ4_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno_typ4_ListPutter() {
		if (Dtl_sno_typ4_p == null) {
			Dtl_sno_typ4_p = createDtl_sno_typ4_ListPutter(columnDtl_sno_typ4, "sno_typ4");

		}
		return Dtl_sno_typ4_p;
	}
	
	
	/** [Dtl_in_offst_typ_ListPutter]の定義 */
	private MCListPutter Dtl_in_offst_typ_p = null;

	/**
	 * [Dtl_in_offst_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_in_offst_typ_ListPutter() {
		if (Dtl_in_offst_typ_p == null) {
			Dtl_in_offst_typ_p = createDtl_in_offst_typ_ListPutter(columnDtl_in_offst_typ, "in_offst_typ");

		}
		return Dtl_in_offst_typ_p;
	}
	
	
	/** [Dtl_bkf_typ_ListPutter]の定義 */
	private MCListPutter Dtl_bkf_typ_p = null;

	/**
	 * [Dtl_bkf_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bkf_typ_ListPutter() {
		if (Dtl_bkf_typ_p == null) {
			Dtl_bkf_typ_p = createDtl_bkf_typ_ListPutter(columnDtl_bkf_typ, "bkf_typ");

		}
		return Dtl_bkf_typ_p;
	}
	
	
	/** [Dtl_alloc_ctl_typ_ListPutter]の定義 */
	private MCListPutter Dtl_alloc_ctl_typ_p = null;

	/**
	 * [Dtl_alloc_ctl_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alloc_ctl_typ_ListPutter() {
		if (Dtl_alloc_ctl_typ_p == null) {
			Dtl_alloc_ctl_typ_p = createDtl_alloc_ctl_typ_ListPutter(columnDtl_alloc_ctl_typ, "alloc_ctl_typ");

		}
		return Dtl_alloc_ctl_typ_p;
	}
	
	
	/** [Dtl_inpt_ctl_typ_ListPutter]の定義 */
	private MCListPutter Dtl_inpt_ctl_typ_p = null;

	/**
	 * [Dtl_inpt_ctl_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_inpt_ctl_typ_ListPutter() {
		if (Dtl_inpt_ctl_typ_p == null) {
			Dtl_inpt_ctl_typ_p = createDtl_inpt_ctl_typ_ListPutter(columnDtl_inpt_ctl_typ, "inpt_ctl_typ");

		}
		return Dtl_inpt_ctl_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_BomExSrch create(){
		MABSP_BomExSrch p = new MABSP_BomExSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_BomExSrch create(String name){
		MABSP_BomExSrch p = new MABSP_BomExSrch(name);
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
		MABSP_BomExSrch_MC.jbfInitScreenOpe((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitTop((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitFold((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitCnd((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitCtrl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitRPnl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitTopDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitHdr((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitDtlBtn((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitBtmDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitDtlTab((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitWrk1Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitWrk2Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitWrk3Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitWrk4Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitWrk5Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitWrk6Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbfInitWrk7Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitScreenOpe((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitTop((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitFold((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitCnd((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitCtrl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitRPnl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitTopDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitHdr((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitDtlBtn((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitBtmDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitDtlTab((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitWrk1Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitWrk2Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitWrk3Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitWrk4Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitWrk5Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitWrk6Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.jbInitWrk7Dtl((MABSP_BomExSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_EX1 = p.beansFactory.createRadioButton("Cnd.ope_EX1");
		p.Cnd_ope_EX2 = p.beansFactory.createRadioButton("Cnd.ope_EX2");
		p.Cnd_base_dt_Label = p.beansFactory.createLabel("Cnd.base_dt_Label");
		p.Cnd_base_dt = p.beansFactory.createDateField("Cnd.base_dt");
		p.Cnd_base_dt.setLabel(p.Cnd_base_dt_Label);
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_sno1_mng_typ = p.beansFactory.createTextField("Cnd.sno1_mng_typ");
		p.Cnd_sno2_mng_typ = p.beansFactory.createTextField("Cnd.sno2_mng_typ");
		p.Cnd_sno3_mng_typ = p.beansFactory.createTextField("Cnd.sno3_mng_typ");
		p.Cnd_sno4_mng_typ = p.beansFactory.createTextField("Cnd.sno4_mng_typ");
		p.Cnd_bom_ptn_Label = p.beansFactory.createLabel("Cnd.bom_ptn_Label");
		p.Cnd_bom_ptn = p.beansFactory.createTextComboBox("Cnd.bom_ptn");
		p.Cnd_bom_ptn.setLabel(p.Cnd_bom_ptn_Label);
		p.Cnd_bom_ptn_flg = p.beansFactory.createCheckBox("Cnd.bom_ptn_flg");
		p.Cnd_ph_ex_flg = p.beansFactory.createCheckBox("Cnd.ph_ex_flg");
		p.Cnd_max_hrrchy_Label = p.beansFactory.createLabel("Cnd.max_hrrchy_Label");
		p.Cnd_max_hrrchy = p.beansFactory.createNumberField("Cnd.max_hrrchy");
		p.Cnd_max_hrrchy.setLabel(p.Cnd_max_hrrchy_Label);
		p.Cnd_base_qty_Label = p.beansFactory.createLabel("Cnd.base_qty_Label");
		p.Cnd_base_qty = p.beansFactory.createNumberField("Cnd.base_qty");
		p.Cnd_base_qty.setLabel(p.Cnd_base_qty_Label);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_srch_all = p.beansFactory.createButton("RPnl.srch_all", "srch");
	}

	/**
	 * [TopDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTopDtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.TopDtlPanel = p.beansFactory.createPanel("TopDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_bottom_flg = p.beansFactory.createTableColumn("Dtl.bottom_flg", MCColumnType.CHECK);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_byprod_flg = p.beansFactory.createTableColumn("Dtl.byprod_flg", MCColumnType.CHECK);
		p.columnDtl_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_cont_fctr_flg = p.beansFactory.createTableColumn("Dtl.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtl_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_unit_cd = p.beansFactory.createTableColumn("Dtl.unit_cd", MCColumnType.TEXT);
		p.columnDtl_dec_place = p.beansFactory.createTableColumn("Dtl.dec_place", MCColumnType.NUMBER);
		p.columnDtl_bom_ptn = p.beansFactory.createTableColumn("Dtl.bom_ptn", MCColumnType.TEXT);
		p.columnDtl_oper_cd = p.beansFactory.createTableColumn("Dtl.oper_cd", MCColumnType.TEXT);
		p.columnDtl_oper_nm = p.beansFactory.createTableColumn("Dtl.oper_nm", MCColumnType.TEXT);
		p.columnDtl_oper_seq = p.beansFactory.createTableColumn("Dtl.oper_seq", MCColumnType.NUMBER);
		p.columnDtl_ph_flg = p.beansFactory.createTableColumn("Dtl.ph_flg", MCColumnType.CHECK);
		p.columnDtl_ph_bom_ptn = p.beansFactory.createTableColumn("Dtl.ph_bom_ptn", MCColumnType.TEXT_COMBO_FREE);
		p.columnDtl_alt_itm_flg = p.beansFactory.createTableColumn("Dtl.alt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_alt_grp_cd = p.beansFactory.createTableColumn("Dtl.alt_grp_cd", MCColumnType.TEXT_COMBO_FREE);
		p.columnDtl_alt_grp_nm = p.beansFactory.createTableColumn("Dtl.alt_grp_nm", MCColumnType.TEXT);
		p.columnDtl_alt_itm_typ = p.beansFactory.createTableColumn("Dtl.alt_itm_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_alt_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.alt_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_alt_itm_ratio = p.beansFactory.createTableColumn("Dtl.alt_itm_ratio", MCColumnType.NUMBER);
		p.columnDtl_alt_alloc_prio = p.beansFactory.createTableColumn("Dtl.alt_alloc_prio", MCColumnType.NUMBER);
		p.columnDtl_sno_typ1 = p.beansFactory.createTableColumn("Dtl.sno_typ1", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno_typ_nm1 = p.beansFactory.createTableColumn("Dtl.sno_typ_nm1", MCColumnType.TEXT);
		p.columnDtl_sno_typ2 = p.beansFactory.createTableColumn("Dtl.sno_typ2", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno_typ_nm2 = p.beansFactory.createTableColumn("Dtl.sno_typ_nm2", MCColumnType.TEXT);
		p.columnDtl_sno_typ3 = p.beansFactory.createTableColumn("Dtl.sno_typ3", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno_typ_nm3 = p.beansFactory.createTableColumn("Dtl.sno_typ_nm3", MCColumnType.TEXT);
		p.columnDtl_sno_typ4 = p.beansFactory.createTableColumn("Dtl.sno_typ4", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno_typ_nm4 = p.beansFactory.createTableColumn("Dtl.sno_typ_nm4", MCColumnType.TEXT);
		p.columnDtl_chd_unit_cd = p.beansFactory.createTableColumn("Dtl.chd_unit_cd", MCColumnType.TEXT);
		p.columnDtl_chd_unit_nm = p.beansFactory.createTableColumn("Dtl.chd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_chd_dec_place = p.beansFactory.createTableColumn("Dtl.chd_dec_place", MCColumnType.NUMBER);
		p.columnDtl_in_offst_typ = p.beansFactory.createTableColumn("Dtl.in_offst_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_in_offst_typ_nm = p.beansFactory.createTableColumn("Dtl.in_offst_typ_nm", MCColumnType.TEXT);
		p.columnDtl_in_offst = p.beansFactory.createTableColumn("Dtl.in_offst", MCColumnType.NUMBER);
		p.columnDtl_bkf_typ = p.beansFactory.createTableColumn("Dtl.bkf_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_bkf_typ_nm = p.beansFactory.createTableColumn("Dtl.bkf_typ_nm", MCColumnType.TEXT);
		p.columnDtl_inst_lot_fix_flg = p.beansFactory.createTableColumn("Dtl.inst_lot_fix_flg", MCColumnType.CHECK);
		p.columnDtl_lot_mix_flg = p.beansFactory.createTableColumn("Dtl.lot_mix_flg", MCColumnType.CHECK);
		p.columnDtl_sublot_mix_flg = p.beansFactory.createTableColumn("Dtl.sublot_mix_flg", MCColumnType.CHECK);
		p.columnDtl_alloc_ctl_typ = p.beansFactory.createTableColumn("Dtl.alloc_ctl_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_alloc_ctl_typ_nm = p.beansFactory.createTableColumn("Dtl.alloc_ctl_typ_nm", MCColumnType.TEXT);
		p.columnDtl_main_itm_flg = p.beansFactory.createTableColumn("Dtl.main_itm_flg", MCColumnType.CHECK);
		p.columnDtl_yield_calc_flg = p.beansFactory.createTableColumn("Dtl.yield_calc_flg", MCColumnType.CHECK);
		p.columnDtl_inpt_ctl_typ = p.beansFactory.createTableColumn("Dtl.inpt_ctl_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_inpt_ctl_typ_nm = p.beansFactory.createTableColumn("Dtl.inpt_ctl_typ_nm", MCColumnType.TEXT);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_chng_no = p.beansFactory.createTableColumn("Dtl.chng_no", MCColumnType.TEXT);
		p.columnDtl_ext_sys_no_bom = p.beansFactory.createTableColumn("Dtl.ext_sys_no_bom", MCColumnType.TEXT);
		p.columnDtl_not_cost_flg = p.beansFactory.createTableColumn("Dtl.not_cost_flg", MCColumnType.CHECK);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_srch_dtl = p.beansFactory.createButton("DtlBtn.srch_dtl", "srch");
		p.DtlBtn_open_MABSP0040_EX1 = p.beansFactory.createButton("DtlBtn.open_MABSP0040_EX1", "open");
		p.DtlBtn_open_MABSP0040_EX2 = p.beansFactory.createButton("DtlBtn.open_MABSP0040_EX2", "open");
	}

	/**
	 * [BtmDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtmDtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.BtmDtlPanel = p.beansFactory.createPanel("BtmDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlTab(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.DtlTabPanel = p.beansFactory.createPanel("DtlTab");
		p.DtlTabTab = p.beansFactory.createTabbedPane("DtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk1Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk1DtlPanel = p.beansFactory.createPanel("Wrk1Dtl");
		p.Wrk1DtlScrollPane = p.beansFactory.createScrollPane("Wrk1Dtl.scroll");
		p.createWrk1DtlTable();
		// ブロックの項目の初期化
		p.columnWrk1Dtl_del_flg = p.beansFactory.createTableColumn("Wrk1Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk1Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk1Dtl.wg_cd", MCColumnType.TEXT);
		p.columnWrk1Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk1Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_stk_mng_typ = p.beansFactory.createTableColumn("Wrk1Dtl.stk_mng_typ", MCColumnType.TEXT);
		p.columnWrk1Dtl_asset_mng_typ = p.beansFactory.createTableColumn("Wrk1Dtl.asset_mng_typ", MCColumnType.TEXT);
		p.columnWrk1Dtl_unit_cd = p.beansFactory.createTableColumn("Wrk1Dtl.unit_cd", MCColumnType.TEXT);
		p.columnWrk1Dtl_dec_place = p.beansFactory.createTableColumn("Wrk1Dtl.dec_place", MCColumnType.NUMBER);
		p.columnWrk1Dtl_sno1_mng_typ = p.beansFactory.createTableColumn("Wrk1Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnWrk1Dtl_sno2_mng_typ = p.beansFactory.createTableColumn("Wrk1Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnWrk1Dtl_sno3_mng_typ = p.beansFactory.createTableColumn("Wrk1Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnWrk1Dtl_sno4_mng_typ = p.beansFactory.createTableColumn("Wrk1Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnWrk1Dtl_itm_typ = p.beansFactory.createTableColumn("Wrk1Dtl.itm_typ", MCColumnType.TEXT);
		p.columnWrk1Dtl_itm_typ_nm = p.beansFactory.createTableColumn("Wrk1Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Wrk1Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnWrk1Dtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Wrk1Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_mfg_loc_cd = p.beansFactory.createTableColumn("Wrk1Dtl.mfg_loc_cd", MCColumnType.TEXT);
		p.columnWrk1Dtl_mfg_loc_nm = p.beansFactory.createTableColumn("Wrk1Dtl.mfg_loc_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_site_cd = p.beansFactory.createTableColumn("Wrk1Dtl.site_cd", MCColumnType.TEXT);
		p.columnWrk1Dtl_site_nm = p.beansFactory.createTableColumn("Wrk1Dtl.site_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_sppl_cd = p.beansFactory.createTableColumn("Wrk1Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnWrk1Dtl_sppl_nm = p.beansFactory.createTableColumn("Wrk1Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_maker_cd = p.beansFactory.createTableColumn("Wrk1Dtl.maker_cd", MCColumnType.TEXT);
		p.columnWrk1Dtl_maker_nm = p.beansFactory.createTableColumn("Wrk1Dtl.maker_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_rqst_loc_cd = p.beansFactory.createTableColumn("Wrk1Dtl.rqst_loc_cd", MCColumnType.TEXT);
		p.columnWrk1Dtl_rqst_loc_nm = p.beansFactory.createTableColumn("Wrk1Dtl.rqst_loc_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_rqst_loc_wg_cd = p.beansFactory.createTableColumn("Wrk1Dtl.rqst_loc_wg_cd", MCColumnType.TEXT);
		p.columnWrk1Dtl_rqst_loc_wg_nm = p.beansFactory.createTableColumn("Wrk1Dtl.rqst_loc_wg_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_bom_ptn = p.beansFactory.createTableColumn("Wrk1Dtl.bom_ptn", MCColumnType.TEXT);
		p.columnWrk1Dtl_oper_ptn = p.beansFactory.createTableColumn("Wrk1Dtl.oper_ptn", MCColumnType.TEXT);
		p.columnWrk1Dtl_mfg_lt = p.beansFactory.createTableColumn("Wrk1Dtl.mfg_lt", MCColumnType.NUMBER);
		p.columnWrk1Dtl_mfg_lt_add_qty = p.beansFactory.createTableColumn("Wrk1Dtl.mfg_lt_add_qty", MCColumnType.NUMBER);
		p.columnWrk1Dtl_purc_lt = p.beansFactory.createTableColumn("Wrk1Dtl.purc_lt", MCColumnType.NUMBER);
		p.columnWrk1Dtl_purc_lt_add_qty = p.beansFactory.createTableColumn("Wrk1Dtl.purc_lt_add_qty", MCColumnType.NUMBER);
		p.columnWrk1Dtl_accpt_insp_lt = p.beansFactory.createTableColumn("Wrk1Dtl.accpt_insp_lt", MCColumnType.NUMBER);
		p.columnWrk1Dtl_buf_lt = p.beansFactory.createTableColumn("Wrk1Dtl.buf_lt", MCColumnType.NUMBER);
		p.columnWrk1Dtl_ord_fix_pd = p.beansFactory.createTableColumn("Wrk1Dtl.ord_fix_pd", MCColumnType.NUMBER);
		p.columnWrk1Dtl_sz_day_week_typ = p.beansFactory.createTableColumn("Wrk1Dtl.sz_day_week_typ", MCColumnType.TEXT);
		p.columnWrk1Dtl_sz_day_week_typ_nm = p.beansFactory.createTableColumn("Wrk1Dtl.sz_day_week_typ_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_sz_week = p.beansFactory.createTableColumn("Wrk1Dtl.sz_week", MCColumnType.NUMBER);
		p.columnWrk1Dtl_lot_sz_pd = p.beansFactory.createTableColumn("Wrk1Dtl.lot_sz_pd", MCColumnType.NUMBER);
		p.columnWrk1Dtl_min_lot_qty = p.beansFactory.createTableColumn("Wrk1Dtl.min_lot_qty", MCColumnType.NUMBER);
		p.columnWrk1Dtl_batch_lot_qty = p.beansFactory.createTableColumn("Wrk1Dtl.batch_lot_qty", MCColumnType.NUMBER);
		p.columnWrk1Dtl_max_lot_qty = p.beansFactory.createTableColumn("Wrk1Dtl.max_lot_qty", MCColumnType.NUMBER);
		p.columnWrk1Dtl_max_order = p.beansFactory.createTableColumn("Wrk1Dtl.max_order", MCColumnType.NUMBER);
		p.columnWrk1Dtl_prio = p.beansFactory.createTableColumn("Wrk1Dtl.prio", MCColumnType.NUMBER);
		p.columnWrk1Dtl_order_ratio = p.beansFactory.createTableColumn("Wrk1Dtl.order_ratio", MCColumnType.NUMBER);
		p.columnWrk1Dtl_yield_schd_qty = p.beansFactory.createTableColumn("Wrk1Dtl.yield_schd_qty", MCColumnType.NUMBER);
		p.columnWrk1Dtl_mfg_inst_qty = p.beansFactory.createTableColumn("Wrk1Dtl.mfg_inst_qty", MCColumnType.NUMBER);
		p.columnWrk1Dtl_fxd_rqmt_qty = p.beansFactory.createTableColumn("Wrk1Dtl.fxd_rqmt_qty", MCColumnType.NUMBER);
		p.columnWrk1Dtl_lot_issue_typ = p.beansFactory.createTableColumn("Wrk1Dtl.lot_issue_typ", MCColumnType.TEXT);
		p.columnWrk1Dtl_lot_issue_typ_nm = p.beansFactory.createTableColumn("Wrk1Dtl.lot_issue_typ_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_bkf_flg = p.beansFactory.createTableColumn("Wrk1Dtl.bkf_flg", MCColumnType.CHECK);
		p.columnWrk1Dtl_ln_stk_flg = p.beansFactory.createTableColumn("Wrk1Dtl.ln_stk_flg", MCColumnType.CHECK);
		p.columnWrk1Dtl_pre_po_tgt_flg = p.beansFactory.createTableColumn("Wrk1Dtl.pre_po_tgt_flg", MCColumnType.CHECK);
		p.columnWrk1Dtl_inst_rec_issue_flg = p.beansFactory.createTableColumn("Wrk1Dtl.inst_rec_issue_flg", MCColumnType.CHECK);
		p.columnWrk1Dtl_no_mfg_aprv_flg = p.beansFactory.createTableColumn("Wrk1Dtl.no_mfg_aprv_flg", MCColumnType.CHECK);
		p.columnWrk1Dtl_itm_lower_yield = p.beansFactory.createTableColumn("Wrk1Dtl.itm_lower_yield", MCColumnType.NUMBER);
		p.columnWrk1Dtl_itm_std_yield = p.beansFactory.createTableColumn("Wrk1Dtl.itm_std_yield", MCColumnType.NUMBER);
		p.columnWrk1Dtl_itm_upper_yield = p.beansFactory.createTableColumn("Wrk1Dtl.itm_upper_yield", MCColumnType.NUMBER);
		p.columnWrk1Dtl_purc_id_typ = p.beansFactory.createTableColumn("Wrk1Dtl.purc_id_typ", MCColumnType.TEXT);
		p.columnWrk1Dtl_purc_id_typ_nm = p.beansFactory.createTableColumn("Wrk1Dtl.purc_id_typ_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_rqst_wg_cd = p.beansFactory.createTableColumn("Wrk1Dtl.rqst_wg_cd", MCColumnType.TEXT);
		p.columnWrk1Dtl_rqst_wg_nm = p.beansFactory.createTableColumn("Wrk1Dtl.rqst_wg_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_po_batch_flg = p.beansFactory.createTableColumn("Wrk1Dtl.po_batch_flg", MCColumnType.CHECK);
		p.columnWrk1Dtl_rsrc_cd1 = p.beansFactory.createTableColumn("Wrk1Dtl.rsrc_cd1", MCColumnType.TEXT);
		p.columnWrk1Dtl_rsrc_nm1 = p.beansFactory.createTableColumn("Wrk1Dtl.rsrc_nm1", MCColumnType.TEXT);
		p.columnWrk1Dtl_rsrc_unit_nm1 = p.beansFactory.createTableColumn("Wrk1Dtl.rsrc_unit_nm1", MCColumnType.TEXT);
		p.columnWrk1Dtl_rsrc_std_qty1 = p.beansFactory.createTableColumn("Wrk1Dtl.rsrc_std_qty1", MCColumnType.NUMBER);
		p.columnWrk1Dtl_rsrc_cd2 = p.beansFactory.createTableColumn("Wrk1Dtl.rsrc_cd2", MCColumnType.TEXT);
		p.columnWrk1Dtl_rsrc_nm2 = p.beansFactory.createTableColumn("Wrk1Dtl.rsrc_nm2", MCColumnType.TEXT);
		p.columnWrk1Dtl_rsrc_unit_nm2 = p.beansFactory.createTableColumn("Wrk1Dtl.rsrc_unit_nm2", MCColumnType.TEXT);
		p.columnWrk1Dtl_rsrc_std_qty2 = p.beansFactory.createTableColumn("Wrk1Dtl.rsrc_std_qty2", MCColumnType.NUMBER);
		p.columnWrk1Dtl_not_mrp_flg = p.beansFactory.createTableColumn("Wrk1Dtl.not_mrp_flg", MCColumnType.CHECK);
		p.columnWrk1Dtl_cost_ratio = p.beansFactory.createTableColumn("Wrk1Dtl.cost_ratio", MCColumnType.NUMBER);
		p.columnWrk1Dtl_memo1 = p.beansFactory.createTableColumn("Wrk1Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk1Dtl_memo2 = p.beansFactory.createTableColumn("Wrk1Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk1Dtl_memo3 = p.beansFactory.createTableColumn("Wrk1Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk1Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk1Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk1Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk1Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk1Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk1Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk1Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk1Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk1Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk1Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk1Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk1Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk1Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk1Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk1Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk1Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk1Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk1Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk1Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk1Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk1Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk1Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk1Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk1Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_del_ts = p.beansFactory.createTableColumn("Wrk1Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk2Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk2DtlPanel = p.beansFactory.createPanel("Wrk2Dtl");
		p.Wrk2DtlScrollPane = p.beansFactory.createScrollPane("Wrk2Dtl.scroll");
		p.createWrk2DtlTable();
		// ブロックの項目の初期化
		p.columnWrk2Dtl_del_flg = p.beansFactory.createTableColumn("Wrk2Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_itm_unit_cd = p.beansFactory.createTableColumn("Wrk2Dtl.itm_unit_cd", MCColumnType.TEXT);
		p.columnWrk2Dtl_itm_dec_place = p.beansFactory.createTableColumn("Wrk2Dtl.itm_dec_place", MCColumnType.NUMBER);
		p.columnWrk2Dtl_itm_typ = p.beansFactory.createTableColumn("Wrk2Dtl.itm_typ", MCColumnType.TEXT);
		p.columnWrk2Dtl_itm_typ_nm = p.beansFactory.createTableColumn("Wrk2Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Wrk2Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnWrk2Dtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Wrk2Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_loc_cd = p.beansFactory.createTableColumn("Wrk2Dtl.loc_cd", MCColumnType.TEXT);
		p.columnWrk2Dtl_loc_nm = p.beansFactory.createTableColumn("Wrk2Dtl.loc_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk2Dtl.wg_cd", MCColumnType.TEXT);
		p.columnWrk2Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk2Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_oper_ptn = p.beansFactory.createTableColumn("Wrk2Dtl.oper_ptn", MCColumnType.TEXT);
		p.columnWrk2Dtl_oper_cd = p.beansFactory.createTableColumn("Wrk2Dtl.oper_cd", MCColumnType.TEXT);
		p.columnWrk2Dtl_oper_nm = p.beansFactory.createTableColumn("Wrk2Dtl.oper_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_oper_seq = p.beansFactory.createTableColumn("Wrk2Dtl.oper_seq", MCColumnType.NUMBER);
		p.columnWrk2Dtl_disp_seq = p.beansFactory.createTableColumn("Wrk2Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnWrk2Dtl_oper_lt = p.beansFactory.createTableColumn("Wrk2Dtl.oper_lt", MCColumnType.NUMBER);
		p.columnWrk2Dtl_oper_lt_add_qty = p.beansFactory.createTableColumn("Wrk2Dtl.oper_lt_add_qty", MCColumnType.NUMBER);
		p.columnWrk2Dtl_oper_offst_typ = p.beansFactory.createTableColumn("Wrk2Dtl.oper_offst_typ", MCColumnType.TEXT);
		p.columnWrk2Dtl_oper_offst_typ_nm = p.beansFactory.createTableColumn("Wrk2Dtl.oper_offst_typ_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_oper_offst = p.beansFactory.createTableColumn("Wrk2Dtl.oper_offst", MCColumnType.NUMBER);
		p.columnWrk2Dtl_oper_offst_add_qty = p.beansFactory.createTableColumn("Wrk2Dtl.oper_offst_add_qty", MCColumnType.NUMBER);
		p.columnWrk2Dtl_oper_unit_cd = p.beansFactory.createTableColumn("Wrk2Dtl.oper_unit_cd", MCColumnType.TEXT);
		p.columnWrk2Dtl_oper_unit_nm = p.beansFactory.createTableColumn("Wrk2Dtl.oper_unit_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_def_dec_place = p.beansFactory.createTableColumn("Wrk2Dtl.def_dec_place", MCColumnType.NUMBER);
		p.columnWrk2Dtl_dec_place = p.beansFactory.createTableColumn("Wrk2Dtl.dec_place", MCColumnType.NUMBER);
		p.columnWrk2Dtl_unit_conv_rnd_typ = p.beansFactory.createTableColumn("Wrk2Dtl.unit_conv_rnd_typ", MCColumnType.TEXT);
		p.columnWrk2Dtl_unit_conv_rnd_typ_nm = p.beansFactory.createTableColumn("Wrk2Dtl.unit_conv_rnd_typ_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_yield_oper_flg = p.beansFactory.createTableColumn("Wrk2Dtl.yield_oper_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_yield_oper_ratio = p.beansFactory.createTableColumn("Wrk2Dtl.yield_oper_ratio", MCColumnType.NUMBER);
		p.columnWrk2Dtl_oper_inst_grp = p.beansFactory.createTableColumn("Wrk2Dtl.oper_inst_grp", MCColumnType.TEXT);
		p.columnWrk2Dtl_oper_loc_cd = p.beansFactory.createTableColumn("Wrk2Dtl.oper_loc_cd", MCColumnType.TEXT);
		p.columnWrk2Dtl_oper_loc_nm = p.beansFactory.createTableColumn("Wrk2Dtl.oper_loc_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_lmt_fr_dt_flg = p.beansFactory.createTableColumn("Wrk2Dtl.lmt_fr_dt_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_oper_lower_yield = p.beansFactory.createTableColumn("Wrk2Dtl.oper_lower_yield", MCColumnType.NUMBER);
		p.columnWrk2Dtl_oper_std_yield = p.beansFactory.createTableColumn("Wrk2Dtl.oper_std_yield", MCColumnType.NUMBER);
		p.columnWrk2Dtl_oper_upper_yield = p.beansFactory.createTableColumn("Wrk2Dtl.oper_upper_yield", MCColumnType.NUMBER);
		p.columnWrk2Dtl_wip_rate = p.beansFactory.createTableColumn("Wrk2Dtl.wip_rate", MCColumnType.NUMBER);
		p.columnWrk2Dtl_not_cost_flg = p.beansFactory.createTableColumn("Wrk2Dtl.not_cost_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_memo1 = p.beansFactory.createTableColumn("Wrk2Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk2Dtl_memo2 = p.beansFactory.createTableColumn("Wrk2Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk2Dtl_memo3 = p.beansFactory.createTableColumn("Wrk2Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk2Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk2Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk2Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk2Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk2Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk2Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk2Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk2Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk2Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk2Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk2Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk2Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk2Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk2Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk2Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk2Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk2Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk2Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk2Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_del_ts = p.beansFactory.createTableColumn("Wrk2Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk3Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk3DtlPanel = p.beansFactory.createPanel("Wrk3Dtl");
		p.Wrk3DtlScrollPane = p.beansFactory.createScrollPane("Wrk3Dtl.scroll");
		p.createWrk3DtlTable();
		// ブロックの項目の初期化
		p.columnWrk3Dtl_del_flg = p.beansFactory.createTableColumn("Wrk3Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_itm_typ = p.beansFactory.createTableColumn("Wrk3Dtl.itm_typ", MCColumnType.TEXT);
		p.columnWrk3Dtl_itm_typ_nm = p.beansFactory.createTableColumn("Wrk3Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Wrk3Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnWrk3Dtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Wrk3Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_loc_cd = p.beansFactory.createTableColumn("Wrk3Dtl.loc_cd", MCColumnType.TEXT);
		p.columnWrk3Dtl_loc_nm = p.beansFactory.createTableColumn("Wrk3Dtl.loc_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk3Dtl.wg_cd", MCColumnType.TEXT);
		p.columnWrk3Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk3Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_oper_ptn = p.beansFactory.createTableColumn("Wrk3Dtl.oper_ptn", MCColumnType.TEXT);
		p.columnWrk3Dtl_oper_cd = p.beansFactory.createTableColumn("Wrk3Dtl.oper_cd", MCColumnType.TEXT);
		p.columnWrk3Dtl_oper_nm = p.beansFactory.createTableColumn("Wrk3Dtl.oper_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_oper_seq = p.beansFactory.createTableColumn("Wrk3Dtl.oper_seq", MCColumnType.NUMBER);
		p.columnWrk3Dtl_wk_cost_cd = p.beansFactory.createTableColumn("Wrk3Dtl.wk_cost_cd", MCColumnType.TEXT);
		p.columnWrk3Dtl_wk_cost_nm = p.beansFactory.createTableColumn("Wrk3Dtl.wk_cost_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_wk_cost_unit_nm = p.beansFactory.createTableColumn("Wrk3Dtl.wk_cost_unit_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_wk_cost_unit_dec_place = p.beansFactory.createTableColumn("Wrk3Dtl.wk_cost_unit_dec_place", MCColumnType.NUMBER);
		p.columnWrk3Dtl_wk_cost_unit_rnd_typ = p.beansFactory.createTableColumn("Wrk3Dtl.wk_cost_unit_rnd_typ", MCColumnType.TEXT);
		p.columnWrk3Dtl_fxd_wk_cost = p.beansFactory.createTableColumn("Wrk3Dtl.fxd_wk_cost", MCColumnType.NUMBER);
		p.columnWrk3Dtl_wk_cost = p.beansFactory.createTableColumn("Wrk3Dtl.wk_cost", MCColumnType.NUMBER);
		p.columnWrk3Dtl_base_unit_cd = p.beansFactory.createTableColumn("Wrk3Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnWrk3Dtl_base_unit_nm = p.beansFactory.createTableColumn("Wrk3Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_itm_dec_place = p.beansFactory.createTableColumn("Wrk3Dtl.itm_dec_place", MCColumnType.NUMBER);
		p.columnWrk3Dtl_wk_cost_calc_flg = p.beansFactory.createTableColumn("Wrk3Dtl.wk_cost_calc_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_disp_seq = p.beansFactory.createTableColumn("Wrk3Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnWrk3Dtl_not_cost_flg = p.beansFactory.createTableColumn("Wrk3Dtl.not_cost_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_memo1 = p.beansFactory.createTableColumn("Wrk3Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk3Dtl_memo2 = p.beansFactory.createTableColumn("Wrk3Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk3Dtl_memo3 = p.beansFactory.createTableColumn("Wrk3Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk3Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk3Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk3Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk3Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk3Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk3Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk3Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk3Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk3Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk3Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk3Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk3Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk3Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk3Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk3Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk3Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk3Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk3Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_del_ts = p.beansFactory.createTableColumn("Wrk3Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk4Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk4Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk4DtlPanel = p.beansFactory.createPanel("Wrk4Dtl");
		p.Wrk4DtlScrollPane = p.beansFactory.createScrollPane("Wrk4Dtl.scroll");
		p.createWrk4DtlTable();
		// ブロックの項目の初期化
		p.columnWrk4Dtl_del_flg = p.beansFactory.createTableColumn("Wrk4Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk4Dtl_itm_typ = p.beansFactory.createTableColumn("Wrk4Dtl.itm_typ", MCColumnType.TEXT);
		p.columnWrk4Dtl_itm_typ_nm = p.beansFactory.createTableColumn("Wrk4Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Wrk4Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Wrk4Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_loc_cd = p.beansFactory.createTableColumn("Wrk4Dtl.loc_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_loc_nm = p.beansFactory.createTableColumn("Wrk4Dtl.loc_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk4Dtl.wg_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk4Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_loc_grp_cd = p.beansFactory.createTableColumn("Wrk4Dtl.loc_grp_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_loc_grp_nm = p.beansFactory.createTableColumn("Wrk4Dtl.loc_grp_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_prio = p.beansFactory.createTableColumn("Wrk4Dtl.prio", MCColumnType.NUMBER);
		p.columnWrk4Dtl_memo1 = p.beansFactory.createTableColumn("Wrk4Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk4Dtl_memo2 = p.beansFactory.createTableColumn("Wrk4Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk4Dtl_memo3 = p.beansFactory.createTableColumn("Wrk4Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk4Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk4Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk4Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk4Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk4Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk4Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk4Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk4Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk4Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk4Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk4Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk4Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk4Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk4Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk4Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk4Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk4Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk4Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk4Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_del_ts = p.beansFactory.createTableColumn("Wrk4Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk5Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk5Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk5DtlPanel = p.beansFactory.createPanel("Wrk5Dtl");
		p.Wrk5DtlScrollPane = p.beansFactory.createScrollPane("Wrk5Dtl.scroll");
		p.createWrk5DtlTable();
		// ブロックの項目の初期化
		p.columnWrk5Dtl_del_flg = p.beansFactory.createTableColumn("Wrk5Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_dec_place = p.beansFactory.createTableColumn("Wrk5Dtl.dec_place", MCColumnType.NUMBER);
		p.columnWrk5Dtl_itm_typ = p.beansFactory.createTableColumn("Wrk5Dtl.itm_typ", MCColumnType.TEXT);
		p.columnWrk5Dtl_itm_typ_nm = p.beansFactory.createTableColumn("Wrk5Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Wrk5Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Wrk5Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_loc_cd = p.beansFactory.createTableColumn("Wrk5Dtl.loc_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_loc_nm = p.beansFactory.createTableColumn("Wrk5Dtl.loc_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk5Dtl.wg_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk5Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_gi_schd_flg = p.beansFactory.createTableColumn("Wrk5Dtl.gi_schd_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_base_unit_cd = p.beansFactory.createTableColumn("Wrk5Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_base_unit_nm = p.beansFactory.createTableColumn("Wrk5Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_lot_sizing_flg = p.beansFactory.createTableColumn("Wrk5Dtl.lot_sizing_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_gi_loc_cd = p.beansFactory.createTableColumn("Wrk5Dtl.gi_loc_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_gi_loc_nm = p.beansFactory.createTableColumn("Wrk5Dtl.gi_loc_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_gi_str_ln_tgt_flg = p.beansFactory.createTableColumn("Wrk5Dtl.gi_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_inpt_gi_loc_cd = p.beansFactory.createTableColumn("Wrk5Dtl.inpt_gi_loc_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_inpt_gi_loc_nm = p.beansFactory.createTableColumn("Wrk5Dtl.inpt_gi_loc_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg = p.beansFactory.createTableColumn("Wrk5Dtl.inpt_gi_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_ship_gi_loc_cd = p.beansFactory.createTableColumn("Wrk5Dtl.ship_gi_loc_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_ship_gi_loc_nm = p.beansFactory.createTableColumn("Wrk5Dtl.ship_gi_loc_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg = p.beansFactory.createTableColumn("Wrk5Dtl.ship_gi_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_memo1 = p.beansFactory.createTableColumn("Wrk5Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk5Dtl_memo2 = p.beansFactory.createTableColumn("Wrk5Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk5Dtl_memo3 = p.beansFactory.createTableColumn("Wrk5Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk5Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk5Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk5Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk5Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk5Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk5Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk5Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk5Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk5Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk5Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk5Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk5Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk5Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk5Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk5Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk5Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk5Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk5Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk5Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_del_ts = p.beansFactory.createTableColumn("Wrk5Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk6Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk6Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk6DtlPanel = p.beansFactory.createPanel("Wrk6Dtl");
		p.Wrk6DtlScrollPane = p.beansFactory.createScrollPane("Wrk6Dtl.scroll");
		p.createWrk6DtlTable();
		// ブロックの項目の初期化
		p.columnWrk6Dtl_del_flg = p.beansFactory.createTableColumn("Wrk6Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk6Dtl_itm_typ = p.beansFactory.createTableColumn("Wrk6Dtl.itm_typ", MCColumnType.TEXT);
		p.columnWrk6Dtl_itm_typ_nm = p.beansFactory.createTableColumn("Wrk6Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Wrk6Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnWrk6Dtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Wrk6Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_insp_ptn_cd = p.beansFactory.createTableColumn("Wrk6Dtl.insp_ptn_cd", MCColumnType.TEXT);
		p.columnWrk6Dtl_insp_ptn_nm = p.beansFactory.createTableColumn("Wrk6Dtl.insp_ptn_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_insp_mtd_typ = p.beansFactory.createTableColumn("Wrk6Dtl.insp_mtd_typ", MCColumnType.TEXT);
		p.columnWrk6Dtl_insp_mtd_typ_nm = p.beansFactory.createTableColumn("Wrk6Dtl.insp_mtd_typ_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_insp_lt = p.beansFactory.createTableColumn("Wrk6Dtl.insp_lt", MCColumnType.NUMBER);
		p.columnWrk6Dtl_insp_std_no = p.beansFactory.createTableColumn("Wrk6Dtl.insp_std_no", MCColumnType.TEXT);
		p.columnWrk6Dtl_unit_cd = p.beansFactory.createTableColumn("Wrk6Dtl.unit_cd", MCColumnType.TEXT);
		p.columnWrk6Dtl_dec_place = p.beansFactory.createTableColumn("Wrk6Dtl.dec_place", MCColumnType.NUMBER);
		p.columnWrk6Dtl_std_req_flg = p.beansFactory.createTableColumn("Wrk6Dtl.std_req_flg", MCColumnType.CHECK);
		p.columnWrk6Dtl_std_cnf_req_flg = p.beansFactory.createTableColumn("Wrk6Dtl.std_cnf_req_flg", MCColumnType.CHECK);
		p.columnWrk6Dtl_memo1 = p.beansFactory.createTableColumn("Wrk6Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk6Dtl_memo2 = p.beansFactory.createTableColumn("Wrk6Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk6Dtl_memo3 = p.beansFactory.createTableColumn("Wrk6Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk6Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk6Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk6Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk6Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk6Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk6Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk6Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk6Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk6Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk6Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk6Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk6Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk6Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk6Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk6Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk6Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk6Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk6Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk6Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_del_ts = p.beansFactory.createTableColumn("Wrk6Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk7Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk7Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk7DtlPanel = p.beansFactory.createPanel("Wrk7Dtl");
		p.Wrk7DtlScrollPane = p.beansFactory.createScrollPane("Wrk7Dtl.scroll");
		p.createWrk7DtlTable();
		// ブロックの項目の初期化
		p.columnWrk7Dtl_del_flg = p.beansFactory.createTableColumn("Wrk7Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_itm_typ = p.beansFactory.createTableColumn("Wrk7Dtl.itm_typ", MCColumnType.TEXT);
		p.columnWrk7Dtl_itm_typ_nm = p.beansFactory.createTableColumn("Wrk7Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Wrk7Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnWrk7Dtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Wrk7Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_lmt_ctl_flg = p.beansFactory.createTableColumn("Wrk7Dtl.lmt_ctl_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_mfg_loc_cd = p.beansFactory.createTableColumn("Wrk7Dtl.mfg_loc_cd", MCColumnType.TEXT);
		p.columnWrk7Dtl_mfg_loc_nm = p.beansFactory.createTableColumn("Wrk7Dtl.mfg_loc_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_sppl_cd = p.beansFactory.createTableColumn("Wrk7Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnWrk7Dtl_sppl_nm = p.beansFactory.createTableColumn("Wrk7Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_maker_cd = p.beansFactory.createTableColumn("Wrk7Dtl.maker_cd", MCColumnType.TEXT);
		p.columnWrk7Dtl_maker_nm = p.beansFactory.createTableColumn("Wrk7Dtl.maker_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_from_site_cd = p.beansFactory.createTableColumn("Wrk7Dtl.from_site_cd", MCColumnType.TEXT);
		p.columnWrk7Dtl_from_site_nm = p.beansFactory.createTableColumn("Wrk7Dtl.from_site_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_to_site_cd = p.beansFactory.createTableColumn("Wrk7Dtl.to_site_cd", MCColumnType.TEXT);
		p.columnWrk7Dtl_to_site_nm = p.beansFactory.createTableColumn("Wrk7Dtl.to_site_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_no_insp_flg = p.beansFactory.createTableColumn("Wrk7Dtl.no_insp_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_insp_ptn_cd = p.beansFactory.createTableColumn("Wrk7Dtl.insp_ptn_cd", MCColumnType.TEXT);
		p.columnWrk7Dtl_insp_ptn_nm = p.beansFactory.createTableColumn("Wrk7Dtl.insp_ptn_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_no_mrkt_judg_flg = p.beansFactory.createTableColumn("Wrk7Dtl.no_mrkt_judg_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_no_plnt_aprv_flg = p.beansFactory.createTableColumn("Wrk7Dtl.no_plnt_aprv_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_no_insp_aprv_flg = p.beansFactory.createTableColumn("Wrk7Dtl.no_insp_aprv_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_lmt_dt_frm_typ = p.beansFactory.createTableColumn("Wrk7Dtl.lmt_dt_frm_typ", MCColumnType.TEXT);
		p.columnWrk7Dtl_lmt_dt_frm_typ_nm = p.beansFactory.createTableColumn("Wrk7Dtl.lmt_dt_frm_typ_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_vld_pd = p.beansFactory.createTableColumn("Wrk7Dtl.vld_pd", MCColumnType.NUMBER);
		p.columnWrk7Dtl_lmt_pd = p.beansFactory.createTableColumn("Wrk7Dtl.lmt_pd", MCColumnType.NUMBER);
		p.columnWrk7Dtl_lot_insp_vld_pd = p.beansFactory.createTableColumn("Wrk7Dtl.lot_insp_vld_pd", MCColumnType.NUMBER);
		p.columnWrk7Dtl_calc_pd_typ = p.beansFactory.createTableColumn("Wrk7Dtl.calc_pd_typ", MCColumnType.TEXT);
		p.columnWrk7Dtl_calc_pd_typ_nm = p.beansFactory.createTableColumn("Wrk7Dtl.calc_pd_typ_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ = p.beansFactory.createTableColumn("Wrk7Dtl.lot_insp_lmt_dt_frm_typ", MCColumnType.TEXT);
		p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm = p.beansFactory.createTableColumn("Wrk7Dtl.lot_insp_lmt_dt_frm_typ_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_insp_inst_issue_typ = p.beansFactory.createTableColumn("Wrk7Dtl.insp_inst_issue_typ", MCColumnType.TEXT);
		p.columnWrk7Dtl_insp_inst_issue_typ_nm = p.beansFactory.createTableColumn("Wrk7Dtl.insp_inst_issue_typ_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_insp_offst = p.beansFactory.createTableColumn("Wrk7Dtl.insp_offst", MCColumnType.NUMBER);
		p.columnWrk7Dtl_inst_rslt_issue_flg = p.beansFactory.createTableColumn("Wrk7Dtl.inst_rslt_issue_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_pre_insp_valid_flg = p.beansFactory.createTableColumn("Wrk7Dtl.pre_insp_valid_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_memo1 = p.beansFactory.createTableColumn("Wrk7Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk7Dtl_memo2 = p.beansFactory.createTableColumn("Wrk7Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk7Dtl_memo3 = p.beansFactory.createTableColumn("Wrk7Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk7Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk7Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk7Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk7Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk7Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk7Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk7Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk7Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk7Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk7Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk7Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk7Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk7Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk7Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk7Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk7Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk7Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk7Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk7Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_del_ts = p.beansFactory.createTableColumn("Wrk7Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_BomExSrch p) {
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
	protected static void jbInitTop(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.TopDtlPanel);
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
	protected static void jbInitFold(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_EX1);
		p.Cnd_ope_EX1.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_EX1);
		p.ScreenOpePanel.add(p.Cnd_ope_EX1);
		p.Cnd_ope_EX1.setNextBeans(p.Cnd_ope_EX2);
		p.Cnd_ope_EX2.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_EX2);
		p.ScreenOpePanel.add(p.Cnd_ope_EX2);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP0040.CndR.ope_META);
		p.CndPanel.add(p.Cnd_base_dt_Label);
		p.CndPanel.add(p.Cnd_base_dt);
		p.CndPanel.setLastBeans(p.Cnd_base_dt);
		p.Cnd_base_dt.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_base_dt.setRow(p.getCndR(), mcframe.clientMABS.MABSP0040.CndR.base_dt_META);
		p.Cnd_base_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.STRICT);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0040.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_itm_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0040.CndR.wg_nm_META);
		p.CndPanel.add(p.Cnd_itm_PPanel);
		p.Cnd_itm_PPanel.setNextBeans(p.Cnd_sno1_mng_typ);
		p.Cnd_itm_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3,p.Cnd_sno1_mng_typ,p.Cnd_sno2_mng_typ,p.Cnd_sno3_mng_typ,p.Cnd_sno4_mng_typ);
		p.Cnd_itm_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3,p.Cnd_sno1_mng_typ,p.Cnd_sno2_mng_typ,p.Cnd_sno3_mng_typ,p.Cnd_sno4_mng_typ);
		p.Cnd_itm_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3,p.Cnd_sno1_mng_typ,p.Cnd_sno2_mng_typ,p.Cnd_sno3_mng_typ,p.Cnd_sno4_mng_typ);
		p.Cnd_itm_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm,p.Cnd_sno1_mng_typ,p.Cnd_sno2_mng_typ,p.Cnd_sno3_mng_typ,p.Cnd_sno4_mng_typ);
		p.CndPanel.add(p.Cnd_sno1_mng_typ);
		p.Cnd_sno1_mng_typ.setNextBeans(p.Cnd_sno2_mng_typ);
		p.Cnd_sno1_mng_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0040.CndR.sno1_mng_typ_META);
		p.CndPanel.add(p.Cnd_sno2_mng_typ);
		p.Cnd_sno2_mng_typ.setNextBeans(p.Cnd_sno3_mng_typ);
		p.Cnd_sno2_mng_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0040.CndR.sno2_mng_typ_META);
		p.CndPanel.add(p.Cnd_sno3_mng_typ);
		p.Cnd_sno3_mng_typ.setNextBeans(p.Cnd_sno4_mng_typ);
		p.Cnd_sno3_mng_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0040.CndR.sno3_mng_typ_META);
		p.CndPanel.add(p.Cnd_sno4_mng_typ);
		p.Cnd_sno4_mng_typ.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_sno4_mng_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0040.CndR.sno4_mng_typ_META);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_sno_p_PPanel);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_bom_ptn);
		p.Cnd_bom_ptn.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_bom_ptn_Label);
		p.CndPanel.add(p.Cnd_bom_ptn);
		p.Cnd_bom_ptn.setNextBeans(p.Cnd_bom_ptn_flg);
		p.Cnd_bom_ptn.setRow(p.getCndR(), mcframe.clientMABS.MABSP0040.CndR.bom_ptn_META);
		p.CndPanel.add(p.Cnd_bom_ptn_flg);
		p.Cnd_bom_ptn_flg.setNextBeans(p.Cnd_ph_ex_flg);
		p.Cnd_bom_ptn_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0040.CndR.bom_ptn_flg_META);
		p.CndPanel.add(p.Cnd_ph_ex_flg);
		p.Cnd_ph_ex_flg.setNextBeans(p.Cnd_max_hrrchy);
		p.Cnd_ph_ex_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0040.CndR.ph_ex_flg_META);
		p.CndPanel.add(p.Cnd_max_hrrchy_Label);
		p.CndPanel.add(p.Cnd_max_hrrchy);
		p.Cnd_max_hrrchy.setNextBeans(p.Cnd_base_qty);
		p.Cnd_max_hrrchy.setRow(p.getCndR(), mcframe.clientMABS.MABSP0040.CndR.max_hrrchy_META);
		p.CndPanel.add(p.Cnd_base_qty_Label);
		p.CndPanel.add(p.Cnd_base_qty);
		p.Cnd_base_qty.setRow(p.getCndR(), mcframe.clientMABS.MABSP0040.CndR.base_qty_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_BomExSrch p) {
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
	protected static void jbInitRPnl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_srch_all.setIcon("SEARCH");
		p.RPnl_srch_all.setFunctionKey(MCFunctionKey.F13);
		p.RPnlPanel.add(p.RPnl_srch_all);
		p.RPnlPanel.setLastBeans(p.RPnl_srch_all);
	}

	/**
	 * [TopDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTopDtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.add(p.TopDtlPanel);
		p.TopDtlPanel.setNextBeans(p.BtmDtlPanel);
		p.TopDtlPanel.setLayoutPosition("CBCT+");
		// ブロックの項目の初期化
		p.TopDtlPanel.add(p.HdrPanel, null);
		p.TopDtlPanel.setLastBeans(p.HdrPanel);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.HdrPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.DtlPanel, null);
		p.HdrPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.HdrPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtn_srch_dtl.setIcon("SEARCH");
		p.DtlBtn_srch_dtl.setFunctionKey(MCFunctionKey.F3);
		p.DtlBtnPanel.add(p.DtlBtn_srch_dtl);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_srch_dtl);
		p.DtlBtn_srch_dtl.setNextBeans(p.DtlBtn_open_MABSP0040_EX1);
		p.DtlBtn_open_MABSP0040_EX1.setFunctionKey(MCFunctionKey.F4);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABSP0040_EX1);
		p.DtlBtn_open_MABSP0040_EX1.setNextBeans(p.DtlBtn_open_MABSP0040_EX2);
		p.DtlBtn_open_MABSP0040_EX2.setFunctionKey(MCFunctionKey.F5);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABSP0040_EX2);
	}

	/**
	 * [BtmDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtmDtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.add(p.BtmDtlPanel);
		p.BtmDtlPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.BtmDtlPanel.add(p.DtlTabPanel, null);
		p.BtmDtlPanel.setLastBeans(p.DtlTabPanel);
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlTab(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.DtlTabPanel.add(p.DtlTabTab);
		p.DtlTabPanel.setLastBeans(p.DtlTabTab);
		p.DtlTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.DtlTabTab.add(p.Wrk1DtlPanel, "DtlTab.tab1");
		p.DtlTabTab.setLastBeans(p.Wrk1DtlPanel);
		p.Wrk1DtlPanel.setNextBeans(p.Wrk2DtlPanel);
		p.DtlTabTab.add(p.Wrk2DtlPanel, "DtlTab.tab2");
		p.Wrk2DtlPanel.setNextBeans(p.Wrk3DtlPanel);
		p.DtlTabTab.add(p.Wrk3DtlPanel, "DtlTab.tab3");
		p.Wrk3DtlPanel.setNextBeans(p.Wrk4DtlPanel);
		p.DtlTabTab.add(p.Wrk4DtlPanel, "DtlTab.tab4");
		p.Wrk4DtlPanel.setNextBeans(p.Wrk5DtlPanel);
		p.DtlTabTab.add(p.Wrk5DtlPanel, "DtlTab.tab5");
		p.Wrk5DtlPanel.setNextBeans(p.Wrk6DtlPanel);
		p.DtlTabTab.add(p.Wrk6DtlPanel, "DtlTab.tab6");
		p.Wrk6DtlPanel.setNextBeans(p.Wrk7DtlPanel);
		p.DtlTabTab.add(p.Wrk7DtlPanel, "DtlTab.tab7");
	}

	/**
	 * [Wrk1Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk1DtlPanel.setNextBeans(p.Wrk2DtlPanel);
		p.Wrk1DtlPanel.add(p.Wrk1DtlScrollPane);
		p.Wrk1DtlPanel.setLastBeans(p.Wrk1DtlTable);
		p.Wrk1DtlScrollPane.setViewportView(p.Wrk1DtlTable);
		p.Wrk1DtlTable.setList(p.getWrk1DtlL());
		p.Wrk1DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk2Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk2DtlPanel.setNextBeans(p.Wrk3DtlPanel);
		p.Wrk2DtlPanel.add(p.Wrk2DtlScrollPane);
		p.Wrk2DtlPanel.setLastBeans(p.Wrk2DtlTable);
		p.Wrk2DtlScrollPane.setViewportView(p.Wrk2DtlTable);
		p.Wrk2DtlTable.setList(p.getWrk2DtlL());
		p.Wrk2DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk3Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk3DtlPanel.setNextBeans(p.Wrk4DtlPanel);
		p.Wrk3DtlPanel.add(p.Wrk3DtlScrollPane);
		p.Wrk3DtlPanel.setLastBeans(p.Wrk3DtlTable);
		p.Wrk3DtlScrollPane.setViewportView(p.Wrk3DtlTable);
		p.Wrk3DtlTable.setList(p.getWrk3DtlL());
		p.Wrk3DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk4Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk4Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk4DtlPanel.setNextBeans(p.Wrk5DtlPanel);
		p.Wrk4DtlPanel.add(p.Wrk4DtlScrollPane);
		p.Wrk4DtlPanel.setLastBeans(p.Wrk4DtlTable);
		p.Wrk4DtlScrollPane.setViewportView(p.Wrk4DtlTable);
		p.Wrk4DtlTable.setList(p.getWrk4DtlL());
		p.Wrk4DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk5Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk5Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk5DtlPanel.setNextBeans(p.Wrk6DtlPanel);
		p.Wrk5DtlPanel.add(p.Wrk5DtlScrollPane);
		p.Wrk5DtlPanel.setLastBeans(p.Wrk5DtlTable);
		p.Wrk5DtlScrollPane.setViewportView(p.Wrk5DtlTable);
		p.Wrk5DtlTable.setList(p.getWrk5DtlL());
		p.Wrk5DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk6Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk6Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk6DtlPanel.setNextBeans(p.Wrk7DtlPanel);
		p.Wrk6DtlPanel.add(p.Wrk6DtlScrollPane);
		p.Wrk6DtlPanel.setLastBeans(p.Wrk6DtlTable);
		p.Wrk6DtlScrollPane.setViewportView(p.Wrk6DtlTable);
		p.Wrk6DtlTable.setList(p.getWrk6DtlL());
		p.Wrk6DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk7Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk7Dtl(MABSP_BomExSrch p) {
		// ブロック関連の初期化
		p.Wrk7DtlPanel.add(p.Wrk7DtlScrollPane);
		p.Wrk7DtlPanel.setLastBeans(p.Wrk7DtlTable);
		p.Wrk7DtlScrollPane.setViewportView(p.Wrk7DtlTable);
		p.Wrk7DtlTable.setList(p.getWrk7DtlL());
		p.Wrk7DtlPanel.setLayoutPosition("C");
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
		MABSP_BomExSrch_MC.mcInitScreenOpe((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitTop((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitFold((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitCnd((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitCtrl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitRPnl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitTopDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitHdr((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitDtlBtn((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitBtmDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitDtlTab((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitWrk1Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitWrk2Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitWrk3Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitWrk4Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitWrk5Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitWrk6Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.mcInitWrk7Dtl((MABSP_BomExSrch)this);

		// [SRCH]ステータスのモードの設定
		MABSP_BomExSrch_MC.statusInitSRCH_ScreenOpe((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Top((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Fold((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Cnd((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Ctrl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_RPnl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_TopDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Hdr((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Cnd2((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_DtlBtn((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_BtmDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_DtlTab((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Wrk1Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Wrk2Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Wrk3Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Wrk4Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Wrk5Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Wrk6Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitSRCH_Wrk7Dtl((MABSP_BomExSrch)this);

		// [REF]ステータスのモードの設定
		MABSP_BomExSrch_MC.statusInitREF_ScreenOpe((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Top((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Fold((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Cnd((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Ctrl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_RPnl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_TopDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Hdr((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Cnd2((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_DtlBtn((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_BtmDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_DtlTab((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Wrk1Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Wrk2Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Wrk3Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Wrk4Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Wrk5Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Wrk6Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.statusInitREF_Wrk7Dtl((MABSP_BomExSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_BomExSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_BomExSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_BomExSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_BomExSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_EX1.addAllListener(p);
		p.Cnd_ope_EX2.addAllListener(p);
		p.Cnd_base_dt.setListListener(p);
		p.Cnd_base_dt.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_itm_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_sno1_mng_typ.setListListener(p);
		p.Cnd_sno1_mng_typ.addAllListener(p);
		p.Cnd_sno2_mng_typ.setListListener(p);
		p.Cnd_sno2_mng_typ.addAllListener(p);
		p.Cnd_sno3_mng_typ.setListListener(p);
		p.Cnd_sno3_mng_typ.addAllListener(p);
		p.Cnd_sno4_mng_typ.setListListener(p);
		p.Cnd_sno4_mng_typ.addAllListener(p);
		p.Cnd_bom_ptn.setListListener(p);
		p.Cnd_bom_ptn.addAllListener(p);
		p.Cnd_bom_ptn_flg.addAllListener(p);
		p.Cnd_ph_ex_flg.addAllListener(p);
		p.Cnd_max_hrrchy.setListListener(p);
		p.Cnd_max_hrrchy.addAllListener(p);
		p.Cnd_base_qty.setListListener(p);
		p.Cnd_base_qty.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABSP_BomExSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MABSP_BomExSrch p) {
		p.RPnl_srch_all.addAllListener(p);
		p.RPnl_srch_all.setAPMethodName("doRPnl_srch_all");
	}

	/**
	 *  [TopDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTopDtl(MABSP_BomExSrch p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MABSP_BomExSrch p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABSP_BomExSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_bottom_flg.addAllListener(p);
		p.columnDtl_itm_typ.addAllListener(p);
		p.columnDtl_itm_typ.setListListener(p);
		p.columnDtl_itm_typ_nm.addAllListener(p);
		p.columnDtl_itm_typ_nm.setListListener(p);
		p.columnDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_itm_typ_d_cd.setListListener(p);
		p.columnDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_itm_typ_d_nm.setListListener(p);
		p.columnDtl_byprod_flg.addAllListener(p);
		p.columnDtl_lot_mng_typ.addAllListener(p);
		p.columnDtl_lot_mng_typ.setListListener(p);
		p.columnDtl_sublot_mng_typ.addAllListener(p);
		p.columnDtl_sublot_mng_typ.setListListener(p);
		p.columnDtl_sno1_mng_typ.addAllListener(p);
		p.columnDtl_sno1_mng_typ.setListListener(p);
		p.columnDtl_sno2_mng_typ.addAllListener(p);
		p.columnDtl_sno2_mng_typ.setListListener(p);
		p.columnDtl_sno3_mng_typ.addAllListener(p);
		p.columnDtl_sno3_mng_typ.setListListener(p);
		p.columnDtl_sno4_mng_typ.addAllListener(p);
		p.columnDtl_sno4_mng_typ.setListListener(p);
		p.columnDtl_cont_fctr_flg.addAllListener(p);
		p.columnDtl_stk_mng_typ.addAllListener(p);
		p.columnDtl_stk_mng_typ.setListListener(p);
		p.columnDtl_unit_cd.addAllListener(p);
		p.columnDtl_unit_cd.setListListener(p);
		p.columnDtl_dec_place.addAllListener(p);
		p.columnDtl_dec_place.setListListener(p);
		p.columnDtl_bom_ptn.addAllListener(p);
		p.columnDtl_bom_ptn.setListListener(p);
		p.columnDtl_oper_cd.addAllListener(p);
		p.columnDtl_oper_cd.setListListener(p);
		p.columnDtl_oper_nm.addAllListener(p);
		p.columnDtl_oper_nm.setListListener(p);
		p.columnDtl_oper_seq.addAllListener(p);
		p.columnDtl_oper_seq.setListListener(p);
		p.columnDtl_ph_flg.addAllListener(p);
		p.columnDtl_ph_bom_ptn.addAllListener(p);
		p.columnDtl_ph_bom_ptn.setListListener(p);
		p.columnDtl_alt_itm_flg.addAllListener(p);
		p.columnDtl_alt_grp_cd.addAllListener(p);
		p.columnDtl_alt_grp_cd.setListListener(p);
		p.columnDtl_alt_grp_nm.addAllListener(p);
		p.columnDtl_alt_grp_nm.setListListener(p);
		p.columnDtl_alt_itm_typ.addAllListener(p);
		p.columnDtl_alt_itm_typ.setListListener(p);
		p.columnDtl_alt_itm_typ_nm.addAllListener(p);
		p.columnDtl_alt_itm_typ_nm.setListListener(p);
		p.columnDtl_alt_itm_ratio.addAllListener(p);
		p.columnDtl_alt_itm_ratio.setListListener(p);
		p.columnDtl_alt_alloc_prio.addAllListener(p);
		p.columnDtl_alt_alloc_prio.setListListener(p);
		p.columnDtl_sno_typ1.addAllListener(p);
		p.columnDtl_sno_typ1.setListListener(p);
		p.columnDtl_sno_typ_nm1.addAllListener(p);
		p.columnDtl_sno_typ_nm1.setListListener(p);
		p.columnDtl_sno_typ2.addAllListener(p);
		p.columnDtl_sno_typ2.setListListener(p);
		p.columnDtl_sno_typ_nm2.addAllListener(p);
		p.columnDtl_sno_typ_nm2.setListListener(p);
		p.columnDtl_sno_typ3.addAllListener(p);
		p.columnDtl_sno_typ3.setListListener(p);
		p.columnDtl_sno_typ_nm3.addAllListener(p);
		p.columnDtl_sno_typ_nm3.setListListener(p);
		p.columnDtl_sno_typ4.addAllListener(p);
		p.columnDtl_sno_typ4.setListListener(p);
		p.columnDtl_sno_typ_nm4.addAllListener(p);
		p.columnDtl_sno_typ_nm4.setListListener(p);
		p.columnDtl_chd_unit_cd.addAllListener(p);
		p.columnDtl_chd_unit_cd.setListListener(p);
		p.columnDtl_chd_unit_nm.addAllListener(p);
		p.columnDtl_chd_unit_nm.setListListener(p);
		p.columnDtl_chd_dec_place.addAllListener(p);
		p.columnDtl_chd_dec_place.setListListener(p);
		p.columnDtl_in_offst_typ.addAllListener(p);
		p.columnDtl_in_offst_typ.setListListener(p);
		p.columnDtl_in_offst_typ_nm.addAllListener(p);
		p.columnDtl_in_offst_typ_nm.setListListener(p);
		p.columnDtl_in_offst.addAllListener(p);
		p.columnDtl_in_offst.setListListener(p);
		p.columnDtl_bkf_typ.addAllListener(p);
		p.columnDtl_bkf_typ.setListListener(p);
		p.columnDtl_bkf_typ_nm.addAllListener(p);
		p.columnDtl_bkf_typ_nm.setListListener(p);
		p.columnDtl_inst_lot_fix_flg.addAllListener(p);
		p.columnDtl_lot_mix_flg.addAllListener(p);
		p.columnDtl_sublot_mix_flg.addAllListener(p);
		p.columnDtl_alloc_ctl_typ.addAllListener(p);
		p.columnDtl_alloc_ctl_typ.setListListener(p);
		p.columnDtl_alloc_ctl_typ_nm.addAllListener(p);
		p.columnDtl_alloc_ctl_typ_nm.setListListener(p);
		p.columnDtl_main_itm_flg.addAllListener(p);
		p.columnDtl_yield_calc_flg.addAllListener(p);
		p.columnDtl_inpt_ctl_typ.addAllListener(p);
		p.columnDtl_inpt_ctl_typ.setListListener(p);
		p.columnDtl_inpt_ctl_typ_nm.addAllListener(p);
		p.columnDtl_inpt_ctl_typ_nm.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_chng_no.addAllListener(p);
		p.columnDtl_chng_no.setListListener(p);
		p.columnDtl_ext_sys_no_bom.addAllListener(p);
		p.columnDtl_ext_sys_no_bom.setListListener(p);
		p.columnDtl_not_cost_flg.addAllListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABSP_BomExSrch p) {
		p.DtlBtn_srch_dtl.addAllListener(p);
		p.DtlBtn_srch_dtl.setAPMethodName("doDtlBtn_srch_dtl");
		p.DtlBtn_open_MABSP0040_EX1.addAllListener(p);
		p.DtlBtn_open_MABSP0040_EX1.setAPMethodName("doDtlBtn_open_MABSP0040_EX1");
		p.DtlBtn_open_MABSP0040_EX2.addAllListener(p);
		p.DtlBtn_open_MABSP0040_EX2.setAPMethodName("doDtlBtn_open_MABSP0040_EX2");
	}

	/**
	 *  [BtmDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtmDtl(MABSP_BomExSrch p) {
	}

	/**
	 *  [DtlTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlTab(MABSP_BomExSrch p) {
		p.DtlTabTab.addAllListener(p);
	}

	/**
	 *  [Wrk1Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1Dtl(MABSP_BomExSrch p) {
		p.Wrk1DtlTable.addAllListener(p);
		p.columnWrk1Dtl_del_flg.addAllListener(p);
		p.columnWrk1Dtl_wg_cd.addAllListener(p);
		p.columnWrk1Dtl_wg_cd.setListListener(p);
		p.columnWrk1Dtl_wg_nm.addAllListener(p);
		p.columnWrk1Dtl_wg_nm.setListListener(p);
		p.columnWrk1Dtl_stk_mng_typ.addAllListener(p);
		p.columnWrk1Dtl_stk_mng_typ.setListListener(p);
		p.columnWrk1Dtl_asset_mng_typ.addAllListener(p);
		p.columnWrk1Dtl_asset_mng_typ.setListListener(p);
		p.columnWrk1Dtl_unit_cd.addAllListener(p);
		p.columnWrk1Dtl_unit_cd.setListListener(p);
		p.columnWrk1Dtl_dec_place.addAllListener(p);
		p.columnWrk1Dtl_dec_place.setListListener(p);
		p.columnWrk1Dtl_sno1_mng_typ.addAllListener(p);
		p.columnWrk1Dtl_sno1_mng_typ.setListListener(p);
		p.columnWrk1Dtl_sno2_mng_typ.addAllListener(p);
		p.columnWrk1Dtl_sno2_mng_typ.setListListener(p);
		p.columnWrk1Dtl_sno3_mng_typ.addAllListener(p);
		p.columnWrk1Dtl_sno3_mng_typ.setListListener(p);
		p.columnWrk1Dtl_sno4_mng_typ.addAllListener(p);
		p.columnWrk1Dtl_sno4_mng_typ.setListListener(p);
		p.columnWrk1Dtl_itm_typ.addAllListener(p);
		p.columnWrk1Dtl_itm_typ.setListListener(p);
		p.columnWrk1Dtl_itm_typ_nm.addAllListener(p);
		p.columnWrk1Dtl_itm_typ_nm.setListListener(p);
		p.columnWrk1Dtl_itm_typ_d_cd.addAllListener(p);
		p.columnWrk1Dtl_itm_typ_d_cd.setListListener(p);
		p.columnWrk1Dtl_itm_typ_d_nm.addAllListener(p);
		p.columnWrk1Dtl_itm_typ_d_nm.setListListener(p);
		p.columnWrk1Dtl_mfg_loc_cd.addAllListener(p);
		p.columnWrk1Dtl_mfg_loc_cd.setListListener(p);
		p.columnWrk1Dtl_mfg_loc_nm.addAllListener(p);
		p.columnWrk1Dtl_mfg_loc_nm.setListListener(p);
		p.columnWrk1Dtl_site_cd.addAllListener(p);
		p.columnWrk1Dtl_site_cd.setListListener(p);
		p.columnWrk1Dtl_site_nm.addAllListener(p);
		p.columnWrk1Dtl_site_nm.setListListener(p);
		p.columnWrk1Dtl_sppl_cd.addAllListener(p);
		p.columnWrk1Dtl_sppl_cd.setListListener(p);
		p.columnWrk1Dtl_sppl_nm.addAllListener(p);
		p.columnWrk1Dtl_sppl_nm.setListListener(p);
		p.columnWrk1Dtl_maker_cd.addAllListener(p);
		p.columnWrk1Dtl_maker_cd.setListListener(p);
		p.columnWrk1Dtl_maker_nm.addAllListener(p);
		p.columnWrk1Dtl_maker_nm.setListListener(p);
		p.columnWrk1Dtl_rqst_loc_cd.addAllListener(p);
		p.columnWrk1Dtl_rqst_loc_cd.setListListener(p);
		p.columnWrk1Dtl_rqst_loc_nm.addAllListener(p);
		p.columnWrk1Dtl_rqst_loc_nm.setListListener(p);
		p.columnWrk1Dtl_rqst_loc_wg_cd.addAllListener(p);
		p.columnWrk1Dtl_rqst_loc_wg_cd.setListListener(p);
		p.columnWrk1Dtl_rqst_loc_wg_nm.addAllListener(p);
		p.columnWrk1Dtl_rqst_loc_wg_nm.setListListener(p);
		p.columnWrk1Dtl_bom_ptn.addAllListener(p);
		p.columnWrk1Dtl_bom_ptn.setListListener(p);
		p.columnWrk1Dtl_oper_ptn.addAllListener(p);
		p.columnWrk1Dtl_oper_ptn.setListListener(p);
		p.columnWrk1Dtl_mfg_lt.addAllListener(p);
		p.columnWrk1Dtl_mfg_lt.setListListener(p);
		p.columnWrk1Dtl_mfg_lt_add_qty.addAllListener(p);
		p.columnWrk1Dtl_mfg_lt_add_qty.setListListener(p);
		p.columnWrk1Dtl_purc_lt.addAllListener(p);
		p.columnWrk1Dtl_purc_lt.setListListener(p);
		p.columnWrk1Dtl_purc_lt_add_qty.addAllListener(p);
		p.columnWrk1Dtl_purc_lt_add_qty.setListListener(p);
		p.columnWrk1Dtl_accpt_insp_lt.addAllListener(p);
		p.columnWrk1Dtl_accpt_insp_lt.setListListener(p);
		p.columnWrk1Dtl_buf_lt.addAllListener(p);
		p.columnWrk1Dtl_buf_lt.setListListener(p);
		p.columnWrk1Dtl_ord_fix_pd.addAllListener(p);
		p.columnWrk1Dtl_ord_fix_pd.setListListener(p);
		p.columnWrk1Dtl_sz_day_week_typ.addAllListener(p);
		p.columnWrk1Dtl_sz_day_week_typ.setListListener(p);
		p.columnWrk1Dtl_sz_day_week_typ_nm.addAllListener(p);
		p.columnWrk1Dtl_sz_day_week_typ_nm.setListListener(p);
		p.columnWrk1Dtl_sz_week.addAllListener(p);
		p.columnWrk1Dtl_sz_week.setListListener(p);
		p.columnWrk1Dtl_lot_sz_pd.addAllListener(p);
		p.columnWrk1Dtl_lot_sz_pd.setListListener(p);
		p.columnWrk1Dtl_min_lot_qty.addAllListener(p);
		p.columnWrk1Dtl_min_lot_qty.setListListener(p);
		p.columnWrk1Dtl_batch_lot_qty.addAllListener(p);
		p.columnWrk1Dtl_batch_lot_qty.setListListener(p);
		p.columnWrk1Dtl_max_lot_qty.addAllListener(p);
		p.columnWrk1Dtl_max_lot_qty.setListListener(p);
		p.columnWrk1Dtl_max_order.addAllListener(p);
		p.columnWrk1Dtl_max_order.setListListener(p);
		p.columnWrk1Dtl_prio.addAllListener(p);
		p.columnWrk1Dtl_prio.setListListener(p);
		p.columnWrk1Dtl_order_ratio.addAllListener(p);
		p.columnWrk1Dtl_order_ratio.setListListener(p);
		p.columnWrk1Dtl_yield_schd_qty.addAllListener(p);
		p.columnWrk1Dtl_yield_schd_qty.setListListener(p);
		p.columnWrk1Dtl_mfg_inst_qty.addAllListener(p);
		p.columnWrk1Dtl_mfg_inst_qty.setListListener(p);
		p.columnWrk1Dtl_fxd_rqmt_qty.addAllListener(p);
		p.columnWrk1Dtl_fxd_rqmt_qty.setListListener(p);
		p.columnWrk1Dtl_lot_issue_typ.addAllListener(p);
		p.columnWrk1Dtl_lot_issue_typ.setListListener(p);
		p.columnWrk1Dtl_lot_issue_typ_nm.addAllListener(p);
		p.columnWrk1Dtl_lot_issue_typ_nm.setListListener(p);
		p.columnWrk1Dtl_bkf_flg.addAllListener(p);
		p.columnWrk1Dtl_ln_stk_flg.addAllListener(p);
		p.columnWrk1Dtl_pre_po_tgt_flg.addAllListener(p);
		p.columnWrk1Dtl_inst_rec_issue_flg.addAllListener(p);
		p.columnWrk1Dtl_no_mfg_aprv_flg.addAllListener(p);
		p.columnWrk1Dtl_itm_lower_yield.addAllListener(p);
		p.columnWrk1Dtl_itm_lower_yield.setListListener(p);
		p.columnWrk1Dtl_itm_std_yield.addAllListener(p);
		p.columnWrk1Dtl_itm_std_yield.setListListener(p);
		p.columnWrk1Dtl_itm_upper_yield.addAllListener(p);
		p.columnWrk1Dtl_itm_upper_yield.setListListener(p);
		p.columnWrk1Dtl_purc_id_typ.addAllListener(p);
		p.columnWrk1Dtl_purc_id_typ.setListListener(p);
		p.columnWrk1Dtl_purc_id_typ_nm.addAllListener(p);
		p.columnWrk1Dtl_purc_id_typ_nm.setListListener(p);
		p.columnWrk1Dtl_rqst_wg_cd.addAllListener(p);
		p.columnWrk1Dtl_rqst_wg_cd.setListListener(p);
		p.columnWrk1Dtl_rqst_wg_nm.addAllListener(p);
		p.columnWrk1Dtl_rqst_wg_nm.setListListener(p);
		p.columnWrk1Dtl_po_batch_flg.addAllListener(p);
		p.columnWrk1Dtl_rsrc_cd1.addAllListener(p);
		p.columnWrk1Dtl_rsrc_cd1.setListListener(p);
		p.columnWrk1Dtl_rsrc_nm1.addAllListener(p);
		p.columnWrk1Dtl_rsrc_nm1.setListListener(p);
		p.columnWrk1Dtl_rsrc_unit_nm1.addAllListener(p);
		p.columnWrk1Dtl_rsrc_unit_nm1.setListListener(p);
		p.columnWrk1Dtl_rsrc_std_qty1.addAllListener(p);
		p.columnWrk1Dtl_rsrc_std_qty1.setListListener(p);
		p.columnWrk1Dtl_rsrc_cd2.addAllListener(p);
		p.columnWrk1Dtl_rsrc_cd2.setListListener(p);
		p.columnWrk1Dtl_rsrc_nm2.addAllListener(p);
		p.columnWrk1Dtl_rsrc_nm2.setListListener(p);
		p.columnWrk1Dtl_rsrc_unit_nm2.addAllListener(p);
		p.columnWrk1Dtl_rsrc_unit_nm2.setListListener(p);
		p.columnWrk1Dtl_rsrc_std_qty2.addAllListener(p);
		p.columnWrk1Dtl_rsrc_std_qty2.setListListener(p);
		p.columnWrk1Dtl_not_mrp_flg.addAllListener(p);
		p.columnWrk1Dtl_cost_ratio.addAllListener(p);
		p.columnWrk1Dtl_cost_ratio.setListListener(p);
		p.columnWrk1Dtl_memo1.addAllListener(p);
		p.columnWrk1Dtl_memo1.setListListener(p);
		p.columnWrk1Dtl_memo2.addAllListener(p);
		p.columnWrk1Dtl_memo2.setListListener(p);
		p.columnWrk1Dtl_memo3.addAllListener(p);
		p.columnWrk1Dtl_memo3.setListListener(p);
		p.columnWrk1Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk1Dtl_ins_usr_id.setListListener(p);
		p.columnWrk1Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk1Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk1Dtl_ins_ts.addAllListener(p);
		p.columnWrk1Dtl_ins_ts.setListListener(p);
		p.columnWrk1Dtl_ins_func_id.addAllListener(p);
		p.columnWrk1Dtl_ins_func_id.setListListener(p);
		p.columnWrk1Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk1Dtl_ins_func_nm.setListListener(p);
		p.columnWrk1Dtl_upd_cntr.addAllListener(p);
		p.columnWrk1Dtl_upd_cntr.setListListener(p);
		p.columnWrk1Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk1Dtl_upd_usr_id.setListListener(p);
		p.columnWrk1Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk1Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk1Dtl_upd_ts.addAllListener(p);
		p.columnWrk1Dtl_upd_ts.setListListener(p);
		p.columnWrk1Dtl_upd_func_id.addAllListener(p);
		p.columnWrk1Dtl_upd_func_id.setListListener(p);
		p.columnWrk1Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk1Dtl_upd_func_nm.setListListener(p);
		p.columnWrk1Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk1Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk1Dtl_del_usr_id.addAllListener(p);
		p.columnWrk1Dtl_del_usr_id.setListListener(p);
		p.columnWrk1Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk1Dtl_del_usr_nm.setListListener(p);
		p.columnWrk1Dtl_del_ts.addAllListener(p);
		p.columnWrk1Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk2Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2Dtl(MABSP_BomExSrch p) {
		p.Wrk2DtlTable.addAllListener(p);
		p.columnWrk2Dtl_del_flg.addAllListener(p);
		p.columnWrk2Dtl_itm_unit_cd.addAllListener(p);
		p.columnWrk2Dtl_itm_unit_cd.setListListener(p);
		p.columnWrk2Dtl_itm_dec_place.addAllListener(p);
		p.columnWrk2Dtl_itm_dec_place.setListListener(p);
		p.columnWrk2Dtl_itm_typ.addAllListener(p);
		p.columnWrk2Dtl_itm_typ.setListListener(p);
		p.columnWrk2Dtl_itm_typ_nm.addAllListener(p);
		p.columnWrk2Dtl_itm_typ_nm.setListListener(p);
		p.columnWrk2Dtl_itm_typ_d_cd.addAllListener(p);
		p.columnWrk2Dtl_itm_typ_d_cd.setListListener(p);
		p.columnWrk2Dtl_itm_typ_d_nm.addAllListener(p);
		p.columnWrk2Dtl_itm_typ_d_nm.setListListener(p);
		p.columnWrk2Dtl_loc_cd.addAllListener(p);
		p.columnWrk2Dtl_loc_cd.setListListener(p);
		p.columnWrk2Dtl_loc_nm.addAllListener(p);
		p.columnWrk2Dtl_loc_nm.setListListener(p);
		p.columnWrk2Dtl_wg_cd.addAllListener(p);
		p.columnWrk2Dtl_wg_cd.setListListener(p);
		p.columnWrk2Dtl_wg_nm.addAllListener(p);
		p.columnWrk2Dtl_wg_nm.setListListener(p);
		p.columnWrk2Dtl_oper_ptn.addAllListener(p);
		p.columnWrk2Dtl_oper_ptn.setListListener(p);
		p.columnWrk2Dtl_oper_cd.addAllListener(p);
		p.columnWrk2Dtl_oper_cd.setListListener(p);
		p.columnWrk2Dtl_oper_nm.addAllListener(p);
		p.columnWrk2Dtl_oper_nm.setListListener(p);
		p.columnWrk2Dtl_oper_seq.addAllListener(p);
		p.columnWrk2Dtl_oper_seq.setListListener(p);
		p.columnWrk2Dtl_disp_seq.addAllListener(p);
		p.columnWrk2Dtl_disp_seq.setListListener(p);
		p.columnWrk2Dtl_oper_lt.addAllListener(p);
		p.columnWrk2Dtl_oper_lt.setListListener(p);
		p.columnWrk2Dtl_oper_lt_add_qty.addAllListener(p);
		p.columnWrk2Dtl_oper_lt_add_qty.setListListener(p);
		p.columnWrk2Dtl_oper_offst_typ.addAllListener(p);
		p.columnWrk2Dtl_oper_offst_typ.setListListener(p);
		p.columnWrk2Dtl_oper_offst_typ_nm.addAllListener(p);
		p.columnWrk2Dtl_oper_offst_typ_nm.setListListener(p);
		p.columnWrk2Dtl_oper_offst.addAllListener(p);
		p.columnWrk2Dtl_oper_offst.setListListener(p);
		p.columnWrk2Dtl_oper_offst_add_qty.addAllListener(p);
		p.columnWrk2Dtl_oper_offst_add_qty.setListListener(p);
		p.columnWrk2Dtl_oper_unit_cd.addAllListener(p);
		p.columnWrk2Dtl_oper_unit_cd.setListListener(p);
		p.columnWrk2Dtl_oper_unit_nm.addAllListener(p);
		p.columnWrk2Dtl_oper_unit_nm.setListListener(p);
		p.columnWrk2Dtl_def_dec_place.addAllListener(p);
		p.columnWrk2Dtl_def_dec_place.setListListener(p);
		p.columnWrk2Dtl_dec_place.addAllListener(p);
		p.columnWrk2Dtl_dec_place.setListListener(p);
		p.columnWrk2Dtl_unit_conv_rnd_typ.addAllListener(p);
		p.columnWrk2Dtl_unit_conv_rnd_typ.setListListener(p);
		p.columnWrk2Dtl_unit_conv_rnd_typ_nm.addAllListener(p);
		p.columnWrk2Dtl_unit_conv_rnd_typ_nm.setListListener(p);
		p.columnWrk2Dtl_yield_oper_flg.addAllListener(p);
		p.columnWrk2Dtl_yield_oper_ratio.addAllListener(p);
		p.columnWrk2Dtl_yield_oper_ratio.setListListener(p);
		p.columnWrk2Dtl_oper_inst_grp.addAllListener(p);
		p.columnWrk2Dtl_oper_inst_grp.setListListener(p);
		p.columnWrk2Dtl_oper_loc_cd.addAllListener(p);
		p.columnWrk2Dtl_oper_loc_cd.setListListener(p);
		p.columnWrk2Dtl_oper_loc_nm.addAllListener(p);
		p.columnWrk2Dtl_oper_loc_nm.setListListener(p);
		p.columnWrk2Dtl_lmt_fr_dt_flg.addAllListener(p);
		p.columnWrk2Dtl_oper_lower_yield.addAllListener(p);
		p.columnWrk2Dtl_oper_lower_yield.setListListener(p);
		p.columnWrk2Dtl_oper_std_yield.addAllListener(p);
		p.columnWrk2Dtl_oper_std_yield.setListListener(p);
		p.columnWrk2Dtl_oper_upper_yield.addAllListener(p);
		p.columnWrk2Dtl_oper_upper_yield.setListListener(p);
		p.columnWrk2Dtl_wip_rate.addAllListener(p);
		p.columnWrk2Dtl_wip_rate.setListListener(p);
		p.columnWrk2Dtl_not_cost_flg.addAllListener(p);
		p.columnWrk2Dtl_memo1.addAllListener(p);
		p.columnWrk2Dtl_memo1.setListListener(p);
		p.columnWrk2Dtl_memo2.addAllListener(p);
		p.columnWrk2Dtl_memo2.setListListener(p);
		p.columnWrk2Dtl_memo3.addAllListener(p);
		p.columnWrk2Dtl_memo3.setListListener(p);
		p.columnWrk2Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk2Dtl_ins_usr_id.setListListener(p);
		p.columnWrk2Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk2Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk2Dtl_ins_ts.addAllListener(p);
		p.columnWrk2Dtl_ins_ts.setListListener(p);
		p.columnWrk2Dtl_ins_func_id.addAllListener(p);
		p.columnWrk2Dtl_ins_func_id.setListListener(p);
		p.columnWrk2Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk2Dtl_ins_func_nm.setListListener(p);
		p.columnWrk2Dtl_upd_cntr.addAllListener(p);
		p.columnWrk2Dtl_upd_cntr.setListListener(p);
		p.columnWrk2Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk2Dtl_upd_usr_id.setListListener(p);
		p.columnWrk2Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk2Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk2Dtl_upd_ts.addAllListener(p);
		p.columnWrk2Dtl_upd_ts.setListListener(p);
		p.columnWrk2Dtl_upd_func_id.addAllListener(p);
		p.columnWrk2Dtl_upd_func_id.setListListener(p);
		p.columnWrk2Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk2Dtl_upd_func_nm.setListListener(p);
		p.columnWrk2Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk2Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk2Dtl_del_usr_id.addAllListener(p);
		p.columnWrk2Dtl_del_usr_id.setListListener(p);
		p.columnWrk2Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk2Dtl_del_usr_nm.setListListener(p);
		p.columnWrk2Dtl_del_ts.addAllListener(p);
		p.columnWrk2Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk3Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3Dtl(MABSP_BomExSrch p) {
		p.Wrk3DtlTable.addAllListener(p);
		p.columnWrk3Dtl_del_flg.addAllListener(p);
		p.columnWrk3Dtl_itm_typ.addAllListener(p);
		p.columnWrk3Dtl_itm_typ.setListListener(p);
		p.columnWrk3Dtl_itm_typ_nm.addAllListener(p);
		p.columnWrk3Dtl_itm_typ_nm.setListListener(p);
		p.columnWrk3Dtl_itm_typ_d_cd.addAllListener(p);
		p.columnWrk3Dtl_itm_typ_d_cd.setListListener(p);
		p.columnWrk3Dtl_itm_typ_d_nm.addAllListener(p);
		p.columnWrk3Dtl_itm_typ_d_nm.setListListener(p);
		p.columnWrk3Dtl_loc_cd.addAllListener(p);
		p.columnWrk3Dtl_loc_cd.setListListener(p);
		p.columnWrk3Dtl_loc_nm.addAllListener(p);
		p.columnWrk3Dtl_loc_nm.setListListener(p);
		p.columnWrk3Dtl_wg_cd.addAllListener(p);
		p.columnWrk3Dtl_wg_cd.setListListener(p);
		p.columnWrk3Dtl_wg_nm.addAllListener(p);
		p.columnWrk3Dtl_wg_nm.setListListener(p);
		p.columnWrk3Dtl_oper_ptn.addAllListener(p);
		p.columnWrk3Dtl_oper_ptn.setListListener(p);
		p.columnWrk3Dtl_oper_cd.addAllListener(p);
		p.columnWrk3Dtl_oper_cd.setListListener(p);
		p.columnWrk3Dtl_oper_nm.addAllListener(p);
		p.columnWrk3Dtl_oper_nm.setListListener(p);
		p.columnWrk3Dtl_oper_seq.addAllListener(p);
		p.columnWrk3Dtl_oper_seq.setListListener(p);
		p.columnWrk3Dtl_wk_cost_cd.addAllListener(p);
		p.columnWrk3Dtl_wk_cost_cd.setListListener(p);
		p.columnWrk3Dtl_wk_cost_nm.addAllListener(p);
		p.columnWrk3Dtl_wk_cost_nm.setListListener(p);
		p.columnWrk3Dtl_wk_cost_unit_nm.addAllListener(p);
		p.columnWrk3Dtl_wk_cost_unit_nm.setListListener(p);
		p.columnWrk3Dtl_wk_cost_unit_dec_place.addAllListener(p);
		p.columnWrk3Dtl_wk_cost_unit_dec_place.setListListener(p);
		p.columnWrk3Dtl_wk_cost_unit_rnd_typ.addAllListener(p);
		p.columnWrk3Dtl_wk_cost_unit_rnd_typ.setListListener(p);
		p.columnWrk3Dtl_fxd_wk_cost.addAllListener(p);
		p.columnWrk3Dtl_fxd_wk_cost.setListListener(p);
		p.columnWrk3Dtl_wk_cost.addAllListener(p);
		p.columnWrk3Dtl_wk_cost.setListListener(p);
		p.columnWrk3Dtl_base_unit_cd.addAllListener(p);
		p.columnWrk3Dtl_base_unit_cd.setListListener(p);
		p.columnWrk3Dtl_base_unit_nm.addAllListener(p);
		p.columnWrk3Dtl_base_unit_nm.setListListener(p);
		p.columnWrk3Dtl_itm_dec_place.addAllListener(p);
		p.columnWrk3Dtl_itm_dec_place.setListListener(p);
		p.columnWrk3Dtl_wk_cost_calc_flg.addAllListener(p);
		p.columnWrk3Dtl_disp_seq.addAllListener(p);
		p.columnWrk3Dtl_disp_seq.setListListener(p);
		p.columnWrk3Dtl_not_cost_flg.addAllListener(p);
		p.columnWrk3Dtl_memo1.addAllListener(p);
		p.columnWrk3Dtl_memo1.setListListener(p);
		p.columnWrk3Dtl_memo2.addAllListener(p);
		p.columnWrk3Dtl_memo2.setListListener(p);
		p.columnWrk3Dtl_memo3.addAllListener(p);
		p.columnWrk3Dtl_memo3.setListListener(p);
		p.columnWrk3Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk3Dtl_ins_usr_id.setListListener(p);
		p.columnWrk3Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk3Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk3Dtl_ins_ts.addAllListener(p);
		p.columnWrk3Dtl_ins_ts.setListListener(p);
		p.columnWrk3Dtl_ins_func_id.addAllListener(p);
		p.columnWrk3Dtl_ins_func_id.setListListener(p);
		p.columnWrk3Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk3Dtl_ins_func_nm.setListListener(p);
		p.columnWrk3Dtl_upd_cntr.addAllListener(p);
		p.columnWrk3Dtl_upd_cntr.setListListener(p);
		p.columnWrk3Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk3Dtl_upd_usr_id.setListListener(p);
		p.columnWrk3Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk3Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk3Dtl_upd_ts.addAllListener(p);
		p.columnWrk3Dtl_upd_ts.setListListener(p);
		p.columnWrk3Dtl_upd_func_id.addAllListener(p);
		p.columnWrk3Dtl_upd_func_id.setListListener(p);
		p.columnWrk3Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk3Dtl_upd_func_nm.setListListener(p);
		p.columnWrk3Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk3Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk3Dtl_del_usr_id.addAllListener(p);
		p.columnWrk3Dtl_del_usr_id.setListListener(p);
		p.columnWrk3Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk3Dtl_del_usr_nm.setListListener(p);
		p.columnWrk3Dtl_del_ts.addAllListener(p);
		p.columnWrk3Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk4Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk4Dtl(MABSP_BomExSrch p) {
		p.Wrk4DtlTable.addAllListener(p);
		p.columnWrk4Dtl_del_flg.addAllListener(p);
		p.columnWrk4Dtl_itm_typ.addAllListener(p);
		p.columnWrk4Dtl_itm_typ.setListListener(p);
		p.columnWrk4Dtl_itm_typ_nm.addAllListener(p);
		p.columnWrk4Dtl_itm_typ_nm.setListListener(p);
		p.columnWrk4Dtl_itm_typ_d_cd.addAllListener(p);
		p.columnWrk4Dtl_itm_typ_d_cd.setListListener(p);
		p.columnWrk4Dtl_itm_typ_d_nm.addAllListener(p);
		p.columnWrk4Dtl_itm_typ_d_nm.setListListener(p);
		p.columnWrk4Dtl_loc_cd.addAllListener(p);
		p.columnWrk4Dtl_loc_cd.setListListener(p);
		p.columnWrk4Dtl_loc_nm.addAllListener(p);
		p.columnWrk4Dtl_loc_nm.setListListener(p);
		p.columnWrk4Dtl_wg_cd.addAllListener(p);
		p.columnWrk4Dtl_wg_cd.setListListener(p);
		p.columnWrk4Dtl_wg_nm.addAllListener(p);
		p.columnWrk4Dtl_wg_nm.setListListener(p);
		p.columnWrk4Dtl_loc_grp_cd.addAllListener(p);
		p.columnWrk4Dtl_loc_grp_cd.setListListener(p);
		p.columnWrk4Dtl_loc_grp_nm.addAllListener(p);
		p.columnWrk4Dtl_loc_grp_nm.setListListener(p);
		p.columnWrk4Dtl_prio.addAllListener(p);
		p.columnWrk4Dtl_prio.setListListener(p);
		p.columnWrk4Dtl_memo1.addAllListener(p);
		p.columnWrk4Dtl_memo1.setListListener(p);
		p.columnWrk4Dtl_memo2.addAllListener(p);
		p.columnWrk4Dtl_memo2.setListListener(p);
		p.columnWrk4Dtl_memo3.addAllListener(p);
		p.columnWrk4Dtl_memo3.setListListener(p);
		p.columnWrk4Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk4Dtl_ins_usr_id.setListListener(p);
		p.columnWrk4Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk4Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk4Dtl_ins_ts.addAllListener(p);
		p.columnWrk4Dtl_ins_ts.setListListener(p);
		p.columnWrk4Dtl_ins_func_id.addAllListener(p);
		p.columnWrk4Dtl_ins_func_id.setListListener(p);
		p.columnWrk4Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk4Dtl_ins_func_nm.setListListener(p);
		p.columnWrk4Dtl_upd_cntr.addAllListener(p);
		p.columnWrk4Dtl_upd_cntr.setListListener(p);
		p.columnWrk4Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk4Dtl_upd_usr_id.setListListener(p);
		p.columnWrk4Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk4Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk4Dtl_upd_ts.addAllListener(p);
		p.columnWrk4Dtl_upd_ts.setListListener(p);
		p.columnWrk4Dtl_upd_func_id.addAllListener(p);
		p.columnWrk4Dtl_upd_func_id.setListListener(p);
		p.columnWrk4Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk4Dtl_upd_func_nm.setListListener(p);
		p.columnWrk4Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk4Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk4Dtl_del_usr_id.addAllListener(p);
		p.columnWrk4Dtl_del_usr_id.setListListener(p);
		p.columnWrk4Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk4Dtl_del_usr_nm.setListListener(p);
		p.columnWrk4Dtl_del_ts.addAllListener(p);
		p.columnWrk4Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk5Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk5Dtl(MABSP_BomExSrch p) {
		p.Wrk5DtlTable.addAllListener(p);
		p.columnWrk5Dtl_del_flg.addAllListener(p);
		p.columnWrk5Dtl_dec_place.addAllListener(p);
		p.columnWrk5Dtl_dec_place.setListListener(p);
		p.columnWrk5Dtl_itm_typ.addAllListener(p);
		p.columnWrk5Dtl_itm_typ.setListListener(p);
		p.columnWrk5Dtl_itm_typ_nm.addAllListener(p);
		p.columnWrk5Dtl_itm_typ_nm.setListListener(p);
		p.columnWrk5Dtl_itm_typ_d_cd.addAllListener(p);
		p.columnWrk5Dtl_itm_typ_d_cd.setListListener(p);
		p.columnWrk5Dtl_itm_typ_d_nm.addAllListener(p);
		p.columnWrk5Dtl_itm_typ_d_nm.setListListener(p);
		p.columnWrk5Dtl_loc_cd.addAllListener(p);
		p.columnWrk5Dtl_loc_cd.setListListener(p);
		p.columnWrk5Dtl_loc_nm.addAllListener(p);
		p.columnWrk5Dtl_loc_nm.setListListener(p);
		p.columnWrk5Dtl_wg_cd.addAllListener(p);
		p.columnWrk5Dtl_wg_cd.setListListener(p);
		p.columnWrk5Dtl_wg_nm.addAllListener(p);
		p.columnWrk5Dtl_wg_nm.setListListener(p);
		p.columnWrk5Dtl_gi_schd_flg.addAllListener(p);
		p.columnWrk5Dtl_base_unit_cd.addAllListener(p);
		p.columnWrk5Dtl_base_unit_cd.setListListener(p);
		p.columnWrk5Dtl_base_unit_nm.addAllListener(p);
		p.columnWrk5Dtl_base_unit_nm.setListListener(p);
		p.columnWrk5Dtl_lot_sizing_flg.addAllListener(p);
		p.columnWrk5Dtl_gi_loc_cd.addAllListener(p);
		p.columnWrk5Dtl_gi_loc_cd.setListListener(p);
		p.columnWrk5Dtl_gi_loc_nm.addAllListener(p);
		p.columnWrk5Dtl_gi_loc_nm.setListListener(p);
		p.columnWrk5Dtl_gi_str_ln_tgt_flg.addAllListener(p);
		p.columnWrk5Dtl_inpt_gi_loc_cd.addAllListener(p);
		p.columnWrk5Dtl_inpt_gi_loc_cd.setListListener(p);
		p.columnWrk5Dtl_inpt_gi_loc_nm.addAllListener(p);
		p.columnWrk5Dtl_inpt_gi_loc_nm.setListListener(p);
		p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg.addAllListener(p);
		p.columnWrk5Dtl_ship_gi_loc_cd.addAllListener(p);
		p.columnWrk5Dtl_ship_gi_loc_cd.setListListener(p);
		p.columnWrk5Dtl_ship_gi_loc_nm.addAllListener(p);
		p.columnWrk5Dtl_ship_gi_loc_nm.setListListener(p);
		p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg.addAllListener(p);
		p.columnWrk5Dtl_memo1.addAllListener(p);
		p.columnWrk5Dtl_memo1.setListListener(p);
		p.columnWrk5Dtl_memo2.addAllListener(p);
		p.columnWrk5Dtl_memo2.setListListener(p);
		p.columnWrk5Dtl_memo3.addAllListener(p);
		p.columnWrk5Dtl_memo3.setListListener(p);
		p.columnWrk5Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk5Dtl_ins_usr_id.setListListener(p);
		p.columnWrk5Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk5Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk5Dtl_ins_ts.addAllListener(p);
		p.columnWrk5Dtl_ins_ts.setListListener(p);
		p.columnWrk5Dtl_ins_func_id.addAllListener(p);
		p.columnWrk5Dtl_ins_func_id.setListListener(p);
		p.columnWrk5Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk5Dtl_ins_func_nm.setListListener(p);
		p.columnWrk5Dtl_upd_cntr.addAllListener(p);
		p.columnWrk5Dtl_upd_cntr.setListListener(p);
		p.columnWrk5Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk5Dtl_upd_usr_id.setListListener(p);
		p.columnWrk5Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk5Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk5Dtl_upd_ts.addAllListener(p);
		p.columnWrk5Dtl_upd_ts.setListListener(p);
		p.columnWrk5Dtl_upd_func_id.addAllListener(p);
		p.columnWrk5Dtl_upd_func_id.setListListener(p);
		p.columnWrk5Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk5Dtl_upd_func_nm.setListListener(p);
		p.columnWrk5Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk5Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk5Dtl_del_usr_id.addAllListener(p);
		p.columnWrk5Dtl_del_usr_id.setListListener(p);
		p.columnWrk5Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk5Dtl_del_usr_nm.setListListener(p);
		p.columnWrk5Dtl_del_ts.addAllListener(p);
		p.columnWrk5Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk6Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk6Dtl(MABSP_BomExSrch p) {
		p.Wrk6DtlTable.addAllListener(p);
		p.columnWrk6Dtl_del_flg.addAllListener(p);
		p.columnWrk6Dtl_itm_typ.addAllListener(p);
		p.columnWrk6Dtl_itm_typ.setListListener(p);
		p.columnWrk6Dtl_itm_typ_nm.addAllListener(p);
		p.columnWrk6Dtl_itm_typ_nm.setListListener(p);
		p.columnWrk6Dtl_itm_typ_d_cd.addAllListener(p);
		p.columnWrk6Dtl_itm_typ_d_cd.setListListener(p);
		p.columnWrk6Dtl_itm_typ_d_nm.addAllListener(p);
		p.columnWrk6Dtl_itm_typ_d_nm.setListListener(p);
		p.columnWrk6Dtl_insp_ptn_cd.addAllListener(p);
		p.columnWrk6Dtl_insp_ptn_cd.setListListener(p);
		p.columnWrk6Dtl_insp_ptn_nm.addAllListener(p);
		p.columnWrk6Dtl_insp_ptn_nm.setListListener(p);
		p.columnWrk6Dtl_insp_mtd_typ.addAllListener(p);
		p.columnWrk6Dtl_insp_mtd_typ.setListListener(p);
		p.columnWrk6Dtl_insp_mtd_typ_nm.addAllListener(p);
		p.columnWrk6Dtl_insp_mtd_typ_nm.setListListener(p);
		p.columnWrk6Dtl_insp_lt.addAllListener(p);
		p.columnWrk6Dtl_insp_lt.setListListener(p);
		p.columnWrk6Dtl_insp_std_no.addAllListener(p);
		p.columnWrk6Dtl_insp_std_no.setListListener(p);
		p.columnWrk6Dtl_unit_cd.addAllListener(p);
		p.columnWrk6Dtl_unit_cd.setListListener(p);
		p.columnWrk6Dtl_dec_place.addAllListener(p);
		p.columnWrk6Dtl_dec_place.setListListener(p);
		p.columnWrk6Dtl_std_req_flg.addAllListener(p);
		p.columnWrk6Dtl_std_cnf_req_flg.addAllListener(p);
		p.columnWrk6Dtl_memo1.addAllListener(p);
		p.columnWrk6Dtl_memo1.setListListener(p);
		p.columnWrk6Dtl_memo2.addAllListener(p);
		p.columnWrk6Dtl_memo2.setListListener(p);
		p.columnWrk6Dtl_memo3.addAllListener(p);
		p.columnWrk6Dtl_memo3.setListListener(p);
		p.columnWrk6Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk6Dtl_ins_usr_id.setListListener(p);
		p.columnWrk6Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk6Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk6Dtl_ins_ts.addAllListener(p);
		p.columnWrk6Dtl_ins_ts.setListListener(p);
		p.columnWrk6Dtl_ins_func_id.addAllListener(p);
		p.columnWrk6Dtl_ins_func_id.setListListener(p);
		p.columnWrk6Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk6Dtl_ins_func_nm.setListListener(p);
		p.columnWrk6Dtl_upd_cntr.addAllListener(p);
		p.columnWrk6Dtl_upd_cntr.setListListener(p);
		p.columnWrk6Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk6Dtl_upd_usr_id.setListListener(p);
		p.columnWrk6Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk6Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk6Dtl_upd_ts.addAllListener(p);
		p.columnWrk6Dtl_upd_ts.setListListener(p);
		p.columnWrk6Dtl_upd_func_id.addAllListener(p);
		p.columnWrk6Dtl_upd_func_id.setListListener(p);
		p.columnWrk6Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk6Dtl_upd_func_nm.setListListener(p);
		p.columnWrk6Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk6Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk6Dtl_del_usr_id.addAllListener(p);
		p.columnWrk6Dtl_del_usr_id.setListListener(p);
		p.columnWrk6Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk6Dtl_del_usr_nm.setListListener(p);
		p.columnWrk6Dtl_del_ts.addAllListener(p);
		p.columnWrk6Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk7Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk7Dtl(MABSP_BomExSrch p) {
		p.Wrk7DtlTable.addAllListener(p);
		p.columnWrk7Dtl_del_flg.addAllListener(p);
		p.columnWrk7Dtl_itm_typ.addAllListener(p);
		p.columnWrk7Dtl_itm_typ.setListListener(p);
		p.columnWrk7Dtl_itm_typ_nm.addAllListener(p);
		p.columnWrk7Dtl_itm_typ_nm.setListListener(p);
		p.columnWrk7Dtl_itm_typ_d_cd.addAllListener(p);
		p.columnWrk7Dtl_itm_typ_d_cd.setListListener(p);
		p.columnWrk7Dtl_itm_typ_d_nm.addAllListener(p);
		p.columnWrk7Dtl_itm_typ_d_nm.setListListener(p);
		p.columnWrk7Dtl_lmt_ctl_flg.addAllListener(p);
		p.columnWrk7Dtl_mfg_loc_cd.addAllListener(p);
		p.columnWrk7Dtl_mfg_loc_cd.setListListener(p);
		p.columnWrk7Dtl_mfg_loc_nm.addAllListener(p);
		p.columnWrk7Dtl_mfg_loc_nm.setListListener(p);
		p.columnWrk7Dtl_sppl_cd.addAllListener(p);
		p.columnWrk7Dtl_sppl_cd.setListListener(p);
		p.columnWrk7Dtl_sppl_nm.addAllListener(p);
		p.columnWrk7Dtl_sppl_nm.setListListener(p);
		p.columnWrk7Dtl_maker_cd.addAllListener(p);
		p.columnWrk7Dtl_maker_cd.setListListener(p);
		p.columnWrk7Dtl_maker_nm.addAllListener(p);
		p.columnWrk7Dtl_maker_nm.setListListener(p);
		p.columnWrk7Dtl_from_site_cd.addAllListener(p);
		p.columnWrk7Dtl_from_site_cd.setListListener(p);
		p.columnWrk7Dtl_from_site_nm.addAllListener(p);
		p.columnWrk7Dtl_from_site_nm.setListListener(p);
		p.columnWrk7Dtl_to_site_cd.addAllListener(p);
		p.columnWrk7Dtl_to_site_cd.setListListener(p);
		p.columnWrk7Dtl_to_site_nm.addAllListener(p);
		p.columnWrk7Dtl_to_site_nm.setListListener(p);
		p.columnWrk7Dtl_no_insp_flg.addAllListener(p);
		p.columnWrk7Dtl_insp_ptn_cd.addAllListener(p);
		p.columnWrk7Dtl_insp_ptn_cd.setListListener(p);
		p.columnWrk7Dtl_insp_ptn_nm.addAllListener(p);
		p.columnWrk7Dtl_insp_ptn_nm.setListListener(p);
		p.columnWrk7Dtl_no_mrkt_judg_flg.addAllListener(p);
		p.columnWrk7Dtl_no_plnt_aprv_flg.addAllListener(p);
		p.columnWrk7Dtl_no_insp_aprv_flg.addAllListener(p);
		p.columnWrk7Dtl_lmt_dt_frm_typ.addAllListener(p);
		p.columnWrk7Dtl_lmt_dt_frm_typ.setListListener(p);
		p.columnWrk7Dtl_lmt_dt_frm_typ_nm.addAllListener(p);
		p.columnWrk7Dtl_lmt_dt_frm_typ_nm.setListListener(p);
		p.columnWrk7Dtl_vld_pd.addAllListener(p);
		p.columnWrk7Dtl_vld_pd.setListListener(p);
		p.columnWrk7Dtl_lmt_pd.addAllListener(p);
		p.columnWrk7Dtl_lmt_pd.setListListener(p);
		p.columnWrk7Dtl_lot_insp_vld_pd.addAllListener(p);
		p.columnWrk7Dtl_lot_insp_vld_pd.setListListener(p);
		p.columnWrk7Dtl_calc_pd_typ.addAllListener(p);
		p.columnWrk7Dtl_calc_pd_typ.setListListener(p);
		p.columnWrk7Dtl_calc_pd_typ_nm.addAllListener(p);
		p.columnWrk7Dtl_calc_pd_typ_nm.setListListener(p);
		p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ.addAllListener(p);
		p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ.setListListener(p);
		p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm.addAllListener(p);
		p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm.setListListener(p);
		p.columnWrk7Dtl_insp_inst_issue_typ.addAllListener(p);
		p.columnWrk7Dtl_insp_inst_issue_typ.setListListener(p);
		p.columnWrk7Dtl_insp_inst_issue_typ_nm.addAllListener(p);
		p.columnWrk7Dtl_insp_inst_issue_typ_nm.setListListener(p);
		p.columnWrk7Dtl_insp_offst.addAllListener(p);
		p.columnWrk7Dtl_insp_offst.setListListener(p);
		p.columnWrk7Dtl_inst_rslt_issue_flg.addAllListener(p);
		p.columnWrk7Dtl_pre_insp_valid_flg.addAllListener(p);
		p.columnWrk7Dtl_memo1.addAllListener(p);
		p.columnWrk7Dtl_memo1.setListListener(p);
		p.columnWrk7Dtl_memo2.addAllListener(p);
		p.columnWrk7Dtl_memo2.setListListener(p);
		p.columnWrk7Dtl_memo3.addAllListener(p);
		p.columnWrk7Dtl_memo3.setListListener(p);
		p.columnWrk7Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk7Dtl_ins_usr_id.setListListener(p);
		p.columnWrk7Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk7Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk7Dtl_ins_ts.addAllListener(p);
		p.columnWrk7Dtl_ins_ts.setListListener(p);
		p.columnWrk7Dtl_ins_func_id.addAllListener(p);
		p.columnWrk7Dtl_ins_func_id.setListListener(p);
		p.columnWrk7Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk7Dtl_ins_func_nm.setListListener(p);
		p.columnWrk7Dtl_upd_cntr.addAllListener(p);
		p.columnWrk7Dtl_upd_cntr.setListListener(p);
		p.columnWrk7Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk7Dtl_upd_usr_id.setListListener(p);
		p.columnWrk7Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk7Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk7Dtl_upd_ts.addAllListener(p);
		p.columnWrk7Dtl_upd_ts.setListListener(p);
		p.columnWrk7Dtl_upd_func_id.addAllListener(p);
		p.columnWrk7Dtl_upd_func_id.setListListener(p);
		p.columnWrk7Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk7Dtl_upd_func_nm.setListListener(p);
		p.columnWrk7Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk7Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk7Dtl_del_usr_id.addAllListener(p);
		p.columnWrk7Dtl_del_usr_id.setListListener(p);
		p.columnWrk7Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk7Dtl_del_usr_nm.setListListener(p);
		p.columnWrk7Dtl_del_ts.addAllListener(p);
		p.columnWrk7Dtl_del_ts.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MABSP_BomExSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MABSP_BomExSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MABSP_BomExSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABSP_BomExSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_base_dt.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_itm_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_PPanel.Itm_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.ENABLE_SRCH);
		p.Cnd_bom_ptn.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bom_ptn_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ph_ex_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_max_hrrchy.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_base_qty.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MABSP_BomExSrch p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MABSP_BomExSrch p){
		p.RPnl_srch_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_TopDtl(MABSP_BomExSrch p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MABSP_BomExSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MABSP_BomExSrch p){
		p.Dtl_hrrchy_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.columnDtl_bottom_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_byprod_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_unit_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ph_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ph_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alt_alloc_prio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sno_typ1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sno_typ2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sno_typ3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sno_typ4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_min_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_max_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_chd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_qty6_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty5_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty1_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty3_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty4_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_in_offst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_in_offst.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_inst_lot_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_lot_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sublot_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_main_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_yield_calc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_bom.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MABSP_BomExSrch p){

	}

	/**
	 * [SRCH]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlBtn(MABSP_BomExSrch p){
		p.DtlBtn_srch_dtl.putMode(p, SRCH, MCMode.DISABLE);
		p.DtlBtn_open_MABSP0040_EX1.putMode(p, SRCH, MCMode.DISABLE);
		p.DtlBtn_open_MABSP0040_EX2.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BtmDtl(MABSP_BomExSrch p){

	}

	/**
	 * [SRCH]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlTab(MABSP_BomExSrch p){

	}

	/**
	 * [SRCH]ステータスの[Wrk1Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1Dtl(MABSP_BomExSrch p){
		p.columnWrk1Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk1Dtl_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk1Dtl_asset_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk1Dtl_unit_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk1Dtl_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk1Dtl_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk1Dtl_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk1Dtl_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk1Dtl_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk1Dtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_loc_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_loc_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk1Dtl_oper_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_mfg_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_mfg_lt_add_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_lt_add_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_accpt_insp_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_buf_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ord_fix_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_day_week_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_day_week_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_week.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_lot_sz_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_min_lot_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_batch_lot_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_max_lot_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_max_order.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_prio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_order_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_yield_schd_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_mfg_inst_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_fxd_rqmt_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_lot_issue_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_lot_issue_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_bkf_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ln_stk_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_pre_po_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_inst_rec_issue_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_no_mfg_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_itm_lower_yield.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_itm_std_yield.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_itm_upper_yield.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_po_batch_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_unit_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_std_qty1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1Dtl_qty1_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk1Dtl_rsrc_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_unit_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_std_qty2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1Dtl_qty2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk1Dtl_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnWrk1Dtl_not_mrp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_cost_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk1Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2Dtl(MABSP_BomExSrch p){
		p.columnWrk2Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk2Dtl_itm_unit_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk2Dtl_itm_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk2Dtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk2Dtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_lt_add_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_offst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_offst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_offst.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_offst_add_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_def_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk2Dtl_qty1_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk2Dtl_qty2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk2Dtl_dec_place.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_unit_conv_rnd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_unit_conv_rnd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_yield_oper_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_yield_oper_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_inst_grp.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lmt_fr_dt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_lower_yield.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_std_yield.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_upper_yield.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_wip_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2Dtl_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnWrk2Dtl_not_cost_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk2Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3Dtl(MABSP_BomExSrch p){
		p.columnWrk3Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk3Dtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_oper_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_oper_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wk_cost_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wk_cost_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wk_cost_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wk_cost_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_wk_cost_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk3Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk3Dtl_fxd_wk_cost.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wk_cost.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk3Dtl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk3Dtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_itm_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_wk_cost_calc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_not_cost_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk4Dtl(MABSP_BomExSrch p){
		p.columnWrk4Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk4Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk4Dtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_prio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk4Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk5Dtl(MABSP_BomExSrch p){
		p.columnWrk5Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk5Dtl_Itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk5Dtl_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk5Dtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk5Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.Wrk5Dtl_qty1_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk5Dtl_qty2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk5Dtl_gi_schd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk5Dtl_qty3_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk5Dtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_lot_sizing_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln1_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln1_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk5Dtl_inpt_gi_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_inpt_gi_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln2_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk5Dtl_ship_gi_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ship_gi_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln3_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln3_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk5Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk5Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk6Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk6Dtl(MABSP_BomExSrch p){
		p.columnWrk6Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk6Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk6Dtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_insp_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_insp_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk6Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk6Dtl_insp_mtd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_insp_mtd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_insp_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_insp_std_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_unit_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk6Dtl_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk6Dtl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk6Dtl_std_req_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_std_cnf_req_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk6Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk7Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk7Dtl(MABSP_BomExSrch p){
		p.columnWrk7Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk7Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk7Dtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lmt_ctl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_from_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_from_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_to_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_to_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk7Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk7Dtl_no_insp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_insp_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_insp_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_no_mrkt_judg_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_no_plnt_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_no_insp_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lmt_dt_frm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lmt_dt_frm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_vld_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lmt_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lot_insp_vld_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_calc_pd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_calc_pd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_insp_inst_issue_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_insp_inst_issue_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_insp_offst.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_inst_rslt_issue_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_pre_insp_valid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk7Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_BomExSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_base_dt.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_itm_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_PPanel.Itm_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.ENABLE_SRCH);
		p.Cnd_bom_ptn.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bom_ptn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ph_ex_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_max_hrrchy.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_base_qty.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MABSP_BomExSrch p){
		p.RPnl_srch_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_TopDtl(MABSP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MABSP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABSP_BomExSrch p){
		p.Dtl_hrrchy_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.columnDtl_bottom_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_byprod_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_unit_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ph_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ph_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_alloc_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_min_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_max_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_chd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_qty6_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty5_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty3_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty4_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_in_offst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_in_offst.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inst_lot_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_main_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_yield_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_bom.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MABSP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABSP_BomExSrch p){
		p.DtlBtn_srch_dtl.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABSP0040_EX1.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABSP0040_EX2.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtmDtl(MABSP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlTab(MABSP_BomExSrch p){

	}

	/**
	 * [REF]ステータスの[Wrk1Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk1Dtl(MABSP_BomExSrch p){
		p.columnWrk1Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk1Dtl_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk1Dtl_asset_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk1Dtl_unit_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk1Dtl_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk1Dtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk1Dtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk1Dtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk1Dtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk1Dtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_loc_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_loc_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk1Dtl_oper_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_mfg_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_mfg_lt_add_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_lt_add_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_accpt_insp_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_buf_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ord_fix_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_day_week_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_day_week_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_week.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_lot_sz_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_min_lot_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_batch_lot_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_max_lot_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_max_order.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_order_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_yield_schd_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_mfg_inst_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_fxd_rqmt_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_lot_issue_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_lot_issue_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_bkf_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ln_stk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_pre_po_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_inst_rec_issue_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_no_mfg_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_itm_lower_yield.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_itm_std_yield.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_itm_upper_yield.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_po_batch_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_unit_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_std_qty1.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1Dtl_qty1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk1Dtl_rsrc_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_unit_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rsrc_std_qty2.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1Dtl_qty2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk1Dtl_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnWrk1Dtl_not_mrp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_cost_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk1Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2Dtl(MABSP_BomExSrch p){
		p.columnWrk2Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk2Dtl_itm_unit_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk2Dtl_itm_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk2Dtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk2Dtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_lt_add_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_offst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_offst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_offst.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_offst_add_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_def_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk2Dtl_qty1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk2Dtl_qty2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk2Dtl_dec_place.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_unit_conv_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_unit_conv_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_yield_oper_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_yield_oper_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_inst_grp.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lmt_fr_dt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_lower_yield.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_std_yield.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_oper_upper_yield.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_wip_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2Dtl_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnWrk2Dtl_not_cost_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk2Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3Dtl(MABSP_BomExSrch p){
		p.columnWrk3Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk3Dtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_oper_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_oper_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wk_cost_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wk_cost_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wk_cost_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wk_cost_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_wk_cost_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk3Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk3Dtl_fxd_wk_cost.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wk_cost.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk3Dtl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk3Dtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_itm_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_wk_cost_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_not_cost_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk4Dtl(MABSP_BomExSrch p){
		p.columnWrk4Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk4Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk4Dtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk4Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk5Dtl(MABSP_BomExSrch p){
		p.columnWrk5Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk5Dtl_Itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk5Dtl_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk5Dtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk5Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.Wrk5Dtl_qty1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk5Dtl_qty2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk5Dtl_gi_schd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk5Dtl_qty3_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk5Dtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_lot_sizing_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln1_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk5Dtl_inpt_gi_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_inpt_gi_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln2_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk5Dtl_ship_gi_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ship_gi_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln3_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln3_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk5Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk5Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk6Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk6Dtl(MABSP_BomExSrch p){
		p.columnWrk6Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk6Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk6Dtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_insp_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_insp_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk6Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk6Dtl_insp_mtd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_insp_mtd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_insp_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_insp_std_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_unit_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk6Dtl_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk6Dtl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk6Dtl_std_req_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_std_cnf_req_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk6Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk7Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk7Dtl(MABSP_BomExSrch p){
		p.columnWrk7Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk7Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnWrk7Dtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lmt_ctl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_from_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_from_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_to_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_to_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk7Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk7Dtl_no_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_insp_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_insp_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_no_mrkt_judg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_no_plnt_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_no_insp_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lmt_dt_frm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lmt_dt_frm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_vld_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lmt_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lot_insp_vld_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_calc_pd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_calc_pd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_insp_inst_issue_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_insp_inst_issue_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_insp_offst.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_inst_rslt_issue_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_pre_insp_valid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk7Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

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
		MABSP_BomExSrch_MC.setTableConfigDtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.setTableConfigWrk1Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.setTableConfigWrk2Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.setTableConfigWrk3Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.setTableConfigWrk4Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.setTableConfigWrk5Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.setTableConfigWrk6Dtl((MABSP_BomExSrch)this);
		MABSP_BomExSrch_MC.setTableConfigWrk7Dtl((MABSP_BomExSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_BomExSrch p) {
		p.DtlTable.addTable(p.Dtl_hrrchy_p_PPanel.HrrchyTable);
		p.columnDtl_bottom_flg.setMeta(mcframe.clientMABS.MABSP0040.DtlR.bottom_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bottom_flg);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMABS.MABSP0040.DtlR.itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0040.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0040.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.columnDtl_byprod_flg.setMeta(mcframe.clientMABS.MABSP0040.DtlR.byprod_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_byprod_flg);
		p.columnDtl_lot_mng_typ.setMeta(mcframe.clientMABS.MABSP0040.DtlR.lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mng_typ);
		p.columnDtl_sublot_mng_typ.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sublot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mng_typ);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.columnDtl_cont_fctr_flg.setMeta(mcframe.clientMABS.MABSP0040.DtlR.cont_fctr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_flg);
		p.columnDtl_stk_mng_typ.setMeta(mcframe.clientMABS.MABSP0040.DtlR.stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ);
		p.columnDtl_unit_cd.setMeta(mcframe.clientMABS.MABSP0040.DtlR.unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_cd);
		p.columnDtl_dec_place.setMeta(mcframe.clientMABS.MABSP0040.DtlR.dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dec_place);
		p.DtlTable.addTable(p.Dtl_ver_no_p_PPanel.VerNoTable);
		p.columnDtl_bom_ptn.setMeta(mcframe.clientMABS.MABSP0040.DtlR.bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_ptn);
		p.columnDtl_oper_cd.setMeta(mcframe.clientMABS.MABSP0040.DtlR.oper_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_cd);
		p.columnDtl_oper_nm.setMeta(mcframe.clientMABS.MABSP0040.DtlR.oper_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_nm);
		p.columnDtl_oper_seq.setMeta(mcframe.clientMABS.MABSP0040.DtlR.oper_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_seq);
		p.columnDtl_ph_flg.setMeta(mcframe.clientMABS.MABSP0040.DtlR.ph_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ph_flg);
		p.columnDtl_ph_bom_ptn.setMeta(mcframe.clientMABS.MABSP0040.DtlR.ph_bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ph_bom_ptn);
		p.columnDtl_alt_itm_flg.setMeta(mcframe.clientMABS.MABSP0040.DtlR.alt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_flg);
		p.columnDtl_alt_grp_cd.setMeta(mcframe.clientMABS.MABSP0040.DtlR.alt_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_grp_cd);
		p.columnDtl_alt_grp_nm.setMeta(mcframe.clientMABS.MABSP0040.DtlR.alt_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_grp_nm);
		p.columnDtl_alt_itm_typ.setMeta(mcframe.clientMABS.MABSP0040.DtlR.alt_itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_typ);
		p.columnDtl_alt_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.DtlR.alt_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_typ_nm);
		p.columnDtl_alt_itm_ratio.setMeta(mcframe.clientMABS.MABSP0040.DtlR.alt_itm_ratio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_ratio);
		p.columnDtl_alt_alloc_prio.setMeta(mcframe.clientMABS.MABSP0040.DtlR.alt_alloc_prio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_alloc_prio);
		p.columnDtl_sno_typ1.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sno_typ1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ1);
		p.columnDtl_sno_typ_nm1.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sno_typ_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ_nm1);
		p.columnDtl_sno_typ2.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sno_typ2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ2);
		p.columnDtl_sno_typ_nm2.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sno_typ_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ_nm2);
		p.columnDtl_sno_typ3.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sno_typ3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ3);
		p.columnDtl_sno_typ_nm3.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sno_typ_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ_nm3);
		p.columnDtl_sno_typ4.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sno_typ4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ4);
		p.columnDtl_sno_typ_nm4.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sno_typ_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ_nm4);
		p.DtlTable.addTable(p.Dtl_min_sno_p_PPanel.SnoTable);
		p.DtlTable.addTable(p.Dtl_max_sno_p_PPanel.SnoTable);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.columnDtl_chd_unit_cd.setMeta(mcframe.clientMABS.MABSP0040.DtlR.chd_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_unit_cd);
		p.columnDtl_chd_unit_nm.setMeta(mcframe.clientMABS.MABSP0040.DtlR.chd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_unit_nm);
		p.columnDtl_chd_dec_place.setMeta(mcframe.clientMABS.MABSP0040.DtlR.chd_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_dec_place);
		p.DtlTable.addTable(p.Dtl_qty6_p_PPanel.QtyTable);
		p.Dtl_qty6_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_qty5_p_PPanel.QtyTable);
		p.Dtl_qty5_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_qty1_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_qty3_p_PPanel.QtyTable);
		p.Dtl_qty3_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_qty2_p_PPanel.QtyTable);
		p.Dtl_qty2_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_qty4_p_PPanel.QtyTable);
		p.Dtl_qty4_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnDtl_in_offst_typ.setMeta(mcframe.clientMABS.MABSP0040.DtlR.in_offst_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_offst_typ);
		p.columnDtl_in_offst_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.DtlR.in_offst_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_offst_typ_nm);
		p.columnDtl_in_offst.setMeta(mcframe.clientMABS.MABSP0040.DtlR.in_offst_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_offst);
		p.columnDtl_bkf_typ.setMeta(mcframe.clientMABS.MABSP0040.DtlR.bkf_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bkf_typ);
		p.columnDtl_bkf_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.DtlR.bkf_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bkf_typ_nm);
		p.columnDtl_inst_lot_fix_flg.setMeta(mcframe.clientMABS.MABSP0040.DtlR.inst_lot_fix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inst_lot_fix_flg);
		p.columnDtl_lot_mix_flg.setMeta(mcframe.clientMABS.MABSP0040.DtlR.lot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mix_flg);
		p.columnDtl_sublot_mix_flg.setMeta(mcframe.clientMABS.MABSP0040.DtlR.sublot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mix_flg);
		p.columnDtl_alloc_ctl_typ.setMeta(mcframe.clientMABS.MABSP0040.DtlR.alloc_ctl_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_ctl_typ);
		p.columnDtl_alloc_ctl_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.DtlR.alloc_ctl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_ctl_typ_nm);
		p.columnDtl_main_itm_flg.setMeta(mcframe.clientMABS.MABSP0040.DtlR.main_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_main_itm_flg);
		p.columnDtl_yield_calc_flg.setMeta(mcframe.clientMABS.MABSP0040.DtlR.yield_calc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_yield_calc_flg);
		p.columnDtl_inpt_ctl_typ.setMeta(mcframe.clientMABS.MABSP0040.DtlR.inpt_ctl_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_ctl_typ);
		p.columnDtl_inpt_ctl_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.DtlR.inpt_ctl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_ctl_typ_nm);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMABS.MABSP0040.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.columnDtl_chng_no.setMeta(mcframe.clientMABS.MABSP0040.DtlR.chng_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chng_no);
		p.columnDtl_ext_sys_no_bom.setMeta(mcframe.clientMABS.MABSP0040.DtlR.ext_sys_no_bom_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_no_bom);
		p.columnDtl_not_cost_flg.setMeta(mcframe.clientMABS.MABSP0040.DtlR.not_cost_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_cost_flg);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0040.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0040.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_leaf_str);
	}

	/**
	 * [Wrk1Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk1Dtl(MABSP_BomExSrch p) {
		p.columnWrk1Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.del_flg_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_del_flg);
		p.columnWrk1Dtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.wg_cd_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_wg_cd);
		p.columnWrk1Dtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.wg_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_wg_nm);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk1Dtl_stk_mng_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.stk_mng_typ_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_stk_mng_typ);
		p.columnWrk1Dtl_asset_mng_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.asset_mng_typ_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_asset_mng_typ);
		p.columnWrk1Dtl_unit_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.unit_cd_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_unit_cd);
		p.columnWrk1Dtl_dec_place.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.dec_place_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_dec_place);
		p.columnWrk1Dtl_sno1_mng_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.sno1_mng_typ_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sno1_mng_typ);
		p.columnWrk1Dtl_sno2_mng_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.sno2_mng_typ_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sno2_mng_typ);
		p.columnWrk1Dtl_sno3_mng_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.sno3_mng_typ_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sno3_mng_typ);
		p.columnWrk1Dtl_sno4_mng_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.sno4_mng_typ_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sno4_mng_typ);
		p.columnWrk1Dtl_itm_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.itm_typ_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_itm_typ);
		p.columnWrk1Dtl_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.itm_typ_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_itm_typ_nm);
		p.columnWrk1Dtl_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.itm_typ_d_cd_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_itm_typ_d_cd);
		p.columnWrk1Dtl_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.itm_typ_d_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_itm_typ_d_nm);
		p.columnWrk1Dtl_mfg_loc_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.mfg_loc_cd_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_mfg_loc_cd);
		p.columnWrk1Dtl_mfg_loc_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.mfg_loc_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_mfg_loc_nm);
		p.columnWrk1Dtl_site_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.site_cd_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_site_cd);
		p.columnWrk1Dtl_site_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.site_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_site_nm);
		p.columnWrk1Dtl_sppl_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.sppl_cd_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sppl_cd);
		p.columnWrk1Dtl_sppl_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.sppl_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sppl_nm);
		p.columnWrk1Dtl_maker_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.maker_cd_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_maker_cd);
		p.columnWrk1Dtl_maker_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.maker_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_maker_nm);
		p.columnWrk1Dtl_rqst_loc_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rqst_loc_cd_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rqst_loc_cd);
		p.columnWrk1Dtl_rqst_loc_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rqst_loc_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rqst_loc_nm);
		p.columnWrk1Dtl_rqst_loc_wg_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rqst_loc_wg_cd_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rqst_loc_wg_cd);
		p.columnWrk1Dtl_rqst_loc_wg_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rqst_loc_wg_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rqst_loc_wg_nm);
		p.columnWrk1Dtl_bom_ptn.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.bom_ptn_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_bom_ptn);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_dt_p_PPanel.DtTable);
		p.columnWrk1Dtl_oper_ptn.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.oper_ptn_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_oper_ptn);
		p.columnWrk1Dtl_mfg_lt.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.mfg_lt_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_mfg_lt);
		p.columnWrk1Dtl_mfg_lt_add_qty.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.mfg_lt_add_qty_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_mfg_lt_add_qty);
		p.columnWrk1Dtl_purc_lt.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.purc_lt_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_purc_lt);
		p.columnWrk1Dtl_purc_lt_add_qty.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.purc_lt_add_qty_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_purc_lt_add_qty);
		p.columnWrk1Dtl_accpt_insp_lt.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.accpt_insp_lt_META);
		p.columnWrk1Dtl_accpt_insp_lt.setMinusEnable(true);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_accpt_insp_lt);
		p.columnWrk1Dtl_buf_lt.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.buf_lt_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_buf_lt);
		p.columnWrk1Dtl_ord_fix_pd.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.ord_fix_pd_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ord_fix_pd);
		p.columnWrk1Dtl_sz_day_week_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.sz_day_week_typ_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sz_day_week_typ);
		p.columnWrk1Dtl_sz_day_week_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.sz_day_week_typ_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sz_day_week_typ_nm);
		p.columnWrk1Dtl_sz_week.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.sz_week_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sz_week);
		p.columnWrk1Dtl_lot_sz_pd.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.lot_sz_pd_META);
		p.columnWrk1Dtl_lot_sz_pd.setMinusEnable(true);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_lot_sz_pd);
		p.columnWrk1Dtl_min_lot_qty.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.min_lot_qty_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_min_lot_qty);
		p.columnWrk1Dtl_batch_lot_qty.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.batch_lot_qty_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_batch_lot_qty);
		p.columnWrk1Dtl_max_lot_qty.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.max_lot_qty_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_max_lot_qty);
		p.columnWrk1Dtl_max_order.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.max_order_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_max_order);
		p.columnWrk1Dtl_prio.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.prio_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_prio);
		p.columnWrk1Dtl_order_ratio.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.order_ratio_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_order_ratio);
		p.columnWrk1Dtl_yield_schd_qty.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.yield_schd_qty_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_yield_schd_qty);
		p.columnWrk1Dtl_mfg_inst_qty.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.mfg_inst_qty_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_mfg_inst_qty);
		p.columnWrk1Dtl_fxd_rqmt_qty.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.fxd_rqmt_qty_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_fxd_rqmt_qty);
		p.columnWrk1Dtl_lot_issue_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.lot_issue_typ_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_lot_issue_typ);
		p.columnWrk1Dtl_lot_issue_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.lot_issue_typ_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_lot_issue_typ_nm);
		p.columnWrk1Dtl_bkf_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.bkf_flg_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_bkf_flg);
		p.columnWrk1Dtl_ln_stk_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.ln_stk_flg_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ln_stk_flg);
		p.columnWrk1Dtl_pre_po_tgt_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.pre_po_tgt_flg_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_pre_po_tgt_flg);
		p.columnWrk1Dtl_inst_rec_issue_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.inst_rec_issue_flg_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_inst_rec_issue_flg);
		p.columnWrk1Dtl_no_mfg_aprv_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.no_mfg_aprv_flg_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_no_mfg_aprv_flg);
		p.columnWrk1Dtl_itm_lower_yield.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.itm_lower_yield_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_itm_lower_yield);
		p.columnWrk1Dtl_itm_std_yield.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.itm_std_yield_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_itm_std_yield);
		p.columnWrk1Dtl_itm_upper_yield.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.itm_upper_yield_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_itm_upper_yield);
		p.columnWrk1Dtl_purc_id_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.purc_id_typ_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_purc_id_typ);
		p.columnWrk1Dtl_purc_id_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.purc_id_typ_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_purc_id_typ_nm);
		p.columnWrk1Dtl_rqst_wg_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rqst_wg_cd_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rqst_wg_cd);
		p.columnWrk1Dtl_rqst_wg_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rqst_wg_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rqst_wg_nm);
		p.columnWrk1Dtl_po_batch_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.po_batch_flg_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_po_batch_flg);
		p.columnWrk1Dtl_rsrc_cd1.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rsrc_cd1_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rsrc_cd1);
		p.columnWrk1Dtl_rsrc_nm1.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rsrc_nm1_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rsrc_nm1);
		p.columnWrk1Dtl_rsrc_unit_nm1.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rsrc_unit_nm1_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rsrc_unit_nm1);
		p.columnWrk1Dtl_rsrc_std_qty1.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rsrc_std_qty1_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rsrc_std_qty1);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_qty1_p_PPanel.QtyTable);
		p.columnWrk1Dtl_rsrc_cd2.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rsrc_cd2_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rsrc_cd2);
		p.columnWrk1Dtl_rsrc_nm2.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rsrc_nm2_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rsrc_nm2);
		p.columnWrk1Dtl_rsrc_unit_nm2.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rsrc_unit_nm2_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rsrc_unit_nm2);
		p.columnWrk1Dtl_rsrc_std_qty2.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.rsrc_std_qty2_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rsrc_std_qty2);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_qty2_p_PPanel.QtyTable);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_sno_p_PPanel.SnoTable);
		p.columnWrk1Dtl_not_mrp_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.not_mrp_flg_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_not_mrp_flg);
		p.columnWrk1Dtl_cost_ratio.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.cost_ratio_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_cost_ratio);
		p.columnWrk1Dtl_memo1.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.memo1_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_memo1);
		p.columnWrk1Dtl_memo2.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.memo2_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_memo2);
		p.columnWrk1Dtl_memo3.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.memo3_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_memo3);
		p.columnWrk1Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.ins_usr_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_usr_id);
		p.columnWrk1Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.ins_usr_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_usr_nm);
		p.columnWrk1Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.ins_ts_META);
		p.columnWrk1Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_ts);
		p.columnWrk1Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.ins_func_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_func_id);
		p.columnWrk1Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.ins_func_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_func_nm);
		p.columnWrk1Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.upd_cntr_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_cntr);
		p.columnWrk1Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.upd_usr_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_usr_id);
		p.columnWrk1Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.upd_usr_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_usr_nm);
		p.columnWrk1Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.upd_ts_META);
		p.columnWrk1Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_ts);
		p.columnWrk1Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.upd_func_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_func_id);
		p.columnWrk1Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.upd_func_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_func_nm);
		p.columnWrk1Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.upd_srv_req_no_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_srv_req_no);
		p.columnWrk1Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.del_usr_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_del_usr_id);
		p.columnWrk1Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.del_usr_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_del_usr_nm);
		p.columnWrk1Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk1DtlR.del_ts_META);
		p.columnWrk1Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_del_ts);
	}

	/**
	 * [Wrk2Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk2Dtl(MABSP_BomExSrch p) {
		p.columnWrk2Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.del_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_flg);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk2Dtl_itm_unit_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.itm_unit_cd_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_itm_unit_cd);
		p.columnWrk2Dtl_itm_dec_place.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.itm_dec_place_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_itm_dec_place);
		p.columnWrk2Dtl_itm_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.itm_typ_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_itm_typ);
		p.columnWrk2Dtl_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.itm_typ_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_itm_typ_nm);
		p.columnWrk2Dtl_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.itm_typ_d_cd_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_itm_typ_d_cd);
		p.columnWrk2Dtl_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.itm_typ_d_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_itm_typ_d_nm);
		p.columnWrk2Dtl_loc_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.loc_cd_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_loc_cd);
		p.columnWrk2Dtl_loc_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.loc_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_loc_nm);
		p.columnWrk2Dtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.wg_cd_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_wg_cd);
		p.columnWrk2Dtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.wg_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_wg_nm);
		p.columnWrk2Dtl_oper_ptn.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_ptn_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_ptn);
		p.columnWrk2Dtl_oper_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_cd_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_cd);
		p.columnWrk2Dtl_oper_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_nm);
		p.columnWrk2Dtl_oper_seq.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_seq_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_seq);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_dt_p_PPanel.DtTable);
		p.columnWrk2Dtl_disp_seq.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.disp_seq_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_disp_seq);
		p.columnWrk2Dtl_oper_lt.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_lt_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_lt);
		p.columnWrk2Dtl_oper_lt_add_qty.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_lt_add_qty_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_lt_add_qty);
		p.columnWrk2Dtl_oper_offst_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_offst_typ_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_offst_typ);
		p.columnWrk2Dtl_oper_offst_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_offst_typ_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_offst_typ_nm);
		p.columnWrk2Dtl_oper_offst.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_offst_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_offst);
		p.columnWrk2Dtl_oper_offst_add_qty.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_offst_add_qty_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_offst_add_qty);
		p.columnWrk2Dtl_oper_unit_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_unit_cd_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_unit_cd);
		p.columnWrk2Dtl_oper_unit_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_unit_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_unit_nm);
		p.columnWrk2Dtl_def_dec_place.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.def_dec_place_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_def_dec_place);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_qty1_p_PPanel.QtyTable);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_qty2_p_PPanel.QtyTable);
		p.columnWrk2Dtl_dec_place.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.dec_place_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_dec_place);
		p.columnWrk2Dtl_unit_conv_rnd_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.unit_conv_rnd_typ_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_unit_conv_rnd_typ);
		p.columnWrk2Dtl_unit_conv_rnd_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.unit_conv_rnd_typ_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_unit_conv_rnd_typ_nm);
		p.columnWrk2Dtl_yield_oper_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.yield_oper_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_yield_oper_flg);
		p.columnWrk2Dtl_yield_oper_ratio.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.yield_oper_ratio_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_yield_oper_ratio);
		p.columnWrk2Dtl_oper_inst_grp.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_inst_grp_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_inst_grp);
		p.columnWrk2Dtl_oper_loc_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_loc_cd_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_loc_cd);
		p.columnWrk2Dtl_oper_loc_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_loc_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_loc_nm);
		p.columnWrk2Dtl_lmt_fr_dt_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.lmt_fr_dt_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_lmt_fr_dt_flg);
		p.columnWrk2Dtl_oper_lower_yield.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_lower_yield_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_lower_yield);
		p.columnWrk2Dtl_oper_std_yield.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_std_yield_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_std_yield);
		p.columnWrk2Dtl_oper_upper_yield.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.oper_upper_yield_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_oper_upper_yield);
		p.columnWrk2Dtl_wip_rate.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.wip_rate_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_wip_rate);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_sno_p_PPanel.SnoTable);
		p.columnWrk2Dtl_not_cost_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.not_cost_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_not_cost_flg);
		p.columnWrk2Dtl_memo1.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.memo1_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_memo1);
		p.columnWrk2Dtl_memo2.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.memo2_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_memo2);
		p.columnWrk2Dtl_memo3.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.memo3_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_memo3);
		p.columnWrk2Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.ins_usr_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_usr_id);
		p.columnWrk2Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.ins_usr_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_usr_nm);
		p.columnWrk2Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.ins_ts_META);
		p.columnWrk2Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_ts);
		p.columnWrk2Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.ins_func_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_func_id);
		p.columnWrk2Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.ins_func_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_func_nm);
		p.columnWrk2Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.upd_cntr_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_cntr);
		p.columnWrk2Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.upd_usr_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_usr_id);
		p.columnWrk2Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.upd_usr_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_usr_nm);
		p.columnWrk2Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.upd_ts_META);
		p.columnWrk2Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_ts);
		p.columnWrk2Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.upd_func_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_func_id);
		p.columnWrk2Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.upd_func_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_func_nm);
		p.columnWrk2Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.upd_srv_req_no_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_srv_req_no);
		p.columnWrk2Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.del_usr_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_usr_id);
		p.columnWrk2Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.del_usr_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_usr_nm);
		p.columnWrk2Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk2DtlR.del_ts_META);
		p.columnWrk2Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_ts);
	}

	/**
	 * [Wrk3Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk3Dtl(MABSP_BomExSrch p) {
		p.columnWrk3Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.del_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_flg);
		p.Wrk3DtlTable.addTable(p.Wrk3Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk3Dtl_itm_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.itm_typ_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_itm_typ);
		p.columnWrk3Dtl_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.itm_typ_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_itm_typ_nm);
		p.columnWrk3Dtl_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.itm_typ_d_cd_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_itm_typ_d_cd);
		p.columnWrk3Dtl_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.itm_typ_d_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_itm_typ_d_nm);
		p.columnWrk3Dtl_loc_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.loc_cd_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_loc_cd);
		p.columnWrk3Dtl_loc_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.loc_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_loc_nm);
		p.columnWrk3Dtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.wg_cd_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_wg_cd);
		p.columnWrk3Dtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.wg_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_wg_nm);
		p.columnWrk3Dtl_oper_ptn.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.oper_ptn_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_oper_ptn);
		p.columnWrk3Dtl_oper_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.oper_cd_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_oper_cd);
		p.columnWrk3Dtl_oper_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.oper_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_oper_nm);
		p.columnWrk3Dtl_oper_seq.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.oper_seq_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_oper_seq);
		p.columnWrk3Dtl_wk_cost_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.wk_cost_cd_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_wk_cost_cd);
		p.columnWrk3Dtl_wk_cost_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.wk_cost_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_wk_cost_nm);
		p.columnWrk3Dtl_wk_cost_unit_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.wk_cost_unit_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_wk_cost_unit_nm);
		p.columnWrk3Dtl_wk_cost_unit_dec_place.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.wk_cost_unit_dec_place_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_wk_cost_unit_dec_place);
		p.columnWrk3Dtl_wk_cost_unit_rnd_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.wk_cost_unit_rnd_typ_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_wk_cost_unit_rnd_typ);
		p.Wrk3DtlTable.addTable(p.Wrk3Dtl_dt_p_PPanel.DtTable);
		p.columnWrk3Dtl_fxd_wk_cost.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.fxd_wk_cost_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_fxd_wk_cost);
		p.columnWrk3Dtl_wk_cost.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.wk_cost_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_wk_cost);
		p.Wrk3DtlTable.addTable(p.Wrk3Dtl_qty_p_PPanel.QtyTable);
		p.columnWrk3Dtl_base_unit_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.base_unit_cd_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_base_unit_cd);
		p.columnWrk3Dtl_base_unit_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.base_unit_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_base_unit_nm);
		p.columnWrk3Dtl_itm_dec_place.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.itm_dec_place_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_itm_dec_place);
		p.columnWrk3Dtl_wk_cost_calc_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.wk_cost_calc_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_wk_cost_calc_flg);
		p.columnWrk3Dtl_disp_seq.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.disp_seq_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_disp_seq);
		p.columnWrk3Dtl_not_cost_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.not_cost_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_not_cost_flg);
		p.columnWrk3Dtl_memo1.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.memo1_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo1);
		p.columnWrk3Dtl_memo2.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.memo2_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo2);
		p.columnWrk3Dtl_memo3.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.memo3_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo3);
		p.columnWrk3Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.ins_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_usr_id);
		p.columnWrk3Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.ins_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_usr_nm);
		p.columnWrk3Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.ins_ts_META);
		p.columnWrk3Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_ts);
		p.columnWrk3Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.ins_func_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_func_id);
		p.columnWrk3Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.ins_func_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_func_nm);
		p.columnWrk3Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.upd_cntr_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_cntr);
		p.columnWrk3Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.upd_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_usr_id);
		p.columnWrk3Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.upd_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_usr_nm);
		p.columnWrk3Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.upd_ts_META);
		p.columnWrk3Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_ts);
		p.columnWrk3Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.upd_func_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_func_id);
		p.columnWrk3Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.upd_func_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_func_nm);
		p.columnWrk3Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.upd_srv_req_no_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_srv_req_no);
		p.columnWrk3Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.del_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_usr_id);
		p.columnWrk3Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.del_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_usr_nm);
		p.columnWrk3Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk3DtlR.del_ts_META);
		p.columnWrk3Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_ts);
	}

	/**
	 * [Wrk4Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk4Dtl(MABSP_BomExSrch p) {
		p.columnWrk4Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.del_flg_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_flg);
		p.Wrk4DtlTable.addTable(p.Wrk4Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk4Dtl_itm_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.itm_typ_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_itm_typ);
		p.columnWrk4Dtl_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.itm_typ_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_itm_typ_nm);
		p.columnWrk4Dtl_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.itm_typ_d_cd_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_itm_typ_d_cd);
		p.columnWrk4Dtl_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.itm_typ_d_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_itm_typ_d_nm);
		p.columnWrk4Dtl_loc_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.loc_cd_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_loc_cd);
		p.columnWrk4Dtl_loc_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.loc_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_loc_nm);
		p.columnWrk4Dtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.wg_cd_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_wg_cd);
		p.columnWrk4Dtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.wg_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_wg_nm);
		p.columnWrk4Dtl_loc_grp_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.loc_grp_cd_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_loc_grp_cd);
		p.columnWrk4Dtl_loc_grp_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.loc_grp_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_loc_grp_nm);
		p.columnWrk4Dtl_prio.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.prio_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_prio);
		p.columnWrk4Dtl_memo1.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.memo1_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_memo1);
		p.columnWrk4Dtl_memo2.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.memo2_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_memo2);
		p.columnWrk4Dtl_memo3.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.memo3_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_memo3);
		p.columnWrk4Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.ins_usr_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_usr_id);
		p.columnWrk4Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.ins_usr_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_usr_nm);
		p.columnWrk4Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.ins_ts_META);
		p.columnWrk4Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_ts);
		p.columnWrk4Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.ins_func_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_func_id);
		p.columnWrk4Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.ins_func_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_func_nm);
		p.columnWrk4Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.upd_cntr_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_cntr);
		p.columnWrk4Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.upd_usr_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_usr_id);
		p.columnWrk4Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.upd_usr_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_usr_nm);
		p.columnWrk4Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.upd_ts_META);
		p.columnWrk4Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_ts);
		p.columnWrk4Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.upd_func_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_func_id);
		p.columnWrk4Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.upd_func_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_func_nm);
		p.columnWrk4Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.upd_srv_req_no_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_srv_req_no);
		p.columnWrk4Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.del_usr_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_usr_id);
		p.columnWrk4Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.del_usr_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_usr_nm);
		p.columnWrk4Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk4DtlR.del_ts_META);
		p.columnWrk4Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_ts);
	}

	/**
	 * [Wrk5Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk5Dtl(MABSP_BomExSrch p) {
		p.columnWrk5Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.del_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_flg);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_Itm_p_PPanel.ItmTable);
		p.columnWrk5Dtl_dec_place.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.dec_place_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_dec_place);
		p.columnWrk5Dtl_itm_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.itm_typ_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_itm_typ);
		p.columnWrk5Dtl_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.itm_typ_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_itm_typ_nm);
		p.columnWrk5Dtl_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.itm_typ_d_cd_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_itm_typ_d_cd);
		p.columnWrk5Dtl_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.itm_typ_d_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_itm_typ_d_nm);
		p.columnWrk5Dtl_loc_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.loc_cd_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_loc_cd);
		p.columnWrk5Dtl_loc_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.loc_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_loc_nm);
		p.columnWrk5Dtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.wg_cd_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_wg_cd);
		p.columnWrk5Dtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.wg_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_wg_nm);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_dt_p_PPanel.DtTable);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_qty1_p_PPanel.QtyTable);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_qty2_p_PPanel.QtyTable);
		p.columnWrk5Dtl_gi_schd_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.gi_schd_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_gi_schd_flg);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_qty3_p_PPanel.QtyTable);
		p.columnWrk5Dtl_base_unit_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.base_unit_cd_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_base_unit_cd);
		p.columnWrk5Dtl_base_unit_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.base_unit_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_base_unit_nm);
		p.columnWrk5Dtl_lot_sizing_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.lot_sizing_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_lot_sizing_flg);
		p.columnWrk5Dtl_gi_loc_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.gi_loc_cd_META);
		p.columnWrk5Dtl_gi_loc_cd.addLinkBeans(p.columnWrk5Dtl_gi_loc_nm,p.columnWrk5Dtl_gi_str_ln_tgt_flg);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_gi_loc_cd);
		p.columnWrk5Dtl_gi_loc_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.gi_loc_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_gi_loc_nm);
		p.columnWrk5Dtl_gi_str_ln_tgt_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.gi_str_ln_tgt_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_gi_str_ln_tgt_flg);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_str_ln1_p_PPanel.StrLnTable);
		p.columnWrk5Dtl_inpt_gi_loc_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.inpt_gi_loc_cd_META);
		p.columnWrk5Dtl_inpt_gi_loc_cd.addLinkBeans(p.columnWrk5Dtl_inpt_gi_loc_nm,p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_inpt_gi_loc_cd);
		p.columnWrk5Dtl_inpt_gi_loc_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.inpt_gi_loc_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_inpt_gi_loc_nm);
		p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.inpt_gi_str_ln_tgt_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_str_ln2_p_PPanel.StrLnTable);
		p.columnWrk5Dtl_ship_gi_loc_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.ship_gi_loc_cd_META);
		p.columnWrk5Dtl_ship_gi_loc_cd.addLinkBeans(p.columnWrk5Dtl_ship_gi_loc_nm,p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ship_gi_loc_cd);
		p.columnWrk5Dtl_ship_gi_loc_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.ship_gi_loc_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ship_gi_loc_nm);
		p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.ship_gi_str_ln_tgt_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_str_ln3_p_PPanel.StrLnTable);
		p.columnWrk5Dtl_memo1.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.memo1_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_memo1);
		p.columnWrk5Dtl_memo2.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.memo2_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_memo2);
		p.columnWrk5Dtl_memo3.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.memo3_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_memo3);
		p.columnWrk5Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.ins_usr_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_usr_id);
		p.columnWrk5Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.ins_usr_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_usr_nm);
		p.columnWrk5Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.ins_ts_META);
		p.columnWrk5Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_ts);
		p.columnWrk5Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.ins_func_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_func_id);
		p.columnWrk5Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.ins_func_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_func_nm);
		p.columnWrk5Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.upd_cntr_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_cntr);
		p.columnWrk5Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.upd_usr_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_usr_id);
		p.columnWrk5Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.upd_usr_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_usr_nm);
		p.columnWrk5Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.upd_ts_META);
		p.columnWrk5Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_ts);
		p.columnWrk5Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.upd_func_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_func_id);
		p.columnWrk5Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.upd_func_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_func_nm);
		p.columnWrk5Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.upd_srv_req_no_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_srv_req_no);
		p.columnWrk5Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.del_usr_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_usr_id);
		p.columnWrk5Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.del_usr_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_usr_nm);
		p.columnWrk5Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk5DtlR.del_ts_META);
		p.columnWrk5Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_ts);
	}

	/**
	 * [Wrk6Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk6Dtl(MABSP_BomExSrch p) {
		p.columnWrk6Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.del_flg_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_del_flg);
		p.Wrk6DtlTable.addTable(p.Wrk6Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk6Dtl_itm_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.itm_typ_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_itm_typ);
		p.columnWrk6Dtl_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.itm_typ_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_itm_typ_nm);
		p.columnWrk6Dtl_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.itm_typ_d_cd_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_itm_typ_d_cd);
		p.columnWrk6Dtl_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.itm_typ_d_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_itm_typ_d_nm);
		p.columnWrk6Dtl_insp_ptn_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.insp_ptn_cd_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_insp_ptn_cd);
		p.columnWrk6Dtl_insp_ptn_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.insp_ptn_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_insp_ptn_nm);
		p.Wrk6DtlTable.addTable(p.Wrk6Dtl_dt_p_PPanel.DtTable);
		p.columnWrk6Dtl_insp_mtd_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.insp_mtd_typ_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_insp_mtd_typ);
		p.columnWrk6Dtl_insp_mtd_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.insp_mtd_typ_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_insp_mtd_typ_nm);
		p.columnWrk6Dtl_insp_lt.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.insp_lt_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_insp_lt);
		p.columnWrk6Dtl_insp_std_no.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.insp_std_no_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_insp_std_no);
		p.columnWrk6Dtl_unit_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.unit_cd_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_unit_cd);
		p.columnWrk6Dtl_dec_place.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.dec_place_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_dec_place);
		p.Wrk6DtlTable.addTable(p.Wrk6Dtl_qty_p_PPanel.QtyTable);
		p.columnWrk6Dtl_std_req_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.std_req_flg_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_std_req_flg);
		p.columnWrk6Dtl_std_cnf_req_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.std_cnf_req_flg_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_std_cnf_req_flg);
		p.columnWrk6Dtl_memo1.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.memo1_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_memo1);
		p.columnWrk6Dtl_memo2.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.memo2_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_memo2);
		p.columnWrk6Dtl_memo3.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.memo3_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_memo3);
		p.columnWrk6Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.ins_usr_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_usr_id);
		p.columnWrk6Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.ins_usr_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_usr_nm);
		p.columnWrk6Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.ins_ts_META);
		p.columnWrk6Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_ts);
		p.columnWrk6Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.ins_func_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_func_id);
		p.columnWrk6Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.ins_func_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_func_nm);
		p.columnWrk6Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.upd_cntr_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_cntr);
		p.columnWrk6Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.upd_usr_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_usr_id);
		p.columnWrk6Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.upd_usr_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_usr_nm);
		p.columnWrk6Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.upd_ts_META);
		p.columnWrk6Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_ts);
		p.columnWrk6Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.upd_func_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_func_id);
		p.columnWrk6Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.upd_func_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_func_nm);
		p.columnWrk6Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.upd_srv_req_no_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_srv_req_no);
		p.columnWrk6Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.del_usr_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_del_usr_id);
		p.columnWrk6Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.del_usr_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_del_usr_nm);
		p.columnWrk6Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk6DtlR.del_ts_META);
		p.columnWrk6Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_del_ts);
	}

	/**
	 * [Wrk7Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk7Dtl(MABSP_BomExSrch p) {
		p.columnWrk7Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.del_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_del_flg);
		p.Wrk7DtlTable.addTable(p.Wrk7Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk7Dtl_itm_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.itm_typ_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_itm_typ);
		p.columnWrk7Dtl_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.itm_typ_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_itm_typ_nm);
		p.columnWrk7Dtl_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.itm_typ_d_cd_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_itm_typ_d_cd);
		p.columnWrk7Dtl_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.itm_typ_d_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_itm_typ_d_nm);
		p.columnWrk7Dtl_lmt_ctl_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.lmt_ctl_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_lmt_ctl_flg);
		p.columnWrk7Dtl_mfg_loc_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.mfg_loc_cd_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_mfg_loc_cd);
		p.columnWrk7Dtl_mfg_loc_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.mfg_loc_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_mfg_loc_nm);
		p.columnWrk7Dtl_sppl_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.sppl_cd_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_sppl_cd);
		p.columnWrk7Dtl_sppl_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.sppl_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_sppl_nm);
		p.columnWrk7Dtl_maker_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.maker_cd_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_maker_cd);
		p.columnWrk7Dtl_maker_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.maker_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_maker_nm);
		p.columnWrk7Dtl_from_site_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.from_site_cd_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_from_site_cd);
		p.columnWrk7Dtl_from_site_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.from_site_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_from_site_nm);
		p.columnWrk7Dtl_to_site_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.to_site_cd_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_to_site_cd);
		p.columnWrk7Dtl_to_site_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.to_site_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_to_site_nm);
		p.Wrk7DtlTable.addTable(p.Wrk7Dtl_dt_p_PPanel.DtTable);
		p.columnWrk7Dtl_no_insp_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.no_insp_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_no_insp_flg);
		p.columnWrk7Dtl_insp_ptn_cd.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.insp_ptn_cd_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_insp_ptn_cd);
		p.columnWrk7Dtl_insp_ptn_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.insp_ptn_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_insp_ptn_nm);
		p.columnWrk7Dtl_no_mrkt_judg_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.no_mrkt_judg_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_no_mrkt_judg_flg);
		p.columnWrk7Dtl_no_plnt_aprv_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.no_plnt_aprv_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_no_plnt_aprv_flg);
		p.columnWrk7Dtl_no_insp_aprv_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.no_insp_aprv_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_no_insp_aprv_flg);
		p.columnWrk7Dtl_lmt_dt_frm_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.lmt_dt_frm_typ_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_lmt_dt_frm_typ);
		p.columnWrk7Dtl_lmt_dt_frm_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.lmt_dt_frm_typ_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_lmt_dt_frm_typ_nm);
		p.columnWrk7Dtl_vld_pd.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.vld_pd_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_vld_pd);
		p.columnWrk7Dtl_lmt_pd.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.lmt_pd_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_lmt_pd);
		p.columnWrk7Dtl_lot_insp_vld_pd.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.lot_insp_vld_pd_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_lot_insp_vld_pd);
		p.columnWrk7Dtl_calc_pd_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.calc_pd_typ_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_calc_pd_typ);
		p.columnWrk7Dtl_calc_pd_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.calc_pd_typ_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_calc_pd_typ_nm);
		p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.lot_insp_lmt_dt_frm_typ_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ);
		p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.lot_insp_lmt_dt_frm_typ_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm);
		p.columnWrk7Dtl_insp_inst_issue_typ.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.insp_inst_issue_typ_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_insp_inst_issue_typ);
		p.columnWrk7Dtl_insp_inst_issue_typ_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.insp_inst_issue_typ_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_insp_inst_issue_typ_nm);
		p.columnWrk7Dtl_insp_offst.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.insp_offst_META);
		p.columnWrk7Dtl_insp_offst.setMinusEnable(true);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_insp_offst);
		p.columnWrk7Dtl_inst_rslt_issue_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.inst_rslt_issue_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_inst_rslt_issue_flg);
		p.columnWrk7Dtl_pre_insp_valid_flg.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.pre_insp_valid_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_pre_insp_valid_flg);
		p.columnWrk7Dtl_memo1.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.memo1_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_memo1);
		p.columnWrk7Dtl_memo2.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.memo2_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_memo2);
		p.columnWrk7Dtl_memo3.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.memo3_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_memo3);
		p.columnWrk7Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.ins_usr_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_usr_id);
		p.columnWrk7Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.ins_usr_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_usr_nm);
		p.columnWrk7Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.ins_ts_META);
		p.columnWrk7Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_ts);
		p.columnWrk7Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.ins_func_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_func_id);
		p.columnWrk7Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.ins_func_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_func_nm);
		p.columnWrk7Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.upd_cntr_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_cntr);
		p.columnWrk7Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.upd_usr_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_usr_id);
		p.columnWrk7Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.upd_usr_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_usr_nm);
		p.columnWrk7Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.upd_ts_META);
		p.columnWrk7Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_ts);
		p.columnWrk7Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.upd_func_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_func_id);
		p.columnWrk7Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.upd_func_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_func_nm);
		p.columnWrk7Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.upd_srv_req_no_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_srv_req_no);
		p.columnWrk7Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.del_usr_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_del_usr_id);
		p.columnWrk7Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.del_usr_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_del_usr_nm);
		p.columnWrk7Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP0040.Wrk7DtlR.del_ts_META);
		p.columnWrk7Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_del_ts);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_itm_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bom_ptn.getListConfig().setPutter(getCnd_bom_ptn_ListPutter());
		columnDtl_ph_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ph_bom_ptn.getListConfig().setPutter(getDtl_ph_bom_ptn_ListPutter());
		columnDtl_alt_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alt_grp_cd.getListConfig().setPutter(getDtl_alt_grp_cd_ListPutter());
		columnDtl_alt_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alt_itm_typ.getListConfig().setPutter(getDtl_alt_itm_typ_ListPutter());
		columnDtl_sno_typ1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno_typ1.getListConfig().setPutter(getDtl_sno_typ1_ListPutter());
		columnDtl_sno_typ2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno_typ2.getListConfig().setPutter(getDtl_sno_typ2_ListPutter());
		columnDtl_sno_typ3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno_typ3.getListConfig().setPutter(getDtl_sno_typ3_ListPutter());
		columnDtl_sno_typ4.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno_typ4.getListConfig().setPutter(getDtl_sno_typ4_ListPutter());
		columnDtl_in_offst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_in_offst_typ.getListConfig().setPutter(getDtl_in_offst_typ_ListPutter());
		columnDtl_bkf_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bkf_typ.getListConfig().setPutter(getDtl_bkf_typ_ListPutter());
		columnDtl_alloc_ctl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alloc_ctl_typ.getListConfig().setPutter(getDtl_alloc_ctl_typ_ListPutter());
		columnDtl_inpt_ctl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_inpt_ctl_typ.getListConfig().setPutter(getDtl_inpt_ctl_typ_ListPutter());
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
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_itm_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_itm_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_itm_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BomPtnParChd");
		return lp;
	}
	 
	/**
	 * [Dtl_ph_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ph_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_alt_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alt_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_alt_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alt_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_sno_typ1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno_typ1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_sno_typ2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno_typ2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_sno_typ3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno_typ3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_sno_typ4_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno_typ4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_in_offst_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_in_offst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_bkf_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bkf_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_alloc_ctl_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alloc_ctl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_inpt_ctl_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_inpt_ctl_typ_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_itm_PPanel.Itm_itm_cd) return getCnd_itm_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_PPanel.Itm_itm_sub1) return getCnd_itm_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_PPanel.Itm_itm_sub2) return getCnd_itm_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_PPanel.Itm_itm_sub3) return getCnd_itm_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_bom_ptn) return getCnd_bom_ptn(row, info);
		if(combo == columnDtl_ph_bom_ptn) return getDtl_ph_bom_ptn(row, info);
		if(combo == columnDtl_alt_grp_cd) return getDtl_alt_grp_cd(row, info);
		if(combo == columnDtl_alt_itm_typ) return getDtl_alt_itm_typ(row, info);
		if(combo == columnDtl_sno_typ1) return getDtl_sno_typ1(row, info);
		if(combo == columnDtl_sno_typ2) return getDtl_sno_typ2(row, info);
		if(combo == columnDtl_sno_typ3) return getDtl_sno_typ3(row, info);
		if(combo == columnDtl_sno_typ4) return getDtl_sno_typ4(row, info);
		if(combo == columnDtl_in_offst_typ) return getDtl_in_offst_typ(row, info);
		if(combo == columnDtl_bkf_typ) return getDtl_bkf_typ(row, info);
		if(combo == columnDtl_alloc_ctl_typ) return getDtl_alloc_ctl_typ(row, info);
		if(combo == columnDtl_inpt_ctl_typ) return getDtl_inpt_ctl_typ(row, info);
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
		else if (ap == DtlBtn_srch_dtl) doDtlBtn_srch_dtl(info);
		else if (ap == DtlBtn_open_MABSP0040_EX1) doDtlBtn_open_MABSP0040_EX1(info);
		else if (ap == DtlBtn_open_MABSP0040_EX2) doDtlBtn_open_MABSP0040_EX2(info);
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
	 * [DtlBtn]パネルの[srch_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_srch_dtl(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABSP0040_EX1]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABSP0040_EX1(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABSP0040_EX2]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABSP0040_EX2(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == DtlTabTab) return doDtlTab_VC(info);
		if (vc == Wrk1DtlTable) return doWrk1Dtl_VC(info);
		if (vc == Wrk2DtlTable) return doWrk2Dtl_VC(info);
		if (vc == Wrk3DtlTable) return doWrk3Dtl_VC(info);
		if (vc == Wrk4DtlTable) return doWrk4Dtl_VC(info);
		if (vc == Wrk5DtlTable) return doWrk5Dtl_VC(info);
		if (vc == Wrk6DtlTable) return doWrk6Dtl_VC(info);
		if (vc == Wrk7DtlTable) return doWrk7Dtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_base_dt) return doCnd_base_dt_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_sno1_mng_typ) return doCnd_sno1_mng_typ_VC(info);
		if (vc == Cnd_sno2_mng_typ) return doCnd_sno2_mng_typ_VC(info);
		if (vc == Cnd_sno3_mng_typ) return doCnd_sno3_mng_typ_VC(info);
		if (vc == Cnd_sno4_mng_typ) return doCnd_sno4_mng_typ_VC(info);
		if (vc == Cnd_bom_ptn) return doCnd_bom_ptn_VC(info);
		if (vc == Cnd_bom_ptn_flg) return doCnd_bom_ptn_flg_VC(info);
		if (vc == Cnd_ph_ex_flg) return doCnd_ph_ex_flg_VC(info);
		if (vc == Cnd_max_hrrchy) return doCnd_max_hrrchy_VC(info);
		if (vc == Cnd_base_qty) return doCnd_base_qty_VC(info);
		if (vc == columnDtl_bottom_flg) return doDtl_bottom_flg_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_byprod_flg) return doDtl_byprod_flg_VC(info);
		if (vc == columnDtl_lot_mng_typ) return doDtl_lot_mng_typ_VC(info);
		if (vc == columnDtl_sublot_mng_typ) return doDtl_sublot_mng_typ_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_cont_fctr_flg) return doDtl_cont_fctr_flg_VC(info);
		if (vc == columnDtl_stk_mng_typ) return doDtl_stk_mng_typ_VC(info);
		if (vc == columnDtl_unit_cd) return doDtl_unit_cd_VC(info);
		if (vc == columnDtl_dec_place) return doDtl_dec_place_VC(info);
		if (vc == columnDtl_bom_ptn) return doDtl_bom_ptn_VC(info);
		if (vc == columnDtl_oper_cd) return doDtl_oper_cd_VC(info);
		if (vc == columnDtl_oper_nm) return doDtl_oper_nm_VC(info);
		if (vc == columnDtl_oper_seq) return doDtl_oper_seq_VC(info);
		if (vc == columnDtl_ph_flg) return doDtl_ph_flg_VC(info);
		if (vc == columnDtl_ph_bom_ptn) return doDtl_ph_bom_ptn_VC(info);
		if (vc == columnDtl_alt_itm_flg) return doDtl_alt_itm_flg_VC(info);
		if (vc == columnDtl_alt_grp_cd) return doDtl_alt_grp_cd_VC(info);
		if (vc == columnDtl_alt_grp_nm) return doDtl_alt_grp_nm_VC(info);
		if (vc == columnDtl_alt_itm_typ) return doDtl_alt_itm_typ_VC(info);
		if (vc == columnDtl_alt_itm_typ_nm) return doDtl_alt_itm_typ_nm_VC(info);
		if (vc == columnDtl_alt_itm_ratio) return doDtl_alt_itm_ratio_VC(info);
		if (vc == columnDtl_alt_alloc_prio) return doDtl_alt_alloc_prio_VC(info);
		if (vc == columnDtl_sno_typ1) return doDtl_sno_typ1_VC(info);
		if (vc == columnDtl_sno_typ_nm1) return doDtl_sno_typ_nm1_VC(info);
		if (vc == columnDtl_sno_typ2) return doDtl_sno_typ2_VC(info);
		if (vc == columnDtl_sno_typ_nm2) return doDtl_sno_typ_nm2_VC(info);
		if (vc == columnDtl_sno_typ3) return doDtl_sno_typ3_VC(info);
		if (vc == columnDtl_sno_typ_nm3) return doDtl_sno_typ_nm3_VC(info);
		if (vc == columnDtl_sno_typ4) return doDtl_sno_typ4_VC(info);
		if (vc == columnDtl_sno_typ_nm4) return doDtl_sno_typ_nm4_VC(info);
		if (vc == columnDtl_chd_unit_cd) return doDtl_chd_unit_cd_VC(info);
		if (vc == columnDtl_chd_unit_nm) return doDtl_chd_unit_nm_VC(info);
		if (vc == columnDtl_chd_dec_place) return doDtl_chd_dec_place_VC(info);
		if (vc == columnDtl_in_offst_typ) return doDtl_in_offst_typ_VC(info);
		if (vc == columnDtl_in_offst_typ_nm) return doDtl_in_offst_typ_nm_VC(info);
		if (vc == columnDtl_in_offst) return doDtl_in_offst_VC(info);
		if (vc == columnDtl_bkf_typ) return doDtl_bkf_typ_VC(info);
		if (vc == columnDtl_bkf_typ_nm) return doDtl_bkf_typ_nm_VC(info);
		if (vc == columnDtl_inst_lot_fix_flg) return doDtl_inst_lot_fix_flg_VC(info);
		if (vc == columnDtl_lot_mix_flg) return doDtl_lot_mix_flg_VC(info);
		if (vc == columnDtl_sublot_mix_flg) return doDtl_sublot_mix_flg_VC(info);
		if (vc == columnDtl_alloc_ctl_typ) return doDtl_alloc_ctl_typ_VC(info);
		if (vc == columnDtl_alloc_ctl_typ_nm) return doDtl_alloc_ctl_typ_nm_VC(info);
		if (vc == columnDtl_main_itm_flg) return doDtl_main_itm_flg_VC(info);
		if (vc == columnDtl_yield_calc_flg) return doDtl_yield_calc_flg_VC(info);
		if (vc == columnDtl_inpt_ctl_typ) return doDtl_inpt_ctl_typ_VC(info);
		if (vc == columnDtl_inpt_ctl_typ_nm) return doDtl_inpt_ctl_typ_nm_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_chng_no) return doDtl_chng_no_VC(info);
		if (vc == columnDtl_ext_sys_no_bom) return doDtl_ext_sys_no_bom_VC(info);
		if (vc == columnDtl_not_cost_flg) return doDtl_not_cost_flg_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnWrk1Dtl_del_flg) return doWrk1Dtl_del_flg_VC(info);
		if (vc == columnWrk1Dtl_wg_cd) return doWrk1Dtl_wg_cd_VC(info);
		if (vc == columnWrk1Dtl_wg_nm) return doWrk1Dtl_wg_nm_VC(info);
		if (vc == columnWrk1Dtl_stk_mng_typ) return doWrk1Dtl_stk_mng_typ_VC(info);
		if (vc == columnWrk1Dtl_asset_mng_typ) return doWrk1Dtl_asset_mng_typ_VC(info);
		if (vc == columnWrk1Dtl_unit_cd) return doWrk1Dtl_unit_cd_VC(info);
		if (vc == columnWrk1Dtl_dec_place) return doWrk1Dtl_dec_place_VC(info);
		if (vc == columnWrk1Dtl_sno1_mng_typ) return doWrk1Dtl_sno1_mng_typ_VC(info);
		if (vc == columnWrk1Dtl_sno2_mng_typ) return doWrk1Dtl_sno2_mng_typ_VC(info);
		if (vc == columnWrk1Dtl_sno3_mng_typ) return doWrk1Dtl_sno3_mng_typ_VC(info);
		if (vc == columnWrk1Dtl_sno4_mng_typ) return doWrk1Dtl_sno4_mng_typ_VC(info);
		if (vc == columnWrk1Dtl_itm_typ) return doWrk1Dtl_itm_typ_VC(info);
		if (vc == columnWrk1Dtl_itm_typ_nm) return doWrk1Dtl_itm_typ_nm_VC(info);
		if (vc == columnWrk1Dtl_itm_typ_d_cd) return doWrk1Dtl_itm_typ_d_cd_VC(info);
		if (vc == columnWrk1Dtl_itm_typ_d_nm) return doWrk1Dtl_itm_typ_d_nm_VC(info);
		if (vc == columnWrk1Dtl_mfg_loc_cd) return doWrk1Dtl_mfg_loc_cd_VC(info);
		if (vc == columnWrk1Dtl_mfg_loc_nm) return doWrk1Dtl_mfg_loc_nm_VC(info);
		if (vc == columnWrk1Dtl_site_cd) return doWrk1Dtl_site_cd_VC(info);
		if (vc == columnWrk1Dtl_site_nm) return doWrk1Dtl_site_nm_VC(info);
		if (vc == columnWrk1Dtl_sppl_cd) return doWrk1Dtl_sppl_cd_VC(info);
		if (vc == columnWrk1Dtl_sppl_nm) return doWrk1Dtl_sppl_nm_VC(info);
		if (vc == columnWrk1Dtl_maker_cd) return doWrk1Dtl_maker_cd_VC(info);
		if (vc == columnWrk1Dtl_maker_nm) return doWrk1Dtl_maker_nm_VC(info);
		if (vc == columnWrk1Dtl_rqst_loc_cd) return doWrk1Dtl_rqst_loc_cd_VC(info);
		if (vc == columnWrk1Dtl_rqst_loc_nm) return doWrk1Dtl_rqst_loc_nm_VC(info);
		if (vc == columnWrk1Dtl_rqst_loc_wg_cd) return doWrk1Dtl_rqst_loc_wg_cd_VC(info);
		if (vc == columnWrk1Dtl_rqst_loc_wg_nm) return doWrk1Dtl_rqst_loc_wg_nm_VC(info);
		if (vc == columnWrk1Dtl_bom_ptn) return doWrk1Dtl_bom_ptn_VC(info);
		if (vc == columnWrk1Dtl_oper_ptn) return doWrk1Dtl_oper_ptn_VC(info);
		if (vc == columnWrk1Dtl_mfg_lt) return doWrk1Dtl_mfg_lt_VC(info);
		if (vc == columnWrk1Dtl_mfg_lt_add_qty) return doWrk1Dtl_mfg_lt_add_qty_VC(info);
		if (vc == columnWrk1Dtl_purc_lt) return doWrk1Dtl_purc_lt_VC(info);
		if (vc == columnWrk1Dtl_purc_lt_add_qty) return doWrk1Dtl_purc_lt_add_qty_VC(info);
		if (vc == columnWrk1Dtl_accpt_insp_lt) return doWrk1Dtl_accpt_insp_lt_VC(info);
		if (vc == columnWrk1Dtl_buf_lt) return doWrk1Dtl_buf_lt_VC(info);
		if (vc == columnWrk1Dtl_ord_fix_pd) return doWrk1Dtl_ord_fix_pd_VC(info);
		if (vc == columnWrk1Dtl_sz_day_week_typ) return doWrk1Dtl_sz_day_week_typ_VC(info);
		if (vc == columnWrk1Dtl_sz_day_week_typ_nm) return doWrk1Dtl_sz_day_week_typ_nm_VC(info);
		if (vc == columnWrk1Dtl_sz_week) return doWrk1Dtl_sz_week_VC(info);
		if (vc == columnWrk1Dtl_lot_sz_pd) return doWrk1Dtl_lot_sz_pd_VC(info);
		if (vc == columnWrk1Dtl_min_lot_qty) return doWrk1Dtl_min_lot_qty_VC(info);
		if (vc == columnWrk1Dtl_batch_lot_qty) return doWrk1Dtl_batch_lot_qty_VC(info);
		if (vc == columnWrk1Dtl_max_lot_qty) return doWrk1Dtl_max_lot_qty_VC(info);
		if (vc == columnWrk1Dtl_max_order) return doWrk1Dtl_max_order_VC(info);
		if (vc == columnWrk1Dtl_prio) return doWrk1Dtl_prio_VC(info);
		if (vc == columnWrk1Dtl_order_ratio) return doWrk1Dtl_order_ratio_VC(info);
		if (vc == columnWrk1Dtl_yield_schd_qty) return doWrk1Dtl_yield_schd_qty_VC(info);
		if (vc == columnWrk1Dtl_mfg_inst_qty) return doWrk1Dtl_mfg_inst_qty_VC(info);
		if (vc == columnWrk1Dtl_fxd_rqmt_qty) return doWrk1Dtl_fxd_rqmt_qty_VC(info);
		if (vc == columnWrk1Dtl_lot_issue_typ) return doWrk1Dtl_lot_issue_typ_VC(info);
		if (vc == columnWrk1Dtl_lot_issue_typ_nm) return doWrk1Dtl_lot_issue_typ_nm_VC(info);
		if (vc == columnWrk1Dtl_bkf_flg) return doWrk1Dtl_bkf_flg_VC(info);
		if (vc == columnWrk1Dtl_ln_stk_flg) return doWrk1Dtl_ln_stk_flg_VC(info);
		if (vc == columnWrk1Dtl_pre_po_tgt_flg) return doWrk1Dtl_pre_po_tgt_flg_VC(info);
		if (vc == columnWrk1Dtl_inst_rec_issue_flg) return doWrk1Dtl_inst_rec_issue_flg_VC(info);
		if (vc == columnWrk1Dtl_no_mfg_aprv_flg) return doWrk1Dtl_no_mfg_aprv_flg_VC(info);
		if (vc == columnWrk1Dtl_itm_lower_yield) return doWrk1Dtl_itm_lower_yield_VC(info);
		if (vc == columnWrk1Dtl_itm_std_yield) return doWrk1Dtl_itm_std_yield_VC(info);
		if (vc == columnWrk1Dtl_itm_upper_yield) return doWrk1Dtl_itm_upper_yield_VC(info);
		if (vc == columnWrk1Dtl_purc_id_typ) return doWrk1Dtl_purc_id_typ_VC(info);
		if (vc == columnWrk1Dtl_purc_id_typ_nm) return doWrk1Dtl_purc_id_typ_nm_VC(info);
		if (vc == columnWrk1Dtl_rqst_wg_cd) return doWrk1Dtl_rqst_wg_cd_VC(info);
		if (vc == columnWrk1Dtl_rqst_wg_nm) return doWrk1Dtl_rqst_wg_nm_VC(info);
		if (vc == columnWrk1Dtl_po_batch_flg) return doWrk1Dtl_po_batch_flg_VC(info);
		if (vc == columnWrk1Dtl_rsrc_cd1) return doWrk1Dtl_rsrc_cd1_VC(info);
		if (vc == columnWrk1Dtl_rsrc_nm1) return doWrk1Dtl_rsrc_nm1_VC(info);
		if (vc == columnWrk1Dtl_rsrc_unit_nm1) return doWrk1Dtl_rsrc_unit_nm1_VC(info);
		if (vc == columnWrk1Dtl_rsrc_std_qty1) return doWrk1Dtl_rsrc_std_qty1_VC(info);
		if (vc == columnWrk1Dtl_rsrc_cd2) return doWrk1Dtl_rsrc_cd2_VC(info);
		if (vc == columnWrk1Dtl_rsrc_nm2) return doWrk1Dtl_rsrc_nm2_VC(info);
		if (vc == columnWrk1Dtl_rsrc_unit_nm2) return doWrk1Dtl_rsrc_unit_nm2_VC(info);
		if (vc == columnWrk1Dtl_rsrc_std_qty2) return doWrk1Dtl_rsrc_std_qty2_VC(info);
		if (vc == columnWrk1Dtl_not_mrp_flg) return doWrk1Dtl_not_mrp_flg_VC(info);
		if (vc == columnWrk1Dtl_cost_ratio) return doWrk1Dtl_cost_ratio_VC(info);
		if (vc == columnWrk1Dtl_memo1) return doWrk1Dtl_memo1_VC(info);
		if (vc == columnWrk1Dtl_memo2) return doWrk1Dtl_memo2_VC(info);
		if (vc == columnWrk1Dtl_memo3) return doWrk1Dtl_memo3_VC(info);
		if (vc == columnWrk1Dtl_ins_usr_id) return doWrk1Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk1Dtl_ins_usr_nm) return doWrk1Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk1Dtl_ins_ts) return doWrk1Dtl_ins_ts_VC(info);
		if (vc == columnWrk1Dtl_ins_func_id) return doWrk1Dtl_ins_func_id_VC(info);
		if (vc == columnWrk1Dtl_ins_func_nm) return doWrk1Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk1Dtl_upd_cntr) return doWrk1Dtl_upd_cntr_VC(info);
		if (vc == columnWrk1Dtl_upd_usr_id) return doWrk1Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk1Dtl_upd_usr_nm) return doWrk1Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk1Dtl_upd_ts) return doWrk1Dtl_upd_ts_VC(info);
		if (vc == columnWrk1Dtl_upd_func_id) return doWrk1Dtl_upd_func_id_VC(info);
		if (vc == columnWrk1Dtl_upd_func_nm) return doWrk1Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk1Dtl_upd_srv_req_no) return doWrk1Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk1Dtl_del_usr_id) return doWrk1Dtl_del_usr_id_VC(info);
		if (vc == columnWrk1Dtl_del_usr_nm) return doWrk1Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk1Dtl_del_ts) return doWrk1Dtl_del_ts_VC(info);
		if (vc == columnWrk2Dtl_del_flg) return doWrk2Dtl_del_flg_VC(info);
		if (vc == columnWrk2Dtl_itm_unit_cd) return doWrk2Dtl_itm_unit_cd_VC(info);
		if (vc == columnWrk2Dtl_itm_dec_place) return doWrk2Dtl_itm_dec_place_VC(info);
		if (vc == columnWrk2Dtl_itm_typ) return doWrk2Dtl_itm_typ_VC(info);
		if (vc == columnWrk2Dtl_itm_typ_nm) return doWrk2Dtl_itm_typ_nm_VC(info);
		if (vc == columnWrk2Dtl_itm_typ_d_cd) return doWrk2Dtl_itm_typ_d_cd_VC(info);
		if (vc == columnWrk2Dtl_itm_typ_d_nm) return doWrk2Dtl_itm_typ_d_nm_VC(info);
		if (vc == columnWrk2Dtl_loc_cd) return doWrk2Dtl_loc_cd_VC(info);
		if (vc == columnWrk2Dtl_loc_nm) return doWrk2Dtl_loc_nm_VC(info);
		if (vc == columnWrk2Dtl_wg_cd) return doWrk2Dtl_wg_cd_VC(info);
		if (vc == columnWrk2Dtl_wg_nm) return doWrk2Dtl_wg_nm_VC(info);
		if (vc == columnWrk2Dtl_oper_ptn) return doWrk2Dtl_oper_ptn_VC(info);
		if (vc == columnWrk2Dtl_oper_cd) return doWrk2Dtl_oper_cd_VC(info);
		if (vc == columnWrk2Dtl_oper_nm) return doWrk2Dtl_oper_nm_VC(info);
		if (vc == columnWrk2Dtl_oper_seq) return doWrk2Dtl_oper_seq_VC(info);
		if (vc == columnWrk2Dtl_disp_seq) return doWrk2Dtl_disp_seq_VC(info);
		if (vc == columnWrk2Dtl_oper_lt) return doWrk2Dtl_oper_lt_VC(info);
		if (vc == columnWrk2Dtl_oper_lt_add_qty) return doWrk2Dtl_oper_lt_add_qty_VC(info);
		if (vc == columnWrk2Dtl_oper_offst_typ) return doWrk2Dtl_oper_offst_typ_VC(info);
		if (vc == columnWrk2Dtl_oper_offst_typ_nm) return doWrk2Dtl_oper_offst_typ_nm_VC(info);
		if (vc == columnWrk2Dtl_oper_offst) return doWrk2Dtl_oper_offst_VC(info);
		if (vc == columnWrk2Dtl_oper_offst_add_qty) return doWrk2Dtl_oper_offst_add_qty_VC(info);
		if (vc == columnWrk2Dtl_oper_unit_cd) return doWrk2Dtl_oper_unit_cd_VC(info);
		if (vc == columnWrk2Dtl_oper_unit_nm) return doWrk2Dtl_oper_unit_nm_VC(info);
		if (vc == columnWrk2Dtl_def_dec_place) return doWrk2Dtl_def_dec_place_VC(info);
		if (vc == columnWrk2Dtl_dec_place) return doWrk2Dtl_dec_place_VC(info);
		if (vc == columnWrk2Dtl_unit_conv_rnd_typ) return doWrk2Dtl_unit_conv_rnd_typ_VC(info);
		if (vc == columnWrk2Dtl_unit_conv_rnd_typ_nm) return doWrk2Dtl_unit_conv_rnd_typ_nm_VC(info);
		if (vc == columnWrk2Dtl_yield_oper_flg) return doWrk2Dtl_yield_oper_flg_VC(info);
		if (vc == columnWrk2Dtl_yield_oper_ratio) return doWrk2Dtl_yield_oper_ratio_VC(info);
		if (vc == columnWrk2Dtl_oper_inst_grp) return doWrk2Dtl_oper_inst_grp_VC(info);
		if (vc == columnWrk2Dtl_oper_loc_cd) return doWrk2Dtl_oper_loc_cd_VC(info);
		if (vc == columnWrk2Dtl_oper_loc_nm) return doWrk2Dtl_oper_loc_nm_VC(info);
		if (vc == columnWrk2Dtl_lmt_fr_dt_flg) return doWrk2Dtl_lmt_fr_dt_flg_VC(info);
		if (vc == columnWrk2Dtl_oper_lower_yield) return doWrk2Dtl_oper_lower_yield_VC(info);
		if (vc == columnWrk2Dtl_oper_std_yield) return doWrk2Dtl_oper_std_yield_VC(info);
		if (vc == columnWrk2Dtl_oper_upper_yield) return doWrk2Dtl_oper_upper_yield_VC(info);
		if (vc == columnWrk2Dtl_wip_rate) return doWrk2Dtl_wip_rate_VC(info);
		if (vc == columnWrk2Dtl_not_cost_flg) return doWrk2Dtl_not_cost_flg_VC(info);
		if (vc == columnWrk2Dtl_memo1) return doWrk2Dtl_memo1_VC(info);
		if (vc == columnWrk2Dtl_memo2) return doWrk2Dtl_memo2_VC(info);
		if (vc == columnWrk2Dtl_memo3) return doWrk2Dtl_memo3_VC(info);
		if (vc == columnWrk2Dtl_ins_usr_id) return doWrk2Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk2Dtl_ins_usr_nm) return doWrk2Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk2Dtl_ins_ts) return doWrk2Dtl_ins_ts_VC(info);
		if (vc == columnWrk2Dtl_ins_func_id) return doWrk2Dtl_ins_func_id_VC(info);
		if (vc == columnWrk2Dtl_ins_func_nm) return doWrk2Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk2Dtl_upd_cntr) return doWrk2Dtl_upd_cntr_VC(info);
		if (vc == columnWrk2Dtl_upd_usr_id) return doWrk2Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk2Dtl_upd_usr_nm) return doWrk2Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk2Dtl_upd_ts) return doWrk2Dtl_upd_ts_VC(info);
		if (vc == columnWrk2Dtl_upd_func_id) return doWrk2Dtl_upd_func_id_VC(info);
		if (vc == columnWrk2Dtl_upd_func_nm) return doWrk2Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk2Dtl_upd_srv_req_no) return doWrk2Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk2Dtl_del_usr_id) return doWrk2Dtl_del_usr_id_VC(info);
		if (vc == columnWrk2Dtl_del_usr_nm) return doWrk2Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk2Dtl_del_ts) return doWrk2Dtl_del_ts_VC(info);
		if (vc == columnWrk3Dtl_del_flg) return doWrk3Dtl_del_flg_VC(info);
		if (vc == columnWrk3Dtl_itm_typ) return doWrk3Dtl_itm_typ_VC(info);
		if (vc == columnWrk3Dtl_itm_typ_nm) return doWrk3Dtl_itm_typ_nm_VC(info);
		if (vc == columnWrk3Dtl_itm_typ_d_cd) return doWrk3Dtl_itm_typ_d_cd_VC(info);
		if (vc == columnWrk3Dtl_itm_typ_d_nm) return doWrk3Dtl_itm_typ_d_nm_VC(info);
		if (vc == columnWrk3Dtl_loc_cd) return doWrk3Dtl_loc_cd_VC(info);
		if (vc == columnWrk3Dtl_loc_nm) return doWrk3Dtl_loc_nm_VC(info);
		if (vc == columnWrk3Dtl_wg_cd) return doWrk3Dtl_wg_cd_VC(info);
		if (vc == columnWrk3Dtl_wg_nm) return doWrk3Dtl_wg_nm_VC(info);
		if (vc == columnWrk3Dtl_oper_ptn) return doWrk3Dtl_oper_ptn_VC(info);
		if (vc == columnWrk3Dtl_oper_cd) return doWrk3Dtl_oper_cd_VC(info);
		if (vc == columnWrk3Dtl_oper_nm) return doWrk3Dtl_oper_nm_VC(info);
		if (vc == columnWrk3Dtl_oper_seq) return doWrk3Dtl_oper_seq_VC(info);
		if (vc == columnWrk3Dtl_wk_cost_cd) return doWrk3Dtl_wk_cost_cd_VC(info);
		if (vc == columnWrk3Dtl_wk_cost_nm) return doWrk3Dtl_wk_cost_nm_VC(info);
		if (vc == columnWrk3Dtl_wk_cost_unit_nm) return doWrk3Dtl_wk_cost_unit_nm_VC(info);
		if (vc == columnWrk3Dtl_wk_cost_unit_dec_place) return doWrk3Dtl_wk_cost_unit_dec_place_VC(info);
		if (vc == columnWrk3Dtl_wk_cost_unit_rnd_typ) return doWrk3Dtl_wk_cost_unit_rnd_typ_VC(info);
		if (vc == columnWrk3Dtl_fxd_wk_cost) return doWrk3Dtl_fxd_wk_cost_VC(info);
		if (vc == columnWrk3Dtl_wk_cost) return doWrk3Dtl_wk_cost_VC(info);
		if (vc == columnWrk3Dtl_base_unit_cd) return doWrk3Dtl_base_unit_cd_VC(info);
		if (vc == columnWrk3Dtl_base_unit_nm) return doWrk3Dtl_base_unit_nm_VC(info);
		if (vc == columnWrk3Dtl_itm_dec_place) return doWrk3Dtl_itm_dec_place_VC(info);
		if (vc == columnWrk3Dtl_wk_cost_calc_flg) return doWrk3Dtl_wk_cost_calc_flg_VC(info);
		if (vc == columnWrk3Dtl_disp_seq) return doWrk3Dtl_disp_seq_VC(info);
		if (vc == columnWrk3Dtl_not_cost_flg) return doWrk3Dtl_not_cost_flg_VC(info);
		if (vc == columnWrk3Dtl_memo1) return doWrk3Dtl_memo1_VC(info);
		if (vc == columnWrk3Dtl_memo2) return doWrk3Dtl_memo2_VC(info);
		if (vc == columnWrk3Dtl_memo3) return doWrk3Dtl_memo3_VC(info);
		if (vc == columnWrk3Dtl_ins_usr_id) return doWrk3Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk3Dtl_ins_usr_nm) return doWrk3Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk3Dtl_ins_ts) return doWrk3Dtl_ins_ts_VC(info);
		if (vc == columnWrk3Dtl_ins_func_id) return doWrk3Dtl_ins_func_id_VC(info);
		if (vc == columnWrk3Dtl_ins_func_nm) return doWrk3Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk3Dtl_upd_cntr) return doWrk3Dtl_upd_cntr_VC(info);
		if (vc == columnWrk3Dtl_upd_usr_id) return doWrk3Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk3Dtl_upd_usr_nm) return doWrk3Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk3Dtl_upd_ts) return doWrk3Dtl_upd_ts_VC(info);
		if (vc == columnWrk3Dtl_upd_func_id) return doWrk3Dtl_upd_func_id_VC(info);
		if (vc == columnWrk3Dtl_upd_func_nm) return doWrk3Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk3Dtl_upd_srv_req_no) return doWrk3Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk3Dtl_del_usr_id) return doWrk3Dtl_del_usr_id_VC(info);
		if (vc == columnWrk3Dtl_del_usr_nm) return doWrk3Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk3Dtl_del_ts) return doWrk3Dtl_del_ts_VC(info);
		if (vc == columnWrk4Dtl_del_flg) return doWrk4Dtl_del_flg_VC(info);
		if (vc == columnWrk4Dtl_itm_typ) return doWrk4Dtl_itm_typ_VC(info);
		if (vc == columnWrk4Dtl_itm_typ_nm) return doWrk4Dtl_itm_typ_nm_VC(info);
		if (vc == columnWrk4Dtl_itm_typ_d_cd) return doWrk4Dtl_itm_typ_d_cd_VC(info);
		if (vc == columnWrk4Dtl_itm_typ_d_nm) return doWrk4Dtl_itm_typ_d_nm_VC(info);
		if (vc == columnWrk4Dtl_loc_cd) return doWrk4Dtl_loc_cd_VC(info);
		if (vc == columnWrk4Dtl_loc_nm) return doWrk4Dtl_loc_nm_VC(info);
		if (vc == columnWrk4Dtl_wg_cd) return doWrk4Dtl_wg_cd_VC(info);
		if (vc == columnWrk4Dtl_wg_nm) return doWrk4Dtl_wg_nm_VC(info);
		if (vc == columnWrk4Dtl_loc_grp_cd) return doWrk4Dtl_loc_grp_cd_VC(info);
		if (vc == columnWrk4Dtl_loc_grp_nm) return doWrk4Dtl_loc_grp_nm_VC(info);
		if (vc == columnWrk4Dtl_prio) return doWrk4Dtl_prio_VC(info);
		if (vc == columnWrk4Dtl_memo1) return doWrk4Dtl_memo1_VC(info);
		if (vc == columnWrk4Dtl_memo2) return doWrk4Dtl_memo2_VC(info);
		if (vc == columnWrk4Dtl_memo3) return doWrk4Dtl_memo3_VC(info);
		if (vc == columnWrk4Dtl_ins_usr_id) return doWrk4Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk4Dtl_ins_usr_nm) return doWrk4Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk4Dtl_ins_ts) return doWrk4Dtl_ins_ts_VC(info);
		if (vc == columnWrk4Dtl_ins_func_id) return doWrk4Dtl_ins_func_id_VC(info);
		if (vc == columnWrk4Dtl_ins_func_nm) return doWrk4Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk4Dtl_upd_cntr) return doWrk4Dtl_upd_cntr_VC(info);
		if (vc == columnWrk4Dtl_upd_usr_id) return doWrk4Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk4Dtl_upd_usr_nm) return doWrk4Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk4Dtl_upd_ts) return doWrk4Dtl_upd_ts_VC(info);
		if (vc == columnWrk4Dtl_upd_func_id) return doWrk4Dtl_upd_func_id_VC(info);
		if (vc == columnWrk4Dtl_upd_func_nm) return doWrk4Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk4Dtl_upd_srv_req_no) return doWrk4Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk4Dtl_del_usr_id) return doWrk4Dtl_del_usr_id_VC(info);
		if (vc == columnWrk4Dtl_del_usr_nm) return doWrk4Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk4Dtl_del_ts) return doWrk4Dtl_del_ts_VC(info);
		if (vc == columnWrk5Dtl_del_flg) return doWrk5Dtl_del_flg_VC(info);
		if (vc == columnWrk5Dtl_dec_place) return doWrk5Dtl_dec_place_VC(info);
		if (vc == columnWrk5Dtl_itm_typ) return doWrk5Dtl_itm_typ_VC(info);
		if (vc == columnWrk5Dtl_itm_typ_nm) return doWrk5Dtl_itm_typ_nm_VC(info);
		if (vc == columnWrk5Dtl_itm_typ_d_cd) return doWrk5Dtl_itm_typ_d_cd_VC(info);
		if (vc == columnWrk5Dtl_itm_typ_d_nm) return doWrk5Dtl_itm_typ_d_nm_VC(info);
		if (vc == columnWrk5Dtl_loc_cd) return doWrk5Dtl_loc_cd_VC(info);
		if (vc == columnWrk5Dtl_loc_nm) return doWrk5Dtl_loc_nm_VC(info);
		if (vc == columnWrk5Dtl_wg_cd) return doWrk5Dtl_wg_cd_VC(info);
		if (vc == columnWrk5Dtl_wg_nm) return doWrk5Dtl_wg_nm_VC(info);
		if (vc == columnWrk5Dtl_gi_schd_flg) return doWrk5Dtl_gi_schd_flg_VC(info);
		if (vc == columnWrk5Dtl_base_unit_cd) return doWrk5Dtl_base_unit_cd_VC(info);
		if (vc == columnWrk5Dtl_base_unit_nm) return doWrk5Dtl_base_unit_nm_VC(info);
		if (vc == columnWrk5Dtl_lot_sizing_flg) return doWrk5Dtl_lot_sizing_flg_VC(info);
		if (vc == columnWrk5Dtl_gi_loc_cd) return doWrk5Dtl_gi_loc_cd_VC(info);
		if (vc == columnWrk5Dtl_gi_loc_nm) return doWrk5Dtl_gi_loc_nm_VC(info);
		if (vc == columnWrk5Dtl_gi_str_ln_tgt_flg) return doWrk5Dtl_gi_str_ln_tgt_flg_VC(info);
		if (vc == columnWrk5Dtl_inpt_gi_loc_cd) return doWrk5Dtl_inpt_gi_loc_cd_VC(info);
		if (vc == columnWrk5Dtl_inpt_gi_loc_nm) return doWrk5Dtl_inpt_gi_loc_nm_VC(info);
		if (vc == columnWrk5Dtl_inpt_gi_str_ln_tgt_flg) return doWrk5Dtl_inpt_gi_str_ln_tgt_flg_VC(info);
		if (vc == columnWrk5Dtl_ship_gi_loc_cd) return doWrk5Dtl_ship_gi_loc_cd_VC(info);
		if (vc == columnWrk5Dtl_ship_gi_loc_nm) return doWrk5Dtl_ship_gi_loc_nm_VC(info);
		if (vc == columnWrk5Dtl_ship_gi_str_ln_tgt_flg) return doWrk5Dtl_ship_gi_str_ln_tgt_flg_VC(info);
		if (vc == columnWrk5Dtl_memo1) return doWrk5Dtl_memo1_VC(info);
		if (vc == columnWrk5Dtl_memo2) return doWrk5Dtl_memo2_VC(info);
		if (vc == columnWrk5Dtl_memo3) return doWrk5Dtl_memo3_VC(info);
		if (vc == columnWrk5Dtl_ins_usr_id) return doWrk5Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk5Dtl_ins_usr_nm) return doWrk5Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk5Dtl_ins_ts) return doWrk5Dtl_ins_ts_VC(info);
		if (vc == columnWrk5Dtl_ins_func_id) return doWrk5Dtl_ins_func_id_VC(info);
		if (vc == columnWrk5Dtl_ins_func_nm) return doWrk5Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk5Dtl_upd_cntr) return doWrk5Dtl_upd_cntr_VC(info);
		if (vc == columnWrk5Dtl_upd_usr_id) return doWrk5Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk5Dtl_upd_usr_nm) return doWrk5Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk5Dtl_upd_ts) return doWrk5Dtl_upd_ts_VC(info);
		if (vc == columnWrk5Dtl_upd_func_id) return doWrk5Dtl_upd_func_id_VC(info);
		if (vc == columnWrk5Dtl_upd_func_nm) return doWrk5Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk5Dtl_upd_srv_req_no) return doWrk5Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk5Dtl_del_usr_id) return doWrk5Dtl_del_usr_id_VC(info);
		if (vc == columnWrk5Dtl_del_usr_nm) return doWrk5Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk5Dtl_del_ts) return doWrk5Dtl_del_ts_VC(info);
		if (vc == columnWrk6Dtl_del_flg) return doWrk6Dtl_del_flg_VC(info);
		if (vc == columnWrk6Dtl_itm_typ) return doWrk6Dtl_itm_typ_VC(info);
		if (vc == columnWrk6Dtl_itm_typ_nm) return doWrk6Dtl_itm_typ_nm_VC(info);
		if (vc == columnWrk6Dtl_itm_typ_d_cd) return doWrk6Dtl_itm_typ_d_cd_VC(info);
		if (vc == columnWrk6Dtl_itm_typ_d_nm) return doWrk6Dtl_itm_typ_d_nm_VC(info);
		if (vc == columnWrk6Dtl_insp_ptn_cd) return doWrk6Dtl_insp_ptn_cd_VC(info);
		if (vc == columnWrk6Dtl_insp_ptn_nm) return doWrk6Dtl_insp_ptn_nm_VC(info);
		if (vc == columnWrk6Dtl_insp_mtd_typ) return doWrk6Dtl_insp_mtd_typ_VC(info);
		if (vc == columnWrk6Dtl_insp_mtd_typ_nm) return doWrk6Dtl_insp_mtd_typ_nm_VC(info);
		if (vc == columnWrk6Dtl_insp_lt) return doWrk6Dtl_insp_lt_VC(info);
		if (vc == columnWrk6Dtl_insp_std_no) return doWrk6Dtl_insp_std_no_VC(info);
		if (vc == columnWrk6Dtl_unit_cd) return doWrk6Dtl_unit_cd_VC(info);
		if (vc == columnWrk6Dtl_dec_place) return doWrk6Dtl_dec_place_VC(info);
		if (vc == columnWrk6Dtl_std_req_flg) return doWrk6Dtl_std_req_flg_VC(info);
		if (vc == columnWrk6Dtl_std_cnf_req_flg) return doWrk6Dtl_std_cnf_req_flg_VC(info);
		if (vc == columnWrk6Dtl_memo1) return doWrk6Dtl_memo1_VC(info);
		if (vc == columnWrk6Dtl_memo2) return doWrk6Dtl_memo2_VC(info);
		if (vc == columnWrk6Dtl_memo3) return doWrk6Dtl_memo3_VC(info);
		if (vc == columnWrk6Dtl_ins_usr_id) return doWrk6Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk6Dtl_ins_usr_nm) return doWrk6Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk6Dtl_ins_ts) return doWrk6Dtl_ins_ts_VC(info);
		if (vc == columnWrk6Dtl_ins_func_id) return doWrk6Dtl_ins_func_id_VC(info);
		if (vc == columnWrk6Dtl_ins_func_nm) return doWrk6Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk6Dtl_upd_cntr) return doWrk6Dtl_upd_cntr_VC(info);
		if (vc == columnWrk6Dtl_upd_usr_id) return doWrk6Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk6Dtl_upd_usr_nm) return doWrk6Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk6Dtl_upd_ts) return doWrk6Dtl_upd_ts_VC(info);
		if (vc == columnWrk6Dtl_upd_func_id) return doWrk6Dtl_upd_func_id_VC(info);
		if (vc == columnWrk6Dtl_upd_func_nm) return doWrk6Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk6Dtl_upd_srv_req_no) return doWrk6Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk6Dtl_del_usr_id) return doWrk6Dtl_del_usr_id_VC(info);
		if (vc == columnWrk6Dtl_del_usr_nm) return doWrk6Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk6Dtl_del_ts) return doWrk6Dtl_del_ts_VC(info);
		if (vc == columnWrk7Dtl_del_flg) return doWrk7Dtl_del_flg_VC(info);
		if (vc == columnWrk7Dtl_itm_typ) return doWrk7Dtl_itm_typ_VC(info);
		if (vc == columnWrk7Dtl_itm_typ_nm) return doWrk7Dtl_itm_typ_nm_VC(info);
		if (vc == columnWrk7Dtl_itm_typ_d_cd) return doWrk7Dtl_itm_typ_d_cd_VC(info);
		if (vc == columnWrk7Dtl_itm_typ_d_nm) return doWrk7Dtl_itm_typ_d_nm_VC(info);
		if (vc == columnWrk7Dtl_lmt_ctl_flg) return doWrk7Dtl_lmt_ctl_flg_VC(info);
		if (vc == columnWrk7Dtl_mfg_loc_cd) return doWrk7Dtl_mfg_loc_cd_VC(info);
		if (vc == columnWrk7Dtl_mfg_loc_nm) return doWrk7Dtl_mfg_loc_nm_VC(info);
		if (vc == columnWrk7Dtl_sppl_cd) return doWrk7Dtl_sppl_cd_VC(info);
		if (vc == columnWrk7Dtl_sppl_nm) return doWrk7Dtl_sppl_nm_VC(info);
		if (vc == columnWrk7Dtl_maker_cd) return doWrk7Dtl_maker_cd_VC(info);
		if (vc == columnWrk7Dtl_maker_nm) return doWrk7Dtl_maker_nm_VC(info);
		if (vc == columnWrk7Dtl_from_site_cd) return doWrk7Dtl_from_site_cd_VC(info);
		if (vc == columnWrk7Dtl_from_site_nm) return doWrk7Dtl_from_site_nm_VC(info);
		if (vc == columnWrk7Dtl_to_site_cd) return doWrk7Dtl_to_site_cd_VC(info);
		if (vc == columnWrk7Dtl_to_site_nm) return doWrk7Dtl_to_site_nm_VC(info);
		if (vc == columnWrk7Dtl_no_insp_flg) return doWrk7Dtl_no_insp_flg_VC(info);
		if (vc == columnWrk7Dtl_insp_ptn_cd) return doWrk7Dtl_insp_ptn_cd_VC(info);
		if (vc == columnWrk7Dtl_insp_ptn_nm) return doWrk7Dtl_insp_ptn_nm_VC(info);
		if (vc == columnWrk7Dtl_no_mrkt_judg_flg) return doWrk7Dtl_no_mrkt_judg_flg_VC(info);
		if (vc == columnWrk7Dtl_no_plnt_aprv_flg) return doWrk7Dtl_no_plnt_aprv_flg_VC(info);
		if (vc == columnWrk7Dtl_no_insp_aprv_flg) return doWrk7Dtl_no_insp_aprv_flg_VC(info);
		if (vc == columnWrk7Dtl_lmt_dt_frm_typ) return doWrk7Dtl_lmt_dt_frm_typ_VC(info);
		if (vc == columnWrk7Dtl_lmt_dt_frm_typ_nm) return doWrk7Dtl_lmt_dt_frm_typ_nm_VC(info);
		if (vc == columnWrk7Dtl_vld_pd) return doWrk7Dtl_vld_pd_VC(info);
		if (vc == columnWrk7Dtl_lmt_pd) return doWrk7Dtl_lmt_pd_VC(info);
		if (vc == columnWrk7Dtl_lot_insp_vld_pd) return doWrk7Dtl_lot_insp_vld_pd_VC(info);
		if (vc == columnWrk7Dtl_calc_pd_typ) return doWrk7Dtl_calc_pd_typ_VC(info);
		if (vc == columnWrk7Dtl_calc_pd_typ_nm) return doWrk7Dtl_calc_pd_typ_nm_VC(info);
		if (vc == columnWrk7Dtl_lot_insp_lmt_dt_frm_typ) return doWrk7Dtl_lot_insp_lmt_dt_frm_typ_VC(info);
		if (vc == columnWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm) return doWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm_VC(info);
		if (vc == columnWrk7Dtl_insp_inst_issue_typ) return doWrk7Dtl_insp_inst_issue_typ_VC(info);
		if (vc == columnWrk7Dtl_insp_inst_issue_typ_nm) return doWrk7Dtl_insp_inst_issue_typ_nm_VC(info);
		if (vc == columnWrk7Dtl_insp_offst) return doWrk7Dtl_insp_offst_VC(info);
		if (vc == columnWrk7Dtl_inst_rslt_issue_flg) return doWrk7Dtl_inst_rslt_issue_flg_VC(info);
		if (vc == columnWrk7Dtl_pre_insp_valid_flg) return doWrk7Dtl_pre_insp_valid_flg_VC(info);
		if (vc == columnWrk7Dtl_memo1) return doWrk7Dtl_memo1_VC(info);
		if (vc == columnWrk7Dtl_memo2) return doWrk7Dtl_memo2_VC(info);
		if (vc == columnWrk7Dtl_memo3) return doWrk7Dtl_memo3_VC(info);
		if (vc == columnWrk7Dtl_ins_usr_id) return doWrk7Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk7Dtl_ins_usr_nm) return doWrk7Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk7Dtl_ins_ts) return doWrk7Dtl_ins_ts_VC(info);
		if (vc == columnWrk7Dtl_ins_func_id) return doWrk7Dtl_ins_func_id_VC(info);
		if (vc == columnWrk7Dtl_ins_func_nm) return doWrk7Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk7Dtl_upd_cntr) return doWrk7Dtl_upd_cntr_VC(info);
		if (vc == columnWrk7Dtl_upd_usr_id) return doWrk7Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk7Dtl_upd_usr_nm) return doWrk7Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk7Dtl_upd_ts) return doWrk7Dtl_upd_ts_VC(info);
		if (vc == columnWrk7Dtl_upd_func_id) return doWrk7Dtl_upd_func_id_VC(info);
		if (vc == columnWrk7Dtl_upd_func_nm) return doWrk7Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk7Dtl_upd_srv_req_no) return doWrk7Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk7Dtl_del_usr_id) return doWrk7Dtl_del_usr_id_VC(info);
		if (vc == columnWrk7Dtl_del_usr_nm) return doWrk7Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk7Dtl_del_ts) return doWrk7Dtl_del_ts_VC(info);
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
	 * [DtlTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[base_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_dt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sno4_mng_typ_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bom_ptn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bom_ptn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ph_ex_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ph_ex_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bottom_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bottom_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[byprod_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_byprod_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dec_place_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ph_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ph_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ph_bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ph_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_itm_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_alloc_prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_alloc_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_offst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_offst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_offst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_offst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_offst]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_offst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bkf_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bkf_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bkf_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bkf_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inst_lot_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inst_lot_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_ctl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_ctl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[main_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_main_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[yield_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_yield_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_ctl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_ctl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_bom]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_no_bom_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_cost_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_cost_flg_VC(MCEventInfo info){
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
	 * [Wrk1Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rqst_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rqst_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rqst_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rqst_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_oper_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_mfg_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_lt_add_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_mfg_lt_add_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_purc_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt_add_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_purc_lt_add_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[accpt_insp_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_accpt_insp_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[buf_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_buf_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[ord_fix_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_ord_fix_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sz_day_week_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sz_day_week_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_week]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sz_week_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_sz_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_lot_sz_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[min_lot_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_min_lot_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[batch_lot_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_batch_lot_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[max_lot_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_max_lot_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[max_order]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_max_order_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[order_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_order_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[yield_schd_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_yield_schd_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_inst_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_mfg_inst_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[fxd_rqmt_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_fxd_rqmt_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_issue_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_lot_issue_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_issue_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_lot_issue_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[bkf_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_bkf_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[ln_stk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_ln_stk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[pre_po_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_pre_po_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[inst_rec_issue_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_inst_rec_issue_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[no_mfg_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_no_mfg_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_lower_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_itm_lower_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_std_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_itm_std_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_upper_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_itm_upper_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_purc_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_purc_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[po_batch_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_po_batch_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rsrc_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rsrc_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_unit_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rsrc_unit_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_std_qty1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rsrc_std_qty1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rsrc_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rsrc_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_unit_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rsrc_unit_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_std_qty2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rsrc_std_qty2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[not_mrp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_not_mrp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[cost_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_cost_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_itm_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_itm_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lt_add_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_lt_add_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_offst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_offst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_offst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_add_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_offst_add_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[def_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_def_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[unit_conv_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_unit_conv_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[unit_conv_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_unit_conv_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[yield_oper_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_yield_oper_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[yield_oper_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_yield_oper_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_inst_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_inst_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_fr_dt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_lmt_fr_dt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lower_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_lower_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_std_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_std_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_upper_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_oper_upper_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[wip_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_wip_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[not_cost_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_not_cost_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_oper_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_oper_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_wk_cost_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_wk_cost_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_wk_cost_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_wk_cost_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_wk_cost_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[fxd_wk_cost]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_fxd_wk_cost_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_wk_cost_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_itm_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_wk_cost_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[not_cost_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_not_cost_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_gi_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[lot_sizing_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_lot_sizing_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_gi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_gi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_gi_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_inpt_gi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_inpt_gi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_inpt_gi_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ship_gi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ship_gi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ship_gi_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_insp_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_insp_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_insp_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_insp_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_insp_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_std_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_insp_std_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[std_req_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_std_req_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[std_cnf_req_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_std_cnf_req_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_ctl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_lmt_ctl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[from_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_from_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[from_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_from_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[to_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_to_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[to_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_to_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[no_insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_no_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_insp_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_insp_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[no_mrkt_judg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_no_mrkt_judg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[no_plnt_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_no_plnt_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[no_insp_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_no_insp_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_dt_frm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_lmt_dt_frm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_dt_frm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_lmt_dt_frm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[vld_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_vld_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_lmt_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_vld_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_lot_insp_vld_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[calc_pd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_calc_pd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[calc_pd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_calc_pd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_lmt_dt_frm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_lot_insp_lmt_dt_frm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_lmt_dt_frm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_inst_issue_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_insp_inst_issue_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_inst_issue_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_insp_inst_issue_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_offst]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_insp_offst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[inst_rslt_issue_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_inst_rslt_issue_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[pre_insp_valid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_pre_insp_valid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_del_ts_VC(MCEventInfo info){
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
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == DtlTabTab) doDtlTab_NC(info);
		else if (nc == Wrk1DtlTable) doWrk1Dtl_NC(info);
		else if (nc == Wrk2DtlTable) doWrk2Dtl_NC(info);
		else if (nc == Wrk3DtlTable) doWrk3Dtl_NC(info);
		else if (nc == Wrk4DtlTable) doWrk4Dtl_NC(info);
		else if (nc == Wrk5DtlTable) doWrk5Dtl_NC(info);
		else if (nc == Wrk6DtlTable) doWrk6Dtl_NC(info);
		else if (nc == Wrk7DtlTable) doWrk7Dtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_base_dt) doCnd_base_dt_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_sno1_mng_typ) doCnd_sno1_mng_typ_NC(info);
		else if (nc == Cnd_sno2_mng_typ) doCnd_sno2_mng_typ_NC(info);
		else if (nc == Cnd_sno3_mng_typ) doCnd_sno3_mng_typ_NC(info);
		else if (nc == Cnd_sno4_mng_typ) doCnd_sno4_mng_typ_NC(info);
		else if (nc == Cnd_bom_ptn) doCnd_bom_ptn_NC(info);
		else if (nc == Cnd_bom_ptn_flg) doCnd_bom_ptn_flg_NC(info);
		else if (nc == Cnd_ph_ex_flg) doCnd_ph_ex_flg_NC(info);
		else if (nc == Cnd_max_hrrchy) doCnd_max_hrrchy_NC(info);
		else if (nc == Cnd_base_qty) doCnd_base_qty_NC(info);
		else if (nc == columnDtl_bottom_flg) doDtl_bottom_flg_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_byprod_flg) doDtl_byprod_flg_NC(info);
		else if (nc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NC(info);
		else if (nc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NC(info);
		else if (nc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NC(info);
		else if (nc == columnDtl_unit_cd) doDtl_unit_cd_NC(info);
		else if (nc == columnDtl_dec_place) doDtl_dec_place_NC(info);
		else if (nc == columnDtl_bom_ptn) doDtl_bom_ptn_NC(info);
		else if (nc == columnDtl_oper_cd) doDtl_oper_cd_NC(info);
		else if (nc == columnDtl_oper_nm) doDtl_oper_nm_NC(info);
		else if (nc == columnDtl_oper_seq) doDtl_oper_seq_NC(info);
		else if (nc == columnDtl_ph_flg) doDtl_ph_flg_NC(info);
		else if (nc == columnDtl_ph_bom_ptn) doDtl_ph_bom_ptn_NC(info);
		else if (nc == columnDtl_alt_itm_flg) doDtl_alt_itm_flg_NC(info);
		else if (nc == columnDtl_alt_grp_cd) doDtl_alt_grp_cd_NC(info);
		else if (nc == columnDtl_alt_grp_nm) doDtl_alt_grp_nm_NC(info);
		else if (nc == columnDtl_alt_itm_typ) doDtl_alt_itm_typ_NC(info);
		else if (nc == columnDtl_alt_itm_typ_nm) doDtl_alt_itm_typ_nm_NC(info);
		else if (nc == columnDtl_alt_itm_ratio) doDtl_alt_itm_ratio_NC(info);
		else if (nc == columnDtl_alt_alloc_prio) doDtl_alt_alloc_prio_NC(info);
		else if (nc == columnDtl_sno_typ1) doDtl_sno_typ1_NC(info);
		else if (nc == columnDtl_sno_typ_nm1) doDtl_sno_typ_nm1_NC(info);
		else if (nc == columnDtl_sno_typ2) doDtl_sno_typ2_NC(info);
		else if (nc == columnDtl_sno_typ_nm2) doDtl_sno_typ_nm2_NC(info);
		else if (nc == columnDtl_sno_typ3) doDtl_sno_typ3_NC(info);
		else if (nc == columnDtl_sno_typ_nm3) doDtl_sno_typ_nm3_NC(info);
		else if (nc == columnDtl_sno_typ4) doDtl_sno_typ4_NC(info);
		else if (nc == columnDtl_sno_typ_nm4) doDtl_sno_typ_nm4_NC(info);
		else if (nc == columnDtl_chd_unit_cd) doDtl_chd_unit_cd_NC(info);
		else if (nc == columnDtl_chd_unit_nm) doDtl_chd_unit_nm_NC(info);
		else if (nc == columnDtl_chd_dec_place) doDtl_chd_dec_place_NC(info);
		else if (nc == columnDtl_in_offst_typ) doDtl_in_offst_typ_NC(info);
		else if (nc == columnDtl_in_offst_typ_nm) doDtl_in_offst_typ_nm_NC(info);
		else if (nc == columnDtl_in_offst) doDtl_in_offst_NC(info);
		else if (nc == columnDtl_bkf_typ) doDtl_bkf_typ_NC(info);
		else if (nc == columnDtl_bkf_typ_nm) doDtl_bkf_typ_nm_NC(info);
		else if (nc == columnDtl_inst_lot_fix_flg) doDtl_inst_lot_fix_flg_NC(info);
		else if (nc == columnDtl_lot_mix_flg) doDtl_lot_mix_flg_NC(info);
		else if (nc == columnDtl_sublot_mix_flg) doDtl_sublot_mix_flg_NC(info);
		else if (nc == columnDtl_alloc_ctl_typ) doDtl_alloc_ctl_typ_NC(info);
		else if (nc == columnDtl_alloc_ctl_typ_nm) doDtl_alloc_ctl_typ_nm_NC(info);
		else if (nc == columnDtl_main_itm_flg) doDtl_main_itm_flg_NC(info);
		else if (nc == columnDtl_yield_calc_flg) doDtl_yield_calc_flg_NC(info);
		else if (nc == columnDtl_inpt_ctl_typ) doDtl_inpt_ctl_typ_NC(info);
		else if (nc == columnDtl_inpt_ctl_typ_nm) doDtl_inpt_ctl_typ_nm_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_chng_no) doDtl_chng_no_NC(info);
		else if (nc == columnDtl_ext_sys_no_bom) doDtl_ext_sys_no_bom_NC(info);
		else if (nc == columnDtl_not_cost_flg) doDtl_not_cost_flg_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnWrk1Dtl_del_flg) doWrk1Dtl_del_flg_NC(info);
		else if (nc == columnWrk1Dtl_wg_cd) doWrk1Dtl_wg_cd_NC(info);
		else if (nc == columnWrk1Dtl_wg_nm) doWrk1Dtl_wg_nm_NC(info);
		else if (nc == columnWrk1Dtl_stk_mng_typ) doWrk1Dtl_stk_mng_typ_NC(info);
		else if (nc == columnWrk1Dtl_asset_mng_typ) doWrk1Dtl_asset_mng_typ_NC(info);
		else if (nc == columnWrk1Dtl_unit_cd) doWrk1Dtl_unit_cd_NC(info);
		else if (nc == columnWrk1Dtl_dec_place) doWrk1Dtl_dec_place_NC(info);
		else if (nc == columnWrk1Dtl_sno1_mng_typ) doWrk1Dtl_sno1_mng_typ_NC(info);
		else if (nc == columnWrk1Dtl_sno2_mng_typ) doWrk1Dtl_sno2_mng_typ_NC(info);
		else if (nc == columnWrk1Dtl_sno3_mng_typ) doWrk1Dtl_sno3_mng_typ_NC(info);
		else if (nc == columnWrk1Dtl_sno4_mng_typ) doWrk1Dtl_sno4_mng_typ_NC(info);
		else if (nc == columnWrk1Dtl_itm_typ) doWrk1Dtl_itm_typ_NC(info);
		else if (nc == columnWrk1Dtl_itm_typ_nm) doWrk1Dtl_itm_typ_nm_NC(info);
		else if (nc == columnWrk1Dtl_itm_typ_d_cd) doWrk1Dtl_itm_typ_d_cd_NC(info);
		else if (nc == columnWrk1Dtl_itm_typ_d_nm) doWrk1Dtl_itm_typ_d_nm_NC(info);
		else if (nc == columnWrk1Dtl_mfg_loc_cd) doWrk1Dtl_mfg_loc_cd_NC(info);
		else if (nc == columnWrk1Dtl_mfg_loc_nm) doWrk1Dtl_mfg_loc_nm_NC(info);
		else if (nc == columnWrk1Dtl_site_cd) doWrk1Dtl_site_cd_NC(info);
		else if (nc == columnWrk1Dtl_site_nm) doWrk1Dtl_site_nm_NC(info);
		else if (nc == columnWrk1Dtl_sppl_cd) doWrk1Dtl_sppl_cd_NC(info);
		else if (nc == columnWrk1Dtl_sppl_nm) doWrk1Dtl_sppl_nm_NC(info);
		else if (nc == columnWrk1Dtl_maker_cd) doWrk1Dtl_maker_cd_NC(info);
		else if (nc == columnWrk1Dtl_maker_nm) doWrk1Dtl_maker_nm_NC(info);
		else if (nc == columnWrk1Dtl_rqst_loc_cd) doWrk1Dtl_rqst_loc_cd_NC(info);
		else if (nc == columnWrk1Dtl_rqst_loc_nm) doWrk1Dtl_rqst_loc_nm_NC(info);
		else if (nc == columnWrk1Dtl_rqst_loc_wg_cd) doWrk1Dtl_rqst_loc_wg_cd_NC(info);
		else if (nc == columnWrk1Dtl_rqst_loc_wg_nm) doWrk1Dtl_rqst_loc_wg_nm_NC(info);
		else if (nc == columnWrk1Dtl_bom_ptn) doWrk1Dtl_bom_ptn_NC(info);
		else if (nc == columnWrk1Dtl_oper_ptn) doWrk1Dtl_oper_ptn_NC(info);
		else if (nc == columnWrk1Dtl_mfg_lt) doWrk1Dtl_mfg_lt_NC(info);
		else if (nc == columnWrk1Dtl_mfg_lt_add_qty) doWrk1Dtl_mfg_lt_add_qty_NC(info);
		else if (nc == columnWrk1Dtl_purc_lt) doWrk1Dtl_purc_lt_NC(info);
		else if (nc == columnWrk1Dtl_purc_lt_add_qty) doWrk1Dtl_purc_lt_add_qty_NC(info);
		else if (nc == columnWrk1Dtl_accpt_insp_lt) doWrk1Dtl_accpt_insp_lt_NC(info);
		else if (nc == columnWrk1Dtl_buf_lt) doWrk1Dtl_buf_lt_NC(info);
		else if (nc == columnWrk1Dtl_ord_fix_pd) doWrk1Dtl_ord_fix_pd_NC(info);
		else if (nc == columnWrk1Dtl_sz_day_week_typ) doWrk1Dtl_sz_day_week_typ_NC(info);
		else if (nc == columnWrk1Dtl_sz_day_week_typ_nm) doWrk1Dtl_sz_day_week_typ_nm_NC(info);
		else if (nc == columnWrk1Dtl_sz_week) doWrk1Dtl_sz_week_NC(info);
		else if (nc == columnWrk1Dtl_lot_sz_pd) doWrk1Dtl_lot_sz_pd_NC(info);
		else if (nc == columnWrk1Dtl_min_lot_qty) doWrk1Dtl_min_lot_qty_NC(info);
		else if (nc == columnWrk1Dtl_batch_lot_qty) doWrk1Dtl_batch_lot_qty_NC(info);
		else if (nc == columnWrk1Dtl_max_lot_qty) doWrk1Dtl_max_lot_qty_NC(info);
		else if (nc == columnWrk1Dtl_max_order) doWrk1Dtl_max_order_NC(info);
		else if (nc == columnWrk1Dtl_prio) doWrk1Dtl_prio_NC(info);
		else if (nc == columnWrk1Dtl_order_ratio) doWrk1Dtl_order_ratio_NC(info);
		else if (nc == columnWrk1Dtl_yield_schd_qty) doWrk1Dtl_yield_schd_qty_NC(info);
		else if (nc == columnWrk1Dtl_mfg_inst_qty) doWrk1Dtl_mfg_inst_qty_NC(info);
		else if (nc == columnWrk1Dtl_fxd_rqmt_qty) doWrk1Dtl_fxd_rqmt_qty_NC(info);
		else if (nc == columnWrk1Dtl_lot_issue_typ) doWrk1Dtl_lot_issue_typ_NC(info);
		else if (nc == columnWrk1Dtl_lot_issue_typ_nm) doWrk1Dtl_lot_issue_typ_nm_NC(info);
		else if (nc == columnWrk1Dtl_bkf_flg) doWrk1Dtl_bkf_flg_NC(info);
		else if (nc == columnWrk1Dtl_ln_stk_flg) doWrk1Dtl_ln_stk_flg_NC(info);
		else if (nc == columnWrk1Dtl_pre_po_tgt_flg) doWrk1Dtl_pre_po_tgt_flg_NC(info);
		else if (nc == columnWrk1Dtl_inst_rec_issue_flg) doWrk1Dtl_inst_rec_issue_flg_NC(info);
		else if (nc == columnWrk1Dtl_no_mfg_aprv_flg) doWrk1Dtl_no_mfg_aprv_flg_NC(info);
		else if (nc == columnWrk1Dtl_itm_lower_yield) doWrk1Dtl_itm_lower_yield_NC(info);
		else if (nc == columnWrk1Dtl_itm_std_yield) doWrk1Dtl_itm_std_yield_NC(info);
		else if (nc == columnWrk1Dtl_itm_upper_yield) doWrk1Dtl_itm_upper_yield_NC(info);
		else if (nc == columnWrk1Dtl_purc_id_typ) doWrk1Dtl_purc_id_typ_NC(info);
		else if (nc == columnWrk1Dtl_purc_id_typ_nm) doWrk1Dtl_purc_id_typ_nm_NC(info);
		else if (nc == columnWrk1Dtl_rqst_wg_cd) doWrk1Dtl_rqst_wg_cd_NC(info);
		else if (nc == columnWrk1Dtl_rqst_wg_nm) doWrk1Dtl_rqst_wg_nm_NC(info);
		else if (nc == columnWrk1Dtl_po_batch_flg) doWrk1Dtl_po_batch_flg_NC(info);
		else if (nc == columnWrk1Dtl_rsrc_cd1) doWrk1Dtl_rsrc_cd1_NC(info);
		else if (nc == columnWrk1Dtl_rsrc_nm1) doWrk1Dtl_rsrc_nm1_NC(info);
		else if (nc == columnWrk1Dtl_rsrc_unit_nm1) doWrk1Dtl_rsrc_unit_nm1_NC(info);
		else if (nc == columnWrk1Dtl_rsrc_std_qty1) doWrk1Dtl_rsrc_std_qty1_NC(info);
		else if (nc == columnWrk1Dtl_rsrc_cd2) doWrk1Dtl_rsrc_cd2_NC(info);
		else if (nc == columnWrk1Dtl_rsrc_nm2) doWrk1Dtl_rsrc_nm2_NC(info);
		else if (nc == columnWrk1Dtl_rsrc_unit_nm2) doWrk1Dtl_rsrc_unit_nm2_NC(info);
		else if (nc == columnWrk1Dtl_rsrc_std_qty2) doWrk1Dtl_rsrc_std_qty2_NC(info);
		else if (nc == columnWrk1Dtl_not_mrp_flg) doWrk1Dtl_not_mrp_flg_NC(info);
		else if (nc == columnWrk1Dtl_cost_ratio) doWrk1Dtl_cost_ratio_NC(info);
		else if (nc == columnWrk1Dtl_memo1) doWrk1Dtl_memo1_NC(info);
		else if (nc == columnWrk1Dtl_memo2) doWrk1Dtl_memo2_NC(info);
		else if (nc == columnWrk1Dtl_memo3) doWrk1Dtl_memo3_NC(info);
		else if (nc == columnWrk1Dtl_ins_usr_id) doWrk1Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk1Dtl_ins_usr_nm) doWrk1Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk1Dtl_ins_ts) doWrk1Dtl_ins_ts_NC(info);
		else if (nc == columnWrk1Dtl_ins_func_id) doWrk1Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk1Dtl_ins_func_nm) doWrk1Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk1Dtl_upd_cntr) doWrk1Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk1Dtl_upd_usr_id) doWrk1Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk1Dtl_upd_usr_nm) doWrk1Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk1Dtl_upd_ts) doWrk1Dtl_upd_ts_NC(info);
		else if (nc == columnWrk1Dtl_upd_func_id) doWrk1Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk1Dtl_upd_func_nm) doWrk1Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk1Dtl_upd_srv_req_no) doWrk1Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk1Dtl_del_usr_id) doWrk1Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk1Dtl_del_usr_nm) doWrk1Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk1Dtl_del_ts) doWrk1Dtl_del_ts_NC(info);
		else if (nc == columnWrk2Dtl_del_flg) doWrk2Dtl_del_flg_NC(info);
		else if (nc == columnWrk2Dtl_itm_unit_cd) doWrk2Dtl_itm_unit_cd_NC(info);
		else if (nc == columnWrk2Dtl_itm_dec_place) doWrk2Dtl_itm_dec_place_NC(info);
		else if (nc == columnWrk2Dtl_itm_typ) doWrk2Dtl_itm_typ_NC(info);
		else if (nc == columnWrk2Dtl_itm_typ_nm) doWrk2Dtl_itm_typ_nm_NC(info);
		else if (nc == columnWrk2Dtl_itm_typ_d_cd) doWrk2Dtl_itm_typ_d_cd_NC(info);
		else if (nc == columnWrk2Dtl_itm_typ_d_nm) doWrk2Dtl_itm_typ_d_nm_NC(info);
		else if (nc == columnWrk2Dtl_loc_cd) doWrk2Dtl_loc_cd_NC(info);
		else if (nc == columnWrk2Dtl_loc_nm) doWrk2Dtl_loc_nm_NC(info);
		else if (nc == columnWrk2Dtl_wg_cd) doWrk2Dtl_wg_cd_NC(info);
		else if (nc == columnWrk2Dtl_wg_nm) doWrk2Dtl_wg_nm_NC(info);
		else if (nc == columnWrk2Dtl_oper_ptn) doWrk2Dtl_oper_ptn_NC(info);
		else if (nc == columnWrk2Dtl_oper_cd) doWrk2Dtl_oper_cd_NC(info);
		else if (nc == columnWrk2Dtl_oper_nm) doWrk2Dtl_oper_nm_NC(info);
		else if (nc == columnWrk2Dtl_oper_seq) doWrk2Dtl_oper_seq_NC(info);
		else if (nc == columnWrk2Dtl_disp_seq) doWrk2Dtl_disp_seq_NC(info);
		else if (nc == columnWrk2Dtl_oper_lt) doWrk2Dtl_oper_lt_NC(info);
		else if (nc == columnWrk2Dtl_oper_lt_add_qty) doWrk2Dtl_oper_lt_add_qty_NC(info);
		else if (nc == columnWrk2Dtl_oper_offst_typ) doWrk2Dtl_oper_offst_typ_NC(info);
		else if (nc == columnWrk2Dtl_oper_offst_typ_nm) doWrk2Dtl_oper_offst_typ_nm_NC(info);
		else if (nc == columnWrk2Dtl_oper_offst) doWrk2Dtl_oper_offst_NC(info);
		else if (nc == columnWrk2Dtl_oper_offst_add_qty) doWrk2Dtl_oper_offst_add_qty_NC(info);
		else if (nc == columnWrk2Dtl_oper_unit_cd) doWrk2Dtl_oper_unit_cd_NC(info);
		else if (nc == columnWrk2Dtl_oper_unit_nm) doWrk2Dtl_oper_unit_nm_NC(info);
		else if (nc == columnWrk2Dtl_def_dec_place) doWrk2Dtl_def_dec_place_NC(info);
		else if (nc == columnWrk2Dtl_dec_place) doWrk2Dtl_dec_place_NC(info);
		else if (nc == columnWrk2Dtl_unit_conv_rnd_typ) doWrk2Dtl_unit_conv_rnd_typ_NC(info);
		else if (nc == columnWrk2Dtl_unit_conv_rnd_typ_nm) doWrk2Dtl_unit_conv_rnd_typ_nm_NC(info);
		else if (nc == columnWrk2Dtl_yield_oper_flg) doWrk2Dtl_yield_oper_flg_NC(info);
		else if (nc == columnWrk2Dtl_yield_oper_ratio) doWrk2Dtl_yield_oper_ratio_NC(info);
		else if (nc == columnWrk2Dtl_oper_inst_grp) doWrk2Dtl_oper_inst_grp_NC(info);
		else if (nc == columnWrk2Dtl_oper_loc_cd) doWrk2Dtl_oper_loc_cd_NC(info);
		else if (nc == columnWrk2Dtl_oper_loc_nm) doWrk2Dtl_oper_loc_nm_NC(info);
		else if (nc == columnWrk2Dtl_lmt_fr_dt_flg) doWrk2Dtl_lmt_fr_dt_flg_NC(info);
		else if (nc == columnWrk2Dtl_oper_lower_yield) doWrk2Dtl_oper_lower_yield_NC(info);
		else if (nc == columnWrk2Dtl_oper_std_yield) doWrk2Dtl_oper_std_yield_NC(info);
		else if (nc == columnWrk2Dtl_oper_upper_yield) doWrk2Dtl_oper_upper_yield_NC(info);
		else if (nc == columnWrk2Dtl_wip_rate) doWrk2Dtl_wip_rate_NC(info);
		else if (nc == columnWrk2Dtl_not_cost_flg) doWrk2Dtl_not_cost_flg_NC(info);
		else if (nc == columnWrk2Dtl_memo1) doWrk2Dtl_memo1_NC(info);
		else if (nc == columnWrk2Dtl_memo2) doWrk2Dtl_memo2_NC(info);
		else if (nc == columnWrk2Dtl_memo3) doWrk2Dtl_memo3_NC(info);
		else if (nc == columnWrk2Dtl_ins_usr_id) doWrk2Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk2Dtl_ins_usr_nm) doWrk2Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk2Dtl_ins_ts) doWrk2Dtl_ins_ts_NC(info);
		else if (nc == columnWrk2Dtl_ins_func_id) doWrk2Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk2Dtl_ins_func_nm) doWrk2Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk2Dtl_upd_cntr) doWrk2Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk2Dtl_upd_usr_id) doWrk2Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk2Dtl_upd_usr_nm) doWrk2Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk2Dtl_upd_ts) doWrk2Dtl_upd_ts_NC(info);
		else if (nc == columnWrk2Dtl_upd_func_id) doWrk2Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk2Dtl_upd_func_nm) doWrk2Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk2Dtl_upd_srv_req_no) doWrk2Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk2Dtl_del_usr_id) doWrk2Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk2Dtl_del_usr_nm) doWrk2Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk2Dtl_del_ts) doWrk2Dtl_del_ts_NC(info);
		else if (nc == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NC(info);
		else if (nc == columnWrk3Dtl_itm_typ) doWrk3Dtl_itm_typ_NC(info);
		else if (nc == columnWrk3Dtl_itm_typ_nm) doWrk3Dtl_itm_typ_nm_NC(info);
		else if (nc == columnWrk3Dtl_itm_typ_d_cd) doWrk3Dtl_itm_typ_d_cd_NC(info);
		else if (nc == columnWrk3Dtl_itm_typ_d_nm) doWrk3Dtl_itm_typ_d_nm_NC(info);
		else if (nc == columnWrk3Dtl_loc_cd) doWrk3Dtl_loc_cd_NC(info);
		else if (nc == columnWrk3Dtl_loc_nm) doWrk3Dtl_loc_nm_NC(info);
		else if (nc == columnWrk3Dtl_wg_cd) doWrk3Dtl_wg_cd_NC(info);
		else if (nc == columnWrk3Dtl_wg_nm) doWrk3Dtl_wg_nm_NC(info);
		else if (nc == columnWrk3Dtl_oper_ptn) doWrk3Dtl_oper_ptn_NC(info);
		else if (nc == columnWrk3Dtl_oper_cd) doWrk3Dtl_oper_cd_NC(info);
		else if (nc == columnWrk3Dtl_oper_nm) doWrk3Dtl_oper_nm_NC(info);
		else if (nc == columnWrk3Dtl_oper_seq) doWrk3Dtl_oper_seq_NC(info);
		else if (nc == columnWrk3Dtl_wk_cost_cd) doWrk3Dtl_wk_cost_cd_NC(info);
		else if (nc == columnWrk3Dtl_wk_cost_nm) doWrk3Dtl_wk_cost_nm_NC(info);
		else if (nc == columnWrk3Dtl_wk_cost_unit_nm) doWrk3Dtl_wk_cost_unit_nm_NC(info);
		else if (nc == columnWrk3Dtl_wk_cost_unit_dec_place) doWrk3Dtl_wk_cost_unit_dec_place_NC(info);
		else if (nc == columnWrk3Dtl_wk_cost_unit_rnd_typ) doWrk3Dtl_wk_cost_unit_rnd_typ_NC(info);
		else if (nc == columnWrk3Dtl_fxd_wk_cost) doWrk3Dtl_fxd_wk_cost_NC(info);
		else if (nc == columnWrk3Dtl_wk_cost) doWrk3Dtl_wk_cost_NC(info);
		else if (nc == columnWrk3Dtl_base_unit_cd) doWrk3Dtl_base_unit_cd_NC(info);
		else if (nc == columnWrk3Dtl_base_unit_nm) doWrk3Dtl_base_unit_nm_NC(info);
		else if (nc == columnWrk3Dtl_itm_dec_place) doWrk3Dtl_itm_dec_place_NC(info);
		else if (nc == columnWrk3Dtl_wk_cost_calc_flg) doWrk3Dtl_wk_cost_calc_flg_NC(info);
		else if (nc == columnWrk3Dtl_disp_seq) doWrk3Dtl_disp_seq_NC(info);
		else if (nc == columnWrk3Dtl_not_cost_flg) doWrk3Dtl_not_cost_flg_NC(info);
		else if (nc == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_NC(info);
		else if (nc == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_NC(info);
		else if (nc == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_NC(info);
		else if (nc == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_NC(info);
		else if (nc == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_NC(info);
		else if (nc == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_NC(info);
		else if (nc == columnWrk4Dtl_del_flg) doWrk4Dtl_del_flg_NC(info);
		else if (nc == columnWrk4Dtl_itm_typ) doWrk4Dtl_itm_typ_NC(info);
		else if (nc == columnWrk4Dtl_itm_typ_nm) doWrk4Dtl_itm_typ_nm_NC(info);
		else if (nc == columnWrk4Dtl_itm_typ_d_cd) doWrk4Dtl_itm_typ_d_cd_NC(info);
		else if (nc == columnWrk4Dtl_itm_typ_d_nm) doWrk4Dtl_itm_typ_d_nm_NC(info);
		else if (nc == columnWrk4Dtl_loc_cd) doWrk4Dtl_loc_cd_NC(info);
		else if (nc == columnWrk4Dtl_loc_nm) doWrk4Dtl_loc_nm_NC(info);
		else if (nc == columnWrk4Dtl_wg_cd) doWrk4Dtl_wg_cd_NC(info);
		else if (nc == columnWrk4Dtl_wg_nm) doWrk4Dtl_wg_nm_NC(info);
		else if (nc == columnWrk4Dtl_loc_grp_cd) doWrk4Dtl_loc_grp_cd_NC(info);
		else if (nc == columnWrk4Dtl_loc_grp_nm) doWrk4Dtl_loc_grp_nm_NC(info);
		else if (nc == columnWrk4Dtl_prio) doWrk4Dtl_prio_NC(info);
		else if (nc == columnWrk4Dtl_memo1) doWrk4Dtl_memo1_NC(info);
		else if (nc == columnWrk4Dtl_memo2) doWrk4Dtl_memo2_NC(info);
		else if (nc == columnWrk4Dtl_memo3) doWrk4Dtl_memo3_NC(info);
		else if (nc == columnWrk4Dtl_ins_usr_id) doWrk4Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk4Dtl_ins_usr_nm) doWrk4Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk4Dtl_ins_ts) doWrk4Dtl_ins_ts_NC(info);
		else if (nc == columnWrk4Dtl_ins_func_id) doWrk4Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk4Dtl_ins_func_nm) doWrk4Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk4Dtl_upd_cntr) doWrk4Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk4Dtl_upd_usr_id) doWrk4Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk4Dtl_upd_usr_nm) doWrk4Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk4Dtl_upd_ts) doWrk4Dtl_upd_ts_NC(info);
		else if (nc == columnWrk4Dtl_upd_func_id) doWrk4Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk4Dtl_upd_func_nm) doWrk4Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk4Dtl_upd_srv_req_no) doWrk4Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk4Dtl_del_usr_id) doWrk4Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk4Dtl_del_usr_nm) doWrk4Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk4Dtl_del_ts) doWrk4Dtl_del_ts_NC(info);
		else if (nc == columnWrk5Dtl_del_flg) doWrk5Dtl_del_flg_NC(info);
		else if (nc == columnWrk5Dtl_dec_place) doWrk5Dtl_dec_place_NC(info);
		else if (nc == columnWrk5Dtl_itm_typ) doWrk5Dtl_itm_typ_NC(info);
		else if (nc == columnWrk5Dtl_itm_typ_nm) doWrk5Dtl_itm_typ_nm_NC(info);
		else if (nc == columnWrk5Dtl_itm_typ_d_cd) doWrk5Dtl_itm_typ_d_cd_NC(info);
		else if (nc == columnWrk5Dtl_itm_typ_d_nm) doWrk5Dtl_itm_typ_d_nm_NC(info);
		else if (nc == columnWrk5Dtl_loc_cd) doWrk5Dtl_loc_cd_NC(info);
		else if (nc == columnWrk5Dtl_loc_nm) doWrk5Dtl_loc_nm_NC(info);
		else if (nc == columnWrk5Dtl_wg_cd) doWrk5Dtl_wg_cd_NC(info);
		else if (nc == columnWrk5Dtl_wg_nm) doWrk5Dtl_wg_nm_NC(info);
		else if (nc == columnWrk5Dtl_gi_schd_flg) doWrk5Dtl_gi_schd_flg_NC(info);
		else if (nc == columnWrk5Dtl_base_unit_cd) doWrk5Dtl_base_unit_cd_NC(info);
		else if (nc == columnWrk5Dtl_base_unit_nm) doWrk5Dtl_base_unit_nm_NC(info);
		else if (nc == columnWrk5Dtl_lot_sizing_flg) doWrk5Dtl_lot_sizing_flg_NC(info);
		else if (nc == columnWrk5Dtl_gi_loc_cd) doWrk5Dtl_gi_loc_cd_NC(info);
		else if (nc == columnWrk5Dtl_gi_loc_nm) doWrk5Dtl_gi_loc_nm_NC(info);
		else if (nc == columnWrk5Dtl_gi_str_ln_tgt_flg) doWrk5Dtl_gi_str_ln_tgt_flg_NC(info);
		else if (nc == columnWrk5Dtl_inpt_gi_loc_cd) doWrk5Dtl_inpt_gi_loc_cd_NC(info);
		else if (nc == columnWrk5Dtl_inpt_gi_loc_nm) doWrk5Dtl_inpt_gi_loc_nm_NC(info);
		else if (nc == columnWrk5Dtl_inpt_gi_str_ln_tgt_flg) doWrk5Dtl_inpt_gi_str_ln_tgt_flg_NC(info);
		else if (nc == columnWrk5Dtl_ship_gi_loc_cd) doWrk5Dtl_ship_gi_loc_cd_NC(info);
		else if (nc == columnWrk5Dtl_ship_gi_loc_nm) doWrk5Dtl_ship_gi_loc_nm_NC(info);
		else if (nc == columnWrk5Dtl_ship_gi_str_ln_tgt_flg) doWrk5Dtl_ship_gi_str_ln_tgt_flg_NC(info);
		else if (nc == columnWrk5Dtl_memo1) doWrk5Dtl_memo1_NC(info);
		else if (nc == columnWrk5Dtl_memo2) doWrk5Dtl_memo2_NC(info);
		else if (nc == columnWrk5Dtl_memo3) doWrk5Dtl_memo3_NC(info);
		else if (nc == columnWrk5Dtl_ins_usr_id) doWrk5Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk5Dtl_ins_usr_nm) doWrk5Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk5Dtl_ins_ts) doWrk5Dtl_ins_ts_NC(info);
		else if (nc == columnWrk5Dtl_ins_func_id) doWrk5Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk5Dtl_ins_func_nm) doWrk5Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk5Dtl_upd_cntr) doWrk5Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk5Dtl_upd_usr_id) doWrk5Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk5Dtl_upd_usr_nm) doWrk5Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk5Dtl_upd_ts) doWrk5Dtl_upd_ts_NC(info);
		else if (nc == columnWrk5Dtl_upd_func_id) doWrk5Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk5Dtl_upd_func_nm) doWrk5Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk5Dtl_upd_srv_req_no) doWrk5Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk5Dtl_del_usr_id) doWrk5Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk5Dtl_del_usr_nm) doWrk5Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk5Dtl_del_ts) doWrk5Dtl_del_ts_NC(info);
		else if (nc == columnWrk6Dtl_del_flg) doWrk6Dtl_del_flg_NC(info);
		else if (nc == columnWrk6Dtl_itm_typ) doWrk6Dtl_itm_typ_NC(info);
		else if (nc == columnWrk6Dtl_itm_typ_nm) doWrk6Dtl_itm_typ_nm_NC(info);
		else if (nc == columnWrk6Dtl_itm_typ_d_cd) doWrk6Dtl_itm_typ_d_cd_NC(info);
		else if (nc == columnWrk6Dtl_itm_typ_d_nm) doWrk6Dtl_itm_typ_d_nm_NC(info);
		else if (nc == columnWrk6Dtl_insp_ptn_cd) doWrk6Dtl_insp_ptn_cd_NC(info);
		else if (nc == columnWrk6Dtl_insp_ptn_nm) doWrk6Dtl_insp_ptn_nm_NC(info);
		else if (nc == columnWrk6Dtl_insp_mtd_typ) doWrk6Dtl_insp_mtd_typ_NC(info);
		else if (nc == columnWrk6Dtl_insp_mtd_typ_nm) doWrk6Dtl_insp_mtd_typ_nm_NC(info);
		else if (nc == columnWrk6Dtl_insp_lt) doWrk6Dtl_insp_lt_NC(info);
		else if (nc == columnWrk6Dtl_insp_std_no) doWrk6Dtl_insp_std_no_NC(info);
		else if (nc == columnWrk6Dtl_unit_cd) doWrk6Dtl_unit_cd_NC(info);
		else if (nc == columnWrk6Dtl_dec_place) doWrk6Dtl_dec_place_NC(info);
		else if (nc == columnWrk6Dtl_std_req_flg) doWrk6Dtl_std_req_flg_NC(info);
		else if (nc == columnWrk6Dtl_std_cnf_req_flg) doWrk6Dtl_std_cnf_req_flg_NC(info);
		else if (nc == columnWrk6Dtl_memo1) doWrk6Dtl_memo1_NC(info);
		else if (nc == columnWrk6Dtl_memo2) doWrk6Dtl_memo2_NC(info);
		else if (nc == columnWrk6Dtl_memo3) doWrk6Dtl_memo3_NC(info);
		else if (nc == columnWrk6Dtl_ins_usr_id) doWrk6Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk6Dtl_ins_usr_nm) doWrk6Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk6Dtl_ins_ts) doWrk6Dtl_ins_ts_NC(info);
		else if (nc == columnWrk6Dtl_ins_func_id) doWrk6Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk6Dtl_ins_func_nm) doWrk6Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk6Dtl_upd_cntr) doWrk6Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk6Dtl_upd_usr_id) doWrk6Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk6Dtl_upd_usr_nm) doWrk6Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk6Dtl_upd_ts) doWrk6Dtl_upd_ts_NC(info);
		else if (nc == columnWrk6Dtl_upd_func_id) doWrk6Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk6Dtl_upd_func_nm) doWrk6Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk6Dtl_upd_srv_req_no) doWrk6Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk6Dtl_del_usr_id) doWrk6Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk6Dtl_del_usr_nm) doWrk6Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk6Dtl_del_ts) doWrk6Dtl_del_ts_NC(info);
		else if (nc == columnWrk7Dtl_del_flg) doWrk7Dtl_del_flg_NC(info);
		else if (nc == columnWrk7Dtl_itm_typ) doWrk7Dtl_itm_typ_NC(info);
		else if (nc == columnWrk7Dtl_itm_typ_nm) doWrk7Dtl_itm_typ_nm_NC(info);
		else if (nc == columnWrk7Dtl_itm_typ_d_cd) doWrk7Dtl_itm_typ_d_cd_NC(info);
		else if (nc == columnWrk7Dtl_itm_typ_d_nm) doWrk7Dtl_itm_typ_d_nm_NC(info);
		else if (nc == columnWrk7Dtl_lmt_ctl_flg) doWrk7Dtl_lmt_ctl_flg_NC(info);
		else if (nc == columnWrk7Dtl_mfg_loc_cd) doWrk7Dtl_mfg_loc_cd_NC(info);
		else if (nc == columnWrk7Dtl_mfg_loc_nm) doWrk7Dtl_mfg_loc_nm_NC(info);
		else if (nc == columnWrk7Dtl_sppl_cd) doWrk7Dtl_sppl_cd_NC(info);
		else if (nc == columnWrk7Dtl_sppl_nm) doWrk7Dtl_sppl_nm_NC(info);
		else if (nc == columnWrk7Dtl_maker_cd) doWrk7Dtl_maker_cd_NC(info);
		else if (nc == columnWrk7Dtl_maker_nm) doWrk7Dtl_maker_nm_NC(info);
		else if (nc == columnWrk7Dtl_from_site_cd) doWrk7Dtl_from_site_cd_NC(info);
		else if (nc == columnWrk7Dtl_from_site_nm) doWrk7Dtl_from_site_nm_NC(info);
		else if (nc == columnWrk7Dtl_to_site_cd) doWrk7Dtl_to_site_cd_NC(info);
		else if (nc == columnWrk7Dtl_to_site_nm) doWrk7Dtl_to_site_nm_NC(info);
		else if (nc == columnWrk7Dtl_no_insp_flg) doWrk7Dtl_no_insp_flg_NC(info);
		else if (nc == columnWrk7Dtl_insp_ptn_cd) doWrk7Dtl_insp_ptn_cd_NC(info);
		else if (nc == columnWrk7Dtl_insp_ptn_nm) doWrk7Dtl_insp_ptn_nm_NC(info);
		else if (nc == columnWrk7Dtl_no_mrkt_judg_flg) doWrk7Dtl_no_mrkt_judg_flg_NC(info);
		else if (nc == columnWrk7Dtl_no_plnt_aprv_flg) doWrk7Dtl_no_plnt_aprv_flg_NC(info);
		else if (nc == columnWrk7Dtl_no_insp_aprv_flg) doWrk7Dtl_no_insp_aprv_flg_NC(info);
		else if (nc == columnWrk7Dtl_lmt_dt_frm_typ) doWrk7Dtl_lmt_dt_frm_typ_NC(info);
		else if (nc == columnWrk7Dtl_lmt_dt_frm_typ_nm) doWrk7Dtl_lmt_dt_frm_typ_nm_NC(info);
		else if (nc == columnWrk7Dtl_vld_pd) doWrk7Dtl_vld_pd_NC(info);
		else if (nc == columnWrk7Dtl_lmt_pd) doWrk7Dtl_lmt_pd_NC(info);
		else if (nc == columnWrk7Dtl_lot_insp_vld_pd) doWrk7Dtl_lot_insp_vld_pd_NC(info);
		else if (nc == columnWrk7Dtl_calc_pd_typ) doWrk7Dtl_calc_pd_typ_NC(info);
		else if (nc == columnWrk7Dtl_calc_pd_typ_nm) doWrk7Dtl_calc_pd_typ_nm_NC(info);
		else if (nc == columnWrk7Dtl_lot_insp_lmt_dt_frm_typ) doWrk7Dtl_lot_insp_lmt_dt_frm_typ_NC(info);
		else if (nc == columnWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm) doWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm_NC(info);
		else if (nc == columnWrk7Dtl_insp_inst_issue_typ) doWrk7Dtl_insp_inst_issue_typ_NC(info);
		else if (nc == columnWrk7Dtl_insp_inst_issue_typ_nm) doWrk7Dtl_insp_inst_issue_typ_nm_NC(info);
		else if (nc == columnWrk7Dtl_insp_offst) doWrk7Dtl_insp_offst_NC(info);
		else if (nc == columnWrk7Dtl_inst_rslt_issue_flg) doWrk7Dtl_inst_rslt_issue_flg_NC(info);
		else if (nc == columnWrk7Dtl_pre_insp_valid_flg) doWrk7Dtl_pre_insp_valid_flg_NC(info);
		else if (nc == columnWrk7Dtl_memo1) doWrk7Dtl_memo1_NC(info);
		else if (nc == columnWrk7Dtl_memo2) doWrk7Dtl_memo2_NC(info);
		else if (nc == columnWrk7Dtl_memo3) doWrk7Dtl_memo3_NC(info);
		else if (nc == columnWrk7Dtl_ins_usr_id) doWrk7Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk7Dtl_ins_usr_nm) doWrk7Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk7Dtl_ins_ts) doWrk7Dtl_ins_ts_NC(info);
		else if (nc == columnWrk7Dtl_ins_func_id) doWrk7Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk7Dtl_ins_func_nm) doWrk7Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk7Dtl_upd_cntr) doWrk7Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk7Dtl_upd_usr_id) doWrk7Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk7Dtl_upd_usr_nm) doWrk7Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk7Dtl_upd_ts) doWrk7Dtl_upd_ts_NC(info);
		else if (nc == columnWrk7Dtl_upd_func_id) doWrk7Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk7Dtl_upd_func_nm) doWrk7Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk7Dtl_upd_srv_req_no) doWrk7Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk7Dtl_del_usr_id) doWrk7Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk7Dtl_del_usr_nm) doWrk7Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk7Dtl_del_ts) doWrk7Dtl_del_ts_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ph_ex_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ph_ex_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_hrrchy_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bottom_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bottom_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[byprod_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_byprod_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_alloc_prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_alloc_prio_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_lot_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_lot_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[main_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_main_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_bom]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_bom_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_cost_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_cost_flg_NC(MCEventInfo info){
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
	 * [Wrk1Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_oper_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_lt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_lt_add_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_lt_add_qty_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_lt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt_add_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_lt_add_qty_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[accpt_insp_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_accpt_insp_lt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[buf_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_buf_lt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ord_fix_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ord_fix_pd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_week]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_week_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_sz_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_sz_pd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[min_lot_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_min_lot_qty_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[batch_lot_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_batch_lot_qty_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[max_lot_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_max_lot_qty_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[max_order]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_max_order_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_prio_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[order_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_order_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[yield_schd_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_yield_schd_qty_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_inst_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_inst_qty_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[fxd_rqmt_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_fxd_rqmt_qty_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_issue_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_issue_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_issue_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_issue_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[bkf_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_bkf_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ln_stk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ln_stk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[pre_po_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_pre_po_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[inst_rec_issue_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_inst_rec_issue_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[no_mfg_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_no_mfg_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_lower_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_lower_yield_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_std_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_std_yield_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_upper_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_upper_yield_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[po_batch_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_po_batch_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_unit_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_unit_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_std_qty1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_std_qty1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_unit_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_unit_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_std_qty2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_std_qty2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[not_mrp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_not_mrp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[cost_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_cost_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_seq_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_lt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lt_add_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_lt_add_qty_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_add_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_add_qty_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[def_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_def_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[unit_conv_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_unit_conv_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[unit_conv_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_unit_conv_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[yield_oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_yield_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[yield_oper_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_yield_oper_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_inst_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_inst_grp_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_fr_dt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_fr_dt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lower_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_lower_yield_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_std_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_std_yield_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_upper_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_upper_yield_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wip_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wip_rate_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[not_cost_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_not_cost_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_seq_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[fxd_wk_cost]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_fxd_wk_cost_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[not_cost_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_not_cost_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_prio_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[lot_sizing_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_lot_sizing_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_lt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_std_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_std_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[std_req_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_std_req_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[std_cnf_req_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_std_cnf_req_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_ctl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_ctl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[from_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_from_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[from_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_from_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[to_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_to_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[to_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_to_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[no_insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_no_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[no_mrkt_judg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_no_mrkt_judg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[no_plnt_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_no_plnt_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[no_insp_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_no_insp_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_dt_frm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_dt_frm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_dt_frm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_dt_frm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[vld_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_vld_pd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_pd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_vld_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lot_insp_vld_pd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[calc_pd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_calc_pd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[calc_pd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_calc_pd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_lmt_dt_frm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lot_insp_lmt_dt_frm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_lmt_dt_frm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_inst_issue_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_inst_issue_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_inst_issue_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_inst_issue_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_offst]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_offst_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[inst_rslt_issue_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_inst_rslt_issue_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pre_insp_valid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pre_insp_valid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == DtlTabTab) doDtlTab_NE(info);
		else if (ne == Wrk1DtlTable) doWrk1Dtl_NE(info);
		else if (ne == Wrk2DtlTable) doWrk2Dtl_NE(info);
		else if (ne == Wrk3DtlTable) doWrk3Dtl_NE(info);
		else if (ne == Wrk4DtlTable) doWrk4Dtl_NE(info);
		else if (ne == Wrk5DtlTable) doWrk5Dtl_NE(info);
		else if (ne == Wrk6DtlTable) doWrk6Dtl_NE(info);
		else if (ne == Wrk7DtlTable) doWrk7Dtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_base_dt) doCnd_base_dt_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_sno1_mng_typ) doCnd_sno1_mng_typ_NE(info);
		else if (ne == Cnd_sno2_mng_typ) doCnd_sno2_mng_typ_NE(info);
		else if (ne == Cnd_sno3_mng_typ) doCnd_sno3_mng_typ_NE(info);
		else if (ne == Cnd_sno4_mng_typ) doCnd_sno4_mng_typ_NE(info);
		else if (ne == Cnd_bom_ptn) doCnd_bom_ptn_NE(info);
		else if (ne == Cnd_bom_ptn_flg) doCnd_bom_ptn_flg_NE(info);
		else if (ne == Cnd_ph_ex_flg) doCnd_ph_ex_flg_NE(info);
		else if (ne == Cnd_max_hrrchy) doCnd_max_hrrchy_NE(info);
		else if (ne == Cnd_base_qty) doCnd_base_qty_NE(info);
		else if (ne == columnDtl_bottom_flg) doDtl_bottom_flg_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_byprod_flg) doDtl_byprod_flg_NE(info);
		else if (ne == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NE(info);
		else if (ne == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NE(info);
		else if (ne == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NE(info);
		else if (ne == columnDtl_unit_cd) doDtl_unit_cd_NE(info);
		else if (ne == columnDtl_dec_place) doDtl_dec_place_NE(info);
		else if (ne == columnDtl_bom_ptn) doDtl_bom_ptn_NE(info);
		else if (ne == columnDtl_oper_cd) doDtl_oper_cd_NE(info);
		else if (ne == columnDtl_oper_nm) doDtl_oper_nm_NE(info);
		else if (ne == columnDtl_oper_seq) doDtl_oper_seq_NE(info);
		else if (ne == columnDtl_ph_flg) doDtl_ph_flg_NE(info);
		else if (ne == columnDtl_ph_bom_ptn) doDtl_ph_bom_ptn_NE(info);
		else if (ne == columnDtl_alt_itm_flg) doDtl_alt_itm_flg_NE(info);
		else if (ne == columnDtl_alt_grp_cd) doDtl_alt_grp_cd_NE(info);
		else if (ne == columnDtl_alt_grp_nm) doDtl_alt_grp_nm_NE(info);
		else if (ne == columnDtl_alt_itm_typ) doDtl_alt_itm_typ_NE(info);
		else if (ne == columnDtl_alt_itm_typ_nm) doDtl_alt_itm_typ_nm_NE(info);
		else if (ne == columnDtl_alt_itm_ratio) doDtl_alt_itm_ratio_NE(info);
		else if (ne == columnDtl_alt_alloc_prio) doDtl_alt_alloc_prio_NE(info);
		else if (ne == columnDtl_sno_typ1) doDtl_sno_typ1_NE(info);
		else if (ne == columnDtl_sno_typ_nm1) doDtl_sno_typ_nm1_NE(info);
		else if (ne == columnDtl_sno_typ2) doDtl_sno_typ2_NE(info);
		else if (ne == columnDtl_sno_typ_nm2) doDtl_sno_typ_nm2_NE(info);
		else if (ne == columnDtl_sno_typ3) doDtl_sno_typ3_NE(info);
		else if (ne == columnDtl_sno_typ_nm3) doDtl_sno_typ_nm3_NE(info);
		else if (ne == columnDtl_sno_typ4) doDtl_sno_typ4_NE(info);
		else if (ne == columnDtl_sno_typ_nm4) doDtl_sno_typ_nm4_NE(info);
		else if (ne == columnDtl_chd_unit_cd) doDtl_chd_unit_cd_NE(info);
		else if (ne == columnDtl_chd_unit_nm) doDtl_chd_unit_nm_NE(info);
		else if (ne == columnDtl_chd_dec_place) doDtl_chd_dec_place_NE(info);
		else if (ne == columnDtl_in_offst_typ) doDtl_in_offst_typ_NE(info);
		else if (ne == columnDtl_in_offst_typ_nm) doDtl_in_offst_typ_nm_NE(info);
		else if (ne == columnDtl_in_offst) doDtl_in_offst_NE(info);
		else if (ne == columnDtl_bkf_typ) doDtl_bkf_typ_NE(info);
		else if (ne == columnDtl_bkf_typ_nm) doDtl_bkf_typ_nm_NE(info);
		else if (ne == columnDtl_inst_lot_fix_flg) doDtl_inst_lot_fix_flg_NE(info);
		else if (ne == columnDtl_lot_mix_flg) doDtl_lot_mix_flg_NE(info);
		else if (ne == columnDtl_sublot_mix_flg) doDtl_sublot_mix_flg_NE(info);
		else if (ne == columnDtl_alloc_ctl_typ) doDtl_alloc_ctl_typ_NE(info);
		else if (ne == columnDtl_alloc_ctl_typ_nm) doDtl_alloc_ctl_typ_nm_NE(info);
		else if (ne == columnDtl_main_itm_flg) doDtl_main_itm_flg_NE(info);
		else if (ne == columnDtl_yield_calc_flg) doDtl_yield_calc_flg_NE(info);
		else if (ne == columnDtl_inpt_ctl_typ) doDtl_inpt_ctl_typ_NE(info);
		else if (ne == columnDtl_inpt_ctl_typ_nm) doDtl_inpt_ctl_typ_nm_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_chng_no) doDtl_chng_no_NE(info);
		else if (ne == columnDtl_ext_sys_no_bom) doDtl_ext_sys_no_bom_NE(info);
		else if (ne == columnDtl_not_cost_flg) doDtl_not_cost_flg_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnWrk1Dtl_del_flg) doWrk1Dtl_del_flg_NE(info);
		else if (ne == columnWrk1Dtl_wg_cd) doWrk1Dtl_wg_cd_NE(info);
		else if (ne == columnWrk1Dtl_wg_nm) doWrk1Dtl_wg_nm_NE(info);
		else if (ne == columnWrk1Dtl_stk_mng_typ) doWrk1Dtl_stk_mng_typ_NE(info);
		else if (ne == columnWrk1Dtl_asset_mng_typ) doWrk1Dtl_asset_mng_typ_NE(info);
		else if (ne == columnWrk1Dtl_unit_cd) doWrk1Dtl_unit_cd_NE(info);
		else if (ne == columnWrk1Dtl_dec_place) doWrk1Dtl_dec_place_NE(info);
		else if (ne == columnWrk1Dtl_sno1_mng_typ) doWrk1Dtl_sno1_mng_typ_NE(info);
		else if (ne == columnWrk1Dtl_sno2_mng_typ) doWrk1Dtl_sno2_mng_typ_NE(info);
		else if (ne == columnWrk1Dtl_sno3_mng_typ) doWrk1Dtl_sno3_mng_typ_NE(info);
		else if (ne == columnWrk1Dtl_sno4_mng_typ) doWrk1Dtl_sno4_mng_typ_NE(info);
		else if (ne == columnWrk1Dtl_itm_typ) doWrk1Dtl_itm_typ_NE(info);
		else if (ne == columnWrk1Dtl_itm_typ_nm) doWrk1Dtl_itm_typ_nm_NE(info);
		else if (ne == columnWrk1Dtl_itm_typ_d_cd) doWrk1Dtl_itm_typ_d_cd_NE(info);
		else if (ne == columnWrk1Dtl_itm_typ_d_nm) doWrk1Dtl_itm_typ_d_nm_NE(info);
		else if (ne == columnWrk1Dtl_mfg_loc_cd) doWrk1Dtl_mfg_loc_cd_NE(info);
		else if (ne == columnWrk1Dtl_mfg_loc_nm) doWrk1Dtl_mfg_loc_nm_NE(info);
		else if (ne == columnWrk1Dtl_site_cd) doWrk1Dtl_site_cd_NE(info);
		else if (ne == columnWrk1Dtl_site_nm) doWrk1Dtl_site_nm_NE(info);
		else if (ne == columnWrk1Dtl_sppl_cd) doWrk1Dtl_sppl_cd_NE(info);
		else if (ne == columnWrk1Dtl_sppl_nm) doWrk1Dtl_sppl_nm_NE(info);
		else if (ne == columnWrk1Dtl_maker_cd) doWrk1Dtl_maker_cd_NE(info);
		else if (ne == columnWrk1Dtl_maker_nm) doWrk1Dtl_maker_nm_NE(info);
		else if (ne == columnWrk1Dtl_rqst_loc_cd) doWrk1Dtl_rqst_loc_cd_NE(info);
		else if (ne == columnWrk1Dtl_rqst_loc_nm) doWrk1Dtl_rqst_loc_nm_NE(info);
		else if (ne == columnWrk1Dtl_rqst_loc_wg_cd) doWrk1Dtl_rqst_loc_wg_cd_NE(info);
		else if (ne == columnWrk1Dtl_rqst_loc_wg_nm) doWrk1Dtl_rqst_loc_wg_nm_NE(info);
		else if (ne == columnWrk1Dtl_bom_ptn) doWrk1Dtl_bom_ptn_NE(info);
		else if (ne == columnWrk1Dtl_oper_ptn) doWrk1Dtl_oper_ptn_NE(info);
		else if (ne == columnWrk1Dtl_mfg_lt) doWrk1Dtl_mfg_lt_NE(info);
		else if (ne == columnWrk1Dtl_mfg_lt_add_qty) doWrk1Dtl_mfg_lt_add_qty_NE(info);
		else if (ne == columnWrk1Dtl_purc_lt) doWrk1Dtl_purc_lt_NE(info);
		else if (ne == columnWrk1Dtl_purc_lt_add_qty) doWrk1Dtl_purc_lt_add_qty_NE(info);
		else if (ne == columnWrk1Dtl_accpt_insp_lt) doWrk1Dtl_accpt_insp_lt_NE(info);
		else if (ne == columnWrk1Dtl_buf_lt) doWrk1Dtl_buf_lt_NE(info);
		else if (ne == columnWrk1Dtl_ord_fix_pd) doWrk1Dtl_ord_fix_pd_NE(info);
		else if (ne == columnWrk1Dtl_sz_day_week_typ) doWrk1Dtl_sz_day_week_typ_NE(info);
		else if (ne == columnWrk1Dtl_sz_day_week_typ_nm) doWrk1Dtl_sz_day_week_typ_nm_NE(info);
		else if (ne == columnWrk1Dtl_sz_week) doWrk1Dtl_sz_week_NE(info);
		else if (ne == columnWrk1Dtl_lot_sz_pd) doWrk1Dtl_lot_sz_pd_NE(info);
		else if (ne == columnWrk1Dtl_min_lot_qty) doWrk1Dtl_min_lot_qty_NE(info);
		else if (ne == columnWrk1Dtl_batch_lot_qty) doWrk1Dtl_batch_lot_qty_NE(info);
		else if (ne == columnWrk1Dtl_max_lot_qty) doWrk1Dtl_max_lot_qty_NE(info);
		else if (ne == columnWrk1Dtl_max_order) doWrk1Dtl_max_order_NE(info);
		else if (ne == columnWrk1Dtl_prio) doWrk1Dtl_prio_NE(info);
		else if (ne == columnWrk1Dtl_order_ratio) doWrk1Dtl_order_ratio_NE(info);
		else if (ne == columnWrk1Dtl_yield_schd_qty) doWrk1Dtl_yield_schd_qty_NE(info);
		else if (ne == columnWrk1Dtl_mfg_inst_qty) doWrk1Dtl_mfg_inst_qty_NE(info);
		else if (ne == columnWrk1Dtl_fxd_rqmt_qty) doWrk1Dtl_fxd_rqmt_qty_NE(info);
		else if (ne == columnWrk1Dtl_lot_issue_typ) doWrk1Dtl_lot_issue_typ_NE(info);
		else if (ne == columnWrk1Dtl_lot_issue_typ_nm) doWrk1Dtl_lot_issue_typ_nm_NE(info);
		else if (ne == columnWrk1Dtl_bkf_flg) doWrk1Dtl_bkf_flg_NE(info);
		else if (ne == columnWrk1Dtl_ln_stk_flg) doWrk1Dtl_ln_stk_flg_NE(info);
		else if (ne == columnWrk1Dtl_pre_po_tgt_flg) doWrk1Dtl_pre_po_tgt_flg_NE(info);
		else if (ne == columnWrk1Dtl_inst_rec_issue_flg) doWrk1Dtl_inst_rec_issue_flg_NE(info);
		else if (ne == columnWrk1Dtl_no_mfg_aprv_flg) doWrk1Dtl_no_mfg_aprv_flg_NE(info);
		else if (ne == columnWrk1Dtl_itm_lower_yield) doWrk1Dtl_itm_lower_yield_NE(info);
		else if (ne == columnWrk1Dtl_itm_std_yield) doWrk1Dtl_itm_std_yield_NE(info);
		else if (ne == columnWrk1Dtl_itm_upper_yield) doWrk1Dtl_itm_upper_yield_NE(info);
		else if (ne == columnWrk1Dtl_purc_id_typ) doWrk1Dtl_purc_id_typ_NE(info);
		else if (ne == columnWrk1Dtl_purc_id_typ_nm) doWrk1Dtl_purc_id_typ_nm_NE(info);
		else if (ne == columnWrk1Dtl_rqst_wg_cd) doWrk1Dtl_rqst_wg_cd_NE(info);
		else if (ne == columnWrk1Dtl_rqst_wg_nm) doWrk1Dtl_rqst_wg_nm_NE(info);
		else if (ne == columnWrk1Dtl_po_batch_flg) doWrk1Dtl_po_batch_flg_NE(info);
		else if (ne == columnWrk1Dtl_rsrc_cd1) doWrk1Dtl_rsrc_cd1_NE(info);
		else if (ne == columnWrk1Dtl_rsrc_nm1) doWrk1Dtl_rsrc_nm1_NE(info);
		else if (ne == columnWrk1Dtl_rsrc_unit_nm1) doWrk1Dtl_rsrc_unit_nm1_NE(info);
		else if (ne == columnWrk1Dtl_rsrc_std_qty1) doWrk1Dtl_rsrc_std_qty1_NE(info);
		else if (ne == columnWrk1Dtl_rsrc_cd2) doWrk1Dtl_rsrc_cd2_NE(info);
		else if (ne == columnWrk1Dtl_rsrc_nm2) doWrk1Dtl_rsrc_nm2_NE(info);
		else if (ne == columnWrk1Dtl_rsrc_unit_nm2) doWrk1Dtl_rsrc_unit_nm2_NE(info);
		else if (ne == columnWrk1Dtl_rsrc_std_qty2) doWrk1Dtl_rsrc_std_qty2_NE(info);
		else if (ne == columnWrk1Dtl_not_mrp_flg) doWrk1Dtl_not_mrp_flg_NE(info);
		else if (ne == columnWrk1Dtl_cost_ratio) doWrk1Dtl_cost_ratio_NE(info);
		else if (ne == columnWrk1Dtl_memo1) doWrk1Dtl_memo1_NE(info);
		else if (ne == columnWrk1Dtl_memo2) doWrk1Dtl_memo2_NE(info);
		else if (ne == columnWrk1Dtl_memo3) doWrk1Dtl_memo3_NE(info);
		else if (ne == columnWrk1Dtl_ins_usr_id) doWrk1Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk1Dtl_ins_usr_nm) doWrk1Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk1Dtl_ins_ts) doWrk1Dtl_ins_ts_NE(info);
		else if (ne == columnWrk1Dtl_ins_func_id) doWrk1Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk1Dtl_ins_func_nm) doWrk1Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk1Dtl_upd_cntr) doWrk1Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk1Dtl_upd_usr_id) doWrk1Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk1Dtl_upd_usr_nm) doWrk1Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk1Dtl_upd_ts) doWrk1Dtl_upd_ts_NE(info);
		else if (ne == columnWrk1Dtl_upd_func_id) doWrk1Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk1Dtl_upd_func_nm) doWrk1Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk1Dtl_upd_srv_req_no) doWrk1Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk1Dtl_del_usr_id) doWrk1Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk1Dtl_del_usr_nm) doWrk1Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk1Dtl_del_ts) doWrk1Dtl_del_ts_NE(info);
		else if (ne == columnWrk2Dtl_del_flg) doWrk2Dtl_del_flg_NE(info);
		else if (ne == columnWrk2Dtl_itm_unit_cd) doWrk2Dtl_itm_unit_cd_NE(info);
		else if (ne == columnWrk2Dtl_itm_dec_place) doWrk2Dtl_itm_dec_place_NE(info);
		else if (ne == columnWrk2Dtl_itm_typ) doWrk2Dtl_itm_typ_NE(info);
		else if (ne == columnWrk2Dtl_itm_typ_nm) doWrk2Dtl_itm_typ_nm_NE(info);
		else if (ne == columnWrk2Dtl_itm_typ_d_cd) doWrk2Dtl_itm_typ_d_cd_NE(info);
		else if (ne == columnWrk2Dtl_itm_typ_d_nm) doWrk2Dtl_itm_typ_d_nm_NE(info);
		else if (ne == columnWrk2Dtl_loc_cd) doWrk2Dtl_loc_cd_NE(info);
		else if (ne == columnWrk2Dtl_loc_nm) doWrk2Dtl_loc_nm_NE(info);
		else if (ne == columnWrk2Dtl_wg_cd) doWrk2Dtl_wg_cd_NE(info);
		else if (ne == columnWrk2Dtl_wg_nm) doWrk2Dtl_wg_nm_NE(info);
		else if (ne == columnWrk2Dtl_oper_ptn) doWrk2Dtl_oper_ptn_NE(info);
		else if (ne == columnWrk2Dtl_oper_cd) doWrk2Dtl_oper_cd_NE(info);
		else if (ne == columnWrk2Dtl_oper_nm) doWrk2Dtl_oper_nm_NE(info);
		else if (ne == columnWrk2Dtl_oper_seq) doWrk2Dtl_oper_seq_NE(info);
		else if (ne == columnWrk2Dtl_disp_seq) doWrk2Dtl_disp_seq_NE(info);
		else if (ne == columnWrk2Dtl_oper_lt) doWrk2Dtl_oper_lt_NE(info);
		else if (ne == columnWrk2Dtl_oper_lt_add_qty) doWrk2Dtl_oper_lt_add_qty_NE(info);
		else if (ne == columnWrk2Dtl_oper_offst_typ) doWrk2Dtl_oper_offst_typ_NE(info);
		else if (ne == columnWrk2Dtl_oper_offst_typ_nm) doWrk2Dtl_oper_offst_typ_nm_NE(info);
		else if (ne == columnWrk2Dtl_oper_offst) doWrk2Dtl_oper_offst_NE(info);
		else if (ne == columnWrk2Dtl_oper_offst_add_qty) doWrk2Dtl_oper_offst_add_qty_NE(info);
		else if (ne == columnWrk2Dtl_oper_unit_cd) doWrk2Dtl_oper_unit_cd_NE(info);
		else if (ne == columnWrk2Dtl_oper_unit_nm) doWrk2Dtl_oper_unit_nm_NE(info);
		else if (ne == columnWrk2Dtl_def_dec_place) doWrk2Dtl_def_dec_place_NE(info);
		else if (ne == columnWrk2Dtl_dec_place) doWrk2Dtl_dec_place_NE(info);
		else if (ne == columnWrk2Dtl_unit_conv_rnd_typ) doWrk2Dtl_unit_conv_rnd_typ_NE(info);
		else if (ne == columnWrk2Dtl_unit_conv_rnd_typ_nm) doWrk2Dtl_unit_conv_rnd_typ_nm_NE(info);
		else if (ne == columnWrk2Dtl_yield_oper_flg) doWrk2Dtl_yield_oper_flg_NE(info);
		else if (ne == columnWrk2Dtl_yield_oper_ratio) doWrk2Dtl_yield_oper_ratio_NE(info);
		else if (ne == columnWrk2Dtl_oper_inst_grp) doWrk2Dtl_oper_inst_grp_NE(info);
		else if (ne == columnWrk2Dtl_oper_loc_cd) doWrk2Dtl_oper_loc_cd_NE(info);
		else if (ne == columnWrk2Dtl_oper_loc_nm) doWrk2Dtl_oper_loc_nm_NE(info);
		else if (ne == columnWrk2Dtl_lmt_fr_dt_flg) doWrk2Dtl_lmt_fr_dt_flg_NE(info);
		else if (ne == columnWrk2Dtl_oper_lower_yield) doWrk2Dtl_oper_lower_yield_NE(info);
		else if (ne == columnWrk2Dtl_oper_std_yield) doWrk2Dtl_oper_std_yield_NE(info);
		else if (ne == columnWrk2Dtl_oper_upper_yield) doWrk2Dtl_oper_upper_yield_NE(info);
		else if (ne == columnWrk2Dtl_wip_rate) doWrk2Dtl_wip_rate_NE(info);
		else if (ne == columnWrk2Dtl_not_cost_flg) doWrk2Dtl_not_cost_flg_NE(info);
		else if (ne == columnWrk2Dtl_memo1) doWrk2Dtl_memo1_NE(info);
		else if (ne == columnWrk2Dtl_memo2) doWrk2Dtl_memo2_NE(info);
		else if (ne == columnWrk2Dtl_memo3) doWrk2Dtl_memo3_NE(info);
		else if (ne == columnWrk2Dtl_ins_usr_id) doWrk2Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk2Dtl_ins_usr_nm) doWrk2Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk2Dtl_ins_ts) doWrk2Dtl_ins_ts_NE(info);
		else if (ne == columnWrk2Dtl_ins_func_id) doWrk2Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk2Dtl_ins_func_nm) doWrk2Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk2Dtl_upd_cntr) doWrk2Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk2Dtl_upd_usr_id) doWrk2Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk2Dtl_upd_usr_nm) doWrk2Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk2Dtl_upd_ts) doWrk2Dtl_upd_ts_NE(info);
		else if (ne == columnWrk2Dtl_upd_func_id) doWrk2Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk2Dtl_upd_func_nm) doWrk2Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk2Dtl_upd_srv_req_no) doWrk2Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk2Dtl_del_usr_id) doWrk2Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk2Dtl_del_usr_nm) doWrk2Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk2Dtl_del_ts) doWrk2Dtl_del_ts_NE(info);
		else if (ne == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NE(info);
		else if (ne == columnWrk3Dtl_itm_typ) doWrk3Dtl_itm_typ_NE(info);
		else if (ne == columnWrk3Dtl_itm_typ_nm) doWrk3Dtl_itm_typ_nm_NE(info);
		else if (ne == columnWrk3Dtl_itm_typ_d_cd) doWrk3Dtl_itm_typ_d_cd_NE(info);
		else if (ne == columnWrk3Dtl_itm_typ_d_nm) doWrk3Dtl_itm_typ_d_nm_NE(info);
		else if (ne == columnWrk3Dtl_loc_cd) doWrk3Dtl_loc_cd_NE(info);
		else if (ne == columnWrk3Dtl_loc_nm) doWrk3Dtl_loc_nm_NE(info);
		else if (ne == columnWrk3Dtl_wg_cd) doWrk3Dtl_wg_cd_NE(info);
		else if (ne == columnWrk3Dtl_wg_nm) doWrk3Dtl_wg_nm_NE(info);
		else if (ne == columnWrk3Dtl_oper_ptn) doWrk3Dtl_oper_ptn_NE(info);
		else if (ne == columnWrk3Dtl_oper_cd) doWrk3Dtl_oper_cd_NE(info);
		else if (ne == columnWrk3Dtl_oper_nm) doWrk3Dtl_oper_nm_NE(info);
		else if (ne == columnWrk3Dtl_oper_seq) doWrk3Dtl_oper_seq_NE(info);
		else if (ne == columnWrk3Dtl_wk_cost_cd) doWrk3Dtl_wk_cost_cd_NE(info);
		else if (ne == columnWrk3Dtl_wk_cost_nm) doWrk3Dtl_wk_cost_nm_NE(info);
		else if (ne == columnWrk3Dtl_wk_cost_unit_nm) doWrk3Dtl_wk_cost_unit_nm_NE(info);
		else if (ne == columnWrk3Dtl_wk_cost_unit_dec_place) doWrk3Dtl_wk_cost_unit_dec_place_NE(info);
		else if (ne == columnWrk3Dtl_wk_cost_unit_rnd_typ) doWrk3Dtl_wk_cost_unit_rnd_typ_NE(info);
		else if (ne == columnWrk3Dtl_fxd_wk_cost) doWrk3Dtl_fxd_wk_cost_NE(info);
		else if (ne == columnWrk3Dtl_wk_cost) doWrk3Dtl_wk_cost_NE(info);
		else if (ne == columnWrk3Dtl_base_unit_cd) doWrk3Dtl_base_unit_cd_NE(info);
		else if (ne == columnWrk3Dtl_base_unit_nm) doWrk3Dtl_base_unit_nm_NE(info);
		else if (ne == columnWrk3Dtl_itm_dec_place) doWrk3Dtl_itm_dec_place_NE(info);
		else if (ne == columnWrk3Dtl_wk_cost_calc_flg) doWrk3Dtl_wk_cost_calc_flg_NE(info);
		else if (ne == columnWrk3Dtl_disp_seq) doWrk3Dtl_disp_seq_NE(info);
		else if (ne == columnWrk3Dtl_not_cost_flg) doWrk3Dtl_not_cost_flg_NE(info);
		else if (ne == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_NE(info);
		else if (ne == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_NE(info);
		else if (ne == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_NE(info);
		else if (ne == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_NE(info);
		else if (ne == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_NE(info);
		else if (ne == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_NE(info);
		else if (ne == columnWrk4Dtl_del_flg) doWrk4Dtl_del_flg_NE(info);
		else if (ne == columnWrk4Dtl_itm_typ) doWrk4Dtl_itm_typ_NE(info);
		else if (ne == columnWrk4Dtl_itm_typ_nm) doWrk4Dtl_itm_typ_nm_NE(info);
		else if (ne == columnWrk4Dtl_itm_typ_d_cd) doWrk4Dtl_itm_typ_d_cd_NE(info);
		else if (ne == columnWrk4Dtl_itm_typ_d_nm) doWrk4Dtl_itm_typ_d_nm_NE(info);
		else if (ne == columnWrk4Dtl_loc_cd) doWrk4Dtl_loc_cd_NE(info);
		else if (ne == columnWrk4Dtl_loc_nm) doWrk4Dtl_loc_nm_NE(info);
		else if (ne == columnWrk4Dtl_wg_cd) doWrk4Dtl_wg_cd_NE(info);
		else if (ne == columnWrk4Dtl_wg_nm) doWrk4Dtl_wg_nm_NE(info);
		else if (ne == columnWrk4Dtl_loc_grp_cd) doWrk4Dtl_loc_grp_cd_NE(info);
		else if (ne == columnWrk4Dtl_loc_grp_nm) doWrk4Dtl_loc_grp_nm_NE(info);
		else if (ne == columnWrk4Dtl_prio) doWrk4Dtl_prio_NE(info);
		else if (ne == columnWrk4Dtl_memo1) doWrk4Dtl_memo1_NE(info);
		else if (ne == columnWrk4Dtl_memo2) doWrk4Dtl_memo2_NE(info);
		else if (ne == columnWrk4Dtl_memo3) doWrk4Dtl_memo3_NE(info);
		else if (ne == columnWrk4Dtl_ins_usr_id) doWrk4Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk4Dtl_ins_usr_nm) doWrk4Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk4Dtl_ins_ts) doWrk4Dtl_ins_ts_NE(info);
		else if (ne == columnWrk4Dtl_ins_func_id) doWrk4Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk4Dtl_ins_func_nm) doWrk4Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk4Dtl_upd_cntr) doWrk4Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk4Dtl_upd_usr_id) doWrk4Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk4Dtl_upd_usr_nm) doWrk4Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk4Dtl_upd_ts) doWrk4Dtl_upd_ts_NE(info);
		else if (ne == columnWrk4Dtl_upd_func_id) doWrk4Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk4Dtl_upd_func_nm) doWrk4Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk4Dtl_upd_srv_req_no) doWrk4Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk4Dtl_del_usr_id) doWrk4Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk4Dtl_del_usr_nm) doWrk4Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk4Dtl_del_ts) doWrk4Dtl_del_ts_NE(info);
		else if (ne == columnWrk5Dtl_del_flg) doWrk5Dtl_del_flg_NE(info);
		else if (ne == columnWrk5Dtl_dec_place) doWrk5Dtl_dec_place_NE(info);
		else if (ne == columnWrk5Dtl_itm_typ) doWrk5Dtl_itm_typ_NE(info);
		else if (ne == columnWrk5Dtl_itm_typ_nm) doWrk5Dtl_itm_typ_nm_NE(info);
		else if (ne == columnWrk5Dtl_itm_typ_d_cd) doWrk5Dtl_itm_typ_d_cd_NE(info);
		else if (ne == columnWrk5Dtl_itm_typ_d_nm) doWrk5Dtl_itm_typ_d_nm_NE(info);
		else if (ne == columnWrk5Dtl_loc_cd) doWrk5Dtl_loc_cd_NE(info);
		else if (ne == columnWrk5Dtl_loc_nm) doWrk5Dtl_loc_nm_NE(info);
		else if (ne == columnWrk5Dtl_wg_cd) doWrk5Dtl_wg_cd_NE(info);
		else if (ne == columnWrk5Dtl_wg_nm) doWrk5Dtl_wg_nm_NE(info);
		else if (ne == columnWrk5Dtl_gi_schd_flg) doWrk5Dtl_gi_schd_flg_NE(info);
		else if (ne == columnWrk5Dtl_base_unit_cd) doWrk5Dtl_base_unit_cd_NE(info);
		else if (ne == columnWrk5Dtl_base_unit_nm) doWrk5Dtl_base_unit_nm_NE(info);
		else if (ne == columnWrk5Dtl_lot_sizing_flg) doWrk5Dtl_lot_sizing_flg_NE(info);
		else if (ne == columnWrk5Dtl_gi_loc_cd) doWrk5Dtl_gi_loc_cd_NE(info);
		else if (ne == columnWrk5Dtl_gi_loc_nm) doWrk5Dtl_gi_loc_nm_NE(info);
		else if (ne == columnWrk5Dtl_gi_str_ln_tgt_flg) doWrk5Dtl_gi_str_ln_tgt_flg_NE(info);
		else if (ne == columnWrk5Dtl_inpt_gi_loc_cd) doWrk5Dtl_inpt_gi_loc_cd_NE(info);
		else if (ne == columnWrk5Dtl_inpt_gi_loc_nm) doWrk5Dtl_inpt_gi_loc_nm_NE(info);
		else if (ne == columnWrk5Dtl_inpt_gi_str_ln_tgt_flg) doWrk5Dtl_inpt_gi_str_ln_tgt_flg_NE(info);
		else if (ne == columnWrk5Dtl_ship_gi_loc_cd) doWrk5Dtl_ship_gi_loc_cd_NE(info);
		else if (ne == columnWrk5Dtl_ship_gi_loc_nm) doWrk5Dtl_ship_gi_loc_nm_NE(info);
		else if (ne == columnWrk5Dtl_ship_gi_str_ln_tgt_flg) doWrk5Dtl_ship_gi_str_ln_tgt_flg_NE(info);
		else if (ne == columnWrk5Dtl_memo1) doWrk5Dtl_memo1_NE(info);
		else if (ne == columnWrk5Dtl_memo2) doWrk5Dtl_memo2_NE(info);
		else if (ne == columnWrk5Dtl_memo3) doWrk5Dtl_memo3_NE(info);
		else if (ne == columnWrk5Dtl_ins_usr_id) doWrk5Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk5Dtl_ins_usr_nm) doWrk5Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk5Dtl_ins_ts) doWrk5Dtl_ins_ts_NE(info);
		else if (ne == columnWrk5Dtl_ins_func_id) doWrk5Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk5Dtl_ins_func_nm) doWrk5Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk5Dtl_upd_cntr) doWrk5Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk5Dtl_upd_usr_id) doWrk5Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk5Dtl_upd_usr_nm) doWrk5Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk5Dtl_upd_ts) doWrk5Dtl_upd_ts_NE(info);
		else if (ne == columnWrk5Dtl_upd_func_id) doWrk5Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk5Dtl_upd_func_nm) doWrk5Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk5Dtl_upd_srv_req_no) doWrk5Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk5Dtl_del_usr_id) doWrk5Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk5Dtl_del_usr_nm) doWrk5Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk5Dtl_del_ts) doWrk5Dtl_del_ts_NE(info);
		else if (ne == columnWrk6Dtl_del_flg) doWrk6Dtl_del_flg_NE(info);
		else if (ne == columnWrk6Dtl_itm_typ) doWrk6Dtl_itm_typ_NE(info);
		else if (ne == columnWrk6Dtl_itm_typ_nm) doWrk6Dtl_itm_typ_nm_NE(info);
		else if (ne == columnWrk6Dtl_itm_typ_d_cd) doWrk6Dtl_itm_typ_d_cd_NE(info);
		else if (ne == columnWrk6Dtl_itm_typ_d_nm) doWrk6Dtl_itm_typ_d_nm_NE(info);
		else if (ne == columnWrk6Dtl_insp_ptn_cd) doWrk6Dtl_insp_ptn_cd_NE(info);
		else if (ne == columnWrk6Dtl_insp_ptn_nm) doWrk6Dtl_insp_ptn_nm_NE(info);
		else if (ne == columnWrk6Dtl_insp_mtd_typ) doWrk6Dtl_insp_mtd_typ_NE(info);
		else if (ne == columnWrk6Dtl_insp_mtd_typ_nm) doWrk6Dtl_insp_mtd_typ_nm_NE(info);
		else if (ne == columnWrk6Dtl_insp_lt) doWrk6Dtl_insp_lt_NE(info);
		else if (ne == columnWrk6Dtl_insp_std_no) doWrk6Dtl_insp_std_no_NE(info);
		else if (ne == columnWrk6Dtl_unit_cd) doWrk6Dtl_unit_cd_NE(info);
		else if (ne == columnWrk6Dtl_dec_place) doWrk6Dtl_dec_place_NE(info);
		else if (ne == columnWrk6Dtl_std_req_flg) doWrk6Dtl_std_req_flg_NE(info);
		else if (ne == columnWrk6Dtl_std_cnf_req_flg) doWrk6Dtl_std_cnf_req_flg_NE(info);
		else if (ne == columnWrk6Dtl_memo1) doWrk6Dtl_memo1_NE(info);
		else if (ne == columnWrk6Dtl_memo2) doWrk6Dtl_memo2_NE(info);
		else if (ne == columnWrk6Dtl_memo3) doWrk6Dtl_memo3_NE(info);
		else if (ne == columnWrk6Dtl_ins_usr_id) doWrk6Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk6Dtl_ins_usr_nm) doWrk6Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk6Dtl_ins_ts) doWrk6Dtl_ins_ts_NE(info);
		else if (ne == columnWrk6Dtl_ins_func_id) doWrk6Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk6Dtl_ins_func_nm) doWrk6Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk6Dtl_upd_cntr) doWrk6Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk6Dtl_upd_usr_id) doWrk6Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk6Dtl_upd_usr_nm) doWrk6Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk6Dtl_upd_ts) doWrk6Dtl_upd_ts_NE(info);
		else if (ne == columnWrk6Dtl_upd_func_id) doWrk6Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk6Dtl_upd_func_nm) doWrk6Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk6Dtl_upd_srv_req_no) doWrk6Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk6Dtl_del_usr_id) doWrk6Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk6Dtl_del_usr_nm) doWrk6Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk6Dtl_del_ts) doWrk6Dtl_del_ts_NE(info);
		else if (ne == columnWrk7Dtl_del_flg) doWrk7Dtl_del_flg_NE(info);
		else if (ne == columnWrk7Dtl_itm_typ) doWrk7Dtl_itm_typ_NE(info);
		else if (ne == columnWrk7Dtl_itm_typ_nm) doWrk7Dtl_itm_typ_nm_NE(info);
		else if (ne == columnWrk7Dtl_itm_typ_d_cd) doWrk7Dtl_itm_typ_d_cd_NE(info);
		else if (ne == columnWrk7Dtl_itm_typ_d_nm) doWrk7Dtl_itm_typ_d_nm_NE(info);
		else if (ne == columnWrk7Dtl_lmt_ctl_flg) doWrk7Dtl_lmt_ctl_flg_NE(info);
		else if (ne == columnWrk7Dtl_mfg_loc_cd) doWrk7Dtl_mfg_loc_cd_NE(info);
		else if (ne == columnWrk7Dtl_mfg_loc_nm) doWrk7Dtl_mfg_loc_nm_NE(info);
		else if (ne == columnWrk7Dtl_sppl_cd) doWrk7Dtl_sppl_cd_NE(info);
		else if (ne == columnWrk7Dtl_sppl_nm) doWrk7Dtl_sppl_nm_NE(info);
		else if (ne == columnWrk7Dtl_maker_cd) doWrk7Dtl_maker_cd_NE(info);
		else if (ne == columnWrk7Dtl_maker_nm) doWrk7Dtl_maker_nm_NE(info);
		else if (ne == columnWrk7Dtl_from_site_cd) doWrk7Dtl_from_site_cd_NE(info);
		else if (ne == columnWrk7Dtl_from_site_nm) doWrk7Dtl_from_site_nm_NE(info);
		else if (ne == columnWrk7Dtl_to_site_cd) doWrk7Dtl_to_site_cd_NE(info);
		else if (ne == columnWrk7Dtl_to_site_nm) doWrk7Dtl_to_site_nm_NE(info);
		else if (ne == columnWrk7Dtl_no_insp_flg) doWrk7Dtl_no_insp_flg_NE(info);
		else if (ne == columnWrk7Dtl_insp_ptn_cd) doWrk7Dtl_insp_ptn_cd_NE(info);
		else if (ne == columnWrk7Dtl_insp_ptn_nm) doWrk7Dtl_insp_ptn_nm_NE(info);
		else if (ne == columnWrk7Dtl_no_mrkt_judg_flg) doWrk7Dtl_no_mrkt_judg_flg_NE(info);
		else if (ne == columnWrk7Dtl_no_plnt_aprv_flg) doWrk7Dtl_no_plnt_aprv_flg_NE(info);
		else if (ne == columnWrk7Dtl_no_insp_aprv_flg) doWrk7Dtl_no_insp_aprv_flg_NE(info);
		else if (ne == columnWrk7Dtl_lmt_dt_frm_typ) doWrk7Dtl_lmt_dt_frm_typ_NE(info);
		else if (ne == columnWrk7Dtl_lmt_dt_frm_typ_nm) doWrk7Dtl_lmt_dt_frm_typ_nm_NE(info);
		else if (ne == columnWrk7Dtl_vld_pd) doWrk7Dtl_vld_pd_NE(info);
		else if (ne == columnWrk7Dtl_lmt_pd) doWrk7Dtl_lmt_pd_NE(info);
		else if (ne == columnWrk7Dtl_lot_insp_vld_pd) doWrk7Dtl_lot_insp_vld_pd_NE(info);
		else if (ne == columnWrk7Dtl_calc_pd_typ) doWrk7Dtl_calc_pd_typ_NE(info);
		else if (ne == columnWrk7Dtl_calc_pd_typ_nm) doWrk7Dtl_calc_pd_typ_nm_NE(info);
		else if (ne == columnWrk7Dtl_lot_insp_lmt_dt_frm_typ) doWrk7Dtl_lot_insp_lmt_dt_frm_typ_NE(info);
		else if (ne == columnWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm) doWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm_NE(info);
		else if (ne == columnWrk7Dtl_insp_inst_issue_typ) doWrk7Dtl_insp_inst_issue_typ_NE(info);
		else if (ne == columnWrk7Dtl_insp_inst_issue_typ_nm) doWrk7Dtl_insp_inst_issue_typ_nm_NE(info);
		else if (ne == columnWrk7Dtl_insp_offst) doWrk7Dtl_insp_offst_NE(info);
		else if (ne == columnWrk7Dtl_inst_rslt_issue_flg) doWrk7Dtl_inst_rslt_issue_flg_NE(info);
		else if (ne == columnWrk7Dtl_pre_insp_valid_flg) doWrk7Dtl_pre_insp_valid_flg_NE(info);
		else if (ne == columnWrk7Dtl_memo1) doWrk7Dtl_memo1_NE(info);
		else if (ne == columnWrk7Dtl_memo2) doWrk7Dtl_memo2_NE(info);
		else if (ne == columnWrk7Dtl_memo3) doWrk7Dtl_memo3_NE(info);
		else if (ne == columnWrk7Dtl_ins_usr_id) doWrk7Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk7Dtl_ins_usr_nm) doWrk7Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk7Dtl_ins_ts) doWrk7Dtl_ins_ts_NE(info);
		else if (ne == columnWrk7Dtl_ins_func_id) doWrk7Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk7Dtl_ins_func_nm) doWrk7Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk7Dtl_upd_cntr) doWrk7Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk7Dtl_upd_usr_id) doWrk7Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk7Dtl_upd_usr_nm) doWrk7Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk7Dtl_upd_ts) doWrk7Dtl_upd_ts_NE(info);
		else if (ne == columnWrk7Dtl_upd_func_id) doWrk7Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk7Dtl_upd_func_nm) doWrk7Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk7Dtl_upd_srv_req_no) doWrk7Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk7Dtl_del_usr_id) doWrk7Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk7Dtl_del_usr_nm) doWrk7Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk7Dtl_del_ts) doWrk7Dtl_del_ts_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [DtlTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ph_ex_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ph_ex_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_hrrchy_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bottom_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bottom_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[byprod_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_byprod_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_alloc_prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_alloc_prio_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_lot_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_lot_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[main_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_main_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_bom]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_bom_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_cost_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_cost_flg_NE(MCEventInfo info){
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
	 * [Wrk1Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_oper_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_lt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_lt_add_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_lt_add_qty_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_lt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt_add_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_lt_add_qty_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[accpt_insp_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_accpt_insp_lt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[buf_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_buf_lt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ord_fix_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ord_fix_pd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_week]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_week_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_sz_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_sz_pd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[min_lot_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_min_lot_qty_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[batch_lot_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_batch_lot_qty_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[max_lot_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_max_lot_qty_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[max_order]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_max_order_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_prio_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[order_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_order_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[yield_schd_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_yield_schd_qty_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_inst_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_inst_qty_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[fxd_rqmt_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_fxd_rqmt_qty_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_issue_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_issue_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_issue_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_issue_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[bkf_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_bkf_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ln_stk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ln_stk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[pre_po_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_pre_po_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[inst_rec_issue_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_inst_rec_issue_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[no_mfg_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_no_mfg_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_lower_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_lower_yield_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_std_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_std_yield_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_upper_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_upper_yield_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[po_batch_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_po_batch_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_unit_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_unit_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_std_qty1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_std_qty1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_unit_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_unit_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_std_qty2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_std_qty2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[not_mrp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_not_mrp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[cost_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_cost_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_seq_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_lt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lt_add_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_lt_add_qty_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_add_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_add_qty_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[def_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_def_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[unit_conv_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_unit_conv_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[unit_conv_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_unit_conv_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[yield_oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_yield_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[yield_oper_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_yield_oper_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_inst_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_inst_grp_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_fr_dt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_fr_dt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lower_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_lower_yield_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_std_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_std_yield_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_upper_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_upper_yield_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wip_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wip_rate_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[not_cost_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_not_cost_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_seq_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[fxd_wk_cost]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_fxd_wk_cost_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[not_cost_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_not_cost_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_prio_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[lot_sizing_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_lot_sizing_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_lt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_std_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_std_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[std_req_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_std_req_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[std_cnf_req_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_std_cnf_req_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_ctl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_ctl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[from_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_from_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[from_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_from_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[to_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_to_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[to_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_to_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[no_insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_no_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[no_mrkt_judg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_no_mrkt_judg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[no_plnt_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_no_plnt_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[no_insp_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_no_insp_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_dt_frm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_dt_frm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_dt_frm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_dt_frm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[vld_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_vld_pd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_pd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_vld_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lot_insp_vld_pd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[calc_pd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_calc_pd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[calc_pd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_calc_pd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_lmt_dt_frm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lot_insp_lmt_dt_frm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_lmt_dt_frm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_inst_issue_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_inst_issue_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_inst_issue_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_inst_issue_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_offst]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_offst_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[inst_rslt_issue_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_inst_rslt_issue_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pre_insp_valid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pre_insp_valid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == DtlTabTab) doDtlTab_NX(info);
		else if (nx == Wrk1DtlTable) doWrk1Dtl_NX(info);
		else if (nx == Wrk2DtlTable) doWrk2Dtl_NX(info);
		else if (nx == Wrk3DtlTable) doWrk3Dtl_NX(info);
		else if (nx == Wrk4DtlTable) doWrk4Dtl_NX(info);
		else if (nx == Wrk5DtlTable) doWrk5Dtl_NX(info);
		else if (nx == Wrk6DtlTable) doWrk6Dtl_NX(info);
		else if (nx == Wrk7DtlTable) doWrk7Dtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_base_dt) doCnd_base_dt_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_sno1_mng_typ) doCnd_sno1_mng_typ_NX(info);
		else if (nx == Cnd_sno2_mng_typ) doCnd_sno2_mng_typ_NX(info);
		else if (nx == Cnd_sno3_mng_typ) doCnd_sno3_mng_typ_NX(info);
		else if (nx == Cnd_sno4_mng_typ) doCnd_sno4_mng_typ_NX(info);
		else if (nx == Cnd_bom_ptn) doCnd_bom_ptn_NX(info);
		else if (nx == Cnd_bom_ptn_flg) doCnd_bom_ptn_flg_NX(info);
		else if (nx == Cnd_ph_ex_flg) doCnd_ph_ex_flg_NX(info);
		else if (nx == Cnd_max_hrrchy) doCnd_max_hrrchy_NX(info);
		else if (nx == Cnd_base_qty) doCnd_base_qty_NX(info);
		else if (nx == columnDtl_bottom_flg) doDtl_bottom_flg_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_byprod_flg) doDtl_byprod_flg_NX(info);
		else if (nx == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NX(info);
		else if (nx == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NX(info);
		else if (nx == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NX(info);
		else if (nx == columnDtl_unit_cd) doDtl_unit_cd_NX(info);
		else if (nx == columnDtl_dec_place) doDtl_dec_place_NX(info);
		else if (nx == columnDtl_bom_ptn) doDtl_bom_ptn_NX(info);
		else if (nx == columnDtl_oper_cd) doDtl_oper_cd_NX(info);
		else if (nx == columnDtl_oper_nm) doDtl_oper_nm_NX(info);
		else if (nx == columnDtl_oper_seq) doDtl_oper_seq_NX(info);
		else if (nx == columnDtl_ph_flg) doDtl_ph_flg_NX(info);
		else if (nx == columnDtl_ph_bom_ptn) doDtl_ph_bom_ptn_NX(info);
		else if (nx == columnDtl_alt_itm_flg) doDtl_alt_itm_flg_NX(info);
		else if (nx == columnDtl_alt_grp_cd) doDtl_alt_grp_cd_NX(info);
		else if (nx == columnDtl_alt_grp_nm) doDtl_alt_grp_nm_NX(info);
		else if (nx == columnDtl_alt_itm_typ) doDtl_alt_itm_typ_NX(info);
		else if (nx == columnDtl_alt_itm_typ_nm) doDtl_alt_itm_typ_nm_NX(info);
		else if (nx == columnDtl_alt_itm_ratio) doDtl_alt_itm_ratio_NX(info);
		else if (nx == columnDtl_alt_alloc_prio) doDtl_alt_alloc_prio_NX(info);
		else if (nx == columnDtl_sno_typ1) doDtl_sno_typ1_NX(info);
		else if (nx == columnDtl_sno_typ_nm1) doDtl_sno_typ_nm1_NX(info);
		else if (nx == columnDtl_sno_typ2) doDtl_sno_typ2_NX(info);
		else if (nx == columnDtl_sno_typ_nm2) doDtl_sno_typ_nm2_NX(info);
		else if (nx == columnDtl_sno_typ3) doDtl_sno_typ3_NX(info);
		else if (nx == columnDtl_sno_typ_nm3) doDtl_sno_typ_nm3_NX(info);
		else if (nx == columnDtl_sno_typ4) doDtl_sno_typ4_NX(info);
		else if (nx == columnDtl_sno_typ_nm4) doDtl_sno_typ_nm4_NX(info);
		else if (nx == columnDtl_chd_unit_cd) doDtl_chd_unit_cd_NX(info);
		else if (nx == columnDtl_chd_unit_nm) doDtl_chd_unit_nm_NX(info);
		else if (nx == columnDtl_chd_dec_place) doDtl_chd_dec_place_NX(info);
		else if (nx == columnDtl_in_offst_typ) doDtl_in_offst_typ_NX(info);
		else if (nx == columnDtl_in_offst_typ_nm) doDtl_in_offst_typ_nm_NX(info);
		else if (nx == columnDtl_in_offst) doDtl_in_offst_NX(info);
		else if (nx == columnDtl_bkf_typ) doDtl_bkf_typ_NX(info);
		else if (nx == columnDtl_bkf_typ_nm) doDtl_bkf_typ_nm_NX(info);
		else if (nx == columnDtl_inst_lot_fix_flg) doDtl_inst_lot_fix_flg_NX(info);
		else if (nx == columnDtl_lot_mix_flg) doDtl_lot_mix_flg_NX(info);
		else if (nx == columnDtl_sublot_mix_flg) doDtl_sublot_mix_flg_NX(info);
		else if (nx == columnDtl_alloc_ctl_typ) doDtl_alloc_ctl_typ_NX(info);
		else if (nx == columnDtl_alloc_ctl_typ_nm) doDtl_alloc_ctl_typ_nm_NX(info);
		else if (nx == columnDtl_main_itm_flg) doDtl_main_itm_flg_NX(info);
		else if (nx == columnDtl_yield_calc_flg) doDtl_yield_calc_flg_NX(info);
		else if (nx == columnDtl_inpt_ctl_typ) doDtl_inpt_ctl_typ_NX(info);
		else if (nx == columnDtl_inpt_ctl_typ_nm) doDtl_inpt_ctl_typ_nm_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_chng_no) doDtl_chng_no_NX(info);
		else if (nx == columnDtl_ext_sys_no_bom) doDtl_ext_sys_no_bom_NX(info);
		else if (nx == columnDtl_not_cost_flg) doDtl_not_cost_flg_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnWrk1Dtl_del_flg) doWrk1Dtl_del_flg_NX(info);
		else if (nx == columnWrk1Dtl_wg_cd) doWrk1Dtl_wg_cd_NX(info);
		else if (nx == columnWrk1Dtl_wg_nm) doWrk1Dtl_wg_nm_NX(info);
		else if (nx == columnWrk1Dtl_stk_mng_typ) doWrk1Dtl_stk_mng_typ_NX(info);
		else if (nx == columnWrk1Dtl_asset_mng_typ) doWrk1Dtl_asset_mng_typ_NX(info);
		else if (nx == columnWrk1Dtl_unit_cd) doWrk1Dtl_unit_cd_NX(info);
		else if (nx == columnWrk1Dtl_dec_place) doWrk1Dtl_dec_place_NX(info);
		else if (nx == columnWrk1Dtl_sno1_mng_typ) doWrk1Dtl_sno1_mng_typ_NX(info);
		else if (nx == columnWrk1Dtl_sno2_mng_typ) doWrk1Dtl_sno2_mng_typ_NX(info);
		else if (nx == columnWrk1Dtl_sno3_mng_typ) doWrk1Dtl_sno3_mng_typ_NX(info);
		else if (nx == columnWrk1Dtl_sno4_mng_typ) doWrk1Dtl_sno4_mng_typ_NX(info);
		else if (nx == columnWrk1Dtl_itm_typ) doWrk1Dtl_itm_typ_NX(info);
		else if (nx == columnWrk1Dtl_itm_typ_nm) doWrk1Dtl_itm_typ_nm_NX(info);
		else if (nx == columnWrk1Dtl_itm_typ_d_cd) doWrk1Dtl_itm_typ_d_cd_NX(info);
		else if (nx == columnWrk1Dtl_itm_typ_d_nm) doWrk1Dtl_itm_typ_d_nm_NX(info);
		else if (nx == columnWrk1Dtl_mfg_loc_cd) doWrk1Dtl_mfg_loc_cd_NX(info);
		else if (nx == columnWrk1Dtl_mfg_loc_nm) doWrk1Dtl_mfg_loc_nm_NX(info);
		else if (nx == columnWrk1Dtl_site_cd) doWrk1Dtl_site_cd_NX(info);
		else if (nx == columnWrk1Dtl_site_nm) doWrk1Dtl_site_nm_NX(info);
		else if (nx == columnWrk1Dtl_sppl_cd) doWrk1Dtl_sppl_cd_NX(info);
		else if (nx == columnWrk1Dtl_sppl_nm) doWrk1Dtl_sppl_nm_NX(info);
		else if (nx == columnWrk1Dtl_maker_cd) doWrk1Dtl_maker_cd_NX(info);
		else if (nx == columnWrk1Dtl_maker_nm) doWrk1Dtl_maker_nm_NX(info);
		else if (nx == columnWrk1Dtl_rqst_loc_cd) doWrk1Dtl_rqst_loc_cd_NX(info);
		else if (nx == columnWrk1Dtl_rqst_loc_nm) doWrk1Dtl_rqst_loc_nm_NX(info);
		else if (nx == columnWrk1Dtl_rqst_loc_wg_cd) doWrk1Dtl_rqst_loc_wg_cd_NX(info);
		else if (nx == columnWrk1Dtl_rqst_loc_wg_nm) doWrk1Dtl_rqst_loc_wg_nm_NX(info);
		else if (nx == columnWrk1Dtl_bom_ptn) doWrk1Dtl_bom_ptn_NX(info);
		else if (nx == columnWrk1Dtl_oper_ptn) doWrk1Dtl_oper_ptn_NX(info);
		else if (nx == columnWrk1Dtl_mfg_lt) doWrk1Dtl_mfg_lt_NX(info);
		else if (nx == columnWrk1Dtl_mfg_lt_add_qty) doWrk1Dtl_mfg_lt_add_qty_NX(info);
		else if (nx == columnWrk1Dtl_purc_lt) doWrk1Dtl_purc_lt_NX(info);
		else if (nx == columnWrk1Dtl_purc_lt_add_qty) doWrk1Dtl_purc_lt_add_qty_NX(info);
		else if (nx == columnWrk1Dtl_accpt_insp_lt) doWrk1Dtl_accpt_insp_lt_NX(info);
		else if (nx == columnWrk1Dtl_buf_lt) doWrk1Dtl_buf_lt_NX(info);
		else if (nx == columnWrk1Dtl_ord_fix_pd) doWrk1Dtl_ord_fix_pd_NX(info);
		else if (nx == columnWrk1Dtl_sz_day_week_typ) doWrk1Dtl_sz_day_week_typ_NX(info);
		else if (nx == columnWrk1Dtl_sz_day_week_typ_nm) doWrk1Dtl_sz_day_week_typ_nm_NX(info);
		else if (nx == columnWrk1Dtl_sz_week) doWrk1Dtl_sz_week_NX(info);
		else if (nx == columnWrk1Dtl_lot_sz_pd) doWrk1Dtl_lot_sz_pd_NX(info);
		else if (nx == columnWrk1Dtl_min_lot_qty) doWrk1Dtl_min_lot_qty_NX(info);
		else if (nx == columnWrk1Dtl_batch_lot_qty) doWrk1Dtl_batch_lot_qty_NX(info);
		else if (nx == columnWrk1Dtl_max_lot_qty) doWrk1Dtl_max_lot_qty_NX(info);
		else if (nx == columnWrk1Dtl_max_order) doWrk1Dtl_max_order_NX(info);
		else if (nx == columnWrk1Dtl_prio) doWrk1Dtl_prio_NX(info);
		else if (nx == columnWrk1Dtl_order_ratio) doWrk1Dtl_order_ratio_NX(info);
		else if (nx == columnWrk1Dtl_yield_schd_qty) doWrk1Dtl_yield_schd_qty_NX(info);
		else if (nx == columnWrk1Dtl_mfg_inst_qty) doWrk1Dtl_mfg_inst_qty_NX(info);
		else if (nx == columnWrk1Dtl_fxd_rqmt_qty) doWrk1Dtl_fxd_rqmt_qty_NX(info);
		else if (nx == columnWrk1Dtl_lot_issue_typ) doWrk1Dtl_lot_issue_typ_NX(info);
		else if (nx == columnWrk1Dtl_lot_issue_typ_nm) doWrk1Dtl_lot_issue_typ_nm_NX(info);
		else if (nx == columnWrk1Dtl_bkf_flg) doWrk1Dtl_bkf_flg_NX(info);
		else if (nx == columnWrk1Dtl_ln_stk_flg) doWrk1Dtl_ln_stk_flg_NX(info);
		else if (nx == columnWrk1Dtl_pre_po_tgt_flg) doWrk1Dtl_pre_po_tgt_flg_NX(info);
		else if (nx == columnWrk1Dtl_inst_rec_issue_flg) doWrk1Dtl_inst_rec_issue_flg_NX(info);
		else if (nx == columnWrk1Dtl_no_mfg_aprv_flg) doWrk1Dtl_no_mfg_aprv_flg_NX(info);
		else if (nx == columnWrk1Dtl_itm_lower_yield) doWrk1Dtl_itm_lower_yield_NX(info);
		else if (nx == columnWrk1Dtl_itm_std_yield) doWrk1Dtl_itm_std_yield_NX(info);
		else if (nx == columnWrk1Dtl_itm_upper_yield) doWrk1Dtl_itm_upper_yield_NX(info);
		else if (nx == columnWrk1Dtl_purc_id_typ) doWrk1Dtl_purc_id_typ_NX(info);
		else if (nx == columnWrk1Dtl_purc_id_typ_nm) doWrk1Dtl_purc_id_typ_nm_NX(info);
		else if (nx == columnWrk1Dtl_rqst_wg_cd) doWrk1Dtl_rqst_wg_cd_NX(info);
		else if (nx == columnWrk1Dtl_rqst_wg_nm) doWrk1Dtl_rqst_wg_nm_NX(info);
		else if (nx == columnWrk1Dtl_po_batch_flg) doWrk1Dtl_po_batch_flg_NX(info);
		else if (nx == columnWrk1Dtl_rsrc_cd1) doWrk1Dtl_rsrc_cd1_NX(info);
		else if (nx == columnWrk1Dtl_rsrc_nm1) doWrk1Dtl_rsrc_nm1_NX(info);
		else if (nx == columnWrk1Dtl_rsrc_unit_nm1) doWrk1Dtl_rsrc_unit_nm1_NX(info);
		else if (nx == columnWrk1Dtl_rsrc_std_qty1) doWrk1Dtl_rsrc_std_qty1_NX(info);
		else if (nx == columnWrk1Dtl_rsrc_cd2) doWrk1Dtl_rsrc_cd2_NX(info);
		else if (nx == columnWrk1Dtl_rsrc_nm2) doWrk1Dtl_rsrc_nm2_NX(info);
		else if (nx == columnWrk1Dtl_rsrc_unit_nm2) doWrk1Dtl_rsrc_unit_nm2_NX(info);
		else if (nx == columnWrk1Dtl_rsrc_std_qty2) doWrk1Dtl_rsrc_std_qty2_NX(info);
		else if (nx == columnWrk1Dtl_not_mrp_flg) doWrk1Dtl_not_mrp_flg_NX(info);
		else if (nx == columnWrk1Dtl_cost_ratio) doWrk1Dtl_cost_ratio_NX(info);
		else if (nx == columnWrk1Dtl_memo1) doWrk1Dtl_memo1_NX(info);
		else if (nx == columnWrk1Dtl_memo2) doWrk1Dtl_memo2_NX(info);
		else if (nx == columnWrk1Dtl_memo3) doWrk1Dtl_memo3_NX(info);
		else if (nx == columnWrk1Dtl_ins_usr_id) doWrk1Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk1Dtl_ins_usr_nm) doWrk1Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk1Dtl_ins_ts) doWrk1Dtl_ins_ts_NX(info);
		else if (nx == columnWrk1Dtl_ins_func_id) doWrk1Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk1Dtl_ins_func_nm) doWrk1Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk1Dtl_upd_cntr) doWrk1Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk1Dtl_upd_usr_id) doWrk1Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk1Dtl_upd_usr_nm) doWrk1Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk1Dtl_upd_ts) doWrk1Dtl_upd_ts_NX(info);
		else if (nx == columnWrk1Dtl_upd_func_id) doWrk1Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk1Dtl_upd_func_nm) doWrk1Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk1Dtl_upd_srv_req_no) doWrk1Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk1Dtl_del_usr_id) doWrk1Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk1Dtl_del_usr_nm) doWrk1Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk1Dtl_del_ts) doWrk1Dtl_del_ts_NX(info);
		else if (nx == columnWrk2Dtl_del_flg) doWrk2Dtl_del_flg_NX(info);
		else if (nx == columnWrk2Dtl_itm_unit_cd) doWrk2Dtl_itm_unit_cd_NX(info);
		else if (nx == columnWrk2Dtl_itm_dec_place) doWrk2Dtl_itm_dec_place_NX(info);
		else if (nx == columnWrk2Dtl_itm_typ) doWrk2Dtl_itm_typ_NX(info);
		else if (nx == columnWrk2Dtl_itm_typ_nm) doWrk2Dtl_itm_typ_nm_NX(info);
		else if (nx == columnWrk2Dtl_itm_typ_d_cd) doWrk2Dtl_itm_typ_d_cd_NX(info);
		else if (nx == columnWrk2Dtl_itm_typ_d_nm) doWrk2Dtl_itm_typ_d_nm_NX(info);
		else if (nx == columnWrk2Dtl_loc_cd) doWrk2Dtl_loc_cd_NX(info);
		else if (nx == columnWrk2Dtl_loc_nm) doWrk2Dtl_loc_nm_NX(info);
		else if (nx == columnWrk2Dtl_wg_cd) doWrk2Dtl_wg_cd_NX(info);
		else if (nx == columnWrk2Dtl_wg_nm) doWrk2Dtl_wg_nm_NX(info);
		else if (nx == columnWrk2Dtl_oper_ptn) doWrk2Dtl_oper_ptn_NX(info);
		else if (nx == columnWrk2Dtl_oper_cd) doWrk2Dtl_oper_cd_NX(info);
		else if (nx == columnWrk2Dtl_oper_nm) doWrk2Dtl_oper_nm_NX(info);
		else if (nx == columnWrk2Dtl_oper_seq) doWrk2Dtl_oper_seq_NX(info);
		else if (nx == columnWrk2Dtl_disp_seq) doWrk2Dtl_disp_seq_NX(info);
		else if (nx == columnWrk2Dtl_oper_lt) doWrk2Dtl_oper_lt_NX(info);
		else if (nx == columnWrk2Dtl_oper_lt_add_qty) doWrk2Dtl_oper_lt_add_qty_NX(info);
		else if (nx == columnWrk2Dtl_oper_offst_typ) doWrk2Dtl_oper_offst_typ_NX(info);
		else if (nx == columnWrk2Dtl_oper_offst_typ_nm) doWrk2Dtl_oper_offst_typ_nm_NX(info);
		else if (nx == columnWrk2Dtl_oper_offst) doWrk2Dtl_oper_offst_NX(info);
		else if (nx == columnWrk2Dtl_oper_offst_add_qty) doWrk2Dtl_oper_offst_add_qty_NX(info);
		else if (nx == columnWrk2Dtl_oper_unit_cd) doWrk2Dtl_oper_unit_cd_NX(info);
		else if (nx == columnWrk2Dtl_oper_unit_nm) doWrk2Dtl_oper_unit_nm_NX(info);
		else if (nx == columnWrk2Dtl_def_dec_place) doWrk2Dtl_def_dec_place_NX(info);
		else if (nx == columnWrk2Dtl_dec_place) doWrk2Dtl_dec_place_NX(info);
		else if (nx == columnWrk2Dtl_unit_conv_rnd_typ) doWrk2Dtl_unit_conv_rnd_typ_NX(info);
		else if (nx == columnWrk2Dtl_unit_conv_rnd_typ_nm) doWrk2Dtl_unit_conv_rnd_typ_nm_NX(info);
		else if (nx == columnWrk2Dtl_yield_oper_flg) doWrk2Dtl_yield_oper_flg_NX(info);
		else if (nx == columnWrk2Dtl_yield_oper_ratio) doWrk2Dtl_yield_oper_ratio_NX(info);
		else if (nx == columnWrk2Dtl_oper_inst_grp) doWrk2Dtl_oper_inst_grp_NX(info);
		else if (nx == columnWrk2Dtl_oper_loc_cd) doWrk2Dtl_oper_loc_cd_NX(info);
		else if (nx == columnWrk2Dtl_oper_loc_nm) doWrk2Dtl_oper_loc_nm_NX(info);
		else if (nx == columnWrk2Dtl_lmt_fr_dt_flg) doWrk2Dtl_lmt_fr_dt_flg_NX(info);
		else if (nx == columnWrk2Dtl_oper_lower_yield) doWrk2Dtl_oper_lower_yield_NX(info);
		else if (nx == columnWrk2Dtl_oper_std_yield) doWrk2Dtl_oper_std_yield_NX(info);
		else if (nx == columnWrk2Dtl_oper_upper_yield) doWrk2Dtl_oper_upper_yield_NX(info);
		else if (nx == columnWrk2Dtl_wip_rate) doWrk2Dtl_wip_rate_NX(info);
		else if (nx == columnWrk2Dtl_not_cost_flg) doWrk2Dtl_not_cost_flg_NX(info);
		else if (nx == columnWrk2Dtl_memo1) doWrk2Dtl_memo1_NX(info);
		else if (nx == columnWrk2Dtl_memo2) doWrk2Dtl_memo2_NX(info);
		else if (nx == columnWrk2Dtl_memo3) doWrk2Dtl_memo3_NX(info);
		else if (nx == columnWrk2Dtl_ins_usr_id) doWrk2Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk2Dtl_ins_usr_nm) doWrk2Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk2Dtl_ins_ts) doWrk2Dtl_ins_ts_NX(info);
		else if (nx == columnWrk2Dtl_ins_func_id) doWrk2Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk2Dtl_ins_func_nm) doWrk2Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk2Dtl_upd_cntr) doWrk2Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk2Dtl_upd_usr_id) doWrk2Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk2Dtl_upd_usr_nm) doWrk2Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk2Dtl_upd_ts) doWrk2Dtl_upd_ts_NX(info);
		else if (nx == columnWrk2Dtl_upd_func_id) doWrk2Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk2Dtl_upd_func_nm) doWrk2Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk2Dtl_upd_srv_req_no) doWrk2Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk2Dtl_del_usr_id) doWrk2Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk2Dtl_del_usr_nm) doWrk2Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk2Dtl_del_ts) doWrk2Dtl_del_ts_NX(info);
		else if (nx == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NX(info);
		else if (nx == columnWrk3Dtl_itm_typ) doWrk3Dtl_itm_typ_NX(info);
		else if (nx == columnWrk3Dtl_itm_typ_nm) doWrk3Dtl_itm_typ_nm_NX(info);
		else if (nx == columnWrk3Dtl_itm_typ_d_cd) doWrk3Dtl_itm_typ_d_cd_NX(info);
		else if (nx == columnWrk3Dtl_itm_typ_d_nm) doWrk3Dtl_itm_typ_d_nm_NX(info);
		else if (nx == columnWrk3Dtl_loc_cd) doWrk3Dtl_loc_cd_NX(info);
		else if (nx == columnWrk3Dtl_loc_nm) doWrk3Dtl_loc_nm_NX(info);
		else if (nx == columnWrk3Dtl_wg_cd) doWrk3Dtl_wg_cd_NX(info);
		else if (nx == columnWrk3Dtl_wg_nm) doWrk3Dtl_wg_nm_NX(info);
		else if (nx == columnWrk3Dtl_oper_ptn) doWrk3Dtl_oper_ptn_NX(info);
		else if (nx == columnWrk3Dtl_oper_cd) doWrk3Dtl_oper_cd_NX(info);
		else if (nx == columnWrk3Dtl_oper_nm) doWrk3Dtl_oper_nm_NX(info);
		else if (nx == columnWrk3Dtl_oper_seq) doWrk3Dtl_oper_seq_NX(info);
		else if (nx == columnWrk3Dtl_wk_cost_cd) doWrk3Dtl_wk_cost_cd_NX(info);
		else if (nx == columnWrk3Dtl_wk_cost_nm) doWrk3Dtl_wk_cost_nm_NX(info);
		else if (nx == columnWrk3Dtl_wk_cost_unit_nm) doWrk3Dtl_wk_cost_unit_nm_NX(info);
		else if (nx == columnWrk3Dtl_wk_cost_unit_dec_place) doWrk3Dtl_wk_cost_unit_dec_place_NX(info);
		else if (nx == columnWrk3Dtl_wk_cost_unit_rnd_typ) doWrk3Dtl_wk_cost_unit_rnd_typ_NX(info);
		else if (nx == columnWrk3Dtl_fxd_wk_cost) doWrk3Dtl_fxd_wk_cost_NX(info);
		else if (nx == columnWrk3Dtl_wk_cost) doWrk3Dtl_wk_cost_NX(info);
		else if (nx == columnWrk3Dtl_base_unit_cd) doWrk3Dtl_base_unit_cd_NX(info);
		else if (nx == columnWrk3Dtl_base_unit_nm) doWrk3Dtl_base_unit_nm_NX(info);
		else if (nx == columnWrk3Dtl_itm_dec_place) doWrk3Dtl_itm_dec_place_NX(info);
		else if (nx == columnWrk3Dtl_wk_cost_calc_flg) doWrk3Dtl_wk_cost_calc_flg_NX(info);
		else if (nx == columnWrk3Dtl_disp_seq) doWrk3Dtl_disp_seq_NX(info);
		else if (nx == columnWrk3Dtl_not_cost_flg) doWrk3Dtl_not_cost_flg_NX(info);
		else if (nx == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_NX(info);
		else if (nx == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_NX(info);
		else if (nx == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_NX(info);
		else if (nx == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_NX(info);
		else if (nx == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_NX(info);
		else if (nx == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_NX(info);
		else if (nx == columnWrk4Dtl_del_flg) doWrk4Dtl_del_flg_NX(info);
		else if (nx == columnWrk4Dtl_itm_typ) doWrk4Dtl_itm_typ_NX(info);
		else if (nx == columnWrk4Dtl_itm_typ_nm) doWrk4Dtl_itm_typ_nm_NX(info);
		else if (nx == columnWrk4Dtl_itm_typ_d_cd) doWrk4Dtl_itm_typ_d_cd_NX(info);
		else if (nx == columnWrk4Dtl_itm_typ_d_nm) doWrk4Dtl_itm_typ_d_nm_NX(info);
		else if (nx == columnWrk4Dtl_loc_cd) doWrk4Dtl_loc_cd_NX(info);
		else if (nx == columnWrk4Dtl_loc_nm) doWrk4Dtl_loc_nm_NX(info);
		else if (nx == columnWrk4Dtl_wg_cd) doWrk4Dtl_wg_cd_NX(info);
		else if (nx == columnWrk4Dtl_wg_nm) doWrk4Dtl_wg_nm_NX(info);
		else if (nx == columnWrk4Dtl_loc_grp_cd) doWrk4Dtl_loc_grp_cd_NX(info);
		else if (nx == columnWrk4Dtl_loc_grp_nm) doWrk4Dtl_loc_grp_nm_NX(info);
		else if (nx == columnWrk4Dtl_prio) doWrk4Dtl_prio_NX(info);
		else if (nx == columnWrk4Dtl_memo1) doWrk4Dtl_memo1_NX(info);
		else if (nx == columnWrk4Dtl_memo2) doWrk4Dtl_memo2_NX(info);
		else if (nx == columnWrk4Dtl_memo3) doWrk4Dtl_memo3_NX(info);
		else if (nx == columnWrk4Dtl_ins_usr_id) doWrk4Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk4Dtl_ins_usr_nm) doWrk4Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk4Dtl_ins_ts) doWrk4Dtl_ins_ts_NX(info);
		else if (nx == columnWrk4Dtl_ins_func_id) doWrk4Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk4Dtl_ins_func_nm) doWrk4Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk4Dtl_upd_cntr) doWrk4Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk4Dtl_upd_usr_id) doWrk4Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk4Dtl_upd_usr_nm) doWrk4Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk4Dtl_upd_ts) doWrk4Dtl_upd_ts_NX(info);
		else if (nx == columnWrk4Dtl_upd_func_id) doWrk4Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk4Dtl_upd_func_nm) doWrk4Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk4Dtl_upd_srv_req_no) doWrk4Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk4Dtl_del_usr_id) doWrk4Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk4Dtl_del_usr_nm) doWrk4Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk4Dtl_del_ts) doWrk4Dtl_del_ts_NX(info);
		else if (nx == columnWrk5Dtl_del_flg) doWrk5Dtl_del_flg_NX(info);
		else if (nx == columnWrk5Dtl_dec_place) doWrk5Dtl_dec_place_NX(info);
		else if (nx == columnWrk5Dtl_itm_typ) doWrk5Dtl_itm_typ_NX(info);
		else if (nx == columnWrk5Dtl_itm_typ_nm) doWrk5Dtl_itm_typ_nm_NX(info);
		else if (nx == columnWrk5Dtl_itm_typ_d_cd) doWrk5Dtl_itm_typ_d_cd_NX(info);
		else if (nx == columnWrk5Dtl_itm_typ_d_nm) doWrk5Dtl_itm_typ_d_nm_NX(info);
		else if (nx == columnWrk5Dtl_loc_cd) doWrk5Dtl_loc_cd_NX(info);
		else if (nx == columnWrk5Dtl_loc_nm) doWrk5Dtl_loc_nm_NX(info);
		else if (nx == columnWrk5Dtl_wg_cd) doWrk5Dtl_wg_cd_NX(info);
		else if (nx == columnWrk5Dtl_wg_nm) doWrk5Dtl_wg_nm_NX(info);
		else if (nx == columnWrk5Dtl_gi_schd_flg) doWrk5Dtl_gi_schd_flg_NX(info);
		else if (nx == columnWrk5Dtl_base_unit_cd) doWrk5Dtl_base_unit_cd_NX(info);
		else if (nx == columnWrk5Dtl_base_unit_nm) doWrk5Dtl_base_unit_nm_NX(info);
		else if (nx == columnWrk5Dtl_lot_sizing_flg) doWrk5Dtl_lot_sizing_flg_NX(info);
		else if (nx == columnWrk5Dtl_gi_loc_cd) doWrk5Dtl_gi_loc_cd_NX(info);
		else if (nx == columnWrk5Dtl_gi_loc_nm) doWrk5Dtl_gi_loc_nm_NX(info);
		else if (nx == columnWrk5Dtl_gi_str_ln_tgt_flg) doWrk5Dtl_gi_str_ln_tgt_flg_NX(info);
		else if (nx == columnWrk5Dtl_inpt_gi_loc_cd) doWrk5Dtl_inpt_gi_loc_cd_NX(info);
		else if (nx == columnWrk5Dtl_inpt_gi_loc_nm) doWrk5Dtl_inpt_gi_loc_nm_NX(info);
		else if (nx == columnWrk5Dtl_inpt_gi_str_ln_tgt_flg) doWrk5Dtl_inpt_gi_str_ln_tgt_flg_NX(info);
		else if (nx == columnWrk5Dtl_ship_gi_loc_cd) doWrk5Dtl_ship_gi_loc_cd_NX(info);
		else if (nx == columnWrk5Dtl_ship_gi_loc_nm) doWrk5Dtl_ship_gi_loc_nm_NX(info);
		else if (nx == columnWrk5Dtl_ship_gi_str_ln_tgt_flg) doWrk5Dtl_ship_gi_str_ln_tgt_flg_NX(info);
		else if (nx == columnWrk5Dtl_memo1) doWrk5Dtl_memo1_NX(info);
		else if (nx == columnWrk5Dtl_memo2) doWrk5Dtl_memo2_NX(info);
		else if (nx == columnWrk5Dtl_memo3) doWrk5Dtl_memo3_NX(info);
		else if (nx == columnWrk5Dtl_ins_usr_id) doWrk5Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk5Dtl_ins_usr_nm) doWrk5Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk5Dtl_ins_ts) doWrk5Dtl_ins_ts_NX(info);
		else if (nx == columnWrk5Dtl_ins_func_id) doWrk5Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk5Dtl_ins_func_nm) doWrk5Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk5Dtl_upd_cntr) doWrk5Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk5Dtl_upd_usr_id) doWrk5Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk5Dtl_upd_usr_nm) doWrk5Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk5Dtl_upd_ts) doWrk5Dtl_upd_ts_NX(info);
		else if (nx == columnWrk5Dtl_upd_func_id) doWrk5Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk5Dtl_upd_func_nm) doWrk5Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk5Dtl_upd_srv_req_no) doWrk5Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk5Dtl_del_usr_id) doWrk5Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk5Dtl_del_usr_nm) doWrk5Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk5Dtl_del_ts) doWrk5Dtl_del_ts_NX(info);
		else if (nx == columnWrk6Dtl_del_flg) doWrk6Dtl_del_flg_NX(info);
		else if (nx == columnWrk6Dtl_itm_typ) doWrk6Dtl_itm_typ_NX(info);
		else if (nx == columnWrk6Dtl_itm_typ_nm) doWrk6Dtl_itm_typ_nm_NX(info);
		else if (nx == columnWrk6Dtl_itm_typ_d_cd) doWrk6Dtl_itm_typ_d_cd_NX(info);
		else if (nx == columnWrk6Dtl_itm_typ_d_nm) doWrk6Dtl_itm_typ_d_nm_NX(info);
		else if (nx == columnWrk6Dtl_insp_ptn_cd) doWrk6Dtl_insp_ptn_cd_NX(info);
		else if (nx == columnWrk6Dtl_insp_ptn_nm) doWrk6Dtl_insp_ptn_nm_NX(info);
		else if (nx == columnWrk6Dtl_insp_mtd_typ) doWrk6Dtl_insp_mtd_typ_NX(info);
		else if (nx == columnWrk6Dtl_insp_mtd_typ_nm) doWrk6Dtl_insp_mtd_typ_nm_NX(info);
		else if (nx == columnWrk6Dtl_insp_lt) doWrk6Dtl_insp_lt_NX(info);
		else if (nx == columnWrk6Dtl_insp_std_no) doWrk6Dtl_insp_std_no_NX(info);
		else if (nx == columnWrk6Dtl_unit_cd) doWrk6Dtl_unit_cd_NX(info);
		else if (nx == columnWrk6Dtl_dec_place) doWrk6Dtl_dec_place_NX(info);
		else if (nx == columnWrk6Dtl_std_req_flg) doWrk6Dtl_std_req_flg_NX(info);
		else if (nx == columnWrk6Dtl_std_cnf_req_flg) doWrk6Dtl_std_cnf_req_flg_NX(info);
		else if (nx == columnWrk6Dtl_memo1) doWrk6Dtl_memo1_NX(info);
		else if (nx == columnWrk6Dtl_memo2) doWrk6Dtl_memo2_NX(info);
		else if (nx == columnWrk6Dtl_memo3) doWrk6Dtl_memo3_NX(info);
		else if (nx == columnWrk6Dtl_ins_usr_id) doWrk6Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk6Dtl_ins_usr_nm) doWrk6Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk6Dtl_ins_ts) doWrk6Dtl_ins_ts_NX(info);
		else if (nx == columnWrk6Dtl_ins_func_id) doWrk6Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk6Dtl_ins_func_nm) doWrk6Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk6Dtl_upd_cntr) doWrk6Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk6Dtl_upd_usr_id) doWrk6Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk6Dtl_upd_usr_nm) doWrk6Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk6Dtl_upd_ts) doWrk6Dtl_upd_ts_NX(info);
		else if (nx == columnWrk6Dtl_upd_func_id) doWrk6Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk6Dtl_upd_func_nm) doWrk6Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk6Dtl_upd_srv_req_no) doWrk6Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk6Dtl_del_usr_id) doWrk6Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk6Dtl_del_usr_nm) doWrk6Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk6Dtl_del_ts) doWrk6Dtl_del_ts_NX(info);
		else if (nx == columnWrk7Dtl_del_flg) doWrk7Dtl_del_flg_NX(info);
		else if (nx == columnWrk7Dtl_itm_typ) doWrk7Dtl_itm_typ_NX(info);
		else if (nx == columnWrk7Dtl_itm_typ_nm) doWrk7Dtl_itm_typ_nm_NX(info);
		else if (nx == columnWrk7Dtl_itm_typ_d_cd) doWrk7Dtl_itm_typ_d_cd_NX(info);
		else if (nx == columnWrk7Dtl_itm_typ_d_nm) doWrk7Dtl_itm_typ_d_nm_NX(info);
		else if (nx == columnWrk7Dtl_lmt_ctl_flg) doWrk7Dtl_lmt_ctl_flg_NX(info);
		else if (nx == columnWrk7Dtl_mfg_loc_cd) doWrk7Dtl_mfg_loc_cd_NX(info);
		else if (nx == columnWrk7Dtl_mfg_loc_nm) doWrk7Dtl_mfg_loc_nm_NX(info);
		else if (nx == columnWrk7Dtl_sppl_cd) doWrk7Dtl_sppl_cd_NX(info);
		else if (nx == columnWrk7Dtl_sppl_nm) doWrk7Dtl_sppl_nm_NX(info);
		else if (nx == columnWrk7Dtl_maker_cd) doWrk7Dtl_maker_cd_NX(info);
		else if (nx == columnWrk7Dtl_maker_nm) doWrk7Dtl_maker_nm_NX(info);
		else if (nx == columnWrk7Dtl_from_site_cd) doWrk7Dtl_from_site_cd_NX(info);
		else if (nx == columnWrk7Dtl_from_site_nm) doWrk7Dtl_from_site_nm_NX(info);
		else if (nx == columnWrk7Dtl_to_site_cd) doWrk7Dtl_to_site_cd_NX(info);
		else if (nx == columnWrk7Dtl_to_site_nm) doWrk7Dtl_to_site_nm_NX(info);
		else if (nx == columnWrk7Dtl_no_insp_flg) doWrk7Dtl_no_insp_flg_NX(info);
		else if (nx == columnWrk7Dtl_insp_ptn_cd) doWrk7Dtl_insp_ptn_cd_NX(info);
		else if (nx == columnWrk7Dtl_insp_ptn_nm) doWrk7Dtl_insp_ptn_nm_NX(info);
		else if (nx == columnWrk7Dtl_no_mrkt_judg_flg) doWrk7Dtl_no_mrkt_judg_flg_NX(info);
		else if (nx == columnWrk7Dtl_no_plnt_aprv_flg) doWrk7Dtl_no_plnt_aprv_flg_NX(info);
		else if (nx == columnWrk7Dtl_no_insp_aprv_flg) doWrk7Dtl_no_insp_aprv_flg_NX(info);
		else if (nx == columnWrk7Dtl_lmt_dt_frm_typ) doWrk7Dtl_lmt_dt_frm_typ_NX(info);
		else if (nx == columnWrk7Dtl_lmt_dt_frm_typ_nm) doWrk7Dtl_lmt_dt_frm_typ_nm_NX(info);
		else if (nx == columnWrk7Dtl_vld_pd) doWrk7Dtl_vld_pd_NX(info);
		else if (nx == columnWrk7Dtl_lmt_pd) doWrk7Dtl_lmt_pd_NX(info);
		else if (nx == columnWrk7Dtl_lot_insp_vld_pd) doWrk7Dtl_lot_insp_vld_pd_NX(info);
		else if (nx == columnWrk7Dtl_calc_pd_typ) doWrk7Dtl_calc_pd_typ_NX(info);
		else if (nx == columnWrk7Dtl_calc_pd_typ_nm) doWrk7Dtl_calc_pd_typ_nm_NX(info);
		else if (nx == columnWrk7Dtl_lot_insp_lmt_dt_frm_typ) doWrk7Dtl_lot_insp_lmt_dt_frm_typ_NX(info);
		else if (nx == columnWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm) doWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm_NX(info);
		else if (nx == columnWrk7Dtl_insp_inst_issue_typ) doWrk7Dtl_insp_inst_issue_typ_NX(info);
		else if (nx == columnWrk7Dtl_insp_inst_issue_typ_nm) doWrk7Dtl_insp_inst_issue_typ_nm_NX(info);
		else if (nx == columnWrk7Dtl_insp_offst) doWrk7Dtl_insp_offst_NX(info);
		else if (nx == columnWrk7Dtl_inst_rslt_issue_flg) doWrk7Dtl_inst_rslt_issue_flg_NX(info);
		else if (nx == columnWrk7Dtl_pre_insp_valid_flg) doWrk7Dtl_pre_insp_valid_flg_NX(info);
		else if (nx == columnWrk7Dtl_memo1) doWrk7Dtl_memo1_NX(info);
		else if (nx == columnWrk7Dtl_memo2) doWrk7Dtl_memo2_NX(info);
		else if (nx == columnWrk7Dtl_memo3) doWrk7Dtl_memo3_NX(info);
		else if (nx == columnWrk7Dtl_ins_usr_id) doWrk7Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk7Dtl_ins_usr_nm) doWrk7Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk7Dtl_ins_ts) doWrk7Dtl_ins_ts_NX(info);
		else if (nx == columnWrk7Dtl_ins_func_id) doWrk7Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk7Dtl_ins_func_nm) doWrk7Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk7Dtl_upd_cntr) doWrk7Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk7Dtl_upd_usr_id) doWrk7Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk7Dtl_upd_usr_nm) doWrk7Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk7Dtl_upd_ts) doWrk7Dtl_upd_ts_NX(info);
		else if (nx == columnWrk7Dtl_upd_func_id) doWrk7Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk7Dtl_upd_func_nm) doWrk7Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk7Dtl_upd_srv_req_no) doWrk7Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk7Dtl_del_usr_id) doWrk7Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk7Dtl_del_usr_nm) doWrk7Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk7Dtl_del_ts) doWrk7Dtl_del_ts_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [DtlTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ph_ex_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ph_ex_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_hrrchy_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bottom_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bottom_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[byprod_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_byprod_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_alloc_prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_alloc_prio_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_lot_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_lot_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[main_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_main_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_bom]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_bom_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_cost_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_cost_flg_NX(MCEventInfo info){
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
	 * [Wrk1Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_oper_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_lt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_lt_add_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_lt_add_qty_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_lt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt_add_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_lt_add_qty_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[accpt_insp_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_accpt_insp_lt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[buf_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_buf_lt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ord_fix_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ord_fix_pd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_week]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_week_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_sz_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_sz_pd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[min_lot_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_min_lot_qty_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[batch_lot_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_batch_lot_qty_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[max_lot_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_max_lot_qty_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[max_order]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_max_order_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_prio_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[order_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_order_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[yield_schd_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_yield_schd_qty_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_inst_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_inst_qty_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[fxd_rqmt_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_fxd_rqmt_qty_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_issue_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_issue_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_issue_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_issue_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[bkf_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_bkf_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ln_stk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ln_stk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[pre_po_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_pre_po_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[inst_rec_issue_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_inst_rec_issue_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[no_mfg_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_no_mfg_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_lower_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_lower_yield_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_std_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_std_yield_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_upper_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_upper_yield_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[po_batch_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_po_batch_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_unit_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_unit_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_std_qty1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_std_qty1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_unit_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_unit_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_std_qty2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_std_qty2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[not_mrp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_not_mrp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[cost_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_cost_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_seq_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_lt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lt_add_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_lt_add_qty_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_add_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_add_qty_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[def_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_def_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[unit_conv_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_unit_conv_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[unit_conv_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_unit_conv_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[yield_oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_yield_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[yield_oper_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_yield_oper_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_inst_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_inst_grp_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_fr_dt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_fr_dt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lower_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_lower_yield_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_std_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_std_yield_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_upper_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_upper_yield_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wip_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wip_rate_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[not_cost_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_not_cost_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_seq_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[fxd_wk_cost]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_fxd_wk_cost_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[not_cost_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_not_cost_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_prio_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[lot_sizing_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_lot_sizing_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_lt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_std_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_std_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[std_req_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_std_req_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[std_cnf_req_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_std_cnf_req_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_ctl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_ctl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[from_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_from_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[from_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_from_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[to_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_to_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[to_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_to_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[no_insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_no_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[no_mrkt_judg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_no_mrkt_judg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[no_plnt_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_no_plnt_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[no_insp_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_no_insp_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_dt_frm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_dt_frm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_dt_frm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_dt_frm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[vld_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_vld_pd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_pd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_vld_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lot_insp_vld_pd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[calc_pd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_calc_pd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[calc_pd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_calc_pd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_lmt_dt_frm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lot_insp_lmt_dt_frm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_lmt_dt_frm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_inst_issue_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_inst_issue_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_inst_issue_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_inst_issue_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_offst]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_offst_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[inst_rslt_issue_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_inst_rslt_issue_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pre_insp_valid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pre_insp_valid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_base_dt) doCnd_base_dt_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_sno1_mng_typ) doCnd_sno1_mng_typ_LC(info);
		else if (lc == Cnd_sno2_mng_typ) doCnd_sno2_mng_typ_LC(info);
		else if (lc == Cnd_sno3_mng_typ) doCnd_sno3_mng_typ_LC(info);
		else if (lc == Cnd_sno4_mng_typ) doCnd_sno4_mng_typ_LC(info);
		else if (lc == Cnd_bom_ptn) doCnd_bom_ptn_LC(info);
		else if (lc == Cnd_max_hrrchy) doCnd_max_hrrchy_LC(info);
		else if (lc == Cnd_base_qty) doCnd_base_qty_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_LC(info);
		else if (lc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_LC(info);
		else if (lc == columnDtl_unit_cd) doDtl_unit_cd_LC(info);
		else if (lc == columnDtl_dec_place) doDtl_dec_place_LC(info);
		else if (lc == columnDtl_bom_ptn) doDtl_bom_ptn_LC(info);
		else if (lc == columnDtl_oper_cd) doDtl_oper_cd_LC(info);
		else if (lc == columnDtl_oper_nm) doDtl_oper_nm_LC(info);
		else if (lc == columnDtl_oper_seq) doDtl_oper_seq_LC(info);
		else if (lc == columnDtl_ph_bom_ptn) doDtl_ph_bom_ptn_LC(info);
		else if (lc == columnDtl_alt_grp_cd) doDtl_alt_grp_cd_LC(info);
		else if (lc == columnDtl_alt_grp_nm) doDtl_alt_grp_nm_LC(info);
		else if (lc == columnDtl_alt_itm_typ) doDtl_alt_itm_typ_LC(info);
		else if (lc == columnDtl_alt_itm_typ_nm) doDtl_alt_itm_typ_nm_LC(info);
		else if (lc == columnDtl_alt_itm_ratio) doDtl_alt_itm_ratio_LC(info);
		else if (lc == columnDtl_alt_alloc_prio) doDtl_alt_alloc_prio_LC(info);
		else if (lc == columnDtl_sno_typ1) doDtl_sno_typ1_LC(info);
		else if (lc == columnDtl_sno_typ_nm1) doDtl_sno_typ_nm1_LC(info);
		else if (lc == columnDtl_sno_typ2) doDtl_sno_typ2_LC(info);
		else if (lc == columnDtl_sno_typ_nm2) doDtl_sno_typ_nm2_LC(info);
		else if (lc == columnDtl_sno_typ3) doDtl_sno_typ3_LC(info);
		else if (lc == columnDtl_sno_typ_nm3) doDtl_sno_typ_nm3_LC(info);
		else if (lc == columnDtl_sno_typ4) doDtl_sno_typ4_LC(info);
		else if (lc == columnDtl_sno_typ_nm4) doDtl_sno_typ_nm4_LC(info);
		else if (lc == columnDtl_chd_unit_cd) doDtl_chd_unit_cd_LC(info);
		else if (lc == columnDtl_chd_unit_nm) doDtl_chd_unit_nm_LC(info);
		else if (lc == columnDtl_chd_dec_place) doDtl_chd_dec_place_LC(info);
		else if (lc == columnDtl_in_offst_typ) doDtl_in_offst_typ_LC(info);
		else if (lc == columnDtl_in_offst_typ_nm) doDtl_in_offst_typ_nm_LC(info);
		else if (lc == columnDtl_in_offst) doDtl_in_offst_LC(info);
		else if (lc == columnDtl_bkf_typ) doDtl_bkf_typ_LC(info);
		else if (lc == columnDtl_bkf_typ_nm) doDtl_bkf_typ_nm_LC(info);
		else if (lc == columnDtl_alloc_ctl_typ) doDtl_alloc_ctl_typ_LC(info);
		else if (lc == columnDtl_alloc_ctl_typ_nm) doDtl_alloc_ctl_typ_nm_LC(info);
		else if (lc == columnDtl_inpt_ctl_typ) doDtl_inpt_ctl_typ_LC(info);
		else if (lc == columnDtl_inpt_ctl_typ_nm) doDtl_inpt_ctl_typ_nm_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_chng_no) doDtl_chng_no_LC(info);
		else if (lc == columnDtl_ext_sys_no_bom) doDtl_ext_sys_no_bom_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnWrk1Dtl_wg_cd) doWrk1Dtl_wg_cd_LC(info);
		else if (lc == columnWrk1Dtl_wg_nm) doWrk1Dtl_wg_nm_LC(info);
		else if (lc == columnWrk1Dtl_stk_mng_typ) doWrk1Dtl_stk_mng_typ_LC(info);
		else if (lc == columnWrk1Dtl_asset_mng_typ) doWrk1Dtl_asset_mng_typ_LC(info);
		else if (lc == columnWrk1Dtl_unit_cd) doWrk1Dtl_unit_cd_LC(info);
		else if (lc == columnWrk1Dtl_dec_place) doWrk1Dtl_dec_place_LC(info);
		else if (lc == columnWrk1Dtl_sno1_mng_typ) doWrk1Dtl_sno1_mng_typ_LC(info);
		else if (lc == columnWrk1Dtl_sno2_mng_typ) doWrk1Dtl_sno2_mng_typ_LC(info);
		else if (lc == columnWrk1Dtl_sno3_mng_typ) doWrk1Dtl_sno3_mng_typ_LC(info);
		else if (lc == columnWrk1Dtl_sno4_mng_typ) doWrk1Dtl_sno4_mng_typ_LC(info);
		else if (lc == columnWrk1Dtl_itm_typ) doWrk1Dtl_itm_typ_LC(info);
		else if (lc == columnWrk1Dtl_itm_typ_nm) doWrk1Dtl_itm_typ_nm_LC(info);
		else if (lc == columnWrk1Dtl_itm_typ_d_cd) doWrk1Dtl_itm_typ_d_cd_LC(info);
		else if (lc == columnWrk1Dtl_itm_typ_d_nm) doWrk1Dtl_itm_typ_d_nm_LC(info);
		else if (lc == columnWrk1Dtl_mfg_loc_cd) doWrk1Dtl_mfg_loc_cd_LC(info);
		else if (lc == columnWrk1Dtl_mfg_loc_nm) doWrk1Dtl_mfg_loc_nm_LC(info);
		else if (lc == columnWrk1Dtl_site_cd) doWrk1Dtl_site_cd_LC(info);
		else if (lc == columnWrk1Dtl_site_nm) doWrk1Dtl_site_nm_LC(info);
		else if (lc == columnWrk1Dtl_sppl_cd) doWrk1Dtl_sppl_cd_LC(info);
		else if (lc == columnWrk1Dtl_sppl_nm) doWrk1Dtl_sppl_nm_LC(info);
		else if (lc == columnWrk1Dtl_maker_cd) doWrk1Dtl_maker_cd_LC(info);
		else if (lc == columnWrk1Dtl_maker_nm) doWrk1Dtl_maker_nm_LC(info);
		else if (lc == columnWrk1Dtl_rqst_loc_cd) doWrk1Dtl_rqst_loc_cd_LC(info);
		else if (lc == columnWrk1Dtl_rqst_loc_nm) doWrk1Dtl_rqst_loc_nm_LC(info);
		else if (lc == columnWrk1Dtl_rqst_loc_wg_cd) doWrk1Dtl_rqst_loc_wg_cd_LC(info);
		else if (lc == columnWrk1Dtl_rqst_loc_wg_nm) doWrk1Dtl_rqst_loc_wg_nm_LC(info);
		else if (lc == columnWrk1Dtl_bom_ptn) doWrk1Dtl_bom_ptn_LC(info);
		else if (lc == columnWrk1Dtl_oper_ptn) doWrk1Dtl_oper_ptn_LC(info);
		else if (lc == columnWrk1Dtl_mfg_lt) doWrk1Dtl_mfg_lt_LC(info);
		else if (lc == columnWrk1Dtl_mfg_lt_add_qty) doWrk1Dtl_mfg_lt_add_qty_LC(info);
		else if (lc == columnWrk1Dtl_purc_lt) doWrk1Dtl_purc_lt_LC(info);
		else if (lc == columnWrk1Dtl_purc_lt_add_qty) doWrk1Dtl_purc_lt_add_qty_LC(info);
		else if (lc == columnWrk1Dtl_accpt_insp_lt) doWrk1Dtl_accpt_insp_lt_LC(info);
		else if (lc == columnWrk1Dtl_buf_lt) doWrk1Dtl_buf_lt_LC(info);
		else if (lc == columnWrk1Dtl_ord_fix_pd) doWrk1Dtl_ord_fix_pd_LC(info);
		else if (lc == columnWrk1Dtl_sz_day_week_typ) doWrk1Dtl_sz_day_week_typ_LC(info);
		else if (lc == columnWrk1Dtl_sz_day_week_typ_nm) doWrk1Dtl_sz_day_week_typ_nm_LC(info);
		else if (lc == columnWrk1Dtl_sz_week) doWrk1Dtl_sz_week_LC(info);
		else if (lc == columnWrk1Dtl_lot_sz_pd) doWrk1Dtl_lot_sz_pd_LC(info);
		else if (lc == columnWrk1Dtl_min_lot_qty) doWrk1Dtl_min_lot_qty_LC(info);
		else if (lc == columnWrk1Dtl_batch_lot_qty) doWrk1Dtl_batch_lot_qty_LC(info);
		else if (lc == columnWrk1Dtl_max_lot_qty) doWrk1Dtl_max_lot_qty_LC(info);
		else if (lc == columnWrk1Dtl_max_order) doWrk1Dtl_max_order_LC(info);
		else if (lc == columnWrk1Dtl_prio) doWrk1Dtl_prio_LC(info);
		else if (lc == columnWrk1Dtl_order_ratio) doWrk1Dtl_order_ratio_LC(info);
		else if (lc == columnWrk1Dtl_yield_schd_qty) doWrk1Dtl_yield_schd_qty_LC(info);
		else if (lc == columnWrk1Dtl_mfg_inst_qty) doWrk1Dtl_mfg_inst_qty_LC(info);
		else if (lc == columnWrk1Dtl_fxd_rqmt_qty) doWrk1Dtl_fxd_rqmt_qty_LC(info);
		else if (lc == columnWrk1Dtl_lot_issue_typ) doWrk1Dtl_lot_issue_typ_LC(info);
		else if (lc == columnWrk1Dtl_lot_issue_typ_nm) doWrk1Dtl_lot_issue_typ_nm_LC(info);
		else if (lc == columnWrk1Dtl_itm_lower_yield) doWrk1Dtl_itm_lower_yield_LC(info);
		else if (lc == columnWrk1Dtl_itm_std_yield) doWrk1Dtl_itm_std_yield_LC(info);
		else if (lc == columnWrk1Dtl_itm_upper_yield) doWrk1Dtl_itm_upper_yield_LC(info);
		else if (lc == columnWrk1Dtl_purc_id_typ) doWrk1Dtl_purc_id_typ_LC(info);
		else if (lc == columnWrk1Dtl_purc_id_typ_nm) doWrk1Dtl_purc_id_typ_nm_LC(info);
		else if (lc == columnWrk1Dtl_rqst_wg_cd) doWrk1Dtl_rqst_wg_cd_LC(info);
		else if (lc == columnWrk1Dtl_rqst_wg_nm) doWrk1Dtl_rqst_wg_nm_LC(info);
		else if (lc == columnWrk1Dtl_rsrc_cd1) doWrk1Dtl_rsrc_cd1_LC(info);
		else if (lc == columnWrk1Dtl_rsrc_nm1) doWrk1Dtl_rsrc_nm1_LC(info);
		else if (lc == columnWrk1Dtl_rsrc_unit_nm1) doWrk1Dtl_rsrc_unit_nm1_LC(info);
		else if (lc == columnWrk1Dtl_rsrc_std_qty1) doWrk1Dtl_rsrc_std_qty1_LC(info);
		else if (lc == columnWrk1Dtl_rsrc_cd2) doWrk1Dtl_rsrc_cd2_LC(info);
		else if (lc == columnWrk1Dtl_rsrc_nm2) doWrk1Dtl_rsrc_nm2_LC(info);
		else if (lc == columnWrk1Dtl_rsrc_unit_nm2) doWrk1Dtl_rsrc_unit_nm2_LC(info);
		else if (lc == columnWrk1Dtl_rsrc_std_qty2) doWrk1Dtl_rsrc_std_qty2_LC(info);
		else if (lc == columnWrk1Dtl_cost_ratio) doWrk1Dtl_cost_ratio_LC(info);
		else if (lc == columnWrk1Dtl_memo1) doWrk1Dtl_memo1_LC(info);
		else if (lc == columnWrk1Dtl_memo2) doWrk1Dtl_memo2_LC(info);
		else if (lc == columnWrk1Dtl_memo3) doWrk1Dtl_memo3_LC(info);
		else if (lc == columnWrk1Dtl_ins_usr_id) doWrk1Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk1Dtl_ins_usr_nm) doWrk1Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk1Dtl_ins_ts) doWrk1Dtl_ins_ts_LC(info);
		else if (lc == columnWrk1Dtl_ins_func_id) doWrk1Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk1Dtl_ins_func_nm) doWrk1Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk1Dtl_upd_cntr) doWrk1Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk1Dtl_upd_usr_id) doWrk1Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk1Dtl_upd_usr_nm) doWrk1Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk1Dtl_upd_ts) doWrk1Dtl_upd_ts_LC(info);
		else if (lc == columnWrk1Dtl_upd_func_id) doWrk1Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk1Dtl_upd_func_nm) doWrk1Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk1Dtl_upd_srv_req_no) doWrk1Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk1Dtl_del_usr_id) doWrk1Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk1Dtl_del_usr_nm) doWrk1Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk1Dtl_del_ts) doWrk1Dtl_del_ts_LC(info);
		else if (lc == columnWrk2Dtl_itm_unit_cd) doWrk2Dtl_itm_unit_cd_LC(info);
		else if (lc == columnWrk2Dtl_itm_dec_place) doWrk2Dtl_itm_dec_place_LC(info);
		else if (lc == columnWrk2Dtl_itm_typ) doWrk2Dtl_itm_typ_LC(info);
		else if (lc == columnWrk2Dtl_itm_typ_nm) doWrk2Dtl_itm_typ_nm_LC(info);
		else if (lc == columnWrk2Dtl_itm_typ_d_cd) doWrk2Dtl_itm_typ_d_cd_LC(info);
		else if (lc == columnWrk2Dtl_itm_typ_d_nm) doWrk2Dtl_itm_typ_d_nm_LC(info);
		else if (lc == columnWrk2Dtl_loc_cd) doWrk2Dtl_loc_cd_LC(info);
		else if (lc == columnWrk2Dtl_loc_nm) doWrk2Dtl_loc_nm_LC(info);
		else if (lc == columnWrk2Dtl_wg_cd) doWrk2Dtl_wg_cd_LC(info);
		else if (lc == columnWrk2Dtl_wg_nm) doWrk2Dtl_wg_nm_LC(info);
		else if (lc == columnWrk2Dtl_oper_ptn) doWrk2Dtl_oper_ptn_LC(info);
		else if (lc == columnWrk2Dtl_oper_cd) doWrk2Dtl_oper_cd_LC(info);
		else if (lc == columnWrk2Dtl_oper_nm) doWrk2Dtl_oper_nm_LC(info);
		else if (lc == columnWrk2Dtl_oper_seq) doWrk2Dtl_oper_seq_LC(info);
		else if (lc == columnWrk2Dtl_disp_seq) doWrk2Dtl_disp_seq_LC(info);
		else if (lc == columnWrk2Dtl_oper_lt) doWrk2Dtl_oper_lt_LC(info);
		else if (lc == columnWrk2Dtl_oper_lt_add_qty) doWrk2Dtl_oper_lt_add_qty_LC(info);
		else if (lc == columnWrk2Dtl_oper_offst_typ) doWrk2Dtl_oper_offst_typ_LC(info);
		else if (lc == columnWrk2Dtl_oper_offst_typ_nm) doWrk2Dtl_oper_offst_typ_nm_LC(info);
		else if (lc == columnWrk2Dtl_oper_offst) doWrk2Dtl_oper_offst_LC(info);
		else if (lc == columnWrk2Dtl_oper_offst_add_qty) doWrk2Dtl_oper_offst_add_qty_LC(info);
		else if (lc == columnWrk2Dtl_oper_unit_cd) doWrk2Dtl_oper_unit_cd_LC(info);
		else if (lc == columnWrk2Dtl_oper_unit_nm) doWrk2Dtl_oper_unit_nm_LC(info);
		else if (lc == columnWrk2Dtl_def_dec_place) doWrk2Dtl_def_dec_place_LC(info);
		else if (lc == columnWrk2Dtl_dec_place) doWrk2Dtl_dec_place_LC(info);
		else if (lc == columnWrk2Dtl_unit_conv_rnd_typ) doWrk2Dtl_unit_conv_rnd_typ_LC(info);
		else if (lc == columnWrk2Dtl_unit_conv_rnd_typ_nm) doWrk2Dtl_unit_conv_rnd_typ_nm_LC(info);
		else if (lc == columnWrk2Dtl_yield_oper_ratio) doWrk2Dtl_yield_oper_ratio_LC(info);
		else if (lc == columnWrk2Dtl_oper_inst_grp) doWrk2Dtl_oper_inst_grp_LC(info);
		else if (lc == columnWrk2Dtl_oper_loc_cd) doWrk2Dtl_oper_loc_cd_LC(info);
		else if (lc == columnWrk2Dtl_oper_loc_nm) doWrk2Dtl_oper_loc_nm_LC(info);
		else if (lc == columnWrk2Dtl_oper_lower_yield) doWrk2Dtl_oper_lower_yield_LC(info);
		else if (lc == columnWrk2Dtl_oper_std_yield) doWrk2Dtl_oper_std_yield_LC(info);
		else if (lc == columnWrk2Dtl_oper_upper_yield) doWrk2Dtl_oper_upper_yield_LC(info);
		else if (lc == columnWrk2Dtl_wip_rate) doWrk2Dtl_wip_rate_LC(info);
		else if (lc == columnWrk2Dtl_memo1) doWrk2Dtl_memo1_LC(info);
		else if (lc == columnWrk2Dtl_memo2) doWrk2Dtl_memo2_LC(info);
		else if (lc == columnWrk2Dtl_memo3) doWrk2Dtl_memo3_LC(info);
		else if (lc == columnWrk2Dtl_ins_usr_id) doWrk2Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk2Dtl_ins_usr_nm) doWrk2Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk2Dtl_ins_ts) doWrk2Dtl_ins_ts_LC(info);
		else if (lc == columnWrk2Dtl_ins_func_id) doWrk2Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk2Dtl_ins_func_nm) doWrk2Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk2Dtl_upd_cntr) doWrk2Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk2Dtl_upd_usr_id) doWrk2Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk2Dtl_upd_usr_nm) doWrk2Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk2Dtl_upd_ts) doWrk2Dtl_upd_ts_LC(info);
		else if (lc == columnWrk2Dtl_upd_func_id) doWrk2Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk2Dtl_upd_func_nm) doWrk2Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk2Dtl_upd_srv_req_no) doWrk2Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk2Dtl_del_usr_id) doWrk2Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk2Dtl_del_usr_nm) doWrk2Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk2Dtl_del_ts) doWrk2Dtl_del_ts_LC(info);
		else if (lc == columnWrk3Dtl_itm_typ) doWrk3Dtl_itm_typ_LC(info);
		else if (lc == columnWrk3Dtl_itm_typ_nm) doWrk3Dtl_itm_typ_nm_LC(info);
		else if (lc == columnWrk3Dtl_itm_typ_d_cd) doWrk3Dtl_itm_typ_d_cd_LC(info);
		else if (lc == columnWrk3Dtl_itm_typ_d_nm) doWrk3Dtl_itm_typ_d_nm_LC(info);
		else if (lc == columnWrk3Dtl_loc_cd) doWrk3Dtl_loc_cd_LC(info);
		else if (lc == columnWrk3Dtl_loc_nm) doWrk3Dtl_loc_nm_LC(info);
		else if (lc == columnWrk3Dtl_wg_cd) doWrk3Dtl_wg_cd_LC(info);
		else if (lc == columnWrk3Dtl_wg_nm) doWrk3Dtl_wg_nm_LC(info);
		else if (lc == columnWrk3Dtl_oper_ptn) doWrk3Dtl_oper_ptn_LC(info);
		else if (lc == columnWrk3Dtl_oper_cd) doWrk3Dtl_oper_cd_LC(info);
		else if (lc == columnWrk3Dtl_oper_nm) doWrk3Dtl_oper_nm_LC(info);
		else if (lc == columnWrk3Dtl_oper_seq) doWrk3Dtl_oper_seq_LC(info);
		else if (lc == columnWrk3Dtl_wk_cost_cd) doWrk3Dtl_wk_cost_cd_LC(info);
		else if (lc == columnWrk3Dtl_wk_cost_nm) doWrk3Dtl_wk_cost_nm_LC(info);
		else if (lc == columnWrk3Dtl_wk_cost_unit_nm) doWrk3Dtl_wk_cost_unit_nm_LC(info);
		else if (lc == columnWrk3Dtl_wk_cost_unit_dec_place) doWrk3Dtl_wk_cost_unit_dec_place_LC(info);
		else if (lc == columnWrk3Dtl_wk_cost_unit_rnd_typ) doWrk3Dtl_wk_cost_unit_rnd_typ_LC(info);
		else if (lc == columnWrk3Dtl_fxd_wk_cost) doWrk3Dtl_fxd_wk_cost_LC(info);
		else if (lc == columnWrk3Dtl_wk_cost) doWrk3Dtl_wk_cost_LC(info);
		else if (lc == columnWrk3Dtl_base_unit_cd) doWrk3Dtl_base_unit_cd_LC(info);
		else if (lc == columnWrk3Dtl_base_unit_nm) doWrk3Dtl_base_unit_nm_LC(info);
		else if (lc == columnWrk3Dtl_itm_dec_place) doWrk3Dtl_itm_dec_place_LC(info);
		else if (lc == columnWrk3Dtl_disp_seq) doWrk3Dtl_disp_seq_LC(info);
		else if (lc == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_LC(info);
		else if (lc == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_LC(info);
		else if (lc == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_LC(info);
		else if (lc == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_LC(info);
		else if (lc == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_LC(info);
		else if (lc == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_LC(info);
		else if (lc == columnWrk4Dtl_itm_typ) doWrk4Dtl_itm_typ_LC(info);
		else if (lc == columnWrk4Dtl_itm_typ_nm) doWrk4Dtl_itm_typ_nm_LC(info);
		else if (lc == columnWrk4Dtl_itm_typ_d_cd) doWrk4Dtl_itm_typ_d_cd_LC(info);
		else if (lc == columnWrk4Dtl_itm_typ_d_nm) doWrk4Dtl_itm_typ_d_nm_LC(info);
		else if (lc == columnWrk4Dtl_loc_cd) doWrk4Dtl_loc_cd_LC(info);
		else if (lc == columnWrk4Dtl_loc_nm) doWrk4Dtl_loc_nm_LC(info);
		else if (lc == columnWrk4Dtl_wg_cd) doWrk4Dtl_wg_cd_LC(info);
		else if (lc == columnWrk4Dtl_wg_nm) doWrk4Dtl_wg_nm_LC(info);
		else if (lc == columnWrk4Dtl_loc_grp_cd) doWrk4Dtl_loc_grp_cd_LC(info);
		else if (lc == columnWrk4Dtl_loc_grp_nm) doWrk4Dtl_loc_grp_nm_LC(info);
		else if (lc == columnWrk4Dtl_prio) doWrk4Dtl_prio_LC(info);
		else if (lc == columnWrk4Dtl_memo1) doWrk4Dtl_memo1_LC(info);
		else if (lc == columnWrk4Dtl_memo2) doWrk4Dtl_memo2_LC(info);
		else if (lc == columnWrk4Dtl_memo3) doWrk4Dtl_memo3_LC(info);
		else if (lc == columnWrk4Dtl_ins_usr_id) doWrk4Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk4Dtl_ins_usr_nm) doWrk4Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk4Dtl_ins_ts) doWrk4Dtl_ins_ts_LC(info);
		else if (lc == columnWrk4Dtl_ins_func_id) doWrk4Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk4Dtl_ins_func_nm) doWrk4Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk4Dtl_upd_cntr) doWrk4Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk4Dtl_upd_usr_id) doWrk4Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk4Dtl_upd_usr_nm) doWrk4Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk4Dtl_upd_ts) doWrk4Dtl_upd_ts_LC(info);
		else if (lc == columnWrk4Dtl_upd_func_id) doWrk4Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk4Dtl_upd_func_nm) doWrk4Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk4Dtl_upd_srv_req_no) doWrk4Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk4Dtl_del_usr_id) doWrk4Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk4Dtl_del_usr_nm) doWrk4Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk4Dtl_del_ts) doWrk4Dtl_del_ts_LC(info);
		else if (lc == columnWrk5Dtl_dec_place) doWrk5Dtl_dec_place_LC(info);
		else if (lc == columnWrk5Dtl_itm_typ) doWrk5Dtl_itm_typ_LC(info);
		else if (lc == columnWrk5Dtl_itm_typ_nm) doWrk5Dtl_itm_typ_nm_LC(info);
		else if (lc == columnWrk5Dtl_itm_typ_d_cd) doWrk5Dtl_itm_typ_d_cd_LC(info);
		else if (lc == columnWrk5Dtl_itm_typ_d_nm) doWrk5Dtl_itm_typ_d_nm_LC(info);
		else if (lc == columnWrk5Dtl_loc_cd) doWrk5Dtl_loc_cd_LC(info);
		else if (lc == columnWrk5Dtl_loc_nm) doWrk5Dtl_loc_nm_LC(info);
		else if (lc == columnWrk5Dtl_wg_cd) doWrk5Dtl_wg_cd_LC(info);
		else if (lc == columnWrk5Dtl_wg_nm) doWrk5Dtl_wg_nm_LC(info);
		else if (lc == columnWrk5Dtl_base_unit_cd) doWrk5Dtl_base_unit_cd_LC(info);
		else if (lc == columnWrk5Dtl_base_unit_nm) doWrk5Dtl_base_unit_nm_LC(info);
		else if (lc == columnWrk5Dtl_gi_loc_cd) doWrk5Dtl_gi_loc_cd_LC(info);
		else if (lc == columnWrk5Dtl_gi_loc_nm) doWrk5Dtl_gi_loc_nm_LC(info);
		else if (lc == columnWrk5Dtl_inpt_gi_loc_cd) doWrk5Dtl_inpt_gi_loc_cd_LC(info);
		else if (lc == columnWrk5Dtl_inpt_gi_loc_nm) doWrk5Dtl_inpt_gi_loc_nm_LC(info);
		else if (lc == columnWrk5Dtl_ship_gi_loc_cd) doWrk5Dtl_ship_gi_loc_cd_LC(info);
		else if (lc == columnWrk5Dtl_ship_gi_loc_nm) doWrk5Dtl_ship_gi_loc_nm_LC(info);
		else if (lc == columnWrk5Dtl_memo1) doWrk5Dtl_memo1_LC(info);
		else if (lc == columnWrk5Dtl_memo2) doWrk5Dtl_memo2_LC(info);
		else if (lc == columnWrk5Dtl_memo3) doWrk5Dtl_memo3_LC(info);
		else if (lc == columnWrk5Dtl_ins_usr_id) doWrk5Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk5Dtl_ins_usr_nm) doWrk5Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk5Dtl_ins_ts) doWrk5Dtl_ins_ts_LC(info);
		else if (lc == columnWrk5Dtl_ins_func_id) doWrk5Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk5Dtl_ins_func_nm) doWrk5Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk5Dtl_upd_cntr) doWrk5Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk5Dtl_upd_usr_id) doWrk5Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk5Dtl_upd_usr_nm) doWrk5Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk5Dtl_upd_ts) doWrk5Dtl_upd_ts_LC(info);
		else if (lc == columnWrk5Dtl_upd_func_id) doWrk5Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk5Dtl_upd_func_nm) doWrk5Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk5Dtl_upd_srv_req_no) doWrk5Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk5Dtl_del_usr_id) doWrk5Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk5Dtl_del_usr_nm) doWrk5Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk5Dtl_del_ts) doWrk5Dtl_del_ts_LC(info);
		else if (lc == columnWrk6Dtl_itm_typ) doWrk6Dtl_itm_typ_LC(info);
		else if (lc == columnWrk6Dtl_itm_typ_nm) doWrk6Dtl_itm_typ_nm_LC(info);
		else if (lc == columnWrk6Dtl_itm_typ_d_cd) doWrk6Dtl_itm_typ_d_cd_LC(info);
		else if (lc == columnWrk6Dtl_itm_typ_d_nm) doWrk6Dtl_itm_typ_d_nm_LC(info);
		else if (lc == columnWrk6Dtl_insp_ptn_cd) doWrk6Dtl_insp_ptn_cd_LC(info);
		else if (lc == columnWrk6Dtl_insp_ptn_nm) doWrk6Dtl_insp_ptn_nm_LC(info);
		else if (lc == columnWrk6Dtl_insp_mtd_typ) doWrk6Dtl_insp_mtd_typ_LC(info);
		else if (lc == columnWrk6Dtl_insp_mtd_typ_nm) doWrk6Dtl_insp_mtd_typ_nm_LC(info);
		else if (lc == columnWrk6Dtl_insp_lt) doWrk6Dtl_insp_lt_LC(info);
		else if (lc == columnWrk6Dtl_insp_std_no) doWrk6Dtl_insp_std_no_LC(info);
		else if (lc == columnWrk6Dtl_unit_cd) doWrk6Dtl_unit_cd_LC(info);
		else if (lc == columnWrk6Dtl_dec_place) doWrk6Dtl_dec_place_LC(info);
		else if (lc == columnWrk6Dtl_memo1) doWrk6Dtl_memo1_LC(info);
		else if (lc == columnWrk6Dtl_memo2) doWrk6Dtl_memo2_LC(info);
		else if (lc == columnWrk6Dtl_memo3) doWrk6Dtl_memo3_LC(info);
		else if (lc == columnWrk6Dtl_ins_usr_id) doWrk6Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk6Dtl_ins_usr_nm) doWrk6Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk6Dtl_ins_ts) doWrk6Dtl_ins_ts_LC(info);
		else if (lc == columnWrk6Dtl_ins_func_id) doWrk6Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk6Dtl_ins_func_nm) doWrk6Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk6Dtl_upd_cntr) doWrk6Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk6Dtl_upd_usr_id) doWrk6Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk6Dtl_upd_usr_nm) doWrk6Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk6Dtl_upd_ts) doWrk6Dtl_upd_ts_LC(info);
		else if (lc == columnWrk6Dtl_upd_func_id) doWrk6Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk6Dtl_upd_func_nm) doWrk6Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk6Dtl_upd_srv_req_no) doWrk6Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk6Dtl_del_usr_id) doWrk6Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk6Dtl_del_usr_nm) doWrk6Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk6Dtl_del_ts) doWrk6Dtl_del_ts_LC(info);
		else if (lc == columnWrk7Dtl_itm_typ) doWrk7Dtl_itm_typ_LC(info);
		else if (lc == columnWrk7Dtl_itm_typ_nm) doWrk7Dtl_itm_typ_nm_LC(info);
		else if (lc == columnWrk7Dtl_itm_typ_d_cd) doWrk7Dtl_itm_typ_d_cd_LC(info);
		else if (lc == columnWrk7Dtl_itm_typ_d_nm) doWrk7Dtl_itm_typ_d_nm_LC(info);
		else if (lc == columnWrk7Dtl_mfg_loc_cd) doWrk7Dtl_mfg_loc_cd_LC(info);
		else if (lc == columnWrk7Dtl_mfg_loc_nm) doWrk7Dtl_mfg_loc_nm_LC(info);
		else if (lc == columnWrk7Dtl_sppl_cd) doWrk7Dtl_sppl_cd_LC(info);
		else if (lc == columnWrk7Dtl_sppl_nm) doWrk7Dtl_sppl_nm_LC(info);
		else if (lc == columnWrk7Dtl_maker_cd) doWrk7Dtl_maker_cd_LC(info);
		else if (lc == columnWrk7Dtl_maker_nm) doWrk7Dtl_maker_nm_LC(info);
		else if (lc == columnWrk7Dtl_from_site_cd) doWrk7Dtl_from_site_cd_LC(info);
		else if (lc == columnWrk7Dtl_from_site_nm) doWrk7Dtl_from_site_nm_LC(info);
		else if (lc == columnWrk7Dtl_to_site_cd) doWrk7Dtl_to_site_cd_LC(info);
		else if (lc == columnWrk7Dtl_to_site_nm) doWrk7Dtl_to_site_nm_LC(info);
		else if (lc == columnWrk7Dtl_insp_ptn_cd) doWrk7Dtl_insp_ptn_cd_LC(info);
		else if (lc == columnWrk7Dtl_insp_ptn_nm) doWrk7Dtl_insp_ptn_nm_LC(info);
		else if (lc == columnWrk7Dtl_lmt_dt_frm_typ) doWrk7Dtl_lmt_dt_frm_typ_LC(info);
		else if (lc == columnWrk7Dtl_lmt_dt_frm_typ_nm) doWrk7Dtl_lmt_dt_frm_typ_nm_LC(info);
		else if (lc == columnWrk7Dtl_vld_pd) doWrk7Dtl_vld_pd_LC(info);
		else if (lc == columnWrk7Dtl_lmt_pd) doWrk7Dtl_lmt_pd_LC(info);
		else if (lc == columnWrk7Dtl_lot_insp_vld_pd) doWrk7Dtl_lot_insp_vld_pd_LC(info);
		else if (lc == columnWrk7Dtl_calc_pd_typ) doWrk7Dtl_calc_pd_typ_LC(info);
		else if (lc == columnWrk7Dtl_calc_pd_typ_nm) doWrk7Dtl_calc_pd_typ_nm_LC(info);
		else if (lc == columnWrk7Dtl_lot_insp_lmt_dt_frm_typ) doWrk7Dtl_lot_insp_lmt_dt_frm_typ_LC(info);
		else if (lc == columnWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm) doWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm_LC(info);
		else if (lc == columnWrk7Dtl_insp_inst_issue_typ) doWrk7Dtl_insp_inst_issue_typ_LC(info);
		else if (lc == columnWrk7Dtl_insp_inst_issue_typ_nm) doWrk7Dtl_insp_inst_issue_typ_nm_LC(info);
		else if (lc == columnWrk7Dtl_insp_offst) doWrk7Dtl_insp_offst_LC(info);
		else if (lc == columnWrk7Dtl_memo1) doWrk7Dtl_memo1_LC(info);
		else if (lc == columnWrk7Dtl_memo2) doWrk7Dtl_memo2_LC(info);
		else if (lc == columnWrk7Dtl_memo3) doWrk7Dtl_memo3_LC(info);
		else if (lc == columnWrk7Dtl_ins_usr_id) doWrk7Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk7Dtl_ins_usr_nm) doWrk7Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk7Dtl_ins_ts) doWrk7Dtl_ins_ts_LC(info);
		else if (lc == columnWrk7Dtl_ins_func_id) doWrk7Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk7Dtl_ins_func_nm) doWrk7Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk7Dtl_upd_cntr) doWrk7Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk7Dtl_upd_usr_id) doWrk7Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk7Dtl_upd_usr_nm) doWrk7Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk7Dtl_upd_ts) doWrk7Dtl_upd_ts_LC(info);
		else if (lc == columnWrk7Dtl_upd_func_id) doWrk7Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk7Dtl_upd_func_nm) doWrk7Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk7Dtl_upd_srv_req_no) doWrk7Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk7Dtl_del_usr_id) doWrk7Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk7Dtl_del_usr_nm) doWrk7Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk7Dtl_del_ts) doWrk7Dtl_del_ts_LC(info);
	}

	/**
	 * [Cnd]パネルの[base_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_dt_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[max_hrrchy]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_max_hrrchy_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_qty_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_alloc_prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_alloc_prio_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_bom]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_bom_LC(MCEventInfo info){
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
	 * [Wrk1Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_oper_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_lt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_lt_add_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_lt_add_qty_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_lt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt_add_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_lt_add_qty_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[accpt_insp_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_accpt_insp_lt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[buf_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_buf_lt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ord_fix_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ord_fix_pd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_week]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_week_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_sz_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_sz_pd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[min_lot_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_min_lot_qty_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[batch_lot_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_batch_lot_qty_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[max_lot_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_max_lot_qty_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[max_order]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_max_order_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_prio_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[order_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_order_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[yield_schd_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_yield_schd_qty_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[mfg_inst_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_mfg_inst_qty_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[fxd_rqmt_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_fxd_rqmt_qty_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_issue_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_issue_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_issue_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_issue_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_lower_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_lower_yield_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_std_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_std_yield_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[itm_upper_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_itm_upper_yield_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_unit_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_unit_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_std_qty1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_std_qty1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_unit_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_unit_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rsrc_std_qty2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rsrc_std_qty2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[cost_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_cost_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_seq_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_lt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lt_add_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_lt_add_qty_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_offst_add_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_offst_add_qty_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[def_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_def_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[unit_conv_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_unit_conv_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[unit_conv_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_unit_conv_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[yield_oper_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_yield_oper_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_inst_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_inst_grp_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_lower_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_lower_yield_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_std_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_std_yield_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[oper_upper_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_oper_upper_yield_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wip_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wip_rate_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_oper_seq_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[fxd_wk_cost]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_fxd_wk_cost_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wk_cost]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wk_cost_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[itm_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_itm_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_prio_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_lt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[insp_std_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_insp_std_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[from_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_from_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[from_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_from_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[to_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_to_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[to_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_to_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_dt_frm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_dt_frm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_dt_frm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_dt_frm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[vld_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_vld_pd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lmt_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lmt_pd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_vld_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lot_insp_vld_pd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[calc_pd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_calc_pd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[calc_pd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_calc_pd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_lmt_dt_frm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lot_insp_lmt_dt_frm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[lot_insp_lmt_dt_frm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_lot_insp_lmt_dt_frm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_inst_issue_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_inst_issue_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_inst_issue_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_inst_issue_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[insp_offst]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_insp_offst_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_itm_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_itm_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_itm_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_itm_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bom_ptn]の作成メソッド
	 */
	public MCList getCnd_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBomPtnParChd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ph_bom_ptn]の作成メソッド
	 */
	public MCList getDtl_ph_bom_ptn(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alt_grp_cd]の作成メソッド
	 */
	public MCList getDtl_alt_grp_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alt_itm_typ]の作成メソッド
	 */
	public MCList getDtl_alt_itm_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno_typ1]の作成メソッド
	 */
	public MCList getDtl_sno_typ1(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno_typ2]の作成メソッド
	 */
	public MCList getDtl_sno_typ2(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno_typ3]の作成メソッド
	 */
	public MCList getDtl_sno_typ3(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno_typ4]の作成メソッド
	 */
	public MCList getDtl_sno_typ4(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_in_offst_typ]の作成メソッド
	 */
	public MCList getDtl_in_offst_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bkf_typ]の作成メソッド
	 */
	public MCList getDtl_bkf_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alloc_ctl_typ]の作成メソッド
	 */
	public MCList getDtl_alloc_ctl_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_inpt_ctl_typ]の作成メソッド
	 */
	public MCList getDtl_inpt_ctl_typ(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL0040.Srch01")) {
			return new MA_MABSL0040_Srch01Bridge();
		}
		if (id.equals("MA.MABSL0040.Srch02")) {
			return new MA_MABSL0040_Srch02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0040_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0040_Srch01;

		/** コンストラクタ */
		protected MA_MABSL0040_Srch01Bridge() {
			p_MA_MABSL0040_Srch01 = new MCParam(PDef.MA_MABSL0040_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0040_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP0040.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.DtlR.class));

			p_MA_MABSL0040_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0040_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0040_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0040_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0040_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP0040.CndR up0() {
			return (mcframe.clientMABS.MABSP0040.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0040.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0040.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0040_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0040.DtlR>)p_MA_MABSL0040_Srch01.getContainerParam().getDownBlock(0));
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
	/**
	 * [MA_MABSL0040_Srch02]の定型処理のInnerClass
	 */
	protected class MA_MABSL0040_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0040_Srch02;

		/** コンストラクタ */
		protected MA_MABSL0040_Srch02Bridge() {
			p_MA_MABSL0040_Srch02 = new MCParam(PDef.MA_MABSL0040_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0040_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP0040.Cnd2R.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk1DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk2DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk3DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk4DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk5DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk6DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk7DtlR.class));

			p_MA_MABSL0040_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0040_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0040_Srch02.addUpBlock(getCnd2R());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0040_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0040_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP0040.Cnd2R up0() {
			return (mcframe.clientMABS.MABSP0040.Cnd2R)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0040.Wrk1DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0040.Wrk1DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABS.MABSP0040.Wrk2DtlR> down1() {
			return (MCList<mcframe.clientMABS.MABSP0040.Wrk2DtlR>)down(1);
		}
		protected MCList<mcframe.clientMABS.MABSP0040.Wrk3DtlR> down2() {
			return (MCList<mcframe.clientMABS.MABSP0040.Wrk3DtlR>)down(2);
		}
		protected MCList<mcframe.clientMABS.MABSP0040.Wrk4DtlR> down3() {
			return (MCList<mcframe.clientMABS.MABSP0040.Wrk4DtlR>)down(3);
		}
		protected MCList<mcframe.clientMABS.MABSP0040.Wrk5DtlR> down4() {
			return (MCList<mcframe.clientMABS.MABSP0040.Wrk5DtlR>)down(4);
		}
		protected MCList<mcframe.clientMABS.MABSP0040.Wrk6DtlR> down5() {
			return (MCList<mcframe.clientMABS.MABSP0040.Wrk6DtlR>)down(5);
		}
		protected MCList<mcframe.clientMABS.MABSP0040.Wrk7DtlR> down6() {
			return (MCList<mcframe.clientMABS.MABSP0040.Wrk7DtlR>)down(6);
		}

		protected void setupDownParam() {
			p_MA_MABSL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk1DtlR.class));
			p_MA_MABSL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk2DtlR.class));
			p_MA_MABSL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk3DtlR.class));
			p_MA_MABSL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk4DtlR.class));
			p_MA_MABSL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk5DtlR.class));
			p_MA_MABSL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk6DtlR.class));
			p_MA_MABSL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0040.Wrk7DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0040_Srch02;
		}

		protected void show() {
			setWrk1DtlL((MCList<mcframe.clientMABS.MABSP0040.Wrk1DtlR>)p_MA_MABSL0040_Srch02.getContainerParam().getDownBlock(0));
			setWrk2DtlL((MCList<mcframe.clientMABS.MABSP0040.Wrk2DtlR>)p_MA_MABSL0040_Srch02.getContainerParam().getDownBlock(1));
			setWrk3DtlL((MCList<mcframe.clientMABS.MABSP0040.Wrk3DtlR>)p_MA_MABSL0040_Srch02.getContainerParam().getDownBlock(2));
			setWrk4DtlL((MCList<mcframe.clientMABS.MABSP0040.Wrk4DtlR>)p_MA_MABSL0040_Srch02.getContainerParam().getDownBlock(3));
			setWrk5DtlL((MCList<mcframe.clientMABS.MABSP0040.Wrk5DtlR>)p_MA_MABSL0040_Srch02.getContainerParam().getDownBlock(4));
			setWrk6DtlL((MCList<mcframe.clientMABS.MABSP0040.Wrk6DtlR>)p_MA_MABSL0040_Srch02.getContainerParam().getDownBlock(5));
			setWrk7DtlL((MCList<mcframe.clientMABS.MABSP0040.Wrk7DtlR>)p_MA_MABSL0040_Srch02.getContainerParam().getDownBlock(6));
		}

		protected void clear() {
			getWrk1DtlL().clear();
			getWrk2DtlL().clear();
			getWrk3DtlL().clear();
			getWrk4DtlL().clear();
			getWrk5DtlL().clear();
			getWrk6DtlL().clear();
			getWrk7DtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCnd2R());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getWrk1DtlL());
			result.add(getWrk2DtlL());
			result.add(getWrk3DtlL());
			result.add(getWrk4DtlL());
			result.add(getWrk5DtlL());
			result.add(getWrk6DtlL());
			result.add(getWrk7DtlL());
			return result;
		}
	}
}