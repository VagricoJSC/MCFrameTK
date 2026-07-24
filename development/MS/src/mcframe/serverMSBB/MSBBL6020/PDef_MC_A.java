package mcframe.serverMSBB.MSBBL6020;

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
 * [MSBBL_SloRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL6020.Slo_Chk01.UP.BLOCK0")){
			return MS_MSBBL6020_Slo_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk01.UP.BLOCK1")){
			return MS_MSBBL6020_Slo_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk01.UP.BLOCK2")){
			return MS_MSBBL6020_Slo_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk01.UP.BLOCK3")){
			return MS_MSBBL6020_Slo_Chk01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk01.DOWN.BLOCK0")){
			return MS_MSBBL6020_Slo_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk01.DOWN.BLOCK1")){
			return MS_MSBBL6020_Slo_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk01.DOWN.BLOCK2")){
			return MS_MSBBL6020_Slo_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk01.DOWN.BLOCK3")){
			return MS_MSBBL6020_Slo_Chk01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk02.UP.BLOCK0")){
			return MS_MSBBL6020_Slo_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk02.DOWN.BLOCK0")){
			return MS_MSBBL6020_Slo_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk03.UP.BLOCK0")){
			return MS_MSBBL6020_Slo_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk03.UP.BLOCK1")){
			return MS_MSBBL6020_Slo_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk03.DOWN.BLOCK0")){
			return MS_MSBBL6020_Slo_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk03.DOWN.BLOCK1")){
			return MS_MSBBL6020_Slo_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk04.UP.BLOCK0")){
			return MS_MSBBL6020_Slo_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Chk04.DOWN.BLOCK0")){
			return MS_MSBBL6020_Slo_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Ins01.UP.BLOCK0")){
			return MS_MSBBL6020_Slo_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Ins01.UP.BLOCK1")){
			return MS_MSBBL6020_Slo_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Ins01.UP.BLOCK2")){
			return MS_MSBBL6020_Slo_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Ins01.UP.BLOCK3")){
			return MS_MSBBL6020_Slo_Ins01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Ins01.UP.BLOCK4")){
			return MS_MSBBL6020_Slo_Ins01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Ins01.DOWN.BLOCK0")){
			return MS_MSBBL6020_Slo_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Ins01.DOWN.BLOCK1")){
			return MS_MSBBL6020_Slo_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Upd01.UP.BLOCK0")){
			return MS_MSBBL6020_Slo_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Upd01.UP.BLOCK1")){
			return MS_MSBBL6020_Slo_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Upd01.UP.BLOCK2")){
			return MS_MSBBL6020_Slo_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Upd01.UP.BLOCK3")){
			return MS_MSBBL6020_Slo_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Upd01.DOWN.BLOCK0")){
			return MS_MSBBL6020_Slo_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Upd01.DOWN.BLOCK1")){
			return MS_MSBBL6020_Slo_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Upd02.UP.BLOCK0")){
			return MS_MSBBL6020_Slo_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Del01.UP.BLOCK0")){
			return MS_MSBBL6020_Slo_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_Del01.UP.BLOCK1")){
			return MS_MSBBL6020_Slo_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6020.Slo_RevUpd01.UP.BLOCK0")){
			return MS_MSBBL6020_Slo_RevUpd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_BulkImp_Chk01.UP.BLOCK0")){
			return MS_MSBBL6020_Slo_BulkImp_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_BulkImp_Chk01.DOWN.BLOCK0")){
			return MS_MSBBL6020_Slo_BulkImp_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_BulkImp_Chk02.UP.BLOCK0")){
			return MS_MSBBL6020_Slo_BulkImp_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_BulkImp_Chk02.DOWN.BLOCK0")){
			return MS_MSBBL6020_Slo_BulkImp_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_BulkImp_Ins01.UP.BLOCK0")){
			return MS_MSBBL6020_Slo_BulkImp_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_BulkImp_Ins01.DOWN.BLOCK0")){
			return MS_MSBBL6020_Slo_BulkImp_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6020.Slo_BulkImp_Del01.UP.BLOCK0")){
			return MS_MSBBL6020_Slo_BulkImp_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
													
	
	static final MCOperationInfo MS_MSBBL6020_Slo_Chk01_INFO = new MCOperationInfo("MS", "MSBBL6020", "Slo_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6020_Slo_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("slo_typ", "slo_typ"),
				MCItemDef.create("aprv_back_flg", "aprv_back_flg"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_schd_dt", "via_schd_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_num_flg", "iv_num_flg"),
				MCItemDef.create("adv_ship_ctrl_typ", "adv_ship_ctrl_typ"),
				MCItemDef.create("adv_bill_amt", "adv_bill_amt"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_rev", "cst_po_rev"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("cst_po_rmrks", "cst_po_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("slo_upd_cntr", "slo_upd_cntr"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1")
			}
			,
			MCBlockDef.create("Slo_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL6020_Slo_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("iv_upri", "iv_upri"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno_num_flg", "sno_num_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("ship_rqst_tm", "ship_rqst_tm"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
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
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("proc_typ", "proc_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("rqst_to_loc_cd", "rqst_to_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("wg_rqst_cnt_rmrks", "wg_rqst_cnt_rmrks"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("cst_po_d_rmrks", "cst_po_d_rmrks"),
				MCItemDef.create("sls_rsn_cd", "sls_rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("slo_d_can_rmkrs", "slo_d_can_rmkrs"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("sls_itm_no", "sls_itm_no"),
				MCItemDef.create("sls_itm_spec_no", "sls_itm_spec_no"),
				MCItemDef.create("itm_comp_rev_no", "itm_comp_rev_no"),
				MCItemDef.create("comp_base_qty", "comp_base_qty"),
				MCItemDef.create("comp_rel_flg", "comp_rel_flg"),
				MCItemDef.create("no_itm_cd_flg", "no_itm_cd_flg"),
				MCItemDef.create("new_comp_flg", "new_comp_flg"),
				MCItemDef.create("upd_comp_flg", "upd_comp_flg"),
				MCItemDef.create("rev_comp_flg", "rev_comp_flg"),
				MCItemDef.create("new_spec_flg", "new_spec_flg"),
				MCItemDef.create("upd_spec_flg", "upd_spec_flg"),
				MCItemDef.create("org_ship_block_flg", "org_ship_block_flg"),
				MCItemDef.create("has_spec_flg", "has_spec_flg"),
				MCItemDef.create("spec_rmrks", "spec_rmrks"),
				MCItemDef.create("spec_sub_char1", "spec_sub_char1"),
				MCItemDef.create("spec_sub_char2", "spec_sub_char2"),
				MCItemDef.create("spec_sub_char3", "spec_sub_char3"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("rem_abort_qty", "rem_abort_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg")
			}
			,
			MCBlockDef.create("Slo_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL6020_Slo_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("slo_itm_comp_no", "slo_itm_comp_no"),
				MCItemDef.create("sls_itm_no", "sls_itm_no"),
				MCItemDef.create("sls_itm_comp_no", "sls_itm_comp_no"),
				MCItemDef.create("slo_itm_comp_lno", "slo_itm_comp_lno"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("qtn_itm_comp_no", "qtn_itm_comp_no"),
				MCItemDef.create("core_itm_flg", "core_itm_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("std_cost", "std_cost"),
				MCItemDef.create("mst_flg", "mst_flg"),
				MCItemDef.create("std_comp_flg", "std_comp_flg"),
				MCItemDef.create("slo_comp_rmrks", "slo_comp_rmrks"),
				MCItemDef.create("slo_comp_sub_char1", "slo_comp_sub_char1"),
				MCItemDef.create("slo_comp_sub_char2", "slo_comp_sub_char2"),
				MCItemDef.create("slo_comp_sub_char3", "slo_comp_sub_char3"),
				MCItemDef.create("qtn_comp_rmrks", "qtn_comp_rmrks"),
				MCItemDef.create("qtn_comp_sub_char1", "qtn_comp_sub_char1"),
				MCItemDef.create("qtn_comp_sub_char2", "qtn_comp_sub_char2"),
				MCItemDef.create("qtn_comp_sub_char3", "qtn_comp_sub_char3"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("Slo_Upd01_DtlComp")
		);
	}

	public static MCContainerDef MS_MSBBL6020_Slo_Chk01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("spec_desc_no", "spec_desc_no"),
				MCItemDef.create("sls_itm_spec_no", "sls_itm_spec_no"),
				MCItemDef.create("sls_itm_no", "sls_itm_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_itm_spec_lno", "slo_itm_spec_lno"),
				MCItemDef.create("slo_itm_comp_lno", "slo_itm_comp_lno"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("spec_cd", "spec_cd"),
				MCItemDef.create("spec_desc_cd", "spec_desc_cd"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("comp_spec_desc_no", "comp_spec_desc_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("Slo_Upd01_DtlSpec")
		);
	}


	public static MCContainerDef MS_MSBBL6020_Slo_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("slo_typ", "slo_typ"),
				MCItemDef.create("aprv_back_flg", "aprv_back_flg"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_aprv_flg", "qtn_aprv_flg"),
				MCItemDef.create("qtn_aprv_no", "qtn_aprv_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_schd_dt", "via_schd_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_num_flg", "iv_num_flg"),
				MCItemDef.create("adv_ship_ctrl_typ", "adv_ship_ctrl_typ"),
				MCItemDef.create("adv_bill_amt", "adv_bill_amt"),
				MCItemDef.create("adv_rcv_amt", "adv_rcv_amt"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_rev", "cst_po_rev"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("cst_po_rmrks", "cst_po_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("old_aprv_flg", "old_aprv_flg"),
				MCItemDef.create("old_aprv_no", "old_aprv_no"),
				MCItemDef.create("old_aprv_sts_typ", "old_aprv_sts_typ"),
				MCItemDef.create("old_can_upd_flg", "old_can_upd_flg"),
				MCItemDef.create("old_can_del_flg", "old_can_del_flg"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Slo_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL6020_Slo_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("iv_upri", "iv_upri"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno_num_flg", "sno_num_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1_num_typ", "sno1_num_typ"),
				MCItemDef.create("sno2_num_typ", "sno2_num_typ"),
				MCItemDef.create("sno3_num_typ", "sno3_num_typ"),
				MCItemDef.create("sno4_num_typ", "sno4_num_typ"),
				MCItemDef.create("sno1_ptn_cd", "sno1_ptn_cd"),
				MCItemDef.create("sno2_ptn_cd", "sno2_ptn_cd"),
				MCItemDef.create("sno3_ptn_cd", "sno3_ptn_cd"),
				MCItemDef.create("sno4_ptn_cd", "sno4_ptn_cd"),
				MCItemDef.create("slo_sno1_flg", "slo_sno1_flg"),
				MCItemDef.create("slo_sno2_flg", "slo_sno2_flg"),
				MCItemDef.create("slo_sno3_flg", "slo_sno3_flg"),
				MCItemDef.create("slo_sno4_flg", "slo_sno4_flg"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("ship_rqst_tm", "ship_rqst_tm"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
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
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("proc_typ", "proc_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("rqst_to_loc_cd", "rqst_to_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_dt", "rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("rqst_qty", "rqst_qty"),
				MCItemDef.create("rqst_unit_cd", "rqst_unit_cd"),
				MCItemDef.create("wg_rqst_cnt_rmrks", "wg_rqst_cnt_rmrks"),
				MCItemDef.create("rqst_to_wg_cd", "rqst_to_wg_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("def_loc_cd", "def_loc_cd"),
				MCItemDef.create("def_str_ln_cd", "def_str_ln_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("cst_po_d_rmrks", "cst_po_d_rmrks"),
				MCItemDef.create("sls_rsn_cd", "sls_rsn_cd"),
				MCItemDef.create("sls_acxfr_flg", "sls_acxfr_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("slo_d_can_rmkrs", "slo_d_can_rmkrs"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_rev", "slo_rev"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("sls_itm_no", "sls_itm_no"),
				MCItemDef.create("sls_itm_spec_no", "sls_itm_spec_no"),
				MCItemDef.create("itm_comp_rev_no", "itm_comp_rev_no"),
				MCItemDef.create("comp_base_qty", "comp_base_qty"),
				MCItemDef.create("comp_rel_flg", "comp_rel_flg"),
				MCItemDef.create("no_itm_cd_flg", "no_itm_cd_flg"),
				MCItemDef.create("new_comp_flg", "new_comp_flg"),
				MCItemDef.create("upd_comp_flg", "upd_comp_flg"),
				MCItemDef.create("rev_comp_flg", "rev_comp_flg"),
				MCItemDef.create("new_spec_flg", "new_spec_flg"),
				MCItemDef.create("upd_spec_flg", "upd_spec_flg"),
				MCItemDef.create("sls_itm_seq_flg", "sls_itm_seq_flg"),
				MCItemDef.create("spec_seq_flg", "spec_seq_flg"),
				MCItemDef.create("org_ship_block_flg", "org_ship_block_flg"),
				MCItemDef.create("has_spec_flg", "has_spec_flg"),
				MCItemDef.create("spec_rmrks", "spec_rmrks"),
				MCItemDef.create("spec_sub_char1", "spec_sub_char1"),
				MCItemDef.create("spec_sub_char2", "spec_sub_char2"),
				MCItemDef.create("spec_sub_char3", "spec_sub_char3"),
				MCItemDef.create("itm_ship_grp_cd", "itm_ship_grp_cd"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("Slo_Upd01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBBL6020_Slo_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("slo_itm_comp_no", "slo_itm_comp_no"),
				MCItemDef.create("sls_itm_no", "sls_itm_no"),
				MCItemDef.create("sls_itm_comp_no", "sls_itm_comp_no"),
				MCItemDef.create("slo_itm_comp_lno", "slo_itm_comp_lno"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("qtn_itm_comp_no", "qtn_itm_comp_no"),
				MCItemDef.create("core_itm_flg", "core_itm_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("std_cost", "std_cost"),
				MCItemDef.create("mst_flg", "mst_flg"),
				MCItemDef.create("std_comp_flg", "std_comp_flg"),
				MCItemDef.create("slo_comp_rmrks", "slo_comp_rmrks"),
				MCItemDef.create("slo_comp_sub_char1", "slo_comp_sub_char1"),
				MCItemDef.create("slo_comp_sub_char2", "slo_comp_sub_char2"),
				MCItemDef.create("slo_comp_sub_char3", "slo_comp_sub_char3"),
				MCItemDef.create("qtn_comp_rmrks", "qtn_comp_rmrks"),
				MCItemDef.create("qtn_comp_sub_char1", "qtn_comp_sub_char1"),
				MCItemDef.create("qtn_comp_sub_char2", "qtn_comp_sub_char2"),
				MCItemDef.create("qtn_comp_sub_char3", "qtn_comp_sub_char3"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("Slo_Upd01_DtlComp")
		);
	}
	public static MCContainerDef MS_MSBBL6020_Slo_Chk01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("spec_desc_no", "spec_desc_no"),
				MCItemDef.create("sls_itm_spec_no", "sls_itm_spec_no"),
				MCItemDef.create("sls_itm_no", "sls_itm_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_itm_spec_lno", "slo_itm_spec_lno"),
				MCItemDef.create("slo_itm_comp_lno", "slo_itm_comp_lno"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("spec_cd", "spec_cd"),
				MCItemDef.create("spec_desc_cd", "spec_desc_cd"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("comp_spec_desc_no", "comp_spec_desc_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("Slo_Upd01_DtlSpec")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6020_Slo_Chk02_INFO = new MCOperationInfo("MS", "MSBBL6020", "Slo_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6020_Slo_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk02",
			new MCItemDef[]{
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Sls_Schd_Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL6020_Slo_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk02",
			new MCItemDef[]{
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Sls_Schd_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6020_Slo_Chk03_INFO = new MCOperationInfo("MS", "MSBBL6020", "Slo_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6020_Slo_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk03",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("can_rmrks", "can_rmrks"),
				MCItemDef.create("slo_upd_cntr", "slo_upd_cntr"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg")
			}
			,
			MCBlockDef.create("Slo_Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL6020_Slo_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk03",
			new MCItemDef[]{
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("recv_dt", "recv_dt")
			}
			,
			MCBlockDef.create("Slo_Del01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL6020_Slo_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk03",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("can_rmrks", "can_rmrks"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("slo_upd_cntr", "slo_upd_cntr"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("slo_rev", "slo_rev"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5")
			}
			,
			MCBlockDef.create("Slo_Del01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL6020_Slo_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk03",
			new MCItemDef[]{
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("recv_dt", "recv_dt")
			}
			,
			MCBlockDef.create("Slo_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6020_Slo_Chk04_INFO = new MCOperationInfo("MS", "MSBBL6020", "Slo_Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6020_Slo_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk04",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("adv_rcv_amt", "adv_rcv_amt"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Slo_Upd02_Slo")
		);
	}


	public static MCContainerDef MS_MSBBL6020_Slo_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Chk04",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("adv_rcv_amt", "adv_rcv_amt"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Slo_Upd02_Slo")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6020_Slo_Ins01_INFO = new MCOperationInfo("MS", "MSBBL6020", "Slo_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6020_Slo_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Ins01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("slo_typ", "slo_typ"),
				MCItemDef.create("aprv_back_flg", "aprv_back_flg"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_schd_dt", "via_schd_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_num_flg", "iv_num_flg"),
				MCItemDef.create("adv_ship_ctrl_typ", "adv_ship_ctrl_typ"),
				MCItemDef.create("adv_bill_amt", "adv_bill_amt"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_rev", "cst_po_rev"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("cst_po_rmrks", "cst_po_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1")
			}
			,
			MCBlockDef.create("Slo_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL6020_Slo_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Ins01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("iv_upri", "iv_upri"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno_num_flg", "sno_num_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1_num_typ", "sno1_num_typ"),
				MCItemDef.create("sno2_num_typ", "sno2_num_typ"),
				MCItemDef.create("sno3_num_typ", "sno3_num_typ"),
				MCItemDef.create("sno4_num_typ", "sno4_num_typ"),
				MCItemDef.create("sno1_ptn_cd", "sno1_ptn_cd"),
				MCItemDef.create("sno2_ptn_cd", "sno2_ptn_cd"),
				MCItemDef.create("sno3_ptn_cd", "sno3_ptn_cd"),
				MCItemDef.create("sno4_ptn_cd", "sno4_ptn_cd"),
				MCItemDef.create("slo_sno1_flg", "slo_sno1_flg"),
				MCItemDef.create("slo_sno2_flg", "slo_sno2_flg"),
				MCItemDef.create("slo_sno3_flg", "slo_sno3_flg"),
				MCItemDef.create("slo_sno4_flg", "slo_sno4_flg"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("ship_rqst_tm", "ship_rqst_tm"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
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
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("proc_typ", "proc_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("rqst_to_loc_cd", "rqst_to_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("wg_rqst_cnt_rmrks", "wg_rqst_cnt_rmrks"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("def_loc_cd", "def_loc_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("cst_po_d_rmrks", "cst_po_d_rmrks"),
				MCItemDef.create("sls_rsn_cd", "sls_rsn_cd"),
				MCItemDef.create("sls_acxfr_flg", "sls_acxfr_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("itm_comp_rev_no", "itm_comp_rev_no"),
				MCItemDef.create("comp_base_qty", "comp_base_qty"),
				MCItemDef.create("comp_rel_flg", "comp_rel_flg"),
				MCItemDef.create("no_itm_cd_flg", "no_itm_cd_flg"),
				MCItemDef.create("new_comp_flg", "new_comp_flg"),
				MCItemDef.create("upd_comp_flg", "upd_comp_flg"),
				MCItemDef.create("rev_comp_flg", "rev_comp_flg"),
				MCItemDef.create("new_spec_flg", "new_spec_flg"),
				MCItemDef.create("upd_spec_flg", "upd_spec_flg"),
				MCItemDef.create("org_ship_block_flg", "org_ship_block_flg"),
				MCItemDef.create("has_spec_flg", "has_spec_flg"),
				MCItemDef.create("spec_rmrks", "spec_rmrks"),
				MCItemDef.create("spec_sub_char1", "spec_sub_char1"),
				MCItemDef.create("spec_sub_char2", "spec_sub_char2"),
				MCItemDef.create("spec_sub_char3", "spec_sub_char3"),
				MCItemDef.create("itm_ship_grp_cd", "itm_ship_grp_cd"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("recv_dt", "recv_dt")
			}
			,
			MCBlockDef.create("Slo_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL6020_Slo_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Ins01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("slo_itm_comp_lno", "slo_itm_comp_lno"),
				MCItemDef.create("core_itm_flg", "core_itm_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("std_cost", "std_cost"),
				MCItemDef.create("mst_flg", "mst_flg"),
				MCItemDef.create("std_comp_flg", "std_comp_flg"),
				MCItemDef.create("slo_comp_rmrks", "slo_comp_rmrks"),
				MCItemDef.create("slo_comp_sub_char1", "slo_comp_sub_char1"),
				MCItemDef.create("slo_comp_sub_char2", "slo_comp_sub_char2"),
				MCItemDef.create("slo_comp_sub_char3", "slo_comp_sub_char3"),
				MCItemDef.create("qtn_comp_rmrks", "qtn_comp_rmrks"),
				MCItemDef.create("qtn_comp_sub_char1", "qtn_comp_sub_char1"),
				MCItemDef.create("qtn_comp_sub_char2", "qtn_comp_sub_char2"),
				MCItemDef.create("qtn_comp_sub_char3", "qtn_comp_sub_char3"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("Slo_Upd01_DtlComp")
		);
	}

	public static MCContainerDef MS_MSBBL6020_Slo_Ins01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Ins01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("slo_itm_spec_lno", "slo_itm_spec_lno"),
				MCItemDef.create("slo_itm_comp_lno", "slo_itm_comp_lno"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("spec_cd", "spec_cd"),
				MCItemDef.create("spec_desc_cd", "spec_desc_cd"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("comp_spec_desc_no", "comp_spec_desc_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("Slo_Upd01_DtlSpec")
		);
	}

	public static MCContainerDef MS_MSBBL6020_Slo_Ins01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Ins01",
			new MCItemDef[]{
				MCItemDef.create("commit_by_slo_flg", "commit_by_slo_flg")
			}
			,
			MCBlockDef.create("Slo_Upd01_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBBL6020_Slo_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Ins01",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_rev", "slo_rev"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("aprv_upd_flg", "aprv_upd_flg"),
				MCItemDef.create("aprv_can_flg", "aprv_can_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5")
			}
			,
			MCBlockDef.create("Slo_Ins01_Rslt_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL6020_Slo_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Ins01",
			new MCItemDef[]{
				MCItemDef.create("sls_sts_typ", "sls_sts_typ"),
				MCItemDef.create("sls_sts_typ_nm", "sls_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("ship_schd_split_flg", "ship_schd_split_flg"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("ship_schd_hm", "ship_schd_hm"),
				MCItemDef.create("dlv_schd_dt", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_hm", "dlv_schd_hm"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("alloc_scope_typ_nm", "alloc_scope_typ_nm"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("alloc_typ_nm", "alloc_typ_nm"),
				MCItemDef.create("rqst_to_loc_cd", "rqst_to_loc_cd"),
				MCItemDef.create("rqst_to_loc_nm", "rqst_to_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_dt", "rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("def_loc_cd", "def_loc_cd"),
				MCItemDef.create("def_loc_nm", "def_loc_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("alloc_qty", "alloc_qty"),
				MCItemDef.create("wait_qty", "wait_qty"),
				MCItemDef.create("abort_qty", "abort_qty"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("recv_dt", "recv_dt")
			}
			,
			MCBlockDef.create("Slo_Ins01_Rslt_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6020_Slo_Upd01_INFO = new MCOperationInfo("MS", "MSBBL6020", "Slo_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6020_Slo_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_rev", "slo_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("slo_typ", "slo_typ"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_back_flg", "aprv_back_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("can_upd_flg", "can_upd_flg"),
				MCItemDef.create("can_del_flg", "can_del_flg"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_schd_dt", "via_schd_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_num_flg", "iv_num_flg"),
				MCItemDef.create("adv_ship_ctrl_typ", "adv_ship_ctrl_typ"),
				MCItemDef.create("adv_bill_amt", "adv_bill_amt"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_rev", "cst_po_rev"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("cst_po_rmrks", "cst_po_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("old_aprv_flg", "old_aprv_flg"),
				MCItemDef.create("old_aprv_no", "old_aprv_no"),
				MCItemDef.create("old_aprv_sts_typ", "old_aprv_sts_typ"),
				MCItemDef.create("old_can_upd_flg", "old_can_upd_flg"),
				MCItemDef.create("old_can_del_flg", "old_can_del_flg"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1")
			}
			,
			MCBlockDef.create("Slo_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL6020_Slo_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("iv_upri", "iv_upri"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno_num_flg", "sno_num_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1_num_typ", "sno1_num_typ"),
				MCItemDef.create("sno2_num_typ", "sno2_num_typ"),
				MCItemDef.create("sno3_num_typ", "sno3_num_typ"),
				MCItemDef.create("sno4_num_typ", "sno4_num_typ"),
				MCItemDef.create("sno1_ptn_cd", "sno1_ptn_cd"),
				MCItemDef.create("sno2_ptn_cd", "sno2_ptn_cd"),
				MCItemDef.create("sno3_ptn_cd", "sno3_ptn_cd"),
				MCItemDef.create("sno4_ptn_cd", "sno4_ptn_cd"),
				MCItemDef.create("slo_sno1_flg", "slo_sno1_flg"),
				MCItemDef.create("slo_sno2_flg", "slo_sno2_flg"),
				MCItemDef.create("slo_sno3_flg", "slo_sno3_flg"),
				MCItemDef.create("slo_sno4_flg", "slo_sno4_flg"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("ship_rqst_tm", "ship_rqst_tm"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
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
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("proc_typ", "proc_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("rqst_to_loc_cd", "rqst_to_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_dt", "rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("rqst_qty", "rqst_qty"),
				MCItemDef.create("rqst_unit_cd", "rqst_unit_cd"),
				MCItemDef.create("wg_rqst_cnt_rmrks", "wg_rqst_cnt_rmrks"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("def_loc_cd", "def_loc_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("cst_po_d_rmrks", "cst_po_d_rmrks"),
				MCItemDef.create("sls_rsn_cd", "sls_rsn_cd"),
				MCItemDef.create("sls_acxfr_flg", "sls_acxfr_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("slo_d_can_rmkrs", "slo_d_can_rmkrs"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_rev", "slo_rev"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("sls_itm_no", "sls_itm_no"),
				MCItemDef.create("sls_itm_spec_no", "sls_itm_spec_no"),
				MCItemDef.create("itm_comp_rev_no", "itm_comp_rev_no"),
				MCItemDef.create("comp_base_qty", "comp_base_qty"),
				MCItemDef.create("comp_rel_flg", "comp_rel_flg"),
				MCItemDef.create("no_itm_cd_flg", "no_itm_cd_flg"),
				MCItemDef.create("new_comp_flg", "new_comp_flg"),
				MCItemDef.create("upd_comp_flg", "upd_comp_flg"),
				MCItemDef.create("rev_comp_flg", "rev_comp_flg"),
				MCItemDef.create("new_spec_flg", "new_spec_flg"),
				MCItemDef.create("upd_spec_flg", "upd_spec_flg"),
				MCItemDef.create("org_ship_block_flg", "org_ship_block_flg"),
				MCItemDef.create("has_spec_flg", "has_spec_flg"),
				MCItemDef.create("spec_rmrks", "spec_rmrks"),
				MCItemDef.create("spec_sub_char1", "spec_sub_char1"),
				MCItemDef.create("spec_sub_char2", "spec_sub_char2"),
				MCItemDef.create("spec_sub_char3", "spec_sub_char3"),
				MCItemDef.create("itm_ship_grp_cd", "itm_ship_grp_cd"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("rem_abort_qty", "rem_abort_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("recv_dt", "recv_dt")
			}
			,
			MCBlockDef.create("Slo_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL6020_Slo_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("slo_itm_comp_no", "slo_itm_comp_no"),
				MCItemDef.create("sls_itm_no", "sls_itm_no"),
				MCItemDef.create("sls_itm_comp_no", "sls_itm_comp_no"),
				MCItemDef.create("slo_itm_comp_lno", "slo_itm_comp_lno"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("qtn_itm_comp_no", "qtn_itm_comp_no"),
				MCItemDef.create("core_itm_flg", "core_itm_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("std_cost", "std_cost"),
				MCItemDef.create("mst_flg", "mst_flg"),
				MCItemDef.create("std_comp_flg", "std_comp_flg"),
				MCItemDef.create("slo_comp_rmrks", "slo_comp_rmrks"),
				MCItemDef.create("slo_comp_sub_char1", "slo_comp_sub_char1"),
				MCItemDef.create("slo_comp_sub_char2", "slo_comp_sub_char2"),
				MCItemDef.create("slo_comp_sub_char3", "slo_comp_sub_char3"),
				MCItemDef.create("qtn_comp_rmrks", "qtn_comp_rmrks"),
				MCItemDef.create("qtn_comp_sub_char1", "qtn_comp_sub_char1"),
				MCItemDef.create("qtn_comp_sub_char2", "qtn_comp_sub_char2"),
				MCItemDef.create("qtn_comp_sub_char3", "qtn_comp_sub_char3"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("Slo_Upd01_DtlComp")
		);
	}

	public static MCContainerDef MS_MSBBL6020_Slo_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("spec_desc_no", "spec_desc_no"),
				MCItemDef.create("sls_itm_spec_no", "sls_itm_spec_no"),
				MCItemDef.create("sls_itm_no", "sls_itm_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_itm_spec_lno", "slo_itm_spec_lno"),
				MCItemDef.create("slo_itm_comp_lno", "slo_itm_comp_lno"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("spec_cd", "spec_cd"),
				MCItemDef.create("spec_desc_cd", "spec_desc_cd"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("comp_spec_desc_no", "comp_spec_desc_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("Slo_Upd01_DtlSpec")
		);
	}


	public static MCContainerDef MS_MSBBL6020_Slo_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Upd01",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_rev", "slo_rev"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("aprv_upd_flg", "aprv_upd_flg"),
				MCItemDef.create("aprv_can_flg", "aprv_can_flg"),
				MCItemDef.create("iv_no", "iv_no")
			}
			,
			MCBlockDef.create("Slo_Upd01_Rslt_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL6020_Slo_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Upd01",
			new MCItemDef[]{
				MCItemDef.create("sls_sts_typ", "sls_sts_typ"),
				MCItemDef.create("sls_sts_typ_nm", "sls_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("ship_schd_split_flg", "ship_schd_split_flg"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("ship_schd_hm", "ship_schd_hm"),
				MCItemDef.create("dlv_schd_dt", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_hm", "dlv_schd_hm"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("alloc_scope_typ_nm", "alloc_scope_typ_nm"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("alloc_typ_nm", "alloc_typ_nm"),
				MCItemDef.create("rqst_to_loc_cd", "rqst_to_loc_cd"),
				MCItemDef.create("rqst_to_loc_nm", "rqst_to_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_dt", "rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("def_loc_cd", "def_loc_cd"),
				MCItemDef.create("def_loc_nm", "def_loc_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("alloc_qty", "alloc_qty"),
				MCItemDef.create("wait_qty", "wait_qty"),
				MCItemDef.create("abort_qty", "abort_qty"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("Slo_Upd01_Rslt_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6020_Slo_Upd02_INFO = new MCOperationInfo("MS", "MSBBL6020", "Slo_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6020_Slo_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Upd02",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("adv_rcv_amt", "adv_rcv_amt"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Slo_Upd02_Slo")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6020_Slo_Del01_INFO = new MCOperationInfo("MS", "MSBBL6020", "Slo_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6020_Slo_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Del01",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("can_rmrks", "can_rmrks"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("slo_upd_cntr", "slo_upd_cntr"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Slo_Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL6020_Slo_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_Del01",
			new MCItemDef[]{
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Slo_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6020_Slo_RevUpd01_INFO = new MCOperationInfo("MS", "MSBBL6020", "Slo_RevUpd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6020_Slo_RevUpd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_RevUpd01",
			new MCItemDef[]{
				MCItemDef.create("rev_data_src_no", "rev_data_src_no"),
				MCItemDef.create("rev_no", "rev_no")
			}
			,
			MCBlockDef.create("Slo_RevUpd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6020_Slo_BulkImp_Chk01_INFO = new MCOperationInfo("MS", "MSBBL6020", "Slo_BulkImp_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6020_Slo_BulkImp_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_BulkImp_Chk01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("slo_typ", "slo_typ"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_schd_dt", "via_schd_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_num_flg", "iv_num_flg"),
				MCItemDef.create("adv_ship_ctrl_typ", "adv_ship_ctrl_typ"),
				MCItemDef.create("adv_bill_amt", "adv_bill_amt"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_rev", "cst_po_rev"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("cst_po_rmrks", "cst_po_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1"),
				MCItemDef.create("hdr_grp_no", "hdr_grp_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("iv_upri", "iv_upri"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno_num_flg", "sno_num_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("ship_rqst_dt", "ship_rqst_dt"),
				MCItemDef.create("ship_rqst_hm", "ship_rqst_hm"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("ship_schd_hm", "ship_schd_hm"),
				MCItemDef.create("dlv_schd_dt", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_hm", "dlv_schd_hm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
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
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("pri_prnt_typ", "pri_prnt_typ"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("proc_typ", "proc_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("rqst_to_loc_cd", "rqst_to_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("wg_rqst_cnt_rmrks", "wg_rqst_cnt_rmrks"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_po_d_rmrks", "cst_po_d_rmrks"),
				MCItemDef.create("sls_rsn_cd", "sls_rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("slo_d_intr_rmrks", "slo_d_intr_rmrks"),
				MCItemDef.create("slo_d_sub_char1", "slo_d_sub_char1"),
				MCItemDef.create("slo_d_sub_char2", "slo_d_sub_char2"),
				MCItemDef.create("slo_d_sub_char3", "slo_d_sub_char3"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1")
			}
			,
			MCBlockDef.create("Slo_BulkImp_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL6020_Slo_BulkImp_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_BulkImp_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("slo_typ", "slo_typ"),
				MCItemDef.create("slo_typ_nm", "slo_typ_nm"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_aprv_flg", "qtn_aprv_flg"),
				MCItemDef.create("qtn_aprv_no", "qtn_aprv_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("sls_basis_typ_nm", "sls_basis_typ_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("assort_typ_nm", "assort_typ_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("trnspt_nm", "trnspt_nm"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("load_port_nm", "load_port_nm"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("dschrg_port_nm", "dschrg_port_nm"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_port_nm", "via_port_nm"),
				MCItemDef.create("via_schd_dt", "via_schd_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_num_flg", "iv_num_flg"),
				MCItemDef.create("adv_ship_ctrl_typ", "adv_ship_ctrl_typ"),
				MCItemDef.create("adv_ship_ctrl_typ_nm", "adv_ship_ctrl_typ_nm"),
				MCItemDef.create("adv_bill_amt", "adv_bill_amt"),
				MCItemDef.create("adv_rcv_amt", "adv_rcv_amt"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_rev", "cst_po_rev"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("rcpt_usr_nm", "rcpt_usr_nm"),
				MCItemDef.create("cst_po_rmrks", "cst_po_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1"),
				MCItemDef.create("hdr_grp_no", "hdr_grp_no"),
				MCItemDef.create("hdr_err_flg", "hdr_err_flg"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("comp_spec_typ_nm", "comp_spec_typ_nm"),
				MCItemDef.create("itm_comp_rev_no", "itm_comp_rev_no"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("cost_amt", "cost_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("iv_upri", "iv_upri"),
				MCItemDef.create("iv_amt", "iv_amt"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("sno_num_flg", "sno_num_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1_num_typ", "sno1_num_typ"),
				MCItemDef.create("sno2_num_typ", "sno2_num_typ"),
				MCItemDef.create("sno3_num_typ", "sno3_num_typ"),
				MCItemDef.create("sno4_num_typ", "sno4_num_typ"),
				MCItemDef.create("sno1_ptn_cd", "sno1_ptn_cd"),
				MCItemDef.create("sno2_ptn_cd", "sno2_ptn_cd"),
				MCItemDef.create("sno3_ptn_cd", "sno3_ptn_cd"),
				MCItemDef.create("sno4_ptn_cd", "sno4_ptn_cd"),
				MCItemDef.create("slo_sno1_flg", "slo_sno1_flg"),
				MCItemDef.create("slo_sno2_flg", "slo_sno2_flg"),
				MCItemDef.create("slo_sno3_flg", "slo_sno3_flg"),
				MCItemDef.create("slo_sno4_flg", "slo_sno4_flg"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("ship_rqst_tm", "ship_rqst_tm"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("ship_abl_flg", "ship_abl_flg"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
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
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("dlv_lg_grp_nm", "dlv_lg_grp_nm"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("via_dlv_typ_nm", "via_dlv_typ_nm"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_cntry_cd", "tdlv_cntry_cd"),
				MCItemDef.create("tdlv_cntry_nm", "tdlv_cntry_nm"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("tdlv_lg_grp_nm", "tdlv_lg_grp_nm"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("dlv_day_week_typ_nm", "dlv_day_week_typ_nm"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("proc_typ", "proc_typ"),
				MCItemDef.create("proc_typ_nm", "proc_typ_nm"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_inst_typ_nm", "ship_inst_typ_nm"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("ship_schd_split_typ_nm", "ship_schd_split_typ_nm"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("alloc_scope_typ_nm", "alloc_scope_typ_nm"),
				MCItemDef.create("not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("alloc_typ_nm", "alloc_typ_nm"),
				MCItemDef.create("rqst_to_loc_cd", "rqst_to_loc_cd"),
				MCItemDef.create("rqst_to_loc_nm", "rqst_to_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_dt", "rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("rqst_prms_dt", "rqst_prms_dt"),
				MCItemDef.create("rqst_prms_dlv_dt", "rqst_prms_dlv_dt"),
				MCItemDef.create("wg_rqst_cnt_rmrks", "wg_rqst_cnt_rmrks"),
				MCItemDef.create("rqst_to_wg_cd", "rqst_to_wg_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("ship_lg_grp_nm", "ship_lg_grp_nm"),
				MCItemDef.create("def_loc_cd", "def_loc_cd"),
				MCItemDef.create("def_loc_nm", "def_loc_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_po_d_rmrks", "cst_po_d_rmrks"),
				MCItemDef.create("sls_rsn_cd", "sls_rsn_cd"),
				MCItemDef.create("sls_rsn_nm", "sls_rsn_nm"),
				MCItemDef.create("sls_acxfr_flg", "sls_acxfr_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("sls_upri_req_typ_nm", "sls_upri_req_typ_nm"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("slo_d_intr_rmrks", "slo_d_intr_rmrks"),
				MCItemDef.create("slo_d_sub_char1", "slo_d_sub_char1"),
				MCItemDef.create("slo_d_sub_char2", "slo_d_sub_char2"),
				MCItemDef.create("slo_d_sub_char3", "slo_d_sub_char3"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("itm_ship_grp_cd", "itm_ship_grp_cd"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_err_flg", "dtl_err_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("cred_cd", "cred_cd")
			}
			,
			MCBlockDef.create("Slo_BulkImp_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6020_Slo_BulkImp_Chk02_INFO = new MCOperationInfo("MS", "MSBBL6020", "Slo_BulkImp_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6020_Slo_BulkImp_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_BulkImp_Chk02",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no")
			}
			,
			MCBlockDef.create("Slo_BulkImp_Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL6020_Slo_BulkImp_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_BulkImp_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("slo_upd_cntr", "slo_upd_cntr"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Slo_BulkImp_Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6020_Slo_BulkImp_Ins01_INFO = new MCOperationInfo("MS", "MSBBL6020", "Slo_BulkImp_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6020_Slo_BulkImp_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_BulkImp_Ins01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("slo_typ", "slo_typ"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_schd_dt", "via_schd_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_num_flg", "iv_num_flg"),
				MCItemDef.create("adv_ship_ctrl_typ", "adv_ship_ctrl_typ"),
				MCItemDef.create("adv_bill_amt", "adv_bill_amt"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_rev", "cst_po_rev"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("cst_po_rmrks", "cst_po_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1"),
				MCItemDef.create("hdr_grp_no", "hdr_grp_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("iv_upri", "iv_upri"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno_num_flg", "sno_num_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("ship_rqst_tm", "ship_rqst_tm"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
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
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("pri_prnt_typ", "pri_prnt_typ"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("proc_typ", "proc_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("rqst_to_loc_cd", "rqst_to_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("wg_rqst_cnt_rmrks", "wg_rqst_cnt_rmrks"),
				MCItemDef.create("rqst_to_wg_cd", "rqst_to_wg_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("slo_d_intr_rmrks", "slo_d_intr_rmrks"),
				MCItemDef.create("sls_rsn_cd", "sls_rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_po_d_rmrks", "cst_po_d_rmrks"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("slo_d_sub_char1", "slo_d_sub_char1"),
				MCItemDef.create("slo_d_sub_char2", "slo_d_sub_char2"),
				MCItemDef.create("slo_d_sub_char3", "slo_d_sub_char3"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1")
			}
			,
			MCBlockDef.create("Slo_BulkImp_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL6020_Slo_BulkImp_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_BulkImp_Ins01",
			new MCItemDef[]{
				MCItemDef.create("alloc_sts_typ", "alloc_sts_typ"),
				MCItemDef.create("alloc_sts_typ_nm", "alloc_sts_typ_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_rev", "slo_rev"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_back_flg", "aprv_back_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("ship_schd_split_flg", "ship_schd_split_flg"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("ship_schd_hm", "ship_schd_hm"),
				MCItemDef.create("dlv_schd_dt", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_hm", "dlv_schd_hm"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("alloc_scope_typ_nm", "alloc_scope_typ_nm"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("alloc_typ_nm", "alloc_typ_nm"),
				MCItemDef.create("rqst_to_loc_cd", "rqst_to_loc_cd"),
				MCItemDef.create("rqst_to_loc_nm", "rqst_to_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_dt", "rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("alloc_qty", "alloc_qty"),
				MCItemDef.create("wait_qty", "wait_qty"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Slo_BulkImp_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6020_Slo_BulkImp_Del01_INFO = new MCOperationInfo("MS", "MSBBL6020", "Slo_BulkImp_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6020_Slo_BulkImp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6020", "Slo_BulkImp_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("slo_upd_cntr", "slo_upd_cntr"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr")
			}
			,
			MCBlockDef.create("Slo_Del01_Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

