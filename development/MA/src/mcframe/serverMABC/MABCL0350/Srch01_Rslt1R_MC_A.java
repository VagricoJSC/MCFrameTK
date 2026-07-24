package mcframe.serverMABC.MABCL0350;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Srch01_Rslt1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt1R_MC_A extends MCConstRow {

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm_lcl = "itm_typ_d_nm_lcl";
	/**
	 * Standard item type details name 標準品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Sales 販売.<p>
	 *
	 */
	public static final String $def_sls_flg = "def_sls_flg";
	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public static final String $def_mfg_flg = "def_mfg_flg";
	/**
	 * Purchase 購買.<p>
	 *
	 */
	public static final String $def_purc_flg = "def_purc_flg";
	/**
	 * Inspection 検査.<p>
	 *
	 */
	public static final String $def_insp_flg = "def_insp_flg";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $def_itm_jnl_cd = "def_itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $def_itm_jnl_nm = "def_itm_jnl_nm";
	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public static final String $def_ac_itm_grp_cd = "def_ac_itm_grp_cd";
	/**
	 * Accounting item classification name 会計品目分類名.<p>
	 *
	 */
	public static final String $def_ac_itm_grp_nm = "def_ac_itm_grp_nm";
	/**
	 * Accept negative inventory マイナス在庫許可.<p>
	 *
	 */
	public static final String $def_minus_stk_flg = "def_minus_stk_flg";
	/**
	 * Disallow new lot input 新規ロット入力不可.<p>
	 *
	 */
	public static final String $def_not_new_lot_flg = "def_not_new_lot_flg";
	/**
	 * Check GI allocation 出庫引当確認.<p>
	 *
	 */
	public static final String $def_gi_alloc_flg = "def_gi_alloc_flg";
	/**
	 * SKU allocation 荷姿引当.<p>
	 *
	 */
	public static final String $def_pack_alloc_flg = "def_pack_alloc_flg";
	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public static final String $def_bp_lot_flg = "def_bp_lot_flg";
	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public static final String $def_comp_spec_typ = "def_comp_spec_typ";
	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public static final String $def_comp_spec_typ_nm = "def_comp_spec_typ_nm";
	/**
	 * Allow sales order configuration rev. 受注時構成改訂許可.<p>
	 *
	 */
	public static final String $def_comp_rev_at_slo_flg = "def_comp_rev_at_slo_flg";
	/**
	 * Configuration main item 構成主品目.<p>
	 *
	 */
	public static final String $def_comp_core_itm_flg = "def_comp_core_itm_flg";
	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public static final String $def_insp_bind_typ = "def_insp_bind_typ";
	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public static final String $def_insp_bind_typ_nm = "def_insp_bind_typ_nm";
	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public static final String $def_skip_chk_ship_flg = "def_skip_chk_ship_flg";
	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public static final String $def_itm_spec_grp_cd = "def_itm_spec_grp_cd";
	/**
	 * Item specification classification name 品目仕様分類名.<p>
	 *
	 */
	public static final String $def_itm_spec_grp_nm = "def_itm_spec_grp_nm";
	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public static final String $def_lmt_ctl_flg = "def_lmt_ctl_flg";
	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public static final String $def_lmt_ctl_categ = "def_lmt_ctl_categ";
	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public static final String $def_sls_upri_grp_cd = "def_sls_upri_grp_cd";
	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public static final String $def_sls_upri_grp_nm = "def_sls_upri_grp_nm";
	/**
	 * Sales order procurement item 受注手配品.<p>
	 *
	 */
	public static final String $def_slo_proc_flg = "def_slo_proc_flg";
	/**
	 * Sales order procurement type 受注手配区分.<p>
	 *
	 */
	public static final String $def_slo_proc_typ = "def_slo_proc_typ";
	/**
	 * Sales order procurement type name 受注手配区分名.<p>
	 *
	 */
	public static final String $def_slo_proc_typ_nm = "def_slo_proc_typ_nm";
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public static final String $def_ship_inst_typ = "def_ship_inst_typ";
	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public static final String $def_ship_inst_typ_nm = "def_ship_inst_typ_nm";
	/**
	 * Prohibit shipping lot reversal 出荷ロット逆転禁止.<p>
	 *
	 */
	public static final String $def_ship_lot_back_stop_flg = "def_ship_lot_back_stop_flg";
	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public static final String $def_itm_ship_grp_cd = "def_itm_ship_grp_cd";
	/**
	 * Item shipping group name 品目出荷グループ名.<p>
	 *
	 */
	public static final String $def_itm_ship_grp_nm = "def_itm_ship_grp_nm";
	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public static final String $def_ship_valid_grp_cd = "def_ship_valid_grp_cd";
	/**
	 * Shipping expiration date group name 出荷有効期限グループ名.<p>
	 *
	 */
	public static final String $def_ship_valid_grp_nm = "def_ship_valid_grp_nm";
	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public static final String $def_arr_skip_flg = "def_arr_skip_flg";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $def_ship_term_cd = "def_ship_term_cd";
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public static final String $def_ship_term_nm = "def_ship_term_nm";
	/**
	 * For identification tag output 現品票出力対象.<p>
	 *
	 */
	public static final String $def_stk_lst_flg = "def_stk_lst_flg";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $def_ver_flg = "def_ver_flg";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $def_mfg_inst_unit_typ = "def_mfg_inst_unit_typ";
	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public static final String $def_mfg_inst_unit_typ_nm = "def_mfg_inst_unit_typ_nm";
	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public static final String $def_sls_upri_cng_flg = "def_sls_upri_cng_flg";
	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public static final String $def_purc_upri_cng_flg = "def_purc_upri_cng_flg";
	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public static final String $def_prov_upri_cng_flg = "def_prov_upri_cng_flg";
	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public static final String $def_mrp_proc_typ = "def_mrp_proc_typ";
	/**
	 * MRP processing type name ＭＲＰ処理区分名.<p>
	 *
	 */
	public static final String $def_mrp_proc_typ_nm = "def_mrp_proc_typ_nm";
	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public static final String $def_rqmt_typ = "def_rqmt_typ";
	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public static final String $def_rqmt_typ_nm = "def_rqmt_typ_nm";
	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public static final String $def_prod_pln_typ = "def_prod_pln_typ";
	/**
	 * Production planning type name 生産計画立案区分名.<p>
	 *
	 */
	public static final String $def_prod_pln_typ_nm = "def_prod_pln_typ_nm";
	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public static final String $def_dmnd_date_div_mons = "def_dmnd_date_div_mons";
	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public static final String $def_alloc_margin_days = "def_alloc_margin_days";
	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public static final String $def_mrp_alloc_margin_days = "def_mrp_alloc_margin_days";
	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public static final String $def_mrp_opn_xfr_days = "def_mrp_opn_xfr_days";
	/**
	 * Allow input item addition 投入品追加許可.<p>
	 *
	 */
	public static final String $def_inpt_itm_add_flg = "def_inpt_itm_add_flg";
	/**
	 * Allow input item deletion 投入品削除許可.<p>
	 *
	 */
	public static final String $def_inpt_itm_del_flg = "def_inpt_itm_del_flg";
	/**
	 * Scheduler スケジューラ.<p>
	 *
	 */
	public static final String $def_sch_flg = "def_sch_flg";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $def_lot_mng_typ = "def_lot_mng_typ";
	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public static final String $def_lot_mng_typ_nm = "def_lot_mng_typ_nm";
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $def_lot_no_typ = "def_lot_no_typ";
	/**
	 * Lot No. numbering type name ロットＮＯ発番区分名.<p>
	 *
	 */
	public static final String $def_lot_no_typ_nm = "def_lot_no_typ_nm";
	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $def_lot_no_ptn_cd = "def_lot_no_ptn_cd";
	/**
	 * Lot No. numbering pattern name ロットＮＯ発番パタン名.<p>
	 *
	 */
	public static final String $def_lot_no_ptn_nm = "def_lot_no_ptn_nm";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $def_sublot_mng_typ = "def_sublot_mng_typ";
	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public static final String $def_sublot_mng_typ_nm = "def_sublot_mng_typ_nm";
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $def_sublot_no_typ = "def_sublot_no_typ";
	/**
	 * Sublot No. numbering type name サブロットＮＯ発番区分名.<p>
	 *
	 */
	public static final String $def_sublot_no_typ_nm = "def_sublot_no_typ_nm";
	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $def_sublot_no_ptn_cd = "def_sublot_no_ptn_cd";
	/**
	 * Sublot No. numbering pattern name サブロットＮＯ発番パタン名.<p>
	 *
	 */
	public static final String $def_sublot_no_ptn_nm = "def_sublot_no_ptn_nm";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $def_sno1_mng_typ = "def_sno1_mng_typ";
	/**
	 * SEIBAN No. 1 management type name 手配ＮＯ１管理区分名.<p>
	 *
	 */
	public static final String $def_sno1_mng_typ_nm = "def_sno1_mng_typ_nm";
	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public static final String $def_slo_sno1_flg = "def_slo_sno1_flg";
	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public static final String $def_rqmt_sno1_flg = "def_rqmt_sno1_flg";
	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public static final String $def_sno1_num_typ = "def_sno1_num_typ";
	/**
	 * SEIBAN No. 1 numbering type name 手配ＮＯ１発番区分名.<p>
	 *
	 */
	public static final String $def_sno1_num_typ_nm = "def_sno1_num_typ_nm";
	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public static final String $def_sno1_ptn_cd = "def_sno1_ptn_cd";
	/**
	 * SEIBAN No. 1 numbering pattern name 手配ＮＯ１発番パタン名.<p>
	 *
	 */
	public static final String $def_sno1_ptn_nm = "def_sno1_ptn_nm";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $def_sno2_mng_typ = "def_sno2_mng_typ";
	/**
	 * SEIBAN No. 2 management type name 手配ＮＯ２管理区分名.<p>
	 *
	 */
	public static final String $def_sno2_mng_typ_nm = "def_sno2_mng_typ_nm";
	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public static final String $def_slo_sno2_flg = "def_slo_sno2_flg";
	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public static final String $def_rqmt_sno2_flg = "def_rqmt_sno2_flg";
	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public static final String $def_sno2_num_typ = "def_sno2_num_typ";
	/**
	 * SEIBAN No. 2 numbering type name 手配ＮＯ２発番区分名.<p>
	 *
	 */
	public static final String $def_sno2_num_typ_nm = "def_sno2_num_typ_nm";
	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public static final String $def_sno2_ptn_cd = "def_sno2_ptn_cd";
	/**
	 * SEIBAN No. 2 numbering pattern name 手配ＮＯ２発番パタン名.<p>
	 *
	 */
	public static final String $def_sno2_ptn_nm = "def_sno2_ptn_nm";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $def_sno3_mng_typ = "def_sno3_mng_typ";
	/**
	 * SEIBAN No. 3 management type name 手配ＮＯ３管理区分名.<p>
	 *
	 */
	public static final String $def_sno3_mng_typ_nm = "def_sno3_mng_typ_nm";
	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public static final String $def_slo_sno3_flg = "def_slo_sno3_flg";
	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public static final String $def_rqmt_sno3_flg = "def_rqmt_sno3_flg";
	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public static final String $def_sno3_num_typ = "def_sno3_num_typ";
	/**
	 * SEIBAN No. 3 numbering type name 手配ＮＯ３発番区分名.<p>
	 *
	 */
	public static final String $def_sno3_num_typ_nm = "def_sno3_num_typ_nm";
	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public static final String $def_sno3_ptn_cd = "def_sno3_ptn_cd";
	/**
	 * SEIBAN No. 3 numbering pattern name 手配ＮＯ３発番パタン名.<p>
	 *
	 */
	public static final String $def_sno3_ptn_nm = "def_sno3_ptn_nm";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $def_sno4_mng_typ = "def_sno4_mng_typ";
	/**
	 * SEIBAN No. 4 management type name 手配ＮＯ４管理区分名.<p>
	 *
	 */
	public static final String $def_sno4_mng_typ_nm = "def_sno4_mng_typ_nm";
	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public static final String $def_slo_sno4_flg = "def_slo_sno4_flg";
	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public static final String $def_rqmt_sno4_flg = "def_rqmt_sno4_flg";
	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public static final String $def_sno4_num_typ = "def_sno4_num_typ";
	/**
	 * SEIBAN No. 4 numbering type name 手配ＮＯ４発番区分名.<p>
	 *
	 */
	public static final String $def_sno4_num_typ_nm = "def_sno4_num_typ_nm";
	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public static final String $def_sno4_ptn_cd = "def_sno4_ptn_cd";
	/**
	 * SEIBAN No. 4 numbering pattern name 手配ＮＯ４発番パタン名.<p>
	 *
	 */
	public static final String $def_sno4_ptn_nm = "def_sno4_ptn_nm";
	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public static final String $def_mrkt_judg_flg = "def_mrkt_judg_flg";
	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public static final String $def_mrkt_judg_role_cd = "def_mrkt_judg_role_cd";
	/**
	 * Market release decision approval role name 市場出荷判定承認役割名.<p>
	 *
	 */
	public static final String $def_mrkt_judg_role_nm = "def_mrkt_judg_role_nm";
	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public static final String $def_mrkt_judg_upd_role_cd = "def_mrkt_judg_upd_role_cd";
	/**
	 * Market release decision updating role name 市場出荷判定更新役割名.<p>
	 *
	 */
	public static final String $def_mrkt_judg_upd_role_nm = "def_mrkt_judg_upd_role_nm";
	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public static final String $def_plnt_aprv_flg = "def_plnt_aprv_flg";
	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public static final String $def_plnt_aprv_role_cd = "def_plnt_aprv_role_cd";
	/**
	 * Factory release approval role name 工場出荷承認役割名.<p>
	 *
	 */
	public static final String $def_plnt_aprv_role_nm = "def_plnt_aprv_role_nm";
	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public static final String $def_insp_aprv_flg = "def_insp_aprv_flg";
	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public static final String $def_insp_aprv_role_cd = "def_insp_aprv_role_cd";
	/**
	 * Inspection approval role name 検査承認役割名.<p>
	 *
	 */
	public static final String $def_insp_aprv_role_nm = "def_insp_aprv_role_nm";
	/**
	 * For mfg. approval 製造承認対象.<p>
	 *
	 */
	public static final String $def_mfg_aprv_flg = "def_mfg_aprv_flg";
	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public static final String $def_mfg_aprv_role_cd = "def_mfg_aprv_role_cd";
	/**
	 * Mfg. approval role name 製造承認役割名.<p>
	 *
	 */
	public static final String $def_mfg_aprv_role_nm = "def_mfg_aprv_role_nm";
	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public static final String $def_sno_typ1 = "def_sno_typ1";
	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public static final String $def_sno_typ_nm1 = "def_sno_typ_nm1";
	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public static final String $def_sno_typ2 = "def_sno_typ2";
	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public static final String $def_sno_typ_nm2 = "def_sno_typ_nm2";
	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public static final String $def_sno_typ3 = "def_sno_typ3";
	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public static final String $def_sno_typ_nm3 = "def_sno_typ_nm3";
	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public static final String $def_sno_typ4 = "def_sno_typ4";
	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public static final String $def_sno_typ_nm4 = "def_sno_typ_nm4";
	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public static final String $def_inst_lot_fix_flg = "def_inst_lot_fix_flg";
	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public static final String $def_lot_mix_flg = "def_lot_mix_flg";
	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public static final String $def_sublot_mix_flg = "def_sublot_mix_flg";
	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public static final String $def_alloc_ctl_typ = "def_alloc_ctl_typ";
	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public static final String $def_alloc_ctl_typ_nm = "def_alloc_ctl_typ_nm";
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public static final String $def_inpt_ctl_typ = "def_inpt_ctl_typ";
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public static final String $def_inpt_ctl_typ_nm = "def_inpt_ctl_typ_nm";
	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public static final String $def_bkf_typ = "def_bkf_typ";
	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public static final String $def_bkf_typ_nm = "def_bkf_typ_nm";
	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public static final String $def_main_itm_flg = "def_main_itm_flg";
	/**
	 * By-product 副産品.<p>
	 *
	 */
	public static final String $def_byprod_flg = "def_byprod_flg";
	/**
	 * Not costing (BOM) 原価対象外（ＢＯＭ）.<p>
	 *
	 */
	public static final String $def_not_cost_bom_flg = "def_not_cost_bom_flg";
	/**
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public static final String $def_calc_ptn_cd = "def_calc_ptn_cd";
	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public static final String $def_calc_ptn_nm = "def_calc_ptn_nm";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";


	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_lcl_META = createCommonMeta($itm_typ_d_nm_lcl, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta def_sls_flg_META = createCommonMeta($def_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_mfg_flg_META = createCommonMeta($def_mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_purc_flg_META = createCommonMeta($def_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_insp_flg_META = createCommonMeta($def_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_itm_jnl_cd_META = createCommonMeta($def_itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta def_itm_jnl_nm_META = createCommonMeta($def_itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta def_ac_itm_grp_cd_META = createCommonMeta($def_ac_itm_grp_cd, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_CD);
	public static final MCMeta def_ac_itm_grp_nm_META = createCommonMeta($def_ac_itm_grp_nm, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_NM);
	public static final MCMeta def_minus_stk_flg_META = createCommonMeta($def_minus_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_not_new_lot_flg_META = createCommonMeta($def_not_new_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_gi_alloc_flg_META = createCommonMeta($def_gi_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_pack_alloc_flg_META = createCommonMeta($def_pack_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_bp_lot_flg_META = createCommonMeta($def_bp_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_comp_spec_typ_META = createCommonMeta($def_comp_spec_typ, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP);
	public static final MCMeta def_comp_spec_typ_nm_META = createCommonMeta($def_comp_spec_typ_nm, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP_NM);
	public static final MCMeta def_comp_rev_at_slo_flg_META = createCommonMeta($def_comp_rev_at_slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_comp_core_itm_flg_META = createCommonMeta($def_comp_core_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_insp_bind_typ_META = createCommonMeta($def_insp_bind_typ, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP);
	public static final MCMeta def_insp_bind_typ_nm_META = createCommonMeta($def_insp_bind_typ_nm, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP_NM);
	public static final MCMeta def_skip_chk_ship_flg_META = createCommonMeta($def_skip_chk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_itm_spec_grp_cd_META = createCommonMeta($def_itm_spec_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SPEC_GRP_CD);
	public static final MCMeta def_itm_spec_grp_nm_META = createCommonMeta($def_itm_spec_grp_nm, mcframe.commonMA.meta.MA_META.ITM_SPEC_GRP_NM);
	public static final MCMeta def_lmt_ctl_flg_META = createCommonMeta($def_lmt_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_lmt_ctl_categ_META = createCommonMeta($def_lmt_ctl_categ, mcframe.commonMA.meta.MA_META.LMT_CTL_CATEG);
	public static final MCMeta def_sls_upri_grp_cd_META = createCommonMeta($def_sls_upri_grp_cd, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_CD);
	public static final MCMeta def_sls_upri_grp_nm_META = createCommonMeta($def_sls_upri_grp_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_NM);
	public static final MCMeta def_slo_proc_flg_META = createCommonMeta($def_slo_proc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_slo_proc_typ_META = createCommonMeta($def_slo_proc_typ, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP);
	public static final MCMeta def_slo_proc_typ_nm_META = createCommonMeta($def_slo_proc_typ_nm, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP_NM);
	public static final MCMeta def_ship_inst_typ_META = createCommonMeta($def_ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta def_ship_inst_typ_nm_META = createCommonMeta($def_ship_inst_typ_nm, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP_NM);
	public static final MCMeta def_ship_lot_back_stop_flg_META = createCommonMeta($def_ship_lot_back_stop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_itm_ship_grp_cd_META = createCommonMeta($def_itm_ship_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_CD);
	public static final MCMeta def_itm_ship_grp_nm_META = createCommonMeta($def_itm_ship_grp_nm, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_NM);
	public static final MCMeta def_ship_valid_grp_cd_META = createCommonMeta($def_ship_valid_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_VALID_GRP_CD);
	public static final MCMeta def_ship_valid_grp_nm_META = createCommonMeta($def_ship_valid_grp_nm, mcframe.commonMA.meta.MA_META.SHIP_VALID_GRP_NM);
	public static final MCMeta def_arr_skip_flg_META = createCommonMeta($def_arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_ship_term_cd_META = createCommonMeta($def_ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta def_ship_term_nm_META = createCommonMeta($def_ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta def_stk_lst_flg_META = createCommonMeta($def_stk_lst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_ver_flg_META = createCommonMeta($def_ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_mfg_inst_unit_typ_META = createCommonMeta($def_mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta def_mfg_inst_unit_typ_nm_META = createCommonMeta($def_mfg_inst_unit_typ_nm, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP_NM);
	public static final MCMeta def_sls_upri_cng_flg_META = createCommonMeta($def_sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_purc_upri_cng_flg_META = createCommonMeta($def_purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_prov_upri_cng_flg_META = createCommonMeta($def_prov_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_mrp_proc_typ_META = createCommonMeta($def_mrp_proc_typ, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP);
	public static final MCMeta def_mrp_proc_typ_nm_META = createCommonMeta($def_mrp_proc_typ_nm, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP_NM);
	public static final MCMeta def_rqmt_typ_META = createCommonMeta($def_rqmt_typ, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta def_rqmt_typ_nm_META = createCommonMeta($def_rqmt_typ_nm, mcframe.commonMA.meta.MA_META.RQMT_TYP_NM);
	public static final MCMeta def_prod_pln_typ_META = createCommonMeta($def_prod_pln_typ, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta def_prod_pln_typ_nm_META = createCommonMeta($def_prod_pln_typ_nm, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP_NM);
	public static final MCMeta def_dmnd_date_div_mons_META = createCommonMeta($def_dmnd_date_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta def_alloc_margin_days_META = createCommonMeta($def_alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta def_mrp_alloc_margin_days_META = createCommonMeta($def_mrp_alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta def_mrp_opn_xfr_days_META = createCommonMeta($def_mrp_opn_xfr_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta def_inpt_itm_add_flg_META = createCommonMeta($def_inpt_itm_add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_inpt_itm_del_flg_META = createCommonMeta($def_inpt_itm_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_sch_flg_META = createCommonMeta($def_sch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_lot_mng_typ_META = createCommonMeta($def_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta def_lot_mng_typ_nm_META = createCommonMeta($def_lot_mng_typ_nm, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP_NM);
	public static final MCMeta def_lot_no_typ_META = createCommonMeta($def_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta def_lot_no_typ_nm_META = createCommonMeta($def_lot_no_typ_nm, mcframe.commonMA.meta.MA_META.LOT_NO_TYP_NM);
	public static final MCMeta def_lot_no_ptn_cd_META = createCommonMeta($def_lot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta def_lot_no_ptn_nm_META = createCommonMeta($def_lot_no_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta def_sublot_mng_typ_META = createCommonMeta($def_sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta def_sublot_mng_typ_nm_META = createCommonMeta($def_sublot_mng_typ_nm, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP_NM);
	public static final MCMeta def_sublot_no_typ_META = createCommonMeta($def_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta def_sublot_no_typ_nm_META = createCommonMeta($def_sublot_no_typ_nm, mcframe.commonMA.meta.MA_META.LOT_NO_TYP_NM);
	public static final MCMeta def_sublot_no_ptn_cd_META = createCommonMeta($def_sublot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta def_sublot_no_ptn_nm_META = createCommonMeta($def_sublot_no_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta def_sno1_mng_typ_META = createCommonMeta($def_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta def_sno1_mng_typ_nm_META = createCommonMeta($def_sno1_mng_typ_nm, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP_NM);
	public static final MCMeta def_slo_sno1_flg_META = createCommonMeta($def_slo_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_rqmt_sno1_flg_META = createCommonMeta($def_rqmt_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_sno1_num_typ_META = createCommonMeta($def_sno1_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta def_sno1_num_typ_nm_META = createCommonMeta($def_sno1_num_typ_nm, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP_NM);
	public static final MCMeta def_sno1_ptn_cd_META = createCommonMeta($def_sno1_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta def_sno1_ptn_nm_META = createCommonMeta($def_sno1_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta def_sno2_mng_typ_META = createCommonMeta($def_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta def_sno2_mng_typ_nm_META = createCommonMeta($def_sno2_mng_typ_nm, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP_NM);
	public static final MCMeta def_slo_sno2_flg_META = createCommonMeta($def_slo_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_rqmt_sno2_flg_META = createCommonMeta($def_rqmt_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_sno2_num_typ_META = createCommonMeta($def_sno2_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta def_sno2_num_typ_nm_META = createCommonMeta($def_sno2_num_typ_nm, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP_NM);
	public static final MCMeta def_sno2_ptn_cd_META = createCommonMeta($def_sno2_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta def_sno2_ptn_nm_META = createCommonMeta($def_sno2_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta def_sno3_mng_typ_META = createCommonMeta($def_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta def_sno3_mng_typ_nm_META = createCommonMeta($def_sno3_mng_typ_nm, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP_NM);
	public static final MCMeta def_slo_sno3_flg_META = createCommonMeta($def_slo_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_rqmt_sno3_flg_META = createCommonMeta($def_rqmt_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_sno3_num_typ_META = createCommonMeta($def_sno3_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta def_sno3_num_typ_nm_META = createCommonMeta($def_sno3_num_typ_nm, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP_NM);
	public static final MCMeta def_sno3_ptn_cd_META = createCommonMeta($def_sno3_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta def_sno3_ptn_nm_META = createCommonMeta($def_sno3_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta def_sno4_mng_typ_META = createCommonMeta($def_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta def_sno4_mng_typ_nm_META = createCommonMeta($def_sno4_mng_typ_nm, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP_NM);
	public static final MCMeta def_slo_sno4_flg_META = createCommonMeta($def_slo_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_rqmt_sno4_flg_META = createCommonMeta($def_rqmt_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_sno4_num_typ_META = createCommonMeta($def_sno4_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta def_sno4_num_typ_nm_META = createCommonMeta($def_sno4_num_typ_nm, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP_NM);
	public static final MCMeta def_sno4_ptn_cd_META = createCommonMeta($def_sno4_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta def_sno4_ptn_nm_META = createCommonMeta($def_sno4_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta def_mrkt_judg_flg_META = createCommonMeta($def_mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_mrkt_judg_role_cd_META = createCommonMeta($def_mrkt_judg_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta def_mrkt_judg_role_nm_META = createCommonMeta($def_mrkt_judg_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta def_mrkt_judg_upd_role_cd_META = createCommonMeta($def_mrkt_judg_upd_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta def_mrkt_judg_upd_role_nm_META = createCommonMeta($def_mrkt_judg_upd_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta def_plnt_aprv_flg_META = createCommonMeta($def_plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_plnt_aprv_role_cd_META = createCommonMeta($def_plnt_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta def_plnt_aprv_role_nm_META = createCommonMeta($def_plnt_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta def_insp_aprv_flg_META = createCommonMeta($def_insp_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_insp_aprv_role_cd_META = createCommonMeta($def_insp_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta def_insp_aprv_role_nm_META = createCommonMeta($def_insp_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta def_mfg_aprv_flg_META = createCommonMeta($def_mfg_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_mfg_aprv_role_cd_META = createCommonMeta($def_mfg_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta def_mfg_aprv_role_nm_META = createCommonMeta($def_mfg_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta def_sno_typ1_META = createCommonMeta($def_sno_typ1, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta def_sno_typ_nm1_META = createCommonMeta($def_sno_typ_nm1, mcframe.commonMA.meta.MA_META.SNO_TYP_NM);
	public static final MCMeta def_sno_typ2_META = createCommonMeta($def_sno_typ2, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta def_sno_typ_nm2_META = createCommonMeta($def_sno_typ_nm2, mcframe.commonMA.meta.MA_META.SNO_TYP_NM);
	public static final MCMeta def_sno_typ3_META = createCommonMeta($def_sno_typ3, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta def_sno_typ_nm3_META = createCommonMeta($def_sno_typ_nm3, mcframe.commonMA.meta.MA_META.SNO_TYP_NM);
	public static final MCMeta def_sno_typ4_META = createCommonMeta($def_sno_typ4, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta def_sno_typ_nm4_META = createCommonMeta($def_sno_typ_nm4, mcframe.commonMA.meta.MA_META.SNO_TYP_NM);
	public static final MCMeta def_inst_lot_fix_flg_META = createCommonMeta($def_inst_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_lot_mix_flg_META = createCommonMeta($def_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_sublot_mix_flg_META = createCommonMeta($def_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_alloc_ctl_typ_META = createCommonMeta($def_alloc_ctl_typ, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP);
	public static final MCMeta def_alloc_ctl_typ_nm_META = createCommonMeta($def_alloc_ctl_typ_nm, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP_NM);
	public static final MCMeta def_inpt_ctl_typ_META = createCommonMeta($def_inpt_ctl_typ, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP);
	public static final MCMeta def_inpt_ctl_typ_nm_META = createCommonMeta($def_inpt_ctl_typ_nm, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP_NM);
	public static final MCMeta def_bkf_typ_META = createCommonMeta($def_bkf_typ, mcframe.commonMA.meta.MA_META.BKF_TYP);
	public static final MCMeta def_bkf_typ_nm_META = createCommonMeta($def_bkf_typ_nm, mcframe.commonMA.meta.MA_META.BKF_TYP_NM);
	public static final MCMeta def_main_itm_flg_META = createCommonMeta($def_main_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_byprod_flg_META = createCommonMeta($def_byprod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_not_cost_bom_flg_META = createCommonMeta($def_not_cost_bom_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_calc_ptn_cd_META = createCommonMeta($def_calc_ptn_cd, mcframe.commonMA.meta.MA_META.CALC_PTN_CD);
	public static final MCMeta def_calc_ptn_nm_META = createCommonMeta($def_calc_ptn_nm, mcframe.commonMA.meta.MA_META.CALC_PTN_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_lcl_META,
			itm_typ_d_nm_META,
			def_sls_flg_META,
			def_mfg_flg_META,
			def_purc_flg_META,
			def_insp_flg_META,
			def_itm_jnl_cd_META,
			def_itm_jnl_nm_META,
			def_ac_itm_grp_cd_META,
			def_ac_itm_grp_nm_META,
			def_minus_stk_flg_META,
			def_not_new_lot_flg_META,
			def_gi_alloc_flg_META,
			def_pack_alloc_flg_META,
			def_bp_lot_flg_META,
			def_comp_spec_typ_META,
			def_comp_spec_typ_nm_META,
			def_comp_rev_at_slo_flg_META,
			def_comp_core_itm_flg_META,
			def_insp_bind_typ_META,
			def_insp_bind_typ_nm_META,
			def_skip_chk_ship_flg_META,
			def_itm_spec_grp_cd_META,
			def_itm_spec_grp_nm_META,
			def_lmt_ctl_flg_META,
			def_lmt_ctl_categ_META,
			def_sls_upri_grp_cd_META,
			def_sls_upri_grp_nm_META,
			def_slo_proc_flg_META,
			def_slo_proc_typ_META,
			def_slo_proc_typ_nm_META,
			def_ship_inst_typ_META,
			def_ship_inst_typ_nm_META,
			def_ship_lot_back_stop_flg_META,
			def_itm_ship_grp_cd_META,
			def_itm_ship_grp_nm_META,
			def_ship_valid_grp_cd_META,
			def_ship_valid_grp_nm_META,
			def_arr_skip_flg_META,
			def_ship_term_cd_META,
			def_ship_term_nm_META,
			def_stk_lst_flg_META,
			def_ver_flg_META,
			def_mfg_inst_unit_typ_META,
			def_mfg_inst_unit_typ_nm_META,
			def_sls_upri_cng_flg_META,
			def_purc_upri_cng_flg_META,
			def_prov_upri_cng_flg_META,
			def_mrp_proc_typ_META,
			def_mrp_proc_typ_nm_META,
			def_rqmt_typ_META,
			def_rqmt_typ_nm_META,
			def_prod_pln_typ_META,
			def_prod_pln_typ_nm_META,
			def_dmnd_date_div_mons_META,
			def_alloc_margin_days_META,
			def_mrp_alloc_margin_days_META,
			def_mrp_opn_xfr_days_META,
			def_inpt_itm_add_flg_META,
			def_inpt_itm_del_flg_META,
			def_sch_flg_META,
			def_lot_mng_typ_META,
			def_lot_mng_typ_nm_META,
			def_lot_no_typ_META,
			def_lot_no_typ_nm_META,
			def_lot_no_ptn_cd_META,
			def_lot_no_ptn_nm_META,
			def_sublot_mng_typ_META,
			def_sublot_mng_typ_nm_META,
			def_sublot_no_typ_META,
			def_sublot_no_typ_nm_META,
			def_sublot_no_ptn_cd_META,
			def_sublot_no_ptn_nm_META,
			def_sno1_mng_typ_META,
			def_sno1_mng_typ_nm_META,
			def_slo_sno1_flg_META,
			def_rqmt_sno1_flg_META,
			def_sno1_num_typ_META,
			def_sno1_num_typ_nm_META,
			def_sno1_ptn_cd_META,
			def_sno1_ptn_nm_META,
			def_sno2_mng_typ_META,
			def_sno2_mng_typ_nm_META,
			def_slo_sno2_flg_META,
			def_rqmt_sno2_flg_META,
			def_sno2_num_typ_META,
			def_sno2_num_typ_nm_META,
			def_sno2_ptn_cd_META,
			def_sno2_ptn_nm_META,
			def_sno3_mng_typ_META,
			def_sno3_mng_typ_nm_META,
			def_slo_sno3_flg_META,
			def_rqmt_sno3_flg_META,
			def_sno3_num_typ_META,
			def_sno3_num_typ_nm_META,
			def_sno3_ptn_cd_META,
			def_sno3_ptn_nm_META,
			def_sno4_mng_typ_META,
			def_sno4_mng_typ_nm_META,
			def_slo_sno4_flg_META,
			def_rqmt_sno4_flg_META,
			def_sno4_num_typ_META,
			def_sno4_num_typ_nm_META,
			def_sno4_ptn_cd_META,
			def_sno4_ptn_nm_META,
			def_mrkt_judg_flg_META,
			def_mrkt_judg_role_cd_META,
			def_mrkt_judg_role_nm_META,
			def_mrkt_judg_upd_role_cd_META,
			def_mrkt_judg_upd_role_nm_META,
			def_plnt_aprv_flg_META,
			def_plnt_aprv_role_cd_META,
			def_plnt_aprv_role_nm_META,
			def_insp_aprv_flg_META,
			def_insp_aprv_role_cd_META,
			def_insp_aprv_role_nm_META,
			def_mfg_aprv_flg_META,
			def_mfg_aprv_role_cd_META,
			def_mfg_aprv_role_nm_META,
			def_sno_typ1_META,
			def_sno_typ_nm1_META,
			def_sno_typ2_META,
			def_sno_typ_nm2_META,
			def_sno_typ3_META,
			def_sno_typ_nm3_META,
			def_sno_typ4_META,
			def_sno_typ_nm4_META,
			def_inst_lot_fix_flg_META,
			def_lot_mix_flg_META,
			def_sublot_mix_flg_META,
			def_alloc_ctl_typ_META,
			def_alloc_ctl_typ_nm_META,
			def_inpt_ctl_typ_META,
			def_inpt_ctl_typ_nm_META,
			def_bkf_typ_META,
			def_bkf_typ_nm_META,
			def_main_itm_flg_META,
			def_byprod_flg_META,
			def_not_cost_bom_flg_META,
			def_calc_ptn_cd_META,
			def_calc_ptn_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$def_comp_spec_typ, "MAC_COMP_SPEC_TYP"},	// def_comp_spec_typ
				{$def_insp_bind_typ, "MAC_INSP_BIND_TYP"},	// def_insp_bind_typ
				{$def_slo_proc_typ, "MAC_SLO_PROC_TYP"},	// def_slo_proc_typ
				{$def_ship_inst_typ, "MAC_SHIP_INST_TYP"},	// def_ship_inst_typ
				{$def_mfg_inst_unit_typ, "MAC_MFG_INST_UNIT_TYP"},	// def_mfg_inst_unit_typ
				{$def_mrp_proc_typ, "MAC_MRP_PROC_TYP"},	// def_mrp_proc_typ
				{$def_rqmt_typ, "MAC_RQMT_TYP"},	// def_rqmt_typ
				{$def_prod_pln_typ, "MAC_PROD_PLN_TYP"},	// def_prod_pln_typ
				{$def_lot_mng_typ, "MAC_LOT_MNG_TYP"},	// def_lot_mng_typ
				{$def_lot_no_typ, "MAC_LOT_NO_TYP"},	// def_lot_no_typ
				{$def_sublot_mng_typ, "MAC_SUBLOT_MNG_TYP"},	// def_sublot_mng_typ
				{$def_sublot_no_typ, "MAC_LOT_NO_TYP"},	// def_sublot_no_typ
				{$def_sno1_mng_typ, "MAC_SNO_MNG_TYP"},	// def_sno1_mng_typ
				{$def_sno1_num_typ, "MAC_SNO_NO_TYP"},	// def_sno1_num_typ
				{$def_sno2_mng_typ, "MAC_SNO_MNG_TYP"},	// def_sno2_mng_typ
				{$def_sno2_num_typ, "MAC_SNO_NO_TYP"},	// def_sno2_num_typ
				{$def_sno3_mng_typ, "MAC_SNO_MNG_TYP"},	// def_sno3_mng_typ
				{$def_sno3_num_typ, "MAC_SNO_NO_TYP"},	// def_sno3_num_typ
				{$def_sno4_mng_typ, "MAC_SNO_MNG_TYP"},	// def_sno4_mng_typ
				{$def_sno4_num_typ, "MAC_SNO_NO_TYP"},	// def_sno4_num_typ
				{$def_sno_typ1, "MAC_SNO_TYP"},	// def_sno_typ1
				{$def_sno_typ2, "MAC_SNO_TYP"},	// def_sno_typ2
				{$def_sno_typ3, "MAC_SNO_TYP"},	// def_sno_typ3
				{$def_sno_typ4, "MAC_SNO_TYP"},	// def_sno_typ4
				{$def_alloc_ctl_typ, "MAC_ALLOC_CTL_TYP"},	// def_alloc_ctl_typ
				{$def_inpt_ctl_typ, "MAC_INPT_CTL_TYP"},	// def_inpt_ctl_typ
				{$def_bkf_typ, "MAC_BKF_TYP"}	// def_bkf_typ
			}
		))
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected Srch01_Rslt1R_MC_A(ConstMetaList<? extends Srch01_Rslt1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R clone() {
		return (Srch01_Rslt1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R createInstance() {
		return (Srch01_Rslt1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R getValues(String... names) {
		return (Srch01_Rslt1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 0, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 0, $del_flg, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 1, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 1, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 2, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 2, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 3, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 3, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm_lcl() {
		return getConstString(offset + 4, $itm_typ_d_nm_lcl);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm_lcl(String value) {
		setConstString(offset + 4, $itm_typ_d_nm_lcl, value);
	}


	/**
	 * Standard item type details name 標準品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 5, $itm_typ_d_nm);
	}

	/**
	 * Standard item type details name 標準品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 5, $itm_typ_d_nm, value);
	}


	/**
	 * Sales 販売.<p>
	 *
	 */
	public boolean def_sls_flg() {
		return getConstBoolean(offset + 6, $def_sls_flg);
	}

	/**
	 * Sales 販売.<p>
	 *
	 */
	public void def_sls_flg(boolean value) {
		setConstBoolean(offset + 6, $def_sls_flg, value);
	}


	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public boolean def_mfg_flg() {
		return getConstBoolean(offset + 7, $def_mfg_flg);
	}

	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public void def_mfg_flg(boolean value) {
		setConstBoolean(offset + 7, $def_mfg_flg, value);
	}


	/**
	 * Purchase 購買.<p>
	 *
	 */
	public boolean def_purc_flg() {
		return getConstBoolean(offset + 8, $def_purc_flg);
	}

	/**
	 * Purchase 購買.<p>
	 *
	 */
	public void def_purc_flg(boolean value) {
		setConstBoolean(offset + 8, $def_purc_flg, value);
	}


	/**
	 * Inspection 検査.<p>
	 *
	 */
	public boolean def_insp_flg() {
		return getConstBoolean(offset + 9, $def_insp_flg);
	}

	/**
	 * Inspection 検査.<p>
	 *
	 */
	public void def_insp_flg(boolean value) {
		setConstBoolean(offset + 9, $def_insp_flg, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String def_itm_jnl_cd() {
		return getConstString(offset + 10, $def_itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void def_itm_jnl_cd(String value) {
		setConstString(offset + 10, $def_itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String def_itm_jnl_nm() {
		return getConstString(offset + 11, $def_itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void def_itm_jnl_nm(String value) {
		setConstString(offset + 11, $def_itm_jnl_nm, value);
	}


	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public String def_ac_itm_grp_cd() {
		return getConstString(offset + 12, $def_ac_itm_grp_cd);
	}

	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public void def_ac_itm_grp_cd(String value) {
		setConstString(offset + 12, $def_ac_itm_grp_cd, value);
	}


	/**
	 * Accounting item classification name 会計品目分類名.<p>
	 *
	 */
	public String def_ac_itm_grp_nm() {
		return getConstString(offset + 13, $def_ac_itm_grp_nm);
	}

	/**
	 * Accounting item classification name 会計品目分類名.<p>
	 *
	 */
	public void def_ac_itm_grp_nm(String value) {
		setConstString(offset + 13, $def_ac_itm_grp_nm, value);
	}


	/**
	 * Accept negative inventory マイナス在庫許可.<p>
	 *
	 */
	public boolean def_minus_stk_flg() {
		return getConstBoolean(offset + 14, $def_minus_stk_flg);
	}

	/**
	 * Accept negative inventory マイナス在庫許可.<p>
	 *
	 */
	public void def_minus_stk_flg(boolean value) {
		setConstBoolean(offset + 14, $def_minus_stk_flg, value);
	}


	/**
	 * Disallow new lot input 新規ロット入力不可.<p>
	 *
	 */
	public boolean def_not_new_lot_flg() {
		return getConstBoolean(offset + 15, $def_not_new_lot_flg);
	}

	/**
	 * Disallow new lot input 新規ロット入力不可.<p>
	 *
	 */
	public void def_not_new_lot_flg(boolean value) {
		setConstBoolean(offset + 15, $def_not_new_lot_flg, value);
	}


	/**
	 * Check GI allocation 出庫引当確認.<p>
	 *
	 */
	public boolean def_gi_alloc_flg() {
		return getConstBoolean(offset + 16, $def_gi_alloc_flg);
	}

	/**
	 * Check GI allocation 出庫引当確認.<p>
	 *
	 */
	public void def_gi_alloc_flg(boolean value) {
		setConstBoolean(offset + 16, $def_gi_alloc_flg, value);
	}


	/**
	 * SKU allocation 荷姿引当.<p>
	 *
	 */
	public boolean def_pack_alloc_flg() {
		return getConstBoolean(offset + 17, $def_pack_alloc_flg);
	}

	/**
	 * SKU allocation 荷姿引当.<p>
	 *
	 */
	public void def_pack_alloc_flg(boolean value) {
		setConstBoolean(offset + 17, $def_pack_alloc_flg, value);
	}


	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public boolean def_bp_lot_flg() {
		return getConstBoolean(offset + 18, $def_bp_lot_flg);
	}

	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public void def_bp_lot_flg(boolean value) {
		setConstBoolean(offset + 18, $def_bp_lot_flg, value);
	}


	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public String def_comp_spec_typ() {
		return getConstString(offset + 19, $def_comp_spec_typ);
	}

	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public void def_comp_spec_typ(String value) {
		setConstString(offset + 19, $def_comp_spec_typ, value);
	}


	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public String def_comp_spec_typ_nm() {
		return getConstString(offset + 20, $def_comp_spec_typ_nm);
	}

	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public void def_comp_spec_typ_nm(String value) {
		setConstString(offset + 20, $def_comp_spec_typ_nm, value);
	}


	/**
	 * Allow sales order configuration rev. 受注時構成改訂許可.<p>
	 *
	 */
	public boolean def_comp_rev_at_slo_flg() {
		return getConstBoolean(offset + 21, $def_comp_rev_at_slo_flg);
	}

	/**
	 * Allow sales order configuration rev. 受注時構成改訂許可.<p>
	 *
	 */
	public void def_comp_rev_at_slo_flg(boolean value) {
		setConstBoolean(offset + 21, $def_comp_rev_at_slo_flg, value);
	}


	/**
	 * Configuration main item 構成主品目.<p>
	 *
	 */
	public boolean def_comp_core_itm_flg() {
		return getConstBoolean(offset + 22, $def_comp_core_itm_flg);
	}

	/**
	 * Configuration main item 構成主品目.<p>
	 *
	 */
	public void def_comp_core_itm_flg(boolean value) {
		setConstBoolean(offset + 22, $def_comp_core_itm_flg, value);
	}


	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public String def_insp_bind_typ() {
		return getConstString(offset + 23, $def_insp_bind_typ);
	}

	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public void def_insp_bind_typ(String value) {
		setConstString(offset + 23, $def_insp_bind_typ, value);
	}


	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public String def_insp_bind_typ_nm() {
		return getConstString(offset + 24, $def_insp_bind_typ_nm);
	}

	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public void def_insp_bind_typ_nm(String value) {
		setConstString(offset + 24, $def_insp_bind_typ_nm, value);
	}


	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public boolean def_skip_chk_ship_flg() {
		return getConstBoolean(offset + 25, $def_skip_chk_ship_flg);
	}

	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public void def_skip_chk_ship_flg(boolean value) {
		setConstBoolean(offset + 25, $def_skip_chk_ship_flg, value);
	}


	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public String def_itm_spec_grp_cd() {
		return getConstString(offset + 26, $def_itm_spec_grp_cd);
	}

	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public void def_itm_spec_grp_cd(String value) {
		setConstString(offset + 26, $def_itm_spec_grp_cd, value);
	}


	/**
	 * Item specification classification name 品目仕様分類名.<p>
	 *
	 */
	public String def_itm_spec_grp_nm() {
		return getConstString(offset + 27, $def_itm_spec_grp_nm);
	}

	/**
	 * Item specification classification name 品目仕様分類名.<p>
	 *
	 */
	public void def_itm_spec_grp_nm(String value) {
		setConstString(offset + 27, $def_itm_spec_grp_nm, value);
	}


	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public boolean def_lmt_ctl_flg() {
		return getConstBoolean(offset + 28, $def_lmt_ctl_flg);
	}

	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public void def_lmt_ctl_flg(boolean value) {
		setConstBoolean(offset + 28, $def_lmt_ctl_flg, value);
	}


	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public String def_lmt_ctl_categ() {
		return getConstString(offset + 29, $def_lmt_ctl_categ);
	}

	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public void def_lmt_ctl_categ(String value) {
		setConstString(offset + 29, $def_lmt_ctl_categ, value);
	}


	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public String def_sls_upri_grp_cd() {
		return getConstString(offset + 30, $def_sls_upri_grp_cd);
	}

	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public void def_sls_upri_grp_cd(String value) {
		setConstString(offset + 30, $def_sls_upri_grp_cd, value);
	}


	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public String def_sls_upri_grp_nm() {
		return getConstString(offset + 31, $def_sls_upri_grp_nm);
	}

	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public void def_sls_upri_grp_nm(String value) {
		setConstString(offset + 31, $def_sls_upri_grp_nm, value);
	}


	/**
	 * Sales order procurement item 受注手配品.<p>
	 *
	 */
	public boolean def_slo_proc_flg() {
		return getConstBoolean(offset + 32, $def_slo_proc_flg);
	}

	/**
	 * Sales order procurement item 受注手配品.<p>
	 *
	 */
	public void def_slo_proc_flg(boolean value) {
		setConstBoolean(offset + 32, $def_slo_proc_flg, value);
	}


	/**
	 * Sales order procurement type 受注手配区分.<p>
	 *
	 */
	public String def_slo_proc_typ() {
		return getConstString(offset + 33, $def_slo_proc_typ);
	}

	/**
	 * Sales order procurement type 受注手配区分.<p>
	 *
	 */
	public void def_slo_proc_typ(String value) {
		setConstString(offset + 33, $def_slo_proc_typ, value);
	}


	/**
	 * Sales order procurement type name 受注手配区分名.<p>
	 *
	 */
	public String def_slo_proc_typ_nm() {
		return getConstString(offset + 34, $def_slo_proc_typ_nm);
	}

	/**
	 * Sales order procurement type name 受注手配区分名.<p>
	 *
	 */
	public void def_slo_proc_typ_nm(String value) {
		setConstString(offset + 34, $def_slo_proc_typ_nm, value);
	}


	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public String def_ship_inst_typ() {
		return getConstString(offset + 35, $def_ship_inst_typ);
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public void def_ship_inst_typ(String value) {
		setConstString(offset + 35, $def_ship_inst_typ, value);
	}


	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public String def_ship_inst_typ_nm() {
		return getConstString(offset + 36, $def_ship_inst_typ_nm);
	}

	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public void def_ship_inst_typ_nm(String value) {
		setConstString(offset + 36, $def_ship_inst_typ_nm, value);
	}


	/**
	 * Prohibit shipping lot reversal 出荷ロット逆転禁止.<p>
	 *
	 */
	public boolean def_ship_lot_back_stop_flg() {
		return getConstBoolean(offset + 37, $def_ship_lot_back_stop_flg);
	}

	/**
	 * Prohibit shipping lot reversal 出荷ロット逆転禁止.<p>
	 *
	 */
	public void def_ship_lot_back_stop_flg(boolean value) {
		setConstBoolean(offset + 37, $def_ship_lot_back_stop_flg, value);
	}


	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public String def_itm_ship_grp_cd() {
		return getConstString(offset + 38, $def_itm_ship_grp_cd);
	}

	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public void def_itm_ship_grp_cd(String value) {
		setConstString(offset + 38, $def_itm_ship_grp_cd, value);
	}


	/**
	 * Item shipping group name 品目出荷グループ名.<p>
	 *
	 */
	public String def_itm_ship_grp_nm() {
		return getConstString(offset + 39, $def_itm_ship_grp_nm);
	}

	/**
	 * Item shipping group name 品目出荷グループ名.<p>
	 *
	 */
	public void def_itm_ship_grp_nm(String value) {
		setConstString(offset + 39, $def_itm_ship_grp_nm, value);
	}


	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public String def_ship_valid_grp_cd() {
		return getConstString(offset + 40, $def_ship_valid_grp_cd);
	}

	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public void def_ship_valid_grp_cd(String value) {
		setConstString(offset + 40, $def_ship_valid_grp_cd, value);
	}


	/**
	 * Shipping expiration date group name 出荷有効期限グループ名.<p>
	 *
	 */
	public String def_ship_valid_grp_nm() {
		return getConstString(offset + 41, $def_ship_valid_grp_nm);
	}

	/**
	 * Shipping expiration date group name 出荷有効期限グループ名.<p>
	 *
	 */
	public void def_ship_valid_grp_nm(String value) {
		setConstString(offset + 41, $def_ship_valid_grp_nm, value);
	}


	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public boolean def_arr_skip_flg() {
		return getConstBoolean(offset + 42, $def_arr_skip_flg);
	}

	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public void def_arr_skip_flg(boolean value) {
		setConstBoolean(offset + 42, $def_arr_skip_flg, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String def_ship_term_cd() {
		return getConstString(offset + 43, $def_ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void def_ship_term_cd(String value) {
		setConstString(offset + 43, $def_ship_term_cd, value);
	}


	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public String def_ship_term_nm() {
		return getConstString(offset + 44, $def_ship_term_nm);
	}

	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public void def_ship_term_nm(String value) {
		setConstString(offset + 44, $def_ship_term_nm, value);
	}


	/**
	 * For identification tag output 現品票出力対象.<p>
	 *
	 */
	public boolean def_stk_lst_flg() {
		return getConstBoolean(offset + 45, $def_stk_lst_flg);
	}

	/**
	 * For identification tag output 現品票出力対象.<p>
	 *
	 */
	public void def_stk_lst_flg(boolean value) {
		setConstBoolean(offset + 45, $def_stk_lst_flg, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean def_ver_flg() {
		return getConstBoolean(offset + 46, $def_ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void def_ver_flg(boolean value) {
		setConstBoolean(offset + 46, $def_ver_flg, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String def_mfg_inst_unit_typ() {
		return getConstString(offset + 47, $def_mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void def_mfg_inst_unit_typ(String value) {
		setConstString(offset + 47, $def_mfg_inst_unit_typ, value);
	}


	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public String def_mfg_inst_unit_typ_nm() {
		return getConstString(offset + 48, $def_mfg_inst_unit_typ_nm);
	}

	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public void def_mfg_inst_unit_typ_nm(String value) {
		setConstString(offset + 48, $def_mfg_inst_unit_typ_nm, value);
	}


	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public boolean def_sls_upri_cng_flg() {
		return getConstBoolean(offset + 49, $def_sls_upri_cng_flg);
	}

	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public void def_sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 49, $def_sls_upri_cng_flg, value);
	}


	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public boolean def_purc_upri_cng_flg() {
		return getConstBoolean(offset + 50, $def_purc_upri_cng_flg);
	}

	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public void def_purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 50, $def_purc_upri_cng_flg, value);
	}


	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public boolean def_prov_upri_cng_flg() {
		return getConstBoolean(offset + 51, $def_prov_upri_cng_flg);
	}

	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public void def_prov_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 51, $def_prov_upri_cng_flg, value);
	}


	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public String def_mrp_proc_typ() {
		return getConstString(offset + 52, $def_mrp_proc_typ);
	}

	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public void def_mrp_proc_typ(String value) {
		setConstString(offset + 52, $def_mrp_proc_typ, value);
	}


	/**
	 * MRP processing type name ＭＲＰ処理区分名.<p>
	 *
	 */
	public String def_mrp_proc_typ_nm() {
		return getConstString(offset + 53, $def_mrp_proc_typ_nm);
	}

	/**
	 * MRP processing type name ＭＲＰ処理区分名.<p>
	 *
	 */
	public void def_mrp_proc_typ_nm(String value) {
		setConstString(offset + 53, $def_mrp_proc_typ_nm, value);
	}


	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public String def_rqmt_typ() {
		return getConstString(offset + 54, $def_rqmt_typ);
	}

	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public void def_rqmt_typ(String value) {
		setConstString(offset + 54, $def_rqmt_typ, value);
	}


	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public String def_rqmt_typ_nm() {
		return getConstString(offset + 55, $def_rqmt_typ_nm);
	}

	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public void def_rqmt_typ_nm(String value) {
		setConstString(offset + 55, $def_rqmt_typ_nm, value);
	}


	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public String def_prod_pln_typ() {
		return getConstString(offset + 56, $def_prod_pln_typ);
	}

	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public void def_prod_pln_typ(String value) {
		setConstString(offset + 56, $def_prod_pln_typ, value);
	}


	/**
	 * Production planning type name 生産計画立案区分名.<p>
	 *
	 */
	public String def_prod_pln_typ_nm() {
		return getConstString(offset + 57, $def_prod_pln_typ_nm);
	}

	/**
	 * Production planning type name 生産計画立案区分名.<p>
	 *
	 */
	public void def_prod_pln_typ_nm(String value) {
		setConstString(offset + 57, $def_prod_pln_typ_nm, value);
	}


	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public MCNumber def_dmnd_date_div_mons() {
		return getConstNumber(offset + 58, $def_dmnd_date_div_mons);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void def_dmnd_date_div_mons(MCNumber value) {
		setConstNumber(offset + 58, $def_dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void def_dmnd_date_div_mons(int value) {
		setConstNumber(offset + 58, $def_dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void def_dmnd_date_div_mons(long value) {
		setConstNumber(offset + 58, $def_dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void def_dmnd_date_div_mons(float value) {
		setConstNumber(offset + 58, $def_dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void def_dmnd_date_div_mons(double value) {
		setConstNumber(offset + 58, $def_dmnd_date_div_mons, value);
	}


	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCNumber def_alloc_margin_days() {
		return getConstNumber(offset + 59, $def_alloc_margin_days);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void def_alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 59, $def_alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void def_alloc_margin_days(int value) {
		setConstNumber(offset + 59, $def_alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void def_alloc_margin_days(long value) {
		setConstNumber(offset + 59, $def_alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void def_alloc_margin_days(float value) {
		setConstNumber(offset + 59, $def_alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void def_alloc_margin_days(double value) {
		setConstNumber(offset + 59, $def_alloc_margin_days, value);
	}


	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public MCNumber def_mrp_alloc_margin_days() {
		return getConstNumber(offset + 60, $def_mrp_alloc_margin_days);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void def_mrp_alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 60, $def_mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void def_mrp_alloc_margin_days(int value) {
		setConstNumber(offset + 60, $def_mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void def_mrp_alloc_margin_days(long value) {
		setConstNumber(offset + 60, $def_mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void def_mrp_alloc_margin_days(float value) {
		setConstNumber(offset + 60, $def_mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void def_mrp_alloc_margin_days(double value) {
		setConstNumber(offset + 60, $def_mrp_alloc_margin_days, value);
	}


	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public MCNumber def_mrp_opn_xfr_days() {
		return getConstNumber(offset + 61, $def_mrp_opn_xfr_days);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void def_mrp_opn_xfr_days(MCNumber value) {
		setConstNumber(offset + 61, $def_mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void def_mrp_opn_xfr_days(int value) {
		setConstNumber(offset + 61, $def_mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void def_mrp_opn_xfr_days(long value) {
		setConstNumber(offset + 61, $def_mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void def_mrp_opn_xfr_days(float value) {
		setConstNumber(offset + 61, $def_mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void def_mrp_opn_xfr_days(double value) {
		setConstNumber(offset + 61, $def_mrp_opn_xfr_days, value);
	}


	/**
	 * Allow input item addition 投入品追加許可.<p>
	 *
	 */
	public boolean def_inpt_itm_add_flg() {
		return getConstBoolean(offset + 62, $def_inpt_itm_add_flg);
	}

	/**
	 * Allow input item addition 投入品追加許可.<p>
	 *
	 */
	public void def_inpt_itm_add_flg(boolean value) {
		setConstBoolean(offset + 62, $def_inpt_itm_add_flg, value);
	}


	/**
	 * Allow input item deletion 投入品削除許可.<p>
	 *
	 */
	public boolean def_inpt_itm_del_flg() {
		return getConstBoolean(offset + 63, $def_inpt_itm_del_flg);
	}

	/**
	 * Allow input item deletion 投入品削除許可.<p>
	 *
	 */
	public void def_inpt_itm_del_flg(boolean value) {
		setConstBoolean(offset + 63, $def_inpt_itm_del_flg, value);
	}


	/**
	 * Scheduler スケジューラ.<p>
	 *
	 */
	public boolean def_sch_flg() {
		return getConstBoolean(offset + 64, $def_sch_flg);
	}

	/**
	 * Scheduler スケジューラ.<p>
	 *
	 */
	public void def_sch_flg(boolean value) {
		setConstBoolean(offset + 64, $def_sch_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String def_lot_mng_typ() {
		return getConstString(offset + 65, $def_lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void def_lot_mng_typ(String value) {
		setConstString(offset + 65, $def_lot_mng_typ, value);
	}


	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public String def_lot_mng_typ_nm() {
		return getConstString(offset + 66, $def_lot_mng_typ_nm);
	}

	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public void def_lot_mng_typ_nm(String value) {
		setConstString(offset + 66, $def_lot_mng_typ_nm, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String def_lot_no_typ() {
		return getConstString(offset + 67, $def_lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void def_lot_no_typ(String value) {
		setConstString(offset + 67, $def_lot_no_typ, value);
	}


	/**
	 * Lot No. numbering type name ロットＮＯ発番区分名.<p>
	 *
	 */
	public String def_lot_no_typ_nm() {
		return getConstString(offset + 68, $def_lot_no_typ_nm);
	}

	/**
	 * Lot No. numbering type name ロットＮＯ発番区分名.<p>
	 *
	 */
	public void def_lot_no_typ_nm(String value) {
		setConstString(offset + 68, $def_lot_no_typ_nm, value);
	}


	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String def_lot_no_ptn_cd() {
		return getConstString(offset + 69, $def_lot_no_ptn_cd);
	}

	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void def_lot_no_ptn_cd(String value) {
		setConstString(offset + 69, $def_lot_no_ptn_cd, value);
	}


	/**
	 * Lot No. numbering pattern name ロットＮＯ発番パタン名.<p>
	 *
	 */
	public String def_lot_no_ptn_nm() {
		return getConstString(offset + 70, $def_lot_no_ptn_nm);
	}

	/**
	 * Lot No. numbering pattern name ロットＮＯ発番パタン名.<p>
	 *
	 */
	public void def_lot_no_ptn_nm(String value) {
		setConstString(offset + 70, $def_lot_no_ptn_nm, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String def_sublot_mng_typ() {
		return getConstString(offset + 71, $def_sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void def_sublot_mng_typ(String value) {
		setConstString(offset + 71, $def_sublot_mng_typ, value);
	}


	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public String def_sublot_mng_typ_nm() {
		return getConstString(offset + 72, $def_sublot_mng_typ_nm);
	}

	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public void def_sublot_mng_typ_nm(String value) {
		setConstString(offset + 72, $def_sublot_mng_typ_nm, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String def_sublot_no_typ() {
		return getConstString(offset + 73, $def_sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void def_sublot_no_typ(String value) {
		setConstString(offset + 73, $def_sublot_no_typ, value);
	}


	/**
	 * Sublot No. numbering type name サブロットＮＯ発番区分名.<p>
	 *
	 */
	public String def_sublot_no_typ_nm() {
		return getConstString(offset + 74, $def_sublot_no_typ_nm);
	}

	/**
	 * Sublot No. numbering type name サブロットＮＯ発番区分名.<p>
	 *
	 */
	public void def_sublot_no_typ_nm(String value) {
		setConstString(offset + 74, $def_sublot_no_typ_nm, value);
	}


	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String def_sublot_no_ptn_cd() {
		return getConstString(offset + 75, $def_sublot_no_ptn_cd);
	}

	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void def_sublot_no_ptn_cd(String value) {
		setConstString(offset + 75, $def_sublot_no_ptn_cd, value);
	}


	/**
	 * Sublot No. numbering pattern name サブロットＮＯ発番パタン名.<p>
	 *
	 */
	public String def_sublot_no_ptn_nm() {
		return getConstString(offset + 76, $def_sublot_no_ptn_nm);
	}

	/**
	 * Sublot No. numbering pattern name サブロットＮＯ発番パタン名.<p>
	 *
	 */
	public void def_sublot_no_ptn_nm(String value) {
		setConstString(offset + 76, $def_sublot_no_ptn_nm, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String def_sno1_mng_typ() {
		return getConstString(offset + 77, $def_sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void def_sno1_mng_typ(String value) {
		setConstString(offset + 77, $def_sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type name 手配ＮＯ１管理区分名.<p>
	 *
	 */
	public String def_sno1_mng_typ_nm() {
		return getConstString(offset + 78, $def_sno1_mng_typ_nm);
	}

	/**
	 * SEIBAN No. 1 management type name 手配ＮＯ１管理区分名.<p>
	 *
	 */
	public void def_sno1_mng_typ_nm(String value) {
		setConstString(offset + 78, $def_sno1_mng_typ_nm, value);
	}


	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public boolean def_slo_sno1_flg() {
		return getConstBoolean(offset + 79, $def_slo_sno1_flg);
	}

	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public void def_slo_sno1_flg(boolean value) {
		setConstBoolean(offset + 79, $def_slo_sno1_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public boolean def_rqmt_sno1_flg() {
		return getConstBoolean(offset + 80, $def_rqmt_sno1_flg);
	}

	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public void def_rqmt_sno1_flg(boolean value) {
		setConstBoolean(offset + 80, $def_rqmt_sno1_flg, value);
	}


	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public String def_sno1_num_typ() {
		return getConstString(offset + 81, $def_sno1_num_typ);
	}

	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public void def_sno1_num_typ(String value) {
		setConstString(offset + 81, $def_sno1_num_typ, value);
	}


	/**
	 * SEIBAN No. 1 numbering type name 手配ＮＯ１発番区分名.<p>
	 *
	 */
	public String def_sno1_num_typ_nm() {
		return getConstString(offset + 82, $def_sno1_num_typ_nm);
	}

	/**
	 * SEIBAN No. 1 numbering type name 手配ＮＯ１発番区分名.<p>
	 *
	 */
	public void def_sno1_num_typ_nm(String value) {
		setConstString(offset + 82, $def_sno1_num_typ_nm, value);
	}


	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public String def_sno1_ptn_cd() {
		return getConstString(offset + 83, $def_sno1_ptn_cd);
	}

	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public void def_sno1_ptn_cd(String value) {
		setConstString(offset + 83, $def_sno1_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 1 numbering pattern name 手配ＮＯ１発番パタン名.<p>
	 *
	 */
	public String def_sno1_ptn_nm() {
		return getConstString(offset + 84, $def_sno1_ptn_nm);
	}

	/**
	 * SEIBAN No. 1 numbering pattern name 手配ＮＯ１発番パタン名.<p>
	 *
	 */
	public void def_sno1_ptn_nm(String value) {
		setConstString(offset + 84, $def_sno1_ptn_nm, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String def_sno2_mng_typ() {
		return getConstString(offset + 85, $def_sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void def_sno2_mng_typ(String value) {
		setConstString(offset + 85, $def_sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type name 手配ＮＯ２管理区分名.<p>
	 *
	 */
	public String def_sno2_mng_typ_nm() {
		return getConstString(offset + 86, $def_sno2_mng_typ_nm);
	}

	/**
	 * SEIBAN No. 2 management type name 手配ＮＯ２管理区分名.<p>
	 *
	 */
	public void def_sno2_mng_typ_nm(String value) {
		setConstString(offset + 86, $def_sno2_mng_typ_nm, value);
	}


	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public boolean def_slo_sno2_flg() {
		return getConstBoolean(offset + 87, $def_slo_sno2_flg);
	}

	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public void def_slo_sno2_flg(boolean value) {
		setConstBoolean(offset + 87, $def_slo_sno2_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public boolean def_rqmt_sno2_flg() {
		return getConstBoolean(offset + 88, $def_rqmt_sno2_flg);
	}

	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public void def_rqmt_sno2_flg(boolean value) {
		setConstBoolean(offset + 88, $def_rqmt_sno2_flg, value);
	}


	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public String def_sno2_num_typ() {
		return getConstString(offset + 89, $def_sno2_num_typ);
	}

	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public void def_sno2_num_typ(String value) {
		setConstString(offset + 89, $def_sno2_num_typ, value);
	}


	/**
	 * SEIBAN No. 2 numbering type name 手配ＮＯ２発番区分名.<p>
	 *
	 */
	public String def_sno2_num_typ_nm() {
		return getConstString(offset + 90, $def_sno2_num_typ_nm);
	}

	/**
	 * SEIBAN No. 2 numbering type name 手配ＮＯ２発番区分名.<p>
	 *
	 */
	public void def_sno2_num_typ_nm(String value) {
		setConstString(offset + 90, $def_sno2_num_typ_nm, value);
	}


	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public String def_sno2_ptn_cd() {
		return getConstString(offset + 91, $def_sno2_ptn_cd);
	}

	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public void def_sno2_ptn_cd(String value) {
		setConstString(offset + 91, $def_sno2_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 2 numbering pattern name 手配ＮＯ２発番パタン名.<p>
	 *
	 */
	public String def_sno2_ptn_nm() {
		return getConstString(offset + 92, $def_sno2_ptn_nm);
	}

	/**
	 * SEIBAN No. 2 numbering pattern name 手配ＮＯ２発番パタン名.<p>
	 *
	 */
	public void def_sno2_ptn_nm(String value) {
		setConstString(offset + 92, $def_sno2_ptn_nm, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String def_sno3_mng_typ() {
		return getConstString(offset + 93, $def_sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void def_sno3_mng_typ(String value) {
		setConstString(offset + 93, $def_sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type name 手配ＮＯ３管理区分名.<p>
	 *
	 */
	public String def_sno3_mng_typ_nm() {
		return getConstString(offset + 94, $def_sno3_mng_typ_nm);
	}

	/**
	 * SEIBAN No. 3 management type name 手配ＮＯ３管理区分名.<p>
	 *
	 */
	public void def_sno3_mng_typ_nm(String value) {
		setConstString(offset + 94, $def_sno3_mng_typ_nm, value);
	}


	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public boolean def_slo_sno3_flg() {
		return getConstBoolean(offset + 95, $def_slo_sno3_flg);
	}

	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public void def_slo_sno3_flg(boolean value) {
		setConstBoolean(offset + 95, $def_slo_sno3_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public boolean def_rqmt_sno3_flg() {
		return getConstBoolean(offset + 96, $def_rqmt_sno3_flg);
	}

	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public void def_rqmt_sno3_flg(boolean value) {
		setConstBoolean(offset + 96, $def_rqmt_sno3_flg, value);
	}


	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public String def_sno3_num_typ() {
		return getConstString(offset + 97, $def_sno3_num_typ);
	}

	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public void def_sno3_num_typ(String value) {
		setConstString(offset + 97, $def_sno3_num_typ, value);
	}


	/**
	 * SEIBAN No. 3 numbering type name 手配ＮＯ３発番区分名.<p>
	 *
	 */
	public String def_sno3_num_typ_nm() {
		return getConstString(offset + 98, $def_sno3_num_typ_nm);
	}

	/**
	 * SEIBAN No. 3 numbering type name 手配ＮＯ３発番区分名.<p>
	 *
	 */
	public void def_sno3_num_typ_nm(String value) {
		setConstString(offset + 98, $def_sno3_num_typ_nm, value);
	}


	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public String def_sno3_ptn_cd() {
		return getConstString(offset + 99, $def_sno3_ptn_cd);
	}

	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public void def_sno3_ptn_cd(String value) {
		setConstString(offset + 99, $def_sno3_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 3 numbering pattern name 手配ＮＯ３発番パタン名.<p>
	 *
	 */
	public String def_sno3_ptn_nm() {
		return getConstString(offset + 100, $def_sno3_ptn_nm);
	}

	/**
	 * SEIBAN No. 3 numbering pattern name 手配ＮＯ３発番パタン名.<p>
	 *
	 */
	public void def_sno3_ptn_nm(String value) {
		setConstString(offset + 100, $def_sno3_ptn_nm, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String def_sno4_mng_typ() {
		return getConstString(offset + 101, $def_sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void def_sno4_mng_typ(String value) {
		setConstString(offset + 101, $def_sno4_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type name 手配ＮＯ４管理区分名.<p>
	 *
	 */
	public String def_sno4_mng_typ_nm() {
		return getConstString(offset + 102, $def_sno4_mng_typ_nm);
	}

	/**
	 * SEIBAN No. 4 management type name 手配ＮＯ４管理区分名.<p>
	 *
	 */
	public void def_sno4_mng_typ_nm(String value) {
		setConstString(offset + 102, $def_sno4_mng_typ_nm, value);
	}


	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public boolean def_slo_sno4_flg() {
		return getConstBoolean(offset + 103, $def_slo_sno4_flg);
	}

	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public void def_slo_sno4_flg(boolean value) {
		setConstBoolean(offset + 103, $def_slo_sno4_flg, value);
	}


	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public boolean def_rqmt_sno4_flg() {
		return getConstBoolean(offset + 104, $def_rqmt_sno4_flg);
	}

	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public void def_rqmt_sno4_flg(boolean value) {
		setConstBoolean(offset + 104, $def_rqmt_sno4_flg, value);
	}


	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public String def_sno4_num_typ() {
		return getConstString(offset + 105, $def_sno4_num_typ);
	}

	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public void def_sno4_num_typ(String value) {
		setConstString(offset + 105, $def_sno4_num_typ, value);
	}


	/**
	 * SEIBAN No. 4 numbering type name 手配ＮＯ４発番区分名.<p>
	 *
	 */
	public String def_sno4_num_typ_nm() {
		return getConstString(offset + 106, $def_sno4_num_typ_nm);
	}

	/**
	 * SEIBAN No. 4 numbering type name 手配ＮＯ４発番区分名.<p>
	 *
	 */
	public void def_sno4_num_typ_nm(String value) {
		setConstString(offset + 106, $def_sno4_num_typ_nm, value);
	}


	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public String def_sno4_ptn_cd() {
		return getConstString(offset + 107, $def_sno4_ptn_cd);
	}

	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public void def_sno4_ptn_cd(String value) {
		setConstString(offset + 107, $def_sno4_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 4 numbering pattern name 手配ＮＯ４発番パタン名.<p>
	 *
	 */
	public String def_sno4_ptn_nm() {
		return getConstString(offset + 108, $def_sno4_ptn_nm);
	}

	/**
	 * SEIBAN No. 4 numbering pattern name 手配ＮＯ４発番パタン名.<p>
	 *
	 */
	public void def_sno4_ptn_nm(String value) {
		setConstString(offset + 108, $def_sno4_ptn_nm, value);
	}


	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public boolean def_mrkt_judg_flg() {
		return getConstBoolean(offset + 109, $def_mrkt_judg_flg);
	}

	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public void def_mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 109, $def_mrkt_judg_flg, value);
	}


	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public String def_mrkt_judg_role_cd() {
		return getConstString(offset + 110, $def_mrkt_judg_role_cd);
	}

	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public void def_mrkt_judg_role_cd(String value) {
		setConstString(offset + 110, $def_mrkt_judg_role_cd, value);
	}


	/**
	 * Market release decision approval role name 市場出荷判定承認役割名.<p>
	 *
	 */
	public String def_mrkt_judg_role_nm() {
		return getConstString(offset + 111, $def_mrkt_judg_role_nm);
	}

	/**
	 * Market release decision approval role name 市場出荷判定承認役割名.<p>
	 *
	 */
	public void def_mrkt_judg_role_nm(String value) {
		setConstString(offset + 111, $def_mrkt_judg_role_nm, value);
	}


	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public String def_mrkt_judg_upd_role_cd() {
		return getConstString(offset + 112, $def_mrkt_judg_upd_role_cd);
	}

	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public void def_mrkt_judg_upd_role_cd(String value) {
		setConstString(offset + 112, $def_mrkt_judg_upd_role_cd, value);
	}


	/**
	 * Market release decision updating role name 市場出荷判定更新役割名.<p>
	 *
	 */
	public String def_mrkt_judg_upd_role_nm() {
		return getConstString(offset + 113, $def_mrkt_judg_upd_role_nm);
	}

	/**
	 * Market release decision updating role name 市場出荷判定更新役割名.<p>
	 *
	 */
	public void def_mrkt_judg_upd_role_nm(String value) {
		setConstString(offset + 113, $def_mrkt_judg_upd_role_nm, value);
	}


	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public boolean def_plnt_aprv_flg() {
		return getConstBoolean(offset + 114, $def_plnt_aprv_flg);
	}

	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public void def_plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 114, $def_plnt_aprv_flg, value);
	}


	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public String def_plnt_aprv_role_cd() {
		return getConstString(offset + 115, $def_plnt_aprv_role_cd);
	}

	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public void def_plnt_aprv_role_cd(String value) {
		setConstString(offset + 115, $def_plnt_aprv_role_cd, value);
	}


	/**
	 * Factory release approval role name 工場出荷承認役割名.<p>
	 *
	 */
	public String def_plnt_aprv_role_nm() {
		return getConstString(offset + 116, $def_plnt_aprv_role_nm);
	}

	/**
	 * Factory release approval role name 工場出荷承認役割名.<p>
	 *
	 */
	public void def_plnt_aprv_role_nm(String value) {
		setConstString(offset + 116, $def_plnt_aprv_role_nm, value);
	}


	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public boolean def_insp_aprv_flg() {
		return getConstBoolean(offset + 117, $def_insp_aprv_flg);
	}

	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public void def_insp_aprv_flg(boolean value) {
		setConstBoolean(offset + 117, $def_insp_aprv_flg, value);
	}


	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public String def_insp_aprv_role_cd() {
		return getConstString(offset + 118, $def_insp_aprv_role_cd);
	}

	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public void def_insp_aprv_role_cd(String value) {
		setConstString(offset + 118, $def_insp_aprv_role_cd, value);
	}


	/**
	 * Inspection approval role name 検査承認役割名.<p>
	 *
	 */
	public String def_insp_aprv_role_nm() {
		return getConstString(offset + 119, $def_insp_aprv_role_nm);
	}

	/**
	 * Inspection approval role name 検査承認役割名.<p>
	 *
	 */
	public void def_insp_aprv_role_nm(String value) {
		setConstString(offset + 119, $def_insp_aprv_role_nm, value);
	}


	/**
	 * For mfg. approval 製造承認対象.<p>
	 *
	 */
	public boolean def_mfg_aprv_flg() {
		return getConstBoolean(offset + 120, $def_mfg_aprv_flg);
	}

	/**
	 * For mfg. approval 製造承認対象.<p>
	 *
	 */
	public void def_mfg_aprv_flg(boolean value) {
		setConstBoolean(offset + 120, $def_mfg_aprv_flg, value);
	}


	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public String def_mfg_aprv_role_cd() {
		return getConstString(offset + 121, $def_mfg_aprv_role_cd);
	}

	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public void def_mfg_aprv_role_cd(String value) {
		setConstString(offset + 121, $def_mfg_aprv_role_cd, value);
	}


	/**
	 * Mfg. approval role name 製造承認役割名.<p>
	 *
	 */
	public String def_mfg_aprv_role_nm() {
		return getConstString(offset + 122, $def_mfg_aprv_role_nm);
	}

	/**
	 * Mfg. approval role name 製造承認役割名.<p>
	 *
	 */
	public void def_mfg_aprv_role_nm(String value) {
		setConstString(offset + 122, $def_mfg_aprv_role_nm, value);
	}


	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public String def_sno_typ1() {
		return getConstString(offset + 123, $def_sno_typ1);
	}

	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public void def_sno_typ1(String value) {
		setConstString(offset + 123, $def_sno_typ1, value);
	}


	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public String def_sno_typ_nm1() {
		return getConstString(offset + 124, $def_sno_typ_nm1);
	}

	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public void def_sno_typ_nm1(String value) {
		setConstString(offset + 124, $def_sno_typ_nm1, value);
	}


	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public String def_sno_typ2() {
		return getConstString(offset + 125, $def_sno_typ2);
	}

	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public void def_sno_typ2(String value) {
		setConstString(offset + 125, $def_sno_typ2, value);
	}


	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public String def_sno_typ_nm2() {
		return getConstString(offset + 126, $def_sno_typ_nm2);
	}

	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public void def_sno_typ_nm2(String value) {
		setConstString(offset + 126, $def_sno_typ_nm2, value);
	}


	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public String def_sno_typ3() {
		return getConstString(offset + 127, $def_sno_typ3);
	}

	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public void def_sno_typ3(String value) {
		setConstString(offset + 127, $def_sno_typ3, value);
	}


	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public String def_sno_typ_nm3() {
		return getConstString(offset + 128, $def_sno_typ_nm3);
	}

	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public void def_sno_typ_nm3(String value) {
		setConstString(offset + 128, $def_sno_typ_nm3, value);
	}


	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public String def_sno_typ4() {
		return getConstString(offset + 129, $def_sno_typ4);
	}

	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public void def_sno_typ4(String value) {
		setConstString(offset + 129, $def_sno_typ4, value);
	}


	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public String def_sno_typ_nm4() {
		return getConstString(offset + 130, $def_sno_typ_nm4);
	}

	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public void def_sno_typ_nm4(String value) {
		setConstString(offset + 130, $def_sno_typ_nm4, value);
	}


	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public boolean def_inst_lot_fix_flg() {
		return getConstBoolean(offset + 131, $def_inst_lot_fix_flg);
	}

	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public void def_inst_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 131, $def_inst_lot_fix_flg, value);
	}


	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public boolean def_lot_mix_flg() {
		return getConstBoolean(offset + 132, $def_lot_mix_flg);
	}

	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public void def_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 132, $def_lot_mix_flg, value);
	}


	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public boolean def_sublot_mix_flg() {
		return getConstBoolean(offset + 133, $def_sublot_mix_flg);
	}

	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public void def_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 133, $def_sublot_mix_flg, value);
	}


	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public String def_alloc_ctl_typ() {
		return getConstString(offset + 134, $def_alloc_ctl_typ);
	}

	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public void def_alloc_ctl_typ(String value) {
		setConstString(offset + 134, $def_alloc_ctl_typ, value);
	}


	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public String def_alloc_ctl_typ_nm() {
		return getConstString(offset + 135, $def_alloc_ctl_typ_nm);
	}

	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public void def_alloc_ctl_typ_nm(String value) {
		setConstString(offset + 135, $def_alloc_ctl_typ_nm, value);
	}


	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public String def_inpt_ctl_typ() {
		return getConstString(offset + 136, $def_inpt_ctl_typ);
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public void def_inpt_ctl_typ(String value) {
		setConstString(offset + 136, $def_inpt_ctl_typ, value);
	}


	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public String def_inpt_ctl_typ_nm() {
		return getConstString(offset + 137, $def_inpt_ctl_typ_nm);
	}

	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public void def_inpt_ctl_typ_nm(String value) {
		setConstString(offset + 137, $def_inpt_ctl_typ_nm, value);
	}


	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public String def_bkf_typ() {
		return getConstString(offset + 138, $def_bkf_typ);
	}

	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public void def_bkf_typ(String value) {
		setConstString(offset + 138, $def_bkf_typ, value);
	}


	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public String def_bkf_typ_nm() {
		return getConstString(offset + 139, $def_bkf_typ_nm);
	}

	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public void def_bkf_typ_nm(String value) {
		setConstString(offset + 139, $def_bkf_typ_nm, value);
	}


	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public boolean def_main_itm_flg() {
		return getConstBoolean(offset + 140, $def_main_itm_flg);
	}

	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public void def_main_itm_flg(boolean value) {
		setConstBoolean(offset + 140, $def_main_itm_flg, value);
	}


	/**
	 * By-product 副産品.<p>
	 *
	 */
	public boolean def_byprod_flg() {
		return getConstBoolean(offset + 141, $def_byprod_flg);
	}

	/**
	 * By-product 副産品.<p>
	 *
	 */
	public void def_byprod_flg(boolean value) {
		setConstBoolean(offset + 141, $def_byprod_flg, value);
	}


	/**
	 * Not costing (BOM) 原価対象外（ＢＯＭ）.<p>
	 *
	 */
	public boolean def_not_cost_bom_flg() {
		return getConstBoolean(offset + 142, $def_not_cost_bom_flg);
	}

	/**
	 * Not costing (BOM) 原価対象外（ＢＯＭ）.<p>
	 *
	 */
	public void def_not_cost_bom_flg(boolean value) {
		setConstBoolean(offset + 142, $def_not_cost_bom_flg, value);
	}


	/**
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public String def_calc_ptn_cd() {
		return getConstString(offset + 143, $def_calc_ptn_cd);
	}

	/**
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public void def_calc_ptn_cd(String value) {
		setConstString(offset + 143, $def_calc_ptn_cd, value);
	}


	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public String def_calc_ptn_nm() {
		return getConstString(offset + 144, $def_calc_ptn_nm);
	}

	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public void def_calc_ptn_nm(String value) {
		setConstString(offset + 144, $def_calc_ptn_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 145, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 145, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 146, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 146, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 147, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 147, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 148, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 148, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 149, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 149, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 150, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 150, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 151, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 151, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 152, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 152, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 153, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 153, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 153, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 153, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 153, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 153, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 154, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 154, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 155, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 155, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 156, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 156, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 157, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 157, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 158, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 158, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 159, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 159, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 160, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 160, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 161, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 161, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 162, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 162, $del_ts, value);
	}


	public String getString(String name) {
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm_lcl.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($def_itm_jnl_cd.equalsIgnoreCase(name)) {
			return def_itm_jnl_cd();
		}
		if ($def_itm_jnl_nm.equalsIgnoreCase(name)) {
			return def_itm_jnl_nm();
		}
		if ($def_ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return def_ac_itm_grp_cd();
		}
		if ($def_ac_itm_grp_nm.equalsIgnoreCase(name)) {
			return def_ac_itm_grp_nm();
		}
		if ($def_comp_spec_typ.equalsIgnoreCase(name)) {
			return def_comp_spec_typ();
		}
		if ($def_comp_spec_typ_nm.equalsIgnoreCase(name)) {
			return def_comp_spec_typ_nm();
		}
		if ($def_insp_bind_typ.equalsIgnoreCase(name)) {
			return def_insp_bind_typ();
		}
		if ($def_insp_bind_typ_nm.equalsIgnoreCase(name)) {
			return def_insp_bind_typ_nm();
		}
		if ($def_itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return def_itm_spec_grp_cd();
		}
		if ($def_itm_spec_grp_nm.equalsIgnoreCase(name)) {
			return def_itm_spec_grp_nm();
		}
		if ($def_lmt_ctl_categ.equalsIgnoreCase(name)) {
			return def_lmt_ctl_categ();
		}
		if ($def_sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return def_sls_upri_grp_cd();
		}
		if ($def_sls_upri_grp_nm.equalsIgnoreCase(name)) {
			return def_sls_upri_grp_nm();
		}
		if ($def_slo_proc_typ.equalsIgnoreCase(name)) {
			return def_slo_proc_typ();
		}
		if ($def_slo_proc_typ_nm.equalsIgnoreCase(name)) {
			return def_slo_proc_typ_nm();
		}
		if ($def_ship_inst_typ.equalsIgnoreCase(name)) {
			return def_ship_inst_typ();
		}
		if ($def_ship_inst_typ_nm.equalsIgnoreCase(name)) {
			return def_ship_inst_typ_nm();
		}
		if ($def_itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return def_itm_ship_grp_cd();
		}
		if ($def_itm_ship_grp_nm.equalsIgnoreCase(name)) {
			return def_itm_ship_grp_nm();
		}
		if ($def_ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return def_ship_valid_grp_cd();
		}
		if ($def_ship_valid_grp_nm.equalsIgnoreCase(name)) {
			return def_ship_valid_grp_nm();
		}
		if ($def_ship_term_cd.equalsIgnoreCase(name)) {
			return def_ship_term_cd();
		}
		if ($def_ship_term_nm.equalsIgnoreCase(name)) {
			return def_ship_term_nm();
		}
		if ($def_mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return def_mfg_inst_unit_typ();
		}
		if ($def_mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return def_mfg_inst_unit_typ_nm();
		}
		if ($def_mrp_proc_typ.equalsIgnoreCase(name)) {
			return def_mrp_proc_typ();
		}
		if ($def_mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			return def_mrp_proc_typ_nm();
		}
		if ($def_rqmt_typ.equalsIgnoreCase(name)) {
			return def_rqmt_typ();
		}
		if ($def_rqmt_typ_nm.equalsIgnoreCase(name)) {
			return def_rqmt_typ_nm();
		}
		if ($def_prod_pln_typ.equalsIgnoreCase(name)) {
			return def_prod_pln_typ();
		}
		if ($def_prod_pln_typ_nm.equalsIgnoreCase(name)) {
			return def_prod_pln_typ_nm();
		}
		if ($def_lot_mng_typ.equalsIgnoreCase(name)) {
			return def_lot_mng_typ();
		}
		if ($def_lot_mng_typ_nm.equalsIgnoreCase(name)) {
			return def_lot_mng_typ_nm();
		}
		if ($def_lot_no_typ.equalsIgnoreCase(name)) {
			return def_lot_no_typ();
		}
		if ($def_lot_no_typ_nm.equalsIgnoreCase(name)) {
			return def_lot_no_typ_nm();
		}
		if ($def_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return def_lot_no_ptn_cd();
		}
		if ($def_lot_no_ptn_nm.equalsIgnoreCase(name)) {
			return def_lot_no_ptn_nm();
		}
		if ($def_sublot_mng_typ.equalsIgnoreCase(name)) {
			return def_sublot_mng_typ();
		}
		if ($def_sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			return def_sublot_mng_typ_nm();
		}
		if ($def_sublot_no_typ.equalsIgnoreCase(name)) {
			return def_sublot_no_typ();
		}
		if ($def_sublot_no_typ_nm.equalsIgnoreCase(name)) {
			return def_sublot_no_typ_nm();
		}
		if ($def_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return def_sublot_no_ptn_cd();
		}
		if ($def_sublot_no_ptn_nm.equalsIgnoreCase(name)) {
			return def_sublot_no_ptn_nm();
		}
		if ($def_sno1_mng_typ.equalsIgnoreCase(name)) {
			return def_sno1_mng_typ();
		}
		if ($def_sno1_mng_typ_nm.equalsIgnoreCase(name)) {
			return def_sno1_mng_typ_nm();
		}
		if ($def_sno1_num_typ.equalsIgnoreCase(name)) {
			return def_sno1_num_typ();
		}
		if ($def_sno1_num_typ_nm.equalsIgnoreCase(name)) {
			return def_sno1_num_typ_nm();
		}
		if ($def_sno1_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno1_ptn_cd();
		}
		if ($def_sno1_ptn_nm.equalsIgnoreCase(name)) {
			return def_sno1_ptn_nm();
		}
		if ($def_sno2_mng_typ.equalsIgnoreCase(name)) {
			return def_sno2_mng_typ();
		}
		if ($def_sno2_mng_typ_nm.equalsIgnoreCase(name)) {
			return def_sno2_mng_typ_nm();
		}
		if ($def_sno2_num_typ.equalsIgnoreCase(name)) {
			return def_sno2_num_typ();
		}
		if ($def_sno2_num_typ_nm.equalsIgnoreCase(name)) {
			return def_sno2_num_typ_nm();
		}
		if ($def_sno2_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno2_ptn_cd();
		}
		if ($def_sno2_ptn_nm.equalsIgnoreCase(name)) {
			return def_sno2_ptn_nm();
		}
		if ($def_sno3_mng_typ.equalsIgnoreCase(name)) {
			return def_sno3_mng_typ();
		}
		if ($def_sno3_mng_typ_nm.equalsIgnoreCase(name)) {
			return def_sno3_mng_typ_nm();
		}
		if ($def_sno3_num_typ.equalsIgnoreCase(name)) {
			return def_sno3_num_typ();
		}
		if ($def_sno3_num_typ_nm.equalsIgnoreCase(name)) {
			return def_sno3_num_typ_nm();
		}
		if ($def_sno3_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno3_ptn_cd();
		}
		if ($def_sno3_ptn_nm.equalsIgnoreCase(name)) {
			return def_sno3_ptn_nm();
		}
		if ($def_sno4_mng_typ.equalsIgnoreCase(name)) {
			return def_sno4_mng_typ();
		}
		if ($def_sno4_mng_typ_nm.equalsIgnoreCase(name)) {
			return def_sno4_mng_typ_nm();
		}
		if ($def_sno4_num_typ.equalsIgnoreCase(name)) {
			return def_sno4_num_typ();
		}
		if ($def_sno4_num_typ_nm.equalsIgnoreCase(name)) {
			return def_sno4_num_typ_nm();
		}
		if ($def_sno4_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno4_ptn_cd();
		}
		if ($def_sno4_ptn_nm.equalsIgnoreCase(name)) {
			return def_sno4_ptn_nm();
		}
		if ($def_mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return def_mrkt_judg_role_cd();
		}
		if ($def_mrkt_judg_role_nm.equalsIgnoreCase(name)) {
			return def_mrkt_judg_role_nm();
		}
		if ($def_mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			return def_mrkt_judg_upd_role_cd();
		}
		if ($def_mrkt_judg_upd_role_nm.equalsIgnoreCase(name)) {
			return def_mrkt_judg_upd_role_nm();
		}
		if ($def_plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_plnt_aprv_role_cd();
		}
		if ($def_plnt_aprv_role_nm.equalsIgnoreCase(name)) {
			return def_plnt_aprv_role_nm();
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_insp_aprv_role_cd();
		}
		if ($def_insp_aprv_role_nm.equalsIgnoreCase(name)) {
			return def_insp_aprv_role_nm();
		}
		if ($def_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_mfg_aprv_role_cd();
		}
		if ($def_mfg_aprv_role_nm.equalsIgnoreCase(name)) {
			return def_mfg_aprv_role_nm();
		}
		if ($def_sno_typ1.equalsIgnoreCase(name)) {
			return def_sno_typ1();
		}
		if ($def_sno_typ_nm1.equalsIgnoreCase(name)) {
			return def_sno_typ_nm1();
		}
		if ($def_sno_typ2.equalsIgnoreCase(name)) {
			return def_sno_typ2();
		}
		if ($def_sno_typ_nm2.equalsIgnoreCase(name)) {
			return def_sno_typ_nm2();
		}
		if ($def_sno_typ3.equalsIgnoreCase(name)) {
			return def_sno_typ3();
		}
		if ($def_sno_typ_nm3.equalsIgnoreCase(name)) {
			return def_sno_typ_nm3();
		}
		if ($def_sno_typ4.equalsIgnoreCase(name)) {
			return def_sno_typ4();
		}
		if ($def_sno_typ_nm4.equalsIgnoreCase(name)) {
			return def_sno_typ_nm4();
		}
		if ($def_alloc_ctl_typ.equalsIgnoreCase(name)) {
			return def_alloc_ctl_typ();
		}
		if ($def_alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			return def_alloc_ctl_typ_nm();
		}
		if ($def_inpt_ctl_typ.equalsIgnoreCase(name)) {
			return def_inpt_ctl_typ();
		}
		if ($def_inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return def_inpt_ctl_typ_nm();
		}
		if ($def_bkf_typ.equalsIgnoreCase(name)) {
			return def_bkf_typ();
		}
		if ($def_bkf_typ_nm.equalsIgnoreCase(name)) {
			return def_bkf_typ_nm();
		}
		if ($def_calc_ptn_cd.equalsIgnoreCase(name)) {
			return def_calc_ptn_cd();
		}
		if ($def_calc_ptn_nm.equalsIgnoreCase(name)) {
			return def_calc_ptn_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return def_dmnd_date_div_mons();
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			return def_alloc_margin_days();
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return def_mrp_alloc_margin_days();
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return def_mrp_opn_xfr_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($def_sls_flg.equalsIgnoreCase(name)) {
			return def_sls_flg();
		}
		if ($def_mfg_flg.equalsIgnoreCase(name)) {
			return def_mfg_flg();
		}
		if ($def_purc_flg.equalsIgnoreCase(name)) {
			return def_purc_flg();
		}
		if ($def_insp_flg.equalsIgnoreCase(name)) {
			return def_insp_flg();
		}
		if ($def_minus_stk_flg.equalsIgnoreCase(name)) {
			return def_minus_stk_flg();
		}
		if ($def_not_new_lot_flg.equalsIgnoreCase(name)) {
			return def_not_new_lot_flg();
		}
		if ($def_gi_alloc_flg.equalsIgnoreCase(name)) {
			return def_gi_alloc_flg();
		}
		if ($def_pack_alloc_flg.equalsIgnoreCase(name)) {
			return def_pack_alloc_flg();
		}
		if ($def_bp_lot_flg.equalsIgnoreCase(name)) {
			return def_bp_lot_flg();
		}
		if ($def_comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			return def_comp_rev_at_slo_flg();
		}
		if ($def_comp_core_itm_flg.equalsIgnoreCase(name)) {
			return def_comp_core_itm_flg();
		}
		if ($def_skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return def_skip_chk_ship_flg();
		}
		if ($def_lmt_ctl_flg.equalsIgnoreCase(name)) {
			return def_lmt_ctl_flg();
		}
		if ($def_slo_proc_flg.equalsIgnoreCase(name)) {
			return def_slo_proc_flg();
		}
		if ($def_ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			return def_ship_lot_back_stop_flg();
		}
		if ($def_arr_skip_flg.equalsIgnoreCase(name)) {
			return def_arr_skip_flg();
		}
		if ($def_stk_lst_flg.equalsIgnoreCase(name)) {
			return def_stk_lst_flg();
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			return def_ver_flg();
		}
		if ($def_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return def_sls_upri_cng_flg();
		}
		if ($def_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return def_purc_upri_cng_flg();
		}
		if ($def_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return def_prov_upri_cng_flg();
		}
		if ($def_inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return def_inpt_itm_add_flg();
		}
		if ($def_inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return def_inpt_itm_del_flg();
		}
		if ($def_sch_flg.equalsIgnoreCase(name)) {
			return def_sch_flg();
		}
		if ($def_slo_sno1_flg.equalsIgnoreCase(name)) {
			return def_slo_sno1_flg();
		}
		if ($def_rqmt_sno1_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno1_flg();
		}
		if ($def_slo_sno2_flg.equalsIgnoreCase(name)) {
			return def_slo_sno2_flg();
		}
		if ($def_rqmt_sno2_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno2_flg();
		}
		if ($def_slo_sno3_flg.equalsIgnoreCase(name)) {
			return def_slo_sno3_flg();
		}
		if ($def_rqmt_sno3_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno3_flg();
		}
		if ($def_slo_sno4_flg.equalsIgnoreCase(name)) {
			return def_slo_sno4_flg();
		}
		if ($def_rqmt_sno4_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno4_flg();
		}
		if ($def_mrkt_judg_flg.equalsIgnoreCase(name)) {
			return def_mrkt_judg_flg();
		}
		if ($def_plnt_aprv_flg.equalsIgnoreCase(name)) {
			return def_plnt_aprv_flg();
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			return def_insp_aprv_flg();
		}
		if ($def_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return def_mfg_aprv_flg();
		}
		if ($def_inst_lot_fix_flg.equalsIgnoreCase(name)) {
			return def_inst_lot_fix_flg();
		}
		if ($def_lot_mix_flg.equalsIgnoreCase(name)) {
			return def_lot_mix_flg();
		}
		if ($def_sublot_mix_flg.equalsIgnoreCase(name)) {
			return def_sublot_mix_flg();
		}
		if ($def_main_itm_flg.equalsIgnoreCase(name)) {
			return def_main_itm_flg();
		}
		if ($def_byprod_flg.equalsIgnoreCase(name)) {
			return def_byprod_flg();
		}
		if ($def_not_cost_bom_flg.equalsIgnoreCase(name)) {
			return def_not_cost_bom_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm_lcl.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($def_itm_jnl_cd.equalsIgnoreCase(name)) {
			return def_itm_jnl_cd();
		}
		if ($def_itm_jnl_nm.equalsIgnoreCase(name)) {
			return def_itm_jnl_nm();
		}
		if ($def_ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return def_ac_itm_grp_cd();
		}
		if ($def_ac_itm_grp_nm.equalsIgnoreCase(name)) {
			return def_ac_itm_grp_nm();
		}
		if ($def_comp_spec_typ.equalsIgnoreCase(name)) {
			return def_comp_spec_typ();
		}
		if ($def_comp_spec_typ_nm.equalsIgnoreCase(name)) {
			return def_comp_spec_typ_nm();
		}
		if ($def_insp_bind_typ.equalsIgnoreCase(name)) {
			return def_insp_bind_typ();
		}
		if ($def_insp_bind_typ_nm.equalsIgnoreCase(name)) {
			return def_insp_bind_typ_nm();
		}
		if ($def_itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return def_itm_spec_grp_cd();
		}
		if ($def_itm_spec_grp_nm.equalsIgnoreCase(name)) {
			return def_itm_spec_grp_nm();
		}
		if ($def_lmt_ctl_categ.equalsIgnoreCase(name)) {
			return def_lmt_ctl_categ();
		}
		if ($def_sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return def_sls_upri_grp_cd();
		}
		if ($def_sls_upri_grp_nm.equalsIgnoreCase(name)) {
			return def_sls_upri_grp_nm();
		}
		if ($def_slo_proc_typ.equalsIgnoreCase(name)) {
			return def_slo_proc_typ();
		}
		if ($def_slo_proc_typ_nm.equalsIgnoreCase(name)) {
			return def_slo_proc_typ_nm();
		}
		if ($def_ship_inst_typ.equalsIgnoreCase(name)) {
			return def_ship_inst_typ();
		}
		if ($def_ship_inst_typ_nm.equalsIgnoreCase(name)) {
			return def_ship_inst_typ_nm();
		}
		if ($def_itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return def_itm_ship_grp_cd();
		}
		if ($def_itm_ship_grp_nm.equalsIgnoreCase(name)) {
			return def_itm_ship_grp_nm();
		}
		if ($def_ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return def_ship_valid_grp_cd();
		}
		if ($def_ship_valid_grp_nm.equalsIgnoreCase(name)) {
			return def_ship_valid_grp_nm();
		}
		if ($def_ship_term_cd.equalsIgnoreCase(name)) {
			return def_ship_term_cd();
		}
		if ($def_ship_term_nm.equalsIgnoreCase(name)) {
			return def_ship_term_nm();
		}
		if ($def_mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return def_mfg_inst_unit_typ();
		}
		if ($def_mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return def_mfg_inst_unit_typ_nm();
		}
		if ($def_mrp_proc_typ.equalsIgnoreCase(name)) {
			return def_mrp_proc_typ();
		}
		if ($def_mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			return def_mrp_proc_typ_nm();
		}
		if ($def_rqmt_typ.equalsIgnoreCase(name)) {
			return def_rqmt_typ();
		}
		if ($def_rqmt_typ_nm.equalsIgnoreCase(name)) {
			return def_rqmt_typ_nm();
		}
		if ($def_prod_pln_typ.equalsIgnoreCase(name)) {
			return def_prod_pln_typ();
		}
		if ($def_prod_pln_typ_nm.equalsIgnoreCase(name)) {
			return def_prod_pln_typ_nm();
		}
		if ($def_lot_mng_typ.equalsIgnoreCase(name)) {
			return def_lot_mng_typ();
		}
		if ($def_lot_mng_typ_nm.equalsIgnoreCase(name)) {
			return def_lot_mng_typ_nm();
		}
		if ($def_lot_no_typ.equalsIgnoreCase(name)) {
			return def_lot_no_typ();
		}
		if ($def_lot_no_typ_nm.equalsIgnoreCase(name)) {
			return def_lot_no_typ_nm();
		}
		if ($def_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return def_lot_no_ptn_cd();
		}
		if ($def_lot_no_ptn_nm.equalsIgnoreCase(name)) {
			return def_lot_no_ptn_nm();
		}
		if ($def_sublot_mng_typ.equalsIgnoreCase(name)) {
			return def_sublot_mng_typ();
		}
		if ($def_sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			return def_sublot_mng_typ_nm();
		}
		if ($def_sublot_no_typ.equalsIgnoreCase(name)) {
			return def_sublot_no_typ();
		}
		if ($def_sublot_no_typ_nm.equalsIgnoreCase(name)) {
			return def_sublot_no_typ_nm();
		}
		if ($def_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return def_sublot_no_ptn_cd();
		}
		if ($def_sublot_no_ptn_nm.equalsIgnoreCase(name)) {
			return def_sublot_no_ptn_nm();
		}
		if ($def_sno1_mng_typ.equalsIgnoreCase(name)) {
			return def_sno1_mng_typ();
		}
		if ($def_sno1_mng_typ_nm.equalsIgnoreCase(name)) {
			return def_sno1_mng_typ_nm();
		}
		if ($def_sno1_num_typ.equalsIgnoreCase(name)) {
			return def_sno1_num_typ();
		}
		if ($def_sno1_num_typ_nm.equalsIgnoreCase(name)) {
			return def_sno1_num_typ_nm();
		}
		if ($def_sno1_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno1_ptn_cd();
		}
		if ($def_sno1_ptn_nm.equalsIgnoreCase(name)) {
			return def_sno1_ptn_nm();
		}
		if ($def_sno2_mng_typ.equalsIgnoreCase(name)) {
			return def_sno2_mng_typ();
		}
		if ($def_sno2_mng_typ_nm.equalsIgnoreCase(name)) {
			return def_sno2_mng_typ_nm();
		}
		if ($def_sno2_num_typ.equalsIgnoreCase(name)) {
			return def_sno2_num_typ();
		}
		if ($def_sno2_num_typ_nm.equalsIgnoreCase(name)) {
			return def_sno2_num_typ_nm();
		}
		if ($def_sno2_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno2_ptn_cd();
		}
		if ($def_sno2_ptn_nm.equalsIgnoreCase(name)) {
			return def_sno2_ptn_nm();
		}
		if ($def_sno3_mng_typ.equalsIgnoreCase(name)) {
			return def_sno3_mng_typ();
		}
		if ($def_sno3_mng_typ_nm.equalsIgnoreCase(name)) {
			return def_sno3_mng_typ_nm();
		}
		if ($def_sno3_num_typ.equalsIgnoreCase(name)) {
			return def_sno3_num_typ();
		}
		if ($def_sno3_num_typ_nm.equalsIgnoreCase(name)) {
			return def_sno3_num_typ_nm();
		}
		if ($def_sno3_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno3_ptn_cd();
		}
		if ($def_sno3_ptn_nm.equalsIgnoreCase(name)) {
			return def_sno3_ptn_nm();
		}
		if ($def_sno4_mng_typ.equalsIgnoreCase(name)) {
			return def_sno4_mng_typ();
		}
		if ($def_sno4_mng_typ_nm.equalsIgnoreCase(name)) {
			return def_sno4_mng_typ_nm();
		}
		if ($def_sno4_num_typ.equalsIgnoreCase(name)) {
			return def_sno4_num_typ();
		}
		if ($def_sno4_num_typ_nm.equalsIgnoreCase(name)) {
			return def_sno4_num_typ_nm();
		}
		if ($def_sno4_ptn_cd.equalsIgnoreCase(name)) {
			return def_sno4_ptn_cd();
		}
		if ($def_sno4_ptn_nm.equalsIgnoreCase(name)) {
			return def_sno4_ptn_nm();
		}
		if ($def_mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return def_mrkt_judg_role_cd();
		}
		if ($def_mrkt_judg_role_nm.equalsIgnoreCase(name)) {
			return def_mrkt_judg_role_nm();
		}
		if ($def_mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			return def_mrkt_judg_upd_role_cd();
		}
		if ($def_mrkt_judg_upd_role_nm.equalsIgnoreCase(name)) {
			return def_mrkt_judg_upd_role_nm();
		}
		if ($def_plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_plnt_aprv_role_cd();
		}
		if ($def_plnt_aprv_role_nm.equalsIgnoreCase(name)) {
			return def_plnt_aprv_role_nm();
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_insp_aprv_role_cd();
		}
		if ($def_insp_aprv_role_nm.equalsIgnoreCase(name)) {
			return def_insp_aprv_role_nm();
		}
		if ($def_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_mfg_aprv_role_cd();
		}
		if ($def_mfg_aprv_role_nm.equalsIgnoreCase(name)) {
			return def_mfg_aprv_role_nm();
		}
		if ($def_sno_typ1.equalsIgnoreCase(name)) {
			return def_sno_typ1();
		}
		if ($def_sno_typ_nm1.equalsIgnoreCase(name)) {
			return def_sno_typ_nm1();
		}
		if ($def_sno_typ2.equalsIgnoreCase(name)) {
			return def_sno_typ2();
		}
		if ($def_sno_typ_nm2.equalsIgnoreCase(name)) {
			return def_sno_typ_nm2();
		}
		if ($def_sno_typ3.equalsIgnoreCase(name)) {
			return def_sno_typ3();
		}
		if ($def_sno_typ_nm3.equalsIgnoreCase(name)) {
			return def_sno_typ_nm3();
		}
		if ($def_sno_typ4.equalsIgnoreCase(name)) {
			return def_sno_typ4();
		}
		if ($def_sno_typ_nm4.equalsIgnoreCase(name)) {
			return def_sno_typ_nm4();
		}
		if ($def_alloc_ctl_typ.equalsIgnoreCase(name)) {
			return def_alloc_ctl_typ();
		}
		if ($def_alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			return def_alloc_ctl_typ_nm();
		}
		if ($def_inpt_ctl_typ.equalsIgnoreCase(name)) {
			return def_inpt_ctl_typ();
		}
		if ($def_inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return def_inpt_ctl_typ_nm();
		}
		if ($def_bkf_typ.equalsIgnoreCase(name)) {
			return def_bkf_typ();
		}
		if ($def_bkf_typ_nm.equalsIgnoreCase(name)) {
			return def_bkf_typ_nm();
		}
		if ($def_calc_ptn_cd.equalsIgnoreCase(name)) {
			return def_calc_ptn_cd();
		}
		if ($def_calc_ptn_nm.equalsIgnoreCase(name)) {
			return def_calc_ptn_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return def_dmnd_date_div_mons();
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			return def_alloc_margin_days();
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return def_mrp_alloc_margin_days();
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return def_mrp_opn_xfr_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($def_sls_flg.equalsIgnoreCase(name)) {
			return def_sls_flg();
		}
		if ($def_mfg_flg.equalsIgnoreCase(name)) {
			return def_mfg_flg();
		}
		if ($def_purc_flg.equalsIgnoreCase(name)) {
			return def_purc_flg();
		}
		if ($def_insp_flg.equalsIgnoreCase(name)) {
			return def_insp_flg();
		}
		if ($def_minus_stk_flg.equalsIgnoreCase(name)) {
			return def_minus_stk_flg();
		}
		if ($def_not_new_lot_flg.equalsIgnoreCase(name)) {
			return def_not_new_lot_flg();
		}
		if ($def_gi_alloc_flg.equalsIgnoreCase(name)) {
			return def_gi_alloc_flg();
		}
		if ($def_pack_alloc_flg.equalsIgnoreCase(name)) {
			return def_pack_alloc_flg();
		}
		if ($def_bp_lot_flg.equalsIgnoreCase(name)) {
			return def_bp_lot_flg();
		}
		if ($def_comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			return def_comp_rev_at_slo_flg();
		}
		if ($def_comp_core_itm_flg.equalsIgnoreCase(name)) {
			return def_comp_core_itm_flg();
		}
		if ($def_skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return def_skip_chk_ship_flg();
		}
		if ($def_lmt_ctl_flg.equalsIgnoreCase(name)) {
			return def_lmt_ctl_flg();
		}
		if ($def_slo_proc_flg.equalsIgnoreCase(name)) {
			return def_slo_proc_flg();
		}
		if ($def_ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			return def_ship_lot_back_stop_flg();
		}
		if ($def_arr_skip_flg.equalsIgnoreCase(name)) {
			return def_arr_skip_flg();
		}
		if ($def_stk_lst_flg.equalsIgnoreCase(name)) {
			return def_stk_lst_flg();
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			return def_ver_flg();
		}
		if ($def_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return def_sls_upri_cng_flg();
		}
		if ($def_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return def_purc_upri_cng_flg();
		}
		if ($def_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return def_prov_upri_cng_flg();
		}
		if ($def_inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return def_inpt_itm_add_flg();
		}
		if ($def_inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return def_inpt_itm_del_flg();
		}
		if ($def_sch_flg.equalsIgnoreCase(name)) {
			return def_sch_flg();
		}
		if ($def_slo_sno1_flg.equalsIgnoreCase(name)) {
			return def_slo_sno1_flg();
		}
		if ($def_rqmt_sno1_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno1_flg();
		}
		if ($def_slo_sno2_flg.equalsIgnoreCase(name)) {
			return def_slo_sno2_flg();
		}
		if ($def_rqmt_sno2_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno2_flg();
		}
		if ($def_slo_sno3_flg.equalsIgnoreCase(name)) {
			return def_slo_sno3_flg();
		}
		if ($def_rqmt_sno3_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno3_flg();
		}
		if ($def_slo_sno4_flg.equalsIgnoreCase(name)) {
			return def_slo_sno4_flg();
		}
		if ($def_rqmt_sno4_flg.equalsIgnoreCase(name)) {
			return def_rqmt_sno4_flg();
		}
		if ($def_mrkt_judg_flg.equalsIgnoreCase(name)) {
			return def_mrkt_judg_flg();
		}
		if ($def_plnt_aprv_flg.equalsIgnoreCase(name)) {
			return def_plnt_aprv_flg();
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			return def_insp_aprv_flg();
		}
		if ($def_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return def_mfg_aprv_flg();
		}
		if ($def_inst_lot_fix_flg.equalsIgnoreCase(name)) {
			return def_inst_lot_fix_flg();
		}
		if ($def_lot_mix_flg.equalsIgnoreCase(name)) {
			return def_lot_mix_flg();
		}
		if ($def_sublot_mix_flg.equalsIgnoreCase(name)) {
			return def_sublot_mix_flg();
		}
		if ($def_main_itm_flg.equalsIgnoreCase(name)) {
			return def_main_itm_flg();
		}
		if ($def_byprod_flg.equalsIgnoreCase(name)) {
			return def_byprod_flg();
		}
		if ($def_not_cost_bom_flg.equalsIgnoreCase(name)) {
			return def_not_cost_bom_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm_lcl.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($def_itm_jnl_cd.equalsIgnoreCase(name)) {
			def_itm_jnl_cd(value);
			return;
		}
		if ($def_itm_jnl_nm.equalsIgnoreCase(name)) {
			def_itm_jnl_nm(value);
			return;
		}
		if ($def_ac_itm_grp_cd.equalsIgnoreCase(name)) {
			def_ac_itm_grp_cd(value);
			return;
		}
		if ($def_ac_itm_grp_nm.equalsIgnoreCase(name)) {
			def_ac_itm_grp_nm(value);
			return;
		}
		if ($def_comp_spec_typ.equalsIgnoreCase(name)) {
			def_comp_spec_typ(value);
			return;
		}
		if ($def_comp_spec_typ_nm.equalsIgnoreCase(name)) {
			def_comp_spec_typ_nm(value);
			return;
		}
		if ($def_insp_bind_typ.equalsIgnoreCase(name)) {
			def_insp_bind_typ(value);
			return;
		}
		if ($def_insp_bind_typ_nm.equalsIgnoreCase(name)) {
			def_insp_bind_typ_nm(value);
			return;
		}
		if ($def_itm_spec_grp_cd.equalsIgnoreCase(name)) {
			def_itm_spec_grp_cd(value);
			return;
		}
		if ($def_itm_spec_grp_nm.equalsIgnoreCase(name)) {
			def_itm_spec_grp_nm(value);
			return;
		}
		if ($def_lmt_ctl_categ.equalsIgnoreCase(name)) {
			def_lmt_ctl_categ(value);
			return;
		}
		if ($def_sls_upri_grp_cd.equalsIgnoreCase(name)) {
			def_sls_upri_grp_cd(value);
			return;
		}
		if ($def_sls_upri_grp_nm.equalsIgnoreCase(name)) {
			def_sls_upri_grp_nm(value);
			return;
		}
		if ($def_slo_proc_typ.equalsIgnoreCase(name)) {
			def_slo_proc_typ(value);
			return;
		}
		if ($def_slo_proc_typ_nm.equalsIgnoreCase(name)) {
			def_slo_proc_typ_nm(value);
			return;
		}
		if ($def_ship_inst_typ.equalsIgnoreCase(name)) {
			def_ship_inst_typ(value);
			return;
		}
		if ($def_ship_inst_typ_nm.equalsIgnoreCase(name)) {
			def_ship_inst_typ_nm(value);
			return;
		}
		if ($def_itm_ship_grp_cd.equalsIgnoreCase(name)) {
			def_itm_ship_grp_cd(value);
			return;
		}
		if ($def_itm_ship_grp_nm.equalsIgnoreCase(name)) {
			def_itm_ship_grp_nm(value);
			return;
		}
		if ($def_ship_valid_grp_cd.equalsIgnoreCase(name)) {
			def_ship_valid_grp_cd(value);
			return;
		}
		if ($def_ship_valid_grp_nm.equalsIgnoreCase(name)) {
			def_ship_valid_grp_nm(value);
			return;
		}
		if ($def_ship_term_cd.equalsIgnoreCase(name)) {
			def_ship_term_cd(value);
			return;
		}
		if ($def_ship_term_nm.equalsIgnoreCase(name)) {
			def_ship_term_nm(value);
			return;
		}
		if ($def_mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			def_mfg_inst_unit_typ(value);
			return;
		}
		if ($def_mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			def_mfg_inst_unit_typ_nm(value);
			return;
		}
		if ($def_mrp_proc_typ.equalsIgnoreCase(name)) {
			def_mrp_proc_typ(value);
			return;
		}
		if ($def_mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			def_mrp_proc_typ_nm(value);
			return;
		}
		if ($def_rqmt_typ.equalsIgnoreCase(name)) {
			def_rqmt_typ(value);
			return;
		}
		if ($def_rqmt_typ_nm.equalsIgnoreCase(name)) {
			def_rqmt_typ_nm(value);
			return;
		}
		if ($def_prod_pln_typ.equalsIgnoreCase(name)) {
			def_prod_pln_typ(value);
			return;
		}
		if ($def_prod_pln_typ_nm.equalsIgnoreCase(name)) {
			def_prod_pln_typ_nm(value);
			return;
		}
		if ($def_lot_mng_typ.equalsIgnoreCase(name)) {
			def_lot_mng_typ(value);
			return;
		}
		if ($def_lot_mng_typ_nm.equalsIgnoreCase(name)) {
			def_lot_mng_typ_nm(value);
			return;
		}
		if ($def_lot_no_typ.equalsIgnoreCase(name)) {
			def_lot_no_typ(value);
			return;
		}
		if ($def_lot_no_typ_nm.equalsIgnoreCase(name)) {
			def_lot_no_typ_nm(value);
			return;
		}
		if ($def_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			def_lot_no_ptn_cd(value);
			return;
		}
		if ($def_lot_no_ptn_nm.equalsIgnoreCase(name)) {
			def_lot_no_ptn_nm(value);
			return;
		}
		if ($def_sublot_mng_typ.equalsIgnoreCase(name)) {
			def_sublot_mng_typ(value);
			return;
		}
		if ($def_sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			def_sublot_mng_typ_nm(value);
			return;
		}
		if ($def_sublot_no_typ.equalsIgnoreCase(name)) {
			def_sublot_no_typ(value);
			return;
		}
		if ($def_sublot_no_typ_nm.equalsIgnoreCase(name)) {
			def_sublot_no_typ_nm(value);
			return;
		}
		if ($def_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			def_sublot_no_ptn_cd(value);
			return;
		}
		if ($def_sublot_no_ptn_nm.equalsIgnoreCase(name)) {
			def_sublot_no_ptn_nm(value);
			return;
		}
		if ($def_sno1_mng_typ.equalsIgnoreCase(name)) {
			def_sno1_mng_typ(value);
			return;
		}
		if ($def_sno1_mng_typ_nm.equalsIgnoreCase(name)) {
			def_sno1_mng_typ_nm(value);
			return;
		}
		if ($def_sno1_num_typ.equalsIgnoreCase(name)) {
			def_sno1_num_typ(value);
			return;
		}
		if ($def_sno1_num_typ_nm.equalsIgnoreCase(name)) {
			def_sno1_num_typ_nm(value);
			return;
		}
		if ($def_sno1_ptn_cd.equalsIgnoreCase(name)) {
			def_sno1_ptn_cd(value);
			return;
		}
		if ($def_sno1_ptn_nm.equalsIgnoreCase(name)) {
			def_sno1_ptn_nm(value);
			return;
		}
		if ($def_sno2_mng_typ.equalsIgnoreCase(name)) {
			def_sno2_mng_typ(value);
			return;
		}
		if ($def_sno2_mng_typ_nm.equalsIgnoreCase(name)) {
			def_sno2_mng_typ_nm(value);
			return;
		}
		if ($def_sno2_num_typ.equalsIgnoreCase(name)) {
			def_sno2_num_typ(value);
			return;
		}
		if ($def_sno2_num_typ_nm.equalsIgnoreCase(name)) {
			def_sno2_num_typ_nm(value);
			return;
		}
		if ($def_sno2_ptn_cd.equalsIgnoreCase(name)) {
			def_sno2_ptn_cd(value);
			return;
		}
		if ($def_sno2_ptn_nm.equalsIgnoreCase(name)) {
			def_sno2_ptn_nm(value);
			return;
		}
		if ($def_sno3_mng_typ.equalsIgnoreCase(name)) {
			def_sno3_mng_typ(value);
			return;
		}
		if ($def_sno3_mng_typ_nm.equalsIgnoreCase(name)) {
			def_sno3_mng_typ_nm(value);
			return;
		}
		if ($def_sno3_num_typ.equalsIgnoreCase(name)) {
			def_sno3_num_typ(value);
			return;
		}
		if ($def_sno3_num_typ_nm.equalsIgnoreCase(name)) {
			def_sno3_num_typ_nm(value);
			return;
		}
		if ($def_sno3_ptn_cd.equalsIgnoreCase(name)) {
			def_sno3_ptn_cd(value);
			return;
		}
		if ($def_sno3_ptn_nm.equalsIgnoreCase(name)) {
			def_sno3_ptn_nm(value);
			return;
		}
		if ($def_sno4_mng_typ.equalsIgnoreCase(name)) {
			def_sno4_mng_typ(value);
			return;
		}
		if ($def_sno4_mng_typ_nm.equalsIgnoreCase(name)) {
			def_sno4_mng_typ_nm(value);
			return;
		}
		if ($def_sno4_num_typ.equalsIgnoreCase(name)) {
			def_sno4_num_typ(value);
			return;
		}
		if ($def_sno4_num_typ_nm.equalsIgnoreCase(name)) {
			def_sno4_num_typ_nm(value);
			return;
		}
		if ($def_sno4_ptn_cd.equalsIgnoreCase(name)) {
			def_sno4_ptn_cd(value);
			return;
		}
		if ($def_sno4_ptn_nm.equalsIgnoreCase(name)) {
			def_sno4_ptn_nm(value);
			return;
		}
		if ($def_mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			def_mrkt_judg_role_cd(value);
			return;
		}
		if ($def_mrkt_judg_role_nm.equalsIgnoreCase(name)) {
			def_mrkt_judg_role_nm(value);
			return;
		}
		if ($def_mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			def_mrkt_judg_upd_role_cd(value);
			return;
		}
		if ($def_mrkt_judg_upd_role_nm.equalsIgnoreCase(name)) {
			def_mrkt_judg_upd_role_nm(value);
			return;
		}
		if ($def_plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			def_plnt_aprv_role_cd(value);
			return;
		}
		if ($def_plnt_aprv_role_nm.equalsIgnoreCase(name)) {
			def_plnt_aprv_role_nm(value);
			return;
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			def_insp_aprv_role_cd(value);
			return;
		}
		if ($def_insp_aprv_role_nm.equalsIgnoreCase(name)) {
			def_insp_aprv_role_nm(value);
			return;
		}
		if ($def_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			def_mfg_aprv_role_cd(value);
			return;
		}
		if ($def_mfg_aprv_role_nm.equalsIgnoreCase(name)) {
			def_mfg_aprv_role_nm(value);
			return;
		}
		if ($def_sno_typ1.equalsIgnoreCase(name)) {
			def_sno_typ1(value);
			return;
		}
		if ($def_sno_typ_nm1.equalsIgnoreCase(name)) {
			def_sno_typ_nm1(value);
			return;
		}
		if ($def_sno_typ2.equalsIgnoreCase(name)) {
			def_sno_typ2(value);
			return;
		}
		if ($def_sno_typ_nm2.equalsIgnoreCase(name)) {
			def_sno_typ_nm2(value);
			return;
		}
		if ($def_sno_typ3.equalsIgnoreCase(name)) {
			def_sno_typ3(value);
			return;
		}
		if ($def_sno_typ_nm3.equalsIgnoreCase(name)) {
			def_sno_typ_nm3(value);
			return;
		}
		if ($def_sno_typ4.equalsIgnoreCase(name)) {
			def_sno_typ4(value);
			return;
		}
		if ($def_sno_typ_nm4.equalsIgnoreCase(name)) {
			def_sno_typ_nm4(value);
			return;
		}
		if ($def_alloc_ctl_typ.equalsIgnoreCase(name)) {
			def_alloc_ctl_typ(value);
			return;
		}
		if ($def_alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			def_alloc_ctl_typ_nm(value);
			return;
		}
		if ($def_inpt_ctl_typ.equalsIgnoreCase(name)) {
			def_inpt_ctl_typ(value);
			return;
		}
		if ($def_inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			def_inpt_ctl_typ_nm(value);
			return;
		}
		if ($def_bkf_typ.equalsIgnoreCase(name)) {
			def_bkf_typ(value);
			return;
		}
		if ($def_bkf_typ_nm.equalsIgnoreCase(name)) {
			def_bkf_typ_nm(value);
			return;
		}
		if ($def_calc_ptn_cd.equalsIgnoreCase(name)) {
			def_calc_ptn_cd(value);
			return;
		}
		if ($def_calc_ptn_nm.equalsIgnoreCase(name)) {
			def_calc_ptn_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($def_sls_flg.equalsIgnoreCase(name)) {
			def_sls_flg(value);
			return;
		}
		if ($def_mfg_flg.equalsIgnoreCase(name)) {
			def_mfg_flg(value);
			return;
		}
		if ($def_purc_flg.equalsIgnoreCase(name)) {
			def_purc_flg(value);
			return;
		}
		if ($def_insp_flg.equalsIgnoreCase(name)) {
			def_insp_flg(value);
			return;
		}
		if ($def_minus_stk_flg.equalsIgnoreCase(name)) {
			def_minus_stk_flg(value);
			return;
		}
		if ($def_not_new_lot_flg.equalsIgnoreCase(name)) {
			def_not_new_lot_flg(value);
			return;
		}
		if ($def_gi_alloc_flg.equalsIgnoreCase(name)) {
			def_gi_alloc_flg(value);
			return;
		}
		if ($def_pack_alloc_flg.equalsIgnoreCase(name)) {
			def_pack_alloc_flg(value);
			return;
		}
		if ($def_bp_lot_flg.equalsIgnoreCase(name)) {
			def_bp_lot_flg(value);
			return;
		}
		if ($def_comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			def_comp_rev_at_slo_flg(value);
			return;
		}
		if ($def_comp_core_itm_flg.equalsIgnoreCase(name)) {
			def_comp_core_itm_flg(value);
			return;
		}
		if ($def_skip_chk_ship_flg.equalsIgnoreCase(name)) {
			def_skip_chk_ship_flg(value);
			return;
		}
		if ($def_lmt_ctl_flg.equalsIgnoreCase(name)) {
			def_lmt_ctl_flg(value);
			return;
		}
		if ($def_slo_proc_flg.equalsIgnoreCase(name)) {
			def_slo_proc_flg(value);
			return;
		}
		if ($def_ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			def_ship_lot_back_stop_flg(value);
			return;
		}
		if ($def_arr_skip_flg.equalsIgnoreCase(name)) {
			def_arr_skip_flg(value);
			return;
		}
		if ($def_stk_lst_flg.equalsIgnoreCase(name)) {
			def_stk_lst_flg(value);
			return;
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			def_ver_flg(value);
			return;
		}
		if ($def_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			def_sls_upri_cng_flg(value);
			return;
		}
		if ($def_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			def_purc_upri_cng_flg(value);
			return;
		}
		if ($def_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			def_prov_upri_cng_flg(value);
			return;
		}
		if ($def_inpt_itm_add_flg.equalsIgnoreCase(name)) {
			def_inpt_itm_add_flg(value);
			return;
		}
		if ($def_inpt_itm_del_flg.equalsIgnoreCase(name)) {
			def_inpt_itm_del_flg(value);
			return;
		}
		if ($def_sch_flg.equalsIgnoreCase(name)) {
			def_sch_flg(value);
			return;
		}
		if ($def_slo_sno1_flg.equalsIgnoreCase(name)) {
			def_slo_sno1_flg(value);
			return;
		}
		if ($def_rqmt_sno1_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno1_flg(value);
			return;
		}
		if ($def_slo_sno2_flg.equalsIgnoreCase(name)) {
			def_slo_sno2_flg(value);
			return;
		}
		if ($def_rqmt_sno2_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno2_flg(value);
			return;
		}
		if ($def_slo_sno3_flg.equalsIgnoreCase(name)) {
			def_slo_sno3_flg(value);
			return;
		}
		if ($def_rqmt_sno3_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno3_flg(value);
			return;
		}
		if ($def_slo_sno4_flg.equalsIgnoreCase(name)) {
			def_slo_sno4_flg(value);
			return;
		}
		if ($def_rqmt_sno4_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno4_flg(value);
			return;
		}
		if ($def_mrkt_judg_flg.equalsIgnoreCase(name)) {
			def_mrkt_judg_flg(value);
			return;
		}
		if ($def_plnt_aprv_flg.equalsIgnoreCase(name)) {
			def_plnt_aprv_flg(value);
			return;
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			def_insp_aprv_flg(value);
			return;
		}
		if ($def_mfg_aprv_flg.equalsIgnoreCase(name)) {
			def_mfg_aprv_flg(value);
			return;
		}
		if ($def_inst_lot_fix_flg.equalsIgnoreCase(name)) {
			def_inst_lot_fix_flg(value);
			return;
		}
		if ($def_lot_mix_flg.equalsIgnoreCase(name)) {
			def_lot_mix_flg(value);
			return;
		}
		if ($def_sublot_mix_flg.equalsIgnoreCase(name)) {
			def_sublot_mix_flg(value);
			return;
		}
		if ($def_main_itm_flg.equalsIgnoreCase(name)) {
			def_main_itm_flg(value);
			return;
		}
		if ($def_byprod_flg.equalsIgnoreCase(name)) {
			def_byprod_flg(value);
			return;
		}
		if ($def_not_cost_bom_flg.equalsIgnoreCase(name)) {
			def_not_cost_bom_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm_lcl.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($def_itm_jnl_cd.equalsIgnoreCase(name)) {
			def_itm_jnl_cd(value);
			return;
		}
		if ($def_itm_jnl_nm.equalsIgnoreCase(name)) {
			def_itm_jnl_nm(value);
			return;
		}
		if ($def_ac_itm_grp_cd.equalsIgnoreCase(name)) {
			def_ac_itm_grp_cd(value);
			return;
		}
		if ($def_ac_itm_grp_nm.equalsIgnoreCase(name)) {
			def_ac_itm_grp_nm(value);
			return;
		}
		if ($def_comp_spec_typ.equalsIgnoreCase(name)) {
			def_comp_spec_typ(value);
			return;
		}
		if ($def_comp_spec_typ_nm.equalsIgnoreCase(name)) {
			def_comp_spec_typ_nm(value);
			return;
		}
		if ($def_insp_bind_typ.equalsIgnoreCase(name)) {
			def_insp_bind_typ(value);
			return;
		}
		if ($def_insp_bind_typ_nm.equalsIgnoreCase(name)) {
			def_insp_bind_typ_nm(value);
			return;
		}
		if ($def_itm_spec_grp_cd.equalsIgnoreCase(name)) {
			def_itm_spec_grp_cd(value);
			return;
		}
		if ($def_itm_spec_grp_nm.equalsIgnoreCase(name)) {
			def_itm_spec_grp_nm(value);
			return;
		}
		if ($def_lmt_ctl_categ.equalsIgnoreCase(name)) {
			def_lmt_ctl_categ(value);
			return;
		}
		if ($def_sls_upri_grp_cd.equalsIgnoreCase(name)) {
			def_sls_upri_grp_cd(value);
			return;
		}
		if ($def_sls_upri_grp_nm.equalsIgnoreCase(name)) {
			def_sls_upri_grp_nm(value);
			return;
		}
		if ($def_slo_proc_typ.equalsIgnoreCase(name)) {
			def_slo_proc_typ(value);
			return;
		}
		if ($def_slo_proc_typ_nm.equalsIgnoreCase(name)) {
			def_slo_proc_typ_nm(value);
			return;
		}
		if ($def_ship_inst_typ.equalsIgnoreCase(name)) {
			def_ship_inst_typ(value);
			return;
		}
		if ($def_ship_inst_typ_nm.equalsIgnoreCase(name)) {
			def_ship_inst_typ_nm(value);
			return;
		}
		if ($def_itm_ship_grp_cd.equalsIgnoreCase(name)) {
			def_itm_ship_grp_cd(value);
			return;
		}
		if ($def_itm_ship_grp_nm.equalsIgnoreCase(name)) {
			def_itm_ship_grp_nm(value);
			return;
		}
		if ($def_ship_valid_grp_cd.equalsIgnoreCase(name)) {
			def_ship_valid_grp_cd(value);
			return;
		}
		if ($def_ship_valid_grp_nm.equalsIgnoreCase(name)) {
			def_ship_valid_grp_nm(value);
			return;
		}
		if ($def_ship_term_cd.equalsIgnoreCase(name)) {
			def_ship_term_cd(value);
			return;
		}
		if ($def_ship_term_nm.equalsIgnoreCase(name)) {
			def_ship_term_nm(value);
			return;
		}
		if ($def_mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			def_mfg_inst_unit_typ(value);
			return;
		}
		if ($def_mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			def_mfg_inst_unit_typ_nm(value);
			return;
		}
		if ($def_mrp_proc_typ.equalsIgnoreCase(name)) {
			def_mrp_proc_typ(value);
			return;
		}
		if ($def_mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			def_mrp_proc_typ_nm(value);
			return;
		}
		if ($def_rqmt_typ.equalsIgnoreCase(name)) {
			def_rqmt_typ(value);
			return;
		}
		if ($def_rqmt_typ_nm.equalsIgnoreCase(name)) {
			def_rqmt_typ_nm(value);
			return;
		}
		if ($def_prod_pln_typ.equalsIgnoreCase(name)) {
			def_prod_pln_typ(value);
			return;
		}
		if ($def_prod_pln_typ_nm.equalsIgnoreCase(name)) {
			def_prod_pln_typ_nm(value);
			return;
		}
		if ($def_lot_mng_typ.equalsIgnoreCase(name)) {
			def_lot_mng_typ(value);
			return;
		}
		if ($def_lot_mng_typ_nm.equalsIgnoreCase(name)) {
			def_lot_mng_typ_nm(value);
			return;
		}
		if ($def_lot_no_typ.equalsIgnoreCase(name)) {
			def_lot_no_typ(value);
			return;
		}
		if ($def_lot_no_typ_nm.equalsIgnoreCase(name)) {
			def_lot_no_typ_nm(value);
			return;
		}
		if ($def_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			def_lot_no_ptn_cd(value);
			return;
		}
		if ($def_lot_no_ptn_nm.equalsIgnoreCase(name)) {
			def_lot_no_ptn_nm(value);
			return;
		}
		if ($def_sublot_mng_typ.equalsIgnoreCase(name)) {
			def_sublot_mng_typ(value);
			return;
		}
		if ($def_sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			def_sublot_mng_typ_nm(value);
			return;
		}
		if ($def_sublot_no_typ.equalsIgnoreCase(name)) {
			def_sublot_no_typ(value);
			return;
		}
		if ($def_sublot_no_typ_nm.equalsIgnoreCase(name)) {
			def_sublot_no_typ_nm(value);
			return;
		}
		if ($def_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			def_sublot_no_ptn_cd(value);
			return;
		}
		if ($def_sublot_no_ptn_nm.equalsIgnoreCase(name)) {
			def_sublot_no_ptn_nm(value);
			return;
		}
		if ($def_sno1_mng_typ.equalsIgnoreCase(name)) {
			def_sno1_mng_typ(value);
			return;
		}
		if ($def_sno1_mng_typ_nm.equalsIgnoreCase(name)) {
			def_sno1_mng_typ_nm(value);
			return;
		}
		if ($def_sno1_num_typ.equalsIgnoreCase(name)) {
			def_sno1_num_typ(value);
			return;
		}
		if ($def_sno1_num_typ_nm.equalsIgnoreCase(name)) {
			def_sno1_num_typ_nm(value);
			return;
		}
		if ($def_sno1_ptn_cd.equalsIgnoreCase(name)) {
			def_sno1_ptn_cd(value);
			return;
		}
		if ($def_sno1_ptn_nm.equalsIgnoreCase(name)) {
			def_sno1_ptn_nm(value);
			return;
		}
		if ($def_sno2_mng_typ.equalsIgnoreCase(name)) {
			def_sno2_mng_typ(value);
			return;
		}
		if ($def_sno2_mng_typ_nm.equalsIgnoreCase(name)) {
			def_sno2_mng_typ_nm(value);
			return;
		}
		if ($def_sno2_num_typ.equalsIgnoreCase(name)) {
			def_sno2_num_typ(value);
			return;
		}
		if ($def_sno2_num_typ_nm.equalsIgnoreCase(name)) {
			def_sno2_num_typ_nm(value);
			return;
		}
		if ($def_sno2_ptn_cd.equalsIgnoreCase(name)) {
			def_sno2_ptn_cd(value);
			return;
		}
		if ($def_sno2_ptn_nm.equalsIgnoreCase(name)) {
			def_sno2_ptn_nm(value);
			return;
		}
		if ($def_sno3_mng_typ.equalsIgnoreCase(name)) {
			def_sno3_mng_typ(value);
			return;
		}
		if ($def_sno3_mng_typ_nm.equalsIgnoreCase(name)) {
			def_sno3_mng_typ_nm(value);
			return;
		}
		if ($def_sno3_num_typ.equalsIgnoreCase(name)) {
			def_sno3_num_typ(value);
			return;
		}
		if ($def_sno3_num_typ_nm.equalsIgnoreCase(name)) {
			def_sno3_num_typ_nm(value);
			return;
		}
		if ($def_sno3_ptn_cd.equalsIgnoreCase(name)) {
			def_sno3_ptn_cd(value);
			return;
		}
		if ($def_sno3_ptn_nm.equalsIgnoreCase(name)) {
			def_sno3_ptn_nm(value);
			return;
		}
		if ($def_sno4_mng_typ.equalsIgnoreCase(name)) {
			def_sno4_mng_typ(value);
			return;
		}
		if ($def_sno4_mng_typ_nm.equalsIgnoreCase(name)) {
			def_sno4_mng_typ_nm(value);
			return;
		}
		if ($def_sno4_num_typ.equalsIgnoreCase(name)) {
			def_sno4_num_typ(value);
			return;
		}
		if ($def_sno4_num_typ_nm.equalsIgnoreCase(name)) {
			def_sno4_num_typ_nm(value);
			return;
		}
		if ($def_sno4_ptn_cd.equalsIgnoreCase(name)) {
			def_sno4_ptn_cd(value);
			return;
		}
		if ($def_sno4_ptn_nm.equalsIgnoreCase(name)) {
			def_sno4_ptn_nm(value);
			return;
		}
		if ($def_mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			def_mrkt_judg_role_cd(value);
			return;
		}
		if ($def_mrkt_judg_role_nm.equalsIgnoreCase(name)) {
			def_mrkt_judg_role_nm(value);
			return;
		}
		if ($def_mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			def_mrkt_judg_upd_role_cd(value);
			return;
		}
		if ($def_mrkt_judg_upd_role_nm.equalsIgnoreCase(name)) {
			def_mrkt_judg_upd_role_nm(value);
			return;
		}
		if ($def_plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			def_plnt_aprv_role_cd(value);
			return;
		}
		if ($def_plnt_aprv_role_nm.equalsIgnoreCase(name)) {
			def_plnt_aprv_role_nm(value);
			return;
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			def_insp_aprv_role_cd(value);
			return;
		}
		if ($def_insp_aprv_role_nm.equalsIgnoreCase(name)) {
			def_insp_aprv_role_nm(value);
			return;
		}
		if ($def_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			def_mfg_aprv_role_cd(value);
			return;
		}
		if ($def_mfg_aprv_role_nm.equalsIgnoreCase(name)) {
			def_mfg_aprv_role_nm(value);
			return;
		}
		if ($def_sno_typ1.equalsIgnoreCase(name)) {
			def_sno_typ1(value);
			return;
		}
		if ($def_sno_typ_nm1.equalsIgnoreCase(name)) {
			def_sno_typ_nm1(value);
			return;
		}
		if ($def_sno_typ2.equalsIgnoreCase(name)) {
			def_sno_typ2(value);
			return;
		}
		if ($def_sno_typ_nm2.equalsIgnoreCase(name)) {
			def_sno_typ_nm2(value);
			return;
		}
		if ($def_sno_typ3.equalsIgnoreCase(name)) {
			def_sno_typ3(value);
			return;
		}
		if ($def_sno_typ_nm3.equalsIgnoreCase(name)) {
			def_sno_typ_nm3(value);
			return;
		}
		if ($def_sno_typ4.equalsIgnoreCase(name)) {
			def_sno_typ4(value);
			return;
		}
		if ($def_sno_typ_nm4.equalsIgnoreCase(name)) {
			def_sno_typ_nm4(value);
			return;
		}
		if ($def_alloc_ctl_typ.equalsIgnoreCase(name)) {
			def_alloc_ctl_typ(value);
			return;
		}
		if ($def_alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			def_alloc_ctl_typ_nm(value);
			return;
		}
		if ($def_inpt_ctl_typ.equalsIgnoreCase(name)) {
			def_inpt_ctl_typ(value);
			return;
		}
		if ($def_inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			def_inpt_ctl_typ_nm(value);
			return;
		}
		if ($def_bkf_typ.equalsIgnoreCase(name)) {
			def_bkf_typ(value);
			return;
		}
		if ($def_bkf_typ_nm.equalsIgnoreCase(name)) {
			def_bkf_typ_nm(value);
			return;
		}
		if ($def_calc_ptn_cd.equalsIgnoreCase(name)) {
			def_calc_ptn_cd(value);
			return;
		}
		if ($def_calc_ptn_nm.equalsIgnoreCase(name)) {
			def_calc_ptn_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($def_dmnd_date_div_mons.equalsIgnoreCase(name)) {
			def_dmnd_date_div_mons(value);
			return;
		}
		if ($def_alloc_margin_days.equalsIgnoreCase(name)) {
			def_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			def_mrp_alloc_margin_days(value);
			return;
		}
		if ($def_mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			def_mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($def_sls_flg.equalsIgnoreCase(name)) {
			def_sls_flg(value);
			return;
		}
		if ($def_mfg_flg.equalsIgnoreCase(name)) {
			def_mfg_flg(value);
			return;
		}
		if ($def_purc_flg.equalsIgnoreCase(name)) {
			def_purc_flg(value);
			return;
		}
		if ($def_insp_flg.equalsIgnoreCase(name)) {
			def_insp_flg(value);
			return;
		}
		if ($def_minus_stk_flg.equalsIgnoreCase(name)) {
			def_minus_stk_flg(value);
			return;
		}
		if ($def_not_new_lot_flg.equalsIgnoreCase(name)) {
			def_not_new_lot_flg(value);
			return;
		}
		if ($def_gi_alloc_flg.equalsIgnoreCase(name)) {
			def_gi_alloc_flg(value);
			return;
		}
		if ($def_pack_alloc_flg.equalsIgnoreCase(name)) {
			def_pack_alloc_flg(value);
			return;
		}
		if ($def_bp_lot_flg.equalsIgnoreCase(name)) {
			def_bp_lot_flg(value);
			return;
		}
		if ($def_comp_rev_at_slo_flg.equalsIgnoreCase(name)) {
			def_comp_rev_at_slo_flg(value);
			return;
		}
		if ($def_comp_core_itm_flg.equalsIgnoreCase(name)) {
			def_comp_core_itm_flg(value);
			return;
		}
		if ($def_skip_chk_ship_flg.equalsIgnoreCase(name)) {
			def_skip_chk_ship_flg(value);
			return;
		}
		if ($def_lmt_ctl_flg.equalsIgnoreCase(name)) {
			def_lmt_ctl_flg(value);
			return;
		}
		if ($def_slo_proc_flg.equalsIgnoreCase(name)) {
			def_slo_proc_flg(value);
			return;
		}
		if ($def_ship_lot_back_stop_flg.equalsIgnoreCase(name)) {
			def_ship_lot_back_stop_flg(value);
			return;
		}
		if ($def_arr_skip_flg.equalsIgnoreCase(name)) {
			def_arr_skip_flg(value);
			return;
		}
		if ($def_stk_lst_flg.equalsIgnoreCase(name)) {
			def_stk_lst_flg(value);
			return;
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			def_ver_flg(value);
			return;
		}
		if ($def_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			def_sls_upri_cng_flg(value);
			return;
		}
		if ($def_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			def_purc_upri_cng_flg(value);
			return;
		}
		if ($def_prov_upri_cng_flg.equalsIgnoreCase(name)) {
			def_prov_upri_cng_flg(value);
			return;
		}
		if ($def_inpt_itm_add_flg.equalsIgnoreCase(name)) {
			def_inpt_itm_add_flg(value);
			return;
		}
		if ($def_inpt_itm_del_flg.equalsIgnoreCase(name)) {
			def_inpt_itm_del_flg(value);
			return;
		}
		if ($def_sch_flg.equalsIgnoreCase(name)) {
			def_sch_flg(value);
			return;
		}
		if ($def_slo_sno1_flg.equalsIgnoreCase(name)) {
			def_slo_sno1_flg(value);
			return;
		}
		if ($def_rqmt_sno1_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno1_flg(value);
			return;
		}
		if ($def_slo_sno2_flg.equalsIgnoreCase(name)) {
			def_slo_sno2_flg(value);
			return;
		}
		if ($def_rqmt_sno2_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno2_flg(value);
			return;
		}
		if ($def_slo_sno3_flg.equalsIgnoreCase(name)) {
			def_slo_sno3_flg(value);
			return;
		}
		if ($def_rqmt_sno3_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno3_flg(value);
			return;
		}
		if ($def_slo_sno4_flg.equalsIgnoreCase(name)) {
			def_slo_sno4_flg(value);
			return;
		}
		if ($def_rqmt_sno4_flg.equalsIgnoreCase(name)) {
			def_rqmt_sno4_flg(value);
			return;
		}
		if ($def_mrkt_judg_flg.equalsIgnoreCase(name)) {
			def_mrkt_judg_flg(value);
			return;
		}
		if ($def_plnt_aprv_flg.equalsIgnoreCase(name)) {
			def_plnt_aprv_flg(value);
			return;
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			def_insp_aprv_flg(value);
			return;
		}
		if ($def_mfg_aprv_flg.equalsIgnoreCase(name)) {
			def_mfg_aprv_flg(value);
			return;
		}
		if ($def_inst_lot_fix_flg.equalsIgnoreCase(name)) {
			def_inst_lot_fix_flg(value);
			return;
		}
		if ($def_lot_mix_flg.equalsIgnoreCase(name)) {
			def_lot_mix_flg(value);
			return;
		}
		if ($def_sublot_mix_flg.equalsIgnoreCase(name)) {
			def_sublot_mix_flg(value);
			return;
		}
		if ($def_main_itm_flg.equalsIgnoreCase(name)) {
			def_main_itm_flg(value);
			return;
		}
		if ($def_byprod_flg.equalsIgnoreCase(name)) {
			def_byprod_flg(value);
			return;
		}
		if ($def_not_cost_bom_flg.equalsIgnoreCase(name)) {
			def_not_cost_bom_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

