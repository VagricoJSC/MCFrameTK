package mcframe.serverMSBE.MSBEL1160;

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
	 * Operation type 操作種別.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Supply 支給.<p>
	 *
	 */
	public static final String $prov = "prov";
	/**
	 * Return 返品.<p>
	 *
	 */
	public static final String $prov_rtn = "prov_rtn";
	/**
	 * Non-chargeable supply 無償支給.<p>
	 *
	 */
	public static final String $ffr_prov_flg = "ffr_prov_flg";
	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public static final String $onr_prov_flg = "onr_prov_flg";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public static final String $not_subcon_flg = "not_subcon_flg";
	/**
	 * Delivery note unissued 納品書未発行.<p>
	 *
	 */
	public static final String $dlv_not_prnted = "dlv_not_prnted";
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public static final String $dlv_prnted = "dlv_prnted";
	/**
	 * Acceptance date FROM 検収日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $accpt_dt_fr = "accpt_dt_fr";
	/**
	 * Acceptance date TO 検収日ＴＯ.<p>
	 *
	 */
	public static final String $accpt_dt_to = "accpt_dt_to";
	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ac_ym_fr = "ac_ym_fr";
	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public static final String $ac_ym_to = "ac_ym_to";
	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ac_dt_fr = "ac_dt_fr";
	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public static final String $ac_dt_to = "ac_dt_to";
	/**
	 * Actual receipt date FROM 入荷実績日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $arr_act_dt_fr = "arr_act_dt_fr";
	/**
	 * Actual receipt time FROM 入荷実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $arr_act_hm_fr = "arr_act_hm_fr";
	/**
	 * Actual receipt date TO 入荷実績日ＴＯ.<p>
	 *
	 */
	public static final String $arr_act_dt_to = "arr_act_dt_to";
	/**
	 * Actual receipt time TO 入荷実績時刻ＴＯ.<p>
	 *
	 */
	public static final String $arr_act_hm_to = "arr_act_hm_to";
	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $accpt_schd_dt_fr = "accpt_schd_dt_fr";
	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public static final String $accpt_schd_dt_to = "accpt_schd_dt_to";
	/**
	 * Scheduled receipt date FROM 入荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $arr_schd_dt_fr = "arr_schd_dt_fr";
	/**
	 * Receipt schedule time FROM 入荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $arr_schd_hm_fr = "arr_schd_hm_fr";
	/**
	 * Scheduled receipt date TO 入荷予定日ＴＯ.<p>
	 *
	 */
	public static final String $arr_schd_dt_to = "arr_schd_dt_to";
	/**
	 * Receipt schedule time TO 入荷予定時刻ＴＯ.<p>
	 *
	 */
	public static final String $arr_schd_hm_to = "arr_schd_hm_to";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public static final String $prsppl_cd = "prsppl_cd";
	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public static final String $prsppl_nm = "prsppl_nm";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * Subcontractor location cd. 支給先場所ＣＤ.<p>
	 *
	 */
	public static final String $prsppl_loc_cd = "prsppl_loc_cd";
	/**
	 * Subcontractor location name 支給先場所名.<p>
	 *
	 */
	public static final String $prsppl_loc_nm = "prsppl_loc_nm";
	/**
	 * Subcontractor rack/line cd. 支給先棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $prsppl_str_ln_cd = "prsppl_str_ln_cd";
	/**
	 * Subcontractor rack/line name 支給先棚・ライン名.<p>
	 *
	 */
	public static final String $prsppl_str_ln_nm = "prsppl_str_ln_nm";
	/**
	 * Subcontractor WG cd. 支給先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $prsppl_wg_cd = "prsppl_wg_cd";
	/**
	 * Subcontractor WG name 支給先ワーキンググループ名.<p>
	 *
	 */
	public static final String $prsppl_wg_nm = "prsppl_wg_nm";
	/**
	 * Subcontractor distribution group cd. 支給先物流グループＣＤ.<p>
	 *
	 */
	public static final String $prsppl_lg_grp_cd = "prsppl_lg_grp_cd";
	/**
	 * Subcontractor distribution group name 支給先物流グループ名.<p>
	 *
	 */
	public static final String $prsppl_lg_grp_nm = "prsppl_lg_grp_nm";
	/**
	 * Subcontractor factory/distribution warehouse cd. 支給先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $prsppl_site_cd = "prsppl_site_cd";
	/**
	 * Subcontractor factory/distribution warehouse name 支給先工場・物流倉庫名.<p>
	 *
	 */
	public static final String $prsppl_site_nm = "prsppl_site_nm";
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
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
	 * Foreign currency only 外貨のみ.<p>
	 *
	 */
	public static final String $foreign_flg = "foreign_flg";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public static final String $prov_src_act_typ = "prov_src_act_typ";
	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public static final String $prov_src_act_no = "prov_src_act_no";
	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public static final String $prov_act_no = "prov_act_no";
	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public static final String $prov_src_schd_typ = "prov_src_schd_typ";
	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public static final String $prov_src_schd_no1 = "prov_src_schd_no1";
	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public static final String $prov_src_schd_no2 = "prov_src_schd_no2";
	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public static final String $prov_schd_no = "prov_schd_no";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public static final String $dis_can_disp_flg = "dis_can_disp_flg";
	/**
	 * Reverse the sign of the return amount 返品金額の符号を反転する.<p>
	 *
	 */
	public static final String $sign_rev_flg = "sign_rev_flg";
	/**
	 * Subcontractor classification 1 支給先分類１.<p>
	 *
	 */
	public static final String $prsppl_grp_flg1 = "prsppl_grp_flg1";
	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public static final String $prsppl_grp_cd1 = "prsppl_grp_cd1";
	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public static final String $prsppl_grp_nm1 = "prsppl_grp_nm1";
	/**
	 * Subcontractor classification 2 支給先分類２.<p>
	 *
	 */
	public static final String $prsppl_grp_flg2 = "prsppl_grp_flg2";
	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public static final String $prsppl_grp_cd2 = "prsppl_grp_cd2";
	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public static final String $prsppl_grp_nm2 = "prsppl_grp_nm2";
	/**
	 * Subcontractor classification 3 支給先分類３.<p>
	 *
	 */
	public static final String $prsppl_grp_flg3 = "prsppl_grp_flg3";
	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public static final String $prsppl_grp_cd3 = "prsppl_grp_cd3";
	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public static final String $prsppl_grp_nm3 = "prsppl_grp_nm3";
	/**
	 * Subcontractor classification 4 支給先分類４.<p>
	 *
	 */
	public static final String $prsppl_grp_flg4 = "prsppl_grp_flg4";
	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public static final String $prsppl_grp_cd4 = "prsppl_grp_cd4";
	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public static final String $prsppl_grp_nm4 = "prsppl_grp_nm4";
	/**
	 * Subcontractor classification 5 支給先分類５.<p>
	 *
	 */
	public static final String $prsppl_grp_flg5 = "prsppl_grp_flg5";
	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public static final String $prsppl_grp_cd5 = "prsppl_grp_cd5";
	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public static final String $prsppl_grp_nm5 = "prsppl_grp_nm5";
	/**
	 * Subcontractor classification 6 支給先分類６.<p>
	 *
	 */
	public static final String $prsppl_grp_flg6 = "prsppl_grp_flg6";
	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public static final String $prsppl_grp_cd6 = "prsppl_grp_cd6";
	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public static final String $prsppl_grp_nm6 = "prsppl_grp_nm6";
	/**
	 * Subcontractor classification 7 支給先分類７.<p>
	 *
	 */
	public static final String $prsppl_grp_flg7 = "prsppl_grp_flg7";
	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public static final String $prsppl_grp_cd7 = "prsppl_grp_cd7";
	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public static final String $prsppl_grp_nm7 = "prsppl_grp_nm7";
	/**
	 * Subcontractor classification 8 支給先分類８.<p>
	 *
	 */
	public static final String $prsppl_grp_flg8 = "prsppl_grp_flg8";
	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public static final String $prsppl_grp_cd8 = "prsppl_grp_cd8";
	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public static final String $prsppl_grp_nm8 = "prsppl_grp_nm8";
	/**
	 * Subcontractor classification 9 支給先分類９.<p>
	 *
	 */
	public static final String $prsppl_grp_flg9 = "prsppl_grp_flg9";
	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public static final String $prsppl_grp_cd9 = "prsppl_grp_cd9";
	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public static final String $prsppl_grp_nm9 = "prsppl_grp_nm9";
	/**
	 * Subcontractor classification 10 支給先分類１０.<p>
	 *
	 */
	public static final String $prsppl_grp_flg10 = "prsppl_grp_flg10";
	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $prsppl_grp_cd10 = "prsppl_grp_cd10";
	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public static final String $prsppl_grp_nm10 = "prsppl_grp_nm10";
	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public static final String $itm_grp_flg1 = "itm_grp_flg1";
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
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public static final String $itm_grp_flg2 = "itm_grp_flg2";
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
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public static final String $itm_grp_flg3 = "itm_grp_flg3";
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
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public static final String $itm_grp_flg4 = "itm_grp_flg4";
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
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public static final String $itm_grp_flg5 = "itm_grp_flg5";
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
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public static final String $itm_grp_flg6 = "itm_grp_flg6";
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
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public static final String $itm_grp_flg7 = "itm_grp_flg7";
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
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public static final String $itm_grp_flg8 = "itm_grp_flg8";
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
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public static final String $itm_grp_flg9 = "itm_grp_flg9";
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
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public static final String $itm_grp_flg10 = "itm_grp_flg10";
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
	 * for EDI ＥＤＩ対象.対象.<p>
	 *
	 */
	public static final String $on_edi_flg = "on_edi_flg";
	/**
	 * Not for EDI ＥＤＩ対象.対象外.<p>
	 *
	 */
	public static final String $off_edi_flg = "off_edi_flg";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta prov_META = createCommonMeta($prov, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_rtn_META = createCommonMeta($prov_rtn, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ffr_prov_flg_META = createCommonMeta($ffr_prov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta onr_prov_flg_META = createCommonMeta($onr_prov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_subcon_flg_META = createCommonMeta($not_subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_not_prnted_META = createCommonMeta($dlv_not_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_prnted_META = createCommonMeta($dlv_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta accpt_dt_fr_META = createCommonMeta($accpt_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_dt_to_META = createCommonMeta($accpt_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_fr_META = createCommonMeta($ac_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_ym_to_META = createCommonMeta($ac_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_act_dt_fr_META = createCommonMeta($arr_act_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_act_hm_fr_META = createCommonMeta($arr_act_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta arr_act_dt_to_META = createCommonMeta($arr_act_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_act_hm_to_META = createCommonMeta($arr_act_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta accpt_schd_dt_fr_META = createCommonMeta($accpt_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_schd_dt_to_META = createCommonMeta($accpt_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_dt_fr_META = createCommonMeta($arr_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_hm_fr_META = createCommonMeta($arr_schd_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta arr_schd_dt_to_META = createCommonMeta($arr_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_hm_to_META = createCommonMeta($arr_schd_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta prsppl_cd_META = createCommonMeta($prsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prsppl_nm_META = createCommonMeta($prsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta prsppl_loc_cd_META = createCommonMeta($prsppl_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta prsppl_loc_nm_META = createCommonMeta($prsppl_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta prsppl_str_ln_cd_META = createCommonMeta($prsppl_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta prsppl_str_ln_nm_META = createCommonMeta($prsppl_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta prsppl_wg_cd_META = createCommonMeta($prsppl_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta prsppl_wg_nm_META = createCommonMeta($prsppl_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta prsppl_lg_grp_cd_META = createCommonMeta($prsppl_lg_grp_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta prsppl_lg_grp_nm_META = createCommonMeta($prsppl_lg_grp_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta prsppl_site_cd_META = createCommonMeta($prsppl_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta prsppl_site_nm_META = createCommonMeta($prsppl_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta foreign_flg_META = createCommonMeta($foreign_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta prov_src_act_typ_META = createCommonMeta($prov_src_act_typ, mcframe.commonMS.meta.MS_META.PROV_SRC_ACT_TYP);
	public static final MCMeta prov_src_act_no_META = createCommonMeta($prov_src_act_no, mcframe.commonMA.meta.MA_META.PROV_SRC_ACT_NO);
	public static final MCMeta prov_act_no_META = createCommonMeta($prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta prov_src_schd_typ_META = createCommonMeta($prov_src_schd_typ, mcframe.commonMS.meta.MS_META.PROV_SRC_SCHD_TYP);
	public static final MCMeta prov_src_schd_no1_META = createCommonMeta($prov_src_schd_no1, mcframe.commonMA.meta.MA_META.PROV_SRC_SCHD_NO);
	public static final MCMeta prov_src_schd_no2_META = createCommonMeta($prov_src_schd_no2, mcframe.commonMA.meta.MA_META.PROV_SRC_SCHD_NO);
	public static final MCMeta prov_schd_no_META = createCommonMeta($prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PROV_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PROV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PROV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PROV_ACT_SUB_CHAR3);
	public static final MCMeta dis_can_disp_flg_META = createCommonMeta($dis_can_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sign_rev_flg_META = createCommonMeta($sign_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_flg1_META = createCommonMeta($prsppl_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd1_META = createCommonMeta($prsppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm1_META = createCommonMeta($prsppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg2_META = createCommonMeta($prsppl_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd2_META = createCommonMeta($prsppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm2_META = createCommonMeta($prsppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg3_META = createCommonMeta($prsppl_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd3_META = createCommonMeta($prsppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm3_META = createCommonMeta($prsppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg4_META = createCommonMeta($prsppl_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd4_META = createCommonMeta($prsppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm4_META = createCommonMeta($prsppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg5_META = createCommonMeta($prsppl_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd5_META = createCommonMeta($prsppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm5_META = createCommonMeta($prsppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg6_META = createCommonMeta($prsppl_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd6_META = createCommonMeta($prsppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm6_META = createCommonMeta($prsppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg7_META = createCommonMeta($prsppl_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd7_META = createCommonMeta($prsppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm7_META = createCommonMeta($prsppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg8_META = createCommonMeta($prsppl_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd8_META = createCommonMeta($prsppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm8_META = createCommonMeta($prsppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg9_META = createCommonMeta($prsppl_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd9_META = createCommonMeta($prsppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm9_META = createCommonMeta($prsppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg10_META = createCommonMeta($prsppl_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd10_META = createCommonMeta($prsppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm10_META = createCommonMeta($prsppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta itm_grp_flg1_META = createCommonMeta($itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg2_META = createCommonMeta($itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg3_META = createCommonMeta($itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg4_META = createCommonMeta($itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg5_META = createCommonMeta($itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg6_META = createCommonMeta($itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg7_META = createCommonMeta($itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg8_META = createCommonMeta($itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg9_META = createCommonMeta($itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg10_META = createCommonMeta($itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta on_edi_flg_META = createCommonMeta($on_edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta off_edi_flg_META = createCommonMeta($off_edi_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			prov_META,
			prov_rtn_META,
			ffr_prov_flg_META,
			onr_prov_flg_META,
			subcon_flg_META,
			not_subcon_flg_META,
			dlv_not_prnted_META,
			dlv_prnted_META,
			accpt_dt_fr_META,
			accpt_dt_to_META,
			ac_ym_fr_META,
			ac_ym_to_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			arr_act_dt_fr_META,
			arr_act_hm_fr_META,
			arr_act_dt_to_META,
			arr_act_hm_to_META,
			accpt_schd_dt_fr_META,
			accpt_schd_dt_to_META,
			arr_schd_dt_fr_META,
			arr_schd_hm_fr_META,
			arr_schd_dt_to_META,
			arr_schd_hm_to_META,
			trd_cd_META,
			trd_nm_META,
			prsppl_cd_META,
			prsppl_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			prsppl_loc_cd_META,
			prsppl_loc_nm_META,
			prsppl_str_ln_cd_META,
			prsppl_str_ln_nm_META,
			prsppl_wg_cd_META,
			prsppl_wg_nm_META,
			prsppl_lg_grp_cd_META,
			prsppl_lg_grp_nm_META,
			prsppl_site_cd_META,
			prsppl_site_nm_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ver_no_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			gd_cd_META,
			gd_nm_META,
			stk_id_typ_META,
			prov_basis_typ_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			foreign_flg_META,
			tax_cd_META,
			tax_nm_META,
			prov_src_act_typ_META,
			prov_src_act_no_META,
			prov_act_no_META,
			prov_src_schd_typ_META,
			prov_src_schd_no1_META,
			prov_src_schd_no2_META,
			prov_schd_no_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			dis_can_disp_flg_META,
			sign_rev_flg_META,
			prsppl_grp_flg1_META,
			prsppl_grp_cd1_META,
			prsppl_grp_nm1_META,
			prsppl_grp_flg2_META,
			prsppl_grp_cd2_META,
			prsppl_grp_nm2_META,
			prsppl_grp_flg3_META,
			prsppl_grp_cd3_META,
			prsppl_grp_nm3_META,
			prsppl_grp_flg4_META,
			prsppl_grp_cd4_META,
			prsppl_grp_nm4_META,
			prsppl_grp_flg5_META,
			prsppl_grp_cd5_META,
			prsppl_grp_nm5_META,
			prsppl_grp_flg6_META,
			prsppl_grp_cd6_META,
			prsppl_grp_nm6_META,
			prsppl_grp_flg7_META,
			prsppl_grp_cd7_META,
			prsppl_grp_nm7_META,
			prsppl_grp_flg8_META,
			prsppl_grp_cd8_META,
			prsppl_grp_nm8_META,
			prsppl_grp_flg9_META,
			prsppl_grp_cd9_META,
			prsppl_grp_nm9_META,
			prsppl_grp_flg10_META,
			prsppl_grp_cd10_META,
			prsppl_grp_nm10_META,
			itm_grp_flg1_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_flg2_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_flg3_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_flg4_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_flg5_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_flg6_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_flg7_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_flg8_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_flg9_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_flg10_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			on_edi_flg_META,
			off_edi_flg_META
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
	 * Operation type 操作種別.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Supply 支給.<p>
	 *
	 */
	public boolean prov() {
		return getConstBoolean(offset + 1, $prov);
	}

	/**
	 * Supply 支給.<p>
	 *
	 */
	public void prov(boolean value) {
		setConstBoolean(offset + 1, $prov, value);
	}


	/**
	 * Return 返品.<p>
	 *
	 */
	public boolean prov_rtn() {
		return getConstBoolean(offset + 2, $prov_rtn);
	}

	/**
	 * Return 返品.<p>
	 *
	 */
	public void prov_rtn(boolean value) {
		setConstBoolean(offset + 2, $prov_rtn, value);
	}


	/**
	 * Non-chargeable supply 無償支給.<p>
	 *
	 */
	public boolean ffr_prov_flg() {
		return getConstBoolean(offset + 3, $ffr_prov_flg);
	}

	/**
	 * Non-chargeable supply 無償支給.<p>
	 *
	 */
	public void ffr_prov_flg(boolean value) {
		setConstBoolean(offset + 3, $ffr_prov_flg, value);
	}


	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public boolean onr_prov_flg() {
		return getConstBoolean(offset + 4, $onr_prov_flg);
	}

	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public void onr_prov_flg(boolean value) {
		setConstBoolean(offset + 4, $onr_prov_flg, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 5, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 5, $subcon_flg, value);
	}


	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public boolean not_subcon_flg() {
		return getConstBoolean(offset + 6, $not_subcon_flg);
	}

	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public void not_subcon_flg(boolean value) {
		setConstBoolean(offset + 6, $not_subcon_flg, value);
	}


	/**
	 * Delivery note unissued 納品書未発行.<p>
	 *
	 */
	public boolean dlv_not_prnted() {
		return getConstBoolean(offset + 7, $dlv_not_prnted);
	}

	/**
	 * Delivery note unissued 納品書未発行.<p>
	 *
	 */
	public void dlv_not_prnted(boolean value) {
		setConstBoolean(offset + 7, $dlv_not_prnted, value);
	}


	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public boolean dlv_prnted() {
		return getConstBoolean(offset + 8, $dlv_prnted);
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public void dlv_prnted(boolean value) {
		setConstBoolean(offset + 8, $dlv_prnted, value);
	}


	/**
	 * Acceptance date FROM 検収日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate accpt_dt_fr() {
		return getConstDate(offset + 9, $accpt_dt_fr);
	}

	/**
	 * Acceptance date FROM 検収日ＦＲＯＭ.<p>
	 *
	 */
	public void accpt_dt_fr(MCDate value) {
		setConstDate(offset + 9, $accpt_dt_fr, value);
	}


	/**
	 * Acceptance date TO 検収日ＴＯ.<p>
	 *
	 */
	public MCDate accpt_dt_to() {
		return getConstDate(offset + 10, $accpt_dt_to);
	}

	/**
	 * Acceptance date TO 検収日ＴＯ.<p>
	 *
	 */
	public void accpt_dt_to(MCDate value) {
		setConstDate(offset + 10, $accpt_dt_to, value);
	}


	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_ym_fr() {
		return getConstDate(offset + 11, $ac_ym_fr);
	}

	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public void ac_ym_fr(MCDate value) {
		setConstDate(offset + 11, $ac_ym_fr, value);
	}


	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public MCDate ac_ym_to() {
		return getConstDate(offset + 12, $ac_ym_to);
	}

	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public void ac_ym_to(MCDate value) {
		setConstDate(offset + 12, $ac_ym_to, value);
	}


	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 13, $ac_dt_fr);
	}

	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 13, $ac_dt_fr, value);
	}


	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 14, $ac_dt_to);
	}

	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 14, $ac_dt_to, value);
	}


	/**
	 * Actual receipt date FROM 入荷実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_act_dt_fr() {
		return getConstDate(offset + 15, $arr_act_dt_fr);
	}

	/**
	 * Actual receipt date FROM 入荷実績日ＦＲＯＭ.<p>
	 *
	 */
	public void arr_act_dt_fr(MCDate value) {
		setConstDate(offset + 15, $arr_act_dt_fr, value);
	}


	/**
	 * Actual receipt time FROM 入荷実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_act_hm_fr() {
		return getConstDate(offset + 16, $arr_act_hm_fr);
	}

	/**
	 * Actual receipt time FROM 入荷実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public void arr_act_hm_fr(MCDate value) {
		setConstDate(offset + 16, $arr_act_hm_fr, value);
	}


	/**
	 * Actual receipt date TO 入荷実績日ＴＯ.<p>
	 *
	 */
	public MCDate arr_act_dt_to() {
		return getConstDate(offset + 17, $arr_act_dt_to);
	}

	/**
	 * Actual receipt date TO 入荷実績日ＴＯ.<p>
	 *
	 */
	public void arr_act_dt_to(MCDate value) {
		setConstDate(offset + 17, $arr_act_dt_to, value);
	}


	/**
	 * Actual receipt time TO 入荷実績時刻ＴＯ.<p>
	 *
	 */
	public MCDate arr_act_hm_to() {
		return getConstDate(offset + 18, $arr_act_hm_to);
	}

	/**
	 * Actual receipt time TO 入荷実績時刻ＴＯ.<p>
	 *
	 */
	public void arr_act_hm_to(MCDate value) {
		setConstDate(offset + 18, $arr_act_hm_to, value);
	}


	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate accpt_schd_dt_fr() {
		return getConstDate(offset + 19, $accpt_schd_dt_fr);
	}

	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public void accpt_schd_dt_fr(MCDate value) {
		setConstDate(offset + 19, $accpt_schd_dt_fr, value);
	}


	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public MCDate accpt_schd_dt_to() {
		return getConstDate(offset + 20, $accpt_schd_dt_to);
	}

	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public void accpt_schd_dt_to(MCDate value) {
		setConstDate(offset + 20, $accpt_schd_dt_to, value);
	}


	/**
	 * Scheduled receipt date FROM 入荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_schd_dt_fr() {
		return getConstDate(offset + 21, $arr_schd_dt_fr);
	}

	/**
	 * Scheduled receipt date FROM 入荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public void arr_schd_dt_fr(MCDate value) {
		setConstDate(offset + 21, $arr_schd_dt_fr, value);
	}


	/**
	 * Receipt schedule time FROM 入荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_schd_hm_fr() {
		return getConstDate(offset + 22, $arr_schd_hm_fr);
	}

	/**
	 * Receipt schedule time FROM 入荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void arr_schd_hm_fr(MCDate value) {
		setConstDate(offset + 22, $arr_schd_hm_fr, value);
	}


	/**
	 * Scheduled receipt date TO 入荷予定日ＴＯ.<p>
	 *
	 */
	public MCDate arr_schd_dt_to() {
		return getConstDate(offset + 23, $arr_schd_dt_to);
	}

	/**
	 * Scheduled receipt date TO 入荷予定日ＴＯ.<p>
	 *
	 */
	public void arr_schd_dt_to(MCDate value) {
		setConstDate(offset + 23, $arr_schd_dt_to, value);
	}


	/**
	 * Receipt schedule time TO 入荷予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate arr_schd_hm_to() {
		return getConstDate(offset + 24, $arr_schd_hm_to);
	}

	/**
	 * Receipt schedule time TO 入荷予定時刻ＴＯ.<p>
	 *
	 */
	public void arr_schd_hm_to(MCDate value) {
		setConstDate(offset + 24, $arr_schd_hm_to, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 25, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 25, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 26, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 26, $trd_nm, value);
	}


	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public String prsppl_cd() {
		return getConstString(offset + 27, $prsppl_cd);
	}

	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public void prsppl_cd(String value) {
		setConstString(offset + 27, $prsppl_cd, value);
	}


	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public String prsppl_nm() {
		return getConstString(offset + 28, $prsppl_nm);
	}

	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public void prsppl_nm(String value) {
		setConstString(offset + 28, $prsppl_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 29, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 29, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 30, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 30, $ap_dpt_nm, value);
	}


	/**
	 * Subcontractor location cd. 支給先場所ＣＤ.<p>
	 *
	 */
	public String prsppl_loc_cd() {
		return getConstString(offset + 31, $prsppl_loc_cd);
	}

	/**
	 * Subcontractor location cd. 支給先場所ＣＤ.<p>
	 *
	 */
	public void prsppl_loc_cd(String value) {
		setConstString(offset + 31, $prsppl_loc_cd, value);
	}


	/**
	 * Subcontractor location name 支給先場所名.<p>
	 *
	 */
	public String prsppl_loc_nm() {
		return getConstString(offset + 32, $prsppl_loc_nm);
	}

	/**
	 * Subcontractor location name 支給先場所名.<p>
	 *
	 */
	public void prsppl_loc_nm(String value) {
		setConstString(offset + 32, $prsppl_loc_nm, value);
	}


	/**
	 * Subcontractor rack/line cd. 支給先棚・ラインＣＤ.<p>
	 *
	 */
	public String prsppl_str_ln_cd() {
		return getConstString(offset + 33, $prsppl_str_ln_cd);
	}

	/**
	 * Subcontractor rack/line cd. 支給先棚・ラインＣＤ.<p>
	 *
	 */
	public void prsppl_str_ln_cd(String value) {
		setConstString(offset + 33, $prsppl_str_ln_cd, value);
	}


	/**
	 * Subcontractor rack/line name 支給先棚・ライン名.<p>
	 *
	 */
	public String prsppl_str_ln_nm() {
		return getConstString(offset + 34, $prsppl_str_ln_nm);
	}

	/**
	 * Subcontractor rack/line name 支給先棚・ライン名.<p>
	 *
	 */
	public void prsppl_str_ln_nm(String value) {
		setConstString(offset + 34, $prsppl_str_ln_nm, value);
	}


	/**
	 * Subcontractor WG cd. 支給先ワーキンググループＣＤ.<p>
	 *
	 */
	public String prsppl_wg_cd() {
		return getConstString(offset + 35, $prsppl_wg_cd);
	}

	/**
	 * Subcontractor WG cd. 支給先ワーキンググループＣＤ.<p>
	 *
	 */
	public void prsppl_wg_cd(String value) {
		setConstString(offset + 35, $prsppl_wg_cd, value);
	}


	/**
	 * Subcontractor WG name 支給先ワーキンググループ名.<p>
	 *
	 */
	public String prsppl_wg_nm() {
		return getConstString(offset + 36, $prsppl_wg_nm);
	}

	/**
	 * Subcontractor WG name 支給先ワーキンググループ名.<p>
	 *
	 */
	public void prsppl_wg_nm(String value) {
		setConstString(offset + 36, $prsppl_wg_nm, value);
	}


	/**
	 * Subcontractor distribution group cd. 支給先物流グループＣＤ.<p>
	 *
	 */
	public String prsppl_lg_grp_cd() {
		return getConstString(offset + 37, $prsppl_lg_grp_cd);
	}

	/**
	 * Subcontractor distribution group cd. 支給先物流グループＣＤ.<p>
	 *
	 */
	public void prsppl_lg_grp_cd(String value) {
		setConstString(offset + 37, $prsppl_lg_grp_cd, value);
	}


	/**
	 * Subcontractor distribution group name 支給先物流グループ名.<p>
	 *
	 */
	public String prsppl_lg_grp_nm() {
		return getConstString(offset + 38, $prsppl_lg_grp_nm);
	}

	/**
	 * Subcontractor distribution group name 支給先物流グループ名.<p>
	 *
	 */
	public void prsppl_lg_grp_nm(String value) {
		setConstString(offset + 38, $prsppl_lg_grp_nm, value);
	}


	/**
	 * Subcontractor factory/distribution warehouse cd. 支給先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String prsppl_site_cd() {
		return getConstString(offset + 39, $prsppl_site_cd);
	}

	/**
	 * Subcontractor factory/distribution warehouse cd. 支給先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void prsppl_site_cd(String value) {
		setConstString(offset + 39, $prsppl_site_cd, value);
	}


	/**
	 * Subcontractor factory/distribution warehouse name 支給先工場・物流倉庫名.<p>
	 *
	 */
	public String prsppl_site_nm() {
		return getConstString(offset + 40, $prsppl_site_nm);
	}

	/**
	 * Subcontractor factory/distribution warehouse name 支給先工場・物流倉庫名.<p>
	 *
	 */
	public void prsppl_site_nm(String value) {
		setConstString(offset + 40, $prsppl_site_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 41, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 41, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 42, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 42, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 43, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 43, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 44, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 44, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 45, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 45, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 46, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 46, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 47, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 47, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 48, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 48, $itm_nm, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 49, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 49, $ver_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 50, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 50, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 51, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 51, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 52, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 52, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 53, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 53, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 54, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 54, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 55, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 55, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 56, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 56, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 57, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 57, $wrk_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 58, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 58, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 59, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 59, $gd_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 60, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 60, $stk_id_typ, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 61, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 61, $prov_basis_typ, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 62, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 62, $dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 63, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 63, $dlv_slip_d_no, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 64, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 64, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 65, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 65, $trd_cur_nm, value);
	}


	/**
	 * Foreign currency only 外貨のみ.<p>
	 *
	 */
	public boolean foreign_flg() {
		return getConstBoolean(offset + 66, $foreign_flg);
	}

	/**
	 * Foreign currency only 外貨のみ.<p>
	 *
	 */
	public void foreign_flg(boolean value) {
		setConstBoolean(offset + 66, $foreign_flg, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 67, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 67, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 68, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 68, $tax_nm, value);
	}


	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public String prov_src_act_typ() {
		return getConstString(offset + 69, $prov_src_act_typ);
	}

	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public void prov_src_act_typ(String value) {
		setConstString(offset + 69, $prov_src_act_typ, value);
	}


	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public String prov_src_act_no() {
		return getConstString(offset + 70, $prov_src_act_no);
	}

	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public void prov_src_act_no(String value) {
		setConstString(offset + 70, $prov_src_act_no, value);
	}


	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public String prov_act_no() {
		return getConstString(offset + 71, $prov_act_no);
	}

	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public void prov_act_no(String value) {
		setConstString(offset + 71, $prov_act_no, value);
	}


	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public String prov_src_schd_typ() {
		return getConstString(offset + 72, $prov_src_schd_typ);
	}

	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public void prov_src_schd_typ(String value) {
		setConstString(offset + 72, $prov_src_schd_typ, value);
	}


	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public String prov_src_schd_no1() {
		return getConstString(offset + 73, $prov_src_schd_no1);
	}

	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public void prov_src_schd_no1(String value) {
		setConstString(offset + 73, $prov_src_schd_no1, value);
	}


	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public String prov_src_schd_no2() {
		return getConstString(offset + 74, $prov_src_schd_no2);
	}

	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public void prov_src_schd_no2(String value) {
		setConstString(offset + 74, $prov_src_schd_no2, value);
	}


	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public String prov_schd_no() {
		return getConstString(offset + 75, $prov_schd_no);
	}

	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public void prov_schd_no(String value) {
		setConstString(offset + 75, $prov_schd_no, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 76, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 76, $trd_d_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 77, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 77, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 78, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 78, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 79, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 79, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 80, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 80, $sub_char3, value);
	}


	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public boolean dis_can_disp_flg() {
		return getConstBoolean(offset + 81, $dis_can_disp_flg);
	}

	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public void dis_can_disp_flg(boolean value) {
		setConstBoolean(offset + 81, $dis_can_disp_flg, value);
	}


	/**
	 * Reverse the sign of the return amount 返品金額の符号を反転する.<p>
	 *
	 */
	public boolean sign_rev_flg() {
		return getConstBoolean(offset + 82, $sign_rev_flg);
	}

	/**
	 * Reverse the sign of the return amount 返品金額の符号を反転する.<p>
	 *
	 */
	public void sign_rev_flg(boolean value) {
		setConstBoolean(offset + 82, $sign_rev_flg, value);
	}


	/**
	 * Subcontractor classification 1 支給先分類１.<p>
	 *
	 */
	public boolean prsppl_grp_flg1() {
		return getConstBoolean(offset + 83, $prsppl_grp_flg1);
	}

	/**
	 * Subcontractor classification 1 支給先分類１.<p>
	 *
	 */
	public void prsppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 83, $prsppl_grp_flg1, value);
	}


	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public String prsppl_grp_cd1() {
		return getConstString(offset + 84, $prsppl_grp_cd1);
	}

	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public void prsppl_grp_cd1(String value) {
		setConstString(offset + 84, $prsppl_grp_cd1, value);
	}


	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public String prsppl_grp_nm1() {
		return getConstString(offset + 85, $prsppl_grp_nm1);
	}

	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public void prsppl_grp_nm1(String value) {
		setConstString(offset + 85, $prsppl_grp_nm1, value);
	}


	/**
	 * Subcontractor classification 2 支給先分類２.<p>
	 *
	 */
	public boolean prsppl_grp_flg2() {
		return getConstBoolean(offset + 86, $prsppl_grp_flg2);
	}

	/**
	 * Subcontractor classification 2 支給先分類２.<p>
	 *
	 */
	public void prsppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 86, $prsppl_grp_flg2, value);
	}


	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public String prsppl_grp_cd2() {
		return getConstString(offset + 87, $prsppl_grp_cd2);
	}

	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public void prsppl_grp_cd2(String value) {
		setConstString(offset + 87, $prsppl_grp_cd2, value);
	}


	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public String prsppl_grp_nm2() {
		return getConstString(offset + 88, $prsppl_grp_nm2);
	}

	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public void prsppl_grp_nm2(String value) {
		setConstString(offset + 88, $prsppl_grp_nm2, value);
	}


	/**
	 * Subcontractor classification 3 支給先分類３.<p>
	 *
	 */
	public boolean prsppl_grp_flg3() {
		return getConstBoolean(offset + 89, $prsppl_grp_flg3);
	}

	/**
	 * Subcontractor classification 3 支給先分類３.<p>
	 *
	 */
	public void prsppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 89, $prsppl_grp_flg3, value);
	}


	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public String prsppl_grp_cd3() {
		return getConstString(offset + 90, $prsppl_grp_cd3);
	}

	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public void prsppl_grp_cd3(String value) {
		setConstString(offset + 90, $prsppl_grp_cd3, value);
	}


	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public String prsppl_grp_nm3() {
		return getConstString(offset + 91, $prsppl_grp_nm3);
	}

	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public void prsppl_grp_nm3(String value) {
		setConstString(offset + 91, $prsppl_grp_nm3, value);
	}


	/**
	 * Subcontractor classification 4 支給先分類４.<p>
	 *
	 */
	public boolean prsppl_grp_flg4() {
		return getConstBoolean(offset + 92, $prsppl_grp_flg4);
	}

	/**
	 * Subcontractor classification 4 支給先分類４.<p>
	 *
	 */
	public void prsppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 92, $prsppl_grp_flg4, value);
	}


	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public String prsppl_grp_cd4() {
		return getConstString(offset + 93, $prsppl_grp_cd4);
	}

	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public void prsppl_grp_cd4(String value) {
		setConstString(offset + 93, $prsppl_grp_cd4, value);
	}


	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public String prsppl_grp_nm4() {
		return getConstString(offset + 94, $prsppl_grp_nm4);
	}

	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public void prsppl_grp_nm4(String value) {
		setConstString(offset + 94, $prsppl_grp_nm4, value);
	}


	/**
	 * Subcontractor classification 5 支給先分類５.<p>
	 *
	 */
	public boolean prsppl_grp_flg5() {
		return getConstBoolean(offset + 95, $prsppl_grp_flg5);
	}

	/**
	 * Subcontractor classification 5 支給先分類５.<p>
	 *
	 */
	public void prsppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 95, $prsppl_grp_flg5, value);
	}


	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public String prsppl_grp_cd5() {
		return getConstString(offset + 96, $prsppl_grp_cd5);
	}

	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public void prsppl_grp_cd5(String value) {
		setConstString(offset + 96, $prsppl_grp_cd5, value);
	}


	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public String prsppl_grp_nm5() {
		return getConstString(offset + 97, $prsppl_grp_nm5);
	}

	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public void prsppl_grp_nm5(String value) {
		setConstString(offset + 97, $prsppl_grp_nm5, value);
	}


	/**
	 * Subcontractor classification 6 支給先分類６.<p>
	 *
	 */
	public boolean prsppl_grp_flg6() {
		return getConstBoolean(offset + 98, $prsppl_grp_flg6);
	}

	/**
	 * Subcontractor classification 6 支給先分類６.<p>
	 *
	 */
	public void prsppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 98, $prsppl_grp_flg6, value);
	}


	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public String prsppl_grp_cd6() {
		return getConstString(offset + 99, $prsppl_grp_cd6);
	}

	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public void prsppl_grp_cd6(String value) {
		setConstString(offset + 99, $prsppl_grp_cd6, value);
	}


	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public String prsppl_grp_nm6() {
		return getConstString(offset + 100, $prsppl_grp_nm6);
	}

	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public void prsppl_grp_nm6(String value) {
		setConstString(offset + 100, $prsppl_grp_nm6, value);
	}


	/**
	 * Subcontractor classification 7 支給先分類７.<p>
	 *
	 */
	public boolean prsppl_grp_flg7() {
		return getConstBoolean(offset + 101, $prsppl_grp_flg7);
	}

	/**
	 * Subcontractor classification 7 支給先分類７.<p>
	 *
	 */
	public void prsppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 101, $prsppl_grp_flg7, value);
	}


	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public String prsppl_grp_cd7() {
		return getConstString(offset + 102, $prsppl_grp_cd7);
	}

	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public void prsppl_grp_cd7(String value) {
		setConstString(offset + 102, $prsppl_grp_cd7, value);
	}


	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public String prsppl_grp_nm7() {
		return getConstString(offset + 103, $prsppl_grp_nm7);
	}

	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public void prsppl_grp_nm7(String value) {
		setConstString(offset + 103, $prsppl_grp_nm7, value);
	}


	/**
	 * Subcontractor classification 8 支給先分類８.<p>
	 *
	 */
	public boolean prsppl_grp_flg8() {
		return getConstBoolean(offset + 104, $prsppl_grp_flg8);
	}

	/**
	 * Subcontractor classification 8 支給先分類８.<p>
	 *
	 */
	public void prsppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 104, $prsppl_grp_flg8, value);
	}


	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public String prsppl_grp_cd8() {
		return getConstString(offset + 105, $prsppl_grp_cd8);
	}

	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public void prsppl_grp_cd8(String value) {
		setConstString(offset + 105, $prsppl_grp_cd8, value);
	}


	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public String prsppl_grp_nm8() {
		return getConstString(offset + 106, $prsppl_grp_nm8);
	}

	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public void prsppl_grp_nm8(String value) {
		setConstString(offset + 106, $prsppl_grp_nm8, value);
	}


	/**
	 * Subcontractor classification 9 支給先分類９.<p>
	 *
	 */
	public boolean prsppl_grp_flg9() {
		return getConstBoolean(offset + 107, $prsppl_grp_flg9);
	}

	/**
	 * Subcontractor classification 9 支給先分類９.<p>
	 *
	 */
	public void prsppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 107, $prsppl_grp_flg9, value);
	}


	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public String prsppl_grp_cd9() {
		return getConstString(offset + 108, $prsppl_grp_cd9);
	}

	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public void prsppl_grp_cd9(String value) {
		setConstString(offset + 108, $prsppl_grp_cd9, value);
	}


	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public String prsppl_grp_nm9() {
		return getConstString(offset + 109, $prsppl_grp_nm9);
	}

	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public void prsppl_grp_nm9(String value) {
		setConstString(offset + 109, $prsppl_grp_nm9, value);
	}


	/**
	 * Subcontractor classification 10 支給先分類１０.<p>
	 *
	 */
	public boolean prsppl_grp_flg10() {
		return getConstBoolean(offset + 110, $prsppl_grp_flg10);
	}

	/**
	 * Subcontractor classification 10 支給先分類１０.<p>
	 *
	 */
	public void prsppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 110, $prsppl_grp_flg10, value);
	}


	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public String prsppl_grp_cd10() {
		return getConstString(offset + 111, $prsppl_grp_cd10);
	}

	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public void prsppl_grp_cd10(String value) {
		setConstString(offset + 111, $prsppl_grp_cd10, value);
	}


	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public String prsppl_grp_nm10() {
		return getConstString(offset + 112, $prsppl_grp_nm10);
	}

	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public void prsppl_grp_nm10(String value) {
		setConstString(offset + 112, $prsppl_grp_nm10, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 113, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 113, $itm_grp_flg1, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 114, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 114, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 115, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 115, $itm_grp_nm1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 116, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 116, $itm_grp_flg2, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 117, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 117, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 118, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 118, $itm_grp_nm2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 119, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 119, $itm_grp_flg3, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 120, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 120, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 121, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 121, $itm_grp_nm3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 122, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 122, $itm_grp_flg4, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 123, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 123, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 124, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 124, $itm_grp_nm4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 125, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 125, $itm_grp_flg5, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 126, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 126, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 127, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 127, $itm_grp_nm5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 128, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 128, $itm_grp_flg6, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 129, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 129, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 130, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 130, $itm_grp_nm6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 131, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 131, $itm_grp_flg7, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 132, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 132, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 133, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 133, $itm_grp_nm7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 134, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 134, $itm_grp_flg8, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 135, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 135, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 136, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 136, $itm_grp_nm8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 137, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 137, $itm_grp_flg9, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 138, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 138, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 139, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 139, $itm_grp_nm9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 140, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 140, $itm_grp_flg10, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 141, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 141, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 142, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 142, $itm_grp_nm10, value);
	}


	/**
	 * for EDI ＥＤＩ対象.対象.<p>
	 *
	 */
	public boolean on_edi_flg() {
		return getConstBoolean(offset + 143, $on_edi_flg);
	}

	/**
	 * for EDI ＥＤＩ対象.対象.<p>
	 *
	 */
	public void on_edi_flg(boolean value) {
		setConstBoolean(offset + 143, $on_edi_flg, value);
	}


	/**
	 * Not for EDI ＥＤＩ対象.対象外.<p>
	 *
	 */
	public boolean off_edi_flg() {
		return getConstBoolean(offset + 144, $off_edi_flg);
	}

	/**
	 * Not for EDI ＥＤＩ対象.対象外.<p>
	 *
	 */
	public void off_edi_flg(boolean value) {
		setConstBoolean(offset + 144, $off_edi_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($prsppl_loc_cd.equalsIgnoreCase(name)) {
			return prsppl_loc_cd();
		}
		if ($prsppl_loc_nm.equalsIgnoreCase(name)) {
			return prsppl_loc_nm();
		}
		if ($prsppl_str_ln_cd.equalsIgnoreCase(name)) {
			return prsppl_str_ln_cd();
		}
		if ($prsppl_str_ln_nm.equalsIgnoreCase(name)) {
			return prsppl_str_ln_nm();
		}
		if ($prsppl_wg_cd.equalsIgnoreCase(name)) {
			return prsppl_wg_cd();
		}
		if ($prsppl_wg_nm.equalsIgnoreCase(name)) {
			return prsppl_wg_nm();
		}
		if ($prsppl_lg_grp_cd.equalsIgnoreCase(name)) {
			return prsppl_lg_grp_cd();
		}
		if ($prsppl_lg_grp_nm.equalsIgnoreCase(name)) {
			return prsppl_lg_grp_nm();
		}
		if ($prsppl_site_cd.equalsIgnoreCase(name)) {
			return prsppl_site_cd();
		}
		if ($prsppl_site_nm.equalsIgnoreCase(name)) {
			return prsppl_site_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			return prov_src_act_typ();
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			return prov_src_act_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			return prov_src_schd_typ();
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			return prov_src_schd_no1();
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			return prov_src_schd_no2();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($prsppl_grp_cd1.equalsIgnoreCase(name)) {
			return prsppl_grp_cd1();
		}
		if ($prsppl_grp_nm1.equalsIgnoreCase(name)) {
			return prsppl_grp_nm1();
		}
		if ($prsppl_grp_cd2.equalsIgnoreCase(name)) {
			return prsppl_grp_cd2();
		}
		if ($prsppl_grp_nm2.equalsIgnoreCase(name)) {
			return prsppl_grp_nm2();
		}
		if ($prsppl_grp_cd3.equalsIgnoreCase(name)) {
			return prsppl_grp_cd3();
		}
		if ($prsppl_grp_nm3.equalsIgnoreCase(name)) {
			return prsppl_grp_nm3();
		}
		if ($prsppl_grp_cd4.equalsIgnoreCase(name)) {
			return prsppl_grp_cd4();
		}
		if ($prsppl_grp_nm4.equalsIgnoreCase(name)) {
			return prsppl_grp_nm4();
		}
		if ($prsppl_grp_cd5.equalsIgnoreCase(name)) {
			return prsppl_grp_cd5();
		}
		if ($prsppl_grp_nm5.equalsIgnoreCase(name)) {
			return prsppl_grp_nm5();
		}
		if ($prsppl_grp_cd6.equalsIgnoreCase(name)) {
			return prsppl_grp_cd6();
		}
		if ($prsppl_grp_nm6.equalsIgnoreCase(name)) {
			return prsppl_grp_nm6();
		}
		if ($prsppl_grp_cd7.equalsIgnoreCase(name)) {
			return prsppl_grp_cd7();
		}
		if ($prsppl_grp_nm7.equalsIgnoreCase(name)) {
			return prsppl_grp_nm7();
		}
		if ($prsppl_grp_cd8.equalsIgnoreCase(name)) {
			return prsppl_grp_cd8();
		}
		if ($prsppl_grp_nm8.equalsIgnoreCase(name)) {
			return prsppl_grp_nm8();
		}
		if ($prsppl_grp_cd9.equalsIgnoreCase(name)) {
			return prsppl_grp_cd9();
		}
		if ($prsppl_grp_nm9.equalsIgnoreCase(name)) {
			return prsppl_grp_nm9();
		}
		if ($prsppl_grp_cd10.equalsIgnoreCase(name)) {
			return prsppl_grp_cd10();
		}
		if ($prsppl_grp_nm10.equalsIgnoreCase(name)) {
			return prsppl_grp_nm10();
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
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($accpt_dt_fr.equalsIgnoreCase(name)) {
			return accpt_dt_fr();
		}
		if ($accpt_dt_to.equalsIgnoreCase(name)) {
			return accpt_dt_to();
		}
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			return ac_ym_fr();
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			return ac_ym_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		if ($arr_act_dt_fr.equalsIgnoreCase(name)) {
			return arr_act_dt_fr();
		}
		if ($arr_act_hm_fr.equalsIgnoreCase(name)) {
			return arr_act_hm_fr();
		}
		if ($arr_act_dt_to.equalsIgnoreCase(name)) {
			return arr_act_dt_to();
		}
		if ($arr_act_hm_to.equalsIgnoreCase(name)) {
			return arr_act_hm_to();
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			return accpt_schd_dt_fr();
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			return accpt_schd_dt_to();
		}
		if ($arr_schd_dt_fr.equalsIgnoreCase(name)) {
			return arr_schd_dt_fr();
		}
		if ($arr_schd_hm_fr.equalsIgnoreCase(name)) {
			return arr_schd_hm_fr();
		}
		if ($arr_schd_dt_to.equalsIgnoreCase(name)) {
			return arr_schd_dt_to();
		}
		if ($arr_schd_hm_to.equalsIgnoreCase(name)) {
			return arr_schd_hm_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($prov.equalsIgnoreCase(name)) {
			return prov();
		}
		if ($prov_rtn.equalsIgnoreCase(name)) {
			return prov_rtn();
		}
		if ($ffr_prov_flg.equalsIgnoreCase(name)) {
			return ffr_prov_flg();
		}
		if ($onr_prov_flg.equalsIgnoreCase(name)) {
			return onr_prov_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($not_subcon_flg.equalsIgnoreCase(name)) {
			return not_subcon_flg();
		}
		if ($dlv_not_prnted.equalsIgnoreCase(name)) {
			return dlv_not_prnted();
		}
		if ($dlv_prnted.equalsIgnoreCase(name)) {
			return dlv_prnted();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($dis_can_disp_flg.equalsIgnoreCase(name)) {
			return dis_can_disp_flg();
		}
		if ($sign_rev_flg.equalsIgnoreCase(name)) {
			return sign_rev_flg();
		}
		if ($prsppl_grp_flg1.equalsIgnoreCase(name)) {
			return prsppl_grp_flg1();
		}
		if ($prsppl_grp_flg2.equalsIgnoreCase(name)) {
			return prsppl_grp_flg2();
		}
		if ($prsppl_grp_flg3.equalsIgnoreCase(name)) {
			return prsppl_grp_flg3();
		}
		if ($prsppl_grp_flg4.equalsIgnoreCase(name)) {
			return prsppl_grp_flg4();
		}
		if ($prsppl_grp_flg5.equalsIgnoreCase(name)) {
			return prsppl_grp_flg5();
		}
		if ($prsppl_grp_flg6.equalsIgnoreCase(name)) {
			return prsppl_grp_flg6();
		}
		if ($prsppl_grp_flg7.equalsIgnoreCase(name)) {
			return prsppl_grp_flg7();
		}
		if ($prsppl_grp_flg8.equalsIgnoreCase(name)) {
			return prsppl_grp_flg8();
		}
		if ($prsppl_grp_flg9.equalsIgnoreCase(name)) {
			return prsppl_grp_flg9();
		}
		if ($prsppl_grp_flg10.equalsIgnoreCase(name)) {
			return prsppl_grp_flg10();
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
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			return on_edi_flg();
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			return off_edi_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($prsppl_loc_cd.equalsIgnoreCase(name)) {
			return prsppl_loc_cd();
		}
		if ($prsppl_loc_nm.equalsIgnoreCase(name)) {
			return prsppl_loc_nm();
		}
		if ($prsppl_str_ln_cd.equalsIgnoreCase(name)) {
			return prsppl_str_ln_cd();
		}
		if ($prsppl_str_ln_nm.equalsIgnoreCase(name)) {
			return prsppl_str_ln_nm();
		}
		if ($prsppl_wg_cd.equalsIgnoreCase(name)) {
			return prsppl_wg_cd();
		}
		if ($prsppl_wg_nm.equalsIgnoreCase(name)) {
			return prsppl_wg_nm();
		}
		if ($prsppl_lg_grp_cd.equalsIgnoreCase(name)) {
			return prsppl_lg_grp_cd();
		}
		if ($prsppl_lg_grp_nm.equalsIgnoreCase(name)) {
			return prsppl_lg_grp_nm();
		}
		if ($prsppl_site_cd.equalsIgnoreCase(name)) {
			return prsppl_site_cd();
		}
		if ($prsppl_site_nm.equalsIgnoreCase(name)) {
			return prsppl_site_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			return prov_src_act_typ();
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			return prov_src_act_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			return prov_src_schd_typ();
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			return prov_src_schd_no1();
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			return prov_src_schd_no2();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($prsppl_grp_cd1.equalsIgnoreCase(name)) {
			return prsppl_grp_cd1();
		}
		if ($prsppl_grp_nm1.equalsIgnoreCase(name)) {
			return prsppl_grp_nm1();
		}
		if ($prsppl_grp_cd2.equalsIgnoreCase(name)) {
			return prsppl_grp_cd2();
		}
		if ($prsppl_grp_nm2.equalsIgnoreCase(name)) {
			return prsppl_grp_nm2();
		}
		if ($prsppl_grp_cd3.equalsIgnoreCase(name)) {
			return prsppl_grp_cd3();
		}
		if ($prsppl_grp_nm3.equalsIgnoreCase(name)) {
			return prsppl_grp_nm3();
		}
		if ($prsppl_grp_cd4.equalsIgnoreCase(name)) {
			return prsppl_grp_cd4();
		}
		if ($prsppl_grp_nm4.equalsIgnoreCase(name)) {
			return prsppl_grp_nm4();
		}
		if ($prsppl_grp_cd5.equalsIgnoreCase(name)) {
			return prsppl_grp_cd5();
		}
		if ($prsppl_grp_nm5.equalsIgnoreCase(name)) {
			return prsppl_grp_nm5();
		}
		if ($prsppl_grp_cd6.equalsIgnoreCase(name)) {
			return prsppl_grp_cd6();
		}
		if ($prsppl_grp_nm6.equalsIgnoreCase(name)) {
			return prsppl_grp_nm6();
		}
		if ($prsppl_grp_cd7.equalsIgnoreCase(name)) {
			return prsppl_grp_cd7();
		}
		if ($prsppl_grp_nm7.equalsIgnoreCase(name)) {
			return prsppl_grp_nm7();
		}
		if ($prsppl_grp_cd8.equalsIgnoreCase(name)) {
			return prsppl_grp_cd8();
		}
		if ($prsppl_grp_nm8.equalsIgnoreCase(name)) {
			return prsppl_grp_nm8();
		}
		if ($prsppl_grp_cd9.equalsIgnoreCase(name)) {
			return prsppl_grp_cd9();
		}
		if ($prsppl_grp_nm9.equalsIgnoreCase(name)) {
			return prsppl_grp_nm9();
		}
		if ($prsppl_grp_cd10.equalsIgnoreCase(name)) {
			return prsppl_grp_cd10();
		}
		if ($prsppl_grp_nm10.equalsIgnoreCase(name)) {
			return prsppl_grp_nm10();
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
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($accpt_dt_fr.equalsIgnoreCase(name)) {
			return accpt_dt_fr();
		}
		if ($accpt_dt_to.equalsIgnoreCase(name)) {
			return accpt_dt_to();
		}
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			return ac_ym_fr();
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			return ac_ym_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		if ($arr_act_dt_fr.equalsIgnoreCase(name)) {
			return arr_act_dt_fr();
		}
		if ($arr_act_hm_fr.equalsIgnoreCase(name)) {
			return arr_act_hm_fr();
		}
		if ($arr_act_dt_to.equalsIgnoreCase(name)) {
			return arr_act_dt_to();
		}
		if ($arr_act_hm_to.equalsIgnoreCase(name)) {
			return arr_act_hm_to();
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			return accpt_schd_dt_fr();
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			return accpt_schd_dt_to();
		}
		if ($arr_schd_dt_fr.equalsIgnoreCase(name)) {
			return arr_schd_dt_fr();
		}
		if ($arr_schd_hm_fr.equalsIgnoreCase(name)) {
			return arr_schd_hm_fr();
		}
		if ($arr_schd_dt_to.equalsIgnoreCase(name)) {
			return arr_schd_dt_to();
		}
		if ($arr_schd_hm_to.equalsIgnoreCase(name)) {
			return arr_schd_hm_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($prov.equalsIgnoreCase(name)) {
			return prov();
		}
		if ($prov_rtn.equalsIgnoreCase(name)) {
			return prov_rtn();
		}
		if ($ffr_prov_flg.equalsIgnoreCase(name)) {
			return ffr_prov_flg();
		}
		if ($onr_prov_flg.equalsIgnoreCase(name)) {
			return onr_prov_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($not_subcon_flg.equalsIgnoreCase(name)) {
			return not_subcon_flg();
		}
		if ($dlv_not_prnted.equalsIgnoreCase(name)) {
			return dlv_not_prnted();
		}
		if ($dlv_prnted.equalsIgnoreCase(name)) {
			return dlv_prnted();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($dis_can_disp_flg.equalsIgnoreCase(name)) {
			return dis_can_disp_flg();
		}
		if ($sign_rev_flg.equalsIgnoreCase(name)) {
			return sign_rev_flg();
		}
		if ($prsppl_grp_flg1.equalsIgnoreCase(name)) {
			return prsppl_grp_flg1();
		}
		if ($prsppl_grp_flg2.equalsIgnoreCase(name)) {
			return prsppl_grp_flg2();
		}
		if ($prsppl_grp_flg3.equalsIgnoreCase(name)) {
			return prsppl_grp_flg3();
		}
		if ($prsppl_grp_flg4.equalsIgnoreCase(name)) {
			return prsppl_grp_flg4();
		}
		if ($prsppl_grp_flg5.equalsIgnoreCase(name)) {
			return prsppl_grp_flg5();
		}
		if ($prsppl_grp_flg6.equalsIgnoreCase(name)) {
			return prsppl_grp_flg6();
		}
		if ($prsppl_grp_flg7.equalsIgnoreCase(name)) {
			return prsppl_grp_flg7();
		}
		if ($prsppl_grp_flg8.equalsIgnoreCase(name)) {
			return prsppl_grp_flg8();
		}
		if ($prsppl_grp_flg9.equalsIgnoreCase(name)) {
			return prsppl_grp_flg9();
		}
		if ($prsppl_grp_flg10.equalsIgnoreCase(name)) {
			return prsppl_grp_flg10();
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
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			return on_edi_flg();
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			return off_edi_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($prsppl_loc_cd.equalsIgnoreCase(name)) {
			prsppl_loc_cd(value);
			return;
		}
		if ($prsppl_loc_nm.equalsIgnoreCase(name)) {
			prsppl_loc_nm(value);
			return;
		}
		if ($prsppl_str_ln_cd.equalsIgnoreCase(name)) {
			prsppl_str_ln_cd(value);
			return;
		}
		if ($prsppl_str_ln_nm.equalsIgnoreCase(name)) {
			prsppl_str_ln_nm(value);
			return;
		}
		if ($prsppl_wg_cd.equalsIgnoreCase(name)) {
			prsppl_wg_cd(value);
			return;
		}
		if ($prsppl_wg_nm.equalsIgnoreCase(name)) {
			prsppl_wg_nm(value);
			return;
		}
		if ($prsppl_lg_grp_cd.equalsIgnoreCase(name)) {
			prsppl_lg_grp_cd(value);
			return;
		}
		if ($prsppl_lg_grp_nm.equalsIgnoreCase(name)) {
			prsppl_lg_grp_nm(value);
			return;
		}
		if ($prsppl_site_cd.equalsIgnoreCase(name)) {
			prsppl_site_cd(value);
			return;
		}
		if ($prsppl_site_nm.equalsIgnoreCase(name)) {
			prsppl_site_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			prov_src_act_typ(value);
			return;
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			prov_src_act_no(value);
			return;
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			prov_src_schd_typ(value);
			return;
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			prov_src_schd_no1(value);
			return;
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			prov_src_schd_no2(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($prsppl_grp_cd1.equalsIgnoreCase(name)) {
			prsppl_grp_cd1(value);
			return;
		}
		if ($prsppl_grp_nm1.equalsIgnoreCase(name)) {
			prsppl_grp_nm1(value);
			return;
		}
		if ($prsppl_grp_cd2.equalsIgnoreCase(name)) {
			prsppl_grp_cd2(value);
			return;
		}
		if ($prsppl_grp_nm2.equalsIgnoreCase(name)) {
			prsppl_grp_nm2(value);
			return;
		}
		if ($prsppl_grp_cd3.equalsIgnoreCase(name)) {
			prsppl_grp_cd3(value);
			return;
		}
		if ($prsppl_grp_nm3.equalsIgnoreCase(name)) {
			prsppl_grp_nm3(value);
			return;
		}
		if ($prsppl_grp_cd4.equalsIgnoreCase(name)) {
			prsppl_grp_cd4(value);
			return;
		}
		if ($prsppl_grp_nm4.equalsIgnoreCase(name)) {
			prsppl_grp_nm4(value);
			return;
		}
		if ($prsppl_grp_cd5.equalsIgnoreCase(name)) {
			prsppl_grp_cd5(value);
			return;
		}
		if ($prsppl_grp_nm5.equalsIgnoreCase(name)) {
			prsppl_grp_nm5(value);
			return;
		}
		if ($prsppl_grp_cd6.equalsIgnoreCase(name)) {
			prsppl_grp_cd6(value);
			return;
		}
		if ($prsppl_grp_nm6.equalsIgnoreCase(name)) {
			prsppl_grp_nm6(value);
			return;
		}
		if ($prsppl_grp_cd7.equalsIgnoreCase(name)) {
			prsppl_grp_cd7(value);
			return;
		}
		if ($prsppl_grp_nm7.equalsIgnoreCase(name)) {
			prsppl_grp_nm7(value);
			return;
		}
		if ($prsppl_grp_cd8.equalsIgnoreCase(name)) {
			prsppl_grp_cd8(value);
			return;
		}
		if ($prsppl_grp_nm8.equalsIgnoreCase(name)) {
			prsppl_grp_nm8(value);
			return;
		}
		if ($prsppl_grp_cd9.equalsIgnoreCase(name)) {
			prsppl_grp_cd9(value);
			return;
		}
		if ($prsppl_grp_nm9.equalsIgnoreCase(name)) {
			prsppl_grp_nm9(value);
			return;
		}
		if ($prsppl_grp_cd10.equalsIgnoreCase(name)) {
			prsppl_grp_cd10(value);
			return;
		}
		if ($prsppl_grp_nm10.equalsIgnoreCase(name)) {
			prsppl_grp_nm10(value);
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
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($accpt_dt_fr.equalsIgnoreCase(name)) {
			accpt_dt_fr(value);
			return;
		}
		if ($accpt_dt_to.equalsIgnoreCase(name)) {
			accpt_dt_to(value);
			return;
		}
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			ac_ym_fr(value);
			return;
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			ac_ym_to(value);
			return;
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		if ($arr_act_dt_fr.equalsIgnoreCase(name)) {
			arr_act_dt_fr(value);
			return;
		}
		if ($arr_act_hm_fr.equalsIgnoreCase(name)) {
			arr_act_hm_fr(value);
			return;
		}
		if ($arr_act_dt_to.equalsIgnoreCase(name)) {
			arr_act_dt_to(value);
			return;
		}
		if ($arr_act_hm_to.equalsIgnoreCase(name)) {
			arr_act_hm_to(value);
			return;
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			accpt_schd_dt_fr(value);
			return;
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			accpt_schd_dt_to(value);
			return;
		}
		if ($arr_schd_dt_fr.equalsIgnoreCase(name)) {
			arr_schd_dt_fr(value);
			return;
		}
		if ($arr_schd_hm_fr.equalsIgnoreCase(name)) {
			arr_schd_hm_fr(value);
			return;
		}
		if ($arr_schd_dt_to.equalsIgnoreCase(name)) {
			arr_schd_dt_to(value);
			return;
		}
		if ($arr_schd_hm_to.equalsIgnoreCase(name)) {
			arr_schd_hm_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($prov.equalsIgnoreCase(name)) {
			prov(value);
			return;
		}
		if ($prov_rtn.equalsIgnoreCase(name)) {
			prov_rtn(value);
			return;
		}
		if ($ffr_prov_flg.equalsIgnoreCase(name)) {
			ffr_prov_flg(value);
			return;
		}
		if ($onr_prov_flg.equalsIgnoreCase(name)) {
			onr_prov_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($not_subcon_flg.equalsIgnoreCase(name)) {
			not_subcon_flg(value);
			return;
		}
		if ($dlv_not_prnted.equalsIgnoreCase(name)) {
			dlv_not_prnted(value);
			return;
		}
		if ($dlv_prnted.equalsIgnoreCase(name)) {
			dlv_prnted(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($dis_can_disp_flg.equalsIgnoreCase(name)) {
			dis_can_disp_flg(value);
			return;
		}
		if ($sign_rev_flg.equalsIgnoreCase(name)) {
			sign_rev_flg(value);
			return;
		}
		if ($prsppl_grp_flg1.equalsIgnoreCase(name)) {
			prsppl_grp_flg1(value);
			return;
		}
		if ($prsppl_grp_flg2.equalsIgnoreCase(name)) {
			prsppl_grp_flg2(value);
			return;
		}
		if ($prsppl_grp_flg3.equalsIgnoreCase(name)) {
			prsppl_grp_flg3(value);
			return;
		}
		if ($prsppl_grp_flg4.equalsIgnoreCase(name)) {
			prsppl_grp_flg4(value);
			return;
		}
		if ($prsppl_grp_flg5.equalsIgnoreCase(name)) {
			prsppl_grp_flg5(value);
			return;
		}
		if ($prsppl_grp_flg6.equalsIgnoreCase(name)) {
			prsppl_grp_flg6(value);
			return;
		}
		if ($prsppl_grp_flg7.equalsIgnoreCase(name)) {
			prsppl_grp_flg7(value);
			return;
		}
		if ($prsppl_grp_flg8.equalsIgnoreCase(name)) {
			prsppl_grp_flg8(value);
			return;
		}
		if ($prsppl_grp_flg9.equalsIgnoreCase(name)) {
			prsppl_grp_flg9(value);
			return;
		}
		if ($prsppl_grp_flg10.equalsIgnoreCase(name)) {
			prsppl_grp_flg10(value);
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
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			on_edi_flg(value);
			return;
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			off_edi_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($prsppl_loc_cd.equalsIgnoreCase(name)) {
			prsppl_loc_cd(value);
			return;
		}
		if ($prsppl_loc_nm.equalsIgnoreCase(name)) {
			prsppl_loc_nm(value);
			return;
		}
		if ($prsppl_str_ln_cd.equalsIgnoreCase(name)) {
			prsppl_str_ln_cd(value);
			return;
		}
		if ($prsppl_str_ln_nm.equalsIgnoreCase(name)) {
			prsppl_str_ln_nm(value);
			return;
		}
		if ($prsppl_wg_cd.equalsIgnoreCase(name)) {
			prsppl_wg_cd(value);
			return;
		}
		if ($prsppl_wg_nm.equalsIgnoreCase(name)) {
			prsppl_wg_nm(value);
			return;
		}
		if ($prsppl_lg_grp_cd.equalsIgnoreCase(name)) {
			prsppl_lg_grp_cd(value);
			return;
		}
		if ($prsppl_lg_grp_nm.equalsIgnoreCase(name)) {
			prsppl_lg_grp_nm(value);
			return;
		}
		if ($prsppl_site_cd.equalsIgnoreCase(name)) {
			prsppl_site_cd(value);
			return;
		}
		if ($prsppl_site_nm.equalsIgnoreCase(name)) {
			prsppl_site_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			prov_src_act_typ(value);
			return;
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			prov_src_act_no(value);
			return;
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			prov_src_schd_typ(value);
			return;
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			prov_src_schd_no1(value);
			return;
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			prov_src_schd_no2(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($prsppl_grp_cd1.equalsIgnoreCase(name)) {
			prsppl_grp_cd1(value);
			return;
		}
		if ($prsppl_grp_nm1.equalsIgnoreCase(name)) {
			prsppl_grp_nm1(value);
			return;
		}
		if ($prsppl_grp_cd2.equalsIgnoreCase(name)) {
			prsppl_grp_cd2(value);
			return;
		}
		if ($prsppl_grp_nm2.equalsIgnoreCase(name)) {
			prsppl_grp_nm2(value);
			return;
		}
		if ($prsppl_grp_cd3.equalsIgnoreCase(name)) {
			prsppl_grp_cd3(value);
			return;
		}
		if ($prsppl_grp_nm3.equalsIgnoreCase(name)) {
			prsppl_grp_nm3(value);
			return;
		}
		if ($prsppl_grp_cd4.equalsIgnoreCase(name)) {
			prsppl_grp_cd4(value);
			return;
		}
		if ($prsppl_grp_nm4.equalsIgnoreCase(name)) {
			prsppl_grp_nm4(value);
			return;
		}
		if ($prsppl_grp_cd5.equalsIgnoreCase(name)) {
			prsppl_grp_cd5(value);
			return;
		}
		if ($prsppl_grp_nm5.equalsIgnoreCase(name)) {
			prsppl_grp_nm5(value);
			return;
		}
		if ($prsppl_grp_cd6.equalsIgnoreCase(name)) {
			prsppl_grp_cd6(value);
			return;
		}
		if ($prsppl_grp_nm6.equalsIgnoreCase(name)) {
			prsppl_grp_nm6(value);
			return;
		}
		if ($prsppl_grp_cd7.equalsIgnoreCase(name)) {
			prsppl_grp_cd7(value);
			return;
		}
		if ($prsppl_grp_nm7.equalsIgnoreCase(name)) {
			prsppl_grp_nm7(value);
			return;
		}
		if ($prsppl_grp_cd8.equalsIgnoreCase(name)) {
			prsppl_grp_cd8(value);
			return;
		}
		if ($prsppl_grp_nm8.equalsIgnoreCase(name)) {
			prsppl_grp_nm8(value);
			return;
		}
		if ($prsppl_grp_cd9.equalsIgnoreCase(name)) {
			prsppl_grp_cd9(value);
			return;
		}
		if ($prsppl_grp_nm9.equalsIgnoreCase(name)) {
			prsppl_grp_nm9(value);
			return;
		}
		if ($prsppl_grp_cd10.equalsIgnoreCase(name)) {
			prsppl_grp_cd10(value);
			return;
		}
		if ($prsppl_grp_nm10.equalsIgnoreCase(name)) {
			prsppl_grp_nm10(value);
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
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($accpt_dt_fr.equalsIgnoreCase(name)) {
			accpt_dt_fr(value);
			return;
		}
		if ($accpt_dt_to.equalsIgnoreCase(name)) {
			accpt_dt_to(value);
			return;
		}
		if ($ac_ym_fr.equalsIgnoreCase(name)) {
			ac_ym_fr(value);
			return;
		}
		if ($ac_ym_to.equalsIgnoreCase(name)) {
			ac_ym_to(value);
			return;
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		if ($arr_act_dt_fr.equalsIgnoreCase(name)) {
			arr_act_dt_fr(value);
			return;
		}
		if ($arr_act_hm_fr.equalsIgnoreCase(name)) {
			arr_act_hm_fr(value);
			return;
		}
		if ($arr_act_dt_to.equalsIgnoreCase(name)) {
			arr_act_dt_to(value);
			return;
		}
		if ($arr_act_hm_to.equalsIgnoreCase(name)) {
			arr_act_hm_to(value);
			return;
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			accpt_schd_dt_fr(value);
			return;
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			accpt_schd_dt_to(value);
			return;
		}
		if ($arr_schd_dt_fr.equalsIgnoreCase(name)) {
			arr_schd_dt_fr(value);
			return;
		}
		if ($arr_schd_hm_fr.equalsIgnoreCase(name)) {
			arr_schd_hm_fr(value);
			return;
		}
		if ($arr_schd_dt_to.equalsIgnoreCase(name)) {
			arr_schd_dt_to(value);
			return;
		}
		if ($arr_schd_hm_to.equalsIgnoreCase(name)) {
			arr_schd_hm_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($prov.equalsIgnoreCase(name)) {
			prov(value);
			return;
		}
		if ($prov_rtn.equalsIgnoreCase(name)) {
			prov_rtn(value);
			return;
		}
		if ($ffr_prov_flg.equalsIgnoreCase(name)) {
			ffr_prov_flg(value);
			return;
		}
		if ($onr_prov_flg.equalsIgnoreCase(name)) {
			onr_prov_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($not_subcon_flg.equalsIgnoreCase(name)) {
			not_subcon_flg(value);
			return;
		}
		if ($dlv_not_prnted.equalsIgnoreCase(name)) {
			dlv_not_prnted(value);
			return;
		}
		if ($dlv_prnted.equalsIgnoreCase(name)) {
			dlv_prnted(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($dis_can_disp_flg.equalsIgnoreCase(name)) {
			dis_can_disp_flg(value);
			return;
		}
		if ($sign_rev_flg.equalsIgnoreCase(name)) {
			sign_rev_flg(value);
			return;
		}
		if ($prsppl_grp_flg1.equalsIgnoreCase(name)) {
			prsppl_grp_flg1(value);
			return;
		}
		if ($prsppl_grp_flg2.equalsIgnoreCase(name)) {
			prsppl_grp_flg2(value);
			return;
		}
		if ($prsppl_grp_flg3.equalsIgnoreCase(name)) {
			prsppl_grp_flg3(value);
			return;
		}
		if ($prsppl_grp_flg4.equalsIgnoreCase(name)) {
			prsppl_grp_flg4(value);
			return;
		}
		if ($prsppl_grp_flg5.equalsIgnoreCase(name)) {
			prsppl_grp_flg5(value);
			return;
		}
		if ($prsppl_grp_flg6.equalsIgnoreCase(name)) {
			prsppl_grp_flg6(value);
			return;
		}
		if ($prsppl_grp_flg7.equalsIgnoreCase(name)) {
			prsppl_grp_flg7(value);
			return;
		}
		if ($prsppl_grp_flg8.equalsIgnoreCase(name)) {
			prsppl_grp_flg8(value);
			return;
		}
		if ($prsppl_grp_flg9.equalsIgnoreCase(name)) {
			prsppl_grp_flg9(value);
			return;
		}
		if ($prsppl_grp_flg10.equalsIgnoreCase(name)) {
			prsppl_grp_flg10(value);
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
		if ($on_edi_flg.equalsIgnoreCase(name)) {
			on_edi_flg(value);
			return;
		}
		if ($off_edi_flg.equalsIgnoreCase(name)) {
			off_edi_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

