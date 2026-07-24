package mcframe.serverMSBC.MSBCL0160;

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
 * [MSBCL_SimOrdSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL0160.Srch01.UP.BLOCK0")){
			return MS_MSBCL0160_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0160.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL0160_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0160.Chk01.UP.BLOCK0")){
			return MS_MSBCL0160_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0160.Chk01.DOWN.BLOCK0")){
			return MS_MSBCL0160_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0160.Chk02.UP.BLOCK0")){
			return MS_MSBCL0160_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0160.Chk02.DOWN.BLOCK0")){
			return MS_MSBCL0160_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0160.Upd01.UP.BLOCK0")){
			return MS_MSBCL0160_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0160.Upd01.DOWN.BLOCK0")){
			return MS_MSBCL0160_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0160.Upd02.UP.BLOCK0")){
			return MS_MSBCL0160_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0160.Upd02.DOWN.BLOCK0")){
			return MS_MSBCL0160_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBCL0160_Srch01_INFO = new MCOperationInfo("MS", "MSBCL0160", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0160_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("opn", "opn"),
				MCItemDef.create("exp", "exp"),
				MCItemDef.create("po_schd_dt_fr", "po_schd_dt_fr"),
				MCItemDef.create("po_schd_dt_to", "po_schd_dt_to"),
				MCItemDef.create("mfg_st_schd_dt_fr", "mfg_st_schd_dt_fr"),
				MCItemDef.create("mfg_st_schd_dt_to", "mfg_st_schd_dt_to"),
				MCItemDef.create("mfg_end_schd_dt_fr", "mfg_end_schd_dt_fr"),
				MCItemDef.create("mfg_end_schd_dt_to", "mfg_end_schd_dt_to"),
				MCItemDef.create("gi_schd_dt_fr", "gi_schd_dt_fr"),
				MCItemDef.create("gi_schd_dt_to", "gi_schd_dt_to"),
				MCItemDef.create("strg_schd_dt_fr", "strg_schd_dt_fr"),
				MCItemDef.create("strg_schd_dt_to", "strg_schd_dt_to"),
				MCItemDef.create("accpt_schd_dt_fr", "accpt_schd_dt_fr"),
				MCItemDef.create("accpt_schd_dt_to", "accpt_schd_dt_to"),
				MCItemDef.create("insp_st_schd_dt_fr", "insp_st_schd_dt_fr"),
				MCItemDef.create("insp_st_schd_dt_to", "insp_st_schd_dt_to"),
				MCItemDef.create("insp_end_schd_dt_fr", "insp_end_schd_dt_fr"),
				MCItemDef.create("insp_end_schd_dt_to", "insp_end_schd_dt_to"),
				MCItemDef.create("avl_schd_dt_fr", "avl_schd_dt_fr"),
				MCItemDef.create("avl_schd_dt_to", "avl_schd_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("strg_site_cd", "strg_site_cd"),
				MCItemDef.create("strg_site_nm", "strg_site_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("strg_lg_grp_cd", "strg_lg_grp_cd"),
				MCItemDef.create("strg_lg_grp_nm", "strg_lg_grp_nm"),
				MCItemDef.create("strg_alloc_grp_cd", "strg_alloc_grp_cd"),
				MCItemDef.create("strg_alloc_grp_nm", "strg_alloc_grp_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("mfg_site_cd", "mfg_site_cd"),
				MCItemDef.create("mfg_site_nm", "mfg_site_nm"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("mfg_loc_grp_nm", "mfg_loc_grp_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("rqst_site_cd", "rqst_site_cd"),
				MCItemDef.create("rqst_site_nm", "rqst_site_nm"),
				MCItemDef.create("rqst_loc_grp_cd", "rqst_loc_grp_cd"),
				MCItemDef.create("rqst_loc_grp_nm", "rqst_loc_grp_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("xfr_flg", "xfr_flg"),
				MCItemDef.create("wg_xfr_flg", "wg_xfr_flg"),
				MCItemDef.create("true_not_fix_flg", "true_not_fix_flg"),
				MCItemDef.create("false_not_fix_flg", "false_not_fix_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("ord_gnrt_typ", "ord_gnrt_typ"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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


	public static MCContainerDef MS_MSBCL0160_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("exp_flg", "exp_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("itm_ord_typ_nm", "itm_ord_typ_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("nmr_qty", "nmr_qty"),
				MCItemDef.create("dnm_qty", "dnm_qty"),
				MCItemDef.create("fxd_yield_qty", "fxd_yield_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_inst_qty", "cont_fctr_inst_qty"),
				MCItemDef.create("cont_fctr_schd_yield", "cont_fctr_schd_yield"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_lt", "mfg_lt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("xfr_lt", "xfr_lt"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_lt", "insp_lt"),
				MCItemDef.create("insp_offst", "insp_offst"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("strg_site_cd", "strg_site_cd"),
				MCItemDef.create("strg_site_nm", "strg_site_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("strg_lg_grp_cd", "strg_lg_grp_cd"),
				MCItemDef.create("strg_lg_grp_nm", "strg_lg_grp_nm"),
				MCItemDef.create("strg_alloc_grp_cd", "strg_alloc_grp_cd"),
				MCItemDef.create("strg_alloc_grp_nm", "strg_alloc_grp_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("mfg_site_cd", "mfg_site_cd"),
				MCItemDef.create("mfg_site_nm", "mfg_site_nm"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("mfg_loc_grp_nm", "mfg_loc_grp_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_site_cd", "rqst_site_cd"),
				MCItemDef.create("rqst_site_nm", "rqst_site_nm"),
				MCItemDef.create("rqst_loc_grp_cd", "rqst_loc_grp_cd"),
				MCItemDef.create("rqst_loc_grp_nm", "rqst_loc_grp_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("ord_gnrt_typ", "ord_gnrt_typ"),
				MCItemDef.create("ord_gnrt_typ_nm", "ord_gnrt_typ_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("not_fix_flg", "not_fix_flg"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("can_exp_flg", "can_exp_flg"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
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
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("sim_mrp_upd_cntr", "sim_mrp_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0160_Chk01_INFO = new MCOperationInfo("MS", "MSBCL0160", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0160_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0160", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("sim_mrp_upd_cntr", "sim_mrp_upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL0160_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0160", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0160_Chk02_INFO = new MCOperationInfo("MS", "MSBCL0160", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0160_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0160", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("sim_mrp_upd_cntr", "sim_mrp_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL0160_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0160", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0160_Upd01_INFO = new MCOperationInfo("MS", "MSBCL0160", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0160_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0160", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("sim_mrp_upd_cntr", "sim_mrp_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL0160_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0160", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("exp_flg", "exp_flg")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0160_Upd02_INFO = new MCOperationInfo("MS", "MSBCL0160", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0160_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0160", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("sim_mrp_upd_cntr", "sim_mrp_upd_cntr")
			}
			,
			MCBlockDef.create("Upd02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL0160_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0160", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("exp_flg", "exp_flg")
			}
			,
			MCBlockDef.create("Upd02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

