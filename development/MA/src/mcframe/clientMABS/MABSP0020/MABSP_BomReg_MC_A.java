package mcframe.clientMABS.MABSP0020;

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
import mcframe.clientMABS.MABSP0020.MABSP_BomReg_MC.MA_MABSL0020_Srch01Caller;
import mcframe.clientMABS.MABSP0020.MABSP_BomReg_MC.MA_MABSL0020_Upd01Caller;
import mcframe.clientMABS.MABSP0020.MABSP_BomReg_MC.MA_MABSL0020_Del01Caller;

/**
 * 画面"MABSP_BomReg"パネルクラスです。<p>
 *
 * ＢＯＭマスタの検索、更新を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_BomReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABSP0020";

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
	// [RegTarget]ブロック関連のField定義
	public MCPanel RegTargetPanel = null;
	public MCTitledBorder RegTargetTitledBorder = null;
	// [RegTarget]ブロックの項目のField定義
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
	 * UPD,Create,0;MOD,Modify,4;DEL,Delete (Administrator),1;REF,View,3 UPD,登録する,0;MOD,訂正する,4;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_MOD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Common 共通.<p>
	 *
	 */
	public MCCheckBox Cnd_cmn_flg = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
	/**
	 * Search (Common) 検索する（共通）.<p>
	 *
	 */
	public MCButton Cnd_srch_cmn = null;
	/**
	 * Search (WG) 検索する（ワーキンググループ）.<p>
	 *
	 */
	public MCButton Cnd_srch_wg = null;
	public mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H Cnd_dt_PPanel;
	public MCDateField Cnd_st_dt_fr;	// [Cnd]の[dt.st_dt_fr]を[Cnd_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_dt_to;	// [Cnd]の[dt.st_dt_to]を[Cnd_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_dt_fr;	// [Cnd]の[dt.end_dt_fr]を[Cnd_end_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_dt_to;	// [Cnd]の[dt.end_dt_to]を[Cnd_end_dt_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_par_itm_p_PPanel;
	public MCTextField Cnd_par_itm_cd;	// [Cnd]の[par_itm_p.itm_cd]を[Cnd_par_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub1;	// [Cnd]の[par_itm_p.itm_sub1]を[Cnd_par_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub2;	// [Cnd]の[par_itm_p.itm_sub2]を[Cnd_par_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub3;	// [Cnd]の[par_itm_p.itm_sub3]を[Cnd_par_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_par_itm_nm;	// [Cnd]の[par_itm_p.itm_nm]を[Cnd_par_itm_nm]としてエイリアス定義。
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
	public MCLabel Cnd_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextComboBox Cnd_bom_ptn = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCLabel Cnd_del_flg_lab = null;
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_del_flg = null;
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_del_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Tbl]ブロック関連のField定義
	public MCPanel TblPanel = null;
	// [Tbl]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Hdr_par_itm_p_PPanel;
	public MCTextField Hdr_par_itm_cd;	// [Hdr]の[par_itm_p.itm_cd]を[Hdr_par_itm_cd]としてエイリアス定義。
	public MCTextComboBox Hdr_par_itm_sub1;	// [Hdr]の[par_itm_p.itm_sub1]を[Hdr_par_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Hdr_par_itm_sub2;	// [Hdr]の[par_itm_p.itm_sub2]を[Hdr_par_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Hdr_par_itm_sub3;	// [Hdr]の[par_itm_p.itm_sub3]を[Hdr_par_itm_sub3]としてエイリアス定義。
	public MCTextField Hdr_par_itm_nm;	// [Hdr]の[par_itm_p.itm_nm]を[Hdr_par_itm_nm]としてエイリアス定義。
	public MCLabel Hdr_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Hdr_wg_nm = null;
	public MCLabel Hdr_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextField Hdr_bom_ptn = null;
	public MCLabel Hdr_par_base_unit_cd_Label = null;
	/**
	 * Parent base unit cd. 親基準単位ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_par_base_unit_cd = null;
	/**
	 * Parent base unit name 親基準単位名.<p>
	 *
	 */
	public MCTextField Hdr_par_base_unit_nm = null;
	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public MCNumberField Hdr_par_dec_place = null;
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public MCTextField Hdr_par_itm_typ = null;
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_par_itm_typ_d_cd = null;
	/**
	 * SEIBAN No. 1 management type (Parent) 手配ＮＯ１管理区分（親）.<p>
	 *
	 */
	public MCTextField Hdr_par_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type (Parent) 手配ＮＯ２管理区分（親）.<p>
	 *
	 */
	public MCTextField Hdr_par_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type (Parent) 手配ＮＯ３管理区分（親）.<p>
	 *
	 */
	public MCTextField Hdr_par_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type (Parent) 手配ＮＯ４管理区分（親）.<p>
	 *
	 */
	public MCTextField Hdr_par_sno4_mng_typ = null;
	/**
	 * BOM pattern (Parent) 構成パタン（親）.<p>
	 *
	 */
	public MCTextField Hdr_par_def_bom_ptn = null;
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField BulkSet_st_dt = null;
	public MCLabel BulkSet_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField BulkSet_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton BulkSet_set_dt = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0020.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_par_itm_p_PPanel;
	public MCColumnConfig columnDtl_par_itm_cd;// [Dtl]の[par_itm_p.itm_cd]を[columnDtl_par_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub1;// [Dtl]の[par_itm_p.itm_sub1]を[columnDtl_par_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub2;// [Dtl]の[par_itm_p.itm_sub2]を[columnDtl_par_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub3;// [Dtl]の[par_itm_p.itm_sub3]を[columnDtl_par_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_nm;// [Dtl]の[par_itm_p.itm_nm]を[columnDtl_par_itm_nm]としてエイリアス定義。
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_itm_typ = null;
	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_itm_typ_nm = null;
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_itm_typ_d_cd = null;
	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_itm_typ_d_nm = null;
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_ptn = null;
	/**
	 * Parent base unit cd. 親基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_base_unit_cd = null;
	/**
	 * Parent base unit name 親基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_base_unit_nm = null;
	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_dec_place = null;
	/**
	 * SEIBAN No. 1 management type (Parent) 手配ＮＯ１管理区分（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type (Parent) 手配ＮＯ２管理区分（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type (Parent) 手配ＮＯ３管理区分（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type (Parent) 手配ＮＯ４管理区分（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_sno4_mng_typ = null;
	/**
	 * BOM pattern (Parent) 構成パタン（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_def_bom_ptn = null;
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
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_chd_itm_p_PPanel;
	public MCColumnConfig columnDtl_chd_itm_cd;// [Dtl]の[chd_itm_p.itm_cd]を[columnDtl_chd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_sub1;// [Dtl]の[chd_itm_p.itm_sub1]を[columnDtl_chd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_sub2;// [Dtl]の[chd_itm_p.itm_sub2]を[columnDtl_chd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_sub3;// [Dtl]の[chd_itm_p.itm_sub3]を[columnDtl_chd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_nm;// [Dtl]の[chd_itm_p.itm_nm]を[columnDtl_chd_itm_nm]としてエイリアス定義。
	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_dec_place = null;
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ = null;
	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ_nm = null;
	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ_d_cd = null;
	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ_d_nm = null;
	/**
	 * Inventory management type (Child) 在庫管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_stk_mng_typ = null;
	/**
	 * Asset management type (Child) 資産管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_asset_mng_typ = null;
	/**
	 * Lot No. management type (Child) ロット管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_mng_typ = null;
	/**
	 * Sublot management type (Child) サブロット管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_mng_typ = null;
	/**
	 * SEIBAN No. 1 management type (Child) 手配ＮＯ１管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type (Child) 手配ＮＯ２管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type (Child) 手配ＮＯ３管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type (Child) 手配ＮＯ４管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_sno4_mng_typ = null;
	/**
	 * BOM pattern (Child) 構成パタン（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_def_bom_ptn = null;
	/**
	 * For version control (Child) 版管理対象（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_flg = null;
	/**
	 * By-product 副産品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_byprod_flg = null;
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
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl_ver_no_p_PPanel;
	public MCColumnConfig columnDtl_ver_no;// [Dtl]の[ver_no_p.ver_no]を[columnDtl_ver_no]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty1_p_PPanel;
	public MCColumnConfig columnDtl_par_inst_qty;// [Dtl]の[qty1_p.qty]を[columnDtl_par_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty3_p_PPanel;
	public MCColumnConfig columnDtl_chd_inpt_qty;// [Dtl]の[qty3_p.qty]を[columnDtl_chd_inpt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty2_p_PPanel;
	public MCColumnConfig columnDtl_chd_rqmt_qty;// [Dtl]の[qty2_p.qty]を[columnDtl_chd_rqmt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty4_p_PPanel;
	public MCColumnConfig columnDtl_fxd_chd_rqmt_qty;// [Dtl]の[qty4_p.qty]を[columnDtl_fxd_chd_rqmt_qty]としてエイリアス定義。
	/**
	 * Child base unit cd. 子基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_base_unit_cd = null;
	/**
	 * Child base unit name 子基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_base_unit_nm = null;
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
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo3 = null;
	/**
	 * BOM key ＢＯＭキー.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_key = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_ts = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * BOM list (Explosion) ＢＯＭ一覧照会（展開）.<p>
	 *
	 */
	public MCButton Btn_open_MABSP0040 = null;
	/**
	 * Alternative item master entry 代替品目マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABSP0080 = null;
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
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
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
	public MCButton Btn_upd_cmn = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_wg = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_cmn = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_wg = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [MOD]モードを表す定数 */
	public static final String MOD = "MOD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, SRCH, MOD, DEL, REF, FIX_U, FIX};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABSL0020_Srch01]のCallerの作成 */
	protected MABSP_BomReg_MC.MA_MABSL0020_Srch01Caller createMA_MABSL0020_Srch01() {
		MABSP_BomReg_MC.MA_MABSL0020_Srch01Caller<MABSP_BomReg, MA_MABSL0020_Srch01Bridge>
		caller = ((MABSP_BomReg_MC)this).new MA_MABSL0020_Srch01Caller<MABSP_BomReg, MA_MABSL0020_Srch01Bridge>(
					(MABSP_BomReg)this, new MA_MABSL0020_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL0020_Srch01]の呼び出し */
	protected void callMA_MABSL0020_Srch01() {
		MCCaller caller = createMA_MABSL0020_Srch01();
		caller.exec();
	}
	/** [MA_MABSL0020_Upd01]のCallerの作成 */
	protected MABSP_BomReg_MC.MA_MABSL0020_Upd01Caller createMA_MABSL0020_Upd01() {
		MABSP_BomReg_MC.MA_MABSL0020_Upd01Caller<MABSP_BomReg, MA_MABSL0020_Upd01Bridge>
		caller = ((MABSP_BomReg_MC)this).new MA_MABSL0020_Upd01Caller<MABSP_BomReg, MA_MABSL0020_Upd01Bridge>(
					(MABSP_BomReg)this, new MA_MABSL0020_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL0020_Upd01]の呼び出し */
	protected void callMA_MABSL0020_Upd01() {
		MCCaller caller = createMA_MABSL0020_Upd01();
		caller.exec();
	}
	/** [MA_MABSL0020_Del01]のCallerの作成 */
	protected MABSP_BomReg_MC.MA_MABSL0020_Del01Caller createMA_MABSL0020_Del01() {
		MABSP_BomReg_MC.MA_MABSL0020_Del01Caller<MABSP_BomReg, MA_MABSL0020_Del01Bridge>
		caller = ((MABSP_BomReg_MC)this).new MA_MABSL0020_Del01Caller<MABSP_BomReg, MA_MABSL0020_Del01Bridge>(
					(MABSP_BomReg)this, new MA_MABSL0020_Del01Bridge());
		return caller;
	}
	/** [MA_MABSL0020_Del01]の呼び出し */
	protected void callMA_MABSL0020_Del01() {
		MCCaller caller = createMA_MABSL0020_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0020.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0020.HdrR aHdrR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0020.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0020.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP0020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0020.CndR createCndR() {
		return mcframe.clientMABS.MABSP0020.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMABS.MABSP0020.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABS.MABSP0020.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABS.MABSP0020.HdrR createHdrR() {
		return mcframe.clientMABS.MABSP0020.HdrR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMABS.MABSP0020.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP0020.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP0020.BulkSetR createBulkSetR() {
		return mcframe.clientMABS.MABSP0020.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP0020.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0020.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP0020.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP0020.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0020.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0020.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
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
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getBulkSetR()) return "BulkSet";
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
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("BulkSet")) return getBulkSetR();
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
		ret.add(RegTargetPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(TblPanel);
		ret.add(HdrPanel);
		ret.add(BulkSetPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_BomReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_BomReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABSP_BomReg_MC.jbCreateScreenOpe((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbCreateRegTarget((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbCreateTop((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbCreateFold((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbCreateCnd((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbCreateCtrl((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbCreateTbl((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbCreateHdr((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbCreateBulkSet((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbCreateDtl((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbCreateBtn((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbCreateEastBtn((MABSP_BomReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_BomReg p) {
	}

	/**
	 * [RegTarget]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRegTarget(MABSP_BomReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_BomReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_BomReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_BomReg p) {
		p.Cnd_dt_PPanel = mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.create(p.getCndR().dt());
		p.Cnd_dt_PPanel.setName("Cnd.dt");
		p.Cnd_st_dt_fr = p.Cnd_dt_PPanel.StEndDt_st_dt_fr;
		p.Cnd_st_dt_fr.addAliasName("Cnd.st_dt_fr", p);
		p.Cnd_st_dt_to = p.Cnd_dt_PPanel.StEndDt_st_dt_to;
		p.Cnd_st_dt_to.addAliasName("Cnd.st_dt_to", p);
		p.Cnd_end_dt_fr = p.Cnd_dt_PPanel.StEndDt_end_dt_fr;
		p.Cnd_end_dt_fr.addAliasName("Cnd.end_dt_fr", p);
		p.Cnd_end_dt_to = p.Cnd_dt_PPanel.StEndDt_end_dt_to;
		p.Cnd_end_dt_to.addAliasName("Cnd.end_dt_to", p);
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
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_BomReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Tbl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTbl(MABSP_BomReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MABSP_BomReg p) {
		p.Hdr_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getHdrR().par_itm_p());
		p.Hdr_par_itm_p_PPanel.setName("Hdr.par_itm_p");
		p.Hdr_par_itm_cd = p.Hdr_par_itm_p_PPanel.Itm_itm_cd;
		p.Hdr_par_itm_cd.addAliasName("Hdr.par_itm_cd", p);
		p.Hdr_par_itm_sub1 = p.Hdr_par_itm_p_PPanel.Itm_itm_sub1;
		p.Hdr_par_itm_sub1.addAliasName("Hdr.par_itm_sub1", p);
		p.Hdr_par_itm_sub2 = p.Hdr_par_itm_p_PPanel.Itm_itm_sub2;
		p.Hdr_par_itm_sub2.addAliasName("Hdr.par_itm_sub2", p);
		p.Hdr_par_itm_sub3 = p.Hdr_par_itm_p_PPanel.Itm_itm_sub3;
		p.Hdr_par_itm_sub3.addAliasName("Hdr.par_itm_sub3", p);
		p.Hdr_par_itm_nm = p.Hdr_par_itm_p_PPanel.Itm_itm_nm;
		p.Hdr_par_itm_nm.addAliasName("Hdr.par_itm_nm", p);
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MABSP_BomReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_BomReg p) {
		p.Dtl_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0020.DtlR.$par_itm_p);
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
		p.Dtl_chd_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0020.DtlR.$chd_itm_p);
		p.Dtl_chd_itm_p_PPanel.setName("Dtl.chd_itm_p");
		p.columnDtl_chd_itm_cd = p.Dtl_chd_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_chd_itm_cd.addAliasName("Dtl.chd_itm_cd", p);
		p.columnDtl_chd_itm_sub1 = p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_chd_itm_sub1.addAliasName("Dtl.chd_itm_sub1", p);
		p.columnDtl_chd_itm_sub2 = p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_chd_itm_sub2.addAliasName("Dtl.chd_itm_sub2", p);
		p.columnDtl_chd_itm_sub3 = p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_chd_itm_sub3.addAliasName("Dtl.chd_itm_sub3", p);
		p.columnDtl_chd_itm_nm = p.Dtl_chd_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_chd_itm_nm.addAliasName("Dtl.chd_itm_nm", p);
		p.Dtl_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMABS.MABSP0020.DtlR.$ver_no_p);
		p.Dtl_ver_no_p_PPanel.setName("Dtl.ver_no_p");
		p.columnDtl_ver_no = p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl_ver_no.addAliasName("Dtl.ver_no", p);
		p.Dtl_min_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMABS.MABSP0020.DtlR.$min_sno_p);
		p.Dtl_min_sno_p_PPanel.setName("Dtl.min_sno_p");
		p.columnDtl_min_sno1 = p.Dtl_min_sno_p_PPanel.columnSno_sno1;
		p.columnDtl_min_sno1.addAliasName("Dtl.min_sno1", p);
		p.columnDtl_min_sno2 = p.Dtl_min_sno_p_PPanel.columnSno_sno2;
		p.columnDtl_min_sno2.addAliasName("Dtl.min_sno2", p);
		p.columnDtl_min_sno3 = p.Dtl_min_sno_p_PPanel.columnSno_sno3;
		p.columnDtl_min_sno3.addAliasName("Dtl.min_sno3", p);
		p.columnDtl_min_sno4 = p.Dtl_min_sno_p_PPanel.columnSno_sno4;
		p.columnDtl_min_sno4.addAliasName("Dtl.min_sno4", p);
		p.Dtl_max_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMABS.MABSP0020.DtlR.$max_sno_p);
		p.Dtl_max_sno_p_PPanel.setName("Dtl.max_sno_p");
		p.columnDtl_max_sno1 = p.Dtl_max_sno_p_PPanel.columnSno_sno1;
		p.columnDtl_max_sno1.addAliasName("Dtl.max_sno1", p);
		p.columnDtl_max_sno2 = p.Dtl_max_sno_p_PPanel.columnSno_sno2;
		p.columnDtl_max_sno2.addAliasName("Dtl.max_sno2", p);
		p.columnDtl_max_sno3 = p.Dtl_max_sno_p_PPanel.columnSno_sno3;
		p.columnDtl_max_sno3.addAliasName("Dtl.max_sno3", p);
		p.columnDtl_max_sno4 = p.Dtl_max_sno_p_PPanel.columnSno_sno4;
		p.columnDtl_max_sno4.addAliasName("Dtl.max_sno4", p);
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0020.DtlR.$dt_p);
		p.Dtl_dt_p_PPanel.setName("Dtl.dt_p");
		p.columnDtl_st_dt = p.Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_end_dt = p.Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
		p.Dtl_qty1_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0020.DtlR.$qty1_p);
		p.Dtl_qty1_p_PPanel.setName("Dtl.qty1_p");
		p.columnDtl_par_inst_qty = p.Dtl_qty1_p_PPanel.columnQty_qty;
		p.columnDtl_par_inst_qty.addAliasName("Dtl.par_inst_qty", p);
		p.Dtl_qty3_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0020.DtlR.$qty3_p);
		p.Dtl_qty3_p_PPanel.setName("Dtl.qty3_p");
		p.columnDtl_chd_inpt_qty = p.Dtl_qty3_p_PPanel.columnQty_qty;
		p.columnDtl_chd_inpt_qty.addAliasName("Dtl.chd_inpt_qty", p);
		p.Dtl_qty2_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0020.DtlR.$qty2_p);
		p.Dtl_qty2_p_PPanel.setName("Dtl.qty2_p");
		p.columnDtl_chd_rqmt_qty = p.Dtl_qty2_p_PPanel.columnQty_qty;
		p.columnDtl_chd_rqmt_qty.addAliasName("Dtl.chd_rqmt_qty", p);
		p.Dtl_qty4_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0020.DtlR.$qty4_p);
		p.Dtl_qty4_p_PPanel.setName("Dtl.qty4_p");
		p.columnDtl_fxd_chd_rqmt_qty = p.Dtl_qty4_p_PPanel.columnQty_qty;
		p.columnDtl_fxd_chd_rqmt_qty.addAliasName("Dtl.fxd_chd_rqmt_qty", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABSP_BomReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABSP_BomReg p) {
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
	
	
	/** [Hdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Hdr_par_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Hdr_par_itm_p_PPanel_Itm_itm_cd_p == null) {
			Hdr_par_itm_p_PPanel_Itm_itm_cd_p = createHdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter(Hdr_par_itm_p_PPanel.Itm_itm_cd, "par_itm_cd", "par_itm_nm","par_itm_sub1","par_itm_sub2","par_itm_sub3","bom_ptn","par_base_unit_cd","par_dec_place","par_sno1_mng_typ","par_sno2_mng_typ","par_sno3_mng_typ","par_sno4_mng_typ","par_def_bom_ptn","par_itm_typ","par_itm_typ_d_cd","par_base_unit_nm");
		}
		return Hdr_par_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Hdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Hdr_par_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getHdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Hdr_par_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Hdr_par_itm_p_PPanel_Itm_itm_sub1_p = createHdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(Hdr_par_itm_p_PPanel.Itm_itm_sub1, "par_itm_sub1", "par_itm_nm","par_itm_sub2","par_itm_sub3","bom_ptn","par_base_unit_cd","par_dec_place","par_sno1_mng_typ","par_sno2_mng_typ","par_sno3_mng_typ","par_sno4_mng_typ","par_def_bom_ptn","par_itm_typ","par_itm_typ_d_cd");
		}
		return Hdr_par_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Hdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Hdr_par_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getHdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Hdr_par_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Hdr_par_itm_p_PPanel_Itm_itm_sub2_p = createHdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(Hdr_par_itm_p_PPanel.Itm_itm_sub2, "par_itm_sub2", "par_itm_nm","par_itm_sub3","bom_ptn","par_base_unit_cd","par_dec_place","par_sno1_mng_typ","par_sno2_mng_typ","par_sno3_mng_typ","par_sno4_mng_typ","par_def_bom_ptn","par_itm_typ","par_itm_typ_d_cd","par_base_unit_nm");
		}
		return Hdr_par_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Hdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Hdr_par_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getHdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Hdr_par_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Hdr_par_itm_p_PPanel_Itm_itm_sub3_p = createHdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(Hdr_par_itm_p_PPanel.Itm_itm_sub3, "par_itm_sub3", "par_itm_nm","bom_ptn","par_base_unit_cd","par_dec_place","par_sno1_mng_typ","par_sno2_mng_typ","par_sno3_mng_typ","par_sno4_mng_typ","par_def_bom_ptn","par_itm_typ","par_itm_typ_d_cd","par_base_unit_nm");
		}
		return Hdr_par_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Hdr_wg_cd_ListPutter]の定義 */
	private MCListPutter Hdr_wg_cd_p = null;

	/**
	 * [Hdr_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_wg_cd_ListPutter() {
		if (Hdr_wg_cd_p == null) {
			Hdr_wg_cd_p = createHdr_wg_cd_ListPutter(Hdr_wg_cd, "wg_cd", "wg_nm");

		}
		return Hdr_wg_cd_p;
	}
	
	
	/** [Dtl_oper_cd_ListPutter]の定義 */
	private MCListPutter Dtl_oper_cd_p = null;

	/**
	 * [Dtl_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_oper_cd_ListPutter() {
		if (Dtl_oper_cd_p == null) {
			Dtl_oper_cd_p = createDtl_oper_cd_ListPutter(columnDtl_oper_cd, "oper_cd", "oper_nm");

		}
		return Dtl_oper_cd_p;
	}
	
	
	/** [Dtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_chd_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_chd_itm_p_PPanel_columnItm_itm_cd_p = createDtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_chd_itm_p_PPanel.columnItm_itm_cd, "chd_itm_cd", "chd_itm_nm","chd_itm_sub1","chd_itm_sub2","chd_itm_sub3","chd_base_unit_cd","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm","chd_stk_mng_typ","chd_asset_mng_typ","chd_dec_place","lot_mng_typ","sublot_mng_typ","chd_sno1_mng_typ","chd_sno2_mng_typ","chd_sno3_mng_typ","chd_sno4_mng_typ","ver_flg","chd_def_bom_ptn","chd_base_unit_nm");
		}
		return Dtl_chd_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_chd_itm_p_PPanel.columnItm_itm_sub1, "chd_itm_sub1", "chd_itm_nm","chd_itm_sub2","chd_itm_sub3","chd_base_unit_cd","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm","chd_stk_mng_typ","chd_asset_mng_typ","chd_dec_place","lot_mng_typ","sublot_mng_typ","chd_sno1_mng_typ","chd_sno2_mng_typ","chd_sno3_mng_typ","chd_sno4_mng_typ","ver_flg","chd_def_bom_ptn","chd_base_unit_nm");
		}
		return Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_chd_itm_p_PPanel.columnItm_itm_sub2, "chd_itm_sub2", "chd_itm_nm","chd_itm_sub3","chd_base_unit_cd","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm","chd_stk_mng_typ","chd_asset_mng_typ","chd_dec_place","lot_mng_typ","sublot_mng_typ","chd_sno1_mng_typ","chd_sno2_mng_typ","chd_sno3_mng_typ","chd_sno4_mng_typ","ver_flg","chd_def_bom_ptn","chd_base_unit_nm");
		}
		return Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_chd_itm_p_PPanel.columnItm_itm_sub3, "chd_itm_sub3", "chd_itm_nm","chd_base_unit_cd","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm","chd_stk_mng_typ","chd_asset_mng_typ","chd_dec_place","lot_mng_typ","sublot_mng_typ","chd_sno1_mng_typ","chd_sno2_mng_typ","chd_sno3_mng_typ","chd_sno4_mng_typ","ver_flg","chd_def_bom_ptn","chd_base_unit_nm");
		}
		return Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_chd_itm_typ_d_cd_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_typ_d_cd_p = null;

	/**
	 * [Dtl_chd_itm_typ_d_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_typ_d_cd_ListPutter() {
		if (Dtl_chd_itm_typ_d_cd_p == null) {
			Dtl_chd_itm_typ_d_cd_p = createDtl_chd_itm_typ_d_cd_ListPutter(columnDtl_chd_itm_typ_d_cd, "chd_itm_typ_d_cd", "sno_typ1","sno_typ2","sno_typ3","sno_typ4","inst_lot_fix_flg","lot_mix_flg","sublot_mix_flg","alloc_ctl_typ","inpt_ctl_typ","bkf_typ","main_itm_flg","byprod_flg","not_cost_flg");

		}
		return Dtl_chd_itm_typ_d_cd_p;
	}
	
	
	/** [Dtl_alt_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_alt_grp_cd_p = null;

	/**
	 * [Dtl_alt_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alt_grp_cd_ListPutter() {
		if (Dtl_alt_grp_cd_p == null) {
			Dtl_alt_grp_cd_p = createDtl_alt_grp_cd_ListPutter(columnDtl_alt_grp_cd, "alt_grp_cd", "alt_grp_nm","alt_itm_typ");

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
			Dtl_alt_itm_typ_p = createDtl_alt_itm_typ_ListPutter(columnDtl_alt_itm_typ, "alt_itm_typ", "alt_itm_typ_nm");

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
			Dtl_sno_typ1_p = createDtl_sno_typ1_ListPutter(columnDtl_sno_typ1, "sno_typ1", "sno_typ_nm1");

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
			Dtl_sno_typ2_p = createDtl_sno_typ2_ListPutter(columnDtl_sno_typ2, "sno_typ2", "sno_typ_nm2");

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
			Dtl_sno_typ3_p = createDtl_sno_typ3_ListPutter(columnDtl_sno_typ3, "sno_typ3", "sno_typ_nm3");

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
			Dtl_sno_typ4_p = createDtl_sno_typ4_ListPutter(columnDtl_sno_typ4, "sno_typ4", "sno_typ_nm4");

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
			Dtl_in_offst_typ_p = createDtl_in_offst_typ_ListPutter(columnDtl_in_offst_typ, "in_offst_typ", "in_offst_typ_nm");

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
			Dtl_bkf_typ_p = createDtl_bkf_typ_ListPutter(columnDtl_bkf_typ, "bkf_typ", "bkf_typ_nm");

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
			Dtl_alloc_ctl_typ_p = createDtl_alloc_ctl_typ_ListPutter(columnDtl_alloc_ctl_typ, "alloc_ctl_typ", "alloc_ctl_typ_nm");

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
			Dtl_inpt_ctl_typ_p = createDtl_inpt_ctl_typ_ListPutter(columnDtl_inpt_ctl_typ, "inpt_ctl_typ", "inpt_ctl_typ_nm");

		}
		return Dtl_inpt_ctl_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_BomReg create(){
		MABSP_BomReg p = new MABSP_BomReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_BomReg create(String name){
		MABSP_BomReg p = new MABSP_BomReg(name);
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
		MABSP_BomReg_MC.jbfInitScreenOpe((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbfInitRegTarget((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbfInitTop((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbfInitFold((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbfInitCnd((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbfInitCtrl((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbfInitTbl((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbfInitHdr((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbfInitBulkSet((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbfInitDtl((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbfInitBtn((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbfInitEastBtn((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbInitScreenOpe((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbInitRegTarget((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbInitTop((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbInitFold((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbInitCnd((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbInitCtrl((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbInitTbl((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbInitHdr((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbInitBulkSet((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbInitDtl((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbInitBtn((MABSP_BomReg)this);
		MABSP_BomReg_MC.jbInitEastBtn((MABSP_BomReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRegTarget(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.RegTargetPanel = p.beansFactory.createPanel("RegTarget");
		p.RegTargetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_MOD = p.beansFactory.createRadioButton("Cnd.ope_MOD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_cmn_flg = p.beansFactory.createCheckBox("Cnd.cmn_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_srch_cmn = p.beansFactory.createButton("Cnd.srch_cmn");
		p.Cnd_srch_wg = p.beansFactory.createButton("Cnd.srch_wg");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_bom_ptn_Label = p.beansFactory.createLabel("Cnd.bom_ptn_Label");
		p.Cnd_bom_ptn = p.beansFactory.createTextComboBox("Cnd.bom_ptn");
		p.Cnd_bom_ptn.setLabel(p.Cnd_bom_ptn_Label);
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTbl(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.TblPanel = p.beansFactory.createPanel("Tbl");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextComboBox("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_bom_ptn_Label = p.beansFactory.createLabel("Hdr.bom_ptn_Label");
		p.Hdr_bom_ptn = p.beansFactory.createTextField("Hdr.bom_ptn");
		p.Hdr_bom_ptn.setLabel(p.Hdr_bom_ptn_Label);
		p.Hdr_par_base_unit_cd_Label = p.beansFactory.createLabel("Hdr.par_base_unit_cd_Label");
		p.Hdr_par_base_unit_cd = p.beansFactory.createTextField("Hdr.par_base_unit_cd");
		p.Hdr_par_base_unit_cd.setLabel(p.Hdr_par_base_unit_cd_Label);
		p.Hdr_par_base_unit_nm = p.beansFactory.createTextField("Hdr.par_base_unit_nm");
		p.Hdr_par_dec_place = p.beansFactory.createNumberField("Hdr.par_dec_place");
		p.Hdr_par_itm_typ = p.beansFactory.createTextField("Hdr.par_itm_typ");
		p.Hdr_par_itm_typ_d_cd = p.beansFactory.createTextField("Hdr.par_itm_typ_d_cd");
		p.Hdr_par_sno1_mng_typ = p.beansFactory.createTextField("Hdr.par_sno1_mng_typ");
		p.Hdr_par_sno2_mng_typ = p.beansFactory.createTextField("Hdr.par_sno2_mng_typ");
		p.Hdr_par_sno3_mng_typ = p.beansFactory.createTextField("Hdr.par_sno3_mng_typ");
		p.Hdr_par_sno4_mng_typ = p.beansFactory.createTextField("Hdr.par_sno4_mng_typ");
		p.Hdr_par_def_bom_ptn = p.beansFactory.createTextField("Hdr.par_def_bom_ptn");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_st_dt_Label = p.beansFactory.createLabel("BulkSet.st_dt_Label");
		p.BulkSet_st_dt = p.beansFactory.createDateField("BulkSet.st_dt");
		p.BulkSet_st_dt.setLabel(p.BulkSet_st_dt_Label);
		p.BulkSet_end_dt_Label = p.beansFactory.createLabel("BulkSet.end_dt_Label");
		p.BulkSet_end_dt = p.beansFactory.createDateField("BulkSet.end_dt");
		p.BulkSet_end_dt.setLabel(p.BulkSet_end_dt_Label);
		p.BulkSet_set_dt = p.beansFactory.createButton("BulkSet.set_dt");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_par_itm_typ = p.beansFactory.createTableColumn("Dtl.par_itm_typ", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.par_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.par_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.par_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_bom_ptn = p.beansFactory.createTableColumn("Dtl.bom_ptn", MCColumnType.TEXT);
		p.columnDtl_par_base_unit_cd = p.beansFactory.createTableColumn("Dtl.par_base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_par_base_unit_nm = p.beansFactory.createTableColumn("Dtl.par_base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_par_dec_place = p.beansFactory.createTableColumn("Dtl.par_dec_place", MCColumnType.NUMBER);
		p.columnDtl_par_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.par_sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_par_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.par_sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_par_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.par_sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_par_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.par_sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_par_def_bom_ptn = p.beansFactory.createTableColumn("Dtl.par_def_bom_ptn", MCColumnType.TEXT);
		p.columnDtl_oper_cd = p.beansFactory.createTableColumn("Dtl.oper_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_oper_nm = p.beansFactory.createTableColumn("Dtl.oper_nm", MCColumnType.TEXT);
		p.columnDtl_oper_seq = p.beansFactory.createTableColumn("Dtl.oper_seq", MCColumnType.NUMBER);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_chd_dec_place = p.beansFactory.createTableColumn("Dtl.chd_dec_place", MCColumnType.NUMBER);
		p.columnDtl_chd_itm_typ = p.beansFactory.createTableColumn("Dtl.chd_itm_typ", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_d_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_chd_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_chd_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.chd_stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_chd_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.chd_asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_chd_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.chd_sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_chd_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.chd_sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_chd_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.chd_sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_chd_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.chd_sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_chd_def_bom_ptn = p.beansFactory.createTableColumn("Dtl.chd_def_bom_ptn", MCColumnType.TEXT);
		p.columnDtl_ver_flg = p.beansFactory.createTableColumn("Dtl.ver_flg", MCColumnType.CHECK);
		p.columnDtl_byprod_flg = p.beansFactory.createTableColumn("Dtl.byprod_flg", MCColumnType.CHECK);
		p.columnDtl_ph_flg = p.beansFactory.createTableColumn("Dtl.ph_flg", MCColumnType.CHECK);
		p.columnDtl_ph_bom_ptn = p.beansFactory.createTableColumn("Dtl.ph_bom_ptn", MCColumnType.TEXT);
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
		p.columnDtl_chd_base_unit_cd = p.beansFactory.createTableColumn("Dtl.chd_base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_chd_base_unit_nm = p.beansFactory.createTableColumn("Dtl.chd_base_unit_nm", MCColumnType.TEXT);
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
		p.columnDtl_chng_no = p.beansFactory.createTableColumn("Dtl.chng_no", MCColumnType.TEXT);
		p.columnDtl_ext_sys_no_bom = p.beansFactory.createTableColumn("Dtl.ext_sys_no_bom", MCColumnType.TEXT);
		p.columnDtl_not_cost_flg = p.beansFactory.createTableColumn("Dtl.not_cost_flg", MCColumnType.CHECK);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_bom_key = p.beansFactory.createTableColumn("Dtl.bom_key", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_cntr = p.beansFactory.createTableColumn("Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_del_usr_id = p.beansFactory.createTableColumn("Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnDtl_del_usr_nm = p.beansFactory.createTableColumn("Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnDtl_del_ts = p.beansFactory.createTableColumn("Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MABSP0040 = p.beansFactory.createButton("Btn.open_MABSP0040", "open");
		p.Btn_open_MABSP0080 = p.beansFactory.createButton("Btn.open_MABSP0080", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd_cmn = p.beansFactory.createButton("Btn.upd_cmn", "upd");
		p.Btn_upd_wg = p.beansFactory.createButton("Btn.upd_wg", "upd");
		p.Btn_del_cmn = p.beansFactory.createButton("Btn.del_cmn", "del");
		p.Btn_del_wg = p.beansFactory.createButton("Btn.del_wg", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.RegTargetPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRegTarget(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.RegTargetPanel.setBorder(p.RegTargetTitledBorder);
		p.add(p.RegTargetPanel);
		p.RegTargetPanel.setNextBeans(p.TopPanel);
		p.RegTargetPanel.setValueCheck(false);
		p.RegTargetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RegTargetPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.TblPanel);
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
	protected static void jbInitFold(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_MOD);
		p.ScreenOpePanel.add(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP0020.CndR.ope_META);
		p.RegTargetPanel.add(p.Cnd_cmn_flg);
		p.RegTargetPanel.setLastBeans(p.Cnd_cmn_flg);
		p.Cnd_cmn_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_cmn_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0020.CndR.cmn_flg_META);
		p.RegTargetPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0020.CndR.wg_flg_META);
		p.Cnd_srch_cmn.setIcon("SEARCH");
		p.Cnd_srch_cmn.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_cmn);
		p.CndPanel.setLastBeans(p.Cnd_srch_cmn);
		p.Cnd_srch_cmn.setNextBeans(p.Cnd_srch_wg);
		p.Cnd_srch_wg.setIcon("SEARCH");
		p.Cnd_srch_wg.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_wg);
		p.Cnd_srch_wg.setNextBeans(p.Cnd_dt_PPanel);
		p.CndPanel.add(p.Cnd_dt_PPanel);
		p.Cnd_dt_PPanel.setNextBeans(p.Cnd_par_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_p_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub1,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_par_itm_nm);
		p.Cnd_wg_cd.setListType(MCListType.STRICT);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0020.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_bom_ptn);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0020.CndR.wg_nm_META);
		p.Cnd_bom_ptn.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_bom_ptn_Label);
		p.CndPanel.add(p.Cnd_bom_ptn);
		p.Cnd_bom_ptn.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_bom_ptn.setRow(p.getCndR(), mcframe.clientMABS.MABSP0020.CndR.bom_ptn_META);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0020.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0020.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTbl(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.add(p.TblPanel);
		p.TblPanel.setNextBeans(p.BtnPanel);
		p.TblPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.TblPanel.add(p.HdrPanel, null);
		p.TblPanel.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.BulkSetPanel);
		p.TblPanel.add(p.BulkSetPanel, null);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.TblPanel.add(p.DtlPanel, null);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.HdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_par_itm_p_PPanel);
		p.HdrPanel.setLastBeans(p.Hdr_par_itm_p_PPanel);
		p.Hdr_par_itm_p_PPanel.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_par_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Hdr_par_itm_nm,p.Hdr_par_itm_sub1,p.Hdr_par_itm_sub2,p.Hdr_par_itm_sub3,p.Hdr_bom_ptn,p.Hdr_par_base_unit_cd,p.Hdr_par_dec_place,p.Hdr_par_sno1_mng_typ,p.Hdr_par_sno2_mng_typ,p.Hdr_par_sno3_mng_typ,p.Hdr_par_sno4_mng_typ,p.Hdr_par_def_bom_ptn,p.Hdr_par_itm_typ,p.Hdr_par_itm_typ_d_cd,p.Hdr_par_base_unit_nm);
		p.Hdr_par_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Hdr_par_itm_nm,p.Hdr_par_itm_sub2,p.Hdr_par_itm_sub3,p.Hdr_bom_ptn,p.Hdr_par_base_unit_cd,p.Hdr_par_dec_place,p.Hdr_par_sno1_mng_typ,p.Hdr_par_sno2_mng_typ,p.Hdr_par_sno3_mng_typ,p.Hdr_par_sno4_mng_typ,p.Hdr_par_def_bom_ptn,p.Hdr_par_itm_typ,p.Hdr_par_itm_typ_d_cd);
		p.Hdr_par_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Hdr_par_itm_nm,p.Hdr_par_itm_sub3,p.Hdr_bom_ptn,p.Hdr_par_base_unit_cd,p.Hdr_par_dec_place,p.Hdr_par_sno1_mng_typ,p.Hdr_par_sno2_mng_typ,p.Hdr_par_sno3_mng_typ,p.Hdr_par_sno4_mng_typ,p.Hdr_par_def_bom_ptn,p.Hdr_par_itm_typ,p.Hdr_par_itm_typ_d_cd,p.Hdr_par_base_unit_nm);
		p.Hdr_par_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Hdr_par_itm_nm,p.Hdr_bom_ptn,p.Hdr_par_base_unit_cd,p.Hdr_par_dec_place,p.Hdr_par_sno1_mng_typ,p.Hdr_par_sno2_mng_typ,p.Hdr_par_sno3_mng_typ,p.Hdr_par_sno4_mng_typ,p.Hdr_par_def_bom_ptn,p.Hdr_par_itm_typ,p.Hdr_par_itm_typ_d_cd,p.Hdr_par_base_unit_nm);
		p.Hdr_wg_cd.setListType(MCListType.STRICT);
		p.Hdr_wg_cd.setLinkBeans(p.Hdr_wg_nm);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0020.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_bom_ptn);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0020.HdrR.wg_nm_META);
		p.HdrPanel.add(p.Hdr_bom_ptn_Label);
		p.HdrPanel.add(p.Hdr_bom_ptn);
		p.Hdr_bom_ptn.setNextBeans(p.Hdr_par_base_unit_cd);
		p.Hdr_bom_ptn.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0020.HdrR.bom_ptn_META);
		p.HdrPanel.add(p.Hdr_par_base_unit_cd_Label);
		p.HdrPanel.add(p.Hdr_par_base_unit_cd);
		p.Hdr_par_base_unit_cd.setNextBeans(p.Hdr_par_base_unit_nm);
		p.Hdr_par_base_unit_cd.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0020.HdrR.par_base_unit_cd_META);
		p.HdrPanel.add(p.Hdr_par_base_unit_nm);
		p.Hdr_par_base_unit_nm.setNextBeans(p.Hdr_par_dec_place);
		p.Hdr_par_base_unit_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0020.HdrR.par_base_unit_nm_META);
		p.HdrPanel.add(p.Hdr_par_dec_place);
		p.Hdr_par_dec_place.setNextBeans(p.Hdr_par_itm_typ);
		p.Hdr_par_dec_place.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0020.HdrR.par_dec_place_META);
		p.HdrPanel.add(p.Hdr_par_itm_typ);
		p.Hdr_par_itm_typ.setNextBeans(p.Hdr_par_itm_typ_d_cd);
		p.Hdr_par_itm_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0020.HdrR.par_itm_typ_META);
		p.HdrPanel.add(p.Hdr_par_itm_typ_d_cd);
		p.Hdr_par_itm_typ_d_cd.setNextBeans(p.Hdr_par_sno1_mng_typ);
		p.Hdr_par_itm_typ_d_cd.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0020.HdrR.par_itm_typ_d_cd_META);
		p.HdrPanel.add(p.Hdr_par_sno1_mng_typ);
		p.Hdr_par_sno1_mng_typ.setNextBeans(p.Hdr_par_sno2_mng_typ);
		p.Hdr_par_sno1_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0020.HdrR.par_sno1_mng_typ_META);
		p.HdrPanel.add(p.Hdr_par_sno2_mng_typ);
		p.Hdr_par_sno2_mng_typ.setNextBeans(p.Hdr_par_sno3_mng_typ);
		p.Hdr_par_sno2_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0020.HdrR.par_sno2_mng_typ_META);
		p.HdrPanel.add(p.Hdr_par_sno3_mng_typ);
		p.Hdr_par_sno3_mng_typ.setNextBeans(p.Hdr_par_sno4_mng_typ);
		p.Hdr_par_sno3_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0020.HdrR.par_sno3_mng_typ_META);
		p.HdrPanel.add(p.Hdr_par_sno4_mng_typ);
		p.Hdr_par_sno4_mng_typ.setNextBeans(p.Hdr_par_def_bom_ptn);
		p.Hdr_par_sno4_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0020.HdrR.par_sno4_mng_typ_META);
		p.HdrPanel.add(p.Hdr_par_def_bom_ptn);
		p.Hdr_par_def_bom_ptn.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0020.HdrR.par_def_bom_ptn_META);
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel.setValueCheck(false);
		p.BulkSetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BulkSetPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_st_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_st_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_st_dt);
		p.BulkSet_st_dt.setNextBeans(p.BulkSet_end_dt);
		p.BulkSet_st_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0020.BulkSetR.st_dt_META);
		p.BulkSet_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_end_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_end_dt);
		p.BulkSet_end_dt.setNextBeans(p.BulkSet_set_dt);
		p.BulkSet_end_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0020.BulkSetR.end_dt_META);
		p.BulkSet_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.BulkSetPanel.add(p.BulkSet_set_dt);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABSP_BomReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MABSP0040.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABSP0040);
		p.BtnPanel.setLastBeans(p.Btn_open_MABSP0040);
		p.Btn_open_MABSP0040.setNextBeans(p.Btn_open_MABSP0080);
		p.Btn_open_MABSP0080.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MABSP0080);
		p.Btn_open_MABSP0080.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_upd_cmn);
		p.Btn_upd_cmn.setIcon("REGISTER");
		p.Btn_upd_cmn.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_cmn);
		p.Btn_upd_cmn.setNextBeans(p.Btn_upd_wg);
		p.Btn_upd_wg.setIcon("REGISTER");
		p.Btn_upd_wg.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_wg);
		p.Btn_del_cmn.setIcon("DELETE");
		p.Btn_del_cmn.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del_cmn);
		p.EastBtnPanel.add(p.Btn_del_cmn);
		p.Btn_del_cmn.setNextBeans(p.Btn_del_wg);
		p.Btn_del_wg.setIcon("DELETE");
		p.Btn_del_wg.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_wg);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABSP_BomReg p) {
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
		MABSP_BomReg_MC.mcInitScreenOpe((MABSP_BomReg)this);
		MABSP_BomReg_MC.mcInitRegTarget((MABSP_BomReg)this);
		MABSP_BomReg_MC.mcInitTop((MABSP_BomReg)this);
		MABSP_BomReg_MC.mcInitFold((MABSP_BomReg)this);
		MABSP_BomReg_MC.mcInitCnd((MABSP_BomReg)this);
		MABSP_BomReg_MC.mcInitCtrl((MABSP_BomReg)this);
		MABSP_BomReg_MC.mcInitTbl((MABSP_BomReg)this);
		MABSP_BomReg_MC.mcInitHdr((MABSP_BomReg)this);
		MABSP_BomReg_MC.mcInitBulkSet((MABSP_BomReg)this);
		MABSP_BomReg_MC.mcInitDtl((MABSP_BomReg)this);
		MABSP_BomReg_MC.mcInitBtn((MABSP_BomReg)this);
		MABSP_BomReg_MC.mcInitEastBtn((MABSP_BomReg)this);

		// [UPD]ステータスのモードの設定
		MABSP_BomReg_MC.statusInitUPD_ScreenOpe((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitUPD_RegTarget((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitUPD_Top((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitUPD_Fold((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitUPD_Cnd((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitUPD_Ctrl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitUPD_Tbl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitUPD_Hdr((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitUPD_BulkSet((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitUPD_Dtl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitUPD_Btn((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitUPD_EastBtn((MABSP_BomReg)this);

		// [SRCH]ステータスのモードの設定
		MABSP_BomReg_MC.statusInitSRCH_ScreenOpe((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitSRCH_RegTarget((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitSRCH_Top((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitSRCH_Fold((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitSRCH_Cnd((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitSRCH_Ctrl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitSRCH_Tbl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitSRCH_Hdr((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitSRCH_BulkSet((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitSRCH_Dtl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitSRCH_Btn((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitSRCH_EastBtn((MABSP_BomReg)this);

		// [MOD]ステータスのモードの設定
		MABSP_BomReg_MC.statusInitMOD_ScreenOpe((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitMOD_RegTarget((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitMOD_Top((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitMOD_Fold((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitMOD_Cnd((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitMOD_Ctrl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitMOD_Tbl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitMOD_Hdr((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitMOD_BulkSet((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitMOD_Dtl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitMOD_Btn((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitMOD_EastBtn((MABSP_BomReg)this);

		// [DEL]ステータスのモードの設定
		MABSP_BomReg_MC.statusInitDEL_ScreenOpe((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitDEL_RegTarget((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitDEL_Top((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitDEL_Fold((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitDEL_Cnd((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitDEL_Ctrl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitDEL_Tbl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitDEL_Hdr((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitDEL_BulkSet((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitDEL_Dtl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitDEL_Btn((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitDEL_EastBtn((MABSP_BomReg)this);

		// [REF]ステータスのモードの設定
		MABSP_BomReg_MC.statusInitREF_ScreenOpe((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitREF_RegTarget((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitREF_Top((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitREF_Fold((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitREF_Cnd((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitREF_Ctrl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitREF_Tbl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitREF_Hdr((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitREF_BulkSet((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitREF_Dtl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitREF_Btn((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitREF_EastBtn((MABSP_BomReg)this);

		// [FIX_U]ステータスのモードの設定
		MABSP_BomReg_MC.statusInitFIX__U_ScreenOpe((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX__U_RegTarget((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX__U_Top((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX__U_Fold((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX__U_Cnd((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX__U_Ctrl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX__U_Tbl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX__U_Hdr((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX__U_BulkSet((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX__U_Dtl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX__U_Btn((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX__U_EastBtn((MABSP_BomReg)this);

		// [FIX]ステータスのモードの設定
		MABSP_BomReg_MC.statusInitFIX_ScreenOpe((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX_RegTarget((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX_Top((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX_Fold((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX_Cnd((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX_Ctrl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX_Tbl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX_Hdr((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX_BulkSet((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX_Dtl((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX_Btn((MABSP_BomReg)this);
		MABSP_BomReg_MC.statusInitFIX_EastBtn((MABSP_BomReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_BomReg p) {
	}

	/**
	 *  [RegTarget]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRegTarget(MABSP_BomReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_BomReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_BomReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_BomReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_MOD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_cmn_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_srch_cmn.addAllListener(p);
		p.Cnd_srch_cmn.setAPMethodName("doCnd_srch_cmn");
		p.Cnd_srch_wg.addAllListener(p);
		p.Cnd_srch_wg.setAPMethodName("doCnd_srch_wg");
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_bom_ptn.setListListener(p);
		p.Cnd_bom_ptn.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABSP_BomReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Tbl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTbl(MABSP_BomReg p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MABSP_BomReg p) {
		p.Hdr_par_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_par_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_par_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_par_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_bom_ptn.setListListener(p);
		p.Hdr_bom_ptn.addAllListener(p);
		p.Hdr_par_base_unit_cd.setListListener(p);
		p.Hdr_par_base_unit_cd.addAllListener(p);
		p.Hdr_par_base_unit_nm.setListListener(p);
		p.Hdr_par_base_unit_nm.addAllListener(p);
		p.Hdr_par_dec_place.setListListener(p);
		p.Hdr_par_dec_place.addAllListener(p);
		p.Hdr_par_itm_typ.setListListener(p);
		p.Hdr_par_itm_typ.addAllListener(p);
		p.Hdr_par_itm_typ_d_cd.setListListener(p);
		p.Hdr_par_itm_typ_d_cd.addAllListener(p);
		p.Hdr_par_sno1_mng_typ.setListListener(p);
		p.Hdr_par_sno1_mng_typ.addAllListener(p);
		p.Hdr_par_sno2_mng_typ.setListListener(p);
		p.Hdr_par_sno2_mng_typ.addAllListener(p);
		p.Hdr_par_sno3_mng_typ.setListListener(p);
		p.Hdr_par_sno3_mng_typ.addAllListener(p);
		p.Hdr_par_sno4_mng_typ.setListListener(p);
		p.Hdr_par_sno4_mng_typ.addAllListener(p);
		p.Hdr_par_def_bom_ptn.setListListener(p);
		p.Hdr_par_def_bom_ptn.addAllListener(p);
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MABSP_BomReg p) {
		p.BulkSet_st_dt.setListListener(p);
		p.BulkSet_st_dt.addAllListener(p);
		p.BulkSet_end_dt.setListListener(p);
		p.BulkSet_end_dt.addAllListener(p);
		p.BulkSet_set_dt.addAllListener(p);
		p.BulkSet_set_dt.setAPMethodName("doBulkSet_set_dt");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABSP_BomReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_par_itm_typ.addAllListener(p);
		p.columnDtl_par_itm_typ.setListListener(p);
		p.columnDtl_par_itm_typ_nm.addAllListener(p);
		p.columnDtl_par_itm_typ_nm.setListListener(p);
		p.columnDtl_par_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_par_itm_typ_d_cd.setListListener(p);
		p.columnDtl_par_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_par_itm_typ_d_nm.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_bom_ptn.addAllListener(p);
		p.columnDtl_bom_ptn.setListListener(p);
		p.columnDtl_par_base_unit_cd.addAllListener(p);
		p.columnDtl_par_base_unit_cd.setListListener(p);
		p.columnDtl_par_base_unit_nm.addAllListener(p);
		p.columnDtl_par_base_unit_nm.setListListener(p);
		p.columnDtl_par_dec_place.addAllListener(p);
		p.columnDtl_par_dec_place.setListListener(p);
		p.columnDtl_par_sno1_mng_typ.addAllListener(p);
		p.columnDtl_par_sno1_mng_typ.setListListener(p);
		p.columnDtl_par_sno2_mng_typ.addAllListener(p);
		p.columnDtl_par_sno2_mng_typ.setListListener(p);
		p.columnDtl_par_sno3_mng_typ.addAllListener(p);
		p.columnDtl_par_sno3_mng_typ.setListListener(p);
		p.columnDtl_par_sno4_mng_typ.addAllListener(p);
		p.columnDtl_par_sno4_mng_typ.setListListener(p);
		p.columnDtl_par_def_bom_ptn.addAllListener(p);
		p.columnDtl_par_def_bom_ptn.setListListener(p);
		p.columnDtl_oper_cd.addAllListener(p);
		p.columnDtl_oper_cd.setListListener(p);
		p.columnDtl_oper_nm.addAllListener(p);
		p.columnDtl_oper_nm.setListListener(p);
		p.columnDtl_oper_seq.addAllListener(p);
		p.columnDtl_oper_seq.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_chd_dec_place.addAllListener(p);
		p.columnDtl_chd_dec_place.setListListener(p);
		p.columnDtl_chd_itm_typ.addAllListener(p);
		p.columnDtl_chd_itm_typ.setListListener(p);
		p.columnDtl_chd_itm_typ_nm.addAllListener(p);
		p.columnDtl_chd_itm_typ_nm.setListListener(p);
		p.columnDtl_chd_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_chd_itm_typ_d_cd.setListListener(p);
		p.columnDtl_chd_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_chd_itm_typ_d_nm.setListListener(p);
		p.columnDtl_chd_stk_mng_typ.addAllListener(p);
		p.columnDtl_chd_stk_mng_typ.setListListener(p);
		p.columnDtl_chd_asset_mng_typ.addAllListener(p);
		p.columnDtl_chd_asset_mng_typ.setListListener(p);
		p.columnDtl_lot_mng_typ.addAllListener(p);
		p.columnDtl_lot_mng_typ.setListListener(p);
		p.columnDtl_sublot_mng_typ.addAllListener(p);
		p.columnDtl_sublot_mng_typ.setListListener(p);
		p.columnDtl_chd_sno1_mng_typ.addAllListener(p);
		p.columnDtl_chd_sno1_mng_typ.setListListener(p);
		p.columnDtl_chd_sno2_mng_typ.addAllListener(p);
		p.columnDtl_chd_sno2_mng_typ.setListListener(p);
		p.columnDtl_chd_sno3_mng_typ.addAllListener(p);
		p.columnDtl_chd_sno3_mng_typ.setListListener(p);
		p.columnDtl_chd_sno4_mng_typ.addAllListener(p);
		p.columnDtl_chd_sno4_mng_typ.setListListener(p);
		p.columnDtl_chd_def_bom_ptn.addAllListener(p);
		p.columnDtl_chd_def_bom_ptn.setListListener(p);
		p.columnDtl_ver_flg.addAllListener(p);
		p.columnDtl_byprod_flg.addAllListener(p);
		p.columnDtl_ph_flg.addAllListener(p);
		p.columnDtl_ph_bom_ptn.addAllListener(p);
		p.columnDtl_ph_bom_ptn.setListListener(p);
		p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
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
		p.columnDtl_chd_base_unit_cd.addAllListener(p);
		p.columnDtl_chd_base_unit_cd.setListListener(p);
		p.columnDtl_chd_base_unit_nm.addAllListener(p);
		p.columnDtl_chd_base_unit_nm.setListListener(p);
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
		p.columnDtl_chng_no.addAllListener(p);
		p.columnDtl_chng_no.setListListener(p);
		p.columnDtl_ext_sys_no_bom.addAllListener(p);
		p.columnDtl_ext_sys_no_bom.setListListener(p);
		p.columnDtl_not_cost_flg.addAllListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
		p.columnDtl_bom_key.addAllListener(p);
		p.columnDtl_bom_key.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_upd_cntr.addAllListener(p);
		p.columnDtl_upd_cntr.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
		p.columnDtl_del_usr_id.addAllListener(p);
		p.columnDtl_del_usr_id.setListListener(p);
		p.columnDtl_del_usr_nm.addAllListener(p);
		p.columnDtl_del_usr_nm.setListListener(p);
		p.columnDtl_del_ts.addAllListener(p);
		p.columnDtl_del_ts.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABSP_BomReg p) {
		p.Btn_open_MABSP0040.addAllListener(p);
		p.Btn_open_MABSP0040.setAPMethodName("doBtn_open_MABSP0040");
		p.Btn_open_MABSP0080.addAllListener(p);
		p.Btn_open_MABSP0080.setAPMethodName("doBtn_open_MABSP0080");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd_cmn.addAllListener(p);
		p.Btn_upd_cmn.setAPMethodName("doBtn_upd_cmn");
		p.Btn_upd_wg.addAllListener(p);
		p.Btn_upd_wg.setAPMethodName("doBtn_upd_wg");
		p.Btn_del_cmn.addAllListener(p);
		p.Btn_del_cmn.setAPMethodName("doBtn_del_cmn");
		p.Btn_del_wg.addAllListener(p);
		p.Btn_del_wg.setAPMethodName("doBtn_del_wg");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABSP_BomReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABSP_BomReg p){

	}

	/**
	 * [UPD]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RegTarget(MABSP_BomReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABSP_BomReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABSP_BomReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABSP_BomReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.READ_ONLY);
		p.Cnd_par_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_par_itm_p_PPanel.Itm_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABSP_BomReg p){

	}

	/**
	 * [UPD]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tbl(MABSP_BomReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MABSP_BomReg p){
		p.Hdr_par_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_par_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_par_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_par_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ_d_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_par_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_par_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_par_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_par_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_par_def_bom_ptn.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MABSP_BomReg p){
		p.BulkSet_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_set_dt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABSP_BomReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_par_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_par_itm_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wg_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_def_bom_ptn.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_oper_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_chd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_chd_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chd_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_asset_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_def_bom_ptn.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ph_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ph_bom_ptn.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnDtl_alt_itm_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alt_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_alt_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alt_alloc_prio.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno_typ1.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno_typ2.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno_typ3.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno_typ4.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_min_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.Dtl_max_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.Dtl_qty1_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_qty3_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_qty2_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_qty4_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_chd_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chd_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_in_offst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_in_offst.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bkf_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bkf_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_inst_lot_fix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_lot_mix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sublot_mix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alloc_ctl_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alloc_ctl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_main_itm_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_yield_calc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_inpt_ctl_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_inpt_ctl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ext_sys_no_bom.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_not_cost_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bom_key.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABSP_BomReg p){
		p.Btn_open_MABSP0040.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MABSP0080.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_cmn.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_wg.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del_cmn.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABSP_BomReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MABSP_BomReg p){

	}

	/**
	 * [SRCH]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RegTarget(MABSP_BomReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MABSP_BomReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MABSP_BomReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABSP_BomReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_par_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_off_del_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_on_del_flg.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MABSP_BomReg p){

	}

	/**
	 * [SRCH]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tbl(MABSP_BomReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MABSP_BomReg p){
		p.Hdr_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_par_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_par_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_par_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ_d_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_par_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_par_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_par_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_par_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_par_def_bom_ptn.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MABSP_BomReg p){
		p.BulkSet_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MABSP_BomReg p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_par_itm_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_wg_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_par_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_par_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_par_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_par_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_par_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_par_def_bom_ptn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_chd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_chd_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_chd_asset_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_chd_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_chd_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_chd_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_chd_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_chd_def_bom_ptn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ph_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ph_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
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
		p.Dtl_qty1_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty3_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty4_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_chd_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.columnDtl_chng_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_bom.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bom_key.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MABSP_BomReg p){
		p.Btn_open_MABSP0040.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MABSP0080.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MABSP_BomReg p){

	}

	/**
	 * [MOD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitMOD_ScreenOpe(MABSP_BomReg p){

	}

	/**
	 * [MOD]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitMOD_RegTarget(MABSP_BomReg p){

	}

	/**
	 * [MOD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Top(MABSP_BomReg p){

	}

	/**
	 * [MOD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Fold(MABSP_BomReg p){

	}

	/**
	 * [MOD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Cnd(MABSP_BomReg p){
		p.Cnd_ope_Group.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, MOD, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, MOD, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_par_itm_p_PPanel.Itm_itm_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_off_del_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_on_del_flg.putMode(p, MOD, MCMode.REQUIRED);

	}

	/**
	 * [MOD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Ctrl(MABSP_BomReg p){

	}

	/**
	 * [MOD]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Tbl(MABSP_BomReg p){

	}

	/**
	 * [MOD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Hdr(MABSP_BomReg p){
		p.Hdr_par_itm_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_par_base_unit_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_par_base_unit_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_par_dec_place.putMode(p, MOD, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ_d_cd.putMode(p, MOD, MCMode.INVISIBLE);
		p.Hdr_par_sno1_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.Hdr_par_sno2_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.Hdr_par_sno3_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.Hdr_par_sno4_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.Hdr_par_def_bom_ptn.putMode(p, MOD, MCMode.INVISIBLE);

	}

	/**
	 * [MOD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitMOD_BulkSet(MABSP_BomReg p){
		p.BulkSet_st_dt.putMode(p, MOD, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, MOD, MCMode.ENABLE);
		p.BulkSet_set_dt.putMode(p, MOD, MCMode.ENABLE);

	}

	/**
	 * [MOD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Dtl(MABSP_BomReg p){
		p.columnDtl_check.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Dtl_par_itm_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_par_itm_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_nm.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_wg_nm.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_cd.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_nm.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_par_dec_place.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_par_sno1_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_par_sno2_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_par_sno3_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_par_sno4_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_par_def_bom_ptn.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_oper_cd.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_oper_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_disp_seq.putMode(p, MOD, MCMode.REQUIRED);
		p.Dtl_chd_itm_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_chd_dec_place.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_chd_itm_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_chd_stk_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_chd_asset_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_chd_sno1_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_chd_sno2_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_chd_sno3_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_chd_sno4_mng_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_chd_def_bom_ptn.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_ph_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_ph_bom_ptn.putMode(p, MOD, MCMode.REQUIRED);
		p.Dtl_ver_no_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnDtl_alt_itm_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_alt_grp_cd.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_alt_grp_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_alt_itm_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_alt_alloc_prio.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_sno_typ1.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm1.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_sno_typ2.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm2.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_sno_typ3.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm3.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_sno_typ4.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm4.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl_min_sno_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.Dtl_max_sno_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.Dtl_dt_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.Dtl_qty1_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_qty3_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_qty2_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_qty4_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_chd_base_unit_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_chd_base_unit_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_in_offst_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_in_offst.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_bkf_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_bkf_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_inst_lot_fix_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_lot_mix_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_sublot_mix_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_alloc_ctl_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_alloc_ctl_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_main_itm_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_yield_calc_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_inpt_ctl_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_inpt_ctl_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_ext_sys_no_bom.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_not_cost_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_memo1.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_bom_key.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Btn(MABSP_BomReg p){
		p.Btn_open_MABSP0040.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_open_MABSP0080.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_upd_cmn.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_upd_wg.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_del_cmn.putMode(p, MOD, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_EastBtn(MABSP_BomReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABSP_BomReg p){

	}

	/**
	 * [DEL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RegTarget(MABSP_BomReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABSP_BomReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABSP_BomReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABSP_BomReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_par_itm_p_PPanel.Itm_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.REQUIRED);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABSP_BomReg p){

	}

	/**
	 * [DEL]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tbl(MABSP_BomReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MABSP_BomReg p){
		p.Hdr_par_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_par_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_par_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_par_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ_d_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_par_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_par_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_par_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_par_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_par_def_bom_ptn.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MABSP_BomReg p){
		p.BulkSet_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABSP_BomReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_par_itm_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_wg_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_def_bom_ptn.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_oper_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_chd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chd_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_asset_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_def_bom_ptn.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ph_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ph_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_alt_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alt_alloc_prio.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_min_sno_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_max_sno_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.Dtl_qty1_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty3_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty2_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty4_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_chd_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chd_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_in_offst.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inst_lot_fix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_main_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_yield_calc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_bom.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bom_key.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABSP_BomReg p){
		p.Btn_open_MABSP0040.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MABSP0080.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_del_wg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABSP_BomReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_BomReg p){

	}

	/**
	 * [REF]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitREF_RegTarget(MABSP_BomReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_BomReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_BomReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_BomReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_par_itm_p_PPanel.Itm_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_BomReg p){

	}

	/**
	 * [REF]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tbl(MABSP_BomReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MABSP_BomReg p){
		p.Hdr_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_par_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_par_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_par_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ_d_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_par_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_par_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_par_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_par_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_par_def_bom_ptn.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MABSP_BomReg p){
		p.BulkSet_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABSP_BomReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_par_itm_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_def_bom_ptn.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_chd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_asset_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_def_bom_ptn.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ph_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ph_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
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
		p.Dtl_qty1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty3_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty4_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_chd_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnDtl_chng_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_bom.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bom_key.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABSP_BomReg p){
		p.Btn_open_MABSP0040.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MABSP0080.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABSP_BomReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MABSP_BomReg p){

	}

	/**
	 * [FIX_U]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RegTarget(MABSP_BomReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MABSP_BomReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MABSP_BomReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MABSP_BomReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.READ_ONLY);
		p.Cnd_par_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_par_itm_p_PPanel.Itm_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_on_del_flg.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MABSP_BomReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tbl(MABSP_BomReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MABSP_BomReg p){
		p.Hdr_par_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_par_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_par_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_par_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ_d_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_par_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_par_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_par_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_par_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_par_def_bom_ptn.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MABSP_BomReg p){
		p.BulkSet_st_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MABSP_BomReg p){
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_par_itm_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_wg_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_par_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_par_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_par_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_par_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_par_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_par_def_bom_ptn.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_oper_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_chd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_chd_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_chd_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_chd_asset_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_chd_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_chd_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_chd_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_chd_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_chd_def_bom_ptn.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ph_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ph_bom_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_alt_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alt_alloc_prio.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sno_typ1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sno_typ2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sno_typ3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sno_typ4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_min_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_max_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.Dtl_qty1_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty3_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty2_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty4_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_chd_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_chd_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_in_offst.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_inst_lot_fix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_lot_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sublot_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_main_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_yield_calc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_bom.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bom_key.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MABSP_BomReg p){
		p.Btn_open_MABSP0040.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MABSP0080.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MABSP_BomReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABSP_BomReg p){

	}

	/**
	 * [FIX]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RegTarget(MABSP_BomReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABSP_BomReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABSP_BomReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABSP_BomReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, FIX, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_par_itm_p_PPanel.Itm_itm_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.REQUIRED);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABSP_BomReg p){

	}

	/**
	 * [FIX]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tbl(MABSP_BomReg p){

	}

	/**
	 * [FIX]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr(MABSP_BomReg p){
		p.Hdr_par_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_par_base_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_par_base_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_par_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_par_itm_typ_d_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_par_sno1_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_par_sno2_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_par_sno3_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_par_sno4_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_par_def_bom_ptn.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BulkSet(MABSP_BomReg p){
		p.BulkSet_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABSP_BomReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_par_itm_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_wg_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_base_unit_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_sno1_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_sno2_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_sno3_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_sno4_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_def_bom_ptn.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_oper_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_chd_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chd_stk_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_asset_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_sno1_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_sno2_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_sno3_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_sno4_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_def_bom_ptn.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ph_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ph_bom_ptn.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_alt_itm_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alt_alloc_prio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_min_sno_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_max_sno_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.Dtl_qty1_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty3_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty2_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty4_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_chd_base_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chd_base_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_in_offst.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inst_lot_fix_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_mix_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_mix_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_main_itm_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_yield_calc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_bom.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bom_key.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABSP_BomReg p){
		p.Btn_open_MABSP0040.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MABSP0080.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABSP_BomReg p){

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
		MABSP_BomReg_MC.setTableConfigDtl((MABSP_BomReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_BomReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABS.MABSP0020.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABS.MABSP0020.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.DtlTable.addTable(p.Dtl_par_itm_p_PPanel.ItmTable);
		p.columnDtl_par_itm_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.par_itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ);
		p.columnDtl_par_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.par_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ_nm);
		p.columnDtl_par_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0020.DtlR.par_itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ_d_cd);
		p.columnDtl_par_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.par_itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ_d_nm);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0020.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.columnDtl_bom_ptn.setMeta(mcframe.clientMABS.MABSP0020.DtlR.bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_ptn);
		p.columnDtl_par_base_unit_cd.setMeta(mcframe.clientMABS.MABSP0020.DtlR.par_base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_base_unit_cd);
		p.columnDtl_par_base_unit_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.par_base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_base_unit_nm);
		p.columnDtl_par_dec_place.setMeta(mcframe.clientMABS.MABSP0020.DtlR.par_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_dec_place);
		p.columnDtl_par_sno1_mng_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.par_sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_sno1_mng_typ);
		p.columnDtl_par_sno2_mng_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.par_sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_sno2_mng_typ);
		p.columnDtl_par_sno3_mng_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.par_sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_sno3_mng_typ);
		p.columnDtl_par_sno4_mng_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.par_sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_sno4_mng_typ);
		p.columnDtl_par_def_bom_ptn.setMeta(mcframe.clientMABS.MABSP0020.DtlR.par_def_bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_def_bom_ptn);
		p.columnDtl_oper_cd.setMeta(mcframe.clientMABS.MABSP0020.DtlR.oper_cd_META);
		p.columnDtl_oper_cd.addLinkBeans(p.columnDtl_oper_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_cd);
		p.columnDtl_oper_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.oper_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_nm);
		p.columnDtl_oper_seq.setMeta(mcframe.clientMABS.MABSP0020.DtlR.oper_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_seq);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMABS.MABSP0020.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.DtlTable.addTable(p.Dtl_chd_itm_p_PPanel.ItmTable);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_chd_itm_nm, p.columnDtl_chd_itm_sub1, p.columnDtl_chd_itm_sub2, p.columnDtl_chd_itm_sub3, p.columnDtl_chd_base_unit_cd, p.columnDtl_chd_itm_typ, p.columnDtl_chd_itm_typ_nm, p.columnDtl_chd_itm_typ_d_cd, p.columnDtl_chd_itm_typ_d_nm, p.columnDtl_chd_stk_mng_typ, p.columnDtl_chd_asset_mng_typ, p.columnDtl_chd_dec_place, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_chd_sno1_mng_typ, p.columnDtl_chd_sno2_mng_typ, p.columnDtl_chd_sno3_mng_typ, p.columnDtl_chd_sno4_mng_typ, p.columnDtl_ver_flg, p.columnDtl_chd_def_bom_ptn, p.columnDtl_chd_base_unit_nm);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_chd_itm_nm, p.columnDtl_chd_itm_sub2, p.columnDtl_chd_itm_sub3, p.columnDtl_chd_base_unit_cd, p.columnDtl_chd_itm_typ, p.columnDtl_chd_itm_typ_nm, p.columnDtl_chd_itm_typ_d_cd, p.columnDtl_chd_itm_typ_d_nm, p.columnDtl_chd_stk_mng_typ, p.columnDtl_chd_asset_mng_typ, p.columnDtl_chd_dec_place, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_chd_sno1_mng_typ, p.columnDtl_chd_sno2_mng_typ, p.columnDtl_chd_sno3_mng_typ, p.columnDtl_chd_sno4_mng_typ, p.columnDtl_ver_flg, p.columnDtl_chd_def_bom_ptn, p.columnDtl_chd_base_unit_nm);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_chd_itm_nm, p.columnDtl_chd_itm_sub3, p.columnDtl_chd_base_unit_cd, p.columnDtl_chd_itm_typ, p.columnDtl_chd_itm_typ_nm, p.columnDtl_chd_itm_typ_d_cd, p.columnDtl_chd_itm_typ_d_nm, p.columnDtl_chd_stk_mng_typ, p.columnDtl_chd_asset_mng_typ, p.columnDtl_chd_dec_place, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_chd_sno1_mng_typ, p.columnDtl_chd_sno2_mng_typ, p.columnDtl_chd_sno3_mng_typ, p.columnDtl_chd_sno4_mng_typ, p.columnDtl_ver_flg, p.columnDtl_chd_def_bom_ptn, p.columnDtl_chd_base_unit_nm);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_chd_itm_nm, p.columnDtl_chd_base_unit_cd, p.columnDtl_chd_itm_typ, p.columnDtl_chd_itm_typ_nm, p.columnDtl_chd_itm_typ_d_cd, p.columnDtl_chd_itm_typ_d_nm, p.columnDtl_chd_stk_mng_typ, p.columnDtl_chd_asset_mng_typ, p.columnDtl_chd_dec_place, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_chd_sno1_mng_typ, p.columnDtl_chd_sno2_mng_typ, p.columnDtl_chd_sno3_mng_typ, p.columnDtl_chd_sno4_mng_typ, p.columnDtl_ver_flg, p.columnDtl_chd_def_bom_ptn, p.columnDtl_chd_base_unit_nm);
		p.columnDtl_chd_dec_place.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_dec_place);
		p.columnDtl_chd_itm_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ);
		p.columnDtl_chd_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_nm);
		p.columnDtl_chd_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_itm_typ_d_cd_META);
		p.columnDtl_chd_itm_typ_d_cd.addLinkBeans(p.columnDtl_sno_typ1,p.columnDtl_sno_typ2,p.columnDtl_sno_typ3,p.columnDtl_sno_typ4,p.columnDtl_inst_lot_fix_flg,p.columnDtl_lot_mix_flg,p.columnDtl_sublot_mix_flg,p.columnDtl_alloc_ctl_typ,p.columnDtl_inpt_ctl_typ,p.columnDtl_bkf_typ,p.columnDtl_main_itm_flg,p.columnDtl_byprod_flg,p.columnDtl_not_cost_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_d_cd);
		p.columnDtl_chd_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_d_nm);
		p.columnDtl_chd_stk_mng_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_stk_mng_typ);
		p.columnDtl_chd_asset_mng_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_asset_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_asset_mng_typ);
		p.columnDtl_lot_mng_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mng_typ);
		p.columnDtl_sublot_mng_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.sublot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mng_typ);
		p.columnDtl_chd_sno1_mng_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_sno1_mng_typ);
		p.columnDtl_chd_sno2_mng_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_sno2_mng_typ);
		p.columnDtl_chd_sno3_mng_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_sno3_mng_typ);
		p.columnDtl_chd_sno4_mng_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_sno4_mng_typ);
		p.columnDtl_chd_def_bom_ptn.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_def_bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_def_bom_ptn);
		p.columnDtl_ver_flg.setMeta(mcframe.clientMABS.MABSP0020.DtlR.ver_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_flg);
		p.columnDtl_byprod_flg.setMeta(mcframe.clientMABS.MABSP0020.DtlR.byprod_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_byprod_flg);
		p.columnDtl_ph_flg.setMeta(mcframe.clientMABS.MABSP0020.DtlR.ph_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ph_flg);
		p.columnDtl_ph_bom_ptn.setMeta(mcframe.clientMABS.MABSP0020.DtlR.ph_bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ph_bom_ptn);
		p.DtlTable.addTable(p.Dtl_ver_no_p_PPanel.VerNoTable);
		p.columnDtl_alt_itm_flg.setMeta(mcframe.clientMABS.MABSP0020.DtlR.alt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_flg);
		p.columnDtl_alt_grp_cd.setMeta(mcframe.clientMABS.MABSP0020.DtlR.alt_grp_cd_META);
		p.columnDtl_alt_grp_cd.addLinkBeans(p.columnDtl_alt_grp_nm,p.columnDtl_alt_itm_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_grp_cd);
		p.columnDtl_alt_grp_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.alt_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_grp_nm);
		p.columnDtl_alt_itm_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.alt_itm_typ_META);
		p.columnDtl_alt_itm_typ.addLinkBeans(p.columnDtl_alt_itm_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_typ);
		p.columnDtl_alt_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.alt_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_typ_nm);
		p.columnDtl_alt_itm_ratio.setMeta(mcframe.clientMABS.MABSP0020.DtlR.alt_itm_ratio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_ratio);
		p.columnDtl_alt_alloc_prio.setMeta(mcframe.clientMABS.MABSP0020.DtlR.alt_alloc_prio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_alloc_prio);
		p.columnDtl_sno_typ1.setMeta(mcframe.clientMABS.MABSP0020.DtlR.sno_typ1_META);
		p.columnDtl_sno_typ1.addLinkBeans(p.columnDtl_sno_typ_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ1);
		p.columnDtl_sno_typ_nm1.setMeta(mcframe.clientMABS.MABSP0020.DtlR.sno_typ_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ_nm1);
		p.columnDtl_sno_typ2.setMeta(mcframe.clientMABS.MABSP0020.DtlR.sno_typ2_META);
		p.columnDtl_sno_typ2.addLinkBeans(p.columnDtl_sno_typ_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ2);
		p.columnDtl_sno_typ_nm2.setMeta(mcframe.clientMABS.MABSP0020.DtlR.sno_typ_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ_nm2);
		p.columnDtl_sno_typ3.setMeta(mcframe.clientMABS.MABSP0020.DtlR.sno_typ3_META);
		p.columnDtl_sno_typ3.addLinkBeans(p.columnDtl_sno_typ_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ3);
		p.columnDtl_sno_typ_nm3.setMeta(mcframe.clientMABS.MABSP0020.DtlR.sno_typ_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ_nm3);
		p.columnDtl_sno_typ4.setMeta(mcframe.clientMABS.MABSP0020.DtlR.sno_typ4_META);
		p.columnDtl_sno_typ4.addLinkBeans(p.columnDtl_sno_typ_nm4);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ4);
		p.columnDtl_sno_typ_nm4.setMeta(mcframe.clientMABS.MABSP0020.DtlR.sno_typ_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ_nm4);
		p.DtlTable.addTable(p.Dtl_min_sno_p_PPanel.SnoTable);
		p.DtlTable.addTable(p.Dtl_max_sno_p_PPanel.SnoTable);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.DtlTable.addTable(p.Dtl_qty1_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_qty3_p_PPanel.QtyTable);
		p.Dtl_qty3_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_qty2_p_PPanel.QtyTable);
		p.Dtl_qty2_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_qty4_p_PPanel.QtyTable);
		p.Dtl_qty4_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnDtl_chd_base_unit_cd.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_base_unit_cd);
		p.columnDtl_chd_base_unit_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chd_base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_base_unit_nm);
		p.columnDtl_in_offst_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.in_offst_typ_META);
		p.columnDtl_in_offst_typ.addLinkBeans(p.columnDtl_in_offst_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_in_offst_typ);
		p.columnDtl_in_offst_typ_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.in_offst_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_offst_typ_nm);
		p.columnDtl_in_offst.setMeta(mcframe.clientMABS.MABSP0020.DtlR.in_offst_META);
		p.columnDtl_in_offst.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_in_offst);
		p.columnDtl_bkf_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.bkf_typ_META);
		p.columnDtl_bkf_typ.addLinkBeans(p.columnDtl_bkf_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bkf_typ);
		p.columnDtl_bkf_typ_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.bkf_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bkf_typ_nm);
		p.columnDtl_inst_lot_fix_flg.setMeta(mcframe.clientMABS.MABSP0020.DtlR.inst_lot_fix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inst_lot_fix_flg);
		p.columnDtl_lot_mix_flg.setMeta(mcframe.clientMABS.MABSP0020.DtlR.lot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mix_flg);
		p.columnDtl_sublot_mix_flg.setMeta(mcframe.clientMABS.MABSP0020.DtlR.sublot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mix_flg);
		p.columnDtl_alloc_ctl_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.alloc_ctl_typ_META);
		p.columnDtl_alloc_ctl_typ.addLinkBeans(p.columnDtl_alloc_ctl_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_ctl_typ);
		p.columnDtl_alloc_ctl_typ_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.alloc_ctl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_ctl_typ_nm);
		p.columnDtl_main_itm_flg.setMeta(mcframe.clientMABS.MABSP0020.DtlR.main_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_main_itm_flg);
		p.columnDtl_yield_calc_flg.setMeta(mcframe.clientMABS.MABSP0020.DtlR.yield_calc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_yield_calc_flg);
		p.columnDtl_inpt_ctl_typ.setMeta(mcframe.clientMABS.MABSP0020.DtlR.inpt_ctl_typ_META);
		p.columnDtl_inpt_ctl_typ.addLinkBeans(p.columnDtl_inpt_ctl_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_ctl_typ);
		p.columnDtl_inpt_ctl_typ_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.inpt_ctl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_ctl_typ_nm);
		p.columnDtl_chng_no.setMeta(mcframe.clientMABS.MABSP0020.DtlR.chng_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chng_no);
		p.columnDtl_ext_sys_no_bom.setMeta(mcframe.clientMABS.MABSP0020.DtlR.ext_sys_no_bom_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_no_bom);
		p.columnDtl_not_cost_flg.setMeta(mcframe.clientMABS.MABSP0020.DtlR.not_cost_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_cost_flg);
		p.columnDtl_memo1.setMeta(mcframe.clientMABS.MABSP0020.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABS.MABSP0020.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABS.MABSP0020.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_bom_key.setMeta(mcframe.clientMABS.MABSP0020.DtlR.bom_key_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_key);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0020.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0020.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0020.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0020.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0020.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0020.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0020.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0020.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0020.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0020.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABS.MABSP0020.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_par_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bom_ptn.getListConfig().setPutter(getCnd_bom_ptn_ListPutter());
		Hdr_par_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getHdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Hdr_par_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_par_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getHdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Hdr_par_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_par_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getHdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Hdr_par_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_par_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getHdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Hdr_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_wg_cd.getListConfig().setPutter(getHdr_wg_cd_ListPutter());
		columnDtl_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_oper_cd.getListConfig().setPutter(getDtl_oper_cd_ListPutter());
		Dtl_chd_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_chd_itm_typ_d_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_chd_itm_typ_d_cd.getListConfig().setPutter(getDtl_chd_itm_typ_d_cd_ListPutter());
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
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
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
	 * この画面を[MOD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setMODStatus() {
		status = MOD;
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
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
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
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
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
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (MOD.equals(status)) {
			setMODStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
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
	 * [Hdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createHdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createHdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createHdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Hdr_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Dtl_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Dtl_chd_itm_typ_d_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_typ_d_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmTypD");
		return lp;
	}
	 
	/**
	 * [Dtl_alt_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alt_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AltGrpBom");
		return lp;
	}
	 
	/**
	 * [Dtl_alt_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alt_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AltItmTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno_typ1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno_typ1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno_typ2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno_typ2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno_typ3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno_typ3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno_typ4_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno_typ4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_in_offst_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_in_offst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.OffstTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_bkf_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bkf_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BkfTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_alloc_ctl_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alloc_ctl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AllocCtlTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_inpt_ctl_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_inpt_ctl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InptCtlTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_cd) return getCnd_par_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub1) return getCnd_par_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub2) return getCnd_par_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub3) return getCnd_par_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_bom_ptn) return getCnd_bom_ptn(row, info);
		if(combo == Hdr_par_itm_p_PPanel.Itm_itm_cd) return getHdr_par_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Hdr_par_itm_p_PPanel.Itm_itm_sub1) return getHdr_par_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Hdr_par_itm_p_PPanel.Itm_itm_sub2) return getHdr_par_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Hdr_par_itm_p_PPanel.Itm_itm_sub3) return getHdr_par_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Hdr_wg_cd) return getHdr_wg_cd(row, info);
		if(combo == columnDtl_oper_cd) return getDtl_oper_cd(row, info);
		if(combo == Dtl_chd_itm_p_PPanel.columnItm_itm_cd) return getDtl_chd_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_chd_itm_p_PPanel.columnItm_itm_sub1) return getDtl_chd_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_chd_itm_p_PPanel.columnItm_itm_sub2) return getDtl_chd_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_chd_itm_p_PPanel.columnItm_itm_sub3) return getDtl_chd_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_chd_itm_typ_d_cd) return getDtl_chd_itm_typ_d_cd(row, info);
		if(combo == Dtl_ver_no_p_PPanel.columnVerNo_ver_no) return getDtl_ver_no_p_PPanel_columnVerNo_ver_no(row, info);
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
		if (ap == Cnd_srch_cmn) doCnd_srch_cmn(info);
		else if (ap == Cnd_srch_wg) doCnd_srch_wg(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == BulkSet_set_dt) doBulkSet_set_dt(info);
		else if (ap == Btn_open_MABSP0040) doBtn_open_MABSP0040(info);
		else if (ap == Btn_open_MABSP0080) doBtn_open_MABSP0080(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd_cmn) doBtn_upd_cmn(info);
		else if (ap == Btn_upd_wg) doBtn_upd_wg(info);
		else if (ap == Btn_del_cmn) doBtn_del_cmn(info);
		else if (ap == Btn_del_wg) doBtn_del_wg(info);
	}

	/**
	 * [Cnd]パネルの[srch_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_cmn(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_wg(MCEventInfo info);

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [BulkSet]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBulkSet_set_dt(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABSP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABSP0040(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABSP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABSP0080(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_cmn(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_wg(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_cmn(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_wg(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_cmn_flg) return doCnd_cmn_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_bom_ptn) return doCnd_bom_ptn_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_bom_ptn) return doHdr_bom_ptn_VC(info);
		if (vc == Hdr_par_base_unit_cd) return doHdr_par_base_unit_cd_VC(info);
		if (vc == Hdr_par_base_unit_nm) return doHdr_par_base_unit_nm_VC(info);
		if (vc == Hdr_par_dec_place) return doHdr_par_dec_place_VC(info);
		if (vc == Hdr_par_itm_typ) return doHdr_par_itm_typ_VC(info);
		if (vc == Hdr_par_itm_typ_d_cd) return doHdr_par_itm_typ_d_cd_VC(info);
		if (vc == Hdr_par_sno1_mng_typ) return doHdr_par_sno1_mng_typ_VC(info);
		if (vc == Hdr_par_sno2_mng_typ) return doHdr_par_sno2_mng_typ_VC(info);
		if (vc == Hdr_par_sno3_mng_typ) return doHdr_par_sno3_mng_typ_VC(info);
		if (vc == Hdr_par_sno4_mng_typ) return doHdr_par_sno4_mng_typ_VC(info);
		if (vc == Hdr_par_def_bom_ptn) return doHdr_par_def_bom_ptn_VC(info);
		if (vc == BulkSet_st_dt) return doBulkSet_st_dt_VC(info);
		if (vc == BulkSet_end_dt) return doBulkSet_end_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_par_itm_typ) return doDtl_par_itm_typ_VC(info);
		if (vc == columnDtl_par_itm_typ_nm) return doDtl_par_itm_typ_nm_VC(info);
		if (vc == columnDtl_par_itm_typ_d_cd) return doDtl_par_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_par_itm_typ_d_nm) return doDtl_par_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_bom_ptn) return doDtl_bom_ptn_VC(info);
		if (vc == columnDtl_par_base_unit_cd) return doDtl_par_base_unit_cd_VC(info);
		if (vc == columnDtl_par_base_unit_nm) return doDtl_par_base_unit_nm_VC(info);
		if (vc == columnDtl_par_dec_place) return doDtl_par_dec_place_VC(info);
		if (vc == columnDtl_par_sno1_mng_typ) return doDtl_par_sno1_mng_typ_VC(info);
		if (vc == columnDtl_par_sno2_mng_typ) return doDtl_par_sno2_mng_typ_VC(info);
		if (vc == columnDtl_par_sno3_mng_typ) return doDtl_par_sno3_mng_typ_VC(info);
		if (vc == columnDtl_par_sno4_mng_typ) return doDtl_par_sno4_mng_typ_VC(info);
		if (vc == columnDtl_par_def_bom_ptn) return doDtl_par_def_bom_ptn_VC(info);
		if (vc == columnDtl_oper_cd) return doDtl_oper_cd_VC(info);
		if (vc == columnDtl_oper_nm) return doDtl_oper_nm_VC(info);
		if (vc == columnDtl_oper_seq) return doDtl_oper_seq_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_chd_dec_place) return doDtl_chd_dec_place_VC(info);
		if (vc == columnDtl_chd_itm_typ) return doDtl_chd_itm_typ_VC(info);
		if (vc == columnDtl_chd_itm_typ_nm) return doDtl_chd_itm_typ_nm_VC(info);
		if (vc == columnDtl_chd_itm_typ_d_cd) return doDtl_chd_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_chd_itm_typ_d_nm) return doDtl_chd_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_chd_stk_mng_typ) return doDtl_chd_stk_mng_typ_VC(info);
		if (vc == columnDtl_chd_asset_mng_typ) return doDtl_chd_asset_mng_typ_VC(info);
		if (vc == columnDtl_lot_mng_typ) return doDtl_lot_mng_typ_VC(info);
		if (vc == columnDtl_sublot_mng_typ) return doDtl_sublot_mng_typ_VC(info);
		if (vc == columnDtl_chd_sno1_mng_typ) return doDtl_chd_sno1_mng_typ_VC(info);
		if (vc == columnDtl_chd_sno2_mng_typ) return doDtl_chd_sno2_mng_typ_VC(info);
		if (vc == columnDtl_chd_sno3_mng_typ) return doDtl_chd_sno3_mng_typ_VC(info);
		if (vc == columnDtl_chd_sno4_mng_typ) return doDtl_chd_sno4_mng_typ_VC(info);
		if (vc == columnDtl_chd_def_bom_ptn) return doDtl_chd_def_bom_ptn_VC(info);
		if (vc == columnDtl_ver_flg) return doDtl_ver_flg_VC(info);
		if (vc == columnDtl_byprod_flg) return doDtl_byprod_flg_VC(info);
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
		if (vc == columnDtl_chd_base_unit_cd) return doDtl_chd_base_unit_cd_VC(info);
		if (vc == columnDtl_chd_base_unit_nm) return doDtl_chd_base_unit_nm_VC(info);
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
		if (vc == columnDtl_chng_no) return doDtl_chng_no_VC(info);
		if (vc == columnDtl_ext_sys_no_bom) return doDtl_ext_sys_no_bom_VC(info);
		if (vc == columnDtl_not_cost_flg) return doDtl_not_cost_flg_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_bom_key) return doDtl_bom_key_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_upd_cntr) return doDtl_upd_cntr_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl_del_usr_id) return doDtl_del_usr_id_VC(info);
		if (vc == columnDtl_del_usr_nm) return doDtl_del_usr_nm_VC(info);
		if (vc == columnDtl_del_ts) return doDtl_del_ts_VC(info);
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
	 * [Cnd]パネルの[cmn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmn_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[par_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[par_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[par_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[par_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[par_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[par_sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[par_sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[par_sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[par_sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[par_def_bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_def_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_itm_typ_d_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_def_bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_def_bom_ptn_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[chd_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_asset_mng_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[chd_sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_def_bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_def_bom_ptn_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[byprod_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_byprod_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[chd_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_base_unit_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bom_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_ts_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_cmn_flg) doCnd_cmn_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_bom_ptn) doCnd_bom_ptn_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_bom_ptn) doHdr_bom_ptn_NC(info);
		else if (nc == Hdr_par_base_unit_cd) doHdr_par_base_unit_cd_NC(info);
		else if (nc == Hdr_par_base_unit_nm) doHdr_par_base_unit_nm_NC(info);
		else if (nc == Hdr_par_dec_place) doHdr_par_dec_place_NC(info);
		else if (nc == Hdr_par_itm_typ) doHdr_par_itm_typ_NC(info);
		else if (nc == Hdr_par_itm_typ_d_cd) doHdr_par_itm_typ_d_cd_NC(info);
		else if (nc == Hdr_par_sno1_mng_typ) doHdr_par_sno1_mng_typ_NC(info);
		else if (nc == Hdr_par_sno2_mng_typ) doHdr_par_sno2_mng_typ_NC(info);
		else if (nc == Hdr_par_sno3_mng_typ) doHdr_par_sno3_mng_typ_NC(info);
		else if (nc == Hdr_par_sno4_mng_typ) doHdr_par_sno4_mng_typ_NC(info);
		else if (nc == Hdr_par_def_bom_ptn) doHdr_par_def_bom_ptn_NC(info);
		else if (nc == BulkSet_st_dt) doBulkSet_st_dt_NC(info);
		else if (nc == BulkSet_end_dt) doBulkSet_end_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_par_itm_typ) doDtl_par_itm_typ_NC(info);
		else if (nc == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_NC(info);
		else if (nc == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_bom_ptn) doDtl_bom_ptn_NC(info);
		else if (nc == columnDtl_par_base_unit_cd) doDtl_par_base_unit_cd_NC(info);
		else if (nc == columnDtl_par_base_unit_nm) doDtl_par_base_unit_nm_NC(info);
		else if (nc == columnDtl_par_dec_place) doDtl_par_dec_place_NC(info);
		else if (nc == columnDtl_par_sno1_mng_typ) doDtl_par_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_par_sno2_mng_typ) doDtl_par_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_par_sno3_mng_typ) doDtl_par_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_par_sno4_mng_typ) doDtl_par_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_par_def_bom_ptn) doDtl_par_def_bom_ptn_NC(info);
		else if (nc == columnDtl_oper_cd) doDtl_oper_cd_NC(info);
		else if (nc == columnDtl_oper_nm) doDtl_oper_nm_NC(info);
		else if (nc == columnDtl_oper_seq) doDtl_oper_seq_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_chd_dec_place) doDtl_chd_dec_place_NC(info);
		else if (nc == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NC(info);
		else if (nc == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NC(info);
		else if (nc == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_chd_stk_mng_typ) doDtl_chd_stk_mng_typ_NC(info);
		else if (nc == columnDtl_chd_asset_mng_typ) doDtl_chd_asset_mng_typ_NC(info);
		else if (nc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NC(info);
		else if (nc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_chd_sno1_mng_typ) doDtl_chd_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_chd_sno2_mng_typ) doDtl_chd_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_chd_sno3_mng_typ) doDtl_chd_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_chd_sno4_mng_typ) doDtl_chd_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_chd_def_bom_ptn) doDtl_chd_def_bom_ptn_NC(info);
		else if (nc == columnDtl_ver_flg) doDtl_ver_flg_NC(info);
		else if (nc == columnDtl_byprod_flg) doDtl_byprod_flg_NC(info);
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
		else if (nc == columnDtl_chd_base_unit_cd) doDtl_chd_base_unit_cd_NC(info);
		else if (nc == columnDtl_chd_base_unit_nm) doDtl_chd_base_unit_nm_NC(info);
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
		else if (nc == columnDtl_chng_no) doDtl_chng_no_NC(info);
		else if (nc == columnDtl_ext_sys_no_bom) doDtl_ext_sys_no_bom_NC(info);
		else if (nc == columnDtl_not_cost_flg) doDtl_not_cost_flg_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_bom_key) doDtl_bom_key_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_upd_cntr) doDtl_upd_cntr_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_del_usr_id) doDtl_del_usr_id_NC(info);
		else if (nc == columnDtl_del_usr_nm) doDtl_del_usr_nm_NC(info);
		else if (nc == columnDtl_del_ts) doDtl_del_ts_NC(info);
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
	 * [Cnd]パネルの[cmn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_def_bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_def_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_def_bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_def_bom_ptn_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_asset_mng_typ_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[chd_sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_def_bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_def_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[byprod_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_byprod_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[chd_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_key_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_cmn_flg) doCnd_cmn_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_bom_ptn) doCnd_bom_ptn_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_bom_ptn) doHdr_bom_ptn_NE(info);
		else if (ne == Hdr_par_base_unit_cd) doHdr_par_base_unit_cd_NE(info);
		else if (ne == Hdr_par_base_unit_nm) doHdr_par_base_unit_nm_NE(info);
		else if (ne == Hdr_par_dec_place) doHdr_par_dec_place_NE(info);
		else if (ne == Hdr_par_itm_typ) doHdr_par_itm_typ_NE(info);
		else if (ne == Hdr_par_itm_typ_d_cd) doHdr_par_itm_typ_d_cd_NE(info);
		else if (ne == Hdr_par_sno1_mng_typ) doHdr_par_sno1_mng_typ_NE(info);
		else if (ne == Hdr_par_sno2_mng_typ) doHdr_par_sno2_mng_typ_NE(info);
		else if (ne == Hdr_par_sno3_mng_typ) doHdr_par_sno3_mng_typ_NE(info);
		else if (ne == Hdr_par_sno4_mng_typ) doHdr_par_sno4_mng_typ_NE(info);
		else if (ne == Hdr_par_def_bom_ptn) doHdr_par_def_bom_ptn_NE(info);
		else if (ne == BulkSet_st_dt) doBulkSet_st_dt_NE(info);
		else if (ne == BulkSet_end_dt) doBulkSet_end_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_par_itm_typ) doDtl_par_itm_typ_NE(info);
		else if (ne == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_NE(info);
		else if (ne == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_bom_ptn) doDtl_bom_ptn_NE(info);
		else if (ne == columnDtl_par_base_unit_cd) doDtl_par_base_unit_cd_NE(info);
		else if (ne == columnDtl_par_base_unit_nm) doDtl_par_base_unit_nm_NE(info);
		else if (ne == columnDtl_par_dec_place) doDtl_par_dec_place_NE(info);
		else if (ne == columnDtl_par_sno1_mng_typ) doDtl_par_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_par_sno2_mng_typ) doDtl_par_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_par_sno3_mng_typ) doDtl_par_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_par_sno4_mng_typ) doDtl_par_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_par_def_bom_ptn) doDtl_par_def_bom_ptn_NE(info);
		else if (ne == columnDtl_oper_cd) doDtl_oper_cd_NE(info);
		else if (ne == columnDtl_oper_nm) doDtl_oper_nm_NE(info);
		else if (ne == columnDtl_oper_seq) doDtl_oper_seq_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_chd_dec_place) doDtl_chd_dec_place_NE(info);
		else if (ne == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NE(info);
		else if (ne == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NE(info);
		else if (ne == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_chd_stk_mng_typ) doDtl_chd_stk_mng_typ_NE(info);
		else if (ne == columnDtl_chd_asset_mng_typ) doDtl_chd_asset_mng_typ_NE(info);
		else if (ne == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NE(info);
		else if (ne == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_chd_sno1_mng_typ) doDtl_chd_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_chd_sno2_mng_typ) doDtl_chd_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_chd_sno3_mng_typ) doDtl_chd_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_chd_sno4_mng_typ) doDtl_chd_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_chd_def_bom_ptn) doDtl_chd_def_bom_ptn_NE(info);
		else if (ne == columnDtl_ver_flg) doDtl_ver_flg_NE(info);
		else if (ne == columnDtl_byprod_flg) doDtl_byprod_flg_NE(info);
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
		else if (ne == columnDtl_chd_base_unit_cd) doDtl_chd_base_unit_cd_NE(info);
		else if (ne == columnDtl_chd_base_unit_nm) doDtl_chd_base_unit_nm_NE(info);
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
		else if (ne == columnDtl_chng_no) doDtl_chng_no_NE(info);
		else if (ne == columnDtl_ext_sys_no_bom) doDtl_ext_sys_no_bom_NE(info);
		else if (ne == columnDtl_not_cost_flg) doDtl_not_cost_flg_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_bom_key) doDtl_bom_key_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_upd_cntr) doDtl_upd_cntr_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_del_usr_id) doDtl_del_usr_id_NE(info);
		else if (ne == columnDtl_del_usr_nm) doDtl_del_usr_nm_NE(info);
		else if (ne == columnDtl_del_ts) doDtl_del_ts_NE(info);
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
	 * [Cnd]パネルの[cmn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_def_bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_def_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_def_bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_def_bom_ptn_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_asset_mng_typ_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[chd_sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_def_bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_def_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[byprod_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_byprod_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[chd_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_key_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_cmn_flg) doCnd_cmn_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_bom_ptn) doCnd_bom_ptn_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_bom_ptn) doHdr_bom_ptn_NX(info);
		else if (nx == Hdr_par_base_unit_cd) doHdr_par_base_unit_cd_NX(info);
		else if (nx == Hdr_par_base_unit_nm) doHdr_par_base_unit_nm_NX(info);
		else if (nx == Hdr_par_dec_place) doHdr_par_dec_place_NX(info);
		else if (nx == Hdr_par_itm_typ) doHdr_par_itm_typ_NX(info);
		else if (nx == Hdr_par_itm_typ_d_cd) doHdr_par_itm_typ_d_cd_NX(info);
		else if (nx == Hdr_par_sno1_mng_typ) doHdr_par_sno1_mng_typ_NX(info);
		else if (nx == Hdr_par_sno2_mng_typ) doHdr_par_sno2_mng_typ_NX(info);
		else if (nx == Hdr_par_sno3_mng_typ) doHdr_par_sno3_mng_typ_NX(info);
		else if (nx == Hdr_par_sno4_mng_typ) doHdr_par_sno4_mng_typ_NX(info);
		else if (nx == Hdr_par_def_bom_ptn) doHdr_par_def_bom_ptn_NX(info);
		else if (nx == BulkSet_st_dt) doBulkSet_st_dt_NX(info);
		else if (nx == BulkSet_end_dt) doBulkSet_end_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_par_itm_typ) doDtl_par_itm_typ_NX(info);
		else if (nx == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_NX(info);
		else if (nx == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_bom_ptn) doDtl_bom_ptn_NX(info);
		else if (nx == columnDtl_par_base_unit_cd) doDtl_par_base_unit_cd_NX(info);
		else if (nx == columnDtl_par_base_unit_nm) doDtl_par_base_unit_nm_NX(info);
		else if (nx == columnDtl_par_dec_place) doDtl_par_dec_place_NX(info);
		else if (nx == columnDtl_par_sno1_mng_typ) doDtl_par_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_par_sno2_mng_typ) doDtl_par_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_par_sno3_mng_typ) doDtl_par_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_par_sno4_mng_typ) doDtl_par_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_par_def_bom_ptn) doDtl_par_def_bom_ptn_NX(info);
		else if (nx == columnDtl_oper_cd) doDtl_oper_cd_NX(info);
		else if (nx == columnDtl_oper_nm) doDtl_oper_nm_NX(info);
		else if (nx == columnDtl_oper_seq) doDtl_oper_seq_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_chd_dec_place) doDtl_chd_dec_place_NX(info);
		else if (nx == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NX(info);
		else if (nx == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NX(info);
		else if (nx == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_chd_stk_mng_typ) doDtl_chd_stk_mng_typ_NX(info);
		else if (nx == columnDtl_chd_asset_mng_typ) doDtl_chd_asset_mng_typ_NX(info);
		else if (nx == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NX(info);
		else if (nx == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_chd_sno1_mng_typ) doDtl_chd_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_chd_sno2_mng_typ) doDtl_chd_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_chd_sno3_mng_typ) doDtl_chd_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_chd_sno4_mng_typ) doDtl_chd_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_chd_def_bom_ptn) doDtl_chd_def_bom_ptn_NX(info);
		else if (nx == columnDtl_ver_flg) doDtl_ver_flg_NX(info);
		else if (nx == columnDtl_byprod_flg) doDtl_byprod_flg_NX(info);
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
		else if (nx == columnDtl_chd_base_unit_cd) doDtl_chd_base_unit_cd_NX(info);
		else if (nx == columnDtl_chd_base_unit_nm) doDtl_chd_base_unit_nm_NX(info);
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
		else if (nx == columnDtl_chng_no) doDtl_chng_no_NX(info);
		else if (nx == columnDtl_ext_sys_no_bom) doDtl_ext_sys_no_bom_NX(info);
		else if (nx == columnDtl_not_cost_flg) doDtl_not_cost_flg_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_bom_key) doDtl_bom_key_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_upd_cntr) doDtl_upd_cntr_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_del_usr_id) doDtl_del_usr_id_NX(info);
		else if (nx == columnDtl_del_usr_nm) doDtl_del_usr_nm_NX(info);
		else if (nx == columnDtl_del_ts) doDtl_del_ts_NX(info);
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
	 * [Cnd]パネルの[cmn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_def_bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_def_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_def_bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_def_bom_ptn_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_asset_mng_typ_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[chd_sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_def_bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_def_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[byprod_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_byprod_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[chd_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_key_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_bom_ptn) doCnd_bom_ptn_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_bom_ptn) doHdr_bom_ptn_LC(info);
		else if (lc == Hdr_par_base_unit_cd) doHdr_par_base_unit_cd_LC(info);
		else if (lc == Hdr_par_base_unit_nm) doHdr_par_base_unit_nm_LC(info);
		else if (lc == Hdr_par_dec_place) doHdr_par_dec_place_LC(info);
		else if (lc == Hdr_par_itm_typ) doHdr_par_itm_typ_LC(info);
		else if (lc == Hdr_par_itm_typ_d_cd) doHdr_par_itm_typ_d_cd_LC(info);
		else if (lc == Hdr_par_sno1_mng_typ) doHdr_par_sno1_mng_typ_LC(info);
		else if (lc == Hdr_par_sno2_mng_typ) doHdr_par_sno2_mng_typ_LC(info);
		else if (lc == Hdr_par_sno3_mng_typ) doHdr_par_sno3_mng_typ_LC(info);
		else if (lc == Hdr_par_sno4_mng_typ) doHdr_par_sno4_mng_typ_LC(info);
		else if (lc == Hdr_par_def_bom_ptn) doHdr_par_def_bom_ptn_LC(info);
		else if (lc == BulkSet_st_dt) doBulkSet_st_dt_LC(info);
		else if (lc == BulkSet_end_dt) doBulkSet_end_dt_LC(info);
		else if (lc == columnDtl_par_itm_typ) doDtl_par_itm_typ_LC(info);
		else if (lc == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_LC(info);
		else if (lc == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_bom_ptn) doDtl_bom_ptn_LC(info);
		else if (lc == columnDtl_par_base_unit_cd) doDtl_par_base_unit_cd_LC(info);
		else if (lc == columnDtl_par_base_unit_nm) doDtl_par_base_unit_nm_LC(info);
		else if (lc == columnDtl_par_dec_place) doDtl_par_dec_place_LC(info);
		else if (lc == columnDtl_par_sno1_mng_typ) doDtl_par_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_par_sno2_mng_typ) doDtl_par_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_par_sno3_mng_typ) doDtl_par_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_par_sno4_mng_typ) doDtl_par_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_par_def_bom_ptn) doDtl_par_def_bom_ptn_LC(info);
		else if (lc == columnDtl_oper_cd) doDtl_oper_cd_LC(info);
		else if (lc == columnDtl_oper_nm) doDtl_oper_nm_LC(info);
		else if (lc == columnDtl_oper_seq) doDtl_oper_seq_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_chd_dec_place) doDtl_chd_dec_place_LC(info);
		else if (lc == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_LC(info);
		else if (lc == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_LC(info);
		else if (lc == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_chd_stk_mng_typ) doDtl_chd_stk_mng_typ_LC(info);
		else if (lc == columnDtl_chd_asset_mng_typ) doDtl_chd_asset_mng_typ_LC(info);
		else if (lc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_LC(info);
		else if (lc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_chd_sno1_mng_typ) doDtl_chd_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_chd_sno2_mng_typ) doDtl_chd_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_chd_sno3_mng_typ) doDtl_chd_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_chd_sno4_mng_typ) doDtl_chd_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_chd_def_bom_ptn) doDtl_chd_def_bom_ptn_LC(info);
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
		else if (lc == columnDtl_chd_base_unit_cd) doDtl_chd_base_unit_cd_LC(info);
		else if (lc == columnDtl_chd_base_unit_nm) doDtl_chd_base_unit_nm_LC(info);
		else if (lc == columnDtl_in_offst_typ) doDtl_in_offst_typ_LC(info);
		else if (lc == columnDtl_in_offst_typ_nm) doDtl_in_offst_typ_nm_LC(info);
		else if (lc == columnDtl_in_offst) doDtl_in_offst_LC(info);
		else if (lc == columnDtl_bkf_typ) doDtl_bkf_typ_LC(info);
		else if (lc == columnDtl_bkf_typ_nm) doDtl_bkf_typ_nm_LC(info);
		else if (lc == columnDtl_alloc_ctl_typ) doDtl_alloc_ctl_typ_LC(info);
		else if (lc == columnDtl_alloc_ctl_typ_nm) doDtl_alloc_ctl_typ_nm_LC(info);
		else if (lc == columnDtl_inpt_ctl_typ) doDtl_inpt_ctl_typ_LC(info);
		else if (lc == columnDtl_inpt_ctl_typ_nm) doDtl_inpt_ctl_typ_nm_LC(info);
		else if (lc == columnDtl_chng_no) doDtl_chng_no_LC(info);
		else if (lc == columnDtl_ext_sys_no_bom) doDtl_ext_sys_no_bom_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_bom_key) doDtl_bom_key_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_upd_cntr) doDtl_upd_cntr_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_del_usr_id) doDtl_del_usr_id_LC(info);
		else if (lc == columnDtl_del_usr_nm) doDtl_del_usr_nm_LC(info);
		else if (lc == columnDtl_del_ts) doDtl_del_ts_LC(info);
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
	 * [Cnd]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_def_bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_def_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_def_bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_def_bom_ptn_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_asset_mng_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[chd_sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_def_bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_def_bom_ptn_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[chd_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_key_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bom_ptn]の作成メソッド
	 */
	public MCList getCnd_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBomPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_par_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getHdr_par_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_par_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getHdr_par_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_par_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getHdr_par_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_par_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getHdr_par_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_wg_cd]の作成メソッド
	 */
	public MCList getHdr_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_oper_cd]の作成メソッド
	 */
	public MCList getDtl_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_chd_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_chd_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_chd_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_chd_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_chd_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_chd_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_chd_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_chd_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_chd_itm_typ_d_cd]の作成メソッド
	 */
	public MCList getDtl_chd_itm_typ_d_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmTypD(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_ver_no_p_PPanel_columnVerNo_ver_no]の作成メソッド
	 */
	public MCList getDtl_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alt_grp_cd]の作成メソッド
	 */
	public MCList getDtl_alt_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAltGrpBom(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alt_itm_typ]の作成メソッド
	 */
	public MCList getDtl_alt_itm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAltItmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno_typ1]の作成メソッド
	 */
	public MCList getDtl_sno_typ1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno_typ2]の作成メソッド
	 */
	public MCList getDtl_sno_typ2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno_typ3]の作成メソッド
	 */
	public MCList getDtl_sno_typ3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno_typ4]の作成メソッド
	 */
	public MCList getDtl_sno_typ4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_in_offst_typ]の作成メソッド
	 */
	public MCList getDtl_in_offst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOffstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bkf_typ]の作成メソッド
	 */
	public MCList getDtl_bkf_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBkfTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alloc_ctl_typ]の作成メソッド
	 */
	public MCList getDtl_alloc_ctl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocCtlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_inpt_ctl_typ]の作成メソッド
	 */
	public MCList getDtl_inpt_ctl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInptCtlTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL0020.Srch01")) {
			return new MA_MABSL0020_Srch01Bridge();
		}
		if (id.equals("MA.MABSL0020.Upd01")) {
			return new MA_MABSL0020_Upd01Bridge();
		}
		if (id.equals("MA.MABSL0020.Del01")) {
			return new MA_MABSL0020_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0020_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0020_Srch01;

		/** コンストラクタ */
		protected MA_MABSL0020_Srch01Bridge() {
			p_MA_MABSL0020_Srch01 = new MCParam(PDef.MA_MABSL0020_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0020_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP0020.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0020.DtlR.class));

			p_MA_MABSL0020_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0020_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0020_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0020_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0020_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP0020.CndR up0() {
			return (mcframe.clientMABS.MABSP0020.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0020.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0020.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0020.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0020_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0020.DtlR>)p_MA_MABSL0020_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABSL0020_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0020_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0020_Upd01;

		/** コンストラクタ */
		protected MA_MABSL0020_Upd01Bridge() {
			p_MA_MABSL0020_Upd01 = new MCParam(PDef.MA_MABSL0020_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0020_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0020.DtlR.class));
			param.addUpBlock(mcframe.clientMABS.MABSP0020.CndR.create());
			// Down

			p_MA_MABSL0020_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0020_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0020_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABSL0020_Upd01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0020_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0020_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0020.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0020.DtlR>)up(0);
		}
		protected mcframe.clientMABS.MABSP0020.CndR up1() {
			return (mcframe.clientMABS.MABSP0020.CndR)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0020_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABSL0020_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0020_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0020_Del01;

		/** コンストラクタ */
		protected MA_MABSL0020_Del01Bridge() {
			p_MA_MABSL0020_Del01 = new MCParam(PDef.MA_MABSL0020_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0020_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0020.DtlR.class));
			// Down

			p_MA_MABSL0020_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0020_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0020_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0020_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0020_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0020.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0020.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0020_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}