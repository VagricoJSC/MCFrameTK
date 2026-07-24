package mcframe.serverMSBG.MSBGL5040;

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
 * ブロック"Bill_Prnt01_DtlBase"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Bill_Prnt01_DtlBaseR_MC_A extends MCConstRow {

	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public static final String $dlv_dt = "dlv_dt";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public static final String $base_sls_ac_dt = "base_sls_ac_dt";
	/**
	 * Date for sorting ソート用日付.<p>
	 *
	 */
	public static final String $sort_dlv_dt = "sort_dlv_dt";
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
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_no = "ship_dlv_slip_no";
	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_d_no = "ship_dlv_slip_d_no";
	/**
	 * Multiple delivery note details at shipping flg. 出荷時納品書明細複数ＦＬＧ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_multi_flg = "ship_dlv_slip_multi_flg";
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
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
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	/**
	 * Discount item flg. 値引品目ＦＬＧ.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
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
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public static final String $trd_cur_amt1 = "trd_cur_amt1";
	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public static final String $trd_cur_amt2 = "trd_cur_amt2";
	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public static final String $trd_cur_amt3 = "trd_cur_amt3";
	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Tax amount (Transaction currency) 1 取引通貨税額１.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt1 = "trd_cur_tax_amt1";
	/**
	 * Tax amount (Transaction currency) 2 取引通貨税額２.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt2 = "trd_cur_tax_amt2";
	/**
	 * Tax amount (Transaction currency) 3 取引通貨税額３.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt3 = "trd_cur_tax_amt3";
	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public static final String $base_cur_tax_amt1 = "base_cur_tax_amt1";
	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public static final String $base_cur_tax_amt2 = "base_cur_tax_amt2";
	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public static final String $base_cur_tax_amt3 = "base_cur_tax_amt3";
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
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Details remarks 明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public static final String $bill_d_rmrks = "bill_d_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $d_sub_char1 = "d_sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $d_sub_char2 = "d_sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $d_sub_char3 = "d_sub_char3";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public static final String $ar_trd_grp_typ = "ar_trd_grp_typ";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public static final String $bill_d_typ = "bill_d_typ";
	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public static final String $act_no = "act_no";
	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public static final String $act_seq = "act_seq";
	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public static final String $act_rev = "act_rev";
	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public static final String $act_d_no = "act_d_no";
	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public static final String $act_d_seq = "act_d_seq";
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
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination cd. name 納品先ＣＤ名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Parent result No. 親実績ＮＯ.<p>
	 *
	 */
	public static final String $par_act_no = "par_act_no";
	/**
	 * Billing No. by AR customer 売掛別請求ＮＯ.<p>
	 *
	 */
	public static final String $bill_acst_no = "bill_acst_no";
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public static final String $rcv_nm = "rcv_nm";
	/**
	 * Billing method type 請求方式区分.<p>
	 *
	 */
	public static final String $bill_mtd_typ = "bill_mtd_typ";
	/**
	 * Amount total (partial billing) 金額総計(一部請求).<p>
	 *
	 */
	public static final String $part_bill_ttl_amt = "part_bill_ttl_amt";
	/**
	 * Carry-over billing amount (partial invoice) 繰越請求金額(一部請求).<p>
	 *
	 */
	public static final String $part_bill_crryovr_amt = "part_bill_crryovr_amt";
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
	public static final String $iv_no = "iv_no";
	public static final String $ar_typ = "ar_typ";
	public static final String $rcv_act_d_cnt = "rcv_act_d_cnt";
	/**
	 * AR settlement method cd. 1 債権決済方法ＣＤ１.<p>
	 *
	 */
	public static final String $ar_sttl_cd1 = "ar_sttl_cd1";
	/**
	 * AR settlement method name 1 債権決済方法名１.<p>
	 *
	 */
	public static final String $ar_sttl_nm1 = "ar_sttl_nm1";
	/**
	 * AR settlement method type 1 債権決済方法区分１.<p>
	 *
	 */
	public static final String $ar_sttl_typ1 = "ar_sttl_typ1";
	/**
	 * Tax cd. 1 税ＣＤ１.<p>
	 *
	 */
	public static final String $tax_cd1 = "tax_cd1";
	/**
	 * Tax name 1 税名１.<p>
	 *
	 */
	public static final String $tax_nm1 = "tax_nm1";
	/**
	 * Tax inclusive 1 内税１.<p>
	 *
	 */
	public static final String $inc_tax_flg1 = "inc_tax_flg1";
	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public static final String $tax_rate1 = "tax_rate1";
	/**
	 * Display tax amount on invoice 1 請求書税額表示１.<p>
	 *
	 */
	public static final String $bill_tax_disp_flg1 = "bill_tax_disp_flg1";
	/**
	 * AR settlement method cd. 2 債権決済方法ＣＤ２.<p>
	 *
	 */
	public static final String $ar_sttl_cd2 = "ar_sttl_cd2";
	/**
	 * AR settlement method name 2 債権決済方法名２.<p>
	 *
	 */
	public static final String $ar_sttl_nm2 = "ar_sttl_nm2";
	/**
	 * AR settlement method type 2 債権決済方法区分２.<p>
	 *
	 */
	public static final String $ar_sttl_typ2 = "ar_sttl_typ2";
	/**
	 * Tax cd. 2 税ＣＤ２.<p>
	 *
	 */
	public static final String $tax_cd2 = "tax_cd2";
	/**
	 * Tax name 2 税名２.<p>
	 *
	 */
	public static final String $tax_nm2 = "tax_nm2";
	/**
	 * Tax inclusive 2 内税２.<p>
	 *
	 */
	public static final String $inc_tax_flg2 = "inc_tax_flg2";
	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public static final String $tax_rate2 = "tax_rate2";
	/**
	 * Display tax amount on invoice 2 請求書税額表示２.<p>
	 *
	 */
	public static final String $bill_tax_disp_flg2 = "bill_tax_disp_flg2";
	/**
	 * Offset 相殺.<p>
	 *
	 */
	public static final String $setoff_flg = "setoff_flg";


	public static final MCMeta dlv_dt_META = createCommonMeta($dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_sls_ac_dt_META = createCommonMeta($base_sls_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sort_dlv_dt_META = createCommonMeta($sort_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ship_dlv_slip_no_META = createCommonMeta($ship_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta ship_dlv_slip_d_no_META = createCommonMeta($ship_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ship_dlv_slip_multi_flg_META = createCommonMeta($ship_dlv_slip_multi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt1_META = createCommonMeta($trd_cur_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt2_META = createCommonMeta($trd_cur_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt3_META = createCommonMeta($trd_cur_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt1_META = createCommonMeta($trd_cur_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt2_META = createCommonMeta($trd_cur_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt3_META = createCommonMeta($trd_cur_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt1_META = createCommonMeta($base_cur_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt2_META = createCommonMeta($base_cur_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt3_META = createCommonMeta($base_cur_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta bill_d_rmrks_META = createCommonMeta($bill_d_rmrks, mcframe.commonMS.meta.MS_META.BILL_D_RMRKS);
	public static final MCMeta d_sub_char1_META = createCommonMeta($d_sub_char1, mcframe.commonMS.meta.MS_META.BILL_D_SUB_CHAR1);
	public static final MCMeta d_sub_char2_META = createCommonMeta($d_sub_char2, mcframe.commonMS.meta.MS_META.BILL_D_SUB_CHAR2);
	public static final MCMeta d_sub_char3_META = createCommonMeta($d_sub_char3, mcframe.commonMS.meta.MS_META.BILL_D_SUB_CHAR3);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta ar_trd_grp_typ_META = createCommonMeta($ar_trd_grp_typ, mcframe.commonMA.meta.MA_META.AR_TRD_GRP_TYP);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta bill_d_typ_META = createCommonMeta($bill_d_typ, mcframe.commonMS.meta.MS_META.BILL_D_TYP);
	public static final MCMeta act_no_META = createCommonMeta($act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta act_seq_META = createCommonMeta($act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta act_rev_META = createCommonMeta($act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta act_d_no_META = createCommonMeta($act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta act_d_seq_META = createCommonMeta($act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta par_act_no_META = createCommonMeta($par_act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta bill_acst_no_META = createCommonMeta($bill_acst_no, mcframe.commonMA.meta.MA_META.BILL_ACST_NO);
	public static final MCMeta rcv_nm_META = createCommonMeta($rcv_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta bill_mtd_typ_META = createCommonMeta($bill_mtd_typ, mcframe.commonMS.meta.MS_META.BILL_MTD_TYP);
	public static final MCMeta part_bill_ttl_amt_META = createCommonMeta($part_bill_ttl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta part_bill_crryovr_amt_META = createCommonMeta($part_bill_crryovr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta rcv_act_d_cnt_META = createCommonMeta($rcv_act_d_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ar_sttl_cd1_META = createCommonMeta($ar_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_nm1_META = createCommonMeta($ar_sttl_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ar_sttl_typ1_META = createCommonMeta($ar_sttl_typ1, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta tax_cd1_META = createCommonMeta($tax_cd1, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm1_META = createCommonMeta($tax_nm1, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta inc_tax_flg1_META = createCommonMeta($inc_tax_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_rate1_META = createCommonMeta($tax_rate1, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta bill_tax_disp_flg1_META = createCommonMeta($bill_tax_disp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_sttl_cd2_META = createCommonMeta($ar_sttl_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_nm2_META = createCommonMeta($ar_sttl_nm2, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ar_sttl_typ2_META = createCommonMeta($ar_sttl_typ2, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta tax_cd2_META = createCommonMeta($tax_cd2, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm2_META = createCommonMeta($tax_nm2, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta inc_tax_flg2_META = createCommonMeta($inc_tax_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_rate2_META = createCommonMeta($tax_rate2, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta bill_tax_disp_flg2_META = createCommonMeta($bill_tax_disp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta setoff_flg_META = createCommonMeta($setoff_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Bill_Prnt01_DtlBaseR> constMetas = new ConstMetaList<Bill_Prnt01_DtlBaseR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dlv_dt_META,
			ac_ym_META,
			ac_dt_META,
			rcv_dt_META,
			base_sls_ac_dt_META,
			sort_dlv_dt_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			ship_dlv_slip_no_META,
			ship_dlv_slip_d_no_META,
			ship_dlv_slip_multi_flg_META,
			slip_sts_typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			dscnt_itm_flg_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			trd_cd_META,
			trd_nm_META,
			trd_unit_qty_META,
			trd_unit_cd_META,
			unit_nm_META,
			trd_unit_dec_place_META,
			trd_cur_upri_META,
			interim_flg_META,
			trd_cur_amt_META,
			trd_cur_amt1_META,
			trd_cur_amt2_META,
			trd_cur_amt3_META,
			trd_cur_dscnt_amt_META,
			trd_cur_tax_amt_META,
			base_cur_tax_amt_META,
			trd_cur_tax_amt1_META,
			trd_cur_tax_amt2_META,
			trd_cur_tax_amt3_META,
			base_cur_tax_amt1_META,
			base_cur_tax_amt2_META,
			base_cur_tax_amt3_META,
			tax_cd_META,
			tax_nm_META,
			inc_tax_flg_META,
			tax_rate_META,
			trd_d_rmrks_META,
			bill_d_rmrks_META,
			d_sub_char1_META,
			d_sub_char2_META,
			d_sub_char3_META,
			bill_mng_no_META,
			ar_trd_grp_typ_META,
			trd_ptn_typ_META,
			bill_d_typ_META,
			act_no_META,
			act_seq_META,
			act_rev_META,
			act_d_no_META,
			act_d_seq_META,
			wrk_no_META,
			wrk_nm_META,
			cst_cd_META,
			dlv_cd_META,
			dlv_nm_META,
			par_act_no_META,
			bill_acst_no_META,
			rcv_nm_META,
			bill_mtd_typ_META,
			part_bill_ttl_amt_META,
			part_bill_crryovr_amt_META,
			cst_po_no_META,
			cst_po_d_no_META,
			iv_no_META,
			ar_typ_META,
			rcv_act_d_cnt_META,
			ar_sttl_cd1_META,
			ar_sttl_nm1_META,
			ar_sttl_typ1_META,
			tax_cd1_META,
			tax_nm1_META,
			inc_tax_flg1_META,
			tax_rate1_META,
			bill_tax_disp_flg1_META,
			ar_sttl_cd2_META,
			ar_sttl_nm2_META,
			ar_sttl_typ2_META,
			tax_cd2_META,
			tax_nm2_META,
			inc_tax_flg2_META,
			tax_rate2_META,
			bill_tax_disp_flg2_META,
			setoff_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected Bill_Prnt01_DtlBaseR_MC_A(ConstMetaList<? extends Bill_Prnt01_DtlBaseR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Bill_Prnt01_DtlBaseR clone() {
		return (Bill_Prnt01_DtlBaseR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Bill_Prnt01_DtlBaseR createInstance() {
		return (Bill_Prnt01_DtlBaseR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Bill_Prnt01_DtlBaseR getValues(String... names) {
		return (Bill_Prnt01_DtlBaseR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCDate dlv_dt() {
		return getConstDate(offset + 0, $dlv_dt);
	}

	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public void dlv_dt(MCDate value) {
		setConstDate(offset + 0, $dlv_dt, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 1, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 1, $ac_ym, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 2, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 2, $ac_dt, value);
	}


	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 3, $rcv_dt);
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 3, $rcv_dt, value);
	}


	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public MCDate base_sls_ac_dt() {
		return getConstDate(offset + 4, $base_sls_ac_dt);
	}

	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public void base_sls_ac_dt(MCDate value) {
		setConstDate(offset + 4, $base_sls_ac_dt, value);
	}


	/**
	 * Date for sorting ソート用日付.<p>
	 *
	 */
	public MCDate sort_dlv_dt() {
		return getConstDate(offset + 5, $sort_dlv_dt);
	}

	/**
	 * Date for sorting ソート用日付.<p>
	 *
	 */
	public void sort_dlv_dt(MCDate value) {
		setConstDate(offset + 5, $sort_dlv_dt, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 6, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 6, $dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 7, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 7, $dlv_slip_d_no, value);
	}


	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_no() {
		return getConstString(offset + 8, $ship_dlv_slip_no);
	}

	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_no(String value) {
		setConstString(offset + 8, $ship_dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_d_no() {
		return getConstString(offset + 9, $ship_dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_d_no(String value) {
		setConstString(offset + 9, $ship_dlv_slip_d_no, value);
	}


	/**
	 * Multiple delivery note details at shipping flg. 出荷時納品書明細複数ＦＬＧ.<p>
	 *
	 */
	public boolean ship_dlv_slip_multi_flg() {
		return getConstBoolean(offset + 10, $ship_dlv_slip_multi_flg);
	}

	/**
	 * Multiple delivery note details at shipping flg. 出荷時納品書明細複数ＦＬＧ.<p>
	 *
	 */
	public void ship_dlv_slip_multi_flg(boolean value) {
		setConstBoolean(offset + 10, $ship_dlv_slip_multi_flg, value);
	}


	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 11, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 11, $slip_sts_typ, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 12, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 12, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 13, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 13, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 14, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 14, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 15, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 15, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 16, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 16, $itm_nm, value);
	}


	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 17, $itm_alt_nm1);
	}

	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 17, $itm_alt_nm1, value);
	}


	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 18, $itm_alt_nm2);
	}

	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 18, $itm_alt_nm2, value);
	}


	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 19, $itm_alt_nm3);
	}

	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 19, $itm_alt_nm3, value);
	}


	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 20, $itm_alt_nm4);
	}

	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 20, $itm_alt_nm4, value);
	}


	/**
	 * Discount item flg. 値引品目ＦＬＧ.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 21, $dscnt_itm_flg);
	}

	/**
	 * Discount item flg. 値引品目ＦＬＧ.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 21, $dscnt_itm_flg, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 22, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 22, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 23, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 23, $cst_itm_nm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 24, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 24, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 25, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 25, $trd_nm, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 26, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 26, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 26, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 26, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 26, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 26, $trd_unit_qty, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 27, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 27, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 28, $unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 28, $unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 29, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 29, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 29, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 29, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 29, $trd_unit_dec_place, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 30, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 30, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 30, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 30, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 30, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 30, $trd_cur_upri, value);
	}


	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 31, $interim_flg);
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 31, $interim_flg, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 32, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 32, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 32, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 32, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 32, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 32, $trd_cur_amt, value);
	}


	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public MCNumber trd_cur_amt1() {
		return getConstNumber(offset + 33, $trd_cur_amt1);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(MCNumber value) {
		setConstNumber(offset + 33, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(int value) {
		setConstNumber(offset + 33, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(long value) {
		setConstNumber(offset + 33, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(float value) {
		setConstNumber(offset + 33, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(double value) {
		setConstNumber(offset + 33, $trd_cur_amt1, value);
	}


	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public MCNumber trd_cur_amt2() {
		return getConstNumber(offset + 34, $trd_cur_amt2);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(MCNumber value) {
		setConstNumber(offset + 34, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(int value) {
		setConstNumber(offset + 34, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(long value) {
		setConstNumber(offset + 34, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(float value) {
		setConstNumber(offset + 34, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(double value) {
		setConstNumber(offset + 34, $trd_cur_amt2, value);
	}


	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public MCNumber trd_cur_amt3() {
		return getConstNumber(offset + 35, $trd_cur_amt3);
	}

	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public void trd_cur_amt3(MCNumber value) {
		setConstNumber(offset + 35, $trd_cur_amt3, value);
	}

	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public void trd_cur_amt3(int value) {
		setConstNumber(offset + 35, $trd_cur_amt3, value);
	}

	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public void trd_cur_amt3(long value) {
		setConstNumber(offset + 35, $trd_cur_amt3, value);
	}

	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public void trd_cur_amt3(float value) {
		setConstNumber(offset + 35, $trd_cur_amt3, value);
	}

	/**
	 * Amount 3 (Transaction currency) 取引通貨金額３.<p>
	 *
	 */
	public void trd_cur_amt3(double value) {
		setConstNumber(offset + 35, $trd_cur_amt3, value);
	}


	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 36, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 36, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 36, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 36, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 36, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 36, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 37, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 37, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 37, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 37, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 37, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 37, $trd_cur_tax_amt, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 38, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 38, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 38, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 38, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 38, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 38, $base_cur_tax_amt, value);
	}


	/**
	 * Tax amount (Transaction currency) 1 取引通貨税額１.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt1() {
		return getConstNumber(offset + 39, $trd_cur_tax_amt1);
	}

	/**
	 * Tax amount (Transaction currency) 1 取引通貨税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(MCNumber value) {
		setConstNumber(offset + 39, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax amount (Transaction currency) 1 取引通貨税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(int value) {
		setConstNumber(offset + 39, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax amount (Transaction currency) 1 取引通貨税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(long value) {
		setConstNumber(offset + 39, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax amount (Transaction currency) 1 取引通貨税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(float value) {
		setConstNumber(offset + 39, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax amount (Transaction currency) 1 取引通貨税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(double value) {
		setConstNumber(offset + 39, $trd_cur_tax_amt1, value);
	}


	/**
	 * Tax amount (Transaction currency) 2 取引通貨税額２.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt2() {
		return getConstNumber(offset + 40, $trd_cur_tax_amt2);
	}

	/**
	 * Tax amount (Transaction currency) 2 取引通貨税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(MCNumber value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax amount (Transaction currency) 2 取引通貨税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(int value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax amount (Transaction currency) 2 取引通貨税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(long value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax amount (Transaction currency) 2 取引通貨税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(float value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax amount (Transaction currency) 2 取引通貨税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(double value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt2, value);
	}


	/**
	 * Tax amount (Transaction currency) 3 取引通貨税額３.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt3() {
		return getConstNumber(offset + 41, $trd_cur_tax_amt3);
	}

	/**
	 * Tax amount (Transaction currency) 3 取引通貨税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(MCNumber value) {
		setConstNumber(offset + 41, $trd_cur_tax_amt3, value);
	}

	/**
	 * Tax amount (Transaction currency) 3 取引通貨税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(int value) {
		setConstNumber(offset + 41, $trd_cur_tax_amt3, value);
	}

	/**
	 * Tax amount (Transaction currency) 3 取引通貨税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(long value) {
		setConstNumber(offset + 41, $trd_cur_tax_amt3, value);
	}

	/**
	 * Tax amount (Transaction currency) 3 取引通貨税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(float value) {
		setConstNumber(offset + 41, $trd_cur_tax_amt3, value);
	}

	/**
	 * Tax amount (Transaction currency) 3 取引通貨税額３.<p>
	 *
	 */
	public void trd_cur_tax_amt3(double value) {
		setConstNumber(offset + 41, $trd_cur_tax_amt3, value);
	}


	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt1() {
		return getConstNumber(offset + 42, $base_cur_tax_amt1);
	}

	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(MCNumber value) {
		setConstNumber(offset + 42, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(int value) {
		setConstNumber(offset + 42, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(long value) {
		setConstNumber(offset + 42, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(float value) {
		setConstNumber(offset + 42, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax amount 1 (Base currency) 基準通貨税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(double value) {
		setConstNumber(offset + 42, $base_cur_tax_amt1, value);
	}


	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt2() {
		return getConstNumber(offset + 43, $base_cur_tax_amt2);
	}

	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(MCNumber value) {
		setConstNumber(offset + 43, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(int value) {
		setConstNumber(offset + 43, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(long value) {
		setConstNumber(offset + 43, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(float value) {
		setConstNumber(offset + 43, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax amount 2 (Base currency) 基準通貨税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(double value) {
		setConstNumber(offset + 43, $base_cur_tax_amt2, value);
	}


	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt3() {
		return getConstNumber(offset + 44, $base_cur_tax_amt3);
	}

	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(MCNumber value) {
		setConstNumber(offset + 44, $base_cur_tax_amt3, value);
	}

	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(int value) {
		setConstNumber(offset + 44, $base_cur_tax_amt3, value);
	}

	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(long value) {
		setConstNumber(offset + 44, $base_cur_tax_amt3, value);
	}

	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(float value) {
		setConstNumber(offset + 44, $base_cur_tax_amt3, value);
	}

	/**
	 * Tax amount 3 (Base currency) 基準通貨税額３.<p>
	 *
	 */
	public void base_cur_tax_amt3(double value) {
		setConstNumber(offset + 44, $base_cur_tax_amt3, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 45, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 45, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 46, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 46, $tax_nm, value);
	}


	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 47, $inc_tax_flg);
	}

	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 47, $inc_tax_flg, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 48, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 48, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 48, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 48, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 48, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 48, $tax_rate, value);
	}


	/**
	 * Details remarks 明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 49, $trd_d_rmrks);
	}

	/**
	 * Details remarks 明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 49, $trd_d_rmrks, value);
	}


	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public String bill_d_rmrks() {
		return getConstString(offset + 50, $bill_d_rmrks);
	}

	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public void bill_d_rmrks(String value) {
		setConstString(offset + 50, $bill_d_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String d_sub_char1() {
		return getConstString(offset + 51, $d_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void d_sub_char1(String value) {
		setConstString(offset + 51, $d_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String d_sub_char2() {
		return getConstString(offset + 52, $d_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void d_sub_char2(String value) {
		setConstString(offset + 52, $d_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String d_sub_char3() {
		return getConstString(offset + 53, $d_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void d_sub_char3(String value) {
		setConstString(offset + 53, $d_sub_char3, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 54, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 54, $bill_mng_no, value);
	}


	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public String ar_trd_grp_typ() {
		return getConstString(offset + 55, $ar_trd_grp_typ);
	}

	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public void ar_trd_grp_typ(String value) {
		setConstString(offset + 55, $ar_trd_grp_typ, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 56, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 56, $trd_ptn_typ, value);
	}


	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public String bill_d_typ() {
		return getConstString(offset + 57, $bill_d_typ);
	}

	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public void bill_d_typ(String value) {
		setConstString(offset + 57, $bill_d_typ, value);
	}


	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 58, $act_no);
	}

	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 58, $act_no, value);
	}


	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public MCNumber act_seq() {
		return getConstNumber(offset + 59, $act_seq);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(MCNumber value) {
		setConstNumber(offset + 59, $act_seq, value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(int value) {
		setConstNumber(offset + 59, $act_seq, value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(long value) {
		setConstNumber(offset + 59, $act_seq, value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(float value) {
		setConstNumber(offset + 59, $act_seq, value);
	}

	/**
	 * Header result sequence number ヘッダ実績連番.<p>
	 *
	 */
	public void act_seq(double value) {
		setConstNumber(offset + 59, $act_seq, value);
	}


	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public MCNumber act_rev() {
		return getConstNumber(offset + 60, $act_rev);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(MCNumber value) {
		setConstNumber(offset + 60, $act_rev, value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(int value) {
		setConstNumber(offset + 60, $act_rev, value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(long value) {
		setConstNumber(offset + 60, $act_rev, value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(float value) {
		setConstNumber(offset + 60, $act_rev, value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(double value) {
		setConstNumber(offset + 60, $act_rev, value);
	}


	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 61, $act_d_no);
	}

	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 61, $act_d_no, value);
	}


	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public MCNumber act_d_seq() {
		return getConstNumber(offset + 62, $act_d_seq);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(MCNumber value) {
		setConstNumber(offset + 62, $act_d_seq, value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(int value) {
		setConstNumber(offset + 62, $act_d_seq, value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(long value) {
		setConstNumber(offset + 62, $act_d_seq, value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(float value) {
		setConstNumber(offset + 62, $act_d_seq, value);
	}

	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public void act_d_seq(double value) {
		setConstNumber(offset + 62, $act_d_seq, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 63, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 63, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 64, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 64, $wrk_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 65, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 65, $cst_cd, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 66, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 66, $dlv_cd, value);
	}


	/**
	 * Delivery destination cd. name 納品先ＣＤ名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 67, $dlv_nm);
	}

	/**
	 * Delivery destination cd. name 納品先ＣＤ名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 67, $dlv_nm, value);
	}


	/**
	 * Parent result No. 親実績ＮＯ.<p>
	 *
	 */
	public String par_act_no() {
		return getConstString(offset + 68, $par_act_no);
	}

	/**
	 * Parent result No. 親実績ＮＯ.<p>
	 *
	 */
	public void par_act_no(String value) {
		setConstString(offset + 68, $par_act_no, value);
	}


	/**
	 * Billing No. by AR customer 売掛別請求ＮＯ.<p>
	 *
	 */
	public String bill_acst_no() {
		return getConstString(offset + 69, $bill_acst_no);
	}

	/**
	 * Billing No. by AR customer 売掛別請求ＮＯ.<p>
	 *
	 */
	public void bill_acst_no(String value) {
		setConstString(offset + 69, $bill_acst_no, value);
	}


	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public String rcv_nm() {
		return getConstString(offset + 70, $rcv_nm);
	}

	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public void rcv_nm(String value) {
		setConstString(offset + 70, $rcv_nm, value);
	}


	/**
	 * Billing method type 請求方式区分.<p>
	 *
	 */
	public String bill_mtd_typ() {
		return getConstString(offset + 71, $bill_mtd_typ);
	}

	/**
	 * Billing method type 請求方式区分.<p>
	 *
	 */
	public void bill_mtd_typ(String value) {
		setConstString(offset + 71, $bill_mtd_typ, value);
	}


	/**
	 * Amount total (partial billing) 金額総計(一部請求).<p>
	 *
	 */
	public MCNumber part_bill_ttl_amt() {
		return getConstNumber(offset + 72, $part_bill_ttl_amt);
	}

	/**
	 * Amount total (partial billing) 金額総計(一部請求).<p>
	 *
	 */
	public void part_bill_ttl_amt(MCNumber value) {
		setConstNumber(offset + 72, $part_bill_ttl_amt, value);
	}

	/**
	 * Amount total (partial billing) 金額総計(一部請求).<p>
	 *
	 */
	public void part_bill_ttl_amt(int value) {
		setConstNumber(offset + 72, $part_bill_ttl_amt, value);
	}

	/**
	 * Amount total (partial billing) 金額総計(一部請求).<p>
	 *
	 */
	public void part_bill_ttl_amt(long value) {
		setConstNumber(offset + 72, $part_bill_ttl_amt, value);
	}

	/**
	 * Amount total (partial billing) 金額総計(一部請求).<p>
	 *
	 */
	public void part_bill_ttl_amt(float value) {
		setConstNumber(offset + 72, $part_bill_ttl_amt, value);
	}

	/**
	 * Amount total (partial billing) 金額総計(一部請求).<p>
	 *
	 */
	public void part_bill_ttl_amt(double value) {
		setConstNumber(offset + 72, $part_bill_ttl_amt, value);
	}


	/**
	 * Carry-over billing amount (partial invoice) 繰越請求金額(一部請求).<p>
	 *
	 */
	public MCNumber part_bill_crryovr_amt() {
		return getConstNumber(offset + 73, $part_bill_crryovr_amt);
	}

	/**
	 * Carry-over billing amount (partial invoice) 繰越請求金額(一部請求).<p>
	 *
	 */
	public void part_bill_crryovr_amt(MCNumber value) {
		setConstNumber(offset + 73, $part_bill_crryovr_amt, value);
	}

	/**
	 * Carry-over billing amount (partial invoice) 繰越請求金額(一部請求).<p>
	 *
	 */
	public void part_bill_crryovr_amt(int value) {
		setConstNumber(offset + 73, $part_bill_crryovr_amt, value);
	}

	/**
	 * Carry-over billing amount (partial invoice) 繰越請求金額(一部請求).<p>
	 *
	 */
	public void part_bill_crryovr_amt(long value) {
		setConstNumber(offset + 73, $part_bill_crryovr_amt, value);
	}

	/**
	 * Carry-over billing amount (partial invoice) 繰越請求金額(一部請求).<p>
	 *
	 */
	public void part_bill_crryovr_amt(float value) {
		setConstNumber(offset + 73, $part_bill_crryovr_amt, value);
	}

	/**
	 * Carry-over billing amount (partial invoice) 繰越請求金額(一部請求).<p>
	 *
	 */
	public void part_bill_crryovr_amt(double value) {
		setConstNumber(offset + 73, $part_bill_crryovr_amt, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 74, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 74, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 75, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 75, $cst_po_d_no, value);
	}


	public String iv_no() {
		return getConstString(offset + 76, $iv_no);
	}

	public void iv_no(String value) {
		setConstString(offset + 76, $iv_no, value);
	}


	public String ar_typ() {
		return getConstString(offset + 77, $ar_typ);
	}

	public void ar_typ(String value) {
		setConstString(offset + 77, $ar_typ, value);
	}


	public MCNumber rcv_act_d_cnt() {
		return getConstNumber(offset + 78, $rcv_act_d_cnt);
	}

	public void rcv_act_d_cnt(MCNumber value) {
		setConstNumber(offset + 78, $rcv_act_d_cnt, value);
	}

	public void rcv_act_d_cnt(int value) {
		setConstNumber(offset + 78, $rcv_act_d_cnt, value);
	}

	public void rcv_act_d_cnt(long value) {
		setConstNumber(offset + 78, $rcv_act_d_cnt, value);
	}

	public void rcv_act_d_cnt(float value) {
		setConstNumber(offset + 78, $rcv_act_d_cnt, value);
	}

	public void rcv_act_d_cnt(double value) {
		setConstNumber(offset + 78, $rcv_act_d_cnt, value);
	}


	/**
	 * AR settlement method cd. 1 債権決済方法ＣＤ１.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 79, $ar_sttl_cd1);
	}

	/**
	 * AR settlement method cd. 1 債権決済方法ＣＤ１.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 79, $ar_sttl_cd1, value);
	}


	/**
	 * AR settlement method name 1 債権決済方法名１.<p>
	 *
	 */
	public String ar_sttl_nm1() {
		return getConstString(offset + 80, $ar_sttl_nm1);
	}

	/**
	 * AR settlement method name 1 債権決済方法名１.<p>
	 *
	 */
	public void ar_sttl_nm1(String value) {
		setConstString(offset + 80, $ar_sttl_nm1, value);
	}


	/**
	 * AR settlement method type 1 債権決済方法区分１.<p>
	 *
	 */
	public String ar_sttl_typ1() {
		return getConstString(offset + 81, $ar_sttl_typ1);
	}

	/**
	 * AR settlement method type 1 債権決済方法区分１.<p>
	 *
	 */
	public void ar_sttl_typ1(String value) {
		setConstString(offset + 81, $ar_sttl_typ1, value);
	}


	/**
	 * Tax cd. 1 税ＣＤ１.<p>
	 *
	 */
	public String tax_cd1() {
		return getConstString(offset + 82, $tax_cd1);
	}

	/**
	 * Tax cd. 1 税ＣＤ１.<p>
	 *
	 */
	public void tax_cd1(String value) {
		setConstString(offset + 82, $tax_cd1, value);
	}


	/**
	 * Tax name 1 税名１.<p>
	 *
	 */
	public String tax_nm1() {
		return getConstString(offset + 83, $tax_nm1);
	}

	/**
	 * Tax name 1 税名１.<p>
	 *
	 */
	public void tax_nm1(String value) {
		setConstString(offset + 83, $tax_nm1, value);
	}


	/**
	 * Tax inclusive 1 内税１.<p>
	 *
	 */
	public boolean inc_tax_flg1() {
		return getConstBoolean(offset + 84, $inc_tax_flg1);
	}

	/**
	 * Tax inclusive 1 内税１.<p>
	 *
	 */
	public void inc_tax_flg1(boolean value) {
		setConstBoolean(offset + 84, $inc_tax_flg1, value);
	}


	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public MCNumber tax_rate1() {
		return getConstNumber(offset + 85, $tax_rate1);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(MCNumber value) {
		setConstNumber(offset + 85, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(int value) {
		setConstNumber(offset + 85, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(long value) {
		setConstNumber(offset + 85, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(float value) {
		setConstNumber(offset + 85, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(double value) {
		setConstNumber(offset + 85, $tax_rate1, value);
	}


	/**
	 * Display tax amount on invoice 1 請求書税額表示１.<p>
	 *
	 */
	public boolean bill_tax_disp_flg1() {
		return getConstBoolean(offset + 86, $bill_tax_disp_flg1);
	}

	/**
	 * Display tax amount on invoice 1 請求書税額表示１.<p>
	 *
	 */
	public void bill_tax_disp_flg1(boolean value) {
		setConstBoolean(offset + 86, $bill_tax_disp_flg1, value);
	}


	/**
	 * AR settlement method cd. 2 債権決済方法ＣＤ２.<p>
	 *
	 */
	public String ar_sttl_cd2() {
		return getConstString(offset + 87, $ar_sttl_cd2);
	}

	/**
	 * AR settlement method cd. 2 債権決済方法ＣＤ２.<p>
	 *
	 */
	public void ar_sttl_cd2(String value) {
		setConstString(offset + 87, $ar_sttl_cd2, value);
	}


	/**
	 * AR settlement method name 2 債権決済方法名２.<p>
	 *
	 */
	public String ar_sttl_nm2() {
		return getConstString(offset + 88, $ar_sttl_nm2);
	}

	/**
	 * AR settlement method name 2 債権決済方法名２.<p>
	 *
	 */
	public void ar_sttl_nm2(String value) {
		setConstString(offset + 88, $ar_sttl_nm2, value);
	}


	/**
	 * AR settlement method type 2 債権決済方法区分２.<p>
	 *
	 */
	public String ar_sttl_typ2() {
		return getConstString(offset + 89, $ar_sttl_typ2);
	}

	/**
	 * AR settlement method type 2 債権決済方法区分２.<p>
	 *
	 */
	public void ar_sttl_typ2(String value) {
		setConstString(offset + 89, $ar_sttl_typ2, value);
	}


	/**
	 * Tax cd. 2 税ＣＤ２.<p>
	 *
	 */
	public String tax_cd2() {
		return getConstString(offset + 90, $tax_cd2);
	}

	/**
	 * Tax cd. 2 税ＣＤ２.<p>
	 *
	 */
	public void tax_cd2(String value) {
		setConstString(offset + 90, $tax_cd2, value);
	}


	/**
	 * Tax name 2 税名２.<p>
	 *
	 */
	public String tax_nm2() {
		return getConstString(offset + 91, $tax_nm2);
	}

	/**
	 * Tax name 2 税名２.<p>
	 *
	 */
	public void tax_nm2(String value) {
		setConstString(offset + 91, $tax_nm2, value);
	}


	/**
	 * Tax inclusive 2 内税２.<p>
	 *
	 */
	public boolean inc_tax_flg2() {
		return getConstBoolean(offset + 92, $inc_tax_flg2);
	}

	/**
	 * Tax inclusive 2 内税２.<p>
	 *
	 */
	public void inc_tax_flg2(boolean value) {
		setConstBoolean(offset + 92, $inc_tax_flg2, value);
	}


	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public MCNumber tax_rate2() {
		return getConstNumber(offset + 93, $tax_rate2);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(MCNumber value) {
		setConstNumber(offset + 93, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(int value) {
		setConstNumber(offset + 93, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(long value) {
		setConstNumber(offset + 93, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(float value) {
		setConstNumber(offset + 93, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(double value) {
		setConstNumber(offset + 93, $tax_rate2, value);
	}


	/**
	 * Display tax amount on invoice 2 請求書税額表示２.<p>
	 *
	 */
	public boolean bill_tax_disp_flg2() {
		return getConstBoolean(offset + 94, $bill_tax_disp_flg2);
	}

	/**
	 * Display tax amount on invoice 2 請求書税額表示２.<p>
	 *
	 */
	public void bill_tax_disp_flg2(boolean value) {
		setConstBoolean(offset + 94, $bill_tax_disp_flg2, value);
	}


	/**
	 * Offset 相殺.<p>
	 *
	 */
	public boolean setoff_flg() {
		return getConstBoolean(offset + 95, $setoff_flg);
	}

	/**
	 * Offset 相殺.<p>
	 *
	 */
	public void setoff_flg(boolean value) {
		setConstBoolean(offset + 95, $setoff_flg, value);
	}


	public String getString(String name) {
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_d_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
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
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			return bill_d_typ();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($par_act_no.equalsIgnoreCase(name)) {
			return par_act_no();
		}
		if ($bill_acst_no.equalsIgnoreCase(name)) {
			return bill_acst_no();
		}
		if ($rcv_nm.equalsIgnoreCase(name)) {
			return rcv_nm();
		}
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			return bill_mtd_typ();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			return ar_sttl_nm1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			return tax_cd1();
		}
		if ($tax_nm1.equalsIgnoreCase(name)) {
			return tax_nm1();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			return ar_sttl_nm2();
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			return ar_sttl_typ2();
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			return tax_cd2();
		}
		if ($tax_nm2.equalsIgnoreCase(name)) {
			return tax_nm2();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			return trd_cur_amt1();
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			return trd_cur_amt2();
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			return trd_cur_amt3();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt1();
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt2();
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt3();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			return base_cur_tax_amt2();
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			return base_cur_tax_amt3();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($part_bill_ttl_amt.equalsIgnoreCase(name)) {
			return part_bill_ttl_amt();
		}
		if ($part_bill_crryovr_amt.equalsIgnoreCase(name)) {
			return part_bill_crryovr_amt();
		}
		if ($rcv_act_d_cnt.equalsIgnoreCase(name)) {
			return rcv_act_d_cnt();
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			return tax_rate1();
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			return tax_rate2();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dlv_dt.equalsIgnoreCase(name)) {
			return dlv_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			return base_sls_ac_dt();
		}
		if ($sort_dlv_dt.equalsIgnoreCase(name)) {
			return sort_dlv_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			return ship_dlv_slip_multi_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($inc_tax_flg1.equalsIgnoreCase(name)) {
			return inc_tax_flg1();
		}
		if ($bill_tax_disp_flg1.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg1();
		}
		if ($inc_tax_flg2.equalsIgnoreCase(name)) {
			return inc_tax_flg2();
		}
		if ($bill_tax_disp_flg2.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg2();
		}
		if ($setoff_flg.equalsIgnoreCase(name)) {
			return setoff_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_d_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
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
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			return bill_d_typ();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($par_act_no.equalsIgnoreCase(name)) {
			return par_act_no();
		}
		if ($bill_acst_no.equalsIgnoreCase(name)) {
			return bill_acst_no();
		}
		if ($rcv_nm.equalsIgnoreCase(name)) {
			return rcv_nm();
		}
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			return bill_mtd_typ();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			return ar_sttl_nm1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			return tax_cd1();
		}
		if ($tax_nm1.equalsIgnoreCase(name)) {
			return tax_nm1();
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			return ar_sttl_cd2();
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			return ar_sttl_nm2();
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			return ar_sttl_typ2();
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			return tax_cd2();
		}
		if ($tax_nm2.equalsIgnoreCase(name)) {
			return tax_nm2();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			return trd_cur_amt1();
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			return trd_cur_amt2();
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			return trd_cur_amt3();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt1();
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt2();
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt3();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			return base_cur_tax_amt2();
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			return base_cur_tax_amt3();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($part_bill_ttl_amt.equalsIgnoreCase(name)) {
			return part_bill_ttl_amt();
		}
		if ($part_bill_crryovr_amt.equalsIgnoreCase(name)) {
			return part_bill_crryovr_amt();
		}
		if ($rcv_act_d_cnt.equalsIgnoreCase(name)) {
			return rcv_act_d_cnt();
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			return tax_rate1();
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			return tax_rate2();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dlv_dt.equalsIgnoreCase(name)) {
			return dlv_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			return base_sls_ac_dt();
		}
		if ($sort_dlv_dt.equalsIgnoreCase(name)) {
			return sort_dlv_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			return ship_dlv_slip_multi_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($inc_tax_flg1.equalsIgnoreCase(name)) {
			return inc_tax_flg1();
		}
		if ($bill_tax_disp_flg1.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg1();
		}
		if ($inc_tax_flg2.equalsIgnoreCase(name)) {
			return inc_tax_flg2();
		}
		if ($bill_tax_disp_flg2.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg2();
		}
		if ($setoff_flg.equalsIgnoreCase(name)) {
			return setoff_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_d_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
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
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
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
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			bill_d_rmrks(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			bill_d_typ(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
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
		if ($par_act_no.equalsIgnoreCase(name)) {
			par_act_no(value);
			return;
		}
		if ($bill_acst_no.equalsIgnoreCase(name)) {
			bill_acst_no(value);
			return;
		}
		if ($rcv_nm.equalsIgnoreCase(name)) {
			rcv_nm(value);
			return;
		}
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			bill_mtd_typ(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			ar_sttl_nm1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			tax_cd1(value);
			return;
		}
		if ($tax_nm1.equalsIgnoreCase(name)) {
			tax_nm1(value);
			return;
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			ar_sttl_cd2(value);
			return;
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			ar_sttl_nm2(value);
			return;
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			ar_sttl_typ2(value);
			return;
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			tax_cd2(value);
			return;
		}
		if ($tax_nm2.equalsIgnoreCase(name)) {
			tax_nm2(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($part_bill_ttl_amt.equalsIgnoreCase(name)) {
			part_bill_ttl_amt(value);
			return;
		}
		if ($part_bill_crryovr_amt.equalsIgnoreCase(name)) {
			part_bill_crryovr_amt(value);
			return;
		}
		if ($rcv_act_d_cnt.equalsIgnoreCase(name)) {
			rcv_act_d_cnt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($part_bill_ttl_amt.equalsIgnoreCase(name)) {
			part_bill_ttl_amt(value);
			return;
		}
		if ($part_bill_crryovr_amt.equalsIgnoreCase(name)) {
			part_bill_crryovr_amt(value);
			return;
		}
		if ($rcv_act_d_cnt.equalsIgnoreCase(name)) {
			rcv_act_d_cnt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($part_bill_ttl_amt.equalsIgnoreCase(name)) {
			part_bill_ttl_amt(value);
			return;
		}
		if ($part_bill_crryovr_amt.equalsIgnoreCase(name)) {
			part_bill_crryovr_amt(value);
			return;
		}
		if ($rcv_act_d_cnt.equalsIgnoreCase(name)) {
			rcv_act_d_cnt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($part_bill_ttl_amt.equalsIgnoreCase(name)) {
			part_bill_ttl_amt(value);
			return;
		}
		if ($part_bill_crryovr_amt.equalsIgnoreCase(name)) {
			part_bill_crryovr_amt(value);
			return;
		}
		if ($rcv_act_d_cnt.equalsIgnoreCase(name)) {
			rcv_act_d_cnt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($part_bill_ttl_amt.equalsIgnoreCase(name)) {
			part_bill_ttl_amt(value);
			return;
		}
		if ($part_bill_crryovr_amt.equalsIgnoreCase(name)) {
			part_bill_crryovr_amt(value);
			return;
		}
		if ($rcv_act_d_cnt.equalsIgnoreCase(name)) {
			rcv_act_d_cnt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dlv_dt.equalsIgnoreCase(name)) {
			dlv_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			base_sls_ac_dt(value);
			return;
		}
		if ($sort_dlv_dt.equalsIgnoreCase(name)) {
			sort_dlv_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			ship_dlv_slip_multi_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($inc_tax_flg1.equalsIgnoreCase(name)) {
			inc_tax_flg1(value);
			return;
		}
		if ($bill_tax_disp_flg1.equalsIgnoreCase(name)) {
			bill_tax_disp_flg1(value);
			return;
		}
		if ($inc_tax_flg2.equalsIgnoreCase(name)) {
			inc_tax_flg2(value);
			return;
		}
		if ($bill_tax_disp_flg2.equalsIgnoreCase(name)) {
			bill_tax_disp_flg2(value);
			return;
		}
		if ($setoff_flg.equalsIgnoreCase(name)) {
			setoff_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_d_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
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
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
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
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			bill_d_rmrks(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			bill_d_typ(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
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
		if ($par_act_no.equalsIgnoreCase(name)) {
			par_act_no(value);
			return;
		}
		if ($bill_acst_no.equalsIgnoreCase(name)) {
			bill_acst_no(value);
			return;
		}
		if ($rcv_nm.equalsIgnoreCase(name)) {
			rcv_nm(value);
			return;
		}
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			bill_mtd_typ(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			ar_sttl_nm1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($tax_cd1.equalsIgnoreCase(name)) {
			tax_cd1(value);
			return;
		}
		if ($tax_nm1.equalsIgnoreCase(name)) {
			tax_nm1(value);
			return;
		}
		if ($ar_sttl_cd2.equalsIgnoreCase(name)) {
			ar_sttl_cd2(value);
			return;
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			ar_sttl_nm2(value);
			return;
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			ar_sttl_typ2(value);
			return;
		}
		if ($tax_cd2.equalsIgnoreCase(name)) {
			tax_cd2(value);
			return;
		}
		if ($tax_nm2.equalsIgnoreCase(name)) {
			tax_nm2(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($part_bill_ttl_amt.equalsIgnoreCase(name)) {
			part_bill_ttl_amt(value);
			return;
		}
		if ($part_bill_crryovr_amt.equalsIgnoreCase(name)) {
			part_bill_crryovr_amt(value);
			return;
		}
		if ($rcv_act_d_cnt.equalsIgnoreCase(name)) {
			rcv_act_d_cnt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($part_bill_ttl_amt.equalsIgnoreCase(name)) {
			part_bill_ttl_amt(value);
			return;
		}
		if ($part_bill_crryovr_amt.equalsIgnoreCase(name)) {
			part_bill_crryovr_amt(value);
			return;
		}
		if ($rcv_act_d_cnt.equalsIgnoreCase(name)) {
			rcv_act_d_cnt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($part_bill_ttl_amt.equalsIgnoreCase(name)) {
			part_bill_ttl_amt(value);
			return;
		}
		if ($part_bill_crryovr_amt.equalsIgnoreCase(name)) {
			part_bill_crryovr_amt(value);
			return;
		}
		if ($rcv_act_d_cnt.equalsIgnoreCase(name)) {
			rcv_act_d_cnt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($part_bill_ttl_amt.equalsIgnoreCase(name)) {
			part_bill_ttl_amt(value);
			return;
		}
		if ($part_bill_crryovr_amt.equalsIgnoreCase(name)) {
			part_bill_crryovr_amt(value);
			return;
		}
		if ($rcv_act_d_cnt.equalsIgnoreCase(name)) {
			rcv_act_d_cnt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($part_bill_ttl_amt.equalsIgnoreCase(name)) {
			part_bill_ttl_amt(value);
			return;
		}
		if ($part_bill_crryovr_amt.equalsIgnoreCase(name)) {
			part_bill_crryovr_amt(value);
			return;
		}
		if ($rcv_act_d_cnt.equalsIgnoreCase(name)) {
			rcv_act_d_cnt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dlv_dt.equalsIgnoreCase(name)) {
			dlv_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			base_sls_ac_dt(value);
			return;
		}
		if ($sort_dlv_dt.equalsIgnoreCase(name)) {
			sort_dlv_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			ship_dlv_slip_multi_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($inc_tax_flg1.equalsIgnoreCase(name)) {
			inc_tax_flg1(value);
			return;
		}
		if ($bill_tax_disp_flg1.equalsIgnoreCase(name)) {
			bill_tax_disp_flg1(value);
			return;
		}
		if ($inc_tax_flg2.equalsIgnoreCase(name)) {
			inc_tax_flg2(value);
			return;
		}
		if ($bill_tax_disp_flg2.equalsIgnoreCase(name)) {
			bill_tax_disp_flg2(value);
			return;
		}
		if ($setoff_flg.equalsIgnoreCase(name)) {
			setoff_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

