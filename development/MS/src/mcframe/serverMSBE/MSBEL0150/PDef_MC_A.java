package mcframe.serverMSBE.MSBEL0150;

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
 * [MSBEL_AllocPrio]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL0150.Srch01.UP.BLOCK0")){
			return MS_MSBEL0150_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0150.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL0150_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0150.Srch01.DOWN.BLOCK1")){
			return MS_MSBEL0150_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL0150.Chk01.UP.BLOCK0")){
			return MS_MSBEL0150_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0150.Chk01.DOWN.BLOCK0")){
			return MS_MSBEL0150_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0150.Upd01.UP.BLOCK0")){
			return MS_MSBEL0150_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0150.Sprt01.UP.BLOCK0")){
			return MS_MSBEL0150_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0150.Sprt01.DOWN.BLOCK0")){
			return MS_MSBEL0150_Sprt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBEL0150_Srch01_INFO = new MCOperationInfo("MS", "MSBEL0150", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0150_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0150", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL0150_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0150", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("prms_delay_flg", "prms_delay_flg"),
				MCItemDef.create("split_flg", "split_flg"),
				MCItemDef.create("pre_alloc_prio", "pre_alloc_prio"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("ship_schd_hm", "ship_schd_hm"),
				MCItemDef.create("prms_dlv_dt", "prms_dlv_dt"),
				MCItemDef.create("prms_dlv_hm", "prms_dlv_hm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("alloc_ship_lg_grp_cd", "alloc_ship_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("alloc_avl_qty", "alloc_avl_qty"),
				MCItemDef.create("alloc_qty", "alloc_qty"),
				MCItemDef.create("wait_qty", "wait_qty"),
				MCItemDef.create("not_alloc_avail_qty", "not_alloc_avail_qty"),
				MCItemDef.create("cml_not_alloc_avail_qty", "cml_not_alloc_avail_qty"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("pack_alloc_flg", "pack_alloc_flg"),
				MCItemDef.create("valid_dt_fr", "valid_dt_fr"),
				MCItemDef.create("valid_dt_fr_grp", "valid_dt_fr_grp"),
				MCItemDef.create("valid_dt_to", "valid_dt_to"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt")
			}
			,
			MCBlockDef.create("Srch01_AllocDtl")
		);
	}
	public static MCContainerDef MS_MSBEL0150_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL0150", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("ship_schd_hm", "ship_schd_hm"),
				MCItemDef.create("prms_dlv_dt", "prms_dlv_dt"),
				MCItemDef.create("prms_dlv_hm", "prms_dlv_hm"),
				MCItemDef.create("alloc_typ", "alloc_typ"),
				MCItemDef.create("alloc_typ_nm", "alloc_typ_nm"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("alloc_qty", "alloc_qty"),
				MCItemDef.create("wait_qty", "wait_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place")
			}
			,
			MCBlockDef.create("Srch01_AllocExDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0150_Chk01_INFO = new MCOperationInfo("MS", "MSBEL0150", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0150_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0150", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("alloc_prio", "alloc_prio"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd")
			}
			,
			MCBlockDef.create("Chk01_AllocDtl")
		);
	}


	public static MCContainerDef MS_MSBEL0150_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0150", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("alloc_prio", "alloc_prio"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd")
			}
			,
			MCBlockDef.create("Chk01_AllocDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0150_Upd01_INFO = new MCOperationInfo("MS", "MSBEL0150", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0150_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0150", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("alloc_prio", "alloc_prio"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd")
			}
			,
			MCBlockDef.create("Upd01_AllocDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0150_Sprt01_INFO = new MCOperationInfo("MS", "MSBEL0150", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0150_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0150", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("pre_alloc_prio", "pre_alloc_prio"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_schd_dt", "ship_schd_dt"),
				MCItemDef.create("ship_schd_hm", "ship_schd_hm"),
				MCItemDef.create("prms_dlv_dt", "prms_dlv_dt"),
				MCItemDef.create("prms_dlv_hm", "prms_dlv_hm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_scope_typ", "alloc_scope_typ"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_to_lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("alloc_ship_lg_grp_cd", "alloc_ship_lg_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ship_schd_tm", "ship_schd_tm"),
				MCItemDef.create("dlv_schd_tm", "dlv_schd_tm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("alloc_qty", "alloc_qty"),
				MCItemDef.create("wait_qty", "wait_qty"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("pack_alloc_flg", "pack_alloc_flg"),
				MCItemDef.create("valid_dt_fr", "valid_dt_fr"),
				MCItemDef.create("valid_dt_fr_grp", "valid_dt_fr_grp"),
				MCItemDef.create("valid_dt_to", "valid_dt_to"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL0150_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL0150", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("prms_delay_flg", "prms_delay_flg"),
				MCItemDef.create("split_flg", "split_flg"),
				MCItemDef.create("alloc_avl_qty", "alloc_avl_qty"),
				MCItemDef.create("not_alloc_avail_qty", "not_alloc_avail_qty"),
				MCItemDef.create("cml_not_alloc_avail_qty", "cml_not_alloc_avail_qty"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

