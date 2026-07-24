package mcframe.serverMABC.MABCL0020;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cn;

/**
 * [MABCL_CoReg]の入出力情報となる電文（上り・下り電文）と
 * 画面コンテナの間のデータ変換の定義を行うクラスです。
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズはできません。
 */
@SuppressWarnings({"all"})
abstract public class PDef_MC_A extends MCDef {
	public MCContainerDef getCustomDef(String id){
		if (id == null) {
			return null;
		} 
//FMCB GET_DEF START
		else if (id.equals("MA.MABCL0020.Co_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0020_Co_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0020.Co_Upd01.UP.BLOCK0")){
			return MA_MABCL0020_Co_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0020.CoSub_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0020_CoSub_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0020.CoSub_Upd01.UP.BLOCK0")){
			return MA_MABCL0020_CoSub_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0020.CoLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0020_CoLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0020.CoLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0020_CoLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0020.Srch01.UP.BLOCK0")){
			return MA_MABCL0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0020.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0020.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0020_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0020.Srch01.DOWN.BLOCK2")){
			return MA_MABCL0020_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MABCL0020.Upd01.UP.BLOCK0")){
			return MA_MABCL0020_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0020.Upd01.UP.BLOCK1")){
			return MA_MABCL0020_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0020.Upd01.UP.BLOCK2")){
			return MA_MABCL0020_Upd01_UP_BLOCK2();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MA_MABCL0020_Co_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0020", "Co_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0020_Co_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0020", "Co_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("co_alt_nm1", "co_alt_nm1"),
				MCItemDef.create("co_alt_nm2", "co_alt_nm2"),
				MCItemDef.create("co_alt_nm3", "co_alt_nm3"),
				MCItemDef.create("co_alt_nm4", "co_alt_nm4"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("co_repl_nm", "co_repl_nm"),
				MCItemDef.create("ein", "ein"),
				MCItemDef.create("biz_co_no", "biz_co_no"),
				MCItemDef.create("std_co_cd", "std_co_cd"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("st_mon", "st_mon"),
				MCItemDef.create("dt_switch_time", "dt_switch_time"),
				MCItemDef.create("ac_cl_day", "ac_cl_day"),
				MCItemDef.create("ac_cl_mon_base", "ac_cl_mon_base"),
				MCItemDef.create("std_cal_cd", "std_cal_cd"),
				MCItemDef.create("bill_cl_cal_cd", "bill_cl_cal_cd"),
				MCItemDef.create("ar_no_use_flg", "ar_no_use_flg"),
				MCItemDef.create("ap_no_use_flg", "ap_no_use_flg"),
				MCItemDef.create("temp_ap_use_flg", "temp_ap_use_flg"),
				MCItemDef.create("sls_cl_flg", "sls_cl_flg"),
				MCItemDef.create("rcv_cl_flg", "rcv_cl_flg"),
				MCItemDef.create("purc_cl_flg", "purc_cl_flg"),
				MCItemDef.create("pay_cl_flg", "pay_cl_flg"),
				MCItemDef.create("stk_cl_cal_cd", "stk_cl_cal_cd"),
				MCItemDef.create("sls_cl_cal_cd", "sls_cl_cal_cd"),
				MCItemDef.create("rcv_cl_cal_cd", "rcv_cl_cal_cd"),
				MCItemDef.create("purc_cl_cal_cd", "purc_cl_cal_cd"),
				MCItemDef.create("pay_cl_cal_cd", "pay_cl_cal_cd"),
				MCItemDef.create("pay_schd_cl_cal_cd", "pay_schd_cl_cal_cd"),
				MCItemDef.create("stk_cl_delay_days", "stk_cl_delay_days"),
				MCItemDef.create("stk_cl_ba_typ", "stk_cl_ba_typ"),
				MCItemDef.create("sls_cl_delay_days", "sls_cl_delay_days"),
				MCItemDef.create("sls_cl_ba_typ", "sls_cl_ba_typ"),
				MCItemDef.create("rcv_cl_delay_days", "rcv_cl_delay_days"),
				MCItemDef.create("rcv_cl_ba_typ", "rcv_cl_ba_typ"),
				MCItemDef.create("purc_cl_delay_days", "purc_cl_delay_days"),
				MCItemDef.create("purc_cl_ba_typ", "purc_cl_ba_typ"),
				MCItemDef.create("pay_cl_delay_days", "pay_cl_delay_days"),
				MCItemDef.create("pay_cl_ba_typ", "pay_cl_ba_typ"),
				MCItemDef.create("sls_xrate_cd", "sls_xrate_cd"),
				MCItemDef.create("purc_xrate_cd", "purc_xrate_cd"),
				MCItemDef.create("prov_xrate_cd", "prov_xrate_cd"),
				MCItemDef.create("bill_xrate_conv_flg", "bill_xrate_conv_flg"),
				MCItemDef.create("bill_xrate_cd", "bill_xrate_cd"),
				MCItemDef.create("pay_xrate_conv_flg", "pay_xrate_conv_flg"),
				MCItemDef.create("pay_xrate_cd", "pay_xrate_cd"),
				MCItemDef.create("mon01_xrate_rev_flg", "mon01_xrate_rev_flg"),
				MCItemDef.create("mon02_xrate_rev_flg", "mon02_xrate_rev_flg"),
				MCItemDef.create("mon03_xrate_rev_flg", "mon03_xrate_rev_flg"),
				MCItemDef.create("mon04_xrate_rev_flg", "mon04_xrate_rev_flg"),
				MCItemDef.create("mon05_xrate_rev_flg", "mon05_xrate_rev_flg"),
				MCItemDef.create("mon06_xrate_rev_flg", "mon06_xrate_rev_flg"),
				MCItemDef.create("mon07_xrate_rev_flg", "mon07_xrate_rev_flg"),
				MCItemDef.create("mon08_xrate_rev_flg", "mon08_xrate_rev_flg"),
				MCItemDef.create("mon09_xrate_rev_flg", "mon09_xrate_rev_flg"),
				MCItemDef.create("mon10_xrate_rev_flg", "mon10_xrate_rev_flg"),
				MCItemDef.create("mon11_xrate_rev_flg", "mon11_xrate_rev_flg"),
				MCItemDef.create("mon12_xrate_rev_flg", "mon12_xrate_rev_flg"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("bill_basis_typ", "bill_basis_typ"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("xfr_stk_mng_typ", "xfr_stk_mng_typ"),
				MCItemDef.create("setoff_tax_rnd_typ", "setoff_tax_rnd_typ"),
				MCItemDef.create("xrate_rnd_typ", "xrate_rnd_typ"),
				MCItemDef.create("com_paid_tax_rnd_typ", "com_paid_tax_rnd_typ"),
				MCItemDef.create("wtax_rnd_typ", "wtax_rnd_typ"),
				MCItemDef.create("stk_amt_rnd_typ", "stk_amt_rnd_typ"),
				MCItemDef.create("stk_amt_dec_place", "stk_amt_dec_place"),
				MCItemDef.create("sls_bdj_rnd_typ", "sls_bdj_rnd_typ"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("stk_lst_cnf_num", "stk_lst_cnf_num"),
				MCItemDef.create("stk_lst_limit_num", "stk_lst_limit_num"),
				MCItemDef.create("gm_std_upri_typ", "gm_std_upri_typ"),
				MCItemDef.create("stk_std_upri_typ", "stk_std_upri_typ"),
				MCItemDef.create("early_ship_dt_add_days", "early_ship_dt_add_days"),
				MCItemDef.create("ac_slip_digit", "ac_slip_digit"),
				MCItemDef.create("ac_slip_seq_flg", "ac_slip_seq_flg"),
				MCItemDef.create("rpt_strg_ext_sys_cd", "rpt_strg_ext_sys_cd"),
				MCItemDef.create("cst_prnt_typ", "cst_prnt_typ"),
				MCItemDef.create("acst_prnt_typ", "acst_prnt_typ"),
				MCItemDef.create("bcst_prnt_typ", "bcst_prnt_typ"),
				MCItemDef.create("rcst_prnt_typ", "rcst_prnt_typ"),
				MCItemDef.create("dlv_prnt_typ", "dlv_prnt_typ"),
				MCItemDef.create("sppl_prnt_typ", "sppl_prnt_typ"),
				MCItemDef.create("asppl_prnt_typ", "asppl_prnt_typ"),
				MCItemDef.create("bsppl_prnt_typ", "bsppl_prnt_typ"),
				MCItemDef.create("psppl_prnt_typ", "psppl_prnt_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Co_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0020_Co_Upd01_INFO = new MCOperationInfo("MA", "MABCL0020", "Co_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0020_Co_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0020", "Co_Upd01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("co_alt_nm1", "co_alt_nm1"),
				MCItemDef.create("co_alt_nm2", "co_alt_nm2"),
				MCItemDef.create("co_alt_nm3", "co_alt_nm3"),
				MCItemDef.create("co_alt_nm4", "co_alt_nm4"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("co_repl_nm", "co_repl_nm"),
				MCItemDef.create("ein", "ein"),
				MCItemDef.create("biz_co_no", "biz_co_no"),
				MCItemDef.create("std_co_cd", "std_co_cd"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("st_mon", "st_mon"),
				MCItemDef.create("dt_switch_time", "dt_switch_time"),
				MCItemDef.create("ac_cl_day", "ac_cl_day"),
				MCItemDef.create("ac_cl_mon_base", "ac_cl_mon_base"),
				MCItemDef.create("std_cal_cd", "std_cal_cd"),
				MCItemDef.create("bill_cl_cal_cd", "bill_cl_cal_cd"),
				MCItemDef.create("ar_no_use_flg", "ar_no_use_flg"),
				MCItemDef.create("ap_no_use_flg", "ap_no_use_flg"),
				MCItemDef.create("temp_ap_use_flg", "temp_ap_use_flg"),
				MCItemDef.create("sls_cl_flg", "sls_cl_flg"),
				MCItemDef.create("rcv_cl_flg", "rcv_cl_flg"),
				MCItemDef.create("purc_cl_flg", "purc_cl_flg"),
				MCItemDef.create("pay_cl_flg", "pay_cl_flg"),
				MCItemDef.create("stk_cl_cal_cd", "stk_cl_cal_cd"),
				MCItemDef.create("sls_cl_cal_cd", "sls_cl_cal_cd"),
				MCItemDef.create("rcv_cl_cal_cd", "rcv_cl_cal_cd"),
				MCItemDef.create("purc_cl_cal_cd", "purc_cl_cal_cd"),
				MCItemDef.create("pay_cl_cal_cd", "pay_cl_cal_cd"),
				MCItemDef.create("pay_schd_cl_cal_cd", "pay_schd_cl_cal_cd"),
				MCItemDef.create("stk_cl_delay_days", "stk_cl_delay_days"),
				MCItemDef.create("stk_cl_ba_typ", "stk_cl_ba_typ"),
				MCItemDef.create("sls_cl_delay_days", "sls_cl_delay_days"),
				MCItemDef.create("sls_cl_ba_typ", "sls_cl_ba_typ"),
				MCItemDef.create("rcv_cl_delay_days", "rcv_cl_delay_days"),
				MCItemDef.create("rcv_cl_ba_typ", "rcv_cl_ba_typ"),
				MCItemDef.create("purc_cl_delay_days", "purc_cl_delay_days"),
				MCItemDef.create("purc_cl_ba_typ", "purc_cl_ba_typ"),
				MCItemDef.create("pay_cl_delay_days", "pay_cl_delay_days"),
				MCItemDef.create("pay_cl_ba_typ", "pay_cl_ba_typ"),
				MCItemDef.create("sls_xrate_cd", "sls_xrate_cd"),
				MCItemDef.create("purc_xrate_cd", "purc_xrate_cd"),
				MCItemDef.create("prov_xrate_cd", "prov_xrate_cd"),
				MCItemDef.create("bill_xrate_conv_flg", "bill_xrate_conv_flg"),
				MCItemDef.create("bill_xrate_cd", "bill_xrate_cd"),
				MCItemDef.create("pay_xrate_conv_flg", "pay_xrate_conv_flg"),
				MCItemDef.create("pay_xrate_cd", "pay_xrate_cd"),
				MCItemDef.create("mon01_xrate_rev_flg", "mon01_xrate_rev_flg"),
				MCItemDef.create("mon02_xrate_rev_flg", "mon02_xrate_rev_flg"),
				MCItemDef.create("mon03_xrate_rev_flg", "mon03_xrate_rev_flg"),
				MCItemDef.create("mon04_xrate_rev_flg", "mon04_xrate_rev_flg"),
				MCItemDef.create("mon05_xrate_rev_flg", "mon05_xrate_rev_flg"),
				MCItemDef.create("mon06_xrate_rev_flg", "mon06_xrate_rev_flg"),
				MCItemDef.create("mon07_xrate_rev_flg", "mon07_xrate_rev_flg"),
				MCItemDef.create("mon08_xrate_rev_flg", "mon08_xrate_rev_flg"),
				MCItemDef.create("mon09_xrate_rev_flg", "mon09_xrate_rev_flg"),
				MCItemDef.create("mon10_xrate_rev_flg", "mon10_xrate_rev_flg"),
				MCItemDef.create("mon11_xrate_rev_flg", "mon11_xrate_rev_flg"),
				MCItemDef.create("mon12_xrate_rev_flg", "mon12_xrate_rev_flg"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("bill_basis_typ", "bill_basis_typ"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("xfr_stk_mng_typ", "xfr_stk_mng_typ"),
				MCItemDef.create("setoff_tax_rnd_typ", "setoff_tax_rnd_typ"),
				MCItemDef.create("xrate_rnd_typ", "xrate_rnd_typ"),
				MCItemDef.create("com_paid_tax_rnd_typ", "com_paid_tax_rnd_typ"),
				MCItemDef.create("wtax_rnd_typ", "wtax_rnd_typ"),
				MCItemDef.create("stk_amt_rnd_typ", "stk_amt_rnd_typ"),
				MCItemDef.create("stk_amt_dec_place", "stk_amt_dec_place"),
				MCItemDef.create("sls_bdj_rnd_typ", "sls_bdj_rnd_typ"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("stk_lst_cnf_num", "stk_lst_cnf_num"),
				MCItemDef.create("stk_lst_limit_num", "stk_lst_limit_num"),
				MCItemDef.create("gm_std_upri_typ", "gm_std_upri_typ"),
				MCItemDef.create("stk_std_upri_typ", "stk_std_upri_typ"),
				MCItemDef.create("early_ship_dt_add_days", "early_ship_dt_add_days"),
				MCItemDef.create("ac_slip_digit", "ac_slip_digit"),
				MCItemDef.create("ac_slip_seq_flg", "ac_slip_seq_flg"),
				MCItemDef.create("rpt_strg_ext_sys_cd", "rpt_strg_ext_sys_cd"),
				MCItemDef.create("cst_prnt_typ", "cst_prnt_typ"),
				MCItemDef.create("acst_prnt_typ", "acst_prnt_typ"),
				MCItemDef.create("bcst_prnt_typ", "bcst_prnt_typ"),
				MCItemDef.create("rcst_prnt_typ", "rcst_prnt_typ"),
				MCItemDef.create("dlv_prnt_typ", "dlv_prnt_typ"),
				MCItemDef.create("sppl_prnt_typ", "sppl_prnt_typ"),
				MCItemDef.create("asppl_prnt_typ", "asppl_prnt_typ"),
				MCItemDef.create("bsppl_prnt_typ", "bsppl_prnt_typ"),
				MCItemDef.create("psppl_prnt_typ", "psppl_prnt_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Co_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0020_CoSub_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0020", "CoSub_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0020_CoSub_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0020", "CoSub_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("sls_tax_cd", "sls_tax_cd"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CoSub_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0020_CoSub_Upd01_INFO = new MCOperationInfo("MA", "MABCL0020", "CoSub_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0020_CoSub_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0020", "CoSub_Upd01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("sls_tax_cd", "sls_tax_cd"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CoSub_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0020_CoLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0020", "CoLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0020_CoLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0020", "CoLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("co_alt_nm1", "co_alt_nm1"),
				MCItemDef.create("co_alt_nm2", "co_alt_nm2"),
				MCItemDef.create("co_alt_nm3", "co_alt_nm3"),
				MCItemDef.create("co_alt_nm4", "co_alt_nm4"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("co_repl_nm", "co_repl_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CoLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0020_CoLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0020", "CoLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0020_CoLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0020", "CoLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("co_alt_nm1", "co_alt_nm1"),
				MCItemDef.create("co_alt_nm2", "co_alt_nm2"),
				MCItemDef.create("co_alt_nm3", "co_alt_nm3"),
				MCItemDef.create("co_alt_nm4", "co_alt_nm4"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("co_repl_nm", "co_repl_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("CoLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0020_Srch01_INFO = new MCOperationInfo("MA", "MABCL0020", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0020_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0020_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("co_alt_nm1", "co_alt_nm1"),
				MCItemDef.create("co_alt_nm2", "co_alt_nm2"),
				MCItemDef.create("co_alt_nm3", "co_alt_nm3"),
				MCItemDef.create("co_alt_nm4", "co_alt_nm4"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("co_repl_nm", "co_repl_nm"),
				MCItemDef.create("ein", "ein"),
				MCItemDef.create("biz_co_no", "biz_co_no"),
				MCItemDef.create("std_co_cd", "std_co_cd"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("st_mon", "st_mon"),
				MCItemDef.create("dt_switch_time", "dt_switch_time"),
				MCItemDef.create("ac_cl_day", "ac_cl_day"),
				MCItemDef.create("ac_cl_mon_base", "ac_cl_mon_base"),
				MCItemDef.create("std_cal_cd", "std_cal_cd"),
				MCItemDef.create("bill_cl_cal_cd", "bill_cl_cal_cd"),
				MCItemDef.create("ar_no_use_flg", "ar_no_use_flg"),
				MCItemDef.create("ap_no_use_flg", "ap_no_use_flg"),
				MCItemDef.create("temp_ap_use_flg", "temp_ap_use_flg"),
				MCItemDef.create("sls_cl_flg", "sls_cl_flg"),
				MCItemDef.create("rcv_cl_flg", "rcv_cl_flg"),
				MCItemDef.create("purc_cl_flg", "purc_cl_flg"),
				MCItemDef.create("pay_cl_flg", "pay_cl_flg"),
				MCItemDef.create("stk_cl_cal_cd", "stk_cl_cal_cd"),
				MCItemDef.create("sls_cl_cal_cd", "sls_cl_cal_cd"),
				MCItemDef.create("rcv_cl_cal_cd", "rcv_cl_cal_cd"),
				MCItemDef.create("purc_cl_cal_cd", "purc_cl_cal_cd"),
				MCItemDef.create("pay_cl_cal_cd", "pay_cl_cal_cd"),
				MCItemDef.create("pay_schd_cl_cal_cd", "pay_schd_cl_cal_cd"),
				MCItemDef.create("stk_cl_delay_days", "stk_cl_delay_days"),
				MCItemDef.create("stk_cl_ba_typ", "stk_cl_ba_typ"),
				MCItemDef.create("sls_cl_delay_days", "sls_cl_delay_days"),
				MCItemDef.create("sls_cl_ba_typ", "sls_cl_ba_typ"),
				MCItemDef.create("rcv_cl_delay_days", "rcv_cl_delay_days"),
				MCItemDef.create("rcv_cl_ba_typ", "rcv_cl_ba_typ"),
				MCItemDef.create("purc_cl_delay_days", "purc_cl_delay_days"),
				MCItemDef.create("purc_cl_ba_typ", "purc_cl_ba_typ"),
				MCItemDef.create("pay_cl_delay_days", "pay_cl_delay_days"),
				MCItemDef.create("pay_cl_ba_typ", "pay_cl_ba_typ"),
				MCItemDef.create("sls_xrate_cd", "sls_xrate_cd"),
				MCItemDef.create("purc_xrate_cd", "purc_xrate_cd"),
				MCItemDef.create("prov_xrate_cd", "prov_xrate_cd"),
				MCItemDef.create("bill_xrate_conv_flg", "bill_xrate_conv_flg"),
				MCItemDef.create("bill_xrate_cd", "bill_xrate_cd"),
				MCItemDef.create("pay_xrate_conv_flg", "pay_xrate_conv_flg"),
				MCItemDef.create("pay_xrate_cd", "pay_xrate_cd"),
				MCItemDef.create("mon01_xrate_rev_flg", "mon01_xrate_rev_flg"),
				MCItemDef.create("mon02_xrate_rev_flg", "mon02_xrate_rev_flg"),
				MCItemDef.create("mon03_xrate_rev_flg", "mon03_xrate_rev_flg"),
				MCItemDef.create("mon04_xrate_rev_flg", "mon04_xrate_rev_flg"),
				MCItemDef.create("mon05_xrate_rev_flg", "mon05_xrate_rev_flg"),
				MCItemDef.create("mon06_xrate_rev_flg", "mon06_xrate_rev_flg"),
				MCItemDef.create("mon07_xrate_rev_flg", "mon07_xrate_rev_flg"),
				MCItemDef.create("mon08_xrate_rev_flg", "mon08_xrate_rev_flg"),
				MCItemDef.create("mon09_xrate_rev_flg", "mon09_xrate_rev_flg"),
				MCItemDef.create("mon10_xrate_rev_flg", "mon10_xrate_rev_flg"),
				MCItemDef.create("mon11_xrate_rev_flg", "mon11_xrate_rev_flg"),
				MCItemDef.create("mon12_xrate_rev_flg", "mon12_xrate_rev_flg"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("bill_basis_typ", "bill_basis_typ"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("xfr_stk_mng_typ", "xfr_stk_mng_typ"),
				MCItemDef.create("setoff_tax_rnd_typ", "setoff_tax_rnd_typ"),
				MCItemDef.create("xrate_rnd_typ", "xrate_rnd_typ"),
				MCItemDef.create("com_paid_tax_rnd_typ", "com_paid_tax_rnd_typ"),
				MCItemDef.create("wtax_rnd_typ", "wtax_rnd_typ"),
				MCItemDef.create("stk_amt_rnd_typ", "stk_amt_rnd_typ"),
				MCItemDef.create("stk_amt_dec_place", "stk_amt_dec_place"),
				MCItemDef.create("sls_bdj_rnd_typ", "sls_bdj_rnd_typ"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("stk_lst_cnf_num", "stk_lst_cnf_num"),
				MCItemDef.create("stk_lst_limit_num", "stk_lst_limit_num"),
				MCItemDef.create("gm_std_upri_typ", "gm_std_upri_typ"),
				MCItemDef.create("stk_std_upri_typ", "stk_std_upri_typ"),
				MCItemDef.create("early_ship_dt_add_days", "early_ship_dt_add_days"),
				MCItemDef.create("ac_slip_digit", "ac_slip_digit"),
				MCItemDef.create("ac_slip_seq_flg", "ac_slip_seq_flg"),
				MCItemDef.create("rpt_strg_ext_sys_cd", "rpt_strg_ext_sys_cd"),
				MCItemDef.create("rpt_strg_ext_sys_nm", "rpt_strg_ext_sys_nm"),
				MCItemDef.create("cst_prnt_typ", "cst_prnt_typ"),
				MCItemDef.create("cst_prnt_typ_nm", "cst_prnt_typ_nm"),
				MCItemDef.create("acst_prnt_typ", "acst_prnt_typ"),
				MCItemDef.create("acst_prnt_typ_nm", "acst_prnt_typ_nm"),
				MCItemDef.create("bcst_prnt_typ", "bcst_prnt_typ"),
				MCItemDef.create("bcst_prnt_typ_nm", "bcst_prnt_typ_nm"),
				MCItemDef.create("rcst_prnt_typ", "rcst_prnt_typ"),
				MCItemDef.create("rcst_prnt_typ_nm", "rcst_prnt_typ_nm"),
				MCItemDef.create("dlv_prnt_typ", "dlv_prnt_typ"),
				MCItemDef.create("dlv_prnt_typ_nm", "dlv_prnt_typ_nm"),
				MCItemDef.create("sppl_prnt_typ", "sppl_prnt_typ"),
				MCItemDef.create("sppl_prnt_typ_nm", "sppl_prnt_typ_nm"),
				MCItemDef.create("asppl_prnt_typ", "asppl_prnt_typ"),
				MCItemDef.create("asppl_prnt_typ_nm", "asppl_prnt_typ_nm"),
				MCItemDef.create("bsppl_prnt_typ", "bsppl_prnt_typ"),
				MCItemDef.create("bsppl_prnt_typ_nm", "bsppl_prnt_typ_nm"),
				MCItemDef.create("psppl_prnt_typ", "psppl_prnt_typ"),
				MCItemDef.create("psppl_prnt_typ_nm", "psppl_prnt_typ_nm"),
				MCItemDef.create("cntry_nm", "cntry_nm"),
				MCItemDef.create("area_nm", "area_nm"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("std_cal_nm", "std_cal_nm"),
				MCItemDef.create("stk_cl_cal_nm", "stk_cl_cal_nm"),
				MCItemDef.create("sls_cl_cal_nm", "sls_cl_cal_nm"),
				MCItemDef.create("bill_cl_cal_nm", "bill_cl_cal_nm"),
				MCItemDef.create("rcv_cl_cal_nm", "rcv_cl_cal_nm"),
				MCItemDef.create("purc_cl_cal_nm", "purc_cl_cal_nm"),
				MCItemDef.create("pay_cl_cal_nm", "pay_cl_cal_nm"),
				MCItemDef.create("pay_schd_cl_cal_nm", "pay_schd_cl_cal_nm"),
				MCItemDef.create("sls_xrate_nm", "sls_xrate_nm"),
				MCItemDef.create("purc_xrate_nm", "purc_xrate_nm"),
				MCItemDef.create("prov_xrate_nm", "prov_xrate_nm"),
				MCItemDef.create("bill_xrate_nm", "bill_xrate_nm"),
				MCItemDef.create("pay_xrate_nm", "pay_xrate_nm"),
				MCItemDef.create("stk_cl_ba_typ_nm", "stk_cl_ba_typ_nm"),
				MCItemDef.create("sls_cl_ba_typ_nm", "sls_cl_ba_typ_nm"),
				MCItemDef.create("rcv_cl_ba_typ_nm", "rcv_cl_ba_typ_nm"),
				MCItemDef.create("purc_cl_ba_typ_nm", "purc_cl_ba_typ_nm"),
				MCItemDef.create("pay_cl_ba_typ_nm", "pay_cl_ba_typ_nm"),
				MCItemDef.create("sls_upri_req_typ_nm", "sls_upri_req_typ_nm"),
				MCItemDef.create("purc_upri_req_typ_nm", "purc_upri_req_typ_nm"),
				MCItemDef.create("outsrc_upri_typ_nm", "outsrc_upri_typ_nm"),
				MCItemDef.create("sls_basis_typ_nm", "sls_basis_typ_nm"),
				MCItemDef.create("bill_basis_typ_nm", "bill_basis_typ_nm"),
				MCItemDef.create("ship_schd_split_typ_nm", "ship_schd_split_typ_nm"),
				MCItemDef.create("xfr_stk_mng_typ_nm", "xfr_stk_mng_typ_nm"),
				MCItemDef.create("xrate_rnd_typ_nm", "xrate_rnd_typ_nm"),
				MCItemDef.create("setoff_tax_rnd_typ_nm", "setoff_tax_rnd_typ_nm"),
				MCItemDef.create("com_paid_tax_rnd_typ_nm", "com_paid_tax_rnd_typ_nm"),
				MCItemDef.create("wtax_rnd_typ_nm", "wtax_rnd_typ_nm"),
				MCItemDef.create("stk_amt_rnd_typ_nm", "stk_amt_rnd_typ_nm"),
				MCItemDef.create("sls_bdj_rnd_typ_nm", "sls_bdj_rnd_typ_nm"),
				MCItemDef.create("po_print_nm", "po_print_nm"),
				MCItemDef.create("gm_std_upri_typ_nm", "gm_std_upri_typ_nm"),
				MCItemDef.create("stk_std_upri_typ_nm", "stk_std_upri_typ_nm"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MA_MABCL0020_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("sls_tax_cd", "sls_tax_cd"),
				MCItemDef.create("sls_tax_nm", "sls_tax_nm"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_nm", "purc_tax_nm"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("prov_tax_nm", "prov_tax_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_RsltSub")
		);
	}
	public static MCContainerDef MA_MABCL0020_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MABCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("co_alt_nm1", "co_alt_nm1"),
				MCItemDef.create("co_alt_nm2", "co_alt_nm2"),
				MCItemDef.create("co_alt_nm3", "co_alt_nm3"),
				MCItemDef.create("co_alt_nm4", "co_alt_nm4"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("co_repl_nm", "co_repl_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_RsltLcl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0020_Upd01_INFO = new MCOperationInfo("MA", "MABCL0020", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0020_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("co_alt_nm1", "co_alt_nm1"),
				MCItemDef.create("co_alt_nm2", "co_alt_nm2"),
				MCItemDef.create("co_alt_nm3", "co_alt_nm3"),
				MCItemDef.create("co_alt_nm4", "co_alt_nm4"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("co_repl_nm", "co_repl_nm"),
				MCItemDef.create("ein", "ein"),
				MCItemDef.create("biz_co_no", "biz_co_no"),
				MCItemDef.create("std_co_cd", "std_co_cd"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("st_mon", "st_mon"),
				MCItemDef.create("dt_switch_time", "dt_switch_time"),
				MCItemDef.create("ac_cl_day", "ac_cl_day"),
				MCItemDef.create("ac_cl_mon_base", "ac_cl_mon_base"),
				MCItemDef.create("std_cal_cd", "std_cal_cd"),
				MCItemDef.create("bill_cl_cal_cd", "bill_cl_cal_cd"),
				MCItemDef.create("ar_no_use_flg", "ar_no_use_flg"),
				MCItemDef.create("ap_no_use_flg", "ap_no_use_flg"),
				MCItemDef.create("temp_ap_use_flg", "temp_ap_use_flg"),
				MCItemDef.create("sls_cl_flg", "sls_cl_flg"),
				MCItemDef.create("rcv_cl_flg", "rcv_cl_flg"),
				MCItemDef.create("purc_cl_flg", "purc_cl_flg"),
				MCItemDef.create("pay_cl_flg", "pay_cl_flg"),
				MCItemDef.create("stk_cl_cal_cd", "stk_cl_cal_cd"),
				MCItemDef.create("sls_cl_cal_cd", "sls_cl_cal_cd"),
				MCItemDef.create("rcv_cl_cal_cd", "rcv_cl_cal_cd"),
				MCItemDef.create("purc_cl_cal_cd", "purc_cl_cal_cd"),
				MCItemDef.create("pay_cl_cal_cd", "pay_cl_cal_cd"),
				MCItemDef.create("pay_schd_cl_cal_cd", "pay_schd_cl_cal_cd"),
				MCItemDef.create("stk_cl_delay_days", "stk_cl_delay_days"),
				MCItemDef.create("stk_cl_ba_typ", "stk_cl_ba_typ"),
				MCItemDef.create("sls_cl_delay_days", "sls_cl_delay_days"),
				MCItemDef.create("sls_cl_ba_typ", "sls_cl_ba_typ"),
				MCItemDef.create("rcv_cl_delay_days", "rcv_cl_delay_days"),
				MCItemDef.create("rcv_cl_ba_typ", "rcv_cl_ba_typ"),
				MCItemDef.create("purc_cl_delay_days", "purc_cl_delay_days"),
				MCItemDef.create("purc_cl_ba_typ", "purc_cl_ba_typ"),
				MCItemDef.create("pay_cl_delay_days", "pay_cl_delay_days"),
				MCItemDef.create("pay_cl_ba_typ", "pay_cl_ba_typ"),
				MCItemDef.create("sls_xrate_cd", "sls_xrate_cd"),
				MCItemDef.create("purc_xrate_cd", "purc_xrate_cd"),
				MCItemDef.create("prov_xrate_cd", "prov_xrate_cd"),
				MCItemDef.create("bill_xrate_conv_flg", "bill_xrate_conv_flg"),
				MCItemDef.create("bill_xrate_cd", "bill_xrate_cd"),
				MCItemDef.create("pay_xrate_conv_flg", "pay_xrate_conv_flg"),
				MCItemDef.create("pay_xrate_cd", "pay_xrate_cd"),
				MCItemDef.create("mon01_xrate_rev_flg", "mon01_xrate_rev_flg"),
				MCItemDef.create("mon02_xrate_rev_flg", "mon02_xrate_rev_flg"),
				MCItemDef.create("mon03_xrate_rev_flg", "mon03_xrate_rev_flg"),
				MCItemDef.create("mon04_xrate_rev_flg", "mon04_xrate_rev_flg"),
				MCItemDef.create("mon05_xrate_rev_flg", "mon05_xrate_rev_flg"),
				MCItemDef.create("mon06_xrate_rev_flg", "mon06_xrate_rev_flg"),
				MCItemDef.create("mon07_xrate_rev_flg", "mon07_xrate_rev_flg"),
				MCItemDef.create("mon08_xrate_rev_flg", "mon08_xrate_rev_flg"),
				MCItemDef.create("mon09_xrate_rev_flg", "mon09_xrate_rev_flg"),
				MCItemDef.create("mon10_xrate_rev_flg", "mon10_xrate_rev_flg"),
				MCItemDef.create("mon11_xrate_rev_flg", "mon11_xrate_rev_flg"),
				MCItemDef.create("mon12_xrate_rev_flg", "mon12_xrate_rev_flg"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("bill_basis_typ", "bill_basis_typ"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("xfr_stk_mng_typ", "xfr_stk_mng_typ"),
				MCItemDef.create("setoff_tax_rnd_typ", "setoff_tax_rnd_typ"),
				MCItemDef.create("xrate_rnd_typ", "xrate_rnd_typ"),
				MCItemDef.create("com_paid_tax_rnd_typ", "com_paid_tax_rnd_typ"),
				MCItemDef.create("wtax_rnd_typ", "wtax_rnd_typ"),
				MCItemDef.create("stk_amt_rnd_typ", "stk_amt_rnd_typ"),
				MCItemDef.create("stk_amt_dec_place", "stk_amt_dec_place"),
				MCItemDef.create("sls_bdj_rnd_typ", "sls_bdj_rnd_typ"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("stk_lst_cnf_num", "stk_lst_cnf_num"),
				MCItemDef.create("stk_lst_limit_num", "stk_lst_limit_num"),
				MCItemDef.create("gm_std_upri_typ", "gm_std_upri_typ"),
				MCItemDef.create("stk_std_upri_typ", "stk_std_upri_typ"),
				MCItemDef.create("early_ship_dt_add_days", "early_ship_dt_add_days"),
				MCItemDef.create("ac_slip_digit", "ac_slip_digit"),
				MCItemDef.create("ac_slip_seq_flg", "ac_slip_seq_flg"),
				MCItemDef.create("rpt_strg_ext_sys_cd", "rpt_strg_ext_sys_cd"),
				MCItemDef.create("cst_prnt_typ", "cst_prnt_typ"),
				MCItemDef.create("acst_prnt_typ", "acst_prnt_typ"),
				MCItemDef.create("bcst_prnt_typ", "bcst_prnt_typ"),
				MCItemDef.create("rcst_prnt_typ", "rcst_prnt_typ"),
				MCItemDef.create("dlv_prnt_typ", "dlv_prnt_typ"),
				MCItemDef.create("sppl_prnt_typ", "sppl_prnt_typ"),
				MCItemDef.create("asppl_prnt_typ", "asppl_prnt_typ"),
				MCItemDef.create("bsppl_prnt_typ", "bsppl_prnt_typ"),
				MCItemDef.create("psppl_prnt_typ", "psppl_prnt_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0020_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("sls_tax_cd", "sls_tax_cd"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_DtlSub")
		);
	}

	public static MCContainerDef MA_MABCL0020_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MABCL0020", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("co_alt_nm1", "co_alt_nm1"),
				MCItemDef.create("co_alt_nm2", "co_alt_nm2"),
				MCItemDef.create("co_alt_nm3", "co_alt_nm3"),
				MCItemDef.create("co_alt_nm4", "co_alt_nm4"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("co_repl_nm", "co_repl_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_DtlLcl")
		);
	}


	//FMCB DEF_CLASSES END
}

