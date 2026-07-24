package mcframe.serverMSLA.MSLAL5220;

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
 * ブロック"BillRecvIf_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BillRecvIf_Chk01_DtlR_MC_A extends MCConstRow {

	public static final String $bill = "bill";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public static final String $dtl_peg_no = "dtl_peg_no";

	public static final String $data_lno = $bill + ".data_lno";
	public static final String $data_no = $bill + ".data_no";
	public static final String $ext_data_no = $bill + ".ext_data_no";
	public static final String $ext_data_lno = $bill + ".ext_data_lno";
	public static final String $data_crud_typ = $bill + ".data_crud_typ";
	public static final String $exe_sts_typ = $bill + ".exe_sts_typ";
	public static final String $bill_cl_dt = $bill + ".bill_cl_dt";
	public static final String $bill_dt = $bill + ".bill_dt";
	public static final String $bill_no = $bill + ".bill_no";
	public static final String $bill_d_no = $bill + ".bill_d_no";
	public static final String $pre_bill_no = $bill + ".pre_bill_no";
	public static final String $pre_bill_dt = $bill + ".pre_bill_dt";
	public static final String $bill_st_dt = $bill + ".bill_st_dt";
	public static final String $bill_end_dt = $bill + ".bill_end_dt";
	public static final String $iv_no = $bill + ".iv_no";
	public static final String $wrk_no = $bill + ".wrk_no";
	public static final String $wrk_nm = $bill + ".wrk_nm";
	public static final String $bill_src_cd = $bill + ".bill_src_cd";
	public static final String $bill_src_ein = $bill + ".bill_src_ein";
	public static final String $bill_src_biz_co_no = $bill + ".bill_src_biz_co_no";
	public static final String $bill_src_zip_cd = $bill + ".bill_src_zip_cd";
	public static final String $bill_src_addr1 = $bill + ".bill_src_addr1";
	public static final String $bill_src_addr2 = $bill + ".bill_src_addr2";
	public static final String $bill_src_addr3 = $bill + ".bill_src_addr3";
	public static final String $bill_src_addr4 = $bill + ".bill_src_addr4";
	public static final String $bill_src_dpt = $bill + ".bill_src_dpt";
	public static final String $bill_src_tel = $bill + ".bill_src_tel";
	public static final String $trd_cur_cd = $bill + ".trd_cur_cd";
	public static final String $bill_xrate = $bill + ".bill_xrate";
	public static final String $last_bill_amt = $bill + ".last_bill_amt";
	public static final String $rcv_amt = $bill + ".rcv_amt";
	public static final String $sw_amt = $bill + ".sw_amt";
	public static final String $setoff_amt = $bill + ".setoff_amt";
	public static final String $bfw_amt = $bill + ".bfw_amt";
	public static final String $sls_amt = $bill + ".sls_amt";
	public static final String $dscnt_amt = $bill + ".dscnt_amt";
	public static final String $ret_amt = $bill + ".ret_amt";
	public static final String $tax_amt = $bill + ".tax_amt";
	public static final String $sw_to_amt = $bill + ".sw_to_amt";
	public static final String $bill_amt = $bill + ".bill_amt";
	public static final String $tax_rate1 = $bill + ".tax_rate1";
	public static final String $tax_rate_sls_amt1 = $bill + ".tax_rate_sls_amt1";
	public static final String $tax_rate_tax_amt1 = $bill + ".tax_rate_tax_amt1";
	public static final String $tax_rate_base_tax_amt1 = $bill + ".tax_rate_base_tax_amt1";
	public static final String $tax_rate2 = $bill + ".tax_rate2";
	public static final String $tax_rate_sls_amt2 = $bill + ".tax_rate_sls_amt2";
	public static final String $tax_rate_tax_amt2 = $bill + ".tax_rate_tax_amt2";
	public static final String $tax_rate_base_tax_amt2 = $bill + ".tax_rate_base_tax_amt2";
	public static final String $tax_rate3 = $bill + ".tax_rate3";
	public static final String $tax_rate_sls_amt3 = $bill + ".tax_rate_sls_amt3";
	public static final String $tax_rate_tax_amt3 = $bill + ".tax_rate_tax_amt3";
	public static final String $tax_rate_base_tax_amt3 = $bill + ".tax_rate_base_tax_amt3";
	public static final String $tax_rate4 = $bill + ".tax_rate4";
	public static final String $tax_rate_sls_amt4 = $bill + ".tax_rate_sls_amt4";
	public static final String $tax_rate_tax_amt4 = $bill + ".tax_rate_tax_amt4";
	public static final String $tax_rate_base_tax_amt4 = $bill + ".tax_rate_base_tax_amt4";
	public static final String $tax_rate5 = $bill + ".tax_rate5";
	public static final String $tax_rate_sls_amt5 = $bill + ".tax_rate_sls_amt5";
	public static final String $tax_rate_tax_amt5 = $bill + ".tax_rate_tax_amt5";
	public static final String $tax_rate_base_tax_amt5 = $bill + ".tax_rate_base_tax_amt5";
	public static final String $tax_rate6 = $bill + ".tax_rate6";
	public static final String $tax_rate_sls_amt6 = $bill + ".tax_rate_sls_amt6";
	public static final String $tax_rate_tax_amt6 = $bill + ".tax_rate_tax_amt6";
	public static final String $tax_rate_base_tax_amt6 = $bill + ".tax_rate_base_tax_amt6";
	public static final String $tax_rate7 = $bill + ".tax_rate7";
	public static final String $tax_rate_sls_amt7 = $bill + ".tax_rate_sls_amt7";
	public static final String $tax_rate_tax_amt7 = $bill + ".tax_rate_tax_amt7";
	public static final String $tax_rate_base_tax_amt7 = $bill + ".tax_rate_base_tax_amt7";
	public static final String $tax_rate8 = $bill + ".tax_rate8";
	public static final String $tax_rate_sls_amt8 = $bill + ".tax_rate_sls_amt8";
	public static final String $tax_rate_tax_amt8 = $bill + ".tax_rate_tax_amt8";
	public static final String $tax_rate_base_tax_amt8 = $bill + ".tax_rate_base_tax_amt8";
	public static final String $tax_rate9 = $bill + ".tax_rate9";
	public static final String $tax_rate_sls_amt9 = $bill + ".tax_rate_sls_amt9";
	public static final String $tax_rate_tax_amt9 = $bill + ".tax_rate_tax_amt9";
	public static final String $tax_rate_base_tax_amt9 = $bill + ".tax_rate_base_tax_amt9";
	public static final String $tax_rate10 = $bill + ".tax_rate10";
	public static final String $tax_rate_sls_amt10 = $bill + ".tax_rate_sls_amt10";
	public static final String $tax_rate_tax_amt10 = $bill + ".tax_rate_tax_amt10";
	public static final String $tax_rate_base_tax_amt10 = $bill + ".tax_rate_base_tax_amt10";
	public static final String $adv_amt_bal = $bill + ".adv_amt_bal";
	public static final String $adv_amt = $bill + ".adv_amt";
	public static final String $adv_setoff_amt = $bill + ".adv_setoff_amt";
	public static final String $adv_setoff_tax_amt = $bill + ".adv_setoff_tax_amt";
	public static final String $pay_schd_dt1 = $bill + ".pay_schd_dt1";
	public static final String $pay_schd_amt1 = $bill + ".pay_schd_amt1";
	public static final String $pay_mtd_cd1 = $bill + ".pay_mtd_cd1";
	public static final String $pay_schd_dt2 = $bill + ".pay_schd_dt2";
	public static final String $pay_schd_amt2 = $bill + ".pay_schd_amt2";
	public static final String $pay_mtd_cd2 = $bill + ".pay_mtd_cd2";
	public static final String $pay_schd_dt3 = $bill + ".pay_schd_dt3";
	public static final String $pay_schd_amt3 = $bill + ".pay_schd_amt3";
	public static final String $pay_mtd_cd3 = $bill + ".pay_mtd_cd3";
	public static final String $pay_schd_dt4 = $bill + ".pay_schd_dt4";
	public static final String $pay_schd_amt4 = $bill + ".pay_schd_amt4";
	public static final String $pay_mtd_cd4 = $bill + ".pay_mtd_cd4";
	public static final String $pay_schd_dt5 = $bill + ".pay_schd_dt5";
	public static final String $pay_schd_amt5 = $bill + ".pay_schd_amt5";
	public static final String $pay_mtd_cd5 = $bill + ".pay_mtd_cd5";
	public static final String $pay_schd_dt6 = $bill + ".pay_schd_dt6";
	public static final String $pay_schd_amt6 = $bill + ".pay_schd_amt6";
	public static final String $pay_mtd_cd6 = $bill + ".pay_mtd_cd6";
	public static final String $pay_schd_dt7 = $bill + ".pay_schd_dt7";
	public static final String $pay_schd_amt7 = $bill + ".pay_schd_amt7";
	public static final String $pay_mtd_cd7 = $bill + ".pay_mtd_cd7";
	public static final String $pay_schd_dt8 = $bill + ".pay_schd_dt8";
	public static final String $pay_schd_amt8 = $bill + ".pay_schd_amt8";
	public static final String $pay_mtd_cd8 = $bill + ".pay_mtd_cd8";
	public static final String $pay_schd_dt9 = $bill + ".pay_schd_dt9";
	public static final String $pay_schd_amt9 = $bill + ".pay_schd_amt9";
	public static final String $pay_mtd_cd9 = $bill + ".pay_mtd_cd9";
	public static final String $pay_schd_dt10 = $bill + ".pay_schd_dt10";
	public static final String $pay_schd_amt10 = $bill + ".pay_schd_amt10";
	public static final String $pay_mtd_cd10 = $bill + ".pay_mtd_cd10";
	public static final String $bank_ac_cd = $bill + ".bank_ac_cd";
	public static final String $bank_ac_typ = $bill + ".bank_ac_typ";
	public static final String $bank_ac_no = $bill + ".bank_ac_no";
	public static final String $bank_ac_holder = $bill + ".bank_ac_holder";
	public static final String $bank_ac_holder_sub = $bill + ".bank_ac_holder_sub";
	public static final String $bank_cd = $bill + ".bank_cd";
	public static final String $bank_nm = $bill + ".bank_nm";
	public static final String $branch_cd = $bill + ".branch_cd";
	public static final String $branch_nm = $bill + ".branch_nm";
	public static final String $trd_cd = $bill + ".trd_cd";
	public static final String $trd_ptn_typ = $bill + ".trd_ptn_typ";
	public static final String $slip_sts_typ = $bill + ".slip_sts_typ";
	public static final String $dlv_slip_no = $bill + ".dlv_slip_no";
	public static final String $dlv_slip_d_no = $bill + ".dlv_slip_d_no";
	public static final String $ship_dlv_slip_no = $bill + ".ship_dlv_slip_no";
	public static final String $ship_dlv_slip_d_no = $bill + ".ship_dlv_slip_d_no";
	public static final String $act_no = $bill + ".act_no";
	public static final String $act_rev = $bill + ".act_rev";
	public static final String $act_d_no = $bill + ".act_d_no";
	public static final String $po_no = $bill + ".po_no";
	public static final String $po_d_no = $bill + ".po_d_no";
	public static final String $ac_dt = $bill + ".ac_dt";
	public static final String $dlv_dt = $bill + ".dlv_dt";
	public static final String $rcv_dt = $bill + ".rcv_dt";
	public static final String $bill_basis_dt = $bill + ".bill_basis_dt";
	public static final String $base_ac_dt = $bill + ".base_ac_dt";
	public static final String $itm_cd = $bill + ".itm_cd";
	public static final String $itm_sub1 = $bill + ".itm_sub1";
	public static final String $itm_sub2 = $bill + ".itm_sub2";
	public static final String $itm_sub3 = $bill + ".itm_sub3";
	public static final String $itm_alt_nm1 = $bill + ".itm_alt_nm1";
	public static final String $itm_alt_nm2 = $bill + ".itm_alt_nm2";
	public static final String $itm_alt_nm3 = $bill + ".itm_alt_nm3";
	public static final String $itm_alt_nm4 = $bill + ".itm_alt_nm4";
	public static final String $sno1 = $bill + ".sno1";
	public static final String $sno2 = $bill + ".sno2";
	public static final String $sno3 = $bill + ".sno3";
	public static final String $sno4 = $bill + ".sno4";
	public static final String $trd_unit_cd = $bill + ".trd_unit_cd";
	public static final String $trd_unit_qty = $bill + ".trd_unit_qty";
	public static final String $interim_flg = $bill + ".interim_flg";
	public static final String $trd_cur_upri = $bill + ".trd_cur_upri";
	public static final String $trd_cur_amt = $bill + ".trd_cur_amt";
	public static final String $trd_cur_dscnt_amt = $bill + ".trd_cur_dscnt_amt";
	public static final String $tax_cd = $bill + ".tax_cd";
	public static final String $tax_rate = $bill + ".tax_rate";
	public static final String $inc_tax_flg = $bill + ".inc_tax_flg";
	public static final String $trd_cur_tax_amt = $bill + ".trd_cur_tax_amt";
	public static final String $trd_d_rmrks = $bill + ".trd_d_rmrks";
	public static final String $bill_bcst_nm = $bill + ".bill_bcst_nm";
	public static final String $bill_ein = $bill + ".bill_ein";
	public static final String $bill_biz_co_no = $bill + ".bill_biz_co_no";
	public static final String $bill_zip_cd = $bill + ".bill_zip_cd";
	public static final String $bill_addr1 = $bill + ".bill_addr1";
	public static final String $bill_addr2 = $bill + ".bill_addr2";
	public static final String $bill_addr3 = $bill + ".bill_addr3";
	public static final String $bill_addr4 = $bill + ".bill_addr4";
	public static final String $bill_bcst_dpt = $bill + ".bill_bcst_dpt";
	public static final String $bill_tel = $bill + ".bill_tel";
	public static final String $sub_char1 = $bill + ".sub_char1";
	public static final String $sub_char2 = $bill + ".sub_char2";
	public static final String $sub_char3 = $bill + ".sub_char3";
	public static final String $sub_char4 = $bill + ".sub_char4";
	public static final String $sub_char5 = $bill + ".sub_char5";
	public static final String $sub_char6 = $bill + ".sub_char6";
	public static final String $sub_char7 = $bill + ".sub_char7";
	public static final String $sub_char8 = $bill + ".sub_char8";
	public static final String $sub_char9 = $bill + ".sub_char9";
	public static final String $sub_char10 = $bill + ".sub_char10";
	public static final String $sub_char11 = $bill + ".sub_char11";
	public static final String $sub_char12 = $bill + ".sub_char12";
	public static final String $sub_char13 = $bill + ".sub_char13";
	public static final String $sub_char14 = $bill + ".sub_char14";
	public static final String $sub_char15 = $bill + ".sub_char15";
	public static final String $sub_char16 = $bill + ".sub_char16";
	public static final String $sub_char17 = $bill + ".sub_char17";
	public static final String $sub_char18 = $bill + ".sub_char18";
	public static final String $sub_char19 = $bill + ".sub_char19";
	public static final String $sub_char20 = $bill + ".sub_char20";
	public static final String $sub_char21 = $bill + ".sub_char21";
	public static final String $sub_char22 = $bill + ".sub_char22";
	public static final String $sub_char23 = $bill + ".sub_char23";
	public static final String $sub_char24 = $bill + ".sub_char24";
	public static final String $sub_char25 = $bill + ".sub_char25";
	public static final String $sub_char26 = $bill + ".sub_char26";
	public static final String $sub_char27 = $bill + ".sub_char27";
	public static final String $sub_char28 = $bill + ".sub_char28";
	public static final String $sub_char29 = $bill + ".sub_char29";
	public static final String $sub_char30 = $bill + ".sub_char30";
	public static final String $sub_num1 = $bill + ".sub_num1";
	public static final String $sub_num2 = $bill + ".sub_num2";
	public static final String $sub_num3 = $bill + ".sub_num3";
	public static final String $sub_num4 = $bill + ".sub_num4";
	public static final String $sub_num5 = $bill + ".sub_num5";
	public static final String $sub_dt1 = $bill + ".sub_dt1";
	public static final String $sub_dt2 = $bill + ".sub_dt2";
	public static final String $sub_dt3 = $bill + ".sub_dt3";
	public static final String $sub_dt4 = $bill + ".sub_dt4";
	public static final String $sub_dt5 = $bill + ".sub_dt5";
	public static final String $log_sub_key1 = $bill + ".log_sub_key1";
	public static final String $log_sub_key2 = $bill + ".log_sub_key2";

	public static final MCMeta bill_META = createInnerRowMeta($bill, mcframe.serverMS.dbc.MST_BILL_RECV_IF_R.class);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dtl_peg_no_META = createCommonMeta($dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<BillRecvIf_Chk01_DtlR> constMetas = new ConstMetaList<BillRecvIf_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_META,
			err_flg_META,
			peg_no_META,
			hdr_peg_no_META,
			dtl_peg_no_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"ext_data_no",
				"ext_data_lno",
				"data_crud_typ",
				"exe_sts_typ",
				"bill_cl_dt",
				"bill_dt",
				"bill_no",
				"bill_d_no",
				"pre_bill_no",
				"pre_bill_dt",
				"bill_st_dt",
				"bill_end_dt",
				"iv_no",
				"wrk_no",
				"wrk_nm",
				"bill_src_cd",
				"bill_src_ein",
				"bill_src_biz_co_no",
				"bill_src_zip_cd",
				"bill_src_addr1",
				"bill_src_addr2",
				"bill_src_addr3",
				"bill_src_addr4",
				"bill_src_dpt",
				"bill_src_tel",
				"trd_cur_cd",
				"bill_xrate",
				"last_bill_amt",
				"rcv_amt",
				"sw_amt",
				"setoff_amt",
				"bfw_amt",
				"sls_amt",
				"dscnt_amt",
				"ret_amt",
				"tax_amt",
				"sw_to_amt",
				"bill_amt",
				"tax_rate1",
				"tax_rate_sls_amt1",
				"tax_rate_tax_amt1",
				"tax_rate_base_tax_amt1",
				"tax_rate2",
				"tax_rate_sls_amt2",
				"tax_rate_tax_amt2",
				"tax_rate_base_tax_amt2",
				"tax_rate3",
				"tax_rate_sls_amt3",
				"tax_rate_tax_amt3",
				"tax_rate_base_tax_amt3",
				"tax_rate4",
				"tax_rate_sls_amt4",
				"tax_rate_tax_amt4",
				"tax_rate_base_tax_amt4",
				"tax_rate5",
				"tax_rate_sls_amt5",
				"tax_rate_tax_amt5",
				"tax_rate_base_tax_amt5",
				"tax_rate6",
				"tax_rate_sls_amt6",
				"tax_rate_tax_amt6",
				"tax_rate_base_tax_amt6",
				"tax_rate7",
				"tax_rate_sls_amt7",
				"tax_rate_tax_amt7",
				"tax_rate_base_tax_amt7",
				"tax_rate8",
				"tax_rate_sls_amt8",
				"tax_rate_tax_amt8",
				"tax_rate_base_tax_amt8",
				"tax_rate9",
				"tax_rate_sls_amt9",
				"tax_rate_tax_amt9",
				"tax_rate_base_tax_amt9",
				"tax_rate10",
				"tax_rate_sls_amt10",
				"tax_rate_tax_amt10",
				"tax_rate_base_tax_amt10",
				"adv_amt_bal",
				"adv_amt",
				"adv_setoff_amt",
				"adv_setoff_tax_amt",
				"pay_schd_dt1",
				"pay_schd_amt1",
				"pay_mtd_cd1",
				"pay_schd_dt2",
				"pay_schd_amt2",
				"pay_mtd_cd2",
				"pay_schd_dt3",
				"pay_schd_amt3",
				"pay_mtd_cd3",
				"pay_schd_dt4",
				"pay_schd_amt4",
				"pay_mtd_cd4",
				"pay_schd_dt5",
				"pay_schd_amt5",
				"pay_mtd_cd5",
				"pay_schd_dt6",
				"pay_schd_amt6",
				"pay_mtd_cd6",
				"pay_schd_dt7",
				"pay_schd_amt7",
				"pay_mtd_cd7",
				"pay_schd_dt8",
				"pay_schd_amt8",
				"pay_mtd_cd8",
				"pay_schd_dt9",
				"pay_schd_amt9",
				"pay_mtd_cd9",
				"pay_schd_dt10",
				"pay_schd_amt10",
				"pay_mtd_cd10",
				"bank_ac_cd",
				"bank_ac_typ",
				"bank_ac_no",
				"bank_ac_holder",
				"bank_ac_holder_sub",
				"bank_cd",
				"bank_nm",
				"branch_cd",
				"branch_nm",
				"trd_cd",
				"trd_ptn_typ",
				"slip_sts_typ",
				"dlv_slip_no",
				"dlv_slip_d_no",
				"ship_dlv_slip_no",
				"ship_dlv_slip_d_no",
				"act_no",
				"act_rev",
				"act_d_no",
				"po_no",
				"po_d_no",
				"ac_dt",
				"dlv_dt",
				"rcv_dt",
				"bill_basis_dt",
				"base_ac_dt",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_alt_nm1",
				"itm_alt_nm2",
				"itm_alt_nm3",
				"itm_alt_nm4",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"trd_unit_cd",
				"trd_unit_qty",
				"interim_flg",
				"trd_cur_upri",
				"trd_cur_amt",
				"trd_cur_dscnt_amt",
				"tax_cd",
				"tax_rate",
				"inc_tax_flg",
				"trd_cur_tax_amt",
				"trd_d_rmrks",
				"bill_bcst_nm",
				"bill_ein",
				"bill_biz_co_no",
				"bill_zip_cd",
				"bill_addr1",
				"bill_addr2",
				"bill_addr3",
				"bill_addr4",
				"bill_bcst_dpt",
				"bill_tel",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"sub_char4",
				"sub_char5",
				"sub_char6",
				"sub_char7",
				"sub_char8",
				"sub_char9",
				"sub_char10",
				"sub_char11",
				"sub_char12",
				"sub_char13",
				"sub_char14",
				"sub_char15",
				"sub_char16",
				"sub_char17",
				"sub_char18",
				"sub_char19",
				"sub_char20",
				"sub_char21",
				"sub_char22",
				"sub_char23",
				"sub_char24",
				"sub_char25",
				"sub_char26",
				"sub_char27",
				"sub_char28",
				"sub_char29",
				"sub_char30",
				"sub_num1",
				"sub_num2",
				"sub_num3",
				"sub_num4",
				"sub_num5",
				"sub_dt1",
				"sub_dt2",
				"sub_dt3",
				"sub_dt4",
				"sub_dt5",
				"log_sub_key1",
				"log_sub_key2"
			},
			{
				$data_lno,
				$data_no,
				$ext_data_no,
				$ext_data_lno,
				$data_crud_typ,
				$exe_sts_typ,
				$bill_cl_dt,
				$bill_dt,
				$bill_no,
				$bill_d_no,
				$pre_bill_no,
				$pre_bill_dt,
				$bill_st_dt,
				$bill_end_dt,
				$iv_no,
				$wrk_no,
				$wrk_nm,
				$bill_src_cd,
				$bill_src_ein,
				$bill_src_biz_co_no,
				$bill_src_zip_cd,
				$bill_src_addr1,
				$bill_src_addr2,
				$bill_src_addr3,
				$bill_src_addr4,
				$bill_src_dpt,
				$bill_src_tel,
				$trd_cur_cd,
				$bill_xrate,
				$last_bill_amt,
				$rcv_amt,
				$sw_amt,
				$setoff_amt,
				$bfw_amt,
				$sls_amt,
				$dscnt_amt,
				$ret_amt,
				$tax_amt,
				$sw_to_amt,
				$bill_amt,
				$tax_rate1,
				$tax_rate_sls_amt1,
				$tax_rate_tax_amt1,
				$tax_rate_base_tax_amt1,
				$tax_rate2,
				$tax_rate_sls_amt2,
				$tax_rate_tax_amt2,
				$tax_rate_base_tax_amt2,
				$tax_rate3,
				$tax_rate_sls_amt3,
				$tax_rate_tax_amt3,
				$tax_rate_base_tax_amt3,
				$tax_rate4,
				$tax_rate_sls_amt4,
				$tax_rate_tax_amt4,
				$tax_rate_base_tax_amt4,
				$tax_rate5,
				$tax_rate_sls_amt5,
				$tax_rate_tax_amt5,
				$tax_rate_base_tax_amt5,
				$tax_rate6,
				$tax_rate_sls_amt6,
				$tax_rate_tax_amt6,
				$tax_rate_base_tax_amt6,
				$tax_rate7,
				$tax_rate_sls_amt7,
				$tax_rate_tax_amt7,
				$tax_rate_base_tax_amt7,
				$tax_rate8,
				$tax_rate_sls_amt8,
				$tax_rate_tax_amt8,
				$tax_rate_base_tax_amt8,
				$tax_rate9,
				$tax_rate_sls_amt9,
				$tax_rate_tax_amt9,
				$tax_rate_base_tax_amt9,
				$tax_rate10,
				$tax_rate_sls_amt10,
				$tax_rate_tax_amt10,
				$tax_rate_base_tax_amt10,
				$adv_amt_bal,
				$adv_amt,
				$adv_setoff_amt,
				$adv_setoff_tax_amt,
				$pay_schd_dt1,
				$pay_schd_amt1,
				$pay_mtd_cd1,
				$pay_schd_dt2,
				$pay_schd_amt2,
				$pay_mtd_cd2,
				$pay_schd_dt3,
				$pay_schd_amt3,
				$pay_mtd_cd3,
				$pay_schd_dt4,
				$pay_schd_amt4,
				$pay_mtd_cd4,
				$pay_schd_dt5,
				$pay_schd_amt5,
				$pay_mtd_cd5,
				$pay_schd_dt6,
				$pay_schd_amt6,
				$pay_mtd_cd6,
				$pay_schd_dt7,
				$pay_schd_amt7,
				$pay_mtd_cd7,
				$pay_schd_dt8,
				$pay_schd_amt8,
				$pay_mtd_cd8,
				$pay_schd_dt9,
				$pay_schd_amt9,
				$pay_mtd_cd9,
				$pay_schd_dt10,
				$pay_schd_amt10,
				$pay_mtd_cd10,
				$bank_ac_cd,
				$bank_ac_typ,
				$bank_ac_no,
				$bank_ac_holder,
				$bank_ac_holder_sub,
				$bank_cd,
				$bank_nm,
				$branch_cd,
				$branch_nm,
				$trd_cd,
				$trd_ptn_typ,
				$slip_sts_typ,
				$dlv_slip_no,
				$dlv_slip_d_no,
				$ship_dlv_slip_no,
				$ship_dlv_slip_d_no,
				$act_no,
				$act_rev,
				$act_d_no,
				$po_no,
				$po_d_no,
				$ac_dt,
				$dlv_dt,
				$rcv_dt,
				$bill_basis_dt,
				$base_ac_dt,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_alt_nm1,
				$itm_alt_nm2,
				$itm_alt_nm3,
				$itm_alt_nm4,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$trd_unit_cd,
				$trd_unit_qty,
				$interim_flg,
				$trd_cur_upri,
				$trd_cur_amt,
				$trd_cur_dscnt_amt,
				$tax_cd,
				$tax_rate,
				$inc_tax_flg,
				$trd_cur_tax_amt,
				$trd_d_rmrks,
				$bill_bcst_nm,
				$bill_ein,
				$bill_biz_co_no,
				$bill_zip_cd,
				$bill_addr1,
				$bill_addr2,
				$bill_addr3,
				$bill_addr4,
				$bill_bcst_dpt,
				$bill_tel,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$sub_char4,
				$sub_char5,
				$sub_char6,
				$sub_char7,
				$sub_char8,
				$sub_char9,
				$sub_char10,
				$sub_char11,
				$sub_char12,
				$sub_char13,
				$sub_char14,
				$sub_char15,
				$sub_char16,
				$sub_char17,
				$sub_char18,
				$sub_char19,
				$sub_char20,
				$sub_char21,
				$sub_char22,
				$sub_char23,
				$sub_char24,
				$sub_char25,
				$sub_char26,
				$sub_char27,
				$sub_char28,
				$sub_char29,
				$sub_char30,
				$sub_num1,
				$sub_num2,
				$sub_num3,
				$sub_num4,
				$sub_num5,
				$sub_dt1,
				$sub_dt2,
				$sub_dt3,
				$sub_dt4,
				$sub_dt5,
				$log_sub_key1,
				$log_sub_key2
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$bill + ".data_lno", "E"},	// bill.data_lno
				{$bill + ".data_no", "E"},	// bill.data_no
				{$bill + ".ext_data_no", "E"},	// bill.ext_data_no
				{$bill + ".ext_data_lno", "E"},	// bill.ext_data_lno
				{$bill + ".data_crud_typ", "E"}	// bill.data_crud_typ
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$bill + ".bill_st_dt", "bill_dt:BF"},	// bill.bill_st_dt
				{$bill + ".bill_end_dt", "bill_dt:AF"}	// bill.bill_end_dt
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$bill + ".data_crud_typ", "MAC_DATA_CRUD_TYP"},	// bill.data_crud_typ
				{$bill + ".exe_sts_typ", "MAC_EXE_STS_TYP"},	// bill.exe_sts_typ
				{$bill + ".slip_sts_typ", "MAC_SLIP_STS_TYP"}	// bill.slip_sts_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected BillRecvIf_Chk01_DtlR_MC_A(ConstMetaList<? extends BillRecvIf_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillRecvIf_Chk01_DtlR clone() {
		return (BillRecvIf_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillRecvIf_Chk01_DtlR createInstance() {
		return (BillRecvIf_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillRecvIf_Chk01_DtlR getValues(String... names) {
		return (BillRecvIf_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_BILL_RECV_IF_R bill(){
		return (mcframe.serverMS.dbc.MST_BILL_RECV_IF_R) getConstInnerRow(offset + 0, $bill);
	}
	
	public void bill(mcframe.serverMS.dbc.MST_BILL_RECV_IF_R row){
		setConstInnerRow(offset + 0, $bill, row);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 2, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 2, $peg_no, value);
	}


	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 3, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 3, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 3, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 3, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 3, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 3, $hdr_peg_no, value);
	}


	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public MCNumber dtl_peg_no() {
		return getConstNumber(offset + 4, $dtl_peg_no);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(MCNumber value) {
		setConstNumber(offset + 4, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(int value) {
		setConstNumber(offset + 4, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(long value) {
		setConstNumber(offset + 4, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(float value) {
		setConstNumber(offset + 4, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(double value) {
		setConstNumber(offset + 4, $dtl_peg_no, value);
	}


	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($bill.equalsIgnoreCase(name)) {
			return bill();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($bill.equalsIgnoreCase(name)) {
			bill(
				((MCContainerMeta) bill_META).castInnerRow(mcframe.serverMS.dbc.MST_BILL_RECV_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return bill().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		bill().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		bill().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		bill().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		bill().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		bill().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return bill().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		bill().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		bill().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		bill().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		bill().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		bill().data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return bill().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		bill().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		bill().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		bill().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		bill().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		bill().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return bill().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		bill().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		bill().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		bill().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		bill().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		bill().ext_data_lno(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return bill().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		bill().data_crud_typ(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return bill().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		bill().exe_sts_typ(value);
	}

	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public MCDate bill_cl_dt() {
		return bill().bill_cl_dt();
	}

	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public void bill_cl_dt(MCDate value) {
		bill().bill_cl_dt(value);
	}

	/**
	 * Billing date 請求日.<p>
	 *
	 */
	public MCDate bill_dt() {
		return bill().bill_dt();
	}

	/**
	 * Billing date 請求日.<p>
	 *
	 */
	public void bill_dt(MCDate value) {
		bill().bill_dt(value);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return bill().bill_no();
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		bill().bill_no(value);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return bill().bill_d_no();
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		bill().bill_d_no(value);
	}

	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public String pre_bill_no() {
		return bill().pre_bill_no();
	}

	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public void pre_bill_no(String value) {
		bill().pre_bill_no(value);
	}

	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public MCDate pre_bill_dt() {
		return bill().pre_bill_dt();
	}

	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public void pre_bill_dt(MCDate value) {
		bill().pre_bill_dt(value);
	}

	/**
	 * Billing period start date 請求期間開始日.<p>
	 *
	 */
	public MCDate bill_st_dt() {
		return bill().bill_st_dt();
	}

	/**
	 * Billing period start date 請求期間開始日.<p>
	 *
	 */
	public void bill_st_dt(MCDate value) {
		bill().bill_st_dt(value);
	}

	/**
	 * Billing period end date 請求期間終了日.<p>
	 *
	 */
	public MCDate bill_end_dt() {
		return bill().bill_end_dt();
	}

	/**
	 * Billing period end date 請求期間終了日.<p>
	 *
	 */
	public void bill_end_dt(MCDate value) {
		bill().bill_end_dt(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return bill().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		bill().iv_no(value);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return bill().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		bill().wrk_no(value);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return bill().wrk_nm();
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		bill().wrk_nm(value);
	}

	/**
	 * Billing source cd. 請求元ＣＤ.<p>
	 *
	 */
	public String bill_src_cd() {
		return bill().bill_src_cd();
	}

	/**
	 * Billing source cd. 請求元ＣＤ.<p>
	 *
	 */
	public void bill_src_cd(String value) {
		bill().bill_src_cd(value);
	}

	/**
	 * Billing source corporation No. 請求元法人番号.<p>
	 *
	 */
	public String bill_src_ein() {
		return bill().bill_src_ein();
	}

	/**
	 * Billing source corporation No. 請求元法人番号.<p>
	 *
	 */
	public void bill_src_ein(String value) {
		bill().bill_src_ein(value);
	}

	/**
	 * Billing source business No. 請求元事業者ＮＯ.<p>
	 *
	 */
	public String bill_src_biz_co_no() {
		return bill().bill_src_biz_co_no();
	}

	/**
	 * Billing source business No. 請求元事業者ＮＯ.<p>
	 *
	 */
	public void bill_src_biz_co_no(String value) {
		bill().bill_src_biz_co_no(value);
	}

	/**
	 * Billing source zip code 請求元郵便番号.<p>
	 *
	 */
	public String bill_src_zip_cd() {
		return bill().bill_src_zip_cd();
	}

	/**
	 * Billing source zip code 請求元郵便番号.<p>
	 *
	 */
	public void bill_src_zip_cd(String value) {
		bill().bill_src_zip_cd(value);
	}

	/**
	 * Billing source address 1 請求元住所１.<p>
	 *
	 */
	public String bill_src_addr1() {
		return bill().bill_src_addr1();
	}

	/**
	 * Billing source address 1 請求元住所１.<p>
	 *
	 */
	public void bill_src_addr1(String value) {
		bill().bill_src_addr1(value);
	}

	/**
	 * Billing source address 2 請求元住所２.<p>
	 *
	 */
	public String bill_src_addr2() {
		return bill().bill_src_addr2();
	}

	/**
	 * Billing source address 2 請求元住所２.<p>
	 *
	 */
	public void bill_src_addr2(String value) {
		bill().bill_src_addr2(value);
	}

	/**
	 * Billing source address 3 請求元住所３.<p>
	 *
	 */
	public String bill_src_addr3() {
		return bill().bill_src_addr3();
	}

	/**
	 * Billing source address 3 請求元住所３.<p>
	 *
	 */
	public void bill_src_addr3(String value) {
		bill().bill_src_addr3(value);
	}

	/**
	 * Billing source address 4 請求元住所４.<p>
	 *
	 */
	public String bill_src_addr4() {
		return bill().bill_src_addr4();
	}

	/**
	 * Billing source address 4 請求元住所４.<p>
	 *
	 */
	public void bill_src_addr4(String value) {
		bill().bill_src_addr4(value);
	}

	/**
	 * Billing source dept. 請求元部門.<p>
	 *
	 */
	public String bill_src_dpt() {
		return bill().bill_src_dpt();
	}

	/**
	 * Billing source dept. 請求元部門.<p>
	 *
	 */
	public void bill_src_dpt(String value) {
		bill().bill_src_dpt(value);
	}

	/**
	 * Billing source TEL 請求元ＴＥＬ.<p>
	 *
	 */
	public String bill_src_tel() {
		return bill().bill_src_tel();
	}

	/**
	 * Billing source TEL 請求元ＴＥＬ.<p>
	 *
	 */
	public void bill_src_tel(String value) {
		bill().bill_src_tel(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return bill().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		bill().trd_cur_cd(value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public MCNumber bill_xrate() {
		return bill().bill_xrate();
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(MCNumber value) {
		bill().bill_xrate(value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(int value) {
		bill().bill_xrate(value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(long value) {
		bill().bill_xrate(value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(float value) {
		bill().bill_xrate(value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(double value) {
		bill().bill_xrate(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public MCNumber last_bill_amt() {
		return bill().last_bill_amt();
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(MCNumber value) {
		bill().last_bill_amt(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(int value) {
		bill().last_bill_amt(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(long value) {
		bill().last_bill_amt(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(float value) {
		bill().last_bill_amt(value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(double value) {
		bill().last_bill_amt(value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return bill().rcv_amt();
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		bill().rcv_amt(value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		bill().rcv_amt(value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		bill().rcv_amt(value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		bill().rcv_amt(value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		bill().rcv_amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return bill().sw_amt();
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		bill().sw_amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		bill().sw_amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		bill().sw_amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		bill().sw_amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		bill().sw_amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return bill().setoff_amt();
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		bill().setoff_amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		bill().setoff_amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		bill().setoff_amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		bill().setoff_amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		bill().setoff_amt(value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return bill().bfw_amt();
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		bill().bfw_amt(value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		bill().bfw_amt(value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		bill().bfw_amt(value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		bill().bfw_amt(value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		bill().bfw_amt(value);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return bill().sls_amt();
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		bill().sls_amt(value);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(int value) {
		bill().sls_amt(value);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(long value) {
		bill().sls_amt(value);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(float value) {
		bill().sls_amt(value);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(double value) {
		bill().sls_amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return bill().dscnt_amt();
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		bill().dscnt_amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		bill().dscnt_amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		bill().dscnt_amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		bill().dscnt_amt(value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		bill().dscnt_amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return bill().ret_amt();
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		bill().ret_amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		bill().ret_amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		bill().ret_amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		bill().ret_amt(value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		bill().ret_amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return bill().tax_amt();
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		bill().tax_amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		bill().tax_amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		bill().tax_amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		bill().tax_amt(value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		bill().tax_amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return bill().sw_to_amt();
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		bill().sw_to_amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		bill().sw_to_amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		bill().sw_to_amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		bill().sw_to_amt(value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		bill().sw_to_amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public MCNumber bill_amt() {
		return bill().bill_amt();
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(MCNumber value) {
		bill().bill_amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(int value) {
		bill().bill_amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(long value) {
		bill().bill_amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(float value) {
		bill().bill_amt(value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(double value) {
		bill().bill_amt(value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public MCNumber tax_rate1() {
		return bill().tax_rate1();
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(MCNumber value) {
		bill().tax_rate1(value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(int value) {
		bill().tax_rate1(value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(long value) {
		bill().tax_rate1(value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(float value) {
		bill().tax_rate1(value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(double value) {
		bill().tax_rate1(value);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt1() {
		return bill().tax_rate_sls_amt1();
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(MCNumber value) {
		bill().tax_rate_sls_amt1(value);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(int value) {
		bill().tax_rate_sls_amt1(value);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(long value) {
		bill().tax_rate_sls_amt1(value);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(float value) {
		bill().tax_rate_sls_amt1(value);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(double value) {
		bill().tax_rate_sls_amt1(value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt1() {
		return bill().tax_rate_tax_amt1();
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(MCNumber value) {
		bill().tax_rate_tax_amt1(value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(int value) {
		bill().tax_rate_tax_amt1(value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(long value) {
		bill().tax_rate_tax_amt1(value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(float value) {
		bill().tax_rate_tax_amt1(value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(double value) {
		bill().tax_rate_tax_amt1(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt1() {
		return bill().tax_rate_base_tax_amt1();
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(MCNumber value) {
		bill().tax_rate_base_tax_amt1(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(int value) {
		bill().tax_rate_base_tax_amt1(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(long value) {
		bill().tax_rate_base_tax_amt1(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(float value) {
		bill().tax_rate_base_tax_amt1(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(double value) {
		bill().tax_rate_base_tax_amt1(value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public MCNumber tax_rate2() {
		return bill().tax_rate2();
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(MCNumber value) {
		bill().tax_rate2(value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(int value) {
		bill().tax_rate2(value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(long value) {
		bill().tax_rate2(value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(float value) {
		bill().tax_rate2(value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(double value) {
		bill().tax_rate2(value);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt2() {
		return bill().tax_rate_sls_amt2();
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(MCNumber value) {
		bill().tax_rate_sls_amt2(value);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(int value) {
		bill().tax_rate_sls_amt2(value);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(long value) {
		bill().tax_rate_sls_amt2(value);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(float value) {
		bill().tax_rate_sls_amt2(value);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(double value) {
		bill().tax_rate_sls_amt2(value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt2() {
		return bill().tax_rate_tax_amt2();
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(MCNumber value) {
		bill().tax_rate_tax_amt2(value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(int value) {
		bill().tax_rate_tax_amt2(value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(long value) {
		bill().tax_rate_tax_amt2(value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(float value) {
		bill().tax_rate_tax_amt2(value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(double value) {
		bill().tax_rate_tax_amt2(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt2() {
		return bill().tax_rate_base_tax_amt2();
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(MCNumber value) {
		bill().tax_rate_base_tax_amt2(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(int value) {
		bill().tax_rate_base_tax_amt2(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(long value) {
		bill().tax_rate_base_tax_amt2(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(float value) {
		bill().tax_rate_base_tax_amt2(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(double value) {
		bill().tax_rate_base_tax_amt2(value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public MCNumber tax_rate3() {
		return bill().tax_rate3();
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(MCNumber value) {
		bill().tax_rate3(value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(int value) {
		bill().tax_rate3(value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(long value) {
		bill().tax_rate3(value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(float value) {
		bill().tax_rate3(value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(double value) {
		bill().tax_rate3(value);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt3() {
		return bill().tax_rate_sls_amt3();
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(MCNumber value) {
		bill().tax_rate_sls_amt3(value);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(int value) {
		bill().tax_rate_sls_amt3(value);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(long value) {
		bill().tax_rate_sls_amt3(value);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(float value) {
		bill().tax_rate_sls_amt3(value);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(double value) {
		bill().tax_rate_sls_amt3(value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt3() {
		return bill().tax_rate_tax_amt3();
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(MCNumber value) {
		bill().tax_rate_tax_amt3(value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(int value) {
		bill().tax_rate_tax_amt3(value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(long value) {
		bill().tax_rate_tax_amt3(value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(float value) {
		bill().tax_rate_tax_amt3(value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(double value) {
		bill().tax_rate_tax_amt3(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt3() {
		return bill().tax_rate_base_tax_amt3();
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(MCNumber value) {
		bill().tax_rate_base_tax_amt3(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(int value) {
		bill().tax_rate_base_tax_amt3(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(long value) {
		bill().tax_rate_base_tax_amt3(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(float value) {
		bill().tax_rate_base_tax_amt3(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(double value) {
		bill().tax_rate_base_tax_amt3(value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public MCNumber tax_rate4() {
		return bill().tax_rate4();
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(MCNumber value) {
		bill().tax_rate4(value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(int value) {
		bill().tax_rate4(value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(long value) {
		bill().tax_rate4(value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(float value) {
		bill().tax_rate4(value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(double value) {
		bill().tax_rate4(value);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt4() {
		return bill().tax_rate_sls_amt4();
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(MCNumber value) {
		bill().tax_rate_sls_amt4(value);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(int value) {
		bill().tax_rate_sls_amt4(value);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(long value) {
		bill().tax_rate_sls_amt4(value);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(float value) {
		bill().tax_rate_sls_amt4(value);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(double value) {
		bill().tax_rate_sls_amt4(value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt4() {
		return bill().tax_rate_tax_amt4();
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(MCNumber value) {
		bill().tax_rate_tax_amt4(value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(int value) {
		bill().tax_rate_tax_amt4(value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(long value) {
		bill().tax_rate_tax_amt4(value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(float value) {
		bill().tax_rate_tax_amt4(value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(double value) {
		bill().tax_rate_tax_amt4(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt4() {
		return bill().tax_rate_base_tax_amt4();
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(MCNumber value) {
		bill().tax_rate_base_tax_amt4(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(int value) {
		bill().tax_rate_base_tax_amt4(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(long value) {
		bill().tax_rate_base_tax_amt4(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(float value) {
		bill().tax_rate_base_tax_amt4(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(double value) {
		bill().tax_rate_base_tax_amt4(value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public MCNumber tax_rate5() {
		return bill().tax_rate5();
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(MCNumber value) {
		bill().tax_rate5(value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(int value) {
		bill().tax_rate5(value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(long value) {
		bill().tax_rate5(value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(float value) {
		bill().tax_rate5(value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(double value) {
		bill().tax_rate5(value);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt5() {
		return bill().tax_rate_sls_amt5();
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(MCNumber value) {
		bill().tax_rate_sls_amt5(value);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(int value) {
		bill().tax_rate_sls_amt5(value);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(long value) {
		bill().tax_rate_sls_amt5(value);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(float value) {
		bill().tax_rate_sls_amt5(value);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(double value) {
		bill().tax_rate_sls_amt5(value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt5() {
		return bill().tax_rate_tax_amt5();
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(MCNumber value) {
		bill().tax_rate_tax_amt5(value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(int value) {
		bill().tax_rate_tax_amt5(value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(long value) {
		bill().tax_rate_tax_amt5(value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(float value) {
		bill().tax_rate_tax_amt5(value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(double value) {
		bill().tax_rate_tax_amt5(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt5() {
		return bill().tax_rate_base_tax_amt5();
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(MCNumber value) {
		bill().tax_rate_base_tax_amt5(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(int value) {
		bill().tax_rate_base_tax_amt5(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(long value) {
		bill().tax_rate_base_tax_amt5(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(float value) {
		bill().tax_rate_base_tax_amt5(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(double value) {
		bill().tax_rate_base_tax_amt5(value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public MCNumber tax_rate6() {
		return bill().tax_rate6();
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(MCNumber value) {
		bill().tax_rate6(value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(int value) {
		bill().tax_rate6(value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(long value) {
		bill().tax_rate6(value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(float value) {
		bill().tax_rate6(value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(double value) {
		bill().tax_rate6(value);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt6() {
		return bill().tax_rate_sls_amt6();
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(MCNumber value) {
		bill().tax_rate_sls_amt6(value);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(int value) {
		bill().tax_rate_sls_amt6(value);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(long value) {
		bill().tax_rate_sls_amt6(value);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(float value) {
		bill().tax_rate_sls_amt6(value);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(double value) {
		bill().tax_rate_sls_amt6(value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt6() {
		return bill().tax_rate_tax_amt6();
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(MCNumber value) {
		bill().tax_rate_tax_amt6(value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(int value) {
		bill().tax_rate_tax_amt6(value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(long value) {
		bill().tax_rate_tax_amt6(value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(float value) {
		bill().tax_rate_tax_amt6(value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(double value) {
		bill().tax_rate_tax_amt6(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt6() {
		return bill().tax_rate_base_tax_amt6();
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(MCNumber value) {
		bill().tax_rate_base_tax_amt6(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(int value) {
		bill().tax_rate_base_tax_amt6(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(long value) {
		bill().tax_rate_base_tax_amt6(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(float value) {
		bill().tax_rate_base_tax_amt6(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(double value) {
		bill().tax_rate_base_tax_amt6(value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public MCNumber tax_rate7() {
		return bill().tax_rate7();
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(MCNumber value) {
		bill().tax_rate7(value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(int value) {
		bill().tax_rate7(value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(long value) {
		bill().tax_rate7(value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(float value) {
		bill().tax_rate7(value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(double value) {
		bill().tax_rate7(value);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt7() {
		return bill().tax_rate_sls_amt7();
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(MCNumber value) {
		bill().tax_rate_sls_amt7(value);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(int value) {
		bill().tax_rate_sls_amt7(value);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(long value) {
		bill().tax_rate_sls_amt7(value);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(float value) {
		bill().tax_rate_sls_amt7(value);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(double value) {
		bill().tax_rate_sls_amt7(value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt7() {
		return bill().tax_rate_tax_amt7();
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(MCNumber value) {
		bill().tax_rate_tax_amt7(value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(int value) {
		bill().tax_rate_tax_amt7(value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(long value) {
		bill().tax_rate_tax_amt7(value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(float value) {
		bill().tax_rate_tax_amt7(value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(double value) {
		bill().tax_rate_tax_amt7(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt7() {
		return bill().tax_rate_base_tax_amt7();
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(MCNumber value) {
		bill().tax_rate_base_tax_amt7(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(int value) {
		bill().tax_rate_base_tax_amt7(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(long value) {
		bill().tax_rate_base_tax_amt7(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(float value) {
		bill().tax_rate_base_tax_amt7(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(double value) {
		bill().tax_rate_base_tax_amt7(value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public MCNumber tax_rate8() {
		return bill().tax_rate8();
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(MCNumber value) {
		bill().tax_rate8(value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(int value) {
		bill().tax_rate8(value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(long value) {
		bill().tax_rate8(value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(float value) {
		bill().tax_rate8(value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(double value) {
		bill().tax_rate8(value);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt8() {
		return bill().tax_rate_sls_amt8();
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(MCNumber value) {
		bill().tax_rate_sls_amt8(value);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(int value) {
		bill().tax_rate_sls_amt8(value);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(long value) {
		bill().tax_rate_sls_amt8(value);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(float value) {
		bill().tax_rate_sls_amt8(value);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(double value) {
		bill().tax_rate_sls_amt8(value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt8() {
		return bill().tax_rate_tax_amt8();
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(MCNumber value) {
		bill().tax_rate_tax_amt8(value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(int value) {
		bill().tax_rate_tax_amt8(value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(long value) {
		bill().tax_rate_tax_amt8(value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(float value) {
		bill().tax_rate_tax_amt8(value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(double value) {
		bill().tax_rate_tax_amt8(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt8() {
		return bill().tax_rate_base_tax_amt8();
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(MCNumber value) {
		bill().tax_rate_base_tax_amt8(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(int value) {
		bill().tax_rate_base_tax_amt8(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(long value) {
		bill().tax_rate_base_tax_amt8(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(float value) {
		bill().tax_rate_base_tax_amt8(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(double value) {
		bill().tax_rate_base_tax_amt8(value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public MCNumber tax_rate9() {
		return bill().tax_rate9();
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(MCNumber value) {
		bill().tax_rate9(value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(int value) {
		bill().tax_rate9(value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(long value) {
		bill().tax_rate9(value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(float value) {
		bill().tax_rate9(value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(double value) {
		bill().tax_rate9(value);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt9() {
		return bill().tax_rate_sls_amt9();
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(MCNumber value) {
		bill().tax_rate_sls_amt9(value);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(int value) {
		bill().tax_rate_sls_amt9(value);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(long value) {
		bill().tax_rate_sls_amt9(value);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(float value) {
		bill().tax_rate_sls_amt9(value);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(double value) {
		bill().tax_rate_sls_amt9(value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt9() {
		return bill().tax_rate_tax_amt9();
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(MCNumber value) {
		bill().tax_rate_tax_amt9(value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(int value) {
		bill().tax_rate_tax_amt9(value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(long value) {
		bill().tax_rate_tax_amt9(value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(float value) {
		bill().tax_rate_tax_amt9(value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(double value) {
		bill().tax_rate_tax_amt9(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt9() {
		return bill().tax_rate_base_tax_amt9();
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(MCNumber value) {
		bill().tax_rate_base_tax_amt9(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(int value) {
		bill().tax_rate_base_tax_amt9(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(long value) {
		bill().tax_rate_base_tax_amt9(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(float value) {
		bill().tax_rate_base_tax_amt9(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(double value) {
		bill().tax_rate_base_tax_amt9(value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public MCNumber tax_rate10() {
		return bill().tax_rate10();
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(MCNumber value) {
		bill().tax_rate10(value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(int value) {
		bill().tax_rate10(value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(long value) {
		bill().tax_rate10(value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(float value) {
		bill().tax_rate10(value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(double value) {
		bill().tax_rate10(value);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt10() {
		return bill().tax_rate_sls_amt10();
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(MCNumber value) {
		bill().tax_rate_sls_amt10(value);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(int value) {
		bill().tax_rate_sls_amt10(value);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(long value) {
		bill().tax_rate_sls_amt10(value);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(float value) {
		bill().tax_rate_sls_amt10(value);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(double value) {
		bill().tax_rate_sls_amt10(value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt10() {
		return bill().tax_rate_tax_amt10();
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(MCNumber value) {
		bill().tax_rate_tax_amt10(value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(int value) {
		bill().tax_rate_tax_amt10(value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(long value) {
		bill().tax_rate_tax_amt10(value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(float value) {
		bill().tax_rate_tax_amt10(value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(double value) {
		bill().tax_rate_tax_amt10(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt10() {
		return bill().tax_rate_base_tax_amt10();
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(MCNumber value) {
		bill().tax_rate_base_tax_amt10(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(int value) {
		bill().tax_rate_base_tax_amt10(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(long value) {
		bill().tax_rate_base_tax_amt10(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(float value) {
		bill().tax_rate_base_tax_amt10(value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(double value) {
		bill().tax_rate_base_tax_amt10(value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public MCNumber adv_amt_bal() {
		return bill().adv_amt_bal();
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(MCNumber value) {
		bill().adv_amt_bal(value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(int value) {
		bill().adv_amt_bal(value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(long value) {
		bill().adv_amt_bal(value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(float value) {
		bill().adv_amt_bal(value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(double value) {
		bill().adv_amt_bal(value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public MCNumber adv_amt() {
		return bill().adv_amt();
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(MCNumber value) {
		bill().adv_amt(value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(int value) {
		bill().adv_amt(value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(long value) {
		bill().adv_amt(value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(float value) {
		bill().adv_amt(value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(double value) {
		bill().adv_amt(value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public MCNumber adv_setoff_amt() {
		return bill().adv_setoff_amt();
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(MCNumber value) {
		bill().adv_setoff_amt(value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(int value) {
		bill().adv_setoff_amt(value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(long value) {
		bill().adv_setoff_amt(value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(float value) {
		bill().adv_setoff_amt(value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(double value) {
		bill().adv_setoff_amt(value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public MCNumber adv_setoff_tax_amt() {
		return bill().adv_setoff_tax_amt();
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(MCNumber value) {
		bill().adv_setoff_tax_amt(value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(int value) {
		bill().adv_setoff_tax_amt(value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(long value) {
		bill().adv_setoff_tax_amt(value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(float value) {
		bill().adv_setoff_tax_amt(value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(double value) {
		bill().adv_setoff_tax_amt(value);
	}

	/**
	 * Scheduled payment date 1 支払予定日１.<p>
	 *
	 */
	public MCDate pay_schd_dt1() {
		return bill().pay_schd_dt1();
	}

	/**
	 * Scheduled payment date 1 支払予定日１.<p>
	 *
	 */
	public void pay_schd_dt1(MCDate value) {
		bill().pay_schd_dt1(value);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public MCNumber pay_schd_amt1() {
		return bill().pay_schd_amt1();
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(MCNumber value) {
		bill().pay_schd_amt1(value);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(int value) {
		bill().pay_schd_amt1(value);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(long value) {
		bill().pay_schd_amt1(value);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(float value) {
		bill().pay_schd_amt1(value);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(double value) {
		bill().pay_schd_amt1(value);
	}

	/**
	 * Payment method cd. 1 支払方法ＣＤ１.<p>
	 *
	 */
	public String pay_mtd_cd1() {
		return bill().pay_mtd_cd1();
	}

	/**
	 * Payment method cd. 1 支払方法ＣＤ１.<p>
	 *
	 */
	public void pay_mtd_cd1(String value) {
		bill().pay_mtd_cd1(value);
	}

	/**
	 * Scheduled payment date 2 支払予定日２.<p>
	 *
	 */
	public MCDate pay_schd_dt2() {
		return bill().pay_schd_dt2();
	}

	/**
	 * Scheduled payment date 2 支払予定日２.<p>
	 *
	 */
	public void pay_schd_dt2(MCDate value) {
		bill().pay_schd_dt2(value);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public MCNumber pay_schd_amt2() {
		return bill().pay_schd_amt2();
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(MCNumber value) {
		bill().pay_schd_amt2(value);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(int value) {
		bill().pay_schd_amt2(value);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(long value) {
		bill().pay_schd_amt2(value);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(float value) {
		bill().pay_schd_amt2(value);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(double value) {
		bill().pay_schd_amt2(value);
	}

	/**
	 * Payment method cd. 2 支払方法ＣＤ２.<p>
	 *
	 */
	public String pay_mtd_cd2() {
		return bill().pay_mtd_cd2();
	}

	/**
	 * Payment method cd. 2 支払方法ＣＤ２.<p>
	 *
	 */
	public void pay_mtd_cd2(String value) {
		bill().pay_mtd_cd2(value);
	}

	/**
	 * Scheduled payment date 3 支払予定日３.<p>
	 *
	 */
	public MCDate pay_schd_dt3() {
		return bill().pay_schd_dt3();
	}

	/**
	 * Scheduled payment date 3 支払予定日３.<p>
	 *
	 */
	public void pay_schd_dt3(MCDate value) {
		bill().pay_schd_dt3(value);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public MCNumber pay_schd_amt3() {
		return bill().pay_schd_amt3();
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(MCNumber value) {
		bill().pay_schd_amt3(value);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(int value) {
		bill().pay_schd_amt3(value);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(long value) {
		bill().pay_schd_amt3(value);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(float value) {
		bill().pay_schd_amt3(value);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(double value) {
		bill().pay_schd_amt3(value);
	}

	/**
	 * Payment method cd. 3 支払方法ＣＤ３.<p>
	 *
	 */
	public String pay_mtd_cd3() {
		return bill().pay_mtd_cd3();
	}

	/**
	 * Payment method cd. 3 支払方法ＣＤ３.<p>
	 *
	 */
	public void pay_mtd_cd3(String value) {
		bill().pay_mtd_cd3(value);
	}

	/**
	 * Scheduled payment date 4 支払予定日４.<p>
	 *
	 */
	public MCDate pay_schd_dt4() {
		return bill().pay_schd_dt4();
	}

	/**
	 * Scheduled payment date 4 支払予定日４.<p>
	 *
	 */
	public void pay_schd_dt4(MCDate value) {
		bill().pay_schd_dt4(value);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public MCNumber pay_schd_amt4() {
		return bill().pay_schd_amt4();
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(MCNumber value) {
		bill().pay_schd_amt4(value);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(int value) {
		bill().pay_schd_amt4(value);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(long value) {
		bill().pay_schd_amt4(value);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(float value) {
		bill().pay_schd_amt4(value);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(double value) {
		bill().pay_schd_amt4(value);
	}

	/**
	 * Payment method cd. 4 支払方法ＣＤ４.<p>
	 *
	 */
	public String pay_mtd_cd4() {
		return bill().pay_mtd_cd4();
	}

	/**
	 * Payment method cd. 4 支払方法ＣＤ４.<p>
	 *
	 */
	public void pay_mtd_cd4(String value) {
		bill().pay_mtd_cd4(value);
	}

	/**
	 * Scheduled payment date 5 支払予定日５.<p>
	 *
	 */
	public MCDate pay_schd_dt5() {
		return bill().pay_schd_dt5();
	}

	/**
	 * Scheduled payment date 5 支払予定日５.<p>
	 *
	 */
	public void pay_schd_dt5(MCDate value) {
		bill().pay_schd_dt5(value);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public MCNumber pay_schd_amt5() {
		return bill().pay_schd_amt5();
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(MCNumber value) {
		bill().pay_schd_amt5(value);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(int value) {
		bill().pay_schd_amt5(value);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(long value) {
		bill().pay_schd_amt5(value);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(float value) {
		bill().pay_schd_amt5(value);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(double value) {
		bill().pay_schd_amt5(value);
	}

	/**
	 * Payment method cd. 5 支払方法ＣＤ５.<p>
	 *
	 */
	public String pay_mtd_cd5() {
		return bill().pay_mtd_cd5();
	}

	/**
	 * Payment method cd. 5 支払方法ＣＤ５.<p>
	 *
	 */
	public void pay_mtd_cd5(String value) {
		bill().pay_mtd_cd5(value);
	}

	/**
	 * Scheduled payment date 6 支払予定日６.<p>
	 *
	 */
	public MCDate pay_schd_dt6() {
		return bill().pay_schd_dt6();
	}

	/**
	 * Scheduled payment date 6 支払予定日６.<p>
	 *
	 */
	public void pay_schd_dt6(MCDate value) {
		bill().pay_schd_dt6(value);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public MCNumber pay_schd_amt6() {
		return bill().pay_schd_amt6();
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(MCNumber value) {
		bill().pay_schd_amt6(value);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(int value) {
		bill().pay_schd_amt6(value);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(long value) {
		bill().pay_schd_amt6(value);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(float value) {
		bill().pay_schd_amt6(value);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(double value) {
		bill().pay_schd_amt6(value);
	}

	/**
	 * Payment method cd. 6 支払方法ＣＤ６.<p>
	 *
	 */
	public String pay_mtd_cd6() {
		return bill().pay_mtd_cd6();
	}

	/**
	 * Payment method cd. 6 支払方法ＣＤ６.<p>
	 *
	 */
	public void pay_mtd_cd6(String value) {
		bill().pay_mtd_cd6(value);
	}

	/**
	 * Scheduled payment date 7 支払予定日７.<p>
	 *
	 */
	public MCDate pay_schd_dt7() {
		return bill().pay_schd_dt7();
	}

	/**
	 * Scheduled payment date 7 支払予定日７.<p>
	 *
	 */
	public void pay_schd_dt7(MCDate value) {
		bill().pay_schd_dt7(value);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public MCNumber pay_schd_amt7() {
		return bill().pay_schd_amt7();
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(MCNumber value) {
		bill().pay_schd_amt7(value);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(int value) {
		bill().pay_schd_amt7(value);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(long value) {
		bill().pay_schd_amt7(value);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(float value) {
		bill().pay_schd_amt7(value);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(double value) {
		bill().pay_schd_amt7(value);
	}

	/**
	 * Payment method cd. 7 支払方法ＣＤ７.<p>
	 *
	 */
	public String pay_mtd_cd7() {
		return bill().pay_mtd_cd7();
	}

	/**
	 * Payment method cd. 7 支払方法ＣＤ７.<p>
	 *
	 */
	public void pay_mtd_cd7(String value) {
		bill().pay_mtd_cd7(value);
	}

	/**
	 * Scheduled payment date 8 支払予定日８.<p>
	 *
	 */
	public MCDate pay_schd_dt8() {
		return bill().pay_schd_dt8();
	}

	/**
	 * Scheduled payment date 8 支払予定日８.<p>
	 *
	 */
	public void pay_schd_dt8(MCDate value) {
		bill().pay_schd_dt8(value);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public MCNumber pay_schd_amt8() {
		return bill().pay_schd_amt8();
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(MCNumber value) {
		bill().pay_schd_amt8(value);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(int value) {
		bill().pay_schd_amt8(value);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(long value) {
		bill().pay_schd_amt8(value);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(float value) {
		bill().pay_schd_amt8(value);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(double value) {
		bill().pay_schd_amt8(value);
	}

	/**
	 * Payment method cd. 8 支払方法ＣＤ８.<p>
	 *
	 */
	public String pay_mtd_cd8() {
		return bill().pay_mtd_cd8();
	}

	/**
	 * Payment method cd. 8 支払方法ＣＤ８.<p>
	 *
	 */
	public void pay_mtd_cd8(String value) {
		bill().pay_mtd_cd8(value);
	}

	/**
	 * Scheduled payment date 9 支払予定日９.<p>
	 *
	 */
	public MCDate pay_schd_dt9() {
		return bill().pay_schd_dt9();
	}

	/**
	 * Scheduled payment date 9 支払予定日９.<p>
	 *
	 */
	public void pay_schd_dt9(MCDate value) {
		bill().pay_schd_dt9(value);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public MCNumber pay_schd_amt9() {
		return bill().pay_schd_amt9();
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(MCNumber value) {
		bill().pay_schd_amt9(value);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(int value) {
		bill().pay_schd_amt9(value);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(long value) {
		bill().pay_schd_amt9(value);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(float value) {
		bill().pay_schd_amt9(value);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(double value) {
		bill().pay_schd_amt9(value);
	}

	/**
	 * Payment method cd. 9 支払方法ＣＤ９.<p>
	 *
	 */
	public String pay_mtd_cd9() {
		return bill().pay_mtd_cd9();
	}

	/**
	 * Payment method cd. 9 支払方法ＣＤ９.<p>
	 *
	 */
	public void pay_mtd_cd9(String value) {
		bill().pay_mtd_cd9(value);
	}

	/**
	 * Scheduled payment date 10 支払予定日１０.<p>
	 *
	 */
	public MCDate pay_schd_dt10() {
		return bill().pay_schd_dt10();
	}

	/**
	 * Scheduled payment date 10 支払予定日１０.<p>
	 *
	 */
	public void pay_schd_dt10(MCDate value) {
		bill().pay_schd_dt10(value);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public MCNumber pay_schd_amt10() {
		return bill().pay_schd_amt10();
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(MCNumber value) {
		bill().pay_schd_amt10(value);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(int value) {
		bill().pay_schd_amt10(value);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(long value) {
		bill().pay_schd_amt10(value);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(float value) {
		bill().pay_schd_amt10(value);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(double value) {
		bill().pay_schd_amt10(value);
	}

	/**
	 * Payment method cd. 10 支払方法ＣＤ１０.<p>
	 *
	 */
	public String pay_mtd_cd10() {
		return bill().pay_mtd_cd10();
	}

	/**
	 * Payment method cd. 10 支払方法ＣＤ１０.<p>
	 *
	 */
	public void pay_mtd_cd10(String value) {
		bill().pay_mtd_cd10(value);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return bill().bank_ac_cd();
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		bill().bank_ac_cd(value);
	}

	/**
	 * Bank account type 口座区分.<p>
	 *
	 */
	public String bank_ac_typ() {
		return bill().bank_ac_typ();
	}

	/**
	 * Bank account type 口座区分.<p>
	 *
	 */
	public void bank_ac_typ(String value) {
		bill().bank_ac_typ(value);
	}

	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public String bank_ac_no() {
		return bill().bank_ac_no();
	}

	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public void bank_ac_no(String value) {
		bill().bank_ac_no(value);
	}

	/**
	 * Bank account holder 口座名義.<p>
	 *
	 */
	public String bank_ac_holder() {
		return bill().bank_ac_holder();
	}

	/**
	 * Bank account holder 口座名義.<p>
	 *
	 */
	public void bank_ac_holder(String value) {
		bill().bank_ac_holder(value);
	}

	/**
	 * Account holder alias name 口座名義別名.<p>
	 *
	 */
	public String bank_ac_holder_sub() {
		return bill().bank_ac_holder_sub();
	}

	/**
	 * Account holder alias name 口座名義別名.<p>
	 *
	 */
	public void bank_ac_holder_sub(String value) {
		bill().bank_ac_holder_sub(value);
	}

	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public String bank_cd() {
		return bill().bank_cd();
	}

	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public void bank_cd(String value) {
		bill().bank_cd(value);
	}

	/**
	 * Bank name 銀行名.<p>
	 *
	 */
	public String bank_nm() {
		return bill().bank_nm();
	}

	/**
	 * Bank name 銀行名.<p>
	 *
	 */
	public void bank_nm(String value) {
		bill().bank_nm(value);
	}

	/**
	 * Branch cd. 支店ＣＤ.<p>
	 *
	 */
	public String branch_cd() {
		return bill().branch_cd();
	}

	/**
	 * Branch cd. 支店ＣＤ.<p>
	 *
	 */
	public void branch_cd(String value) {
		bill().branch_cd(value);
	}

	/**
	 * Branch name 支店名.<p>
	 *
	 */
	public String branch_nm() {
		return bill().branch_nm();
	}

	/**
	 * Branch name 支店名.<p>
	 *
	 */
	public void branch_nm(String value) {
		bill().branch_nm(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return bill().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		bill().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return bill().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		bill().trd_ptn_typ(value);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return bill().slip_sts_typ();
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		bill().slip_sts_typ(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return bill().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		bill().dlv_slip_no(value);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return bill().dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		bill().dlv_slip_d_no(value);
	}

	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_no() {
		return bill().ship_dlv_slip_no();
	}

	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_no(String value) {
		bill().ship_dlv_slip_no(value);
	}

	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_d_no() {
		return bill().ship_dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_d_no(String value) {
		bill().ship_dlv_slip_d_no(value);
	}

	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return bill().act_no();
	}

	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		bill().act_no(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public MCNumber act_rev() {
		return bill().act_rev();
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(MCNumber value) {
		bill().act_rev(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(int value) {
		bill().act_rev(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(long value) {
		bill().act_rev(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(float value) {
		bill().act_rev(value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(double value) {
		bill().act_rev(value);
	}

	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return bill().act_d_no();
	}

	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		bill().act_d_no(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return bill().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		bill().po_no(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return bill().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		bill().po_d_no(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return bill().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		bill().ac_dt(value);
	}

	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCDate dlv_dt() {
		return bill().dlv_dt();
	}

	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public void dlv_dt(MCDate value) {
		bill().dlv_dt(value);
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return bill().rcv_dt();
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		bill().rcv_dt(value);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return bill().bill_basis_dt();
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		bill().bill_basis_dt(value);
	}

	/**
	 * Recording date (Base) 計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return bill().base_ac_dt();
	}

	/**
	 * Recording date (Base) 計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		bill().base_ac_dt(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return bill().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		bill().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return bill().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		bill().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return bill().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		bill().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return bill().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		bill().itm_sub3(value);
	}

	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return bill().itm_alt_nm1();
	}

	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		bill().itm_alt_nm1(value);
	}

	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return bill().itm_alt_nm2();
	}

	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		bill().itm_alt_nm2(value);
	}

	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return bill().itm_alt_nm3();
	}

	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		bill().itm_alt_nm3(value);
	}

	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return bill().itm_alt_nm4();
	}

	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		bill().itm_alt_nm4(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return bill().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		bill().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return bill().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		bill().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return bill().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		bill().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return bill().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		bill().sno4(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return bill().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		bill().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return bill().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		bill().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		bill().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		bill().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		bill().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		bill().trd_unit_qty(value);
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return bill().interim_flg();
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		bill().interim_flg(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return bill().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		bill().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		bill().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		bill().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		bill().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		bill().trd_cur_upri(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return bill().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		bill().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		bill().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		bill().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		bill().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		bill().trd_cur_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return bill().trd_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		bill().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		bill().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		bill().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		bill().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		bill().trd_cur_dscnt_amt(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return bill().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		bill().tax_cd(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return bill().tax_rate();
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		bill().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		bill().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		bill().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		bill().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		bill().tax_rate(value);
	}

	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return bill().inc_tax_flg();
	}

	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		bill().inc_tax_flg(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return bill().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		bill().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		bill().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		bill().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		bill().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		bill().trd_cur_tax_amt(value);
	}

	/**
	 * Details remarks 明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return bill().trd_d_rmrks();
	}

	/**
	 * Details remarks 明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		bill().trd_d_rmrks(value);
	}

	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return bill().bill_bcst_nm();
	}

	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		bill().bill_bcst_nm(value);
	}

	/**
	 * Invoice send-to corporation No. 請求書送付法人番号.<p>
	 *
	 */
	public String bill_ein() {
		return bill().bill_ein();
	}

	/**
	 * Invoice send-to corporation No. 請求書送付法人番号.<p>
	 *
	 */
	public void bill_ein(String value) {
		bill().bill_ein(value);
	}

	/**
	 * Invoice send-to business No. 請求書送付事業者ＮＯ.<p>
	 *
	 */
	public String bill_biz_co_no() {
		return bill().bill_biz_co_no();
	}

	/**
	 * Invoice send-to business No. 請求書送付事業者ＮＯ.<p>
	 *
	 */
	public void bill_biz_co_no(String value) {
		bill().bill_biz_co_no(value);
	}

	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public String bill_zip_cd() {
		return bill().bill_zip_cd();
	}

	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public void bill_zip_cd(String value) {
		bill().bill_zip_cd(value);
	}

	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public String bill_addr1() {
		return bill().bill_addr1();
	}

	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public void bill_addr1(String value) {
		bill().bill_addr1(value);
	}

	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public String bill_addr2() {
		return bill().bill_addr2();
	}

	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public void bill_addr2(String value) {
		bill().bill_addr2(value);
	}

	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public String bill_addr3() {
		return bill().bill_addr3();
	}

	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public void bill_addr3(String value) {
		bill().bill_addr3(value);
	}

	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public String bill_addr4() {
		return bill().bill_addr4();
	}

	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public void bill_addr4(String value) {
		bill().bill_addr4(value);
	}

	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return bill().bill_bcst_dpt();
	}

	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		bill().bill_bcst_dpt(value);
	}

	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public String bill_tel() {
		return bill().bill_tel();
	}

	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public void bill_tel(String value) {
		bill().bill_tel(value);
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return bill().sub_char1();
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		bill().sub_char1(value);
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return bill().sub_char2();
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		bill().sub_char2(value);
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return bill().sub_char3();
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		bill().sub_char3(value);
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return bill().sub_char4();
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		bill().sub_char4(value);
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return bill().sub_char5();
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		bill().sub_char5(value);
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return bill().sub_char6();
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		bill().sub_char6(value);
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return bill().sub_char7();
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		bill().sub_char7(value);
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return bill().sub_char8();
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		bill().sub_char8(value);
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return bill().sub_char9();
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		bill().sub_char9(value);
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return bill().sub_char10();
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		bill().sub_char10(value);
	}

	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return bill().sub_char11();
	}

	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		bill().sub_char11(value);
	}

	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return bill().sub_char12();
	}

	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		bill().sub_char12(value);
	}

	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return bill().sub_char13();
	}

	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		bill().sub_char13(value);
	}

	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return bill().sub_char14();
	}

	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		bill().sub_char14(value);
	}

	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return bill().sub_char15();
	}

	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		bill().sub_char15(value);
	}

	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return bill().sub_char16();
	}

	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		bill().sub_char16(value);
	}

	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return bill().sub_char17();
	}

	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		bill().sub_char17(value);
	}

	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return bill().sub_char18();
	}

	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		bill().sub_char18(value);
	}

	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return bill().sub_char19();
	}

	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		bill().sub_char19(value);
	}

	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return bill().sub_char20();
	}

	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		bill().sub_char20(value);
	}

	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return bill().sub_char21();
	}

	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		bill().sub_char21(value);
	}

	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return bill().sub_char22();
	}

	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		bill().sub_char22(value);
	}

	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return bill().sub_char23();
	}

	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		bill().sub_char23(value);
	}

	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return bill().sub_char24();
	}

	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		bill().sub_char24(value);
	}

	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return bill().sub_char25();
	}

	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		bill().sub_char25(value);
	}

	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return bill().sub_char26();
	}

	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		bill().sub_char26(value);
	}

	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return bill().sub_char27();
	}

	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		bill().sub_char27(value);
	}

	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return bill().sub_char28();
	}

	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		bill().sub_char28(value);
	}

	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return bill().sub_char29();
	}

	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		bill().sub_char29(value);
	}

	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return bill().sub_char30();
	}

	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		bill().sub_char30(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return bill().sub_num1();
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		bill().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		bill().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		bill().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		bill().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		bill().sub_num1(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return bill().sub_num2();
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		bill().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		bill().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		bill().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		bill().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		bill().sub_num2(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return bill().sub_num3();
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		bill().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		bill().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		bill().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		bill().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		bill().sub_num3(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return bill().sub_num4();
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		bill().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		bill().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		bill().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		bill().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		bill().sub_num4(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return bill().sub_num5();
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		bill().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		bill().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		bill().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		bill().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		bill().sub_num5(value);
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return bill().sub_dt1();
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		bill().sub_dt1(value);
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return bill().sub_dt2();
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		bill().sub_dt2(value);
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return bill().sub_dt3();
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		bill().sub_dt3(value);
	}

	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return bill().sub_dt4();
	}

	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		bill().sub_dt4(value);
	}

	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return bill().sub_dt5();
	}

	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		bill().sub_dt5(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return bill().log_sub_key1();
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		bill().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		bill().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		bill().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		bill().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		bill().log_sub_key1(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return bill().log_sub_key2();
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		bill().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		bill().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		bill().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		bill().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		bill().log_sub_key2(value);
	}

}

