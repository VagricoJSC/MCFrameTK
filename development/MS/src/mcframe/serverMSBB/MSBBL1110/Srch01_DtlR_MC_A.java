package mcframe.serverMSBB.MSBBL1110;

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
 * ブロック"Srch01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlR_MC_A extends MCConstRow {

	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public static final String $qtn_d_no = "qtn_d_no";
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
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
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
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public static final String $sno1_num_typ = "sno1_num_typ";
	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public static final String $sno2_num_typ = "sno2_num_typ";
	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public static final String $sno3_num_typ = "sno3_num_typ";
	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public static final String $sno4_num_typ = "sno4_num_typ";
	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public static final String $slo_sno1_flg = "slo_sno1_flg";
	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public static final String $slo_sno2_flg = "slo_sno2_flg";
	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public static final String $slo_sno3_flg = "slo_sno3_flg";
	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public static final String $slo_sno4_flg = "slo_sno4_flg";
	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public static final String $comp_spec_typ = "comp_spec_typ";
	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public static final String $comp_spec_typ_nm = "comp_spec_typ_nm";
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
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
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
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
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
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public static final String $trd_cur_std_sls_upri = "trd_cur_std_sls_upri";
	/**
	 * Standard sales amount (Transaction currency) 取引通貨標準販売金額.<p>
	 *
	 */
	public static final String $trd_cur_std_sls_amt = "trd_cur_std_sls_amt";
	/**
	 * Standard tax included sales amount (Transaction currency) 取引通貨標準販売税込金額.<p>
	 *
	 */
	public static final String $trd_cur_std_sls_inc_tax_amt = "trd_cur_std_sls_inc_tax_amt";
	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public static final String $upri_rate = "upri_rate";
	/**
	 * Discount unit price (Transaction currency) 取引通貨仕切単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public static final String $upri_not_tgt_flg = "upri_not_tgt_flg";
	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public static final String $trd_cur_inc_tax_amt = "trd_cur_inc_tax_amt";
	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public static final String $dscnt_rsn_cd = "dscnt_rsn_cd";
	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public static final String $dscnt_rsn_nm = "dscnt_rsn_nm";
	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public static final String $tax_fix_flg = "tax_fix_flg";
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
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public static final String $cost_upri = "cost_upri";
	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public static final String $cost_amt = "cost_amt";
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public static final String $prof_rate = "prof_rate";
	/**
	 * Standard sales tax (Transaction currency) 取引通貨標準販売税額.<p>
	 *
	 */
	public static final String $trd_cur_std_sls_tax_amt = "trd_cur_std_sls_tax_amt";
	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
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
	 * Standard sales unit price (Base currency) 基準通貨標準販売単価.<p>
	 *
	 */
	public static final String $base_cur_std_sls_upri = "base_cur_std_sls_upri";
	/**
	 * Standard sales amount (Base currency) 基準通貨標準販売金額.<p>
	 *
	 */
	public static final String $base_cur_std_sls_amt = "base_cur_std_sls_amt";
	/**
	 * Standard tax included sales amount (Base currency) 基準通貨標準販売税込金額.<p>
	 *
	 */
	public static final String $base_cur_std_sls_inc_tax_amt = "base_cur_std_sls_inc_tax_amt";
	/**
	 * Standard sales tax amount (Base currency) 基準通貨標準販売税額.<p>
	 *
	 */
	public static final String $base_cur_std_sls_tax_amt = "base_cur_std_sls_tax_amt";
	/**
	 * Discount unit price (Base currency) 基準通貨仕切単価.<p>
	 *
	 */
	public static final String $base_cur_upri = "base_cur_upri";
	/**
	 * Discount amount (Base currency) 基準通貨仕切金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Tax included discount amount (Base currency) 基準通貨仕切税込金額.<p>
	 *
	 */
	public static final String $base_cur_inc_tax_amt = "base_cur_inc_tax_amt";
	/**
	 * Discount tax amount (Base currency) 基準通貨仕切税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public static final String $set_itm_grp_no = "set_itm_grp_no";
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
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public static final String $dlv_zip_cd = "dlv_zip_cd";
	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public static final String $dlv_addr1 = "dlv_addr1";
	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public static final String $dlv_addr2 = "dlv_addr2";
	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public static final String $dlv_addr3 = "dlv_addr3";
	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public static final String $dlv_addr4 = "dlv_addr4";
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public static final String $dlv_tel = "dlv_tel";
	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public static final String $dlv_fax = "dlv_fax";
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Distribution channel 1 cd. 仕向先１ＣＤ.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	/**
	 * Distribution channel 2 cd. 仕向先２ＣＤ.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	/**
	 * Distribution channel 3 cd. 仕向先３ＣＤ.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	/**
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public static final String $qtn_d_rmrks = "qtn_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Configuration rev. number 構成改訂番号.<p>
	 *
	 */
	public static final String $itm_comp_rev_no = "itm_comp_rev_no";
	/**
	 * Item undefined 品目未定義.<p>
	 *
	 */
	public static final String $no_itm_cd_flg = "no_itm_cd_flg";
	/**
	 * Configuration release 構成リリース.<p>
	 *
	 */
	public static final String $comp_rel_flg = "comp_rel_flg";
	/**
	 * Specification exists 仕様有.<p>
	 *
	 */
	public static final String $spec_flg = "spec_flg";
	/**
	 * Specification remarks 仕様備考.<p>
	 *
	 */
	public static final String $spec_sub_char1 = "spec_sub_char1";
	/**
	 * Specification spare 1 仕様予備１.<p>
	 *
	 */
	public static final String $spec_sub_char2 = "spec_sub_char2";
	/**
	 * Specification spare 2 仕様予備２.<p>
	 *
	 */
	public static final String $spec_sub_char3 = "spec_sub_char3";
	/**
	 * Specification spare 3 仕様予備３.<p>
	 *
	 */
	public static final String $spec_sub_char4 = "spec_sub_char4";
	/**
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public static final String $qtn_d_rslt_rsn_cd = "qtn_d_rslt_rsn_cd";
	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public static final String $qtn_d_rslt_rsn_nm = "qtn_d_rslt_rsn_nm";
	/**
	 * Quotation details result reason remarks 見積明細結果理由備考.<p>
	 *
	 */
	public static final String $qtn_d_rslt_rsn_rmrks = "qtn_d_rslt_rsn_rmrks";
	/**
	 * Copy qty. 引継数量.<p>
	 *
	 */
	public static final String $trnst_qty = "trnst_qty";
	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_qtn_rqst_d_no = "cst_qtn_rqst_d_no";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";


	public static final MCMeta qtn_d_no_META = createCommonMeta($qtn_d_no, mcframe.commonMA.meta.MA_META.QTN_D_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno1_num_typ_META = createCommonMeta($sno1_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno2_num_typ_META = createCommonMeta($sno2_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno3_num_typ_META = createCommonMeta($sno3_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno4_num_typ_META = createCommonMeta($sno4_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta slo_sno1_flg_META = createCommonMeta($slo_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno2_flg_META = createCommonMeta($slo_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno3_flg_META = createCommonMeta($slo_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno4_flg_META = createCommonMeta($slo_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_spec_typ_META = createCommonMeta($comp_spec_typ, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP);
	public static final MCMeta comp_spec_typ_nm_META = createCommonMeta($comp_spec_typ_nm, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_org_nm_META = createCommonMeta($cntry_org_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_std_sls_upri_META = createCommonMeta($trd_cur_std_sls_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_std_sls_amt_META = createCommonMeta($trd_cur_std_sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_std_sls_inc_tax_amt_META = createCommonMeta($trd_cur_std_sls_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri_rate_META = createCommonMeta($upri_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri_not_tgt_flg_META = createCommonMeta($upri_not_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_inc_tax_amt_META = createCommonMeta($trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dscnt_rsn_nm_META = createCommonMeta($dscnt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta tax_fix_flg_META = createCommonMeta($tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cost_upri_META = createCommonMeta($cost_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cost_amt_META = createCommonMeta($cost_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prof_rate_META = createCommonMeta($prof_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta trd_cur_std_sls_tax_amt_META = createCommonMeta($trd_cur_std_sls_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta base_cur_std_sls_upri_META = createCommonMeta($base_cur_std_sls_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_std_sls_amt_META = createCommonMeta($base_cur_std_sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_std_sls_inc_tax_amt_META = createCommonMeta($base_cur_std_sls_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_std_sls_tax_amt_META = createCommonMeta($base_cur_std_sls_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_inc_tax_amt_META = createCommonMeta($base_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta set_itm_grp_no_META = createCommonMeta($set_itm_grp_no, mcframe.commonMA.meta.MA_META.SET_ITM_GRP_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta qtn_d_rmrks_META = createCommonMeta($qtn_d_rmrks, mcframe.commonMS.meta.MS_META.QTN_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.QTN_D_INTR_RMRKS);
	public static final MCMeta itm_comp_rev_no_META = createCommonMeta($itm_comp_rev_no, mcframe.commonMA.meta.MA_META.ITM_COMP_REV_NO);
	public static final MCMeta no_itm_cd_flg_META = createCommonMeta($no_itm_cd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_rel_flg_META = createCommonMeta($comp_rel_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spec_flg_META = createCommonMeta($spec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spec_sub_char1_META = createCommonMeta($spec_sub_char1, mcframe.commonMS.meta.MS_META.SPEC_RMRKS);
	public static final MCMeta spec_sub_char2_META = createCommonMeta($spec_sub_char2, mcframe.commonMS.meta.MS_META.SLS_ITM_SPEC_SUB_CHAR1);
	public static final MCMeta spec_sub_char3_META = createCommonMeta($spec_sub_char3, mcframe.commonMS.meta.MS_META.SLS_ITM_SPEC_SUB_CHAR2);
	public static final MCMeta spec_sub_char4_META = createCommonMeta($spec_sub_char4, mcframe.commonMS.meta.MS_META.SLS_ITM_SPEC_SUB_CHAR3);
	public static final MCMeta qtn_d_rslt_rsn_cd_META = createCommonMeta($qtn_d_rslt_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_d_rslt_rsn_nm_META = createCommonMeta($qtn_d_rslt_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta qtn_d_rslt_rsn_rmrks_META = createCommonMeta($qtn_d_rslt_rsn_rmrks, mcframe.commonMS.meta.MS_META.QTN_D_RSLT_RSN_RMRKS);
	public static final MCMeta trnst_qty_META = createCommonMeta($trnst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cst_qtn_rqst_d_no_META = createCommonMeta($cst_qtn_rqst_d_no, mcframe.commonMA.meta.MA_META.CST_QTN_RQST_D_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR3);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);

	protected static final ConstMetaList<Srch01_DtlR> constMetas = new ConstMetaList<Srch01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			qtn_d_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			dscnt_itm_flg_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			sno1_num_typ_META,
			sno2_num_typ_META,
			sno3_num_typ_META,
			sno4_num_typ_META,
			slo_sno1_flg_META,
			slo_sno2_flg_META,
			slo_sno3_flg_META,
			slo_sno4_flg_META,
			comp_spec_typ_META,
			comp_spec_typ_nm_META,
			stk_mng_typ_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			sundry_itm_flg_META,
			iv_itm_nm_META,
			cntry_org_cd_META,
			cntry_org_nm_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_META,
			interim_flg_META,
			trd_cur_std_sls_upri_META,
			trd_cur_std_sls_amt_META,
			trd_cur_std_sls_inc_tax_amt_META,
			upri_rate_META,
			trd_cur_upri_META,
			upri_not_tgt_flg_META,
			trd_cur_amt_META,
			trd_cur_inc_tax_amt_META,
			trd_cur_dscnt_amt_META,
			dscnt_rsn_cd_META,
			dscnt_rsn_nm_META,
			tax_fix_flg_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			inc_tax_flg_META,
			cost_upri_META,
			cost_amt_META,
			prof_rate_META,
			trd_cur_std_sls_tax_amt_META,
			trd_cur_tax_amt_META,
			gd_cd_META,
			gd_nm_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			base_cur_std_sls_upri_META,
			base_cur_std_sls_amt_META,
			base_cur_std_sls_inc_tax_amt_META,
			base_cur_std_sls_tax_amt_META,
			base_cur_upri_META,
			base_cur_amt_META,
			base_cur_inc_tax_amt_META,
			base_cur_tax_amt_META,
			set_itm_grp_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_tel_META,
			dlv_fax_META,
			dlv_sundry_flg_META,
			cntry_cd_META,
			cntry_nm_META,
			prnt_lcl_cd_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			qtn_d_rmrks_META,
			intr_rmrks_META,
			itm_comp_rev_no_META,
			no_itm_cd_flg_META,
			comp_rel_flg_META,
			spec_flg_META,
			spec_sub_char1_META,
			spec_sub_char2_META,
			spec_sub_char3_META,
			spec_sub_char4_META,
			qtn_d_rslt_rsn_cd_META,
			qtn_d_rslt_rsn_nm_META,
			qtn_d_rslt_rsn_rmrks_META,
			trnst_qty_META,
			cst_qtn_rqst_d_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			disp_seq_META
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
				{$comp_spec_typ, "MAC_COMP_SPEC_TYP"},	// comp_spec_typ
				{$asset_mng_typ, "MAC_ASSET_MNG_TYP"}	// asset_mng_typ
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
	protected Srch01_DtlR_MC_A(ConstMetaList<? extends Srch01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR clone() {
		return (Srch01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR createInstance() {
		return (Srch01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR getValues(String... names) {
		return (Srch01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public String qtn_d_no() {
		return getConstString(offset + 0, $qtn_d_no);
	}

	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public void qtn_d_no(String value) {
		setConstString(offset + 0, $qtn_d_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 5, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 5, $itm_nm, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 6, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 6, $dscnt_itm_flg, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 7, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 7, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 8, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 8, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 9, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 9, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 10, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 10, $sno4_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public String sno1_num_typ() {
		return getConstString(offset + 11, $sno1_num_typ);
	}

	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public void sno1_num_typ(String value) {
		setConstString(offset + 11, $sno1_num_typ, value);
	}


	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public String sno2_num_typ() {
		return getConstString(offset + 12, $sno2_num_typ);
	}

	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public void sno2_num_typ(String value) {
		setConstString(offset + 12, $sno2_num_typ, value);
	}


	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public String sno3_num_typ() {
		return getConstString(offset + 13, $sno3_num_typ);
	}

	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public void sno3_num_typ(String value) {
		setConstString(offset + 13, $sno3_num_typ, value);
	}


	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public String sno4_num_typ() {
		return getConstString(offset + 14, $sno4_num_typ);
	}

	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public void sno4_num_typ(String value) {
		setConstString(offset + 14, $sno4_num_typ, value);
	}


	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public boolean slo_sno1_flg() {
		return getConstBoolean(offset + 15, $slo_sno1_flg);
	}

	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public void slo_sno1_flg(boolean value) {
		setConstBoolean(offset + 15, $slo_sno1_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public boolean slo_sno2_flg() {
		return getConstBoolean(offset + 16, $slo_sno2_flg);
	}

	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public void slo_sno2_flg(boolean value) {
		setConstBoolean(offset + 16, $slo_sno2_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public boolean slo_sno3_flg() {
		return getConstBoolean(offset + 17, $slo_sno3_flg);
	}

	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public void slo_sno3_flg(boolean value) {
		setConstBoolean(offset + 17, $slo_sno3_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public boolean slo_sno4_flg() {
		return getConstBoolean(offset + 18, $slo_sno4_flg);
	}

	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public void slo_sno4_flg(boolean value) {
		setConstBoolean(offset + 18, $slo_sno4_flg, value);
	}


	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public String comp_spec_typ() {
		return getConstString(offset + 19, $comp_spec_typ);
	}

	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public void comp_spec_typ(String value) {
		setConstString(offset + 19, $comp_spec_typ, value);
	}


	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public String comp_spec_typ_nm() {
		return getConstString(offset + 20, $comp_spec_typ_nm);
	}

	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public void comp_spec_typ_nm(String value) {
		setConstString(offset + 20, $comp_spec_typ_nm, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 21, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 21, $stk_mng_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 22, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 22, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 23, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 23, $asset_mng_typ_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 24, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 24, $sundry_itm_flg, value);
	}


	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 25, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 25, $iv_itm_nm, value);
	}


	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 26, $cntry_org_cd);
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 26, $cntry_org_cd, value);
	}


	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public String cntry_org_nm() {
		return getConstString(offset + 27, $cntry_org_nm);
	}

	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public void cntry_org_nm(String value) {
		setConstString(offset + 27, $cntry_org_nm, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 28, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 28, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 29, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 29, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 30, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 30, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 30, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 30, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 30, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 30, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 31, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 31, $trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 32, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 32, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 32, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 32, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 32, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 32, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 33, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 33, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 33, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 33, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 33, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 33, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 34, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 34, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 34, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 34, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 34, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 34, $trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 35, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 35, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 36, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 36, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 37, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 37, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 37, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 37, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 37, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 37, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 38, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 38, $base_unit_rnd_typ, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 39, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 39, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 39, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 39, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 39, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 39, $base_unit_qty, value);
	}


	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 40, $interim_flg);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 40, $interim_flg, value);
	}


	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public MCNumber trd_cur_std_sls_upri() {
		return getConstNumber(offset + 41, $trd_cur_std_sls_upri);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(MCNumber value) {
		setConstNumber(offset + 41, $trd_cur_std_sls_upri, value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(int value) {
		setConstNumber(offset + 41, $trd_cur_std_sls_upri, value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(long value) {
		setConstNumber(offset + 41, $trd_cur_std_sls_upri, value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(float value) {
		setConstNumber(offset + 41, $trd_cur_std_sls_upri, value);
	}

	/**
	 * Standard sales unit price (Transaction currency) 取引通貨標準販売単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(double value) {
		setConstNumber(offset + 41, $trd_cur_std_sls_upri, value);
	}


	/**
	 * Standard sales amount (Transaction currency) 取引通貨標準販売金額.<p>
	 *
	 */
	public MCNumber trd_cur_std_sls_amt() {
		return getConstNumber(offset + 42, $trd_cur_std_sls_amt);
	}

	/**
	 * Standard sales amount (Transaction currency) 取引通貨標準販売金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(MCNumber value) {
		setConstNumber(offset + 42, $trd_cur_std_sls_amt, value);
	}

	/**
	 * Standard sales amount (Transaction currency) 取引通貨標準販売金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(int value) {
		setConstNumber(offset + 42, $trd_cur_std_sls_amt, value);
	}

	/**
	 * Standard sales amount (Transaction currency) 取引通貨標準販売金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(long value) {
		setConstNumber(offset + 42, $trd_cur_std_sls_amt, value);
	}

	/**
	 * Standard sales amount (Transaction currency) 取引通貨標準販売金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(float value) {
		setConstNumber(offset + 42, $trd_cur_std_sls_amt, value);
	}

	/**
	 * Standard sales amount (Transaction currency) 取引通貨標準販売金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(double value) {
		setConstNumber(offset + 42, $trd_cur_std_sls_amt, value);
	}


	/**
	 * Standard tax included sales amount (Transaction currency) 取引通貨標準販売税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_std_sls_inc_tax_amt() {
		return getConstNumber(offset + 43, $trd_cur_std_sls_inc_tax_amt);
	}

	/**
	 * Standard tax included sales amount (Transaction currency) 取引通貨標準販売税込金額.<p>
	 *
	 */
	public void trd_cur_std_sls_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 43, $trd_cur_std_sls_inc_tax_amt, value);
	}

	/**
	 * Standard tax included sales amount (Transaction currency) 取引通貨標準販売税込金額.<p>
	 *
	 */
	public void trd_cur_std_sls_inc_tax_amt(int value) {
		setConstNumber(offset + 43, $trd_cur_std_sls_inc_tax_amt, value);
	}

	/**
	 * Standard tax included sales amount (Transaction currency) 取引通貨標準販売税込金額.<p>
	 *
	 */
	public void trd_cur_std_sls_inc_tax_amt(long value) {
		setConstNumber(offset + 43, $trd_cur_std_sls_inc_tax_amt, value);
	}

	/**
	 * Standard tax included sales amount (Transaction currency) 取引通貨標準販売税込金額.<p>
	 *
	 */
	public void trd_cur_std_sls_inc_tax_amt(float value) {
		setConstNumber(offset + 43, $trd_cur_std_sls_inc_tax_amt, value);
	}

	/**
	 * Standard tax included sales amount (Transaction currency) 取引通貨標準販売税込金額.<p>
	 *
	 */
	public void trd_cur_std_sls_inc_tax_amt(double value) {
		setConstNumber(offset + 43, $trd_cur_std_sls_inc_tax_amt, value);
	}


	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public MCNumber upri_rate() {
		return getConstNumber(offset + 44, $upri_rate);
	}

	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public void upri_rate(MCNumber value) {
		setConstNumber(offset + 44, $upri_rate, value);
	}

	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public void upri_rate(int value) {
		setConstNumber(offset + 44, $upri_rate, value);
	}

	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public void upri_rate(long value) {
		setConstNumber(offset + 44, $upri_rate, value);
	}

	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public void upri_rate(float value) {
		setConstNumber(offset + 44, $upri_rate, value);
	}

	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public void upri_rate(double value) {
		setConstNumber(offset + 44, $upri_rate, value);
	}


	/**
	 * Discount unit price (Transaction currency) 取引通貨仕切単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 45, $trd_cur_upri);
	}

	/**
	 * Discount unit price (Transaction currency) 取引通貨仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 45, $trd_cur_upri, value);
	}

	/**
	 * Discount unit price (Transaction currency) 取引通貨仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 45, $trd_cur_upri, value);
	}

	/**
	 * Discount unit price (Transaction currency) 取引通貨仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 45, $trd_cur_upri, value);
	}

	/**
	 * Discount unit price (Transaction currency) 取引通貨仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 45, $trd_cur_upri, value);
	}

	/**
	 * Discount unit price (Transaction currency) 取引通貨仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 45, $trd_cur_upri, value);
	}


	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return getConstBoolean(offset + 46, $upri_not_tgt_flg);
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		setConstBoolean(offset + 46, $upri_not_tgt_flg, value);
	}


	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 47, $trd_cur_amt);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 47, $trd_cur_amt, value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 47, $trd_cur_amt, value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 47, $trd_cur_amt, value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 47, $trd_cur_amt, value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 47, $trd_cur_amt, value);
	}


	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 48, $trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 48, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 48, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 48, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 48, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 48, $trd_cur_inc_tax_amt, value);
	}


	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 49, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 49, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 49, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 49, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 49, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 49, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 50, $dscnt_rsn_cd);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 50, $dscnt_rsn_cd, value);
	}


	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public String dscnt_rsn_nm() {
		return getConstString(offset + 51, $dscnt_rsn_nm);
	}

	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public void dscnt_rsn_nm(String value) {
		setConstString(offset + 51, $dscnt_rsn_nm, value);
	}


	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return getConstBoolean(offset + 52, $tax_fix_flg);
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		setConstBoolean(offset + 52, $tax_fix_flg, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 53, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 53, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 54, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 54, $tax_nm, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 55, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 55, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 55, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 55, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 55, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 55, $tax_rate, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 56, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 56, $inc_tax_flg, value);
	}


	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public MCNumber cost_upri() {
		return getConstNumber(offset + 57, $cost_upri);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(MCNumber value) {
		setConstNumber(offset + 57, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(int value) {
		setConstNumber(offset + 57, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(long value) {
		setConstNumber(offset + 57, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(float value) {
		setConstNumber(offset + 57, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(double value) {
		setConstNumber(offset + 57, $cost_upri, value);
	}


	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public MCNumber cost_amt() {
		return getConstNumber(offset + 58, $cost_amt);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(MCNumber value) {
		setConstNumber(offset + 58, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(int value) {
		setConstNumber(offset + 58, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(long value) {
		setConstNumber(offset + 58, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(float value) {
		setConstNumber(offset + 58, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(double value) {
		setConstNumber(offset + 58, $cost_amt, value);
	}


	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCNumber prof_rate() {
		return getConstNumber(offset + 59, $prof_rate);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(MCNumber value) {
		setConstNumber(offset + 59, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(int value) {
		setConstNumber(offset + 59, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(long value) {
		setConstNumber(offset + 59, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(float value) {
		setConstNumber(offset + 59, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(double value) {
		setConstNumber(offset + 59, $prof_rate, value);
	}


	/**
	 * Standard sales tax (Transaction currency) 取引通貨標準販売税額.<p>
	 *
	 */
	public MCNumber trd_cur_std_sls_tax_amt() {
		return getConstNumber(offset + 60, $trd_cur_std_sls_tax_amt);
	}

	/**
	 * Standard sales tax (Transaction currency) 取引通貨標準販売税額.<p>
	 *
	 */
	public void trd_cur_std_sls_tax_amt(MCNumber value) {
		setConstNumber(offset + 60, $trd_cur_std_sls_tax_amt, value);
	}

	/**
	 * Standard sales tax (Transaction currency) 取引通貨標準販売税額.<p>
	 *
	 */
	public void trd_cur_std_sls_tax_amt(int value) {
		setConstNumber(offset + 60, $trd_cur_std_sls_tax_amt, value);
	}

	/**
	 * Standard sales tax (Transaction currency) 取引通貨標準販売税額.<p>
	 *
	 */
	public void trd_cur_std_sls_tax_amt(long value) {
		setConstNumber(offset + 60, $trd_cur_std_sls_tax_amt, value);
	}

	/**
	 * Standard sales tax (Transaction currency) 取引通貨標準販売税額.<p>
	 *
	 */
	public void trd_cur_std_sls_tax_amt(float value) {
		setConstNumber(offset + 60, $trd_cur_std_sls_tax_amt, value);
	}

	/**
	 * Standard sales tax (Transaction currency) 取引通貨標準販売税額.<p>
	 *
	 */
	public void trd_cur_std_sls_tax_amt(double value) {
		setConstNumber(offset + 60, $trd_cur_std_sls_tax_amt, value);
	}


	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 61, $trd_cur_tax_amt);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 61, $trd_cur_tax_amt, value);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 61, $trd_cur_tax_amt, value);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 61, $trd_cur_tax_amt, value);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 61, $trd_cur_tax_amt, value);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 61, $trd_cur_tax_amt, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 62, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 62, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 63, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 63, $gd_nm, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 64, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 64, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 65, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 65, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 66, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 66, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 67, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 67, $sno4, value);
	}


	/**
	 * Standard sales unit price (Base currency) 基準通貨標準販売単価.<p>
	 *
	 */
	public MCNumber base_cur_std_sls_upri() {
		return getConstNumber(offset + 68, $base_cur_std_sls_upri);
	}

	/**
	 * Standard sales unit price (Base currency) 基準通貨標準販売単価.<p>
	 *
	 */
	public void base_cur_std_sls_upri(MCNumber value) {
		setConstNumber(offset + 68, $base_cur_std_sls_upri, value);
	}

	/**
	 * Standard sales unit price (Base currency) 基準通貨標準販売単価.<p>
	 *
	 */
	public void base_cur_std_sls_upri(int value) {
		setConstNumber(offset + 68, $base_cur_std_sls_upri, value);
	}

	/**
	 * Standard sales unit price (Base currency) 基準通貨標準販売単価.<p>
	 *
	 */
	public void base_cur_std_sls_upri(long value) {
		setConstNumber(offset + 68, $base_cur_std_sls_upri, value);
	}

	/**
	 * Standard sales unit price (Base currency) 基準通貨標準販売単価.<p>
	 *
	 */
	public void base_cur_std_sls_upri(float value) {
		setConstNumber(offset + 68, $base_cur_std_sls_upri, value);
	}

	/**
	 * Standard sales unit price (Base currency) 基準通貨標準販売単価.<p>
	 *
	 */
	public void base_cur_std_sls_upri(double value) {
		setConstNumber(offset + 68, $base_cur_std_sls_upri, value);
	}


	/**
	 * Standard sales amount (Base currency) 基準通貨標準販売金額.<p>
	 *
	 */
	public MCNumber base_cur_std_sls_amt() {
		return getConstNumber(offset + 69, $base_cur_std_sls_amt);
	}

	/**
	 * Standard sales amount (Base currency) 基準通貨標準販売金額.<p>
	 *
	 */
	public void base_cur_std_sls_amt(MCNumber value) {
		setConstNumber(offset + 69, $base_cur_std_sls_amt, value);
	}

	/**
	 * Standard sales amount (Base currency) 基準通貨標準販売金額.<p>
	 *
	 */
	public void base_cur_std_sls_amt(int value) {
		setConstNumber(offset + 69, $base_cur_std_sls_amt, value);
	}

	/**
	 * Standard sales amount (Base currency) 基準通貨標準販売金額.<p>
	 *
	 */
	public void base_cur_std_sls_amt(long value) {
		setConstNumber(offset + 69, $base_cur_std_sls_amt, value);
	}

	/**
	 * Standard sales amount (Base currency) 基準通貨標準販売金額.<p>
	 *
	 */
	public void base_cur_std_sls_amt(float value) {
		setConstNumber(offset + 69, $base_cur_std_sls_amt, value);
	}

	/**
	 * Standard sales amount (Base currency) 基準通貨標準販売金額.<p>
	 *
	 */
	public void base_cur_std_sls_amt(double value) {
		setConstNumber(offset + 69, $base_cur_std_sls_amt, value);
	}


	/**
	 * Standard tax included sales amount (Base currency) 基準通貨標準販売税込金額.<p>
	 *
	 */
	public MCNumber base_cur_std_sls_inc_tax_amt() {
		return getConstNumber(offset + 70, $base_cur_std_sls_inc_tax_amt);
	}

	/**
	 * Standard tax included sales amount (Base currency) 基準通貨標準販売税込金額.<p>
	 *
	 */
	public void base_cur_std_sls_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 70, $base_cur_std_sls_inc_tax_amt, value);
	}

	/**
	 * Standard tax included sales amount (Base currency) 基準通貨標準販売税込金額.<p>
	 *
	 */
	public void base_cur_std_sls_inc_tax_amt(int value) {
		setConstNumber(offset + 70, $base_cur_std_sls_inc_tax_amt, value);
	}

	/**
	 * Standard tax included sales amount (Base currency) 基準通貨標準販売税込金額.<p>
	 *
	 */
	public void base_cur_std_sls_inc_tax_amt(long value) {
		setConstNumber(offset + 70, $base_cur_std_sls_inc_tax_amt, value);
	}

	/**
	 * Standard tax included sales amount (Base currency) 基準通貨標準販売税込金額.<p>
	 *
	 */
	public void base_cur_std_sls_inc_tax_amt(float value) {
		setConstNumber(offset + 70, $base_cur_std_sls_inc_tax_amt, value);
	}

	/**
	 * Standard tax included sales amount (Base currency) 基準通貨標準販売税込金額.<p>
	 *
	 */
	public void base_cur_std_sls_inc_tax_amt(double value) {
		setConstNumber(offset + 70, $base_cur_std_sls_inc_tax_amt, value);
	}


	/**
	 * Standard sales tax amount (Base currency) 基準通貨標準販売税額.<p>
	 *
	 */
	public MCNumber base_cur_std_sls_tax_amt() {
		return getConstNumber(offset + 71, $base_cur_std_sls_tax_amt);
	}

	/**
	 * Standard sales tax amount (Base currency) 基準通貨標準販売税額.<p>
	 *
	 */
	public void base_cur_std_sls_tax_amt(MCNumber value) {
		setConstNumber(offset + 71, $base_cur_std_sls_tax_amt, value);
	}

	/**
	 * Standard sales tax amount (Base currency) 基準通貨標準販売税額.<p>
	 *
	 */
	public void base_cur_std_sls_tax_amt(int value) {
		setConstNumber(offset + 71, $base_cur_std_sls_tax_amt, value);
	}

	/**
	 * Standard sales tax amount (Base currency) 基準通貨標準販売税額.<p>
	 *
	 */
	public void base_cur_std_sls_tax_amt(long value) {
		setConstNumber(offset + 71, $base_cur_std_sls_tax_amt, value);
	}

	/**
	 * Standard sales tax amount (Base currency) 基準通貨標準販売税額.<p>
	 *
	 */
	public void base_cur_std_sls_tax_amt(float value) {
		setConstNumber(offset + 71, $base_cur_std_sls_tax_amt, value);
	}

	/**
	 * Standard sales tax amount (Base currency) 基準通貨標準販売税額.<p>
	 *
	 */
	public void base_cur_std_sls_tax_amt(double value) {
		setConstNumber(offset + 71, $base_cur_std_sls_tax_amt, value);
	}


	/**
	 * Discount unit price (Base currency) 基準通貨仕切単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 72, $base_cur_upri);
	}

	/**
	 * Discount unit price (Base currency) 基準通貨仕切単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 72, $base_cur_upri, value);
	}

	/**
	 * Discount unit price (Base currency) 基準通貨仕切単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 72, $base_cur_upri, value);
	}

	/**
	 * Discount unit price (Base currency) 基準通貨仕切単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 72, $base_cur_upri, value);
	}

	/**
	 * Discount unit price (Base currency) 基準通貨仕切単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 72, $base_cur_upri, value);
	}

	/**
	 * Discount unit price (Base currency) 基準通貨仕切単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 72, $base_cur_upri, value);
	}


	/**
	 * Discount amount (Base currency) 基準通貨仕切金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 73, $base_cur_amt);
	}

	/**
	 * Discount amount (Base currency) 基準通貨仕切金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 73, $base_cur_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨仕切金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 73, $base_cur_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨仕切金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 73, $base_cur_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨仕切金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 73, $base_cur_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨仕切金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 73, $base_cur_amt, value);
	}


	/**
	 * Tax included discount amount (Base currency) 基準通貨仕切税込金額.<p>
	 *
	 */
	public MCNumber base_cur_inc_tax_amt() {
		return getConstNumber(offset + 74, $base_cur_inc_tax_amt);
	}

	/**
	 * Tax included discount amount (Base currency) 基準通貨仕切税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 74, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included discount amount (Base currency) 基準通貨仕切税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 74, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included discount amount (Base currency) 基準通貨仕切税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 74, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included discount amount (Base currency) 基準通貨仕切税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 74, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included discount amount (Base currency) 基準通貨仕切税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 74, $base_cur_inc_tax_amt, value);
	}


	/**
	 * Discount tax amount (Base currency) 基準通貨仕切税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 75, $base_cur_tax_amt);
	}

	/**
	 * Discount tax amount (Base currency) 基準通貨仕切税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 75, $base_cur_tax_amt, value);
	}

	/**
	 * Discount tax amount (Base currency) 基準通貨仕切税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 75, $base_cur_tax_amt, value);
	}

	/**
	 * Discount tax amount (Base currency) 基準通貨仕切税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 75, $base_cur_tax_amt, value);
	}

	/**
	 * Discount tax amount (Base currency) 基準通貨仕切税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 75, $base_cur_tax_amt, value);
	}

	/**
	 * Discount tax amount (Base currency) 基準通貨仕切税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 75, $base_cur_tax_amt, value);
	}


	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCNumber set_itm_grp_no() {
		return getConstNumber(offset + 76, $set_itm_grp_no);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(MCNumber value) {
		setConstNumber(offset + 76, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(int value) {
		setConstNumber(offset + 76, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(long value) {
		setConstNumber(offset + 76, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(float value) {
		setConstNumber(offset + 76, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(double value) {
		setConstNumber(offset + 76, $set_itm_grp_no, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 77, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 77, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 78, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 78, $cst_itm_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 79, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 79, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 80, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 80, $dlv_nm, value);
	}


	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 81, $dlv_zip_cd);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 81, $dlv_zip_cd, value);
	}


	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 82, $dlv_addr1);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 82, $dlv_addr1, value);
	}


	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 83, $dlv_addr2);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 83, $dlv_addr2, value);
	}


	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 84, $dlv_addr3);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 84, $dlv_addr3, value);
	}


	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 85, $dlv_addr4);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 85, $dlv_addr4, value);
	}


	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 86, $dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 86, $dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 87, $dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 87, $dlv_cntct_psn, value);
	}


	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 88, $dlv_tel);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 88, $dlv_tel, value);
	}


	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 89, $dlv_fax);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 89, $dlv_fax, value);
	}


	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 90, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 90, $dlv_sundry_flg, value);
	}


	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 91, $cntry_cd);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 91, $cntry_cd, value);
	}


	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 92, $cntry_nm);
	}

	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 92, $cntry_nm, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 93, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 93, $prnt_lcl_cd, value);
	}


	/**
	 * Distribution channel 1 cd. 仕向先１ＣＤ.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 94, $dest_cd1);
	}

	/**
	 * Distribution channel 1 cd. 仕向先１ＣＤ.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 94, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 95, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 95, $dest_nm1, value);
	}


	/**
	 * Distribution channel 2 cd. 仕向先２ＣＤ.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 96, $dest_cd2);
	}

	/**
	 * Distribution channel 2 cd. 仕向先２ＣＤ.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 96, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 97, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 97, $dest_nm2, value);
	}


	/**
	 * Distribution channel 3 cd. 仕向先３ＣＤ.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 98, $dest_cd3);
	}

	/**
	 * Distribution channel 3 cd. 仕向先３ＣＤ.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 98, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 99, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 99, $dest_nm3, value);
	}


	/**
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public String qtn_d_rmrks() {
		return getConstString(offset + 100, $qtn_d_rmrks);
	}

	/**
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public void qtn_d_rmrks(String value) {
		setConstString(offset + 100, $qtn_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 101, $intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 101, $intr_rmrks, value);
	}


	/**
	 * Configuration rev. number 構成改訂番号.<p>
	 *
	 */
	public String itm_comp_rev_no() {
		return getConstString(offset + 102, $itm_comp_rev_no);
	}

	/**
	 * Configuration rev. number 構成改訂番号.<p>
	 *
	 */
	public void itm_comp_rev_no(String value) {
		setConstString(offset + 102, $itm_comp_rev_no, value);
	}


	/**
	 * Item undefined 品目未定義.<p>
	 *
	 */
	public boolean no_itm_cd_flg() {
		return getConstBoolean(offset + 103, $no_itm_cd_flg);
	}

	/**
	 * Item undefined 品目未定義.<p>
	 *
	 */
	public void no_itm_cd_flg(boolean value) {
		setConstBoolean(offset + 103, $no_itm_cd_flg, value);
	}


	/**
	 * Configuration release 構成リリース.<p>
	 *
	 */
	public boolean comp_rel_flg() {
		return getConstBoolean(offset + 104, $comp_rel_flg);
	}

	/**
	 * Configuration release 構成リリース.<p>
	 *
	 */
	public void comp_rel_flg(boolean value) {
		setConstBoolean(offset + 104, $comp_rel_flg, value);
	}


	/**
	 * Specification exists 仕様有.<p>
	 *
	 */
	public boolean spec_flg() {
		return getConstBoolean(offset + 105, $spec_flg);
	}

	/**
	 * Specification exists 仕様有.<p>
	 *
	 */
	public void spec_flg(boolean value) {
		setConstBoolean(offset + 105, $spec_flg, value);
	}


	/**
	 * Specification remarks 仕様備考.<p>
	 *
	 */
	public String spec_sub_char1() {
		return getConstString(offset + 106, $spec_sub_char1);
	}

	/**
	 * Specification remarks 仕様備考.<p>
	 *
	 */
	public void spec_sub_char1(String value) {
		setConstString(offset + 106, $spec_sub_char1, value);
	}


	/**
	 * Specification spare 1 仕様予備１.<p>
	 *
	 */
	public String spec_sub_char2() {
		return getConstString(offset + 107, $spec_sub_char2);
	}

	/**
	 * Specification spare 1 仕様予備１.<p>
	 *
	 */
	public void spec_sub_char2(String value) {
		setConstString(offset + 107, $spec_sub_char2, value);
	}


	/**
	 * Specification spare 2 仕様予備２.<p>
	 *
	 */
	public String spec_sub_char3() {
		return getConstString(offset + 108, $spec_sub_char3);
	}

	/**
	 * Specification spare 2 仕様予備２.<p>
	 *
	 */
	public void spec_sub_char3(String value) {
		setConstString(offset + 108, $spec_sub_char3, value);
	}


	/**
	 * Specification spare 3 仕様予備３.<p>
	 *
	 */
	public String spec_sub_char4() {
		return getConstString(offset + 109, $spec_sub_char4);
	}

	/**
	 * Specification spare 3 仕様予備３.<p>
	 *
	 */
	public void spec_sub_char4(String value) {
		setConstString(offset + 109, $spec_sub_char4, value);
	}


	/**
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public String qtn_d_rslt_rsn_cd() {
		return getConstString(offset + 110, $qtn_d_rslt_rsn_cd);
	}

	/**
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public void qtn_d_rslt_rsn_cd(String value) {
		setConstString(offset + 110, $qtn_d_rslt_rsn_cd, value);
	}


	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public String qtn_d_rslt_rsn_nm() {
		return getConstString(offset + 111, $qtn_d_rslt_rsn_nm);
	}

	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public void qtn_d_rslt_rsn_nm(String value) {
		setConstString(offset + 111, $qtn_d_rslt_rsn_nm, value);
	}


	/**
	 * Quotation details result reason remarks 見積明細結果理由備考.<p>
	 *
	 */
	public String qtn_d_rslt_rsn_rmrks() {
		return getConstString(offset + 112, $qtn_d_rslt_rsn_rmrks);
	}

	/**
	 * Quotation details result reason remarks 見積明細結果理由備考.<p>
	 *
	 */
	public void qtn_d_rslt_rsn_rmrks(String value) {
		setConstString(offset + 112, $qtn_d_rslt_rsn_rmrks, value);
	}


	/**
	 * Copy qty. 引継数量.<p>
	 *
	 */
	public MCNumber trnst_qty() {
		return getConstNumber(offset + 113, $trnst_qty);
	}

	/**
	 * Copy qty. 引継数量.<p>
	 *
	 */
	public void trnst_qty(MCNumber value) {
		setConstNumber(offset + 113, $trnst_qty, value);
	}

	/**
	 * Copy qty. 引継数量.<p>
	 *
	 */
	public void trnst_qty(int value) {
		setConstNumber(offset + 113, $trnst_qty, value);
	}

	/**
	 * Copy qty. 引継数量.<p>
	 *
	 */
	public void trnst_qty(long value) {
		setConstNumber(offset + 113, $trnst_qty, value);
	}

	/**
	 * Copy qty. 引継数量.<p>
	 *
	 */
	public void trnst_qty(float value) {
		setConstNumber(offset + 113, $trnst_qty, value);
	}

	/**
	 * Copy qty. 引継数量.<p>
	 *
	 */
	public void trnst_qty(double value) {
		setConstNumber(offset + 113, $trnst_qty, value);
	}


	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public String cst_qtn_rqst_d_no() {
		return getConstString(offset + 114, $cst_qtn_rqst_d_no);
	}

	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public void cst_qtn_rqst_d_no(String value) {
		setConstString(offset + 114, $cst_qtn_rqst_d_no, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 115, $sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 115, $sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 116, $sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 116, $sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 117, $sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 117, $sub_char3, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 118, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 118, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 118, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 118, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 118, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 118, $disp_seq, value);
	}


	public String getString(String name) {
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
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
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			return comp_spec_typ_nm();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
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
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			return qtn_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			return itm_comp_rev_no();
		}
		if ($spec_sub_char1.equalsIgnoreCase(name)) {
			return spec_sub_char1();
		}
		if ($spec_sub_char2.equalsIgnoreCase(name)) {
			return spec_sub_char2();
		}
		if ($spec_sub_char3.equalsIgnoreCase(name)) {
			return spec_sub_char3();
		}
		if ($spec_sub_char4.equalsIgnoreCase(name)) {
			return spec_sub_char4();
		}
		if ($qtn_d_rslt_rsn_cd.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_cd();
		}
		if ($qtn_d_rslt_rsn_nm.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_nm();
		}
		if ($qtn_d_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_rmrks();
		}
		if ($cst_qtn_rqst_d_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_d_no();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_upri();
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_amt();
		}
		if ($trd_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_inc_tax_amt();
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			return upri_rate();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($trd_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_tax_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($base_cur_std_sls_upri.equalsIgnoreCase(name)) {
			return base_cur_std_sls_upri();
		}
		if ($base_cur_std_sls_amt.equalsIgnoreCase(name)) {
			return base_cur_std_sls_amt();
		}
		if ($base_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_std_sls_inc_tax_amt();
		}
		if ($base_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_std_sls_tax_amt();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($trnst_qty.equalsIgnoreCase(name)) {
			return trnst_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			return slo_sno1_flg();
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			return slo_sno2_flg();
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			return slo_sno3_flg();
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			return slo_sno4_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($no_itm_cd_flg.equalsIgnoreCase(name)) {
			return no_itm_cd_flg();
		}
		if ($comp_rel_flg.equalsIgnoreCase(name)) {
			return comp_rel_flg();
		}
		if ($spec_flg.equalsIgnoreCase(name)) {
			return spec_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
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
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			return comp_spec_typ_nm();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
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
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			return qtn_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			return itm_comp_rev_no();
		}
		if ($spec_sub_char1.equalsIgnoreCase(name)) {
			return spec_sub_char1();
		}
		if ($spec_sub_char2.equalsIgnoreCase(name)) {
			return spec_sub_char2();
		}
		if ($spec_sub_char3.equalsIgnoreCase(name)) {
			return spec_sub_char3();
		}
		if ($spec_sub_char4.equalsIgnoreCase(name)) {
			return spec_sub_char4();
		}
		if ($qtn_d_rslt_rsn_cd.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_cd();
		}
		if ($qtn_d_rslt_rsn_nm.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_nm();
		}
		if ($qtn_d_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_rmrks();
		}
		if ($cst_qtn_rqst_d_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_d_no();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_upri();
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_amt();
		}
		if ($trd_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_inc_tax_amt();
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			return upri_rate();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($trd_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_tax_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($base_cur_std_sls_upri.equalsIgnoreCase(name)) {
			return base_cur_std_sls_upri();
		}
		if ($base_cur_std_sls_amt.equalsIgnoreCase(name)) {
			return base_cur_std_sls_amt();
		}
		if ($base_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_std_sls_inc_tax_amt();
		}
		if ($base_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_std_sls_tax_amt();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($trnst_qty.equalsIgnoreCase(name)) {
			return trnst_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			return slo_sno1_flg();
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			return slo_sno2_flg();
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			return slo_sno3_flg();
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			return slo_sno4_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($no_itm_cd_flg.equalsIgnoreCase(name)) {
			return no_itm_cd_flg();
		}
		if ($comp_rel_flg.equalsIgnoreCase(name)) {
			return comp_rel_flg();
		}
		if ($spec_flg.equalsIgnoreCase(name)) {
			return spec_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
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
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
			return;
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			comp_spec_typ_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
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
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
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
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			qtn_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			itm_comp_rev_no(value);
			return;
		}
		if ($spec_sub_char1.equalsIgnoreCase(name)) {
			spec_sub_char1(value);
			return;
		}
		if ($spec_sub_char2.equalsIgnoreCase(name)) {
			spec_sub_char2(value);
			return;
		}
		if ($spec_sub_char3.equalsIgnoreCase(name)) {
			spec_sub_char3(value);
			return;
		}
		if ($spec_sub_char4.equalsIgnoreCase(name)) {
			spec_sub_char4(value);
			return;
		}
		if ($qtn_d_rslt_rsn_cd.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_cd(value);
			return;
		}
		if ($qtn_d_rslt_rsn_nm.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_nm(value);
			return;
		}
		if ($qtn_d_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_rmrks(value);
			return;
		}
		if ($cst_qtn_rqst_d_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_d_no(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($trd_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_upri.equalsIgnoreCase(name)) {
			base_cur_std_sls_upri(value);
			return;
		}
		if ($base_cur_std_sls_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_amt(value);
			return;
		}
		if ($base_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trnst_qty.equalsIgnoreCase(name)) {
			trnst_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($trd_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_upri.equalsIgnoreCase(name)) {
			base_cur_std_sls_upri(value);
			return;
		}
		if ($base_cur_std_sls_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_amt(value);
			return;
		}
		if ($base_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trnst_qty.equalsIgnoreCase(name)) {
			trnst_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($trd_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_upri.equalsIgnoreCase(name)) {
			base_cur_std_sls_upri(value);
			return;
		}
		if ($base_cur_std_sls_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_amt(value);
			return;
		}
		if ($base_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trnst_qty.equalsIgnoreCase(name)) {
			trnst_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($trd_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_upri.equalsIgnoreCase(name)) {
			base_cur_std_sls_upri(value);
			return;
		}
		if ($base_cur_std_sls_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_amt(value);
			return;
		}
		if ($base_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trnst_qty.equalsIgnoreCase(name)) {
			trnst_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($trd_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_upri.equalsIgnoreCase(name)) {
			base_cur_std_sls_upri(value);
			return;
		}
		if ($base_cur_std_sls_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_amt(value);
			return;
		}
		if ($base_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trnst_qty.equalsIgnoreCase(name)) {
			trnst_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			slo_sno1_flg(value);
			return;
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			slo_sno2_flg(value);
			return;
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			slo_sno3_flg(value);
			return;
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			slo_sno4_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($no_itm_cd_flg.equalsIgnoreCase(name)) {
			no_itm_cd_flg(value);
			return;
		}
		if ($comp_rel_flg.equalsIgnoreCase(name)) {
			comp_rel_flg(value);
			return;
		}
		if ($spec_flg.equalsIgnoreCase(name)) {
			spec_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
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
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
			return;
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			comp_spec_typ_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
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
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
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
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			qtn_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			itm_comp_rev_no(value);
			return;
		}
		if ($spec_sub_char1.equalsIgnoreCase(name)) {
			spec_sub_char1(value);
			return;
		}
		if ($spec_sub_char2.equalsIgnoreCase(name)) {
			spec_sub_char2(value);
			return;
		}
		if ($spec_sub_char3.equalsIgnoreCase(name)) {
			spec_sub_char3(value);
			return;
		}
		if ($spec_sub_char4.equalsIgnoreCase(name)) {
			spec_sub_char4(value);
			return;
		}
		if ($qtn_d_rslt_rsn_cd.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_cd(value);
			return;
		}
		if ($qtn_d_rslt_rsn_nm.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_nm(value);
			return;
		}
		if ($qtn_d_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_rmrks(value);
			return;
		}
		if ($cst_qtn_rqst_d_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_d_no(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($trd_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_upri.equalsIgnoreCase(name)) {
			base_cur_std_sls_upri(value);
			return;
		}
		if ($base_cur_std_sls_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_amt(value);
			return;
		}
		if ($base_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trnst_qty.equalsIgnoreCase(name)) {
			trnst_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($trd_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_upri.equalsIgnoreCase(name)) {
			base_cur_std_sls_upri(value);
			return;
		}
		if ($base_cur_std_sls_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_amt(value);
			return;
		}
		if ($base_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trnst_qty.equalsIgnoreCase(name)) {
			trnst_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($trd_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_upri.equalsIgnoreCase(name)) {
			base_cur_std_sls_upri(value);
			return;
		}
		if ($base_cur_std_sls_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_amt(value);
			return;
		}
		if ($base_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trnst_qty.equalsIgnoreCase(name)) {
			trnst_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($trd_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_upri.equalsIgnoreCase(name)) {
			base_cur_std_sls_upri(value);
			return;
		}
		if ($base_cur_std_sls_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_amt(value);
			return;
		}
		if ($base_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trnst_qty.equalsIgnoreCase(name)) {
			trnst_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($trd_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_upri.equalsIgnoreCase(name)) {
			base_cur_std_sls_upri(value);
			return;
		}
		if ($base_cur_std_sls_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_amt(value);
			return;
		}
		if ($base_cur_std_sls_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_inc_tax_amt(value);
			return;
		}
		if ($base_cur_std_sls_tax_amt.equalsIgnoreCase(name)) {
			base_cur_std_sls_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trnst_qty.equalsIgnoreCase(name)) {
			trnst_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			slo_sno1_flg(value);
			return;
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			slo_sno2_flg(value);
			return;
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			slo_sno3_flg(value);
			return;
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			slo_sno4_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($no_itm_cd_flg.equalsIgnoreCase(name)) {
			no_itm_cd_flg(value);
			return;
		}
		if ($comp_rel_flg.equalsIgnoreCase(name)) {
			comp_rel_flg(value);
			return;
		}
		if ($spec_flg.equalsIgnoreCase(name)) {
			spec_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

