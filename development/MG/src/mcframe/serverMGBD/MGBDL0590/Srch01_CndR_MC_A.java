package mcframe.serverMGBD.MGBDL0590;

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
	 * Common 共通.<p>
	 *
	 */
	public static final String $cmn_flg = "cmn_flg";
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public static final String $wg_flg = "wg_flg";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
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
	 * Term FROM 期ＦＲＯＭ.<p>
	 *
	 */
	public static final String $term_fr = "term_fr";
	/**
	 * Term TO 期ＴＯ.<p>
	 *
	 */
	public static final String $term_to = "term_to";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
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
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
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
	 * Remarks 備考.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Not to calculate. Off 計算対象外.オフ.<p>
	 *
	 */
	public static final String $off_non_calc_flg = "off_non_calc_flg";
	/**
	 * Not to calculate. On 計算対象外.オン.<p>
	 *
	 */
	public static final String $on_non_calc_flg = "on_non_calc_flg";
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
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public static final String $itm_grp_flg1 = "itm_grp_flg1";
	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public static final String $itm_grp_flg2 = "itm_grp_flg2";
	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public static final String $itm_grp_flg3 = "itm_grp_flg3";
	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public static final String $itm_grp_flg4 = "itm_grp_flg4";
	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public static final String $itm_grp_flg5 = "itm_grp_flg5";
	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public static final String $itm_grp_flg6 = "itm_grp_flg6";
	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public static final String $itm_grp_flg7 = "itm_grp_flg7";
	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public static final String $itm_grp_flg8 = "itm_grp_flg8";
	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public static final String $itm_grp_flg9 = "itm_grp_flg9";
	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public static final String $itm_grp_flg10 = "itm_grp_flg10";
	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public static final String $cst_grp_flg1 = "cst_grp_flg1";
	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public static final String $cst_grp_flg2 = "cst_grp_flg2";
	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public static final String $cst_grp_flg3 = "cst_grp_flg3";
	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public static final String $cst_grp_flg4 = "cst_grp_flg4";
	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public static final String $cst_grp_flg5 = "cst_grp_flg5";
	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public static final String $cst_grp_flg6 = "cst_grp_flg6";
	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public static final String $cst_grp_flg7 = "cst_grp_flg7";
	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public static final String $cst_grp_flg8 = "cst_grp_flg8";
	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public static final String $cst_grp_flg9 = "cst_grp_flg9";
	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public static final String $cst_grp_flg10 = "cst_grp_flg10";
	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public static final String $dlv_grp_flg1 = "dlv_grp_flg1";
	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public static final String $dlv_grp_flg2 = "dlv_grp_flg2";
	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public static final String $dlv_grp_flg3 = "dlv_grp_flg3";
	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public static final String $dlv_grp_flg4 = "dlv_grp_flg4";
	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public static final String $dlv_grp_flg5 = "dlv_grp_flg5";
	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public static final String $dlv_grp_flg6 = "dlv_grp_flg6";
	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public static final String $dlv_grp_flg7 = "dlv_grp_flg7";
	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public static final String $dlv_grp_flg8 = "dlv_grp_flg8";
	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public static final String $dlv_grp_flg9 = "dlv_grp_flg9";
	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public static final String $dlv_grp_flg10 = "dlv_grp_flg10";


	public static final MCMeta cmn_flg_META = createCommonMeta($cmn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_flg_META = createCommonMeta($wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta term_fr_META = createCommonMeta($term_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta term_to_META = createCommonMeta($term_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cntry_cd_META = createCommonMeta($cst_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cst_cntry_nm_META = createCommonMeta($cst_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cst_area_cd_META = createCommonMeta($cst_area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta cst_area_nm_META = createCommonMeta($cst_area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_cntry_cd_META = createCommonMeta($dlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dlv_cntry_nm_META = createCommonMeta($dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta dlv_area_cd_META = createCommonMeta($dlv_area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta dlv_area_nm_META = createCommonMeta($dlv_area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMG.meta.MG_META.ITM_SLS_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMG.meta.MG_META.ITM_SLS_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMG.meta.MG_META.ITM_SLS_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMG.meta.MG_META.ITM_SLS_SUB_CHAR3);
	public static final MCMeta off_non_calc_flg_META = createCommonMeta($off_non_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_non_calc_flg_META = createCommonMeta($on_non_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta itm_grp_flg1_META = createCommonMeta($itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg2_META = createCommonMeta($itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg3_META = createCommonMeta($itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg4_META = createCommonMeta($itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg5_META = createCommonMeta($itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg6_META = createCommonMeta($itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg7_META = createCommonMeta($itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg8_META = createCommonMeta($itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg9_META = createCommonMeta($itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg10_META = createCommonMeta($itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_flg1_META = createCommonMeta($cst_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_flg2_META = createCommonMeta($cst_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_flg3_META = createCommonMeta($cst_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_flg4_META = createCommonMeta($cst_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_flg5_META = createCommonMeta($cst_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_flg6_META = createCommonMeta($cst_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_flg7_META = createCommonMeta($cst_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_flg8_META = createCommonMeta($cst_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_flg9_META = createCommonMeta($cst_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_flg10_META = createCommonMeta($cst_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_flg1_META = createCommonMeta($dlv_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_flg2_META = createCommonMeta($dlv_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_flg3_META = createCommonMeta($dlv_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_flg4_META = createCommonMeta($dlv_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_flg5_META = createCommonMeta($dlv_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_flg6_META = createCommonMeta($dlv_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_flg7_META = createCommonMeta($dlv_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_flg8_META = createCommonMeta($dlv_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_flg9_META = createCommonMeta($dlv_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_flg10_META = createCommonMeta($dlv_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cmn_flg_META,
			wg_flg_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			term_fr_META,
			term_to_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			cur_cd_META,
			cur_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			cst_cd_META,
			cst_nm_META,
			cst_cntry_cd_META,
			cst_cntry_nm_META,
			cst_area_cd_META,
			cst_area_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			dlv_cntry_cd_META,
			dlv_cntry_nm_META,
			dlv_area_cd_META,
			dlv_area_nm_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			off_non_calc_flg_META,
			on_non_calc_flg_META,
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
			itm_grp_flg1_META,
			itm_grp_flg2_META,
			itm_grp_flg3_META,
			itm_grp_flg4_META,
			itm_grp_flg5_META,
			itm_grp_flg6_META,
			itm_grp_flg7_META,
			itm_grp_flg8_META,
			itm_grp_flg9_META,
			itm_grp_flg10_META,
			cst_grp_flg1_META,
			cst_grp_flg2_META,
			cst_grp_flg3_META,
			cst_grp_flg4_META,
			cst_grp_flg5_META,
			cst_grp_flg6_META,
			cst_grp_flg7_META,
			cst_grp_flg8_META,
			cst_grp_flg9_META,
			cst_grp_flg10_META,
			dlv_grp_flg1_META,
			dlv_grp_flg2_META,
			dlv_grp_flg3_META,
			dlv_grp_flg4_META,
			dlv_grp_flg5_META,
			dlv_grp_flg6_META,
			dlv_grp_flg7_META,
			dlv_grp_flg8_META,
			dlv_grp_flg9_META,
			dlv_grp_flg10_META
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
	 * Common 共通.<p>
	 *
	 */
	public boolean cmn_flg() {
		return getConstBoolean(offset + 0, $cmn_flg);
	}

	/**
	 * Common 共通.<p>
	 *
	 */
	public void cmn_flg(boolean value) {
		setConstBoolean(offset + 0, $cmn_flg, value);
	}


	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public boolean wg_flg() {
		return getConstBoolean(offset + 1, $wg_flg);
	}

	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public void wg_flg(boolean value) {
		setConstBoolean(offset + 1, $wg_flg, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 2, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 2, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 3, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 3, $calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 4, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 4, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 5, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 5, $wg_nm, value);
	}


	/**
	 * Term FROM 期ＦＲＯＭ.<p>
	 *
	 */
	public MCDate term_fr() {
		return getConstDate(offset + 6, $term_fr);
	}

	/**
	 * Term FROM 期ＦＲＯＭ.<p>
	 *
	 */
	public void term_fr(MCDate value) {
		setConstDate(offset + 6, $term_fr, value);
	}


	/**
	 * Term TO 期ＴＯ.<p>
	 *
	 */
	public MCDate term_to() {
		return getConstDate(offset + 7, $term_to);
	}

	/**
	 * Term TO 期ＴＯ.<p>
	 *
	 */
	public void term_to(MCDate value) {
		setConstDate(offset + 7, $term_to, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 8, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 8, $itm_typ, value);
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
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 13, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 13, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 14, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 14, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 15, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 15, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 16, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 16, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 17, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 17, $itm_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 18, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 18, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 19, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 19, $cur_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 20, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 20, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 21, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 21, $dpt_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 22, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 22, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 23, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 23, $cst_nm, value);
	}


	/**
	 * Country cd. (Customer) 国ＣＤ（得意先）.<p>
	 *
	 */
	public String cst_cntry_cd() {
		return getConstString(offset + 24, $cst_cntry_cd);
	}

	/**
	 * Country cd. (Customer) 国ＣＤ（得意先）.<p>
	 *
	 */
	public void cst_cntry_cd(String value) {
		setConstString(offset + 24, $cst_cntry_cd, value);
	}


	/**
	 * Country name (Customer) 国名（得意先）.<p>
	 *
	 */
	public String cst_cntry_nm() {
		return getConstString(offset + 25, $cst_cntry_nm);
	}

	/**
	 * Country name (Customer) 国名（得意先）.<p>
	 *
	 */
	public void cst_cntry_nm(String value) {
		setConstString(offset + 25, $cst_cntry_nm, value);
	}


	/**
	 * Region cd. (Customer) 地域ＣＤ（得意先）.<p>
	 *
	 */
	public String cst_area_cd() {
		return getConstString(offset + 26, $cst_area_cd);
	}

	/**
	 * Region cd. (Customer) 地域ＣＤ（得意先）.<p>
	 *
	 */
	public void cst_area_cd(String value) {
		setConstString(offset + 26, $cst_area_cd, value);
	}


	/**
	 * Region name (Customer) 地域名（得意先）.<p>
	 *
	 */
	public String cst_area_nm() {
		return getConstString(offset + 27, $cst_area_nm);
	}

	/**
	 * Region name (Customer) 地域名（得意先）.<p>
	 *
	 */
	public void cst_area_nm(String value) {
		setConstString(offset + 27, $cst_area_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 28, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 28, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 29, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 29, $dlv_nm, value);
	}


	/**
	 * Country cd. (Delivery) 国ＣＤ（納品先）.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return getConstString(offset + 30, $dlv_cntry_cd);
	}

	/**
	 * Country cd. (Delivery) 国ＣＤ（納品先）.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		setConstString(offset + 30, $dlv_cntry_cd, value);
	}


	/**
	 * Country name (Delivery) 国名（納品先）.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 31, $dlv_cntry_nm);
	}

	/**
	 * Country name (Delivery) 国名（納品先）.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 31, $dlv_cntry_nm, value);
	}


	/**
	 * Region cd. (Delivery) 地域ＣＤ（納品先）.<p>
	 *
	 */
	public String dlv_area_cd() {
		return getConstString(offset + 32, $dlv_area_cd);
	}

	/**
	 * Region cd. (Delivery) 地域ＣＤ（納品先）.<p>
	 *
	 */
	public void dlv_area_cd(String value) {
		setConstString(offset + 32, $dlv_area_cd, value);
	}


	/**
	 * Region name (Delivery) 地域名（納品先）.<p>
	 *
	 */
	public String dlv_area_nm() {
		return getConstString(offset + 33, $dlv_area_nm);
	}

	/**
	 * Region name (Delivery) 地域名（納品先）.<p>
	 *
	 */
	public void dlv_area_nm(String value) {
		setConstString(offset + 33, $dlv_area_nm, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 34, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 34, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 35, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 35, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 36, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 36, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 37, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 37, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 38, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 38, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 39, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 39, $dest_nm3, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 40, $rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 40, $rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 41, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 41, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 42, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 42, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 43, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 43, $sub_char3, value);
	}


	/**
	 * Not to calculate. Off 計算対象外.オフ.<p>
	 *
	 */
	public boolean off_non_calc_flg() {
		return getConstBoolean(offset + 44, $off_non_calc_flg);
	}

	/**
	 * Not to calculate. Off 計算対象外.オフ.<p>
	 *
	 */
	public void off_non_calc_flg(boolean value) {
		setConstBoolean(offset + 44, $off_non_calc_flg, value);
	}


	/**
	 * Not to calculate. On 計算対象外.オン.<p>
	 *
	 */
	public boolean on_non_calc_flg() {
		return getConstBoolean(offset + 45, $on_non_calc_flg);
	}

	/**
	 * Not to calculate. On 計算対象外.オン.<p>
	 *
	 */
	public void on_non_calc_flg(boolean value) {
		setConstBoolean(offset + 45, $on_non_calc_flg, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 46, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 46, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 47, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 47, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 48, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 48, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 49, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 49, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 50, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 50, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 51, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 51, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 52, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 52, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 53, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 53, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 54, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 54, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 55, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 55, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 56, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 56, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 57, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 57, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 58, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 58, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 59, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 59, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 60, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 60, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 61, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 61, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 62, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 62, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 63, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 63, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 64, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 64, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 65, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 65, $itm_grp_nm10, value);
	}


	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return getConstString(offset + 66, $cst_grp_cd1);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		setConstString(offset + 66, $cst_grp_cd1, value);
	}


	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return getConstString(offset + 67, $cst_grp_nm1);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		setConstString(offset + 67, $cst_grp_nm1, value);
	}


	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return getConstString(offset + 68, $cst_grp_cd2);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		setConstString(offset + 68, $cst_grp_cd2, value);
	}


	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return getConstString(offset + 69, $cst_grp_nm2);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		setConstString(offset + 69, $cst_grp_nm2, value);
	}


	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return getConstString(offset + 70, $cst_grp_cd3);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		setConstString(offset + 70, $cst_grp_cd3, value);
	}


	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return getConstString(offset + 71, $cst_grp_nm3);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		setConstString(offset + 71, $cst_grp_nm3, value);
	}


	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return getConstString(offset + 72, $cst_grp_cd4);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		setConstString(offset + 72, $cst_grp_cd4, value);
	}


	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return getConstString(offset + 73, $cst_grp_nm4);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		setConstString(offset + 73, $cst_grp_nm4, value);
	}


	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return getConstString(offset + 74, $cst_grp_cd5);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		setConstString(offset + 74, $cst_grp_cd5, value);
	}


	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return getConstString(offset + 75, $cst_grp_nm5);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		setConstString(offset + 75, $cst_grp_nm5, value);
	}


	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return getConstString(offset + 76, $cst_grp_cd6);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		setConstString(offset + 76, $cst_grp_cd6, value);
	}


	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return getConstString(offset + 77, $cst_grp_nm6);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		setConstString(offset + 77, $cst_grp_nm6, value);
	}


	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return getConstString(offset + 78, $cst_grp_cd7);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		setConstString(offset + 78, $cst_grp_cd7, value);
	}


	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return getConstString(offset + 79, $cst_grp_nm7);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		setConstString(offset + 79, $cst_grp_nm7, value);
	}


	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return getConstString(offset + 80, $cst_grp_cd8);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		setConstString(offset + 80, $cst_grp_cd8, value);
	}


	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return getConstString(offset + 81, $cst_grp_nm8);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		setConstString(offset + 81, $cst_grp_nm8, value);
	}


	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return getConstString(offset + 82, $cst_grp_cd9);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		setConstString(offset + 82, $cst_grp_cd9, value);
	}


	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return getConstString(offset + 83, $cst_grp_nm9);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		setConstString(offset + 83, $cst_grp_nm9, value);
	}


	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return getConstString(offset + 84, $cst_grp_cd10);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		setConstString(offset + 84, $cst_grp_cd10, value);
	}


	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return getConstString(offset + 85, $cst_grp_nm10);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		setConstString(offset + 85, $cst_grp_nm10, value);
	}


	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_grp_cd1() {
		return getConstString(offset + 86, $dlv_grp_cd1);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_grp_cd1(String value) {
		setConstString(offset + 86, $dlv_grp_cd1, value);
	}


	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_grp_nm1() {
		return getConstString(offset + 87, $dlv_grp_nm1);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_grp_nm1(String value) {
		setConstString(offset + 87, $dlv_grp_nm1, value);
	}


	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_grp_cd2() {
		return getConstString(offset + 88, $dlv_grp_cd2);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_grp_cd2(String value) {
		setConstString(offset + 88, $dlv_grp_cd2, value);
	}


	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_grp_nm2() {
		return getConstString(offset + 89, $dlv_grp_nm2);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_grp_nm2(String value) {
		setConstString(offset + 89, $dlv_grp_nm2, value);
	}


	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_grp_cd3() {
		return getConstString(offset + 90, $dlv_grp_cd3);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_grp_cd3(String value) {
		setConstString(offset + 90, $dlv_grp_cd3, value);
	}


	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_grp_nm3() {
		return getConstString(offset + 91, $dlv_grp_nm3);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_grp_nm3(String value) {
		setConstString(offset + 91, $dlv_grp_nm3, value);
	}


	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_grp_cd4() {
		return getConstString(offset + 92, $dlv_grp_cd4);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_grp_cd4(String value) {
		setConstString(offset + 92, $dlv_grp_cd4, value);
	}


	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_grp_nm4() {
		return getConstString(offset + 93, $dlv_grp_nm4);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_grp_nm4(String value) {
		setConstString(offset + 93, $dlv_grp_nm4, value);
	}


	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_grp_cd5() {
		return getConstString(offset + 94, $dlv_grp_cd5);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_grp_cd5(String value) {
		setConstString(offset + 94, $dlv_grp_cd5, value);
	}


	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_grp_nm5() {
		return getConstString(offset + 95, $dlv_grp_nm5);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_grp_nm5(String value) {
		setConstString(offset + 95, $dlv_grp_nm5, value);
	}


	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_grp_cd6() {
		return getConstString(offset + 96, $dlv_grp_cd6);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_grp_cd6(String value) {
		setConstString(offset + 96, $dlv_grp_cd6, value);
	}


	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_grp_nm6() {
		return getConstString(offset + 97, $dlv_grp_nm6);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_grp_nm6(String value) {
		setConstString(offset + 97, $dlv_grp_nm6, value);
	}


	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_grp_cd7() {
		return getConstString(offset + 98, $dlv_grp_cd7);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_grp_cd7(String value) {
		setConstString(offset + 98, $dlv_grp_cd7, value);
	}


	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_grp_nm7() {
		return getConstString(offset + 99, $dlv_grp_nm7);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_grp_nm7(String value) {
		setConstString(offset + 99, $dlv_grp_nm7, value);
	}


	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_grp_cd8() {
		return getConstString(offset + 100, $dlv_grp_cd8);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_grp_cd8(String value) {
		setConstString(offset + 100, $dlv_grp_cd8, value);
	}


	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_grp_nm8() {
		return getConstString(offset + 101, $dlv_grp_nm8);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_grp_nm8(String value) {
		setConstString(offset + 101, $dlv_grp_nm8, value);
	}


	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_grp_cd9() {
		return getConstString(offset + 102, $dlv_grp_cd9);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_grp_cd9(String value) {
		setConstString(offset + 102, $dlv_grp_cd9, value);
	}


	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_grp_nm9() {
		return getConstString(offset + 103, $dlv_grp_nm9);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_grp_nm9(String value) {
		setConstString(offset + 103, $dlv_grp_nm9, value);
	}


	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_grp_cd10() {
		return getConstString(offset + 104, $dlv_grp_cd10);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_grp_cd10(String value) {
		setConstString(offset + 104, $dlv_grp_cd10, value);
	}


	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_grp_nm10() {
		return getConstString(offset + 105, $dlv_grp_nm10);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_grp_nm10(String value) {
		setConstString(offset + 105, $dlv_grp_nm10, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 106, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 106, $itm_grp_flg1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 107, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 107, $itm_grp_flg2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 108, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 108, $itm_grp_flg3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 109, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 109, $itm_grp_flg4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 110, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 110, $itm_grp_flg5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 111, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 111, $itm_grp_flg6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 112, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 112, $itm_grp_flg7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 113, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 113, $itm_grp_flg8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 114, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 114, $itm_grp_flg9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 115, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 115, $itm_grp_flg10, value);
	}


	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public boolean cst_grp_flg1() {
		return getConstBoolean(offset + 116, $cst_grp_flg1);
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public void cst_grp_flg1(boolean value) {
		setConstBoolean(offset + 116, $cst_grp_flg1, value);
	}


	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public boolean cst_grp_flg2() {
		return getConstBoolean(offset + 117, $cst_grp_flg2);
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public void cst_grp_flg2(boolean value) {
		setConstBoolean(offset + 117, $cst_grp_flg2, value);
	}


	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public boolean cst_grp_flg3() {
		return getConstBoolean(offset + 118, $cst_grp_flg3);
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public void cst_grp_flg3(boolean value) {
		setConstBoolean(offset + 118, $cst_grp_flg3, value);
	}


	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public boolean cst_grp_flg4() {
		return getConstBoolean(offset + 119, $cst_grp_flg4);
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public void cst_grp_flg4(boolean value) {
		setConstBoolean(offset + 119, $cst_grp_flg4, value);
	}


	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public boolean cst_grp_flg5() {
		return getConstBoolean(offset + 120, $cst_grp_flg5);
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public void cst_grp_flg5(boolean value) {
		setConstBoolean(offset + 120, $cst_grp_flg5, value);
	}


	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public boolean cst_grp_flg6() {
		return getConstBoolean(offset + 121, $cst_grp_flg6);
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public void cst_grp_flg6(boolean value) {
		setConstBoolean(offset + 121, $cst_grp_flg6, value);
	}


	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public boolean cst_grp_flg7() {
		return getConstBoolean(offset + 122, $cst_grp_flg7);
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public void cst_grp_flg7(boolean value) {
		setConstBoolean(offset + 122, $cst_grp_flg7, value);
	}


	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public boolean cst_grp_flg8() {
		return getConstBoolean(offset + 123, $cst_grp_flg8);
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public void cst_grp_flg8(boolean value) {
		setConstBoolean(offset + 123, $cst_grp_flg8, value);
	}


	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public boolean cst_grp_flg9() {
		return getConstBoolean(offset + 124, $cst_grp_flg9);
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public void cst_grp_flg9(boolean value) {
		setConstBoolean(offset + 124, $cst_grp_flg9, value);
	}


	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public boolean cst_grp_flg10() {
		return getConstBoolean(offset + 125, $cst_grp_flg10);
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public void cst_grp_flg10(boolean value) {
		setConstBoolean(offset + 125, $cst_grp_flg10, value);
	}


	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public boolean dlv_grp_flg1() {
		return getConstBoolean(offset + 126, $dlv_grp_flg1);
	}

	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public void dlv_grp_flg1(boolean value) {
		setConstBoolean(offset + 126, $dlv_grp_flg1, value);
	}


	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public boolean dlv_grp_flg2() {
		return getConstBoolean(offset + 127, $dlv_grp_flg2);
	}

	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public void dlv_grp_flg2(boolean value) {
		setConstBoolean(offset + 127, $dlv_grp_flg2, value);
	}


	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public boolean dlv_grp_flg3() {
		return getConstBoolean(offset + 128, $dlv_grp_flg3);
	}

	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public void dlv_grp_flg3(boolean value) {
		setConstBoolean(offset + 128, $dlv_grp_flg3, value);
	}


	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public boolean dlv_grp_flg4() {
		return getConstBoolean(offset + 129, $dlv_grp_flg4);
	}

	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public void dlv_grp_flg4(boolean value) {
		setConstBoolean(offset + 129, $dlv_grp_flg4, value);
	}


	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public boolean dlv_grp_flg5() {
		return getConstBoolean(offset + 130, $dlv_grp_flg5);
	}

	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public void dlv_grp_flg5(boolean value) {
		setConstBoolean(offset + 130, $dlv_grp_flg5, value);
	}


	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public boolean dlv_grp_flg6() {
		return getConstBoolean(offset + 131, $dlv_grp_flg6);
	}

	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public void dlv_grp_flg6(boolean value) {
		setConstBoolean(offset + 131, $dlv_grp_flg6, value);
	}


	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public boolean dlv_grp_flg7() {
		return getConstBoolean(offset + 132, $dlv_grp_flg7);
	}

	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public void dlv_grp_flg7(boolean value) {
		setConstBoolean(offset + 132, $dlv_grp_flg7, value);
	}


	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public boolean dlv_grp_flg8() {
		return getConstBoolean(offset + 133, $dlv_grp_flg8);
	}

	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public void dlv_grp_flg8(boolean value) {
		setConstBoolean(offset + 133, $dlv_grp_flg8, value);
	}


	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public boolean dlv_grp_flg9() {
		return getConstBoolean(offset + 134, $dlv_grp_flg9);
	}

	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public void dlv_grp_flg9(boolean value) {
		setConstBoolean(offset + 134, $dlv_grp_flg9, value);
	}


	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public boolean dlv_grp_flg10() {
		return getConstBoolean(offset + 135, $dlv_grp_flg10);
	}

	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public void dlv_grp_flg10(boolean value) {
		setConstBoolean(offset + 135, $dlv_grp_flg10, value);
	}


	public String getString(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
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
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
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
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($term_fr.equalsIgnoreCase(name)) {
			return term_fr();
		}
		if ($term_to.equalsIgnoreCase(name)) {
			return term_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($cmn_flg.equalsIgnoreCase(name)) {
			return cmn_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($off_non_calc_flg.equalsIgnoreCase(name)) {
			return off_non_calc_flg();
		}
		if ($on_non_calc_flg.equalsIgnoreCase(name)) {
			return on_non_calc_flg();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			return cst_grp_flg1();
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			return cst_grp_flg2();
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			return cst_grp_flg3();
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			return cst_grp_flg4();
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			return cst_grp_flg5();
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			return cst_grp_flg6();
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			return cst_grp_flg7();
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			return cst_grp_flg8();
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			return cst_grp_flg9();
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			return cst_grp_flg10();
		}
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			return dlv_grp_flg1();
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			return dlv_grp_flg2();
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			return dlv_grp_flg3();
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			return dlv_grp_flg4();
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			return dlv_grp_flg5();
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			return dlv_grp_flg6();
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			return dlv_grp_flg7();
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			return dlv_grp_flg8();
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			return dlv_grp_flg9();
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			return dlv_grp_flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
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
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
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
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($term_fr.equalsIgnoreCase(name)) {
			return term_fr();
		}
		if ($term_to.equalsIgnoreCase(name)) {
			return term_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cmn_flg.equalsIgnoreCase(name)) {
			return cmn_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($off_non_calc_flg.equalsIgnoreCase(name)) {
			return off_non_calc_flg();
		}
		if ($on_non_calc_flg.equalsIgnoreCase(name)) {
			return on_non_calc_flg();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			return cst_grp_flg1();
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			return cst_grp_flg2();
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			return cst_grp_flg3();
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			return cst_grp_flg4();
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			return cst_grp_flg5();
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			return cst_grp_flg6();
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			return cst_grp_flg7();
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			return cst_grp_flg8();
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			return cst_grp_flg9();
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			return cst_grp_flg10();
		}
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			return dlv_grp_flg1();
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			return dlv_grp_flg2();
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			return dlv_grp_flg3();
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			return dlv_grp_flg4();
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			return dlv_grp_flg5();
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			return dlv_grp_flg6();
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			return dlv_grp_flg7();
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			return dlv_grp_flg8();
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			return dlv_grp_flg9();
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			return dlv_grp_flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
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
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($term_fr.equalsIgnoreCase(name)) {
			term_fr(value);
			return;
		}
		if ($term_to.equalsIgnoreCase(name)) {
			term_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cmn_flg.equalsIgnoreCase(name)) {
			cmn_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($off_non_calc_flg.equalsIgnoreCase(name)) {
			off_non_calc_flg(value);
			return;
		}
		if ($on_non_calc_flg.equalsIgnoreCase(name)) {
			on_non_calc_flg(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			cst_grp_flg1(value);
			return;
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			cst_grp_flg2(value);
			return;
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			cst_grp_flg3(value);
			return;
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			cst_grp_flg4(value);
			return;
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			cst_grp_flg5(value);
			return;
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			cst_grp_flg6(value);
			return;
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			cst_grp_flg7(value);
			return;
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			cst_grp_flg8(value);
			return;
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			cst_grp_flg9(value);
			return;
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			cst_grp_flg10(value);
			return;
		}
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			dlv_grp_flg1(value);
			return;
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			dlv_grp_flg2(value);
			return;
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			dlv_grp_flg3(value);
			return;
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			dlv_grp_flg4(value);
			return;
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			dlv_grp_flg5(value);
			return;
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			dlv_grp_flg6(value);
			return;
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			dlv_grp_flg7(value);
			return;
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			dlv_grp_flg8(value);
			return;
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			dlv_grp_flg9(value);
			return;
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			dlv_grp_flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
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
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($term_fr.equalsIgnoreCase(name)) {
			term_fr(value);
			return;
		}
		if ($term_to.equalsIgnoreCase(name)) {
			term_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cmn_flg.equalsIgnoreCase(name)) {
			cmn_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($off_non_calc_flg.equalsIgnoreCase(name)) {
			off_non_calc_flg(value);
			return;
		}
		if ($on_non_calc_flg.equalsIgnoreCase(name)) {
			on_non_calc_flg(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			cst_grp_flg1(value);
			return;
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			cst_grp_flg2(value);
			return;
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			cst_grp_flg3(value);
			return;
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			cst_grp_flg4(value);
			return;
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			cst_grp_flg5(value);
			return;
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			cst_grp_flg6(value);
			return;
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			cst_grp_flg7(value);
			return;
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			cst_grp_flg8(value);
			return;
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			cst_grp_flg9(value);
			return;
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			cst_grp_flg10(value);
			return;
		}
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			dlv_grp_flg1(value);
			return;
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			dlv_grp_flg2(value);
			return;
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			dlv_grp_flg3(value);
			return;
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			dlv_grp_flg4(value);
			return;
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			dlv_grp_flg5(value);
			return;
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			dlv_grp_flg6(value);
			return;
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			dlv_grp_flg7(value);
			return;
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			dlv_grp_flg8(value);
			return;
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			dlv_grp_flg9(value);
			return;
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			dlv_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

