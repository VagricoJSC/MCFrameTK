package mcframe.serverMSBG.MSBGL0100;

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
 * ブロック"Srch01_Dtl2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Dtl2R_MC_A extends MCConstRow {

	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public static final String $bill_d_typ = "bill_d_typ";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public static final String $slip_sts_typ_nm = "slip_sts_typ_nm";
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
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public static final String $ar_typ_nm = "ar_typ_nm";
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public static final String $act_no = "act_no";
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public static final String $act_rev = "act_rev";
	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public static final String $act_seq = "act_seq";
	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public static final String $act_d_no = "act_d_no";
	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public static final String $act_d_seq = "act_d_seq";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
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
	 * Sales recorded project No. 売上案件ＮＯ.<p>
	 *
	 */
	public static final String $sls_wrk_no = "sls_wrk_no";
	/**
	 * Sales recorded project name 売上案件名.<p>
	 *
	 */
	public static final String $sls_wrk_nm = "sls_wrk_nm";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_dec_place = "trd_dec_place";
	/**
	 * Quantity 数量.<p>
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
	 * Base number of decimal places 基準小数部有効桁数.<p>
	 *
	 */
	public static final String $base_dec_place = "base_dec_place";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public static final String $trd_cur_inc_tax_amt = "trd_cur_inc_tax_amt";
	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public static final String $base_cur_upri = "base_cur_upri";
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public static final String $base_cur_inc_tax_amt = "base_cur_inc_tax_amt";
	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Offset amount (Base currency) 基準通貨相殺額.<p>
	 *
	 */
	public static final String $base_cur_setoff_amt = "base_cur_setoff_amt";
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
	 * Tax amount 税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public static final String $base_cur_dscnt_amt = "base_cur_dscnt_amt";
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public static final String $rcv_mtd_cd = "rcv_mtd_cd";
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public static final String $rcv_mtd_nm = "rcv_mtd_nm";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
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
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public static final String $sls_usr_nm = "sls_usr_nm";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
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
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public static final String $acst_grp_cd1 = "acst_grp_cd1";
	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public static final String $acst_grp_nm1 = "acst_grp_nm1";
	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public static final String $acst_grp_cd2 = "acst_grp_cd2";
	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public static final String $acst_grp_nm2 = "acst_grp_nm2";
	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public static final String $acst_grp_cd3 = "acst_grp_cd3";
	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public static final String $acst_grp_nm3 = "acst_grp_nm3";
	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public static final String $acst_grp_cd4 = "acst_grp_cd4";
	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public static final String $acst_grp_nm4 = "acst_grp_nm4";
	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public static final String $acst_grp_cd5 = "acst_grp_cd5";
	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public static final String $acst_grp_nm5 = "acst_grp_nm5";
	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public static final String $acst_grp_cd6 = "acst_grp_cd6";
	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public static final String $acst_grp_nm6 = "acst_grp_nm6";
	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public static final String $acst_grp_cd7 = "acst_grp_cd7";
	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public static final String $acst_grp_nm7 = "acst_grp_nm7";
	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public static final String $acst_grp_cd8 = "acst_grp_cd8";
	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public static final String $acst_grp_nm8 = "acst_grp_nm8";
	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public static final String $acst_grp_cd9 = "acst_grp_cd9";
	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public static final String $acst_grp_nm9 = "acst_grp_nm9";
	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $acst_grp_cd10 = "acst_grp_cd10";
	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public static final String $acst_grp_nm10 = "acst_grp_nm10";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";


	public static final MCMeta bill_d_typ_META = createCommonMeta($bill_d_typ, mcframe.commonMS.meta.MS_META.BILL_D_TYP);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta slip_sts_typ_nm_META = createCommonMeta($slip_sts_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta ar_typ_nm_META = createCommonMeta($ar_typ_nm, mcframe.commonMA.meta.MA_META.AR_TYP_NM);
	public static final MCMeta act_no_META = createCommonMeta($act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta act_rev_META = createCommonMeta($act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta act_seq_META = createCommonMeta($act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta act_d_no_META = createCommonMeta($act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta act_d_seq_META = createCommonMeta($act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sls_wrk_no_META = createCommonMeta($sls_wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta sls_wrk_nm_META = createCommonMeta($sls_wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_dec_place_META = createCommonMeta($trd_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_dec_place_META = createCommonMeta($base_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_inc_tax_amt_META = createCommonMeta($trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_inc_tax_amt_META = createCommonMeta($base_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_setoff_amt_META = createCommonMeta($base_cur_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_dscnt_amt_META = createCommonMeta($base_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd_META = createCommonMeta($rcv_mtd_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm_META = createCommonMeta($rcv_mtd_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ship_dlv_slip_no_META = createCommonMeta($ship_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta ship_dlv_slip_d_no_META = createCommonMeta($ship_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ship_dlv_slip_multi_flg_META = createCommonMeta($ship_dlv_slip_multi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_grp_cd1_META = createCommonMeta($acst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm1_META = createCommonMeta($acst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd2_META = createCommonMeta($acst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm2_META = createCommonMeta($acst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd3_META = createCommonMeta($acst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm3_META = createCommonMeta($acst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd4_META = createCommonMeta($acst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm4_META = createCommonMeta($acst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd5_META = createCommonMeta($acst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm5_META = createCommonMeta($acst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd6_META = createCommonMeta($acst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm6_META = createCommonMeta($acst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd7_META = createCommonMeta($acst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm7_META = createCommonMeta($acst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd8_META = createCommonMeta($acst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm8_META = createCommonMeta($acst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd9_META = createCommonMeta($acst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm9_META = createCommonMeta($acst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta acst_grp_cd10_META = createCommonMeta($acst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta acst_grp_nm10_META = createCommonMeta($acst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<Srch01_Dtl2R> constMetas = new ConstMetaList<Srch01_Dtl2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_d_typ_META,
			ac_dt_META,
			slip_sts_typ_META,
			slip_sts_typ_nm_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			ar_typ_META,
			ar_typ_nm_META,
			act_no_META,
			act_rev_META,
			act_seq_META,
			act_d_no_META,
			act_d_seq_META,
			iv_no_META,
			wrk_no_META,
			wrk_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			sls_wrk_no_META,
			sls_wrk_nm_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_dec_place_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_dec_place_META,
			base_unit_qty_META,
			inc_tax_flg_META,
			interim_flg_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_inc_tax_amt_META,
			base_cur_upri_META,
			base_cur_amt_META,
			base_cur_inc_tax_amt_META,
			setoff_amt_META,
			base_cur_setoff_amt_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			trd_cur_tax_amt_META,
			trd_cur_dscnt_amt_META,
			base_cur_tax_amt_META,
			base_cur_dscnt_amt_META,
			rcv_mtd_cd_META,
			rcv_mtd_nm_META,
			acst_cd_META,
			acst_nm_META,
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			cst_cd_META,
			cst_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			slo_no_META,
			slo_d_no_META,
			cst_po_no_META,
			cst_po_d_no_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			ship_dlv_slip_no_META,
			ship_dlv_slip_d_no_META,
			ship_dlv_slip_multi_flg_META,
			acst_grp_cd1_META,
			acst_grp_nm1_META,
			acst_grp_cd2_META,
			acst_grp_nm2_META,
			acst_grp_cd3_META,
			acst_grp_nm3_META,
			acst_grp_cd4_META,
			acst_grp_nm4_META,
			acst_grp_cd5_META,
			acst_grp_nm5_META,
			acst_grp_cd6_META,
			acst_grp_nm6_META,
			acst_grp_cd7_META,
			acst_grp_nm7_META,
			acst_grp_cd8_META,
			acst_grp_nm8_META,
			acst_grp_cd9_META,
			acst_grp_nm9_META,
			acst_grp_cd10_META,
			acst_grp_nm10_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META
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
				{$slip_sts_typ, "MAC_SLIP_STS_TYP"},	// slip_sts_typ
				{$ar_typ, "MAC_AR_TYP"}	// ar_typ
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
	protected Srch01_Dtl2R_MC_A(ConstMetaList<? extends Srch01_Dtl2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Dtl2R clone() {
		return (Srch01_Dtl2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Dtl2R createInstance() {
		return (Srch01_Dtl2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Dtl2R getValues(String... names) {
		return (Srch01_Dtl2R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public String bill_d_typ() {
		return getConstString(offset + 0, $bill_d_typ);
	}

	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public void bill_d_typ(String value) {
		setConstString(offset + 0, $bill_d_typ, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 1, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 1, $ac_dt, value);
	}


	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 2, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 2, $slip_sts_typ, value);
	}


	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public String slip_sts_typ_nm() {
		return getConstString(offset + 3, $slip_sts_typ_nm);
	}

	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public void slip_sts_typ_nm(String value) {
		setConstString(offset + 3, $slip_sts_typ_nm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 4, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 4, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 5, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 5, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 6, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 6, $trd_ptn_typ, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 7, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 7, $ar_typ, value);
	}


	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public String ar_typ_nm() {
		return getConstString(offset + 8, $ar_typ_nm);
	}

	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public void ar_typ_nm(String value) {
		setConstString(offset + 8, $ar_typ_nm, value);
	}


	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 9, $act_no);
	}

	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 9, $act_no, value);
	}


	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCNumber act_rev() {
		return getConstNumber(offset + 10, $act_rev);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(MCNumber value) {
		setConstNumber(offset + 10, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(int value) {
		setConstNumber(offset + 10, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(long value) {
		setConstNumber(offset + 10, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(float value) {
		setConstNumber(offset + 10, $act_rev, value);
	}

	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public void act_rev(double value) {
		setConstNumber(offset + 10, $act_rev, value);
	}


	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public MCNumber act_seq() {
		return getConstNumber(offset + 11, $act_seq);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(MCNumber value) {
		setConstNumber(offset + 11, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(int value) {
		setConstNumber(offset + 11, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(long value) {
		setConstNumber(offset + 11, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(float value) {
		setConstNumber(offset + 11, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(double value) {
		setConstNumber(offset + 11, $act_seq, value);
	}


	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 12, $act_d_no);
	}

	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 12, $act_d_no, value);
	}


	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public MCNumber act_d_seq() {
		return getConstNumber(offset + 13, $act_d_seq);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(MCNumber value) {
		setConstNumber(offset + 13, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(int value) {
		setConstNumber(offset + 13, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(long value) {
		setConstNumber(offset + 13, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(float value) {
		setConstNumber(offset + 13, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(double value) {
		setConstNumber(offset + 13, $act_d_seq, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 14, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 14, $iv_no, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 15, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 15, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 16, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 16, $wrk_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 17, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 17, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 18, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 18, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 19, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 19, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 20, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 20, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 21, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 21, $itm_nm, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 22, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 22, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 23, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 23, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 24, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 24, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 25, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 25, $sno4, value);
	}


	/**
	 * Sales recorded project No. 売上案件ＮＯ.<p>
	 *
	 */
	public String sls_wrk_no() {
		return getConstString(offset + 26, $sls_wrk_no);
	}

	/**
	 * Sales recorded project No. 売上案件ＮＯ.<p>
	 *
	 */
	public void sls_wrk_no(String value) {
		setConstString(offset + 26, $sls_wrk_no, value);
	}


	/**
	 * Sales recorded project name 売上案件名.<p>
	 *
	 */
	public String sls_wrk_nm() {
		return getConstString(offset + 27, $sls_wrk_nm);
	}

	/**
	 * Sales recorded project name 売上案件名.<p>
	 *
	 */
	public void sls_wrk_nm(String value) {
		setConstString(offset + 27, $sls_wrk_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 28, $trd_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 28, $trd_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 29, $trd_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 29, $trd_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_dec_place() {
		return getConstNumber(offset + 30, $trd_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(MCNumber value) {
		setConstNumber(offset + 30, $trd_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(int value) {
		setConstNumber(offset + 30, $trd_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(long value) {
		setConstNumber(offset + 30, $trd_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(float value) {
		setConstNumber(offset + 30, $trd_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void trd_dec_place(double value) {
		setConstNumber(offset + 30, $trd_dec_place, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 31, $trd_unit_qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 31, $trd_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 31, $trd_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 31, $trd_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 31, $trd_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 31, $trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 32, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 32, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 33, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 33, $base_unit_nm, value);
	}


	/**
	 * Base number of decimal places 基準小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_dec_place() {
		return getConstNumber(offset + 34, $base_dec_place);
	}

	/**
	 * Base number of decimal places 基準小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(MCNumber value) {
		setConstNumber(offset + 34, $base_dec_place, value);
	}

	/**
	 * Base number of decimal places 基準小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(int value) {
		setConstNumber(offset + 34, $base_dec_place, value);
	}

	/**
	 * Base number of decimal places 基準小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(long value) {
		setConstNumber(offset + 34, $base_dec_place, value);
	}

	/**
	 * Base number of decimal places 基準小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(float value) {
		setConstNumber(offset + 34, $base_dec_place, value);
	}

	/**
	 * Base number of decimal places 基準小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(double value) {
		setConstNumber(offset + 34, $base_dec_place, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 35, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 36, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 36, $inc_tax_flg, value);
	}


	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 37, $interim_flg);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 37, $interim_flg, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 38, $trd_cur_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 38, $trd_cur_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 38, $trd_cur_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 38, $trd_cur_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 38, $trd_cur_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 38, $trd_cur_upri, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 39, $trd_cur_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 39, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 39, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 39, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 39, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 39, $trd_cur_amt, value);
	}


	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 40, $trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 40, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 40, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 40, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 40, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 40, $trd_cur_inc_tax_amt, value);
	}


	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 41, $base_cur_upri);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 41, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 41, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 41, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 41, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 41, $base_cur_upri, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 42, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 42, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 42, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 42, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 42, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 42, $base_cur_amt, value);
	}


	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCNumber base_cur_inc_tax_amt() {
		return getConstNumber(offset + 43, $base_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 43, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 43, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 43, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 43, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 43, $base_cur_inc_tax_amt, value);
	}


	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 44, $setoff_amt);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 44, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 44, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 44, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 44, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 44, $setoff_amt, value);
	}


	/**
	 * Offset amount (Base currency) 基準通貨相殺額.<p>
	 *
	 */
	public MCNumber base_cur_setoff_amt() {
		return getConstNumber(offset + 45, $base_cur_setoff_amt);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(MCNumber value) {
		setConstNumber(offset + 45, $base_cur_setoff_amt, value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(int value) {
		setConstNumber(offset + 45, $base_cur_setoff_amt, value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(long value) {
		setConstNumber(offset + 45, $base_cur_setoff_amt, value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(float value) {
		setConstNumber(offset + 45, $base_cur_setoff_amt, value);
	}

	/**
	 * Offset amount (Base currency) 基準通貨相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(double value) {
		setConstNumber(offset + 45, $base_cur_setoff_amt, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 46, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 46, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 47, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 47, $tax_nm, value);
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
	 * Tax amount 税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 49, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 49, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 49, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 49, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 49, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 49, $trd_cur_tax_amt, value);
	}


	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 50, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 50, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 50, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 50, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 50, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 50, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 51, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 51, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 51, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 51, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 51, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 51, $base_cur_tax_amt, value);
	}


	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return getConstNumber(offset + 52, $base_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 52, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		setConstNumber(offset + 52, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		setConstNumber(offset + 52, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		setConstNumber(offset + 52, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		setConstNumber(offset + 52, $base_cur_dscnt_amt, value);
	}


	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String rcv_mtd_cd() {
		return getConstString(offset + 53, $rcv_mtd_cd);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void rcv_mtd_cd(String value) {
		setConstString(offset + 53, $rcv_mtd_cd, value);
	}


	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public String rcv_mtd_nm() {
		return getConstString(offset + 54, $rcv_mtd_nm);
	}

	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public void rcv_mtd_nm(String value) {
		setConstString(offset + 54, $rcv_mtd_nm, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 55, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 55, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 56, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 56, $acst_nm, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 57, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 57, $ar_dpt_cd, value);
	}


	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 58, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 58, $ar_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 59, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 59, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 60, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 60, $wg_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 61, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 61, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 62, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 62, $cst_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 63, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 63, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 64, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 64, $dlv_nm, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 65, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 65, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 66, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 66, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 67, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 67, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 68, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 68, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 69, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 69, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 70, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 70, $dest_nm3, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 71, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 71, $sls_dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 72, $sls_dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 72, $sls_dpt_nm, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 73, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 73, $sls_usr_cd, value);
	}


	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 74, $sls_usr_nm);
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 74, $sls_usr_nm, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 75, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 75, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 76, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 76, $slo_d_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 77, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 77, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 78, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 78, $cst_po_d_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 79, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 79, $dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 80, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 80, $dlv_slip_d_no, value);
	}


	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_no() {
		return getConstString(offset + 81, $ship_dlv_slip_no);
	}

	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_no(String value) {
		setConstString(offset + 81, $ship_dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_d_no() {
		return getConstString(offset + 82, $ship_dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_d_no(String value) {
		setConstString(offset + 82, $ship_dlv_slip_d_no, value);
	}


	/**
	 * Multiple delivery note details at shipping flg. 出荷時納品書明細複数ＦＬＧ.<p>
	 *
	 */
	public boolean ship_dlv_slip_multi_flg() {
		return getConstBoolean(offset + 83, $ship_dlv_slip_multi_flg);
	}

	/**
	 * Multiple delivery note details at shipping flg. 出荷時納品書明細複数ＦＬＧ.<p>
	 *
	 */
	public void ship_dlv_slip_multi_flg(boolean value) {
		setConstBoolean(offset + 83, $ship_dlv_slip_multi_flg, value);
	}


	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public String acst_grp_cd1() {
		return getConstString(offset + 84, $acst_grp_cd1);
	}

	/**
	 * AR customer classification cd. 1 売掛先分類ＣＤ１.<p>
	 *
	 */
	public void acst_grp_cd1(String value) {
		setConstString(offset + 84, $acst_grp_cd1, value);
	}


	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public String acst_grp_nm1() {
		return getConstString(offset + 85, $acst_grp_nm1);
	}

	/**
	 * AR customer classification name 1 売掛先分類名１.<p>
	 *
	 */
	public void acst_grp_nm1(String value) {
		setConstString(offset + 85, $acst_grp_nm1, value);
	}


	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public String acst_grp_cd2() {
		return getConstString(offset + 86, $acst_grp_cd2);
	}

	/**
	 * AR customer classification cd. 2 売掛先分類ＣＤ２.<p>
	 *
	 */
	public void acst_grp_cd2(String value) {
		setConstString(offset + 86, $acst_grp_cd2, value);
	}


	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public String acst_grp_nm2() {
		return getConstString(offset + 87, $acst_grp_nm2);
	}

	/**
	 * AR customer classification name 2 売掛先分類名２.<p>
	 *
	 */
	public void acst_grp_nm2(String value) {
		setConstString(offset + 87, $acst_grp_nm2, value);
	}


	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public String acst_grp_cd3() {
		return getConstString(offset + 88, $acst_grp_cd3);
	}

	/**
	 * AR customer classification cd. 3 売掛先分類ＣＤ３.<p>
	 *
	 */
	public void acst_grp_cd3(String value) {
		setConstString(offset + 88, $acst_grp_cd3, value);
	}


	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public String acst_grp_nm3() {
		return getConstString(offset + 89, $acst_grp_nm3);
	}

	/**
	 * AR customer classification name 3 売掛先分類名３.<p>
	 *
	 */
	public void acst_grp_nm3(String value) {
		setConstString(offset + 89, $acst_grp_nm3, value);
	}


	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public String acst_grp_cd4() {
		return getConstString(offset + 90, $acst_grp_cd4);
	}

	/**
	 * AR customer classification cd. 4 売掛先分類ＣＤ４.<p>
	 *
	 */
	public void acst_grp_cd4(String value) {
		setConstString(offset + 90, $acst_grp_cd4, value);
	}


	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public String acst_grp_nm4() {
		return getConstString(offset + 91, $acst_grp_nm4);
	}

	/**
	 * AR customer classification name 4 売掛先分類名４.<p>
	 *
	 */
	public void acst_grp_nm4(String value) {
		setConstString(offset + 91, $acst_grp_nm4, value);
	}


	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public String acst_grp_cd5() {
		return getConstString(offset + 92, $acst_grp_cd5);
	}

	/**
	 * AR customer classification cd. 5 売掛先分類ＣＤ５.<p>
	 *
	 */
	public void acst_grp_cd5(String value) {
		setConstString(offset + 92, $acst_grp_cd5, value);
	}


	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public String acst_grp_nm5() {
		return getConstString(offset + 93, $acst_grp_nm5);
	}

	/**
	 * AR customer classification name 5 売掛先分類名５.<p>
	 *
	 */
	public void acst_grp_nm5(String value) {
		setConstString(offset + 93, $acst_grp_nm5, value);
	}


	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public String acst_grp_cd6() {
		return getConstString(offset + 94, $acst_grp_cd6);
	}

	/**
	 * AR customer classification cd. 6 売掛先分類ＣＤ６.<p>
	 *
	 */
	public void acst_grp_cd6(String value) {
		setConstString(offset + 94, $acst_grp_cd6, value);
	}


	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public String acst_grp_nm6() {
		return getConstString(offset + 95, $acst_grp_nm6);
	}

	/**
	 * AR customer classification name 6 売掛先分類名６.<p>
	 *
	 */
	public void acst_grp_nm6(String value) {
		setConstString(offset + 95, $acst_grp_nm6, value);
	}


	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public String acst_grp_cd7() {
		return getConstString(offset + 96, $acst_grp_cd7);
	}

	/**
	 * AR customer classification cd. 7 売掛先分類ＣＤ７.<p>
	 *
	 */
	public void acst_grp_cd7(String value) {
		setConstString(offset + 96, $acst_grp_cd7, value);
	}


	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public String acst_grp_nm7() {
		return getConstString(offset + 97, $acst_grp_nm7);
	}

	/**
	 * AR customer classification name 7 売掛先分類名７.<p>
	 *
	 */
	public void acst_grp_nm7(String value) {
		setConstString(offset + 97, $acst_grp_nm7, value);
	}


	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public String acst_grp_cd8() {
		return getConstString(offset + 98, $acst_grp_cd8);
	}

	/**
	 * AR customer classification cd. 8 売掛先分類ＣＤ８.<p>
	 *
	 */
	public void acst_grp_cd8(String value) {
		setConstString(offset + 98, $acst_grp_cd8, value);
	}


	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public String acst_grp_nm8() {
		return getConstString(offset + 99, $acst_grp_nm8);
	}

	/**
	 * AR customer classification name 8 売掛先分類名８.<p>
	 *
	 */
	public void acst_grp_nm8(String value) {
		setConstString(offset + 99, $acst_grp_nm8, value);
	}


	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public String acst_grp_cd9() {
		return getConstString(offset + 100, $acst_grp_cd9);
	}

	/**
	 * AR customer classification cd. 9 売掛先分類ＣＤ９.<p>
	 *
	 */
	public void acst_grp_cd9(String value) {
		setConstString(offset + 100, $acst_grp_cd9, value);
	}


	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public String acst_grp_nm9() {
		return getConstString(offset + 101, $acst_grp_nm9);
	}

	/**
	 * AR customer classification name 9 売掛先分類名９.<p>
	 *
	 */
	public void acst_grp_nm9(String value) {
		setConstString(offset + 101, $acst_grp_nm9, value);
	}


	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public String acst_grp_cd10() {
		return getConstString(offset + 102, $acst_grp_cd10);
	}

	/**
	 * AR customer classification cd. 10 売掛先分類ＣＤ１０.<p>
	 *
	 */
	public void acst_grp_cd10(String value) {
		setConstString(offset + 102, $acst_grp_cd10, value);
	}


	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public String acst_grp_nm10() {
		return getConstString(offset + 103, $acst_grp_nm10);
	}

	/**
	 * AR customer classification name 10 売掛先分類名１０.<p>
	 *
	 */
	public void acst_grp_nm10(String value) {
		setConstString(offset + 103, $acst_grp_nm10, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 104, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 104, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 105, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 105, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 106, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 106, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 107, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 107, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 108, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 108, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 109, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 109, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 110, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 110, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 111, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 111, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 112, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 112, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 113, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 113, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 114, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 114, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			return bill_d_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($sls_wrk_no.equalsIgnoreCase(name)) {
			return sls_wrk_no();
		}
		if ($sls_wrk_nm.equalsIgnoreCase(name)) {
			return sls_wrk_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
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
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
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
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			return acst_grp_cd1();
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			return acst_grp_nm1();
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			return acst_grp_cd2();
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			return acst_grp_nm2();
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			return acst_grp_cd3();
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			return acst_grp_nm3();
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			return acst_grp_cd4();
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			return acst_grp_nm4();
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			return acst_grp_cd5();
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			return acst_grp_nm5();
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			return acst_grp_cd6();
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			return acst_grp_nm6();
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			return acst_grp_cd7();
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			return acst_grp_nm7();
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			return acst_grp_cd8();
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			return acst_grp_nm8();
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			return acst_grp_cd9();
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			return acst_grp_nm9();
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			return acst_grp_cd10();
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			return acst_grp_nm10();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			return trd_dec_place();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			return ship_dlv_slip_multi_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			return bill_d_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($sls_wrk_no.equalsIgnoreCase(name)) {
			return sls_wrk_no();
		}
		if ($sls_wrk_nm.equalsIgnoreCase(name)) {
			return sls_wrk_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
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
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
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
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			return acst_grp_cd1();
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			return acst_grp_nm1();
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			return acst_grp_cd2();
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			return acst_grp_nm2();
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			return acst_grp_cd3();
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			return acst_grp_nm3();
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			return acst_grp_cd4();
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			return acst_grp_nm4();
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			return acst_grp_cd5();
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			return acst_grp_nm5();
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			return acst_grp_cd6();
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			return acst_grp_nm6();
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			return acst_grp_cd7();
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			return acst_grp_nm7();
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			return acst_grp_cd8();
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			return acst_grp_nm8();
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			return acst_grp_cd9();
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			return acst_grp_nm9();
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			return acst_grp_cd10();
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			return acst_grp_nm10();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			return trd_dec_place();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
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
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			return ship_dlv_slip_multi_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			bill_d_typ(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
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
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($sls_wrk_no.equalsIgnoreCase(name)) {
			sls_wrk_no(value);
			return;
		}
		if ($sls_wrk_nm.equalsIgnoreCase(name)) {
			sls_wrk_nm(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
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
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			rcv_mtd_nm(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
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
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			acst_grp_cd1(value);
			return;
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			acst_grp_nm1(value);
			return;
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			acst_grp_cd2(value);
			return;
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			acst_grp_nm2(value);
			return;
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			acst_grp_cd3(value);
			return;
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			acst_grp_nm3(value);
			return;
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			acst_grp_cd4(value);
			return;
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			acst_grp_nm4(value);
			return;
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			acst_grp_cd5(value);
			return;
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			acst_grp_nm5(value);
			return;
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			acst_grp_cd6(value);
			return;
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			acst_grp_nm6(value);
			return;
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			acst_grp_cd7(value);
			return;
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			acst_grp_nm7(value);
			return;
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			acst_grp_cd8(value);
			return;
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			acst_grp_nm8(value);
			return;
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			acst_grp_cd9(value);
			return;
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			acst_grp_nm9(value);
			return;
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			acst_grp_cd10(value);
			return;
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			acst_grp_nm10(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			ship_dlv_slip_multi_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			bill_d_typ(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
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
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($sls_wrk_no.equalsIgnoreCase(name)) {
			sls_wrk_no(value);
			return;
		}
		if ($sls_wrk_nm.equalsIgnoreCase(name)) {
			sls_wrk_nm(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
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
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			rcv_mtd_nm(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
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
		if ($acst_grp_cd1.equalsIgnoreCase(name)) {
			acst_grp_cd1(value);
			return;
		}
		if ($acst_grp_nm1.equalsIgnoreCase(name)) {
			acst_grp_nm1(value);
			return;
		}
		if ($acst_grp_cd2.equalsIgnoreCase(name)) {
			acst_grp_cd2(value);
			return;
		}
		if ($acst_grp_nm2.equalsIgnoreCase(name)) {
			acst_grp_nm2(value);
			return;
		}
		if ($acst_grp_cd3.equalsIgnoreCase(name)) {
			acst_grp_cd3(value);
			return;
		}
		if ($acst_grp_nm3.equalsIgnoreCase(name)) {
			acst_grp_nm3(value);
			return;
		}
		if ($acst_grp_cd4.equalsIgnoreCase(name)) {
			acst_grp_cd4(value);
			return;
		}
		if ($acst_grp_nm4.equalsIgnoreCase(name)) {
			acst_grp_nm4(value);
			return;
		}
		if ($acst_grp_cd5.equalsIgnoreCase(name)) {
			acst_grp_cd5(value);
			return;
		}
		if ($acst_grp_nm5.equalsIgnoreCase(name)) {
			acst_grp_nm5(value);
			return;
		}
		if ($acst_grp_cd6.equalsIgnoreCase(name)) {
			acst_grp_cd6(value);
			return;
		}
		if ($acst_grp_nm6.equalsIgnoreCase(name)) {
			acst_grp_nm6(value);
			return;
		}
		if ($acst_grp_cd7.equalsIgnoreCase(name)) {
			acst_grp_cd7(value);
			return;
		}
		if ($acst_grp_nm7.equalsIgnoreCase(name)) {
			acst_grp_nm7(value);
			return;
		}
		if ($acst_grp_cd8.equalsIgnoreCase(name)) {
			acst_grp_cd8(value);
			return;
		}
		if ($acst_grp_nm8.equalsIgnoreCase(name)) {
			acst_grp_nm8(value);
			return;
		}
		if ($acst_grp_cd9.equalsIgnoreCase(name)) {
			acst_grp_cd9(value);
			return;
		}
		if ($acst_grp_nm9.equalsIgnoreCase(name)) {
			acst_grp_nm9(value);
			return;
		}
		if ($acst_grp_cd10.equalsIgnoreCase(name)) {
			acst_grp_cd10(value);
			return;
		}
		if ($acst_grp_nm10.equalsIgnoreCase(name)) {
			acst_grp_nm10(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($trd_dec_place.equalsIgnoreCase(name)) {
			trd_dec_place(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($ship_dlv_slip_multi_flg.equalsIgnoreCase(name)) {
			ship_dlv_slip_multi_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

