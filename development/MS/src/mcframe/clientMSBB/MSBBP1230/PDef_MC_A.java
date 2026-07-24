package mcframe.clientMSBB.MSBBP1230;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBBP_SlsDlvDtAdjstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL1230.Srch01.UP.BLOCK0")){
			return MS_MSBBL1230_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1230.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL1230_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1230.Srch01.DOWN.BLOCK1")){
			return MS_MSBBL1230_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1230.Srch01.DOWN.BLOCK2")){
			return MS_MSBBL1230_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1230.Srch01.DOWN.BLOCK3")){
			return MS_MSBBL1230_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBBL1230.Srch01.DOWN.BLOCK4")){
			return MS_MSBBL1230_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBBL1230.Srch01.DOWN.BLOCK5")){
			return MS_MSBBL1230_Srch01_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBBL1230.Srch01.DOWN.BLOCK6")){
			return MS_MSBBL1230_Srch01_DOWN_BLOCK6();
		}
		else if (id.equals("MS.MSBBL1230.Srch01.DOWN.BLOCK7")){
			return MS_MSBBL1230_Srch01_DOWN_BLOCK7();
		}
		else if (id.equals("MS.MSBBL1230.Srch01.DOWN.BLOCK8")){
			return MS_MSBBL1230_Srch01_DOWN_BLOCK8();
		}
		else if (id.equals("MS.MSBBL1230.Srch01.DOWN.BLOCK9")){
			return MS_MSBBL1230_Srch01_DOWN_BLOCK9();
		}
		else if (id.equals("MS.MSBBL1230.Srch01.DOWN.BLOCK10")){
			return MS_MSBBL1230_Srch01_DOWN_BLOCK10();
		}
		else if (id.equals("MS.MSBBL1230.Srch01.DOWN.BLOCK11")){
			return MS_MSBBL1230_Srch01_DOWN_BLOCK11();
		}
		else if (id.equals("MS.MSBBL1230.Upd01.UP.BLOCK0")){
			return MS_MSBBL1230_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1230.Upd01.UP.BLOCK1")){
			return MS_MSBBL1230_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1230.Upd01.UP.BLOCK2")){
			return MS_MSBBL1230_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1230.Upd01.UP.BLOCK3")){
			return MS_MSBBL1230_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBBL1230.Upd01.UP.BLOCK4")){
			return MS_MSBBL1230_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBBL1230.Upd01.UP.BLOCK5")){
			return MS_MSBBL1230_Upd01_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBBL1230.Upd01.UP.BLOCK6")){
			return MS_MSBBL1230_Upd01_UP_BLOCK6();
		}
		else if (id.equals("MS.MSBBL1230.Upd01.DOWN.BLOCK0")){
			return MS_MSBBL1230_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1230.Upd01.DOWN.BLOCK1")){
			return MS_MSBBL1230_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1230.Prnt01.UP.BLOCK0")){
			return MS_MSBBL1230_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1230.Prnt01.UP.BLOCK1")){
			return MS_MSBBL1230_Prnt01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBBL1230_Srch01_INFO = new MCOperationInfo("MS", "MSBBL1230", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1230_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1230_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Rslt_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_rev", "slo_rev"),
				MCItemDef.create("slo_dt", "slo_dt"),
				MCItemDef.create("slo_typ", "slo_typ"),
				MCItemDef.create("slo_typ_nm", "slo_typ_nm"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("sls_basis_typ_nm", "sls_basis_typ_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("assort_typ_nm", "assort_typ_nm"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_rev", "cst_po_rev"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("prof_rate", "prof_rate"),
				MCItemDef.create("ttl_amt_p" + ".amt", "ttl_amt"),
				MCItemDef.create("ttl_amt_no_cost_p" + ".amt", "ttl_amt_no_cost"),
				MCItemDef.create("trd_cur_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt_p" + ".amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("adv_ship_ctrl_typ", "adv_ship_ctrl_typ"),
				MCItemDef.create("adv_ship_ctrl_typ_nm", "adv_ship_ctrl_typ_nm"),
				MCItemDef.create("adv_bill_amt_p" + ".amt", "adv_bill_amt"),
				MCItemDef.create("adv_rcv_amt_p" + ".amt", "adv_rcv_amt"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("rcpt_usr_nm", "rcpt_usr_nm"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("cst_po_rmrks", "cst_po_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("can_rsn_nm", "can_rsn_nm"),
				MCItemDef.create("can_rmrks", "can_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("edi_sub_dt1", "edi_sub_dt1"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("slo_upd_cntr", "slo_upd_cntr"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1230_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Rslt_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sls_sts_typ", "sls_sts_typ"),
				MCItemDef.create("sls_sts_typ_nm", "sls_sts_typ_nm"),
				MCItemDef.create("alloc_sts_typ", "alloc_sts_typ"),
				MCItemDef.create("alloc_sts_typ_nm", "alloc_sts_typ_nm"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("comp_spec_typ_nm", "comp_spec_typ_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_mng_typ_nm", "stk_mng_typ_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt_p" + ".amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt_p" + ".amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_tax_amt_p" + ".amt", "trd_cur_tax_amt"),
				MCItemDef.create("cost_upri_p" + ".upri", "cost_upri"),
				MCItemDef.create("cost_amt_p" + ".amt", "cost_amt"),
				MCItemDef.create("iv_upri_p" + ".upri", "iv_upri"),
				MCItemDef.create("iv_amt_p" + ".amt", "iv_amt"),
				MCItemDef.create("prof_rate", "prof_rate"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt_p" + ".amt", "wtax_amt"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt_p" + ".amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_upri_p" + ".upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt_p" + ".amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt_p" + ".amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("sno_p" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("ship_rqst_dt_p" + ".ymd", "ship_rqst_dt"),
				MCItemDef.create("ship_rqst_dt_p" + ".hm", "ship_rqst_hm"),
				MCItemDef.create("dlv_rqst_dt_p" + ".ymd", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_dt_p" + ".hm", "dlv_rqst_hm"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("dlv_p" + ".bp_cd", "dlv_cd"),
				MCItemDef.create("dlv_p" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_p" + ".bp_nm", "dlv_nm"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_p" + ".zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_p" + ".addr1", "dlv_addr1"),
				MCItemDef.create("dlv_p" + ".addr2", "dlv_addr2"),
				MCItemDef.create("dlv_p" + ".addr3", "dlv_addr3"),
				MCItemDef.create("dlv_p" + ".addr4", "dlv_addr4"),
				MCItemDef.create("dlv_p" + ".tel", "dlv_tel"),
				MCItemDef.create("dlv_p" + ".fax", "dlv_fax"),
				MCItemDef.create("dlv_p" + ".cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_p" + ".cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("dlv_p" + ".lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("dlv_p" + ".lg_grp_nm", "dlv_lg_grp_nm"),
				MCItemDef.create("dlv_p" + ".pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("tdlv_p" + ".bp_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_p" + ".dlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_p" + ".bp_nm", "tdlv_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("via_dlv_typ_nm", "via_dlv_typ_nm"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_p" + ".zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_p" + ".addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_p" + ".addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_p" + ".addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_p" + ".addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_p" + ".tel", "tdlv_tel"),
				MCItemDef.create("tdlv_p" + ".fax", "tdlv_fax"),
				MCItemDef.create("tdlv_p" + ".cntry_cd", "tdlv_cntry_cd"),
				MCItemDef.create("tdlv_p" + ".cntry_nm", "tdlv_cntry_nm"),
				MCItemDef.create("tdlv_p" + ".lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("tdlv_p" + ".lg_grp_nm", "tdlv_lg_grp_nm"),
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
				MCItemDef.create("wg_rqst_cnt_rmrks", "wg_rqst_cnt_rmrks"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("ship_lg_grp_nm", "ship_lg_grp_nm"),
				MCItemDef.create("def_loc_cd", "def_loc_cd"),
				MCItemDef.create("def_loc_nm", "def_loc_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("cst_po_d_rmrks", "cst_po_d_rmrks"),
				MCItemDef.create("sls_rsn_cd", "sls_rsn_cd"),
				MCItemDef.create("sls_rsn_nm", "sls_rsn_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("sls_upri_req_typ_nm", "sls_upri_req_typ_nm"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("can_rsn_nm", "can_rsn_nm"),
				MCItemDef.create("slo_d_can_rmkrs", "slo_d_can_rmkrs"),
				MCItemDef.create("ship_cmpl_flg", "ship_cmpl_flg"),
				MCItemDef.create("sls_cmpl_flg", "sls_cmpl_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("alloc_qty_p" + ".qty", "alloc_qty"),
				MCItemDef.create("wait_qty_p" + ".qty", "wait_qty"),
				MCItemDef.create("ship_inst_qty_p" + ".qty", "ship_inst_qty"),
				MCItemDef.create("ship_act_qty_p" + ".qty", "ship_act_qty"),
				MCItemDef.create("iv_schd_qty_p" + ".qty", "iv_schd_qty"),
				MCItemDef.create("iv_act_qty_p" + ".qty", "iv_act_qty"),
				MCItemDef.create("sls_qty_p" + ".qty", "sls_qty"),
				MCItemDef.create("ship_ret_qty_p" + ".qty", "ship_ret_qty"),
				MCItemDef.create("re_ship_schd_qty_p" + ".qty", "re_ship_schd_qty"),
				MCItemDef.create("ship_schd_abort_qty_p" + ".qty", "ship_schd_abort_qty"),
				MCItemDef.create("sls_schd_abort_qty_p" + ".qty", "sls_schd_abort_qty"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("last_edi_prms_flg", "edi_prms_flg"),
				MCItemDef.create("edi_send_flg", "edi_send_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no"),
				MCItemDef.create("slo_d_upd_cntr", "slo_d_upd_cntr"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBBL1230_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Rslt_Dtl_Ship_Schd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("alloc_sts_typ", "alloc_sts_typ"),
				MCItemDef.create("alloc_sts_typ_nm", "alloc_sts_typ_nm"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("org_slo_prms_no", "org_slo_prms_no"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("pd_inst_dlv_dt_p" + ".ymd", "pd_inst_dlv_dt"),
				MCItemDef.create("pd_inst_dlv_dt_p" + ".hm", "pd_inst_dlv_hm"),
				MCItemDef.create("ship_rqst_dt_p" + ".ymd", "ship_rqst_dt"),
				MCItemDef.create("ship_rqst_dt_p" + ".hm", "ship_rqst_hm"),
				MCItemDef.create("not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("ship_schd_dt_p" + ".ymd", "ship_schd_dt"),
				MCItemDef.create("ship_schd_dt_p" + ".hm", "ship_schd_hm"),
				MCItemDef.create("dlv_schd_dt_p" + ".ymd", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_dt_p" + ".hm", "dlv_schd_hm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_wk_nm", "ship_wk_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("alloc_qty_p" + ".qty", "alloc_qty"),
				MCItemDef.create("wait_qty_p" + ".qty", "wait_qty"),
				MCItemDef.create("ship_inst_qty_p" + ".qty", "ship_inst_qty"),
				MCItemDef.create("ship_act_qty_p" + ".qty", "ship_act_qty"),
				MCItemDef.create("iv_schd_qty_p" + ".qty", "iv_schd_qty"),
				MCItemDef.create("iv_act_qty_p" + ".qty", "iv_act_qty"),
				MCItemDef.create("sls_qty_p" + ".qty", "sls_qty"),
				MCItemDef.create("ship_ret_qty_p" + ".qty", "ship_ret_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("org_abort_flg", "org_abort_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("re_ship_schd_flg", "re_ship_schd_flg"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("answd_flg", "answd_flg"),
				MCItemDef.create("ship_abl_flg", "ship_abl_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("dlv_inst_dt_p" + ".ymd", "dlv_inst_dt"),
				MCItemDef.create("dlv_inst_dt_p" + ".hm", "dlv_inst_hm"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("dlv_p" + ".bp_cd", "dlv_cd"),
				MCItemDef.create("dlv_p" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_p" + ".bp_nm", "dlv_nm"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_p" + ".zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_p" + ".addr1", "dlv_addr1"),
				MCItemDef.create("dlv_p" + ".addr2", "dlv_addr2"),
				MCItemDef.create("dlv_p" + ".addr3", "dlv_addr3"),
				MCItemDef.create("dlv_p" + ".addr4", "dlv_addr4"),
				MCItemDef.create("dlv_p" + ".tel", "dlv_tel"),
				MCItemDef.create("dlv_p" + ".fax", "dlv_fax"),
				MCItemDef.create("dlv_p" + ".cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_p" + ".cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("dlv_p" + ".lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("dlv_p" + ".lg_grp_nm", "dlv_lg_grp_nm"),
				MCItemDef.create("dlv_p" + ".pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("tdlv_req_flg", "tdlv_req_flg"),
				MCItemDef.create("tdlv_p" + ".bp_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_p" + ".dlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_p" + ".bp_nm", "tdlv_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("via_dlv_typ_nm", "via_dlv_typ_nm"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_p" + ".zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_p" + ".addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_p" + ".addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_p" + ".addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_p" + ".addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_p" + ".tel", "tdlv_tel"),
				MCItemDef.create("tdlv_p" + ".fax", "tdlv_fax"),
				MCItemDef.create("tdlv_p" + ".cntry_cd", "tdlv_cntry_cd"),
				MCItemDef.create("tdlv_p" + ".cntry_nm", "tdlv_cntry_nm"),
				MCItemDef.create("tdlv_p" + ".lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("tdlv_p" + ".lg_grp_nm", "tdlv_lg_grp_nm"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("dlv_day_week_typ_nm", "dlv_day_week_typ_nm"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Dtl_Ship_Schd_All")
		);
	}
	public static MCContainerDef MS_MSBBL1230_Srch01_DOWN_BLOCK3() {
	/** Ope.のBlock [Rslt_Dtl_Slo_Prms] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("prms_dlv_dt_p" + ".ymd", "prms_dlv_dt"),
				MCItemDef.create("prms_dlv_dt_p" + ".hm", "prms_dlv_hm"),
				MCItemDef.create("trd_unit_prms_qty_p" + ".qty", "trd_unit_prms_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("prms_prnt_tm", "prms_prnt_tm"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("last_prms_rev", "last_prms_rev"),
				MCItemDef.create("slo_prms_prnt_flg", "slo_prms_prnt_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no")
			}
			,
			MCBlockDef.create("Dtl_Slo_Prms_All")
		);
	}
	public static MCContainerDef MS_MSBBL1230_Srch01_DOWN_BLOCK4() {
	/** Ope.のBlock [Rslt_Dtl_Slo_Sts] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slo_sts_no", "slo_sts_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_sts_typ", "slo_sts_typ"),
				MCItemDef.create("slo_sts_typ_nm", "slo_sts_typ_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("qty_p" + ".qty", "qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("upri_p" + ".upri", "upri"),
				MCItemDef.create("amt_p" + ".amt", "amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_amt_p" + ".amt", "tax_amt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("ship_lg_grp_nm", "ship_lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_d_no", "rcpt_iv_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("biz_dt_p" + ".ymd", "biz_dt"),
				MCItemDef.create("biz_dt_p" + ".hm", "biz_hm"),
				MCItemDef.create("st_schd_dt_p" + ".ymd", "st_schd_dt"),
				MCItemDef.create("st_schd_dt_p" + ".hm", "st_schd_hm"),
				MCItemDef.create("end_schd_dt_p" + ".ymd", "end_schd_dt"),
				MCItemDef.create("end_schd_dt_p" + ".hm", "end_schd_hm"),
				MCItemDef.create("st_act_dt_p" + ".ymd", "st_act_dt"),
				MCItemDef.create("st_act_dt_p" + ".hm", "st_act_hm"),
				MCItemDef.create("end_act_dt_p" + ".ymd", "end_act_dt"),
				MCItemDef.create("end_act_dt_p" + ".hm", "end_act_hm"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("dlv_inst_no", "dlv_inst_no"),
				MCItemDef.create("dlv_inst_d_no", "dlv_inst_d_no"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_act_no", "insp_act_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xfr_act_no", "xfr_act_no"),
				MCItemDef.create("xfr_act_d_no", "xfr_act_d_no"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Dtl_Slo_Sts_All")
		);
	}
	public static MCContainerDef MS_MSBBL1230_Srch01_DOWN_BLOCK5() {
	/** Ope.のBlock [Rslt_Dtl_Alloc_Sts] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("alloc_wait_flg", "alloc_wait_flg"),
				MCItemDef.create("ship_inst_flg", "ship_inst_flg"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_nm", "ship_str_ln_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("pack_unit_qty_p" + ".qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("ent_unit_qty_p" + ".qty", "ent_unit_qty"),
				MCItemDef.create("ent_unit_cd", "ent_unit_cd"),
				MCItemDef.create("ent_unit_nm", "ent_unit_nm"),
				MCItemDef.create("ent_unit_dec_place", "ent_unit_dec_place"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("ship_act_qty_p" + ".qty", "ship_act_qty")
			}
			,
			MCBlockDef.create("Dtl_Alloc_Sts_All")
		);
	}
	public static MCContainerDef MS_MSBBL1230_Srch01_DOWN_BLOCK6() {
	/** Ope.のBlock [Rslt_Dtl_Dlv_Inst_Rcpt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("dlv_inst_rcpt_rev", "dlv_inst_rcpt_rev"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_rev", "cst_dlv_inst_rev"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("cst_dlv_inst_rmrks", "cst_dlv_inst_rmrks"),
				MCItemDef.create("cst_dlv_inst_d_rmrks", "cst_dlv_inst_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Dtl_Dlv_Inst_Rcpt_All")
		);
	}
	public static MCContainerDef MS_MSBBL1230_Srch01_DOWN_BLOCK7() {
	/** Ope.のBlock [Rslt_Dtl_WG_Rqst] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("wg_rqst_typ_nm", "wg_rqst_typ_nm"),
				MCItemDef.create("wg_rqst_sts_typ", "wg_rqst_sts_typ"),
				MCItemDef.create("wg_rqst_sts_typ_nm", "wg_rqst_sts_typ_nm"),
				MCItemDef.create("wg_rqst_src_typ", "wg_rqst_src_typ"),
				MCItemDef.create("wg_rqst_src_typ_nm", "wg_rqst_src_typ_nm"),
				MCItemDef.create("wg_rqst_src_no", "wg_rqst_src_no"),
				MCItemDef.create("prms_ntc_flg", "prms_ntc_flg"),
				MCItemDef.create("prms_dt", "prms_dt"),
				MCItemDef.create("prms_uncn_flg", "prms_uncn_flg"),
				MCItemDef.create("re_prms_ntc_flg", "re_prms_ntc_flg"),
				MCItemDef.create("re_prms_dt", "re_prms_dt"),
				MCItemDef.create("re_rqst_flg", "re_rqst_flg"),
				MCItemDef.create("re_rqst_dt", "re_rqst_dt"),
				MCItemDef.create("wg_re_rqst_cnt_rmrks", "wg_re_rqst_cnt_rmrks"),
				MCItemDef.create("gr_rqst_dt", "gr_rqst_dt"),
				MCItemDef.create("gr_rqst_hm", "gr_rqst_hm"),
				MCItemDef.create("gi_rqst_dt", "gi_rqst_dt"),
				MCItemDef.create("gi_rqst_hm", "gi_rqst_hm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("wg_rqst_cnt_rmrks", "wg_rqst_cnt_rmrks"),
				MCItemDef.create("rqst_to_wg_cd", "rqst_to_wg_cd"),
				MCItemDef.create("rqst_to_wg_nm", "rqst_to_wg_nm"),
				MCItemDef.create("gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("gi_lg_grp_nm", "gi_lg_grp_nm"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("rqst_dt", "rqst_dt"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Dtl_WG_Rqst_All")
		);
	}
	public static MCContainerDef MS_MSBBL1230_Srch01_DOWN_BLOCK8() {
	/** Ope.のBlock [Rslt_Dtl_WG_Rqst_Prms] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_rqst_prms_no", "wg_rqst_prms_no"),
				MCItemDef.create("wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("wg_rqst_src_no", "wg_rqst_src_no"),
				MCItemDef.create("prms_trd_unit_qty_p" + ".qty", "prms_trd_unit_qty"),
				MCItemDef.create("prms_trd_unit_cd", "prms_trd_unit_cd"),
				MCItemDef.create("prms_trd_unit_nm", "prms_trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("prms_base_unit_qty_p" + ".qty", "prms_base_unit_qty"),
				MCItemDef.create("prms_base_unit_cd", "prms_base_unit_cd"),
				MCItemDef.create("prms_base_unit_nm", "prms_base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("gr_schd_dt", "gr_schd_dt"),
				MCItemDef.create("gr_schd_hm", "gr_schd_hm"),
				MCItemDef.create("gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("gi_lg_grp_nm", "gi_lg_grp_nm"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_rqst_dt", "gi_rqst_dt"),
				MCItemDef.create("gi_rqst_hm", "gi_rqst_hm"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Dtl_WG_Rqst_Prms_All")
		);
	}
	public static MCContainerDef MS_MSBBL1230_Srch01_DOWN_BLOCK9() {
	/** Ope.のBlock [Rslt_Dtl_Ship_Act] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("ship_dt_p" + ".ymd", "ship_dt"),
				MCItemDef.create("ship_dt_p" + ".hm", "ship_hm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_nm", "ship_str_ln_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("lot_rmrks", "lot_rmrks"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("pack_unit_qty_p" + ".qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm")
			}
			,
			MCBlockDef.create("Dtl_Ship_Act_All")
		);
	}
	public static MCContainerDef MS_MSBBL1230_Srch01_DOWN_BLOCK10() {
	/** Ope.のBlock [Rslt_Dtl_Slo_Prms_his] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("prms_dlv_dt_p" + ".ymd", "prms_dlv_dt"),
				MCItemDef.create("prms_dlv_dt_p" + ".hm", "prms_dlv_hm"),
				MCItemDef.create("trd_unit_prms_qty_p" + ".qty", "trd_unit_prms_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Dtl_Slo_Prms_his_All")
		);
	}
	public static MCContainerDef MS_MSBBL1230_Srch01_DOWN_BLOCK11() {
	/** Ope.のBlock [Rslt_Dtl_Sls_Schd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sls_schd_no", "sls_schd_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("sls_ac_abl_flg", "sls_ac_abl_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_abort_qty_p" + ".qty", "base_unit_abort_qty"),
				MCItemDef.create("base_unit_sls_qty_p" + ".qty", "base_unit_sls_qty"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Dtl_Sls_Schd_All")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1230_Upd01_INFO = new MCOperationInfo("MS", "MSBBL1230", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1230_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Slo] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("can_rmrks", "can_rmrks"),
				MCItemDef.create("slo_prms_prnt_flg", "slo_prms_prnt_flg"),
				MCItemDef.create("slo_upd_cntr", "slo_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL1230_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Slo_D] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("slo_d_can_rmkrs", "slo_d_can_rmkrs"),
				MCItemDef.create("slo_d_upd_cntr", "slo_d_upd_cntr"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("edi_prms_flg", "edi_prms_flg"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL1230_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Ship_Schd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("re_ship_schd_flg", "re_ship_schd_flg"),
				MCItemDef.create("ship_rqst_dt_p" + ".ymd", "ship_rqst_tm"),
				MCItemDef.create("pd_inst_dlv_dt_p" + ".ymd", "pd_inst_dlv_tm"),
				MCItemDef.create("not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("ship_schd_dt_p" + ".ymd", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_dt_p" + ".ymd", "dlv_schd_tm"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("dlv_p" + ".bp_cd", "dlv_cd"),
				MCItemDef.create("dlv_p" + ".bp_nm", "dlv_nm"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_p" + ".zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_p" + ".addr1", "dlv_addr1"),
				MCItemDef.create("dlv_p" + ".addr2", "dlv_addr2"),
				MCItemDef.create("dlv_p" + ".addr3", "dlv_addr3"),
				MCItemDef.create("dlv_p" + ".addr4", "dlv_addr4"),
				MCItemDef.create("dlv_p" + ".tel", "dlv_tel"),
				MCItemDef.create("dlv_p" + ".fax", "dlv_fax"),
				MCItemDef.create("dlv_p" + ".lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("dlv_p" + ".pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("tdlv_p" + ".bp_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_p" + ".bp_nm", "tdlv_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_p" + ".zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_p" + ".addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_p" + ".addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_p" + ".addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_p" + ".addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_p" + ".tel", "tdlv_tel"),
				MCItemDef.create("tdlv_p" + ".fax", "tdlv_fax"),
				MCItemDef.create("tdlv_p" + ".lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("slo_prms_index", "slo_prms_index"),
				MCItemDef.create("param_row_index", "param_row_index")
			}
			,
			MCBlockDef.create("Dtl_Ship_Schd")
		);
	}

	public static MCContainerDef MS_MSBBL1230_Upd01_UP_BLOCK3() {
		/** Ope.のBlock [Upd01_Slo_Prms] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("prms_dlv_dt_p" + ".ymd", "prms_dlv_tm"),
				MCItemDef.create("trd_unit_prms_qty_p" + ".qty", "trd_unit_prms_qty"),
				MCItemDef.create("prms_rmrks", "prms_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no"),
				MCItemDef.create("slo_prms_index", "slo_prms_index"),
				MCItemDef.create("param_row_index", "param_row_index")
			}
			,
			MCBlockDef.create("Dtl_Slo_Prms")
		);
	}

	public static MCContainerDef MS_MSBBL1230_Upd01_UP_BLOCK4() {
		/** Ope.のBlock [Upd01_WG_Rqst] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("re_rqst_flg", "re_rqst_flg"),
				MCItemDef.create("re_rqst_dt", "re_rqst_dt"),
				MCItemDef.create("wg_re_rqst_cnt_rmrks", "wg_re_rqst_cnt_rmrks"),
				MCItemDef.create("prms_uncn_flg", "prms_uncn_flg")
			}
			,
			MCBlockDef.create("Dtl_WG_Rqst")
		);
	}

	public static MCContainerDef MS_MSBBL1230_Upd01_UP_BLOCK5() {
		/** Ope.のBlock [Upd01_Sls_Schd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sls_schd_no", "sls_schd_no"),
				MCItemDef.create("slo_d_no", "slo_d_no")
			}
			,
			MCBlockDef.create("Dtl_Sls_Schd")
		);
	}

	public static MCContainerDef MS_MSBBL1230_Upd01_UP_BLOCK6() {
		/** Ope.のBlock [Upd01_Ctrl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("prnt_out_flg", "prnt_out_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}


	public static MCContainerDef MS_MSBBL1230_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Ship_Schd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("ship_schd_dt_p" + ".ymd", "ship_schd_dt"),
				MCItemDef.create("ship_schd_dt_p" + ".hm", "ship_schd_hm"),
				MCItemDef.create("dlv_schd_dt_p" + ".ymd", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_dt_p" + ".hm", "dlv_schd_hm"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("ship_wk_nm", "ship_wk_nm"),
				MCItemDef.create("param_row_index", "param_row_index")
			}
			,
			MCBlockDef.create("Dtl_Ship_Schd")
		);
	}
	public static MCContainerDef MS_MSBBL1230_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_Slo_Prms] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("param_row_index", "param_row_index")
			}
			,
			MCBlockDef.create("Dtl_Slo_Prms")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1230_Prnt01_INFO = new MCOperationInfo("MS", "MSBBL1230", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1230_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Slo] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL1230_Prnt01_UP_BLOCK1() {
		/** Ope.のBlock [Prnt01_Slo_Prms] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1230", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("slo_prms_rev", "slo_prms_rev"),
				MCItemDef.create("slo_prms_h_no", "slo_prms_h_no")
			}
			,
			MCBlockDef.create("Dtl_Slo_Prms")
		);
	}


	//FMCB DEF_CLASSES END
}

