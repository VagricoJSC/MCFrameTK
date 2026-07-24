package mcframe.serverMSBE.MSBEL0020;

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
	 * Closing month 締月度.<p>
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
	 * Receipt qty. before acceptance 検収前入荷数量.<p>
	 *
	 */
	public static final String $purc_bf_accpt_qty = "purc_bf_accpt_qty";
	/**
	 * Purchase GR qty. 購入入庫数量.<p>
	 *
	 */
	public static final String $gr_purc_qty = "gr_purc_qty";
	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public static final String $accpt_dfct_qty = "accpt_dfct_qty";
	/**
	 * Mfg. GR qty. 製造入庫数量.<p>
	 *
	 */
	public static final String $gr_prod_qty = "gr_prod_qty";
	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public static final String $gr_xfr_qty = "gr_xfr_qty";
	/**
	 * Receiving GR qty. 受給入庫数量.<p>
	 *
	 */
	public static final String $gr_rcv_qty = "gr_rcv_qty";
	/**
	 * Inventory transfer GR qty. 在庫振替入庫数量.<p>
	 *
	 */
	public static final String $gr_stk_xfr_qty = "gr_stk_xfr_qty";
	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public static final String $gr_ac_xfr_qty = "gr_ac_xfr_qty";
	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public static final String $gi_total_qty = "gi_total_qty";
	/**
	 * Input GI qty. 投入出庫数量.<p>
	 *
	 */
	public static final String $gi_input_qty = "gi_input_qty";
	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public static final String $gi_insp_qty = "gi_insp_qty";
	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public static final String $gi_xfr_qty = "gi_xfr_qty";
	/**
	 * Receiving return qty. 受給戻し数量.<p>
	 *
	 */
	public static final String $rcv_ret_qty = "rcv_ret_qty";
	/**
	 * Inventory transfer GI qty. 在庫振替出庫数量.<p>
	 *
	 */
	public static final String $gi_stk_xfr_qty = "gi_stk_xfr_qty";
	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public static final String $gi_ac_xfr_qty = "gi_ac_xfr_qty";
	/**
	 * Inventory count decreased qty. 棚卸減数量.<p>
	 *
	 */
	public static final String $stktk_minus_qty = "stktk_minus_qty";
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
	 * Receipt amount before acceptance 検収前入荷金額.<p>
	 *
	 */
	public static final String $purc_bf_accpt_amt = "purc_bf_accpt_amt";
	/**
	 * Purchase GR amount 購入入庫金額.<p>
	 *
	 */
	public static final String $gr_purc_amt = "gr_purc_amt";
	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public static final String $accpt_dfct_amt = "accpt_dfct_amt";
	/**
	 * Mfg. GR amount 製造入庫金額.<p>
	 *
	 */
	public static final String $gr_prod_amt = "gr_prod_amt";
	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public static final String $gr_xfr_amt = "gr_xfr_amt";
	/**
	 * GR incoming amount 受給入庫金額.<p>
	 *
	 */
	public static final String $gr_rcv_amt = "gr_rcv_amt";
	/**
	 * Inventory transfer GR amount 在庫振替入庫金額.<p>
	 *
	 */
	public static final String $gr_stk_xfr_amt = "gr_stk_xfr_amt";
	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public static final String $gr_ac_xfr_amt = "gr_ac_xfr_amt";
	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public static final String $gi_total_amt = "gi_total_amt";
	/**
	 * Input GI amount 投入出庫金額.<p>
	 *
	 */
	public static final String $gi_input_amt = "gi_input_amt";
	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public static final String $gi_insp_amt = "gi_insp_amt";
	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public static final String $gi_xfr_amt = "gi_xfr_amt";
	/**
	 * Receiving return amount 受給戻し金額.<p>
	 *
	 */
	public static final String $rcv_ret_amt = "rcv_ret_amt";
	/**
	 * Inventory transfer GI amount 在庫振替出庫金額.<p>
	 *
	 */
	public static final String $gi_stk_xfr_amt = "gi_stk_xfr_amt";
	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public static final String $gi_ac_xfr_amt = "gi_ac_xfr_amt";
	/**
	 * Inventory count decreased amount 棚卸減金額.<p>
	 *
	 */
	public static final String $stktk_minus_amt = "stktk_minus_amt";
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
	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public static final String $io_act_typ = "io_act_typ";


	public static final MCMeta mly_io_cl_ym_META = createCommonMeta($mly_io_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
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
	public static final MCMeta purc_bf_accpt_qty_META = createCommonMeta($purc_bf_accpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_purc_qty_META = createCommonMeta($gr_purc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta accpt_dfct_qty_META = createCommonMeta($accpt_dfct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_prod_qty_META = createCommonMeta($gr_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_xfr_qty_META = createCommonMeta($gr_xfr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_rcv_qty_META = createCommonMeta($gr_rcv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_stk_xfr_qty_META = createCommonMeta($gr_stk_xfr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_ac_xfr_qty_META = createCommonMeta($gr_ac_xfr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_total_qty_META = createCommonMeta($gi_total_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_input_qty_META = createCommonMeta($gi_input_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_insp_qty_META = createCommonMeta($gi_insp_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_xfr_qty_META = createCommonMeta($gi_xfr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rcv_ret_qty_META = createCommonMeta($rcv_ret_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_stk_xfr_qty_META = createCommonMeta($gi_stk_xfr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_ac_xfr_qty_META = createCommonMeta($gi_ac_xfr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stktk_minus_qty_META = createCommonMeta($stktk_minus_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_qty_META = createCommonMeta($sls_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta end_stk_qty_META = createCommonMeta($end_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ini_stk_amt_META = createCommonMeta($ini_stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gr_total_amt_META = createCommonMeta($gr_total_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_bf_accpt_amt_META = createCommonMeta($purc_bf_accpt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gr_purc_amt_META = createCommonMeta($gr_purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta accpt_dfct_amt_META = createCommonMeta($accpt_dfct_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gr_prod_amt_META = createCommonMeta($gr_prod_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gr_xfr_amt_META = createCommonMeta($gr_xfr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gr_rcv_amt_META = createCommonMeta($gr_rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gr_stk_xfr_amt_META = createCommonMeta($gr_stk_xfr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gr_ac_xfr_amt_META = createCommonMeta($gr_ac_xfr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gi_total_amt_META = createCommonMeta($gi_total_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gi_input_amt_META = createCommonMeta($gi_input_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gi_insp_amt_META = createCommonMeta($gi_insp_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gi_xfr_amt_META = createCommonMeta($gi_xfr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_ret_amt_META = createCommonMeta($rcv_ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gi_stk_xfr_amt_META = createCommonMeta($gi_stk_xfr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gi_ac_xfr_amt_META = createCommonMeta($gi_ac_xfr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta stktk_minus_amt_META = createCommonMeta($stktk_minus_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_stk_amt_META = createCommonMeta($end_stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta io_act_typ_META = createCommonMeta($io_act_typ, mcframe.commonMS.meta.MS_META.IO_ACT_TYP);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mly_io_cl_ym_META,
			wg_cd_META,
			wg_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_META,
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
			purc_bf_accpt_qty_META,
			gr_purc_qty_META,
			accpt_dfct_qty_META,
			gr_prod_qty_META,
			gr_xfr_qty_META,
			gr_rcv_qty_META,
			gr_stk_xfr_qty_META,
			gr_ac_xfr_qty_META,
			gi_total_qty_META,
			gi_input_qty_META,
			gi_insp_qty_META,
			gi_xfr_qty_META,
			rcv_ret_qty_META,
			gi_stk_xfr_qty_META,
			gi_ac_xfr_qty_META,
			stktk_minus_qty_META,
			sls_qty_META,
			end_stk_qty_META,
			ini_stk_amt_META,
			gr_total_amt_META,
			purc_bf_accpt_amt_META,
			gr_purc_amt_META,
			accpt_dfct_amt_META,
			gr_prod_amt_META,
			gr_xfr_amt_META,
			gr_rcv_amt_META,
			gr_stk_xfr_amt_META,
			gr_ac_xfr_amt_META,
			gi_total_amt_META,
			gi_input_amt_META,
			gi_insp_amt_META,
			gi_xfr_amt_META,
			rcv_ret_amt_META,
			gi_stk_xfr_amt_META,
			gi_ac_xfr_amt_META,
			stktk_minus_amt_META,
			sls_amt_META,
			end_stk_amt_META,
			io_act_typ_META
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
				{$asst_typ, "MAC_ASST_TYP"},	// asst_typ
				{$stk_id_typ, "MSC_STK_ID_TYP"},	// stk_id_typ
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
	 * Closing month 締月度.<p>
	 *
	 */
	public MCDate mly_io_cl_ym() {
		return getConstDate(offset + 0, $mly_io_cl_ym);
	}

	/**
	 * Closing month 締月度.<p>
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
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 3, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 3, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 4, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 4, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 5, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 5, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 6, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 6, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 7, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 7, $itm_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 8, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 8, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 9, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 9, $asst_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 10, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 10, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 11, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 11, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 12, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 12, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 13, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 13, $stk_bp_nm, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 14, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 14, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 15, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 15, $stk_arrv_bp_nm, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 16, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 16, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 17, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 17, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 18, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 19, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 19, $base_unit_rnd_typ, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 20, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}


	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public MCNumber stk_amt() {
		return getConstNumber(offset + 21, $stk_amt);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(MCNumber value) {
		setConstNumber(offset + 21, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(int value) {
		setConstNumber(offset + 21, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(long value) {
		setConstNumber(offset + 21, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(float value) {
		setConstNumber(offset + 21, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(double value) {
		setConstNumber(offset + 21, $stk_amt, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 22, $base_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 22, $base_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 23, $base_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 23, $base_cur_nm, value);
	}


	/**
	 * Currency unit number of decimal places 通貨単位小数点有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_dec_place() {
		return getConstNumber(offset + 24, $base_cur_dec_place);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数点有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(MCNumber value) {
		setConstNumber(offset + 24, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数点有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(int value) {
		setConstNumber(offset + 24, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数点有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(long value) {
		setConstNumber(offset + 24, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数点有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(float value) {
		setConstNumber(offset + 24, $base_cur_dec_place, value);
	}

	/**
	 * Currency unit number of decimal places 通貨単位小数点有効桁数.<p>
	 *
	 */
	public void base_cur_dec_place(double value) {
		setConstNumber(offset + 24, $base_cur_dec_place, value);
	}


	/**
	 * Currency unit rounding type 通貨単位端数処理区分.<p>
	 *
	 */
	public String base_cur_rnd_typ() {
		return getConstString(offset + 25, $base_cur_rnd_typ);
	}

	/**
	 * Currency unit rounding type 通貨単位端数処理区分.<p>
	 *
	 */
	public void base_cur_rnd_typ(String value) {
		setConstString(offset + 25, $base_cur_rnd_typ, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber std_unit_cost() {
		return getConstNumber(offset + 26, $std_unit_cost);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(MCNumber value) {
		setConstNumber(offset + 26, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(int value) {
		setConstNumber(offset + 26, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(long value) {
		setConstNumber(offset + 26, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(float value) {
		setConstNumber(offset + 26, $std_unit_cost, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_unit_cost(double value) {
		setConstNumber(offset + 26, $std_unit_cost, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 27, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 27, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 28, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 28, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 29, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 29, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 30, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 30, $itm_typ_d_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 31, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 31, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 32, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 32, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 33, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 33, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 34, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 34, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 35, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 35, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 36, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 36, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 37, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 37, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 38, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 38, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 39, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 39, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 40, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 40, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 41, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 41, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 42, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 42, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 43, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 43, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 44, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 44, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 45, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 45, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 46, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 46, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 47, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 47, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 48, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 48, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 49, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 49, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 50, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 50, $itm_grp_nm10, value);
	}


	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public MCNumber ini_stk_qty() {
		return getConstNumber(offset + 51, $ini_stk_qty);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(MCNumber value) {
		setConstNumber(offset + 51, $ini_stk_qty, value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(int value) {
		setConstNumber(offset + 51, $ini_stk_qty, value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(long value) {
		setConstNumber(offset + 51, $ini_stk_qty, value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(float value) {
		setConstNumber(offset + 51, $ini_stk_qty, value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void ini_stk_qty(double value) {
		setConstNumber(offset + 51, $ini_stk_qty, value);
	}


	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public MCNumber gr_total_qty() {
		return getConstNumber(offset + 52, $gr_total_qty);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(MCNumber value) {
		setConstNumber(offset + 52, $gr_total_qty, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(int value) {
		setConstNumber(offset + 52, $gr_total_qty, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(long value) {
		setConstNumber(offset + 52, $gr_total_qty, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(float value) {
		setConstNumber(offset + 52, $gr_total_qty, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_qty(double value) {
		setConstNumber(offset + 52, $gr_total_qty, value);
	}


	/**
	 * Receipt qty. before acceptance 検収前入荷数量.<p>
	 *
	 */
	public MCNumber purc_bf_accpt_qty() {
		return getConstNumber(offset + 53, $purc_bf_accpt_qty);
	}

	/**
	 * Receipt qty. before acceptance 検収前入荷数量.<p>
	 *
	 */
	public void purc_bf_accpt_qty(MCNumber value) {
		setConstNumber(offset + 53, $purc_bf_accpt_qty, value);
	}

	/**
	 * Receipt qty. before acceptance 検収前入荷数量.<p>
	 *
	 */
	public void purc_bf_accpt_qty(int value) {
		setConstNumber(offset + 53, $purc_bf_accpt_qty, value);
	}

	/**
	 * Receipt qty. before acceptance 検収前入荷数量.<p>
	 *
	 */
	public void purc_bf_accpt_qty(long value) {
		setConstNumber(offset + 53, $purc_bf_accpt_qty, value);
	}

	/**
	 * Receipt qty. before acceptance 検収前入荷数量.<p>
	 *
	 */
	public void purc_bf_accpt_qty(float value) {
		setConstNumber(offset + 53, $purc_bf_accpt_qty, value);
	}

	/**
	 * Receipt qty. before acceptance 検収前入荷数量.<p>
	 *
	 */
	public void purc_bf_accpt_qty(double value) {
		setConstNumber(offset + 53, $purc_bf_accpt_qty, value);
	}


	/**
	 * Purchase GR qty. 購入入庫数量.<p>
	 *
	 */
	public MCNumber gr_purc_qty() {
		return getConstNumber(offset + 54, $gr_purc_qty);
	}

	/**
	 * Purchase GR qty. 購入入庫数量.<p>
	 *
	 */
	public void gr_purc_qty(MCNumber value) {
		setConstNumber(offset + 54, $gr_purc_qty, value);
	}

	/**
	 * Purchase GR qty. 購入入庫数量.<p>
	 *
	 */
	public void gr_purc_qty(int value) {
		setConstNumber(offset + 54, $gr_purc_qty, value);
	}

	/**
	 * Purchase GR qty. 購入入庫数量.<p>
	 *
	 */
	public void gr_purc_qty(long value) {
		setConstNumber(offset + 54, $gr_purc_qty, value);
	}

	/**
	 * Purchase GR qty. 購入入庫数量.<p>
	 *
	 */
	public void gr_purc_qty(float value) {
		setConstNumber(offset + 54, $gr_purc_qty, value);
	}

	/**
	 * Purchase GR qty. 購入入庫数量.<p>
	 *
	 */
	public void gr_purc_qty(double value) {
		setConstNumber(offset + 54, $gr_purc_qty, value);
	}


	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public MCNumber accpt_dfct_qty() {
		return getConstNumber(offset + 55, $accpt_dfct_qty);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_qty(MCNumber value) {
		setConstNumber(offset + 55, $accpt_dfct_qty, value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_qty(int value) {
		setConstNumber(offset + 55, $accpt_dfct_qty, value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_qty(long value) {
		setConstNumber(offset + 55, $accpt_dfct_qty, value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_qty(float value) {
		setConstNumber(offset + 55, $accpt_dfct_qty, value);
	}

	/**
	 * Defective acceptance GR qty. 検収不良入庫数量.<p>
	 *
	 */
	public void accpt_dfct_qty(double value) {
		setConstNumber(offset + 55, $accpt_dfct_qty, value);
	}


	/**
	 * Mfg. GR qty. 製造入庫数量.<p>
	 *
	 */
	public MCNumber gr_prod_qty() {
		return getConstNumber(offset + 56, $gr_prod_qty);
	}

	/**
	 * Mfg. GR qty. 製造入庫数量.<p>
	 *
	 */
	public void gr_prod_qty(MCNumber value) {
		setConstNumber(offset + 56, $gr_prod_qty, value);
	}

	/**
	 * Mfg. GR qty. 製造入庫数量.<p>
	 *
	 */
	public void gr_prod_qty(int value) {
		setConstNumber(offset + 56, $gr_prod_qty, value);
	}

	/**
	 * Mfg. GR qty. 製造入庫数量.<p>
	 *
	 */
	public void gr_prod_qty(long value) {
		setConstNumber(offset + 56, $gr_prod_qty, value);
	}

	/**
	 * Mfg. GR qty. 製造入庫数量.<p>
	 *
	 */
	public void gr_prod_qty(float value) {
		setConstNumber(offset + 56, $gr_prod_qty, value);
	}

	/**
	 * Mfg. GR qty. 製造入庫数量.<p>
	 *
	 */
	public void gr_prod_qty(double value) {
		setConstNumber(offset + 56, $gr_prod_qty, value);
	}


	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public MCNumber gr_xfr_qty() {
		return getConstNumber(offset + 57, $gr_xfr_qty);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void gr_xfr_qty(MCNumber value) {
		setConstNumber(offset + 57, $gr_xfr_qty, value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void gr_xfr_qty(int value) {
		setConstNumber(offset + 57, $gr_xfr_qty, value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void gr_xfr_qty(long value) {
		setConstNumber(offset + 57, $gr_xfr_qty, value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void gr_xfr_qty(float value) {
		setConstNumber(offset + 57, $gr_xfr_qty, value);
	}

	/**
	 * Movement/transport GR qty. 移動・移送入庫数量.<p>
	 *
	 */
	public void gr_xfr_qty(double value) {
		setConstNumber(offset + 57, $gr_xfr_qty, value);
	}


	/**
	 * Receiving GR qty. 受給入庫数量.<p>
	 *
	 */
	public MCNumber gr_rcv_qty() {
		return getConstNumber(offset + 58, $gr_rcv_qty);
	}

	/**
	 * Receiving GR qty. 受給入庫数量.<p>
	 *
	 */
	public void gr_rcv_qty(MCNumber value) {
		setConstNumber(offset + 58, $gr_rcv_qty, value);
	}

	/**
	 * Receiving GR qty. 受給入庫数量.<p>
	 *
	 */
	public void gr_rcv_qty(int value) {
		setConstNumber(offset + 58, $gr_rcv_qty, value);
	}

	/**
	 * Receiving GR qty. 受給入庫数量.<p>
	 *
	 */
	public void gr_rcv_qty(long value) {
		setConstNumber(offset + 58, $gr_rcv_qty, value);
	}

	/**
	 * Receiving GR qty. 受給入庫数量.<p>
	 *
	 */
	public void gr_rcv_qty(float value) {
		setConstNumber(offset + 58, $gr_rcv_qty, value);
	}

	/**
	 * Receiving GR qty. 受給入庫数量.<p>
	 *
	 */
	public void gr_rcv_qty(double value) {
		setConstNumber(offset + 58, $gr_rcv_qty, value);
	}


	/**
	 * Inventory transfer GR qty. 在庫振替入庫数量.<p>
	 *
	 */
	public MCNumber gr_stk_xfr_qty() {
		return getConstNumber(offset + 59, $gr_stk_xfr_qty);
	}

	/**
	 * Inventory transfer GR qty. 在庫振替入庫数量.<p>
	 *
	 */
	public void gr_stk_xfr_qty(MCNumber value) {
		setConstNumber(offset + 59, $gr_stk_xfr_qty, value);
	}

	/**
	 * Inventory transfer GR qty. 在庫振替入庫数量.<p>
	 *
	 */
	public void gr_stk_xfr_qty(int value) {
		setConstNumber(offset + 59, $gr_stk_xfr_qty, value);
	}

	/**
	 * Inventory transfer GR qty. 在庫振替入庫数量.<p>
	 *
	 */
	public void gr_stk_xfr_qty(long value) {
		setConstNumber(offset + 59, $gr_stk_xfr_qty, value);
	}

	/**
	 * Inventory transfer GR qty. 在庫振替入庫数量.<p>
	 *
	 */
	public void gr_stk_xfr_qty(float value) {
		setConstNumber(offset + 59, $gr_stk_xfr_qty, value);
	}

	/**
	 * Inventory transfer GR qty. 在庫振替入庫数量.<p>
	 *
	 */
	public void gr_stk_xfr_qty(double value) {
		setConstNumber(offset + 59, $gr_stk_xfr_qty, value);
	}


	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public MCNumber gr_ac_xfr_qty() {
		return getConstNumber(offset + 60, $gr_ac_xfr_qty);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void gr_ac_xfr_qty(MCNumber value) {
		setConstNumber(offset + 60, $gr_ac_xfr_qty, value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void gr_ac_xfr_qty(int value) {
		setConstNumber(offset + 60, $gr_ac_xfr_qty, value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void gr_ac_xfr_qty(long value) {
		setConstNumber(offset + 60, $gr_ac_xfr_qty, value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void gr_ac_xfr_qty(float value) {
		setConstNumber(offset + 60, $gr_ac_xfr_qty, value);
	}

	/**
	 * Other accounting transfer GR qty. 他勘定振替入庫数量.<p>
	 *
	 */
	public void gr_ac_xfr_qty(double value) {
		setConstNumber(offset + 60, $gr_ac_xfr_qty, value);
	}


	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public MCNumber gi_total_qty() {
		return getConstNumber(offset + 61, $gi_total_qty);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(MCNumber value) {
		setConstNumber(offset + 61, $gi_total_qty, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(int value) {
		setConstNumber(offset + 61, $gi_total_qty, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(long value) {
		setConstNumber(offset + 61, $gi_total_qty, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(float value) {
		setConstNumber(offset + 61, $gi_total_qty, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_qty(double value) {
		setConstNumber(offset + 61, $gi_total_qty, value);
	}


	/**
	 * Input GI qty. 投入出庫数量.<p>
	 *
	 */
	public MCNumber gi_input_qty() {
		return getConstNumber(offset + 62, $gi_input_qty);
	}

	/**
	 * Input GI qty. 投入出庫数量.<p>
	 *
	 */
	public void gi_input_qty(MCNumber value) {
		setConstNumber(offset + 62, $gi_input_qty, value);
	}

	/**
	 * Input GI qty. 投入出庫数量.<p>
	 *
	 */
	public void gi_input_qty(int value) {
		setConstNumber(offset + 62, $gi_input_qty, value);
	}

	/**
	 * Input GI qty. 投入出庫数量.<p>
	 *
	 */
	public void gi_input_qty(long value) {
		setConstNumber(offset + 62, $gi_input_qty, value);
	}

	/**
	 * Input GI qty. 投入出庫数量.<p>
	 *
	 */
	public void gi_input_qty(float value) {
		setConstNumber(offset + 62, $gi_input_qty, value);
	}

	/**
	 * Input GI qty. 投入出庫数量.<p>
	 *
	 */
	public void gi_input_qty(double value) {
		setConstNumber(offset + 62, $gi_input_qty, value);
	}


	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public MCNumber gi_insp_qty() {
		return getConstNumber(offset + 63, $gi_insp_qty);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void gi_insp_qty(MCNumber value) {
		setConstNumber(offset + 63, $gi_insp_qty, value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void gi_insp_qty(int value) {
		setConstNumber(offset + 63, $gi_insp_qty, value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void gi_insp_qty(long value) {
		setConstNumber(offset + 63, $gi_insp_qty, value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void gi_insp_qty(float value) {
		setConstNumber(offset + 63, $gi_insp_qty, value);
	}

	/**
	 * Inspection GI qty. 検査出庫数量.<p>
	 *
	 */
	public void gi_insp_qty(double value) {
		setConstNumber(offset + 63, $gi_insp_qty, value);
	}


	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public MCNumber gi_xfr_qty() {
		return getConstNumber(offset + 64, $gi_xfr_qty);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void gi_xfr_qty(MCNumber value) {
		setConstNumber(offset + 64, $gi_xfr_qty, value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void gi_xfr_qty(int value) {
		setConstNumber(offset + 64, $gi_xfr_qty, value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void gi_xfr_qty(long value) {
		setConstNumber(offset + 64, $gi_xfr_qty, value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void gi_xfr_qty(float value) {
		setConstNumber(offset + 64, $gi_xfr_qty, value);
	}

	/**
	 * Movement/transport GI qty. 移動・移送出庫数量.<p>
	 *
	 */
	public void gi_xfr_qty(double value) {
		setConstNumber(offset + 64, $gi_xfr_qty, value);
	}


	/**
	 * Receiving return qty. 受給戻し数量.<p>
	 *
	 */
	public MCNumber rcv_ret_qty() {
		return getConstNumber(offset + 65, $rcv_ret_qty);
	}

	/**
	 * Receiving return qty. 受給戻し数量.<p>
	 *
	 */
	public void rcv_ret_qty(MCNumber value) {
		setConstNumber(offset + 65, $rcv_ret_qty, value);
	}

	/**
	 * Receiving return qty. 受給戻し数量.<p>
	 *
	 */
	public void rcv_ret_qty(int value) {
		setConstNumber(offset + 65, $rcv_ret_qty, value);
	}

	/**
	 * Receiving return qty. 受給戻し数量.<p>
	 *
	 */
	public void rcv_ret_qty(long value) {
		setConstNumber(offset + 65, $rcv_ret_qty, value);
	}

	/**
	 * Receiving return qty. 受給戻し数量.<p>
	 *
	 */
	public void rcv_ret_qty(float value) {
		setConstNumber(offset + 65, $rcv_ret_qty, value);
	}

	/**
	 * Receiving return qty. 受給戻し数量.<p>
	 *
	 */
	public void rcv_ret_qty(double value) {
		setConstNumber(offset + 65, $rcv_ret_qty, value);
	}


	/**
	 * Inventory transfer GI qty. 在庫振替出庫数量.<p>
	 *
	 */
	public MCNumber gi_stk_xfr_qty() {
		return getConstNumber(offset + 66, $gi_stk_xfr_qty);
	}

	/**
	 * Inventory transfer GI qty. 在庫振替出庫数量.<p>
	 *
	 */
	public void gi_stk_xfr_qty(MCNumber value) {
		setConstNumber(offset + 66, $gi_stk_xfr_qty, value);
	}

	/**
	 * Inventory transfer GI qty. 在庫振替出庫数量.<p>
	 *
	 */
	public void gi_stk_xfr_qty(int value) {
		setConstNumber(offset + 66, $gi_stk_xfr_qty, value);
	}

	/**
	 * Inventory transfer GI qty. 在庫振替出庫数量.<p>
	 *
	 */
	public void gi_stk_xfr_qty(long value) {
		setConstNumber(offset + 66, $gi_stk_xfr_qty, value);
	}

	/**
	 * Inventory transfer GI qty. 在庫振替出庫数量.<p>
	 *
	 */
	public void gi_stk_xfr_qty(float value) {
		setConstNumber(offset + 66, $gi_stk_xfr_qty, value);
	}

	/**
	 * Inventory transfer GI qty. 在庫振替出庫数量.<p>
	 *
	 */
	public void gi_stk_xfr_qty(double value) {
		setConstNumber(offset + 66, $gi_stk_xfr_qty, value);
	}


	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public MCNumber gi_ac_xfr_qty() {
		return getConstNumber(offset + 67, $gi_ac_xfr_qty);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void gi_ac_xfr_qty(MCNumber value) {
		setConstNumber(offset + 67, $gi_ac_xfr_qty, value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void gi_ac_xfr_qty(int value) {
		setConstNumber(offset + 67, $gi_ac_xfr_qty, value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void gi_ac_xfr_qty(long value) {
		setConstNumber(offset + 67, $gi_ac_xfr_qty, value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void gi_ac_xfr_qty(float value) {
		setConstNumber(offset + 67, $gi_ac_xfr_qty, value);
	}

	/**
	 * Other accounting transfer GI qty. 他勘定振替出庫数量.<p>
	 *
	 */
	public void gi_ac_xfr_qty(double value) {
		setConstNumber(offset + 67, $gi_ac_xfr_qty, value);
	}


	/**
	 * Inventory count decreased qty. 棚卸減数量.<p>
	 *
	 */
	public MCNumber stktk_minus_qty() {
		return getConstNumber(offset + 68, $stktk_minus_qty);
	}

	/**
	 * Inventory count decreased qty. 棚卸減数量.<p>
	 *
	 */
	public void stktk_minus_qty(MCNumber value) {
		setConstNumber(offset + 68, $stktk_minus_qty, value);
	}

	/**
	 * Inventory count decreased qty. 棚卸減数量.<p>
	 *
	 */
	public void stktk_minus_qty(int value) {
		setConstNumber(offset + 68, $stktk_minus_qty, value);
	}

	/**
	 * Inventory count decreased qty. 棚卸減数量.<p>
	 *
	 */
	public void stktk_minus_qty(long value) {
		setConstNumber(offset + 68, $stktk_minus_qty, value);
	}

	/**
	 * Inventory count decreased qty. 棚卸減数量.<p>
	 *
	 */
	public void stktk_minus_qty(float value) {
		setConstNumber(offset + 68, $stktk_minus_qty, value);
	}

	/**
	 * Inventory count decreased qty. 棚卸減数量.<p>
	 *
	 */
	public void stktk_minus_qty(double value) {
		setConstNumber(offset + 68, $stktk_minus_qty, value);
	}


	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public MCNumber sls_qty() {
		return getConstNumber(offset + 69, $sls_qty);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(MCNumber value) {
		setConstNumber(offset + 69, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(int value) {
		setConstNumber(offset + 69, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(long value) {
		setConstNumber(offset + 69, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(float value) {
		setConstNumber(offset + 69, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(double value) {
		setConstNumber(offset + 69, $sls_qty, value);
	}


	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public MCNumber end_stk_qty() {
		return getConstNumber(offset + 70, $end_stk_qty);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(MCNumber value) {
		setConstNumber(offset + 70, $end_stk_qty, value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(int value) {
		setConstNumber(offset + 70, $end_stk_qty, value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(long value) {
		setConstNumber(offset + 70, $end_stk_qty, value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(float value) {
		setConstNumber(offset + 70, $end_stk_qty, value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(double value) {
		setConstNumber(offset + 70, $end_stk_qty, value);
	}


	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public MCNumber ini_stk_amt() {
		return getConstNumber(offset + 71, $ini_stk_amt);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(MCNumber value) {
		setConstNumber(offset + 71, $ini_stk_amt, value);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(int value) {
		setConstNumber(offset + 71, $ini_stk_amt, value);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(long value) {
		setConstNumber(offset + 71, $ini_stk_amt, value);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(float value) {
		setConstNumber(offset + 71, $ini_stk_amt, value);
	}

	/**
	 * Beginning inventory amount 月初在庫金額.<p>
	 *
	 */
	public void ini_stk_amt(double value) {
		setConstNumber(offset + 71, $ini_stk_amt, value);
	}


	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public MCNumber gr_total_amt() {
		return getConstNumber(offset + 72, $gr_total_amt);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(MCNumber value) {
		setConstNumber(offset + 72, $gr_total_amt, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(int value) {
		setConstNumber(offset + 72, $gr_total_amt, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(long value) {
		setConstNumber(offset + 72, $gr_total_amt, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(float value) {
		setConstNumber(offset + 72, $gr_total_amt, value);
	}

	/**
	 * Total GR 入庫計.<p>
	 *
	 */
	public void gr_total_amt(double value) {
		setConstNumber(offset + 72, $gr_total_amt, value);
	}


	/**
	 * Receipt amount before acceptance 検収前入荷金額.<p>
	 *
	 */
	public MCNumber purc_bf_accpt_amt() {
		return getConstNumber(offset + 73, $purc_bf_accpt_amt);
	}

	/**
	 * Receipt amount before acceptance 検収前入荷金額.<p>
	 *
	 */
	public void purc_bf_accpt_amt(MCNumber value) {
		setConstNumber(offset + 73, $purc_bf_accpt_amt, value);
	}

	/**
	 * Receipt amount before acceptance 検収前入荷金額.<p>
	 *
	 */
	public void purc_bf_accpt_amt(int value) {
		setConstNumber(offset + 73, $purc_bf_accpt_amt, value);
	}

	/**
	 * Receipt amount before acceptance 検収前入荷金額.<p>
	 *
	 */
	public void purc_bf_accpt_amt(long value) {
		setConstNumber(offset + 73, $purc_bf_accpt_amt, value);
	}

	/**
	 * Receipt amount before acceptance 検収前入荷金額.<p>
	 *
	 */
	public void purc_bf_accpt_amt(float value) {
		setConstNumber(offset + 73, $purc_bf_accpt_amt, value);
	}

	/**
	 * Receipt amount before acceptance 検収前入荷金額.<p>
	 *
	 */
	public void purc_bf_accpt_amt(double value) {
		setConstNumber(offset + 73, $purc_bf_accpt_amt, value);
	}


	/**
	 * Purchase GR amount 購入入庫金額.<p>
	 *
	 */
	public MCNumber gr_purc_amt() {
		return getConstNumber(offset + 74, $gr_purc_amt);
	}

	/**
	 * Purchase GR amount 購入入庫金額.<p>
	 *
	 */
	public void gr_purc_amt(MCNumber value) {
		setConstNumber(offset + 74, $gr_purc_amt, value);
	}

	/**
	 * Purchase GR amount 購入入庫金額.<p>
	 *
	 */
	public void gr_purc_amt(int value) {
		setConstNumber(offset + 74, $gr_purc_amt, value);
	}

	/**
	 * Purchase GR amount 購入入庫金額.<p>
	 *
	 */
	public void gr_purc_amt(long value) {
		setConstNumber(offset + 74, $gr_purc_amt, value);
	}

	/**
	 * Purchase GR amount 購入入庫金額.<p>
	 *
	 */
	public void gr_purc_amt(float value) {
		setConstNumber(offset + 74, $gr_purc_amt, value);
	}

	/**
	 * Purchase GR amount 購入入庫金額.<p>
	 *
	 */
	public void gr_purc_amt(double value) {
		setConstNumber(offset + 74, $gr_purc_amt, value);
	}


	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public MCNumber accpt_dfct_amt() {
		return getConstNumber(offset + 75, $accpt_dfct_amt);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_amt(MCNumber value) {
		setConstNumber(offset + 75, $accpt_dfct_amt, value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_amt(int value) {
		setConstNumber(offset + 75, $accpt_dfct_amt, value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_amt(long value) {
		setConstNumber(offset + 75, $accpt_dfct_amt, value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_amt(float value) {
		setConstNumber(offset + 75, $accpt_dfct_amt, value);
	}

	/**
	 * Defective acceptance GR amount 検収不良入庫金額.<p>
	 *
	 */
	public void accpt_dfct_amt(double value) {
		setConstNumber(offset + 75, $accpt_dfct_amt, value);
	}


	/**
	 * Mfg. GR amount 製造入庫金額.<p>
	 *
	 */
	public MCNumber gr_prod_amt() {
		return getConstNumber(offset + 76, $gr_prod_amt);
	}

	/**
	 * Mfg. GR amount 製造入庫金額.<p>
	 *
	 */
	public void gr_prod_amt(MCNumber value) {
		setConstNumber(offset + 76, $gr_prod_amt, value);
	}

	/**
	 * Mfg. GR amount 製造入庫金額.<p>
	 *
	 */
	public void gr_prod_amt(int value) {
		setConstNumber(offset + 76, $gr_prod_amt, value);
	}

	/**
	 * Mfg. GR amount 製造入庫金額.<p>
	 *
	 */
	public void gr_prod_amt(long value) {
		setConstNumber(offset + 76, $gr_prod_amt, value);
	}

	/**
	 * Mfg. GR amount 製造入庫金額.<p>
	 *
	 */
	public void gr_prod_amt(float value) {
		setConstNumber(offset + 76, $gr_prod_amt, value);
	}

	/**
	 * Mfg. GR amount 製造入庫金額.<p>
	 *
	 */
	public void gr_prod_amt(double value) {
		setConstNumber(offset + 76, $gr_prod_amt, value);
	}


	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public MCNumber gr_xfr_amt() {
		return getConstNumber(offset + 77, $gr_xfr_amt);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void gr_xfr_amt(MCNumber value) {
		setConstNumber(offset + 77, $gr_xfr_amt, value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void gr_xfr_amt(int value) {
		setConstNumber(offset + 77, $gr_xfr_amt, value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void gr_xfr_amt(long value) {
		setConstNumber(offset + 77, $gr_xfr_amt, value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void gr_xfr_amt(float value) {
		setConstNumber(offset + 77, $gr_xfr_amt, value);
	}

	/**
	 * Movement/transport GR amount 移動・移送入庫金額.<p>
	 *
	 */
	public void gr_xfr_amt(double value) {
		setConstNumber(offset + 77, $gr_xfr_amt, value);
	}


	/**
	 * GR incoming amount 受給入庫金額.<p>
	 *
	 */
	public MCNumber gr_rcv_amt() {
		return getConstNumber(offset + 78, $gr_rcv_amt);
	}

	/**
	 * GR incoming amount 受給入庫金額.<p>
	 *
	 */
	public void gr_rcv_amt(MCNumber value) {
		setConstNumber(offset + 78, $gr_rcv_amt, value);
	}

	/**
	 * GR incoming amount 受給入庫金額.<p>
	 *
	 */
	public void gr_rcv_amt(int value) {
		setConstNumber(offset + 78, $gr_rcv_amt, value);
	}

	/**
	 * GR incoming amount 受給入庫金額.<p>
	 *
	 */
	public void gr_rcv_amt(long value) {
		setConstNumber(offset + 78, $gr_rcv_amt, value);
	}

	/**
	 * GR incoming amount 受給入庫金額.<p>
	 *
	 */
	public void gr_rcv_amt(float value) {
		setConstNumber(offset + 78, $gr_rcv_amt, value);
	}

	/**
	 * GR incoming amount 受給入庫金額.<p>
	 *
	 */
	public void gr_rcv_amt(double value) {
		setConstNumber(offset + 78, $gr_rcv_amt, value);
	}


	/**
	 * Inventory transfer GR amount 在庫振替入庫金額.<p>
	 *
	 */
	public MCNumber gr_stk_xfr_amt() {
		return getConstNumber(offset + 79, $gr_stk_xfr_amt);
	}

	/**
	 * Inventory transfer GR amount 在庫振替入庫金額.<p>
	 *
	 */
	public void gr_stk_xfr_amt(MCNumber value) {
		setConstNumber(offset + 79, $gr_stk_xfr_amt, value);
	}

	/**
	 * Inventory transfer GR amount 在庫振替入庫金額.<p>
	 *
	 */
	public void gr_stk_xfr_amt(int value) {
		setConstNumber(offset + 79, $gr_stk_xfr_amt, value);
	}

	/**
	 * Inventory transfer GR amount 在庫振替入庫金額.<p>
	 *
	 */
	public void gr_stk_xfr_amt(long value) {
		setConstNumber(offset + 79, $gr_stk_xfr_amt, value);
	}

	/**
	 * Inventory transfer GR amount 在庫振替入庫金額.<p>
	 *
	 */
	public void gr_stk_xfr_amt(float value) {
		setConstNumber(offset + 79, $gr_stk_xfr_amt, value);
	}

	/**
	 * Inventory transfer GR amount 在庫振替入庫金額.<p>
	 *
	 */
	public void gr_stk_xfr_amt(double value) {
		setConstNumber(offset + 79, $gr_stk_xfr_amt, value);
	}


	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public MCNumber gr_ac_xfr_amt() {
		return getConstNumber(offset + 80, $gr_ac_xfr_amt);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void gr_ac_xfr_amt(MCNumber value) {
		setConstNumber(offset + 80, $gr_ac_xfr_amt, value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void gr_ac_xfr_amt(int value) {
		setConstNumber(offset + 80, $gr_ac_xfr_amt, value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void gr_ac_xfr_amt(long value) {
		setConstNumber(offset + 80, $gr_ac_xfr_amt, value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void gr_ac_xfr_amt(float value) {
		setConstNumber(offset + 80, $gr_ac_xfr_amt, value);
	}

	/**
	 * Other accounting transfer GR amount 他勘定振替入庫金額.<p>
	 *
	 */
	public void gr_ac_xfr_amt(double value) {
		setConstNumber(offset + 80, $gr_ac_xfr_amt, value);
	}


	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public MCNumber gi_total_amt() {
		return getConstNumber(offset + 81, $gi_total_amt);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(MCNumber value) {
		setConstNumber(offset + 81, $gi_total_amt, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(int value) {
		setConstNumber(offset + 81, $gi_total_amt, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(long value) {
		setConstNumber(offset + 81, $gi_total_amt, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(float value) {
		setConstNumber(offset + 81, $gi_total_amt, value);
	}

	/**
	 * Total GI 出庫計.<p>
	 *
	 */
	public void gi_total_amt(double value) {
		setConstNumber(offset + 81, $gi_total_amt, value);
	}


	/**
	 * Input GI amount 投入出庫金額.<p>
	 *
	 */
	public MCNumber gi_input_amt() {
		return getConstNumber(offset + 82, $gi_input_amt);
	}

	/**
	 * Input GI amount 投入出庫金額.<p>
	 *
	 */
	public void gi_input_amt(MCNumber value) {
		setConstNumber(offset + 82, $gi_input_amt, value);
	}

	/**
	 * Input GI amount 投入出庫金額.<p>
	 *
	 */
	public void gi_input_amt(int value) {
		setConstNumber(offset + 82, $gi_input_amt, value);
	}

	/**
	 * Input GI amount 投入出庫金額.<p>
	 *
	 */
	public void gi_input_amt(long value) {
		setConstNumber(offset + 82, $gi_input_amt, value);
	}

	/**
	 * Input GI amount 投入出庫金額.<p>
	 *
	 */
	public void gi_input_amt(float value) {
		setConstNumber(offset + 82, $gi_input_amt, value);
	}

	/**
	 * Input GI amount 投入出庫金額.<p>
	 *
	 */
	public void gi_input_amt(double value) {
		setConstNumber(offset + 82, $gi_input_amt, value);
	}


	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public MCNumber gi_insp_amt() {
		return getConstNumber(offset + 83, $gi_insp_amt);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void gi_insp_amt(MCNumber value) {
		setConstNumber(offset + 83, $gi_insp_amt, value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void gi_insp_amt(int value) {
		setConstNumber(offset + 83, $gi_insp_amt, value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void gi_insp_amt(long value) {
		setConstNumber(offset + 83, $gi_insp_amt, value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void gi_insp_amt(float value) {
		setConstNumber(offset + 83, $gi_insp_amt, value);
	}

	/**
	 * Inspection GI amount 検査出庫金額.<p>
	 *
	 */
	public void gi_insp_amt(double value) {
		setConstNumber(offset + 83, $gi_insp_amt, value);
	}


	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public MCNumber gi_xfr_amt() {
		return getConstNumber(offset + 84, $gi_xfr_amt);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void gi_xfr_amt(MCNumber value) {
		setConstNumber(offset + 84, $gi_xfr_amt, value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void gi_xfr_amt(int value) {
		setConstNumber(offset + 84, $gi_xfr_amt, value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void gi_xfr_amt(long value) {
		setConstNumber(offset + 84, $gi_xfr_amt, value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void gi_xfr_amt(float value) {
		setConstNumber(offset + 84, $gi_xfr_amt, value);
	}

	/**
	 * Movement/transport GI amount 移動・移送出庫金額.<p>
	 *
	 */
	public void gi_xfr_amt(double value) {
		setConstNumber(offset + 84, $gi_xfr_amt, value);
	}


	/**
	 * Receiving return amount 受給戻し金額.<p>
	 *
	 */
	public MCNumber rcv_ret_amt() {
		return getConstNumber(offset + 85, $rcv_ret_amt);
	}

	/**
	 * Receiving return amount 受給戻し金額.<p>
	 *
	 */
	public void rcv_ret_amt(MCNumber value) {
		setConstNumber(offset + 85, $rcv_ret_amt, value);
	}

	/**
	 * Receiving return amount 受給戻し金額.<p>
	 *
	 */
	public void rcv_ret_amt(int value) {
		setConstNumber(offset + 85, $rcv_ret_amt, value);
	}

	/**
	 * Receiving return amount 受給戻し金額.<p>
	 *
	 */
	public void rcv_ret_amt(long value) {
		setConstNumber(offset + 85, $rcv_ret_amt, value);
	}

	/**
	 * Receiving return amount 受給戻し金額.<p>
	 *
	 */
	public void rcv_ret_amt(float value) {
		setConstNumber(offset + 85, $rcv_ret_amt, value);
	}

	/**
	 * Receiving return amount 受給戻し金額.<p>
	 *
	 */
	public void rcv_ret_amt(double value) {
		setConstNumber(offset + 85, $rcv_ret_amt, value);
	}


	/**
	 * Inventory transfer GI amount 在庫振替出庫金額.<p>
	 *
	 */
	public MCNumber gi_stk_xfr_amt() {
		return getConstNumber(offset + 86, $gi_stk_xfr_amt);
	}

	/**
	 * Inventory transfer GI amount 在庫振替出庫金額.<p>
	 *
	 */
	public void gi_stk_xfr_amt(MCNumber value) {
		setConstNumber(offset + 86, $gi_stk_xfr_amt, value);
	}

	/**
	 * Inventory transfer GI amount 在庫振替出庫金額.<p>
	 *
	 */
	public void gi_stk_xfr_amt(int value) {
		setConstNumber(offset + 86, $gi_stk_xfr_amt, value);
	}

	/**
	 * Inventory transfer GI amount 在庫振替出庫金額.<p>
	 *
	 */
	public void gi_stk_xfr_amt(long value) {
		setConstNumber(offset + 86, $gi_stk_xfr_amt, value);
	}

	/**
	 * Inventory transfer GI amount 在庫振替出庫金額.<p>
	 *
	 */
	public void gi_stk_xfr_amt(float value) {
		setConstNumber(offset + 86, $gi_stk_xfr_amt, value);
	}

	/**
	 * Inventory transfer GI amount 在庫振替出庫金額.<p>
	 *
	 */
	public void gi_stk_xfr_amt(double value) {
		setConstNumber(offset + 86, $gi_stk_xfr_amt, value);
	}


	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public MCNumber gi_ac_xfr_amt() {
		return getConstNumber(offset + 87, $gi_ac_xfr_amt);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void gi_ac_xfr_amt(MCNumber value) {
		setConstNumber(offset + 87, $gi_ac_xfr_amt, value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void gi_ac_xfr_amt(int value) {
		setConstNumber(offset + 87, $gi_ac_xfr_amt, value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void gi_ac_xfr_amt(long value) {
		setConstNumber(offset + 87, $gi_ac_xfr_amt, value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void gi_ac_xfr_amt(float value) {
		setConstNumber(offset + 87, $gi_ac_xfr_amt, value);
	}

	/**
	 * Other accounting transfer GI amount 他勘定振替出庫金額.<p>
	 *
	 */
	public void gi_ac_xfr_amt(double value) {
		setConstNumber(offset + 87, $gi_ac_xfr_amt, value);
	}


	/**
	 * Inventory count decreased amount 棚卸減金額.<p>
	 *
	 */
	public MCNumber stktk_minus_amt() {
		return getConstNumber(offset + 88, $stktk_minus_amt);
	}

	/**
	 * Inventory count decreased amount 棚卸減金額.<p>
	 *
	 */
	public void stktk_minus_amt(MCNumber value) {
		setConstNumber(offset + 88, $stktk_minus_amt, value);
	}

	/**
	 * Inventory count decreased amount 棚卸減金額.<p>
	 *
	 */
	public void stktk_minus_amt(int value) {
		setConstNumber(offset + 88, $stktk_minus_amt, value);
	}

	/**
	 * Inventory count decreased amount 棚卸減金額.<p>
	 *
	 */
	public void stktk_minus_amt(long value) {
		setConstNumber(offset + 88, $stktk_minus_amt, value);
	}

	/**
	 * Inventory count decreased amount 棚卸減金額.<p>
	 *
	 */
	public void stktk_minus_amt(float value) {
		setConstNumber(offset + 88, $stktk_minus_amt, value);
	}

	/**
	 * Inventory count decreased amount 棚卸減金額.<p>
	 *
	 */
	public void stktk_minus_amt(double value) {
		setConstNumber(offset + 88, $stktk_minus_amt, value);
	}


	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 89, $sls_amt);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 89, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 89, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 89, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 89, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 89, $sls_amt, value);
	}


	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public MCNumber end_stk_amt() {
		return getConstNumber(offset + 90, $end_stk_amt);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(MCNumber value) {
		setConstNumber(offset + 90, $end_stk_amt, value);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(int value) {
		setConstNumber(offset + 90, $end_stk_amt, value);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(long value) {
		setConstNumber(offset + 90, $end_stk_amt, value);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(float value) {
		setConstNumber(offset + 90, $end_stk_amt, value);
	}

	/**
	 * Ending inventory amount 月末在庫金額.<p>
	 *
	 */
	public void end_stk_amt(double value) {
		setConstNumber(offset + 90, $end_stk_amt, value);
	}


	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public String io_act_typ() {
		return getConstString(offset + 91, $io_act_typ);
	}

	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public void io_act_typ(String value) {
		setConstString(offset + 91, $io_act_typ, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
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
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
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
		if ($purc_bf_accpt_qty.equalsIgnoreCase(name)) {
			return purc_bf_accpt_qty();
		}
		if ($gr_purc_qty.equalsIgnoreCase(name)) {
			return gr_purc_qty();
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			return accpt_dfct_qty();
		}
		if ($gr_prod_qty.equalsIgnoreCase(name)) {
			return gr_prod_qty();
		}
		if ($gr_xfr_qty.equalsIgnoreCase(name)) {
			return gr_xfr_qty();
		}
		if ($gr_rcv_qty.equalsIgnoreCase(name)) {
			return gr_rcv_qty();
		}
		if ($gr_stk_xfr_qty.equalsIgnoreCase(name)) {
			return gr_stk_xfr_qty();
		}
		if ($gr_ac_xfr_qty.equalsIgnoreCase(name)) {
			return gr_ac_xfr_qty();
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			return gi_total_qty();
		}
		if ($gi_input_qty.equalsIgnoreCase(name)) {
			return gi_input_qty();
		}
		if ($gi_insp_qty.equalsIgnoreCase(name)) {
			return gi_insp_qty();
		}
		if ($gi_xfr_qty.equalsIgnoreCase(name)) {
			return gi_xfr_qty();
		}
		if ($rcv_ret_qty.equalsIgnoreCase(name)) {
			return rcv_ret_qty();
		}
		if ($gi_stk_xfr_qty.equalsIgnoreCase(name)) {
			return gi_stk_xfr_qty();
		}
		if ($gi_ac_xfr_qty.equalsIgnoreCase(name)) {
			return gi_ac_xfr_qty();
		}
		if ($stktk_minus_qty.equalsIgnoreCase(name)) {
			return stktk_minus_qty();
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
		if ($purc_bf_accpt_amt.equalsIgnoreCase(name)) {
			return purc_bf_accpt_amt();
		}
		if ($gr_purc_amt.equalsIgnoreCase(name)) {
			return gr_purc_amt();
		}
		if ($accpt_dfct_amt.equalsIgnoreCase(name)) {
			return accpt_dfct_amt();
		}
		if ($gr_prod_amt.equalsIgnoreCase(name)) {
			return gr_prod_amt();
		}
		if ($gr_xfr_amt.equalsIgnoreCase(name)) {
			return gr_xfr_amt();
		}
		if ($gr_rcv_amt.equalsIgnoreCase(name)) {
			return gr_rcv_amt();
		}
		if ($gr_stk_xfr_amt.equalsIgnoreCase(name)) {
			return gr_stk_xfr_amt();
		}
		if ($gr_ac_xfr_amt.equalsIgnoreCase(name)) {
			return gr_ac_xfr_amt();
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			return gi_total_amt();
		}
		if ($gi_input_amt.equalsIgnoreCase(name)) {
			return gi_input_amt();
		}
		if ($gi_insp_amt.equalsIgnoreCase(name)) {
			return gi_insp_amt();
		}
		if ($gi_xfr_amt.equalsIgnoreCase(name)) {
			return gi_xfr_amt();
		}
		if ($rcv_ret_amt.equalsIgnoreCase(name)) {
			return rcv_ret_amt();
		}
		if ($gi_stk_xfr_amt.equalsIgnoreCase(name)) {
			return gi_stk_xfr_amt();
		}
		if ($gi_ac_xfr_amt.equalsIgnoreCase(name)) {
			return gi_ac_xfr_amt();
		}
		if ($stktk_minus_amt.equalsIgnoreCase(name)) {
			return stktk_minus_amt();
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

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
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
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
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
		if ($purc_bf_accpt_qty.equalsIgnoreCase(name)) {
			return purc_bf_accpt_qty();
		}
		if ($gr_purc_qty.equalsIgnoreCase(name)) {
			return gr_purc_qty();
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			return accpt_dfct_qty();
		}
		if ($gr_prod_qty.equalsIgnoreCase(name)) {
			return gr_prod_qty();
		}
		if ($gr_xfr_qty.equalsIgnoreCase(name)) {
			return gr_xfr_qty();
		}
		if ($gr_rcv_qty.equalsIgnoreCase(name)) {
			return gr_rcv_qty();
		}
		if ($gr_stk_xfr_qty.equalsIgnoreCase(name)) {
			return gr_stk_xfr_qty();
		}
		if ($gr_ac_xfr_qty.equalsIgnoreCase(name)) {
			return gr_ac_xfr_qty();
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			return gi_total_qty();
		}
		if ($gi_input_qty.equalsIgnoreCase(name)) {
			return gi_input_qty();
		}
		if ($gi_insp_qty.equalsIgnoreCase(name)) {
			return gi_insp_qty();
		}
		if ($gi_xfr_qty.equalsIgnoreCase(name)) {
			return gi_xfr_qty();
		}
		if ($rcv_ret_qty.equalsIgnoreCase(name)) {
			return rcv_ret_qty();
		}
		if ($gi_stk_xfr_qty.equalsIgnoreCase(name)) {
			return gi_stk_xfr_qty();
		}
		if ($gi_ac_xfr_qty.equalsIgnoreCase(name)) {
			return gi_ac_xfr_qty();
		}
		if ($stktk_minus_qty.equalsIgnoreCase(name)) {
			return stktk_minus_qty();
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
		if ($purc_bf_accpt_amt.equalsIgnoreCase(name)) {
			return purc_bf_accpt_amt();
		}
		if ($gr_purc_amt.equalsIgnoreCase(name)) {
			return gr_purc_amt();
		}
		if ($accpt_dfct_amt.equalsIgnoreCase(name)) {
			return accpt_dfct_amt();
		}
		if ($gr_prod_amt.equalsIgnoreCase(name)) {
			return gr_prod_amt();
		}
		if ($gr_xfr_amt.equalsIgnoreCase(name)) {
			return gr_xfr_amt();
		}
		if ($gr_rcv_amt.equalsIgnoreCase(name)) {
			return gr_rcv_amt();
		}
		if ($gr_stk_xfr_amt.equalsIgnoreCase(name)) {
			return gr_stk_xfr_amt();
		}
		if ($gr_ac_xfr_amt.equalsIgnoreCase(name)) {
			return gr_ac_xfr_amt();
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			return gi_total_amt();
		}
		if ($gi_input_amt.equalsIgnoreCase(name)) {
			return gi_input_amt();
		}
		if ($gi_insp_amt.equalsIgnoreCase(name)) {
			return gi_insp_amt();
		}
		if ($gi_xfr_amt.equalsIgnoreCase(name)) {
			return gi_xfr_amt();
		}
		if ($rcv_ret_amt.equalsIgnoreCase(name)) {
			return rcv_ret_amt();
		}
		if ($gi_stk_xfr_amt.equalsIgnoreCase(name)) {
			return gi_stk_xfr_amt();
		}
		if ($gi_ac_xfr_amt.equalsIgnoreCase(name)) {
			return gi_ac_xfr_amt();
		}
		if ($stktk_minus_amt.equalsIgnoreCase(name)) {
			return stktk_minus_amt();
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

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($purc_bf_accpt_qty.equalsIgnoreCase(name)) {
			purc_bf_accpt_qty(value);
			return;
		}
		if ($gr_purc_qty.equalsIgnoreCase(name)) {
			gr_purc_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($gr_prod_qty.equalsIgnoreCase(name)) {
			gr_prod_qty(value);
			return;
		}
		if ($gr_xfr_qty.equalsIgnoreCase(name)) {
			gr_xfr_qty(value);
			return;
		}
		if ($gr_rcv_qty.equalsIgnoreCase(name)) {
			gr_rcv_qty(value);
			return;
		}
		if ($gr_stk_xfr_qty.equalsIgnoreCase(name)) {
			gr_stk_xfr_qty(value);
			return;
		}
		if ($gr_ac_xfr_qty.equalsIgnoreCase(name)) {
			gr_ac_xfr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($gi_input_qty.equalsIgnoreCase(name)) {
			gi_input_qty(value);
			return;
		}
		if ($gi_insp_qty.equalsIgnoreCase(name)) {
			gi_insp_qty(value);
			return;
		}
		if ($gi_xfr_qty.equalsIgnoreCase(name)) {
			gi_xfr_qty(value);
			return;
		}
		if ($rcv_ret_qty.equalsIgnoreCase(name)) {
			rcv_ret_qty(value);
			return;
		}
		if ($gi_stk_xfr_qty.equalsIgnoreCase(name)) {
			gi_stk_xfr_qty(value);
			return;
		}
		if ($gi_ac_xfr_qty.equalsIgnoreCase(name)) {
			gi_ac_xfr_qty(value);
			return;
		}
		if ($stktk_minus_qty.equalsIgnoreCase(name)) {
			stktk_minus_qty(value);
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
		if ($purc_bf_accpt_amt.equalsIgnoreCase(name)) {
			purc_bf_accpt_amt(value);
			return;
		}
		if ($gr_purc_amt.equalsIgnoreCase(name)) {
			gr_purc_amt(value);
			return;
		}
		if ($accpt_dfct_amt.equalsIgnoreCase(name)) {
			accpt_dfct_amt(value);
			return;
		}
		if ($gr_prod_amt.equalsIgnoreCase(name)) {
			gr_prod_amt(value);
			return;
		}
		if ($gr_xfr_amt.equalsIgnoreCase(name)) {
			gr_xfr_amt(value);
			return;
		}
		if ($gr_rcv_amt.equalsIgnoreCase(name)) {
			gr_rcv_amt(value);
			return;
		}
		if ($gr_stk_xfr_amt.equalsIgnoreCase(name)) {
			gr_stk_xfr_amt(value);
			return;
		}
		if ($gr_ac_xfr_amt.equalsIgnoreCase(name)) {
			gr_ac_xfr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($gi_input_amt.equalsIgnoreCase(name)) {
			gi_input_amt(value);
			return;
		}
		if ($gi_insp_amt.equalsIgnoreCase(name)) {
			gi_insp_amt(value);
			return;
		}
		if ($gi_xfr_amt.equalsIgnoreCase(name)) {
			gi_xfr_amt(value);
			return;
		}
		if ($rcv_ret_amt.equalsIgnoreCase(name)) {
			rcv_ret_amt(value);
			return;
		}
		if ($gi_stk_xfr_amt.equalsIgnoreCase(name)) {
			gi_stk_xfr_amt(value);
			return;
		}
		if ($gi_ac_xfr_amt.equalsIgnoreCase(name)) {
			gi_ac_xfr_amt(value);
			return;
		}
		if ($stktk_minus_amt.equalsIgnoreCase(name)) {
			stktk_minus_amt(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($purc_bf_accpt_qty.equalsIgnoreCase(name)) {
			purc_bf_accpt_qty(value);
			return;
		}
		if ($gr_purc_qty.equalsIgnoreCase(name)) {
			gr_purc_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($gr_prod_qty.equalsIgnoreCase(name)) {
			gr_prod_qty(value);
			return;
		}
		if ($gr_xfr_qty.equalsIgnoreCase(name)) {
			gr_xfr_qty(value);
			return;
		}
		if ($gr_rcv_qty.equalsIgnoreCase(name)) {
			gr_rcv_qty(value);
			return;
		}
		if ($gr_stk_xfr_qty.equalsIgnoreCase(name)) {
			gr_stk_xfr_qty(value);
			return;
		}
		if ($gr_ac_xfr_qty.equalsIgnoreCase(name)) {
			gr_ac_xfr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($gi_input_qty.equalsIgnoreCase(name)) {
			gi_input_qty(value);
			return;
		}
		if ($gi_insp_qty.equalsIgnoreCase(name)) {
			gi_insp_qty(value);
			return;
		}
		if ($gi_xfr_qty.equalsIgnoreCase(name)) {
			gi_xfr_qty(value);
			return;
		}
		if ($rcv_ret_qty.equalsIgnoreCase(name)) {
			rcv_ret_qty(value);
			return;
		}
		if ($gi_stk_xfr_qty.equalsIgnoreCase(name)) {
			gi_stk_xfr_qty(value);
			return;
		}
		if ($gi_ac_xfr_qty.equalsIgnoreCase(name)) {
			gi_ac_xfr_qty(value);
			return;
		}
		if ($stktk_minus_qty.equalsIgnoreCase(name)) {
			stktk_minus_qty(value);
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
		if ($purc_bf_accpt_amt.equalsIgnoreCase(name)) {
			purc_bf_accpt_amt(value);
			return;
		}
		if ($gr_purc_amt.equalsIgnoreCase(name)) {
			gr_purc_amt(value);
			return;
		}
		if ($accpt_dfct_amt.equalsIgnoreCase(name)) {
			accpt_dfct_amt(value);
			return;
		}
		if ($gr_prod_amt.equalsIgnoreCase(name)) {
			gr_prod_amt(value);
			return;
		}
		if ($gr_xfr_amt.equalsIgnoreCase(name)) {
			gr_xfr_amt(value);
			return;
		}
		if ($gr_rcv_amt.equalsIgnoreCase(name)) {
			gr_rcv_amt(value);
			return;
		}
		if ($gr_stk_xfr_amt.equalsIgnoreCase(name)) {
			gr_stk_xfr_amt(value);
			return;
		}
		if ($gr_ac_xfr_amt.equalsIgnoreCase(name)) {
			gr_ac_xfr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($gi_input_amt.equalsIgnoreCase(name)) {
			gi_input_amt(value);
			return;
		}
		if ($gi_insp_amt.equalsIgnoreCase(name)) {
			gi_insp_amt(value);
			return;
		}
		if ($gi_xfr_amt.equalsIgnoreCase(name)) {
			gi_xfr_amt(value);
			return;
		}
		if ($rcv_ret_amt.equalsIgnoreCase(name)) {
			rcv_ret_amt(value);
			return;
		}
		if ($gi_stk_xfr_amt.equalsIgnoreCase(name)) {
			gi_stk_xfr_amt(value);
			return;
		}
		if ($gi_ac_xfr_amt.equalsIgnoreCase(name)) {
			gi_ac_xfr_amt(value);
			return;
		}
		if ($stktk_minus_amt.equalsIgnoreCase(name)) {
			stktk_minus_amt(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($purc_bf_accpt_qty.equalsIgnoreCase(name)) {
			purc_bf_accpt_qty(value);
			return;
		}
		if ($gr_purc_qty.equalsIgnoreCase(name)) {
			gr_purc_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($gr_prod_qty.equalsIgnoreCase(name)) {
			gr_prod_qty(value);
			return;
		}
		if ($gr_xfr_qty.equalsIgnoreCase(name)) {
			gr_xfr_qty(value);
			return;
		}
		if ($gr_rcv_qty.equalsIgnoreCase(name)) {
			gr_rcv_qty(value);
			return;
		}
		if ($gr_stk_xfr_qty.equalsIgnoreCase(name)) {
			gr_stk_xfr_qty(value);
			return;
		}
		if ($gr_ac_xfr_qty.equalsIgnoreCase(name)) {
			gr_ac_xfr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($gi_input_qty.equalsIgnoreCase(name)) {
			gi_input_qty(value);
			return;
		}
		if ($gi_insp_qty.equalsIgnoreCase(name)) {
			gi_insp_qty(value);
			return;
		}
		if ($gi_xfr_qty.equalsIgnoreCase(name)) {
			gi_xfr_qty(value);
			return;
		}
		if ($rcv_ret_qty.equalsIgnoreCase(name)) {
			rcv_ret_qty(value);
			return;
		}
		if ($gi_stk_xfr_qty.equalsIgnoreCase(name)) {
			gi_stk_xfr_qty(value);
			return;
		}
		if ($gi_ac_xfr_qty.equalsIgnoreCase(name)) {
			gi_ac_xfr_qty(value);
			return;
		}
		if ($stktk_minus_qty.equalsIgnoreCase(name)) {
			stktk_minus_qty(value);
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
		if ($purc_bf_accpt_amt.equalsIgnoreCase(name)) {
			purc_bf_accpt_amt(value);
			return;
		}
		if ($gr_purc_amt.equalsIgnoreCase(name)) {
			gr_purc_amt(value);
			return;
		}
		if ($accpt_dfct_amt.equalsIgnoreCase(name)) {
			accpt_dfct_amt(value);
			return;
		}
		if ($gr_prod_amt.equalsIgnoreCase(name)) {
			gr_prod_amt(value);
			return;
		}
		if ($gr_xfr_amt.equalsIgnoreCase(name)) {
			gr_xfr_amt(value);
			return;
		}
		if ($gr_rcv_amt.equalsIgnoreCase(name)) {
			gr_rcv_amt(value);
			return;
		}
		if ($gr_stk_xfr_amt.equalsIgnoreCase(name)) {
			gr_stk_xfr_amt(value);
			return;
		}
		if ($gr_ac_xfr_amt.equalsIgnoreCase(name)) {
			gr_ac_xfr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($gi_input_amt.equalsIgnoreCase(name)) {
			gi_input_amt(value);
			return;
		}
		if ($gi_insp_amt.equalsIgnoreCase(name)) {
			gi_insp_amt(value);
			return;
		}
		if ($gi_xfr_amt.equalsIgnoreCase(name)) {
			gi_xfr_amt(value);
			return;
		}
		if ($rcv_ret_amt.equalsIgnoreCase(name)) {
			rcv_ret_amt(value);
			return;
		}
		if ($gi_stk_xfr_amt.equalsIgnoreCase(name)) {
			gi_stk_xfr_amt(value);
			return;
		}
		if ($gi_ac_xfr_amt.equalsIgnoreCase(name)) {
			gi_ac_xfr_amt(value);
			return;
		}
		if ($stktk_minus_amt.equalsIgnoreCase(name)) {
			stktk_minus_amt(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($purc_bf_accpt_qty.equalsIgnoreCase(name)) {
			purc_bf_accpt_qty(value);
			return;
		}
		if ($gr_purc_qty.equalsIgnoreCase(name)) {
			gr_purc_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($gr_prod_qty.equalsIgnoreCase(name)) {
			gr_prod_qty(value);
			return;
		}
		if ($gr_xfr_qty.equalsIgnoreCase(name)) {
			gr_xfr_qty(value);
			return;
		}
		if ($gr_rcv_qty.equalsIgnoreCase(name)) {
			gr_rcv_qty(value);
			return;
		}
		if ($gr_stk_xfr_qty.equalsIgnoreCase(name)) {
			gr_stk_xfr_qty(value);
			return;
		}
		if ($gr_ac_xfr_qty.equalsIgnoreCase(name)) {
			gr_ac_xfr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($gi_input_qty.equalsIgnoreCase(name)) {
			gi_input_qty(value);
			return;
		}
		if ($gi_insp_qty.equalsIgnoreCase(name)) {
			gi_insp_qty(value);
			return;
		}
		if ($gi_xfr_qty.equalsIgnoreCase(name)) {
			gi_xfr_qty(value);
			return;
		}
		if ($rcv_ret_qty.equalsIgnoreCase(name)) {
			rcv_ret_qty(value);
			return;
		}
		if ($gi_stk_xfr_qty.equalsIgnoreCase(name)) {
			gi_stk_xfr_qty(value);
			return;
		}
		if ($gi_ac_xfr_qty.equalsIgnoreCase(name)) {
			gi_ac_xfr_qty(value);
			return;
		}
		if ($stktk_minus_qty.equalsIgnoreCase(name)) {
			stktk_minus_qty(value);
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
		if ($purc_bf_accpt_amt.equalsIgnoreCase(name)) {
			purc_bf_accpt_amt(value);
			return;
		}
		if ($gr_purc_amt.equalsIgnoreCase(name)) {
			gr_purc_amt(value);
			return;
		}
		if ($accpt_dfct_amt.equalsIgnoreCase(name)) {
			accpt_dfct_amt(value);
			return;
		}
		if ($gr_prod_amt.equalsIgnoreCase(name)) {
			gr_prod_amt(value);
			return;
		}
		if ($gr_xfr_amt.equalsIgnoreCase(name)) {
			gr_xfr_amt(value);
			return;
		}
		if ($gr_rcv_amt.equalsIgnoreCase(name)) {
			gr_rcv_amt(value);
			return;
		}
		if ($gr_stk_xfr_amt.equalsIgnoreCase(name)) {
			gr_stk_xfr_amt(value);
			return;
		}
		if ($gr_ac_xfr_amt.equalsIgnoreCase(name)) {
			gr_ac_xfr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($gi_input_amt.equalsIgnoreCase(name)) {
			gi_input_amt(value);
			return;
		}
		if ($gi_insp_amt.equalsIgnoreCase(name)) {
			gi_insp_amt(value);
			return;
		}
		if ($gi_xfr_amt.equalsIgnoreCase(name)) {
			gi_xfr_amt(value);
			return;
		}
		if ($rcv_ret_amt.equalsIgnoreCase(name)) {
			rcv_ret_amt(value);
			return;
		}
		if ($gi_stk_xfr_amt.equalsIgnoreCase(name)) {
			gi_stk_xfr_amt(value);
			return;
		}
		if ($gi_ac_xfr_amt.equalsIgnoreCase(name)) {
			gi_ac_xfr_amt(value);
			return;
		}
		if ($stktk_minus_amt.equalsIgnoreCase(name)) {
			stktk_minus_amt(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($purc_bf_accpt_qty.equalsIgnoreCase(name)) {
			purc_bf_accpt_qty(value);
			return;
		}
		if ($gr_purc_qty.equalsIgnoreCase(name)) {
			gr_purc_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($gr_prod_qty.equalsIgnoreCase(name)) {
			gr_prod_qty(value);
			return;
		}
		if ($gr_xfr_qty.equalsIgnoreCase(name)) {
			gr_xfr_qty(value);
			return;
		}
		if ($gr_rcv_qty.equalsIgnoreCase(name)) {
			gr_rcv_qty(value);
			return;
		}
		if ($gr_stk_xfr_qty.equalsIgnoreCase(name)) {
			gr_stk_xfr_qty(value);
			return;
		}
		if ($gr_ac_xfr_qty.equalsIgnoreCase(name)) {
			gr_ac_xfr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($gi_input_qty.equalsIgnoreCase(name)) {
			gi_input_qty(value);
			return;
		}
		if ($gi_insp_qty.equalsIgnoreCase(name)) {
			gi_insp_qty(value);
			return;
		}
		if ($gi_xfr_qty.equalsIgnoreCase(name)) {
			gi_xfr_qty(value);
			return;
		}
		if ($rcv_ret_qty.equalsIgnoreCase(name)) {
			rcv_ret_qty(value);
			return;
		}
		if ($gi_stk_xfr_qty.equalsIgnoreCase(name)) {
			gi_stk_xfr_qty(value);
			return;
		}
		if ($gi_ac_xfr_qty.equalsIgnoreCase(name)) {
			gi_ac_xfr_qty(value);
			return;
		}
		if ($stktk_minus_qty.equalsIgnoreCase(name)) {
			stktk_minus_qty(value);
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
		if ($purc_bf_accpt_amt.equalsIgnoreCase(name)) {
			purc_bf_accpt_amt(value);
			return;
		}
		if ($gr_purc_amt.equalsIgnoreCase(name)) {
			gr_purc_amt(value);
			return;
		}
		if ($accpt_dfct_amt.equalsIgnoreCase(name)) {
			accpt_dfct_amt(value);
			return;
		}
		if ($gr_prod_amt.equalsIgnoreCase(name)) {
			gr_prod_amt(value);
			return;
		}
		if ($gr_xfr_amt.equalsIgnoreCase(name)) {
			gr_xfr_amt(value);
			return;
		}
		if ($gr_rcv_amt.equalsIgnoreCase(name)) {
			gr_rcv_amt(value);
			return;
		}
		if ($gr_stk_xfr_amt.equalsIgnoreCase(name)) {
			gr_stk_xfr_amt(value);
			return;
		}
		if ($gr_ac_xfr_amt.equalsIgnoreCase(name)) {
			gr_ac_xfr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($gi_input_amt.equalsIgnoreCase(name)) {
			gi_input_amt(value);
			return;
		}
		if ($gi_insp_amt.equalsIgnoreCase(name)) {
			gi_insp_amt(value);
			return;
		}
		if ($gi_xfr_amt.equalsIgnoreCase(name)) {
			gi_xfr_amt(value);
			return;
		}
		if ($rcv_ret_amt.equalsIgnoreCase(name)) {
			rcv_ret_amt(value);
			return;
		}
		if ($gi_stk_xfr_amt.equalsIgnoreCase(name)) {
			gi_stk_xfr_amt(value);
			return;
		}
		if ($gi_ac_xfr_amt.equalsIgnoreCase(name)) {
			gi_ac_xfr_amt(value);
			return;
		}
		if ($stktk_minus_amt.equalsIgnoreCase(name)) {
			stktk_minus_amt(value);
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

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($purc_bf_accpt_qty.equalsIgnoreCase(name)) {
			purc_bf_accpt_qty(value);
			return;
		}
		if ($gr_purc_qty.equalsIgnoreCase(name)) {
			gr_purc_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($gr_prod_qty.equalsIgnoreCase(name)) {
			gr_prod_qty(value);
			return;
		}
		if ($gr_xfr_qty.equalsIgnoreCase(name)) {
			gr_xfr_qty(value);
			return;
		}
		if ($gr_rcv_qty.equalsIgnoreCase(name)) {
			gr_rcv_qty(value);
			return;
		}
		if ($gr_stk_xfr_qty.equalsIgnoreCase(name)) {
			gr_stk_xfr_qty(value);
			return;
		}
		if ($gr_ac_xfr_qty.equalsIgnoreCase(name)) {
			gr_ac_xfr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($gi_input_qty.equalsIgnoreCase(name)) {
			gi_input_qty(value);
			return;
		}
		if ($gi_insp_qty.equalsIgnoreCase(name)) {
			gi_insp_qty(value);
			return;
		}
		if ($gi_xfr_qty.equalsIgnoreCase(name)) {
			gi_xfr_qty(value);
			return;
		}
		if ($rcv_ret_qty.equalsIgnoreCase(name)) {
			rcv_ret_qty(value);
			return;
		}
		if ($gi_stk_xfr_qty.equalsIgnoreCase(name)) {
			gi_stk_xfr_qty(value);
			return;
		}
		if ($gi_ac_xfr_qty.equalsIgnoreCase(name)) {
			gi_ac_xfr_qty(value);
			return;
		}
		if ($stktk_minus_qty.equalsIgnoreCase(name)) {
			stktk_minus_qty(value);
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
		if ($purc_bf_accpt_amt.equalsIgnoreCase(name)) {
			purc_bf_accpt_amt(value);
			return;
		}
		if ($gr_purc_amt.equalsIgnoreCase(name)) {
			gr_purc_amt(value);
			return;
		}
		if ($accpt_dfct_amt.equalsIgnoreCase(name)) {
			accpt_dfct_amt(value);
			return;
		}
		if ($gr_prod_amt.equalsIgnoreCase(name)) {
			gr_prod_amt(value);
			return;
		}
		if ($gr_xfr_amt.equalsIgnoreCase(name)) {
			gr_xfr_amt(value);
			return;
		}
		if ($gr_rcv_amt.equalsIgnoreCase(name)) {
			gr_rcv_amt(value);
			return;
		}
		if ($gr_stk_xfr_amt.equalsIgnoreCase(name)) {
			gr_stk_xfr_amt(value);
			return;
		}
		if ($gr_ac_xfr_amt.equalsIgnoreCase(name)) {
			gr_ac_xfr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($gi_input_amt.equalsIgnoreCase(name)) {
			gi_input_amt(value);
			return;
		}
		if ($gi_insp_amt.equalsIgnoreCase(name)) {
			gi_insp_amt(value);
			return;
		}
		if ($gi_xfr_amt.equalsIgnoreCase(name)) {
			gi_xfr_amt(value);
			return;
		}
		if ($rcv_ret_amt.equalsIgnoreCase(name)) {
			rcv_ret_amt(value);
			return;
		}
		if ($gi_stk_xfr_amt.equalsIgnoreCase(name)) {
			gi_stk_xfr_amt(value);
			return;
		}
		if ($gi_ac_xfr_amt.equalsIgnoreCase(name)) {
			gi_ac_xfr_amt(value);
			return;
		}
		if ($stktk_minus_amt.equalsIgnoreCase(name)) {
			stktk_minus_amt(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($purc_bf_accpt_qty.equalsIgnoreCase(name)) {
			purc_bf_accpt_qty(value);
			return;
		}
		if ($gr_purc_qty.equalsIgnoreCase(name)) {
			gr_purc_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($gr_prod_qty.equalsIgnoreCase(name)) {
			gr_prod_qty(value);
			return;
		}
		if ($gr_xfr_qty.equalsIgnoreCase(name)) {
			gr_xfr_qty(value);
			return;
		}
		if ($gr_rcv_qty.equalsIgnoreCase(name)) {
			gr_rcv_qty(value);
			return;
		}
		if ($gr_stk_xfr_qty.equalsIgnoreCase(name)) {
			gr_stk_xfr_qty(value);
			return;
		}
		if ($gr_ac_xfr_qty.equalsIgnoreCase(name)) {
			gr_ac_xfr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($gi_input_qty.equalsIgnoreCase(name)) {
			gi_input_qty(value);
			return;
		}
		if ($gi_insp_qty.equalsIgnoreCase(name)) {
			gi_insp_qty(value);
			return;
		}
		if ($gi_xfr_qty.equalsIgnoreCase(name)) {
			gi_xfr_qty(value);
			return;
		}
		if ($rcv_ret_qty.equalsIgnoreCase(name)) {
			rcv_ret_qty(value);
			return;
		}
		if ($gi_stk_xfr_qty.equalsIgnoreCase(name)) {
			gi_stk_xfr_qty(value);
			return;
		}
		if ($gi_ac_xfr_qty.equalsIgnoreCase(name)) {
			gi_ac_xfr_qty(value);
			return;
		}
		if ($stktk_minus_qty.equalsIgnoreCase(name)) {
			stktk_minus_qty(value);
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
		if ($purc_bf_accpt_amt.equalsIgnoreCase(name)) {
			purc_bf_accpt_amt(value);
			return;
		}
		if ($gr_purc_amt.equalsIgnoreCase(name)) {
			gr_purc_amt(value);
			return;
		}
		if ($accpt_dfct_amt.equalsIgnoreCase(name)) {
			accpt_dfct_amt(value);
			return;
		}
		if ($gr_prod_amt.equalsIgnoreCase(name)) {
			gr_prod_amt(value);
			return;
		}
		if ($gr_xfr_amt.equalsIgnoreCase(name)) {
			gr_xfr_amt(value);
			return;
		}
		if ($gr_rcv_amt.equalsIgnoreCase(name)) {
			gr_rcv_amt(value);
			return;
		}
		if ($gr_stk_xfr_amt.equalsIgnoreCase(name)) {
			gr_stk_xfr_amt(value);
			return;
		}
		if ($gr_ac_xfr_amt.equalsIgnoreCase(name)) {
			gr_ac_xfr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($gi_input_amt.equalsIgnoreCase(name)) {
			gi_input_amt(value);
			return;
		}
		if ($gi_insp_amt.equalsIgnoreCase(name)) {
			gi_insp_amt(value);
			return;
		}
		if ($gi_xfr_amt.equalsIgnoreCase(name)) {
			gi_xfr_amt(value);
			return;
		}
		if ($rcv_ret_amt.equalsIgnoreCase(name)) {
			rcv_ret_amt(value);
			return;
		}
		if ($gi_stk_xfr_amt.equalsIgnoreCase(name)) {
			gi_stk_xfr_amt(value);
			return;
		}
		if ($gi_ac_xfr_amt.equalsIgnoreCase(name)) {
			gi_ac_xfr_amt(value);
			return;
		}
		if ($stktk_minus_amt.equalsIgnoreCase(name)) {
			stktk_minus_amt(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($purc_bf_accpt_qty.equalsIgnoreCase(name)) {
			purc_bf_accpt_qty(value);
			return;
		}
		if ($gr_purc_qty.equalsIgnoreCase(name)) {
			gr_purc_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($gr_prod_qty.equalsIgnoreCase(name)) {
			gr_prod_qty(value);
			return;
		}
		if ($gr_xfr_qty.equalsIgnoreCase(name)) {
			gr_xfr_qty(value);
			return;
		}
		if ($gr_rcv_qty.equalsIgnoreCase(name)) {
			gr_rcv_qty(value);
			return;
		}
		if ($gr_stk_xfr_qty.equalsIgnoreCase(name)) {
			gr_stk_xfr_qty(value);
			return;
		}
		if ($gr_ac_xfr_qty.equalsIgnoreCase(name)) {
			gr_ac_xfr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($gi_input_qty.equalsIgnoreCase(name)) {
			gi_input_qty(value);
			return;
		}
		if ($gi_insp_qty.equalsIgnoreCase(name)) {
			gi_insp_qty(value);
			return;
		}
		if ($gi_xfr_qty.equalsIgnoreCase(name)) {
			gi_xfr_qty(value);
			return;
		}
		if ($rcv_ret_qty.equalsIgnoreCase(name)) {
			rcv_ret_qty(value);
			return;
		}
		if ($gi_stk_xfr_qty.equalsIgnoreCase(name)) {
			gi_stk_xfr_qty(value);
			return;
		}
		if ($gi_ac_xfr_qty.equalsIgnoreCase(name)) {
			gi_ac_xfr_qty(value);
			return;
		}
		if ($stktk_minus_qty.equalsIgnoreCase(name)) {
			stktk_minus_qty(value);
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
		if ($purc_bf_accpt_amt.equalsIgnoreCase(name)) {
			purc_bf_accpt_amt(value);
			return;
		}
		if ($gr_purc_amt.equalsIgnoreCase(name)) {
			gr_purc_amt(value);
			return;
		}
		if ($accpt_dfct_amt.equalsIgnoreCase(name)) {
			accpt_dfct_amt(value);
			return;
		}
		if ($gr_prod_amt.equalsIgnoreCase(name)) {
			gr_prod_amt(value);
			return;
		}
		if ($gr_xfr_amt.equalsIgnoreCase(name)) {
			gr_xfr_amt(value);
			return;
		}
		if ($gr_rcv_amt.equalsIgnoreCase(name)) {
			gr_rcv_amt(value);
			return;
		}
		if ($gr_stk_xfr_amt.equalsIgnoreCase(name)) {
			gr_stk_xfr_amt(value);
			return;
		}
		if ($gr_ac_xfr_amt.equalsIgnoreCase(name)) {
			gr_ac_xfr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($gi_input_amt.equalsIgnoreCase(name)) {
			gi_input_amt(value);
			return;
		}
		if ($gi_insp_amt.equalsIgnoreCase(name)) {
			gi_insp_amt(value);
			return;
		}
		if ($gi_xfr_amt.equalsIgnoreCase(name)) {
			gi_xfr_amt(value);
			return;
		}
		if ($rcv_ret_amt.equalsIgnoreCase(name)) {
			rcv_ret_amt(value);
			return;
		}
		if ($gi_stk_xfr_amt.equalsIgnoreCase(name)) {
			gi_stk_xfr_amt(value);
			return;
		}
		if ($gi_ac_xfr_amt.equalsIgnoreCase(name)) {
			gi_ac_xfr_amt(value);
			return;
		}
		if ($stktk_minus_amt.equalsIgnoreCase(name)) {
			stktk_minus_amt(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($purc_bf_accpt_qty.equalsIgnoreCase(name)) {
			purc_bf_accpt_qty(value);
			return;
		}
		if ($gr_purc_qty.equalsIgnoreCase(name)) {
			gr_purc_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($gr_prod_qty.equalsIgnoreCase(name)) {
			gr_prod_qty(value);
			return;
		}
		if ($gr_xfr_qty.equalsIgnoreCase(name)) {
			gr_xfr_qty(value);
			return;
		}
		if ($gr_rcv_qty.equalsIgnoreCase(name)) {
			gr_rcv_qty(value);
			return;
		}
		if ($gr_stk_xfr_qty.equalsIgnoreCase(name)) {
			gr_stk_xfr_qty(value);
			return;
		}
		if ($gr_ac_xfr_qty.equalsIgnoreCase(name)) {
			gr_ac_xfr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($gi_input_qty.equalsIgnoreCase(name)) {
			gi_input_qty(value);
			return;
		}
		if ($gi_insp_qty.equalsIgnoreCase(name)) {
			gi_insp_qty(value);
			return;
		}
		if ($gi_xfr_qty.equalsIgnoreCase(name)) {
			gi_xfr_qty(value);
			return;
		}
		if ($rcv_ret_qty.equalsIgnoreCase(name)) {
			rcv_ret_qty(value);
			return;
		}
		if ($gi_stk_xfr_qty.equalsIgnoreCase(name)) {
			gi_stk_xfr_qty(value);
			return;
		}
		if ($gi_ac_xfr_qty.equalsIgnoreCase(name)) {
			gi_ac_xfr_qty(value);
			return;
		}
		if ($stktk_minus_qty.equalsIgnoreCase(name)) {
			stktk_minus_qty(value);
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
		if ($purc_bf_accpt_amt.equalsIgnoreCase(name)) {
			purc_bf_accpt_amt(value);
			return;
		}
		if ($gr_purc_amt.equalsIgnoreCase(name)) {
			gr_purc_amt(value);
			return;
		}
		if ($accpt_dfct_amt.equalsIgnoreCase(name)) {
			accpt_dfct_amt(value);
			return;
		}
		if ($gr_prod_amt.equalsIgnoreCase(name)) {
			gr_prod_amt(value);
			return;
		}
		if ($gr_xfr_amt.equalsIgnoreCase(name)) {
			gr_xfr_amt(value);
			return;
		}
		if ($gr_rcv_amt.equalsIgnoreCase(name)) {
			gr_rcv_amt(value);
			return;
		}
		if ($gr_stk_xfr_amt.equalsIgnoreCase(name)) {
			gr_stk_xfr_amt(value);
			return;
		}
		if ($gr_ac_xfr_amt.equalsIgnoreCase(name)) {
			gr_ac_xfr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($gi_input_amt.equalsIgnoreCase(name)) {
			gi_input_amt(value);
			return;
		}
		if ($gi_insp_amt.equalsIgnoreCase(name)) {
			gi_insp_amt(value);
			return;
		}
		if ($gi_xfr_amt.equalsIgnoreCase(name)) {
			gi_xfr_amt(value);
			return;
		}
		if ($rcv_ret_amt.equalsIgnoreCase(name)) {
			rcv_ret_amt(value);
			return;
		}
		if ($gi_stk_xfr_amt.equalsIgnoreCase(name)) {
			gi_stk_xfr_amt(value);
			return;
		}
		if ($gi_ac_xfr_amt.equalsIgnoreCase(name)) {
			gi_ac_xfr_amt(value);
			return;
		}
		if ($stktk_minus_amt.equalsIgnoreCase(name)) {
			stktk_minus_amt(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($purc_bf_accpt_qty.equalsIgnoreCase(name)) {
			purc_bf_accpt_qty(value);
			return;
		}
		if ($gr_purc_qty.equalsIgnoreCase(name)) {
			gr_purc_qty(value);
			return;
		}
		if ($accpt_dfct_qty.equalsIgnoreCase(name)) {
			accpt_dfct_qty(value);
			return;
		}
		if ($gr_prod_qty.equalsIgnoreCase(name)) {
			gr_prod_qty(value);
			return;
		}
		if ($gr_xfr_qty.equalsIgnoreCase(name)) {
			gr_xfr_qty(value);
			return;
		}
		if ($gr_rcv_qty.equalsIgnoreCase(name)) {
			gr_rcv_qty(value);
			return;
		}
		if ($gr_stk_xfr_qty.equalsIgnoreCase(name)) {
			gr_stk_xfr_qty(value);
			return;
		}
		if ($gr_ac_xfr_qty.equalsIgnoreCase(name)) {
			gr_ac_xfr_qty(value);
			return;
		}
		if ($gi_total_qty.equalsIgnoreCase(name)) {
			gi_total_qty(value);
			return;
		}
		if ($gi_input_qty.equalsIgnoreCase(name)) {
			gi_input_qty(value);
			return;
		}
		if ($gi_insp_qty.equalsIgnoreCase(name)) {
			gi_insp_qty(value);
			return;
		}
		if ($gi_xfr_qty.equalsIgnoreCase(name)) {
			gi_xfr_qty(value);
			return;
		}
		if ($rcv_ret_qty.equalsIgnoreCase(name)) {
			rcv_ret_qty(value);
			return;
		}
		if ($gi_stk_xfr_qty.equalsIgnoreCase(name)) {
			gi_stk_xfr_qty(value);
			return;
		}
		if ($gi_ac_xfr_qty.equalsIgnoreCase(name)) {
			gi_ac_xfr_qty(value);
			return;
		}
		if ($stktk_minus_qty.equalsIgnoreCase(name)) {
			stktk_minus_qty(value);
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
		if ($purc_bf_accpt_amt.equalsIgnoreCase(name)) {
			purc_bf_accpt_amt(value);
			return;
		}
		if ($gr_purc_amt.equalsIgnoreCase(name)) {
			gr_purc_amt(value);
			return;
		}
		if ($accpt_dfct_amt.equalsIgnoreCase(name)) {
			accpt_dfct_amt(value);
			return;
		}
		if ($gr_prod_amt.equalsIgnoreCase(name)) {
			gr_prod_amt(value);
			return;
		}
		if ($gr_xfr_amt.equalsIgnoreCase(name)) {
			gr_xfr_amt(value);
			return;
		}
		if ($gr_rcv_amt.equalsIgnoreCase(name)) {
			gr_rcv_amt(value);
			return;
		}
		if ($gr_stk_xfr_amt.equalsIgnoreCase(name)) {
			gr_stk_xfr_amt(value);
			return;
		}
		if ($gr_ac_xfr_amt.equalsIgnoreCase(name)) {
			gr_ac_xfr_amt(value);
			return;
		}
		if ($gi_total_amt.equalsIgnoreCase(name)) {
			gi_total_amt(value);
			return;
		}
		if ($gi_input_amt.equalsIgnoreCase(name)) {
			gi_input_amt(value);
			return;
		}
		if ($gi_insp_amt.equalsIgnoreCase(name)) {
			gi_insp_amt(value);
			return;
		}
		if ($gi_xfr_amt.equalsIgnoreCase(name)) {
			gi_xfr_amt(value);
			return;
		}
		if ($rcv_ret_amt.equalsIgnoreCase(name)) {
			rcv_ret_amt(value);
			return;
		}
		if ($gi_stk_xfr_amt.equalsIgnoreCase(name)) {
			gi_stk_xfr_amt(value);
			return;
		}
		if ($gi_ac_xfr_amt.equalsIgnoreCase(name)) {
			gi_ac_xfr_amt(value);
			return;
		}
		if ($stktk_minus_amt.equalsIgnoreCase(name)) {
			stktk_minus_amt(value);
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



}

