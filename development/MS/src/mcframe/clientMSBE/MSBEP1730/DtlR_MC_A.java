package mcframe.clientMSBE.MSBEP1730;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $iv_mng_no = "iv_mng_no";
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
	 * Aggregation flg. まとめＦＬＧ.<p>
	 *
	 */
	public static final String $bndl_flg = "bndl_flg";
	public static final String $itm_p = "itm_p";
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public static final String $asset_mng_typ_nm = "asset_mng_typ_nm";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public static final String $exim_xpns_typ = "exim_xpns_typ";
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public static final String $cntry_org_nm = "cntry_org_nm";
	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	public static final String $trd_unit_qty_p = "trd_unit_qty_p";
	/**
	 * Unit price qty. 単価数量.<p>
	 *
	 */
	public static final String $upri_qty = "upri_qty";
	/**
	 * Maximum standard unit qty. that can be entered 登録可能な最大基準単位数量.<p>
	 *
	 */
	public static final String $max_base_unit_qty = "max_base_unit_qty";
	/**
	 * Maximum transaction unit qty. that can be entered (message display only) 登録可能な最大取引単位数量（メッセージ表示のみ）.<p>
	 *
	 */
	public static final String $max_trd_unit_qty = "max_trd_unit_qty";
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
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	public static final String $base_unit_qty_p = "base_unit_qty_p";
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
	public static final String $trd_cur_upri_amt_p = "trd_cur_upri_amt_p";
	public static final String $old_trd_cur_upri_p = "old_trd_cur_upri_p";
	/**
	 * Initial discount amount (For discount calculation) (Transaction currency) 当初取引通貨値引額（値引額計算用）.<p>
	 *
	 */
	public static final String $schd_trd_cur_dscnt_amt = "schd_trd_cur_dscnt_amt";
	/**
	 * Initial base unit qty. (For discount calculation) 当初基準単位数量（値引額計算用）.<p>
	 *
	 */
	public static final String $schd_base_unit_qty = "schd_base_unit_qty";
	public static final String $iv_upri_p = "iv_upri_p";
	public static final String $iv_amt_p = "iv_amt_p";
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	public static final String $sno_wrk_p = "sno_wrk_p";
	/**
	 * Multiple shipping distribution group flg. 複数出荷物流グループＦＬＧ.<p>
	 *
	 */
	public static final String $multi_ship_fr_lg_grp_flg = "multi_ship_fr_lg_grp_flg";
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_nm = "ship_fr_lg_grp_nm";
	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public static final String $rsn_nm = "rsn_nm";
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public static final String $sls_acxfr_flg = "sls_acxfr_flg";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * Sales dept. WG 売上部門のワーキンググループ.<p>
	 *
	 */
	public static final String $sls_dpt_wg_cd = "sls_dpt_wg_cd";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
	/**
	 * Invoice details remarks インボイス明細備考.<p>
	 *
	 */
	public static final String $iv_d_rmrks = "iv_d_rmrks";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $dtl_sub_char1 = "dtl_sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $dtl_sub_char2 = "dtl_sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $dtl_sub_char3 = "dtl_sub_char3";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public static final String $ship_rqst_no = "ship_rqst_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public static final String $xfr_schd_no = "xfr_schd_no";
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_d_no = "ship_inst_d_no";
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_no = "ship_act_no";
	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_d_no = "ship_act_d_no";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public static final String $ship_alloc_sts_no = "ship_alloc_sts_no";
	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public static final String $uplnd_flg = "uplnd_flg";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public static final String $sls_upri_cng_flg = "sls_upri_cng_flg";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	public static final String $dlv_rqst_dt_p = "dlv_rqst_dt_p";
	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public static final String $iv_d_no = "iv_d_no";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public static final String $ptax_cur_amt = "ptax_cur_amt";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public static final String $pr_sts_typ = "pr_sts_typ";
	/**
	 * Manual addition flg. マニュアル追加ＦＬＧ.<p>
	 *
	 */
	public static final String $manual_add_flg = "manual_add_flg";
	/**
	 * Existing data flg. 既存データＦＬＧ.<p>
	 *
	 */
	public static final String $existed_flg = "existed_flg";
	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_ddlv_flg = "purc_ddlv_flg";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public static final String $ship_inst_typ = "ship_inst_typ";
	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public static final String $ship_inst_qty = "ship_inst_qty";
	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public static final String $ship_act_qty = "ship_act_qty";
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public static final String $ship_pr_upd_cntr = "ship_pr_upd_cntr";
	/**
	 * Index for initially searched details data 初期検索した明細データのindex.<p>
	 *
	 */
	public static final String $index = "index";
	/**
	 * Select additional details in bulk 明細追加選択まとめ.<p>
	 *
	 */
	public static final String $iv_d_sel_bndl_flg = "iv_d_sel_bndl_flg";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $upri_not_tgt_flg = $trd_cur_upri_amt_p + ".upri_not_tgt_flg";
	public static final String $trd_cur_upri = $trd_cur_upri_amt_p + ".trd_cur_upri";
	public static final String $interim_flg = $trd_cur_upri_amt_p + ".interim_flg";
	public static final String $trd_cur_amt = $trd_cur_upri_amt_p + ".trd_cur_amt";
	public static final String $trd_cur_inc_tax_amt = $trd_cur_upri_amt_p + ".trd_cur_inc_tax_amt";
	public static final String $tax_fix_flg = $trd_cur_upri_amt_p + ".tax_fix_flg";
	public static final String $tax_cd = $trd_cur_upri_amt_p + ".tax_cd";
	public static final String $tax_nm = $trd_cur_upri_amt_p + ".tax_nm";
	public static final String $tax_rate = $trd_cur_upri_amt_p + ".tax_rate";
	public static final String $tax_typ = $trd_cur_upri_amt_p + ".tax_typ";
	public static final String $inc_tax_flg = $trd_cur_upri_amt_p + ".inc_tax_flg";
	public static final String $trd_cur_tax_amt = $trd_cur_upri_amt_p + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $trd_cur_upri_amt_p + ".trd_cur_dscnt_amt";
	public static final String $dscnt_rsn_cd = $trd_cur_upri_amt_p + ".dscnt_rsn_cd";
	public static final String $dscnt_rsn_nm = $trd_cur_upri_amt_p + ".dscnt_rsn_nm";
	public static final String $old_trd_cur_upri = $old_trd_cur_upri_p + ".upri";
	public static final String $iv_upri = $iv_upri_p + ".upri";
	public static final String $iv_amt = $iv_amt_p + ".amt";
	public static final String $sno1 = $sno_wrk_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_p + ".wrk_nm";
	public static final String $sls_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $sls_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $sls_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $sls_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $dlv_rqst_dt = $dlv_rqst_dt_p + ".ymd";
	public static final String $dlv_rqst_hm = $dlv_rqst_dt_p + ".hm";

	public static final MCMeta iv_mng_no_META = createCommonMeta($iv_mng_no, mcframe.commonMA.meta.MA_META.IV_MNG_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta bndl_flg_META = createCommonMeta($bndl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta exim_xpns_typ_META = createCommonMeta($exim_xpns_typ, mcframe.commonMA.meta.MA_META.EXIM_XPNS_TYP);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_org_nm_META = createCommonMeta($cntry_org_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_qty_p_META = createInnerRowMeta($trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta upri_qty_META = createCommonMeta($upri_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta max_base_unit_qty_META = createCommonMeta($max_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta max_trd_unit_qty_META = createCommonMeta($max_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta trd_cur_upri_amt_p_META = createInnerRowMeta($trd_cur_upri_amt_p, mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class);
	public static final MCMeta old_trd_cur_upri_p_META = createInnerRowMeta($old_trd_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta schd_trd_cur_dscnt_amt_META = createCommonMeta($schd_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_base_unit_qty_META = createCommonMeta($schd_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta iv_upri_p_META = createInnerRowMeta($iv_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta iv_amt_p_META = createInnerRowMeta($iv_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta sno_wrk_p_META = createInnerRowMeta($sno_wrk_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta multi_ship_fr_lg_grp_flg_META = createCommonMeta($multi_ship_fr_lg_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_fr_lg_grp_nm_META = createCommonMeta($ship_fr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta sls_acxfr_flg_META = createCommonMeta($sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta sls_dpt_wg_cd_META = createCommonMeta($sls_dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta iv_d_rmrks_META = createCommonMeta($iv_d_rmrks, mcframe.commonMS.meta.MS_META.IV_D_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.IV_D_INTR_D_RMRKS);
	public static final MCMeta dtl_sub_char1_META = createCommonMeta($dtl_sub_char1, mcframe.commonMS.meta.MS_META.IV_D_SUB_CHAR1);
	public static final MCMeta dtl_sub_char2_META = createCommonMeta($dtl_sub_char2, mcframe.commonMS.meta.MS_META.IV_D_SUB_CHAR2);
	public static final MCMeta dtl_sub_char3_META = createCommonMeta($dtl_sub_char3, mcframe.commonMS.meta.MS_META.IV_D_SUB_CHAR3);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta ship_rqst_no_META = createCommonMeta($ship_rqst_no, mcframe.commonMA.meta.MA_META.SHIP_RQST_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta ship_inst_d_no_META = createCommonMeta($ship_inst_d_no, mcframe.commonMA.meta.MA_META.SHIP_INST_D_NO);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta ship_act_d_no_META = createCommonMeta($ship_act_d_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_D_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ship_alloc_sts_no_META = createCommonMeta($ship_alloc_sts_no, mcframe.commonMA.meta.MA_META.SHIP_ALLOC_STS_NO);
	public static final MCMeta uplnd_flg_META = createCommonMeta($uplnd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sls_upri_cng_flg_META = createCommonMeta($sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta dlv_rqst_dt_p_META = createInnerRowMeta($dlv_rqst_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta iv_d_no_META = createCommonMeta($iv_d_no, mcframe.commonMA.meta.MA_META.IV_D_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta ptax_cur_amt_META = createCommonMeta($ptax_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta manual_add_flg_META = createCommonMeta($manual_add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta existed_flg_META = createCommonMeta($existed_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ddlv_flg_META = createCommonMeta($purc_ddlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta ship_inst_qty_META = createCommonMeta($ship_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_act_qty_META = createCommonMeta($ship_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_pr_upd_cntr_META = createCommonMeta($ship_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta index_META = createCommonMeta($index, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta iv_d_sel_bndl_flg_META = createCommonMeta($iv_d_sel_bndl_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			iv_mng_no_META,
			trd_cd_META,
			trd_nm_META,
			bndl_flg_META,
			itm_p_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			iv_itm_nm_META,
			stk_mng_typ_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			sundry_itm_flg_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			exim_xpns_typ_META,
			cntry_org_cd_META,
			cntry_org_nm_META,
			dscnt_itm_flg_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_qty_p_META,
			upri_qty_META,
			max_base_unit_qty_META,
			max_trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_p_META,
			gd_cd_META,
			gd_nm_META,
			trd_cur_upri_amt_p_META,
			old_trd_cur_upri_p_META,
			schd_trd_cur_dscnt_amt_META,
			schd_base_unit_qty_META,
			iv_upri_p_META,
			iv_amt_p_META,
			cst_po_no_META,
			cst_po_d_no_META,
			sno_wrk_p_META,
			multi_ship_fr_lg_grp_flg_META,
			ship_fr_lg_grp_cd_META,
			ship_fr_lg_grp_nm_META,
			rsn_cd_META,
			rsn_nm_META,
			sls_acxfr_flg_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			usr_dpt_p_META,
			sls_dpt_wg_cd_META,
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			iv_d_rmrks_META,
			trd_rmrks_META,
			trd_d_rmrks_META,
			intr_d_rmrks_META,
			dtl_sub_char1_META,
			dtl_sub_char2_META,
			dtl_sub_char3_META,
			slo_no_META,
			ship_rqst_no_META,
			slo_d_no_META,
			xfr_schd_no_META,
			ship_inst_no_META,
			ship_inst_d_no_META,
			ship_act_no_META,
			ship_act_d_no_META,
			dlv_slip_d_no_META,
			ship_alloc_sts_no_META,
			uplnd_flg_META,
			dest_cd1_META,
			dest_cd2_META,
			dest_cd3_META,
			sls_upri_cng_flg_META,
			purc_schd_no_META,
			purc_act_d_no_META,
			dlv_rqst_dt_p_META,
			iv_d_no_META,
			disp_seq_META,
			ptax_cur_amt_META,
			wtax_rate_META,
			wtax_amt_META,
			ship_schd_no_META,
			pr_sts_typ_META,
			manual_add_flg_META,
			existed_flg_META,
			purc_ddlv_flg_META,
			ship_pr_no_META,
			ship_inst_typ_META,
			ship_inst_qty_META,
			ship_act_qty_META,
			ship_pr_upd_cntr_META,
			index_META,
			iv_d_sel_bndl_flg_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"trd_unit_qty",
				"base_unit_qty",
				"upri_not_tgt_flg",
				"trd_cur_upri",
				"interim_flg",
				"trd_cur_amt",
				"trd_cur_inc_tax_amt",
				"tax_fix_flg",
				"tax_cd",
				"tax_nm",
				"tax_rate",
				"tax_typ",
				"inc_tax_flg",
				"trd_cur_tax_amt",
				"trd_cur_dscnt_amt",
				"dscnt_rsn_cd",
				"dscnt_rsn_nm",
				"old_trd_cur_upri",
				"iv_upri",
				"iv_amt",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"sls_usr_cd",
				"sls_usr_nm",
				"sls_dpt_cd",
				"sls_dpt_nm",
				"dlv_rqst_dt",
				"dlv_rqst_hm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$trd_unit_qty,
				$base_unit_qty,
				$upri_not_tgt_flg,
				$trd_cur_upri,
				$interim_flg,
				$trd_cur_amt,
				$trd_cur_inc_tax_amt,
				$tax_fix_flg,
				$tax_cd,
				$tax_nm,
				$tax_rate,
				$tax_typ,
				$inc_tax_flg,
				$trd_cur_tax_amt,
				$trd_cur_dscnt_amt,
				$dscnt_rsn_cd,
				$dscnt_rsn_nm,
				$old_trd_cur_upri,
				$iv_upri,
				$iv_amt,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$sls_usr_cd,
				$sls_usr_nm,
				$sls_dpt_cd,
				$sls_dpt_nm,
				$dlv_rqst_dt,
				$dlv_rqst_hm
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;unit_cd;unit_nm;dec_place;rnd_typ;exim_xpns_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sundry_itm_flg;dscnt_itm_flg;stk_mng_typ;asset_mng_typ;asset_mng_typ_nm;ship_unit_cd;sls_upri_cng_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_sub2;itm_sub3;itm_nm;unit_cd;unit_nm;dec_place;rnd_typ;exim_xpns_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sundry_itm_flg;dscnt_itm_flg;stk_mng_typ;asset_mng_typ;asset_mng_typ_nm;ship_unit_cd;sls_upri_cng_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_sub3;itm_nm;unit_cd;unit_nm;dec_place;rnd_typ;exim_xpns_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sundry_itm_flg;dscnt_itm_flg;stk_mng_typ;asset_mng_typ;asset_mng_typ_nm;ship_unit_cd;sls_upri_cng_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_nm;unit_cd;unit_nm;dec_place;rnd_typ;exim_xpns_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sundry_itm_flg;dscnt_itm_flg;stk_mng_typ;asset_mng_typ;asset_mng_typ_nm;ship_unit_cd;sls_upri_cng_flg"},	// itm_p.itm_sub3
				{$cntry_org_cd, "cntry_nm"},	// cntry_org_cd
				{$trd_unit_cd, "unit_nm;conv_base_qty;conv_qty;dec_place;rnd_typ"},	// trd_unit_cd
				{$trd_cur_upri_amt_p + ".dscnt_rsn_cd", "biz_rsn_nm"},	// trd_cur_upri_amt_p.dscnt_rsn_cd
				{$rsn_cd, "biz_rsn_nm;sls_acxfr_flg"},	// rsn_cd
				{$bd_dpt_cd, "dpt_nm"},	// bd_dpt_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_nm;wg_cd"},	// usr_dpt_p.dpt_cd
				{$ar_dpt_cd, "dpt_nm"}	// ar_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK2"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK2;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK2;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK2;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$bd_dpt_cd, "true;MAC_DPT_IS_SRCH_TYP.BD"},	// bd_dpt_cd
				{$usr_dpt_p + ".dpt_cd", "sls_usr_cd;MAC_DPT_IS_SRCH_TYP.SLS;true"},	// usr_dpt_p.dpt_cd
				{$ar_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AR"}	// ar_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$bd_dpt_cd, "bd_dpt_flg;dpt_is_srch_typ"},	// bd_dpt_cd
				{$usr_dpt_p + ".dpt_cd", "usr_cd;dpt_is_srch_typ;wr_wg_flg"},	// usr_dpt_p.dpt_cd
				{$ar_dpt_cd, "dpt_is_srch_typ"}	// ar_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$max_base_unit_qty, "BASE_UNIT"},	// max_base_unit_qty
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$schd_base_unit_qty, "BASE_UNIT"},	// schd_base_unit_qty
				{$multi_ship_fr_lg_grp_flg, "LG_GRP"},	// multi_ship_fr_lg_grp_flg
				{$ship_fr_lg_grp_cd, "LG_GRP"},	// ship_fr_lg_grp_cd
				{$ship_fr_lg_grp_nm, "LG_GRP"},	// ship_fr_lg_grp_nm
				{$ptax_cur_amt, "PTAX"},	// ptax_cur_amt
				{$wtax_rate, "WTAX"},	// wtax_rate
				{$wtax_amt, "WTAX"}	// wtax_amt
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public String iv_mng_no() {
		return getConstString(offset + 0, $iv_mng_no);
	}

	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public void iv_mng_no(String value) {
		setConstString(offset + 0, $iv_mng_no, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 1, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 1, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 2, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 2, $trd_nm, value);
	}


	/**
	 * Aggregation flg. まとめＦＬＧ.<p>
	 *
	 */
	public boolean bndl_flg() {
		return getConstBoolean(offset + 3, $bndl_flg);
	}

	/**
	 * Aggregation flg. まとめＦＬＧ.<p>
	 *
	 */
	public void bndl_flg(boolean value) {
		setConstBoolean(offset + 3, $bndl_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 4, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 4, $itm_p, row);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 5, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 5, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 6, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 6, $cst_itm_nm, value);
	}


	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 7, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 7, $iv_itm_nm, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 8, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 8, $stk_mng_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 9, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 9, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 10, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 10, $asset_mng_typ_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 11, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 11, $sundry_itm_flg, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 12, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 12, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 13, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 13, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 14, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 14, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 15, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 15, $sno4_mng_typ, value);
	}


	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public String exim_xpns_typ() {
		return getConstString(offset + 16, $exim_xpns_typ);
	}

	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public void exim_xpns_typ(String value) {
		setConstString(offset + 16, $exim_xpns_typ, value);
	}


	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 17, $cntry_org_cd);
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 17, $cntry_org_cd, value);
	}


	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public String cntry_org_nm() {
		return getConstString(offset + 18, $cntry_org_nm);
	}

	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public void cntry_org_nm(String value) {
		setConstString(offset + 18, $cntry_org_nm, value);
	}


	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 19, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 19, $dscnt_itm_flg, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 20, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 20, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 21, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 21, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 22, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 22, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 22, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 22, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 22, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 22, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 23, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 23, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 23, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 23, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 23, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 23, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 24, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 24, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 24, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 24, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 24, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 24, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 25, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 25, $trd_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 26, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 26, $trd_unit_qty_p, row);
	}


	/**
	 * Unit price qty. 単価数量.<p>
	 *
	 */
	public MCNumber upri_qty() {
		return getConstNumber(offset + 27, $upri_qty);
	}

	/**
	 * Unit price qty. 単価数量.<p>
	 *
	 */
	public void upri_qty(MCNumber value) {
		setConstNumber(offset + 27, $upri_qty, value);
	}

	/**
	 * Unit price qty. 単価数量.<p>
	 *
	 */
	public void upri_qty(int value) {
		setConstNumber(offset + 27, $upri_qty, value);
	}

	/**
	 * Unit price qty. 単価数量.<p>
	 *
	 */
	public void upri_qty(long value) {
		setConstNumber(offset + 27, $upri_qty, value);
	}

	/**
	 * Unit price qty. 単価数量.<p>
	 *
	 */
	public void upri_qty(float value) {
		setConstNumber(offset + 27, $upri_qty, value);
	}

	/**
	 * Unit price qty. 単価数量.<p>
	 *
	 */
	public void upri_qty(double value) {
		setConstNumber(offset + 27, $upri_qty, value);
	}


	/**
	 * Maximum standard unit qty. that can be entered 登録可能な最大基準単位数量.<p>
	 *
	 */
	public MCNumber max_base_unit_qty() {
		return getConstNumber(offset + 28, $max_base_unit_qty);
	}

	/**
	 * Maximum standard unit qty. that can be entered 登録可能な最大基準単位数量.<p>
	 *
	 */
	public void max_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 28, $max_base_unit_qty, value);
	}

	/**
	 * Maximum standard unit qty. that can be entered 登録可能な最大基準単位数量.<p>
	 *
	 */
	public void max_base_unit_qty(int value) {
		setConstNumber(offset + 28, $max_base_unit_qty, value);
	}

	/**
	 * Maximum standard unit qty. that can be entered 登録可能な最大基準単位数量.<p>
	 *
	 */
	public void max_base_unit_qty(long value) {
		setConstNumber(offset + 28, $max_base_unit_qty, value);
	}

	/**
	 * Maximum standard unit qty. that can be entered 登録可能な最大基準単位数量.<p>
	 *
	 */
	public void max_base_unit_qty(float value) {
		setConstNumber(offset + 28, $max_base_unit_qty, value);
	}

	/**
	 * Maximum standard unit qty. that can be entered 登録可能な最大基準単位数量.<p>
	 *
	 */
	public void max_base_unit_qty(double value) {
		setConstNumber(offset + 28, $max_base_unit_qty, value);
	}


	/**
	 * Maximum transaction unit qty. that can be entered (message display only) 登録可能な最大取引単位数量（メッセージ表示のみ）.<p>
	 *
	 */
	public MCNumber max_trd_unit_qty() {
		return getConstNumber(offset + 29, $max_trd_unit_qty);
	}

	/**
	 * Maximum transaction unit qty. that can be entered (message display only) 登録可能な最大取引単位数量（メッセージ表示のみ）.<p>
	 *
	 */
	public void max_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 29, $max_trd_unit_qty, value);
	}

	/**
	 * Maximum transaction unit qty. that can be entered (message display only) 登録可能な最大取引単位数量（メッセージ表示のみ）.<p>
	 *
	 */
	public void max_trd_unit_qty(int value) {
		setConstNumber(offset + 29, $max_trd_unit_qty, value);
	}

	/**
	 * Maximum transaction unit qty. that can be entered (message display only) 登録可能な最大取引単位数量（メッセージ表示のみ）.<p>
	 *
	 */
	public void max_trd_unit_qty(long value) {
		setConstNumber(offset + 29, $max_trd_unit_qty, value);
	}

	/**
	 * Maximum transaction unit qty. that can be entered (message display only) 登録可能な最大取引単位数量（メッセージ表示のみ）.<p>
	 *
	 */
	public void max_trd_unit_qty(float value) {
		setConstNumber(offset + 29, $max_trd_unit_qty, value);
	}

	/**
	 * Maximum transaction unit qty. that can be entered (message display only) 登録可能な最大取引単位数量（メッセージ表示のみ）.<p>
	 *
	 */
	public void max_trd_unit_qty(double value) {
		setConstNumber(offset + 29, $max_trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 30, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 30, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 31, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 31, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 32, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 32, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 32, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 32, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 32, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 32, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 33, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 33, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 34, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 34, $base_unit_qty_p, row);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 35, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 35, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 36, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 36, $gd_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR trd_cur_upri_amt_p(){
		return (mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR) getConstInnerRow(offset + 37, $trd_cur_upri_amt_p);
	}
	
	public void trd_cur_upri_amt_p(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR row){
		setConstInnerRow(offset + 37, $trd_cur_upri_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR old_trd_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 38, $old_trd_cur_upri_p);
	}
	
	public void old_trd_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 38, $old_trd_cur_upri_p, row);
	}


	/**
	 * Initial discount amount (For discount calculation) (Transaction currency) 当初取引通貨値引額（値引額計算用）.<p>
	 *
	 */
	public MCNumber schd_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 39, $schd_trd_cur_dscnt_amt);
	}

	/**
	 * Initial discount amount (For discount calculation) (Transaction currency) 当初取引通貨値引額（値引額計算用）.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 39, $schd_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (For discount calculation) (Transaction currency) 当初取引通貨値引額（値引額計算用）.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 39, $schd_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (For discount calculation) (Transaction currency) 当初取引通貨値引額（値引額計算用）.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 39, $schd_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (For discount calculation) (Transaction currency) 当初取引通貨値引額（値引額計算用）.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 39, $schd_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (For discount calculation) (Transaction currency) 当初取引通貨値引額（値引額計算用）.<p>
	 *
	 */
	public void schd_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 39, $schd_trd_cur_dscnt_amt, value);
	}


	/**
	 * Initial base unit qty. (For discount calculation) 当初基準単位数量（値引額計算用）.<p>
	 *
	 */
	public MCNumber schd_base_unit_qty() {
		return getConstNumber(offset + 40, $schd_base_unit_qty);
	}

	/**
	 * Initial base unit qty. (For discount calculation) 当初基準単位数量（値引額計算用）.<p>
	 *
	 */
	public void schd_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 40, $schd_base_unit_qty, value);
	}

	/**
	 * Initial base unit qty. (For discount calculation) 当初基準単位数量（値引額計算用）.<p>
	 *
	 */
	public void schd_base_unit_qty(int value) {
		setConstNumber(offset + 40, $schd_base_unit_qty, value);
	}

	/**
	 * Initial base unit qty. (For discount calculation) 当初基準単位数量（値引額計算用）.<p>
	 *
	 */
	public void schd_base_unit_qty(long value) {
		setConstNumber(offset + 40, $schd_base_unit_qty, value);
	}

	/**
	 * Initial base unit qty. (For discount calculation) 当初基準単位数量（値引額計算用）.<p>
	 *
	 */
	public void schd_base_unit_qty(float value) {
		setConstNumber(offset + 40, $schd_base_unit_qty, value);
	}

	/**
	 * Initial base unit qty. (For discount calculation) 当初基準単位数量（値引額計算用）.<p>
	 *
	 */
	public void schd_base_unit_qty(double value) {
		setConstNumber(offset + 40, $schd_base_unit_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR iv_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 41, $iv_upri_p);
	}
	
	public void iv_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 41, $iv_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR iv_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 42, $iv_amt_p);
	}
	
	public void iv_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 42, $iv_amt_p, row);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 43, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 43, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 44, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 44, $cst_po_d_no, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 45, $sno_wrk_p);
	}
	
	public void sno_wrk_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 45, $sno_wrk_p, row);
	}


	/**
	 * Multiple shipping distribution group flg. 複数出荷物流グループＦＬＧ.<p>
	 *
	 */
	public boolean multi_ship_fr_lg_grp_flg() {
		return getConstBoolean(offset + 46, $multi_ship_fr_lg_grp_flg);
	}

	/**
	 * Multiple shipping distribution group flg. 複数出荷物流グループＦＬＧ.<p>
	 *
	 */
	public void multi_ship_fr_lg_grp_flg(boolean value) {
		setConstBoolean(offset + 46, $multi_ship_fr_lg_grp_flg, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 47, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 47, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public String ship_fr_lg_grp_nm() {
		return getConstString(offset + 48, $ship_fr_lg_grp_nm);
	}

	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public void ship_fr_lg_grp_nm(String value) {
		setConstString(offset + 48, $ship_fr_lg_grp_nm, value);
	}


	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 49, $rsn_cd);
	}

	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 49, $rsn_cd, value);
	}


	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 50, $rsn_nm);
	}

	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 50, $rsn_nm, value);
	}


	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public boolean sls_acxfr_flg() {
		return getConstBoolean(offset + 51, $sls_acxfr_flg);
	}

	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public void sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 51, $sls_acxfr_flg, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 52, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 52, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 53, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 53, $bd_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 54, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 54, $usr_dpt_p, row);
	}


	/**
	 * Sales dept. WG 売上部門のワーキンググループ.<p>
	 *
	 */
	public String sls_dpt_wg_cd() {
		return getConstString(offset + 55, $sls_dpt_wg_cd);
	}

	/**
	 * Sales dept. WG 売上部門のワーキンググループ.<p>
	 *
	 */
	public void sls_dpt_wg_cd(String value) {
		setConstString(offset + 55, $sls_dpt_wg_cd, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 56, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 56, $ar_dpt_cd, value);
	}


	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 57, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 57, $ar_dpt_nm, value);
	}


	/**
	 * Invoice details remarks インボイス明細備考.<p>
	 *
	 */
	public String iv_d_rmrks() {
		return getConstString(offset + 58, $iv_d_rmrks);
	}

	/**
	 * Invoice details remarks インボイス明細備考.<p>
	 *
	 */
	public void iv_d_rmrks(String value) {
		setConstString(offset + 58, $iv_d_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 59, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 59, $trd_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 60, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 60, $trd_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 61, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 61, $intr_d_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return getConstString(offset + 62, $dtl_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		setConstString(offset + 62, $dtl_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return getConstString(offset + 63, $dtl_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		setConstString(offset + 63, $dtl_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return getConstString(offset + 64, $dtl_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		setConstString(offset + 64, $dtl_sub_char3, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 65, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 65, $slo_no, value);
	}


	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public String ship_rqst_no() {
		return getConstString(offset + 66, $ship_rqst_no);
	}

	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public void ship_rqst_no(String value) {
		setConstString(offset + 66, $ship_rqst_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 67, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 67, $slo_d_no, value);
	}


	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return getConstString(offset + 68, $xfr_schd_no);
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		setConstString(offset + 68, $xfr_schd_no, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 69, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 69, $ship_inst_no, value);
	}


	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public String ship_inst_d_no() {
		return getConstString(offset + 70, $ship_inst_d_no);
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		setConstString(offset + 70, $ship_inst_d_no, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 71, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 71, $ship_act_no, value);
	}


	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public String ship_act_d_no() {
		return getConstString(offset + 72, $ship_act_d_no);
	}

	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public void ship_act_d_no(String value) {
		setConstString(offset + 72, $ship_act_d_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 73, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 73, $dlv_slip_d_no, value);
	}


	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public String ship_alloc_sts_no() {
		return getConstString(offset + 74, $ship_alloc_sts_no);
	}

	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public void ship_alloc_sts_no(String value) {
		setConstString(offset + 74, $ship_alloc_sts_no, value);
	}


	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public boolean uplnd_flg() {
		return getConstBoolean(offset + 75, $uplnd_flg);
	}

	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public void uplnd_flg(boolean value) {
		setConstBoolean(offset + 75, $uplnd_flg, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 76, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 76, $dest_cd1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 77, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 77, $dest_cd2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 78, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 78, $dest_cd3, value);
	}


	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public boolean sls_upri_cng_flg() {
		return getConstBoolean(offset + 79, $sls_upri_cng_flg);
	}

	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public void sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 79, $sls_upri_cng_flg, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 80, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 80, $purc_schd_no, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 81, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 81, $purc_act_d_no, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR dlv_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 82, $dlv_rqst_dt_p);
	}
	
	public void dlv_rqst_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 82, $dlv_rqst_dt_p, row);
	}


	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 83, $iv_d_no);
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 83, $iv_d_no, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 84, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 84, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 84, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 84, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 84, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 84, $disp_seq, value);
	}


	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return getConstNumber(offset + 85, $ptax_cur_amt);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		setConstNumber(offset + 85, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		setConstNumber(offset + 85, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		setConstNumber(offset + 85, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		setConstNumber(offset + 85, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		setConstNumber(offset + 85, $ptax_cur_amt, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 86, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 86, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 86, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 86, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 86, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 86, $wtax_rate, value);
	}


	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 87, $wtax_amt);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 87, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 87, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 87, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 87, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 87, $wtax_amt, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 88, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 88, $ship_schd_no, value);
	}


	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 89, $pr_sts_typ);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 89, $pr_sts_typ, value);
	}


	/**
	 * Manual addition flg. マニュアル追加ＦＬＧ.<p>
	 *
	 */
	public boolean manual_add_flg() {
		return getConstBoolean(offset + 90, $manual_add_flg);
	}

	/**
	 * Manual addition flg. マニュアル追加ＦＬＧ.<p>
	 *
	 */
	public void manual_add_flg(boolean value) {
		setConstBoolean(offset + 90, $manual_add_flg, value);
	}


	/**
	 * Existing data flg. 既存データＦＬＧ.<p>
	 *
	 */
	public boolean existed_flg() {
		return getConstBoolean(offset + 91, $existed_flg);
	}

	/**
	 * Existing data flg. 既存データＦＬＧ.<p>
	 *
	 */
	public void existed_flg(boolean value) {
		setConstBoolean(offset + 91, $existed_flg, value);
	}


	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public boolean purc_ddlv_flg() {
		return getConstBoolean(offset + 92, $purc_ddlv_flg);
	}

	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public void purc_ddlv_flg(boolean value) {
		setConstBoolean(offset + 92, $purc_ddlv_flg, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 93, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 93, $ship_pr_no, value);
	}


	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 94, $ship_inst_typ);
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 94, $ship_inst_typ, value);
	}


	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public MCNumber ship_inst_qty() {
		return getConstNumber(offset + 95, $ship_inst_qty);
	}

	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public void ship_inst_qty(MCNumber value) {
		setConstNumber(offset + 95, $ship_inst_qty, value);
	}

	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public void ship_inst_qty(int value) {
		setConstNumber(offset + 95, $ship_inst_qty, value);
	}

	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public void ship_inst_qty(long value) {
		setConstNumber(offset + 95, $ship_inst_qty, value);
	}

	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public void ship_inst_qty(float value) {
		setConstNumber(offset + 95, $ship_inst_qty, value);
	}

	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public void ship_inst_qty(double value) {
		setConstNumber(offset + 95, $ship_inst_qty, value);
	}


	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public MCNumber ship_act_qty() {
		return getConstNumber(offset + 96, $ship_act_qty);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(MCNumber value) {
		setConstNumber(offset + 96, $ship_act_qty, value);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(int value) {
		setConstNumber(offset + 96, $ship_act_qty, value);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(long value) {
		setConstNumber(offset + 96, $ship_act_qty, value);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(float value) {
		setConstNumber(offset + 96, $ship_act_qty, value);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(double value) {
		setConstNumber(offset + 96, $ship_act_qty, value);
	}


	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_pr_upd_cntr() {
		return getConstNumber(offset + 97, $ship_pr_upd_cntr);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 97, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(int value) {
		setConstNumber(offset + 97, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(long value) {
		setConstNumber(offset + 97, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(float value) {
		setConstNumber(offset + 97, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(double value) {
		setConstNumber(offset + 97, $ship_pr_upd_cntr, value);
	}


	/**
	 * Index for initially searched details data 初期検索した明細データのindex.<p>
	 *
	 */
	public MCNumber index() {
		return getConstNumber(offset + 98, $index);
	}

	/**
	 * Index for initially searched details data 初期検索した明細データのindex.<p>
	 *
	 */
	public void index(MCNumber value) {
		setConstNumber(offset + 98, $index, value);
	}

	/**
	 * Index for initially searched details data 初期検索した明細データのindex.<p>
	 *
	 */
	public void index(int value) {
		setConstNumber(offset + 98, $index, value);
	}

	/**
	 * Index for initially searched details data 初期検索した明細データのindex.<p>
	 *
	 */
	public void index(long value) {
		setConstNumber(offset + 98, $index, value);
	}

	/**
	 * Index for initially searched details data 初期検索した明細データのindex.<p>
	 *
	 */
	public void index(float value) {
		setConstNumber(offset + 98, $index, value);
	}

	/**
	 * Index for initially searched details data 初期検索した明細データのindex.<p>
	 *
	 */
	public void index(double value) {
		setConstNumber(offset + 98, $index, value);
	}


	/**
	 * Select additional details in bulk 明細追加選択まとめ.<p>
	 *
	 */
	public boolean iv_d_sel_bndl_flg() {
		return getConstBoolean(offset + 99, $iv_d_sel_bndl_flg);
	}

	/**
	 * Select additional details in bulk 明細追加選択まとめ.<p>
	 *
	 */
	public void iv_d_sel_bndl_flg(boolean value) {
		setConstBoolean(offset + 99, $iv_d_sel_bndl_flg, value);
	}


	public String getString(String name) {
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			return exim_xpns_typ();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($sls_dpt_wg_cd.equalsIgnoreCase(name)) {
			return sls_dpt_wg_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($iv_d_rmrks.equalsIgnoreCase(name)) {
			return iv_d_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ship_rqst_no.equalsIgnoreCase(name)) {
			return ship_rqst_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			return ship_act_d_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($upri_qty.equalsIgnoreCase(name)) {
			return upri_qty();
		}
		if ($max_base_unit_qty.equalsIgnoreCase(name)) {
			return max_base_unit_qty();
		}
		if ($max_trd_unit_qty.equalsIgnoreCase(name)) {
			return max_trd_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_dscnt_amt();
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			return schd_base_unit_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			return ship_inst_qty();
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			return ship_act_qty();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($index.equalsIgnoreCase(name)) {
			return index();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($bndl_flg.equalsIgnoreCase(name)) {
			return bndl_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($multi_ship_fr_lg_grp_flg.equalsIgnoreCase(name)) {
			return multi_ship_fr_lg_grp_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			return manual_add_flg();
		}
		if ($existed_flg.equalsIgnoreCase(name)) {
			return existed_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		if ($iv_d_sel_bndl_flg.equalsIgnoreCase(name)) {
			return iv_d_sel_bndl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			return exim_xpns_typ();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($sls_dpt_wg_cd.equalsIgnoreCase(name)) {
			return sls_dpt_wg_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($iv_d_rmrks.equalsIgnoreCase(name)) {
			return iv_d_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ship_rqst_no.equalsIgnoreCase(name)) {
			return ship_rqst_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			return ship_act_d_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return ship_alloc_sts_no();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($upri_qty.equalsIgnoreCase(name)) {
			return upri_qty();
		}
		if ($max_base_unit_qty.equalsIgnoreCase(name)) {
			return max_base_unit_qty();
		}
		if ($max_trd_unit_qty.equalsIgnoreCase(name)) {
			return max_trd_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return schd_trd_cur_dscnt_amt();
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			return schd_base_unit_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			return ship_inst_qty();
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			return ship_act_qty();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($index.equalsIgnoreCase(name)) {
			return index();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($bndl_flg.equalsIgnoreCase(name)) {
			return bndl_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($multi_ship_fr_lg_grp_flg.equalsIgnoreCase(name)) {
			return multi_ship_fr_lg_grp_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			return manual_add_flg();
		}
		if ($existed_flg.equalsIgnoreCase(name)) {
			return existed_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		if ($iv_d_sel_bndl_flg.equalsIgnoreCase(name)) {
			return iv_d_sel_bndl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			exim_xpns_typ(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($sls_dpt_wg_cd.equalsIgnoreCase(name)) {
			sls_dpt_wg_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($iv_d_rmrks.equalsIgnoreCase(name)) {
			iv_d_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ship_rqst_no.equalsIgnoreCase(name)) {
			ship_rqst_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			ship_act_d_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_qty.equalsIgnoreCase(name)) {
			upri_qty(value);
			return;
		}
		if ($max_base_unit_qty.equalsIgnoreCase(name)) {
			max_base_unit_qty(value);
			return;
		}
		if ($max_trd_unit_qty.equalsIgnoreCase(name)) {
			max_trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($index.equalsIgnoreCase(name)) {
			index(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_qty.equalsIgnoreCase(name)) {
			upri_qty(value);
			return;
		}
		if ($max_base_unit_qty.equalsIgnoreCase(name)) {
			max_base_unit_qty(value);
			return;
		}
		if ($max_trd_unit_qty.equalsIgnoreCase(name)) {
			max_trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($index.equalsIgnoreCase(name)) {
			index(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_qty.equalsIgnoreCase(name)) {
			upri_qty(value);
			return;
		}
		if ($max_base_unit_qty.equalsIgnoreCase(name)) {
			max_base_unit_qty(value);
			return;
		}
		if ($max_trd_unit_qty.equalsIgnoreCase(name)) {
			max_trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($index.equalsIgnoreCase(name)) {
			index(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_qty.equalsIgnoreCase(name)) {
			upri_qty(value);
			return;
		}
		if ($max_base_unit_qty.equalsIgnoreCase(name)) {
			max_base_unit_qty(value);
			return;
		}
		if ($max_trd_unit_qty.equalsIgnoreCase(name)) {
			max_trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($index.equalsIgnoreCase(name)) {
			index(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_qty.equalsIgnoreCase(name)) {
			upri_qty(value);
			return;
		}
		if ($max_base_unit_qty.equalsIgnoreCase(name)) {
			max_base_unit_qty(value);
			return;
		}
		if ($max_trd_unit_qty.equalsIgnoreCase(name)) {
			max_trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($index.equalsIgnoreCase(name)) {
			index(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($bndl_flg.equalsIgnoreCase(name)) {
			bndl_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($multi_ship_fr_lg_grp_flg.equalsIgnoreCase(name)) {
			multi_ship_fr_lg_grp_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			manual_add_flg(value);
			return;
		}
		if ($existed_flg.equalsIgnoreCase(name)) {
			existed_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		if ($iv_d_sel_bndl_flg.equalsIgnoreCase(name)) {
			iv_d_sel_bndl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			exim_xpns_typ(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($sls_dpt_wg_cd.equalsIgnoreCase(name)) {
			sls_dpt_wg_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($iv_d_rmrks.equalsIgnoreCase(name)) {
			iv_d_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ship_rqst_no.equalsIgnoreCase(name)) {
			ship_rqst_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			ship_act_d_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_alloc_sts_no.equalsIgnoreCase(name)) {
			ship_alloc_sts_no(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_qty.equalsIgnoreCase(name)) {
			upri_qty(value);
			return;
		}
		if ($max_base_unit_qty.equalsIgnoreCase(name)) {
			max_base_unit_qty(value);
			return;
		}
		if ($max_trd_unit_qty.equalsIgnoreCase(name)) {
			max_trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($index.equalsIgnoreCase(name)) {
			index(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_qty.equalsIgnoreCase(name)) {
			upri_qty(value);
			return;
		}
		if ($max_base_unit_qty.equalsIgnoreCase(name)) {
			max_base_unit_qty(value);
			return;
		}
		if ($max_trd_unit_qty.equalsIgnoreCase(name)) {
			max_trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($index.equalsIgnoreCase(name)) {
			index(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_qty.equalsIgnoreCase(name)) {
			upri_qty(value);
			return;
		}
		if ($max_base_unit_qty.equalsIgnoreCase(name)) {
			max_base_unit_qty(value);
			return;
		}
		if ($max_trd_unit_qty.equalsIgnoreCase(name)) {
			max_trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($index.equalsIgnoreCase(name)) {
			index(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_qty.equalsIgnoreCase(name)) {
			upri_qty(value);
			return;
		}
		if ($max_base_unit_qty.equalsIgnoreCase(name)) {
			max_base_unit_qty(value);
			return;
		}
		if ($max_trd_unit_qty.equalsIgnoreCase(name)) {
			max_trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($index.equalsIgnoreCase(name)) {
			index(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_qty.equalsIgnoreCase(name)) {
			upri_qty(value);
			return;
		}
		if ($max_base_unit_qty.equalsIgnoreCase(name)) {
			max_base_unit_qty(value);
			return;
		}
		if ($max_trd_unit_qty.equalsIgnoreCase(name)) {
			max_trd_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($schd_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			schd_trd_cur_dscnt_amt(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($index.equalsIgnoreCase(name)) {
			index(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($bndl_flg.equalsIgnoreCase(name)) {
			bndl_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($multi_ship_fr_lg_grp_flg.equalsIgnoreCase(name)) {
			multi_ship_fr_lg_grp_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			manual_add_flg(value);
			return;
		}
		if ($existed_flg.equalsIgnoreCase(name)) {
			existed_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		if ($iv_d_sel_bndl_flg.equalsIgnoreCase(name)) {
			iv_d_sel_bndl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($trd_cur_upri_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_upri_amt_p();
		}
		if ($old_trd_cur_upri_p.equalsIgnoreCase(name)) {
			return old_trd_cur_upri_p();
		}
		if ($iv_upri_p.equalsIgnoreCase(name)) {
			return iv_upri_p();
		}
		if ($iv_amt_p.equalsIgnoreCase(name)) {
			return iv_amt_p();
		}
		if ($sno_wrk_p.equalsIgnoreCase(name)) {
			return sno_wrk_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($dlv_rqst_dt_p.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_p();
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
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			trd_unit_qty_p(
				((MCContainerMeta) trd_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_cur_upri_amt_p.equalsIgnoreCase(name)) {
			trd_cur_upri_amt_p(
				((MCContainerMeta) trd_cur_upri_amt_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class, value)
			);
			return;
		}
		if ($old_trd_cur_upri_p.equalsIgnoreCase(name)) {
			old_trd_cur_upri_p(
				((MCContainerMeta) old_trd_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($iv_upri_p.equalsIgnoreCase(name)) {
			iv_upri_p(
				((MCContainerMeta) iv_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($iv_amt_p.equalsIgnoreCase(name)) {
			iv_amt_p(
				((MCContainerMeta) iv_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($sno_wrk_p.equalsIgnoreCase(name)) {
			sno_wrk_p(
				((MCContainerMeta) sno_wrk_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($dlv_rqst_dt_p.equalsIgnoreCase(name)) {
			dlv_rqst_dt_p(
				((MCContainerMeta) dlv_rqst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return itm_p().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return itm_p().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return trd_unit_qty_p().qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

	public boolean upri_not_tgt_flg() {
		return trd_cur_upri_amt_p().upri_not_tgt_flg();
	}

	public void upri_not_tgt_flg(boolean value) {
		trd_cur_upri_amt_p().upri_not_tgt_flg(value);
	}

	public MCNumber trd_cur_upri() {
		return trd_cur_upri_amt_p().trd_cur_upri();
	}

	public void trd_cur_upri(MCNumber value) {
		trd_cur_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(int value) {
		trd_cur_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(long value) {
		trd_cur_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(float value) {
		trd_cur_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(double value) {
		trd_cur_upri_amt_p().trd_cur_upri(value);
	}

	public boolean interim_flg() {
		return trd_cur_upri_amt_p().interim_flg();
	}

	public void interim_flg(boolean value) {
		trd_cur_upri_amt_p().interim_flg(value);
	}

	public MCNumber trd_cur_amt() {
		return trd_cur_upri_amt_p().trd_cur_amt();
	}

	public void trd_cur_amt(MCNumber value) {
		trd_cur_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(int value) {
		trd_cur_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(long value) {
		trd_cur_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(float value) {
		trd_cur_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(double value) {
		trd_cur_upri_amt_p().trd_cur_amt(value);
	}

	public MCNumber trd_cur_inc_tax_amt() {
		return trd_cur_upri_amt_p().trd_cur_inc_tax_amt();
	}

	public void trd_cur_inc_tax_amt(MCNumber value) {
		trd_cur_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(int value) {
		trd_cur_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(long value) {
		trd_cur_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(float value) {
		trd_cur_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(double value) {
		trd_cur_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public boolean tax_fix_flg() {
		return trd_cur_upri_amt_p().tax_fix_flg();
	}

	public void tax_fix_flg(boolean value) {
		trd_cur_upri_amt_p().tax_fix_flg(value);
	}

	public String tax_cd() {
		return trd_cur_upri_amt_p().tax_cd();
	}

	public void tax_cd(String value) {
		trd_cur_upri_amt_p().tax_cd(value);
	}

	public String tax_nm() {
		return trd_cur_upri_amt_p().tax_nm();
	}

	public void tax_nm(String value) {
		trd_cur_upri_amt_p().tax_nm(value);
	}

	public MCNumber tax_rate() {
		return trd_cur_upri_amt_p().tax_rate();
	}

	public void tax_rate(MCNumber value) {
		trd_cur_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(int value) {
		trd_cur_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(long value) {
		trd_cur_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(float value) {
		trd_cur_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(double value) {
		trd_cur_upri_amt_p().tax_rate(value);
	}

	public String tax_typ() {
		return trd_cur_upri_amt_p().tax_typ();
	}

	public void tax_typ(String value) {
		trd_cur_upri_amt_p().tax_typ(value);
	}

	public boolean inc_tax_flg() {
		return trd_cur_upri_amt_p().inc_tax_flg();
	}

	public void inc_tax_flg(boolean value) {
		trd_cur_upri_amt_p().inc_tax_flg(value);
	}

	public MCNumber trd_cur_tax_amt() {
		return trd_cur_upri_amt_p().trd_cur_tax_amt();
	}

	public void trd_cur_tax_amt(MCNumber value) {
		trd_cur_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(int value) {
		trd_cur_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(long value) {
		trd_cur_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(float value) {
		trd_cur_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(double value) {
		trd_cur_upri_amt_p().trd_cur_tax_amt(value);
	}

	public MCNumber trd_cur_dscnt_amt() {
		return trd_cur_upri_amt_p().trd_cur_dscnt_amt();
	}

	public void trd_cur_dscnt_amt(MCNumber value) {
		trd_cur_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(int value) {
		trd_cur_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(long value) {
		trd_cur_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(float value) {
		trd_cur_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(double value) {
		trd_cur_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public String dscnt_rsn_cd() {
		return trd_cur_upri_amt_p().dscnt_rsn_cd();
	}

	public void dscnt_rsn_cd(String value) {
		trd_cur_upri_amt_p().dscnt_rsn_cd(value);
	}

	public String dscnt_rsn_nm() {
		return trd_cur_upri_amt_p().dscnt_rsn_nm();
	}

	public void dscnt_rsn_nm(String value) {
		trd_cur_upri_amt_p().dscnt_rsn_nm(value);
	}

	/**
	 * Unit price (Transaction currency) (Before Reacquire) 取引通貨単価（再取得前）.<p>
	 *
	 */
	public MCNumber old_trd_cur_upri() {
		return old_trd_cur_upri_p().upri();
	}

	/**
	 * Unit price (Transaction currency) (Before Reacquire) 取引通貨単価（再取得前）.<p>
	 *
	 */
	public void old_trd_cur_upri(MCNumber value) {
		old_trd_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Transaction currency) (Before Reacquire) 取引通貨単価（再取得前）.<p>
	 *
	 */
	public void old_trd_cur_upri(int value) {
		old_trd_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Transaction currency) (Before Reacquire) 取引通貨単価（再取得前）.<p>
	 *
	 */
	public void old_trd_cur_upri(long value) {
		old_trd_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Transaction currency) (Before Reacquire) 取引通貨単価（再取得前）.<p>
	 *
	 */
	public void old_trd_cur_upri(float value) {
		old_trd_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Transaction currency) (Before Reacquire) 取引通貨単価（再取得前）.<p>
	 *
	 */
	public void old_trd_cur_upri(double value) {
		old_trd_cur_upri_p().upri(value);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public MCNumber iv_upri() {
		return iv_upri_p().upri();
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(MCNumber value) {
		iv_upri_p().upri(value);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(int value) {
		iv_upri_p().upri(value);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(long value) {
		iv_upri_p().upri(value);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(float value) {
		iv_upri_p().upri(value);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(double value) {
		iv_upri_p().upri(value);
	}

	/**
	 * Invoice amount インボイス金額.<p>
	 *
	 */
	public MCNumber iv_amt() {
		return iv_amt_p().amt();
	}

	/**
	 * Invoice amount インボイス金額.<p>
	 *
	 */
	public void iv_amt(MCNumber value) {
		iv_amt_p().amt(value);
	}

	/**
	 * Invoice amount インボイス金額.<p>
	 *
	 */
	public void iv_amt(int value) {
		iv_amt_p().amt(value);
	}

	/**
	 * Invoice amount インボイス金額.<p>
	 *
	 */
	public void iv_amt(long value) {
		iv_amt_p().amt(value);
	}

	/**
	 * Invoice amount インボイス金額.<p>
	 *
	 */
	public void iv_amt(float value) {
		iv_amt_p().amt(value);
	}

	/**
	 * Invoice amount インボイス金額.<p>
	 *
	 */
	public void iv_amt(double value) {
		iv_amt_p().amt(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return sno_wrk_p().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		sno_wrk_p().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return sno_wrk_p().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		sno_wrk_p().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return sno_wrk_p().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		sno_wrk_p().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return sno_wrk_p().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		sno_wrk_p().sno4(value);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return sno_wrk_p().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		sno_wrk_p().wrk_no(value);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return sno_wrk_p().wrk_nm();
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		sno_wrk_p().wrk_nm(value);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return dlv_rqst_dt_p().ymd();
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		dlv_rqst_dt_p().ymd(value);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return dlv_rqst_dt_p().hm();
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		dlv_rqst_dt_p().hm(value);
	}

}

