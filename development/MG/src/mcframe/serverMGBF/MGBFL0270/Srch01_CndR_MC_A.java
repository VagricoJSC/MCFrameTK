package mcframe.serverMGBF.MGBFL0270;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
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
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public static final String $par_itm_typ = "par_itm_typ";
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
	 * Child item type 子品目区分.<p>
	 *
	 */
	public static final String $chd_itm_typ = "chd_itm_typ";
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
	 * Exclude other company's asset 他社資産除く.<p>
	 *
	 */
	public static final String $except_other_flg = "except_other_flg";
	/**
	 * Repurchase obligation type 買戻義務区分.<p>
	 *
	 */
	public static final String $repurc_obli_typ = "repurc_obli_typ";
	/**
	 * Exclude self supply item 自給品除く.<p>
	 *
	 */
	public static final String $except_ss_flg = "except_ss_flg";
	/**
	 * Mfg. purchase type 製造購買区分.<p>
	 *
	 */
	public static final String $mfg_purc_typ = "mfg_purc_typ";
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
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
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
	 * No accounting reason 会計理由無.<p>
	 *
	 */
	public static final String $no_ac_rsn_flg = "no_ac_rsn_flg";
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
	 * Without BP 取引先無.<p>
	 *
	 */
	public static final String $no_bp_flg = "no_bp_flg";
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
	 * Without PO No. 発注ＮＯ無.<p>
	 *
	 */
	public static final String $no_po_no_flg = "no_po_no_flg";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * No sales order No. 受注ＮＯ無.<p>
	 *
	 */
	public static final String $no_slo_no_flg = "no_slo_no_flg";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * No invoice No. インボイスＮＯ無.<p>
	 *
	 */
	public static final String $no_iv_no_flg = "no_iv_no_flg";
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
	 * WG ワーキンググループ.<p>
	 *
	 */
	public static final String $wg_flg = "wg_flg";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym_flg = "ym_flg";
	/**
	 * Management dept. 管理部門.<p>
	 *
	 */
	public static final String $mng_dpt_flg = "mng_dpt_flg";
	/**
	 * Parent item 親品目.<p>
	 *
	 */
	public static final String $par_itm_flg = "par_itm_flg";
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public static final String $par_itm_typ_flg = "par_itm_typ_flg";
	/**
	 * Parent item type details 親品目区分詳細.<p>
	 *
	 */
	public static final String $par_itm_typ_d_flg = "par_itm_typ_d_flg";
	/**
	 * Parent item journal 親品目仕訳.<p>
	 *
	 */
	public static final String $par_itm_jnl_flg = "par_itm_jnl_flg";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no_flg = "itm_mfg_inst_no_flg";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no_flg = "mfg_act_no_flg";
	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public static final String $par_lot_flg = "par_lot_flg";
	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public static final String $par_sublot_flg = "par_sublot_flg";
	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public static final String $par_sno1_flg = "par_sno1_flg";
	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public static final String $par_sno2_flg = "par_sno2_flg";
	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public static final String $par_sno3_flg = "par_sno3_flg";
	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public static final String $par_sno4_flg = "par_sno4_flg";
	/**
	 * Parent asset type 親資産区分.<p>
	 *
	 */
	public static final String $par_asst_typ_flg = "par_asst_typ_flg";
	/**
	 * Parent item classification 1 親品目分類１.<p>
	 *
	 */
	public static final String $par_itm_grp_flg1 = "par_itm_grp_flg1";
	/**
	 * Parent item classification 2 親品目分類２.<p>
	 *
	 */
	public static final String $par_itm_grp_flg2 = "par_itm_grp_flg2";
	/**
	 * Parent item classification 3 親品目分類３.<p>
	 *
	 */
	public static final String $par_itm_grp_flg3 = "par_itm_grp_flg3";
	/**
	 * Parent item classification 4 親品目分類４.<p>
	 *
	 */
	public static final String $par_itm_grp_flg4 = "par_itm_grp_flg4";
	/**
	 * Parent item classification 5 親品目分類５.<p>
	 *
	 */
	public static final String $par_itm_grp_flg5 = "par_itm_grp_flg5";
	/**
	 * Parent item classification 6 親品目分類６.<p>
	 *
	 */
	public static final String $par_itm_grp_flg6 = "par_itm_grp_flg6";
	/**
	 * Parent item classification 7 親品目分類７.<p>
	 *
	 */
	public static final String $par_itm_grp_flg7 = "par_itm_grp_flg7";
	/**
	 * Parent item classification 8 親品目分類８.<p>
	 *
	 */
	public static final String $par_itm_grp_flg8 = "par_itm_grp_flg8";
	/**
	 * Parent item classification 9 親品目分類９.<p>
	 *
	 */
	public static final String $par_itm_grp_flg9 = "par_itm_grp_flg9";
	/**
	 * Parent item classification 10 親品目分類１０.<p>
	 *
	 */
	public static final String $par_itm_grp_flg10 = "par_itm_grp_flg10";
	/**
	 * BP 取引先.<p>
	 *
	 */
	public static final String $bp_flg = "bp_flg";
	/**
	 * Country 国.<p>
	 *
	 */
	public static final String $cntry_flg = "cntry_flg";
	/**
	 * Region 地域.<p>
	 *
	 */
	public static final String $area_flg = "area_flg";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no_flg = "po_no_flg";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no_flg = "slo_no_flg";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no_flg = "iv_no_flg";
	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public static final String $comp_qty_flg = "comp_qty_flg";
	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public static final String $odr_qty_flg = "odr_qty_flg";
	/**
	 * BP classification 1 取引先分類１.<p>
	 *
	 */
	public static final String $bp_grp_flg1 = "bp_grp_flg1";
	/**
	 * BP classification 2 取引先分類２.<p>
	 *
	 */
	public static final String $bp_grp_flg2 = "bp_grp_flg2";
	/**
	 * BP classification 3 取引先分類３.<p>
	 *
	 */
	public static final String $bp_grp_flg3 = "bp_grp_flg3";
	/**
	 * BP classification 4 取引先分類４.<p>
	 *
	 */
	public static final String $bp_grp_flg4 = "bp_grp_flg4";
	/**
	 * BP classification 5 取引先分類５.<p>
	 *
	 */
	public static final String $bp_grp_flg5 = "bp_grp_flg5";
	/**
	 * BP classification 6 取引先分類６.<p>
	 *
	 */
	public static final String $bp_grp_flg6 = "bp_grp_flg6";
	/**
	 * BP classification 7 取引先分類７.<p>
	 *
	 */
	public static final String $bp_grp_flg7 = "bp_grp_flg7";
	/**
	 * BP classification 8 取引先分類８.<p>
	 *
	 */
	public static final String $bp_grp_flg8 = "bp_grp_flg8";
	/**
	 * BP classification 9 取引先分類９.<p>
	 *
	 */
	public static final String $bp_grp_flg9 = "bp_grp_flg9";
	/**
	 * BP classification 10 取引先分類１０.<p>
	 *
	 */
	public static final String $bp_grp_flg10 = "bp_grp_flg10";
	/**
	 * Input dept. 投入部門.<p>
	 *
	 */
	public static final String $inpt_dpt_flg = "inpt_dpt_flg";
	/**
	 * Child item 子品目.<p>
	 *
	 */
	public static final String $chd_itm_flg = "chd_itm_flg";
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public static final String $chd_itm_typ_flg = "chd_itm_typ_flg";
	/**
	 * Child item type details 子品目区分詳細.<p>
	 *
	 */
	public static final String $chd_itm_typ_d_flg = "chd_itm_typ_d_flg";
	/**
	 * Child item journal 子品目仕訳.<p>
	 *
	 */
	public static final String $chd_itm_jnl_flg = "chd_itm_jnl_flg";
	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public static final String $chd_lot_flg = "chd_lot_flg";
	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public static final String $chd_sublot_flg = "chd_sublot_flg";
	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public static final String $chd_sno1_flg = "chd_sno1_flg";
	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public static final String $chd_sno2_flg = "chd_sno2_flg";
	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public static final String $chd_sno3_flg = "chd_sno3_flg";
	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public static final String $chd_sno4_flg = "chd_sno4_flg";
	/**
	 * Child asset type 子資産区分.<p>
	 *
	 */
	public static final String $chd_asst_typ_flg = "chd_asst_typ_flg";
	/**
	 * Child item classification 1 子品目分類１.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg1 = "chd_itm_grp_flg1";
	/**
	 * Child item classification 2 子品目分類２.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg2 = "chd_itm_grp_flg2";
	/**
	 * Child item classification 3 子品目分類３.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg3 = "chd_itm_grp_flg3";
	/**
	 * Child item classification 4 子品目分類４.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg4 = "chd_itm_grp_flg4";
	/**
	 * Child item classification 5 子品目分類５.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg5 = "chd_itm_grp_flg5";
	/**
	 * Child item classification 6 子品目分類６.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg6 = "chd_itm_grp_flg6";
	/**
	 * Child item classification 7 子品目分類７.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg7 = "chd_itm_grp_flg7";
	/**
	 * Child item classification 8 子品目分類８.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg8 = "chd_itm_grp_flg8";
	/**
	 * Child item classification 9 子品目分類９.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg9 = "chd_itm_grp_flg9";
	/**
	 * Child item classification 10 子品目分類１０.<p>
	 *
	 */
	public static final String $chd_itm_grp_flg10 = "chd_itm_grp_flg10";
	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public static final String $site_flg = "site_flg";
	/**
	 * Location 場所.<p>
	 *
	 */
	public static final String $loc_flg = "loc_flg";
	/**
	 * Line ライン.<p>
	 *
	 */
	public static final String $str_ln_flg = "str_ln_flg";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no_flg = "oper_act_no_flg";
	/**
	 * Operation 工程.<p>
	 *
	 */
	public static final String $oper_flg = "oper_flg";
	/**
	 * Operation result No. & Operation 工程実績ＮＯ＆工程.<p>
	 *
	 */
	public static final String $disp_oper_seq_flg = "disp_oper_seq_flg";
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public static final String $ac_slip_typ_flg = "ac_slip_typ_flg";
	/**
	 * Accounting reason 会計理由.<p>
	 *
	 */
	public static final String $ac_rsn_flg = "ac_rsn_flg";


	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta par_itm_typ_META = createCommonMeta($par_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta par_itm_typ_d_cd_META = createCommonMeta($par_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta par_itm_typ_d_nm_META = createCommonMeta($par_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta par_itm_jnl_cd_META = createCommonMeta($par_itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta par_itm_jnl_nm_META = createCommonMeta($par_itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta par_itm_nm_META = createCommonMeta($par_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta par_lot_no_META = createCommonMeta($par_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta par_sublot_no_META = createCommonMeta($par_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta par_sno1_META = createCommonMeta($par_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta par_sno2_META = createCommonMeta($par_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta par_sno3_META = createCommonMeta($par_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta par_sno4_META = createCommonMeta($par_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta par_asst_typ_META = createCommonMeta($par_asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
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
	public static final MCMeta inpt_dpt_cd_META = createCommonMeta($inpt_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta inpt_dpt_nm_META = createCommonMeta($inpt_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta chd_itm_typ_META = createCommonMeta($chd_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta chd_itm_typ_d_cd_META = createCommonMeta($chd_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta chd_itm_typ_d_nm_META = createCommonMeta($chd_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta chd_itm_jnl_cd_META = createCommonMeta($chd_itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta chd_itm_jnl_nm_META = createCommonMeta($chd_itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta chd_itm_cd_META = createCommonMeta($chd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta chd_itm_sub1_META = createCommonMeta($chd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta chd_itm_sub2_META = createCommonMeta($chd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta chd_itm_sub3_META = createCommonMeta($chd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta chd_itm_nm_META = createCommonMeta($chd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta chd_lot_no_META = createCommonMeta($chd_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta chd_sublot_no_META = createCommonMeta($chd_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta chd_sno1_META = createCommonMeta($chd_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta chd_sno2_META = createCommonMeta($chd_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta chd_sno3_META = createCommonMeta($chd_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta chd_sno4_META = createCommonMeta($chd_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta chd_asst_typ_META = createCommonMeta($chd_asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta except_other_flg_META = createCommonMeta($except_other_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta repurc_obli_typ_META = createCommonMeta($repurc_obli_typ, mcframe.commonMG.meta.MG_META.REPURC_OBLI_TYP);
	public static final MCMeta except_ss_flg_META = createCommonMeta($except_ss_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_purc_typ_META = createCommonMeta($mfg_purc_typ, mcframe.commonMA.meta.MA_META.MFG_PURC_TYP);
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
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta no_ac_rsn_flg_META = createCommonMeta($no_ac_rsn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta no_bp_flg_META = createCommonMeta($no_bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta area_nm_META = createCommonMeta($area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta no_po_no_flg_META = createCommonMeta($no_po_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta no_slo_no_flg_META = createCommonMeta($no_slo_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta no_iv_no_flg_META = createCommonMeta($no_iv_no_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta wg_flg_META = createCommonMeta($wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ym_flg_META = createCommonMeta($ym_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mng_dpt_flg_META = createCommonMeta($mng_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_flg_META = createCommonMeta($par_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_typ_flg_META = createCommonMeta($par_itm_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_typ_d_flg_META = createCommonMeta($par_itm_typ_d_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_jnl_flg_META = createCommonMeta($par_itm_jnl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_mfg_inst_no_flg_META = createCommonMeta($itm_mfg_inst_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_act_no_flg_META = createCommonMeta($mfg_act_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_lot_flg_META = createCommonMeta($par_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_sublot_flg_META = createCommonMeta($par_sublot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_sno1_flg_META = createCommonMeta($par_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_sno2_flg_META = createCommonMeta($par_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_sno3_flg_META = createCommonMeta($par_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_sno4_flg_META = createCommonMeta($par_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_asst_typ_flg_META = createCommonMeta($par_asst_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_flg1_META = createCommonMeta($par_itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_flg2_META = createCommonMeta($par_itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_flg3_META = createCommonMeta($par_itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_flg4_META = createCommonMeta($par_itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_flg5_META = createCommonMeta($par_itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_flg6_META = createCommonMeta($par_itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_flg7_META = createCommonMeta($par_itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_flg8_META = createCommonMeta($par_itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_flg9_META = createCommonMeta($par_itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_flg10_META = createCommonMeta($par_itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_flg_META = createCommonMeta($bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_flg_META = createCommonMeta($cntry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta area_flg_META = createCommonMeta($area_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_no_flg_META = createCommonMeta($po_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_no_flg_META = createCommonMeta($slo_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_flg_META = createCommonMeta($iv_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_qty_flg_META = createCommonMeta($comp_qty_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta odr_qty_flg_META = createCommonMeta($odr_qty_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg1_META = createCommonMeta($bp_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg2_META = createCommonMeta($bp_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg3_META = createCommonMeta($bp_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg4_META = createCommonMeta($bp_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg5_META = createCommonMeta($bp_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg6_META = createCommonMeta($bp_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg7_META = createCommonMeta($bp_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg8_META = createCommonMeta($bp_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg9_META = createCommonMeta($bp_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg10_META = createCommonMeta($bp_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_dpt_flg_META = createCommonMeta($inpt_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_flg_META = createCommonMeta($chd_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_typ_flg_META = createCommonMeta($chd_itm_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_typ_d_flg_META = createCommonMeta($chd_itm_typ_d_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_jnl_flg_META = createCommonMeta($chd_itm_jnl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_lot_flg_META = createCommonMeta($chd_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_sublot_flg_META = createCommonMeta($chd_sublot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_sno1_flg_META = createCommonMeta($chd_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_sno2_flg_META = createCommonMeta($chd_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_sno3_flg_META = createCommonMeta($chd_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_sno4_flg_META = createCommonMeta($chd_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_asst_typ_flg_META = createCommonMeta($chd_asst_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_flg1_META = createCommonMeta($chd_itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_flg2_META = createCommonMeta($chd_itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_flg3_META = createCommonMeta($chd_itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_flg4_META = createCommonMeta($chd_itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_flg5_META = createCommonMeta($chd_itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_flg6_META = createCommonMeta($chd_itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_flg7_META = createCommonMeta($chd_itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_flg8_META = createCommonMeta($chd_itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_flg9_META = createCommonMeta($chd_itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_grp_flg10_META = createCommonMeta($chd_itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_flg_META = createCommonMeta($site_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_flg_META = createCommonMeta($loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_flg_META = createCommonMeta($str_ln_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_act_no_flg_META = createCommonMeta($oper_act_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_flg_META = createCommonMeta($oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_oper_seq_flg_META = createCommonMeta($disp_oper_seq_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_slip_typ_flg_META = createCommonMeta($ac_slip_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_rsn_flg_META = createCommonMeta($ac_rsn_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_no_META,
			wg_cd_META,
			wg_nm_META,
			ym_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			par_itm_typ_META,
			par_itm_typ_d_cd_META,
			par_itm_typ_d_nm_META,
			par_itm_jnl_cd_META,
			par_itm_jnl_nm_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			par_itm_nm_META,
			itm_mfg_inst_no_META,
			mfg_act_no_META,
			par_lot_no_META,
			par_sublot_no_META,
			par_sno1_META,
			par_sno2_META,
			par_sno3_META,
			par_sno4_META,
			par_asst_typ_META,
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
			inpt_dpt_cd_META,
			inpt_dpt_nm_META,
			chd_itm_typ_META,
			chd_itm_typ_d_cd_META,
			chd_itm_typ_d_nm_META,
			chd_itm_jnl_cd_META,
			chd_itm_jnl_nm_META,
			chd_itm_cd_META,
			chd_itm_sub1_META,
			chd_itm_sub2_META,
			chd_itm_sub3_META,
			chd_itm_nm_META,
			chd_lot_no_META,
			chd_sublot_no_META,
			chd_sno1_META,
			chd_sno2_META,
			chd_sno3_META,
			chd_sno4_META,
			chd_asst_typ_META,
			except_other_flg_META,
			repurc_obli_typ_META,
			except_ss_flg_META,
			mfg_purc_typ_META,
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
			site_cd_META,
			site_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			oper_cd_META,
			oper_nm_META,
			oper_act_no_META,
			ac_slip_typ_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			no_ac_rsn_flg_META,
			bp_cd_META,
			bp_nm_META,
			no_bp_flg_META,
			cntry_cd_META,
			cntry_nm_META,
			area_cd_META,
			area_nm_META,
			po_no_META,
			no_po_no_flg_META,
			slo_no_META,
			no_slo_no_flg_META,
			iv_no_META,
			no_iv_no_flg_META,
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
			wg_flg_META,
			ym_flg_META,
			mng_dpt_flg_META,
			par_itm_flg_META,
			par_itm_typ_flg_META,
			par_itm_typ_d_flg_META,
			par_itm_jnl_flg_META,
			itm_mfg_inst_no_flg_META,
			mfg_act_no_flg_META,
			par_lot_flg_META,
			par_sublot_flg_META,
			par_sno1_flg_META,
			par_sno2_flg_META,
			par_sno3_flg_META,
			par_sno4_flg_META,
			par_asst_typ_flg_META,
			par_itm_grp_flg1_META,
			par_itm_grp_flg2_META,
			par_itm_grp_flg3_META,
			par_itm_grp_flg4_META,
			par_itm_grp_flg5_META,
			par_itm_grp_flg6_META,
			par_itm_grp_flg7_META,
			par_itm_grp_flg8_META,
			par_itm_grp_flg9_META,
			par_itm_grp_flg10_META,
			bp_flg_META,
			cntry_flg_META,
			area_flg_META,
			po_no_flg_META,
			slo_no_flg_META,
			iv_no_flg_META,
			comp_qty_flg_META,
			odr_qty_flg_META,
			bp_grp_flg1_META,
			bp_grp_flg2_META,
			bp_grp_flg3_META,
			bp_grp_flg4_META,
			bp_grp_flg5_META,
			bp_grp_flg6_META,
			bp_grp_flg7_META,
			bp_grp_flg8_META,
			bp_grp_flg9_META,
			bp_grp_flg10_META,
			inpt_dpt_flg_META,
			chd_itm_flg_META,
			chd_itm_typ_flg_META,
			chd_itm_typ_d_flg_META,
			chd_itm_jnl_flg_META,
			chd_lot_flg_META,
			chd_sublot_flg_META,
			chd_sno1_flg_META,
			chd_sno2_flg_META,
			chd_sno3_flg_META,
			chd_sno4_flg_META,
			chd_asst_typ_flg_META,
			chd_itm_grp_flg1_META,
			chd_itm_grp_flg2_META,
			chd_itm_grp_flg3_META,
			chd_itm_grp_flg4_META,
			chd_itm_grp_flg5_META,
			chd_itm_grp_flg6_META,
			chd_itm_grp_flg7_META,
			chd_itm_grp_flg8_META,
			chd_itm_grp_flg9_META,
			chd_itm_grp_flg10_META,
			site_flg_META,
			loc_flg_META,
			str_ln_flg_META,
			oper_act_no_flg_META,
			oper_flg_META,
			disp_oper_seq_flg_META,
			ac_slip_typ_flg_META,
			ac_rsn_flg_META
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
			}
		)),
		new MCExtMap.Entry($$FLG_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$COL_SQL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SUM_SQL, new MCExtList(
			new String[][]{
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}


	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 1, $calc_no);
	}

	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 1, $calc_no, value);
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
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return getConstString(offset + 7, $par_itm_typ);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		setConstString(offset + 7, $par_itm_typ, value);
	}


	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return getConstString(offset + 8, $par_itm_typ_d_cd);
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		setConstString(offset + 8, $par_itm_typ_d_cd, value);
	}


	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public String par_itm_typ_d_nm() {
		return getConstString(offset + 9, $par_itm_typ_d_nm);
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public void par_itm_typ_d_nm(String value) {
		setConstString(offset + 9, $par_itm_typ_d_nm, value);
	}


	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public String par_itm_jnl_cd() {
		return getConstString(offset + 10, $par_itm_jnl_cd);
	}

	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public void par_itm_jnl_cd(String value) {
		setConstString(offset + 10, $par_itm_jnl_cd, value);
	}


	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public String par_itm_jnl_nm() {
		return getConstString(offset + 11, $par_itm_jnl_nm);
	}

	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public void par_itm_jnl_nm(String value) {
		setConstString(offset + 11, $par_itm_jnl_nm, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 12, $par_itm_cd);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 12, $par_itm_cd, value);
	}


	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 13, $par_itm_sub1);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 13, $par_itm_sub1, value);
	}


	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 14, $par_itm_sub2);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 14, $par_itm_sub2, value);
	}


	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 15, $par_itm_sub3);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 15, $par_itm_sub3, value);
	}


	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return getConstString(offset + 16, $par_itm_nm);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		setConstString(offset + 16, $par_itm_nm, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 17, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 17, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 18, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 18, $mfg_act_no, value);
	}


	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public String par_lot_no() {
		return getConstString(offset + 19, $par_lot_no);
	}

	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public void par_lot_no(String value) {
		setConstString(offset + 19, $par_lot_no, value);
	}


	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public String par_sublot_no() {
		return getConstString(offset + 20, $par_sublot_no);
	}

	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public void par_sublot_no(String value) {
		setConstString(offset + 20, $par_sublot_no, value);
	}


	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public String par_sno1() {
		return getConstString(offset + 21, $par_sno1);
	}

	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public void par_sno1(String value) {
		setConstString(offset + 21, $par_sno1, value);
	}


	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public String par_sno2() {
		return getConstString(offset + 22, $par_sno2);
	}

	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public void par_sno2(String value) {
		setConstString(offset + 22, $par_sno2, value);
	}


	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public String par_sno3() {
		return getConstString(offset + 23, $par_sno3);
	}

	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public void par_sno3(String value) {
		setConstString(offset + 23, $par_sno3, value);
	}


	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public String par_sno4() {
		return getConstString(offset + 24, $par_sno4);
	}

	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public void par_sno4(String value) {
		setConstString(offset + 24, $par_sno4, value);
	}


	/**
	 * Parent asset type 親資産区分.<p>
	 *
	 */
	public String par_asst_typ() {
		return getConstString(offset + 25, $par_asst_typ);
	}

	/**
	 * Parent asset type 親資産区分.<p>
	 *
	 */
	public void par_asst_typ(String value) {
		setConstString(offset + 25, $par_asst_typ, value);
	}


	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public String par_itm_grp_cd1() {
		return getConstString(offset + 26, $par_itm_grp_cd1);
	}

	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public void par_itm_grp_cd1(String value) {
		setConstString(offset + 26, $par_itm_grp_cd1, value);
	}


	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public String par_itm_grp_nm1() {
		return getConstString(offset + 27, $par_itm_grp_nm1);
	}

	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public void par_itm_grp_nm1(String value) {
		setConstString(offset + 27, $par_itm_grp_nm1, value);
	}


	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public String par_itm_grp_cd2() {
		return getConstString(offset + 28, $par_itm_grp_cd2);
	}

	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public void par_itm_grp_cd2(String value) {
		setConstString(offset + 28, $par_itm_grp_cd2, value);
	}


	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public String par_itm_grp_nm2() {
		return getConstString(offset + 29, $par_itm_grp_nm2);
	}

	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public void par_itm_grp_nm2(String value) {
		setConstString(offset + 29, $par_itm_grp_nm2, value);
	}


	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public String par_itm_grp_cd3() {
		return getConstString(offset + 30, $par_itm_grp_cd3);
	}

	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public void par_itm_grp_cd3(String value) {
		setConstString(offset + 30, $par_itm_grp_cd3, value);
	}


	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public String par_itm_grp_nm3() {
		return getConstString(offset + 31, $par_itm_grp_nm3);
	}

	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public void par_itm_grp_nm3(String value) {
		setConstString(offset + 31, $par_itm_grp_nm3, value);
	}


	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public String par_itm_grp_cd4() {
		return getConstString(offset + 32, $par_itm_grp_cd4);
	}

	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public void par_itm_grp_cd4(String value) {
		setConstString(offset + 32, $par_itm_grp_cd4, value);
	}


	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public String par_itm_grp_nm4() {
		return getConstString(offset + 33, $par_itm_grp_nm4);
	}

	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public void par_itm_grp_nm4(String value) {
		setConstString(offset + 33, $par_itm_grp_nm4, value);
	}


	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public String par_itm_grp_cd5() {
		return getConstString(offset + 34, $par_itm_grp_cd5);
	}

	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public void par_itm_grp_cd5(String value) {
		setConstString(offset + 34, $par_itm_grp_cd5, value);
	}


	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public String par_itm_grp_nm5() {
		return getConstString(offset + 35, $par_itm_grp_nm5);
	}

	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public void par_itm_grp_nm5(String value) {
		setConstString(offset + 35, $par_itm_grp_nm5, value);
	}


	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public String par_itm_grp_cd6() {
		return getConstString(offset + 36, $par_itm_grp_cd6);
	}

	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public void par_itm_grp_cd6(String value) {
		setConstString(offset + 36, $par_itm_grp_cd6, value);
	}


	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public String par_itm_grp_nm6() {
		return getConstString(offset + 37, $par_itm_grp_nm6);
	}

	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public void par_itm_grp_nm6(String value) {
		setConstString(offset + 37, $par_itm_grp_nm6, value);
	}


	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public String par_itm_grp_cd7() {
		return getConstString(offset + 38, $par_itm_grp_cd7);
	}

	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public void par_itm_grp_cd7(String value) {
		setConstString(offset + 38, $par_itm_grp_cd7, value);
	}


	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public String par_itm_grp_nm7() {
		return getConstString(offset + 39, $par_itm_grp_nm7);
	}

	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public void par_itm_grp_nm7(String value) {
		setConstString(offset + 39, $par_itm_grp_nm7, value);
	}


	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public String par_itm_grp_cd8() {
		return getConstString(offset + 40, $par_itm_grp_cd8);
	}

	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public void par_itm_grp_cd8(String value) {
		setConstString(offset + 40, $par_itm_grp_cd8, value);
	}


	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public String par_itm_grp_nm8() {
		return getConstString(offset + 41, $par_itm_grp_nm8);
	}

	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public void par_itm_grp_nm8(String value) {
		setConstString(offset + 41, $par_itm_grp_nm8, value);
	}


	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public String par_itm_grp_cd9() {
		return getConstString(offset + 42, $par_itm_grp_cd9);
	}

	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public void par_itm_grp_cd9(String value) {
		setConstString(offset + 42, $par_itm_grp_cd9, value);
	}


	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public String par_itm_grp_nm9() {
		return getConstString(offset + 43, $par_itm_grp_nm9);
	}

	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public void par_itm_grp_nm9(String value) {
		setConstString(offset + 43, $par_itm_grp_nm9, value);
	}


	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public String par_itm_grp_cd10() {
		return getConstString(offset + 44, $par_itm_grp_cd10);
	}

	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public void par_itm_grp_cd10(String value) {
		setConstString(offset + 44, $par_itm_grp_cd10, value);
	}


	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public String par_itm_grp_nm10() {
		return getConstString(offset + 45, $par_itm_grp_nm10);
	}

	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public void par_itm_grp_nm10(String value) {
		setConstString(offset + 45, $par_itm_grp_nm10, value);
	}


	/**
	 * Input dept. cd. 投入部門ＣＤ.<p>
	 *
	 */
	public String inpt_dpt_cd() {
		return getConstString(offset + 46, $inpt_dpt_cd);
	}

	/**
	 * Input dept. cd. 投入部門ＣＤ.<p>
	 *
	 */
	public void inpt_dpt_cd(String value) {
		setConstString(offset + 46, $inpt_dpt_cd, value);
	}


	/**
	 * Input dept. name 投入部門名.<p>
	 *
	 */
	public String inpt_dpt_nm() {
		return getConstString(offset + 47, $inpt_dpt_nm);
	}

	/**
	 * Input dept. name 投入部門名.<p>
	 *
	 */
	public void inpt_dpt_nm(String value) {
		setConstString(offset + 47, $inpt_dpt_nm, value);
	}


	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return getConstString(offset + 48, $chd_itm_typ);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		setConstString(offset + 48, $chd_itm_typ, value);
	}


	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return getConstString(offset + 49, $chd_itm_typ_d_cd);
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		setConstString(offset + 49, $chd_itm_typ_d_cd, value);
	}


	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public String chd_itm_typ_d_nm() {
		return getConstString(offset + 50, $chd_itm_typ_d_nm);
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public void chd_itm_typ_d_nm(String value) {
		setConstString(offset + 50, $chd_itm_typ_d_nm, value);
	}


	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public String chd_itm_jnl_cd() {
		return getConstString(offset + 51, $chd_itm_jnl_cd);
	}

	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public void chd_itm_jnl_cd(String value) {
		setConstString(offset + 51, $chd_itm_jnl_cd, value);
	}


	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public String chd_itm_jnl_nm() {
		return getConstString(offset + 52, $chd_itm_jnl_nm);
	}

	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public void chd_itm_jnl_nm(String value) {
		setConstString(offset + 52, $chd_itm_jnl_nm, value);
	}


	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return getConstString(offset + 53, $chd_itm_cd);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		setConstString(offset + 53, $chd_itm_cd, value);
	}


	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return getConstString(offset + 54, $chd_itm_sub1);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		setConstString(offset + 54, $chd_itm_sub1, value);
	}


	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return getConstString(offset + 55, $chd_itm_sub2);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		setConstString(offset + 55, $chd_itm_sub2, value);
	}


	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return getConstString(offset + 56, $chd_itm_sub3);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		setConstString(offset + 56, $chd_itm_sub3, value);
	}


	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return getConstString(offset + 57, $chd_itm_nm);
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		setConstString(offset + 57, $chd_itm_nm, value);
	}


	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public String chd_lot_no() {
		return getConstString(offset + 58, $chd_lot_no);
	}

	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public void chd_lot_no(String value) {
		setConstString(offset + 58, $chd_lot_no, value);
	}


	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public String chd_sublot_no() {
		return getConstString(offset + 59, $chd_sublot_no);
	}

	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public void chd_sublot_no(String value) {
		setConstString(offset + 59, $chd_sublot_no, value);
	}


	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public String chd_sno1() {
		return getConstString(offset + 60, $chd_sno1);
	}

	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public void chd_sno1(String value) {
		setConstString(offset + 60, $chd_sno1, value);
	}


	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public String chd_sno2() {
		return getConstString(offset + 61, $chd_sno2);
	}

	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public void chd_sno2(String value) {
		setConstString(offset + 61, $chd_sno2, value);
	}


	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public String chd_sno3() {
		return getConstString(offset + 62, $chd_sno3);
	}

	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public void chd_sno3(String value) {
		setConstString(offset + 62, $chd_sno3, value);
	}


	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public String chd_sno4() {
		return getConstString(offset + 63, $chd_sno4);
	}

	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public void chd_sno4(String value) {
		setConstString(offset + 63, $chd_sno4, value);
	}


	/**
	 * Child asset type 子資産区分.<p>
	 *
	 */
	public String chd_asst_typ() {
		return getConstString(offset + 64, $chd_asst_typ);
	}

	/**
	 * Child asset type 子資産区分.<p>
	 *
	 */
	public void chd_asst_typ(String value) {
		setConstString(offset + 64, $chd_asst_typ, value);
	}


	/**
	 * Exclude other company's asset 他社資産除く.<p>
	 *
	 */
	public boolean except_other_flg() {
		return getConstBoolean(offset + 65, $except_other_flg);
	}

	/**
	 * Exclude other company's asset 他社資産除く.<p>
	 *
	 */
	public void except_other_flg(boolean value) {
		setConstBoolean(offset + 65, $except_other_flg, value);
	}


	/**
	 * Repurchase obligation type 買戻義務区分.<p>
	 *
	 */
	public String repurc_obli_typ() {
		return getConstString(offset + 66, $repurc_obli_typ);
	}

	/**
	 * Repurchase obligation type 買戻義務区分.<p>
	 *
	 */
	public void repurc_obli_typ(String value) {
		setConstString(offset + 66, $repurc_obli_typ, value);
	}


	/**
	 * Exclude self supply item 自給品除く.<p>
	 *
	 */
	public boolean except_ss_flg() {
		return getConstBoolean(offset + 67, $except_ss_flg);
	}

	/**
	 * Exclude self supply item 自給品除く.<p>
	 *
	 */
	public void except_ss_flg(boolean value) {
		setConstBoolean(offset + 67, $except_ss_flg, value);
	}


	/**
	 * Mfg. purchase type 製造購買区分.<p>
	 *
	 */
	public String mfg_purc_typ() {
		return getConstString(offset + 68, $mfg_purc_typ);
	}

	/**
	 * Mfg. purchase type 製造購買区分.<p>
	 *
	 */
	public void mfg_purc_typ(String value) {
		setConstString(offset + 68, $mfg_purc_typ, value);
	}


	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public String chd_itm_grp_cd1() {
		return getConstString(offset + 69, $chd_itm_grp_cd1);
	}

	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public void chd_itm_grp_cd1(String value) {
		setConstString(offset + 69, $chd_itm_grp_cd1, value);
	}


	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public String chd_itm_grp_nm1() {
		return getConstString(offset + 70, $chd_itm_grp_nm1);
	}

	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public void chd_itm_grp_nm1(String value) {
		setConstString(offset + 70, $chd_itm_grp_nm1, value);
	}


	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public String chd_itm_grp_cd2() {
		return getConstString(offset + 71, $chd_itm_grp_cd2);
	}

	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public void chd_itm_grp_cd2(String value) {
		setConstString(offset + 71, $chd_itm_grp_cd2, value);
	}


	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public String chd_itm_grp_nm2() {
		return getConstString(offset + 72, $chd_itm_grp_nm2);
	}

	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public void chd_itm_grp_nm2(String value) {
		setConstString(offset + 72, $chd_itm_grp_nm2, value);
	}


	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public String chd_itm_grp_cd3() {
		return getConstString(offset + 73, $chd_itm_grp_cd3);
	}

	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public void chd_itm_grp_cd3(String value) {
		setConstString(offset + 73, $chd_itm_grp_cd3, value);
	}


	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public String chd_itm_grp_nm3() {
		return getConstString(offset + 74, $chd_itm_grp_nm3);
	}

	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public void chd_itm_grp_nm3(String value) {
		setConstString(offset + 74, $chd_itm_grp_nm3, value);
	}


	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public String chd_itm_grp_cd4() {
		return getConstString(offset + 75, $chd_itm_grp_cd4);
	}

	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public void chd_itm_grp_cd4(String value) {
		setConstString(offset + 75, $chd_itm_grp_cd4, value);
	}


	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public String chd_itm_grp_nm4() {
		return getConstString(offset + 76, $chd_itm_grp_nm4);
	}

	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public void chd_itm_grp_nm4(String value) {
		setConstString(offset + 76, $chd_itm_grp_nm4, value);
	}


	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public String chd_itm_grp_cd5() {
		return getConstString(offset + 77, $chd_itm_grp_cd5);
	}

	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public void chd_itm_grp_cd5(String value) {
		setConstString(offset + 77, $chd_itm_grp_cd5, value);
	}


	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public String chd_itm_grp_nm5() {
		return getConstString(offset + 78, $chd_itm_grp_nm5);
	}

	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public void chd_itm_grp_nm5(String value) {
		setConstString(offset + 78, $chd_itm_grp_nm5, value);
	}


	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public String chd_itm_grp_cd6() {
		return getConstString(offset + 79, $chd_itm_grp_cd6);
	}

	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public void chd_itm_grp_cd6(String value) {
		setConstString(offset + 79, $chd_itm_grp_cd6, value);
	}


	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public String chd_itm_grp_nm6() {
		return getConstString(offset + 80, $chd_itm_grp_nm6);
	}

	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public void chd_itm_grp_nm6(String value) {
		setConstString(offset + 80, $chd_itm_grp_nm6, value);
	}


	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public String chd_itm_grp_cd7() {
		return getConstString(offset + 81, $chd_itm_grp_cd7);
	}

	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public void chd_itm_grp_cd7(String value) {
		setConstString(offset + 81, $chd_itm_grp_cd7, value);
	}


	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public String chd_itm_grp_nm7() {
		return getConstString(offset + 82, $chd_itm_grp_nm7);
	}

	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public void chd_itm_grp_nm7(String value) {
		setConstString(offset + 82, $chd_itm_grp_nm7, value);
	}


	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public String chd_itm_grp_cd8() {
		return getConstString(offset + 83, $chd_itm_grp_cd8);
	}

	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public void chd_itm_grp_cd8(String value) {
		setConstString(offset + 83, $chd_itm_grp_cd8, value);
	}


	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public String chd_itm_grp_nm8() {
		return getConstString(offset + 84, $chd_itm_grp_nm8);
	}

	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public void chd_itm_grp_nm8(String value) {
		setConstString(offset + 84, $chd_itm_grp_nm8, value);
	}


	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public String chd_itm_grp_cd9() {
		return getConstString(offset + 85, $chd_itm_grp_cd9);
	}

	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public void chd_itm_grp_cd9(String value) {
		setConstString(offset + 85, $chd_itm_grp_cd9, value);
	}


	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public String chd_itm_grp_nm9() {
		return getConstString(offset + 86, $chd_itm_grp_nm9);
	}

	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public void chd_itm_grp_nm9(String value) {
		setConstString(offset + 86, $chd_itm_grp_nm9, value);
	}


	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public String chd_itm_grp_cd10() {
		return getConstString(offset + 87, $chd_itm_grp_cd10);
	}

	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public void chd_itm_grp_cd10(String value) {
		setConstString(offset + 87, $chd_itm_grp_cd10, value);
	}


	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public String chd_itm_grp_nm10() {
		return getConstString(offset + 88, $chd_itm_grp_nm10);
	}

	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public void chd_itm_grp_nm10(String value) {
		setConstString(offset + 88, $chd_itm_grp_nm10, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 89, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 89, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 90, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 90, $site_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 91, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 91, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 92, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 92, $loc_nm, value);
	}


	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 93, $str_ln_cd);
	}

	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 93, $str_ln_cd, value);
	}


	/**
	 * Line name ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 94, $str_ln_nm);
	}

	/**
	 * Line name ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 94, $str_ln_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 95, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 95, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 96, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 96, $oper_nm, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 97, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 97, $oper_act_no, value);
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 98, $ac_slip_typ);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 98, $ac_slip_typ, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 99, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 99, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 100, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 100, $ac_rsn_nm, value);
	}


	/**
	 * No accounting reason 会計理由無.<p>
	 *
	 */
	public boolean no_ac_rsn_flg() {
		return getConstBoolean(offset + 101, $no_ac_rsn_flg);
	}

	/**
	 * No accounting reason 会計理由無.<p>
	 *
	 */
	public void no_ac_rsn_flg(boolean value) {
		setConstBoolean(offset + 101, $no_ac_rsn_flg, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 102, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 102, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 103, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 103, $bp_nm, value);
	}


	/**
	 * Without BP 取引先無.<p>
	 *
	 */
	public boolean no_bp_flg() {
		return getConstBoolean(offset + 104, $no_bp_flg);
	}

	/**
	 * Without BP 取引先無.<p>
	 *
	 */
	public void no_bp_flg(boolean value) {
		setConstBoolean(offset + 104, $no_bp_flg, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 105, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 105, $cntry_cd, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 106, $cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 106, $cntry_nm, value);
	}


	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 107, $area_cd);
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 107, $area_cd, value);
	}


	/**
	 * Region name 地域名.<p>
	 *
	 */
	public String area_nm() {
		return getConstString(offset + 108, $area_nm);
	}

	/**
	 * Region name 地域名.<p>
	 *
	 */
	public void area_nm(String value) {
		setConstString(offset + 108, $area_nm, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 109, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 109, $po_no, value);
	}


	/**
	 * Without PO No. 発注ＮＯ無.<p>
	 *
	 */
	public boolean no_po_no_flg() {
		return getConstBoolean(offset + 110, $no_po_no_flg);
	}

	/**
	 * Without PO No. 発注ＮＯ無.<p>
	 *
	 */
	public void no_po_no_flg(boolean value) {
		setConstBoolean(offset + 110, $no_po_no_flg, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 111, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 111, $slo_no, value);
	}


	/**
	 * No sales order No. 受注ＮＯ無.<p>
	 *
	 */
	public boolean no_slo_no_flg() {
		return getConstBoolean(offset + 112, $no_slo_no_flg);
	}

	/**
	 * No sales order No. 受注ＮＯ無.<p>
	 *
	 */
	public void no_slo_no_flg(boolean value) {
		setConstBoolean(offset + 112, $no_slo_no_flg, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 113, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 113, $iv_no, value);
	}


	/**
	 * No invoice No. インボイスＮＯ無.<p>
	 *
	 */
	public boolean no_iv_no_flg() {
		return getConstBoolean(offset + 114, $no_iv_no_flg);
	}

	/**
	 * No invoice No. インボイスＮＯ無.<p>
	 *
	 */
	public void no_iv_no_flg(boolean value) {
		setConstBoolean(offset + 114, $no_iv_no_flg, value);
	}


	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return getConstString(offset + 115, $bp_grp_cd1);
	}

	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		setConstString(offset + 115, $bp_grp_cd1, value);
	}


	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return getConstString(offset + 116, $bp_grp_nm1);
	}

	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		setConstString(offset + 116, $bp_grp_nm1, value);
	}


	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return getConstString(offset + 117, $bp_grp_cd2);
	}

	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		setConstString(offset + 117, $bp_grp_cd2, value);
	}


	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return getConstString(offset + 118, $bp_grp_nm2);
	}

	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		setConstString(offset + 118, $bp_grp_nm2, value);
	}


	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return getConstString(offset + 119, $bp_grp_cd3);
	}

	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		setConstString(offset + 119, $bp_grp_cd3, value);
	}


	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return getConstString(offset + 120, $bp_grp_nm3);
	}

	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		setConstString(offset + 120, $bp_grp_nm3, value);
	}


	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return getConstString(offset + 121, $bp_grp_cd4);
	}

	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		setConstString(offset + 121, $bp_grp_cd4, value);
	}


	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return getConstString(offset + 122, $bp_grp_nm4);
	}

	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		setConstString(offset + 122, $bp_grp_nm4, value);
	}


	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return getConstString(offset + 123, $bp_grp_cd5);
	}

	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		setConstString(offset + 123, $bp_grp_cd5, value);
	}


	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return getConstString(offset + 124, $bp_grp_nm5);
	}

	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		setConstString(offset + 124, $bp_grp_nm5, value);
	}


	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return getConstString(offset + 125, $bp_grp_cd6);
	}

	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		setConstString(offset + 125, $bp_grp_cd6, value);
	}


	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return getConstString(offset + 126, $bp_grp_nm6);
	}

	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		setConstString(offset + 126, $bp_grp_nm6, value);
	}


	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return getConstString(offset + 127, $bp_grp_cd7);
	}

	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		setConstString(offset + 127, $bp_grp_cd7, value);
	}


	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return getConstString(offset + 128, $bp_grp_nm7);
	}

	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		setConstString(offset + 128, $bp_grp_nm7, value);
	}


	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return getConstString(offset + 129, $bp_grp_cd8);
	}

	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		setConstString(offset + 129, $bp_grp_cd8, value);
	}


	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return getConstString(offset + 130, $bp_grp_nm8);
	}

	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		setConstString(offset + 130, $bp_grp_nm8, value);
	}


	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return getConstString(offset + 131, $bp_grp_cd9);
	}

	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		setConstString(offset + 131, $bp_grp_cd9, value);
	}


	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return getConstString(offset + 132, $bp_grp_nm9);
	}

	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		setConstString(offset + 132, $bp_grp_nm9, value);
	}


	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return getConstString(offset + 133, $bp_grp_cd10);
	}

	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		setConstString(offset + 133, $bp_grp_cd10, value);
	}


	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return getConstString(offset + 134, $bp_grp_nm10);
	}

	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		setConstString(offset + 134, $bp_grp_nm10, value);
	}


	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public boolean wg_flg() {
		return getConstBoolean(offset + 135, $wg_flg);
	}

	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public void wg_flg(boolean value) {
		setConstBoolean(offset + 135, $wg_flg, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public boolean ym_flg() {
		return getConstBoolean(offset + 136, $ym_flg);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym_flg(boolean value) {
		setConstBoolean(offset + 136, $ym_flg, value);
	}


	/**
	 * Management dept. 管理部門.<p>
	 *
	 */
	public boolean mng_dpt_flg() {
		return getConstBoolean(offset + 137, $mng_dpt_flg);
	}

	/**
	 * Management dept. 管理部門.<p>
	 *
	 */
	public void mng_dpt_flg(boolean value) {
		setConstBoolean(offset + 137, $mng_dpt_flg, value);
	}


	/**
	 * Parent item 親品目.<p>
	 *
	 */
	public boolean par_itm_flg() {
		return getConstBoolean(offset + 138, $par_itm_flg);
	}

	/**
	 * Parent item 親品目.<p>
	 *
	 */
	public void par_itm_flg(boolean value) {
		setConstBoolean(offset + 138, $par_itm_flg, value);
	}


	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public boolean par_itm_typ_flg() {
		return getConstBoolean(offset + 139, $par_itm_typ_flg);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ_flg(boolean value) {
		setConstBoolean(offset + 139, $par_itm_typ_flg, value);
	}


	/**
	 * Parent item type details 親品目区分詳細.<p>
	 *
	 */
	public boolean par_itm_typ_d_flg() {
		return getConstBoolean(offset + 140, $par_itm_typ_d_flg);
	}

	/**
	 * Parent item type details 親品目区分詳細.<p>
	 *
	 */
	public void par_itm_typ_d_flg(boolean value) {
		setConstBoolean(offset + 140, $par_itm_typ_d_flg, value);
	}


	/**
	 * Parent item journal 親品目仕訳.<p>
	 *
	 */
	public boolean par_itm_jnl_flg() {
		return getConstBoolean(offset + 141, $par_itm_jnl_flg);
	}

	/**
	 * Parent item journal 親品目仕訳.<p>
	 *
	 */
	public void par_itm_jnl_flg(boolean value) {
		setConstBoolean(offset + 141, $par_itm_jnl_flg, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public boolean itm_mfg_inst_no_flg() {
		return getConstBoolean(offset + 142, $itm_mfg_inst_no_flg);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no_flg(boolean value) {
		setConstBoolean(offset + 142, $itm_mfg_inst_no_flg, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public boolean mfg_act_no_flg() {
		return getConstBoolean(offset + 143, $mfg_act_no_flg);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no_flg(boolean value) {
		setConstBoolean(offset + 143, $mfg_act_no_flg, value);
	}


	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public boolean par_lot_flg() {
		return getConstBoolean(offset + 144, $par_lot_flg);
	}

	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public void par_lot_flg(boolean value) {
		setConstBoolean(offset + 144, $par_lot_flg, value);
	}


	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public boolean par_sublot_flg() {
		return getConstBoolean(offset + 145, $par_sublot_flg);
	}

	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public void par_sublot_flg(boolean value) {
		setConstBoolean(offset + 145, $par_sublot_flg, value);
	}


	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public boolean par_sno1_flg() {
		return getConstBoolean(offset + 146, $par_sno1_flg);
	}

	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public void par_sno1_flg(boolean value) {
		setConstBoolean(offset + 146, $par_sno1_flg, value);
	}


	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public boolean par_sno2_flg() {
		return getConstBoolean(offset + 147, $par_sno2_flg);
	}

	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public void par_sno2_flg(boolean value) {
		setConstBoolean(offset + 147, $par_sno2_flg, value);
	}


	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public boolean par_sno3_flg() {
		return getConstBoolean(offset + 148, $par_sno3_flg);
	}

	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public void par_sno3_flg(boolean value) {
		setConstBoolean(offset + 148, $par_sno3_flg, value);
	}


	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public boolean par_sno4_flg() {
		return getConstBoolean(offset + 149, $par_sno4_flg);
	}

	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public void par_sno4_flg(boolean value) {
		setConstBoolean(offset + 149, $par_sno4_flg, value);
	}


	/**
	 * Parent asset type 親資産区分.<p>
	 *
	 */
	public boolean par_asst_typ_flg() {
		return getConstBoolean(offset + 150, $par_asst_typ_flg);
	}

	/**
	 * Parent asset type 親資産区分.<p>
	 *
	 */
	public void par_asst_typ_flg(boolean value) {
		setConstBoolean(offset + 150, $par_asst_typ_flg, value);
	}


	/**
	 * Parent item classification 1 親品目分類１.<p>
	 *
	 */
	public boolean par_itm_grp_flg1() {
		return getConstBoolean(offset + 151, $par_itm_grp_flg1);
	}

	/**
	 * Parent item classification 1 親品目分類１.<p>
	 *
	 */
	public void par_itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 151, $par_itm_grp_flg1, value);
	}


	/**
	 * Parent item classification 2 親品目分類２.<p>
	 *
	 */
	public boolean par_itm_grp_flg2() {
		return getConstBoolean(offset + 152, $par_itm_grp_flg2);
	}

	/**
	 * Parent item classification 2 親品目分類２.<p>
	 *
	 */
	public void par_itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 152, $par_itm_grp_flg2, value);
	}


	/**
	 * Parent item classification 3 親品目分類３.<p>
	 *
	 */
	public boolean par_itm_grp_flg3() {
		return getConstBoolean(offset + 153, $par_itm_grp_flg3);
	}

	/**
	 * Parent item classification 3 親品目分類３.<p>
	 *
	 */
	public void par_itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 153, $par_itm_grp_flg3, value);
	}


	/**
	 * Parent item classification 4 親品目分類４.<p>
	 *
	 */
	public boolean par_itm_grp_flg4() {
		return getConstBoolean(offset + 154, $par_itm_grp_flg4);
	}

	/**
	 * Parent item classification 4 親品目分類４.<p>
	 *
	 */
	public void par_itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 154, $par_itm_grp_flg4, value);
	}


	/**
	 * Parent item classification 5 親品目分類５.<p>
	 *
	 */
	public boolean par_itm_grp_flg5() {
		return getConstBoolean(offset + 155, $par_itm_grp_flg5);
	}

	/**
	 * Parent item classification 5 親品目分類５.<p>
	 *
	 */
	public void par_itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 155, $par_itm_grp_flg5, value);
	}


	/**
	 * Parent item classification 6 親品目分類６.<p>
	 *
	 */
	public boolean par_itm_grp_flg6() {
		return getConstBoolean(offset + 156, $par_itm_grp_flg6);
	}

	/**
	 * Parent item classification 6 親品目分類６.<p>
	 *
	 */
	public void par_itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 156, $par_itm_grp_flg6, value);
	}


	/**
	 * Parent item classification 7 親品目分類７.<p>
	 *
	 */
	public boolean par_itm_grp_flg7() {
		return getConstBoolean(offset + 157, $par_itm_grp_flg7);
	}

	/**
	 * Parent item classification 7 親品目分類７.<p>
	 *
	 */
	public void par_itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 157, $par_itm_grp_flg7, value);
	}


	/**
	 * Parent item classification 8 親品目分類８.<p>
	 *
	 */
	public boolean par_itm_grp_flg8() {
		return getConstBoolean(offset + 158, $par_itm_grp_flg8);
	}

	/**
	 * Parent item classification 8 親品目分類８.<p>
	 *
	 */
	public void par_itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 158, $par_itm_grp_flg8, value);
	}


	/**
	 * Parent item classification 9 親品目分類９.<p>
	 *
	 */
	public boolean par_itm_grp_flg9() {
		return getConstBoolean(offset + 159, $par_itm_grp_flg9);
	}

	/**
	 * Parent item classification 9 親品目分類９.<p>
	 *
	 */
	public void par_itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 159, $par_itm_grp_flg9, value);
	}


	/**
	 * Parent item classification 10 親品目分類１０.<p>
	 *
	 */
	public boolean par_itm_grp_flg10() {
		return getConstBoolean(offset + 160, $par_itm_grp_flg10);
	}

	/**
	 * Parent item classification 10 親品目分類１０.<p>
	 *
	 */
	public void par_itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 160, $par_itm_grp_flg10, value);
	}


	/**
	 * BP 取引先.<p>
	 *
	 */
	public boolean bp_flg() {
		return getConstBoolean(offset + 161, $bp_flg);
	}

	/**
	 * BP 取引先.<p>
	 *
	 */
	public void bp_flg(boolean value) {
		setConstBoolean(offset + 161, $bp_flg, value);
	}


	/**
	 * Country 国.<p>
	 *
	 */
	public boolean cntry_flg() {
		return getConstBoolean(offset + 162, $cntry_flg);
	}

	/**
	 * Country 国.<p>
	 *
	 */
	public void cntry_flg(boolean value) {
		setConstBoolean(offset + 162, $cntry_flg, value);
	}


	/**
	 * Region 地域.<p>
	 *
	 */
	public boolean area_flg() {
		return getConstBoolean(offset + 163, $area_flg);
	}

	/**
	 * Region 地域.<p>
	 *
	 */
	public void area_flg(boolean value) {
		setConstBoolean(offset + 163, $area_flg, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public boolean po_no_flg() {
		return getConstBoolean(offset + 164, $po_no_flg);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no_flg(boolean value) {
		setConstBoolean(offset + 164, $po_no_flg, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public boolean slo_no_flg() {
		return getConstBoolean(offset + 165, $slo_no_flg);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no_flg(boolean value) {
		setConstBoolean(offset + 165, $slo_no_flg, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public boolean iv_no_flg() {
		return getConstBoolean(offset + 166, $iv_no_flg);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no_flg(boolean value) {
		setConstBoolean(offset + 166, $iv_no_flg, value);
	}


	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public boolean comp_qty_flg() {
		return getConstBoolean(offset + 167, $comp_qty_flg);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void comp_qty_flg(boolean value) {
		setConstBoolean(offset + 167, $comp_qty_flg, value);
	}


	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public boolean odr_qty_flg() {
		return getConstBoolean(offset + 168, $odr_qty_flg);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void odr_qty_flg(boolean value) {
		setConstBoolean(offset + 168, $odr_qty_flg, value);
	}


	/**
	 * BP classification 1 取引先分類１.<p>
	 *
	 */
	public boolean bp_grp_flg1() {
		return getConstBoolean(offset + 169, $bp_grp_flg1);
	}

	/**
	 * BP classification 1 取引先分類１.<p>
	 *
	 */
	public void bp_grp_flg1(boolean value) {
		setConstBoolean(offset + 169, $bp_grp_flg1, value);
	}


	/**
	 * BP classification 2 取引先分類２.<p>
	 *
	 */
	public boolean bp_grp_flg2() {
		return getConstBoolean(offset + 170, $bp_grp_flg2);
	}

	/**
	 * BP classification 2 取引先分類２.<p>
	 *
	 */
	public void bp_grp_flg2(boolean value) {
		setConstBoolean(offset + 170, $bp_grp_flg2, value);
	}


	/**
	 * BP classification 3 取引先分類３.<p>
	 *
	 */
	public boolean bp_grp_flg3() {
		return getConstBoolean(offset + 171, $bp_grp_flg3);
	}

	/**
	 * BP classification 3 取引先分類３.<p>
	 *
	 */
	public void bp_grp_flg3(boolean value) {
		setConstBoolean(offset + 171, $bp_grp_flg3, value);
	}


	/**
	 * BP classification 4 取引先分類４.<p>
	 *
	 */
	public boolean bp_grp_flg4() {
		return getConstBoolean(offset + 172, $bp_grp_flg4);
	}

	/**
	 * BP classification 4 取引先分類４.<p>
	 *
	 */
	public void bp_grp_flg4(boolean value) {
		setConstBoolean(offset + 172, $bp_grp_flg4, value);
	}


	/**
	 * BP classification 5 取引先分類５.<p>
	 *
	 */
	public boolean bp_grp_flg5() {
		return getConstBoolean(offset + 173, $bp_grp_flg5);
	}

	/**
	 * BP classification 5 取引先分類５.<p>
	 *
	 */
	public void bp_grp_flg5(boolean value) {
		setConstBoolean(offset + 173, $bp_grp_flg5, value);
	}


	/**
	 * BP classification 6 取引先分類６.<p>
	 *
	 */
	public boolean bp_grp_flg6() {
		return getConstBoolean(offset + 174, $bp_grp_flg6);
	}

	/**
	 * BP classification 6 取引先分類６.<p>
	 *
	 */
	public void bp_grp_flg6(boolean value) {
		setConstBoolean(offset + 174, $bp_grp_flg6, value);
	}


	/**
	 * BP classification 7 取引先分類７.<p>
	 *
	 */
	public boolean bp_grp_flg7() {
		return getConstBoolean(offset + 175, $bp_grp_flg7);
	}

	/**
	 * BP classification 7 取引先分類７.<p>
	 *
	 */
	public void bp_grp_flg7(boolean value) {
		setConstBoolean(offset + 175, $bp_grp_flg7, value);
	}


	/**
	 * BP classification 8 取引先分類８.<p>
	 *
	 */
	public boolean bp_grp_flg8() {
		return getConstBoolean(offset + 176, $bp_grp_flg8);
	}

	/**
	 * BP classification 8 取引先分類８.<p>
	 *
	 */
	public void bp_grp_flg8(boolean value) {
		setConstBoolean(offset + 176, $bp_grp_flg8, value);
	}


	/**
	 * BP classification 9 取引先分類９.<p>
	 *
	 */
	public boolean bp_grp_flg9() {
		return getConstBoolean(offset + 177, $bp_grp_flg9);
	}

	/**
	 * BP classification 9 取引先分類９.<p>
	 *
	 */
	public void bp_grp_flg9(boolean value) {
		setConstBoolean(offset + 177, $bp_grp_flg9, value);
	}


	/**
	 * BP classification 10 取引先分類１０.<p>
	 *
	 */
	public boolean bp_grp_flg10() {
		return getConstBoolean(offset + 178, $bp_grp_flg10);
	}

	/**
	 * BP classification 10 取引先分類１０.<p>
	 *
	 */
	public void bp_grp_flg10(boolean value) {
		setConstBoolean(offset + 178, $bp_grp_flg10, value);
	}


	/**
	 * Input dept. 投入部門.<p>
	 *
	 */
	public boolean inpt_dpt_flg() {
		return getConstBoolean(offset + 179, $inpt_dpt_flg);
	}

	/**
	 * Input dept. 投入部門.<p>
	 *
	 */
	public void inpt_dpt_flg(boolean value) {
		setConstBoolean(offset + 179, $inpt_dpt_flg, value);
	}


	/**
	 * Child item 子品目.<p>
	 *
	 */
	public boolean chd_itm_flg() {
		return getConstBoolean(offset + 180, $chd_itm_flg);
	}

	/**
	 * Child item 子品目.<p>
	 *
	 */
	public void chd_itm_flg(boolean value) {
		setConstBoolean(offset + 180, $chd_itm_flg, value);
	}


	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public boolean chd_itm_typ_flg() {
		return getConstBoolean(offset + 181, $chd_itm_typ_flg);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ_flg(boolean value) {
		setConstBoolean(offset + 181, $chd_itm_typ_flg, value);
	}


	/**
	 * Child item type details 子品目区分詳細.<p>
	 *
	 */
	public boolean chd_itm_typ_d_flg() {
		return getConstBoolean(offset + 182, $chd_itm_typ_d_flg);
	}

	/**
	 * Child item type details 子品目区分詳細.<p>
	 *
	 */
	public void chd_itm_typ_d_flg(boolean value) {
		setConstBoolean(offset + 182, $chd_itm_typ_d_flg, value);
	}


	/**
	 * Child item journal 子品目仕訳.<p>
	 *
	 */
	public boolean chd_itm_jnl_flg() {
		return getConstBoolean(offset + 183, $chd_itm_jnl_flg);
	}

	/**
	 * Child item journal 子品目仕訳.<p>
	 *
	 */
	public void chd_itm_jnl_flg(boolean value) {
		setConstBoolean(offset + 183, $chd_itm_jnl_flg, value);
	}


	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public boolean chd_lot_flg() {
		return getConstBoolean(offset + 184, $chd_lot_flg);
	}

	/**
	 * Child lot No. 子ロットＮＯ.<p>
	 *
	 */
	public void chd_lot_flg(boolean value) {
		setConstBoolean(offset + 184, $chd_lot_flg, value);
	}


	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public boolean chd_sublot_flg() {
		return getConstBoolean(offset + 185, $chd_sublot_flg);
	}

	/**
	 * Child sublot No. 子サブロットＮＯ.<p>
	 *
	 */
	public void chd_sublot_flg(boolean value) {
		setConstBoolean(offset + 185, $chd_sublot_flg, value);
	}


	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public boolean chd_sno1_flg() {
		return getConstBoolean(offset + 186, $chd_sno1_flg);
	}

	/**
	 * Child SEIBAN No. 1 子手配ＮＯ１.<p>
	 *
	 */
	public void chd_sno1_flg(boolean value) {
		setConstBoolean(offset + 186, $chd_sno1_flg, value);
	}


	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public boolean chd_sno2_flg() {
		return getConstBoolean(offset + 187, $chd_sno2_flg);
	}

	/**
	 * Child SEIBAN No. 2 子手配ＮＯ２.<p>
	 *
	 */
	public void chd_sno2_flg(boolean value) {
		setConstBoolean(offset + 187, $chd_sno2_flg, value);
	}


	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public boolean chd_sno3_flg() {
		return getConstBoolean(offset + 188, $chd_sno3_flg);
	}

	/**
	 * Child SEIBAN No. 3 子手配ＮＯ３.<p>
	 *
	 */
	public void chd_sno3_flg(boolean value) {
		setConstBoolean(offset + 188, $chd_sno3_flg, value);
	}


	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public boolean chd_sno4_flg() {
		return getConstBoolean(offset + 189, $chd_sno4_flg);
	}

	/**
	 * Child SEIBAN No. 4 子手配ＮＯ４.<p>
	 *
	 */
	public void chd_sno4_flg(boolean value) {
		setConstBoolean(offset + 189, $chd_sno4_flg, value);
	}


	/**
	 * Child asset type 子資産区分.<p>
	 *
	 */
	public boolean chd_asst_typ_flg() {
		return getConstBoolean(offset + 190, $chd_asst_typ_flg);
	}

	/**
	 * Child asset type 子資産区分.<p>
	 *
	 */
	public void chd_asst_typ_flg(boolean value) {
		setConstBoolean(offset + 190, $chd_asst_typ_flg, value);
	}


	/**
	 * Child item classification 1 子品目分類１.<p>
	 *
	 */
	public boolean chd_itm_grp_flg1() {
		return getConstBoolean(offset + 191, $chd_itm_grp_flg1);
	}

	/**
	 * Child item classification 1 子品目分類１.<p>
	 *
	 */
	public void chd_itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 191, $chd_itm_grp_flg1, value);
	}


	/**
	 * Child item classification 2 子品目分類２.<p>
	 *
	 */
	public boolean chd_itm_grp_flg2() {
		return getConstBoolean(offset + 192, $chd_itm_grp_flg2);
	}

	/**
	 * Child item classification 2 子品目分類２.<p>
	 *
	 */
	public void chd_itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 192, $chd_itm_grp_flg2, value);
	}


	/**
	 * Child item classification 3 子品目分類３.<p>
	 *
	 */
	public boolean chd_itm_grp_flg3() {
		return getConstBoolean(offset + 193, $chd_itm_grp_flg3);
	}

	/**
	 * Child item classification 3 子品目分類３.<p>
	 *
	 */
	public void chd_itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 193, $chd_itm_grp_flg3, value);
	}


	/**
	 * Child item classification 4 子品目分類４.<p>
	 *
	 */
	public boolean chd_itm_grp_flg4() {
		return getConstBoolean(offset + 194, $chd_itm_grp_flg4);
	}

	/**
	 * Child item classification 4 子品目分類４.<p>
	 *
	 */
	public void chd_itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 194, $chd_itm_grp_flg4, value);
	}


	/**
	 * Child item classification 5 子品目分類５.<p>
	 *
	 */
	public boolean chd_itm_grp_flg5() {
		return getConstBoolean(offset + 195, $chd_itm_grp_flg5);
	}

	/**
	 * Child item classification 5 子品目分類５.<p>
	 *
	 */
	public void chd_itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 195, $chd_itm_grp_flg5, value);
	}


	/**
	 * Child item classification 6 子品目分類６.<p>
	 *
	 */
	public boolean chd_itm_grp_flg6() {
		return getConstBoolean(offset + 196, $chd_itm_grp_flg6);
	}

	/**
	 * Child item classification 6 子品目分類６.<p>
	 *
	 */
	public void chd_itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 196, $chd_itm_grp_flg6, value);
	}


	/**
	 * Child item classification 7 子品目分類７.<p>
	 *
	 */
	public boolean chd_itm_grp_flg7() {
		return getConstBoolean(offset + 197, $chd_itm_grp_flg7);
	}

	/**
	 * Child item classification 7 子品目分類７.<p>
	 *
	 */
	public void chd_itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 197, $chd_itm_grp_flg7, value);
	}


	/**
	 * Child item classification 8 子品目分類８.<p>
	 *
	 */
	public boolean chd_itm_grp_flg8() {
		return getConstBoolean(offset + 198, $chd_itm_grp_flg8);
	}

	/**
	 * Child item classification 8 子品目分類８.<p>
	 *
	 */
	public void chd_itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 198, $chd_itm_grp_flg8, value);
	}


	/**
	 * Child item classification 9 子品目分類９.<p>
	 *
	 */
	public boolean chd_itm_grp_flg9() {
		return getConstBoolean(offset + 199, $chd_itm_grp_flg9);
	}

	/**
	 * Child item classification 9 子品目分類９.<p>
	 *
	 */
	public void chd_itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 199, $chd_itm_grp_flg9, value);
	}


	/**
	 * Child item classification 10 子品目分類１０.<p>
	 *
	 */
	public boolean chd_itm_grp_flg10() {
		return getConstBoolean(offset + 200, $chd_itm_grp_flg10);
	}

	/**
	 * Child item classification 10 子品目分類１０.<p>
	 *
	 */
	public void chd_itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 200, $chd_itm_grp_flg10, value);
	}


	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public boolean site_flg() {
		return getConstBoolean(offset + 201, $site_flg);
	}

	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public void site_flg(boolean value) {
		setConstBoolean(offset + 201, $site_flg, value);
	}


	/**
	 * Location 場所.<p>
	 *
	 */
	public boolean loc_flg() {
		return getConstBoolean(offset + 202, $loc_flg);
	}

	/**
	 * Location 場所.<p>
	 *
	 */
	public void loc_flg(boolean value) {
		setConstBoolean(offset + 202, $loc_flg, value);
	}


	/**
	 * Line ライン.<p>
	 *
	 */
	public boolean str_ln_flg() {
		return getConstBoolean(offset + 203, $str_ln_flg);
	}

	/**
	 * Line ライン.<p>
	 *
	 */
	public void str_ln_flg(boolean value) {
		setConstBoolean(offset + 203, $str_ln_flg, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public boolean oper_act_no_flg() {
		return getConstBoolean(offset + 204, $oper_act_no_flg);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no_flg(boolean value) {
		setConstBoolean(offset + 204, $oper_act_no_flg, value);
	}


	/**
	 * Operation 工程.<p>
	 *
	 */
	public boolean oper_flg() {
		return getConstBoolean(offset + 205, $oper_flg);
	}

	/**
	 * Operation 工程.<p>
	 *
	 */
	public void oper_flg(boolean value) {
		setConstBoolean(offset + 205, $oper_flg, value);
	}


	/**
	 * Operation result No. & Operation 工程実績ＮＯ＆工程.<p>
	 *
	 */
	public boolean disp_oper_seq_flg() {
		return getConstBoolean(offset + 206, $disp_oper_seq_flg);
	}

	/**
	 * Operation result No. & Operation 工程実績ＮＯ＆工程.<p>
	 *
	 */
	public void disp_oper_seq_flg(boolean value) {
		setConstBoolean(offset + 206, $disp_oper_seq_flg, value);
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public boolean ac_slip_typ_flg() {
		return getConstBoolean(offset + 207, $ac_slip_typ_flg);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ_flg(boolean value) {
		setConstBoolean(offset + 207, $ac_slip_typ_flg, value);
	}


	/**
	 * Accounting reason 会計理由.<p>
	 *
	 */
	public boolean ac_rsn_flg() {
		return getConstBoolean(offset + 208, $ac_rsn_flg);
	}

	/**
	 * Accounting reason 会計理由.<p>
	 *
	 */
	public void ac_rsn_flg(boolean value) {
		setConstBoolean(offset + 208, $ac_rsn_flg, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
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
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
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
		if ($inpt_dpt_cd.equalsIgnoreCase(name)) {
			return inpt_dpt_cd();
		}
		if ($inpt_dpt_nm.equalsIgnoreCase(name)) {
			return inpt_dpt_nm();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
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
		if ($repurc_obli_typ.equalsIgnoreCase(name)) {
			return repurc_obli_typ();
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			return mfg_purc_typ();
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
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
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($except_other_flg.equalsIgnoreCase(name)) {
			return except_other_flg();
		}
		if ($except_ss_flg.equalsIgnoreCase(name)) {
			return except_ss_flg();
		}
		if ($no_ac_rsn_flg.equalsIgnoreCase(name)) {
			return no_ac_rsn_flg();
		}
		if ($no_bp_flg.equalsIgnoreCase(name)) {
			return no_bp_flg();
		}
		if ($no_po_no_flg.equalsIgnoreCase(name)) {
			return no_po_no_flg();
		}
		if ($no_slo_no_flg.equalsIgnoreCase(name)) {
			return no_slo_no_flg();
		}
		if ($no_iv_no_flg.equalsIgnoreCase(name)) {
			return no_iv_no_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($ym_flg.equalsIgnoreCase(name)) {
			return ym_flg();
		}
		if ($mng_dpt_flg.equalsIgnoreCase(name)) {
			return mng_dpt_flg();
		}
		if ($par_itm_flg.equalsIgnoreCase(name)) {
			return par_itm_flg();
		}
		if ($par_itm_typ_flg.equalsIgnoreCase(name)) {
			return par_itm_typ_flg();
		}
		if ($par_itm_typ_d_flg.equalsIgnoreCase(name)) {
			return par_itm_typ_d_flg();
		}
		if ($par_itm_jnl_flg.equalsIgnoreCase(name)) {
			return par_itm_jnl_flg();
		}
		if ($itm_mfg_inst_no_flg.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no_flg();
		}
		if ($mfg_act_no_flg.equalsIgnoreCase(name)) {
			return mfg_act_no_flg();
		}
		if ($par_lot_flg.equalsIgnoreCase(name)) {
			return par_lot_flg();
		}
		if ($par_sublot_flg.equalsIgnoreCase(name)) {
			return par_sublot_flg();
		}
		if ($par_sno1_flg.equalsIgnoreCase(name)) {
			return par_sno1_flg();
		}
		if ($par_sno2_flg.equalsIgnoreCase(name)) {
			return par_sno2_flg();
		}
		if ($par_sno3_flg.equalsIgnoreCase(name)) {
			return par_sno3_flg();
		}
		if ($par_sno4_flg.equalsIgnoreCase(name)) {
			return par_sno4_flg();
		}
		if ($par_asst_typ_flg.equalsIgnoreCase(name)) {
			return par_asst_typ_flg();
		}
		if ($par_itm_grp_flg1.equalsIgnoreCase(name)) {
			return par_itm_grp_flg1();
		}
		if ($par_itm_grp_flg2.equalsIgnoreCase(name)) {
			return par_itm_grp_flg2();
		}
		if ($par_itm_grp_flg3.equalsIgnoreCase(name)) {
			return par_itm_grp_flg3();
		}
		if ($par_itm_grp_flg4.equalsIgnoreCase(name)) {
			return par_itm_grp_flg4();
		}
		if ($par_itm_grp_flg5.equalsIgnoreCase(name)) {
			return par_itm_grp_flg5();
		}
		if ($par_itm_grp_flg6.equalsIgnoreCase(name)) {
			return par_itm_grp_flg6();
		}
		if ($par_itm_grp_flg7.equalsIgnoreCase(name)) {
			return par_itm_grp_flg7();
		}
		if ($par_itm_grp_flg8.equalsIgnoreCase(name)) {
			return par_itm_grp_flg8();
		}
		if ($par_itm_grp_flg9.equalsIgnoreCase(name)) {
			return par_itm_grp_flg9();
		}
		if ($par_itm_grp_flg10.equalsIgnoreCase(name)) {
			return par_itm_grp_flg10();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($cntry_flg.equalsIgnoreCase(name)) {
			return cntry_flg();
		}
		if ($area_flg.equalsIgnoreCase(name)) {
			return area_flg();
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			return po_no_flg();
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			return slo_no_flg();
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			return iv_no_flg();
		}
		if ($comp_qty_flg.equalsIgnoreCase(name)) {
			return comp_qty_flg();
		}
		if ($odr_qty_flg.equalsIgnoreCase(name)) {
			return odr_qty_flg();
		}
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			return bp_grp_flg1();
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			return bp_grp_flg2();
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			return bp_grp_flg3();
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			return bp_grp_flg4();
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			return bp_grp_flg5();
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			return bp_grp_flg6();
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			return bp_grp_flg7();
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			return bp_grp_flg8();
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			return bp_grp_flg9();
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			return bp_grp_flg10();
		}
		if ($inpt_dpt_flg.equalsIgnoreCase(name)) {
			return inpt_dpt_flg();
		}
		if ($chd_itm_flg.equalsIgnoreCase(name)) {
			return chd_itm_flg();
		}
		if ($chd_itm_typ_flg.equalsIgnoreCase(name)) {
			return chd_itm_typ_flg();
		}
		if ($chd_itm_typ_d_flg.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_flg();
		}
		if ($chd_itm_jnl_flg.equalsIgnoreCase(name)) {
			return chd_itm_jnl_flg();
		}
		if ($chd_lot_flg.equalsIgnoreCase(name)) {
			return chd_lot_flg();
		}
		if ($chd_sublot_flg.equalsIgnoreCase(name)) {
			return chd_sublot_flg();
		}
		if ($chd_sno1_flg.equalsIgnoreCase(name)) {
			return chd_sno1_flg();
		}
		if ($chd_sno2_flg.equalsIgnoreCase(name)) {
			return chd_sno2_flg();
		}
		if ($chd_sno3_flg.equalsIgnoreCase(name)) {
			return chd_sno3_flg();
		}
		if ($chd_sno4_flg.equalsIgnoreCase(name)) {
			return chd_sno4_flg();
		}
		if ($chd_asst_typ_flg.equalsIgnoreCase(name)) {
			return chd_asst_typ_flg();
		}
		if ($chd_itm_grp_flg1.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg1();
		}
		if ($chd_itm_grp_flg2.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg2();
		}
		if ($chd_itm_grp_flg3.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg3();
		}
		if ($chd_itm_grp_flg4.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg4();
		}
		if ($chd_itm_grp_flg5.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg5();
		}
		if ($chd_itm_grp_flg6.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg6();
		}
		if ($chd_itm_grp_flg7.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg7();
		}
		if ($chd_itm_grp_flg8.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg8();
		}
		if ($chd_itm_grp_flg9.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg9();
		}
		if ($chd_itm_grp_flg10.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg10();
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			return site_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($str_ln_flg.equalsIgnoreCase(name)) {
			return str_ln_flg();
		}
		if ($oper_act_no_flg.equalsIgnoreCase(name)) {
			return oper_act_no_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($disp_oper_seq_flg.equalsIgnoreCase(name)) {
			return disp_oper_seq_flg();
		}
		if ($ac_slip_typ_flg.equalsIgnoreCase(name)) {
			return ac_slip_typ_flg();
		}
		if ($ac_rsn_flg.equalsIgnoreCase(name)) {
			return ac_rsn_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
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
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
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
		if ($inpt_dpt_cd.equalsIgnoreCase(name)) {
			return inpt_dpt_cd();
		}
		if ($inpt_dpt_nm.equalsIgnoreCase(name)) {
			return inpt_dpt_nm();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
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
		if ($repurc_obli_typ.equalsIgnoreCase(name)) {
			return repurc_obli_typ();
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			return mfg_purc_typ();
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
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
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($except_other_flg.equalsIgnoreCase(name)) {
			return except_other_flg();
		}
		if ($except_ss_flg.equalsIgnoreCase(name)) {
			return except_ss_flg();
		}
		if ($no_ac_rsn_flg.equalsIgnoreCase(name)) {
			return no_ac_rsn_flg();
		}
		if ($no_bp_flg.equalsIgnoreCase(name)) {
			return no_bp_flg();
		}
		if ($no_po_no_flg.equalsIgnoreCase(name)) {
			return no_po_no_flg();
		}
		if ($no_slo_no_flg.equalsIgnoreCase(name)) {
			return no_slo_no_flg();
		}
		if ($no_iv_no_flg.equalsIgnoreCase(name)) {
			return no_iv_no_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($ym_flg.equalsIgnoreCase(name)) {
			return ym_flg();
		}
		if ($mng_dpt_flg.equalsIgnoreCase(name)) {
			return mng_dpt_flg();
		}
		if ($par_itm_flg.equalsIgnoreCase(name)) {
			return par_itm_flg();
		}
		if ($par_itm_typ_flg.equalsIgnoreCase(name)) {
			return par_itm_typ_flg();
		}
		if ($par_itm_typ_d_flg.equalsIgnoreCase(name)) {
			return par_itm_typ_d_flg();
		}
		if ($par_itm_jnl_flg.equalsIgnoreCase(name)) {
			return par_itm_jnl_flg();
		}
		if ($itm_mfg_inst_no_flg.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no_flg();
		}
		if ($mfg_act_no_flg.equalsIgnoreCase(name)) {
			return mfg_act_no_flg();
		}
		if ($par_lot_flg.equalsIgnoreCase(name)) {
			return par_lot_flg();
		}
		if ($par_sublot_flg.equalsIgnoreCase(name)) {
			return par_sublot_flg();
		}
		if ($par_sno1_flg.equalsIgnoreCase(name)) {
			return par_sno1_flg();
		}
		if ($par_sno2_flg.equalsIgnoreCase(name)) {
			return par_sno2_flg();
		}
		if ($par_sno3_flg.equalsIgnoreCase(name)) {
			return par_sno3_flg();
		}
		if ($par_sno4_flg.equalsIgnoreCase(name)) {
			return par_sno4_flg();
		}
		if ($par_asst_typ_flg.equalsIgnoreCase(name)) {
			return par_asst_typ_flg();
		}
		if ($par_itm_grp_flg1.equalsIgnoreCase(name)) {
			return par_itm_grp_flg1();
		}
		if ($par_itm_grp_flg2.equalsIgnoreCase(name)) {
			return par_itm_grp_flg2();
		}
		if ($par_itm_grp_flg3.equalsIgnoreCase(name)) {
			return par_itm_grp_flg3();
		}
		if ($par_itm_grp_flg4.equalsIgnoreCase(name)) {
			return par_itm_grp_flg4();
		}
		if ($par_itm_grp_flg5.equalsIgnoreCase(name)) {
			return par_itm_grp_flg5();
		}
		if ($par_itm_grp_flg6.equalsIgnoreCase(name)) {
			return par_itm_grp_flg6();
		}
		if ($par_itm_grp_flg7.equalsIgnoreCase(name)) {
			return par_itm_grp_flg7();
		}
		if ($par_itm_grp_flg8.equalsIgnoreCase(name)) {
			return par_itm_grp_flg8();
		}
		if ($par_itm_grp_flg9.equalsIgnoreCase(name)) {
			return par_itm_grp_flg9();
		}
		if ($par_itm_grp_flg10.equalsIgnoreCase(name)) {
			return par_itm_grp_flg10();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($cntry_flg.equalsIgnoreCase(name)) {
			return cntry_flg();
		}
		if ($area_flg.equalsIgnoreCase(name)) {
			return area_flg();
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			return po_no_flg();
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			return slo_no_flg();
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			return iv_no_flg();
		}
		if ($comp_qty_flg.equalsIgnoreCase(name)) {
			return comp_qty_flg();
		}
		if ($odr_qty_flg.equalsIgnoreCase(name)) {
			return odr_qty_flg();
		}
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			return bp_grp_flg1();
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			return bp_grp_flg2();
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			return bp_grp_flg3();
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			return bp_grp_flg4();
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			return bp_grp_flg5();
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			return bp_grp_flg6();
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			return bp_grp_flg7();
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			return bp_grp_flg8();
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			return bp_grp_flg9();
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			return bp_grp_flg10();
		}
		if ($inpt_dpt_flg.equalsIgnoreCase(name)) {
			return inpt_dpt_flg();
		}
		if ($chd_itm_flg.equalsIgnoreCase(name)) {
			return chd_itm_flg();
		}
		if ($chd_itm_typ_flg.equalsIgnoreCase(name)) {
			return chd_itm_typ_flg();
		}
		if ($chd_itm_typ_d_flg.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_flg();
		}
		if ($chd_itm_jnl_flg.equalsIgnoreCase(name)) {
			return chd_itm_jnl_flg();
		}
		if ($chd_lot_flg.equalsIgnoreCase(name)) {
			return chd_lot_flg();
		}
		if ($chd_sublot_flg.equalsIgnoreCase(name)) {
			return chd_sublot_flg();
		}
		if ($chd_sno1_flg.equalsIgnoreCase(name)) {
			return chd_sno1_flg();
		}
		if ($chd_sno2_flg.equalsIgnoreCase(name)) {
			return chd_sno2_flg();
		}
		if ($chd_sno3_flg.equalsIgnoreCase(name)) {
			return chd_sno3_flg();
		}
		if ($chd_sno4_flg.equalsIgnoreCase(name)) {
			return chd_sno4_flg();
		}
		if ($chd_asst_typ_flg.equalsIgnoreCase(name)) {
			return chd_asst_typ_flg();
		}
		if ($chd_itm_grp_flg1.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg1();
		}
		if ($chd_itm_grp_flg2.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg2();
		}
		if ($chd_itm_grp_flg3.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg3();
		}
		if ($chd_itm_grp_flg4.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg4();
		}
		if ($chd_itm_grp_flg5.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg5();
		}
		if ($chd_itm_grp_flg6.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg6();
		}
		if ($chd_itm_grp_flg7.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg7();
		}
		if ($chd_itm_grp_flg8.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg8();
		}
		if ($chd_itm_grp_flg9.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg9();
		}
		if ($chd_itm_grp_flg10.equalsIgnoreCase(name)) {
			return chd_itm_grp_flg10();
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			return site_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($str_ln_flg.equalsIgnoreCase(name)) {
			return str_ln_flg();
		}
		if ($oper_act_no_flg.equalsIgnoreCase(name)) {
			return oper_act_no_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($disp_oper_seq_flg.equalsIgnoreCase(name)) {
			return disp_oper_seq_flg();
		}
		if ($ac_slip_typ_flg.equalsIgnoreCase(name)) {
			return ac_slip_typ_flg();
		}
		if ($ac_rsn_flg.equalsIgnoreCase(name)) {
			return ac_rsn_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
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
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
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
		if ($repurc_obli_typ.equalsIgnoreCase(name)) {
			repurc_obli_typ(value);
			return;
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			mfg_purc_typ(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
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
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($except_other_flg.equalsIgnoreCase(name)) {
			except_other_flg(value);
			return;
		}
		if ($except_ss_flg.equalsIgnoreCase(name)) {
			except_ss_flg(value);
			return;
		}
		if ($no_ac_rsn_flg.equalsIgnoreCase(name)) {
			no_ac_rsn_flg(value);
			return;
		}
		if ($no_bp_flg.equalsIgnoreCase(name)) {
			no_bp_flg(value);
			return;
		}
		if ($no_po_no_flg.equalsIgnoreCase(name)) {
			no_po_no_flg(value);
			return;
		}
		if ($no_slo_no_flg.equalsIgnoreCase(name)) {
			no_slo_no_flg(value);
			return;
		}
		if ($no_iv_no_flg.equalsIgnoreCase(name)) {
			no_iv_no_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($ym_flg.equalsIgnoreCase(name)) {
			ym_flg(value);
			return;
		}
		if ($mng_dpt_flg.equalsIgnoreCase(name)) {
			mng_dpt_flg(value);
			return;
		}
		if ($par_itm_flg.equalsIgnoreCase(name)) {
			par_itm_flg(value);
			return;
		}
		if ($par_itm_typ_flg.equalsIgnoreCase(name)) {
			par_itm_typ_flg(value);
			return;
		}
		if ($par_itm_typ_d_flg.equalsIgnoreCase(name)) {
			par_itm_typ_d_flg(value);
			return;
		}
		if ($par_itm_jnl_flg.equalsIgnoreCase(name)) {
			par_itm_jnl_flg(value);
			return;
		}
		if ($itm_mfg_inst_no_flg.equalsIgnoreCase(name)) {
			itm_mfg_inst_no_flg(value);
			return;
		}
		if ($mfg_act_no_flg.equalsIgnoreCase(name)) {
			mfg_act_no_flg(value);
			return;
		}
		if ($par_lot_flg.equalsIgnoreCase(name)) {
			par_lot_flg(value);
			return;
		}
		if ($par_sublot_flg.equalsIgnoreCase(name)) {
			par_sublot_flg(value);
			return;
		}
		if ($par_sno1_flg.equalsIgnoreCase(name)) {
			par_sno1_flg(value);
			return;
		}
		if ($par_sno2_flg.equalsIgnoreCase(name)) {
			par_sno2_flg(value);
			return;
		}
		if ($par_sno3_flg.equalsIgnoreCase(name)) {
			par_sno3_flg(value);
			return;
		}
		if ($par_sno4_flg.equalsIgnoreCase(name)) {
			par_sno4_flg(value);
			return;
		}
		if ($par_asst_typ_flg.equalsIgnoreCase(name)) {
			par_asst_typ_flg(value);
			return;
		}
		if ($par_itm_grp_flg1.equalsIgnoreCase(name)) {
			par_itm_grp_flg1(value);
			return;
		}
		if ($par_itm_grp_flg2.equalsIgnoreCase(name)) {
			par_itm_grp_flg2(value);
			return;
		}
		if ($par_itm_grp_flg3.equalsIgnoreCase(name)) {
			par_itm_grp_flg3(value);
			return;
		}
		if ($par_itm_grp_flg4.equalsIgnoreCase(name)) {
			par_itm_grp_flg4(value);
			return;
		}
		if ($par_itm_grp_flg5.equalsIgnoreCase(name)) {
			par_itm_grp_flg5(value);
			return;
		}
		if ($par_itm_grp_flg6.equalsIgnoreCase(name)) {
			par_itm_grp_flg6(value);
			return;
		}
		if ($par_itm_grp_flg7.equalsIgnoreCase(name)) {
			par_itm_grp_flg7(value);
			return;
		}
		if ($par_itm_grp_flg8.equalsIgnoreCase(name)) {
			par_itm_grp_flg8(value);
			return;
		}
		if ($par_itm_grp_flg9.equalsIgnoreCase(name)) {
			par_itm_grp_flg9(value);
			return;
		}
		if ($par_itm_grp_flg10.equalsIgnoreCase(name)) {
			par_itm_grp_flg10(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($cntry_flg.equalsIgnoreCase(name)) {
			cntry_flg(value);
			return;
		}
		if ($area_flg.equalsIgnoreCase(name)) {
			area_flg(value);
			return;
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			po_no_flg(value);
			return;
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			slo_no_flg(value);
			return;
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			iv_no_flg(value);
			return;
		}
		if ($comp_qty_flg.equalsIgnoreCase(name)) {
			comp_qty_flg(value);
			return;
		}
		if ($odr_qty_flg.equalsIgnoreCase(name)) {
			odr_qty_flg(value);
			return;
		}
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			bp_grp_flg1(value);
			return;
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			bp_grp_flg2(value);
			return;
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			bp_grp_flg3(value);
			return;
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			bp_grp_flg4(value);
			return;
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			bp_grp_flg5(value);
			return;
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			bp_grp_flg6(value);
			return;
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			bp_grp_flg7(value);
			return;
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			bp_grp_flg8(value);
			return;
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			bp_grp_flg9(value);
			return;
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			bp_grp_flg10(value);
			return;
		}
		if ($inpt_dpt_flg.equalsIgnoreCase(name)) {
			inpt_dpt_flg(value);
			return;
		}
		if ($chd_itm_flg.equalsIgnoreCase(name)) {
			chd_itm_flg(value);
			return;
		}
		if ($chd_itm_typ_flg.equalsIgnoreCase(name)) {
			chd_itm_typ_flg(value);
			return;
		}
		if ($chd_itm_typ_d_flg.equalsIgnoreCase(name)) {
			chd_itm_typ_d_flg(value);
			return;
		}
		if ($chd_itm_jnl_flg.equalsIgnoreCase(name)) {
			chd_itm_jnl_flg(value);
			return;
		}
		if ($chd_lot_flg.equalsIgnoreCase(name)) {
			chd_lot_flg(value);
			return;
		}
		if ($chd_sublot_flg.equalsIgnoreCase(name)) {
			chd_sublot_flg(value);
			return;
		}
		if ($chd_sno1_flg.equalsIgnoreCase(name)) {
			chd_sno1_flg(value);
			return;
		}
		if ($chd_sno2_flg.equalsIgnoreCase(name)) {
			chd_sno2_flg(value);
			return;
		}
		if ($chd_sno3_flg.equalsIgnoreCase(name)) {
			chd_sno3_flg(value);
			return;
		}
		if ($chd_sno4_flg.equalsIgnoreCase(name)) {
			chd_sno4_flg(value);
			return;
		}
		if ($chd_asst_typ_flg.equalsIgnoreCase(name)) {
			chd_asst_typ_flg(value);
			return;
		}
		if ($chd_itm_grp_flg1.equalsIgnoreCase(name)) {
			chd_itm_grp_flg1(value);
			return;
		}
		if ($chd_itm_grp_flg2.equalsIgnoreCase(name)) {
			chd_itm_grp_flg2(value);
			return;
		}
		if ($chd_itm_grp_flg3.equalsIgnoreCase(name)) {
			chd_itm_grp_flg3(value);
			return;
		}
		if ($chd_itm_grp_flg4.equalsIgnoreCase(name)) {
			chd_itm_grp_flg4(value);
			return;
		}
		if ($chd_itm_grp_flg5.equalsIgnoreCase(name)) {
			chd_itm_grp_flg5(value);
			return;
		}
		if ($chd_itm_grp_flg6.equalsIgnoreCase(name)) {
			chd_itm_grp_flg6(value);
			return;
		}
		if ($chd_itm_grp_flg7.equalsIgnoreCase(name)) {
			chd_itm_grp_flg7(value);
			return;
		}
		if ($chd_itm_grp_flg8.equalsIgnoreCase(name)) {
			chd_itm_grp_flg8(value);
			return;
		}
		if ($chd_itm_grp_flg9.equalsIgnoreCase(name)) {
			chd_itm_grp_flg9(value);
			return;
		}
		if ($chd_itm_grp_flg10.equalsIgnoreCase(name)) {
			chd_itm_grp_flg10(value);
			return;
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			site_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($str_ln_flg.equalsIgnoreCase(name)) {
			str_ln_flg(value);
			return;
		}
		if ($oper_act_no_flg.equalsIgnoreCase(name)) {
			oper_act_no_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($disp_oper_seq_flg.equalsIgnoreCase(name)) {
			disp_oper_seq_flg(value);
			return;
		}
		if ($ac_slip_typ_flg.equalsIgnoreCase(name)) {
			ac_slip_typ_flg(value);
			return;
		}
		if ($ac_rsn_flg.equalsIgnoreCase(name)) {
			ac_rsn_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
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
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
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
		if ($repurc_obli_typ.equalsIgnoreCase(name)) {
			repurc_obli_typ(value);
			return;
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			mfg_purc_typ(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($except_other_flg.equalsIgnoreCase(name)) {
			except_other_flg(value);
			return;
		}
		if ($except_ss_flg.equalsIgnoreCase(name)) {
			except_ss_flg(value);
			return;
		}
		if ($no_ac_rsn_flg.equalsIgnoreCase(name)) {
			no_ac_rsn_flg(value);
			return;
		}
		if ($no_bp_flg.equalsIgnoreCase(name)) {
			no_bp_flg(value);
			return;
		}
		if ($no_po_no_flg.equalsIgnoreCase(name)) {
			no_po_no_flg(value);
			return;
		}
		if ($no_slo_no_flg.equalsIgnoreCase(name)) {
			no_slo_no_flg(value);
			return;
		}
		if ($no_iv_no_flg.equalsIgnoreCase(name)) {
			no_iv_no_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($ym_flg.equalsIgnoreCase(name)) {
			ym_flg(value);
			return;
		}
		if ($mng_dpt_flg.equalsIgnoreCase(name)) {
			mng_dpt_flg(value);
			return;
		}
		if ($par_itm_flg.equalsIgnoreCase(name)) {
			par_itm_flg(value);
			return;
		}
		if ($par_itm_typ_flg.equalsIgnoreCase(name)) {
			par_itm_typ_flg(value);
			return;
		}
		if ($par_itm_typ_d_flg.equalsIgnoreCase(name)) {
			par_itm_typ_d_flg(value);
			return;
		}
		if ($par_itm_jnl_flg.equalsIgnoreCase(name)) {
			par_itm_jnl_flg(value);
			return;
		}
		if ($itm_mfg_inst_no_flg.equalsIgnoreCase(name)) {
			itm_mfg_inst_no_flg(value);
			return;
		}
		if ($mfg_act_no_flg.equalsIgnoreCase(name)) {
			mfg_act_no_flg(value);
			return;
		}
		if ($par_lot_flg.equalsIgnoreCase(name)) {
			par_lot_flg(value);
			return;
		}
		if ($par_sublot_flg.equalsIgnoreCase(name)) {
			par_sublot_flg(value);
			return;
		}
		if ($par_sno1_flg.equalsIgnoreCase(name)) {
			par_sno1_flg(value);
			return;
		}
		if ($par_sno2_flg.equalsIgnoreCase(name)) {
			par_sno2_flg(value);
			return;
		}
		if ($par_sno3_flg.equalsIgnoreCase(name)) {
			par_sno3_flg(value);
			return;
		}
		if ($par_sno4_flg.equalsIgnoreCase(name)) {
			par_sno4_flg(value);
			return;
		}
		if ($par_asst_typ_flg.equalsIgnoreCase(name)) {
			par_asst_typ_flg(value);
			return;
		}
		if ($par_itm_grp_flg1.equalsIgnoreCase(name)) {
			par_itm_grp_flg1(value);
			return;
		}
		if ($par_itm_grp_flg2.equalsIgnoreCase(name)) {
			par_itm_grp_flg2(value);
			return;
		}
		if ($par_itm_grp_flg3.equalsIgnoreCase(name)) {
			par_itm_grp_flg3(value);
			return;
		}
		if ($par_itm_grp_flg4.equalsIgnoreCase(name)) {
			par_itm_grp_flg4(value);
			return;
		}
		if ($par_itm_grp_flg5.equalsIgnoreCase(name)) {
			par_itm_grp_flg5(value);
			return;
		}
		if ($par_itm_grp_flg6.equalsIgnoreCase(name)) {
			par_itm_grp_flg6(value);
			return;
		}
		if ($par_itm_grp_flg7.equalsIgnoreCase(name)) {
			par_itm_grp_flg7(value);
			return;
		}
		if ($par_itm_grp_flg8.equalsIgnoreCase(name)) {
			par_itm_grp_flg8(value);
			return;
		}
		if ($par_itm_grp_flg9.equalsIgnoreCase(name)) {
			par_itm_grp_flg9(value);
			return;
		}
		if ($par_itm_grp_flg10.equalsIgnoreCase(name)) {
			par_itm_grp_flg10(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($cntry_flg.equalsIgnoreCase(name)) {
			cntry_flg(value);
			return;
		}
		if ($area_flg.equalsIgnoreCase(name)) {
			area_flg(value);
			return;
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			po_no_flg(value);
			return;
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			slo_no_flg(value);
			return;
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			iv_no_flg(value);
			return;
		}
		if ($comp_qty_flg.equalsIgnoreCase(name)) {
			comp_qty_flg(value);
			return;
		}
		if ($odr_qty_flg.equalsIgnoreCase(name)) {
			odr_qty_flg(value);
			return;
		}
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			bp_grp_flg1(value);
			return;
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			bp_grp_flg2(value);
			return;
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			bp_grp_flg3(value);
			return;
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			bp_grp_flg4(value);
			return;
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			bp_grp_flg5(value);
			return;
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			bp_grp_flg6(value);
			return;
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			bp_grp_flg7(value);
			return;
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			bp_grp_flg8(value);
			return;
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			bp_grp_flg9(value);
			return;
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			bp_grp_flg10(value);
			return;
		}
		if ($inpt_dpt_flg.equalsIgnoreCase(name)) {
			inpt_dpt_flg(value);
			return;
		}
		if ($chd_itm_flg.equalsIgnoreCase(name)) {
			chd_itm_flg(value);
			return;
		}
		if ($chd_itm_typ_flg.equalsIgnoreCase(name)) {
			chd_itm_typ_flg(value);
			return;
		}
		if ($chd_itm_typ_d_flg.equalsIgnoreCase(name)) {
			chd_itm_typ_d_flg(value);
			return;
		}
		if ($chd_itm_jnl_flg.equalsIgnoreCase(name)) {
			chd_itm_jnl_flg(value);
			return;
		}
		if ($chd_lot_flg.equalsIgnoreCase(name)) {
			chd_lot_flg(value);
			return;
		}
		if ($chd_sublot_flg.equalsIgnoreCase(name)) {
			chd_sublot_flg(value);
			return;
		}
		if ($chd_sno1_flg.equalsIgnoreCase(name)) {
			chd_sno1_flg(value);
			return;
		}
		if ($chd_sno2_flg.equalsIgnoreCase(name)) {
			chd_sno2_flg(value);
			return;
		}
		if ($chd_sno3_flg.equalsIgnoreCase(name)) {
			chd_sno3_flg(value);
			return;
		}
		if ($chd_sno4_flg.equalsIgnoreCase(name)) {
			chd_sno4_flg(value);
			return;
		}
		if ($chd_asst_typ_flg.equalsIgnoreCase(name)) {
			chd_asst_typ_flg(value);
			return;
		}
		if ($chd_itm_grp_flg1.equalsIgnoreCase(name)) {
			chd_itm_grp_flg1(value);
			return;
		}
		if ($chd_itm_grp_flg2.equalsIgnoreCase(name)) {
			chd_itm_grp_flg2(value);
			return;
		}
		if ($chd_itm_grp_flg3.equalsIgnoreCase(name)) {
			chd_itm_grp_flg3(value);
			return;
		}
		if ($chd_itm_grp_flg4.equalsIgnoreCase(name)) {
			chd_itm_grp_flg4(value);
			return;
		}
		if ($chd_itm_grp_flg5.equalsIgnoreCase(name)) {
			chd_itm_grp_flg5(value);
			return;
		}
		if ($chd_itm_grp_flg6.equalsIgnoreCase(name)) {
			chd_itm_grp_flg6(value);
			return;
		}
		if ($chd_itm_grp_flg7.equalsIgnoreCase(name)) {
			chd_itm_grp_flg7(value);
			return;
		}
		if ($chd_itm_grp_flg8.equalsIgnoreCase(name)) {
			chd_itm_grp_flg8(value);
			return;
		}
		if ($chd_itm_grp_flg9.equalsIgnoreCase(name)) {
			chd_itm_grp_flg9(value);
			return;
		}
		if ($chd_itm_grp_flg10.equalsIgnoreCase(name)) {
			chd_itm_grp_flg10(value);
			return;
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			site_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($str_ln_flg.equalsIgnoreCase(name)) {
			str_ln_flg(value);
			return;
		}
		if ($oper_act_no_flg.equalsIgnoreCase(name)) {
			oper_act_no_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($disp_oper_seq_flg.equalsIgnoreCase(name)) {
			disp_oper_seq_flg(value);
			return;
		}
		if ($ac_slip_typ_flg.equalsIgnoreCase(name)) {
			ac_slip_typ_flg(value);
			return;
		}
		if ($ac_rsn_flg.equalsIgnoreCase(name)) {
			ac_rsn_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

