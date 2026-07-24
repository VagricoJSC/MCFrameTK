package mcframe.serverMGBF.MGBFL0090;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_term = "dummy_term";
	/**
	 * Calculation G 計算Ｇ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
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
	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_cd = "par_itm_cd";
	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public static final String $par_itm_sub1 = "par_itm_sub1";
	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public static final String $par_itm_sub2 = "par_itm_sub2";
	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public static final String $par_itm_sub3 = "par_itm_sub3";
	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public static final String $par_itm_nm = "par_itm_nm";
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
	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public static final String $comp_qty = "comp_qty";
	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public static final String $odr_qty = "odr_qty";
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
	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public static final String $chd_itm_cd = "chd_itm_cd";
	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public static final String $chd_itm_sub1 = "chd_itm_sub1";
	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public static final String $chd_itm_sub2 = "chd_itm_sub2";
	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public static final String $chd_itm_sub3 = "chd_itm_sub3";
	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public static final String $chd_itm_nm = "chd_itm_nm";
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
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
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
	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public static final String $rec_eval_typ = "rec_eval_typ";
	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public static final String $rec_eval_typ_nm = "rec_eval_typ_nm";
	/**
	 * Basic unit per unit difference 原単位単価差.<p>
	 *
	 */
	public static final String $base_ttl_diff = "base_ttl_diff";
	/**
	 * Standard unit cost unit price 標準原単位単価.<p>
	 *
	 */
	public static final String $std_base_ttl = "std_base_ttl";
	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public static final String $base_ttl = "base_ttl";
	/**
	 * Basic unit per unit (Order) 原単位単価（指図）.<p>
	 *
	 */
	public static final String $odr_base_ttl = "odr_base_ttl";
	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public static final String $base_qty = "base_qty";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $qty = "qty";
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
	 * Unit price variance 単価差異.<p>
	 *
	 */
	public static final String $upri_diff = "upri_diff";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $std_upri = "std_upri";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $act_upri = "act_upri";
	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public static final String $so_act_amt = "so_act_amt";
	/**
	 * Supply difference gain 交付差益.<p>
	 *
	 */
	public static final String $margin = "margin";
	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public static final String $amt_diff = "amt_diff";
	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public static final String $std_cost = "std_cost";
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


	public static final MCMeta dummy_term_META = createCommonMeta($dummy_term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta par_itm_nm_META = createCommonMeta($par_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
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
	public static final MCMeta comp_qty_META = createCommonMeta($comp_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta odr_qty_META = createCommonMeta($odr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta par_unit_cd_META = createCommonMeta($par_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta par_unit_nm_META = createCommonMeta($par_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta par_dec_place_META = createCommonMeta($par_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta inpt_dpt_cd_META = createCommonMeta($inpt_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta inpt_dpt_nm_META = createCommonMeta($inpt_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta chd_itm_cd_META = createCommonMeta($chd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta chd_itm_sub1_META = createCommonMeta($chd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta chd_itm_sub2_META = createCommonMeta($chd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta chd_itm_sub3_META = createCommonMeta($chd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta chd_itm_nm_META = createCommonMeta($chd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
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
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_slip_typ_nm_META = createCommonMeta($ac_slip_typ_nm, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP_NM);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta rec_eval_typ_META = createCommonMeta($rec_eval_typ, mcframe.commonMG.meta.MG_META.REC_EVAL_TYP);
	public static final MCMeta rec_eval_typ_nm_META = createCommonMeta($rec_eval_typ_nm, mcframe.commonMG.meta.MG_META.REC_EVAL_TYP_NM);
	public static final MCMeta base_ttl_diff_META = createCommonMeta($base_ttl_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_base_ttl_META = createCommonMeta($std_base_ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_ttl_META = createCommonMeta($base_ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta odr_base_ttl_META = createCommonMeta($odr_base_ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_qty_META = createCommonMeta($base_qty, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_diff_META = createCommonMeta($upri_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_upri_META = createCommonMeta($std_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_upri_META = createCommonMeta($act_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta so_act_amt_META = createCommonMeta($so_act_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta margin_META = createCommonMeta($margin, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt_diff_META = createCommonMeta($amt_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost_META = createCommonMeta($std_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta var_cost_META = createCommonMeta($var_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fxd_cost_META = createCommonMeta($fxd_cost, mcframe.commonMA.meta.MA_META.MONEY);
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

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dummy_term_META,
			calc_grp_cd_META,
			wg_cd_META,
			wg_nm_META,
			ym_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			par_itm_nm_META,
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
			comp_qty_META,
			odr_qty_META,
			par_unit_cd_META,
			par_unit_nm_META,
			par_dec_place_META,
			inpt_dpt_cd_META,
			inpt_dpt_nm_META,
			chd_itm_cd_META,
			chd_itm_sub1_META,
			chd_itm_sub2_META,
			chd_itm_sub3_META,
			chd_itm_nm_META,
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
			stk_bp_cd_META,
			stk_bp_nm_META,
			ac_slip_typ_META,
			ac_slip_typ_nm_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			rec_eval_typ_META,
			rec_eval_typ_nm_META,
			base_ttl_diff_META,
			std_base_ttl_META,
			base_ttl_META,
			odr_base_ttl_META,
			base_qty_META,
			qty_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			upri_diff_META,
			std_upri_META,
			act_upri_META,
			so_act_amt_META,
			margin_META,
			amt_diff_META,
			std_cost_META,
			ttl_META,
			var_cost_META,
			fxd_cost_META,
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
			col_099_META
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
	/** 項目属性情報のグループ[FLG_COL]のキー定数 */
	public static final String $$FLG_COL = "FLG_COL";
	/** 項目属性情報のグループ[COL_SQL]のキー定数 */
	public static final String $$COL_SQL = "COL_SQL";
	/** 項目属性情報のグループ[SUM_SQL]のキー定数 */
	public static final String $$SUM_SQL = "SUM_SQL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$par_itm_typ, "MAC_ITM_TYP"},	// par_itm_typ
				{$par_asst_typ, "MAC_ASST_TYP"},	// par_asst_typ
				{$chd_itm_typ, "MAC_ITM_TYP"},	// chd_itm_typ
				{$chd_asst_typ, "MAC_ASST_TYP"},	// chd_asst_typ
				{$ac_slip_typ, "MAC_AC_SLIP_TYP"},	// ac_slip_typ
				{$rec_eval_typ, "MGC_REC_EVAL_TYP"}	// rec_eval_typ
			}
		)),
		new MCExtMap.Entry($$FLG_COL, new MCExtList(
			new String[][]{
				{$wg_cd, "wg_flg"},	// wg_cd
				{$wg_nm, "wg_flg"},	// wg_nm
				{$ym, "ym_flg"},	// ym
				{$mng_dpt_cd, "mng_dpt_flg"},	// mng_dpt_cd
				{$mng_dpt_nm, "mng_dpt_flg"},	// mng_dpt_nm
				{$par_itm_cd, "par_itm_flg"},	// par_itm_cd
				{$par_itm_sub1, "par_itm_flg"},	// par_itm_sub1
				{$par_itm_sub2, "par_itm_flg"},	// par_itm_sub2
				{$par_itm_sub3, "par_itm_flg"},	// par_itm_sub3
				{$par_itm_nm, "par_itm_flg"},	// par_itm_nm
				{$itm_mfg_inst_no, "itm_mfg_inst_no_flg"},	// itm_mfg_inst_no
				{$mfg_act_no, "mfg_act_no_flg"},	// mfg_act_no
				{$par_itm_typ, "par_itm_typ_flg"},	// par_itm_typ
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
				{$par_unit_cd, "comp_qty_flg"},	// par_unit_cd
				{$par_unit_nm, "comp_qty_flg"},	// par_unit_nm
				{$par_dec_place, "comp_qty_flg"},	// par_dec_place
				{$inpt_dpt_cd, "inpt_dpt_flg"},	// inpt_dpt_cd
				{$inpt_dpt_nm, "inpt_dpt_flg"},	// inpt_dpt_nm
				{$chd_itm_cd, "chd_itm_flg"},	// chd_itm_cd
				{$chd_itm_sub1, "chd_itm_flg"},	// chd_itm_sub1
				{$chd_itm_sub2, "chd_itm_flg"},	// chd_itm_sub2
				{$chd_itm_sub3, "chd_itm_flg"},	// chd_itm_sub3
				{$chd_itm_nm, "chd_itm_flg"},	// chd_itm_nm
				{$chd_itm_typ, "chd_itm_typ_flg"},	// chd_itm_typ
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
				{$stk_bp_cd, "stk_bp_flg"},	// stk_bp_cd
				{$stk_bp_nm, "stk_bp_flg"},	// stk_bp_nm
				{$ac_slip_typ, "ac_slip_typ_flg"},	// ac_slip_typ
				{$ac_rsn_cd, "ac_rsn_flg"},	// ac_rsn_cd
				{$ac_rsn_nm, "ac_rsn_flg"},	// ac_rsn_nm
				{$rec_eval_typ, "rec_eval_typ_flg"},	// rec_eval_typ
				{$unit_cd, "qty_flg"},	// unit_cd
				{$unit_nm, "qty_flg"},	// unit_nm
				{$dec_place, "qty_flg"}	// dec_place
			}
		)),
		new MCExtMap.Entry($$COL_SQL, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "T.CALC_GRP_CD"},	// calc_grp_cd
				{$wg_cd, "T1.WG_CD"},	// wg_cd
				{$wg_nm, "WG.WG_NM"},	// wg_nm
				{$ym, "T1.YM"},	// ym
				{$mng_dpt_cd, "T1.MNG_DPT_CD"},	// mng_dpt_cd
				{$mng_dpt_nm, "MNG_DPT.DPT_NM"},	// mng_dpt_nm
				{$par_itm_cd, "T1.ITM_CD"},	// par_itm_cd
				{$par_itm_sub1, "T1.ITM_SUB1"},	// par_itm_sub1
				{$par_itm_sub2, "T1.ITM_SUB2"},	// par_itm_sub2
				{$par_itm_sub3, "T1.ITM_SUB3"},	// par_itm_sub3
				{$par_itm_nm, "NVL(PAR_SUNDRY_ITM.ITM_NM, PAR_ITM.ITM_NM)"},	// par_itm_nm
				{$itm_mfg_inst_no, "T1.ITM_MFG_INST_NO"},	// itm_mfg_inst_no
				{$mfg_act_no, "T1.MFG_ACT_NO"},	// mfg_act_no
				{$par_itm_typ, "PAR_ITM.ITM_TYP"},	// par_itm_typ
				{$par_itm_typ_d_cd, "PAR_ITM.ITM_TYP_D_CD"},	// par_itm_typ_d_cd
				{$par_itm_typ_d_nm, "PAR_ITM_TYP_D.ITM_TYP_D_NM"},	// par_itm_typ_d_nm
				{$par_itm_jnl_cd, "PAR_ITM.ITM_JNL_CD"},	// par_itm_jnl_cd
				{$par_itm_jnl_nm, "PAR_ITM_JNL.ITM_JNL_NM"},	// par_itm_jnl_nm
				{$par_itm_grp_cd1, "PAR_ITM.ITM_GRP_CD1"},	// par_itm_grp_cd1
				{$par_itm_grp_nm1, "PAR_ITM_GRP1.ITM_GRP_NM"},	// par_itm_grp_nm1
				{$par_itm_grp_cd2, "PAR_ITM.ITM_GRP_CD2"},	// par_itm_grp_cd2
				{$par_itm_grp_nm2, "PAR_ITM_GRP2.ITM_GRP_NM"},	// par_itm_grp_nm2
				{$par_itm_grp_cd3, "PAR_ITM.ITM_GRP_CD3"},	// par_itm_grp_cd3
				{$par_itm_grp_nm3, "PAR_ITM_GRP3.ITM_GRP_NM"},	// par_itm_grp_nm3
				{$par_itm_grp_cd4, "PAR_ITM.ITM_GRP_CD4"},	// par_itm_grp_cd4
				{$par_itm_grp_nm4, "PAR_ITM_GRP4.ITM_GRP_NM"},	// par_itm_grp_nm4
				{$par_itm_grp_cd5, "PAR_ITM.ITM_GRP_CD5"},	// par_itm_grp_cd5
				{$par_itm_grp_nm5, "PAR_ITM_GRP5.ITM_GRP_NM"},	// par_itm_grp_nm5
				{$par_itm_grp_cd6, "PAR_ITM.ITM_GRP_CD6"},	// par_itm_grp_cd6
				{$par_itm_grp_nm6, "PAR_ITM_GRP6.ITM_GRP_NM"},	// par_itm_grp_nm6
				{$par_itm_grp_cd7, "PAR_ITM.ITM_GRP_CD7"},	// par_itm_grp_cd7
				{$par_itm_grp_nm7, "PAR_ITM_GRP7.ITM_GRP_NM"},	// par_itm_grp_nm7
				{$par_itm_grp_cd8, "PAR_ITM.ITM_GRP_CD8"},	// par_itm_grp_cd8
				{$par_itm_grp_nm8, "PAR_ITM_GRP8.ITM_GRP_NM"},	// par_itm_grp_nm8
				{$par_itm_grp_cd9, "PAR_ITM.ITM_GRP_CD9"},	// par_itm_grp_cd9
				{$par_itm_grp_nm9, "PAR_ITM_GRP9.ITM_GRP_NM"},	// par_itm_grp_nm9
				{$par_itm_grp_cd10, "PAR_ITM.ITM_GRP_CD10"},	// par_itm_grp_cd10
				{$par_itm_grp_nm10, "PAR_ITM_GRP10.ITM_GRP_NM"},	// par_itm_grp_nm10
				{$par_lot_no, "T1.LOT_NO"},	// par_lot_no
				{$par_sublot_no, "T1.SUBLOT_NO"},	// par_sublot_no
				{$par_sno1, "T1.SNO1"},	// par_sno1
				{$par_sno2, "T1.SNO2"},	// par_sno2
				{$par_sno3, "T1.SNO3"},	// par_sno3
				{$par_sno4, "T1.SNO4"},	// par_sno4
				{$par_asst_typ, "T1.ASST_TYP"},	// par_asst_typ
				{$bp_cd, "T1.BP_CD"},	// bp_cd
				{$bp_nm, "BP.BP_NM"},	// bp_nm
				{$bp_grp_cd1, "BP.BP_GRP_CD1"},	// bp_grp_cd1
				{$bp_grp_nm1, "BP_GRP1.BP_GRP_NM"},	// bp_grp_nm1
				{$bp_grp_cd2, "BP.BP_GRP_CD2"},	// bp_grp_cd2
				{$bp_grp_nm2, "BP_GRP2.BP_GRP_NM"},	// bp_grp_nm2
				{$bp_grp_cd3, "BP.BP_GRP_CD3"},	// bp_grp_cd3
				{$bp_grp_nm3, "BP_GRP3.BP_GRP_NM"},	// bp_grp_nm3
				{$bp_grp_cd4, "BP.BP_GRP_CD4"},	// bp_grp_cd4
				{$bp_grp_nm4, "BP_GRP4.BP_GRP_NM"},	// bp_grp_nm4
				{$bp_grp_cd5, "BP.BP_GRP_CD5"},	// bp_grp_cd5
				{$bp_grp_nm5, "BP_GRP5.BP_GRP_NM"},	// bp_grp_nm5
				{$bp_grp_cd6, "BP.BP_GRP_CD6"},	// bp_grp_cd6
				{$bp_grp_nm6, "BP_GRP6.BP_GRP_NM"},	// bp_grp_nm6
				{$bp_grp_cd7, "BP.BP_GRP_CD7"},	// bp_grp_cd7
				{$bp_grp_nm7, "BP_GRP7.BP_GRP_NM"},	// bp_grp_nm7
				{$bp_grp_cd8, "BP.BP_GRP_CD8"},	// bp_grp_cd8
				{$bp_grp_nm8, "BP_GRP8.BP_GRP_NM"},	// bp_grp_nm8
				{$bp_grp_cd9, "BP.BP_GRP_CD9"},	// bp_grp_cd9
				{$bp_grp_nm9, "BP_GRP9.BP_GRP_NM"},	// bp_grp_nm9
				{$bp_grp_cd10, "BP.BP_GRP_CD10"},	// bp_grp_cd10
				{$bp_grp_nm10, "BP_GRP10.BP_GRP_NM"},	// bp_grp_nm10
				{$cntry_cd, "BP.CNTRY_CD"},	// cntry_cd
				{$cntry_nm, "CNTRY.CNTRY_NM"},	// cntry_nm
				{$area_cd, "BP.AREA_CD"},	// area_cd
				{$area_nm, "AREA.AREA_NM"},	// area_nm
				{$po_no, "T1.PO_NO"},	// po_no
				{$slo_no, "T1.SLO_NO"},	// slo_no
				{$iv_no, "T1.IV_NO"},	// iv_no
				{$par_unit_cd, "PAR_ITM.UNIT_CD"},	// par_unit_cd
				{$par_unit_nm, "PAR_UNIT.UNIT_NM"},	// par_unit_nm
				{$inpt_dpt_cd, "T2.MNG_DPT_CD"},	// inpt_dpt_cd
				{$inpt_dpt_nm, "INPT_DPT.DPT_NM"},	// inpt_dpt_nm
				{$chd_itm_cd, "T2.ITM_CD"},	// chd_itm_cd
				{$chd_itm_sub1, "T2.ITM_SUB1"},	// chd_itm_sub1
				{$chd_itm_sub2, "T2.ITM_SUB2"},	// chd_itm_sub2
				{$chd_itm_sub3, "T2.ITM_SUB3"},	// chd_itm_sub3
				{$chd_itm_nm, "NVL(CHD_SUNDRY_ITM.ITM_NM, CHD_ITM.ITM_NM)"},	// chd_itm_nm
				{$chd_itm_typ, "CHD_ITM.ITM_TYP"},	// chd_itm_typ
				{$chd_itm_typ_d_cd, "CHD_ITM.ITM_TYP_D_CD"},	// chd_itm_typ_d_cd
				{$chd_itm_typ_d_nm, "CHD_ITM_TYP_D.ITM_TYP_D_NM"},	// chd_itm_typ_d_nm
				{$chd_itm_jnl_cd, "CHD_ITM.ITM_JNL_CD"},	// chd_itm_jnl_cd
				{$chd_itm_jnl_nm, "CHD_ITM_JNL.ITM_JNL_NM"},	// chd_itm_jnl_nm
				{$chd_itm_grp_cd1, "CHD_ITM.ITM_GRP_CD1"},	// chd_itm_grp_cd1
				{$chd_itm_grp_nm1, "CHD_ITM_GRP1.ITM_GRP_NM"},	// chd_itm_grp_nm1
				{$chd_itm_grp_cd2, "CHD_ITM.ITM_GRP_CD2"},	// chd_itm_grp_cd2
				{$chd_itm_grp_nm2, "CHD_ITM_GRP2.ITM_GRP_NM"},	// chd_itm_grp_nm2
				{$chd_itm_grp_cd3, "CHD_ITM.ITM_GRP_CD3"},	// chd_itm_grp_cd3
				{$chd_itm_grp_nm3, "CHD_ITM_GRP3.ITM_GRP_NM"},	// chd_itm_grp_nm3
				{$chd_itm_grp_cd4, "CHD_ITM.ITM_GRP_CD4"},	// chd_itm_grp_cd4
				{$chd_itm_grp_nm4, "CHD_ITM_GRP4.ITM_GRP_NM"},	// chd_itm_grp_nm4
				{$chd_itm_grp_cd5, "CHD_ITM.ITM_GRP_CD5"},	// chd_itm_grp_cd5
				{$chd_itm_grp_nm5, "CHD_ITM_GRP5.ITM_GRP_NM"},	// chd_itm_grp_nm5
				{$chd_itm_grp_cd6, "CHD_ITM.ITM_GRP_CD6"},	// chd_itm_grp_cd6
				{$chd_itm_grp_nm6, "CHD_ITM_GRP6.ITM_GRP_NM"},	// chd_itm_grp_nm6
				{$chd_itm_grp_cd7, "CHD_ITM.ITM_GRP_CD7"},	// chd_itm_grp_cd7
				{$chd_itm_grp_nm7, "CHD_ITM_GRP7.ITM_GRP_NM"},	// chd_itm_grp_nm7
				{$chd_itm_grp_cd8, "CHD_ITM.ITM_GRP_CD8"},	// chd_itm_grp_cd8
				{$chd_itm_grp_nm8, "CHD_ITM_GRP8.ITM_GRP_NM"},	// chd_itm_grp_nm8
				{$chd_itm_grp_cd9, "CHD_ITM.ITM_GRP_CD9"},	// chd_itm_grp_cd9
				{$chd_itm_grp_nm9, "CHD_ITM_GRP9.ITM_GRP_NM"},	// chd_itm_grp_nm9
				{$chd_itm_grp_cd10, "CHD_ITM.ITM_GRP_CD10"},	// chd_itm_grp_cd10
				{$chd_itm_grp_nm10, "CHD_ITM_GRP10.ITM_GRP_NM"},	// chd_itm_grp_nm10
				{$chd_lot_no, "T2.LOT_NO"},	// chd_lot_no
				{$chd_sublot_no, "T2.SUBLOT_NO"},	// chd_sublot_no
				{$chd_sno1, "T2.SNO1"},	// chd_sno1
				{$chd_sno2, "T2.SNO2"},	// chd_sno2
				{$chd_sno3, "T2.SNO3"},	// chd_sno3
				{$chd_sno4, "T2.SNO4"},	// chd_sno4
				{$chd_asst_typ, "T2.ASST_TYP"},	// chd_asst_typ
				{$repurc_obli_flg, "T.REPURC_OBLI_TYP"},	// repurc_obli_flg
				{$site_cd, "LOC.SITE_CD"},	// site_cd
				{$site_nm, "SITE.SITE_NM"},	// site_nm
				{$loc_cd, "T2.LOC_CD"},	// loc_cd
				{$loc_nm, "LOC.LOC_NM"},	// loc_nm
				{$str_ln_cd, "T2.STR_LN_CD"},	// str_ln_cd
				{$str_ln_nm, "STR_LN.STR_LN_NM"},	// str_ln_nm
				{$oper_act_no, "T2.OPER_ACT_NO"},	// oper_act_no
				{$oper_cd, "T2.OPER_CD"},	// oper_cd
				{$oper_nm, "OPER.OPER_NM"},	// oper_nm
				{$oper_seq, "T2.OPER_SEQ"},	// oper_seq
				{$stk_bp_cd, "T2.STK_BP_CD"},	// stk_bp_cd
				{$stk_bp_nm, "STK_BP.BP_NM"},	// stk_bp_nm
				{$ac_slip_typ, "T2.AC_SLIP_TYP"},	// ac_slip_typ
				{$ac_rsn_cd, "T2.AC_RSN_CD"},	// ac_rsn_cd
				{$ac_rsn_nm, "AC_RSN.AC_RSN_NM"},	// ac_rsn_nm
				{$rec_eval_typ, "T2.REC_EVAL_TYP"},	// rec_eval_typ
				{$unit_cd, "CHD_ITM.UNIT_CD"},	// unit_cd
				{$unit_nm, "CHD_UNIT.UNIT_NM"}	// unit_nm
			}
		)),
		new MCExtMap.Entry($$SUM_SQL, new MCExtList(
			new String[][]{
				{$par_dec_place, "MAX(T.PAR_DEC_PLACE)"},	// par_dec_place
				{$dec_place, "MAX(T.DEC_PLACE)"},	// dec_place
				{$amt_diff, "NVL(SUM(T.STD_COST),0)-NVL(SUM(T.ACT_COST),0)"},	// amt_diff
				{$std_cost, "NVL(SUM(T.STD_COST),0)"},	// std_cost
				{$ttl, "NVL(SUM(T.ACT_COST),0)"},	// ttl
				{$var_cost, "NVL(SUM(DECODE(T.VAR_TYP,MAC_VAR_TYP.VAR,T.ACT_COST,0)),0)"},	// var_cost
				{$fxd_cost, "NVL(SUM(DECODE(T.VAR_TYP,MAC_VAR_TYP.FXD,T.ACT_COST,0)),0)"},	// fxd_cost
				{$col_000, "CUSTOM_SUM_COL"},	// col_000
				{$col_001, "CUSTOM_SUM_COL"},	// col_001
				{$col_002, "CUSTOM_SUM_COL"},	// col_002
				{$col_003, "CUSTOM_SUM_COL"},	// col_003
				{$col_004, "CUSTOM_SUM_COL"},	// col_004
				{$col_005, "CUSTOM_SUM_COL"},	// col_005
				{$col_006, "CUSTOM_SUM_COL"},	// col_006
				{$col_007, "CUSTOM_SUM_COL"},	// col_007
				{$col_008, "CUSTOM_SUM_COL"},	// col_008
				{$col_009, "CUSTOM_SUM_COL"},	// col_009
				{$col_010, "CUSTOM_SUM_COL"},	// col_010
				{$col_011, "CUSTOM_SUM_COL"},	// col_011
				{$col_012, "CUSTOM_SUM_COL"},	// col_012
				{$col_013, "CUSTOM_SUM_COL"},	// col_013
				{$col_014, "CUSTOM_SUM_COL"},	// col_014
				{$col_015, "CUSTOM_SUM_COL"},	// col_015
				{$col_016, "CUSTOM_SUM_COL"},	// col_016
				{$col_017, "CUSTOM_SUM_COL"},	// col_017
				{$col_018, "CUSTOM_SUM_COL"},	// col_018
				{$col_019, "CUSTOM_SUM_COL"},	// col_019
				{$col_020, "CUSTOM_SUM_COL"},	// col_020
				{$col_021, "CUSTOM_SUM_COL"},	// col_021
				{$col_022, "CUSTOM_SUM_COL"},	// col_022
				{$col_023, "CUSTOM_SUM_COL"},	// col_023
				{$col_024, "CUSTOM_SUM_COL"},	// col_024
				{$col_025, "CUSTOM_SUM_COL"},	// col_025
				{$col_026, "CUSTOM_SUM_COL"},	// col_026
				{$col_027, "CUSTOM_SUM_COL"},	// col_027
				{$col_028, "CUSTOM_SUM_COL"},	// col_028
				{$col_029, "CUSTOM_SUM_COL"},	// col_029
				{$col_030, "CUSTOM_SUM_COL"},	// col_030
				{$col_031, "CUSTOM_SUM_COL"},	// col_031
				{$col_032, "CUSTOM_SUM_COL"},	// col_032
				{$col_033, "CUSTOM_SUM_COL"},	// col_033
				{$col_034, "CUSTOM_SUM_COL"},	// col_034
				{$col_035, "CUSTOM_SUM_COL"},	// col_035
				{$col_036, "CUSTOM_SUM_COL"},	// col_036
				{$col_037, "CUSTOM_SUM_COL"},	// col_037
				{$col_038, "CUSTOM_SUM_COL"},	// col_038
				{$col_039, "CUSTOM_SUM_COL"},	// col_039
				{$col_040, "CUSTOM_SUM_COL"},	// col_040
				{$col_041, "CUSTOM_SUM_COL"},	// col_041
				{$col_042, "CUSTOM_SUM_COL"},	// col_042
				{$col_043, "CUSTOM_SUM_COL"},	// col_043
				{$col_044, "CUSTOM_SUM_COL"},	// col_044
				{$col_045, "CUSTOM_SUM_COL"},	// col_045
				{$col_046, "CUSTOM_SUM_COL"},	// col_046
				{$col_047, "CUSTOM_SUM_COL"},	// col_047
				{$col_048, "CUSTOM_SUM_COL"},	// col_048
				{$col_049, "CUSTOM_SUM_COL"},	// col_049
				{$col_050, "CUSTOM_SUM_COL"},	// col_050
				{$col_051, "CUSTOM_SUM_COL"},	// col_051
				{$col_052, "CUSTOM_SUM_COL"},	// col_052
				{$col_053, "CUSTOM_SUM_COL"},	// col_053
				{$col_054, "CUSTOM_SUM_COL"},	// col_054
				{$col_055, "CUSTOM_SUM_COL"},	// col_055
				{$col_056, "CUSTOM_SUM_COL"},	// col_056
				{$col_057, "CUSTOM_SUM_COL"},	// col_057
				{$col_058, "CUSTOM_SUM_COL"},	// col_058
				{$col_059, "CUSTOM_SUM_COL"},	// col_059
				{$col_060, "CUSTOM_SUM_COL"},	// col_060
				{$col_061, "CUSTOM_SUM_COL"},	// col_061
				{$col_062, "CUSTOM_SUM_COL"},	// col_062
				{$col_063, "CUSTOM_SUM_COL"},	// col_063
				{$col_064, "CUSTOM_SUM_COL"},	// col_064
				{$col_065, "CUSTOM_SUM_COL"},	// col_065
				{$col_066, "CUSTOM_SUM_COL"},	// col_066
				{$col_067, "CUSTOM_SUM_COL"},	// col_067
				{$col_068, "CUSTOM_SUM_COL"},	// col_068
				{$col_069, "CUSTOM_SUM_COL"},	// col_069
				{$col_070, "CUSTOM_SUM_COL"},	// col_070
				{$col_071, "CUSTOM_SUM_COL"},	// col_071
				{$col_072, "CUSTOM_SUM_COL"},	// col_072
				{$col_073, "CUSTOM_SUM_COL"},	// col_073
				{$col_074, "CUSTOM_SUM_COL"},	// col_074
				{$col_075, "CUSTOM_SUM_COL"},	// col_075
				{$col_076, "CUSTOM_SUM_COL"},	// col_076
				{$col_077, "CUSTOM_SUM_COL"},	// col_077
				{$col_078, "CUSTOM_SUM_COL"},	// col_078
				{$col_079, "CUSTOM_SUM_COL"},	// col_079
				{$col_080, "CUSTOM_SUM_COL"},	// col_080
				{$col_081, "CUSTOM_SUM_COL"},	// col_081
				{$col_082, "CUSTOM_SUM_COL"},	// col_082
				{$col_083, "CUSTOM_SUM_COL"},	// col_083
				{$col_084, "CUSTOM_SUM_COL"},	// col_084
				{$col_085, "CUSTOM_SUM_COL"},	// col_085
				{$col_086, "CUSTOM_SUM_COL"},	// col_086
				{$col_087, "CUSTOM_SUM_COL"},	// col_087
				{$col_088, "CUSTOM_SUM_COL"},	// col_088
				{$col_089, "CUSTOM_SUM_COL"},	// col_089
				{$col_090, "CUSTOM_SUM_COL"},	// col_090
				{$col_091, "CUSTOM_SUM_COL"},	// col_091
				{$col_092, "CUSTOM_SUM_COL"},	// col_092
				{$col_093, "CUSTOM_SUM_COL"},	// col_093
				{$col_094, "CUSTOM_SUM_COL"},	// col_094
				{$col_095, "CUSTOM_SUM_COL"},	// col_095
				{$col_096, "CUSTOM_SUM_COL"},	// col_096
				{$col_097, "CUSTOM_SUM_COL"},	// col_097
				{$col_098, "CUSTOM_SUM_COL"},	// col_098
				{$col_099, "CUSTOM_SUM_COL"}	// col_099
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public MCDate dummy_term() {
		return getConstDate(offset + 0, $dummy_term);
	}

	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_term(MCDate value) {
		setConstDate(offset + 0, $dummy_term, value);
	}


	/**
	 * Calculation G 計算Ｇ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * Calculation G 計算Ｇ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 4, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 4, $ym, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 5, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 5, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 6, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 6, $mng_dpt_nm, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 7, $par_itm_cd);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 7, $par_itm_cd, value);
	}


	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 8, $par_itm_sub1);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 8, $par_itm_sub1, value);
	}


	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 9, $par_itm_sub2);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 9, $par_itm_sub2, value);
	}


	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 10, $par_itm_sub3);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 10, $par_itm_sub3, value);
	}


	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return getConstString(offset + 11, $par_itm_nm);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		setConstString(offset + 11, $par_itm_nm, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 12, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 12, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 13, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 13, $mfg_act_no, value);
	}


	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return getConstString(offset + 14, $par_itm_typ);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		setConstString(offset + 14, $par_itm_typ, value);
	}


	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public String par_itm_typ_nm() {
		return getConstString(offset + 15, $par_itm_typ_nm);
	}

	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public void par_itm_typ_nm(String value) {
		setConstString(offset + 15, $par_itm_typ_nm, value);
	}


	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return getConstString(offset + 16, $par_itm_typ_d_cd);
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		setConstString(offset + 16, $par_itm_typ_d_cd, value);
	}


	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public String par_itm_typ_d_nm() {
		return getConstString(offset + 17, $par_itm_typ_d_nm);
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public void par_itm_typ_d_nm(String value) {
		setConstString(offset + 17, $par_itm_typ_d_nm, value);
	}


	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public String par_itm_jnl_cd() {
		return getConstString(offset + 18, $par_itm_jnl_cd);
	}

	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public void par_itm_jnl_cd(String value) {
		setConstString(offset + 18, $par_itm_jnl_cd, value);
	}


	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public String par_itm_jnl_nm() {
		return getConstString(offset + 19, $par_itm_jnl_nm);
	}

	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public void par_itm_jnl_nm(String value) {
		setConstString(offset + 19, $par_itm_jnl_nm, value);
	}


	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public String par_itm_grp_cd1() {
		return getConstString(offset + 20, $par_itm_grp_cd1);
	}

	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public void par_itm_grp_cd1(String value) {
		setConstString(offset + 20, $par_itm_grp_cd1, value);
	}


	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public String par_itm_grp_nm1() {
		return getConstString(offset + 21, $par_itm_grp_nm1);
	}

	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public void par_itm_grp_nm1(String value) {
		setConstString(offset + 21, $par_itm_grp_nm1, value);
	}


	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public String par_itm_grp_cd2() {
		return getConstString(offset + 22, $par_itm_grp_cd2);
	}

	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public void par_itm_grp_cd2(String value) {
		setConstString(offset + 22, $par_itm_grp_cd2, value);
	}


	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public String par_itm_grp_nm2() {
		return getConstString(offset + 23, $par_itm_grp_nm2);
	}

	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public void par_itm_grp_nm2(String value) {
		setConstString(offset + 23, $par_itm_grp_nm2, value);
	}


	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public String par_itm_grp_cd3() {
		return getConstString(offset + 24, $par_itm_grp_cd3);
	}

	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public void par_itm_grp_cd3(String value) {
		setConstString(offset + 24, $par_itm_grp_cd3, value);
	}


	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public String par_itm_grp_nm3() {
		return getConstString(offset + 25, $par_itm_grp_nm3);
	}

	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public void par_itm_grp_nm3(String value) {
		setConstString(offset + 25, $par_itm_grp_nm3, value);
	}


	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public String par_itm_grp_cd4() {
		return getConstString(offset + 26, $par_itm_grp_cd4);
	}

	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public void par_itm_grp_cd4(String value) {
		setConstString(offset + 26, $par_itm_grp_cd4, value);
	}


	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public String par_itm_grp_nm4() {
		return getConstString(offset + 27, $par_itm_grp_nm4);
	}

	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public void par_itm_grp_nm4(String value) {
		setConstString(offset + 27, $par_itm_grp_nm4, value);
	}


	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public String par_itm_grp_cd5() {
		return getConstString(offset + 28, $par_itm_grp_cd5);
	}

	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public void par_itm_grp_cd5(String value) {
		setConstString(offset + 28, $par_itm_grp_cd5, value);
	}


	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public String par_itm_grp_nm5() {
		return getConstString(offset + 29, $par_itm_grp_nm5);
	}

	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public void par_itm_grp_nm5(String value) {
		setConstString(offset + 29, $par_itm_grp_nm5, value);
	}


	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public String par_itm_grp_cd6() {
		return getConstString(offset + 30, $par_itm_grp_cd6);
	}

	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public void par_itm_grp_cd6(String value) {
		setConstString(offset + 30, $par_itm_grp_cd6, value);
	}


	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public String par_itm_grp_nm6() {
		return getConstString(offset + 31, $par_itm_grp_nm6);
	}

	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public void par_itm_grp_nm6(String value) {
		setConstString(offset + 31, $par_itm_grp_nm6, value);
	}


	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public String par_itm_grp_cd7() {
		return getConstString(offset + 32, $par_itm_grp_cd7);
	}

	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public void par_itm_grp_cd7(String value) {
		setConstString(offset + 32, $par_itm_grp_cd7, value);
	}


	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public String par_itm_grp_nm7() {
		return getConstString(offset + 33, $par_itm_grp_nm7);
	}

	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public void par_itm_grp_nm7(String value) {
		setConstString(offset + 33, $par_itm_grp_nm7, value);
	}


	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public String par_itm_grp_cd8() {
		return getConstString(offset + 34, $par_itm_grp_cd8);
	}

	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public void par_itm_grp_cd8(String value) {
		setConstString(offset + 34, $par_itm_grp_cd8, value);
	}


	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public String par_itm_grp_nm8() {
		return getConstString(offset + 35, $par_itm_grp_nm8);
	}

	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public void par_itm_grp_nm8(String value) {
		setConstString(offset + 35, $par_itm_grp_nm8, value);
	}


	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public String par_itm_grp_cd9() {
		return getConstString(offset + 36, $par_itm_grp_cd9);
	}

	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public void par_itm_grp_cd9(String value) {
		setConstString(offset + 36, $par_itm_grp_cd9, value);
	}


	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public String par_itm_grp_nm9() {
		return getConstString(offset + 37, $par_itm_grp_nm9);
	}

	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public void par_itm_grp_nm9(String value) {
		setConstString(offset + 37, $par_itm_grp_nm9, value);
	}


	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public String par_itm_grp_cd10() {
		return getConstString(offset + 38, $par_itm_grp_cd10);
	}

	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public void par_itm_grp_cd10(String value) {
		setConstString(offset + 38, $par_itm_grp_cd10, value);
	}


	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public String par_itm_grp_nm10() {
		return getConstString(offset + 39, $par_itm_grp_nm10);
	}

	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public void par_itm_grp_nm10(String value) {
		setConstString(offset + 39, $par_itm_grp_nm10, value);
	}


	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public String par_lot_no() {
		return getConstString(offset + 40, $par_lot_no);
	}

	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public void par_lot_no(String value) {
		setConstString(offset + 40, $par_lot_no, value);
	}


	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public String par_sublot_no() {
		return getConstString(offset + 41, $par_sublot_no);
	}

	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public void par_sublot_no(String value) {
		setConstString(offset + 41, $par_sublot_no, value);
	}


	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public String par_sno1() {
		return getConstString(offset + 42, $par_sno1);
	}

	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public void par_sno1(String value) {
		setConstString(offset + 42, $par_sno1, value);
	}


	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public String par_sno2() {
		return getConstString(offset + 43, $par_sno2);
	}

	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public void par_sno2(String value) {
		setConstString(offset + 43, $par_sno2, value);
	}


	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public String par_sno3() {
		return getConstString(offset + 44, $par_sno3);
	}

	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public void par_sno3(String value) {
		setConstString(offset + 44, $par_sno3, value);
	}


	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public String par_sno4() {
		return getConstString(offset + 45, $par_sno4);
	}

	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public void par_sno4(String value) {
		setConstString(offset + 45, $par_sno4, value);
	}


	/**
	 * Parent asset type 親資産区分.<p>
	 *
	 */
	public String par_asst_typ() {
		return getConstString(offset + 46, $par_asst_typ);
	}

	/**
	 * Parent asset type 親資産区分.<p>
	 *
	 */
	public void par_asst_typ(String value) {
		setConstString(offset + 46, $par_asst_typ, value);
	}


	/**
	 * Parent asset type name 親資産区分名.<p>
	 *
	 */
	public String par_asst_typ_nm() {
		return getConstString(offset + 47, $par_asst_typ_nm);
	}

	/**
	 * Parent asset type name 親資産区分名.<p>
	 *
	 */
	public void par_asst_typ_nm(String value) {
		setConstString(offset + 47, $par_asst_typ_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 48, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 48, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 49, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 49, $bp_nm, value);
	}


	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return getConstString(offset + 50, $bp_grp_cd1);
	}

	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		setConstString(offset + 50, $bp_grp_cd1, value);
	}


	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return getConstString(offset + 51, $bp_grp_nm1);
	}

	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		setConstString(offset + 51, $bp_grp_nm1, value);
	}


	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return getConstString(offset + 52, $bp_grp_cd2);
	}

	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		setConstString(offset + 52, $bp_grp_cd2, value);
	}


	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return getConstString(offset + 53, $bp_grp_nm2);
	}

	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		setConstString(offset + 53, $bp_grp_nm2, value);
	}


	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return getConstString(offset + 54, $bp_grp_cd3);
	}

	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		setConstString(offset + 54, $bp_grp_cd3, value);
	}


	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return getConstString(offset + 55, $bp_grp_nm3);
	}

	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		setConstString(offset + 55, $bp_grp_nm3, value);
	}


	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return getConstString(offset + 56, $bp_grp_cd4);
	}

	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		setConstString(offset + 56, $bp_grp_cd4, value);
	}


	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return getConstString(offset + 57, $bp_grp_nm4);
	}

	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		setConstString(offset + 57, $bp_grp_nm4, value);
	}


	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return getConstString(offset + 58, $bp_grp_cd5);
	}

	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		setConstString(offset + 58, $bp_grp_cd5, value);
	}


	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return getConstString(offset + 59, $bp_grp_nm5);
	}

	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		setConstString(offset + 59, $bp_grp_nm5, value);
	}


	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return getConstString(offset + 60, $bp_grp_cd6);
	}

	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		setConstString(offset + 60, $bp_grp_cd6, value);
	}


	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return getConstString(offset + 61, $bp_grp_nm6);
	}

	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		setConstString(offset + 61, $bp_grp_nm6, value);
	}


	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return getConstString(offset + 62, $bp_grp_cd7);
	}

	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		setConstString(offset + 62, $bp_grp_cd7, value);
	}


	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return getConstString(offset + 63, $bp_grp_nm7);
	}

	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		setConstString(offset + 63, $bp_grp_nm7, value);
	}


	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return getConstString(offset + 64, $bp_grp_cd8);
	}

	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		setConstString(offset + 64, $bp_grp_cd8, value);
	}


	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return getConstString(offset + 65, $bp_grp_nm8);
	}

	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		setConstString(offset + 65, $bp_grp_nm8, value);
	}


	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return getConstString(offset + 66, $bp_grp_cd9);
	}

	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		setConstString(offset + 66, $bp_grp_cd9, value);
	}


	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return getConstString(offset + 67, $bp_grp_nm9);
	}

	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		setConstString(offset + 67, $bp_grp_nm9, value);
	}


	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return getConstString(offset + 68, $bp_grp_cd10);
	}

	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		setConstString(offset + 68, $bp_grp_cd10, value);
	}


	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return getConstString(offset + 69, $bp_grp_nm10);
	}

	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		setConstString(offset + 69, $bp_grp_nm10, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 70, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 70, $cntry_cd, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 71, $cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 71, $cntry_nm, value);
	}


	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 72, $area_cd);
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 72, $area_cd, value);
	}


	/**
	 * Region name 地域名.<p>
	 *
	 */
	public String area_nm() {
		return getConstString(offset + 73, $area_nm);
	}

	/**
	 * Region name 地域名.<p>
	 *
	 */
	public void area_nm(String value) {
		setConstString(offset + 73, $area_nm, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 74, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 74, $po_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 75, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 75, $slo_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 76, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 76, $iv_no, value);
	}


	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public MCNumber comp_qty() {
		return getConstNumber(offset + 77, $comp_qty);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void comp_qty(MCNumber value) {
		setConstNumber(offset + 77, $comp_qty, value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void comp_qty(int value) {
		setConstNumber(offset + 77, $comp_qty, value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void comp_qty(long value) {
		setConstNumber(offset + 77, $comp_qty, value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void comp_qty(float value) {
		setConstNumber(offset + 77, $comp_qty, value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void comp_qty(double value) {
		setConstNumber(offset + 77, $comp_qty, value);
	}


	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public MCNumber odr_qty() {
		return getConstNumber(offset + 78, $odr_qty);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(MCNumber value) {
		setConstNumber(offset + 78, $odr_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(int value) {
		setConstNumber(offset + 78, $odr_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(long value) {
		setConstNumber(offset + 78, $odr_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(float value) {
		setConstNumber(offset + 78, $odr_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty(double value) {
		setConstNumber(offset + 78, $odr_qty, value);
	}


	/**
	 * Parent unit cd. 親単位ＣＤ.<p>
	 *
	 */
	public String par_unit_cd() {
		return getConstString(offset + 79, $par_unit_cd);
	}

	/**
	 * Parent unit cd. 親単位ＣＤ.<p>
	 *
	 */
	public void par_unit_cd(String value) {
		setConstString(offset + 79, $par_unit_cd, value);
	}


	/**
	 * Parent unit name 親単位名.<p>
	 *
	 */
	public String par_unit_nm() {
		return getConstString(offset + 80, $par_unit_nm);
	}

	/**
	 * Parent unit name 親単位名.<p>
	 *
	 */
	public void par_unit_nm(String value) {
		setConstString(offset + 80, $par_unit_nm, value);
	}


	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public MCNumber par_dec_place() {
		return getConstNumber(offset + 81, $par_dec_place);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(MCNumber value) {
		setConstNumber(offset + 81, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(int value) {
		setConstNumber(offset + 81, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(long value) {
		setConstNumber(offset + 81, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(float value) {
		setConstNumber(offset + 81, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(double value) {
		setConstNumber(offset + 81, $par_dec_place, value);
	}


	/**
	 * Input dept. cd. 投入部門ＣＤ.<p>
	 *
	 */
	public String inpt_dpt_cd() {
		return getConstString(offset + 82, $inpt_dpt_cd);
	}

	/**
	 * Input dept. cd. 投入部門ＣＤ.<p>
	 *
	 */
	public void inpt_dpt_cd(String value) {
		setConstString(offset + 82, $inpt_dpt_cd, value);
	}


	/**
	 * Input dept. name 投入部門名.<p>
	 *
	 */
	public String inpt_dpt_nm() {
		return getConstString(offset + 83, $inpt_dpt_nm);
	}

	/**
	 * Input dept. name 投入部門名.<p>
	 *
	 */
	public void inpt_dpt_nm(String value) {
		setConstString(offset + 83, $inpt_dpt_nm, value);
	}


	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return getConstString(offset + 84, $chd_itm_cd);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		setConstString(offset + 84, $chd_itm_cd, value);
	}


	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return getConstString(offset + 85, $chd_itm_sub1);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		setConstString(offset + 85, $chd_itm_sub1, value);
	}


	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return getConstString(offset + 86, $chd_itm_sub2);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		setConstString(offset + 86, $chd_itm_sub2, value);
	}


	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return getConstString(offset + 87, $chd_itm_sub3);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		setConstString(offset + 87, $chd_itm_sub3, value);
	}


	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return getConstString(offset + 88, $chd_itm_nm);
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		setConstString(offset + 88, $chd_itm_nm, value);
	}


	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return getConstString(offset + 89, $chd_itm_typ);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		setConstString(offset + 89, $chd_itm_typ, value);
	}


	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public String chd_itm_typ_nm() {
		return getConstString(offset + 90, $chd_itm_typ_nm);
	}

	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public void chd_itm_typ_nm(String value) {
		setConstString(offset + 90, $chd_itm_typ_nm, value);
	}


	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return getConstString(offset + 91, $chd_itm_typ_d_cd);
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		setConstString(offset + 91, $chd_itm_typ_d_cd, value);
	}


	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public String chd_itm_typ_d_nm() {
		return getConstString(offset + 92, $chd_itm_typ_d_nm);
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public void chd_itm_typ_d_nm(String value) {
		setConstString(offset + 92, $chd_itm_typ_d_nm, value);
	}


	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public String chd_itm_jnl_cd() {
		return getConstString(offset + 93, $chd_itm_jnl_cd);
	}

	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public void chd_itm_jnl_cd(String value) {
		setConstString(offset + 93, $chd_itm_jnl_cd, value);
	}


	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public String chd_itm_jnl_nm() {
		return getConstString(offset + 94, $chd_itm_jnl_nm);
	}

	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public void chd_itm_jnl_nm(String value) {
		setConstString(offset + 94, $chd_itm_jnl_nm, value);
	}


	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public String chd_itm_grp_cd1() {
		return getConstString(offset + 95, $chd_itm_grp_cd1);
	}

	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public void chd_itm_grp_cd1(String value) {
		setConstString(offset + 95, $chd_itm_grp_cd1, value);
	}


	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public String chd_itm_grp_nm1() {
		return getConstString(offset + 96, $chd_itm_grp_nm1);
	}

	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public void chd_itm_grp_nm1(String value) {
		setConstString(offset + 96, $chd_itm_grp_nm1, value);
	}


	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public String chd_itm_grp_cd2() {
		return getConstString(offset + 97, $chd_itm_grp_cd2);
	}

	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public void chd_itm_grp_cd2(String value) {
		setConstString(offset + 97, $chd_itm_grp_cd2, value);
	}


	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public String chd_itm_grp_nm2() {
		return getConstString(offset + 98, $chd_itm_grp_nm2);
	}

	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public void chd_itm_grp_nm2(String value) {
		setConstString(offset + 98, $chd_itm_grp_nm2, value);
	}


	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public String chd_itm_grp_cd3() {
		return getConstString(offset + 99, $chd_itm_grp_cd3);
	}

	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public void chd_itm_grp_cd3(String value) {
		setConstString(offset + 99, $chd_itm_grp_cd3, value);
	}


	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public String chd_itm_grp_nm3() {
		return getConstString(offset + 100, $chd_itm_grp_nm3);
	}

	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public void chd_itm_grp_nm3(String value) {
		setConstString(offset + 100, $chd_itm_grp_nm3, value);
	}


	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public String chd_itm_grp_cd4() {
		return getConstString(offset + 101, $chd_itm_grp_cd4);
	}

	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public void chd_itm_grp_cd4(String value) {
		setConstString(offset + 101, $chd_itm_grp_cd4, value);
	}


	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public String chd_itm_grp_nm4() {
		return getConstString(offset + 102, $chd_itm_grp_nm4);
	}

	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public void chd_itm_grp_nm4(String value) {
		setConstString(offset + 102, $chd_itm_grp_nm4, value);
	}


	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public String chd_itm_grp_cd5() {
		return getConstString(offset + 103, $chd_itm_grp_cd5);
	}

	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public void chd_itm_grp_cd5(String value) {
		setConstString(offset + 103, $chd_itm_grp_cd5, value);
	}


	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public String chd_itm_grp_nm5() {
		return getConstString(offset + 104, $chd_itm_grp_nm5);
	}

	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public void chd_itm_grp_nm5(String value) {
		setConstString(offset + 104, $chd_itm_grp_nm5, value);
	}


	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public String chd_itm_grp_cd6() {
		return getConstString(offset + 105, $chd_itm_grp_cd6);
	}

	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public void chd_itm_grp_cd6(String value) {
		setConstString(offset + 105, $chd_itm_grp_cd6, value);
	}


	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public String chd_itm_grp_nm6() {
		return getConstString(offset + 106, $chd_itm_grp_nm6);
	}

	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public void chd_itm_grp_nm6(String value) {
		setConstString(offset + 106, $chd_itm_grp_nm6, value);
	}


	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public String chd_itm_grp_cd7() {
		return getConstString(offset + 107, $chd_itm_grp_cd7);
	}

	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public void chd_itm_grp_cd7(String value) {
		setConstString(offset + 107, $chd_itm_grp_cd7, value);
	}


	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public String chd_itm_grp_nm7() {
		return getConstString(offset + 108, $chd_itm_grp_nm7);
	}

	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public void chd_itm_grp_nm7(String value) {
		setConstString(offset + 108, $chd_itm_grp_nm7, value);
	}


	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public String chd_itm_grp_cd8() {
		return getConstString(offset + 109, $chd_itm_grp_cd8);
	}

	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public void chd_itm_grp_cd8(String value) {
		setConstString(offset + 109, $chd_itm_grp_cd8, value);
	}


	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public String chd_itm_grp_nm8() {
		return getConstString(offset + 110, $chd_itm_grp_nm8);
	}

	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public void chd_itm_grp_nm8(String value) {
		setConstString(offset + 110, $chd_itm_grp_nm8, value);
	}


	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public String chd_itm_grp_cd9() {
		return getConstString(offset + 111, $chd_itm_grp_cd9);
	}

	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public void chd_itm_grp_cd9(String value) {
		setConstString(offset + 111, $chd_itm_grp_cd9, value);
	}


	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public String chd_itm_grp_nm9() {
		return getConstString(offset + 112, $chd_itm_grp_nm9);
	}

	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public void chd_itm_grp_nm9(String value) {
		setConstString(offset + 112, $chd_itm_grp_nm9, value);
	}


	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public String chd_itm_grp_cd10() {
		return getConstString(offset + 113, $chd_itm_grp_cd10);
	}

	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public void chd_itm_grp_cd10(String value) {
		setConstString(offset + 113, $chd_itm_grp_cd10, value);
	}


	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public String chd_itm_grp_nm10() {
		return getConstString(offset + 114, $chd_itm_grp_nm10);
	}

	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public void chd_itm_grp_nm10(String value) {
		setConstString(offset + 114, $chd_itm_grp_nm10, value);
	}


	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public String chd_lot_no() {
		return getConstString(offset + 115, $chd_lot_no);
	}

	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public void chd_lot_no(String value) {
		setConstString(offset + 115, $chd_lot_no, value);
	}


	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public String chd_sublot_no() {
		return getConstString(offset + 116, $chd_sublot_no);
	}

	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public void chd_sublot_no(String value) {
		setConstString(offset + 116, $chd_sublot_no, value);
	}


	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public String chd_sno1() {
		return getConstString(offset + 117, $chd_sno1);
	}

	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public void chd_sno1(String value) {
		setConstString(offset + 117, $chd_sno1, value);
	}


	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public String chd_sno2() {
		return getConstString(offset + 118, $chd_sno2);
	}

	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public void chd_sno2(String value) {
		setConstString(offset + 118, $chd_sno2, value);
	}


	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public String chd_sno3() {
		return getConstString(offset + 119, $chd_sno3);
	}

	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public void chd_sno3(String value) {
		setConstString(offset + 119, $chd_sno3, value);
	}


	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public String chd_sno4() {
		return getConstString(offset + 120, $chd_sno4);
	}

	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public void chd_sno4(String value) {
		setConstString(offset + 120, $chd_sno4, value);
	}


	/**
	 * Child asset type 子資産区分.<p>
	 *
	 */
	public String chd_asst_typ() {
		return getConstString(offset + 121, $chd_asst_typ);
	}

	/**
	 * Child asset type 子資産区分.<p>
	 *
	 */
	public void chd_asst_typ(String value) {
		setConstString(offset + 121, $chd_asst_typ, value);
	}


	/**
	 * Child asset type name 子資産区分名.<p>
	 *
	 */
	public String chd_asst_typ_nm() {
		return getConstString(offset + 122, $chd_asst_typ_nm);
	}

	/**
	 * Child asset type name 子資産区分名.<p>
	 *
	 */
	public void chd_asst_typ_nm(String value) {
		setConstString(offset + 122, $chd_asst_typ_nm, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 123, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 123, $repurc_obli_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 124, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 124, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 125, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 125, $site_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 126, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 126, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 127, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 127, $loc_nm, value);
	}


	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 128, $str_ln_cd);
	}

	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 128, $str_ln_cd, value);
	}


	/**
	 * Line name ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 129, $str_ln_nm);
	}

	/**
	 * Line name ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 129, $str_ln_nm, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 130, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 130, $oper_act_no, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 131, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 131, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 132, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 132, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 133, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 133, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 133, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 133, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 133, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 133, $oper_seq, value);
	}


	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 134, $stk_bp_cd);
	}

	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 134, $stk_bp_cd, value);
	}


	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 135, $stk_bp_nm);
	}

	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 135, $stk_bp_nm, value);
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 136, $ac_slip_typ);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 136, $ac_slip_typ, value);
	}


	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public String ac_slip_typ_nm() {
		return getConstString(offset + 137, $ac_slip_typ_nm);
	}

	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public void ac_slip_typ_nm(String value) {
		setConstString(offset + 137, $ac_slip_typ_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 138, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 138, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 139, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 139, $ac_rsn_nm, value);
	}


	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public String rec_eval_typ() {
		return getConstString(offset + 140, $rec_eval_typ);
	}

	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public void rec_eval_typ(String value) {
		setConstString(offset + 140, $rec_eval_typ, value);
	}


	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public String rec_eval_typ_nm() {
		return getConstString(offset + 141, $rec_eval_typ_nm);
	}

	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public void rec_eval_typ_nm(String value) {
		setConstString(offset + 141, $rec_eval_typ_nm, value);
	}


	/**
	 * Basic unit per unit difference 原単位単価差.<p>
	 *
	 */
	public MCNumber base_ttl_diff() {
		return getConstNumber(offset + 142, $base_ttl_diff);
	}

	/**
	 * Basic unit per unit difference 原単位単価差.<p>
	 *
	 */
	public void base_ttl_diff(MCNumber value) {
		setConstNumber(offset + 142, $base_ttl_diff, value);
	}

	/**
	 * Basic unit per unit difference 原単位単価差.<p>
	 *
	 */
	public void base_ttl_diff(int value) {
		setConstNumber(offset + 142, $base_ttl_diff, value);
	}

	/**
	 * Basic unit per unit difference 原単位単価差.<p>
	 *
	 */
	public void base_ttl_diff(long value) {
		setConstNumber(offset + 142, $base_ttl_diff, value);
	}

	/**
	 * Basic unit per unit difference 原単位単価差.<p>
	 *
	 */
	public void base_ttl_diff(float value) {
		setConstNumber(offset + 142, $base_ttl_diff, value);
	}

	/**
	 * Basic unit per unit difference 原単位単価差.<p>
	 *
	 */
	public void base_ttl_diff(double value) {
		setConstNumber(offset + 142, $base_ttl_diff, value);
	}


	/**
	 * Standard unit cost unit price 標準原単位単価.<p>
	 *
	 */
	public MCNumber std_base_ttl() {
		return getConstNumber(offset + 143, $std_base_ttl);
	}

	/**
	 * Standard unit cost unit price 標準原単位単価.<p>
	 *
	 */
	public void std_base_ttl(MCNumber value) {
		setConstNumber(offset + 143, $std_base_ttl, value);
	}

	/**
	 * Standard unit cost unit price 標準原単位単価.<p>
	 *
	 */
	public void std_base_ttl(int value) {
		setConstNumber(offset + 143, $std_base_ttl, value);
	}

	/**
	 * Standard unit cost unit price 標準原単位単価.<p>
	 *
	 */
	public void std_base_ttl(long value) {
		setConstNumber(offset + 143, $std_base_ttl, value);
	}

	/**
	 * Standard unit cost unit price 標準原単位単価.<p>
	 *
	 */
	public void std_base_ttl(float value) {
		setConstNumber(offset + 143, $std_base_ttl, value);
	}

	/**
	 * Standard unit cost unit price 標準原単位単価.<p>
	 *
	 */
	public void std_base_ttl(double value) {
		setConstNumber(offset + 143, $std_base_ttl, value);
	}


	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public MCNumber base_ttl() {
		return getConstNumber(offset + 144, $base_ttl);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_ttl(MCNumber value) {
		setConstNumber(offset + 144, $base_ttl, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_ttl(int value) {
		setConstNumber(offset + 144, $base_ttl, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_ttl(long value) {
		setConstNumber(offset + 144, $base_ttl, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_ttl(float value) {
		setConstNumber(offset + 144, $base_ttl, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_ttl(double value) {
		setConstNumber(offset + 144, $base_ttl, value);
	}


	/**
	 * Basic unit per unit (Order) 原単位単価（指図）.<p>
	 *
	 */
	public MCNumber odr_base_ttl() {
		return getConstNumber(offset + 145, $odr_base_ttl);
	}

	/**
	 * Basic unit per unit (Order) 原単位単価（指図）.<p>
	 *
	 */
	public void odr_base_ttl(MCNumber value) {
		setConstNumber(offset + 145, $odr_base_ttl, value);
	}

	/**
	 * Basic unit per unit (Order) 原単位単価（指図）.<p>
	 *
	 */
	public void odr_base_ttl(int value) {
		setConstNumber(offset + 145, $odr_base_ttl, value);
	}

	/**
	 * Basic unit per unit (Order) 原単位単価（指図）.<p>
	 *
	 */
	public void odr_base_ttl(long value) {
		setConstNumber(offset + 145, $odr_base_ttl, value);
	}

	/**
	 * Basic unit per unit (Order) 原単位単価（指図）.<p>
	 *
	 */
	public void odr_base_ttl(float value) {
		setConstNumber(offset + 145, $odr_base_ttl, value);
	}

	/**
	 * Basic unit per unit (Order) 原単位単価（指図）.<p>
	 *
	 */
	public void odr_base_ttl(double value) {
		setConstNumber(offset + 145, $odr_base_ttl, value);
	}


	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public MCNumber base_qty() {
		return getConstNumber(offset + 146, $base_qty);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(MCNumber value) {
		setConstNumber(offset + 146, $base_qty, value);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(int value) {
		setConstNumber(offset + 146, $base_qty, value);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(long value) {
		setConstNumber(offset + 146, $base_qty, value);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(float value) {
		setConstNumber(offset + 146, $base_qty, value);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(double value) {
		setConstNumber(offset + 146, $base_qty, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 147, $qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 147, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 147, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 147, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 147, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 147, $qty, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 148, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 148, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 149, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 149, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 150, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 150, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 150, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 150, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 150, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 150, $dec_place, value);
	}


	/**
	 * Unit price variance 単価差異.<p>
	 *
	 */
	public MCNumber upri_diff() {
		return getConstNumber(offset + 151, $upri_diff);
	}

	/**
	 * Unit price variance 単価差異.<p>
	 *
	 */
	public void upri_diff(MCNumber value) {
		setConstNumber(offset + 151, $upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異.<p>
	 *
	 */
	public void upri_diff(int value) {
		setConstNumber(offset + 151, $upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異.<p>
	 *
	 */
	public void upri_diff(long value) {
		setConstNumber(offset + 151, $upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異.<p>
	 *
	 */
	public void upri_diff(float value) {
		setConstNumber(offset + 151, $upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異.<p>
	 *
	 */
	public void upri_diff(double value) {
		setConstNumber(offset + 151, $upri_diff, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber std_upri() {
		return getConstNumber(offset + 152, $std_upri);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(MCNumber value) {
		setConstNumber(offset + 152, $std_upri, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(int value) {
		setConstNumber(offset + 152, $std_upri, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(long value) {
		setConstNumber(offset + 152, $std_upri, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(float value) {
		setConstNumber(offset + 152, $std_upri, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(double value) {
		setConstNumber(offset + 152, $std_upri, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber act_upri() {
		return getConstNumber(offset + 153, $act_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void act_upri(MCNumber value) {
		setConstNumber(offset + 153, $act_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void act_upri(int value) {
		setConstNumber(offset + 153, $act_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void act_upri(long value) {
		setConstNumber(offset + 153, $act_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void act_upri(float value) {
		setConstNumber(offset + 153, $act_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void act_upri(double value) {
		setConstNumber(offset + 153, $act_upri, value);
	}


	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public MCNumber so_act_amt() {
		return getConstNumber(offset + 154, $so_act_amt);
	}

	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public void so_act_amt(MCNumber value) {
		setConstNumber(offset + 154, $so_act_amt, value);
	}

	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public void so_act_amt(int value) {
		setConstNumber(offset + 154, $so_act_amt, value);
	}

	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public void so_act_amt(long value) {
		setConstNumber(offset + 154, $so_act_amt, value);
	}

	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public void so_act_amt(float value) {
		setConstNumber(offset + 154, $so_act_amt, value);
	}

	/**
	 * Offset amount 相殺金額.<p>
	 *
	 */
	public void so_act_amt(double value) {
		setConstNumber(offset + 154, $so_act_amt, value);
	}


	/**
	 * Supply difference gain 交付差益.<p>
	 *
	 */
	public MCNumber margin() {
		return getConstNumber(offset + 155, $margin);
	}

	/**
	 * Supply difference gain 交付差益.<p>
	 *
	 */
	public void margin(MCNumber value) {
		setConstNumber(offset + 155, $margin, value);
	}

	/**
	 * Supply difference gain 交付差益.<p>
	 *
	 */
	public void margin(int value) {
		setConstNumber(offset + 155, $margin, value);
	}

	/**
	 * Supply difference gain 交付差益.<p>
	 *
	 */
	public void margin(long value) {
		setConstNumber(offset + 155, $margin, value);
	}

	/**
	 * Supply difference gain 交付差益.<p>
	 *
	 */
	public void margin(float value) {
		setConstNumber(offset + 155, $margin, value);
	}

	/**
	 * Supply difference gain 交付差益.<p>
	 *
	 */
	public void margin(double value) {
		setConstNumber(offset + 155, $margin, value);
	}


	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public MCNumber amt_diff() {
		return getConstNumber(offset + 156, $amt_diff);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void amt_diff(MCNumber value) {
		setConstNumber(offset + 156, $amt_diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void amt_diff(int value) {
		setConstNumber(offset + 156, $amt_diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void amt_diff(long value) {
		setConstNumber(offset + 156, $amt_diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void amt_diff(float value) {
		setConstNumber(offset + 156, $amt_diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void amt_diff(double value) {
		setConstNumber(offset + 156, $amt_diff, value);
	}


	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public MCNumber std_cost() {
		return getConstNumber(offset + 157, $std_cost);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void std_cost(MCNumber value) {
		setConstNumber(offset + 157, $std_cost, value);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void std_cost(int value) {
		setConstNumber(offset + 157, $std_cost, value);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void std_cost(long value) {
		setConstNumber(offset + 157, $std_cost, value);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void std_cost(float value) {
		setConstNumber(offset + 157, $std_cost, value);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void std_cost(double value) {
		setConstNumber(offset + 157, $std_cost, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 158, $ttl);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 158, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 158, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 158, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 158, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 158, $ttl, value);
	}


	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public MCNumber var_cost() {
		return getConstNumber(offset + 159, $var_cost);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(MCNumber value) {
		setConstNumber(offset + 159, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(int value) {
		setConstNumber(offset + 159, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(long value) {
		setConstNumber(offset + 159, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(float value) {
		setConstNumber(offset + 159, $var_cost, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var_cost(double value) {
		setConstNumber(offset + 159, $var_cost, value);
	}


	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public MCNumber fxd_cost() {
		return getConstNumber(offset + 160, $fxd_cost);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(MCNumber value) {
		setConstNumber(offset + 160, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(int value) {
		setConstNumber(offset + 160, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(long value) {
		setConstNumber(offset + 160, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(float value) {
		setConstNumber(offset + 160, $fxd_cost, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd_cost(double value) {
		setConstNumber(offset + 160, $fxd_cost, value);
	}


	public MCNumber col_000() {
		return getConstNumber(offset + 161, $col_000);
	}

	public void col_000(MCNumber value) {
		setConstNumber(offset + 161, $col_000, value);
	}

	public void col_000(int value) {
		setConstNumber(offset + 161, $col_000, value);
	}

	public void col_000(long value) {
		setConstNumber(offset + 161, $col_000, value);
	}

	public void col_000(float value) {
		setConstNumber(offset + 161, $col_000, value);
	}

	public void col_000(double value) {
		setConstNumber(offset + 161, $col_000, value);
	}


	public MCNumber col_001() {
		return getConstNumber(offset + 162, $col_001);
	}

	public void col_001(MCNumber value) {
		setConstNumber(offset + 162, $col_001, value);
	}

	public void col_001(int value) {
		setConstNumber(offset + 162, $col_001, value);
	}

	public void col_001(long value) {
		setConstNumber(offset + 162, $col_001, value);
	}

	public void col_001(float value) {
		setConstNumber(offset + 162, $col_001, value);
	}

	public void col_001(double value) {
		setConstNumber(offset + 162, $col_001, value);
	}


	public MCNumber col_002() {
		return getConstNumber(offset + 163, $col_002);
	}

	public void col_002(MCNumber value) {
		setConstNumber(offset + 163, $col_002, value);
	}

	public void col_002(int value) {
		setConstNumber(offset + 163, $col_002, value);
	}

	public void col_002(long value) {
		setConstNumber(offset + 163, $col_002, value);
	}

	public void col_002(float value) {
		setConstNumber(offset + 163, $col_002, value);
	}

	public void col_002(double value) {
		setConstNumber(offset + 163, $col_002, value);
	}


	public MCNumber col_003() {
		return getConstNumber(offset + 164, $col_003);
	}

	public void col_003(MCNumber value) {
		setConstNumber(offset + 164, $col_003, value);
	}

	public void col_003(int value) {
		setConstNumber(offset + 164, $col_003, value);
	}

	public void col_003(long value) {
		setConstNumber(offset + 164, $col_003, value);
	}

	public void col_003(float value) {
		setConstNumber(offset + 164, $col_003, value);
	}

	public void col_003(double value) {
		setConstNumber(offset + 164, $col_003, value);
	}


	public MCNumber col_004() {
		return getConstNumber(offset + 165, $col_004);
	}

	public void col_004(MCNumber value) {
		setConstNumber(offset + 165, $col_004, value);
	}

	public void col_004(int value) {
		setConstNumber(offset + 165, $col_004, value);
	}

	public void col_004(long value) {
		setConstNumber(offset + 165, $col_004, value);
	}

	public void col_004(float value) {
		setConstNumber(offset + 165, $col_004, value);
	}

	public void col_004(double value) {
		setConstNumber(offset + 165, $col_004, value);
	}


	public MCNumber col_005() {
		return getConstNumber(offset + 166, $col_005);
	}

	public void col_005(MCNumber value) {
		setConstNumber(offset + 166, $col_005, value);
	}

	public void col_005(int value) {
		setConstNumber(offset + 166, $col_005, value);
	}

	public void col_005(long value) {
		setConstNumber(offset + 166, $col_005, value);
	}

	public void col_005(float value) {
		setConstNumber(offset + 166, $col_005, value);
	}

	public void col_005(double value) {
		setConstNumber(offset + 166, $col_005, value);
	}


	public MCNumber col_006() {
		return getConstNumber(offset + 167, $col_006);
	}

	public void col_006(MCNumber value) {
		setConstNumber(offset + 167, $col_006, value);
	}

	public void col_006(int value) {
		setConstNumber(offset + 167, $col_006, value);
	}

	public void col_006(long value) {
		setConstNumber(offset + 167, $col_006, value);
	}

	public void col_006(float value) {
		setConstNumber(offset + 167, $col_006, value);
	}

	public void col_006(double value) {
		setConstNumber(offset + 167, $col_006, value);
	}


	public MCNumber col_007() {
		return getConstNumber(offset + 168, $col_007);
	}

	public void col_007(MCNumber value) {
		setConstNumber(offset + 168, $col_007, value);
	}

	public void col_007(int value) {
		setConstNumber(offset + 168, $col_007, value);
	}

	public void col_007(long value) {
		setConstNumber(offset + 168, $col_007, value);
	}

	public void col_007(float value) {
		setConstNumber(offset + 168, $col_007, value);
	}

	public void col_007(double value) {
		setConstNumber(offset + 168, $col_007, value);
	}


	public MCNumber col_008() {
		return getConstNumber(offset + 169, $col_008);
	}

	public void col_008(MCNumber value) {
		setConstNumber(offset + 169, $col_008, value);
	}

	public void col_008(int value) {
		setConstNumber(offset + 169, $col_008, value);
	}

	public void col_008(long value) {
		setConstNumber(offset + 169, $col_008, value);
	}

	public void col_008(float value) {
		setConstNumber(offset + 169, $col_008, value);
	}

	public void col_008(double value) {
		setConstNumber(offset + 169, $col_008, value);
	}


	public MCNumber col_009() {
		return getConstNumber(offset + 170, $col_009);
	}

	public void col_009(MCNumber value) {
		setConstNumber(offset + 170, $col_009, value);
	}

	public void col_009(int value) {
		setConstNumber(offset + 170, $col_009, value);
	}

	public void col_009(long value) {
		setConstNumber(offset + 170, $col_009, value);
	}

	public void col_009(float value) {
		setConstNumber(offset + 170, $col_009, value);
	}

	public void col_009(double value) {
		setConstNumber(offset + 170, $col_009, value);
	}


	public MCNumber col_010() {
		return getConstNumber(offset + 171, $col_010);
	}

	public void col_010(MCNumber value) {
		setConstNumber(offset + 171, $col_010, value);
	}

	public void col_010(int value) {
		setConstNumber(offset + 171, $col_010, value);
	}

	public void col_010(long value) {
		setConstNumber(offset + 171, $col_010, value);
	}

	public void col_010(float value) {
		setConstNumber(offset + 171, $col_010, value);
	}

	public void col_010(double value) {
		setConstNumber(offset + 171, $col_010, value);
	}


	public MCNumber col_011() {
		return getConstNumber(offset + 172, $col_011);
	}

	public void col_011(MCNumber value) {
		setConstNumber(offset + 172, $col_011, value);
	}

	public void col_011(int value) {
		setConstNumber(offset + 172, $col_011, value);
	}

	public void col_011(long value) {
		setConstNumber(offset + 172, $col_011, value);
	}

	public void col_011(float value) {
		setConstNumber(offset + 172, $col_011, value);
	}

	public void col_011(double value) {
		setConstNumber(offset + 172, $col_011, value);
	}


	public MCNumber col_012() {
		return getConstNumber(offset + 173, $col_012);
	}

	public void col_012(MCNumber value) {
		setConstNumber(offset + 173, $col_012, value);
	}

	public void col_012(int value) {
		setConstNumber(offset + 173, $col_012, value);
	}

	public void col_012(long value) {
		setConstNumber(offset + 173, $col_012, value);
	}

	public void col_012(float value) {
		setConstNumber(offset + 173, $col_012, value);
	}

	public void col_012(double value) {
		setConstNumber(offset + 173, $col_012, value);
	}


	public MCNumber col_013() {
		return getConstNumber(offset + 174, $col_013);
	}

	public void col_013(MCNumber value) {
		setConstNumber(offset + 174, $col_013, value);
	}

	public void col_013(int value) {
		setConstNumber(offset + 174, $col_013, value);
	}

	public void col_013(long value) {
		setConstNumber(offset + 174, $col_013, value);
	}

	public void col_013(float value) {
		setConstNumber(offset + 174, $col_013, value);
	}

	public void col_013(double value) {
		setConstNumber(offset + 174, $col_013, value);
	}


	public MCNumber col_014() {
		return getConstNumber(offset + 175, $col_014);
	}

	public void col_014(MCNumber value) {
		setConstNumber(offset + 175, $col_014, value);
	}

	public void col_014(int value) {
		setConstNumber(offset + 175, $col_014, value);
	}

	public void col_014(long value) {
		setConstNumber(offset + 175, $col_014, value);
	}

	public void col_014(float value) {
		setConstNumber(offset + 175, $col_014, value);
	}

	public void col_014(double value) {
		setConstNumber(offset + 175, $col_014, value);
	}


	public MCNumber col_015() {
		return getConstNumber(offset + 176, $col_015);
	}

	public void col_015(MCNumber value) {
		setConstNumber(offset + 176, $col_015, value);
	}

	public void col_015(int value) {
		setConstNumber(offset + 176, $col_015, value);
	}

	public void col_015(long value) {
		setConstNumber(offset + 176, $col_015, value);
	}

	public void col_015(float value) {
		setConstNumber(offset + 176, $col_015, value);
	}

	public void col_015(double value) {
		setConstNumber(offset + 176, $col_015, value);
	}


	public MCNumber col_016() {
		return getConstNumber(offset + 177, $col_016);
	}

	public void col_016(MCNumber value) {
		setConstNumber(offset + 177, $col_016, value);
	}

	public void col_016(int value) {
		setConstNumber(offset + 177, $col_016, value);
	}

	public void col_016(long value) {
		setConstNumber(offset + 177, $col_016, value);
	}

	public void col_016(float value) {
		setConstNumber(offset + 177, $col_016, value);
	}

	public void col_016(double value) {
		setConstNumber(offset + 177, $col_016, value);
	}


	public MCNumber col_017() {
		return getConstNumber(offset + 178, $col_017);
	}

	public void col_017(MCNumber value) {
		setConstNumber(offset + 178, $col_017, value);
	}

	public void col_017(int value) {
		setConstNumber(offset + 178, $col_017, value);
	}

	public void col_017(long value) {
		setConstNumber(offset + 178, $col_017, value);
	}

	public void col_017(float value) {
		setConstNumber(offset + 178, $col_017, value);
	}

	public void col_017(double value) {
		setConstNumber(offset + 178, $col_017, value);
	}


	public MCNumber col_018() {
		return getConstNumber(offset + 179, $col_018);
	}

	public void col_018(MCNumber value) {
		setConstNumber(offset + 179, $col_018, value);
	}

	public void col_018(int value) {
		setConstNumber(offset + 179, $col_018, value);
	}

	public void col_018(long value) {
		setConstNumber(offset + 179, $col_018, value);
	}

	public void col_018(float value) {
		setConstNumber(offset + 179, $col_018, value);
	}

	public void col_018(double value) {
		setConstNumber(offset + 179, $col_018, value);
	}


	public MCNumber col_019() {
		return getConstNumber(offset + 180, $col_019);
	}

	public void col_019(MCNumber value) {
		setConstNumber(offset + 180, $col_019, value);
	}

	public void col_019(int value) {
		setConstNumber(offset + 180, $col_019, value);
	}

	public void col_019(long value) {
		setConstNumber(offset + 180, $col_019, value);
	}

	public void col_019(float value) {
		setConstNumber(offset + 180, $col_019, value);
	}

	public void col_019(double value) {
		setConstNumber(offset + 180, $col_019, value);
	}


	public MCNumber col_020() {
		return getConstNumber(offset + 181, $col_020);
	}

	public void col_020(MCNumber value) {
		setConstNumber(offset + 181, $col_020, value);
	}

	public void col_020(int value) {
		setConstNumber(offset + 181, $col_020, value);
	}

	public void col_020(long value) {
		setConstNumber(offset + 181, $col_020, value);
	}

	public void col_020(float value) {
		setConstNumber(offset + 181, $col_020, value);
	}

	public void col_020(double value) {
		setConstNumber(offset + 181, $col_020, value);
	}


	public MCNumber col_021() {
		return getConstNumber(offset + 182, $col_021);
	}

	public void col_021(MCNumber value) {
		setConstNumber(offset + 182, $col_021, value);
	}

	public void col_021(int value) {
		setConstNumber(offset + 182, $col_021, value);
	}

	public void col_021(long value) {
		setConstNumber(offset + 182, $col_021, value);
	}

	public void col_021(float value) {
		setConstNumber(offset + 182, $col_021, value);
	}

	public void col_021(double value) {
		setConstNumber(offset + 182, $col_021, value);
	}


	public MCNumber col_022() {
		return getConstNumber(offset + 183, $col_022);
	}

	public void col_022(MCNumber value) {
		setConstNumber(offset + 183, $col_022, value);
	}

	public void col_022(int value) {
		setConstNumber(offset + 183, $col_022, value);
	}

	public void col_022(long value) {
		setConstNumber(offset + 183, $col_022, value);
	}

	public void col_022(float value) {
		setConstNumber(offset + 183, $col_022, value);
	}

	public void col_022(double value) {
		setConstNumber(offset + 183, $col_022, value);
	}


	public MCNumber col_023() {
		return getConstNumber(offset + 184, $col_023);
	}

	public void col_023(MCNumber value) {
		setConstNumber(offset + 184, $col_023, value);
	}

	public void col_023(int value) {
		setConstNumber(offset + 184, $col_023, value);
	}

	public void col_023(long value) {
		setConstNumber(offset + 184, $col_023, value);
	}

	public void col_023(float value) {
		setConstNumber(offset + 184, $col_023, value);
	}

	public void col_023(double value) {
		setConstNumber(offset + 184, $col_023, value);
	}


	public MCNumber col_024() {
		return getConstNumber(offset + 185, $col_024);
	}

	public void col_024(MCNumber value) {
		setConstNumber(offset + 185, $col_024, value);
	}

	public void col_024(int value) {
		setConstNumber(offset + 185, $col_024, value);
	}

	public void col_024(long value) {
		setConstNumber(offset + 185, $col_024, value);
	}

	public void col_024(float value) {
		setConstNumber(offset + 185, $col_024, value);
	}

	public void col_024(double value) {
		setConstNumber(offset + 185, $col_024, value);
	}


	public MCNumber col_025() {
		return getConstNumber(offset + 186, $col_025);
	}

	public void col_025(MCNumber value) {
		setConstNumber(offset + 186, $col_025, value);
	}

	public void col_025(int value) {
		setConstNumber(offset + 186, $col_025, value);
	}

	public void col_025(long value) {
		setConstNumber(offset + 186, $col_025, value);
	}

	public void col_025(float value) {
		setConstNumber(offset + 186, $col_025, value);
	}

	public void col_025(double value) {
		setConstNumber(offset + 186, $col_025, value);
	}


	public MCNumber col_026() {
		return getConstNumber(offset + 187, $col_026);
	}

	public void col_026(MCNumber value) {
		setConstNumber(offset + 187, $col_026, value);
	}

	public void col_026(int value) {
		setConstNumber(offset + 187, $col_026, value);
	}

	public void col_026(long value) {
		setConstNumber(offset + 187, $col_026, value);
	}

	public void col_026(float value) {
		setConstNumber(offset + 187, $col_026, value);
	}

	public void col_026(double value) {
		setConstNumber(offset + 187, $col_026, value);
	}


	public MCNumber col_027() {
		return getConstNumber(offset + 188, $col_027);
	}

	public void col_027(MCNumber value) {
		setConstNumber(offset + 188, $col_027, value);
	}

	public void col_027(int value) {
		setConstNumber(offset + 188, $col_027, value);
	}

	public void col_027(long value) {
		setConstNumber(offset + 188, $col_027, value);
	}

	public void col_027(float value) {
		setConstNumber(offset + 188, $col_027, value);
	}

	public void col_027(double value) {
		setConstNumber(offset + 188, $col_027, value);
	}


	public MCNumber col_028() {
		return getConstNumber(offset + 189, $col_028);
	}

	public void col_028(MCNumber value) {
		setConstNumber(offset + 189, $col_028, value);
	}

	public void col_028(int value) {
		setConstNumber(offset + 189, $col_028, value);
	}

	public void col_028(long value) {
		setConstNumber(offset + 189, $col_028, value);
	}

	public void col_028(float value) {
		setConstNumber(offset + 189, $col_028, value);
	}

	public void col_028(double value) {
		setConstNumber(offset + 189, $col_028, value);
	}


	public MCNumber col_029() {
		return getConstNumber(offset + 190, $col_029);
	}

	public void col_029(MCNumber value) {
		setConstNumber(offset + 190, $col_029, value);
	}

	public void col_029(int value) {
		setConstNumber(offset + 190, $col_029, value);
	}

	public void col_029(long value) {
		setConstNumber(offset + 190, $col_029, value);
	}

	public void col_029(float value) {
		setConstNumber(offset + 190, $col_029, value);
	}

	public void col_029(double value) {
		setConstNumber(offset + 190, $col_029, value);
	}


	public MCNumber col_030() {
		return getConstNumber(offset + 191, $col_030);
	}

	public void col_030(MCNumber value) {
		setConstNumber(offset + 191, $col_030, value);
	}

	public void col_030(int value) {
		setConstNumber(offset + 191, $col_030, value);
	}

	public void col_030(long value) {
		setConstNumber(offset + 191, $col_030, value);
	}

	public void col_030(float value) {
		setConstNumber(offset + 191, $col_030, value);
	}

	public void col_030(double value) {
		setConstNumber(offset + 191, $col_030, value);
	}


	public MCNumber col_031() {
		return getConstNumber(offset + 192, $col_031);
	}

	public void col_031(MCNumber value) {
		setConstNumber(offset + 192, $col_031, value);
	}

	public void col_031(int value) {
		setConstNumber(offset + 192, $col_031, value);
	}

	public void col_031(long value) {
		setConstNumber(offset + 192, $col_031, value);
	}

	public void col_031(float value) {
		setConstNumber(offset + 192, $col_031, value);
	}

	public void col_031(double value) {
		setConstNumber(offset + 192, $col_031, value);
	}


	public MCNumber col_032() {
		return getConstNumber(offset + 193, $col_032);
	}

	public void col_032(MCNumber value) {
		setConstNumber(offset + 193, $col_032, value);
	}

	public void col_032(int value) {
		setConstNumber(offset + 193, $col_032, value);
	}

	public void col_032(long value) {
		setConstNumber(offset + 193, $col_032, value);
	}

	public void col_032(float value) {
		setConstNumber(offset + 193, $col_032, value);
	}

	public void col_032(double value) {
		setConstNumber(offset + 193, $col_032, value);
	}


	public MCNumber col_033() {
		return getConstNumber(offset + 194, $col_033);
	}

	public void col_033(MCNumber value) {
		setConstNumber(offset + 194, $col_033, value);
	}

	public void col_033(int value) {
		setConstNumber(offset + 194, $col_033, value);
	}

	public void col_033(long value) {
		setConstNumber(offset + 194, $col_033, value);
	}

	public void col_033(float value) {
		setConstNumber(offset + 194, $col_033, value);
	}

	public void col_033(double value) {
		setConstNumber(offset + 194, $col_033, value);
	}


	public MCNumber col_034() {
		return getConstNumber(offset + 195, $col_034);
	}

	public void col_034(MCNumber value) {
		setConstNumber(offset + 195, $col_034, value);
	}

	public void col_034(int value) {
		setConstNumber(offset + 195, $col_034, value);
	}

	public void col_034(long value) {
		setConstNumber(offset + 195, $col_034, value);
	}

	public void col_034(float value) {
		setConstNumber(offset + 195, $col_034, value);
	}

	public void col_034(double value) {
		setConstNumber(offset + 195, $col_034, value);
	}


	public MCNumber col_035() {
		return getConstNumber(offset + 196, $col_035);
	}

	public void col_035(MCNumber value) {
		setConstNumber(offset + 196, $col_035, value);
	}

	public void col_035(int value) {
		setConstNumber(offset + 196, $col_035, value);
	}

	public void col_035(long value) {
		setConstNumber(offset + 196, $col_035, value);
	}

	public void col_035(float value) {
		setConstNumber(offset + 196, $col_035, value);
	}

	public void col_035(double value) {
		setConstNumber(offset + 196, $col_035, value);
	}


	public MCNumber col_036() {
		return getConstNumber(offset + 197, $col_036);
	}

	public void col_036(MCNumber value) {
		setConstNumber(offset + 197, $col_036, value);
	}

	public void col_036(int value) {
		setConstNumber(offset + 197, $col_036, value);
	}

	public void col_036(long value) {
		setConstNumber(offset + 197, $col_036, value);
	}

	public void col_036(float value) {
		setConstNumber(offset + 197, $col_036, value);
	}

	public void col_036(double value) {
		setConstNumber(offset + 197, $col_036, value);
	}


	public MCNumber col_037() {
		return getConstNumber(offset + 198, $col_037);
	}

	public void col_037(MCNumber value) {
		setConstNumber(offset + 198, $col_037, value);
	}

	public void col_037(int value) {
		setConstNumber(offset + 198, $col_037, value);
	}

	public void col_037(long value) {
		setConstNumber(offset + 198, $col_037, value);
	}

	public void col_037(float value) {
		setConstNumber(offset + 198, $col_037, value);
	}

	public void col_037(double value) {
		setConstNumber(offset + 198, $col_037, value);
	}


	public MCNumber col_038() {
		return getConstNumber(offset + 199, $col_038);
	}

	public void col_038(MCNumber value) {
		setConstNumber(offset + 199, $col_038, value);
	}

	public void col_038(int value) {
		setConstNumber(offset + 199, $col_038, value);
	}

	public void col_038(long value) {
		setConstNumber(offset + 199, $col_038, value);
	}

	public void col_038(float value) {
		setConstNumber(offset + 199, $col_038, value);
	}

	public void col_038(double value) {
		setConstNumber(offset + 199, $col_038, value);
	}


	public MCNumber col_039() {
		return getConstNumber(offset + 200, $col_039);
	}

	public void col_039(MCNumber value) {
		setConstNumber(offset + 200, $col_039, value);
	}

	public void col_039(int value) {
		setConstNumber(offset + 200, $col_039, value);
	}

	public void col_039(long value) {
		setConstNumber(offset + 200, $col_039, value);
	}

	public void col_039(float value) {
		setConstNumber(offset + 200, $col_039, value);
	}

	public void col_039(double value) {
		setConstNumber(offset + 200, $col_039, value);
	}


	public MCNumber col_040() {
		return getConstNumber(offset + 201, $col_040);
	}

	public void col_040(MCNumber value) {
		setConstNumber(offset + 201, $col_040, value);
	}

	public void col_040(int value) {
		setConstNumber(offset + 201, $col_040, value);
	}

	public void col_040(long value) {
		setConstNumber(offset + 201, $col_040, value);
	}

	public void col_040(float value) {
		setConstNumber(offset + 201, $col_040, value);
	}

	public void col_040(double value) {
		setConstNumber(offset + 201, $col_040, value);
	}


	public MCNumber col_041() {
		return getConstNumber(offset + 202, $col_041);
	}

	public void col_041(MCNumber value) {
		setConstNumber(offset + 202, $col_041, value);
	}

	public void col_041(int value) {
		setConstNumber(offset + 202, $col_041, value);
	}

	public void col_041(long value) {
		setConstNumber(offset + 202, $col_041, value);
	}

	public void col_041(float value) {
		setConstNumber(offset + 202, $col_041, value);
	}

	public void col_041(double value) {
		setConstNumber(offset + 202, $col_041, value);
	}


	public MCNumber col_042() {
		return getConstNumber(offset + 203, $col_042);
	}

	public void col_042(MCNumber value) {
		setConstNumber(offset + 203, $col_042, value);
	}

	public void col_042(int value) {
		setConstNumber(offset + 203, $col_042, value);
	}

	public void col_042(long value) {
		setConstNumber(offset + 203, $col_042, value);
	}

	public void col_042(float value) {
		setConstNumber(offset + 203, $col_042, value);
	}

	public void col_042(double value) {
		setConstNumber(offset + 203, $col_042, value);
	}


	public MCNumber col_043() {
		return getConstNumber(offset + 204, $col_043);
	}

	public void col_043(MCNumber value) {
		setConstNumber(offset + 204, $col_043, value);
	}

	public void col_043(int value) {
		setConstNumber(offset + 204, $col_043, value);
	}

	public void col_043(long value) {
		setConstNumber(offset + 204, $col_043, value);
	}

	public void col_043(float value) {
		setConstNumber(offset + 204, $col_043, value);
	}

	public void col_043(double value) {
		setConstNumber(offset + 204, $col_043, value);
	}


	public MCNumber col_044() {
		return getConstNumber(offset + 205, $col_044);
	}

	public void col_044(MCNumber value) {
		setConstNumber(offset + 205, $col_044, value);
	}

	public void col_044(int value) {
		setConstNumber(offset + 205, $col_044, value);
	}

	public void col_044(long value) {
		setConstNumber(offset + 205, $col_044, value);
	}

	public void col_044(float value) {
		setConstNumber(offset + 205, $col_044, value);
	}

	public void col_044(double value) {
		setConstNumber(offset + 205, $col_044, value);
	}


	public MCNumber col_045() {
		return getConstNumber(offset + 206, $col_045);
	}

	public void col_045(MCNumber value) {
		setConstNumber(offset + 206, $col_045, value);
	}

	public void col_045(int value) {
		setConstNumber(offset + 206, $col_045, value);
	}

	public void col_045(long value) {
		setConstNumber(offset + 206, $col_045, value);
	}

	public void col_045(float value) {
		setConstNumber(offset + 206, $col_045, value);
	}

	public void col_045(double value) {
		setConstNumber(offset + 206, $col_045, value);
	}


	public MCNumber col_046() {
		return getConstNumber(offset + 207, $col_046);
	}

	public void col_046(MCNumber value) {
		setConstNumber(offset + 207, $col_046, value);
	}

	public void col_046(int value) {
		setConstNumber(offset + 207, $col_046, value);
	}

	public void col_046(long value) {
		setConstNumber(offset + 207, $col_046, value);
	}

	public void col_046(float value) {
		setConstNumber(offset + 207, $col_046, value);
	}

	public void col_046(double value) {
		setConstNumber(offset + 207, $col_046, value);
	}


	public MCNumber col_047() {
		return getConstNumber(offset + 208, $col_047);
	}

	public void col_047(MCNumber value) {
		setConstNumber(offset + 208, $col_047, value);
	}

	public void col_047(int value) {
		setConstNumber(offset + 208, $col_047, value);
	}

	public void col_047(long value) {
		setConstNumber(offset + 208, $col_047, value);
	}

	public void col_047(float value) {
		setConstNumber(offset + 208, $col_047, value);
	}

	public void col_047(double value) {
		setConstNumber(offset + 208, $col_047, value);
	}


	public MCNumber col_048() {
		return getConstNumber(offset + 209, $col_048);
	}

	public void col_048(MCNumber value) {
		setConstNumber(offset + 209, $col_048, value);
	}

	public void col_048(int value) {
		setConstNumber(offset + 209, $col_048, value);
	}

	public void col_048(long value) {
		setConstNumber(offset + 209, $col_048, value);
	}

	public void col_048(float value) {
		setConstNumber(offset + 209, $col_048, value);
	}

	public void col_048(double value) {
		setConstNumber(offset + 209, $col_048, value);
	}


	public MCNumber col_049() {
		return getConstNumber(offset + 210, $col_049);
	}

	public void col_049(MCNumber value) {
		setConstNumber(offset + 210, $col_049, value);
	}

	public void col_049(int value) {
		setConstNumber(offset + 210, $col_049, value);
	}

	public void col_049(long value) {
		setConstNumber(offset + 210, $col_049, value);
	}

	public void col_049(float value) {
		setConstNumber(offset + 210, $col_049, value);
	}

	public void col_049(double value) {
		setConstNumber(offset + 210, $col_049, value);
	}


	public MCNumber col_050() {
		return getConstNumber(offset + 211, $col_050);
	}

	public void col_050(MCNumber value) {
		setConstNumber(offset + 211, $col_050, value);
	}

	public void col_050(int value) {
		setConstNumber(offset + 211, $col_050, value);
	}

	public void col_050(long value) {
		setConstNumber(offset + 211, $col_050, value);
	}

	public void col_050(float value) {
		setConstNumber(offset + 211, $col_050, value);
	}

	public void col_050(double value) {
		setConstNumber(offset + 211, $col_050, value);
	}


	public MCNumber col_051() {
		return getConstNumber(offset + 212, $col_051);
	}

	public void col_051(MCNumber value) {
		setConstNumber(offset + 212, $col_051, value);
	}

	public void col_051(int value) {
		setConstNumber(offset + 212, $col_051, value);
	}

	public void col_051(long value) {
		setConstNumber(offset + 212, $col_051, value);
	}

	public void col_051(float value) {
		setConstNumber(offset + 212, $col_051, value);
	}

	public void col_051(double value) {
		setConstNumber(offset + 212, $col_051, value);
	}


	public MCNumber col_052() {
		return getConstNumber(offset + 213, $col_052);
	}

	public void col_052(MCNumber value) {
		setConstNumber(offset + 213, $col_052, value);
	}

	public void col_052(int value) {
		setConstNumber(offset + 213, $col_052, value);
	}

	public void col_052(long value) {
		setConstNumber(offset + 213, $col_052, value);
	}

	public void col_052(float value) {
		setConstNumber(offset + 213, $col_052, value);
	}

	public void col_052(double value) {
		setConstNumber(offset + 213, $col_052, value);
	}


	public MCNumber col_053() {
		return getConstNumber(offset + 214, $col_053);
	}

	public void col_053(MCNumber value) {
		setConstNumber(offset + 214, $col_053, value);
	}

	public void col_053(int value) {
		setConstNumber(offset + 214, $col_053, value);
	}

	public void col_053(long value) {
		setConstNumber(offset + 214, $col_053, value);
	}

	public void col_053(float value) {
		setConstNumber(offset + 214, $col_053, value);
	}

	public void col_053(double value) {
		setConstNumber(offset + 214, $col_053, value);
	}


	public MCNumber col_054() {
		return getConstNumber(offset + 215, $col_054);
	}

	public void col_054(MCNumber value) {
		setConstNumber(offset + 215, $col_054, value);
	}

	public void col_054(int value) {
		setConstNumber(offset + 215, $col_054, value);
	}

	public void col_054(long value) {
		setConstNumber(offset + 215, $col_054, value);
	}

	public void col_054(float value) {
		setConstNumber(offset + 215, $col_054, value);
	}

	public void col_054(double value) {
		setConstNumber(offset + 215, $col_054, value);
	}


	public MCNumber col_055() {
		return getConstNumber(offset + 216, $col_055);
	}

	public void col_055(MCNumber value) {
		setConstNumber(offset + 216, $col_055, value);
	}

	public void col_055(int value) {
		setConstNumber(offset + 216, $col_055, value);
	}

	public void col_055(long value) {
		setConstNumber(offset + 216, $col_055, value);
	}

	public void col_055(float value) {
		setConstNumber(offset + 216, $col_055, value);
	}

	public void col_055(double value) {
		setConstNumber(offset + 216, $col_055, value);
	}


	public MCNumber col_056() {
		return getConstNumber(offset + 217, $col_056);
	}

	public void col_056(MCNumber value) {
		setConstNumber(offset + 217, $col_056, value);
	}

	public void col_056(int value) {
		setConstNumber(offset + 217, $col_056, value);
	}

	public void col_056(long value) {
		setConstNumber(offset + 217, $col_056, value);
	}

	public void col_056(float value) {
		setConstNumber(offset + 217, $col_056, value);
	}

	public void col_056(double value) {
		setConstNumber(offset + 217, $col_056, value);
	}


	public MCNumber col_057() {
		return getConstNumber(offset + 218, $col_057);
	}

	public void col_057(MCNumber value) {
		setConstNumber(offset + 218, $col_057, value);
	}

	public void col_057(int value) {
		setConstNumber(offset + 218, $col_057, value);
	}

	public void col_057(long value) {
		setConstNumber(offset + 218, $col_057, value);
	}

	public void col_057(float value) {
		setConstNumber(offset + 218, $col_057, value);
	}

	public void col_057(double value) {
		setConstNumber(offset + 218, $col_057, value);
	}


	public MCNumber col_058() {
		return getConstNumber(offset + 219, $col_058);
	}

	public void col_058(MCNumber value) {
		setConstNumber(offset + 219, $col_058, value);
	}

	public void col_058(int value) {
		setConstNumber(offset + 219, $col_058, value);
	}

	public void col_058(long value) {
		setConstNumber(offset + 219, $col_058, value);
	}

	public void col_058(float value) {
		setConstNumber(offset + 219, $col_058, value);
	}

	public void col_058(double value) {
		setConstNumber(offset + 219, $col_058, value);
	}


	public MCNumber col_059() {
		return getConstNumber(offset + 220, $col_059);
	}

	public void col_059(MCNumber value) {
		setConstNumber(offset + 220, $col_059, value);
	}

	public void col_059(int value) {
		setConstNumber(offset + 220, $col_059, value);
	}

	public void col_059(long value) {
		setConstNumber(offset + 220, $col_059, value);
	}

	public void col_059(float value) {
		setConstNumber(offset + 220, $col_059, value);
	}

	public void col_059(double value) {
		setConstNumber(offset + 220, $col_059, value);
	}


	public MCNumber col_060() {
		return getConstNumber(offset + 221, $col_060);
	}

	public void col_060(MCNumber value) {
		setConstNumber(offset + 221, $col_060, value);
	}

	public void col_060(int value) {
		setConstNumber(offset + 221, $col_060, value);
	}

	public void col_060(long value) {
		setConstNumber(offset + 221, $col_060, value);
	}

	public void col_060(float value) {
		setConstNumber(offset + 221, $col_060, value);
	}

	public void col_060(double value) {
		setConstNumber(offset + 221, $col_060, value);
	}


	public MCNumber col_061() {
		return getConstNumber(offset + 222, $col_061);
	}

	public void col_061(MCNumber value) {
		setConstNumber(offset + 222, $col_061, value);
	}

	public void col_061(int value) {
		setConstNumber(offset + 222, $col_061, value);
	}

	public void col_061(long value) {
		setConstNumber(offset + 222, $col_061, value);
	}

	public void col_061(float value) {
		setConstNumber(offset + 222, $col_061, value);
	}

	public void col_061(double value) {
		setConstNumber(offset + 222, $col_061, value);
	}


	public MCNumber col_062() {
		return getConstNumber(offset + 223, $col_062);
	}

	public void col_062(MCNumber value) {
		setConstNumber(offset + 223, $col_062, value);
	}

	public void col_062(int value) {
		setConstNumber(offset + 223, $col_062, value);
	}

	public void col_062(long value) {
		setConstNumber(offset + 223, $col_062, value);
	}

	public void col_062(float value) {
		setConstNumber(offset + 223, $col_062, value);
	}

	public void col_062(double value) {
		setConstNumber(offset + 223, $col_062, value);
	}


	public MCNumber col_063() {
		return getConstNumber(offset + 224, $col_063);
	}

	public void col_063(MCNumber value) {
		setConstNumber(offset + 224, $col_063, value);
	}

	public void col_063(int value) {
		setConstNumber(offset + 224, $col_063, value);
	}

	public void col_063(long value) {
		setConstNumber(offset + 224, $col_063, value);
	}

	public void col_063(float value) {
		setConstNumber(offset + 224, $col_063, value);
	}

	public void col_063(double value) {
		setConstNumber(offset + 224, $col_063, value);
	}


	public MCNumber col_064() {
		return getConstNumber(offset + 225, $col_064);
	}

	public void col_064(MCNumber value) {
		setConstNumber(offset + 225, $col_064, value);
	}

	public void col_064(int value) {
		setConstNumber(offset + 225, $col_064, value);
	}

	public void col_064(long value) {
		setConstNumber(offset + 225, $col_064, value);
	}

	public void col_064(float value) {
		setConstNumber(offset + 225, $col_064, value);
	}

	public void col_064(double value) {
		setConstNumber(offset + 225, $col_064, value);
	}


	public MCNumber col_065() {
		return getConstNumber(offset + 226, $col_065);
	}

	public void col_065(MCNumber value) {
		setConstNumber(offset + 226, $col_065, value);
	}

	public void col_065(int value) {
		setConstNumber(offset + 226, $col_065, value);
	}

	public void col_065(long value) {
		setConstNumber(offset + 226, $col_065, value);
	}

	public void col_065(float value) {
		setConstNumber(offset + 226, $col_065, value);
	}

	public void col_065(double value) {
		setConstNumber(offset + 226, $col_065, value);
	}


	public MCNumber col_066() {
		return getConstNumber(offset + 227, $col_066);
	}

	public void col_066(MCNumber value) {
		setConstNumber(offset + 227, $col_066, value);
	}

	public void col_066(int value) {
		setConstNumber(offset + 227, $col_066, value);
	}

	public void col_066(long value) {
		setConstNumber(offset + 227, $col_066, value);
	}

	public void col_066(float value) {
		setConstNumber(offset + 227, $col_066, value);
	}

	public void col_066(double value) {
		setConstNumber(offset + 227, $col_066, value);
	}


	public MCNumber col_067() {
		return getConstNumber(offset + 228, $col_067);
	}

	public void col_067(MCNumber value) {
		setConstNumber(offset + 228, $col_067, value);
	}

	public void col_067(int value) {
		setConstNumber(offset + 228, $col_067, value);
	}

	public void col_067(long value) {
		setConstNumber(offset + 228, $col_067, value);
	}

	public void col_067(float value) {
		setConstNumber(offset + 228, $col_067, value);
	}

	public void col_067(double value) {
		setConstNumber(offset + 228, $col_067, value);
	}


	public MCNumber col_068() {
		return getConstNumber(offset + 229, $col_068);
	}

	public void col_068(MCNumber value) {
		setConstNumber(offset + 229, $col_068, value);
	}

	public void col_068(int value) {
		setConstNumber(offset + 229, $col_068, value);
	}

	public void col_068(long value) {
		setConstNumber(offset + 229, $col_068, value);
	}

	public void col_068(float value) {
		setConstNumber(offset + 229, $col_068, value);
	}

	public void col_068(double value) {
		setConstNumber(offset + 229, $col_068, value);
	}


	public MCNumber col_069() {
		return getConstNumber(offset + 230, $col_069);
	}

	public void col_069(MCNumber value) {
		setConstNumber(offset + 230, $col_069, value);
	}

	public void col_069(int value) {
		setConstNumber(offset + 230, $col_069, value);
	}

	public void col_069(long value) {
		setConstNumber(offset + 230, $col_069, value);
	}

	public void col_069(float value) {
		setConstNumber(offset + 230, $col_069, value);
	}

	public void col_069(double value) {
		setConstNumber(offset + 230, $col_069, value);
	}


	public MCNumber col_070() {
		return getConstNumber(offset + 231, $col_070);
	}

	public void col_070(MCNumber value) {
		setConstNumber(offset + 231, $col_070, value);
	}

	public void col_070(int value) {
		setConstNumber(offset + 231, $col_070, value);
	}

	public void col_070(long value) {
		setConstNumber(offset + 231, $col_070, value);
	}

	public void col_070(float value) {
		setConstNumber(offset + 231, $col_070, value);
	}

	public void col_070(double value) {
		setConstNumber(offset + 231, $col_070, value);
	}


	public MCNumber col_071() {
		return getConstNumber(offset + 232, $col_071);
	}

	public void col_071(MCNumber value) {
		setConstNumber(offset + 232, $col_071, value);
	}

	public void col_071(int value) {
		setConstNumber(offset + 232, $col_071, value);
	}

	public void col_071(long value) {
		setConstNumber(offset + 232, $col_071, value);
	}

	public void col_071(float value) {
		setConstNumber(offset + 232, $col_071, value);
	}

	public void col_071(double value) {
		setConstNumber(offset + 232, $col_071, value);
	}


	public MCNumber col_072() {
		return getConstNumber(offset + 233, $col_072);
	}

	public void col_072(MCNumber value) {
		setConstNumber(offset + 233, $col_072, value);
	}

	public void col_072(int value) {
		setConstNumber(offset + 233, $col_072, value);
	}

	public void col_072(long value) {
		setConstNumber(offset + 233, $col_072, value);
	}

	public void col_072(float value) {
		setConstNumber(offset + 233, $col_072, value);
	}

	public void col_072(double value) {
		setConstNumber(offset + 233, $col_072, value);
	}


	public MCNumber col_073() {
		return getConstNumber(offset + 234, $col_073);
	}

	public void col_073(MCNumber value) {
		setConstNumber(offset + 234, $col_073, value);
	}

	public void col_073(int value) {
		setConstNumber(offset + 234, $col_073, value);
	}

	public void col_073(long value) {
		setConstNumber(offset + 234, $col_073, value);
	}

	public void col_073(float value) {
		setConstNumber(offset + 234, $col_073, value);
	}

	public void col_073(double value) {
		setConstNumber(offset + 234, $col_073, value);
	}


	public MCNumber col_074() {
		return getConstNumber(offset + 235, $col_074);
	}

	public void col_074(MCNumber value) {
		setConstNumber(offset + 235, $col_074, value);
	}

	public void col_074(int value) {
		setConstNumber(offset + 235, $col_074, value);
	}

	public void col_074(long value) {
		setConstNumber(offset + 235, $col_074, value);
	}

	public void col_074(float value) {
		setConstNumber(offset + 235, $col_074, value);
	}

	public void col_074(double value) {
		setConstNumber(offset + 235, $col_074, value);
	}


	public MCNumber col_075() {
		return getConstNumber(offset + 236, $col_075);
	}

	public void col_075(MCNumber value) {
		setConstNumber(offset + 236, $col_075, value);
	}

	public void col_075(int value) {
		setConstNumber(offset + 236, $col_075, value);
	}

	public void col_075(long value) {
		setConstNumber(offset + 236, $col_075, value);
	}

	public void col_075(float value) {
		setConstNumber(offset + 236, $col_075, value);
	}

	public void col_075(double value) {
		setConstNumber(offset + 236, $col_075, value);
	}


	public MCNumber col_076() {
		return getConstNumber(offset + 237, $col_076);
	}

	public void col_076(MCNumber value) {
		setConstNumber(offset + 237, $col_076, value);
	}

	public void col_076(int value) {
		setConstNumber(offset + 237, $col_076, value);
	}

	public void col_076(long value) {
		setConstNumber(offset + 237, $col_076, value);
	}

	public void col_076(float value) {
		setConstNumber(offset + 237, $col_076, value);
	}

	public void col_076(double value) {
		setConstNumber(offset + 237, $col_076, value);
	}


	public MCNumber col_077() {
		return getConstNumber(offset + 238, $col_077);
	}

	public void col_077(MCNumber value) {
		setConstNumber(offset + 238, $col_077, value);
	}

	public void col_077(int value) {
		setConstNumber(offset + 238, $col_077, value);
	}

	public void col_077(long value) {
		setConstNumber(offset + 238, $col_077, value);
	}

	public void col_077(float value) {
		setConstNumber(offset + 238, $col_077, value);
	}

	public void col_077(double value) {
		setConstNumber(offset + 238, $col_077, value);
	}


	public MCNumber col_078() {
		return getConstNumber(offset + 239, $col_078);
	}

	public void col_078(MCNumber value) {
		setConstNumber(offset + 239, $col_078, value);
	}

	public void col_078(int value) {
		setConstNumber(offset + 239, $col_078, value);
	}

	public void col_078(long value) {
		setConstNumber(offset + 239, $col_078, value);
	}

	public void col_078(float value) {
		setConstNumber(offset + 239, $col_078, value);
	}

	public void col_078(double value) {
		setConstNumber(offset + 239, $col_078, value);
	}


	public MCNumber col_079() {
		return getConstNumber(offset + 240, $col_079);
	}

	public void col_079(MCNumber value) {
		setConstNumber(offset + 240, $col_079, value);
	}

	public void col_079(int value) {
		setConstNumber(offset + 240, $col_079, value);
	}

	public void col_079(long value) {
		setConstNumber(offset + 240, $col_079, value);
	}

	public void col_079(float value) {
		setConstNumber(offset + 240, $col_079, value);
	}

	public void col_079(double value) {
		setConstNumber(offset + 240, $col_079, value);
	}


	public MCNumber col_080() {
		return getConstNumber(offset + 241, $col_080);
	}

	public void col_080(MCNumber value) {
		setConstNumber(offset + 241, $col_080, value);
	}

	public void col_080(int value) {
		setConstNumber(offset + 241, $col_080, value);
	}

	public void col_080(long value) {
		setConstNumber(offset + 241, $col_080, value);
	}

	public void col_080(float value) {
		setConstNumber(offset + 241, $col_080, value);
	}

	public void col_080(double value) {
		setConstNumber(offset + 241, $col_080, value);
	}


	public MCNumber col_081() {
		return getConstNumber(offset + 242, $col_081);
	}

	public void col_081(MCNumber value) {
		setConstNumber(offset + 242, $col_081, value);
	}

	public void col_081(int value) {
		setConstNumber(offset + 242, $col_081, value);
	}

	public void col_081(long value) {
		setConstNumber(offset + 242, $col_081, value);
	}

	public void col_081(float value) {
		setConstNumber(offset + 242, $col_081, value);
	}

	public void col_081(double value) {
		setConstNumber(offset + 242, $col_081, value);
	}


	public MCNumber col_082() {
		return getConstNumber(offset + 243, $col_082);
	}

	public void col_082(MCNumber value) {
		setConstNumber(offset + 243, $col_082, value);
	}

	public void col_082(int value) {
		setConstNumber(offset + 243, $col_082, value);
	}

	public void col_082(long value) {
		setConstNumber(offset + 243, $col_082, value);
	}

	public void col_082(float value) {
		setConstNumber(offset + 243, $col_082, value);
	}

	public void col_082(double value) {
		setConstNumber(offset + 243, $col_082, value);
	}


	public MCNumber col_083() {
		return getConstNumber(offset + 244, $col_083);
	}

	public void col_083(MCNumber value) {
		setConstNumber(offset + 244, $col_083, value);
	}

	public void col_083(int value) {
		setConstNumber(offset + 244, $col_083, value);
	}

	public void col_083(long value) {
		setConstNumber(offset + 244, $col_083, value);
	}

	public void col_083(float value) {
		setConstNumber(offset + 244, $col_083, value);
	}

	public void col_083(double value) {
		setConstNumber(offset + 244, $col_083, value);
	}


	public MCNumber col_084() {
		return getConstNumber(offset + 245, $col_084);
	}

	public void col_084(MCNumber value) {
		setConstNumber(offset + 245, $col_084, value);
	}

	public void col_084(int value) {
		setConstNumber(offset + 245, $col_084, value);
	}

	public void col_084(long value) {
		setConstNumber(offset + 245, $col_084, value);
	}

	public void col_084(float value) {
		setConstNumber(offset + 245, $col_084, value);
	}

	public void col_084(double value) {
		setConstNumber(offset + 245, $col_084, value);
	}


	public MCNumber col_085() {
		return getConstNumber(offset + 246, $col_085);
	}

	public void col_085(MCNumber value) {
		setConstNumber(offset + 246, $col_085, value);
	}

	public void col_085(int value) {
		setConstNumber(offset + 246, $col_085, value);
	}

	public void col_085(long value) {
		setConstNumber(offset + 246, $col_085, value);
	}

	public void col_085(float value) {
		setConstNumber(offset + 246, $col_085, value);
	}

	public void col_085(double value) {
		setConstNumber(offset + 246, $col_085, value);
	}


	public MCNumber col_086() {
		return getConstNumber(offset + 247, $col_086);
	}

	public void col_086(MCNumber value) {
		setConstNumber(offset + 247, $col_086, value);
	}

	public void col_086(int value) {
		setConstNumber(offset + 247, $col_086, value);
	}

	public void col_086(long value) {
		setConstNumber(offset + 247, $col_086, value);
	}

	public void col_086(float value) {
		setConstNumber(offset + 247, $col_086, value);
	}

	public void col_086(double value) {
		setConstNumber(offset + 247, $col_086, value);
	}


	public MCNumber col_087() {
		return getConstNumber(offset + 248, $col_087);
	}

	public void col_087(MCNumber value) {
		setConstNumber(offset + 248, $col_087, value);
	}

	public void col_087(int value) {
		setConstNumber(offset + 248, $col_087, value);
	}

	public void col_087(long value) {
		setConstNumber(offset + 248, $col_087, value);
	}

	public void col_087(float value) {
		setConstNumber(offset + 248, $col_087, value);
	}

	public void col_087(double value) {
		setConstNumber(offset + 248, $col_087, value);
	}


	public MCNumber col_088() {
		return getConstNumber(offset + 249, $col_088);
	}

	public void col_088(MCNumber value) {
		setConstNumber(offset + 249, $col_088, value);
	}

	public void col_088(int value) {
		setConstNumber(offset + 249, $col_088, value);
	}

	public void col_088(long value) {
		setConstNumber(offset + 249, $col_088, value);
	}

	public void col_088(float value) {
		setConstNumber(offset + 249, $col_088, value);
	}

	public void col_088(double value) {
		setConstNumber(offset + 249, $col_088, value);
	}


	public MCNumber col_089() {
		return getConstNumber(offset + 250, $col_089);
	}

	public void col_089(MCNumber value) {
		setConstNumber(offset + 250, $col_089, value);
	}

	public void col_089(int value) {
		setConstNumber(offset + 250, $col_089, value);
	}

	public void col_089(long value) {
		setConstNumber(offset + 250, $col_089, value);
	}

	public void col_089(float value) {
		setConstNumber(offset + 250, $col_089, value);
	}

	public void col_089(double value) {
		setConstNumber(offset + 250, $col_089, value);
	}


	public MCNumber col_090() {
		return getConstNumber(offset + 251, $col_090);
	}

	public void col_090(MCNumber value) {
		setConstNumber(offset + 251, $col_090, value);
	}

	public void col_090(int value) {
		setConstNumber(offset + 251, $col_090, value);
	}

	public void col_090(long value) {
		setConstNumber(offset + 251, $col_090, value);
	}

	public void col_090(float value) {
		setConstNumber(offset + 251, $col_090, value);
	}

	public void col_090(double value) {
		setConstNumber(offset + 251, $col_090, value);
	}


	public MCNumber col_091() {
		return getConstNumber(offset + 252, $col_091);
	}

	public void col_091(MCNumber value) {
		setConstNumber(offset + 252, $col_091, value);
	}

	public void col_091(int value) {
		setConstNumber(offset + 252, $col_091, value);
	}

	public void col_091(long value) {
		setConstNumber(offset + 252, $col_091, value);
	}

	public void col_091(float value) {
		setConstNumber(offset + 252, $col_091, value);
	}

	public void col_091(double value) {
		setConstNumber(offset + 252, $col_091, value);
	}


	public MCNumber col_092() {
		return getConstNumber(offset + 253, $col_092);
	}

	public void col_092(MCNumber value) {
		setConstNumber(offset + 253, $col_092, value);
	}

	public void col_092(int value) {
		setConstNumber(offset + 253, $col_092, value);
	}

	public void col_092(long value) {
		setConstNumber(offset + 253, $col_092, value);
	}

	public void col_092(float value) {
		setConstNumber(offset + 253, $col_092, value);
	}

	public void col_092(double value) {
		setConstNumber(offset + 253, $col_092, value);
	}


	public MCNumber col_093() {
		return getConstNumber(offset + 254, $col_093);
	}

	public void col_093(MCNumber value) {
		setConstNumber(offset + 254, $col_093, value);
	}

	public void col_093(int value) {
		setConstNumber(offset + 254, $col_093, value);
	}

	public void col_093(long value) {
		setConstNumber(offset + 254, $col_093, value);
	}

	public void col_093(float value) {
		setConstNumber(offset + 254, $col_093, value);
	}

	public void col_093(double value) {
		setConstNumber(offset + 254, $col_093, value);
	}


	public MCNumber col_094() {
		return getConstNumber(offset + 255, $col_094);
	}

	public void col_094(MCNumber value) {
		setConstNumber(offset + 255, $col_094, value);
	}

	public void col_094(int value) {
		setConstNumber(offset + 255, $col_094, value);
	}

	public void col_094(long value) {
		setConstNumber(offset + 255, $col_094, value);
	}

	public void col_094(float value) {
		setConstNumber(offset + 255, $col_094, value);
	}

	public void col_094(double value) {
		setConstNumber(offset + 255, $col_094, value);
	}


	public MCNumber col_095() {
		return getConstNumber(offset + 256, $col_095);
	}

	public void col_095(MCNumber value) {
		setConstNumber(offset + 256, $col_095, value);
	}

	public void col_095(int value) {
		setConstNumber(offset + 256, $col_095, value);
	}

	public void col_095(long value) {
		setConstNumber(offset + 256, $col_095, value);
	}

	public void col_095(float value) {
		setConstNumber(offset + 256, $col_095, value);
	}

	public void col_095(double value) {
		setConstNumber(offset + 256, $col_095, value);
	}


	public MCNumber col_096() {
		return getConstNumber(offset + 257, $col_096);
	}

	public void col_096(MCNumber value) {
		setConstNumber(offset + 257, $col_096, value);
	}

	public void col_096(int value) {
		setConstNumber(offset + 257, $col_096, value);
	}

	public void col_096(long value) {
		setConstNumber(offset + 257, $col_096, value);
	}

	public void col_096(float value) {
		setConstNumber(offset + 257, $col_096, value);
	}

	public void col_096(double value) {
		setConstNumber(offset + 257, $col_096, value);
	}


	public MCNumber col_097() {
		return getConstNumber(offset + 258, $col_097);
	}

	public void col_097(MCNumber value) {
		setConstNumber(offset + 258, $col_097, value);
	}

	public void col_097(int value) {
		setConstNumber(offset + 258, $col_097, value);
	}

	public void col_097(long value) {
		setConstNumber(offset + 258, $col_097, value);
	}

	public void col_097(float value) {
		setConstNumber(offset + 258, $col_097, value);
	}

	public void col_097(double value) {
		setConstNumber(offset + 258, $col_097, value);
	}


	public MCNumber col_098() {
		return getConstNumber(offset + 259, $col_098);
	}

	public void col_098(MCNumber value) {
		setConstNumber(offset + 259, $col_098, value);
	}

	public void col_098(int value) {
		setConstNumber(offset + 259, $col_098, value);
	}

	public void col_098(long value) {
		setConstNumber(offset + 259, $col_098, value);
	}

	public void col_098(float value) {
		setConstNumber(offset + 259, $col_098, value);
	}

	public void col_098(double value) {
		setConstNumber(offset + 259, $col_098, value);
	}


	public MCNumber col_099() {
		return getConstNumber(offset + 260, $col_099);
	}

	public void col_099(MCNumber value) {
		setConstNumber(offset + 260, $col_099, value);
	}

	public void col_099(int value) {
		setConstNumber(offset + 260, $col_099, value);
	}

	public void col_099(long value) {
		setConstNumber(offset + 260, $col_099, value);
	}

	public void col_099(float value) {
		setConstNumber(offset + 260, $col_099, value);
	}

	public void col_099(double value) {
		setConstNumber(offset + 260, $col_099, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
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
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
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
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			return chd_itm_nm();
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
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
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			return rec_eval_typ();
		}
		if ($rec_eval_typ_nm.equalsIgnoreCase(name)) {
			return rec_eval_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($comp_qty.equalsIgnoreCase(name)) {
			return comp_qty();
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			return odr_qty();
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($base_ttl_diff.equalsIgnoreCase(name)) {
			return base_ttl_diff();
		}
		if ($std_base_ttl.equalsIgnoreCase(name)) {
			return std_base_ttl();
		}
		if ($base_ttl.equalsIgnoreCase(name)) {
			return base_ttl();
		}
		if ($odr_base_ttl.equalsIgnoreCase(name)) {
			return odr_base_ttl();
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
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
		if ($so_act_amt.equalsIgnoreCase(name)) {
			return so_act_amt();
		}
		if ($margin.equalsIgnoreCase(name)) {
			return margin();
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			return amt_diff();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
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
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			return dummy_term();
		}
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
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
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
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
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
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			return chd_itm_nm();
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
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
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			return rec_eval_typ();
		}
		if ($rec_eval_typ_nm.equalsIgnoreCase(name)) {
			return rec_eval_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($comp_qty.equalsIgnoreCase(name)) {
			return comp_qty();
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			return odr_qty();
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($base_ttl_diff.equalsIgnoreCase(name)) {
			return base_ttl_diff();
		}
		if ($std_base_ttl.equalsIgnoreCase(name)) {
			return std_base_ttl();
		}
		if ($base_ttl.equalsIgnoreCase(name)) {
			return base_ttl();
		}
		if ($odr_base_ttl.equalsIgnoreCase(name)) {
			return odr_base_ttl();
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
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
		if ($so_act_amt.equalsIgnoreCase(name)) {
			return so_act_amt();
		}
		if ($margin.equalsIgnoreCase(name)) {
			return margin();
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			return amt_diff();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
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
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			return dummy_term();
		}
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
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
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
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
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
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			chd_itm_nm(value);
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			rec_eval_typ(value);
			return;
		}
		if ($rec_eval_typ_nm.equalsIgnoreCase(name)) {
			rec_eval_typ_nm(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($comp_qty.equalsIgnoreCase(name)) {
			comp_qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_ttl_diff.equalsIgnoreCase(name)) {
			base_ttl_diff(value);
			return;
		}
		if ($std_base_ttl.equalsIgnoreCase(name)) {
			std_base_ttl(value);
			return;
		}
		if ($base_ttl.equalsIgnoreCase(name)) {
			base_ttl(value);
			return;
		}
		if ($odr_base_ttl.equalsIgnoreCase(name)) {
			odr_base_ttl(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($margin.equalsIgnoreCase(name)) {
			margin(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($comp_qty.equalsIgnoreCase(name)) {
			comp_qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_ttl_diff.equalsIgnoreCase(name)) {
			base_ttl_diff(value);
			return;
		}
		if ($std_base_ttl.equalsIgnoreCase(name)) {
			std_base_ttl(value);
			return;
		}
		if ($base_ttl.equalsIgnoreCase(name)) {
			base_ttl(value);
			return;
		}
		if ($odr_base_ttl.equalsIgnoreCase(name)) {
			odr_base_ttl(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($margin.equalsIgnoreCase(name)) {
			margin(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($comp_qty.equalsIgnoreCase(name)) {
			comp_qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_ttl_diff.equalsIgnoreCase(name)) {
			base_ttl_diff(value);
			return;
		}
		if ($std_base_ttl.equalsIgnoreCase(name)) {
			std_base_ttl(value);
			return;
		}
		if ($base_ttl.equalsIgnoreCase(name)) {
			base_ttl(value);
			return;
		}
		if ($odr_base_ttl.equalsIgnoreCase(name)) {
			odr_base_ttl(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($margin.equalsIgnoreCase(name)) {
			margin(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($comp_qty.equalsIgnoreCase(name)) {
			comp_qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_ttl_diff.equalsIgnoreCase(name)) {
			base_ttl_diff(value);
			return;
		}
		if ($std_base_ttl.equalsIgnoreCase(name)) {
			std_base_ttl(value);
			return;
		}
		if ($base_ttl.equalsIgnoreCase(name)) {
			base_ttl(value);
			return;
		}
		if ($odr_base_ttl.equalsIgnoreCase(name)) {
			odr_base_ttl(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($margin.equalsIgnoreCase(name)) {
			margin(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($comp_qty.equalsIgnoreCase(name)) {
			comp_qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_ttl_diff.equalsIgnoreCase(name)) {
			base_ttl_diff(value);
			return;
		}
		if ($std_base_ttl.equalsIgnoreCase(name)) {
			std_base_ttl(value);
			return;
		}
		if ($base_ttl.equalsIgnoreCase(name)) {
			base_ttl(value);
			return;
		}
		if ($odr_base_ttl.equalsIgnoreCase(name)) {
			odr_base_ttl(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($margin.equalsIgnoreCase(name)) {
			margin(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
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
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			dummy_term(value);
			return;
		}
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
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
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
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
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
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			chd_itm_nm(value);
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			rec_eval_typ(value);
			return;
		}
		if ($rec_eval_typ_nm.equalsIgnoreCase(name)) {
			rec_eval_typ_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($comp_qty.equalsIgnoreCase(name)) {
			comp_qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_ttl_diff.equalsIgnoreCase(name)) {
			base_ttl_diff(value);
			return;
		}
		if ($std_base_ttl.equalsIgnoreCase(name)) {
			std_base_ttl(value);
			return;
		}
		if ($base_ttl.equalsIgnoreCase(name)) {
			base_ttl(value);
			return;
		}
		if ($odr_base_ttl.equalsIgnoreCase(name)) {
			odr_base_ttl(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($margin.equalsIgnoreCase(name)) {
			margin(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($comp_qty.equalsIgnoreCase(name)) {
			comp_qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_ttl_diff.equalsIgnoreCase(name)) {
			base_ttl_diff(value);
			return;
		}
		if ($std_base_ttl.equalsIgnoreCase(name)) {
			std_base_ttl(value);
			return;
		}
		if ($base_ttl.equalsIgnoreCase(name)) {
			base_ttl(value);
			return;
		}
		if ($odr_base_ttl.equalsIgnoreCase(name)) {
			odr_base_ttl(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($margin.equalsIgnoreCase(name)) {
			margin(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($comp_qty.equalsIgnoreCase(name)) {
			comp_qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_ttl_diff.equalsIgnoreCase(name)) {
			base_ttl_diff(value);
			return;
		}
		if ($std_base_ttl.equalsIgnoreCase(name)) {
			std_base_ttl(value);
			return;
		}
		if ($base_ttl.equalsIgnoreCase(name)) {
			base_ttl(value);
			return;
		}
		if ($odr_base_ttl.equalsIgnoreCase(name)) {
			odr_base_ttl(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($margin.equalsIgnoreCase(name)) {
			margin(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($comp_qty.equalsIgnoreCase(name)) {
			comp_qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_ttl_diff.equalsIgnoreCase(name)) {
			base_ttl_diff(value);
			return;
		}
		if ($std_base_ttl.equalsIgnoreCase(name)) {
			std_base_ttl(value);
			return;
		}
		if ($base_ttl.equalsIgnoreCase(name)) {
			base_ttl(value);
			return;
		}
		if ($odr_base_ttl.equalsIgnoreCase(name)) {
			odr_base_ttl(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($margin.equalsIgnoreCase(name)) {
			margin(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($comp_qty.equalsIgnoreCase(name)) {
			comp_qty(value);
			return;
		}
		if ($odr_qty.equalsIgnoreCase(name)) {
			odr_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_ttl_diff.equalsIgnoreCase(name)) {
			base_ttl_diff(value);
			return;
		}
		if ($std_base_ttl.equalsIgnoreCase(name)) {
			std_base_ttl(value);
			return;
		}
		if ($base_ttl.equalsIgnoreCase(name)) {
			base_ttl(value);
			return;
		}
		if ($odr_base_ttl.equalsIgnoreCase(name)) {
			odr_base_ttl(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($so_act_amt.equalsIgnoreCase(name)) {
			so_act_amt(value);
			return;
		}
		if ($margin.equalsIgnoreCase(name)) {
			margin(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
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
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			dummy_term(value);
			return;
		}
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



}

