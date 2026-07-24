package mcframe.clientMGBF.MGBFP0270;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
	public static final String $par_itm_p = "par_itm_p";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public static final String $par_itm_typ = "par_itm_typ";
	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public static final String $par_itm_typ_nm = "par_itm_typ_nm";
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_typ_d_cd = "par_itm_typ_d_cd";
	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public static final String $par_itm_typ_d_nm = "par_itm_typ_d_nm";
	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_jnl_cd = "par_itm_jnl_cd";
	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public static final String $par_itm_jnl_nm = "par_itm_jnl_nm";
	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $par_itm_grp_cd1 = "par_itm_grp_cd1";
	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public static final String $par_itm_grp_nm1 = "par_itm_grp_nm1";
	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $par_itm_grp_cd2 = "par_itm_grp_cd2";
	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public static final String $par_itm_grp_nm2 = "par_itm_grp_nm2";
	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $par_itm_grp_cd3 = "par_itm_grp_cd3";
	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public static final String $par_itm_grp_nm3 = "par_itm_grp_nm3";
	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $par_itm_grp_cd4 = "par_itm_grp_cd4";
	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public static final String $par_itm_grp_nm4 = "par_itm_grp_nm4";
	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $par_itm_grp_cd5 = "par_itm_grp_cd5";
	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public static final String $par_itm_grp_nm5 = "par_itm_grp_nm5";
	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $par_itm_grp_cd6 = "par_itm_grp_cd6";
	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public static final String $par_itm_grp_nm6 = "par_itm_grp_nm6";
	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $par_itm_grp_cd7 = "par_itm_grp_cd7";
	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public static final String $par_itm_grp_nm7 = "par_itm_grp_nm7";
	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $par_itm_grp_cd8 = "par_itm_grp_cd8";
	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public static final String $par_itm_grp_nm8 = "par_itm_grp_nm8";
	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $par_itm_grp_cd9 = "par_itm_grp_cd9";
	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public static final String $par_itm_grp_nm9 = "par_itm_grp_nm9";
	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $par_itm_grp_cd10 = "par_itm_grp_cd10";
	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public static final String $par_itm_grp_nm10 = "par_itm_grp_nm10";
	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public static final String $par_lot_no = "par_lot_no";
	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public static final String $par_sublot_no = "par_sublot_no";
	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public static final String $par_sno1 = "par_sno1";
	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public static final String $par_sno2 = "par_sno2";
	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public static final String $par_sno3 = "par_sno3";
	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public static final String $par_sno4 = "par_sno4";
	/**
	 * Parent asset type 親資産区分.<p>
	 *
	 */
	public static final String $par_asst_typ = "par_asst_typ";
	/**
	 * Parent asset type name 親資産区分名.<p>
	 *
	 */
	public static final String $par_asst_typ_nm = "par_asst_typ_nm";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public static final String $bp_grp_cd1 = "bp_grp_cd1";
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public static final String $bp_grp_nm1 = "bp_grp_nm1";
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public static final String $bp_grp_cd2 = "bp_grp_cd2";
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public static final String $bp_grp_nm2 = "bp_grp_nm2";
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public static final String $bp_grp_cd3 = "bp_grp_cd3";
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public static final String $bp_grp_nm3 = "bp_grp_nm3";
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public static final String $bp_grp_cd4 = "bp_grp_cd4";
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public static final String $bp_grp_nm4 = "bp_grp_nm4";
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public static final String $bp_grp_cd5 = "bp_grp_cd5";
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public static final String $bp_grp_nm5 = "bp_grp_nm5";
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public static final String $bp_grp_cd6 = "bp_grp_cd6";
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public static final String $bp_grp_nm6 = "bp_grp_nm6";
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public static final String $bp_grp_cd7 = "bp_grp_cd7";
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public static final String $bp_grp_nm7 = "bp_grp_nm7";
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public static final String $bp_grp_cd8 = "bp_grp_cd8";
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public static final String $bp_grp_nm8 = "bp_grp_nm8";
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public static final String $bp_grp_cd9 = "bp_grp_cd9";
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public static final String $bp_grp_nm9 = "bp_grp_nm9";
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bp_grp_cd10 = "bp_grp_cd10";
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public static final String $bp_grp_nm10 = "bp_grp_nm10";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Country name 国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public static final String $area_cd = "area_cd";
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public static final String $area_nm = "area_nm";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	public static final String $comp_qty_p = "comp_qty_p";
	public static final String $odr_qty_p = "odr_qty_p";
	/**
	 * Parent unit cd. 親単位ＣＤ.<p>
	 *
	 */
	public static final String $par_unit_cd = "par_unit_cd";
	/**
	 * Parent unit name 親単位名.<p>
	 *
	 */
	public static final String $par_unit_nm = "par_unit_nm";
	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public static final String $par_dec_place = "par_dec_place";
	/**
	 * Input dept. cd. 投入部門ＣＤ.<p>
	 *
	 */
	public static final String $inpt_dpt_cd = "inpt_dpt_cd";
	/**
	 * Input dept. name 投入部門名.<p>
	 *
	 */
	public static final String $inpt_dpt_nm = "inpt_dpt_nm";
	public static final String $chd_itm_p = "chd_itm_p";
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public static final String $chd_itm_typ = "chd_itm_typ";
	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public static final String $chd_itm_typ_nm = "chd_itm_typ_nm";
	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $chd_itm_typ_d_cd = "chd_itm_typ_d_cd";
	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public static final String $chd_itm_typ_d_nm = "chd_itm_typ_d_nm";
	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $chd_itm_jnl_cd = "chd_itm_jnl_cd";
	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public static final String $chd_itm_jnl_nm = "chd_itm_jnl_nm";
	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd1 = "chd_itm_grp_cd1";
	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm1 = "chd_itm_grp_nm1";
	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd2 = "chd_itm_grp_cd2";
	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm2 = "chd_itm_grp_nm2";
	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd3 = "chd_itm_grp_cd3";
	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm3 = "chd_itm_grp_nm3";
	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd4 = "chd_itm_grp_cd4";
	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm4 = "chd_itm_grp_nm4";
	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd5 = "chd_itm_grp_cd5";
	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm5 = "chd_itm_grp_nm5";
	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd6 = "chd_itm_grp_cd6";
	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm6 = "chd_itm_grp_nm6";
	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd7 = "chd_itm_grp_cd7";
	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm7 = "chd_itm_grp_nm7";
	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd8 = "chd_itm_grp_cd8";
	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm8 = "chd_itm_grp_nm8";
	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd9 = "chd_itm_grp_cd9";
	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm9 = "chd_itm_grp_nm9";
	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd10 = "chd_itm_grp_cd10";
	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm10 = "chd_itm_grp_nm10";
	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public static final String $chd_lot_no = "chd_lot_no";
	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public static final String $chd_sublot_no = "chd_sublot_no";
	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public static final String $chd_sno1 = "chd_sno1";
	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public static final String $chd_sno2 = "chd_sno2";
	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public static final String $chd_sno3 = "chd_sno3";
	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public static final String $chd_sno4 = "chd_sno4";
	/**
	 * Child asset type 子資産区分.<p>
	 *
	 */
	public static final String $chd_asst_typ = "chd_asst_typ";
	/**
	 * Child asset type name 子資産区分名.<p>
	 *
	 */
	public static final String $chd_asst_typ_nm = "chd_asst_typ_nm";
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Line name ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public static final String $ac_slip_typ_nm = "ac_slip_typ_nm";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	public static final String $qty_diff_p = "qty_diff_p";
	public static final String $std_qty_p = "std_qty_p";
	public static final String $act_qty_p = "act_qty_p";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Unit price variance 単価差.<p>
	 *
	 */
	public static final String $upri_diff = "upri_diff";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $std_upri = "std_upri";
	/**
	 * Issue unit price 払出単価.<p>
	 *
	 */
	public static final String $act_upri = "act_upri";
	/**
	 * Quantity variance 数量差異.<p>
	 *
	 */
	public static final String $diff_qty = "diff_qty";
	/**
	 * Price variance 価格差異.<p>
	 *
	 */
	public static final String $diff_up = "diff_up";
	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public static final String $cost_diff = "cost_diff";
	/**
	 * Standard input cost 標準投入原価.<p>
	 *
	 */
	public static final String $std_cost = "std_cost";
	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public static final String $act_cost = "act_cost";
	/**
	 * Total 合計.<p>
	 *
	 */
	public static final String $ttl = "ttl";
	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public static final String $var_cost = "var_cost";
	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public static final String $fxd_cost = "fxd_cost";
	/**
	 * Total 合計.<p>
	 *
	 */
	public static final String $ttl_qty = "ttl_qty";
	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public static final String $var_cost_qty = "var_cost_qty";
	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public static final String $fxd_cost_qty = "fxd_cost_qty";
	/**
	 * Total 合計.<p>
	 *
	 */
	public static final String $ttl_up = "ttl_up";
	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public static final String $var_cost_up = "var_cost_up";
	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public static final String $fxd_cost_up = "fxd_cost_up";
	public static final String $col_000 = "col_000";
	public static final String $col_001 = "col_001";
	public static final String $col_002 = "col_002";
	public static final String $col_003 = "col_003";
	public static final String $col_004 = "col_004";
	public static final String $col_005 = "col_005";
	public static final String $col_006 = "col_006";
	public static final String $col_007 = "col_007";
	public static final String $col_008 = "col_008";
	public static final String $col_009 = "col_009";
	public static final String $col_010 = "col_010";
	public static final String $col_011 = "col_011";
	public static final String $col_012 = "col_012";
	public static final String $col_013 = "col_013";
	public static final String $col_014 = "col_014";
	public static final String $col_015 = "col_015";
	public static final String $col_016 = "col_016";
	public static final String $col_017 = "col_017";
	public static final String $col_018 = "col_018";
	public static final String $col_019 = "col_019";
	public static final String $col_020 = "col_020";
	public static final String $col_021 = "col_021";
	public static final String $col_022 = "col_022";
	public static final String $col_023 = "col_023";
	public static final String $col_024 = "col_024";
	public static final String $col_025 = "col_025";
	public static final String $col_026 = "col_026";
	public static final String $col_027 = "col_027";
	public static final String $col_028 = "col_028";
	public static final String $col_029 = "col_029";
	public static final String $col_030 = "col_030";
	public static final String $col_031 = "col_031";
	public static final String $col_032 = "col_032";
	public static final String $col_033 = "col_033";
	public static final String $col_034 = "col_034";
	public static final String $col_035 = "col_035";
	public static final String $col_036 = "col_036";
	public static final String $col_037 = "col_037";
	public static final String $col_038 = "col_038";
	public static final String $col_039 = "col_039";
	public static final String $col_040 = "col_040";
	public static final String $col_041 = "col_041";
	public static final String $col_042 = "col_042";
	public static final String $col_043 = "col_043";
	public static final String $col_044 = "col_044";
	public static final String $col_045 = "col_045";
	public static final String $col_046 = "col_046";
	public static final String $col_047 = "col_047";
	public static final String $col_048 = "col_048";
	public static final String $col_049 = "col_049";
	public static final String $col_050 = "col_050";
	public static final String $col_051 = "col_051";
	public static final String $col_052 = "col_052";
	public static final String $col_053 = "col_053";
	public static final String $col_054 = "col_054";
	public static final String $col_055 = "col_055";
	public static final String $col_056 = "col_056";
	public static final String $col_057 = "col_057";
	public static final String $col_058 = "col_058";
	public static final String $col_059 = "col_059";
	public static final String $col_060 = "col_060";
	public static final String $col_061 = "col_061";
	public static final String $col_062 = "col_062";
	public static final String $col_063 = "col_063";
	public static final String $col_064 = "col_064";
	public static final String $col_065 = "col_065";
	public static final String $col_066 = "col_066";
	public static final String $col_067 = "col_067";
	public static final String $col_068 = "col_068";
	public static final String $col_069 = "col_069";
	public static final String $col_070 = "col_070";
	public static final String $col_071 = "col_071";
	public static final String $col_072 = "col_072";
	public static final String $col_073 = "col_073";
	public static final String $col_074 = "col_074";
	public static final String $col_075 = "col_075";
	public static final String $col_076 = "col_076";
	public static final String $col_077 = "col_077";
	public static final String $col_078 = "col_078";
	public static final String $col_079 = "col_079";
	public static final String $col_080 = "col_080";
	public static final String $col_081 = "col_081";
	public static final String $col_082 = "col_082";
	public static final String $col_083 = "col_083";
	public static final String $col_084 = "col_084";
	public static final String $col_085 = "col_085";
	public static final String $col_086 = "col_086";
	public static final String $col_087 = "col_087";
	public static final String $col_088 = "col_088";
	public static final String $col_089 = "col_089";
	public static final String $col_090 = "col_090";
	public static final String $col_091 = "col_091";
	public static final String $col_092 = "col_092";
	public static final String $col_093 = "col_093";
	public static final String $col_094 = "col_094";
	public static final String $col_095 = "col_095";
	public static final String $col_096 = "col_096";
	public static final String $col_097 = "col_097";
	public static final String $col_098 = "col_098";
	public static final String $col_099 = "col_099";
	public static final String $col_100 = "col_100";
	public static final String $col_101 = "col_101";
	public static final String $col_102 = "col_102";
	public static final String $col_103 = "col_103";
	public static final String $col_104 = "col_104";
	public static final String $col_105 = "col_105";
	public static final String $col_106 = "col_106";
	public static final String $col_107 = "col_107";
	public static final String $col_108 = "col_108";
	public static final String $col_109 = "col_109";
	public static final String $col_110 = "col_110";
	public static final String $col_111 = "col_111";
	public static final String $col_112 = "col_112";
	public static final String $col_113 = "col_113";
	public static final String $col_114 = "col_114";
	public static final String $col_115 = "col_115";
	public static final String $col_116 = "col_116";
	public static final String $col_117 = "col_117";
	public static final String $col_118 = "col_118";
	public static final String $col_119 = "col_119";
	public static final String $col_120 = "col_120";
	public static final String $col_121 = "col_121";
	public static final String $col_122 = "col_122";
	public static final String $col_123 = "col_123";
	public static final String $col_124 = "col_124";
	public static final String $col_125 = "col_125";
	public static final String $col_126 = "col_126";
	public static final String $col_127 = "col_127";
	public static final String $col_128 = "col_128";
	public static final String $col_129 = "col_129";
	public static final String $col_130 = "col_130";
	public static final String $col_131 = "col_131";
	public static final String $col_132 = "col_132";
	public static final String $col_133 = "col_133";
	public static final String $col_134 = "col_134";
	public static final String $col_135 = "col_135";
	public static final String $col_136 = "col_136";
	public static final String $col_137 = "col_137";
	public static final String $col_138 = "col_138";
	public static final String $col_139 = "col_139";
	public static final String $col_140 = "col_140";
	public static final String $col_141 = "col_141";
	public static final String $col_142 = "col_142";
	public static final String $col_143 = "col_143";
	public static final String $col_144 = "col_144";
	public static final String $col_145 = "col_145";
	public static final String $col_146 = "col_146";
	public static final String $col_147 = "col_147";
	public static final String $col_148 = "col_148";
	public static final String $col_149 = "col_149";
	public static final String $col_150 = "col_150";
	public static final String $col_151 = "col_151";
	public static final String $col_152 = "col_152";
	public static final String $col_153 = "col_153";
	public static final String $col_154 = "col_154";
	public static final String $col_155 = "col_155";
	public static final String $col_156 = "col_156";
	public static final String $col_157 = "col_157";
	public static final String $col_158 = "col_158";
	public static final String $col_159 = "col_159";
	public static final String $col_160 = "col_160";
	public static final String $col_161 = "col_161";
	public static final String $col_162 = "col_162";
	public static final String $col_163 = "col_163";
	public static final String $col_164 = "col_164";
	public static final String $col_165 = "col_165";
	public static final String $col_166 = "col_166";
	public static final String $col_167 = "col_167";
	public static final String $col_168 = "col_168";
	public static final String $col_169 = "col_169";
	public static final String $col_170 = "col_170";
	public static final String $col_171 = "col_171";
	public static final String $col_172 = "col_172";
	public static final String $col_173 = "col_173";
	public static final String $col_174 = "col_174";
	public static final String $col_175 = "col_175";
	public static final String $col_176 = "col_176";
	public static final String $col_177 = "col_177";
	public static final String $col_178 = "col_178";
	public static final String $col_179 = "col_179";
	public static final String $col_180 = "col_180";
	public static final String $col_181 = "col_181";
	public static final String $col_182 = "col_182";
	public static final String $col_183 = "col_183";
	public static final String $col_184 = "col_184";
	public static final String $col_185 = "col_185";
	public static final String $col_186 = "col_186";
	public static final String $col_187 = "col_187";
	public static final String $col_188 = "col_188";
	public static final String $col_189 = "col_189";
	public static final String $col_190 = "col_190";
	public static final String $col_191 = "col_191";
	public static final String $col_192 = "col_192";
	public static final String $col_193 = "col_193";
	public static final String $col_194 = "col_194";
	public static final String $col_195 = "col_195";
	public static final String $col_196 = "col_196";
	public static final String $col_197 = "col_197";
	public static final String $col_198 = "col_198";
	public static final String $col_199 = "col_199";
	public static final String $col_200 = "col_200";
	public static final String $col_201 = "col_201";
	public static final String $col_202 = "col_202";
	public static final String $col_203 = "col_203";
	public static final String $col_204 = "col_204";
	public static final String $col_205 = "col_205";
	public static final String $col_206 = "col_206";
	public static final String $col_207 = "col_207";
	public static final String $col_208 = "col_208";
	public static final String $col_209 = "col_209";
	public static final String $col_210 = "col_210";
	public static final String $col_211 = "col_211";
	public static final String $col_212 = "col_212";
	public static final String $col_213 = "col_213";
	public static final String $col_214 = "col_214";
	public static final String $col_215 = "col_215";
	public static final String $col_216 = "col_216";
	public static final String $col_217 = "col_217";
	public static final String $col_218 = "col_218";
	public static final String $col_219 = "col_219";
	public static final String $col_220 = "col_220";
	public static final String $col_221 = "col_221";
	public static final String $col_222 = "col_222";
	public static final String $col_223 = "col_223";
	public static final String $col_224 = "col_224";
	public static final String $col_225 = "col_225";
	public static final String $col_226 = "col_226";
	public static final String $col_227 = "col_227";
	public static final String $col_228 = "col_228";
	public static final String $col_229 = "col_229";
	public static final String $col_230 = "col_230";
	public static final String $col_231 = "col_231";
	public static final String $col_232 = "col_232";
	public static final String $col_233 = "col_233";
	public static final String $col_234 = "col_234";
	public static final String $col_235 = "col_235";
	public static final String $col_236 = "col_236";
	public static final String $col_237 = "col_237";
	public static final String $col_238 = "col_238";
	public static final String $col_239 = "col_239";
	public static final String $col_240 = "col_240";
	public static final String $col_241 = "col_241";
	public static final String $col_242 = "col_242";
	public static final String $col_243 = "col_243";
	public static final String $col_244 = "col_244";
	public static final String $col_245 = "col_245";
	public static final String $col_246 = "col_246";
	public static final String $col_247 = "col_247";
	public static final String $col_248 = "col_248";
	public static final String $col_249 = "col_249";
	public static final String $col_250 = "col_250";
	public static final String $col_251 = "col_251";
	public static final String $col_252 = "col_252";
	public static final String $col_253 = "col_253";
	public static final String $col_254 = "col_254";
	public static final String $col_255 = "col_255";
	public static final String $col_256 = "col_256";
	public static final String $col_257 = "col_257";
	public static final String $col_258 = "col_258";
	public static final String $col_259 = "col_259";
	public static final String $col_260 = "col_260";
	public static final String $col_261 = "col_261";
	public static final String $col_262 = "col_262";
	public static final String $col_263 = "col_263";
	public static final String $col_264 = "col_264";
	public static final String $col_265 = "col_265";
	public static final String $col_266 = "col_266";
	public static final String $col_267 = "col_267";
	public static final String $col_268 = "col_268";
	public static final String $col_269 = "col_269";
	public static final String $col_270 = "col_270";
	public static final String $col_271 = "col_271";
	public static final String $col_272 = "col_272";
	public static final String $col_273 = "col_273";
	public static final String $col_274 = "col_274";
	public static final String $col_275 = "col_275";
	public static final String $col_276 = "col_276";
	public static final String $col_277 = "col_277";
	public static final String $col_278 = "col_278";
	public static final String $col_279 = "col_279";
	public static final String $col_280 = "col_280";
	public static final String $col_281 = "col_281";
	public static final String $col_282 = "col_282";
	public static final String $col_283 = "col_283";
	public static final String $col_284 = "col_284";
	public static final String $col_285 = "col_285";
	public static final String $col_286 = "col_286";
	public static final String $col_287 = "col_287";
	public static final String $col_288 = "col_288";
	public static final String $col_289 = "col_289";
	public static final String $col_290 = "col_290";
	public static final String $col_291 = "col_291";
	public static final String $col_292 = "col_292";
	public static final String $col_293 = "col_293";
	public static final String $col_294 = "col_294";
	public static final String $col_295 = "col_295";
	public static final String $col_296 = "col_296";
	public static final String $col_297 = "col_297";
	public static final String $col_298 = "col_298";
	public static final String $col_299 = "col_299";
	public static final String $expns_grp_cd = "expns_grp_cd";

	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";
	public static final String $comp_qty = $comp_qty_p + ".qty";
	public static final String $odr_qty = $odr_qty_p + ".qty";
	public static final String $chd_itm_cd = $chd_itm_p + ".itm_cd";
	public static final String $chd_itm_sub1 = $chd_itm_p + ".itm_sub1";
	public static final String $chd_itm_sub2 = $chd_itm_p + ".itm_sub2";
	public static final String $chd_itm_sub3 = $chd_itm_p + ".itm_sub3";
	public static final String $chd_itm_nm = $chd_itm_p + ".itm_nm";
	public static final String $qty_diff = $qty_diff_p + ".qty";
	public static final String $std_qty = $std_qty_p + ".qty";
	public static final String $act_qty = $act_qty_p + ".qty";

	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta par_itm_typ_META = createCommonMeta($par_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta par_itm_typ_nm_META = createCommonMeta($par_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta par_itm_typ_d_cd_META = createCommonMeta($par_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta par_itm_typ_d_nm_META = createCommonMeta($par_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta par_itm_jnl_cd_META = createCommonMeta($par_itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta par_itm_jnl_nm_META = createCommonMeta($par_itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta par_itm_grp_cd1_META = createCommonMeta($par_itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm1_META = createCommonMeta($par_itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd2_META = createCommonMeta($par_itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm2_META = createCommonMeta($par_itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd3_META = createCommonMeta($par_itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm3_META = createCommonMeta($par_itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd4_META = createCommonMeta($par_itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm4_META = createCommonMeta($par_itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd5_META = createCommonMeta($par_itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm5_META = createCommonMeta($par_itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd6_META = createCommonMeta($par_itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm6_META = createCommonMeta($par_itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd7_META = createCommonMeta($par_itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm7_META = createCommonMeta($par_itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd8_META = createCommonMeta($par_itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm8_META = createCommonMeta($par_itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd9_META = createCommonMeta($par_itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm9_META = createCommonMeta($par_itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd10_META = createCommonMeta($par_itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm10_META = createCommonMeta($par_itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_lot_no_META = createCommonMeta($par_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta par_sublot_no_META = createCommonMeta($par_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta par_sno1_META = createCommonMeta($par_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta par_sno2_META = createCommonMeta($par_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta par_sno3_META = createCommonMeta($par_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta par_sno4_META = createCommonMeta($par_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta par_asst_typ_META = createCommonMeta($par_asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta par_asst_typ_nm_META = createCommonMeta($par_asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_grp_cd1_META = createCommonMeta($bp_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm1_META = createCommonMeta($bp_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd2_META = createCommonMeta($bp_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm2_META = createCommonMeta($bp_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd3_META = createCommonMeta($bp_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm3_META = createCommonMeta($bp_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd4_META = createCommonMeta($bp_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm4_META = createCommonMeta($bp_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd5_META = createCommonMeta($bp_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm5_META = createCommonMeta($bp_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd6_META = createCommonMeta($bp_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm6_META = createCommonMeta($bp_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd7_META = createCommonMeta($bp_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm7_META = createCommonMeta($bp_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd8_META = createCommonMeta($bp_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm8_META = createCommonMeta($bp_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd9_META = createCommonMeta($bp_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm9_META = createCommonMeta($bp_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd10_META = createCommonMeta($bp_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm10_META = createCommonMeta($bp_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta area_nm_META = createCommonMeta($area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta comp_qty_p_META = createInnerRowMeta($comp_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta odr_qty_p_META = createInnerRowMeta($odr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta par_unit_cd_META = createCommonMeta($par_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta par_unit_nm_META = createCommonMeta($par_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta par_dec_place_META = createCommonMeta($par_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta inpt_dpt_cd_META = createCommonMeta($inpt_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta inpt_dpt_nm_META = createCommonMeta($inpt_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta chd_itm_p_META = createInnerRowMeta($chd_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta chd_itm_typ_META = createCommonMeta($chd_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta chd_itm_typ_nm_META = createCommonMeta($chd_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta chd_itm_typ_d_cd_META = createCommonMeta($chd_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta chd_itm_typ_d_nm_META = createCommonMeta($chd_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta chd_itm_jnl_cd_META = createCommonMeta($chd_itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta chd_itm_jnl_nm_META = createCommonMeta($chd_itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta chd_itm_grp_cd1_META = createCommonMeta($chd_itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm1_META = createCommonMeta($chd_itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd2_META = createCommonMeta($chd_itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm2_META = createCommonMeta($chd_itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd3_META = createCommonMeta($chd_itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm3_META = createCommonMeta($chd_itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd4_META = createCommonMeta($chd_itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm4_META = createCommonMeta($chd_itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd5_META = createCommonMeta($chd_itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm5_META = createCommonMeta($chd_itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd6_META = createCommonMeta($chd_itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm6_META = createCommonMeta($chd_itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd7_META = createCommonMeta($chd_itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm7_META = createCommonMeta($chd_itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd8_META = createCommonMeta($chd_itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm8_META = createCommonMeta($chd_itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd9_META = createCommonMeta($chd_itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm9_META = createCommonMeta($chd_itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd10_META = createCommonMeta($chd_itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm10_META = createCommonMeta($chd_itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_lot_no_META = createCommonMeta($chd_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta chd_sublot_no_META = createCommonMeta($chd_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta chd_sno1_META = createCommonMeta($chd_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta chd_sno2_META = createCommonMeta($chd_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta chd_sno3_META = createCommonMeta($chd_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta chd_sno4_META = createCommonMeta($chd_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta chd_asst_typ_META = createCommonMeta($chd_asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta chd_asst_typ_nm_META = createCommonMeta($chd_asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_slip_typ_nm_META = createCommonMeta($ac_slip_typ_nm, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP_NM);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta qty_diff_p_META = createInnerRowMeta($qty_diff_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std_qty_p_META = createInnerRowMeta($std_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta act_qty_p_META = createInnerRowMeta($act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_diff_META = createCommonMeta($upri_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_upri_META = createCommonMeta($std_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_upri_META = createCommonMeta($act_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_qty_META = createCommonMeta($diff_qty, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_up_META = createCommonMeta($diff_up, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cost_diff_META = createCommonMeta($cost_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost_META = createCommonMeta($std_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost_META = createCommonMeta($act_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta var_cost_META = createCommonMeta($var_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fxd_cost_META = createCommonMeta($fxd_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_qty_META = createCommonMeta($ttl_qty, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta var_cost_qty_META = createCommonMeta($var_cost_qty, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fxd_cost_qty_META = createCommonMeta($fxd_cost_qty, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_up_META = createCommonMeta($ttl_up, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta var_cost_up_META = createCommonMeta($var_cost_up, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fxd_cost_up_META = createCommonMeta($fxd_cost_up, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_000_META = createCommonMeta($col_000, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_001_META = createCommonMeta($col_001, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_002_META = createCommonMeta($col_002, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_003_META = createCommonMeta($col_003, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_004_META = createCommonMeta($col_004, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_005_META = createCommonMeta($col_005, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_006_META = createCommonMeta($col_006, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_007_META = createCommonMeta($col_007, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_008_META = createCommonMeta($col_008, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_009_META = createCommonMeta($col_009, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_010_META = createCommonMeta($col_010, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_011_META = createCommonMeta($col_011, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_012_META = createCommonMeta($col_012, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_013_META = createCommonMeta($col_013, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_014_META = createCommonMeta($col_014, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_015_META = createCommonMeta($col_015, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_016_META = createCommonMeta($col_016, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_017_META = createCommonMeta($col_017, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_018_META = createCommonMeta($col_018, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_019_META = createCommonMeta($col_019, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_020_META = createCommonMeta($col_020, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_021_META = createCommonMeta($col_021, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_022_META = createCommonMeta($col_022, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_023_META = createCommonMeta($col_023, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_024_META = createCommonMeta($col_024, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_025_META = createCommonMeta($col_025, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_026_META = createCommonMeta($col_026, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_027_META = createCommonMeta($col_027, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_028_META = createCommonMeta($col_028, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_029_META = createCommonMeta($col_029, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_030_META = createCommonMeta($col_030, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_031_META = createCommonMeta($col_031, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_032_META = createCommonMeta($col_032, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_033_META = createCommonMeta($col_033, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_034_META = createCommonMeta($col_034, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_035_META = createCommonMeta($col_035, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_036_META = createCommonMeta($col_036, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_037_META = createCommonMeta($col_037, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_038_META = createCommonMeta($col_038, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_039_META = createCommonMeta($col_039, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_040_META = createCommonMeta($col_040, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_041_META = createCommonMeta($col_041, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_042_META = createCommonMeta($col_042, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_043_META = createCommonMeta($col_043, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_044_META = createCommonMeta($col_044, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_045_META = createCommonMeta($col_045, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_046_META = createCommonMeta($col_046, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_047_META = createCommonMeta($col_047, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_048_META = createCommonMeta($col_048, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_049_META = createCommonMeta($col_049, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_050_META = createCommonMeta($col_050, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_051_META = createCommonMeta($col_051, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_052_META = createCommonMeta($col_052, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_053_META = createCommonMeta($col_053, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_054_META = createCommonMeta($col_054, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_055_META = createCommonMeta($col_055, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_056_META = createCommonMeta($col_056, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_057_META = createCommonMeta($col_057, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_058_META = createCommonMeta($col_058, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_059_META = createCommonMeta($col_059, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_060_META = createCommonMeta($col_060, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_061_META = createCommonMeta($col_061, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_062_META = createCommonMeta($col_062, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_063_META = createCommonMeta($col_063, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_064_META = createCommonMeta($col_064, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_065_META = createCommonMeta($col_065, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_066_META = createCommonMeta($col_066, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_067_META = createCommonMeta($col_067, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_068_META = createCommonMeta($col_068, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_069_META = createCommonMeta($col_069, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_070_META = createCommonMeta($col_070, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_071_META = createCommonMeta($col_071, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_072_META = createCommonMeta($col_072, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_073_META = createCommonMeta($col_073, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_074_META = createCommonMeta($col_074, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_075_META = createCommonMeta($col_075, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_076_META = createCommonMeta($col_076, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_077_META = createCommonMeta($col_077, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_078_META = createCommonMeta($col_078, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_079_META = createCommonMeta($col_079, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_080_META = createCommonMeta($col_080, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_081_META = createCommonMeta($col_081, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_082_META = createCommonMeta($col_082, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_083_META = createCommonMeta($col_083, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_084_META = createCommonMeta($col_084, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_085_META = createCommonMeta($col_085, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_086_META = createCommonMeta($col_086, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_087_META = createCommonMeta($col_087, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_088_META = createCommonMeta($col_088, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_089_META = createCommonMeta($col_089, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_090_META = createCommonMeta($col_090, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_091_META = createCommonMeta($col_091, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_092_META = createCommonMeta($col_092, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_093_META = createCommonMeta($col_093, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_094_META = createCommonMeta($col_094, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_095_META = createCommonMeta($col_095, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_096_META = createCommonMeta($col_096, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_097_META = createCommonMeta($col_097, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_098_META = createCommonMeta($col_098, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_099_META = createCommonMeta($col_099, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_100_META = createCommonMeta($col_100, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_101_META = createCommonMeta($col_101, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_102_META = createCommonMeta($col_102, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_103_META = createCommonMeta($col_103, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_104_META = createCommonMeta($col_104, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_105_META = createCommonMeta($col_105, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_106_META = createCommonMeta($col_106, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_107_META = createCommonMeta($col_107, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_108_META = createCommonMeta($col_108, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_109_META = createCommonMeta($col_109, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_110_META = createCommonMeta($col_110, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_111_META = createCommonMeta($col_111, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_112_META = createCommonMeta($col_112, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_113_META = createCommonMeta($col_113, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_114_META = createCommonMeta($col_114, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_115_META = createCommonMeta($col_115, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_116_META = createCommonMeta($col_116, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_117_META = createCommonMeta($col_117, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_118_META = createCommonMeta($col_118, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_119_META = createCommonMeta($col_119, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_120_META = createCommonMeta($col_120, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_121_META = createCommonMeta($col_121, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_122_META = createCommonMeta($col_122, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_123_META = createCommonMeta($col_123, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_124_META = createCommonMeta($col_124, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_125_META = createCommonMeta($col_125, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_126_META = createCommonMeta($col_126, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_127_META = createCommonMeta($col_127, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_128_META = createCommonMeta($col_128, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_129_META = createCommonMeta($col_129, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_130_META = createCommonMeta($col_130, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_131_META = createCommonMeta($col_131, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_132_META = createCommonMeta($col_132, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_133_META = createCommonMeta($col_133, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_134_META = createCommonMeta($col_134, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_135_META = createCommonMeta($col_135, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_136_META = createCommonMeta($col_136, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_137_META = createCommonMeta($col_137, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_138_META = createCommonMeta($col_138, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_139_META = createCommonMeta($col_139, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_140_META = createCommonMeta($col_140, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_141_META = createCommonMeta($col_141, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_142_META = createCommonMeta($col_142, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_143_META = createCommonMeta($col_143, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_144_META = createCommonMeta($col_144, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_145_META = createCommonMeta($col_145, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_146_META = createCommonMeta($col_146, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_147_META = createCommonMeta($col_147, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_148_META = createCommonMeta($col_148, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_149_META = createCommonMeta($col_149, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_150_META = createCommonMeta($col_150, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_151_META = createCommonMeta($col_151, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_152_META = createCommonMeta($col_152, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_153_META = createCommonMeta($col_153, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_154_META = createCommonMeta($col_154, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_155_META = createCommonMeta($col_155, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_156_META = createCommonMeta($col_156, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_157_META = createCommonMeta($col_157, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_158_META = createCommonMeta($col_158, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_159_META = createCommonMeta($col_159, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_160_META = createCommonMeta($col_160, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_161_META = createCommonMeta($col_161, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_162_META = createCommonMeta($col_162, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_163_META = createCommonMeta($col_163, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_164_META = createCommonMeta($col_164, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_165_META = createCommonMeta($col_165, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_166_META = createCommonMeta($col_166, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_167_META = createCommonMeta($col_167, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_168_META = createCommonMeta($col_168, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_169_META = createCommonMeta($col_169, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_170_META = createCommonMeta($col_170, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_171_META = createCommonMeta($col_171, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_172_META = createCommonMeta($col_172, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_173_META = createCommonMeta($col_173, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_174_META = createCommonMeta($col_174, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_175_META = createCommonMeta($col_175, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_176_META = createCommonMeta($col_176, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_177_META = createCommonMeta($col_177, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_178_META = createCommonMeta($col_178, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_179_META = createCommonMeta($col_179, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_180_META = createCommonMeta($col_180, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_181_META = createCommonMeta($col_181, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_182_META = createCommonMeta($col_182, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_183_META = createCommonMeta($col_183, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_184_META = createCommonMeta($col_184, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_185_META = createCommonMeta($col_185, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_186_META = createCommonMeta($col_186, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_187_META = createCommonMeta($col_187, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_188_META = createCommonMeta($col_188, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_189_META = createCommonMeta($col_189, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_190_META = createCommonMeta($col_190, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_191_META = createCommonMeta($col_191, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_192_META = createCommonMeta($col_192, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_193_META = createCommonMeta($col_193, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_194_META = createCommonMeta($col_194, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_195_META = createCommonMeta($col_195, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_196_META = createCommonMeta($col_196, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_197_META = createCommonMeta($col_197, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_198_META = createCommonMeta($col_198, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_199_META = createCommonMeta($col_199, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_200_META = createCommonMeta($col_200, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_201_META = createCommonMeta($col_201, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_202_META = createCommonMeta($col_202, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_203_META = createCommonMeta($col_203, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_204_META = createCommonMeta($col_204, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_205_META = createCommonMeta($col_205, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_206_META = createCommonMeta($col_206, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_207_META = createCommonMeta($col_207, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_208_META = createCommonMeta($col_208, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_209_META = createCommonMeta($col_209, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_210_META = createCommonMeta($col_210, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_211_META = createCommonMeta($col_211, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_212_META = createCommonMeta($col_212, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_213_META = createCommonMeta($col_213, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_214_META = createCommonMeta($col_214, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_215_META = createCommonMeta($col_215, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_216_META = createCommonMeta($col_216, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_217_META = createCommonMeta($col_217, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_218_META = createCommonMeta($col_218, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_219_META = createCommonMeta($col_219, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_220_META = createCommonMeta($col_220, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_221_META = createCommonMeta($col_221, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_222_META = createCommonMeta($col_222, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_223_META = createCommonMeta($col_223, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_224_META = createCommonMeta($col_224, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_225_META = createCommonMeta($col_225, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_226_META = createCommonMeta($col_226, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_227_META = createCommonMeta($col_227, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_228_META = createCommonMeta($col_228, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_229_META = createCommonMeta($col_229, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_230_META = createCommonMeta($col_230, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_231_META = createCommonMeta($col_231, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_232_META = createCommonMeta($col_232, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_233_META = createCommonMeta($col_233, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_234_META = createCommonMeta($col_234, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_235_META = createCommonMeta($col_235, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_236_META = createCommonMeta($col_236, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_237_META = createCommonMeta($col_237, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_238_META = createCommonMeta($col_238, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_239_META = createCommonMeta($col_239, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_240_META = createCommonMeta($col_240, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_241_META = createCommonMeta($col_241, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_242_META = createCommonMeta($col_242, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_243_META = createCommonMeta($col_243, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_244_META = createCommonMeta($col_244, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_245_META = createCommonMeta($col_245, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_246_META = createCommonMeta($col_246, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_247_META = createCommonMeta($col_247, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_248_META = createCommonMeta($col_248, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_249_META = createCommonMeta($col_249, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_250_META = createCommonMeta($col_250, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_251_META = createCommonMeta($col_251, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_252_META = createCommonMeta($col_252, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_253_META = createCommonMeta($col_253, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_254_META = createCommonMeta($col_254, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_255_META = createCommonMeta($col_255, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_256_META = createCommonMeta($col_256, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_257_META = createCommonMeta($col_257, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_258_META = createCommonMeta($col_258, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_259_META = createCommonMeta($col_259, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_260_META = createCommonMeta($col_260, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_261_META = createCommonMeta($col_261, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_262_META = createCommonMeta($col_262, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_263_META = createCommonMeta($col_263, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_264_META = createCommonMeta($col_264, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_265_META = createCommonMeta($col_265, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_266_META = createCommonMeta($col_266, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_267_META = createCommonMeta($col_267, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_268_META = createCommonMeta($col_268, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_269_META = createCommonMeta($col_269, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_270_META = createCommonMeta($col_270, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_271_META = createCommonMeta($col_271, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_272_META = createCommonMeta($col_272, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_273_META = createCommonMeta($col_273, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_274_META = createCommonMeta($col_274, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_275_META = createCommonMeta($col_275, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_276_META = createCommonMeta($col_276, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_277_META = createCommonMeta($col_277, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_278_META = createCommonMeta($col_278, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_279_META = createCommonMeta($col_279, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_280_META = createCommonMeta($col_280, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_281_META = createCommonMeta($col_281, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_282_META = createCommonMeta($col_282, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_283_META = createCommonMeta($col_283, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_284_META = createCommonMeta($col_284, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_285_META = createCommonMeta($col_285, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_286_META = createCommonMeta($col_286, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_287_META = createCommonMeta($col_287, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_288_META = createCommonMeta($col_288, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_289_META = createCommonMeta($col_289, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_290_META = createCommonMeta($col_290, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_291_META = createCommonMeta($col_291, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_292_META = createCommonMeta($col_292, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_293_META = createCommonMeta($col_293, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_294_META = createCommonMeta($col_294, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_295_META = createCommonMeta($col_295, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_296_META = createCommonMeta($col_296, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_297_META = createCommonMeta($col_297, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_298_META = createCommonMeta($col_298, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_299_META = createCommonMeta($col_299, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta expns_grp_cd_META = createCommonMeta($expns_grp_cd, mcframe.commonMA.meta.MA_META.EXPNS_GRP_CD);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_cd_META,
			wg_nm_META,
			ym_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			par_itm_p_META,
			itm_mfg_inst_no_META,
			mfg_act_no_META,
			par_itm_typ_META,
			par_itm_typ_nm_META,
			par_itm_typ_d_cd_META,
			par_itm_typ_d_nm_META,
			par_itm_jnl_cd_META,
			par_itm_jnl_nm_META,
			par_itm_grp_cd1_META,
			par_itm_grp_nm1_META,
			par_itm_grp_cd2_META,
			par_itm_grp_nm2_META,
			par_itm_grp_cd3_META,
			par_itm_grp_nm3_META,
			par_itm_grp_cd4_META,
			par_itm_grp_nm4_META,
			par_itm_grp_cd5_META,
			par_itm_grp_nm5_META,
			par_itm_grp_cd6_META,
			par_itm_grp_nm6_META,
			par_itm_grp_cd7_META,
			par_itm_grp_nm7_META,
			par_itm_grp_cd8_META,
			par_itm_grp_nm8_META,
			par_itm_grp_cd9_META,
			par_itm_grp_nm9_META,
			par_itm_grp_cd10_META,
			par_itm_grp_nm10_META,
			par_lot_no_META,
			par_sublot_no_META,
			par_sno1_META,
			par_sno2_META,
			par_sno3_META,
			par_sno4_META,
			par_asst_typ_META,
			par_asst_typ_nm_META,
			bp_cd_META,
			bp_nm_META,
			bp_grp_cd1_META,
			bp_grp_nm1_META,
			bp_grp_cd2_META,
			bp_grp_nm2_META,
			bp_grp_cd3_META,
			bp_grp_nm3_META,
			bp_grp_cd4_META,
			bp_grp_nm4_META,
			bp_grp_cd5_META,
			bp_grp_nm5_META,
			bp_grp_cd6_META,
			bp_grp_nm6_META,
			bp_grp_cd7_META,
			bp_grp_nm7_META,
			bp_grp_cd8_META,
			bp_grp_nm8_META,
			bp_grp_cd9_META,
			bp_grp_nm9_META,
			bp_grp_cd10_META,
			bp_grp_nm10_META,
			cntry_cd_META,
			cntry_nm_META,
			area_cd_META,
			area_nm_META,
			po_no_META,
			slo_no_META,
			iv_no_META,
			comp_qty_p_META,
			odr_qty_p_META,
			par_unit_cd_META,
			par_unit_nm_META,
			par_dec_place_META,
			inpt_dpt_cd_META,
			inpt_dpt_nm_META,
			chd_itm_p_META,
			chd_itm_typ_META,
			chd_itm_typ_nm_META,
			chd_itm_typ_d_cd_META,
			chd_itm_typ_d_nm_META,
			chd_itm_jnl_cd_META,
			chd_itm_jnl_nm_META,
			chd_itm_grp_cd1_META,
			chd_itm_grp_nm1_META,
			chd_itm_grp_cd2_META,
			chd_itm_grp_nm2_META,
			chd_itm_grp_cd3_META,
			chd_itm_grp_nm3_META,
			chd_itm_grp_cd4_META,
			chd_itm_grp_nm4_META,
			chd_itm_grp_cd5_META,
			chd_itm_grp_nm5_META,
			chd_itm_grp_cd6_META,
			chd_itm_grp_nm6_META,
			chd_itm_grp_cd7_META,
			chd_itm_grp_nm7_META,
			chd_itm_grp_cd8_META,
			chd_itm_grp_nm8_META,
			chd_itm_grp_cd9_META,
			chd_itm_grp_nm9_META,
			chd_itm_grp_cd10_META,
			chd_itm_grp_nm10_META,
			chd_lot_no_META,
			chd_sublot_no_META,
			chd_sno1_META,
			chd_sno2_META,
			chd_sno3_META,
			chd_sno4_META,
			chd_asst_typ_META,
			chd_asst_typ_nm_META,
			repurc_obli_flg_META,
			site_cd_META,
			site_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			oper_act_no_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			ac_slip_typ_META,
			ac_slip_typ_nm_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			qty_diff_p_META,
			std_qty_p_META,
			act_qty_p_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			upri_diff_META,
			std_upri_META,
			act_upri_META,
			diff_qty_META,
			diff_up_META,
			cost_diff_META,
			std_cost_META,
			act_cost_META,
			ttl_META,
			var_cost_META,
			fxd_cost_META,
			ttl_qty_META,
			var_cost_qty_META,
			fxd_cost_qty_META,
			ttl_up_META,
			var_cost_up_META,
			fxd_cost_up_META,
			col_000_META,
			col_001_META,
			col_002_META,
			col_003_META,
			col_004_META,
			col_005_META,
			col_006_META,
			col_007_META,
			col_008_META,
			col_009_META,
			col_010_META,
			col_011_META,
			col_012_META,
			col_013_META,
			col_014_META,
			col_015_META,
			col_016_META,
			col_017_META,
			col_018_META,
			col_019_META,
			col_020_META,
			col_021_META,
			col_022_META,
			col_023_META,
			col_024_META,
			col_025_META,
			col_026_META,
			col_027_META,
			col_028_META,
			col_029_META,
			col_030_META,
			col_031_META,
			col_032_META,
			col_033_META,
			col_034_META,
			col_035_META,
			col_036_META,
			col_037_META,
			col_038_META,
			col_039_META,
			col_040_META,
			col_041_META,
			col_042_META,
			col_043_META,
			col_044_META,
			col_045_META,
			col_046_META,
			col_047_META,
			col_048_META,
			col_049_META,
			col_050_META,
			col_051_META,
			col_052_META,
			col_053_META,
			col_054_META,
			col_055_META,
			col_056_META,
			col_057_META,
			col_058_META,
			col_059_META,
			col_060_META,
			col_061_META,
			col_062_META,
			col_063_META,
			col_064_META,
			col_065_META,
			col_066_META,
			col_067_META,
			col_068_META,
			col_069_META,
			col_070_META,
			col_071_META,
			col_072_META,
			col_073_META,
			col_074_META,
			col_075_META,
			col_076_META,
			col_077_META,
			col_078_META,
			col_079_META,
			col_080_META,
			col_081_META,
			col_082_META,
			col_083_META,
			col_084_META,
			col_085_META,
			col_086_META,
			col_087_META,
			col_088_META,
			col_089_META,
			col_090_META,
			col_091_META,
			col_092_META,
			col_093_META,
			col_094_META,
			col_095_META,
			col_096_META,
			col_097_META,
			col_098_META,
			col_099_META,
			col_100_META,
			col_101_META,
			col_102_META,
			col_103_META,
			col_104_META,
			col_105_META,
			col_106_META,
			col_107_META,
			col_108_META,
			col_109_META,
			col_110_META,
			col_111_META,
			col_112_META,
			col_113_META,
			col_114_META,
			col_115_META,
			col_116_META,
			col_117_META,
			col_118_META,
			col_119_META,
			col_120_META,
			col_121_META,
			col_122_META,
			col_123_META,
			col_124_META,
			col_125_META,
			col_126_META,
			col_127_META,
			col_128_META,
			col_129_META,
			col_130_META,
			col_131_META,
			col_132_META,
			col_133_META,
			col_134_META,
			col_135_META,
			col_136_META,
			col_137_META,
			col_138_META,
			col_139_META,
			col_140_META,
			col_141_META,
			col_142_META,
			col_143_META,
			col_144_META,
			col_145_META,
			col_146_META,
			col_147_META,
			col_148_META,
			col_149_META,
			col_150_META,
			col_151_META,
			col_152_META,
			col_153_META,
			col_154_META,
			col_155_META,
			col_156_META,
			col_157_META,
			col_158_META,
			col_159_META,
			col_160_META,
			col_161_META,
			col_162_META,
			col_163_META,
			col_164_META,
			col_165_META,
			col_166_META,
			col_167_META,
			col_168_META,
			col_169_META,
			col_170_META,
			col_171_META,
			col_172_META,
			col_173_META,
			col_174_META,
			col_175_META,
			col_176_META,
			col_177_META,
			col_178_META,
			col_179_META,
			col_180_META,
			col_181_META,
			col_182_META,
			col_183_META,
			col_184_META,
			col_185_META,
			col_186_META,
			col_187_META,
			col_188_META,
			col_189_META,
			col_190_META,
			col_191_META,
			col_192_META,
			col_193_META,
			col_194_META,
			col_195_META,
			col_196_META,
			col_197_META,
			col_198_META,
			col_199_META,
			col_200_META,
			col_201_META,
			col_202_META,
			col_203_META,
			col_204_META,
			col_205_META,
			col_206_META,
			col_207_META,
			col_208_META,
			col_209_META,
			col_210_META,
			col_211_META,
			col_212_META,
			col_213_META,
			col_214_META,
			col_215_META,
			col_216_META,
			col_217_META,
			col_218_META,
			col_219_META,
			col_220_META,
			col_221_META,
			col_222_META,
			col_223_META,
			col_224_META,
			col_225_META,
			col_226_META,
			col_227_META,
			col_228_META,
			col_229_META,
			col_230_META,
			col_231_META,
			col_232_META,
			col_233_META,
			col_234_META,
			col_235_META,
			col_236_META,
			col_237_META,
			col_238_META,
			col_239_META,
			col_240_META,
			col_241_META,
			col_242_META,
			col_243_META,
			col_244_META,
			col_245_META,
			col_246_META,
			col_247_META,
			col_248_META,
			col_249_META,
			col_250_META,
			col_251_META,
			col_252_META,
			col_253_META,
			col_254_META,
			col_255_META,
			col_256_META,
			col_257_META,
			col_258_META,
			col_259_META,
			col_260_META,
			col_261_META,
			col_262_META,
			col_263_META,
			col_264_META,
			col_265_META,
			col_266_META,
			col_267_META,
			col_268_META,
			col_269_META,
			col_270_META,
			col_271_META,
			col_272_META,
			col_273_META,
			col_274_META,
			col_275_META,
			col_276_META,
			col_277_META,
			col_278_META,
			col_279_META,
			col_280_META,
			col_281_META,
			col_282_META,
			col_283_META,
			col_284_META,
			col_285_META,
			col_286_META,
			col_287_META,
			col_288_META,
			col_289_META,
			col_290_META,
			col_291_META,
			col_292_META,
			col_293_META,
			col_294_META,
			col_295_META,
			col_296_META,
			col_297_META,
			col_298_META,
			col_299_META,
			expns_grp_cd_META
		},
		new String[][]{
			{
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm",
				"comp_qty",
				"odr_qty",
				"chd_itm_cd",
				"chd_itm_sub1",
				"chd_itm_sub2",
				"chd_itm_sub3",
				"chd_itm_nm",
				"qty_diff",
				"std_qty",
				"act_qty"
			},
			{
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm,
				$comp_qty,
				$odr_qty,
				$chd_itm_cd,
				$chd_itm_sub1,
				$chd_itm_sub2,
				$chd_itm_sub3,
				$chd_itm_nm,
				$qty_diff,
				$std_qty,
				$act_qty
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
				{$wg_cd, "wg_flg"},	// wg_cd
				{$wg_nm, "wg_flg"},	// wg_nm
				{$ym, "ym_flg"},	// ym
				{$mng_dpt_cd, "mng_dpt_flg"},	// mng_dpt_cd
				{$mng_dpt_nm, "mng_dpt_flg"},	// mng_dpt_nm
				{$par_itm_p, "par_itm_flg"},	// par_itm_p
				{$itm_mfg_inst_no, "itm_mfg_inst_no_flg"},	// itm_mfg_inst_no
				{$mfg_act_no, "mfg_act_no_flg"},	// mfg_act_no
				{$par_itm_typ, "par_itm_typ_flg"},	// par_itm_typ
				{$par_itm_typ_nm, "par_itm_typ_flg"},	// par_itm_typ_nm
				{$par_itm_typ_d_cd, "par_itm_typ_d_flg"},	// par_itm_typ_d_cd
				{$par_itm_typ_d_nm, "par_itm_typ_d_flg"},	// par_itm_typ_d_nm
				{$par_itm_jnl_cd, "par_itm_jnl_flg"},	// par_itm_jnl_cd
				{$par_itm_jnl_nm, "par_itm_jnl_flg"},	// par_itm_jnl_nm
				{$par_itm_grp_cd1, "par_itm_grp_flg1"},	// par_itm_grp_cd1
				{$par_itm_grp_nm1, "par_itm_grp_flg1"},	// par_itm_grp_nm1
				{$par_itm_grp_cd2, "par_itm_grp_flg2"},	// par_itm_grp_cd2
				{$par_itm_grp_nm2, "par_itm_grp_flg2"},	// par_itm_grp_nm2
				{$par_itm_grp_cd3, "par_itm_grp_flg3"},	// par_itm_grp_cd3
				{$par_itm_grp_nm3, "par_itm_grp_flg3"},	// par_itm_grp_nm3
				{$par_itm_grp_cd4, "par_itm_grp_flg4"},	// par_itm_grp_cd4
				{$par_itm_grp_nm4, "par_itm_grp_flg4"},	// par_itm_grp_nm4
				{$par_itm_grp_cd5, "par_itm_grp_flg5"},	// par_itm_grp_cd5
				{$par_itm_grp_nm5, "par_itm_grp_flg5"},	// par_itm_grp_nm5
				{$par_itm_grp_cd6, "par_itm_grp_flg6"},	// par_itm_grp_cd6
				{$par_itm_grp_nm6, "par_itm_grp_flg6"},	// par_itm_grp_nm6
				{$par_itm_grp_cd7, "par_itm_grp_flg7"},	// par_itm_grp_cd7
				{$par_itm_grp_nm7, "par_itm_grp_flg7"},	// par_itm_grp_nm7
				{$par_itm_grp_cd8, "par_itm_grp_flg8"},	// par_itm_grp_cd8
				{$par_itm_grp_nm8, "par_itm_grp_flg8"},	// par_itm_grp_nm8
				{$par_itm_grp_cd9, "par_itm_grp_flg9"},	// par_itm_grp_cd9
				{$par_itm_grp_nm9, "par_itm_grp_flg9"},	// par_itm_grp_nm9
				{$par_itm_grp_cd10, "par_itm_grp_flg10"},	// par_itm_grp_cd10
				{$par_itm_grp_nm10, "par_itm_grp_flg10"},	// par_itm_grp_nm10
				{$par_lot_no, "par_lot_flg"},	// par_lot_no
				{$par_sublot_no, "par_sublot_flg"},	// par_sublot_no
				{$par_sno1, "par_sno1_flg"},	// par_sno1
				{$par_sno2, "par_sno2_flg"},	// par_sno2
				{$par_sno3, "par_sno3_flg"},	// par_sno3
				{$par_sno4, "par_sno4_flg"},	// par_sno4
				{$par_asst_typ, "par_asst_typ_flg"},	// par_asst_typ
				{$par_asst_typ_nm, "par_asst_typ_flg"},	// par_asst_typ_nm
				{$bp_cd, "bp_flg"},	// bp_cd
				{$bp_nm, "bp_flg"},	// bp_nm
				{$bp_grp_cd1, "bp_grp_flg1"},	// bp_grp_cd1
				{$bp_grp_nm1, "bp_grp_flg1"},	// bp_grp_nm1
				{$bp_grp_cd2, "bp_grp_flg2"},	// bp_grp_cd2
				{$bp_grp_nm2, "bp_grp_flg2"},	// bp_grp_nm2
				{$bp_grp_cd3, "bp_grp_flg3"},	// bp_grp_cd3
				{$bp_grp_nm3, "bp_grp_flg3"},	// bp_grp_nm3
				{$bp_grp_cd4, "bp_grp_flg4"},	// bp_grp_cd4
				{$bp_grp_nm4, "bp_grp_flg4"},	// bp_grp_nm4
				{$bp_grp_cd5, "bp_grp_flg5"},	// bp_grp_cd5
				{$bp_grp_nm5, "bp_grp_flg5"},	// bp_grp_nm5
				{$bp_grp_cd6, "bp_grp_flg6"},	// bp_grp_cd6
				{$bp_grp_nm6, "bp_grp_flg6"},	// bp_grp_nm6
				{$bp_grp_cd7, "bp_grp_flg7"},	// bp_grp_cd7
				{$bp_grp_nm7, "bp_grp_flg7"},	// bp_grp_nm7
				{$bp_grp_cd8, "bp_grp_flg8"},	// bp_grp_cd8
				{$bp_grp_nm8, "bp_grp_flg8"},	// bp_grp_nm8
				{$bp_grp_cd9, "bp_grp_flg9"},	// bp_grp_cd9
				{$bp_grp_nm9, "bp_grp_flg9"},	// bp_grp_nm9
				{$bp_grp_cd10, "bp_grp_flg10"},	// bp_grp_cd10
				{$bp_grp_nm10, "bp_grp_flg10"},	// bp_grp_nm10
				{$cntry_cd, "cntry_flg"},	// cntry_cd
				{$cntry_nm, "cntry_flg"},	// cntry_nm
				{$area_cd, "area_flg"},	// area_cd
				{$area_nm, "area_flg"},	// area_nm
				{$po_no, "po_no_flg"},	// po_no
				{$slo_no, "slo_no_flg"},	// slo_no
				{$iv_no, "iv_no_flg"},	// iv_no
				{$comp_qty_p, "comp_qty_flg"},	// comp_qty_p
				{$odr_qty_p, "odr_qty_flg"},	// odr_qty_p
				{$par_unit_cd, "comp_qty_flg"},	// par_unit_cd
				{$par_unit_nm, "comp_qty_flg"},	// par_unit_nm
				{$inpt_dpt_cd, "inpt_dpt_flg"},	// inpt_dpt_cd
				{$inpt_dpt_nm, "inpt_dpt_flg"},	// inpt_dpt_nm
				{$chd_itm_p, "chd_itm_flg"},	// chd_itm_p
				{$chd_itm_typ, "chd_itm_typ_flg"},	// chd_itm_typ
				{$chd_itm_typ_nm, "chd_itm_typ_flg"},	// chd_itm_typ_nm
				{$chd_itm_typ_d_cd, "chd_itm_typ_d_flg"},	// chd_itm_typ_d_cd
				{$chd_itm_typ_d_nm, "chd_itm_typ_d_flg"},	// chd_itm_typ_d_nm
				{$chd_itm_jnl_cd, "chd_itm_jnl_flg"},	// chd_itm_jnl_cd
				{$chd_itm_jnl_nm, "chd_itm_jnl_flg"},	// chd_itm_jnl_nm
				{$chd_itm_grp_cd1, "chd_itm_grp_flg1"},	// chd_itm_grp_cd1
				{$chd_itm_grp_nm1, "chd_itm_grp_flg1"},	// chd_itm_grp_nm1
				{$chd_itm_grp_cd2, "chd_itm_grp_flg2"},	// chd_itm_grp_cd2
				{$chd_itm_grp_nm2, "chd_itm_grp_flg2"},	// chd_itm_grp_nm2
				{$chd_itm_grp_cd3, "chd_itm_grp_flg3"},	// chd_itm_grp_cd3
				{$chd_itm_grp_nm3, "chd_itm_grp_flg3"},	// chd_itm_grp_nm3
				{$chd_itm_grp_cd4, "chd_itm_grp_flg4"},	// chd_itm_grp_cd4
				{$chd_itm_grp_nm4, "chd_itm_grp_flg4"},	// chd_itm_grp_nm4
				{$chd_itm_grp_cd5, "chd_itm_grp_flg5"},	// chd_itm_grp_cd5
				{$chd_itm_grp_nm5, "chd_itm_grp_flg5"},	// chd_itm_grp_nm5
				{$chd_itm_grp_cd6, "chd_itm_grp_flg6"},	// chd_itm_grp_cd6
				{$chd_itm_grp_nm6, "chd_itm_grp_flg6"},	// chd_itm_grp_nm6
				{$chd_itm_grp_cd7, "chd_itm_grp_flg7"},	// chd_itm_grp_cd7
				{$chd_itm_grp_nm7, "chd_itm_grp_flg7"},	// chd_itm_grp_nm7
				{$chd_itm_grp_cd8, "chd_itm_grp_flg8"},	// chd_itm_grp_cd8
				{$chd_itm_grp_nm8, "chd_itm_grp_flg8"},	// chd_itm_grp_nm8
				{$chd_itm_grp_cd9, "chd_itm_grp_flg9"},	// chd_itm_grp_cd9
				{$chd_itm_grp_nm9, "chd_itm_grp_flg9"},	// chd_itm_grp_nm9
				{$chd_itm_grp_cd10, "chd_itm_grp_flg10"},	// chd_itm_grp_cd10
				{$chd_itm_grp_nm10, "chd_itm_grp_flg10"},	// chd_itm_grp_nm10
				{$chd_lot_no, "chd_lot_flg"},	// chd_lot_no
				{$chd_sublot_no, "chd_sublot_flg"},	// chd_sublot_no
				{$chd_sno1, "chd_sno1_flg"},	// chd_sno1
				{$chd_sno2, "chd_sno2_flg"},	// chd_sno2
				{$chd_sno3, "chd_sno3_flg"},	// chd_sno3
				{$chd_sno4, "chd_sno4_flg"},	// chd_sno4
				{$chd_asst_typ, "chd_asst_typ_flg"},	// chd_asst_typ
				{$chd_asst_typ_nm, "chd_asst_typ_flg"},	// chd_asst_typ_nm
				{$repurc_obli_flg, "chd_asst_typ_flg"},	// repurc_obli_flg
				{$site_cd, "site_flg"},	// site_cd
				{$site_nm, "site_flg"},	// site_nm
				{$loc_cd, "loc_flg"},	// loc_cd
				{$loc_nm, "loc_flg"},	// loc_nm
				{$str_ln_cd, "str_ln_flg"},	// str_ln_cd
				{$str_ln_nm, "str_ln_flg"},	// str_ln_nm
				{$oper_act_no, "oper_act_no_flg"},	// oper_act_no
				{$oper_cd, "oper_flg"},	// oper_cd
				{$oper_nm, "oper_flg"},	// oper_nm
				{$oper_seq, "disp_oper_seq_flg"},	// oper_seq
				{$ac_slip_typ, "ac_slip_typ_flg"},	// ac_slip_typ
				{$ac_slip_typ_nm, "ac_slip_typ_flg"},	// ac_slip_typ_nm
				{$ac_rsn_cd, "ac_rsn_flg"},	// ac_rsn_cd
				{$ac_rsn_nm, "ac_rsn_flg"},	// ac_rsn_nm
				{$upri_diff, "chd_itm_flg"},	// upri_diff
				{$std_upri, "chd_itm_flg"},	// std_upri
				{$act_upri, "chd_itm_flg"},	// act_upri
				{$col_000, "ELM"},	// col_000
				{$col_001, "ELM"},	// col_001
				{$col_002, "ELM"},	// col_002
				{$col_003, "ELM"},	// col_003
				{$col_004, "ELM"},	// col_004
				{$col_005, "ELM"},	// col_005
				{$col_006, "ELM"},	// col_006
				{$col_007, "ELM"},	// col_007
				{$col_008, "ELM"},	// col_008
				{$col_009, "ELM"},	// col_009
				{$col_010, "ELM"},	// col_010
				{$col_011, "ELM"},	// col_011
				{$col_012, "ELM"},	// col_012
				{$col_013, "ELM"},	// col_013
				{$col_014, "ELM"},	// col_014
				{$col_015, "ELM"},	// col_015
				{$col_016, "ELM"},	// col_016
				{$col_017, "ELM"},	// col_017
				{$col_018, "ELM"},	// col_018
				{$col_019, "ELM"},	// col_019
				{$col_020, "ELM"},	// col_020
				{$col_021, "ELM"},	// col_021
				{$col_022, "ELM"},	// col_022
				{$col_023, "ELM"},	// col_023
				{$col_024, "ELM"},	// col_024
				{$col_025, "ELM"},	// col_025
				{$col_026, "ELM"},	// col_026
				{$col_027, "ELM"},	// col_027
				{$col_028, "ELM"},	// col_028
				{$col_029, "ELM"},	// col_029
				{$col_030, "ELM"},	// col_030
				{$col_031, "ELM"},	// col_031
				{$col_032, "ELM"},	// col_032
				{$col_033, "ELM"},	// col_033
				{$col_034, "ELM"},	// col_034
				{$col_035, "ELM"},	// col_035
				{$col_036, "ELM"},	// col_036
				{$col_037, "ELM"},	// col_037
				{$col_038, "ELM"},	// col_038
				{$col_039, "ELM"},	// col_039
				{$col_040, "ELM"},	// col_040
				{$col_041, "ELM"},	// col_041
				{$col_042, "ELM"},	// col_042
				{$col_043, "ELM"},	// col_043
				{$col_044, "ELM"},	// col_044
				{$col_045, "ELM"},	// col_045
				{$col_046, "ELM"},	// col_046
				{$col_047, "ELM"},	// col_047
				{$col_048, "ELM"},	// col_048
				{$col_049, "ELM"},	// col_049
				{$col_050, "ELM"},	// col_050
				{$col_051, "ELM"},	// col_051
				{$col_052, "ELM"},	// col_052
				{$col_053, "ELM"},	// col_053
				{$col_054, "ELM"},	// col_054
				{$col_055, "ELM"},	// col_055
				{$col_056, "ELM"},	// col_056
				{$col_057, "ELM"},	// col_057
				{$col_058, "ELM"},	// col_058
				{$col_059, "ELM"},	// col_059
				{$col_060, "ELM"},	// col_060
				{$col_061, "ELM"},	// col_061
				{$col_062, "ELM"},	// col_062
				{$col_063, "ELM"},	// col_063
				{$col_064, "ELM"},	// col_064
				{$col_065, "ELM"},	// col_065
				{$col_066, "ELM"},	// col_066
				{$col_067, "ELM"},	// col_067
				{$col_068, "ELM"},	// col_068
				{$col_069, "ELM"},	// col_069
				{$col_070, "ELM"},	// col_070
				{$col_071, "ELM"},	// col_071
				{$col_072, "ELM"},	// col_072
				{$col_073, "ELM"},	// col_073
				{$col_074, "ELM"},	// col_074
				{$col_075, "ELM"},	// col_075
				{$col_076, "ELM"},	// col_076
				{$col_077, "ELM"},	// col_077
				{$col_078, "ELM"},	// col_078
				{$col_079, "ELM"},	// col_079
				{$col_080, "ELM"},	// col_080
				{$col_081, "ELM"},	// col_081
				{$col_082, "ELM"},	// col_082
				{$col_083, "ELM"},	// col_083
				{$col_084, "ELM"},	// col_084
				{$col_085, "ELM"},	// col_085
				{$col_086, "ELM"},	// col_086
				{$col_087, "ELM"},	// col_087
				{$col_088, "ELM"},	// col_088
				{$col_089, "ELM"},	// col_089
				{$col_090, "ELM"},	// col_090
				{$col_091, "ELM"},	// col_091
				{$col_092, "ELM"},	// col_092
				{$col_093, "ELM"},	// col_093
				{$col_094, "ELM"},	// col_094
				{$col_095, "ELM"},	// col_095
				{$col_096, "ELM"},	// col_096
				{$col_097, "ELM"},	// col_097
				{$col_098, "ELM"},	// col_098
				{$col_099, "ELM"},	// col_099
				{$col_100, "ELM"},	// col_100
				{$col_101, "ELM"},	// col_101
				{$col_102, "ELM"},	// col_102
				{$col_103, "ELM"},	// col_103
				{$col_104, "ELM"},	// col_104
				{$col_105, "ELM"},	// col_105
				{$col_106, "ELM"},	// col_106
				{$col_107, "ELM"},	// col_107
				{$col_108, "ELM"},	// col_108
				{$col_109, "ELM"},	// col_109
				{$col_110, "ELM"},	// col_110
				{$col_111, "ELM"},	// col_111
				{$col_112, "ELM"},	// col_112
				{$col_113, "ELM"},	// col_113
				{$col_114, "ELM"},	// col_114
				{$col_115, "ELM"},	// col_115
				{$col_116, "ELM"},	// col_116
				{$col_117, "ELM"},	// col_117
				{$col_118, "ELM"},	// col_118
				{$col_119, "ELM"},	// col_119
				{$col_120, "ELM"},	// col_120
				{$col_121, "ELM"},	// col_121
				{$col_122, "ELM"},	// col_122
				{$col_123, "ELM"},	// col_123
				{$col_124, "ELM"},	// col_124
				{$col_125, "ELM"},	// col_125
				{$col_126, "ELM"},	// col_126
				{$col_127, "ELM"},	// col_127
				{$col_128, "ELM"},	// col_128
				{$col_129, "ELM"},	// col_129
				{$col_130, "ELM"},	// col_130
				{$col_131, "ELM"},	// col_131
				{$col_132, "ELM"},	// col_132
				{$col_133, "ELM"},	// col_133
				{$col_134, "ELM"},	// col_134
				{$col_135, "ELM"},	// col_135
				{$col_136, "ELM"},	// col_136
				{$col_137, "ELM"},	// col_137
				{$col_138, "ELM"},	// col_138
				{$col_139, "ELM"},	// col_139
				{$col_140, "ELM"},	// col_140
				{$col_141, "ELM"},	// col_141
				{$col_142, "ELM"},	// col_142
				{$col_143, "ELM"},	// col_143
				{$col_144, "ELM"},	// col_144
				{$col_145, "ELM"},	// col_145
				{$col_146, "ELM"},	// col_146
				{$col_147, "ELM"},	// col_147
				{$col_148, "ELM"},	// col_148
				{$col_149, "ELM"},	// col_149
				{$col_150, "ELM"},	// col_150
				{$col_151, "ELM"},	// col_151
				{$col_152, "ELM"},	// col_152
				{$col_153, "ELM"},	// col_153
				{$col_154, "ELM"},	// col_154
				{$col_155, "ELM"},	// col_155
				{$col_156, "ELM"},	// col_156
				{$col_157, "ELM"},	// col_157
				{$col_158, "ELM"},	// col_158
				{$col_159, "ELM"},	// col_159
				{$col_160, "ELM"},	// col_160
				{$col_161, "ELM"},	// col_161
				{$col_162, "ELM"},	// col_162
				{$col_163, "ELM"},	// col_163
				{$col_164, "ELM"},	// col_164
				{$col_165, "ELM"},	// col_165
				{$col_166, "ELM"},	// col_166
				{$col_167, "ELM"},	// col_167
				{$col_168, "ELM"},	// col_168
				{$col_169, "ELM"},	// col_169
				{$col_170, "ELM"},	// col_170
				{$col_171, "ELM"},	// col_171
				{$col_172, "ELM"},	// col_172
				{$col_173, "ELM"},	// col_173
				{$col_174, "ELM"},	// col_174
				{$col_175, "ELM"},	// col_175
				{$col_176, "ELM"},	// col_176
				{$col_177, "ELM"},	// col_177
				{$col_178, "ELM"},	// col_178
				{$col_179, "ELM"},	// col_179
				{$col_180, "ELM"},	// col_180
				{$col_181, "ELM"},	// col_181
				{$col_182, "ELM"},	// col_182
				{$col_183, "ELM"},	// col_183
				{$col_184, "ELM"},	// col_184
				{$col_185, "ELM"},	// col_185
				{$col_186, "ELM"},	// col_186
				{$col_187, "ELM"},	// col_187
				{$col_188, "ELM"},	// col_188
				{$col_189, "ELM"},	// col_189
				{$col_190, "ELM"},	// col_190
				{$col_191, "ELM"},	// col_191
				{$col_192, "ELM"},	// col_192
				{$col_193, "ELM"},	// col_193
				{$col_194, "ELM"},	// col_194
				{$col_195, "ELM"},	// col_195
				{$col_196, "ELM"},	// col_196
				{$col_197, "ELM"},	// col_197
				{$col_198, "ELM"},	// col_198
				{$col_199, "ELM"},	// col_199
				{$col_200, "ELM"},	// col_200
				{$col_201, "ELM"},	// col_201
				{$col_202, "ELM"},	// col_202
				{$col_203, "ELM"},	// col_203
				{$col_204, "ELM"},	// col_204
				{$col_205, "ELM"},	// col_205
				{$col_206, "ELM"},	// col_206
				{$col_207, "ELM"},	// col_207
				{$col_208, "ELM"},	// col_208
				{$col_209, "ELM"},	// col_209
				{$col_210, "ELM"},	// col_210
				{$col_211, "ELM"},	// col_211
				{$col_212, "ELM"},	// col_212
				{$col_213, "ELM"},	// col_213
				{$col_214, "ELM"},	// col_214
				{$col_215, "ELM"},	// col_215
				{$col_216, "ELM"},	// col_216
				{$col_217, "ELM"},	// col_217
				{$col_218, "ELM"},	// col_218
				{$col_219, "ELM"},	// col_219
				{$col_220, "ELM"},	// col_220
				{$col_221, "ELM"},	// col_221
				{$col_222, "ELM"},	// col_222
				{$col_223, "ELM"},	// col_223
				{$col_224, "ELM"},	// col_224
				{$col_225, "ELM"},	// col_225
				{$col_226, "ELM"},	// col_226
				{$col_227, "ELM"},	// col_227
				{$col_228, "ELM"},	// col_228
				{$col_229, "ELM"},	// col_229
				{$col_230, "ELM"},	// col_230
				{$col_231, "ELM"},	// col_231
				{$col_232, "ELM"},	// col_232
				{$col_233, "ELM"},	// col_233
				{$col_234, "ELM"},	// col_234
				{$col_235, "ELM"},	// col_235
				{$col_236, "ELM"},	// col_236
				{$col_237, "ELM"},	// col_237
				{$col_238, "ELM"},	// col_238
				{$col_239, "ELM"},	// col_239
				{$col_240, "ELM"},	// col_240
				{$col_241, "ELM"},	// col_241
				{$col_242, "ELM"},	// col_242
				{$col_243, "ELM"},	// col_243
				{$col_244, "ELM"},	// col_244
				{$col_245, "ELM"},	// col_245
				{$col_246, "ELM"},	// col_246
				{$col_247, "ELM"},	// col_247
				{$col_248, "ELM"},	// col_248
				{$col_249, "ELM"},	// col_249
				{$col_250, "ELM"},	// col_250
				{$col_251, "ELM"},	// col_251
				{$col_252, "ELM"},	// col_252
				{$col_253, "ELM"},	// col_253
				{$col_254, "ELM"},	// col_254
				{$col_255, "ELM"},	// col_255
				{$col_256, "ELM"},	// col_256
				{$col_257, "ELM"},	// col_257
				{$col_258, "ELM"},	// col_258
				{$col_259, "ELM"},	// col_259
				{$col_260, "ELM"},	// col_260
				{$col_261, "ELM"},	// col_261
				{$col_262, "ELM"},	// col_262
				{$col_263, "ELM"},	// col_263
				{$col_264, "ELM"},	// col_264
				{$col_265, "ELM"},	// col_265
				{$col_266, "ELM"},	// col_266
				{$col_267, "ELM"},	// col_267
				{$col_268, "ELM"},	// col_268
				{$col_269, "ELM"},	// col_269
				{$col_270, "ELM"},	// col_270
				{$col_271, "ELM"},	// col_271
				{$col_272, "ELM"},	// col_272
				{$col_273, "ELM"},	// col_273
				{$col_274, "ELM"},	// col_274
				{$col_275, "ELM"},	// col_275
				{$col_276, "ELM"},	// col_276
				{$col_277, "ELM"},	// col_277
				{$col_278, "ELM"},	// col_278
				{$col_279, "ELM"},	// col_279
				{$col_280, "ELM"},	// col_280
				{$col_281, "ELM"},	// col_281
				{$col_282, "ELM"},	// col_282
				{$col_283, "ELM"},	// col_283
				{$col_284, "ELM"},	// col_284
				{$col_285, "ELM"},	// col_285
				{$col_286, "ELM"},	// col_286
				{$col_287, "ELM"},	// col_287
				{$col_288, "ELM"},	// col_288
				{$col_289, "ELM"},	// col_289
				{$col_290, "ELM"},	// col_290
				{$col_291, "ELM"},	// col_291
				{$col_292, "ELM"},	// col_292
				{$col_293, "ELM"},	// col_293
				{$col_294, "ELM"},	// col_294
				{$col_295, "ELM"},	// col_295
				{$col_296, "ELM"},	// col_296
				{$col_297, "ELM"},	// col_297
				{$col_298, "ELM"},	// col_298
				{$col_299, "ELM"},	// col_299
				{$expns_grp_cd, "SUM"}	// expns_grp_cd
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
				{$upri_diff, "UNIT"},	// upri_diff
				{$std_upri, "UNIT"},	// std_upri
				{$act_upri, "UNIT"},	// act_upri
				{$diff_qty, "AMT"},	// diff_qty
				{$diff_up, "AMT"},	// diff_up
				{$cost_diff, "AMT"},	// cost_diff
				{$std_cost, "AMT"},	// std_cost
				{$act_cost, "AMT"},	// act_cost
				{$ttl, "AMT"},	// ttl
				{$var_cost, "AMT"},	// var_cost
				{$fxd_cost, "AMT"},	// fxd_cost
				{$ttl_qty, "AMT"},	// ttl_qty
				{$var_cost_qty, "AMT"},	// var_cost_qty
				{$fxd_cost_qty, "AMT"},	// fxd_cost_qty
				{$ttl_up, "AMT"},	// ttl_up
				{$var_cost_up, "AMT"},	// var_cost_up
				{$fxd_cost_up, "AMT"},	// fxd_cost_up
				{$col_000, "AMT"},	// col_000
				{$col_001, "AMT"},	// col_001
				{$col_002, "AMT"},	// col_002
				{$col_003, "AMT"},	// col_003
				{$col_004, "AMT"},	// col_004
				{$col_005, "AMT"},	// col_005
				{$col_006, "AMT"},	// col_006
				{$col_007, "AMT"},	// col_007
				{$col_008, "AMT"},	// col_008
				{$col_009, "AMT"},	// col_009
				{$col_010, "AMT"},	// col_010
				{$col_011, "AMT"},	// col_011
				{$col_012, "AMT"},	// col_012
				{$col_013, "AMT"},	// col_013
				{$col_014, "AMT"},	// col_014
				{$col_015, "AMT"},	// col_015
				{$col_016, "AMT"},	// col_016
				{$col_017, "AMT"},	// col_017
				{$col_018, "AMT"},	// col_018
				{$col_019, "AMT"},	// col_019
				{$col_020, "AMT"},	// col_020
				{$col_021, "AMT"},	// col_021
				{$col_022, "AMT"},	// col_022
				{$col_023, "AMT"},	// col_023
				{$col_024, "AMT"},	// col_024
				{$col_025, "AMT"},	// col_025
				{$col_026, "AMT"},	// col_026
				{$col_027, "AMT"},	// col_027
				{$col_028, "AMT"},	// col_028
				{$col_029, "AMT"},	// col_029
				{$col_030, "AMT"},	// col_030
				{$col_031, "AMT"},	// col_031
				{$col_032, "AMT"},	// col_032
				{$col_033, "AMT"},	// col_033
				{$col_034, "AMT"},	// col_034
				{$col_035, "AMT"},	// col_035
				{$col_036, "AMT"},	// col_036
				{$col_037, "AMT"},	// col_037
				{$col_038, "AMT"},	// col_038
				{$col_039, "AMT"},	// col_039
				{$col_040, "AMT"},	// col_040
				{$col_041, "AMT"},	// col_041
				{$col_042, "AMT"},	// col_042
				{$col_043, "AMT"},	// col_043
				{$col_044, "AMT"},	// col_044
				{$col_045, "AMT"},	// col_045
				{$col_046, "AMT"},	// col_046
				{$col_047, "AMT"},	// col_047
				{$col_048, "AMT"},	// col_048
				{$col_049, "AMT"},	// col_049
				{$col_050, "AMT"},	// col_050
				{$col_051, "AMT"},	// col_051
				{$col_052, "AMT"},	// col_052
				{$col_053, "AMT"},	// col_053
				{$col_054, "AMT"},	// col_054
				{$col_055, "AMT"},	// col_055
				{$col_056, "AMT"},	// col_056
				{$col_057, "AMT"},	// col_057
				{$col_058, "AMT"},	// col_058
				{$col_059, "AMT"},	// col_059
				{$col_060, "AMT"},	// col_060
				{$col_061, "AMT"},	// col_061
				{$col_062, "AMT"},	// col_062
				{$col_063, "AMT"},	// col_063
				{$col_064, "AMT"},	// col_064
				{$col_065, "AMT"},	// col_065
				{$col_066, "AMT"},	// col_066
				{$col_067, "AMT"},	// col_067
				{$col_068, "AMT"},	// col_068
				{$col_069, "AMT"},	// col_069
				{$col_070, "AMT"},	// col_070
				{$col_071, "AMT"},	// col_071
				{$col_072, "AMT"},	// col_072
				{$col_073, "AMT"},	// col_073
				{$col_074, "AMT"},	// col_074
				{$col_075, "AMT"},	// col_075
				{$col_076, "AMT"},	// col_076
				{$col_077, "AMT"},	// col_077
				{$col_078, "AMT"},	// col_078
				{$col_079, "AMT"},	// col_079
				{$col_080, "AMT"},	// col_080
				{$col_081, "AMT"},	// col_081
				{$col_082, "AMT"},	// col_082
				{$col_083, "AMT"},	// col_083
				{$col_084, "AMT"},	// col_084
				{$col_085, "AMT"},	// col_085
				{$col_086, "AMT"},	// col_086
				{$col_087, "AMT"},	// col_087
				{$col_088, "AMT"},	// col_088
				{$col_089, "AMT"},	// col_089
				{$col_090, "AMT"},	// col_090
				{$col_091, "AMT"},	// col_091
				{$col_092, "AMT"},	// col_092
				{$col_093, "AMT"},	// col_093
				{$col_094, "AMT"},	// col_094
				{$col_095, "AMT"},	// col_095
				{$col_096, "AMT"},	// col_096
				{$col_097, "AMT"},	// col_097
				{$col_098, "AMT"},	// col_098
				{$col_099, "AMT"},	// col_099
				{$col_100, "AMT"},	// col_100
				{$col_101, "AMT"},	// col_101
				{$col_102, "AMT"},	// col_102
				{$col_103, "AMT"},	// col_103
				{$col_104, "AMT"},	// col_104
				{$col_105, "AMT"},	// col_105
				{$col_106, "AMT"},	// col_106
				{$col_107, "AMT"},	// col_107
				{$col_108, "AMT"},	// col_108
				{$col_109, "AMT"},	// col_109
				{$col_110, "AMT"},	// col_110
				{$col_111, "AMT"},	// col_111
				{$col_112, "AMT"},	// col_112
				{$col_113, "AMT"},	// col_113
				{$col_114, "AMT"},	// col_114
				{$col_115, "AMT"},	// col_115
				{$col_116, "AMT"},	// col_116
				{$col_117, "AMT"},	// col_117
				{$col_118, "AMT"},	// col_118
				{$col_119, "AMT"},	// col_119
				{$col_120, "AMT"},	// col_120
				{$col_121, "AMT"},	// col_121
				{$col_122, "AMT"},	// col_122
				{$col_123, "AMT"},	// col_123
				{$col_124, "AMT"},	// col_124
				{$col_125, "AMT"},	// col_125
				{$col_126, "AMT"},	// col_126
				{$col_127, "AMT"},	// col_127
				{$col_128, "AMT"},	// col_128
				{$col_129, "AMT"},	// col_129
				{$col_130, "AMT"},	// col_130
				{$col_131, "AMT"},	// col_131
				{$col_132, "AMT"},	// col_132
				{$col_133, "AMT"},	// col_133
				{$col_134, "AMT"},	// col_134
				{$col_135, "AMT"},	// col_135
				{$col_136, "AMT"},	// col_136
				{$col_137, "AMT"},	// col_137
				{$col_138, "AMT"},	// col_138
				{$col_139, "AMT"},	// col_139
				{$col_140, "AMT"},	// col_140
				{$col_141, "AMT"},	// col_141
				{$col_142, "AMT"},	// col_142
				{$col_143, "AMT"},	// col_143
				{$col_144, "AMT"},	// col_144
				{$col_145, "AMT"},	// col_145
				{$col_146, "AMT"},	// col_146
				{$col_147, "AMT"},	// col_147
				{$col_148, "AMT"},	// col_148
				{$col_149, "AMT"},	// col_149
				{$col_150, "AMT"},	// col_150
				{$col_151, "AMT"},	// col_151
				{$col_152, "AMT"},	// col_152
				{$col_153, "AMT"},	// col_153
				{$col_154, "AMT"},	// col_154
				{$col_155, "AMT"},	// col_155
				{$col_156, "AMT"},	// col_156
				{$col_157, "AMT"},	// col_157
				{$col_158, "AMT"},	// col_158
				{$col_159, "AMT"},	// col_159
				{$col_160, "AMT"},	// col_160
				{$col_161, "AMT"},	// col_161
				{$col_162, "AMT"},	// col_162
				{$col_163, "AMT"},	// col_163
				{$col_164, "AMT"},	// col_164
				{$col_165, "AMT"},	// col_165
				{$col_166, "AMT"},	// col_166
				{$col_167, "AMT"},	// col_167
				{$col_168, "AMT"},	// col_168
				{$col_169, "AMT"},	// col_169
				{$col_170, "AMT"},	// col_170
				{$col_171, "AMT"},	// col_171
				{$col_172, "AMT"},	// col_172
				{$col_173, "AMT"},	// col_173
				{$col_174, "AMT"},	// col_174
				{$col_175, "AMT"},	// col_175
				{$col_176, "AMT"},	// col_176
				{$col_177, "AMT"},	// col_177
				{$col_178, "AMT"},	// col_178
				{$col_179, "AMT"},	// col_179
				{$col_180, "AMT"},	// col_180
				{$col_181, "AMT"},	// col_181
				{$col_182, "AMT"},	// col_182
				{$col_183, "AMT"},	// col_183
				{$col_184, "AMT"},	// col_184
				{$col_185, "AMT"},	// col_185
				{$col_186, "AMT"},	// col_186
				{$col_187, "AMT"},	// col_187
				{$col_188, "AMT"},	// col_188
				{$col_189, "AMT"},	// col_189
				{$col_190, "AMT"},	// col_190
				{$col_191, "AMT"},	// col_191
				{$col_192, "AMT"},	// col_192
				{$col_193, "AMT"},	// col_193
				{$col_194, "AMT"},	// col_194
				{$col_195, "AMT"},	// col_195
				{$col_196, "AMT"},	// col_196
				{$col_197, "AMT"},	// col_197
				{$col_198, "AMT"},	// col_198
				{$col_199, "AMT"},	// col_199
				{$col_200, "AMT"},	// col_200
				{$col_201, "AMT"},	// col_201
				{$col_202, "AMT"},	// col_202
				{$col_203, "AMT"},	// col_203
				{$col_204, "AMT"},	// col_204
				{$col_205, "AMT"},	// col_205
				{$col_206, "AMT"},	// col_206
				{$col_207, "AMT"},	// col_207
				{$col_208, "AMT"},	// col_208
				{$col_209, "AMT"},	// col_209
				{$col_210, "AMT"},	// col_210
				{$col_211, "AMT"},	// col_211
				{$col_212, "AMT"},	// col_212
				{$col_213, "AMT"},	// col_213
				{$col_214, "AMT"},	// col_214
				{$col_215, "AMT"},	// col_215
				{$col_216, "AMT"},	// col_216
				{$col_217, "AMT"},	// col_217
				{$col_218, "AMT"},	// col_218
				{$col_219, "AMT"},	// col_219
				{$col_220, "AMT"},	// col_220
				{$col_221, "AMT"},	// col_221
				{$col_222, "AMT"},	// col_222
				{$col_223, "AMT"},	// col_223
				{$col_224, "AMT"},	// col_224
				{$col_225, "AMT"},	// col_225
				{$col_226, "AMT"},	// col_226
				{$col_227, "AMT"},	// col_227
				{$col_228, "AMT"},	// col_228
				{$col_229, "AMT"},	// col_229
				{$col_230, "AMT"},	// col_230
				{$col_231, "AMT"},	// col_231
				{$col_232, "AMT"},	// col_232
				{$col_233, "AMT"},	// col_233
				{$col_234, "AMT"},	// col_234
				{$col_235, "AMT"},	// col_235
				{$col_236, "AMT"},	// col_236
				{$col_237, "AMT"},	// col_237
				{$col_238, "AMT"},	// col_238
				{$col_239, "AMT"},	// col_239
				{$col_240, "AMT"},	// col_240
				{$col_241, "AMT"},	// col_241
				{$col_242, "AMT"},	// col_242
				{$col_243, "AMT"},	// col_243
				{$col_244, "AMT"},	// col_244
				{$col_245, "AMT"},	// col_245
				{$col_246, "AMT"},	// col_246
				{$col_247, "AMT"},	// col_247
				{$col_248, "AMT"},	// col_248
				{$col_249, "AMT"},	// col_249
				{$col_250, "AMT"},	// col_250
				{$col_251, "AMT"},	// col_251
				{$col_252, "AMT"},	// col_252
				{$col_253, "AMT"},	// col_253
				{$col_254, "AMT"},	// col_254
				{$col_255, "AMT"},	// col_255
				{$col_256, "AMT"},	// col_256
				{$col_257, "AMT"},	// col_257
				{$col_258, "AMT"},	// col_258
				{$col_259, "AMT"},	// col_259
				{$col_260, "AMT"},	// col_260
				{$col_261, "AMT"},	// col_261
				{$col_262, "AMT"},	// col_262
				{$col_263, "AMT"},	// col_263
				{$col_264, "AMT"},	// col_264
				{$col_265, "AMT"},	// col_265
				{$col_266, "AMT"},	// col_266
				{$col_267, "AMT"},	// col_267
				{$col_268, "AMT"},	// col_268
				{$col_269, "AMT"},	// col_269
				{$col_270, "AMT"},	// col_270
				{$col_271, "AMT"},	// col_271
				{$col_272, "AMT"},	// col_272
				{$col_273, "AMT"},	// col_273
				{$col_274, "AMT"},	// col_274
				{$col_275, "AMT"},	// col_275
				{$col_276, "AMT"},	// col_276
				{$col_277, "AMT"},	// col_277
				{$col_278, "AMT"},	// col_278
				{$col_279, "AMT"},	// col_279
				{$col_280, "AMT"},	// col_280
				{$col_281, "AMT"},	// col_281
				{$col_282, "AMT"},	// col_282
				{$col_283, "AMT"},	// col_283
				{$col_284, "AMT"},	// col_284
				{$col_285, "AMT"},	// col_285
				{$col_286, "AMT"},	// col_286
				{$col_287, "AMT"},	// col_287
				{$col_288, "AMT"},	// col_288
				{$col_289, "AMT"},	// col_289
				{$col_290, "AMT"},	// col_290
				{$col_291, "AMT"},	// col_291
				{$col_292, "AMT"},	// col_292
				{$col_293, "AMT"},	// col_293
				{$col_294, "AMT"},	// col_294
				{$col_295, "AMT"},	// col_295
				{$col_296, "AMT"},	// col_296
				{$col_297, "AMT"},	// col_297
				{$col_298, "AMT"},	// col_298
				{$col_299, "AMT"}	// col_299
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$par_sno1, "SNO1"},	// par_sno1
				{$par_sno2, "SNO2"},	// par_sno2
				{$par_sno3, "SNO3"},	// par_sno3
				{$par_sno4, "SNO4"},	// par_sno4
				{$chd_sno1, "SNO1"},	// chd_sno1
				{$chd_sno2, "SNO2"},	// chd_sno2
				{$chd_sno3, "SNO3"},	// chd_sno3
				{$chd_sno4, "SNO4"},	// chd_sno4
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"}	// str_ln_nm
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 1, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 1, $wg_nm, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 2, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 2, $ym, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 3, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 3, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 4, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 4, $mng_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 5, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 5, $par_itm_p, row);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 6, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 6, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 7, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 7, $mfg_act_no, value);
	}


	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return getConstString(offset + 8, $par_itm_typ);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		setConstString(offset + 8, $par_itm_typ, value);
	}


	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public String par_itm_typ_nm() {
		return getConstString(offset + 9, $par_itm_typ_nm);
	}

	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public void par_itm_typ_nm(String value) {
		setConstString(offset + 9, $par_itm_typ_nm, value);
	}


	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return getConstString(offset + 10, $par_itm_typ_d_cd);
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		setConstString(offset + 10, $par_itm_typ_d_cd, value);
	}


	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public String par_itm_typ_d_nm() {
		return getConstString(offset + 11, $par_itm_typ_d_nm);
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public void par_itm_typ_d_nm(String value) {
		setConstString(offset + 11, $par_itm_typ_d_nm, value);
	}


	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public String par_itm_jnl_cd() {
		return getConstString(offset + 12, $par_itm_jnl_cd);
	}

	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public void par_itm_jnl_cd(String value) {
		setConstString(offset + 12, $par_itm_jnl_cd, value);
	}


	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public String par_itm_jnl_nm() {
		return getConstString(offset + 13, $par_itm_jnl_nm);
	}

	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public void par_itm_jnl_nm(String value) {
		setConstString(offset + 13, $par_itm_jnl_nm, value);
	}


	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public String par_itm_grp_cd1() {
		return getConstString(offset + 14, $par_itm_grp_cd1);
	}

	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public void par_itm_grp_cd1(String value) {
		setConstString(offset + 14, $par_itm_grp_cd1, value);
	}


	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public String par_itm_grp_nm1() {
		return getConstString(offset + 15, $par_itm_grp_nm1);
	}

	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public void par_itm_grp_nm1(String value) {
		setConstString(offset + 15, $par_itm_grp_nm1, value);
	}


	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public String par_itm_grp_cd2() {
		return getConstString(offset + 16, $par_itm_grp_cd2);
	}

	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public void par_itm_grp_cd2(String value) {
		setConstString(offset + 16, $par_itm_grp_cd2, value);
	}


	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public String par_itm_grp_nm2() {
		return getConstString(offset + 17, $par_itm_grp_nm2);
	}

	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public void par_itm_grp_nm2(String value) {
		setConstString(offset + 17, $par_itm_grp_nm2, value);
	}


	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public String par_itm_grp_cd3() {
		return getConstString(offset + 18, $par_itm_grp_cd3);
	}

	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public void par_itm_grp_cd3(String value) {
		setConstString(offset + 18, $par_itm_grp_cd3, value);
	}


	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public String par_itm_grp_nm3() {
		return getConstString(offset + 19, $par_itm_grp_nm3);
	}

	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public void par_itm_grp_nm3(String value) {
		setConstString(offset + 19, $par_itm_grp_nm3, value);
	}


	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public String par_itm_grp_cd4() {
		return getConstString(offset + 20, $par_itm_grp_cd4);
	}

	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public void par_itm_grp_cd4(String value) {
		setConstString(offset + 20, $par_itm_grp_cd4, value);
	}


	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public String par_itm_grp_nm4() {
		return getConstString(offset + 21, $par_itm_grp_nm4);
	}

	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public void par_itm_grp_nm4(String value) {
		setConstString(offset + 21, $par_itm_grp_nm4, value);
	}


	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public String par_itm_grp_cd5() {
		return getConstString(offset + 22, $par_itm_grp_cd5);
	}

	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public void par_itm_grp_cd5(String value) {
		setConstString(offset + 22, $par_itm_grp_cd5, value);
	}


	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public String par_itm_grp_nm5() {
		return getConstString(offset + 23, $par_itm_grp_nm5);
	}

	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public void par_itm_grp_nm5(String value) {
		setConstString(offset + 23, $par_itm_grp_nm5, value);
	}


	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public String par_itm_grp_cd6() {
		return getConstString(offset + 24, $par_itm_grp_cd6);
	}

	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public void par_itm_grp_cd6(String value) {
		setConstString(offset + 24, $par_itm_grp_cd6, value);
	}


	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public String par_itm_grp_nm6() {
		return getConstString(offset + 25, $par_itm_grp_nm6);
	}

	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public void par_itm_grp_nm6(String value) {
		setConstString(offset + 25, $par_itm_grp_nm6, value);
	}


	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public String par_itm_grp_cd7() {
		return getConstString(offset + 26, $par_itm_grp_cd7);
	}

	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public void par_itm_grp_cd7(String value) {
		setConstString(offset + 26, $par_itm_grp_cd7, value);
	}


	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public String par_itm_grp_nm7() {
		return getConstString(offset + 27, $par_itm_grp_nm7);
	}

	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public void par_itm_grp_nm7(String value) {
		setConstString(offset + 27, $par_itm_grp_nm7, value);
	}


	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public String par_itm_grp_cd8() {
		return getConstString(offset + 28, $par_itm_grp_cd8);
	}

	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public void par_itm_grp_cd8(String value) {
		setConstString(offset + 28, $par_itm_grp_cd8, value);
	}


	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public String par_itm_grp_nm8() {
		return getConstString(offset + 29, $par_itm_grp_nm8);
	}

	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public void par_itm_grp_nm8(String value) {
		setConstString(offset + 29, $par_itm_grp_nm8, value);
	}


	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public String par_itm_grp_cd9() {
		return getConstString(offset + 30, $par_itm_grp_cd9);
	}

	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public void par_itm_grp_cd9(String value) {
		setConstString(offset + 30, $par_itm_grp_cd9, value);
	}


	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public String par_itm_grp_nm9() {
		return getConstString(offset + 31, $par_itm_grp_nm9);
	}

	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public void par_itm_grp_nm9(String value) {
		setConstString(offset + 31, $par_itm_grp_nm9, value);
	}


	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public String par_itm_grp_cd10() {
		return getConstString(offset + 32, $par_itm_grp_cd10);
	}

	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public void par_itm_grp_cd10(String value) {
		setConstString(offset + 32, $par_itm_grp_cd10, value);
	}


	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public String par_itm_grp_nm10() {
		return getConstString(offset + 33, $par_itm_grp_nm10);
	}

	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public void par_itm_grp_nm10(String value) {
		setConstString(offset + 33, $par_itm_grp_nm10, value);
	}


	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public String par_lot_no() {
		return getConstString(offset + 34, $par_lot_no);
	}

	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public void par_lot_no(String value) {
		setConstString(offset + 34, $par_lot_no, value);
	}


	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public String par_sublot_no() {
		return getConstString(offset + 35, $par_sublot_no);
	}

	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public void par_sublot_no(String value) {
		setConstString(offset + 35, $par_sublot_no, value);
	}


	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public String par_sno1() {
		return getConstString(offset + 36, $par_sno1);
	}

	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public void par_sno1(String value) {
		setConstString(offset + 36, $par_sno1, value);
	}


	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public String par_sno2() {
		return getConstString(offset + 37, $par_sno2);
	}

	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public void par_sno2(String value) {
		setConstString(offset + 37, $par_sno2, value);
	}


	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public String par_sno3() {
		return getConstString(offset + 38, $par_sno3);
	}

	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public void par_sno3(String value) {
		setConstString(offset + 38, $par_sno3, value);
	}


	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public String par_sno4() {
		return getConstString(offset + 39, $par_sno4);
	}

	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public void par_sno4(String value) {
		setConstString(offset + 39, $par_sno4, value);
	}


	/**
	 * Parent asset type 親資産区分.<p>
	 *
	 */
	public String par_asst_typ() {
		return getConstString(offset + 40, $par_asst_typ);
	}

	/**
	 * Parent asset type 親資産区分.<p>
	 *
	 */
	public void par_asst_typ(String value) {
		setConstString(offset + 40, $par_asst_typ, value);
	}


	/**
	 * Parent asset type name 親資産区分名.<p>
	 *
	 */
	public String par_asst_typ_nm() {
		return getConstString(offset + 41, $par_asst_typ_nm);
	}

	/**
	 * Parent asset type name 親資産区分名.<p>
	 *
	 */
	public void par_asst_typ_nm(String value) {
		setConstString(offset + 41, $par_asst_typ_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 42, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 42, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 43, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 43, $bp_nm, value);
	}


	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return getConstString(offset + 44, $bp_grp_cd1);
	}

	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		setConstString(offset + 44, $bp_grp_cd1, value);
	}


	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return getConstString(offset + 45, $bp_grp_nm1);
	}

	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		setConstString(offset + 45, $bp_grp_nm1, value);
	}


	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return getConstString(offset + 46, $bp_grp_cd2);
	}

	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		setConstString(offset + 46, $bp_grp_cd2, value);
	}


	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return getConstString(offset + 47, $bp_grp_nm2);
	}

	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		setConstString(offset + 47, $bp_grp_nm2, value);
	}


	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return getConstString(offset + 48, $bp_grp_cd3);
	}

	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		setConstString(offset + 48, $bp_grp_cd3, value);
	}


	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return getConstString(offset + 49, $bp_grp_nm3);
	}

	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		setConstString(offset + 49, $bp_grp_nm3, value);
	}


	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return getConstString(offset + 50, $bp_grp_cd4);
	}

	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		setConstString(offset + 50, $bp_grp_cd4, value);
	}


	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return getConstString(offset + 51, $bp_grp_nm4);
	}

	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		setConstString(offset + 51, $bp_grp_nm4, value);
	}


	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return getConstString(offset + 52, $bp_grp_cd5);
	}

	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		setConstString(offset + 52, $bp_grp_cd5, value);
	}


	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return getConstString(offset + 53, $bp_grp_nm5);
	}

	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		setConstString(offset + 53, $bp_grp_nm5, value);
	}


	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return getConstString(offset + 54, $bp_grp_cd6);
	}

	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		setConstString(offset + 54, $bp_grp_cd6, value);
	}


	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return getConstString(offset + 55, $bp_grp_nm6);
	}

	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		setConstString(offset + 55, $bp_grp_nm6, value);
	}


	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return getConstString(offset + 56, $bp_grp_cd7);
	}

	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		setConstString(offset + 56, $bp_grp_cd7, value);
	}


	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return getConstString(offset + 57, $bp_grp_nm7);
	}

	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		setConstString(offset + 57, $bp_grp_nm7, value);
	}


	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return getConstString(offset + 58, $bp_grp_cd8);
	}

	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		setConstString(offset + 58, $bp_grp_cd8, value);
	}


	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return getConstString(offset + 59, $bp_grp_nm8);
	}

	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		setConstString(offset + 59, $bp_grp_nm8, value);
	}


	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return getConstString(offset + 60, $bp_grp_cd9);
	}

	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		setConstString(offset + 60, $bp_grp_cd9, value);
	}


	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return getConstString(offset + 61, $bp_grp_nm9);
	}

	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		setConstString(offset + 61, $bp_grp_nm9, value);
	}


	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return getConstString(offset + 62, $bp_grp_cd10);
	}

	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		setConstString(offset + 62, $bp_grp_cd10, value);
	}


	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return getConstString(offset + 63, $bp_grp_nm10);
	}

	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		setConstString(offset + 63, $bp_grp_nm10, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 64, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 64, $cntry_cd, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 65, $cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 65, $cntry_nm, value);
	}


	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 66, $area_cd);
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 66, $area_cd, value);
	}


	/**
	 * Region name 地域名.<p>
	 *
	 */
	public String area_nm() {
		return getConstString(offset + 67, $area_nm);
	}

	/**
	 * Region name 地域名.<p>
	 *
	 */
	public void area_nm(String value) {
		setConstString(offset + 67, $area_nm, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 68, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 68, $po_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 69, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 69, $slo_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 70, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 70, $iv_no, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR comp_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 71, $comp_qty_p);
	}
	
	public void comp_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 71, $comp_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR odr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 72, $odr_qty_p);
	}
	
	public void odr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 72, $odr_qty_p, row);
	}


	/**
	 * Parent unit cd. 親単位ＣＤ.<p>
	 *
	 */
	public String par_unit_cd() {
		return getConstString(offset + 73, $par_unit_cd);
	}

	/**
	 * Parent unit cd. 親単位ＣＤ.<p>
	 *
	 */
	public void par_unit_cd(String value) {
		setConstString(offset + 73, $par_unit_cd, value);
	}


	/**
	 * Parent unit name 親単位名.<p>
	 *
	 */
	public String par_unit_nm() {
		return getConstString(offset + 74, $par_unit_nm);
	}

	/**
	 * Parent unit name 親単位名.<p>
	 *
	 */
	public void par_unit_nm(String value) {
		setConstString(offset + 74, $par_unit_nm, value);
	}


	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public MCNumber par_dec_place() {
		return getConstNumber(offset + 75, $par_dec_place);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(MCNumber value) {
		setConstNumber(offset + 75, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(int value) {
		setConstNumber(offset + 75, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(long value) {
		setConstNumber(offset + 75, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(float value) {
		setConstNumber(offset + 75, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(double value) {
		setConstNumber(offset + 75, $par_dec_place, value);
	}


	/**
	 * Input dept. cd. 投入部門ＣＤ.<p>
	 *
	 */
	public String inpt_dpt_cd() {
		return getConstString(offset + 76, $inpt_dpt_cd);
	}

	/**
	 * Input dept. cd. 投入部門ＣＤ.<p>
	 *
	 */
	public void inpt_dpt_cd(String value) {
		setConstString(offset + 76, $inpt_dpt_cd, value);
	}


	/**
	 * Input dept. name 投入部門名.<p>
	 *
	 */
	public String inpt_dpt_nm() {
		return getConstString(offset + 77, $inpt_dpt_nm);
	}

	/**
	 * Input dept. name 投入部門名.<p>
	 *
	 */
	public void inpt_dpt_nm(String value) {
		setConstString(offset + 77, $inpt_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR chd_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 78, $chd_itm_p);
	}
	
	public void chd_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 78, $chd_itm_p, row);
	}


	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return getConstString(offset + 79, $chd_itm_typ);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		setConstString(offset + 79, $chd_itm_typ, value);
	}


	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public String chd_itm_typ_nm() {
		return getConstString(offset + 80, $chd_itm_typ_nm);
	}

	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public void chd_itm_typ_nm(String value) {
		setConstString(offset + 80, $chd_itm_typ_nm, value);
	}


	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return getConstString(offset + 81, $chd_itm_typ_d_cd);
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		setConstString(offset + 81, $chd_itm_typ_d_cd, value);
	}


	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public String chd_itm_typ_d_nm() {
		return getConstString(offset + 82, $chd_itm_typ_d_nm);
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public void chd_itm_typ_d_nm(String value) {
		setConstString(offset + 82, $chd_itm_typ_d_nm, value);
	}


	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public String chd_itm_jnl_cd() {
		return getConstString(offset + 83, $chd_itm_jnl_cd);
	}

	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public void chd_itm_jnl_cd(String value) {
		setConstString(offset + 83, $chd_itm_jnl_cd, value);
	}


	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public String chd_itm_jnl_nm() {
		return getConstString(offset + 84, $chd_itm_jnl_nm);
	}

	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public void chd_itm_jnl_nm(String value) {
		setConstString(offset + 84, $chd_itm_jnl_nm, value);
	}


	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public String chd_itm_grp_cd1() {
		return getConstString(offset + 85, $chd_itm_grp_cd1);
	}

	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public void chd_itm_grp_cd1(String value) {
		setConstString(offset + 85, $chd_itm_grp_cd1, value);
	}


	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public String chd_itm_grp_nm1() {
		return getConstString(offset + 86, $chd_itm_grp_nm1);
	}

	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public void chd_itm_grp_nm1(String value) {
		setConstString(offset + 86, $chd_itm_grp_nm1, value);
	}


	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public String chd_itm_grp_cd2() {
		return getConstString(offset + 87, $chd_itm_grp_cd2);
	}

	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public void chd_itm_grp_cd2(String value) {
		setConstString(offset + 87, $chd_itm_grp_cd2, value);
	}


	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public String chd_itm_grp_nm2() {
		return getConstString(offset + 88, $chd_itm_grp_nm2);
	}

	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public void chd_itm_grp_nm2(String value) {
		setConstString(offset + 88, $chd_itm_grp_nm2, value);
	}


	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public String chd_itm_grp_cd3() {
		return getConstString(offset + 89, $chd_itm_grp_cd3);
	}

	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public void chd_itm_grp_cd3(String value) {
		setConstString(offset + 89, $chd_itm_grp_cd3, value);
	}


	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public String chd_itm_grp_nm3() {
		return getConstString(offset + 90, $chd_itm_grp_nm3);
	}

	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public void chd_itm_grp_nm3(String value) {
		setConstString(offset + 90, $chd_itm_grp_nm3, value);
	}


	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public String chd_itm_grp_cd4() {
		return getConstString(offset + 91, $chd_itm_grp_cd4);
	}

	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public void chd_itm_grp_cd4(String value) {
		setConstString(offset + 91, $chd_itm_grp_cd4, value);
	}


	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public String chd_itm_grp_nm4() {
		return getConstString(offset + 92, $chd_itm_grp_nm4);
	}

	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public void chd_itm_grp_nm4(String value) {
		setConstString(offset + 92, $chd_itm_grp_nm4, value);
	}


	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public String chd_itm_grp_cd5() {
		return getConstString(offset + 93, $chd_itm_grp_cd5);
	}

	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public void chd_itm_grp_cd5(String value) {
		setConstString(offset + 93, $chd_itm_grp_cd5, value);
	}


	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public String chd_itm_grp_nm5() {
		return getConstString(offset + 94, $chd_itm_grp_nm5);
	}

	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public void chd_itm_grp_nm5(String value) {
		setConstString(offset + 94, $chd_itm_grp_nm5, value);
	}


	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public String chd_itm_grp_cd6() {
		return getConstString(offset + 95, $chd_itm_grp_cd6);
	}

	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public void chd_itm_grp_cd6(String value) {
		setConstString(offset + 95, $chd_itm_grp_cd6, value);
	}


	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public String chd_itm_grp_nm6() {
		return getConstString(offset + 96, $chd_itm_grp_nm6);
	}

	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public void chd_itm_grp_nm6(String value) {
		setConstString(offset + 96, $chd_itm_grp_nm6, value);
	}


	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public String chd_itm_grp_cd7() {
		return getConstString(offset + 97, $chd_itm_grp_cd7);
	}

	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public void chd_itm_grp_cd7(String value) {
		setConstString(offset + 97, $chd_itm_grp_cd7, value);
	}


	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public String chd_itm_grp_nm7() {
		return getConstString(offset + 98, $chd_itm_grp_nm7);
	}

	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public void chd_itm_grp_nm7(String value) {
		setConstString(offset + 98, $chd_itm_grp_nm7, value);
	}


	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public String chd_itm_grp_cd8() {
		return getConstString(offset + 99, $chd_itm_grp_cd8);
	}

	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public void chd_itm_grp_cd8(String value) {
		setConstString(offset + 99, $chd_itm_grp_cd8, value);
	}


	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public String chd_itm_grp_nm8() {
		return getConstString(offset + 100, $chd_itm_grp_nm8);
	}

	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public void chd_itm_grp_nm8(String value) {
		setConstString(offset + 100, $chd_itm_grp_nm8, value);
	}


	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public String chd_itm_grp_cd9() {
		return getConstString(offset + 101, $chd_itm_grp_cd9);
	}

	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public void chd_itm_grp_cd9(String value) {
		setConstString(offset + 101, $chd_itm_grp_cd9, value);
	}


	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public String chd_itm_grp_nm9() {
		return getConstString(offset + 102, $chd_itm_grp_nm9);
	}

	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public void chd_itm_grp_nm9(String value) {
		setConstString(offset + 102, $chd_itm_grp_nm9, value);
	}


	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public String chd_itm_grp_cd10() {
		return getConstString(offset + 103, $chd_itm_grp_cd10);
	}

	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public void chd_itm_grp_cd10(String value) {
		setConstString(offset + 103, $chd_itm_grp_cd10, value);
	}


	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public String chd_itm_grp_nm10() {
		return getConstString(offset + 104, $chd_itm_grp_nm10);
	}

	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public void chd_itm_grp_nm10(String value) {
		setConstString(offset + 104, $chd_itm_grp_nm10, value);
	}


	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public String chd_lot_no() {
		return getConstString(offset + 105, $chd_lot_no);
	}

	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public void chd_lot_no(String value) {
		setConstString(offset + 105, $chd_lot_no, value);
	}


	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public String chd_sublot_no() {
		return getConstString(offset + 106, $chd_sublot_no);
	}

	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public void chd_sublot_no(String value) {
		setConstString(offset + 106, $chd_sublot_no, value);
	}


	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public String chd_sno1() {
		return getConstString(offset + 107, $chd_sno1);
	}

	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public void chd_sno1(String value) {
		setConstString(offset + 107, $chd_sno1, value);
	}


	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public String chd_sno2() {
		return getConstString(offset + 108, $chd_sno2);
	}

	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public void chd_sno2(String value) {
		setConstString(offset + 108, $chd_sno2, value);
	}


	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public String chd_sno3() {
		return getConstString(offset + 109, $chd_sno3);
	}

	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public void chd_sno3(String value) {
		setConstString(offset + 109, $chd_sno3, value);
	}


	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public String chd_sno4() {
		return getConstString(offset + 110, $chd_sno4);
	}

	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public void chd_sno4(String value) {
		setConstString(offset + 110, $chd_sno4, value);
	}


	/**
	 * Child asset type 子資産区分.<p>
	 *
	 */
	public String chd_asst_typ() {
		return getConstString(offset + 111, $chd_asst_typ);
	}

	/**
	 * Child asset type 子資産区分.<p>
	 *
	 */
	public void chd_asst_typ(String value) {
		setConstString(offset + 111, $chd_asst_typ, value);
	}


	/**
	 * Child asset type name 子資産区分名.<p>
	 *
	 */
	public String chd_asst_typ_nm() {
		return getConstString(offset + 112, $chd_asst_typ_nm);
	}

	/**
	 * Child asset type name 子資産区分名.<p>
	 *
	 */
	public void chd_asst_typ_nm(String value) {
		setConstString(offset + 112, $chd_asst_typ_nm, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 113, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 113, $repurc_obli_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 114, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 114, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 115, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 115, $site_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 116, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 116, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 117, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 117, $loc_nm, value);
	}


	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 118, $str_ln_cd);
	}

	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 118, $str_ln_cd, value);
	}


	/**
	 * Line name ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 119, $str_ln_nm);
	}

	/**
	 * Line name ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 119, $str_ln_nm, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 120, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 120, $oper_act_no, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 121, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 121, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 122, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 122, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 123, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 123, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 123, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 123, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 123, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 123, $oper_seq, value);
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 124, $ac_slip_typ);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 124, $ac_slip_typ, value);
	}


	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public String ac_slip_typ_nm() {
		return getConstString(offset + 125, $ac_slip_typ_nm);
	}

	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public void ac_slip_typ_nm(String value) {
		setConstString(offset + 125, $ac_slip_typ_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 126, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 126, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 127, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 127, $ac_rsn_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_diff_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 128, $qty_diff_p);
	}
	
	public void qty_diff_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 128, $qty_diff_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR std_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 129, $std_qty_p);
	}
	
	public void std_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 129, $std_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 130, $act_qty_p);
	}
	
	public void act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 130, $act_qty_p, row);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 131, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 131, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 132, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 132, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 133, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 133, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 133, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 133, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 133, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 133, $dec_place, value);
	}


	/**
	 * Unit price variance 単価差.<p>
	 *
	 */
	public MCNumber upri_diff() {
		return getConstNumber(offset + 134, $upri_diff);
	}

	/**
	 * Unit price variance 単価差.<p>
	 *
	 */
	public void upri_diff(MCNumber value) {
		setConstNumber(offset + 134, $upri_diff, value);
	}

	/**
	 * Unit price variance 単価差.<p>
	 *
	 */
	public void upri_diff(int value) {
		setConstNumber(offset + 134, $upri_diff, value);
	}

	/**
	 * Unit price variance 単価差.<p>
	 *
	 */
	public void upri_diff(long value) {
		setConstNumber(offset + 134, $upri_diff, value);
	}

	/**
	 * Unit price variance 単価差.<p>
	 *
	 */
	public void upri_diff(float value) {
		setConstNumber(offset + 134, $upri_diff, value);
	}

	/**
	 * Unit price variance 単価差.<p>
	 *
	 */
	public void upri_diff(double value) {
		setConstNumber(offset + 134, $upri_diff, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber std_upri() {
		return getConstNumber(offset + 135, $std_upri);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(MCNumber value) {
		setConstNumber(offset + 135, $std_upri, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(int value) {
		setConstNumber(offset + 135, $std_upri, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(long value) {
		setConstNumber(offset + 135, $std_upri, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(float value) {
		setConstNumber(offset + 135, $std_upri, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(double value) {
		setConstNumber(offset + 135, $std_upri, value);
	}


	/**
	 * Issue unit price 払出単価.<p>
	 *
	 */
	public MCNumber act_upri() {
		return getConstNumber(offset + 136, $act_upri);
	}

	/**
	 * Issue unit price 払出単価.<p>
	 *
	 */
	public void act_upri(MCNumber value) {
		setConstNumber(offset + 136, $act_upri, value);
	}

	/**
	 * Issue unit price 払出単価.<p>
	 *
	 */
	public void act_upri(int value) {
		setConstNumber(offset + 136, $act_upri, value);
	}

	/**
	 * Issue unit price 払出単価.<p>
	 *
	 */
	public void act_upri(long value) {
		setConstNumber(offset + 136, $act_upri, value);
	}

	/**
	 * Issue unit price 払出単価.<p>
	 *
	 */
	public void act_upri(float value) {
		setConstNumber(offset + 136, $act_upri, value);
	}

	/**
	 * Issue unit price 払出単価.<p>
	 *
	 */
	public void act_upri(double value) {
		setConstNumber(offset + 136, $act_upri, value);
	}


	/**
	 * Quantity variance 数量差異.<p>
	 *
	 */
	public MCNumber diff_qty() {
		return getConstNumber(offset + 137, $diff_qty);
	}

	/**
	 * Quantity variance 数量差異.<p>
	 *
	 */
	public void diff_qty(MCNumber value) {
		setConstNumber(offset + 137, $diff_qty, value);
	}

	/**
	 * Quantity variance 数量差異.<p>
	 *
	 */
	public void diff_qty(int value) {
		setConstNumber(offset + 137, $diff_qty, value);
	}

	/**
	 * Quantity variance 数量差異.<p>
	 *
	 */
	public void diff_qty(long value) {
		setConstNumber(offset + 137, $diff_qty, value);
	}

	/**
	 * Quantity variance 数量差異.<p>
	 *
	 */
	public void diff_qty(float value) {
		setConstNumber(offset + 137, $diff_qty, value);
	}

	/**
	 * Quantity variance 数量差異.<p>
	 *
	 */
	public void diff_qty(double value) {
		setConstNumber(offset + 137, $diff_qty, value);
	}


	/**
	 * Price variance 価格差異.<p>
	 *
	 */
	public MCNumber diff_up() {
		return getConstNumber(offset + 138, $diff_up);
	}

	/**
	 * Price variance 価格差異.<p>
	 *
	 */
	public void diff_up(MCNumber value) {
		setConstNumber(offset + 138, $diff_up, value);
	}

	/**
	 * Price variance 価格差異.<p>
	 *
	 */
	public void diff_up(int value) {
		setConstNumber(offset + 138, $diff_up, value);
	}

	/**
	 * Price variance 価格差異.<p>
	 *
	 */
	public void diff_up(long value) {
		setConstNumber(offset + 138, $diff_up, value);
	}

	/**
	 * Price variance 価格差異.<p>
	 *
	 */
	public void diff_up(float value) {
		setConstNumber(offset + 138, $diff_up, value);
	}

	/**
	 * Price variance 価格差異.<p>
	 *
	 */
	public void diff_up(double value) {
		setConstNumber(offset + 138, $diff_up, value);
	}


	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public MCNumber cost_diff() {
		return getConstNumber(offset + 139, $cost_diff);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void cost_diff(MCNumber value) {
		setConstNumber(offset + 139, $cost_diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void cost_diff(int value) {
		setConstNumber(offset + 139, $cost_diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void cost_diff(long value) {
		setConstNumber(offset + 139, $cost_diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void cost_diff(float value) {
		setConstNumber(offset + 139, $cost_diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void cost_diff(double value) {
		setConstNumber(offset + 139, $cost_diff, value);
	}


	/**
	 * Standard input cost 標準投入原価.<p>
	 *
	 */
	public MCNumber std_cost() {
		return getConstNumber(offset + 140, $std_cost);
	}

	/**
	 * Standard input cost 標準投入原価.<p>
	 *
	 */
	public void std_cost(MCNumber value) {
		setConstNumber(offset + 140, $std_cost, value);
	}

	/**
	 * Standard input cost 標準投入原価.<p>
	 *
	 */
	public void std_cost(int value) {
		setConstNumber(offset + 140, $std_cost, value);
	}

	/**
	 * Standard input cost 標準投入原価.<p>
	 *
	 */
	public void std_cost(long value) {
		setConstNumber(offset + 140, $std_cost, value);
	}

	/**
	 * Standard input cost 標準投入原価.<p>
	 *
	 */
	public void std_cost(float value) {
		setConstNumber(offset + 140, $std_cost, value);
	}

	/**
	 * Standard input cost 標準投入原価.<p>
	 *
	 */
	public void std_cost(double value) {
		setConstNumber(offset + 140, $std_cost, value);
	}


	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public MCNumber act_cost() {
		return getConstNumber(offset + 141, $act_cost);
	}

	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public void act_cost(MCNumber value) {
		setConstNumber(offset + 141, $act_cost, value);
	}

	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public void act_cost(int value) {
		setConstNumber(offset + 141, $act_cost, value);
	}

	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public void act_cost(long value) {
		setConstNumber(offset + 141, $act_cost, value);
	}

	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public void act_cost(float value) {
		setConstNumber(offset + 141, $act_cost, value);
	}

	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public void act_cost(double value) {
		setConstNumber(offset + 141, $act_cost, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 142, $ttl);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 142, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 142, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 142, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 142, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 142, $ttl, value);
	}


	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public MCNumber var_cost() {
		return getConstNumber(offset + 143, $var_cost);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(MCNumber value) {
		setConstNumber(offset + 143, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(int value) {
		setConstNumber(offset + 143, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(long value) {
		setConstNumber(offset + 143, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(float value) {
		setConstNumber(offset + 143, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(double value) {
		setConstNumber(offset + 143, $var_cost, value);
	}


	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public MCNumber fxd_cost() {
		return getConstNumber(offset + 144, $fxd_cost);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(MCNumber value) {
		setConstNumber(offset + 144, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(int value) {
		setConstNumber(offset + 144, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(long value) {
		setConstNumber(offset + 144, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(float value) {
		setConstNumber(offset + 144, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(double value) {
		setConstNumber(offset + 144, $fxd_cost, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl_qty() {
		return getConstNumber(offset + 145, $ttl_qty);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_qty(MCNumber value) {
		setConstNumber(offset + 145, $ttl_qty, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_qty(int value) {
		setConstNumber(offset + 145, $ttl_qty, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_qty(long value) {
		setConstNumber(offset + 145, $ttl_qty, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_qty(float value) {
		setConstNumber(offset + 145, $ttl_qty, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_qty(double value) {
		setConstNumber(offset + 145, $ttl_qty, value);
	}


	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public MCNumber var_cost_qty() {
		return getConstNumber(offset + 146, $var_cost_qty);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_qty(MCNumber value) {
		setConstNumber(offset + 146, $var_cost_qty, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_qty(int value) {
		setConstNumber(offset + 146, $var_cost_qty, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_qty(long value) {
		setConstNumber(offset + 146, $var_cost_qty, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_qty(float value) {
		setConstNumber(offset + 146, $var_cost_qty, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_qty(double value) {
		setConstNumber(offset + 146, $var_cost_qty, value);
	}


	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public MCNumber fxd_cost_qty() {
		return getConstNumber(offset + 147, $fxd_cost_qty);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_qty(MCNumber value) {
		setConstNumber(offset + 147, $fxd_cost_qty, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_qty(int value) {
		setConstNumber(offset + 147, $fxd_cost_qty, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_qty(long value) {
		setConstNumber(offset + 147, $fxd_cost_qty, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_qty(float value) {
		setConstNumber(offset + 147, $fxd_cost_qty, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_qty(double value) {
		setConstNumber(offset + 147, $fxd_cost_qty, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl_up() {
		return getConstNumber(offset + 148, $ttl_up);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_up(MCNumber value) {
		setConstNumber(offset + 148, $ttl_up, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_up(int value) {
		setConstNumber(offset + 148, $ttl_up, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_up(long value) {
		setConstNumber(offset + 148, $ttl_up, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_up(float value) {
		setConstNumber(offset + 148, $ttl_up, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl_up(double value) {
		setConstNumber(offset + 148, $ttl_up, value);
	}


	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public MCNumber var_cost_up() {
		return getConstNumber(offset + 149, $var_cost_up);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_up(MCNumber value) {
		setConstNumber(offset + 149, $var_cost_up, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_up(int value) {
		setConstNumber(offset + 149, $var_cost_up, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_up(long value) {
		setConstNumber(offset + 149, $var_cost_up, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_up(float value) {
		setConstNumber(offset + 149, $var_cost_up, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost_up(double value) {
		setConstNumber(offset + 149, $var_cost_up, value);
	}


	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public MCNumber fxd_cost_up() {
		return getConstNumber(offset + 150, $fxd_cost_up);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_up(MCNumber value) {
		setConstNumber(offset + 150, $fxd_cost_up, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_up(int value) {
		setConstNumber(offset + 150, $fxd_cost_up, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_up(long value) {
		setConstNumber(offset + 150, $fxd_cost_up, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_up(float value) {
		setConstNumber(offset + 150, $fxd_cost_up, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost_up(double value) {
		setConstNumber(offset + 150, $fxd_cost_up, value);
	}


	public MCNumber col_000() {
		return getConstNumber(offset + 151, $col_000);
	}

	public void col_000(MCNumber value) {
		setConstNumber(offset + 151, $col_000, value);
	}

	public void col_000(int value) {
		setConstNumber(offset + 151, $col_000, value);
	}

	public void col_000(long value) {
		setConstNumber(offset + 151, $col_000, value);
	}

	public void col_000(float value) {
		setConstNumber(offset + 151, $col_000, value);
	}

	public void col_000(double value) {
		setConstNumber(offset + 151, $col_000, value);
	}


	public MCNumber col_001() {
		return getConstNumber(offset + 152, $col_001);
	}

	public void col_001(MCNumber value) {
		setConstNumber(offset + 152, $col_001, value);
	}

	public void col_001(int value) {
		setConstNumber(offset + 152, $col_001, value);
	}

	public void col_001(long value) {
		setConstNumber(offset + 152, $col_001, value);
	}

	public void col_001(float value) {
		setConstNumber(offset + 152, $col_001, value);
	}

	public void col_001(double value) {
		setConstNumber(offset + 152, $col_001, value);
	}


	public MCNumber col_002() {
		return getConstNumber(offset + 153, $col_002);
	}

	public void col_002(MCNumber value) {
		setConstNumber(offset + 153, $col_002, value);
	}

	public void col_002(int value) {
		setConstNumber(offset + 153, $col_002, value);
	}

	public void col_002(long value) {
		setConstNumber(offset + 153, $col_002, value);
	}

	public void col_002(float value) {
		setConstNumber(offset + 153, $col_002, value);
	}

	public void col_002(double value) {
		setConstNumber(offset + 153, $col_002, value);
	}


	public MCNumber col_003() {
		return getConstNumber(offset + 154, $col_003);
	}

	public void col_003(MCNumber value) {
		setConstNumber(offset + 154, $col_003, value);
	}

	public void col_003(int value) {
		setConstNumber(offset + 154, $col_003, value);
	}

	public void col_003(long value) {
		setConstNumber(offset + 154, $col_003, value);
	}

	public void col_003(float value) {
		setConstNumber(offset + 154, $col_003, value);
	}

	public void col_003(double value) {
		setConstNumber(offset + 154, $col_003, value);
	}


	public MCNumber col_004() {
		return getConstNumber(offset + 155, $col_004);
	}

	public void col_004(MCNumber value) {
		setConstNumber(offset + 155, $col_004, value);
	}

	public void col_004(int value) {
		setConstNumber(offset + 155, $col_004, value);
	}

	public void col_004(long value) {
		setConstNumber(offset + 155, $col_004, value);
	}

	public void col_004(float value) {
		setConstNumber(offset + 155, $col_004, value);
	}

	public void col_004(double value) {
		setConstNumber(offset + 155, $col_004, value);
	}


	public MCNumber col_005() {
		return getConstNumber(offset + 156, $col_005);
	}

	public void col_005(MCNumber value) {
		setConstNumber(offset + 156, $col_005, value);
	}

	public void col_005(int value) {
		setConstNumber(offset + 156, $col_005, value);
	}

	public void col_005(long value) {
		setConstNumber(offset + 156, $col_005, value);
	}

	public void col_005(float value) {
		setConstNumber(offset + 156, $col_005, value);
	}

	public void col_005(double value) {
		setConstNumber(offset + 156, $col_005, value);
	}


	public MCNumber col_006() {
		return getConstNumber(offset + 157, $col_006);
	}

	public void col_006(MCNumber value) {
		setConstNumber(offset + 157, $col_006, value);
	}

	public void col_006(int value) {
		setConstNumber(offset + 157, $col_006, value);
	}

	public void col_006(long value) {
		setConstNumber(offset + 157, $col_006, value);
	}

	public void col_006(float value) {
		setConstNumber(offset + 157, $col_006, value);
	}

	public void col_006(double value) {
		setConstNumber(offset + 157, $col_006, value);
	}


	public MCNumber col_007() {
		return getConstNumber(offset + 158, $col_007);
	}

	public void col_007(MCNumber value) {
		setConstNumber(offset + 158, $col_007, value);
	}

	public void col_007(int value) {
		setConstNumber(offset + 158, $col_007, value);
	}

	public void col_007(long value) {
		setConstNumber(offset + 158, $col_007, value);
	}

	public void col_007(float value) {
		setConstNumber(offset + 158, $col_007, value);
	}

	public void col_007(double value) {
		setConstNumber(offset + 158, $col_007, value);
	}


	public MCNumber col_008() {
		return getConstNumber(offset + 159, $col_008);
	}

	public void col_008(MCNumber value) {
		setConstNumber(offset + 159, $col_008, value);
	}

	public void col_008(int value) {
		setConstNumber(offset + 159, $col_008, value);
	}

	public void col_008(long value) {
		setConstNumber(offset + 159, $col_008, value);
	}

	public void col_008(float value) {
		setConstNumber(offset + 159, $col_008, value);
	}

	public void col_008(double value) {
		setConstNumber(offset + 159, $col_008, value);
	}


	public MCNumber col_009() {
		return getConstNumber(offset + 160, $col_009);
	}

	public void col_009(MCNumber value) {
		setConstNumber(offset + 160, $col_009, value);
	}

	public void col_009(int value) {
		setConstNumber(offset + 160, $col_009, value);
	}

	public void col_009(long value) {
		setConstNumber(offset + 160, $col_009, value);
	}

	public void col_009(float value) {
		setConstNumber(offset + 160, $col_009, value);
	}

	public void col_009(double value) {
		setConstNumber(offset + 160, $col_009, value);
	}


	public MCNumber col_010() {
		return getConstNumber(offset + 161, $col_010);
	}

	public void col_010(MCNumber value) {
		setConstNumber(offset + 161, $col_010, value);
	}

	public void col_010(int value) {
		setConstNumber(offset + 161, $col_010, value);
	}

	public void col_010(long value) {
		setConstNumber(offset + 161, $col_010, value);
	}

	public void col_010(float value) {
		setConstNumber(offset + 161, $col_010, value);
	}

	public void col_010(double value) {
		setConstNumber(offset + 161, $col_010, value);
	}


	public MCNumber col_011() {
		return getConstNumber(offset + 162, $col_011);
	}

	public void col_011(MCNumber value) {
		setConstNumber(offset + 162, $col_011, value);
	}

	public void col_011(int value) {
		setConstNumber(offset + 162, $col_011, value);
	}

	public void col_011(long value) {
		setConstNumber(offset + 162, $col_011, value);
	}

	public void col_011(float value) {
		setConstNumber(offset + 162, $col_011, value);
	}

	public void col_011(double value) {
		setConstNumber(offset + 162, $col_011, value);
	}


	public MCNumber col_012() {
		return getConstNumber(offset + 163, $col_012);
	}

	public void col_012(MCNumber value) {
		setConstNumber(offset + 163, $col_012, value);
	}

	public void col_012(int value) {
		setConstNumber(offset + 163, $col_012, value);
	}

	public void col_012(long value) {
		setConstNumber(offset + 163, $col_012, value);
	}

	public void col_012(float value) {
		setConstNumber(offset + 163, $col_012, value);
	}

	public void col_012(double value) {
		setConstNumber(offset + 163, $col_012, value);
	}


	public MCNumber col_013() {
		return getConstNumber(offset + 164, $col_013);
	}

	public void col_013(MCNumber value) {
		setConstNumber(offset + 164, $col_013, value);
	}

	public void col_013(int value) {
		setConstNumber(offset + 164, $col_013, value);
	}

	public void col_013(long value) {
		setConstNumber(offset + 164, $col_013, value);
	}

	public void col_013(float value) {
		setConstNumber(offset + 164, $col_013, value);
	}

	public void col_013(double value) {
		setConstNumber(offset + 164, $col_013, value);
	}


	public MCNumber col_014() {
		return getConstNumber(offset + 165, $col_014);
	}

	public void col_014(MCNumber value) {
		setConstNumber(offset + 165, $col_014, value);
	}

	public void col_014(int value) {
		setConstNumber(offset + 165, $col_014, value);
	}

	public void col_014(long value) {
		setConstNumber(offset + 165, $col_014, value);
	}

	public void col_014(float value) {
		setConstNumber(offset + 165, $col_014, value);
	}

	public void col_014(double value) {
		setConstNumber(offset + 165, $col_014, value);
	}


	public MCNumber col_015() {
		return getConstNumber(offset + 166, $col_015);
	}

	public void col_015(MCNumber value) {
		setConstNumber(offset + 166, $col_015, value);
	}

	public void col_015(int value) {
		setConstNumber(offset + 166, $col_015, value);
	}

	public void col_015(long value) {
		setConstNumber(offset + 166, $col_015, value);
	}

	public void col_015(float value) {
		setConstNumber(offset + 166, $col_015, value);
	}

	public void col_015(double value) {
		setConstNumber(offset + 166, $col_015, value);
	}


	public MCNumber col_016() {
		return getConstNumber(offset + 167, $col_016);
	}

	public void col_016(MCNumber value) {
		setConstNumber(offset + 167, $col_016, value);
	}

	public void col_016(int value) {
		setConstNumber(offset + 167, $col_016, value);
	}

	public void col_016(long value) {
		setConstNumber(offset + 167, $col_016, value);
	}

	public void col_016(float value) {
		setConstNumber(offset + 167, $col_016, value);
	}

	public void col_016(double value) {
		setConstNumber(offset + 167, $col_016, value);
	}


	public MCNumber col_017() {
		return getConstNumber(offset + 168, $col_017);
	}

	public void col_017(MCNumber value) {
		setConstNumber(offset + 168, $col_017, value);
	}

	public void col_017(int value) {
		setConstNumber(offset + 168, $col_017, value);
	}

	public void col_017(long value) {
		setConstNumber(offset + 168, $col_017, value);
	}

	public void col_017(float value) {
		setConstNumber(offset + 168, $col_017, value);
	}

	public void col_017(double value) {
		setConstNumber(offset + 168, $col_017, value);
	}


	public MCNumber col_018() {
		return getConstNumber(offset + 169, $col_018);
	}

	public void col_018(MCNumber value) {
		setConstNumber(offset + 169, $col_018, value);
	}

	public void col_018(int value) {
		setConstNumber(offset + 169, $col_018, value);
	}

	public void col_018(long value) {
		setConstNumber(offset + 169, $col_018, value);
	}

	public void col_018(float value) {
		setConstNumber(offset + 169, $col_018, value);
	}

	public void col_018(double value) {
		setConstNumber(offset + 169, $col_018, value);
	}


	public MCNumber col_019() {
		return getConstNumber(offset + 170, $col_019);
	}

	public void col_019(MCNumber value) {
		setConstNumber(offset + 170, $col_019, value);
	}

	public void col_019(int value) {
		setConstNumber(offset + 170, $col_019, value);
	}

	public void col_019(long value) {
		setConstNumber(offset + 170, $col_019, value);
	}

	public void col_019(float value) {
		setConstNumber(offset + 170, $col_019, value);
	}

	public void col_019(double value) {
		setConstNumber(offset + 170, $col_019, value);
	}


	public MCNumber col_020() {
		return getConstNumber(offset + 171, $col_020);
	}

	public void col_020(MCNumber value) {
		setConstNumber(offset + 171, $col_020, value);
	}

	public void col_020(int value) {
		setConstNumber(offset + 171, $col_020, value);
	}

	public void col_020(long value) {
		setConstNumber(offset + 171, $col_020, value);
	}

	public void col_020(float value) {
		setConstNumber(offset + 171, $col_020, value);
	}

	public void col_020(double value) {
		setConstNumber(offset + 171, $col_020, value);
	}


	public MCNumber col_021() {
		return getConstNumber(offset + 172, $col_021);
	}

	public void col_021(MCNumber value) {
		setConstNumber(offset + 172, $col_021, value);
	}

	public void col_021(int value) {
		setConstNumber(offset + 172, $col_021, value);
	}

	public void col_021(long value) {
		setConstNumber(offset + 172, $col_021, value);
	}

	public void col_021(float value) {
		setConstNumber(offset + 172, $col_021, value);
	}

	public void col_021(double value) {
		setConstNumber(offset + 172, $col_021, value);
	}


	public MCNumber col_022() {
		return getConstNumber(offset + 173, $col_022);
	}

	public void col_022(MCNumber value) {
		setConstNumber(offset + 173, $col_022, value);
	}

	public void col_022(int value) {
		setConstNumber(offset + 173, $col_022, value);
	}

	public void col_022(long value) {
		setConstNumber(offset + 173, $col_022, value);
	}

	public void col_022(float value) {
		setConstNumber(offset + 173, $col_022, value);
	}

	public void col_022(double value) {
		setConstNumber(offset + 173, $col_022, value);
	}


	public MCNumber col_023() {
		return getConstNumber(offset + 174, $col_023);
	}

	public void col_023(MCNumber value) {
		setConstNumber(offset + 174, $col_023, value);
	}

	public void col_023(int value) {
		setConstNumber(offset + 174, $col_023, value);
	}

	public void col_023(long value) {
		setConstNumber(offset + 174, $col_023, value);
	}

	public void col_023(float value) {
		setConstNumber(offset + 174, $col_023, value);
	}

	public void col_023(double value) {
		setConstNumber(offset + 174, $col_023, value);
	}


	public MCNumber col_024() {
		return getConstNumber(offset + 175, $col_024);
	}

	public void col_024(MCNumber value) {
		setConstNumber(offset + 175, $col_024, value);
	}

	public void col_024(int value) {
		setConstNumber(offset + 175, $col_024, value);
	}

	public void col_024(long value) {
		setConstNumber(offset + 175, $col_024, value);
	}

	public void col_024(float value) {
		setConstNumber(offset + 175, $col_024, value);
	}

	public void col_024(double value) {
		setConstNumber(offset + 175, $col_024, value);
	}


	public MCNumber col_025() {
		return getConstNumber(offset + 176, $col_025);
	}

	public void col_025(MCNumber value) {
		setConstNumber(offset + 176, $col_025, value);
	}

	public void col_025(int value) {
		setConstNumber(offset + 176, $col_025, value);
	}

	public void col_025(long value) {
		setConstNumber(offset + 176, $col_025, value);
	}

	public void col_025(float value) {
		setConstNumber(offset + 176, $col_025, value);
	}

	public void col_025(double value) {
		setConstNumber(offset + 176, $col_025, value);
	}


	public MCNumber col_026() {
		return getConstNumber(offset + 177, $col_026);
	}

	public void col_026(MCNumber value) {
		setConstNumber(offset + 177, $col_026, value);
	}

	public void col_026(int value) {
		setConstNumber(offset + 177, $col_026, value);
	}

	public void col_026(long value) {
		setConstNumber(offset + 177, $col_026, value);
	}

	public void col_026(float value) {
		setConstNumber(offset + 177, $col_026, value);
	}

	public void col_026(double value) {
		setConstNumber(offset + 177, $col_026, value);
	}


	public MCNumber col_027() {
		return getConstNumber(offset + 178, $col_027);
	}

	public void col_027(MCNumber value) {
		setConstNumber(offset + 178, $col_027, value);
	}

	public void col_027(int value) {
		setConstNumber(offset + 178, $col_027, value);
	}

	public void col_027(long value) {
		setConstNumber(offset + 178, $col_027, value);
	}

	public void col_027(float value) {
		setConstNumber(offset + 178, $col_027, value);
	}

	public void col_027(double value) {
		setConstNumber(offset + 178, $col_027, value);
	}


	public MCNumber col_028() {
		return getConstNumber(offset + 179, $col_028);
	}

	public void col_028(MCNumber value) {
		setConstNumber(offset + 179, $col_028, value);
	}

	public void col_028(int value) {
		setConstNumber(offset + 179, $col_028, value);
	}

	public void col_028(long value) {
		setConstNumber(offset + 179, $col_028, value);
	}

	public void col_028(float value) {
		setConstNumber(offset + 179, $col_028, value);
	}

	public void col_028(double value) {
		setConstNumber(offset + 179, $col_028, value);
	}


	public MCNumber col_029() {
		return getConstNumber(offset + 180, $col_029);
	}

	public void col_029(MCNumber value) {
		setConstNumber(offset + 180, $col_029, value);
	}

	public void col_029(int value) {
		setConstNumber(offset + 180, $col_029, value);
	}

	public void col_029(long value) {
		setConstNumber(offset + 180, $col_029, value);
	}

	public void col_029(float value) {
		setConstNumber(offset + 180, $col_029, value);
	}

	public void col_029(double value) {
		setConstNumber(offset + 180, $col_029, value);
	}


	public MCNumber col_030() {
		return getConstNumber(offset + 181, $col_030);
	}

	public void col_030(MCNumber value) {
		setConstNumber(offset + 181, $col_030, value);
	}

	public void col_030(int value) {
		setConstNumber(offset + 181, $col_030, value);
	}

	public void col_030(long value) {
		setConstNumber(offset + 181, $col_030, value);
	}

	public void col_030(float value) {
		setConstNumber(offset + 181, $col_030, value);
	}

	public void col_030(double value) {
		setConstNumber(offset + 181, $col_030, value);
	}


	public MCNumber col_031() {
		return getConstNumber(offset + 182, $col_031);
	}

	public void col_031(MCNumber value) {
		setConstNumber(offset + 182, $col_031, value);
	}

	public void col_031(int value) {
		setConstNumber(offset + 182, $col_031, value);
	}

	public void col_031(long value) {
		setConstNumber(offset + 182, $col_031, value);
	}

	public void col_031(float value) {
		setConstNumber(offset + 182, $col_031, value);
	}

	public void col_031(double value) {
		setConstNumber(offset + 182, $col_031, value);
	}


	public MCNumber col_032() {
		return getConstNumber(offset + 183, $col_032);
	}

	public void col_032(MCNumber value) {
		setConstNumber(offset + 183, $col_032, value);
	}

	public void col_032(int value) {
		setConstNumber(offset + 183, $col_032, value);
	}

	public void col_032(long value) {
		setConstNumber(offset + 183, $col_032, value);
	}

	public void col_032(float value) {
		setConstNumber(offset + 183, $col_032, value);
	}

	public void col_032(double value) {
		setConstNumber(offset + 183, $col_032, value);
	}


	public MCNumber col_033() {
		return getConstNumber(offset + 184, $col_033);
	}

	public void col_033(MCNumber value) {
		setConstNumber(offset + 184, $col_033, value);
	}

	public void col_033(int value) {
		setConstNumber(offset + 184, $col_033, value);
	}

	public void col_033(long value) {
		setConstNumber(offset + 184, $col_033, value);
	}

	public void col_033(float value) {
		setConstNumber(offset + 184, $col_033, value);
	}

	public void col_033(double value) {
		setConstNumber(offset + 184, $col_033, value);
	}


	public MCNumber col_034() {
		return getConstNumber(offset + 185, $col_034);
	}

	public void col_034(MCNumber value) {
		setConstNumber(offset + 185, $col_034, value);
	}

	public void col_034(int value) {
		setConstNumber(offset + 185, $col_034, value);
	}

	public void col_034(long value) {
		setConstNumber(offset + 185, $col_034, value);
	}

	public void col_034(float value) {
		setConstNumber(offset + 185, $col_034, value);
	}

	public void col_034(double value) {
		setConstNumber(offset + 185, $col_034, value);
	}


	public MCNumber col_035() {
		return getConstNumber(offset + 186, $col_035);
	}

	public void col_035(MCNumber value) {
		setConstNumber(offset + 186, $col_035, value);
	}

	public void col_035(int value) {
		setConstNumber(offset + 186, $col_035, value);
	}

	public void col_035(long value) {
		setConstNumber(offset + 186, $col_035, value);
	}

	public void col_035(float value) {
		setConstNumber(offset + 186, $col_035, value);
	}

	public void col_035(double value) {
		setConstNumber(offset + 186, $col_035, value);
	}


	public MCNumber col_036() {
		return getConstNumber(offset + 187, $col_036);
	}

	public void col_036(MCNumber value) {
		setConstNumber(offset + 187, $col_036, value);
	}

	public void col_036(int value) {
		setConstNumber(offset + 187, $col_036, value);
	}

	public void col_036(long value) {
		setConstNumber(offset + 187, $col_036, value);
	}

	public void col_036(float value) {
		setConstNumber(offset + 187, $col_036, value);
	}

	public void col_036(double value) {
		setConstNumber(offset + 187, $col_036, value);
	}


	public MCNumber col_037() {
		return getConstNumber(offset + 188, $col_037);
	}

	public void col_037(MCNumber value) {
		setConstNumber(offset + 188, $col_037, value);
	}

	public void col_037(int value) {
		setConstNumber(offset + 188, $col_037, value);
	}

	public void col_037(long value) {
		setConstNumber(offset + 188, $col_037, value);
	}

	public void col_037(float value) {
		setConstNumber(offset + 188, $col_037, value);
	}

	public void col_037(double value) {
		setConstNumber(offset + 188, $col_037, value);
	}


	public MCNumber col_038() {
		return getConstNumber(offset + 189, $col_038);
	}

	public void col_038(MCNumber value) {
		setConstNumber(offset + 189, $col_038, value);
	}

	public void col_038(int value) {
		setConstNumber(offset + 189, $col_038, value);
	}

	public void col_038(long value) {
		setConstNumber(offset + 189, $col_038, value);
	}

	public void col_038(float value) {
		setConstNumber(offset + 189, $col_038, value);
	}

	public void col_038(double value) {
		setConstNumber(offset + 189, $col_038, value);
	}


	public MCNumber col_039() {
		return getConstNumber(offset + 190, $col_039);
	}

	public void col_039(MCNumber value) {
		setConstNumber(offset + 190, $col_039, value);
	}

	public void col_039(int value) {
		setConstNumber(offset + 190, $col_039, value);
	}

	public void col_039(long value) {
		setConstNumber(offset + 190, $col_039, value);
	}

	public void col_039(float value) {
		setConstNumber(offset + 190, $col_039, value);
	}

	public void col_039(double value) {
		setConstNumber(offset + 190, $col_039, value);
	}


	public MCNumber col_040() {
		return getConstNumber(offset + 191, $col_040);
	}

	public void col_040(MCNumber value) {
		setConstNumber(offset + 191, $col_040, value);
	}

	public void col_040(int value) {
		setConstNumber(offset + 191, $col_040, value);
	}

	public void col_040(long value) {
		setConstNumber(offset + 191, $col_040, value);
	}

	public void col_040(float value) {
		setConstNumber(offset + 191, $col_040, value);
	}

	public void col_040(double value) {
		setConstNumber(offset + 191, $col_040, value);
	}


	public MCNumber col_041() {
		return getConstNumber(offset + 192, $col_041);
	}

	public void col_041(MCNumber value) {
		setConstNumber(offset + 192, $col_041, value);
	}

	public void col_041(int value) {
		setConstNumber(offset + 192, $col_041, value);
	}

	public void col_041(long value) {
		setConstNumber(offset + 192, $col_041, value);
	}

	public void col_041(float value) {
		setConstNumber(offset + 192, $col_041, value);
	}

	public void col_041(double value) {
		setConstNumber(offset + 192, $col_041, value);
	}


	public MCNumber col_042() {
		return getConstNumber(offset + 193, $col_042);
	}

	public void col_042(MCNumber value) {
		setConstNumber(offset + 193, $col_042, value);
	}

	public void col_042(int value) {
		setConstNumber(offset + 193, $col_042, value);
	}

	public void col_042(long value) {
		setConstNumber(offset + 193, $col_042, value);
	}

	public void col_042(float value) {
		setConstNumber(offset + 193, $col_042, value);
	}

	public void col_042(double value) {
		setConstNumber(offset + 193, $col_042, value);
	}


	public MCNumber col_043() {
		return getConstNumber(offset + 194, $col_043);
	}

	public void col_043(MCNumber value) {
		setConstNumber(offset + 194, $col_043, value);
	}

	public void col_043(int value) {
		setConstNumber(offset + 194, $col_043, value);
	}

	public void col_043(long value) {
		setConstNumber(offset + 194, $col_043, value);
	}

	public void col_043(float value) {
		setConstNumber(offset + 194, $col_043, value);
	}

	public void col_043(double value) {
		setConstNumber(offset + 194, $col_043, value);
	}


	public MCNumber col_044() {
		return getConstNumber(offset + 195, $col_044);
	}

	public void col_044(MCNumber value) {
		setConstNumber(offset + 195, $col_044, value);
	}

	public void col_044(int value) {
		setConstNumber(offset + 195, $col_044, value);
	}

	public void col_044(long value) {
		setConstNumber(offset + 195, $col_044, value);
	}

	public void col_044(float value) {
		setConstNumber(offset + 195, $col_044, value);
	}

	public void col_044(double value) {
		setConstNumber(offset + 195, $col_044, value);
	}


	public MCNumber col_045() {
		return getConstNumber(offset + 196, $col_045);
	}

	public void col_045(MCNumber value) {
		setConstNumber(offset + 196, $col_045, value);
	}

	public void col_045(int value) {
		setConstNumber(offset + 196, $col_045, value);
	}

	public void col_045(long value) {
		setConstNumber(offset + 196, $col_045, value);
	}

	public void col_045(float value) {
		setConstNumber(offset + 196, $col_045, value);
	}

	public void col_045(double value) {
		setConstNumber(offset + 196, $col_045, value);
	}


	public MCNumber col_046() {
		return getConstNumber(offset + 197, $col_046);
	}

	public void col_046(MCNumber value) {
		setConstNumber(offset + 197, $col_046, value);
	}

	public void col_046(int value) {
		setConstNumber(offset + 197, $col_046, value);
	}

	public void col_046(long value) {
		setConstNumber(offset + 197, $col_046, value);
	}

	public void col_046(float value) {
		setConstNumber(offset + 197, $col_046, value);
	}

	public void col_046(double value) {
		setConstNumber(offset + 197, $col_046, value);
	}


	public MCNumber col_047() {
		return getConstNumber(offset + 198, $col_047);
	}

	public void col_047(MCNumber value) {
		setConstNumber(offset + 198, $col_047, value);
	}

	public void col_047(int value) {
		setConstNumber(offset + 198, $col_047, value);
	}

	public void col_047(long value) {
		setConstNumber(offset + 198, $col_047, value);
	}

	public void col_047(float value) {
		setConstNumber(offset + 198, $col_047, value);
	}

	public void col_047(double value) {
		setConstNumber(offset + 198, $col_047, value);
	}


	public MCNumber col_048() {
		return getConstNumber(offset + 199, $col_048);
	}

	public void col_048(MCNumber value) {
		setConstNumber(offset + 199, $col_048, value);
	}

	public void col_048(int value) {
		setConstNumber(offset + 199, $col_048, value);
	}

	public void col_048(long value) {
		setConstNumber(offset + 199, $col_048, value);
	}

	public void col_048(float value) {
		setConstNumber(offset + 199, $col_048, value);
	}

	public void col_048(double value) {
		setConstNumber(offset + 199, $col_048, value);
	}


	public MCNumber col_049() {
		return getConstNumber(offset + 200, $col_049);
	}

	public void col_049(MCNumber value) {
		setConstNumber(offset + 200, $col_049, value);
	}

	public void col_049(int value) {
		setConstNumber(offset + 200, $col_049, value);
	}

	public void col_049(long value) {
		setConstNumber(offset + 200, $col_049, value);
	}

	public void col_049(float value) {
		setConstNumber(offset + 200, $col_049, value);
	}

	public void col_049(double value) {
		setConstNumber(offset + 200, $col_049, value);
	}


	public MCNumber col_050() {
		return getConstNumber(offset + 201, $col_050);
	}

	public void col_050(MCNumber value) {
		setConstNumber(offset + 201, $col_050, value);
	}

	public void col_050(int value) {
		setConstNumber(offset + 201, $col_050, value);
	}

	public void col_050(long value) {
		setConstNumber(offset + 201, $col_050, value);
	}

	public void col_050(float value) {
		setConstNumber(offset + 201, $col_050, value);
	}

	public void col_050(double value) {
		setConstNumber(offset + 201, $col_050, value);
	}


	public MCNumber col_051() {
		return getConstNumber(offset + 202, $col_051);
	}

	public void col_051(MCNumber value) {
		setConstNumber(offset + 202, $col_051, value);
	}

	public void col_051(int value) {
		setConstNumber(offset + 202, $col_051, value);
	}

	public void col_051(long value) {
		setConstNumber(offset + 202, $col_051, value);
	}

	public void col_051(float value) {
		setConstNumber(offset + 202, $col_051, value);
	}

	public void col_051(double value) {
		setConstNumber(offset + 202, $col_051, value);
	}


	public MCNumber col_052() {
		return getConstNumber(offset + 203, $col_052);
	}

	public void col_052(MCNumber value) {
		setConstNumber(offset + 203, $col_052, value);
	}

	public void col_052(int value) {
		setConstNumber(offset + 203, $col_052, value);
	}

	public void col_052(long value) {
		setConstNumber(offset + 203, $col_052, value);
	}

	public void col_052(float value) {
		setConstNumber(offset + 203, $col_052, value);
	}

	public void col_052(double value) {
		setConstNumber(offset + 203, $col_052, value);
	}


	public MCNumber col_053() {
		return getConstNumber(offset + 204, $col_053);
	}

	public void col_053(MCNumber value) {
		setConstNumber(offset + 204, $col_053, value);
	}

	public void col_053(int value) {
		setConstNumber(offset + 204, $col_053, value);
	}

	public void col_053(long value) {
		setConstNumber(offset + 204, $col_053, value);
	}

	public void col_053(float value) {
		setConstNumber(offset + 204, $col_053, value);
	}

	public void col_053(double value) {
		setConstNumber(offset + 204, $col_053, value);
	}


	public MCNumber col_054() {
		return getConstNumber(offset + 205, $col_054);
	}

	public void col_054(MCNumber value) {
		setConstNumber(offset + 205, $col_054, value);
	}

	public void col_054(int value) {
		setConstNumber(offset + 205, $col_054, value);
	}

	public void col_054(long value) {
		setConstNumber(offset + 205, $col_054, value);
	}

	public void col_054(float value) {
		setConstNumber(offset + 205, $col_054, value);
	}

	public void col_054(double value) {
		setConstNumber(offset + 205, $col_054, value);
	}


	public MCNumber col_055() {
		return getConstNumber(offset + 206, $col_055);
	}

	public void col_055(MCNumber value) {
		setConstNumber(offset + 206, $col_055, value);
	}

	public void col_055(int value) {
		setConstNumber(offset + 206, $col_055, value);
	}

	public void col_055(long value) {
		setConstNumber(offset + 206, $col_055, value);
	}

	public void col_055(float value) {
		setConstNumber(offset + 206, $col_055, value);
	}

	public void col_055(double value) {
		setConstNumber(offset + 206, $col_055, value);
	}


	public MCNumber col_056() {
		return getConstNumber(offset + 207, $col_056);
	}

	public void col_056(MCNumber value) {
		setConstNumber(offset + 207, $col_056, value);
	}

	public void col_056(int value) {
		setConstNumber(offset + 207, $col_056, value);
	}

	public void col_056(long value) {
		setConstNumber(offset + 207, $col_056, value);
	}

	public void col_056(float value) {
		setConstNumber(offset + 207, $col_056, value);
	}

	public void col_056(double value) {
		setConstNumber(offset + 207, $col_056, value);
	}


	public MCNumber col_057() {
		return getConstNumber(offset + 208, $col_057);
	}

	public void col_057(MCNumber value) {
		setConstNumber(offset + 208, $col_057, value);
	}

	public void col_057(int value) {
		setConstNumber(offset + 208, $col_057, value);
	}

	public void col_057(long value) {
		setConstNumber(offset + 208, $col_057, value);
	}

	public void col_057(float value) {
		setConstNumber(offset + 208, $col_057, value);
	}

	public void col_057(double value) {
		setConstNumber(offset + 208, $col_057, value);
	}


	public MCNumber col_058() {
		return getConstNumber(offset + 209, $col_058);
	}

	public void col_058(MCNumber value) {
		setConstNumber(offset + 209, $col_058, value);
	}

	public void col_058(int value) {
		setConstNumber(offset + 209, $col_058, value);
	}

	public void col_058(long value) {
		setConstNumber(offset + 209, $col_058, value);
	}

	public void col_058(float value) {
		setConstNumber(offset + 209, $col_058, value);
	}

	public void col_058(double value) {
		setConstNumber(offset + 209, $col_058, value);
	}


	public MCNumber col_059() {
		return getConstNumber(offset + 210, $col_059);
	}

	public void col_059(MCNumber value) {
		setConstNumber(offset + 210, $col_059, value);
	}

	public void col_059(int value) {
		setConstNumber(offset + 210, $col_059, value);
	}

	public void col_059(long value) {
		setConstNumber(offset + 210, $col_059, value);
	}

	public void col_059(float value) {
		setConstNumber(offset + 210, $col_059, value);
	}

	public void col_059(double value) {
		setConstNumber(offset + 210, $col_059, value);
	}


	public MCNumber col_060() {
		return getConstNumber(offset + 211, $col_060);
	}

	public void col_060(MCNumber value) {
		setConstNumber(offset + 211, $col_060, value);
	}

	public void col_060(int value) {
		setConstNumber(offset + 211, $col_060, value);
	}

	public void col_060(long value) {
		setConstNumber(offset + 211, $col_060, value);
	}

	public void col_060(float value) {
		setConstNumber(offset + 211, $col_060, value);
	}

	public void col_060(double value) {
		setConstNumber(offset + 211, $col_060, value);
	}


	public MCNumber col_061() {
		return getConstNumber(offset + 212, $col_061);
	}

	public void col_061(MCNumber value) {
		setConstNumber(offset + 212, $col_061, value);
	}

	public void col_061(int value) {
		setConstNumber(offset + 212, $col_061, value);
	}

	public void col_061(long value) {
		setConstNumber(offset + 212, $col_061, value);
	}

	public void col_061(float value) {
		setConstNumber(offset + 212, $col_061, value);
	}

	public void col_061(double value) {
		setConstNumber(offset + 212, $col_061, value);
	}


	public MCNumber col_062() {
		return getConstNumber(offset + 213, $col_062);
	}

	public void col_062(MCNumber value) {
		setConstNumber(offset + 213, $col_062, value);
	}

	public void col_062(int value) {
		setConstNumber(offset + 213, $col_062, value);
	}

	public void col_062(long value) {
		setConstNumber(offset + 213, $col_062, value);
	}

	public void col_062(float value) {
		setConstNumber(offset + 213, $col_062, value);
	}

	public void col_062(double value) {
		setConstNumber(offset + 213, $col_062, value);
	}


	public MCNumber col_063() {
		return getConstNumber(offset + 214, $col_063);
	}

	public void col_063(MCNumber value) {
		setConstNumber(offset + 214, $col_063, value);
	}

	public void col_063(int value) {
		setConstNumber(offset + 214, $col_063, value);
	}

	public void col_063(long value) {
		setConstNumber(offset + 214, $col_063, value);
	}

	public void col_063(float value) {
		setConstNumber(offset + 214, $col_063, value);
	}

	public void col_063(double value) {
		setConstNumber(offset + 214, $col_063, value);
	}


	public MCNumber col_064() {
		return getConstNumber(offset + 215, $col_064);
	}

	public void col_064(MCNumber value) {
		setConstNumber(offset + 215, $col_064, value);
	}

	public void col_064(int value) {
		setConstNumber(offset + 215, $col_064, value);
	}

	public void col_064(long value) {
		setConstNumber(offset + 215, $col_064, value);
	}

	public void col_064(float value) {
		setConstNumber(offset + 215, $col_064, value);
	}

	public void col_064(double value) {
		setConstNumber(offset + 215, $col_064, value);
	}


	public MCNumber col_065() {
		return getConstNumber(offset + 216, $col_065);
	}

	public void col_065(MCNumber value) {
		setConstNumber(offset + 216, $col_065, value);
	}

	public void col_065(int value) {
		setConstNumber(offset + 216, $col_065, value);
	}

	public void col_065(long value) {
		setConstNumber(offset + 216, $col_065, value);
	}

	public void col_065(float value) {
		setConstNumber(offset + 216, $col_065, value);
	}

	public void col_065(double value) {
		setConstNumber(offset + 216, $col_065, value);
	}


	public MCNumber col_066() {
		return getConstNumber(offset + 217, $col_066);
	}

	public void col_066(MCNumber value) {
		setConstNumber(offset + 217, $col_066, value);
	}

	public void col_066(int value) {
		setConstNumber(offset + 217, $col_066, value);
	}

	public void col_066(long value) {
		setConstNumber(offset + 217, $col_066, value);
	}

	public void col_066(float value) {
		setConstNumber(offset + 217, $col_066, value);
	}

	public void col_066(double value) {
		setConstNumber(offset + 217, $col_066, value);
	}


	public MCNumber col_067() {
		return getConstNumber(offset + 218, $col_067);
	}

	public void col_067(MCNumber value) {
		setConstNumber(offset + 218, $col_067, value);
	}

	public void col_067(int value) {
		setConstNumber(offset + 218, $col_067, value);
	}

	public void col_067(long value) {
		setConstNumber(offset + 218, $col_067, value);
	}

	public void col_067(float value) {
		setConstNumber(offset + 218, $col_067, value);
	}

	public void col_067(double value) {
		setConstNumber(offset + 218, $col_067, value);
	}


	public MCNumber col_068() {
		return getConstNumber(offset + 219, $col_068);
	}

	public void col_068(MCNumber value) {
		setConstNumber(offset + 219, $col_068, value);
	}

	public void col_068(int value) {
		setConstNumber(offset + 219, $col_068, value);
	}

	public void col_068(long value) {
		setConstNumber(offset + 219, $col_068, value);
	}

	public void col_068(float value) {
		setConstNumber(offset + 219, $col_068, value);
	}

	public void col_068(double value) {
		setConstNumber(offset + 219, $col_068, value);
	}


	public MCNumber col_069() {
		return getConstNumber(offset + 220, $col_069);
	}

	public void col_069(MCNumber value) {
		setConstNumber(offset + 220, $col_069, value);
	}

	public void col_069(int value) {
		setConstNumber(offset + 220, $col_069, value);
	}

	public void col_069(long value) {
		setConstNumber(offset + 220, $col_069, value);
	}

	public void col_069(float value) {
		setConstNumber(offset + 220, $col_069, value);
	}

	public void col_069(double value) {
		setConstNumber(offset + 220, $col_069, value);
	}


	public MCNumber col_070() {
		return getConstNumber(offset + 221, $col_070);
	}

	public void col_070(MCNumber value) {
		setConstNumber(offset + 221, $col_070, value);
	}

	public void col_070(int value) {
		setConstNumber(offset + 221, $col_070, value);
	}

	public void col_070(long value) {
		setConstNumber(offset + 221, $col_070, value);
	}

	public void col_070(float value) {
		setConstNumber(offset + 221, $col_070, value);
	}

	public void col_070(double value) {
		setConstNumber(offset + 221, $col_070, value);
	}


	public MCNumber col_071() {
		return getConstNumber(offset + 222, $col_071);
	}

	public void col_071(MCNumber value) {
		setConstNumber(offset + 222, $col_071, value);
	}

	public void col_071(int value) {
		setConstNumber(offset + 222, $col_071, value);
	}

	public void col_071(long value) {
		setConstNumber(offset + 222, $col_071, value);
	}

	public void col_071(float value) {
		setConstNumber(offset + 222, $col_071, value);
	}

	public void col_071(double value) {
		setConstNumber(offset + 222, $col_071, value);
	}


	public MCNumber col_072() {
		return getConstNumber(offset + 223, $col_072);
	}

	public void col_072(MCNumber value) {
		setConstNumber(offset + 223, $col_072, value);
	}

	public void col_072(int value) {
		setConstNumber(offset + 223, $col_072, value);
	}

	public void col_072(long value) {
		setConstNumber(offset + 223, $col_072, value);
	}

	public void col_072(float value) {
		setConstNumber(offset + 223, $col_072, value);
	}

	public void col_072(double value) {
		setConstNumber(offset + 223, $col_072, value);
	}


	public MCNumber col_073() {
		return getConstNumber(offset + 224, $col_073);
	}

	public void col_073(MCNumber value) {
		setConstNumber(offset + 224, $col_073, value);
	}

	public void col_073(int value) {
		setConstNumber(offset + 224, $col_073, value);
	}

	public void col_073(long value) {
		setConstNumber(offset + 224, $col_073, value);
	}

	public void col_073(float value) {
		setConstNumber(offset + 224, $col_073, value);
	}

	public void col_073(double value) {
		setConstNumber(offset + 224, $col_073, value);
	}


	public MCNumber col_074() {
		return getConstNumber(offset + 225, $col_074);
	}

	public void col_074(MCNumber value) {
		setConstNumber(offset + 225, $col_074, value);
	}

	public void col_074(int value) {
		setConstNumber(offset + 225, $col_074, value);
	}

	public void col_074(long value) {
		setConstNumber(offset + 225, $col_074, value);
	}

	public void col_074(float value) {
		setConstNumber(offset + 225, $col_074, value);
	}

	public void col_074(double value) {
		setConstNumber(offset + 225, $col_074, value);
	}


	public MCNumber col_075() {
		return getConstNumber(offset + 226, $col_075);
	}

	public void col_075(MCNumber value) {
		setConstNumber(offset + 226, $col_075, value);
	}

	public void col_075(int value) {
		setConstNumber(offset + 226, $col_075, value);
	}

	public void col_075(long value) {
		setConstNumber(offset + 226, $col_075, value);
	}

	public void col_075(float value) {
		setConstNumber(offset + 226, $col_075, value);
	}

	public void col_075(double value) {
		setConstNumber(offset + 226, $col_075, value);
	}


	public MCNumber col_076() {
		return getConstNumber(offset + 227, $col_076);
	}

	public void col_076(MCNumber value) {
		setConstNumber(offset + 227, $col_076, value);
	}

	public void col_076(int value) {
		setConstNumber(offset + 227, $col_076, value);
	}

	public void col_076(long value) {
		setConstNumber(offset + 227, $col_076, value);
	}

	public void col_076(float value) {
		setConstNumber(offset + 227, $col_076, value);
	}

	public void col_076(double value) {
		setConstNumber(offset + 227, $col_076, value);
	}


	public MCNumber col_077() {
		return getConstNumber(offset + 228, $col_077);
	}

	public void col_077(MCNumber value) {
		setConstNumber(offset + 228, $col_077, value);
	}

	public void col_077(int value) {
		setConstNumber(offset + 228, $col_077, value);
	}

	public void col_077(long value) {
		setConstNumber(offset + 228, $col_077, value);
	}

	public void col_077(float value) {
		setConstNumber(offset + 228, $col_077, value);
	}

	public void col_077(double value) {
		setConstNumber(offset + 228, $col_077, value);
	}


	public MCNumber col_078() {
		return getConstNumber(offset + 229, $col_078);
	}

	public void col_078(MCNumber value) {
		setConstNumber(offset + 229, $col_078, value);
	}

	public void col_078(int value) {
		setConstNumber(offset + 229, $col_078, value);
	}

	public void col_078(long value) {
		setConstNumber(offset + 229, $col_078, value);
	}

	public void col_078(float value) {
		setConstNumber(offset + 229, $col_078, value);
	}

	public void col_078(double value) {
		setConstNumber(offset + 229, $col_078, value);
	}


	public MCNumber col_079() {
		return getConstNumber(offset + 230, $col_079);
	}

	public void col_079(MCNumber value) {
		setConstNumber(offset + 230, $col_079, value);
	}

	public void col_079(int value) {
		setConstNumber(offset + 230, $col_079, value);
	}

	public void col_079(long value) {
		setConstNumber(offset + 230, $col_079, value);
	}

	public void col_079(float value) {
		setConstNumber(offset + 230, $col_079, value);
	}

	public void col_079(double value) {
		setConstNumber(offset + 230, $col_079, value);
	}


	public MCNumber col_080() {
		return getConstNumber(offset + 231, $col_080);
	}

	public void col_080(MCNumber value) {
		setConstNumber(offset + 231, $col_080, value);
	}

	public void col_080(int value) {
		setConstNumber(offset + 231, $col_080, value);
	}

	public void col_080(long value) {
		setConstNumber(offset + 231, $col_080, value);
	}

	public void col_080(float value) {
		setConstNumber(offset + 231, $col_080, value);
	}

	public void col_080(double value) {
		setConstNumber(offset + 231, $col_080, value);
	}


	public MCNumber col_081() {
		return getConstNumber(offset + 232, $col_081);
	}

	public void col_081(MCNumber value) {
		setConstNumber(offset + 232, $col_081, value);
	}

	public void col_081(int value) {
		setConstNumber(offset + 232, $col_081, value);
	}

	public void col_081(long value) {
		setConstNumber(offset + 232, $col_081, value);
	}

	public void col_081(float value) {
		setConstNumber(offset + 232, $col_081, value);
	}

	public void col_081(double value) {
		setConstNumber(offset + 232, $col_081, value);
	}


	public MCNumber col_082() {
		return getConstNumber(offset + 233, $col_082);
	}

	public void col_082(MCNumber value) {
		setConstNumber(offset + 233, $col_082, value);
	}

	public void col_082(int value) {
		setConstNumber(offset + 233, $col_082, value);
	}

	public void col_082(long value) {
		setConstNumber(offset + 233, $col_082, value);
	}

	public void col_082(float value) {
		setConstNumber(offset + 233, $col_082, value);
	}

	public void col_082(double value) {
		setConstNumber(offset + 233, $col_082, value);
	}


	public MCNumber col_083() {
		return getConstNumber(offset + 234, $col_083);
	}

	public void col_083(MCNumber value) {
		setConstNumber(offset + 234, $col_083, value);
	}

	public void col_083(int value) {
		setConstNumber(offset + 234, $col_083, value);
	}

	public void col_083(long value) {
		setConstNumber(offset + 234, $col_083, value);
	}

	public void col_083(float value) {
		setConstNumber(offset + 234, $col_083, value);
	}

	public void col_083(double value) {
		setConstNumber(offset + 234, $col_083, value);
	}


	public MCNumber col_084() {
		return getConstNumber(offset + 235, $col_084);
	}

	public void col_084(MCNumber value) {
		setConstNumber(offset + 235, $col_084, value);
	}

	public void col_084(int value) {
		setConstNumber(offset + 235, $col_084, value);
	}

	public void col_084(long value) {
		setConstNumber(offset + 235, $col_084, value);
	}

	public void col_084(float value) {
		setConstNumber(offset + 235, $col_084, value);
	}

	public void col_084(double value) {
		setConstNumber(offset + 235, $col_084, value);
	}


	public MCNumber col_085() {
		return getConstNumber(offset + 236, $col_085);
	}

	public void col_085(MCNumber value) {
		setConstNumber(offset + 236, $col_085, value);
	}

	public void col_085(int value) {
		setConstNumber(offset + 236, $col_085, value);
	}

	public void col_085(long value) {
		setConstNumber(offset + 236, $col_085, value);
	}

	public void col_085(float value) {
		setConstNumber(offset + 236, $col_085, value);
	}

	public void col_085(double value) {
		setConstNumber(offset + 236, $col_085, value);
	}


	public MCNumber col_086() {
		return getConstNumber(offset + 237, $col_086);
	}

	public void col_086(MCNumber value) {
		setConstNumber(offset + 237, $col_086, value);
	}

	public void col_086(int value) {
		setConstNumber(offset + 237, $col_086, value);
	}

	public void col_086(long value) {
		setConstNumber(offset + 237, $col_086, value);
	}

	public void col_086(float value) {
		setConstNumber(offset + 237, $col_086, value);
	}

	public void col_086(double value) {
		setConstNumber(offset + 237, $col_086, value);
	}


	public MCNumber col_087() {
		return getConstNumber(offset + 238, $col_087);
	}

	public void col_087(MCNumber value) {
		setConstNumber(offset + 238, $col_087, value);
	}

	public void col_087(int value) {
		setConstNumber(offset + 238, $col_087, value);
	}

	public void col_087(long value) {
		setConstNumber(offset + 238, $col_087, value);
	}

	public void col_087(float value) {
		setConstNumber(offset + 238, $col_087, value);
	}

	public void col_087(double value) {
		setConstNumber(offset + 238, $col_087, value);
	}


	public MCNumber col_088() {
		return getConstNumber(offset + 239, $col_088);
	}

	public void col_088(MCNumber value) {
		setConstNumber(offset + 239, $col_088, value);
	}

	public void col_088(int value) {
		setConstNumber(offset + 239, $col_088, value);
	}

	public void col_088(long value) {
		setConstNumber(offset + 239, $col_088, value);
	}

	public void col_088(float value) {
		setConstNumber(offset + 239, $col_088, value);
	}

	public void col_088(double value) {
		setConstNumber(offset + 239, $col_088, value);
	}


	public MCNumber col_089() {
		return getConstNumber(offset + 240, $col_089);
	}

	public void col_089(MCNumber value) {
		setConstNumber(offset + 240, $col_089, value);
	}

	public void col_089(int value) {
		setConstNumber(offset + 240, $col_089, value);
	}

	public void col_089(long value) {
		setConstNumber(offset + 240, $col_089, value);
	}

	public void col_089(float value) {
		setConstNumber(offset + 240, $col_089, value);
	}

	public void col_089(double value) {
		setConstNumber(offset + 240, $col_089, value);
	}


	public MCNumber col_090() {
		return getConstNumber(offset + 241, $col_090);
	}

	public void col_090(MCNumber value) {
		setConstNumber(offset + 241, $col_090, value);
	}

	public void col_090(int value) {
		setConstNumber(offset + 241, $col_090, value);
	}

	public void col_090(long value) {
		setConstNumber(offset + 241, $col_090, value);
	}

	public void col_090(float value) {
		setConstNumber(offset + 241, $col_090, value);
	}

	public void col_090(double value) {
		setConstNumber(offset + 241, $col_090, value);
	}


	public MCNumber col_091() {
		return getConstNumber(offset + 242, $col_091);
	}

	public void col_091(MCNumber value) {
		setConstNumber(offset + 242, $col_091, value);
	}

	public void col_091(int value) {
		setConstNumber(offset + 242, $col_091, value);
	}

	public void col_091(long value) {
		setConstNumber(offset + 242, $col_091, value);
	}

	public void col_091(float value) {
		setConstNumber(offset + 242, $col_091, value);
	}

	public void col_091(double value) {
		setConstNumber(offset + 242, $col_091, value);
	}


	public MCNumber col_092() {
		return getConstNumber(offset + 243, $col_092);
	}

	public void col_092(MCNumber value) {
		setConstNumber(offset + 243, $col_092, value);
	}

	public void col_092(int value) {
		setConstNumber(offset + 243, $col_092, value);
	}

	public void col_092(long value) {
		setConstNumber(offset + 243, $col_092, value);
	}

	public void col_092(float value) {
		setConstNumber(offset + 243, $col_092, value);
	}

	public void col_092(double value) {
		setConstNumber(offset + 243, $col_092, value);
	}


	public MCNumber col_093() {
		return getConstNumber(offset + 244, $col_093);
	}

	public void col_093(MCNumber value) {
		setConstNumber(offset + 244, $col_093, value);
	}

	public void col_093(int value) {
		setConstNumber(offset + 244, $col_093, value);
	}

	public void col_093(long value) {
		setConstNumber(offset + 244, $col_093, value);
	}

	public void col_093(float value) {
		setConstNumber(offset + 244, $col_093, value);
	}

	public void col_093(double value) {
		setConstNumber(offset + 244, $col_093, value);
	}


	public MCNumber col_094() {
		return getConstNumber(offset + 245, $col_094);
	}

	public void col_094(MCNumber value) {
		setConstNumber(offset + 245, $col_094, value);
	}

	public void col_094(int value) {
		setConstNumber(offset + 245, $col_094, value);
	}

	public void col_094(long value) {
		setConstNumber(offset + 245, $col_094, value);
	}

	public void col_094(float value) {
		setConstNumber(offset + 245, $col_094, value);
	}

	public void col_094(double value) {
		setConstNumber(offset + 245, $col_094, value);
	}


	public MCNumber col_095() {
		return getConstNumber(offset + 246, $col_095);
	}

	public void col_095(MCNumber value) {
		setConstNumber(offset + 246, $col_095, value);
	}

	public void col_095(int value) {
		setConstNumber(offset + 246, $col_095, value);
	}

	public void col_095(long value) {
		setConstNumber(offset + 246, $col_095, value);
	}

	public void col_095(float value) {
		setConstNumber(offset + 246, $col_095, value);
	}

	public void col_095(double value) {
		setConstNumber(offset + 246, $col_095, value);
	}


	public MCNumber col_096() {
		return getConstNumber(offset + 247, $col_096);
	}

	public void col_096(MCNumber value) {
		setConstNumber(offset + 247, $col_096, value);
	}

	public void col_096(int value) {
		setConstNumber(offset + 247, $col_096, value);
	}

	public void col_096(long value) {
		setConstNumber(offset + 247, $col_096, value);
	}

	public void col_096(float value) {
		setConstNumber(offset + 247, $col_096, value);
	}

	public void col_096(double value) {
		setConstNumber(offset + 247, $col_096, value);
	}


	public MCNumber col_097() {
		return getConstNumber(offset + 248, $col_097);
	}

	public void col_097(MCNumber value) {
		setConstNumber(offset + 248, $col_097, value);
	}

	public void col_097(int value) {
		setConstNumber(offset + 248, $col_097, value);
	}

	public void col_097(long value) {
		setConstNumber(offset + 248, $col_097, value);
	}

	public void col_097(float value) {
		setConstNumber(offset + 248, $col_097, value);
	}

	public void col_097(double value) {
		setConstNumber(offset + 248, $col_097, value);
	}


	public MCNumber col_098() {
		return getConstNumber(offset + 249, $col_098);
	}

	public void col_098(MCNumber value) {
		setConstNumber(offset + 249, $col_098, value);
	}

	public void col_098(int value) {
		setConstNumber(offset + 249, $col_098, value);
	}

	public void col_098(long value) {
		setConstNumber(offset + 249, $col_098, value);
	}

	public void col_098(float value) {
		setConstNumber(offset + 249, $col_098, value);
	}

	public void col_098(double value) {
		setConstNumber(offset + 249, $col_098, value);
	}


	public MCNumber col_099() {
		return getConstNumber(offset + 250, $col_099);
	}

	public void col_099(MCNumber value) {
		setConstNumber(offset + 250, $col_099, value);
	}

	public void col_099(int value) {
		setConstNumber(offset + 250, $col_099, value);
	}

	public void col_099(long value) {
		setConstNumber(offset + 250, $col_099, value);
	}

	public void col_099(float value) {
		setConstNumber(offset + 250, $col_099, value);
	}

	public void col_099(double value) {
		setConstNumber(offset + 250, $col_099, value);
	}


	public MCNumber col_100() {
		return getConstNumber(offset + 251, $col_100);
	}

	public void col_100(MCNumber value) {
		setConstNumber(offset + 251, $col_100, value);
	}

	public void col_100(int value) {
		setConstNumber(offset + 251, $col_100, value);
	}

	public void col_100(long value) {
		setConstNumber(offset + 251, $col_100, value);
	}

	public void col_100(float value) {
		setConstNumber(offset + 251, $col_100, value);
	}

	public void col_100(double value) {
		setConstNumber(offset + 251, $col_100, value);
	}


	public MCNumber col_101() {
		return getConstNumber(offset + 252, $col_101);
	}

	public void col_101(MCNumber value) {
		setConstNumber(offset + 252, $col_101, value);
	}

	public void col_101(int value) {
		setConstNumber(offset + 252, $col_101, value);
	}

	public void col_101(long value) {
		setConstNumber(offset + 252, $col_101, value);
	}

	public void col_101(float value) {
		setConstNumber(offset + 252, $col_101, value);
	}

	public void col_101(double value) {
		setConstNumber(offset + 252, $col_101, value);
	}


	public MCNumber col_102() {
		return getConstNumber(offset + 253, $col_102);
	}

	public void col_102(MCNumber value) {
		setConstNumber(offset + 253, $col_102, value);
	}

	public void col_102(int value) {
		setConstNumber(offset + 253, $col_102, value);
	}

	public void col_102(long value) {
		setConstNumber(offset + 253, $col_102, value);
	}

	public void col_102(float value) {
		setConstNumber(offset + 253, $col_102, value);
	}

	public void col_102(double value) {
		setConstNumber(offset + 253, $col_102, value);
	}


	public MCNumber col_103() {
		return getConstNumber(offset + 254, $col_103);
	}

	public void col_103(MCNumber value) {
		setConstNumber(offset + 254, $col_103, value);
	}

	public void col_103(int value) {
		setConstNumber(offset + 254, $col_103, value);
	}

	public void col_103(long value) {
		setConstNumber(offset + 254, $col_103, value);
	}

	public void col_103(float value) {
		setConstNumber(offset + 254, $col_103, value);
	}

	public void col_103(double value) {
		setConstNumber(offset + 254, $col_103, value);
	}


	public MCNumber col_104() {
		return getConstNumber(offset + 255, $col_104);
	}

	public void col_104(MCNumber value) {
		setConstNumber(offset + 255, $col_104, value);
	}

	public void col_104(int value) {
		setConstNumber(offset + 255, $col_104, value);
	}

	public void col_104(long value) {
		setConstNumber(offset + 255, $col_104, value);
	}

	public void col_104(float value) {
		setConstNumber(offset + 255, $col_104, value);
	}

	public void col_104(double value) {
		setConstNumber(offset + 255, $col_104, value);
	}


	public MCNumber col_105() {
		return getConstNumber(offset + 256, $col_105);
	}

	public void col_105(MCNumber value) {
		setConstNumber(offset + 256, $col_105, value);
	}

	public void col_105(int value) {
		setConstNumber(offset + 256, $col_105, value);
	}

	public void col_105(long value) {
		setConstNumber(offset + 256, $col_105, value);
	}

	public void col_105(float value) {
		setConstNumber(offset + 256, $col_105, value);
	}

	public void col_105(double value) {
		setConstNumber(offset + 256, $col_105, value);
	}


	public MCNumber col_106() {
		return getConstNumber(offset + 257, $col_106);
	}

	public void col_106(MCNumber value) {
		setConstNumber(offset + 257, $col_106, value);
	}

	public void col_106(int value) {
		setConstNumber(offset + 257, $col_106, value);
	}

	public void col_106(long value) {
		setConstNumber(offset + 257, $col_106, value);
	}

	public void col_106(float value) {
		setConstNumber(offset + 257, $col_106, value);
	}

	public void col_106(double value) {
		setConstNumber(offset + 257, $col_106, value);
	}


	public MCNumber col_107() {
		return getConstNumber(offset + 258, $col_107);
	}

	public void col_107(MCNumber value) {
		setConstNumber(offset + 258, $col_107, value);
	}

	public void col_107(int value) {
		setConstNumber(offset + 258, $col_107, value);
	}

	public void col_107(long value) {
		setConstNumber(offset + 258, $col_107, value);
	}

	public void col_107(float value) {
		setConstNumber(offset + 258, $col_107, value);
	}

	public void col_107(double value) {
		setConstNumber(offset + 258, $col_107, value);
	}


	public MCNumber col_108() {
		return getConstNumber(offset + 259, $col_108);
	}

	public void col_108(MCNumber value) {
		setConstNumber(offset + 259, $col_108, value);
	}

	public void col_108(int value) {
		setConstNumber(offset + 259, $col_108, value);
	}

	public void col_108(long value) {
		setConstNumber(offset + 259, $col_108, value);
	}

	public void col_108(float value) {
		setConstNumber(offset + 259, $col_108, value);
	}

	public void col_108(double value) {
		setConstNumber(offset + 259, $col_108, value);
	}


	public MCNumber col_109() {
		return getConstNumber(offset + 260, $col_109);
	}

	public void col_109(MCNumber value) {
		setConstNumber(offset + 260, $col_109, value);
	}

	public void col_109(int value) {
		setConstNumber(offset + 260, $col_109, value);
	}

	public void col_109(long value) {
		setConstNumber(offset + 260, $col_109, value);
	}

	public void col_109(float value) {
		setConstNumber(offset + 260, $col_109, value);
	}

	public void col_109(double value) {
		setConstNumber(offset + 260, $col_109, value);
	}


	public MCNumber col_110() {
		return getConstNumber(offset + 261, $col_110);
	}

	public void col_110(MCNumber value) {
		setConstNumber(offset + 261, $col_110, value);
	}

	public void col_110(int value) {
		setConstNumber(offset + 261, $col_110, value);
	}

	public void col_110(long value) {
		setConstNumber(offset + 261, $col_110, value);
	}

	public void col_110(float value) {
		setConstNumber(offset + 261, $col_110, value);
	}

	public void col_110(double value) {
		setConstNumber(offset + 261, $col_110, value);
	}


	public MCNumber col_111() {
		return getConstNumber(offset + 262, $col_111);
	}

	public void col_111(MCNumber value) {
		setConstNumber(offset + 262, $col_111, value);
	}

	public void col_111(int value) {
		setConstNumber(offset + 262, $col_111, value);
	}

	public void col_111(long value) {
		setConstNumber(offset + 262, $col_111, value);
	}

	public void col_111(float value) {
		setConstNumber(offset + 262, $col_111, value);
	}

	public void col_111(double value) {
		setConstNumber(offset + 262, $col_111, value);
	}


	public MCNumber col_112() {
		return getConstNumber(offset + 263, $col_112);
	}

	public void col_112(MCNumber value) {
		setConstNumber(offset + 263, $col_112, value);
	}

	public void col_112(int value) {
		setConstNumber(offset + 263, $col_112, value);
	}

	public void col_112(long value) {
		setConstNumber(offset + 263, $col_112, value);
	}

	public void col_112(float value) {
		setConstNumber(offset + 263, $col_112, value);
	}

	public void col_112(double value) {
		setConstNumber(offset + 263, $col_112, value);
	}


	public MCNumber col_113() {
		return getConstNumber(offset + 264, $col_113);
	}

	public void col_113(MCNumber value) {
		setConstNumber(offset + 264, $col_113, value);
	}

	public void col_113(int value) {
		setConstNumber(offset + 264, $col_113, value);
	}

	public void col_113(long value) {
		setConstNumber(offset + 264, $col_113, value);
	}

	public void col_113(float value) {
		setConstNumber(offset + 264, $col_113, value);
	}

	public void col_113(double value) {
		setConstNumber(offset + 264, $col_113, value);
	}


	public MCNumber col_114() {
		return getConstNumber(offset + 265, $col_114);
	}

	public void col_114(MCNumber value) {
		setConstNumber(offset + 265, $col_114, value);
	}

	public void col_114(int value) {
		setConstNumber(offset + 265, $col_114, value);
	}

	public void col_114(long value) {
		setConstNumber(offset + 265, $col_114, value);
	}

	public void col_114(float value) {
		setConstNumber(offset + 265, $col_114, value);
	}

	public void col_114(double value) {
		setConstNumber(offset + 265, $col_114, value);
	}


	public MCNumber col_115() {
		return getConstNumber(offset + 266, $col_115);
	}

	public void col_115(MCNumber value) {
		setConstNumber(offset + 266, $col_115, value);
	}

	public void col_115(int value) {
		setConstNumber(offset + 266, $col_115, value);
	}

	public void col_115(long value) {
		setConstNumber(offset + 266, $col_115, value);
	}

	public void col_115(float value) {
		setConstNumber(offset + 266, $col_115, value);
	}

	public void col_115(double value) {
		setConstNumber(offset + 266, $col_115, value);
	}


	public MCNumber col_116() {
		return getConstNumber(offset + 267, $col_116);
	}

	public void col_116(MCNumber value) {
		setConstNumber(offset + 267, $col_116, value);
	}

	public void col_116(int value) {
		setConstNumber(offset + 267, $col_116, value);
	}

	public void col_116(long value) {
		setConstNumber(offset + 267, $col_116, value);
	}

	public void col_116(float value) {
		setConstNumber(offset + 267, $col_116, value);
	}

	public void col_116(double value) {
		setConstNumber(offset + 267, $col_116, value);
	}


	public MCNumber col_117() {
		return getConstNumber(offset + 268, $col_117);
	}

	public void col_117(MCNumber value) {
		setConstNumber(offset + 268, $col_117, value);
	}

	public void col_117(int value) {
		setConstNumber(offset + 268, $col_117, value);
	}

	public void col_117(long value) {
		setConstNumber(offset + 268, $col_117, value);
	}

	public void col_117(float value) {
		setConstNumber(offset + 268, $col_117, value);
	}

	public void col_117(double value) {
		setConstNumber(offset + 268, $col_117, value);
	}


	public MCNumber col_118() {
		return getConstNumber(offset + 269, $col_118);
	}

	public void col_118(MCNumber value) {
		setConstNumber(offset + 269, $col_118, value);
	}

	public void col_118(int value) {
		setConstNumber(offset + 269, $col_118, value);
	}

	public void col_118(long value) {
		setConstNumber(offset + 269, $col_118, value);
	}

	public void col_118(float value) {
		setConstNumber(offset + 269, $col_118, value);
	}

	public void col_118(double value) {
		setConstNumber(offset + 269, $col_118, value);
	}


	public MCNumber col_119() {
		return getConstNumber(offset + 270, $col_119);
	}

	public void col_119(MCNumber value) {
		setConstNumber(offset + 270, $col_119, value);
	}

	public void col_119(int value) {
		setConstNumber(offset + 270, $col_119, value);
	}

	public void col_119(long value) {
		setConstNumber(offset + 270, $col_119, value);
	}

	public void col_119(float value) {
		setConstNumber(offset + 270, $col_119, value);
	}

	public void col_119(double value) {
		setConstNumber(offset + 270, $col_119, value);
	}


	public MCNumber col_120() {
		return getConstNumber(offset + 271, $col_120);
	}

	public void col_120(MCNumber value) {
		setConstNumber(offset + 271, $col_120, value);
	}

	public void col_120(int value) {
		setConstNumber(offset + 271, $col_120, value);
	}

	public void col_120(long value) {
		setConstNumber(offset + 271, $col_120, value);
	}

	public void col_120(float value) {
		setConstNumber(offset + 271, $col_120, value);
	}

	public void col_120(double value) {
		setConstNumber(offset + 271, $col_120, value);
	}


	public MCNumber col_121() {
		return getConstNumber(offset + 272, $col_121);
	}

	public void col_121(MCNumber value) {
		setConstNumber(offset + 272, $col_121, value);
	}

	public void col_121(int value) {
		setConstNumber(offset + 272, $col_121, value);
	}

	public void col_121(long value) {
		setConstNumber(offset + 272, $col_121, value);
	}

	public void col_121(float value) {
		setConstNumber(offset + 272, $col_121, value);
	}

	public void col_121(double value) {
		setConstNumber(offset + 272, $col_121, value);
	}


	public MCNumber col_122() {
		return getConstNumber(offset + 273, $col_122);
	}

	public void col_122(MCNumber value) {
		setConstNumber(offset + 273, $col_122, value);
	}

	public void col_122(int value) {
		setConstNumber(offset + 273, $col_122, value);
	}

	public void col_122(long value) {
		setConstNumber(offset + 273, $col_122, value);
	}

	public void col_122(float value) {
		setConstNumber(offset + 273, $col_122, value);
	}

	public void col_122(double value) {
		setConstNumber(offset + 273, $col_122, value);
	}


	public MCNumber col_123() {
		return getConstNumber(offset + 274, $col_123);
	}

	public void col_123(MCNumber value) {
		setConstNumber(offset + 274, $col_123, value);
	}

	public void col_123(int value) {
		setConstNumber(offset + 274, $col_123, value);
	}

	public void col_123(long value) {
		setConstNumber(offset + 274, $col_123, value);
	}

	public void col_123(float value) {
		setConstNumber(offset + 274, $col_123, value);
	}

	public void col_123(double value) {
		setConstNumber(offset + 274, $col_123, value);
	}


	public MCNumber col_124() {
		return getConstNumber(offset + 275, $col_124);
	}

	public void col_124(MCNumber value) {
		setConstNumber(offset + 275, $col_124, value);
	}

	public void col_124(int value) {
		setConstNumber(offset + 275, $col_124, value);
	}

	public void col_124(long value) {
		setConstNumber(offset + 275, $col_124, value);
	}

	public void col_124(float value) {
		setConstNumber(offset + 275, $col_124, value);
	}

	public void col_124(double value) {
		setConstNumber(offset + 275, $col_124, value);
	}


	public MCNumber col_125() {
		return getConstNumber(offset + 276, $col_125);
	}

	public void col_125(MCNumber value) {
		setConstNumber(offset + 276, $col_125, value);
	}

	public void col_125(int value) {
		setConstNumber(offset + 276, $col_125, value);
	}

	public void col_125(long value) {
		setConstNumber(offset + 276, $col_125, value);
	}

	public void col_125(float value) {
		setConstNumber(offset + 276, $col_125, value);
	}

	public void col_125(double value) {
		setConstNumber(offset + 276, $col_125, value);
	}


	public MCNumber col_126() {
		return getConstNumber(offset + 277, $col_126);
	}

	public void col_126(MCNumber value) {
		setConstNumber(offset + 277, $col_126, value);
	}

	public void col_126(int value) {
		setConstNumber(offset + 277, $col_126, value);
	}

	public void col_126(long value) {
		setConstNumber(offset + 277, $col_126, value);
	}

	public void col_126(float value) {
		setConstNumber(offset + 277, $col_126, value);
	}

	public void col_126(double value) {
		setConstNumber(offset + 277, $col_126, value);
	}


	public MCNumber col_127() {
		return getConstNumber(offset + 278, $col_127);
	}

	public void col_127(MCNumber value) {
		setConstNumber(offset + 278, $col_127, value);
	}

	public void col_127(int value) {
		setConstNumber(offset + 278, $col_127, value);
	}

	public void col_127(long value) {
		setConstNumber(offset + 278, $col_127, value);
	}

	public void col_127(float value) {
		setConstNumber(offset + 278, $col_127, value);
	}

	public void col_127(double value) {
		setConstNumber(offset + 278, $col_127, value);
	}


	public MCNumber col_128() {
		return getConstNumber(offset + 279, $col_128);
	}

	public void col_128(MCNumber value) {
		setConstNumber(offset + 279, $col_128, value);
	}

	public void col_128(int value) {
		setConstNumber(offset + 279, $col_128, value);
	}

	public void col_128(long value) {
		setConstNumber(offset + 279, $col_128, value);
	}

	public void col_128(float value) {
		setConstNumber(offset + 279, $col_128, value);
	}

	public void col_128(double value) {
		setConstNumber(offset + 279, $col_128, value);
	}


	public MCNumber col_129() {
		return getConstNumber(offset + 280, $col_129);
	}

	public void col_129(MCNumber value) {
		setConstNumber(offset + 280, $col_129, value);
	}

	public void col_129(int value) {
		setConstNumber(offset + 280, $col_129, value);
	}

	public void col_129(long value) {
		setConstNumber(offset + 280, $col_129, value);
	}

	public void col_129(float value) {
		setConstNumber(offset + 280, $col_129, value);
	}

	public void col_129(double value) {
		setConstNumber(offset + 280, $col_129, value);
	}


	public MCNumber col_130() {
		return getConstNumber(offset + 281, $col_130);
	}

	public void col_130(MCNumber value) {
		setConstNumber(offset + 281, $col_130, value);
	}

	public void col_130(int value) {
		setConstNumber(offset + 281, $col_130, value);
	}

	public void col_130(long value) {
		setConstNumber(offset + 281, $col_130, value);
	}

	public void col_130(float value) {
		setConstNumber(offset + 281, $col_130, value);
	}

	public void col_130(double value) {
		setConstNumber(offset + 281, $col_130, value);
	}


	public MCNumber col_131() {
		return getConstNumber(offset + 282, $col_131);
	}

	public void col_131(MCNumber value) {
		setConstNumber(offset + 282, $col_131, value);
	}

	public void col_131(int value) {
		setConstNumber(offset + 282, $col_131, value);
	}

	public void col_131(long value) {
		setConstNumber(offset + 282, $col_131, value);
	}

	public void col_131(float value) {
		setConstNumber(offset + 282, $col_131, value);
	}

	public void col_131(double value) {
		setConstNumber(offset + 282, $col_131, value);
	}


	public MCNumber col_132() {
		return getConstNumber(offset + 283, $col_132);
	}

	public void col_132(MCNumber value) {
		setConstNumber(offset + 283, $col_132, value);
	}

	public void col_132(int value) {
		setConstNumber(offset + 283, $col_132, value);
	}

	public void col_132(long value) {
		setConstNumber(offset + 283, $col_132, value);
	}

	public void col_132(float value) {
		setConstNumber(offset + 283, $col_132, value);
	}

	public void col_132(double value) {
		setConstNumber(offset + 283, $col_132, value);
	}


	public MCNumber col_133() {
		return getConstNumber(offset + 284, $col_133);
	}

	public void col_133(MCNumber value) {
		setConstNumber(offset + 284, $col_133, value);
	}

	public void col_133(int value) {
		setConstNumber(offset + 284, $col_133, value);
	}

	public void col_133(long value) {
		setConstNumber(offset + 284, $col_133, value);
	}

	public void col_133(float value) {
		setConstNumber(offset + 284, $col_133, value);
	}

	public void col_133(double value) {
		setConstNumber(offset + 284, $col_133, value);
	}


	public MCNumber col_134() {
		return getConstNumber(offset + 285, $col_134);
	}

	public void col_134(MCNumber value) {
		setConstNumber(offset + 285, $col_134, value);
	}

	public void col_134(int value) {
		setConstNumber(offset + 285, $col_134, value);
	}

	public void col_134(long value) {
		setConstNumber(offset + 285, $col_134, value);
	}

	public void col_134(float value) {
		setConstNumber(offset + 285, $col_134, value);
	}

	public void col_134(double value) {
		setConstNumber(offset + 285, $col_134, value);
	}


	public MCNumber col_135() {
		return getConstNumber(offset + 286, $col_135);
	}

	public void col_135(MCNumber value) {
		setConstNumber(offset + 286, $col_135, value);
	}

	public void col_135(int value) {
		setConstNumber(offset + 286, $col_135, value);
	}

	public void col_135(long value) {
		setConstNumber(offset + 286, $col_135, value);
	}

	public void col_135(float value) {
		setConstNumber(offset + 286, $col_135, value);
	}

	public void col_135(double value) {
		setConstNumber(offset + 286, $col_135, value);
	}


	public MCNumber col_136() {
		return getConstNumber(offset + 287, $col_136);
	}

	public void col_136(MCNumber value) {
		setConstNumber(offset + 287, $col_136, value);
	}

	public void col_136(int value) {
		setConstNumber(offset + 287, $col_136, value);
	}

	public void col_136(long value) {
		setConstNumber(offset + 287, $col_136, value);
	}

	public void col_136(float value) {
		setConstNumber(offset + 287, $col_136, value);
	}

	public void col_136(double value) {
		setConstNumber(offset + 287, $col_136, value);
	}


	public MCNumber col_137() {
		return getConstNumber(offset + 288, $col_137);
	}

	public void col_137(MCNumber value) {
		setConstNumber(offset + 288, $col_137, value);
	}

	public void col_137(int value) {
		setConstNumber(offset + 288, $col_137, value);
	}

	public void col_137(long value) {
		setConstNumber(offset + 288, $col_137, value);
	}

	public void col_137(float value) {
		setConstNumber(offset + 288, $col_137, value);
	}

	public void col_137(double value) {
		setConstNumber(offset + 288, $col_137, value);
	}


	public MCNumber col_138() {
		return getConstNumber(offset + 289, $col_138);
	}

	public void col_138(MCNumber value) {
		setConstNumber(offset + 289, $col_138, value);
	}

	public void col_138(int value) {
		setConstNumber(offset + 289, $col_138, value);
	}

	public void col_138(long value) {
		setConstNumber(offset + 289, $col_138, value);
	}

	public void col_138(float value) {
		setConstNumber(offset + 289, $col_138, value);
	}

	public void col_138(double value) {
		setConstNumber(offset + 289, $col_138, value);
	}


	public MCNumber col_139() {
		return getConstNumber(offset + 290, $col_139);
	}

	public void col_139(MCNumber value) {
		setConstNumber(offset + 290, $col_139, value);
	}

	public void col_139(int value) {
		setConstNumber(offset + 290, $col_139, value);
	}

	public void col_139(long value) {
		setConstNumber(offset + 290, $col_139, value);
	}

	public void col_139(float value) {
		setConstNumber(offset + 290, $col_139, value);
	}

	public void col_139(double value) {
		setConstNumber(offset + 290, $col_139, value);
	}


	public MCNumber col_140() {
		return getConstNumber(offset + 291, $col_140);
	}

	public void col_140(MCNumber value) {
		setConstNumber(offset + 291, $col_140, value);
	}

	public void col_140(int value) {
		setConstNumber(offset + 291, $col_140, value);
	}

	public void col_140(long value) {
		setConstNumber(offset + 291, $col_140, value);
	}

	public void col_140(float value) {
		setConstNumber(offset + 291, $col_140, value);
	}

	public void col_140(double value) {
		setConstNumber(offset + 291, $col_140, value);
	}


	public MCNumber col_141() {
		return getConstNumber(offset + 292, $col_141);
	}

	public void col_141(MCNumber value) {
		setConstNumber(offset + 292, $col_141, value);
	}

	public void col_141(int value) {
		setConstNumber(offset + 292, $col_141, value);
	}

	public void col_141(long value) {
		setConstNumber(offset + 292, $col_141, value);
	}

	public void col_141(float value) {
		setConstNumber(offset + 292, $col_141, value);
	}

	public void col_141(double value) {
		setConstNumber(offset + 292, $col_141, value);
	}


	public MCNumber col_142() {
		return getConstNumber(offset + 293, $col_142);
	}

	public void col_142(MCNumber value) {
		setConstNumber(offset + 293, $col_142, value);
	}

	public void col_142(int value) {
		setConstNumber(offset + 293, $col_142, value);
	}

	public void col_142(long value) {
		setConstNumber(offset + 293, $col_142, value);
	}

	public void col_142(float value) {
		setConstNumber(offset + 293, $col_142, value);
	}

	public void col_142(double value) {
		setConstNumber(offset + 293, $col_142, value);
	}


	public MCNumber col_143() {
		return getConstNumber(offset + 294, $col_143);
	}

	public void col_143(MCNumber value) {
		setConstNumber(offset + 294, $col_143, value);
	}

	public void col_143(int value) {
		setConstNumber(offset + 294, $col_143, value);
	}

	public void col_143(long value) {
		setConstNumber(offset + 294, $col_143, value);
	}

	public void col_143(float value) {
		setConstNumber(offset + 294, $col_143, value);
	}

	public void col_143(double value) {
		setConstNumber(offset + 294, $col_143, value);
	}


	public MCNumber col_144() {
		return getConstNumber(offset + 295, $col_144);
	}

	public void col_144(MCNumber value) {
		setConstNumber(offset + 295, $col_144, value);
	}

	public void col_144(int value) {
		setConstNumber(offset + 295, $col_144, value);
	}

	public void col_144(long value) {
		setConstNumber(offset + 295, $col_144, value);
	}

	public void col_144(float value) {
		setConstNumber(offset + 295, $col_144, value);
	}

	public void col_144(double value) {
		setConstNumber(offset + 295, $col_144, value);
	}


	public MCNumber col_145() {
		return getConstNumber(offset + 296, $col_145);
	}

	public void col_145(MCNumber value) {
		setConstNumber(offset + 296, $col_145, value);
	}

	public void col_145(int value) {
		setConstNumber(offset + 296, $col_145, value);
	}

	public void col_145(long value) {
		setConstNumber(offset + 296, $col_145, value);
	}

	public void col_145(float value) {
		setConstNumber(offset + 296, $col_145, value);
	}

	public void col_145(double value) {
		setConstNumber(offset + 296, $col_145, value);
	}


	public MCNumber col_146() {
		return getConstNumber(offset + 297, $col_146);
	}

	public void col_146(MCNumber value) {
		setConstNumber(offset + 297, $col_146, value);
	}

	public void col_146(int value) {
		setConstNumber(offset + 297, $col_146, value);
	}

	public void col_146(long value) {
		setConstNumber(offset + 297, $col_146, value);
	}

	public void col_146(float value) {
		setConstNumber(offset + 297, $col_146, value);
	}

	public void col_146(double value) {
		setConstNumber(offset + 297, $col_146, value);
	}


	public MCNumber col_147() {
		return getConstNumber(offset + 298, $col_147);
	}

	public void col_147(MCNumber value) {
		setConstNumber(offset + 298, $col_147, value);
	}

	public void col_147(int value) {
		setConstNumber(offset + 298, $col_147, value);
	}

	public void col_147(long value) {
		setConstNumber(offset + 298, $col_147, value);
	}

	public void col_147(float value) {
		setConstNumber(offset + 298, $col_147, value);
	}

	public void col_147(double value) {
		setConstNumber(offset + 298, $col_147, value);
	}


	public MCNumber col_148() {
		return getConstNumber(offset + 299, $col_148);
	}

	public void col_148(MCNumber value) {
		setConstNumber(offset + 299, $col_148, value);
	}

	public void col_148(int value) {
		setConstNumber(offset + 299, $col_148, value);
	}

	public void col_148(long value) {
		setConstNumber(offset + 299, $col_148, value);
	}

	public void col_148(float value) {
		setConstNumber(offset + 299, $col_148, value);
	}

	public void col_148(double value) {
		setConstNumber(offset + 299, $col_148, value);
	}


	public MCNumber col_149() {
		return getConstNumber(offset + 300, $col_149);
	}

	public void col_149(MCNumber value) {
		setConstNumber(offset + 300, $col_149, value);
	}

	public void col_149(int value) {
		setConstNumber(offset + 300, $col_149, value);
	}

	public void col_149(long value) {
		setConstNumber(offset + 300, $col_149, value);
	}

	public void col_149(float value) {
		setConstNumber(offset + 300, $col_149, value);
	}

	public void col_149(double value) {
		setConstNumber(offset + 300, $col_149, value);
	}


	public MCNumber col_150() {
		return getConstNumber(offset + 301, $col_150);
	}

	public void col_150(MCNumber value) {
		setConstNumber(offset + 301, $col_150, value);
	}

	public void col_150(int value) {
		setConstNumber(offset + 301, $col_150, value);
	}

	public void col_150(long value) {
		setConstNumber(offset + 301, $col_150, value);
	}

	public void col_150(float value) {
		setConstNumber(offset + 301, $col_150, value);
	}

	public void col_150(double value) {
		setConstNumber(offset + 301, $col_150, value);
	}


	public MCNumber col_151() {
		return getConstNumber(offset + 302, $col_151);
	}

	public void col_151(MCNumber value) {
		setConstNumber(offset + 302, $col_151, value);
	}

	public void col_151(int value) {
		setConstNumber(offset + 302, $col_151, value);
	}

	public void col_151(long value) {
		setConstNumber(offset + 302, $col_151, value);
	}

	public void col_151(float value) {
		setConstNumber(offset + 302, $col_151, value);
	}

	public void col_151(double value) {
		setConstNumber(offset + 302, $col_151, value);
	}


	public MCNumber col_152() {
		return getConstNumber(offset + 303, $col_152);
	}

	public void col_152(MCNumber value) {
		setConstNumber(offset + 303, $col_152, value);
	}

	public void col_152(int value) {
		setConstNumber(offset + 303, $col_152, value);
	}

	public void col_152(long value) {
		setConstNumber(offset + 303, $col_152, value);
	}

	public void col_152(float value) {
		setConstNumber(offset + 303, $col_152, value);
	}

	public void col_152(double value) {
		setConstNumber(offset + 303, $col_152, value);
	}


	public MCNumber col_153() {
		return getConstNumber(offset + 304, $col_153);
	}

	public void col_153(MCNumber value) {
		setConstNumber(offset + 304, $col_153, value);
	}

	public void col_153(int value) {
		setConstNumber(offset + 304, $col_153, value);
	}

	public void col_153(long value) {
		setConstNumber(offset + 304, $col_153, value);
	}

	public void col_153(float value) {
		setConstNumber(offset + 304, $col_153, value);
	}

	public void col_153(double value) {
		setConstNumber(offset + 304, $col_153, value);
	}


	public MCNumber col_154() {
		return getConstNumber(offset + 305, $col_154);
	}

	public void col_154(MCNumber value) {
		setConstNumber(offset + 305, $col_154, value);
	}

	public void col_154(int value) {
		setConstNumber(offset + 305, $col_154, value);
	}

	public void col_154(long value) {
		setConstNumber(offset + 305, $col_154, value);
	}

	public void col_154(float value) {
		setConstNumber(offset + 305, $col_154, value);
	}

	public void col_154(double value) {
		setConstNumber(offset + 305, $col_154, value);
	}


	public MCNumber col_155() {
		return getConstNumber(offset + 306, $col_155);
	}

	public void col_155(MCNumber value) {
		setConstNumber(offset + 306, $col_155, value);
	}

	public void col_155(int value) {
		setConstNumber(offset + 306, $col_155, value);
	}

	public void col_155(long value) {
		setConstNumber(offset + 306, $col_155, value);
	}

	public void col_155(float value) {
		setConstNumber(offset + 306, $col_155, value);
	}

	public void col_155(double value) {
		setConstNumber(offset + 306, $col_155, value);
	}


	public MCNumber col_156() {
		return getConstNumber(offset + 307, $col_156);
	}

	public void col_156(MCNumber value) {
		setConstNumber(offset + 307, $col_156, value);
	}

	public void col_156(int value) {
		setConstNumber(offset + 307, $col_156, value);
	}

	public void col_156(long value) {
		setConstNumber(offset + 307, $col_156, value);
	}

	public void col_156(float value) {
		setConstNumber(offset + 307, $col_156, value);
	}

	public void col_156(double value) {
		setConstNumber(offset + 307, $col_156, value);
	}


	public MCNumber col_157() {
		return getConstNumber(offset + 308, $col_157);
	}

	public void col_157(MCNumber value) {
		setConstNumber(offset + 308, $col_157, value);
	}

	public void col_157(int value) {
		setConstNumber(offset + 308, $col_157, value);
	}

	public void col_157(long value) {
		setConstNumber(offset + 308, $col_157, value);
	}

	public void col_157(float value) {
		setConstNumber(offset + 308, $col_157, value);
	}

	public void col_157(double value) {
		setConstNumber(offset + 308, $col_157, value);
	}


	public MCNumber col_158() {
		return getConstNumber(offset + 309, $col_158);
	}

	public void col_158(MCNumber value) {
		setConstNumber(offset + 309, $col_158, value);
	}

	public void col_158(int value) {
		setConstNumber(offset + 309, $col_158, value);
	}

	public void col_158(long value) {
		setConstNumber(offset + 309, $col_158, value);
	}

	public void col_158(float value) {
		setConstNumber(offset + 309, $col_158, value);
	}

	public void col_158(double value) {
		setConstNumber(offset + 309, $col_158, value);
	}


	public MCNumber col_159() {
		return getConstNumber(offset + 310, $col_159);
	}

	public void col_159(MCNumber value) {
		setConstNumber(offset + 310, $col_159, value);
	}

	public void col_159(int value) {
		setConstNumber(offset + 310, $col_159, value);
	}

	public void col_159(long value) {
		setConstNumber(offset + 310, $col_159, value);
	}

	public void col_159(float value) {
		setConstNumber(offset + 310, $col_159, value);
	}

	public void col_159(double value) {
		setConstNumber(offset + 310, $col_159, value);
	}


	public MCNumber col_160() {
		return getConstNumber(offset + 311, $col_160);
	}

	public void col_160(MCNumber value) {
		setConstNumber(offset + 311, $col_160, value);
	}

	public void col_160(int value) {
		setConstNumber(offset + 311, $col_160, value);
	}

	public void col_160(long value) {
		setConstNumber(offset + 311, $col_160, value);
	}

	public void col_160(float value) {
		setConstNumber(offset + 311, $col_160, value);
	}

	public void col_160(double value) {
		setConstNumber(offset + 311, $col_160, value);
	}


	public MCNumber col_161() {
		return getConstNumber(offset + 312, $col_161);
	}

	public void col_161(MCNumber value) {
		setConstNumber(offset + 312, $col_161, value);
	}

	public void col_161(int value) {
		setConstNumber(offset + 312, $col_161, value);
	}

	public void col_161(long value) {
		setConstNumber(offset + 312, $col_161, value);
	}

	public void col_161(float value) {
		setConstNumber(offset + 312, $col_161, value);
	}

	public void col_161(double value) {
		setConstNumber(offset + 312, $col_161, value);
	}


	public MCNumber col_162() {
		return getConstNumber(offset + 313, $col_162);
	}

	public void col_162(MCNumber value) {
		setConstNumber(offset + 313, $col_162, value);
	}

	public void col_162(int value) {
		setConstNumber(offset + 313, $col_162, value);
	}

	public void col_162(long value) {
		setConstNumber(offset + 313, $col_162, value);
	}

	public void col_162(float value) {
		setConstNumber(offset + 313, $col_162, value);
	}

	public void col_162(double value) {
		setConstNumber(offset + 313, $col_162, value);
	}


	public MCNumber col_163() {
		return getConstNumber(offset + 314, $col_163);
	}

	public void col_163(MCNumber value) {
		setConstNumber(offset + 314, $col_163, value);
	}

	public void col_163(int value) {
		setConstNumber(offset + 314, $col_163, value);
	}

	public void col_163(long value) {
		setConstNumber(offset + 314, $col_163, value);
	}

	public void col_163(float value) {
		setConstNumber(offset + 314, $col_163, value);
	}

	public void col_163(double value) {
		setConstNumber(offset + 314, $col_163, value);
	}


	public MCNumber col_164() {
		return getConstNumber(offset + 315, $col_164);
	}

	public void col_164(MCNumber value) {
		setConstNumber(offset + 315, $col_164, value);
	}

	public void col_164(int value) {
		setConstNumber(offset + 315, $col_164, value);
	}

	public void col_164(long value) {
		setConstNumber(offset + 315, $col_164, value);
	}

	public void col_164(float value) {
		setConstNumber(offset + 315, $col_164, value);
	}

	public void col_164(double value) {
		setConstNumber(offset + 315, $col_164, value);
	}


	public MCNumber col_165() {
		return getConstNumber(offset + 316, $col_165);
	}

	public void col_165(MCNumber value) {
		setConstNumber(offset + 316, $col_165, value);
	}

	public void col_165(int value) {
		setConstNumber(offset + 316, $col_165, value);
	}

	public void col_165(long value) {
		setConstNumber(offset + 316, $col_165, value);
	}

	public void col_165(float value) {
		setConstNumber(offset + 316, $col_165, value);
	}

	public void col_165(double value) {
		setConstNumber(offset + 316, $col_165, value);
	}


	public MCNumber col_166() {
		return getConstNumber(offset + 317, $col_166);
	}

	public void col_166(MCNumber value) {
		setConstNumber(offset + 317, $col_166, value);
	}

	public void col_166(int value) {
		setConstNumber(offset + 317, $col_166, value);
	}

	public void col_166(long value) {
		setConstNumber(offset + 317, $col_166, value);
	}

	public void col_166(float value) {
		setConstNumber(offset + 317, $col_166, value);
	}

	public void col_166(double value) {
		setConstNumber(offset + 317, $col_166, value);
	}


	public MCNumber col_167() {
		return getConstNumber(offset + 318, $col_167);
	}

	public void col_167(MCNumber value) {
		setConstNumber(offset + 318, $col_167, value);
	}

	public void col_167(int value) {
		setConstNumber(offset + 318, $col_167, value);
	}

	public void col_167(long value) {
		setConstNumber(offset + 318, $col_167, value);
	}

	public void col_167(float value) {
		setConstNumber(offset + 318, $col_167, value);
	}

	public void col_167(double value) {
		setConstNumber(offset + 318, $col_167, value);
	}


	public MCNumber col_168() {
		return getConstNumber(offset + 319, $col_168);
	}

	public void col_168(MCNumber value) {
		setConstNumber(offset + 319, $col_168, value);
	}

	public void col_168(int value) {
		setConstNumber(offset + 319, $col_168, value);
	}

	public void col_168(long value) {
		setConstNumber(offset + 319, $col_168, value);
	}

	public void col_168(float value) {
		setConstNumber(offset + 319, $col_168, value);
	}

	public void col_168(double value) {
		setConstNumber(offset + 319, $col_168, value);
	}


	public MCNumber col_169() {
		return getConstNumber(offset + 320, $col_169);
	}

	public void col_169(MCNumber value) {
		setConstNumber(offset + 320, $col_169, value);
	}

	public void col_169(int value) {
		setConstNumber(offset + 320, $col_169, value);
	}

	public void col_169(long value) {
		setConstNumber(offset + 320, $col_169, value);
	}

	public void col_169(float value) {
		setConstNumber(offset + 320, $col_169, value);
	}

	public void col_169(double value) {
		setConstNumber(offset + 320, $col_169, value);
	}


	public MCNumber col_170() {
		return getConstNumber(offset + 321, $col_170);
	}

	public void col_170(MCNumber value) {
		setConstNumber(offset + 321, $col_170, value);
	}

	public void col_170(int value) {
		setConstNumber(offset + 321, $col_170, value);
	}

	public void col_170(long value) {
		setConstNumber(offset + 321, $col_170, value);
	}

	public void col_170(float value) {
		setConstNumber(offset + 321, $col_170, value);
	}

	public void col_170(double value) {
		setConstNumber(offset + 321, $col_170, value);
	}


	public MCNumber col_171() {
		return getConstNumber(offset + 322, $col_171);
	}

	public void col_171(MCNumber value) {
		setConstNumber(offset + 322, $col_171, value);
	}

	public void col_171(int value) {
		setConstNumber(offset + 322, $col_171, value);
	}

	public void col_171(long value) {
		setConstNumber(offset + 322, $col_171, value);
	}

	public void col_171(float value) {
		setConstNumber(offset + 322, $col_171, value);
	}

	public void col_171(double value) {
		setConstNumber(offset + 322, $col_171, value);
	}


	public MCNumber col_172() {
		return getConstNumber(offset + 323, $col_172);
	}

	public void col_172(MCNumber value) {
		setConstNumber(offset + 323, $col_172, value);
	}

	public void col_172(int value) {
		setConstNumber(offset + 323, $col_172, value);
	}

	public void col_172(long value) {
		setConstNumber(offset + 323, $col_172, value);
	}

	public void col_172(float value) {
		setConstNumber(offset + 323, $col_172, value);
	}

	public void col_172(double value) {
		setConstNumber(offset + 323, $col_172, value);
	}


	public MCNumber col_173() {
		return getConstNumber(offset + 324, $col_173);
	}

	public void col_173(MCNumber value) {
		setConstNumber(offset + 324, $col_173, value);
	}

	public void col_173(int value) {
		setConstNumber(offset + 324, $col_173, value);
	}

	public void col_173(long value) {
		setConstNumber(offset + 324, $col_173, value);
	}

	public void col_173(float value) {
		setConstNumber(offset + 324, $col_173, value);
	}

	public void col_173(double value) {
		setConstNumber(offset + 324, $col_173, value);
	}


	public MCNumber col_174() {
		return getConstNumber(offset + 325, $col_174);
	}

	public void col_174(MCNumber value) {
		setConstNumber(offset + 325, $col_174, value);
	}

	public void col_174(int value) {
		setConstNumber(offset + 325, $col_174, value);
	}

	public void col_174(long value) {
		setConstNumber(offset + 325, $col_174, value);
	}

	public void col_174(float value) {
		setConstNumber(offset + 325, $col_174, value);
	}

	public void col_174(double value) {
		setConstNumber(offset + 325, $col_174, value);
	}


	public MCNumber col_175() {
		return getConstNumber(offset + 326, $col_175);
	}

	public void col_175(MCNumber value) {
		setConstNumber(offset + 326, $col_175, value);
	}

	public void col_175(int value) {
		setConstNumber(offset + 326, $col_175, value);
	}

	public void col_175(long value) {
		setConstNumber(offset + 326, $col_175, value);
	}

	public void col_175(float value) {
		setConstNumber(offset + 326, $col_175, value);
	}

	public void col_175(double value) {
		setConstNumber(offset + 326, $col_175, value);
	}


	public MCNumber col_176() {
		return getConstNumber(offset + 327, $col_176);
	}

	public void col_176(MCNumber value) {
		setConstNumber(offset + 327, $col_176, value);
	}

	public void col_176(int value) {
		setConstNumber(offset + 327, $col_176, value);
	}

	public void col_176(long value) {
		setConstNumber(offset + 327, $col_176, value);
	}

	public void col_176(float value) {
		setConstNumber(offset + 327, $col_176, value);
	}

	public void col_176(double value) {
		setConstNumber(offset + 327, $col_176, value);
	}


	public MCNumber col_177() {
		return getConstNumber(offset + 328, $col_177);
	}

	public void col_177(MCNumber value) {
		setConstNumber(offset + 328, $col_177, value);
	}

	public void col_177(int value) {
		setConstNumber(offset + 328, $col_177, value);
	}

	public void col_177(long value) {
		setConstNumber(offset + 328, $col_177, value);
	}

	public void col_177(float value) {
		setConstNumber(offset + 328, $col_177, value);
	}

	public void col_177(double value) {
		setConstNumber(offset + 328, $col_177, value);
	}


	public MCNumber col_178() {
		return getConstNumber(offset + 329, $col_178);
	}

	public void col_178(MCNumber value) {
		setConstNumber(offset + 329, $col_178, value);
	}

	public void col_178(int value) {
		setConstNumber(offset + 329, $col_178, value);
	}

	public void col_178(long value) {
		setConstNumber(offset + 329, $col_178, value);
	}

	public void col_178(float value) {
		setConstNumber(offset + 329, $col_178, value);
	}

	public void col_178(double value) {
		setConstNumber(offset + 329, $col_178, value);
	}


	public MCNumber col_179() {
		return getConstNumber(offset + 330, $col_179);
	}

	public void col_179(MCNumber value) {
		setConstNumber(offset + 330, $col_179, value);
	}

	public void col_179(int value) {
		setConstNumber(offset + 330, $col_179, value);
	}

	public void col_179(long value) {
		setConstNumber(offset + 330, $col_179, value);
	}

	public void col_179(float value) {
		setConstNumber(offset + 330, $col_179, value);
	}

	public void col_179(double value) {
		setConstNumber(offset + 330, $col_179, value);
	}


	public MCNumber col_180() {
		return getConstNumber(offset + 331, $col_180);
	}

	public void col_180(MCNumber value) {
		setConstNumber(offset + 331, $col_180, value);
	}

	public void col_180(int value) {
		setConstNumber(offset + 331, $col_180, value);
	}

	public void col_180(long value) {
		setConstNumber(offset + 331, $col_180, value);
	}

	public void col_180(float value) {
		setConstNumber(offset + 331, $col_180, value);
	}

	public void col_180(double value) {
		setConstNumber(offset + 331, $col_180, value);
	}


	public MCNumber col_181() {
		return getConstNumber(offset + 332, $col_181);
	}

	public void col_181(MCNumber value) {
		setConstNumber(offset + 332, $col_181, value);
	}

	public void col_181(int value) {
		setConstNumber(offset + 332, $col_181, value);
	}

	public void col_181(long value) {
		setConstNumber(offset + 332, $col_181, value);
	}

	public void col_181(float value) {
		setConstNumber(offset + 332, $col_181, value);
	}

	public void col_181(double value) {
		setConstNumber(offset + 332, $col_181, value);
	}


	public MCNumber col_182() {
		return getConstNumber(offset + 333, $col_182);
	}

	public void col_182(MCNumber value) {
		setConstNumber(offset + 333, $col_182, value);
	}

	public void col_182(int value) {
		setConstNumber(offset + 333, $col_182, value);
	}

	public void col_182(long value) {
		setConstNumber(offset + 333, $col_182, value);
	}

	public void col_182(float value) {
		setConstNumber(offset + 333, $col_182, value);
	}

	public void col_182(double value) {
		setConstNumber(offset + 333, $col_182, value);
	}


	public MCNumber col_183() {
		return getConstNumber(offset + 334, $col_183);
	}

	public void col_183(MCNumber value) {
		setConstNumber(offset + 334, $col_183, value);
	}

	public void col_183(int value) {
		setConstNumber(offset + 334, $col_183, value);
	}

	public void col_183(long value) {
		setConstNumber(offset + 334, $col_183, value);
	}

	public void col_183(float value) {
		setConstNumber(offset + 334, $col_183, value);
	}

	public void col_183(double value) {
		setConstNumber(offset + 334, $col_183, value);
	}


	public MCNumber col_184() {
		return getConstNumber(offset + 335, $col_184);
	}

	public void col_184(MCNumber value) {
		setConstNumber(offset + 335, $col_184, value);
	}

	public void col_184(int value) {
		setConstNumber(offset + 335, $col_184, value);
	}

	public void col_184(long value) {
		setConstNumber(offset + 335, $col_184, value);
	}

	public void col_184(float value) {
		setConstNumber(offset + 335, $col_184, value);
	}

	public void col_184(double value) {
		setConstNumber(offset + 335, $col_184, value);
	}


	public MCNumber col_185() {
		return getConstNumber(offset + 336, $col_185);
	}

	public void col_185(MCNumber value) {
		setConstNumber(offset + 336, $col_185, value);
	}

	public void col_185(int value) {
		setConstNumber(offset + 336, $col_185, value);
	}

	public void col_185(long value) {
		setConstNumber(offset + 336, $col_185, value);
	}

	public void col_185(float value) {
		setConstNumber(offset + 336, $col_185, value);
	}

	public void col_185(double value) {
		setConstNumber(offset + 336, $col_185, value);
	}


	public MCNumber col_186() {
		return getConstNumber(offset + 337, $col_186);
	}

	public void col_186(MCNumber value) {
		setConstNumber(offset + 337, $col_186, value);
	}

	public void col_186(int value) {
		setConstNumber(offset + 337, $col_186, value);
	}

	public void col_186(long value) {
		setConstNumber(offset + 337, $col_186, value);
	}

	public void col_186(float value) {
		setConstNumber(offset + 337, $col_186, value);
	}

	public void col_186(double value) {
		setConstNumber(offset + 337, $col_186, value);
	}


	public MCNumber col_187() {
		return getConstNumber(offset + 338, $col_187);
	}

	public void col_187(MCNumber value) {
		setConstNumber(offset + 338, $col_187, value);
	}

	public void col_187(int value) {
		setConstNumber(offset + 338, $col_187, value);
	}

	public void col_187(long value) {
		setConstNumber(offset + 338, $col_187, value);
	}

	public void col_187(float value) {
		setConstNumber(offset + 338, $col_187, value);
	}

	public void col_187(double value) {
		setConstNumber(offset + 338, $col_187, value);
	}


	public MCNumber col_188() {
		return getConstNumber(offset + 339, $col_188);
	}

	public void col_188(MCNumber value) {
		setConstNumber(offset + 339, $col_188, value);
	}

	public void col_188(int value) {
		setConstNumber(offset + 339, $col_188, value);
	}

	public void col_188(long value) {
		setConstNumber(offset + 339, $col_188, value);
	}

	public void col_188(float value) {
		setConstNumber(offset + 339, $col_188, value);
	}

	public void col_188(double value) {
		setConstNumber(offset + 339, $col_188, value);
	}


	public MCNumber col_189() {
		return getConstNumber(offset + 340, $col_189);
	}

	public void col_189(MCNumber value) {
		setConstNumber(offset + 340, $col_189, value);
	}

	public void col_189(int value) {
		setConstNumber(offset + 340, $col_189, value);
	}

	public void col_189(long value) {
		setConstNumber(offset + 340, $col_189, value);
	}

	public void col_189(float value) {
		setConstNumber(offset + 340, $col_189, value);
	}

	public void col_189(double value) {
		setConstNumber(offset + 340, $col_189, value);
	}


	public MCNumber col_190() {
		return getConstNumber(offset + 341, $col_190);
	}

	public void col_190(MCNumber value) {
		setConstNumber(offset + 341, $col_190, value);
	}

	public void col_190(int value) {
		setConstNumber(offset + 341, $col_190, value);
	}

	public void col_190(long value) {
		setConstNumber(offset + 341, $col_190, value);
	}

	public void col_190(float value) {
		setConstNumber(offset + 341, $col_190, value);
	}

	public void col_190(double value) {
		setConstNumber(offset + 341, $col_190, value);
	}


	public MCNumber col_191() {
		return getConstNumber(offset + 342, $col_191);
	}

	public void col_191(MCNumber value) {
		setConstNumber(offset + 342, $col_191, value);
	}

	public void col_191(int value) {
		setConstNumber(offset + 342, $col_191, value);
	}

	public void col_191(long value) {
		setConstNumber(offset + 342, $col_191, value);
	}

	public void col_191(float value) {
		setConstNumber(offset + 342, $col_191, value);
	}

	public void col_191(double value) {
		setConstNumber(offset + 342, $col_191, value);
	}


	public MCNumber col_192() {
		return getConstNumber(offset + 343, $col_192);
	}

	public void col_192(MCNumber value) {
		setConstNumber(offset + 343, $col_192, value);
	}

	public void col_192(int value) {
		setConstNumber(offset + 343, $col_192, value);
	}

	public void col_192(long value) {
		setConstNumber(offset + 343, $col_192, value);
	}

	public void col_192(float value) {
		setConstNumber(offset + 343, $col_192, value);
	}

	public void col_192(double value) {
		setConstNumber(offset + 343, $col_192, value);
	}


	public MCNumber col_193() {
		return getConstNumber(offset + 344, $col_193);
	}

	public void col_193(MCNumber value) {
		setConstNumber(offset + 344, $col_193, value);
	}

	public void col_193(int value) {
		setConstNumber(offset + 344, $col_193, value);
	}

	public void col_193(long value) {
		setConstNumber(offset + 344, $col_193, value);
	}

	public void col_193(float value) {
		setConstNumber(offset + 344, $col_193, value);
	}

	public void col_193(double value) {
		setConstNumber(offset + 344, $col_193, value);
	}


	public MCNumber col_194() {
		return getConstNumber(offset + 345, $col_194);
	}

	public void col_194(MCNumber value) {
		setConstNumber(offset + 345, $col_194, value);
	}

	public void col_194(int value) {
		setConstNumber(offset + 345, $col_194, value);
	}

	public void col_194(long value) {
		setConstNumber(offset + 345, $col_194, value);
	}

	public void col_194(float value) {
		setConstNumber(offset + 345, $col_194, value);
	}

	public void col_194(double value) {
		setConstNumber(offset + 345, $col_194, value);
	}


	public MCNumber col_195() {
		return getConstNumber(offset + 346, $col_195);
	}

	public void col_195(MCNumber value) {
		setConstNumber(offset + 346, $col_195, value);
	}

	public void col_195(int value) {
		setConstNumber(offset + 346, $col_195, value);
	}

	public void col_195(long value) {
		setConstNumber(offset + 346, $col_195, value);
	}

	public void col_195(float value) {
		setConstNumber(offset + 346, $col_195, value);
	}

	public void col_195(double value) {
		setConstNumber(offset + 346, $col_195, value);
	}


	public MCNumber col_196() {
		return getConstNumber(offset + 347, $col_196);
	}

	public void col_196(MCNumber value) {
		setConstNumber(offset + 347, $col_196, value);
	}

	public void col_196(int value) {
		setConstNumber(offset + 347, $col_196, value);
	}

	public void col_196(long value) {
		setConstNumber(offset + 347, $col_196, value);
	}

	public void col_196(float value) {
		setConstNumber(offset + 347, $col_196, value);
	}

	public void col_196(double value) {
		setConstNumber(offset + 347, $col_196, value);
	}


	public MCNumber col_197() {
		return getConstNumber(offset + 348, $col_197);
	}

	public void col_197(MCNumber value) {
		setConstNumber(offset + 348, $col_197, value);
	}

	public void col_197(int value) {
		setConstNumber(offset + 348, $col_197, value);
	}

	public void col_197(long value) {
		setConstNumber(offset + 348, $col_197, value);
	}

	public void col_197(float value) {
		setConstNumber(offset + 348, $col_197, value);
	}

	public void col_197(double value) {
		setConstNumber(offset + 348, $col_197, value);
	}


	public MCNumber col_198() {
		return getConstNumber(offset + 349, $col_198);
	}

	public void col_198(MCNumber value) {
		setConstNumber(offset + 349, $col_198, value);
	}

	public void col_198(int value) {
		setConstNumber(offset + 349, $col_198, value);
	}

	public void col_198(long value) {
		setConstNumber(offset + 349, $col_198, value);
	}

	public void col_198(float value) {
		setConstNumber(offset + 349, $col_198, value);
	}

	public void col_198(double value) {
		setConstNumber(offset + 349, $col_198, value);
	}


	public MCNumber col_199() {
		return getConstNumber(offset + 350, $col_199);
	}

	public void col_199(MCNumber value) {
		setConstNumber(offset + 350, $col_199, value);
	}

	public void col_199(int value) {
		setConstNumber(offset + 350, $col_199, value);
	}

	public void col_199(long value) {
		setConstNumber(offset + 350, $col_199, value);
	}

	public void col_199(float value) {
		setConstNumber(offset + 350, $col_199, value);
	}

	public void col_199(double value) {
		setConstNumber(offset + 350, $col_199, value);
	}


	public MCNumber col_200() {
		return getConstNumber(offset + 351, $col_200);
	}

	public void col_200(MCNumber value) {
		setConstNumber(offset + 351, $col_200, value);
	}

	public void col_200(int value) {
		setConstNumber(offset + 351, $col_200, value);
	}

	public void col_200(long value) {
		setConstNumber(offset + 351, $col_200, value);
	}

	public void col_200(float value) {
		setConstNumber(offset + 351, $col_200, value);
	}

	public void col_200(double value) {
		setConstNumber(offset + 351, $col_200, value);
	}


	public MCNumber col_201() {
		return getConstNumber(offset + 352, $col_201);
	}

	public void col_201(MCNumber value) {
		setConstNumber(offset + 352, $col_201, value);
	}

	public void col_201(int value) {
		setConstNumber(offset + 352, $col_201, value);
	}

	public void col_201(long value) {
		setConstNumber(offset + 352, $col_201, value);
	}

	public void col_201(float value) {
		setConstNumber(offset + 352, $col_201, value);
	}

	public void col_201(double value) {
		setConstNumber(offset + 352, $col_201, value);
	}


	public MCNumber col_202() {
		return getConstNumber(offset + 353, $col_202);
	}

	public void col_202(MCNumber value) {
		setConstNumber(offset + 353, $col_202, value);
	}

	public void col_202(int value) {
		setConstNumber(offset + 353, $col_202, value);
	}

	public void col_202(long value) {
		setConstNumber(offset + 353, $col_202, value);
	}

	public void col_202(float value) {
		setConstNumber(offset + 353, $col_202, value);
	}

	public void col_202(double value) {
		setConstNumber(offset + 353, $col_202, value);
	}


	public MCNumber col_203() {
		return getConstNumber(offset + 354, $col_203);
	}

	public void col_203(MCNumber value) {
		setConstNumber(offset + 354, $col_203, value);
	}

	public void col_203(int value) {
		setConstNumber(offset + 354, $col_203, value);
	}

	public void col_203(long value) {
		setConstNumber(offset + 354, $col_203, value);
	}

	public void col_203(float value) {
		setConstNumber(offset + 354, $col_203, value);
	}

	public void col_203(double value) {
		setConstNumber(offset + 354, $col_203, value);
	}


	public MCNumber col_204() {
		return getConstNumber(offset + 355, $col_204);
	}

	public void col_204(MCNumber value) {
		setConstNumber(offset + 355, $col_204, value);
	}

	public void col_204(int value) {
		setConstNumber(offset + 355, $col_204, value);
	}

	public void col_204(long value) {
		setConstNumber(offset + 355, $col_204, value);
	}

	public void col_204(float value) {
		setConstNumber(offset + 355, $col_204, value);
	}

	public void col_204(double value) {
		setConstNumber(offset + 355, $col_204, value);
	}


	public MCNumber col_205() {
		return getConstNumber(offset + 356, $col_205);
	}

	public void col_205(MCNumber value) {
		setConstNumber(offset + 356, $col_205, value);
	}

	public void col_205(int value) {
		setConstNumber(offset + 356, $col_205, value);
	}

	public void col_205(long value) {
		setConstNumber(offset + 356, $col_205, value);
	}

	public void col_205(float value) {
		setConstNumber(offset + 356, $col_205, value);
	}

	public void col_205(double value) {
		setConstNumber(offset + 356, $col_205, value);
	}


	public MCNumber col_206() {
		return getConstNumber(offset + 357, $col_206);
	}

	public void col_206(MCNumber value) {
		setConstNumber(offset + 357, $col_206, value);
	}

	public void col_206(int value) {
		setConstNumber(offset + 357, $col_206, value);
	}

	public void col_206(long value) {
		setConstNumber(offset + 357, $col_206, value);
	}

	public void col_206(float value) {
		setConstNumber(offset + 357, $col_206, value);
	}

	public void col_206(double value) {
		setConstNumber(offset + 357, $col_206, value);
	}


	public MCNumber col_207() {
		return getConstNumber(offset + 358, $col_207);
	}

	public void col_207(MCNumber value) {
		setConstNumber(offset + 358, $col_207, value);
	}

	public void col_207(int value) {
		setConstNumber(offset + 358, $col_207, value);
	}

	public void col_207(long value) {
		setConstNumber(offset + 358, $col_207, value);
	}

	public void col_207(float value) {
		setConstNumber(offset + 358, $col_207, value);
	}

	public void col_207(double value) {
		setConstNumber(offset + 358, $col_207, value);
	}


	public MCNumber col_208() {
		return getConstNumber(offset + 359, $col_208);
	}

	public void col_208(MCNumber value) {
		setConstNumber(offset + 359, $col_208, value);
	}

	public void col_208(int value) {
		setConstNumber(offset + 359, $col_208, value);
	}

	public void col_208(long value) {
		setConstNumber(offset + 359, $col_208, value);
	}

	public void col_208(float value) {
		setConstNumber(offset + 359, $col_208, value);
	}

	public void col_208(double value) {
		setConstNumber(offset + 359, $col_208, value);
	}


	public MCNumber col_209() {
		return getConstNumber(offset + 360, $col_209);
	}

	public void col_209(MCNumber value) {
		setConstNumber(offset + 360, $col_209, value);
	}

	public void col_209(int value) {
		setConstNumber(offset + 360, $col_209, value);
	}

	public void col_209(long value) {
		setConstNumber(offset + 360, $col_209, value);
	}

	public void col_209(float value) {
		setConstNumber(offset + 360, $col_209, value);
	}

	public void col_209(double value) {
		setConstNumber(offset + 360, $col_209, value);
	}


	public MCNumber col_210() {
		return getConstNumber(offset + 361, $col_210);
	}

	public void col_210(MCNumber value) {
		setConstNumber(offset + 361, $col_210, value);
	}

	public void col_210(int value) {
		setConstNumber(offset + 361, $col_210, value);
	}

	public void col_210(long value) {
		setConstNumber(offset + 361, $col_210, value);
	}

	public void col_210(float value) {
		setConstNumber(offset + 361, $col_210, value);
	}

	public void col_210(double value) {
		setConstNumber(offset + 361, $col_210, value);
	}


	public MCNumber col_211() {
		return getConstNumber(offset + 362, $col_211);
	}

	public void col_211(MCNumber value) {
		setConstNumber(offset + 362, $col_211, value);
	}

	public void col_211(int value) {
		setConstNumber(offset + 362, $col_211, value);
	}

	public void col_211(long value) {
		setConstNumber(offset + 362, $col_211, value);
	}

	public void col_211(float value) {
		setConstNumber(offset + 362, $col_211, value);
	}

	public void col_211(double value) {
		setConstNumber(offset + 362, $col_211, value);
	}


	public MCNumber col_212() {
		return getConstNumber(offset + 363, $col_212);
	}

	public void col_212(MCNumber value) {
		setConstNumber(offset + 363, $col_212, value);
	}

	public void col_212(int value) {
		setConstNumber(offset + 363, $col_212, value);
	}

	public void col_212(long value) {
		setConstNumber(offset + 363, $col_212, value);
	}

	public void col_212(float value) {
		setConstNumber(offset + 363, $col_212, value);
	}

	public void col_212(double value) {
		setConstNumber(offset + 363, $col_212, value);
	}


	public MCNumber col_213() {
		return getConstNumber(offset + 364, $col_213);
	}

	public void col_213(MCNumber value) {
		setConstNumber(offset + 364, $col_213, value);
	}

	public void col_213(int value) {
		setConstNumber(offset + 364, $col_213, value);
	}

	public void col_213(long value) {
		setConstNumber(offset + 364, $col_213, value);
	}

	public void col_213(float value) {
		setConstNumber(offset + 364, $col_213, value);
	}

	public void col_213(double value) {
		setConstNumber(offset + 364, $col_213, value);
	}


	public MCNumber col_214() {
		return getConstNumber(offset + 365, $col_214);
	}

	public void col_214(MCNumber value) {
		setConstNumber(offset + 365, $col_214, value);
	}

	public void col_214(int value) {
		setConstNumber(offset + 365, $col_214, value);
	}

	public void col_214(long value) {
		setConstNumber(offset + 365, $col_214, value);
	}

	public void col_214(float value) {
		setConstNumber(offset + 365, $col_214, value);
	}

	public void col_214(double value) {
		setConstNumber(offset + 365, $col_214, value);
	}


	public MCNumber col_215() {
		return getConstNumber(offset + 366, $col_215);
	}

	public void col_215(MCNumber value) {
		setConstNumber(offset + 366, $col_215, value);
	}

	public void col_215(int value) {
		setConstNumber(offset + 366, $col_215, value);
	}

	public void col_215(long value) {
		setConstNumber(offset + 366, $col_215, value);
	}

	public void col_215(float value) {
		setConstNumber(offset + 366, $col_215, value);
	}

	public void col_215(double value) {
		setConstNumber(offset + 366, $col_215, value);
	}


	public MCNumber col_216() {
		return getConstNumber(offset + 367, $col_216);
	}

	public void col_216(MCNumber value) {
		setConstNumber(offset + 367, $col_216, value);
	}

	public void col_216(int value) {
		setConstNumber(offset + 367, $col_216, value);
	}

	public void col_216(long value) {
		setConstNumber(offset + 367, $col_216, value);
	}

	public void col_216(float value) {
		setConstNumber(offset + 367, $col_216, value);
	}

	public void col_216(double value) {
		setConstNumber(offset + 367, $col_216, value);
	}


	public MCNumber col_217() {
		return getConstNumber(offset + 368, $col_217);
	}

	public void col_217(MCNumber value) {
		setConstNumber(offset + 368, $col_217, value);
	}

	public void col_217(int value) {
		setConstNumber(offset + 368, $col_217, value);
	}

	public void col_217(long value) {
		setConstNumber(offset + 368, $col_217, value);
	}

	public void col_217(float value) {
		setConstNumber(offset + 368, $col_217, value);
	}

	public void col_217(double value) {
		setConstNumber(offset + 368, $col_217, value);
	}


	public MCNumber col_218() {
		return getConstNumber(offset + 369, $col_218);
	}

	public void col_218(MCNumber value) {
		setConstNumber(offset + 369, $col_218, value);
	}

	public void col_218(int value) {
		setConstNumber(offset + 369, $col_218, value);
	}

	public void col_218(long value) {
		setConstNumber(offset + 369, $col_218, value);
	}

	public void col_218(float value) {
		setConstNumber(offset + 369, $col_218, value);
	}

	public void col_218(double value) {
		setConstNumber(offset + 369, $col_218, value);
	}


	public MCNumber col_219() {
		return getConstNumber(offset + 370, $col_219);
	}

	public void col_219(MCNumber value) {
		setConstNumber(offset + 370, $col_219, value);
	}

	public void col_219(int value) {
		setConstNumber(offset + 370, $col_219, value);
	}

	public void col_219(long value) {
		setConstNumber(offset + 370, $col_219, value);
	}

	public void col_219(float value) {
		setConstNumber(offset + 370, $col_219, value);
	}

	public void col_219(double value) {
		setConstNumber(offset + 370, $col_219, value);
	}


	public MCNumber col_220() {
		return getConstNumber(offset + 371, $col_220);
	}

	public void col_220(MCNumber value) {
		setConstNumber(offset + 371, $col_220, value);
	}

	public void col_220(int value) {
		setConstNumber(offset + 371, $col_220, value);
	}

	public void col_220(long value) {
		setConstNumber(offset + 371, $col_220, value);
	}

	public void col_220(float value) {
		setConstNumber(offset + 371, $col_220, value);
	}

	public void col_220(double value) {
		setConstNumber(offset + 371, $col_220, value);
	}


	public MCNumber col_221() {
		return getConstNumber(offset + 372, $col_221);
	}

	public void col_221(MCNumber value) {
		setConstNumber(offset + 372, $col_221, value);
	}

	public void col_221(int value) {
		setConstNumber(offset + 372, $col_221, value);
	}

	public void col_221(long value) {
		setConstNumber(offset + 372, $col_221, value);
	}

	public void col_221(float value) {
		setConstNumber(offset + 372, $col_221, value);
	}

	public void col_221(double value) {
		setConstNumber(offset + 372, $col_221, value);
	}


	public MCNumber col_222() {
		return getConstNumber(offset + 373, $col_222);
	}

	public void col_222(MCNumber value) {
		setConstNumber(offset + 373, $col_222, value);
	}

	public void col_222(int value) {
		setConstNumber(offset + 373, $col_222, value);
	}

	public void col_222(long value) {
		setConstNumber(offset + 373, $col_222, value);
	}

	public void col_222(float value) {
		setConstNumber(offset + 373, $col_222, value);
	}

	public void col_222(double value) {
		setConstNumber(offset + 373, $col_222, value);
	}


	public MCNumber col_223() {
		return getConstNumber(offset + 374, $col_223);
	}

	public void col_223(MCNumber value) {
		setConstNumber(offset + 374, $col_223, value);
	}

	public void col_223(int value) {
		setConstNumber(offset + 374, $col_223, value);
	}

	public void col_223(long value) {
		setConstNumber(offset + 374, $col_223, value);
	}

	public void col_223(float value) {
		setConstNumber(offset + 374, $col_223, value);
	}

	public void col_223(double value) {
		setConstNumber(offset + 374, $col_223, value);
	}


	public MCNumber col_224() {
		return getConstNumber(offset + 375, $col_224);
	}

	public void col_224(MCNumber value) {
		setConstNumber(offset + 375, $col_224, value);
	}

	public void col_224(int value) {
		setConstNumber(offset + 375, $col_224, value);
	}

	public void col_224(long value) {
		setConstNumber(offset + 375, $col_224, value);
	}

	public void col_224(float value) {
		setConstNumber(offset + 375, $col_224, value);
	}

	public void col_224(double value) {
		setConstNumber(offset + 375, $col_224, value);
	}


	public MCNumber col_225() {
		return getConstNumber(offset + 376, $col_225);
	}

	public void col_225(MCNumber value) {
		setConstNumber(offset + 376, $col_225, value);
	}

	public void col_225(int value) {
		setConstNumber(offset + 376, $col_225, value);
	}

	public void col_225(long value) {
		setConstNumber(offset + 376, $col_225, value);
	}

	public void col_225(float value) {
		setConstNumber(offset + 376, $col_225, value);
	}

	public void col_225(double value) {
		setConstNumber(offset + 376, $col_225, value);
	}


	public MCNumber col_226() {
		return getConstNumber(offset + 377, $col_226);
	}

	public void col_226(MCNumber value) {
		setConstNumber(offset + 377, $col_226, value);
	}

	public void col_226(int value) {
		setConstNumber(offset + 377, $col_226, value);
	}

	public void col_226(long value) {
		setConstNumber(offset + 377, $col_226, value);
	}

	public void col_226(float value) {
		setConstNumber(offset + 377, $col_226, value);
	}

	public void col_226(double value) {
		setConstNumber(offset + 377, $col_226, value);
	}


	public MCNumber col_227() {
		return getConstNumber(offset + 378, $col_227);
	}

	public void col_227(MCNumber value) {
		setConstNumber(offset + 378, $col_227, value);
	}

	public void col_227(int value) {
		setConstNumber(offset + 378, $col_227, value);
	}

	public void col_227(long value) {
		setConstNumber(offset + 378, $col_227, value);
	}

	public void col_227(float value) {
		setConstNumber(offset + 378, $col_227, value);
	}

	public void col_227(double value) {
		setConstNumber(offset + 378, $col_227, value);
	}


	public MCNumber col_228() {
		return getConstNumber(offset + 379, $col_228);
	}

	public void col_228(MCNumber value) {
		setConstNumber(offset + 379, $col_228, value);
	}

	public void col_228(int value) {
		setConstNumber(offset + 379, $col_228, value);
	}

	public void col_228(long value) {
		setConstNumber(offset + 379, $col_228, value);
	}

	public void col_228(float value) {
		setConstNumber(offset + 379, $col_228, value);
	}

	public void col_228(double value) {
		setConstNumber(offset + 379, $col_228, value);
	}


	public MCNumber col_229() {
		return getConstNumber(offset + 380, $col_229);
	}

	public void col_229(MCNumber value) {
		setConstNumber(offset + 380, $col_229, value);
	}

	public void col_229(int value) {
		setConstNumber(offset + 380, $col_229, value);
	}

	public void col_229(long value) {
		setConstNumber(offset + 380, $col_229, value);
	}

	public void col_229(float value) {
		setConstNumber(offset + 380, $col_229, value);
	}

	public void col_229(double value) {
		setConstNumber(offset + 380, $col_229, value);
	}


	public MCNumber col_230() {
		return getConstNumber(offset + 381, $col_230);
	}

	public void col_230(MCNumber value) {
		setConstNumber(offset + 381, $col_230, value);
	}

	public void col_230(int value) {
		setConstNumber(offset + 381, $col_230, value);
	}

	public void col_230(long value) {
		setConstNumber(offset + 381, $col_230, value);
	}

	public void col_230(float value) {
		setConstNumber(offset + 381, $col_230, value);
	}

	public void col_230(double value) {
		setConstNumber(offset + 381, $col_230, value);
	}


	public MCNumber col_231() {
		return getConstNumber(offset + 382, $col_231);
	}

	public void col_231(MCNumber value) {
		setConstNumber(offset + 382, $col_231, value);
	}

	public void col_231(int value) {
		setConstNumber(offset + 382, $col_231, value);
	}

	public void col_231(long value) {
		setConstNumber(offset + 382, $col_231, value);
	}

	public void col_231(float value) {
		setConstNumber(offset + 382, $col_231, value);
	}

	public void col_231(double value) {
		setConstNumber(offset + 382, $col_231, value);
	}


	public MCNumber col_232() {
		return getConstNumber(offset + 383, $col_232);
	}

	public void col_232(MCNumber value) {
		setConstNumber(offset + 383, $col_232, value);
	}

	public void col_232(int value) {
		setConstNumber(offset + 383, $col_232, value);
	}

	public void col_232(long value) {
		setConstNumber(offset + 383, $col_232, value);
	}

	public void col_232(float value) {
		setConstNumber(offset + 383, $col_232, value);
	}

	public void col_232(double value) {
		setConstNumber(offset + 383, $col_232, value);
	}


	public MCNumber col_233() {
		return getConstNumber(offset + 384, $col_233);
	}

	public void col_233(MCNumber value) {
		setConstNumber(offset + 384, $col_233, value);
	}

	public void col_233(int value) {
		setConstNumber(offset + 384, $col_233, value);
	}

	public void col_233(long value) {
		setConstNumber(offset + 384, $col_233, value);
	}

	public void col_233(float value) {
		setConstNumber(offset + 384, $col_233, value);
	}

	public void col_233(double value) {
		setConstNumber(offset + 384, $col_233, value);
	}


	public MCNumber col_234() {
		return getConstNumber(offset + 385, $col_234);
	}

	public void col_234(MCNumber value) {
		setConstNumber(offset + 385, $col_234, value);
	}

	public void col_234(int value) {
		setConstNumber(offset + 385, $col_234, value);
	}

	public void col_234(long value) {
		setConstNumber(offset + 385, $col_234, value);
	}

	public void col_234(float value) {
		setConstNumber(offset + 385, $col_234, value);
	}

	public void col_234(double value) {
		setConstNumber(offset + 385, $col_234, value);
	}


	public MCNumber col_235() {
		return getConstNumber(offset + 386, $col_235);
	}

	public void col_235(MCNumber value) {
		setConstNumber(offset + 386, $col_235, value);
	}

	public void col_235(int value) {
		setConstNumber(offset + 386, $col_235, value);
	}

	public void col_235(long value) {
		setConstNumber(offset + 386, $col_235, value);
	}

	public void col_235(float value) {
		setConstNumber(offset + 386, $col_235, value);
	}

	public void col_235(double value) {
		setConstNumber(offset + 386, $col_235, value);
	}


	public MCNumber col_236() {
		return getConstNumber(offset + 387, $col_236);
	}

	public void col_236(MCNumber value) {
		setConstNumber(offset + 387, $col_236, value);
	}

	public void col_236(int value) {
		setConstNumber(offset + 387, $col_236, value);
	}

	public void col_236(long value) {
		setConstNumber(offset + 387, $col_236, value);
	}

	public void col_236(float value) {
		setConstNumber(offset + 387, $col_236, value);
	}

	public void col_236(double value) {
		setConstNumber(offset + 387, $col_236, value);
	}


	public MCNumber col_237() {
		return getConstNumber(offset + 388, $col_237);
	}

	public void col_237(MCNumber value) {
		setConstNumber(offset + 388, $col_237, value);
	}

	public void col_237(int value) {
		setConstNumber(offset + 388, $col_237, value);
	}

	public void col_237(long value) {
		setConstNumber(offset + 388, $col_237, value);
	}

	public void col_237(float value) {
		setConstNumber(offset + 388, $col_237, value);
	}

	public void col_237(double value) {
		setConstNumber(offset + 388, $col_237, value);
	}


	public MCNumber col_238() {
		return getConstNumber(offset + 389, $col_238);
	}

	public void col_238(MCNumber value) {
		setConstNumber(offset + 389, $col_238, value);
	}

	public void col_238(int value) {
		setConstNumber(offset + 389, $col_238, value);
	}

	public void col_238(long value) {
		setConstNumber(offset + 389, $col_238, value);
	}

	public void col_238(float value) {
		setConstNumber(offset + 389, $col_238, value);
	}

	public void col_238(double value) {
		setConstNumber(offset + 389, $col_238, value);
	}


	public MCNumber col_239() {
		return getConstNumber(offset + 390, $col_239);
	}

	public void col_239(MCNumber value) {
		setConstNumber(offset + 390, $col_239, value);
	}

	public void col_239(int value) {
		setConstNumber(offset + 390, $col_239, value);
	}

	public void col_239(long value) {
		setConstNumber(offset + 390, $col_239, value);
	}

	public void col_239(float value) {
		setConstNumber(offset + 390, $col_239, value);
	}

	public void col_239(double value) {
		setConstNumber(offset + 390, $col_239, value);
	}


	public MCNumber col_240() {
		return getConstNumber(offset + 391, $col_240);
	}

	public void col_240(MCNumber value) {
		setConstNumber(offset + 391, $col_240, value);
	}

	public void col_240(int value) {
		setConstNumber(offset + 391, $col_240, value);
	}

	public void col_240(long value) {
		setConstNumber(offset + 391, $col_240, value);
	}

	public void col_240(float value) {
		setConstNumber(offset + 391, $col_240, value);
	}

	public void col_240(double value) {
		setConstNumber(offset + 391, $col_240, value);
	}


	public MCNumber col_241() {
		return getConstNumber(offset + 392, $col_241);
	}

	public void col_241(MCNumber value) {
		setConstNumber(offset + 392, $col_241, value);
	}

	public void col_241(int value) {
		setConstNumber(offset + 392, $col_241, value);
	}

	public void col_241(long value) {
		setConstNumber(offset + 392, $col_241, value);
	}

	public void col_241(float value) {
		setConstNumber(offset + 392, $col_241, value);
	}

	public void col_241(double value) {
		setConstNumber(offset + 392, $col_241, value);
	}


	public MCNumber col_242() {
		return getConstNumber(offset + 393, $col_242);
	}

	public void col_242(MCNumber value) {
		setConstNumber(offset + 393, $col_242, value);
	}

	public void col_242(int value) {
		setConstNumber(offset + 393, $col_242, value);
	}

	public void col_242(long value) {
		setConstNumber(offset + 393, $col_242, value);
	}

	public void col_242(float value) {
		setConstNumber(offset + 393, $col_242, value);
	}

	public void col_242(double value) {
		setConstNumber(offset + 393, $col_242, value);
	}


	public MCNumber col_243() {
		return getConstNumber(offset + 394, $col_243);
	}

	public void col_243(MCNumber value) {
		setConstNumber(offset + 394, $col_243, value);
	}

	public void col_243(int value) {
		setConstNumber(offset + 394, $col_243, value);
	}

	public void col_243(long value) {
		setConstNumber(offset + 394, $col_243, value);
	}

	public void col_243(float value) {
		setConstNumber(offset + 394, $col_243, value);
	}

	public void col_243(double value) {
		setConstNumber(offset + 394, $col_243, value);
	}


	public MCNumber col_244() {
		return getConstNumber(offset + 395, $col_244);
	}

	public void col_244(MCNumber value) {
		setConstNumber(offset + 395, $col_244, value);
	}

	public void col_244(int value) {
		setConstNumber(offset + 395, $col_244, value);
	}

	public void col_244(long value) {
		setConstNumber(offset + 395, $col_244, value);
	}

	public void col_244(float value) {
		setConstNumber(offset + 395, $col_244, value);
	}

	public void col_244(double value) {
		setConstNumber(offset + 395, $col_244, value);
	}


	public MCNumber col_245() {
		return getConstNumber(offset + 396, $col_245);
	}

	public void col_245(MCNumber value) {
		setConstNumber(offset + 396, $col_245, value);
	}

	public void col_245(int value) {
		setConstNumber(offset + 396, $col_245, value);
	}

	public void col_245(long value) {
		setConstNumber(offset + 396, $col_245, value);
	}

	public void col_245(float value) {
		setConstNumber(offset + 396, $col_245, value);
	}

	public void col_245(double value) {
		setConstNumber(offset + 396, $col_245, value);
	}


	public MCNumber col_246() {
		return getConstNumber(offset + 397, $col_246);
	}

	public void col_246(MCNumber value) {
		setConstNumber(offset + 397, $col_246, value);
	}

	public void col_246(int value) {
		setConstNumber(offset + 397, $col_246, value);
	}

	public void col_246(long value) {
		setConstNumber(offset + 397, $col_246, value);
	}

	public void col_246(float value) {
		setConstNumber(offset + 397, $col_246, value);
	}

	public void col_246(double value) {
		setConstNumber(offset + 397, $col_246, value);
	}


	public MCNumber col_247() {
		return getConstNumber(offset + 398, $col_247);
	}

	public void col_247(MCNumber value) {
		setConstNumber(offset + 398, $col_247, value);
	}

	public void col_247(int value) {
		setConstNumber(offset + 398, $col_247, value);
	}

	public void col_247(long value) {
		setConstNumber(offset + 398, $col_247, value);
	}

	public void col_247(float value) {
		setConstNumber(offset + 398, $col_247, value);
	}

	public void col_247(double value) {
		setConstNumber(offset + 398, $col_247, value);
	}


	public MCNumber col_248() {
		return getConstNumber(offset + 399, $col_248);
	}

	public void col_248(MCNumber value) {
		setConstNumber(offset + 399, $col_248, value);
	}

	public void col_248(int value) {
		setConstNumber(offset + 399, $col_248, value);
	}

	public void col_248(long value) {
		setConstNumber(offset + 399, $col_248, value);
	}

	public void col_248(float value) {
		setConstNumber(offset + 399, $col_248, value);
	}

	public void col_248(double value) {
		setConstNumber(offset + 399, $col_248, value);
	}


	public MCNumber col_249() {
		return getConstNumber(offset + 400, $col_249);
	}

	public void col_249(MCNumber value) {
		setConstNumber(offset + 400, $col_249, value);
	}

	public void col_249(int value) {
		setConstNumber(offset + 400, $col_249, value);
	}

	public void col_249(long value) {
		setConstNumber(offset + 400, $col_249, value);
	}

	public void col_249(float value) {
		setConstNumber(offset + 400, $col_249, value);
	}

	public void col_249(double value) {
		setConstNumber(offset + 400, $col_249, value);
	}


	public MCNumber col_250() {
		return getConstNumber(offset + 401, $col_250);
	}

	public void col_250(MCNumber value) {
		setConstNumber(offset + 401, $col_250, value);
	}

	public void col_250(int value) {
		setConstNumber(offset + 401, $col_250, value);
	}

	public void col_250(long value) {
		setConstNumber(offset + 401, $col_250, value);
	}

	public void col_250(float value) {
		setConstNumber(offset + 401, $col_250, value);
	}

	public void col_250(double value) {
		setConstNumber(offset + 401, $col_250, value);
	}


	public MCNumber col_251() {
		return getConstNumber(offset + 402, $col_251);
	}

	public void col_251(MCNumber value) {
		setConstNumber(offset + 402, $col_251, value);
	}

	public void col_251(int value) {
		setConstNumber(offset + 402, $col_251, value);
	}

	public void col_251(long value) {
		setConstNumber(offset + 402, $col_251, value);
	}

	public void col_251(float value) {
		setConstNumber(offset + 402, $col_251, value);
	}

	public void col_251(double value) {
		setConstNumber(offset + 402, $col_251, value);
	}


	public MCNumber col_252() {
		return getConstNumber(offset + 403, $col_252);
	}

	public void col_252(MCNumber value) {
		setConstNumber(offset + 403, $col_252, value);
	}

	public void col_252(int value) {
		setConstNumber(offset + 403, $col_252, value);
	}

	public void col_252(long value) {
		setConstNumber(offset + 403, $col_252, value);
	}

	public void col_252(float value) {
		setConstNumber(offset + 403, $col_252, value);
	}

	public void col_252(double value) {
		setConstNumber(offset + 403, $col_252, value);
	}


	public MCNumber col_253() {
		return getConstNumber(offset + 404, $col_253);
	}

	public void col_253(MCNumber value) {
		setConstNumber(offset + 404, $col_253, value);
	}

	public void col_253(int value) {
		setConstNumber(offset + 404, $col_253, value);
	}

	public void col_253(long value) {
		setConstNumber(offset + 404, $col_253, value);
	}

	public void col_253(float value) {
		setConstNumber(offset + 404, $col_253, value);
	}

	public void col_253(double value) {
		setConstNumber(offset + 404, $col_253, value);
	}


	public MCNumber col_254() {
		return getConstNumber(offset + 405, $col_254);
	}

	public void col_254(MCNumber value) {
		setConstNumber(offset + 405, $col_254, value);
	}

	public void col_254(int value) {
		setConstNumber(offset + 405, $col_254, value);
	}

	public void col_254(long value) {
		setConstNumber(offset + 405, $col_254, value);
	}

	public void col_254(float value) {
		setConstNumber(offset + 405, $col_254, value);
	}

	public void col_254(double value) {
		setConstNumber(offset + 405, $col_254, value);
	}


	public MCNumber col_255() {
		return getConstNumber(offset + 406, $col_255);
	}

	public void col_255(MCNumber value) {
		setConstNumber(offset + 406, $col_255, value);
	}

	public void col_255(int value) {
		setConstNumber(offset + 406, $col_255, value);
	}

	public void col_255(long value) {
		setConstNumber(offset + 406, $col_255, value);
	}

	public void col_255(float value) {
		setConstNumber(offset + 406, $col_255, value);
	}

	public void col_255(double value) {
		setConstNumber(offset + 406, $col_255, value);
	}


	public MCNumber col_256() {
		return getConstNumber(offset + 407, $col_256);
	}

	public void col_256(MCNumber value) {
		setConstNumber(offset + 407, $col_256, value);
	}

	public void col_256(int value) {
		setConstNumber(offset + 407, $col_256, value);
	}

	public void col_256(long value) {
		setConstNumber(offset + 407, $col_256, value);
	}

	public void col_256(float value) {
		setConstNumber(offset + 407, $col_256, value);
	}

	public void col_256(double value) {
		setConstNumber(offset + 407, $col_256, value);
	}


	public MCNumber col_257() {
		return getConstNumber(offset + 408, $col_257);
	}

	public void col_257(MCNumber value) {
		setConstNumber(offset + 408, $col_257, value);
	}

	public void col_257(int value) {
		setConstNumber(offset + 408, $col_257, value);
	}

	public void col_257(long value) {
		setConstNumber(offset + 408, $col_257, value);
	}

	public void col_257(float value) {
		setConstNumber(offset + 408, $col_257, value);
	}

	public void col_257(double value) {
		setConstNumber(offset + 408, $col_257, value);
	}


	public MCNumber col_258() {
		return getConstNumber(offset + 409, $col_258);
	}

	public void col_258(MCNumber value) {
		setConstNumber(offset + 409, $col_258, value);
	}

	public void col_258(int value) {
		setConstNumber(offset + 409, $col_258, value);
	}

	public void col_258(long value) {
		setConstNumber(offset + 409, $col_258, value);
	}

	public void col_258(float value) {
		setConstNumber(offset + 409, $col_258, value);
	}

	public void col_258(double value) {
		setConstNumber(offset + 409, $col_258, value);
	}


	public MCNumber col_259() {
		return getConstNumber(offset + 410, $col_259);
	}

	public void col_259(MCNumber value) {
		setConstNumber(offset + 410, $col_259, value);
	}

	public void col_259(int value) {
		setConstNumber(offset + 410, $col_259, value);
	}

	public void col_259(long value) {
		setConstNumber(offset + 410, $col_259, value);
	}

	public void col_259(float value) {
		setConstNumber(offset + 410, $col_259, value);
	}

	public void col_259(double value) {
		setConstNumber(offset + 410, $col_259, value);
	}


	public MCNumber col_260() {
		return getConstNumber(offset + 411, $col_260);
	}

	public void col_260(MCNumber value) {
		setConstNumber(offset + 411, $col_260, value);
	}

	public void col_260(int value) {
		setConstNumber(offset + 411, $col_260, value);
	}

	public void col_260(long value) {
		setConstNumber(offset + 411, $col_260, value);
	}

	public void col_260(float value) {
		setConstNumber(offset + 411, $col_260, value);
	}

	public void col_260(double value) {
		setConstNumber(offset + 411, $col_260, value);
	}


	public MCNumber col_261() {
		return getConstNumber(offset + 412, $col_261);
	}

	public void col_261(MCNumber value) {
		setConstNumber(offset + 412, $col_261, value);
	}

	public void col_261(int value) {
		setConstNumber(offset + 412, $col_261, value);
	}

	public void col_261(long value) {
		setConstNumber(offset + 412, $col_261, value);
	}

	public void col_261(float value) {
		setConstNumber(offset + 412, $col_261, value);
	}

	public void col_261(double value) {
		setConstNumber(offset + 412, $col_261, value);
	}


	public MCNumber col_262() {
		return getConstNumber(offset + 413, $col_262);
	}

	public void col_262(MCNumber value) {
		setConstNumber(offset + 413, $col_262, value);
	}

	public void col_262(int value) {
		setConstNumber(offset + 413, $col_262, value);
	}

	public void col_262(long value) {
		setConstNumber(offset + 413, $col_262, value);
	}

	public void col_262(float value) {
		setConstNumber(offset + 413, $col_262, value);
	}

	public void col_262(double value) {
		setConstNumber(offset + 413, $col_262, value);
	}


	public MCNumber col_263() {
		return getConstNumber(offset + 414, $col_263);
	}

	public void col_263(MCNumber value) {
		setConstNumber(offset + 414, $col_263, value);
	}

	public void col_263(int value) {
		setConstNumber(offset + 414, $col_263, value);
	}

	public void col_263(long value) {
		setConstNumber(offset + 414, $col_263, value);
	}

	public void col_263(float value) {
		setConstNumber(offset + 414, $col_263, value);
	}

	public void col_263(double value) {
		setConstNumber(offset + 414, $col_263, value);
	}


	public MCNumber col_264() {
		return getConstNumber(offset + 415, $col_264);
	}

	public void col_264(MCNumber value) {
		setConstNumber(offset + 415, $col_264, value);
	}

	public void col_264(int value) {
		setConstNumber(offset + 415, $col_264, value);
	}

	public void col_264(long value) {
		setConstNumber(offset + 415, $col_264, value);
	}

	public void col_264(float value) {
		setConstNumber(offset + 415, $col_264, value);
	}

	public void col_264(double value) {
		setConstNumber(offset + 415, $col_264, value);
	}


	public MCNumber col_265() {
		return getConstNumber(offset + 416, $col_265);
	}

	public void col_265(MCNumber value) {
		setConstNumber(offset + 416, $col_265, value);
	}

	public void col_265(int value) {
		setConstNumber(offset + 416, $col_265, value);
	}

	public void col_265(long value) {
		setConstNumber(offset + 416, $col_265, value);
	}

	public void col_265(float value) {
		setConstNumber(offset + 416, $col_265, value);
	}

	public void col_265(double value) {
		setConstNumber(offset + 416, $col_265, value);
	}


	public MCNumber col_266() {
		return getConstNumber(offset + 417, $col_266);
	}

	public void col_266(MCNumber value) {
		setConstNumber(offset + 417, $col_266, value);
	}

	public void col_266(int value) {
		setConstNumber(offset + 417, $col_266, value);
	}

	public void col_266(long value) {
		setConstNumber(offset + 417, $col_266, value);
	}

	public void col_266(float value) {
		setConstNumber(offset + 417, $col_266, value);
	}

	public void col_266(double value) {
		setConstNumber(offset + 417, $col_266, value);
	}


	public MCNumber col_267() {
		return getConstNumber(offset + 418, $col_267);
	}

	public void col_267(MCNumber value) {
		setConstNumber(offset + 418, $col_267, value);
	}

	public void col_267(int value) {
		setConstNumber(offset + 418, $col_267, value);
	}

	public void col_267(long value) {
		setConstNumber(offset + 418, $col_267, value);
	}

	public void col_267(float value) {
		setConstNumber(offset + 418, $col_267, value);
	}

	public void col_267(double value) {
		setConstNumber(offset + 418, $col_267, value);
	}


	public MCNumber col_268() {
		return getConstNumber(offset + 419, $col_268);
	}

	public void col_268(MCNumber value) {
		setConstNumber(offset + 419, $col_268, value);
	}

	public void col_268(int value) {
		setConstNumber(offset + 419, $col_268, value);
	}

	public void col_268(long value) {
		setConstNumber(offset + 419, $col_268, value);
	}

	public void col_268(float value) {
		setConstNumber(offset + 419, $col_268, value);
	}

	public void col_268(double value) {
		setConstNumber(offset + 419, $col_268, value);
	}


	public MCNumber col_269() {
		return getConstNumber(offset + 420, $col_269);
	}

	public void col_269(MCNumber value) {
		setConstNumber(offset + 420, $col_269, value);
	}

	public void col_269(int value) {
		setConstNumber(offset + 420, $col_269, value);
	}

	public void col_269(long value) {
		setConstNumber(offset + 420, $col_269, value);
	}

	public void col_269(float value) {
		setConstNumber(offset + 420, $col_269, value);
	}

	public void col_269(double value) {
		setConstNumber(offset + 420, $col_269, value);
	}


	public MCNumber col_270() {
		return getConstNumber(offset + 421, $col_270);
	}

	public void col_270(MCNumber value) {
		setConstNumber(offset + 421, $col_270, value);
	}

	public void col_270(int value) {
		setConstNumber(offset + 421, $col_270, value);
	}

	public void col_270(long value) {
		setConstNumber(offset + 421, $col_270, value);
	}

	public void col_270(float value) {
		setConstNumber(offset + 421, $col_270, value);
	}

	public void col_270(double value) {
		setConstNumber(offset + 421, $col_270, value);
	}


	public MCNumber col_271() {
		return getConstNumber(offset + 422, $col_271);
	}

	public void col_271(MCNumber value) {
		setConstNumber(offset + 422, $col_271, value);
	}

	public void col_271(int value) {
		setConstNumber(offset + 422, $col_271, value);
	}

	public void col_271(long value) {
		setConstNumber(offset + 422, $col_271, value);
	}

	public void col_271(float value) {
		setConstNumber(offset + 422, $col_271, value);
	}

	public void col_271(double value) {
		setConstNumber(offset + 422, $col_271, value);
	}


	public MCNumber col_272() {
		return getConstNumber(offset + 423, $col_272);
	}

	public void col_272(MCNumber value) {
		setConstNumber(offset + 423, $col_272, value);
	}

	public void col_272(int value) {
		setConstNumber(offset + 423, $col_272, value);
	}

	public void col_272(long value) {
		setConstNumber(offset + 423, $col_272, value);
	}

	public void col_272(float value) {
		setConstNumber(offset + 423, $col_272, value);
	}

	public void col_272(double value) {
		setConstNumber(offset + 423, $col_272, value);
	}


	public MCNumber col_273() {
		return getConstNumber(offset + 424, $col_273);
	}

	public void col_273(MCNumber value) {
		setConstNumber(offset + 424, $col_273, value);
	}

	public void col_273(int value) {
		setConstNumber(offset + 424, $col_273, value);
	}

	public void col_273(long value) {
		setConstNumber(offset + 424, $col_273, value);
	}

	public void col_273(float value) {
		setConstNumber(offset + 424, $col_273, value);
	}

	public void col_273(double value) {
		setConstNumber(offset + 424, $col_273, value);
	}


	public MCNumber col_274() {
		return getConstNumber(offset + 425, $col_274);
	}

	public void col_274(MCNumber value) {
		setConstNumber(offset + 425, $col_274, value);
	}

	public void col_274(int value) {
		setConstNumber(offset + 425, $col_274, value);
	}

	public void col_274(long value) {
		setConstNumber(offset + 425, $col_274, value);
	}

	public void col_274(float value) {
		setConstNumber(offset + 425, $col_274, value);
	}

	public void col_274(double value) {
		setConstNumber(offset + 425, $col_274, value);
	}


	public MCNumber col_275() {
		return getConstNumber(offset + 426, $col_275);
	}

	public void col_275(MCNumber value) {
		setConstNumber(offset + 426, $col_275, value);
	}

	public void col_275(int value) {
		setConstNumber(offset + 426, $col_275, value);
	}

	public void col_275(long value) {
		setConstNumber(offset + 426, $col_275, value);
	}

	public void col_275(float value) {
		setConstNumber(offset + 426, $col_275, value);
	}

	public void col_275(double value) {
		setConstNumber(offset + 426, $col_275, value);
	}


	public MCNumber col_276() {
		return getConstNumber(offset + 427, $col_276);
	}

	public void col_276(MCNumber value) {
		setConstNumber(offset + 427, $col_276, value);
	}

	public void col_276(int value) {
		setConstNumber(offset + 427, $col_276, value);
	}

	public void col_276(long value) {
		setConstNumber(offset + 427, $col_276, value);
	}

	public void col_276(float value) {
		setConstNumber(offset + 427, $col_276, value);
	}

	public void col_276(double value) {
		setConstNumber(offset + 427, $col_276, value);
	}


	public MCNumber col_277() {
		return getConstNumber(offset + 428, $col_277);
	}

	public void col_277(MCNumber value) {
		setConstNumber(offset + 428, $col_277, value);
	}

	public void col_277(int value) {
		setConstNumber(offset + 428, $col_277, value);
	}

	public void col_277(long value) {
		setConstNumber(offset + 428, $col_277, value);
	}

	public void col_277(float value) {
		setConstNumber(offset + 428, $col_277, value);
	}

	public void col_277(double value) {
		setConstNumber(offset + 428, $col_277, value);
	}


	public MCNumber col_278() {
		return getConstNumber(offset + 429, $col_278);
	}

	public void col_278(MCNumber value) {
		setConstNumber(offset + 429, $col_278, value);
	}

	public void col_278(int value) {
		setConstNumber(offset + 429, $col_278, value);
	}

	public void col_278(long value) {
		setConstNumber(offset + 429, $col_278, value);
	}

	public void col_278(float value) {
		setConstNumber(offset + 429, $col_278, value);
	}

	public void col_278(double value) {
		setConstNumber(offset + 429, $col_278, value);
	}


	public MCNumber col_279() {
		return getConstNumber(offset + 430, $col_279);
	}

	public void col_279(MCNumber value) {
		setConstNumber(offset + 430, $col_279, value);
	}

	public void col_279(int value) {
		setConstNumber(offset + 430, $col_279, value);
	}

	public void col_279(long value) {
		setConstNumber(offset + 430, $col_279, value);
	}

	public void col_279(float value) {
		setConstNumber(offset + 430, $col_279, value);
	}

	public void col_279(double value) {
		setConstNumber(offset + 430, $col_279, value);
	}


	public MCNumber col_280() {
		return getConstNumber(offset + 431, $col_280);
	}

	public void col_280(MCNumber value) {
		setConstNumber(offset + 431, $col_280, value);
	}

	public void col_280(int value) {
		setConstNumber(offset + 431, $col_280, value);
	}

	public void col_280(long value) {
		setConstNumber(offset + 431, $col_280, value);
	}

	public void col_280(float value) {
		setConstNumber(offset + 431, $col_280, value);
	}

	public void col_280(double value) {
		setConstNumber(offset + 431, $col_280, value);
	}


	public MCNumber col_281() {
		return getConstNumber(offset + 432, $col_281);
	}

	public void col_281(MCNumber value) {
		setConstNumber(offset + 432, $col_281, value);
	}

	public void col_281(int value) {
		setConstNumber(offset + 432, $col_281, value);
	}

	public void col_281(long value) {
		setConstNumber(offset + 432, $col_281, value);
	}

	public void col_281(float value) {
		setConstNumber(offset + 432, $col_281, value);
	}

	public void col_281(double value) {
		setConstNumber(offset + 432, $col_281, value);
	}


	public MCNumber col_282() {
		return getConstNumber(offset + 433, $col_282);
	}

	public void col_282(MCNumber value) {
		setConstNumber(offset + 433, $col_282, value);
	}

	public void col_282(int value) {
		setConstNumber(offset + 433, $col_282, value);
	}

	public void col_282(long value) {
		setConstNumber(offset + 433, $col_282, value);
	}

	public void col_282(float value) {
		setConstNumber(offset + 433, $col_282, value);
	}

	public void col_282(double value) {
		setConstNumber(offset + 433, $col_282, value);
	}


	public MCNumber col_283() {
		return getConstNumber(offset + 434, $col_283);
	}

	public void col_283(MCNumber value) {
		setConstNumber(offset + 434, $col_283, value);
	}

	public void col_283(int value) {
		setConstNumber(offset + 434, $col_283, value);
	}

	public void col_283(long value) {
		setConstNumber(offset + 434, $col_283, value);
	}

	public void col_283(float value) {
		setConstNumber(offset + 434, $col_283, value);
	}

	public void col_283(double value) {
		setConstNumber(offset + 434, $col_283, value);
	}


	public MCNumber col_284() {
		return getConstNumber(offset + 435, $col_284);
	}

	public void col_284(MCNumber value) {
		setConstNumber(offset + 435, $col_284, value);
	}

	public void col_284(int value) {
		setConstNumber(offset + 435, $col_284, value);
	}

	public void col_284(long value) {
		setConstNumber(offset + 435, $col_284, value);
	}

	public void col_284(float value) {
		setConstNumber(offset + 435, $col_284, value);
	}

	public void col_284(double value) {
		setConstNumber(offset + 435, $col_284, value);
	}


	public MCNumber col_285() {
		return getConstNumber(offset + 436, $col_285);
	}

	public void col_285(MCNumber value) {
		setConstNumber(offset + 436, $col_285, value);
	}

	public void col_285(int value) {
		setConstNumber(offset + 436, $col_285, value);
	}

	public void col_285(long value) {
		setConstNumber(offset + 436, $col_285, value);
	}

	public void col_285(float value) {
		setConstNumber(offset + 436, $col_285, value);
	}

	public void col_285(double value) {
		setConstNumber(offset + 436, $col_285, value);
	}


	public MCNumber col_286() {
		return getConstNumber(offset + 437, $col_286);
	}

	public void col_286(MCNumber value) {
		setConstNumber(offset + 437, $col_286, value);
	}

	public void col_286(int value) {
		setConstNumber(offset + 437, $col_286, value);
	}

	public void col_286(long value) {
		setConstNumber(offset + 437, $col_286, value);
	}

	public void col_286(float value) {
		setConstNumber(offset + 437, $col_286, value);
	}

	public void col_286(double value) {
		setConstNumber(offset + 437, $col_286, value);
	}


	public MCNumber col_287() {
		return getConstNumber(offset + 438, $col_287);
	}

	public void col_287(MCNumber value) {
		setConstNumber(offset + 438, $col_287, value);
	}

	public void col_287(int value) {
		setConstNumber(offset + 438, $col_287, value);
	}

	public void col_287(long value) {
		setConstNumber(offset + 438, $col_287, value);
	}

	public void col_287(float value) {
		setConstNumber(offset + 438, $col_287, value);
	}

	public void col_287(double value) {
		setConstNumber(offset + 438, $col_287, value);
	}


	public MCNumber col_288() {
		return getConstNumber(offset + 439, $col_288);
	}

	public void col_288(MCNumber value) {
		setConstNumber(offset + 439, $col_288, value);
	}

	public void col_288(int value) {
		setConstNumber(offset + 439, $col_288, value);
	}

	public void col_288(long value) {
		setConstNumber(offset + 439, $col_288, value);
	}

	public void col_288(float value) {
		setConstNumber(offset + 439, $col_288, value);
	}

	public void col_288(double value) {
		setConstNumber(offset + 439, $col_288, value);
	}


	public MCNumber col_289() {
		return getConstNumber(offset + 440, $col_289);
	}

	public void col_289(MCNumber value) {
		setConstNumber(offset + 440, $col_289, value);
	}

	public void col_289(int value) {
		setConstNumber(offset + 440, $col_289, value);
	}

	public void col_289(long value) {
		setConstNumber(offset + 440, $col_289, value);
	}

	public void col_289(float value) {
		setConstNumber(offset + 440, $col_289, value);
	}

	public void col_289(double value) {
		setConstNumber(offset + 440, $col_289, value);
	}


	public MCNumber col_290() {
		return getConstNumber(offset + 441, $col_290);
	}

	public void col_290(MCNumber value) {
		setConstNumber(offset + 441, $col_290, value);
	}

	public void col_290(int value) {
		setConstNumber(offset + 441, $col_290, value);
	}

	public void col_290(long value) {
		setConstNumber(offset + 441, $col_290, value);
	}

	public void col_290(float value) {
		setConstNumber(offset + 441, $col_290, value);
	}

	public void col_290(double value) {
		setConstNumber(offset + 441, $col_290, value);
	}


	public MCNumber col_291() {
		return getConstNumber(offset + 442, $col_291);
	}

	public void col_291(MCNumber value) {
		setConstNumber(offset + 442, $col_291, value);
	}

	public void col_291(int value) {
		setConstNumber(offset + 442, $col_291, value);
	}

	public void col_291(long value) {
		setConstNumber(offset + 442, $col_291, value);
	}

	public void col_291(float value) {
		setConstNumber(offset + 442, $col_291, value);
	}

	public void col_291(double value) {
		setConstNumber(offset + 442, $col_291, value);
	}


	public MCNumber col_292() {
		return getConstNumber(offset + 443, $col_292);
	}

	public void col_292(MCNumber value) {
		setConstNumber(offset + 443, $col_292, value);
	}

	public void col_292(int value) {
		setConstNumber(offset + 443, $col_292, value);
	}

	public void col_292(long value) {
		setConstNumber(offset + 443, $col_292, value);
	}

	public void col_292(float value) {
		setConstNumber(offset + 443, $col_292, value);
	}

	public void col_292(double value) {
		setConstNumber(offset + 443, $col_292, value);
	}


	public MCNumber col_293() {
		return getConstNumber(offset + 444, $col_293);
	}

	public void col_293(MCNumber value) {
		setConstNumber(offset + 444, $col_293, value);
	}

	public void col_293(int value) {
		setConstNumber(offset + 444, $col_293, value);
	}

	public void col_293(long value) {
		setConstNumber(offset + 444, $col_293, value);
	}

	public void col_293(float value) {
		setConstNumber(offset + 444, $col_293, value);
	}

	public void col_293(double value) {
		setConstNumber(offset + 444, $col_293, value);
	}


	public MCNumber col_294() {
		return getConstNumber(offset + 445, $col_294);
	}

	public void col_294(MCNumber value) {
		setConstNumber(offset + 445, $col_294, value);
	}

	public void col_294(int value) {
		setConstNumber(offset + 445, $col_294, value);
	}

	public void col_294(long value) {
		setConstNumber(offset + 445, $col_294, value);
	}

	public void col_294(float value) {
		setConstNumber(offset + 445, $col_294, value);
	}

	public void col_294(double value) {
		setConstNumber(offset + 445, $col_294, value);
	}


	public MCNumber col_295() {
		return getConstNumber(offset + 446, $col_295);
	}

	public void col_295(MCNumber value) {
		setConstNumber(offset + 446, $col_295, value);
	}

	public void col_295(int value) {
		setConstNumber(offset + 446, $col_295, value);
	}

	public void col_295(long value) {
		setConstNumber(offset + 446, $col_295, value);
	}

	public void col_295(float value) {
		setConstNumber(offset + 446, $col_295, value);
	}

	public void col_295(double value) {
		setConstNumber(offset + 446, $col_295, value);
	}


	public MCNumber col_296() {
		return getConstNumber(offset + 447, $col_296);
	}

	public void col_296(MCNumber value) {
		setConstNumber(offset + 447, $col_296, value);
	}

	public void col_296(int value) {
		setConstNumber(offset + 447, $col_296, value);
	}

	public void col_296(long value) {
		setConstNumber(offset + 447, $col_296, value);
	}

	public void col_296(float value) {
		setConstNumber(offset + 447, $col_296, value);
	}

	public void col_296(double value) {
		setConstNumber(offset + 447, $col_296, value);
	}


	public MCNumber col_297() {
		return getConstNumber(offset + 448, $col_297);
	}

	public void col_297(MCNumber value) {
		setConstNumber(offset + 448, $col_297, value);
	}

	public void col_297(int value) {
		setConstNumber(offset + 448, $col_297, value);
	}

	public void col_297(long value) {
		setConstNumber(offset + 448, $col_297, value);
	}

	public void col_297(float value) {
		setConstNumber(offset + 448, $col_297, value);
	}

	public void col_297(double value) {
		setConstNumber(offset + 448, $col_297, value);
	}


	public MCNumber col_298() {
		return getConstNumber(offset + 449, $col_298);
	}

	public void col_298(MCNumber value) {
		setConstNumber(offset + 449, $col_298, value);
	}

	public void col_298(int value) {
		setConstNumber(offset + 449, $col_298, value);
	}

	public void col_298(long value) {
		setConstNumber(offset + 449, $col_298, value);
	}

	public void col_298(float value) {
		setConstNumber(offset + 449, $col_298, value);
	}

	public void col_298(double value) {
		setConstNumber(offset + 449, $col_298, value);
	}


	public MCNumber col_299() {
		return getConstNumber(offset + 450, $col_299);
	}

	public void col_299(MCNumber value) {
		setConstNumber(offset + 450, $col_299, value);
	}

	public void col_299(int value) {
		setConstNumber(offset + 450, $col_299, value);
	}

	public void col_299(long value) {
		setConstNumber(offset + 450, $col_299, value);
	}

	public void col_299(float value) {
		setConstNumber(offset + 450, $col_299, value);
	}

	public void col_299(double value) {
		setConstNumber(offset + 450, $col_299, value);
	}


	public String expns_grp_cd() {
		return getConstString(offset + 451, $expns_grp_cd);
	}

	public void expns_grp_cd(String value) {
		setConstString(offset + 451, $expns_grp_cd, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_nm();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_d_nm();
		}
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			return par_itm_jnl_cd();
		}
		if ($par_itm_jnl_nm.equalsIgnoreCase(name)) {
			return par_itm_jnl_nm();
		}
		if ($par_itm_grp_cd1.equalsIgnoreCase(name)) {
			return par_itm_grp_cd1();
		}
		if ($par_itm_grp_nm1.equalsIgnoreCase(name)) {
			return par_itm_grp_nm1();
		}
		if ($par_itm_grp_cd2.equalsIgnoreCase(name)) {
			return par_itm_grp_cd2();
		}
		if ($par_itm_grp_nm2.equalsIgnoreCase(name)) {
			return par_itm_grp_nm2();
		}
		if ($par_itm_grp_cd3.equalsIgnoreCase(name)) {
			return par_itm_grp_cd3();
		}
		if ($par_itm_grp_nm3.equalsIgnoreCase(name)) {
			return par_itm_grp_nm3();
		}
		if ($par_itm_grp_cd4.equalsIgnoreCase(name)) {
			return par_itm_grp_cd4();
		}
		if ($par_itm_grp_nm4.equalsIgnoreCase(name)) {
			return par_itm_grp_nm4();
		}
		if ($par_itm_grp_cd5.equalsIgnoreCase(name)) {
			return par_itm_grp_cd5();
		}
		if ($par_itm_grp_nm5.equalsIgnoreCase(name)) {
			return par_itm_grp_nm5();
		}
		if ($par_itm_grp_cd6.equalsIgnoreCase(name)) {
			return par_itm_grp_cd6();
		}
		if ($par_itm_grp_nm6.equalsIgnoreCase(name)) {
			return par_itm_grp_nm6();
		}
		if ($par_itm_grp_cd7.equalsIgnoreCase(name)) {
			return par_itm_grp_cd7();
		}
		if ($par_itm_grp_nm7.equalsIgnoreCase(name)) {
			return par_itm_grp_nm7();
		}
		if ($par_itm_grp_cd8.equalsIgnoreCase(name)) {
			return par_itm_grp_cd8();
		}
		if ($par_itm_grp_nm8.equalsIgnoreCase(name)) {
			return par_itm_grp_nm8();
		}
		if ($par_itm_grp_cd9.equalsIgnoreCase(name)) {
			return par_itm_grp_cd9();
		}
		if ($par_itm_grp_nm9.equalsIgnoreCase(name)) {
			return par_itm_grp_nm9();
		}
		if ($par_itm_grp_cd10.equalsIgnoreCase(name)) {
			return par_itm_grp_cd10();
		}
		if ($par_itm_grp_nm10.equalsIgnoreCase(name)) {
			return par_itm_grp_nm10();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		if ($par_sno1.equalsIgnoreCase(name)) {
			return par_sno1();
		}
		if ($par_sno2.equalsIgnoreCase(name)) {
			return par_sno2();
		}
		if ($par_sno3.equalsIgnoreCase(name)) {
			return par_sno3();
		}
		if ($par_sno4.equalsIgnoreCase(name)) {
			return par_sno4();
		}
		if ($par_asst_typ.equalsIgnoreCase(name)) {
			return par_asst_typ();
		}
		if ($par_asst_typ_nm.equalsIgnoreCase(name)) {
			return par_asst_typ_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($par_unit_cd.equalsIgnoreCase(name)) {
			return par_unit_cd();
		}
		if ($par_unit_nm.equalsIgnoreCase(name)) {
			return par_unit_nm();
		}
		if ($inpt_dpt_cd.equalsIgnoreCase(name)) {
			return inpt_dpt_cd();
		}
		if ($inpt_dpt_nm.equalsIgnoreCase(name)) {
			return inpt_dpt_nm();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_nm();
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_cd();
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_nm();
		}
		if ($chd_itm_jnl_cd.equalsIgnoreCase(name)) {
			return chd_itm_jnl_cd();
		}
		if ($chd_itm_jnl_nm.equalsIgnoreCase(name)) {
			return chd_itm_jnl_nm();
		}
		if ($chd_itm_grp_cd1.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd1();
		}
		if ($chd_itm_grp_nm1.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm1();
		}
		if ($chd_itm_grp_cd2.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd2();
		}
		if ($chd_itm_grp_nm2.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm2();
		}
		if ($chd_itm_grp_cd3.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd3();
		}
		if ($chd_itm_grp_nm3.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm3();
		}
		if ($chd_itm_grp_cd4.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd4();
		}
		if ($chd_itm_grp_nm4.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm4();
		}
		if ($chd_itm_grp_cd5.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd5();
		}
		if ($chd_itm_grp_nm5.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm5();
		}
		if ($chd_itm_grp_cd6.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd6();
		}
		if ($chd_itm_grp_nm6.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm6();
		}
		if ($chd_itm_grp_cd7.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd7();
		}
		if ($chd_itm_grp_nm7.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm7();
		}
		if ($chd_itm_grp_cd8.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd8();
		}
		if ($chd_itm_grp_nm8.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm8();
		}
		if ($chd_itm_grp_cd9.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd9();
		}
		if ($chd_itm_grp_nm9.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm9();
		}
		if ($chd_itm_grp_cd10.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd10();
		}
		if ($chd_itm_grp_nm10.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm10();
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			return chd_lot_no();
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			return chd_sublot_no();
		}
		if ($chd_sno1.equalsIgnoreCase(name)) {
			return chd_sno1();
		}
		if ($chd_sno2.equalsIgnoreCase(name)) {
			return chd_sno2();
		}
		if ($chd_sno3.equalsIgnoreCase(name)) {
			return chd_sno3();
		}
		if ($chd_sno4.equalsIgnoreCase(name)) {
			return chd_sno4();
		}
		if ($chd_asst_typ.equalsIgnoreCase(name)) {
			return chd_asst_typ();
		}
		if ($chd_asst_typ_nm.equalsIgnoreCase(name)) {
			return chd_asst_typ_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			return expns_grp_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			return upri_diff();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			return act_upri();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			return diff_up();
		}
		if ($cost_diff.equalsIgnoreCase(name)) {
			return cost_diff();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			return var_cost();
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			return fxd_cost();
		}
		if ($ttl_qty.equalsIgnoreCase(name)) {
			return ttl_qty();
		}
		if ($var_cost_qty.equalsIgnoreCase(name)) {
			return var_cost_qty();
		}
		if ($fxd_cost_qty.equalsIgnoreCase(name)) {
			return fxd_cost_qty();
		}
		if ($ttl_up.equalsIgnoreCase(name)) {
			return ttl_up();
		}
		if ($var_cost_up.equalsIgnoreCase(name)) {
			return var_cost_up();
		}
		if ($fxd_cost_up.equalsIgnoreCase(name)) {
			return fxd_cost_up();
		}
		if ($col_000.equalsIgnoreCase(name)) {
			return col_000();
		}
		if ($col_001.equalsIgnoreCase(name)) {
			return col_001();
		}
		if ($col_002.equalsIgnoreCase(name)) {
			return col_002();
		}
		if ($col_003.equalsIgnoreCase(name)) {
			return col_003();
		}
		if ($col_004.equalsIgnoreCase(name)) {
			return col_004();
		}
		if ($col_005.equalsIgnoreCase(name)) {
			return col_005();
		}
		if ($col_006.equalsIgnoreCase(name)) {
			return col_006();
		}
		if ($col_007.equalsIgnoreCase(name)) {
			return col_007();
		}
		if ($col_008.equalsIgnoreCase(name)) {
			return col_008();
		}
		if ($col_009.equalsIgnoreCase(name)) {
			return col_009();
		}
		if ($col_010.equalsIgnoreCase(name)) {
			return col_010();
		}
		if ($col_011.equalsIgnoreCase(name)) {
			return col_011();
		}
		if ($col_012.equalsIgnoreCase(name)) {
			return col_012();
		}
		if ($col_013.equalsIgnoreCase(name)) {
			return col_013();
		}
		if ($col_014.equalsIgnoreCase(name)) {
			return col_014();
		}
		if ($col_015.equalsIgnoreCase(name)) {
			return col_015();
		}
		if ($col_016.equalsIgnoreCase(name)) {
			return col_016();
		}
		if ($col_017.equalsIgnoreCase(name)) {
			return col_017();
		}
		if ($col_018.equalsIgnoreCase(name)) {
			return col_018();
		}
		if ($col_019.equalsIgnoreCase(name)) {
			return col_019();
		}
		if ($col_020.equalsIgnoreCase(name)) {
			return col_020();
		}
		if ($col_021.equalsIgnoreCase(name)) {
			return col_021();
		}
		if ($col_022.equalsIgnoreCase(name)) {
			return col_022();
		}
		if ($col_023.equalsIgnoreCase(name)) {
			return col_023();
		}
		if ($col_024.equalsIgnoreCase(name)) {
			return col_024();
		}
		if ($col_025.equalsIgnoreCase(name)) {
			return col_025();
		}
		if ($col_026.equalsIgnoreCase(name)) {
			return col_026();
		}
		if ($col_027.equalsIgnoreCase(name)) {
			return col_027();
		}
		if ($col_028.equalsIgnoreCase(name)) {
			return col_028();
		}
		if ($col_029.equalsIgnoreCase(name)) {
			return col_029();
		}
		if ($col_030.equalsIgnoreCase(name)) {
			return col_030();
		}
		if ($col_031.equalsIgnoreCase(name)) {
			return col_031();
		}
		if ($col_032.equalsIgnoreCase(name)) {
			return col_032();
		}
		if ($col_033.equalsIgnoreCase(name)) {
			return col_033();
		}
		if ($col_034.equalsIgnoreCase(name)) {
			return col_034();
		}
		if ($col_035.equalsIgnoreCase(name)) {
			return col_035();
		}
		if ($col_036.equalsIgnoreCase(name)) {
			return col_036();
		}
		if ($col_037.equalsIgnoreCase(name)) {
			return col_037();
		}
		if ($col_038.equalsIgnoreCase(name)) {
			return col_038();
		}
		if ($col_039.equalsIgnoreCase(name)) {
			return col_039();
		}
		if ($col_040.equalsIgnoreCase(name)) {
			return col_040();
		}
		if ($col_041.equalsIgnoreCase(name)) {
			return col_041();
		}
		if ($col_042.equalsIgnoreCase(name)) {
			return col_042();
		}
		if ($col_043.equalsIgnoreCase(name)) {
			return col_043();
		}
		if ($col_044.equalsIgnoreCase(name)) {
			return col_044();
		}
		if ($col_045.equalsIgnoreCase(name)) {
			return col_045();
		}
		if ($col_046.equalsIgnoreCase(name)) {
			return col_046();
		}
		if ($col_047.equalsIgnoreCase(name)) {
			return col_047();
		}
		if ($col_048.equalsIgnoreCase(name)) {
			return col_048();
		}
		if ($col_049.equalsIgnoreCase(name)) {
			return col_049();
		}
		if ($col_050.equalsIgnoreCase(name)) {
			return col_050();
		}
		if ($col_051.equalsIgnoreCase(name)) {
			return col_051();
		}
		if ($col_052.equalsIgnoreCase(name)) {
			return col_052();
		}
		if ($col_053.equalsIgnoreCase(name)) {
			return col_053();
		}
		if ($col_054.equalsIgnoreCase(name)) {
			return col_054();
		}
		if ($col_055.equalsIgnoreCase(name)) {
			return col_055();
		}
		if ($col_056.equalsIgnoreCase(name)) {
			return col_056();
		}
		if ($col_057.equalsIgnoreCase(name)) {
			return col_057();
		}
		if ($col_058.equalsIgnoreCase(name)) {
			return col_058();
		}
		if ($col_059.equalsIgnoreCase(name)) {
			return col_059();
		}
		if ($col_060.equalsIgnoreCase(name)) {
			return col_060();
		}
		if ($col_061.equalsIgnoreCase(name)) {
			return col_061();
		}
		if ($col_062.equalsIgnoreCase(name)) {
			return col_062();
		}
		if ($col_063.equalsIgnoreCase(name)) {
			return col_063();
		}
		if ($col_064.equalsIgnoreCase(name)) {
			return col_064();
		}
		if ($col_065.equalsIgnoreCase(name)) {
			return col_065();
		}
		if ($col_066.equalsIgnoreCase(name)) {
			return col_066();
		}
		if ($col_067.equalsIgnoreCase(name)) {
			return col_067();
		}
		if ($col_068.equalsIgnoreCase(name)) {
			return col_068();
		}
		if ($col_069.equalsIgnoreCase(name)) {
			return col_069();
		}
		if ($col_070.equalsIgnoreCase(name)) {
			return col_070();
		}
		if ($col_071.equalsIgnoreCase(name)) {
			return col_071();
		}
		if ($col_072.equalsIgnoreCase(name)) {
			return col_072();
		}
		if ($col_073.equalsIgnoreCase(name)) {
			return col_073();
		}
		if ($col_074.equalsIgnoreCase(name)) {
			return col_074();
		}
		if ($col_075.equalsIgnoreCase(name)) {
			return col_075();
		}
		if ($col_076.equalsIgnoreCase(name)) {
			return col_076();
		}
		if ($col_077.equalsIgnoreCase(name)) {
			return col_077();
		}
		if ($col_078.equalsIgnoreCase(name)) {
			return col_078();
		}
		if ($col_079.equalsIgnoreCase(name)) {
			return col_079();
		}
		if ($col_080.equalsIgnoreCase(name)) {
			return col_080();
		}
		if ($col_081.equalsIgnoreCase(name)) {
			return col_081();
		}
		if ($col_082.equalsIgnoreCase(name)) {
			return col_082();
		}
		if ($col_083.equalsIgnoreCase(name)) {
			return col_083();
		}
		if ($col_084.equalsIgnoreCase(name)) {
			return col_084();
		}
		if ($col_085.equalsIgnoreCase(name)) {
			return col_085();
		}
		if ($col_086.equalsIgnoreCase(name)) {
			return col_086();
		}
		if ($col_087.equalsIgnoreCase(name)) {
			return col_087();
		}
		if ($col_088.equalsIgnoreCase(name)) {
			return col_088();
		}
		if ($col_089.equalsIgnoreCase(name)) {
			return col_089();
		}
		if ($col_090.equalsIgnoreCase(name)) {
			return col_090();
		}
		if ($col_091.equalsIgnoreCase(name)) {
			return col_091();
		}
		if ($col_092.equalsIgnoreCase(name)) {
			return col_092();
		}
		if ($col_093.equalsIgnoreCase(name)) {
			return col_093();
		}
		if ($col_094.equalsIgnoreCase(name)) {
			return col_094();
		}
		if ($col_095.equalsIgnoreCase(name)) {
			return col_095();
		}
		if ($col_096.equalsIgnoreCase(name)) {
			return col_096();
		}
		if ($col_097.equalsIgnoreCase(name)) {
			return col_097();
		}
		if ($col_098.equalsIgnoreCase(name)) {
			return col_098();
		}
		if ($col_099.equalsIgnoreCase(name)) {
			return col_099();
		}
		if ($col_100.equalsIgnoreCase(name)) {
			return col_100();
		}
		if ($col_101.equalsIgnoreCase(name)) {
			return col_101();
		}
		if ($col_102.equalsIgnoreCase(name)) {
			return col_102();
		}
		if ($col_103.equalsIgnoreCase(name)) {
			return col_103();
		}
		if ($col_104.equalsIgnoreCase(name)) {
			return col_104();
		}
		if ($col_105.equalsIgnoreCase(name)) {
			return col_105();
		}
		if ($col_106.equalsIgnoreCase(name)) {
			return col_106();
		}
		if ($col_107.equalsIgnoreCase(name)) {
			return col_107();
		}
		if ($col_108.equalsIgnoreCase(name)) {
			return col_108();
		}
		if ($col_109.equalsIgnoreCase(name)) {
			return col_109();
		}
		if ($col_110.equalsIgnoreCase(name)) {
			return col_110();
		}
		if ($col_111.equalsIgnoreCase(name)) {
			return col_111();
		}
		if ($col_112.equalsIgnoreCase(name)) {
			return col_112();
		}
		if ($col_113.equalsIgnoreCase(name)) {
			return col_113();
		}
		if ($col_114.equalsIgnoreCase(name)) {
			return col_114();
		}
		if ($col_115.equalsIgnoreCase(name)) {
			return col_115();
		}
		if ($col_116.equalsIgnoreCase(name)) {
			return col_116();
		}
		if ($col_117.equalsIgnoreCase(name)) {
			return col_117();
		}
		if ($col_118.equalsIgnoreCase(name)) {
			return col_118();
		}
		if ($col_119.equalsIgnoreCase(name)) {
			return col_119();
		}
		if ($col_120.equalsIgnoreCase(name)) {
			return col_120();
		}
		if ($col_121.equalsIgnoreCase(name)) {
			return col_121();
		}
		if ($col_122.equalsIgnoreCase(name)) {
			return col_122();
		}
		if ($col_123.equalsIgnoreCase(name)) {
			return col_123();
		}
		if ($col_124.equalsIgnoreCase(name)) {
			return col_124();
		}
		if ($col_125.equalsIgnoreCase(name)) {
			return col_125();
		}
		if ($col_126.equalsIgnoreCase(name)) {
			return col_126();
		}
		if ($col_127.equalsIgnoreCase(name)) {
			return col_127();
		}
		if ($col_128.equalsIgnoreCase(name)) {
			return col_128();
		}
		if ($col_129.equalsIgnoreCase(name)) {
			return col_129();
		}
		if ($col_130.equalsIgnoreCase(name)) {
			return col_130();
		}
		if ($col_131.equalsIgnoreCase(name)) {
			return col_131();
		}
		if ($col_132.equalsIgnoreCase(name)) {
			return col_132();
		}
		if ($col_133.equalsIgnoreCase(name)) {
			return col_133();
		}
		if ($col_134.equalsIgnoreCase(name)) {
			return col_134();
		}
		if ($col_135.equalsIgnoreCase(name)) {
			return col_135();
		}
		if ($col_136.equalsIgnoreCase(name)) {
			return col_136();
		}
		if ($col_137.equalsIgnoreCase(name)) {
			return col_137();
		}
		if ($col_138.equalsIgnoreCase(name)) {
			return col_138();
		}
		if ($col_139.equalsIgnoreCase(name)) {
			return col_139();
		}
		if ($col_140.equalsIgnoreCase(name)) {
			return col_140();
		}
		if ($col_141.equalsIgnoreCase(name)) {
			return col_141();
		}
		if ($col_142.equalsIgnoreCase(name)) {
			return col_142();
		}
		if ($col_143.equalsIgnoreCase(name)) {
			return col_143();
		}
		if ($col_144.equalsIgnoreCase(name)) {
			return col_144();
		}
		if ($col_145.equalsIgnoreCase(name)) {
			return col_145();
		}
		if ($col_146.equalsIgnoreCase(name)) {
			return col_146();
		}
		if ($col_147.equalsIgnoreCase(name)) {
			return col_147();
		}
		if ($col_148.equalsIgnoreCase(name)) {
			return col_148();
		}
		if ($col_149.equalsIgnoreCase(name)) {
			return col_149();
		}
		if ($col_150.equalsIgnoreCase(name)) {
			return col_150();
		}
		if ($col_151.equalsIgnoreCase(name)) {
			return col_151();
		}
		if ($col_152.equalsIgnoreCase(name)) {
			return col_152();
		}
		if ($col_153.equalsIgnoreCase(name)) {
			return col_153();
		}
		if ($col_154.equalsIgnoreCase(name)) {
			return col_154();
		}
		if ($col_155.equalsIgnoreCase(name)) {
			return col_155();
		}
		if ($col_156.equalsIgnoreCase(name)) {
			return col_156();
		}
		if ($col_157.equalsIgnoreCase(name)) {
			return col_157();
		}
		if ($col_158.equalsIgnoreCase(name)) {
			return col_158();
		}
		if ($col_159.equalsIgnoreCase(name)) {
			return col_159();
		}
		if ($col_160.equalsIgnoreCase(name)) {
			return col_160();
		}
		if ($col_161.equalsIgnoreCase(name)) {
			return col_161();
		}
		if ($col_162.equalsIgnoreCase(name)) {
			return col_162();
		}
		if ($col_163.equalsIgnoreCase(name)) {
			return col_163();
		}
		if ($col_164.equalsIgnoreCase(name)) {
			return col_164();
		}
		if ($col_165.equalsIgnoreCase(name)) {
			return col_165();
		}
		if ($col_166.equalsIgnoreCase(name)) {
			return col_166();
		}
		if ($col_167.equalsIgnoreCase(name)) {
			return col_167();
		}
		if ($col_168.equalsIgnoreCase(name)) {
			return col_168();
		}
		if ($col_169.equalsIgnoreCase(name)) {
			return col_169();
		}
		if ($col_170.equalsIgnoreCase(name)) {
			return col_170();
		}
		if ($col_171.equalsIgnoreCase(name)) {
			return col_171();
		}
		if ($col_172.equalsIgnoreCase(name)) {
			return col_172();
		}
		if ($col_173.equalsIgnoreCase(name)) {
			return col_173();
		}
		if ($col_174.equalsIgnoreCase(name)) {
			return col_174();
		}
		if ($col_175.equalsIgnoreCase(name)) {
			return col_175();
		}
		if ($col_176.equalsIgnoreCase(name)) {
			return col_176();
		}
		if ($col_177.equalsIgnoreCase(name)) {
			return col_177();
		}
		if ($col_178.equalsIgnoreCase(name)) {
			return col_178();
		}
		if ($col_179.equalsIgnoreCase(name)) {
			return col_179();
		}
		if ($col_180.equalsIgnoreCase(name)) {
			return col_180();
		}
		if ($col_181.equalsIgnoreCase(name)) {
			return col_181();
		}
		if ($col_182.equalsIgnoreCase(name)) {
			return col_182();
		}
		if ($col_183.equalsIgnoreCase(name)) {
			return col_183();
		}
		if ($col_184.equalsIgnoreCase(name)) {
			return col_184();
		}
		if ($col_185.equalsIgnoreCase(name)) {
			return col_185();
		}
		if ($col_186.equalsIgnoreCase(name)) {
			return col_186();
		}
		if ($col_187.equalsIgnoreCase(name)) {
			return col_187();
		}
		if ($col_188.equalsIgnoreCase(name)) {
			return col_188();
		}
		if ($col_189.equalsIgnoreCase(name)) {
			return col_189();
		}
		if ($col_190.equalsIgnoreCase(name)) {
			return col_190();
		}
		if ($col_191.equalsIgnoreCase(name)) {
			return col_191();
		}
		if ($col_192.equalsIgnoreCase(name)) {
			return col_192();
		}
		if ($col_193.equalsIgnoreCase(name)) {
			return col_193();
		}
		if ($col_194.equalsIgnoreCase(name)) {
			return col_194();
		}
		if ($col_195.equalsIgnoreCase(name)) {
			return col_195();
		}
		if ($col_196.equalsIgnoreCase(name)) {
			return col_196();
		}
		if ($col_197.equalsIgnoreCase(name)) {
			return col_197();
		}
		if ($col_198.equalsIgnoreCase(name)) {
			return col_198();
		}
		if ($col_199.equalsIgnoreCase(name)) {
			return col_199();
		}
		if ($col_200.equalsIgnoreCase(name)) {
			return col_200();
		}
		if ($col_201.equalsIgnoreCase(name)) {
			return col_201();
		}
		if ($col_202.equalsIgnoreCase(name)) {
			return col_202();
		}
		if ($col_203.equalsIgnoreCase(name)) {
			return col_203();
		}
		if ($col_204.equalsIgnoreCase(name)) {
			return col_204();
		}
		if ($col_205.equalsIgnoreCase(name)) {
			return col_205();
		}
		if ($col_206.equalsIgnoreCase(name)) {
			return col_206();
		}
		if ($col_207.equalsIgnoreCase(name)) {
			return col_207();
		}
		if ($col_208.equalsIgnoreCase(name)) {
			return col_208();
		}
		if ($col_209.equalsIgnoreCase(name)) {
			return col_209();
		}
		if ($col_210.equalsIgnoreCase(name)) {
			return col_210();
		}
		if ($col_211.equalsIgnoreCase(name)) {
			return col_211();
		}
		if ($col_212.equalsIgnoreCase(name)) {
			return col_212();
		}
		if ($col_213.equalsIgnoreCase(name)) {
			return col_213();
		}
		if ($col_214.equalsIgnoreCase(name)) {
			return col_214();
		}
		if ($col_215.equalsIgnoreCase(name)) {
			return col_215();
		}
		if ($col_216.equalsIgnoreCase(name)) {
			return col_216();
		}
		if ($col_217.equalsIgnoreCase(name)) {
			return col_217();
		}
		if ($col_218.equalsIgnoreCase(name)) {
			return col_218();
		}
		if ($col_219.equalsIgnoreCase(name)) {
			return col_219();
		}
		if ($col_220.equalsIgnoreCase(name)) {
			return col_220();
		}
		if ($col_221.equalsIgnoreCase(name)) {
			return col_221();
		}
		if ($col_222.equalsIgnoreCase(name)) {
			return col_222();
		}
		if ($col_223.equalsIgnoreCase(name)) {
			return col_223();
		}
		if ($col_224.equalsIgnoreCase(name)) {
			return col_224();
		}
		if ($col_225.equalsIgnoreCase(name)) {
			return col_225();
		}
		if ($col_226.equalsIgnoreCase(name)) {
			return col_226();
		}
		if ($col_227.equalsIgnoreCase(name)) {
			return col_227();
		}
		if ($col_228.equalsIgnoreCase(name)) {
			return col_228();
		}
		if ($col_229.equalsIgnoreCase(name)) {
			return col_229();
		}
		if ($col_230.equalsIgnoreCase(name)) {
			return col_230();
		}
		if ($col_231.equalsIgnoreCase(name)) {
			return col_231();
		}
		if ($col_232.equalsIgnoreCase(name)) {
			return col_232();
		}
		if ($col_233.equalsIgnoreCase(name)) {
			return col_233();
		}
		if ($col_234.equalsIgnoreCase(name)) {
			return col_234();
		}
		if ($col_235.equalsIgnoreCase(name)) {
			return col_235();
		}
		if ($col_236.equalsIgnoreCase(name)) {
			return col_236();
		}
		if ($col_237.equalsIgnoreCase(name)) {
			return col_237();
		}
		if ($col_238.equalsIgnoreCase(name)) {
			return col_238();
		}
		if ($col_239.equalsIgnoreCase(name)) {
			return col_239();
		}
		if ($col_240.equalsIgnoreCase(name)) {
			return col_240();
		}
		if ($col_241.equalsIgnoreCase(name)) {
			return col_241();
		}
		if ($col_242.equalsIgnoreCase(name)) {
			return col_242();
		}
		if ($col_243.equalsIgnoreCase(name)) {
			return col_243();
		}
		if ($col_244.equalsIgnoreCase(name)) {
			return col_244();
		}
		if ($col_245.equalsIgnoreCase(name)) {
			return col_245();
		}
		if ($col_246.equalsIgnoreCase(name)) {
			return col_246();
		}
		if ($col_247.equalsIgnoreCase(name)) {
			return col_247();
		}
		if ($col_248.equalsIgnoreCase(name)) {
			return col_248();
		}
		if ($col_249.equalsIgnoreCase(name)) {
			return col_249();
		}
		if ($col_250.equalsIgnoreCase(name)) {
			return col_250();
		}
		if ($col_251.equalsIgnoreCase(name)) {
			return col_251();
		}
		if ($col_252.equalsIgnoreCase(name)) {
			return col_252();
		}
		if ($col_253.equalsIgnoreCase(name)) {
			return col_253();
		}
		if ($col_254.equalsIgnoreCase(name)) {
			return col_254();
		}
		if ($col_255.equalsIgnoreCase(name)) {
			return col_255();
		}
		if ($col_256.equalsIgnoreCase(name)) {
			return col_256();
		}
		if ($col_257.equalsIgnoreCase(name)) {
			return col_257();
		}
		if ($col_258.equalsIgnoreCase(name)) {
			return col_258();
		}
		if ($col_259.equalsIgnoreCase(name)) {
			return col_259();
		}
		if ($col_260.equalsIgnoreCase(name)) {
			return col_260();
		}
		if ($col_261.equalsIgnoreCase(name)) {
			return col_261();
		}
		if ($col_262.equalsIgnoreCase(name)) {
			return col_262();
		}
		if ($col_263.equalsIgnoreCase(name)) {
			return col_263();
		}
		if ($col_264.equalsIgnoreCase(name)) {
			return col_264();
		}
		if ($col_265.equalsIgnoreCase(name)) {
			return col_265();
		}
		if ($col_266.equalsIgnoreCase(name)) {
			return col_266();
		}
		if ($col_267.equalsIgnoreCase(name)) {
			return col_267();
		}
		if ($col_268.equalsIgnoreCase(name)) {
			return col_268();
		}
		if ($col_269.equalsIgnoreCase(name)) {
			return col_269();
		}
		if ($col_270.equalsIgnoreCase(name)) {
			return col_270();
		}
		if ($col_271.equalsIgnoreCase(name)) {
			return col_271();
		}
		if ($col_272.equalsIgnoreCase(name)) {
			return col_272();
		}
		if ($col_273.equalsIgnoreCase(name)) {
			return col_273();
		}
		if ($col_274.equalsIgnoreCase(name)) {
			return col_274();
		}
		if ($col_275.equalsIgnoreCase(name)) {
			return col_275();
		}
		if ($col_276.equalsIgnoreCase(name)) {
			return col_276();
		}
		if ($col_277.equalsIgnoreCase(name)) {
			return col_277();
		}
		if ($col_278.equalsIgnoreCase(name)) {
			return col_278();
		}
		if ($col_279.equalsIgnoreCase(name)) {
			return col_279();
		}
		if ($col_280.equalsIgnoreCase(name)) {
			return col_280();
		}
		if ($col_281.equalsIgnoreCase(name)) {
			return col_281();
		}
		if ($col_282.equalsIgnoreCase(name)) {
			return col_282();
		}
		if ($col_283.equalsIgnoreCase(name)) {
			return col_283();
		}
		if ($col_284.equalsIgnoreCase(name)) {
			return col_284();
		}
		if ($col_285.equalsIgnoreCase(name)) {
			return col_285();
		}
		if ($col_286.equalsIgnoreCase(name)) {
			return col_286();
		}
		if ($col_287.equalsIgnoreCase(name)) {
			return col_287();
		}
		if ($col_288.equalsIgnoreCase(name)) {
			return col_288();
		}
		if ($col_289.equalsIgnoreCase(name)) {
			return col_289();
		}
		if ($col_290.equalsIgnoreCase(name)) {
			return col_290();
		}
		if ($col_291.equalsIgnoreCase(name)) {
			return col_291();
		}
		if ($col_292.equalsIgnoreCase(name)) {
			return col_292();
		}
		if ($col_293.equalsIgnoreCase(name)) {
			return col_293();
		}
		if ($col_294.equalsIgnoreCase(name)) {
			return col_294();
		}
		if ($col_295.equalsIgnoreCase(name)) {
			return col_295();
		}
		if ($col_296.equalsIgnoreCase(name)) {
			return col_296();
		}
		if ($col_297.equalsIgnoreCase(name)) {
			return col_297();
		}
		if ($col_298.equalsIgnoreCase(name)) {
			return col_298();
		}
		if ($col_299.equalsIgnoreCase(name)) {
			return col_299();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_nm();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_d_nm();
		}
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			return par_itm_jnl_cd();
		}
		if ($par_itm_jnl_nm.equalsIgnoreCase(name)) {
			return par_itm_jnl_nm();
		}
		if ($par_itm_grp_cd1.equalsIgnoreCase(name)) {
			return par_itm_grp_cd1();
		}
		if ($par_itm_grp_nm1.equalsIgnoreCase(name)) {
			return par_itm_grp_nm1();
		}
		if ($par_itm_grp_cd2.equalsIgnoreCase(name)) {
			return par_itm_grp_cd2();
		}
		if ($par_itm_grp_nm2.equalsIgnoreCase(name)) {
			return par_itm_grp_nm2();
		}
		if ($par_itm_grp_cd3.equalsIgnoreCase(name)) {
			return par_itm_grp_cd3();
		}
		if ($par_itm_grp_nm3.equalsIgnoreCase(name)) {
			return par_itm_grp_nm3();
		}
		if ($par_itm_grp_cd4.equalsIgnoreCase(name)) {
			return par_itm_grp_cd4();
		}
		if ($par_itm_grp_nm4.equalsIgnoreCase(name)) {
			return par_itm_grp_nm4();
		}
		if ($par_itm_grp_cd5.equalsIgnoreCase(name)) {
			return par_itm_grp_cd5();
		}
		if ($par_itm_grp_nm5.equalsIgnoreCase(name)) {
			return par_itm_grp_nm5();
		}
		if ($par_itm_grp_cd6.equalsIgnoreCase(name)) {
			return par_itm_grp_cd6();
		}
		if ($par_itm_grp_nm6.equalsIgnoreCase(name)) {
			return par_itm_grp_nm6();
		}
		if ($par_itm_grp_cd7.equalsIgnoreCase(name)) {
			return par_itm_grp_cd7();
		}
		if ($par_itm_grp_nm7.equalsIgnoreCase(name)) {
			return par_itm_grp_nm7();
		}
		if ($par_itm_grp_cd8.equalsIgnoreCase(name)) {
			return par_itm_grp_cd8();
		}
		if ($par_itm_grp_nm8.equalsIgnoreCase(name)) {
			return par_itm_grp_nm8();
		}
		if ($par_itm_grp_cd9.equalsIgnoreCase(name)) {
			return par_itm_grp_cd9();
		}
		if ($par_itm_grp_nm9.equalsIgnoreCase(name)) {
			return par_itm_grp_nm9();
		}
		if ($par_itm_grp_cd10.equalsIgnoreCase(name)) {
			return par_itm_grp_cd10();
		}
		if ($par_itm_grp_nm10.equalsIgnoreCase(name)) {
			return par_itm_grp_nm10();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		if ($par_sno1.equalsIgnoreCase(name)) {
			return par_sno1();
		}
		if ($par_sno2.equalsIgnoreCase(name)) {
			return par_sno2();
		}
		if ($par_sno3.equalsIgnoreCase(name)) {
			return par_sno3();
		}
		if ($par_sno4.equalsIgnoreCase(name)) {
			return par_sno4();
		}
		if ($par_asst_typ.equalsIgnoreCase(name)) {
			return par_asst_typ();
		}
		if ($par_asst_typ_nm.equalsIgnoreCase(name)) {
			return par_asst_typ_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($par_unit_cd.equalsIgnoreCase(name)) {
			return par_unit_cd();
		}
		if ($par_unit_nm.equalsIgnoreCase(name)) {
			return par_unit_nm();
		}
		if ($inpt_dpt_cd.equalsIgnoreCase(name)) {
			return inpt_dpt_cd();
		}
		if ($inpt_dpt_nm.equalsIgnoreCase(name)) {
			return inpt_dpt_nm();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_nm();
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_cd();
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_nm();
		}
		if ($chd_itm_jnl_cd.equalsIgnoreCase(name)) {
			return chd_itm_jnl_cd();
		}
		if ($chd_itm_jnl_nm.equalsIgnoreCase(name)) {
			return chd_itm_jnl_nm();
		}
		if ($chd_itm_grp_cd1.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd1();
		}
		if ($chd_itm_grp_nm1.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm1();
		}
		if ($chd_itm_grp_cd2.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd2();
		}
		if ($chd_itm_grp_nm2.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm2();
		}
		if ($chd_itm_grp_cd3.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd3();
		}
		if ($chd_itm_grp_nm3.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm3();
		}
		if ($chd_itm_grp_cd4.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd4();
		}
		if ($chd_itm_grp_nm4.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm4();
		}
		if ($chd_itm_grp_cd5.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd5();
		}
		if ($chd_itm_grp_nm5.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm5();
		}
		if ($chd_itm_grp_cd6.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd6();
		}
		if ($chd_itm_grp_nm6.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm6();
		}
		if ($chd_itm_grp_cd7.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd7();
		}
		if ($chd_itm_grp_nm7.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm7();
		}
		if ($chd_itm_grp_cd8.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd8();
		}
		if ($chd_itm_grp_nm8.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm8();
		}
		if ($chd_itm_grp_cd9.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd9();
		}
		if ($chd_itm_grp_nm9.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm9();
		}
		if ($chd_itm_grp_cd10.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd10();
		}
		if ($chd_itm_grp_nm10.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm10();
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			return chd_lot_no();
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			return chd_sublot_no();
		}
		if ($chd_sno1.equalsIgnoreCase(name)) {
			return chd_sno1();
		}
		if ($chd_sno2.equalsIgnoreCase(name)) {
			return chd_sno2();
		}
		if ($chd_sno3.equalsIgnoreCase(name)) {
			return chd_sno3();
		}
		if ($chd_sno4.equalsIgnoreCase(name)) {
			return chd_sno4();
		}
		if ($chd_asst_typ.equalsIgnoreCase(name)) {
			return chd_asst_typ();
		}
		if ($chd_asst_typ_nm.equalsIgnoreCase(name)) {
			return chd_asst_typ_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			return expns_grp_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			return upri_diff();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			return act_upri();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			return diff_up();
		}
		if ($cost_diff.equalsIgnoreCase(name)) {
			return cost_diff();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			return var_cost();
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			return fxd_cost();
		}
		if ($ttl_qty.equalsIgnoreCase(name)) {
			return ttl_qty();
		}
		if ($var_cost_qty.equalsIgnoreCase(name)) {
			return var_cost_qty();
		}
		if ($fxd_cost_qty.equalsIgnoreCase(name)) {
			return fxd_cost_qty();
		}
		if ($ttl_up.equalsIgnoreCase(name)) {
			return ttl_up();
		}
		if ($var_cost_up.equalsIgnoreCase(name)) {
			return var_cost_up();
		}
		if ($fxd_cost_up.equalsIgnoreCase(name)) {
			return fxd_cost_up();
		}
		if ($col_000.equalsIgnoreCase(name)) {
			return col_000();
		}
		if ($col_001.equalsIgnoreCase(name)) {
			return col_001();
		}
		if ($col_002.equalsIgnoreCase(name)) {
			return col_002();
		}
		if ($col_003.equalsIgnoreCase(name)) {
			return col_003();
		}
		if ($col_004.equalsIgnoreCase(name)) {
			return col_004();
		}
		if ($col_005.equalsIgnoreCase(name)) {
			return col_005();
		}
		if ($col_006.equalsIgnoreCase(name)) {
			return col_006();
		}
		if ($col_007.equalsIgnoreCase(name)) {
			return col_007();
		}
		if ($col_008.equalsIgnoreCase(name)) {
			return col_008();
		}
		if ($col_009.equalsIgnoreCase(name)) {
			return col_009();
		}
		if ($col_010.equalsIgnoreCase(name)) {
			return col_010();
		}
		if ($col_011.equalsIgnoreCase(name)) {
			return col_011();
		}
		if ($col_012.equalsIgnoreCase(name)) {
			return col_012();
		}
		if ($col_013.equalsIgnoreCase(name)) {
			return col_013();
		}
		if ($col_014.equalsIgnoreCase(name)) {
			return col_014();
		}
		if ($col_015.equalsIgnoreCase(name)) {
			return col_015();
		}
		if ($col_016.equalsIgnoreCase(name)) {
			return col_016();
		}
		if ($col_017.equalsIgnoreCase(name)) {
			return col_017();
		}
		if ($col_018.equalsIgnoreCase(name)) {
			return col_018();
		}
		if ($col_019.equalsIgnoreCase(name)) {
			return col_019();
		}
		if ($col_020.equalsIgnoreCase(name)) {
			return col_020();
		}
		if ($col_021.equalsIgnoreCase(name)) {
			return col_021();
		}
		if ($col_022.equalsIgnoreCase(name)) {
			return col_022();
		}
		if ($col_023.equalsIgnoreCase(name)) {
			return col_023();
		}
		if ($col_024.equalsIgnoreCase(name)) {
			return col_024();
		}
		if ($col_025.equalsIgnoreCase(name)) {
			return col_025();
		}
		if ($col_026.equalsIgnoreCase(name)) {
			return col_026();
		}
		if ($col_027.equalsIgnoreCase(name)) {
			return col_027();
		}
		if ($col_028.equalsIgnoreCase(name)) {
			return col_028();
		}
		if ($col_029.equalsIgnoreCase(name)) {
			return col_029();
		}
		if ($col_030.equalsIgnoreCase(name)) {
			return col_030();
		}
		if ($col_031.equalsIgnoreCase(name)) {
			return col_031();
		}
		if ($col_032.equalsIgnoreCase(name)) {
			return col_032();
		}
		if ($col_033.equalsIgnoreCase(name)) {
			return col_033();
		}
		if ($col_034.equalsIgnoreCase(name)) {
			return col_034();
		}
		if ($col_035.equalsIgnoreCase(name)) {
			return col_035();
		}
		if ($col_036.equalsIgnoreCase(name)) {
			return col_036();
		}
		if ($col_037.equalsIgnoreCase(name)) {
			return col_037();
		}
		if ($col_038.equalsIgnoreCase(name)) {
			return col_038();
		}
		if ($col_039.equalsIgnoreCase(name)) {
			return col_039();
		}
		if ($col_040.equalsIgnoreCase(name)) {
			return col_040();
		}
		if ($col_041.equalsIgnoreCase(name)) {
			return col_041();
		}
		if ($col_042.equalsIgnoreCase(name)) {
			return col_042();
		}
		if ($col_043.equalsIgnoreCase(name)) {
			return col_043();
		}
		if ($col_044.equalsIgnoreCase(name)) {
			return col_044();
		}
		if ($col_045.equalsIgnoreCase(name)) {
			return col_045();
		}
		if ($col_046.equalsIgnoreCase(name)) {
			return col_046();
		}
		if ($col_047.equalsIgnoreCase(name)) {
			return col_047();
		}
		if ($col_048.equalsIgnoreCase(name)) {
			return col_048();
		}
		if ($col_049.equalsIgnoreCase(name)) {
			return col_049();
		}
		if ($col_050.equalsIgnoreCase(name)) {
			return col_050();
		}
		if ($col_051.equalsIgnoreCase(name)) {
			return col_051();
		}
		if ($col_052.equalsIgnoreCase(name)) {
			return col_052();
		}
		if ($col_053.equalsIgnoreCase(name)) {
			return col_053();
		}
		if ($col_054.equalsIgnoreCase(name)) {
			return col_054();
		}
		if ($col_055.equalsIgnoreCase(name)) {
			return col_055();
		}
		if ($col_056.equalsIgnoreCase(name)) {
			return col_056();
		}
		if ($col_057.equalsIgnoreCase(name)) {
			return col_057();
		}
		if ($col_058.equalsIgnoreCase(name)) {
			return col_058();
		}
		if ($col_059.equalsIgnoreCase(name)) {
			return col_059();
		}
		if ($col_060.equalsIgnoreCase(name)) {
			return col_060();
		}
		if ($col_061.equalsIgnoreCase(name)) {
			return col_061();
		}
		if ($col_062.equalsIgnoreCase(name)) {
			return col_062();
		}
		if ($col_063.equalsIgnoreCase(name)) {
			return col_063();
		}
		if ($col_064.equalsIgnoreCase(name)) {
			return col_064();
		}
		if ($col_065.equalsIgnoreCase(name)) {
			return col_065();
		}
		if ($col_066.equalsIgnoreCase(name)) {
			return col_066();
		}
		if ($col_067.equalsIgnoreCase(name)) {
			return col_067();
		}
		if ($col_068.equalsIgnoreCase(name)) {
			return col_068();
		}
		if ($col_069.equalsIgnoreCase(name)) {
			return col_069();
		}
		if ($col_070.equalsIgnoreCase(name)) {
			return col_070();
		}
		if ($col_071.equalsIgnoreCase(name)) {
			return col_071();
		}
		if ($col_072.equalsIgnoreCase(name)) {
			return col_072();
		}
		if ($col_073.equalsIgnoreCase(name)) {
			return col_073();
		}
		if ($col_074.equalsIgnoreCase(name)) {
			return col_074();
		}
		if ($col_075.equalsIgnoreCase(name)) {
			return col_075();
		}
		if ($col_076.equalsIgnoreCase(name)) {
			return col_076();
		}
		if ($col_077.equalsIgnoreCase(name)) {
			return col_077();
		}
		if ($col_078.equalsIgnoreCase(name)) {
			return col_078();
		}
		if ($col_079.equalsIgnoreCase(name)) {
			return col_079();
		}
		if ($col_080.equalsIgnoreCase(name)) {
			return col_080();
		}
		if ($col_081.equalsIgnoreCase(name)) {
			return col_081();
		}
		if ($col_082.equalsIgnoreCase(name)) {
			return col_082();
		}
		if ($col_083.equalsIgnoreCase(name)) {
			return col_083();
		}
		if ($col_084.equalsIgnoreCase(name)) {
			return col_084();
		}
		if ($col_085.equalsIgnoreCase(name)) {
			return col_085();
		}
		if ($col_086.equalsIgnoreCase(name)) {
			return col_086();
		}
		if ($col_087.equalsIgnoreCase(name)) {
			return col_087();
		}
		if ($col_088.equalsIgnoreCase(name)) {
			return col_088();
		}
		if ($col_089.equalsIgnoreCase(name)) {
			return col_089();
		}
		if ($col_090.equalsIgnoreCase(name)) {
			return col_090();
		}
		if ($col_091.equalsIgnoreCase(name)) {
			return col_091();
		}
		if ($col_092.equalsIgnoreCase(name)) {
			return col_092();
		}
		if ($col_093.equalsIgnoreCase(name)) {
			return col_093();
		}
		if ($col_094.equalsIgnoreCase(name)) {
			return col_094();
		}
		if ($col_095.equalsIgnoreCase(name)) {
			return col_095();
		}
		if ($col_096.equalsIgnoreCase(name)) {
			return col_096();
		}
		if ($col_097.equalsIgnoreCase(name)) {
			return col_097();
		}
		if ($col_098.equalsIgnoreCase(name)) {
			return col_098();
		}
		if ($col_099.equalsIgnoreCase(name)) {
			return col_099();
		}
		if ($col_100.equalsIgnoreCase(name)) {
			return col_100();
		}
		if ($col_101.equalsIgnoreCase(name)) {
			return col_101();
		}
		if ($col_102.equalsIgnoreCase(name)) {
			return col_102();
		}
		if ($col_103.equalsIgnoreCase(name)) {
			return col_103();
		}
		if ($col_104.equalsIgnoreCase(name)) {
			return col_104();
		}
		if ($col_105.equalsIgnoreCase(name)) {
			return col_105();
		}
		if ($col_106.equalsIgnoreCase(name)) {
			return col_106();
		}
		if ($col_107.equalsIgnoreCase(name)) {
			return col_107();
		}
		if ($col_108.equalsIgnoreCase(name)) {
			return col_108();
		}
		if ($col_109.equalsIgnoreCase(name)) {
			return col_109();
		}
		if ($col_110.equalsIgnoreCase(name)) {
			return col_110();
		}
		if ($col_111.equalsIgnoreCase(name)) {
			return col_111();
		}
		if ($col_112.equalsIgnoreCase(name)) {
			return col_112();
		}
		if ($col_113.equalsIgnoreCase(name)) {
			return col_113();
		}
		if ($col_114.equalsIgnoreCase(name)) {
			return col_114();
		}
		if ($col_115.equalsIgnoreCase(name)) {
			return col_115();
		}
		if ($col_116.equalsIgnoreCase(name)) {
			return col_116();
		}
		if ($col_117.equalsIgnoreCase(name)) {
			return col_117();
		}
		if ($col_118.equalsIgnoreCase(name)) {
			return col_118();
		}
		if ($col_119.equalsIgnoreCase(name)) {
			return col_119();
		}
		if ($col_120.equalsIgnoreCase(name)) {
			return col_120();
		}
		if ($col_121.equalsIgnoreCase(name)) {
			return col_121();
		}
		if ($col_122.equalsIgnoreCase(name)) {
			return col_122();
		}
		if ($col_123.equalsIgnoreCase(name)) {
			return col_123();
		}
		if ($col_124.equalsIgnoreCase(name)) {
			return col_124();
		}
		if ($col_125.equalsIgnoreCase(name)) {
			return col_125();
		}
		if ($col_126.equalsIgnoreCase(name)) {
			return col_126();
		}
		if ($col_127.equalsIgnoreCase(name)) {
			return col_127();
		}
		if ($col_128.equalsIgnoreCase(name)) {
			return col_128();
		}
		if ($col_129.equalsIgnoreCase(name)) {
			return col_129();
		}
		if ($col_130.equalsIgnoreCase(name)) {
			return col_130();
		}
		if ($col_131.equalsIgnoreCase(name)) {
			return col_131();
		}
		if ($col_132.equalsIgnoreCase(name)) {
			return col_132();
		}
		if ($col_133.equalsIgnoreCase(name)) {
			return col_133();
		}
		if ($col_134.equalsIgnoreCase(name)) {
			return col_134();
		}
		if ($col_135.equalsIgnoreCase(name)) {
			return col_135();
		}
		if ($col_136.equalsIgnoreCase(name)) {
			return col_136();
		}
		if ($col_137.equalsIgnoreCase(name)) {
			return col_137();
		}
		if ($col_138.equalsIgnoreCase(name)) {
			return col_138();
		}
		if ($col_139.equalsIgnoreCase(name)) {
			return col_139();
		}
		if ($col_140.equalsIgnoreCase(name)) {
			return col_140();
		}
		if ($col_141.equalsIgnoreCase(name)) {
			return col_141();
		}
		if ($col_142.equalsIgnoreCase(name)) {
			return col_142();
		}
		if ($col_143.equalsIgnoreCase(name)) {
			return col_143();
		}
		if ($col_144.equalsIgnoreCase(name)) {
			return col_144();
		}
		if ($col_145.equalsIgnoreCase(name)) {
			return col_145();
		}
		if ($col_146.equalsIgnoreCase(name)) {
			return col_146();
		}
		if ($col_147.equalsIgnoreCase(name)) {
			return col_147();
		}
		if ($col_148.equalsIgnoreCase(name)) {
			return col_148();
		}
		if ($col_149.equalsIgnoreCase(name)) {
			return col_149();
		}
		if ($col_150.equalsIgnoreCase(name)) {
			return col_150();
		}
		if ($col_151.equalsIgnoreCase(name)) {
			return col_151();
		}
		if ($col_152.equalsIgnoreCase(name)) {
			return col_152();
		}
		if ($col_153.equalsIgnoreCase(name)) {
			return col_153();
		}
		if ($col_154.equalsIgnoreCase(name)) {
			return col_154();
		}
		if ($col_155.equalsIgnoreCase(name)) {
			return col_155();
		}
		if ($col_156.equalsIgnoreCase(name)) {
			return col_156();
		}
		if ($col_157.equalsIgnoreCase(name)) {
			return col_157();
		}
		if ($col_158.equalsIgnoreCase(name)) {
			return col_158();
		}
		if ($col_159.equalsIgnoreCase(name)) {
			return col_159();
		}
		if ($col_160.equalsIgnoreCase(name)) {
			return col_160();
		}
		if ($col_161.equalsIgnoreCase(name)) {
			return col_161();
		}
		if ($col_162.equalsIgnoreCase(name)) {
			return col_162();
		}
		if ($col_163.equalsIgnoreCase(name)) {
			return col_163();
		}
		if ($col_164.equalsIgnoreCase(name)) {
			return col_164();
		}
		if ($col_165.equalsIgnoreCase(name)) {
			return col_165();
		}
		if ($col_166.equalsIgnoreCase(name)) {
			return col_166();
		}
		if ($col_167.equalsIgnoreCase(name)) {
			return col_167();
		}
		if ($col_168.equalsIgnoreCase(name)) {
			return col_168();
		}
		if ($col_169.equalsIgnoreCase(name)) {
			return col_169();
		}
		if ($col_170.equalsIgnoreCase(name)) {
			return col_170();
		}
		if ($col_171.equalsIgnoreCase(name)) {
			return col_171();
		}
		if ($col_172.equalsIgnoreCase(name)) {
			return col_172();
		}
		if ($col_173.equalsIgnoreCase(name)) {
			return col_173();
		}
		if ($col_174.equalsIgnoreCase(name)) {
			return col_174();
		}
		if ($col_175.equalsIgnoreCase(name)) {
			return col_175();
		}
		if ($col_176.equalsIgnoreCase(name)) {
			return col_176();
		}
		if ($col_177.equalsIgnoreCase(name)) {
			return col_177();
		}
		if ($col_178.equalsIgnoreCase(name)) {
			return col_178();
		}
		if ($col_179.equalsIgnoreCase(name)) {
			return col_179();
		}
		if ($col_180.equalsIgnoreCase(name)) {
			return col_180();
		}
		if ($col_181.equalsIgnoreCase(name)) {
			return col_181();
		}
		if ($col_182.equalsIgnoreCase(name)) {
			return col_182();
		}
		if ($col_183.equalsIgnoreCase(name)) {
			return col_183();
		}
		if ($col_184.equalsIgnoreCase(name)) {
			return col_184();
		}
		if ($col_185.equalsIgnoreCase(name)) {
			return col_185();
		}
		if ($col_186.equalsIgnoreCase(name)) {
			return col_186();
		}
		if ($col_187.equalsIgnoreCase(name)) {
			return col_187();
		}
		if ($col_188.equalsIgnoreCase(name)) {
			return col_188();
		}
		if ($col_189.equalsIgnoreCase(name)) {
			return col_189();
		}
		if ($col_190.equalsIgnoreCase(name)) {
			return col_190();
		}
		if ($col_191.equalsIgnoreCase(name)) {
			return col_191();
		}
		if ($col_192.equalsIgnoreCase(name)) {
			return col_192();
		}
		if ($col_193.equalsIgnoreCase(name)) {
			return col_193();
		}
		if ($col_194.equalsIgnoreCase(name)) {
			return col_194();
		}
		if ($col_195.equalsIgnoreCase(name)) {
			return col_195();
		}
		if ($col_196.equalsIgnoreCase(name)) {
			return col_196();
		}
		if ($col_197.equalsIgnoreCase(name)) {
			return col_197();
		}
		if ($col_198.equalsIgnoreCase(name)) {
			return col_198();
		}
		if ($col_199.equalsIgnoreCase(name)) {
			return col_199();
		}
		if ($col_200.equalsIgnoreCase(name)) {
			return col_200();
		}
		if ($col_201.equalsIgnoreCase(name)) {
			return col_201();
		}
		if ($col_202.equalsIgnoreCase(name)) {
			return col_202();
		}
		if ($col_203.equalsIgnoreCase(name)) {
			return col_203();
		}
		if ($col_204.equalsIgnoreCase(name)) {
			return col_204();
		}
		if ($col_205.equalsIgnoreCase(name)) {
			return col_205();
		}
		if ($col_206.equalsIgnoreCase(name)) {
			return col_206();
		}
		if ($col_207.equalsIgnoreCase(name)) {
			return col_207();
		}
		if ($col_208.equalsIgnoreCase(name)) {
			return col_208();
		}
		if ($col_209.equalsIgnoreCase(name)) {
			return col_209();
		}
		if ($col_210.equalsIgnoreCase(name)) {
			return col_210();
		}
		if ($col_211.equalsIgnoreCase(name)) {
			return col_211();
		}
		if ($col_212.equalsIgnoreCase(name)) {
			return col_212();
		}
		if ($col_213.equalsIgnoreCase(name)) {
			return col_213();
		}
		if ($col_214.equalsIgnoreCase(name)) {
			return col_214();
		}
		if ($col_215.equalsIgnoreCase(name)) {
			return col_215();
		}
		if ($col_216.equalsIgnoreCase(name)) {
			return col_216();
		}
		if ($col_217.equalsIgnoreCase(name)) {
			return col_217();
		}
		if ($col_218.equalsIgnoreCase(name)) {
			return col_218();
		}
		if ($col_219.equalsIgnoreCase(name)) {
			return col_219();
		}
		if ($col_220.equalsIgnoreCase(name)) {
			return col_220();
		}
		if ($col_221.equalsIgnoreCase(name)) {
			return col_221();
		}
		if ($col_222.equalsIgnoreCase(name)) {
			return col_222();
		}
		if ($col_223.equalsIgnoreCase(name)) {
			return col_223();
		}
		if ($col_224.equalsIgnoreCase(name)) {
			return col_224();
		}
		if ($col_225.equalsIgnoreCase(name)) {
			return col_225();
		}
		if ($col_226.equalsIgnoreCase(name)) {
			return col_226();
		}
		if ($col_227.equalsIgnoreCase(name)) {
			return col_227();
		}
		if ($col_228.equalsIgnoreCase(name)) {
			return col_228();
		}
		if ($col_229.equalsIgnoreCase(name)) {
			return col_229();
		}
		if ($col_230.equalsIgnoreCase(name)) {
			return col_230();
		}
		if ($col_231.equalsIgnoreCase(name)) {
			return col_231();
		}
		if ($col_232.equalsIgnoreCase(name)) {
			return col_232();
		}
		if ($col_233.equalsIgnoreCase(name)) {
			return col_233();
		}
		if ($col_234.equalsIgnoreCase(name)) {
			return col_234();
		}
		if ($col_235.equalsIgnoreCase(name)) {
			return col_235();
		}
		if ($col_236.equalsIgnoreCase(name)) {
			return col_236();
		}
		if ($col_237.equalsIgnoreCase(name)) {
			return col_237();
		}
		if ($col_238.equalsIgnoreCase(name)) {
			return col_238();
		}
		if ($col_239.equalsIgnoreCase(name)) {
			return col_239();
		}
		if ($col_240.equalsIgnoreCase(name)) {
			return col_240();
		}
		if ($col_241.equalsIgnoreCase(name)) {
			return col_241();
		}
		if ($col_242.equalsIgnoreCase(name)) {
			return col_242();
		}
		if ($col_243.equalsIgnoreCase(name)) {
			return col_243();
		}
		if ($col_244.equalsIgnoreCase(name)) {
			return col_244();
		}
		if ($col_245.equalsIgnoreCase(name)) {
			return col_245();
		}
		if ($col_246.equalsIgnoreCase(name)) {
			return col_246();
		}
		if ($col_247.equalsIgnoreCase(name)) {
			return col_247();
		}
		if ($col_248.equalsIgnoreCase(name)) {
			return col_248();
		}
		if ($col_249.equalsIgnoreCase(name)) {
			return col_249();
		}
		if ($col_250.equalsIgnoreCase(name)) {
			return col_250();
		}
		if ($col_251.equalsIgnoreCase(name)) {
			return col_251();
		}
		if ($col_252.equalsIgnoreCase(name)) {
			return col_252();
		}
		if ($col_253.equalsIgnoreCase(name)) {
			return col_253();
		}
		if ($col_254.equalsIgnoreCase(name)) {
			return col_254();
		}
		if ($col_255.equalsIgnoreCase(name)) {
			return col_255();
		}
		if ($col_256.equalsIgnoreCase(name)) {
			return col_256();
		}
		if ($col_257.equalsIgnoreCase(name)) {
			return col_257();
		}
		if ($col_258.equalsIgnoreCase(name)) {
			return col_258();
		}
		if ($col_259.equalsIgnoreCase(name)) {
			return col_259();
		}
		if ($col_260.equalsIgnoreCase(name)) {
			return col_260();
		}
		if ($col_261.equalsIgnoreCase(name)) {
			return col_261();
		}
		if ($col_262.equalsIgnoreCase(name)) {
			return col_262();
		}
		if ($col_263.equalsIgnoreCase(name)) {
			return col_263();
		}
		if ($col_264.equalsIgnoreCase(name)) {
			return col_264();
		}
		if ($col_265.equalsIgnoreCase(name)) {
			return col_265();
		}
		if ($col_266.equalsIgnoreCase(name)) {
			return col_266();
		}
		if ($col_267.equalsIgnoreCase(name)) {
			return col_267();
		}
		if ($col_268.equalsIgnoreCase(name)) {
			return col_268();
		}
		if ($col_269.equalsIgnoreCase(name)) {
			return col_269();
		}
		if ($col_270.equalsIgnoreCase(name)) {
			return col_270();
		}
		if ($col_271.equalsIgnoreCase(name)) {
			return col_271();
		}
		if ($col_272.equalsIgnoreCase(name)) {
			return col_272();
		}
		if ($col_273.equalsIgnoreCase(name)) {
			return col_273();
		}
		if ($col_274.equalsIgnoreCase(name)) {
			return col_274();
		}
		if ($col_275.equalsIgnoreCase(name)) {
			return col_275();
		}
		if ($col_276.equalsIgnoreCase(name)) {
			return col_276();
		}
		if ($col_277.equalsIgnoreCase(name)) {
			return col_277();
		}
		if ($col_278.equalsIgnoreCase(name)) {
			return col_278();
		}
		if ($col_279.equalsIgnoreCase(name)) {
			return col_279();
		}
		if ($col_280.equalsIgnoreCase(name)) {
			return col_280();
		}
		if ($col_281.equalsIgnoreCase(name)) {
			return col_281();
		}
		if ($col_282.equalsIgnoreCase(name)) {
			return col_282();
		}
		if ($col_283.equalsIgnoreCase(name)) {
			return col_283();
		}
		if ($col_284.equalsIgnoreCase(name)) {
			return col_284();
		}
		if ($col_285.equalsIgnoreCase(name)) {
			return col_285();
		}
		if ($col_286.equalsIgnoreCase(name)) {
			return col_286();
		}
		if ($col_287.equalsIgnoreCase(name)) {
			return col_287();
		}
		if ($col_288.equalsIgnoreCase(name)) {
			return col_288();
		}
		if ($col_289.equalsIgnoreCase(name)) {
			return col_289();
		}
		if ($col_290.equalsIgnoreCase(name)) {
			return col_290();
		}
		if ($col_291.equalsIgnoreCase(name)) {
			return col_291();
		}
		if ($col_292.equalsIgnoreCase(name)) {
			return col_292();
		}
		if ($col_293.equalsIgnoreCase(name)) {
			return col_293();
		}
		if ($col_294.equalsIgnoreCase(name)) {
			return col_294();
		}
		if ($col_295.equalsIgnoreCase(name)) {
			return col_295();
		}
		if ($col_296.equalsIgnoreCase(name)) {
			return col_296();
		}
		if ($col_297.equalsIgnoreCase(name)) {
			return col_297();
		}
		if ($col_298.equalsIgnoreCase(name)) {
			return col_298();
		}
		if ($col_299.equalsIgnoreCase(name)) {
			return col_299();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			par_itm_typ_nm(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
			return;
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			par_itm_typ_d_nm(value);
			return;
		}
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			par_itm_jnl_cd(value);
			return;
		}
		if ($par_itm_jnl_nm.equalsIgnoreCase(name)) {
			par_itm_jnl_nm(value);
			return;
		}
		if ($par_itm_grp_cd1.equalsIgnoreCase(name)) {
			par_itm_grp_cd1(value);
			return;
		}
		if ($par_itm_grp_nm1.equalsIgnoreCase(name)) {
			par_itm_grp_nm1(value);
			return;
		}
		if ($par_itm_grp_cd2.equalsIgnoreCase(name)) {
			par_itm_grp_cd2(value);
			return;
		}
		if ($par_itm_grp_nm2.equalsIgnoreCase(name)) {
			par_itm_grp_nm2(value);
			return;
		}
		if ($par_itm_grp_cd3.equalsIgnoreCase(name)) {
			par_itm_grp_cd3(value);
			return;
		}
		if ($par_itm_grp_nm3.equalsIgnoreCase(name)) {
			par_itm_grp_nm3(value);
			return;
		}
		if ($par_itm_grp_cd4.equalsIgnoreCase(name)) {
			par_itm_grp_cd4(value);
			return;
		}
		if ($par_itm_grp_nm4.equalsIgnoreCase(name)) {
			par_itm_grp_nm4(value);
			return;
		}
		if ($par_itm_grp_cd5.equalsIgnoreCase(name)) {
			par_itm_grp_cd5(value);
			return;
		}
		if ($par_itm_grp_nm5.equalsIgnoreCase(name)) {
			par_itm_grp_nm5(value);
			return;
		}
		if ($par_itm_grp_cd6.equalsIgnoreCase(name)) {
			par_itm_grp_cd6(value);
			return;
		}
		if ($par_itm_grp_nm6.equalsIgnoreCase(name)) {
			par_itm_grp_nm6(value);
			return;
		}
		if ($par_itm_grp_cd7.equalsIgnoreCase(name)) {
			par_itm_grp_cd7(value);
			return;
		}
		if ($par_itm_grp_nm7.equalsIgnoreCase(name)) {
			par_itm_grp_nm7(value);
			return;
		}
		if ($par_itm_grp_cd8.equalsIgnoreCase(name)) {
			par_itm_grp_cd8(value);
			return;
		}
		if ($par_itm_grp_nm8.equalsIgnoreCase(name)) {
			par_itm_grp_nm8(value);
			return;
		}
		if ($par_itm_grp_cd9.equalsIgnoreCase(name)) {
			par_itm_grp_cd9(value);
			return;
		}
		if ($par_itm_grp_nm9.equalsIgnoreCase(name)) {
			par_itm_grp_nm9(value);
			return;
		}
		if ($par_itm_grp_cd10.equalsIgnoreCase(name)) {
			par_itm_grp_cd10(value);
			return;
		}
		if ($par_itm_grp_nm10.equalsIgnoreCase(name)) {
			par_itm_grp_nm10(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		if ($par_sno1.equalsIgnoreCase(name)) {
			par_sno1(value);
			return;
		}
		if ($par_sno2.equalsIgnoreCase(name)) {
			par_sno2(value);
			return;
		}
		if ($par_sno3.equalsIgnoreCase(name)) {
			par_sno3(value);
			return;
		}
		if ($par_sno4.equalsIgnoreCase(name)) {
			par_sno4(value);
			return;
		}
		if ($par_asst_typ.equalsIgnoreCase(name)) {
			par_asst_typ(value);
			return;
		}
		if ($par_asst_typ_nm.equalsIgnoreCase(name)) {
			par_asst_typ_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($par_unit_cd.equalsIgnoreCase(name)) {
			par_unit_cd(value);
			return;
		}
		if ($par_unit_nm.equalsIgnoreCase(name)) {
			par_unit_nm(value);
			return;
		}
		if ($inpt_dpt_cd.equalsIgnoreCase(name)) {
			inpt_dpt_cd(value);
			return;
		}
		if ($inpt_dpt_nm.equalsIgnoreCase(name)) {
			inpt_dpt_nm(value);
			return;
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			chd_itm_typ(value);
			return;
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_nm(value);
			return;
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			chd_itm_typ_d_cd(value);
			return;
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_d_nm(value);
			return;
		}
		if ($chd_itm_jnl_cd.equalsIgnoreCase(name)) {
			chd_itm_jnl_cd(value);
			return;
		}
		if ($chd_itm_jnl_nm.equalsIgnoreCase(name)) {
			chd_itm_jnl_nm(value);
			return;
		}
		if ($chd_itm_grp_cd1.equalsIgnoreCase(name)) {
			chd_itm_grp_cd1(value);
			return;
		}
		if ($chd_itm_grp_nm1.equalsIgnoreCase(name)) {
			chd_itm_grp_nm1(value);
			return;
		}
		if ($chd_itm_grp_cd2.equalsIgnoreCase(name)) {
			chd_itm_grp_cd2(value);
			return;
		}
		if ($chd_itm_grp_nm2.equalsIgnoreCase(name)) {
			chd_itm_grp_nm2(value);
			return;
		}
		if ($chd_itm_grp_cd3.equalsIgnoreCase(name)) {
			chd_itm_grp_cd3(value);
			return;
		}
		if ($chd_itm_grp_nm3.equalsIgnoreCase(name)) {
			chd_itm_grp_nm3(value);
			return;
		}
		if ($chd_itm_grp_cd4.equalsIgnoreCase(name)) {
			chd_itm_grp_cd4(value);
			return;
		}
		if ($chd_itm_grp_nm4.equalsIgnoreCase(name)) {
			chd_itm_grp_nm4(value);
			return;
		}
		if ($chd_itm_grp_cd5.equalsIgnoreCase(name)) {
			chd_itm_grp_cd5(value);
			return;
		}
		if ($chd_itm_grp_nm5.equalsIgnoreCase(name)) {
			chd_itm_grp_nm5(value);
			return;
		}
		if ($chd_itm_grp_cd6.equalsIgnoreCase(name)) {
			chd_itm_grp_cd6(value);
			return;
		}
		if ($chd_itm_grp_nm6.equalsIgnoreCase(name)) {
			chd_itm_grp_nm6(value);
			return;
		}
		if ($chd_itm_grp_cd7.equalsIgnoreCase(name)) {
			chd_itm_grp_cd7(value);
			return;
		}
		if ($chd_itm_grp_nm7.equalsIgnoreCase(name)) {
			chd_itm_grp_nm7(value);
			return;
		}
		if ($chd_itm_grp_cd8.equalsIgnoreCase(name)) {
			chd_itm_grp_cd8(value);
			return;
		}
		if ($chd_itm_grp_nm8.equalsIgnoreCase(name)) {
			chd_itm_grp_nm8(value);
			return;
		}
		if ($chd_itm_grp_cd9.equalsIgnoreCase(name)) {
			chd_itm_grp_cd9(value);
			return;
		}
		if ($chd_itm_grp_nm9.equalsIgnoreCase(name)) {
			chd_itm_grp_nm9(value);
			return;
		}
		if ($chd_itm_grp_cd10.equalsIgnoreCase(name)) {
			chd_itm_grp_cd10(value);
			return;
		}
		if ($chd_itm_grp_nm10.equalsIgnoreCase(name)) {
			chd_itm_grp_nm10(value);
			return;
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			chd_lot_no(value);
			return;
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			chd_sublot_no(value);
			return;
		}
		if ($chd_sno1.equalsIgnoreCase(name)) {
			chd_sno1(value);
			return;
		}
		if ($chd_sno2.equalsIgnoreCase(name)) {
			chd_sno2(value);
			return;
		}
		if ($chd_sno3.equalsIgnoreCase(name)) {
			chd_sno3(value);
			return;
		}
		if ($chd_sno4.equalsIgnoreCase(name)) {
			chd_sno4(value);
			return;
		}
		if ($chd_asst_typ.equalsIgnoreCase(name)) {
			chd_asst_typ(value);
			return;
		}
		if ($chd_asst_typ_nm.equalsIgnoreCase(name)) {
			chd_asst_typ_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			expns_grp_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($cost_diff.equalsIgnoreCase(name)) {
			cost_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($ttl_qty.equalsIgnoreCase(name)) {
			ttl_qty(value);
			return;
		}
		if ($var_cost_qty.equalsIgnoreCase(name)) {
			var_cost_qty(value);
			return;
		}
		if ($fxd_cost_qty.equalsIgnoreCase(name)) {
			fxd_cost_qty(value);
			return;
		}
		if ($ttl_up.equalsIgnoreCase(name)) {
			ttl_up(value);
			return;
		}
		if ($var_cost_up.equalsIgnoreCase(name)) {
			var_cost_up(value);
			return;
		}
		if ($fxd_cost_up.equalsIgnoreCase(name)) {
			fxd_cost_up(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($cost_diff.equalsIgnoreCase(name)) {
			cost_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($ttl_qty.equalsIgnoreCase(name)) {
			ttl_qty(value);
			return;
		}
		if ($var_cost_qty.equalsIgnoreCase(name)) {
			var_cost_qty(value);
			return;
		}
		if ($fxd_cost_qty.equalsIgnoreCase(name)) {
			fxd_cost_qty(value);
			return;
		}
		if ($ttl_up.equalsIgnoreCase(name)) {
			ttl_up(value);
			return;
		}
		if ($var_cost_up.equalsIgnoreCase(name)) {
			var_cost_up(value);
			return;
		}
		if ($fxd_cost_up.equalsIgnoreCase(name)) {
			fxd_cost_up(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($cost_diff.equalsIgnoreCase(name)) {
			cost_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($ttl_qty.equalsIgnoreCase(name)) {
			ttl_qty(value);
			return;
		}
		if ($var_cost_qty.equalsIgnoreCase(name)) {
			var_cost_qty(value);
			return;
		}
		if ($fxd_cost_qty.equalsIgnoreCase(name)) {
			fxd_cost_qty(value);
			return;
		}
		if ($ttl_up.equalsIgnoreCase(name)) {
			ttl_up(value);
			return;
		}
		if ($var_cost_up.equalsIgnoreCase(name)) {
			var_cost_up(value);
			return;
		}
		if ($fxd_cost_up.equalsIgnoreCase(name)) {
			fxd_cost_up(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($cost_diff.equalsIgnoreCase(name)) {
			cost_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($ttl_qty.equalsIgnoreCase(name)) {
			ttl_qty(value);
			return;
		}
		if ($var_cost_qty.equalsIgnoreCase(name)) {
			var_cost_qty(value);
			return;
		}
		if ($fxd_cost_qty.equalsIgnoreCase(name)) {
			fxd_cost_qty(value);
			return;
		}
		if ($ttl_up.equalsIgnoreCase(name)) {
			ttl_up(value);
			return;
		}
		if ($var_cost_up.equalsIgnoreCase(name)) {
			var_cost_up(value);
			return;
		}
		if ($fxd_cost_up.equalsIgnoreCase(name)) {
			fxd_cost_up(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($cost_diff.equalsIgnoreCase(name)) {
			cost_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($ttl_qty.equalsIgnoreCase(name)) {
			ttl_qty(value);
			return;
		}
		if ($var_cost_qty.equalsIgnoreCase(name)) {
			var_cost_qty(value);
			return;
		}
		if ($fxd_cost_qty.equalsIgnoreCase(name)) {
			fxd_cost_qty(value);
			return;
		}
		if ($ttl_up.equalsIgnoreCase(name)) {
			ttl_up(value);
			return;
		}
		if ($var_cost_up.equalsIgnoreCase(name)) {
			var_cost_up(value);
			return;
		}
		if ($fxd_cost_up.equalsIgnoreCase(name)) {
			fxd_cost_up(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			par_itm_typ_nm(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
			return;
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			par_itm_typ_d_nm(value);
			return;
		}
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			par_itm_jnl_cd(value);
			return;
		}
		if ($par_itm_jnl_nm.equalsIgnoreCase(name)) {
			par_itm_jnl_nm(value);
			return;
		}
		if ($par_itm_grp_cd1.equalsIgnoreCase(name)) {
			par_itm_grp_cd1(value);
			return;
		}
		if ($par_itm_grp_nm1.equalsIgnoreCase(name)) {
			par_itm_grp_nm1(value);
			return;
		}
		if ($par_itm_grp_cd2.equalsIgnoreCase(name)) {
			par_itm_grp_cd2(value);
			return;
		}
		if ($par_itm_grp_nm2.equalsIgnoreCase(name)) {
			par_itm_grp_nm2(value);
			return;
		}
		if ($par_itm_grp_cd3.equalsIgnoreCase(name)) {
			par_itm_grp_cd3(value);
			return;
		}
		if ($par_itm_grp_nm3.equalsIgnoreCase(name)) {
			par_itm_grp_nm3(value);
			return;
		}
		if ($par_itm_grp_cd4.equalsIgnoreCase(name)) {
			par_itm_grp_cd4(value);
			return;
		}
		if ($par_itm_grp_nm4.equalsIgnoreCase(name)) {
			par_itm_grp_nm4(value);
			return;
		}
		if ($par_itm_grp_cd5.equalsIgnoreCase(name)) {
			par_itm_grp_cd5(value);
			return;
		}
		if ($par_itm_grp_nm5.equalsIgnoreCase(name)) {
			par_itm_grp_nm5(value);
			return;
		}
		if ($par_itm_grp_cd6.equalsIgnoreCase(name)) {
			par_itm_grp_cd6(value);
			return;
		}
		if ($par_itm_grp_nm6.equalsIgnoreCase(name)) {
			par_itm_grp_nm6(value);
			return;
		}
		if ($par_itm_grp_cd7.equalsIgnoreCase(name)) {
			par_itm_grp_cd7(value);
			return;
		}
		if ($par_itm_grp_nm7.equalsIgnoreCase(name)) {
			par_itm_grp_nm7(value);
			return;
		}
		if ($par_itm_grp_cd8.equalsIgnoreCase(name)) {
			par_itm_grp_cd8(value);
			return;
		}
		if ($par_itm_grp_nm8.equalsIgnoreCase(name)) {
			par_itm_grp_nm8(value);
			return;
		}
		if ($par_itm_grp_cd9.equalsIgnoreCase(name)) {
			par_itm_grp_cd9(value);
			return;
		}
		if ($par_itm_grp_nm9.equalsIgnoreCase(name)) {
			par_itm_grp_nm9(value);
			return;
		}
		if ($par_itm_grp_cd10.equalsIgnoreCase(name)) {
			par_itm_grp_cd10(value);
			return;
		}
		if ($par_itm_grp_nm10.equalsIgnoreCase(name)) {
			par_itm_grp_nm10(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		if ($par_sno1.equalsIgnoreCase(name)) {
			par_sno1(value);
			return;
		}
		if ($par_sno2.equalsIgnoreCase(name)) {
			par_sno2(value);
			return;
		}
		if ($par_sno3.equalsIgnoreCase(name)) {
			par_sno3(value);
			return;
		}
		if ($par_sno4.equalsIgnoreCase(name)) {
			par_sno4(value);
			return;
		}
		if ($par_asst_typ.equalsIgnoreCase(name)) {
			par_asst_typ(value);
			return;
		}
		if ($par_asst_typ_nm.equalsIgnoreCase(name)) {
			par_asst_typ_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($par_unit_cd.equalsIgnoreCase(name)) {
			par_unit_cd(value);
			return;
		}
		if ($par_unit_nm.equalsIgnoreCase(name)) {
			par_unit_nm(value);
			return;
		}
		if ($inpt_dpt_cd.equalsIgnoreCase(name)) {
			inpt_dpt_cd(value);
			return;
		}
		if ($inpt_dpt_nm.equalsIgnoreCase(name)) {
			inpt_dpt_nm(value);
			return;
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			chd_itm_typ(value);
			return;
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_nm(value);
			return;
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			chd_itm_typ_d_cd(value);
			return;
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_d_nm(value);
			return;
		}
		if ($chd_itm_jnl_cd.equalsIgnoreCase(name)) {
			chd_itm_jnl_cd(value);
			return;
		}
		if ($chd_itm_jnl_nm.equalsIgnoreCase(name)) {
			chd_itm_jnl_nm(value);
			return;
		}
		if ($chd_itm_grp_cd1.equalsIgnoreCase(name)) {
			chd_itm_grp_cd1(value);
			return;
		}
		if ($chd_itm_grp_nm1.equalsIgnoreCase(name)) {
			chd_itm_grp_nm1(value);
			return;
		}
		if ($chd_itm_grp_cd2.equalsIgnoreCase(name)) {
			chd_itm_grp_cd2(value);
			return;
		}
		if ($chd_itm_grp_nm2.equalsIgnoreCase(name)) {
			chd_itm_grp_nm2(value);
			return;
		}
		if ($chd_itm_grp_cd3.equalsIgnoreCase(name)) {
			chd_itm_grp_cd3(value);
			return;
		}
		if ($chd_itm_grp_nm3.equalsIgnoreCase(name)) {
			chd_itm_grp_nm3(value);
			return;
		}
		if ($chd_itm_grp_cd4.equalsIgnoreCase(name)) {
			chd_itm_grp_cd4(value);
			return;
		}
		if ($chd_itm_grp_nm4.equalsIgnoreCase(name)) {
			chd_itm_grp_nm4(value);
			return;
		}
		if ($chd_itm_grp_cd5.equalsIgnoreCase(name)) {
			chd_itm_grp_cd5(value);
			return;
		}
		if ($chd_itm_grp_nm5.equalsIgnoreCase(name)) {
			chd_itm_grp_nm5(value);
			return;
		}
		if ($chd_itm_grp_cd6.equalsIgnoreCase(name)) {
			chd_itm_grp_cd6(value);
			return;
		}
		if ($chd_itm_grp_nm6.equalsIgnoreCase(name)) {
			chd_itm_grp_nm6(value);
			return;
		}
		if ($chd_itm_grp_cd7.equalsIgnoreCase(name)) {
			chd_itm_grp_cd7(value);
			return;
		}
		if ($chd_itm_grp_nm7.equalsIgnoreCase(name)) {
			chd_itm_grp_nm7(value);
			return;
		}
		if ($chd_itm_grp_cd8.equalsIgnoreCase(name)) {
			chd_itm_grp_cd8(value);
			return;
		}
		if ($chd_itm_grp_nm8.equalsIgnoreCase(name)) {
			chd_itm_grp_nm8(value);
			return;
		}
		if ($chd_itm_grp_cd9.equalsIgnoreCase(name)) {
			chd_itm_grp_cd9(value);
			return;
		}
		if ($chd_itm_grp_nm9.equalsIgnoreCase(name)) {
			chd_itm_grp_nm9(value);
			return;
		}
		if ($chd_itm_grp_cd10.equalsIgnoreCase(name)) {
			chd_itm_grp_cd10(value);
			return;
		}
		if ($chd_itm_grp_nm10.equalsIgnoreCase(name)) {
			chd_itm_grp_nm10(value);
			return;
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			chd_lot_no(value);
			return;
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			chd_sublot_no(value);
			return;
		}
		if ($chd_sno1.equalsIgnoreCase(name)) {
			chd_sno1(value);
			return;
		}
		if ($chd_sno2.equalsIgnoreCase(name)) {
			chd_sno2(value);
			return;
		}
		if ($chd_sno3.equalsIgnoreCase(name)) {
			chd_sno3(value);
			return;
		}
		if ($chd_sno4.equalsIgnoreCase(name)) {
			chd_sno4(value);
			return;
		}
		if ($chd_asst_typ.equalsIgnoreCase(name)) {
			chd_asst_typ(value);
			return;
		}
		if ($chd_asst_typ_nm.equalsIgnoreCase(name)) {
			chd_asst_typ_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($expns_grp_cd.equalsIgnoreCase(name)) {
			expns_grp_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($cost_diff.equalsIgnoreCase(name)) {
			cost_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($ttl_qty.equalsIgnoreCase(name)) {
			ttl_qty(value);
			return;
		}
		if ($var_cost_qty.equalsIgnoreCase(name)) {
			var_cost_qty(value);
			return;
		}
		if ($fxd_cost_qty.equalsIgnoreCase(name)) {
			fxd_cost_qty(value);
			return;
		}
		if ($ttl_up.equalsIgnoreCase(name)) {
			ttl_up(value);
			return;
		}
		if ($var_cost_up.equalsIgnoreCase(name)) {
			var_cost_up(value);
			return;
		}
		if ($fxd_cost_up.equalsIgnoreCase(name)) {
			fxd_cost_up(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($cost_diff.equalsIgnoreCase(name)) {
			cost_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($ttl_qty.equalsIgnoreCase(name)) {
			ttl_qty(value);
			return;
		}
		if ($var_cost_qty.equalsIgnoreCase(name)) {
			var_cost_qty(value);
			return;
		}
		if ($fxd_cost_qty.equalsIgnoreCase(name)) {
			fxd_cost_qty(value);
			return;
		}
		if ($ttl_up.equalsIgnoreCase(name)) {
			ttl_up(value);
			return;
		}
		if ($var_cost_up.equalsIgnoreCase(name)) {
			var_cost_up(value);
			return;
		}
		if ($fxd_cost_up.equalsIgnoreCase(name)) {
			fxd_cost_up(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($cost_diff.equalsIgnoreCase(name)) {
			cost_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($ttl_qty.equalsIgnoreCase(name)) {
			ttl_qty(value);
			return;
		}
		if ($var_cost_qty.equalsIgnoreCase(name)) {
			var_cost_qty(value);
			return;
		}
		if ($fxd_cost_qty.equalsIgnoreCase(name)) {
			fxd_cost_qty(value);
			return;
		}
		if ($ttl_up.equalsIgnoreCase(name)) {
			ttl_up(value);
			return;
		}
		if ($var_cost_up.equalsIgnoreCase(name)) {
			var_cost_up(value);
			return;
		}
		if ($fxd_cost_up.equalsIgnoreCase(name)) {
			fxd_cost_up(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($cost_diff.equalsIgnoreCase(name)) {
			cost_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($ttl_qty.equalsIgnoreCase(name)) {
			ttl_qty(value);
			return;
		}
		if ($var_cost_qty.equalsIgnoreCase(name)) {
			var_cost_qty(value);
			return;
		}
		if ($fxd_cost_qty.equalsIgnoreCase(name)) {
			fxd_cost_qty(value);
			return;
		}
		if ($ttl_up.equalsIgnoreCase(name)) {
			ttl_up(value);
			return;
		}
		if ($var_cost_up.equalsIgnoreCase(name)) {
			var_cost_up(value);
			return;
		}
		if ($fxd_cost_up.equalsIgnoreCase(name)) {
			fxd_cost_up(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri_diff.equalsIgnoreCase(name)) {
			upri_diff(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_upri.equalsIgnoreCase(name)) {
			act_upri(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_up.equalsIgnoreCase(name)) {
			diff_up(value);
			return;
		}
		if ($cost_diff.equalsIgnoreCase(name)) {
			cost_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($var_cost.equalsIgnoreCase(name)) {
			var_cost(value);
			return;
		}
		if ($fxd_cost.equalsIgnoreCase(name)) {
			fxd_cost(value);
			return;
		}
		if ($ttl_qty.equalsIgnoreCase(name)) {
			ttl_qty(value);
			return;
		}
		if ($var_cost_qty.equalsIgnoreCase(name)) {
			var_cost_qty(value);
			return;
		}
		if ($fxd_cost_qty.equalsIgnoreCase(name)) {
			fxd_cost_qty(value);
			return;
		}
		if ($ttl_up.equalsIgnoreCase(name)) {
			ttl_up(value);
			return;
		}
		if ($var_cost_up.equalsIgnoreCase(name)) {
			var_cost_up(value);
			return;
		}
		if ($fxd_cost_up.equalsIgnoreCase(name)) {
			fxd_cost_up(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		if ($col_100.equalsIgnoreCase(name)) {
			col_100(value);
			return;
		}
		if ($col_101.equalsIgnoreCase(name)) {
			col_101(value);
			return;
		}
		if ($col_102.equalsIgnoreCase(name)) {
			col_102(value);
			return;
		}
		if ($col_103.equalsIgnoreCase(name)) {
			col_103(value);
			return;
		}
		if ($col_104.equalsIgnoreCase(name)) {
			col_104(value);
			return;
		}
		if ($col_105.equalsIgnoreCase(name)) {
			col_105(value);
			return;
		}
		if ($col_106.equalsIgnoreCase(name)) {
			col_106(value);
			return;
		}
		if ($col_107.equalsIgnoreCase(name)) {
			col_107(value);
			return;
		}
		if ($col_108.equalsIgnoreCase(name)) {
			col_108(value);
			return;
		}
		if ($col_109.equalsIgnoreCase(name)) {
			col_109(value);
			return;
		}
		if ($col_110.equalsIgnoreCase(name)) {
			col_110(value);
			return;
		}
		if ($col_111.equalsIgnoreCase(name)) {
			col_111(value);
			return;
		}
		if ($col_112.equalsIgnoreCase(name)) {
			col_112(value);
			return;
		}
		if ($col_113.equalsIgnoreCase(name)) {
			col_113(value);
			return;
		}
		if ($col_114.equalsIgnoreCase(name)) {
			col_114(value);
			return;
		}
		if ($col_115.equalsIgnoreCase(name)) {
			col_115(value);
			return;
		}
		if ($col_116.equalsIgnoreCase(name)) {
			col_116(value);
			return;
		}
		if ($col_117.equalsIgnoreCase(name)) {
			col_117(value);
			return;
		}
		if ($col_118.equalsIgnoreCase(name)) {
			col_118(value);
			return;
		}
		if ($col_119.equalsIgnoreCase(name)) {
			col_119(value);
			return;
		}
		if ($col_120.equalsIgnoreCase(name)) {
			col_120(value);
			return;
		}
		if ($col_121.equalsIgnoreCase(name)) {
			col_121(value);
			return;
		}
		if ($col_122.equalsIgnoreCase(name)) {
			col_122(value);
			return;
		}
		if ($col_123.equalsIgnoreCase(name)) {
			col_123(value);
			return;
		}
		if ($col_124.equalsIgnoreCase(name)) {
			col_124(value);
			return;
		}
		if ($col_125.equalsIgnoreCase(name)) {
			col_125(value);
			return;
		}
		if ($col_126.equalsIgnoreCase(name)) {
			col_126(value);
			return;
		}
		if ($col_127.equalsIgnoreCase(name)) {
			col_127(value);
			return;
		}
		if ($col_128.equalsIgnoreCase(name)) {
			col_128(value);
			return;
		}
		if ($col_129.equalsIgnoreCase(name)) {
			col_129(value);
			return;
		}
		if ($col_130.equalsIgnoreCase(name)) {
			col_130(value);
			return;
		}
		if ($col_131.equalsIgnoreCase(name)) {
			col_131(value);
			return;
		}
		if ($col_132.equalsIgnoreCase(name)) {
			col_132(value);
			return;
		}
		if ($col_133.equalsIgnoreCase(name)) {
			col_133(value);
			return;
		}
		if ($col_134.equalsIgnoreCase(name)) {
			col_134(value);
			return;
		}
		if ($col_135.equalsIgnoreCase(name)) {
			col_135(value);
			return;
		}
		if ($col_136.equalsIgnoreCase(name)) {
			col_136(value);
			return;
		}
		if ($col_137.equalsIgnoreCase(name)) {
			col_137(value);
			return;
		}
		if ($col_138.equalsIgnoreCase(name)) {
			col_138(value);
			return;
		}
		if ($col_139.equalsIgnoreCase(name)) {
			col_139(value);
			return;
		}
		if ($col_140.equalsIgnoreCase(name)) {
			col_140(value);
			return;
		}
		if ($col_141.equalsIgnoreCase(name)) {
			col_141(value);
			return;
		}
		if ($col_142.equalsIgnoreCase(name)) {
			col_142(value);
			return;
		}
		if ($col_143.equalsIgnoreCase(name)) {
			col_143(value);
			return;
		}
		if ($col_144.equalsIgnoreCase(name)) {
			col_144(value);
			return;
		}
		if ($col_145.equalsIgnoreCase(name)) {
			col_145(value);
			return;
		}
		if ($col_146.equalsIgnoreCase(name)) {
			col_146(value);
			return;
		}
		if ($col_147.equalsIgnoreCase(name)) {
			col_147(value);
			return;
		}
		if ($col_148.equalsIgnoreCase(name)) {
			col_148(value);
			return;
		}
		if ($col_149.equalsIgnoreCase(name)) {
			col_149(value);
			return;
		}
		if ($col_150.equalsIgnoreCase(name)) {
			col_150(value);
			return;
		}
		if ($col_151.equalsIgnoreCase(name)) {
			col_151(value);
			return;
		}
		if ($col_152.equalsIgnoreCase(name)) {
			col_152(value);
			return;
		}
		if ($col_153.equalsIgnoreCase(name)) {
			col_153(value);
			return;
		}
		if ($col_154.equalsIgnoreCase(name)) {
			col_154(value);
			return;
		}
		if ($col_155.equalsIgnoreCase(name)) {
			col_155(value);
			return;
		}
		if ($col_156.equalsIgnoreCase(name)) {
			col_156(value);
			return;
		}
		if ($col_157.equalsIgnoreCase(name)) {
			col_157(value);
			return;
		}
		if ($col_158.equalsIgnoreCase(name)) {
			col_158(value);
			return;
		}
		if ($col_159.equalsIgnoreCase(name)) {
			col_159(value);
			return;
		}
		if ($col_160.equalsIgnoreCase(name)) {
			col_160(value);
			return;
		}
		if ($col_161.equalsIgnoreCase(name)) {
			col_161(value);
			return;
		}
		if ($col_162.equalsIgnoreCase(name)) {
			col_162(value);
			return;
		}
		if ($col_163.equalsIgnoreCase(name)) {
			col_163(value);
			return;
		}
		if ($col_164.equalsIgnoreCase(name)) {
			col_164(value);
			return;
		}
		if ($col_165.equalsIgnoreCase(name)) {
			col_165(value);
			return;
		}
		if ($col_166.equalsIgnoreCase(name)) {
			col_166(value);
			return;
		}
		if ($col_167.equalsIgnoreCase(name)) {
			col_167(value);
			return;
		}
		if ($col_168.equalsIgnoreCase(name)) {
			col_168(value);
			return;
		}
		if ($col_169.equalsIgnoreCase(name)) {
			col_169(value);
			return;
		}
		if ($col_170.equalsIgnoreCase(name)) {
			col_170(value);
			return;
		}
		if ($col_171.equalsIgnoreCase(name)) {
			col_171(value);
			return;
		}
		if ($col_172.equalsIgnoreCase(name)) {
			col_172(value);
			return;
		}
		if ($col_173.equalsIgnoreCase(name)) {
			col_173(value);
			return;
		}
		if ($col_174.equalsIgnoreCase(name)) {
			col_174(value);
			return;
		}
		if ($col_175.equalsIgnoreCase(name)) {
			col_175(value);
			return;
		}
		if ($col_176.equalsIgnoreCase(name)) {
			col_176(value);
			return;
		}
		if ($col_177.equalsIgnoreCase(name)) {
			col_177(value);
			return;
		}
		if ($col_178.equalsIgnoreCase(name)) {
			col_178(value);
			return;
		}
		if ($col_179.equalsIgnoreCase(name)) {
			col_179(value);
			return;
		}
		if ($col_180.equalsIgnoreCase(name)) {
			col_180(value);
			return;
		}
		if ($col_181.equalsIgnoreCase(name)) {
			col_181(value);
			return;
		}
		if ($col_182.equalsIgnoreCase(name)) {
			col_182(value);
			return;
		}
		if ($col_183.equalsIgnoreCase(name)) {
			col_183(value);
			return;
		}
		if ($col_184.equalsIgnoreCase(name)) {
			col_184(value);
			return;
		}
		if ($col_185.equalsIgnoreCase(name)) {
			col_185(value);
			return;
		}
		if ($col_186.equalsIgnoreCase(name)) {
			col_186(value);
			return;
		}
		if ($col_187.equalsIgnoreCase(name)) {
			col_187(value);
			return;
		}
		if ($col_188.equalsIgnoreCase(name)) {
			col_188(value);
			return;
		}
		if ($col_189.equalsIgnoreCase(name)) {
			col_189(value);
			return;
		}
		if ($col_190.equalsIgnoreCase(name)) {
			col_190(value);
			return;
		}
		if ($col_191.equalsIgnoreCase(name)) {
			col_191(value);
			return;
		}
		if ($col_192.equalsIgnoreCase(name)) {
			col_192(value);
			return;
		}
		if ($col_193.equalsIgnoreCase(name)) {
			col_193(value);
			return;
		}
		if ($col_194.equalsIgnoreCase(name)) {
			col_194(value);
			return;
		}
		if ($col_195.equalsIgnoreCase(name)) {
			col_195(value);
			return;
		}
		if ($col_196.equalsIgnoreCase(name)) {
			col_196(value);
			return;
		}
		if ($col_197.equalsIgnoreCase(name)) {
			col_197(value);
			return;
		}
		if ($col_198.equalsIgnoreCase(name)) {
			col_198(value);
			return;
		}
		if ($col_199.equalsIgnoreCase(name)) {
			col_199(value);
			return;
		}
		if ($col_200.equalsIgnoreCase(name)) {
			col_200(value);
			return;
		}
		if ($col_201.equalsIgnoreCase(name)) {
			col_201(value);
			return;
		}
		if ($col_202.equalsIgnoreCase(name)) {
			col_202(value);
			return;
		}
		if ($col_203.equalsIgnoreCase(name)) {
			col_203(value);
			return;
		}
		if ($col_204.equalsIgnoreCase(name)) {
			col_204(value);
			return;
		}
		if ($col_205.equalsIgnoreCase(name)) {
			col_205(value);
			return;
		}
		if ($col_206.equalsIgnoreCase(name)) {
			col_206(value);
			return;
		}
		if ($col_207.equalsIgnoreCase(name)) {
			col_207(value);
			return;
		}
		if ($col_208.equalsIgnoreCase(name)) {
			col_208(value);
			return;
		}
		if ($col_209.equalsIgnoreCase(name)) {
			col_209(value);
			return;
		}
		if ($col_210.equalsIgnoreCase(name)) {
			col_210(value);
			return;
		}
		if ($col_211.equalsIgnoreCase(name)) {
			col_211(value);
			return;
		}
		if ($col_212.equalsIgnoreCase(name)) {
			col_212(value);
			return;
		}
		if ($col_213.equalsIgnoreCase(name)) {
			col_213(value);
			return;
		}
		if ($col_214.equalsIgnoreCase(name)) {
			col_214(value);
			return;
		}
		if ($col_215.equalsIgnoreCase(name)) {
			col_215(value);
			return;
		}
		if ($col_216.equalsIgnoreCase(name)) {
			col_216(value);
			return;
		}
		if ($col_217.equalsIgnoreCase(name)) {
			col_217(value);
			return;
		}
		if ($col_218.equalsIgnoreCase(name)) {
			col_218(value);
			return;
		}
		if ($col_219.equalsIgnoreCase(name)) {
			col_219(value);
			return;
		}
		if ($col_220.equalsIgnoreCase(name)) {
			col_220(value);
			return;
		}
		if ($col_221.equalsIgnoreCase(name)) {
			col_221(value);
			return;
		}
		if ($col_222.equalsIgnoreCase(name)) {
			col_222(value);
			return;
		}
		if ($col_223.equalsIgnoreCase(name)) {
			col_223(value);
			return;
		}
		if ($col_224.equalsIgnoreCase(name)) {
			col_224(value);
			return;
		}
		if ($col_225.equalsIgnoreCase(name)) {
			col_225(value);
			return;
		}
		if ($col_226.equalsIgnoreCase(name)) {
			col_226(value);
			return;
		}
		if ($col_227.equalsIgnoreCase(name)) {
			col_227(value);
			return;
		}
		if ($col_228.equalsIgnoreCase(name)) {
			col_228(value);
			return;
		}
		if ($col_229.equalsIgnoreCase(name)) {
			col_229(value);
			return;
		}
		if ($col_230.equalsIgnoreCase(name)) {
			col_230(value);
			return;
		}
		if ($col_231.equalsIgnoreCase(name)) {
			col_231(value);
			return;
		}
		if ($col_232.equalsIgnoreCase(name)) {
			col_232(value);
			return;
		}
		if ($col_233.equalsIgnoreCase(name)) {
			col_233(value);
			return;
		}
		if ($col_234.equalsIgnoreCase(name)) {
			col_234(value);
			return;
		}
		if ($col_235.equalsIgnoreCase(name)) {
			col_235(value);
			return;
		}
		if ($col_236.equalsIgnoreCase(name)) {
			col_236(value);
			return;
		}
		if ($col_237.equalsIgnoreCase(name)) {
			col_237(value);
			return;
		}
		if ($col_238.equalsIgnoreCase(name)) {
			col_238(value);
			return;
		}
		if ($col_239.equalsIgnoreCase(name)) {
			col_239(value);
			return;
		}
		if ($col_240.equalsIgnoreCase(name)) {
			col_240(value);
			return;
		}
		if ($col_241.equalsIgnoreCase(name)) {
			col_241(value);
			return;
		}
		if ($col_242.equalsIgnoreCase(name)) {
			col_242(value);
			return;
		}
		if ($col_243.equalsIgnoreCase(name)) {
			col_243(value);
			return;
		}
		if ($col_244.equalsIgnoreCase(name)) {
			col_244(value);
			return;
		}
		if ($col_245.equalsIgnoreCase(name)) {
			col_245(value);
			return;
		}
		if ($col_246.equalsIgnoreCase(name)) {
			col_246(value);
			return;
		}
		if ($col_247.equalsIgnoreCase(name)) {
			col_247(value);
			return;
		}
		if ($col_248.equalsIgnoreCase(name)) {
			col_248(value);
			return;
		}
		if ($col_249.equalsIgnoreCase(name)) {
			col_249(value);
			return;
		}
		if ($col_250.equalsIgnoreCase(name)) {
			col_250(value);
			return;
		}
		if ($col_251.equalsIgnoreCase(name)) {
			col_251(value);
			return;
		}
		if ($col_252.equalsIgnoreCase(name)) {
			col_252(value);
			return;
		}
		if ($col_253.equalsIgnoreCase(name)) {
			col_253(value);
			return;
		}
		if ($col_254.equalsIgnoreCase(name)) {
			col_254(value);
			return;
		}
		if ($col_255.equalsIgnoreCase(name)) {
			col_255(value);
			return;
		}
		if ($col_256.equalsIgnoreCase(name)) {
			col_256(value);
			return;
		}
		if ($col_257.equalsIgnoreCase(name)) {
			col_257(value);
			return;
		}
		if ($col_258.equalsIgnoreCase(name)) {
			col_258(value);
			return;
		}
		if ($col_259.equalsIgnoreCase(name)) {
			col_259(value);
			return;
		}
		if ($col_260.equalsIgnoreCase(name)) {
			col_260(value);
			return;
		}
		if ($col_261.equalsIgnoreCase(name)) {
			col_261(value);
			return;
		}
		if ($col_262.equalsIgnoreCase(name)) {
			col_262(value);
			return;
		}
		if ($col_263.equalsIgnoreCase(name)) {
			col_263(value);
			return;
		}
		if ($col_264.equalsIgnoreCase(name)) {
			col_264(value);
			return;
		}
		if ($col_265.equalsIgnoreCase(name)) {
			col_265(value);
			return;
		}
		if ($col_266.equalsIgnoreCase(name)) {
			col_266(value);
			return;
		}
		if ($col_267.equalsIgnoreCase(name)) {
			col_267(value);
			return;
		}
		if ($col_268.equalsIgnoreCase(name)) {
			col_268(value);
			return;
		}
		if ($col_269.equalsIgnoreCase(name)) {
			col_269(value);
			return;
		}
		if ($col_270.equalsIgnoreCase(name)) {
			col_270(value);
			return;
		}
		if ($col_271.equalsIgnoreCase(name)) {
			col_271(value);
			return;
		}
		if ($col_272.equalsIgnoreCase(name)) {
			col_272(value);
			return;
		}
		if ($col_273.equalsIgnoreCase(name)) {
			col_273(value);
			return;
		}
		if ($col_274.equalsIgnoreCase(name)) {
			col_274(value);
			return;
		}
		if ($col_275.equalsIgnoreCase(name)) {
			col_275(value);
			return;
		}
		if ($col_276.equalsIgnoreCase(name)) {
			col_276(value);
			return;
		}
		if ($col_277.equalsIgnoreCase(name)) {
			col_277(value);
			return;
		}
		if ($col_278.equalsIgnoreCase(name)) {
			col_278(value);
			return;
		}
		if ($col_279.equalsIgnoreCase(name)) {
			col_279(value);
			return;
		}
		if ($col_280.equalsIgnoreCase(name)) {
			col_280(value);
			return;
		}
		if ($col_281.equalsIgnoreCase(name)) {
			col_281(value);
			return;
		}
		if ($col_282.equalsIgnoreCase(name)) {
			col_282(value);
			return;
		}
		if ($col_283.equalsIgnoreCase(name)) {
			col_283(value);
			return;
		}
		if ($col_284.equalsIgnoreCase(name)) {
			col_284(value);
			return;
		}
		if ($col_285.equalsIgnoreCase(name)) {
			col_285(value);
			return;
		}
		if ($col_286.equalsIgnoreCase(name)) {
			col_286(value);
			return;
		}
		if ($col_287.equalsIgnoreCase(name)) {
			col_287(value);
			return;
		}
		if ($col_288.equalsIgnoreCase(name)) {
			col_288(value);
			return;
		}
		if ($col_289.equalsIgnoreCase(name)) {
			col_289(value);
			return;
		}
		if ($col_290.equalsIgnoreCase(name)) {
			col_290(value);
			return;
		}
		if ($col_291.equalsIgnoreCase(name)) {
			col_291(value);
			return;
		}
		if ($col_292.equalsIgnoreCase(name)) {
			col_292(value);
			return;
		}
		if ($col_293.equalsIgnoreCase(name)) {
			col_293(value);
			return;
		}
		if ($col_294.equalsIgnoreCase(name)) {
			col_294(value);
			return;
		}
		if ($col_295.equalsIgnoreCase(name)) {
			col_295(value);
			return;
		}
		if ($col_296.equalsIgnoreCase(name)) {
			col_296(value);
			return;
		}
		if ($col_297.equalsIgnoreCase(name)) {
			col_297(value);
			return;
		}
		if ($col_298.equalsIgnoreCase(name)) {
			col_298(value);
			return;
		}
		if ($col_299.equalsIgnoreCase(name)) {
			col_299(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		if ($comp_qty_p.equalsIgnoreCase(name)) {
			return comp_qty_p();
		}
		if ($odr_qty_p.equalsIgnoreCase(name)) {
			return odr_qty_p();
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			return chd_itm_p();
		}
		if ($qty_diff_p.equalsIgnoreCase(name)) {
			return qty_diff_p();
		}
		if ($std_qty_p.equalsIgnoreCase(name)) {
			return std_qty_p();
		}
		if ($act_qty_p.equalsIgnoreCase(name)) {
			return act_qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($comp_qty_p.equalsIgnoreCase(name)) {
			comp_qty_p(
				((MCContainerMeta) comp_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($odr_qty_p.equalsIgnoreCase(name)) {
			odr_qty_p(
				((MCContainerMeta) odr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			chd_itm_p(
				((MCContainerMeta) chd_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($qty_diff_p.equalsIgnoreCase(name)) {
			qty_diff_p(
				((MCContainerMeta) qty_diff_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($std_qty_p.equalsIgnoreCase(name)) {
			std_qty_p(
				((MCContainerMeta) std_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($act_qty_p.equalsIgnoreCase(name)) {
			act_qty_p(
				((MCContainerMeta) act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return par_itm_p().itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		par_itm_p().itm_cd(value);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return par_itm_p().itm_sub1();
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		par_itm_p().itm_sub1(value);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return par_itm_p().itm_sub2();
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		par_itm_p().itm_sub2(value);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return par_itm_p().itm_sub3();
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		par_itm_p().itm_sub3(value);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return par_itm_p().itm_nm();
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		par_itm_p().itm_nm(value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public MCNumber comp_qty() {
		return comp_qty_p().qty();
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void comp_qty(MCNumber value) {
		comp_qty_p().qty(value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void comp_qty(int value) {
		comp_qty_p().qty(value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void comp_qty(long value) {
		comp_qty_p().qty(value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void comp_qty(float value) {
		comp_qty_p().qty(value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void comp_qty(double value) {
		comp_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public MCNumber odr_qty() {
		return odr_qty_p().qty();
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(MCNumber value) {
		odr_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(int value) {
		odr_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(long value) {
		odr_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(float value) {
		odr_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(double value) {
		odr_qty_p().qty(value);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return chd_itm_p().itm_cd();
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		chd_itm_p().itm_cd(value);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return chd_itm_p().itm_sub1();
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		chd_itm_p().itm_sub1(value);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return chd_itm_p().itm_sub2();
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		chd_itm_p().itm_sub2(value);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return chd_itm_p().itm_sub3();
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		chd_itm_p().itm_sub3(value);
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return chd_itm_p().itm_nm();
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		chd_itm_p().itm_nm(value);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public MCNumber qty_diff() {
		return qty_diff_p().qty();
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void qty_diff(MCNumber value) {
		qty_diff_p().qty(value);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void qty_diff(int value) {
		qty_diff_p().qty(value);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void qty_diff(long value) {
		qty_diff_p().qty(value);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void qty_diff(float value) {
		qty_diff_p().qty(value);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void qty_diff(double value) {
		qty_diff_p().qty(value);
	}

	/**
	 * Standard qty. 標準数量.<p>
	 *
	 */
	public MCNumber std_qty() {
		return std_qty_p().qty();
	}

	/**
	 * Standard qty. 標準数量.<p>
	 *
	 */
	public void std_qty(MCNumber value) {
		std_qty_p().qty(value);
	}

	/**
	 * Standard qty. 標準数量.<p>
	 *
	 */
	public void std_qty(int value) {
		std_qty_p().qty(value);
	}

	/**
	 * Standard qty. 標準数量.<p>
	 *
	 */
	public void std_qty(long value) {
		std_qty_p().qty(value);
	}

	/**
	 * Standard qty. 標準数量.<p>
	 *
	 */
	public void std_qty(float value) {
		std_qty_p().qty(value);
	}

	/**
	 * Standard qty. 標準数量.<p>
	 *
	 */
	public void std_qty(double value) {
		std_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber act_qty() {
		return act_qty_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void act_qty(MCNumber value) {
		act_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void act_qty(int value) {
		act_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void act_qty(long value) {
		act_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void act_qty(float value) {
		act_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void act_qty(double value) {
		act_qty_p().qty(value);
	}

}

