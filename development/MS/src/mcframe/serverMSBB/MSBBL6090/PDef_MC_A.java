package mcframe.serverMSBB.MSBBL6090;

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
 * [MSBBL_QtnRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL6090.QtnReg_Chk01.UP.BLOCK0")){
			return MS_MSBBL6090_QtnReg_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Chk01.UP.BLOCK1")){
			return MS_MSBBL6090_QtnReg_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Chk01.DOWN.BLOCK0")){
			return MS_MSBBL6090_QtnReg_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Chk01.DOWN.BLOCK1")){
			return MS_MSBBL6090_QtnReg_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Chk02.UP.BLOCK0")){
			return MS_MSBBL6090_QtnReg_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Chk02.DOWN.BLOCK0")){
			return MS_MSBBL6090_QtnReg_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Ins01.UP.BLOCK0")){
			return MS_MSBBL6090_QtnReg_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Ins01.UP.BLOCK1")){
			return MS_MSBBL6090_QtnReg_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Ins01.DOWN.BLOCK0")){
			return MS_MSBBL6090_QtnReg_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Ins01.DOWN.BLOCK1")){
			return MS_MSBBL6090_QtnReg_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Upd01.UP.BLOCK0")){
			return MS_MSBBL6090_QtnReg_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Upd01.UP.BLOCK1")){
			return MS_MSBBL6090_QtnReg_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Upd01.DOWN.BLOCK0")){
			return MS_MSBBL6090_QtnReg_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Upd01.DOWN.BLOCK1")){
			return MS_MSBBL6090_QtnReg_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Del01.UP.BLOCK0")){
			return MS_MSBBL6090_QtnReg_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6090.QtnReg_Del01.DOWN.BLOCK0")){
			return MS_MSBBL6090_QtnReg_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBBL6090_QtnReg_Chk01_INFO = new MCOperationInfo("MS", "MSBBL6090", "QtnReg_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6090_QtnReg_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("rev_upd_flg", "rev_upd_flg"),
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
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL6090_QtnReg_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
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
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_itm_no", "sls_itm_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL6090_QtnReg_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("rev_upd_flg", "rev_upd_flg"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_typ", "qtn_typ"),
				MCItemDef.create("qtn_dt", "qtn_dt"),
				MCItemDef.create("valid_dt", "valid_dt"),
				MCItemDef.create("qtn_out_flg", "qtn_out_flg"),
				MCItemDef.create("failure_flg", "failure_flg"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_back_flg", "aprv_back_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_sundry_flg", "cst_sundry_flg"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
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
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("qtn_term_cd", "qtn_term_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
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
				MCItemDef.create("qtn_prnt_seq", "qtn_prnt_seq"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL6090_QtnReg_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_std_sls_upri", "trd_cur_std_sls_upri"),
				MCItemDef.create("upri_rate", "upri_rate"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("cost_amt", "cost_amt"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno_auto_flg", "sno_auto_flg"),
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
				MCItemDef.create("cntry_cd", "cntry_cd"),
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
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("sls_itm_no", "sls_itm_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6090_QtnReg_Chk02_INFO = new MCOperationInfo("MS", "MSBBL6090", "QtnReg_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6090_QtnReg_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr")
			}
			,
			MCBlockDef.create("QtnReg_Chk02_Hdr")
		);
	}


	public static MCContainerDef MS_MSBBL6090_QtnReg_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("QtnReg_Chk02_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6090_QtnReg_Ins01_INFO = new MCOperationInfo("MS", "MSBBL6090", "QtnReg_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6090_QtnReg_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("rev_upd_flg", "rev_upd_flg"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_typ", "qtn_typ"),
				MCItemDef.create("qtn_dt", "qtn_dt"),
				MCItemDef.create("valid_dt", "valid_dt"),
				MCItemDef.create("qtn_out_flg", "qtn_out_flg"),
				MCItemDef.create("failure_flg", "failure_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_sundry_flg", "cst_sundry_flg"),
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
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("qtn_term_cd", "qtn_term_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
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
			MCBlockDef.create("QtnReg_Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL6090_QtnReg_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_std_sls_upri", "trd_cur_std_sls_upri"),
				MCItemDef.create("upri_rate", "upri_rate"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("cost_amt", "cost_amt"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno_auto_flg", "sno_auto_flg"),
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
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
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
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("sls_itm_no", "sls_itm_no")
			}
			,
			MCBlockDef.create("QtnReg_Ins01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL6090_QtnReg_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ")
			}
			,
			MCBlockDef.create("QtnReg_Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL6090_QtnReg_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("QtnReg_Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6090_QtnReg_Upd01_INFO = new MCOperationInfo("MS", "MSBBL6090", "QtnReg_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6090_QtnReg_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_typ", "qtn_typ"),
				MCItemDef.create("qtn_dt", "qtn_dt"),
				MCItemDef.create("valid_dt", "valid_dt"),
				MCItemDef.create("qtn_out_flg", "qtn_out_flg"),
				MCItemDef.create("failure_flg", "failure_flg"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_back_flg", "aprv_back_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_sundry_flg", "cst_sundry_flg"),
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
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("qtn_term_cd", "qtn_term_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
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
				MCItemDef.create("qtn_prnt_seq", "qtn_prnt_seq"),
				MCItemDef.create("qtn_upd_cntr", "qtn_upd_cntr")
			}
			,
			MCBlockDef.create("QtnReg_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL6090_QtnReg_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_std_sls_upri", "trd_cur_std_sls_upri"),
				MCItemDef.create("upri_rate", "upri_rate"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("cost_amt", "cost_amt"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno_auto_flg", "sno_auto_flg"),
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
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
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
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("sls_itm_no", "sls_itm_no")
			}
			,
			MCBlockDef.create("QtnReg_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL6090_QtnReg_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ")
			}
			,
			MCBlockDef.create("QtnReg_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL6090_QtnReg_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("QtnReg_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6090_QtnReg_Del01_INFO = new MCOperationInfo("MS", "MSBBL6090", "QtnReg_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6090_QtnReg_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg")
			}
			,
			MCBlockDef.create("QtnReg_Del01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBBL6090_QtnReg_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6090", "QtnReg_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("QtnReg_Del01_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

