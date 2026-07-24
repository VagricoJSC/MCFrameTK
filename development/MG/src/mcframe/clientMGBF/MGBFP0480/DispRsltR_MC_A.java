package mcframe.clientMGBF.MGBFP0480;

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
 * ブロック"DispRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DispRsltR_MC_A extends MCConstRow {

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
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
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
	public static final String $itm_p = "itm_p";
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
	 * Key index キーインデックス.<p>
	 *
	 */
	public static final String $key_idx = "key_idx";
	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public static final String $elm_no = "elm_no";
	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public static final String $elm = "elm";
	/**
	 * Column 項目.<p>
	 *
	 */
	public static final String $elm_nm = "elm_nm";
	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public static final String $col_00 = "col_00";
	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public static final String $col_01 = "col_01";
	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public static final String $col_02 = "col_02";
	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public static final String $col_03 = "col_03";
	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public static final String $col_04 = "col_04";
	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public static final String $col_05 = "col_05";
	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public static final String $col_06 = "col_06";
	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public static final String $col_07 = "col_07";
	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public static final String $col_08 = "col_08";
	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public static final String $col_09 = "col_09";
	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public static final String $col_10 = "col_10";
	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public static final String $col_11 = "col_11";
	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public static final String $col_12 = "col_12";
	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public static final String $col_13 = "col_13";
	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public static final String $col_14 = "col_14";
	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public static final String $col_15 = "col_15";
	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public static final String $col_16 = "col_16";
	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public static final String $col_17 = "col_17";
	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public static final String $col_18 = "col_18";
	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public static final String $col_19 = "col_19";
	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public static final String $col_20 = "col_20";
	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public static final String $col_21 = "col_21";
	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public static final String $col_22 = "col_22";
	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public static final String $col_23 = "col_23";
	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public static final String $col_24 = "col_24";
	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public static final String $col_25 = "col_25";
	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public static final String $col_26 = "col_26";
	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public static final String $col_27 = "col_27";
	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public static final String $col_28 = "col_28";
	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public static final String $col_29 = "col_29";
	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public static final String $col_30 = "col_30";
	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public static final String $col_31 = "col_31";
	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public static final String $col_32 = "col_32";
	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public static final String $col_33 = "col_33";
	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public static final String $col_34 = "col_34";
	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public static final String $col_35 = "col_35";
	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public static final String $col_36 = "col_36";
	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public static final String $col_37 = "col_37";
	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public static final String $col_38 = "col_38";
	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public static final String $col_39 = "col_39";
	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public static final String $col_40 = "col_40";
	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public static final String $col_41 = "col_41";
	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public static final String $col_42 = "col_42";
	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public static final String $col_43 = "col_43";
	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public static final String $col_44 = "col_44";
	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public static final String $col_45 = "col_45";
	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public static final String $col_46 = "col_46";
	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public static final String $col_47 = "col_47";
	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public static final String $col_48 = "col_48";
	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public static final String $col_49 = "col_49";
	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public static final String $col_50 = "col_50";
	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public static final String $col_51 = "col_51";
	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public static final String $col_52 = "col_52";
	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public static final String $col_53 = "col_53";
	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public static final String $col_54 = "col_54";
	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public static final String $col_55 = "col_55";
	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public static final String $col_56 = "col_56";
	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public static final String $col_57 = "col_57";
	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public static final String $col_58 = "col_58";
	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public static final String $col_59 = "col_59";
	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public static final String $col_60 = "col_60";
	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public static final String $col_61 = "col_61";
	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public static final String $col_62 = "col_62";
	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public static final String $col_63 = "col_63";
	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public static final String $col_64 = "col_64";
	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public static final String $col_65 = "col_65";
	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public static final String $col_66 = "col_66";
	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public static final String $col_67 = "col_67";
	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public static final String $col_68 = "col_68";
	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public static final String $col_69 = "col_69";
	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public static final String $col_70 = "col_70";
	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public static final String $col_71 = "col_71";
	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public static final String $col_72 = "col_72";
	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public static final String $col_73 = "col_73";
	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public static final String $col_74 = "col_74";
	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public static final String $col_75 = "col_75";
	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public static final String $col_76 = "col_76";
	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public static final String $col_77 = "col_77";
	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public static final String $col_78 = "col_78";
	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public static final String $col_79 = "col_79";
	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public static final String $col_80 = "col_80";
	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public static final String $col_81 = "col_81";
	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public static final String $col_82 = "col_82";
	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public static final String $col_83 = "col_83";
	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public static final String $col_84 = "col_84";
	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public static final String $col_85 = "col_85";
	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public static final String $col_86 = "col_86";
	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public static final String $col_87 = "col_87";
	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public static final String $col_88 = "col_88";
	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public static final String $col_89 = "col_89";
	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public static final String $col_90 = "col_90";
	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public static final String $col_91 = "col_91";
	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public static final String $col_92 = "col_92";
	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public static final String $col_93 = "col_93";
	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public static final String $col_94 = "col_94";
	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public static final String $col_95 = "col_95";
	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public static final String $col_96 = "col_96";
	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public static final String $col_97 = "col_97";
	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public static final String $col_98 = "col_98";
	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public static final String $col_99 = "col_99";
	/**
	 * Total 合計.<p>
	 *
	 */
	public static final String $ttl = "ttl";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
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
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta key_idx_META = createNumberMeta($key_idx);
	public static final MCMeta elm_no_META = createNumberMeta($elm_no);
	public static final MCMeta elm_META = createStringMeta($elm);
	public static final MCMeta elm_nm_META = createStringMeta($elm_nm);
	public static final MCMeta col_00_META = createCommonMeta($col_00, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_01_META = createCommonMeta($col_01, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_02_META = createCommonMeta($col_02, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_03_META = createCommonMeta($col_03, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_04_META = createCommonMeta($col_04, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_05_META = createCommonMeta($col_05, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_06_META = createCommonMeta($col_06, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_07_META = createCommonMeta($col_07, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_08_META = createCommonMeta($col_08, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_09_META = createCommonMeta($col_09, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_10_META = createCommonMeta($col_10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_11_META = createCommonMeta($col_11, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_12_META = createCommonMeta($col_12, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_13_META = createCommonMeta($col_13, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_14_META = createCommonMeta($col_14, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_15_META = createCommonMeta($col_15, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_16_META = createCommonMeta($col_16, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_17_META = createCommonMeta($col_17, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_18_META = createCommonMeta($col_18, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_19_META = createCommonMeta($col_19, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_20_META = createCommonMeta($col_20, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_21_META = createCommonMeta($col_21, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_22_META = createCommonMeta($col_22, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_23_META = createCommonMeta($col_23, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_24_META = createCommonMeta($col_24, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_25_META = createCommonMeta($col_25, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_26_META = createCommonMeta($col_26, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_27_META = createCommonMeta($col_27, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_28_META = createCommonMeta($col_28, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_29_META = createCommonMeta($col_29, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_30_META = createCommonMeta($col_30, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_31_META = createCommonMeta($col_31, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_32_META = createCommonMeta($col_32, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_33_META = createCommonMeta($col_33, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_34_META = createCommonMeta($col_34, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_35_META = createCommonMeta($col_35, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_36_META = createCommonMeta($col_36, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_37_META = createCommonMeta($col_37, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_38_META = createCommonMeta($col_38, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_39_META = createCommonMeta($col_39, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_40_META = createCommonMeta($col_40, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_41_META = createCommonMeta($col_41, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_42_META = createCommonMeta($col_42, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_43_META = createCommonMeta($col_43, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_44_META = createCommonMeta($col_44, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_45_META = createCommonMeta($col_45, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_46_META = createCommonMeta($col_46, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_47_META = createCommonMeta($col_47, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_48_META = createCommonMeta($col_48, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_49_META = createCommonMeta($col_49, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_50_META = createCommonMeta($col_50, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_51_META = createCommonMeta($col_51, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_52_META = createCommonMeta($col_52, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_53_META = createCommonMeta($col_53, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_54_META = createCommonMeta($col_54, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_55_META = createCommonMeta($col_55, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_56_META = createCommonMeta($col_56, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_57_META = createCommonMeta($col_57, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_58_META = createCommonMeta($col_58, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_59_META = createCommonMeta($col_59, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_60_META = createCommonMeta($col_60, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_61_META = createCommonMeta($col_61, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_62_META = createCommonMeta($col_62, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_63_META = createCommonMeta($col_63, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_64_META = createCommonMeta($col_64, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_65_META = createCommonMeta($col_65, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_66_META = createCommonMeta($col_66, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_67_META = createCommonMeta($col_67, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_68_META = createCommonMeta($col_68, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_69_META = createCommonMeta($col_69, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_70_META = createCommonMeta($col_70, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_71_META = createCommonMeta($col_71, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_72_META = createCommonMeta($col_72, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_73_META = createCommonMeta($col_73, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_74_META = createCommonMeta($col_74, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_75_META = createCommonMeta($col_75, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_76_META = createCommonMeta($col_76, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_77_META = createCommonMeta($col_77, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_78_META = createCommonMeta($col_78, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_79_META = createCommonMeta($col_79, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_80_META = createCommonMeta($col_80, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_81_META = createCommonMeta($col_81, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_82_META = createCommonMeta($col_82, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_83_META = createCommonMeta($col_83, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_84_META = createCommonMeta($col_84, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_85_META = createCommonMeta($col_85, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_86_META = createCommonMeta($col_86, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_87_META = createCommonMeta($col_87, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_88_META = createCommonMeta($col_88, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_89_META = createCommonMeta($col_89, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_90_META = createCommonMeta($col_90, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_91_META = createCommonMeta($col_91, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_92_META = createCommonMeta($col_92, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_93_META = createCommonMeta($col_93, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_94_META = createCommonMeta($col_94, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_95_META = createCommonMeta($col_95, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_96_META = createCommonMeta($col_96, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_97_META = createCommonMeta($col_97, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_98_META = createCommonMeta($col_98, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_99_META = createCommonMeta($col_99, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<DispRsltR> constMetas = new ConstMetaList<DispRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_grp_nm_META,
			wg_cd_META,
			wg_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_p_META,
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
			asst_typ_META,
			asst_typ_nm_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			key_idx_META,
			elm_no_META,
			elm_META,
			elm_nm_META,
			col_00_META,
			col_01_META,
			col_02_META,
			col_03_META,
			col_04_META,
			col_05_META,
			col_06_META,
			col_07_META,
			col_08_META,
			col_09_META,
			col_10_META,
			col_11_META,
			col_12_META,
			col_13_META,
			col_14_META,
			col_15_META,
			col_16_META,
			col_17_META,
			col_18_META,
			col_19_META,
			col_20_META,
			col_21_META,
			col_22_META,
			col_23_META,
			col_24_META,
			col_25_META,
			col_26_META,
			col_27_META,
			col_28_META,
			col_29_META,
			col_30_META,
			col_31_META,
			col_32_META,
			col_33_META,
			col_34_META,
			col_35_META,
			col_36_META,
			col_37_META,
			col_38_META,
			col_39_META,
			col_40_META,
			col_41_META,
			col_42_META,
			col_43_META,
			col_44_META,
			col_45_META,
			col_46_META,
			col_47_META,
			col_48_META,
			col_49_META,
			col_50_META,
			col_51_META,
			col_52_META,
			col_53_META,
			col_54_META,
			col_55_META,
			col_56_META,
			col_57_META,
			col_58_META,
			col_59_META,
			col_60_META,
			col_61_META,
			col_62_META,
			col_63_META,
			col_64_META,
			col_65_META,
			col_66_META,
			col_67_META,
			col_68_META,
			col_69_META,
			col_70_META,
			col_71_META,
			col_72_META,
			col_73_META,
			col_74_META,
			col_75_META,
			col_76_META,
			col_77_META,
			col_78_META,
			col_79_META,
			col_80_META,
			col_81_META,
			col_82_META,
			col_83_META,
			col_84_META,
			col_85_META,
			col_86_META,
			col_87_META,
			col_88_META,
			col_89_META,
			col_90_META,
			col_91_META,
			col_92_META,
			col_93_META,
			col_94_META,
			col_95_META,
			col_96_META,
			col_97_META,
			col_98_META,
			col_99_META,
			ttl_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
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

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CLEAR]のキー定数 */
	public static final String $$CLEAR = "CLEAR";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";
	/** 項目属性情報のグループ[FORMAT]のキー定数 */
	public static final String $$FORMAT = "FORMAT";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$sno1, "SNO1"},	// sno1
				{$sno2, "SNO2"},	// sno2
				{$sno3, "SNO3"},	// sno3
				{$sno4, "SNO4"},	// sno4
				{$dest_cd1, "DEST1"},	// dest_cd1
				{$dest_nm1, "DEST1"},	// dest_nm1
				{$dest_cd2, "DEST2"},	// dest_cd2
				{$dest_nm2, "DEST2"},	// dest_nm2
				{$dest_cd3, "DEST3"},	// dest_cd3
				{$dest_nm3, "DEST3"}	// dest_nm3
			}
		)),
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
		new MCExtMap.Entry($$CLEAR, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "Key"},	// calc_grp_cd
				{$calc_grp_nm, "Key"},	// calc_grp_nm
				{$wg_cd, "Key"},	// wg_cd
				{$wg_nm, "Key"},	// wg_nm
				{$mng_dpt_cd, "Key"},	// mng_dpt_cd
				{$mng_dpt_nm, "Key"},	// mng_dpt_nm
				{$itm_p, "Key"},	// itm_p
				{$itm_typ, "Key"},	// itm_typ
				{$itm_typ_nm, "Key"},	// itm_typ_nm
				{$itm_typ_d_cd, "Key"},	// itm_typ_d_cd
				{$itm_typ_d_nm, "Key"},	// itm_typ_d_nm
				{$itm_jnl_cd, "Key"},	// itm_jnl_cd
				{$itm_jnl_nm, "Key"},	// itm_jnl_nm
				{$itm_grp_cd1, "Key"},	// itm_grp_cd1
				{$itm_grp_nm1, "Key"},	// itm_grp_nm1
				{$itm_grp_cd2, "Key"},	// itm_grp_cd2
				{$itm_grp_nm2, "Key"},	// itm_grp_nm2
				{$itm_grp_cd3, "Key"},	// itm_grp_cd3
				{$itm_grp_nm3, "Key"},	// itm_grp_nm3
				{$itm_grp_cd4, "Key"},	// itm_grp_cd4
				{$itm_grp_nm4, "Key"},	// itm_grp_nm4
				{$itm_grp_cd5, "Key"},	// itm_grp_cd5
				{$itm_grp_nm5, "Key"},	// itm_grp_nm5
				{$itm_grp_cd6, "Key"},	// itm_grp_cd6
				{$itm_grp_nm6, "Key"},	// itm_grp_nm6
				{$itm_grp_cd7, "Key"},	// itm_grp_cd7
				{$itm_grp_nm7, "Key"},	// itm_grp_nm7
				{$itm_grp_cd8, "Key"},	// itm_grp_cd8
				{$itm_grp_nm8, "Key"},	// itm_grp_nm8
				{$itm_grp_cd9, "Key"},	// itm_grp_cd9
				{$itm_grp_nm9, "Key"},	// itm_grp_nm9
				{$itm_grp_cd10, "Key"},	// itm_grp_cd10
				{$itm_grp_nm10, "Key"},	// itm_grp_nm10
				{$lot_no, "Key"},	// lot_no
				{$sublot_no, "Key"},	// sublot_no
				{$sno1, "Key"},	// sno1
				{$sno2, "Key"},	// sno2
				{$sno3, "Key"},	// sno3
				{$sno4, "Key"},	// sno4
				{$ac_slip_typ, "Key"},	// ac_slip_typ
				{$ac_slip_typ_nm, "Key"},	// ac_slip_typ_nm
				{$ac_rsn_cd, "Key"},	// ac_rsn_cd
				{$ac_rsn_nm, "Key"},	// ac_rsn_nm
				{$cst_cd, "Key"},	// cst_cd
				{$cst_nm, "Key"},	// cst_nm
				{$cst_grp_cd1, "Key"},	// cst_grp_cd1
				{$cst_grp_nm1, "Key"},	// cst_grp_nm1
				{$cst_grp_cd2, "Key"},	// cst_grp_cd2
				{$cst_grp_nm2, "Key"},	// cst_grp_nm2
				{$cst_grp_cd3, "Key"},	// cst_grp_cd3
				{$cst_grp_nm3, "Key"},	// cst_grp_nm3
				{$cst_grp_cd4, "Key"},	// cst_grp_cd4
				{$cst_grp_nm4, "Key"},	// cst_grp_nm4
				{$cst_grp_cd5, "Key"},	// cst_grp_cd5
				{$cst_grp_nm5, "Key"},	// cst_grp_nm5
				{$cst_grp_cd6, "Key"},	// cst_grp_cd6
				{$cst_grp_nm6, "Key"},	// cst_grp_nm6
				{$cst_grp_cd7, "Key"},	// cst_grp_cd7
				{$cst_grp_nm7, "Key"},	// cst_grp_nm7
				{$cst_grp_cd8, "Key"},	// cst_grp_cd8
				{$cst_grp_nm8, "Key"},	// cst_grp_nm8
				{$cst_grp_cd9, "Key"},	// cst_grp_cd9
				{$cst_grp_nm9, "Key"},	// cst_grp_nm9
				{$cst_grp_cd10, "Key"},	// cst_grp_cd10
				{$cst_grp_nm10, "Key"},	// cst_grp_nm10
				{$cst_cntry_cd, "Key"},	// cst_cntry_cd
				{$cst_cntry_nm, "Key"},	// cst_cntry_nm
				{$cst_area_cd, "Key"},	// cst_area_cd
				{$cst_area_nm, "Key"},	// cst_area_nm
				{$dlv_cd, "Key"},	// dlv_cd
				{$dlv_nm, "Key"},	// dlv_nm
				{$dlv_grp_cd1, "Key"},	// dlv_grp_cd1
				{$dlv_grp_nm1, "Key"},	// dlv_grp_nm1
				{$dlv_grp_cd2, "Key"},	// dlv_grp_cd2
				{$dlv_grp_nm2, "Key"},	// dlv_grp_nm2
				{$dlv_grp_cd3, "Key"},	// dlv_grp_cd3
				{$dlv_grp_nm3, "Key"},	// dlv_grp_nm3
				{$dlv_grp_cd4, "Key"},	// dlv_grp_cd4
				{$dlv_grp_nm4, "Key"},	// dlv_grp_nm4
				{$dlv_grp_cd5, "Key"},	// dlv_grp_cd5
				{$dlv_grp_nm5, "Key"},	// dlv_grp_nm5
				{$dlv_grp_cd6, "Key"},	// dlv_grp_cd6
				{$dlv_grp_nm6, "Key"},	// dlv_grp_nm6
				{$dlv_grp_cd7, "Key"},	// dlv_grp_cd7
				{$dlv_grp_nm7, "Key"},	// dlv_grp_nm7
				{$dlv_grp_cd8, "Key"},	// dlv_grp_cd8
				{$dlv_grp_nm8, "Key"},	// dlv_grp_nm8
				{$dlv_grp_cd9, "Key"},	// dlv_grp_cd9
				{$dlv_grp_nm9, "Key"},	// dlv_grp_nm9
				{$dlv_grp_cd10, "Key"},	// dlv_grp_cd10
				{$dlv_grp_nm10, "Key"},	// dlv_grp_nm10
				{$dlv_cntry_cd, "Key"},	// dlv_cntry_cd
				{$dlv_cntry_nm, "Key"},	// dlv_cntry_nm
				{$dlv_area_cd, "Key"},	// dlv_area_cd
				{$dlv_area_nm, "Key"},	// dlv_area_nm
				{$sls_dpt_cd, "Key"},	// sls_dpt_cd
				{$sls_dpt_nm, "Key"},	// sls_dpt_nm
				{$sls_usr_cd, "Key"},	// sls_usr_cd
				{$sls_usr_nm, "Key"},	// sls_usr_nm
				{$stk_bp_cd, "Key"},	// stk_bp_cd
				{$stk_bp_nm, "Key"},	// stk_bp_nm
				{$alc_dpt_cd, "Key"},	// alc_dpt_cd
				{$alc_dpt_nm, "Key"},	// alc_dpt_nm
				{$dest_cd1, "Key"},	// dest_cd1
				{$dest_nm1, "Key"},	// dest_nm1
				{$dest_cd2, "Key"},	// dest_cd2
				{$dest_nm2, "Key"},	// dest_nm2
				{$dest_cd3, "Key"},	// dest_cd3
				{$dest_nm3, "Key"},	// dest_nm3
				{$cost_sls_cd1, "Key"},	// cost_sls_cd1
				{$cost_sls_nm1, "Key"},	// cost_sls_nm1
				{$cost_sls_cd2, "Key"},	// cost_sls_cd2
				{$cost_sls_nm2, "Key"},	// cost_sls_nm2
				{$cost_sls_cd3, "Key"},	// cost_sls_cd3
				{$cost_sls_nm3, "Key"},	// cost_sls_nm3
				{$cost_sls_cd4, "Key"},	// cost_sls_cd4
				{$cost_sls_nm4, "Key"},	// cost_sls_nm4
				{$cost_sls_cd5, "Key"},	// cost_sls_cd5
				{$cost_sls_nm5, "Key"},	// cost_sls_nm5
				{$asst_typ, "Key"},	// asst_typ
				{$asst_typ_nm, "Key"},	// asst_typ_nm
				{$unit_cd, "Key"},	// unit_cd
				{$unit_nm, "Key"}	// unit_nm
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "calc_grp_flg"},	// calc_grp_cd
				{$calc_grp_nm, "calc_grp_flg"},	// calc_grp_nm
				{$wg_cd, "wg_flg"},	// wg_cd
				{$wg_nm, "wg_flg"},	// wg_nm
				{$mng_dpt_cd, "mng_dpt_flg"},	// mng_dpt_cd
				{$mng_dpt_nm, "mng_dpt_flg"},	// mng_dpt_nm
				{$itm_p, "itm_flg"},	// itm_p
				{$itm_typ, "itm_typ_flg"},	// itm_typ
				{$itm_typ_nm, "itm_typ_flg"},	// itm_typ_nm
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
				{$ac_slip_typ_nm, "ac_slip_typ_flg"},	// ac_slip_typ_nm
				{$ac_rsn_cd, "ac_rsn_flg"},	// ac_rsn_cd
				{$ac_rsn_nm, "ac_rsn_flg"},	// ac_rsn_nm
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
				{$cost_sls_cd1, "cost_sls_flg1"},	// cost_sls_cd1
				{$cost_sls_nm1, "cost_sls_flg1"},	// cost_sls_nm1
				{$cost_sls_cd2, "cost_sls_flg2"},	// cost_sls_cd2
				{$cost_sls_nm2, "cost_sls_flg2"},	// cost_sls_nm2
				{$cost_sls_cd3, "cost_sls_flg3"},	// cost_sls_cd3
				{$cost_sls_nm3, "cost_sls_flg3"},	// cost_sls_nm3
				{$cost_sls_cd4, "cost_sls_flg4"},	// cost_sls_cd4
				{$cost_sls_nm4, "cost_sls_flg4"},	// cost_sls_nm4
				{$cost_sls_cd5, "cost_sls_flg5"},	// cost_sls_cd5
				{$cost_sls_nm5, "cost_sls_flg5"},	// cost_sls_nm5
				{$asst_typ, "asst_flg"},	// asst_typ
				{$asst_typ_nm, "asst_flg"},	// asst_typ_nm
				{$unit_cd, "qty_flg"},	// unit_cd
				{$unit_nm, "qty_flg"}	// unit_nm
			}
		)),
		new MCExtMap.Entry($$HKEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
				{$col_00, "Key"},	// col_00
				{$col_01, "Key"},	// col_01
				{$col_02, "Key"},	// col_02
				{$col_03, "Key"},	// col_03
				{$col_04, "Key"},	// col_04
				{$col_05, "Key"},	// col_05
				{$col_06, "Key"},	// col_06
				{$col_07, "Key"},	// col_07
				{$col_08, "Key"},	// col_08
				{$col_09, "Key"},	// col_09
				{$col_10, "Key"},	// col_10
				{$col_11, "Key"},	// col_11
				{$col_12, "Key"},	// col_12
				{$col_13, "Key"},	// col_13
				{$col_14, "Key"},	// col_14
				{$col_15, "Key"},	// col_15
				{$col_16, "Key"},	// col_16
				{$col_17, "Key"},	// col_17
				{$col_18, "Key"},	// col_18
				{$col_19, "Key"},	// col_19
				{$col_20, "Key"},	// col_20
				{$col_21, "Key"},	// col_21
				{$col_22, "Key"},	// col_22
				{$col_23, "Key"},	// col_23
				{$col_24, "Key"},	// col_24
				{$col_25, "Key"},	// col_25
				{$col_26, "Key"},	// col_26
				{$col_27, "Key"},	// col_27
				{$col_28, "Key"},	// col_28
				{$col_29, "Key"},	// col_29
				{$col_30, "Key"},	// col_30
				{$col_31, "Key"},	// col_31
				{$col_32, "Key"},	// col_32
				{$col_33, "Key"},	// col_33
				{$col_34, "Key"},	// col_34
				{$col_35, "Key"},	// col_35
				{$col_36, "Key"},	// col_36
				{$col_37, "Key"},	// col_37
				{$col_38, "Key"},	// col_38
				{$col_39, "Key"},	// col_39
				{$col_40, "Key"},	// col_40
				{$col_41, "Key"},	// col_41
				{$col_42, "Key"},	// col_42
				{$col_43, "Key"},	// col_43
				{$col_44, "Key"},	// col_44
				{$col_45, "Key"},	// col_45
				{$col_46, "Key"},	// col_46
				{$col_47, "Key"},	// col_47
				{$col_48, "Key"},	// col_48
				{$col_49, "Key"},	// col_49
				{$col_50, "Key"},	// col_50
				{$col_51, "Key"},	// col_51
				{$col_52, "Key"},	// col_52
				{$col_53, "Key"},	// col_53
				{$col_54, "Key"},	// col_54
				{$col_55, "Key"},	// col_55
				{$col_56, "Key"},	// col_56
				{$col_57, "Key"},	// col_57
				{$col_58, "Key"},	// col_58
				{$col_59, "Key"},	// col_59
				{$col_60, "Key"},	// col_60
				{$col_61, "Key"},	// col_61
				{$col_62, "Key"},	// col_62
				{$col_63, "Key"},	// col_63
				{$col_64, "Key"},	// col_64
				{$col_65, "Key"},	// col_65
				{$col_66, "Key"},	// col_66
				{$col_67, "Key"},	// col_67
				{$col_68, "Key"},	// col_68
				{$col_69, "Key"},	// col_69
				{$col_70, "Key"},	// col_70
				{$col_71, "Key"},	// col_71
				{$col_72, "Key"},	// col_72
				{$col_73, "Key"},	// col_73
				{$col_74, "Key"},	// col_74
				{$col_75, "Key"},	// col_75
				{$col_76, "Key"},	// col_76
				{$col_77, "Key"},	// col_77
				{$col_78, "Key"},	// col_78
				{$col_79, "Key"},	// col_79
				{$col_80, "Key"},	// col_80
				{$col_81, "Key"},	// col_81
				{$col_82, "Key"},	// col_82
				{$col_83, "Key"},	// col_83
				{$col_84, "Key"},	// col_84
				{$col_85, "Key"},	// col_85
				{$col_86, "Key"},	// col_86
				{$col_87, "Key"},	// col_87
				{$col_88, "Key"},	// col_88
				{$col_89, "Key"},	// col_89
				{$col_90, "Key"},	// col_90
				{$col_91, "Key"},	// col_91
				{$col_92, "Key"},	// col_92
				{$col_93, "Key"},	// col_93
				{$col_94, "Key"},	// col_94
				{$col_95, "Key"},	// col_95
				{$col_96, "Key"},	// col_96
				{$col_97, "Key"},	// col_97
				{$col_98, "Key"},	// col_98
				{$col_99, "Key"}	// col_99
			}
		)),
		new MCExtMap.Entry($$FORMAT, new MCExtList(
			new String[][]{
				{$col_00, "PERCENT"},	// col_00
				{$col_01, "PERCENT"},	// col_01
				{$col_02, "PERCENT"},	// col_02
				{$col_03, "PERCENT"},	// col_03
				{$col_04, "PERCENT"},	// col_04
				{$col_05, "PERCENT"},	// col_05
				{$col_06, "PERCENT"},	// col_06
				{$col_07, "PERCENT"},	// col_07
				{$col_08, "PERCENT"},	// col_08
				{$col_09, "PERCENT"},	// col_09
				{$col_10, "PERCENT"},	// col_10
				{$col_11, "PERCENT"},	// col_11
				{$col_12, "PERCENT"},	// col_12
				{$col_13, "PERCENT"},	// col_13
				{$col_14, "PERCENT"},	// col_14
				{$col_15, "PERCENT"},	// col_15
				{$col_16, "PERCENT"},	// col_16
				{$col_17, "PERCENT"},	// col_17
				{$col_18, "PERCENT"},	// col_18
				{$col_19, "PERCENT"},	// col_19
				{$col_20, "PERCENT"},	// col_20
				{$col_21, "PERCENT"},	// col_21
				{$col_22, "PERCENT"},	// col_22
				{$col_23, "PERCENT"},	// col_23
				{$col_24, "PERCENT"},	// col_24
				{$col_25, "PERCENT"},	// col_25
				{$col_26, "PERCENT"},	// col_26
				{$col_27, "PERCENT"},	// col_27
				{$col_28, "PERCENT"},	// col_28
				{$col_29, "PERCENT"},	// col_29
				{$col_30, "PERCENT"},	// col_30
				{$col_31, "PERCENT"},	// col_31
				{$col_32, "PERCENT"},	// col_32
				{$col_33, "PERCENT"},	// col_33
				{$col_34, "PERCENT"},	// col_34
				{$col_35, "PERCENT"},	// col_35
				{$col_36, "PERCENT"},	// col_36
				{$col_37, "PERCENT"},	// col_37
				{$col_38, "PERCENT"},	// col_38
				{$col_39, "PERCENT"},	// col_39
				{$col_40, "PERCENT"},	// col_40
				{$col_41, "PERCENT"},	// col_41
				{$col_42, "PERCENT"},	// col_42
				{$col_43, "PERCENT"},	// col_43
				{$col_44, "PERCENT"},	// col_44
				{$col_45, "PERCENT"},	// col_45
				{$col_46, "PERCENT"},	// col_46
				{$col_47, "PERCENT"},	// col_47
				{$col_48, "PERCENT"},	// col_48
				{$col_49, "PERCENT"},	// col_49
				{$col_50, "PERCENT"},	// col_50
				{$col_51, "PERCENT"},	// col_51
				{$col_52, "PERCENT"},	// col_52
				{$col_53, "PERCENT"},	// col_53
				{$col_54, "PERCENT"},	// col_54
				{$col_55, "PERCENT"},	// col_55
				{$col_56, "PERCENT"},	// col_56
				{$col_57, "PERCENT"},	// col_57
				{$col_58, "PERCENT"},	// col_58
				{$col_59, "PERCENT"},	// col_59
				{$col_60, "PERCENT"},	// col_60
				{$col_61, "PERCENT"},	// col_61
				{$col_62, "PERCENT"},	// col_62
				{$col_63, "PERCENT"},	// col_63
				{$col_64, "PERCENT"},	// col_64
				{$col_65, "PERCENT"},	// col_65
				{$col_66, "PERCENT"},	// col_66
				{$col_67, "PERCENT"},	// col_67
				{$col_68, "PERCENT"},	// col_68
				{$col_69, "PERCENT"},	// col_69
				{$col_70, "PERCENT"},	// col_70
				{$col_71, "PERCENT"},	// col_71
				{$col_72, "PERCENT"},	// col_72
				{$col_73, "PERCENT"},	// col_73
				{$col_74, "PERCENT"},	// col_74
				{$col_75, "PERCENT"},	// col_75
				{$col_76, "PERCENT"},	// col_76
				{$col_77, "PERCENT"},	// col_77
				{$col_78, "PERCENT"},	// col_78
				{$col_79, "PERCENT"},	// col_79
				{$col_80, "PERCENT"},	// col_80
				{$col_81, "PERCENT"},	// col_81
				{$col_82, "PERCENT"},	// col_82
				{$col_83, "PERCENT"},	// col_83
				{$col_84, "PERCENT"},	// col_84
				{$col_85, "PERCENT"},	// col_85
				{$col_86, "PERCENT"},	// col_86
				{$col_87, "PERCENT"},	// col_87
				{$col_88, "PERCENT"},	// col_88
				{$col_89, "PERCENT"},	// col_89
				{$col_90, "PERCENT"},	// col_90
				{$col_91, "PERCENT"},	// col_91
				{$col_92, "PERCENT"},	// col_92
				{$col_93, "PERCENT"},	// col_93
				{$col_94, "PERCENT"},	// col_94
				{$col_95, "PERCENT"},	// col_95
				{$col_96, "PERCENT"},	// col_96
				{$col_97, "PERCENT"},	// col_97
				{$col_98, "PERCENT"},	// col_98
				{$col_99, "PERCENT"}	// col_99
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
	protected DispRsltR_MC_A(ConstMetaList<? extends DispRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR clone() {
		return (DispRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR createInstance() {
		return (DispRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR getValues(String... names) {
		return (DispRsltR) super.getValues(names);
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
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 1, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 1, $calc_grp_nm, value);
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
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 4, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 4, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 5, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 5, $mng_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 6, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 6, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 7, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 7, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 8, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 8, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 9, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 9, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 10, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 10, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 11, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 11, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 12, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 12, $itm_jnl_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 13, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 13, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 14, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 14, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 15, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 15, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 16, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 16, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 17, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 17, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 18, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 18, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 19, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 19, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 20, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 20, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 21, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 21, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 22, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 22, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 23, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 23, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 24, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 24, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 25, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 25, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 26, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 26, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 27, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 27, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 28, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 28, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 29, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 29, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 30, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 30, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 31, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 31, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 32, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 32, $itm_grp_nm10, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 33, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 33, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 34, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 34, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 35, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 35, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 36, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 36, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 37, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 37, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 38, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 38, $sno4, value);
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 39, $ac_slip_typ);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 39, $ac_slip_typ, value);
	}


	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public String ac_slip_typ_nm() {
		return getConstString(offset + 40, $ac_slip_typ_nm);
	}

	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public void ac_slip_typ_nm(String value) {
		setConstString(offset + 40, $ac_slip_typ_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 41, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 41, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 42, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 42, $ac_rsn_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 43, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 43, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 44, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 44, $cst_nm, value);
	}


	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return getConstString(offset + 45, $cst_grp_cd1);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		setConstString(offset + 45, $cst_grp_cd1, value);
	}


	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return getConstString(offset + 46, $cst_grp_nm1);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		setConstString(offset + 46, $cst_grp_nm1, value);
	}


	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return getConstString(offset + 47, $cst_grp_cd2);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		setConstString(offset + 47, $cst_grp_cd2, value);
	}


	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return getConstString(offset + 48, $cst_grp_nm2);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		setConstString(offset + 48, $cst_grp_nm2, value);
	}


	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return getConstString(offset + 49, $cst_grp_cd3);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		setConstString(offset + 49, $cst_grp_cd3, value);
	}


	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return getConstString(offset + 50, $cst_grp_nm3);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		setConstString(offset + 50, $cst_grp_nm3, value);
	}


	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return getConstString(offset + 51, $cst_grp_cd4);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		setConstString(offset + 51, $cst_grp_cd4, value);
	}


	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return getConstString(offset + 52, $cst_grp_nm4);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		setConstString(offset + 52, $cst_grp_nm4, value);
	}


	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return getConstString(offset + 53, $cst_grp_cd5);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		setConstString(offset + 53, $cst_grp_cd5, value);
	}


	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return getConstString(offset + 54, $cst_grp_nm5);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		setConstString(offset + 54, $cst_grp_nm5, value);
	}


	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return getConstString(offset + 55, $cst_grp_cd6);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		setConstString(offset + 55, $cst_grp_cd6, value);
	}


	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return getConstString(offset + 56, $cst_grp_nm6);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		setConstString(offset + 56, $cst_grp_nm6, value);
	}


	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return getConstString(offset + 57, $cst_grp_cd7);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		setConstString(offset + 57, $cst_grp_cd7, value);
	}


	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return getConstString(offset + 58, $cst_grp_nm7);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		setConstString(offset + 58, $cst_grp_nm7, value);
	}


	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return getConstString(offset + 59, $cst_grp_cd8);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		setConstString(offset + 59, $cst_grp_cd8, value);
	}


	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return getConstString(offset + 60, $cst_grp_nm8);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		setConstString(offset + 60, $cst_grp_nm8, value);
	}


	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return getConstString(offset + 61, $cst_grp_cd9);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		setConstString(offset + 61, $cst_grp_cd9, value);
	}


	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return getConstString(offset + 62, $cst_grp_nm9);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		setConstString(offset + 62, $cst_grp_nm9, value);
	}


	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return getConstString(offset + 63, $cst_grp_cd10);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		setConstString(offset + 63, $cst_grp_cd10, value);
	}


	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return getConstString(offset + 64, $cst_grp_nm10);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		setConstString(offset + 64, $cst_grp_nm10, value);
	}


	/**
	 * Country cd. (Customer) 国ＣＤ（得意先）.<p>
	 *
	 */
	public String cst_cntry_cd() {
		return getConstString(offset + 65, $cst_cntry_cd);
	}

	/**
	 * Country cd. (Customer) 国ＣＤ（得意先）.<p>
	 *
	 */
	public void cst_cntry_cd(String value) {
		setConstString(offset + 65, $cst_cntry_cd, value);
	}


	/**
	 * Country name (Customer) 国名（得意先）.<p>
	 *
	 */
	public String cst_cntry_nm() {
		return getConstString(offset + 66, $cst_cntry_nm);
	}

	/**
	 * Country name (Customer) 国名（得意先）.<p>
	 *
	 */
	public void cst_cntry_nm(String value) {
		setConstString(offset + 66, $cst_cntry_nm, value);
	}


	/**
	 * Region cd. (Customer) 地域ＣＤ（得意先）.<p>
	 *
	 */
	public String cst_area_cd() {
		return getConstString(offset + 67, $cst_area_cd);
	}

	/**
	 * Region cd. (Customer) 地域ＣＤ（得意先）.<p>
	 *
	 */
	public void cst_area_cd(String value) {
		setConstString(offset + 67, $cst_area_cd, value);
	}


	/**
	 * Region name (Customer) 地域名（得意先）.<p>
	 *
	 */
	public String cst_area_nm() {
		return getConstString(offset + 68, $cst_area_nm);
	}

	/**
	 * Region name (Customer) 地域名（得意先）.<p>
	 *
	 */
	public void cst_area_nm(String value) {
		setConstString(offset + 68, $cst_area_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 69, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 69, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 70, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 70, $dlv_nm, value);
	}


	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_grp_cd1() {
		return getConstString(offset + 71, $dlv_grp_cd1);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_grp_cd1(String value) {
		setConstString(offset + 71, $dlv_grp_cd1, value);
	}


	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_grp_nm1() {
		return getConstString(offset + 72, $dlv_grp_nm1);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_grp_nm1(String value) {
		setConstString(offset + 72, $dlv_grp_nm1, value);
	}


	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_grp_cd2() {
		return getConstString(offset + 73, $dlv_grp_cd2);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_grp_cd2(String value) {
		setConstString(offset + 73, $dlv_grp_cd2, value);
	}


	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_grp_nm2() {
		return getConstString(offset + 74, $dlv_grp_nm2);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_grp_nm2(String value) {
		setConstString(offset + 74, $dlv_grp_nm2, value);
	}


	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_grp_cd3() {
		return getConstString(offset + 75, $dlv_grp_cd3);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_grp_cd3(String value) {
		setConstString(offset + 75, $dlv_grp_cd3, value);
	}


	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_grp_nm3() {
		return getConstString(offset + 76, $dlv_grp_nm3);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_grp_nm3(String value) {
		setConstString(offset + 76, $dlv_grp_nm3, value);
	}


	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_grp_cd4() {
		return getConstString(offset + 77, $dlv_grp_cd4);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_grp_cd4(String value) {
		setConstString(offset + 77, $dlv_grp_cd4, value);
	}


	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_grp_nm4() {
		return getConstString(offset + 78, $dlv_grp_nm4);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_grp_nm4(String value) {
		setConstString(offset + 78, $dlv_grp_nm4, value);
	}


	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_grp_cd5() {
		return getConstString(offset + 79, $dlv_grp_cd5);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_grp_cd5(String value) {
		setConstString(offset + 79, $dlv_grp_cd5, value);
	}


	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_grp_nm5() {
		return getConstString(offset + 80, $dlv_grp_nm5);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_grp_nm5(String value) {
		setConstString(offset + 80, $dlv_grp_nm5, value);
	}


	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_grp_cd6() {
		return getConstString(offset + 81, $dlv_grp_cd6);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_grp_cd6(String value) {
		setConstString(offset + 81, $dlv_grp_cd6, value);
	}


	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_grp_nm6() {
		return getConstString(offset + 82, $dlv_grp_nm6);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_grp_nm6(String value) {
		setConstString(offset + 82, $dlv_grp_nm6, value);
	}


	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_grp_cd7() {
		return getConstString(offset + 83, $dlv_grp_cd7);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_grp_cd7(String value) {
		setConstString(offset + 83, $dlv_grp_cd7, value);
	}


	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_grp_nm7() {
		return getConstString(offset + 84, $dlv_grp_nm7);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_grp_nm7(String value) {
		setConstString(offset + 84, $dlv_grp_nm7, value);
	}


	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_grp_cd8() {
		return getConstString(offset + 85, $dlv_grp_cd8);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_grp_cd8(String value) {
		setConstString(offset + 85, $dlv_grp_cd8, value);
	}


	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_grp_nm8() {
		return getConstString(offset + 86, $dlv_grp_nm8);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_grp_nm8(String value) {
		setConstString(offset + 86, $dlv_grp_nm8, value);
	}


	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_grp_cd9() {
		return getConstString(offset + 87, $dlv_grp_cd9);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_grp_cd9(String value) {
		setConstString(offset + 87, $dlv_grp_cd9, value);
	}


	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_grp_nm9() {
		return getConstString(offset + 88, $dlv_grp_nm9);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_grp_nm9(String value) {
		setConstString(offset + 88, $dlv_grp_nm9, value);
	}


	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_grp_cd10() {
		return getConstString(offset + 89, $dlv_grp_cd10);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_grp_cd10(String value) {
		setConstString(offset + 89, $dlv_grp_cd10, value);
	}


	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_grp_nm10() {
		return getConstString(offset + 90, $dlv_grp_nm10);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_grp_nm10(String value) {
		setConstString(offset + 90, $dlv_grp_nm10, value);
	}


	/**
	 * Country cd. (Delivery) 国ＣＤ（納品先）.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return getConstString(offset + 91, $dlv_cntry_cd);
	}

	/**
	 * Country cd. (Delivery) 国ＣＤ（納品先）.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		setConstString(offset + 91, $dlv_cntry_cd, value);
	}


	/**
	 * Country name (Delivery) 国名（納品先）.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 92, $dlv_cntry_nm);
	}

	/**
	 * Country name (Delivery) 国名（納品先）.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 92, $dlv_cntry_nm, value);
	}


	/**
	 * Region cd. (Delivery) 地域ＣＤ（納品先）.<p>
	 *
	 */
	public String dlv_area_cd() {
		return getConstString(offset + 93, $dlv_area_cd);
	}

	/**
	 * Region cd. (Delivery) 地域ＣＤ（納品先）.<p>
	 *
	 */
	public void dlv_area_cd(String value) {
		setConstString(offset + 93, $dlv_area_cd, value);
	}


	/**
	 * Region name (Delivery) 地域名（納品先）.<p>
	 *
	 */
	public String dlv_area_nm() {
		return getConstString(offset + 94, $dlv_area_nm);
	}

	/**
	 * Region name (Delivery) 地域名（納品先）.<p>
	 *
	 */
	public void dlv_area_nm(String value) {
		setConstString(offset + 94, $dlv_area_nm, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 95, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 95, $sls_dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 96, $sls_dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 96, $sls_dpt_nm, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 97, $sls_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 97, $sls_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 98, $sls_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 98, $sls_usr_nm, value);
	}


	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 99, $stk_bp_cd);
	}

	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 99, $stk_bp_cd, value);
	}


	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 100, $stk_bp_nm);
	}

	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 100, $stk_bp_nm, value);
	}


	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public String alc_dpt_cd() {
		return getConstString(offset + 101, $alc_dpt_cd);
	}

	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public void alc_dpt_cd(String value) {
		setConstString(offset + 101, $alc_dpt_cd, value);
	}


	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public String alc_dpt_nm() {
		return getConstString(offset + 102, $alc_dpt_nm);
	}

	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public void alc_dpt_nm(String value) {
		setConstString(offset + 102, $alc_dpt_nm, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 103, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 103, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 104, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 104, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 105, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 105, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 106, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 106, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 107, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 107, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 108, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 108, $dest_nm3, value);
	}


	/**
	 * Sales classification cd. 1 売上分類ＣＤ１.<p>
	 *
	 */
	public String cost_sls_cd1() {
		return getConstString(offset + 109, $cost_sls_cd1);
	}

	/**
	 * Sales classification cd. 1 売上分類ＣＤ１.<p>
	 *
	 */
	public void cost_sls_cd1(String value) {
		setConstString(offset + 109, $cost_sls_cd1, value);
	}


	/**
	 * Sales classification name 1 売上分類名１.<p>
	 *
	 */
	public String cost_sls_nm1() {
		return getConstString(offset + 110, $cost_sls_nm1);
	}

	/**
	 * Sales classification name 1 売上分類名１.<p>
	 *
	 */
	public void cost_sls_nm1(String value) {
		setConstString(offset + 110, $cost_sls_nm1, value);
	}


	/**
	 * Sales classification cd. 2 売上分類ＣＤ２.<p>
	 *
	 */
	public String cost_sls_cd2() {
		return getConstString(offset + 111, $cost_sls_cd2);
	}

	/**
	 * Sales classification cd. 2 売上分類ＣＤ２.<p>
	 *
	 */
	public void cost_sls_cd2(String value) {
		setConstString(offset + 111, $cost_sls_cd2, value);
	}


	/**
	 * Sales classification name 2 売上分類名２.<p>
	 *
	 */
	public String cost_sls_nm2() {
		return getConstString(offset + 112, $cost_sls_nm2);
	}

	/**
	 * Sales classification name 2 売上分類名２.<p>
	 *
	 */
	public void cost_sls_nm2(String value) {
		setConstString(offset + 112, $cost_sls_nm2, value);
	}


	/**
	 * Sales classification cd. 3 売上分類ＣＤ３.<p>
	 *
	 */
	public String cost_sls_cd3() {
		return getConstString(offset + 113, $cost_sls_cd3);
	}

	/**
	 * Sales classification cd. 3 売上分類ＣＤ３.<p>
	 *
	 */
	public void cost_sls_cd3(String value) {
		setConstString(offset + 113, $cost_sls_cd3, value);
	}


	/**
	 * Sales classification name 3 売上分類名３.<p>
	 *
	 */
	public String cost_sls_nm3() {
		return getConstString(offset + 114, $cost_sls_nm3);
	}

	/**
	 * Sales classification name 3 売上分類名３.<p>
	 *
	 */
	public void cost_sls_nm3(String value) {
		setConstString(offset + 114, $cost_sls_nm3, value);
	}


	/**
	 * Sales classification cd. 4 売上分類ＣＤ４.<p>
	 *
	 */
	public String cost_sls_cd4() {
		return getConstString(offset + 115, $cost_sls_cd4);
	}

	/**
	 * Sales classification cd. 4 売上分類ＣＤ４.<p>
	 *
	 */
	public void cost_sls_cd4(String value) {
		setConstString(offset + 115, $cost_sls_cd4, value);
	}


	/**
	 * Sales classification name 4 売上分類名４.<p>
	 *
	 */
	public String cost_sls_nm4() {
		return getConstString(offset + 116, $cost_sls_nm4);
	}

	/**
	 * Sales classification name 4 売上分類名４.<p>
	 *
	 */
	public void cost_sls_nm4(String value) {
		setConstString(offset + 116, $cost_sls_nm4, value);
	}


	/**
	 * Sales classification cd. 5 売上分類ＣＤ５.<p>
	 *
	 */
	public String cost_sls_cd5() {
		return getConstString(offset + 117, $cost_sls_cd5);
	}

	/**
	 * Sales classification cd. 5 売上分類ＣＤ５.<p>
	 *
	 */
	public void cost_sls_cd5(String value) {
		setConstString(offset + 117, $cost_sls_cd5, value);
	}


	/**
	 * Sales classification name 5 売上分類名５.<p>
	 *
	 */
	public String cost_sls_nm5() {
		return getConstString(offset + 118, $cost_sls_nm5);
	}

	/**
	 * Sales classification name 5 売上分類名５.<p>
	 *
	 */
	public void cost_sls_nm5(String value) {
		setConstString(offset + 118, $cost_sls_nm5, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 119, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 119, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 120, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 120, $asst_typ_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 121, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 121, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 122, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 122, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 123, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 123, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 123, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 123, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 123, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 123, $dec_place, value);
	}


	/**
	 * Key index キーインデックス.<p>
	 *
	 */
	public MCNumber key_idx() {
		return getConstNumber(offset + 124, $key_idx);
	}

	/**
	 * Key index キーインデックス.<p>
	 *
	 */
	public void key_idx(MCNumber value) {
		setConstNumber(offset + 124, $key_idx, value);
	}

	/**
	 * Key index キーインデックス.<p>
	 *
	 */
	public void key_idx(int value) {
		setConstNumber(offset + 124, $key_idx, value);
	}

	/**
	 * Key index キーインデックス.<p>
	 *
	 */
	public void key_idx(long value) {
		setConstNumber(offset + 124, $key_idx, value);
	}

	/**
	 * Key index キーインデックス.<p>
	 *
	 */
	public void key_idx(float value) {
		setConstNumber(offset + 124, $key_idx, value);
	}

	/**
	 * Key index キーインデックス.<p>
	 *
	 */
	public void key_idx(double value) {
		setConstNumber(offset + 124, $key_idx, value);
	}


	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public MCNumber elm_no() {
		return getConstNumber(offset + 125, $elm_no);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(MCNumber value) {
		setConstNumber(offset + 125, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(int value) {
		setConstNumber(offset + 125, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(long value) {
		setConstNumber(offset + 125, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(float value) {
		setConstNumber(offset + 125, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(double value) {
		setConstNumber(offset + 125, $elm_no, value);
	}


	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public String elm() {
		return getConstString(offset + 126, $elm);
	}

	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public void elm(String value) {
		setConstString(offset + 126, $elm, value);
	}


	/**
	 * Column 項目.<p>
	 *
	 */
	public String elm_nm() {
		return getConstString(offset + 127, $elm_nm);
	}

	/**
	 * Column 項目.<p>
	 *
	 */
	public void elm_nm(String value) {
		setConstString(offset + 127, $elm_nm, value);
	}


	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCNumber col_00() {
		return getConstNumber(offset + 128, $col_00);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(MCNumber value) {
		setConstNumber(offset + 128, $col_00, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(int value) {
		setConstNumber(offset + 128, $col_00, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(long value) {
		setConstNumber(offset + 128, $col_00, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(float value) {
		setConstNumber(offset + 128, $col_00, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(double value) {
		setConstNumber(offset + 128, $col_00, value);
	}


	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber col_01() {
		return getConstNumber(offset + 129, $col_01);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(MCNumber value) {
		setConstNumber(offset + 129, $col_01, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(int value) {
		setConstNumber(offset + 129, $col_01, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(long value) {
		setConstNumber(offset + 129, $col_01, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(float value) {
		setConstNumber(offset + 129, $col_01, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(double value) {
		setConstNumber(offset + 129, $col_01, value);
	}


	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber col_02() {
		return getConstNumber(offset + 130, $col_02);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(MCNumber value) {
		setConstNumber(offset + 130, $col_02, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(int value) {
		setConstNumber(offset + 130, $col_02, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(long value) {
		setConstNumber(offset + 130, $col_02, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(float value) {
		setConstNumber(offset + 130, $col_02, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(double value) {
		setConstNumber(offset + 130, $col_02, value);
	}


	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber col_03() {
		return getConstNumber(offset + 131, $col_03);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(MCNumber value) {
		setConstNumber(offset + 131, $col_03, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(int value) {
		setConstNumber(offset + 131, $col_03, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(long value) {
		setConstNumber(offset + 131, $col_03, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(float value) {
		setConstNumber(offset + 131, $col_03, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(double value) {
		setConstNumber(offset + 131, $col_03, value);
	}


	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber col_04() {
		return getConstNumber(offset + 132, $col_04);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(MCNumber value) {
		setConstNumber(offset + 132, $col_04, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(int value) {
		setConstNumber(offset + 132, $col_04, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(long value) {
		setConstNumber(offset + 132, $col_04, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(float value) {
		setConstNumber(offset + 132, $col_04, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(double value) {
		setConstNumber(offset + 132, $col_04, value);
	}


	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber col_05() {
		return getConstNumber(offset + 133, $col_05);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(MCNumber value) {
		setConstNumber(offset + 133, $col_05, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(int value) {
		setConstNumber(offset + 133, $col_05, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(long value) {
		setConstNumber(offset + 133, $col_05, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(float value) {
		setConstNumber(offset + 133, $col_05, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(double value) {
		setConstNumber(offset + 133, $col_05, value);
	}


	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber col_06() {
		return getConstNumber(offset + 134, $col_06);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(MCNumber value) {
		setConstNumber(offset + 134, $col_06, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(int value) {
		setConstNumber(offset + 134, $col_06, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(long value) {
		setConstNumber(offset + 134, $col_06, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(float value) {
		setConstNumber(offset + 134, $col_06, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(double value) {
		setConstNumber(offset + 134, $col_06, value);
	}


	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber col_07() {
		return getConstNumber(offset + 135, $col_07);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(MCNumber value) {
		setConstNumber(offset + 135, $col_07, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(int value) {
		setConstNumber(offset + 135, $col_07, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(long value) {
		setConstNumber(offset + 135, $col_07, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(float value) {
		setConstNumber(offset + 135, $col_07, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(double value) {
		setConstNumber(offset + 135, $col_07, value);
	}


	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber col_08() {
		return getConstNumber(offset + 136, $col_08);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(MCNumber value) {
		setConstNumber(offset + 136, $col_08, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(int value) {
		setConstNumber(offset + 136, $col_08, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(long value) {
		setConstNumber(offset + 136, $col_08, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(float value) {
		setConstNumber(offset + 136, $col_08, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(double value) {
		setConstNumber(offset + 136, $col_08, value);
	}


	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber col_09() {
		return getConstNumber(offset + 137, $col_09);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(MCNumber value) {
		setConstNumber(offset + 137, $col_09, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(int value) {
		setConstNumber(offset + 137, $col_09, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(long value) {
		setConstNumber(offset + 137, $col_09, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(float value) {
		setConstNumber(offset + 137, $col_09, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(double value) {
		setConstNumber(offset + 137, $col_09, value);
	}


	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber col_10() {
		return getConstNumber(offset + 138, $col_10);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(MCNumber value) {
		setConstNumber(offset + 138, $col_10, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(int value) {
		setConstNumber(offset + 138, $col_10, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(long value) {
		setConstNumber(offset + 138, $col_10, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(float value) {
		setConstNumber(offset + 138, $col_10, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(double value) {
		setConstNumber(offset + 138, $col_10, value);
	}


	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCNumber col_11() {
		return getConstNumber(offset + 139, $col_11);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_11(MCNumber value) {
		setConstNumber(offset + 139, $col_11, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_11(int value) {
		setConstNumber(offset + 139, $col_11, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_11(long value) {
		setConstNumber(offset + 139, $col_11, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_11(float value) {
		setConstNumber(offset + 139, $col_11, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_11(double value) {
		setConstNumber(offset + 139, $col_11, value);
	}


	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber col_12() {
		return getConstNumber(offset + 140, $col_12);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_12(MCNumber value) {
		setConstNumber(offset + 140, $col_12, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_12(int value) {
		setConstNumber(offset + 140, $col_12, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_12(long value) {
		setConstNumber(offset + 140, $col_12, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_12(float value) {
		setConstNumber(offset + 140, $col_12, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_12(double value) {
		setConstNumber(offset + 140, $col_12, value);
	}


	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber col_13() {
		return getConstNumber(offset + 141, $col_13);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_13(MCNumber value) {
		setConstNumber(offset + 141, $col_13, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_13(int value) {
		setConstNumber(offset + 141, $col_13, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_13(long value) {
		setConstNumber(offset + 141, $col_13, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_13(float value) {
		setConstNumber(offset + 141, $col_13, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_13(double value) {
		setConstNumber(offset + 141, $col_13, value);
	}


	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber col_14() {
		return getConstNumber(offset + 142, $col_14);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_14(MCNumber value) {
		setConstNumber(offset + 142, $col_14, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_14(int value) {
		setConstNumber(offset + 142, $col_14, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_14(long value) {
		setConstNumber(offset + 142, $col_14, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_14(float value) {
		setConstNumber(offset + 142, $col_14, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_14(double value) {
		setConstNumber(offset + 142, $col_14, value);
	}


	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber col_15() {
		return getConstNumber(offset + 143, $col_15);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_15(MCNumber value) {
		setConstNumber(offset + 143, $col_15, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_15(int value) {
		setConstNumber(offset + 143, $col_15, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_15(long value) {
		setConstNumber(offset + 143, $col_15, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_15(float value) {
		setConstNumber(offset + 143, $col_15, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_15(double value) {
		setConstNumber(offset + 143, $col_15, value);
	}


	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber col_16() {
		return getConstNumber(offset + 144, $col_16);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_16(MCNumber value) {
		setConstNumber(offset + 144, $col_16, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_16(int value) {
		setConstNumber(offset + 144, $col_16, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_16(long value) {
		setConstNumber(offset + 144, $col_16, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_16(float value) {
		setConstNumber(offset + 144, $col_16, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_16(double value) {
		setConstNumber(offset + 144, $col_16, value);
	}


	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber col_17() {
		return getConstNumber(offset + 145, $col_17);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_17(MCNumber value) {
		setConstNumber(offset + 145, $col_17, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_17(int value) {
		setConstNumber(offset + 145, $col_17, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_17(long value) {
		setConstNumber(offset + 145, $col_17, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_17(float value) {
		setConstNumber(offset + 145, $col_17, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_17(double value) {
		setConstNumber(offset + 145, $col_17, value);
	}


	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber col_18() {
		return getConstNumber(offset + 146, $col_18);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_18(MCNumber value) {
		setConstNumber(offset + 146, $col_18, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_18(int value) {
		setConstNumber(offset + 146, $col_18, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_18(long value) {
		setConstNumber(offset + 146, $col_18, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_18(float value) {
		setConstNumber(offset + 146, $col_18, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_18(double value) {
		setConstNumber(offset + 146, $col_18, value);
	}


	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber col_19() {
		return getConstNumber(offset + 147, $col_19);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_19(MCNumber value) {
		setConstNumber(offset + 147, $col_19, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_19(int value) {
		setConstNumber(offset + 147, $col_19, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_19(long value) {
		setConstNumber(offset + 147, $col_19, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_19(float value) {
		setConstNumber(offset + 147, $col_19, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_19(double value) {
		setConstNumber(offset + 147, $col_19, value);
	}


	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber col_20() {
		return getConstNumber(offset + 148, $col_20);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_20(MCNumber value) {
		setConstNumber(offset + 148, $col_20, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_20(int value) {
		setConstNumber(offset + 148, $col_20, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_20(long value) {
		setConstNumber(offset + 148, $col_20, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_20(float value) {
		setConstNumber(offset + 148, $col_20, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_20(double value) {
		setConstNumber(offset + 148, $col_20, value);
	}


	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber col_21() {
		return getConstNumber(offset + 149, $col_21);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_21(MCNumber value) {
		setConstNumber(offset + 149, $col_21, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_21(int value) {
		setConstNumber(offset + 149, $col_21, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_21(long value) {
		setConstNumber(offset + 149, $col_21, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_21(float value) {
		setConstNumber(offset + 149, $col_21, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_21(double value) {
		setConstNumber(offset + 149, $col_21, value);
	}


	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCNumber col_22() {
		return getConstNumber(offset + 150, $col_22);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_22(MCNumber value) {
		setConstNumber(offset + 150, $col_22, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_22(int value) {
		setConstNumber(offset + 150, $col_22, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_22(long value) {
		setConstNumber(offset + 150, $col_22, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_22(float value) {
		setConstNumber(offset + 150, $col_22, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_22(double value) {
		setConstNumber(offset + 150, $col_22, value);
	}


	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber col_23() {
		return getConstNumber(offset + 151, $col_23);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_23(MCNumber value) {
		setConstNumber(offset + 151, $col_23, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_23(int value) {
		setConstNumber(offset + 151, $col_23, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_23(long value) {
		setConstNumber(offset + 151, $col_23, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_23(float value) {
		setConstNumber(offset + 151, $col_23, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_23(double value) {
		setConstNumber(offset + 151, $col_23, value);
	}


	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber col_24() {
		return getConstNumber(offset + 152, $col_24);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_24(MCNumber value) {
		setConstNumber(offset + 152, $col_24, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_24(int value) {
		setConstNumber(offset + 152, $col_24, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_24(long value) {
		setConstNumber(offset + 152, $col_24, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_24(float value) {
		setConstNumber(offset + 152, $col_24, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_24(double value) {
		setConstNumber(offset + 152, $col_24, value);
	}


	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber col_25() {
		return getConstNumber(offset + 153, $col_25);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_25(MCNumber value) {
		setConstNumber(offset + 153, $col_25, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_25(int value) {
		setConstNumber(offset + 153, $col_25, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_25(long value) {
		setConstNumber(offset + 153, $col_25, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_25(float value) {
		setConstNumber(offset + 153, $col_25, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_25(double value) {
		setConstNumber(offset + 153, $col_25, value);
	}


	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber col_26() {
		return getConstNumber(offset + 154, $col_26);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_26(MCNumber value) {
		setConstNumber(offset + 154, $col_26, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_26(int value) {
		setConstNumber(offset + 154, $col_26, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_26(long value) {
		setConstNumber(offset + 154, $col_26, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_26(float value) {
		setConstNumber(offset + 154, $col_26, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_26(double value) {
		setConstNumber(offset + 154, $col_26, value);
	}


	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber col_27() {
		return getConstNumber(offset + 155, $col_27);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_27(MCNumber value) {
		setConstNumber(offset + 155, $col_27, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_27(int value) {
		setConstNumber(offset + 155, $col_27, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_27(long value) {
		setConstNumber(offset + 155, $col_27, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_27(float value) {
		setConstNumber(offset + 155, $col_27, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_27(double value) {
		setConstNumber(offset + 155, $col_27, value);
	}


	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber col_28() {
		return getConstNumber(offset + 156, $col_28);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_28(MCNumber value) {
		setConstNumber(offset + 156, $col_28, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_28(int value) {
		setConstNumber(offset + 156, $col_28, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_28(long value) {
		setConstNumber(offset + 156, $col_28, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_28(float value) {
		setConstNumber(offset + 156, $col_28, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_28(double value) {
		setConstNumber(offset + 156, $col_28, value);
	}


	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber col_29() {
		return getConstNumber(offset + 157, $col_29);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_29(MCNumber value) {
		setConstNumber(offset + 157, $col_29, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_29(int value) {
		setConstNumber(offset + 157, $col_29, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_29(long value) {
		setConstNumber(offset + 157, $col_29, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_29(float value) {
		setConstNumber(offset + 157, $col_29, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_29(double value) {
		setConstNumber(offset + 157, $col_29, value);
	}


	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber col_30() {
		return getConstNumber(offset + 158, $col_30);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_30(MCNumber value) {
		setConstNumber(offset + 158, $col_30, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_30(int value) {
		setConstNumber(offset + 158, $col_30, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_30(long value) {
		setConstNumber(offset + 158, $col_30, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_30(float value) {
		setConstNumber(offset + 158, $col_30, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_30(double value) {
		setConstNumber(offset + 158, $col_30, value);
	}


	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber col_31() {
		return getConstNumber(offset + 159, $col_31);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_31(MCNumber value) {
		setConstNumber(offset + 159, $col_31, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_31(int value) {
		setConstNumber(offset + 159, $col_31, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_31(long value) {
		setConstNumber(offset + 159, $col_31, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_31(float value) {
		setConstNumber(offset + 159, $col_31, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_31(double value) {
		setConstNumber(offset + 159, $col_31, value);
	}


	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber col_32() {
		return getConstNumber(offset + 160, $col_32);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_32(MCNumber value) {
		setConstNumber(offset + 160, $col_32, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_32(int value) {
		setConstNumber(offset + 160, $col_32, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_32(long value) {
		setConstNumber(offset + 160, $col_32, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_32(float value) {
		setConstNumber(offset + 160, $col_32, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_32(double value) {
		setConstNumber(offset + 160, $col_32, value);
	}


	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCNumber col_33() {
		return getConstNumber(offset + 161, $col_33);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_33(MCNumber value) {
		setConstNumber(offset + 161, $col_33, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_33(int value) {
		setConstNumber(offset + 161, $col_33, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_33(long value) {
		setConstNumber(offset + 161, $col_33, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_33(float value) {
		setConstNumber(offset + 161, $col_33, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_33(double value) {
		setConstNumber(offset + 161, $col_33, value);
	}


	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber col_34() {
		return getConstNumber(offset + 162, $col_34);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_34(MCNumber value) {
		setConstNumber(offset + 162, $col_34, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_34(int value) {
		setConstNumber(offset + 162, $col_34, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_34(long value) {
		setConstNumber(offset + 162, $col_34, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_34(float value) {
		setConstNumber(offset + 162, $col_34, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_34(double value) {
		setConstNumber(offset + 162, $col_34, value);
	}


	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber col_35() {
		return getConstNumber(offset + 163, $col_35);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_35(MCNumber value) {
		setConstNumber(offset + 163, $col_35, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_35(int value) {
		setConstNumber(offset + 163, $col_35, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_35(long value) {
		setConstNumber(offset + 163, $col_35, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_35(float value) {
		setConstNumber(offset + 163, $col_35, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_35(double value) {
		setConstNumber(offset + 163, $col_35, value);
	}


	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber col_36() {
		return getConstNumber(offset + 164, $col_36);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_36(MCNumber value) {
		setConstNumber(offset + 164, $col_36, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_36(int value) {
		setConstNumber(offset + 164, $col_36, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_36(long value) {
		setConstNumber(offset + 164, $col_36, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_36(float value) {
		setConstNumber(offset + 164, $col_36, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_36(double value) {
		setConstNumber(offset + 164, $col_36, value);
	}


	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber col_37() {
		return getConstNumber(offset + 165, $col_37);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_37(MCNumber value) {
		setConstNumber(offset + 165, $col_37, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_37(int value) {
		setConstNumber(offset + 165, $col_37, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_37(long value) {
		setConstNumber(offset + 165, $col_37, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_37(float value) {
		setConstNumber(offset + 165, $col_37, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_37(double value) {
		setConstNumber(offset + 165, $col_37, value);
	}


	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber col_38() {
		return getConstNumber(offset + 166, $col_38);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_38(MCNumber value) {
		setConstNumber(offset + 166, $col_38, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_38(int value) {
		setConstNumber(offset + 166, $col_38, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_38(long value) {
		setConstNumber(offset + 166, $col_38, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_38(float value) {
		setConstNumber(offset + 166, $col_38, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_38(double value) {
		setConstNumber(offset + 166, $col_38, value);
	}


	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber col_39() {
		return getConstNumber(offset + 167, $col_39);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_39(MCNumber value) {
		setConstNumber(offset + 167, $col_39, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_39(int value) {
		setConstNumber(offset + 167, $col_39, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_39(long value) {
		setConstNumber(offset + 167, $col_39, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_39(float value) {
		setConstNumber(offset + 167, $col_39, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_39(double value) {
		setConstNumber(offset + 167, $col_39, value);
	}


	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber col_40() {
		return getConstNumber(offset + 168, $col_40);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_40(MCNumber value) {
		setConstNumber(offset + 168, $col_40, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_40(int value) {
		setConstNumber(offset + 168, $col_40, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_40(long value) {
		setConstNumber(offset + 168, $col_40, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_40(float value) {
		setConstNumber(offset + 168, $col_40, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_40(double value) {
		setConstNumber(offset + 168, $col_40, value);
	}


	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber col_41() {
		return getConstNumber(offset + 169, $col_41);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_41(MCNumber value) {
		setConstNumber(offset + 169, $col_41, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_41(int value) {
		setConstNumber(offset + 169, $col_41, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_41(long value) {
		setConstNumber(offset + 169, $col_41, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_41(float value) {
		setConstNumber(offset + 169, $col_41, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_41(double value) {
		setConstNumber(offset + 169, $col_41, value);
	}


	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber col_42() {
		return getConstNumber(offset + 170, $col_42);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_42(MCNumber value) {
		setConstNumber(offset + 170, $col_42, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_42(int value) {
		setConstNumber(offset + 170, $col_42, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_42(long value) {
		setConstNumber(offset + 170, $col_42, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_42(float value) {
		setConstNumber(offset + 170, $col_42, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_42(double value) {
		setConstNumber(offset + 170, $col_42, value);
	}


	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber col_43() {
		return getConstNumber(offset + 171, $col_43);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_43(MCNumber value) {
		setConstNumber(offset + 171, $col_43, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_43(int value) {
		setConstNumber(offset + 171, $col_43, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_43(long value) {
		setConstNumber(offset + 171, $col_43, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_43(float value) {
		setConstNumber(offset + 171, $col_43, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_43(double value) {
		setConstNumber(offset + 171, $col_43, value);
	}


	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCNumber col_44() {
		return getConstNumber(offset + 172, $col_44);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_44(MCNumber value) {
		setConstNumber(offset + 172, $col_44, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_44(int value) {
		setConstNumber(offset + 172, $col_44, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_44(long value) {
		setConstNumber(offset + 172, $col_44, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_44(float value) {
		setConstNumber(offset + 172, $col_44, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_44(double value) {
		setConstNumber(offset + 172, $col_44, value);
	}


	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber col_45() {
		return getConstNumber(offset + 173, $col_45);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_45(MCNumber value) {
		setConstNumber(offset + 173, $col_45, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_45(int value) {
		setConstNumber(offset + 173, $col_45, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_45(long value) {
		setConstNumber(offset + 173, $col_45, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_45(float value) {
		setConstNumber(offset + 173, $col_45, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_45(double value) {
		setConstNumber(offset + 173, $col_45, value);
	}


	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber col_46() {
		return getConstNumber(offset + 174, $col_46);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_46(MCNumber value) {
		setConstNumber(offset + 174, $col_46, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_46(int value) {
		setConstNumber(offset + 174, $col_46, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_46(long value) {
		setConstNumber(offset + 174, $col_46, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_46(float value) {
		setConstNumber(offset + 174, $col_46, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_46(double value) {
		setConstNumber(offset + 174, $col_46, value);
	}


	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber col_47() {
		return getConstNumber(offset + 175, $col_47);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_47(MCNumber value) {
		setConstNumber(offset + 175, $col_47, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_47(int value) {
		setConstNumber(offset + 175, $col_47, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_47(long value) {
		setConstNumber(offset + 175, $col_47, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_47(float value) {
		setConstNumber(offset + 175, $col_47, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_47(double value) {
		setConstNumber(offset + 175, $col_47, value);
	}


	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber col_48() {
		return getConstNumber(offset + 176, $col_48);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_48(MCNumber value) {
		setConstNumber(offset + 176, $col_48, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_48(int value) {
		setConstNumber(offset + 176, $col_48, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_48(long value) {
		setConstNumber(offset + 176, $col_48, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_48(float value) {
		setConstNumber(offset + 176, $col_48, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_48(double value) {
		setConstNumber(offset + 176, $col_48, value);
	}


	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber col_49() {
		return getConstNumber(offset + 177, $col_49);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_49(MCNumber value) {
		setConstNumber(offset + 177, $col_49, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_49(int value) {
		setConstNumber(offset + 177, $col_49, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_49(long value) {
		setConstNumber(offset + 177, $col_49, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_49(float value) {
		setConstNumber(offset + 177, $col_49, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_49(double value) {
		setConstNumber(offset + 177, $col_49, value);
	}


	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber col_50() {
		return getConstNumber(offset + 178, $col_50);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_50(MCNumber value) {
		setConstNumber(offset + 178, $col_50, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_50(int value) {
		setConstNumber(offset + 178, $col_50, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_50(long value) {
		setConstNumber(offset + 178, $col_50, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_50(float value) {
		setConstNumber(offset + 178, $col_50, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_50(double value) {
		setConstNumber(offset + 178, $col_50, value);
	}


	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber col_51() {
		return getConstNumber(offset + 179, $col_51);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_51(MCNumber value) {
		setConstNumber(offset + 179, $col_51, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_51(int value) {
		setConstNumber(offset + 179, $col_51, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_51(long value) {
		setConstNumber(offset + 179, $col_51, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_51(float value) {
		setConstNumber(offset + 179, $col_51, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_51(double value) {
		setConstNumber(offset + 179, $col_51, value);
	}


	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber col_52() {
		return getConstNumber(offset + 180, $col_52);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_52(MCNumber value) {
		setConstNumber(offset + 180, $col_52, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_52(int value) {
		setConstNumber(offset + 180, $col_52, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_52(long value) {
		setConstNumber(offset + 180, $col_52, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_52(float value) {
		setConstNumber(offset + 180, $col_52, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_52(double value) {
		setConstNumber(offset + 180, $col_52, value);
	}


	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber col_53() {
		return getConstNumber(offset + 181, $col_53);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_53(MCNumber value) {
		setConstNumber(offset + 181, $col_53, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_53(int value) {
		setConstNumber(offset + 181, $col_53, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_53(long value) {
		setConstNumber(offset + 181, $col_53, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_53(float value) {
		setConstNumber(offset + 181, $col_53, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_53(double value) {
		setConstNumber(offset + 181, $col_53, value);
	}


	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber col_54() {
		return getConstNumber(offset + 182, $col_54);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_54(MCNumber value) {
		setConstNumber(offset + 182, $col_54, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_54(int value) {
		setConstNumber(offset + 182, $col_54, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_54(long value) {
		setConstNumber(offset + 182, $col_54, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_54(float value) {
		setConstNumber(offset + 182, $col_54, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_54(double value) {
		setConstNumber(offset + 182, $col_54, value);
	}


	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCNumber col_55() {
		return getConstNumber(offset + 183, $col_55);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_55(MCNumber value) {
		setConstNumber(offset + 183, $col_55, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_55(int value) {
		setConstNumber(offset + 183, $col_55, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_55(long value) {
		setConstNumber(offset + 183, $col_55, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_55(float value) {
		setConstNumber(offset + 183, $col_55, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_55(double value) {
		setConstNumber(offset + 183, $col_55, value);
	}


	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber col_56() {
		return getConstNumber(offset + 184, $col_56);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_56(MCNumber value) {
		setConstNumber(offset + 184, $col_56, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_56(int value) {
		setConstNumber(offset + 184, $col_56, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_56(long value) {
		setConstNumber(offset + 184, $col_56, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_56(float value) {
		setConstNumber(offset + 184, $col_56, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_56(double value) {
		setConstNumber(offset + 184, $col_56, value);
	}


	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber col_57() {
		return getConstNumber(offset + 185, $col_57);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_57(MCNumber value) {
		setConstNumber(offset + 185, $col_57, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_57(int value) {
		setConstNumber(offset + 185, $col_57, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_57(long value) {
		setConstNumber(offset + 185, $col_57, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_57(float value) {
		setConstNumber(offset + 185, $col_57, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_57(double value) {
		setConstNumber(offset + 185, $col_57, value);
	}


	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber col_58() {
		return getConstNumber(offset + 186, $col_58);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_58(MCNumber value) {
		setConstNumber(offset + 186, $col_58, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_58(int value) {
		setConstNumber(offset + 186, $col_58, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_58(long value) {
		setConstNumber(offset + 186, $col_58, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_58(float value) {
		setConstNumber(offset + 186, $col_58, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_58(double value) {
		setConstNumber(offset + 186, $col_58, value);
	}


	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber col_59() {
		return getConstNumber(offset + 187, $col_59);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_59(MCNumber value) {
		setConstNumber(offset + 187, $col_59, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_59(int value) {
		setConstNumber(offset + 187, $col_59, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_59(long value) {
		setConstNumber(offset + 187, $col_59, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_59(float value) {
		setConstNumber(offset + 187, $col_59, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_59(double value) {
		setConstNumber(offset + 187, $col_59, value);
	}


	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber col_60() {
		return getConstNumber(offset + 188, $col_60);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_60(MCNumber value) {
		setConstNumber(offset + 188, $col_60, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_60(int value) {
		setConstNumber(offset + 188, $col_60, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_60(long value) {
		setConstNumber(offset + 188, $col_60, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_60(float value) {
		setConstNumber(offset + 188, $col_60, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_60(double value) {
		setConstNumber(offset + 188, $col_60, value);
	}


	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber col_61() {
		return getConstNumber(offset + 189, $col_61);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_61(MCNumber value) {
		setConstNumber(offset + 189, $col_61, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_61(int value) {
		setConstNumber(offset + 189, $col_61, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_61(long value) {
		setConstNumber(offset + 189, $col_61, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_61(float value) {
		setConstNumber(offset + 189, $col_61, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_61(double value) {
		setConstNumber(offset + 189, $col_61, value);
	}


	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber col_62() {
		return getConstNumber(offset + 190, $col_62);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_62(MCNumber value) {
		setConstNumber(offset + 190, $col_62, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_62(int value) {
		setConstNumber(offset + 190, $col_62, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_62(long value) {
		setConstNumber(offset + 190, $col_62, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_62(float value) {
		setConstNumber(offset + 190, $col_62, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_62(double value) {
		setConstNumber(offset + 190, $col_62, value);
	}


	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber col_63() {
		return getConstNumber(offset + 191, $col_63);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_63(MCNumber value) {
		setConstNumber(offset + 191, $col_63, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_63(int value) {
		setConstNumber(offset + 191, $col_63, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_63(long value) {
		setConstNumber(offset + 191, $col_63, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_63(float value) {
		setConstNumber(offset + 191, $col_63, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_63(double value) {
		setConstNumber(offset + 191, $col_63, value);
	}


	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber col_64() {
		return getConstNumber(offset + 192, $col_64);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_64(MCNumber value) {
		setConstNumber(offset + 192, $col_64, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_64(int value) {
		setConstNumber(offset + 192, $col_64, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_64(long value) {
		setConstNumber(offset + 192, $col_64, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_64(float value) {
		setConstNumber(offset + 192, $col_64, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_64(double value) {
		setConstNumber(offset + 192, $col_64, value);
	}


	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber col_65() {
		return getConstNumber(offset + 193, $col_65);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_65(MCNumber value) {
		setConstNumber(offset + 193, $col_65, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_65(int value) {
		setConstNumber(offset + 193, $col_65, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_65(long value) {
		setConstNumber(offset + 193, $col_65, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_65(float value) {
		setConstNumber(offset + 193, $col_65, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_65(double value) {
		setConstNumber(offset + 193, $col_65, value);
	}


	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCNumber col_66() {
		return getConstNumber(offset + 194, $col_66);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_66(MCNumber value) {
		setConstNumber(offset + 194, $col_66, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_66(int value) {
		setConstNumber(offset + 194, $col_66, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_66(long value) {
		setConstNumber(offset + 194, $col_66, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_66(float value) {
		setConstNumber(offset + 194, $col_66, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_66(double value) {
		setConstNumber(offset + 194, $col_66, value);
	}


	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber col_67() {
		return getConstNumber(offset + 195, $col_67);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_67(MCNumber value) {
		setConstNumber(offset + 195, $col_67, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_67(int value) {
		setConstNumber(offset + 195, $col_67, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_67(long value) {
		setConstNumber(offset + 195, $col_67, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_67(float value) {
		setConstNumber(offset + 195, $col_67, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_67(double value) {
		setConstNumber(offset + 195, $col_67, value);
	}


	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber col_68() {
		return getConstNumber(offset + 196, $col_68);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_68(MCNumber value) {
		setConstNumber(offset + 196, $col_68, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_68(int value) {
		setConstNumber(offset + 196, $col_68, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_68(long value) {
		setConstNumber(offset + 196, $col_68, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_68(float value) {
		setConstNumber(offset + 196, $col_68, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_68(double value) {
		setConstNumber(offset + 196, $col_68, value);
	}


	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber col_69() {
		return getConstNumber(offset + 197, $col_69);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_69(MCNumber value) {
		setConstNumber(offset + 197, $col_69, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_69(int value) {
		setConstNumber(offset + 197, $col_69, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_69(long value) {
		setConstNumber(offset + 197, $col_69, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_69(float value) {
		setConstNumber(offset + 197, $col_69, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_69(double value) {
		setConstNumber(offset + 197, $col_69, value);
	}


	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber col_70() {
		return getConstNumber(offset + 198, $col_70);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_70(MCNumber value) {
		setConstNumber(offset + 198, $col_70, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_70(int value) {
		setConstNumber(offset + 198, $col_70, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_70(long value) {
		setConstNumber(offset + 198, $col_70, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_70(float value) {
		setConstNumber(offset + 198, $col_70, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_70(double value) {
		setConstNumber(offset + 198, $col_70, value);
	}


	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber col_71() {
		return getConstNumber(offset + 199, $col_71);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_71(MCNumber value) {
		setConstNumber(offset + 199, $col_71, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_71(int value) {
		setConstNumber(offset + 199, $col_71, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_71(long value) {
		setConstNumber(offset + 199, $col_71, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_71(float value) {
		setConstNumber(offset + 199, $col_71, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_71(double value) {
		setConstNumber(offset + 199, $col_71, value);
	}


	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber col_72() {
		return getConstNumber(offset + 200, $col_72);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_72(MCNumber value) {
		setConstNumber(offset + 200, $col_72, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_72(int value) {
		setConstNumber(offset + 200, $col_72, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_72(long value) {
		setConstNumber(offset + 200, $col_72, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_72(float value) {
		setConstNumber(offset + 200, $col_72, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_72(double value) {
		setConstNumber(offset + 200, $col_72, value);
	}


	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber col_73() {
		return getConstNumber(offset + 201, $col_73);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_73(MCNumber value) {
		setConstNumber(offset + 201, $col_73, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_73(int value) {
		setConstNumber(offset + 201, $col_73, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_73(long value) {
		setConstNumber(offset + 201, $col_73, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_73(float value) {
		setConstNumber(offset + 201, $col_73, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_73(double value) {
		setConstNumber(offset + 201, $col_73, value);
	}


	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber col_74() {
		return getConstNumber(offset + 202, $col_74);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_74(MCNumber value) {
		setConstNumber(offset + 202, $col_74, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_74(int value) {
		setConstNumber(offset + 202, $col_74, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_74(long value) {
		setConstNumber(offset + 202, $col_74, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_74(float value) {
		setConstNumber(offset + 202, $col_74, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_74(double value) {
		setConstNumber(offset + 202, $col_74, value);
	}


	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber col_75() {
		return getConstNumber(offset + 203, $col_75);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_75(MCNumber value) {
		setConstNumber(offset + 203, $col_75, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_75(int value) {
		setConstNumber(offset + 203, $col_75, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_75(long value) {
		setConstNumber(offset + 203, $col_75, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_75(float value) {
		setConstNumber(offset + 203, $col_75, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_75(double value) {
		setConstNumber(offset + 203, $col_75, value);
	}


	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber col_76() {
		return getConstNumber(offset + 204, $col_76);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_76(MCNumber value) {
		setConstNumber(offset + 204, $col_76, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_76(int value) {
		setConstNumber(offset + 204, $col_76, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_76(long value) {
		setConstNumber(offset + 204, $col_76, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_76(float value) {
		setConstNumber(offset + 204, $col_76, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_76(double value) {
		setConstNumber(offset + 204, $col_76, value);
	}


	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCNumber col_77() {
		return getConstNumber(offset + 205, $col_77);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_77(MCNumber value) {
		setConstNumber(offset + 205, $col_77, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_77(int value) {
		setConstNumber(offset + 205, $col_77, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_77(long value) {
		setConstNumber(offset + 205, $col_77, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_77(float value) {
		setConstNumber(offset + 205, $col_77, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_77(double value) {
		setConstNumber(offset + 205, $col_77, value);
	}


	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber col_78() {
		return getConstNumber(offset + 206, $col_78);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_78(MCNumber value) {
		setConstNumber(offset + 206, $col_78, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_78(int value) {
		setConstNumber(offset + 206, $col_78, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_78(long value) {
		setConstNumber(offset + 206, $col_78, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_78(float value) {
		setConstNumber(offset + 206, $col_78, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_78(double value) {
		setConstNumber(offset + 206, $col_78, value);
	}


	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber col_79() {
		return getConstNumber(offset + 207, $col_79);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_79(MCNumber value) {
		setConstNumber(offset + 207, $col_79, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_79(int value) {
		setConstNumber(offset + 207, $col_79, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_79(long value) {
		setConstNumber(offset + 207, $col_79, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_79(float value) {
		setConstNumber(offset + 207, $col_79, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_79(double value) {
		setConstNumber(offset + 207, $col_79, value);
	}


	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber col_80() {
		return getConstNumber(offset + 208, $col_80);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_80(MCNumber value) {
		setConstNumber(offset + 208, $col_80, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_80(int value) {
		setConstNumber(offset + 208, $col_80, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_80(long value) {
		setConstNumber(offset + 208, $col_80, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_80(float value) {
		setConstNumber(offset + 208, $col_80, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_80(double value) {
		setConstNumber(offset + 208, $col_80, value);
	}


	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber col_81() {
		return getConstNumber(offset + 209, $col_81);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_81(MCNumber value) {
		setConstNumber(offset + 209, $col_81, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_81(int value) {
		setConstNumber(offset + 209, $col_81, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_81(long value) {
		setConstNumber(offset + 209, $col_81, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_81(float value) {
		setConstNumber(offset + 209, $col_81, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_81(double value) {
		setConstNumber(offset + 209, $col_81, value);
	}


	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber col_82() {
		return getConstNumber(offset + 210, $col_82);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_82(MCNumber value) {
		setConstNumber(offset + 210, $col_82, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_82(int value) {
		setConstNumber(offset + 210, $col_82, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_82(long value) {
		setConstNumber(offset + 210, $col_82, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_82(float value) {
		setConstNumber(offset + 210, $col_82, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_82(double value) {
		setConstNumber(offset + 210, $col_82, value);
	}


	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber col_83() {
		return getConstNumber(offset + 211, $col_83);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_83(MCNumber value) {
		setConstNumber(offset + 211, $col_83, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_83(int value) {
		setConstNumber(offset + 211, $col_83, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_83(long value) {
		setConstNumber(offset + 211, $col_83, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_83(float value) {
		setConstNumber(offset + 211, $col_83, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_83(double value) {
		setConstNumber(offset + 211, $col_83, value);
	}


	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber col_84() {
		return getConstNumber(offset + 212, $col_84);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_84(MCNumber value) {
		setConstNumber(offset + 212, $col_84, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_84(int value) {
		setConstNumber(offset + 212, $col_84, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_84(long value) {
		setConstNumber(offset + 212, $col_84, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_84(float value) {
		setConstNumber(offset + 212, $col_84, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_84(double value) {
		setConstNumber(offset + 212, $col_84, value);
	}


	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber col_85() {
		return getConstNumber(offset + 213, $col_85);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_85(MCNumber value) {
		setConstNumber(offset + 213, $col_85, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_85(int value) {
		setConstNumber(offset + 213, $col_85, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_85(long value) {
		setConstNumber(offset + 213, $col_85, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_85(float value) {
		setConstNumber(offset + 213, $col_85, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_85(double value) {
		setConstNumber(offset + 213, $col_85, value);
	}


	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber col_86() {
		return getConstNumber(offset + 214, $col_86);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_86(MCNumber value) {
		setConstNumber(offset + 214, $col_86, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_86(int value) {
		setConstNumber(offset + 214, $col_86, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_86(long value) {
		setConstNumber(offset + 214, $col_86, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_86(float value) {
		setConstNumber(offset + 214, $col_86, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_86(double value) {
		setConstNumber(offset + 214, $col_86, value);
	}


	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber col_87() {
		return getConstNumber(offset + 215, $col_87);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_87(MCNumber value) {
		setConstNumber(offset + 215, $col_87, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_87(int value) {
		setConstNumber(offset + 215, $col_87, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_87(long value) {
		setConstNumber(offset + 215, $col_87, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_87(float value) {
		setConstNumber(offset + 215, $col_87, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_87(double value) {
		setConstNumber(offset + 215, $col_87, value);
	}


	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCNumber col_88() {
		return getConstNumber(offset + 216, $col_88);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_88(MCNumber value) {
		setConstNumber(offset + 216, $col_88, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_88(int value) {
		setConstNumber(offset + 216, $col_88, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_88(long value) {
		setConstNumber(offset + 216, $col_88, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_88(float value) {
		setConstNumber(offset + 216, $col_88, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_88(double value) {
		setConstNumber(offset + 216, $col_88, value);
	}


	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber col_89() {
		return getConstNumber(offset + 217, $col_89);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_89(MCNumber value) {
		setConstNumber(offset + 217, $col_89, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_89(int value) {
		setConstNumber(offset + 217, $col_89, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_89(long value) {
		setConstNumber(offset + 217, $col_89, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_89(float value) {
		setConstNumber(offset + 217, $col_89, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_89(double value) {
		setConstNumber(offset + 217, $col_89, value);
	}


	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber col_90() {
		return getConstNumber(offset + 218, $col_90);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_90(MCNumber value) {
		setConstNumber(offset + 218, $col_90, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_90(int value) {
		setConstNumber(offset + 218, $col_90, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_90(long value) {
		setConstNumber(offset + 218, $col_90, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_90(float value) {
		setConstNumber(offset + 218, $col_90, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_90(double value) {
		setConstNumber(offset + 218, $col_90, value);
	}


	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber col_91() {
		return getConstNumber(offset + 219, $col_91);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_91(MCNumber value) {
		setConstNumber(offset + 219, $col_91, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_91(int value) {
		setConstNumber(offset + 219, $col_91, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_91(long value) {
		setConstNumber(offset + 219, $col_91, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_91(float value) {
		setConstNumber(offset + 219, $col_91, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_91(double value) {
		setConstNumber(offset + 219, $col_91, value);
	}


	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber col_92() {
		return getConstNumber(offset + 220, $col_92);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_92(MCNumber value) {
		setConstNumber(offset + 220, $col_92, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_92(int value) {
		setConstNumber(offset + 220, $col_92, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_92(long value) {
		setConstNumber(offset + 220, $col_92, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_92(float value) {
		setConstNumber(offset + 220, $col_92, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_92(double value) {
		setConstNumber(offset + 220, $col_92, value);
	}


	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber col_93() {
		return getConstNumber(offset + 221, $col_93);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_93(MCNumber value) {
		setConstNumber(offset + 221, $col_93, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_93(int value) {
		setConstNumber(offset + 221, $col_93, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_93(long value) {
		setConstNumber(offset + 221, $col_93, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_93(float value) {
		setConstNumber(offset + 221, $col_93, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_93(double value) {
		setConstNumber(offset + 221, $col_93, value);
	}


	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber col_94() {
		return getConstNumber(offset + 222, $col_94);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_94(MCNumber value) {
		setConstNumber(offset + 222, $col_94, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_94(int value) {
		setConstNumber(offset + 222, $col_94, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_94(long value) {
		setConstNumber(offset + 222, $col_94, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_94(float value) {
		setConstNumber(offset + 222, $col_94, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_94(double value) {
		setConstNumber(offset + 222, $col_94, value);
	}


	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber col_95() {
		return getConstNumber(offset + 223, $col_95);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_95(MCNumber value) {
		setConstNumber(offset + 223, $col_95, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_95(int value) {
		setConstNumber(offset + 223, $col_95, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_95(long value) {
		setConstNumber(offset + 223, $col_95, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_95(float value) {
		setConstNumber(offset + 223, $col_95, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_95(double value) {
		setConstNumber(offset + 223, $col_95, value);
	}


	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber col_96() {
		return getConstNumber(offset + 224, $col_96);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_96(MCNumber value) {
		setConstNumber(offset + 224, $col_96, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_96(int value) {
		setConstNumber(offset + 224, $col_96, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_96(long value) {
		setConstNumber(offset + 224, $col_96, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_96(float value) {
		setConstNumber(offset + 224, $col_96, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_96(double value) {
		setConstNumber(offset + 224, $col_96, value);
	}


	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber col_97() {
		return getConstNumber(offset + 225, $col_97);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_97(MCNumber value) {
		setConstNumber(offset + 225, $col_97, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_97(int value) {
		setConstNumber(offset + 225, $col_97, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_97(long value) {
		setConstNumber(offset + 225, $col_97, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_97(float value) {
		setConstNumber(offset + 225, $col_97, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_97(double value) {
		setConstNumber(offset + 225, $col_97, value);
	}


	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber col_98() {
		return getConstNumber(offset + 226, $col_98);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_98(MCNumber value) {
		setConstNumber(offset + 226, $col_98, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_98(int value) {
		setConstNumber(offset + 226, $col_98, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_98(long value) {
		setConstNumber(offset + 226, $col_98, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_98(float value) {
		setConstNumber(offset + 226, $col_98, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_98(double value) {
		setConstNumber(offset + 226, $col_98, value);
	}


	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCNumber col_99() {
		return getConstNumber(offset + 227, $col_99);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_99(MCNumber value) {
		setConstNumber(offset + 227, $col_99, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_99(int value) {
		setConstNumber(offset + 227, $col_99, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_99(long value) {
		setConstNumber(offset + 227, $col_99, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_99(float value) {
		setConstNumber(offset + 227, $col_99, value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_99(double value) {
		setConstNumber(offset + 227, $col_99, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 228, $ttl);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 228, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 228, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 228, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 228, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 228, $ttl, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($elm.equalsIgnoreCase(name)) {
			return elm();
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			return elm_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			return key_idx();
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			return elm_no();
		}
		if ($col_00.equalsIgnoreCase(name)) {
			return col_00();
		}
		if ($col_01.equalsIgnoreCase(name)) {
			return col_01();
		}
		if ($col_02.equalsIgnoreCase(name)) {
			return col_02();
		}
		if ($col_03.equalsIgnoreCase(name)) {
			return col_03();
		}
		if ($col_04.equalsIgnoreCase(name)) {
			return col_04();
		}
		if ($col_05.equalsIgnoreCase(name)) {
			return col_05();
		}
		if ($col_06.equalsIgnoreCase(name)) {
			return col_06();
		}
		if ($col_07.equalsIgnoreCase(name)) {
			return col_07();
		}
		if ($col_08.equalsIgnoreCase(name)) {
			return col_08();
		}
		if ($col_09.equalsIgnoreCase(name)) {
			return col_09();
		}
		if ($col_10.equalsIgnoreCase(name)) {
			return col_10();
		}
		if ($col_11.equalsIgnoreCase(name)) {
			return col_11();
		}
		if ($col_12.equalsIgnoreCase(name)) {
			return col_12();
		}
		if ($col_13.equalsIgnoreCase(name)) {
			return col_13();
		}
		if ($col_14.equalsIgnoreCase(name)) {
			return col_14();
		}
		if ($col_15.equalsIgnoreCase(name)) {
			return col_15();
		}
		if ($col_16.equalsIgnoreCase(name)) {
			return col_16();
		}
		if ($col_17.equalsIgnoreCase(name)) {
			return col_17();
		}
		if ($col_18.equalsIgnoreCase(name)) {
			return col_18();
		}
		if ($col_19.equalsIgnoreCase(name)) {
			return col_19();
		}
		if ($col_20.equalsIgnoreCase(name)) {
			return col_20();
		}
		if ($col_21.equalsIgnoreCase(name)) {
			return col_21();
		}
		if ($col_22.equalsIgnoreCase(name)) {
			return col_22();
		}
		if ($col_23.equalsIgnoreCase(name)) {
			return col_23();
		}
		if ($col_24.equalsIgnoreCase(name)) {
			return col_24();
		}
		if ($col_25.equalsIgnoreCase(name)) {
			return col_25();
		}
		if ($col_26.equalsIgnoreCase(name)) {
			return col_26();
		}
		if ($col_27.equalsIgnoreCase(name)) {
			return col_27();
		}
		if ($col_28.equalsIgnoreCase(name)) {
			return col_28();
		}
		if ($col_29.equalsIgnoreCase(name)) {
			return col_29();
		}
		if ($col_30.equalsIgnoreCase(name)) {
			return col_30();
		}
		if ($col_31.equalsIgnoreCase(name)) {
			return col_31();
		}
		if ($col_32.equalsIgnoreCase(name)) {
			return col_32();
		}
		if ($col_33.equalsIgnoreCase(name)) {
			return col_33();
		}
		if ($col_34.equalsIgnoreCase(name)) {
			return col_34();
		}
		if ($col_35.equalsIgnoreCase(name)) {
			return col_35();
		}
		if ($col_36.equalsIgnoreCase(name)) {
			return col_36();
		}
		if ($col_37.equalsIgnoreCase(name)) {
			return col_37();
		}
		if ($col_38.equalsIgnoreCase(name)) {
			return col_38();
		}
		if ($col_39.equalsIgnoreCase(name)) {
			return col_39();
		}
		if ($col_40.equalsIgnoreCase(name)) {
			return col_40();
		}
		if ($col_41.equalsIgnoreCase(name)) {
			return col_41();
		}
		if ($col_42.equalsIgnoreCase(name)) {
			return col_42();
		}
		if ($col_43.equalsIgnoreCase(name)) {
			return col_43();
		}
		if ($col_44.equalsIgnoreCase(name)) {
			return col_44();
		}
		if ($col_45.equalsIgnoreCase(name)) {
			return col_45();
		}
		if ($col_46.equalsIgnoreCase(name)) {
			return col_46();
		}
		if ($col_47.equalsIgnoreCase(name)) {
			return col_47();
		}
		if ($col_48.equalsIgnoreCase(name)) {
			return col_48();
		}
		if ($col_49.equalsIgnoreCase(name)) {
			return col_49();
		}
		if ($col_50.equalsIgnoreCase(name)) {
			return col_50();
		}
		if ($col_51.equalsIgnoreCase(name)) {
			return col_51();
		}
		if ($col_52.equalsIgnoreCase(name)) {
			return col_52();
		}
		if ($col_53.equalsIgnoreCase(name)) {
			return col_53();
		}
		if ($col_54.equalsIgnoreCase(name)) {
			return col_54();
		}
		if ($col_55.equalsIgnoreCase(name)) {
			return col_55();
		}
		if ($col_56.equalsIgnoreCase(name)) {
			return col_56();
		}
		if ($col_57.equalsIgnoreCase(name)) {
			return col_57();
		}
		if ($col_58.equalsIgnoreCase(name)) {
			return col_58();
		}
		if ($col_59.equalsIgnoreCase(name)) {
			return col_59();
		}
		if ($col_60.equalsIgnoreCase(name)) {
			return col_60();
		}
		if ($col_61.equalsIgnoreCase(name)) {
			return col_61();
		}
		if ($col_62.equalsIgnoreCase(name)) {
			return col_62();
		}
		if ($col_63.equalsIgnoreCase(name)) {
			return col_63();
		}
		if ($col_64.equalsIgnoreCase(name)) {
			return col_64();
		}
		if ($col_65.equalsIgnoreCase(name)) {
			return col_65();
		}
		if ($col_66.equalsIgnoreCase(name)) {
			return col_66();
		}
		if ($col_67.equalsIgnoreCase(name)) {
			return col_67();
		}
		if ($col_68.equalsIgnoreCase(name)) {
			return col_68();
		}
		if ($col_69.equalsIgnoreCase(name)) {
			return col_69();
		}
		if ($col_70.equalsIgnoreCase(name)) {
			return col_70();
		}
		if ($col_71.equalsIgnoreCase(name)) {
			return col_71();
		}
		if ($col_72.equalsIgnoreCase(name)) {
			return col_72();
		}
		if ($col_73.equalsIgnoreCase(name)) {
			return col_73();
		}
		if ($col_74.equalsIgnoreCase(name)) {
			return col_74();
		}
		if ($col_75.equalsIgnoreCase(name)) {
			return col_75();
		}
		if ($col_76.equalsIgnoreCase(name)) {
			return col_76();
		}
		if ($col_77.equalsIgnoreCase(name)) {
			return col_77();
		}
		if ($col_78.equalsIgnoreCase(name)) {
			return col_78();
		}
		if ($col_79.equalsIgnoreCase(name)) {
			return col_79();
		}
		if ($col_80.equalsIgnoreCase(name)) {
			return col_80();
		}
		if ($col_81.equalsIgnoreCase(name)) {
			return col_81();
		}
		if ($col_82.equalsIgnoreCase(name)) {
			return col_82();
		}
		if ($col_83.equalsIgnoreCase(name)) {
			return col_83();
		}
		if ($col_84.equalsIgnoreCase(name)) {
			return col_84();
		}
		if ($col_85.equalsIgnoreCase(name)) {
			return col_85();
		}
		if ($col_86.equalsIgnoreCase(name)) {
			return col_86();
		}
		if ($col_87.equalsIgnoreCase(name)) {
			return col_87();
		}
		if ($col_88.equalsIgnoreCase(name)) {
			return col_88();
		}
		if ($col_89.equalsIgnoreCase(name)) {
			return col_89();
		}
		if ($col_90.equalsIgnoreCase(name)) {
			return col_90();
		}
		if ($col_91.equalsIgnoreCase(name)) {
			return col_91();
		}
		if ($col_92.equalsIgnoreCase(name)) {
			return col_92();
		}
		if ($col_93.equalsIgnoreCase(name)) {
			return col_93();
		}
		if ($col_94.equalsIgnoreCase(name)) {
			return col_94();
		}
		if ($col_95.equalsIgnoreCase(name)) {
			return col_95();
		}
		if ($col_96.equalsIgnoreCase(name)) {
			return col_96();
		}
		if ($col_97.equalsIgnoreCase(name)) {
			return col_97();
		}
		if ($col_98.equalsIgnoreCase(name)) {
			return col_98();
		}
		if ($col_99.equalsIgnoreCase(name)) {
			return col_99();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($elm.equalsIgnoreCase(name)) {
			return elm();
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			return elm_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			return key_idx();
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			return elm_no();
		}
		if ($col_00.equalsIgnoreCase(name)) {
			return col_00();
		}
		if ($col_01.equalsIgnoreCase(name)) {
			return col_01();
		}
		if ($col_02.equalsIgnoreCase(name)) {
			return col_02();
		}
		if ($col_03.equalsIgnoreCase(name)) {
			return col_03();
		}
		if ($col_04.equalsIgnoreCase(name)) {
			return col_04();
		}
		if ($col_05.equalsIgnoreCase(name)) {
			return col_05();
		}
		if ($col_06.equalsIgnoreCase(name)) {
			return col_06();
		}
		if ($col_07.equalsIgnoreCase(name)) {
			return col_07();
		}
		if ($col_08.equalsIgnoreCase(name)) {
			return col_08();
		}
		if ($col_09.equalsIgnoreCase(name)) {
			return col_09();
		}
		if ($col_10.equalsIgnoreCase(name)) {
			return col_10();
		}
		if ($col_11.equalsIgnoreCase(name)) {
			return col_11();
		}
		if ($col_12.equalsIgnoreCase(name)) {
			return col_12();
		}
		if ($col_13.equalsIgnoreCase(name)) {
			return col_13();
		}
		if ($col_14.equalsIgnoreCase(name)) {
			return col_14();
		}
		if ($col_15.equalsIgnoreCase(name)) {
			return col_15();
		}
		if ($col_16.equalsIgnoreCase(name)) {
			return col_16();
		}
		if ($col_17.equalsIgnoreCase(name)) {
			return col_17();
		}
		if ($col_18.equalsIgnoreCase(name)) {
			return col_18();
		}
		if ($col_19.equalsIgnoreCase(name)) {
			return col_19();
		}
		if ($col_20.equalsIgnoreCase(name)) {
			return col_20();
		}
		if ($col_21.equalsIgnoreCase(name)) {
			return col_21();
		}
		if ($col_22.equalsIgnoreCase(name)) {
			return col_22();
		}
		if ($col_23.equalsIgnoreCase(name)) {
			return col_23();
		}
		if ($col_24.equalsIgnoreCase(name)) {
			return col_24();
		}
		if ($col_25.equalsIgnoreCase(name)) {
			return col_25();
		}
		if ($col_26.equalsIgnoreCase(name)) {
			return col_26();
		}
		if ($col_27.equalsIgnoreCase(name)) {
			return col_27();
		}
		if ($col_28.equalsIgnoreCase(name)) {
			return col_28();
		}
		if ($col_29.equalsIgnoreCase(name)) {
			return col_29();
		}
		if ($col_30.equalsIgnoreCase(name)) {
			return col_30();
		}
		if ($col_31.equalsIgnoreCase(name)) {
			return col_31();
		}
		if ($col_32.equalsIgnoreCase(name)) {
			return col_32();
		}
		if ($col_33.equalsIgnoreCase(name)) {
			return col_33();
		}
		if ($col_34.equalsIgnoreCase(name)) {
			return col_34();
		}
		if ($col_35.equalsIgnoreCase(name)) {
			return col_35();
		}
		if ($col_36.equalsIgnoreCase(name)) {
			return col_36();
		}
		if ($col_37.equalsIgnoreCase(name)) {
			return col_37();
		}
		if ($col_38.equalsIgnoreCase(name)) {
			return col_38();
		}
		if ($col_39.equalsIgnoreCase(name)) {
			return col_39();
		}
		if ($col_40.equalsIgnoreCase(name)) {
			return col_40();
		}
		if ($col_41.equalsIgnoreCase(name)) {
			return col_41();
		}
		if ($col_42.equalsIgnoreCase(name)) {
			return col_42();
		}
		if ($col_43.equalsIgnoreCase(name)) {
			return col_43();
		}
		if ($col_44.equalsIgnoreCase(name)) {
			return col_44();
		}
		if ($col_45.equalsIgnoreCase(name)) {
			return col_45();
		}
		if ($col_46.equalsIgnoreCase(name)) {
			return col_46();
		}
		if ($col_47.equalsIgnoreCase(name)) {
			return col_47();
		}
		if ($col_48.equalsIgnoreCase(name)) {
			return col_48();
		}
		if ($col_49.equalsIgnoreCase(name)) {
			return col_49();
		}
		if ($col_50.equalsIgnoreCase(name)) {
			return col_50();
		}
		if ($col_51.equalsIgnoreCase(name)) {
			return col_51();
		}
		if ($col_52.equalsIgnoreCase(name)) {
			return col_52();
		}
		if ($col_53.equalsIgnoreCase(name)) {
			return col_53();
		}
		if ($col_54.equalsIgnoreCase(name)) {
			return col_54();
		}
		if ($col_55.equalsIgnoreCase(name)) {
			return col_55();
		}
		if ($col_56.equalsIgnoreCase(name)) {
			return col_56();
		}
		if ($col_57.equalsIgnoreCase(name)) {
			return col_57();
		}
		if ($col_58.equalsIgnoreCase(name)) {
			return col_58();
		}
		if ($col_59.equalsIgnoreCase(name)) {
			return col_59();
		}
		if ($col_60.equalsIgnoreCase(name)) {
			return col_60();
		}
		if ($col_61.equalsIgnoreCase(name)) {
			return col_61();
		}
		if ($col_62.equalsIgnoreCase(name)) {
			return col_62();
		}
		if ($col_63.equalsIgnoreCase(name)) {
			return col_63();
		}
		if ($col_64.equalsIgnoreCase(name)) {
			return col_64();
		}
		if ($col_65.equalsIgnoreCase(name)) {
			return col_65();
		}
		if ($col_66.equalsIgnoreCase(name)) {
			return col_66();
		}
		if ($col_67.equalsIgnoreCase(name)) {
			return col_67();
		}
		if ($col_68.equalsIgnoreCase(name)) {
			return col_68();
		}
		if ($col_69.equalsIgnoreCase(name)) {
			return col_69();
		}
		if ($col_70.equalsIgnoreCase(name)) {
			return col_70();
		}
		if ($col_71.equalsIgnoreCase(name)) {
			return col_71();
		}
		if ($col_72.equalsIgnoreCase(name)) {
			return col_72();
		}
		if ($col_73.equalsIgnoreCase(name)) {
			return col_73();
		}
		if ($col_74.equalsIgnoreCase(name)) {
			return col_74();
		}
		if ($col_75.equalsIgnoreCase(name)) {
			return col_75();
		}
		if ($col_76.equalsIgnoreCase(name)) {
			return col_76();
		}
		if ($col_77.equalsIgnoreCase(name)) {
			return col_77();
		}
		if ($col_78.equalsIgnoreCase(name)) {
			return col_78();
		}
		if ($col_79.equalsIgnoreCase(name)) {
			return col_79();
		}
		if ($col_80.equalsIgnoreCase(name)) {
			return col_80();
		}
		if ($col_81.equalsIgnoreCase(name)) {
			return col_81();
		}
		if ($col_82.equalsIgnoreCase(name)) {
			return col_82();
		}
		if ($col_83.equalsIgnoreCase(name)) {
			return col_83();
		}
		if ($col_84.equalsIgnoreCase(name)) {
			return col_84();
		}
		if ($col_85.equalsIgnoreCase(name)) {
			return col_85();
		}
		if ($col_86.equalsIgnoreCase(name)) {
			return col_86();
		}
		if ($col_87.equalsIgnoreCase(name)) {
			return col_87();
		}
		if ($col_88.equalsIgnoreCase(name)) {
			return col_88();
		}
		if ($col_89.equalsIgnoreCase(name)) {
			return col_89();
		}
		if ($col_90.equalsIgnoreCase(name)) {
			return col_90();
		}
		if ($col_91.equalsIgnoreCase(name)) {
			return col_91();
		}
		if ($col_92.equalsIgnoreCase(name)) {
			return col_92();
		}
		if ($col_93.equalsIgnoreCase(name)) {
			return col_93();
		}
		if ($col_94.equalsIgnoreCase(name)) {
			return col_94();
		}
		if ($col_95.equalsIgnoreCase(name)) {
			return col_95();
		}
		if ($col_96.equalsIgnoreCase(name)) {
			return col_96();
		}
		if ($col_97.equalsIgnoreCase(name)) {
			return col_97();
		}
		if ($col_98.equalsIgnoreCase(name)) {
			return col_98();
		}
		if ($col_99.equalsIgnoreCase(name)) {
			return col_99();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
		if ($elm.equalsIgnoreCase(name)) {
			elm(value);
			return;
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			elm_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_18.equalsIgnoreCase(name)) {
			col_18(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_20.equalsIgnoreCase(name)) {
			col_20(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_22.equalsIgnoreCase(name)) {
			col_22(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		if ($col_24.equalsIgnoreCase(name)) {
			col_24(value);
			return;
		}
		if ($col_25.equalsIgnoreCase(name)) {
			col_25(value);
			return;
		}
		if ($col_26.equalsIgnoreCase(name)) {
			col_26(value);
			return;
		}
		if ($col_27.equalsIgnoreCase(name)) {
			col_27(value);
			return;
		}
		if ($col_28.equalsIgnoreCase(name)) {
			col_28(value);
			return;
		}
		if ($col_29.equalsIgnoreCase(name)) {
			col_29(value);
			return;
		}
		if ($col_30.equalsIgnoreCase(name)) {
			col_30(value);
			return;
		}
		if ($col_31.equalsIgnoreCase(name)) {
			col_31(value);
			return;
		}
		if ($col_32.equalsIgnoreCase(name)) {
			col_32(value);
			return;
		}
		if ($col_33.equalsIgnoreCase(name)) {
			col_33(value);
			return;
		}
		if ($col_34.equalsIgnoreCase(name)) {
			col_34(value);
			return;
		}
		if ($col_35.equalsIgnoreCase(name)) {
			col_35(value);
			return;
		}
		if ($col_36.equalsIgnoreCase(name)) {
			col_36(value);
			return;
		}
		if ($col_37.equalsIgnoreCase(name)) {
			col_37(value);
			return;
		}
		if ($col_38.equalsIgnoreCase(name)) {
			col_38(value);
			return;
		}
		if ($col_39.equalsIgnoreCase(name)) {
			col_39(value);
			return;
		}
		if ($col_40.equalsIgnoreCase(name)) {
			col_40(value);
			return;
		}
		if ($col_41.equalsIgnoreCase(name)) {
			col_41(value);
			return;
		}
		if ($col_42.equalsIgnoreCase(name)) {
			col_42(value);
			return;
		}
		if ($col_43.equalsIgnoreCase(name)) {
			col_43(value);
			return;
		}
		if ($col_44.equalsIgnoreCase(name)) {
			col_44(value);
			return;
		}
		if ($col_45.equalsIgnoreCase(name)) {
			col_45(value);
			return;
		}
		if ($col_46.equalsIgnoreCase(name)) {
			col_46(value);
			return;
		}
		if ($col_47.equalsIgnoreCase(name)) {
			col_47(value);
			return;
		}
		if ($col_48.equalsIgnoreCase(name)) {
			col_48(value);
			return;
		}
		if ($col_49.equalsIgnoreCase(name)) {
			col_49(value);
			return;
		}
		if ($col_50.equalsIgnoreCase(name)) {
			col_50(value);
			return;
		}
		if ($col_51.equalsIgnoreCase(name)) {
			col_51(value);
			return;
		}
		if ($col_52.equalsIgnoreCase(name)) {
			col_52(value);
			return;
		}
		if ($col_53.equalsIgnoreCase(name)) {
			col_53(value);
			return;
		}
		if ($col_54.equalsIgnoreCase(name)) {
			col_54(value);
			return;
		}
		if ($col_55.equalsIgnoreCase(name)) {
			col_55(value);
			return;
		}
		if ($col_56.equalsIgnoreCase(name)) {
			col_56(value);
			return;
		}
		if ($col_57.equalsIgnoreCase(name)) {
			col_57(value);
			return;
		}
		if ($col_58.equalsIgnoreCase(name)) {
			col_58(value);
			return;
		}
		if ($col_59.equalsIgnoreCase(name)) {
			col_59(value);
			return;
		}
		if ($col_60.equalsIgnoreCase(name)) {
			col_60(value);
			return;
		}
		if ($col_61.equalsIgnoreCase(name)) {
			col_61(value);
			return;
		}
		if ($col_62.equalsIgnoreCase(name)) {
			col_62(value);
			return;
		}
		if ($col_63.equalsIgnoreCase(name)) {
			col_63(value);
			return;
		}
		if ($col_64.equalsIgnoreCase(name)) {
			col_64(value);
			return;
		}
		if ($col_65.equalsIgnoreCase(name)) {
			col_65(value);
			return;
		}
		if ($col_66.equalsIgnoreCase(name)) {
			col_66(value);
			return;
		}
		if ($col_67.equalsIgnoreCase(name)) {
			col_67(value);
			return;
		}
		if ($col_68.equalsIgnoreCase(name)) {
			col_68(value);
			return;
		}
		if ($col_69.equalsIgnoreCase(name)) {
			col_69(value);
			return;
		}
		if ($col_70.equalsIgnoreCase(name)) {
			col_70(value);
			return;
		}
		if ($col_71.equalsIgnoreCase(name)) {
			col_71(value);
			return;
		}
		if ($col_72.equalsIgnoreCase(name)) {
			col_72(value);
			return;
		}
		if ($col_73.equalsIgnoreCase(name)) {
			col_73(value);
			return;
		}
		if ($col_74.equalsIgnoreCase(name)) {
			col_74(value);
			return;
		}
		if ($col_75.equalsIgnoreCase(name)) {
			col_75(value);
			return;
		}
		if ($col_76.equalsIgnoreCase(name)) {
			col_76(value);
			return;
		}
		if ($col_77.equalsIgnoreCase(name)) {
			col_77(value);
			return;
		}
		if ($col_78.equalsIgnoreCase(name)) {
			col_78(value);
			return;
		}
		if ($col_79.equalsIgnoreCase(name)) {
			col_79(value);
			return;
		}
		if ($col_80.equalsIgnoreCase(name)) {
			col_80(value);
			return;
		}
		if ($col_81.equalsIgnoreCase(name)) {
			col_81(value);
			return;
		}
		if ($col_82.equalsIgnoreCase(name)) {
			col_82(value);
			return;
		}
		if ($col_83.equalsIgnoreCase(name)) {
			col_83(value);
			return;
		}
		if ($col_84.equalsIgnoreCase(name)) {
			col_84(value);
			return;
		}
		if ($col_85.equalsIgnoreCase(name)) {
			col_85(value);
			return;
		}
		if ($col_86.equalsIgnoreCase(name)) {
			col_86(value);
			return;
		}
		if ($col_87.equalsIgnoreCase(name)) {
			col_87(value);
			return;
		}
		if ($col_88.equalsIgnoreCase(name)) {
			col_88(value);
			return;
		}
		if ($col_89.equalsIgnoreCase(name)) {
			col_89(value);
			return;
		}
		if ($col_90.equalsIgnoreCase(name)) {
			col_90(value);
			return;
		}
		if ($col_91.equalsIgnoreCase(name)) {
			col_91(value);
			return;
		}
		if ($col_92.equalsIgnoreCase(name)) {
			col_92(value);
			return;
		}
		if ($col_93.equalsIgnoreCase(name)) {
			col_93(value);
			return;
		}
		if ($col_94.equalsIgnoreCase(name)) {
			col_94(value);
			return;
		}
		if ($col_95.equalsIgnoreCase(name)) {
			col_95(value);
			return;
		}
		if ($col_96.equalsIgnoreCase(name)) {
			col_96(value);
			return;
		}
		if ($col_97.equalsIgnoreCase(name)) {
			col_97(value);
			return;
		}
		if ($col_98.equalsIgnoreCase(name)) {
			col_98(value);
			return;
		}
		if ($col_99.equalsIgnoreCase(name)) {
			col_99(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_18.equalsIgnoreCase(name)) {
			col_18(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_20.equalsIgnoreCase(name)) {
			col_20(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_22.equalsIgnoreCase(name)) {
			col_22(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		if ($col_24.equalsIgnoreCase(name)) {
			col_24(value);
			return;
		}
		if ($col_25.equalsIgnoreCase(name)) {
			col_25(value);
			return;
		}
		if ($col_26.equalsIgnoreCase(name)) {
			col_26(value);
			return;
		}
		if ($col_27.equalsIgnoreCase(name)) {
			col_27(value);
			return;
		}
		if ($col_28.equalsIgnoreCase(name)) {
			col_28(value);
			return;
		}
		if ($col_29.equalsIgnoreCase(name)) {
			col_29(value);
			return;
		}
		if ($col_30.equalsIgnoreCase(name)) {
			col_30(value);
			return;
		}
		if ($col_31.equalsIgnoreCase(name)) {
			col_31(value);
			return;
		}
		if ($col_32.equalsIgnoreCase(name)) {
			col_32(value);
			return;
		}
		if ($col_33.equalsIgnoreCase(name)) {
			col_33(value);
			return;
		}
		if ($col_34.equalsIgnoreCase(name)) {
			col_34(value);
			return;
		}
		if ($col_35.equalsIgnoreCase(name)) {
			col_35(value);
			return;
		}
		if ($col_36.equalsIgnoreCase(name)) {
			col_36(value);
			return;
		}
		if ($col_37.equalsIgnoreCase(name)) {
			col_37(value);
			return;
		}
		if ($col_38.equalsIgnoreCase(name)) {
			col_38(value);
			return;
		}
		if ($col_39.equalsIgnoreCase(name)) {
			col_39(value);
			return;
		}
		if ($col_40.equalsIgnoreCase(name)) {
			col_40(value);
			return;
		}
		if ($col_41.equalsIgnoreCase(name)) {
			col_41(value);
			return;
		}
		if ($col_42.equalsIgnoreCase(name)) {
			col_42(value);
			return;
		}
		if ($col_43.equalsIgnoreCase(name)) {
			col_43(value);
			return;
		}
		if ($col_44.equalsIgnoreCase(name)) {
			col_44(value);
			return;
		}
		if ($col_45.equalsIgnoreCase(name)) {
			col_45(value);
			return;
		}
		if ($col_46.equalsIgnoreCase(name)) {
			col_46(value);
			return;
		}
		if ($col_47.equalsIgnoreCase(name)) {
			col_47(value);
			return;
		}
		if ($col_48.equalsIgnoreCase(name)) {
			col_48(value);
			return;
		}
		if ($col_49.equalsIgnoreCase(name)) {
			col_49(value);
			return;
		}
		if ($col_50.equalsIgnoreCase(name)) {
			col_50(value);
			return;
		}
		if ($col_51.equalsIgnoreCase(name)) {
			col_51(value);
			return;
		}
		if ($col_52.equalsIgnoreCase(name)) {
			col_52(value);
			return;
		}
		if ($col_53.equalsIgnoreCase(name)) {
			col_53(value);
			return;
		}
		if ($col_54.equalsIgnoreCase(name)) {
			col_54(value);
			return;
		}
		if ($col_55.equalsIgnoreCase(name)) {
			col_55(value);
			return;
		}
		if ($col_56.equalsIgnoreCase(name)) {
			col_56(value);
			return;
		}
		if ($col_57.equalsIgnoreCase(name)) {
			col_57(value);
			return;
		}
		if ($col_58.equalsIgnoreCase(name)) {
			col_58(value);
			return;
		}
		if ($col_59.equalsIgnoreCase(name)) {
			col_59(value);
			return;
		}
		if ($col_60.equalsIgnoreCase(name)) {
			col_60(value);
			return;
		}
		if ($col_61.equalsIgnoreCase(name)) {
			col_61(value);
			return;
		}
		if ($col_62.equalsIgnoreCase(name)) {
			col_62(value);
			return;
		}
		if ($col_63.equalsIgnoreCase(name)) {
			col_63(value);
			return;
		}
		if ($col_64.equalsIgnoreCase(name)) {
			col_64(value);
			return;
		}
		if ($col_65.equalsIgnoreCase(name)) {
			col_65(value);
			return;
		}
		if ($col_66.equalsIgnoreCase(name)) {
			col_66(value);
			return;
		}
		if ($col_67.equalsIgnoreCase(name)) {
			col_67(value);
			return;
		}
		if ($col_68.equalsIgnoreCase(name)) {
			col_68(value);
			return;
		}
		if ($col_69.equalsIgnoreCase(name)) {
			col_69(value);
			return;
		}
		if ($col_70.equalsIgnoreCase(name)) {
			col_70(value);
			return;
		}
		if ($col_71.equalsIgnoreCase(name)) {
			col_71(value);
			return;
		}
		if ($col_72.equalsIgnoreCase(name)) {
			col_72(value);
			return;
		}
		if ($col_73.equalsIgnoreCase(name)) {
			col_73(value);
			return;
		}
		if ($col_74.equalsIgnoreCase(name)) {
			col_74(value);
			return;
		}
		if ($col_75.equalsIgnoreCase(name)) {
			col_75(value);
			return;
		}
		if ($col_76.equalsIgnoreCase(name)) {
			col_76(value);
			return;
		}
		if ($col_77.equalsIgnoreCase(name)) {
			col_77(value);
			return;
		}
		if ($col_78.equalsIgnoreCase(name)) {
			col_78(value);
			return;
		}
		if ($col_79.equalsIgnoreCase(name)) {
			col_79(value);
			return;
		}
		if ($col_80.equalsIgnoreCase(name)) {
			col_80(value);
			return;
		}
		if ($col_81.equalsIgnoreCase(name)) {
			col_81(value);
			return;
		}
		if ($col_82.equalsIgnoreCase(name)) {
			col_82(value);
			return;
		}
		if ($col_83.equalsIgnoreCase(name)) {
			col_83(value);
			return;
		}
		if ($col_84.equalsIgnoreCase(name)) {
			col_84(value);
			return;
		}
		if ($col_85.equalsIgnoreCase(name)) {
			col_85(value);
			return;
		}
		if ($col_86.equalsIgnoreCase(name)) {
			col_86(value);
			return;
		}
		if ($col_87.equalsIgnoreCase(name)) {
			col_87(value);
			return;
		}
		if ($col_88.equalsIgnoreCase(name)) {
			col_88(value);
			return;
		}
		if ($col_89.equalsIgnoreCase(name)) {
			col_89(value);
			return;
		}
		if ($col_90.equalsIgnoreCase(name)) {
			col_90(value);
			return;
		}
		if ($col_91.equalsIgnoreCase(name)) {
			col_91(value);
			return;
		}
		if ($col_92.equalsIgnoreCase(name)) {
			col_92(value);
			return;
		}
		if ($col_93.equalsIgnoreCase(name)) {
			col_93(value);
			return;
		}
		if ($col_94.equalsIgnoreCase(name)) {
			col_94(value);
			return;
		}
		if ($col_95.equalsIgnoreCase(name)) {
			col_95(value);
			return;
		}
		if ($col_96.equalsIgnoreCase(name)) {
			col_96(value);
			return;
		}
		if ($col_97.equalsIgnoreCase(name)) {
			col_97(value);
			return;
		}
		if ($col_98.equalsIgnoreCase(name)) {
			col_98(value);
			return;
		}
		if ($col_99.equalsIgnoreCase(name)) {
			col_99(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_18.equalsIgnoreCase(name)) {
			col_18(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_20.equalsIgnoreCase(name)) {
			col_20(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_22.equalsIgnoreCase(name)) {
			col_22(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		if ($col_24.equalsIgnoreCase(name)) {
			col_24(value);
			return;
		}
		if ($col_25.equalsIgnoreCase(name)) {
			col_25(value);
			return;
		}
		if ($col_26.equalsIgnoreCase(name)) {
			col_26(value);
			return;
		}
		if ($col_27.equalsIgnoreCase(name)) {
			col_27(value);
			return;
		}
		if ($col_28.equalsIgnoreCase(name)) {
			col_28(value);
			return;
		}
		if ($col_29.equalsIgnoreCase(name)) {
			col_29(value);
			return;
		}
		if ($col_30.equalsIgnoreCase(name)) {
			col_30(value);
			return;
		}
		if ($col_31.equalsIgnoreCase(name)) {
			col_31(value);
			return;
		}
		if ($col_32.equalsIgnoreCase(name)) {
			col_32(value);
			return;
		}
		if ($col_33.equalsIgnoreCase(name)) {
			col_33(value);
			return;
		}
		if ($col_34.equalsIgnoreCase(name)) {
			col_34(value);
			return;
		}
		if ($col_35.equalsIgnoreCase(name)) {
			col_35(value);
			return;
		}
		if ($col_36.equalsIgnoreCase(name)) {
			col_36(value);
			return;
		}
		if ($col_37.equalsIgnoreCase(name)) {
			col_37(value);
			return;
		}
		if ($col_38.equalsIgnoreCase(name)) {
			col_38(value);
			return;
		}
		if ($col_39.equalsIgnoreCase(name)) {
			col_39(value);
			return;
		}
		if ($col_40.equalsIgnoreCase(name)) {
			col_40(value);
			return;
		}
		if ($col_41.equalsIgnoreCase(name)) {
			col_41(value);
			return;
		}
		if ($col_42.equalsIgnoreCase(name)) {
			col_42(value);
			return;
		}
		if ($col_43.equalsIgnoreCase(name)) {
			col_43(value);
			return;
		}
		if ($col_44.equalsIgnoreCase(name)) {
			col_44(value);
			return;
		}
		if ($col_45.equalsIgnoreCase(name)) {
			col_45(value);
			return;
		}
		if ($col_46.equalsIgnoreCase(name)) {
			col_46(value);
			return;
		}
		if ($col_47.equalsIgnoreCase(name)) {
			col_47(value);
			return;
		}
		if ($col_48.equalsIgnoreCase(name)) {
			col_48(value);
			return;
		}
		if ($col_49.equalsIgnoreCase(name)) {
			col_49(value);
			return;
		}
		if ($col_50.equalsIgnoreCase(name)) {
			col_50(value);
			return;
		}
		if ($col_51.equalsIgnoreCase(name)) {
			col_51(value);
			return;
		}
		if ($col_52.equalsIgnoreCase(name)) {
			col_52(value);
			return;
		}
		if ($col_53.equalsIgnoreCase(name)) {
			col_53(value);
			return;
		}
		if ($col_54.equalsIgnoreCase(name)) {
			col_54(value);
			return;
		}
		if ($col_55.equalsIgnoreCase(name)) {
			col_55(value);
			return;
		}
		if ($col_56.equalsIgnoreCase(name)) {
			col_56(value);
			return;
		}
		if ($col_57.equalsIgnoreCase(name)) {
			col_57(value);
			return;
		}
		if ($col_58.equalsIgnoreCase(name)) {
			col_58(value);
			return;
		}
		if ($col_59.equalsIgnoreCase(name)) {
			col_59(value);
			return;
		}
		if ($col_60.equalsIgnoreCase(name)) {
			col_60(value);
			return;
		}
		if ($col_61.equalsIgnoreCase(name)) {
			col_61(value);
			return;
		}
		if ($col_62.equalsIgnoreCase(name)) {
			col_62(value);
			return;
		}
		if ($col_63.equalsIgnoreCase(name)) {
			col_63(value);
			return;
		}
		if ($col_64.equalsIgnoreCase(name)) {
			col_64(value);
			return;
		}
		if ($col_65.equalsIgnoreCase(name)) {
			col_65(value);
			return;
		}
		if ($col_66.equalsIgnoreCase(name)) {
			col_66(value);
			return;
		}
		if ($col_67.equalsIgnoreCase(name)) {
			col_67(value);
			return;
		}
		if ($col_68.equalsIgnoreCase(name)) {
			col_68(value);
			return;
		}
		if ($col_69.equalsIgnoreCase(name)) {
			col_69(value);
			return;
		}
		if ($col_70.equalsIgnoreCase(name)) {
			col_70(value);
			return;
		}
		if ($col_71.equalsIgnoreCase(name)) {
			col_71(value);
			return;
		}
		if ($col_72.equalsIgnoreCase(name)) {
			col_72(value);
			return;
		}
		if ($col_73.equalsIgnoreCase(name)) {
			col_73(value);
			return;
		}
		if ($col_74.equalsIgnoreCase(name)) {
			col_74(value);
			return;
		}
		if ($col_75.equalsIgnoreCase(name)) {
			col_75(value);
			return;
		}
		if ($col_76.equalsIgnoreCase(name)) {
			col_76(value);
			return;
		}
		if ($col_77.equalsIgnoreCase(name)) {
			col_77(value);
			return;
		}
		if ($col_78.equalsIgnoreCase(name)) {
			col_78(value);
			return;
		}
		if ($col_79.equalsIgnoreCase(name)) {
			col_79(value);
			return;
		}
		if ($col_80.equalsIgnoreCase(name)) {
			col_80(value);
			return;
		}
		if ($col_81.equalsIgnoreCase(name)) {
			col_81(value);
			return;
		}
		if ($col_82.equalsIgnoreCase(name)) {
			col_82(value);
			return;
		}
		if ($col_83.equalsIgnoreCase(name)) {
			col_83(value);
			return;
		}
		if ($col_84.equalsIgnoreCase(name)) {
			col_84(value);
			return;
		}
		if ($col_85.equalsIgnoreCase(name)) {
			col_85(value);
			return;
		}
		if ($col_86.equalsIgnoreCase(name)) {
			col_86(value);
			return;
		}
		if ($col_87.equalsIgnoreCase(name)) {
			col_87(value);
			return;
		}
		if ($col_88.equalsIgnoreCase(name)) {
			col_88(value);
			return;
		}
		if ($col_89.equalsIgnoreCase(name)) {
			col_89(value);
			return;
		}
		if ($col_90.equalsIgnoreCase(name)) {
			col_90(value);
			return;
		}
		if ($col_91.equalsIgnoreCase(name)) {
			col_91(value);
			return;
		}
		if ($col_92.equalsIgnoreCase(name)) {
			col_92(value);
			return;
		}
		if ($col_93.equalsIgnoreCase(name)) {
			col_93(value);
			return;
		}
		if ($col_94.equalsIgnoreCase(name)) {
			col_94(value);
			return;
		}
		if ($col_95.equalsIgnoreCase(name)) {
			col_95(value);
			return;
		}
		if ($col_96.equalsIgnoreCase(name)) {
			col_96(value);
			return;
		}
		if ($col_97.equalsIgnoreCase(name)) {
			col_97(value);
			return;
		}
		if ($col_98.equalsIgnoreCase(name)) {
			col_98(value);
			return;
		}
		if ($col_99.equalsIgnoreCase(name)) {
			col_99(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_18.equalsIgnoreCase(name)) {
			col_18(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_20.equalsIgnoreCase(name)) {
			col_20(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_22.equalsIgnoreCase(name)) {
			col_22(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		if ($col_24.equalsIgnoreCase(name)) {
			col_24(value);
			return;
		}
		if ($col_25.equalsIgnoreCase(name)) {
			col_25(value);
			return;
		}
		if ($col_26.equalsIgnoreCase(name)) {
			col_26(value);
			return;
		}
		if ($col_27.equalsIgnoreCase(name)) {
			col_27(value);
			return;
		}
		if ($col_28.equalsIgnoreCase(name)) {
			col_28(value);
			return;
		}
		if ($col_29.equalsIgnoreCase(name)) {
			col_29(value);
			return;
		}
		if ($col_30.equalsIgnoreCase(name)) {
			col_30(value);
			return;
		}
		if ($col_31.equalsIgnoreCase(name)) {
			col_31(value);
			return;
		}
		if ($col_32.equalsIgnoreCase(name)) {
			col_32(value);
			return;
		}
		if ($col_33.equalsIgnoreCase(name)) {
			col_33(value);
			return;
		}
		if ($col_34.equalsIgnoreCase(name)) {
			col_34(value);
			return;
		}
		if ($col_35.equalsIgnoreCase(name)) {
			col_35(value);
			return;
		}
		if ($col_36.equalsIgnoreCase(name)) {
			col_36(value);
			return;
		}
		if ($col_37.equalsIgnoreCase(name)) {
			col_37(value);
			return;
		}
		if ($col_38.equalsIgnoreCase(name)) {
			col_38(value);
			return;
		}
		if ($col_39.equalsIgnoreCase(name)) {
			col_39(value);
			return;
		}
		if ($col_40.equalsIgnoreCase(name)) {
			col_40(value);
			return;
		}
		if ($col_41.equalsIgnoreCase(name)) {
			col_41(value);
			return;
		}
		if ($col_42.equalsIgnoreCase(name)) {
			col_42(value);
			return;
		}
		if ($col_43.equalsIgnoreCase(name)) {
			col_43(value);
			return;
		}
		if ($col_44.equalsIgnoreCase(name)) {
			col_44(value);
			return;
		}
		if ($col_45.equalsIgnoreCase(name)) {
			col_45(value);
			return;
		}
		if ($col_46.equalsIgnoreCase(name)) {
			col_46(value);
			return;
		}
		if ($col_47.equalsIgnoreCase(name)) {
			col_47(value);
			return;
		}
		if ($col_48.equalsIgnoreCase(name)) {
			col_48(value);
			return;
		}
		if ($col_49.equalsIgnoreCase(name)) {
			col_49(value);
			return;
		}
		if ($col_50.equalsIgnoreCase(name)) {
			col_50(value);
			return;
		}
		if ($col_51.equalsIgnoreCase(name)) {
			col_51(value);
			return;
		}
		if ($col_52.equalsIgnoreCase(name)) {
			col_52(value);
			return;
		}
		if ($col_53.equalsIgnoreCase(name)) {
			col_53(value);
			return;
		}
		if ($col_54.equalsIgnoreCase(name)) {
			col_54(value);
			return;
		}
		if ($col_55.equalsIgnoreCase(name)) {
			col_55(value);
			return;
		}
		if ($col_56.equalsIgnoreCase(name)) {
			col_56(value);
			return;
		}
		if ($col_57.equalsIgnoreCase(name)) {
			col_57(value);
			return;
		}
		if ($col_58.equalsIgnoreCase(name)) {
			col_58(value);
			return;
		}
		if ($col_59.equalsIgnoreCase(name)) {
			col_59(value);
			return;
		}
		if ($col_60.equalsIgnoreCase(name)) {
			col_60(value);
			return;
		}
		if ($col_61.equalsIgnoreCase(name)) {
			col_61(value);
			return;
		}
		if ($col_62.equalsIgnoreCase(name)) {
			col_62(value);
			return;
		}
		if ($col_63.equalsIgnoreCase(name)) {
			col_63(value);
			return;
		}
		if ($col_64.equalsIgnoreCase(name)) {
			col_64(value);
			return;
		}
		if ($col_65.equalsIgnoreCase(name)) {
			col_65(value);
			return;
		}
		if ($col_66.equalsIgnoreCase(name)) {
			col_66(value);
			return;
		}
		if ($col_67.equalsIgnoreCase(name)) {
			col_67(value);
			return;
		}
		if ($col_68.equalsIgnoreCase(name)) {
			col_68(value);
			return;
		}
		if ($col_69.equalsIgnoreCase(name)) {
			col_69(value);
			return;
		}
		if ($col_70.equalsIgnoreCase(name)) {
			col_70(value);
			return;
		}
		if ($col_71.equalsIgnoreCase(name)) {
			col_71(value);
			return;
		}
		if ($col_72.equalsIgnoreCase(name)) {
			col_72(value);
			return;
		}
		if ($col_73.equalsIgnoreCase(name)) {
			col_73(value);
			return;
		}
		if ($col_74.equalsIgnoreCase(name)) {
			col_74(value);
			return;
		}
		if ($col_75.equalsIgnoreCase(name)) {
			col_75(value);
			return;
		}
		if ($col_76.equalsIgnoreCase(name)) {
			col_76(value);
			return;
		}
		if ($col_77.equalsIgnoreCase(name)) {
			col_77(value);
			return;
		}
		if ($col_78.equalsIgnoreCase(name)) {
			col_78(value);
			return;
		}
		if ($col_79.equalsIgnoreCase(name)) {
			col_79(value);
			return;
		}
		if ($col_80.equalsIgnoreCase(name)) {
			col_80(value);
			return;
		}
		if ($col_81.equalsIgnoreCase(name)) {
			col_81(value);
			return;
		}
		if ($col_82.equalsIgnoreCase(name)) {
			col_82(value);
			return;
		}
		if ($col_83.equalsIgnoreCase(name)) {
			col_83(value);
			return;
		}
		if ($col_84.equalsIgnoreCase(name)) {
			col_84(value);
			return;
		}
		if ($col_85.equalsIgnoreCase(name)) {
			col_85(value);
			return;
		}
		if ($col_86.equalsIgnoreCase(name)) {
			col_86(value);
			return;
		}
		if ($col_87.equalsIgnoreCase(name)) {
			col_87(value);
			return;
		}
		if ($col_88.equalsIgnoreCase(name)) {
			col_88(value);
			return;
		}
		if ($col_89.equalsIgnoreCase(name)) {
			col_89(value);
			return;
		}
		if ($col_90.equalsIgnoreCase(name)) {
			col_90(value);
			return;
		}
		if ($col_91.equalsIgnoreCase(name)) {
			col_91(value);
			return;
		}
		if ($col_92.equalsIgnoreCase(name)) {
			col_92(value);
			return;
		}
		if ($col_93.equalsIgnoreCase(name)) {
			col_93(value);
			return;
		}
		if ($col_94.equalsIgnoreCase(name)) {
			col_94(value);
			return;
		}
		if ($col_95.equalsIgnoreCase(name)) {
			col_95(value);
			return;
		}
		if ($col_96.equalsIgnoreCase(name)) {
			col_96(value);
			return;
		}
		if ($col_97.equalsIgnoreCase(name)) {
			col_97(value);
			return;
		}
		if ($col_98.equalsIgnoreCase(name)) {
			col_98(value);
			return;
		}
		if ($col_99.equalsIgnoreCase(name)) {
			col_99(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_18.equalsIgnoreCase(name)) {
			col_18(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_20.equalsIgnoreCase(name)) {
			col_20(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_22.equalsIgnoreCase(name)) {
			col_22(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		if ($col_24.equalsIgnoreCase(name)) {
			col_24(value);
			return;
		}
		if ($col_25.equalsIgnoreCase(name)) {
			col_25(value);
			return;
		}
		if ($col_26.equalsIgnoreCase(name)) {
			col_26(value);
			return;
		}
		if ($col_27.equalsIgnoreCase(name)) {
			col_27(value);
			return;
		}
		if ($col_28.equalsIgnoreCase(name)) {
			col_28(value);
			return;
		}
		if ($col_29.equalsIgnoreCase(name)) {
			col_29(value);
			return;
		}
		if ($col_30.equalsIgnoreCase(name)) {
			col_30(value);
			return;
		}
		if ($col_31.equalsIgnoreCase(name)) {
			col_31(value);
			return;
		}
		if ($col_32.equalsIgnoreCase(name)) {
			col_32(value);
			return;
		}
		if ($col_33.equalsIgnoreCase(name)) {
			col_33(value);
			return;
		}
		if ($col_34.equalsIgnoreCase(name)) {
			col_34(value);
			return;
		}
		if ($col_35.equalsIgnoreCase(name)) {
			col_35(value);
			return;
		}
		if ($col_36.equalsIgnoreCase(name)) {
			col_36(value);
			return;
		}
		if ($col_37.equalsIgnoreCase(name)) {
			col_37(value);
			return;
		}
		if ($col_38.equalsIgnoreCase(name)) {
			col_38(value);
			return;
		}
		if ($col_39.equalsIgnoreCase(name)) {
			col_39(value);
			return;
		}
		if ($col_40.equalsIgnoreCase(name)) {
			col_40(value);
			return;
		}
		if ($col_41.equalsIgnoreCase(name)) {
			col_41(value);
			return;
		}
		if ($col_42.equalsIgnoreCase(name)) {
			col_42(value);
			return;
		}
		if ($col_43.equalsIgnoreCase(name)) {
			col_43(value);
			return;
		}
		if ($col_44.equalsIgnoreCase(name)) {
			col_44(value);
			return;
		}
		if ($col_45.equalsIgnoreCase(name)) {
			col_45(value);
			return;
		}
		if ($col_46.equalsIgnoreCase(name)) {
			col_46(value);
			return;
		}
		if ($col_47.equalsIgnoreCase(name)) {
			col_47(value);
			return;
		}
		if ($col_48.equalsIgnoreCase(name)) {
			col_48(value);
			return;
		}
		if ($col_49.equalsIgnoreCase(name)) {
			col_49(value);
			return;
		}
		if ($col_50.equalsIgnoreCase(name)) {
			col_50(value);
			return;
		}
		if ($col_51.equalsIgnoreCase(name)) {
			col_51(value);
			return;
		}
		if ($col_52.equalsIgnoreCase(name)) {
			col_52(value);
			return;
		}
		if ($col_53.equalsIgnoreCase(name)) {
			col_53(value);
			return;
		}
		if ($col_54.equalsIgnoreCase(name)) {
			col_54(value);
			return;
		}
		if ($col_55.equalsIgnoreCase(name)) {
			col_55(value);
			return;
		}
		if ($col_56.equalsIgnoreCase(name)) {
			col_56(value);
			return;
		}
		if ($col_57.equalsIgnoreCase(name)) {
			col_57(value);
			return;
		}
		if ($col_58.equalsIgnoreCase(name)) {
			col_58(value);
			return;
		}
		if ($col_59.equalsIgnoreCase(name)) {
			col_59(value);
			return;
		}
		if ($col_60.equalsIgnoreCase(name)) {
			col_60(value);
			return;
		}
		if ($col_61.equalsIgnoreCase(name)) {
			col_61(value);
			return;
		}
		if ($col_62.equalsIgnoreCase(name)) {
			col_62(value);
			return;
		}
		if ($col_63.equalsIgnoreCase(name)) {
			col_63(value);
			return;
		}
		if ($col_64.equalsIgnoreCase(name)) {
			col_64(value);
			return;
		}
		if ($col_65.equalsIgnoreCase(name)) {
			col_65(value);
			return;
		}
		if ($col_66.equalsIgnoreCase(name)) {
			col_66(value);
			return;
		}
		if ($col_67.equalsIgnoreCase(name)) {
			col_67(value);
			return;
		}
		if ($col_68.equalsIgnoreCase(name)) {
			col_68(value);
			return;
		}
		if ($col_69.equalsIgnoreCase(name)) {
			col_69(value);
			return;
		}
		if ($col_70.equalsIgnoreCase(name)) {
			col_70(value);
			return;
		}
		if ($col_71.equalsIgnoreCase(name)) {
			col_71(value);
			return;
		}
		if ($col_72.equalsIgnoreCase(name)) {
			col_72(value);
			return;
		}
		if ($col_73.equalsIgnoreCase(name)) {
			col_73(value);
			return;
		}
		if ($col_74.equalsIgnoreCase(name)) {
			col_74(value);
			return;
		}
		if ($col_75.equalsIgnoreCase(name)) {
			col_75(value);
			return;
		}
		if ($col_76.equalsIgnoreCase(name)) {
			col_76(value);
			return;
		}
		if ($col_77.equalsIgnoreCase(name)) {
			col_77(value);
			return;
		}
		if ($col_78.equalsIgnoreCase(name)) {
			col_78(value);
			return;
		}
		if ($col_79.equalsIgnoreCase(name)) {
			col_79(value);
			return;
		}
		if ($col_80.equalsIgnoreCase(name)) {
			col_80(value);
			return;
		}
		if ($col_81.equalsIgnoreCase(name)) {
			col_81(value);
			return;
		}
		if ($col_82.equalsIgnoreCase(name)) {
			col_82(value);
			return;
		}
		if ($col_83.equalsIgnoreCase(name)) {
			col_83(value);
			return;
		}
		if ($col_84.equalsIgnoreCase(name)) {
			col_84(value);
			return;
		}
		if ($col_85.equalsIgnoreCase(name)) {
			col_85(value);
			return;
		}
		if ($col_86.equalsIgnoreCase(name)) {
			col_86(value);
			return;
		}
		if ($col_87.equalsIgnoreCase(name)) {
			col_87(value);
			return;
		}
		if ($col_88.equalsIgnoreCase(name)) {
			col_88(value);
			return;
		}
		if ($col_89.equalsIgnoreCase(name)) {
			col_89(value);
			return;
		}
		if ($col_90.equalsIgnoreCase(name)) {
			col_90(value);
			return;
		}
		if ($col_91.equalsIgnoreCase(name)) {
			col_91(value);
			return;
		}
		if ($col_92.equalsIgnoreCase(name)) {
			col_92(value);
			return;
		}
		if ($col_93.equalsIgnoreCase(name)) {
			col_93(value);
			return;
		}
		if ($col_94.equalsIgnoreCase(name)) {
			col_94(value);
			return;
		}
		if ($col_95.equalsIgnoreCase(name)) {
			col_95(value);
			return;
		}
		if ($col_96.equalsIgnoreCase(name)) {
			col_96(value);
			return;
		}
		if ($col_97.equalsIgnoreCase(name)) {
			col_97(value);
			return;
		}
		if ($col_98.equalsIgnoreCase(name)) {
			col_98(value);
			return;
		}
		if ($col_99.equalsIgnoreCase(name)) {
			col_99(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
		if ($elm.equalsIgnoreCase(name)) {
			elm(value);
			return;
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			elm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_18.equalsIgnoreCase(name)) {
			col_18(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_20.equalsIgnoreCase(name)) {
			col_20(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_22.equalsIgnoreCase(name)) {
			col_22(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		if ($col_24.equalsIgnoreCase(name)) {
			col_24(value);
			return;
		}
		if ($col_25.equalsIgnoreCase(name)) {
			col_25(value);
			return;
		}
		if ($col_26.equalsIgnoreCase(name)) {
			col_26(value);
			return;
		}
		if ($col_27.equalsIgnoreCase(name)) {
			col_27(value);
			return;
		}
		if ($col_28.equalsIgnoreCase(name)) {
			col_28(value);
			return;
		}
		if ($col_29.equalsIgnoreCase(name)) {
			col_29(value);
			return;
		}
		if ($col_30.equalsIgnoreCase(name)) {
			col_30(value);
			return;
		}
		if ($col_31.equalsIgnoreCase(name)) {
			col_31(value);
			return;
		}
		if ($col_32.equalsIgnoreCase(name)) {
			col_32(value);
			return;
		}
		if ($col_33.equalsIgnoreCase(name)) {
			col_33(value);
			return;
		}
		if ($col_34.equalsIgnoreCase(name)) {
			col_34(value);
			return;
		}
		if ($col_35.equalsIgnoreCase(name)) {
			col_35(value);
			return;
		}
		if ($col_36.equalsIgnoreCase(name)) {
			col_36(value);
			return;
		}
		if ($col_37.equalsIgnoreCase(name)) {
			col_37(value);
			return;
		}
		if ($col_38.equalsIgnoreCase(name)) {
			col_38(value);
			return;
		}
		if ($col_39.equalsIgnoreCase(name)) {
			col_39(value);
			return;
		}
		if ($col_40.equalsIgnoreCase(name)) {
			col_40(value);
			return;
		}
		if ($col_41.equalsIgnoreCase(name)) {
			col_41(value);
			return;
		}
		if ($col_42.equalsIgnoreCase(name)) {
			col_42(value);
			return;
		}
		if ($col_43.equalsIgnoreCase(name)) {
			col_43(value);
			return;
		}
		if ($col_44.equalsIgnoreCase(name)) {
			col_44(value);
			return;
		}
		if ($col_45.equalsIgnoreCase(name)) {
			col_45(value);
			return;
		}
		if ($col_46.equalsIgnoreCase(name)) {
			col_46(value);
			return;
		}
		if ($col_47.equalsIgnoreCase(name)) {
			col_47(value);
			return;
		}
		if ($col_48.equalsIgnoreCase(name)) {
			col_48(value);
			return;
		}
		if ($col_49.equalsIgnoreCase(name)) {
			col_49(value);
			return;
		}
		if ($col_50.equalsIgnoreCase(name)) {
			col_50(value);
			return;
		}
		if ($col_51.equalsIgnoreCase(name)) {
			col_51(value);
			return;
		}
		if ($col_52.equalsIgnoreCase(name)) {
			col_52(value);
			return;
		}
		if ($col_53.equalsIgnoreCase(name)) {
			col_53(value);
			return;
		}
		if ($col_54.equalsIgnoreCase(name)) {
			col_54(value);
			return;
		}
		if ($col_55.equalsIgnoreCase(name)) {
			col_55(value);
			return;
		}
		if ($col_56.equalsIgnoreCase(name)) {
			col_56(value);
			return;
		}
		if ($col_57.equalsIgnoreCase(name)) {
			col_57(value);
			return;
		}
		if ($col_58.equalsIgnoreCase(name)) {
			col_58(value);
			return;
		}
		if ($col_59.equalsIgnoreCase(name)) {
			col_59(value);
			return;
		}
		if ($col_60.equalsIgnoreCase(name)) {
			col_60(value);
			return;
		}
		if ($col_61.equalsIgnoreCase(name)) {
			col_61(value);
			return;
		}
		if ($col_62.equalsIgnoreCase(name)) {
			col_62(value);
			return;
		}
		if ($col_63.equalsIgnoreCase(name)) {
			col_63(value);
			return;
		}
		if ($col_64.equalsIgnoreCase(name)) {
			col_64(value);
			return;
		}
		if ($col_65.equalsIgnoreCase(name)) {
			col_65(value);
			return;
		}
		if ($col_66.equalsIgnoreCase(name)) {
			col_66(value);
			return;
		}
		if ($col_67.equalsIgnoreCase(name)) {
			col_67(value);
			return;
		}
		if ($col_68.equalsIgnoreCase(name)) {
			col_68(value);
			return;
		}
		if ($col_69.equalsIgnoreCase(name)) {
			col_69(value);
			return;
		}
		if ($col_70.equalsIgnoreCase(name)) {
			col_70(value);
			return;
		}
		if ($col_71.equalsIgnoreCase(name)) {
			col_71(value);
			return;
		}
		if ($col_72.equalsIgnoreCase(name)) {
			col_72(value);
			return;
		}
		if ($col_73.equalsIgnoreCase(name)) {
			col_73(value);
			return;
		}
		if ($col_74.equalsIgnoreCase(name)) {
			col_74(value);
			return;
		}
		if ($col_75.equalsIgnoreCase(name)) {
			col_75(value);
			return;
		}
		if ($col_76.equalsIgnoreCase(name)) {
			col_76(value);
			return;
		}
		if ($col_77.equalsIgnoreCase(name)) {
			col_77(value);
			return;
		}
		if ($col_78.equalsIgnoreCase(name)) {
			col_78(value);
			return;
		}
		if ($col_79.equalsIgnoreCase(name)) {
			col_79(value);
			return;
		}
		if ($col_80.equalsIgnoreCase(name)) {
			col_80(value);
			return;
		}
		if ($col_81.equalsIgnoreCase(name)) {
			col_81(value);
			return;
		}
		if ($col_82.equalsIgnoreCase(name)) {
			col_82(value);
			return;
		}
		if ($col_83.equalsIgnoreCase(name)) {
			col_83(value);
			return;
		}
		if ($col_84.equalsIgnoreCase(name)) {
			col_84(value);
			return;
		}
		if ($col_85.equalsIgnoreCase(name)) {
			col_85(value);
			return;
		}
		if ($col_86.equalsIgnoreCase(name)) {
			col_86(value);
			return;
		}
		if ($col_87.equalsIgnoreCase(name)) {
			col_87(value);
			return;
		}
		if ($col_88.equalsIgnoreCase(name)) {
			col_88(value);
			return;
		}
		if ($col_89.equalsIgnoreCase(name)) {
			col_89(value);
			return;
		}
		if ($col_90.equalsIgnoreCase(name)) {
			col_90(value);
			return;
		}
		if ($col_91.equalsIgnoreCase(name)) {
			col_91(value);
			return;
		}
		if ($col_92.equalsIgnoreCase(name)) {
			col_92(value);
			return;
		}
		if ($col_93.equalsIgnoreCase(name)) {
			col_93(value);
			return;
		}
		if ($col_94.equalsIgnoreCase(name)) {
			col_94(value);
			return;
		}
		if ($col_95.equalsIgnoreCase(name)) {
			col_95(value);
			return;
		}
		if ($col_96.equalsIgnoreCase(name)) {
			col_96(value);
			return;
		}
		if ($col_97.equalsIgnoreCase(name)) {
			col_97(value);
			return;
		}
		if ($col_98.equalsIgnoreCase(name)) {
			col_98(value);
			return;
		}
		if ($col_99.equalsIgnoreCase(name)) {
			col_99(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_18.equalsIgnoreCase(name)) {
			col_18(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_20.equalsIgnoreCase(name)) {
			col_20(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_22.equalsIgnoreCase(name)) {
			col_22(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		if ($col_24.equalsIgnoreCase(name)) {
			col_24(value);
			return;
		}
		if ($col_25.equalsIgnoreCase(name)) {
			col_25(value);
			return;
		}
		if ($col_26.equalsIgnoreCase(name)) {
			col_26(value);
			return;
		}
		if ($col_27.equalsIgnoreCase(name)) {
			col_27(value);
			return;
		}
		if ($col_28.equalsIgnoreCase(name)) {
			col_28(value);
			return;
		}
		if ($col_29.equalsIgnoreCase(name)) {
			col_29(value);
			return;
		}
		if ($col_30.equalsIgnoreCase(name)) {
			col_30(value);
			return;
		}
		if ($col_31.equalsIgnoreCase(name)) {
			col_31(value);
			return;
		}
		if ($col_32.equalsIgnoreCase(name)) {
			col_32(value);
			return;
		}
		if ($col_33.equalsIgnoreCase(name)) {
			col_33(value);
			return;
		}
		if ($col_34.equalsIgnoreCase(name)) {
			col_34(value);
			return;
		}
		if ($col_35.equalsIgnoreCase(name)) {
			col_35(value);
			return;
		}
		if ($col_36.equalsIgnoreCase(name)) {
			col_36(value);
			return;
		}
		if ($col_37.equalsIgnoreCase(name)) {
			col_37(value);
			return;
		}
		if ($col_38.equalsIgnoreCase(name)) {
			col_38(value);
			return;
		}
		if ($col_39.equalsIgnoreCase(name)) {
			col_39(value);
			return;
		}
		if ($col_40.equalsIgnoreCase(name)) {
			col_40(value);
			return;
		}
		if ($col_41.equalsIgnoreCase(name)) {
			col_41(value);
			return;
		}
		if ($col_42.equalsIgnoreCase(name)) {
			col_42(value);
			return;
		}
		if ($col_43.equalsIgnoreCase(name)) {
			col_43(value);
			return;
		}
		if ($col_44.equalsIgnoreCase(name)) {
			col_44(value);
			return;
		}
		if ($col_45.equalsIgnoreCase(name)) {
			col_45(value);
			return;
		}
		if ($col_46.equalsIgnoreCase(name)) {
			col_46(value);
			return;
		}
		if ($col_47.equalsIgnoreCase(name)) {
			col_47(value);
			return;
		}
		if ($col_48.equalsIgnoreCase(name)) {
			col_48(value);
			return;
		}
		if ($col_49.equalsIgnoreCase(name)) {
			col_49(value);
			return;
		}
		if ($col_50.equalsIgnoreCase(name)) {
			col_50(value);
			return;
		}
		if ($col_51.equalsIgnoreCase(name)) {
			col_51(value);
			return;
		}
		if ($col_52.equalsIgnoreCase(name)) {
			col_52(value);
			return;
		}
		if ($col_53.equalsIgnoreCase(name)) {
			col_53(value);
			return;
		}
		if ($col_54.equalsIgnoreCase(name)) {
			col_54(value);
			return;
		}
		if ($col_55.equalsIgnoreCase(name)) {
			col_55(value);
			return;
		}
		if ($col_56.equalsIgnoreCase(name)) {
			col_56(value);
			return;
		}
		if ($col_57.equalsIgnoreCase(name)) {
			col_57(value);
			return;
		}
		if ($col_58.equalsIgnoreCase(name)) {
			col_58(value);
			return;
		}
		if ($col_59.equalsIgnoreCase(name)) {
			col_59(value);
			return;
		}
		if ($col_60.equalsIgnoreCase(name)) {
			col_60(value);
			return;
		}
		if ($col_61.equalsIgnoreCase(name)) {
			col_61(value);
			return;
		}
		if ($col_62.equalsIgnoreCase(name)) {
			col_62(value);
			return;
		}
		if ($col_63.equalsIgnoreCase(name)) {
			col_63(value);
			return;
		}
		if ($col_64.equalsIgnoreCase(name)) {
			col_64(value);
			return;
		}
		if ($col_65.equalsIgnoreCase(name)) {
			col_65(value);
			return;
		}
		if ($col_66.equalsIgnoreCase(name)) {
			col_66(value);
			return;
		}
		if ($col_67.equalsIgnoreCase(name)) {
			col_67(value);
			return;
		}
		if ($col_68.equalsIgnoreCase(name)) {
			col_68(value);
			return;
		}
		if ($col_69.equalsIgnoreCase(name)) {
			col_69(value);
			return;
		}
		if ($col_70.equalsIgnoreCase(name)) {
			col_70(value);
			return;
		}
		if ($col_71.equalsIgnoreCase(name)) {
			col_71(value);
			return;
		}
		if ($col_72.equalsIgnoreCase(name)) {
			col_72(value);
			return;
		}
		if ($col_73.equalsIgnoreCase(name)) {
			col_73(value);
			return;
		}
		if ($col_74.equalsIgnoreCase(name)) {
			col_74(value);
			return;
		}
		if ($col_75.equalsIgnoreCase(name)) {
			col_75(value);
			return;
		}
		if ($col_76.equalsIgnoreCase(name)) {
			col_76(value);
			return;
		}
		if ($col_77.equalsIgnoreCase(name)) {
			col_77(value);
			return;
		}
		if ($col_78.equalsIgnoreCase(name)) {
			col_78(value);
			return;
		}
		if ($col_79.equalsIgnoreCase(name)) {
			col_79(value);
			return;
		}
		if ($col_80.equalsIgnoreCase(name)) {
			col_80(value);
			return;
		}
		if ($col_81.equalsIgnoreCase(name)) {
			col_81(value);
			return;
		}
		if ($col_82.equalsIgnoreCase(name)) {
			col_82(value);
			return;
		}
		if ($col_83.equalsIgnoreCase(name)) {
			col_83(value);
			return;
		}
		if ($col_84.equalsIgnoreCase(name)) {
			col_84(value);
			return;
		}
		if ($col_85.equalsIgnoreCase(name)) {
			col_85(value);
			return;
		}
		if ($col_86.equalsIgnoreCase(name)) {
			col_86(value);
			return;
		}
		if ($col_87.equalsIgnoreCase(name)) {
			col_87(value);
			return;
		}
		if ($col_88.equalsIgnoreCase(name)) {
			col_88(value);
			return;
		}
		if ($col_89.equalsIgnoreCase(name)) {
			col_89(value);
			return;
		}
		if ($col_90.equalsIgnoreCase(name)) {
			col_90(value);
			return;
		}
		if ($col_91.equalsIgnoreCase(name)) {
			col_91(value);
			return;
		}
		if ($col_92.equalsIgnoreCase(name)) {
			col_92(value);
			return;
		}
		if ($col_93.equalsIgnoreCase(name)) {
			col_93(value);
			return;
		}
		if ($col_94.equalsIgnoreCase(name)) {
			col_94(value);
			return;
		}
		if ($col_95.equalsIgnoreCase(name)) {
			col_95(value);
			return;
		}
		if ($col_96.equalsIgnoreCase(name)) {
			col_96(value);
			return;
		}
		if ($col_97.equalsIgnoreCase(name)) {
			col_97(value);
			return;
		}
		if ($col_98.equalsIgnoreCase(name)) {
			col_98(value);
			return;
		}
		if ($col_99.equalsIgnoreCase(name)) {
			col_99(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_18.equalsIgnoreCase(name)) {
			col_18(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_20.equalsIgnoreCase(name)) {
			col_20(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_22.equalsIgnoreCase(name)) {
			col_22(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		if ($col_24.equalsIgnoreCase(name)) {
			col_24(value);
			return;
		}
		if ($col_25.equalsIgnoreCase(name)) {
			col_25(value);
			return;
		}
		if ($col_26.equalsIgnoreCase(name)) {
			col_26(value);
			return;
		}
		if ($col_27.equalsIgnoreCase(name)) {
			col_27(value);
			return;
		}
		if ($col_28.equalsIgnoreCase(name)) {
			col_28(value);
			return;
		}
		if ($col_29.equalsIgnoreCase(name)) {
			col_29(value);
			return;
		}
		if ($col_30.equalsIgnoreCase(name)) {
			col_30(value);
			return;
		}
		if ($col_31.equalsIgnoreCase(name)) {
			col_31(value);
			return;
		}
		if ($col_32.equalsIgnoreCase(name)) {
			col_32(value);
			return;
		}
		if ($col_33.equalsIgnoreCase(name)) {
			col_33(value);
			return;
		}
		if ($col_34.equalsIgnoreCase(name)) {
			col_34(value);
			return;
		}
		if ($col_35.equalsIgnoreCase(name)) {
			col_35(value);
			return;
		}
		if ($col_36.equalsIgnoreCase(name)) {
			col_36(value);
			return;
		}
		if ($col_37.equalsIgnoreCase(name)) {
			col_37(value);
			return;
		}
		if ($col_38.equalsIgnoreCase(name)) {
			col_38(value);
			return;
		}
		if ($col_39.equalsIgnoreCase(name)) {
			col_39(value);
			return;
		}
		if ($col_40.equalsIgnoreCase(name)) {
			col_40(value);
			return;
		}
		if ($col_41.equalsIgnoreCase(name)) {
			col_41(value);
			return;
		}
		if ($col_42.equalsIgnoreCase(name)) {
			col_42(value);
			return;
		}
		if ($col_43.equalsIgnoreCase(name)) {
			col_43(value);
			return;
		}
		if ($col_44.equalsIgnoreCase(name)) {
			col_44(value);
			return;
		}
		if ($col_45.equalsIgnoreCase(name)) {
			col_45(value);
			return;
		}
		if ($col_46.equalsIgnoreCase(name)) {
			col_46(value);
			return;
		}
		if ($col_47.equalsIgnoreCase(name)) {
			col_47(value);
			return;
		}
		if ($col_48.equalsIgnoreCase(name)) {
			col_48(value);
			return;
		}
		if ($col_49.equalsIgnoreCase(name)) {
			col_49(value);
			return;
		}
		if ($col_50.equalsIgnoreCase(name)) {
			col_50(value);
			return;
		}
		if ($col_51.equalsIgnoreCase(name)) {
			col_51(value);
			return;
		}
		if ($col_52.equalsIgnoreCase(name)) {
			col_52(value);
			return;
		}
		if ($col_53.equalsIgnoreCase(name)) {
			col_53(value);
			return;
		}
		if ($col_54.equalsIgnoreCase(name)) {
			col_54(value);
			return;
		}
		if ($col_55.equalsIgnoreCase(name)) {
			col_55(value);
			return;
		}
		if ($col_56.equalsIgnoreCase(name)) {
			col_56(value);
			return;
		}
		if ($col_57.equalsIgnoreCase(name)) {
			col_57(value);
			return;
		}
		if ($col_58.equalsIgnoreCase(name)) {
			col_58(value);
			return;
		}
		if ($col_59.equalsIgnoreCase(name)) {
			col_59(value);
			return;
		}
		if ($col_60.equalsIgnoreCase(name)) {
			col_60(value);
			return;
		}
		if ($col_61.equalsIgnoreCase(name)) {
			col_61(value);
			return;
		}
		if ($col_62.equalsIgnoreCase(name)) {
			col_62(value);
			return;
		}
		if ($col_63.equalsIgnoreCase(name)) {
			col_63(value);
			return;
		}
		if ($col_64.equalsIgnoreCase(name)) {
			col_64(value);
			return;
		}
		if ($col_65.equalsIgnoreCase(name)) {
			col_65(value);
			return;
		}
		if ($col_66.equalsIgnoreCase(name)) {
			col_66(value);
			return;
		}
		if ($col_67.equalsIgnoreCase(name)) {
			col_67(value);
			return;
		}
		if ($col_68.equalsIgnoreCase(name)) {
			col_68(value);
			return;
		}
		if ($col_69.equalsIgnoreCase(name)) {
			col_69(value);
			return;
		}
		if ($col_70.equalsIgnoreCase(name)) {
			col_70(value);
			return;
		}
		if ($col_71.equalsIgnoreCase(name)) {
			col_71(value);
			return;
		}
		if ($col_72.equalsIgnoreCase(name)) {
			col_72(value);
			return;
		}
		if ($col_73.equalsIgnoreCase(name)) {
			col_73(value);
			return;
		}
		if ($col_74.equalsIgnoreCase(name)) {
			col_74(value);
			return;
		}
		if ($col_75.equalsIgnoreCase(name)) {
			col_75(value);
			return;
		}
		if ($col_76.equalsIgnoreCase(name)) {
			col_76(value);
			return;
		}
		if ($col_77.equalsIgnoreCase(name)) {
			col_77(value);
			return;
		}
		if ($col_78.equalsIgnoreCase(name)) {
			col_78(value);
			return;
		}
		if ($col_79.equalsIgnoreCase(name)) {
			col_79(value);
			return;
		}
		if ($col_80.equalsIgnoreCase(name)) {
			col_80(value);
			return;
		}
		if ($col_81.equalsIgnoreCase(name)) {
			col_81(value);
			return;
		}
		if ($col_82.equalsIgnoreCase(name)) {
			col_82(value);
			return;
		}
		if ($col_83.equalsIgnoreCase(name)) {
			col_83(value);
			return;
		}
		if ($col_84.equalsIgnoreCase(name)) {
			col_84(value);
			return;
		}
		if ($col_85.equalsIgnoreCase(name)) {
			col_85(value);
			return;
		}
		if ($col_86.equalsIgnoreCase(name)) {
			col_86(value);
			return;
		}
		if ($col_87.equalsIgnoreCase(name)) {
			col_87(value);
			return;
		}
		if ($col_88.equalsIgnoreCase(name)) {
			col_88(value);
			return;
		}
		if ($col_89.equalsIgnoreCase(name)) {
			col_89(value);
			return;
		}
		if ($col_90.equalsIgnoreCase(name)) {
			col_90(value);
			return;
		}
		if ($col_91.equalsIgnoreCase(name)) {
			col_91(value);
			return;
		}
		if ($col_92.equalsIgnoreCase(name)) {
			col_92(value);
			return;
		}
		if ($col_93.equalsIgnoreCase(name)) {
			col_93(value);
			return;
		}
		if ($col_94.equalsIgnoreCase(name)) {
			col_94(value);
			return;
		}
		if ($col_95.equalsIgnoreCase(name)) {
			col_95(value);
			return;
		}
		if ($col_96.equalsIgnoreCase(name)) {
			col_96(value);
			return;
		}
		if ($col_97.equalsIgnoreCase(name)) {
			col_97(value);
			return;
		}
		if ($col_98.equalsIgnoreCase(name)) {
			col_98(value);
			return;
		}
		if ($col_99.equalsIgnoreCase(name)) {
			col_99(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_18.equalsIgnoreCase(name)) {
			col_18(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_20.equalsIgnoreCase(name)) {
			col_20(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_22.equalsIgnoreCase(name)) {
			col_22(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		if ($col_24.equalsIgnoreCase(name)) {
			col_24(value);
			return;
		}
		if ($col_25.equalsIgnoreCase(name)) {
			col_25(value);
			return;
		}
		if ($col_26.equalsIgnoreCase(name)) {
			col_26(value);
			return;
		}
		if ($col_27.equalsIgnoreCase(name)) {
			col_27(value);
			return;
		}
		if ($col_28.equalsIgnoreCase(name)) {
			col_28(value);
			return;
		}
		if ($col_29.equalsIgnoreCase(name)) {
			col_29(value);
			return;
		}
		if ($col_30.equalsIgnoreCase(name)) {
			col_30(value);
			return;
		}
		if ($col_31.equalsIgnoreCase(name)) {
			col_31(value);
			return;
		}
		if ($col_32.equalsIgnoreCase(name)) {
			col_32(value);
			return;
		}
		if ($col_33.equalsIgnoreCase(name)) {
			col_33(value);
			return;
		}
		if ($col_34.equalsIgnoreCase(name)) {
			col_34(value);
			return;
		}
		if ($col_35.equalsIgnoreCase(name)) {
			col_35(value);
			return;
		}
		if ($col_36.equalsIgnoreCase(name)) {
			col_36(value);
			return;
		}
		if ($col_37.equalsIgnoreCase(name)) {
			col_37(value);
			return;
		}
		if ($col_38.equalsIgnoreCase(name)) {
			col_38(value);
			return;
		}
		if ($col_39.equalsIgnoreCase(name)) {
			col_39(value);
			return;
		}
		if ($col_40.equalsIgnoreCase(name)) {
			col_40(value);
			return;
		}
		if ($col_41.equalsIgnoreCase(name)) {
			col_41(value);
			return;
		}
		if ($col_42.equalsIgnoreCase(name)) {
			col_42(value);
			return;
		}
		if ($col_43.equalsIgnoreCase(name)) {
			col_43(value);
			return;
		}
		if ($col_44.equalsIgnoreCase(name)) {
			col_44(value);
			return;
		}
		if ($col_45.equalsIgnoreCase(name)) {
			col_45(value);
			return;
		}
		if ($col_46.equalsIgnoreCase(name)) {
			col_46(value);
			return;
		}
		if ($col_47.equalsIgnoreCase(name)) {
			col_47(value);
			return;
		}
		if ($col_48.equalsIgnoreCase(name)) {
			col_48(value);
			return;
		}
		if ($col_49.equalsIgnoreCase(name)) {
			col_49(value);
			return;
		}
		if ($col_50.equalsIgnoreCase(name)) {
			col_50(value);
			return;
		}
		if ($col_51.equalsIgnoreCase(name)) {
			col_51(value);
			return;
		}
		if ($col_52.equalsIgnoreCase(name)) {
			col_52(value);
			return;
		}
		if ($col_53.equalsIgnoreCase(name)) {
			col_53(value);
			return;
		}
		if ($col_54.equalsIgnoreCase(name)) {
			col_54(value);
			return;
		}
		if ($col_55.equalsIgnoreCase(name)) {
			col_55(value);
			return;
		}
		if ($col_56.equalsIgnoreCase(name)) {
			col_56(value);
			return;
		}
		if ($col_57.equalsIgnoreCase(name)) {
			col_57(value);
			return;
		}
		if ($col_58.equalsIgnoreCase(name)) {
			col_58(value);
			return;
		}
		if ($col_59.equalsIgnoreCase(name)) {
			col_59(value);
			return;
		}
		if ($col_60.equalsIgnoreCase(name)) {
			col_60(value);
			return;
		}
		if ($col_61.equalsIgnoreCase(name)) {
			col_61(value);
			return;
		}
		if ($col_62.equalsIgnoreCase(name)) {
			col_62(value);
			return;
		}
		if ($col_63.equalsIgnoreCase(name)) {
			col_63(value);
			return;
		}
		if ($col_64.equalsIgnoreCase(name)) {
			col_64(value);
			return;
		}
		if ($col_65.equalsIgnoreCase(name)) {
			col_65(value);
			return;
		}
		if ($col_66.equalsIgnoreCase(name)) {
			col_66(value);
			return;
		}
		if ($col_67.equalsIgnoreCase(name)) {
			col_67(value);
			return;
		}
		if ($col_68.equalsIgnoreCase(name)) {
			col_68(value);
			return;
		}
		if ($col_69.equalsIgnoreCase(name)) {
			col_69(value);
			return;
		}
		if ($col_70.equalsIgnoreCase(name)) {
			col_70(value);
			return;
		}
		if ($col_71.equalsIgnoreCase(name)) {
			col_71(value);
			return;
		}
		if ($col_72.equalsIgnoreCase(name)) {
			col_72(value);
			return;
		}
		if ($col_73.equalsIgnoreCase(name)) {
			col_73(value);
			return;
		}
		if ($col_74.equalsIgnoreCase(name)) {
			col_74(value);
			return;
		}
		if ($col_75.equalsIgnoreCase(name)) {
			col_75(value);
			return;
		}
		if ($col_76.equalsIgnoreCase(name)) {
			col_76(value);
			return;
		}
		if ($col_77.equalsIgnoreCase(name)) {
			col_77(value);
			return;
		}
		if ($col_78.equalsIgnoreCase(name)) {
			col_78(value);
			return;
		}
		if ($col_79.equalsIgnoreCase(name)) {
			col_79(value);
			return;
		}
		if ($col_80.equalsIgnoreCase(name)) {
			col_80(value);
			return;
		}
		if ($col_81.equalsIgnoreCase(name)) {
			col_81(value);
			return;
		}
		if ($col_82.equalsIgnoreCase(name)) {
			col_82(value);
			return;
		}
		if ($col_83.equalsIgnoreCase(name)) {
			col_83(value);
			return;
		}
		if ($col_84.equalsIgnoreCase(name)) {
			col_84(value);
			return;
		}
		if ($col_85.equalsIgnoreCase(name)) {
			col_85(value);
			return;
		}
		if ($col_86.equalsIgnoreCase(name)) {
			col_86(value);
			return;
		}
		if ($col_87.equalsIgnoreCase(name)) {
			col_87(value);
			return;
		}
		if ($col_88.equalsIgnoreCase(name)) {
			col_88(value);
			return;
		}
		if ($col_89.equalsIgnoreCase(name)) {
			col_89(value);
			return;
		}
		if ($col_90.equalsIgnoreCase(name)) {
			col_90(value);
			return;
		}
		if ($col_91.equalsIgnoreCase(name)) {
			col_91(value);
			return;
		}
		if ($col_92.equalsIgnoreCase(name)) {
			col_92(value);
			return;
		}
		if ($col_93.equalsIgnoreCase(name)) {
			col_93(value);
			return;
		}
		if ($col_94.equalsIgnoreCase(name)) {
			col_94(value);
			return;
		}
		if ($col_95.equalsIgnoreCase(name)) {
			col_95(value);
			return;
		}
		if ($col_96.equalsIgnoreCase(name)) {
			col_96(value);
			return;
		}
		if ($col_97.equalsIgnoreCase(name)) {
			col_97(value);
			return;
		}
		if ($col_98.equalsIgnoreCase(name)) {
			col_98(value);
			return;
		}
		if ($col_99.equalsIgnoreCase(name)) {
			col_99(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($key_idx.equalsIgnoreCase(name)) {
			key_idx(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_18.equalsIgnoreCase(name)) {
			col_18(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_20.equalsIgnoreCase(name)) {
			col_20(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_22.equalsIgnoreCase(name)) {
			col_22(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		if ($col_24.equalsIgnoreCase(name)) {
			col_24(value);
			return;
		}
		if ($col_25.equalsIgnoreCase(name)) {
			col_25(value);
			return;
		}
		if ($col_26.equalsIgnoreCase(name)) {
			col_26(value);
			return;
		}
		if ($col_27.equalsIgnoreCase(name)) {
			col_27(value);
			return;
		}
		if ($col_28.equalsIgnoreCase(name)) {
			col_28(value);
			return;
		}
		if ($col_29.equalsIgnoreCase(name)) {
			col_29(value);
			return;
		}
		if ($col_30.equalsIgnoreCase(name)) {
			col_30(value);
			return;
		}
		if ($col_31.equalsIgnoreCase(name)) {
			col_31(value);
			return;
		}
		if ($col_32.equalsIgnoreCase(name)) {
			col_32(value);
			return;
		}
		if ($col_33.equalsIgnoreCase(name)) {
			col_33(value);
			return;
		}
		if ($col_34.equalsIgnoreCase(name)) {
			col_34(value);
			return;
		}
		if ($col_35.equalsIgnoreCase(name)) {
			col_35(value);
			return;
		}
		if ($col_36.equalsIgnoreCase(name)) {
			col_36(value);
			return;
		}
		if ($col_37.equalsIgnoreCase(name)) {
			col_37(value);
			return;
		}
		if ($col_38.equalsIgnoreCase(name)) {
			col_38(value);
			return;
		}
		if ($col_39.equalsIgnoreCase(name)) {
			col_39(value);
			return;
		}
		if ($col_40.equalsIgnoreCase(name)) {
			col_40(value);
			return;
		}
		if ($col_41.equalsIgnoreCase(name)) {
			col_41(value);
			return;
		}
		if ($col_42.equalsIgnoreCase(name)) {
			col_42(value);
			return;
		}
		if ($col_43.equalsIgnoreCase(name)) {
			col_43(value);
			return;
		}
		if ($col_44.equalsIgnoreCase(name)) {
			col_44(value);
			return;
		}
		if ($col_45.equalsIgnoreCase(name)) {
			col_45(value);
			return;
		}
		if ($col_46.equalsIgnoreCase(name)) {
			col_46(value);
			return;
		}
		if ($col_47.equalsIgnoreCase(name)) {
			col_47(value);
			return;
		}
		if ($col_48.equalsIgnoreCase(name)) {
			col_48(value);
			return;
		}
		if ($col_49.equalsIgnoreCase(name)) {
			col_49(value);
			return;
		}
		if ($col_50.equalsIgnoreCase(name)) {
			col_50(value);
			return;
		}
		if ($col_51.equalsIgnoreCase(name)) {
			col_51(value);
			return;
		}
		if ($col_52.equalsIgnoreCase(name)) {
			col_52(value);
			return;
		}
		if ($col_53.equalsIgnoreCase(name)) {
			col_53(value);
			return;
		}
		if ($col_54.equalsIgnoreCase(name)) {
			col_54(value);
			return;
		}
		if ($col_55.equalsIgnoreCase(name)) {
			col_55(value);
			return;
		}
		if ($col_56.equalsIgnoreCase(name)) {
			col_56(value);
			return;
		}
		if ($col_57.equalsIgnoreCase(name)) {
			col_57(value);
			return;
		}
		if ($col_58.equalsIgnoreCase(name)) {
			col_58(value);
			return;
		}
		if ($col_59.equalsIgnoreCase(name)) {
			col_59(value);
			return;
		}
		if ($col_60.equalsIgnoreCase(name)) {
			col_60(value);
			return;
		}
		if ($col_61.equalsIgnoreCase(name)) {
			col_61(value);
			return;
		}
		if ($col_62.equalsIgnoreCase(name)) {
			col_62(value);
			return;
		}
		if ($col_63.equalsIgnoreCase(name)) {
			col_63(value);
			return;
		}
		if ($col_64.equalsIgnoreCase(name)) {
			col_64(value);
			return;
		}
		if ($col_65.equalsIgnoreCase(name)) {
			col_65(value);
			return;
		}
		if ($col_66.equalsIgnoreCase(name)) {
			col_66(value);
			return;
		}
		if ($col_67.equalsIgnoreCase(name)) {
			col_67(value);
			return;
		}
		if ($col_68.equalsIgnoreCase(name)) {
			col_68(value);
			return;
		}
		if ($col_69.equalsIgnoreCase(name)) {
			col_69(value);
			return;
		}
		if ($col_70.equalsIgnoreCase(name)) {
			col_70(value);
			return;
		}
		if ($col_71.equalsIgnoreCase(name)) {
			col_71(value);
			return;
		}
		if ($col_72.equalsIgnoreCase(name)) {
			col_72(value);
			return;
		}
		if ($col_73.equalsIgnoreCase(name)) {
			col_73(value);
			return;
		}
		if ($col_74.equalsIgnoreCase(name)) {
			col_74(value);
			return;
		}
		if ($col_75.equalsIgnoreCase(name)) {
			col_75(value);
			return;
		}
		if ($col_76.equalsIgnoreCase(name)) {
			col_76(value);
			return;
		}
		if ($col_77.equalsIgnoreCase(name)) {
			col_77(value);
			return;
		}
		if ($col_78.equalsIgnoreCase(name)) {
			col_78(value);
			return;
		}
		if ($col_79.equalsIgnoreCase(name)) {
			col_79(value);
			return;
		}
		if ($col_80.equalsIgnoreCase(name)) {
			col_80(value);
			return;
		}
		if ($col_81.equalsIgnoreCase(name)) {
			col_81(value);
			return;
		}
		if ($col_82.equalsIgnoreCase(name)) {
			col_82(value);
			return;
		}
		if ($col_83.equalsIgnoreCase(name)) {
			col_83(value);
			return;
		}
		if ($col_84.equalsIgnoreCase(name)) {
			col_84(value);
			return;
		}
		if ($col_85.equalsIgnoreCase(name)) {
			col_85(value);
			return;
		}
		if ($col_86.equalsIgnoreCase(name)) {
			col_86(value);
			return;
		}
		if ($col_87.equalsIgnoreCase(name)) {
			col_87(value);
			return;
		}
		if ($col_88.equalsIgnoreCase(name)) {
			col_88(value);
			return;
		}
		if ($col_89.equalsIgnoreCase(name)) {
			col_89(value);
			return;
		}
		if ($col_90.equalsIgnoreCase(name)) {
			col_90(value);
			return;
		}
		if ($col_91.equalsIgnoreCase(name)) {
			col_91(value);
			return;
		}
		if ($col_92.equalsIgnoreCase(name)) {
			col_92(value);
			return;
		}
		if ($col_93.equalsIgnoreCase(name)) {
			col_93(value);
			return;
		}
		if ($col_94.equalsIgnoreCase(name)) {
			col_94(value);
			return;
		}
		if ($col_95.equalsIgnoreCase(name)) {
			col_95(value);
			return;
		}
		if ($col_96.equalsIgnoreCase(name)) {
			col_96(value);
			return;
		}
		if ($col_97.equalsIgnoreCase(name)) {
			col_97(value);
			return;
		}
		if ($col_98.equalsIgnoreCase(name)) {
			col_98(value);
			return;
		}
		if ($col_99.equalsIgnoreCase(name)) {
			col_99(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

}

