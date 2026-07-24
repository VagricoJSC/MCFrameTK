package mcframe.serverMSBB.MSBBL1110;

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
 * [MSBBL_QtnReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL1110.Srch01.UP.BLOCK0")){
			return MS_MSBBL1110_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1110.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL1110_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1110.Srch01.DOWN.BLOCK1")){
			return MS_MSBBL1110_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1110.Ins01.UP.BLOCK0")){
			return MS_MSBBL1110_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1110.Ins01.UP.BLOCK1")){
			return MS_MSBBL1110_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1110.Ins01.DOWN.BLOCK0")){
			return MS_MSBBL1110_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1110.Ins01.DOWN.BLOCK1")){
			return MS_MSBBL1110_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1110.Upd01.UP.BLOCK0")){
			return MS_MSBBL1110_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1110.Upd01.UP.BLOCK1")){
			return MS_MSBBL1110_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1110.Upd01.DOWN.BLOCK0")){
			return MS_MSBBL1110_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1110.Upd01.DOWN.BLOCK1")){
			return MS_MSBBL1110_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1110.Del01.UP.BLOCK0")){
			return MS_MSBBL1110_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1110.Sprt01.UP.BLOCK0")){
			return MS_MSBBL1110_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1110.Sprt01.DOWN.BLOCK0")){
			return MS_MSBBL1110_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1110.Prnt01.UP.BLOCK0")){
			return MS_MSBBL1110_Prnt01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBBL1110_Srch01_INFO = new MCOperationInfo("MS", "MSBBL1110", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1110_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1110_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("qtn_typ", "qtn_typ"),
				MCItemDef.create("qtn_typ_nm", "qtn_typ_nm"),
				MCItemDef.create("qtn_dt", "qtn_dt"),
				MCItemDef.create("valid_dt", "valid_dt"),
				MCItemDef.create("qtn_prnt_flg", "qtn_prnt_flg"),
				MCItemDef.create("qtn_prnt_dt", "qtn_prnt_dt"),
				MCItemDef.create("failure_flg", "failure_flg"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("aprv_upd_flg", "aprv_upd_flg"),
				MCItemDef.create("aprv_can_flg", "aprv_can_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_sundry_flg", "cst_sundry_flg"),
				MCItemDef.create("cst_cntry_cd", "cst_cntry_cd"),
				MCItemDef.create("cst_cntry_nm", "cst_cntry_nm"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_cntct_dpt", "cst_cntct_dpt"),
				MCItemDef.create("cst_cntct_psn", "cst_cntct_psn"),
				MCItemDef.create("cst_zip_cd", "cst_zip_cd"),
				MCItemDef.create("cst_addr1", "cst_addr1"),
				MCItemDef.create("cst_addr2", "cst_addr2"),
				MCItemDef.create("cst_addr3", "cst_addr3"),
				MCItemDef.create("cst_addr4", "cst_addr4"),
				MCItemDef.create("cst_tel", "cst_tel"),
				MCItemDef.create("cst_fax", "cst_fax"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("qtn_term_cd", "qtn_term_cd"),
				MCItemDef.create("qtn_term_nm", "qtn_term_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("cst_qtn_rqst_no", "cst_qtn_rqst_no"),
				MCItemDef.create("prof_rate", "prof_rate"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("ttl_amt", "ttl_amt"),
				MCItemDef.create("ttl_amt_no_cost", "ttl_amt_no_cost"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("trnspt_nm", "trnspt_nm"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("rcpt_usr_nm", "rcpt_usr_nm"),
				MCItemDef.create("qtn_rmrks", "qtn_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("qtn_rslt_rsn_cd", "qtn_rslt_rsn_cd"),
				MCItemDef.create("qtn_rslt_rsn_nm", "qtn_rslt_rsn_nm"),
				MCItemDef.create("qtn_rslt_rsn_rmrks", "qtn_rslt_rsn_rmrks"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("qtn_prnt_seq", "qtn_prnt_seq"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1110_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1_num_typ", "sno1_num_typ"),
				MCItemDef.create("sno2_num_typ", "sno2_num_typ"),
				MCItemDef.create("sno3_num_typ", "sno3_num_typ"),
				MCItemDef.create("sno4_num_typ", "sno4_num_typ"),
				MCItemDef.create("slo_sno1_flg", "slo_sno1_flg"),
				MCItemDef.create("slo_sno2_flg", "slo_sno2_flg"),
				MCItemDef.create("slo_sno3_flg", "slo_sno3_flg"),
				MCItemDef.create("slo_sno4_flg", "slo_sno4_flg"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("comp_spec_typ_nm", "comp_spec_typ_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_std_sls_upri", "trd_cur_std_sls_upri"),
				MCItemDef.create("trd_cur_std_sls_amt", "trd_cur_std_sls_amt"),
				MCItemDef.create("trd_cur_std_sls_inc_tax_amt", "trd_cur_std_sls_inc_tax_amt"),
				MCItemDef.create("upri_rate", "upri_rate"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("cost_amt", "cost_amt"),
				MCItemDef.create("prof_rate", "prof_rate"),
				MCItemDef.create("trd_cur_std_sls_tax_amt", "trd_cur_std_sls_tax_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("base_cur_std_sls_upri", "base_cur_std_sls_upri"),
				MCItemDef.create("base_cur_std_sls_amt", "base_cur_std_sls_amt"),
				MCItemDef.create("base_cur_std_sls_inc_tax_amt", "base_cur_std_sls_inc_tax_amt"),
				MCItemDef.create("base_cur_std_sls_tax_amt", "base_cur_std_sls_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("cntry_nm", "cntry_nm"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("qtn_d_rmrks", "qtn_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("itm_comp_rev_no", "itm_comp_rev_no"),
				MCItemDef.create("no_itm_cd_flg", "no_itm_cd_flg"),
				MCItemDef.create("comp_rel_flg", "comp_rel_flg"),
				MCItemDef.create("spec_flg", "spec_flg"),
				MCItemDef.create("spec_sub_char1", "spec_sub_char1"),
				MCItemDef.create("spec_sub_char2", "spec_sub_char2"),
				MCItemDef.create("spec_sub_char3", "spec_sub_char3"),
				MCItemDef.create("spec_sub_char4", "spec_sub_char4"),
				MCItemDef.create("qtn_d_rslt_rsn_cd", "qtn_d_rslt_rsn_cd"),
				MCItemDef.create("qtn_d_rslt_rsn_nm", "qtn_d_rslt_rsn_nm"),
				MCItemDef.create("qtn_d_rslt_rsn_rmrks", "qtn_d_rslt_rsn_rmrks"),
				MCItemDef.create("trnst_qty", "trnst_qty"),
				MCItemDef.create("cst_qtn_rqst_d_no", "cst_qtn_rqst_d_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1110_Ins01_INFO = new MCOperationInfo("MS", "MSBBL1110", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1110_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("rev_upd_flg", "rev_upd_flg"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_typ", "qtn_typ"),
				MCItemDef.create("qtn_dt", "qtn_dt"),
				MCItemDef.create("valid_dt", "valid_dt"),
				MCItemDef.create("qtn_out_flg", "qtn_out_flg"),
				MCItemDef.create("failure_flg", "failure_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_cntct_dpt", "cst_cntct_dpt"),
				MCItemDef.create("cst_cntct_psn", "cst_cntct_psn"),
				MCItemDef.create("cst_zip_cd", "cst_zip_cd"),
				MCItemDef.create("cst_addr1", "cst_addr1"),
				MCItemDef.create("cst_addr2", "cst_addr2"),
				MCItemDef.create("cst_addr3", "cst_addr3"),
				MCItemDef.create("cst_addr4", "cst_addr4"),
				MCItemDef.create("cst_tel", "cst_tel"),
				MCItemDef.create("cst_fax", "cst_fax"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("qtn_term_cd", "qtn_term_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("cst_qtn_rqst_no", "cst_qtn_rqst_no"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("qtn_rmrks", "qtn_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("qtn_rslt_rsn_cd", "qtn_rslt_rsn_cd"),
				MCItemDef.create("qtn_rslt_rsn_rmrks", "qtn_rslt_rsn_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL1110_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_std_sls_upri", "trd_cur_std_sls_upri"),
				MCItemDef.create("upri_rate", "upri_rate"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno_auto_flg", "sno_auto_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
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
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("qtn_d_rmrks", "qtn_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("no_itm_cd_flg", "no_itm_cd_flg"),
				MCItemDef.create("qtn_d_rslt_rsn_cd", "qtn_d_rslt_rsn_cd"),
				MCItemDef.create("qtn_d_rslt_rsn_rmrks", "qtn_d_rslt_rsn_rmrks"),
				MCItemDef.create("cst_qtn_rqst_d_no", "cst_qtn_rqst_d_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1110_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1110_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1110_Upd01_INFO = new MCOperationInfo("MS", "MSBBL1110", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1110_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_typ", "qtn_typ"),
				MCItemDef.create("qtn_dt", "qtn_dt"),
				MCItemDef.create("valid_dt", "valid_dt"),
				MCItemDef.create("qtn_out_flg", "qtn_out_flg"),
				MCItemDef.create("failure_flg", "failure_flg"),
				MCItemDef.create("aprv_back_flg", "aprv_back_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_cntct_dpt", "cst_cntct_dpt"),
				MCItemDef.create("cst_cntct_psn", "cst_cntct_psn"),
				MCItemDef.create("cst_zip_cd", "cst_zip_cd"),
				MCItemDef.create("cst_addr1", "cst_addr1"),
				MCItemDef.create("cst_addr2", "cst_addr2"),
				MCItemDef.create("cst_addr3", "cst_addr3"),
				MCItemDef.create("cst_addr4", "cst_addr4"),
				MCItemDef.create("cst_tel", "cst_tel"),
				MCItemDef.create("cst_fax", "cst_fax"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("qtn_term_cd", "qtn_term_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("cst_qtn_rqst_no", "cst_qtn_rqst_no"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("qtn_rmrks", "qtn_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("qtn_rslt_rsn_cd", "qtn_rslt_rsn_cd"),
				MCItemDef.create("qtn_rslt_rsn_rmrks", "qtn_rslt_rsn_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL1110_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_std_sls_upri", "trd_cur_std_sls_upri"),
				MCItemDef.create("upri_rate", "upri_rate"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno_auto_flg", "sno_auto_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
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
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("qtn_d_rmrks", "qtn_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("no_itm_cd_flg", "no_itm_cd_flg"),
				MCItemDef.create("qtn_d_rslt_rsn_cd", "qtn_d_rslt_rsn_cd"),
				MCItemDef.create("qtn_d_rslt_rsn_rmrks", "qtn_d_rslt_rsn_rmrks"),
				MCItemDef.create("cst_qtn_rqst_d_no", "cst_qtn_rqst_d_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1110_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1110_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1110_Del01_INFO = new MCOperationInfo("MS", "MSBBL1110", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1110_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Del01",
			new MCItemDef[]{
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1110_Sprt01_INFO = new MCOperationInfo("MS", "MSBBL1110", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1110_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1110_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("std_sls_upri", "std_sls_upri"),
				MCItemDef.create("interim_flg", "interim_flg")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1110_Prnt01_INFO = new MCOperationInfo("MS", "MSBBL1110", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1110_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1110", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_prnt_seq", "qtn_prnt_seq")
			}
			,
			MCBlockDef.create("Prnt01_Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

