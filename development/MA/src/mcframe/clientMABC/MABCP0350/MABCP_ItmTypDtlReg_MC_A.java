package mcframe.clientMABC.MABCP0350;

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
import mcframe.clientMABC.MABCP0350.MABCP_ItmTypDtlReg_MC.MA_MABCL0350_Srch01Caller;
import mcframe.clientMABC.MABCP0350.MABCP_ItmTypDtlReg_MC.MA_MABCL0350_Upd01Caller;
import mcframe.clientMABC.MABCP0350.MABCP_ItmTypDtlReg_MC.MA_MABCL0350_Del01Caller;

/**
 * 画面"MABCP_ItmTypDtlReg"パネルクラスです。<p>
 *
 * 品目区分詳細マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_ItmTypDtlReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABCP0350";

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
	// [Mst]ブロック関連のField定義
	public MCPanel MstPanel = null;
	// [Mst]ブロックの項目のField定義
	public MCLabel Mst_mst_set_typ_nm_Label = null;
	/**
	 * Management 管理.<p>
	 *
	 */
	public MCTextField Mst_mst_set_typ_nm = null;
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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_nm;	// [Cnd]の[itm_typ_p.itm_typ_nm]を[Cnd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public MCLabel Cnd_memo1_Label = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCTextField Cnd_memo1 = null;
	public MCLabel Cnd_memo2_Label = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCTextField Cnd_memo2 = null;
	public MCLabel Cnd_memo3_Label = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCTextField Cnd_memo3 = null;
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
	// [Wrk]ブロック関連のField定義
	public MCPanel WrkPanel = null;
	// [Wrk]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0350.DtlR> DtlTable = null;
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
	public MCColumnConfig columnDtl_itm_typ_d_nm_lcl = null;
	/**
	 * Standard item type details name 標準品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_nm = null;
	/**
	 * Sales 販売.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sls_flg = null;
	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mfg_flg = null;
	/**
	 * Purchase 購買.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_purc_flg = null;
	/**
	 * Inspection 検査.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_insp_flg = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_itm_jnl_nm = null;
	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_ac_itm_grp_cd = null;
	/**
	 * Accounting item classification name 会計品目分類名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_ac_itm_grp_nm = null;
	/**
	 * Accept negative inventory マイナス在庫許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_minus_stk_flg = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_lot_mng_typ = null;
	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_lot_mng_typ_nm = null;
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_lot_no_typ = null;
	/**
	 * Lot No. numbering type name ロットＮＯ発番区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_lot_no_typ_nm = null;
	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_lot_no_ptn_cd = null;
	/**
	 * Lot No. numbering pattern name ロットＮＯ発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_lot_no_ptn_nm = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sublot_mng_typ = null;
	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sublot_mng_typ_nm = null;
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sublot_no_typ = null;
	/**
	 * Sublot No. numbering type name サブロットＮＯ発番区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sublot_no_typ_nm = null;
	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sublot_no_ptn_cd = null;
	/**
	 * Sublot No. numbering pattern name サブロットＮＯ発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sublot_no_ptn_nm = null;
	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_bp_lot_flg = null;
	/**
	 * Disallow new lot input 新規ロット入力不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_not_new_lot_flg = null;
	/**
	 * Check GI allocation 出庫引当確認.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_gi_alloc_flg = null;
	/**
	 * SKU allocation 荷姿引当.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_pack_alloc_flg = null;
	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_comp_spec_typ = null;
	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_comp_spec_typ_nm = null;
	/**
	 * Allow sales order configuration rev. 受注時構成改訂許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_comp_rev_at_slo_flg = null;
	/**
	 * Configuration main item 構成主品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_comp_core_itm_flg = null;
	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_itm_spec_grp_cd = null;
	/**
	 * Item specification classification name 品目仕様分類名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_itm_spec_grp_nm = null;
	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_insp_bind_typ = null;
	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_insp_bind_typ_nm = null;
	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_skip_chk_ship_flg = null;
	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_lmt_ctl_flg = null;
	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_lmt_ctl_categ = null;
	/**
	 * Prohibit shipping lot reversal 出荷ロット逆転禁止.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_ship_lot_back_stop_flg = null;
	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_ship_valid_grp_cd = null;
	/**
	 * Shipping expiration date group name 出荷有効期限グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_ship_valid_grp_nm = null;
	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sls_upri_grp_cd = null;
	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sls_upri_grp_nm = null;
	/**
	 * Sales order procurement item 受注手配品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_slo_proc_flg = null;
	/**
	 * Sales order procurement type 受注手配区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_slo_proc_typ = null;
	/**
	 * Sales order procurement type name 受注手配区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_slo_proc_typ_nm = null;
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_ship_inst_typ = null;
	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_ship_inst_typ_nm = null;
	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_itm_ship_grp_cd = null;
	/**
	 * Item shipping group name 品目出荷グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_itm_ship_grp_nm = null;
	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_arr_skip_flg = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_ship_term_cd = null;
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_ship_term_nm = null;
	/**
	 * For identification tag output 現品票出力対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_stk_lst_flg = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_ver_flg = null;
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mfg_inst_unit_typ = null;
	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mfg_inst_unit_typ_nm = null;
	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sls_upri_cng_flg = null;
	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_purc_upri_cng_flg = null;
	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_prov_upri_cng_flg = null;
	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mrp_proc_typ = null;
	/**
	 * MRP processing type name ＭＲＰ処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mrp_proc_typ_nm = null;
	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_rqmt_typ = null;
	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_rqmt_typ_nm = null;
	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_prod_pln_typ = null;
	/**
	 * Production planning type name 生産計画立案区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_prod_pln_typ_nm = null;
	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_dmnd_date_div_mons = null;
	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_alloc_margin_days = null;
	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mrp_alloc_margin_days = null;
	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mrp_opn_xfr_days = null;
	/**
	 * Allow input item addition 投入品追加許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_inpt_itm_add_flg = null;
	/**
	 * Allow input item deletion 投入品削除許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_inpt_itm_del_flg = null;
	/**
	 * Scheduler スケジューラ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sch_flg = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 1 management type name 手配ＮＯ１管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno1_mng_typ_nm = null;
	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_slo_sno1_flg = null;
	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_rqmt_sno1_flg = null;
	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno1_num_typ = null;
	/**
	 * SEIBAN No. 1 numbering type name 手配ＮＯ１発番区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno1_num_typ_nm = null;
	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno1_ptn_cd = null;
	/**
	 * SEIBAN No. 1 numbering pattern name 手配ＮＯ１発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno1_ptn_nm = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type name 手配ＮＯ２管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno2_mng_typ_nm = null;
	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_slo_sno2_flg = null;
	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_rqmt_sno2_flg = null;
	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno2_num_typ = null;
	/**
	 * SEIBAN No. 2 numbering type name 手配ＮＯ２発番区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno2_num_typ_nm = null;
	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno2_ptn_cd = null;
	/**
	 * SEIBAN No. 2 numbering pattern name 手配ＮＯ２発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno2_ptn_nm = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type name 手配ＮＯ３管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno3_mng_typ_nm = null;
	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_slo_sno3_flg = null;
	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_rqmt_sno3_flg = null;
	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno3_num_typ = null;
	/**
	 * SEIBAN No. 3 numbering type name 手配ＮＯ３発番区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno3_num_typ_nm = null;
	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno3_ptn_cd = null;
	/**
	 * SEIBAN No. 3 numbering pattern name 手配ＮＯ３発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno3_ptn_nm = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno4_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type name 手配ＮＯ４管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno4_mng_typ_nm = null;
	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_slo_sno4_flg = null;
	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_rqmt_sno4_flg = null;
	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno4_num_typ = null;
	/**
	 * SEIBAN No. 4 numbering type name 手配ＮＯ４発番区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno4_num_typ_nm = null;
	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno4_ptn_cd = null;
	/**
	 * SEIBAN No. 4 numbering pattern name 手配ＮＯ４発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno4_ptn_nm = null;
	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mrkt_judg_flg = null;
	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mrkt_judg_role_cd = null;
	/**
	 * Market release decision approval role name 市場出荷判定承認役割名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mrkt_judg_role_nm = null;
	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mrkt_judg_upd_role_cd = null;
	/**
	 * Market release decision updating role name 市場出荷判定更新役割名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mrkt_judg_upd_role_nm = null;
	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_plnt_aprv_flg = null;
	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_plnt_aprv_role_cd = null;
	/**
	 * Factory release approval role name 工場出荷承認役割名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_plnt_aprv_role_nm = null;
	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_insp_aprv_flg = null;
	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_insp_aprv_role_cd = null;
	/**
	 * Inspection approval role name 検査承認役割名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_insp_aprv_role_nm = null;
	/**
	 * For mfg. approval 製造承認対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mfg_aprv_flg = null;
	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mfg_aprv_role_cd = null;
	/**
	 * Mfg. approval role name 製造承認役割名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_mfg_aprv_role_nm = null;
	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno_typ1 = null;
	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno_typ_nm1 = null;
	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno_typ2 = null;
	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno_typ_nm2 = null;
	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno_typ3 = null;
	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno_typ_nm3 = null;
	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno_typ4 = null;
	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sno_typ_nm4 = null;
	/**
	 * By-product 副産品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_byprod_flg = null;
	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_inst_lot_fix_flg = null;
	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_lot_mix_flg = null;
	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_sublot_mix_flg = null;
	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_alloc_ctl_typ = null;
	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_alloc_ctl_typ_nm = null;
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_inpt_ctl_typ = null;
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_inpt_ctl_typ_nm = null;
	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_bkf_typ = null;
	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_bkf_typ_nm = null;
	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_main_itm_flg = null;
	/**
	 * Not costing (BOM) 原価対象外（ＢＯＭ）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_not_cost_bom_flg = null;
	/**
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_calc_ptn_cd = null;
	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_calc_ptn_nm = null;
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
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtn_rcopy = null;
	// [LclWrk]ブロック関連のField定義
	public MCPanel LclWrkPanel = null;
	// [LclWrk]ブロックの項目のField定義
	// [Lcl]ブロック関連のField定義
	public MCPanel LclPanel = null;
	public MCScrollPane LclScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0350.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnLcl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_itm_typ_d_cd = null;
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_cd = null;
	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_nm = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_itm_typ_d_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_srv_req_no = null;
	// [LclBtn]ブロック関連のField定義
	public MCPanel LclBtnPanel = null;
	// [LclBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton LclBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton LclBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton LclBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton LclBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton LclBtn_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0350_Srch01]のCallerの作成 */
	protected MABCP_ItmTypDtlReg_MC.MA_MABCL0350_Srch01Caller createMA_MABCL0350_Srch01() {
		MABCP_ItmTypDtlReg_MC.MA_MABCL0350_Srch01Caller<MABCP_ItmTypDtlReg, MA_MABCL0350_Srch01Bridge>
		caller = ((MABCP_ItmTypDtlReg_MC)this).new MA_MABCL0350_Srch01Caller<MABCP_ItmTypDtlReg, MA_MABCL0350_Srch01Bridge>(
					(MABCP_ItmTypDtlReg)this, new MA_MABCL0350_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0350_Srch01]の呼び出し */
	protected void callMA_MABCL0350_Srch01() {
		MCCaller caller = createMA_MABCL0350_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0350_Upd01]のCallerの作成 */
	protected MABCP_ItmTypDtlReg_MC.MA_MABCL0350_Upd01Caller createMA_MABCL0350_Upd01() {
		MABCP_ItmTypDtlReg_MC.MA_MABCL0350_Upd01Caller<MABCP_ItmTypDtlReg, MA_MABCL0350_Upd01Bridge>
		caller = ((MABCP_ItmTypDtlReg_MC)this).new MA_MABCL0350_Upd01Caller<MABCP_ItmTypDtlReg, MA_MABCL0350_Upd01Bridge>(
					(MABCP_ItmTypDtlReg)this, new MA_MABCL0350_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0350_Upd01]の呼び出し */
	protected void callMA_MABCL0350_Upd01() {
		MCCaller caller = createMA_MABCL0350_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0350_Del01]のCallerの作成 */
	protected MABCP_ItmTypDtlReg_MC.MA_MABCL0350_Del01Caller createMA_MABCL0350_Del01() {
		MABCP_ItmTypDtlReg_MC.MA_MABCL0350_Del01Caller<MABCP_ItmTypDtlReg, MA_MABCL0350_Del01Bridge>
		caller = ((MABCP_ItmTypDtlReg_MC)this).new MA_MABCL0350_Del01Caller<MABCP_ItmTypDtlReg, MA_MABCL0350_Del01Bridge>(
					(MABCP_ItmTypDtlReg)this, new MA_MABCL0350_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0350_Del01]の呼び出し */
	protected void callMA_MABCL0350_Del01() {
		MCCaller caller = createMA_MABCL0350_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0350.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0350.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0350.DtlR> aDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0350.LclR> aLclL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0350.LclR> aLclAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0350.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0350.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0350.MstR createMstR() {
		return mcframe.clientMABC.MABCP0350.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0350.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0350.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0350.CndR createCndR() {
		return mcframe.clientMABC.MABCP0350.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0350.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0350.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0350.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0350.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0350.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0350.DtlR.class);
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
	 * コピーによってaLclLを設定します。
	 *
	 * aLclLのインスタンスは変更されません。
	 *
	 * @param dataset LclL
	 */
	public void setLclL(MCList<mcframe.clientMABC.MABCP0350.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0350.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABC.MABCP0350.LclR createLclR() {
		return mcframe.clientMABC.MABCP0350.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0350.LclR> createLclL() {
		return MCList.create(mcframe.clientMABC.MABCP0350.LclR.class);
	}

	/**
	 * LclTableを初期化します。
	 */
	protected void createLclTable(){
		if(LclTable == null){
			LclTable = beansFactory.createTable2("Lcl.table");
		}
	}

	/**
	 * コピーによってaLclAllLを設定します。
	 *
	 * aLclAllLのインスタンスは変更されません。
	 *
	 * @param dataset LclAllL
	 */
	public void setLclAllL(MCList<mcframe.clientMABC.MABCP0350.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0350.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABC.MABCP0350.LclR createLclAllR() {
		return mcframe.clientMABC.MABCP0350.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0350.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0350.LclR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getMstR())) ret.add(getMstR());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getLclL())) ret.add(getLclL());
		if(!MCCollectionUtil.contains(ret, getLclAllL())) ret.add(getLclAllL());
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
		if(aCnt == getMstR()) return "Mst";
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getLclL()) return "Lcl";
		if(aCnt == getLclAllL()) return "LclAll";
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
		if(bId.equals("Mst")) return getMstR();
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Lcl")) return getLclL();
		if(bId.equals("LclAll")) return getLclAllL();
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
		ret.add(MstPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(WrkPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(LclWrkPanel);
		ret.add(LclPanel);
		ret.add(LclBtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ItmTypDtlReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		aLclL = createLclL();
		aLclAllL = createLclAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_ItmTypDtlReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aLclL = createLclL();
		createLclTable();
		LclTable.setRowName(name);
		aLclAllL = createLclAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_ItmTypDtlReg_MC.jbCreateScreenOpe((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbCreateMst((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbCreateTop((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbCreateFold((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbCreateCnd((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbCreateCtrl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbCreateWrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbCreateDtl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbCreateDtlBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbCreateLclWrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbCreateLcl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbCreateLclBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbCreateBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbCreateEastBtn((MABCP_ItmTypDtlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_ItmTypDtlReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_ItmTypDtlReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_ItmTypDtlReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_ItmTypDtlReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_ItmTypDtlReg p) {
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
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_ItmTypDtlReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABCP_ItmTypDtlReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_ItmTypDtlReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_ItmTypDtlReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABCP_ItmTypDtlReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABCP_ItmTypDtlReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABCP_ItmTypDtlReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_ItmTypDtlReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_ItmTypDtlReg p) {
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

	
	/** [Dtl_itm_typ_ListPutter]の定義 */
	private MCListPutter Dtl_itm_typ_p = null;

	/**
	 * [Dtl_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_typ_ListPutter() {
		if (Dtl_itm_typ_p == null) {
			Dtl_itm_typ_p = createDtl_itm_typ_ListPutter(columnDtl_itm_typ, "itm_typ", "itm_typ_nm");

		}
		return Dtl_itm_typ_p;
	}
	
	
	/** [Dtl_def_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_itm_jnl_cd_p = null;

	/**
	 * [Dtl_def_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_itm_jnl_cd_ListPutter() {
		if (Dtl_def_itm_jnl_cd_p == null) {
			Dtl_def_itm_jnl_cd_p = createDtl_def_itm_jnl_cd_ListPutter(columnDtl_def_itm_jnl_cd, "def_itm_jnl_cd", "def_itm_jnl_nm");

		}
		return Dtl_def_itm_jnl_cd_p;
	}
	
	
	/** [Dtl_def_ac_itm_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_ac_itm_grp_cd_p = null;

	/**
	 * [Dtl_def_ac_itm_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_ac_itm_grp_cd_ListPutter() {
		if (Dtl_def_ac_itm_grp_cd_p == null) {
			Dtl_def_ac_itm_grp_cd_p = createDtl_def_ac_itm_grp_cd_ListPutter(columnDtl_def_ac_itm_grp_cd, "def_ac_itm_grp_cd", "def_ac_itm_grp_nm");

		}
		return Dtl_def_ac_itm_grp_cd_p;
	}
	
	
	/** [Dtl_def_lot_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_lot_mng_typ_p = null;

	/**
	 * [Dtl_def_lot_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_lot_mng_typ_ListPutter() {
		if (Dtl_def_lot_mng_typ_p == null) {
			Dtl_def_lot_mng_typ_p = createDtl_def_lot_mng_typ_ListPutter(columnDtl_def_lot_mng_typ, "def_lot_mng_typ", "def_lot_mng_typ_nm");

		}
		return Dtl_def_lot_mng_typ_p;
	}
	
	
	/** [Dtl_def_lot_no_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_lot_no_typ_p = null;

	/**
	 * [Dtl_def_lot_no_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_lot_no_typ_ListPutter() {
		if (Dtl_def_lot_no_typ_p == null) {
			Dtl_def_lot_no_typ_p = createDtl_def_lot_no_typ_ListPutter(columnDtl_def_lot_no_typ, "def_lot_no_typ", "def_lot_no_typ_nm");

		}
		return Dtl_def_lot_no_typ_p;
	}
	
	
	/** [Dtl_def_lot_no_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_lot_no_ptn_cd_p = null;

	/**
	 * [Dtl_def_lot_no_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_lot_no_ptn_cd_ListPutter() {
		if (Dtl_def_lot_no_ptn_cd_p == null) {
			Dtl_def_lot_no_ptn_cd_p = createDtl_def_lot_no_ptn_cd_ListPutter(columnDtl_def_lot_no_ptn_cd, "def_lot_no_ptn_cd", "def_lot_no_ptn_nm");

		}
		return Dtl_def_lot_no_ptn_cd_p;
	}
	
	
	/** [Dtl_def_sublot_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_sublot_mng_typ_p = null;

	/**
	 * [Dtl_def_sublot_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sublot_mng_typ_ListPutter() {
		if (Dtl_def_sublot_mng_typ_p == null) {
			Dtl_def_sublot_mng_typ_p = createDtl_def_sublot_mng_typ_ListPutter(columnDtl_def_sublot_mng_typ, "def_sublot_mng_typ", "def_sublot_mng_typ_nm");

		}
		return Dtl_def_sublot_mng_typ_p;
	}
	
	
	/** [Dtl_def_sublot_no_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_sublot_no_typ_p = null;

	/**
	 * [Dtl_def_sublot_no_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sublot_no_typ_ListPutter() {
		if (Dtl_def_sublot_no_typ_p == null) {
			Dtl_def_sublot_no_typ_p = createDtl_def_sublot_no_typ_ListPutter(columnDtl_def_sublot_no_typ, "def_sublot_no_typ", "def_sublot_no_typ_nm");

		}
		return Dtl_def_sublot_no_typ_p;
	}
	
	
	/** [Dtl_def_sublot_no_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_sublot_no_ptn_cd_p = null;

	/**
	 * [Dtl_def_sublot_no_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sublot_no_ptn_cd_ListPutter() {
		if (Dtl_def_sublot_no_ptn_cd_p == null) {
			Dtl_def_sublot_no_ptn_cd_p = createDtl_def_sublot_no_ptn_cd_ListPutter(columnDtl_def_sublot_no_ptn_cd, "def_sublot_no_ptn_cd", "def_sublot_no_ptn_nm");

		}
		return Dtl_def_sublot_no_ptn_cd_p;
	}
	
	
	/** [Dtl_def_comp_spec_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_comp_spec_typ_p = null;

	/**
	 * [Dtl_def_comp_spec_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_comp_spec_typ_ListPutter() {
		if (Dtl_def_comp_spec_typ_p == null) {
			Dtl_def_comp_spec_typ_p = createDtl_def_comp_spec_typ_ListPutter(columnDtl_def_comp_spec_typ, "def_comp_spec_typ", "def_comp_spec_typ_nm");

		}
		return Dtl_def_comp_spec_typ_p;
	}
	
	
	/** [Dtl_def_itm_spec_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_itm_spec_grp_cd_p = null;

	/**
	 * [Dtl_def_itm_spec_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_itm_spec_grp_cd_ListPutter() {
		if (Dtl_def_itm_spec_grp_cd_p == null) {
			Dtl_def_itm_spec_grp_cd_p = createDtl_def_itm_spec_grp_cd_ListPutter(columnDtl_def_itm_spec_grp_cd, "def_itm_spec_grp_cd", "def_itm_spec_grp_nm");

		}
		return Dtl_def_itm_spec_grp_cd_p;
	}
	
	
	/** [Dtl_def_insp_bind_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_insp_bind_typ_p = null;

	/**
	 * [Dtl_def_insp_bind_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_insp_bind_typ_ListPutter() {
		if (Dtl_def_insp_bind_typ_p == null) {
			Dtl_def_insp_bind_typ_p = createDtl_def_insp_bind_typ_ListPutter(columnDtl_def_insp_bind_typ, "def_insp_bind_typ", "def_insp_bind_typ_nm");

		}
		return Dtl_def_insp_bind_typ_p;
	}
	
	
	/** [Dtl_def_ship_valid_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_ship_valid_grp_cd_p = null;

	/**
	 * [Dtl_def_ship_valid_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_ship_valid_grp_cd_ListPutter() {
		if (Dtl_def_ship_valid_grp_cd_p == null) {
			Dtl_def_ship_valid_grp_cd_p = createDtl_def_ship_valid_grp_cd_ListPutter(columnDtl_def_ship_valid_grp_cd, "def_ship_valid_grp_cd", "def_ship_valid_grp_nm");

		}
		return Dtl_def_ship_valid_grp_cd_p;
	}
	
	
	/** [Dtl_def_sls_upri_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_sls_upri_grp_cd_p = null;

	/**
	 * [Dtl_def_sls_upri_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sls_upri_grp_cd_ListPutter() {
		if (Dtl_def_sls_upri_grp_cd_p == null) {
			Dtl_def_sls_upri_grp_cd_p = createDtl_def_sls_upri_grp_cd_ListPutter(columnDtl_def_sls_upri_grp_cd, "def_sls_upri_grp_cd", "def_sls_upri_grp_nm");

		}
		return Dtl_def_sls_upri_grp_cd_p;
	}
	
	
	/** [Dtl_def_slo_proc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_slo_proc_typ_p = null;

	/**
	 * [Dtl_def_slo_proc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_slo_proc_typ_ListPutter() {
		if (Dtl_def_slo_proc_typ_p == null) {
			Dtl_def_slo_proc_typ_p = createDtl_def_slo_proc_typ_ListPutter(columnDtl_def_slo_proc_typ, "def_slo_proc_typ", "def_slo_proc_typ_nm");

		}
		return Dtl_def_slo_proc_typ_p;
	}
	
	
	/** [Dtl_def_ship_inst_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_ship_inst_typ_p = null;

	/**
	 * [Dtl_def_ship_inst_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_ship_inst_typ_ListPutter() {
		if (Dtl_def_ship_inst_typ_p == null) {
			Dtl_def_ship_inst_typ_p = createDtl_def_ship_inst_typ_ListPutter(columnDtl_def_ship_inst_typ, "def_ship_inst_typ", "def_ship_inst_typ_nm");

		}
		return Dtl_def_ship_inst_typ_p;
	}
	
	
	/** [Dtl_def_itm_ship_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_itm_ship_grp_cd_p = null;

	/**
	 * [Dtl_def_itm_ship_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_itm_ship_grp_cd_ListPutter() {
		if (Dtl_def_itm_ship_grp_cd_p == null) {
			Dtl_def_itm_ship_grp_cd_p = createDtl_def_itm_ship_grp_cd_ListPutter(columnDtl_def_itm_ship_grp_cd, "def_itm_ship_grp_cd", "def_itm_ship_grp_nm");

		}
		return Dtl_def_itm_ship_grp_cd_p;
	}
	
	
	/** [Dtl_def_ship_term_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_ship_term_cd_p = null;

	/**
	 * [Dtl_def_ship_term_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_ship_term_cd_ListPutter() {
		if (Dtl_def_ship_term_cd_p == null) {
			Dtl_def_ship_term_cd_p = createDtl_def_ship_term_cd_ListPutter(columnDtl_def_ship_term_cd, "def_ship_term_cd", "def_ship_term_nm");

		}
		return Dtl_def_ship_term_cd_p;
	}
	
	
	/** [Dtl_def_mfg_inst_unit_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_mfg_inst_unit_typ_p = null;

	/**
	 * [Dtl_def_mfg_inst_unit_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_mfg_inst_unit_typ_ListPutter() {
		if (Dtl_def_mfg_inst_unit_typ_p == null) {
			Dtl_def_mfg_inst_unit_typ_p = createDtl_def_mfg_inst_unit_typ_ListPutter(columnDtl_def_mfg_inst_unit_typ, "def_mfg_inst_unit_typ", "def_mfg_inst_unit_typ_nm");

		}
		return Dtl_def_mfg_inst_unit_typ_p;
	}
	
	
	/** [Dtl_def_mrp_proc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_mrp_proc_typ_p = null;

	/**
	 * [Dtl_def_mrp_proc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_mrp_proc_typ_ListPutter() {
		if (Dtl_def_mrp_proc_typ_p == null) {
			Dtl_def_mrp_proc_typ_p = createDtl_def_mrp_proc_typ_ListPutter(columnDtl_def_mrp_proc_typ, "def_mrp_proc_typ", "def_mrp_proc_typ_nm");

		}
		return Dtl_def_mrp_proc_typ_p;
	}
	
	
	/** [Dtl_def_rqmt_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_rqmt_typ_p = null;

	/**
	 * [Dtl_def_rqmt_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_rqmt_typ_ListPutter() {
		if (Dtl_def_rqmt_typ_p == null) {
			Dtl_def_rqmt_typ_p = createDtl_def_rqmt_typ_ListPutter(columnDtl_def_rqmt_typ, "def_rqmt_typ", "def_rqmt_typ_nm");

		}
		return Dtl_def_rqmt_typ_p;
	}
	
	
	/** [Dtl_def_prod_pln_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_prod_pln_typ_p = null;

	/**
	 * [Dtl_def_prod_pln_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_prod_pln_typ_ListPutter() {
		if (Dtl_def_prod_pln_typ_p == null) {
			Dtl_def_prod_pln_typ_p = createDtl_def_prod_pln_typ_ListPutter(columnDtl_def_prod_pln_typ, "def_prod_pln_typ", "def_prod_pln_typ_nm");

		}
		return Dtl_def_prod_pln_typ_p;
	}
	
	
	/** [Dtl_def_sno1_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno1_mng_typ_p = null;

	/**
	 * [Dtl_def_sno1_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno1_mng_typ_ListPutter() {
		if (Dtl_def_sno1_mng_typ_p == null) {
			Dtl_def_sno1_mng_typ_p = createDtl_def_sno1_mng_typ_ListPutter(columnDtl_def_sno1_mng_typ, "def_sno1_mng_typ", "def_sno1_mng_typ_nm");

		}
		return Dtl_def_sno1_mng_typ_p;
	}
	
	
	/** [Dtl_def_sno1_num_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno1_num_typ_p = null;

	/**
	 * [Dtl_def_sno1_num_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno1_num_typ_ListPutter() {
		if (Dtl_def_sno1_num_typ_p == null) {
			Dtl_def_sno1_num_typ_p = createDtl_def_sno1_num_typ_ListPutter(columnDtl_def_sno1_num_typ, "def_sno1_num_typ", "def_sno1_num_typ_nm");

		}
		return Dtl_def_sno1_num_typ_p;
	}
	
	
	/** [Dtl_def_sno1_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno1_ptn_cd_p = null;

	/**
	 * [Dtl_def_sno1_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno1_ptn_cd_ListPutter() {
		if (Dtl_def_sno1_ptn_cd_p == null) {
			Dtl_def_sno1_ptn_cd_p = createDtl_def_sno1_ptn_cd_ListPutter(columnDtl_def_sno1_ptn_cd, "def_sno1_ptn_cd", "def_sno1_ptn_nm");

		}
		return Dtl_def_sno1_ptn_cd_p;
	}
	
	
	/** [Dtl_def_sno2_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno2_mng_typ_p = null;

	/**
	 * [Dtl_def_sno2_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno2_mng_typ_ListPutter() {
		if (Dtl_def_sno2_mng_typ_p == null) {
			Dtl_def_sno2_mng_typ_p = createDtl_def_sno2_mng_typ_ListPutter(columnDtl_def_sno2_mng_typ, "def_sno2_mng_typ", "def_sno2_mng_typ_nm");

		}
		return Dtl_def_sno2_mng_typ_p;
	}
	
	
	/** [Dtl_def_sno2_num_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno2_num_typ_p = null;

	/**
	 * [Dtl_def_sno2_num_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno2_num_typ_ListPutter() {
		if (Dtl_def_sno2_num_typ_p == null) {
			Dtl_def_sno2_num_typ_p = createDtl_def_sno2_num_typ_ListPutter(columnDtl_def_sno2_num_typ, "def_sno2_num_typ", "def_sno2_num_typ_nm");

		}
		return Dtl_def_sno2_num_typ_p;
	}
	
	
	/** [Dtl_def_sno2_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno2_ptn_cd_p = null;

	/**
	 * [Dtl_def_sno2_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno2_ptn_cd_ListPutter() {
		if (Dtl_def_sno2_ptn_cd_p == null) {
			Dtl_def_sno2_ptn_cd_p = createDtl_def_sno2_ptn_cd_ListPutter(columnDtl_def_sno2_ptn_cd, "def_sno2_ptn_cd", "def_sno2_ptn_nm");

		}
		return Dtl_def_sno2_ptn_cd_p;
	}
	
	
	/** [Dtl_def_sno3_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno3_mng_typ_p = null;

	/**
	 * [Dtl_def_sno3_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno3_mng_typ_ListPutter() {
		if (Dtl_def_sno3_mng_typ_p == null) {
			Dtl_def_sno3_mng_typ_p = createDtl_def_sno3_mng_typ_ListPutter(columnDtl_def_sno3_mng_typ, "def_sno3_mng_typ", "def_sno3_mng_typ_nm");

		}
		return Dtl_def_sno3_mng_typ_p;
	}
	
	
	/** [Dtl_def_sno3_num_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno3_num_typ_p = null;

	/**
	 * [Dtl_def_sno3_num_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno3_num_typ_ListPutter() {
		if (Dtl_def_sno3_num_typ_p == null) {
			Dtl_def_sno3_num_typ_p = createDtl_def_sno3_num_typ_ListPutter(columnDtl_def_sno3_num_typ, "def_sno3_num_typ", "def_sno3_num_typ_nm");

		}
		return Dtl_def_sno3_num_typ_p;
	}
	
	
	/** [Dtl_def_sno3_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno3_ptn_cd_p = null;

	/**
	 * [Dtl_def_sno3_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno3_ptn_cd_ListPutter() {
		if (Dtl_def_sno3_ptn_cd_p == null) {
			Dtl_def_sno3_ptn_cd_p = createDtl_def_sno3_ptn_cd_ListPutter(columnDtl_def_sno3_ptn_cd, "def_sno3_ptn_cd", "def_sno3_ptn_nm");

		}
		return Dtl_def_sno3_ptn_cd_p;
	}
	
	
	/** [Dtl_def_sno4_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno4_mng_typ_p = null;

	/**
	 * [Dtl_def_sno4_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno4_mng_typ_ListPutter() {
		if (Dtl_def_sno4_mng_typ_p == null) {
			Dtl_def_sno4_mng_typ_p = createDtl_def_sno4_mng_typ_ListPutter(columnDtl_def_sno4_mng_typ, "def_sno4_mng_typ", "def_sno4_mng_typ_nm");

		}
		return Dtl_def_sno4_mng_typ_p;
	}
	
	
	/** [Dtl_def_sno4_num_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno4_num_typ_p = null;

	/**
	 * [Dtl_def_sno4_num_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno4_num_typ_ListPutter() {
		if (Dtl_def_sno4_num_typ_p == null) {
			Dtl_def_sno4_num_typ_p = createDtl_def_sno4_num_typ_ListPutter(columnDtl_def_sno4_num_typ, "def_sno4_num_typ", "def_sno4_num_typ_nm");

		}
		return Dtl_def_sno4_num_typ_p;
	}
	
	
	/** [Dtl_def_sno4_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno4_ptn_cd_p = null;

	/**
	 * [Dtl_def_sno4_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno4_ptn_cd_ListPutter() {
		if (Dtl_def_sno4_ptn_cd_p == null) {
			Dtl_def_sno4_ptn_cd_p = createDtl_def_sno4_ptn_cd_ListPutter(columnDtl_def_sno4_ptn_cd, "def_sno4_ptn_cd", "def_sno4_ptn_nm");

		}
		return Dtl_def_sno4_ptn_cd_p;
	}
	
	
	/** [Dtl_def_mrkt_judg_role_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_mrkt_judg_role_cd_p = null;

	/**
	 * [Dtl_def_mrkt_judg_role_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_mrkt_judg_role_cd_ListPutter() {
		if (Dtl_def_mrkt_judg_role_cd_p == null) {
			Dtl_def_mrkt_judg_role_cd_p = createDtl_def_mrkt_judg_role_cd_ListPutter(columnDtl_def_mrkt_judg_role_cd, "def_mrkt_judg_role_cd", "def_mrkt_judg_role_nm");

		}
		return Dtl_def_mrkt_judg_role_cd_p;
	}
	
	
	/** [Dtl_def_mrkt_judg_upd_role_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_mrkt_judg_upd_role_cd_p = null;

	/**
	 * [Dtl_def_mrkt_judg_upd_role_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_mrkt_judg_upd_role_cd_ListPutter() {
		if (Dtl_def_mrkt_judg_upd_role_cd_p == null) {
			Dtl_def_mrkt_judg_upd_role_cd_p = createDtl_def_mrkt_judg_upd_role_cd_ListPutter(columnDtl_def_mrkt_judg_upd_role_cd, "def_mrkt_judg_upd_role_cd", "def_mrkt_judg_upd_role_nm");

		}
		return Dtl_def_mrkt_judg_upd_role_cd_p;
	}
	
	
	/** [Dtl_def_plnt_aprv_role_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_plnt_aprv_role_cd_p = null;

	/**
	 * [Dtl_def_plnt_aprv_role_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_plnt_aprv_role_cd_ListPutter() {
		if (Dtl_def_plnt_aprv_role_cd_p == null) {
			Dtl_def_plnt_aprv_role_cd_p = createDtl_def_plnt_aprv_role_cd_ListPutter(columnDtl_def_plnt_aprv_role_cd, "def_plnt_aprv_role_cd", "def_plnt_aprv_role_nm");

		}
		return Dtl_def_plnt_aprv_role_cd_p;
	}
	
	
	/** [Dtl_def_insp_aprv_role_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_insp_aprv_role_cd_p = null;

	/**
	 * [Dtl_def_insp_aprv_role_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_insp_aprv_role_cd_ListPutter() {
		if (Dtl_def_insp_aprv_role_cd_p == null) {
			Dtl_def_insp_aprv_role_cd_p = createDtl_def_insp_aprv_role_cd_ListPutter(columnDtl_def_insp_aprv_role_cd, "def_insp_aprv_role_cd", "def_insp_aprv_role_nm");

		}
		return Dtl_def_insp_aprv_role_cd_p;
	}
	
	
	/** [Dtl_def_mfg_aprv_role_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_mfg_aprv_role_cd_p = null;

	/**
	 * [Dtl_def_mfg_aprv_role_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_mfg_aprv_role_cd_ListPutter() {
		if (Dtl_def_mfg_aprv_role_cd_p == null) {
			Dtl_def_mfg_aprv_role_cd_p = createDtl_def_mfg_aprv_role_cd_ListPutter(columnDtl_def_mfg_aprv_role_cd, "def_mfg_aprv_role_cd", "def_mfg_aprv_role_nm");

		}
		return Dtl_def_mfg_aprv_role_cd_p;
	}
	
	
	/** [Dtl_def_sno_typ1_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno_typ1_p = null;

	/**
	 * [Dtl_def_sno_typ1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno_typ1_ListPutter() {
		if (Dtl_def_sno_typ1_p == null) {
			Dtl_def_sno_typ1_p = createDtl_def_sno_typ1_ListPutter(columnDtl_def_sno_typ1, "def_sno_typ1", "def_sno_typ_nm1");

		}
		return Dtl_def_sno_typ1_p;
	}
	
	
	/** [Dtl_def_sno_typ2_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno_typ2_p = null;

	/**
	 * [Dtl_def_sno_typ2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno_typ2_ListPutter() {
		if (Dtl_def_sno_typ2_p == null) {
			Dtl_def_sno_typ2_p = createDtl_def_sno_typ2_ListPutter(columnDtl_def_sno_typ2, "def_sno_typ2", "def_sno_typ_nm2");

		}
		return Dtl_def_sno_typ2_p;
	}
	
	
	/** [Dtl_def_sno_typ3_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno_typ3_p = null;

	/**
	 * [Dtl_def_sno_typ3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno_typ3_ListPutter() {
		if (Dtl_def_sno_typ3_p == null) {
			Dtl_def_sno_typ3_p = createDtl_def_sno_typ3_ListPutter(columnDtl_def_sno_typ3, "def_sno_typ3", "def_sno_typ_nm3");

		}
		return Dtl_def_sno_typ3_p;
	}
	
	
	/** [Dtl_def_sno_typ4_ListPutter]の定義 */
	private MCListPutter Dtl_def_sno_typ4_p = null;

	/**
	 * [Dtl_def_sno_typ4_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_sno_typ4_ListPutter() {
		if (Dtl_def_sno_typ4_p == null) {
			Dtl_def_sno_typ4_p = createDtl_def_sno_typ4_ListPutter(columnDtl_def_sno_typ4, "def_sno_typ4", "def_sno_typ_nm4");

		}
		return Dtl_def_sno_typ4_p;
	}
	
	
	/** [Dtl_def_alloc_ctl_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_alloc_ctl_typ_p = null;

	/**
	 * [Dtl_def_alloc_ctl_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_alloc_ctl_typ_ListPutter() {
		if (Dtl_def_alloc_ctl_typ_p == null) {
			Dtl_def_alloc_ctl_typ_p = createDtl_def_alloc_ctl_typ_ListPutter(columnDtl_def_alloc_ctl_typ, "def_alloc_ctl_typ", "def_alloc_ctl_typ_nm");

		}
		return Dtl_def_alloc_ctl_typ_p;
	}
	
	
	/** [Dtl_def_inpt_ctl_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_inpt_ctl_typ_p = null;

	/**
	 * [Dtl_def_inpt_ctl_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_inpt_ctl_typ_ListPutter() {
		if (Dtl_def_inpt_ctl_typ_p == null) {
			Dtl_def_inpt_ctl_typ_p = createDtl_def_inpt_ctl_typ_ListPutter(columnDtl_def_inpt_ctl_typ, "def_inpt_ctl_typ", "def_inpt_ctl_typ_nm");

		}
		return Dtl_def_inpt_ctl_typ_p;
	}
	
	
	/** [Dtl_def_bkf_typ_ListPutter]の定義 */
	private MCListPutter Dtl_def_bkf_typ_p = null;

	/**
	 * [Dtl_def_bkf_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_bkf_typ_ListPutter() {
		if (Dtl_def_bkf_typ_p == null) {
			Dtl_def_bkf_typ_p = createDtl_def_bkf_typ_ListPutter(columnDtl_def_bkf_typ, "def_bkf_typ", "def_bkf_typ_nm");

		}
		return Dtl_def_bkf_typ_p;
	}
	
	
	/** [Dtl_def_calc_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_calc_ptn_cd_p = null;

	/**
	 * [Dtl_def_calc_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_calc_ptn_cd_ListPutter() {
		if (Dtl_def_calc_ptn_cd_p == null) {
			Dtl_def_calc_ptn_cd_p = createDtl_def_calc_ptn_cd_ListPutter(columnDtl_def_calc_ptn_cd, "def_calc_ptn_cd", "def_calc_ptn_nm");

		}
		return Dtl_def_calc_ptn_cd_p;
	}
	
	
	/** [Lcl_itm_typ_ListPutter]の定義 */
	private MCListPutter Lcl_itm_typ_p = null;

	/**
	 * [Lcl_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getLcl_itm_typ_ListPutter() {
		if (Lcl_itm_typ_p == null) {
			Lcl_itm_typ_p = createLcl_itm_typ_ListPutter(columnLcl_itm_typ, "itm_typ", "itm_typ_nm");

		}
		return Lcl_itm_typ_p;
	}
	
	
	/** [Lcl_itm_typ_d_cd_ListPutter]の定義 */
	private MCListPutter Lcl_itm_typ_d_cd_p = null;

	/**
	 * [Lcl_itm_typ_d_cd_ListPutter]の取得
	 */
	protected MCListPutter getLcl_itm_typ_d_cd_ListPutter() {
		if (Lcl_itm_typ_d_cd_p == null) {
			Lcl_itm_typ_d_cd_p = createLcl_itm_typ_d_cd_ListPutter(columnLcl_itm_typ_d_cd, "itm_typ_d_cd");

		}
		return Lcl_itm_typ_d_cd_p;
	}
	
	
	/** [Lcl_lcl_cd_ListPutter]の定義 */
	private MCListPutter Lcl_lcl_cd_p = null;

	/**
	 * [Lcl_lcl_cd_ListPutter]の取得
	 */
	protected MCListPutter getLcl_lcl_cd_ListPutter() {
		if (Lcl_lcl_cd_p == null) {
			Lcl_lcl_cd_p = createLcl_lcl_cd_ListPutter(columnLcl_lcl_cd, "lcl_cd", "lcl_nm");

		}
		return Lcl_lcl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_ItmTypDtlReg create(){
		MABCP_ItmTypDtlReg p = new MABCP_ItmTypDtlReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_ItmTypDtlReg create(String name){
		MABCP_ItmTypDtlReg p = new MABCP_ItmTypDtlReg(name);
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
		MABCP_ItmTypDtlReg_MC.jbfInitScreenOpe((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbfInitMst((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbfInitTop((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbfInitFold((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbfInitCnd((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbfInitCtrl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbfInitWrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbfInitDtl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbfInitDtlBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbfInitLclWrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbfInitLcl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbfInitLclBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbfInitBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbfInitEastBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitScreenOpe((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitMst((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitTop((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitFold((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitCnd((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitCtrl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitWrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitDtl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitDtlBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitLclWrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitLcl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitLclBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.jbInitEastBtn((MABCP_ItmTypDtlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_nm_lcl = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_def_sls_flg = p.beansFactory.createTableColumn("Dtl.def_sls_flg", MCColumnType.CHECK);
		p.columnDtl_def_mfg_flg = p.beansFactory.createTableColumn("Dtl.def_mfg_flg", MCColumnType.CHECK);
		p.columnDtl_def_purc_flg = p.beansFactory.createTableColumn("Dtl.def_purc_flg", MCColumnType.CHECK);
		p.columnDtl_def_insp_flg = p.beansFactory.createTableColumn("Dtl.def_insp_flg", MCColumnType.CHECK);
		p.columnDtl_def_itm_jnl_cd = p.beansFactory.createTableColumn("Dtl.def_itm_jnl_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_itm_jnl_nm = p.beansFactory.createTableColumn("Dtl.def_itm_jnl_nm", MCColumnType.TEXT);
		p.columnDtl_def_ac_itm_grp_cd = p.beansFactory.createTableColumn("Dtl.def_ac_itm_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_ac_itm_grp_nm = p.beansFactory.createTableColumn("Dtl.def_ac_itm_grp_nm", MCColumnType.TEXT);
		p.columnDtl_def_minus_stk_flg = p.beansFactory.createTableColumn("Dtl.def_minus_stk_flg", MCColumnType.CHECK);
		p.columnDtl_def_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.def_lot_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_lot_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.def_lot_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_lot_no_typ = p.beansFactory.createTableColumn("Dtl.def_lot_no_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_lot_no_typ_nm = p.beansFactory.createTableColumn("Dtl.def_lot_no_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_lot_no_ptn_cd = p.beansFactory.createTableColumn("Dtl.def_lot_no_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_lot_no_ptn_nm = p.beansFactory.createTableColumn("Dtl.def_lot_no_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_def_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.def_sublot_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sublot_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.def_sublot_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_sublot_no_typ = p.beansFactory.createTableColumn("Dtl.def_sublot_no_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sublot_no_typ_nm = p.beansFactory.createTableColumn("Dtl.def_sublot_no_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_sublot_no_ptn_cd = p.beansFactory.createTableColumn("Dtl.def_sublot_no_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sublot_no_ptn_nm = p.beansFactory.createTableColumn("Dtl.def_sublot_no_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_def_bp_lot_flg = p.beansFactory.createTableColumn("Dtl.def_bp_lot_flg", MCColumnType.CHECK);
		p.columnDtl_def_not_new_lot_flg = p.beansFactory.createTableColumn("Dtl.def_not_new_lot_flg", MCColumnType.CHECK);
		p.columnDtl_def_gi_alloc_flg = p.beansFactory.createTableColumn("Dtl.def_gi_alloc_flg", MCColumnType.CHECK);
		p.columnDtl_def_pack_alloc_flg = p.beansFactory.createTableColumn("Dtl.def_pack_alloc_flg", MCColumnType.CHECK);
		p.columnDtl_def_comp_spec_typ = p.beansFactory.createTableColumn("Dtl.def_comp_spec_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_comp_spec_typ_nm = p.beansFactory.createTableColumn("Dtl.def_comp_spec_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_comp_rev_at_slo_flg = p.beansFactory.createTableColumn("Dtl.def_comp_rev_at_slo_flg", MCColumnType.CHECK);
		p.columnDtl_def_comp_core_itm_flg = p.beansFactory.createTableColumn("Dtl.def_comp_core_itm_flg", MCColumnType.CHECK);
		p.columnDtl_def_itm_spec_grp_cd = p.beansFactory.createTableColumn("Dtl.def_itm_spec_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_itm_spec_grp_nm = p.beansFactory.createTableColumn("Dtl.def_itm_spec_grp_nm", MCColumnType.TEXT);
		p.columnDtl_def_insp_bind_typ = p.beansFactory.createTableColumn("Dtl.def_insp_bind_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_insp_bind_typ_nm = p.beansFactory.createTableColumn("Dtl.def_insp_bind_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_skip_chk_ship_flg = p.beansFactory.createTableColumn("Dtl.def_skip_chk_ship_flg", MCColumnType.CHECK);
		p.columnDtl_def_lmt_ctl_flg = p.beansFactory.createTableColumn("Dtl.def_lmt_ctl_flg", MCColumnType.CHECK);
		p.columnDtl_def_lmt_ctl_categ = p.beansFactory.createTableColumn("Dtl.def_lmt_ctl_categ", MCColumnType.TEXT);
		p.columnDtl_def_ship_lot_back_stop_flg = p.beansFactory.createTableColumn("Dtl.def_ship_lot_back_stop_flg", MCColumnType.CHECK);
		p.columnDtl_def_ship_valid_grp_cd = p.beansFactory.createTableColumn("Dtl.def_ship_valid_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_ship_valid_grp_nm = p.beansFactory.createTableColumn("Dtl.def_ship_valid_grp_nm", MCColumnType.TEXT);
		p.columnDtl_def_sls_upri_grp_cd = p.beansFactory.createTableColumn("Dtl.def_sls_upri_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sls_upri_grp_nm = p.beansFactory.createTableColumn("Dtl.def_sls_upri_grp_nm", MCColumnType.TEXT);
		p.columnDtl_def_slo_proc_flg = p.beansFactory.createTableColumn("Dtl.def_slo_proc_flg", MCColumnType.CHECK);
		p.columnDtl_def_slo_proc_typ = p.beansFactory.createTableColumn("Dtl.def_slo_proc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_slo_proc_typ_nm = p.beansFactory.createTableColumn("Dtl.def_slo_proc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_ship_inst_typ = p.beansFactory.createTableColumn("Dtl.def_ship_inst_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_ship_inst_typ_nm = p.beansFactory.createTableColumn("Dtl.def_ship_inst_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_itm_ship_grp_cd = p.beansFactory.createTableColumn("Dtl.def_itm_ship_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_itm_ship_grp_nm = p.beansFactory.createTableColumn("Dtl.def_itm_ship_grp_nm", MCColumnType.TEXT);
		p.columnDtl_def_arr_skip_flg = p.beansFactory.createTableColumn("Dtl.def_arr_skip_flg", MCColumnType.CHECK);
		p.columnDtl_def_ship_term_cd = p.beansFactory.createTableColumn("Dtl.def_ship_term_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_ship_term_nm = p.beansFactory.createTableColumn("Dtl.def_ship_term_nm", MCColumnType.TEXT);
		p.columnDtl_def_stk_lst_flg = p.beansFactory.createTableColumn("Dtl.def_stk_lst_flg", MCColumnType.CHECK);
		p.columnDtl_def_ver_flg = p.beansFactory.createTableColumn("Dtl.def_ver_flg", MCColumnType.CHECK);
		p.columnDtl_def_mfg_inst_unit_typ = p.beansFactory.createTableColumn("Dtl.def_mfg_inst_unit_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_mfg_inst_unit_typ_nm = p.beansFactory.createTableColumn("Dtl.def_mfg_inst_unit_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_sls_upri_cng_flg = p.beansFactory.createTableColumn("Dtl.def_sls_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl_def_purc_upri_cng_flg = p.beansFactory.createTableColumn("Dtl.def_purc_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl_def_prov_upri_cng_flg = p.beansFactory.createTableColumn("Dtl.def_prov_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl_def_mrp_proc_typ = p.beansFactory.createTableColumn("Dtl.def_mrp_proc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_mrp_proc_typ_nm = p.beansFactory.createTableColumn("Dtl.def_mrp_proc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_rqmt_typ = p.beansFactory.createTableColumn("Dtl.def_rqmt_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_rqmt_typ_nm = p.beansFactory.createTableColumn("Dtl.def_rqmt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_prod_pln_typ = p.beansFactory.createTableColumn("Dtl.def_prod_pln_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_prod_pln_typ_nm = p.beansFactory.createTableColumn("Dtl.def_prod_pln_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_dmnd_date_div_mons = p.beansFactory.createTableColumn("Dtl.def_dmnd_date_div_mons", MCColumnType.NUMBER);
		p.columnDtl_def_alloc_margin_days = p.beansFactory.createTableColumn("Dtl.def_alloc_margin_days", MCColumnType.NUMBER);
		p.columnDtl_def_mrp_alloc_margin_days = p.beansFactory.createTableColumn("Dtl.def_mrp_alloc_margin_days", MCColumnType.NUMBER);
		p.columnDtl_def_mrp_opn_xfr_days = p.beansFactory.createTableColumn("Dtl.def_mrp_opn_xfr_days", MCColumnType.NUMBER);
		p.columnDtl_def_inpt_itm_add_flg = p.beansFactory.createTableColumn("Dtl.def_inpt_itm_add_flg", MCColumnType.CHECK);
		p.columnDtl_def_inpt_itm_del_flg = p.beansFactory.createTableColumn("Dtl.def_inpt_itm_del_flg", MCColumnType.CHECK);
		p.columnDtl_def_sch_flg = p.beansFactory.createTableColumn("Dtl.def_sch_flg", MCColumnType.CHECK);
		p.columnDtl_def_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.def_sno1_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno1_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.def_sno1_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_slo_sno1_flg = p.beansFactory.createTableColumn("Dtl.def_slo_sno1_flg", MCColumnType.CHECK);
		p.columnDtl_def_rqmt_sno1_flg = p.beansFactory.createTableColumn("Dtl.def_rqmt_sno1_flg", MCColumnType.CHECK);
		p.columnDtl_def_sno1_num_typ = p.beansFactory.createTableColumn("Dtl.def_sno1_num_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno1_num_typ_nm = p.beansFactory.createTableColumn("Dtl.def_sno1_num_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_sno1_ptn_cd = p.beansFactory.createTableColumn("Dtl.def_sno1_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno1_ptn_nm = p.beansFactory.createTableColumn("Dtl.def_sno1_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_def_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.def_sno2_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno2_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.def_sno2_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_slo_sno2_flg = p.beansFactory.createTableColumn("Dtl.def_slo_sno2_flg", MCColumnType.CHECK);
		p.columnDtl_def_rqmt_sno2_flg = p.beansFactory.createTableColumn("Dtl.def_rqmt_sno2_flg", MCColumnType.CHECK);
		p.columnDtl_def_sno2_num_typ = p.beansFactory.createTableColumn("Dtl.def_sno2_num_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno2_num_typ_nm = p.beansFactory.createTableColumn("Dtl.def_sno2_num_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_sno2_ptn_cd = p.beansFactory.createTableColumn("Dtl.def_sno2_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno2_ptn_nm = p.beansFactory.createTableColumn("Dtl.def_sno2_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_def_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.def_sno3_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno3_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.def_sno3_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_slo_sno3_flg = p.beansFactory.createTableColumn("Dtl.def_slo_sno3_flg", MCColumnType.CHECK);
		p.columnDtl_def_rqmt_sno3_flg = p.beansFactory.createTableColumn("Dtl.def_rqmt_sno3_flg", MCColumnType.CHECK);
		p.columnDtl_def_sno3_num_typ = p.beansFactory.createTableColumn("Dtl.def_sno3_num_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno3_num_typ_nm = p.beansFactory.createTableColumn("Dtl.def_sno3_num_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_sno3_ptn_cd = p.beansFactory.createTableColumn("Dtl.def_sno3_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno3_ptn_nm = p.beansFactory.createTableColumn("Dtl.def_sno3_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_def_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.def_sno4_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno4_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.def_sno4_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_slo_sno4_flg = p.beansFactory.createTableColumn("Dtl.def_slo_sno4_flg", MCColumnType.CHECK);
		p.columnDtl_def_rqmt_sno4_flg = p.beansFactory.createTableColumn("Dtl.def_rqmt_sno4_flg", MCColumnType.CHECK);
		p.columnDtl_def_sno4_num_typ = p.beansFactory.createTableColumn("Dtl.def_sno4_num_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno4_num_typ_nm = p.beansFactory.createTableColumn("Dtl.def_sno4_num_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_sno4_ptn_cd = p.beansFactory.createTableColumn("Dtl.def_sno4_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno4_ptn_nm = p.beansFactory.createTableColumn("Dtl.def_sno4_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_def_mrkt_judg_flg = p.beansFactory.createTableColumn("Dtl.def_mrkt_judg_flg", MCColumnType.CHECK);
		p.columnDtl_def_mrkt_judg_role_cd = p.beansFactory.createTableColumn("Dtl.def_mrkt_judg_role_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_mrkt_judg_role_nm = p.beansFactory.createTableColumn("Dtl.def_mrkt_judg_role_nm", MCColumnType.TEXT);
		p.columnDtl_def_mrkt_judg_upd_role_cd = p.beansFactory.createTableColumn("Dtl.def_mrkt_judg_upd_role_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_mrkt_judg_upd_role_nm = p.beansFactory.createTableColumn("Dtl.def_mrkt_judg_upd_role_nm", MCColumnType.TEXT);
		p.columnDtl_def_plnt_aprv_flg = p.beansFactory.createTableColumn("Dtl.def_plnt_aprv_flg", MCColumnType.CHECK);
		p.columnDtl_def_plnt_aprv_role_cd = p.beansFactory.createTableColumn("Dtl.def_plnt_aprv_role_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_plnt_aprv_role_nm = p.beansFactory.createTableColumn("Dtl.def_plnt_aprv_role_nm", MCColumnType.TEXT);
		p.columnDtl_def_insp_aprv_flg = p.beansFactory.createTableColumn("Dtl.def_insp_aprv_flg", MCColumnType.CHECK);
		p.columnDtl_def_insp_aprv_role_cd = p.beansFactory.createTableColumn("Dtl.def_insp_aprv_role_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_insp_aprv_role_nm = p.beansFactory.createTableColumn("Dtl.def_insp_aprv_role_nm", MCColumnType.TEXT);
		p.columnDtl_def_mfg_aprv_flg = p.beansFactory.createTableColumn("Dtl.def_mfg_aprv_flg", MCColumnType.CHECK);
		p.columnDtl_def_mfg_aprv_role_cd = p.beansFactory.createTableColumn("Dtl.def_mfg_aprv_role_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_mfg_aprv_role_nm = p.beansFactory.createTableColumn("Dtl.def_mfg_aprv_role_nm", MCColumnType.TEXT);
		p.columnDtl_def_sno_typ1 = p.beansFactory.createTableColumn("Dtl.def_sno_typ1", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno_typ_nm1 = p.beansFactory.createTableColumn("Dtl.def_sno_typ_nm1", MCColumnType.TEXT);
		p.columnDtl_def_sno_typ2 = p.beansFactory.createTableColumn("Dtl.def_sno_typ2", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno_typ_nm2 = p.beansFactory.createTableColumn("Dtl.def_sno_typ_nm2", MCColumnType.TEXT);
		p.columnDtl_def_sno_typ3 = p.beansFactory.createTableColumn("Dtl.def_sno_typ3", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno_typ_nm3 = p.beansFactory.createTableColumn("Dtl.def_sno_typ_nm3", MCColumnType.TEXT);
		p.columnDtl_def_sno_typ4 = p.beansFactory.createTableColumn("Dtl.def_sno_typ4", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_sno_typ_nm4 = p.beansFactory.createTableColumn("Dtl.def_sno_typ_nm4", MCColumnType.TEXT);
		p.columnDtl_def_byprod_flg = p.beansFactory.createTableColumn("Dtl.def_byprod_flg", MCColumnType.CHECK);
		p.columnDtl_def_inst_lot_fix_flg = p.beansFactory.createTableColumn("Dtl.def_inst_lot_fix_flg", MCColumnType.CHECK);
		p.columnDtl_def_lot_mix_flg = p.beansFactory.createTableColumn("Dtl.def_lot_mix_flg", MCColumnType.CHECK);
		p.columnDtl_def_sublot_mix_flg = p.beansFactory.createTableColumn("Dtl.def_sublot_mix_flg", MCColumnType.CHECK);
		p.columnDtl_def_alloc_ctl_typ = p.beansFactory.createTableColumn("Dtl.def_alloc_ctl_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_alloc_ctl_typ_nm = p.beansFactory.createTableColumn("Dtl.def_alloc_ctl_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_inpt_ctl_typ = p.beansFactory.createTableColumn("Dtl.def_inpt_ctl_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_inpt_ctl_typ_nm = p.beansFactory.createTableColumn("Dtl.def_inpt_ctl_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_bkf_typ = p.beansFactory.createTableColumn("Dtl.def_bkf_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_bkf_typ_nm = p.beansFactory.createTableColumn("Dtl.def_bkf_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_main_itm_flg = p.beansFactory.createTableColumn("Dtl.def_main_itm_flg", MCColumnType.CHECK);
		p.columnDtl_def_not_cost_bom_flg = p.beansFactory.createTableColumn("Dtl.def_not_cost_bom_flg", MCColumnType.CHECK);
		p.columnDtl_def_calc_ptn_cd = p.beansFactory.createTableColumn("Dtl.def_calc_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_def_calc_ptn_nm = p.beansFactory.createTableColumn("Dtl.def_calc_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
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
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrk(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_itm_typ = p.beansFactory.createTableColumn("Lcl.itm_typ", MCColumnType.TEXT_COMBO);
		p.columnLcl_itm_typ_nm = p.beansFactory.createTableColumn("Lcl.itm_typ_nm", MCColumnType.TEXT);
		p.columnLcl_itm_typ_d_cd = p.beansFactory.createTableColumn("Lcl.itm_typ_d_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_itm_typ_d_nm = p.beansFactory.createTableColumn("Lcl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnLcl_memo1 = p.beansFactory.createTableColumn("Lcl.memo1", MCColumnType.TEXT);
		p.columnLcl_memo2 = p.beansFactory.createTableColumn("Lcl.memo2", MCColumnType.TEXT);
		p.columnLcl_memo3 = p.beansFactory.createTableColumn("Lcl.memo3", MCColumnType.TEXT);
		p.columnLcl_ins_usr_id = p.beansFactory.createTableColumn("Lcl.ins_usr_id", MCColumnType.TEXT);
		p.columnLcl_ins_usr_nm = p.beansFactory.createTableColumn("Lcl.ins_usr_nm", MCColumnType.TEXT);
		p.columnLcl_ins_ts = p.beansFactory.createTableColumn("Lcl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_ins_func_id = p.beansFactory.createTableColumn("Lcl.ins_func_id", MCColumnType.TEXT);
		p.columnLcl_ins_func_nm = p.beansFactory.createTableColumn("Lcl.ins_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_cntr = p.beansFactory.createTableColumn("Lcl.upd_cntr", MCColumnType.NUMBER);
		p.columnLcl_upd_usr_id = p.beansFactory.createTableColumn("Lcl.upd_usr_id", MCColumnType.TEXT);
		p.columnLcl_upd_usr_nm = p.beansFactory.createTableColumn("Lcl.upd_usr_nm", MCColumnType.TEXT);
		p.columnLcl_upd_ts = p.beansFactory.createTableColumn("Lcl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_upd_func_id = p.beansFactory.createTableColumn("Lcl.upd_func_id", MCColumnType.TEXT);
		p.columnLcl_upd_func_nm = p.beansFactory.createTableColumn("Lcl.upd_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_srv_req_no = p.beansFactory.createTableColumn("Lcl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclBtn(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel = p.beansFactory.createPanel("LclBtn");
		// ブロックの項目の初期化
		p.LclBtn_select_all = p.beansFactory.createButton("LclBtn.select_all", "no_border");
		p.LclBtn_deselect_all = p.beansFactory.createButton("LclBtn.deselect_all", "no_border");
		p.LclBtn_radd = p.beansFactory.createButton("LclBtn.radd", "no_border");
		p.LclBtn_rdel = p.beansFactory.createButton("LclBtn.rdel", "no_border");
		p.LclBtn_rcopy = p.beansFactory.createButton("LclBtn.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.MstPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMst(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0350.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.WrkPanel);
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
	protected static void jbInitFold(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_ItmTypDtlReg p) {
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
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0350.CndR.ope_META);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_memo1);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0350.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0350.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0350.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0350.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0350.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.add(p.WrkPanel);
		p.WrkPanel.setNextBeans(p.LclWrkPanel);
		p.WrkPanel.setLayoutPosition("CBCT+");
		// ブロックの項目の初期化
		p.WrkPanel.add(p.DtlPanel, null);
		p.WrkPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.WrkPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtn_select_all.setIcon("SELECT_ALL");
		p.DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlBtnPanel.add(p.DtlBtn_select_all);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setNextBeans(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.DtlBtnPanel.add(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setNextBeans(p.DtlBtn_radd);
		p.DtlBtn_radd.setIcon("INSERT_RECORD");
		p.DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.DtlBtnPanel.add(p.DtlBtn_radd);
		p.DtlBtn_radd.setNextBeans(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.DtlBtnPanel.add(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setNextBeans(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.DtlBtnPanel.add(p.DtlBtn_rcopy);
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrk(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.add(p.LclWrkPanel);
		p.LclWrkPanel.setNextBeans(p.BtnPanel);
		p.LclWrkPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.LclWrkPanel.add(p.LclPanel, null);
		p.LclWrkPanel.setLastBeans(p.LclPanel);
		p.LclPanel.setNextBeans(p.LclBtnPanel);
		p.LclWrkPanel.add(p.LclBtnPanel, null);
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLcl(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.LclPanel.add(p.LclScrollPane);
		p.LclPanel.setLastBeans(p.LclTable);
		p.LclScrollPane.setViewportView(p.LclTable);
		p.LclTable.setList(p.getLclL());
		p.LclPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclBtn(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.LclBtn_select_all.setIcon("SELECT_ALL");
		p.LclBtn_select_all.setFunctionKey(MCFunctionKey.F18);
		p.LclBtnPanel.add(p.LclBtn_select_all);
		p.LclBtnPanel.setLastBeans(p.LclBtn_select_all);
		p.LclBtn_select_all.setNextBeans(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setIcon("DESELECT_ALL");
		p.LclBtn_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.LclBtnPanel.add(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setNextBeans(p.LclBtn_radd);
		p.LclBtn_radd.setIcon("INSERT_RECORD");
		p.LclBtn_radd.setFunctionKey(MCFunctionKey.F7);
		p.LclBtnPanel.add(p.LclBtn_radd);
		p.LclBtn_radd.setNextBeans(p.LclBtn_rdel);
		p.LclBtn_rdel.setIcon("DELETE_RECORD");
		p.LclBtn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.LclBtnPanel.add(p.LclBtn_rdel);
		p.LclBtn_rdel.setNextBeans(p.LclBtn_rcopy);
		p.LclBtn_rcopy.setIcon("COPY_RECORD");
		p.LclBtn_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.LclBtnPanel.add(p.LclBtn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_ItmTypDtlReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_ItmTypDtlReg p) {
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
		MABCP_ItmTypDtlReg_MC.mcInitScreenOpe((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.mcInitMst((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.mcInitTop((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.mcInitFold((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.mcInitCnd((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.mcInitCtrl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.mcInitWrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.mcInitDtl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.mcInitDtlBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.mcInitLclWrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.mcInitLcl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.mcInitLclBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.mcInitBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.mcInitEastBtn((MABCP_ItmTypDtlReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_ItmTypDtlReg_MC.statusInitUPD_ScreenOpe((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_Mst((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_Top((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_Fold((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_Cnd((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_Ctrl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_Wrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_Dtl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_DtlBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_LclWrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_Lcl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_LclAll((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_LclBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_Btn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitUPD_EastBtn((MABCP_ItmTypDtlReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_ItmTypDtlReg_MC.statusInitFIX_ScreenOpe((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_Mst((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_Top((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_Fold((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_Cnd((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_Ctrl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_Wrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_Dtl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_DtlBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_LclWrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_Lcl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_LclAll((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_LclBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_Btn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitFIX_EastBtn((MABCP_ItmTypDtlReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_ItmTypDtlReg_MC.statusInitDEL_ScreenOpe((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_Mst((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_Top((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_Fold((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_Cnd((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_Ctrl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_Wrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_Dtl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_DtlBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_LclWrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_Lcl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_LclAll((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_LclBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_Btn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitDEL_EastBtn((MABCP_ItmTypDtlReg)this);

		// [REF]ステータスのモードの設定
		MABCP_ItmTypDtlReg_MC.statusInitREF_ScreenOpe((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_Mst((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_Top((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_Fold((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_Cnd((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_Ctrl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_Wrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_Dtl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_DtlBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_LclWrk((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_Lcl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_LclAll((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_LclBtn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_Btn((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.statusInitREF_EastBtn((MABCP_ItmTypDtlReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_ItmTypDtlReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_ItmTypDtlReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_ItmTypDtlReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_ItmTypDtlReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_ItmTypDtlReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_ItmTypDtlReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABCP_ItmTypDtlReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_ItmTypDtlReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_itm_typ.addAllListener(p);
		p.columnDtl_itm_typ.setListListener(p);
		p.columnDtl_itm_typ_nm.addAllListener(p);
		p.columnDtl_itm_typ_nm.setListListener(p);
		p.columnDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_itm_typ_d_cd.setListListener(p);
		p.columnDtl_itm_typ_d_nm_lcl.addAllListener(p);
		p.columnDtl_itm_typ_d_nm_lcl.setListListener(p);
		p.columnDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_itm_typ_d_nm.setListListener(p);
		p.columnDtl_def_sls_flg.addAllListener(p);
		p.columnDtl_def_mfg_flg.addAllListener(p);
		p.columnDtl_def_purc_flg.addAllListener(p);
		p.columnDtl_def_insp_flg.addAllListener(p);
		p.columnDtl_def_itm_jnl_cd.addAllListener(p);
		p.columnDtl_def_itm_jnl_cd.setListListener(p);
		p.columnDtl_def_itm_jnl_nm.addAllListener(p);
		p.columnDtl_def_itm_jnl_nm.setListListener(p);
		p.columnDtl_def_ac_itm_grp_cd.addAllListener(p);
		p.columnDtl_def_ac_itm_grp_cd.setListListener(p);
		p.columnDtl_def_ac_itm_grp_nm.addAllListener(p);
		p.columnDtl_def_ac_itm_grp_nm.setListListener(p);
		p.columnDtl_def_minus_stk_flg.addAllListener(p);
		p.columnDtl_def_lot_mng_typ.addAllListener(p);
		p.columnDtl_def_lot_mng_typ.setListListener(p);
		p.columnDtl_def_lot_mng_typ_nm.addAllListener(p);
		p.columnDtl_def_lot_mng_typ_nm.setListListener(p);
		p.columnDtl_def_lot_no_typ.addAllListener(p);
		p.columnDtl_def_lot_no_typ.setListListener(p);
		p.columnDtl_def_lot_no_typ_nm.addAllListener(p);
		p.columnDtl_def_lot_no_typ_nm.setListListener(p);
		p.columnDtl_def_lot_no_ptn_cd.addAllListener(p);
		p.columnDtl_def_lot_no_ptn_cd.setListListener(p);
		p.columnDtl_def_lot_no_ptn_nm.addAllListener(p);
		p.columnDtl_def_lot_no_ptn_nm.setListListener(p);
		p.columnDtl_def_sublot_mng_typ.addAllListener(p);
		p.columnDtl_def_sublot_mng_typ.setListListener(p);
		p.columnDtl_def_sublot_mng_typ_nm.addAllListener(p);
		p.columnDtl_def_sublot_mng_typ_nm.setListListener(p);
		p.columnDtl_def_sublot_no_typ.addAllListener(p);
		p.columnDtl_def_sublot_no_typ.setListListener(p);
		p.columnDtl_def_sublot_no_typ_nm.addAllListener(p);
		p.columnDtl_def_sublot_no_typ_nm.setListListener(p);
		p.columnDtl_def_sublot_no_ptn_cd.addAllListener(p);
		p.columnDtl_def_sublot_no_ptn_cd.setListListener(p);
		p.columnDtl_def_sublot_no_ptn_nm.addAllListener(p);
		p.columnDtl_def_sublot_no_ptn_nm.setListListener(p);
		p.columnDtl_def_bp_lot_flg.addAllListener(p);
		p.columnDtl_def_not_new_lot_flg.addAllListener(p);
		p.columnDtl_def_gi_alloc_flg.addAllListener(p);
		p.columnDtl_def_pack_alloc_flg.addAllListener(p);
		p.columnDtl_def_comp_spec_typ.addAllListener(p);
		p.columnDtl_def_comp_spec_typ.setListListener(p);
		p.columnDtl_def_comp_spec_typ_nm.addAllListener(p);
		p.columnDtl_def_comp_spec_typ_nm.setListListener(p);
		p.columnDtl_def_comp_rev_at_slo_flg.addAllListener(p);
		p.columnDtl_def_comp_core_itm_flg.addAllListener(p);
		p.columnDtl_def_itm_spec_grp_cd.addAllListener(p);
		p.columnDtl_def_itm_spec_grp_cd.setListListener(p);
		p.columnDtl_def_itm_spec_grp_nm.addAllListener(p);
		p.columnDtl_def_itm_spec_grp_nm.setListListener(p);
		p.columnDtl_def_insp_bind_typ.addAllListener(p);
		p.columnDtl_def_insp_bind_typ.setListListener(p);
		p.columnDtl_def_insp_bind_typ_nm.addAllListener(p);
		p.columnDtl_def_insp_bind_typ_nm.setListListener(p);
		p.columnDtl_def_skip_chk_ship_flg.addAllListener(p);
		p.columnDtl_def_lmt_ctl_flg.addAllListener(p);
		p.columnDtl_def_lmt_ctl_categ.addAllListener(p);
		p.columnDtl_def_lmt_ctl_categ.setListListener(p);
		p.columnDtl_def_ship_lot_back_stop_flg.addAllListener(p);
		p.columnDtl_def_ship_valid_grp_cd.addAllListener(p);
		p.columnDtl_def_ship_valid_grp_cd.setListListener(p);
		p.columnDtl_def_ship_valid_grp_nm.addAllListener(p);
		p.columnDtl_def_ship_valid_grp_nm.setListListener(p);
		p.columnDtl_def_sls_upri_grp_cd.addAllListener(p);
		p.columnDtl_def_sls_upri_grp_cd.setListListener(p);
		p.columnDtl_def_sls_upri_grp_nm.addAllListener(p);
		p.columnDtl_def_sls_upri_grp_nm.setListListener(p);
		p.columnDtl_def_slo_proc_flg.addAllListener(p);
		p.columnDtl_def_slo_proc_typ.addAllListener(p);
		p.columnDtl_def_slo_proc_typ.setListListener(p);
		p.columnDtl_def_slo_proc_typ_nm.addAllListener(p);
		p.columnDtl_def_slo_proc_typ_nm.setListListener(p);
		p.columnDtl_def_ship_inst_typ.addAllListener(p);
		p.columnDtl_def_ship_inst_typ.setListListener(p);
		p.columnDtl_def_ship_inst_typ_nm.addAllListener(p);
		p.columnDtl_def_ship_inst_typ_nm.setListListener(p);
		p.columnDtl_def_itm_ship_grp_cd.addAllListener(p);
		p.columnDtl_def_itm_ship_grp_cd.setListListener(p);
		p.columnDtl_def_itm_ship_grp_nm.addAllListener(p);
		p.columnDtl_def_itm_ship_grp_nm.setListListener(p);
		p.columnDtl_def_arr_skip_flg.addAllListener(p);
		p.columnDtl_def_ship_term_cd.addAllListener(p);
		p.columnDtl_def_ship_term_cd.setListListener(p);
		p.columnDtl_def_ship_term_nm.addAllListener(p);
		p.columnDtl_def_ship_term_nm.setListListener(p);
		p.columnDtl_def_stk_lst_flg.addAllListener(p);
		p.columnDtl_def_ver_flg.addAllListener(p);
		p.columnDtl_def_mfg_inst_unit_typ.addAllListener(p);
		p.columnDtl_def_mfg_inst_unit_typ.setListListener(p);
		p.columnDtl_def_mfg_inst_unit_typ_nm.addAllListener(p);
		p.columnDtl_def_mfg_inst_unit_typ_nm.setListListener(p);
		p.columnDtl_def_sls_upri_cng_flg.addAllListener(p);
		p.columnDtl_def_purc_upri_cng_flg.addAllListener(p);
		p.columnDtl_def_prov_upri_cng_flg.addAllListener(p);
		p.columnDtl_def_mrp_proc_typ.addAllListener(p);
		p.columnDtl_def_mrp_proc_typ.setListListener(p);
		p.columnDtl_def_mrp_proc_typ_nm.addAllListener(p);
		p.columnDtl_def_mrp_proc_typ_nm.setListListener(p);
		p.columnDtl_def_rqmt_typ.addAllListener(p);
		p.columnDtl_def_rqmt_typ.setListListener(p);
		p.columnDtl_def_rqmt_typ_nm.addAllListener(p);
		p.columnDtl_def_rqmt_typ_nm.setListListener(p);
		p.columnDtl_def_prod_pln_typ.addAllListener(p);
		p.columnDtl_def_prod_pln_typ.setListListener(p);
		p.columnDtl_def_prod_pln_typ_nm.addAllListener(p);
		p.columnDtl_def_prod_pln_typ_nm.setListListener(p);
		p.columnDtl_def_dmnd_date_div_mons.addAllListener(p);
		p.columnDtl_def_dmnd_date_div_mons.setListListener(p);
		p.columnDtl_def_alloc_margin_days.addAllListener(p);
		p.columnDtl_def_alloc_margin_days.setListListener(p);
		p.columnDtl_def_mrp_alloc_margin_days.addAllListener(p);
		p.columnDtl_def_mrp_alloc_margin_days.setListListener(p);
		p.columnDtl_def_mrp_opn_xfr_days.addAllListener(p);
		p.columnDtl_def_mrp_opn_xfr_days.setListListener(p);
		p.columnDtl_def_inpt_itm_add_flg.addAllListener(p);
		p.columnDtl_def_inpt_itm_del_flg.addAllListener(p);
		p.columnDtl_def_sch_flg.addAllListener(p);
		p.columnDtl_def_sno1_mng_typ.addAllListener(p);
		p.columnDtl_def_sno1_mng_typ.setListListener(p);
		p.columnDtl_def_sno1_mng_typ_nm.addAllListener(p);
		p.columnDtl_def_sno1_mng_typ_nm.setListListener(p);
		p.columnDtl_def_slo_sno1_flg.addAllListener(p);
		p.columnDtl_def_rqmt_sno1_flg.addAllListener(p);
		p.columnDtl_def_sno1_num_typ.addAllListener(p);
		p.columnDtl_def_sno1_num_typ.setListListener(p);
		p.columnDtl_def_sno1_num_typ_nm.addAllListener(p);
		p.columnDtl_def_sno1_num_typ_nm.setListListener(p);
		p.columnDtl_def_sno1_ptn_cd.addAllListener(p);
		p.columnDtl_def_sno1_ptn_cd.setListListener(p);
		p.columnDtl_def_sno1_ptn_nm.addAllListener(p);
		p.columnDtl_def_sno1_ptn_nm.setListListener(p);
		p.columnDtl_def_sno2_mng_typ.addAllListener(p);
		p.columnDtl_def_sno2_mng_typ.setListListener(p);
		p.columnDtl_def_sno2_mng_typ_nm.addAllListener(p);
		p.columnDtl_def_sno2_mng_typ_nm.setListListener(p);
		p.columnDtl_def_slo_sno2_flg.addAllListener(p);
		p.columnDtl_def_rqmt_sno2_flg.addAllListener(p);
		p.columnDtl_def_sno2_num_typ.addAllListener(p);
		p.columnDtl_def_sno2_num_typ.setListListener(p);
		p.columnDtl_def_sno2_num_typ_nm.addAllListener(p);
		p.columnDtl_def_sno2_num_typ_nm.setListListener(p);
		p.columnDtl_def_sno2_ptn_cd.addAllListener(p);
		p.columnDtl_def_sno2_ptn_cd.setListListener(p);
		p.columnDtl_def_sno2_ptn_nm.addAllListener(p);
		p.columnDtl_def_sno2_ptn_nm.setListListener(p);
		p.columnDtl_def_sno3_mng_typ.addAllListener(p);
		p.columnDtl_def_sno3_mng_typ.setListListener(p);
		p.columnDtl_def_sno3_mng_typ_nm.addAllListener(p);
		p.columnDtl_def_sno3_mng_typ_nm.setListListener(p);
		p.columnDtl_def_slo_sno3_flg.addAllListener(p);
		p.columnDtl_def_rqmt_sno3_flg.addAllListener(p);
		p.columnDtl_def_sno3_num_typ.addAllListener(p);
		p.columnDtl_def_sno3_num_typ.setListListener(p);
		p.columnDtl_def_sno3_num_typ_nm.addAllListener(p);
		p.columnDtl_def_sno3_num_typ_nm.setListListener(p);
		p.columnDtl_def_sno3_ptn_cd.addAllListener(p);
		p.columnDtl_def_sno3_ptn_cd.setListListener(p);
		p.columnDtl_def_sno3_ptn_nm.addAllListener(p);
		p.columnDtl_def_sno3_ptn_nm.setListListener(p);
		p.columnDtl_def_sno4_mng_typ.addAllListener(p);
		p.columnDtl_def_sno4_mng_typ.setListListener(p);
		p.columnDtl_def_sno4_mng_typ_nm.addAllListener(p);
		p.columnDtl_def_sno4_mng_typ_nm.setListListener(p);
		p.columnDtl_def_slo_sno4_flg.addAllListener(p);
		p.columnDtl_def_rqmt_sno4_flg.addAllListener(p);
		p.columnDtl_def_sno4_num_typ.addAllListener(p);
		p.columnDtl_def_sno4_num_typ.setListListener(p);
		p.columnDtl_def_sno4_num_typ_nm.addAllListener(p);
		p.columnDtl_def_sno4_num_typ_nm.setListListener(p);
		p.columnDtl_def_sno4_ptn_cd.addAllListener(p);
		p.columnDtl_def_sno4_ptn_cd.setListListener(p);
		p.columnDtl_def_sno4_ptn_nm.addAllListener(p);
		p.columnDtl_def_sno4_ptn_nm.setListListener(p);
		p.columnDtl_def_mrkt_judg_flg.addAllListener(p);
		p.columnDtl_def_mrkt_judg_role_cd.addAllListener(p);
		p.columnDtl_def_mrkt_judg_role_cd.setListListener(p);
		p.columnDtl_def_mrkt_judg_role_nm.addAllListener(p);
		p.columnDtl_def_mrkt_judg_role_nm.setListListener(p);
		p.columnDtl_def_mrkt_judg_upd_role_cd.addAllListener(p);
		p.columnDtl_def_mrkt_judg_upd_role_cd.setListListener(p);
		p.columnDtl_def_mrkt_judg_upd_role_nm.addAllListener(p);
		p.columnDtl_def_mrkt_judg_upd_role_nm.setListListener(p);
		p.columnDtl_def_plnt_aprv_flg.addAllListener(p);
		p.columnDtl_def_plnt_aprv_role_cd.addAllListener(p);
		p.columnDtl_def_plnt_aprv_role_cd.setListListener(p);
		p.columnDtl_def_plnt_aprv_role_nm.addAllListener(p);
		p.columnDtl_def_plnt_aprv_role_nm.setListListener(p);
		p.columnDtl_def_insp_aprv_flg.addAllListener(p);
		p.columnDtl_def_insp_aprv_role_cd.addAllListener(p);
		p.columnDtl_def_insp_aprv_role_cd.setListListener(p);
		p.columnDtl_def_insp_aprv_role_nm.addAllListener(p);
		p.columnDtl_def_insp_aprv_role_nm.setListListener(p);
		p.columnDtl_def_mfg_aprv_flg.addAllListener(p);
		p.columnDtl_def_mfg_aprv_role_cd.addAllListener(p);
		p.columnDtl_def_mfg_aprv_role_cd.setListListener(p);
		p.columnDtl_def_mfg_aprv_role_nm.addAllListener(p);
		p.columnDtl_def_mfg_aprv_role_nm.setListListener(p);
		p.columnDtl_def_sno_typ1.addAllListener(p);
		p.columnDtl_def_sno_typ1.setListListener(p);
		p.columnDtl_def_sno_typ_nm1.addAllListener(p);
		p.columnDtl_def_sno_typ_nm1.setListListener(p);
		p.columnDtl_def_sno_typ2.addAllListener(p);
		p.columnDtl_def_sno_typ2.setListListener(p);
		p.columnDtl_def_sno_typ_nm2.addAllListener(p);
		p.columnDtl_def_sno_typ_nm2.setListListener(p);
		p.columnDtl_def_sno_typ3.addAllListener(p);
		p.columnDtl_def_sno_typ3.setListListener(p);
		p.columnDtl_def_sno_typ_nm3.addAllListener(p);
		p.columnDtl_def_sno_typ_nm3.setListListener(p);
		p.columnDtl_def_sno_typ4.addAllListener(p);
		p.columnDtl_def_sno_typ4.setListListener(p);
		p.columnDtl_def_sno_typ_nm4.addAllListener(p);
		p.columnDtl_def_sno_typ_nm4.setListListener(p);
		p.columnDtl_def_byprod_flg.addAllListener(p);
		p.columnDtl_def_inst_lot_fix_flg.addAllListener(p);
		p.columnDtl_def_lot_mix_flg.addAllListener(p);
		p.columnDtl_def_sublot_mix_flg.addAllListener(p);
		p.columnDtl_def_alloc_ctl_typ.addAllListener(p);
		p.columnDtl_def_alloc_ctl_typ.setListListener(p);
		p.columnDtl_def_alloc_ctl_typ_nm.addAllListener(p);
		p.columnDtl_def_alloc_ctl_typ_nm.setListListener(p);
		p.columnDtl_def_inpt_ctl_typ.addAllListener(p);
		p.columnDtl_def_inpt_ctl_typ.setListListener(p);
		p.columnDtl_def_inpt_ctl_typ_nm.addAllListener(p);
		p.columnDtl_def_inpt_ctl_typ_nm.setListListener(p);
		p.columnDtl_def_bkf_typ.addAllListener(p);
		p.columnDtl_def_bkf_typ.setListListener(p);
		p.columnDtl_def_bkf_typ_nm.addAllListener(p);
		p.columnDtl_def_bkf_typ_nm.setListListener(p);
		p.columnDtl_def_main_itm_flg.addAllListener(p);
		p.columnDtl_def_not_cost_bom_flg.addAllListener(p);
		p.columnDtl_def_calc_ptn_cd.addAllListener(p);
		p.columnDtl_def_calc_ptn_cd.setListListener(p);
		p.columnDtl_def_calc_ptn_nm.addAllListener(p);
		p.columnDtl_def_calc_ptn_nm.setListListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
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
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABCP_ItmTypDtlReg p) {
		p.DtlBtn_select_all.addAllListener(p);
		p.DtlBtn_select_all.setAPMethodName("doDtlBtn_select_all");
		p.DtlBtn_deselect_all.addAllListener(p);
		p.DtlBtn_deselect_all.setAPMethodName("doDtlBtn_deselect_all");
		p.DtlBtn_radd.addAllListener(p);
		p.DtlBtn_radd.setAPMethodName("doDtlBtn_radd");
		p.DtlBtn_rdel.addAllListener(p);
		p.DtlBtn_rdel.setAPMethodName("doDtlBtn_rdel");
		p.DtlBtn_rcopy.addAllListener(p);
		p.DtlBtn_rcopy.setAPMethodName("doDtlBtn_rcopy");
	}

	/**
	 *  [LclWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrk(MABCP_ItmTypDtlReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABCP_ItmTypDtlReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_itm_typ.addAllListener(p);
		p.columnLcl_itm_typ.setListListener(p);
		p.columnLcl_itm_typ_nm.addAllListener(p);
		p.columnLcl_itm_typ_nm.setListListener(p);
		p.columnLcl_itm_typ_d_cd.addAllListener(p);
		p.columnLcl_itm_typ_d_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_itm_typ_d_nm.addAllListener(p);
		p.columnLcl_itm_typ_d_nm.setListListener(p);
		p.columnLcl_memo1.addAllListener(p);
		p.columnLcl_memo1.setListListener(p);
		p.columnLcl_memo2.addAllListener(p);
		p.columnLcl_memo2.setListListener(p);
		p.columnLcl_memo3.addAllListener(p);
		p.columnLcl_memo3.setListListener(p);
		p.columnLcl_ins_usr_id.addAllListener(p);
		p.columnLcl_ins_usr_id.setListListener(p);
		p.columnLcl_ins_usr_nm.addAllListener(p);
		p.columnLcl_ins_usr_nm.setListListener(p);
		p.columnLcl_ins_ts.addAllListener(p);
		p.columnLcl_ins_ts.setListListener(p);
		p.columnLcl_ins_func_id.addAllListener(p);
		p.columnLcl_ins_func_id.setListListener(p);
		p.columnLcl_ins_func_nm.addAllListener(p);
		p.columnLcl_ins_func_nm.setListListener(p);
		p.columnLcl_upd_cntr.addAllListener(p);
		p.columnLcl_upd_cntr.setListListener(p);
		p.columnLcl_upd_usr_id.addAllListener(p);
		p.columnLcl_upd_usr_id.setListListener(p);
		p.columnLcl_upd_usr_nm.addAllListener(p);
		p.columnLcl_upd_usr_nm.setListListener(p);
		p.columnLcl_upd_ts.addAllListener(p);
		p.columnLcl_upd_ts.setListListener(p);
		p.columnLcl_upd_func_id.addAllListener(p);
		p.columnLcl_upd_func_id.setListListener(p);
		p.columnLcl_upd_func_nm.addAllListener(p);
		p.columnLcl_upd_func_nm.setListListener(p);
		p.columnLcl_upd_srv_req_no.addAllListener(p);
		p.columnLcl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [LclBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclBtn(MABCP_ItmTypDtlReg p) {
		p.LclBtn_select_all.addAllListener(p);
		p.LclBtn_select_all.setAPMethodName("doLclBtn_select_all");
		p.LclBtn_deselect_all.addAllListener(p);
		p.LclBtn_deselect_all.setAPMethodName("doLclBtn_deselect_all");
		p.LclBtn_radd.addAllListener(p);
		p.LclBtn_radd.setAPMethodName("doLclBtn_radd");
		p.LclBtn_rdel.addAllListener(p);
		p.LclBtn_rdel.setAPMethodName("doLclBtn_rdel");
		p.LclBtn_rcopy.addAllListener(p);
		p.LclBtn_rcopy.setAPMethodName("doLclBtn_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_ItmTypDtlReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_ItmTypDtlReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_ItmTypDtlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_ItmTypDtlReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_ItmTypDtlReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_itm_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_itm_typ_d_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_sls_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_mfg_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_purc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_insp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_itm_jnl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_itm_jnl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_ac_itm_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_ac_itm_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_minus_stk_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_lot_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_lot_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_lot_no_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_lot_no_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sublot_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sublot_no_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sublot_no_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_bp_lot_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_not_new_lot_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_gi_alloc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_pack_alloc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_comp_spec_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_def_comp_spec_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_def_comp_rev_at_slo_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_def_comp_core_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_def_itm_spec_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_def_itm_spec_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_def_insp_bind_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_insp_bind_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_skip_chk_ship_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_lmt_ctl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_lmt_ctl_categ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_ship_lot_back_stop_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_ship_valid_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_ship_valid_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sls_upri_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sls_upri_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_slo_proc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_slo_proc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_slo_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_ship_inst_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_ship_inst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_itm_ship_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_itm_ship_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_arr_skip_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_ship_term_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_ship_term_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_stk_lst_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_ver_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_mfg_inst_unit_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_mfg_inst_unit_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sls_upri_cng_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_purc_upri_cng_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_prov_upri_cng_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_mrp_proc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_mrp_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_rqmt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_prod_pln_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_prod_pln_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_dmnd_date_div_mons.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_alloc_margin_days.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_mrp_alloc_margin_days.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_mrp_opn_xfr_days.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_inpt_itm_add_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_inpt_itm_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_sch_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_sno1_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno1_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno1_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_rqmt_sno1_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno1_num_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno1_num_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno1_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno2_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno2_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_rqmt_sno2_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno2_num_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno2_num_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno2_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno3_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno3_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_rqmt_sno3_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno3_num_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno3_num_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno3_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno4_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno4_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_rqmt_sno4_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno4_num_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno4_num_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno4_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_mrkt_judg_role_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_mrkt_judg_role_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_upd_role_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_mrkt_judg_upd_role_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_plnt_aprv_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_plnt_aprv_role_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_plnt_aprv_role_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_insp_aprv_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_insp_aprv_role_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_insp_aprv_role_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_aprv_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_mfg_aprv_role_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_mfg_aprv_role_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno_typ_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno_typ_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno_typ_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_sno_typ_nm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_byprod_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_inst_lot_fix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_lot_mix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_sublot_mix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_alloc_ctl_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_alloc_ctl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_inpt_ctl_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_inpt_ctl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_bkf_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_bkf_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_main_itm_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_not_cost_bom_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_calc_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_calc_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
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
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABCP_ItmTypDtlReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABCP_ItmTypDtlReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_itm_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_itm_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_itm_typ_d_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_itm_typ_d_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclAll(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABCP_ItmTypDtlReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_ItmTypDtlReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_ItmTypDtlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_ItmTypDtlReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_ItmTypDtlReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sls_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_purc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_insp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_itm_jnl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_itm_jnl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_ac_itm_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_ac_itm_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_minus_stk_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_lot_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_lot_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_bp_lot_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_not_new_lot_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_gi_alloc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_pack_alloc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_comp_spec_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_def_comp_spec_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_def_comp_rev_at_slo_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_def_comp_core_itm_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_def_itm_spec_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_def_itm_spec_grp_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_def_insp_bind_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_insp_bind_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_skip_chk_ship_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_lmt_ctl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_lmt_ctl_categ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_ship_lot_back_stop_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_ship_valid_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_ship_valid_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sls_upri_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sls_upri_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_slo_proc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_slo_proc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_slo_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_ship_inst_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_ship_inst_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_itm_ship_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_itm_ship_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_arr_skip_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_ship_term_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_ship_term_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_stk_lst_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_ver_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_inst_unit_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_inst_unit_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sls_upri_cng_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_purc_upri_cng_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_prov_upri_cng_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mrp_proc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mrp_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_prod_pln_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_prod_pln_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_dmnd_date_div_mons.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_alloc_margin_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mrp_alloc_margin_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mrp_opn_xfr_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_inpt_itm_add_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_inpt_itm_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sch_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno1_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_sno1_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_num_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_num_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno2_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_sno2_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_num_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_num_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno3_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_sno3_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_num_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_num_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno4_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_sno4_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_num_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_num_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_role_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_role_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_upd_role_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_upd_role_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_plnt_aprv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_plnt_aprv_role_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_plnt_aprv_role_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_insp_aprv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_insp_aprv_role_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_insp_aprv_role_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_aprv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_aprv_role_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_aprv_role_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_byprod_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_inst_lot_fix_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_lot_mix_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_mix_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_alloc_ctl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_alloc_ctl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_inpt_ctl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_inpt_ctl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_bkf_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_bkf_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_main_itm_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_not_cost_bom_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_calc_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_calc_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
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
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABCP_ItmTypDtlReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABCP_ItmTypDtlReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_itm_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_itm_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_itm_typ_d_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclAll(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABCP_ItmTypDtlReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_ItmTypDtlReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_ItmTypDtlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_ItmTypDtlReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [DEL]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wrk(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_ItmTypDtlReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sls_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_purc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_insp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_itm_jnl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_itm_jnl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_ac_itm_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_ac_itm_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_minus_stk_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_lot_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_lot_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_bp_lot_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_not_new_lot_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_gi_alloc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_pack_alloc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_comp_spec_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_def_comp_spec_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_def_comp_rev_at_slo_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_def_comp_core_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_def_itm_spec_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_def_itm_spec_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_def_insp_bind_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_insp_bind_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_skip_chk_ship_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_lmt_ctl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_lmt_ctl_categ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_ship_lot_back_stop_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_ship_valid_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_ship_valid_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sls_upri_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sls_upri_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_slo_proc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_slo_proc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_slo_proc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_ship_inst_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_ship_inst_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_itm_ship_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_itm_ship_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_arr_skip_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_ship_term_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_ship_term_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_stk_lst_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_ver_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_inst_unit_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_inst_unit_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sls_upri_cng_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_purc_upri_cng_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_prov_upri_cng_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mrp_proc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mrp_proc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_prod_pln_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_prod_pln_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_dmnd_date_div_mons.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_alloc_margin_days.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mrp_alloc_margin_days.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mrp_opn_xfr_days.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_inpt_itm_add_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_inpt_itm_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sch_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno1_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_sno1_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_num_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_num_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno2_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_sno2_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_num_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_num_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno3_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_sno3_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_num_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_num_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno4_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_sno4_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_num_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_num_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_role_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_role_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_upd_role_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_upd_role_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_plnt_aprv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_plnt_aprv_role_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_plnt_aprv_role_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_insp_aprv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_insp_aprv_role_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_insp_aprv_role_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_aprv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_aprv_role_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_aprv_role_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_byprod_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_inst_lot_fix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_lot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_alloc_ctl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_alloc_ctl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_inpt_ctl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_inpt_ctl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_bkf_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_bkf_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_main_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_not_cost_bom_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_calc_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_calc_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
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
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABCP_ItmTypDtlReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABCP_ItmTypDtlReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_itm_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_itm_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_itm_typ_d_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclAll(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABCP_ItmTypDtlReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_ItmTypDtlReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_ItmTypDtlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_ItmTypDtlReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_ItmTypDtlReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sls_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_purc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_ac_itm_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_ac_itm_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_minus_stk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_lot_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_lot_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_lot_no_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_no_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_bp_lot_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_not_new_lot_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_gi_alloc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_pack_alloc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_comp_spec_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_def_comp_spec_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_def_comp_rev_at_slo_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_def_comp_core_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_def_itm_spec_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_def_itm_spec_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_def_insp_bind_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_insp_bind_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_skip_chk_ship_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_lmt_ctl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_lmt_ctl_categ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_ship_lot_back_stop_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_ship_valid_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_ship_valid_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sls_upri_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sls_upri_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_slo_proc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_slo_proc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_slo_proc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_ship_inst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_ship_inst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_itm_ship_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_itm_ship_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_arr_skip_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_ship_term_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_ship_term_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_stk_lst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_ver_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_inst_unit_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_inst_unit_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sls_upri_cng_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_purc_upri_cng_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_prov_upri_cng_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mrp_proc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mrp_proc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_prod_pln_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_prod_pln_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_dmnd_date_div_mons.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_alloc_margin_days.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mrp_alloc_margin_days.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mrp_opn_xfr_days.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_inpt_itm_add_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_inpt_itm_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sch_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno1_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_sno1_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_num_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_num_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno1_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno2_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_sno2_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_num_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_num_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno2_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno3_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_sno3_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_num_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_num_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno3_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_slo_sno4_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_rqmt_sno4_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_num_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_num_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno4_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_role_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_role_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_upd_role_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mrkt_judg_upd_role_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_plnt_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_plnt_aprv_role_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_plnt_aprv_role_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_insp_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_insp_aprv_role_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_insp_aprv_role_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_aprv_role_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_mfg_aprv_role_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sno_typ_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_byprod_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_inst_lot_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_lot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_sublot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_alloc_ctl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_alloc_ctl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_inpt_ctl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_inpt_ctl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_bkf_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_bkf_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_main_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_not_cost_bom_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_calc_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_calc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
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
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABCP_ItmTypDtlReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABCP_ItmTypDtlReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_itm_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_itm_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_itm_typ_d_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclAll(MABCP_ItmTypDtlReg p){

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABCP_ItmTypDtlReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_ItmTypDtlReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_ItmTypDtlReg p){

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
		MABCP_ItmTypDtlReg_MC.setTableConfigDtl((MABCP_ItmTypDtlReg)this);
		MABCP_ItmTypDtlReg_MC.setTableConfigLcl((MABCP_ItmTypDtlReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_ItmTypDtlReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0350.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.itm_typ_META);
		p.columnDtl_itm_typ.addLinkBeans(p.columnDtl_itm_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm_lcl.setMeta(mcframe.clientMABC.MABCP0350.DtlR.itm_typ_d_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm_lcl);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.columnDtl_def_sls_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sls_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sls_flg);
		p.columnDtl_def_mfg_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mfg_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mfg_flg);
		p.columnDtl_def_purc_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_purc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_purc_flg);
		p.columnDtl_def_insp_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_insp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_insp_flg);
		p.columnDtl_def_itm_jnl_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_itm_jnl_cd_META);
		p.columnDtl_def_itm_jnl_cd.addLinkBeans(p.columnDtl_def_itm_jnl_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_itm_jnl_cd);
		p.columnDtl_def_itm_jnl_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_itm_jnl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_itm_jnl_nm);
		p.columnDtl_def_ac_itm_grp_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_ac_itm_grp_cd_META);
		p.columnDtl_def_ac_itm_grp_cd.addLinkBeans(p.columnDtl_def_ac_itm_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_ac_itm_grp_cd);
		p.columnDtl_def_ac_itm_grp_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_ac_itm_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_ac_itm_grp_nm);
		p.columnDtl_def_minus_stk_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_minus_stk_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_minus_stk_flg);
		p.columnDtl_def_lot_mng_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_lot_mng_typ_META);
		p.columnDtl_def_lot_mng_typ.addLinkBeans(p.columnDtl_def_lot_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_lot_mng_typ);
		p.columnDtl_def_lot_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_lot_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_lot_mng_typ_nm);
		p.columnDtl_def_lot_no_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_lot_no_typ_META);
		p.columnDtl_def_lot_no_typ.addLinkBeans(p.columnDtl_def_lot_no_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_lot_no_typ);
		p.columnDtl_def_lot_no_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_lot_no_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_lot_no_typ_nm);
		p.columnDtl_def_lot_no_ptn_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_lot_no_ptn_cd_META);
		p.columnDtl_def_lot_no_ptn_cd.addLinkBeans(p.columnDtl_def_lot_no_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_lot_no_ptn_cd);
		p.columnDtl_def_lot_no_ptn_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_lot_no_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_lot_no_ptn_nm);
		p.columnDtl_def_sublot_mng_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sublot_mng_typ_META);
		p.columnDtl_def_sublot_mng_typ.addLinkBeans(p.columnDtl_def_sublot_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sublot_mng_typ);
		p.columnDtl_def_sublot_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sublot_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sublot_mng_typ_nm);
		p.columnDtl_def_sublot_no_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sublot_no_typ_META);
		p.columnDtl_def_sublot_no_typ.addLinkBeans(p.columnDtl_def_sublot_no_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sublot_no_typ);
		p.columnDtl_def_sublot_no_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sublot_no_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sublot_no_typ_nm);
		p.columnDtl_def_sublot_no_ptn_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sublot_no_ptn_cd_META);
		p.columnDtl_def_sublot_no_ptn_cd.addLinkBeans(p.columnDtl_def_sublot_no_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sublot_no_ptn_cd);
		p.columnDtl_def_sublot_no_ptn_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sublot_no_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sublot_no_ptn_nm);
		p.columnDtl_def_bp_lot_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_bp_lot_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_bp_lot_flg);
		p.columnDtl_def_not_new_lot_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_not_new_lot_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_not_new_lot_flg);
		p.columnDtl_def_gi_alloc_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_gi_alloc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_gi_alloc_flg);
		p.columnDtl_def_pack_alloc_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_pack_alloc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_pack_alloc_flg);
		p.columnDtl_def_comp_spec_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_comp_spec_typ_META);
		p.columnDtl_def_comp_spec_typ.addLinkBeans(p.columnDtl_def_comp_spec_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_comp_spec_typ);
		p.columnDtl_def_comp_spec_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_comp_spec_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_comp_spec_typ_nm);
		p.columnDtl_def_comp_rev_at_slo_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_comp_rev_at_slo_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_comp_rev_at_slo_flg);
		p.columnDtl_def_comp_core_itm_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_comp_core_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_comp_core_itm_flg);
		p.columnDtl_def_itm_spec_grp_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_itm_spec_grp_cd_META);
		p.columnDtl_def_itm_spec_grp_cd.addLinkBeans(p.columnDtl_def_itm_spec_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_itm_spec_grp_cd);
		p.columnDtl_def_itm_spec_grp_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_itm_spec_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_itm_spec_grp_nm);
		p.columnDtl_def_insp_bind_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_insp_bind_typ_META);
		p.columnDtl_def_insp_bind_typ.addLinkBeans(p.columnDtl_def_insp_bind_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_insp_bind_typ);
		p.columnDtl_def_insp_bind_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_insp_bind_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_insp_bind_typ_nm);
		p.columnDtl_def_skip_chk_ship_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_skip_chk_ship_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_skip_chk_ship_flg);
		p.columnDtl_def_lmt_ctl_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_lmt_ctl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_lmt_ctl_flg);
		p.columnDtl_def_lmt_ctl_categ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_lmt_ctl_categ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_lmt_ctl_categ);
		p.columnDtl_def_ship_lot_back_stop_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_ship_lot_back_stop_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_ship_lot_back_stop_flg);
		p.columnDtl_def_ship_valid_grp_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_ship_valid_grp_cd_META);
		p.columnDtl_def_ship_valid_grp_cd.addLinkBeans(p.columnDtl_def_ship_valid_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_ship_valid_grp_cd);
		p.columnDtl_def_ship_valid_grp_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_ship_valid_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_ship_valid_grp_nm);
		p.columnDtl_def_sls_upri_grp_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sls_upri_grp_cd_META);
		p.columnDtl_def_sls_upri_grp_cd.addLinkBeans(p.columnDtl_def_sls_upri_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sls_upri_grp_cd);
		p.columnDtl_def_sls_upri_grp_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sls_upri_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sls_upri_grp_nm);
		p.columnDtl_def_slo_proc_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_slo_proc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_slo_proc_flg);
		p.columnDtl_def_slo_proc_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_slo_proc_typ_META);
		p.columnDtl_def_slo_proc_typ.addLinkBeans(p.columnDtl_def_slo_proc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_slo_proc_typ);
		p.columnDtl_def_slo_proc_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_slo_proc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_slo_proc_typ_nm);
		p.columnDtl_def_ship_inst_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_ship_inst_typ_META);
		p.columnDtl_def_ship_inst_typ.addLinkBeans(p.columnDtl_def_ship_inst_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_ship_inst_typ);
		p.columnDtl_def_ship_inst_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_ship_inst_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_ship_inst_typ_nm);
		p.columnDtl_def_itm_ship_grp_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_itm_ship_grp_cd_META);
		p.columnDtl_def_itm_ship_grp_cd.addLinkBeans(p.columnDtl_def_itm_ship_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_itm_ship_grp_cd);
		p.columnDtl_def_itm_ship_grp_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_itm_ship_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_itm_ship_grp_nm);
		p.columnDtl_def_arr_skip_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_arr_skip_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_arr_skip_flg);
		p.columnDtl_def_ship_term_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_ship_term_cd_META);
		p.columnDtl_def_ship_term_cd.addLinkBeans(p.columnDtl_def_ship_term_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_ship_term_cd);
		p.columnDtl_def_ship_term_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_ship_term_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_ship_term_nm);
		p.columnDtl_def_stk_lst_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_stk_lst_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_stk_lst_flg);
		p.columnDtl_def_ver_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_ver_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_ver_flg);
		p.columnDtl_def_mfg_inst_unit_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mfg_inst_unit_typ_META);
		p.columnDtl_def_mfg_inst_unit_typ.addLinkBeans(p.columnDtl_def_mfg_inst_unit_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mfg_inst_unit_typ);
		p.columnDtl_def_mfg_inst_unit_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mfg_inst_unit_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mfg_inst_unit_typ_nm);
		p.columnDtl_def_sls_upri_cng_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sls_upri_cng_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sls_upri_cng_flg);
		p.columnDtl_def_purc_upri_cng_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_purc_upri_cng_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_purc_upri_cng_flg);
		p.columnDtl_def_prov_upri_cng_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_prov_upri_cng_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_prov_upri_cng_flg);
		p.columnDtl_def_mrp_proc_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mrp_proc_typ_META);
		p.columnDtl_def_mrp_proc_typ.addLinkBeans(p.columnDtl_def_mrp_proc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mrp_proc_typ);
		p.columnDtl_def_mrp_proc_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mrp_proc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mrp_proc_typ_nm);
		p.columnDtl_def_rqmt_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_rqmt_typ_META);
		p.columnDtl_def_rqmt_typ.addLinkBeans(p.columnDtl_def_rqmt_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_rqmt_typ);
		p.columnDtl_def_rqmt_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_rqmt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_rqmt_typ_nm);
		p.columnDtl_def_prod_pln_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_prod_pln_typ_META);
		p.columnDtl_def_prod_pln_typ.addLinkBeans(p.columnDtl_def_prod_pln_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_prod_pln_typ);
		p.columnDtl_def_prod_pln_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_prod_pln_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_prod_pln_typ_nm);
		p.columnDtl_def_dmnd_date_div_mons.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_dmnd_date_div_mons_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_dmnd_date_div_mons);
		p.columnDtl_def_alloc_margin_days.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_alloc_margin_days_META);
		p.columnDtl_def_alloc_margin_days.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_def_alloc_margin_days);
		p.columnDtl_def_mrp_alloc_margin_days.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mrp_alloc_margin_days_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mrp_alloc_margin_days);
		p.columnDtl_def_mrp_opn_xfr_days.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mrp_opn_xfr_days_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mrp_opn_xfr_days);
		p.columnDtl_def_inpt_itm_add_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_inpt_itm_add_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_inpt_itm_add_flg);
		p.columnDtl_def_inpt_itm_del_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_inpt_itm_del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_inpt_itm_del_flg);
		p.columnDtl_def_sch_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sch_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sch_flg);
		p.columnDtl_def_sno1_mng_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno1_mng_typ_META);
		p.columnDtl_def_sno1_mng_typ.addLinkBeans(p.columnDtl_def_sno1_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno1_mng_typ);
		p.columnDtl_def_sno1_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno1_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno1_mng_typ_nm);
		p.columnDtl_def_slo_sno1_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_slo_sno1_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_slo_sno1_flg);
		p.columnDtl_def_rqmt_sno1_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_rqmt_sno1_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_rqmt_sno1_flg);
		p.columnDtl_def_sno1_num_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno1_num_typ_META);
		p.columnDtl_def_sno1_num_typ.addLinkBeans(p.columnDtl_def_sno1_num_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno1_num_typ);
		p.columnDtl_def_sno1_num_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno1_num_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno1_num_typ_nm);
		p.columnDtl_def_sno1_ptn_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno1_ptn_cd_META);
		p.columnDtl_def_sno1_ptn_cd.addLinkBeans(p.columnDtl_def_sno1_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno1_ptn_cd);
		p.columnDtl_def_sno1_ptn_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno1_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno1_ptn_nm);
		p.columnDtl_def_sno2_mng_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno2_mng_typ_META);
		p.columnDtl_def_sno2_mng_typ.addLinkBeans(p.columnDtl_def_sno2_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno2_mng_typ);
		p.columnDtl_def_sno2_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno2_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno2_mng_typ_nm);
		p.columnDtl_def_slo_sno2_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_slo_sno2_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_slo_sno2_flg);
		p.columnDtl_def_rqmt_sno2_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_rqmt_sno2_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_rqmt_sno2_flg);
		p.columnDtl_def_sno2_num_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno2_num_typ_META);
		p.columnDtl_def_sno2_num_typ.addLinkBeans(p.columnDtl_def_sno2_num_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno2_num_typ);
		p.columnDtl_def_sno2_num_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno2_num_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno2_num_typ_nm);
		p.columnDtl_def_sno2_ptn_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno2_ptn_cd_META);
		p.columnDtl_def_sno2_ptn_cd.addLinkBeans(p.columnDtl_def_sno2_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno2_ptn_cd);
		p.columnDtl_def_sno2_ptn_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno2_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno2_ptn_nm);
		p.columnDtl_def_sno3_mng_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno3_mng_typ_META);
		p.columnDtl_def_sno3_mng_typ.addLinkBeans(p.columnDtl_def_sno3_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno3_mng_typ);
		p.columnDtl_def_sno3_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno3_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno3_mng_typ_nm);
		p.columnDtl_def_slo_sno3_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_slo_sno3_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_slo_sno3_flg);
		p.columnDtl_def_rqmt_sno3_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_rqmt_sno3_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_rqmt_sno3_flg);
		p.columnDtl_def_sno3_num_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno3_num_typ_META);
		p.columnDtl_def_sno3_num_typ.addLinkBeans(p.columnDtl_def_sno3_num_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno3_num_typ);
		p.columnDtl_def_sno3_num_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno3_num_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno3_num_typ_nm);
		p.columnDtl_def_sno3_ptn_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno3_ptn_cd_META);
		p.columnDtl_def_sno3_ptn_cd.addLinkBeans(p.columnDtl_def_sno3_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno3_ptn_cd);
		p.columnDtl_def_sno3_ptn_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno3_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno3_ptn_nm);
		p.columnDtl_def_sno4_mng_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno4_mng_typ_META);
		p.columnDtl_def_sno4_mng_typ.addLinkBeans(p.columnDtl_def_sno4_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno4_mng_typ);
		p.columnDtl_def_sno4_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno4_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno4_mng_typ_nm);
		p.columnDtl_def_slo_sno4_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_slo_sno4_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_slo_sno4_flg);
		p.columnDtl_def_rqmt_sno4_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_rqmt_sno4_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_rqmt_sno4_flg);
		p.columnDtl_def_sno4_num_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno4_num_typ_META);
		p.columnDtl_def_sno4_num_typ.addLinkBeans(p.columnDtl_def_sno4_num_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno4_num_typ);
		p.columnDtl_def_sno4_num_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno4_num_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno4_num_typ_nm);
		p.columnDtl_def_sno4_ptn_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno4_ptn_cd_META);
		p.columnDtl_def_sno4_ptn_cd.addLinkBeans(p.columnDtl_def_sno4_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno4_ptn_cd);
		p.columnDtl_def_sno4_ptn_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno4_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno4_ptn_nm);
		p.columnDtl_def_mrkt_judg_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mrkt_judg_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mrkt_judg_flg);
		p.columnDtl_def_mrkt_judg_role_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mrkt_judg_role_cd_META);
		p.columnDtl_def_mrkt_judg_role_cd.addLinkBeans(p.columnDtl_def_mrkt_judg_role_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mrkt_judg_role_cd);
		p.columnDtl_def_mrkt_judg_role_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mrkt_judg_role_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mrkt_judg_role_nm);
		p.columnDtl_def_mrkt_judg_upd_role_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mrkt_judg_upd_role_cd_META);
		p.columnDtl_def_mrkt_judg_upd_role_cd.addLinkBeans(p.columnDtl_def_mrkt_judg_upd_role_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mrkt_judg_upd_role_cd);
		p.columnDtl_def_mrkt_judg_upd_role_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mrkt_judg_upd_role_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mrkt_judg_upd_role_nm);
		p.columnDtl_def_plnt_aprv_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_plnt_aprv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_plnt_aprv_flg);
		p.columnDtl_def_plnt_aprv_role_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_plnt_aprv_role_cd_META);
		p.columnDtl_def_plnt_aprv_role_cd.addLinkBeans(p.columnDtl_def_plnt_aprv_role_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_plnt_aprv_role_cd);
		p.columnDtl_def_plnt_aprv_role_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_plnt_aprv_role_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_plnt_aprv_role_nm);
		p.columnDtl_def_insp_aprv_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_insp_aprv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_insp_aprv_flg);
		p.columnDtl_def_insp_aprv_role_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_insp_aprv_role_cd_META);
		p.columnDtl_def_insp_aprv_role_cd.addLinkBeans(p.columnDtl_def_insp_aprv_role_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_insp_aprv_role_cd);
		p.columnDtl_def_insp_aprv_role_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_insp_aprv_role_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_insp_aprv_role_nm);
		p.columnDtl_def_mfg_aprv_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mfg_aprv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mfg_aprv_flg);
		p.columnDtl_def_mfg_aprv_role_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mfg_aprv_role_cd_META);
		p.columnDtl_def_mfg_aprv_role_cd.addLinkBeans(p.columnDtl_def_mfg_aprv_role_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mfg_aprv_role_cd);
		p.columnDtl_def_mfg_aprv_role_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_mfg_aprv_role_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_mfg_aprv_role_nm);
		p.columnDtl_def_sno_typ1.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno_typ1_META);
		p.columnDtl_def_sno_typ1.addLinkBeans(p.columnDtl_def_sno_typ_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno_typ1);
		p.columnDtl_def_sno_typ_nm1.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno_typ_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno_typ_nm1);
		p.columnDtl_def_sno_typ2.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno_typ2_META);
		p.columnDtl_def_sno_typ2.addLinkBeans(p.columnDtl_def_sno_typ_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno_typ2);
		p.columnDtl_def_sno_typ_nm2.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno_typ_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno_typ_nm2);
		p.columnDtl_def_sno_typ3.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno_typ3_META);
		p.columnDtl_def_sno_typ3.addLinkBeans(p.columnDtl_def_sno_typ_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno_typ3);
		p.columnDtl_def_sno_typ_nm3.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno_typ_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno_typ_nm3);
		p.columnDtl_def_sno_typ4.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno_typ4_META);
		p.columnDtl_def_sno_typ4.addLinkBeans(p.columnDtl_def_sno_typ_nm4);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno_typ4);
		p.columnDtl_def_sno_typ_nm4.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sno_typ_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sno_typ_nm4);
		p.columnDtl_def_byprod_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_byprod_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_byprod_flg);
		p.columnDtl_def_inst_lot_fix_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_inst_lot_fix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_inst_lot_fix_flg);
		p.columnDtl_def_lot_mix_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_lot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_lot_mix_flg);
		p.columnDtl_def_sublot_mix_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_sublot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_sublot_mix_flg);
		p.columnDtl_def_alloc_ctl_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_alloc_ctl_typ_META);
		p.columnDtl_def_alloc_ctl_typ.addLinkBeans(p.columnDtl_def_alloc_ctl_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_alloc_ctl_typ);
		p.columnDtl_def_alloc_ctl_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_alloc_ctl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_alloc_ctl_typ_nm);
		p.columnDtl_def_inpt_ctl_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_inpt_ctl_typ_META);
		p.columnDtl_def_inpt_ctl_typ.addLinkBeans(p.columnDtl_def_inpt_ctl_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_inpt_ctl_typ);
		p.columnDtl_def_inpt_ctl_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_inpt_ctl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_inpt_ctl_typ_nm);
		p.columnDtl_def_bkf_typ.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_bkf_typ_META);
		p.columnDtl_def_bkf_typ.addLinkBeans(p.columnDtl_def_bkf_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_bkf_typ);
		p.columnDtl_def_bkf_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_bkf_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_bkf_typ_nm);
		p.columnDtl_def_main_itm_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_main_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_main_itm_flg);
		p.columnDtl_def_not_cost_bom_flg.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_not_cost_bom_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_not_cost_bom_flg);
		p.columnDtl_def_calc_ptn_cd.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_calc_ptn_cd_META);
		p.columnDtl_def_calc_ptn_cd.addLinkBeans(p.columnDtl_def_calc_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_calc_ptn_cd);
		p.columnDtl_def_calc_ptn_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.def_calc_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_calc_ptn_nm);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0350.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0350.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0350.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0350.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0350.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0350.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0350.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0350.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0350.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0350.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0350.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0350.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0350.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0350.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABCP_ItmTypDtlReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABC.MABCP0350.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_itm_typ.setMeta(mcframe.clientMABC.MABCP0350.LclR.itm_typ_META);
		p.columnLcl_itm_typ.addLinkBeans(p.columnLcl_itm_typ_nm);
		p.LclTable.addColumnConfig(p.columnLcl_itm_typ);
		p.columnLcl_itm_typ_nm.setMeta(mcframe.clientMABC.MABCP0350.LclR.itm_typ_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_itm_typ_nm);
		p.columnLcl_itm_typ_d_cd.setMeta(mcframe.clientMABC.MABCP0350.LclR.itm_typ_d_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_itm_typ_d_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABC.MABCP0350.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABC.MABCP0350.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_itm_typ_d_nm.setMeta(mcframe.clientMABC.MABCP0350.LclR.itm_typ_d_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_itm_typ_d_nm);
		p.columnLcl_memo1.setMeta(mcframe.clientMABC.MABCP0350.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABC.MABCP0350.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABC.MABCP0350.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0350.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0350.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABC.MABCP0350.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0350.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0350.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0350.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0350.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0350.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABC.MABCP0350.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0350.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0350.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0350.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnDtl_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_typ.getListConfig().setPutter(getDtl_itm_typ_ListPutter());
		columnDtl_def_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_itm_jnl_cd.getListConfig().setPutter(getDtl_def_itm_jnl_cd_ListPutter());
		columnDtl_def_ac_itm_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_ac_itm_grp_cd.getListConfig().setPutter(getDtl_def_ac_itm_grp_cd_ListPutter());
		columnDtl_def_lot_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_lot_mng_typ.getListConfig().setPutter(getDtl_def_lot_mng_typ_ListPutter());
		columnDtl_def_lot_no_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_lot_no_typ.getListConfig().setPutter(getDtl_def_lot_no_typ_ListPutter());
		columnDtl_def_lot_no_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_lot_no_ptn_cd.getListConfig().setPutter(getDtl_def_lot_no_ptn_cd_ListPutter());
		columnDtl_def_sublot_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sublot_mng_typ.getListConfig().setPutter(getDtl_def_sublot_mng_typ_ListPutter());
		columnDtl_def_sublot_no_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sublot_no_typ.getListConfig().setPutter(getDtl_def_sublot_no_typ_ListPutter());
		columnDtl_def_sublot_no_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sublot_no_ptn_cd.getListConfig().setPutter(getDtl_def_sublot_no_ptn_cd_ListPutter());
		columnDtl_def_comp_spec_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_comp_spec_typ.getListConfig().setPutter(getDtl_def_comp_spec_typ_ListPutter());
		columnDtl_def_itm_spec_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_itm_spec_grp_cd.getListConfig().setPutter(getDtl_def_itm_spec_grp_cd_ListPutter());
		columnDtl_def_insp_bind_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_insp_bind_typ.getListConfig().setPutter(getDtl_def_insp_bind_typ_ListPutter());
		columnDtl_def_ship_valid_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_ship_valid_grp_cd.getListConfig().setPutter(getDtl_def_ship_valid_grp_cd_ListPutter());
		columnDtl_def_sls_upri_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sls_upri_grp_cd.getListConfig().setPutter(getDtl_def_sls_upri_grp_cd_ListPutter());
		columnDtl_def_slo_proc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_slo_proc_typ.getListConfig().setPutter(getDtl_def_slo_proc_typ_ListPutter());
		columnDtl_def_ship_inst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_ship_inst_typ.getListConfig().setPutter(getDtl_def_ship_inst_typ_ListPutter());
		columnDtl_def_itm_ship_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_itm_ship_grp_cd.getListConfig().setPutter(getDtl_def_itm_ship_grp_cd_ListPutter());
		columnDtl_def_ship_term_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_ship_term_cd.getListConfig().setPutter(getDtl_def_ship_term_cd_ListPutter());
		columnDtl_def_mfg_inst_unit_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_mfg_inst_unit_typ.getListConfig().setPutter(getDtl_def_mfg_inst_unit_typ_ListPutter());
		columnDtl_def_mrp_proc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_mrp_proc_typ.getListConfig().setPutter(getDtl_def_mrp_proc_typ_ListPutter());
		columnDtl_def_rqmt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_rqmt_typ.getListConfig().setPutter(getDtl_def_rqmt_typ_ListPutter());
		columnDtl_def_prod_pln_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_prod_pln_typ.getListConfig().setPutter(getDtl_def_prod_pln_typ_ListPutter());
		columnDtl_def_sno1_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno1_mng_typ.getListConfig().setPutter(getDtl_def_sno1_mng_typ_ListPutter());
		columnDtl_def_sno1_num_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno1_num_typ.getListConfig().setPutter(getDtl_def_sno1_num_typ_ListPutter());
		columnDtl_def_sno1_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno1_ptn_cd.getListConfig().setPutter(getDtl_def_sno1_ptn_cd_ListPutter());
		columnDtl_def_sno2_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno2_mng_typ.getListConfig().setPutter(getDtl_def_sno2_mng_typ_ListPutter());
		columnDtl_def_sno2_num_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno2_num_typ.getListConfig().setPutter(getDtl_def_sno2_num_typ_ListPutter());
		columnDtl_def_sno2_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno2_ptn_cd.getListConfig().setPutter(getDtl_def_sno2_ptn_cd_ListPutter());
		columnDtl_def_sno3_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno3_mng_typ.getListConfig().setPutter(getDtl_def_sno3_mng_typ_ListPutter());
		columnDtl_def_sno3_num_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno3_num_typ.getListConfig().setPutter(getDtl_def_sno3_num_typ_ListPutter());
		columnDtl_def_sno3_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno3_ptn_cd.getListConfig().setPutter(getDtl_def_sno3_ptn_cd_ListPutter());
		columnDtl_def_sno4_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno4_mng_typ.getListConfig().setPutter(getDtl_def_sno4_mng_typ_ListPutter());
		columnDtl_def_sno4_num_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno4_num_typ.getListConfig().setPutter(getDtl_def_sno4_num_typ_ListPutter());
		columnDtl_def_sno4_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno4_ptn_cd.getListConfig().setPutter(getDtl_def_sno4_ptn_cd_ListPutter());
		columnDtl_def_mrkt_judg_role_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_mrkt_judg_role_cd.getListConfig().setPutter(getDtl_def_mrkt_judg_role_cd_ListPutter());
		columnDtl_def_mrkt_judg_upd_role_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_mrkt_judg_upd_role_cd.getListConfig().setPutter(getDtl_def_mrkt_judg_upd_role_cd_ListPutter());
		columnDtl_def_plnt_aprv_role_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_plnt_aprv_role_cd.getListConfig().setPutter(getDtl_def_plnt_aprv_role_cd_ListPutter());
		columnDtl_def_insp_aprv_role_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_insp_aprv_role_cd.getListConfig().setPutter(getDtl_def_insp_aprv_role_cd_ListPutter());
		columnDtl_def_mfg_aprv_role_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_mfg_aprv_role_cd.getListConfig().setPutter(getDtl_def_mfg_aprv_role_cd_ListPutter());
		columnDtl_def_sno_typ1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno_typ1.getListConfig().setPutter(getDtl_def_sno_typ1_ListPutter());
		columnDtl_def_sno_typ2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno_typ2.getListConfig().setPutter(getDtl_def_sno_typ2_ListPutter());
		columnDtl_def_sno_typ3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno_typ3.getListConfig().setPutter(getDtl_def_sno_typ3_ListPutter());
		columnDtl_def_sno_typ4.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_sno_typ4.getListConfig().setPutter(getDtl_def_sno_typ4_ListPutter());
		columnDtl_def_alloc_ctl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_alloc_ctl_typ.getListConfig().setPutter(getDtl_def_alloc_ctl_typ_ListPutter());
		columnDtl_def_inpt_ctl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_inpt_ctl_typ.getListConfig().setPutter(getDtl_def_inpt_ctl_typ_ListPutter());
		columnDtl_def_bkf_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_bkf_typ.getListConfig().setPutter(getDtl_def_bkf_typ_ListPutter());
		columnDtl_def_calc_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_def_calc_ptn_cd.getListConfig().setPutter(getDtl_def_calc_ptn_cd_ListPutter());
		columnLcl_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_itm_typ.getListConfig().setPutter(getLcl_itm_typ_ListPutter());
		columnLcl_itm_typ_d_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_itm_typ_d_cd.getListConfig().setPutter(getLcl_itm_typ_d_cd_ListPutter());
		columnLcl_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_lcl_cd.getListConfig().setPutter(getLcl_lcl_cd_ListPutter());
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
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
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
	 * [Dtl_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Dtl_def_ac_itm_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_ac_itm_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcItmGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_lot_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_lot_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LotMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_lot_no_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_lot_no_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LotNoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_lot_no_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_lot_no_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sublot_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sublot_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SublotMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sublot_no_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sublot_no_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LotNoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sublot_no_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sublot_no_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_def_comp_spec_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_comp_spec_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CompSpecTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_itm_spec_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_itm_spec_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSpecGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_insp_bind_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_insp_bind_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspBindTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_ship_valid_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_ship_valid_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipValid");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sls_upri_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sls_upri_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsUpriGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_slo_proc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_slo_proc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SloProcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_ship_inst_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_ship_inst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipInstTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_itm_ship_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_itm_ship_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmShipGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_ship_term_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_ship_term_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipTerm");
		return lp;
	}
	 
	/**
	 * [Dtl_def_mfg_inst_unit_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_mfg_inst_unit_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.MfgInstUnitTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_mrp_proc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_mrp_proc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.MrpProcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_rqmt_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_rqmt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RqmtTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_prod_pln_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_prod_pln_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProdPlnTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno1_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno1_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno1_num_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno1_num_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoNoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno1_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno1_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno2_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno2_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno2_num_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno2_num_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoNoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno2_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno2_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno3_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno3_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno3_num_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno3_num_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoNoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno3_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno3_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno4_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno4_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno4_num_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno4_num_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoNoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno4_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno4_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_def_mrkt_judg_role_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_mrkt_judg_role_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_def_mrkt_judg_upd_role_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_mrkt_judg_upd_role_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_def_plnt_aprv_role_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_plnt_aprv_role_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_def_insp_aprv_role_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_insp_aprv_role_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_def_mfg_aprv_role_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_mfg_aprv_role_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno_typ1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno_typ1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno_typ2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno_typ2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno_typ3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno_typ3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_sno_typ4_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_sno_typ4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_alloc_ctl_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_alloc_ctl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AllocCtlTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_inpt_ctl_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_inpt_ctl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InptCtlTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_bkf_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_bkf_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BkfTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_def_calc_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_calc_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcPtn");
		return lp;
	}
	 
	/**
	 * [Lcl_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createLcl_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmTyp");
		return lp;
	}
	 
	/**
	 * [Lcl_itm_typ_d_cd_ListPutter]の作成
	 */
	protected MCListPutter createLcl_itm_typ_d_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Lcl_lcl_cd_ListPutter]の作成
	 */
	protected MCListPutter createLcl_lcl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocaleEntry");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnDtl_itm_typ) return getDtl_itm_typ(row, info);
		if(combo == columnDtl_def_itm_jnl_cd) return getDtl_def_itm_jnl_cd(row, info);
		if(combo == columnDtl_def_ac_itm_grp_cd) return getDtl_def_ac_itm_grp_cd(row, info);
		if(combo == columnDtl_def_lot_mng_typ) return getDtl_def_lot_mng_typ(row, info);
		if(combo == columnDtl_def_lot_no_typ) return getDtl_def_lot_no_typ(row, info);
		if(combo == columnDtl_def_lot_no_ptn_cd) return getDtl_def_lot_no_ptn_cd(row, info);
		if(combo == columnDtl_def_sublot_mng_typ) return getDtl_def_sublot_mng_typ(row, info);
		if(combo == columnDtl_def_sublot_no_typ) return getDtl_def_sublot_no_typ(row, info);
		if(combo == columnDtl_def_sublot_no_ptn_cd) return getDtl_def_sublot_no_ptn_cd(row, info);
		if(combo == columnDtl_def_comp_spec_typ) return getDtl_def_comp_spec_typ(row, info);
		if(combo == columnDtl_def_itm_spec_grp_cd) return getDtl_def_itm_spec_grp_cd(row, info);
		if(combo == columnDtl_def_insp_bind_typ) return getDtl_def_insp_bind_typ(row, info);
		if(combo == columnDtl_def_ship_valid_grp_cd) return getDtl_def_ship_valid_grp_cd(row, info);
		if(combo == columnDtl_def_sls_upri_grp_cd) return getDtl_def_sls_upri_grp_cd(row, info);
		if(combo == columnDtl_def_slo_proc_typ) return getDtl_def_slo_proc_typ(row, info);
		if(combo == columnDtl_def_ship_inst_typ) return getDtl_def_ship_inst_typ(row, info);
		if(combo == columnDtl_def_itm_ship_grp_cd) return getDtl_def_itm_ship_grp_cd(row, info);
		if(combo == columnDtl_def_ship_term_cd) return getDtl_def_ship_term_cd(row, info);
		if(combo == columnDtl_def_mfg_inst_unit_typ) return getDtl_def_mfg_inst_unit_typ(row, info);
		if(combo == columnDtl_def_mrp_proc_typ) return getDtl_def_mrp_proc_typ(row, info);
		if(combo == columnDtl_def_rqmt_typ) return getDtl_def_rqmt_typ(row, info);
		if(combo == columnDtl_def_prod_pln_typ) return getDtl_def_prod_pln_typ(row, info);
		if(combo == columnDtl_def_sno1_mng_typ) return getDtl_def_sno1_mng_typ(row, info);
		if(combo == columnDtl_def_sno1_num_typ) return getDtl_def_sno1_num_typ(row, info);
		if(combo == columnDtl_def_sno1_ptn_cd) return getDtl_def_sno1_ptn_cd(row, info);
		if(combo == columnDtl_def_sno2_mng_typ) return getDtl_def_sno2_mng_typ(row, info);
		if(combo == columnDtl_def_sno2_num_typ) return getDtl_def_sno2_num_typ(row, info);
		if(combo == columnDtl_def_sno2_ptn_cd) return getDtl_def_sno2_ptn_cd(row, info);
		if(combo == columnDtl_def_sno3_mng_typ) return getDtl_def_sno3_mng_typ(row, info);
		if(combo == columnDtl_def_sno3_num_typ) return getDtl_def_sno3_num_typ(row, info);
		if(combo == columnDtl_def_sno3_ptn_cd) return getDtl_def_sno3_ptn_cd(row, info);
		if(combo == columnDtl_def_sno4_mng_typ) return getDtl_def_sno4_mng_typ(row, info);
		if(combo == columnDtl_def_sno4_num_typ) return getDtl_def_sno4_num_typ(row, info);
		if(combo == columnDtl_def_sno4_ptn_cd) return getDtl_def_sno4_ptn_cd(row, info);
		if(combo == columnDtl_def_mrkt_judg_role_cd) return getDtl_def_mrkt_judg_role_cd(row, info);
		if(combo == columnDtl_def_mrkt_judg_upd_role_cd) return getDtl_def_mrkt_judg_upd_role_cd(row, info);
		if(combo == columnDtl_def_plnt_aprv_role_cd) return getDtl_def_plnt_aprv_role_cd(row, info);
		if(combo == columnDtl_def_insp_aprv_role_cd) return getDtl_def_insp_aprv_role_cd(row, info);
		if(combo == columnDtl_def_mfg_aprv_role_cd) return getDtl_def_mfg_aprv_role_cd(row, info);
		if(combo == columnDtl_def_sno_typ1) return getDtl_def_sno_typ1(row, info);
		if(combo == columnDtl_def_sno_typ2) return getDtl_def_sno_typ2(row, info);
		if(combo == columnDtl_def_sno_typ3) return getDtl_def_sno_typ3(row, info);
		if(combo == columnDtl_def_sno_typ4) return getDtl_def_sno_typ4(row, info);
		if(combo == columnDtl_def_alloc_ctl_typ) return getDtl_def_alloc_ctl_typ(row, info);
		if(combo == columnDtl_def_inpt_ctl_typ) return getDtl_def_inpt_ctl_typ(row, info);
		if(combo == columnDtl_def_bkf_typ) return getDtl_def_bkf_typ(row, info);
		if(combo == columnDtl_def_calc_ptn_cd) return getDtl_def_calc_ptn_cd(row, info);
		if(combo == columnLcl_itm_typ) return getLcl_itm_typ(row, info);
		if(combo == columnLcl_itm_typ_d_cd) return getLcl_itm_typ_d_cd(row, info);
		if(combo == columnLcl_lcl_cd) return getLcl_lcl_cd(row, info);
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
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == LclBtn_select_all) doLclBtn_select_all(info);
		else if (ap == LclBtn_deselect_all) doLclBtn_deselect_all(info);
		else if (ap == LclBtn_radd) doLclBtn_radd(info);
		else if (ap == LclBtn_rdel) doLclBtn_rdel(info);
		else if (ap == LclBtn_rcopy) doLclBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_select_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_radd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rdel(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_select_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_deselect_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_radd(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rdel(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rcopy(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm_lcl) return doDtl_itm_typ_d_nm_lcl_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_def_sls_flg) return doDtl_def_sls_flg_VC(info);
		if (vc == columnDtl_def_mfg_flg) return doDtl_def_mfg_flg_VC(info);
		if (vc == columnDtl_def_purc_flg) return doDtl_def_purc_flg_VC(info);
		if (vc == columnDtl_def_insp_flg) return doDtl_def_insp_flg_VC(info);
		if (vc == columnDtl_def_itm_jnl_cd) return doDtl_def_itm_jnl_cd_VC(info);
		if (vc == columnDtl_def_itm_jnl_nm) return doDtl_def_itm_jnl_nm_VC(info);
		if (vc == columnDtl_def_ac_itm_grp_cd) return doDtl_def_ac_itm_grp_cd_VC(info);
		if (vc == columnDtl_def_ac_itm_grp_nm) return doDtl_def_ac_itm_grp_nm_VC(info);
		if (vc == columnDtl_def_minus_stk_flg) return doDtl_def_minus_stk_flg_VC(info);
		if (vc == columnDtl_def_lot_mng_typ) return doDtl_def_lot_mng_typ_VC(info);
		if (vc == columnDtl_def_lot_mng_typ_nm) return doDtl_def_lot_mng_typ_nm_VC(info);
		if (vc == columnDtl_def_lot_no_typ) return doDtl_def_lot_no_typ_VC(info);
		if (vc == columnDtl_def_lot_no_typ_nm) return doDtl_def_lot_no_typ_nm_VC(info);
		if (vc == columnDtl_def_lot_no_ptn_cd) return doDtl_def_lot_no_ptn_cd_VC(info);
		if (vc == columnDtl_def_lot_no_ptn_nm) return doDtl_def_lot_no_ptn_nm_VC(info);
		if (vc == columnDtl_def_sublot_mng_typ) return doDtl_def_sublot_mng_typ_VC(info);
		if (vc == columnDtl_def_sublot_mng_typ_nm) return doDtl_def_sublot_mng_typ_nm_VC(info);
		if (vc == columnDtl_def_sublot_no_typ) return doDtl_def_sublot_no_typ_VC(info);
		if (vc == columnDtl_def_sublot_no_typ_nm) return doDtl_def_sublot_no_typ_nm_VC(info);
		if (vc == columnDtl_def_sublot_no_ptn_cd) return doDtl_def_sublot_no_ptn_cd_VC(info);
		if (vc == columnDtl_def_sublot_no_ptn_nm) return doDtl_def_sublot_no_ptn_nm_VC(info);
		if (vc == columnDtl_def_bp_lot_flg) return doDtl_def_bp_lot_flg_VC(info);
		if (vc == columnDtl_def_not_new_lot_flg) return doDtl_def_not_new_lot_flg_VC(info);
		if (vc == columnDtl_def_gi_alloc_flg) return doDtl_def_gi_alloc_flg_VC(info);
		if (vc == columnDtl_def_pack_alloc_flg) return doDtl_def_pack_alloc_flg_VC(info);
		if (vc == columnDtl_def_comp_spec_typ) return doDtl_def_comp_spec_typ_VC(info);
		if (vc == columnDtl_def_comp_spec_typ_nm) return doDtl_def_comp_spec_typ_nm_VC(info);
		if (vc == columnDtl_def_comp_rev_at_slo_flg) return doDtl_def_comp_rev_at_slo_flg_VC(info);
		if (vc == columnDtl_def_comp_core_itm_flg) return doDtl_def_comp_core_itm_flg_VC(info);
		if (vc == columnDtl_def_itm_spec_grp_cd) return doDtl_def_itm_spec_grp_cd_VC(info);
		if (vc == columnDtl_def_itm_spec_grp_nm) return doDtl_def_itm_spec_grp_nm_VC(info);
		if (vc == columnDtl_def_insp_bind_typ) return doDtl_def_insp_bind_typ_VC(info);
		if (vc == columnDtl_def_insp_bind_typ_nm) return doDtl_def_insp_bind_typ_nm_VC(info);
		if (vc == columnDtl_def_skip_chk_ship_flg) return doDtl_def_skip_chk_ship_flg_VC(info);
		if (vc == columnDtl_def_lmt_ctl_flg) return doDtl_def_lmt_ctl_flg_VC(info);
		if (vc == columnDtl_def_lmt_ctl_categ) return doDtl_def_lmt_ctl_categ_VC(info);
		if (vc == columnDtl_def_ship_lot_back_stop_flg) return doDtl_def_ship_lot_back_stop_flg_VC(info);
		if (vc == columnDtl_def_ship_valid_grp_cd) return doDtl_def_ship_valid_grp_cd_VC(info);
		if (vc == columnDtl_def_ship_valid_grp_nm) return doDtl_def_ship_valid_grp_nm_VC(info);
		if (vc == columnDtl_def_sls_upri_grp_cd) return doDtl_def_sls_upri_grp_cd_VC(info);
		if (vc == columnDtl_def_sls_upri_grp_nm) return doDtl_def_sls_upri_grp_nm_VC(info);
		if (vc == columnDtl_def_slo_proc_flg) return doDtl_def_slo_proc_flg_VC(info);
		if (vc == columnDtl_def_slo_proc_typ) return doDtl_def_slo_proc_typ_VC(info);
		if (vc == columnDtl_def_slo_proc_typ_nm) return doDtl_def_slo_proc_typ_nm_VC(info);
		if (vc == columnDtl_def_ship_inst_typ) return doDtl_def_ship_inst_typ_VC(info);
		if (vc == columnDtl_def_ship_inst_typ_nm) return doDtl_def_ship_inst_typ_nm_VC(info);
		if (vc == columnDtl_def_itm_ship_grp_cd) return doDtl_def_itm_ship_grp_cd_VC(info);
		if (vc == columnDtl_def_itm_ship_grp_nm) return doDtl_def_itm_ship_grp_nm_VC(info);
		if (vc == columnDtl_def_arr_skip_flg) return doDtl_def_arr_skip_flg_VC(info);
		if (vc == columnDtl_def_ship_term_cd) return doDtl_def_ship_term_cd_VC(info);
		if (vc == columnDtl_def_ship_term_nm) return doDtl_def_ship_term_nm_VC(info);
		if (vc == columnDtl_def_stk_lst_flg) return doDtl_def_stk_lst_flg_VC(info);
		if (vc == columnDtl_def_ver_flg) return doDtl_def_ver_flg_VC(info);
		if (vc == columnDtl_def_mfg_inst_unit_typ) return doDtl_def_mfg_inst_unit_typ_VC(info);
		if (vc == columnDtl_def_mfg_inst_unit_typ_nm) return doDtl_def_mfg_inst_unit_typ_nm_VC(info);
		if (vc == columnDtl_def_sls_upri_cng_flg) return doDtl_def_sls_upri_cng_flg_VC(info);
		if (vc == columnDtl_def_purc_upri_cng_flg) return doDtl_def_purc_upri_cng_flg_VC(info);
		if (vc == columnDtl_def_prov_upri_cng_flg) return doDtl_def_prov_upri_cng_flg_VC(info);
		if (vc == columnDtl_def_mrp_proc_typ) return doDtl_def_mrp_proc_typ_VC(info);
		if (vc == columnDtl_def_mrp_proc_typ_nm) return doDtl_def_mrp_proc_typ_nm_VC(info);
		if (vc == columnDtl_def_rqmt_typ) return doDtl_def_rqmt_typ_VC(info);
		if (vc == columnDtl_def_rqmt_typ_nm) return doDtl_def_rqmt_typ_nm_VC(info);
		if (vc == columnDtl_def_prod_pln_typ) return doDtl_def_prod_pln_typ_VC(info);
		if (vc == columnDtl_def_prod_pln_typ_nm) return doDtl_def_prod_pln_typ_nm_VC(info);
		if (vc == columnDtl_def_dmnd_date_div_mons) return doDtl_def_dmnd_date_div_mons_VC(info);
		if (vc == columnDtl_def_alloc_margin_days) return doDtl_def_alloc_margin_days_VC(info);
		if (vc == columnDtl_def_mrp_alloc_margin_days) return doDtl_def_mrp_alloc_margin_days_VC(info);
		if (vc == columnDtl_def_mrp_opn_xfr_days) return doDtl_def_mrp_opn_xfr_days_VC(info);
		if (vc == columnDtl_def_inpt_itm_add_flg) return doDtl_def_inpt_itm_add_flg_VC(info);
		if (vc == columnDtl_def_inpt_itm_del_flg) return doDtl_def_inpt_itm_del_flg_VC(info);
		if (vc == columnDtl_def_sch_flg) return doDtl_def_sch_flg_VC(info);
		if (vc == columnDtl_def_sno1_mng_typ) return doDtl_def_sno1_mng_typ_VC(info);
		if (vc == columnDtl_def_sno1_mng_typ_nm) return doDtl_def_sno1_mng_typ_nm_VC(info);
		if (vc == columnDtl_def_slo_sno1_flg) return doDtl_def_slo_sno1_flg_VC(info);
		if (vc == columnDtl_def_rqmt_sno1_flg) return doDtl_def_rqmt_sno1_flg_VC(info);
		if (vc == columnDtl_def_sno1_num_typ) return doDtl_def_sno1_num_typ_VC(info);
		if (vc == columnDtl_def_sno1_num_typ_nm) return doDtl_def_sno1_num_typ_nm_VC(info);
		if (vc == columnDtl_def_sno1_ptn_cd) return doDtl_def_sno1_ptn_cd_VC(info);
		if (vc == columnDtl_def_sno1_ptn_nm) return doDtl_def_sno1_ptn_nm_VC(info);
		if (vc == columnDtl_def_sno2_mng_typ) return doDtl_def_sno2_mng_typ_VC(info);
		if (vc == columnDtl_def_sno2_mng_typ_nm) return doDtl_def_sno2_mng_typ_nm_VC(info);
		if (vc == columnDtl_def_slo_sno2_flg) return doDtl_def_slo_sno2_flg_VC(info);
		if (vc == columnDtl_def_rqmt_sno2_flg) return doDtl_def_rqmt_sno2_flg_VC(info);
		if (vc == columnDtl_def_sno2_num_typ) return doDtl_def_sno2_num_typ_VC(info);
		if (vc == columnDtl_def_sno2_num_typ_nm) return doDtl_def_sno2_num_typ_nm_VC(info);
		if (vc == columnDtl_def_sno2_ptn_cd) return doDtl_def_sno2_ptn_cd_VC(info);
		if (vc == columnDtl_def_sno2_ptn_nm) return doDtl_def_sno2_ptn_nm_VC(info);
		if (vc == columnDtl_def_sno3_mng_typ) return doDtl_def_sno3_mng_typ_VC(info);
		if (vc == columnDtl_def_sno3_mng_typ_nm) return doDtl_def_sno3_mng_typ_nm_VC(info);
		if (vc == columnDtl_def_slo_sno3_flg) return doDtl_def_slo_sno3_flg_VC(info);
		if (vc == columnDtl_def_rqmt_sno3_flg) return doDtl_def_rqmt_sno3_flg_VC(info);
		if (vc == columnDtl_def_sno3_num_typ) return doDtl_def_sno3_num_typ_VC(info);
		if (vc == columnDtl_def_sno3_num_typ_nm) return doDtl_def_sno3_num_typ_nm_VC(info);
		if (vc == columnDtl_def_sno3_ptn_cd) return doDtl_def_sno3_ptn_cd_VC(info);
		if (vc == columnDtl_def_sno3_ptn_nm) return doDtl_def_sno3_ptn_nm_VC(info);
		if (vc == columnDtl_def_sno4_mng_typ) return doDtl_def_sno4_mng_typ_VC(info);
		if (vc == columnDtl_def_sno4_mng_typ_nm) return doDtl_def_sno4_mng_typ_nm_VC(info);
		if (vc == columnDtl_def_slo_sno4_flg) return doDtl_def_slo_sno4_flg_VC(info);
		if (vc == columnDtl_def_rqmt_sno4_flg) return doDtl_def_rqmt_sno4_flg_VC(info);
		if (vc == columnDtl_def_sno4_num_typ) return doDtl_def_sno4_num_typ_VC(info);
		if (vc == columnDtl_def_sno4_num_typ_nm) return doDtl_def_sno4_num_typ_nm_VC(info);
		if (vc == columnDtl_def_sno4_ptn_cd) return doDtl_def_sno4_ptn_cd_VC(info);
		if (vc == columnDtl_def_sno4_ptn_nm) return doDtl_def_sno4_ptn_nm_VC(info);
		if (vc == columnDtl_def_mrkt_judg_flg) return doDtl_def_mrkt_judg_flg_VC(info);
		if (vc == columnDtl_def_mrkt_judg_role_cd) return doDtl_def_mrkt_judg_role_cd_VC(info);
		if (vc == columnDtl_def_mrkt_judg_role_nm) return doDtl_def_mrkt_judg_role_nm_VC(info);
		if (vc == columnDtl_def_mrkt_judg_upd_role_cd) return doDtl_def_mrkt_judg_upd_role_cd_VC(info);
		if (vc == columnDtl_def_mrkt_judg_upd_role_nm) return doDtl_def_mrkt_judg_upd_role_nm_VC(info);
		if (vc == columnDtl_def_plnt_aprv_flg) return doDtl_def_plnt_aprv_flg_VC(info);
		if (vc == columnDtl_def_plnt_aprv_role_cd) return doDtl_def_plnt_aprv_role_cd_VC(info);
		if (vc == columnDtl_def_plnt_aprv_role_nm) return doDtl_def_plnt_aprv_role_nm_VC(info);
		if (vc == columnDtl_def_insp_aprv_flg) return doDtl_def_insp_aprv_flg_VC(info);
		if (vc == columnDtl_def_insp_aprv_role_cd) return doDtl_def_insp_aprv_role_cd_VC(info);
		if (vc == columnDtl_def_insp_aprv_role_nm) return doDtl_def_insp_aprv_role_nm_VC(info);
		if (vc == columnDtl_def_mfg_aprv_flg) return doDtl_def_mfg_aprv_flg_VC(info);
		if (vc == columnDtl_def_mfg_aprv_role_cd) return doDtl_def_mfg_aprv_role_cd_VC(info);
		if (vc == columnDtl_def_mfg_aprv_role_nm) return doDtl_def_mfg_aprv_role_nm_VC(info);
		if (vc == columnDtl_def_sno_typ1) return doDtl_def_sno_typ1_VC(info);
		if (vc == columnDtl_def_sno_typ_nm1) return doDtl_def_sno_typ_nm1_VC(info);
		if (vc == columnDtl_def_sno_typ2) return doDtl_def_sno_typ2_VC(info);
		if (vc == columnDtl_def_sno_typ_nm2) return doDtl_def_sno_typ_nm2_VC(info);
		if (vc == columnDtl_def_sno_typ3) return doDtl_def_sno_typ3_VC(info);
		if (vc == columnDtl_def_sno_typ_nm3) return doDtl_def_sno_typ_nm3_VC(info);
		if (vc == columnDtl_def_sno_typ4) return doDtl_def_sno_typ4_VC(info);
		if (vc == columnDtl_def_sno_typ_nm4) return doDtl_def_sno_typ_nm4_VC(info);
		if (vc == columnDtl_def_byprod_flg) return doDtl_def_byprod_flg_VC(info);
		if (vc == columnDtl_def_inst_lot_fix_flg) return doDtl_def_inst_lot_fix_flg_VC(info);
		if (vc == columnDtl_def_lot_mix_flg) return doDtl_def_lot_mix_flg_VC(info);
		if (vc == columnDtl_def_sublot_mix_flg) return doDtl_def_sublot_mix_flg_VC(info);
		if (vc == columnDtl_def_alloc_ctl_typ) return doDtl_def_alloc_ctl_typ_VC(info);
		if (vc == columnDtl_def_alloc_ctl_typ_nm) return doDtl_def_alloc_ctl_typ_nm_VC(info);
		if (vc == columnDtl_def_inpt_ctl_typ) return doDtl_def_inpt_ctl_typ_VC(info);
		if (vc == columnDtl_def_inpt_ctl_typ_nm) return doDtl_def_inpt_ctl_typ_nm_VC(info);
		if (vc == columnDtl_def_bkf_typ) return doDtl_def_bkf_typ_VC(info);
		if (vc == columnDtl_def_bkf_typ_nm) return doDtl_def_bkf_typ_nm_VC(info);
		if (vc == columnDtl_def_main_itm_flg) return doDtl_def_main_itm_flg_VC(info);
		if (vc == columnDtl_def_not_cost_bom_flg) return doDtl_def_not_cost_bom_flg_VC(info);
		if (vc == columnDtl_def_calc_ptn_cd) return doDtl_def_calc_ptn_cd_VC(info);
		if (vc == columnDtl_def_calc_ptn_nm) return doDtl_def_calc_ptn_nm_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
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
		if (vc == columnLcl_check) return doLcl_check_VC(info);
		if (vc == columnLcl_itm_typ) return doLcl_itm_typ_VC(info);
		if (vc == columnLcl_itm_typ_nm) return doLcl_itm_typ_nm_VC(info);
		if (vc == columnLcl_itm_typ_d_cd) return doLcl_itm_typ_d_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_itm_typ_d_nm) return doLcl_itm_typ_d_nm_VC(info);
		if (vc == columnLcl_memo1) return doLcl_memo1_VC(info);
		if (vc == columnLcl_memo2) return doLcl_memo2_VC(info);
		if (vc == columnLcl_memo3) return doLcl_memo3_VC(info);
		if (vc == columnLcl_ins_usr_id) return doLcl_ins_usr_id_VC(info);
		if (vc == columnLcl_ins_usr_nm) return doLcl_ins_usr_nm_VC(info);
		if (vc == columnLcl_ins_ts) return doLcl_ins_ts_VC(info);
		if (vc == columnLcl_ins_func_id) return doLcl_ins_func_id_VC(info);
		if (vc == columnLcl_ins_func_nm) return doLcl_ins_func_nm_VC(info);
		if (vc == columnLcl_upd_cntr) return doLcl_upd_cntr_VC(info);
		if (vc == columnLcl_upd_usr_id) return doLcl_upd_usr_id_VC(info);
		if (vc == columnLcl_upd_usr_nm) return doLcl_upd_usr_nm_VC(info);
		if (vc == columnLcl_upd_ts) return doLcl_upd_ts_VC(info);
		if (vc == columnLcl_upd_func_id) return doLcl_upd_func_id_VC(info);
		if (vc == columnLcl_upd_func_nm) return doLcl_upd_func_nm_VC(info);
		if (vc == columnLcl_upd_srv_req_no) return doLcl_upd_srv_req_no_VC(info);
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
	 * [Lcl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMst_mst_set_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo3_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_typ_d_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_nm_lcl_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[def_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mfg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mfg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_ac_itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_ac_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_ac_itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_ac_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_minus_stk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_minus_stk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_lot_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_lot_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_lot_no_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_lot_no_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_lot_no_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_lot_no_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_lot_no_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_lot_no_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sublot_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sublot_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sublot_no_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sublot_no_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sublot_no_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_bp_lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_bp_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_not_new_lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_not_new_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_gi_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_gi_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_pack_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_pack_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_comp_spec_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_comp_spec_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_comp_spec_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_comp_spec_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_comp_rev_at_slo_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_comp_rev_at_slo_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_comp_core_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_comp_core_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_itm_spec_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_itm_spec_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_itm_spec_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_itm_spec_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_insp_bind_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_insp_bind_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_insp_bind_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_insp_bind_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_skip_chk_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_skip_chk_ship_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_lmt_ctl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_lmt_ctl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_lmt_ctl_categ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_lmt_ctl_categ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_ship_lot_back_stop_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_ship_lot_back_stop_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_ship_valid_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_ship_valid_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_ship_valid_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_ship_valid_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sls_upri_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sls_upri_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_slo_proc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_slo_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_slo_proc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_ship_inst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_ship_inst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_ship_inst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_ship_inst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_itm_ship_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_itm_ship_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_itm_ship_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_itm_ship_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_arr_skip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_arr_skip_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_ship_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_ship_term_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_stk_lst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_stk_lst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mfg_inst_unit_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mfg_inst_unit_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mfg_inst_unit_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mfg_inst_unit_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sls_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_purc_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_purc_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_prov_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_prov_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mrp_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mrp_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mrp_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mrp_proc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_rqmt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_rqmt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_rqmt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_rqmt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_prod_pln_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_prod_pln_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_prod_pln_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_prod_pln_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_dmnd_date_div_mons]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_dmnd_date_div_mons_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_alloc_margin_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_alloc_margin_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mrp_alloc_margin_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mrp_alloc_margin_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mrp_opn_xfr_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mrp_opn_xfr_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_inpt_itm_add_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_inpt_itm_add_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_inpt_itm_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_inpt_itm_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sch_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sch_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno1_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno1_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_slo_sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_slo_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_rqmt_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno1_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno1_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno1_num_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno1_num_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno1_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno1_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno1_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno1_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno2_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno2_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_slo_sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_slo_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_rqmt_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno2_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno2_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno2_num_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno2_num_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno2_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno2_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno2_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno2_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno3_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno3_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_slo_sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_slo_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_rqmt_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno3_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno3_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno3_num_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno3_num_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno3_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno3_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno3_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno3_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno4_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno4_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_slo_sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_slo_sno4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_rqmt_sno4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno4_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno4_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno4_num_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno4_num_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno4_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno4_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno4_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno4_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mrkt_judg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mrkt_judg_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mrkt_judg_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_upd_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mrkt_judg_upd_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_upd_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mrkt_judg_upd_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_plnt_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_plnt_aprv_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_plnt_aprv_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_insp_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_insp_aprv_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_insp_aprv_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mfg_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mfg_aprv_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_mfg_aprv_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno_typ_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno_typ2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno_typ_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno_typ3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno_typ3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno_typ_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno_typ4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno_typ4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sno_typ_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_byprod_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_byprod_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_inst_lot_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_inst_lot_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_lot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_lot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_sublot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_sublot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_alloc_ctl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_alloc_ctl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_alloc_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_alloc_ctl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_inpt_ctl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_inpt_ctl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_inpt_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_inpt_ctl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_bkf_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_bkf_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_bkf_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_bkf_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_main_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_main_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_not_cost_bom_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_not_cost_bom_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_calc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_calc_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_calc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_calc_ptn_nm_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm_lcl) doDtl_itm_typ_d_nm_lcl_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_def_sls_flg) doDtl_def_sls_flg_NC(info);
		else if (nc == columnDtl_def_mfg_flg) doDtl_def_mfg_flg_NC(info);
		else if (nc == columnDtl_def_purc_flg) doDtl_def_purc_flg_NC(info);
		else if (nc == columnDtl_def_insp_flg) doDtl_def_insp_flg_NC(info);
		else if (nc == columnDtl_def_itm_jnl_cd) doDtl_def_itm_jnl_cd_NC(info);
		else if (nc == columnDtl_def_itm_jnl_nm) doDtl_def_itm_jnl_nm_NC(info);
		else if (nc == columnDtl_def_ac_itm_grp_cd) doDtl_def_ac_itm_grp_cd_NC(info);
		else if (nc == columnDtl_def_ac_itm_grp_nm) doDtl_def_ac_itm_grp_nm_NC(info);
		else if (nc == columnDtl_def_minus_stk_flg) doDtl_def_minus_stk_flg_NC(info);
		else if (nc == columnDtl_def_lot_mng_typ) doDtl_def_lot_mng_typ_NC(info);
		else if (nc == columnDtl_def_lot_mng_typ_nm) doDtl_def_lot_mng_typ_nm_NC(info);
		else if (nc == columnDtl_def_lot_no_typ) doDtl_def_lot_no_typ_NC(info);
		else if (nc == columnDtl_def_lot_no_typ_nm) doDtl_def_lot_no_typ_nm_NC(info);
		else if (nc == columnDtl_def_lot_no_ptn_cd) doDtl_def_lot_no_ptn_cd_NC(info);
		else if (nc == columnDtl_def_lot_no_ptn_nm) doDtl_def_lot_no_ptn_nm_NC(info);
		else if (nc == columnDtl_def_sublot_mng_typ) doDtl_def_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_def_sublot_mng_typ_nm) doDtl_def_sublot_mng_typ_nm_NC(info);
		else if (nc == columnDtl_def_sublot_no_typ) doDtl_def_sublot_no_typ_NC(info);
		else if (nc == columnDtl_def_sublot_no_typ_nm) doDtl_def_sublot_no_typ_nm_NC(info);
		else if (nc == columnDtl_def_sublot_no_ptn_cd) doDtl_def_sublot_no_ptn_cd_NC(info);
		else if (nc == columnDtl_def_sublot_no_ptn_nm) doDtl_def_sublot_no_ptn_nm_NC(info);
		else if (nc == columnDtl_def_bp_lot_flg) doDtl_def_bp_lot_flg_NC(info);
		else if (nc == columnDtl_def_not_new_lot_flg) doDtl_def_not_new_lot_flg_NC(info);
		else if (nc == columnDtl_def_gi_alloc_flg) doDtl_def_gi_alloc_flg_NC(info);
		else if (nc == columnDtl_def_pack_alloc_flg) doDtl_def_pack_alloc_flg_NC(info);
		else if (nc == columnDtl_def_comp_spec_typ) doDtl_def_comp_spec_typ_NC(info);
		else if (nc == columnDtl_def_comp_spec_typ_nm) doDtl_def_comp_spec_typ_nm_NC(info);
		else if (nc == columnDtl_def_comp_rev_at_slo_flg) doDtl_def_comp_rev_at_slo_flg_NC(info);
		else if (nc == columnDtl_def_comp_core_itm_flg) doDtl_def_comp_core_itm_flg_NC(info);
		else if (nc == columnDtl_def_itm_spec_grp_cd) doDtl_def_itm_spec_grp_cd_NC(info);
		else if (nc == columnDtl_def_itm_spec_grp_nm) doDtl_def_itm_spec_grp_nm_NC(info);
		else if (nc == columnDtl_def_insp_bind_typ) doDtl_def_insp_bind_typ_NC(info);
		else if (nc == columnDtl_def_insp_bind_typ_nm) doDtl_def_insp_bind_typ_nm_NC(info);
		else if (nc == columnDtl_def_skip_chk_ship_flg) doDtl_def_skip_chk_ship_flg_NC(info);
		else if (nc == columnDtl_def_lmt_ctl_flg) doDtl_def_lmt_ctl_flg_NC(info);
		else if (nc == columnDtl_def_lmt_ctl_categ) doDtl_def_lmt_ctl_categ_NC(info);
		else if (nc == columnDtl_def_ship_lot_back_stop_flg) doDtl_def_ship_lot_back_stop_flg_NC(info);
		else if (nc == columnDtl_def_ship_valid_grp_cd) doDtl_def_ship_valid_grp_cd_NC(info);
		else if (nc == columnDtl_def_ship_valid_grp_nm) doDtl_def_ship_valid_grp_nm_NC(info);
		else if (nc == columnDtl_def_sls_upri_grp_cd) doDtl_def_sls_upri_grp_cd_NC(info);
		else if (nc == columnDtl_def_sls_upri_grp_nm) doDtl_def_sls_upri_grp_nm_NC(info);
		else if (nc == columnDtl_def_slo_proc_flg) doDtl_def_slo_proc_flg_NC(info);
		else if (nc == columnDtl_def_slo_proc_typ) doDtl_def_slo_proc_typ_NC(info);
		else if (nc == columnDtl_def_slo_proc_typ_nm) doDtl_def_slo_proc_typ_nm_NC(info);
		else if (nc == columnDtl_def_ship_inst_typ) doDtl_def_ship_inst_typ_NC(info);
		else if (nc == columnDtl_def_ship_inst_typ_nm) doDtl_def_ship_inst_typ_nm_NC(info);
		else if (nc == columnDtl_def_itm_ship_grp_cd) doDtl_def_itm_ship_grp_cd_NC(info);
		else if (nc == columnDtl_def_itm_ship_grp_nm) doDtl_def_itm_ship_grp_nm_NC(info);
		else if (nc == columnDtl_def_arr_skip_flg) doDtl_def_arr_skip_flg_NC(info);
		else if (nc == columnDtl_def_ship_term_cd) doDtl_def_ship_term_cd_NC(info);
		else if (nc == columnDtl_def_ship_term_nm) doDtl_def_ship_term_nm_NC(info);
		else if (nc == columnDtl_def_stk_lst_flg) doDtl_def_stk_lst_flg_NC(info);
		else if (nc == columnDtl_def_ver_flg) doDtl_def_ver_flg_NC(info);
		else if (nc == columnDtl_def_mfg_inst_unit_typ) doDtl_def_mfg_inst_unit_typ_NC(info);
		else if (nc == columnDtl_def_mfg_inst_unit_typ_nm) doDtl_def_mfg_inst_unit_typ_nm_NC(info);
		else if (nc == columnDtl_def_sls_upri_cng_flg) doDtl_def_sls_upri_cng_flg_NC(info);
		else if (nc == columnDtl_def_purc_upri_cng_flg) doDtl_def_purc_upri_cng_flg_NC(info);
		else if (nc == columnDtl_def_prov_upri_cng_flg) doDtl_def_prov_upri_cng_flg_NC(info);
		else if (nc == columnDtl_def_mrp_proc_typ) doDtl_def_mrp_proc_typ_NC(info);
		else if (nc == columnDtl_def_mrp_proc_typ_nm) doDtl_def_mrp_proc_typ_nm_NC(info);
		else if (nc == columnDtl_def_rqmt_typ) doDtl_def_rqmt_typ_NC(info);
		else if (nc == columnDtl_def_rqmt_typ_nm) doDtl_def_rqmt_typ_nm_NC(info);
		else if (nc == columnDtl_def_prod_pln_typ) doDtl_def_prod_pln_typ_NC(info);
		else if (nc == columnDtl_def_prod_pln_typ_nm) doDtl_def_prod_pln_typ_nm_NC(info);
		else if (nc == columnDtl_def_dmnd_date_div_mons) doDtl_def_dmnd_date_div_mons_NC(info);
		else if (nc == columnDtl_def_alloc_margin_days) doDtl_def_alloc_margin_days_NC(info);
		else if (nc == columnDtl_def_mrp_alloc_margin_days) doDtl_def_mrp_alloc_margin_days_NC(info);
		else if (nc == columnDtl_def_mrp_opn_xfr_days) doDtl_def_mrp_opn_xfr_days_NC(info);
		else if (nc == columnDtl_def_inpt_itm_add_flg) doDtl_def_inpt_itm_add_flg_NC(info);
		else if (nc == columnDtl_def_inpt_itm_del_flg) doDtl_def_inpt_itm_del_flg_NC(info);
		else if (nc == columnDtl_def_sch_flg) doDtl_def_sch_flg_NC(info);
		else if (nc == columnDtl_def_sno1_mng_typ) doDtl_def_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_def_sno1_mng_typ_nm) doDtl_def_sno1_mng_typ_nm_NC(info);
		else if (nc == columnDtl_def_slo_sno1_flg) doDtl_def_slo_sno1_flg_NC(info);
		else if (nc == columnDtl_def_rqmt_sno1_flg) doDtl_def_rqmt_sno1_flg_NC(info);
		else if (nc == columnDtl_def_sno1_num_typ) doDtl_def_sno1_num_typ_NC(info);
		else if (nc == columnDtl_def_sno1_num_typ_nm) doDtl_def_sno1_num_typ_nm_NC(info);
		else if (nc == columnDtl_def_sno1_ptn_cd) doDtl_def_sno1_ptn_cd_NC(info);
		else if (nc == columnDtl_def_sno1_ptn_nm) doDtl_def_sno1_ptn_nm_NC(info);
		else if (nc == columnDtl_def_sno2_mng_typ) doDtl_def_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_def_sno2_mng_typ_nm) doDtl_def_sno2_mng_typ_nm_NC(info);
		else if (nc == columnDtl_def_slo_sno2_flg) doDtl_def_slo_sno2_flg_NC(info);
		else if (nc == columnDtl_def_rqmt_sno2_flg) doDtl_def_rqmt_sno2_flg_NC(info);
		else if (nc == columnDtl_def_sno2_num_typ) doDtl_def_sno2_num_typ_NC(info);
		else if (nc == columnDtl_def_sno2_num_typ_nm) doDtl_def_sno2_num_typ_nm_NC(info);
		else if (nc == columnDtl_def_sno2_ptn_cd) doDtl_def_sno2_ptn_cd_NC(info);
		else if (nc == columnDtl_def_sno2_ptn_nm) doDtl_def_sno2_ptn_nm_NC(info);
		else if (nc == columnDtl_def_sno3_mng_typ) doDtl_def_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_def_sno3_mng_typ_nm) doDtl_def_sno3_mng_typ_nm_NC(info);
		else if (nc == columnDtl_def_slo_sno3_flg) doDtl_def_slo_sno3_flg_NC(info);
		else if (nc == columnDtl_def_rqmt_sno3_flg) doDtl_def_rqmt_sno3_flg_NC(info);
		else if (nc == columnDtl_def_sno3_num_typ) doDtl_def_sno3_num_typ_NC(info);
		else if (nc == columnDtl_def_sno3_num_typ_nm) doDtl_def_sno3_num_typ_nm_NC(info);
		else if (nc == columnDtl_def_sno3_ptn_cd) doDtl_def_sno3_ptn_cd_NC(info);
		else if (nc == columnDtl_def_sno3_ptn_nm) doDtl_def_sno3_ptn_nm_NC(info);
		else if (nc == columnDtl_def_sno4_mng_typ) doDtl_def_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_def_sno4_mng_typ_nm) doDtl_def_sno4_mng_typ_nm_NC(info);
		else if (nc == columnDtl_def_slo_sno4_flg) doDtl_def_slo_sno4_flg_NC(info);
		else if (nc == columnDtl_def_rqmt_sno4_flg) doDtl_def_rqmt_sno4_flg_NC(info);
		else if (nc == columnDtl_def_sno4_num_typ) doDtl_def_sno4_num_typ_NC(info);
		else if (nc == columnDtl_def_sno4_num_typ_nm) doDtl_def_sno4_num_typ_nm_NC(info);
		else if (nc == columnDtl_def_sno4_ptn_cd) doDtl_def_sno4_ptn_cd_NC(info);
		else if (nc == columnDtl_def_sno4_ptn_nm) doDtl_def_sno4_ptn_nm_NC(info);
		else if (nc == columnDtl_def_mrkt_judg_flg) doDtl_def_mrkt_judg_flg_NC(info);
		else if (nc == columnDtl_def_mrkt_judg_role_cd) doDtl_def_mrkt_judg_role_cd_NC(info);
		else if (nc == columnDtl_def_mrkt_judg_role_nm) doDtl_def_mrkt_judg_role_nm_NC(info);
		else if (nc == columnDtl_def_mrkt_judg_upd_role_cd) doDtl_def_mrkt_judg_upd_role_cd_NC(info);
		else if (nc == columnDtl_def_mrkt_judg_upd_role_nm) doDtl_def_mrkt_judg_upd_role_nm_NC(info);
		else if (nc == columnDtl_def_plnt_aprv_flg) doDtl_def_plnt_aprv_flg_NC(info);
		else if (nc == columnDtl_def_plnt_aprv_role_cd) doDtl_def_plnt_aprv_role_cd_NC(info);
		else if (nc == columnDtl_def_plnt_aprv_role_nm) doDtl_def_plnt_aprv_role_nm_NC(info);
		else if (nc == columnDtl_def_insp_aprv_flg) doDtl_def_insp_aprv_flg_NC(info);
		else if (nc == columnDtl_def_insp_aprv_role_cd) doDtl_def_insp_aprv_role_cd_NC(info);
		else if (nc == columnDtl_def_insp_aprv_role_nm) doDtl_def_insp_aprv_role_nm_NC(info);
		else if (nc == columnDtl_def_mfg_aprv_flg) doDtl_def_mfg_aprv_flg_NC(info);
		else if (nc == columnDtl_def_mfg_aprv_role_cd) doDtl_def_mfg_aprv_role_cd_NC(info);
		else if (nc == columnDtl_def_mfg_aprv_role_nm) doDtl_def_mfg_aprv_role_nm_NC(info);
		else if (nc == columnDtl_def_sno_typ1) doDtl_def_sno_typ1_NC(info);
		else if (nc == columnDtl_def_sno_typ_nm1) doDtl_def_sno_typ_nm1_NC(info);
		else if (nc == columnDtl_def_sno_typ2) doDtl_def_sno_typ2_NC(info);
		else if (nc == columnDtl_def_sno_typ_nm2) doDtl_def_sno_typ_nm2_NC(info);
		else if (nc == columnDtl_def_sno_typ3) doDtl_def_sno_typ3_NC(info);
		else if (nc == columnDtl_def_sno_typ_nm3) doDtl_def_sno_typ_nm3_NC(info);
		else if (nc == columnDtl_def_sno_typ4) doDtl_def_sno_typ4_NC(info);
		else if (nc == columnDtl_def_sno_typ_nm4) doDtl_def_sno_typ_nm4_NC(info);
		else if (nc == columnDtl_def_byprod_flg) doDtl_def_byprod_flg_NC(info);
		else if (nc == columnDtl_def_inst_lot_fix_flg) doDtl_def_inst_lot_fix_flg_NC(info);
		else if (nc == columnDtl_def_lot_mix_flg) doDtl_def_lot_mix_flg_NC(info);
		else if (nc == columnDtl_def_sublot_mix_flg) doDtl_def_sublot_mix_flg_NC(info);
		else if (nc == columnDtl_def_alloc_ctl_typ) doDtl_def_alloc_ctl_typ_NC(info);
		else if (nc == columnDtl_def_alloc_ctl_typ_nm) doDtl_def_alloc_ctl_typ_nm_NC(info);
		else if (nc == columnDtl_def_inpt_ctl_typ) doDtl_def_inpt_ctl_typ_NC(info);
		else if (nc == columnDtl_def_inpt_ctl_typ_nm) doDtl_def_inpt_ctl_typ_nm_NC(info);
		else if (nc == columnDtl_def_bkf_typ) doDtl_def_bkf_typ_NC(info);
		else if (nc == columnDtl_def_bkf_typ_nm) doDtl_def_bkf_typ_nm_NC(info);
		else if (nc == columnDtl_def_main_itm_flg) doDtl_def_main_itm_flg_NC(info);
		else if (nc == columnDtl_def_not_cost_bom_flg) doDtl_def_not_cost_bom_flg_NC(info);
		else if (nc == columnDtl_def_calc_ptn_cd) doDtl_def_calc_ptn_cd_NC(info);
		else if (nc == columnDtl_def_calc_ptn_nm) doDtl_def_calc_ptn_nm_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
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
		else if (nc == columnLcl_check) doLcl_check_NC(info);
		else if (nc == columnLcl_itm_typ) doLcl_itm_typ_NC(info);
		else if (nc == columnLcl_itm_typ_nm) doLcl_itm_typ_nm_NC(info);
		else if (nc == columnLcl_itm_typ_d_cd) doLcl_itm_typ_d_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_itm_typ_d_nm) doLcl_itm_typ_d_nm_NC(info);
		else if (nc == columnLcl_memo1) doLcl_memo1_NC(info);
		else if (nc == columnLcl_memo2) doLcl_memo2_NC(info);
		else if (nc == columnLcl_memo3) doLcl_memo3_NC(info);
		else if (nc == columnLcl_ins_usr_id) doLcl_ins_usr_id_NC(info);
		else if (nc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NC(info);
		else if (nc == columnLcl_ins_ts) doLcl_ins_ts_NC(info);
		else if (nc == columnLcl_ins_func_id) doLcl_ins_func_id_NC(info);
		else if (nc == columnLcl_ins_func_nm) doLcl_ins_func_nm_NC(info);
		else if (nc == columnLcl_upd_cntr) doLcl_upd_cntr_NC(info);
		else if (nc == columnLcl_upd_usr_id) doLcl_upd_usr_id_NC(info);
		else if (nc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NC(info);
		else if (nc == columnLcl_upd_ts) doLcl_upd_ts_NC(info);
		else if (nc == columnLcl_upd_func_id) doLcl_upd_func_id_NC(info);
		else if (nc == columnLcl_upd_func_nm) doLcl_upd_func_nm_NC(info);
		else if (nc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NC(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_typ_d_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ac_itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ac_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ac_itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ac_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_minus_stk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_minus_stk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bp_lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bp_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_not_new_lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_not_new_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_gi_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_gi_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_pack_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_pack_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_spec_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_spec_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_spec_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_spec_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_rev_at_slo_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_rev_at_slo_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_core_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_core_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_spec_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_spec_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_spec_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_spec_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_bind_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_bind_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_bind_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_bind_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_skip_chk_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_skip_chk_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lmt_ctl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lmt_ctl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lmt_ctl_categ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lmt_ctl_categ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_lot_back_stop_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_lot_back_stop_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_valid_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_valid_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_valid_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_valid_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_upri_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_upri_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_proc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_proc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_inst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_inst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_inst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_inst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_ship_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_ship_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_ship_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_ship_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_arr_skip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_arr_skip_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_term_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_stk_lst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_stk_lst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_inst_unit_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_inst_unit_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_inst_unit_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_inst_unit_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_prov_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_prov_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_proc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_prod_pln_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_prod_pln_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_prod_pln_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_prod_pln_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_dmnd_date_div_mons]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_dmnd_date_div_mons_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_alloc_margin_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_alloc_margin_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_alloc_margin_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_alloc_margin_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_opn_xfr_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_opn_xfr_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_itm_add_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_itm_add_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_itm_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_itm_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sch_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sch_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_num_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_num_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_num_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_num_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_num_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_num_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_num_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_num_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_upd_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_upd_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_upd_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_upd_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_plnt_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_plnt_aprv_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_plnt_aprv_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_aprv_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_aprv_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_aprv_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_aprv_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_byprod_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_byprod_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inst_lot_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inst_lot_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_alloc_ctl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_alloc_ctl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_alloc_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_alloc_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_ctl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_ctl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bkf_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bkf_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bkf_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bkf_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_main_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_main_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_not_cost_bom_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_not_cost_bom_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ptn_nm_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm_lcl) doDtl_itm_typ_d_nm_lcl_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_def_sls_flg) doDtl_def_sls_flg_NE(info);
		else if (ne == columnDtl_def_mfg_flg) doDtl_def_mfg_flg_NE(info);
		else if (ne == columnDtl_def_purc_flg) doDtl_def_purc_flg_NE(info);
		else if (ne == columnDtl_def_insp_flg) doDtl_def_insp_flg_NE(info);
		else if (ne == columnDtl_def_itm_jnl_cd) doDtl_def_itm_jnl_cd_NE(info);
		else if (ne == columnDtl_def_itm_jnl_nm) doDtl_def_itm_jnl_nm_NE(info);
		else if (ne == columnDtl_def_ac_itm_grp_cd) doDtl_def_ac_itm_grp_cd_NE(info);
		else if (ne == columnDtl_def_ac_itm_grp_nm) doDtl_def_ac_itm_grp_nm_NE(info);
		else if (ne == columnDtl_def_minus_stk_flg) doDtl_def_minus_stk_flg_NE(info);
		else if (ne == columnDtl_def_lot_mng_typ) doDtl_def_lot_mng_typ_NE(info);
		else if (ne == columnDtl_def_lot_mng_typ_nm) doDtl_def_lot_mng_typ_nm_NE(info);
		else if (ne == columnDtl_def_lot_no_typ) doDtl_def_lot_no_typ_NE(info);
		else if (ne == columnDtl_def_lot_no_typ_nm) doDtl_def_lot_no_typ_nm_NE(info);
		else if (ne == columnDtl_def_lot_no_ptn_cd) doDtl_def_lot_no_ptn_cd_NE(info);
		else if (ne == columnDtl_def_lot_no_ptn_nm) doDtl_def_lot_no_ptn_nm_NE(info);
		else if (ne == columnDtl_def_sublot_mng_typ) doDtl_def_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_def_sublot_mng_typ_nm) doDtl_def_sublot_mng_typ_nm_NE(info);
		else if (ne == columnDtl_def_sublot_no_typ) doDtl_def_sublot_no_typ_NE(info);
		else if (ne == columnDtl_def_sublot_no_typ_nm) doDtl_def_sublot_no_typ_nm_NE(info);
		else if (ne == columnDtl_def_sublot_no_ptn_cd) doDtl_def_sublot_no_ptn_cd_NE(info);
		else if (ne == columnDtl_def_sublot_no_ptn_nm) doDtl_def_sublot_no_ptn_nm_NE(info);
		else if (ne == columnDtl_def_bp_lot_flg) doDtl_def_bp_lot_flg_NE(info);
		else if (ne == columnDtl_def_not_new_lot_flg) doDtl_def_not_new_lot_flg_NE(info);
		else if (ne == columnDtl_def_gi_alloc_flg) doDtl_def_gi_alloc_flg_NE(info);
		else if (ne == columnDtl_def_pack_alloc_flg) doDtl_def_pack_alloc_flg_NE(info);
		else if (ne == columnDtl_def_comp_spec_typ) doDtl_def_comp_spec_typ_NE(info);
		else if (ne == columnDtl_def_comp_spec_typ_nm) doDtl_def_comp_spec_typ_nm_NE(info);
		else if (ne == columnDtl_def_comp_rev_at_slo_flg) doDtl_def_comp_rev_at_slo_flg_NE(info);
		else if (ne == columnDtl_def_comp_core_itm_flg) doDtl_def_comp_core_itm_flg_NE(info);
		else if (ne == columnDtl_def_itm_spec_grp_cd) doDtl_def_itm_spec_grp_cd_NE(info);
		else if (ne == columnDtl_def_itm_spec_grp_nm) doDtl_def_itm_spec_grp_nm_NE(info);
		else if (ne == columnDtl_def_insp_bind_typ) doDtl_def_insp_bind_typ_NE(info);
		else if (ne == columnDtl_def_insp_bind_typ_nm) doDtl_def_insp_bind_typ_nm_NE(info);
		else if (ne == columnDtl_def_skip_chk_ship_flg) doDtl_def_skip_chk_ship_flg_NE(info);
		else if (ne == columnDtl_def_lmt_ctl_flg) doDtl_def_lmt_ctl_flg_NE(info);
		else if (ne == columnDtl_def_lmt_ctl_categ) doDtl_def_lmt_ctl_categ_NE(info);
		else if (ne == columnDtl_def_ship_lot_back_stop_flg) doDtl_def_ship_lot_back_stop_flg_NE(info);
		else if (ne == columnDtl_def_ship_valid_grp_cd) doDtl_def_ship_valid_grp_cd_NE(info);
		else if (ne == columnDtl_def_ship_valid_grp_nm) doDtl_def_ship_valid_grp_nm_NE(info);
		else if (ne == columnDtl_def_sls_upri_grp_cd) doDtl_def_sls_upri_grp_cd_NE(info);
		else if (ne == columnDtl_def_sls_upri_grp_nm) doDtl_def_sls_upri_grp_nm_NE(info);
		else if (ne == columnDtl_def_slo_proc_flg) doDtl_def_slo_proc_flg_NE(info);
		else if (ne == columnDtl_def_slo_proc_typ) doDtl_def_slo_proc_typ_NE(info);
		else if (ne == columnDtl_def_slo_proc_typ_nm) doDtl_def_slo_proc_typ_nm_NE(info);
		else if (ne == columnDtl_def_ship_inst_typ) doDtl_def_ship_inst_typ_NE(info);
		else if (ne == columnDtl_def_ship_inst_typ_nm) doDtl_def_ship_inst_typ_nm_NE(info);
		else if (ne == columnDtl_def_itm_ship_grp_cd) doDtl_def_itm_ship_grp_cd_NE(info);
		else if (ne == columnDtl_def_itm_ship_grp_nm) doDtl_def_itm_ship_grp_nm_NE(info);
		else if (ne == columnDtl_def_arr_skip_flg) doDtl_def_arr_skip_flg_NE(info);
		else if (ne == columnDtl_def_ship_term_cd) doDtl_def_ship_term_cd_NE(info);
		else if (ne == columnDtl_def_ship_term_nm) doDtl_def_ship_term_nm_NE(info);
		else if (ne == columnDtl_def_stk_lst_flg) doDtl_def_stk_lst_flg_NE(info);
		else if (ne == columnDtl_def_ver_flg) doDtl_def_ver_flg_NE(info);
		else if (ne == columnDtl_def_mfg_inst_unit_typ) doDtl_def_mfg_inst_unit_typ_NE(info);
		else if (ne == columnDtl_def_mfg_inst_unit_typ_nm) doDtl_def_mfg_inst_unit_typ_nm_NE(info);
		else if (ne == columnDtl_def_sls_upri_cng_flg) doDtl_def_sls_upri_cng_flg_NE(info);
		else if (ne == columnDtl_def_purc_upri_cng_flg) doDtl_def_purc_upri_cng_flg_NE(info);
		else if (ne == columnDtl_def_prov_upri_cng_flg) doDtl_def_prov_upri_cng_flg_NE(info);
		else if (ne == columnDtl_def_mrp_proc_typ) doDtl_def_mrp_proc_typ_NE(info);
		else if (ne == columnDtl_def_mrp_proc_typ_nm) doDtl_def_mrp_proc_typ_nm_NE(info);
		else if (ne == columnDtl_def_rqmt_typ) doDtl_def_rqmt_typ_NE(info);
		else if (ne == columnDtl_def_rqmt_typ_nm) doDtl_def_rqmt_typ_nm_NE(info);
		else if (ne == columnDtl_def_prod_pln_typ) doDtl_def_prod_pln_typ_NE(info);
		else if (ne == columnDtl_def_prod_pln_typ_nm) doDtl_def_prod_pln_typ_nm_NE(info);
		else if (ne == columnDtl_def_dmnd_date_div_mons) doDtl_def_dmnd_date_div_mons_NE(info);
		else if (ne == columnDtl_def_alloc_margin_days) doDtl_def_alloc_margin_days_NE(info);
		else if (ne == columnDtl_def_mrp_alloc_margin_days) doDtl_def_mrp_alloc_margin_days_NE(info);
		else if (ne == columnDtl_def_mrp_opn_xfr_days) doDtl_def_mrp_opn_xfr_days_NE(info);
		else if (ne == columnDtl_def_inpt_itm_add_flg) doDtl_def_inpt_itm_add_flg_NE(info);
		else if (ne == columnDtl_def_inpt_itm_del_flg) doDtl_def_inpt_itm_del_flg_NE(info);
		else if (ne == columnDtl_def_sch_flg) doDtl_def_sch_flg_NE(info);
		else if (ne == columnDtl_def_sno1_mng_typ) doDtl_def_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_def_sno1_mng_typ_nm) doDtl_def_sno1_mng_typ_nm_NE(info);
		else if (ne == columnDtl_def_slo_sno1_flg) doDtl_def_slo_sno1_flg_NE(info);
		else if (ne == columnDtl_def_rqmt_sno1_flg) doDtl_def_rqmt_sno1_flg_NE(info);
		else if (ne == columnDtl_def_sno1_num_typ) doDtl_def_sno1_num_typ_NE(info);
		else if (ne == columnDtl_def_sno1_num_typ_nm) doDtl_def_sno1_num_typ_nm_NE(info);
		else if (ne == columnDtl_def_sno1_ptn_cd) doDtl_def_sno1_ptn_cd_NE(info);
		else if (ne == columnDtl_def_sno1_ptn_nm) doDtl_def_sno1_ptn_nm_NE(info);
		else if (ne == columnDtl_def_sno2_mng_typ) doDtl_def_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_def_sno2_mng_typ_nm) doDtl_def_sno2_mng_typ_nm_NE(info);
		else if (ne == columnDtl_def_slo_sno2_flg) doDtl_def_slo_sno2_flg_NE(info);
		else if (ne == columnDtl_def_rqmt_sno2_flg) doDtl_def_rqmt_sno2_flg_NE(info);
		else if (ne == columnDtl_def_sno2_num_typ) doDtl_def_sno2_num_typ_NE(info);
		else if (ne == columnDtl_def_sno2_num_typ_nm) doDtl_def_sno2_num_typ_nm_NE(info);
		else if (ne == columnDtl_def_sno2_ptn_cd) doDtl_def_sno2_ptn_cd_NE(info);
		else if (ne == columnDtl_def_sno2_ptn_nm) doDtl_def_sno2_ptn_nm_NE(info);
		else if (ne == columnDtl_def_sno3_mng_typ) doDtl_def_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_def_sno3_mng_typ_nm) doDtl_def_sno3_mng_typ_nm_NE(info);
		else if (ne == columnDtl_def_slo_sno3_flg) doDtl_def_slo_sno3_flg_NE(info);
		else if (ne == columnDtl_def_rqmt_sno3_flg) doDtl_def_rqmt_sno3_flg_NE(info);
		else if (ne == columnDtl_def_sno3_num_typ) doDtl_def_sno3_num_typ_NE(info);
		else if (ne == columnDtl_def_sno3_num_typ_nm) doDtl_def_sno3_num_typ_nm_NE(info);
		else if (ne == columnDtl_def_sno3_ptn_cd) doDtl_def_sno3_ptn_cd_NE(info);
		else if (ne == columnDtl_def_sno3_ptn_nm) doDtl_def_sno3_ptn_nm_NE(info);
		else if (ne == columnDtl_def_sno4_mng_typ) doDtl_def_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_def_sno4_mng_typ_nm) doDtl_def_sno4_mng_typ_nm_NE(info);
		else if (ne == columnDtl_def_slo_sno4_flg) doDtl_def_slo_sno4_flg_NE(info);
		else if (ne == columnDtl_def_rqmt_sno4_flg) doDtl_def_rqmt_sno4_flg_NE(info);
		else if (ne == columnDtl_def_sno4_num_typ) doDtl_def_sno4_num_typ_NE(info);
		else if (ne == columnDtl_def_sno4_num_typ_nm) doDtl_def_sno4_num_typ_nm_NE(info);
		else if (ne == columnDtl_def_sno4_ptn_cd) doDtl_def_sno4_ptn_cd_NE(info);
		else if (ne == columnDtl_def_sno4_ptn_nm) doDtl_def_sno4_ptn_nm_NE(info);
		else if (ne == columnDtl_def_mrkt_judg_flg) doDtl_def_mrkt_judg_flg_NE(info);
		else if (ne == columnDtl_def_mrkt_judg_role_cd) doDtl_def_mrkt_judg_role_cd_NE(info);
		else if (ne == columnDtl_def_mrkt_judg_role_nm) doDtl_def_mrkt_judg_role_nm_NE(info);
		else if (ne == columnDtl_def_mrkt_judg_upd_role_cd) doDtl_def_mrkt_judg_upd_role_cd_NE(info);
		else if (ne == columnDtl_def_mrkt_judg_upd_role_nm) doDtl_def_mrkt_judg_upd_role_nm_NE(info);
		else if (ne == columnDtl_def_plnt_aprv_flg) doDtl_def_plnt_aprv_flg_NE(info);
		else if (ne == columnDtl_def_plnt_aprv_role_cd) doDtl_def_plnt_aprv_role_cd_NE(info);
		else if (ne == columnDtl_def_plnt_aprv_role_nm) doDtl_def_plnt_aprv_role_nm_NE(info);
		else if (ne == columnDtl_def_insp_aprv_flg) doDtl_def_insp_aprv_flg_NE(info);
		else if (ne == columnDtl_def_insp_aprv_role_cd) doDtl_def_insp_aprv_role_cd_NE(info);
		else if (ne == columnDtl_def_insp_aprv_role_nm) doDtl_def_insp_aprv_role_nm_NE(info);
		else if (ne == columnDtl_def_mfg_aprv_flg) doDtl_def_mfg_aprv_flg_NE(info);
		else if (ne == columnDtl_def_mfg_aprv_role_cd) doDtl_def_mfg_aprv_role_cd_NE(info);
		else if (ne == columnDtl_def_mfg_aprv_role_nm) doDtl_def_mfg_aprv_role_nm_NE(info);
		else if (ne == columnDtl_def_sno_typ1) doDtl_def_sno_typ1_NE(info);
		else if (ne == columnDtl_def_sno_typ_nm1) doDtl_def_sno_typ_nm1_NE(info);
		else if (ne == columnDtl_def_sno_typ2) doDtl_def_sno_typ2_NE(info);
		else if (ne == columnDtl_def_sno_typ_nm2) doDtl_def_sno_typ_nm2_NE(info);
		else if (ne == columnDtl_def_sno_typ3) doDtl_def_sno_typ3_NE(info);
		else if (ne == columnDtl_def_sno_typ_nm3) doDtl_def_sno_typ_nm3_NE(info);
		else if (ne == columnDtl_def_sno_typ4) doDtl_def_sno_typ4_NE(info);
		else if (ne == columnDtl_def_sno_typ_nm4) doDtl_def_sno_typ_nm4_NE(info);
		else if (ne == columnDtl_def_byprod_flg) doDtl_def_byprod_flg_NE(info);
		else if (ne == columnDtl_def_inst_lot_fix_flg) doDtl_def_inst_lot_fix_flg_NE(info);
		else if (ne == columnDtl_def_lot_mix_flg) doDtl_def_lot_mix_flg_NE(info);
		else if (ne == columnDtl_def_sublot_mix_flg) doDtl_def_sublot_mix_flg_NE(info);
		else if (ne == columnDtl_def_alloc_ctl_typ) doDtl_def_alloc_ctl_typ_NE(info);
		else if (ne == columnDtl_def_alloc_ctl_typ_nm) doDtl_def_alloc_ctl_typ_nm_NE(info);
		else if (ne == columnDtl_def_inpt_ctl_typ) doDtl_def_inpt_ctl_typ_NE(info);
		else if (ne == columnDtl_def_inpt_ctl_typ_nm) doDtl_def_inpt_ctl_typ_nm_NE(info);
		else if (ne == columnDtl_def_bkf_typ) doDtl_def_bkf_typ_NE(info);
		else if (ne == columnDtl_def_bkf_typ_nm) doDtl_def_bkf_typ_nm_NE(info);
		else if (ne == columnDtl_def_main_itm_flg) doDtl_def_main_itm_flg_NE(info);
		else if (ne == columnDtl_def_not_cost_bom_flg) doDtl_def_not_cost_bom_flg_NE(info);
		else if (ne == columnDtl_def_calc_ptn_cd) doDtl_def_calc_ptn_cd_NE(info);
		else if (ne == columnDtl_def_calc_ptn_nm) doDtl_def_calc_ptn_nm_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
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
		else if (ne == columnLcl_check) doLcl_check_NE(info);
		else if (ne == columnLcl_itm_typ) doLcl_itm_typ_NE(info);
		else if (ne == columnLcl_itm_typ_nm) doLcl_itm_typ_nm_NE(info);
		else if (ne == columnLcl_itm_typ_d_cd) doLcl_itm_typ_d_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_itm_typ_d_nm) doLcl_itm_typ_d_nm_NE(info);
		else if (ne == columnLcl_memo1) doLcl_memo1_NE(info);
		else if (ne == columnLcl_memo2) doLcl_memo2_NE(info);
		else if (ne == columnLcl_memo3) doLcl_memo3_NE(info);
		else if (ne == columnLcl_ins_usr_id) doLcl_ins_usr_id_NE(info);
		else if (ne == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NE(info);
		else if (ne == columnLcl_ins_ts) doLcl_ins_ts_NE(info);
		else if (ne == columnLcl_ins_func_id) doLcl_ins_func_id_NE(info);
		else if (ne == columnLcl_ins_func_nm) doLcl_ins_func_nm_NE(info);
		else if (ne == columnLcl_upd_cntr) doLcl_upd_cntr_NE(info);
		else if (ne == columnLcl_upd_usr_id) doLcl_upd_usr_id_NE(info);
		else if (ne == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NE(info);
		else if (ne == columnLcl_upd_ts) doLcl_upd_ts_NE(info);
		else if (ne == columnLcl_upd_func_id) doLcl_upd_func_id_NE(info);
		else if (ne == columnLcl_upd_func_nm) doLcl_upd_func_nm_NE(info);
		else if (ne == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NE(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_typ_d_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ac_itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ac_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ac_itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ac_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_minus_stk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_minus_stk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bp_lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bp_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_not_new_lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_not_new_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_gi_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_gi_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_pack_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_pack_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_spec_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_spec_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_spec_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_spec_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_rev_at_slo_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_rev_at_slo_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_core_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_core_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_spec_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_spec_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_spec_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_spec_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_bind_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_bind_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_bind_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_bind_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_skip_chk_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_skip_chk_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lmt_ctl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lmt_ctl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lmt_ctl_categ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lmt_ctl_categ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_lot_back_stop_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_lot_back_stop_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_valid_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_valid_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_valid_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_valid_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_upri_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_upri_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_proc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_proc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_inst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_inst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_inst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_inst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_ship_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_ship_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_ship_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_ship_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_arr_skip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_arr_skip_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_term_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_stk_lst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_stk_lst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_inst_unit_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_inst_unit_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_inst_unit_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_inst_unit_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_prov_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_prov_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_proc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_prod_pln_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_prod_pln_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_prod_pln_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_prod_pln_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_dmnd_date_div_mons]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_dmnd_date_div_mons_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_alloc_margin_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_alloc_margin_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_alloc_margin_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_alloc_margin_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_opn_xfr_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_opn_xfr_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_itm_add_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_itm_add_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_itm_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_itm_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sch_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sch_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_num_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_num_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_num_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_num_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_num_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_num_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_num_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_num_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_upd_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_upd_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_upd_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_upd_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_plnt_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_plnt_aprv_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_plnt_aprv_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_aprv_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_aprv_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_aprv_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_aprv_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_byprod_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_byprod_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inst_lot_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inst_lot_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_alloc_ctl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_alloc_ctl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_alloc_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_alloc_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_ctl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_ctl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bkf_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bkf_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bkf_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bkf_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_main_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_main_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_not_cost_bom_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_not_cost_bom_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ptn_nm_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm_lcl) doDtl_itm_typ_d_nm_lcl_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_def_sls_flg) doDtl_def_sls_flg_NX(info);
		else if (nx == columnDtl_def_mfg_flg) doDtl_def_mfg_flg_NX(info);
		else if (nx == columnDtl_def_purc_flg) doDtl_def_purc_flg_NX(info);
		else if (nx == columnDtl_def_insp_flg) doDtl_def_insp_flg_NX(info);
		else if (nx == columnDtl_def_itm_jnl_cd) doDtl_def_itm_jnl_cd_NX(info);
		else if (nx == columnDtl_def_itm_jnl_nm) doDtl_def_itm_jnl_nm_NX(info);
		else if (nx == columnDtl_def_ac_itm_grp_cd) doDtl_def_ac_itm_grp_cd_NX(info);
		else if (nx == columnDtl_def_ac_itm_grp_nm) doDtl_def_ac_itm_grp_nm_NX(info);
		else if (nx == columnDtl_def_minus_stk_flg) doDtl_def_minus_stk_flg_NX(info);
		else if (nx == columnDtl_def_lot_mng_typ) doDtl_def_lot_mng_typ_NX(info);
		else if (nx == columnDtl_def_lot_mng_typ_nm) doDtl_def_lot_mng_typ_nm_NX(info);
		else if (nx == columnDtl_def_lot_no_typ) doDtl_def_lot_no_typ_NX(info);
		else if (nx == columnDtl_def_lot_no_typ_nm) doDtl_def_lot_no_typ_nm_NX(info);
		else if (nx == columnDtl_def_lot_no_ptn_cd) doDtl_def_lot_no_ptn_cd_NX(info);
		else if (nx == columnDtl_def_lot_no_ptn_nm) doDtl_def_lot_no_ptn_nm_NX(info);
		else if (nx == columnDtl_def_sublot_mng_typ) doDtl_def_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_def_sublot_mng_typ_nm) doDtl_def_sublot_mng_typ_nm_NX(info);
		else if (nx == columnDtl_def_sublot_no_typ) doDtl_def_sublot_no_typ_NX(info);
		else if (nx == columnDtl_def_sublot_no_typ_nm) doDtl_def_sublot_no_typ_nm_NX(info);
		else if (nx == columnDtl_def_sublot_no_ptn_cd) doDtl_def_sublot_no_ptn_cd_NX(info);
		else if (nx == columnDtl_def_sublot_no_ptn_nm) doDtl_def_sublot_no_ptn_nm_NX(info);
		else if (nx == columnDtl_def_bp_lot_flg) doDtl_def_bp_lot_flg_NX(info);
		else if (nx == columnDtl_def_not_new_lot_flg) doDtl_def_not_new_lot_flg_NX(info);
		else if (nx == columnDtl_def_gi_alloc_flg) doDtl_def_gi_alloc_flg_NX(info);
		else if (nx == columnDtl_def_pack_alloc_flg) doDtl_def_pack_alloc_flg_NX(info);
		else if (nx == columnDtl_def_comp_spec_typ) doDtl_def_comp_spec_typ_NX(info);
		else if (nx == columnDtl_def_comp_spec_typ_nm) doDtl_def_comp_spec_typ_nm_NX(info);
		else if (nx == columnDtl_def_comp_rev_at_slo_flg) doDtl_def_comp_rev_at_slo_flg_NX(info);
		else if (nx == columnDtl_def_comp_core_itm_flg) doDtl_def_comp_core_itm_flg_NX(info);
		else if (nx == columnDtl_def_itm_spec_grp_cd) doDtl_def_itm_spec_grp_cd_NX(info);
		else if (nx == columnDtl_def_itm_spec_grp_nm) doDtl_def_itm_spec_grp_nm_NX(info);
		else if (nx == columnDtl_def_insp_bind_typ) doDtl_def_insp_bind_typ_NX(info);
		else if (nx == columnDtl_def_insp_bind_typ_nm) doDtl_def_insp_bind_typ_nm_NX(info);
		else if (nx == columnDtl_def_skip_chk_ship_flg) doDtl_def_skip_chk_ship_flg_NX(info);
		else if (nx == columnDtl_def_lmt_ctl_flg) doDtl_def_lmt_ctl_flg_NX(info);
		else if (nx == columnDtl_def_lmt_ctl_categ) doDtl_def_lmt_ctl_categ_NX(info);
		else if (nx == columnDtl_def_ship_lot_back_stop_flg) doDtl_def_ship_lot_back_stop_flg_NX(info);
		else if (nx == columnDtl_def_ship_valid_grp_cd) doDtl_def_ship_valid_grp_cd_NX(info);
		else if (nx == columnDtl_def_ship_valid_grp_nm) doDtl_def_ship_valid_grp_nm_NX(info);
		else if (nx == columnDtl_def_sls_upri_grp_cd) doDtl_def_sls_upri_grp_cd_NX(info);
		else if (nx == columnDtl_def_sls_upri_grp_nm) doDtl_def_sls_upri_grp_nm_NX(info);
		else if (nx == columnDtl_def_slo_proc_flg) doDtl_def_slo_proc_flg_NX(info);
		else if (nx == columnDtl_def_slo_proc_typ) doDtl_def_slo_proc_typ_NX(info);
		else if (nx == columnDtl_def_slo_proc_typ_nm) doDtl_def_slo_proc_typ_nm_NX(info);
		else if (nx == columnDtl_def_ship_inst_typ) doDtl_def_ship_inst_typ_NX(info);
		else if (nx == columnDtl_def_ship_inst_typ_nm) doDtl_def_ship_inst_typ_nm_NX(info);
		else if (nx == columnDtl_def_itm_ship_grp_cd) doDtl_def_itm_ship_grp_cd_NX(info);
		else if (nx == columnDtl_def_itm_ship_grp_nm) doDtl_def_itm_ship_grp_nm_NX(info);
		else if (nx == columnDtl_def_arr_skip_flg) doDtl_def_arr_skip_flg_NX(info);
		else if (nx == columnDtl_def_ship_term_cd) doDtl_def_ship_term_cd_NX(info);
		else if (nx == columnDtl_def_ship_term_nm) doDtl_def_ship_term_nm_NX(info);
		else if (nx == columnDtl_def_stk_lst_flg) doDtl_def_stk_lst_flg_NX(info);
		else if (nx == columnDtl_def_ver_flg) doDtl_def_ver_flg_NX(info);
		else if (nx == columnDtl_def_mfg_inst_unit_typ) doDtl_def_mfg_inst_unit_typ_NX(info);
		else if (nx == columnDtl_def_mfg_inst_unit_typ_nm) doDtl_def_mfg_inst_unit_typ_nm_NX(info);
		else if (nx == columnDtl_def_sls_upri_cng_flg) doDtl_def_sls_upri_cng_flg_NX(info);
		else if (nx == columnDtl_def_purc_upri_cng_flg) doDtl_def_purc_upri_cng_flg_NX(info);
		else if (nx == columnDtl_def_prov_upri_cng_flg) doDtl_def_prov_upri_cng_flg_NX(info);
		else if (nx == columnDtl_def_mrp_proc_typ) doDtl_def_mrp_proc_typ_NX(info);
		else if (nx == columnDtl_def_mrp_proc_typ_nm) doDtl_def_mrp_proc_typ_nm_NX(info);
		else if (nx == columnDtl_def_rqmt_typ) doDtl_def_rqmt_typ_NX(info);
		else if (nx == columnDtl_def_rqmt_typ_nm) doDtl_def_rqmt_typ_nm_NX(info);
		else if (nx == columnDtl_def_prod_pln_typ) doDtl_def_prod_pln_typ_NX(info);
		else if (nx == columnDtl_def_prod_pln_typ_nm) doDtl_def_prod_pln_typ_nm_NX(info);
		else if (nx == columnDtl_def_dmnd_date_div_mons) doDtl_def_dmnd_date_div_mons_NX(info);
		else if (nx == columnDtl_def_alloc_margin_days) doDtl_def_alloc_margin_days_NX(info);
		else if (nx == columnDtl_def_mrp_alloc_margin_days) doDtl_def_mrp_alloc_margin_days_NX(info);
		else if (nx == columnDtl_def_mrp_opn_xfr_days) doDtl_def_mrp_opn_xfr_days_NX(info);
		else if (nx == columnDtl_def_inpt_itm_add_flg) doDtl_def_inpt_itm_add_flg_NX(info);
		else if (nx == columnDtl_def_inpt_itm_del_flg) doDtl_def_inpt_itm_del_flg_NX(info);
		else if (nx == columnDtl_def_sch_flg) doDtl_def_sch_flg_NX(info);
		else if (nx == columnDtl_def_sno1_mng_typ) doDtl_def_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_def_sno1_mng_typ_nm) doDtl_def_sno1_mng_typ_nm_NX(info);
		else if (nx == columnDtl_def_slo_sno1_flg) doDtl_def_slo_sno1_flg_NX(info);
		else if (nx == columnDtl_def_rqmt_sno1_flg) doDtl_def_rqmt_sno1_flg_NX(info);
		else if (nx == columnDtl_def_sno1_num_typ) doDtl_def_sno1_num_typ_NX(info);
		else if (nx == columnDtl_def_sno1_num_typ_nm) doDtl_def_sno1_num_typ_nm_NX(info);
		else if (nx == columnDtl_def_sno1_ptn_cd) doDtl_def_sno1_ptn_cd_NX(info);
		else if (nx == columnDtl_def_sno1_ptn_nm) doDtl_def_sno1_ptn_nm_NX(info);
		else if (nx == columnDtl_def_sno2_mng_typ) doDtl_def_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_def_sno2_mng_typ_nm) doDtl_def_sno2_mng_typ_nm_NX(info);
		else if (nx == columnDtl_def_slo_sno2_flg) doDtl_def_slo_sno2_flg_NX(info);
		else if (nx == columnDtl_def_rqmt_sno2_flg) doDtl_def_rqmt_sno2_flg_NX(info);
		else if (nx == columnDtl_def_sno2_num_typ) doDtl_def_sno2_num_typ_NX(info);
		else if (nx == columnDtl_def_sno2_num_typ_nm) doDtl_def_sno2_num_typ_nm_NX(info);
		else if (nx == columnDtl_def_sno2_ptn_cd) doDtl_def_sno2_ptn_cd_NX(info);
		else if (nx == columnDtl_def_sno2_ptn_nm) doDtl_def_sno2_ptn_nm_NX(info);
		else if (nx == columnDtl_def_sno3_mng_typ) doDtl_def_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_def_sno3_mng_typ_nm) doDtl_def_sno3_mng_typ_nm_NX(info);
		else if (nx == columnDtl_def_slo_sno3_flg) doDtl_def_slo_sno3_flg_NX(info);
		else if (nx == columnDtl_def_rqmt_sno3_flg) doDtl_def_rqmt_sno3_flg_NX(info);
		else if (nx == columnDtl_def_sno3_num_typ) doDtl_def_sno3_num_typ_NX(info);
		else if (nx == columnDtl_def_sno3_num_typ_nm) doDtl_def_sno3_num_typ_nm_NX(info);
		else if (nx == columnDtl_def_sno3_ptn_cd) doDtl_def_sno3_ptn_cd_NX(info);
		else if (nx == columnDtl_def_sno3_ptn_nm) doDtl_def_sno3_ptn_nm_NX(info);
		else if (nx == columnDtl_def_sno4_mng_typ) doDtl_def_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_def_sno4_mng_typ_nm) doDtl_def_sno4_mng_typ_nm_NX(info);
		else if (nx == columnDtl_def_slo_sno4_flg) doDtl_def_slo_sno4_flg_NX(info);
		else if (nx == columnDtl_def_rqmt_sno4_flg) doDtl_def_rqmt_sno4_flg_NX(info);
		else if (nx == columnDtl_def_sno4_num_typ) doDtl_def_sno4_num_typ_NX(info);
		else if (nx == columnDtl_def_sno4_num_typ_nm) doDtl_def_sno4_num_typ_nm_NX(info);
		else if (nx == columnDtl_def_sno4_ptn_cd) doDtl_def_sno4_ptn_cd_NX(info);
		else if (nx == columnDtl_def_sno4_ptn_nm) doDtl_def_sno4_ptn_nm_NX(info);
		else if (nx == columnDtl_def_mrkt_judg_flg) doDtl_def_mrkt_judg_flg_NX(info);
		else if (nx == columnDtl_def_mrkt_judg_role_cd) doDtl_def_mrkt_judg_role_cd_NX(info);
		else if (nx == columnDtl_def_mrkt_judg_role_nm) doDtl_def_mrkt_judg_role_nm_NX(info);
		else if (nx == columnDtl_def_mrkt_judg_upd_role_cd) doDtl_def_mrkt_judg_upd_role_cd_NX(info);
		else if (nx == columnDtl_def_mrkt_judg_upd_role_nm) doDtl_def_mrkt_judg_upd_role_nm_NX(info);
		else if (nx == columnDtl_def_plnt_aprv_flg) doDtl_def_plnt_aprv_flg_NX(info);
		else if (nx == columnDtl_def_plnt_aprv_role_cd) doDtl_def_plnt_aprv_role_cd_NX(info);
		else if (nx == columnDtl_def_plnt_aprv_role_nm) doDtl_def_plnt_aprv_role_nm_NX(info);
		else if (nx == columnDtl_def_insp_aprv_flg) doDtl_def_insp_aprv_flg_NX(info);
		else if (nx == columnDtl_def_insp_aprv_role_cd) doDtl_def_insp_aprv_role_cd_NX(info);
		else if (nx == columnDtl_def_insp_aprv_role_nm) doDtl_def_insp_aprv_role_nm_NX(info);
		else if (nx == columnDtl_def_mfg_aprv_flg) doDtl_def_mfg_aprv_flg_NX(info);
		else if (nx == columnDtl_def_mfg_aprv_role_cd) doDtl_def_mfg_aprv_role_cd_NX(info);
		else if (nx == columnDtl_def_mfg_aprv_role_nm) doDtl_def_mfg_aprv_role_nm_NX(info);
		else if (nx == columnDtl_def_sno_typ1) doDtl_def_sno_typ1_NX(info);
		else if (nx == columnDtl_def_sno_typ_nm1) doDtl_def_sno_typ_nm1_NX(info);
		else if (nx == columnDtl_def_sno_typ2) doDtl_def_sno_typ2_NX(info);
		else if (nx == columnDtl_def_sno_typ_nm2) doDtl_def_sno_typ_nm2_NX(info);
		else if (nx == columnDtl_def_sno_typ3) doDtl_def_sno_typ3_NX(info);
		else if (nx == columnDtl_def_sno_typ_nm3) doDtl_def_sno_typ_nm3_NX(info);
		else if (nx == columnDtl_def_sno_typ4) doDtl_def_sno_typ4_NX(info);
		else if (nx == columnDtl_def_sno_typ_nm4) doDtl_def_sno_typ_nm4_NX(info);
		else if (nx == columnDtl_def_byprod_flg) doDtl_def_byprod_flg_NX(info);
		else if (nx == columnDtl_def_inst_lot_fix_flg) doDtl_def_inst_lot_fix_flg_NX(info);
		else if (nx == columnDtl_def_lot_mix_flg) doDtl_def_lot_mix_flg_NX(info);
		else if (nx == columnDtl_def_sublot_mix_flg) doDtl_def_sublot_mix_flg_NX(info);
		else if (nx == columnDtl_def_alloc_ctl_typ) doDtl_def_alloc_ctl_typ_NX(info);
		else if (nx == columnDtl_def_alloc_ctl_typ_nm) doDtl_def_alloc_ctl_typ_nm_NX(info);
		else if (nx == columnDtl_def_inpt_ctl_typ) doDtl_def_inpt_ctl_typ_NX(info);
		else if (nx == columnDtl_def_inpt_ctl_typ_nm) doDtl_def_inpt_ctl_typ_nm_NX(info);
		else if (nx == columnDtl_def_bkf_typ) doDtl_def_bkf_typ_NX(info);
		else if (nx == columnDtl_def_bkf_typ_nm) doDtl_def_bkf_typ_nm_NX(info);
		else if (nx == columnDtl_def_main_itm_flg) doDtl_def_main_itm_flg_NX(info);
		else if (nx == columnDtl_def_not_cost_bom_flg) doDtl_def_not_cost_bom_flg_NX(info);
		else if (nx == columnDtl_def_calc_ptn_cd) doDtl_def_calc_ptn_cd_NX(info);
		else if (nx == columnDtl_def_calc_ptn_nm) doDtl_def_calc_ptn_nm_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
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
		else if (nx == columnLcl_check) doLcl_check_NX(info);
		else if (nx == columnLcl_itm_typ) doLcl_itm_typ_NX(info);
		else if (nx == columnLcl_itm_typ_nm) doLcl_itm_typ_nm_NX(info);
		else if (nx == columnLcl_itm_typ_d_cd) doLcl_itm_typ_d_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_itm_typ_d_nm) doLcl_itm_typ_d_nm_NX(info);
		else if (nx == columnLcl_memo1) doLcl_memo1_NX(info);
		else if (nx == columnLcl_memo2) doLcl_memo2_NX(info);
		else if (nx == columnLcl_memo3) doLcl_memo3_NX(info);
		else if (nx == columnLcl_ins_usr_id) doLcl_ins_usr_id_NX(info);
		else if (nx == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NX(info);
		else if (nx == columnLcl_ins_ts) doLcl_ins_ts_NX(info);
		else if (nx == columnLcl_ins_func_id) doLcl_ins_func_id_NX(info);
		else if (nx == columnLcl_ins_func_nm) doLcl_ins_func_nm_NX(info);
		else if (nx == columnLcl_upd_cntr) doLcl_upd_cntr_NX(info);
		else if (nx == columnLcl_upd_usr_id) doLcl_upd_usr_id_NX(info);
		else if (nx == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NX(info);
		else if (nx == columnLcl_upd_ts) doLcl_upd_ts_NX(info);
		else if (nx == columnLcl_upd_func_id) doLcl_upd_func_id_NX(info);
		else if (nx == columnLcl_upd_func_nm) doLcl_upd_func_nm_NX(info);
		else if (nx == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NX(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_typ_d_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ac_itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ac_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ac_itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ac_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_minus_stk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_minus_stk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bp_lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bp_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_not_new_lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_not_new_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_gi_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_gi_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_pack_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_pack_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_spec_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_spec_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_spec_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_spec_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_rev_at_slo_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_rev_at_slo_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_core_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_core_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_spec_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_spec_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_spec_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_spec_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_bind_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_bind_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_bind_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_bind_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_skip_chk_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_skip_chk_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lmt_ctl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lmt_ctl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lmt_ctl_categ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lmt_ctl_categ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_lot_back_stop_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_lot_back_stop_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_valid_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_valid_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_valid_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_valid_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_upri_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_upri_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_proc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_proc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_inst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_inst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_inst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_inst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_ship_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_ship_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_ship_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_ship_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_arr_skip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_arr_skip_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_term_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_stk_lst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_stk_lst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_inst_unit_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_inst_unit_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_inst_unit_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_inst_unit_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_prov_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_prov_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_proc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_prod_pln_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_prod_pln_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_prod_pln_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_prod_pln_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_dmnd_date_div_mons]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_dmnd_date_div_mons_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_alloc_margin_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_alloc_margin_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_alloc_margin_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_alloc_margin_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_opn_xfr_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_opn_xfr_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_itm_add_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_itm_add_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_itm_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_itm_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sch_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sch_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_num_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_num_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_num_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_num_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_num_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_num_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_sno4_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_sno4_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_num_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_num_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_upd_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_upd_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_upd_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_upd_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_plnt_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_plnt_aprv_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_plnt_aprv_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_aprv_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_aprv_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_aprv_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_aprv_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_byprod_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_byprod_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inst_lot_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inst_lot_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_alloc_ctl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_alloc_ctl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_alloc_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_alloc_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_ctl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_ctl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bkf_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bkf_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bkf_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bkf_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_main_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_main_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_not_cost_bom_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_not_cost_bom_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ptn_nm_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm_lcl) doDtl_itm_typ_d_nm_lcl_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_def_itm_jnl_cd) doDtl_def_itm_jnl_cd_LC(info);
		else if (lc == columnDtl_def_itm_jnl_nm) doDtl_def_itm_jnl_nm_LC(info);
		else if (lc == columnDtl_def_ac_itm_grp_cd) doDtl_def_ac_itm_grp_cd_LC(info);
		else if (lc == columnDtl_def_ac_itm_grp_nm) doDtl_def_ac_itm_grp_nm_LC(info);
		else if (lc == columnDtl_def_lot_mng_typ) doDtl_def_lot_mng_typ_LC(info);
		else if (lc == columnDtl_def_lot_mng_typ_nm) doDtl_def_lot_mng_typ_nm_LC(info);
		else if (lc == columnDtl_def_lot_no_typ) doDtl_def_lot_no_typ_LC(info);
		else if (lc == columnDtl_def_lot_no_typ_nm) doDtl_def_lot_no_typ_nm_LC(info);
		else if (lc == columnDtl_def_lot_no_ptn_cd) doDtl_def_lot_no_ptn_cd_LC(info);
		else if (lc == columnDtl_def_lot_no_ptn_nm) doDtl_def_lot_no_ptn_nm_LC(info);
		else if (lc == columnDtl_def_sublot_mng_typ) doDtl_def_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_def_sublot_mng_typ_nm) doDtl_def_sublot_mng_typ_nm_LC(info);
		else if (lc == columnDtl_def_sublot_no_typ) doDtl_def_sublot_no_typ_LC(info);
		else if (lc == columnDtl_def_sublot_no_typ_nm) doDtl_def_sublot_no_typ_nm_LC(info);
		else if (lc == columnDtl_def_sublot_no_ptn_cd) doDtl_def_sublot_no_ptn_cd_LC(info);
		else if (lc == columnDtl_def_sublot_no_ptn_nm) doDtl_def_sublot_no_ptn_nm_LC(info);
		else if (lc == columnDtl_def_comp_spec_typ) doDtl_def_comp_spec_typ_LC(info);
		else if (lc == columnDtl_def_comp_spec_typ_nm) doDtl_def_comp_spec_typ_nm_LC(info);
		else if (lc == columnDtl_def_itm_spec_grp_cd) doDtl_def_itm_spec_grp_cd_LC(info);
		else if (lc == columnDtl_def_itm_spec_grp_nm) doDtl_def_itm_spec_grp_nm_LC(info);
		else if (lc == columnDtl_def_insp_bind_typ) doDtl_def_insp_bind_typ_LC(info);
		else if (lc == columnDtl_def_insp_bind_typ_nm) doDtl_def_insp_bind_typ_nm_LC(info);
		else if (lc == columnDtl_def_lmt_ctl_categ) doDtl_def_lmt_ctl_categ_LC(info);
		else if (lc == columnDtl_def_ship_valid_grp_cd) doDtl_def_ship_valid_grp_cd_LC(info);
		else if (lc == columnDtl_def_ship_valid_grp_nm) doDtl_def_ship_valid_grp_nm_LC(info);
		else if (lc == columnDtl_def_sls_upri_grp_cd) doDtl_def_sls_upri_grp_cd_LC(info);
		else if (lc == columnDtl_def_sls_upri_grp_nm) doDtl_def_sls_upri_grp_nm_LC(info);
		else if (lc == columnDtl_def_slo_proc_typ) doDtl_def_slo_proc_typ_LC(info);
		else if (lc == columnDtl_def_slo_proc_typ_nm) doDtl_def_slo_proc_typ_nm_LC(info);
		else if (lc == columnDtl_def_ship_inst_typ) doDtl_def_ship_inst_typ_LC(info);
		else if (lc == columnDtl_def_ship_inst_typ_nm) doDtl_def_ship_inst_typ_nm_LC(info);
		else if (lc == columnDtl_def_itm_ship_grp_cd) doDtl_def_itm_ship_grp_cd_LC(info);
		else if (lc == columnDtl_def_itm_ship_grp_nm) doDtl_def_itm_ship_grp_nm_LC(info);
		else if (lc == columnDtl_def_ship_term_cd) doDtl_def_ship_term_cd_LC(info);
		else if (lc == columnDtl_def_ship_term_nm) doDtl_def_ship_term_nm_LC(info);
		else if (lc == columnDtl_def_mfg_inst_unit_typ) doDtl_def_mfg_inst_unit_typ_LC(info);
		else if (lc == columnDtl_def_mfg_inst_unit_typ_nm) doDtl_def_mfg_inst_unit_typ_nm_LC(info);
		else if (lc == columnDtl_def_mrp_proc_typ) doDtl_def_mrp_proc_typ_LC(info);
		else if (lc == columnDtl_def_mrp_proc_typ_nm) doDtl_def_mrp_proc_typ_nm_LC(info);
		else if (lc == columnDtl_def_rqmt_typ) doDtl_def_rqmt_typ_LC(info);
		else if (lc == columnDtl_def_rqmt_typ_nm) doDtl_def_rqmt_typ_nm_LC(info);
		else if (lc == columnDtl_def_prod_pln_typ) doDtl_def_prod_pln_typ_LC(info);
		else if (lc == columnDtl_def_prod_pln_typ_nm) doDtl_def_prod_pln_typ_nm_LC(info);
		else if (lc == columnDtl_def_dmnd_date_div_mons) doDtl_def_dmnd_date_div_mons_LC(info);
		else if (lc == columnDtl_def_alloc_margin_days) doDtl_def_alloc_margin_days_LC(info);
		else if (lc == columnDtl_def_mrp_alloc_margin_days) doDtl_def_mrp_alloc_margin_days_LC(info);
		else if (lc == columnDtl_def_mrp_opn_xfr_days) doDtl_def_mrp_opn_xfr_days_LC(info);
		else if (lc == columnDtl_def_sno1_mng_typ) doDtl_def_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_def_sno1_mng_typ_nm) doDtl_def_sno1_mng_typ_nm_LC(info);
		else if (lc == columnDtl_def_sno1_num_typ) doDtl_def_sno1_num_typ_LC(info);
		else if (lc == columnDtl_def_sno1_num_typ_nm) doDtl_def_sno1_num_typ_nm_LC(info);
		else if (lc == columnDtl_def_sno1_ptn_cd) doDtl_def_sno1_ptn_cd_LC(info);
		else if (lc == columnDtl_def_sno1_ptn_nm) doDtl_def_sno1_ptn_nm_LC(info);
		else if (lc == columnDtl_def_sno2_mng_typ) doDtl_def_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_def_sno2_mng_typ_nm) doDtl_def_sno2_mng_typ_nm_LC(info);
		else if (lc == columnDtl_def_sno2_num_typ) doDtl_def_sno2_num_typ_LC(info);
		else if (lc == columnDtl_def_sno2_num_typ_nm) doDtl_def_sno2_num_typ_nm_LC(info);
		else if (lc == columnDtl_def_sno2_ptn_cd) doDtl_def_sno2_ptn_cd_LC(info);
		else if (lc == columnDtl_def_sno2_ptn_nm) doDtl_def_sno2_ptn_nm_LC(info);
		else if (lc == columnDtl_def_sno3_mng_typ) doDtl_def_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_def_sno3_mng_typ_nm) doDtl_def_sno3_mng_typ_nm_LC(info);
		else if (lc == columnDtl_def_sno3_num_typ) doDtl_def_sno3_num_typ_LC(info);
		else if (lc == columnDtl_def_sno3_num_typ_nm) doDtl_def_sno3_num_typ_nm_LC(info);
		else if (lc == columnDtl_def_sno3_ptn_cd) doDtl_def_sno3_ptn_cd_LC(info);
		else if (lc == columnDtl_def_sno3_ptn_nm) doDtl_def_sno3_ptn_nm_LC(info);
		else if (lc == columnDtl_def_sno4_mng_typ) doDtl_def_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_def_sno4_mng_typ_nm) doDtl_def_sno4_mng_typ_nm_LC(info);
		else if (lc == columnDtl_def_sno4_num_typ) doDtl_def_sno4_num_typ_LC(info);
		else if (lc == columnDtl_def_sno4_num_typ_nm) doDtl_def_sno4_num_typ_nm_LC(info);
		else if (lc == columnDtl_def_sno4_ptn_cd) doDtl_def_sno4_ptn_cd_LC(info);
		else if (lc == columnDtl_def_sno4_ptn_nm) doDtl_def_sno4_ptn_nm_LC(info);
		else if (lc == columnDtl_def_mrkt_judg_role_cd) doDtl_def_mrkt_judg_role_cd_LC(info);
		else if (lc == columnDtl_def_mrkt_judg_role_nm) doDtl_def_mrkt_judg_role_nm_LC(info);
		else if (lc == columnDtl_def_mrkt_judg_upd_role_cd) doDtl_def_mrkt_judg_upd_role_cd_LC(info);
		else if (lc == columnDtl_def_mrkt_judg_upd_role_nm) doDtl_def_mrkt_judg_upd_role_nm_LC(info);
		else if (lc == columnDtl_def_plnt_aprv_role_cd) doDtl_def_plnt_aprv_role_cd_LC(info);
		else if (lc == columnDtl_def_plnt_aprv_role_nm) doDtl_def_plnt_aprv_role_nm_LC(info);
		else if (lc == columnDtl_def_insp_aprv_role_cd) doDtl_def_insp_aprv_role_cd_LC(info);
		else if (lc == columnDtl_def_insp_aprv_role_nm) doDtl_def_insp_aprv_role_nm_LC(info);
		else if (lc == columnDtl_def_mfg_aprv_role_cd) doDtl_def_mfg_aprv_role_cd_LC(info);
		else if (lc == columnDtl_def_mfg_aprv_role_nm) doDtl_def_mfg_aprv_role_nm_LC(info);
		else if (lc == columnDtl_def_sno_typ1) doDtl_def_sno_typ1_LC(info);
		else if (lc == columnDtl_def_sno_typ_nm1) doDtl_def_sno_typ_nm1_LC(info);
		else if (lc == columnDtl_def_sno_typ2) doDtl_def_sno_typ2_LC(info);
		else if (lc == columnDtl_def_sno_typ_nm2) doDtl_def_sno_typ_nm2_LC(info);
		else if (lc == columnDtl_def_sno_typ3) doDtl_def_sno_typ3_LC(info);
		else if (lc == columnDtl_def_sno_typ_nm3) doDtl_def_sno_typ_nm3_LC(info);
		else if (lc == columnDtl_def_sno_typ4) doDtl_def_sno_typ4_LC(info);
		else if (lc == columnDtl_def_sno_typ_nm4) doDtl_def_sno_typ_nm4_LC(info);
		else if (lc == columnDtl_def_alloc_ctl_typ) doDtl_def_alloc_ctl_typ_LC(info);
		else if (lc == columnDtl_def_alloc_ctl_typ_nm) doDtl_def_alloc_ctl_typ_nm_LC(info);
		else if (lc == columnDtl_def_inpt_ctl_typ) doDtl_def_inpt_ctl_typ_LC(info);
		else if (lc == columnDtl_def_inpt_ctl_typ_nm) doDtl_def_inpt_ctl_typ_nm_LC(info);
		else if (lc == columnDtl_def_bkf_typ) doDtl_def_bkf_typ_LC(info);
		else if (lc == columnDtl_def_bkf_typ_nm) doDtl_def_bkf_typ_nm_LC(info);
		else if (lc == columnDtl_def_calc_ptn_cd) doDtl_def_calc_ptn_cd_LC(info);
		else if (lc == columnDtl_def_calc_ptn_nm) doDtl_def_calc_ptn_nm_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
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
		else if (lc == columnLcl_itm_typ) doLcl_itm_typ_LC(info);
		else if (lc == columnLcl_itm_typ_nm) doLcl_itm_typ_nm_LC(info);
		else if (lc == columnLcl_itm_typ_d_cd) doLcl_itm_typ_d_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_itm_typ_d_nm) doLcl_itm_typ_d_nm_LC(info);
		else if (lc == columnLcl_memo1) doLcl_memo1_LC(info);
		else if (lc == columnLcl_memo2) doLcl_memo2_LC(info);
		else if (lc == columnLcl_memo3) doLcl_memo3_LC(info);
		else if (lc == columnLcl_ins_usr_id) doLcl_ins_usr_id_LC(info);
		else if (lc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_LC(info);
		else if (lc == columnLcl_ins_ts) doLcl_ins_ts_LC(info);
		else if (lc == columnLcl_ins_func_id) doLcl_ins_func_id_LC(info);
		else if (lc == columnLcl_ins_func_nm) doLcl_ins_func_nm_LC(info);
		else if (lc == columnLcl_upd_cntr) doLcl_upd_cntr_LC(info);
		else if (lc == columnLcl_upd_usr_id) doLcl_upd_usr_id_LC(info);
		else if (lc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_LC(info);
		else if (lc == columnLcl_upd_ts) doLcl_upd_ts_LC(info);
		else if (lc == columnLcl_upd_func_id) doLcl_upd_func_id_LC(info);
		else if (lc == columnLcl_upd_func_nm) doLcl_upd_func_nm_LC(info);
		else if (lc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_LC(info);
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_typ_d_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ac_itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ac_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ac_itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ac_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lot_no_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lot_no_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sublot_no_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sublot_no_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_spec_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_spec_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_comp_spec_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_comp_spec_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_spec_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_spec_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_spec_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_spec_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_bind_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_bind_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_bind_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_bind_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_lmt_ctl_categ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_lmt_ctl_categ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_valid_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_valid_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_valid_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_valid_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_upri_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sls_upri_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sls_upri_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_slo_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_slo_proc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_inst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_inst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_inst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_inst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_ship_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_ship_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_itm_ship_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_itm_ship_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_ship_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_ship_term_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_inst_unit_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_inst_unit_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_inst_unit_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_inst_unit_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_proc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_rqmt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_rqmt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_prod_pln_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_prod_pln_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_prod_pln_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_prod_pln_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_dmnd_date_div_mons]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_dmnd_date_div_mons_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_alloc_margin_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_alloc_margin_days_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_alloc_margin_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_alloc_margin_days_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrp_opn_xfr_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrp_opn_xfr_days_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_num_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_num_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno1_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno1_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_num_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_num_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno2_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno2_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_num_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_num_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno3_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno3_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_num_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_num_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno4_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno4_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_upd_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_upd_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mrkt_judg_upd_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mrkt_judg_upd_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_plnt_aprv_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_plnt_aprv_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_plnt_aprv_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_aprv_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_insp_aprv_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_insp_aprv_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_aprv_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_mfg_aprv_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_mfg_aprv_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_sno_typ_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_sno_typ_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_alloc_ctl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_alloc_ctl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_alloc_ctl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_alloc_ctl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_ctl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_ctl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_inpt_ctl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_inpt_ctl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bkf_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bkf_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bkf_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bkf_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ptn_nm_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_typ]の作成メソッド
	 */
	public MCList getDtl_itm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_itm_jnl_cd]の作成メソッド
	 */
	public MCList getDtl_def_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_ac_itm_grp_cd]の作成メソッド
	 */
	public MCList getDtl_def_ac_itm_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcItmGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_lot_mng_typ]の作成メソッド
	 */
	public MCList getDtl_def_lot_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLotMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_lot_no_typ]の作成メソッド
	 */
	public MCList getDtl_def_lot_no_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLotNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_lot_no_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_def_lot_no_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sublot_mng_typ]の作成メソッド
	 */
	public MCList getDtl_def_sublot_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSublotMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sublot_no_typ]の作成メソッド
	 */
	public MCList getDtl_def_sublot_no_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLotNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sublot_no_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_def_sublot_no_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_comp_spec_typ]の作成メソッド
	 */
	public MCList getDtl_def_comp_spec_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCompSpecTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_itm_spec_grp_cd]の作成メソッド
	 */
	public MCList getDtl_def_itm_spec_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSpecGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_insp_bind_typ]の作成メソッド
	 */
	public MCList getDtl_def_insp_bind_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspBindTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_ship_valid_grp_cd]の作成メソッド
	 */
	public MCList getDtl_def_ship_valid_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipValid(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sls_upri_grp_cd]の作成メソッド
	 */
	public MCList getDtl_def_sls_upri_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsUpriGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_slo_proc_typ]の作成メソッド
	 */
	public MCList getDtl_def_slo_proc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSloProcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_ship_inst_typ]の作成メソッド
	 */
	public MCList getDtl_def_ship_inst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipInstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_itm_ship_grp_cd]の作成メソッド
	 */
	public MCList getDtl_def_itm_ship_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmShipGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_ship_term_cd]の作成メソッド
	 */
	public MCList getDtl_def_ship_term_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipTerm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_mfg_inst_unit_typ]の作成メソッド
	 */
	public MCList getDtl_def_mfg_inst_unit_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMfgInstUnitTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_mrp_proc_typ]の作成メソッド
	 */
	public MCList getDtl_def_mrp_proc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMrpProcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_rqmt_typ]の作成メソッド
	 */
	public MCList getDtl_def_rqmt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRqmtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_prod_pln_typ]の作成メソッド
	 */
	public MCList getDtl_def_prod_pln_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProdPlnTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno1_mng_typ]の作成メソッド
	 */
	public MCList getDtl_def_sno1_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno1_num_typ]の作成メソッド
	 */
	public MCList getDtl_def_sno1_num_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno1_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_def_sno1_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno2_mng_typ]の作成メソッド
	 */
	public MCList getDtl_def_sno2_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno2_num_typ]の作成メソッド
	 */
	public MCList getDtl_def_sno2_num_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno2_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_def_sno2_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno3_mng_typ]の作成メソッド
	 */
	public MCList getDtl_def_sno3_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno3_num_typ]の作成メソッド
	 */
	public MCList getDtl_def_sno3_num_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno3_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_def_sno3_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno4_mng_typ]の作成メソッド
	 */
	public MCList getDtl_def_sno4_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno4_num_typ]の作成メソッド
	 */
	public MCList getDtl_def_sno4_num_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno4_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_def_sno4_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_mrkt_judg_role_cd]の作成メソッド
	 */
	public MCList getDtl_def_mrkt_judg_role_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_mrkt_judg_upd_role_cd]の作成メソッド
	 */
	public MCList getDtl_def_mrkt_judg_upd_role_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_plnt_aprv_role_cd]の作成メソッド
	 */
	public MCList getDtl_def_plnt_aprv_role_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_insp_aprv_role_cd]の作成メソッド
	 */
	public MCList getDtl_def_insp_aprv_role_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_mfg_aprv_role_cd]の作成メソッド
	 */
	public MCList getDtl_def_mfg_aprv_role_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno_typ1]の作成メソッド
	 */
	public MCList getDtl_def_sno_typ1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno_typ2]の作成メソッド
	 */
	public MCList getDtl_def_sno_typ2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno_typ3]の作成メソッド
	 */
	public MCList getDtl_def_sno_typ3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_sno_typ4]の作成メソッド
	 */
	public MCList getDtl_def_sno_typ4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_alloc_ctl_typ]の作成メソッド
	 */
	public MCList getDtl_def_alloc_ctl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocCtlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_inpt_ctl_typ]の作成メソッド
	 */
	public MCList getDtl_def_inpt_ctl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInptCtlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_bkf_typ]の作成メソッド
	 */
	public MCList getDtl_def_bkf_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBkfTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_calc_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_def_calc_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_itm_typ]の作成メソッド
	 */
	public MCList getLcl_itm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_itm_typ_d_cd]の作成メソッド
	 */
	public MCList getLcl_itm_typ_d_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0350.Srch01")) {
			return new MA_MABCL0350_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0350.Upd01")) {
			return new MA_MABCL0350_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0350.Del01")) {
			return new MA_MABCL0350_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0350_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0350_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0350_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0350_Srch01Bridge() {
			p_MA_MABCL0350_Srch01 = new MCParam(PDef.MA_MABCL0350_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0350_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0350.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0350.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0350.LclR.class));

			p_MA_MABCL0350_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0350_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0350_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0350_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0350_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0350.CndR up0() {
			return (mcframe.clientMABC.MABCP0350.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0350.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0350.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0350.LclR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0350.LclR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABCL0350_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0350.DtlR.class));
			p_MA_MABCL0350_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0350.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0350_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0350.DtlR>)p_MA_MABCL0350_Srch01.getContainerParam().getDownBlock(0));
			setLclAllL((MCList<mcframe.clientMABC.MABCP0350.LclR>)p_MA_MABCL0350_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDtlL().clear();
			getLclAllL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getLclAllL());
			return result;
		}
	}
	/**
	 * [MA_MABCL0350_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0350_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0350_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0350_Upd01Bridge() {
			p_MA_MABCL0350_Upd01 = new MCParam(PDef.MA_MABCL0350_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0350_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0350.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0350.LclR.class));
			// Down

			p_MA_MABCL0350_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0350_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0350_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0350_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0350_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0350_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0350.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0350.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0350.LclR> up1() {
			return (MCList<mcframe.clientMABC.MABCP0350.LclR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0350_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getLclAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABCL0350_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0350_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0350_Del01;

		/** コンストラクタ */
		protected MA_MABCL0350_Del01Bridge() {
			p_MA_MABCL0350_Del01 = new MCParam(PDef.MA_MABCL0350_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0350_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0350.DtlR.class));
			// Down

			p_MA_MABCL0350_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0350_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0350_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0350_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0350_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0350.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0350.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0350_Del01;
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