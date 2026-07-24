package mcframe.serverMSBE.MSBEL0030;

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
	 * Monthly GR/GI closing month 月次受払締月度.<p>
	 *
	 */
	public static final String $mly_io_cl_ym = "mly_io_cl_ym";
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
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
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
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public static final String $in_xfr_typ = "in_xfr_typ";
	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public static final String $in_xfr_typ_nm = "in_xfr_typ_nm";
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
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
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
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public static final String $fix_no_typ = "fix_no_typ";
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public static final String $fix_no_typ_nm = "fix_no_typ_nm";
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public static final String $fix_no = "fix_no";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public static final String $io_act_typ = "io_act_typ";
	/**
	 * Unit cd. (For screen component linkage) 単位ＣＤ（画面部品連携用）.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name (For screen component linkage) 単位名（画面部品連携用）.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places (For screen component linkage) 小数有効桁数（画面部品連携用）.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Rounding type (For screen component linkage) 端数処理区分（画面部品連携用）.<p>
	 *
	 */
	public static final String $rnd_typ = "rnd_typ";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 * SKU number of decimal places 荷姿単位小数有効桁数.<p>
	 *
	 */
	public static final String $pack_unit_dec_place = "pack_unit_dec_place";
	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public static final String $pack_unit_rnd_typ = "pack_unit_rnd_typ";
	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public static final String $stk_amt = "stk_amt";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Currency unit number of decimal places 通貨単位小数点有効桁数.<p>
	 *
	 */
	public static final String $base_cur_dec_place = "base_cur_dec_place";
	/**
	 * Currency unit rounding type 通貨単位端数処理区分.<p>
	 *
	 */
	public static final String $base_cur_rnd_typ = "base_cur_rnd_typ";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $std_unit_cost = "std_unit_cost";
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
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public static final String $ini_stk_qty = "ini_stk_qty";
	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public static final String $gr_total_qty = "gr_total_qty";
	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public static final String $arr_qty = "arr_qty";
	/**
	 * Purchase GR qty. 仕入入庫数量.<p>
	 *
	 */
	public static final String $purc_gr_qty = "purc_gr_qty";
	/**
	 * Receiving for a fee GR qty. 有償受給入庫数量.<p>
	 *
	 */
	public static final String $onr_rcv_gr_qty = "onr_rcv_gr_qty";
	/**
	 * Purchase return GR qty. 仕入返品入庫数量.<p>
	 *
	 */
	public static final String $purc_rtn_gr_qty = "purc_rtn_gr_qty";
	/**
	 * Receiving for a fee return GR qty. 有償受給返品入庫数量.<p>
	 *
	 */
	public static final String $onr_rcv_ret_gr_qty = "onr_rcv_ret_gr_qty";
	/**
	 * Expense purchase GR qty. 経費購買入庫数量.<p>
	 *
	 */
	public static final String $xpns_purc_gr_qty = "xpns_purc_gr_qty";
	/**
	 * Expense purchase return GR qty. 経費購買返品入庫数量.<p>
	 *
	 */
	public static final String $xpns_purc_rtn_gr_qty = "xpns_purc_rtn_gr_qty";
	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public static final String $accpt_dfct_gr_qty = "accpt_dfct_gr_qty";
	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public static final String $mfg_qty = "mfg_qty";
	/**
	 * By-product mfg. qty. 副産品製造数量.<p>
	 *
	 */
	public static final String $bymfg_qty = "bymfg_qty";
	/**
	 * GR qty. (Non-chargeable supply) 無償支給入庫数量.<p>
	 *
	 */
	public static final String $ffr_prov_gr_qty = "ffr_prov_gr_qty";
	/**
	 * Chargeable supply GR qty. 有償支給入庫数量.<p>
	 *
	 */
	public static final String $onr_prov_gr_qty = "onr_prov_gr_qty";
	/**
	 * Non-chargeable supply return GR qty. 無償支給返品入庫数量.<p>
	 *
	 */
	public static final String $ffr_prov_rtn_gr_qty = "ffr_prov_rtn_gr_qty";
	/**
	 * Chargeable supply return GR qty. 有償支給返品入庫数量.<p>
	 *
	 */
	public static final String $onr_prov_rtn_gr_qty = "onr_prov_rtn_gr_qty";
	/**
	 * Inspection GR qty. 検査入庫数量.<p>
	 *
	 */
	public static final String $insp_gr_qty = "insp_gr_qty";
	/**
	 * Inspection completed GR qty. 検査完了入庫数量.<p>
	 *
	 */
	public static final String $insp_cmpl_gr_qty = "insp_cmpl_gr_qty";
	/**
	 * Inspection decision GR qty. 検査判定入庫数量.<p>
	 *
	 */
	public static final String $insp_judg_gr_qty = "insp_judg_gr_qty";
	/**
	 * Re-inspection GR qty. 再検査入庫数量.<p>
	 *
	 */
	public static final String $reinsp_gr_qty = "reinsp_gr_qty";
	/**
	 * Inventory count variance qty. (GR) 棚卸差異増耗数量.<p>
	 *
	 */
	public static final String $stk_adjst_gr_qty = "stk_adjst_gr_qty";
	/**
	 * Warehousing GR qty. 倉入入庫数量.<p>
	 *
	 */
	public static final String $prdct_wh_gr_qty = "prdct_wh_gr_qty";
	/**
	 * GR returning qty. 戻入入庫数量.<p>
	 *
	 */
	public static final String $prdct_wh_rtn_gr_qty = "prdct_wh_rtn_gr_qty";
	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public static final String $xfr_gr_qty = "xfr_gr_qty";
	/**
	 * Move-in qty. 転入数量.<p>
	 *
	 */
	public static final String $xfr_in_qty = "xfr_in_qty";
	/**
	 * Purchase move-in qty. 仕入転入数量.<p>
	 *
	 */
	public static final String $purc_xfr_in_qty = "purc_xfr_in_qty";
	/**
	 * Movement/transport return GR qty. 移動・移送返品入庫数量.<p>
	 *
	 */
	public static final String $xfr_rtn_gr_qty = "xfr_rtn_gr_qty";
	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public static final String $acxfr_gr_qty = "acxfr_gr_qty";
	/**
	 * Customer inventory GR qty. 預り入庫数量.<p>
	 *
	 */
	public static final String $arr_cststk_qty = "arr_cststk_qty";
	/**
	 * Item transfer GR qty. 品目振替入庫数量.<p>
	 *
	 */
	public static final String $xfr_itm_gr_qty = "xfr_itm_gr_qty";
	/**
	 * Lot/SEIBAN No. transfer GR qty. ロット・手配ＮＯ振替入庫数量.<p>
	 *
	 */
	public static final String $xfr_lot_sno_gr_qty = "xfr_lot_sno_gr_qty";
	/**
	 * GR qty. (Grading/conforming type transfer) 格付・良品区分振替入庫数量.<p>
	 *
	 */
	public static final String $xfr_grd_gr_qty = "xfr_grd_gr_qty";
	/**
	 * SKU transfer GR qty. 荷姿振替入庫数量.<p>
	 *
	 */
	public static final String $xfr_pack_gr_qty = "xfr_pack_gr_qty";
	/**
	 * Arrival qty. 着荷数量.<p>
	 *
	 */
	public static final String $ship_in_qty = "ship_in_qty";
	/**
	 * Export arrival qty. 輸出着荷数量.<p>
	 *
	 */
	public static final String $ex_ship_in_qty = "ex_ship_in_qty";
	/**
	 * Shipping return GR qty. 出荷返品入庫数量.<p>
	 *
	 */
	public static final String $ship_rtn_gr_qty = "ship_rtn_gr_qty";
	/**
	 * Sales return GR qty. 売上返品入庫数量.<p>
	 *
	 */
	public static final String $sls_rtn_gr_qty = "sls_rtn_gr_qty";
	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public static final String $gi_total_qty = "gi_total_qty";
	/**
	 * Receipt return qty. 入荷返品数量.<p>
	 *
	 */
	public static final String $arr_rtn_qty = "arr_rtn_qty";
	/**
	 * Purchase GI qty. 仕入出庫数量.<p>
	 *
	 */
	public static final String $purc_gi_qty = "purc_gi_qty";
	/**
	 * Receiving for a fee GI qty. 有償受給出庫数量.<p>
	 *
	 */
	public static final String $onr_rcv_gi_qty = "onr_rcv_gi_qty";
	/**
	 * Purchase return GI qty. 仕入返品出庫数量.<p>
	 *
	 */
	public static final String $purc_rtn_gi_qty = "purc_rtn_gi_qty";
	/**
	 * Receiving for a fee return GI qty. 有償受給返品出庫数量.<p>
	 *
	 */
	public static final String $onr_rcv_ret_gi_qty = "onr_rcv_ret_gi_qty";
	/**
	 * Expense purchase GI qty. 経費購買出庫数量.<p>
	 *
	 */
	public static final String $xpns_purc_gi_qty = "xpns_purc_gi_qty";
	/**
	 * Expense purchase return GI qty. 経費購買返品出庫数量.<p>
	 *
	 */
	public static final String $xpns_purc_rtn_gi_qty = "xpns_purc_rtn_gi_qty";
	/**
	 * Defective acceptance GI qty. 検収不良出庫数量.<p>
	 *
	 */
	public static final String $accpt_dfct_gi_qty = "accpt_dfct_gi_qty";
	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public static final String $inpt_qty = "inpt_qty";
	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public static final String $loss_qty = "loss_qty";
	/**
	 * Non-chargeable supply GI qty. 無償支給出庫数量.<p>
	 *
	 */
	public static final String $ffr_prov_gi_qty = "ffr_prov_gi_qty";
	/**
	 * Chargeable supply GI qty. 有償支給出庫数量.<p>
	 *
	 */
	public static final String $onr_prov_gi_qty = "onr_prov_gi_qty";
	/**
	 * Non-chargeable supply return GI qty. 無償支給返品出庫数量.<p>
	 *
	 */
	public static final String $ffr_prov_rtn_gi_qty = "ffr_prov_rtn_gi_qty";
	/**
	 * Chargeable supply return GI qty. 有償支給返品出庫数量.<p>
	 *
	 */
	public static final String $onr_prov_rtn_gi_qty = "onr_prov_rtn_gi_qty";
	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public static final String $insp_gi_qty = "insp_gi_qty";
	/**
	 * Inspection completed GI qty. 検査完了出庫数量.<p>
	 *
	 */
	public static final String $insp_cmpl_gi_qty = "insp_cmpl_gi_qty";
	/**
	 * Inspection decision GI qty. 検査判定出庫数量.<p>
	 *
	 */
	public static final String $insp_judg_gi_qty = "insp_judg_gi_qty";
	/**
	 * Re-inspection GI qty. 再検査出庫数量.<p>
	 *
	 */
	public static final String $reinsp_gi_qty = "reinsp_gi_qty";
	/**
	 * Sampling qty. 検査抜取数量.<p>
	 *
	 */
	public static final String $insp_smpl_gi_qty = "insp_smpl_gi_qty";
	/**
	 * Inventory count variance qty. (GI) 棚卸差異減耗数量.<p>
	 *
	 */
	public static final String $stk_adjst_gi_qty = "stk_adjst_gi_qty";
	/**
	 * Warehousing GI qty. 倉入出庫数量.<p>
	 *
	 */
	public static final String $prdct_wh_gi_qty = "prdct_wh_gi_qty";
	/**
	 * GI returning qty. 戻入出庫数量.<p>
	 *
	 */
	public static final String $prdct_wh_rtn_gi_qty = "prdct_wh_rtn_gi_qty";
	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public static final String $xfr_gi_qty = "xfr_gi_qty";
	/**
	 * Move-out qty. 転出数量.<p>
	 *
	 */
	public static final String $xfr_out_qty = "xfr_out_qty";
	/**
	 * Purchase move-out qty. 仕入転出数量.<p>
	 *
	 */
	public static final String $purc_xfr_out_qty = "purc_xfr_out_qty";
	/**
	 * Movement/transport return GI qty. 移動・移送返品出庫数量.<p>
	 *
	 */
	public static final String $xfr_rtn_gi_qty = "xfr_rtn_gi_qty";
	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public static final String $acxfr_gi_qty = "acxfr_gi_qty";
	/**
	 * Disposal qty. 廃棄数量.<p>
	 *
	 */
	public static final String $scrp_qty = "scrp_qty";
	/**
	 * Item transfer GI qty. 品目振替出庫数量.<p>
	 *
	 */
	public static final String $xfr_itm_gi_qty = "xfr_itm_gi_qty";
	/**
	 * Lot/SEIBAN No. transfer GI qty. ロット・手配ＮＯ振替出庫数量.<p>
	 *
	 */
	public static final String $xfr_lot_sno_gi_qty = "xfr_lot_sno_gi_qty";
	/**
	 * GI qty. (Grading/conforming type transfer) 格付・良品区分振替出庫数量.<p>
	 *
	 */
	public static final String $xfr_grd_gi_qty = "xfr_grd_gi_qty";
	/**
	 * SKU transfer GI qty. 荷姿振替出庫数量.<p>
	 *
	 */
	public static final String $xfr_pack_gi_qty = "xfr_pack_gi_qty";
	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public static final String $ship_out_qty = "ship_out_qty";
	/**
	 * Export shipping qty. 輸出出荷数量.<p>
	 *
	 */
	public static final String $ex_ship_out_qty = "ex_ship_out_qty";
	/**
	 * Shipping return GI qty. 出荷返品出庫数量.<p>
	 *
	 */
	public static final String $ship_rtn_gi_qty = "ship_rtn_gi_qty";
	/**
	 * Sales return GI qty. 売上返品出庫数量.<p>
	 *
	 */
	public static final String $sls_rtn_gi_qty = "sls_rtn_gi_qty";
	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public static final String $sls_qty = "sls_qty";
	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public static final String $end_stk_qty = "end_stk_qty";
	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public static final String $ini_stk_amt = "ini_stk_amt";
	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public static final String $gr_total_amt = "gr_total_amt";
	/**
	 * Receipt amount 入荷金額.<p>
	 *
	 */
	public static final String $arr_amt = "arr_amt";
	/**
	 * Purchase GR amount 仕入入庫金額.<p>
	 *
	 */
	public static final String $purc_gr_amt = "purc_gr_amt";
	/**
	 * Receiving for a fee GR amount 有償受給入庫金額.<p>
	 *
	 */
	public static final String $onr_rcv_gr_amt = "onr_rcv_gr_amt";
	/**
	 * Purchase return GR amount 仕入返品入庫金額.<p>
	 *
	 */
	public static final String $purc_rtn_gr_amt = "purc_rtn_gr_amt";
	/**
	 * Receiving for a fee return GR amount 有償受給返品入庫金額.<p>
	 *
	 */
	public static final String $onr_rcv_ret_gr_amt = "onr_rcv_ret_gr_amt";
	/**
	 * Expense purchase GR amount 経費購買入庫金額.<p>
	 *
	 */
	public static final String $xpns_purc_gr_amt = "xpns_purc_gr_amt";
	/**
	 * Expense purchase return GR amount 経費購買返品入庫金額.<p>
	 *
	 */
	public static final String $xpns_purc_rtn_gr_amt = "xpns_purc_rtn_gr_amt";
	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public static final String $accpt_dfct_gr_amt = "accpt_dfct_gr_amt";
	/**
	 * Mfg. amount 製造金額.<p>
	 *
	 */
	public static final String $mfg_amt = "mfg_amt";
	/**
	 * By-product mfg. amount 副産品製造金額.<p>
	 *
	 */
	public static final String $bymfg_amt = "bymfg_amt";
	/**
	 * GR amount (Non-chargeable supply) 無償支給入庫金額.<p>
	 *
	 */
	public static final String $ffr_prov_gr_amt = "ffr_prov_gr_amt";
	/**
	 * Chargeable supply GR amount 有償支給入庫金額.<p>
	 *
	 */
	public static final String $onr_prov_gr_amt = "onr_prov_gr_amt";
	/**
	 * Non-chargeable supply return GR amount 無償支給返品入庫金額.<p>
	 *
	 */
	public static final String $ffr_prov_rtn_gr_amt = "ffr_prov_rtn_gr_amt";
	/**
	 * Chargeable supply return GR amount 有償支給返品入庫金額.<p>
	 *
	 */
	public static final String $onr_prov_rtn_gr_amt = "onr_prov_rtn_gr_amt";
	/**
	 * Inspection GR amount 検査入庫金額.<p>
	 *
	 */
	public static final String $insp_gr_amt = "insp_gr_amt";
	/**
	 * Inspection completed GR amount 検査完了入庫金額.<p>
	 *
	 */
	public static final String $insp_cmpl_gr_amt = "insp_cmpl_gr_amt";
	/**
	 * Inspection decision GR amount 検査判定入庫金額.<p>
	 *
	 */
	public static final String $insp_judg_gr_amt = "insp_judg_gr_amt";
	/**
	 * Re-inspection GR amount 再検査入庫金額.<p>
	 *
	 */
	public static final String $reinsp_gr_amt = "reinsp_gr_amt";
	/**
	 * Inventory count variance amount (GR) 棚卸差異増耗金額.<p>
	 *
	 */
	public static final String $stk_adjst_gr_amt = "stk_adjst_gr_amt";
	/**
	 * Warehousing GR amount 倉入入庫金額.<p>
	 *
	 */
	public static final String $prdct_wh_gr_amt = "prdct_wh_gr_amt";
	/**
	 * GR returning amount 戻入入庫金額.<p>
	 *
	 */
	public static final String $prdct_wh_rtn_gr_amt = "prdct_wh_rtn_gr_amt";
	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public static final String $xfr_gr_amt = "xfr_gr_amt";
	/**
	 * Move-in amount 転入金額.<p>
	 *
	 */
	public static final String $xfr_in_amt = "xfr_in_amt";
	/**
	 * Amount of purchase without receipt 仕入転入金額.<p>
	 *
	 */
	public static final String $purc_xfr_in_amt = "purc_xfr_in_amt";
	/**
	 * Movement/transport return GR amount 移動・移送返品入庫金額.<p>
	 *
	 */
	public static final String $xfr_rtn_gr_amt = "xfr_rtn_gr_amt";
	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public static final String $acxfr_gr_amt = "acxfr_gr_amt";
	/**
	 * Customer inventory GR amount 預り入庫金額.<p>
	 *
	 */
	public static final String $arr_cststk_amt = "arr_cststk_amt";
	/**
	 * Item transfer GR amount 品目振替入庫金額.<p>
	 *
	 */
	public static final String $xfr_itm_gr_amt = "xfr_itm_gr_amt";
	/**
	 * Lot/SEIBAN No. transfer GR amount ロット・手配ＮＯ振替入庫金額.<p>
	 *
	 */
	public static final String $xfr_lot_sno_gr_amt = "xfr_lot_sno_gr_amt";
	/**
	 * GR amount (Grading/conforming type transfer) 格付・良品区分振替入庫金額.<p>
	 *
	 */
	public static final String $xfr_grd_gr_amt = "xfr_grd_gr_amt";
	/**
	 * SKU transfer GR amount 荷姿振替入庫金額.<p>
	 *
	 */
	public static final String $xfr_pack_gr_amt = "xfr_pack_gr_amt";
	/**
	 * Arrival amount 着荷金額.<p>
	 *
	 */
	public static final String $ship_in_amt = "ship_in_amt";
	/**
	 * Export arrival amount 輸出着荷金額.<p>
	 *
	 */
	public static final String $ex_ship_in_amt = "ex_ship_in_amt";
	/**
	 * Shipping return GR amount 出荷返品入庫金額.<p>
	 *
	 */
	public static final String $ship_rtn_gr_amt = "ship_rtn_gr_amt";
	/**
	 * Sales return GR amount 売上返品入庫金額.<p>
	 *
	 */
	public static final String $sls_rtn_gr_amt = "sls_rtn_gr_amt";
	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public static final String $gi_total_amt = "gi_total_amt";
	/**
	 * Receipt return amount 入荷返品金額.<p>
	 *
	 */
	public static final String $arr_rtn_amt = "arr_rtn_amt";
	/**
	 * Purchase GI amount 仕入出庫金額.<p>
	 *
	 */
	public static final String $purc_gi_amt = "purc_gi_amt";
	/**
	 * Receiving for a fee GI amount 有償受給出庫金額.<p>
	 *
	 */
	public static final String $onr_rcv_gi_amt = "onr_rcv_gi_amt";
	/**
	 * Purchase return GI amount 仕入返品出庫金額.<p>
	 *
	 */
	public static final String $purc_rtn_gi_amt = "purc_rtn_gi_amt";
	/**
	 * Receiving for a fee return GI amount 有償受給返品出庫金額.<p>
	 *
	 */
	public static final String $onr_rcv_ret_gi_amt = "onr_rcv_ret_gi_amt";
	/**
	 * Expense purchase GI amount 経費購買出庫金額.<p>
	 *
	 */
	public static final String $xpns_purc_gi_amt = "xpns_purc_gi_amt";
	/**
	 * Expense purchase return GI amount 経費購買返品出庫金額.<p>
	 *
	 */
	public static final String $xpns_purc_rtn_gi_amt = "xpns_purc_rtn_gi_amt";
	/**
	 * Defective acceptance GI amount 検収不良出庫金額.<p>
	 *
	 */
	public static final String $accpt_dfct_gi_amt = "accpt_dfct_gi_amt";
	/**
	 * Input amount 投入金額.<p>
	 *
	 */
	public static final String $inpt_amt = "inpt_amt";
	/**
	 * Loss amount ロス金額.<p>
	 *
	 */
	public static final String $loss_amt = "loss_amt";
	/**
	 * Non-chargeable supply GI amount 無償支給出庫金額.<p>
	 *
	 */
	public static final String $ffr_prov_gi_amt = "ffr_prov_gi_amt";
	/**
	 * Chargeable supply GI amount 有償支給出庫金額.<p>
	 *
	 */
	public static final String $onr_prov_gi_amt = "onr_prov_gi_amt";
	/**
	 * Non-chargeable supply return GI amount 無償支給返品出庫金額.<p>
	 *
	 */
	public static final String $ffr_prov_rtn_gi_amt = "ffr_prov_rtn_gi_amt";
	/**
	 * Chargeable supply return GI amount 有償支給返品出庫金額.<p>
	 *
	 */
	public static final String $onr_prov_rtn_gi_amt = "onr_prov_rtn_gi_amt";
	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public static final String $insp_gi_amt = "insp_gi_amt";
	/**
	 * Inspection completed GI amount 検査完了出庫金額.<p>
	 *
	 */
	public static final String $insp_cmpl_gi_amt = "insp_cmpl_gi_amt";
	/**
	 * Inspection decision GI amount 検査判定出庫金額.<p>
	 *
	 */
	public static final String $insp_judg_gi_amt = "insp_judg_gi_amt";
	/**
	 * Re-inspection GI amount 再検査出庫金額.<p>
	 *
	 */
	public static final String $reinsp_gi_amt = "reinsp_gi_amt";
	/**
	 * Sampling amount 検査抜取金額.<p>
	 *
	 */
	public static final String $insp_smpl_gi_amt = "insp_smpl_gi_amt";
	/**
	 * Inventory count variance amount (GI) 棚卸差異減耗金額.<p>
	 *
	 */
	public static final String $stk_adjst_gi_amt = "stk_adjst_gi_amt";
	/**
	 * Warehousing GI amount 倉入出庫金額.<p>
	 *
	 */
	public static final String $prdct_wh_gi_amt = "prdct_wh_gi_amt";
	/**
	 * GI returning amount 戻入出庫金額.<p>
	 *
	 */
	public static final String $prdct_wh_rtn_gi_amt = "prdct_wh_rtn_gi_amt";
	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public static final String $xfr_gi_amt = "xfr_gi_amt";
	/**
	 * Move-out amount 転出金額.<p>
	 *
	 */
	public static final String $xfr_out_amt = "xfr_out_amt";
	/**
	 * Purchase move-out amount 仕入転出金額.<p>
	 *
	 */
	public static final String $purc_xfr_out_amt = "purc_xfr_out_amt";
	/**
	 * Movement/transport return GI amount 移動・移送返品出庫金額.<p>
	 *
	 */
	public static final String $xfr_rtn_gi_amt = "xfr_rtn_gi_amt";
	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public static final String $acxfr_gi_amt = "acxfr_gi_amt";
	/**
	 * Disposal amount 廃棄金額.<p>
	 *
	 */
	public static final String $scrp_amt = "scrp_amt";
	/**
	 * Item transfer GI amount 品目振替出庫金額.<p>
	 *
	 */
	public static final String $xfr_itm_gi_amt = "xfr_itm_gi_amt";
	/**
	 * Lot/SEIBAN No. transfer GI amount ロット・手配ＮＯ振替出庫金額.<p>
	 *
	 */
	public static final String $xfr_lot_sno_gi_amt = "xfr_lot_sno_gi_amt";
	/**
	 * GI amount (Grading/conforming type transfer) 格付・良品区分振替出庫金額.<p>
	 *
	 */
	public static final String $xfr_grd_gi_amt = "xfr_grd_gi_amt";
	/**
	 * SKU transfer GI amount 荷姿振替出庫金額.<p>
	 *
	 */
	public static final String $xfr_pack_gi_amt = "xfr_pack_gi_amt";
	/**
	 * Shipping amount 出荷金額.<p>
	 *
	 */
	public static final String $ship_out_amt = "ship_out_amt";
	/**
	 * Export shipping amount 輸出出荷金額.<p>
	 *
	 */
	public static final String $ex_ship_out_amt = "ex_ship_out_amt";
	/**
	 * Shipping return GI amount 出荷返品出庫金額.<p>
	 *
	 */
	public static final String $ship_rtn_gi_amt = "ship_rtn_gi_amt";
	/**
	 * Sales return GI amount 売上返品出庫金額.<p>
	 *
	 */
	public static final String $sls_rtn_gi_amt = "sls_rtn_gi_amt";
	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public static final String $end_stk_amt = "end_stk_amt";


	public static final MCMeta mly_io_cl_ym_META = createCommonMeta($mly_io_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta in_xfr_typ_META = createCommonMeta($in_xfr_typ, mcframe.commonMS.meta.MS_META.IN_XFR_TYP);
	public static final MCMeta in_xfr_typ_nm_META = createCommonMeta($in_xfr_typ_nm, mcframe.commonMS.meta.MS_META.IN_XFR_TYP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta fix_no_typ_META = createCommonMeta($fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta fix_no_typ_nm_META = createCommonMeta($fix_no_typ_nm, mcframe.commonMS.meta.MS_META.FIX_NO_TYP_NM);
	public static final MCMeta fix_no_META = createCommonMeta($fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta io_act_typ_META = createCommonMeta($io_act_typ, mcframe.commonMS.meta.MS_META.IO_ACT_TYP);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rnd_typ_META = createCommonMeta($rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_unit_rnd_typ_META = createCommonMeta($pack_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_amt_META = createCommonMeta($stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_dec_place_META = createCommonMeta($base_cur_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_rnd_typ_META = createCommonMeta($base_cur_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta std_unit_cost_META = createCommonMeta($std_unit_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
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
	public static final MCMeta ini_stk_qty_META = createCommonMeta($ini_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_total_qty_META = createCommonMeta($gr_total_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta arr_qty_META = createCommonMeta($arr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_gr_qty_META = createCommonMeta($purc_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta onr_rcv_gr_qty_META = createCommonMeta($onr_rcv_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_rtn_gr_qty_META = createCommonMeta($purc_rtn_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta onr_rcv_ret_gr_qty_META = createCommonMeta($onr_rcv_ret_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xpns_purc_gr_qty_META = createCommonMeta($xpns_purc_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xpns_purc_rtn_gr_qty_META = createCommonMeta($xpns_purc_rtn_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta accpt_dfct_gr_qty_META = createCommonMeta($accpt_dfct_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_qty_META = createCommonMeta($mfg_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta bymfg_qty_META = createCommonMeta($bymfg_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ffr_prov_gr_qty_META = createCommonMeta($ffr_prov_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta onr_prov_gr_qty_META = createCommonMeta($onr_prov_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ffr_prov_rtn_gr_qty_META = createCommonMeta($ffr_prov_rtn_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta onr_prov_rtn_gr_qty_META = createCommonMeta($onr_prov_rtn_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta insp_gr_qty_META = createCommonMeta($insp_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta insp_cmpl_gr_qty_META = createCommonMeta($insp_cmpl_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta insp_judg_gr_qty_META = createCommonMeta($insp_judg_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta reinsp_gr_qty_META = createCommonMeta($reinsp_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_adjst_gr_qty_META = createCommonMeta($stk_adjst_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prdct_wh_gr_qty_META = createCommonMeta($prdct_wh_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prdct_wh_rtn_gr_qty_META = createCommonMeta($prdct_wh_rtn_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_gr_qty_META = createCommonMeta($xfr_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_in_qty_META = createCommonMeta($xfr_in_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_xfr_in_qty_META = createCommonMeta($purc_xfr_in_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_rtn_gr_qty_META = createCommonMeta($xfr_rtn_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta acxfr_gr_qty_META = createCommonMeta($acxfr_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta arr_cststk_qty_META = createCommonMeta($arr_cststk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_itm_gr_qty_META = createCommonMeta($xfr_itm_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_lot_sno_gr_qty_META = createCommonMeta($xfr_lot_sno_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_grd_gr_qty_META = createCommonMeta($xfr_grd_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_pack_gr_qty_META = createCommonMeta($xfr_pack_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_in_qty_META = createCommonMeta($ship_in_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ex_ship_in_qty_META = createCommonMeta($ex_ship_in_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_rtn_gr_qty_META = createCommonMeta($ship_rtn_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_rtn_gr_qty_META = createCommonMeta($sls_rtn_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_total_qty_META = createCommonMeta($gi_total_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta arr_rtn_qty_META = createCommonMeta($arr_rtn_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_gi_qty_META = createCommonMeta($purc_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta onr_rcv_gi_qty_META = createCommonMeta($onr_rcv_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_rtn_gi_qty_META = createCommonMeta($purc_rtn_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta onr_rcv_ret_gi_qty_META = createCommonMeta($onr_rcv_ret_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xpns_purc_gi_qty_META = createCommonMeta($xpns_purc_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xpns_purc_rtn_gi_qty_META = createCommonMeta($xpns_purc_rtn_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta accpt_dfct_gi_qty_META = createCommonMeta($accpt_dfct_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inpt_qty_META = createCommonMeta($inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta loss_qty_META = createCommonMeta($loss_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ffr_prov_gi_qty_META = createCommonMeta($ffr_prov_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta onr_prov_gi_qty_META = createCommonMeta($onr_prov_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ffr_prov_rtn_gi_qty_META = createCommonMeta($ffr_prov_rtn_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta onr_prov_rtn_gi_qty_META = createCommonMeta($onr_prov_rtn_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta insp_gi_qty_META = createCommonMeta($insp_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta insp_cmpl_gi_qty_META = createCommonMeta($insp_cmpl_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta insp_judg_gi_qty_META = createCommonMeta($insp_judg_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta reinsp_gi_qty_META = createCommonMeta($reinsp_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta insp_smpl_gi_qty_META = createCommonMeta($insp_smpl_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_adjst_gi_qty_META = createCommonMeta($stk_adjst_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prdct_wh_gi_qty_META = createCommonMeta($prdct_wh_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prdct_wh_rtn_gi_qty_META = createCommonMeta($prdct_wh_rtn_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_gi_qty_META = createCommonMeta($xfr_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_out_qty_META = createCommonMeta($xfr_out_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_xfr_out_qty_META = createCommonMeta($purc_xfr_out_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_rtn_gi_qty_META = createCommonMeta($xfr_rtn_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta acxfr_gi_qty_META = createCommonMeta($acxfr_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta scrp_qty_META = createCommonMeta($scrp_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_itm_gi_qty_META = createCommonMeta($xfr_itm_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_lot_sno_gi_qty_META = createCommonMeta($xfr_lot_sno_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_grd_gi_qty_META = createCommonMeta($xfr_grd_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xfr_pack_gi_qty_META = createCommonMeta($xfr_pack_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_out_qty_META = createCommonMeta($ship_out_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ex_ship_out_qty_META = createCommonMeta($ex_ship_out_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_rtn_gi_qty_META = createCommonMeta($ship_rtn_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_rtn_gi_qty_META = createCommonMeta($sls_rtn_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_qty_META = createCommonMeta($sls_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta end_stk_qty_META = createCommonMeta($end_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ini_stk_amt_META = createCommonMeta($ini_stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gr_total_amt_META = createCommonMeta($gr_total_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta arr_amt_META = createCommonMeta($arr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_gr_amt_META = createCommonMeta($purc_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_rcv_gr_amt_META = createCommonMeta($onr_rcv_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_rtn_gr_amt_META = createCommonMeta($purc_rtn_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_rcv_ret_gr_amt_META = createCommonMeta($onr_rcv_ret_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xpns_purc_gr_amt_META = createCommonMeta($xpns_purc_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xpns_purc_rtn_gr_amt_META = createCommonMeta($xpns_purc_rtn_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta accpt_dfct_gr_amt_META = createCommonMeta($accpt_dfct_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta mfg_amt_META = createCommonMeta($mfg_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bymfg_amt_META = createCommonMeta($bymfg_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ffr_prov_gr_amt_META = createCommonMeta($ffr_prov_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_prov_gr_amt_META = createCommonMeta($onr_prov_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ffr_prov_rtn_gr_amt_META = createCommonMeta($ffr_prov_rtn_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_prov_rtn_gr_amt_META = createCommonMeta($onr_prov_rtn_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta insp_gr_amt_META = createCommonMeta($insp_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta insp_cmpl_gr_amt_META = createCommonMeta($insp_cmpl_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta insp_judg_gr_amt_META = createCommonMeta($insp_judg_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta reinsp_gr_amt_META = createCommonMeta($reinsp_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta stk_adjst_gr_amt_META = createCommonMeta($stk_adjst_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prdct_wh_gr_amt_META = createCommonMeta($prdct_wh_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prdct_wh_rtn_gr_amt_META = createCommonMeta($prdct_wh_rtn_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_gr_amt_META = createCommonMeta($xfr_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_in_amt_META = createCommonMeta($xfr_in_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_xfr_in_amt_META = createCommonMeta($purc_xfr_in_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_rtn_gr_amt_META = createCommonMeta($xfr_rtn_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta acxfr_gr_amt_META = createCommonMeta($acxfr_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta arr_cststk_amt_META = createCommonMeta($arr_cststk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_itm_gr_amt_META = createCommonMeta($xfr_itm_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_lot_sno_gr_amt_META = createCommonMeta($xfr_lot_sno_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_grd_gr_amt_META = createCommonMeta($xfr_grd_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_pack_gr_amt_META = createCommonMeta($xfr_pack_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ship_in_amt_META = createCommonMeta($ship_in_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ex_ship_in_amt_META = createCommonMeta($ex_ship_in_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ship_rtn_gr_amt_META = createCommonMeta($ship_rtn_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_rtn_gr_amt_META = createCommonMeta($sls_rtn_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gi_total_amt_META = createCommonMeta($gi_total_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta arr_rtn_amt_META = createCommonMeta($arr_rtn_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_gi_amt_META = createCommonMeta($purc_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_rcv_gi_amt_META = createCommonMeta($onr_rcv_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_rtn_gi_amt_META = createCommonMeta($purc_rtn_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_rcv_ret_gi_amt_META = createCommonMeta($onr_rcv_ret_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xpns_purc_gi_amt_META = createCommonMeta($xpns_purc_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xpns_purc_rtn_gi_amt_META = createCommonMeta($xpns_purc_rtn_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta accpt_dfct_gi_amt_META = createCommonMeta($accpt_dfct_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inpt_amt_META = createCommonMeta($inpt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta loss_amt_META = createCommonMeta($loss_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ffr_prov_gi_amt_META = createCommonMeta($ffr_prov_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_prov_gi_amt_META = createCommonMeta($onr_prov_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ffr_prov_rtn_gi_amt_META = createCommonMeta($ffr_prov_rtn_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_prov_rtn_gi_amt_META = createCommonMeta($onr_prov_rtn_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta insp_gi_amt_META = createCommonMeta($insp_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta insp_cmpl_gi_amt_META = createCommonMeta($insp_cmpl_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta insp_judg_gi_amt_META = createCommonMeta($insp_judg_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta reinsp_gi_amt_META = createCommonMeta($reinsp_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta insp_smpl_gi_amt_META = createCommonMeta($insp_smpl_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta stk_adjst_gi_amt_META = createCommonMeta($stk_adjst_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prdct_wh_gi_amt_META = createCommonMeta($prdct_wh_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prdct_wh_rtn_gi_amt_META = createCommonMeta($prdct_wh_rtn_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_gi_amt_META = createCommonMeta($xfr_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_out_amt_META = createCommonMeta($xfr_out_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_xfr_out_amt_META = createCommonMeta($purc_xfr_out_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_rtn_gi_amt_META = createCommonMeta($xfr_rtn_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta acxfr_gi_amt_META = createCommonMeta($acxfr_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta scrp_amt_META = createCommonMeta($scrp_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_itm_gi_amt_META = createCommonMeta($xfr_itm_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_lot_sno_gi_amt_META = createCommonMeta($xfr_lot_sno_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_grd_gi_amt_META = createCommonMeta($xfr_grd_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_pack_gi_amt_META = createCommonMeta($xfr_pack_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ship_out_amt_META = createCommonMeta($ship_out_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ex_ship_out_amt_META = createCommonMeta($ex_ship_out_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ship_rtn_gi_amt_META = createCommonMeta($ship_rtn_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_rtn_gi_amt_META = createCommonMeta($sls_rtn_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_stk_amt_META = createCommonMeta($end_stk_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mly_io_cl_ym_META,
			wg_cd_META,
			wg_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ver_no_META,
			lot_no_META,
			sublot_no_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			site_cd_META,
			site_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			gd_cd_META,
			gd_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			in_xfr_typ_META,
			in_xfr_typ_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			fix_no_typ_META,
			fix_no_typ_nm_META,
			fix_no_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			io_act_typ_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			rnd_typ_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			pack_unit_dec_place_META,
			pack_unit_rnd_typ_META,
			pack_unit_qty_META,
			stk_amt_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_dec_place_META,
			base_cur_rnd_typ_META,
			std_unit_cost_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
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
			ini_stk_qty_META,
			gr_total_qty_META,
			arr_qty_META,
			purc_gr_qty_META,
			onr_rcv_gr_qty_META,
			purc_rtn_gr_qty_META,
			onr_rcv_ret_gr_qty_META,
			xpns_purc_gr_qty_META,
			xpns_purc_rtn_gr_qty_META,
			accpt_dfct_gr_qty_META,
			mfg_qty_META,
			bymfg_qty_META,
			ffr_prov_gr_qty_META,
			onr_prov_gr_qty_META,
			ffr_prov_rtn_gr_qty_META,
			onr_prov_rtn_gr_qty_META,
			insp_gr_qty_META,
			insp_cmpl_gr_qty_META,
			insp_judg_gr_qty_META,
			reinsp_gr_qty_META,
			stk_adjst_gr_qty_META,
			prdct_wh_gr_qty_META,
			prdct_wh_rtn_gr_qty_META,
			xfr_gr_qty_META,
			xfr_in_qty_META,
			purc_xfr_in_qty_META,
			xfr_rtn_gr_qty_META,
			acxfr_gr_qty_META,
			arr_cststk_qty_META,
			xfr_itm_gr_qty_META,
			xfr_lot_sno_gr_qty_META,
			xfr_grd_gr_qty_META,
			xfr_pack_gr_qty_META,
			ship_in_qty_META,
			ex_ship_in_qty_META,
			ship_rtn_gr_qty_META,
			sls_rtn_gr_qty_META,
			gi_total_qty_META,
			arr_rtn_qty_META,
			purc_gi_qty_META,
			onr_rcv_gi_qty_META,
			purc_rtn_gi_qty_META,
			onr_rcv_ret_gi_qty_META,
			xpns_purc_gi_qty_META,
			xpns_purc_rtn_gi_qty_META,
			accpt_dfct_gi_qty_META,
			inpt_qty_META,
			loss_qty_META,
			ffr_prov_gi_qty_META,
			onr_prov_gi_qty_META,
			ffr_prov_rtn_gi_qty_META,
			onr_prov_rtn_gi_qty_META,
			insp_gi_qty_META,
			insp_cmpl_gi_qty_META,
			insp_judg_gi_qty_META,
			reinsp_gi_qty_META,
			insp_smpl_gi_qty_META,
			stk_adjst_gi_qty_META,
			prdct_wh_gi_qty_META,
			prdct_wh_rtn_gi_qty_META,
			xfr_gi_qty_META,
			xfr_out_qty_META,
			purc_xfr_out_qty_META,
			xfr_rtn_gi_qty_META,
			acxfr_gi_qty_META,
			scrp_qty_META,
			xfr_itm_gi_qty_META,
			xfr_lot_sno_gi_qty_META,
			xfr_grd_gi_qty_META,
			xfr_pack_gi_qty_META,
			ship_out_qty_META,
			ex_ship_out_qty_META,
			ship_rtn_gi_qty_META,
			sls_rtn_gi_qty_META,
			sls_qty_META,
			end_stk_qty_META,
			ini_stk_amt_META,
			gr_total_amt_META,
			arr_amt_META,
			purc_gr_amt_META,
			onr_rcv_gr_amt_META,
			purc_rtn_gr_amt_META,
			onr_rcv_ret_gr_amt_META,
			xpns_purc_gr_amt_META,
			xpns_purc_rtn_gr_amt_META,
			accpt_dfct_gr_amt_META,
			mfg_amt_META,
			bymfg_amt_META,
			ffr_prov_gr_amt_META,
			onr_prov_gr_amt_META,
			ffr_prov_rtn_gr_amt_META,
			onr_prov_rtn_gr_amt_META,
			insp_gr_amt_META,
			insp_cmpl_gr_amt_META,
			insp_judg_gr_amt_META,
			reinsp_gr_amt_META,
			stk_adjst_gr_amt_META,
			prdct_wh_gr_amt_META,
			prdct_wh_rtn_gr_amt_META,
			xfr_gr_amt_META,
			xfr_in_amt_META,
			purc_xfr_in_amt_META,
			xfr_rtn_gr_amt_META,
			acxfr_gr_amt_META,
			arr_cststk_amt_META,
			xfr_itm_gr_amt_META,
			xfr_lot_sno_gr_amt_META,
			xfr_grd_gr_amt_META,
			xfr_pack_gr_amt_META,
			ship_in_amt_META,
			ex_ship_in_amt_META,
			ship_rtn_gr_amt_META,
			sls_rtn_gr_amt_META,
			gi_total_amt_META,
			arr_rtn_amt_META,
			purc_gi_amt_META,
			onr_rcv_gi_amt_META,
			purc_rtn_gi_amt_META,
			onr_rcv_ret_gi_amt_META,
			xpns_purc_gi_amt_META,
			xpns_purc_rtn_gi_amt_META,
			accpt_dfct_gi_amt_META,
			inpt_amt_META,
			loss_amt_META,
			ffr_prov_gi_amt_META,
			onr_prov_gi_amt_META,
			ffr_prov_rtn_gi_amt_META,
			onr_prov_rtn_gi_amt_META,
			insp_gi_amt_META,
			insp_cmpl_gi_amt_META,
			insp_judg_gi_amt_META,
			reinsp_gi_amt_META,
			insp_smpl_gi_amt_META,
			stk_adjst_gi_amt_META,
			prdct_wh_gi_amt_META,
			prdct_wh_rtn_gi_amt_META,
			xfr_gi_amt_META,
			xfr_out_amt_META,
			purc_xfr_out_amt_META,
			xfr_rtn_gi_amt_META,
			acxfr_gi_amt_META,
			scrp_amt_META,
			xfr_itm_gi_amt_META,
			xfr_lot_sno_gi_amt_META,
			xfr_grd_gi_amt_META,
			xfr_pack_gi_amt_META,
			ship_out_amt_META,
			ex_ship_out_amt_META,
			ship_rtn_gi_amt_META,
			sls_rtn_gi_amt_META,
			sls_amt_META,
			end_stk_amt_META
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
				{$stk_insp_typ, "MSC_STK_INSP_TYP"},	// stk_insp_typ
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$in_xfr_typ, "MSC_IN_XFR_TYP"},	// in_xfr_typ
				{$asst_typ, "MAC_ASST_TYP"},	// asst_typ
				{$stk_id_typ, "MSC_STK_ID_TYP"},	// stk_id_typ
				{$fix_no_typ, "MSC_FIX_NO_TYP"},	// fix_no_typ
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
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
	 * Monthly GR/GI closing month 月次受払締月度.<p>
	 *
	 */
	public MCDate mly_io_cl_ym() {
		return getConstDate(offset + 0, $mly_io_cl_ym);
	}

	/**
	 * Monthly GR/GI closing month 月次受払締月度.<p>
	 *
	 */
	public void mly_io_cl_ym(MCDate value) {
		setConstDate(offset + 0, $mly_io_cl_ym, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 2, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 2, $wg_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 3, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 3, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 4, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 4, $dpt_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 5, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 5, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 6, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 6, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 7, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 7, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 8, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 8, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 9, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 9, $itm_nm, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 10, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 10, $ver_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 11, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 11, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 12, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 12, $sublot_no, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 13, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 13, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 14, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 14, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 15, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 15, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 16, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 16, $str_ln_nm, value);
	}


	/**
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 17, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line cd. 棚・ラインＣＤ無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 17, $str_ln_cd_none_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 18, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 18, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 19, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 19, $site_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 20, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 20, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 21, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 21, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 22, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 22, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 23, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 23, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 24, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 24, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 25, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 25, $loc_grp_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 26, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 26, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 27, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 27, $gd_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 28, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 28, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 29, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 29, $stk_insp_typ_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 30, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 30, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 31, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 31, $quality_typ_nm, value);
	}


	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return getConstString(offset + 32, $in_xfr_typ);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		setConstString(offset + 32, $in_xfr_typ, value);
	}


	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public String in_xfr_typ_nm() {
		return getConstString(offset + 33, $in_xfr_typ_nm);
	}

	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public void in_xfr_typ_nm(String value) {
		setConstString(offset + 33, $in_xfr_typ_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 34, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 34, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 35, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 35, $asst_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 36, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 36, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 37, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 37, $stk_id_typ_nm, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 38, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 38, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 39, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 39, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 40, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 40, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 41, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 41, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 42, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 42, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 43, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 43, $wrk_nm, value);
	}


	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return getConstString(offset + 44, $fix_no_typ);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		setConstString(offset + 44, $fix_no_typ, value);
	}


	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public String fix_no_typ_nm() {
		return getConstString(offset + 45, $fix_no_typ_nm);
	}

	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public void fix_no_typ_nm(String value) {
		setConstString(offset + 45, $fix_no_typ_nm, value);
	}


	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return getConstString(offset + 46, $fix_no);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		setConstString(offset + 46, $fix_no, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 47, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 47, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 48, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 48, $stk_bp_nm, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 49, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 49, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 50, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 50, $stk_arrv_bp_nm, value);
	}


	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public String io_act_typ() {
		return getConstString(offset + 51, $io_act_typ);
	}

	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public void io_act_typ(String value) {
		setConstString(offset + 51, $io_act_typ, value);
	}


	/**
	 * Unit cd. (For screen component linkage) 単位ＣＤ（画面部品連携用）.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 52, $unit_cd);
	}

	/**
	 * Unit cd. (For screen component linkage) 単位ＣＤ（画面部品連携用）.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 52, $unit_cd, value);
	}


	/**
	 * Unit name (For screen component linkage) 単位名（画面部品連携用）.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 53, $unit_nm);
	}

	/**
	 * Unit name (For screen component linkage) 単位名（画面部品連携用）.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 53, $unit_nm, value);
	}


	/**
	 * Number of decimal places (For screen component linkage) 小数有効桁数（画面部品連携用）.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 54, $dec_place);
	}

	/**
	 * Number of decimal places (For screen component linkage) 小数有効桁数（画面部品連携用）.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 54, $dec_place, value);
	}

	/**
	 * Number of decimal places (For screen component linkage) 小数有効桁数（画面部品連携用）.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 54, $dec_place, value);
	}

	/**
	 * Number of decimal places (For screen component linkage) 小数有効桁数（画面部品連携用）.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 54, $dec_place, value);
	}

	/**
	 * Number of decimal places (For screen component linkage) 小数有効桁数（画面部品連携用）.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 54, $dec_place, value);
	}

	/**
	 * Number of decimal places (For screen component linkage) 小数有効桁数（画面部品連携用）.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 54, $dec_place, value);
	}


	/**
	 * Rounding type (For screen component linkage) 端数処理区分（画面部品連携用）.<p>
	 *
	 */
	public String rnd_typ() {
		return getConstString(offset + 55, $rnd_typ);
	}

	/**
	 * Rounding type (For screen component linkage) 端数処理区分（画面部品連携用）.<p>
	 *
	 */
	public void rnd_typ(String value) {
		setConstString(offset + 55, $rnd_typ, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 56, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 56, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 57, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 57, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 58, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 58, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 58, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 58, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 58, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 58, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 59, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 59, $base_unit_rnd_typ, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 60, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 60, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 60, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 60, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 60, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 60, $base_unit_qty, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 61, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 61, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 62, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 62, $pack_unit_nm, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 63, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 63, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 63, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 63, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 63, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 63, $pack_unit_dec_place, value);
	}


	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public String pack_unit_rnd_typ() {
		return getConstString(offset + 64, $pack_unit_rnd_typ);
	}

	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public void pack_unit_rnd_typ(String value) {
		setConstString(offset + 64, $pack_unit_rnd_typ, value);
	}


	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 65, $pack_unit_qty);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 65, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 65, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 65, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 65, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 65, $pack_unit_qty, value);
	}


	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public MCNumber stk_amt() {
		return getConstNumber(offset + 66, $stk_amt);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(MCNumber value) {
		setConstNumber(offset + 66, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(int value) {
		setConstNumber(offset + 66, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(long value) {
		setConstNumber(offset + 66, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(float value) {
		setConstNumber(offset + 66, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(double value) {
		setConstNumber(offset + 66, $stk_amt, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 67, $base_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 67, $base_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 68, $base_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 68, $base_cur_nm, value);
	}


	/**
	 * Currency unit number of decimal places 通貨単位小数点有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_dec_place() {
		return getConstNumber(offset + 69, $base_cur_dec_place);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数点有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(MCNumber value) {
		setConstNumber(offset + 69, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数点有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(int value) {
		setConstNumber(offset + 69, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数点有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(long value) {
		setConstNumber(offset + 69, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数点有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(float value) {
		setConstNumber(offset + 69, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数点有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(double value) {
		setConstNumber(offset + 69, $base_cur_dec_place, value);
	}


	/**
	 * Currency unit rounding type 通貨単位端数処理区分.<p>
	 *
	 */
	public String base_cur_rnd_typ() {
		return getConstString(offset + 70, $base_cur_rnd_typ);
	}

	/**
	 * Currency unit rounding type 通貨単位端数処理区分.<p>
	 *
	 */
	public void base_cur_rnd_typ(String value) {
		setConstString(offset + 70, $base_cur_rnd_typ, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber std_unit_cost() {
		return getConstNumber(offset + 71, $std_unit_cost);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(MCNumber value) {
		setConstNumber(offset + 71, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(int value) {
		setConstNumber(offset + 71, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(long value) {
		setConstNumber(offset + 71, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(float value) {
		setConstNumber(offset + 71, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(double value) {
		setConstNumber(offset + 71, $std_unit_cost, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 72, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 72, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 73, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 73, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 74, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 74, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 75, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 75, $itm_typ_d_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 76, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 76, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 77, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 77, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 78, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 78, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 79, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 79, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 80, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 80, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 81, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 81, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 82, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 82, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 83, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 83, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 84, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 84, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 85, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 85, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 86, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 86, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 87, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 87, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 88, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 88, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 89, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 89, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 90, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 90, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 91, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 91, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 92, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 92, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 93, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 93, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 94, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 94, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 95, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 95, $itm_grp_nm10, value);
	}


	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public MCNumber ini_stk_qty() {
		return getConstNumber(offset + 96, $ini_stk_qty);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(MCNumber value) {
		setConstNumber(offset + 96, $ini_stk_qty, value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(int value) {
		setConstNumber(offset + 96, $ini_stk_qty, value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(long value) {
		setConstNumber(offset + 96, $ini_stk_qty, value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(float value) {
		setConstNumber(offset + 96, $ini_stk_qty, value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(double value) {
		setConstNumber(offset + 96, $ini_stk_qty, value);
	}


	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public MCNumber gr_total_qty() {
		return getConstNumber(offset + 97, $gr_total_qty);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(MCNumber value) {
		setConstNumber(offset + 97, $gr_total_qty, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(int value) {
		setConstNumber(offset + 97, $gr_total_qty, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(long value) {
		setConstNumber(offset + 97, $gr_total_qty, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(float value) {
		setConstNumber(offset + 97, $gr_total_qty, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(double value) {
		setConstNumber(offset + 97, $gr_total_qty, value);
	}


	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public MCNumber arr_qty() {
		return getConstNumber(offset + 98, $arr_qty);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		setConstNumber(offset + 98, $arr_qty, value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(int value) {
		setConstNumber(offset + 98, $arr_qty, value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(long value) {
		setConstNumber(offset + 98, $arr_qty, value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(float value) {
		setConstNumber(offset + 98, $arr_qty, value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(double value) {
		setConstNumber(offset + 98, $arr_qty, value);
	}


	/**
	 * Purchase GR qty. 仕入入庫数量.<p>
	 *
	 */
	public MCNumber purc_gr_qty() {
		return getConstNumber(offset + 99, $purc_gr_qty);
	}

	/**
	 * Purchase GR qty. 仕入入庫数量.<p>
	 *
	 */
	public void purc_gr_qty(MCNumber value) {
		setConstNumber(offset + 99, $purc_gr_qty, value);
	}

	/**
	 * Purchase GR qty. 仕入入庫数量.<p>
	 *
	 */
	public void purc_gr_qty(int value) {
		setConstNumber(offset + 99, $purc_gr_qty, value);
	}

	/**
	 * Purchase GR qty. 仕入入庫数量.<p>
	 *
	 */
	public void purc_gr_qty(long value) {
		setConstNumber(offset + 99, $purc_gr_qty, value);
	}

	/**
	 * Purchase GR qty. 仕入入庫数量.<p>
	 *
	 */
	public void purc_gr_qty(float value) {
		setConstNumber(offset + 99, $purc_gr_qty, value);
	}

	/**
	 * Purchase GR qty. 仕入入庫数量.<p>
	 *
	 */
	public void purc_gr_qty(double value) {
		setConstNumber(offset + 99, $purc_gr_qty, value);
	}


	/**
	 * Receiving for a fee GR qty. 有償受給入庫数量.<p>
	 *
	 */
	public MCNumber onr_rcv_gr_qty() {
		return getConstNumber(offset + 100, $onr_rcv_gr_qty);
	}

	/**
	 * Receiving for a fee GR qty. 有償受給入庫数量.<p>
	 *
	 */
	public void onr_rcv_gr_qty(MCNumber value) {
		setConstNumber(offset + 100, $onr_rcv_gr_qty, value);
	}

	/**
	 * Receiving for a fee GR qty. 有償受給入庫数量.<p>
	 *
	 */
	public void onr_rcv_gr_qty(int value) {
		setConstNumber(offset + 100, $onr_rcv_gr_qty, value);
	}

	/**
	 * Receiving for a fee GR qty. 有償受給入庫数量.<p>
	 *
	 */
	public void onr_rcv_gr_qty(long value) {
		setConstNumber(offset + 100, $onr_rcv_gr_qty, value);
	}

	/**
	 * Receiving for a fee GR qty. 有償受給入庫数量.<p>
	 *
	 */
	public void onr_rcv_gr_qty(float value) {
		setConstNumber(offset + 100, $onr_rcv_gr_qty, value);
	}

	/**
	 * Receiving for a fee GR qty. 有償受給入庫数量.<p>
	 *
	 */
	public void onr_rcv_gr_qty(double value) {
		setConstNumber(offset + 100, $onr_rcv_gr_qty, value);
	}


	/**
	 * Purchase return GR qty. 仕入返品入庫数量.<p>
	 *
	 */
	public MCNumber purc_rtn_gr_qty() {
		return getConstNumber(offset + 101, $purc_rtn_gr_qty);
	}

	/**
	 * Purchase return GR qty. 仕入返品入庫数量.<p>
	 *
	 */
	public void purc_rtn_gr_qty(MCNumber value) {
		setConstNumber(offset + 101, $purc_rtn_gr_qty, value);
	}

	/**
	 * Purchase return GR qty. 仕入返品入庫数量.<p>
	 *
	 */
	public void purc_rtn_gr_qty(int value) {
		setConstNumber(offset + 101, $purc_rtn_gr_qty, value);
	}

	/**
	 * Purchase return GR qty. 仕入返品入庫数量.<p>
	 *
	 */
	public void purc_rtn_gr_qty(long value) {
		setConstNumber(offset + 101, $purc_rtn_gr_qty, value);
	}

	/**
	 * Purchase return GR qty. 仕入返品入庫数量.<p>
	 *
	 */
	public void purc_rtn_gr_qty(float value) {
		setConstNumber(offset + 101, $purc_rtn_gr_qty, value);
	}

	/**
	 * Purchase return GR qty. 仕入返品入庫数量.<p>
	 *
	 */
	public void purc_rtn_gr_qty(double value) {
		setConstNumber(offset + 101, $purc_rtn_gr_qty, value);
	}


	/**
	 * Receiving for a fee return GR qty. 有償受給返品入庫数量.<p>
	 *
	 */
	public MCNumber onr_rcv_ret_gr_qty() {
		return getConstNumber(offset + 102, $onr_rcv_ret_gr_qty);
	}

	/**
	 * Receiving for a fee return GR qty. 有償受給返品入庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gr_qty(MCNumber value) {
		setConstNumber(offset + 102, $onr_rcv_ret_gr_qty, value);
	}

	/**
	 * Receiving for a fee return GR qty. 有償受給返品入庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gr_qty(int value) {
		setConstNumber(offset + 102, $onr_rcv_ret_gr_qty, value);
	}

	/**
	 * Receiving for a fee return GR qty. 有償受給返品入庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gr_qty(long value) {
		setConstNumber(offset + 102, $onr_rcv_ret_gr_qty, value);
	}

	/**
	 * Receiving for a fee return GR qty. 有償受給返品入庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gr_qty(float value) {
		setConstNumber(offset + 102, $onr_rcv_ret_gr_qty, value);
	}

	/**
	 * Receiving for a fee return GR qty. 有償受給返品入庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gr_qty(double value) {
		setConstNumber(offset + 102, $onr_rcv_ret_gr_qty, value);
	}


	/**
	 * Expense purchase GR qty. 経費購買入庫数量.<p>
	 *
	 */
	public MCNumber xpns_purc_gr_qty() {
		return getConstNumber(offset + 103, $xpns_purc_gr_qty);
	}

	/**
	 * Expense purchase GR qty. 経費購買入庫数量.<p>
	 *
	 */
	public void xpns_purc_gr_qty(MCNumber value) {
		setConstNumber(offset + 103, $xpns_purc_gr_qty, value);
	}

	/**
	 * Expense purchase GR qty. 経費購買入庫数量.<p>
	 *
	 */
	public void xpns_purc_gr_qty(int value) {
		setConstNumber(offset + 103, $xpns_purc_gr_qty, value);
	}

	/**
	 * Expense purchase GR qty. 経費購買入庫数量.<p>
	 *
	 */
	public void xpns_purc_gr_qty(long value) {
		setConstNumber(offset + 103, $xpns_purc_gr_qty, value);
	}

	/**
	 * Expense purchase GR qty. 経費購買入庫数量.<p>
	 *
	 */
	public void xpns_purc_gr_qty(float value) {
		setConstNumber(offset + 103, $xpns_purc_gr_qty, value);
	}

	/**
	 * Expense purchase GR qty. 経費購買入庫数量.<p>
	 *
	 */
	public void xpns_purc_gr_qty(double value) {
		setConstNumber(offset + 103, $xpns_purc_gr_qty, value);
	}


	/**
	 * Expense purchase return GR qty. 経費購買返品入庫数量.<p>
	 *
	 */
	public MCNumber xpns_purc_rtn_gr_qty() {
		return getConstNumber(offset + 104, $xpns_purc_rtn_gr_qty);
	}

	/**
	 * Expense purchase return GR qty. 経費購買返品入庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_qty(MCNumber value) {
		setConstNumber(offset + 104, $xpns_purc_rtn_gr_qty, value);
	}

	/**
	 * Expense purchase return GR qty. 経費購買返品入庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_qty(int value) {
		setConstNumber(offset + 104, $xpns_purc_rtn_gr_qty, value);
	}

	/**
	 * Expense purchase return GR qty. 経費購買返品入庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_qty(long value) {
		setConstNumber(offset + 104, $xpns_purc_rtn_gr_qty, value);
	}

	/**
	 * Expense purchase return GR qty. 経費購買返品入庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_qty(float value) {
		setConstNumber(offset + 104, $xpns_purc_rtn_gr_qty, value);
	}

	/**
	 * Expense purchase return GR qty. 経費購買返品入庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_qty(double value) {
		setConstNumber(offset + 104, $xpns_purc_rtn_gr_qty, value);
	}


	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public MCNumber accpt_dfct_gr_qty() {
		return getConstNumber(offset + 105, $accpt_dfct_gr_qty);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_gr_qty(MCNumber value) {
		setConstNumber(offset + 105, $accpt_dfct_gr_qty, value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_gr_qty(int value) {
		setConstNumber(offset + 105, $accpt_dfct_gr_qty, value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_gr_qty(long value) {
		setConstNumber(offset + 105, $accpt_dfct_gr_qty, value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_gr_qty(float value) {
		setConstNumber(offset + 105, $accpt_dfct_gr_qty, value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_gr_qty(double value) {
		setConstNumber(offset + 105, $accpt_dfct_gr_qty, value);
	}


	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public MCNumber mfg_qty() {
		return getConstNumber(offset + 106, $mfg_qty);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(MCNumber value) {
		setConstNumber(offset + 106, $mfg_qty, value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(int value) {
		setConstNumber(offset + 106, $mfg_qty, value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(long value) {
		setConstNumber(offset + 106, $mfg_qty, value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(float value) {
		setConstNumber(offset + 106, $mfg_qty, value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(double value) {
		setConstNumber(offset + 106, $mfg_qty, value);
	}


	/**
	 * By-product mfg. qty. 副産品製造数量.<p>
	 *
	 */
	public MCNumber bymfg_qty() {
		return getConstNumber(offset + 107, $bymfg_qty);
	}

	/**
	 * By-product mfg. qty. 副産品製造数量.<p>
	 *
	 */
	public void bymfg_qty(MCNumber value) {
		setConstNumber(offset + 107, $bymfg_qty, value);
	}

	/**
	 * By-product mfg. qty. 副産品製造数量.<p>
	 *
	 */
	public void bymfg_qty(int value) {
		setConstNumber(offset + 107, $bymfg_qty, value);
	}

	/**
	 * By-product mfg. qty. 副産品製造数量.<p>
	 *
	 */
	public void bymfg_qty(long value) {
		setConstNumber(offset + 107, $bymfg_qty, value);
	}

	/**
	 * By-product mfg. qty. 副産品製造数量.<p>
	 *
	 */
	public void bymfg_qty(float value) {
		setConstNumber(offset + 107, $bymfg_qty, value);
	}

	/**
	 * By-product mfg. qty. 副産品製造数量.<p>
	 *
	 */
	public void bymfg_qty(double value) {
		setConstNumber(offset + 107, $bymfg_qty, value);
	}


	/**
	 * GR qty. (Non-chargeable supply) 無償支給入庫数量.<p>
	 *
	 */
	public MCNumber ffr_prov_gr_qty() {
		return getConstNumber(offset + 108, $ffr_prov_gr_qty);
	}

	/**
	 * GR qty. (Non-chargeable supply) 無償支給入庫数量.<p>
	 *
	 */
	public void ffr_prov_gr_qty(MCNumber value) {
		setConstNumber(offset + 108, $ffr_prov_gr_qty, value);
	}

	/**
	 * GR qty. (Non-chargeable supply) 無償支給入庫数量.<p>
	 *
	 */
	public void ffr_prov_gr_qty(int value) {
		setConstNumber(offset + 108, $ffr_prov_gr_qty, value);
	}

	/**
	 * GR qty. (Non-chargeable supply) 無償支給入庫数量.<p>
	 *
	 */
	public void ffr_prov_gr_qty(long value) {
		setConstNumber(offset + 108, $ffr_prov_gr_qty, value);
	}

	/**
	 * GR qty. (Non-chargeable supply) 無償支給入庫数量.<p>
	 *
	 */
	public void ffr_prov_gr_qty(float value) {
		setConstNumber(offset + 108, $ffr_prov_gr_qty, value);
	}

	/**
	 * GR qty. (Non-chargeable supply) 無償支給入庫数量.<p>
	 *
	 */
	public void ffr_prov_gr_qty(double value) {
		setConstNumber(offset + 108, $ffr_prov_gr_qty, value);
	}


	/**
	 * Chargeable supply GR qty. 有償支給入庫数量.<p>
	 *
	 */
	public MCNumber onr_prov_gr_qty() {
		return getConstNumber(offset + 109, $onr_prov_gr_qty);
	}

	/**
	 * Chargeable supply GR qty. 有償支給入庫数量.<p>
	 *
	 */
	public void onr_prov_gr_qty(MCNumber value) {
		setConstNumber(offset + 109, $onr_prov_gr_qty, value);
	}

	/**
	 * Chargeable supply GR qty. 有償支給入庫数量.<p>
	 *
	 */
	public void onr_prov_gr_qty(int value) {
		setConstNumber(offset + 109, $onr_prov_gr_qty, value);
	}

	/**
	 * Chargeable supply GR qty. 有償支給入庫数量.<p>
	 *
	 */
	public void onr_prov_gr_qty(long value) {
		setConstNumber(offset + 109, $onr_prov_gr_qty, value);
	}

	/**
	 * Chargeable supply GR qty. 有償支給入庫数量.<p>
	 *
	 */
	public void onr_prov_gr_qty(float value) {
		setConstNumber(offset + 109, $onr_prov_gr_qty, value);
	}

	/**
	 * Chargeable supply GR qty. 有償支給入庫数量.<p>
	 *
	 */
	public void onr_prov_gr_qty(double value) {
		setConstNumber(offset + 109, $onr_prov_gr_qty, value);
	}


	/**
	 * Non-chargeable supply return GR qty. 無償支給返品入庫数量.<p>
	 *
	 */
	public MCNumber ffr_prov_rtn_gr_qty() {
		return getConstNumber(offset + 110, $ffr_prov_rtn_gr_qty);
	}

	/**
	 * Non-chargeable supply return GR qty. 無償支給返品入庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_qty(MCNumber value) {
		setConstNumber(offset + 110, $ffr_prov_rtn_gr_qty, value);
	}

	/**
	 * Non-chargeable supply return GR qty. 無償支給返品入庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_qty(int value) {
		setConstNumber(offset + 110, $ffr_prov_rtn_gr_qty, value);
	}

	/**
	 * Non-chargeable supply return GR qty. 無償支給返品入庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_qty(long value) {
		setConstNumber(offset + 110, $ffr_prov_rtn_gr_qty, value);
	}

	/**
	 * Non-chargeable supply return GR qty. 無償支給返品入庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_qty(float value) {
		setConstNumber(offset + 110, $ffr_prov_rtn_gr_qty, value);
	}

	/**
	 * Non-chargeable supply return GR qty. 無償支給返品入庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_qty(double value) {
		setConstNumber(offset + 110, $ffr_prov_rtn_gr_qty, value);
	}


	/**
	 * Chargeable supply return GR qty. 有償支給返品入庫数量.<p>
	 *
	 */
	public MCNumber onr_prov_rtn_gr_qty() {
		return getConstNumber(offset + 111, $onr_prov_rtn_gr_qty);
	}

	/**
	 * Chargeable supply return GR qty. 有償支給返品入庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gr_qty(MCNumber value) {
		setConstNumber(offset + 111, $onr_prov_rtn_gr_qty, value);
	}

	/**
	 * Chargeable supply return GR qty. 有償支給返品入庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gr_qty(int value) {
		setConstNumber(offset + 111, $onr_prov_rtn_gr_qty, value);
	}

	/**
	 * Chargeable supply return GR qty. 有償支給返品入庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gr_qty(long value) {
		setConstNumber(offset + 111, $onr_prov_rtn_gr_qty, value);
	}

	/**
	 * Chargeable supply return GR qty. 有償支給返品入庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gr_qty(float value) {
		setConstNumber(offset + 111, $onr_prov_rtn_gr_qty, value);
	}

	/**
	 * Chargeable supply return GR qty. 有償支給返品入庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gr_qty(double value) {
		setConstNumber(offset + 111, $onr_prov_rtn_gr_qty, value);
	}


	/**
	 * Inspection GR qty. 検査入庫数量.<p>
	 *
	 */
	public MCNumber insp_gr_qty() {
		return getConstNumber(offset + 112, $insp_gr_qty);
	}

	/**
	 * Inspection GR qty. 検査入庫数量.<p>
	 *
	 */
	public void insp_gr_qty(MCNumber value) {
		setConstNumber(offset + 112, $insp_gr_qty, value);
	}

	/**
	 * Inspection GR qty. 検査入庫数量.<p>
	 *
	 */
	public void insp_gr_qty(int value) {
		setConstNumber(offset + 112, $insp_gr_qty, value);
	}

	/**
	 * Inspection GR qty. 検査入庫数量.<p>
	 *
	 */
	public void insp_gr_qty(long value) {
		setConstNumber(offset + 112, $insp_gr_qty, value);
	}

	/**
	 * Inspection GR qty. 検査入庫数量.<p>
	 *
	 */
	public void insp_gr_qty(float value) {
		setConstNumber(offset + 112, $insp_gr_qty, value);
	}

	/**
	 * Inspection GR qty. 検査入庫数量.<p>
	 *
	 */
	public void insp_gr_qty(double value) {
		setConstNumber(offset + 112, $insp_gr_qty, value);
	}


	/**
	 * Inspection completed GR qty. 検査完了入庫数量.<p>
	 *
	 */
	public MCNumber insp_cmpl_gr_qty() {
		return getConstNumber(offset + 113, $insp_cmpl_gr_qty);
	}

	/**
	 * Inspection completed GR qty. 検査完了入庫数量.<p>
	 *
	 */
	public void insp_cmpl_gr_qty(MCNumber value) {
		setConstNumber(offset + 113, $insp_cmpl_gr_qty, value);
	}

	/**
	 * Inspection completed GR qty. 検査完了入庫数量.<p>
	 *
	 */
	public void insp_cmpl_gr_qty(int value) {
		setConstNumber(offset + 113, $insp_cmpl_gr_qty, value);
	}

	/**
	 * Inspection completed GR qty. 検査完了入庫数量.<p>
	 *
	 */
	public void insp_cmpl_gr_qty(long value) {
		setConstNumber(offset + 113, $insp_cmpl_gr_qty, value);
	}

	/**
	 * Inspection completed GR qty. 検査完了入庫数量.<p>
	 *
	 */
	public void insp_cmpl_gr_qty(float value) {
		setConstNumber(offset + 113, $insp_cmpl_gr_qty, value);
	}

	/**
	 * Inspection completed GR qty. 検査完了入庫数量.<p>
	 *
	 */
	public void insp_cmpl_gr_qty(double value) {
		setConstNumber(offset + 113, $insp_cmpl_gr_qty, value);
	}


	/**
	 * Inspection decision GR qty. 検査判定入庫数量.<p>
	 *
	 */
	public MCNumber insp_judg_gr_qty() {
		return getConstNumber(offset + 114, $insp_judg_gr_qty);
	}

	/**
	 * Inspection decision GR qty. 検査判定入庫数量.<p>
	 *
	 */
	public void insp_judg_gr_qty(MCNumber value) {
		setConstNumber(offset + 114, $insp_judg_gr_qty, value);
	}

	/**
	 * Inspection decision GR qty. 検査判定入庫数量.<p>
	 *
	 */
	public void insp_judg_gr_qty(int value) {
		setConstNumber(offset + 114, $insp_judg_gr_qty, value);
	}

	/**
	 * Inspection decision GR qty. 検査判定入庫数量.<p>
	 *
	 */
	public void insp_judg_gr_qty(long value) {
		setConstNumber(offset + 114, $insp_judg_gr_qty, value);
	}

	/**
	 * Inspection decision GR qty. 検査判定入庫数量.<p>
	 *
	 */
	public void insp_judg_gr_qty(float value) {
		setConstNumber(offset + 114, $insp_judg_gr_qty, value);
	}

	/**
	 * Inspection decision GR qty. 検査判定入庫数量.<p>
	 *
	 */
	public void insp_judg_gr_qty(double value) {
		setConstNumber(offset + 114, $insp_judg_gr_qty, value);
	}


	/**
	 * Re-inspection GR qty. 再検査入庫数量.<p>
	 *
	 */
	public MCNumber reinsp_gr_qty() {
		return getConstNumber(offset + 115, $reinsp_gr_qty);
	}

	/**
	 * Re-inspection GR qty. 再検査入庫数量.<p>
	 *
	 */
	public void reinsp_gr_qty(MCNumber value) {
		setConstNumber(offset + 115, $reinsp_gr_qty, value);
	}

	/**
	 * Re-inspection GR qty. 再検査入庫数量.<p>
	 *
	 */
	public void reinsp_gr_qty(int value) {
		setConstNumber(offset + 115, $reinsp_gr_qty, value);
	}

	/**
	 * Re-inspection GR qty. 再検査入庫数量.<p>
	 *
	 */
	public void reinsp_gr_qty(long value) {
		setConstNumber(offset + 115, $reinsp_gr_qty, value);
	}

	/**
	 * Re-inspection GR qty. 再検査入庫数量.<p>
	 *
	 */
	public void reinsp_gr_qty(float value) {
		setConstNumber(offset + 115, $reinsp_gr_qty, value);
	}

	/**
	 * Re-inspection GR qty. 再検査入庫数量.<p>
	 *
	 */
	public void reinsp_gr_qty(double value) {
		setConstNumber(offset + 115, $reinsp_gr_qty, value);
	}


	/**
	 * Inventory count variance qty. (GR) 棚卸差異増耗数量.<p>
	 *
	 */
	public MCNumber stk_adjst_gr_qty() {
		return getConstNumber(offset + 116, $stk_adjst_gr_qty);
	}

	/**
	 * Inventory count variance qty. (GR) 棚卸差異増耗数量.<p>
	 *
	 */
	public void stk_adjst_gr_qty(MCNumber value) {
		setConstNumber(offset + 116, $stk_adjst_gr_qty, value);
	}

	/**
	 * Inventory count variance qty. (GR) 棚卸差異増耗数量.<p>
	 *
	 */
	public void stk_adjst_gr_qty(int value) {
		setConstNumber(offset + 116, $stk_adjst_gr_qty, value);
	}

	/**
	 * Inventory count variance qty. (GR) 棚卸差異増耗数量.<p>
	 *
	 */
	public void stk_adjst_gr_qty(long value) {
		setConstNumber(offset + 116, $stk_adjst_gr_qty, value);
	}

	/**
	 * Inventory count variance qty. (GR) 棚卸差異増耗数量.<p>
	 *
	 */
	public void stk_adjst_gr_qty(float value) {
		setConstNumber(offset + 116, $stk_adjst_gr_qty, value);
	}

	/**
	 * Inventory count variance qty. (GR) 棚卸差異増耗数量.<p>
	 *
	 */
	public void stk_adjst_gr_qty(double value) {
		setConstNumber(offset + 116, $stk_adjst_gr_qty, value);
	}


	/**
	 * Warehousing GR qty. 倉入入庫数量.<p>
	 *
	 */
	public MCNumber prdct_wh_gr_qty() {
		return getConstNumber(offset + 117, $prdct_wh_gr_qty);
	}

	/**
	 * Warehousing GR qty. 倉入入庫数量.<p>
	 *
	 */
	public void prdct_wh_gr_qty(MCNumber value) {
		setConstNumber(offset + 117, $prdct_wh_gr_qty, value);
	}

	/**
	 * Warehousing GR qty. 倉入入庫数量.<p>
	 *
	 */
	public void prdct_wh_gr_qty(int value) {
		setConstNumber(offset + 117, $prdct_wh_gr_qty, value);
	}

	/**
	 * Warehousing GR qty. 倉入入庫数量.<p>
	 *
	 */
	public void prdct_wh_gr_qty(long value) {
		setConstNumber(offset + 117, $prdct_wh_gr_qty, value);
	}

	/**
	 * Warehousing GR qty. 倉入入庫数量.<p>
	 *
	 */
	public void prdct_wh_gr_qty(float value) {
		setConstNumber(offset + 117, $prdct_wh_gr_qty, value);
	}

	/**
	 * Warehousing GR qty. 倉入入庫数量.<p>
	 *
	 */
	public void prdct_wh_gr_qty(double value) {
		setConstNumber(offset + 117, $prdct_wh_gr_qty, value);
	}


	/**
	 * GR returning qty. 戻入入庫数量.<p>
	 *
	 */
	public MCNumber prdct_wh_rtn_gr_qty() {
		return getConstNumber(offset + 118, $prdct_wh_rtn_gr_qty);
	}

	/**
	 * GR returning qty. 戻入入庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_qty(MCNumber value) {
		setConstNumber(offset + 118, $prdct_wh_rtn_gr_qty, value);
	}

	/**
	 * GR returning qty. 戻入入庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_qty(int value) {
		setConstNumber(offset + 118, $prdct_wh_rtn_gr_qty, value);
	}

	/**
	 * GR returning qty. 戻入入庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_qty(long value) {
		setConstNumber(offset + 118, $prdct_wh_rtn_gr_qty, value);
	}

	/**
	 * GR returning qty. 戻入入庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_qty(float value) {
		setConstNumber(offset + 118, $prdct_wh_rtn_gr_qty, value);
	}

	/**
	 * GR returning qty. 戻入入庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_qty(double value) {
		setConstNumber(offset + 118, $prdct_wh_rtn_gr_qty, value);
	}


	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public MCNumber xfr_gr_qty() {
		return getConstNumber(offset + 119, $xfr_gr_qty);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void xfr_gr_qty(MCNumber value) {
		setConstNumber(offset + 119, $xfr_gr_qty, value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void xfr_gr_qty(int value) {
		setConstNumber(offset + 119, $xfr_gr_qty, value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void xfr_gr_qty(long value) {
		setConstNumber(offset + 119, $xfr_gr_qty, value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void xfr_gr_qty(float value) {
		setConstNumber(offset + 119, $xfr_gr_qty, value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void xfr_gr_qty(double value) {
		setConstNumber(offset + 119, $xfr_gr_qty, value);
	}


	/**
	 * Move-in qty. 転入数量.<p>
	 *
	 */
	public MCNumber xfr_in_qty() {
		return getConstNumber(offset + 120, $xfr_in_qty);
	}

	/**
	 * Move-in qty. 転入数量.<p>
	 *
	 */
	public void xfr_in_qty(MCNumber value) {
		setConstNumber(offset + 120, $xfr_in_qty, value);
	}

	/**
	 * Move-in qty. 転入数量.<p>
	 *
	 */
	public void xfr_in_qty(int value) {
		setConstNumber(offset + 120, $xfr_in_qty, value);
	}

	/**
	 * Move-in qty. 転入数量.<p>
	 *
	 */
	public void xfr_in_qty(long value) {
		setConstNumber(offset + 120, $xfr_in_qty, value);
	}

	/**
	 * Move-in qty. 転入数量.<p>
	 *
	 */
	public void xfr_in_qty(float value) {
		setConstNumber(offset + 120, $xfr_in_qty, value);
	}

	/**
	 * Move-in qty. 転入数量.<p>
	 *
	 */
	public void xfr_in_qty(double value) {
		setConstNumber(offset + 120, $xfr_in_qty, value);
	}


	/**
	 * Purchase move-in qty. 仕入転入数量.<p>
	 *
	 */
	public MCNumber purc_xfr_in_qty() {
		return getConstNumber(offset + 121, $purc_xfr_in_qty);
	}

	/**
	 * Purchase move-in qty. 仕入転入数量.<p>
	 *
	 */
	public void purc_xfr_in_qty(MCNumber value) {
		setConstNumber(offset + 121, $purc_xfr_in_qty, value);
	}

	/**
	 * Purchase move-in qty. 仕入転入数量.<p>
	 *
	 */
	public void purc_xfr_in_qty(int value) {
		setConstNumber(offset + 121, $purc_xfr_in_qty, value);
	}

	/**
	 * Purchase move-in qty. 仕入転入数量.<p>
	 *
	 */
	public void purc_xfr_in_qty(long value) {
		setConstNumber(offset + 121, $purc_xfr_in_qty, value);
	}

	/**
	 * Purchase move-in qty. 仕入転入数量.<p>
	 *
	 */
	public void purc_xfr_in_qty(float value) {
		setConstNumber(offset + 121, $purc_xfr_in_qty, value);
	}

	/**
	 * Purchase move-in qty. 仕入転入数量.<p>
	 *
	 */
	public void purc_xfr_in_qty(double value) {
		setConstNumber(offset + 121, $purc_xfr_in_qty, value);
	}


	/**
	 * Movement/transport return GR qty. 移動・移送返品入庫数量.<p>
	 *
	 */
	public MCNumber xfr_rtn_gr_qty() {
		return getConstNumber(offset + 122, $xfr_rtn_gr_qty);
	}

	/**
	 * Movement/transport return GR qty. 移動・移送返品入庫数量.<p>
	 *
	 */
	public void xfr_rtn_gr_qty(MCNumber value) {
		setConstNumber(offset + 122, $xfr_rtn_gr_qty, value);
	}

	/**
	 * Movement/transport return GR qty. 移動・移送返品入庫数量.<p>
	 *
	 */
	public void xfr_rtn_gr_qty(int value) {
		setConstNumber(offset + 122, $xfr_rtn_gr_qty, value);
	}

	/**
	 * Movement/transport return GR qty. 移動・移送返品入庫数量.<p>
	 *
	 */
	public void xfr_rtn_gr_qty(long value) {
		setConstNumber(offset + 122, $xfr_rtn_gr_qty, value);
	}

	/**
	 * Movement/transport return GR qty. 移動・移送返品入庫数量.<p>
	 *
	 */
	public void xfr_rtn_gr_qty(float value) {
		setConstNumber(offset + 122, $xfr_rtn_gr_qty, value);
	}

	/**
	 * Movement/transport return GR qty. 移動・移送返品入庫数量.<p>
	 *
	 */
	public void xfr_rtn_gr_qty(double value) {
		setConstNumber(offset + 122, $xfr_rtn_gr_qty, value);
	}


	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public MCNumber acxfr_gr_qty() {
		return getConstNumber(offset + 123, $acxfr_gr_qty);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void acxfr_gr_qty(MCNumber value) {
		setConstNumber(offset + 123, $acxfr_gr_qty, value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void acxfr_gr_qty(int value) {
		setConstNumber(offset + 123, $acxfr_gr_qty, value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void acxfr_gr_qty(long value) {
		setConstNumber(offset + 123, $acxfr_gr_qty, value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void acxfr_gr_qty(float value) {
		setConstNumber(offset + 123, $acxfr_gr_qty, value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void acxfr_gr_qty(double value) {
		setConstNumber(offset + 123, $acxfr_gr_qty, value);
	}


	/**
	 * Customer inventory GR qty. 預り入庫数量.<p>
	 *
	 */
	public MCNumber arr_cststk_qty() {
		return getConstNumber(offset + 124, $arr_cststk_qty);
	}

	/**
	 * Customer inventory GR qty. 預り入庫数量.<p>
	 *
	 */
	public void arr_cststk_qty(MCNumber value) {
		setConstNumber(offset + 124, $arr_cststk_qty, value);
	}

	/**
	 * Customer inventory GR qty. 預り入庫数量.<p>
	 *
	 */
	public void arr_cststk_qty(int value) {
		setConstNumber(offset + 124, $arr_cststk_qty, value);
	}

	/**
	 * Customer inventory GR qty. 預り入庫数量.<p>
	 *
	 */
	public void arr_cststk_qty(long value) {
		setConstNumber(offset + 124, $arr_cststk_qty, value);
	}

	/**
	 * Customer inventory GR qty. 預り入庫数量.<p>
	 *
	 */
	public void arr_cststk_qty(float value) {
		setConstNumber(offset + 124, $arr_cststk_qty, value);
	}

	/**
	 * Customer inventory GR qty. 預り入庫数量.<p>
	 *
	 */
	public void arr_cststk_qty(double value) {
		setConstNumber(offset + 124, $arr_cststk_qty, value);
	}


	/**
	 * Item transfer GR qty. 品目振替入庫数量.<p>
	 *
	 */
	public MCNumber xfr_itm_gr_qty() {
		return getConstNumber(offset + 125, $xfr_itm_gr_qty);
	}

	/**
	 * Item transfer GR qty. 品目振替入庫数量.<p>
	 *
	 */
	public void xfr_itm_gr_qty(MCNumber value) {
		setConstNumber(offset + 125, $xfr_itm_gr_qty, value);
	}

	/**
	 * Item transfer GR qty. 品目振替入庫数量.<p>
	 *
	 */
	public void xfr_itm_gr_qty(int value) {
		setConstNumber(offset + 125, $xfr_itm_gr_qty, value);
	}

	/**
	 * Item transfer GR qty. 品目振替入庫数量.<p>
	 *
	 */
	public void xfr_itm_gr_qty(long value) {
		setConstNumber(offset + 125, $xfr_itm_gr_qty, value);
	}

	/**
	 * Item transfer GR qty. 品目振替入庫数量.<p>
	 *
	 */
	public void xfr_itm_gr_qty(float value) {
		setConstNumber(offset + 125, $xfr_itm_gr_qty, value);
	}

	/**
	 * Item transfer GR qty. 品目振替入庫数量.<p>
	 *
	 */
	public void xfr_itm_gr_qty(double value) {
		setConstNumber(offset + 125, $xfr_itm_gr_qty, value);
	}


	/**
	 * Lot/SEIBAN No. transfer GR qty. ロット・手配ＮＯ振替入庫数量.<p>
	 *
	 */
	public MCNumber xfr_lot_sno_gr_qty() {
		return getConstNumber(offset + 126, $xfr_lot_sno_gr_qty);
	}

	/**
	 * Lot/SEIBAN No. transfer GR qty. ロット・手配ＮＯ振替入庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gr_qty(MCNumber value) {
		setConstNumber(offset + 126, $xfr_lot_sno_gr_qty, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR qty. ロット・手配ＮＯ振替入庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gr_qty(int value) {
		setConstNumber(offset + 126, $xfr_lot_sno_gr_qty, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR qty. ロット・手配ＮＯ振替入庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gr_qty(long value) {
		setConstNumber(offset + 126, $xfr_lot_sno_gr_qty, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR qty. ロット・手配ＮＯ振替入庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gr_qty(float value) {
		setConstNumber(offset + 126, $xfr_lot_sno_gr_qty, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR qty. ロット・手配ＮＯ振替入庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gr_qty(double value) {
		setConstNumber(offset + 126, $xfr_lot_sno_gr_qty, value);
	}


	/**
	 * GR qty. (Grading/conforming type transfer) 格付・良品区分振替入庫数量.<p>
	 *
	 */
	public MCNumber xfr_grd_gr_qty() {
		return getConstNumber(offset + 127, $xfr_grd_gr_qty);
	}

	/**
	 * GR qty. (Grading/conforming type transfer) 格付・良品区分振替入庫数量.<p>
	 *
	 */
	public void xfr_grd_gr_qty(MCNumber value) {
		setConstNumber(offset + 127, $xfr_grd_gr_qty, value);
	}

	/**
	 * GR qty. (Grading/conforming type transfer) 格付・良品区分振替入庫数量.<p>
	 *
	 */
	public void xfr_grd_gr_qty(int value) {
		setConstNumber(offset + 127, $xfr_grd_gr_qty, value);
	}

	/**
	 * GR qty. (Grading/conforming type transfer) 格付・良品区分振替入庫数量.<p>
	 *
	 */
	public void xfr_grd_gr_qty(long value) {
		setConstNumber(offset + 127, $xfr_grd_gr_qty, value);
	}

	/**
	 * GR qty. (Grading/conforming type transfer) 格付・良品区分振替入庫数量.<p>
	 *
	 */
	public void xfr_grd_gr_qty(float value) {
		setConstNumber(offset + 127, $xfr_grd_gr_qty, value);
	}

	/**
	 * GR qty. (Grading/conforming type transfer) 格付・良品区分振替入庫数量.<p>
	 *
	 */
	public void xfr_grd_gr_qty(double value) {
		setConstNumber(offset + 127, $xfr_grd_gr_qty, value);
	}


	/**
	 * SKU transfer GR qty. 荷姿振替入庫数量.<p>
	 *
	 */
	public MCNumber xfr_pack_gr_qty() {
		return getConstNumber(offset + 128, $xfr_pack_gr_qty);
	}

	/**
	 * SKU transfer GR qty. 荷姿振替入庫数量.<p>
	 *
	 */
	public void xfr_pack_gr_qty(MCNumber value) {
		setConstNumber(offset + 128, $xfr_pack_gr_qty, value);
	}

	/**
	 * SKU transfer GR qty. 荷姿振替入庫数量.<p>
	 *
	 */
	public void xfr_pack_gr_qty(int value) {
		setConstNumber(offset + 128, $xfr_pack_gr_qty, value);
	}

	/**
	 * SKU transfer GR qty. 荷姿振替入庫数量.<p>
	 *
	 */
	public void xfr_pack_gr_qty(long value) {
		setConstNumber(offset + 128, $xfr_pack_gr_qty, value);
	}

	/**
	 * SKU transfer GR qty. 荷姿振替入庫数量.<p>
	 *
	 */
	public void xfr_pack_gr_qty(float value) {
		setConstNumber(offset + 128, $xfr_pack_gr_qty, value);
	}

	/**
	 * SKU transfer GR qty. 荷姿振替入庫数量.<p>
	 *
	 */
	public void xfr_pack_gr_qty(double value) {
		setConstNumber(offset + 128, $xfr_pack_gr_qty, value);
	}


	/**
	 * Arrival qty. 着荷数量.<p>
	 *
	 */
	public MCNumber ship_in_qty() {
		return getConstNumber(offset + 129, $ship_in_qty);
	}

	/**
	 * Arrival qty. 着荷数量.<p>
	 *
	 */
	public void ship_in_qty(MCNumber value) {
		setConstNumber(offset + 129, $ship_in_qty, value);
	}

	/**
	 * Arrival qty. 着荷数量.<p>
	 *
	 */
	public void ship_in_qty(int value) {
		setConstNumber(offset + 129, $ship_in_qty, value);
	}

	/**
	 * Arrival qty. 着荷数量.<p>
	 *
	 */
	public void ship_in_qty(long value) {
		setConstNumber(offset + 129, $ship_in_qty, value);
	}

	/**
	 * Arrival qty. 着荷数量.<p>
	 *
	 */
	public void ship_in_qty(float value) {
		setConstNumber(offset + 129, $ship_in_qty, value);
	}

	/**
	 * Arrival qty. 着荷数量.<p>
	 *
	 */
	public void ship_in_qty(double value) {
		setConstNumber(offset + 129, $ship_in_qty, value);
	}


	/**
	 * Export arrival qty. 輸出着荷数量.<p>
	 *
	 */
	public MCNumber ex_ship_in_qty() {
		return getConstNumber(offset + 130, $ex_ship_in_qty);
	}

	/**
	 * Export arrival qty. 輸出着荷数量.<p>
	 *
	 */
	public void ex_ship_in_qty(MCNumber value) {
		setConstNumber(offset + 130, $ex_ship_in_qty, value);
	}

	/**
	 * Export arrival qty. 輸出着荷数量.<p>
	 *
	 */
	public void ex_ship_in_qty(int value) {
		setConstNumber(offset + 130, $ex_ship_in_qty, value);
	}

	/**
	 * Export arrival qty. 輸出着荷数量.<p>
	 *
	 */
	public void ex_ship_in_qty(long value) {
		setConstNumber(offset + 130, $ex_ship_in_qty, value);
	}

	/**
	 * Export arrival qty. 輸出着荷数量.<p>
	 *
	 */
	public void ex_ship_in_qty(float value) {
		setConstNumber(offset + 130, $ex_ship_in_qty, value);
	}

	/**
	 * Export arrival qty. 輸出着荷数量.<p>
	 *
	 */
	public void ex_ship_in_qty(double value) {
		setConstNumber(offset + 130, $ex_ship_in_qty, value);
	}


	/**
	 * Shipping return GR qty. 出荷返品入庫数量.<p>
	 *
	 */
	public MCNumber ship_rtn_gr_qty() {
		return getConstNumber(offset + 131, $ship_rtn_gr_qty);
	}

	/**
	 * Shipping return GR qty. 出荷返品入庫数量.<p>
	 *
	 */
	public void ship_rtn_gr_qty(MCNumber value) {
		setConstNumber(offset + 131, $ship_rtn_gr_qty, value);
	}

	/**
	 * Shipping return GR qty. 出荷返品入庫数量.<p>
	 *
	 */
	public void ship_rtn_gr_qty(int value) {
		setConstNumber(offset + 131, $ship_rtn_gr_qty, value);
	}

	/**
	 * Shipping return GR qty. 出荷返品入庫数量.<p>
	 *
	 */
	public void ship_rtn_gr_qty(long value) {
		setConstNumber(offset + 131, $ship_rtn_gr_qty, value);
	}

	/**
	 * Shipping return GR qty. 出荷返品入庫数量.<p>
	 *
	 */
	public void ship_rtn_gr_qty(float value) {
		setConstNumber(offset + 131, $ship_rtn_gr_qty, value);
	}

	/**
	 * Shipping return GR qty. 出荷返品入庫数量.<p>
	 *
	 */
	public void ship_rtn_gr_qty(double value) {
		setConstNumber(offset + 131, $ship_rtn_gr_qty, value);
	}


	/**
	 * Sales return GR qty. 売上返品入庫数量.<p>
	 *
	 */
	public MCNumber sls_rtn_gr_qty() {
		return getConstNumber(offset + 132, $sls_rtn_gr_qty);
	}

	/**
	 * Sales return GR qty. 売上返品入庫数量.<p>
	 *
	 */
	public void sls_rtn_gr_qty(MCNumber value) {
		setConstNumber(offset + 132, $sls_rtn_gr_qty, value);
	}

	/**
	 * Sales return GR qty. 売上返品入庫数量.<p>
	 *
	 */
	public void sls_rtn_gr_qty(int value) {
		setConstNumber(offset + 132, $sls_rtn_gr_qty, value);
	}

	/**
	 * Sales return GR qty. 売上返品入庫数量.<p>
	 *
	 */
	public void sls_rtn_gr_qty(long value) {
		setConstNumber(offset + 132, $sls_rtn_gr_qty, value);
	}

	/**
	 * Sales return GR qty. 売上返品入庫数量.<p>
	 *
	 */
	public void sls_rtn_gr_qty(float value) {
		setConstNumber(offset + 132, $sls_rtn_gr_qty, value);
	}

	/**
	 * Sales return GR qty. 売上返品入庫数量.<p>
	 *
	 */
	public void sls_rtn_gr_qty(double value) {
		setConstNumber(offset + 132, $sls_rtn_gr_qty, value);
	}


	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public MCNumber gi_total_qty() {
		return getConstNumber(offset + 133, $gi_total_qty);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(MCNumber value) {
		setConstNumber(offset + 133, $gi_total_qty, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(int value) {
		setConstNumber(offset + 133, $gi_total_qty, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(long value) {
		setConstNumber(offset + 133, $gi_total_qty, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(float value) {
		setConstNumber(offset + 133, $gi_total_qty, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(double value) {
		setConstNumber(offset + 133, $gi_total_qty, value);
	}


	/**
	 * Receipt return qty. 入荷返品数量.<p>
	 *
	 */
	public MCNumber arr_rtn_qty() {
		return getConstNumber(offset + 134, $arr_rtn_qty);
	}

	/**
	 * Receipt return qty. 入荷返品数量.<p>
	 *
	 */
	public void arr_rtn_qty(MCNumber value) {
		setConstNumber(offset + 134, $arr_rtn_qty, value);
	}

	/**
	 * Receipt return qty. 入荷返品数量.<p>
	 *
	 */
	public void arr_rtn_qty(int value) {
		setConstNumber(offset + 134, $arr_rtn_qty, value);
	}

	/**
	 * Receipt return qty. 入荷返品数量.<p>
	 *
	 */
	public void arr_rtn_qty(long value) {
		setConstNumber(offset + 134, $arr_rtn_qty, value);
	}

	/**
	 * Receipt return qty. 入荷返品数量.<p>
	 *
	 */
	public void arr_rtn_qty(float value) {
		setConstNumber(offset + 134, $arr_rtn_qty, value);
	}

	/**
	 * Receipt return qty. 入荷返品数量.<p>
	 *
	 */
	public void arr_rtn_qty(double value) {
		setConstNumber(offset + 134, $arr_rtn_qty, value);
	}


	/**
	 * Purchase GI qty. 仕入出庫数量.<p>
	 *
	 */
	public MCNumber purc_gi_qty() {
		return getConstNumber(offset + 135, $purc_gi_qty);
	}

	/**
	 * Purchase GI qty. 仕入出庫数量.<p>
	 *
	 */
	public void purc_gi_qty(MCNumber value) {
		setConstNumber(offset + 135, $purc_gi_qty, value);
	}

	/**
	 * Purchase GI qty. 仕入出庫数量.<p>
	 *
	 */
	public void purc_gi_qty(int value) {
		setConstNumber(offset + 135, $purc_gi_qty, value);
	}

	/**
	 * Purchase GI qty. 仕入出庫数量.<p>
	 *
	 */
	public void purc_gi_qty(long value) {
		setConstNumber(offset + 135, $purc_gi_qty, value);
	}

	/**
	 * Purchase GI qty. 仕入出庫数量.<p>
	 *
	 */
	public void purc_gi_qty(float value) {
		setConstNumber(offset + 135, $purc_gi_qty, value);
	}

	/**
	 * Purchase GI qty. 仕入出庫数量.<p>
	 *
	 */
	public void purc_gi_qty(double value) {
		setConstNumber(offset + 135, $purc_gi_qty, value);
	}


	/**
	 * Receiving for a fee GI qty. 有償受給出庫数量.<p>
	 *
	 */
	public MCNumber onr_rcv_gi_qty() {
		return getConstNumber(offset + 136, $onr_rcv_gi_qty);
	}

	/**
	 * Receiving for a fee GI qty. 有償受給出庫数量.<p>
	 *
	 */
	public void onr_rcv_gi_qty(MCNumber value) {
		setConstNumber(offset + 136, $onr_rcv_gi_qty, value);
	}

	/**
	 * Receiving for a fee GI qty. 有償受給出庫数量.<p>
	 *
	 */
	public void onr_rcv_gi_qty(int value) {
		setConstNumber(offset + 136, $onr_rcv_gi_qty, value);
	}

	/**
	 * Receiving for a fee GI qty. 有償受給出庫数量.<p>
	 *
	 */
	public void onr_rcv_gi_qty(long value) {
		setConstNumber(offset + 136, $onr_rcv_gi_qty, value);
	}

	/**
	 * Receiving for a fee GI qty. 有償受給出庫数量.<p>
	 *
	 */
	public void onr_rcv_gi_qty(float value) {
		setConstNumber(offset + 136, $onr_rcv_gi_qty, value);
	}

	/**
	 * Receiving for a fee GI qty. 有償受給出庫数量.<p>
	 *
	 */
	public void onr_rcv_gi_qty(double value) {
		setConstNumber(offset + 136, $onr_rcv_gi_qty, value);
	}


	/**
	 * Purchase return GI qty. 仕入返品出庫数量.<p>
	 *
	 */
	public MCNumber purc_rtn_gi_qty() {
		return getConstNumber(offset + 137, $purc_rtn_gi_qty);
	}

	/**
	 * Purchase return GI qty. 仕入返品出庫数量.<p>
	 *
	 */
	public void purc_rtn_gi_qty(MCNumber value) {
		setConstNumber(offset + 137, $purc_rtn_gi_qty, value);
	}

	/**
	 * Purchase return GI qty. 仕入返品出庫数量.<p>
	 *
	 */
	public void purc_rtn_gi_qty(int value) {
		setConstNumber(offset + 137, $purc_rtn_gi_qty, value);
	}

	/**
	 * Purchase return GI qty. 仕入返品出庫数量.<p>
	 *
	 */
	public void purc_rtn_gi_qty(long value) {
		setConstNumber(offset + 137, $purc_rtn_gi_qty, value);
	}

	/**
	 * Purchase return GI qty. 仕入返品出庫数量.<p>
	 *
	 */
	public void purc_rtn_gi_qty(float value) {
		setConstNumber(offset + 137, $purc_rtn_gi_qty, value);
	}

	/**
	 * Purchase return GI qty. 仕入返品出庫数量.<p>
	 *
	 */
	public void purc_rtn_gi_qty(double value) {
		setConstNumber(offset + 137, $purc_rtn_gi_qty, value);
	}


	/**
	 * Receiving for a fee return GI qty. 有償受給返品出庫数量.<p>
	 *
	 */
	public MCNumber onr_rcv_ret_gi_qty() {
		return getConstNumber(offset + 138, $onr_rcv_ret_gi_qty);
	}

	/**
	 * Receiving for a fee return GI qty. 有償受給返品出庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gi_qty(MCNumber value) {
		setConstNumber(offset + 138, $onr_rcv_ret_gi_qty, value);
	}

	/**
	 * Receiving for a fee return GI qty. 有償受給返品出庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gi_qty(int value) {
		setConstNumber(offset + 138, $onr_rcv_ret_gi_qty, value);
	}

	/**
	 * Receiving for a fee return GI qty. 有償受給返品出庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gi_qty(long value) {
		setConstNumber(offset + 138, $onr_rcv_ret_gi_qty, value);
	}

	/**
	 * Receiving for a fee return GI qty. 有償受給返品出庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gi_qty(float value) {
		setConstNumber(offset + 138, $onr_rcv_ret_gi_qty, value);
	}

	/**
	 * Receiving for a fee return GI qty. 有償受給返品出庫数量.<p>
	 *
	 */
	public void onr_rcv_ret_gi_qty(double value) {
		setConstNumber(offset + 138, $onr_rcv_ret_gi_qty, value);
	}


	/**
	 * Expense purchase GI qty. 経費購買出庫数量.<p>
	 *
	 */
	public MCNumber xpns_purc_gi_qty() {
		return getConstNumber(offset + 139, $xpns_purc_gi_qty);
	}

	/**
	 * Expense purchase GI qty. 経費購買出庫数量.<p>
	 *
	 */
	public void xpns_purc_gi_qty(MCNumber value) {
		setConstNumber(offset + 139, $xpns_purc_gi_qty, value);
	}

	/**
	 * Expense purchase GI qty. 経費購買出庫数量.<p>
	 *
	 */
	public void xpns_purc_gi_qty(int value) {
		setConstNumber(offset + 139, $xpns_purc_gi_qty, value);
	}

	/**
	 * Expense purchase GI qty. 経費購買出庫数量.<p>
	 *
	 */
	public void xpns_purc_gi_qty(long value) {
		setConstNumber(offset + 139, $xpns_purc_gi_qty, value);
	}

	/**
	 * Expense purchase GI qty. 経費購買出庫数量.<p>
	 *
	 */
	public void xpns_purc_gi_qty(float value) {
		setConstNumber(offset + 139, $xpns_purc_gi_qty, value);
	}

	/**
	 * Expense purchase GI qty. 経費購買出庫数量.<p>
	 *
	 */
	public void xpns_purc_gi_qty(double value) {
		setConstNumber(offset + 139, $xpns_purc_gi_qty, value);
	}


	/**
	 * Expense purchase return GI qty. 経費購買返品出庫数量.<p>
	 *
	 */
	public MCNumber xpns_purc_rtn_gi_qty() {
		return getConstNumber(offset + 140, $xpns_purc_rtn_gi_qty);
	}

	/**
	 * Expense purchase return GI qty. 経費購買返品出庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_qty(MCNumber value) {
		setConstNumber(offset + 140, $xpns_purc_rtn_gi_qty, value);
	}

	/**
	 * Expense purchase return GI qty. 経費購買返品出庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_qty(int value) {
		setConstNumber(offset + 140, $xpns_purc_rtn_gi_qty, value);
	}

	/**
	 * Expense purchase return GI qty. 経費購買返品出庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_qty(long value) {
		setConstNumber(offset + 140, $xpns_purc_rtn_gi_qty, value);
	}

	/**
	 * Expense purchase return GI qty. 経費購買返品出庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_qty(float value) {
		setConstNumber(offset + 140, $xpns_purc_rtn_gi_qty, value);
	}

	/**
	 * Expense purchase return GI qty. 経費購買返品出庫数量.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_qty(double value) {
		setConstNumber(offset + 140, $xpns_purc_rtn_gi_qty, value);
	}


	/**
	 * Defective acceptance GI qty. 検収不良出庫数量.<p>
	 *
	 */
	public MCNumber accpt_dfct_gi_qty() {
		return getConstNumber(offset + 141, $accpt_dfct_gi_qty);
	}

	/**
	 * Defective acceptance GI qty. 検収不良出庫数量.<p>
	 *
	 */
	public void accpt_dfct_gi_qty(MCNumber value) {
		setConstNumber(offset + 141, $accpt_dfct_gi_qty, value);
	}

	/**
	 * Defective acceptance GI qty. 検収不良出庫数量.<p>
	 *
	 */
	public void accpt_dfct_gi_qty(int value) {
		setConstNumber(offset + 141, $accpt_dfct_gi_qty, value);
	}

	/**
	 * Defective acceptance GI qty. 検収不良出庫数量.<p>
	 *
	 */
	public void accpt_dfct_gi_qty(long value) {
		setConstNumber(offset + 141, $accpt_dfct_gi_qty, value);
	}

	/**
	 * Defective acceptance GI qty. 検収不良出庫数量.<p>
	 *
	 */
	public void accpt_dfct_gi_qty(float value) {
		setConstNumber(offset + 141, $accpt_dfct_gi_qty, value);
	}

	/**
	 * Defective acceptance GI qty. 検収不良出庫数量.<p>
	 *
	 */
	public void accpt_dfct_gi_qty(double value) {
		setConstNumber(offset + 141, $accpt_dfct_gi_qty, value);
	}


	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public MCNumber inpt_qty() {
		return getConstNumber(offset + 142, $inpt_qty);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(MCNumber value) {
		setConstNumber(offset + 142, $inpt_qty, value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(int value) {
		setConstNumber(offset + 142, $inpt_qty, value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(long value) {
		setConstNumber(offset + 142, $inpt_qty, value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(float value) {
		setConstNumber(offset + 142, $inpt_qty, value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(double value) {
		setConstNumber(offset + 142, $inpt_qty, value);
	}


	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public MCNumber loss_qty() {
		return getConstNumber(offset + 143, $loss_qty);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(MCNumber value) {
		setConstNumber(offset + 143, $loss_qty, value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(int value) {
		setConstNumber(offset + 143, $loss_qty, value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(long value) {
		setConstNumber(offset + 143, $loss_qty, value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(float value) {
		setConstNumber(offset + 143, $loss_qty, value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(double value) {
		setConstNumber(offset + 143, $loss_qty, value);
	}


	/**
	 * Non-chargeable supply GI qty. 無償支給出庫数量.<p>
	 *
	 */
	public MCNumber ffr_prov_gi_qty() {
		return getConstNumber(offset + 144, $ffr_prov_gi_qty);
	}

	/**
	 * Non-chargeable supply GI qty. 無償支給出庫数量.<p>
	 *
	 */
	public void ffr_prov_gi_qty(MCNumber value) {
		setConstNumber(offset + 144, $ffr_prov_gi_qty, value);
	}

	/**
	 * Non-chargeable supply GI qty. 無償支給出庫数量.<p>
	 *
	 */
	public void ffr_prov_gi_qty(int value) {
		setConstNumber(offset + 144, $ffr_prov_gi_qty, value);
	}

	/**
	 * Non-chargeable supply GI qty. 無償支給出庫数量.<p>
	 *
	 */
	public void ffr_prov_gi_qty(long value) {
		setConstNumber(offset + 144, $ffr_prov_gi_qty, value);
	}

	/**
	 * Non-chargeable supply GI qty. 無償支給出庫数量.<p>
	 *
	 */
	public void ffr_prov_gi_qty(float value) {
		setConstNumber(offset + 144, $ffr_prov_gi_qty, value);
	}

	/**
	 * Non-chargeable supply GI qty. 無償支給出庫数量.<p>
	 *
	 */
	public void ffr_prov_gi_qty(double value) {
		setConstNumber(offset + 144, $ffr_prov_gi_qty, value);
	}


	/**
	 * Chargeable supply GI qty. 有償支給出庫数量.<p>
	 *
	 */
	public MCNumber onr_prov_gi_qty() {
		return getConstNumber(offset + 145, $onr_prov_gi_qty);
	}

	/**
	 * Chargeable supply GI qty. 有償支給出庫数量.<p>
	 *
	 */
	public void onr_prov_gi_qty(MCNumber value) {
		setConstNumber(offset + 145, $onr_prov_gi_qty, value);
	}

	/**
	 * Chargeable supply GI qty. 有償支給出庫数量.<p>
	 *
	 */
	public void onr_prov_gi_qty(int value) {
		setConstNumber(offset + 145, $onr_prov_gi_qty, value);
	}

	/**
	 * Chargeable supply GI qty. 有償支給出庫数量.<p>
	 *
	 */
	public void onr_prov_gi_qty(long value) {
		setConstNumber(offset + 145, $onr_prov_gi_qty, value);
	}

	/**
	 * Chargeable supply GI qty. 有償支給出庫数量.<p>
	 *
	 */
	public void onr_prov_gi_qty(float value) {
		setConstNumber(offset + 145, $onr_prov_gi_qty, value);
	}

	/**
	 * Chargeable supply GI qty. 有償支給出庫数量.<p>
	 *
	 */
	public void onr_prov_gi_qty(double value) {
		setConstNumber(offset + 145, $onr_prov_gi_qty, value);
	}


	/**
	 * Non-chargeable supply return GI qty. 無償支給返品出庫数量.<p>
	 *
	 */
	public MCNumber ffr_prov_rtn_gi_qty() {
		return getConstNumber(offset + 146, $ffr_prov_rtn_gi_qty);
	}

	/**
	 * Non-chargeable supply return GI qty. 無償支給返品出庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_qty(MCNumber value) {
		setConstNumber(offset + 146, $ffr_prov_rtn_gi_qty, value);
	}

	/**
	 * Non-chargeable supply return GI qty. 無償支給返品出庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_qty(int value) {
		setConstNumber(offset + 146, $ffr_prov_rtn_gi_qty, value);
	}

	/**
	 * Non-chargeable supply return GI qty. 無償支給返品出庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_qty(long value) {
		setConstNumber(offset + 146, $ffr_prov_rtn_gi_qty, value);
	}

	/**
	 * Non-chargeable supply return GI qty. 無償支給返品出庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_qty(float value) {
		setConstNumber(offset + 146, $ffr_prov_rtn_gi_qty, value);
	}

	/**
	 * Non-chargeable supply return GI qty. 無償支給返品出庫数量.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_qty(double value) {
		setConstNumber(offset + 146, $ffr_prov_rtn_gi_qty, value);
	}


	/**
	 * Chargeable supply return GI qty. 有償支給返品出庫数量.<p>
	 *
	 */
	public MCNumber onr_prov_rtn_gi_qty() {
		return getConstNumber(offset + 147, $onr_prov_rtn_gi_qty);
	}

	/**
	 * Chargeable supply return GI qty. 有償支給返品出庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gi_qty(MCNumber value) {
		setConstNumber(offset + 147, $onr_prov_rtn_gi_qty, value);
	}

	/**
	 * Chargeable supply return GI qty. 有償支給返品出庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gi_qty(int value) {
		setConstNumber(offset + 147, $onr_prov_rtn_gi_qty, value);
	}

	/**
	 * Chargeable supply return GI qty. 有償支給返品出庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gi_qty(long value) {
		setConstNumber(offset + 147, $onr_prov_rtn_gi_qty, value);
	}

	/**
	 * Chargeable supply return GI qty. 有償支給返品出庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gi_qty(float value) {
		setConstNumber(offset + 147, $onr_prov_rtn_gi_qty, value);
	}

	/**
	 * Chargeable supply return GI qty. 有償支給返品出庫数量.<p>
	 *
	 */
	public void onr_prov_rtn_gi_qty(double value) {
		setConstNumber(offset + 147, $onr_prov_rtn_gi_qty, value);
	}


	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public MCNumber insp_gi_qty() {
		return getConstNumber(offset + 148, $insp_gi_qty);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void insp_gi_qty(MCNumber value) {
		setConstNumber(offset + 148, $insp_gi_qty, value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void insp_gi_qty(int value) {
		setConstNumber(offset + 148, $insp_gi_qty, value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void insp_gi_qty(long value) {
		setConstNumber(offset + 148, $insp_gi_qty, value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void insp_gi_qty(float value) {
		setConstNumber(offset + 148, $insp_gi_qty, value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void insp_gi_qty(double value) {
		setConstNumber(offset + 148, $insp_gi_qty, value);
	}


	/**
	 * Inspection completed GI qty. 検査完了出庫数量.<p>
	 *
	 */
	public MCNumber insp_cmpl_gi_qty() {
		return getConstNumber(offset + 149, $insp_cmpl_gi_qty);
	}

	/**
	 * Inspection completed GI qty. 検査完了出庫数量.<p>
	 *
	 */
	public void insp_cmpl_gi_qty(MCNumber value) {
		setConstNumber(offset + 149, $insp_cmpl_gi_qty, value);
	}

	/**
	 * Inspection completed GI qty. 検査完了出庫数量.<p>
	 *
	 */
	public void insp_cmpl_gi_qty(int value) {
		setConstNumber(offset + 149, $insp_cmpl_gi_qty, value);
	}

	/**
	 * Inspection completed GI qty. 検査完了出庫数量.<p>
	 *
	 */
	public void insp_cmpl_gi_qty(long value) {
		setConstNumber(offset + 149, $insp_cmpl_gi_qty, value);
	}

	/**
	 * Inspection completed GI qty. 検査完了出庫数量.<p>
	 *
	 */
	public void insp_cmpl_gi_qty(float value) {
		setConstNumber(offset + 149, $insp_cmpl_gi_qty, value);
	}

	/**
	 * Inspection completed GI qty. 検査完了出庫数量.<p>
	 *
	 */
	public void insp_cmpl_gi_qty(double value) {
		setConstNumber(offset + 149, $insp_cmpl_gi_qty, value);
	}


	/**
	 * Inspection decision GI qty. 検査判定出庫数量.<p>
	 *
	 */
	public MCNumber insp_judg_gi_qty() {
		return getConstNumber(offset + 150, $insp_judg_gi_qty);
	}

	/**
	 * Inspection decision GI qty. 検査判定出庫数量.<p>
	 *
	 */
	public void insp_judg_gi_qty(MCNumber value) {
		setConstNumber(offset + 150, $insp_judg_gi_qty, value);
	}

	/**
	 * Inspection decision GI qty. 検査判定出庫数量.<p>
	 *
	 */
	public void insp_judg_gi_qty(int value) {
		setConstNumber(offset + 150, $insp_judg_gi_qty, value);
	}

	/**
	 * Inspection decision GI qty. 検査判定出庫数量.<p>
	 *
	 */
	public void insp_judg_gi_qty(long value) {
		setConstNumber(offset + 150, $insp_judg_gi_qty, value);
	}

	/**
	 * Inspection decision GI qty. 検査判定出庫数量.<p>
	 *
	 */
	public void insp_judg_gi_qty(float value) {
		setConstNumber(offset + 150, $insp_judg_gi_qty, value);
	}

	/**
	 * Inspection decision GI qty. 検査判定出庫数量.<p>
	 *
	 */
	public void insp_judg_gi_qty(double value) {
		setConstNumber(offset + 150, $insp_judg_gi_qty, value);
	}


	/**
	 * Re-inspection GI qty. 再検査出庫数量.<p>
	 *
	 */
	public MCNumber reinsp_gi_qty() {
		return getConstNumber(offset + 151, $reinsp_gi_qty);
	}

	/**
	 * Re-inspection GI qty. 再検査出庫数量.<p>
	 *
	 */
	public void reinsp_gi_qty(MCNumber value) {
		setConstNumber(offset + 151, $reinsp_gi_qty, value);
	}

	/**
	 * Re-inspection GI qty. 再検査出庫数量.<p>
	 *
	 */
	public void reinsp_gi_qty(int value) {
		setConstNumber(offset + 151, $reinsp_gi_qty, value);
	}

	/**
	 * Re-inspection GI qty. 再検査出庫数量.<p>
	 *
	 */
	public void reinsp_gi_qty(long value) {
		setConstNumber(offset + 151, $reinsp_gi_qty, value);
	}

	/**
	 * Re-inspection GI qty. 再検査出庫数量.<p>
	 *
	 */
	public void reinsp_gi_qty(float value) {
		setConstNumber(offset + 151, $reinsp_gi_qty, value);
	}

	/**
	 * Re-inspection GI qty. 再検査出庫数量.<p>
	 *
	 */
	public void reinsp_gi_qty(double value) {
		setConstNumber(offset + 151, $reinsp_gi_qty, value);
	}


	/**
	 * Sampling qty. 検査抜取数量.<p>
	 *
	 */
	public MCNumber insp_smpl_gi_qty() {
		return getConstNumber(offset + 152, $insp_smpl_gi_qty);
	}

	/**
	 * Sampling qty. 検査抜取数量.<p>
	 *
	 */
	public void insp_smpl_gi_qty(MCNumber value) {
		setConstNumber(offset + 152, $insp_smpl_gi_qty, value);
	}

	/**
	 * Sampling qty. 検査抜取数量.<p>
	 *
	 */
	public void insp_smpl_gi_qty(int value) {
		setConstNumber(offset + 152, $insp_smpl_gi_qty, value);
	}

	/**
	 * Sampling qty. 検査抜取数量.<p>
	 *
	 */
	public void insp_smpl_gi_qty(long value) {
		setConstNumber(offset + 152, $insp_smpl_gi_qty, value);
	}

	/**
	 * Sampling qty. 検査抜取数量.<p>
	 *
	 */
	public void insp_smpl_gi_qty(float value) {
		setConstNumber(offset + 152, $insp_smpl_gi_qty, value);
	}

	/**
	 * Sampling qty. 検査抜取数量.<p>
	 *
	 */
	public void insp_smpl_gi_qty(double value) {
		setConstNumber(offset + 152, $insp_smpl_gi_qty, value);
	}


	/**
	 * Inventory count variance qty. (GI) 棚卸差異減耗数量.<p>
	 *
	 */
	public MCNumber stk_adjst_gi_qty() {
		return getConstNumber(offset + 153, $stk_adjst_gi_qty);
	}

	/**
	 * Inventory count variance qty. (GI) 棚卸差異減耗数量.<p>
	 *
	 */
	public void stk_adjst_gi_qty(MCNumber value) {
		setConstNumber(offset + 153, $stk_adjst_gi_qty, value);
	}

	/**
	 * Inventory count variance qty. (GI) 棚卸差異減耗数量.<p>
	 *
	 */
	public void stk_adjst_gi_qty(int value) {
		setConstNumber(offset + 153, $stk_adjst_gi_qty, value);
	}

	/**
	 * Inventory count variance qty. (GI) 棚卸差異減耗数量.<p>
	 *
	 */
	public void stk_adjst_gi_qty(long value) {
		setConstNumber(offset + 153, $stk_adjst_gi_qty, value);
	}

	/**
	 * Inventory count variance qty. (GI) 棚卸差異減耗数量.<p>
	 *
	 */
	public void stk_adjst_gi_qty(float value) {
		setConstNumber(offset + 153, $stk_adjst_gi_qty, value);
	}

	/**
	 * Inventory count variance qty. (GI) 棚卸差異減耗数量.<p>
	 *
	 */
	public void stk_adjst_gi_qty(double value) {
		setConstNumber(offset + 153, $stk_adjst_gi_qty, value);
	}


	/**
	 * Warehousing GI qty. 倉入出庫数量.<p>
	 *
	 */
	public MCNumber prdct_wh_gi_qty() {
		return getConstNumber(offset + 154, $prdct_wh_gi_qty);
	}

	/**
	 * Warehousing GI qty. 倉入出庫数量.<p>
	 *
	 */
	public void prdct_wh_gi_qty(MCNumber value) {
		setConstNumber(offset + 154, $prdct_wh_gi_qty, value);
	}

	/**
	 * Warehousing GI qty. 倉入出庫数量.<p>
	 *
	 */
	public void prdct_wh_gi_qty(int value) {
		setConstNumber(offset + 154, $prdct_wh_gi_qty, value);
	}

	/**
	 * Warehousing GI qty. 倉入出庫数量.<p>
	 *
	 */
	public void prdct_wh_gi_qty(long value) {
		setConstNumber(offset + 154, $prdct_wh_gi_qty, value);
	}

	/**
	 * Warehousing GI qty. 倉入出庫数量.<p>
	 *
	 */
	public void prdct_wh_gi_qty(float value) {
		setConstNumber(offset + 154, $prdct_wh_gi_qty, value);
	}

	/**
	 * Warehousing GI qty. 倉入出庫数量.<p>
	 *
	 */
	public void prdct_wh_gi_qty(double value) {
		setConstNumber(offset + 154, $prdct_wh_gi_qty, value);
	}


	/**
	 * GI returning qty. 戻入出庫数量.<p>
	 *
	 */
	public MCNumber prdct_wh_rtn_gi_qty() {
		return getConstNumber(offset + 155, $prdct_wh_rtn_gi_qty);
	}

	/**
	 * GI returning qty. 戻入出庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_qty(MCNumber value) {
		setConstNumber(offset + 155, $prdct_wh_rtn_gi_qty, value);
	}

	/**
	 * GI returning qty. 戻入出庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_qty(int value) {
		setConstNumber(offset + 155, $prdct_wh_rtn_gi_qty, value);
	}

	/**
	 * GI returning qty. 戻入出庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_qty(long value) {
		setConstNumber(offset + 155, $prdct_wh_rtn_gi_qty, value);
	}

	/**
	 * GI returning qty. 戻入出庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_qty(float value) {
		setConstNumber(offset + 155, $prdct_wh_rtn_gi_qty, value);
	}

	/**
	 * GI returning qty. 戻入出庫数量.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_qty(double value) {
		setConstNumber(offset + 155, $prdct_wh_rtn_gi_qty, value);
	}


	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public MCNumber xfr_gi_qty() {
		return getConstNumber(offset + 156, $xfr_gi_qty);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void xfr_gi_qty(MCNumber value) {
		setConstNumber(offset + 156, $xfr_gi_qty, value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void xfr_gi_qty(int value) {
		setConstNumber(offset + 156, $xfr_gi_qty, value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void xfr_gi_qty(long value) {
		setConstNumber(offset + 156, $xfr_gi_qty, value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void xfr_gi_qty(float value) {
		setConstNumber(offset + 156, $xfr_gi_qty, value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void xfr_gi_qty(double value) {
		setConstNumber(offset + 156, $xfr_gi_qty, value);
	}


	/**
	 * Move-out qty. 転出数量.<p>
	 *
	 */
	public MCNumber xfr_out_qty() {
		return getConstNumber(offset + 157, $xfr_out_qty);
	}

	/**
	 * Move-out qty. 転出数量.<p>
	 *
	 */
	public void xfr_out_qty(MCNumber value) {
		setConstNumber(offset + 157, $xfr_out_qty, value);
	}

	/**
	 * Move-out qty. 転出数量.<p>
	 *
	 */
	public void xfr_out_qty(int value) {
		setConstNumber(offset + 157, $xfr_out_qty, value);
	}

	/**
	 * Move-out qty. 転出数量.<p>
	 *
	 */
	public void xfr_out_qty(long value) {
		setConstNumber(offset + 157, $xfr_out_qty, value);
	}

	/**
	 * Move-out qty. 転出数量.<p>
	 *
	 */
	public void xfr_out_qty(float value) {
		setConstNumber(offset + 157, $xfr_out_qty, value);
	}

	/**
	 * Move-out qty. 転出数量.<p>
	 *
	 */
	public void xfr_out_qty(double value) {
		setConstNumber(offset + 157, $xfr_out_qty, value);
	}


	/**
	 * Purchase move-out qty. 仕入転出数量.<p>
	 *
	 */
	public MCNumber purc_xfr_out_qty() {
		return getConstNumber(offset + 158, $purc_xfr_out_qty);
	}

	/**
	 * Purchase move-out qty. 仕入転出数量.<p>
	 *
	 */
	public void purc_xfr_out_qty(MCNumber value) {
		setConstNumber(offset + 158, $purc_xfr_out_qty, value);
	}

	/**
	 * Purchase move-out qty. 仕入転出数量.<p>
	 *
	 */
	public void purc_xfr_out_qty(int value) {
		setConstNumber(offset + 158, $purc_xfr_out_qty, value);
	}

	/**
	 * Purchase move-out qty. 仕入転出数量.<p>
	 *
	 */
	public void purc_xfr_out_qty(long value) {
		setConstNumber(offset + 158, $purc_xfr_out_qty, value);
	}

	/**
	 * Purchase move-out qty. 仕入転出数量.<p>
	 *
	 */
	public void purc_xfr_out_qty(float value) {
		setConstNumber(offset + 158, $purc_xfr_out_qty, value);
	}

	/**
	 * Purchase move-out qty. 仕入転出数量.<p>
	 *
	 */
	public void purc_xfr_out_qty(double value) {
		setConstNumber(offset + 158, $purc_xfr_out_qty, value);
	}


	/**
	 * Movement/transport return GI qty. 移動・移送返品出庫数量.<p>
	 *
	 */
	public MCNumber xfr_rtn_gi_qty() {
		return getConstNumber(offset + 159, $xfr_rtn_gi_qty);
	}

	/**
	 * Movement/transport return GI qty. 移動・移送返品出庫数量.<p>
	 *
	 */
	public void xfr_rtn_gi_qty(MCNumber value) {
		setConstNumber(offset + 159, $xfr_rtn_gi_qty, value);
	}

	/**
	 * Movement/transport return GI qty. 移動・移送返品出庫数量.<p>
	 *
	 */
	public void xfr_rtn_gi_qty(int value) {
		setConstNumber(offset + 159, $xfr_rtn_gi_qty, value);
	}

	/**
	 * Movement/transport return GI qty. 移動・移送返品出庫数量.<p>
	 *
	 */
	public void xfr_rtn_gi_qty(long value) {
		setConstNumber(offset + 159, $xfr_rtn_gi_qty, value);
	}

	/**
	 * Movement/transport return GI qty. 移動・移送返品出庫数量.<p>
	 *
	 */
	public void xfr_rtn_gi_qty(float value) {
		setConstNumber(offset + 159, $xfr_rtn_gi_qty, value);
	}

	/**
	 * Movement/transport return GI qty. 移動・移送返品出庫数量.<p>
	 *
	 */
	public void xfr_rtn_gi_qty(double value) {
		setConstNumber(offset + 159, $xfr_rtn_gi_qty, value);
	}


	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public MCNumber acxfr_gi_qty() {
		return getConstNumber(offset + 160, $acxfr_gi_qty);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void acxfr_gi_qty(MCNumber value) {
		setConstNumber(offset + 160, $acxfr_gi_qty, value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void acxfr_gi_qty(int value) {
		setConstNumber(offset + 160, $acxfr_gi_qty, value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void acxfr_gi_qty(long value) {
		setConstNumber(offset + 160, $acxfr_gi_qty, value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void acxfr_gi_qty(float value) {
		setConstNumber(offset + 160, $acxfr_gi_qty, value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void acxfr_gi_qty(double value) {
		setConstNumber(offset + 160, $acxfr_gi_qty, value);
	}


	/**
	 * Disposal qty. 廃棄数量.<p>
	 *
	 */
	public MCNumber scrp_qty() {
		return getConstNumber(offset + 161, $scrp_qty);
	}

	/**
	 * Disposal qty. 廃棄数量.<p>
	 *
	 */
	public void scrp_qty(MCNumber value) {
		setConstNumber(offset + 161, $scrp_qty, value);
	}

	/**
	 * Disposal qty. 廃棄数量.<p>
	 *
	 */
	public void scrp_qty(int value) {
		setConstNumber(offset + 161, $scrp_qty, value);
	}

	/**
	 * Disposal qty. 廃棄数量.<p>
	 *
	 */
	public void scrp_qty(long value) {
		setConstNumber(offset + 161, $scrp_qty, value);
	}

	/**
	 * Disposal qty. 廃棄数量.<p>
	 *
	 */
	public void scrp_qty(float value) {
		setConstNumber(offset + 161, $scrp_qty, value);
	}

	/**
	 * Disposal qty. 廃棄数量.<p>
	 *
	 */
	public void scrp_qty(double value) {
		setConstNumber(offset + 161, $scrp_qty, value);
	}


	/**
	 * Item transfer GI qty. 品目振替出庫数量.<p>
	 *
	 */
	public MCNumber xfr_itm_gi_qty() {
		return getConstNumber(offset + 162, $xfr_itm_gi_qty);
	}

	/**
	 * Item transfer GI qty. 品目振替出庫数量.<p>
	 *
	 */
	public void xfr_itm_gi_qty(MCNumber value) {
		setConstNumber(offset + 162, $xfr_itm_gi_qty, value);
	}

	/**
	 * Item transfer GI qty. 品目振替出庫数量.<p>
	 *
	 */
	public void xfr_itm_gi_qty(int value) {
		setConstNumber(offset + 162, $xfr_itm_gi_qty, value);
	}

	/**
	 * Item transfer GI qty. 品目振替出庫数量.<p>
	 *
	 */
	public void xfr_itm_gi_qty(long value) {
		setConstNumber(offset + 162, $xfr_itm_gi_qty, value);
	}

	/**
	 * Item transfer GI qty. 品目振替出庫数量.<p>
	 *
	 */
	public void xfr_itm_gi_qty(float value) {
		setConstNumber(offset + 162, $xfr_itm_gi_qty, value);
	}

	/**
	 * Item transfer GI qty. 品目振替出庫数量.<p>
	 *
	 */
	public void xfr_itm_gi_qty(double value) {
		setConstNumber(offset + 162, $xfr_itm_gi_qty, value);
	}


	/**
	 * Lot/SEIBAN No. transfer GI qty. ロット・手配ＮＯ振替出庫数量.<p>
	 *
	 */
	public MCNumber xfr_lot_sno_gi_qty() {
		return getConstNumber(offset + 163, $xfr_lot_sno_gi_qty);
	}

	/**
	 * Lot/SEIBAN No. transfer GI qty. ロット・手配ＮＯ振替出庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gi_qty(MCNumber value) {
		setConstNumber(offset + 163, $xfr_lot_sno_gi_qty, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI qty. ロット・手配ＮＯ振替出庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gi_qty(int value) {
		setConstNumber(offset + 163, $xfr_lot_sno_gi_qty, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI qty. ロット・手配ＮＯ振替出庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gi_qty(long value) {
		setConstNumber(offset + 163, $xfr_lot_sno_gi_qty, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI qty. ロット・手配ＮＯ振替出庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gi_qty(float value) {
		setConstNumber(offset + 163, $xfr_lot_sno_gi_qty, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI qty. ロット・手配ＮＯ振替出庫数量.<p>
	 *
	 */
	public void xfr_lot_sno_gi_qty(double value) {
		setConstNumber(offset + 163, $xfr_lot_sno_gi_qty, value);
	}


	/**
	 * GI qty. (Grading/conforming type transfer) 格付・良品区分振替出庫数量.<p>
	 *
	 */
	public MCNumber xfr_grd_gi_qty() {
		return getConstNumber(offset + 164, $xfr_grd_gi_qty);
	}

	/**
	 * GI qty. (Grading/conforming type transfer) 格付・良品区分振替出庫数量.<p>
	 *
	 */
	public void xfr_grd_gi_qty(MCNumber value) {
		setConstNumber(offset + 164, $xfr_grd_gi_qty, value);
	}

	/**
	 * GI qty. (Grading/conforming type transfer) 格付・良品区分振替出庫数量.<p>
	 *
	 */
	public void xfr_grd_gi_qty(int value) {
		setConstNumber(offset + 164, $xfr_grd_gi_qty, value);
	}

	/**
	 * GI qty. (Grading/conforming type transfer) 格付・良品区分振替出庫数量.<p>
	 *
	 */
	public void xfr_grd_gi_qty(long value) {
		setConstNumber(offset + 164, $xfr_grd_gi_qty, value);
	}

	/**
	 * GI qty. (Grading/conforming type transfer) 格付・良品区分振替出庫数量.<p>
	 *
	 */
	public void xfr_grd_gi_qty(float value) {
		setConstNumber(offset + 164, $xfr_grd_gi_qty, value);
	}

	/**
	 * GI qty. (Grading/conforming type transfer) 格付・良品区分振替出庫数量.<p>
	 *
	 */
	public void xfr_grd_gi_qty(double value) {
		setConstNumber(offset + 164, $xfr_grd_gi_qty, value);
	}


	/**
	 * SKU transfer GI qty. 荷姿振替出庫数量.<p>
	 *
	 */
	public MCNumber xfr_pack_gi_qty() {
		return getConstNumber(offset + 165, $xfr_pack_gi_qty);
	}

	/**
	 * SKU transfer GI qty. 荷姿振替出庫数量.<p>
	 *
	 */
	public void xfr_pack_gi_qty(MCNumber value) {
		setConstNumber(offset + 165, $xfr_pack_gi_qty, value);
	}

	/**
	 * SKU transfer GI qty. 荷姿振替出庫数量.<p>
	 *
	 */
	public void xfr_pack_gi_qty(int value) {
		setConstNumber(offset + 165, $xfr_pack_gi_qty, value);
	}

	/**
	 * SKU transfer GI qty. 荷姿振替出庫数量.<p>
	 *
	 */
	public void xfr_pack_gi_qty(long value) {
		setConstNumber(offset + 165, $xfr_pack_gi_qty, value);
	}

	/**
	 * SKU transfer GI qty. 荷姿振替出庫数量.<p>
	 *
	 */
	public void xfr_pack_gi_qty(float value) {
		setConstNumber(offset + 165, $xfr_pack_gi_qty, value);
	}

	/**
	 * SKU transfer GI qty. 荷姿振替出庫数量.<p>
	 *
	 */
	public void xfr_pack_gi_qty(double value) {
		setConstNumber(offset + 165, $xfr_pack_gi_qty, value);
	}


	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public MCNumber ship_out_qty() {
		return getConstNumber(offset + 166, $ship_out_qty);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_out_qty(MCNumber value) {
		setConstNumber(offset + 166, $ship_out_qty, value);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_out_qty(int value) {
		setConstNumber(offset + 166, $ship_out_qty, value);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_out_qty(long value) {
		setConstNumber(offset + 166, $ship_out_qty, value);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_out_qty(float value) {
		setConstNumber(offset + 166, $ship_out_qty, value);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_out_qty(double value) {
		setConstNumber(offset + 166, $ship_out_qty, value);
	}


	/**
	 * Export shipping qty. 輸出出荷数量.<p>
	 *
	 */
	public MCNumber ex_ship_out_qty() {
		return getConstNumber(offset + 167, $ex_ship_out_qty);
	}

	/**
	 * Export shipping qty. 輸出出荷数量.<p>
	 *
	 */
	public void ex_ship_out_qty(MCNumber value) {
		setConstNumber(offset + 167, $ex_ship_out_qty, value);
	}

	/**
	 * Export shipping qty. 輸出出荷数量.<p>
	 *
	 */
	public void ex_ship_out_qty(int value) {
		setConstNumber(offset + 167, $ex_ship_out_qty, value);
	}

	/**
	 * Export shipping qty. 輸出出荷数量.<p>
	 *
	 */
	public void ex_ship_out_qty(long value) {
		setConstNumber(offset + 167, $ex_ship_out_qty, value);
	}

	/**
	 * Export shipping qty. 輸出出荷数量.<p>
	 *
	 */
	public void ex_ship_out_qty(float value) {
		setConstNumber(offset + 167, $ex_ship_out_qty, value);
	}

	/**
	 * Export shipping qty. 輸出出荷数量.<p>
	 *
	 */
	public void ex_ship_out_qty(double value) {
		setConstNumber(offset + 167, $ex_ship_out_qty, value);
	}


	/**
	 * Shipping return GI qty. 出荷返品出庫数量.<p>
	 *
	 */
	public MCNumber ship_rtn_gi_qty() {
		return getConstNumber(offset + 168, $ship_rtn_gi_qty);
	}

	/**
	 * Shipping return GI qty. 出荷返品出庫数量.<p>
	 *
	 */
	public void ship_rtn_gi_qty(MCNumber value) {
		setConstNumber(offset + 168, $ship_rtn_gi_qty, value);
	}

	/**
	 * Shipping return GI qty. 出荷返品出庫数量.<p>
	 *
	 */
	public void ship_rtn_gi_qty(int value) {
		setConstNumber(offset + 168, $ship_rtn_gi_qty, value);
	}

	/**
	 * Shipping return GI qty. 出荷返品出庫数量.<p>
	 *
	 */
	public void ship_rtn_gi_qty(long value) {
		setConstNumber(offset + 168, $ship_rtn_gi_qty, value);
	}

	/**
	 * Shipping return GI qty. 出荷返品出庫数量.<p>
	 *
	 */
	public void ship_rtn_gi_qty(float value) {
		setConstNumber(offset + 168, $ship_rtn_gi_qty, value);
	}

	/**
	 * Shipping return GI qty. 出荷返品出庫数量.<p>
	 *
	 */
	public void ship_rtn_gi_qty(double value) {
		setConstNumber(offset + 168, $ship_rtn_gi_qty, value);
	}


	/**
	 * Sales return GI qty. 売上返品出庫数量.<p>
	 *
	 */
	public MCNumber sls_rtn_gi_qty() {
		return getConstNumber(offset + 169, $sls_rtn_gi_qty);
	}

	/**
	 * Sales return GI qty. 売上返品出庫数量.<p>
	 *
	 */
	public void sls_rtn_gi_qty(MCNumber value) {
		setConstNumber(offset + 169, $sls_rtn_gi_qty, value);
	}

	/**
	 * Sales return GI qty. 売上返品出庫数量.<p>
	 *
	 */
	public void sls_rtn_gi_qty(int value) {
		setConstNumber(offset + 169, $sls_rtn_gi_qty, value);
	}

	/**
	 * Sales return GI qty. 売上返品出庫数量.<p>
	 *
	 */
	public void sls_rtn_gi_qty(long value) {
		setConstNumber(offset + 169, $sls_rtn_gi_qty, value);
	}

	/**
	 * Sales return GI qty. 売上返品出庫数量.<p>
	 *
	 */
	public void sls_rtn_gi_qty(float value) {
		setConstNumber(offset + 169, $sls_rtn_gi_qty, value);
	}

	/**
	 * Sales return GI qty. 売上返品出庫数量.<p>
	 *
	 */
	public void sls_rtn_gi_qty(double value) {
		setConstNumber(offset + 169, $sls_rtn_gi_qty, value);
	}


	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public MCNumber sls_qty() {
		return getConstNumber(offset + 170, $sls_qty);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(MCNumber value) {
		setConstNumber(offset + 170, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(int value) {
		setConstNumber(offset + 170, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(long value) {
		setConstNumber(offset + 170, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(float value) {
		setConstNumber(offset + 170, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(double value) {
		setConstNumber(offset + 170, $sls_qty, value);
	}


	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public MCNumber end_stk_qty() {
		return getConstNumber(offset + 171, $end_stk_qty);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(MCNumber value) {
		setConstNumber(offset + 171, $end_stk_qty, value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(int value) {
		setConstNumber(offset + 171, $end_stk_qty, value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(long value) {
		setConstNumber(offset + 171, $end_stk_qty, value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(float value) {
		setConstNumber(offset + 171, $end_stk_qty, value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(double value) {
		setConstNumber(offset + 171, $end_stk_qty, value);
	}


	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public MCNumber ini_stk_amt() {
		return getConstNumber(offset + 172, $ini_stk_amt);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(MCNumber value) {
		setConstNumber(offset + 172, $ini_stk_amt, value);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(int value) {
		setConstNumber(offset + 172, $ini_stk_amt, value);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(long value) {
		setConstNumber(offset + 172, $ini_stk_amt, value);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(float value) {
		setConstNumber(offset + 172, $ini_stk_amt, value);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(double value) {
		setConstNumber(offset + 172, $ini_stk_amt, value);
	}


	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public MCNumber gr_total_amt() {
		return getConstNumber(offset + 173, $gr_total_amt);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(MCNumber value) {
		setConstNumber(offset + 173, $gr_total_amt, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(int value) {
		setConstNumber(offset + 173, $gr_total_amt, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(long value) {
		setConstNumber(offset + 173, $gr_total_amt, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(float value) {
		setConstNumber(offset + 173, $gr_total_amt, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(double value) {
		setConstNumber(offset + 173, $gr_total_amt, value);
	}


	/**
	 * Receipt amount 入荷金額.<p>
	 *
	 */
	public MCNumber arr_amt() {
		return getConstNumber(offset + 174, $arr_amt);
	}

	/**
	 * Receipt amount 入荷金額.<p>
	 *
	 */
	public void arr_amt(MCNumber value) {
		setConstNumber(offset + 174, $arr_amt, value);
	}

	/**
	 * Receipt amount 入荷金額.<p>
	 *
	 */
	public void arr_amt(int value) {
		setConstNumber(offset + 174, $arr_amt, value);
	}

	/**
	 * Receipt amount 入荷金額.<p>
	 *
	 */
	public void arr_amt(long value) {
		setConstNumber(offset + 174, $arr_amt, value);
	}

	/**
	 * Receipt amount 入荷金額.<p>
	 *
	 */
	public void arr_amt(float value) {
		setConstNumber(offset + 174, $arr_amt, value);
	}

	/**
	 * Receipt amount 入荷金額.<p>
	 *
	 */
	public void arr_amt(double value) {
		setConstNumber(offset + 174, $arr_amt, value);
	}


	/**
	 * Purchase GR amount 仕入入庫金額.<p>
	 *
	 */
	public MCNumber purc_gr_amt() {
		return getConstNumber(offset + 175, $purc_gr_amt);
	}

	/**
	 * Purchase GR amount 仕入入庫金額.<p>
	 *
	 */
	public void purc_gr_amt(MCNumber value) {
		setConstNumber(offset + 175, $purc_gr_amt, value);
	}

	/**
	 * Purchase GR amount 仕入入庫金額.<p>
	 *
	 */
	public void purc_gr_amt(int value) {
		setConstNumber(offset + 175, $purc_gr_amt, value);
	}

	/**
	 * Purchase GR amount 仕入入庫金額.<p>
	 *
	 */
	public void purc_gr_amt(long value) {
		setConstNumber(offset + 175, $purc_gr_amt, value);
	}

	/**
	 * Purchase GR amount 仕入入庫金額.<p>
	 *
	 */
	public void purc_gr_amt(float value) {
		setConstNumber(offset + 175, $purc_gr_amt, value);
	}

	/**
	 * Purchase GR amount 仕入入庫金額.<p>
	 *
	 */
	public void purc_gr_amt(double value) {
		setConstNumber(offset + 175, $purc_gr_amt, value);
	}


	/**
	 * Receiving for a fee GR amount 有償受給入庫金額.<p>
	 *
	 */
	public MCNumber onr_rcv_gr_amt() {
		return getConstNumber(offset + 176, $onr_rcv_gr_amt);
	}

	/**
	 * Receiving for a fee GR amount 有償受給入庫金額.<p>
	 *
	 */
	public void onr_rcv_gr_amt(MCNumber value) {
		setConstNumber(offset + 176, $onr_rcv_gr_amt, value);
	}

	/**
	 * Receiving for a fee GR amount 有償受給入庫金額.<p>
	 *
	 */
	public void onr_rcv_gr_amt(int value) {
		setConstNumber(offset + 176, $onr_rcv_gr_amt, value);
	}

	/**
	 * Receiving for a fee GR amount 有償受給入庫金額.<p>
	 *
	 */
	public void onr_rcv_gr_amt(long value) {
		setConstNumber(offset + 176, $onr_rcv_gr_amt, value);
	}

	/**
	 * Receiving for a fee GR amount 有償受給入庫金額.<p>
	 *
	 */
	public void onr_rcv_gr_amt(float value) {
		setConstNumber(offset + 176, $onr_rcv_gr_amt, value);
	}

	/**
	 * Receiving for a fee GR amount 有償受給入庫金額.<p>
	 *
	 */
	public void onr_rcv_gr_amt(double value) {
		setConstNumber(offset + 176, $onr_rcv_gr_amt, value);
	}


	/**
	 * Purchase return GR amount 仕入返品入庫金額.<p>
	 *
	 */
	public MCNumber purc_rtn_gr_amt() {
		return getConstNumber(offset + 177, $purc_rtn_gr_amt);
	}

	/**
	 * Purchase return GR amount 仕入返品入庫金額.<p>
	 *
	 */
	public void purc_rtn_gr_amt(MCNumber value) {
		setConstNumber(offset + 177, $purc_rtn_gr_amt, value);
	}

	/**
	 * Purchase return GR amount 仕入返品入庫金額.<p>
	 *
	 */
	public void purc_rtn_gr_amt(int value) {
		setConstNumber(offset + 177, $purc_rtn_gr_amt, value);
	}

	/**
	 * Purchase return GR amount 仕入返品入庫金額.<p>
	 *
	 */
	public void purc_rtn_gr_amt(long value) {
		setConstNumber(offset + 177, $purc_rtn_gr_amt, value);
	}

	/**
	 * Purchase return GR amount 仕入返品入庫金額.<p>
	 *
	 */
	public void purc_rtn_gr_amt(float value) {
		setConstNumber(offset + 177, $purc_rtn_gr_amt, value);
	}

	/**
	 * Purchase return GR amount 仕入返品入庫金額.<p>
	 *
	 */
	public void purc_rtn_gr_amt(double value) {
		setConstNumber(offset + 177, $purc_rtn_gr_amt, value);
	}


	/**
	 * Receiving for a fee return GR amount 有償受給返品入庫金額.<p>
	 *
	 */
	public MCNumber onr_rcv_ret_gr_amt() {
		return getConstNumber(offset + 178, $onr_rcv_ret_gr_amt);
	}

	/**
	 * Receiving for a fee return GR amount 有償受給返品入庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gr_amt(MCNumber value) {
		setConstNumber(offset + 178, $onr_rcv_ret_gr_amt, value);
	}

	/**
	 * Receiving for a fee return GR amount 有償受給返品入庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gr_amt(int value) {
		setConstNumber(offset + 178, $onr_rcv_ret_gr_amt, value);
	}

	/**
	 * Receiving for a fee return GR amount 有償受給返品入庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gr_amt(long value) {
		setConstNumber(offset + 178, $onr_rcv_ret_gr_amt, value);
	}

	/**
	 * Receiving for a fee return GR amount 有償受給返品入庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gr_amt(float value) {
		setConstNumber(offset + 178, $onr_rcv_ret_gr_amt, value);
	}

	/**
	 * Receiving for a fee return GR amount 有償受給返品入庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gr_amt(double value) {
		setConstNumber(offset + 178, $onr_rcv_ret_gr_amt, value);
	}


	/**
	 * Expense purchase GR amount 経費購買入庫金額.<p>
	 *
	 */
	public MCNumber xpns_purc_gr_amt() {
		return getConstNumber(offset + 179, $xpns_purc_gr_amt);
	}

	/**
	 * Expense purchase GR amount 経費購買入庫金額.<p>
	 *
	 */
	public void xpns_purc_gr_amt(MCNumber value) {
		setConstNumber(offset + 179, $xpns_purc_gr_amt, value);
	}

	/**
	 * Expense purchase GR amount 経費購買入庫金額.<p>
	 *
	 */
	public void xpns_purc_gr_amt(int value) {
		setConstNumber(offset + 179, $xpns_purc_gr_amt, value);
	}

	/**
	 * Expense purchase GR amount 経費購買入庫金額.<p>
	 *
	 */
	public void xpns_purc_gr_amt(long value) {
		setConstNumber(offset + 179, $xpns_purc_gr_amt, value);
	}

	/**
	 * Expense purchase GR amount 経費購買入庫金額.<p>
	 *
	 */
	public void xpns_purc_gr_amt(float value) {
		setConstNumber(offset + 179, $xpns_purc_gr_amt, value);
	}

	/**
	 * Expense purchase GR amount 経費購買入庫金額.<p>
	 *
	 */
	public void xpns_purc_gr_amt(double value) {
		setConstNumber(offset + 179, $xpns_purc_gr_amt, value);
	}


	/**
	 * Expense purchase return GR amount 経費購買返品入庫金額.<p>
	 *
	 */
	public MCNumber xpns_purc_rtn_gr_amt() {
		return getConstNumber(offset + 180, $xpns_purc_rtn_gr_amt);
	}

	/**
	 * Expense purchase return GR amount 経費購買返品入庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_amt(MCNumber value) {
		setConstNumber(offset + 180, $xpns_purc_rtn_gr_amt, value);
	}

	/**
	 * Expense purchase return GR amount 経費購買返品入庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_amt(int value) {
		setConstNumber(offset + 180, $xpns_purc_rtn_gr_amt, value);
	}

	/**
	 * Expense purchase return GR amount 経費購買返品入庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_amt(long value) {
		setConstNumber(offset + 180, $xpns_purc_rtn_gr_amt, value);
	}

	/**
	 * Expense purchase return GR amount 経費購買返品入庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_amt(float value) {
		setConstNumber(offset + 180, $xpns_purc_rtn_gr_amt, value);
	}

	/**
	 * Expense purchase return GR amount 経費購買返品入庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gr_amt(double value) {
		setConstNumber(offset + 180, $xpns_purc_rtn_gr_amt, value);
	}


	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public MCNumber accpt_dfct_gr_amt() {
		return getConstNumber(offset + 181, $accpt_dfct_gr_amt);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_gr_amt(MCNumber value) {
		setConstNumber(offset + 181, $accpt_dfct_gr_amt, value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_gr_amt(int value) {
		setConstNumber(offset + 181, $accpt_dfct_gr_amt, value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_gr_amt(long value) {
		setConstNumber(offset + 181, $accpt_dfct_gr_amt, value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_gr_amt(float value) {
		setConstNumber(offset + 181, $accpt_dfct_gr_amt, value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_gr_amt(double value) {
		setConstNumber(offset + 181, $accpt_dfct_gr_amt, value);
	}


	/**
	 * Mfg. amount 製造金額.<p>
	 *
	 */
	public MCNumber mfg_amt() {
		return getConstNumber(offset + 182, $mfg_amt);
	}

	/**
	 * Mfg. amount 製造金額.<p>
	 *
	 */
	public void mfg_amt(MCNumber value) {
		setConstNumber(offset + 182, $mfg_amt, value);
	}

	/**
	 * Mfg. amount 製造金額.<p>
	 *
	 */
	public void mfg_amt(int value) {
		setConstNumber(offset + 182, $mfg_amt, value);
	}

	/**
	 * Mfg. amount 製造金額.<p>
	 *
	 */
	public void mfg_amt(long value) {
		setConstNumber(offset + 182, $mfg_amt, value);
	}

	/**
	 * Mfg. amount 製造金額.<p>
	 *
	 */
	public void mfg_amt(float value) {
		setConstNumber(offset + 182, $mfg_amt, value);
	}

	/**
	 * Mfg. amount 製造金額.<p>
	 *
	 */
	public void mfg_amt(double value) {
		setConstNumber(offset + 182, $mfg_amt, value);
	}


	/**
	 * By-product mfg. amount 副産品製造金額.<p>
	 *
	 */
	public MCNumber bymfg_amt() {
		return getConstNumber(offset + 183, $bymfg_amt);
	}

	/**
	 * By-product mfg. amount 副産品製造金額.<p>
	 *
	 */
	public void bymfg_amt(MCNumber value) {
		setConstNumber(offset + 183, $bymfg_amt, value);
	}

	/**
	 * By-product mfg. amount 副産品製造金額.<p>
	 *
	 */
	public void bymfg_amt(int value) {
		setConstNumber(offset + 183, $bymfg_amt, value);
	}

	/**
	 * By-product mfg. amount 副産品製造金額.<p>
	 *
	 */
	public void bymfg_amt(long value) {
		setConstNumber(offset + 183, $bymfg_amt, value);
	}

	/**
	 * By-product mfg. amount 副産品製造金額.<p>
	 *
	 */
	public void bymfg_amt(float value) {
		setConstNumber(offset + 183, $bymfg_amt, value);
	}

	/**
	 * By-product mfg. amount 副産品製造金額.<p>
	 *
	 */
	public void bymfg_amt(double value) {
		setConstNumber(offset + 183, $bymfg_amt, value);
	}


	/**
	 * GR amount (Non-chargeable supply) 無償支給入庫金額.<p>
	 *
	 */
	public MCNumber ffr_prov_gr_amt() {
		return getConstNumber(offset + 184, $ffr_prov_gr_amt);
	}

	/**
	 * GR amount (Non-chargeable supply) 無償支給入庫金額.<p>
	 *
	 */
	public void ffr_prov_gr_amt(MCNumber value) {
		setConstNumber(offset + 184, $ffr_prov_gr_amt, value);
	}

	/**
	 * GR amount (Non-chargeable supply) 無償支給入庫金額.<p>
	 *
	 */
	public void ffr_prov_gr_amt(int value) {
		setConstNumber(offset + 184, $ffr_prov_gr_amt, value);
	}

	/**
	 * GR amount (Non-chargeable supply) 無償支給入庫金額.<p>
	 *
	 */
	public void ffr_prov_gr_amt(long value) {
		setConstNumber(offset + 184, $ffr_prov_gr_amt, value);
	}

	/**
	 * GR amount (Non-chargeable supply) 無償支給入庫金額.<p>
	 *
	 */
	public void ffr_prov_gr_amt(float value) {
		setConstNumber(offset + 184, $ffr_prov_gr_amt, value);
	}

	/**
	 * GR amount (Non-chargeable supply) 無償支給入庫金額.<p>
	 *
	 */
	public void ffr_prov_gr_amt(double value) {
		setConstNumber(offset + 184, $ffr_prov_gr_amt, value);
	}


	/**
	 * Chargeable supply GR amount 有償支給入庫金額.<p>
	 *
	 */
	public MCNumber onr_prov_gr_amt() {
		return getConstNumber(offset + 185, $onr_prov_gr_amt);
	}

	/**
	 * Chargeable supply GR amount 有償支給入庫金額.<p>
	 *
	 */
	public void onr_prov_gr_amt(MCNumber value) {
		setConstNumber(offset + 185, $onr_prov_gr_amt, value);
	}

	/**
	 * Chargeable supply GR amount 有償支給入庫金額.<p>
	 *
	 */
	public void onr_prov_gr_amt(int value) {
		setConstNumber(offset + 185, $onr_prov_gr_amt, value);
	}

	/**
	 * Chargeable supply GR amount 有償支給入庫金額.<p>
	 *
	 */
	public void onr_prov_gr_amt(long value) {
		setConstNumber(offset + 185, $onr_prov_gr_amt, value);
	}

	/**
	 * Chargeable supply GR amount 有償支給入庫金額.<p>
	 *
	 */
	public void onr_prov_gr_amt(float value) {
		setConstNumber(offset + 185, $onr_prov_gr_amt, value);
	}

	/**
	 * Chargeable supply GR amount 有償支給入庫金額.<p>
	 *
	 */
	public void onr_prov_gr_amt(double value) {
		setConstNumber(offset + 185, $onr_prov_gr_amt, value);
	}


	/**
	 * Non-chargeable supply return GR amount 無償支給返品入庫金額.<p>
	 *
	 */
	public MCNumber ffr_prov_rtn_gr_amt() {
		return getConstNumber(offset + 186, $ffr_prov_rtn_gr_amt);
	}

	/**
	 * Non-chargeable supply return GR amount 無償支給返品入庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_amt(MCNumber value) {
		setConstNumber(offset + 186, $ffr_prov_rtn_gr_amt, value);
	}

	/**
	 * Non-chargeable supply return GR amount 無償支給返品入庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_amt(int value) {
		setConstNumber(offset + 186, $ffr_prov_rtn_gr_amt, value);
	}

	/**
	 * Non-chargeable supply return GR amount 無償支給返品入庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_amt(long value) {
		setConstNumber(offset + 186, $ffr_prov_rtn_gr_amt, value);
	}

	/**
	 * Non-chargeable supply return GR amount 無償支給返品入庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_amt(float value) {
		setConstNumber(offset + 186, $ffr_prov_rtn_gr_amt, value);
	}

	/**
	 * Non-chargeable supply return GR amount 無償支給返品入庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gr_amt(double value) {
		setConstNumber(offset + 186, $ffr_prov_rtn_gr_amt, value);
	}


	/**
	 * Chargeable supply return GR amount 有償支給返品入庫金額.<p>
	 *
	 */
	public MCNumber onr_prov_rtn_gr_amt() {
		return getConstNumber(offset + 187, $onr_prov_rtn_gr_amt);
	}

	/**
	 * Chargeable supply return GR amount 有償支給返品入庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gr_amt(MCNumber value) {
		setConstNumber(offset + 187, $onr_prov_rtn_gr_amt, value);
	}

	/**
	 * Chargeable supply return GR amount 有償支給返品入庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gr_amt(int value) {
		setConstNumber(offset + 187, $onr_prov_rtn_gr_amt, value);
	}

	/**
	 * Chargeable supply return GR amount 有償支給返品入庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gr_amt(long value) {
		setConstNumber(offset + 187, $onr_prov_rtn_gr_amt, value);
	}

	/**
	 * Chargeable supply return GR amount 有償支給返品入庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gr_amt(float value) {
		setConstNumber(offset + 187, $onr_prov_rtn_gr_amt, value);
	}

	/**
	 * Chargeable supply return GR amount 有償支給返品入庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gr_amt(double value) {
		setConstNumber(offset + 187, $onr_prov_rtn_gr_amt, value);
	}


	/**
	 * Inspection GR amount 検査入庫金額.<p>
	 *
	 */
	public MCNumber insp_gr_amt() {
		return getConstNumber(offset + 188, $insp_gr_amt);
	}

	/**
	 * Inspection GR amount 検査入庫金額.<p>
	 *
	 */
	public void insp_gr_amt(MCNumber value) {
		setConstNumber(offset + 188, $insp_gr_amt, value);
	}

	/**
	 * Inspection GR amount 検査入庫金額.<p>
	 *
	 */
	public void insp_gr_amt(int value) {
		setConstNumber(offset + 188, $insp_gr_amt, value);
	}

	/**
	 * Inspection GR amount 検査入庫金額.<p>
	 *
	 */
	public void insp_gr_amt(long value) {
		setConstNumber(offset + 188, $insp_gr_amt, value);
	}

	/**
	 * Inspection GR amount 検査入庫金額.<p>
	 *
	 */
	public void insp_gr_amt(float value) {
		setConstNumber(offset + 188, $insp_gr_amt, value);
	}

	/**
	 * Inspection GR amount 検査入庫金額.<p>
	 *
	 */
	public void insp_gr_amt(double value) {
		setConstNumber(offset + 188, $insp_gr_amt, value);
	}


	/**
	 * Inspection completed GR amount 検査完了入庫金額.<p>
	 *
	 */
	public MCNumber insp_cmpl_gr_amt() {
		return getConstNumber(offset + 189, $insp_cmpl_gr_amt);
	}

	/**
	 * Inspection completed GR amount 検査完了入庫金額.<p>
	 *
	 */
	public void insp_cmpl_gr_amt(MCNumber value) {
		setConstNumber(offset + 189, $insp_cmpl_gr_amt, value);
	}

	/**
	 * Inspection completed GR amount 検査完了入庫金額.<p>
	 *
	 */
	public void insp_cmpl_gr_amt(int value) {
		setConstNumber(offset + 189, $insp_cmpl_gr_amt, value);
	}

	/**
	 * Inspection completed GR amount 検査完了入庫金額.<p>
	 *
	 */
	public void insp_cmpl_gr_amt(long value) {
		setConstNumber(offset + 189, $insp_cmpl_gr_amt, value);
	}

	/**
	 * Inspection completed GR amount 検査完了入庫金額.<p>
	 *
	 */
	public void insp_cmpl_gr_amt(float value) {
		setConstNumber(offset + 189, $insp_cmpl_gr_amt, value);
	}

	/**
	 * Inspection completed GR amount 検査完了入庫金額.<p>
	 *
	 */
	public void insp_cmpl_gr_amt(double value) {
		setConstNumber(offset + 189, $insp_cmpl_gr_amt, value);
	}


	/**
	 * Inspection decision GR amount 検査判定入庫金額.<p>
	 *
	 */
	public MCNumber insp_judg_gr_amt() {
		return getConstNumber(offset + 190, $insp_judg_gr_amt);
	}

	/**
	 * Inspection decision GR amount 検査判定入庫金額.<p>
	 *
	 */
	public void insp_judg_gr_amt(MCNumber value) {
		setConstNumber(offset + 190, $insp_judg_gr_amt, value);
	}

	/**
	 * Inspection decision GR amount 検査判定入庫金額.<p>
	 *
	 */
	public void insp_judg_gr_amt(int value) {
		setConstNumber(offset + 190, $insp_judg_gr_amt, value);
	}

	/**
	 * Inspection decision GR amount 検査判定入庫金額.<p>
	 *
	 */
	public void insp_judg_gr_amt(long value) {
		setConstNumber(offset + 190, $insp_judg_gr_amt, value);
	}

	/**
	 * Inspection decision GR amount 検査判定入庫金額.<p>
	 *
	 */
	public void insp_judg_gr_amt(float value) {
		setConstNumber(offset + 190, $insp_judg_gr_amt, value);
	}

	/**
	 * Inspection decision GR amount 検査判定入庫金額.<p>
	 *
	 */
	public void insp_judg_gr_amt(double value) {
		setConstNumber(offset + 190, $insp_judg_gr_amt, value);
	}


	/**
	 * Re-inspection GR amount 再検査入庫金額.<p>
	 *
	 */
	public MCNumber reinsp_gr_amt() {
		return getConstNumber(offset + 191, $reinsp_gr_amt);
	}

	/**
	 * Re-inspection GR amount 再検査入庫金額.<p>
	 *
	 */
	public void reinsp_gr_amt(MCNumber value) {
		setConstNumber(offset + 191, $reinsp_gr_amt, value);
	}

	/**
	 * Re-inspection GR amount 再検査入庫金額.<p>
	 *
	 */
	public void reinsp_gr_amt(int value) {
		setConstNumber(offset + 191, $reinsp_gr_amt, value);
	}

	/**
	 * Re-inspection GR amount 再検査入庫金額.<p>
	 *
	 */
	public void reinsp_gr_amt(long value) {
		setConstNumber(offset + 191, $reinsp_gr_amt, value);
	}

	/**
	 * Re-inspection GR amount 再検査入庫金額.<p>
	 *
	 */
	public void reinsp_gr_amt(float value) {
		setConstNumber(offset + 191, $reinsp_gr_amt, value);
	}

	/**
	 * Re-inspection GR amount 再検査入庫金額.<p>
	 *
	 */
	public void reinsp_gr_amt(double value) {
		setConstNumber(offset + 191, $reinsp_gr_amt, value);
	}


	/**
	 * Inventory count variance amount (GR) 棚卸差異増耗金額.<p>
	 *
	 */
	public MCNumber stk_adjst_gr_amt() {
		return getConstNumber(offset + 192, $stk_adjst_gr_amt);
	}

	/**
	 * Inventory count variance amount (GR) 棚卸差異増耗金額.<p>
	 *
	 */
	public void stk_adjst_gr_amt(MCNumber value) {
		setConstNumber(offset + 192, $stk_adjst_gr_amt, value);
	}

	/**
	 * Inventory count variance amount (GR) 棚卸差異増耗金額.<p>
	 *
	 */
	public void stk_adjst_gr_amt(int value) {
		setConstNumber(offset + 192, $stk_adjst_gr_amt, value);
	}

	/**
	 * Inventory count variance amount (GR) 棚卸差異増耗金額.<p>
	 *
	 */
	public void stk_adjst_gr_amt(long value) {
		setConstNumber(offset + 192, $stk_adjst_gr_amt, value);
	}

	/**
	 * Inventory count variance amount (GR) 棚卸差異増耗金額.<p>
	 *
	 */
	public void stk_adjst_gr_amt(float value) {
		setConstNumber(offset + 192, $stk_adjst_gr_amt, value);
	}

	/**
	 * Inventory count variance amount (GR) 棚卸差異増耗金額.<p>
	 *
	 */
	public void stk_adjst_gr_amt(double value) {
		setConstNumber(offset + 192, $stk_adjst_gr_amt, value);
	}


	/**
	 * Warehousing GR amount 倉入入庫金額.<p>
	 *
	 */
	public MCNumber prdct_wh_gr_amt() {
		return getConstNumber(offset + 193, $prdct_wh_gr_amt);
	}

	/**
	 * Warehousing GR amount 倉入入庫金額.<p>
	 *
	 */
	public void prdct_wh_gr_amt(MCNumber value) {
		setConstNumber(offset + 193, $prdct_wh_gr_amt, value);
	}

	/**
	 * Warehousing GR amount 倉入入庫金額.<p>
	 *
	 */
	public void prdct_wh_gr_amt(int value) {
		setConstNumber(offset + 193, $prdct_wh_gr_amt, value);
	}

	/**
	 * Warehousing GR amount 倉入入庫金額.<p>
	 *
	 */
	public void prdct_wh_gr_amt(long value) {
		setConstNumber(offset + 193, $prdct_wh_gr_amt, value);
	}

	/**
	 * Warehousing GR amount 倉入入庫金額.<p>
	 *
	 */
	public void prdct_wh_gr_amt(float value) {
		setConstNumber(offset + 193, $prdct_wh_gr_amt, value);
	}

	/**
	 * Warehousing GR amount 倉入入庫金額.<p>
	 *
	 */
	public void prdct_wh_gr_amt(double value) {
		setConstNumber(offset + 193, $prdct_wh_gr_amt, value);
	}


	/**
	 * GR returning amount 戻入入庫金額.<p>
	 *
	 */
	public MCNumber prdct_wh_rtn_gr_amt() {
		return getConstNumber(offset + 194, $prdct_wh_rtn_gr_amt);
	}

	/**
	 * GR returning amount 戻入入庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_amt(MCNumber value) {
		setConstNumber(offset + 194, $prdct_wh_rtn_gr_amt, value);
	}

	/**
	 * GR returning amount 戻入入庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_amt(int value) {
		setConstNumber(offset + 194, $prdct_wh_rtn_gr_amt, value);
	}

	/**
	 * GR returning amount 戻入入庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_amt(long value) {
		setConstNumber(offset + 194, $prdct_wh_rtn_gr_amt, value);
	}

	/**
	 * GR returning amount 戻入入庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_amt(float value) {
		setConstNumber(offset + 194, $prdct_wh_rtn_gr_amt, value);
	}

	/**
	 * GR returning amount 戻入入庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gr_amt(double value) {
		setConstNumber(offset + 194, $prdct_wh_rtn_gr_amt, value);
	}


	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public MCNumber xfr_gr_amt() {
		return getConstNumber(offset + 195, $xfr_gr_amt);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void xfr_gr_amt(MCNumber value) {
		setConstNumber(offset + 195, $xfr_gr_amt, value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void xfr_gr_amt(int value) {
		setConstNumber(offset + 195, $xfr_gr_amt, value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void xfr_gr_amt(long value) {
		setConstNumber(offset + 195, $xfr_gr_amt, value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void xfr_gr_amt(float value) {
		setConstNumber(offset + 195, $xfr_gr_amt, value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void xfr_gr_amt(double value) {
		setConstNumber(offset + 195, $xfr_gr_amt, value);
	}


	/**
	 * Move-in amount 転入金額.<p>
	 *
	 */
	public MCNumber xfr_in_amt() {
		return getConstNumber(offset + 196, $xfr_in_amt);
	}

	/**
	 * Move-in amount 転入金額.<p>
	 *
	 */
	public void xfr_in_amt(MCNumber value) {
		setConstNumber(offset + 196, $xfr_in_amt, value);
	}

	/**
	 * Move-in amount 転入金額.<p>
	 *
	 */
	public void xfr_in_amt(int value) {
		setConstNumber(offset + 196, $xfr_in_amt, value);
	}

	/**
	 * Move-in amount 転入金額.<p>
	 *
	 */
	public void xfr_in_amt(long value) {
		setConstNumber(offset + 196, $xfr_in_amt, value);
	}

	/**
	 * Move-in amount 転入金額.<p>
	 *
	 */
	public void xfr_in_amt(float value) {
		setConstNumber(offset + 196, $xfr_in_amt, value);
	}

	/**
	 * Move-in amount 転入金額.<p>
	 *
	 */
	public void xfr_in_amt(double value) {
		setConstNumber(offset + 196, $xfr_in_amt, value);
	}


	/**
	 * Amount of purchase without receipt 仕入転入金額.<p>
	 *
	 */
	public MCNumber purc_xfr_in_amt() {
		return getConstNumber(offset + 197, $purc_xfr_in_amt);
	}

	/**
	 * Amount of purchase without receipt 仕入転入金額.<p>
	 *
	 */
	public void purc_xfr_in_amt(MCNumber value) {
		setConstNumber(offset + 197, $purc_xfr_in_amt, value);
	}

	/**
	 * Amount of purchase without receipt 仕入転入金額.<p>
	 *
	 */
	public void purc_xfr_in_amt(int value) {
		setConstNumber(offset + 197, $purc_xfr_in_amt, value);
	}

	/**
	 * Amount of purchase without receipt 仕入転入金額.<p>
	 *
	 */
	public void purc_xfr_in_amt(long value) {
		setConstNumber(offset + 197, $purc_xfr_in_amt, value);
	}

	/**
	 * Amount of purchase without receipt 仕入転入金額.<p>
	 *
	 */
	public void purc_xfr_in_amt(float value) {
		setConstNumber(offset + 197, $purc_xfr_in_amt, value);
	}

	/**
	 * Amount of purchase without receipt 仕入転入金額.<p>
	 *
	 */
	public void purc_xfr_in_amt(double value) {
		setConstNumber(offset + 197, $purc_xfr_in_amt, value);
	}


	/**
	 * Movement/transport return GR amount 移動・移送返品入庫金額.<p>
	 *
	 */
	public MCNumber xfr_rtn_gr_amt() {
		return getConstNumber(offset + 198, $xfr_rtn_gr_amt);
	}

	/**
	 * Movement/transport return GR amount 移動・移送返品入庫金額.<p>
	 *
	 */
	public void xfr_rtn_gr_amt(MCNumber value) {
		setConstNumber(offset + 198, $xfr_rtn_gr_amt, value);
	}

	/**
	 * Movement/transport return GR amount 移動・移送返品入庫金額.<p>
	 *
	 */
	public void xfr_rtn_gr_amt(int value) {
		setConstNumber(offset + 198, $xfr_rtn_gr_amt, value);
	}

	/**
	 * Movement/transport return GR amount 移動・移送返品入庫金額.<p>
	 *
	 */
	public void xfr_rtn_gr_amt(long value) {
		setConstNumber(offset + 198, $xfr_rtn_gr_amt, value);
	}

	/**
	 * Movement/transport return GR amount 移動・移送返品入庫金額.<p>
	 *
	 */
	public void xfr_rtn_gr_amt(float value) {
		setConstNumber(offset + 198, $xfr_rtn_gr_amt, value);
	}

	/**
	 * Movement/transport return GR amount 移動・移送返品入庫金額.<p>
	 *
	 */
	public void xfr_rtn_gr_amt(double value) {
		setConstNumber(offset + 198, $xfr_rtn_gr_amt, value);
	}


	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public MCNumber acxfr_gr_amt() {
		return getConstNumber(offset + 199, $acxfr_gr_amt);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void acxfr_gr_amt(MCNumber value) {
		setConstNumber(offset + 199, $acxfr_gr_amt, value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void acxfr_gr_amt(int value) {
		setConstNumber(offset + 199, $acxfr_gr_amt, value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void acxfr_gr_amt(long value) {
		setConstNumber(offset + 199, $acxfr_gr_amt, value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void acxfr_gr_amt(float value) {
		setConstNumber(offset + 199, $acxfr_gr_amt, value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void acxfr_gr_amt(double value) {
		setConstNumber(offset + 199, $acxfr_gr_amt, value);
	}


	/**
	 * Customer inventory GR amount 預り入庫金額.<p>
	 *
	 */
	public MCNumber arr_cststk_amt() {
		return getConstNumber(offset + 200, $arr_cststk_amt);
	}

	/**
	 * Customer inventory GR amount 預り入庫金額.<p>
	 *
	 */
	public void arr_cststk_amt(MCNumber value) {
		setConstNumber(offset + 200, $arr_cststk_amt, value);
	}

	/**
	 * Customer inventory GR amount 預り入庫金額.<p>
	 *
	 */
	public void arr_cststk_amt(int value) {
		setConstNumber(offset + 200, $arr_cststk_amt, value);
	}

	/**
	 * Customer inventory GR amount 預り入庫金額.<p>
	 *
	 */
	public void arr_cststk_amt(long value) {
		setConstNumber(offset + 200, $arr_cststk_amt, value);
	}

	/**
	 * Customer inventory GR amount 預り入庫金額.<p>
	 *
	 */
	public void arr_cststk_amt(float value) {
		setConstNumber(offset + 200, $arr_cststk_amt, value);
	}

	/**
	 * Customer inventory GR amount 預り入庫金額.<p>
	 *
	 */
	public void arr_cststk_amt(double value) {
		setConstNumber(offset + 200, $arr_cststk_amt, value);
	}


	/**
	 * Item transfer GR amount 品目振替入庫金額.<p>
	 *
	 */
	public MCNumber xfr_itm_gr_amt() {
		return getConstNumber(offset + 201, $xfr_itm_gr_amt);
	}

	/**
	 * Item transfer GR amount 品目振替入庫金額.<p>
	 *
	 */
	public void xfr_itm_gr_amt(MCNumber value) {
		setConstNumber(offset + 201, $xfr_itm_gr_amt, value);
	}

	/**
	 * Item transfer GR amount 品目振替入庫金額.<p>
	 *
	 */
	public void xfr_itm_gr_amt(int value) {
		setConstNumber(offset + 201, $xfr_itm_gr_amt, value);
	}

	/**
	 * Item transfer GR amount 品目振替入庫金額.<p>
	 *
	 */
	public void xfr_itm_gr_amt(long value) {
		setConstNumber(offset + 201, $xfr_itm_gr_amt, value);
	}

	/**
	 * Item transfer GR amount 品目振替入庫金額.<p>
	 *
	 */
	public void xfr_itm_gr_amt(float value) {
		setConstNumber(offset + 201, $xfr_itm_gr_amt, value);
	}

	/**
	 * Item transfer GR amount 品目振替入庫金額.<p>
	 *
	 */
	public void xfr_itm_gr_amt(double value) {
		setConstNumber(offset + 201, $xfr_itm_gr_amt, value);
	}


	/**
	 * Lot/SEIBAN No. transfer GR amount ロット・手配ＮＯ振替入庫金額.<p>
	 *
	 */
	public MCNumber xfr_lot_sno_gr_amt() {
		return getConstNumber(offset + 202, $xfr_lot_sno_gr_amt);
	}

	/**
	 * Lot/SEIBAN No. transfer GR amount ロット・手配ＮＯ振替入庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gr_amt(MCNumber value) {
		setConstNumber(offset + 202, $xfr_lot_sno_gr_amt, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR amount ロット・手配ＮＯ振替入庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gr_amt(int value) {
		setConstNumber(offset + 202, $xfr_lot_sno_gr_amt, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR amount ロット・手配ＮＯ振替入庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gr_amt(long value) {
		setConstNumber(offset + 202, $xfr_lot_sno_gr_amt, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR amount ロット・手配ＮＯ振替入庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gr_amt(float value) {
		setConstNumber(offset + 202, $xfr_lot_sno_gr_amt, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GR amount ロット・手配ＮＯ振替入庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gr_amt(double value) {
		setConstNumber(offset + 202, $xfr_lot_sno_gr_amt, value);
	}


	/**
	 * GR amount (Grading/conforming type transfer) 格付・良品区分振替入庫金額.<p>
	 *
	 */
	public MCNumber xfr_grd_gr_amt() {
		return getConstNumber(offset + 203, $xfr_grd_gr_amt);
	}

	/**
	 * GR amount (Grading/conforming type transfer) 格付・良品区分振替入庫金額.<p>
	 *
	 */
	public void xfr_grd_gr_amt(MCNumber value) {
		setConstNumber(offset + 203, $xfr_grd_gr_amt, value);
	}

	/**
	 * GR amount (Grading/conforming type transfer) 格付・良品区分振替入庫金額.<p>
	 *
	 */
	public void xfr_grd_gr_amt(int value) {
		setConstNumber(offset + 203, $xfr_grd_gr_amt, value);
	}

	/**
	 * GR amount (Grading/conforming type transfer) 格付・良品区分振替入庫金額.<p>
	 *
	 */
	public void xfr_grd_gr_amt(long value) {
		setConstNumber(offset + 203, $xfr_grd_gr_amt, value);
	}

	/**
	 * GR amount (Grading/conforming type transfer) 格付・良品区分振替入庫金額.<p>
	 *
	 */
	public void xfr_grd_gr_amt(float value) {
		setConstNumber(offset + 203, $xfr_grd_gr_amt, value);
	}

	/**
	 * GR amount (Grading/conforming type transfer) 格付・良品区分振替入庫金額.<p>
	 *
	 */
	public void xfr_grd_gr_amt(double value) {
		setConstNumber(offset + 203, $xfr_grd_gr_amt, value);
	}


	/**
	 * SKU transfer GR amount 荷姿振替入庫金額.<p>
	 *
	 */
	public MCNumber xfr_pack_gr_amt() {
		return getConstNumber(offset + 204, $xfr_pack_gr_amt);
	}

	/**
	 * SKU transfer GR amount 荷姿振替入庫金額.<p>
	 *
	 */
	public void xfr_pack_gr_amt(MCNumber value) {
		setConstNumber(offset + 204, $xfr_pack_gr_amt, value);
	}

	/**
	 * SKU transfer GR amount 荷姿振替入庫金額.<p>
	 *
	 */
	public void xfr_pack_gr_amt(int value) {
		setConstNumber(offset + 204, $xfr_pack_gr_amt, value);
	}

	/**
	 * SKU transfer GR amount 荷姿振替入庫金額.<p>
	 *
	 */
	public void xfr_pack_gr_amt(long value) {
		setConstNumber(offset + 204, $xfr_pack_gr_amt, value);
	}

	/**
	 * SKU transfer GR amount 荷姿振替入庫金額.<p>
	 *
	 */
	public void xfr_pack_gr_amt(float value) {
		setConstNumber(offset + 204, $xfr_pack_gr_amt, value);
	}

	/**
	 * SKU transfer GR amount 荷姿振替入庫金額.<p>
	 *
	 */
	public void xfr_pack_gr_amt(double value) {
		setConstNumber(offset + 204, $xfr_pack_gr_amt, value);
	}


	/**
	 * Arrival amount 着荷金額.<p>
	 *
	 */
	public MCNumber ship_in_amt() {
		return getConstNumber(offset + 205, $ship_in_amt);
	}

	/**
	 * Arrival amount 着荷金額.<p>
	 *
	 */
	public void ship_in_amt(MCNumber value) {
		setConstNumber(offset + 205, $ship_in_amt, value);
	}

	/**
	 * Arrival amount 着荷金額.<p>
	 *
	 */
	public void ship_in_amt(int value) {
		setConstNumber(offset + 205, $ship_in_amt, value);
	}

	/**
	 * Arrival amount 着荷金額.<p>
	 *
	 */
	public void ship_in_amt(long value) {
		setConstNumber(offset + 205, $ship_in_amt, value);
	}

	/**
	 * Arrival amount 着荷金額.<p>
	 *
	 */
	public void ship_in_amt(float value) {
		setConstNumber(offset + 205, $ship_in_amt, value);
	}

	/**
	 * Arrival amount 着荷金額.<p>
	 *
	 */
	public void ship_in_amt(double value) {
		setConstNumber(offset + 205, $ship_in_amt, value);
	}


	/**
	 * Export arrival amount 輸出着荷金額.<p>
	 *
	 */
	public MCNumber ex_ship_in_amt() {
		return getConstNumber(offset + 206, $ex_ship_in_amt);
	}

	/**
	 * Export arrival amount 輸出着荷金額.<p>
	 *
	 */
	public void ex_ship_in_amt(MCNumber value) {
		setConstNumber(offset + 206, $ex_ship_in_amt, value);
	}

	/**
	 * Export arrival amount 輸出着荷金額.<p>
	 *
	 */
	public void ex_ship_in_amt(int value) {
		setConstNumber(offset + 206, $ex_ship_in_amt, value);
	}

	/**
	 * Export arrival amount 輸出着荷金額.<p>
	 *
	 */
	public void ex_ship_in_amt(long value) {
		setConstNumber(offset + 206, $ex_ship_in_amt, value);
	}

	/**
	 * Export arrival amount 輸出着荷金額.<p>
	 *
	 */
	public void ex_ship_in_amt(float value) {
		setConstNumber(offset + 206, $ex_ship_in_amt, value);
	}

	/**
	 * Export arrival amount 輸出着荷金額.<p>
	 *
	 */
	public void ex_ship_in_amt(double value) {
		setConstNumber(offset + 206, $ex_ship_in_amt, value);
	}


	/**
	 * Shipping return GR amount 出荷返品入庫金額.<p>
	 *
	 */
	public MCNumber ship_rtn_gr_amt() {
		return getConstNumber(offset + 207, $ship_rtn_gr_amt);
	}

	/**
	 * Shipping return GR amount 出荷返品入庫金額.<p>
	 *
	 */
	public void ship_rtn_gr_amt(MCNumber value) {
		setConstNumber(offset + 207, $ship_rtn_gr_amt, value);
	}

	/**
	 * Shipping return GR amount 出荷返品入庫金額.<p>
	 *
	 */
	public void ship_rtn_gr_amt(int value) {
		setConstNumber(offset + 207, $ship_rtn_gr_amt, value);
	}

	/**
	 * Shipping return GR amount 出荷返品入庫金額.<p>
	 *
	 */
	public void ship_rtn_gr_amt(long value) {
		setConstNumber(offset + 207, $ship_rtn_gr_amt, value);
	}

	/**
	 * Shipping return GR amount 出荷返品入庫金額.<p>
	 *
	 */
	public void ship_rtn_gr_amt(float value) {
		setConstNumber(offset + 207, $ship_rtn_gr_amt, value);
	}

	/**
	 * Shipping return GR amount 出荷返品入庫金額.<p>
	 *
	 */
	public void ship_rtn_gr_amt(double value) {
		setConstNumber(offset + 207, $ship_rtn_gr_amt, value);
	}


	/**
	 * Sales return GR amount 売上返品入庫金額.<p>
	 *
	 */
	public MCNumber sls_rtn_gr_amt() {
		return getConstNumber(offset + 208, $sls_rtn_gr_amt);
	}

	/**
	 * Sales return GR amount 売上返品入庫金額.<p>
	 *
	 */
	public void sls_rtn_gr_amt(MCNumber value) {
		setConstNumber(offset + 208, $sls_rtn_gr_amt, value);
	}

	/**
	 * Sales return GR amount 売上返品入庫金額.<p>
	 *
	 */
	public void sls_rtn_gr_amt(int value) {
		setConstNumber(offset + 208, $sls_rtn_gr_amt, value);
	}

	/**
	 * Sales return GR amount 売上返品入庫金額.<p>
	 *
	 */
	public void sls_rtn_gr_amt(long value) {
		setConstNumber(offset + 208, $sls_rtn_gr_amt, value);
	}

	/**
	 * Sales return GR amount 売上返品入庫金額.<p>
	 *
	 */
	public void sls_rtn_gr_amt(float value) {
		setConstNumber(offset + 208, $sls_rtn_gr_amt, value);
	}

	/**
	 * Sales return GR amount 売上返品入庫金額.<p>
	 *
	 */
	public void sls_rtn_gr_amt(double value) {
		setConstNumber(offset + 208, $sls_rtn_gr_amt, value);
	}


	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public MCNumber gi_total_amt() {
		return getConstNumber(offset + 209, $gi_total_amt);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(MCNumber value) {
		setConstNumber(offset + 209, $gi_total_amt, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(int value) {
		setConstNumber(offset + 209, $gi_total_amt, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(long value) {
		setConstNumber(offset + 209, $gi_total_amt, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(float value) {
		setConstNumber(offset + 209, $gi_total_amt, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(double value) {
		setConstNumber(offset + 209, $gi_total_amt, value);
	}


	/**
	 * Receipt return amount 入荷返品金額.<p>
	 *
	 */
	public MCNumber arr_rtn_amt() {
		return getConstNumber(offset + 210, $arr_rtn_amt);
	}

	/**
	 * Receipt return amount 入荷返品金額.<p>
	 *
	 */
	public void arr_rtn_amt(MCNumber value) {
		setConstNumber(offset + 210, $arr_rtn_amt, value);
	}

	/**
	 * Receipt return amount 入荷返品金額.<p>
	 *
	 */
	public void arr_rtn_amt(int value) {
		setConstNumber(offset + 210, $arr_rtn_amt, value);
	}

	/**
	 * Receipt return amount 入荷返品金額.<p>
	 *
	 */
	public void arr_rtn_amt(long value) {
		setConstNumber(offset + 210, $arr_rtn_amt, value);
	}

	/**
	 * Receipt return amount 入荷返品金額.<p>
	 *
	 */
	public void arr_rtn_amt(float value) {
		setConstNumber(offset + 210, $arr_rtn_amt, value);
	}

	/**
	 * Receipt return amount 入荷返品金額.<p>
	 *
	 */
	public void arr_rtn_amt(double value) {
		setConstNumber(offset + 210, $arr_rtn_amt, value);
	}


	/**
	 * Purchase GI amount 仕入出庫金額.<p>
	 *
	 */
	public MCNumber purc_gi_amt() {
		return getConstNumber(offset + 211, $purc_gi_amt);
	}

	/**
	 * Purchase GI amount 仕入出庫金額.<p>
	 *
	 */
	public void purc_gi_amt(MCNumber value) {
		setConstNumber(offset + 211, $purc_gi_amt, value);
	}

	/**
	 * Purchase GI amount 仕入出庫金額.<p>
	 *
	 */
	public void purc_gi_amt(int value) {
		setConstNumber(offset + 211, $purc_gi_amt, value);
	}

	/**
	 * Purchase GI amount 仕入出庫金額.<p>
	 *
	 */
	public void purc_gi_amt(long value) {
		setConstNumber(offset + 211, $purc_gi_amt, value);
	}

	/**
	 * Purchase GI amount 仕入出庫金額.<p>
	 *
	 */
	public void purc_gi_amt(float value) {
		setConstNumber(offset + 211, $purc_gi_amt, value);
	}

	/**
	 * Purchase GI amount 仕入出庫金額.<p>
	 *
	 */
	public void purc_gi_amt(double value) {
		setConstNumber(offset + 211, $purc_gi_amt, value);
	}


	/**
	 * Receiving for a fee GI amount 有償受給出庫金額.<p>
	 *
	 */
	public MCNumber onr_rcv_gi_amt() {
		return getConstNumber(offset + 212, $onr_rcv_gi_amt);
	}

	/**
	 * Receiving for a fee GI amount 有償受給出庫金額.<p>
	 *
	 */
	public void onr_rcv_gi_amt(MCNumber value) {
		setConstNumber(offset + 212, $onr_rcv_gi_amt, value);
	}

	/**
	 * Receiving for a fee GI amount 有償受給出庫金額.<p>
	 *
	 */
	public void onr_rcv_gi_amt(int value) {
		setConstNumber(offset + 212, $onr_rcv_gi_amt, value);
	}

	/**
	 * Receiving for a fee GI amount 有償受給出庫金額.<p>
	 *
	 */
	public void onr_rcv_gi_amt(long value) {
		setConstNumber(offset + 212, $onr_rcv_gi_amt, value);
	}

	/**
	 * Receiving for a fee GI amount 有償受給出庫金額.<p>
	 *
	 */
	public void onr_rcv_gi_amt(float value) {
		setConstNumber(offset + 212, $onr_rcv_gi_amt, value);
	}

	/**
	 * Receiving for a fee GI amount 有償受給出庫金額.<p>
	 *
	 */
	public void onr_rcv_gi_amt(double value) {
		setConstNumber(offset + 212, $onr_rcv_gi_amt, value);
	}


	/**
	 * Purchase return GI amount 仕入返品出庫金額.<p>
	 *
	 */
	public MCNumber purc_rtn_gi_amt() {
		return getConstNumber(offset + 213, $purc_rtn_gi_amt);
	}

	/**
	 * Purchase return GI amount 仕入返品出庫金額.<p>
	 *
	 */
	public void purc_rtn_gi_amt(MCNumber value) {
		setConstNumber(offset + 213, $purc_rtn_gi_amt, value);
	}

	/**
	 * Purchase return GI amount 仕入返品出庫金額.<p>
	 *
	 */
	public void purc_rtn_gi_amt(int value) {
		setConstNumber(offset + 213, $purc_rtn_gi_amt, value);
	}

	/**
	 * Purchase return GI amount 仕入返品出庫金額.<p>
	 *
	 */
	public void purc_rtn_gi_amt(long value) {
		setConstNumber(offset + 213, $purc_rtn_gi_amt, value);
	}

	/**
	 * Purchase return GI amount 仕入返品出庫金額.<p>
	 *
	 */
	public void purc_rtn_gi_amt(float value) {
		setConstNumber(offset + 213, $purc_rtn_gi_amt, value);
	}

	/**
	 * Purchase return GI amount 仕入返品出庫金額.<p>
	 *
	 */
	public void purc_rtn_gi_amt(double value) {
		setConstNumber(offset + 213, $purc_rtn_gi_amt, value);
	}


	/**
	 * Receiving for a fee return GI amount 有償受給返品出庫金額.<p>
	 *
	 */
	public MCNumber onr_rcv_ret_gi_amt() {
		return getConstNumber(offset + 214, $onr_rcv_ret_gi_amt);
	}

	/**
	 * Receiving for a fee return GI amount 有償受給返品出庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gi_amt(MCNumber value) {
		setConstNumber(offset + 214, $onr_rcv_ret_gi_amt, value);
	}

	/**
	 * Receiving for a fee return GI amount 有償受給返品出庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gi_amt(int value) {
		setConstNumber(offset + 214, $onr_rcv_ret_gi_amt, value);
	}

	/**
	 * Receiving for a fee return GI amount 有償受給返品出庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gi_amt(long value) {
		setConstNumber(offset + 214, $onr_rcv_ret_gi_amt, value);
	}

	/**
	 * Receiving for a fee return GI amount 有償受給返品出庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gi_amt(float value) {
		setConstNumber(offset + 214, $onr_rcv_ret_gi_amt, value);
	}

	/**
	 * Receiving for a fee return GI amount 有償受給返品出庫金額.<p>
	 *
	 */
	public void onr_rcv_ret_gi_amt(double value) {
		setConstNumber(offset + 214, $onr_rcv_ret_gi_amt, value);
	}


	/**
	 * Expense purchase GI amount 経費購買出庫金額.<p>
	 *
	 */
	public MCNumber xpns_purc_gi_amt() {
		return getConstNumber(offset + 215, $xpns_purc_gi_amt);
	}

	/**
	 * Expense purchase GI amount 経費購買出庫金額.<p>
	 *
	 */
	public void xpns_purc_gi_amt(MCNumber value) {
		setConstNumber(offset + 215, $xpns_purc_gi_amt, value);
	}

	/**
	 * Expense purchase GI amount 経費購買出庫金額.<p>
	 *
	 */
	public void xpns_purc_gi_amt(int value) {
		setConstNumber(offset + 215, $xpns_purc_gi_amt, value);
	}

	/**
	 * Expense purchase GI amount 経費購買出庫金額.<p>
	 *
	 */
	public void xpns_purc_gi_amt(long value) {
		setConstNumber(offset + 215, $xpns_purc_gi_amt, value);
	}

	/**
	 * Expense purchase GI amount 経費購買出庫金額.<p>
	 *
	 */
	public void xpns_purc_gi_amt(float value) {
		setConstNumber(offset + 215, $xpns_purc_gi_amt, value);
	}

	/**
	 * Expense purchase GI amount 経費購買出庫金額.<p>
	 *
	 */
	public void xpns_purc_gi_amt(double value) {
		setConstNumber(offset + 215, $xpns_purc_gi_amt, value);
	}


	/**
	 * Expense purchase return GI amount 経費購買返品出庫金額.<p>
	 *
	 */
	public MCNumber xpns_purc_rtn_gi_amt() {
		return getConstNumber(offset + 216, $xpns_purc_rtn_gi_amt);
	}

	/**
	 * Expense purchase return GI amount 経費購買返品出庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_amt(MCNumber value) {
		setConstNumber(offset + 216, $xpns_purc_rtn_gi_amt, value);
	}

	/**
	 * Expense purchase return GI amount 経費購買返品出庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_amt(int value) {
		setConstNumber(offset + 216, $xpns_purc_rtn_gi_amt, value);
	}

	/**
	 * Expense purchase return GI amount 経費購買返品出庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_amt(long value) {
		setConstNumber(offset + 216, $xpns_purc_rtn_gi_amt, value);
	}

	/**
	 * Expense purchase return GI amount 経費購買返品出庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_amt(float value) {
		setConstNumber(offset + 216, $xpns_purc_rtn_gi_amt, value);
	}

	/**
	 * Expense purchase return GI amount 経費購買返品出庫金額.<p>
	 *
	 */
	public void xpns_purc_rtn_gi_amt(double value) {
		setConstNumber(offset + 216, $xpns_purc_rtn_gi_amt, value);
	}


	/**
	 * Defective acceptance GI amount 検収不良出庫金額.<p>
	 *
	 */
	public MCNumber accpt_dfct_gi_amt() {
		return getConstNumber(offset + 217, $accpt_dfct_gi_amt);
	}

	/**
	 * Defective acceptance GI amount 検収不良出庫金額.<p>
	 *
	 */
	public void accpt_dfct_gi_amt(MCNumber value) {
		setConstNumber(offset + 217, $accpt_dfct_gi_amt, value);
	}

	/**
	 * Defective acceptance GI amount 検収不良出庫金額.<p>
	 *
	 */
	public void accpt_dfct_gi_amt(int value) {
		setConstNumber(offset + 217, $accpt_dfct_gi_amt, value);
	}

	/**
	 * Defective acceptance GI amount 検収不良出庫金額.<p>
	 *
	 */
	public void accpt_dfct_gi_amt(long value) {
		setConstNumber(offset + 217, $accpt_dfct_gi_amt, value);
	}

	/**
	 * Defective acceptance GI amount 検収不良出庫金額.<p>
	 *
	 */
	public void accpt_dfct_gi_amt(float value) {
		setConstNumber(offset + 217, $accpt_dfct_gi_amt, value);
	}

	/**
	 * Defective acceptance GI amount 検収不良出庫金額.<p>
	 *
	 */
	public void accpt_dfct_gi_amt(double value) {
		setConstNumber(offset + 217, $accpt_dfct_gi_amt, value);
	}


	/**
	 * Input amount 投入金額.<p>
	 *
	 */
	public MCNumber inpt_amt() {
		return getConstNumber(offset + 218, $inpt_amt);
	}

	/**
	 * Input amount 投入金額.<p>
	 *
	 */
	public void inpt_amt(MCNumber value) {
		setConstNumber(offset + 218, $inpt_amt, value);
	}

	/**
	 * Input amount 投入金額.<p>
	 *
	 */
	public void inpt_amt(int value) {
		setConstNumber(offset + 218, $inpt_amt, value);
	}

	/**
	 * Input amount 投入金額.<p>
	 *
	 */
	public void inpt_amt(long value) {
		setConstNumber(offset + 218, $inpt_amt, value);
	}

	/**
	 * Input amount 投入金額.<p>
	 *
	 */
	public void inpt_amt(float value) {
		setConstNumber(offset + 218, $inpt_amt, value);
	}

	/**
	 * Input amount 投入金額.<p>
	 *
	 */
	public void inpt_amt(double value) {
		setConstNumber(offset + 218, $inpt_amt, value);
	}


	/**
	 * Loss amount ロス金額.<p>
	 *
	 */
	public MCNumber loss_amt() {
		return getConstNumber(offset + 219, $loss_amt);
	}

	/**
	 * Loss amount ロス金額.<p>
	 *
	 */
	public void loss_amt(MCNumber value) {
		setConstNumber(offset + 219, $loss_amt, value);
	}

	/**
	 * Loss amount ロス金額.<p>
	 *
	 */
	public void loss_amt(int value) {
		setConstNumber(offset + 219, $loss_amt, value);
	}

	/**
	 * Loss amount ロス金額.<p>
	 *
	 */
	public void loss_amt(long value) {
		setConstNumber(offset + 219, $loss_amt, value);
	}

	/**
	 * Loss amount ロス金額.<p>
	 *
	 */
	public void loss_amt(float value) {
		setConstNumber(offset + 219, $loss_amt, value);
	}

	/**
	 * Loss amount ロス金額.<p>
	 *
	 */
	public void loss_amt(double value) {
		setConstNumber(offset + 219, $loss_amt, value);
	}


	/**
	 * Non-chargeable supply GI amount 無償支給出庫金額.<p>
	 *
	 */
	public MCNumber ffr_prov_gi_amt() {
		return getConstNumber(offset + 220, $ffr_prov_gi_amt);
	}

	/**
	 * Non-chargeable supply GI amount 無償支給出庫金額.<p>
	 *
	 */
	public void ffr_prov_gi_amt(MCNumber value) {
		setConstNumber(offset + 220, $ffr_prov_gi_amt, value);
	}

	/**
	 * Non-chargeable supply GI amount 無償支給出庫金額.<p>
	 *
	 */
	public void ffr_prov_gi_amt(int value) {
		setConstNumber(offset + 220, $ffr_prov_gi_amt, value);
	}

	/**
	 * Non-chargeable supply GI amount 無償支給出庫金額.<p>
	 *
	 */
	public void ffr_prov_gi_amt(long value) {
		setConstNumber(offset + 220, $ffr_prov_gi_amt, value);
	}

	/**
	 * Non-chargeable supply GI amount 無償支給出庫金額.<p>
	 *
	 */
	public void ffr_prov_gi_amt(float value) {
		setConstNumber(offset + 220, $ffr_prov_gi_amt, value);
	}

	/**
	 * Non-chargeable supply GI amount 無償支給出庫金額.<p>
	 *
	 */
	public void ffr_prov_gi_amt(double value) {
		setConstNumber(offset + 220, $ffr_prov_gi_amt, value);
	}


	/**
	 * Chargeable supply GI amount 有償支給出庫金額.<p>
	 *
	 */
	public MCNumber onr_prov_gi_amt() {
		return getConstNumber(offset + 221, $onr_prov_gi_amt);
	}

	/**
	 * Chargeable supply GI amount 有償支給出庫金額.<p>
	 *
	 */
	public void onr_prov_gi_amt(MCNumber value) {
		setConstNumber(offset + 221, $onr_prov_gi_amt, value);
	}

	/**
	 * Chargeable supply GI amount 有償支給出庫金額.<p>
	 *
	 */
	public void onr_prov_gi_amt(int value) {
		setConstNumber(offset + 221, $onr_prov_gi_amt, value);
	}

	/**
	 * Chargeable supply GI amount 有償支給出庫金額.<p>
	 *
	 */
	public void onr_prov_gi_amt(long value) {
		setConstNumber(offset + 221, $onr_prov_gi_amt, value);
	}

	/**
	 * Chargeable supply GI amount 有償支給出庫金額.<p>
	 *
	 */
	public void onr_prov_gi_amt(float value) {
		setConstNumber(offset + 221, $onr_prov_gi_amt, value);
	}

	/**
	 * Chargeable supply GI amount 有償支給出庫金額.<p>
	 *
	 */
	public void onr_prov_gi_amt(double value) {
		setConstNumber(offset + 221, $onr_prov_gi_amt, value);
	}


	/**
	 * Non-chargeable supply return GI amount 無償支給返品出庫金額.<p>
	 *
	 */
	public MCNumber ffr_prov_rtn_gi_amt() {
		return getConstNumber(offset + 222, $ffr_prov_rtn_gi_amt);
	}

	/**
	 * Non-chargeable supply return GI amount 無償支給返品出庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_amt(MCNumber value) {
		setConstNumber(offset + 222, $ffr_prov_rtn_gi_amt, value);
	}

	/**
	 * Non-chargeable supply return GI amount 無償支給返品出庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_amt(int value) {
		setConstNumber(offset + 222, $ffr_prov_rtn_gi_amt, value);
	}

	/**
	 * Non-chargeable supply return GI amount 無償支給返品出庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_amt(long value) {
		setConstNumber(offset + 222, $ffr_prov_rtn_gi_amt, value);
	}

	/**
	 * Non-chargeable supply return GI amount 無償支給返品出庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_amt(float value) {
		setConstNumber(offset + 222, $ffr_prov_rtn_gi_amt, value);
	}

	/**
	 * Non-chargeable supply return GI amount 無償支給返品出庫金額.<p>
	 *
	 */
	public void ffr_prov_rtn_gi_amt(double value) {
		setConstNumber(offset + 222, $ffr_prov_rtn_gi_amt, value);
	}


	/**
	 * Chargeable supply return GI amount 有償支給返品出庫金額.<p>
	 *
	 */
	public MCNumber onr_prov_rtn_gi_amt() {
		return getConstNumber(offset + 223, $onr_prov_rtn_gi_amt);
	}

	/**
	 * Chargeable supply return GI amount 有償支給返品出庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gi_amt(MCNumber value) {
		setConstNumber(offset + 223, $onr_prov_rtn_gi_amt, value);
	}

	/**
	 * Chargeable supply return GI amount 有償支給返品出庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gi_amt(int value) {
		setConstNumber(offset + 223, $onr_prov_rtn_gi_amt, value);
	}

	/**
	 * Chargeable supply return GI amount 有償支給返品出庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gi_amt(long value) {
		setConstNumber(offset + 223, $onr_prov_rtn_gi_amt, value);
	}

	/**
	 * Chargeable supply return GI amount 有償支給返品出庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gi_amt(float value) {
		setConstNumber(offset + 223, $onr_prov_rtn_gi_amt, value);
	}

	/**
	 * Chargeable supply return GI amount 有償支給返品出庫金額.<p>
	 *
	 */
	public void onr_prov_rtn_gi_amt(double value) {
		setConstNumber(offset + 223, $onr_prov_rtn_gi_amt, value);
	}


	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public MCNumber insp_gi_amt() {
		return getConstNumber(offset + 224, $insp_gi_amt);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void insp_gi_amt(MCNumber value) {
		setConstNumber(offset + 224, $insp_gi_amt, value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void insp_gi_amt(int value) {
		setConstNumber(offset + 224, $insp_gi_amt, value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void insp_gi_amt(long value) {
		setConstNumber(offset + 224, $insp_gi_amt, value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void insp_gi_amt(float value) {
		setConstNumber(offset + 224, $insp_gi_amt, value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void insp_gi_amt(double value) {
		setConstNumber(offset + 224, $insp_gi_amt, value);
	}


	/**
	 * Inspection completed GI amount 検査完了出庫金額.<p>
	 *
	 */
	public MCNumber insp_cmpl_gi_amt() {
		return getConstNumber(offset + 225, $insp_cmpl_gi_amt);
	}

	/**
	 * Inspection completed GI amount 検査完了出庫金額.<p>
	 *
	 */
	public void insp_cmpl_gi_amt(MCNumber value) {
		setConstNumber(offset + 225, $insp_cmpl_gi_amt, value);
	}

	/**
	 * Inspection completed GI amount 検査完了出庫金額.<p>
	 *
	 */
	public void insp_cmpl_gi_amt(int value) {
		setConstNumber(offset + 225, $insp_cmpl_gi_amt, value);
	}

	/**
	 * Inspection completed GI amount 検査完了出庫金額.<p>
	 *
	 */
	public void insp_cmpl_gi_amt(long value) {
		setConstNumber(offset + 225, $insp_cmpl_gi_amt, value);
	}

	/**
	 * Inspection completed GI amount 検査完了出庫金額.<p>
	 *
	 */
	public void insp_cmpl_gi_amt(float value) {
		setConstNumber(offset + 225, $insp_cmpl_gi_amt, value);
	}

	/**
	 * Inspection completed GI amount 検査完了出庫金額.<p>
	 *
	 */
	public void insp_cmpl_gi_amt(double value) {
		setConstNumber(offset + 225, $insp_cmpl_gi_amt, value);
	}


	/**
	 * Inspection decision GI amount 検査判定出庫金額.<p>
	 *
	 */
	public MCNumber insp_judg_gi_amt() {
		return getConstNumber(offset + 226, $insp_judg_gi_amt);
	}

	/**
	 * Inspection decision GI amount 検査判定出庫金額.<p>
	 *
	 */
	public void insp_judg_gi_amt(MCNumber value) {
		setConstNumber(offset + 226, $insp_judg_gi_amt, value);
	}

	/**
	 * Inspection decision GI amount 検査判定出庫金額.<p>
	 *
	 */
	public void insp_judg_gi_amt(int value) {
		setConstNumber(offset + 226, $insp_judg_gi_amt, value);
	}

	/**
	 * Inspection decision GI amount 検査判定出庫金額.<p>
	 *
	 */
	public void insp_judg_gi_amt(long value) {
		setConstNumber(offset + 226, $insp_judg_gi_amt, value);
	}

	/**
	 * Inspection decision GI amount 検査判定出庫金額.<p>
	 *
	 */
	public void insp_judg_gi_amt(float value) {
		setConstNumber(offset + 226, $insp_judg_gi_amt, value);
	}

	/**
	 * Inspection decision GI amount 検査判定出庫金額.<p>
	 *
	 */
	public void insp_judg_gi_amt(double value) {
		setConstNumber(offset + 226, $insp_judg_gi_amt, value);
	}


	/**
	 * Re-inspection GI amount 再検査出庫金額.<p>
	 *
	 */
	public MCNumber reinsp_gi_amt() {
		return getConstNumber(offset + 227, $reinsp_gi_amt);
	}

	/**
	 * Re-inspection GI amount 再検査出庫金額.<p>
	 *
	 */
	public void reinsp_gi_amt(MCNumber value) {
		setConstNumber(offset + 227, $reinsp_gi_amt, value);
	}

	/**
	 * Re-inspection GI amount 再検査出庫金額.<p>
	 *
	 */
	public void reinsp_gi_amt(int value) {
		setConstNumber(offset + 227, $reinsp_gi_amt, value);
	}

	/**
	 * Re-inspection GI amount 再検査出庫金額.<p>
	 *
	 */
	public void reinsp_gi_amt(long value) {
		setConstNumber(offset + 227, $reinsp_gi_amt, value);
	}

	/**
	 * Re-inspection GI amount 再検査出庫金額.<p>
	 *
	 */
	public void reinsp_gi_amt(float value) {
		setConstNumber(offset + 227, $reinsp_gi_amt, value);
	}

	/**
	 * Re-inspection GI amount 再検査出庫金額.<p>
	 *
	 */
	public void reinsp_gi_amt(double value) {
		setConstNumber(offset + 227, $reinsp_gi_amt, value);
	}


	/**
	 * Sampling amount 検査抜取金額.<p>
	 *
	 */
	public MCNumber insp_smpl_gi_amt() {
		return getConstNumber(offset + 228, $insp_smpl_gi_amt);
	}

	/**
	 * Sampling amount 検査抜取金額.<p>
	 *
	 */
	public void insp_smpl_gi_amt(MCNumber value) {
		setConstNumber(offset + 228, $insp_smpl_gi_amt, value);
	}

	/**
	 * Sampling amount 検査抜取金額.<p>
	 *
	 */
	public void insp_smpl_gi_amt(int value) {
		setConstNumber(offset + 228, $insp_smpl_gi_amt, value);
	}

	/**
	 * Sampling amount 検査抜取金額.<p>
	 *
	 */
	public void insp_smpl_gi_amt(long value) {
		setConstNumber(offset + 228, $insp_smpl_gi_amt, value);
	}

	/**
	 * Sampling amount 検査抜取金額.<p>
	 *
	 */
	public void insp_smpl_gi_amt(float value) {
		setConstNumber(offset + 228, $insp_smpl_gi_amt, value);
	}

	/**
	 * Sampling amount 検査抜取金額.<p>
	 *
	 */
	public void insp_smpl_gi_amt(double value) {
		setConstNumber(offset + 228, $insp_smpl_gi_amt, value);
	}


	/**
	 * Inventory count variance amount (GI) 棚卸差異減耗金額.<p>
	 *
	 */
	public MCNumber stk_adjst_gi_amt() {
		return getConstNumber(offset + 229, $stk_adjst_gi_amt);
	}

	/**
	 * Inventory count variance amount (GI) 棚卸差異減耗金額.<p>
	 *
	 */
	public void stk_adjst_gi_amt(MCNumber value) {
		setConstNumber(offset + 229, $stk_adjst_gi_amt, value);
	}

	/**
	 * Inventory count variance amount (GI) 棚卸差異減耗金額.<p>
	 *
	 */
	public void stk_adjst_gi_amt(int value) {
		setConstNumber(offset + 229, $stk_adjst_gi_amt, value);
	}

	/**
	 * Inventory count variance amount (GI) 棚卸差異減耗金額.<p>
	 *
	 */
	public void stk_adjst_gi_amt(long value) {
		setConstNumber(offset + 229, $stk_adjst_gi_amt, value);
	}

	/**
	 * Inventory count variance amount (GI) 棚卸差異減耗金額.<p>
	 *
	 */
	public void stk_adjst_gi_amt(float value) {
		setConstNumber(offset + 229, $stk_adjst_gi_amt, value);
	}

	/**
	 * Inventory count variance amount (GI) 棚卸差異減耗金額.<p>
	 *
	 */
	public void stk_adjst_gi_amt(double value) {
		setConstNumber(offset + 229, $stk_adjst_gi_amt, value);
	}


	/**
	 * Warehousing GI amount 倉入出庫金額.<p>
	 *
	 */
	public MCNumber prdct_wh_gi_amt() {
		return getConstNumber(offset + 230, $prdct_wh_gi_amt);
	}

	/**
	 * Warehousing GI amount 倉入出庫金額.<p>
	 *
	 */
	public void prdct_wh_gi_amt(MCNumber value) {
		setConstNumber(offset + 230, $prdct_wh_gi_amt, value);
	}

	/**
	 * Warehousing GI amount 倉入出庫金額.<p>
	 *
	 */
	public void prdct_wh_gi_amt(int value) {
		setConstNumber(offset + 230, $prdct_wh_gi_amt, value);
	}

	/**
	 * Warehousing GI amount 倉入出庫金額.<p>
	 *
	 */
	public void prdct_wh_gi_amt(long value) {
		setConstNumber(offset + 230, $prdct_wh_gi_amt, value);
	}

	/**
	 * Warehousing GI amount 倉入出庫金額.<p>
	 *
	 */
	public void prdct_wh_gi_amt(float value) {
		setConstNumber(offset + 230, $prdct_wh_gi_amt, value);
	}

	/**
	 * Warehousing GI amount 倉入出庫金額.<p>
	 *
	 */
	public void prdct_wh_gi_amt(double value) {
		setConstNumber(offset + 230, $prdct_wh_gi_amt, value);
	}


	/**
	 * GI returning amount 戻入出庫金額.<p>
	 *
	 */
	public MCNumber prdct_wh_rtn_gi_amt() {
		return getConstNumber(offset + 231, $prdct_wh_rtn_gi_amt);
	}

	/**
	 * GI returning amount 戻入出庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_amt(MCNumber value) {
		setConstNumber(offset + 231, $prdct_wh_rtn_gi_amt, value);
	}

	/**
	 * GI returning amount 戻入出庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_amt(int value) {
		setConstNumber(offset + 231, $prdct_wh_rtn_gi_amt, value);
	}

	/**
	 * GI returning amount 戻入出庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_amt(long value) {
		setConstNumber(offset + 231, $prdct_wh_rtn_gi_amt, value);
	}

	/**
	 * GI returning amount 戻入出庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_amt(float value) {
		setConstNumber(offset + 231, $prdct_wh_rtn_gi_amt, value);
	}

	/**
	 * GI returning amount 戻入出庫金額.<p>
	 *
	 */
	public void prdct_wh_rtn_gi_amt(double value) {
		setConstNumber(offset + 231, $prdct_wh_rtn_gi_amt, value);
	}


	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public MCNumber xfr_gi_amt() {
		return getConstNumber(offset + 232, $xfr_gi_amt);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void xfr_gi_amt(MCNumber value) {
		setConstNumber(offset + 232, $xfr_gi_amt, value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void xfr_gi_amt(int value) {
		setConstNumber(offset + 232, $xfr_gi_amt, value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void xfr_gi_amt(long value) {
		setConstNumber(offset + 232, $xfr_gi_amt, value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void xfr_gi_amt(float value) {
		setConstNumber(offset + 232, $xfr_gi_amt, value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void xfr_gi_amt(double value) {
		setConstNumber(offset + 232, $xfr_gi_amt, value);
	}


	/**
	 * Move-out amount 転出金額.<p>
	 *
	 */
	public MCNumber xfr_out_amt() {
		return getConstNumber(offset + 233, $xfr_out_amt);
	}

	/**
	 * Move-out amount 転出金額.<p>
	 *
	 */
	public void xfr_out_amt(MCNumber value) {
		setConstNumber(offset + 233, $xfr_out_amt, value);
	}

	/**
	 * Move-out amount 転出金額.<p>
	 *
	 */
	public void xfr_out_amt(int value) {
		setConstNumber(offset + 233, $xfr_out_amt, value);
	}

	/**
	 * Move-out amount 転出金額.<p>
	 *
	 */
	public void xfr_out_amt(long value) {
		setConstNumber(offset + 233, $xfr_out_amt, value);
	}

	/**
	 * Move-out amount 転出金額.<p>
	 *
	 */
	public void xfr_out_amt(float value) {
		setConstNumber(offset + 233, $xfr_out_amt, value);
	}

	/**
	 * Move-out amount 転出金額.<p>
	 *
	 */
	public void xfr_out_amt(double value) {
		setConstNumber(offset + 233, $xfr_out_amt, value);
	}


	/**
	 * Purchase move-out amount 仕入転出金額.<p>
	 *
	 */
	public MCNumber purc_xfr_out_amt() {
		return getConstNumber(offset + 234, $purc_xfr_out_amt);
	}

	/**
	 * Purchase move-out amount 仕入転出金額.<p>
	 *
	 */
	public void purc_xfr_out_amt(MCNumber value) {
		setConstNumber(offset + 234, $purc_xfr_out_amt, value);
	}

	/**
	 * Purchase move-out amount 仕入転出金額.<p>
	 *
	 */
	public void purc_xfr_out_amt(int value) {
		setConstNumber(offset + 234, $purc_xfr_out_amt, value);
	}

	/**
	 * Purchase move-out amount 仕入転出金額.<p>
	 *
	 */
	public void purc_xfr_out_amt(long value) {
		setConstNumber(offset + 234, $purc_xfr_out_amt, value);
	}

	/**
	 * Purchase move-out amount 仕入転出金額.<p>
	 *
	 */
	public void purc_xfr_out_amt(float value) {
		setConstNumber(offset + 234, $purc_xfr_out_amt, value);
	}

	/**
	 * Purchase move-out amount 仕入転出金額.<p>
	 *
	 */
	public void purc_xfr_out_amt(double value) {
		setConstNumber(offset + 234, $purc_xfr_out_amt, value);
	}


	/**
	 * Movement/transport return GI amount 移動・移送返品出庫金額.<p>
	 *
	 */
	public MCNumber xfr_rtn_gi_amt() {
		return getConstNumber(offset + 235, $xfr_rtn_gi_amt);
	}

	/**
	 * Movement/transport return GI amount 移動・移送返品出庫金額.<p>
	 *
	 */
	public void xfr_rtn_gi_amt(MCNumber value) {
		setConstNumber(offset + 235, $xfr_rtn_gi_amt, value);
	}

	/**
	 * Movement/transport return GI amount 移動・移送返品出庫金額.<p>
	 *
	 */
	public void xfr_rtn_gi_amt(int value) {
		setConstNumber(offset + 235, $xfr_rtn_gi_amt, value);
	}

	/**
	 * Movement/transport return GI amount 移動・移送返品出庫金額.<p>
	 *
	 */
	public void xfr_rtn_gi_amt(long value) {
		setConstNumber(offset + 235, $xfr_rtn_gi_amt, value);
	}

	/**
	 * Movement/transport return GI amount 移動・移送返品出庫金額.<p>
	 *
	 */
	public void xfr_rtn_gi_amt(float value) {
		setConstNumber(offset + 235, $xfr_rtn_gi_amt, value);
	}

	/**
	 * Movement/transport return GI amount 移動・移送返品出庫金額.<p>
	 *
	 */
	public void xfr_rtn_gi_amt(double value) {
		setConstNumber(offset + 235, $xfr_rtn_gi_amt, value);
	}


	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public MCNumber acxfr_gi_amt() {
		return getConstNumber(offset + 236, $acxfr_gi_amt);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void acxfr_gi_amt(MCNumber value) {
		setConstNumber(offset + 236, $acxfr_gi_amt, value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void acxfr_gi_amt(int value) {
		setConstNumber(offset + 236, $acxfr_gi_amt, value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void acxfr_gi_amt(long value) {
		setConstNumber(offset + 236, $acxfr_gi_amt, value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void acxfr_gi_amt(float value) {
		setConstNumber(offset + 236, $acxfr_gi_amt, value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void acxfr_gi_amt(double value) {
		setConstNumber(offset + 236, $acxfr_gi_amt, value);
	}


	/**
	 * Disposal amount 廃棄金額.<p>
	 *
	 */
	public MCNumber scrp_amt() {
		return getConstNumber(offset + 237, $scrp_amt);
	}

	/**
	 * Disposal amount 廃棄金額.<p>
	 *
	 */
	public void scrp_amt(MCNumber value) {
		setConstNumber(offset + 237, $scrp_amt, value);
	}

	/**
	 * Disposal amount 廃棄金額.<p>
	 *
	 */
	public void scrp_amt(int value) {
		setConstNumber(offset + 237, $scrp_amt, value);
	}

	/**
	 * Disposal amount 廃棄金額.<p>
	 *
	 */
	public void scrp_amt(long value) {
		setConstNumber(offset + 237, $scrp_amt, value);
	}

	/**
	 * Disposal amount 廃棄金額.<p>
	 *
	 */
	public void scrp_amt(float value) {
		setConstNumber(offset + 237, $scrp_amt, value);
	}

	/**
	 * Disposal amount 廃棄金額.<p>
	 *
	 */
	public void scrp_amt(double value) {
		setConstNumber(offset + 237, $scrp_amt, value);
	}


	/**
	 * Item transfer GI amount 品目振替出庫金額.<p>
	 *
	 */
	public MCNumber xfr_itm_gi_amt() {
		return getConstNumber(offset + 238, $xfr_itm_gi_amt);
	}

	/**
	 * Item transfer GI amount 品目振替出庫金額.<p>
	 *
	 */
	public void xfr_itm_gi_amt(MCNumber value) {
		setConstNumber(offset + 238, $xfr_itm_gi_amt, value);
	}

	/**
	 * Item transfer GI amount 品目振替出庫金額.<p>
	 *
	 */
	public void xfr_itm_gi_amt(int value) {
		setConstNumber(offset + 238, $xfr_itm_gi_amt, value);
	}

	/**
	 * Item transfer GI amount 品目振替出庫金額.<p>
	 *
	 */
	public void xfr_itm_gi_amt(long value) {
		setConstNumber(offset + 238, $xfr_itm_gi_amt, value);
	}

	/**
	 * Item transfer GI amount 品目振替出庫金額.<p>
	 *
	 */
	public void xfr_itm_gi_amt(float value) {
		setConstNumber(offset + 238, $xfr_itm_gi_amt, value);
	}

	/**
	 * Item transfer GI amount 品目振替出庫金額.<p>
	 *
	 */
	public void xfr_itm_gi_amt(double value) {
		setConstNumber(offset + 238, $xfr_itm_gi_amt, value);
	}


	/**
	 * Lot/SEIBAN No. transfer GI amount ロット・手配ＮＯ振替出庫金額.<p>
	 *
	 */
	public MCNumber xfr_lot_sno_gi_amt() {
		return getConstNumber(offset + 239, $xfr_lot_sno_gi_amt);
	}

	/**
	 * Lot/SEIBAN No. transfer GI amount ロット・手配ＮＯ振替出庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gi_amt(MCNumber value) {
		setConstNumber(offset + 239, $xfr_lot_sno_gi_amt, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI amount ロット・手配ＮＯ振替出庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gi_amt(int value) {
		setConstNumber(offset + 239, $xfr_lot_sno_gi_amt, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI amount ロット・手配ＮＯ振替出庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gi_amt(long value) {
		setConstNumber(offset + 239, $xfr_lot_sno_gi_amt, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI amount ロット・手配ＮＯ振替出庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gi_amt(float value) {
		setConstNumber(offset + 239, $xfr_lot_sno_gi_amt, value);
	}

	/**
	 * Lot/SEIBAN No. transfer GI amount ロット・手配ＮＯ振替出庫金額.<p>
	 *
	 */
	public void xfr_lot_sno_gi_amt(double value) {
		setConstNumber(offset + 239, $xfr_lot_sno_gi_amt, value);
	}


	/**
	 * GI amount (Grading/conforming type transfer) 格付・良品区分振替出庫金額.<p>
	 *
	 */
	public MCNumber xfr_grd_gi_amt() {
		return getConstNumber(offset + 240, $xfr_grd_gi_amt);
	}

	/**
	 * GI amount (Grading/conforming type transfer) 格付・良品区分振替出庫金額.<p>
	 *
	 */
	public void xfr_grd_gi_amt(MCNumber value) {
		setConstNumber(offset + 240, $xfr_grd_gi_amt, value);
	}

	/**
	 * GI amount (Grading/conforming type transfer) 格付・良品区分振替出庫金額.<p>
	 *
	 */
	public void xfr_grd_gi_amt(int value) {
		setConstNumber(offset + 240, $xfr_grd_gi_amt, value);
	}

	/**
	 * GI amount (Grading/conforming type transfer) 格付・良品区分振替出庫金額.<p>
	 *
	 */
	public void xfr_grd_gi_amt(long value) {
		setConstNumber(offset + 240, $xfr_grd_gi_amt, value);
	}

	/**
	 * GI amount (Grading/conforming type transfer) 格付・良品区分振替出庫金額.<p>
	 *
	 */
	public void xfr_grd_gi_amt(float value) {
		setConstNumber(offset + 240, $xfr_grd_gi_amt, value);
	}

	/**
	 * GI amount (Grading/conforming type transfer) 格付・良品区分振替出庫金額.<p>
	 *
	 */
	public void xfr_grd_gi_amt(double value) {
		setConstNumber(offset + 240, $xfr_grd_gi_amt, value);
	}


	/**
	 * SKU transfer GI amount 荷姿振替出庫金額.<p>
	 *
	 */
	public MCNumber xfr_pack_gi_amt() {
		return getConstNumber(offset + 241, $xfr_pack_gi_amt);
	}

	/**
	 * SKU transfer GI amount 荷姿振替出庫金額.<p>
	 *
	 */
	public void xfr_pack_gi_amt(MCNumber value) {
		setConstNumber(offset + 241, $xfr_pack_gi_amt, value);
	}

	/**
	 * SKU transfer GI amount 荷姿振替出庫金額.<p>
	 *
	 */
	public void xfr_pack_gi_amt(int value) {
		setConstNumber(offset + 241, $xfr_pack_gi_amt, value);
	}

	/**
	 * SKU transfer GI amount 荷姿振替出庫金額.<p>
	 *
	 */
	public void xfr_pack_gi_amt(long value) {
		setConstNumber(offset + 241, $xfr_pack_gi_amt, value);
	}

	/**
	 * SKU transfer GI amount 荷姿振替出庫金額.<p>
	 *
	 */
	public void xfr_pack_gi_amt(float value) {
		setConstNumber(offset + 241, $xfr_pack_gi_amt, value);
	}

	/**
	 * SKU transfer GI amount 荷姿振替出庫金額.<p>
	 *
	 */
	public void xfr_pack_gi_amt(double value) {
		setConstNumber(offset + 241, $xfr_pack_gi_amt, value);
	}


	/**
	 * Shipping amount 出荷金額.<p>
	 *
	 */
	public MCNumber ship_out_amt() {
		return getConstNumber(offset + 242, $ship_out_amt);
	}

	/**
	 * Shipping amount 出荷金額.<p>
	 *
	 */
	public void ship_out_amt(MCNumber value) {
		setConstNumber(offset + 242, $ship_out_amt, value);
	}

	/**
	 * Shipping amount 出荷金額.<p>
	 *
	 */
	public void ship_out_amt(int value) {
		setConstNumber(offset + 242, $ship_out_amt, value);
	}

	/**
	 * Shipping amount 出荷金額.<p>
	 *
	 */
	public void ship_out_amt(long value) {
		setConstNumber(offset + 242, $ship_out_amt, value);
	}

	/**
	 * Shipping amount 出荷金額.<p>
	 *
	 */
	public void ship_out_amt(float value) {
		setConstNumber(offset + 242, $ship_out_amt, value);
	}

	/**
	 * Shipping amount 出荷金額.<p>
	 *
	 */
	public void ship_out_amt(double value) {
		setConstNumber(offset + 242, $ship_out_amt, value);
	}


	/**
	 * Export shipping amount 輸出出荷金額.<p>
	 *
	 */
	public MCNumber ex_ship_out_amt() {
		return getConstNumber(offset + 243, $ex_ship_out_amt);
	}

	/**
	 * Export shipping amount 輸出出荷金額.<p>
	 *
	 */
	public void ex_ship_out_amt(MCNumber value) {
		setConstNumber(offset + 243, $ex_ship_out_amt, value);
	}

	/**
	 * Export shipping amount 輸出出荷金額.<p>
	 *
	 */
	public void ex_ship_out_amt(int value) {
		setConstNumber(offset + 243, $ex_ship_out_amt, value);
	}

	/**
	 * Export shipping amount 輸出出荷金額.<p>
	 *
	 */
	public void ex_ship_out_amt(long value) {
		setConstNumber(offset + 243, $ex_ship_out_amt, value);
	}

	/**
	 * Export shipping amount 輸出出荷金額.<p>
	 *
	 */
	public void ex_ship_out_amt(float value) {
		setConstNumber(offset + 243, $ex_ship_out_amt, value);
	}

	/**
	 * Export shipping amount 輸出出荷金額.<p>
	 *
	 */
	public void ex_ship_out_amt(double value) {
		setConstNumber(offset + 243, $ex_ship_out_amt, value);
	}


	/**
	 * Shipping return GI amount 出荷返品出庫金額.<p>
	 *
	 */
	public MCNumber ship_rtn_gi_amt() {
		return getConstNumber(offset + 244, $ship_rtn_gi_amt);
	}

	/**
	 * Shipping return GI amount 出荷返品出庫金額.<p>
	 *
	 */
	public void ship_rtn_gi_amt(MCNumber value) {
		setConstNumber(offset + 244, $ship_rtn_gi_amt, value);
	}

	/**
	 * Shipping return GI amount 出荷返品出庫金額.<p>
	 *
	 */
	public void ship_rtn_gi_amt(int value) {
		setConstNumber(offset + 244, $ship_rtn_gi_amt, value);
	}

	/**
	 * Shipping return GI amount 出荷返品出庫金額.<p>
	 *
	 */
	public void ship_rtn_gi_amt(long value) {
		setConstNumber(offset + 244, $ship_rtn_gi_amt, value);
	}

	/**
	 * Shipping return GI amount 出荷返品出庫金額.<p>
	 *
	 */
	public void ship_rtn_gi_amt(float value) {
		setConstNumber(offset + 244, $ship_rtn_gi_amt, value);
	}

	/**
	 * Shipping return GI amount 出荷返品出庫金額.<p>
	 *
	 */
	public void ship_rtn_gi_amt(double value) {
		setConstNumber(offset + 244, $ship_rtn_gi_amt, value);
	}


	/**
	 * Sales return GI amount 売上返品出庫金額.<p>
	 *
	 */
	public MCNumber sls_rtn_gi_amt() {
		return getConstNumber(offset + 245, $sls_rtn_gi_amt);
	}

	/**
	 * Sales return GI amount 売上返品出庫金額.<p>
	 *
	 */
	public void sls_rtn_gi_amt(MCNumber value) {
		setConstNumber(offset + 245, $sls_rtn_gi_amt, value);
	}

	/**
	 * Sales return GI amount 売上返品出庫金額.<p>
	 *
	 */
	public void sls_rtn_gi_amt(int value) {
		setConstNumber(offset + 245, $sls_rtn_gi_amt, value);
	}

	/**
	 * Sales return GI amount 売上返品出庫金額.<p>
	 *
	 */
	public void sls_rtn_gi_amt(long value) {
		setConstNumber(offset + 245, $sls_rtn_gi_amt, value);
	}

	/**
	 * Sales return GI amount 売上返品出庫金額.<p>
	 *
	 */
	public void sls_rtn_gi_amt(float value) {
		setConstNumber(offset + 245, $sls_rtn_gi_amt, value);
	}

	/**
	 * Sales return GI amount 売上返品出庫金額.<p>
	 *
	 */
	public void sls_rtn_gi_amt(double value) {
		setConstNumber(offset + 245, $sls_rtn_gi_amt, value);
	}


	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 246, $sls_amt);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 246, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 246, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 246, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 246, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 246, $sls_amt, value);
	}


	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public MCNumber end_stk_amt() {
		return getConstNumber(offset + 247, $end_stk_amt);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(MCNumber value) {
		setConstNumber(offset + 247, $end_stk_amt, value);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(int value) {
		setConstNumber(offset + 247, $end_stk_amt, value);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(long value) {
		setConstNumber(offset + 247, $end_stk_amt, value);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(float value) {
		setConstNumber(offset + 247, $end_stk_amt, value);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(double value) {
		setConstNumber(offset + 247, $end_stk_amt, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			return pack_unit_rnd_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($base_cur_rnd_typ.equalsIgnoreCase(name)) {
			return base_cur_rnd_typ();
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
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			return stk_amt();
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			return base_cur_dec_place();
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			return std_unit_cost();
		}
		if ($ini_stk_qty.equalsIgnoreCase(name)) {
			return ini_stk_qty();
		}
		if ($gr_total_qty.equalsIgnoreCase(name)) {
			return gr_total_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		if ($purc_gr_qty.equalsIgnoreCase(name)) {
			return purc_gr_qty();
		}
		if ($onr_rcv_gr_qty.equalsIgnoreCase(name)) {
			return onr_rcv_gr_qty();
		}
		if ($purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			return purc_rtn_gr_qty();
		}
		if ($onr_rcv_ret_gr_qty.equalsIgnoreCase(name)) {
			return onr_rcv_ret_gr_qty();
		}
		if ($xpns_purc_gr_qty.equalsIgnoreCase(name)) {
			return xpns_purc_gr_qty();
		}
		if ($xpns_purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			return xpns_purc_rtn_gr_qty();
		}
		if ($accpt_dfct_gr_qty.equalsIgnoreCase(name)) {
			return accpt_dfct_gr_qty();
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			return mfg_qty();
		}
		if ($bymfg_qty.equalsIgnoreCase(name)) {
			return bymfg_qty();
		}
		if ($ffr_prov_gr_qty.equalsIgnoreCase(name)) {
			return ffr_prov_gr_qty();
		}
		if ($onr_prov_gr_qty.equalsIgnoreCase(name)) {
			return onr_prov_gr_qty();
		}
		if ($ffr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			return ffr_prov_rtn_gr_qty();
		}
		if ($onr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			return onr_prov_rtn_gr_qty();
		}
		if ($insp_gr_qty.equalsIgnoreCase(name)) {
			return insp_gr_qty();
		}
		if ($insp_cmpl_gr_qty.equalsIgnoreCase(name)) {
			return insp_cmpl_gr_qty();
		}
		if ($insp_judg_gr_qty.equalsIgnoreCase(name)) {
			return insp_judg_gr_qty();
		}
		if ($reinsp_gr_qty.equalsIgnoreCase(name)) {
			return reinsp_gr_qty();
		}
		if ($stk_adjst_gr_qty.equalsIgnoreCase(name)) {
			return stk_adjst_gr_qty();
		}
		if ($prdct_wh_gr_qty.equalsIgnoreCase(name)) {
			return prdct_wh_gr_qty();
		}
		if ($prdct_wh_rtn_gr_qty.equalsIgnoreCase(name)) {
			return prdct_wh_rtn_gr_qty();
		}
		if ($xfr_gr_qty.equalsIgnoreCase(name)) {
			return xfr_gr_qty();
		}
		if ($xfr_in_qty.equalsIgnoreCase(name)) {
			return xfr_in_qty();
		}
		if ($purc_xfr_in_qty.equalsIgnoreCase(name)) {
			return purc_xfr_in_qty();
		}
		if ($xfr_rtn_gr_qty.equalsIgnoreCase(name)) {
			return xfr_rtn_gr_qty();
		}
		if ($acxfr_gr_qty.equalsIgnoreCase(name)) {
			return acxfr_gr_qty();
		}
		if ($arr_cststk_qty.equalsIgnoreCase(name)) {
			return arr_cststk_qty();
		}
		if ($xfr_itm_gr_qty.equalsIgnoreCase(name)) {
			return xfr_itm_gr_qty();
		}
		if ($xfr_lot_sno_gr_qty.equalsIgnoreCase(name)) {
			return xfr_lot_sno_gr_qty();
		}
		if ($xfr_grd_gr_qty.equalsIgnoreCase(name)) {
			return xfr_grd_gr_qty();
		}
		if ($xfr_pack_gr_qty.equalsIgnoreCase(name)) {
			return xfr_pack_gr_qty();
		}
		if ($ship_in_qty.equalsIgnoreCase(name)) {
			return ship_in_qty();
		}
		if ($ex_ship_in_qty.equalsIgnoreCase(name)) {
			return ex_ship_in_qty();
		}
		if ($ship_rtn_gr_qty.equalsIgnoreCase(name)) {
			return ship_rtn_gr_qty();
		}
		if ($sls_rtn_gr_qty.equalsIgnoreCase(name)) {
			return sls_rtn_gr_qty();
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			return gi_total_qty();
		}
		if ($arr_rtn_qty.equalsIgnoreCase(name)) {
			return arr_rtn_qty();
		}
		if ($purc_gi_qty.equalsIgnoreCase(name)) {
			return purc_gi_qty();
		}
		if ($onr_rcv_gi_qty.equalsIgnoreCase(name)) {
			return onr_rcv_gi_qty();
		}
		if ($purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			return purc_rtn_gi_qty();
		}
		if ($onr_rcv_ret_gi_qty.equalsIgnoreCase(name)) {
			return onr_rcv_ret_gi_qty();
		}
		if ($xpns_purc_gi_qty.equalsIgnoreCase(name)) {
			return xpns_purc_gi_qty();
		}
		if ($xpns_purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			return xpns_purc_rtn_gi_qty();
		}
		if ($accpt_dfct_gi_qty.equalsIgnoreCase(name)) {
			return accpt_dfct_gi_qty();
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			return inpt_qty();
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			return loss_qty();
		}
		if ($ffr_prov_gi_qty.equalsIgnoreCase(name)) {
			return ffr_prov_gi_qty();
		}
		if ($onr_prov_gi_qty.equalsIgnoreCase(name)) {
			return onr_prov_gi_qty();
		}
		if ($ffr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			return ffr_prov_rtn_gi_qty();
		}
		if ($onr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			return onr_prov_rtn_gi_qty();
		}
		if ($insp_gi_qty.equalsIgnoreCase(name)) {
			return insp_gi_qty();
		}
		if ($insp_cmpl_gi_qty.equalsIgnoreCase(name)) {
			return insp_cmpl_gi_qty();
		}
		if ($insp_judg_gi_qty.equalsIgnoreCase(name)) {
			return insp_judg_gi_qty();
		}
		if ($reinsp_gi_qty.equalsIgnoreCase(name)) {
			return reinsp_gi_qty();
		}
		if ($insp_smpl_gi_qty.equalsIgnoreCase(name)) {
			return insp_smpl_gi_qty();
		}
		if ($stk_adjst_gi_qty.equalsIgnoreCase(name)) {
			return stk_adjst_gi_qty();
		}
		if ($prdct_wh_gi_qty.equalsIgnoreCase(name)) {
			return prdct_wh_gi_qty();
		}
		if ($prdct_wh_rtn_gi_qty.equalsIgnoreCase(name)) {
			return prdct_wh_rtn_gi_qty();
		}
		if ($xfr_gi_qty.equalsIgnoreCase(name)) {
			return xfr_gi_qty();
		}
		if ($xfr_out_qty.equalsIgnoreCase(name)) {
			return xfr_out_qty();
		}
		if ($purc_xfr_out_qty.equalsIgnoreCase(name)) {
			return purc_xfr_out_qty();
		}
		if ($xfr_rtn_gi_qty.equalsIgnoreCase(name)) {
			return xfr_rtn_gi_qty();
		}
		if ($acxfr_gi_qty.equalsIgnoreCase(name)) {
			return acxfr_gi_qty();
		}
		if ($scrp_qty.equalsIgnoreCase(name)) {
			return scrp_qty();
		}
		if ($xfr_itm_gi_qty.equalsIgnoreCase(name)) {
			return xfr_itm_gi_qty();
		}
		if ($xfr_lot_sno_gi_qty.equalsIgnoreCase(name)) {
			return xfr_lot_sno_gi_qty();
		}
		if ($xfr_grd_gi_qty.equalsIgnoreCase(name)) {
			return xfr_grd_gi_qty();
		}
		if ($xfr_pack_gi_qty.equalsIgnoreCase(name)) {
			return xfr_pack_gi_qty();
		}
		if ($ship_out_qty.equalsIgnoreCase(name)) {
			return ship_out_qty();
		}
		if ($ex_ship_out_qty.equalsIgnoreCase(name)) {
			return ex_ship_out_qty();
		}
		if ($ship_rtn_gi_qty.equalsIgnoreCase(name)) {
			return ship_rtn_gi_qty();
		}
		if ($sls_rtn_gi_qty.equalsIgnoreCase(name)) {
			return sls_rtn_gi_qty();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			return end_stk_qty();
		}
		if ($ini_stk_amt.equalsIgnoreCase(name)) {
			return ini_stk_amt();
		}
		if ($gr_total_amt.equalsIgnoreCase(name)) {
			return gr_total_amt();
		}
		if ($arr_amt.equalsIgnoreCase(name)) {
			return arr_amt();
		}
		if ($purc_gr_amt.equalsIgnoreCase(name)) {
			return purc_gr_amt();
		}
		if ($onr_rcv_gr_amt.equalsIgnoreCase(name)) {
			return onr_rcv_gr_amt();
		}
		if ($purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			return purc_rtn_gr_amt();
		}
		if ($onr_rcv_ret_gr_amt.equalsIgnoreCase(name)) {
			return onr_rcv_ret_gr_amt();
		}
		if ($xpns_purc_gr_amt.equalsIgnoreCase(name)) {
			return xpns_purc_gr_amt();
		}
		if ($xpns_purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			return xpns_purc_rtn_gr_amt();
		}
		if ($accpt_dfct_gr_amt.equalsIgnoreCase(name)) {
			return accpt_dfct_gr_amt();
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			return mfg_amt();
		}
		if ($bymfg_amt.equalsIgnoreCase(name)) {
			return bymfg_amt();
		}
		if ($ffr_prov_gr_amt.equalsIgnoreCase(name)) {
			return ffr_prov_gr_amt();
		}
		if ($onr_prov_gr_amt.equalsIgnoreCase(name)) {
			return onr_prov_gr_amt();
		}
		if ($ffr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			return ffr_prov_rtn_gr_amt();
		}
		if ($onr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			return onr_prov_rtn_gr_amt();
		}
		if ($insp_gr_amt.equalsIgnoreCase(name)) {
			return insp_gr_amt();
		}
		if ($insp_cmpl_gr_amt.equalsIgnoreCase(name)) {
			return insp_cmpl_gr_amt();
		}
		if ($insp_judg_gr_amt.equalsIgnoreCase(name)) {
			return insp_judg_gr_amt();
		}
		if ($reinsp_gr_amt.equalsIgnoreCase(name)) {
			return reinsp_gr_amt();
		}
		if ($stk_adjst_gr_amt.equalsIgnoreCase(name)) {
			return stk_adjst_gr_amt();
		}
		if ($prdct_wh_gr_amt.equalsIgnoreCase(name)) {
			return prdct_wh_gr_amt();
		}
		if ($prdct_wh_rtn_gr_amt.equalsIgnoreCase(name)) {
			return prdct_wh_rtn_gr_amt();
		}
		if ($xfr_gr_amt.equalsIgnoreCase(name)) {
			return xfr_gr_amt();
		}
		if ($xfr_in_amt.equalsIgnoreCase(name)) {
			return xfr_in_amt();
		}
		if ($purc_xfr_in_amt.equalsIgnoreCase(name)) {
			return purc_xfr_in_amt();
		}
		if ($xfr_rtn_gr_amt.equalsIgnoreCase(name)) {
			return xfr_rtn_gr_amt();
		}
		if ($acxfr_gr_amt.equalsIgnoreCase(name)) {
			return acxfr_gr_amt();
		}
		if ($arr_cststk_amt.equalsIgnoreCase(name)) {
			return arr_cststk_amt();
		}
		if ($xfr_itm_gr_amt.equalsIgnoreCase(name)) {
			return xfr_itm_gr_amt();
		}
		if ($xfr_lot_sno_gr_amt.equalsIgnoreCase(name)) {
			return xfr_lot_sno_gr_amt();
		}
		if ($xfr_grd_gr_amt.equalsIgnoreCase(name)) {
			return xfr_grd_gr_amt();
		}
		if ($xfr_pack_gr_amt.equalsIgnoreCase(name)) {
			return xfr_pack_gr_amt();
		}
		if ($ship_in_amt.equalsIgnoreCase(name)) {
			return ship_in_amt();
		}
		if ($ex_ship_in_amt.equalsIgnoreCase(name)) {
			return ex_ship_in_amt();
		}
		if ($ship_rtn_gr_amt.equalsIgnoreCase(name)) {
			return ship_rtn_gr_amt();
		}
		if ($sls_rtn_gr_amt.equalsIgnoreCase(name)) {
			return sls_rtn_gr_amt();
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			return gi_total_amt();
		}
		if ($arr_rtn_amt.equalsIgnoreCase(name)) {
			return arr_rtn_amt();
		}
		if ($purc_gi_amt.equalsIgnoreCase(name)) {
			return purc_gi_amt();
		}
		if ($onr_rcv_gi_amt.equalsIgnoreCase(name)) {
			return onr_rcv_gi_amt();
		}
		if ($purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			return purc_rtn_gi_amt();
		}
		if ($onr_rcv_ret_gi_amt.equalsIgnoreCase(name)) {
			return onr_rcv_ret_gi_amt();
		}
		if ($xpns_purc_gi_amt.equalsIgnoreCase(name)) {
			return xpns_purc_gi_amt();
		}
		if ($xpns_purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			return xpns_purc_rtn_gi_amt();
		}
		if ($accpt_dfct_gi_amt.equalsIgnoreCase(name)) {
			return accpt_dfct_gi_amt();
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			return inpt_amt();
		}
		if ($loss_amt.equalsIgnoreCase(name)) {
			return loss_amt();
		}
		if ($ffr_prov_gi_amt.equalsIgnoreCase(name)) {
			return ffr_prov_gi_amt();
		}
		if ($onr_prov_gi_amt.equalsIgnoreCase(name)) {
			return onr_prov_gi_amt();
		}
		if ($ffr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			return ffr_prov_rtn_gi_amt();
		}
		if ($onr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			return onr_prov_rtn_gi_amt();
		}
		if ($insp_gi_amt.equalsIgnoreCase(name)) {
			return insp_gi_amt();
		}
		if ($insp_cmpl_gi_amt.equalsIgnoreCase(name)) {
			return insp_cmpl_gi_amt();
		}
		if ($insp_judg_gi_amt.equalsIgnoreCase(name)) {
			return insp_judg_gi_amt();
		}
		if ($reinsp_gi_amt.equalsIgnoreCase(name)) {
			return reinsp_gi_amt();
		}
		if ($insp_smpl_gi_amt.equalsIgnoreCase(name)) {
			return insp_smpl_gi_amt();
		}
		if ($stk_adjst_gi_amt.equalsIgnoreCase(name)) {
			return stk_adjst_gi_amt();
		}
		if ($prdct_wh_gi_amt.equalsIgnoreCase(name)) {
			return prdct_wh_gi_amt();
		}
		if ($prdct_wh_rtn_gi_amt.equalsIgnoreCase(name)) {
			return prdct_wh_rtn_gi_amt();
		}
		if ($xfr_gi_amt.equalsIgnoreCase(name)) {
			return xfr_gi_amt();
		}
		if ($xfr_out_amt.equalsIgnoreCase(name)) {
			return xfr_out_amt();
		}
		if ($purc_xfr_out_amt.equalsIgnoreCase(name)) {
			return purc_xfr_out_amt();
		}
		if ($xfr_rtn_gi_amt.equalsIgnoreCase(name)) {
			return xfr_rtn_gi_amt();
		}
		if ($acxfr_gi_amt.equalsIgnoreCase(name)) {
			return acxfr_gi_amt();
		}
		if ($scrp_amt.equalsIgnoreCase(name)) {
			return scrp_amt();
		}
		if ($xfr_itm_gi_amt.equalsIgnoreCase(name)) {
			return xfr_itm_gi_amt();
		}
		if ($xfr_lot_sno_gi_amt.equalsIgnoreCase(name)) {
			return xfr_lot_sno_gi_amt();
		}
		if ($xfr_grd_gi_amt.equalsIgnoreCase(name)) {
			return xfr_grd_gi_amt();
		}
		if ($xfr_pack_gi_amt.equalsIgnoreCase(name)) {
			return xfr_pack_gi_amt();
		}
		if ($ship_out_amt.equalsIgnoreCase(name)) {
			return ship_out_amt();
		}
		if ($ex_ship_out_amt.equalsIgnoreCase(name)) {
			return ex_ship_out_amt();
		}
		if ($ship_rtn_gi_amt.equalsIgnoreCase(name)) {
			return ship_rtn_gi_amt();
		}
		if ($sls_rtn_gi_amt.equalsIgnoreCase(name)) {
			return sls_rtn_gi_amt();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			return end_stk_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($mly_io_cl_ym.equalsIgnoreCase(name)) {
			return mly_io_cl_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			return fix_no_typ();
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			return fix_no_typ_nm();
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			return fix_no();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			return pack_unit_rnd_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($base_cur_rnd_typ.equalsIgnoreCase(name)) {
			return base_cur_rnd_typ();
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
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			return stk_amt();
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			return base_cur_dec_place();
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			return std_unit_cost();
		}
		if ($ini_stk_qty.equalsIgnoreCase(name)) {
			return ini_stk_qty();
		}
		if ($gr_total_qty.equalsIgnoreCase(name)) {
			return gr_total_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		if ($purc_gr_qty.equalsIgnoreCase(name)) {
			return purc_gr_qty();
		}
		if ($onr_rcv_gr_qty.equalsIgnoreCase(name)) {
			return onr_rcv_gr_qty();
		}
		if ($purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			return purc_rtn_gr_qty();
		}
		if ($onr_rcv_ret_gr_qty.equalsIgnoreCase(name)) {
			return onr_rcv_ret_gr_qty();
		}
		if ($xpns_purc_gr_qty.equalsIgnoreCase(name)) {
			return xpns_purc_gr_qty();
		}
		if ($xpns_purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			return xpns_purc_rtn_gr_qty();
		}
		if ($accpt_dfct_gr_qty.equalsIgnoreCase(name)) {
			return accpt_dfct_gr_qty();
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			return mfg_qty();
		}
		if ($bymfg_qty.equalsIgnoreCase(name)) {
			return bymfg_qty();
		}
		if ($ffr_prov_gr_qty.equalsIgnoreCase(name)) {
			return ffr_prov_gr_qty();
		}
		if ($onr_prov_gr_qty.equalsIgnoreCase(name)) {
			return onr_prov_gr_qty();
		}
		if ($ffr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			return ffr_prov_rtn_gr_qty();
		}
		if ($onr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			return onr_prov_rtn_gr_qty();
		}
		if ($insp_gr_qty.equalsIgnoreCase(name)) {
			return insp_gr_qty();
		}
		if ($insp_cmpl_gr_qty.equalsIgnoreCase(name)) {
			return insp_cmpl_gr_qty();
		}
		if ($insp_judg_gr_qty.equalsIgnoreCase(name)) {
			return insp_judg_gr_qty();
		}
		if ($reinsp_gr_qty.equalsIgnoreCase(name)) {
			return reinsp_gr_qty();
		}
		if ($stk_adjst_gr_qty.equalsIgnoreCase(name)) {
			return stk_adjst_gr_qty();
		}
		if ($prdct_wh_gr_qty.equalsIgnoreCase(name)) {
			return prdct_wh_gr_qty();
		}
		if ($prdct_wh_rtn_gr_qty.equalsIgnoreCase(name)) {
			return prdct_wh_rtn_gr_qty();
		}
		if ($xfr_gr_qty.equalsIgnoreCase(name)) {
			return xfr_gr_qty();
		}
		if ($xfr_in_qty.equalsIgnoreCase(name)) {
			return xfr_in_qty();
		}
		if ($purc_xfr_in_qty.equalsIgnoreCase(name)) {
			return purc_xfr_in_qty();
		}
		if ($xfr_rtn_gr_qty.equalsIgnoreCase(name)) {
			return xfr_rtn_gr_qty();
		}
		if ($acxfr_gr_qty.equalsIgnoreCase(name)) {
			return acxfr_gr_qty();
		}
		if ($arr_cststk_qty.equalsIgnoreCase(name)) {
			return arr_cststk_qty();
		}
		if ($xfr_itm_gr_qty.equalsIgnoreCase(name)) {
			return xfr_itm_gr_qty();
		}
		if ($xfr_lot_sno_gr_qty.equalsIgnoreCase(name)) {
			return xfr_lot_sno_gr_qty();
		}
		if ($xfr_grd_gr_qty.equalsIgnoreCase(name)) {
			return xfr_grd_gr_qty();
		}
		if ($xfr_pack_gr_qty.equalsIgnoreCase(name)) {
			return xfr_pack_gr_qty();
		}
		if ($ship_in_qty.equalsIgnoreCase(name)) {
			return ship_in_qty();
		}
		if ($ex_ship_in_qty.equalsIgnoreCase(name)) {
			return ex_ship_in_qty();
		}
		if ($ship_rtn_gr_qty.equalsIgnoreCase(name)) {
			return ship_rtn_gr_qty();
		}
		if ($sls_rtn_gr_qty.equalsIgnoreCase(name)) {
			return sls_rtn_gr_qty();
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			return gi_total_qty();
		}
		if ($arr_rtn_qty.equalsIgnoreCase(name)) {
			return arr_rtn_qty();
		}
		if ($purc_gi_qty.equalsIgnoreCase(name)) {
			return purc_gi_qty();
		}
		if ($onr_rcv_gi_qty.equalsIgnoreCase(name)) {
			return onr_rcv_gi_qty();
		}
		if ($purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			return purc_rtn_gi_qty();
		}
		if ($onr_rcv_ret_gi_qty.equalsIgnoreCase(name)) {
			return onr_rcv_ret_gi_qty();
		}
		if ($xpns_purc_gi_qty.equalsIgnoreCase(name)) {
			return xpns_purc_gi_qty();
		}
		if ($xpns_purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			return xpns_purc_rtn_gi_qty();
		}
		if ($accpt_dfct_gi_qty.equalsIgnoreCase(name)) {
			return accpt_dfct_gi_qty();
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			return inpt_qty();
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			return loss_qty();
		}
		if ($ffr_prov_gi_qty.equalsIgnoreCase(name)) {
			return ffr_prov_gi_qty();
		}
		if ($onr_prov_gi_qty.equalsIgnoreCase(name)) {
			return onr_prov_gi_qty();
		}
		if ($ffr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			return ffr_prov_rtn_gi_qty();
		}
		if ($onr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			return onr_prov_rtn_gi_qty();
		}
		if ($insp_gi_qty.equalsIgnoreCase(name)) {
			return insp_gi_qty();
		}
		if ($insp_cmpl_gi_qty.equalsIgnoreCase(name)) {
			return insp_cmpl_gi_qty();
		}
		if ($insp_judg_gi_qty.equalsIgnoreCase(name)) {
			return insp_judg_gi_qty();
		}
		if ($reinsp_gi_qty.equalsIgnoreCase(name)) {
			return reinsp_gi_qty();
		}
		if ($insp_smpl_gi_qty.equalsIgnoreCase(name)) {
			return insp_smpl_gi_qty();
		}
		if ($stk_adjst_gi_qty.equalsIgnoreCase(name)) {
			return stk_adjst_gi_qty();
		}
		if ($prdct_wh_gi_qty.equalsIgnoreCase(name)) {
			return prdct_wh_gi_qty();
		}
		if ($prdct_wh_rtn_gi_qty.equalsIgnoreCase(name)) {
			return prdct_wh_rtn_gi_qty();
		}
		if ($xfr_gi_qty.equalsIgnoreCase(name)) {
			return xfr_gi_qty();
		}
		if ($xfr_out_qty.equalsIgnoreCase(name)) {
			return xfr_out_qty();
		}
		if ($purc_xfr_out_qty.equalsIgnoreCase(name)) {
			return purc_xfr_out_qty();
		}
		if ($xfr_rtn_gi_qty.equalsIgnoreCase(name)) {
			return xfr_rtn_gi_qty();
		}
		if ($acxfr_gi_qty.equalsIgnoreCase(name)) {
			return acxfr_gi_qty();
		}
		if ($scrp_qty.equalsIgnoreCase(name)) {
			return scrp_qty();
		}
		if ($xfr_itm_gi_qty.equalsIgnoreCase(name)) {
			return xfr_itm_gi_qty();
		}
		if ($xfr_lot_sno_gi_qty.equalsIgnoreCase(name)) {
			return xfr_lot_sno_gi_qty();
		}
		if ($xfr_grd_gi_qty.equalsIgnoreCase(name)) {
			return xfr_grd_gi_qty();
		}
		if ($xfr_pack_gi_qty.equalsIgnoreCase(name)) {
			return xfr_pack_gi_qty();
		}
		if ($ship_out_qty.equalsIgnoreCase(name)) {
			return ship_out_qty();
		}
		if ($ex_ship_out_qty.equalsIgnoreCase(name)) {
			return ex_ship_out_qty();
		}
		if ($ship_rtn_gi_qty.equalsIgnoreCase(name)) {
			return ship_rtn_gi_qty();
		}
		if ($sls_rtn_gi_qty.equalsIgnoreCase(name)) {
			return sls_rtn_gi_qty();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			return end_stk_qty();
		}
		if ($ini_stk_amt.equalsIgnoreCase(name)) {
			return ini_stk_amt();
		}
		if ($gr_total_amt.equalsIgnoreCase(name)) {
			return gr_total_amt();
		}
		if ($arr_amt.equalsIgnoreCase(name)) {
			return arr_amt();
		}
		if ($purc_gr_amt.equalsIgnoreCase(name)) {
			return purc_gr_amt();
		}
		if ($onr_rcv_gr_amt.equalsIgnoreCase(name)) {
			return onr_rcv_gr_amt();
		}
		if ($purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			return purc_rtn_gr_amt();
		}
		if ($onr_rcv_ret_gr_amt.equalsIgnoreCase(name)) {
			return onr_rcv_ret_gr_amt();
		}
		if ($xpns_purc_gr_amt.equalsIgnoreCase(name)) {
			return xpns_purc_gr_amt();
		}
		if ($xpns_purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			return xpns_purc_rtn_gr_amt();
		}
		if ($accpt_dfct_gr_amt.equalsIgnoreCase(name)) {
			return accpt_dfct_gr_amt();
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			return mfg_amt();
		}
		if ($bymfg_amt.equalsIgnoreCase(name)) {
			return bymfg_amt();
		}
		if ($ffr_prov_gr_amt.equalsIgnoreCase(name)) {
			return ffr_prov_gr_amt();
		}
		if ($onr_prov_gr_amt.equalsIgnoreCase(name)) {
			return onr_prov_gr_amt();
		}
		if ($ffr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			return ffr_prov_rtn_gr_amt();
		}
		if ($onr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			return onr_prov_rtn_gr_amt();
		}
		if ($insp_gr_amt.equalsIgnoreCase(name)) {
			return insp_gr_amt();
		}
		if ($insp_cmpl_gr_amt.equalsIgnoreCase(name)) {
			return insp_cmpl_gr_amt();
		}
		if ($insp_judg_gr_amt.equalsIgnoreCase(name)) {
			return insp_judg_gr_amt();
		}
		if ($reinsp_gr_amt.equalsIgnoreCase(name)) {
			return reinsp_gr_amt();
		}
		if ($stk_adjst_gr_amt.equalsIgnoreCase(name)) {
			return stk_adjst_gr_amt();
		}
		if ($prdct_wh_gr_amt.equalsIgnoreCase(name)) {
			return prdct_wh_gr_amt();
		}
		if ($prdct_wh_rtn_gr_amt.equalsIgnoreCase(name)) {
			return prdct_wh_rtn_gr_amt();
		}
		if ($xfr_gr_amt.equalsIgnoreCase(name)) {
			return xfr_gr_amt();
		}
		if ($xfr_in_amt.equalsIgnoreCase(name)) {
			return xfr_in_amt();
		}
		if ($purc_xfr_in_amt.equalsIgnoreCase(name)) {
			return purc_xfr_in_amt();
		}
		if ($xfr_rtn_gr_amt.equalsIgnoreCase(name)) {
			return xfr_rtn_gr_amt();
		}
		if ($acxfr_gr_amt.equalsIgnoreCase(name)) {
			return acxfr_gr_amt();
		}
		if ($arr_cststk_amt.equalsIgnoreCase(name)) {
			return arr_cststk_amt();
		}
		if ($xfr_itm_gr_amt.equalsIgnoreCase(name)) {
			return xfr_itm_gr_amt();
		}
		if ($xfr_lot_sno_gr_amt.equalsIgnoreCase(name)) {
			return xfr_lot_sno_gr_amt();
		}
		if ($xfr_grd_gr_amt.equalsIgnoreCase(name)) {
			return xfr_grd_gr_amt();
		}
		if ($xfr_pack_gr_amt.equalsIgnoreCase(name)) {
			return xfr_pack_gr_amt();
		}
		if ($ship_in_amt.equalsIgnoreCase(name)) {
			return ship_in_amt();
		}
		if ($ex_ship_in_amt.equalsIgnoreCase(name)) {
			return ex_ship_in_amt();
		}
		if ($ship_rtn_gr_amt.equalsIgnoreCase(name)) {
			return ship_rtn_gr_amt();
		}
		if ($sls_rtn_gr_amt.equalsIgnoreCase(name)) {
			return sls_rtn_gr_amt();
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			return gi_total_amt();
		}
		if ($arr_rtn_amt.equalsIgnoreCase(name)) {
			return arr_rtn_amt();
		}
		if ($purc_gi_amt.equalsIgnoreCase(name)) {
			return purc_gi_amt();
		}
		if ($onr_rcv_gi_amt.equalsIgnoreCase(name)) {
			return onr_rcv_gi_amt();
		}
		if ($purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			return purc_rtn_gi_amt();
		}
		if ($onr_rcv_ret_gi_amt.equalsIgnoreCase(name)) {
			return onr_rcv_ret_gi_amt();
		}
		if ($xpns_purc_gi_amt.equalsIgnoreCase(name)) {
			return xpns_purc_gi_amt();
		}
		if ($xpns_purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			return xpns_purc_rtn_gi_amt();
		}
		if ($accpt_dfct_gi_amt.equalsIgnoreCase(name)) {
			return accpt_dfct_gi_amt();
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			return inpt_amt();
		}
		if ($loss_amt.equalsIgnoreCase(name)) {
			return loss_amt();
		}
		if ($ffr_prov_gi_amt.equalsIgnoreCase(name)) {
			return ffr_prov_gi_amt();
		}
		if ($onr_prov_gi_amt.equalsIgnoreCase(name)) {
			return onr_prov_gi_amt();
		}
		if ($ffr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			return ffr_prov_rtn_gi_amt();
		}
		if ($onr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			return onr_prov_rtn_gi_amt();
		}
		if ($insp_gi_amt.equalsIgnoreCase(name)) {
			return insp_gi_amt();
		}
		if ($insp_cmpl_gi_amt.equalsIgnoreCase(name)) {
			return insp_cmpl_gi_amt();
		}
		if ($insp_judg_gi_amt.equalsIgnoreCase(name)) {
			return insp_judg_gi_amt();
		}
		if ($reinsp_gi_amt.equalsIgnoreCase(name)) {
			return reinsp_gi_amt();
		}
		if ($insp_smpl_gi_amt.equalsIgnoreCase(name)) {
			return insp_smpl_gi_amt();
		}
		if ($stk_adjst_gi_amt.equalsIgnoreCase(name)) {
			return stk_adjst_gi_amt();
		}
		if ($prdct_wh_gi_amt.equalsIgnoreCase(name)) {
			return prdct_wh_gi_amt();
		}
		if ($prdct_wh_rtn_gi_amt.equalsIgnoreCase(name)) {
			return prdct_wh_rtn_gi_amt();
		}
		if ($xfr_gi_amt.equalsIgnoreCase(name)) {
			return xfr_gi_amt();
		}
		if ($xfr_out_amt.equalsIgnoreCase(name)) {
			return xfr_out_amt();
		}
		if ($purc_xfr_out_amt.equalsIgnoreCase(name)) {
			return purc_xfr_out_amt();
		}
		if ($xfr_rtn_gi_amt.equalsIgnoreCase(name)) {
			return xfr_rtn_gi_amt();
		}
		if ($acxfr_gi_amt.equalsIgnoreCase(name)) {
			return acxfr_gi_amt();
		}
		if ($scrp_amt.equalsIgnoreCase(name)) {
			return scrp_amt();
		}
		if ($xfr_itm_gi_amt.equalsIgnoreCase(name)) {
			return xfr_itm_gi_amt();
		}
		if ($xfr_lot_sno_gi_amt.equalsIgnoreCase(name)) {
			return xfr_lot_sno_gi_amt();
		}
		if ($xfr_grd_gi_amt.equalsIgnoreCase(name)) {
			return xfr_grd_gi_amt();
		}
		if ($xfr_pack_gi_amt.equalsIgnoreCase(name)) {
			return xfr_pack_gi_amt();
		}
		if ($ship_out_amt.equalsIgnoreCase(name)) {
			return ship_out_amt();
		}
		if ($ex_ship_out_amt.equalsIgnoreCase(name)) {
			return ex_ship_out_amt();
		}
		if ($ship_rtn_gi_amt.equalsIgnoreCase(name)) {
			return ship_rtn_gi_amt();
		}
		if ($sls_rtn_gi_amt.equalsIgnoreCase(name)) {
			return sls_rtn_gi_amt();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			return end_stk_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mly_io_cl_ym.equalsIgnoreCase(name)) {
			return mly_io_cl_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
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
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
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
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			fix_no_typ_nm(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
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
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			pack_unit_rnd_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($base_cur_rnd_typ.equalsIgnoreCase(name)) {
			base_cur_rnd_typ(value);
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
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($ini_stk_qty.equalsIgnoreCase(name)) {
			ini_stk_qty(value);
			return;
		}
		if ($gr_total_qty.equalsIgnoreCase(name)) {
			gr_total_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_gr_qty.equalsIgnoreCase(name)) {
			purc_gr_qty(value);
			return;
		}
		if ($onr_rcv_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_gr_qty(value);
			return;
		}
		if ($purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			purc_rtn_gr_qty(value);
			return;
		}
		if ($onr_rcv_ret_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_qty(value);
			return;
		}
		if ($xpns_purc_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_gr_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_qty(value);
			return;
		}
		if ($accpt_dfct_gr_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gr_qty(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($bymfg_qty.equalsIgnoreCase(name)) {
			bymfg_qty(value);
			return;
		}
		if ($ffr_prov_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_gr_qty(value);
			return;
		}
		if ($onr_prov_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_gr_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_qty(value);
			return;
		}
		if ($onr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_qty(value);
			return;
		}
		if ($insp_gr_qty.equalsIgnoreCase(name)) {
			insp_gr_qty(value);
			return;
		}
		if ($insp_cmpl_gr_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gr_qty(value);
			return;
		}
		if ($insp_judg_gr_qty.equalsIgnoreCase(name)) {
			insp_judg_gr_qty(value);
			return;
		}
		if ($reinsp_gr_qty.equalsIgnoreCase(name)) {
			reinsp_gr_qty(value);
			return;
		}
		if ($stk_adjst_gr_qty.equalsIgnoreCase(name)) {
			stk_adjst_gr_qty(value);
			return;
		}
		if ($prdct_wh_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_gr_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_qty(value);
			return;
		}
		if ($xfr_gr_qty.equalsIgnoreCase(name)) {
			xfr_gr_qty(value);
			return;
		}
		if ($xfr_in_qty.equalsIgnoreCase(name)) {
			xfr_in_qty(value);
			return;
		}
		if ($purc_xfr_in_qty.equalsIgnoreCase(name)) {
			purc_xfr_in_qty(value);
			return;
		}
		if ($xfr_rtn_gr_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gr_qty(value);
			return;
		}
		if ($acxfr_gr_qty.equalsIgnoreCase(name)) {
			acxfr_gr_qty(value);
			return;
		}
		if ($arr_cststk_qty.equalsIgnoreCase(name)) {
			arr_cststk_qty(value);
			return;
		}
		if ($xfr_itm_gr_qty.equalsIgnoreCase(name)) {
			xfr_itm_gr_qty(value);
			return;
		}
		if ($xfr_lot_sno_gr_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_qty(value);
			return;
		}
		if ($xfr_grd_gr_qty.equalsIgnoreCase(name)) {
			xfr_grd_gr_qty(value);
			return;
		}
		if ($xfr_pack_gr_qty.equalsIgnoreCase(name)) {
			xfr_pack_gr_qty(value);
			return;
		}
		if ($ship_in_qty.equalsIgnoreCase(name)) {
			ship_in_qty(value);
			return;
		}
		if ($ex_ship_in_qty.equalsIgnoreCase(name)) {
			ex_ship_in_qty(value);
			return;
		}
		if ($ship_rtn_gr_qty.equalsIgnoreCase(name)) {
			ship_rtn_gr_qty(value);
			return;
		}
		if ($sls_rtn_gr_qty.equalsIgnoreCase(name)) {
			sls_rtn_gr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($arr_rtn_qty.equalsIgnoreCase(name)) {
			arr_rtn_qty(value);
			return;
		}
		if ($purc_gi_qty.equalsIgnoreCase(name)) {
			purc_gi_qty(value);
			return;
		}
		if ($onr_rcv_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_gi_qty(value);
			return;
		}
		if ($purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			purc_rtn_gi_qty(value);
			return;
		}
		if ($onr_rcv_ret_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_qty(value);
			return;
		}
		if ($xpns_purc_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_gi_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_qty(value);
			return;
		}
		if ($accpt_dfct_gi_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gi_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($ffr_prov_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_gi_qty(value);
			return;
		}
		if ($onr_prov_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_gi_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_qty(value);
			return;
		}
		if ($onr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_qty(value);
			return;
		}
		if ($insp_gi_qty.equalsIgnoreCase(name)) {
			insp_gi_qty(value);
			return;
		}
		if ($insp_cmpl_gi_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gi_qty(value);
			return;
		}
		if ($insp_judg_gi_qty.equalsIgnoreCase(name)) {
			insp_judg_gi_qty(value);
			return;
		}
		if ($reinsp_gi_qty.equalsIgnoreCase(name)) {
			reinsp_gi_qty(value);
			return;
		}
		if ($insp_smpl_gi_qty.equalsIgnoreCase(name)) {
			insp_smpl_gi_qty(value);
			return;
		}
		if ($stk_adjst_gi_qty.equalsIgnoreCase(name)) {
			stk_adjst_gi_qty(value);
			return;
		}
		if ($prdct_wh_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_gi_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_qty(value);
			return;
		}
		if ($xfr_gi_qty.equalsIgnoreCase(name)) {
			xfr_gi_qty(value);
			return;
		}
		if ($xfr_out_qty.equalsIgnoreCase(name)) {
			xfr_out_qty(value);
			return;
		}
		if ($purc_xfr_out_qty.equalsIgnoreCase(name)) {
			purc_xfr_out_qty(value);
			return;
		}
		if ($xfr_rtn_gi_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gi_qty(value);
			return;
		}
		if ($acxfr_gi_qty.equalsIgnoreCase(name)) {
			acxfr_gi_qty(value);
			return;
		}
		if ($scrp_qty.equalsIgnoreCase(name)) {
			scrp_qty(value);
			return;
		}
		if ($xfr_itm_gi_qty.equalsIgnoreCase(name)) {
			xfr_itm_gi_qty(value);
			return;
		}
		if ($xfr_lot_sno_gi_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_qty(value);
			return;
		}
		if ($xfr_grd_gi_qty.equalsIgnoreCase(name)) {
			xfr_grd_gi_qty(value);
			return;
		}
		if ($xfr_pack_gi_qty.equalsIgnoreCase(name)) {
			xfr_pack_gi_qty(value);
			return;
		}
		if ($ship_out_qty.equalsIgnoreCase(name)) {
			ship_out_qty(value);
			return;
		}
		if ($ex_ship_out_qty.equalsIgnoreCase(name)) {
			ex_ship_out_qty(value);
			return;
		}
		if ($ship_rtn_gi_qty.equalsIgnoreCase(name)) {
			ship_rtn_gi_qty(value);
			return;
		}
		if ($sls_rtn_gi_qty.equalsIgnoreCase(name)) {
			sls_rtn_gi_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($ini_stk_amt.equalsIgnoreCase(name)) {
			ini_stk_amt(value);
			return;
		}
		if ($gr_total_amt.equalsIgnoreCase(name)) {
			gr_total_amt(value);
			return;
		}
		if ($arr_amt.equalsIgnoreCase(name)) {
			arr_amt(value);
			return;
		}
		if ($purc_gr_amt.equalsIgnoreCase(name)) {
			purc_gr_amt(value);
			return;
		}
		if ($onr_rcv_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_gr_amt(value);
			return;
		}
		if ($purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			purc_rtn_gr_amt(value);
			return;
		}
		if ($onr_rcv_ret_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_amt(value);
			return;
		}
		if ($xpns_purc_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_gr_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_amt(value);
			return;
		}
		if ($accpt_dfct_gr_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gr_amt(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($bymfg_amt.equalsIgnoreCase(name)) {
			bymfg_amt(value);
			return;
		}
		if ($ffr_prov_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_gr_amt(value);
			return;
		}
		if ($onr_prov_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_gr_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_amt(value);
			return;
		}
		if ($onr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_amt(value);
			return;
		}
		if ($insp_gr_amt.equalsIgnoreCase(name)) {
			insp_gr_amt(value);
			return;
		}
		if ($insp_cmpl_gr_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gr_amt(value);
			return;
		}
		if ($insp_judg_gr_amt.equalsIgnoreCase(name)) {
			insp_judg_gr_amt(value);
			return;
		}
		if ($reinsp_gr_amt.equalsIgnoreCase(name)) {
			reinsp_gr_amt(value);
			return;
		}
		if ($stk_adjst_gr_amt.equalsIgnoreCase(name)) {
			stk_adjst_gr_amt(value);
			return;
		}
		if ($prdct_wh_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_gr_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_amt(value);
			return;
		}
		if ($xfr_gr_amt.equalsIgnoreCase(name)) {
			xfr_gr_amt(value);
			return;
		}
		if ($xfr_in_amt.equalsIgnoreCase(name)) {
			xfr_in_amt(value);
			return;
		}
		if ($purc_xfr_in_amt.equalsIgnoreCase(name)) {
			purc_xfr_in_amt(value);
			return;
		}
		if ($xfr_rtn_gr_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gr_amt(value);
			return;
		}
		if ($acxfr_gr_amt.equalsIgnoreCase(name)) {
			acxfr_gr_amt(value);
			return;
		}
		if ($arr_cststk_amt.equalsIgnoreCase(name)) {
			arr_cststk_amt(value);
			return;
		}
		if ($xfr_itm_gr_amt.equalsIgnoreCase(name)) {
			xfr_itm_gr_amt(value);
			return;
		}
		if ($xfr_lot_sno_gr_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_amt(value);
			return;
		}
		if ($xfr_grd_gr_amt.equalsIgnoreCase(name)) {
			xfr_grd_gr_amt(value);
			return;
		}
		if ($xfr_pack_gr_amt.equalsIgnoreCase(name)) {
			xfr_pack_gr_amt(value);
			return;
		}
		if ($ship_in_amt.equalsIgnoreCase(name)) {
			ship_in_amt(value);
			return;
		}
		if ($ex_ship_in_amt.equalsIgnoreCase(name)) {
			ex_ship_in_amt(value);
			return;
		}
		if ($ship_rtn_gr_amt.equalsIgnoreCase(name)) {
			ship_rtn_gr_amt(value);
			return;
		}
		if ($sls_rtn_gr_amt.equalsIgnoreCase(name)) {
			sls_rtn_gr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($arr_rtn_amt.equalsIgnoreCase(name)) {
			arr_rtn_amt(value);
			return;
		}
		if ($purc_gi_amt.equalsIgnoreCase(name)) {
			purc_gi_amt(value);
			return;
		}
		if ($onr_rcv_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_gi_amt(value);
			return;
		}
		if ($purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			purc_rtn_gi_amt(value);
			return;
		}
		if ($onr_rcv_ret_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_amt(value);
			return;
		}
		if ($xpns_purc_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_gi_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_amt(value);
			return;
		}
		if ($accpt_dfct_gi_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gi_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($loss_amt.equalsIgnoreCase(name)) {
			loss_amt(value);
			return;
		}
		if ($ffr_prov_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_gi_amt(value);
			return;
		}
		if ($onr_prov_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_gi_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_amt(value);
			return;
		}
		if ($onr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_amt(value);
			return;
		}
		if ($insp_gi_amt.equalsIgnoreCase(name)) {
			insp_gi_amt(value);
			return;
		}
		if ($insp_cmpl_gi_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gi_amt(value);
			return;
		}
		if ($insp_judg_gi_amt.equalsIgnoreCase(name)) {
			insp_judg_gi_amt(value);
			return;
		}
		if ($reinsp_gi_amt.equalsIgnoreCase(name)) {
			reinsp_gi_amt(value);
			return;
		}
		if ($insp_smpl_gi_amt.equalsIgnoreCase(name)) {
			insp_smpl_gi_amt(value);
			return;
		}
		if ($stk_adjst_gi_amt.equalsIgnoreCase(name)) {
			stk_adjst_gi_amt(value);
			return;
		}
		if ($prdct_wh_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_gi_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_amt(value);
			return;
		}
		if ($xfr_gi_amt.equalsIgnoreCase(name)) {
			xfr_gi_amt(value);
			return;
		}
		if ($xfr_out_amt.equalsIgnoreCase(name)) {
			xfr_out_amt(value);
			return;
		}
		if ($purc_xfr_out_amt.equalsIgnoreCase(name)) {
			purc_xfr_out_amt(value);
			return;
		}
		if ($xfr_rtn_gi_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gi_amt(value);
			return;
		}
		if ($acxfr_gi_amt.equalsIgnoreCase(name)) {
			acxfr_gi_amt(value);
			return;
		}
		if ($scrp_amt.equalsIgnoreCase(name)) {
			scrp_amt(value);
			return;
		}
		if ($xfr_itm_gi_amt.equalsIgnoreCase(name)) {
			xfr_itm_gi_amt(value);
			return;
		}
		if ($xfr_lot_sno_gi_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_amt(value);
			return;
		}
		if ($xfr_grd_gi_amt.equalsIgnoreCase(name)) {
			xfr_grd_gi_amt(value);
			return;
		}
		if ($xfr_pack_gi_amt.equalsIgnoreCase(name)) {
			xfr_pack_gi_amt(value);
			return;
		}
		if ($ship_out_amt.equalsIgnoreCase(name)) {
			ship_out_amt(value);
			return;
		}
		if ($ex_ship_out_amt.equalsIgnoreCase(name)) {
			ex_ship_out_amt(value);
			return;
		}
		if ($ship_rtn_gi_amt.equalsIgnoreCase(name)) {
			ship_rtn_gi_amt(value);
			return;
		}
		if ($sls_rtn_gi_amt.equalsIgnoreCase(name)) {
			sls_rtn_gi_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($ini_stk_qty.equalsIgnoreCase(name)) {
			ini_stk_qty(value);
			return;
		}
		if ($gr_total_qty.equalsIgnoreCase(name)) {
			gr_total_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_gr_qty.equalsIgnoreCase(name)) {
			purc_gr_qty(value);
			return;
		}
		if ($onr_rcv_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_gr_qty(value);
			return;
		}
		if ($purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			purc_rtn_gr_qty(value);
			return;
		}
		if ($onr_rcv_ret_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_qty(value);
			return;
		}
		if ($xpns_purc_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_gr_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_qty(value);
			return;
		}
		if ($accpt_dfct_gr_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gr_qty(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($bymfg_qty.equalsIgnoreCase(name)) {
			bymfg_qty(value);
			return;
		}
		if ($ffr_prov_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_gr_qty(value);
			return;
		}
		if ($onr_prov_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_gr_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_qty(value);
			return;
		}
		if ($onr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_qty(value);
			return;
		}
		if ($insp_gr_qty.equalsIgnoreCase(name)) {
			insp_gr_qty(value);
			return;
		}
		if ($insp_cmpl_gr_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gr_qty(value);
			return;
		}
		if ($insp_judg_gr_qty.equalsIgnoreCase(name)) {
			insp_judg_gr_qty(value);
			return;
		}
		if ($reinsp_gr_qty.equalsIgnoreCase(name)) {
			reinsp_gr_qty(value);
			return;
		}
		if ($stk_adjst_gr_qty.equalsIgnoreCase(name)) {
			stk_adjst_gr_qty(value);
			return;
		}
		if ($prdct_wh_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_gr_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_qty(value);
			return;
		}
		if ($xfr_gr_qty.equalsIgnoreCase(name)) {
			xfr_gr_qty(value);
			return;
		}
		if ($xfr_in_qty.equalsIgnoreCase(name)) {
			xfr_in_qty(value);
			return;
		}
		if ($purc_xfr_in_qty.equalsIgnoreCase(name)) {
			purc_xfr_in_qty(value);
			return;
		}
		if ($xfr_rtn_gr_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gr_qty(value);
			return;
		}
		if ($acxfr_gr_qty.equalsIgnoreCase(name)) {
			acxfr_gr_qty(value);
			return;
		}
		if ($arr_cststk_qty.equalsIgnoreCase(name)) {
			arr_cststk_qty(value);
			return;
		}
		if ($xfr_itm_gr_qty.equalsIgnoreCase(name)) {
			xfr_itm_gr_qty(value);
			return;
		}
		if ($xfr_lot_sno_gr_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_qty(value);
			return;
		}
		if ($xfr_grd_gr_qty.equalsIgnoreCase(name)) {
			xfr_grd_gr_qty(value);
			return;
		}
		if ($xfr_pack_gr_qty.equalsIgnoreCase(name)) {
			xfr_pack_gr_qty(value);
			return;
		}
		if ($ship_in_qty.equalsIgnoreCase(name)) {
			ship_in_qty(value);
			return;
		}
		if ($ex_ship_in_qty.equalsIgnoreCase(name)) {
			ex_ship_in_qty(value);
			return;
		}
		if ($ship_rtn_gr_qty.equalsIgnoreCase(name)) {
			ship_rtn_gr_qty(value);
			return;
		}
		if ($sls_rtn_gr_qty.equalsIgnoreCase(name)) {
			sls_rtn_gr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($arr_rtn_qty.equalsIgnoreCase(name)) {
			arr_rtn_qty(value);
			return;
		}
		if ($purc_gi_qty.equalsIgnoreCase(name)) {
			purc_gi_qty(value);
			return;
		}
		if ($onr_rcv_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_gi_qty(value);
			return;
		}
		if ($purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			purc_rtn_gi_qty(value);
			return;
		}
		if ($onr_rcv_ret_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_qty(value);
			return;
		}
		if ($xpns_purc_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_gi_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_qty(value);
			return;
		}
		if ($accpt_dfct_gi_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gi_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($ffr_prov_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_gi_qty(value);
			return;
		}
		if ($onr_prov_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_gi_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_qty(value);
			return;
		}
		if ($onr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_qty(value);
			return;
		}
		if ($insp_gi_qty.equalsIgnoreCase(name)) {
			insp_gi_qty(value);
			return;
		}
		if ($insp_cmpl_gi_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gi_qty(value);
			return;
		}
		if ($insp_judg_gi_qty.equalsIgnoreCase(name)) {
			insp_judg_gi_qty(value);
			return;
		}
		if ($reinsp_gi_qty.equalsIgnoreCase(name)) {
			reinsp_gi_qty(value);
			return;
		}
		if ($insp_smpl_gi_qty.equalsIgnoreCase(name)) {
			insp_smpl_gi_qty(value);
			return;
		}
		if ($stk_adjst_gi_qty.equalsIgnoreCase(name)) {
			stk_adjst_gi_qty(value);
			return;
		}
		if ($prdct_wh_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_gi_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_qty(value);
			return;
		}
		if ($xfr_gi_qty.equalsIgnoreCase(name)) {
			xfr_gi_qty(value);
			return;
		}
		if ($xfr_out_qty.equalsIgnoreCase(name)) {
			xfr_out_qty(value);
			return;
		}
		if ($purc_xfr_out_qty.equalsIgnoreCase(name)) {
			purc_xfr_out_qty(value);
			return;
		}
		if ($xfr_rtn_gi_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gi_qty(value);
			return;
		}
		if ($acxfr_gi_qty.equalsIgnoreCase(name)) {
			acxfr_gi_qty(value);
			return;
		}
		if ($scrp_qty.equalsIgnoreCase(name)) {
			scrp_qty(value);
			return;
		}
		if ($xfr_itm_gi_qty.equalsIgnoreCase(name)) {
			xfr_itm_gi_qty(value);
			return;
		}
		if ($xfr_lot_sno_gi_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_qty(value);
			return;
		}
		if ($xfr_grd_gi_qty.equalsIgnoreCase(name)) {
			xfr_grd_gi_qty(value);
			return;
		}
		if ($xfr_pack_gi_qty.equalsIgnoreCase(name)) {
			xfr_pack_gi_qty(value);
			return;
		}
		if ($ship_out_qty.equalsIgnoreCase(name)) {
			ship_out_qty(value);
			return;
		}
		if ($ex_ship_out_qty.equalsIgnoreCase(name)) {
			ex_ship_out_qty(value);
			return;
		}
		if ($ship_rtn_gi_qty.equalsIgnoreCase(name)) {
			ship_rtn_gi_qty(value);
			return;
		}
		if ($sls_rtn_gi_qty.equalsIgnoreCase(name)) {
			sls_rtn_gi_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($ini_stk_amt.equalsIgnoreCase(name)) {
			ini_stk_amt(value);
			return;
		}
		if ($gr_total_amt.equalsIgnoreCase(name)) {
			gr_total_amt(value);
			return;
		}
		if ($arr_amt.equalsIgnoreCase(name)) {
			arr_amt(value);
			return;
		}
		if ($purc_gr_amt.equalsIgnoreCase(name)) {
			purc_gr_amt(value);
			return;
		}
		if ($onr_rcv_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_gr_amt(value);
			return;
		}
		if ($purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			purc_rtn_gr_amt(value);
			return;
		}
		if ($onr_rcv_ret_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_amt(value);
			return;
		}
		if ($xpns_purc_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_gr_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_amt(value);
			return;
		}
		if ($accpt_dfct_gr_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gr_amt(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($bymfg_amt.equalsIgnoreCase(name)) {
			bymfg_amt(value);
			return;
		}
		if ($ffr_prov_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_gr_amt(value);
			return;
		}
		if ($onr_prov_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_gr_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_amt(value);
			return;
		}
		if ($onr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_amt(value);
			return;
		}
		if ($insp_gr_amt.equalsIgnoreCase(name)) {
			insp_gr_amt(value);
			return;
		}
		if ($insp_cmpl_gr_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gr_amt(value);
			return;
		}
		if ($insp_judg_gr_amt.equalsIgnoreCase(name)) {
			insp_judg_gr_amt(value);
			return;
		}
		if ($reinsp_gr_amt.equalsIgnoreCase(name)) {
			reinsp_gr_amt(value);
			return;
		}
		if ($stk_adjst_gr_amt.equalsIgnoreCase(name)) {
			stk_adjst_gr_amt(value);
			return;
		}
		if ($prdct_wh_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_gr_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_amt(value);
			return;
		}
		if ($xfr_gr_amt.equalsIgnoreCase(name)) {
			xfr_gr_amt(value);
			return;
		}
		if ($xfr_in_amt.equalsIgnoreCase(name)) {
			xfr_in_amt(value);
			return;
		}
		if ($purc_xfr_in_amt.equalsIgnoreCase(name)) {
			purc_xfr_in_amt(value);
			return;
		}
		if ($xfr_rtn_gr_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gr_amt(value);
			return;
		}
		if ($acxfr_gr_amt.equalsIgnoreCase(name)) {
			acxfr_gr_amt(value);
			return;
		}
		if ($arr_cststk_amt.equalsIgnoreCase(name)) {
			arr_cststk_amt(value);
			return;
		}
		if ($xfr_itm_gr_amt.equalsIgnoreCase(name)) {
			xfr_itm_gr_amt(value);
			return;
		}
		if ($xfr_lot_sno_gr_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_amt(value);
			return;
		}
		if ($xfr_grd_gr_amt.equalsIgnoreCase(name)) {
			xfr_grd_gr_amt(value);
			return;
		}
		if ($xfr_pack_gr_amt.equalsIgnoreCase(name)) {
			xfr_pack_gr_amt(value);
			return;
		}
		if ($ship_in_amt.equalsIgnoreCase(name)) {
			ship_in_amt(value);
			return;
		}
		if ($ex_ship_in_amt.equalsIgnoreCase(name)) {
			ex_ship_in_amt(value);
			return;
		}
		if ($ship_rtn_gr_amt.equalsIgnoreCase(name)) {
			ship_rtn_gr_amt(value);
			return;
		}
		if ($sls_rtn_gr_amt.equalsIgnoreCase(name)) {
			sls_rtn_gr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($arr_rtn_amt.equalsIgnoreCase(name)) {
			arr_rtn_amt(value);
			return;
		}
		if ($purc_gi_amt.equalsIgnoreCase(name)) {
			purc_gi_amt(value);
			return;
		}
		if ($onr_rcv_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_gi_amt(value);
			return;
		}
		if ($purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			purc_rtn_gi_amt(value);
			return;
		}
		if ($onr_rcv_ret_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_amt(value);
			return;
		}
		if ($xpns_purc_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_gi_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_amt(value);
			return;
		}
		if ($accpt_dfct_gi_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gi_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($loss_amt.equalsIgnoreCase(name)) {
			loss_amt(value);
			return;
		}
		if ($ffr_prov_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_gi_amt(value);
			return;
		}
		if ($onr_prov_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_gi_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_amt(value);
			return;
		}
		if ($onr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_amt(value);
			return;
		}
		if ($insp_gi_amt.equalsIgnoreCase(name)) {
			insp_gi_amt(value);
			return;
		}
		if ($insp_cmpl_gi_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gi_amt(value);
			return;
		}
		if ($insp_judg_gi_amt.equalsIgnoreCase(name)) {
			insp_judg_gi_amt(value);
			return;
		}
		if ($reinsp_gi_amt.equalsIgnoreCase(name)) {
			reinsp_gi_amt(value);
			return;
		}
		if ($insp_smpl_gi_amt.equalsIgnoreCase(name)) {
			insp_smpl_gi_amt(value);
			return;
		}
		if ($stk_adjst_gi_amt.equalsIgnoreCase(name)) {
			stk_adjst_gi_amt(value);
			return;
		}
		if ($prdct_wh_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_gi_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_amt(value);
			return;
		}
		if ($xfr_gi_amt.equalsIgnoreCase(name)) {
			xfr_gi_amt(value);
			return;
		}
		if ($xfr_out_amt.equalsIgnoreCase(name)) {
			xfr_out_amt(value);
			return;
		}
		if ($purc_xfr_out_amt.equalsIgnoreCase(name)) {
			purc_xfr_out_amt(value);
			return;
		}
		if ($xfr_rtn_gi_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gi_amt(value);
			return;
		}
		if ($acxfr_gi_amt.equalsIgnoreCase(name)) {
			acxfr_gi_amt(value);
			return;
		}
		if ($scrp_amt.equalsIgnoreCase(name)) {
			scrp_amt(value);
			return;
		}
		if ($xfr_itm_gi_amt.equalsIgnoreCase(name)) {
			xfr_itm_gi_amt(value);
			return;
		}
		if ($xfr_lot_sno_gi_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_amt(value);
			return;
		}
		if ($xfr_grd_gi_amt.equalsIgnoreCase(name)) {
			xfr_grd_gi_amt(value);
			return;
		}
		if ($xfr_pack_gi_amt.equalsIgnoreCase(name)) {
			xfr_pack_gi_amt(value);
			return;
		}
		if ($ship_out_amt.equalsIgnoreCase(name)) {
			ship_out_amt(value);
			return;
		}
		if ($ex_ship_out_amt.equalsIgnoreCase(name)) {
			ex_ship_out_amt(value);
			return;
		}
		if ($ship_rtn_gi_amt.equalsIgnoreCase(name)) {
			ship_rtn_gi_amt(value);
			return;
		}
		if ($sls_rtn_gi_amt.equalsIgnoreCase(name)) {
			sls_rtn_gi_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($ini_stk_qty.equalsIgnoreCase(name)) {
			ini_stk_qty(value);
			return;
		}
		if ($gr_total_qty.equalsIgnoreCase(name)) {
			gr_total_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_gr_qty.equalsIgnoreCase(name)) {
			purc_gr_qty(value);
			return;
		}
		if ($onr_rcv_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_gr_qty(value);
			return;
		}
		if ($purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			purc_rtn_gr_qty(value);
			return;
		}
		if ($onr_rcv_ret_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_qty(value);
			return;
		}
		if ($xpns_purc_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_gr_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_qty(value);
			return;
		}
		if ($accpt_dfct_gr_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gr_qty(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($bymfg_qty.equalsIgnoreCase(name)) {
			bymfg_qty(value);
			return;
		}
		if ($ffr_prov_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_gr_qty(value);
			return;
		}
		if ($onr_prov_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_gr_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_qty(value);
			return;
		}
		if ($onr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_qty(value);
			return;
		}
		if ($insp_gr_qty.equalsIgnoreCase(name)) {
			insp_gr_qty(value);
			return;
		}
		if ($insp_cmpl_gr_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gr_qty(value);
			return;
		}
		if ($insp_judg_gr_qty.equalsIgnoreCase(name)) {
			insp_judg_gr_qty(value);
			return;
		}
		if ($reinsp_gr_qty.equalsIgnoreCase(name)) {
			reinsp_gr_qty(value);
			return;
		}
		if ($stk_adjst_gr_qty.equalsIgnoreCase(name)) {
			stk_adjst_gr_qty(value);
			return;
		}
		if ($prdct_wh_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_gr_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_qty(value);
			return;
		}
		if ($xfr_gr_qty.equalsIgnoreCase(name)) {
			xfr_gr_qty(value);
			return;
		}
		if ($xfr_in_qty.equalsIgnoreCase(name)) {
			xfr_in_qty(value);
			return;
		}
		if ($purc_xfr_in_qty.equalsIgnoreCase(name)) {
			purc_xfr_in_qty(value);
			return;
		}
		if ($xfr_rtn_gr_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gr_qty(value);
			return;
		}
		if ($acxfr_gr_qty.equalsIgnoreCase(name)) {
			acxfr_gr_qty(value);
			return;
		}
		if ($arr_cststk_qty.equalsIgnoreCase(name)) {
			arr_cststk_qty(value);
			return;
		}
		if ($xfr_itm_gr_qty.equalsIgnoreCase(name)) {
			xfr_itm_gr_qty(value);
			return;
		}
		if ($xfr_lot_sno_gr_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_qty(value);
			return;
		}
		if ($xfr_grd_gr_qty.equalsIgnoreCase(name)) {
			xfr_grd_gr_qty(value);
			return;
		}
		if ($xfr_pack_gr_qty.equalsIgnoreCase(name)) {
			xfr_pack_gr_qty(value);
			return;
		}
		if ($ship_in_qty.equalsIgnoreCase(name)) {
			ship_in_qty(value);
			return;
		}
		if ($ex_ship_in_qty.equalsIgnoreCase(name)) {
			ex_ship_in_qty(value);
			return;
		}
		if ($ship_rtn_gr_qty.equalsIgnoreCase(name)) {
			ship_rtn_gr_qty(value);
			return;
		}
		if ($sls_rtn_gr_qty.equalsIgnoreCase(name)) {
			sls_rtn_gr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($arr_rtn_qty.equalsIgnoreCase(name)) {
			arr_rtn_qty(value);
			return;
		}
		if ($purc_gi_qty.equalsIgnoreCase(name)) {
			purc_gi_qty(value);
			return;
		}
		if ($onr_rcv_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_gi_qty(value);
			return;
		}
		if ($purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			purc_rtn_gi_qty(value);
			return;
		}
		if ($onr_rcv_ret_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_qty(value);
			return;
		}
		if ($xpns_purc_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_gi_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_qty(value);
			return;
		}
		if ($accpt_dfct_gi_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gi_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($ffr_prov_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_gi_qty(value);
			return;
		}
		if ($onr_prov_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_gi_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_qty(value);
			return;
		}
		if ($onr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_qty(value);
			return;
		}
		if ($insp_gi_qty.equalsIgnoreCase(name)) {
			insp_gi_qty(value);
			return;
		}
		if ($insp_cmpl_gi_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gi_qty(value);
			return;
		}
		if ($insp_judg_gi_qty.equalsIgnoreCase(name)) {
			insp_judg_gi_qty(value);
			return;
		}
		if ($reinsp_gi_qty.equalsIgnoreCase(name)) {
			reinsp_gi_qty(value);
			return;
		}
		if ($insp_smpl_gi_qty.equalsIgnoreCase(name)) {
			insp_smpl_gi_qty(value);
			return;
		}
		if ($stk_adjst_gi_qty.equalsIgnoreCase(name)) {
			stk_adjst_gi_qty(value);
			return;
		}
		if ($prdct_wh_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_gi_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_qty(value);
			return;
		}
		if ($xfr_gi_qty.equalsIgnoreCase(name)) {
			xfr_gi_qty(value);
			return;
		}
		if ($xfr_out_qty.equalsIgnoreCase(name)) {
			xfr_out_qty(value);
			return;
		}
		if ($purc_xfr_out_qty.equalsIgnoreCase(name)) {
			purc_xfr_out_qty(value);
			return;
		}
		if ($xfr_rtn_gi_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gi_qty(value);
			return;
		}
		if ($acxfr_gi_qty.equalsIgnoreCase(name)) {
			acxfr_gi_qty(value);
			return;
		}
		if ($scrp_qty.equalsIgnoreCase(name)) {
			scrp_qty(value);
			return;
		}
		if ($xfr_itm_gi_qty.equalsIgnoreCase(name)) {
			xfr_itm_gi_qty(value);
			return;
		}
		if ($xfr_lot_sno_gi_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_qty(value);
			return;
		}
		if ($xfr_grd_gi_qty.equalsIgnoreCase(name)) {
			xfr_grd_gi_qty(value);
			return;
		}
		if ($xfr_pack_gi_qty.equalsIgnoreCase(name)) {
			xfr_pack_gi_qty(value);
			return;
		}
		if ($ship_out_qty.equalsIgnoreCase(name)) {
			ship_out_qty(value);
			return;
		}
		if ($ex_ship_out_qty.equalsIgnoreCase(name)) {
			ex_ship_out_qty(value);
			return;
		}
		if ($ship_rtn_gi_qty.equalsIgnoreCase(name)) {
			ship_rtn_gi_qty(value);
			return;
		}
		if ($sls_rtn_gi_qty.equalsIgnoreCase(name)) {
			sls_rtn_gi_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($ini_stk_amt.equalsIgnoreCase(name)) {
			ini_stk_amt(value);
			return;
		}
		if ($gr_total_amt.equalsIgnoreCase(name)) {
			gr_total_amt(value);
			return;
		}
		if ($arr_amt.equalsIgnoreCase(name)) {
			arr_amt(value);
			return;
		}
		if ($purc_gr_amt.equalsIgnoreCase(name)) {
			purc_gr_amt(value);
			return;
		}
		if ($onr_rcv_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_gr_amt(value);
			return;
		}
		if ($purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			purc_rtn_gr_amt(value);
			return;
		}
		if ($onr_rcv_ret_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_amt(value);
			return;
		}
		if ($xpns_purc_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_gr_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_amt(value);
			return;
		}
		if ($accpt_dfct_gr_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gr_amt(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($bymfg_amt.equalsIgnoreCase(name)) {
			bymfg_amt(value);
			return;
		}
		if ($ffr_prov_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_gr_amt(value);
			return;
		}
		if ($onr_prov_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_gr_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_amt(value);
			return;
		}
		if ($onr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_amt(value);
			return;
		}
		if ($insp_gr_amt.equalsIgnoreCase(name)) {
			insp_gr_amt(value);
			return;
		}
		if ($insp_cmpl_gr_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gr_amt(value);
			return;
		}
		if ($insp_judg_gr_amt.equalsIgnoreCase(name)) {
			insp_judg_gr_amt(value);
			return;
		}
		if ($reinsp_gr_amt.equalsIgnoreCase(name)) {
			reinsp_gr_amt(value);
			return;
		}
		if ($stk_adjst_gr_amt.equalsIgnoreCase(name)) {
			stk_adjst_gr_amt(value);
			return;
		}
		if ($prdct_wh_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_gr_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_amt(value);
			return;
		}
		if ($xfr_gr_amt.equalsIgnoreCase(name)) {
			xfr_gr_amt(value);
			return;
		}
		if ($xfr_in_amt.equalsIgnoreCase(name)) {
			xfr_in_amt(value);
			return;
		}
		if ($purc_xfr_in_amt.equalsIgnoreCase(name)) {
			purc_xfr_in_amt(value);
			return;
		}
		if ($xfr_rtn_gr_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gr_amt(value);
			return;
		}
		if ($acxfr_gr_amt.equalsIgnoreCase(name)) {
			acxfr_gr_amt(value);
			return;
		}
		if ($arr_cststk_amt.equalsIgnoreCase(name)) {
			arr_cststk_amt(value);
			return;
		}
		if ($xfr_itm_gr_amt.equalsIgnoreCase(name)) {
			xfr_itm_gr_amt(value);
			return;
		}
		if ($xfr_lot_sno_gr_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_amt(value);
			return;
		}
		if ($xfr_grd_gr_amt.equalsIgnoreCase(name)) {
			xfr_grd_gr_amt(value);
			return;
		}
		if ($xfr_pack_gr_amt.equalsIgnoreCase(name)) {
			xfr_pack_gr_amt(value);
			return;
		}
		if ($ship_in_amt.equalsIgnoreCase(name)) {
			ship_in_amt(value);
			return;
		}
		if ($ex_ship_in_amt.equalsIgnoreCase(name)) {
			ex_ship_in_amt(value);
			return;
		}
		if ($ship_rtn_gr_amt.equalsIgnoreCase(name)) {
			ship_rtn_gr_amt(value);
			return;
		}
		if ($sls_rtn_gr_amt.equalsIgnoreCase(name)) {
			sls_rtn_gr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($arr_rtn_amt.equalsIgnoreCase(name)) {
			arr_rtn_amt(value);
			return;
		}
		if ($purc_gi_amt.equalsIgnoreCase(name)) {
			purc_gi_amt(value);
			return;
		}
		if ($onr_rcv_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_gi_amt(value);
			return;
		}
		if ($purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			purc_rtn_gi_amt(value);
			return;
		}
		if ($onr_rcv_ret_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_amt(value);
			return;
		}
		if ($xpns_purc_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_gi_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_amt(value);
			return;
		}
		if ($accpt_dfct_gi_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gi_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($loss_amt.equalsIgnoreCase(name)) {
			loss_amt(value);
			return;
		}
		if ($ffr_prov_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_gi_amt(value);
			return;
		}
		if ($onr_prov_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_gi_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_amt(value);
			return;
		}
		if ($onr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_amt(value);
			return;
		}
		if ($insp_gi_amt.equalsIgnoreCase(name)) {
			insp_gi_amt(value);
			return;
		}
		if ($insp_cmpl_gi_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gi_amt(value);
			return;
		}
		if ($insp_judg_gi_amt.equalsIgnoreCase(name)) {
			insp_judg_gi_amt(value);
			return;
		}
		if ($reinsp_gi_amt.equalsIgnoreCase(name)) {
			reinsp_gi_amt(value);
			return;
		}
		if ($insp_smpl_gi_amt.equalsIgnoreCase(name)) {
			insp_smpl_gi_amt(value);
			return;
		}
		if ($stk_adjst_gi_amt.equalsIgnoreCase(name)) {
			stk_adjst_gi_amt(value);
			return;
		}
		if ($prdct_wh_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_gi_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_amt(value);
			return;
		}
		if ($xfr_gi_amt.equalsIgnoreCase(name)) {
			xfr_gi_amt(value);
			return;
		}
		if ($xfr_out_amt.equalsIgnoreCase(name)) {
			xfr_out_amt(value);
			return;
		}
		if ($purc_xfr_out_amt.equalsIgnoreCase(name)) {
			purc_xfr_out_amt(value);
			return;
		}
		if ($xfr_rtn_gi_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gi_amt(value);
			return;
		}
		if ($acxfr_gi_amt.equalsIgnoreCase(name)) {
			acxfr_gi_amt(value);
			return;
		}
		if ($scrp_amt.equalsIgnoreCase(name)) {
			scrp_amt(value);
			return;
		}
		if ($xfr_itm_gi_amt.equalsIgnoreCase(name)) {
			xfr_itm_gi_amt(value);
			return;
		}
		if ($xfr_lot_sno_gi_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_amt(value);
			return;
		}
		if ($xfr_grd_gi_amt.equalsIgnoreCase(name)) {
			xfr_grd_gi_amt(value);
			return;
		}
		if ($xfr_pack_gi_amt.equalsIgnoreCase(name)) {
			xfr_pack_gi_amt(value);
			return;
		}
		if ($ship_out_amt.equalsIgnoreCase(name)) {
			ship_out_amt(value);
			return;
		}
		if ($ex_ship_out_amt.equalsIgnoreCase(name)) {
			ex_ship_out_amt(value);
			return;
		}
		if ($ship_rtn_gi_amt.equalsIgnoreCase(name)) {
			ship_rtn_gi_amt(value);
			return;
		}
		if ($sls_rtn_gi_amt.equalsIgnoreCase(name)) {
			sls_rtn_gi_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($ini_stk_qty.equalsIgnoreCase(name)) {
			ini_stk_qty(value);
			return;
		}
		if ($gr_total_qty.equalsIgnoreCase(name)) {
			gr_total_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_gr_qty.equalsIgnoreCase(name)) {
			purc_gr_qty(value);
			return;
		}
		if ($onr_rcv_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_gr_qty(value);
			return;
		}
		if ($purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			purc_rtn_gr_qty(value);
			return;
		}
		if ($onr_rcv_ret_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_qty(value);
			return;
		}
		if ($xpns_purc_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_gr_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_qty(value);
			return;
		}
		if ($accpt_dfct_gr_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gr_qty(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($bymfg_qty.equalsIgnoreCase(name)) {
			bymfg_qty(value);
			return;
		}
		if ($ffr_prov_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_gr_qty(value);
			return;
		}
		if ($onr_prov_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_gr_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_qty(value);
			return;
		}
		if ($onr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_qty(value);
			return;
		}
		if ($insp_gr_qty.equalsIgnoreCase(name)) {
			insp_gr_qty(value);
			return;
		}
		if ($insp_cmpl_gr_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gr_qty(value);
			return;
		}
		if ($insp_judg_gr_qty.equalsIgnoreCase(name)) {
			insp_judg_gr_qty(value);
			return;
		}
		if ($reinsp_gr_qty.equalsIgnoreCase(name)) {
			reinsp_gr_qty(value);
			return;
		}
		if ($stk_adjst_gr_qty.equalsIgnoreCase(name)) {
			stk_adjst_gr_qty(value);
			return;
		}
		if ($prdct_wh_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_gr_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_qty(value);
			return;
		}
		if ($xfr_gr_qty.equalsIgnoreCase(name)) {
			xfr_gr_qty(value);
			return;
		}
		if ($xfr_in_qty.equalsIgnoreCase(name)) {
			xfr_in_qty(value);
			return;
		}
		if ($purc_xfr_in_qty.equalsIgnoreCase(name)) {
			purc_xfr_in_qty(value);
			return;
		}
		if ($xfr_rtn_gr_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gr_qty(value);
			return;
		}
		if ($acxfr_gr_qty.equalsIgnoreCase(name)) {
			acxfr_gr_qty(value);
			return;
		}
		if ($arr_cststk_qty.equalsIgnoreCase(name)) {
			arr_cststk_qty(value);
			return;
		}
		if ($xfr_itm_gr_qty.equalsIgnoreCase(name)) {
			xfr_itm_gr_qty(value);
			return;
		}
		if ($xfr_lot_sno_gr_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_qty(value);
			return;
		}
		if ($xfr_grd_gr_qty.equalsIgnoreCase(name)) {
			xfr_grd_gr_qty(value);
			return;
		}
		if ($xfr_pack_gr_qty.equalsIgnoreCase(name)) {
			xfr_pack_gr_qty(value);
			return;
		}
		if ($ship_in_qty.equalsIgnoreCase(name)) {
			ship_in_qty(value);
			return;
		}
		if ($ex_ship_in_qty.equalsIgnoreCase(name)) {
			ex_ship_in_qty(value);
			return;
		}
		if ($ship_rtn_gr_qty.equalsIgnoreCase(name)) {
			ship_rtn_gr_qty(value);
			return;
		}
		if ($sls_rtn_gr_qty.equalsIgnoreCase(name)) {
			sls_rtn_gr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($arr_rtn_qty.equalsIgnoreCase(name)) {
			arr_rtn_qty(value);
			return;
		}
		if ($purc_gi_qty.equalsIgnoreCase(name)) {
			purc_gi_qty(value);
			return;
		}
		if ($onr_rcv_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_gi_qty(value);
			return;
		}
		if ($purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			purc_rtn_gi_qty(value);
			return;
		}
		if ($onr_rcv_ret_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_qty(value);
			return;
		}
		if ($xpns_purc_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_gi_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_qty(value);
			return;
		}
		if ($accpt_dfct_gi_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gi_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($ffr_prov_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_gi_qty(value);
			return;
		}
		if ($onr_prov_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_gi_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_qty(value);
			return;
		}
		if ($onr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_qty(value);
			return;
		}
		if ($insp_gi_qty.equalsIgnoreCase(name)) {
			insp_gi_qty(value);
			return;
		}
		if ($insp_cmpl_gi_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gi_qty(value);
			return;
		}
		if ($insp_judg_gi_qty.equalsIgnoreCase(name)) {
			insp_judg_gi_qty(value);
			return;
		}
		if ($reinsp_gi_qty.equalsIgnoreCase(name)) {
			reinsp_gi_qty(value);
			return;
		}
		if ($insp_smpl_gi_qty.equalsIgnoreCase(name)) {
			insp_smpl_gi_qty(value);
			return;
		}
		if ($stk_adjst_gi_qty.equalsIgnoreCase(name)) {
			stk_adjst_gi_qty(value);
			return;
		}
		if ($prdct_wh_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_gi_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_qty(value);
			return;
		}
		if ($xfr_gi_qty.equalsIgnoreCase(name)) {
			xfr_gi_qty(value);
			return;
		}
		if ($xfr_out_qty.equalsIgnoreCase(name)) {
			xfr_out_qty(value);
			return;
		}
		if ($purc_xfr_out_qty.equalsIgnoreCase(name)) {
			purc_xfr_out_qty(value);
			return;
		}
		if ($xfr_rtn_gi_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gi_qty(value);
			return;
		}
		if ($acxfr_gi_qty.equalsIgnoreCase(name)) {
			acxfr_gi_qty(value);
			return;
		}
		if ($scrp_qty.equalsIgnoreCase(name)) {
			scrp_qty(value);
			return;
		}
		if ($xfr_itm_gi_qty.equalsIgnoreCase(name)) {
			xfr_itm_gi_qty(value);
			return;
		}
		if ($xfr_lot_sno_gi_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_qty(value);
			return;
		}
		if ($xfr_grd_gi_qty.equalsIgnoreCase(name)) {
			xfr_grd_gi_qty(value);
			return;
		}
		if ($xfr_pack_gi_qty.equalsIgnoreCase(name)) {
			xfr_pack_gi_qty(value);
			return;
		}
		if ($ship_out_qty.equalsIgnoreCase(name)) {
			ship_out_qty(value);
			return;
		}
		if ($ex_ship_out_qty.equalsIgnoreCase(name)) {
			ex_ship_out_qty(value);
			return;
		}
		if ($ship_rtn_gi_qty.equalsIgnoreCase(name)) {
			ship_rtn_gi_qty(value);
			return;
		}
		if ($sls_rtn_gi_qty.equalsIgnoreCase(name)) {
			sls_rtn_gi_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($ini_stk_amt.equalsIgnoreCase(name)) {
			ini_stk_amt(value);
			return;
		}
		if ($gr_total_amt.equalsIgnoreCase(name)) {
			gr_total_amt(value);
			return;
		}
		if ($arr_amt.equalsIgnoreCase(name)) {
			arr_amt(value);
			return;
		}
		if ($purc_gr_amt.equalsIgnoreCase(name)) {
			purc_gr_amt(value);
			return;
		}
		if ($onr_rcv_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_gr_amt(value);
			return;
		}
		if ($purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			purc_rtn_gr_amt(value);
			return;
		}
		if ($onr_rcv_ret_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_amt(value);
			return;
		}
		if ($xpns_purc_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_gr_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_amt(value);
			return;
		}
		if ($accpt_dfct_gr_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gr_amt(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($bymfg_amt.equalsIgnoreCase(name)) {
			bymfg_amt(value);
			return;
		}
		if ($ffr_prov_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_gr_amt(value);
			return;
		}
		if ($onr_prov_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_gr_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_amt(value);
			return;
		}
		if ($onr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_amt(value);
			return;
		}
		if ($insp_gr_amt.equalsIgnoreCase(name)) {
			insp_gr_amt(value);
			return;
		}
		if ($insp_cmpl_gr_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gr_amt(value);
			return;
		}
		if ($insp_judg_gr_amt.equalsIgnoreCase(name)) {
			insp_judg_gr_amt(value);
			return;
		}
		if ($reinsp_gr_amt.equalsIgnoreCase(name)) {
			reinsp_gr_amt(value);
			return;
		}
		if ($stk_adjst_gr_amt.equalsIgnoreCase(name)) {
			stk_adjst_gr_amt(value);
			return;
		}
		if ($prdct_wh_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_gr_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_amt(value);
			return;
		}
		if ($xfr_gr_amt.equalsIgnoreCase(name)) {
			xfr_gr_amt(value);
			return;
		}
		if ($xfr_in_amt.equalsIgnoreCase(name)) {
			xfr_in_amt(value);
			return;
		}
		if ($purc_xfr_in_amt.equalsIgnoreCase(name)) {
			purc_xfr_in_amt(value);
			return;
		}
		if ($xfr_rtn_gr_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gr_amt(value);
			return;
		}
		if ($acxfr_gr_amt.equalsIgnoreCase(name)) {
			acxfr_gr_amt(value);
			return;
		}
		if ($arr_cststk_amt.equalsIgnoreCase(name)) {
			arr_cststk_amt(value);
			return;
		}
		if ($xfr_itm_gr_amt.equalsIgnoreCase(name)) {
			xfr_itm_gr_amt(value);
			return;
		}
		if ($xfr_lot_sno_gr_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_amt(value);
			return;
		}
		if ($xfr_grd_gr_amt.equalsIgnoreCase(name)) {
			xfr_grd_gr_amt(value);
			return;
		}
		if ($xfr_pack_gr_amt.equalsIgnoreCase(name)) {
			xfr_pack_gr_amt(value);
			return;
		}
		if ($ship_in_amt.equalsIgnoreCase(name)) {
			ship_in_amt(value);
			return;
		}
		if ($ex_ship_in_amt.equalsIgnoreCase(name)) {
			ex_ship_in_amt(value);
			return;
		}
		if ($ship_rtn_gr_amt.equalsIgnoreCase(name)) {
			ship_rtn_gr_amt(value);
			return;
		}
		if ($sls_rtn_gr_amt.equalsIgnoreCase(name)) {
			sls_rtn_gr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($arr_rtn_amt.equalsIgnoreCase(name)) {
			arr_rtn_amt(value);
			return;
		}
		if ($purc_gi_amt.equalsIgnoreCase(name)) {
			purc_gi_amt(value);
			return;
		}
		if ($onr_rcv_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_gi_amt(value);
			return;
		}
		if ($purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			purc_rtn_gi_amt(value);
			return;
		}
		if ($onr_rcv_ret_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_amt(value);
			return;
		}
		if ($xpns_purc_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_gi_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_amt(value);
			return;
		}
		if ($accpt_dfct_gi_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gi_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($loss_amt.equalsIgnoreCase(name)) {
			loss_amt(value);
			return;
		}
		if ($ffr_prov_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_gi_amt(value);
			return;
		}
		if ($onr_prov_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_gi_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_amt(value);
			return;
		}
		if ($onr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_amt(value);
			return;
		}
		if ($insp_gi_amt.equalsIgnoreCase(name)) {
			insp_gi_amt(value);
			return;
		}
		if ($insp_cmpl_gi_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gi_amt(value);
			return;
		}
		if ($insp_judg_gi_amt.equalsIgnoreCase(name)) {
			insp_judg_gi_amt(value);
			return;
		}
		if ($reinsp_gi_amt.equalsIgnoreCase(name)) {
			reinsp_gi_amt(value);
			return;
		}
		if ($insp_smpl_gi_amt.equalsIgnoreCase(name)) {
			insp_smpl_gi_amt(value);
			return;
		}
		if ($stk_adjst_gi_amt.equalsIgnoreCase(name)) {
			stk_adjst_gi_amt(value);
			return;
		}
		if ($prdct_wh_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_gi_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_amt(value);
			return;
		}
		if ($xfr_gi_amt.equalsIgnoreCase(name)) {
			xfr_gi_amt(value);
			return;
		}
		if ($xfr_out_amt.equalsIgnoreCase(name)) {
			xfr_out_amt(value);
			return;
		}
		if ($purc_xfr_out_amt.equalsIgnoreCase(name)) {
			purc_xfr_out_amt(value);
			return;
		}
		if ($xfr_rtn_gi_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gi_amt(value);
			return;
		}
		if ($acxfr_gi_amt.equalsIgnoreCase(name)) {
			acxfr_gi_amt(value);
			return;
		}
		if ($scrp_amt.equalsIgnoreCase(name)) {
			scrp_amt(value);
			return;
		}
		if ($xfr_itm_gi_amt.equalsIgnoreCase(name)) {
			xfr_itm_gi_amt(value);
			return;
		}
		if ($xfr_lot_sno_gi_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_amt(value);
			return;
		}
		if ($xfr_grd_gi_amt.equalsIgnoreCase(name)) {
			xfr_grd_gi_amt(value);
			return;
		}
		if ($xfr_pack_gi_amt.equalsIgnoreCase(name)) {
			xfr_pack_gi_amt(value);
			return;
		}
		if ($ship_out_amt.equalsIgnoreCase(name)) {
			ship_out_amt(value);
			return;
		}
		if ($ex_ship_out_amt.equalsIgnoreCase(name)) {
			ex_ship_out_amt(value);
			return;
		}
		if ($ship_rtn_gi_amt.equalsIgnoreCase(name)) {
			ship_rtn_gi_amt(value);
			return;
		}
		if ($sls_rtn_gi_amt.equalsIgnoreCase(name)) {
			sls_rtn_gi_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($ini_stk_qty.equalsIgnoreCase(name)) {
			ini_stk_qty(value);
			return;
		}
		if ($gr_total_qty.equalsIgnoreCase(name)) {
			gr_total_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_gr_qty.equalsIgnoreCase(name)) {
			purc_gr_qty(value);
			return;
		}
		if ($onr_rcv_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_gr_qty(value);
			return;
		}
		if ($purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			purc_rtn_gr_qty(value);
			return;
		}
		if ($onr_rcv_ret_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_qty(value);
			return;
		}
		if ($xpns_purc_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_gr_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_qty(value);
			return;
		}
		if ($accpt_dfct_gr_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gr_qty(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($bymfg_qty.equalsIgnoreCase(name)) {
			bymfg_qty(value);
			return;
		}
		if ($ffr_prov_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_gr_qty(value);
			return;
		}
		if ($onr_prov_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_gr_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_qty(value);
			return;
		}
		if ($onr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_qty(value);
			return;
		}
		if ($insp_gr_qty.equalsIgnoreCase(name)) {
			insp_gr_qty(value);
			return;
		}
		if ($insp_cmpl_gr_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gr_qty(value);
			return;
		}
		if ($insp_judg_gr_qty.equalsIgnoreCase(name)) {
			insp_judg_gr_qty(value);
			return;
		}
		if ($reinsp_gr_qty.equalsIgnoreCase(name)) {
			reinsp_gr_qty(value);
			return;
		}
		if ($stk_adjst_gr_qty.equalsIgnoreCase(name)) {
			stk_adjst_gr_qty(value);
			return;
		}
		if ($prdct_wh_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_gr_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_qty(value);
			return;
		}
		if ($xfr_gr_qty.equalsIgnoreCase(name)) {
			xfr_gr_qty(value);
			return;
		}
		if ($xfr_in_qty.equalsIgnoreCase(name)) {
			xfr_in_qty(value);
			return;
		}
		if ($purc_xfr_in_qty.equalsIgnoreCase(name)) {
			purc_xfr_in_qty(value);
			return;
		}
		if ($xfr_rtn_gr_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gr_qty(value);
			return;
		}
		if ($acxfr_gr_qty.equalsIgnoreCase(name)) {
			acxfr_gr_qty(value);
			return;
		}
		if ($arr_cststk_qty.equalsIgnoreCase(name)) {
			arr_cststk_qty(value);
			return;
		}
		if ($xfr_itm_gr_qty.equalsIgnoreCase(name)) {
			xfr_itm_gr_qty(value);
			return;
		}
		if ($xfr_lot_sno_gr_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_qty(value);
			return;
		}
		if ($xfr_grd_gr_qty.equalsIgnoreCase(name)) {
			xfr_grd_gr_qty(value);
			return;
		}
		if ($xfr_pack_gr_qty.equalsIgnoreCase(name)) {
			xfr_pack_gr_qty(value);
			return;
		}
		if ($ship_in_qty.equalsIgnoreCase(name)) {
			ship_in_qty(value);
			return;
		}
		if ($ex_ship_in_qty.equalsIgnoreCase(name)) {
			ex_ship_in_qty(value);
			return;
		}
		if ($ship_rtn_gr_qty.equalsIgnoreCase(name)) {
			ship_rtn_gr_qty(value);
			return;
		}
		if ($sls_rtn_gr_qty.equalsIgnoreCase(name)) {
			sls_rtn_gr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($arr_rtn_qty.equalsIgnoreCase(name)) {
			arr_rtn_qty(value);
			return;
		}
		if ($purc_gi_qty.equalsIgnoreCase(name)) {
			purc_gi_qty(value);
			return;
		}
		if ($onr_rcv_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_gi_qty(value);
			return;
		}
		if ($purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			purc_rtn_gi_qty(value);
			return;
		}
		if ($onr_rcv_ret_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_qty(value);
			return;
		}
		if ($xpns_purc_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_gi_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_qty(value);
			return;
		}
		if ($accpt_dfct_gi_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gi_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($ffr_prov_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_gi_qty(value);
			return;
		}
		if ($onr_prov_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_gi_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_qty(value);
			return;
		}
		if ($onr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_qty(value);
			return;
		}
		if ($insp_gi_qty.equalsIgnoreCase(name)) {
			insp_gi_qty(value);
			return;
		}
		if ($insp_cmpl_gi_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gi_qty(value);
			return;
		}
		if ($insp_judg_gi_qty.equalsIgnoreCase(name)) {
			insp_judg_gi_qty(value);
			return;
		}
		if ($reinsp_gi_qty.equalsIgnoreCase(name)) {
			reinsp_gi_qty(value);
			return;
		}
		if ($insp_smpl_gi_qty.equalsIgnoreCase(name)) {
			insp_smpl_gi_qty(value);
			return;
		}
		if ($stk_adjst_gi_qty.equalsIgnoreCase(name)) {
			stk_adjst_gi_qty(value);
			return;
		}
		if ($prdct_wh_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_gi_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_qty(value);
			return;
		}
		if ($xfr_gi_qty.equalsIgnoreCase(name)) {
			xfr_gi_qty(value);
			return;
		}
		if ($xfr_out_qty.equalsIgnoreCase(name)) {
			xfr_out_qty(value);
			return;
		}
		if ($purc_xfr_out_qty.equalsIgnoreCase(name)) {
			purc_xfr_out_qty(value);
			return;
		}
		if ($xfr_rtn_gi_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gi_qty(value);
			return;
		}
		if ($acxfr_gi_qty.equalsIgnoreCase(name)) {
			acxfr_gi_qty(value);
			return;
		}
		if ($scrp_qty.equalsIgnoreCase(name)) {
			scrp_qty(value);
			return;
		}
		if ($xfr_itm_gi_qty.equalsIgnoreCase(name)) {
			xfr_itm_gi_qty(value);
			return;
		}
		if ($xfr_lot_sno_gi_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_qty(value);
			return;
		}
		if ($xfr_grd_gi_qty.equalsIgnoreCase(name)) {
			xfr_grd_gi_qty(value);
			return;
		}
		if ($xfr_pack_gi_qty.equalsIgnoreCase(name)) {
			xfr_pack_gi_qty(value);
			return;
		}
		if ($ship_out_qty.equalsIgnoreCase(name)) {
			ship_out_qty(value);
			return;
		}
		if ($ex_ship_out_qty.equalsIgnoreCase(name)) {
			ex_ship_out_qty(value);
			return;
		}
		if ($ship_rtn_gi_qty.equalsIgnoreCase(name)) {
			ship_rtn_gi_qty(value);
			return;
		}
		if ($sls_rtn_gi_qty.equalsIgnoreCase(name)) {
			sls_rtn_gi_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($ini_stk_amt.equalsIgnoreCase(name)) {
			ini_stk_amt(value);
			return;
		}
		if ($gr_total_amt.equalsIgnoreCase(name)) {
			gr_total_amt(value);
			return;
		}
		if ($arr_amt.equalsIgnoreCase(name)) {
			arr_amt(value);
			return;
		}
		if ($purc_gr_amt.equalsIgnoreCase(name)) {
			purc_gr_amt(value);
			return;
		}
		if ($onr_rcv_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_gr_amt(value);
			return;
		}
		if ($purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			purc_rtn_gr_amt(value);
			return;
		}
		if ($onr_rcv_ret_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_amt(value);
			return;
		}
		if ($xpns_purc_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_gr_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_amt(value);
			return;
		}
		if ($accpt_dfct_gr_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gr_amt(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($bymfg_amt.equalsIgnoreCase(name)) {
			bymfg_amt(value);
			return;
		}
		if ($ffr_prov_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_gr_amt(value);
			return;
		}
		if ($onr_prov_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_gr_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_amt(value);
			return;
		}
		if ($onr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_amt(value);
			return;
		}
		if ($insp_gr_amt.equalsIgnoreCase(name)) {
			insp_gr_amt(value);
			return;
		}
		if ($insp_cmpl_gr_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gr_amt(value);
			return;
		}
		if ($insp_judg_gr_amt.equalsIgnoreCase(name)) {
			insp_judg_gr_amt(value);
			return;
		}
		if ($reinsp_gr_amt.equalsIgnoreCase(name)) {
			reinsp_gr_amt(value);
			return;
		}
		if ($stk_adjst_gr_amt.equalsIgnoreCase(name)) {
			stk_adjst_gr_amt(value);
			return;
		}
		if ($prdct_wh_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_gr_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_amt(value);
			return;
		}
		if ($xfr_gr_amt.equalsIgnoreCase(name)) {
			xfr_gr_amt(value);
			return;
		}
		if ($xfr_in_amt.equalsIgnoreCase(name)) {
			xfr_in_amt(value);
			return;
		}
		if ($purc_xfr_in_amt.equalsIgnoreCase(name)) {
			purc_xfr_in_amt(value);
			return;
		}
		if ($xfr_rtn_gr_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gr_amt(value);
			return;
		}
		if ($acxfr_gr_amt.equalsIgnoreCase(name)) {
			acxfr_gr_amt(value);
			return;
		}
		if ($arr_cststk_amt.equalsIgnoreCase(name)) {
			arr_cststk_amt(value);
			return;
		}
		if ($xfr_itm_gr_amt.equalsIgnoreCase(name)) {
			xfr_itm_gr_amt(value);
			return;
		}
		if ($xfr_lot_sno_gr_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_amt(value);
			return;
		}
		if ($xfr_grd_gr_amt.equalsIgnoreCase(name)) {
			xfr_grd_gr_amt(value);
			return;
		}
		if ($xfr_pack_gr_amt.equalsIgnoreCase(name)) {
			xfr_pack_gr_amt(value);
			return;
		}
		if ($ship_in_amt.equalsIgnoreCase(name)) {
			ship_in_amt(value);
			return;
		}
		if ($ex_ship_in_amt.equalsIgnoreCase(name)) {
			ex_ship_in_amt(value);
			return;
		}
		if ($ship_rtn_gr_amt.equalsIgnoreCase(name)) {
			ship_rtn_gr_amt(value);
			return;
		}
		if ($sls_rtn_gr_amt.equalsIgnoreCase(name)) {
			sls_rtn_gr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($arr_rtn_amt.equalsIgnoreCase(name)) {
			arr_rtn_amt(value);
			return;
		}
		if ($purc_gi_amt.equalsIgnoreCase(name)) {
			purc_gi_amt(value);
			return;
		}
		if ($onr_rcv_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_gi_amt(value);
			return;
		}
		if ($purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			purc_rtn_gi_amt(value);
			return;
		}
		if ($onr_rcv_ret_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_amt(value);
			return;
		}
		if ($xpns_purc_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_gi_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_amt(value);
			return;
		}
		if ($accpt_dfct_gi_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gi_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($loss_amt.equalsIgnoreCase(name)) {
			loss_amt(value);
			return;
		}
		if ($ffr_prov_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_gi_amt(value);
			return;
		}
		if ($onr_prov_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_gi_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_amt(value);
			return;
		}
		if ($onr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_amt(value);
			return;
		}
		if ($insp_gi_amt.equalsIgnoreCase(name)) {
			insp_gi_amt(value);
			return;
		}
		if ($insp_cmpl_gi_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gi_amt(value);
			return;
		}
		if ($insp_judg_gi_amt.equalsIgnoreCase(name)) {
			insp_judg_gi_amt(value);
			return;
		}
		if ($reinsp_gi_amt.equalsIgnoreCase(name)) {
			reinsp_gi_amt(value);
			return;
		}
		if ($insp_smpl_gi_amt.equalsIgnoreCase(name)) {
			insp_smpl_gi_amt(value);
			return;
		}
		if ($stk_adjst_gi_amt.equalsIgnoreCase(name)) {
			stk_adjst_gi_amt(value);
			return;
		}
		if ($prdct_wh_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_gi_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_amt(value);
			return;
		}
		if ($xfr_gi_amt.equalsIgnoreCase(name)) {
			xfr_gi_amt(value);
			return;
		}
		if ($xfr_out_amt.equalsIgnoreCase(name)) {
			xfr_out_amt(value);
			return;
		}
		if ($purc_xfr_out_amt.equalsIgnoreCase(name)) {
			purc_xfr_out_amt(value);
			return;
		}
		if ($xfr_rtn_gi_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gi_amt(value);
			return;
		}
		if ($acxfr_gi_amt.equalsIgnoreCase(name)) {
			acxfr_gi_amt(value);
			return;
		}
		if ($scrp_amt.equalsIgnoreCase(name)) {
			scrp_amt(value);
			return;
		}
		if ($xfr_itm_gi_amt.equalsIgnoreCase(name)) {
			xfr_itm_gi_amt(value);
			return;
		}
		if ($xfr_lot_sno_gi_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_amt(value);
			return;
		}
		if ($xfr_grd_gi_amt.equalsIgnoreCase(name)) {
			xfr_grd_gi_amt(value);
			return;
		}
		if ($xfr_pack_gi_amt.equalsIgnoreCase(name)) {
			xfr_pack_gi_amt(value);
			return;
		}
		if ($ship_out_amt.equalsIgnoreCase(name)) {
			ship_out_amt(value);
			return;
		}
		if ($ex_ship_out_amt.equalsIgnoreCase(name)) {
			ex_ship_out_amt(value);
			return;
		}
		if ($ship_rtn_gi_amt.equalsIgnoreCase(name)) {
			ship_rtn_gi_amt(value);
			return;
		}
		if ($sls_rtn_gi_amt.equalsIgnoreCase(name)) {
			sls_rtn_gi_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mly_io_cl_ym.equalsIgnoreCase(name)) {
			mly_io_cl_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
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
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
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
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
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
		if ($fix_no_typ.equalsIgnoreCase(name)) {
			fix_no_typ(value);
			return;
		}
		if ($fix_no_typ_nm.equalsIgnoreCase(name)) {
			fix_no_typ_nm(value);
			return;
		}
		if ($fix_no.equalsIgnoreCase(name)) {
			fix_no(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
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
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($pack_unit_rnd_typ.equalsIgnoreCase(name)) {
			pack_unit_rnd_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($base_cur_rnd_typ.equalsIgnoreCase(name)) {
			base_cur_rnd_typ(value);
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
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($ini_stk_qty.equalsIgnoreCase(name)) {
			ini_stk_qty(value);
			return;
		}
		if ($gr_total_qty.equalsIgnoreCase(name)) {
			gr_total_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_gr_qty.equalsIgnoreCase(name)) {
			purc_gr_qty(value);
			return;
		}
		if ($onr_rcv_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_gr_qty(value);
			return;
		}
		if ($purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			purc_rtn_gr_qty(value);
			return;
		}
		if ($onr_rcv_ret_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_qty(value);
			return;
		}
		if ($xpns_purc_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_gr_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_qty(value);
			return;
		}
		if ($accpt_dfct_gr_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gr_qty(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($bymfg_qty.equalsIgnoreCase(name)) {
			bymfg_qty(value);
			return;
		}
		if ($ffr_prov_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_gr_qty(value);
			return;
		}
		if ($onr_prov_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_gr_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_qty(value);
			return;
		}
		if ($onr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_qty(value);
			return;
		}
		if ($insp_gr_qty.equalsIgnoreCase(name)) {
			insp_gr_qty(value);
			return;
		}
		if ($insp_cmpl_gr_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gr_qty(value);
			return;
		}
		if ($insp_judg_gr_qty.equalsIgnoreCase(name)) {
			insp_judg_gr_qty(value);
			return;
		}
		if ($reinsp_gr_qty.equalsIgnoreCase(name)) {
			reinsp_gr_qty(value);
			return;
		}
		if ($stk_adjst_gr_qty.equalsIgnoreCase(name)) {
			stk_adjst_gr_qty(value);
			return;
		}
		if ($prdct_wh_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_gr_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_qty(value);
			return;
		}
		if ($xfr_gr_qty.equalsIgnoreCase(name)) {
			xfr_gr_qty(value);
			return;
		}
		if ($xfr_in_qty.equalsIgnoreCase(name)) {
			xfr_in_qty(value);
			return;
		}
		if ($purc_xfr_in_qty.equalsIgnoreCase(name)) {
			purc_xfr_in_qty(value);
			return;
		}
		if ($xfr_rtn_gr_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gr_qty(value);
			return;
		}
		if ($acxfr_gr_qty.equalsIgnoreCase(name)) {
			acxfr_gr_qty(value);
			return;
		}
		if ($arr_cststk_qty.equalsIgnoreCase(name)) {
			arr_cststk_qty(value);
			return;
		}
		if ($xfr_itm_gr_qty.equalsIgnoreCase(name)) {
			xfr_itm_gr_qty(value);
			return;
		}
		if ($xfr_lot_sno_gr_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_qty(value);
			return;
		}
		if ($xfr_grd_gr_qty.equalsIgnoreCase(name)) {
			xfr_grd_gr_qty(value);
			return;
		}
		if ($xfr_pack_gr_qty.equalsIgnoreCase(name)) {
			xfr_pack_gr_qty(value);
			return;
		}
		if ($ship_in_qty.equalsIgnoreCase(name)) {
			ship_in_qty(value);
			return;
		}
		if ($ex_ship_in_qty.equalsIgnoreCase(name)) {
			ex_ship_in_qty(value);
			return;
		}
		if ($ship_rtn_gr_qty.equalsIgnoreCase(name)) {
			ship_rtn_gr_qty(value);
			return;
		}
		if ($sls_rtn_gr_qty.equalsIgnoreCase(name)) {
			sls_rtn_gr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($arr_rtn_qty.equalsIgnoreCase(name)) {
			arr_rtn_qty(value);
			return;
		}
		if ($purc_gi_qty.equalsIgnoreCase(name)) {
			purc_gi_qty(value);
			return;
		}
		if ($onr_rcv_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_gi_qty(value);
			return;
		}
		if ($purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			purc_rtn_gi_qty(value);
			return;
		}
		if ($onr_rcv_ret_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_qty(value);
			return;
		}
		if ($xpns_purc_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_gi_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_qty(value);
			return;
		}
		if ($accpt_dfct_gi_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gi_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($ffr_prov_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_gi_qty(value);
			return;
		}
		if ($onr_prov_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_gi_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_qty(value);
			return;
		}
		if ($onr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_qty(value);
			return;
		}
		if ($insp_gi_qty.equalsIgnoreCase(name)) {
			insp_gi_qty(value);
			return;
		}
		if ($insp_cmpl_gi_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gi_qty(value);
			return;
		}
		if ($insp_judg_gi_qty.equalsIgnoreCase(name)) {
			insp_judg_gi_qty(value);
			return;
		}
		if ($reinsp_gi_qty.equalsIgnoreCase(name)) {
			reinsp_gi_qty(value);
			return;
		}
		if ($insp_smpl_gi_qty.equalsIgnoreCase(name)) {
			insp_smpl_gi_qty(value);
			return;
		}
		if ($stk_adjst_gi_qty.equalsIgnoreCase(name)) {
			stk_adjst_gi_qty(value);
			return;
		}
		if ($prdct_wh_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_gi_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_qty(value);
			return;
		}
		if ($xfr_gi_qty.equalsIgnoreCase(name)) {
			xfr_gi_qty(value);
			return;
		}
		if ($xfr_out_qty.equalsIgnoreCase(name)) {
			xfr_out_qty(value);
			return;
		}
		if ($purc_xfr_out_qty.equalsIgnoreCase(name)) {
			purc_xfr_out_qty(value);
			return;
		}
		if ($xfr_rtn_gi_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gi_qty(value);
			return;
		}
		if ($acxfr_gi_qty.equalsIgnoreCase(name)) {
			acxfr_gi_qty(value);
			return;
		}
		if ($scrp_qty.equalsIgnoreCase(name)) {
			scrp_qty(value);
			return;
		}
		if ($xfr_itm_gi_qty.equalsIgnoreCase(name)) {
			xfr_itm_gi_qty(value);
			return;
		}
		if ($xfr_lot_sno_gi_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_qty(value);
			return;
		}
		if ($xfr_grd_gi_qty.equalsIgnoreCase(name)) {
			xfr_grd_gi_qty(value);
			return;
		}
		if ($xfr_pack_gi_qty.equalsIgnoreCase(name)) {
			xfr_pack_gi_qty(value);
			return;
		}
		if ($ship_out_qty.equalsIgnoreCase(name)) {
			ship_out_qty(value);
			return;
		}
		if ($ex_ship_out_qty.equalsIgnoreCase(name)) {
			ex_ship_out_qty(value);
			return;
		}
		if ($ship_rtn_gi_qty.equalsIgnoreCase(name)) {
			ship_rtn_gi_qty(value);
			return;
		}
		if ($sls_rtn_gi_qty.equalsIgnoreCase(name)) {
			sls_rtn_gi_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($ini_stk_amt.equalsIgnoreCase(name)) {
			ini_stk_amt(value);
			return;
		}
		if ($gr_total_amt.equalsIgnoreCase(name)) {
			gr_total_amt(value);
			return;
		}
		if ($arr_amt.equalsIgnoreCase(name)) {
			arr_amt(value);
			return;
		}
		if ($purc_gr_amt.equalsIgnoreCase(name)) {
			purc_gr_amt(value);
			return;
		}
		if ($onr_rcv_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_gr_amt(value);
			return;
		}
		if ($purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			purc_rtn_gr_amt(value);
			return;
		}
		if ($onr_rcv_ret_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_amt(value);
			return;
		}
		if ($xpns_purc_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_gr_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_amt(value);
			return;
		}
		if ($accpt_dfct_gr_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gr_amt(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($bymfg_amt.equalsIgnoreCase(name)) {
			bymfg_amt(value);
			return;
		}
		if ($ffr_prov_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_gr_amt(value);
			return;
		}
		if ($onr_prov_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_gr_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_amt(value);
			return;
		}
		if ($onr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_amt(value);
			return;
		}
		if ($insp_gr_amt.equalsIgnoreCase(name)) {
			insp_gr_amt(value);
			return;
		}
		if ($insp_cmpl_gr_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gr_amt(value);
			return;
		}
		if ($insp_judg_gr_amt.equalsIgnoreCase(name)) {
			insp_judg_gr_amt(value);
			return;
		}
		if ($reinsp_gr_amt.equalsIgnoreCase(name)) {
			reinsp_gr_amt(value);
			return;
		}
		if ($stk_adjst_gr_amt.equalsIgnoreCase(name)) {
			stk_adjst_gr_amt(value);
			return;
		}
		if ($prdct_wh_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_gr_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_amt(value);
			return;
		}
		if ($xfr_gr_amt.equalsIgnoreCase(name)) {
			xfr_gr_amt(value);
			return;
		}
		if ($xfr_in_amt.equalsIgnoreCase(name)) {
			xfr_in_amt(value);
			return;
		}
		if ($purc_xfr_in_amt.equalsIgnoreCase(name)) {
			purc_xfr_in_amt(value);
			return;
		}
		if ($xfr_rtn_gr_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gr_amt(value);
			return;
		}
		if ($acxfr_gr_amt.equalsIgnoreCase(name)) {
			acxfr_gr_amt(value);
			return;
		}
		if ($arr_cststk_amt.equalsIgnoreCase(name)) {
			arr_cststk_amt(value);
			return;
		}
		if ($xfr_itm_gr_amt.equalsIgnoreCase(name)) {
			xfr_itm_gr_amt(value);
			return;
		}
		if ($xfr_lot_sno_gr_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_amt(value);
			return;
		}
		if ($xfr_grd_gr_amt.equalsIgnoreCase(name)) {
			xfr_grd_gr_amt(value);
			return;
		}
		if ($xfr_pack_gr_amt.equalsIgnoreCase(name)) {
			xfr_pack_gr_amt(value);
			return;
		}
		if ($ship_in_amt.equalsIgnoreCase(name)) {
			ship_in_amt(value);
			return;
		}
		if ($ex_ship_in_amt.equalsIgnoreCase(name)) {
			ex_ship_in_amt(value);
			return;
		}
		if ($ship_rtn_gr_amt.equalsIgnoreCase(name)) {
			ship_rtn_gr_amt(value);
			return;
		}
		if ($sls_rtn_gr_amt.equalsIgnoreCase(name)) {
			sls_rtn_gr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($arr_rtn_amt.equalsIgnoreCase(name)) {
			arr_rtn_amt(value);
			return;
		}
		if ($purc_gi_amt.equalsIgnoreCase(name)) {
			purc_gi_amt(value);
			return;
		}
		if ($onr_rcv_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_gi_amt(value);
			return;
		}
		if ($purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			purc_rtn_gi_amt(value);
			return;
		}
		if ($onr_rcv_ret_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_amt(value);
			return;
		}
		if ($xpns_purc_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_gi_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_amt(value);
			return;
		}
		if ($accpt_dfct_gi_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gi_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($loss_amt.equalsIgnoreCase(name)) {
			loss_amt(value);
			return;
		}
		if ($ffr_prov_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_gi_amt(value);
			return;
		}
		if ($onr_prov_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_gi_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_amt(value);
			return;
		}
		if ($onr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_amt(value);
			return;
		}
		if ($insp_gi_amt.equalsIgnoreCase(name)) {
			insp_gi_amt(value);
			return;
		}
		if ($insp_cmpl_gi_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gi_amt(value);
			return;
		}
		if ($insp_judg_gi_amt.equalsIgnoreCase(name)) {
			insp_judg_gi_amt(value);
			return;
		}
		if ($reinsp_gi_amt.equalsIgnoreCase(name)) {
			reinsp_gi_amt(value);
			return;
		}
		if ($insp_smpl_gi_amt.equalsIgnoreCase(name)) {
			insp_smpl_gi_amt(value);
			return;
		}
		if ($stk_adjst_gi_amt.equalsIgnoreCase(name)) {
			stk_adjst_gi_amt(value);
			return;
		}
		if ($prdct_wh_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_gi_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_amt(value);
			return;
		}
		if ($xfr_gi_amt.equalsIgnoreCase(name)) {
			xfr_gi_amt(value);
			return;
		}
		if ($xfr_out_amt.equalsIgnoreCase(name)) {
			xfr_out_amt(value);
			return;
		}
		if ($purc_xfr_out_amt.equalsIgnoreCase(name)) {
			purc_xfr_out_amt(value);
			return;
		}
		if ($xfr_rtn_gi_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gi_amt(value);
			return;
		}
		if ($acxfr_gi_amt.equalsIgnoreCase(name)) {
			acxfr_gi_amt(value);
			return;
		}
		if ($scrp_amt.equalsIgnoreCase(name)) {
			scrp_amt(value);
			return;
		}
		if ($xfr_itm_gi_amt.equalsIgnoreCase(name)) {
			xfr_itm_gi_amt(value);
			return;
		}
		if ($xfr_lot_sno_gi_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_amt(value);
			return;
		}
		if ($xfr_grd_gi_amt.equalsIgnoreCase(name)) {
			xfr_grd_gi_amt(value);
			return;
		}
		if ($xfr_pack_gi_amt.equalsIgnoreCase(name)) {
			xfr_pack_gi_amt(value);
			return;
		}
		if ($ship_out_amt.equalsIgnoreCase(name)) {
			ship_out_amt(value);
			return;
		}
		if ($ex_ship_out_amt.equalsIgnoreCase(name)) {
			ex_ship_out_amt(value);
			return;
		}
		if ($ship_rtn_gi_amt.equalsIgnoreCase(name)) {
			ship_rtn_gi_amt(value);
			return;
		}
		if ($sls_rtn_gi_amt.equalsIgnoreCase(name)) {
			sls_rtn_gi_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($ini_stk_qty.equalsIgnoreCase(name)) {
			ini_stk_qty(value);
			return;
		}
		if ($gr_total_qty.equalsIgnoreCase(name)) {
			gr_total_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_gr_qty.equalsIgnoreCase(name)) {
			purc_gr_qty(value);
			return;
		}
		if ($onr_rcv_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_gr_qty(value);
			return;
		}
		if ($purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			purc_rtn_gr_qty(value);
			return;
		}
		if ($onr_rcv_ret_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_qty(value);
			return;
		}
		if ($xpns_purc_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_gr_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_qty(value);
			return;
		}
		if ($accpt_dfct_gr_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gr_qty(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($bymfg_qty.equalsIgnoreCase(name)) {
			bymfg_qty(value);
			return;
		}
		if ($ffr_prov_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_gr_qty(value);
			return;
		}
		if ($onr_prov_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_gr_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_qty(value);
			return;
		}
		if ($onr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_qty(value);
			return;
		}
		if ($insp_gr_qty.equalsIgnoreCase(name)) {
			insp_gr_qty(value);
			return;
		}
		if ($insp_cmpl_gr_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gr_qty(value);
			return;
		}
		if ($insp_judg_gr_qty.equalsIgnoreCase(name)) {
			insp_judg_gr_qty(value);
			return;
		}
		if ($reinsp_gr_qty.equalsIgnoreCase(name)) {
			reinsp_gr_qty(value);
			return;
		}
		if ($stk_adjst_gr_qty.equalsIgnoreCase(name)) {
			stk_adjst_gr_qty(value);
			return;
		}
		if ($prdct_wh_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_gr_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_qty(value);
			return;
		}
		if ($xfr_gr_qty.equalsIgnoreCase(name)) {
			xfr_gr_qty(value);
			return;
		}
		if ($xfr_in_qty.equalsIgnoreCase(name)) {
			xfr_in_qty(value);
			return;
		}
		if ($purc_xfr_in_qty.equalsIgnoreCase(name)) {
			purc_xfr_in_qty(value);
			return;
		}
		if ($xfr_rtn_gr_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gr_qty(value);
			return;
		}
		if ($acxfr_gr_qty.equalsIgnoreCase(name)) {
			acxfr_gr_qty(value);
			return;
		}
		if ($arr_cststk_qty.equalsIgnoreCase(name)) {
			arr_cststk_qty(value);
			return;
		}
		if ($xfr_itm_gr_qty.equalsIgnoreCase(name)) {
			xfr_itm_gr_qty(value);
			return;
		}
		if ($xfr_lot_sno_gr_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_qty(value);
			return;
		}
		if ($xfr_grd_gr_qty.equalsIgnoreCase(name)) {
			xfr_grd_gr_qty(value);
			return;
		}
		if ($xfr_pack_gr_qty.equalsIgnoreCase(name)) {
			xfr_pack_gr_qty(value);
			return;
		}
		if ($ship_in_qty.equalsIgnoreCase(name)) {
			ship_in_qty(value);
			return;
		}
		if ($ex_ship_in_qty.equalsIgnoreCase(name)) {
			ex_ship_in_qty(value);
			return;
		}
		if ($ship_rtn_gr_qty.equalsIgnoreCase(name)) {
			ship_rtn_gr_qty(value);
			return;
		}
		if ($sls_rtn_gr_qty.equalsIgnoreCase(name)) {
			sls_rtn_gr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($arr_rtn_qty.equalsIgnoreCase(name)) {
			arr_rtn_qty(value);
			return;
		}
		if ($purc_gi_qty.equalsIgnoreCase(name)) {
			purc_gi_qty(value);
			return;
		}
		if ($onr_rcv_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_gi_qty(value);
			return;
		}
		if ($purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			purc_rtn_gi_qty(value);
			return;
		}
		if ($onr_rcv_ret_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_qty(value);
			return;
		}
		if ($xpns_purc_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_gi_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_qty(value);
			return;
		}
		if ($accpt_dfct_gi_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gi_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($ffr_prov_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_gi_qty(value);
			return;
		}
		if ($onr_prov_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_gi_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_qty(value);
			return;
		}
		if ($onr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_qty(value);
			return;
		}
		if ($insp_gi_qty.equalsIgnoreCase(name)) {
			insp_gi_qty(value);
			return;
		}
		if ($insp_cmpl_gi_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gi_qty(value);
			return;
		}
		if ($insp_judg_gi_qty.equalsIgnoreCase(name)) {
			insp_judg_gi_qty(value);
			return;
		}
		if ($reinsp_gi_qty.equalsIgnoreCase(name)) {
			reinsp_gi_qty(value);
			return;
		}
		if ($insp_smpl_gi_qty.equalsIgnoreCase(name)) {
			insp_smpl_gi_qty(value);
			return;
		}
		if ($stk_adjst_gi_qty.equalsIgnoreCase(name)) {
			stk_adjst_gi_qty(value);
			return;
		}
		if ($prdct_wh_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_gi_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_qty(value);
			return;
		}
		if ($xfr_gi_qty.equalsIgnoreCase(name)) {
			xfr_gi_qty(value);
			return;
		}
		if ($xfr_out_qty.equalsIgnoreCase(name)) {
			xfr_out_qty(value);
			return;
		}
		if ($purc_xfr_out_qty.equalsIgnoreCase(name)) {
			purc_xfr_out_qty(value);
			return;
		}
		if ($xfr_rtn_gi_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gi_qty(value);
			return;
		}
		if ($acxfr_gi_qty.equalsIgnoreCase(name)) {
			acxfr_gi_qty(value);
			return;
		}
		if ($scrp_qty.equalsIgnoreCase(name)) {
			scrp_qty(value);
			return;
		}
		if ($xfr_itm_gi_qty.equalsIgnoreCase(name)) {
			xfr_itm_gi_qty(value);
			return;
		}
		if ($xfr_lot_sno_gi_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_qty(value);
			return;
		}
		if ($xfr_grd_gi_qty.equalsIgnoreCase(name)) {
			xfr_grd_gi_qty(value);
			return;
		}
		if ($xfr_pack_gi_qty.equalsIgnoreCase(name)) {
			xfr_pack_gi_qty(value);
			return;
		}
		if ($ship_out_qty.equalsIgnoreCase(name)) {
			ship_out_qty(value);
			return;
		}
		if ($ex_ship_out_qty.equalsIgnoreCase(name)) {
			ex_ship_out_qty(value);
			return;
		}
		if ($ship_rtn_gi_qty.equalsIgnoreCase(name)) {
			ship_rtn_gi_qty(value);
			return;
		}
		if ($sls_rtn_gi_qty.equalsIgnoreCase(name)) {
			sls_rtn_gi_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($ini_stk_amt.equalsIgnoreCase(name)) {
			ini_stk_amt(value);
			return;
		}
		if ($gr_total_amt.equalsIgnoreCase(name)) {
			gr_total_amt(value);
			return;
		}
		if ($arr_amt.equalsIgnoreCase(name)) {
			arr_amt(value);
			return;
		}
		if ($purc_gr_amt.equalsIgnoreCase(name)) {
			purc_gr_amt(value);
			return;
		}
		if ($onr_rcv_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_gr_amt(value);
			return;
		}
		if ($purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			purc_rtn_gr_amt(value);
			return;
		}
		if ($onr_rcv_ret_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_amt(value);
			return;
		}
		if ($xpns_purc_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_gr_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_amt(value);
			return;
		}
		if ($accpt_dfct_gr_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gr_amt(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($bymfg_amt.equalsIgnoreCase(name)) {
			bymfg_amt(value);
			return;
		}
		if ($ffr_prov_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_gr_amt(value);
			return;
		}
		if ($onr_prov_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_gr_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_amt(value);
			return;
		}
		if ($onr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_amt(value);
			return;
		}
		if ($insp_gr_amt.equalsIgnoreCase(name)) {
			insp_gr_amt(value);
			return;
		}
		if ($insp_cmpl_gr_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gr_amt(value);
			return;
		}
		if ($insp_judg_gr_amt.equalsIgnoreCase(name)) {
			insp_judg_gr_amt(value);
			return;
		}
		if ($reinsp_gr_amt.equalsIgnoreCase(name)) {
			reinsp_gr_amt(value);
			return;
		}
		if ($stk_adjst_gr_amt.equalsIgnoreCase(name)) {
			stk_adjst_gr_amt(value);
			return;
		}
		if ($prdct_wh_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_gr_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_amt(value);
			return;
		}
		if ($xfr_gr_amt.equalsIgnoreCase(name)) {
			xfr_gr_amt(value);
			return;
		}
		if ($xfr_in_amt.equalsIgnoreCase(name)) {
			xfr_in_amt(value);
			return;
		}
		if ($purc_xfr_in_amt.equalsIgnoreCase(name)) {
			purc_xfr_in_amt(value);
			return;
		}
		if ($xfr_rtn_gr_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gr_amt(value);
			return;
		}
		if ($acxfr_gr_amt.equalsIgnoreCase(name)) {
			acxfr_gr_amt(value);
			return;
		}
		if ($arr_cststk_amt.equalsIgnoreCase(name)) {
			arr_cststk_amt(value);
			return;
		}
		if ($xfr_itm_gr_amt.equalsIgnoreCase(name)) {
			xfr_itm_gr_amt(value);
			return;
		}
		if ($xfr_lot_sno_gr_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_amt(value);
			return;
		}
		if ($xfr_grd_gr_amt.equalsIgnoreCase(name)) {
			xfr_grd_gr_amt(value);
			return;
		}
		if ($xfr_pack_gr_amt.equalsIgnoreCase(name)) {
			xfr_pack_gr_amt(value);
			return;
		}
		if ($ship_in_amt.equalsIgnoreCase(name)) {
			ship_in_amt(value);
			return;
		}
		if ($ex_ship_in_amt.equalsIgnoreCase(name)) {
			ex_ship_in_amt(value);
			return;
		}
		if ($ship_rtn_gr_amt.equalsIgnoreCase(name)) {
			ship_rtn_gr_amt(value);
			return;
		}
		if ($sls_rtn_gr_amt.equalsIgnoreCase(name)) {
			sls_rtn_gr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($arr_rtn_amt.equalsIgnoreCase(name)) {
			arr_rtn_amt(value);
			return;
		}
		if ($purc_gi_amt.equalsIgnoreCase(name)) {
			purc_gi_amt(value);
			return;
		}
		if ($onr_rcv_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_gi_amt(value);
			return;
		}
		if ($purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			purc_rtn_gi_amt(value);
			return;
		}
		if ($onr_rcv_ret_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_amt(value);
			return;
		}
		if ($xpns_purc_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_gi_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_amt(value);
			return;
		}
		if ($accpt_dfct_gi_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gi_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($loss_amt.equalsIgnoreCase(name)) {
			loss_amt(value);
			return;
		}
		if ($ffr_prov_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_gi_amt(value);
			return;
		}
		if ($onr_prov_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_gi_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_amt(value);
			return;
		}
		if ($onr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_amt(value);
			return;
		}
		if ($insp_gi_amt.equalsIgnoreCase(name)) {
			insp_gi_amt(value);
			return;
		}
		if ($insp_cmpl_gi_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gi_amt(value);
			return;
		}
		if ($insp_judg_gi_amt.equalsIgnoreCase(name)) {
			insp_judg_gi_amt(value);
			return;
		}
		if ($reinsp_gi_amt.equalsIgnoreCase(name)) {
			reinsp_gi_amt(value);
			return;
		}
		if ($insp_smpl_gi_amt.equalsIgnoreCase(name)) {
			insp_smpl_gi_amt(value);
			return;
		}
		if ($stk_adjst_gi_amt.equalsIgnoreCase(name)) {
			stk_adjst_gi_amt(value);
			return;
		}
		if ($prdct_wh_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_gi_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_amt(value);
			return;
		}
		if ($xfr_gi_amt.equalsIgnoreCase(name)) {
			xfr_gi_amt(value);
			return;
		}
		if ($xfr_out_amt.equalsIgnoreCase(name)) {
			xfr_out_amt(value);
			return;
		}
		if ($purc_xfr_out_amt.equalsIgnoreCase(name)) {
			purc_xfr_out_amt(value);
			return;
		}
		if ($xfr_rtn_gi_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gi_amt(value);
			return;
		}
		if ($acxfr_gi_amt.equalsIgnoreCase(name)) {
			acxfr_gi_amt(value);
			return;
		}
		if ($scrp_amt.equalsIgnoreCase(name)) {
			scrp_amt(value);
			return;
		}
		if ($xfr_itm_gi_amt.equalsIgnoreCase(name)) {
			xfr_itm_gi_amt(value);
			return;
		}
		if ($xfr_lot_sno_gi_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_amt(value);
			return;
		}
		if ($xfr_grd_gi_amt.equalsIgnoreCase(name)) {
			xfr_grd_gi_amt(value);
			return;
		}
		if ($xfr_pack_gi_amt.equalsIgnoreCase(name)) {
			xfr_pack_gi_amt(value);
			return;
		}
		if ($ship_out_amt.equalsIgnoreCase(name)) {
			ship_out_amt(value);
			return;
		}
		if ($ex_ship_out_amt.equalsIgnoreCase(name)) {
			ex_ship_out_amt(value);
			return;
		}
		if ($ship_rtn_gi_amt.equalsIgnoreCase(name)) {
			ship_rtn_gi_amt(value);
			return;
		}
		if ($sls_rtn_gi_amt.equalsIgnoreCase(name)) {
			sls_rtn_gi_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($ini_stk_qty.equalsIgnoreCase(name)) {
			ini_stk_qty(value);
			return;
		}
		if ($gr_total_qty.equalsIgnoreCase(name)) {
			gr_total_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_gr_qty.equalsIgnoreCase(name)) {
			purc_gr_qty(value);
			return;
		}
		if ($onr_rcv_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_gr_qty(value);
			return;
		}
		if ($purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			purc_rtn_gr_qty(value);
			return;
		}
		if ($onr_rcv_ret_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_qty(value);
			return;
		}
		if ($xpns_purc_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_gr_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_qty(value);
			return;
		}
		if ($accpt_dfct_gr_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gr_qty(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($bymfg_qty.equalsIgnoreCase(name)) {
			bymfg_qty(value);
			return;
		}
		if ($ffr_prov_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_gr_qty(value);
			return;
		}
		if ($onr_prov_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_gr_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_qty(value);
			return;
		}
		if ($onr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_qty(value);
			return;
		}
		if ($insp_gr_qty.equalsIgnoreCase(name)) {
			insp_gr_qty(value);
			return;
		}
		if ($insp_cmpl_gr_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gr_qty(value);
			return;
		}
		if ($insp_judg_gr_qty.equalsIgnoreCase(name)) {
			insp_judg_gr_qty(value);
			return;
		}
		if ($reinsp_gr_qty.equalsIgnoreCase(name)) {
			reinsp_gr_qty(value);
			return;
		}
		if ($stk_adjst_gr_qty.equalsIgnoreCase(name)) {
			stk_adjst_gr_qty(value);
			return;
		}
		if ($prdct_wh_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_gr_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_qty(value);
			return;
		}
		if ($xfr_gr_qty.equalsIgnoreCase(name)) {
			xfr_gr_qty(value);
			return;
		}
		if ($xfr_in_qty.equalsIgnoreCase(name)) {
			xfr_in_qty(value);
			return;
		}
		if ($purc_xfr_in_qty.equalsIgnoreCase(name)) {
			purc_xfr_in_qty(value);
			return;
		}
		if ($xfr_rtn_gr_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gr_qty(value);
			return;
		}
		if ($acxfr_gr_qty.equalsIgnoreCase(name)) {
			acxfr_gr_qty(value);
			return;
		}
		if ($arr_cststk_qty.equalsIgnoreCase(name)) {
			arr_cststk_qty(value);
			return;
		}
		if ($xfr_itm_gr_qty.equalsIgnoreCase(name)) {
			xfr_itm_gr_qty(value);
			return;
		}
		if ($xfr_lot_sno_gr_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_qty(value);
			return;
		}
		if ($xfr_grd_gr_qty.equalsIgnoreCase(name)) {
			xfr_grd_gr_qty(value);
			return;
		}
		if ($xfr_pack_gr_qty.equalsIgnoreCase(name)) {
			xfr_pack_gr_qty(value);
			return;
		}
		if ($ship_in_qty.equalsIgnoreCase(name)) {
			ship_in_qty(value);
			return;
		}
		if ($ex_ship_in_qty.equalsIgnoreCase(name)) {
			ex_ship_in_qty(value);
			return;
		}
		if ($ship_rtn_gr_qty.equalsIgnoreCase(name)) {
			ship_rtn_gr_qty(value);
			return;
		}
		if ($sls_rtn_gr_qty.equalsIgnoreCase(name)) {
			sls_rtn_gr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($arr_rtn_qty.equalsIgnoreCase(name)) {
			arr_rtn_qty(value);
			return;
		}
		if ($purc_gi_qty.equalsIgnoreCase(name)) {
			purc_gi_qty(value);
			return;
		}
		if ($onr_rcv_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_gi_qty(value);
			return;
		}
		if ($purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			purc_rtn_gi_qty(value);
			return;
		}
		if ($onr_rcv_ret_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_qty(value);
			return;
		}
		if ($xpns_purc_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_gi_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_qty(value);
			return;
		}
		if ($accpt_dfct_gi_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gi_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($ffr_prov_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_gi_qty(value);
			return;
		}
		if ($onr_prov_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_gi_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_qty(value);
			return;
		}
		if ($onr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_qty(value);
			return;
		}
		if ($insp_gi_qty.equalsIgnoreCase(name)) {
			insp_gi_qty(value);
			return;
		}
		if ($insp_cmpl_gi_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gi_qty(value);
			return;
		}
		if ($insp_judg_gi_qty.equalsIgnoreCase(name)) {
			insp_judg_gi_qty(value);
			return;
		}
		if ($reinsp_gi_qty.equalsIgnoreCase(name)) {
			reinsp_gi_qty(value);
			return;
		}
		if ($insp_smpl_gi_qty.equalsIgnoreCase(name)) {
			insp_smpl_gi_qty(value);
			return;
		}
		if ($stk_adjst_gi_qty.equalsIgnoreCase(name)) {
			stk_adjst_gi_qty(value);
			return;
		}
		if ($prdct_wh_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_gi_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_qty(value);
			return;
		}
		if ($xfr_gi_qty.equalsIgnoreCase(name)) {
			xfr_gi_qty(value);
			return;
		}
		if ($xfr_out_qty.equalsIgnoreCase(name)) {
			xfr_out_qty(value);
			return;
		}
		if ($purc_xfr_out_qty.equalsIgnoreCase(name)) {
			purc_xfr_out_qty(value);
			return;
		}
		if ($xfr_rtn_gi_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gi_qty(value);
			return;
		}
		if ($acxfr_gi_qty.equalsIgnoreCase(name)) {
			acxfr_gi_qty(value);
			return;
		}
		if ($scrp_qty.equalsIgnoreCase(name)) {
			scrp_qty(value);
			return;
		}
		if ($xfr_itm_gi_qty.equalsIgnoreCase(name)) {
			xfr_itm_gi_qty(value);
			return;
		}
		if ($xfr_lot_sno_gi_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_qty(value);
			return;
		}
		if ($xfr_grd_gi_qty.equalsIgnoreCase(name)) {
			xfr_grd_gi_qty(value);
			return;
		}
		if ($xfr_pack_gi_qty.equalsIgnoreCase(name)) {
			xfr_pack_gi_qty(value);
			return;
		}
		if ($ship_out_qty.equalsIgnoreCase(name)) {
			ship_out_qty(value);
			return;
		}
		if ($ex_ship_out_qty.equalsIgnoreCase(name)) {
			ex_ship_out_qty(value);
			return;
		}
		if ($ship_rtn_gi_qty.equalsIgnoreCase(name)) {
			ship_rtn_gi_qty(value);
			return;
		}
		if ($sls_rtn_gi_qty.equalsIgnoreCase(name)) {
			sls_rtn_gi_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($ini_stk_amt.equalsIgnoreCase(name)) {
			ini_stk_amt(value);
			return;
		}
		if ($gr_total_amt.equalsIgnoreCase(name)) {
			gr_total_amt(value);
			return;
		}
		if ($arr_amt.equalsIgnoreCase(name)) {
			arr_amt(value);
			return;
		}
		if ($purc_gr_amt.equalsIgnoreCase(name)) {
			purc_gr_amt(value);
			return;
		}
		if ($onr_rcv_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_gr_amt(value);
			return;
		}
		if ($purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			purc_rtn_gr_amt(value);
			return;
		}
		if ($onr_rcv_ret_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_amt(value);
			return;
		}
		if ($xpns_purc_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_gr_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_amt(value);
			return;
		}
		if ($accpt_dfct_gr_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gr_amt(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($bymfg_amt.equalsIgnoreCase(name)) {
			bymfg_amt(value);
			return;
		}
		if ($ffr_prov_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_gr_amt(value);
			return;
		}
		if ($onr_prov_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_gr_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_amt(value);
			return;
		}
		if ($onr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_amt(value);
			return;
		}
		if ($insp_gr_amt.equalsIgnoreCase(name)) {
			insp_gr_amt(value);
			return;
		}
		if ($insp_cmpl_gr_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gr_amt(value);
			return;
		}
		if ($insp_judg_gr_amt.equalsIgnoreCase(name)) {
			insp_judg_gr_amt(value);
			return;
		}
		if ($reinsp_gr_amt.equalsIgnoreCase(name)) {
			reinsp_gr_amt(value);
			return;
		}
		if ($stk_adjst_gr_amt.equalsIgnoreCase(name)) {
			stk_adjst_gr_amt(value);
			return;
		}
		if ($prdct_wh_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_gr_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_amt(value);
			return;
		}
		if ($xfr_gr_amt.equalsIgnoreCase(name)) {
			xfr_gr_amt(value);
			return;
		}
		if ($xfr_in_amt.equalsIgnoreCase(name)) {
			xfr_in_amt(value);
			return;
		}
		if ($purc_xfr_in_amt.equalsIgnoreCase(name)) {
			purc_xfr_in_amt(value);
			return;
		}
		if ($xfr_rtn_gr_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gr_amt(value);
			return;
		}
		if ($acxfr_gr_amt.equalsIgnoreCase(name)) {
			acxfr_gr_amt(value);
			return;
		}
		if ($arr_cststk_amt.equalsIgnoreCase(name)) {
			arr_cststk_amt(value);
			return;
		}
		if ($xfr_itm_gr_amt.equalsIgnoreCase(name)) {
			xfr_itm_gr_amt(value);
			return;
		}
		if ($xfr_lot_sno_gr_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_amt(value);
			return;
		}
		if ($xfr_grd_gr_amt.equalsIgnoreCase(name)) {
			xfr_grd_gr_amt(value);
			return;
		}
		if ($xfr_pack_gr_amt.equalsIgnoreCase(name)) {
			xfr_pack_gr_amt(value);
			return;
		}
		if ($ship_in_amt.equalsIgnoreCase(name)) {
			ship_in_amt(value);
			return;
		}
		if ($ex_ship_in_amt.equalsIgnoreCase(name)) {
			ex_ship_in_amt(value);
			return;
		}
		if ($ship_rtn_gr_amt.equalsIgnoreCase(name)) {
			ship_rtn_gr_amt(value);
			return;
		}
		if ($sls_rtn_gr_amt.equalsIgnoreCase(name)) {
			sls_rtn_gr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($arr_rtn_amt.equalsIgnoreCase(name)) {
			arr_rtn_amt(value);
			return;
		}
		if ($purc_gi_amt.equalsIgnoreCase(name)) {
			purc_gi_amt(value);
			return;
		}
		if ($onr_rcv_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_gi_amt(value);
			return;
		}
		if ($purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			purc_rtn_gi_amt(value);
			return;
		}
		if ($onr_rcv_ret_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_amt(value);
			return;
		}
		if ($xpns_purc_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_gi_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_amt(value);
			return;
		}
		if ($accpt_dfct_gi_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gi_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($loss_amt.equalsIgnoreCase(name)) {
			loss_amt(value);
			return;
		}
		if ($ffr_prov_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_gi_amt(value);
			return;
		}
		if ($onr_prov_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_gi_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_amt(value);
			return;
		}
		if ($onr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_amt(value);
			return;
		}
		if ($insp_gi_amt.equalsIgnoreCase(name)) {
			insp_gi_amt(value);
			return;
		}
		if ($insp_cmpl_gi_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gi_amt(value);
			return;
		}
		if ($insp_judg_gi_amt.equalsIgnoreCase(name)) {
			insp_judg_gi_amt(value);
			return;
		}
		if ($reinsp_gi_amt.equalsIgnoreCase(name)) {
			reinsp_gi_amt(value);
			return;
		}
		if ($insp_smpl_gi_amt.equalsIgnoreCase(name)) {
			insp_smpl_gi_amt(value);
			return;
		}
		if ($stk_adjst_gi_amt.equalsIgnoreCase(name)) {
			stk_adjst_gi_amt(value);
			return;
		}
		if ($prdct_wh_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_gi_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_amt(value);
			return;
		}
		if ($xfr_gi_amt.equalsIgnoreCase(name)) {
			xfr_gi_amt(value);
			return;
		}
		if ($xfr_out_amt.equalsIgnoreCase(name)) {
			xfr_out_amt(value);
			return;
		}
		if ($purc_xfr_out_amt.equalsIgnoreCase(name)) {
			purc_xfr_out_amt(value);
			return;
		}
		if ($xfr_rtn_gi_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gi_amt(value);
			return;
		}
		if ($acxfr_gi_amt.equalsIgnoreCase(name)) {
			acxfr_gi_amt(value);
			return;
		}
		if ($scrp_amt.equalsIgnoreCase(name)) {
			scrp_amt(value);
			return;
		}
		if ($xfr_itm_gi_amt.equalsIgnoreCase(name)) {
			xfr_itm_gi_amt(value);
			return;
		}
		if ($xfr_lot_sno_gi_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_amt(value);
			return;
		}
		if ($xfr_grd_gi_amt.equalsIgnoreCase(name)) {
			xfr_grd_gi_amt(value);
			return;
		}
		if ($xfr_pack_gi_amt.equalsIgnoreCase(name)) {
			xfr_pack_gi_amt(value);
			return;
		}
		if ($ship_out_amt.equalsIgnoreCase(name)) {
			ship_out_amt(value);
			return;
		}
		if ($ex_ship_out_amt.equalsIgnoreCase(name)) {
			ex_ship_out_amt(value);
			return;
		}
		if ($ship_rtn_gi_amt.equalsIgnoreCase(name)) {
			ship_rtn_gi_amt(value);
			return;
		}
		if ($sls_rtn_gi_amt.equalsIgnoreCase(name)) {
			sls_rtn_gi_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($ini_stk_qty.equalsIgnoreCase(name)) {
			ini_stk_qty(value);
			return;
		}
		if ($gr_total_qty.equalsIgnoreCase(name)) {
			gr_total_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_gr_qty.equalsIgnoreCase(name)) {
			purc_gr_qty(value);
			return;
		}
		if ($onr_rcv_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_gr_qty(value);
			return;
		}
		if ($purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			purc_rtn_gr_qty(value);
			return;
		}
		if ($onr_rcv_ret_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_qty(value);
			return;
		}
		if ($xpns_purc_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_gr_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_qty(value);
			return;
		}
		if ($accpt_dfct_gr_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gr_qty(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($bymfg_qty.equalsIgnoreCase(name)) {
			bymfg_qty(value);
			return;
		}
		if ($ffr_prov_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_gr_qty(value);
			return;
		}
		if ($onr_prov_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_gr_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_qty(value);
			return;
		}
		if ($onr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_qty(value);
			return;
		}
		if ($insp_gr_qty.equalsIgnoreCase(name)) {
			insp_gr_qty(value);
			return;
		}
		if ($insp_cmpl_gr_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gr_qty(value);
			return;
		}
		if ($insp_judg_gr_qty.equalsIgnoreCase(name)) {
			insp_judg_gr_qty(value);
			return;
		}
		if ($reinsp_gr_qty.equalsIgnoreCase(name)) {
			reinsp_gr_qty(value);
			return;
		}
		if ($stk_adjst_gr_qty.equalsIgnoreCase(name)) {
			stk_adjst_gr_qty(value);
			return;
		}
		if ($prdct_wh_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_gr_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_qty(value);
			return;
		}
		if ($xfr_gr_qty.equalsIgnoreCase(name)) {
			xfr_gr_qty(value);
			return;
		}
		if ($xfr_in_qty.equalsIgnoreCase(name)) {
			xfr_in_qty(value);
			return;
		}
		if ($purc_xfr_in_qty.equalsIgnoreCase(name)) {
			purc_xfr_in_qty(value);
			return;
		}
		if ($xfr_rtn_gr_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gr_qty(value);
			return;
		}
		if ($acxfr_gr_qty.equalsIgnoreCase(name)) {
			acxfr_gr_qty(value);
			return;
		}
		if ($arr_cststk_qty.equalsIgnoreCase(name)) {
			arr_cststk_qty(value);
			return;
		}
		if ($xfr_itm_gr_qty.equalsIgnoreCase(name)) {
			xfr_itm_gr_qty(value);
			return;
		}
		if ($xfr_lot_sno_gr_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_qty(value);
			return;
		}
		if ($xfr_grd_gr_qty.equalsIgnoreCase(name)) {
			xfr_grd_gr_qty(value);
			return;
		}
		if ($xfr_pack_gr_qty.equalsIgnoreCase(name)) {
			xfr_pack_gr_qty(value);
			return;
		}
		if ($ship_in_qty.equalsIgnoreCase(name)) {
			ship_in_qty(value);
			return;
		}
		if ($ex_ship_in_qty.equalsIgnoreCase(name)) {
			ex_ship_in_qty(value);
			return;
		}
		if ($ship_rtn_gr_qty.equalsIgnoreCase(name)) {
			ship_rtn_gr_qty(value);
			return;
		}
		if ($sls_rtn_gr_qty.equalsIgnoreCase(name)) {
			sls_rtn_gr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($arr_rtn_qty.equalsIgnoreCase(name)) {
			arr_rtn_qty(value);
			return;
		}
		if ($purc_gi_qty.equalsIgnoreCase(name)) {
			purc_gi_qty(value);
			return;
		}
		if ($onr_rcv_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_gi_qty(value);
			return;
		}
		if ($purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			purc_rtn_gi_qty(value);
			return;
		}
		if ($onr_rcv_ret_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_qty(value);
			return;
		}
		if ($xpns_purc_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_gi_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_qty(value);
			return;
		}
		if ($accpt_dfct_gi_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gi_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($ffr_prov_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_gi_qty(value);
			return;
		}
		if ($onr_prov_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_gi_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_qty(value);
			return;
		}
		if ($onr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_qty(value);
			return;
		}
		if ($insp_gi_qty.equalsIgnoreCase(name)) {
			insp_gi_qty(value);
			return;
		}
		if ($insp_cmpl_gi_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gi_qty(value);
			return;
		}
		if ($insp_judg_gi_qty.equalsIgnoreCase(name)) {
			insp_judg_gi_qty(value);
			return;
		}
		if ($reinsp_gi_qty.equalsIgnoreCase(name)) {
			reinsp_gi_qty(value);
			return;
		}
		if ($insp_smpl_gi_qty.equalsIgnoreCase(name)) {
			insp_smpl_gi_qty(value);
			return;
		}
		if ($stk_adjst_gi_qty.equalsIgnoreCase(name)) {
			stk_adjst_gi_qty(value);
			return;
		}
		if ($prdct_wh_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_gi_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_qty(value);
			return;
		}
		if ($xfr_gi_qty.equalsIgnoreCase(name)) {
			xfr_gi_qty(value);
			return;
		}
		if ($xfr_out_qty.equalsIgnoreCase(name)) {
			xfr_out_qty(value);
			return;
		}
		if ($purc_xfr_out_qty.equalsIgnoreCase(name)) {
			purc_xfr_out_qty(value);
			return;
		}
		if ($xfr_rtn_gi_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gi_qty(value);
			return;
		}
		if ($acxfr_gi_qty.equalsIgnoreCase(name)) {
			acxfr_gi_qty(value);
			return;
		}
		if ($scrp_qty.equalsIgnoreCase(name)) {
			scrp_qty(value);
			return;
		}
		if ($xfr_itm_gi_qty.equalsIgnoreCase(name)) {
			xfr_itm_gi_qty(value);
			return;
		}
		if ($xfr_lot_sno_gi_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_qty(value);
			return;
		}
		if ($xfr_grd_gi_qty.equalsIgnoreCase(name)) {
			xfr_grd_gi_qty(value);
			return;
		}
		if ($xfr_pack_gi_qty.equalsIgnoreCase(name)) {
			xfr_pack_gi_qty(value);
			return;
		}
		if ($ship_out_qty.equalsIgnoreCase(name)) {
			ship_out_qty(value);
			return;
		}
		if ($ex_ship_out_qty.equalsIgnoreCase(name)) {
			ex_ship_out_qty(value);
			return;
		}
		if ($ship_rtn_gi_qty.equalsIgnoreCase(name)) {
			ship_rtn_gi_qty(value);
			return;
		}
		if ($sls_rtn_gi_qty.equalsIgnoreCase(name)) {
			sls_rtn_gi_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($ini_stk_amt.equalsIgnoreCase(name)) {
			ini_stk_amt(value);
			return;
		}
		if ($gr_total_amt.equalsIgnoreCase(name)) {
			gr_total_amt(value);
			return;
		}
		if ($arr_amt.equalsIgnoreCase(name)) {
			arr_amt(value);
			return;
		}
		if ($purc_gr_amt.equalsIgnoreCase(name)) {
			purc_gr_amt(value);
			return;
		}
		if ($onr_rcv_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_gr_amt(value);
			return;
		}
		if ($purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			purc_rtn_gr_amt(value);
			return;
		}
		if ($onr_rcv_ret_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_amt(value);
			return;
		}
		if ($xpns_purc_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_gr_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_amt(value);
			return;
		}
		if ($accpt_dfct_gr_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gr_amt(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($bymfg_amt.equalsIgnoreCase(name)) {
			bymfg_amt(value);
			return;
		}
		if ($ffr_prov_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_gr_amt(value);
			return;
		}
		if ($onr_prov_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_gr_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_amt(value);
			return;
		}
		if ($onr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_amt(value);
			return;
		}
		if ($insp_gr_amt.equalsIgnoreCase(name)) {
			insp_gr_amt(value);
			return;
		}
		if ($insp_cmpl_gr_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gr_amt(value);
			return;
		}
		if ($insp_judg_gr_amt.equalsIgnoreCase(name)) {
			insp_judg_gr_amt(value);
			return;
		}
		if ($reinsp_gr_amt.equalsIgnoreCase(name)) {
			reinsp_gr_amt(value);
			return;
		}
		if ($stk_adjst_gr_amt.equalsIgnoreCase(name)) {
			stk_adjst_gr_amt(value);
			return;
		}
		if ($prdct_wh_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_gr_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_amt(value);
			return;
		}
		if ($xfr_gr_amt.equalsIgnoreCase(name)) {
			xfr_gr_amt(value);
			return;
		}
		if ($xfr_in_amt.equalsIgnoreCase(name)) {
			xfr_in_amt(value);
			return;
		}
		if ($purc_xfr_in_amt.equalsIgnoreCase(name)) {
			purc_xfr_in_amt(value);
			return;
		}
		if ($xfr_rtn_gr_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gr_amt(value);
			return;
		}
		if ($acxfr_gr_amt.equalsIgnoreCase(name)) {
			acxfr_gr_amt(value);
			return;
		}
		if ($arr_cststk_amt.equalsIgnoreCase(name)) {
			arr_cststk_amt(value);
			return;
		}
		if ($xfr_itm_gr_amt.equalsIgnoreCase(name)) {
			xfr_itm_gr_amt(value);
			return;
		}
		if ($xfr_lot_sno_gr_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_amt(value);
			return;
		}
		if ($xfr_grd_gr_amt.equalsIgnoreCase(name)) {
			xfr_grd_gr_amt(value);
			return;
		}
		if ($xfr_pack_gr_amt.equalsIgnoreCase(name)) {
			xfr_pack_gr_amt(value);
			return;
		}
		if ($ship_in_amt.equalsIgnoreCase(name)) {
			ship_in_amt(value);
			return;
		}
		if ($ex_ship_in_amt.equalsIgnoreCase(name)) {
			ex_ship_in_amt(value);
			return;
		}
		if ($ship_rtn_gr_amt.equalsIgnoreCase(name)) {
			ship_rtn_gr_amt(value);
			return;
		}
		if ($sls_rtn_gr_amt.equalsIgnoreCase(name)) {
			sls_rtn_gr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($arr_rtn_amt.equalsIgnoreCase(name)) {
			arr_rtn_amt(value);
			return;
		}
		if ($purc_gi_amt.equalsIgnoreCase(name)) {
			purc_gi_amt(value);
			return;
		}
		if ($onr_rcv_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_gi_amt(value);
			return;
		}
		if ($purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			purc_rtn_gi_amt(value);
			return;
		}
		if ($onr_rcv_ret_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_amt(value);
			return;
		}
		if ($xpns_purc_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_gi_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_amt(value);
			return;
		}
		if ($accpt_dfct_gi_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gi_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($loss_amt.equalsIgnoreCase(name)) {
			loss_amt(value);
			return;
		}
		if ($ffr_prov_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_gi_amt(value);
			return;
		}
		if ($onr_prov_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_gi_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_amt(value);
			return;
		}
		if ($onr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_amt(value);
			return;
		}
		if ($insp_gi_amt.equalsIgnoreCase(name)) {
			insp_gi_amt(value);
			return;
		}
		if ($insp_cmpl_gi_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gi_amt(value);
			return;
		}
		if ($insp_judg_gi_amt.equalsIgnoreCase(name)) {
			insp_judg_gi_amt(value);
			return;
		}
		if ($reinsp_gi_amt.equalsIgnoreCase(name)) {
			reinsp_gi_amt(value);
			return;
		}
		if ($insp_smpl_gi_amt.equalsIgnoreCase(name)) {
			insp_smpl_gi_amt(value);
			return;
		}
		if ($stk_adjst_gi_amt.equalsIgnoreCase(name)) {
			stk_adjst_gi_amt(value);
			return;
		}
		if ($prdct_wh_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_gi_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_amt(value);
			return;
		}
		if ($xfr_gi_amt.equalsIgnoreCase(name)) {
			xfr_gi_amt(value);
			return;
		}
		if ($xfr_out_amt.equalsIgnoreCase(name)) {
			xfr_out_amt(value);
			return;
		}
		if ($purc_xfr_out_amt.equalsIgnoreCase(name)) {
			purc_xfr_out_amt(value);
			return;
		}
		if ($xfr_rtn_gi_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gi_amt(value);
			return;
		}
		if ($acxfr_gi_amt.equalsIgnoreCase(name)) {
			acxfr_gi_amt(value);
			return;
		}
		if ($scrp_amt.equalsIgnoreCase(name)) {
			scrp_amt(value);
			return;
		}
		if ($xfr_itm_gi_amt.equalsIgnoreCase(name)) {
			xfr_itm_gi_amt(value);
			return;
		}
		if ($xfr_lot_sno_gi_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_amt(value);
			return;
		}
		if ($xfr_grd_gi_amt.equalsIgnoreCase(name)) {
			xfr_grd_gi_amt(value);
			return;
		}
		if ($xfr_pack_gi_amt.equalsIgnoreCase(name)) {
			xfr_pack_gi_amt(value);
			return;
		}
		if ($ship_out_amt.equalsIgnoreCase(name)) {
			ship_out_amt(value);
			return;
		}
		if ($ex_ship_out_amt.equalsIgnoreCase(name)) {
			ex_ship_out_amt(value);
			return;
		}
		if ($ship_rtn_gi_amt.equalsIgnoreCase(name)) {
			ship_rtn_gi_amt(value);
			return;
		}
		if ($sls_rtn_gi_amt.equalsIgnoreCase(name)) {
			sls_rtn_gi_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($base_cur_dec_place.equalsIgnoreCase(name)) {
			base_cur_dec_place(value);
			return;
		}
		if ($std_unit_cost.equalsIgnoreCase(name)) {
			std_unit_cost(value);
			return;
		}
		if ($ini_stk_qty.equalsIgnoreCase(name)) {
			ini_stk_qty(value);
			return;
		}
		if ($gr_total_qty.equalsIgnoreCase(name)) {
			gr_total_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_gr_qty.equalsIgnoreCase(name)) {
			purc_gr_qty(value);
			return;
		}
		if ($onr_rcv_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_gr_qty(value);
			return;
		}
		if ($purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			purc_rtn_gr_qty(value);
			return;
		}
		if ($onr_rcv_ret_gr_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_qty(value);
			return;
		}
		if ($xpns_purc_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_gr_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gr_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_qty(value);
			return;
		}
		if ($accpt_dfct_gr_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gr_qty(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($bymfg_qty.equalsIgnoreCase(name)) {
			bymfg_qty(value);
			return;
		}
		if ($ffr_prov_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_gr_qty(value);
			return;
		}
		if ($onr_prov_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_gr_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_qty(value);
			return;
		}
		if ($onr_prov_rtn_gr_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_qty(value);
			return;
		}
		if ($insp_gr_qty.equalsIgnoreCase(name)) {
			insp_gr_qty(value);
			return;
		}
		if ($insp_cmpl_gr_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gr_qty(value);
			return;
		}
		if ($insp_judg_gr_qty.equalsIgnoreCase(name)) {
			insp_judg_gr_qty(value);
			return;
		}
		if ($reinsp_gr_qty.equalsIgnoreCase(name)) {
			reinsp_gr_qty(value);
			return;
		}
		if ($stk_adjst_gr_qty.equalsIgnoreCase(name)) {
			stk_adjst_gr_qty(value);
			return;
		}
		if ($prdct_wh_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_gr_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gr_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_qty(value);
			return;
		}
		if ($xfr_gr_qty.equalsIgnoreCase(name)) {
			xfr_gr_qty(value);
			return;
		}
		if ($xfr_in_qty.equalsIgnoreCase(name)) {
			xfr_in_qty(value);
			return;
		}
		if ($purc_xfr_in_qty.equalsIgnoreCase(name)) {
			purc_xfr_in_qty(value);
			return;
		}
		if ($xfr_rtn_gr_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gr_qty(value);
			return;
		}
		if ($acxfr_gr_qty.equalsIgnoreCase(name)) {
			acxfr_gr_qty(value);
			return;
		}
		if ($arr_cststk_qty.equalsIgnoreCase(name)) {
			arr_cststk_qty(value);
			return;
		}
		if ($xfr_itm_gr_qty.equalsIgnoreCase(name)) {
			xfr_itm_gr_qty(value);
			return;
		}
		if ($xfr_lot_sno_gr_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_qty(value);
			return;
		}
		if ($xfr_grd_gr_qty.equalsIgnoreCase(name)) {
			xfr_grd_gr_qty(value);
			return;
		}
		if ($xfr_pack_gr_qty.equalsIgnoreCase(name)) {
			xfr_pack_gr_qty(value);
			return;
		}
		if ($ship_in_qty.equalsIgnoreCase(name)) {
			ship_in_qty(value);
			return;
		}
		if ($ex_ship_in_qty.equalsIgnoreCase(name)) {
			ex_ship_in_qty(value);
			return;
		}
		if ($ship_rtn_gr_qty.equalsIgnoreCase(name)) {
			ship_rtn_gr_qty(value);
			return;
		}
		if ($sls_rtn_gr_qty.equalsIgnoreCase(name)) {
			sls_rtn_gr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($arr_rtn_qty.equalsIgnoreCase(name)) {
			arr_rtn_qty(value);
			return;
		}
		if ($purc_gi_qty.equalsIgnoreCase(name)) {
			purc_gi_qty(value);
			return;
		}
		if ($onr_rcv_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_gi_qty(value);
			return;
		}
		if ($purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			purc_rtn_gi_qty(value);
			return;
		}
		if ($onr_rcv_ret_gi_qty.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_qty(value);
			return;
		}
		if ($xpns_purc_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_gi_qty(value);
			return;
		}
		if ($xpns_purc_rtn_gi_qty.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_qty(value);
			return;
		}
		if ($accpt_dfct_gi_qty.equalsIgnoreCase(name)) {
			accpt_dfct_gi_qty(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($loss_qty.equalsIgnoreCase(name)) {
			loss_qty(value);
			return;
		}
		if ($ffr_prov_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_gi_qty(value);
			return;
		}
		if ($onr_prov_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_gi_qty(value);
			return;
		}
		if ($ffr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_qty(value);
			return;
		}
		if ($onr_prov_rtn_gi_qty.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_qty(value);
			return;
		}
		if ($insp_gi_qty.equalsIgnoreCase(name)) {
			insp_gi_qty(value);
			return;
		}
		if ($insp_cmpl_gi_qty.equalsIgnoreCase(name)) {
			insp_cmpl_gi_qty(value);
			return;
		}
		if ($insp_judg_gi_qty.equalsIgnoreCase(name)) {
			insp_judg_gi_qty(value);
			return;
		}
		if ($reinsp_gi_qty.equalsIgnoreCase(name)) {
			reinsp_gi_qty(value);
			return;
		}
		if ($insp_smpl_gi_qty.equalsIgnoreCase(name)) {
			insp_smpl_gi_qty(value);
			return;
		}
		if ($stk_adjst_gi_qty.equalsIgnoreCase(name)) {
			stk_adjst_gi_qty(value);
			return;
		}
		if ($prdct_wh_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_gi_qty(value);
			return;
		}
		if ($prdct_wh_rtn_gi_qty.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_qty(value);
			return;
		}
		if ($xfr_gi_qty.equalsIgnoreCase(name)) {
			xfr_gi_qty(value);
			return;
		}
		if ($xfr_out_qty.equalsIgnoreCase(name)) {
			xfr_out_qty(value);
			return;
		}
		if ($purc_xfr_out_qty.equalsIgnoreCase(name)) {
			purc_xfr_out_qty(value);
			return;
		}
		if ($xfr_rtn_gi_qty.equalsIgnoreCase(name)) {
			xfr_rtn_gi_qty(value);
			return;
		}
		if ($acxfr_gi_qty.equalsIgnoreCase(name)) {
			acxfr_gi_qty(value);
			return;
		}
		if ($scrp_qty.equalsIgnoreCase(name)) {
			scrp_qty(value);
			return;
		}
		if ($xfr_itm_gi_qty.equalsIgnoreCase(name)) {
			xfr_itm_gi_qty(value);
			return;
		}
		if ($xfr_lot_sno_gi_qty.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_qty(value);
			return;
		}
		if ($xfr_grd_gi_qty.equalsIgnoreCase(name)) {
			xfr_grd_gi_qty(value);
			return;
		}
		if ($xfr_pack_gi_qty.equalsIgnoreCase(name)) {
			xfr_pack_gi_qty(value);
			return;
		}
		if ($ship_out_qty.equalsIgnoreCase(name)) {
			ship_out_qty(value);
			return;
		}
		if ($ex_ship_out_qty.equalsIgnoreCase(name)) {
			ex_ship_out_qty(value);
			return;
		}
		if ($ship_rtn_gi_qty.equalsIgnoreCase(name)) {
			ship_rtn_gi_qty(value);
			return;
		}
		if ($sls_rtn_gi_qty.equalsIgnoreCase(name)) {
			sls_rtn_gi_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($ini_stk_amt.equalsIgnoreCase(name)) {
			ini_stk_amt(value);
			return;
		}
		if ($gr_total_amt.equalsIgnoreCase(name)) {
			gr_total_amt(value);
			return;
		}
		if ($arr_amt.equalsIgnoreCase(name)) {
			arr_amt(value);
			return;
		}
		if ($purc_gr_amt.equalsIgnoreCase(name)) {
			purc_gr_amt(value);
			return;
		}
		if ($onr_rcv_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_gr_amt(value);
			return;
		}
		if ($purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			purc_rtn_gr_amt(value);
			return;
		}
		if ($onr_rcv_ret_gr_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gr_amt(value);
			return;
		}
		if ($xpns_purc_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_gr_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gr_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gr_amt(value);
			return;
		}
		if ($accpt_dfct_gr_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gr_amt(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($bymfg_amt.equalsIgnoreCase(name)) {
			bymfg_amt(value);
			return;
		}
		if ($ffr_prov_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_gr_amt(value);
			return;
		}
		if ($onr_prov_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_gr_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gr_amt(value);
			return;
		}
		if ($onr_prov_rtn_gr_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gr_amt(value);
			return;
		}
		if ($insp_gr_amt.equalsIgnoreCase(name)) {
			insp_gr_amt(value);
			return;
		}
		if ($insp_cmpl_gr_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gr_amt(value);
			return;
		}
		if ($insp_judg_gr_amt.equalsIgnoreCase(name)) {
			insp_judg_gr_amt(value);
			return;
		}
		if ($reinsp_gr_amt.equalsIgnoreCase(name)) {
			reinsp_gr_amt(value);
			return;
		}
		if ($stk_adjst_gr_amt.equalsIgnoreCase(name)) {
			stk_adjst_gr_amt(value);
			return;
		}
		if ($prdct_wh_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_gr_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gr_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gr_amt(value);
			return;
		}
		if ($xfr_gr_amt.equalsIgnoreCase(name)) {
			xfr_gr_amt(value);
			return;
		}
		if ($xfr_in_amt.equalsIgnoreCase(name)) {
			xfr_in_amt(value);
			return;
		}
		if ($purc_xfr_in_amt.equalsIgnoreCase(name)) {
			purc_xfr_in_amt(value);
			return;
		}
		if ($xfr_rtn_gr_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gr_amt(value);
			return;
		}
		if ($acxfr_gr_amt.equalsIgnoreCase(name)) {
			acxfr_gr_amt(value);
			return;
		}
		if ($arr_cststk_amt.equalsIgnoreCase(name)) {
			arr_cststk_amt(value);
			return;
		}
		if ($xfr_itm_gr_amt.equalsIgnoreCase(name)) {
			xfr_itm_gr_amt(value);
			return;
		}
		if ($xfr_lot_sno_gr_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gr_amt(value);
			return;
		}
		if ($xfr_grd_gr_amt.equalsIgnoreCase(name)) {
			xfr_grd_gr_amt(value);
			return;
		}
		if ($xfr_pack_gr_amt.equalsIgnoreCase(name)) {
			xfr_pack_gr_amt(value);
			return;
		}
		if ($ship_in_amt.equalsIgnoreCase(name)) {
			ship_in_amt(value);
			return;
		}
		if ($ex_ship_in_amt.equalsIgnoreCase(name)) {
			ex_ship_in_amt(value);
			return;
		}
		if ($ship_rtn_gr_amt.equalsIgnoreCase(name)) {
			ship_rtn_gr_amt(value);
			return;
		}
		if ($sls_rtn_gr_amt.equalsIgnoreCase(name)) {
			sls_rtn_gr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($arr_rtn_amt.equalsIgnoreCase(name)) {
			arr_rtn_amt(value);
			return;
		}
		if ($purc_gi_amt.equalsIgnoreCase(name)) {
			purc_gi_amt(value);
			return;
		}
		if ($onr_rcv_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_gi_amt(value);
			return;
		}
		if ($purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			purc_rtn_gi_amt(value);
			return;
		}
		if ($onr_rcv_ret_gi_amt.equalsIgnoreCase(name)) {
			onr_rcv_ret_gi_amt(value);
			return;
		}
		if ($xpns_purc_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_gi_amt(value);
			return;
		}
		if ($xpns_purc_rtn_gi_amt.equalsIgnoreCase(name)) {
			xpns_purc_rtn_gi_amt(value);
			return;
		}
		if ($accpt_dfct_gi_amt.equalsIgnoreCase(name)) {
			accpt_dfct_gi_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($loss_amt.equalsIgnoreCase(name)) {
			loss_amt(value);
			return;
		}
		if ($ffr_prov_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_gi_amt(value);
			return;
		}
		if ($onr_prov_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_gi_amt(value);
			return;
		}
		if ($ffr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			ffr_prov_rtn_gi_amt(value);
			return;
		}
		if ($onr_prov_rtn_gi_amt.equalsIgnoreCase(name)) {
			onr_prov_rtn_gi_amt(value);
			return;
		}
		if ($insp_gi_amt.equalsIgnoreCase(name)) {
			insp_gi_amt(value);
			return;
		}
		if ($insp_cmpl_gi_amt.equalsIgnoreCase(name)) {
			insp_cmpl_gi_amt(value);
			return;
		}
		if ($insp_judg_gi_amt.equalsIgnoreCase(name)) {
			insp_judg_gi_amt(value);
			return;
		}
		if ($reinsp_gi_amt.equalsIgnoreCase(name)) {
			reinsp_gi_amt(value);
			return;
		}
		if ($insp_smpl_gi_amt.equalsIgnoreCase(name)) {
			insp_smpl_gi_amt(value);
			return;
		}
		if ($stk_adjst_gi_amt.equalsIgnoreCase(name)) {
			stk_adjst_gi_amt(value);
			return;
		}
		if ($prdct_wh_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_gi_amt(value);
			return;
		}
		if ($prdct_wh_rtn_gi_amt.equalsIgnoreCase(name)) {
			prdct_wh_rtn_gi_amt(value);
			return;
		}
		if ($xfr_gi_amt.equalsIgnoreCase(name)) {
			xfr_gi_amt(value);
			return;
		}
		if ($xfr_out_amt.equalsIgnoreCase(name)) {
			xfr_out_amt(value);
			return;
		}
		if ($purc_xfr_out_amt.equalsIgnoreCase(name)) {
			purc_xfr_out_amt(value);
			return;
		}
		if ($xfr_rtn_gi_amt.equalsIgnoreCase(name)) {
			xfr_rtn_gi_amt(value);
			return;
		}
		if ($acxfr_gi_amt.equalsIgnoreCase(name)) {
			acxfr_gi_amt(value);
			return;
		}
		if ($scrp_amt.equalsIgnoreCase(name)) {
			scrp_amt(value);
			return;
		}
		if ($xfr_itm_gi_amt.equalsIgnoreCase(name)) {
			xfr_itm_gi_amt(value);
			return;
		}
		if ($xfr_lot_sno_gi_amt.equalsIgnoreCase(name)) {
			xfr_lot_sno_gi_amt(value);
			return;
		}
		if ($xfr_grd_gi_amt.equalsIgnoreCase(name)) {
			xfr_grd_gi_amt(value);
			return;
		}
		if ($xfr_pack_gi_amt.equalsIgnoreCase(name)) {
			xfr_pack_gi_amt(value);
			return;
		}
		if ($ship_out_amt.equalsIgnoreCase(name)) {
			ship_out_amt(value);
			return;
		}
		if ($ex_ship_out_amt.equalsIgnoreCase(name)) {
			ex_ship_out_amt(value);
			return;
		}
		if ($ship_rtn_gi_amt.equalsIgnoreCase(name)) {
			ship_rtn_gi_amt(value);
			return;
		}
		if ($sls_rtn_gi_amt.equalsIgnoreCase(name)) {
			sls_rtn_gi_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mly_io_cl_ym.equalsIgnoreCase(name)) {
			mly_io_cl_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

