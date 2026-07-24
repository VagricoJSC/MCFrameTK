package mcframe.commonMSLA.MSLAR2420;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSLAR_IABillPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSLAR2420";
	static final String _version = "700_00000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass IABILLHDRROWL_RC = new MCReportClass("IABillHdrRow", mcframe.commonMSLA.MSLAR2420.IABillHdrRowR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		IABILLHDRROWL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta data_lno_META_0 = new MCReportMeta("data_lno", "", "", "", true);
	static public final MCReportMeta data_no_META_0 = new MCReportMeta("data_no", "", "", "", true);
	static public final MCReportMeta trd_typ_cd_META_0 = new MCReportMeta("trd_typ_cd", "", "", "", true);
	static public final MCReportMeta data_make_dt_META_0 = new MCReportMeta("data_make_dt", "", "", "", true);
	static public final MCReportMeta data_crud_typ_META_0 = new MCReportMeta("data_crud_typ", "", "", "", true);
	static public final MCReportMeta bill_cl_dt_META_0 = new MCReportMeta("bill_cl_dt", "", "", "", true);
	static public final MCReportMeta bill_dt_META_0 = new MCReportMeta("bill_dt", "", "", "", true);
	static public final MCReportMeta bill_no_META_0 = new MCReportMeta("bill_no", "", "", "", true);
	static public final MCReportMeta bill_d_no_META_0 = new MCReportMeta("bill_d_no", "", "", "", true);
	static public final MCReportMeta pre_bill_no_META_0 = new MCReportMeta("pre_bill_no", "", "", "", true);
	static public final MCReportMeta pre_bill_dt_META_0 = new MCReportMeta("pre_bill_dt", "", "", "", true);
	static public final MCReportMeta bill_st_dt_META_0 = new MCReportMeta("bill_st_dt", "", "", "", true);
	static public final MCReportMeta bill_end_dt_META_0 = new MCReportMeta("bill_end_dt", "", "", "", true);
	static public final MCReportMeta iv_no_META_0 = new MCReportMeta("iv_no", "", "", "", true);
	static public final MCReportMeta wrk_no_META_0 = new MCReportMeta("wrk_no", "", "", "", true);
	static public final MCReportMeta wrk_nm_META_0 = new MCReportMeta("wrk_nm", "", "", "", true);
	static public final MCReportMeta bill_co_cd_META_0 = new MCReportMeta("bill_co_cd", "", "", "", true);
	static public final MCReportMeta bill_co_nm_META_0 = new MCReportMeta("bill_co_nm", "", "", "", true);
	static public final MCReportMeta bill_co_ein_META_0 = new MCReportMeta("bill_co_ein", "", "", "", true);
	static public final MCReportMeta bill_co_biz_co_no_META_0 = new MCReportMeta("bill_co_biz_co_no", "", "", "", true);
	static public final MCReportMeta bill_co_zip_cd_META_0 = new MCReportMeta("bill_co_zip_cd", "", "", "", true);
	static public final MCReportMeta bill_co_addr1_META_0 = new MCReportMeta("bill_co_addr1", "", "", "", true);
	static public final MCReportMeta bill_co_addr2_META_0 = new MCReportMeta("bill_co_addr2", "", "", "", true);
	static public final MCReportMeta bill_co_addr3_META_0 = new MCReportMeta("bill_co_addr3", "", "", "", true);
	static public final MCReportMeta bill_co_addr4_META_0 = new MCReportMeta("bill_co_addr4", "", "", "", true);
	static public final MCReportMeta bill_co_dpt_META_0 = new MCReportMeta("bill_co_dpt", "", "", "", true);
	static public final MCReportMeta bill_co_tel_META_0 = new MCReportMeta("bill_co_tel", "", "", "", true);
	static public final MCReportMeta bill_co_cntry_cd_META_0 = new MCReportMeta("bill_co_cntry_cd", "", "", "", true);
	static public final MCReportMeta bill_rcpt_co_cd_META_0 = new MCReportMeta("bill_rcpt_co_cd", "", "", "", true);
	static public final MCReportMeta bill_rcpt_co_nm_META_0 = new MCReportMeta("bill_rcpt_co_nm", "", "", "", true);
	static public final MCReportMeta bill_bcst_nm_META_0 = new MCReportMeta("bill_bcst_nm", "", "", "", true);
	static public final MCReportMeta bill_rcpt_co_ein_META_0 = new MCReportMeta("bill_rcpt_co_ein", "", "", "", true);
	static public final MCReportMeta bill_rcpt_co_biz_co_no_META_0 = new MCReportMeta("bill_rcpt_co_biz_co_no", "", "", "", true);
	static public final MCReportMeta bill_rcpt_co_zip_cd_META_0 = new MCReportMeta("bill_rcpt_co_zip_cd", "", "", "", true);
	static public final MCReportMeta bill_rcpt_co_addr1_META_0 = new MCReportMeta("bill_rcpt_co_addr1", "", "", "", true);
	static public final MCReportMeta bill_rcpt_co_addr2_META_0 = new MCReportMeta("bill_rcpt_co_addr2", "", "", "", true);
	static public final MCReportMeta bill_rcpt_co_addr3_META_0 = new MCReportMeta("bill_rcpt_co_addr3", "", "", "", true);
	static public final MCReportMeta bill_rcpt_co_addr4_META_0 = new MCReportMeta("bill_rcpt_co_addr4", "", "", "", true);
	static public final MCReportMeta bill_bcst_dpt_META_0 = new MCReportMeta("bill_bcst_dpt", "", "", "", true);
	static public final MCReportMeta bill_tel_META_0 = new MCReportMeta("bill_tel", "", "", "", true);
	static public final MCReportMeta bill_rcpt_co_cntry_cd_META_0 = new MCReportMeta("bill_rcpt_co_cntry_cd", "", "", "", true);
	static public final MCReportMeta trd_cur_cd_META_0 = new MCReportMeta("trd_cur_cd", "", "", "", true);
	static public final MCReportMeta bill_xrate_META_0 = new MCReportMeta("bill_xrate", "", "", "", true);
	static public final MCReportMeta last_bill_amt_META_0 = new MCReportMeta("last_bill_amt", "", "", "", true);
	static public final MCReportMeta rcv_amt_META_0 = new MCReportMeta("rcv_amt", "", "", "", true);
	static public final MCReportMeta sw_amt_META_0 = new MCReportMeta("sw_amt", "", "", "", true);
	static public final MCReportMeta setoff_amt_META_0 = new MCReportMeta("setoff_amt", "", "", "", true);
	static public final MCReportMeta bfw_amt_META_0 = new MCReportMeta("bfw_amt", "", "", "", true);
	static public final MCReportMeta sls_amt_META_0 = new MCReportMeta("sls_amt", "", "", "", true);
	static public final MCReportMeta dscnt_amt_META_0 = new MCReportMeta("dscnt_amt", "", "", "", true);
	static public final MCReportMeta ret_amt_META_0 = new MCReportMeta("ret_amt", "", "", "", true);
	static public final MCReportMeta tax_amt_META_0 = new MCReportMeta("tax_amt", "", "", "", true);
	static public final MCReportMeta sw_to_amt_META_0 = new MCReportMeta("sw_to_amt", "", "", "", true);
	static public final MCReportMeta bill_amt_META_0 = new MCReportMeta("bill_amt", "", "", "", true);
	static public final MCReportMeta tax_rate1_META_0 = new MCReportMeta("tax_rate1", "", "", "", true);
	static public final MCReportMeta tax_rate_sls_amt1_META_0 = new MCReportMeta("tax_rate_sls_amt1", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt1_META_0 = new MCReportMeta("tax_rate_tax_amt1", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt1_META_0 = new MCReportMeta("tax_rate_base_tax_amt1", "", "", "", true);
	static public final MCReportMeta tax_rate2_META_0 = new MCReportMeta("tax_rate2", "", "", "", true);
	static public final MCReportMeta tax_rate_sls_amt2_META_0 = new MCReportMeta("tax_rate_sls_amt2", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt2_META_0 = new MCReportMeta("tax_rate_tax_amt2", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt2_META_0 = new MCReportMeta("tax_rate_base_tax_amt2", "", "", "", true);
	static public final MCReportMeta tax_rate3_META_0 = new MCReportMeta("tax_rate3", "", "", "", true);
	static public final MCReportMeta tax_rate_sls_amt3_META_0 = new MCReportMeta("tax_rate_sls_amt3", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt3_META_0 = new MCReportMeta("tax_rate_tax_amt3", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt3_META_0 = new MCReportMeta("tax_rate_base_tax_amt3", "", "", "", true);
	static public final MCReportMeta tax_rate4_META_0 = new MCReportMeta("tax_rate4", "", "", "", true);
	static public final MCReportMeta tax_rate_sls_amt4_META_0 = new MCReportMeta("tax_rate_sls_amt4", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt4_META_0 = new MCReportMeta("tax_rate_tax_amt4", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt4_META_0 = new MCReportMeta("tax_rate_base_tax_amt4", "", "", "", true);
	static public final MCReportMeta tax_rate5_META_0 = new MCReportMeta("tax_rate5", "", "", "", true);
	static public final MCReportMeta tax_rate_sls_amt5_META_0 = new MCReportMeta("tax_rate_sls_amt5", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt5_META_0 = new MCReportMeta("tax_rate_tax_amt5", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt5_META_0 = new MCReportMeta("tax_rate_base_tax_amt5", "", "", "", true);
	static public final MCReportMeta tax_rate6_META_0 = new MCReportMeta("tax_rate6", "", "", "", true);
	static public final MCReportMeta tax_rate_sls_amt6_META_0 = new MCReportMeta("tax_rate_sls_amt6", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt6_META_0 = new MCReportMeta("tax_rate_tax_amt6", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt6_META_0 = new MCReportMeta("tax_rate_base_tax_amt6", "", "", "", true);
	static public final MCReportMeta tax_rate7_META_0 = new MCReportMeta("tax_rate7", "", "", "", true);
	static public final MCReportMeta tax_rate_sls_amt7_META_0 = new MCReportMeta("tax_rate_sls_amt7", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt7_META_0 = new MCReportMeta("tax_rate_tax_amt7", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt7_META_0 = new MCReportMeta("tax_rate_base_tax_amt7", "", "", "", true);
	static public final MCReportMeta tax_rate8_META_0 = new MCReportMeta("tax_rate8", "", "", "", true);
	static public final MCReportMeta tax_rate_sls_amt8_META_0 = new MCReportMeta("tax_rate_sls_amt8", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt8_META_0 = new MCReportMeta("tax_rate_tax_amt8", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt8_META_0 = new MCReportMeta("tax_rate_base_tax_amt8", "", "", "", true);
	static public final MCReportMeta tax_rate9_META_0 = new MCReportMeta("tax_rate9", "", "", "", true);
	static public final MCReportMeta tax_rate_sls_amt9_META_0 = new MCReportMeta("tax_rate_sls_amt9", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt9_META_0 = new MCReportMeta("tax_rate_tax_amt9", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt9_META_0 = new MCReportMeta("tax_rate_base_tax_amt9", "", "", "", true);
	static public final MCReportMeta tax_rate10_META_0 = new MCReportMeta("tax_rate10", "", "", "", true);
	static public final MCReportMeta tax_rate_sls_amt10_META_0 = new MCReportMeta("tax_rate_sls_amt10", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt10_META_0 = new MCReportMeta("tax_rate_tax_amt10", "", "", "", true);
	static public final MCReportMeta tax_rate_base_tax_amt10_META_0 = new MCReportMeta("tax_rate_base_tax_amt10", "", "", "", true);
	static public final MCReportMeta adv_amt_bal_META_0 = new MCReportMeta("adv_amt_bal", "", "", "", true);
	static public final MCReportMeta adv_amt_META_0 = new MCReportMeta("adv_amt", "", "", "", true);
	static public final MCReportMeta adv_setoff_amt_META_0 = new MCReportMeta("adv_setoff_amt", "", "", "", true);
	static public final MCReportMeta adv_setoff_tax_amt_META_0 = new MCReportMeta("adv_setoff_tax_amt", "", "", "", true);
	static public final MCReportMeta rcv_schd_dt1_META_0 = new MCReportMeta("rcv_schd_dt1", "", "", "", true);
	static public final MCReportMeta rcv_schd_amt1_META_0 = new MCReportMeta("rcv_schd_amt1", "", "", "", true);
	static public final MCReportMeta rcv_mtd_cd1_META_0 = new MCReportMeta("rcv_mtd_cd1", "", "", "", true);
	static public final MCReportMeta rcv_mtd_nm1_META_0 = new MCReportMeta("rcv_mtd_nm1", "", "", "", true);
	static public final MCReportMeta rcv_schd_dt2_META_0 = new MCReportMeta("rcv_schd_dt2", "", "", "", true);
	static public final MCReportMeta rcv_schd_amt2_META_0 = new MCReportMeta("rcv_schd_amt2", "", "", "", true);
	static public final MCReportMeta rcv_mtd_cd2_META_0 = new MCReportMeta("rcv_mtd_cd2", "", "", "", true);
	static public final MCReportMeta rcv_mtd_nm2_META_0 = new MCReportMeta("rcv_mtd_nm2", "", "", "", true);
	static public final MCReportMeta rcv_schd_dt3_META_0 = new MCReportMeta("rcv_schd_dt3", "", "", "", true);
	static public final MCReportMeta rcv_schd_amt3_META_0 = new MCReportMeta("rcv_schd_amt3", "", "", "", true);
	static public final MCReportMeta rcv_mtd_cd3_META_0 = new MCReportMeta("rcv_mtd_cd3", "", "", "", true);
	static public final MCReportMeta rcv_mtd_nm3_META_0 = new MCReportMeta("rcv_mtd_nm3", "", "", "", true);
	static public final MCReportMeta rcv_schd_dt4_META_0 = new MCReportMeta("rcv_schd_dt4", "", "", "", true);
	static public final MCReportMeta rcv_schd_amt4_META_0 = new MCReportMeta("rcv_schd_amt4", "", "", "", true);
	static public final MCReportMeta rcv_mtd_cd4_META_0 = new MCReportMeta("rcv_mtd_cd4", "", "", "", true);
	static public final MCReportMeta rcv_mtd_nm4_META_0 = new MCReportMeta("rcv_mtd_nm4", "", "", "", true);
	static public final MCReportMeta rcv_schd_dt5_META_0 = new MCReportMeta("rcv_schd_dt5", "", "", "", true);
	static public final MCReportMeta rcv_schd_amt5_META_0 = new MCReportMeta("rcv_schd_amt5", "", "", "", true);
	static public final MCReportMeta rcv_mtd_cd5_META_0 = new MCReportMeta("rcv_mtd_cd5", "", "", "", true);
	static public final MCReportMeta rcv_mtd_nm5_META_0 = new MCReportMeta("rcv_mtd_nm5", "", "", "", true);
	static public final MCReportMeta rcv_schd_dt6_META_0 = new MCReportMeta("rcv_schd_dt6", "", "", "", true);
	static public final MCReportMeta rcv_schd_amt6_META_0 = new MCReportMeta("rcv_schd_amt6", "", "", "", true);
	static public final MCReportMeta rcv_mtd_cd6_META_0 = new MCReportMeta("rcv_mtd_cd6", "", "", "", true);
	static public final MCReportMeta rcv_mtd_nm6_META_0 = new MCReportMeta("rcv_mtd_nm6", "", "", "", true);
	static public final MCReportMeta rcv_schd_dt7_META_0 = new MCReportMeta("rcv_schd_dt7", "", "", "", true);
	static public final MCReportMeta rcv_schd_amt7_META_0 = new MCReportMeta("rcv_schd_amt7", "", "", "", true);
	static public final MCReportMeta rcv_mtd_cd7_META_0 = new MCReportMeta("rcv_mtd_cd7", "", "", "", true);
	static public final MCReportMeta rcv_mtd_nm7_META_0 = new MCReportMeta("rcv_mtd_nm7", "", "", "", true);
	static public final MCReportMeta rcv_schd_dt8_META_0 = new MCReportMeta("rcv_schd_dt8", "", "", "", true);
	static public final MCReportMeta rcv_schd_amt8_META_0 = new MCReportMeta("rcv_schd_amt8", "", "", "", true);
	static public final MCReportMeta rcv_mtd_cd8_META_0 = new MCReportMeta("rcv_mtd_cd8", "", "", "", true);
	static public final MCReportMeta rcv_mtd_nm8_META_0 = new MCReportMeta("rcv_mtd_nm8", "", "", "", true);
	static public final MCReportMeta rcv_schd_dt9_META_0 = new MCReportMeta("rcv_schd_dt9", "", "", "", true);
	static public final MCReportMeta rcv_schd_amt9_META_0 = new MCReportMeta("rcv_schd_amt9", "", "", "", true);
	static public final MCReportMeta rcv_mtd_cd9_META_0 = new MCReportMeta("rcv_mtd_cd9", "", "", "", true);
	static public final MCReportMeta rcv_mtd_nm9_META_0 = new MCReportMeta("rcv_mtd_nm9", "", "", "", true);
	static public final MCReportMeta rcv_schd_dt10_META_0 = new MCReportMeta("rcv_schd_dt10", "", "", "", true);
	static public final MCReportMeta rcv_schd_amt10_META_0 = new MCReportMeta("rcv_schd_amt10", "", "", "", true);
	static public final MCReportMeta rcv_mtd_cd10_META_0 = new MCReportMeta("rcv_mtd_cd10", "", "", "", true);
	static public final MCReportMeta rcv_mtd_nm10_META_0 = new MCReportMeta("rcv_mtd_nm10", "", "", "", true);
	static public final MCReportMeta bank_ac_cd_META_0 = new MCReportMeta("bank_ac_cd", "", "", "", true);
	static public final MCReportMeta bank_ac_typ_META_0 = new MCReportMeta("bank_ac_typ", "", "", "", true);
	static public final MCReportMeta bank_ac_no_META_0 = new MCReportMeta("bank_ac_no", "", "", "", true);
	static public final MCReportMeta bank_ac_holder_META_0 = new MCReportMeta("bank_ac_holder", "", "", "", true);
	static public final MCReportMeta bank_ac_holder_sub_META_0 = new MCReportMeta("bank_ac_holder_sub", "", "", "", true);
	static public final MCReportMeta bank_cd_META_0 = new MCReportMeta("bank_cd", "", "", "", true);
	static public final MCReportMeta bank_nm_META_0 = new MCReportMeta("bank_nm", "", "", "", true);
	static public final MCReportMeta branch_cd_META_0 = new MCReportMeta("branch_cd", "", "", "", true);
	static public final MCReportMeta branch_nm_META_0 = new MCReportMeta("branch_nm", "", "", "", true);
	static public final MCReportMeta trd_cd_META_0 = new MCReportMeta("trd_cd", "", "", "", true);
	static public final MCReportMeta trd_nm_META_0 = new MCReportMeta("trd_nm", "", "", "", true);
	static public final MCReportMeta trd_ptn_typ_META_0 = new MCReportMeta("trd_ptn_typ", "", "", "", true);
	static public final MCReportMeta slip_sts_typ_META_0 = new MCReportMeta("slip_sts_typ", "", "", "", true);
	static public final MCReportMeta dlv_slip_no_META_0 = new MCReportMeta("dlv_slip_no", "", "", "", true);
	static public final MCReportMeta dlv_slip_d_no_META_0 = new MCReportMeta("dlv_slip_d_no", "", "", "", true);
	static public final MCReportMeta ship_dlv_slip_no_META_0 = new MCReportMeta("ship_dlv_slip_no", "", "", "", true);
	static public final MCReportMeta ship_dlv_slip_d_no_META_0 = new MCReportMeta("ship_dlv_slip_d_no", "", "", "", true);
	static public final MCReportMeta act_no_META_0 = new MCReportMeta("act_no", "", "", "", true);
	static public final MCReportMeta act_rev_META_0 = new MCReportMeta("act_rev", "", "", "", true);
	static public final MCReportMeta act_d_no_META_0 = new MCReportMeta("act_d_no", "", "", "", true);
	static public final MCReportMeta cst_po_no_META_0 = new MCReportMeta("cst_po_no", "", "", "", true);
	static public final MCReportMeta cst_po_d_no_META_0 = new MCReportMeta("cst_po_d_no", "", "", "", true);
	static public final MCReportMeta ac_dt_META_0 = new MCReportMeta("ac_dt", "", "", "", true);
	static public final MCReportMeta dlv_dt_META_0 = new MCReportMeta("dlv_dt", "", "", "", true);
	static public final MCReportMeta rcv_dt_META_0 = new MCReportMeta("rcv_dt", "", "", "", true);
	static public final MCReportMeta bill_basis_dt_META_0 = new MCReportMeta("bill_basis_dt", "", "", "", true);
	static public final MCReportMeta base_ac_dt_META_0 = new MCReportMeta("base_ac_dt", "", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_META_0 = new MCReportMeta("itm_sub1", "", "", "", true);
	static public final MCReportMeta itm_sub2_META_0 = new MCReportMeta("itm_sub2", "", "", "", true);
	static public final MCReportMeta itm_sub3_META_0 = new MCReportMeta("itm_sub3", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta itm_alt_nm1_META_0 = new MCReportMeta("itm_alt_nm1", "", "", "", true);
	static public final MCReportMeta itm_alt_nm2_META_0 = new MCReportMeta("itm_alt_nm2", "", "", "", true);
	static public final MCReportMeta itm_alt_nm3_META_0 = new MCReportMeta("itm_alt_nm3", "", "", "", true);
	static public final MCReportMeta itm_alt_nm4_META_0 = new MCReportMeta("itm_alt_nm4", "", "", "", true);
	static public final MCReportMeta sno1_META_0 = new MCReportMeta("sno1", "", "", "", true);
	static public final MCReportMeta sno2_META_0 = new MCReportMeta("sno2", "", "", "", true);
	static public final MCReportMeta sno3_META_0 = new MCReportMeta("sno3", "", "", "", true);
	static public final MCReportMeta sno4_META_0 = new MCReportMeta("sno4", "", "", "", true);
	static public final MCReportMeta trd_unit_cd_META_0 = new MCReportMeta("trd_unit_cd", "", "", "", true);
	static public final MCReportMeta trd_unit_nm_META_0 = new MCReportMeta("trd_unit_nm", "", "", "", true);
	static public final MCReportMeta trd_unit_qty_META_0 = new MCReportMeta("trd_unit_qty", "", "", "", true);
	static public final MCReportMeta interim_flg_META_0 = new MCReportMeta("interim_flg", "", "", "", true);
	static public final MCReportMeta trd_cur_upri_META_0 = new MCReportMeta("trd_cur_upri", "", "", "", true);
	static public final MCReportMeta trd_cur_amt_META_0 = new MCReportMeta("trd_cur_amt", "", "", "", true);
	static public final MCReportMeta trd_cur_dscnt_amt_META_0 = new MCReportMeta("trd_cur_dscnt_amt", "", "", "", true);
	static public final MCReportMeta tax_cd_META_0 = new MCReportMeta("tax_cd", "", "", "", true);
	static public final MCReportMeta tax_nm_META_0 = new MCReportMeta("tax_nm", "", "", "", true);
	static public final MCReportMeta tax_rate_META_0 = new MCReportMeta("tax_rate", "", "", "", true);
	static public final MCReportMeta inc_tax_flg_META_0 = new MCReportMeta("inc_tax_flg", "", "", "", true);
	static public final MCReportMeta trd_cur_tax_amt_META_0 = new MCReportMeta("trd_cur_tax_amt", "", "", "", true);
	static public final MCReportMeta trd_d_rmrks_META_0 = new MCReportMeta("trd_d_rmrks", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);
	static public final MCReportMeta sub_char4_META_0 = new MCReportMeta("sub_char4", "", "", "", true);
	static public final MCReportMeta sub_char5_META_0 = new MCReportMeta("sub_char5", "", "", "", true);
	static public final MCReportMeta sub_char6_META_0 = new MCReportMeta("sub_char6", "", "", "", true);
	static public final MCReportMeta sub_char7_META_0 = new MCReportMeta("sub_char7", "", "", "", true);
	static public final MCReportMeta sub_char8_META_0 = new MCReportMeta("sub_char8", "", "", "", true);
	static public final MCReportMeta sub_char9_META_0 = new MCReportMeta("sub_char9", "", "", "", true);
	static public final MCReportMeta sub_char10_META_0 = new MCReportMeta("sub_char10", "", "", "", true);
	static public final MCReportMeta sub_char11_META_0 = new MCReportMeta("sub_char11", "", "", "", true);
	static public final MCReportMeta sub_char12_META_0 = new MCReportMeta("sub_char12", "", "", "", true);
	static public final MCReportMeta sub_char13_META_0 = new MCReportMeta("sub_char13", "", "", "", true);
	static public final MCReportMeta sub_char14_META_0 = new MCReportMeta("sub_char14", "", "", "", true);
	static public final MCReportMeta sub_char15_META_0 = new MCReportMeta("sub_char15", "", "", "", true);
	static public final MCReportMeta sub_char16_META_0 = new MCReportMeta("sub_char16", "", "", "", true);
	static public final MCReportMeta sub_char17_META_0 = new MCReportMeta("sub_char17", "", "", "", true);
	static public final MCReportMeta sub_char18_META_0 = new MCReportMeta("sub_char18", "", "", "", true);
	static public final MCReportMeta sub_char19_META_0 = new MCReportMeta("sub_char19", "", "", "", true);
	static public final MCReportMeta sub_char20_META_0 = new MCReportMeta("sub_char20", "", "", "", true);
	static public final MCReportMeta sub_char21_META_0 = new MCReportMeta("sub_char21", "", "", "", true);
	static public final MCReportMeta sub_char22_META_0 = new MCReportMeta("sub_char22", "", "", "", true);
	static public final MCReportMeta sub_char23_META_0 = new MCReportMeta("sub_char23", "", "", "", true);
	static public final MCReportMeta sub_char24_META_0 = new MCReportMeta("sub_char24", "", "", "", true);
	static public final MCReportMeta sub_char25_META_0 = new MCReportMeta("sub_char25", "", "", "", true);
	static public final MCReportMeta sub_char26_META_0 = new MCReportMeta("sub_char26", "", "", "", true);
	static public final MCReportMeta sub_char27_META_0 = new MCReportMeta("sub_char27", "", "", "", true);
	static public final MCReportMeta sub_char28_META_0 = new MCReportMeta("sub_char28", "", "", "", true);
	static public final MCReportMeta sub_char29_META_0 = new MCReportMeta("sub_char29", "", "", "", true);
	static public final MCReportMeta sub_char30_META_0 = new MCReportMeta("sub_char30", "", "", "", true);
	static public final MCReportMeta sub_num1_META_0 = new MCReportMeta("sub_num1", "", "", "", true);
	static public final MCReportMeta sub_num2_META_0 = new MCReportMeta("sub_num2", "", "", "", true);
	static public final MCReportMeta sub_num3_META_0 = new MCReportMeta("sub_num3", "", "", "", true);
	static public final MCReportMeta sub_num4_META_0 = new MCReportMeta("sub_num4", "", "", "", true);
	static public final MCReportMeta sub_num5_META_0 = new MCReportMeta("sub_num5", "", "", "", true);
	static public final MCReportMeta sub_dt1_META_0 = new MCReportMeta("sub_dt1", "", "", "", true);
	static public final MCReportMeta sub_dt2_META_0 = new MCReportMeta("sub_dt2", "", "", "", true);
	static public final MCReportMeta sub_dt3_META_0 = new MCReportMeta("sub_dt3", "", "", "", true);
	static public final MCReportMeta sub_dt4_META_0 = new MCReportMeta("sub_dt4", "", "", "", true);
	static public final MCReportMeta sub_dt5_META_0 = new MCReportMeta("sub_dt5", "", "", "", true);
	static public final MCReportMeta upri_unit_cd_META_0 = new MCReportMeta("upri_unit_cd", "", "", "", true);
	static public final MCReportMeta bill_paid_amt_META_0 = new MCReportMeta("bill_paid_amt", "", "", "", true);
	static public final MCReportMeta bill_due_amt_META_0 = new MCReportMeta("bill_due_amt", "", "", "", true);
	static public final MCReportMeta ttl_bill_amt_META_0 = new MCReportMeta("ttl_bill_amt", "", "", "", true);
	static public final MCReportMeta sum_bill_amt_inc_tax_META_0 = new MCReportMeta("sum_bill_amt_inc_tax", "", "", "", true);
	static public final MCReportMeta sum_bill_amt_META_0 = new MCReportMeta("sum_bill_amt", "", "", "", true);
	static public final MCReportMeta tax_rate_ctg_per0_META_0 = new MCReportMeta("tax_rate_ctg_per0", "", "", "", true);
	static public final MCReportMeta tax_rate_sls_amt_per0_META_0 = new MCReportMeta("tax_rate_sls_amt_per0", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt_per0_META_0 = new MCReportMeta("tax_rate_tax_amt_per0", "", "", "", true);
	static public final MCReportMeta tax_rate_ctg_per8_META_0 = new MCReportMeta("tax_rate_ctg_per8", "", "", "", true);
	static public final MCReportMeta tax_rate_sls_amt_per8_META_0 = new MCReportMeta("tax_rate_sls_amt_per8", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt_per8_META_0 = new MCReportMeta("tax_rate_tax_amt_per8", "", "", "", true);
	static public final MCReportMeta tax_rate_ctg_per10_META_0 = new MCReportMeta("tax_rate_ctg_per10", "", "", "", true);
	static public final MCReportMeta tax_rate_sls_amt_per10_META_0 = new MCReportMeta("tax_rate_sls_amt_per10", "", "", "", true);
	static public final MCReportMeta tax_rate_tax_amt_per10_META_0 = new MCReportMeta("tax_rate_tax_amt_per10", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("IABillHdrRow",
			data_lno_META_0,
			data_no_META_0,
			trd_typ_cd_META_0,
			data_make_dt_META_0,
			data_crud_typ_META_0,
			bill_cl_dt_META_0,
			bill_dt_META_0,
			bill_no_META_0,
			bill_d_no_META_0,
			pre_bill_no_META_0,
			pre_bill_dt_META_0,
			bill_st_dt_META_0,
			bill_end_dt_META_0,
			iv_no_META_0,
			wrk_no_META_0,
			wrk_nm_META_0,
			bill_co_cd_META_0,
			bill_co_nm_META_0,
			bill_co_ein_META_0,
			bill_co_biz_co_no_META_0,
			bill_co_zip_cd_META_0,
			bill_co_addr1_META_0,
			bill_co_addr2_META_0,
			bill_co_addr3_META_0,
			bill_co_addr4_META_0,
			bill_co_dpt_META_0,
			bill_co_tel_META_0,
			bill_co_cntry_cd_META_0,
			bill_rcpt_co_cd_META_0,
			bill_rcpt_co_nm_META_0,
			bill_bcst_nm_META_0,
			bill_rcpt_co_ein_META_0,
			bill_rcpt_co_biz_co_no_META_0,
			bill_rcpt_co_zip_cd_META_0,
			bill_rcpt_co_addr1_META_0,
			bill_rcpt_co_addr2_META_0,
			bill_rcpt_co_addr3_META_0,
			bill_rcpt_co_addr4_META_0,
			bill_bcst_dpt_META_0,
			bill_tel_META_0,
			bill_rcpt_co_cntry_cd_META_0,
			trd_cur_cd_META_0,
			bill_xrate_META_0,
			last_bill_amt_META_0,
			rcv_amt_META_0,
			sw_amt_META_0,
			setoff_amt_META_0,
			bfw_amt_META_0,
			sls_amt_META_0,
			dscnt_amt_META_0,
			ret_amt_META_0,
			tax_amt_META_0,
			sw_to_amt_META_0,
			bill_amt_META_0,
			tax_rate1_META_0,
			tax_rate_sls_amt1_META_0,
			tax_rate_tax_amt1_META_0,
			tax_rate_base_tax_amt1_META_0,
			tax_rate2_META_0,
			tax_rate_sls_amt2_META_0,
			tax_rate_tax_amt2_META_0,
			tax_rate_base_tax_amt2_META_0,
			tax_rate3_META_0,
			tax_rate_sls_amt3_META_0,
			tax_rate_tax_amt3_META_0,
			tax_rate_base_tax_amt3_META_0,
			tax_rate4_META_0,
			tax_rate_sls_amt4_META_0,
			tax_rate_tax_amt4_META_0,
			tax_rate_base_tax_amt4_META_0,
			tax_rate5_META_0,
			tax_rate_sls_amt5_META_0,
			tax_rate_tax_amt5_META_0,
			tax_rate_base_tax_amt5_META_0,
			tax_rate6_META_0,
			tax_rate_sls_amt6_META_0,
			tax_rate_tax_amt6_META_0,
			tax_rate_base_tax_amt6_META_0,
			tax_rate7_META_0,
			tax_rate_sls_amt7_META_0,
			tax_rate_tax_amt7_META_0,
			tax_rate_base_tax_amt7_META_0,
			tax_rate8_META_0,
			tax_rate_sls_amt8_META_0,
			tax_rate_tax_amt8_META_0,
			tax_rate_base_tax_amt8_META_0,
			tax_rate9_META_0,
			tax_rate_sls_amt9_META_0,
			tax_rate_tax_amt9_META_0,
			tax_rate_base_tax_amt9_META_0,
			tax_rate10_META_0,
			tax_rate_sls_amt10_META_0,
			tax_rate_tax_amt10_META_0,
			tax_rate_base_tax_amt10_META_0,
			adv_amt_bal_META_0,
			adv_amt_META_0,
			adv_setoff_amt_META_0,
			adv_setoff_tax_amt_META_0,
			rcv_schd_dt1_META_0,
			rcv_schd_amt1_META_0,
			rcv_mtd_cd1_META_0,
			rcv_mtd_nm1_META_0,
			rcv_schd_dt2_META_0,
			rcv_schd_amt2_META_0,
			rcv_mtd_cd2_META_0,
			rcv_mtd_nm2_META_0,
			rcv_schd_dt3_META_0,
			rcv_schd_amt3_META_0,
			rcv_mtd_cd3_META_0,
			rcv_mtd_nm3_META_0,
			rcv_schd_dt4_META_0,
			rcv_schd_amt4_META_0,
			rcv_mtd_cd4_META_0,
			rcv_mtd_nm4_META_0,
			rcv_schd_dt5_META_0,
			rcv_schd_amt5_META_0,
			rcv_mtd_cd5_META_0,
			rcv_mtd_nm5_META_0,
			rcv_schd_dt6_META_0,
			rcv_schd_amt6_META_0,
			rcv_mtd_cd6_META_0,
			rcv_mtd_nm6_META_0,
			rcv_schd_dt7_META_0,
			rcv_schd_amt7_META_0,
			rcv_mtd_cd7_META_0,
			rcv_mtd_nm7_META_0,
			rcv_schd_dt8_META_0,
			rcv_schd_amt8_META_0,
			rcv_mtd_cd8_META_0,
			rcv_mtd_nm8_META_0,
			rcv_schd_dt9_META_0,
			rcv_schd_amt9_META_0,
			rcv_mtd_cd9_META_0,
			rcv_mtd_nm9_META_0,
			rcv_schd_dt10_META_0,
			rcv_schd_amt10_META_0,
			rcv_mtd_cd10_META_0,
			rcv_mtd_nm10_META_0,
			bank_ac_cd_META_0,
			bank_ac_typ_META_0,
			bank_ac_no_META_0,
			bank_ac_holder_META_0,
			bank_ac_holder_sub_META_0,
			bank_cd_META_0,
			bank_nm_META_0,
			branch_cd_META_0,
			branch_nm_META_0,
			trd_cd_META_0,
			trd_nm_META_0,
			trd_ptn_typ_META_0,
			slip_sts_typ_META_0,
			dlv_slip_no_META_0,
			dlv_slip_d_no_META_0,
			ship_dlv_slip_no_META_0,
			ship_dlv_slip_d_no_META_0,
			act_no_META_0,
			act_rev_META_0,
			act_d_no_META_0,
			cst_po_no_META_0,
			cst_po_d_no_META_0,
			ac_dt_META_0,
			dlv_dt_META_0,
			rcv_dt_META_0,
			bill_basis_dt_META_0,
			base_ac_dt_META_0,
			itm_cd_META_0,
			itm_sub1_META_0,
			itm_sub2_META_0,
			itm_sub3_META_0,
			itm_nm_META_0,
			itm_alt_nm1_META_0,
			itm_alt_nm2_META_0,
			itm_alt_nm3_META_0,
			itm_alt_nm4_META_0,
			sno1_META_0,
			sno2_META_0,
			sno3_META_0,
			sno4_META_0,
			trd_unit_cd_META_0,
			trd_unit_nm_META_0,
			trd_unit_qty_META_0,
			interim_flg_META_0,
			trd_cur_upri_META_0,
			trd_cur_amt_META_0,
			trd_cur_dscnt_amt_META_0,
			tax_cd_META_0,
			tax_nm_META_0,
			tax_rate_META_0,
			inc_tax_flg_META_0,
			trd_cur_tax_amt_META_0,
			trd_d_rmrks_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0,
			sub_char4_META_0,
			sub_char5_META_0,
			sub_char6_META_0,
			sub_char7_META_0,
			sub_char8_META_0,
			sub_char9_META_0,
			sub_char10_META_0,
			sub_char11_META_0,
			sub_char12_META_0,
			sub_char13_META_0,
			sub_char14_META_0,
			sub_char15_META_0,
			sub_char16_META_0,
			sub_char17_META_0,
			sub_char18_META_0,
			sub_char19_META_0,
			sub_char20_META_0,
			sub_char21_META_0,
			sub_char22_META_0,
			sub_char23_META_0,
			sub_char24_META_0,
			sub_char25_META_0,
			sub_char26_META_0,
			sub_char27_META_0,
			sub_char28_META_0,
			sub_char29_META_0,
			sub_char30_META_0,
			sub_num1_META_0,
			sub_num2_META_0,
			sub_num3_META_0,
			sub_num4_META_0,
			sub_num5_META_0,
			sub_dt1_META_0,
			sub_dt2_META_0,
			sub_dt3_META_0,
			sub_dt4_META_0,
			sub_dt5_META_0,
			upri_unit_cd_META_0,
			bill_paid_amt_META_0,
			bill_due_amt_META_0,
			ttl_bill_amt_META_0,
			sum_bill_amt_inc_tax_META_0,
			sum_bill_amt_META_0,
			tax_rate_ctg_per0_META_0,
			tax_rate_sls_amt_per0_META_0,
			tax_rate_tax_amt_per0_META_0,
			tax_rate_ctg_per8_META_0,
			tax_rate_sls_amt_per8_META_0,
			tax_rate_tax_amt_per8_META_0,
			tax_rate_ctg_per10_META_0,
			tax_rate_sls_amt_per10_META_0,
			tax_rate_tax_amt_per10_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSLAR_IABillPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

