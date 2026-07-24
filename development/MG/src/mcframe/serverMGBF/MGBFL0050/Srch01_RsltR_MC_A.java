package mcframe.serverMGBF.MGBFL0050;

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
	 * Calculation setting info. (Dummy for join) 原価計算設定情報（結合用ダミー）.<p>
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
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
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
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
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
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public static final String $cst_grp_cd1 = "cst_grp_cd1";
	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public static final String $cst_grp_nm1 = "cst_grp_nm1";
	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public static final String $cst_grp_cd2 = "cst_grp_cd2";
	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public static final String $cst_grp_nm2 = "cst_grp_nm2";
	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public static final String $cst_grp_cd3 = "cst_grp_cd3";
	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public static final String $cst_grp_nm3 = "cst_grp_nm3";
	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public static final String $cst_grp_cd4 = "cst_grp_cd4";
	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public static final String $cst_grp_nm4 = "cst_grp_nm4";
	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public static final String $cst_grp_cd5 = "cst_grp_cd5";
	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public static final String $cst_grp_nm5 = "cst_grp_nm5";
	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public static final String $cst_grp_cd6 = "cst_grp_cd6";
	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public static final String $cst_grp_nm6 = "cst_grp_nm6";
	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public static final String $cst_grp_cd7 = "cst_grp_cd7";
	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public static final String $cst_grp_nm7 = "cst_grp_nm7";
	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public static final String $cst_grp_cd8 = "cst_grp_cd8";
	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public static final String $cst_grp_nm8 = "cst_grp_nm8";
	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public static final String $cst_grp_cd9 = "cst_grp_cd9";
	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public static final String $cst_grp_nm9 = "cst_grp_nm9";
	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $cst_grp_cd10 = "cst_grp_cd10";
	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public static final String $cst_grp_nm10 = "cst_grp_nm10";
	/**
	 * Country cd. (Customer) 国ＣＤ（得意先）.<p>
	 *
	 */
	public static final String $cst_cntry_cd = "cst_cntry_cd";
	/**
	 * Country name (Customer) 国名（得意先）.<p>
	 *
	 */
	public static final String $cst_cntry_nm = "cst_cntry_nm";
	/**
	 * Region cd. (Customer) 地域ＣＤ（得意先）.<p>
	 *
	 */
	public static final String $cst_area_cd = "cst_area_cd";
	/**
	 * Region name (Customer) 地域名（得意先）.<p>
	 *
	 */
	public static final String $cst_area_nm = "cst_area_nm";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public static final String $dlv_grp_cd1 = "dlv_grp_cd1";
	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public static final String $dlv_grp_nm1 = "dlv_grp_nm1";
	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public static final String $dlv_grp_cd2 = "dlv_grp_cd2";
	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public static final String $dlv_grp_nm2 = "dlv_grp_nm2";
	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public static final String $dlv_grp_cd3 = "dlv_grp_cd3";
	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public static final String $dlv_grp_nm3 = "dlv_grp_nm3";
	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public static final String $dlv_grp_cd4 = "dlv_grp_cd4";
	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public static final String $dlv_grp_nm4 = "dlv_grp_nm4";
	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public static final String $dlv_grp_cd5 = "dlv_grp_cd5";
	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public static final String $dlv_grp_nm5 = "dlv_grp_nm5";
	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public static final String $dlv_grp_cd6 = "dlv_grp_cd6";
	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public static final String $dlv_grp_nm6 = "dlv_grp_nm6";
	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public static final String $dlv_grp_cd7 = "dlv_grp_cd7";
	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public static final String $dlv_grp_nm7 = "dlv_grp_nm7";
	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public static final String $dlv_grp_cd8 = "dlv_grp_cd8";
	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public static final String $dlv_grp_nm8 = "dlv_grp_nm8";
	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public static final String $dlv_grp_cd9 = "dlv_grp_cd9";
	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public static final String $dlv_grp_nm9 = "dlv_grp_nm9";
	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $dlv_grp_cd10 = "dlv_grp_cd10";
	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public static final String $dlv_grp_nm10 = "dlv_grp_nm10";
	/**
	 * Country cd. (Delivery) 国ＣＤ（納品先）.<p>
	 *
	 */
	public static final String $dlv_cntry_cd = "dlv_cntry_cd";
	/**
	 * Country name (Delivery) 国名（納品先）.<p>
	 *
	 */
	public static final String $dlv_cntry_nm = "dlv_cntry_nm";
	/**
	 * Region cd. (Delivery) 地域ＣＤ（納品先）.<p>
	 *
	 */
	public static final String $dlv_area_cd = "dlv_area_cd";
	/**
	 * Region name (Delivery) 地域名（納品先）.<p>
	 *
	 */
	public static final String $dlv_area_nm = "dlv_area_nm";
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
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public static final String $sls_dpt_nm = "sls_dpt_nm";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $sls_usr_nm = "sls_usr_nm";
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
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public static final String $alc_dpt_cd = "alc_dpt_cd";
	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public static final String $alc_dpt_nm = "alc_dpt_nm";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	/**
	 * Sales classification cd. 1 売上分類ＣＤ１.<p>
	 *
	 */
	public static final String $cost_sls_cd1 = "cost_sls_cd1";
	/**
	 * Sales classification name 1 売上分類名１.<p>
	 *
	 */
	public static final String $cost_sls_nm1 = "cost_sls_nm1";
	/**
	 * Sales classification cd. 2 売上分類ＣＤ２.<p>
	 *
	 */
	public static final String $cost_sls_cd2 = "cost_sls_cd2";
	/**
	 * Sales classification name 2 売上分類名２.<p>
	 *
	 */
	public static final String $cost_sls_nm2 = "cost_sls_nm2";
	/**
	 * Sales classification cd. 3 売上分類ＣＤ３.<p>
	 *
	 */
	public static final String $cost_sls_cd3 = "cost_sls_cd3";
	/**
	 * Sales classification name 3 売上分類名３.<p>
	 *
	 */
	public static final String $cost_sls_nm3 = "cost_sls_nm3";
	/**
	 * Sales classification cd. 4 売上分類ＣＤ４.<p>
	 *
	 */
	public static final String $cost_sls_cd4 = "cost_sls_cd4";
	/**
	 * Sales classification name 4 売上分類名４.<p>
	 *
	 */
	public static final String $cost_sls_nm4 = "cost_sls_nm4";
	/**
	 * Sales classification cd. 5 売上分類ＣＤ５.<p>
	 *
	 */
	public static final String $cost_sls_cd5 = "cost_sls_cd5";
	/**
	 * Sales classification name 5 売上分類名５.<p>
	 *
	 */
	public static final String $cost_sls_nm5 = "cost_sls_nm5";
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
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public static final String $cur_std_amt = "cur_std_amt";
	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public static final String $cur_amt_diff = "cur_amt_diff";
	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public static final String $unit_trd_cur_amt = "unit_trd_cur_amt";
	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public static final String $unit_cur_std_amt = "unit_cur_std_amt";
	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public static final String $unit_cur_amt_diff = "unit_cur_amt_diff";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public static final String $std_xrate = "std_xrate";
	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public static final String $xrate_diff = "xrate_diff";
	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public static final String $std_amt = "std_amt";
	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public static final String $amt_diff = "amt_diff";
	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public static final String $amt_upri_diff = "amt_upri_diff";
	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public static final String $amt_rate_diff = "amt_rate_diff";
	/**
	 * Operating income 利益.<p>
	 *
	 */
	public static final String $profit = "profit";
	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public static final String $std_profit = "std_profit";
	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public static final String $unit_amt = "unit_amt";
	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public static final String $unit_std_amt = "unit_std_amt";
	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public static final String $unit_amt_diff = "unit_amt_diff";
	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public static final String $unit_amt_upri_diff = "unit_amt_upri_diff";
	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public static final String $unit_amt_rate_diff = "unit_amt_rate_diff";
	/**
	 * Operating income 利益.<p>
	 *
	 */
	public static final String $unit_profit = "unit_profit";
	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public static final String $unit_std_profit = "unit_std_profit";
	/**
	 * Operating income ratio 利益率.<p>
	 *
	 */
	public static final String $profit_rate = "profit_rate";
	/**
	 * Standard operating income ratio 標準利益率.<p>
	 *
	 */
	public static final String $std_profit_rate = "std_profit_rate";
	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public static final String $sls_profit = "sls_profit";
	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public static final String $std_sls_profit = "std_sls_profit";
	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public static final String $unit_sls_profit = "unit_sls_profit";
	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public static final String $unit_std_sls_profit = "unit_std_sls_profit";
	/**
	 * Gross profit ratio 売上利益率.<p>
	 *
	 */
	public static final String $sls_profit_rate = "sls_profit_rate";
	/**
	 * Standard gross profit ratio 標準売上利益率.<p>
	 *
	 */
	public static final String $std_sls_profit_rate = "std_sls_profit_rate";
	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public static final String $limit_profit = "limit_profit";
	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public static final String $unit_limit_profit = "unit_limit_profit";
	/**
	 * Marginal profit ratio 限界利益率.<p>
	 *
	 */
	public static final String $limit_profit_rate = "limit_profit_rate";
	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public static final String $var = "var";
	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public static final String $fxd = "fxd";
	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public static final String $diff = "diff";
	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public static final String $std_cost = "std_cost";
	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public static final String $std_sls_cost = "std_sls_cost";
	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public static final String $std_sls_mng_cost = "std_sls_mng_cost";
	/**
	 * Total 合計.<p>
	 *
	 */
	public static final String $ttl = "ttl";
	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public static final String $sls_cost = "sls_cost";
	/**
	 * SGA 販管費.<p>
	 *
	 */
	public static final String $sls_mng_cost = "sls_mng_cost";
	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public static final String $unit_var = "unit_var";
	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public static final String $unit_fxd = "unit_fxd";
	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public static final String $unit_diff = "unit_diff";
	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public static final String $unit_std_cost = "unit_std_cost";
	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public static final String $unit_std_sls_cost = "unit_std_sls_cost";
	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public static final String $unit_std_sls_mng_cost = "unit_std_sls_mng_cost";
	/**
	 * Total 合計.<p>
	 *
	 */
	public static final String $unit_ttl = "unit_ttl";
	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public static final String $unit_sls_cost = "unit_sls_cost";
	/**
	 * SGA 販管費.<p>
	 *
	 */
	public static final String $unit_sls_mng_cost = "unit_sls_mng_cost";
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


	public static final MCMeta dummy_term_META = createCommonMeta($dummy_term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_slip_typ_nm_META = createCommonMeta($ac_slip_typ_nm, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP_NM);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_grp_cd1_META = createCommonMeta($cst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm1_META = createCommonMeta($cst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd2_META = createCommonMeta($cst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm2_META = createCommonMeta($cst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd3_META = createCommonMeta($cst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm3_META = createCommonMeta($cst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd4_META = createCommonMeta($cst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm4_META = createCommonMeta($cst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd5_META = createCommonMeta($cst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm5_META = createCommonMeta($cst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd6_META = createCommonMeta($cst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm6_META = createCommonMeta($cst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd7_META = createCommonMeta($cst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm7_META = createCommonMeta($cst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd8_META = createCommonMeta($cst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm8_META = createCommonMeta($cst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd9_META = createCommonMeta($cst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm9_META = createCommonMeta($cst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_cd10_META = createCommonMeta($cst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm10_META = createCommonMeta($cst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_cntry_cd_META = createCommonMeta($cst_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cst_cntry_nm_META = createCommonMeta($cst_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cst_area_cd_META = createCommonMeta($cst_area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta cst_area_nm_META = createCommonMeta($cst_area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_grp_cd1_META = createCommonMeta($dlv_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm1_META = createCommonMeta($dlv_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_cd2_META = createCommonMeta($dlv_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm2_META = createCommonMeta($dlv_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_cd3_META = createCommonMeta($dlv_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm3_META = createCommonMeta($dlv_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_cd4_META = createCommonMeta($dlv_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm4_META = createCommonMeta($dlv_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_cd5_META = createCommonMeta($dlv_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm5_META = createCommonMeta($dlv_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_cd6_META = createCommonMeta($dlv_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm6_META = createCommonMeta($dlv_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_cd7_META = createCommonMeta($dlv_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm7_META = createCommonMeta($dlv_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_cd8_META = createCommonMeta($dlv_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm8_META = createCommonMeta($dlv_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_cd9_META = createCommonMeta($dlv_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm9_META = createCommonMeta($dlv_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_cd10_META = createCommonMeta($dlv_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm10_META = createCommonMeta($dlv_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_cntry_cd_META = createCommonMeta($dlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dlv_cntry_nm_META = createCommonMeta($dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta dlv_area_cd_META = createCommonMeta($dlv_area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta dlv_area_nm_META = createCommonMeta($dlv_area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta alc_dpt_cd_META = createCommonMeta($alc_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta alc_dpt_nm_META = createCommonMeta($alc_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cost_sls_cd1_META = createCommonMeta($cost_sls_cd1, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_nm1_META = createCommonMeta($cost_sls_nm1, mcframe.commonMA.meta.MA_META.COST_SLS_NM);
	public static final MCMeta cost_sls_cd2_META = createCommonMeta($cost_sls_cd2, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_nm2_META = createCommonMeta($cost_sls_nm2, mcframe.commonMA.meta.MA_META.COST_SLS_NM);
	public static final MCMeta cost_sls_cd3_META = createCommonMeta($cost_sls_cd3, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_nm3_META = createCommonMeta($cost_sls_nm3, mcframe.commonMA.meta.MA_META.COST_SLS_NM);
	public static final MCMeta cost_sls_cd4_META = createCommonMeta($cost_sls_cd4, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_nm4_META = createCommonMeta($cost_sls_nm4, mcframe.commonMA.meta.MA_META.COST_SLS_NM);
	public static final MCMeta cost_sls_cd5_META = createCommonMeta($cost_sls_cd5, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_nm5_META = createCommonMeta($cost_sls_nm5, mcframe.commonMA.meta.MA_META.COST_SLS_NM);
	public static final MCMeta rec_eval_typ_META = createCommonMeta($rec_eval_typ, mcframe.commonMG.meta.MG_META.REC_EVAL_TYP);
	public static final MCMeta rec_eval_typ_nm_META = createCommonMeta($rec_eval_typ_nm, mcframe.commonMG.meta.MG_META.REC_EVAL_TYP_NM);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cur_std_amt_META = createCommonMeta($cur_std_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cur_amt_diff_META = createCommonMeta($cur_amt_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_trd_cur_amt_META = createCommonMeta($unit_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_cur_std_amt_META = createCommonMeta($unit_cur_std_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_cur_amt_diff_META = createCommonMeta($unit_cur_amt_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_xrate_META = createCommonMeta($std_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_diff_META = createCommonMeta($xrate_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_amt_META = createCommonMeta($std_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt_diff_META = createCommonMeta($amt_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt_upri_diff_META = createCommonMeta($amt_upri_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt_rate_diff_META = createCommonMeta($amt_rate_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta profit_META = createCommonMeta($profit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_profit_META = createCommonMeta($std_profit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_amt_META = createCommonMeta($unit_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_std_amt_META = createCommonMeta($unit_std_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_amt_diff_META = createCommonMeta($unit_amt_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_amt_upri_diff_META = createCommonMeta($unit_amt_upri_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_amt_rate_diff_META = createCommonMeta($unit_amt_rate_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_profit_META = createCommonMeta($unit_profit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_std_profit_META = createCommonMeta($unit_std_profit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta profit_rate_META = createCommonMeta($profit_rate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_profit_rate_META = createCommonMeta($std_profit_rate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_profit_META = createCommonMeta($sls_profit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_sls_profit_META = createCommonMeta($std_sls_profit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_sls_profit_META = createCommonMeta($unit_sls_profit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_std_sls_profit_META = createCommonMeta($unit_std_sls_profit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_profit_rate_META = createCommonMeta($sls_profit_rate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_sls_profit_rate_META = createCommonMeta($std_sls_profit_rate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta limit_profit_META = createCommonMeta($limit_profit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_limit_profit_META = createCommonMeta($unit_limit_profit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta limit_profit_rate_META = createCommonMeta($limit_profit_rate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta var_META = createCommonMeta($var, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta fxd_META = createCommonMeta($fxd, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_META = createCommonMeta($diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost_META = createCommonMeta($std_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_sls_cost_META = createCommonMeta($std_sls_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_sls_mng_cost_META = createCommonMeta($std_sls_mng_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_cost_META = createCommonMeta($sls_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_mng_cost_META = createCommonMeta($sls_mng_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_var_META = createCommonMeta($unit_var, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_fxd_META = createCommonMeta($unit_fxd, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_diff_META = createCommonMeta($unit_diff, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_std_cost_META = createCommonMeta($unit_std_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_std_sls_cost_META = createCommonMeta($unit_std_sls_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_std_sls_mng_cost_META = createCommonMeta($unit_std_sls_mng_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_ttl_META = createCommonMeta($unit_ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_sls_cost_META = createCommonMeta($unit_sls_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta unit_sls_mng_cost_META = createCommonMeta($unit_sls_mng_cost, mcframe.commonMA.meta.MA_META.MONEY);
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
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			ac_slip_typ_META,
			ac_slip_typ_nm_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			cst_cd_META,
			cst_nm_META,
			cst_grp_cd1_META,
			cst_grp_nm1_META,
			cst_grp_cd2_META,
			cst_grp_nm2_META,
			cst_grp_cd3_META,
			cst_grp_nm3_META,
			cst_grp_cd4_META,
			cst_grp_nm4_META,
			cst_grp_cd5_META,
			cst_grp_nm5_META,
			cst_grp_cd6_META,
			cst_grp_nm6_META,
			cst_grp_cd7_META,
			cst_grp_nm7_META,
			cst_grp_cd8_META,
			cst_grp_nm8_META,
			cst_grp_cd9_META,
			cst_grp_nm9_META,
			cst_grp_cd10_META,
			cst_grp_nm10_META,
			cst_cntry_cd_META,
			cst_cntry_nm_META,
			cst_area_cd_META,
			cst_area_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			dlv_grp_cd1_META,
			dlv_grp_nm1_META,
			dlv_grp_cd2_META,
			dlv_grp_nm2_META,
			dlv_grp_cd3_META,
			dlv_grp_nm3_META,
			dlv_grp_cd4_META,
			dlv_grp_nm4_META,
			dlv_grp_cd5_META,
			dlv_grp_nm5_META,
			dlv_grp_cd6_META,
			dlv_grp_nm6_META,
			dlv_grp_cd7_META,
			dlv_grp_nm7_META,
			dlv_grp_cd8_META,
			dlv_grp_nm8_META,
			dlv_grp_cd9_META,
			dlv_grp_nm9_META,
			dlv_grp_cd10_META,
			dlv_grp_nm10_META,
			dlv_cntry_cd_META,
			dlv_cntry_nm_META,
			dlv_area_cd_META,
			dlv_area_nm_META,
			slo_no_META,
			iv_no_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			alc_dpt_cd_META,
			alc_dpt_nm_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			cost_sls_cd1_META,
			cost_sls_nm1_META,
			cost_sls_cd2_META,
			cost_sls_nm2_META,
			cost_sls_cd3_META,
			cost_sls_nm3_META,
			cost_sls_cd4_META,
			cost_sls_nm4_META,
			cost_sls_cd5_META,
			cost_sls_nm5_META,
			rec_eval_typ_META,
			rec_eval_typ_nm_META,
			qty_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			trd_cur_amt_META,
			cur_std_amt_META,
			cur_amt_diff_META,
			unit_trd_cur_amt_META,
			unit_cur_std_amt_META,
			unit_cur_amt_diff_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			trd_cur_upri_dec_place_META,
			xrate_META,
			std_xrate_META,
			xrate_diff_META,
			amt_META,
			std_amt_META,
			amt_diff_META,
			amt_upri_diff_META,
			amt_rate_diff_META,
			profit_META,
			std_profit_META,
			unit_amt_META,
			unit_std_amt_META,
			unit_amt_diff_META,
			unit_amt_upri_diff_META,
			unit_amt_rate_diff_META,
			unit_profit_META,
			unit_std_profit_META,
			profit_rate_META,
			std_profit_rate_META,
			sls_profit_META,
			std_sls_profit_META,
			unit_sls_profit_META,
			unit_std_sls_profit_META,
			sls_profit_rate_META,
			std_sls_profit_rate_META,
			limit_profit_META,
			unit_limit_profit_META,
			limit_profit_rate_META,
			var_META,
			fxd_META,
			diff_META,
			std_cost_META,
			std_sls_cost_META,
			std_sls_mng_cost_META,
			ttl_META,
			sls_cost_META,
			sls_mng_cost_META,
			unit_var_META,
			unit_fxd_META,
			unit_diff_META,
			unit_std_cost_META,
			unit_std_sls_cost_META,
			unit_std_sls_mng_cost_META,
			unit_ttl_META,
			unit_sls_cost_META,
			unit_sls_mng_cost_META,
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
			col_199_META
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
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$ac_slip_typ, "MAC_AC_SLIP_TYP"},	// ac_slip_typ
				{$asst_typ, "MAC_ASST_TYP"},	// asst_typ
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
				{$itm_cd, "itm_flg"},	// itm_cd
				{$itm_sub1, "itm_flg"},	// itm_sub1
				{$itm_sub2, "itm_flg"},	// itm_sub2
				{$itm_sub3, "itm_flg"},	// itm_sub3
				{$itm_nm, "itm_flg"},	// itm_nm
				{$itm_typ, "itm_typ_flg"},	// itm_typ
				{$itm_typ_d_cd, "itm_typ_d_flg"},	// itm_typ_d_cd
				{$itm_typ_d_nm, "itm_typ_d_flg"},	// itm_typ_d_nm
				{$itm_jnl_cd, "itm_jnl_flg"},	// itm_jnl_cd
				{$itm_jnl_nm, "itm_jnl_flg"},	// itm_jnl_nm
				{$itm_grp_cd1, "itm_grp_flg1"},	// itm_grp_cd1
				{$itm_grp_nm1, "itm_grp_flg1"},	// itm_grp_nm1
				{$itm_grp_cd2, "itm_grp_flg2"},	// itm_grp_cd2
				{$itm_grp_nm2, "itm_grp_flg2"},	// itm_grp_nm2
				{$itm_grp_cd3, "itm_grp_flg3"},	// itm_grp_cd3
				{$itm_grp_nm3, "itm_grp_flg3"},	// itm_grp_nm3
				{$itm_grp_cd4, "itm_grp_flg4"},	// itm_grp_cd4
				{$itm_grp_nm4, "itm_grp_flg4"},	// itm_grp_nm4
				{$itm_grp_cd5, "itm_grp_flg5"},	// itm_grp_cd5
				{$itm_grp_nm5, "itm_grp_flg5"},	// itm_grp_nm5
				{$itm_grp_cd6, "itm_grp_flg6"},	// itm_grp_cd6
				{$itm_grp_nm6, "itm_grp_flg6"},	// itm_grp_nm6
				{$itm_grp_cd7, "itm_grp_flg7"},	// itm_grp_cd7
				{$itm_grp_nm7, "itm_grp_flg7"},	// itm_grp_nm7
				{$itm_grp_cd8, "itm_grp_flg8"},	// itm_grp_cd8
				{$itm_grp_nm8, "itm_grp_flg8"},	// itm_grp_nm8
				{$itm_grp_cd9, "itm_grp_flg9"},	// itm_grp_cd9
				{$itm_grp_nm9, "itm_grp_flg9"},	// itm_grp_nm9
				{$itm_grp_cd10, "itm_grp_flg10"},	// itm_grp_cd10
				{$itm_grp_nm10, "itm_grp_flg10"},	// itm_grp_nm10
				{$lot_no, "lot_flg"},	// lot_no
				{$sublot_no, "sublot_flg"},	// sublot_no
				{$sno1, "sno1_flg"},	// sno1
				{$sno2, "sno2_flg"},	// sno2
				{$sno3, "sno3_flg"},	// sno3
				{$sno4, "sno4_flg"},	// sno4
				{$ac_slip_typ, "ac_slip_typ_flg"},	// ac_slip_typ
				{$ac_rsn_cd, "ac_rsn_flg"},	// ac_rsn_cd
				{$ac_rsn_nm, "ac_rsn_flg"},	// ac_rsn_nm
				{$asst_typ, "asst_typ_flg"},	// asst_typ
				{$cst_cd, "cst_flg"},	// cst_cd
				{$cst_nm, "cst_flg"},	// cst_nm
				{$cst_grp_cd1, "cst_grp_flg1"},	// cst_grp_cd1
				{$cst_grp_nm1, "cst_grp_flg1"},	// cst_grp_nm1
				{$cst_grp_cd2, "cst_grp_flg2"},	// cst_grp_cd2
				{$cst_grp_nm2, "cst_grp_flg2"},	// cst_grp_nm2
				{$cst_grp_cd3, "cst_grp_flg3"},	// cst_grp_cd3
				{$cst_grp_nm3, "cst_grp_flg3"},	// cst_grp_nm3
				{$cst_grp_cd4, "cst_grp_flg4"},	// cst_grp_cd4
				{$cst_grp_nm4, "cst_grp_flg4"},	// cst_grp_nm4
				{$cst_grp_cd5, "cst_grp_flg5"},	// cst_grp_cd5
				{$cst_grp_nm5, "cst_grp_flg5"},	// cst_grp_nm5
				{$cst_grp_cd6, "cst_grp_flg6"},	// cst_grp_cd6
				{$cst_grp_nm6, "cst_grp_flg6"},	// cst_grp_nm6
				{$cst_grp_cd7, "cst_grp_flg7"},	// cst_grp_cd7
				{$cst_grp_nm7, "cst_grp_flg7"},	// cst_grp_nm7
				{$cst_grp_cd8, "cst_grp_flg8"},	// cst_grp_cd8
				{$cst_grp_nm8, "cst_grp_flg8"},	// cst_grp_nm8
				{$cst_grp_cd9, "cst_grp_flg9"},	// cst_grp_cd9
				{$cst_grp_nm9, "cst_grp_flg9"},	// cst_grp_nm9
				{$cst_grp_cd10, "cst_grp_flg10"},	// cst_grp_cd10
				{$cst_grp_nm10, "cst_grp_flg10"},	// cst_grp_nm10
				{$cst_cntry_cd, "cst_cntry_flg"},	// cst_cntry_cd
				{$cst_cntry_nm, "cst_cntry_flg"},	// cst_cntry_nm
				{$cst_area_cd, "cst_area_flg"},	// cst_area_cd
				{$cst_area_nm, "cst_area_flg"},	// cst_area_nm
				{$dlv_cd, "dlv_flg"},	// dlv_cd
				{$dlv_nm, "dlv_flg"},	// dlv_nm
				{$dlv_grp_cd1, "dlv_grp_flg1"},	// dlv_grp_cd1
				{$dlv_grp_nm1, "dlv_grp_flg1"},	// dlv_grp_nm1
				{$dlv_grp_cd2, "dlv_grp_flg2"},	// dlv_grp_cd2
				{$dlv_grp_nm2, "dlv_grp_flg2"},	// dlv_grp_nm2
				{$dlv_grp_cd3, "dlv_grp_flg3"},	// dlv_grp_cd3
				{$dlv_grp_nm3, "dlv_grp_flg3"},	// dlv_grp_nm3
				{$dlv_grp_cd4, "dlv_grp_flg4"},	// dlv_grp_cd4
				{$dlv_grp_nm4, "dlv_grp_flg4"},	// dlv_grp_nm4
				{$dlv_grp_cd5, "dlv_grp_flg5"},	// dlv_grp_cd5
				{$dlv_grp_nm5, "dlv_grp_flg5"},	// dlv_grp_nm5
				{$dlv_grp_cd6, "dlv_grp_flg6"},	// dlv_grp_cd6
				{$dlv_grp_nm6, "dlv_grp_flg6"},	// dlv_grp_nm6
				{$dlv_grp_cd7, "dlv_grp_flg7"},	// dlv_grp_cd7
				{$dlv_grp_nm7, "dlv_grp_flg7"},	// dlv_grp_nm7
				{$dlv_grp_cd8, "dlv_grp_flg8"},	// dlv_grp_cd8
				{$dlv_grp_nm8, "dlv_grp_flg8"},	// dlv_grp_nm8
				{$dlv_grp_cd9, "dlv_grp_flg9"},	// dlv_grp_cd9
				{$dlv_grp_nm9, "dlv_grp_flg9"},	// dlv_grp_nm9
				{$dlv_grp_cd10, "dlv_grp_flg10"},	// dlv_grp_cd10
				{$dlv_grp_nm10, "dlv_grp_flg10"},	// dlv_grp_nm10
				{$dlv_cntry_cd, "dlv_cntry_flg"},	// dlv_cntry_cd
				{$dlv_cntry_nm, "dlv_cntry_flg"},	// dlv_cntry_nm
				{$dlv_area_cd, "dlv_area_flg"},	// dlv_area_cd
				{$dlv_area_nm, "dlv_area_flg"},	// dlv_area_nm
				{$slo_no, "slo_no_flg"},	// slo_no
				{$iv_no, "iv_no_flg"},	// iv_no
				{$sls_dpt_cd, "sls_dpt_flg"},	// sls_dpt_cd
				{$sls_dpt_nm, "sls_dpt_flg"},	// sls_dpt_nm
				{$sls_usr_cd, "sls_usr_flg"},	// sls_usr_cd
				{$sls_usr_nm, "sls_usr_flg"},	// sls_usr_nm
				{$stk_bp_cd, "stk_bp_flg"},	// stk_bp_cd
				{$stk_bp_nm, "stk_bp_flg"},	// stk_bp_nm
				{$alc_dpt_cd, "alc_dpt_flg"},	// alc_dpt_cd
				{$alc_dpt_nm, "alc_dpt_flg"},	// alc_dpt_nm
				{$dest_cd1, "dest1_flg"},	// dest_cd1
				{$dest_nm1, "dest1_flg"},	// dest_nm1
				{$dest_cd2, "dest2_flg"},	// dest_cd2
				{$dest_nm2, "dest2_flg"},	// dest_nm2
				{$dest_cd3, "dest3_flg"},	// dest_cd3
				{$dest_nm3, "dest3_flg"},	// dest_nm3
				{$cost_sls_cd1, "cost_sls1_flg"},	// cost_sls_cd1
				{$cost_sls_nm1, "cost_sls1_flg"},	// cost_sls_nm1
				{$cost_sls_cd2, "cost_sls2_flg"},	// cost_sls_cd2
				{$cost_sls_nm2, "cost_sls2_flg"},	// cost_sls_nm2
				{$cost_sls_cd3, "cost_sls3_flg"},	// cost_sls_cd3
				{$cost_sls_nm3, "cost_sls3_flg"},	// cost_sls_nm3
				{$cost_sls_cd4, "cost_sls4_flg"},	// cost_sls_cd4
				{$cost_sls_nm4, "cost_sls4_flg"},	// cost_sls_nm4
				{$cost_sls_cd5, "cost_sls5_flg"},	// cost_sls_cd5
				{$cost_sls_nm5, "cost_sls5_flg"},	// cost_sls_nm5
				{$rec_eval_typ, "rec_eval_typ_flg"},	// rec_eval_typ
				{$unit_cd, "qty_flg"},	// unit_cd
				{$unit_nm, "qty_flg"},	// unit_nm
				{$dec_place, "qty_flg"},	// dec_place
				{$trd_cur_cd, "trd_cur_flg"},	// trd_cur_cd
				{$trd_cur_nm, "trd_cur_flg"},	// trd_cur_nm
				{$trd_cur_amt_dec_place, "trd_cur_flg"},	// trd_cur_amt_dec_place
				{$trd_cur_upri_dec_place, "trd_cur_flg"},	// trd_cur_upri_dec_place
				{$xrate, "xrate_flg"},	// xrate
				{$std_xrate, "xrate_flg"}	// std_xrate
			}
		)),
		new MCExtMap.Entry($$COL_SQL, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "T.CALC_GRP_CD"},	// calc_grp_cd
				{$wg_cd, "T.WG_CD"},	// wg_cd
				{$wg_nm, "T.WG_NM"},	// wg_nm
				{$ym, "T.YM"},	// ym
				{$mng_dpt_cd, "T.MNG_DPT_CD"},	// mng_dpt_cd
				{$mng_dpt_nm, "MNG_DPT.DPT_NM"},	// mng_dpt_nm
				{$itm_cd, "T.ITM_CD"},	// itm_cd
				{$itm_sub1, "T.ITM_SUB1"},	// itm_sub1
				{$itm_sub2, "T.ITM_SUB2"},	// itm_sub2
				{$itm_sub3, "T.ITM_SUB3"},	// itm_sub3
				{$itm_nm, "NVL(SUNDRY_ITM.ITM_NM, ITM.ITM_NM)"},	// itm_nm
				{$itm_typ, "ITM.ITM_TYP"},	// itm_typ
				{$itm_typ_d_cd, "ITM.ITM_TYP_D_CD"},	// itm_typ_d_cd
				{$itm_typ_d_nm, "ITM_TYP_D.ITM_TYP_D_NM"},	// itm_typ_d_nm
				{$itm_jnl_cd, "ITM.ITM_JNL_CD"},	// itm_jnl_cd
				{$itm_jnl_nm, "ITM_JNL.ITM_JNL_NM"},	// itm_jnl_nm
				{$itm_grp_cd1, "ITM.ITM_GRP_CD1"},	// itm_grp_cd1
				{$itm_grp_nm1, "ITM_GRP1.ITM_GRP_NM"},	// itm_grp_nm1
				{$itm_grp_cd2, "ITM.ITM_GRP_CD2"},	// itm_grp_cd2
				{$itm_grp_nm2, "ITM_GRP2.ITM_GRP_NM"},	// itm_grp_nm2
				{$itm_grp_cd3, "ITM.ITM_GRP_CD3"},	// itm_grp_cd3
				{$itm_grp_nm3, "ITM_GRP3.ITM_GRP_NM"},	// itm_grp_nm3
				{$itm_grp_cd4, "ITM.ITM_GRP_CD4"},	// itm_grp_cd4
				{$itm_grp_nm4, "ITM_GRP4.ITM_GRP_NM"},	// itm_grp_nm4
				{$itm_grp_cd5, "ITM.ITM_GRP_CD5"},	// itm_grp_cd5
				{$itm_grp_nm5, "ITM_GRP5.ITM_GRP_NM"},	// itm_grp_nm5
				{$itm_grp_cd6, "ITM.ITM_GRP_CD6"},	// itm_grp_cd6
				{$itm_grp_nm6, "ITM_GRP6.ITM_GRP_NM"},	// itm_grp_nm6
				{$itm_grp_cd7, "ITM.ITM_GRP_CD7"},	// itm_grp_cd7
				{$itm_grp_nm7, "ITM_GRP7.ITM_GRP_NM"},	// itm_grp_nm7
				{$itm_grp_cd8, "ITM.ITM_GRP_CD8"},	// itm_grp_cd8
				{$itm_grp_nm8, "ITM_GRP8.ITM_GRP_NM"},	// itm_grp_nm8
				{$itm_grp_cd9, "ITM.ITM_GRP_CD9"},	// itm_grp_cd9
				{$itm_grp_nm9, "ITM_GRP9.ITM_GRP_NM"},	// itm_grp_nm9
				{$itm_grp_cd10, "ITM.ITM_GRP_CD10"},	// itm_grp_cd10
				{$itm_grp_nm10, "ITM_GRP10.ITM_GRP_NM"},	// itm_grp_nm10
				{$lot_no, "T.LOT_NO"},	// lot_no
				{$sublot_no, "T.SUBLOT_NO"},	// sublot_no
				{$sno1, "T.SNO1"},	// sno1
				{$sno2, "T.SNO2"},	// sno2
				{$sno3, "T.SNO3"},	// sno3
				{$sno4, "T.SNO4"},	// sno4
				{$ac_slip_typ, "T.AC_SLIP_TYP"},	// ac_slip_typ
				{$ac_rsn_cd, "T.AC_RSN_CD"},	// ac_rsn_cd
				{$ac_rsn_nm, "AC_RSN.AC_RSN_NM"},	// ac_rsn_nm
				{$asst_typ, "T.ASST_TYP"},	// asst_typ
				{$cst_cd, "T.CST_CD"},	// cst_cd
				{$cst_nm, "CST.BP_NM"},	// cst_nm
				{$cst_grp_cd1, "CST.BP_GRP_CD1"},	// cst_grp_cd1
				{$cst_grp_nm1, "CST_GRP1.BP_GRP_NM"},	// cst_grp_nm1
				{$cst_grp_cd2, "CST.BP_GRP_CD2"},	// cst_grp_cd2
				{$cst_grp_nm2, "CST_GRP2.BP_GRP_NM"},	// cst_grp_nm2
				{$cst_grp_cd3, "CST.BP_GRP_CD3"},	// cst_grp_cd3
				{$cst_grp_nm3, "CST_GRP3.BP_GRP_NM"},	// cst_grp_nm3
				{$cst_grp_cd4, "CST.BP_GRP_CD4"},	// cst_grp_cd4
				{$cst_grp_nm4, "CST_GRP4.BP_GRP_NM"},	// cst_grp_nm4
				{$cst_grp_cd5, "CST.BP_GRP_CD5"},	// cst_grp_cd5
				{$cst_grp_nm5, "CST_GRP5.BP_GRP_NM"},	// cst_grp_nm5
				{$cst_grp_cd6, "CST.BP_GRP_CD6"},	// cst_grp_cd6
				{$cst_grp_nm6, "CST_GRP6.BP_GRP_NM"},	// cst_grp_nm6
				{$cst_grp_cd7, "CST.BP_GRP_CD7"},	// cst_grp_cd7
				{$cst_grp_nm7, "CST_GRP7.BP_GRP_NM"},	// cst_grp_nm7
				{$cst_grp_cd8, "CST.BP_GRP_CD8"},	// cst_grp_cd8
				{$cst_grp_nm8, "CST_GRP8.BP_GRP_NM"},	// cst_grp_nm8
				{$cst_grp_cd9, "CST.BP_GRP_CD9"},	// cst_grp_cd9
				{$cst_grp_nm9, "CST_GRP9.BP_GRP_NM"},	// cst_grp_nm9
				{$cst_grp_cd10, "CST.BP_GRP_CD10"},	// cst_grp_cd10
				{$cst_grp_nm10, "CST_GRP10.BP_GRP_NM"},	// cst_grp_nm10
				{$cst_cntry_cd, "CST.CNTRY_CD"},	// cst_cntry_cd
				{$cst_cntry_nm, "CST_CNTRY.CNTRY_NM"},	// cst_cntry_nm
				{$cst_area_cd, "CST.AREA_CD"},	// cst_area_cd
				{$cst_area_nm, "CST_AREA.AREA_NM"},	// cst_area_nm
				{$dlv_cd, "T.DLV_CD"},	// dlv_cd
				{$dlv_nm, "DLV.BP_NM"},	// dlv_nm
				{$dlv_grp_cd1, "DLV.BP_GRP_CD1"},	// dlv_grp_cd1
				{$dlv_grp_nm1, "DLV_GRP1.BP_GRP_NM"},	// dlv_grp_nm1
				{$dlv_grp_cd2, "DLV.BP_GRP_CD2"},	// dlv_grp_cd2
				{$dlv_grp_nm2, "DLV_GRP2.BP_GRP_NM"},	// dlv_grp_nm2
				{$dlv_grp_cd3, "DLV.BP_GRP_CD3"},	// dlv_grp_cd3
				{$dlv_grp_nm3, "DLV_GRP3.BP_GRP_NM"},	// dlv_grp_nm3
				{$dlv_grp_cd4, "DLV.BP_GRP_CD4"},	// dlv_grp_cd4
				{$dlv_grp_nm4, "DLV_GRP4.BP_GRP_NM"},	// dlv_grp_nm4
				{$dlv_grp_cd5, "DLV.BP_GRP_CD5"},	// dlv_grp_cd5
				{$dlv_grp_nm5, "DLV_GRP5.BP_GRP_NM"},	// dlv_grp_nm5
				{$dlv_grp_cd6, "DLV.BP_GRP_CD6"},	// dlv_grp_cd6
				{$dlv_grp_nm6, "DLV_GRP6.BP_GRP_NM"},	// dlv_grp_nm6
				{$dlv_grp_cd7, "DLV.BP_GRP_CD7"},	// dlv_grp_cd7
				{$dlv_grp_nm7, "DLV_GRP7.BP_GRP_NM"},	// dlv_grp_nm7
				{$dlv_grp_cd8, "DLV.BP_GRP_CD8"},	// dlv_grp_cd8
				{$dlv_grp_nm8, "DLV_GRP8.BP_GRP_NM"},	// dlv_grp_nm8
				{$dlv_grp_cd9, "DLV.BP_GRP_CD9"},	// dlv_grp_cd9
				{$dlv_grp_nm9, "DLV_GRP9.BP_GRP_NM"},	// dlv_grp_nm9
				{$dlv_grp_cd10, "DLV.BP_GRP_CD10"},	// dlv_grp_cd10
				{$dlv_grp_nm10, "DLV_GRP10.BP_GRP_NM"},	// dlv_grp_nm10
				{$dlv_cntry_cd, "DLV.CNTRY_CD"},	// dlv_cntry_cd
				{$dlv_cntry_nm, "DLV_CNTRY.CNTRY_NM"},	// dlv_cntry_nm
				{$dlv_area_cd, "DLV.AREA_CD"},	// dlv_area_cd
				{$dlv_area_nm, "DLV_AREA.AREA_NM"},	// dlv_area_nm
				{$slo_no, "T.SLO_NO"},	// slo_no
				{$iv_no, "T.IV_NO"},	// iv_no
				{$sls_dpt_cd, "T.SLS_DPT_CD"},	// sls_dpt_cd
				{$sls_dpt_nm, "SLS_DPT.DPT_NM"},	// sls_dpt_nm
				{$sls_usr_cd, "T.SLS_USR_CD"},	// sls_usr_cd
				{$sls_usr_nm, "SLS_USR.USR_NM"},	// sls_usr_nm
				{$stk_bp_cd, "T.STK_BP_CD"},	// stk_bp_cd
				{$stk_bp_nm, "STK_BP.BP_NM"},	// stk_bp_nm
				{$alc_dpt_cd, "T.ALC_DPT_CD"},	// alc_dpt_cd
				{$alc_dpt_nm, "ALC_DPT.DPT_NM"},	// alc_dpt_nm
				{$dest_cd1, "T.DEST_CD1"},	// dest_cd1
				{$dest_nm1, "DEST1.BP_NM"},	// dest_nm1
				{$dest_cd2, "T.DEST_CD2"},	// dest_cd2
				{$dest_nm2, "DEST2.BP_NM"},	// dest_nm2
				{$dest_cd3, "T.DEST_CD3"},	// dest_cd3
				{$dest_nm3, "DEST3.BP_NM"},	// dest_nm3
				{$cost_sls_cd1, "T.COST_SLS_CD1"},	// cost_sls_cd1
				{$cost_sls_nm1, "COST_SLS1.COST_SLS_NM"},	// cost_sls_nm1
				{$cost_sls_cd2, "T.COST_SLS_CD2"},	// cost_sls_cd2
				{$cost_sls_nm2, "COST_SLS2.COST_SLS_NM"},	// cost_sls_nm2
				{$cost_sls_cd3, "T.COST_SLS_CD3"},	// cost_sls_cd3
				{$cost_sls_nm3, "COST_SLS3.COST_SLS_NM"},	// cost_sls_nm3
				{$cost_sls_cd4, "T.COST_SLS_CD4"},	// cost_sls_cd4
				{$cost_sls_nm4, "COST_SLS4.COST_SLS_NM"},	// cost_sls_nm4
				{$cost_sls_cd5, "T.COST_SLS_CD5"},	// cost_sls_cd5
				{$cost_sls_nm5, "COST_SLS5.COST_SLS_NM"},	// cost_sls_nm5
				{$rec_eval_typ, "T.REC_EVAL_TYP"},	// rec_eval_typ
				{$unit_cd, "ITM.UNIT_CD"},	// unit_cd
				{$unit_nm, "UNIT.UNIT_NM"},	// unit_nm
				{$dec_place, "ITM.DEC_PLACE"},	// dec_place
				{$trd_cur_cd, "T.TRD_CUR_CD"},	// trd_cur_cd
				{$trd_cur_nm, "TRD_CUR.CUR_NM"},	// trd_cur_nm
				{$trd_cur_amt_dec_place, "TRD_CUR.AMT_DEC_PLACE"},	// trd_cur_amt_dec_place
				{$trd_cur_upri_dec_place, "TRD_CUR.UPRI_DEC_PLACE"},	// trd_cur_upri_dec_place
				{$xrate, "T.XRATE"},	// xrate
				{$std_xrate, "T.STD_XRATE"}	// std_xrate
			}
		)),
		new MCExtMap.Entry($$SUM_SQL, new MCExtList(
			new String[][]{
				{$var, "NVL(SUM(DECODE(T.VAR_TYP,MAC_VAR_TYP.VAR,T.ACT_COST,0)),0)"},	// var
				{$fxd, "NVL(SUM(DECODE(T.VAR_TYP,MAC_VAR_TYP.FXD,T.ACT_COST,0)),0)"},	// fxd
				{$std_cost, "NVL(SUM(T.STD_COST),0)"},	// std_cost
				{$std_sls_cost, "NVL(SUM(T.STD_SLS_COST),0)"},	// std_sls_cost
				{$std_sls_mng_cost, "NVL(SUM(T.STD_SLS_MNG_COST),0)"},	// std_sls_mng_cost
				{$ttl, "NVL(SUM(T.ACT_COST),0)"},	// ttl
				{$sls_cost, "NVL(SUM(DECODE(T.EXPNS_TYP,MAC_EXPNS_TYP.PROD,T.ACT_COST,0)),0)"},	// sls_cost
				{$sls_mng_cost, "NVL(SUM(DECODE(T.EXPNS_TYP,MAC_EXPNS_TYP.SGA,T.ACT_COST,0)),0)"},	// sls_mng_cost
				{$unit_var, "NVL(SUM(DECODE(T.VAR_TYP,MAC_VAR_TYP.VAR,T.ACT_COST,0)),0)"},	// unit_var
				{$unit_fxd, "NVL(SUM(DECODE(T.VAR_TYP,MAC_VAR_TYP.FXD,T.ACT_COST,0)),0)"},	// unit_fxd
				{$unit_std_cost, "AVG(T.STD_UPRI)"},	// unit_std_cost
				{$unit_ttl, "NVL(SUM(T.ACT_COST),0)"},	// unit_ttl
				{$unit_sls_cost, "NVL(SUM(DECODE(T.EXPNS_TYP,MAC_EXPNS_TYP.PROD,T.ACT_COST,0)),0)"},	// unit_sls_cost
				{$unit_sls_mng_cost, "NVL(SUM(DECODE(T.EXPNS_TYP,MAC_EXPNS_TYP.SGA,T.ACT_COST,0)),0)"},	// unit_sls_mng_cost
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
				{$col_099, "CUSTOM_SUM_COL"},	// col_099
				{$col_100, "CUSTOM_SUM_COL"},	// col_100
				{$col_101, "CUSTOM_SUM_COL"},	// col_101
				{$col_102, "CUSTOM_SUM_COL"},	// col_102
				{$col_103, "CUSTOM_SUM_COL"},	// col_103
				{$col_104, "CUSTOM_SUM_COL"},	// col_104
				{$col_105, "CUSTOM_SUM_COL"},	// col_105
				{$col_106, "CUSTOM_SUM_COL"},	// col_106
				{$col_107, "CUSTOM_SUM_COL"},	// col_107
				{$col_108, "CUSTOM_SUM_COL"},	// col_108
				{$col_109, "CUSTOM_SUM_COL"},	// col_109
				{$col_110, "CUSTOM_SUM_COL"},	// col_110
				{$col_111, "CUSTOM_SUM_COL"},	// col_111
				{$col_112, "CUSTOM_SUM_COL"},	// col_112
				{$col_113, "CUSTOM_SUM_COL"},	// col_113
				{$col_114, "CUSTOM_SUM_COL"},	// col_114
				{$col_115, "CUSTOM_SUM_COL"},	// col_115
				{$col_116, "CUSTOM_SUM_COL"},	// col_116
				{$col_117, "CUSTOM_SUM_COL"},	// col_117
				{$col_118, "CUSTOM_SUM_COL"},	// col_118
				{$col_119, "CUSTOM_SUM_COL"},	// col_119
				{$col_120, "CUSTOM_SUM_COL"},	// col_120
				{$col_121, "CUSTOM_SUM_COL"},	// col_121
				{$col_122, "CUSTOM_SUM_COL"},	// col_122
				{$col_123, "CUSTOM_SUM_COL"},	// col_123
				{$col_124, "CUSTOM_SUM_COL"},	// col_124
				{$col_125, "CUSTOM_SUM_COL"},	// col_125
				{$col_126, "CUSTOM_SUM_COL"},	// col_126
				{$col_127, "CUSTOM_SUM_COL"},	// col_127
				{$col_128, "CUSTOM_SUM_COL"},	// col_128
				{$col_129, "CUSTOM_SUM_COL"},	// col_129
				{$col_130, "CUSTOM_SUM_COL"},	// col_130
				{$col_131, "CUSTOM_SUM_COL"},	// col_131
				{$col_132, "CUSTOM_SUM_COL"},	// col_132
				{$col_133, "CUSTOM_SUM_COL"},	// col_133
				{$col_134, "CUSTOM_SUM_COL"},	// col_134
				{$col_135, "CUSTOM_SUM_COL"},	// col_135
				{$col_136, "CUSTOM_SUM_COL"},	// col_136
				{$col_137, "CUSTOM_SUM_COL"},	// col_137
				{$col_138, "CUSTOM_SUM_COL"},	// col_138
				{$col_139, "CUSTOM_SUM_COL"},	// col_139
				{$col_140, "CUSTOM_SUM_COL"},	// col_140
				{$col_141, "CUSTOM_SUM_COL"},	// col_141
				{$col_142, "CUSTOM_SUM_COL"},	// col_142
				{$col_143, "CUSTOM_SUM_COL"},	// col_143
				{$col_144, "CUSTOM_SUM_COL"},	// col_144
				{$col_145, "CUSTOM_SUM_COL"},	// col_145
				{$col_146, "CUSTOM_SUM_COL"},	// col_146
				{$col_147, "CUSTOM_SUM_COL"},	// col_147
				{$col_148, "CUSTOM_SUM_COL"},	// col_148
				{$col_149, "CUSTOM_SUM_COL"},	// col_149
				{$col_150, "CUSTOM_SUM_COL"},	// col_150
				{$col_151, "CUSTOM_SUM_COL"},	// col_151
				{$col_152, "CUSTOM_SUM_COL"},	// col_152
				{$col_153, "CUSTOM_SUM_COL"},	// col_153
				{$col_154, "CUSTOM_SUM_COL"},	// col_154
				{$col_155, "CUSTOM_SUM_COL"},	// col_155
				{$col_156, "CUSTOM_SUM_COL"},	// col_156
				{$col_157, "CUSTOM_SUM_COL"},	// col_157
				{$col_158, "CUSTOM_SUM_COL"},	// col_158
				{$col_159, "CUSTOM_SUM_COL"},	// col_159
				{$col_160, "CUSTOM_SUM_COL"},	// col_160
				{$col_161, "CUSTOM_SUM_COL"},	// col_161
				{$col_162, "CUSTOM_SUM_COL"},	// col_162
				{$col_163, "CUSTOM_SUM_COL"},	// col_163
				{$col_164, "CUSTOM_SUM_COL"},	// col_164
				{$col_165, "CUSTOM_SUM_COL"},	// col_165
				{$col_166, "CUSTOM_SUM_COL"},	// col_166
				{$col_167, "CUSTOM_SUM_COL"},	// col_167
				{$col_168, "CUSTOM_SUM_COL"},	// col_168
				{$col_169, "CUSTOM_SUM_COL"},	// col_169
				{$col_170, "CUSTOM_SUM_COL"},	// col_170
				{$col_171, "CUSTOM_SUM_COL"},	// col_171
				{$col_172, "CUSTOM_SUM_COL"},	// col_172
				{$col_173, "CUSTOM_SUM_COL"},	// col_173
				{$col_174, "CUSTOM_SUM_COL"},	// col_174
				{$col_175, "CUSTOM_SUM_COL"},	// col_175
				{$col_176, "CUSTOM_SUM_COL"},	// col_176
				{$col_177, "CUSTOM_SUM_COL"},	// col_177
				{$col_178, "CUSTOM_SUM_COL"},	// col_178
				{$col_179, "CUSTOM_SUM_COL"},	// col_179
				{$col_180, "CUSTOM_SUM_COL"},	// col_180
				{$col_181, "CUSTOM_SUM_COL"},	// col_181
				{$col_182, "CUSTOM_SUM_COL"},	// col_182
				{$col_183, "CUSTOM_SUM_COL"},	// col_183
				{$col_184, "CUSTOM_SUM_COL"},	// col_184
				{$col_185, "CUSTOM_SUM_COL"},	// col_185
				{$col_186, "CUSTOM_SUM_COL"},	// col_186
				{$col_187, "CUSTOM_SUM_COL"},	// col_187
				{$col_188, "CUSTOM_SUM_COL"},	// col_188
				{$col_189, "CUSTOM_SUM_COL"},	// col_189
				{$col_190, "CUSTOM_SUM_COL"},	// col_190
				{$col_191, "CUSTOM_SUM_COL"},	// col_191
				{$col_192, "CUSTOM_SUM_COL"},	// col_192
				{$col_193, "CUSTOM_SUM_COL"},	// col_193
				{$col_194, "CUSTOM_SUM_COL"},	// col_194
				{$col_195, "CUSTOM_SUM_COL"},	// col_195
				{$col_196, "CUSTOM_SUM_COL"},	// col_196
				{$col_197, "CUSTOM_SUM_COL"},	// col_197
				{$col_198, "CUSTOM_SUM_COL"},	// col_198
				{$col_199, "CUSTOM_SUM_COL"}	// col_199
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
	 * Calculation setting info. (Dummy for join) 原価計算設定情報（結合用ダミー）.<p>
	 *
	 */
	public MCDate dummy_term() {
		return getConstDate(offset + 0, $dummy_term);
	}

	/**
	 * Calculation setting info. (Dummy for join) 原価計算設定情報（結合用ダミー）.<p>
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
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 7, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 7, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 8, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 8, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 9, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 9, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 10, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 10, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 11, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 11, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 12, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 12, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 13, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 13, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 14, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 14, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 15, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 15, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 16, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 16, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 17, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 17, $itm_jnl_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 18, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 18, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 19, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 19, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 20, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 20, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 21, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 21, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 22, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 22, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 23, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 23, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 24, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 24, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 25, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 25, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 26, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 26, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 27, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 27, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 28, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 28, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 29, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 29, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 30, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 30, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 31, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 31, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 32, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 32, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 33, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 33, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 34, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 34, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 35, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 35, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 36, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 36, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 37, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 37, $itm_grp_nm10, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 38, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 38, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 39, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 39, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 40, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 40, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 41, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 41, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 42, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 42, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 43, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 43, $sno4, value);
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 44, $ac_slip_typ);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 44, $ac_slip_typ, value);
	}


	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public String ac_slip_typ_nm() {
		return getConstString(offset + 45, $ac_slip_typ_nm);
	}

	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public void ac_slip_typ_nm(String value) {
		setConstString(offset + 45, $ac_slip_typ_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 46, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 46, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 47, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 47, $ac_rsn_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 48, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 48, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 49, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 49, $asst_typ_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 50, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 50, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 51, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 51, $cst_nm, value);
	}


	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return getConstString(offset + 52, $cst_grp_cd1);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		setConstString(offset + 52, $cst_grp_cd1, value);
	}


	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return getConstString(offset + 53, $cst_grp_nm1);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		setConstString(offset + 53, $cst_grp_nm1, value);
	}


	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return getConstString(offset + 54, $cst_grp_cd2);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		setConstString(offset + 54, $cst_grp_cd2, value);
	}


	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return getConstString(offset + 55, $cst_grp_nm2);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		setConstString(offset + 55, $cst_grp_nm2, value);
	}


	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return getConstString(offset + 56, $cst_grp_cd3);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		setConstString(offset + 56, $cst_grp_cd3, value);
	}


	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return getConstString(offset + 57, $cst_grp_nm3);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		setConstString(offset + 57, $cst_grp_nm3, value);
	}


	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return getConstString(offset + 58, $cst_grp_cd4);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		setConstString(offset + 58, $cst_grp_cd4, value);
	}


	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return getConstString(offset + 59, $cst_grp_nm4);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		setConstString(offset + 59, $cst_grp_nm4, value);
	}


	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return getConstString(offset + 60, $cst_grp_cd5);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		setConstString(offset + 60, $cst_grp_cd5, value);
	}


	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return getConstString(offset + 61, $cst_grp_nm5);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		setConstString(offset + 61, $cst_grp_nm5, value);
	}


	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return getConstString(offset + 62, $cst_grp_cd6);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		setConstString(offset + 62, $cst_grp_cd6, value);
	}


	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return getConstString(offset + 63, $cst_grp_nm6);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		setConstString(offset + 63, $cst_grp_nm6, value);
	}


	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return getConstString(offset + 64, $cst_grp_cd7);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		setConstString(offset + 64, $cst_grp_cd7, value);
	}


	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return getConstString(offset + 65, $cst_grp_nm7);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		setConstString(offset + 65, $cst_grp_nm7, value);
	}


	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return getConstString(offset + 66, $cst_grp_cd8);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		setConstString(offset + 66, $cst_grp_cd8, value);
	}


	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return getConstString(offset + 67, $cst_grp_nm8);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		setConstString(offset + 67, $cst_grp_nm8, value);
	}


	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return getConstString(offset + 68, $cst_grp_cd9);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		setConstString(offset + 68, $cst_grp_cd9, value);
	}


	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return getConstString(offset + 69, $cst_grp_nm9);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		setConstString(offset + 69, $cst_grp_nm9, value);
	}


	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return getConstString(offset + 70, $cst_grp_cd10);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		setConstString(offset + 70, $cst_grp_cd10, value);
	}


	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return getConstString(offset + 71, $cst_grp_nm10);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		setConstString(offset + 71, $cst_grp_nm10, value);
	}


	/**
	 * Country cd. (Customer) 国ＣＤ（得意先）.<p>
	 *
	 */
	public String cst_cntry_cd() {
		return getConstString(offset + 72, $cst_cntry_cd);
	}

	/**
	 * Country cd. (Customer) 国ＣＤ（得意先）.<p>
	 *
	 */
	public void cst_cntry_cd(String value) {
		setConstString(offset + 72, $cst_cntry_cd, value);
	}


	/**
	 * Country name (Customer) 国名（得意先）.<p>
	 *
	 */
	public String cst_cntry_nm() {
		return getConstString(offset + 73, $cst_cntry_nm);
	}

	/**
	 * Country name (Customer) 国名（得意先）.<p>
	 *
	 */
	public void cst_cntry_nm(String value) {
		setConstString(offset + 73, $cst_cntry_nm, value);
	}


	/**
	 * Region cd. (Customer) 地域ＣＤ（得意先）.<p>
	 *
	 */
	public String cst_area_cd() {
		return getConstString(offset + 74, $cst_area_cd);
	}

	/**
	 * Region cd. (Customer) 地域ＣＤ（得意先）.<p>
	 *
	 */
	public void cst_area_cd(String value) {
		setConstString(offset + 74, $cst_area_cd, value);
	}


	/**
	 * Region name (Customer) 地域名（得意先）.<p>
	 *
	 */
	public String cst_area_nm() {
		return getConstString(offset + 75, $cst_area_nm);
	}

	/**
	 * Region name (Customer) 地域名（得意先）.<p>
	 *
	 */
	public void cst_area_nm(String value) {
		setConstString(offset + 75, $cst_area_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 76, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 76, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 77, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 77, $dlv_nm, value);
	}


	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_grp_cd1() {
		return getConstString(offset + 78, $dlv_grp_cd1);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_grp_cd1(String value) {
		setConstString(offset + 78, $dlv_grp_cd1, value);
	}


	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_grp_nm1() {
		return getConstString(offset + 79, $dlv_grp_nm1);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_grp_nm1(String value) {
		setConstString(offset + 79, $dlv_grp_nm1, value);
	}


	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_grp_cd2() {
		return getConstString(offset + 80, $dlv_grp_cd2);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_grp_cd2(String value) {
		setConstString(offset + 80, $dlv_grp_cd2, value);
	}


	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_grp_nm2() {
		return getConstString(offset + 81, $dlv_grp_nm2);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_grp_nm2(String value) {
		setConstString(offset + 81, $dlv_grp_nm2, value);
	}


	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_grp_cd3() {
		return getConstString(offset + 82, $dlv_grp_cd3);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_grp_cd3(String value) {
		setConstString(offset + 82, $dlv_grp_cd3, value);
	}


	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_grp_nm3() {
		return getConstString(offset + 83, $dlv_grp_nm3);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_grp_nm3(String value) {
		setConstString(offset + 83, $dlv_grp_nm3, value);
	}


	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_grp_cd4() {
		return getConstString(offset + 84, $dlv_grp_cd4);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_grp_cd4(String value) {
		setConstString(offset + 84, $dlv_grp_cd4, value);
	}


	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_grp_nm4() {
		return getConstString(offset + 85, $dlv_grp_nm4);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_grp_nm4(String value) {
		setConstString(offset + 85, $dlv_grp_nm4, value);
	}


	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_grp_cd5() {
		return getConstString(offset + 86, $dlv_grp_cd5);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_grp_cd5(String value) {
		setConstString(offset + 86, $dlv_grp_cd5, value);
	}


	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_grp_nm5() {
		return getConstString(offset + 87, $dlv_grp_nm5);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_grp_nm5(String value) {
		setConstString(offset + 87, $dlv_grp_nm5, value);
	}


	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_grp_cd6() {
		return getConstString(offset + 88, $dlv_grp_cd6);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_grp_cd6(String value) {
		setConstString(offset + 88, $dlv_grp_cd6, value);
	}


	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_grp_nm6() {
		return getConstString(offset + 89, $dlv_grp_nm6);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_grp_nm6(String value) {
		setConstString(offset + 89, $dlv_grp_nm6, value);
	}


	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_grp_cd7() {
		return getConstString(offset + 90, $dlv_grp_cd7);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_grp_cd7(String value) {
		setConstString(offset + 90, $dlv_grp_cd7, value);
	}


	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_grp_nm7() {
		return getConstString(offset + 91, $dlv_grp_nm7);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_grp_nm7(String value) {
		setConstString(offset + 91, $dlv_grp_nm7, value);
	}


	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_grp_cd8() {
		return getConstString(offset + 92, $dlv_grp_cd8);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_grp_cd8(String value) {
		setConstString(offset + 92, $dlv_grp_cd8, value);
	}


	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_grp_nm8() {
		return getConstString(offset + 93, $dlv_grp_nm8);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_grp_nm8(String value) {
		setConstString(offset + 93, $dlv_grp_nm8, value);
	}


	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_grp_cd9() {
		return getConstString(offset + 94, $dlv_grp_cd9);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_grp_cd9(String value) {
		setConstString(offset + 94, $dlv_grp_cd9, value);
	}


	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_grp_nm9() {
		return getConstString(offset + 95, $dlv_grp_nm9);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_grp_nm9(String value) {
		setConstString(offset + 95, $dlv_grp_nm9, value);
	}


	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_grp_cd10() {
		return getConstString(offset + 96, $dlv_grp_cd10);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_grp_cd10(String value) {
		setConstString(offset + 96, $dlv_grp_cd10, value);
	}


	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_grp_nm10() {
		return getConstString(offset + 97, $dlv_grp_nm10);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_grp_nm10(String value) {
		setConstString(offset + 97, $dlv_grp_nm10, value);
	}


	/**
	 * Country cd. (Delivery) 国ＣＤ（納品先）.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return getConstString(offset + 98, $dlv_cntry_cd);
	}

	/**
	 * Country cd. (Delivery) 国ＣＤ（納品先）.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		setConstString(offset + 98, $dlv_cntry_cd, value);
	}


	/**
	 * Country name (Delivery) 国名（納品先）.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 99, $dlv_cntry_nm);
	}

	/**
	 * Country name (Delivery) 国名（納品先）.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 99, $dlv_cntry_nm, value);
	}


	/**
	 * Region cd. (Delivery) 地域ＣＤ（納品先）.<p>
	 *
	 */
	public String dlv_area_cd() {
		return getConstString(offset + 100, $dlv_area_cd);
	}

	/**
	 * Region cd. (Delivery) 地域ＣＤ（納品先）.<p>
	 *
	 */
	public void dlv_area_cd(String value) {
		setConstString(offset + 100, $dlv_area_cd, value);
	}


	/**
	 * Region name (Delivery) 地域名（納品先）.<p>
	 *
	 */
	public String dlv_area_nm() {
		return getConstString(offset + 101, $dlv_area_nm);
	}

	/**
	 * Region name (Delivery) 地域名（納品先）.<p>
	 *
	 */
	public void dlv_area_nm(String value) {
		setConstString(offset + 101, $dlv_area_nm, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 102, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 102, $slo_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 103, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 103, $iv_no, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 104, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 104, $sls_dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 105, $sls_dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 105, $sls_dpt_nm, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 106, $sls_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 106, $sls_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 107, $sls_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 107, $sls_usr_nm, value);
	}


	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 108, $stk_bp_cd);
	}

	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 108, $stk_bp_cd, value);
	}


	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 109, $stk_bp_nm);
	}

	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 109, $stk_bp_nm, value);
	}


	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public String alc_dpt_cd() {
		return getConstString(offset + 110, $alc_dpt_cd);
	}

	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public void alc_dpt_cd(String value) {
		setConstString(offset + 110, $alc_dpt_cd, value);
	}


	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public String alc_dpt_nm() {
		return getConstString(offset + 111, $alc_dpt_nm);
	}

	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public void alc_dpt_nm(String value) {
		setConstString(offset + 111, $alc_dpt_nm, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 112, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 112, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 113, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 113, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 114, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 114, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 115, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 115, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 116, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 116, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 117, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 117, $dest_nm3, value);
	}


	/**
	 * Sales classification cd. 1 売上分類ＣＤ１.<p>
	 *
	 */
	public String cost_sls_cd1() {
		return getConstString(offset + 118, $cost_sls_cd1);
	}

	/**
	 * Sales classification cd. 1 売上分類ＣＤ１.<p>
	 *
	 */
	public void cost_sls_cd1(String value) {
		setConstString(offset + 118, $cost_sls_cd1, value);
	}


	/**
	 * Sales classification name 1 売上分類名１.<p>
	 *
	 */
	public String cost_sls_nm1() {
		return getConstString(offset + 119, $cost_sls_nm1);
	}

	/**
	 * Sales classification name 1 売上分類名１.<p>
	 *
	 */
	public void cost_sls_nm1(String value) {
		setConstString(offset + 119, $cost_sls_nm1, value);
	}


	/**
	 * Sales classification cd. 2 売上分類ＣＤ２.<p>
	 *
	 */
	public String cost_sls_cd2() {
		return getConstString(offset + 120, $cost_sls_cd2);
	}

	/**
	 * Sales classification cd. 2 売上分類ＣＤ２.<p>
	 *
	 */
	public void cost_sls_cd2(String value) {
		setConstString(offset + 120, $cost_sls_cd2, value);
	}


	/**
	 * Sales classification name 2 売上分類名２.<p>
	 *
	 */
	public String cost_sls_nm2() {
		return getConstString(offset + 121, $cost_sls_nm2);
	}

	/**
	 * Sales classification name 2 売上分類名２.<p>
	 *
	 */
	public void cost_sls_nm2(String value) {
		setConstString(offset + 121, $cost_sls_nm2, value);
	}


	/**
	 * Sales classification cd. 3 売上分類ＣＤ３.<p>
	 *
	 */
	public String cost_sls_cd3() {
		return getConstString(offset + 122, $cost_sls_cd3);
	}

	/**
	 * Sales classification cd. 3 売上分類ＣＤ３.<p>
	 *
	 */
	public void cost_sls_cd3(String value) {
		setConstString(offset + 122, $cost_sls_cd3, value);
	}


	/**
	 * Sales classification name 3 売上分類名３.<p>
	 *
	 */
	public String cost_sls_nm3() {
		return getConstString(offset + 123, $cost_sls_nm3);
	}

	/**
	 * Sales classification name 3 売上分類名３.<p>
	 *
	 */
	public void cost_sls_nm3(String value) {
		setConstString(offset + 123, $cost_sls_nm3, value);
	}


	/**
	 * Sales classification cd. 4 売上分類ＣＤ４.<p>
	 *
	 */
	public String cost_sls_cd4() {
		return getConstString(offset + 124, $cost_sls_cd4);
	}

	/**
	 * Sales classification cd. 4 売上分類ＣＤ４.<p>
	 *
	 */
	public void cost_sls_cd4(String value) {
		setConstString(offset + 124, $cost_sls_cd4, value);
	}


	/**
	 * Sales classification name 4 売上分類名４.<p>
	 *
	 */
	public String cost_sls_nm4() {
		return getConstString(offset + 125, $cost_sls_nm4);
	}

	/**
	 * Sales classification name 4 売上分類名４.<p>
	 *
	 */
	public void cost_sls_nm4(String value) {
		setConstString(offset + 125, $cost_sls_nm4, value);
	}


	/**
	 * Sales classification cd. 5 売上分類ＣＤ５.<p>
	 *
	 */
	public String cost_sls_cd5() {
		return getConstString(offset + 126, $cost_sls_cd5);
	}

	/**
	 * Sales classification cd. 5 売上分類ＣＤ５.<p>
	 *
	 */
	public void cost_sls_cd5(String value) {
		setConstString(offset + 126, $cost_sls_cd5, value);
	}


	/**
	 * Sales classification name 5 売上分類名５.<p>
	 *
	 */
	public String cost_sls_nm5() {
		return getConstString(offset + 127, $cost_sls_nm5);
	}

	/**
	 * Sales classification name 5 売上分類名５.<p>
	 *
	 */
	public void cost_sls_nm5(String value) {
		setConstString(offset + 127, $cost_sls_nm5, value);
	}


	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public String rec_eval_typ() {
		return getConstString(offset + 128, $rec_eval_typ);
	}

	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public void rec_eval_typ(String value) {
		setConstString(offset + 128, $rec_eval_typ, value);
	}


	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public String rec_eval_typ_nm() {
		return getConstString(offset + 129, $rec_eval_typ_nm);
	}

	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public void rec_eval_typ_nm(String value) {
		setConstString(offset + 129, $rec_eval_typ_nm, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 130, $qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 130, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 130, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 130, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 130, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 130, $qty, value);
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
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 134, $trd_cur_amt);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 134, $trd_cur_amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 134, $trd_cur_amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 134, $trd_cur_amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 134, $trd_cur_amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 134, $trd_cur_amt, value);
	}


	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public MCNumber cur_std_amt() {
		return getConstNumber(offset + 135, $cur_std_amt);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void cur_std_amt(MCNumber value) {
		setConstNumber(offset + 135, $cur_std_amt, value);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void cur_std_amt(int value) {
		setConstNumber(offset + 135, $cur_std_amt, value);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void cur_std_amt(long value) {
		setConstNumber(offset + 135, $cur_std_amt, value);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void cur_std_amt(float value) {
		setConstNumber(offset + 135, $cur_std_amt, value);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void cur_std_amt(double value) {
		setConstNumber(offset + 135, $cur_std_amt, value);
	}


	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public MCNumber cur_amt_diff() {
		return getConstNumber(offset + 136, $cur_amt_diff);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void cur_amt_diff(MCNumber value) {
		setConstNumber(offset + 136, $cur_amt_diff, value);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void cur_amt_diff(int value) {
		setConstNumber(offset + 136, $cur_amt_diff, value);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void cur_amt_diff(long value) {
		setConstNumber(offset + 136, $cur_amt_diff, value);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void cur_amt_diff(float value) {
		setConstNumber(offset + 136, $cur_amt_diff, value);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void cur_amt_diff(double value) {
		setConstNumber(offset + 136, $cur_amt_diff, value);
	}


	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public MCNumber unit_trd_cur_amt() {
		return getConstNumber(offset + 137, $unit_trd_cur_amt);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void unit_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 137, $unit_trd_cur_amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void unit_trd_cur_amt(int value) {
		setConstNumber(offset + 137, $unit_trd_cur_amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void unit_trd_cur_amt(long value) {
		setConstNumber(offset + 137, $unit_trd_cur_amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void unit_trd_cur_amt(float value) {
		setConstNumber(offset + 137, $unit_trd_cur_amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void unit_trd_cur_amt(double value) {
		setConstNumber(offset + 137, $unit_trd_cur_amt, value);
	}


	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public MCNumber unit_cur_std_amt() {
		return getConstNumber(offset + 138, $unit_cur_std_amt);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void unit_cur_std_amt(MCNumber value) {
		setConstNumber(offset + 138, $unit_cur_std_amt, value);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void unit_cur_std_amt(int value) {
		setConstNumber(offset + 138, $unit_cur_std_amt, value);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void unit_cur_std_amt(long value) {
		setConstNumber(offset + 138, $unit_cur_std_amt, value);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void unit_cur_std_amt(float value) {
		setConstNumber(offset + 138, $unit_cur_std_amt, value);
	}

	/**
	 * Standard transaction amount 標準取引金額.<p>
	 *
	 */
	public void unit_cur_std_amt(double value) {
		setConstNumber(offset + 138, $unit_cur_std_amt, value);
	}


	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public MCNumber unit_cur_amt_diff() {
		return getConstNumber(offset + 139, $unit_cur_amt_diff);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void unit_cur_amt_diff(MCNumber value) {
		setConstNumber(offset + 139, $unit_cur_amt_diff, value);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void unit_cur_amt_diff(int value) {
		setConstNumber(offset + 139, $unit_cur_amt_diff, value);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void unit_cur_amt_diff(long value) {
		setConstNumber(offset + 139, $unit_cur_amt_diff, value);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void unit_cur_amt_diff(float value) {
		setConstNumber(offset + 139, $unit_cur_amt_diff, value);
	}

	/**
	 * Transaction amount variance 取引金額差異.<p>
	 *
	 */
	public void unit_cur_amt_diff(double value) {
		setConstNumber(offset + 139, $unit_cur_amt_diff, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 140, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 140, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 141, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 141, $trd_cur_nm, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 142, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 142, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 142, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 142, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 142, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 142, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 143, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 143, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 143, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 143, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 143, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 143, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 144, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 144, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 144, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 144, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 144, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 144, $xrate, value);
	}


	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public MCNumber std_xrate() {
		return getConstNumber(offset + 145, $std_xrate);
	}

	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public void std_xrate(MCNumber value) {
		setConstNumber(offset + 145, $std_xrate, value);
	}

	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public void std_xrate(int value) {
		setConstNumber(offset + 145, $std_xrate, value);
	}

	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public void std_xrate(long value) {
		setConstNumber(offset + 145, $std_xrate, value);
	}

	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public void std_xrate(float value) {
		setConstNumber(offset + 145, $std_xrate, value);
	}

	/**
	 * Standard exchange rate 標準為替レート.<p>
	 *
	 */
	public void std_xrate(double value) {
		setConstNumber(offset + 145, $std_xrate, value);
	}


	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public MCNumber xrate_diff() {
		return getConstNumber(offset + 146, $xrate_diff);
	}

	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public void xrate_diff(MCNumber value) {
		setConstNumber(offset + 146, $xrate_diff, value);
	}

	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public void xrate_diff(int value) {
		setConstNumber(offset + 146, $xrate_diff, value);
	}

	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public void xrate_diff(long value) {
		setConstNumber(offset + 146, $xrate_diff, value);
	}

	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public void xrate_diff(float value) {
		setConstNumber(offset + 146, $xrate_diff, value);
	}

	/**
	 * Rate variance レート差異.<p>
	 *
	 */
	public void xrate_diff(double value) {
		setConstNumber(offset + 146, $xrate_diff, value);
	}


	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 147, $amt);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 147, $amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 147, $amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 147, $amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 147, $amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 147, $amt, value);
	}


	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public MCNumber std_amt() {
		return getConstNumber(offset + 148, $std_amt);
	}

	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public void std_amt(MCNumber value) {
		setConstNumber(offset + 148, $std_amt, value);
	}

	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public void std_amt(int value) {
		setConstNumber(offset + 148, $std_amt, value);
	}

	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public void std_amt(long value) {
		setConstNumber(offset + 148, $std_amt, value);
	}

	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public void std_amt(float value) {
		setConstNumber(offset + 148, $std_amt, value);
	}

	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public void std_amt(double value) {
		setConstNumber(offset + 148, $std_amt, value);
	}


	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public MCNumber amt_diff() {
		return getConstNumber(offset + 149, $amt_diff);
	}

	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public void amt_diff(MCNumber value) {
		setConstNumber(offset + 149, $amt_diff, value);
	}

	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public void amt_diff(int value) {
		setConstNumber(offset + 149, $amt_diff, value);
	}

	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public void amt_diff(long value) {
		setConstNumber(offset + 149, $amt_diff, value);
	}

	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public void amt_diff(float value) {
		setConstNumber(offset + 149, $amt_diff, value);
	}

	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public void amt_diff(double value) {
		setConstNumber(offset + 149, $amt_diff, value);
	}


	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public MCNumber amt_upri_diff() {
		return getConstNumber(offset + 150, $amt_upri_diff);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void amt_upri_diff(MCNumber value) {
		setConstNumber(offset + 150, $amt_upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void amt_upri_diff(int value) {
		setConstNumber(offset + 150, $amt_upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void amt_upri_diff(long value) {
		setConstNumber(offset + 150, $amt_upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void amt_upri_diff(float value) {
		setConstNumber(offset + 150, $amt_upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void amt_upri_diff(double value) {
		setConstNumber(offset + 150, $amt_upri_diff, value);
	}


	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public MCNumber amt_rate_diff() {
		return getConstNumber(offset + 151, $amt_rate_diff);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void amt_rate_diff(MCNumber value) {
		setConstNumber(offset + 151, $amt_rate_diff, value);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void amt_rate_diff(int value) {
		setConstNumber(offset + 151, $amt_rate_diff, value);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void amt_rate_diff(long value) {
		setConstNumber(offset + 151, $amt_rate_diff, value);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void amt_rate_diff(float value) {
		setConstNumber(offset + 151, $amt_rate_diff, value);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void amt_rate_diff(double value) {
		setConstNumber(offset + 151, $amt_rate_diff, value);
	}


	/**
	 * Operating income 利益.<p>
	 *
	 */
	public MCNumber profit() {
		return getConstNumber(offset + 152, $profit);
	}

	/**
	 * Operating income 利益.<p>
	 *
	 */
	public void profit(MCNumber value) {
		setConstNumber(offset + 152, $profit, value);
	}

	/**
	 * Operating income 利益.<p>
	 *
	 */
	public void profit(int value) {
		setConstNumber(offset + 152, $profit, value);
	}

	/**
	 * Operating income 利益.<p>
	 *
	 */
	public void profit(long value) {
		setConstNumber(offset + 152, $profit, value);
	}

	/**
	 * Operating income 利益.<p>
	 *
	 */
	public void profit(float value) {
		setConstNumber(offset + 152, $profit, value);
	}

	/**
	 * Operating income 利益.<p>
	 *
	 */
	public void profit(double value) {
		setConstNumber(offset + 152, $profit, value);
	}


	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public MCNumber std_profit() {
		return getConstNumber(offset + 153, $std_profit);
	}

	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public void std_profit(MCNumber value) {
		setConstNumber(offset + 153, $std_profit, value);
	}

	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public void std_profit(int value) {
		setConstNumber(offset + 153, $std_profit, value);
	}

	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public void std_profit(long value) {
		setConstNumber(offset + 153, $std_profit, value);
	}

	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public void std_profit(float value) {
		setConstNumber(offset + 153, $std_profit, value);
	}

	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public void std_profit(double value) {
		setConstNumber(offset + 153, $std_profit, value);
	}


	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public MCNumber unit_amt() {
		return getConstNumber(offset + 154, $unit_amt);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void unit_amt(MCNumber value) {
		setConstNumber(offset + 154, $unit_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void unit_amt(int value) {
		setConstNumber(offset + 154, $unit_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void unit_amt(long value) {
		setConstNumber(offset + 154, $unit_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void unit_amt(float value) {
		setConstNumber(offset + 154, $unit_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void unit_amt(double value) {
		setConstNumber(offset + 154, $unit_amt, value);
	}


	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public MCNumber unit_std_amt() {
		return getConstNumber(offset + 155, $unit_std_amt);
	}

	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public void unit_std_amt(MCNumber value) {
		setConstNumber(offset + 155, $unit_std_amt, value);
	}

	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public void unit_std_amt(int value) {
		setConstNumber(offset + 155, $unit_std_amt, value);
	}

	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public void unit_std_amt(long value) {
		setConstNumber(offset + 155, $unit_std_amt, value);
	}

	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public void unit_std_amt(float value) {
		setConstNumber(offset + 155, $unit_std_amt, value);
	}

	/**
	 * Standard sales amount 標準売上金額.<p>
	 *
	 */
	public void unit_std_amt(double value) {
		setConstNumber(offset + 155, $unit_std_amt, value);
	}


	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public MCNumber unit_amt_diff() {
		return getConstNumber(offset + 156, $unit_amt_diff);
	}

	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public void unit_amt_diff(MCNumber value) {
		setConstNumber(offset + 156, $unit_amt_diff, value);
	}

	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public void unit_amt_diff(int value) {
		setConstNumber(offset + 156, $unit_amt_diff, value);
	}

	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public void unit_amt_diff(long value) {
		setConstNumber(offset + 156, $unit_amt_diff, value);
	}

	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public void unit_amt_diff(float value) {
		setConstNumber(offset + 156, $unit_amt_diff, value);
	}

	/**
	 * Sales variance 売上金額差異.<p>
	 *
	 */
	public void unit_amt_diff(double value) {
		setConstNumber(offset + 156, $unit_amt_diff, value);
	}


	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public MCNumber unit_amt_upri_diff() {
		return getConstNumber(offset + 157, $unit_amt_upri_diff);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void unit_amt_upri_diff(MCNumber value) {
		setConstNumber(offset + 157, $unit_amt_upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void unit_amt_upri_diff(int value) {
		setConstNumber(offset + 157, $unit_amt_upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void unit_amt_upri_diff(long value) {
		setConstNumber(offset + 157, $unit_amt_upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void unit_amt_upri_diff(float value) {
		setConstNumber(offset + 157, $unit_amt_upri_diff, value);
	}

	/**
	 * Unit price variance 単価差異金額.<p>
	 *
	 */
	public void unit_amt_upri_diff(double value) {
		setConstNumber(offset + 157, $unit_amt_upri_diff, value);
	}


	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public MCNumber unit_amt_rate_diff() {
		return getConstNumber(offset + 158, $unit_amt_rate_diff);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void unit_amt_rate_diff(MCNumber value) {
		setConstNumber(offset + 158, $unit_amt_rate_diff, value);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void unit_amt_rate_diff(int value) {
		setConstNumber(offset + 158, $unit_amt_rate_diff, value);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void unit_amt_rate_diff(long value) {
		setConstNumber(offset + 158, $unit_amt_rate_diff, value);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void unit_amt_rate_diff(float value) {
		setConstNumber(offset + 158, $unit_amt_rate_diff, value);
	}

	/**
	 * Rate variance レート差異金額.<p>
	 *
	 */
	public void unit_amt_rate_diff(double value) {
		setConstNumber(offset + 158, $unit_amt_rate_diff, value);
	}


	/**
	 * Operating income 利益.<p>
	 *
	 */
	public MCNumber unit_profit() {
		return getConstNumber(offset + 159, $unit_profit);
	}

	/**
	 * Operating income 利益.<p>
	 *
	 */
	public void unit_profit(MCNumber value) {
		setConstNumber(offset + 159, $unit_profit, value);
	}

	/**
	 * Operating income 利益.<p>
	 *
	 */
	public void unit_profit(int value) {
		setConstNumber(offset + 159, $unit_profit, value);
	}

	/**
	 * Operating income 利益.<p>
	 *
	 */
	public void unit_profit(long value) {
		setConstNumber(offset + 159, $unit_profit, value);
	}

	/**
	 * Operating income 利益.<p>
	 *
	 */
	public void unit_profit(float value) {
		setConstNumber(offset + 159, $unit_profit, value);
	}

	/**
	 * Operating income 利益.<p>
	 *
	 */
	public void unit_profit(double value) {
		setConstNumber(offset + 159, $unit_profit, value);
	}


	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public MCNumber unit_std_profit() {
		return getConstNumber(offset + 160, $unit_std_profit);
	}

	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public void unit_std_profit(MCNumber value) {
		setConstNumber(offset + 160, $unit_std_profit, value);
	}

	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public void unit_std_profit(int value) {
		setConstNumber(offset + 160, $unit_std_profit, value);
	}

	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public void unit_std_profit(long value) {
		setConstNumber(offset + 160, $unit_std_profit, value);
	}

	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public void unit_std_profit(float value) {
		setConstNumber(offset + 160, $unit_std_profit, value);
	}

	/**
	 * Standard operating income 標準利益.<p>
	 *
	 */
	public void unit_std_profit(double value) {
		setConstNumber(offset + 160, $unit_std_profit, value);
	}


	/**
	 * Operating income ratio 利益率.<p>
	 *
	 */
	public MCNumber profit_rate() {
		return getConstNumber(offset + 161, $profit_rate);
	}

	/**
	 * Operating income ratio 利益率.<p>
	 *
	 */
	public void profit_rate(MCNumber value) {
		setConstNumber(offset + 161, $profit_rate, value);
	}

	/**
	 * Operating income ratio 利益率.<p>
	 *
	 */
	public void profit_rate(int value) {
		setConstNumber(offset + 161, $profit_rate, value);
	}

	/**
	 * Operating income ratio 利益率.<p>
	 *
	 */
	public void profit_rate(long value) {
		setConstNumber(offset + 161, $profit_rate, value);
	}

	/**
	 * Operating income ratio 利益率.<p>
	 *
	 */
	public void profit_rate(float value) {
		setConstNumber(offset + 161, $profit_rate, value);
	}

	/**
	 * Operating income ratio 利益率.<p>
	 *
	 */
	public void profit_rate(double value) {
		setConstNumber(offset + 161, $profit_rate, value);
	}


	/**
	 * Standard operating income ratio 標準利益率.<p>
	 *
	 */
	public MCNumber std_profit_rate() {
		return getConstNumber(offset + 162, $std_profit_rate);
	}

	/**
	 * Standard operating income ratio 標準利益率.<p>
	 *
	 */
	public void std_profit_rate(MCNumber value) {
		setConstNumber(offset + 162, $std_profit_rate, value);
	}

	/**
	 * Standard operating income ratio 標準利益率.<p>
	 *
	 */
	public void std_profit_rate(int value) {
		setConstNumber(offset + 162, $std_profit_rate, value);
	}

	/**
	 * Standard operating income ratio 標準利益率.<p>
	 *
	 */
	public void std_profit_rate(long value) {
		setConstNumber(offset + 162, $std_profit_rate, value);
	}

	/**
	 * Standard operating income ratio 標準利益率.<p>
	 *
	 */
	public void std_profit_rate(float value) {
		setConstNumber(offset + 162, $std_profit_rate, value);
	}

	/**
	 * Standard operating income ratio 標準利益率.<p>
	 *
	 */
	public void std_profit_rate(double value) {
		setConstNumber(offset + 162, $std_profit_rate, value);
	}


	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public MCNumber sls_profit() {
		return getConstNumber(offset + 163, $sls_profit);
	}

	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public void sls_profit(MCNumber value) {
		setConstNumber(offset + 163, $sls_profit, value);
	}

	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public void sls_profit(int value) {
		setConstNumber(offset + 163, $sls_profit, value);
	}

	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public void sls_profit(long value) {
		setConstNumber(offset + 163, $sls_profit, value);
	}

	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public void sls_profit(float value) {
		setConstNumber(offset + 163, $sls_profit, value);
	}

	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public void sls_profit(double value) {
		setConstNumber(offset + 163, $sls_profit, value);
	}


	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public MCNumber std_sls_profit() {
		return getConstNumber(offset + 164, $std_sls_profit);
	}

	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public void std_sls_profit(MCNumber value) {
		setConstNumber(offset + 164, $std_sls_profit, value);
	}

	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public void std_sls_profit(int value) {
		setConstNumber(offset + 164, $std_sls_profit, value);
	}

	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public void std_sls_profit(long value) {
		setConstNumber(offset + 164, $std_sls_profit, value);
	}

	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public void std_sls_profit(float value) {
		setConstNumber(offset + 164, $std_sls_profit, value);
	}

	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public void std_sls_profit(double value) {
		setConstNumber(offset + 164, $std_sls_profit, value);
	}


	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public MCNumber unit_sls_profit() {
		return getConstNumber(offset + 165, $unit_sls_profit);
	}

	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public void unit_sls_profit(MCNumber value) {
		setConstNumber(offset + 165, $unit_sls_profit, value);
	}

	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public void unit_sls_profit(int value) {
		setConstNumber(offset + 165, $unit_sls_profit, value);
	}

	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public void unit_sls_profit(long value) {
		setConstNumber(offset + 165, $unit_sls_profit, value);
	}

	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public void unit_sls_profit(float value) {
		setConstNumber(offset + 165, $unit_sls_profit, value);
	}

	/**
	 * Gross profit 売上利益.<p>
	 *
	 */
	public void unit_sls_profit(double value) {
		setConstNumber(offset + 165, $unit_sls_profit, value);
	}


	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public MCNumber unit_std_sls_profit() {
		return getConstNumber(offset + 166, $unit_std_sls_profit);
	}

	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public void unit_std_sls_profit(MCNumber value) {
		setConstNumber(offset + 166, $unit_std_sls_profit, value);
	}

	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public void unit_std_sls_profit(int value) {
		setConstNumber(offset + 166, $unit_std_sls_profit, value);
	}

	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public void unit_std_sls_profit(long value) {
		setConstNumber(offset + 166, $unit_std_sls_profit, value);
	}

	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public void unit_std_sls_profit(float value) {
		setConstNumber(offset + 166, $unit_std_sls_profit, value);
	}

	/**
	 * Standard gross profit 標準売上利益.<p>
	 *
	 */
	public void unit_std_sls_profit(double value) {
		setConstNumber(offset + 166, $unit_std_sls_profit, value);
	}


	/**
	 * Gross profit ratio 売上利益率.<p>
	 *
	 */
	public MCNumber sls_profit_rate() {
		return getConstNumber(offset + 167, $sls_profit_rate);
	}

	/**
	 * Gross profit ratio 売上利益率.<p>
	 *
	 */
	public void sls_profit_rate(MCNumber value) {
		setConstNumber(offset + 167, $sls_profit_rate, value);
	}

	/**
	 * Gross profit ratio 売上利益率.<p>
	 *
	 */
	public void sls_profit_rate(int value) {
		setConstNumber(offset + 167, $sls_profit_rate, value);
	}

	/**
	 * Gross profit ratio 売上利益率.<p>
	 *
	 */
	public void sls_profit_rate(long value) {
		setConstNumber(offset + 167, $sls_profit_rate, value);
	}

	/**
	 * Gross profit ratio 売上利益率.<p>
	 *
	 */
	public void sls_profit_rate(float value) {
		setConstNumber(offset + 167, $sls_profit_rate, value);
	}

	/**
	 * Gross profit ratio 売上利益率.<p>
	 *
	 */
	public void sls_profit_rate(double value) {
		setConstNumber(offset + 167, $sls_profit_rate, value);
	}


	/**
	 * Standard gross profit ratio 標準売上利益率.<p>
	 *
	 */
	public MCNumber std_sls_profit_rate() {
		return getConstNumber(offset + 168, $std_sls_profit_rate);
	}

	/**
	 * Standard gross profit ratio 標準売上利益率.<p>
	 *
	 */
	public void std_sls_profit_rate(MCNumber value) {
		setConstNumber(offset + 168, $std_sls_profit_rate, value);
	}

	/**
	 * Standard gross profit ratio 標準売上利益率.<p>
	 *
	 */
	public void std_sls_profit_rate(int value) {
		setConstNumber(offset + 168, $std_sls_profit_rate, value);
	}

	/**
	 * Standard gross profit ratio 標準売上利益率.<p>
	 *
	 */
	public void std_sls_profit_rate(long value) {
		setConstNumber(offset + 168, $std_sls_profit_rate, value);
	}

	/**
	 * Standard gross profit ratio 標準売上利益率.<p>
	 *
	 */
	public void std_sls_profit_rate(float value) {
		setConstNumber(offset + 168, $std_sls_profit_rate, value);
	}

	/**
	 * Standard gross profit ratio 標準売上利益率.<p>
	 *
	 */
	public void std_sls_profit_rate(double value) {
		setConstNumber(offset + 168, $std_sls_profit_rate, value);
	}


	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public MCNumber limit_profit() {
		return getConstNumber(offset + 169, $limit_profit);
	}

	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public void limit_profit(MCNumber value) {
		setConstNumber(offset + 169, $limit_profit, value);
	}

	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public void limit_profit(int value) {
		setConstNumber(offset + 169, $limit_profit, value);
	}

	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public void limit_profit(long value) {
		setConstNumber(offset + 169, $limit_profit, value);
	}

	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public void limit_profit(float value) {
		setConstNumber(offset + 169, $limit_profit, value);
	}

	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public void limit_profit(double value) {
		setConstNumber(offset + 169, $limit_profit, value);
	}


	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public MCNumber unit_limit_profit() {
		return getConstNumber(offset + 170, $unit_limit_profit);
	}

	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public void unit_limit_profit(MCNumber value) {
		setConstNumber(offset + 170, $unit_limit_profit, value);
	}

	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public void unit_limit_profit(int value) {
		setConstNumber(offset + 170, $unit_limit_profit, value);
	}

	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public void unit_limit_profit(long value) {
		setConstNumber(offset + 170, $unit_limit_profit, value);
	}

	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public void unit_limit_profit(float value) {
		setConstNumber(offset + 170, $unit_limit_profit, value);
	}

	/**
	 * Marginal profit 限界利益.<p>
	 *
	 */
	public void unit_limit_profit(double value) {
		setConstNumber(offset + 170, $unit_limit_profit, value);
	}


	/**
	 * Marginal profit ratio 限界利益率.<p>
	 *
	 */
	public MCNumber limit_profit_rate() {
		return getConstNumber(offset + 171, $limit_profit_rate);
	}

	/**
	 * Marginal profit ratio 限界利益率.<p>
	 *
	 */
	public void limit_profit_rate(MCNumber value) {
		setConstNumber(offset + 171, $limit_profit_rate, value);
	}

	/**
	 * Marginal profit ratio 限界利益率.<p>
	 *
	 */
	public void limit_profit_rate(int value) {
		setConstNumber(offset + 171, $limit_profit_rate, value);
	}

	/**
	 * Marginal profit ratio 限界利益率.<p>
	 *
	 */
	public void limit_profit_rate(long value) {
		setConstNumber(offset + 171, $limit_profit_rate, value);
	}

	/**
	 * Marginal profit ratio 限界利益率.<p>
	 *
	 */
	public void limit_profit_rate(float value) {
		setConstNumber(offset + 171, $limit_profit_rate, value);
	}

	/**
	 * Marginal profit ratio 限界利益率.<p>
	 *
	 */
	public void limit_profit_rate(double value) {
		setConstNumber(offset + 171, $limit_profit_rate, value);
	}


	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public MCNumber var() {
		return getConstNumber(offset + 172, $var);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var(MCNumber value) {
		setConstNumber(offset + 172, $var, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var(int value) {
		setConstNumber(offset + 172, $var, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var(long value) {
		setConstNumber(offset + 172, $var, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var(float value) {
		setConstNumber(offset + 172, $var, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void var(double value) {
		setConstNumber(offset + 172, $var, value);
	}


	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public MCNumber fxd() {
		return getConstNumber(offset + 173, $fxd);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd(MCNumber value) {
		setConstNumber(offset + 173, $fxd, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd(int value) {
		setConstNumber(offset + 173, $fxd, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd(long value) {
		setConstNumber(offset + 173, $fxd, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd(float value) {
		setConstNumber(offset + 173, $fxd, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void fxd(double value) {
		setConstNumber(offset + 173, $fxd, value);
	}


	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public MCNumber diff() {
		return getConstNumber(offset + 174, $diff);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void diff(MCNumber value) {
		setConstNumber(offset + 174, $diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void diff(int value) {
		setConstNumber(offset + 174, $diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void diff(long value) {
		setConstNumber(offset + 174, $diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void diff(float value) {
		setConstNumber(offset + 174, $diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void diff(double value) {
		setConstNumber(offset + 174, $diff, value);
	}


	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public MCNumber std_cost() {
		return getConstNumber(offset + 175, $std_cost);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void std_cost(MCNumber value) {
		setConstNumber(offset + 175, $std_cost, value);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void std_cost(int value) {
		setConstNumber(offset + 175, $std_cost, value);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void std_cost(long value) {
		setConstNumber(offset + 175, $std_cost, value);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void std_cost(float value) {
		setConstNumber(offset + 175, $std_cost, value);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void std_cost(double value) {
		setConstNumber(offset + 175, $std_cost, value);
	}


	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public MCNumber std_sls_cost() {
		return getConstNumber(offset + 176, $std_sls_cost);
	}

	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public void std_sls_cost(MCNumber value) {
		setConstNumber(offset + 176, $std_sls_cost, value);
	}

	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public void std_sls_cost(int value) {
		setConstNumber(offset + 176, $std_sls_cost, value);
	}

	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public void std_sls_cost(long value) {
		setConstNumber(offset + 176, $std_sls_cost, value);
	}

	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public void std_sls_cost(float value) {
		setConstNumber(offset + 176, $std_sls_cost, value);
	}

	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public void std_sls_cost(double value) {
		setConstNumber(offset + 176, $std_sls_cost, value);
	}


	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public MCNumber std_sls_mng_cost() {
		return getConstNumber(offset + 177, $std_sls_mng_cost);
	}

	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public void std_sls_mng_cost(MCNumber value) {
		setConstNumber(offset + 177, $std_sls_mng_cost, value);
	}

	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public void std_sls_mng_cost(int value) {
		setConstNumber(offset + 177, $std_sls_mng_cost, value);
	}

	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public void std_sls_mng_cost(long value) {
		setConstNumber(offset + 177, $std_sls_mng_cost, value);
	}

	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public void std_sls_mng_cost(float value) {
		setConstNumber(offset + 177, $std_sls_mng_cost, value);
	}

	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public void std_sls_mng_cost(double value) {
		setConstNumber(offset + 177, $std_sls_mng_cost, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 178, $ttl);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 178, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 178, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 178, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 178, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 178, $ttl, value);
	}


	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public MCNumber sls_cost() {
		return getConstNumber(offset + 179, $sls_cost);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void sls_cost(MCNumber value) {
		setConstNumber(offset + 179, $sls_cost, value);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void sls_cost(int value) {
		setConstNumber(offset + 179, $sls_cost, value);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void sls_cost(long value) {
		setConstNumber(offset + 179, $sls_cost, value);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void sls_cost(float value) {
		setConstNumber(offset + 179, $sls_cost, value);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void sls_cost(double value) {
		setConstNumber(offset + 179, $sls_cost, value);
	}


	/**
	 * SGA 販管費.<p>
	 *
	 */
	public MCNumber sls_mng_cost() {
		return getConstNumber(offset + 180, $sls_mng_cost);
	}

	/**
	 * SGA 販管費.<p>
	 *
	 */
	public void sls_mng_cost(MCNumber value) {
		setConstNumber(offset + 180, $sls_mng_cost, value);
	}

	/**
	 * SGA 販管費.<p>
	 *
	 */
	public void sls_mng_cost(int value) {
		setConstNumber(offset + 180, $sls_mng_cost, value);
	}

	/**
	 * SGA 販管費.<p>
	 *
	 */
	public void sls_mng_cost(long value) {
		setConstNumber(offset + 180, $sls_mng_cost, value);
	}

	/**
	 * SGA 販管費.<p>
	 *
	 */
	public void sls_mng_cost(float value) {
		setConstNumber(offset + 180, $sls_mng_cost, value);
	}

	/**
	 * SGA 販管費.<p>
	 *
	 */
	public void sls_mng_cost(double value) {
		setConstNumber(offset + 180, $sls_mng_cost, value);
	}


	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public MCNumber unit_var() {
		return getConstNumber(offset + 181, $unit_var);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void unit_var(MCNumber value) {
		setConstNumber(offset + 181, $unit_var, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void unit_var(int value) {
		setConstNumber(offset + 181, $unit_var, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void unit_var(long value) {
		setConstNumber(offset + 181, $unit_var, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void unit_var(float value) {
		setConstNumber(offset + 181, $unit_var, value);
	}

	/**
	 * Variable cost 変動費.<p>
	 *
	 */
	public void unit_var(double value) {
		setConstNumber(offset + 181, $unit_var, value);
	}


	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public MCNumber unit_fxd() {
		return getConstNumber(offset + 182, $unit_fxd);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void unit_fxd(MCNumber value) {
		setConstNumber(offset + 182, $unit_fxd, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void unit_fxd(int value) {
		setConstNumber(offset + 182, $unit_fxd, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void unit_fxd(long value) {
		setConstNumber(offset + 182, $unit_fxd, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void unit_fxd(float value) {
		setConstNumber(offset + 182, $unit_fxd, value);
	}

	/**
	 * Fixed cost 固定費.<p>
	 *
	 */
	public void unit_fxd(double value) {
		setConstNumber(offset + 182, $unit_fxd, value);
	}


	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public MCNumber unit_diff() {
		return getConstNumber(offset + 183, $unit_diff);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void unit_diff(MCNumber value) {
		setConstNumber(offset + 183, $unit_diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void unit_diff(int value) {
		setConstNumber(offset + 183, $unit_diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void unit_diff(long value) {
		setConstNumber(offset + 183, $unit_diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void unit_diff(float value) {
		setConstNumber(offset + 183, $unit_diff, value);
	}

	/**
	 * Cost variance 原価差異.<p>
	 *
	 */
	public void unit_diff(double value) {
		setConstNumber(offset + 183, $unit_diff, value);
	}


	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public MCNumber unit_std_cost() {
		return getConstNumber(offset + 184, $unit_std_cost);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void unit_std_cost(MCNumber value) {
		setConstNumber(offset + 184, $unit_std_cost, value);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void unit_std_cost(int value) {
		setConstNumber(offset + 184, $unit_std_cost, value);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void unit_std_cost(long value) {
		setConstNumber(offset + 184, $unit_std_cost, value);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void unit_std_cost(float value) {
		setConstNumber(offset + 184, $unit_std_cost, value);
	}

	/**
	 * Standard cost 標準原価.<p>
	 *
	 */
	public void unit_std_cost(double value) {
		setConstNumber(offset + 184, $unit_std_cost, value);
	}


	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public MCNumber unit_std_sls_cost() {
		return getConstNumber(offset + 185, $unit_std_sls_cost);
	}

	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public void unit_std_sls_cost(MCNumber value) {
		setConstNumber(offset + 185, $unit_std_sls_cost, value);
	}

	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public void unit_std_sls_cost(int value) {
		setConstNumber(offset + 185, $unit_std_sls_cost, value);
	}

	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public void unit_std_sls_cost(long value) {
		setConstNumber(offset + 185, $unit_std_sls_cost, value);
	}

	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public void unit_std_sls_cost(float value) {
		setConstNumber(offset + 185, $unit_std_sls_cost, value);
	}

	/**
	 * Standard cost of goods sold 標準売上原価.<p>
	 *
	 */
	public void unit_std_sls_cost(double value) {
		setConstNumber(offset + 185, $unit_std_sls_cost, value);
	}


	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public MCNumber unit_std_sls_mng_cost() {
		return getConstNumber(offset + 186, $unit_std_sls_mng_cost);
	}

	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public void unit_std_sls_mng_cost(MCNumber value) {
		setConstNumber(offset + 186, $unit_std_sls_mng_cost, value);
	}

	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public void unit_std_sls_mng_cost(int value) {
		setConstNumber(offset + 186, $unit_std_sls_mng_cost, value);
	}

	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public void unit_std_sls_mng_cost(long value) {
		setConstNumber(offset + 186, $unit_std_sls_mng_cost, value);
	}

	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public void unit_std_sls_mng_cost(float value) {
		setConstNumber(offset + 186, $unit_std_sls_mng_cost, value);
	}

	/**
	 * Standard SGA 標準販管費.<p>
	 *
	 */
	public void unit_std_sls_mng_cost(double value) {
		setConstNumber(offset + 186, $unit_std_sls_mng_cost, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber unit_ttl() {
		return getConstNumber(offset + 187, $unit_ttl);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void unit_ttl(MCNumber value) {
		setConstNumber(offset + 187, $unit_ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void unit_ttl(int value) {
		setConstNumber(offset + 187, $unit_ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void unit_ttl(long value) {
		setConstNumber(offset + 187, $unit_ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void unit_ttl(float value) {
		setConstNumber(offset + 187, $unit_ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void unit_ttl(double value) {
		setConstNumber(offset + 187, $unit_ttl, value);
	}


	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public MCNumber unit_sls_cost() {
		return getConstNumber(offset + 188, $unit_sls_cost);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void unit_sls_cost(MCNumber value) {
		setConstNumber(offset + 188, $unit_sls_cost, value);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void unit_sls_cost(int value) {
		setConstNumber(offset + 188, $unit_sls_cost, value);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void unit_sls_cost(long value) {
		setConstNumber(offset + 188, $unit_sls_cost, value);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void unit_sls_cost(float value) {
		setConstNumber(offset + 188, $unit_sls_cost, value);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void unit_sls_cost(double value) {
		setConstNumber(offset + 188, $unit_sls_cost, value);
	}


	/**
	 * SGA 販管費.<p>
	 *
	 */
	public MCNumber unit_sls_mng_cost() {
		return getConstNumber(offset + 189, $unit_sls_mng_cost);
	}

	/**
	 * SGA 販管費.<p>
	 *
	 */
	public void unit_sls_mng_cost(MCNumber value) {
		setConstNumber(offset + 189, $unit_sls_mng_cost, value);
	}

	/**
	 * SGA 販管費.<p>
	 *
	 */
	public void unit_sls_mng_cost(int value) {
		setConstNumber(offset + 189, $unit_sls_mng_cost, value);
	}

	/**
	 * SGA 販管費.<p>
	 *
	 */
	public void unit_sls_mng_cost(long value) {
		setConstNumber(offset + 189, $unit_sls_mng_cost, value);
	}

	/**
	 * SGA 販管費.<p>
	 *
	 */
	public void unit_sls_mng_cost(float value) {
		setConstNumber(offset + 189, $unit_sls_mng_cost, value);
	}

	/**
	 * SGA 販管費.<p>
	 *
	 */
	public void unit_sls_mng_cost(double value) {
		setConstNumber(offset + 189, $unit_sls_mng_cost, value);
	}


	public MCNumber col_000() {
		return getConstNumber(offset + 190, $col_000);
	}

	public void col_000(MCNumber value) {
		setConstNumber(offset + 190, $col_000, value);
	}

	public void col_000(int value) {
		setConstNumber(offset + 190, $col_000, value);
	}

	public void col_000(long value) {
		setConstNumber(offset + 190, $col_000, value);
	}

	public void col_000(float value) {
		setConstNumber(offset + 190, $col_000, value);
	}

	public void col_000(double value) {
		setConstNumber(offset + 190, $col_000, value);
	}


	public MCNumber col_001() {
		return getConstNumber(offset + 191, $col_001);
	}

	public void col_001(MCNumber value) {
		setConstNumber(offset + 191, $col_001, value);
	}

	public void col_001(int value) {
		setConstNumber(offset + 191, $col_001, value);
	}

	public void col_001(long value) {
		setConstNumber(offset + 191, $col_001, value);
	}

	public void col_001(float value) {
		setConstNumber(offset + 191, $col_001, value);
	}

	public void col_001(double value) {
		setConstNumber(offset + 191, $col_001, value);
	}


	public MCNumber col_002() {
		return getConstNumber(offset + 192, $col_002);
	}

	public void col_002(MCNumber value) {
		setConstNumber(offset + 192, $col_002, value);
	}

	public void col_002(int value) {
		setConstNumber(offset + 192, $col_002, value);
	}

	public void col_002(long value) {
		setConstNumber(offset + 192, $col_002, value);
	}

	public void col_002(float value) {
		setConstNumber(offset + 192, $col_002, value);
	}

	public void col_002(double value) {
		setConstNumber(offset + 192, $col_002, value);
	}


	public MCNumber col_003() {
		return getConstNumber(offset + 193, $col_003);
	}

	public void col_003(MCNumber value) {
		setConstNumber(offset + 193, $col_003, value);
	}

	public void col_003(int value) {
		setConstNumber(offset + 193, $col_003, value);
	}

	public void col_003(long value) {
		setConstNumber(offset + 193, $col_003, value);
	}

	public void col_003(float value) {
		setConstNumber(offset + 193, $col_003, value);
	}

	public void col_003(double value) {
		setConstNumber(offset + 193, $col_003, value);
	}


	public MCNumber col_004() {
		return getConstNumber(offset + 194, $col_004);
	}

	public void col_004(MCNumber value) {
		setConstNumber(offset + 194, $col_004, value);
	}

	public void col_004(int value) {
		setConstNumber(offset + 194, $col_004, value);
	}

	public void col_004(long value) {
		setConstNumber(offset + 194, $col_004, value);
	}

	public void col_004(float value) {
		setConstNumber(offset + 194, $col_004, value);
	}

	public void col_004(double value) {
		setConstNumber(offset + 194, $col_004, value);
	}


	public MCNumber col_005() {
		return getConstNumber(offset + 195, $col_005);
	}

	public void col_005(MCNumber value) {
		setConstNumber(offset + 195, $col_005, value);
	}

	public void col_005(int value) {
		setConstNumber(offset + 195, $col_005, value);
	}

	public void col_005(long value) {
		setConstNumber(offset + 195, $col_005, value);
	}

	public void col_005(float value) {
		setConstNumber(offset + 195, $col_005, value);
	}

	public void col_005(double value) {
		setConstNumber(offset + 195, $col_005, value);
	}


	public MCNumber col_006() {
		return getConstNumber(offset + 196, $col_006);
	}

	public void col_006(MCNumber value) {
		setConstNumber(offset + 196, $col_006, value);
	}

	public void col_006(int value) {
		setConstNumber(offset + 196, $col_006, value);
	}

	public void col_006(long value) {
		setConstNumber(offset + 196, $col_006, value);
	}

	public void col_006(float value) {
		setConstNumber(offset + 196, $col_006, value);
	}

	public void col_006(double value) {
		setConstNumber(offset + 196, $col_006, value);
	}


	public MCNumber col_007() {
		return getConstNumber(offset + 197, $col_007);
	}

	public void col_007(MCNumber value) {
		setConstNumber(offset + 197, $col_007, value);
	}

	public void col_007(int value) {
		setConstNumber(offset + 197, $col_007, value);
	}

	public void col_007(long value) {
		setConstNumber(offset + 197, $col_007, value);
	}

	public void col_007(float value) {
		setConstNumber(offset + 197, $col_007, value);
	}

	public void col_007(double value) {
		setConstNumber(offset + 197, $col_007, value);
	}


	public MCNumber col_008() {
		return getConstNumber(offset + 198, $col_008);
	}

	public void col_008(MCNumber value) {
		setConstNumber(offset + 198, $col_008, value);
	}

	public void col_008(int value) {
		setConstNumber(offset + 198, $col_008, value);
	}

	public void col_008(long value) {
		setConstNumber(offset + 198, $col_008, value);
	}

	public void col_008(float value) {
		setConstNumber(offset + 198, $col_008, value);
	}

	public void col_008(double value) {
		setConstNumber(offset + 198, $col_008, value);
	}


	public MCNumber col_009() {
		return getConstNumber(offset + 199, $col_009);
	}

	public void col_009(MCNumber value) {
		setConstNumber(offset + 199, $col_009, value);
	}

	public void col_009(int value) {
		setConstNumber(offset + 199, $col_009, value);
	}

	public void col_009(long value) {
		setConstNumber(offset + 199, $col_009, value);
	}

	public void col_009(float value) {
		setConstNumber(offset + 199, $col_009, value);
	}

	public void col_009(double value) {
		setConstNumber(offset + 199, $col_009, value);
	}


	public MCNumber col_010() {
		return getConstNumber(offset + 200, $col_010);
	}

	public void col_010(MCNumber value) {
		setConstNumber(offset + 200, $col_010, value);
	}

	public void col_010(int value) {
		setConstNumber(offset + 200, $col_010, value);
	}

	public void col_010(long value) {
		setConstNumber(offset + 200, $col_010, value);
	}

	public void col_010(float value) {
		setConstNumber(offset + 200, $col_010, value);
	}

	public void col_010(double value) {
		setConstNumber(offset + 200, $col_010, value);
	}


	public MCNumber col_011() {
		return getConstNumber(offset + 201, $col_011);
	}

	public void col_011(MCNumber value) {
		setConstNumber(offset + 201, $col_011, value);
	}

	public void col_011(int value) {
		setConstNumber(offset + 201, $col_011, value);
	}

	public void col_011(long value) {
		setConstNumber(offset + 201, $col_011, value);
	}

	public void col_011(float value) {
		setConstNumber(offset + 201, $col_011, value);
	}

	public void col_011(double value) {
		setConstNumber(offset + 201, $col_011, value);
	}


	public MCNumber col_012() {
		return getConstNumber(offset + 202, $col_012);
	}

	public void col_012(MCNumber value) {
		setConstNumber(offset + 202, $col_012, value);
	}

	public void col_012(int value) {
		setConstNumber(offset + 202, $col_012, value);
	}

	public void col_012(long value) {
		setConstNumber(offset + 202, $col_012, value);
	}

	public void col_012(float value) {
		setConstNumber(offset + 202, $col_012, value);
	}

	public void col_012(double value) {
		setConstNumber(offset + 202, $col_012, value);
	}


	public MCNumber col_013() {
		return getConstNumber(offset + 203, $col_013);
	}

	public void col_013(MCNumber value) {
		setConstNumber(offset + 203, $col_013, value);
	}

	public void col_013(int value) {
		setConstNumber(offset + 203, $col_013, value);
	}

	public void col_013(long value) {
		setConstNumber(offset + 203, $col_013, value);
	}

	public void col_013(float value) {
		setConstNumber(offset + 203, $col_013, value);
	}

	public void col_013(double value) {
		setConstNumber(offset + 203, $col_013, value);
	}


	public MCNumber col_014() {
		return getConstNumber(offset + 204, $col_014);
	}

	public void col_014(MCNumber value) {
		setConstNumber(offset + 204, $col_014, value);
	}

	public void col_014(int value) {
		setConstNumber(offset + 204, $col_014, value);
	}

	public void col_014(long value) {
		setConstNumber(offset + 204, $col_014, value);
	}

	public void col_014(float value) {
		setConstNumber(offset + 204, $col_014, value);
	}

	public void col_014(double value) {
		setConstNumber(offset + 204, $col_014, value);
	}


	public MCNumber col_015() {
		return getConstNumber(offset + 205, $col_015);
	}

	public void col_015(MCNumber value) {
		setConstNumber(offset + 205, $col_015, value);
	}

	public void col_015(int value) {
		setConstNumber(offset + 205, $col_015, value);
	}

	public void col_015(long value) {
		setConstNumber(offset + 205, $col_015, value);
	}

	public void col_015(float value) {
		setConstNumber(offset + 205, $col_015, value);
	}

	public void col_015(double value) {
		setConstNumber(offset + 205, $col_015, value);
	}


	public MCNumber col_016() {
		return getConstNumber(offset + 206, $col_016);
	}

	public void col_016(MCNumber value) {
		setConstNumber(offset + 206, $col_016, value);
	}

	public void col_016(int value) {
		setConstNumber(offset + 206, $col_016, value);
	}

	public void col_016(long value) {
		setConstNumber(offset + 206, $col_016, value);
	}

	public void col_016(float value) {
		setConstNumber(offset + 206, $col_016, value);
	}

	public void col_016(double value) {
		setConstNumber(offset + 206, $col_016, value);
	}


	public MCNumber col_017() {
		return getConstNumber(offset + 207, $col_017);
	}

	public void col_017(MCNumber value) {
		setConstNumber(offset + 207, $col_017, value);
	}

	public void col_017(int value) {
		setConstNumber(offset + 207, $col_017, value);
	}

	public void col_017(long value) {
		setConstNumber(offset + 207, $col_017, value);
	}

	public void col_017(float value) {
		setConstNumber(offset + 207, $col_017, value);
	}

	public void col_017(double value) {
		setConstNumber(offset + 207, $col_017, value);
	}


	public MCNumber col_018() {
		return getConstNumber(offset + 208, $col_018);
	}

	public void col_018(MCNumber value) {
		setConstNumber(offset + 208, $col_018, value);
	}

	public void col_018(int value) {
		setConstNumber(offset + 208, $col_018, value);
	}

	public void col_018(long value) {
		setConstNumber(offset + 208, $col_018, value);
	}

	public void col_018(float value) {
		setConstNumber(offset + 208, $col_018, value);
	}

	public void col_018(double value) {
		setConstNumber(offset + 208, $col_018, value);
	}


	public MCNumber col_019() {
		return getConstNumber(offset + 209, $col_019);
	}

	public void col_019(MCNumber value) {
		setConstNumber(offset + 209, $col_019, value);
	}

	public void col_019(int value) {
		setConstNumber(offset + 209, $col_019, value);
	}

	public void col_019(long value) {
		setConstNumber(offset + 209, $col_019, value);
	}

	public void col_019(float value) {
		setConstNumber(offset + 209, $col_019, value);
	}

	public void col_019(double value) {
		setConstNumber(offset + 209, $col_019, value);
	}


	public MCNumber col_020() {
		return getConstNumber(offset + 210, $col_020);
	}

	public void col_020(MCNumber value) {
		setConstNumber(offset + 210, $col_020, value);
	}

	public void col_020(int value) {
		setConstNumber(offset + 210, $col_020, value);
	}

	public void col_020(long value) {
		setConstNumber(offset + 210, $col_020, value);
	}

	public void col_020(float value) {
		setConstNumber(offset + 210, $col_020, value);
	}

	public void col_020(double value) {
		setConstNumber(offset + 210, $col_020, value);
	}


	public MCNumber col_021() {
		return getConstNumber(offset + 211, $col_021);
	}

	public void col_021(MCNumber value) {
		setConstNumber(offset + 211, $col_021, value);
	}

	public void col_021(int value) {
		setConstNumber(offset + 211, $col_021, value);
	}

	public void col_021(long value) {
		setConstNumber(offset + 211, $col_021, value);
	}

	public void col_021(float value) {
		setConstNumber(offset + 211, $col_021, value);
	}

	public void col_021(double value) {
		setConstNumber(offset + 211, $col_021, value);
	}


	public MCNumber col_022() {
		return getConstNumber(offset + 212, $col_022);
	}

	public void col_022(MCNumber value) {
		setConstNumber(offset + 212, $col_022, value);
	}

	public void col_022(int value) {
		setConstNumber(offset + 212, $col_022, value);
	}

	public void col_022(long value) {
		setConstNumber(offset + 212, $col_022, value);
	}

	public void col_022(float value) {
		setConstNumber(offset + 212, $col_022, value);
	}

	public void col_022(double value) {
		setConstNumber(offset + 212, $col_022, value);
	}


	public MCNumber col_023() {
		return getConstNumber(offset + 213, $col_023);
	}

	public void col_023(MCNumber value) {
		setConstNumber(offset + 213, $col_023, value);
	}

	public void col_023(int value) {
		setConstNumber(offset + 213, $col_023, value);
	}

	public void col_023(long value) {
		setConstNumber(offset + 213, $col_023, value);
	}

	public void col_023(float value) {
		setConstNumber(offset + 213, $col_023, value);
	}

	public void col_023(double value) {
		setConstNumber(offset + 213, $col_023, value);
	}


	public MCNumber col_024() {
		return getConstNumber(offset + 214, $col_024);
	}

	public void col_024(MCNumber value) {
		setConstNumber(offset + 214, $col_024, value);
	}

	public void col_024(int value) {
		setConstNumber(offset + 214, $col_024, value);
	}

	public void col_024(long value) {
		setConstNumber(offset + 214, $col_024, value);
	}

	public void col_024(float value) {
		setConstNumber(offset + 214, $col_024, value);
	}

	public void col_024(double value) {
		setConstNumber(offset + 214, $col_024, value);
	}


	public MCNumber col_025() {
		return getConstNumber(offset + 215, $col_025);
	}

	public void col_025(MCNumber value) {
		setConstNumber(offset + 215, $col_025, value);
	}

	public void col_025(int value) {
		setConstNumber(offset + 215, $col_025, value);
	}

	public void col_025(long value) {
		setConstNumber(offset + 215, $col_025, value);
	}

	public void col_025(float value) {
		setConstNumber(offset + 215, $col_025, value);
	}

	public void col_025(double value) {
		setConstNumber(offset + 215, $col_025, value);
	}


	public MCNumber col_026() {
		return getConstNumber(offset + 216, $col_026);
	}

	public void col_026(MCNumber value) {
		setConstNumber(offset + 216, $col_026, value);
	}

	public void col_026(int value) {
		setConstNumber(offset + 216, $col_026, value);
	}

	public void col_026(long value) {
		setConstNumber(offset + 216, $col_026, value);
	}

	public void col_026(float value) {
		setConstNumber(offset + 216, $col_026, value);
	}

	public void col_026(double value) {
		setConstNumber(offset + 216, $col_026, value);
	}


	public MCNumber col_027() {
		return getConstNumber(offset + 217, $col_027);
	}

	public void col_027(MCNumber value) {
		setConstNumber(offset + 217, $col_027, value);
	}

	public void col_027(int value) {
		setConstNumber(offset + 217, $col_027, value);
	}

	public void col_027(long value) {
		setConstNumber(offset + 217, $col_027, value);
	}

	public void col_027(float value) {
		setConstNumber(offset + 217, $col_027, value);
	}

	public void col_027(double value) {
		setConstNumber(offset + 217, $col_027, value);
	}


	public MCNumber col_028() {
		return getConstNumber(offset + 218, $col_028);
	}

	public void col_028(MCNumber value) {
		setConstNumber(offset + 218, $col_028, value);
	}

	public void col_028(int value) {
		setConstNumber(offset + 218, $col_028, value);
	}

	public void col_028(long value) {
		setConstNumber(offset + 218, $col_028, value);
	}

	public void col_028(float value) {
		setConstNumber(offset + 218, $col_028, value);
	}

	public void col_028(double value) {
		setConstNumber(offset + 218, $col_028, value);
	}


	public MCNumber col_029() {
		return getConstNumber(offset + 219, $col_029);
	}

	public void col_029(MCNumber value) {
		setConstNumber(offset + 219, $col_029, value);
	}

	public void col_029(int value) {
		setConstNumber(offset + 219, $col_029, value);
	}

	public void col_029(long value) {
		setConstNumber(offset + 219, $col_029, value);
	}

	public void col_029(float value) {
		setConstNumber(offset + 219, $col_029, value);
	}

	public void col_029(double value) {
		setConstNumber(offset + 219, $col_029, value);
	}


	public MCNumber col_030() {
		return getConstNumber(offset + 220, $col_030);
	}

	public void col_030(MCNumber value) {
		setConstNumber(offset + 220, $col_030, value);
	}

	public void col_030(int value) {
		setConstNumber(offset + 220, $col_030, value);
	}

	public void col_030(long value) {
		setConstNumber(offset + 220, $col_030, value);
	}

	public void col_030(float value) {
		setConstNumber(offset + 220, $col_030, value);
	}

	public void col_030(double value) {
		setConstNumber(offset + 220, $col_030, value);
	}


	public MCNumber col_031() {
		return getConstNumber(offset + 221, $col_031);
	}

	public void col_031(MCNumber value) {
		setConstNumber(offset + 221, $col_031, value);
	}

	public void col_031(int value) {
		setConstNumber(offset + 221, $col_031, value);
	}

	public void col_031(long value) {
		setConstNumber(offset + 221, $col_031, value);
	}

	public void col_031(float value) {
		setConstNumber(offset + 221, $col_031, value);
	}

	public void col_031(double value) {
		setConstNumber(offset + 221, $col_031, value);
	}


	public MCNumber col_032() {
		return getConstNumber(offset + 222, $col_032);
	}

	public void col_032(MCNumber value) {
		setConstNumber(offset + 222, $col_032, value);
	}

	public void col_032(int value) {
		setConstNumber(offset + 222, $col_032, value);
	}

	public void col_032(long value) {
		setConstNumber(offset + 222, $col_032, value);
	}

	public void col_032(float value) {
		setConstNumber(offset + 222, $col_032, value);
	}

	public void col_032(double value) {
		setConstNumber(offset + 222, $col_032, value);
	}


	public MCNumber col_033() {
		return getConstNumber(offset + 223, $col_033);
	}

	public void col_033(MCNumber value) {
		setConstNumber(offset + 223, $col_033, value);
	}

	public void col_033(int value) {
		setConstNumber(offset + 223, $col_033, value);
	}

	public void col_033(long value) {
		setConstNumber(offset + 223, $col_033, value);
	}

	public void col_033(float value) {
		setConstNumber(offset + 223, $col_033, value);
	}

	public void col_033(double value) {
		setConstNumber(offset + 223, $col_033, value);
	}


	public MCNumber col_034() {
		return getConstNumber(offset + 224, $col_034);
	}

	public void col_034(MCNumber value) {
		setConstNumber(offset + 224, $col_034, value);
	}

	public void col_034(int value) {
		setConstNumber(offset + 224, $col_034, value);
	}

	public void col_034(long value) {
		setConstNumber(offset + 224, $col_034, value);
	}

	public void col_034(float value) {
		setConstNumber(offset + 224, $col_034, value);
	}

	public void col_034(double value) {
		setConstNumber(offset + 224, $col_034, value);
	}


	public MCNumber col_035() {
		return getConstNumber(offset + 225, $col_035);
	}

	public void col_035(MCNumber value) {
		setConstNumber(offset + 225, $col_035, value);
	}

	public void col_035(int value) {
		setConstNumber(offset + 225, $col_035, value);
	}

	public void col_035(long value) {
		setConstNumber(offset + 225, $col_035, value);
	}

	public void col_035(float value) {
		setConstNumber(offset + 225, $col_035, value);
	}

	public void col_035(double value) {
		setConstNumber(offset + 225, $col_035, value);
	}


	public MCNumber col_036() {
		return getConstNumber(offset + 226, $col_036);
	}

	public void col_036(MCNumber value) {
		setConstNumber(offset + 226, $col_036, value);
	}

	public void col_036(int value) {
		setConstNumber(offset + 226, $col_036, value);
	}

	public void col_036(long value) {
		setConstNumber(offset + 226, $col_036, value);
	}

	public void col_036(float value) {
		setConstNumber(offset + 226, $col_036, value);
	}

	public void col_036(double value) {
		setConstNumber(offset + 226, $col_036, value);
	}


	public MCNumber col_037() {
		return getConstNumber(offset + 227, $col_037);
	}

	public void col_037(MCNumber value) {
		setConstNumber(offset + 227, $col_037, value);
	}

	public void col_037(int value) {
		setConstNumber(offset + 227, $col_037, value);
	}

	public void col_037(long value) {
		setConstNumber(offset + 227, $col_037, value);
	}

	public void col_037(float value) {
		setConstNumber(offset + 227, $col_037, value);
	}

	public void col_037(double value) {
		setConstNumber(offset + 227, $col_037, value);
	}


	public MCNumber col_038() {
		return getConstNumber(offset + 228, $col_038);
	}

	public void col_038(MCNumber value) {
		setConstNumber(offset + 228, $col_038, value);
	}

	public void col_038(int value) {
		setConstNumber(offset + 228, $col_038, value);
	}

	public void col_038(long value) {
		setConstNumber(offset + 228, $col_038, value);
	}

	public void col_038(float value) {
		setConstNumber(offset + 228, $col_038, value);
	}

	public void col_038(double value) {
		setConstNumber(offset + 228, $col_038, value);
	}


	public MCNumber col_039() {
		return getConstNumber(offset + 229, $col_039);
	}

	public void col_039(MCNumber value) {
		setConstNumber(offset + 229, $col_039, value);
	}

	public void col_039(int value) {
		setConstNumber(offset + 229, $col_039, value);
	}

	public void col_039(long value) {
		setConstNumber(offset + 229, $col_039, value);
	}

	public void col_039(float value) {
		setConstNumber(offset + 229, $col_039, value);
	}

	public void col_039(double value) {
		setConstNumber(offset + 229, $col_039, value);
	}


	public MCNumber col_040() {
		return getConstNumber(offset + 230, $col_040);
	}

	public void col_040(MCNumber value) {
		setConstNumber(offset + 230, $col_040, value);
	}

	public void col_040(int value) {
		setConstNumber(offset + 230, $col_040, value);
	}

	public void col_040(long value) {
		setConstNumber(offset + 230, $col_040, value);
	}

	public void col_040(float value) {
		setConstNumber(offset + 230, $col_040, value);
	}

	public void col_040(double value) {
		setConstNumber(offset + 230, $col_040, value);
	}


	public MCNumber col_041() {
		return getConstNumber(offset + 231, $col_041);
	}

	public void col_041(MCNumber value) {
		setConstNumber(offset + 231, $col_041, value);
	}

	public void col_041(int value) {
		setConstNumber(offset + 231, $col_041, value);
	}

	public void col_041(long value) {
		setConstNumber(offset + 231, $col_041, value);
	}

	public void col_041(float value) {
		setConstNumber(offset + 231, $col_041, value);
	}

	public void col_041(double value) {
		setConstNumber(offset + 231, $col_041, value);
	}


	public MCNumber col_042() {
		return getConstNumber(offset + 232, $col_042);
	}

	public void col_042(MCNumber value) {
		setConstNumber(offset + 232, $col_042, value);
	}

	public void col_042(int value) {
		setConstNumber(offset + 232, $col_042, value);
	}

	public void col_042(long value) {
		setConstNumber(offset + 232, $col_042, value);
	}

	public void col_042(float value) {
		setConstNumber(offset + 232, $col_042, value);
	}

	public void col_042(double value) {
		setConstNumber(offset + 232, $col_042, value);
	}


	public MCNumber col_043() {
		return getConstNumber(offset + 233, $col_043);
	}

	public void col_043(MCNumber value) {
		setConstNumber(offset + 233, $col_043, value);
	}

	public void col_043(int value) {
		setConstNumber(offset + 233, $col_043, value);
	}

	public void col_043(long value) {
		setConstNumber(offset + 233, $col_043, value);
	}

	public void col_043(float value) {
		setConstNumber(offset + 233, $col_043, value);
	}

	public void col_043(double value) {
		setConstNumber(offset + 233, $col_043, value);
	}


	public MCNumber col_044() {
		return getConstNumber(offset + 234, $col_044);
	}

	public void col_044(MCNumber value) {
		setConstNumber(offset + 234, $col_044, value);
	}

	public void col_044(int value) {
		setConstNumber(offset + 234, $col_044, value);
	}

	public void col_044(long value) {
		setConstNumber(offset + 234, $col_044, value);
	}

	public void col_044(float value) {
		setConstNumber(offset + 234, $col_044, value);
	}

	public void col_044(double value) {
		setConstNumber(offset + 234, $col_044, value);
	}


	public MCNumber col_045() {
		return getConstNumber(offset + 235, $col_045);
	}

	public void col_045(MCNumber value) {
		setConstNumber(offset + 235, $col_045, value);
	}

	public void col_045(int value) {
		setConstNumber(offset + 235, $col_045, value);
	}

	public void col_045(long value) {
		setConstNumber(offset + 235, $col_045, value);
	}

	public void col_045(float value) {
		setConstNumber(offset + 235, $col_045, value);
	}

	public void col_045(double value) {
		setConstNumber(offset + 235, $col_045, value);
	}


	public MCNumber col_046() {
		return getConstNumber(offset + 236, $col_046);
	}

	public void col_046(MCNumber value) {
		setConstNumber(offset + 236, $col_046, value);
	}

	public void col_046(int value) {
		setConstNumber(offset + 236, $col_046, value);
	}

	public void col_046(long value) {
		setConstNumber(offset + 236, $col_046, value);
	}

	public void col_046(float value) {
		setConstNumber(offset + 236, $col_046, value);
	}

	public void col_046(double value) {
		setConstNumber(offset + 236, $col_046, value);
	}


	public MCNumber col_047() {
		return getConstNumber(offset + 237, $col_047);
	}

	public void col_047(MCNumber value) {
		setConstNumber(offset + 237, $col_047, value);
	}

	public void col_047(int value) {
		setConstNumber(offset + 237, $col_047, value);
	}

	public void col_047(long value) {
		setConstNumber(offset + 237, $col_047, value);
	}

	public void col_047(float value) {
		setConstNumber(offset + 237, $col_047, value);
	}

	public void col_047(double value) {
		setConstNumber(offset + 237, $col_047, value);
	}


	public MCNumber col_048() {
		return getConstNumber(offset + 238, $col_048);
	}

	public void col_048(MCNumber value) {
		setConstNumber(offset + 238, $col_048, value);
	}

	public void col_048(int value) {
		setConstNumber(offset + 238, $col_048, value);
	}

	public void col_048(long value) {
		setConstNumber(offset + 238, $col_048, value);
	}

	public void col_048(float value) {
		setConstNumber(offset + 238, $col_048, value);
	}

	public void col_048(double value) {
		setConstNumber(offset + 238, $col_048, value);
	}


	public MCNumber col_049() {
		return getConstNumber(offset + 239, $col_049);
	}

	public void col_049(MCNumber value) {
		setConstNumber(offset + 239, $col_049, value);
	}

	public void col_049(int value) {
		setConstNumber(offset + 239, $col_049, value);
	}

	public void col_049(long value) {
		setConstNumber(offset + 239, $col_049, value);
	}

	public void col_049(float value) {
		setConstNumber(offset + 239, $col_049, value);
	}

	public void col_049(double value) {
		setConstNumber(offset + 239, $col_049, value);
	}


	public MCNumber col_050() {
		return getConstNumber(offset + 240, $col_050);
	}

	public void col_050(MCNumber value) {
		setConstNumber(offset + 240, $col_050, value);
	}

	public void col_050(int value) {
		setConstNumber(offset + 240, $col_050, value);
	}

	public void col_050(long value) {
		setConstNumber(offset + 240, $col_050, value);
	}

	public void col_050(float value) {
		setConstNumber(offset + 240, $col_050, value);
	}

	public void col_050(double value) {
		setConstNumber(offset + 240, $col_050, value);
	}


	public MCNumber col_051() {
		return getConstNumber(offset + 241, $col_051);
	}

	public void col_051(MCNumber value) {
		setConstNumber(offset + 241, $col_051, value);
	}

	public void col_051(int value) {
		setConstNumber(offset + 241, $col_051, value);
	}

	public void col_051(long value) {
		setConstNumber(offset + 241, $col_051, value);
	}

	public void col_051(float value) {
		setConstNumber(offset + 241, $col_051, value);
	}

	public void col_051(double value) {
		setConstNumber(offset + 241, $col_051, value);
	}


	public MCNumber col_052() {
		return getConstNumber(offset + 242, $col_052);
	}

	public void col_052(MCNumber value) {
		setConstNumber(offset + 242, $col_052, value);
	}

	public void col_052(int value) {
		setConstNumber(offset + 242, $col_052, value);
	}

	public void col_052(long value) {
		setConstNumber(offset + 242, $col_052, value);
	}

	public void col_052(float value) {
		setConstNumber(offset + 242, $col_052, value);
	}

	public void col_052(double value) {
		setConstNumber(offset + 242, $col_052, value);
	}


	public MCNumber col_053() {
		return getConstNumber(offset + 243, $col_053);
	}

	public void col_053(MCNumber value) {
		setConstNumber(offset + 243, $col_053, value);
	}

	public void col_053(int value) {
		setConstNumber(offset + 243, $col_053, value);
	}

	public void col_053(long value) {
		setConstNumber(offset + 243, $col_053, value);
	}

	public void col_053(float value) {
		setConstNumber(offset + 243, $col_053, value);
	}

	public void col_053(double value) {
		setConstNumber(offset + 243, $col_053, value);
	}


	public MCNumber col_054() {
		return getConstNumber(offset + 244, $col_054);
	}

	public void col_054(MCNumber value) {
		setConstNumber(offset + 244, $col_054, value);
	}

	public void col_054(int value) {
		setConstNumber(offset + 244, $col_054, value);
	}

	public void col_054(long value) {
		setConstNumber(offset + 244, $col_054, value);
	}

	public void col_054(float value) {
		setConstNumber(offset + 244, $col_054, value);
	}

	public void col_054(double value) {
		setConstNumber(offset + 244, $col_054, value);
	}


	public MCNumber col_055() {
		return getConstNumber(offset + 245, $col_055);
	}

	public void col_055(MCNumber value) {
		setConstNumber(offset + 245, $col_055, value);
	}

	public void col_055(int value) {
		setConstNumber(offset + 245, $col_055, value);
	}

	public void col_055(long value) {
		setConstNumber(offset + 245, $col_055, value);
	}

	public void col_055(float value) {
		setConstNumber(offset + 245, $col_055, value);
	}

	public void col_055(double value) {
		setConstNumber(offset + 245, $col_055, value);
	}


	public MCNumber col_056() {
		return getConstNumber(offset + 246, $col_056);
	}

	public void col_056(MCNumber value) {
		setConstNumber(offset + 246, $col_056, value);
	}

	public void col_056(int value) {
		setConstNumber(offset + 246, $col_056, value);
	}

	public void col_056(long value) {
		setConstNumber(offset + 246, $col_056, value);
	}

	public void col_056(float value) {
		setConstNumber(offset + 246, $col_056, value);
	}

	public void col_056(double value) {
		setConstNumber(offset + 246, $col_056, value);
	}


	public MCNumber col_057() {
		return getConstNumber(offset + 247, $col_057);
	}

	public void col_057(MCNumber value) {
		setConstNumber(offset + 247, $col_057, value);
	}

	public void col_057(int value) {
		setConstNumber(offset + 247, $col_057, value);
	}

	public void col_057(long value) {
		setConstNumber(offset + 247, $col_057, value);
	}

	public void col_057(float value) {
		setConstNumber(offset + 247, $col_057, value);
	}

	public void col_057(double value) {
		setConstNumber(offset + 247, $col_057, value);
	}


	public MCNumber col_058() {
		return getConstNumber(offset + 248, $col_058);
	}

	public void col_058(MCNumber value) {
		setConstNumber(offset + 248, $col_058, value);
	}

	public void col_058(int value) {
		setConstNumber(offset + 248, $col_058, value);
	}

	public void col_058(long value) {
		setConstNumber(offset + 248, $col_058, value);
	}

	public void col_058(float value) {
		setConstNumber(offset + 248, $col_058, value);
	}

	public void col_058(double value) {
		setConstNumber(offset + 248, $col_058, value);
	}


	public MCNumber col_059() {
		return getConstNumber(offset + 249, $col_059);
	}

	public void col_059(MCNumber value) {
		setConstNumber(offset + 249, $col_059, value);
	}

	public void col_059(int value) {
		setConstNumber(offset + 249, $col_059, value);
	}

	public void col_059(long value) {
		setConstNumber(offset + 249, $col_059, value);
	}

	public void col_059(float value) {
		setConstNumber(offset + 249, $col_059, value);
	}

	public void col_059(double value) {
		setConstNumber(offset + 249, $col_059, value);
	}


	public MCNumber col_060() {
		return getConstNumber(offset + 250, $col_060);
	}

	public void col_060(MCNumber value) {
		setConstNumber(offset + 250, $col_060, value);
	}

	public void col_060(int value) {
		setConstNumber(offset + 250, $col_060, value);
	}

	public void col_060(long value) {
		setConstNumber(offset + 250, $col_060, value);
	}

	public void col_060(float value) {
		setConstNumber(offset + 250, $col_060, value);
	}

	public void col_060(double value) {
		setConstNumber(offset + 250, $col_060, value);
	}


	public MCNumber col_061() {
		return getConstNumber(offset + 251, $col_061);
	}

	public void col_061(MCNumber value) {
		setConstNumber(offset + 251, $col_061, value);
	}

	public void col_061(int value) {
		setConstNumber(offset + 251, $col_061, value);
	}

	public void col_061(long value) {
		setConstNumber(offset + 251, $col_061, value);
	}

	public void col_061(float value) {
		setConstNumber(offset + 251, $col_061, value);
	}

	public void col_061(double value) {
		setConstNumber(offset + 251, $col_061, value);
	}


	public MCNumber col_062() {
		return getConstNumber(offset + 252, $col_062);
	}

	public void col_062(MCNumber value) {
		setConstNumber(offset + 252, $col_062, value);
	}

	public void col_062(int value) {
		setConstNumber(offset + 252, $col_062, value);
	}

	public void col_062(long value) {
		setConstNumber(offset + 252, $col_062, value);
	}

	public void col_062(float value) {
		setConstNumber(offset + 252, $col_062, value);
	}

	public void col_062(double value) {
		setConstNumber(offset + 252, $col_062, value);
	}


	public MCNumber col_063() {
		return getConstNumber(offset + 253, $col_063);
	}

	public void col_063(MCNumber value) {
		setConstNumber(offset + 253, $col_063, value);
	}

	public void col_063(int value) {
		setConstNumber(offset + 253, $col_063, value);
	}

	public void col_063(long value) {
		setConstNumber(offset + 253, $col_063, value);
	}

	public void col_063(float value) {
		setConstNumber(offset + 253, $col_063, value);
	}

	public void col_063(double value) {
		setConstNumber(offset + 253, $col_063, value);
	}


	public MCNumber col_064() {
		return getConstNumber(offset + 254, $col_064);
	}

	public void col_064(MCNumber value) {
		setConstNumber(offset + 254, $col_064, value);
	}

	public void col_064(int value) {
		setConstNumber(offset + 254, $col_064, value);
	}

	public void col_064(long value) {
		setConstNumber(offset + 254, $col_064, value);
	}

	public void col_064(float value) {
		setConstNumber(offset + 254, $col_064, value);
	}

	public void col_064(double value) {
		setConstNumber(offset + 254, $col_064, value);
	}


	public MCNumber col_065() {
		return getConstNumber(offset + 255, $col_065);
	}

	public void col_065(MCNumber value) {
		setConstNumber(offset + 255, $col_065, value);
	}

	public void col_065(int value) {
		setConstNumber(offset + 255, $col_065, value);
	}

	public void col_065(long value) {
		setConstNumber(offset + 255, $col_065, value);
	}

	public void col_065(float value) {
		setConstNumber(offset + 255, $col_065, value);
	}

	public void col_065(double value) {
		setConstNumber(offset + 255, $col_065, value);
	}


	public MCNumber col_066() {
		return getConstNumber(offset + 256, $col_066);
	}

	public void col_066(MCNumber value) {
		setConstNumber(offset + 256, $col_066, value);
	}

	public void col_066(int value) {
		setConstNumber(offset + 256, $col_066, value);
	}

	public void col_066(long value) {
		setConstNumber(offset + 256, $col_066, value);
	}

	public void col_066(float value) {
		setConstNumber(offset + 256, $col_066, value);
	}

	public void col_066(double value) {
		setConstNumber(offset + 256, $col_066, value);
	}


	public MCNumber col_067() {
		return getConstNumber(offset + 257, $col_067);
	}

	public void col_067(MCNumber value) {
		setConstNumber(offset + 257, $col_067, value);
	}

	public void col_067(int value) {
		setConstNumber(offset + 257, $col_067, value);
	}

	public void col_067(long value) {
		setConstNumber(offset + 257, $col_067, value);
	}

	public void col_067(float value) {
		setConstNumber(offset + 257, $col_067, value);
	}

	public void col_067(double value) {
		setConstNumber(offset + 257, $col_067, value);
	}


	public MCNumber col_068() {
		return getConstNumber(offset + 258, $col_068);
	}

	public void col_068(MCNumber value) {
		setConstNumber(offset + 258, $col_068, value);
	}

	public void col_068(int value) {
		setConstNumber(offset + 258, $col_068, value);
	}

	public void col_068(long value) {
		setConstNumber(offset + 258, $col_068, value);
	}

	public void col_068(float value) {
		setConstNumber(offset + 258, $col_068, value);
	}

	public void col_068(double value) {
		setConstNumber(offset + 258, $col_068, value);
	}


	public MCNumber col_069() {
		return getConstNumber(offset + 259, $col_069);
	}

	public void col_069(MCNumber value) {
		setConstNumber(offset + 259, $col_069, value);
	}

	public void col_069(int value) {
		setConstNumber(offset + 259, $col_069, value);
	}

	public void col_069(long value) {
		setConstNumber(offset + 259, $col_069, value);
	}

	public void col_069(float value) {
		setConstNumber(offset + 259, $col_069, value);
	}

	public void col_069(double value) {
		setConstNumber(offset + 259, $col_069, value);
	}


	public MCNumber col_070() {
		return getConstNumber(offset + 260, $col_070);
	}

	public void col_070(MCNumber value) {
		setConstNumber(offset + 260, $col_070, value);
	}

	public void col_070(int value) {
		setConstNumber(offset + 260, $col_070, value);
	}

	public void col_070(long value) {
		setConstNumber(offset + 260, $col_070, value);
	}

	public void col_070(float value) {
		setConstNumber(offset + 260, $col_070, value);
	}

	public void col_070(double value) {
		setConstNumber(offset + 260, $col_070, value);
	}


	public MCNumber col_071() {
		return getConstNumber(offset + 261, $col_071);
	}

	public void col_071(MCNumber value) {
		setConstNumber(offset + 261, $col_071, value);
	}

	public void col_071(int value) {
		setConstNumber(offset + 261, $col_071, value);
	}

	public void col_071(long value) {
		setConstNumber(offset + 261, $col_071, value);
	}

	public void col_071(float value) {
		setConstNumber(offset + 261, $col_071, value);
	}

	public void col_071(double value) {
		setConstNumber(offset + 261, $col_071, value);
	}


	public MCNumber col_072() {
		return getConstNumber(offset + 262, $col_072);
	}

	public void col_072(MCNumber value) {
		setConstNumber(offset + 262, $col_072, value);
	}

	public void col_072(int value) {
		setConstNumber(offset + 262, $col_072, value);
	}

	public void col_072(long value) {
		setConstNumber(offset + 262, $col_072, value);
	}

	public void col_072(float value) {
		setConstNumber(offset + 262, $col_072, value);
	}

	public void col_072(double value) {
		setConstNumber(offset + 262, $col_072, value);
	}


	public MCNumber col_073() {
		return getConstNumber(offset + 263, $col_073);
	}

	public void col_073(MCNumber value) {
		setConstNumber(offset + 263, $col_073, value);
	}

	public void col_073(int value) {
		setConstNumber(offset + 263, $col_073, value);
	}

	public void col_073(long value) {
		setConstNumber(offset + 263, $col_073, value);
	}

	public void col_073(float value) {
		setConstNumber(offset + 263, $col_073, value);
	}

	public void col_073(double value) {
		setConstNumber(offset + 263, $col_073, value);
	}


	public MCNumber col_074() {
		return getConstNumber(offset + 264, $col_074);
	}

	public void col_074(MCNumber value) {
		setConstNumber(offset + 264, $col_074, value);
	}

	public void col_074(int value) {
		setConstNumber(offset + 264, $col_074, value);
	}

	public void col_074(long value) {
		setConstNumber(offset + 264, $col_074, value);
	}

	public void col_074(float value) {
		setConstNumber(offset + 264, $col_074, value);
	}

	public void col_074(double value) {
		setConstNumber(offset + 264, $col_074, value);
	}


	public MCNumber col_075() {
		return getConstNumber(offset + 265, $col_075);
	}

	public void col_075(MCNumber value) {
		setConstNumber(offset + 265, $col_075, value);
	}

	public void col_075(int value) {
		setConstNumber(offset + 265, $col_075, value);
	}

	public void col_075(long value) {
		setConstNumber(offset + 265, $col_075, value);
	}

	public void col_075(float value) {
		setConstNumber(offset + 265, $col_075, value);
	}

	public void col_075(double value) {
		setConstNumber(offset + 265, $col_075, value);
	}


	public MCNumber col_076() {
		return getConstNumber(offset + 266, $col_076);
	}

	public void col_076(MCNumber value) {
		setConstNumber(offset + 266, $col_076, value);
	}

	public void col_076(int value) {
		setConstNumber(offset + 266, $col_076, value);
	}

	public void col_076(long value) {
		setConstNumber(offset + 266, $col_076, value);
	}

	public void col_076(float value) {
		setConstNumber(offset + 266, $col_076, value);
	}

	public void col_076(double value) {
		setConstNumber(offset + 266, $col_076, value);
	}


	public MCNumber col_077() {
		return getConstNumber(offset + 267, $col_077);
	}

	public void col_077(MCNumber value) {
		setConstNumber(offset + 267, $col_077, value);
	}

	public void col_077(int value) {
		setConstNumber(offset + 267, $col_077, value);
	}

	public void col_077(long value) {
		setConstNumber(offset + 267, $col_077, value);
	}

	public void col_077(float value) {
		setConstNumber(offset + 267, $col_077, value);
	}

	public void col_077(double value) {
		setConstNumber(offset + 267, $col_077, value);
	}


	public MCNumber col_078() {
		return getConstNumber(offset + 268, $col_078);
	}

	public void col_078(MCNumber value) {
		setConstNumber(offset + 268, $col_078, value);
	}

	public void col_078(int value) {
		setConstNumber(offset + 268, $col_078, value);
	}

	public void col_078(long value) {
		setConstNumber(offset + 268, $col_078, value);
	}

	public void col_078(float value) {
		setConstNumber(offset + 268, $col_078, value);
	}

	public void col_078(double value) {
		setConstNumber(offset + 268, $col_078, value);
	}


	public MCNumber col_079() {
		return getConstNumber(offset + 269, $col_079);
	}

	public void col_079(MCNumber value) {
		setConstNumber(offset + 269, $col_079, value);
	}

	public void col_079(int value) {
		setConstNumber(offset + 269, $col_079, value);
	}

	public void col_079(long value) {
		setConstNumber(offset + 269, $col_079, value);
	}

	public void col_079(float value) {
		setConstNumber(offset + 269, $col_079, value);
	}

	public void col_079(double value) {
		setConstNumber(offset + 269, $col_079, value);
	}


	public MCNumber col_080() {
		return getConstNumber(offset + 270, $col_080);
	}

	public void col_080(MCNumber value) {
		setConstNumber(offset + 270, $col_080, value);
	}

	public void col_080(int value) {
		setConstNumber(offset + 270, $col_080, value);
	}

	public void col_080(long value) {
		setConstNumber(offset + 270, $col_080, value);
	}

	public void col_080(float value) {
		setConstNumber(offset + 270, $col_080, value);
	}

	public void col_080(double value) {
		setConstNumber(offset + 270, $col_080, value);
	}


	public MCNumber col_081() {
		return getConstNumber(offset + 271, $col_081);
	}

	public void col_081(MCNumber value) {
		setConstNumber(offset + 271, $col_081, value);
	}

	public void col_081(int value) {
		setConstNumber(offset + 271, $col_081, value);
	}

	public void col_081(long value) {
		setConstNumber(offset + 271, $col_081, value);
	}

	public void col_081(float value) {
		setConstNumber(offset + 271, $col_081, value);
	}

	public void col_081(double value) {
		setConstNumber(offset + 271, $col_081, value);
	}


	public MCNumber col_082() {
		return getConstNumber(offset + 272, $col_082);
	}

	public void col_082(MCNumber value) {
		setConstNumber(offset + 272, $col_082, value);
	}

	public void col_082(int value) {
		setConstNumber(offset + 272, $col_082, value);
	}

	public void col_082(long value) {
		setConstNumber(offset + 272, $col_082, value);
	}

	public void col_082(float value) {
		setConstNumber(offset + 272, $col_082, value);
	}

	public void col_082(double value) {
		setConstNumber(offset + 272, $col_082, value);
	}


	public MCNumber col_083() {
		return getConstNumber(offset + 273, $col_083);
	}

	public void col_083(MCNumber value) {
		setConstNumber(offset + 273, $col_083, value);
	}

	public void col_083(int value) {
		setConstNumber(offset + 273, $col_083, value);
	}

	public void col_083(long value) {
		setConstNumber(offset + 273, $col_083, value);
	}

	public void col_083(float value) {
		setConstNumber(offset + 273, $col_083, value);
	}

	public void col_083(double value) {
		setConstNumber(offset + 273, $col_083, value);
	}


	public MCNumber col_084() {
		return getConstNumber(offset + 274, $col_084);
	}

	public void col_084(MCNumber value) {
		setConstNumber(offset + 274, $col_084, value);
	}

	public void col_084(int value) {
		setConstNumber(offset + 274, $col_084, value);
	}

	public void col_084(long value) {
		setConstNumber(offset + 274, $col_084, value);
	}

	public void col_084(float value) {
		setConstNumber(offset + 274, $col_084, value);
	}

	public void col_084(double value) {
		setConstNumber(offset + 274, $col_084, value);
	}


	public MCNumber col_085() {
		return getConstNumber(offset + 275, $col_085);
	}

	public void col_085(MCNumber value) {
		setConstNumber(offset + 275, $col_085, value);
	}

	public void col_085(int value) {
		setConstNumber(offset + 275, $col_085, value);
	}

	public void col_085(long value) {
		setConstNumber(offset + 275, $col_085, value);
	}

	public void col_085(float value) {
		setConstNumber(offset + 275, $col_085, value);
	}

	public void col_085(double value) {
		setConstNumber(offset + 275, $col_085, value);
	}


	public MCNumber col_086() {
		return getConstNumber(offset + 276, $col_086);
	}

	public void col_086(MCNumber value) {
		setConstNumber(offset + 276, $col_086, value);
	}

	public void col_086(int value) {
		setConstNumber(offset + 276, $col_086, value);
	}

	public void col_086(long value) {
		setConstNumber(offset + 276, $col_086, value);
	}

	public void col_086(float value) {
		setConstNumber(offset + 276, $col_086, value);
	}

	public void col_086(double value) {
		setConstNumber(offset + 276, $col_086, value);
	}


	public MCNumber col_087() {
		return getConstNumber(offset + 277, $col_087);
	}

	public void col_087(MCNumber value) {
		setConstNumber(offset + 277, $col_087, value);
	}

	public void col_087(int value) {
		setConstNumber(offset + 277, $col_087, value);
	}

	public void col_087(long value) {
		setConstNumber(offset + 277, $col_087, value);
	}

	public void col_087(float value) {
		setConstNumber(offset + 277, $col_087, value);
	}

	public void col_087(double value) {
		setConstNumber(offset + 277, $col_087, value);
	}


	public MCNumber col_088() {
		return getConstNumber(offset + 278, $col_088);
	}

	public void col_088(MCNumber value) {
		setConstNumber(offset + 278, $col_088, value);
	}

	public void col_088(int value) {
		setConstNumber(offset + 278, $col_088, value);
	}

	public void col_088(long value) {
		setConstNumber(offset + 278, $col_088, value);
	}

	public void col_088(float value) {
		setConstNumber(offset + 278, $col_088, value);
	}

	public void col_088(double value) {
		setConstNumber(offset + 278, $col_088, value);
	}


	public MCNumber col_089() {
		return getConstNumber(offset + 279, $col_089);
	}

	public void col_089(MCNumber value) {
		setConstNumber(offset + 279, $col_089, value);
	}

	public void col_089(int value) {
		setConstNumber(offset + 279, $col_089, value);
	}

	public void col_089(long value) {
		setConstNumber(offset + 279, $col_089, value);
	}

	public void col_089(float value) {
		setConstNumber(offset + 279, $col_089, value);
	}

	public void col_089(double value) {
		setConstNumber(offset + 279, $col_089, value);
	}


	public MCNumber col_090() {
		return getConstNumber(offset + 280, $col_090);
	}

	public void col_090(MCNumber value) {
		setConstNumber(offset + 280, $col_090, value);
	}

	public void col_090(int value) {
		setConstNumber(offset + 280, $col_090, value);
	}

	public void col_090(long value) {
		setConstNumber(offset + 280, $col_090, value);
	}

	public void col_090(float value) {
		setConstNumber(offset + 280, $col_090, value);
	}

	public void col_090(double value) {
		setConstNumber(offset + 280, $col_090, value);
	}


	public MCNumber col_091() {
		return getConstNumber(offset + 281, $col_091);
	}

	public void col_091(MCNumber value) {
		setConstNumber(offset + 281, $col_091, value);
	}

	public void col_091(int value) {
		setConstNumber(offset + 281, $col_091, value);
	}

	public void col_091(long value) {
		setConstNumber(offset + 281, $col_091, value);
	}

	public void col_091(float value) {
		setConstNumber(offset + 281, $col_091, value);
	}

	public void col_091(double value) {
		setConstNumber(offset + 281, $col_091, value);
	}


	public MCNumber col_092() {
		return getConstNumber(offset + 282, $col_092);
	}

	public void col_092(MCNumber value) {
		setConstNumber(offset + 282, $col_092, value);
	}

	public void col_092(int value) {
		setConstNumber(offset + 282, $col_092, value);
	}

	public void col_092(long value) {
		setConstNumber(offset + 282, $col_092, value);
	}

	public void col_092(float value) {
		setConstNumber(offset + 282, $col_092, value);
	}

	public void col_092(double value) {
		setConstNumber(offset + 282, $col_092, value);
	}


	public MCNumber col_093() {
		return getConstNumber(offset + 283, $col_093);
	}

	public void col_093(MCNumber value) {
		setConstNumber(offset + 283, $col_093, value);
	}

	public void col_093(int value) {
		setConstNumber(offset + 283, $col_093, value);
	}

	public void col_093(long value) {
		setConstNumber(offset + 283, $col_093, value);
	}

	public void col_093(float value) {
		setConstNumber(offset + 283, $col_093, value);
	}

	public void col_093(double value) {
		setConstNumber(offset + 283, $col_093, value);
	}


	public MCNumber col_094() {
		return getConstNumber(offset + 284, $col_094);
	}

	public void col_094(MCNumber value) {
		setConstNumber(offset + 284, $col_094, value);
	}

	public void col_094(int value) {
		setConstNumber(offset + 284, $col_094, value);
	}

	public void col_094(long value) {
		setConstNumber(offset + 284, $col_094, value);
	}

	public void col_094(float value) {
		setConstNumber(offset + 284, $col_094, value);
	}

	public void col_094(double value) {
		setConstNumber(offset + 284, $col_094, value);
	}


	public MCNumber col_095() {
		return getConstNumber(offset + 285, $col_095);
	}

	public void col_095(MCNumber value) {
		setConstNumber(offset + 285, $col_095, value);
	}

	public void col_095(int value) {
		setConstNumber(offset + 285, $col_095, value);
	}

	public void col_095(long value) {
		setConstNumber(offset + 285, $col_095, value);
	}

	public void col_095(float value) {
		setConstNumber(offset + 285, $col_095, value);
	}

	public void col_095(double value) {
		setConstNumber(offset + 285, $col_095, value);
	}


	public MCNumber col_096() {
		return getConstNumber(offset + 286, $col_096);
	}

	public void col_096(MCNumber value) {
		setConstNumber(offset + 286, $col_096, value);
	}

	public void col_096(int value) {
		setConstNumber(offset + 286, $col_096, value);
	}

	public void col_096(long value) {
		setConstNumber(offset + 286, $col_096, value);
	}

	public void col_096(float value) {
		setConstNumber(offset + 286, $col_096, value);
	}

	public void col_096(double value) {
		setConstNumber(offset + 286, $col_096, value);
	}


	public MCNumber col_097() {
		return getConstNumber(offset + 287, $col_097);
	}

	public void col_097(MCNumber value) {
		setConstNumber(offset + 287, $col_097, value);
	}

	public void col_097(int value) {
		setConstNumber(offset + 287, $col_097, value);
	}

	public void col_097(long value) {
		setConstNumber(offset + 287, $col_097, value);
	}

	public void col_097(float value) {
		setConstNumber(offset + 287, $col_097, value);
	}

	public void col_097(double value) {
		setConstNumber(offset + 287, $col_097, value);
	}


	public MCNumber col_098() {
		return getConstNumber(offset + 288, $col_098);
	}

	public void col_098(MCNumber value) {
		setConstNumber(offset + 288, $col_098, value);
	}

	public void col_098(int value) {
		setConstNumber(offset + 288, $col_098, value);
	}

	public void col_098(long value) {
		setConstNumber(offset + 288, $col_098, value);
	}

	public void col_098(float value) {
		setConstNumber(offset + 288, $col_098, value);
	}

	public void col_098(double value) {
		setConstNumber(offset + 288, $col_098, value);
	}


	public MCNumber col_099() {
		return getConstNumber(offset + 289, $col_099);
	}

	public void col_099(MCNumber value) {
		setConstNumber(offset + 289, $col_099, value);
	}

	public void col_099(int value) {
		setConstNumber(offset + 289, $col_099, value);
	}

	public void col_099(long value) {
		setConstNumber(offset + 289, $col_099, value);
	}

	public void col_099(float value) {
		setConstNumber(offset + 289, $col_099, value);
	}

	public void col_099(double value) {
		setConstNumber(offset + 289, $col_099, value);
	}


	public MCNumber col_100() {
		return getConstNumber(offset + 290, $col_100);
	}

	public void col_100(MCNumber value) {
		setConstNumber(offset + 290, $col_100, value);
	}

	public void col_100(int value) {
		setConstNumber(offset + 290, $col_100, value);
	}

	public void col_100(long value) {
		setConstNumber(offset + 290, $col_100, value);
	}

	public void col_100(float value) {
		setConstNumber(offset + 290, $col_100, value);
	}

	public void col_100(double value) {
		setConstNumber(offset + 290, $col_100, value);
	}


	public MCNumber col_101() {
		return getConstNumber(offset + 291, $col_101);
	}

	public void col_101(MCNumber value) {
		setConstNumber(offset + 291, $col_101, value);
	}

	public void col_101(int value) {
		setConstNumber(offset + 291, $col_101, value);
	}

	public void col_101(long value) {
		setConstNumber(offset + 291, $col_101, value);
	}

	public void col_101(float value) {
		setConstNumber(offset + 291, $col_101, value);
	}

	public void col_101(double value) {
		setConstNumber(offset + 291, $col_101, value);
	}


	public MCNumber col_102() {
		return getConstNumber(offset + 292, $col_102);
	}

	public void col_102(MCNumber value) {
		setConstNumber(offset + 292, $col_102, value);
	}

	public void col_102(int value) {
		setConstNumber(offset + 292, $col_102, value);
	}

	public void col_102(long value) {
		setConstNumber(offset + 292, $col_102, value);
	}

	public void col_102(float value) {
		setConstNumber(offset + 292, $col_102, value);
	}

	public void col_102(double value) {
		setConstNumber(offset + 292, $col_102, value);
	}


	public MCNumber col_103() {
		return getConstNumber(offset + 293, $col_103);
	}

	public void col_103(MCNumber value) {
		setConstNumber(offset + 293, $col_103, value);
	}

	public void col_103(int value) {
		setConstNumber(offset + 293, $col_103, value);
	}

	public void col_103(long value) {
		setConstNumber(offset + 293, $col_103, value);
	}

	public void col_103(float value) {
		setConstNumber(offset + 293, $col_103, value);
	}

	public void col_103(double value) {
		setConstNumber(offset + 293, $col_103, value);
	}


	public MCNumber col_104() {
		return getConstNumber(offset + 294, $col_104);
	}

	public void col_104(MCNumber value) {
		setConstNumber(offset + 294, $col_104, value);
	}

	public void col_104(int value) {
		setConstNumber(offset + 294, $col_104, value);
	}

	public void col_104(long value) {
		setConstNumber(offset + 294, $col_104, value);
	}

	public void col_104(float value) {
		setConstNumber(offset + 294, $col_104, value);
	}

	public void col_104(double value) {
		setConstNumber(offset + 294, $col_104, value);
	}


	public MCNumber col_105() {
		return getConstNumber(offset + 295, $col_105);
	}

	public void col_105(MCNumber value) {
		setConstNumber(offset + 295, $col_105, value);
	}

	public void col_105(int value) {
		setConstNumber(offset + 295, $col_105, value);
	}

	public void col_105(long value) {
		setConstNumber(offset + 295, $col_105, value);
	}

	public void col_105(float value) {
		setConstNumber(offset + 295, $col_105, value);
	}

	public void col_105(double value) {
		setConstNumber(offset + 295, $col_105, value);
	}


	public MCNumber col_106() {
		return getConstNumber(offset + 296, $col_106);
	}

	public void col_106(MCNumber value) {
		setConstNumber(offset + 296, $col_106, value);
	}

	public void col_106(int value) {
		setConstNumber(offset + 296, $col_106, value);
	}

	public void col_106(long value) {
		setConstNumber(offset + 296, $col_106, value);
	}

	public void col_106(float value) {
		setConstNumber(offset + 296, $col_106, value);
	}

	public void col_106(double value) {
		setConstNumber(offset + 296, $col_106, value);
	}


	public MCNumber col_107() {
		return getConstNumber(offset + 297, $col_107);
	}

	public void col_107(MCNumber value) {
		setConstNumber(offset + 297, $col_107, value);
	}

	public void col_107(int value) {
		setConstNumber(offset + 297, $col_107, value);
	}

	public void col_107(long value) {
		setConstNumber(offset + 297, $col_107, value);
	}

	public void col_107(float value) {
		setConstNumber(offset + 297, $col_107, value);
	}

	public void col_107(double value) {
		setConstNumber(offset + 297, $col_107, value);
	}


	public MCNumber col_108() {
		return getConstNumber(offset + 298, $col_108);
	}

	public void col_108(MCNumber value) {
		setConstNumber(offset + 298, $col_108, value);
	}

	public void col_108(int value) {
		setConstNumber(offset + 298, $col_108, value);
	}

	public void col_108(long value) {
		setConstNumber(offset + 298, $col_108, value);
	}

	public void col_108(float value) {
		setConstNumber(offset + 298, $col_108, value);
	}

	public void col_108(double value) {
		setConstNumber(offset + 298, $col_108, value);
	}


	public MCNumber col_109() {
		return getConstNumber(offset + 299, $col_109);
	}

	public void col_109(MCNumber value) {
		setConstNumber(offset + 299, $col_109, value);
	}

	public void col_109(int value) {
		setConstNumber(offset + 299, $col_109, value);
	}

	public void col_109(long value) {
		setConstNumber(offset + 299, $col_109, value);
	}

	public void col_109(float value) {
		setConstNumber(offset + 299, $col_109, value);
	}

	public void col_109(double value) {
		setConstNumber(offset + 299, $col_109, value);
	}


	public MCNumber col_110() {
		return getConstNumber(offset + 300, $col_110);
	}

	public void col_110(MCNumber value) {
		setConstNumber(offset + 300, $col_110, value);
	}

	public void col_110(int value) {
		setConstNumber(offset + 300, $col_110, value);
	}

	public void col_110(long value) {
		setConstNumber(offset + 300, $col_110, value);
	}

	public void col_110(float value) {
		setConstNumber(offset + 300, $col_110, value);
	}

	public void col_110(double value) {
		setConstNumber(offset + 300, $col_110, value);
	}


	public MCNumber col_111() {
		return getConstNumber(offset + 301, $col_111);
	}

	public void col_111(MCNumber value) {
		setConstNumber(offset + 301, $col_111, value);
	}

	public void col_111(int value) {
		setConstNumber(offset + 301, $col_111, value);
	}

	public void col_111(long value) {
		setConstNumber(offset + 301, $col_111, value);
	}

	public void col_111(float value) {
		setConstNumber(offset + 301, $col_111, value);
	}

	public void col_111(double value) {
		setConstNumber(offset + 301, $col_111, value);
	}


	public MCNumber col_112() {
		return getConstNumber(offset + 302, $col_112);
	}

	public void col_112(MCNumber value) {
		setConstNumber(offset + 302, $col_112, value);
	}

	public void col_112(int value) {
		setConstNumber(offset + 302, $col_112, value);
	}

	public void col_112(long value) {
		setConstNumber(offset + 302, $col_112, value);
	}

	public void col_112(float value) {
		setConstNumber(offset + 302, $col_112, value);
	}

	public void col_112(double value) {
		setConstNumber(offset + 302, $col_112, value);
	}


	public MCNumber col_113() {
		return getConstNumber(offset + 303, $col_113);
	}

	public void col_113(MCNumber value) {
		setConstNumber(offset + 303, $col_113, value);
	}

	public void col_113(int value) {
		setConstNumber(offset + 303, $col_113, value);
	}

	public void col_113(long value) {
		setConstNumber(offset + 303, $col_113, value);
	}

	public void col_113(float value) {
		setConstNumber(offset + 303, $col_113, value);
	}

	public void col_113(double value) {
		setConstNumber(offset + 303, $col_113, value);
	}


	public MCNumber col_114() {
		return getConstNumber(offset + 304, $col_114);
	}

	public void col_114(MCNumber value) {
		setConstNumber(offset + 304, $col_114, value);
	}

	public void col_114(int value) {
		setConstNumber(offset + 304, $col_114, value);
	}

	public void col_114(long value) {
		setConstNumber(offset + 304, $col_114, value);
	}

	public void col_114(float value) {
		setConstNumber(offset + 304, $col_114, value);
	}

	public void col_114(double value) {
		setConstNumber(offset + 304, $col_114, value);
	}


	public MCNumber col_115() {
		return getConstNumber(offset + 305, $col_115);
	}

	public void col_115(MCNumber value) {
		setConstNumber(offset + 305, $col_115, value);
	}

	public void col_115(int value) {
		setConstNumber(offset + 305, $col_115, value);
	}

	public void col_115(long value) {
		setConstNumber(offset + 305, $col_115, value);
	}

	public void col_115(float value) {
		setConstNumber(offset + 305, $col_115, value);
	}

	public void col_115(double value) {
		setConstNumber(offset + 305, $col_115, value);
	}


	public MCNumber col_116() {
		return getConstNumber(offset + 306, $col_116);
	}

	public void col_116(MCNumber value) {
		setConstNumber(offset + 306, $col_116, value);
	}

	public void col_116(int value) {
		setConstNumber(offset + 306, $col_116, value);
	}

	public void col_116(long value) {
		setConstNumber(offset + 306, $col_116, value);
	}

	public void col_116(float value) {
		setConstNumber(offset + 306, $col_116, value);
	}

	public void col_116(double value) {
		setConstNumber(offset + 306, $col_116, value);
	}


	public MCNumber col_117() {
		return getConstNumber(offset + 307, $col_117);
	}

	public void col_117(MCNumber value) {
		setConstNumber(offset + 307, $col_117, value);
	}

	public void col_117(int value) {
		setConstNumber(offset + 307, $col_117, value);
	}

	public void col_117(long value) {
		setConstNumber(offset + 307, $col_117, value);
	}

	public void col_117(float value) {
		setConstNumber(offset + 307, $col_117, value);
	}

	public void col_117(double value) {
		setConstNumber(offset + 307, $col_117, value);
	}


	public MCNumber col_118() {
		return getConstNumber(offset + 308, $col_118);
	}

	public void col_118(MCNumber value) {
		setConstNumber(offset + 308, $col_118, value);
	}

	public void col_118(int value) {
		setConstNumber(offset + 308, $col_118, value);
	}

	public void col_118(long value) {
		setConstNumber(offset + 308, $col_118, value);
	}

	public void col_118(float value) {
		setConstNumber(offset + 308, $col_118, value);
	}

	public void col_118(double value) {
		setConstNumber(offset + 308, $col_118, value);
	}


	public MCNumber col_119() {
		return getConstNumber(offset + 309, $col_119);
	}

	public void col_119(MCNumber value) {
		setConstNumber(offset + 309, $col_119, value);
	}

	public void col_119(int value) {
		setConstNumber(offset + 309, $col_119, value);
	}

	public void col_119(long value) {
		setConstNumber(offset + 309, $col_119, value);
	}

	public void col_119(float value) {
		setConstNumber(offset + 309, $col_119, value);
	}

	public void col_119(double value) {
		setConstNumber(offset + 309, $col_119, value);
	}


	public MCNumber col_120() {
		return getConstNumber(offset + 310, $col_120);
	}

	public void col_120(MCNumber value) {
		setConstNumber(offset + 310, $col_120, value);
	}

	public void col_120(int value) {
		setConstNumber(offset + 310, $col_120, value);
	}

	public void col_120(long value) {
		setConstNumber(offset + 310, $col_120, value);
	}

	public void col_120(float value) {
		setConstNumber(offset + 310, $col_120, value);
	}

	public void col_120(double value) {
		setConstNumber(offset + 310, $col_120, value);
	}


	public MCNumber col_121() {
		return getConstNumber(offset + 311, $col_121);
	}

	public void col_121(MCNumber value) {
		setConstNumber(offset + 311, $col_121, value);
	}

	public void col_121(int value) {
		setConstNumber(offset + 311, $col_121, value);
	}

	public void col_121(long value) {
		setConstNumber(offset + 311, $col_121, value);
	}

	public void col_121(float value) {
		setConstNumber(offset + 311, $col_121, value);
	}

	public void col_121(double value) {
		setConstNumber(offset + 311, $col_121, value);
	}


	public MCNumber col_122() {
		return getConstNumber(offset + 312, $col_122);
	}

	public void col_122(MCNumber value) {
		setConstNumber(offset + 312, $col_122, value);
	}

	public void col_122(int value) {
		setConstNumber(offset + 312, $col_122, value);
	}

	public void col_122(long value) {
		setConstNumber(offset + 312, $col_122, value);
	}

	public void col_122(float value) {
		setConstNumber(offset + 312, $col_122, value);
	}

	public void col_122(double value) {
		setConstNumber(offset + 312, $col_122, value);
	}


	public MCNumber col_123() {
		return getConstNumber(offset + 313, $col_123);
	}

	public void col_123(MCNumber value) {
		setConstNumber(offset + 313, $col_123, value);
	}

	public void col_123(int value) {
		setConstNumber(offset + 313, $col_123, value);
	}

	public void col_123(long value) {
		setConstNumber(offset + 313, $col_123, value);
	}

	public void col_123(float value) {
		setConstNumber(offset + 313, $col_123, value);
	}

	public void col_123(double value) {
		setConstNumber(offset + 313, $col_123, value);
	}


	public MCNumber col_124() {
		return getConstNumber(offset + 314, $col_124);
	}

	public void col_124(MCNumber value) {
		setConstNumber(offset + 314, $col_124, value);
	}

	public void col_124(int value) {
		setConstNumber(offset + 314, $col_124, value);
	}

	public void col_124(long value) {
		setConstNumber(offset + 314, $col_124, value);
	}

	public void col_124(float value) {
		setConstNumber(offset + 314, $col_124, value);
	}

	public void col_124(double value) {
		setConstNumber(offset + 314, $col_124, value);
	}


	public MCNumber col_125() {
		return getConstNumber(offset + 315, $col_125);
	}

	public void col_125(MCNumber value) {
		setConstNumber(offset + 315, $col_125, value);
	}

	public void col_125(int value) {
		setConstNumber(offset + 315, $col_125, value);
	}

	public void col_125(long value) {
		setConstNumber(offset + 315, $col_125, value);
	}

	public void col_125(float value) {
		setConstNumber(offset + 315, $col_125, value);
	}

	public void col_125(double value) {
		setConstNumber(offset + 315, $col_125, value);
	}


	public MCNumber col_126() {
		return getConstNumber(offset + 316, $col_126);
	}

	public void col_126(MCNumber value) {
		setConstNumber(offset + 316, $col_126, value);
	}

	public void col_126(int value) {
		setConstNumber(offset + 316, $col_126, value);
	}

	public void col_126(long value) {
		setConstNumber(offset + 316, $col_126, value);
	}

	public void col_126(float value) {
		setConstNumber(offset + 316, $col_126, value);
	}

	public void col_126(double value) {
		setConstNumber(offset + 316, $col_126, value);
	}


	public MCNumber col_127() {
		return getConstNumber(offset + 317, $col_127);
	}

	public void col_127(MCNumber value) {
		setConstNumber(offset + 317, $col_127, value);
	}

	public void col_127(int value) {
		setConstNumber(offset + 317, $col_127, value);
	}

	public void col_127(long value) {
		setConstNumber(offset + 317, $col_127, value);
	}

	public void col_127(float value) {
		setConstNumber(offset + 317, $col_127, value);
	}

	public void col_127(double value) {
		setConstNumber(offset + 317, $col_127, value);
	}


	public MCNumber col_128() {
		return getConstNumber(offset + 318, $col_128);
	}

	public void col_128(MCNumber value) {
		setConstNumber(offset + 318, $col_128, value);
	}

	public void col_128(int value) {
		setConstNumber(offset + 318, $col_128, value);
	}

	public void col_128(long value) {
		setConstNumber(offset + 318, $col_128, value);
	}

	public void col_128(float value) {
		setConstNumber(offset + 318, $col_128, value);
	}

	public void col_128(double value) {
		setConstNumber(offset + 318, $col_128, value);
	}


	public MCNumber col_129() {
		return getConstNumber(offset + 319, $col_129);
	}

	public void col_129(MCNumber value) {
		setConstNumber(offset + 319, $col_129, value);
	}

	public void col_129(int value) {
		setConstNumber(offset + 319, $col_129, value);
	}

	public void col_129(long value) {
		setConstNumber(offset + 319, $col_129, value);
	}

	public void col_129(float value) {
		setConstNumber(offset + 319, $col_129, value);
	}

	public void col_129(double value) {
		setConstNumber(offset + 319, $col_129, value);
	}


	public MCNumber col_130() {
		return getConstNumber(offset + 320, $col_130);
	}

	public void col_130(MCNumber value) {
		setConstNumber(offset + 320, $col_130, value);
	}

	public void col_130(int value) {
		setConstNumber(offset + 320, $col_130, value);
	}

	public void col_130(long value) {
		setConstNumber(offset + 320, $col_130, value);
	}

	public void col_130(float value) {
		setConstNumber(offset + 320, $col_130, value);
	}

	public void col_130(double value) {
		setConstNumber(offset + 320, $col_130, value);
	}


	public MCNumber col_131() {
		return getConstNumber(offset + 321, $col_131);
	}

	public void col_131(MCNumber value) {
		setConstNumber(offset + 321, $col_131, value);
	}

	public void col_131(int value) {
		setConstNumber(offset + 321, $col_131, value);
	}

	public void col_131(long value) {
		setConstNumber(offset + 321, $col_131, value);
	}

	public void col_131(float value) {
		setConstNumber(offset + 321, $col_131, value);
	}

	public void col_131(double value) {
		setConstNumber(offset + 321, $col_131, value);
	}


	public MCNumber col_132() {
		return getConstNumber(offset + 322, $col_132);
	}

	public void col_132(MCNumber value) {
		setConstNumber(offset + 322, $col_132, value);
	}

	public void col_132(int value) {
		setConstNumber(offset + 322, $col_132, value);
	}

	public void col_132(long value) {
		setConstNumber(offset + 322, $col_132, value);
	}

	public void col_132(float value) {
		setConstNumber(offset + 322, $col_132, value);
	}

	public void col_132(double value) {
		setConstNumber(offset + 322, $col_132, value);
	}


	public MCNumber col_133() {
		return getConstNumber(offset + 323, $col_133);
	}

	public void col_133(MCNumber value) {
		setConstNumber(offset + 323, $col_133, value);
	}

	public void col_133(int value) {
		setConstNumber(offset + 323, $col_133, value);
	}

	public void col_133(long value) {
		setConstNumber(offset + 323, $col_133, value);
	}

	public void col_133(float value) {
		setConstNumber(offset + 323, $col_133, value);
	}

	public void col_133(double value) {
		setConstNumber(offset + 323, $col_133, value);
	}


	public MCNumber col_134() {
		return getConstNumber(offset + 324, $col_134);
	}

	public void col_134(MCNumber value) {
		setConstNumber(offset + 324, $col_134, value);
	}

	public void col_134(int value) {
		setConstNumber(offset + 324, $col_134, value);
	}

	public void col_134(long value) {
		setConstNumber(offset + 324, $col_134, value);
	}

	public void col_134(float value) {
		setConstNumber(offset + 324, $col_134, value);
	}

	public void col_134(double value) {
		setConstNumber(offset + 324, $col_134, value);
	}


	public MCNumber col_135() {
		return getConstNumber(offset + 325, $col_135);
	}

	public void col_135(MCNumber value) {
		setConstNumber(offset + 325, $col_135, value);
	}

	public void col_135(int value) {
		setConstNumber(offset + 325, $col_135, value);
	}

	public void col_135(long value) {
		setConstNumber(offset + 325, $col_135, value);
	}

	public void col_135(float value) {
		setConstNumber(offset + 325, $col_135, value);
	}

	public void col_135(double value) {
		setConstNumber(offset + 325, $col_135, value);
	}


	public MCNumber col_136() {
		return getConstNumber(offset + 326, $col_136);
	}

	public void col_136(MCNumber value) {
		setConstNumber(offset + 326, $col_136, value);
	}

	public void col_136(int value) {
		setConstNumber(offset + 326, $col_136, value);
	}

	public void col_136(long value) {
		setConstNumber(offset + 326, $col_136, value);
	}

	public void col_136(float value) {
		setConstNumber(offset + 326, $col_136, value);
	}

	public void col_136(double value) {
		setConstNumber(offset + 326, $col_136, value);
	}


	public MCNumber col_137() {
		return getConstNumber(offset + 327, $col_137);
	}

	public void col_137(MCNumber value) {
		setConstNumber(offset + 327, $col_137, value);
	}

	public void col_137(int value) {
		setConstNumber(offset + 327, $col_137, value);
	}

	public void col_137(long value) {
		setConstNumber(offset + 327, $col_137, value);
	}

	public void col_137(float value) {
		setConstNumber(offset + 327, $col_137, value);
	}

	public void col_137(double value) {
		setConstNumber(offset + 327, $col_137, value);
	}


	public MCNumber col_138() {
		return getConstNumber(offset + 328, $col_138);
	}

	public void col_138(MCNumber value) {
		setConstNumber(offset + 328, $col_138, value);
	}

	public void col_138(int value) {
		setConstNumber(offset + 328, $col_138, value);
	}

	public void col_138(long value) {
		setConstNumber(offset + 328, $col_138, value);
	}

	public void col_138(float value) {
		setConstNumber(offset + 328, $col_138, value);
	}

	public void col_138(double value) {
		setConstNumber(offset + 328, $col_138, value);
	}


	public MCNumber col_139() {
		return getConstNumber(offset + 329, $col_139);
	}

	public void col_139(MCNumber value) {
		setConstNumber(offset + 329, $col_139, value);
	}

	public void col_139(int value) {
		setConstNumber(offset + 329, $col_139, value);
	}

	public void col_139(long value) {
		setConstNumber(offset + 329, $col_139, value);
	}

	public void col_139(float value) {
		setConstNumber(offset + 329, $col_139, value);
	}

	public void col_139(double value) {
		setConstNumber(offset + 329, $col_139, value);
	}


	public MCNumber col_140() {
		return getConstNumber(offset + 330, $col_140);
	}

	public void col_140(MCNumber value) {
		setConstNumber(offset + 330, $col_140, value);
	}

	public void col_140(int value) {
		setConstNumber(offset + 330, $col_140, value);
	}

	public void col_140(long value) {
		setConstNumber(offset + 330, $col_140, value);
	}

	public void col_140(float value) {
		setConstNumber(offset + 330, $col_140, value);
	}

	public void col_140(double value) {
		setConstNumber(offset + 330, $col_140, value);
	}


	public MCNumber col_141() {
		return getConstNumber(offset + 331, $col_141);
	}

	public void col_141(MCNumber value) {
		setConstNumber(offset + 331, $col_141, value);
	}

	public void col_141(int value) {
		setConstNumber(offset + 331, $col_141, value);
	}

	public void col_141(long value) {
		setConstNumber(offset + 331, $col_141, value);
	}

	public void col_141(float value) {
		setConstNumber(offset + 331, $col_141, value);
	}

	public void col_141(double value) {
		setConstNumber(offset + 331, $col_141, value);
	}


	public MCNumber col_142() {
		return getConstNumber(offset + 332, $col_142);
	}

	public void col_142(MCNumber value) {
		setConstNumber(offset + 332, $col_142, value);
	}

	public void col_142(int value) {
		setConstNumber(offset + 332, $col_142, value);
	}

	public void col_142(long value) {
		setConstNumber(offset + 332, $col_142, value);
	}

	public void col_142(float value) {
		setConstNumber(offset + 332, $col_142, value);
	}

	public void col_142(double value) {
		setConstNumber(offset + 332, $col_142, value);
	}


	public MCNumber col_143() {
		return getConstNumber(offset + 333, $col_143);
	}

	public void col_143(MCNumber value) {
		setConstNumber(offset + 333, $col_143, value);
	}

	public void col_143(int value) {
		setConstNumber(offset + 333, $col_143, value);
	}

	public void col_143(long value) {
		setConstNumber(offset + 333, $col_143, value);
	}

	public void col_143(float value) {
		setConstNumber(offset + 333, $col_143, value);
	}

	public void col_143(double value) {
		setConstNumber(offset + 333, $col_143, value);
	}


	public MCNumber col_144() {
		return getConstNumber(offset + 334, $col_144);
	}

	public void col_144(MCNumber value) {
		setConstNumber(offset + 334, $col_144, value);
	}

	public void col_144(int value) {
		setConstNumber(offset + 334, $col_144, value);
	}

	public void col_144(long value) {
		setConstNumber(offset + 334, $col_144, value);
	}

	public void col_144(float value) {
		setConstNumber(offset + 334, $col_144, value);
	}

	public void col_144(double value) {
		setConstNumber(offset + 334, $col_144, value);
	}


	public MCNumber col_145() {
		return getConstNumber(offset + 335, $col_145);
	}

	public void col_145(MCNumber value) {
		setConstNumber(offset + 335, $col_145, value);
	}

	public void col_145(int value) {
		setConstNumber(offset + 335, $col_145, value);
	}

	public void col_145(long value) {
		setConstNumber(offset + 335, $col_145, value);
	}

	public void col_145(float value) {
		setConstNumber(offset + 335, $col_145, value);
	}

	public void col_145(double value) {
		setConstNumber(offset + 335, $col_145, value);
	}


	public MCNumber col_146() {
		return getConstNumber(offset + 336, $col_146);
	}

	public void col_146(MCNumber value) {
		setConstNumber(offset + 336, $col_146, value);
	}

	public void col_146(int value) {
		setConstNumber(offset + 336, $col_146, value);
	}

	public void col_146(long value) {
		setConstNumber(offset + 336, $col_146, value);
	}

	public void col_146(float value) {
		setConstNumber(offset + 336, $col_146, value);
	}

	public void col_146(double value) {
		setConstNumber(offset + 336, $col_146, value);
	}


	public MCNumber col_147() {
		return getConstNumber(offset + 337, $col_147);
	}

	public void col_147(MCNumber value) {
		setConstNumber(offset + 337, $col_147, value);
	}

	public void col_147(int value) {
		setConstNumber(offset + 337, $col_147, value);
	}

	public void col_147(long value) {
		setConstNumber(offset + 337, $col_147, value);
	}

	public void col_147(float value) {
		setConstNumber(offset + 337, $col_147, value);
	}

	public void col_147(double value) {
		setConstNumber(offset + 337, $col_147, value);
	}


	public MCNumber col_148() {
		return getConstNumber(offset + 338, $col_148);
	}

	public void col_148(MCNumber value) {
		setConstNumber(offset + 338, $col_148, value);
	}

	public void col_148(int value) {
		setConstNumber(offset + 338, $col_148, value);
	}

	public void col_148(long value) {
		setConstNumber(offset + 338, $col_148, value);
	}

	public void col_148(float value) {
		setConstNumber(offset + 338, $col_148, value);
	}

	public void col_148(double value) {
		setConstNumber(offset + 338, $col_148, value);
	}


	public MCNumber col_149() {
		return getConstNumber(offset + 339, $col_149);
	}

	public void col_149(MCNumber value) {
		setConstNumber(offset + 339, $col_149, value);
	}

	public void col_149(int value) {
		setConstNumber(offset + 339, $col_149, value);
	}

	public void col_149(long value) {
		setConstNumber(offset + 339, $col_149, value);
	}

	public void col_149(float value) {
		setConstNumber(offset + 339, $col_149, value);
	}

	public void col_149(double value) {
		setConstNumber(offset + 339, $col_149, value);
	}


	public MCNumber col_150() {
		return getConstNumber(offset + 340, $col_150);
	}

	public void col_150(MCNumber value) {
		setConstNumber(offset + 340, $col_150, value);
	}

	public void col_150(int value) {
		setConstNumber(offset + 340, $col_150, value);
	}

	public void col_150(long value) {
		setConstNumber(offset + 340, $col_150, value);
	}

	public void col_150(float value) {
		setConstNumber(offset + 340, $col_150, value);
	}

	public void col_150(double value) {
		setConstNumber(offset + 340, $col_150, value);
	}


	public MCNumber col_151() {
		return getConstNumber(offset + 341, $col_151);
	}

	public void col_151(MCNumber value) {
		setConstNumber(offset + 341, $col_151, value);
	}

	public void col_151(int value) {
		setConstNumber(offset + 341, $col_151, value);
	}

	public void col_151(long value) {
		setConstNumber(offset + 341, $col_151, value);
	}

	public void col_151(float value) {
		setConstNumber(offset + 341, $col_151, value);
	}

	public void col_151(double value) {
		setConstNumber(offset + 341, $col_151, value);
	}


	public MCNumber col_152() {
		return getConstNumber(offset + 342, $col_152);
	}

	public void col_152(MCNumber value) {
		setConstNumber(offset + 342, $col_152, value);
	}

	public void col_152(int value) {
		setConstNumber(offset + 342, $col_152, value);
	}

	public void col_152(long value) {
		setConstNumber(offset + 342, $col_152, value);
	}

	public void col_152(float value) {
		setConstNumber(offset + 342, $col_152, value);
	}

	public void col_152(double value) {
		setConstNumber(offset + 342, $col_152, value);
	}


	public MCNumber col_153() {
		return getConstNumber(offset + 343, $col_153);
	}

	public void col_153(MCNumber value) {
		setConstNumber(offset + 343, $col_153, value);
	}

	public void col_153(int value) {
		setConstNumber(offset + 343, $col_153, value);
	}

	public void col_153(long value) {
		setConstNumber(offset + 343, $col_153, value);
	}

	public void col_153(float value) {
		setConstNumber(offset + 343, $col_153, value);
	}

	public void col_153(double value) {
		setConstNumber(offset + 343, $col_153, value);
	}


	public MCNumber col_154() {
		return getConstNumber(offset + 344, $col_154);
	}

	public void col_154(MCNumber value) {
		setConstNumber(offset + 344, $col_154, value);
	}

	public void col_154(int value) {
		setConstNumber(offset + 344, $col_154, value);
	}

	public void col_154(long value) {
		setConstNumber(offset + 344, $col_154, value);
	}

	public void col_154(float value) {
		setConstNumber(offset + 344, $col_154, value);
	}

	public void col_154(double value) {
		setConstNumber(offset + 344, $col_154, value);
	}


	public MCNumber col_155() {
		return getConstNumber(offset + 345, $col_155);
	}

	public void col_155(MCNumber value) {
		setConstNumber(offset + 345, $col_155, value);
	}

	public void col_155(int value) {
		setConstNumber(offset + 345, $col_155, value);
	}

	public void col_155(long value) {
		setConstNumber(offset + 345, $col_155, value);
	}

	public void col_155(float value) {
		setConstNumber(offset + 345, $col_155, value);
	}

	public void col_155(double value) {
		setConstNumber(offset + 345, $col_155, value);
	}


	public MCNumber col_156() {
		return getConstNumber(offset + 346, $col_156);
	}

	public void col_156(MCNumber value) {
		setConstNumber(offset + 346, $col_156, value);
	}

	public void col_156(int value) {
		setConstNumber(offset + 346, $col_156, value);
	}

	public void col_156(long value) {
		setConstNumber(offset + 346, $col_156, value);
	}

	public void col_156(float value) {
		setConstNumber(offset + 346, $col_156, value);
	}

	public void col_156(double value) {
		setConstNumber(offset + 346, $col_156, value);
	}


	public MCNumber col_157() {
		return getConstNumber(offset + 347, $col_157);
	}

	public void col_157(MCNumber value) {
		setConstNumber(offset + 347, $col_157, value);
	}

	public void col_157(int value) {
		setConstNumber(offset + 347, $col_157, value);
	}

	public void col_157(long value) {
		setConstNumber(offset + 347, $col_157, value);
	}

	public void col_157(float value) {
		setConstNumber(offset + 347, $col_157, value);
	}

	public void col_157(double value) {
		setConstNumber(offset + 347, $col_157, value);
	}


	public MCNumber col_158() {
		return getConstNumber(offset + 348, $col_158);
	}

	public void col_158(MCNumber value) {
		setConstNumber(offset + 348, $col_158, value);
	}

	public void col_158(int value) {
		setConstNumber(offset + 348, $col_158, value);
	}

	public void col_158(long value) {
		setConstNumber(offset + 348, $col_158, value);
	}

	public void col_158(float value) {
		setConstNumber(offset + 348, $col_158, value);
	}

	public void col_158(double value) {
		setConstNumber(offset + 348, $col_158, value);
	}


	public MCNumber col_159() {
		return getConstNumber(offset + 349, $col_159);
	}

	public void col_159(MCNumber value) {
		setConstNumber(offset + 349, $col_159, value);
	}

	public void col_159(int value) {
		setConstNumber(offset + 349, $col_159, value);
	}

	public void col_159(long value) {
		setConstNumber(offset + 349, $col_159, value);
	}

	public void col_159(float value) {
		setConstNumber(offset + 349, $col_159, value);
	}

	public void col_159(double value) {
		setConstNumber(offset + 349, $col_159, value);
	}


	public MCNumber col_160() {
		return getConstNumber(offset + 350, $col_160);
	}

	public void col_160(MCNumber value) {
		setConstNumber(offset + 350, $col_160, value);
	}

	public void col_160(int value) {
		setConstNumber(offset + 350, $col_160, value);
	}

	public void col_160(long value) {
		setConstNumber(offset + 350, $col_160, value);
	}

	public void col_160(float value) {
		setConstNumber(offset + 350, $col_160, value);
	}

	public void col_160(double value) {
		setConstNumber(offset + 350, $col_160, value);
	}


	public MCNumber col_161() {
		return getConstNumber(offset + 351, $col_161);
	}

	public void col_161(MCNumber value) {
		setConstNumber(offset + 351, $col_161, value);
	}

	public void col_161(int value) {
		setConstNumber(offset + 351, $col_161, value);
	}

	public void col_161(long value) {
		setConstNumber(offset + 351, $col_161, value);
	}

	public void col_161(float value) {
		setConstNumber(offset + 351, $col_161, value);
	}

	public void col_161(double value) {
		setConstNumber(offset + 351, $col_161, value);
	}


	public MCNumber col_162() {
		return getConstNumber(offset + 352, $col_162);
	}

	public void col_162(MCNumber value) {
		setConstNumber(offset + 352, $col_162, value);
	}

	public void col_162(int value) {
		setConstNumber(offset + 352, $col_162, value);
	}

	public void col_162(long value) {
		setConstNumber(offset + 352, $col_162, value);
	}

	public void col_162(float value) {
		setConstNumber(offset + 352, $col_162, value);
	}

	public void col_162(double value) {
		setConstNumber(offset + 352, $col_162, value);
	}


	public MCNumber col_163() {
		return getConstNumber(offset + 353, $col_163);
	}

	public void col_163(MCNumber value) {
		setConstNumber(offset + 353, $col_163, value);
	}

	public void col_163(int value) {
		setConstNumber(offset + 353, $col_163, value);
	}

	public void col_163(long value) {
		setConstNumber(offset + 353, $col_163, value);
	}

	public void col_163(float value) {
		setConstNumber(offset + 353, $col_163, value);
	}

	public void col_163(double value) {
		setConstNumber(offset + 353, $col_163, value);
	}


	public MCNumber col_164() {
		return getConstNumber(offset + 354, $col_164);
	}

	public void col_164(MCNumber value) {
		setConstNumber(offset + 354, $col_164, value);
	}

	public void col_164(int value) {
		setConstNumber(offset + 354, $col_164, value);
	}

	public void col_164(long value) {
		setConstNumber(offset + 354, $col_164, value);
	}

	public void col_164(float value) {
		setConstNumber(offset + 354, $col_164, value);
	}

	public void col_164(double value) {
		setConstNumber(offset + 354, $col_164, value);
	}


	public MCNumber col_165() {
		return getConstNumber(offset + 355, $col_165);
	}

	public void col_165(MCNumber value) {
		setConstNumber(offset + 355, $col_165, value);
	}

	public void col_165(int value) {
		setConstNumber(offset + 355, $col_165, value);
	}

	public void col_165(long value) {
		setConstNumber(offset + 355, $col_165, value);
	}

	public void col_165(float value) {
		setConstNumber(offset + 355, $col_165, value);
	}

	public void col_165(double value) {
		setConstNumber(offset + 355, $col_165, value);
	}


	public MCNumber col_166() {
		return getConstNumber(offset + 356, $col_166);
	}

	public void col_166(MCNumber value) {
		setConstNumber(offset + 356, $col_166, value);
	}

	public void col_166(int value) {
		setConstNumber(offset + 356, $col_166, value);
	}

	public void col_166(long value) {
		setConstNumber(offset + 356, $col_166, value);
	}

	public void col_166(float value) {
		setConstNumber(offset + 356, $col_166, value);
	}

	public void col_166(double value) {
		setConstNumber(offset + 356, $col_166, value);
	}


	public MCNumber col_167() {
		return getConstNumber(offset + 357, $col_167);
	}

	public void col_167(MCNumber value) {
		setConstNumber(offset + 357, $col_167, value);
	}

	public void col_167(int value) {
		setConstNumber(offset + 357, $col_167, value);
	}

	public void col_167(long value) {
		setConstNumber(offset + 357, $col_167, value);
	}

	public void col_167(float value) {
		setConstNumber(offset + 357, $col_167, value);
	}

	public void col_167(double value) {
		setConstNumber(offset + 357, $col_167, value);
	}


	public MCNumber col_168() {
		return getConstNumber(offset + 358, $col_168);
	}

	public void col_168(MCNumber value) {
		setConstNumber(offset + 358, $col_168, value);
	}

	public void col_168(int value) {
		setConstNumber(offset + 358, $col_168, value);
	}

	public void col_168(long value) {
		setConstNumber(offset + 358, $col_168, value);
	}

	public void col_168(float value) {
		setConstNumber(offset + 358, $col_168, value);
	}

	public void col_168(double value) {
		setConstNumber(offset + 358, $col_168, value);
	}


	public MCNumber col_169() {
		return getConstNumber(offset + 359, $col_169);
	}

	public void col_169(MCNumber value) {
		setConstNumber(offset + 359, $col_169, value);
	}

	public void col_169(int value) {
		setConstNumber(offset + 359, $col_169, value);
	}

	public void col_169(long value) {
		setConstNumber(offset + 359, $col_169, value);
	}

	public void col_169(float value) {
		setConstNumber(offset + 359, $col_169, value);
	}

	public void col_169(double value) {
		setConstNumber(offset + 359, $col_169, value);
	}


	public MCNumber col_170() {
		return getConstNumber(offset + 360, $col_170);
	}

	public void col_170(MCNumber value) {
		setConstNumber(offset + 360, $col_170, value);
	}

	public void col_170(int value) {
		setConstNumber(offset + 360, $col_170, value);
	}

	public void col_170(long value) {
		setConstNumber(offset + 360, $col_170, value);
	}

	public void col_170(float value) {
		setConstNumber(offset + 360, $col_170, value);
	}

	public void col_170(double value) {
		setConstNumber(offset + 360, $col_170, value);
	}


	public MCNumber col_171() {
		return getConstNumber(offset + 361, $col_171);
	}

	public void col_171(MCNumber value) {
		setConstNumber(offset + 361, $col_171, value);
	}

	public void col_171(int value) {
		setConstNumber(offset + 361, $col_171, value);
	}

	public void col_171(long value) {
		setConstNumber(offset + 361, $col_171, value);
	}

	public void col_171(float value) {
		setConstNumber(offset + 361, $col_171, value);
	}

	public void col_171(double value) {
		setConstNumber(offset + 361, $col_171, value);
	}


	public MCNumber col_172() {
		return getConstNumber(offset + 362, $col_172);
	}

	public void col_172(MCNumber value) {
		setConstNumber(offset + 362, $col_172, value);
	}

	public void col_172(int value) {
		setConstNumber(offset + 362, $col_172, value);
	}

	public void col_172(long value) {
		setConstNumber(offset + 362, $col_172, value);
	}

	public void col_172(float value) {
		setConstNumber(offset + 362, $col_172, value);
	}

	public void col_172(double value) {
		setConstNumber(offset + 362, $col_172, value);
	}


	public MCNumber col_173() {
		return getConstNumber(offset + 363, $col_173);
	}

	public void col_173(MCNumber value) {
		setConstNumber(offset + 363, $col_173, value);
	}

	public void col_173(int value) {
		setConstNumber(offset + 363, $col_173, value);
	}

	public void col_173(long value) {
		setConstNumber(offset + 363, $col_173, value);
	}

	public void col_173(float value) {
		setConstNumber(offset + 363, $col_173, value);
	}

	public void col_173(double value) {
		setConstNumber(offset + 363, $col_173, value);
	}


	public MCNumber col_174() {
		return getConstNumber(offset + 364, $col_174);
	}

	public void col_174(MCNumber value) {
		setConstNumber(offset + 364, $col_174, value);
	}

	public void col_174(int value) {
		setConstNumber(offset + 364, $col_174, value);
	}

	public void col_174(long value) {
		setConstNumber(offset + 364, $col_174, value);
	}

	public void col_174(float value) {
		setConstNumber(offset + 364, $col_174, value);
	}

	public void col_174(double value) {
		setConstNumber(offset + 364, $col_174, value);
	}


	public MCNumber col_175() {
		return getConstNumber(offset + 365, $col_175);
	}

	public void col_175(MCNumber value) {
		setConstNumber(offset + 365, $col_175, value);
	}

	public void col_175(int value) {
		setConstNumber(offset + 365, $col_175, value);
	}

	public void col_175(long value) {
		setConstNumber(offset + 365, $col_175, value);
	}

	public void col_175(float value) {
		setConstNumber(offset + 365, $col_175, value);
	}

	public void col_175(double value) {
		setConstNumber(offset + 365, $col_175, value);
	}


	public MCNumber col_176() {
		return getConstNumber(offset + 366, $col_176);
	}

	public void col_176(MCNumber value) {
		setConstNumber(offset + 366, $col_176, value);
	}

	public void col_176(int value) {
		setConstNumber(offset + 366, $col_176, value);
	}

	public void col_176(long value) {
		setConstNumber(offset + 366, $col_176, value);
	}

	public void col_176(float value) {
		setConstNumber(offset + 366, $col_176, value);
	}

	public void col_176(double value) {
		setConstNumber(offset + 366, $col_176, value);
	}


	public MCNumber col_177() {
		return getConstNumber(offset + 367, $col_177);
	}

	public void col_177(MCNumber value) {
		setConstNumber(offset + 367, $col_177, value);
	}

	public void col_177(int value) {
		setConstNumber(offset + 367, $col_177, value);
	}

	public void col_177(long value) {
		setConstNumber(offset + 367, $col_177, value);
	}

	public void col_177(float value) {
		setConstNumber(offset + 367, $col_177, value);
	}

	public void col_177(double value) {
		setConstNumber(offset + 367, $col_177, value);
	}


	public MCNumber col_178() {
		return getConstNumber(offset + 368, $col_178);
	}

	public void col_178(MCNumber value) {
		setConstNumber(offset + 368, $col_178, value);
	}

	public void col_178(int value) {
		setConstNumber(offset + 368, $col_178, value);
	}

	public void col_178(long value) {
		setConstNumber(offset + 368, $col_178, value);
	}

	public void col_178(float value) {
		setConstNumber(offset + 368, $col_178, value);
	}

	public void col_178(double value) {
		setConstNumber(offset + 368, $col_178, value);
	}


	public MCNumber col_179() {
		return getConstNumber(offset + 369, $col_179);
	}

	public void col_179(MCNumber value) {
		setConstNumber(offset + 369, $col_179, value);
	}

	public void col_179(int value) {
		setConstNumber(offset + 369, $col_179, value);
	}

	public void col_179(long value) {
		setConstNumber(offset + 369, $col_179, value);
	}

	public void col_179(float value) {
		setConstNumber(offset + 369, $col_179, value);
	}

	public void col_179(double value) {
		setConstNumber(offset + 369, $col_179, value);
	}


	public MCNumber col_180() {
		return getConstNumber(offset + 370, $col_180);
	}

	public void col_180(MCNumber value) {
		setConstNumber(offset + 370, $col_180, value);
	}

	public void col_180(int value) {
		setConstNumber(offset + 370, $col_180, value);
	}

	public void col_180(long value) {
		setConstNumber(offset + 370, $col_180, value);
	}

	public void col_180(float value) {
		setConstNumber(offset + 370, $col_180, value);
	}

	public void col_180(double value) {
		setConstNumber(offset + 370, $col_180, value);
	}


	public MCNumber col_181() {
		return getConstNumber(offset + 371, $col_181);
	}

	public void col_181(MCNumber value) {
		setConstNumber(offset + 371, $col_181, value);
	}

	public void col_181(int value) {
		setConstNumber(offset + 371, $col_181, value);
	}

	public void col_181(long value) {
		setConstNumber(offset + 371, $col_181, value);
	}

	public void col_181(float value) {
		setConstNumber(offset + 371, $col_181, value);
	}

	public void col_181(double value) {
		setConstNumber(offset + 371, $col_181, value);
	}


	public MCNumber col_182() {
		return getConstNumber(offset + 372, $col_182);
	}

	public void col_182(MCNumber value) {
		setConstNumber(offset + 372, $col_182, value);
	}

	public void col_182(int value) {
		setConstNumber(offset + 372, $col_182, value);
	}

	public void col_182(long value) {
		setConstNumber(offset + 372, $col_182, value);
	}

	public void col_182(float value) {
		setConstNumber(offset + 372, $col_182, value);
	}

	public void col_182(double value) {
		setConstNumber(offset + 372, $col_182, value);
	}


	public MCNumber col_183() {
		return getConstNumber(offset + 373, $col_183);
	}

	public void col_183(MCNumber value) {
		setConstNumber(offset + 373, $col_183, value);
	}

	public void col_183(int value) {
		setConstNumber(offset + 373, $col_183, value);
	}

	public void col_183(long value) {
		setConstNumber(offset + 373, $col_183, value);
	}

	public void col_183(float value) {
		setConstNumber(offset + 373, $col_183, value);
	}

	public void col_183(double value) {
		setConstNumber(offset + 373, $col_183, value);
	}


	public MCNumber col_184() {
		return getConstNumber(offset + 374, $col_184);
	}

	public void col_184(MCNumber value) {
		setConstNumber(offset + 374, $col_184, value);
	}

	public void col_184(int value) {
		setConstNumber(offset + 374, $col_184, value);
	}

	public void col_184(long value) {
		setConstNumber(offset + 374, $col_184, value);
	}

	public void col_184(float value) {
		setConstNumber(offset + 374, $col_184, value);
	}

	public void col_184(double value) {
		setConstNumber(offset + 374, $col_184, value);
	}


	public MCNumber col_185() {
		return getConstNumber(offset + 375, $col_185);
	}

	public void col_185(MCNumber value) {
		setConstNumber(offset + 375, $col_185, value);
	}

	public void col_185(int value) {
		setConstNumber(offset + 375, $col_185, value);
	}

	public void col_185(long value) {
		setConstNumber(offset + 375, $col_185, value);
	}

	public void col_185(float value) {
		setConstNumber(offset + 375, $col_185, value);
	}

	public void col_185(double value) {
		setConstNumber(offset + 375, $col_185, value);
	}


	public MCNumber col_186() {
		return getConstNumber(offset + 376, $col_186);
	}

	public void col_186(MCNumber value) {
		setConstNumber(offset + 376, $col_186, value);
	}

	public void col_186(int value) {
		setConstNumber(offset + 376, $col_186, value);
	}

	public void col_186(long value) {
		setConstNumber(offset + 376, $col_186, value);
	}

	public void col_186(float value) {
		setConstNumber(offset + 376, $col_186, value);
	}

	public void col_186(double value) {
		setConstNumber(offset + 376, $col_186, value);
	}


	public MCNumber col_187() {
		return getConstNumber(offset + 377, $col_187);
	}

	public void col_187(MCNumber value) {
		setConstNumber(offset + 377, $col_187, value);
	}

	public void col_187(int value) {
		setConstNumber(offset + 377, $col_187, value);
	}

	public void col_187(long value) {
		setConstNumber(offset + 377, $col_187, value);
	}

	public void col_187(float value) {
		setConstNumber(offset + 377, $col_187, value);
	}

	public void col_187(double value) {
		setConstNumber(offset + 377, $col_187, value);
	}


	public MCNumber col_188() {
		return getConstNumber(offset + 378, $col_188);
	}

	public void col_188(MCNumber value) {
		setConstNumber(offset + 378, $col_188, value);
	}

	public void col_188(int value) {
		setConstNumber(offset + 378, $col_188, value);
	}

	public void col_188(long value) {
		setConstNumber(offset + 378, $col_188, value);
	}

	public void col_188(float value) {
		setConstNumber(offset + 378, $col_188, value);
	}

	public void col_188(double value) {
		setConstNumber(offset + 378, $col_188, value);
	}


	public MCNumber col_189() {
		return getConstNumber(offset + 379, $col_189);
	}

	public void col_189(MCNumber value) {
		setConstNumber(offset + 379, $col_189, value);
	}

	public void col_189(int value) {
		setConstNumber(offset + 379, $col_189, value);
	}

	public void col_189(long value) {
		setConstNumber(offset + 379, $col_189, value);
	}

	public void col_189(float value) {
		setConstNumber(offset + 379, $col_189, value);
	}

	public void col_189(double value) {
		setConstNumber(offset + 379, $col_189, value);
	}


	public MCNumber col_190() {
		return getConstNumber(offset + 380, $col_190);
	}

	public void col_190(MCNumber value) {
		setConstNumber(offset + 380, $col_190, value);
	}

	public void col_190(int value) {
		setConstNumber(offset + 380, $col_190, value);
	}

	public void col_190(long value) {
		setConstNumber(offset + 380, $col_190, value);
	}

	public void col_190(float value) {
		setConstNumber(offset + 380, $col_190, value);
	}

	public void col_190(double value) {
		setConstNumber(offset + 380, $col_190, value);
	}


	public MCNumber col_191() {
		return getConstNumber(offset + 381, $col_191);
	}

	public void col_191(MCNumber value) {
		setConstNumber(offset + 381, $col_191, value);
	}

	public void col_191(int value) {
		setConstNumber(offset + 381, $col_191, value);
	}

	public void col_191(long value) {
		setConstNumber(offset + 381, $col_191, value);
	}

	public void col_191(float value) {
		setConstNumber(offset + 381, $col_191, value);
	}

	public void col_191(double value) {
		setConstNumber(offset + 381, $col_191, value);
	}


	public MCNumber col_192() {
		return getConstNumber(offset + 382, $col_192);
	}

	public void col_192(MCNumber value) {
		setConstNumber(offset + 382, $col_192, value);
	}

	public void col_192(int value) {
		setConstNumber(offset + 382, $col_192, value);
	}

	public void col_192(long value) {
		setConstNumber(offset + 382, $col_192, value);
	}

	public void col_192(float value) {
		setConstNumber(offset + 382, $col_192, value);
	}

	public void col_192(double value) {
		setConstNumber(offset + 382, $col_192, value);
	}


	public MCNumber col_193() {
		return getConstNumber(offset + 383, $col_193);
	}

	public void col_193(MCNumber value) {
		setConstNumber(offset + 383, $col_193, value);
	}

	public void col_193(int value) {
		setConstNumber(offset + 383, $col_193, value);
	}

	public void col_193(long value) {
		setConstNumber(offset + 383, $col_193, value);
	}

	public void col_193(float value) {
		setConstNumber(offset + 383, $col_193, value);
	}

	public void col_193(double value) {
		setConstNumber(offset + 383, $col_193, value);
	}


	public MCNumber col_194() {
		return getConstNumber(offset + 384, $col_194);
	}

	public void col_194(MCNumber value) {
		setConstNumber(offset + 384, $col_194, value);
	}

	public void col_194(int value) {
		setConstNumber(offset + 384, $col_194, value);
	}

	public void col_194(long value) {
		setConstNumber(offset + 384, $col_194, value);
	}

	public void col_194(float value) {
		setConstNumber(offset + 384, $col_194, value);
	}

	public void col_194(double value) {
		setConstNumber(offset + 384, $col_194, value);
	}


	public MCNumber col_195() {
		return getConstNumber(offset + 385, $col_195);
	}

	public void col_195(MCNumber value) {
		setConstNumber(offset + 385, $col_195, value);
	}

	public void col_195(int value) {
		setConstNumber(offset + 385, $col_195, value);
	}

	public void col_195(long value) {
		setConstNumber(offset + 385, $col_195, value);
	}

	public void col_195(float value) {
		setConstNumber(offset + 385, $col_195, value);
	}

	public void col_195(double value) {
		setConstNumber(offset + 385, $col_195, value);
	}


	public MCNumber col_196() {
		return getConstNumber(offset + 386, $col_196);
	}

	public void col_196(MCNumber value) {
		setConstNumber(offset + 386, $col_196, value);
	}

	public void col_196(int value) {
		setConstNumber(offset + 386, $col_196, value);
	}

	public void col_196(long value) {
		setConstNumber(offset + 386, $col_196, value);
	}

	public void col_196(float value) {
		setConstNumber(offset + 386, $col_196, value);
	}

	public void col_196(double value) {
		setConstNumber(offset + 386, $col_196, value);
	}


	public MCNumber col_197() {
		return getConstNumber(offset + 387, $col_197);
	}

	public void col_197(MCNumber value) {
		setConstNumber(offset + 387, $col_197, value);
	}

	public void col_197(int value) {
		setConstNumber(offset + 387, $col_197, value);
	}

	public void col_197(long value) {
		setConstNumber(offset + 387, $col_197, value);
	}

	public void col_197(float value) {
		setConstNumber(offset + 387, $col_197, value);
	}

	public void col_197(double value) {
		setConstNumber(offset + 387, $col_197, value);
	}


	public MCNumber col_198() {
		return getConstNumber(offset + 388, $col_198);
	}

	public void col_198(MCNumber value) {
		setConstNumber(offset + 388, $col_198, value);
	}

	public void col_198(int value) {
		setConstNumber(offset + 388, $col_198, value);
	}

	public void col_198(long value) {
		setConstNumber(offset + 388, $col_198, value);
	}

	public void col_198(float value) {
		setConstNumber(offset + 388, $col_198, value);
	}

	public void col_198(double value) {
		setConstNumber(offset + 388, $col_198, value);
	}


	public MCNumber col_199() {
		return getConstNumber(offset + 389, $col_199);
	}

	public void col_199(MCNumber value) {
		setConstNumber(offset + 389, $col_199, value);
	}

	public void col_199(int value) {
		setConstNumber(offset + 389, $col_199, value);
	}

	public void col_199(long value) {
		setConstNumber(offset + 389, $col_199, value);
	}

	public void col_199(float value) {
		setConstNumber(offset + 389, $col_199, value);
	}

	public void col_199(double value) {
		setConstNumber(offset + 389, $col_199, value);
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
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			return cst_grp_cd1();
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			return cst_grp_nm1();
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			return cst_grp_cd2();
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			return cst_grp_nm2();
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			return cst_grp_cd3();
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			return cst_grp_nm3();
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			return cst_grp_cd4();
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			return cst_grp_nm4();
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			return cst_grp_cd5();
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			return cst_grp_nm5();
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			return cst_grp_cd6();
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			return cst_grp_nm6();
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			return cst_grp_cd7();
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			return cst_grp_nm7();
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			return cst_grp_cd8();
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			return cst_grp_nm8();
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			return cst_grp_cd9();
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			return cst_grp_nm9();
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			return cst_grp_cd10();
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			return cst_grp_nm10();
		}
		if ($cst_cntry_cd.equalsIgnoreCase(name)) {
			return cst_cntry_cd();
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			return cst_cntry_nm();
		}
		if ($cst_area_cd.equalsIgnoreCase(name)) {
			return cst_area_cd();
		}
		if ($cst_area_nm.equalsIgnoreCase(name)) {
			return cst_area_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			return dlv_grp_cd1();
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			return dlv_grp_nm1();
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			return dlv_grp_cd2();
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			return dlv_grp_nm2();
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			return dlv_grp_cd3();
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			return dlv_grp_nm3();
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			return dlv_grp_cd4();
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			return dlv_grp_nm4();
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			return dlv_grp_cd5();
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			return dlv_grp_nm5();
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			return dlv_grp_cd6();
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			return dlv_grp_nm6();
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			return dlv_grp_cd7();
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			return dlv_grp_nm7();
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			return dlv_grp_cd8();
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			return dlv_grp_nm8();
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			return dlv_grp_cd9();
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			return dlv_grp_nm9();
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			return dlv_grp_cd10();
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			return dlv_grp_nm10();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($dlv_area_cd.equalsIgnoreCase(name)) {
			return dlv_area_cd();
		}
		if ($dlv_area_nm.equalsIgnoreCase(name)) {
			return dlv_area_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			return alc_dpt_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($cost_sls_cd1.equalsIgnoreCase(name)) {
			return cost_sls_cd1();
		}
		if ($cost_sls_nm1.equalsIgnoreCase(name)) {
			return cost_sls_nm1();
		}
		if ($cost_sls_cd2.equalsIgnoreCase(name)) {
			return cost_sls_cd2();
		}
		if ($cost_sls_nm2.equalsIgnoreCase(name)) {
			return cost_sls_nm2();
		}
		if ($cost_sls_cd3.equalsIgnoreCase(name)) {
			return cost_sls_cd3();
		}
		if ($cost_sls_nm3.equalsIgnoreCase(name)) {
			return cost_sls_nm3();
		}
		if ($cost_sls_cd4.equalsIgnoreCase(name)) {
			return cost_sls_cd4();
		}
		if ($cost_sls_nm4.equalsIgnoreCase(name)) {
			return cost_sls_nm4();
		}
		if ($cost_sls_cd5.equalsIgnoreCase(name)) {
			return cost_sls_cd5();
		}
		if ($cost_sls_nm5.equalsIgnoreCase(name)) {
			return cost_sls_nm5();
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			return cur_std_amt();
		}
		if ($cur_amt_diff.equalsIgnoreCase(name)) {
			return cur_amt_diff();
		}
		if ($unit_trd_cur_amt.equalsIgnoreCase(name)) {
			return unit_trd_cur_amt();
		}
		if ($unit_cur_std_amt.equalsIgnoreCase(name)) {
			return unit_cur_std_amt();
		}
		if ($unit_cur_amt_diff.equalsIgnoreCase(name)) {
			return unit_cur_amt_diff();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			return std_xrate();
		}
		if ($xrate_diff.equalsIgnoreCase(name)) {
			return xrate_diff();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			return std_amt();
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			return amt_diff();
		}
		if ($amt_upri_diff.equalsIgnoreCase(name)) {
			return amt_upri_diff();
		}
		if ($amt_rate_diff.equalsIgnoreCase(name)) {
			return amt_rate_diff();
		}
		if ($profit.equalsIgnoreCase(name)) {
			return profit();
		}
		if ($std_profit.equalsIgnoreCase(name)) {
			return std_profit();
		}
		if ($unit_amt.equalsIgnoreCase(name)) {
			return unit_amt();
		}
		if ($unit_std_amt.equalsIgnoreCase(name)) {
			return unit_std_amt();
		}
		if ($unit_amt_diff.equalsIgnoreCase(name)) {
			return unit_amt_diff();
		}
		if ($unit_amt_upri_diff.equalsIgnoreCase(name)) {
			return unit_amt_upri_diff();
		}
		if ($unit_amt_rate_diff.equalsIgnoreCase(name)) {
			return unit_amt_rate_diff();
		}
		if ($unit_profit.equalsIgnoreCase(name)) {
			return unit_profit();
		}
		if ($unit_std_profit.equalsIgnoreCase(name)) {
			return unit_std_profit();
		}
		if ($profit_rate.equalsIgnoreCase(name)) {
			return profit_rate();
		}
		if ($std_profit_rate.equalsIgnoreCase(name)) {
			return std_profit_rate();
		}
		if ($sls_profit.equalsIgnoreCase(name)) {
			return sls_profit();
		}
		if ($std_sls_profit.equalsIgnoreCase(name)) {
			return std_sls_profit();
		}
		if ($unit_sls_profit.equalsIgnoreCase(name)) {
			return unit_sls_profit();
		}
		if ($unit_std_sls_profit.equalsIgnoreCase(name)) {
			return unit_std_sls_profit();
		}
		if ($sls_profit_rate.equalsIgnoreCase(name)) {
			return sls_profit_rate();
		}
		if ($std_sls_profit_rate.equalsIgnoreCase(name)) {
			return std_sls_profit_rate();
		}
		if ($limit_profit.equalsIgnoreCase(name)) {
			return limit_profit();
		}
		if ($unit_limit_profit.equalsIgnoreCase(name)) {
			return unit_limit_profit();
		}
		if ($limit_profit_rate.equalsIgnoreCase(name)) {
			return limit_profit_rate();
		}
		if ($var.equalsIgnoreCase(name)) {
			return var();
		}
		if ($fxd.equalsIgnoreCase(name)) {
			return fxd();
		}
		if ($diff.equalsIgnoreCase(name)) {
			return diff();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			return std_sls_cost();
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			return std_sls_mng_cost();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			return sls_cost();
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			return sls_mng_cost();
		}
		if ($unit_var.equalsIgnoreCase(name)) {
			return unit_var();
		}
		if ($unit_fxd.equalsIgnoreCase(name)) {
			return unit_fxd();
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			return unit_diff();
		}
		if ($unit_std_cost.equalsIgnoreCase(name)) {
			return unit_std_cost();
		}
		if ($unit_std_sls_cost.equalsIgnoreCase(name)) {
			return unit_std_sls_cost();
		}
		if ($unit_std_sls_mng_cost.equalsIgnoreCase(name)) {
			return unit_std_sls_mng_cost();
		}
		if ($unit_ttl.equalsIgnoreCase(name)) {
			return unit_ttl();
		}
		if ($unit_sls_cost.equalsIgnoreCase(name)) {
			return unit_sls_cost();
		}
		if ($unit_sls_mng_cost.equalsIgnoreCase(name)) {
			return unit_sls_mng_cost();
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
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			return cst_grp_cd1();
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			return cst_grp_nm1();
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			return cst_grp_cd2();
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			return cst_grp_nm2();
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			return cst_grp_cd3();
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			return cst_grp_nm3();
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			return cst_grp_cd4();
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			return cst_grp_nm4();
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			return cst_grp_cd5();
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			return cst_grp_nm5();
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			return cst_grp_cd6();
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			return cst_grp_nm6();
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			return cst_grp_cd7();
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			return cst_grp_nm7();
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			return cst_grp_cd8();
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			return cst_grp_nm8();
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			return cst_grp_cd9();
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			return cst_grp_nm9();
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			return cst_grp_cd10();
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			return cst_grp_nm10();
		}
		if ($cst_cntry_cd.equalsIgnoreCase(name)) {
			return cst_cntry_cd();
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			return cst_cntry_nm();
		}
		if ($cst_area_cd.equalsIgnoreCase(name)) {
			return cst_area_cd();
		}
		if ($cst_area_nm.equalsIgnoreCase(name)) {
			return cst_area_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			return dlv_grp_cd1();
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			return dlv_grp_nm1();
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			return dlv_grp_cd2();
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			return dlv_grp_nm2();
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			return dlv_grp_cd3();
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			return dlv_grp_nm3();
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			return dlv_grp_cd4();
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			return dlv_grp_nm4();
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			return dlv_grp_cd5();
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			return dlv_grp_nm5();
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			return dlv_grp_cd6();
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			return dlv_grp_nm6();
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			return dlv_grp_cd7();
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			return dlv_grp_nm7();
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			return dlv_grp_cd8();
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			return dlv_grp_nm8();
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			return dlv_grp_cd9();
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			return dlv_grp_nm9();
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			return dlv_grp_cd10();
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			return dlv_grp_nm10();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($dlv_area_cd.equalsIgnoreCase(name)) {
			return dlv_area_cd();
		}
		if ($dlv_area_nm.equalsIgnoreCase(name)) {
			return dlv_area_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			return alc_dpt_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($cost_sls_cd1.equalsIgnoreCase(name)) {
			return cost_sls_cd1();
		}
		if ($cost_sls_nm1.equalsIgnoreCase(name)) {
			return cost_sls_nm1();
		}
		if ($cost_sls_cd2.equalsIgnoreCase(name)) {
			return cost_sls_cd2();
		}
		if ($cost_sls_nm2.equalsIgnoreCase(name)) {
			return cost_sls_nm2();
		}
		if ($cost_sls_cd3.equalsIgnoreCase(name)) {
			return cost_sls_cd3();
		}
		if ($cost_sls_nm3.equalsIgnoreCase(name)) {
			return cost_sls_nm3();
		}
		if ($cost_sls_cd4.equalsIgnoreCase(name)) {
			return cost_sls_cd4();
		}
		if ($cost_sls_nm4.equalsIgnoreCase(name)) {
			return cost_sls_nm4();
		}
		if ($cost_sls_cd5.equalsIgnoreCase(name)) {
			return cost_sls_cd5();
		}
		if ($cost_sls_nm5.equalsIgnoreCase(name)) {
			return cost_sls_nm5();
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			return cur_std_amt();
		}
		if ($cur_amt_diff.equalsIgnoreCase(name)) {
			return cur_amt_diff();
		}
		if ($unit_trd_cur_amt.equalsIgnoreCase(name)) {
			return unit_trd_cur_amt();
		}
		if ($unit_cur_std_amt.equalsIgnoreCase(name)) {
			return unit_cur_std_amt();
		}
		if ($unit_cur_amt_diff.equalsIgnoreCase(name)) {
			return unit_cur_amt_diff();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			return std_xrate();
		}
		if ($xrate_diff.equalsIgnoreCase(name)) {
			return xrate_diff();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			return std_amt();
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			return amt_diff();
		}
		if ($amt_upri_diff.equalsIgnoreCase(name)) {
			return amt_upri_diff();
		}
		if ($amt_rate_diff.equalsIgnoreCase(name)) {
			return amt_rate_diff();
		}
		if ($profit.equalsIgnoreCase(name)) {
			return profit();
		}
		if ($std_profit.equalsIgnoreCase(name)) {
			return std_profit();
		}
		if ($unit_amt.equalsIgnoreCase(name)) {
			return unit_amt();
		}
		if ($unit_std_amt.equalsIgnoreCase(name)) {
			return unit_std_amt();
		}
		if ($unit_amt_diff.equalsIgnoreCase(name)) {
			return unit_amt_diff();
		}
		if ($unit_amt_upri_diff.equalsIgnoreCase(name)) {
			return unit_amt_upri_diff();
		}
		if ($unit_amt_rate_diff.equalsIgnoreCase(name)) {
			return unit_amt_rate_diff();
		}
		if ($unit_profit.equalsIgnoreCase(name)) {
			return unit_profit();
		}
		if ($unit_std_profit.equalsIgnoreCase(name)) {
			return unit_std_profit();
		}
		if ($profit_rate.equalsIgnoreCase(name)) {
			return profit_rate();
		}
		if ($std_profit_rate.equalsIgnoreCase(name)) {
			return std_profit_rate();
		}
		if ($sls_profit.equalsIgnoreCase(name)) {
			return sls_profit();
		}
		if ($std_sls_profit.equalsIgnoreCase(name)) {
			return std_sls_profit();
		}
		if ($unit_sls_profit.equalsIgnoreCase(name)) {
			return unit_sls_profit();
		}
		if ($unit_std_sls_profit.equalsIgnoreCase(name)) {
			return unit_std_sls_profit();
		}
		if ($sls_profit_rate.equalsIgnoreCase(name)) {
			return sls_profit_rate();
		}
		if ($std_sls_profit_rate.equalsIgnoreCase(name)) {
			return std_sls_profit_rate();
		}
		if ($limit_profit.equalsIgnoreCase(name)) {
			return limit_profit();
		}
		if ($unit_limit_profit.equalsIgnoreCase(name)) {
			return unit_limit_profit();
		}
		if ($limit_profit_rate.equalsIgnoreCase(name)) {
			return limit_profit_rate();
		}
		if ($var.equalsIgnoreCase(name)) {
			return var();
		}
		if ($fxd.equalsIgnoreCase(name)) {
			return fxd();
		}
		if ($diff.equalsIgnoreCase(name)) {
			return diff();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			return std_sls_cost();
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			return std_sls_mng_cost();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			return sls_cost();
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			return sls_mng_cost();
		}
		if ($unit_var.equalsIgnoreCase(name)) {
			return unit_var();
		}
		if ($unit_fxd.equalsIgnoreCase(name)) {
			return unit_fxd();
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			return unit_diff();
		}
		if ($unit_std_cost.equalsIgnoreCase(name)) {
			return unit_std_cost();
		}
		if ($unit_std_sls_cost.equalsIgnoreCase(name)) {
			return unit_std_sls_cost();
		}
		if ($unit_std_sls_mng_cost.equalsIgnoreCase(name)) {
			return unit_std_sls_mng_cost();
		}
		if ($unit_ttl.equalsIgnoreCase(name)) {
			return unit_ttl();
		}
		if ($unit_sls_cost.equalsIgnoreCase(name)) {
			return unit_sls_cost();
		}
		if ($unit_sls_mng_cost.equalsIgnoreCase(name)) {
			return unit_sls_mng_cost();
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
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
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
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			cst_grp_cd1(value);
			return;
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			cst_grp_nm1(value);
			return;
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			cst_grp_cd2(value);
			return;
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			cst_grp_nm2(value);
			return;
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			cst_grp_cd3(value);
			return;
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			cst_grp_nm3(value);
			return;
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			cst_grp_cd4(value);
			return;
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			cst_grp_nm4(value);
			return;
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			cst_grp_cd5(value);
			return;
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			cst_grp_nm5(value);
			return;
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			cst_grp_cd6(value);
			return;
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			cst_grp_nm6(value);
			return;
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			cst_grp_cd7(value);
			return;
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			cst_grp_nm7(value);
			return;
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			cst_grp_cd8(value);
			return;
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			cst_grp_nm8(value);
			return;
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			cst_grp_cd9(value);
			return;
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			cst_grp_nm9(value);
			return;
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			cst_grp_cd10(value);
			return;
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			cst_grp_nm10(value);
			return;
		}
		if ($cst_cntry_cd.equalsIgnoreCase(name)) {
			cst_cntry_cd(value);
			return;
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			cst_cntry_nm(value);
			return;
		}
		if ($cst_area_cd.equalsIgnoreCase(name)) {
			cst_area_cd(value);
			return;
		}
		if ($cst_area_nm.equalsIgnoreCase(name)) {
			cst_area_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			dlv_grp_cd1(value);
			return;
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			dlv_grp_nm1(value);
			return;
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			dlv_grp_cd2(value);
			return;
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			dlv_grp_nm2(value);
			return;
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			dlv_grp_cd3(value);
			return;
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			dlv_grp_nm3(value);
			return;
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			dlv_grp_cd4(value);
			return;
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			dlv_grp_nm4(value);
			return;
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			dlv_grp_cd5(value);
			return;
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			dlv_grp_nm5(value);
			return;
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			dlv_grp_cd6(value);
			return;
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			dlv_grp_nm6(value);
			return;
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			dlv_grp_cd7(value);
			return;
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			dlv_grp_nm7(value);
			return;
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			dlv_grp_cd8(value);
			return;
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			dlv_grp_nm8(value);
			return;
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			dlv_grp_cd9(value);
			return;
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			dlv_grp_nm9(value);
			return;
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			dlv_grp_cd10(value);
			return;
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			dlv_grp_nm10(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($dlv_area_cd.equalsIgnoreCase(name)) {
			dlv_area_cd(value);
			return;
		}
		if ($dlv_area_nm.equalsIgnoreCase(name)) {
			dlv_area_nm(value);
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
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
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
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			alc_dpt_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($cost_sls_cd1.equalsIgnoreCase(name)) {
			cost_sls_cd1(value);
			return;
		}
		if ($cost_sls_nm1.equalsIgnoreCase(name)) {
			cost_sls_nm1(value);
			return;
		}
		if ($cost_sls_cd2.equalsIgnoreCase(name)) {
			cost_sls_cd2(value);
			return;
		}
		if ($cost_sls_nm2.equalsIgnoreCase(name)) {
			cost_sls_nm2(value);
			return;
		}
		if ($cost_sls_cd3.equalsIgnoreCase(name)) {
			cost_sls_cd3(value);
			return;
		}
		if ($cost_sls_nm3.equalsIgnoreCase(name)) {
			cost_sls_nm3(value);
			return;
		}
		if ($cost_sls_cd4.equalsIgnoreCase(name)) {
			cost_sls_cd4(value);
			return;
		}
		if ($cost_sls_nm4.equalsIgnoreCase(name)) {
			cost_sls_nm4(value);
			return;
		}
		if ($cost_sls_cd5.equalsIgnoreCase(name)) {
			cost_sls_cd5(value);
			return;
		}
		if ($cost_sls_nm5.equalsIgnoreCase(name)) {
			cost_sls_nm5(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($cur_amt_diff.equalsIgnoreCase(name)) {
			cur_amt_diff(value);
			return;
		}
		if ($unit_trd_cur_amt.equalsIgnoreCase(name)) {
			unit_trd_cur_amt(value);
			return;
		}
		if ($unit_cur_std_amt.equalsIgnoreCase(name)) {
			unit_cur_std_amt(value);
			return;
		}
		if ($unit_cur_amt_diff.equalsIgnoreCase(name)) {
			unit_cur_amt_diff(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate_diff.equalsIgnoreCase(name)) {
			xrate_diff(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($amt_upri_diff.equalsIgnoreCase(name)) {
			amt_upri_diff(value);
			return;
		}
		if ($amt_rate_diff.equalsIgnoreCase(name)) {
			amt_rate_diff(value);
			return;
		}
		if ($profit.equalsIgnoreCase(name)) {
			profit(value);
			return;
		}
		if ($std_profit.equalsIgnoreCase(name)) {
			std_profit(value);
			return;
		}
		if ($unit_amt.equalsIgnoreCase(name)) {
			unit_amt(value);
			return;
		}
		if ($unit_std_amt.equalsIgnoreCase(name)) {
			unit_std_amt(value);
			return;
		}
		if ($unit_amt_diff.equalsIgnoreCase(name)) {
			unit_amt_diff(value);
			return;
		}
		if ($unit_amt_upri_diff.equalsIgnoreCase(name)) {
			unit_amt_upri_diff(value);
			return;
		}
		if ($unit_amt_rate_diff.equalsIgnoreCase(name)) {
			unit_amt_rate_diff(value);
			return;
		}
		if ($unit_profit.equalsIgnoreCase(name)) {
			unit_profit(value);
			return;
		}
		if ($unit_std_profit.equalsIgnoreCase(name)) {
			unit_std_profit(value);
			return;
		}
		if ($profit_rate.equalsIgnoreCase(name)) {
			profit_rate(value);
			return;
		}
		if ($std_profit_rate.equalsIgnoreCase(name)) {
			std_profit_rate(value);
			return;
		}
		if ($sls_profit.equalsIgnoreCase(name)) {
			sls_profit(value);
			return;
		}
		if ($std_sls_profit.equalsIgnoreCase(name)) {
			std_sls_profit(value);
			return;
		}
		if ($unit_sls_profit.equalsIgnoreCase(name)) {
			unit_sls_profit(value);
			return;
		}
		if ($unit_std_sls_profit.equalsIgnoreCase(name)) {
			unit_std_sls_profit(value);
			return;
		}
		if ($sls_profit_rate.equalsIgnoreCase(name)) {
			sls_profit_rate(value);
			return;
		}
		if ($std_sls_profit_rate.equalsIgnoreCase(name)) {
			std_sls_profit_rate(value);
			return;
		}
		if ($limit_profit.equalsIgnoreCase(name)) {
			limit_profit(value);
			return;
		}
		if ($unit_limit_profit.equalsIgnoreCase(name)) {
			unit_limit_profit(value);
			return;
		}
		if ($limit_profit_rate.equalsIgnoreCase(name)) {
			limit_profit_rate(value);
			return;
		}
		if ($var.equalsIgnoreCase(name)) {
			var(value);
			return;
		}
		if ($fxd.equalsIgnoreCase(name)) {
			fxd(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($unit_var.equalsIgnoreCase(name)) {
			unit_var(value);
			return;
		}
		if ($unit_fxd.equalsIgnoreCase(name)) {
			unit_fxd(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($unit_std_cost.equalsIgnoreCase(name)) {
			unit_std_cost(value);
			return;
		}
		if ($unit_std_sls_cost.equalsIgnoreCase(name)) {
			unit_std_sls_cost(value);
			return;
		}
		if ($unit_std_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_std_sls_mng_cost(value);
			return;
		}
		if ($unit_ttl.equalsIgnoreCase(name)) {
			unit_ttl(value);
			return;
		}
		if ($unit_sls_cost.equalsIgnoreCase(name)) {
			unit_sls_cost(value);
			return;
		}
		if ($unit_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_sls_mng_cost(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($cur_amt_diff.equalsIgnoreCase(name)) {
			cur_amt_diff(value);
			return;
		}
		if ($unit_trd_cur_amt.equalsIgnoreCase(name)) {
			unit_trd_cur_amt(value);
			return;
		}
		if ($unit_cur_std_amt.equalsIgnoreCase(name)) {
			unit_cur_std_amt(value);
			return;
		}
		if ($unit_cur_amt_diff.equalsIgnoreCase(name)) {
			unit_cur_amt_diff(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate_diff.equalsIgnoreCase(name)) {
			xrate_diff(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($amt_upri_diff.equalsIgnoreCase(name)) {
			amt_upri_diff(value);
			return;
		}
		if ($amt_rate_diff.equalsIgnoreCase(name)) {
			amt_rate_diff(value);
			return;
		}
		if ($profit.equalsIgnoreCase(name)) {
			profit(value);
			return;
		}
		if ($std_profit.equalsIgnoreCase(name)) {
			std_profit(value);
			return;
		}
		if ($unit_amt.equalsIgnoreCase(name)) {
			unit_amt(value);
			return;
		}
		if ($unit_std_amt.equalsIgnoreCase(name)) {
			unit_std_amt(value);
			return;
		}
		if ($unit_amt_diff.equalsIgnoreCase(name)) {
			unit_amt_diff(value);
			return;
		}
		if ($unit_amt_upri_diff.equalsIgnoreCase(name)) {
			unit_amt_upri_diff(value);
			return;
		}
		if ($unit_amt_rate_diff.equalsIgnoreCase(name)) {
			unit_amt_rate_diff(value);
			return;
		}
		if ($unit_profit.equalsIgnoreCase(name)) {
			unit_profit(value);
			return;
		}
		if ($unit_std_profit.equalsIgnoreCase(name)) {
			unit_std_profit(value);
			return;
		}
		if ($profit_rate.equalsIgnoreCase(name)) {
			profit_rate(value);
			return;
		}
		if ($std_profit_rate.equalsIgnoreCase(name)) {
			std_profit_rate(value);
			return;
		}
		if ($sls_profit.equalsIgnoreCase(name)) {
			sls_profit(value);
			return;
		}
		if ($std_sls_profit.equalsIgnoreCase(name)) {
			std_sls_profit(value);
			return;
		}
		if ($unit_sls_profit.equalsIgnoreCase(name)) {
			unit_sls_profit(value);
			return;
		}
		if ($unit_std_sls_profit.equalsIgnoreCase(name)) {
			unit_std_sls_profit(value);
			return;
		}
		if ($sls_profit_rate.equalsIgnoreCase(name)) {
			sls_profit_rate(value);
			return;
		}
		if ($std_sls_profit_rate.equalsIgnoreCase(name)) {
			std_sls_profit_rate(value);
			return;
		}
		if ($limit_profit.equalsIgnoreCase(name)) {
			limit_profit(value);
			return;
		}
		if ($unit_limit_profit.equalsIgnoreCase(name)) {
			unit_limit_profit(value);
			return;
		}
		if ($limit_profit_rate.equalsIgnoreCase(name)) {
			limit_profit_rate(value);
			return;
		}
		if ($var.equalsIgnoreCase(name)) {
			var(value);
			return;
		}
		if ($fxd.equalsIgnoreCase(name)) {
			fxd(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($unit_var.equalsIgnoreCase(name)) {
			unit_var(value);
			return;
		}
		if ($unit_fxd.equalsIgnoreCase(name)) {
			unit_fxd(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($unit_std_cost.equalsIgnoreCase(name)) {
			unit_std_cost(value);
			return;
		}
		if ($unit_std_sls_cost.equalsIgnoreCase(name)) {
			unit_std_sls_cost(value);
			return;
		}
		if ($unit_std_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_std_sls_mng_cost(value);
			return;
		}
		if ($unit_ttl.equalsIgnoreCase(name)) {
			unit_ttl(value);
			return;
		}
		if ($unit_sls_cost.equalsIgnoreCase(name)) {
			unit_sls_cost(value);
			return;
		}
		if ($unit_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_sls_mng_cost(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($cur_amt_diff.equalsIgnoreCase(name)) {
			cur_amt_diff(value);
			return;
		}
		if ($unit_trd_cur_amt.equalsIgnoreCase(name)) {
			unit_trd_cur_amt(value);
			return;
		}
		if ($unit_cur_std_amt.equalsIgnoreCase(name)) {
			unit_cur_std_amt(value);
			return;
		}
		if ($unit_cur_amt_diff.equalsIgnoreCase(name)) {
			unit_cur_amt_diff(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate_diff.equalsIgnoreCase(name)) {
			xrate_diff(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($amt_upri_diff.equalsIgnoreCase(name)) {
			amt_upri_diff(value);
			return;
		}
		if ($amt_rate_diff.equalsIgnoreCase(name)) {
			amt_rate_diff(value);
			return;
		}
		if ($profit.equalsIgnoreCase(name)) {
			profit(value);
			return;
		}
		if ($std_profit.equalsIgnoreCase(name)) {
			std_profit(value);
			return;
		}
		if ($unit_amt.equalsIgnoreCase(name)) {
			unit_amt(value);
			return;
		}
		if ($unit_std_amt.equalsIgnoreCase(name)) {
			unit_std_amt(value);
			return;
		}
		if ($unit_amt_diff.equalsIgnoreCase(name)) {
			unit_amt_diff(value);
			return;
		}
		if ($unit_amt_upri_diff.equalsIgnoreCase(name)) {
			unit_amt_upri_diff(value);
			return;
		}
		if ($unit_amt_rate_diff.equalsIgnoreCase(name)) {
			unit_amt_rate_diff(value);
			return;
		}
		if ($unit_profit.equalsIgnoreCase(name)) {
			unit_profit(value);
			return;
		}
		if ($unit_std_profit.equalsIgnoreCase(name)) {
			unit_std_profit(value);
			return;
		}
		if ($profit_rate.equalsIgnoreCase(name)) {
			profit_rate(value);
			return;
		}
		if ($std_profit_rate.equalsIgnoreCase(name)) {
			std_profit_rate(value);
			return;
		}
		if ($sls_profit.equalsIgnoreCase(name)) {
			sls_profit(value);
			return;
		}
		if ($std_sls_profit.equalsIgnoreCase(name)) {
			std_sls_profit(value);
			return;
		}
		if ($unit_sls_profit.equalsIgnoreCase(name)) {
			unit_sls_profit(value);
			return;
		}
		if ($unit_std_sls_profit.equalsIgnoreCase(name)) {
			unit_std_sls_profit(value);
			return;
		}
		if ($sls_profit_rate.equalsIgnoreCase(name)) {
			sls_profit_rate(value);
			return;
		}
		if ($std_sls_profit_rate.equalsIgnoreCase(name)) {
			std_sls_profit_rate(value);
			return;
		}
		if ($limit_profit.equalsIgnoreCase(name)) {
			limit_profit(value);
			return;
		}
		if ($unit_limit_profit.equalsIgnoreCase(name)) {
			unit_limit_profit(value);
			return;
		}
		if ($limit_profit_rate.equalsIgnoreCase(name)) {
			limit_profit_rate(value);
			return;
		}
		if ($var.equalsIgnoreCase(name)) {
			var(value);
			return;
		}
		if ($fxd.equalsIgnoreCase(name)) {
			fxd(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($unit_var.equalsIgnoreCase(name)) {
			unit_var(value);
			return;
		}
		if ($unit_fxd.equalsIgnoreCase(name)) {
			unit_fxd(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($unit_std_cost.equalsIgnoreCase(name)) {
			unit_std_cost(value);
			return;
		}
		if ($unit_std_sls_cost.equalsIgnoreCase(name)) {
			unit_std_sls_cost(value);
			return;
		}
		if ($unit_std_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_std_sls_mng_cost(value);
			return;
		}
		if ($unit_ttl.equalsIgnoreCase(name)) {
			unit_ttl(value);
			return;
		}
		if ($unit_sls_cost.equalsIgnoreCase(name)) {
			unit_sls_cost(value);
			return;
		}
		if ($unit_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_sls_mng_cost(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($cur_amt_diff.equalsIgnoreCase(name)) {
			cur_amt_diff(value);
			return;
		}
		if ($unit_trd_cur_amt.equalsIgnoreCase(name)) {
			unit_trd_cur_amt(value);
			return;
		}
		if ($unit_cur_std_amt.equalsIgnoreCase(name)) {
			unit_cur_std_amt(value);
			return;
		}
		if ($unit_cur_amt_diff.equalsIgnoreCase(name)) {
			unit_cur_amt_diff(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate_diff.equalsIgnoreCase(name)) {
			xrate_diff(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($amt_upri_diff.equalsIgnoreCase(name)) {
			amt_upri_diff(value);
			return;
		}
		if ($amt_rate_diff.equalsIgnoreCase(name)) {
			amt_rate_diff(value);
			return;
		}
		if ($profit.equalsIgnoreCase(name)) {
			profit(value);
			return;
		}
		if ($std_profit.equalsIgnoreCase(name)) {
			std_profit(value);
			return;
		}
		if ($unit_amt.equalsIgnoreCase(name)) {
			unit_amt(value);
			return;
		}
		if ($unit_std_amt.equalsIgnoreCase(name)) {
			unit_std_amt(value);
			return;
		}
		if ($unit_amt_diff.equalsIgnoreCase(name)) {
			unit_amt_diff(value);
			return;
		}
		if ($unit_amt_upri_diff.equalsIgnoreCase(name)) {
			unit_amt_upri_diff(value);
			return;
		}
		if ($unit_amt_rate_diff.equalsIgnoreCase(name)) {
			unit_amt_rate_diff(value);
			return;
		}
		if ($unit_profit.equalsIgnoreCase(name)) {
			unit_profit(value);
			return;
		}
		if ($unit_std_profit.equalsIgnoreCase(name)) {
			unit_std_profit(value);
			return;
		}
		if ($profit_rate.equalsIgnoreCase(name)) {
			profit_rate(value);
			return;
		}
		if ($std_profit_rate.equalsIgnoreCase(name)) {
			std_profit_rate(value);
			return;
		}
		if ($sls_profit.equalsIgnoreCase(name)) {
			sls_profit(value);
			return;
		}
		if ($std_sls_profit.equalsIgnoreCase(name)) {
			std_sls_profit(value);
			return;
		}
		if ($unit_sls_profit.equalsIgnoreCase(name)) {
			unit_sls_profit(value);
			return;
		}
		if ($unit_std_sls_profit.equalsIgnoreCase(name)) {
			unit_std_sls_profit(value);
			return;
		}
		if ($sls_profit_rate.equalsIgnoreCase(name)) {
			sls_profit_rate(value);
			return;
		}
		if ($std_sls_profit_rate.equalsIgnoreCase(name)) {
			std_sls_profit_rate(value);
			return;
		}
		if ($limit_profit.equalsIgnoreCase(name)) {
			limit_profit(value);
			return;
		}
		if ($unit_limit_profit.equalsIgnoreCase(name)) {
			unit_limit_profit(value);
			return;
		}
		if ($limit_profit_rate.equalsIgnoreCase(name)) {
			limit_profit_rate(value);
			return;
		}
		if ($var.equalsIgnoreCase(name)) {
			var(value);
			return;
		}
		if ($fxd.equalsIgnoreCase(name)) {
			fxd(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($unit_var.equalsIgnoreCase(name)) {
			unit_var(value);
			return;
		}
		if ($unit_fxd.equalsIgnoreCase(name)) {
			unit_fxd(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($unit_std_cost.equalsIgnoreCase(name)) {
			unit_std_cost(value);
			return;
		}
		if ($unit_std_sls_cost.equalsIgnoreCase(name)) {
			unit_std_sls_cost(value);
			return;
		}
		if ($unit_std_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_std_sls_mng_cost(value);
			return;
		}
		if ($unit_ttl.equalsIgnoreCase(name)) {
			unit_ttl(value);
			return;
		}
		if ($unit_sls_cost.equalsIgnoreCase(name)) {
			unit_sls_cost(value);
			return;
		}
		if ($unit_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_sls_mng_cost(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($cur_amt_diff.equalsIgnoreCase(name)) {
			cur_amt_diff(value);
			return;
		}
		if ($unit_trd_cur_amt.equalsIgnoreCase(name)) {
			unit_trd_cur_amt(value);
			return;
		}
		if ($unit_cur_std_amt.equalsIgnoreCase(name)) {
			unit_cur_std_amt(value);
			return;
		}
		if ($unit_cur_amt_diff.equalsIgnoreCase(name)) {
			unit_cur_amt_diff(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate_diff.equalsIgnoreCase(name)) {
			xrate_diff(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($amt_upri_diff.equalsIgnoreCase(name)) {
			amt_upri_diff(value);
			return;
		}
		if ($amt_rate_diff.equalsIgnoreCase(name)) {
			amt_rate_diff(value);
			return;
		}
		if ($profit.equalsIgnoreCase(name)) {
			profit(value);
			return;
		}
		if ($std_profit.equalsIgnoreCase(name)) {
			std_profit(value);
			return;
		}
		if ($unit_amt.equalsIgnoreCase(name)) {
			unit_amt(value);
			return;
		}
		if ($unit_std_amt.equalsIgnoreCase(name)) {
			unit_std_amt(value);
			return;
		}
		if ($unit_amt_diff.equalsIgnoreCase(name)) {
			unit_amt_diff(value);
			return;
		}
		if ($unit_amt_upri_diff.equalsIgnoreCase(name)) {
			unit_amt_upri_diff(value);
			return;
		}
		if ($unit_amt_rate_diff.equalsIgnoreCase(name)) {
			unit_amt_rate_diff(value);
			return;
		}
		if ($unit_profit.equalsIgnoreCase(name)) {
			unit_profit(value);
			return;
		}
		if ($unit_std_profit.equalsIgnoreCase(name)) {
			unit_std_profit(value);
			return;
		}
		if ($profit_rate.equalsIgnoreCase(name)) {
			profit_rate(value);
			return;
		}
		if ($std_profit_rate.equalsIgnoreCase(name)) {
			std_profit_rate(value);
			return;
		}
		if ($sls_profit.equalsIgnoreCase(name)) {
			sls_profit(value);
			return;
		}
		if ($std_sls_profit.equalsIgnoreCase(name)) {
			std_sls_profit(value);
			return;
		}
		if ($unit_sls_profit.equalsIgnoreCase(name)) {
			unit_sls_profit(value);
			return;
		}
		if ($unit_std_sls_profit.equalsIgnoreCase(name)) {
			unit_std_sls_profit(value);
			return;
		}
		if ($sls_profit_rate.equalsIgnoreCase(name)) {
			sls_profit_rate(value);
			return;
		}
		if ($std_sls_profit_rate.equalsIgnoreCase(name)) {
			std_sls_profit_rate(value);
			return;
		}
		if ($limit_profit.equalsIgnoreCase(name)) {
			limit_profit(value);
			return;
		}
		if ($unit_limit_profit.equalsIgnoreCase(name)) {
			unit_limit_profit(value);
			return;
		}
		if ($limit_profit_rate.equalsIgnoreCase(name)) {
			limit_profit_rate(value);
			return;
		}
		if ($var.equalsIgnoreCase(name)) {
			var(value);
			return;
		}
		if ($fxd.equalsIgnoreCase(name)) {
			fxd(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($unit_var.equalsIgnoreCase(name)) {
			unit_var(value);
			return;
		}
		if ($unit_fxd.equalsIgnoreCase(name)) {
			unit_fxd(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($unit_std_cost.equalsIgnoreCase(name)) {
			unit_std_cost(value);
			return;
		}
		if ($unit_std_sls_cost.equalsIgnoreCase(name)) {
			unit_std_sls_cost(value);
			return;
		}
		if ($unit_std_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_std_sls_mng_cost(value);
			return;
		}
		if ($unit_ttl.equalsIgnoreCase(name)) {
			unit_ttl(value);
			return;
		}
		if ($unit_sls_cost.equalsIgnoreCase(name)) {
			unit_sls_cost(value);
			return;
		}
		if ($unit_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_sls_mng_cost(value);
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
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
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
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			cst_grp_cd1(value);
			return;
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			cst_grp_nm1(value);
			return;
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			cst_grp_cd2(value);
			return;
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			cst_grp_nm2(value);
			return;
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			cst_grp_cd3(value);
			return;
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			cst_grp_nm3(value);
			return;
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			cst_grp_cd4(value);
			return;
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			cst_grp_nm4(value);
			return;
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			cst_grp_cd5(value);
			return;
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			cst_grp_nm5(value);
			return;
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			cst_grp_cd6(value);
			return;
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			cst_grp_nm6(value);
			return;
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			cst_grp_cd7(value);
			return;
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			cst_grp_nm7(value);
			return;
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			cst_grp_cd8(value);
			return;
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			cst_grp_nm8(value);
			return;
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			cst_grp_cd9(value);
			return;
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			cst_grp_nm9(value);
			return;
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			cst_grp_cd10(value);
			return;
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			cst_grp_nm10(value);
			return;
		}
		if ($cst_cntry_cd.equalsIgnoreCase(name)) {
			cst_cntry_cd(value);
			return;
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			cst_cntry_nm(value);
			return;
		}
		if ($cst_area_cd.equalsIgnoreCase(name)) {
			cst_area_cd(value);
			return;
		}
		if ($cst_area_nm.equalsIgnoreCase(name)) {
			cst_area_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			dlv_grp_cd1(value);
			return;
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			dlv_grp_nm1(value);
			return;
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			dlv_grp_cd2(value);
			return;
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			dlv_grp_nm2(value);
			return;
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			dlv_grp_cd3(value);
			return;
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			dlv_grp_nm3(value);
			return;
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			dlv_grp_cd4(value);
			return;
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			dlv_grp_nm4(value);
			return;
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			dlv_grp_cd5(value);
			return;
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			dlv_grp_nm5(value);
			return;
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			dlv_grp_cd6(value);
			return;
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			dlv_grp_nm6(value);
			return;
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			dlv_grp_cd7(value);
			return;
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			dlv_grp_nm7(value);
			return;
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			dlv_grp_cd8(value);
			return;
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			dlv_grp_nm8(value);
			return;
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			dlv_grp_cd9(value);
			return;
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			dlv_grp_nm9(value);
			return;
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			dlv_grp_cd10(value);
			return;
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			dlv_grp_nm10(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($dlv_area_cd.equalsIgnoreCase(name)) {
			dlv_area_cd(value);
			return;
		}
		if ($dlv_area_nm.equalsIgnoreCase(name)) {
			dlv_area_nm(value);
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
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
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
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			alc_dpt_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($cost_sls_cd1.equalsIgnoreCase(name)) {
			cost_sls_cd1(value);
			return;
		}
		if ($cost_sls_nm1.equalsIgnoreCase(name)) {
			cost_sls_nm1(value);
			return;
		}
		if ($cost_sls_cd2.equalsIgnoreCase(name)) {
			cost_sls_cd2(value);
			return;
		}
		if ($cost_sls_nm2.equalsIgnoreCase(name)) {
			cost_sls_nm2(value);
			return;
		}
		if ($cost_sls_cd3.equalsIgnoreCase(name)) {
			cost_sls_cd3(value);
			return;
		}
		if ($cost_sls_nm3.equalsIgnoreCase(name)) {
			cost_sls_nm3(value);
			return;
		}
		if ($cost_sls_cd4.equalsIgnoreCase(name)) {
			cost_sls_cd4(value);
			return;
		}
		if ($cost_sls_nm4.equalsIgnoreCase(name)) {
			cost_sls_nm4(value);
			return;
		}
		if ($cost_sls_cd5.equalsIgnoreCase(name)) {
			cost_sls_cd5(value);
			return;
		}
		if ($cost_sls_nm5.equalsIgnoreCase(name)) {
			cost_sls_nm5(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($cur_amt_diff.equalsIgnoreCase(name)) {
			cur_amt_diff(value);
			return;
		}
		if ($unit_trd_cur_amt.equalsIgnoreCase(name)) {
			unit_trd_cur_amt(value);
			return;
		}
		if ($unit_cur_std_amt.equalsIgnoreCase(name)) {
			unit_cur_std_amt(value);
			return;
		}
		if ($unit_cur_amt_diff.equalsIgnoreCase(name)) {
			unit_cur_amt_diff(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate_diff.equalsIgnoreCase(name)) {
			xrate_diff(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($amt_upri_diff.equalsIgnoreCase(name)) {
			amt_upri_diff(value);
			return;
		}
		if ($amt_rate_diff.equalsIgnoreCase(name)) {
			amt_rate_diff(value);
			return;
		}
		if ($profit.equalsIgnoreCase(name)) {
			profit(value);
			return;
		}
		if ($std_profit.equalsIgnoreCase(name)) {
			std_profit(value);
			return;
		}
		if ($unit_amt.equalsIgnoreCase(name)) {
			unit_amt(value);
			return;
		}
		if ($unit_std_amt.equalsIgnoreCase(name)) {
			unit_std_amt(value);
			return;
		}
		if ($unit_amt_diff.equalsIgnoreCase(name)) {
			unit_amt_diff(value);
			return;
		}
		if ($unit_amt_upri_diff.equalsIgnoreCase(name)) {
			unit_amt_upri_diff(value);
			return;
		}
		if ($unit_amt_rate_diff.equalsIgnoreCase(name)) {
			unit_amt_rate_diff(value);
			return;
		}
		if ($unit_profit.equalsIgnoreCase(name)) {
			unit_profit(value);
			return;
		}
		if ($unit_std_profit.equalsIgnoreCase(name)) {
			unit_std_profit(value);
			return;
		}
		if ($profit_rate.equalsIgnoreCase(name)) {
			profit_rate(value);
			return;
		}
		if ($std_profit_rate.equalsIgnoreCase(name)) {
			std_profit_rate(value);
			return;
		}
		if ($sls_profit.equalsIgnoreCase(name)) {
			sls_profit(value);
			return;
		}
		if ($std_sls_profit.equalsIgnoreCase(name)) {
			std_sls_profit(value);
			return;
		}
		if ($unit_sls_profit.equalsIgnoreCase(name)) {
			unit_sls_profit(value);
			return;
		}
		if ($unit_std_sls_profit.equalsIgnoreCase(name)) {
			unit_std_sls_profit(value);
			return;
		}
		if ($sls_profit_rate.equalsIgnoreCase(name)) {
			sls_profit_rate(value);
			return;
		}
		if ($std_sls_profit_rate.equalsIgnoreCase(name)) {
			std_sls_profit_rate(value);
			return;
		}
		if ($limit_profit.equalsIgnoreCase(name)) {
			limit_profit(value);
			return;
		}
		if ($unit_limit_profit.equalsIgnoreCase(name)) {
			unit_limit_profit(value);
			return;
		}
		if ($limit_profit_rate.equalsIgnoreCase(name)) {
			limit_profit_rate(value);
			return;
		}
		if ($var.equalsIgnoreCase(name)) {
			var(value);
			return;
		}
		if ($fxd.equalsIgnoreCase(name)) {
			fxd(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($unit_var.equalsIgnoreCase(name)) {
			unit_var(value);
			return;
		}
		if ($unit_fxd.equalsIgnoreCase(name)) {
			unit_fxd(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($unit_std_cost.equalsIgnoreCase(name)) {
			unit_std_cost(value);
			return;
		}
		if ($unit_std_sls_cost.equalsIgnoreCase(name)) {
			unit_std_sls_cost(value);
			return;
		}
		if ($unit_std_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_std_sls_mng_cost(value);
			return;
		}
		if ($unit_ttl.equalsIgnoreCase(name)) {
			unit_ttl(value);
			return;
		}
		if ($unit_sls_cost.equalsIgnoreCase(name)) {
			unit_sls_cost(value);
			return;
		}
		if ($unit_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_sls_mng_cost(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($cur_amt_diff.equalsIgnoreCase(name)) {
			cur_amt_diff(value);
			return;
		}
		if ($unit_trd_cur_amt.equalsIgnoreCase(name)) {
			unit_trd_cur_amt(value);
			return;
		}
		if ($unit_cur_std_amt.equalsIgnoreCase(name)) {
			unit_cur_std_amt(value);
			return;
		}
		if ($unit_cur_amt_diff.equalsIgnoreCase(name)) {
			unit_cur_amt_diff(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate_diff.equalsIgnoreCase(name)) {
			xrate_diff(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($amt_upri_diff.equalsIgnoreCase(name)) {
			amt_upri_diff(value);
			return;
		}
		if ($amt_rate_diff.equalsIgnoreCase(name)) {
			amt_rate_diff(value);
			return;
		}
		if ($profit.equalsIgnoreCase(name)) {
			profit(value);
			return;
		}
		if ($std_profit.equalsIgnoreCase(name)) {
			std_profit(value);
			return;
		}
		if ($unit_amt.equalsIgnoreCase(name)) {
			unit_amt(value);
			return;
		}
		if ($unit_std_amt.equalsIgnoreCase(name)) {
			unit_std_amt(value);
			return;
		}
		if ($unit_amt_diff.equalsIgnoreCase(name)) {
			unit_amt_diff(value);
			return;
		}
		if ($unit_amt_upri_diff.equalsIgnoreCase(name)) {
			unit_amt_upri_diff(value);
			return;
		}
		if ($unit_amt_rate_diff.equalsIgnoreCase(name)) {
			unit_amt_rate_diff(value);
			return;
		}
		if ($unit_profit.equalsIgnoreCase(name)) {
			unit_profit(value);
			return;
		}
		if ($unit_std_profit.equalsIgnoreCase(name)) {
			unit_std_profit(value);
			return;
		}
		if ($profit_rate.equalsIgnoreCase(name)) {
			profit_rate(value);
			return;
		}
		if ($std_profit_rate.equalsIgnoreCase(name)) {
			std_profit_rate(value);
			return;
		}
		if ($sls_profit.equalsIgnoreCase(name)) {
			sls_profit(value);
			return;
		}
		if ($std_sls_profit.equalsIgnoreCase(name)) {
			std_sls_profit(value);
			return;
		}
		if ($unit_sls_profit.equalsIgnoreCase(name)) {
			unit_sls_profit(value);
			return;
		}
		if ($unit_std_sls_profit.equalsIgnoreCase(name)) {
			unit_std_sls_profit(value);
			return;
		}
		if ($sls_profit_rate.equalsIgnoreCase(name)) {
			sls_profit_rate(value);
			return;
		}
		if ($std_sls_profit_rate.equalsIgnoreCase(name)) {
			std_sls_profit_rate(value);
			return;
		}
		if ($limit_profit.equalsIgnoreCase(name)) {
			limit_profit(value);
			return;
		}
		if ($unit_limit_profit.equalsIgnoreCase(name)) {
			unit_limit_profit(value);
			return;
		}
		if ($limit_profit_rate.equalsIgnoreCase(name)) {
			limit_profit_rate(value);
			return;
		}
		if ($var.equalsIgnoreCase(name)) {
			var(value);
			return;
		}
		if ($fxd.equalsIgnoreCase(name)) {
			fxd(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($unit_var.equalsIgnoreCase(name)) {
			unit_var(value);
			return;
		}
		if ($unit_fxd.equalsIgnoreCase(name)) {
			unit_fxd(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($unit_std_cost.equalsIgnoreCase(name)) {
			unit_std_cost(value);
			return;
		}
		if ($unit_std_sls_cost.equalsIgnoreCase(name)) {
			unit_std_sls_cost(value);
			return;
		}
		if ($unit_std_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_std_sls_mng_cost(value);
			return;
		}
		if ($unit_ttl.equalsIgnoreCase(name)) {
			unit_ttl(value);
			return;
		}
		if ($unit_sls_cost.equalsIgnoreCase(name)) {
			unit_sls_cost(value);
			return;
		}
		if ($unit_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_sls_mng_cost(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($cur_amt_diff.equalsIgnoreCase(name)) {
			cur_amt_diff(value);
			return;
		}
		if ($unit_trd_cur_amt.equalsIgnoreCase(name)) {
			unit_trd_cur_amt(value);
			return;
		}
		if ($unit_cur_std_amt.equalsIgnoreCase(name)) {
			unit_cur_std_amt(value);
			return;
		}
		if ($unit_cur_amt_diff.equalsIgnoreCase(name)) {
			unit_cur_amt_diff(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate_diff.equalsIgnoreCase(name)) {
			xrate_diff(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($amt_upri_diff.equalsIgnoreCase(name)) {
			amt_upri_diff(value);
			return;
		}
		if ($amt_rate_diff.equalsIgnoreCase(name)) {
			amt_rate_diff(value);
			return;
		}
		if ($profit.equalsIgnoreCase(name)) {
			profit(value);
			return;
		}
		if ($std_profit.equalsIgnoreCase(name)) {
			std_profit(value);
			return;
		}
		if ($unit_amt.equalsIgnoreCase(name)) {
			unit_amt(value);
			return;
		}
		if ($unit_std_amt.equalsIgnoreCase(name)) {
			unit_std_amt(value);
			return;
		}
		if ($unit_amt_diff.equalsIgnoreCase(name)) {
			unit_amt_diff(value);
			return;
		}
		if ($unit_amt_upri_diff.equalsIgnoreCase(name)) {
			unit_amt_upri_diff(value);
			return;
		}
		if ($unit_amt_rate_diff.equalsIgnoreCase(name)) {
			unit_amt_rate_diff(value);
			return;
		}
		if ($unit_profit.equalsIgnoreCase(name)) {
			unit_profit(value);
			return;
		}
		if ($unit_std_profit.equalsIgnoreCase(name)) {
			unit_std_profit(value);
			return;
		}
		if ($profit_rate.equalsIgnoreCase(name)) {
			profit_rate(value);
			return;
		}
		if ($std_profit_rate.equalsIgnoreCase(name)) {
			std_profit_rate(value);
			return;
		}
		if ($sls_profit.equalsIgnoreCase(name)) {
			sls_profit(value);
			return;
		}
		if ($std_sls_profit.equalsIgnoreCase(name)) {
			std_sls_profit(value);
			return;
		}
		if ($unit_sls_profit.equalsIgnoreCase(name)) {
			unit_sls_profit(value);
			return;
		}
		if ($unit_std_sls_profit.equalsIgnoreCase(name)) {
			unit_std_sls_profit(value);
			return;
		}
		if ($sls_profit_rate.equalsIgnoreCase(name)) {
			sls_profit_rate(value);
			return;
		}
		if ($std_sls_profit_rate.equalsIgnoreCase(name)) {
			std_sls_profit_rate(value);
			return;
		}
		if ($limit_profit.equalsIgnoreCase(name)) {
			limit_profit(value);
			return;
		}
		if ($unit_limit_profit.equalsIgnoreCase(name)) {
			unit_limit_profit(value);
			return;
		}
		if ($limit_profit_rate.equalsIgnoreCase(name)) {
			limit_profit_rate(value);
			return;
		}
		if ($var.equalsIgnoreCase(name)) {
			var(value);
			return;
		}
		if ($fxd.equalsIgnoreCase(name)) {
			fxd(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($unit_var.equalsIgnoreCase(name)) {
			unit_var(value);
			return;
		}
		if ($unit_fxd.equalsIgnoreCase(name)) {
			unit_fxd(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($unit_std_cost.equalsIgnoreCase(name)) {
			unit_std_cost(value);
			return;
		}
		if ($unit_std_sls_cost.equalsIgnoreCase(name)) {
			unit_std_sls_cost(value);
			return;
		}
		if ($unit_std_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_std_sls_mng_cost(value);
			return;
		}
		if ($unit_ttl.equalsIgnoreCase(name)) {
			unit_ttl(value);
			return;
		}
		if ($unit_sls_cost.equalsIgnoreCase(name)) {
			unit_sls_cost(value);
			return;
		}
		if ($unit_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_sls_mng_cost(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($cur_amt_diff.equalsIgnoreCase(name)) {
			cur_amt_diff(value);
			return;
		}
		if ($unit_trd_cur_amt.equalsIgnoreCase(name)) {
			unit_trd_cur_amt(value);
			return;
		}
		if ($unit_cur_std_amt.equalsIgnoreCase(name)) {
			unit_cur_std_amt(value);
			return;
		}
		if ($unit_cur_amt_diff.equalsIgnoreCase(name)) {
			unit_cur_amt_diff(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate_diff.equalsIgnoreCase(name)) {
			xrate_diff(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($amt_upri_diff.equalsIgnoreCase(name)) {
			amt_upri_diff(value);
			return;
		}
		if ($amt_rate_diff.equalsIgnoreCase(name)) {
			amt_rate_diff(value);
			return;
		}
		if ($profit.equalsIgnoreCase(name)) {
			profit(value);
			return;
		}
		if ($std_profit.equalsIgnoreCase(name)) {
			std_profit(value);
			return;
		}
		if ($unit_amt.equalsIgnoreCase(name)) {
			unit_amt(value);
			return;
		}
		if ($unit_std_amt.equalsIgnoreCase(name)) {
			unit_std_amt(value);
			return;
		}
		if ($unit_amt_diff.equalsIgnoreCase(name)) {
			unit_amt_diff(value);
			return;
		}
		if ($unit_amt_upri_diff.equalsIgnoreCase(name)) {
			unit_amt_upri_diff(value);
			return;
		}
		if ($unit_amt_rate_diff.equalsIgnoreCase(name)) {
			unit_amt_rate_diff(value);
			return;
		}
		if ($unit_profit.equalsIgnoreCase(name)) {
			unit_profit(value);
			return;
		}
		if ($unit_std_profit.equalsIgnoreCase(name)) {
			unit_std_profit(value);
			return;
		}
		if ($profit_rate.equalsIgnoreCase(name)) {
			profit_rate(value);
			return;
		}
		if ($std_profit_rate.equalsIgnoreCase(name)) {
			std_profit_rate(value);
			return;
		}
		if ($sls_profit.equalsIgnoreCase(name)) {
			sls_profit(value);
			return;
		}
		if ($std_sls_profit.equalsIgnoreCase(name)) {
			std_sls_profit(value);
			return;
		}
		if ($unit_sls_profit.equalsIgnoreCase(name)) {
			unit_sls_profit(value);
			return;
		}
		if ($unit_std_sls_profit.equalsIgnoreCase(name)) {
			unit_std_sls_profit(value);
			return;
		}
		if ($sls_profit_rate.equalsIgnoreCase(name)) {
			sls_profit_rate(value);
			return;
		}
		if ($std_sls_profit_rate.equalsIgnoreCase(name)) {
			std_sls_profit_rate(value);
			return;
		}
		if ($limit_profit.equalsIgnoreCase(name)) {
			limit_profit(value);
			return;
		}
		if ($unit_limit_profit.equalsIgnoreCase(name)) {
			unit_limit_profit(value);
			return;
		}
		if ($limit_profit_rate.equalsIgnoreCase(name)) {
			limit_profit_rate(value);
			return;
		}
		if ($var.equalsIgnoreCase(name)) {
			var(value);
			return;
		}
		if ($fxd.equalsIgnoreCase(name)) {
			fxd(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($unit_var.equalsIgnoreCase(name)) {
			unit_var(value);
			return;
		}
		if ($unit_fxd.equalsIgnoreCase(name)) {
			unit_fxd(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($unit_std_cost.equalsIgnoreCase(name)) {
			unit_std_cost(value);
			return;
		}
		if ($unit_std_sls_cost.equalsIgnoreCase(name)) {
			unit_std_sls_cost(value);
			return;
		}
		if ($unit_std_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_std_sls_mng_cost(value);
			return;
		}
		if ($unit_ttl.equalsIgnoreCase(name)) {
			unit_ttl(value);
			return;
		}
		if ($unit_sls_cost.equalsIgnoreCase(name)) {
			unit_sls_cost(value);
			return;
		}
		if ($unit_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_sls_mng_cost(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cur_std_amt.equalsIgnoreCase(name)) {
			cur_std_amt(value);
			return;
		}
		if ($cur_amt_diff.equalsIgnoreCase(name)) {
			cur_amt_diff(value);
			return;
		}
		if ($unit_trd_cur_amt.equalsIgnoreCase(name)) {
			unit_trd_cur_amt(value);
			return;
		}
		if ($unit_cur_std_amt.equalsIgnoreCase(name)) {
			unit_cur_std_amt(value);
			return;
		}
		if ($unit_cur_amt_diff.equalsIgnoreCase(name)) {
			unit_cur_amt_diff(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($std_xrate.equalsIgnoreCase(name)) {
			std_xrate(value);
			return;
		}
		if ($xrate_diff.equalsIgnoreCase(name)) {
			xrate_diff(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($std_amt.equalsIgnoreCase(name)) {
			std_amt(value);
			return;
		}
		if ($amt_diff.equalsIgnoreCase(name)) {
			amt_diff(value);
			return;
		}
		if ($amt_upri_diff.equalsIgnoreCase(name)) {
			amt_upri_diff(value);
			return;
		}
		if ($amt_rate_diff.equalsIgnoreCase(name)) {
			amt_rate_diff(value);
			return;
		}
		if ($profit.equalsIgnoreCase(name)) {
			profit(value);
			return;
		}
		if ($std_profit.equalsIgnoreCase(name)) {
			std_profit(value);
			return;
		}
		if ($unit_amt.equalsIgnoreCase(name)) {
			unit_amt(value);
			return;
		}
		if ($unit_std_amt.equalsIgnoreCase(name)) {
			unit_std_amt(value);
			return;
		}
		if ($unit_amt_diff.equalsIgnoreCase(name)) {
			unit_amt_diff(value);
			return;
		}
		if ($unit_amt_upri_diff.equalsIgnoreCase(name)) {
			unit_amt_upri_diff(value);
			return;
		}
		if ($unit_amt_rate_diff.equalsIgnoreCase(name)) {
			unit_amt_rate_diff(value);
			return;
		}
		if ($unit_profit.equalsIgnoreCase(name)) {
			unit_profit(value);
			return;
		}
		if ($unit_std_profit.equalsIgnoreCase(name)) {
			unit_std_profit(value);
			return;
		}
		if ($profit_rate.equalsIgnoreCase(name)) {
			profit_rate(value);
			return;
		}
		if ($std_profit_rate.equalsIgnoreCase(name)) {
			std_profit_rate(value);
			return;
		}
		if ($sls_profit.equalsIgnoreCase(name)) {
			sls_profit(value);
			return;
		}
		if ($std_sls_profit.equalsIgnoreCase(name)) {
			std_sls_profit(value);
			return;
		}
		if ($unit_sls_profit.equalsIgnoreCase(name)) {
			unit_sls_profit(value);
			return;
		}
		if ($unit_std_sls_profit.equalsIgnoreCase(name)) {
			unit_std_sls_profit(value);
			return;
		}
		if ($sls_profit_rate.equalsIgnoreCase(name)) {
			sls_profit_rate(value);
			return;
		}
		if ($std_sls_profit_rate.equalsIgnoreCase(name)) {
			std_sls_profit_rate(value);
			return;
		}
		if ($limit_profit.equalsIgnoreCase(name)) {
			limit_profit(value);
			return;
		}
		if ($unit_limit_profit.equalsIgnoreCase(name)) {
			unit_limit_profit(value);
			return;
		}
		if ($limit_profit_rate.equalsIgnoreCase(name)) {
			limit_profit_rate(value);
			return;
		}
		if ($var.equalsIgnoreCase(name)) {
			var(value);
			return;
		}
		if ($fxd.equalsIgnoreCase(name)) {
			fxd(value);
			return;
		}
		if ($diff.equalsIgnoreCase(name)) {
			diff(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_sls_cost.equalsIgnoreCase(name)) {
			std_sls_cost(value);
			return;
		}
		if ($std_sls_mng_cost.equalsIgnoreCase(name)) {
			std_sls_mng_cost(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($sls_cost.equalsIgnoreCase(name)) {
			sls_cost(value);
			return;
		}
		if ($sls_mng_cost.equalsIgnoreCase(name)) {
			sls_mng_cost(value);
			return;
		}
		if ($unit_var.equalsIgnoreCase(name)) {
			unit_var(value);
			return;
		}
		if ($unit_fxd.equalsIgnoreCase(name)) {
			unit_fxd(value);
			return;
		}
		if ($unit_diff.equalsIgnoreCase(name)) {
			unit_diff(value);
			return;
		}
		if ($unit_std_cost.equalsIgnoreCase(name)) {
			unit_std_cost(value);
			return;
		}
		if ($unit_std_sls_cost.equalsIgnoreCase(name)) {
			unit_std_sls_cost(value);
			return;
		}
		if ($unit_std_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_std_sls_mng_cost(value);
			return;
		}
		if ($unit_ttl.equalsIgnoreCase(name)) {
			unit_ttl(value);
			return;
		}
		if ($unit_sls_cost.equalsIgnoreCase(name)) {
			unit_sls_cost(value);
			return;
		}
		if ($unit_sls_mng_cost.equalsIgnoreCase(name)) {
			unit_sls_mng_cost(value);
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



}

