package mcframe.serverMSBB.MSBBL6210;

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
 * [MSBBL_SlsRetService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL6210.SlsRet_Chk01.UP.BLOCK0")){
			return MS_MSBBL6210_SlsRet_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6210.SlsRet_Upd01.UP.BLOCK0")){
			return MS_MSBBL6210_SlsRet_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6210.SlsRet_Upd01.UP.BLOCK1")){
			return MS_MSBBL6210_SlsRet_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6210.SlsRet_Upd01.UP.BLOCK2")){
			return MS_MSBBL6210_SlsRet_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL6210.SlsRet_Upd01.DOWN.BLOCK0")){
			return MS_MSBBL6210_SlsRet_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6210.SlsRet_Upd02.UP.BLOCK0")){
			return MS_MSBBL6210_SlsRet_Upd02_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBBL6210_SlsRet_Chk01_INFO = new MCOperationInfo("MS", "MSBBL6210", "SlsRet_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6210_SlsRet_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6210", "SlsRet_Chk01",
			new MCItemDef[]{
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no")
			}
			,
			MCBlockDef.create("SlsRet_Chk01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6210_SlsRet_Upd01_INFO = new MCOperationInfo("MS", "MSBBL6210", "SlsRet_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6210_SlsRet_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6210", "SlsRet_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ret_dt", "ret_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("amt_calc_flg", "amt_calc_flg")
			}
			,
			MCBlockDef.create("SlsRet_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL6210_SlsRet_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6210", "SlsRet_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("sls_act_d_seq", "sls_act_d_seq"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("purc_ddlv_po_no", "purc_ddlv_po_no"),
				MCItemDef.create("purc_ddlv_po_d_no", "purc_ddlv_po_d_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("ret_bp_cd", "ret_bp_cd"),
				MCItemDef.create("ret_bp_nm", "ret_bp_nm"),
				MCItemDef.create("ret_bp_cntct_dpt", "ret_bp_cntct_dpt"),
				MCItemDef.create("ret_bp_cntct_psn", "ret_bp_cntct_psn"),
				MCItemDef.create("ret_bp_zip_cd", "ret_bp_zip_cd"),
				MCItemDef.create("ret_bp_addr1", "ret_bp_addr1"),
				MCItemDef.create("ret_bp_addr2", "ret_bp_addr2"),
				MCItemDef.create("ret_bp_addr3", "ret_bp_addr3"),
				MCItemDef.create("ret_bp_addr4", "ret_bp_addr4"),
				MCItemDef.create("ret_bp_tel", "ret_bp_tel"),
				MCItemDef.create("ret_bp_fax", "ret_bp_fax"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ref_sls_act_no", "ref_sls_act_no"),
				MCItemDef.create("ref_sls_act_seq", "ref_sls_act_seq"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("ref_sls_act_d_seq", "ref_sls_act_d_seq"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("abort_qty", "abort_qty"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("scrn_trd_cur_amt", "scrn_trd_cur_amt"),
				MCItemDef.create("scrn_trd_cur_tax_amt", "scrn_trd_cur_tax_amt")
			}
			,
			MCBlockDef.create("SlsRet_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL6210_SlsRet_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL6210", "SlsRet_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("io_peg_no", "io_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("sls_act_io_seq", "sls_act_io_seq"),
				MCItemDef.create("sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("purc_act_io_no", "purc_act_io_no"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("SlsRet_Upd01_Io")
		);
	}


	public static MCContainerDef MS_MSBBL6210_SlsRet_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6210", "SlsRet_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("iv_no", "iv_no")
			}
			,
			MCBlockDef.create("SlsRet_Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6210_SlsRet_Upd02_INFO = new MCOperationInfo("MS", "MSBBL6210", "SlsRet_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6210_SlsRet_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6210", "SlsRet_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("SlsRet_Upd02_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

