package mcframe.serverMSBE.MSBEL2200;

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
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public static final String $sim_cnd_grp_no = "sim_cnd_grp_no";
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public static final String $pr_sts_typ = "pr_sts_typ";
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public static final String $pr_sts_typ_nm = "pr_sts_typ_nm";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public static final String $arr_schd_dt = "arr_schd_dt";
	/**
	 * Scheduled receipt time 入荷予定時刻.<p>
	 *
	 */
	public static final String $arr_schd_hm = "arr_schd_hm";
	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public static final String $arr_dt = "arr_dt";
	/**
	 * Receipt time 入荷時刻.<p>
	 *
	 */
	public static final String $arr_hm = "arr_hm";
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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 * Rounding type (Purchase tax) 仕入税額端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public static final String $in_to_id_typ = "in_to_id_typ";
	/**
	 * Delivery destination identification type name 納入先識別区分名.<p>
	 *
	 */
	public static final String $in_to_id_typ_nm = "in_to_id_typ_nm";
	/**
	 * Delivery destination cd. 納入先ＣＤ.<p>
	 *
	 */
	public static final String $in_to_id_cd = "in_to_id_cd";
	/**
	 * Delivery destination name 納入先名.<p>
	 *
	 */
	public static final String $in_to_id_nm = "in_to_id_nm";
	/**
	 * Dept. 部署.<p>
	 *
	 */
	public static final String $in_to_cntct_dpt = "in_to_cntct_dpt";
	/**
	 * PIC 担当者.<p>
	 *
	 */
	public static final String $in_to_cntct_psn = "in_to_cntct_psn";
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public static final String $in_to_zip_cd = "in_to_zip_cd";
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public static final String $in_to_addr1 = "in_to_addr1";
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public static final String $in_to_addr2 = "in_to_addr2";
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public static final String $in_to_addr3 = "in_to_addr3";
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public static final String $in_to_addr4 = "in_to_addr4";
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public static final String $in_to_tel = "in_to_tel";
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public static final String $in_to_fax = "in_to_fax";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $in_to_cntry_cd = "in_to_cntry_cd";
	/**
	 * Country name 国名.<p>
	 *
	 */
	public static final String $in_to_cntry_nm = "in_to_cntry_nm";
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public static final String $purc_usr_nm = "purc_usr_nm";
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public static final String $purc_dpt_nm = "purc_dpt_nm";
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
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
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
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public static final String $arr_schd_qty = "arr_schd_qty";
	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public static final String $arr_act_qty = "arr_act_qty";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public static final String $trd_cur_proc_upri = "trd_cur_proc_upri";
	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_upri = "trd_cur_onr_prov_upri";
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public static final String $trd_cur_proc_amt = "trd_cur_proc_amt";
	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_amt = "trd_cur_onr_prov_amt";
	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public static final String $inc_ctax_amt = "inc_ctax_amt";
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
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_amt_dec_place = "trd_amt_dec_place";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_upri_dec_place = "trd_upri_dec_place";
	/**
	 * Set exchange rate flg. 為替レート指定ＦＬＧ.<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public static final String $base_cur_upri = "base_cur_upri";
	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public static final String $base_cur_dscnt_amt = "base_cur_dscnt_amt";
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public static final String $base_cur_proc_upri = "base_cur_proc_upri";
	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public static final String $base_cur_onr_prov_upri = "base_cur_onr_prov_upri";
	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public static final String $base_cur_proc_amt = "base_cur_proc_amt";
	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public static final String $base_cur_onr_prov_amt = "base_cur_onr_prov_amt";
	/**
	 * Tax included amount (Base currency) 基準通貨税込額.<p>
	 *
	 */
	public static final String $base_cur_inc_ctax_amt = "base_cur_inc_ctax_amt";
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $base_amt_dec_place = "base_amt_dec_place";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $base_upri_dec_place = "base_upri_dec_place";
	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public static final String $ptax_cur_upri = "ptax_cur_upri";
	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public static final String $ptax_cur_dscnt_amt = "ptax_cur_dscnt_amt";
	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public static final String $ptax_cur_amt = "ptax_cur_amt";
	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public static final String $ptax_cur_proc_upri = "ptax_cur_proc_upri";
	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public static final String $ptax_cur_onr_prov_upri = "ptax_cur_onr_prov_upri";
	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public static final String $ptax_cur_proc_amt = "ptax_cur_proc_amt";
	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public static final String $ptax_cur_onr_prov_amt = "ptax_cur_onr_prov_amt";
	/**
	 * Tax included amount (Tax currency) 納税通貨税込額.<p>
	 *
	 */
	public static final String $ptax_cur_inc_ctax_amt = "ptax_cur_inc_ctax_amt";
	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public static final String $ptax_cur_tax_amt = "ptax_cur_tax_amt";
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public static final String $ptax_cur_nm = "ptax_cur_nm";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_amt_dec_place = "ptax_amt_dec_place";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_upri_dec_place = "ptax_upri_dec_place";
	/**
	 * Taxpaying exchange rate specification flg. 納税為替レート指定ＦＬＧ.<p>
	 *
	 */
	public static final String $ptax_xrate_inpt_flg = "ptax_xrate_inpt_flg";
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
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
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
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
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public static final String $trnspt_nm = "trnspt_nm";
	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public static final String $vssl_flght = "vssl_flght";
	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public static final String $load_port_cd = "load_port_cd";
	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public static final String $load_port_nm = "load_port_nm";
	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public static final String $etd_dt = "etd_dt";
	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public static final String $dschrg_port_cd = "dschrg_port_cd";
	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public static final String $dschrg_port_nm = "dschrg_port_nm";
	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public static final String $eta_dt = "eta_dt";
	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public static final String $via_port_cd = "via_port_cd";
	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public static final String $via_port_nm = "via_port_nm";
	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public static final String $via_schd_dt = "via_schd_dt";
	/**
	 * Purchase biz transaction terms cd. 1 購買取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $purc_tterm_cd1 = "purc_tterm_cd1";
	/**
	 * Purchase biz transaction terms name 1 購買取引条件名１.<p>
	 *
	 */
	public static final String $purc_tterm_nm1 = "purc_tterm_nm1";
	/**
	 * Purchase biz transaction terms remarks 1 購買取引条件備考１.<p>
	 *
	 */
	public static final String $purc_tterm_rmrks1 = "purc_tterm_rmrks1";
	/**
	 * Purchase biz transaction terms cd. 2 購買取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $purc_tterm_cd2 = "purc_tterm_cd2";
	/**
	 * Purchase biz transaction terms name 2 購買取引条件名２.<p>
	 *
	 */
	public static final String $purc_tterm_nm2 = "purc_tterm_nm2";
	/**
	 * Purchase biz transaction terms remarks 2 購買取引条件備考２.<p>
	 *
	 */
	public static final String $purc_tterm_rmrks2 = "purc_tterm_rmrks2";
	/**
	 * Purchase biz transaction terms cd. 3 購買取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $purc_tterm_cd3 = "purc_tterm_cd3";
	/**
	 * Purchase biz transaction terms name 3 購買取引条件名３.<p>
	 *
	 */
	public static final String $purc_tterm_nm3 = "purc_tterm_nm3";
	/**
	 * Purchase biz transaction terms remarks 3 購買取引条件備考３.<p>
	 *
	 */
	public static final String $purc_tterm_rmrks3 = "purc_tterm_rmrks3";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public static final String $po_print_rmrks = "po_print_rmrks";
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
	 * Sales order transaction pattern type 受注取引パタン区分.<p>
	 *
	 */
	public static final String $slo_trd_ptn_typ = "slo_trd_ptn_typ";
	/**
	 * Sales order transaction pattern type name 受注取引パタン区分名.<p>
	 *
	 */
	public static final String $slo_trd_ptn_typ_nm = "slo_trd_ptn_typ_nm";
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public static final String $sls_basis_typ_nm = "sls_basis_typ_nm";
	/**
	 * Sales order currency cd. 受注通貨ＣＤ.<p>
	 *
	 */
	public static final String $slo_cur_cd = "slo_cur_cd";
	/**
	 * Sales order currency name 受注通貨名.<p>
	 *
	 */
	public static final String $slo_cur_nm = "slo_cur_nm";
	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public static final String $slo_xrate = "slo_xrate";
	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public static final String $slo_ptax_xrate = "slo_ptax_xrate";
	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $slo_tterm_cd1 = "slo_tterm_cd1";
	/**
	 * Sales order transaction terms name 1 受注取引条件名１.<p>
	 *
	 */
	public static final String $slo_tterm_nm1 = "slo_tterm_nm1";
	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public static final String $slo_tterm_rmrks1 = "slo_tterm_rmrks1";
	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $slo_tterm_cd2 = "slo_tterm_cd2";
	/**
	 * Sales order transaction terms name 2 受注取引条件名２.<p>
	 *
	 */
	public static final String $slo_tterm_nm2 = "slo_tterm_nm2";
	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public static final String $slo_tterm_rmrks2 = "slo_tterm_rmrks2";
	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $slo_tterm_cd3 = "slo_tterm_cd3";
	/**
	 * Sales order transaction terms name 3 受注取引条件名３.<p>
	 *
	 */
	public static final String $slo_tterm_nm3 = "slo_tterm_nm3";
	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public static final String $slo_tterm_rmrks3 = "slo_tterm_rmrks3";
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";
	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public static final String $purc_basis_typ_nm = "purc_basis_typ_nm";
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
	 * Selectable flg. 選択可能ＦＬＧ.<p>
	 *
	 */
	public static final String $selectable_flg = "selectable_flg";
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public static final String $aprv_sts_typ = "aprv_sts_typ";
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public static final String $aprv_sts_typ_nm = "aprv_sts_typ_nm";
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
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
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public static final String $sppl_grp_cd1 = "sppl_grp_cd1";
	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public static final String $sppl_grp_nm1 = "sppl_grp_nm1";
	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public static final String $sppl_grp_cd2 = "sppl_grp_cd2";
	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public static final String $sppl_grp_nm2 = "sppl_grp_nm2";
	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public static final String $sppl_grp_cd3 = "sppl_grp_cd3";
	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public static final String $sppl_grp_nm3 = "sppl_grp_nm3";
	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public static final String $sppl_grp_cd4 = "sppl_grp_cd4";
	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public static final String $sppl_grp_nm4 = "sppl_grp_nm4";
	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public static final String $sppl_grp_cd5 = "sppl_grp_cd5";
	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public static final String $sppl_grp_nm5 = "sppl_grp_nm5";
	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public static final String $sppl_grp_cd6 = "sppl_grp_cd6";
	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public static final String $sppl_grp_nm6 = "sppl_grp_nm6";
	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public static final String $sppl_grp_cd7 = "sppl_grp_cd7";
	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public static final String $sppl_grp_nm7 = "sppl_grp_nm7";
	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public static final String $sppl_grp_cd8 = "sppl_grp_cd8";
	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public static final String $sppl_grp_nm8 = "sppl_grp_nm8";
	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public static final String $sppl_grp_cd9 = "sppl_grp_cd9";
	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public static final String $sppl_grp_nm9 = "sppl_grp_nm9";
	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $sppl_grp_cd10 = "sppl_grp_cd10";
	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public static final String $sppl_grp_nm10 = "sppl_grp_nm10";
	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function 登録機能.<p>
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
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function 更新機能.<p>
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
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * PO transaction unit cd. 発注取引単位ＣＤ.<p>
	 *
	 */
	public static final String $po_trd_unit_cd = "po_trd_unit_cd";
	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public static final String $po_trd_unit_qty = "po_trd_unit_qty";
	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public static final String $po_trd_cur_upri = "po_trd_cur_upri";
	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public static final String $po_trd_cur_dscnt_amt = "po_trd_cur_dscnt_amt";
	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public static final String $po_trd_cur_proc_upri = "po_trd_cur_proc_upri";
	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public static final String $po_trd_cur_onr_prov_upri = "po_trd_cur_onr_prov_upri";
	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public static final String $po_trd_cur_amt = "po_trd_cur_amt";
	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public static final String $po_trd_cur_proc_amt = "po_trd_cur_proc_amt";
	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public static final String $po_trd_cur_onr_prov_amt = "po_trd_cur_onr_prov_amt";
	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public static final String $po_trd_cur_tax_amt = "po_trd_cur_tax_amt";
	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public static final String $po_trd_cur_inc_ctax_amt = "po_trd_cur_inc_ctax_amt";
	/**
	 * PO withholding tax amount 発注源泉税額.<p>
	 *
	 */
	public static final String $po_wtax_amt = "po_wtax_amt";
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
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public static final String $po_trd_unit_conv_qty = "po_trd_unit_conv_qty";
	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public static final String $po_trd_unit_conv_base_qty = "po_trd_unit_conv_base_qty";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
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


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sim_cnd_grp_no_META = createCommonMeta($sim_cnd_grp_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta pr_sts_typ_nm_META = createCommonMeta($pr_sts_typ_nm, mcframe.commonMS.meta.MS_META.PR_STS_TYP_NM);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_dt_META = createCommonMeta($arr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_hm_META = createCommonMeta($arr_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta arr_dt_META = createCommonMeta($arr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_hm_META = createCommonMeta($arr_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta in_to_id_typ_META = createCommonMeta($in_to_id_typ, mcframe.commonMS.meta.MS_META.IN_TO_ID_TYP);
	public static final MCMeta in_to_id_typ_nm_META = createCommonMeta($in_to_id_typ_nm, mcframe.commonMS.meta.MS_META.IN_TO_ID_TYP_NM);
	public static final MCMeta in_to_id_cd_META = createCommonMeta($in_to_id_cd, mcframe.commonMS.meta.MS_META.IN_TO_ID_CD);
	public static final MCMeta in_to_id_nm_META = createCommonMeta($in_to_id_nm, mcframe.commonMS.meta.MS_META.IN_TO_ID_NM);
	public static final MCMeta in_to_cntct_dpt_META = createCommonMeta($in_to_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta in_to_cntct_psn_META = createCommonMeta($in_to_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta in_to_zip_cd_META = createCommonMeta($in_to_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta in_to_addr1_META = createCommonMeta($in_to_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr2_META = createCommonMeta($in_to_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr3_META = createCommonMeta($in_to_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr4_META = createCommonMeta($in_to_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_tel_META = createCommonMeta($in_to_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_fax_META = createCommonMeta($in_to_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_cntry_cd_META = createCommonMeta($in_to_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta in_to_cntry_nm_META = createCommonMeta($in_to_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_usr_nm_META = createCommonMeta($purc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_dpt_nm_META = createCommonMeta($purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta arr_schd_qty_META = createCommonMeta($arr_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta arr_act_qty_META = createCommonMeta($arr_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_proc_upri_META = createCommonMeta($trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_onr_prov_upri_META = createCommonMeta($trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_proc_amt_META = createCommonMeta($trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_onr_prov_amt_META = createCommonMeta($trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inc_ctax_amt_META = createCommonMeta($inc_ctax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_amt_dec_place_META = createCommonMeta($trd_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_upri_dec_place_META = createCommonMeta($trd_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_dscnt_amt_META = createCommonMeta($base_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_proc_upri_META = createCommonMeta($base_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_onr_prov_upri_META = createCommonMeta($base_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_proc_amt_META = createCommonMeta($base_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_onr_prov_amt_META = createCommonMeta($base_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_inc_ctax_amt_META = createCommonMeta($base_cur_inc_ctax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_amt_dec_place_META = createCommonMeta($base_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_upri_dec_place_META = createCommonMeta($base_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_upri_META = createCommonMeta($ptax_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_dscnt_amt_META = createCommonMeta($ptax_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_amt_META = createCommonMeta($ptax_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_proc_upri_META = createCommonMeta($ptax_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_onr_prov_upri_META = createCommonMeta($ptax_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_proc_amt_META = createCommonMeta($ptax_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_onr_prov_amt_META = createCommonMeta($ptax_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_inc_ctax_amt_META = createCommonMeta($ptax_cur_inc_ctax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_tax_amt_META = createCommonMeta($ptax_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_nm_META = createCommonMeta($ptax_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ptax_amt_dec_place_META = createCommonMeta($ptax_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_upri_dec_place_META = createCommonMeta($ptax_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta trnspt_nm_META = createCommonMeta($trnspt_nm, mcframe.commonMA.meta.MA_META.TRNSPT_NM);
	public static final MCMeta vssl_flght_META = createCommonMeta($vssl_flght, mcframe.commonMA.meta.MA_META.VSSL_FLGHT);
	public static final MCMeta load_port_cd_META = createCommonMeta($load_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta load_port_nm_META = createCommonMeta($load_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta etd_dt_META = createCommonMeta($etd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dschrg_port_cd_META = createCommonMeta($dschrg_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta dschrg_port_nm_META = createCommonMeta($dschrg_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta eta_dt_META = createCommonMeta($eta_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_port_cd_META = createCommonMeta($via_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta via_port_nm_META = createCommonMeta($via_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta via_schd_dt_META = createCommonMeta($via_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_tterm_cd1_META = createCommonMeta($purc_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta purc_tterm_nm1_META = createCommonMeta($purc_tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta purc_tterm_rmrks1_META = createCommonMeta($purc_tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta purc_tterm_cd2_META = createCommonMeta($purc_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta purc_tterm_nm2_META = createCommonMeta($purc_tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta purc_tterm_rmrks2_META = createCommonMeta($purc_tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta purc_tterm_cd3_META = createCommonMeta($purc_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta purc_tterm_nm3_META = createCommonMeta($purc_tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta purc_tterm_rmrks3_META = createCommonMeta($purc_tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta po_print_rmrks_META = createCommonMeta($po_print_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_RMRKS);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta slo_trd_ptn_typ_META = createCommonMeta($slo_trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slo_trd_ptn_typ_nm_META = createCommonMeta($slo_trd_ptn_typ_nm, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP_NM);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta sls_basis_typ_nm_META = createCommonMeta($sls_basis_typ_nm, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP_NM);
	public static final MCMeta slo_cur_cd_META = createCommonMeta($slo_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta slo_cur_nm_META = createCommonMeta($slo_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta slo_xrate_META = createCommonMeta($slo_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_ptax_xrate_META = createCommonMeta($slo_ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_tterm_cd1_META = createCommonMeta($slo_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta slo_tterm_nm1_META = createCommonMeta($slo_tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta slo_tterm_rmrks1_META = createCommonMeta($slo_tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta slo_tterm_cd2_META = createCommonMeta($slo_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta slo_tterm_nm2_META = createCommonMeta($slo_tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta slo_tterm_rmrks2_META = createCommonMeta($slo_tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta slo_tterm_cd3_META = createCommonMeta($slo_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta slo_tterm_nm3_META = createCommonMeta($slo_tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta slo_tterm_rmrks3_META = createCommonMeta($slo_tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta purc_basis_typ_nm_META = createCommonMeta($purc_basis_typ_nm, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP_NM);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PURC_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PURC_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PURC_SCHD_SUB_CHAR3);
	public static final MCMeta selectable_flg_META = createCommonMeta($selectable_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta aprv_sts_typ_nm_META = createCommonMeta($aprv_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_STS_TYP_NM);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta sppl_grp_cd1_META = createCommonMeta($sppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm1_META = createCommonMeta($sppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd2_META = createCommonMeta($sppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm2_META = createCommonMeta($sppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd3_META = createCommonMeta($sppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm3_META = createCommonMeta($sppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd4_META = createCommonMeta($sppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm4_META = createCommonMeta($sppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd5_META = createCommonMeta($sppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm5_META = createCommonMeta($sppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd6_META = createCommonMeta($sppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm6_META = createCommonMeta($sppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd7_META = createCommonMeta($sppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm7_META = createCommonMeta($sppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd8_META = createCommonMeta($sppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm8_META = createCommonMeta($sppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd9_META = createCommonMeta($sppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm9_META = createCommonMeta($sppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd10_META = createCommonMeta($sppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm10_META = createCommonMeta($sppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta po_trd_unit_cd_META = createCommonMeta($po_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta po_trd_unit_qty_META = createCommonMeta($po_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta po_trd_cur_upri_META = createCommonMeta($po_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_dscnt_amt_META = createCommonMeta($po_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_proc_upri_META = createCommonMeta($po_trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_onr_prov_upri_META = createCommonMeta($po_trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_amt_META = createCommonMeta($po_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_proc_amt_META = createCommonMeta($po_trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_onr_prov_amt_META = createCommonMeta($po_trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_tax_amt_META = createCommonMeta($po_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_trd_cur_inc_ctax_amt_META = createCommonMeta($po_trd_cur_inc_ctax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta po_wtax_amt_META = createCommonMeta($po_wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta po_trd_unit_conv_qty_META = createCommonMeta($po_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta po_trd_unit_conv_base_qty_META = createCommonMeta($po_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			sim_cnd_grp_no_META,
			pr_sts_typ_META,
			pr_sts_typ_nm_META,
			po_no_META,
			po_d_no_META,
			purc_schd_no_META,
			arr_schd_no_META,
			arr_act_no_META,
			rcpt_iv_no_META,
			purc_schd_dt_META,
			arr_schd_dt_META,
			arr_schd_hm_META,
			arr_dt_META,
			arr_hm_META,
			trd_cd_META,
			trd_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			prnt_lcl_cd_META,
			in_to_id_typ_META,
			in_to_id_typ_nm_META,
			in_to_id_cd_META,
			in_to_id_nm_META,
			in_to_cntct_dpt_META,
			in_to_cntct_psn_META,
			in_to_zip_cd_META,
			in_to_addr1_META,
			in_to_addr2_META,
			in_to_addr3_META,
			in_to_addr4_META,
			in_to_tel_META,
			in_to_fax_META,
			in_to_cntry_cd_META,
			in_to_cntry_nm_META,
			purc_usr_cd_META,
			purc_usr_nm_META,
			purc_dpt_cd_META,
			purc_dpt_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			iv_itm_nm_META,
			maker_cd_META,
			maker_nm_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_qty_META,
			arr_schd_qty_META,
			arr_act_qty_META,
			trd_cur_upri_META,
			repurc_obli_flg_META,
			trd_cur_proc_upri_META,
			trd_cur_onr_prov_upri_META,
			interim_flg_META,
			trd_cur_dscnt_amt_META,
			trd_cur_amt_META,
			trd_cur_proc_amt_META,
			trd_cur_onr_prov_amt_META,
			inc_ctax_amt_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			trd_cur_tax_amt_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_amt_dec_place_META,
			trd_upri_dec_place_META,
			xrate_inpt_flg_META,
			xrate_META,
			base_cur_upri_META,
			base_cur_dscnt_amt_META,
			base_cur_amt_META,
			base_cur_proc_upri_META,
			base_cur_onr_prov_upri_META,
			base_cur_proc_amt_META,
			base_cur_onr_prov_amt_META,
			base_cur_inc_ctax_amt_META,
			base_cur_tax_amt_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_amt_dec_place_META,
			base_upri_dec_place_META,
			ptax_cur_upri_META,
			ptax_cur_dscnt_amt_META,
			ptax_cur_amt_META,
			ptax_cur_proc_upri_META,
			ptax_cur_onr_prov_upri_META,
			ptax_cur_proc_amt_META,
			ptax_cur_onr_prov_amt_META,
			ptax_cur_inc_ctax_amt_META,
			ptax_cur_tax_amt_META,
			ptax_cur_cd_META,
			ptax_cur_nm_META,
			ptax_amt_dec_place_META,
			ptax_upri_dec_place_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_META,
			wtax_rate_META,
			wtax_amt_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			slo_no_META,
			slo_d_no_META,
			trnspt_cd_META,
			trnspt_nm_META,
			vssl_flght_META,
			load_port_cd_META,
			load_port_nm_META,
			etd_dt_META,
			dschrg_port_cd_META,
			dschrg_port_nm_META,
			eta_dt_META,
			via_port_cd_META,
			via_port_nm_META,
			via_schd_dt_META,
			purc_tterm_cd1_META,
			purc_tterm_nm1_META,
			purc_tterm_rmrks1_META,
			purc_tterm_cd2_META,
			purc_tterm_nm2_META,
			purc_tterm_rmrks2_META,
			purc_tterm_cd3_META,
			purc_tterm_nm3_META,
			purc_tterm_rmrks3_META,
			trd_rmrks_META,
			po_print_rmrks_META,
			cst_cd_META,
			cst_nm_META,
			slo_trd_ptn_typ_META,
			slo_trd_ptn_typ_nm_META,
			sls_basis_typ_META,
			sls_basis_typ_nm_META,
			slo_cur_cd_META,
			slo_cur_nm_META,
			slo_xrate_META,
			slo_ptax_xrate_META,
			slo_tterm_cd1_META,
			slo_tterm_nm1_META,
			slo_tterm_rmrks1_META,
			slo_tterm_cd2_META,
			slo_tterm_nm2_META,
			slo_tterm_rmrks2_META,
			slo_tterm_cd3_META,
			slo_tterm_nm3_META,
			slo_tterm_rmrks3_META,
			purc_basis_typ_META,
			purc_basis_typ_nm_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			selectable_flg_META,
			aprv_no_META,
			aprv_sts_typ_META,
			aprv_sts_typ_nm_META,
			pay_spot_flg_META,
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
			sppl_grp_cd1_META,
			sppl_grp_nm1_META,
			sppl_grp_cd2_META,
			sppl_grp_nm2_META,
			sppl_grp_cd3_META,
			sppl_grp_nm3_META,
			sppl_grp_cd4_META,
			sppl_grp_nm4_META,
			sppl_grp_cd5_META,
			sppl_grp_nm5_META,
			sppl_grp_cd6_META,
			sppl_grp_nm6_META,
			sppl_grp_cd7_META,
			sppl_grp_nm7_META,
			sppl_grp_cd8_META,
			sppl_grp_nm8_META,
			sppl_grp_cd9_META,
			sppl_grp_nm9_META,
			sppl_grp_cd10_META,
			sppl_grp_nm10_META,
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
			upd_srv_req_no_META,
			po_trd_unit_cd_META,
			po_trd_unit_qty_META,
			po_trd_cur_upri_META,
			po_trd_cur_dscnt_amt_META,
			po_trd_cur_proc_upri_META,
			po_trd_cur_onr_prov_upri_META,
			po_trd_cur_amt_META,
			po_trd_cur_proc_amt_META,
			po_trd_cur_onr_prov_amt_META,
			po_trd_cur_tax_amt_META,
			po_trd_cur_inc_ctax_amt_META,
			po_wtax_amt_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			po_trd_unit_conv_qty_META,
			po_trd_unit_conv_base_qty_META,
			inc_tax_flg_META,
			trd_unit_conv_qty_META,
			trd_unit_conv_base_qty_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META
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
				{$pr_sts_typ, "MSC_PR_STS_TYP"},	// pr_sts_typ
				{$in_to_id_typ, "MSC_IN_TO_ID_TYP"},	// in_to_id_typ
				{$slo_trd_ptn_typ, "MAC_TRD_PTN_TYP"},	// slo_trd_ptn_typ
				{$sls_basis_typ, "MAC_SLS_BASIS_TYP"},	// sls_basis_typ
				{$purc_basis_typ, "MAC_PURC_BASIS_TYP"},	// purc_basis_typ
				{$aprv_sts_typ, "MAC_APRV_STS_TYP"}	// aprv_sts_typ
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
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐づけＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public MCNumber sim_cnd_grp_no() {
		return getConstNumber(offset + 1, $sim_cnd_grp_no);
	}

	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public void sim_cnd_grp_no(MCNumber value) {
		setConstNumber(offset + 1, $sim_cnd_grp_no, value);
	}

	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public void sim_cnd_grp_no(int value) {
		setConstNumber(offset + 1, $sim_cnd_grp_no, value);
	}

	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public void sim_cnd_grp_no(long value) {
		setConstNumber(offset + 1, $sim_cnd_grp_no, value);
	}

	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public void sim_cnd_grp_no(float value) {
		setConstNumber(offset + 1, $sim_cnd_grp_no, value);
	}

	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public void sim_cnd_grp_no(double value) {
		setConstNumber(offset + 1, $sim_cnd_grp_no, value);
	}


	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 2, $pr_sts_typ);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 2, $pr_sts_typ, value);
	}


	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public String pr_sts_typ_nm() {
		return getConstString(offset + 3, $pr_sts_typ_nm);
	}

	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public void pr_sts_typ_nm(String value) {
		setConstString(offset + 3, $pr_sts_typ_nm, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 4, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 4, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 5, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 5, $po_d_no, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 6, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 6, $purc_schd_no, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 7, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 7, $arr_schd_no, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 8, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 8, $arr_act_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 9, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 9, $rcpt_iv_no, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 10, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 10, $purc_schd_dt, value);
	}


	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public MCDate arr_schd_dt() {
		return getConstDate(offset + 11, $arr_schd_dt);
	}

	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public void arr_schd_dt(MCDate value) {
		setConstDate(offset + 11, $arr_schd_dt, value);
	}


	/**
	 * Scheduled receipt time 入荷予定時刻.<p>
	 *
	 */
	public MCDate arr_schd_hm() {
		return getConstDate(offset + 12, $arr_schd_hm);
	}

	/**
	 * Scheduled receipt time 入荷予定時刻.<p>
	 *
	 */
	public void arr_schd_hm(MCDate value) {
		setConstDate(offset + 12, $arr_schd_hm, value);
	}


	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public MCDate arr_dt() {
		return getConstDate(offset + 13, $arr_dt);
	}

	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public void arr_dt(MCDate value) {
		setConstDate(offset + 13, $arr_dt, value);
	}


	/**
	 * Receipt time 入荷時刻.<p>
	 *
	 */
	public MCDate arr_hm() {
		return getConstDate(offset + 14, $arr_hm);
	}

	/**
	 * Receipt time 入荷時刻.<p>
	 *
	 */
	public void arr_hm(MCDate value) {
		setConstDate(offset + 14, $arr_hm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 15, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 15, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 16, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 16, $trd_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 17, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 17, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 18, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 18, $sppl_nm, value);
	}


	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 19, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 19, $purc_amt_rnd_typ, value);
	}


	/**
	 * Rounding type (Purchase tax) 仕入税額端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 20, $purc_tax_rnd_typ);
	}

	/**
	 * Rounding type (Purchase tax) 仕入税額端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 20, $purc_tax_rnd_typ, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 21, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 21, $prnt_lcl_cd, value);
	}


	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public String in_to_id_typ() {
		return getConstString(offset + 22, $in_to_id_typ);
	}

	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public void in_to_id_typ(String value) {
		setConstString(offset + 22, $in_to_id_typ, value);
	}


	/**
	 * Delivery destination identification type name 納入先識別区分名.<p>
	 *
	 */
	public String in_to_id_typ_nm() {
		return getConstString(offset + 23, $in_to_id_typ_nm);
	}

	/**
	 * Delivery destination identification type name 納入先識別区分名.<p>
	 *
	 */
	public void in_to_id_typ_nm(String value) {
		setConstString(offset + 23, $in_to_id_typ_nm, value);
	}


	/**
	 * Delivery destination cd. 納入先ＣＤ.<p>
	 *
	 */
	public String in_to_id_cd() {
		return getConstString(offset + 24, $in_to_id_cd);
	}

	/**
	 * Delivery destination cd. 納入先ＣＤ.<p>
	 *
	 */
	public void in_to_id_cd(String value) {
		setConstString(offset + 24, $in_to_id_cd, value);
	}


	/**
	 * Delivery destination name 納入先名.<p>
	 *
	 */
	public String in_to_id_nm() {
		return getConstString(offset + 25, $in_to_id_nm);
	}

	/**
	 * Delivery destination name 納入先名.<p>
	 *
	 */
	public void in_to_id_nm(String value) {
		setConstString(offset + 25, $in_to_id_nm, value);
	}


	/**
	 * Dept. 部署.<p>
	 *
	 */
	public String in_to_cntct_dpt() {
		return getConstString(offset + 26, $in_to_cntct_dpt);
	}

	/**
	 * Dept. 部署.<p>
	 *
	 */
	public void in_to_cntct_dpt(String value) {
		setConstString(offset + 26, $in_to_cntct_dpt, value);
	}


	/**
	 * PIC 担当者.<p>
	 *
	 */
	public String in_to_cntct_psn() {
		return getConstString(offset + 27, $in_to_cntct_psn);
	}

	/**
	 * PIC 担当者.<p>
	 *
	 */
	public void in_to_cntct_psn(String value) {
		setConstString(offset + 27, $in_to_cntct_psn, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String in_to_zip_cd() {
		return getConstString(offset + 28, $in_to_zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void in_to_zip_cd(String value) {
		setConstString(offset + 28, $in_to_zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String in_to_addr1() {
		return getConstString(offset + 29, $in_to_addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void in_to_addr1(String value) {
		setConstString(offset + 29, $in_to_addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String in_to_addr2() {
		return getConstString(offset + 30, $in_to_addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void in_to_addr2(String value) {
		setConstString(offset + 30, $in_to_addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String in_to_addr3() {
		return getConstString(offset + 31, $in_to_addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void in_to_addr3(String value) {
		setConstString(offset + 31, $in_to_addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String in_to_addr4() {
		return getConstString(offset + 32, $in_to_addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void in_to_addr4(String value) {
		setConstString(offset + 32, $in_to_addr4, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String in_to_tel() {
		return getConstString(offset + 33, $in_to_tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void in_to_tel(String value) {
		setConstString(offset + 33, $in_to_tel, value);
	}


	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String in_to_fax() {
		return getConstString(offset + 34, $in_to_fax);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void in_to_fax(String value) {
		setConstString(offset + 34, $in_to_fax, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String in_to_cntry_cd() {
		return getConstString(offset + 35, $in_to_cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void in_to_cntry_cd(String value) {
		setConstString(offset + 35, $in_to_cntry_cd, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String in_to_cntry_nm() {
		return getConstString(offset + 36, $in_to_cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void in_to_cntry_nm(String value) {
		setConstString(offset + 36, $in_to_cntry_nm, value);
	}


	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 37, $purc_usr_cd);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 37, $purc_usr_cd, value);
	}


	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return getConstString(offset + 38, $purc_usr_nm);
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		setConstString(offset + 38, $purc_usr_nm, value);
	}


	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 39, $purc_dpt_cd);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 39, $purc_dpt_cd, value);
	}


	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return getConstString(offset + 40, $purc_dpt_nm);
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		setConstString(offset + 40, $purc_dpt_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 41, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 41, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 42, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 42, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 43, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 43, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 44, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 44, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 45, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 45, $itm_nm, value);
	}


	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 46, $iv_itm_nm);
	}

	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 46, $iv_itm_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 47, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 47, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 48, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 48, $maker_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 49, $trd_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 49, $trd_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 50, $trd_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 50, $trd_unit_nm, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 51, $trd_unit_qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 51, $trd_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 51, $trd_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 51, $trd_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 51, $trd_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 51, $trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 52, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 52, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 53, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 53, $base_unit_nm, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 54, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 54, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 54, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 54, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 54, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 54, $base_unit_qty, value);
	}


	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public MCNumber arr_schd_qty() {
		return getConstNumber(offset + 55, $arr_schd_qty);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(MCNumber value) {
		setConstNumber(offset + 55, $arr_schd_qty, value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(int value) {
		setConstNumber(offset + 55, $arr_schd_qty, value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(long value) {
		setConstNumber(offset + 55, $arr_schd_qty, value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(float value) {
		setConstNumber(offset + 55, $arr_schd_qty, value);
	}

	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public void arr_schd_qty(double value) {
		setConstNumber(offset + 55, $arr_schd_qty, value);
	}


	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public MCNumber arr_act_qty() {
		return getConstNumber(offset + 56, $arr_act_qty);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_act_qty(MCNumber value) {
		setConstNumber(offset + 56, $arr_act_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_act_qty(int value) {
		setConstNumber(offset + 56, $arr_act_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_act_qty(long value) {
		setConstNumber(offset + 56, $arr_act_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_act_qty(float value) {
		setConstNumber(offset + 56, $arr_act_qty, value);
	}

	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public void arr_act_qty(double value) {
		setConstNumber(offset + 56, $arr_act_qty, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 57, $trd_cur_upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 57, $trd_cur_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 57, $trd_cur_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 57, $trd_cur_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 57, $trd_cur_upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 57, $trd_cur_upri, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 58, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 58, $repurc_obli_flg, value);
	}


	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return getConstNumber(offset + 59, $trd_cur_proc_upri);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 59, $trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		setConstNumber(offset + 59, $trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		setConstNumber(offset + 59, $trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		setConstNumber(offset + 59, $trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		setConstNumber(offset + 59, $trd_cur_proc_upri, value);
	}


	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 60, $trd_cur_onr_prov_upri);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 60, $trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 60, $trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 60, $trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 60, $trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 60, $trd_cur_onr_prov_upri, value);
	}


	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 61, $interim_flg);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 61, $interim_flg, value);
	}


	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 62, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 62, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 62, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 62, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 62, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 62, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 63, $trd_cur_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 63, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 63, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 63, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 63, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 63, $trd_cur_amt, value);
	}


	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return getConstNumber(offset + 64, $trd_cur_proc_amt);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 64, $trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		setConstNumber(offset + 64, $trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		setConstNumber(offset + 64, $trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		setConstNumber(offset + 64, $trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		setConstNumber(offset + 64, $trd_cur_proc_amt, value);
	}


	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 65, $trd_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 65, $trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 65, $trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 65, $trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 65, $trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 65, $trd_cur_onr_prov_amt, value);
	}


	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public MCNumber inc_ctax_amt() {
		return getConstNumber(offset + 66, $inc_ctax_amt);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_ctax_amt(MCNumber value) {
		setConstNumber(offset + 66, $inc_ctax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_ctax_amt(int value) {
		setConstNumber(offset + 66, $inc_ctax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_ctax_amt(long value) {
		setConstNumber(offset + 66, $inc_ctax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_ctax_amt(float value) {
		setConstNumber(offset + 66, $inc_ctax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_ctax_amt(double value) {
		setConstNumber(offset + 66, $inc_ctax_amt, value);
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
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 69, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 69, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 69, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 69, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 69, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 69, $tax_rate, value);
	}


	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 70, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 70, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 70, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 70, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 70, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 70, $trd_cur_tax_amt, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 71, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 71, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 72, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 72, $trd_cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_amt_dec_place() {
		return getConstNumber(offset + 73, $trd_amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 73, $trd_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(int value) {
		setConstNumber(offset + 73, $trd_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(long value) {
		setConstNumber(offset + 73, $trd_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(float value) {
		setConstNumber(offset + 73, $trd_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void trd_amt_dec_place(double value) {
		setConstNumber(offset + 73, $trd_amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_upri_dec_place() {
		return getConstNumber(offset + 74, $trd_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 74, $trd_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(int value) {
		setConstNumber(offset + 74, $trd_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(long value) {
		setConstNumber(offset + 74, $trd_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(float value) {
		setConstNumber(offset + 74, $trd_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void trd_upri_dec_place(double value) {
		setConstNumber(offset + 74, $trd_upri_dec_place, value);
	}


	/**
	 * Set exchange rate flg. 為替レート指定ＦＬＧ.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 75, $xrate_inpt_flg);
	}

	/**
	 * Set exchange rate flg. 為替レート指定ＦＬＧ.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 75, $xrate_inpt_flg, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 76, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 76, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 76, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 76, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 76, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 76, $xrate, value);
	}


	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 77, $base_cur_upri);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 77, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 77, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 77, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 77, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 77, $base_cur_upri, value);
	}


	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return getConstNumber(offset + 78, $base_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 78, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		setConstNumber(offset + 78, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		setConstNumber(offset + 78, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		setConstNumber(offset + 78, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		setConstNumber(offset + 78, $base_cur_dscnt_amt, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 79, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 79, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 79, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 79, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 79, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 79, $base_cur_amt, value);
	}


	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public MCNumber base_cur_proc_upri() {
		return getConstNumber(offset + 80, $base_cur_proc_upri);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 80, $base_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(int value) {
		setConstNumber(offset + 80, $base_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(long value) {
		setConstNumber(offset + 80, $base_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(float value) {
		setConstNumber(offset + 80, $base_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(double value) {
		setConstNumber(offset + 80, $base_cur_proc_upri, value);
	}


	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_upri() {
		return getConstNumber(offset + 81, $base_cur_onr_prov_upri);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 81, $base_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 81, $base_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 81, $base_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 81, $base_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 81, $base_cur_onr_prov_upri, value);
	}


	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public MCNumber base_cur_proc_amt() {
		return getConstNumber(offset + 82, $base_cur_proc_amt);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 82, $base_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(int value) {
		setConstNumber(offset + 82, $base_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(long value) {
		setConstNumber(offset + 82, $base_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(float value) {
		setConstNumber(offset + 82, $base_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(double value) {
		setConstNumber(offset + 82, $base_cur_proc_amt, value);
	}


	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return getConstNumber(offset + 83, $base_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 83, $base_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 83, $base_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 83, $base_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 83, $base_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 83, $base_cur_onr_prov_amt, value);
	}


	/**
	 * Tax included amount (Base currency) 基準通貨税込額.<p>
	 *
	 */
	public MCNumber base_cur_inc_ctax_amt() {
		return getConstNumber(offset + 84, $base_cur_inc_ctax_amt);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込額.<p>
	 *
	 */
	public void base_cur_inc_ctax_amt(MCNumber value) {
		setConstNumber(offset + 84, $base_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込額.<p>
	 *
	 */
	public void base_cur_inc_ctax_amt(int value) {
		setConstNumber(offset + 84, $base_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込額.<p>
	 *
	 */
	public void base_cur_inc_ctax_amt(long value) {
		setConstNumber(offset + 84, $base_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込額.<p>
	 *
	 */
	public void base_cur_inc_ctax_amt(float value) {
		setConstNumber(offset + 84, $base_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込額.<p>
	 *
	 */
	public void base_cur_inc_ctax_amt(double value) {
		setConstNumber(offset + 84, $base_cur_inc_ctax_amt, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 85, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 85, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 85, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 85, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 85, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 85, $base_cur_tax_amt, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 86, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 86, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 87, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 87, $base_cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_amt_dec_place() {
		return getConstNumber(offset + 88, $base_amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 88, $base_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(int value) {
		setConstNumber(offset + 88, $base_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(long value) {
		setConstNumber(offset + 88, $base_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(float value) {
		setConstNumber(offset + 88, $base_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void base_amt_dec_place(double value) {
		setConstNumber(offset + 88, $base_amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_upri_dec_place() {
		return getConstNumber(offset + 89, $base_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void base_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 89, $base_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void base_upri_dec_place(int value) {
		setConstNumber(offset + 89, $base_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void base_upri_dec_place(long value) {
		setConstNumber(offset + 89, $base_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void base_upri_dec_place(float value) {
		setConstNumber(offset + 89, $base_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void base_upri_dec_place(double value) {
		setConstNumber(offset + 89, $base_upri_dec_place, value);
	}


	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return getConstNumber(offset + 90, $ptax_cur_upri);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		setConstNumber(offset + 90, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		setConstNumber(offset + 90, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		setConstNumber(offset + 90, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		setConstNumber(offset + 90, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		setConstNumber(offset + 90, $ptax_cur_upri, value);
	}


	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public MCNumber ptax_cur_dscnt_amt() {
		return getConstNumber(offset + 91, $ptax_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 91, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(int value) {
		setConstNumber(offset + 91, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(long value) {
		setConstNumber(offset + 91, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(float value) {
		setConstNumber(offset + 91, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(double value) {
		setConstNumber(offset + 91, $ptax_cur_dscnt_amt, value);
	}


	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return getConstNumber(offset + 92, $ptax_cur_amt);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		setConstNumber(offset + 92, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		setConstNumber(offset + 92, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		setConstNumber(offset + 92, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		setConstNumber(offset + 92, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		setConstNumber(offset + 92, $ptax_cur_amt, value);
	}


	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_upri() {
		return getConstNumber(offset + 93, $ptax_cur_proc_upri);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 93, $ptax_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(int value) {
		setConstNumber(offset + 93, $ptax_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(long value) {
		setConstNumber(offset + 93, $ptax_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(float value) {
		setConstNumber(offset + 93, $ptax_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(double value) {
		setConstNumber(offset + 93, $ptax_cur_proc_upri, value);
	}


	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_upri() {
		return getConstNumber(offset + 94, $ptax_cur_onr_prov_upri);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 94, $ptax_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 94, $ptax_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 94, $ptax_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 94, $ptax_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 94, $ptax_cur_onr_prov_upri, value);
	}


	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_amt() {
		return getConstNumber(offset + 95, $ptax_cur_proc_amt);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 95, $ptax_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(int value) {
		setConstNumber(offset + 95, $ptax_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(long value) {
		setConstNumber(offset + 95, $ptax_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(float value) {
		setConstNumber(offset + 95, $ptax_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(double value) {
		setConstNumber(offset + 95, $ptax_cur_proc_amt, value);
	}


	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_amt() {
		return getConstNumber(offset + 96, $ptax_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 96, $ptax_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 96, $ptax_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 96, $ptax_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 96, $ptax_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 96, $ptax_cur_onr_prov_amt, value);
	}


	/**
	 * Tax included amount (Tax currency) 納税通貨税込額.<p>
	 *
	 */
	public MCNumber ptax_cur_inc_ctax_amt() {
		return getConstNumber(offset + 97, $ptax_cur_inc_ctax_amt);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込額.<p>
	 *
	 */
	public void ptax_cur_inc_ctax_amt(MCNumber value) {
		setConstNumber(offset + 97, $ptax_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込額.<p>
	 *
	 */
	public void ptax_cur_inc_ctax_amt(int value) {
		setConstNumber(offset + 97, $ptax_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込額.<p>
	 *
	 */
	public void ptax_cur_inc_ctax_amt(long value) {
		setConstNumber(offset + 97, $ptax_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込額.<p>
	 *
	 */
	public void ptax_cur_inc_ctax_amt(float value) {
		setConstNumber(offset + 97, $ptax_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込額.<p>
	 *
	 */
	public void ptax_cur_inc_ctax_amt(double value) {
		setConstNumber(offset + 97, $ptax_cur_inc_ctax_amt, value);
	}


	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return getConstNumber(offset + 98, $ptax_cur_tax_amt);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 98, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		setConstNumber(offset + 98, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		setConstNumber(offset + 98, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		setConstNumber(offset + 98, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		setConstNumber(offset + 98, $ptax_cur_tax_amt, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 99, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 99, $ptax_cur_cd, value);
	}


	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public String ptax_cur_nm() {
		return getConstString(offset + 100, $ptax_cur_nm);
	}

	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public void ptax_cur_nm(String value) {
		setConstString(offset + 100, $ptax_cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_amt_dec_place() {
		return getConstNumber(offset + 101, $ptax_amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 101, $ptax_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_amt_dec_place(int value) {
		setConstNumber(offset + 101, $ptax_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_amt_dec_place(long value) {
		setConstNumber(offset + 101, $ptax_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_amt_dec_place(float value) {
		setConstNumber(offset + 101, $ptax_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_amt_dec_place(double value) {
		setConstNumber(offset + 101, $ptax_amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_upri_dec_place() {
		return getConstNumber(offset + 102, $ptax_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 102, $ptax_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_upri_dec_place(int value) {
		setConstNumber(offset + 102, $ptax_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_upri_dec_place(long value) {
		setConstNumber(offset + 102, $ptax_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_upri_dec_place(float value) {
		setConstNumber(offset + 102, $ptax_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_upri_dec_place(double value) {
		setConstNumber(offset + 102, $ptax_upri_dec_place, value);
	}


	/**
	 * Taxpaying exchange rate specification flg. 納税為替レート指定ＦＬＧ.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 103, $ptax_xrate_inpt_flg);
	}

	/**
	 * Taxpaying exchange rate specification flg. 納税為替レート指定ＦＬＧ.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 103, $ptax_xrate_inpt_flg, value);
	}


	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 104, $ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 104, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 104, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 104, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 104, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 104, $ptax_xrate, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 105, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 105, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 105, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 105, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 105, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 105, $wtax_rate, value);
	}


	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 106, $wtax_amt);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 106, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 106, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 106, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 106, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 106, $wtax_amt, value);
	}


	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 107, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 107, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 108, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 108, $sppl_itm_nm, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 109, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 109, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 110, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 110, $cst_itm_nm, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 111, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 111, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 112, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 112, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 113, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 113, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 114, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 114, $sno4, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 115, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 115, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 116, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 116, $slo_d_no, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 117, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 117, $trnspt_cd, value);
	}


	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 118, $trnspt_nm);
	}

	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 118, $trnspt_nm, value);
	}


	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 119, $vssl_flght);
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 119, $vssl_flght, value);
	}


	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 120, $load_port_cd);
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 120, $load_port_cd, value);
	}


	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public String load_port_nm() {
		return getConstString(offset + 121, $load_port_nm);
	}

	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public void load_port_nm(String value) {
		setConstString(offset + 121, $load_port_nm, value);
	}


	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 122, $etd_dt);
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 122, $etd_dt, value);
	}


	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 123, $dschrg_port_cd);
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 123, $dschrg_port_cd, value);
	}


	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public String dschrg_port_nm() {
		return getConstString(offset + 124, $dschrg_port_nm);
	}

	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public void dschrg_port_nm(String value) {
		setConstString(offset + 124, $dschrg_port_nm, value);
	}


	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDate eta_dt() {
		return getConstDate(offset + 125, $eta_dt);
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		setConstDate(offset + 125, $eta_dt, value);
	}


	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 126, $via_port_cd);
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 126, $via_port_cd, value);
	}


	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public String via_port_nm() {
		return getConstString(offset + 127, $via_port_nm);
	}

	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public void via_port_nm(String value) {
		setConstString(offset + 127, $via_port_nm, value);
	}


	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return getConstDate(offset + 128, $via_schd_dt);
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		setConstDate(offset + 128, $via_schd_dt, value);
	}


	/**
	 * Purchase biz transaction terms cd. 1 購買取引条件ＣＤ１.<p>
	 *
	 */
	public String purc_tterm_cd1() {
		return getConstString(offset + 129, $purc_tterm_cd1);
	}

	/**
	 * Purchase biz transaction terms cd. 1 購買取引条件ＣＤ１.<p>
	 *
	 */
	public void purc_tterm_cd1(String value) {
		setConstString(offset + 129, $purc_tterm_cd1, value);
	}


	/**
	 * Purchase biz transaction terms name 1 購買取引条件名１.<p>
	 *
	 */
	public String purc_tterm_nm1() {
		return getConstString(offset + 130, $purc_tterm_nm1);
	}

	/**
	 * Purchase biz transaction terms name 1 購買取引条件名１.<p>
	 *
	 */
	public void purc_tterm_nm1(String value) {
		setConstString(offset + 130, $purc_tterm_nm1, value);
	}


	/**
	 * Purchase biz transaction terms remarks 1 購買取引条件備考１.<p>
	 *
	 */
	public String purc_tterm_rmrks1() {
		return getConstString(offset + 131, $purc_tterm_rmrks1);
	}

	/**
	 * Purchase biz transaction terms remarks 1 購買取引条件備考１.<p>
	 *
	 */
	public void purc_tterm_rmrks1(String value) {
		setConstString(offset + 131, $purc_tterm_rmrks1, value);
	}


	/**
	 * Purchase biz transaction terms cd. 2 購買取引条件ＣＤ２.<p>
	 *
	 */
	public String purc_tterm_cd2() {
		return getConstString(offset + 132, $purc_tterm_cd2);
	}

	/**
	 * Purchase biz transaction terms cd. 2 購買取引条件ＣＤ２.<p>
	 *
	 */
	public void purc_tterm_cd2(String value) {
		setConstString(offset + 132, $purc_tterm_cd2, value);
	}


	/**
	 * Purchase biz transaction terms name 2 購買取引条件名２.<p>
	 *
	 */
	public String purc_tterm_nm2() {
		return getConstString(offset + 133, $purc_tterm_nm2);
	}

	/**
	 * Purchase biz transaction terms name 2 購買取引条件名２.<p>
	 *
	 */
	public void purc_tterm_nm2(String value) {
		setConstString(offset + 133, $purc_tterm_nm2, value);
	}


	/**
	 * Purchase biz transaction terms remarks 2 購買取引条件備考２.<p>
	 *
	 */
	public String purc_tterm_rmrks2() {
		return getConstString(offset + 134, $purc_tterm_rmrks2);
	}

	/**
	 * Purchase biz transaction terms remarks 2 購買取引条件備考２.<p>
	 *
	 */
	public void purc_tterm_rmrks2(String value) {
		setConstString(offset + 134, $purc_tterm_rmrks2, value);
	}


	/**
	 * Purchase biz transaction terms cd. 3 購買取引条件ＣＤ３.<p>
	 *
	 */
	public String purc_tterm_cd3() {
		return getConstString(offset + 135, $purc_tterm_cd3);
	}

	/**
	 * Purchase biz transaction terms cd. 3 購買取引条件ＣＤ３.<p>
	 *
	 */
	public void purc_tterm_cd3(String value) {
		setConstString(offset + 135, $purc_tterm_cd3, value);
	}


	/**
	 * Purchase biz transaction terms name 3 購買取引条件名３.<p>
	 *
	 */
	public String purc_tterm_nm3() {
		return getConstString(offset + 136, $purc_tterm_nm3);
	}

	/**
	 * Purchase biz transaction terms name 3 購買取引条件名３.<p>
	 *
	 */
	public void purc_tterm_nm3(String value) {
		setConstString(offset + 136, $purc_tterm_nm3, value);
	}


	/**
	 * Purchase biz transaction terms remarks 3 購買取引条件備考３.<p>
	 *
	 */
	public String purc_tterm_rmrks3() {
		return getConstString(offset + 137, $purc_tterm_rmrks3);
	}

	/**
	 * Purchase biz transaction terms remarks 3 購買取引条件備考３.<p>
	 *
	 */
	public void purc_tterm_rmrks3(String value) {
		setConstString(offset + 137, $purc_tterm_rmrks3, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 138, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 138, $trd_rmrks, value);
	}


	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public String po_print_rmrks() {
		return getConstString(offset + 139, $po_print_rmrks);
	}

	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public void po_print_rmrks(String value) {
		setConstString(offset + 139, $po_print_rmrks, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 140, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 140, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 141, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 141, $cst_nm, value);
	}


	/**
	 * Sales order transaction pattern type 受注取引パタン区分.<p>
	 *
	 */
	public String slo_trd_ptn_typ() {
		return getConstString(offset + 142, $slo_trd_ptn_typ);
	}

	/**
	 * Sales order transaction pattern type 受注取引パタン区分.<p>
	 *
	 */
	public void slo_trd_ptn_typ(String value) {
		setConstString(offset + 142, $slo_trd_ptn_typ, value);
	}


	/**
	 * Sales order transaction pattern type name 受注取引パタン区分名.<p>
	 *
	 */
	public String slo_trd_ptn_typ_nm() {
		return getConstString(offset + 143, $slo_trd_ptn_typ_nm);
	}

	/**
	 * Sales order transaction pattern type name 受注取引パタン区分名.<p>
	 *
	 */
	public void slo_trd_ptn_typ_nm(String value) {
		setConstString(offset + 143, $slo_trd_ptn_typ_nm, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 144, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 144, $sls_basis_typ, value);
	}


	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public String sls_basis_typ_nm() {
		return getConstString(offset + 145, $sls_basis_typ_nm);
	}

	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public void sls_basis_typ_nm(String value) {
		setConstString(offset + 145, $sls_basis_typ_nm, value);
	}


	/**
	 * Sales order currency cd. 受注通貨ＣＤ.<p>
	 *
	 */
	public String slo_cur_cd() {
		return getConstString(offset + 146, $slo_cur_cd);
	}

	/**
	 * Sales order currency cd. 受注通貨ＣＤ.<p>
	 *
	 */
	public void slo_cur_cd(String value) {
		setConstString(offset + 146, $slo_cur_cd, value);
	}


	/**
	 * Sales order currency name 受注通貨名.<p>
	 *
	 */
	public String slo_cur_nm() {
		return getConstString(offset + 147, $slo_cur_nm);
	}

	/**
	 * Sales order currency name 受注通貨名.<p>
	 *
	 */
	public void slo_cur_nm(String value) {
		setConstString(offset + 147, $slo_cur_nm, value);
	}


	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public MCNumber slo_xrate() {
		return getConstNumber(offset + 148, $slo_xrate);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(MCNumber value) {
		setConstNumber(offset + 148, $slo_xrate, value);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(int value) {
		setConstNumber(offset + 148, $slo_xrate, value);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(long value) {
		setConstNumber(offset + 148, $slo_xrate, value);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(float value) {
		setConstNumber(offset + 148, $slo_xrate, value);
	}

	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public void slo_xrate(double value) {
		setConstNumber(offset + 148, $slo_xrate, value);
	}


	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public MCNumber slo_ptax_xrate() {
		return getConstNumber(offset + 149, $slo_ptax_xrate);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(MCNumber value) {
		setConstNumber(offset + 149, $slo_ptax_xrate, value);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(int value) {
		setConstNumber(offset + 149, $slo_ptax_xrate, value);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(long value) {
		setConstNumber(offset + 149, $slo_ptax_xrate, value);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(float value) {
		setConstNumber(offset + 149, $slo_ptax_xrate, value);
	}

	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public void slo_ptax_xrate(double value) {
		setConstNumber(offset + 149, $slo_ptax_xrate, value);
	}


	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public String slo_tterm_cd1() {
		return getConstString(offset + 150, $slo_tterm_cd1);
	}

	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public void slo_tterm_cd1(String value) {
		setConstString(offset + 150, $slo_tterm_cd1, value);
	}


	/**
	 * Sales order transaction terms name 1 受注取引条件名１.<p>
	 *
	 */
	public String slo_tterm_nm1() {
		return getConstString(offset + 151, $slo_tterm_nm1);
	}

	/**
	 * Sales order transaction terms name 1 受注取引条件名１.<p>
	 *
	 */
	public void slo_tterm_nm1(String value) {
		setConstString(offset + 151, $slo_tterm_nm1, value);
	}


	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public String slo_tterm_rmrks1() {
		return getConstString(offset + 152, $slo_tterm_rmrks1);
	}

	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public void slo_tterm_rmrks1(String value) {
		setConstString(offset + 152, $slo_tterm_rmrks1, value);
	}


	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public String slo_tterm_cd2() {
		return getConstString(offset + 153, $slo_tterm_cd2);
	}

	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public void slo_tterm_cd2(String value) {
		setConstString(offset + 153, $slo_tterm_cd2, value);
	}


	/**
	 * Sales order transaction terms name 2 受注取引条件名２.<p>
	 *
	 */
	public String slo_tterm_nm2() {
		return getConstString(offset + 154, $slo_tterm_nm2);
	}

	/**
	 * Sales order transaction terms name 2 受注取引条件名２.<p>
	 *
	 */
	public void slo_tterm_nm2(String value) {
		setConstString(offset + 154, $slo_tterm_nm2, value);
	}


	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public String slo_tterm_rmrks2() {
		return getConstString(offset + 155, $slo_tterm_rmrks2);
	}

	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public void slo_tterm_rmrks2(String value) {
		setConstString(offset + 155, $slo_tterm_rmrks2, value);
	}


	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public String slo_tterm_cd3() {
		return getConstString(offset + 156, $slo_tterm_cd3);
	}

	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public void slo_tterm_cd3(String value) {
		setConstString(offset + 156, $slo_tterm_cd3, value);
	}


	/**
	 * Sales order transaction terms name 3 受注取引条件名３.<p>
	 *
	 */
	public String slo_tterm_nm3() {
		return getConstString(offset + 157, $slo_tterm_nm3);
	}

	/**
	 * Sales order transaction terms name 3 受注取引条件名３.<p>
	 *
	 */
	public void slo_tterm_nm3(String value) {
		setConstString(offset + 157, $slo_tterm_nm3, value);
	}


	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public String slo_tterm_rmrks3() {
		return getConstString(offset + 158, $slo_tterm_rmrks3);
	}

	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public void slo_tterm_rmrks3(String value) {
		setConstString(offset + 158, $slo_tterm_rmrks3, value);
	}


	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 159, $purc_basis_typ);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 159, $purc_basis_typ, value);
	}


	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public String purc_basis_typ_nm() {
		return getConstString(offset + 160, $purc_basis_typ_nm);
	}

	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public void purc_basis_typ_nm(String value) {
		setConstString(offset + 160, $purc_basis_typ_nm, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 161, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 161, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 162, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 162, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 163, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 163, $sub_char3, value);
	}


	/**
	 * Selectable flg. 選択可能ＦＬＧ.<p>
	 *
	 */
	public boolean selectable_flg() {
		return getConstBoolean(offset + 164, $selectable_flg);
	}

	/**
	 * Selectable flg. 選択可能ＦＬＧ.<p>
	 *
	 */
	public void selectable_flg(boolean value) {
		setConstBoolean(offset + 164, $selectable_flg, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 165, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 165, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 166, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 166, $aprv_sts_typ, value);
	}


	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String aprv_sts_typ_nm() {
		return getConstString(offset + 167, $aprv_sts_typ_nm);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void aprv_sts_typ_nm(String value) {
		setConstString(offset + 167, $aprv_sts_typ_nm, value);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 168, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 168, $pay_spot_flg, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 169, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 169, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 170, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 170, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 171, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 171, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 172, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 172, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 173, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 173, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 174, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 174, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 175, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 175, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 176, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 176, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 177, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 177, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 178, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 178, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 179, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 179, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 180, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 180, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 181, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 181, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 182, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 182, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 183, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 183, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 184, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 184, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 185, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 185, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 186, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 186, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 187, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 187, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 188, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 188, $itm_grp_nm10, value);
	}


	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return getConstString(offset + 189, $sppl_grp_cd1);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		setConstString(offset + 189, $sppl_grp_cd1, value);
	}


	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return getConstString(offset + 190, $sppl_grp_nm1);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		setConstString(offset + 190, $sppl_grp_nm1, value);
	}


	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return getConstString(offset + 191, $sppl_grp_cd2);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		setConstString(offset + 191, $sppl_grp_cd2, value);
	}


	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return getConstString(offset + 192, $sppl_grp_nm2);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		setConstString(offset + 192, $sppl_grp_nm2, value);
	}


	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return getConstString(offset + 193, $sppl_grp_cd3);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		setConstString(offset + 193, $sppl_grp_cd3, value);
	}


	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return getConstString(offset + 194, $sppl_grp_nm3);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		setConstString(offset + 194, $sppl_grp_nm3, value);
	}


	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return getConstString(offset + 195, $sppl_grp_cd4);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		setConstString(offset + 195, $sppl_grp_cd4, value);
	}


	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return getConstString(offset + 196, $sppl_grp_nm4);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		setConstString(offset + 196, $sppl_grp_nm4, value);
	}


	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return getConstString(offset + 197, $sppl_grp_cd5);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		setConstString(offset + 197, $sppl_grp_cd5, value);
	}


	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return getConstString(offset + 198, $sppl_grp_nm5);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		setConstString(offset + 198, $sppl_grp_nm5, value);
	}


	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return getConstString(offset + 199, $sppl_grp_cd6);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		setConstString(offset + 199, $sppl_grp_cd6, value);
	}


	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return getConstString(offset + 200, $sppl_grp_nm6);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		setConstString(offset + 200, $sppl_grp_nm6, value);
	}


	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return getConstString(offset + 201, $sppl_grp_cd7);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		setConstString(offset + 201, $sppl_grp_cd7, value);
	}


	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return getConstString(offset + 202, $sppl_grp_nm7);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		setConstString(offset + 202, $sppl_grp_nm7, value);
	}


	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return getConstString(offset + 203, $sppl_grp_cd8);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		setConstString(offset + 203, $sppl_grp_cd8, value);
	}


	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return getConstString(offset + 204, $sppl_grp_nm8);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		setConstString(offset + 204, $sppl_grp_nm8, value);
	}


	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return getConstString(offset + 205, $sppl_grp_cd9);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		setConstString(offset + 205, $sppl_grp_cd9, value);
	}


	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return getConstString(offset + 206, $sppl_grp_nm9);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		setConstString(offset + 206, $sppl_grp_nm9, value);
	}


	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return getConstString(offset + 207, $sppl_grp_cd10);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		setConstString(offset + 207, $sppl_grp_cd10, value);
	}


	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return getConstString(offset + 208, $sppl_grp_nm10);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		setConstString(offset + 208, $sppl_grp_nm10, value);
	}


	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 209, $ins_usr_id);
	}

	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 209, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 210, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 210, $ins_usr_nm, value);
	}


	/**
	 * Entry function 登録機能.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 211, $ins_func_id);
	}

	/**
	 * Entry function 登録機能.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 211, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 212, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 212, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 213, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 213, $ins_ts, value);
	}


	/**
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 214, $upd_usr_id);
	}

	/**
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 214, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 215, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 215, $upd_usr_nm, value);
	}


	/**
	 * Update function 更新機能.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 216, $upd_func_id);
	}

	/**
	 * Update function 更新機能.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 216, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 217, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 217, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 218, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 218, $upd_ts, value);
	}


	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 219, $upd_srv_req_no);
	}

	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 219, $upd_srv_req_no, value);
	}


	/**
	 * PO transaction unit cd. 発注取引単位ＣＤ.<p>
	 *
	 */
	public String po_trd_unit_cd() {
		return getConstString(offset + 220, $po_trd_unit_cd);
	}

	/**
	 * PO transaction unit cd. 発注取引単位ＣＤ.<p>
	 *
	 */
	public void po_trd_unit_cd(String value) {
		setConstString(offset + 220, $po_trd_unit_cd, value);
	}


	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public MCNumber po_trd_unit_qty() {
		return getConstNumber(offset + 221, $po_trd_unit_qty);
	}

	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public void po_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 221, $po_trd_unit_qty, value);
	}

	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public void po_trd_unit_qty(int value) {
		setConstNumber(offset + 221, $po_trd_unit_qty, value);
	}

	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public void po_trd_unit_qty(long value) {
		setConstNumber(offset + 221, $po_trd_unit_qty, value);
	}

	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public void po_trd_unit_qty(float value) {
		setConstNumber(offset + 221, $po_trd_unit_qty, value);
	}

	/**
	 * Transaction unit PO qty. 発注取引単位数量.<p>
	 *
	 */
	public void po_trd_unit_qty(double value) {
		setConstNumber(offset + 221, $po_trd_unit_qty, value);
	}


	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public MCNumber po_trd_cur_upri() {
		return getConstNumber(offset + 222, $po_trd_cur_upri);
	}

	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public void po_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 222, $po_trd_cur_upri, value);
	}

	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public void po_trd_cur_upri(int value) {
		setConstNumber(offset + 222, $po_trd_cur_upri, value);
	}

	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public void po_trd_cur_upri(long value) {
		setConstNumber(offset + 222, $po_trd_cur_upri, value);
	}

	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public void po_trd_cur_upri(float value) {
		setConstNumber(offset + 222, $po_trd_cur_upri, value);
	}

	/**
	 * PO unit price 発注単価.<p>
	 *
	 */
	public void po_trd_cur_upri(double value) {
		setConstNumber(offset + 222, $po_trd_cur_upri, value);
	}


	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public MCNumber po_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 223, $po_trd_cur_dscnt_amt);
	}

	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public void po_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 223, $po_trd_cur_dscnt_amt, value);
	}

	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public void po_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 223, $po_trd_cur_dscnt_amt, value);
	}

	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public void po_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 223, $po_trd_cur_dscnt_amt, value);
	}

	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public void po_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 223, $po_trd_cur_dscnt_amt, value);
	}

	/**
	 * PO discount amount 発注値引額.<p>
	 *
	 */
	public void po_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 223, $po_trd_cur_dscnt_amt, value);
	}


	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public MCNumber po_trd_cur_proc_upri() {
		return getConstNumber(offset + 224, $po_trd_cur_proc_upri);
	}

	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public void po_trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 224, $po_trd_cur_proc_upri, value);
	}

	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public void po_trd_cur_proc_upri(int value) {
		setConstNumber(offset + 224, $po_trd_cur_proc_upri, value);
	}

	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public void po_trd_cur_proc_upri(long value) {
		setConstNumber(offset + 224, $po_trd_cur_proc_upri, value);
	}

	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public void po_trd_cur_proc_upri(float value) {
		setConstNumber(offset + 224, $po_trd_cur_proc_upri, value);
	}

	/**
	 * PO subcontracting unit price 発注加工単価.<p>
	 *
	 */
	public void po_trd_cur_proc_upri(double value) {
		setConstNumber(offset + 224, $po_trd_cur_proc_upri, value);
	}


	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public MCNumber po_trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 225, $po_trd_cur_onr_prov_upri);
	}

	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 225, $po_trd_cur_onr_prov_upri, value);
	}

	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 225, $po_trd_cur_onr_prov_upri, value);
	}

	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 225, $po_trd_cur_onr_prov_upri, value);
	}

	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 225, $po_trd_cur_onr_prov_upri, value);
	}

	/**
	 * PO chargeable supply unit price 発注有償支給単価.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 225, $po_trd_cur_onr_prov_upri, value);
	}


	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public MCNumber po_trd_cur_amt() {
		return getConstNumber(offset + 226, $po_trd_cur_amt);
	}

	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public void po_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 226, $po_trd_cur_amt, value);
	}

	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public void po_trd_cur_amt(int value) {
		setConstNumber(offset + 226, $po_trd_cur_amt, value);
	}

	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public void po_trd_cur_amt(long value) {
		setConstNumber(offset + 226, $po_trd_cur_amt, value);
	}

	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public void po_trd_cur_amt(float value) {
		setConstNumber(offset + 226, $po_trd_cur_amt, value);
	}

	/**
	 * PO amount 発注金額.<p>
	 *
	 */
	public void po_trd_cur_amt(double value) {
		setConstNumber(offset + 226, $po_trd_cur_amt, value);
	}


	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public MCNumber po_trd_cur_proc_amt() {
		return getConstNumber(offset + 227, $po_trd_cur_proc_amt);
	}

	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public void po_trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 227, $po_trd_cur_proc_amt, value);
	}

	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public void po_trd_cur_proc_amt(int value) {
		setConstNumber(offset + 227, $po_trd_cur_proc_amt, value);
	}

	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public void po_trd_cur_proc_amt(long value) {
		setConstNumber(offset + 227, $po_trd_cur_proc_amt, value);
	}

	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public void po_trd_cur_proc_amt(float value) {
		setConstNumber(offset + 227, $po_trd_cur_proc_amt, value);
	}

	/**
	 * PO subcontracting amount 発注加工金額.<p>
	 *
	 */
	public void po_trd_cur_proc_amt(double value) {
		setConstNumber(offset + 227, $po_trd_cur_proc_amt, value);
	}


	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public MCNumber po_trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 228, $po_trd_cur_onr_prov_amt);
	}

	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 228, $po_trd_cur_onr_prov_amt, value);
	}

	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 228, $po_trd_cur_onr_prov_amt, value);
	}

	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 228, $po_trd_cur_onr_prov_amt, value);
	}

	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 228, $po_trd_cur_onr_prov_amt, value);
	}

	/**
	 * PO chargeable supply amount 発注有償支給金額.<p>
	 *
	 */
	public void po_trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 228, $po_trd_cur_onr_prov_amt, value);
	}


	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public MCNumber po_trd_cur_tax_amt() {
		return getConstNumber(offset + 229, $po_trd_cur_tax_amt);
	}

	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public void po_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 229, $po_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public void po_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 229, $po_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public void po_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 229, $po_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public void po_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 229, $po_trd_cur_tax_amt, value);
	}

	/**
	 * PO tax amount 発注税額.<p>
	 *
	 */
	public void po_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 229, $po_trd_cur_tax_amt, value);
	}


	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public MCNumber po_trd_cur_inc_ctax_amt() {
		return getConstNumber(offset + 230, $po_trd_cur_inc_ctax_amt);
	}

	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public void po_trd_cur_inc_ctax_amt(MCNumber value) {
		setConstNumber(offset + 230, $po_trd_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public void po_trd_cur_inc_ctax_amt(int value) {
		setConstNumber(offset + 230, $po_trd_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public void po_trd_cur_inc_ctax_amt(long value) {
		setConstNumber(offset + 230, $po_trd_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public void po_trd_cur_inc_ctax_amt(float value) {
		setConstNumber(offset + 230, $po_trd_cur_inc_ctax_amt, value);
	}

	/**
	 * Tax included PO amount 発注税込金額.<p>
	 *
	 */
	public void po_trd_cur_inc_ctax_amt(double value) {
		setConstNumber(offset + 230, $po_trd_cur_inc_ctax_amt, value);
	}


	/**
	 * PO withholding tax amount 発注源泉税額.<p>
	 *
	 */
	public MCNumber po_wtax_amt() {
		return getConstNumber(offset + 231, $po_wtax_amt);
	}

	/**
	 * PO withholding tax amount 発注源泉税額.<p>
	 *
	 */
	public void po_wtax_amt(MCNumber value) {
		setConstNumber(offset + 231, $po_wtax_amt, value);
	}

	/**
	 * PO withholding tax amount 発注源泉税額.<p>
	 *
	 */
	public void po_wtax_amt(int value) {
		setConstNumber(offset + 231, $po_wtax_amt, value);
	}

	/**
	 * PO withholding tax amount 発注源泉税額.<p>
	 *
	 */
	public void po_wtax_amt(long value) {
		setConstNumber(offset + 231, $po_wtax_amt, value);
	}

	/**
	 * PO withholding tax amount 発注源泉税額.<p>
	 *
	 */
	public void po_wtax_amt(float value) {
		setConstNumber(offset + 231, $po_wtax_amt, value);
	}

	/**
	 * PO withholding tax amount 発注源泉税額.<p>
	 *
	 */
	public void po_wtax_amt(double value) {
		setConstNumber(offset + 231, $po_wtax_amt, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 232, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 232, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 232, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 232, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 232, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 232, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 233, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 233, $base_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public MCNumber po_trd_unit_conv_qty() {
		return getConstNumber(offset + 234, $po_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public void po_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 234, $po_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public void po_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 234, $po_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public void po_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 234, $po_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public void po_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 234, $po_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit PO conversion qty. 発注取引単位換算数量.<p>
	 *
	 */
	public void po_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 234, $po_trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber po_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 235, $po_trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public void po_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 235, $po_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public void po_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 235, $po_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public void po_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 235, $po_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public void po_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 235, $po_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit PO conversion base qty. 発注取引単位換算基準数量.<p>
	 *
	 */
	public void po_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 235, $po_trd_unit_conv_base_qty, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 236, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 236, $inc_tax_flg, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 237, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 237, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 237, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 237, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 237, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 237, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 238, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 238, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 238, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 238, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 238, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 238, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 239, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 239, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 239, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 239, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 239, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 239, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 240, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 240, $trd_unit_rnd_typ, value);
	}


	public String getString(String name) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_typ_nm.equalsIgnoreCase(name)) {
			return in_to_id_typ_nm();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			return in_to_id_nm();
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			return in_to_zip_cd();
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			return in_to_addr1();
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			return in_to_addr2();
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			return in_to_addr3();
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			return in_to_addr4();
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			return in_to_tel();
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			return in_to_fax();
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			return in_to_cntry_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($purc_tterm_cd1.equalsIgnoreCase(name)) {
			return purc_tterm_cd1();
		}
		if ($purc_tterm_nm1.equalsIgnoreCase(name)) {
			return purc_tterm_nm1();
		}
		if ($purc_tterm_rmrks1.equalsIgnoreCase(name)) {
			return purc_tterm_rmrks1();
		}
		if ($purc_tterm_cd2.equalsIgnoreCase(name)) {
			return purc_tterm_cd2();
		}
		if ($purc_tterm_nm2.equalsIgnoreCase(name)) {
			return purc_tterm_nm2();
		}
		if ($purc_tterm_rmrks2.equalsIgnoreCase(name)) {
			return purc_tterm_rmrks2();
		}
		if ($purc_tterm_cd3.equalsIgnoreCase(name)) {
			return purc_tterm_cd3();
		}
		if ($purc_tterm_nm3.equalsIgnoreCase(name)) {
			return purc_tterm_nm3();
		}
		if ($purc_tterm_rmrks3.equalsIgnoreCase(name)) {
			return purc_tterm_rmrks3();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($slo_trd_ptn_typ.equalsIgnoreCase(name)) {
			return slo_trd_ptn_typ();
		}
		if ($slo_trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return slo_trd_ptn_typ_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($slo_cur_cd.equalsIgnoreCase(name)) {
			return slo_cur_cd();
		}
		if ($slo_cur_nm.equalsIgnoreCase(name)) {
			return slo_cur_nm();
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			return slo_tterm_cd1();
		}
		if ($slo_tterm_nm1.equalsIgnoreCase(name)) {
			return slo_tterm_nm1();
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks1();
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			return slo_tterm_cd2();
		}
		if ($slo_tterm_nm2.equalsIgnoreCase(name)) {
			return slo_tterm_nm2();
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks2();
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			return slo_tterm_cd3();
		}
		if ($slo_tterm_nm3.equalsIgnoreCase(name)) {
			return slo_tterm_nm3();
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks3();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
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
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
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
		if ($po_trd_unit_cd.equalsIgnoreCase(name)) {
			return po_trd_unit_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			return sim_cnd_grp_no();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			return arr_schd_qty();
		}
		if ($arr_act_qty.equalsIgnoreCase(name)) {
			return arr_act_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri();
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		if ($inc_ctax_amt.equalsIgnoreCase(name)) {
			return inc_ctax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_amt_dec_place();
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_upri_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			return base_cur_proc_upri();
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_upri();
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			return base_cur_proc_amt();
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt();
		}
		if ($base_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_ctax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			return base_amt_dec_place();
		}
		if ($base_upri_dec_place.equalsIgnoreCase(name)) {
			return base_upri_dec_place();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return ptax_cur_dscnt_amt();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			return ptax_cur_proc_upri();
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_upri();
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			return ptax_cur_proc_amt();
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_amt();
		}
		if ($ptax_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_inc_ctax_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($ptax_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_amt_dec_place();
		}
		if ($ptax_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_upri_dec_place();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			return slo_xrate();
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			return slo_ptax_xrate();
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			return po_trd_unit_qty();
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			return po_trd_cur_upri();
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_dscnt_amt();
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return po_trd_cur_proc_upri();
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return po_trd_cur_onr_prov_upri();
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_amt();
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_proc_amt();
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_onr_prov_amt();
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_tax_amt();
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_inc_ctax_amt();
		}
		if ($po_wtax_amt.equalsIgnoreCase(name)) {
			return po_wtax_amt();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return po_trd_unit_conv_qty();
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return po_trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			return arr_schd_dt();
		}
		if ($arr_schd_hm.equalsIgnoreCase(name)) {
			return arr_schd_hm();
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			return arr_dt();
		}
		if ($arr_hm.equalsIgnoreCase(name)) {
			return arr_hm();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
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
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($selectable_flg.equalsIgnoreCase(name)) {
			return selectable_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_typ_nm.equalsIgnoreCase(name)) {
			return in_to_id_typ_nm();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			return in_to_id_nm();
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			return in_to_zip_cd();
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			return in_to_addr1();
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			return in_to_addr2();
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			return in_to_addr3();
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			return in_to_addr4();
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			return in_to_tel();
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			return in_to_fax();
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			return in_to_cntry_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($purc_tterm_cd1.equalsIgnoreCase(name)) {
			return purc_tterm_cd1();
		}
		if ($purc_tterm_nm1.equalsIgnoreCase(name)) {
			return purc_tterm_nm1();
		}
		if ($purc_tterm_rmrks1.equalsIgnoreCase(name)) {
			return purc_tterm_rmrks1();
		}
		if ($purc_tterm_cd2.equalsIgnoreCase(name)) {
			return purc_tterm_cd2();
		}
		if ($purc_tterm_nm2.equalsIgnoreCase(name)) {
			return purc_tterm_nm2();
		}
		if ($purc_tterm_rmrks2.equalsIgnoreCase(name)) {
			return purc_tterm_rmrks2();
		}
		if ($purc_tterm_cd3.equalsIgnoreCase(name)) {
			return purc_tterm_cd3();
		}
		if ($purc_tterm_nm3.equalsIgnoreCase(name)) {
			return purc_tterm_nm3();
		}
		if ($purc_tterm_rmrks3.equalsIgnoreCase(name)) {
			return purc_tterm_rmrks3();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($slo_trd_ptn_typ.equalsIgnoreCase(name)) {
			return slo_trd_ptn_typ();
		}
		if ($slo_trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return slo_trd_ptn_typ_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($slo_cur_cd.equalsIgnoreCase(name)) {
			return slo_cur_cd();
		}
		if ($slo_cur_nm.equalsIgnoreCase(name)) {
			return slo_cur_nm();
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			return slo_tterm_cd1();
		}
		if ($slo_tterm_nm1.equalsIgnoreCase(name)) {
			return slo_tterm_nm1();
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks1();
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			return slo_tterm_cd2();
		}
		if ($slo_tterm_nm2.equalsIgnoreCase(name)) {
			return slo_tterm_nm2();
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks2();
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			return slo_tterm_cd3();
		}
		if ($slo_tterm_nm3.equalsIgnoreCase(name)) {
			return slo_tterm_nm3();
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			return slo_tterm_rmrks3();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
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
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
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
		if ($po_trd_unit_cd.equalsIgnoreCase(name)) {
			return po_trd_unit_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			return sim_cnd_grp_no();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			return arr_schd_qty();
		}
		if ($arr_act_qty.equalsIgnoreCase(name)) {
			return arr_act_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri();
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		if ($inc_ctax_amt.equalsIgnoreCase(name)) {
			return inc_ctax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_amt_dec_place();
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_upri_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			return base_cur_proc_upri();
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_upri();
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			return base_cur_proc_amt();
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt();
		}
		if ($base_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_ctax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			return base_amt_dec_place();
		}
		if ($base_upri_dec_place.equalsIgnoreCase(name)) {
			return base_upri_dec_place();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return ptax_cur_dscnt_amt();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			return ptax_cur_proc_upri();
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_upri();
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			return ptax_cur_proc_amt();
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_amt();
		}
		if ($ptax_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_inc_ctax_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($ptax_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_amt_dec_place();
		}
		if ($ptax_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_upri_dec_place();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($slo_xrate.equalsIgnoreCase(name)) {
			return slo_xrate();
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			return slo_ptax_xrate();
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			return po_trd_unit_qty();
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			return po_trd_cur_upri();
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_dscnt_amt();
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return po_trd_cur_proc_upri();
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return po_trd_cur_onr_prov_upri();
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_amt();
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_proc_amt();
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_onr_prov_amt();
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_tax_amt();
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			return po_trd_cur_inc_ctax_amt();
		}
		if ($po_wtax_amt.equalsIgnoreCase(name)) {
			return po_wtax_amt();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return po_trd_unit_conv_qty();
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return po_trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			return arr_schd_dt();
		}
		if ($arr_schd_hm.equalsIgnoreCase(name)) {
			return arr_schd_hm();
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			return arr_dt();
		}
		if ($arr_hm.equalsIgnoreCase(name)) {
			return arr_hm();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
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
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($selectable_flg.equalsIgnoreCase(name)) {
			return selectable_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_typ_nm.equalsIgnoreCase(name)) {
			in_to_id_typ_nm(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			in_to_id_nm(value);
			return;
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
			return;
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			in_to_zip_cd(value);
			return;
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			in_to_addr1(value);
			return;
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			in_to_addr2(value);
			return;
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			in_to_addr3(value);
			return;
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			in_to_addr4(value);
			return;
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			in_to_tel(value);
			return;
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			in_to_fax(value);
			return;
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
			return;
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			in_to_cntry_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($purc_tterm_cd1.equalsIgnoreCase(name)) {
			purc_tterm_cd1(value);
			return;
		}
		if ($purc_tterm_nm1.equalsIgnoreCase(name)) {
			purc_tterm_nm1(value);
			return;
		}
		if ($purc_tterm_rmrks1.equalsIgnoreCase(name)) {
			purc_tterm_rmrks1(value);
			return;
		}
		if ($purc_tterm_cd2.equalsIgnoreCase(name)) {
			purc_tterm_cd2(value);
			return;
		}
		if ($purc_tterm_nm2.equalsIgnoreCase(name)) {
			purc_tterm_nm2(value);
			return;
		}
		if ($purc_tterm_rmrks2.equalsIgnoreCase(name)) {
			purc_tterm_rmrks2(value);
			return;
		}
		if ($purc_tterm_cd3.equalsIgnoreCase(name)) {
			purc_tterm_cd3(value);
			return;
		}
		if ($purc_tterm_nm3.equalsIgnoreCase(name)) {
			purc_tterm_nm3(value);
			return;
		}
		if ($purc_tterm_rmrks3.equalsIgnoreCase(name)) {
			purc_tterm_rmrks3(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
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
		if ($slo_trd_ptn_typ.equalsIgnoreCase(name)) {
			slo_trd_ptn_typ(value);
			return;
		}
		if ($slo_trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			slo_trd_ptn_typ_nm(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			sls_basis_typ_nm(value);
			return;
		}
		if ($slo_cur_cd.equalsIgnoreCase(name)) {
			slo_cur_cd(value);
			return;
		}
		if ($slo_cur_nm.equalsIgnoreCase(name)) {
			slo_cur_nm(value);
			return;
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			slo_tterm_cd1(value);
			return;
		}
		if ($slo_tterm_nm1.equalsIgnoreCase(name)) {
			slo_tterm_nm1(value);
			return;
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			slo_tterm_rmrks1(value);
			return;
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			slo_tterm_cd2(value);
			return;
		}
		if ($slo_tterm_nm2.equalsIgnoreCase(name)) {
			slo_tterm_nm2(value);
			return;
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			slo_tterm_rmrks2(value);
			return;
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			slo_tterm_cd3(value);
			return;
		}
		if ($slo_tterm_nm3.equalsIgnoreCase(name)) {
			slo_tterm_nm3(value);
			return;
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			slo_tterm_rmrks3(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
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
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_sts_typ_nm(value);
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
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
		if ($po_trd_unit_cd.equalsIgnoreCase(name)) {
			po_trd_unit_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_act_qty.equalsIgnoreCase(name)) {
			arr_act_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($inc_ctax_amt.equalsIgnoreCase(name)) {
			inc_ctax_amt(value);
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
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_ctax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_upri_dec_place.equalsIgnoreCase(name)) {
			base_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_ctax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_amt_dec_place(value);
			return;
		}
		if ($ptax_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_upri_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_wtax_amt.equalsIgnoreCase(name)) {
			po_wtax_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_act_qty.equalsIgnoreCase(name)) {
			arr_act_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($inc_ctax_amt.equalsIgnoreCase(name)) {
			inc_ctax_amt(value);
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
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_ctax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_upri_dec_place.equalsIgnoreCase(name)) {
			base_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_ctax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_amt_dec_place(value);
			return;
		}
		if ($ptax_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_upri_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_wtax_amt.equalsIgnoreCase(name)) {
			po_wtax_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_act_qty.equalsIgnoreCase(name)) {
			arr_act_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($inc_ctax_amt.equalsIgnoreCase(name)) {
			inc_ctax_amt(value);
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
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_ctax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_upri_dec_place.equalsIgnoreCase(name)) {
			base_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_ctax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_amt_dec_place(value);
			return;
		}
		if ($ptax_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_upri_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_wtax_amt.equalsIgnoreCase(name)) {
			po_wtax_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_act_qty.equalsIgnoreCase(name)) {
			arr_act_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($inc_ctax_amt.equalsIgnoreCase(name)) {
			inc_ctax_amt(value);
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
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_ctax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_upri_dec_place.equalsIgnoreCase(name)) {
			base_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_ctax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_amt_dec_place(value);
			return;
		}
		if ($ptax_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_upri_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_wtax_amt.equalsIgnoreCase(name)) {
			po_wtax_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_act_qty.equalsIgnoreCase(name)) {
			arr_act_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($inc_ctax_amt.equalsIgnoreCase(name)) {
			inc_ctax_amt(value);
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
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_ctax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_upri_dec_place.equalsIgnoreCase(name)) {
			base_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_ctax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_amt_dec_place(value);
			return;
		}
		if ($ptax_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_upri_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_wtax_amt.equalsIgnoreCase(name)) {
			po_wtax_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			arr_schd_dt(value);
			return;
		}
		if ($arr_schd_hm.equalsIgnoreCase(name)) {
			arr_schd_hm(value);
			return;
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			arr_dt(value);
			return;
		}
		if ($arr_hm.equalsIgnoreCase(name)) {
			arr_hm(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
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
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($selectable_flg.equalsIgnoreCase(name)) {
			selectable_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_typ_nm.equalsIgnoreCase(name)) {
			in_to_id_typ_nm(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_id_nm.equalsIgnoreCase(name)) {
			in_to_id_nm(value);
			return;
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
			return;
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			in_to_zip_cd(value);
			return;
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			in_to_addr1(value);
			return;
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			in_to_addr2(value);
			return;
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			in_to_addr3(value);
			return;
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			in_to_addr4(value);
			return;
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			in_to_tel(value);
			return;
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			in_to_fax(value);
			return;
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
			return;
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			in_to_cntry_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($purc_tterm_cd1.equalsIgnoreCase(name)) {
			purc_tterm_cd1(value);
			return;
		}
		if ($purc_tterm_nm1.equalsIgnoreCase(name)) {
			purc_tterm_nm1(value);
			return;
		}
		if ($purc_tterm_rmrks1.equalsIgnoreCase(name)) {
			purc_tterm_rmrks1(value);
			return;
		}
		if ($purc_tterm_cd2.equalsIgnoreCase(name)) {
			purc_tterm_cd2(value);
			return;
		}
		if ($purc_tterm_nm2.equalsIgnoreCase(name)) {
			purc_tterm_nm2(value);
			return;
		}
		if ($purc_tterm_rmrks2.equalsIgnoreCase(name)) {
			purc_tterm_rmrks2(value);
			return;
		}
		if ($purc_tterm_cd3.equalsIgnoreCase(name)) {
			purc_tterm_cd3(value);
			return;
		}
		if ($purc_tterm_nm3.equalsIgnoreCase(name)) {
			purc_tterm_nm3(value);
			return;
		}
		if ($purc_tterm_rmrks3.equalsIgnoreCase(name)) {
			purc_tterm_rmrks3(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
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
		if ($slo_trd_ptn_typ.equalsIgnoreCase(name)) {
			slo_trd_ptn_typ(value);
			return;
		}
		if ($slo_trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			slo_trd_ptn_typ_nm(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			sls_basis_typ_nm(value);
			return;
		}
		if ($slo_cur_cd.equalsIgnoreCase(name)) {
			slo_cur_cd(value);
			return;
		}
		if ($slo_cur_nm.equalsIgnoreCase(name)) {
			slo_cur_nm(value);
			return;
		}
		if ($slo_tterm_cd1.equalsIgnoreCase(name)) {
			slo_tterm_cd1(value);
			return;
		}
		if ($slo_tterm_nm1.equalsIgnoreCase(name)) {
			slo_tterm_nm1(value);
			return;
		}
		if ($slo_tterm_rmrks1.equalsIgnoreCase(name)) {
			slo_tterm_rmrks1(value);
			return;
		}
		if ($slo_tterm_cd2.equalsIgnoreCase(name)) {
			slo_tterm_cd2(value);
			return;
		}
		if ($slo_tterm_nm2.equalsIgnoreCase(name)) {
			slo_tterm_nm2(value);
			return;
		}
		if ($slo_tterm_rmrks2.equalsIgnoreCase(name)) {
			slo_tterm_rmrks2(value);
			return;
		}
		if ($slo_tterm_cd3.equalsIgnoreCase(name)) {
			slo_tterm_cd3(value);
			return;
		}
		if ($slo_tterm_nm3.equalsIgnoreCase(name)) {
			slo_tterm_nm3(value);
			return;
		}
		if ($slo_tterm_rmrks3.equalsIgnoreCase(name)) {
			slo_tterm_rmrks3(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
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
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_sts_typ_nm(value);
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
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
		if ($po_trd_unit_cd.equalsIgnoreCase(name)) {
			po_trd_unit_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_act_qty.equalsIgnoreCase(name)) {
			arr_act_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($inc_ctax_amt.equalsIgnoreCase(name)) {
			inc_ctax_amt(value);
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
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_ctax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_upri_dec_place.equalsIgnoreCase(name)) {
			base_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_ctax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_amt_dec_place(value);
			return;
		}
		if ($ptax_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_upri_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_wtax_amt.equalsIgnoreCase(name)) {
			po_wtax_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_act_qty.equalsIgnoreCase(name)) {
			arr_act_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($inc_ctax_amt.equalsIgnoreCase(name)) {
			inc_ctax_amt(value);
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
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_ctax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_upri_dec_place.equalsIgnoreCase(name)) {
			base_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_ctax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_amt_dec_place(value);
			return;
		}
		if ($ptax_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_upri_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_wtax_amt.equalsIgnoreCase(name)) {
			po_wtax_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_act_qty.equalsIgnoreCase(name)) {
			arr_act_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($inc_ctax_amt.equalsIgnoreCase(name)) {
			inc_ctax_amt(value);
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
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_ctax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_upri_dec_place.equalsIgnoreCase(name)) {
			base_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_ctax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_amt_dec_place(value);
			return;
		}
		if ($ptax_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_upri_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_wtax_amt.equalsIgnoreCase(name)) {
			po_wtax_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_act_qty.equalsIgnoreCase(name)) {
			arr_act_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($inc_ctax_amt.equalsIgnoreCase(name)) {
			inc_ctax_amt(value);
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
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_ctax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_upri_dec_place.equalsIgnoreCase(name)) {
			base_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_ctax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_amt_dec_place(value);
			return;
		}
		if ($ptax_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_upri_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_wtax_amt.equalsIgnoreCase(name)) {
			po_wtax_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($sim_cnd_grp_no.equalsIgnoreCase(name)) {
			sim_cnd_grp_no(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($arr_schd_qty.equalsIgnoreCase(name)) {
			arr_schd_qty(value);
			return;
		}
		if ($arr_act_qty.equalsIgnoreCase(name)) {
			arr_act_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($inc_ctax_amt.equalsIgnoreCase(name)) {
			inc_ctax_amt(value);
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
		if ($trd_amt_dec_place.equalsIgnoreCase(name)) {
			trd_amt_dec_place(value);
			return;
		}
		if ($trd_upri_dec_place.equalsIgnoreCase(name)) {
			trd_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_proc_upri.equalsIgnoreCase(name)) {
			base_cur_proc_upri(value);
			return;
		}
		if ($base_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri(value);
			return;
		}
		if ($base_cur_proc_amt.equalsIgnoreCase(name)) {
			base_cur_proc_amt(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_ctax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_amt_dec_place.equalsIgnoreCase(name)) {
			base_amt_dec_place(value);
			return;
		}
		if ($base_upri_dec_place.equalsIgnoreCase(name)) {
			base_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_proc_upri.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri(value);
			return;
		}
		if ($ptax_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri(value);
			return;
		}
		if ($ptax_cur_proc_amt.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt(value);
			return;
		}
		if ($ptax_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt(value);
			return;
		}
		if ($ptax_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_ctax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_amt_dec_place(value);
			return;
		}
		if ($ptax_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_upri_dec_place(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($slo_xrate.equalsIgnoreCase(name)) {
			slo_xrate(value);
			return;
		}
		if ($slo_ptax_xrate.equalsIgnoreCase(name)) {
			slo_ptax_xrate(value);
			return;
		}
		if ($po_trd_unit_qty.equalsIgnoreCase(name)) {
			po_trd_unit_qty(value);
			return;
		}
		if ($po_trd_cur_upri.equalsIgnoreCase(name)) {
			po_trd_cur_upri(value);
			return;
		}
		if ($po_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			po_trd_cur_dscnt_amt(value);
			return;
		}
		if ($po_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			po_trd_cur_proc_upri(value);
			return;
		}
		if ($po_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($po_trd_cur_amt.equalsIgnoreCase(name)) {
			po_trd_cur_amt(value);
			return;
		}
		if ($po_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			po_trd_cur_proc_amt(value);
			return;
		}
		if ($po_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			po_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($po_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_tax_amt(value);
			return;
		}
		if ($po_trd_cur_inc_ctax_amt.equalsIgnoreCase(name)) {
			po_trd_cur_inc_ctax_amt(value);
			return;
		}
		if ($po_wtax_amt.equalsIgnoreCase(name)) {
			po_wtax_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($po_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_qty(value);
			return;
		}
		if ($po_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			po_trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			arr_schd_dt(value);
			return;
		}
		if ($arr_schd_hm.equalsIgnoreCase(name)) {
			arr_schd_hm(value);
			return;
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			arr_dt(value);
			return;
		}
		if ($arr_hm.equalsIgnoreCase(name)) {
			arr_hm(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
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
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($selectable_flg.equalsIgnoreCase(name)) {
			selectable_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

