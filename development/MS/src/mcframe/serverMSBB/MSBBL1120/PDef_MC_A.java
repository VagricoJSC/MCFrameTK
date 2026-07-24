package mcframe.serverMSBB.MSBBL1120;

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
 * [MSBBL_QtnSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL1120.Srch01.UP.BLOCK0")){
			return MS_MSBBL1120_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1120.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL1120_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1120.Prnt01.UP.BLOCK0")){
			return MS_MSBBL1120_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1120.Prnt01.UP.BLOCK1")){
			return MS_MSBBL1120_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1120.Prnt01.DOWN.BLOCK0")){
			return MS_MSBBL1120_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBBL1120_Srch01_INFO = new MCOperationInfo("MS", "MSBBL1120", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1120_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("disp", "disp"),
				MCItemDef.create("creating", "creating"),
				MCItemDef.create("pre_qtn", "pre_qtn"),
				MCItemDef.create("qtn", "qtn"),
				MCItemDef.create("non", "non"),
				MCItemDef.create("part", "part"),
				MCItemDef.create("compl", "compl"),
				MCItemDef.create("opn", "opn"),
				MCItemDef.create("fix", "fix"),
				MCItemDef.create("acpt", "acpt"),
				MCItemDef.create("rjct", "rjct"),
				MCItemDef.create("last_rjct", "last_rjct"),
				MCItemDef.create("excld", "excld"),
				MCItemDef.create("yet", "yet"),
				MCItemDef.create("prnt", "prnt"),
				MCItemDef.create("iv_trgt_flg", "iv_trgt_flg"),
				MCItemDef.create("iv_not_trgt_flg", "iv_not_trgt_flg"),
				MCItemDef.create("qtn_dt_fr", "qtn_dt_fr"),
				MCItemDef.create("qtn_dt_to", "qtn_dt_to"),
				MCItemDef.create("valid_dt_fr", "valid_dt_fr"),
				MCItemDef.create("valid_dt_to", "valid_dt_to"),
				MCItemDef.create("rcpt_dt_fr", "rcpt_dt_fr"),
				MCItemDef.create("rcpt_dt_to", "rcpt_dt_to"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("qtn_rmrks", "qtn_rmrks"),
				MCItemDef.create("qtn_d_rmrks", "qtn_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("cst_qtn_rqst_no", "cst_qtn_rqst_no"),
				MCItemDef.create("cst_qtn_rqst_d_no", "cst_qtn_rqst_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("qtn_rslt_rsn_cd", "qtn_rslt_rsn_cd"),
				MCItemDef.create("qtn_rslt_rsn_nm", "qtn_rslt_rsn_nm"),
				MCItemDef.create("qtn_d_rslt_rsn_cd", "qtn_d_rslt_rsn_cd"),
				MCItemDef.create("qtn_d_rslt_rsn_nm", "qtn_d_rslt_rsn_nm"),
				MCItemDef.create("qtn_term_cd", "qtn_term_cd"),
				MCItemDef.create("qtn_term_nm", "qtn_term_nm"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("rcpt_usr_nm", "rcpt_usr_nm"),
				MCItemDef.create("qtn_sub_char1", "qtn_sub_char1"),
				MCItemDef.create("qtn_sub_char2", "qtn_sub_char2"),
				MCItemDef.create("qtn_sub_char3", "qtn_sub_char3"),
				MCItemDef.create("qtn_d_sub_char1", "qtn_d_sub_char1"),
				MCItemDef.create("qtn_d_sub_char2", "qtn_d_sub_char2"),
				MCItemDef.create("qtn_d_sub_char3", "qtn_d_sub_char3"),
				MCItemDef.create("inc_failure_flg", "inc_failure_flg"),
				MCItemDef.create("inc_can_flg", "inc_can_flg"),
				MCItemDef.create("cst_grp_flg1", "cst_grp_flg1"),
				MCItemDef.create("cst_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_flg2", "cst_grp_flg2"),
				MCItemDef.create("cst_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_flg3", "cst_grp_flg3"),
				MCItemDef.create("cst_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_flg4", "cst_grp_flg4"),
				MCItemDef.create("cst_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_flg5", "cst_grp_flg5"),
				MCItemDef.create("cst_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_flg6", "cst_grp_flg6"),
				MCItemDef.create("cst_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_flg7", "cst_grp_flg7"),
				MCItemDef.create("cst_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_flg8", "cst_grp_flg8"),
				MCItemDef.create("cst_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_flg9", "cst_grp_flg9"),
				MCItemDef.create("cst_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_flg10", "cst_grp_flg10"),
				MCItemDef.create("cst_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_nm10", "cst_grp_nm10"),
				MCItemDef.create("dlv_grp_flg1", "dlv_grp_flg1"),
				MCItemDef.create("dlv_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_flg2", "dlv_grp_flg2"),
				MCItemDef.create("dlv_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_flg3", "dlv_grp_flg3"),
				MCItemDef.create("dlv_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_flg4", "dlv_grp_flg4"),
				MCItemDef.create("dlv_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_flg5", "dlv_grp_flg5"),
				MCItemDef.create("dlv_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_flg6", "dlv_grp_flg6"),
				MCItemDef.create("dlv_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_flg7", "dlv_grp_flg7"),
				MCItemDef.create("dlv_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_flg8", "dlv_grp_flg8"),
				MCItemDef.create("dlv_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_flg9", "dlv_grp_flg9"),
				MCItemDef.create("dlv_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_flg10", "dlv_grp_flg10"),
				MCItemDef.create("dlv_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1120_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("qtn_sts_typ", "qtn_sts_typ"),
				MCItemDef.create("qtn_sts_typ_nm", "qtn_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_prnt_seq", "qtn_prnt_seq"),
				MCItemDef.create("qtn_d_no", "qtn_d_no"),
				MCItemDef.create("qtn_dt", "qtn_dt"),
				MCItemDef.create("valid_dt", "valid_dt"),
				MCItemDef.create("qtn_typ", "qtn_typ"),
				MCItemDef.create("qtn_typ_nm", "qtn_typ_nm"),
				MCItemDef.create("failure_flg", "failure_flg"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("qtn_prnt_flg", "qtn_prnt_flg"),
				MCItemDef.create("qtn_prnt_dt", "qtn_prnt_dt"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("qtn_term_cd", "qtn_term_cd"),
				MCItemDef.create("qtn_term_nm", "qtn_term_nm"),
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
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("cst_qtn_rqst_no", "cst_qtn_rqst_no"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("rcpt_usr_nm", "rcpt_usr_nm"),
				MCItemDef.create("qtn_rmrks", "qtn_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("qtn_rslt_rsn_cd", "qtn_rslt_rsn_cd"),
				MCItemDef.create("qtn_rslt_rsn_nm", "qtn_rslt_rsn_nm"),
				MCItemDef.create("qtn_rslt_rsn_rmrks", "qtn_rslt_rsn_rmrks"),
				MCItemDef.create("qtn_sub_char1", "qtn_sub_char1"),
				MCItemDef.create("qtn_sub_char2", "qtn_sub_char2"),
				MCItemDef.create("qtn_sub_char3", "qtn_sub_char3"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_qty_dec_place", "trd_qty_dec_place"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_qty_dec_place", "base_qty_dec_place"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_std_sls_upri", "trd_cur_std_sls_upri"),
				MCItemDef.create("trd_cur_std_sls_amt", "trd_cur_std_sls_amt"),
				MCItemDef.create("trd_cur_std_sls_inc_tax_amt", "trd_cur_std_sls_inc_tax_amt"),
				MCItemDef.create("upri_rate", "upri_rate"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_std_sls_tax_amt", "trd_cur_std_sls_tax_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_std_upri", "base_cur_std_upri"),
				MCItemDef.create("base_cur_std_amt", "base_cur_std_amt"),
				MCItemDef.create("base_cur_std_inc_tax_amt", "base_cur_std_inc_tax_amt"),
				MCItemDef.create("base_cur_std_tax_amt", "base_cur_std_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("qtn_d_rmrks", "qtn_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("qtn_d_rslt_rsn_cd", "qtn_d_rslt_rsn_cd"),
				MCItemDef.create("qtn_d_rslt_rsn_nm", "qtn_d_rslt_rsn_nm"),
				MCItemDef.create("qtn_d_rslt_rsn_rmrks", "qtn_d_rslt_rsn_rmrks"),
				MCItemDef.create("slo_trnst_qty", "slo_trnst_qty"),
				MCItemDef.create("sls_trnst_qty", "sls_trnst_qty"),
				MCItemDef.create("qtn_d_sub_char1", "qtn_d_sub_char1"),
				MCItemDef.create("qtn_d_sub_char2", "qtn_d_sub_char2"),
				MCItemDef.create("qtn_d_sub_char3", "qtn_d_sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("cst_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_nm10", "cst_grp_nm10"),
				MCItemDef.create("dlv_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1120_Prnt01_INFO = new MCOperationInfo("MS", "MSBBL1120", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1120_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1120", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_prnt_seq", "qtn_prnt_seq")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBBL1120_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1120", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Prnt01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1120_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1120", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

