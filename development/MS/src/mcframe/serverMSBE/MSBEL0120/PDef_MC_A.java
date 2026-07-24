package mcframe.serverMSBE.MSBEL0120;

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
 * [MSBEL_AllocChng]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL0120.Srch01.UP.BLOCK0")){
			return MS_MSBEL0120_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0120.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL0120_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0120.Srch01.DOWN.BLOCK1")){
			return MS_MSBEL0120_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL0120.Chk01.UP.BLOCK0")){
			return MS_MSBEL0120_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0120.Chk01.UP.BLOCK1")){
			return MS_MSBEL0120_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL0120.Chk01.DOWN.BLOCK0")){
			return MS_MSBEL0120_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0120.Chk01.DOWN.BLOCK1")){
			return MS_MSBEL0120_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL0120.Upd01.UP.BLOCK0")){
			return MS_MSBEL0120_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0120.Upd01.UP.BLOCK1")){
			return MS_MSBEL0120_Upd01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBEL0120_Srch01_INFO = new MCOperationInfo("MS", "MSBEL0120", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0120_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ship_schd_no", "ship_schd_no")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL0120_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_typ_nm", "ship_to_id_typ_nm"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("ship_lg_grp_nm", "ship_lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
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
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("ship_schd_split_typ_nm", "ship_schd_split_typ_nm"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("alloc_scope_typ_nm", "alloc_scope_typ_nm"),
				MCItemDef.create("not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("ship_rqst_dt", "ship_rqst_dt"),
				MCItemDef.create("ship_rqst_hm", "ship_rqst_hm"),
				MCItemDef.create("pd_inst_dlv_dt", "pd_inst_dlv_dt"),
				MCItemDef.create("pd_inst_dlv_hm", "pd_inst_dlv_hm"),
				MCItemDef.create("dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("dlv_inst_hm", "dlv_inst_hm"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("ship_schd_hm", "ship_schd_hm"),
				MCItemDef.create("dlv_schd_dt", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_hm", "dlv_schd_hm"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("pack_alloc_flg", "pack_alloc_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("alloc_qty", "alloc_qty"),
				MCItemDef.create("wait_qty", "wait_qty"),
				MCItemDef.create("wait_rem_qty", "wait_rem_qty"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg")
			}
			,
			MCBlockDef.create("Srch01_ShipSchdRslt")
		);
	}
	public static MCContainerDef MS_MSBEL0120_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("vstk_in_schd_flg", "vstk_in_schd_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("ship_str_ln_nm", "ship_str_ln_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("pack_unit_conv_base_qty", "pack_unit_conv_base_qty"),
				MCItemDef.create("pack_unit_conv_qty", "pack_unit_conv_qty"),
				MCItemDef.create("alloc_abl_qty", "alloc_abl_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("alloc_abl_base_unit_qty", "alloc_abl_base_unit_qty"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_hm", "dlv_rqst_hm"),
				MCItemDef.create("ship_rqst_dt", "ship_rqst_dt"),
				MCItemDef.create("ship_rqst_hm", "ship_rqst_hm"),
				MCItemDef.create("pd_inst_dlv_dt", "pd_inst_dlv_dt"),
				MCItemDef.create("pd_inst_dlv_hm", "pd_inst_dlv_hm"),
				MCItemDef.create("dlv_inst_dt", "dlv_inst_dt"),
				MCItemDef.create("dlv_inst_hm", "dlv_inst_hm"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("ship_schd_hm", "ship_schd_hm"),
				MCItemDef.create("dlv_schd_dt", "dlv_schd_dt"),
				MCItemDef.create("dlv_schd_hm", "dlv_schd_hm"),
				MCItemDef.create("rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_nm", "rqst_usr_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_typ_nm", "ship_to_id_typ_nm"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("alloc_scope_typ_nm", "alloc_scope_typ_nm"),
				MCItemDef.create("not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_ShipAllocRslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0120_Chk01_INFO = new MCOperationInfo("MS", "MSBEL0120", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0120_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0120", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("ShipSchd")
		);
	}

	public static MCContainerDef MS_MSBEL0120_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL0120", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("alloc_chng_qty", "alloc_chng_qty"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd")
			}
			,
			MCBlockDef.create("ShipAlloc")
		);
	}


	public static MCContainerDef MS_MSBEL0120_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0120", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("ship_pr_ship_rqst_tm", "ship_pr_ship_rqst_tm"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("def_loc_cd", "def_loc_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("dlv_inst_rcpt_no", "dlv_inst_rcpt_no"),
				MCItemDef.create("slo_prms_no", "slo_prms_no"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("alloc_ship_lg_grp_cd", "alloc_ship_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("pd_inst_dlv_tm", "pd_inst_dlv_tm"),
				MCItemDef.create("ship_rqst_tm", "ship_rqst_tm"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_wk_cd", "ship_wk_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
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
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("alloc_qty", "alloc_qty"),
				MCItemDef.create("wait_qty", "wait_qty"),
				MCItemDef.create("ship_inst_qty", "ship_inst_qty"),
				MCItemDef.create("ship_act_qty", "ship_act_qty"),
				MCItemDef.create("iv_schd_qty", "iv_schd_qty"),
				MCItemDef.create("iv_act_qty", "iv_act_qty"),
				MCItemDef.create("sls_qty", "sls_qty"),
				MCItemDef.create("dlv_qty", "dlv_qty"),
				MCItemDef.create("ship_ret_qty", "ship_ret_qty"),
				MCItemDef.create("abort_qty", "abort_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_dt_calc_flg", "not_dt_calc_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("alloc_prio", "alloc_prio"),
				MCItemDef.create("ship_abl_flg", "ship_abl_flg"),
				MCItemDef.create("ship_lot_chk_tar_flg", "ship_lot_chk_tar_flg"),
				MCItemDef.create("ship_block_flg", "ship_block_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("ship_skip_flg", "ship_skip_flg"),
				MCItemDef.create("re_ship_schd_flg", "re_ship_schd_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("pack_alloc_flg", "pack_alloc_flg"),
				MCItemDef.create("dlv_day_week_typ", "dlv_day_week_typ"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ShipSchd")
		);
	}
	public static MCContainerDef MS_MSBEL0120_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL0120", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("alloc_chng_qty", "alloc_chng_qty"),
				MCItemDef.create("vstk_in_schd_flg", "vstk_in_schd_flg"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("ship_lg_grp_cd", "ship_lg_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("alloc_abl_qty", "alloc_abl_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("pack_unit_conv_base_qty", "pack_unit_conv_base_qty"),
				MCItemDef.create("pack_unit_conv_qty", "pack_unit_conv_qty"),
				MCItemDef.create("alloc_chng_base_unit_qty", "alloc_chng_base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ")
			}
			,
			MCBlockDef.create("ShipAlloc")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0120_Upd01_INFO = new MCOperationInfo("MS", "MSBEL0120", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0120_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0120", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_ShipSchd")
		);
	}

	public static MCContainerDef MS_MSBEL0120_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL0120", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("alloc_chng_qty", "alloc_chng_qty"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd")
			}
			,
			MCBlockDef.create("Upd01_ShipAlloc")
		);
	}


	//FMCB DEF_CLASSES END
}

