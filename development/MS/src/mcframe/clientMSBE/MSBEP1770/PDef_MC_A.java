package mcframe.clientMSBE.MSBEP1770;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_IvSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1770.Srch01.UP.BLOCK0")){
			return MS_MSBEL1770_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1770.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1770_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1770.Prnt01.UP.BLOCK0")){
			return MS_MSBEL1770_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1770.Prnt01.UP.BLOCK1")){
			return MS_MSBEL1770_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1770.Prnt01.DOWN.BLOCK0")){
			return MS_MSBEL1770_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1770.Prnt02.UP.BLOCK0")){
			return MS_MSBEL1770_Prnt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1770.Prnt02.UP.BLOCK1")){
			return MS_MSBEL1770_Prnt02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1770.Prnt02.DOWN.BLOCK0")){
			return MS_MSBEL1770_Prnt02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBEL1770_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1770", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1770_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1770", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("srch_mode", "srch_mode"),
				MCItemDef.create("ex_im_not_comp_flg", "ex_im_not_comp_flg"),
				MCItemDef.create("ex_im_comp_flg", "ex_im_comp_flg"),
				MCItemDef.create("purc_im_not_comp_flg", "purc_im_not_comp_flg"),
				MCItemDef.create("purc_im_comp_flg", "purc_im_comp_flg"),
				MCItemDef.create("iv_not_reg_flg", "iv_not_reg_flg"),
				MCItemDef.create("iv_reg_flg", "iv_reg_flg"),
				MCItemDef.create("pl_not_reg_flg", "pl_not_reg_flg"),
				MCItemDef.create("pl_reg_flg", "pl_reg_flg"),
				MCItemDef.create("pl_skip_flg", "pl_skip_flg"),
				MCItemDef.create("iv_prnt_yet_flg", "iv_prnt_yet_flg"),
				MCItemDef.create("iv_prnt_done_flg", "iv_prnt_done_flg"),
				MCItemDef.create("pl_prnt_yet_flg", "pl_prnt_yet_flg"),
				MCItemDef.create("pl_prnt_done_flg", "pl_prnt_done_flg"),
				MCItemDef.create("not_iv_flg", "not_iv_flg"),
				MCItemDef.create("not_inst_flg", "not_inst_flg"),
				MCItemDef.create("part_inst_flg", "part_inst_flg"),
				MCItemDef.create("inst_flg", "inst_flg"),
				MCItemDef.create("not_ship_flg", "not_ship_flg"),
				MCItemDef.create("part_ship_flg", "part_ship_flg"),
				MCItemDef.create("ship_flg", "ship_flg"),
				MCItemDef.create("not_sls_flg", "not_sls_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("comp_flg", "comp_flg"),
				MCItemDef.create("iv_not_comp_flg", "iv_not_comp_flg"),
				MCItemDef.create("iv_comp_flg", "iv_comp_flg"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("sls_cststk_invalid_flg", "sls_cststk_invalid_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("cmpl_schd_dt_fr", "cmpl_schd_dt_fr"),
				MCItemDef.create("cmpl_schd_dt_to", "cmpl_schd_dt_to"),
				MCItemDef.create("cmpl_dt_fr", "cmpl_dt_fr"),
				MCItemDef.create("cmpl_dt_to", "cmpl_dt_to"),
				MCItemDef.create("iv_dt_fr", "iv_dt_fr"),
				MCItemDef.create("iv_dt_to", "iv_dt_to"),
				MCItemDef.create("dlv_rqst_dt_p" + ".ymd_fr", "dlv_rqst_dt_fr"),
				MCItemDef.create("dlv_rqst_dt_p" + ".hm_fr", "dlv_rqst_hm_fr"),
				MCItemDef.create("dlv_rqst_dt_p" + ".ymd_to", "dlv_rqst_dt_to"),
				MCItemDef.create("dlv_rqst_dt_p" + ".hm_to", "dlv_rqst_hm_to"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_site_cd", "ship_site_cd"),
				MCItemDef.create("ship_site_nm", "ship_site_nm"),
				MCItemDef.create("ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("ship_rqst_id_typ_nm", "ship_rqst_id_typ_nm"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("ship_rqst_id_nm", "ship_rqst_id_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("ship_rqst_no", "ship_rqst_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("iv_rmrks", "iv_rmrks"),
				MCItemDef.create("iv_d_rmrks", "iv_d_rmrks"),
				MCItemDef.create("pl_rmrks", "pl_rmrks"),
				MCItemDef.create("iv_intr_rmrks", "iv_intr_rmrks"),
				MCItemDef.create("iv_d_intr_rmrks", "iv_d_intr_rmrks"),
				MCItemDef.create("iv_sub_char1", "iv_sub_char1"),
				MCItemDef.create("iv_sub_char2", "iv_sub_char2"),
				MCItemDef.create("iv_sub_char3", "iv_sub_char3"),
				MCItemDef.create("iv_d_sub_char1", "iv_d_sub_char1"),
				MCItemDef.create("iv_d_sub_char2", "iv_d_sub_char2"),
				MCItemDef.create("iv_d_sub_char3", "iv_d_sub_char3"),
				MCItemDef.create("inc_can_flg", "inc_can_flg"),
				MCItemDef.create("inc_past_flg", "inc_past_flg"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_flg1", "ship_rqst_id_grp_flg1"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd1", "ship_rqst_id_grp_cd1"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm1", "ship_rqst_id_grp_nm1"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_flg2", "ship_rqst_id_grp_flg2"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd2", "ship_rqst_id_grp_cd2"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm2", "ship_rqst_id_grp_nm2"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_flg3", "ship_rqst_id_grp_flg3"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd3", "ship_rqst_id_grp_cd3"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm3", "ship_rqst_id_grp_nm3"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_flg4", "ship_rqst_id_grp_flg4"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd4", "ship_rqst_id_grp_cd4"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm4", "ship_rqst_id_grp_nm4"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_flg5", "ship_rqst_id_grp_flg5"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd5", "ship_rqst_id_grp_cd5"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm5", "ship_rqst_id_grp_nm5"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_flg6", "ship_rqst_id_grp_flg6"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd6", "ship_rqst_id_grp_cd6"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm6", "ship_rqst_id_grp_nm6"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_flg7", "ship_rqst_id_grp_flg7"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd7", "ship_rqst_id_grp_cd7"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm7", "ship_rqst_id_grp_nm7"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_flg8", "ship_rqst_id_grp_flg8"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd8", "ship_rqst_id_grp_cd8"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm8", "ship_rqst_id_grp_nm8"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_flg9", "ship_rqst_id_grp_flg9"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd9", "ship_rqst_id_grp_cd9"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm9", "ship_rqst_id_grp_nm9"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_flg10", "ship_rqst_id_grp_flg10"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd10", "ship_rqst_id_grp_cd10"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm10", "ship_rqst_id_grp_nm10"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_flg1", "dlv_id_grp_flg1"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd1", "dlv_id_grp_cd1"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm1", "dlv_id_grp_nm1"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_flg2", "dlv_id_grp_flg2"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd2", "dlv_id_grp_cd2"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm2", "dlv_id_grp_nm2"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_flg3", "dlv_id_grp_flg3"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd3", "dlv_id_grp_cd3"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm3", "dlv_id_grp_nm3"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_flg4", "dlv_id_grp_flg4"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd4", "dlv_id_grp_cd4"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm4", "dlv_id_grp_nm4"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_flg5", "dlv_id_grp_flg5"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd5", "dlv_id_grp_cd5"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm5", "dlv_id_grp_nm5"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_flg6", "dlv_id_grp_flg6"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd6", "dlv_id_grp_cd6"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm6", "dlv_id_grp_nm6"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_flg7", "dlv_id_grp_flg7"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd7", "dlv_id_grp_cd7"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm7", "dlv_id_grp_nm7"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_flg8", "dlv_id_grp_flg8"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd8", "dlv_id_grp_cd8"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm8", "dlv_id_grp_nm8"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_flg9", "dlv_id_grp_flg9"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd9", "dlv_id_grp_cd9"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm9", "dlv_id_grp_nm9"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_flg10", "dlv_id_grp_flg10"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd10", "dlv_id_grp_cd10"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm10", "dlv_id_grp_nm10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1770_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1770", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pl_skip_flg", "pl_skip_flg"),
				MCItemDef.create("ex_im_comp_flg", "ex_im_comp_flg"),
				MCItemDef.create("non_cmpl_flg", "non_cmpl_flg"),
				MCItemDef.create("iv_ship_flg", "iv_ship_flg"),
				MCItemDef.create("iv_prnt_flg", "iv_prnt_flg"),
				MCItemDef.create("pl_prnt_flg", "pl_prnt_flg"),
				MCItemDef.create("iv_comp_flg", "iv_comp_flg"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_rev", "iv_rev"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("cmpl_schd_dt", "cmpl_schd_dt"),
				MCItemDef.create("trd_schd_dt", "trd_schd_dt"),
				MCItemDef.create("cmpl_dt", "cmpl_dt"),
				MCItemDef.create("iv_dt", "iv_dt"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_p" + ".bp_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_p" + ".bp_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_p" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_p" + ".cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_p" + ".cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("dlv_p" + ".zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_p" + ".addr1", "dlv_addr1"),
				MCItemDef.create("dlv_p" + ".addr2", "dlv_addr2"),
				MCItemDef.create("dlv_p" + ".addr3", "dlv_addr3"),
				MCItemDef.create("dlv_p" + ".addr4", "dlv_addr4"),
				MCItemDef.create("dlv_p" + ".tel", "dlv_tel"),
				MCItemDef.create("dlv_p" + ".fax", "dlv_fax"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_p" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("ship_rqst_id_typ_nm", "ship_rqst_id_typ_nm"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("ship_rqst_id_nm", "ship_rqst_id_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("via_dlv_typ_nm", "via_dlv_typ_nm"),
				MCItemDef.create("tdlv_p" + ".bp_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_p" + ".bp_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_p" + ".dlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_p" + ".lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("tdlv_p" + ".lg_grp_nm", "tdlv_lg_grp_nm"),
				MCItemDef.create("tdlv_p" + ".zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_p" + ".addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_p" + ".addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_p" + ".addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_p" + ".addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_p" + ".tel", "tdlv_tel"),
				MCItemDef.create("tdlv_p" + ".fax", "tdlv_fax"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_p" + ".dlv_cntct_psn", "tdlv_cntct_psn"),
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
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ttl_trd_cur_amt_p" + ".amt", "ttl_trd_cur_amt"),
				MCItemDef.create("ttl_trd_cur_inc_tax_amt_p" + ".amt", "ttl_trd_cur_inc_tax_amt"),
				MCItemDef.create("ttl_net_wt", "ttl_net_wt"),
				MCItemDef.create("ttl_grss_wt", "ttl_grss_wt"),
				MCItemDef.create("ttl_dim", "ttl_dim"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("pl_rmrks", "pl_rmrks"),
				MCItemDef.create("case_mrk1", "case_mrk1"),
				MCItemDef.create("case_mrk2", "case_mrk2"),
				MCItemDef.create("case_mrk3", "case_mrk3"),
				MCItemDef.create("case_mrk4", "case_mrk4"),
				MCItemDef.create("case_mrk5", "case_mrk5"),
				MCItemDef.create("case_mrk6", "case_mrk6"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("lc_no", "lc_no"),
				MCItemDef.create("lc_dt", "lc_dt"),
				MCItemDef.create("lc_rmrks", "lc_rmrks"),
				MCItemDef.create("bl_no", "bl_no"),
				MCItemDef.create("bl_dt", "bl_dt"),
				MCItemDef.create("bl_rmrks", "bl_rmrks"),
				MCItemDef.create("iv_rmrks", "iv_rmrks"),
				MCItemDef.create("pl_reg_flg", "pl_reg_flg"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pre_rcpt_iv_flg", "pre_rcpt_iv_flg"),
				MCItemDef.create("iv_reg_flg", "iv_reg_flg"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("purc_cmpl_flg", "purc_cmpl_flg"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("ship_rqst_no", "ship_rqst_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_nm", "ship_str_ln_nm"),
				MCItemDef.create("ship_site_cd", "ship_site_cd"),
				MCItemDef.create("ship_site_nm", "ship_site_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("ttl_iv_amt_p" + ".amt", "ttl_iv_amt"),
				MCItemDef.create("ttl_ncv_amt_p" + ".amt", "ttl_ncv_amt"),
				MCItemDef.create("ttl_base_amt_p" + ".amt", "ttl_base_amt"),
				MCItemDef.create("ttl_freight_amt_p" + ".amt", "ttl_freight_amt"),
				MCItemDef.create("ttl_insurance_amt_p" + ".amt", "ttl_insurance_amt"),
				MCItemDef.create("ttl_oth_amt_p" + ".amt", "ttl_oth_amt"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("ship_inst_qty_p" + ".qty", "ship_inst_qty"),
				MCItemDef.create("sum_ship_inst_qty_p" + ".qty", "sum_ship_inst_qty"),
				MCItemDef.create("ship_act_qty_p" + ".qty", "ship_act_qty"),
				MCItemDef.create("sls_qty_p" + ".qty", "sls_qty"),
				MCItemDef.create("trd_cur_upri_p" + ".upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt_p" + ".amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt_p" + ".amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt_p" + ".amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("iv_upri_p" + ".amt", "iv_upri"),
				MCItemDef.create("iv_amt_p" + ".amt", "iv_amt"),
				MCItemDef.create("ptax_cur_amt_p" + ".amt", "ptax_cur_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt_p" + ".amt", "wtax_amt"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("manual_add_flg", "manual_add_flg"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("iv_intr_rmrks", "iv_intr_rmrks"),
				MCItemDef.create("iv_sub_char1", "iv_sub_char1"),
				MCItemDef.create("iv_sub_char2", "iv_sub_char2"),
				MCItemDef.create("iv_sub_char3", "iv_sub_char3"),
				MCItemDef.create("iv_d_rmrks", "iv_d_rmrks"),
				MCItemDef.create("iv_d_intr_rmrks", "iv_d_intr_rmrks"),
				MCItemDef.create("iv_d_sub_char1", "iv_d_sub_char1"),
				MCItemDef.create("iv_d_sub_char2", "iv_d_sub_char2"),
				MCItemDef.create("iv_d_sub_char3", "iv_d_sub_char3"),
				MCItemDef.create("ship_inst_d_sub_char1", "ship_inst_d_sub_char1"),
				MCItemDef.create("ship_inst_d_sub_char2", "ship_inst_d_sub_char2"),
				MCItemDef.create("ship_inst_d_sub_char3", "ship_inst_d_sub_char3"),
				MCItemDef.create("ship_act_d_sub_char1", "ship_act_d_sub_char1"),
				MCItemDef.create("ship_act_d_sub_char2", "ship_act_d_sub_char2"),
				MCItemDef.create("ship_act_d_sub_char3", "ship_act_d_sub_char3"),
				MCItemDef.create("iv_ship_act_d_sub_char1", "iv_ship_act_d_sub_char1"),
				MCItemDef.create("iv_ship_act_d_sub_char2", "iv_ship_act_d_sub_char2"),
				MCItemDef.create("iv_ship_act_d_sub_char3", "iv_ship_act_d_sub_char3"),
				MCItemDef.create("sls_act_d_sub_char1", "sls_act_d_sub_char1"),
				MCItemDef.create("sls_act_d_sub_char2", "sls_act_d_sub_char2"),
				MCItemDef.create("sls_act_d_sub_char3", "sls_act_d_sub_char3"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd1", "ship_rqst_id_grp_cd1"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm1", "ship_rqst_id_grp_nm1"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd2", "ship_rqst_id_grp_cd2"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm2", "ship_rqst_id_grp_nm2"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd3", "ship_rqst_id_grp_cd3"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm3", "ship_rqst_id_grp_nm3"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd4", "ship_rqst_id_grp_cd4"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm4", "ship_rqst_id_grp_nm4"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd5", "ship_rqst_id_grp_cd5"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm5", "ship_rqst_id_grp_nm5"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd6", "ship_rqst_id_grp_cd6"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm6", "ship_rqst_id_grp_nm6"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd7", "ship_rqst_id_grp_cd7"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm7", "ship_rqst_id_grp_nm7"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd8", "ship_rqst_id_grp_cd8"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm8", "ship_rqst_id_grp_nm8"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd9", "ship_rqst_id_grp_cd9"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm9", "ship_rqst_id_grp_nm9"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_cd10", "ship_rqst_id_grp_cd10"),
				MCItemDef.create("ship_rqst_id_grp_p" + ".bp_grp_nm10", "ship_rqst_id_grp_nm10"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd1", "dlv_id_grp_cd1"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm1", "dlv_id_grp_nm1"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd2", "dlv_id_grp_cd2"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm2", "dlv_id_grp_nm2"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd3", "dlv_id_grp_cd3"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm3", "dlv_id_grp_nm3"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd4", "dlv_id_grp_cd4"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm4", "dlv_id_grp_nm4"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd5", "dlv_id_grp_cd5"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm5", "dlv_id_grp_nm5"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd6", "dlv_id_grp_cd6"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm6", "dlv_id_grp_nm6"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd7", "dlv_id_grp_cd7"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm7", "dlv_id_grp_nm7"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd8", "dlv_id_grp_cd8"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm8", "dlv_id_grp_nm8"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd9", "dlv_id_grp_cd9"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm9", "dlv_id_grp_nm9"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_cd10", "dlv_id_grp_cd10"),
				MCItemDef.create("dlv_id_grp_p" + ".bp_grp_nm10", "dlv_id_grp_nm10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
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
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1770_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL1770", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1770_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1770", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_rev", "iv_rev")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1770_Prnt01_UP_BLOCK1() {
		/** Ope.のBlock [Prnt01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1770", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}


	public static MCContainerDef MS_MSBEL1770_Prnt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1770", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1770_Prnt02_INFO = new MCOperationInfo("MS", "MSBEL1770", "Prnt02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1770_Prnt02_UP_BLOCK0() {
		/** Ope.のBlock [Prnt02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1770", "Prnt02",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBEL1770_Prnt02_UP_BLOCK1() {
		/** Ope.のBlock [Prnt02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1770", "Prnt02",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}


	public static MCContainerDef MS_MSBEL1770_Prnt02_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1770", "Prnt02",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

