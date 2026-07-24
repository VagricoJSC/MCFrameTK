package mcframe.serverMSBF.MSBFL5010;

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
 * [MSBFL_InspSchdService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL5010.InspSchd_Chk01.UP.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5010.InspSchd_Chk01.DOWN.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5010.InspSchd_Chk02.UP.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5010.InspSchd_Chk02.DOWN.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5010.InspSchd_Srch01.UP.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5010.InspSchd_Srch01.DOWN.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5010.InspSchd_Srch02.UP.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5010.InspSchd_Srch02.DOWN.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5010.InspSchd_Srch03.UP.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5010.InspSchd_Srch03.DOWN.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5010.InspSchd_Upd01.UP.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5010.InspSchd_Upd02.UP.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5010.InspSchd_Upd03.UP.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5010.InspSchd_Upd04.UP.BLOCK0")){
			return MS_MSBFL5010_InspSchd_Upd04_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MS_MSBFL5010_InspSchd_Chk01_INFO = new MCOperationInfo("MS", "MSBFL5010", "InspSchd_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5010_InspSchd_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("skip_chk_plnt_aprv_flg", "skip_chk_plnt_aprv_flg"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("src_no3", "src_no3"),
				MCItemDef.create("src_no4", "src_no4"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("gr_tm", "gr_tm"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd")
			}
			,
			MCBlockDef.create("InspSchd_Chk01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5010_InspSchd_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("InspSchd_Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5010_InspSchd_Chk02_INFO = new MCOperationInfo("MS", "MSBFL5010", "InspSchd_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5010_InspSchd_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no")
			}
			,
			MCBlockDef.create("InspSchd_Chk02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5010_InspSchd_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("InspSchd_Chk02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5010_InspSchd_Srch01_INFO = new MCOperationInfo("MS", "MSBFL5010", "InspSchd_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5010_InspSchd_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("no_insp_srch_flg", "no_insp_srch_flg"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("to_loc_cd", "to_loc_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("from_loc_cd", "from_loc_cd"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt")
			}
			,
			MCBlockDef.create("InspSchd_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5010_InspSchd_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("no_insp_flg", "no_insp_flg"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("vld_pd", "vld_pd"),
				MCItemDef.create("lmt_pd", "lmt_pd"),
				MCItemDef.create("lot_insp_vld_pd", "lot_insp_vld_pd"),
				MCItemDef.create("calc_pd_typ", "calc_pd_typ"),
				MCItemDef.create("lot_insp_lmt_dt_frm_typ", "lot_insp_lmt_dt_frm_typ"),
				MCItemDef.create("insp_inst_issue_typ", "insp_inst_issue_typ"),
				MCItemDef.create("insp_offst", "insp_offst"),
				MCItemDef.create("inst_rslt_issue_flg", "inst_rslt_issue_flg"),
				MCItemDef.create("pre_insp_valid_flg", "pre_insp_valid_flg"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_lt", "insp_lt"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("spl_qty", "spl_qty"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("plnt_aprv_role_cd", "plnt_aprv_role_cd"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("insp_aprv_role_cd", "insp_aprv_role_cd"),
				MCItemDef.create("so_prmt_insp_flg", "so_prmt_insp_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("insp_bind_typ", "insp_bind_typ"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("no_mrkt_judg_flg", "no_mrkt_judg_flg"),
				MCItemDef.create("mrkt_judg_flg", "mrkt_judg_flg"),
				MCItemDef.create("mrkt_judg_role_cd", "mrkt_judg_role_cd"),
				MCItemDef.create("lmt_ctl_flg", "lmt_ctl_flg"),
				MCItemDef.create("lmt_ctl_categ", "lmt_ctl_categ"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt")
			}
			,
			MCBlockDef.create("InspSchd_Srch01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5010_InspSchd_Srch02_INFO = new MCOperationInfo("MS", "MSBFL5010", "InspSchd_Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5010_InspSchd_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("src_no3", "src_no3"),
				MCItemDef.create("src_no4", "src_no4"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gr_dt", "gr_dt"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("from_loc_cd", "from_loc_cd"),
				MCItemDef.create("not_stk_flg", "not_stk_flg")
			}
			,
			MCBlockDef.create("InspSchd_Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5010_InspSchd_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ")
			}
			,
			MCBlockDef.create("InspSchd_Srch02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5010_InspSchd_Srch03_INFO = new MCOperationInfo("MS", "MSBFL5010", "InspSchd_Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5010_InspSchd_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("schd_gr_dt", "schd_gr_dt"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("to_loc_cd", "to_loc_cd"),
				MCItemDef.create("from_loc_cd", "from_loc_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("insp_flg", "insp_flg")
			}
			,
			MCBlockDef.create("InspSchd_Srch03_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5010_InspSchd_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt")
			}
			,
			MCBlockDef.create("InspSchd_Srch03_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5010_InspSchd_Upd01_INFO = new MCOperationInfo("MS", "MSBFL5010", "InspSchd_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5010_InspSchd_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("act_flg", "act_flg"),
				MCItemDef.create("sts_schd_flg", "sts_schd_flg"),
				MCItemDef.create("src_no1", "src_no1"),
				MCItemDef.create("src_no2", "src_no2"),
				MCItemDef.create("src_no3", "src_no3"),
				MCItemDef.create("src_no4", "src_no4"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("gr_tm", "gr_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("to_loc_cd", "to_loc_cd"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("not_stk_flg", "not_stk_flg"),
				MCItemDef.create("dlv_cd", "dlv_cd")
			}
			,
			MCBlockDef.create("InspSchd_Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5010_InspSchd_Upd02_INFO = new MCOperationInfo("MS", "MSBFL5010", "InspSchd_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5010_InspSchd_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no")
			}
			,
			MCBlockDef.create("InspSchd_Upd02_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5010_InspSchd_Upd03_INFO = new MCOperationInfo("MS", "MSBFL5010", "InspSchd_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5010_InspSchd_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Upd03",
			new MCItemDef[]{
				MCItemDef.create("insp_schd" + ".src_no4", "src_no4"),
				MCItemDef.create("insp_schd" + ".insp_typ", "insp_typ")
			}
			,
			MCBlockDef.create("InspSchd_Upd03_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5010_InspSchd_Upd04_INFO = new MCOperationInfo("MS", "MSBFL5010", "InspSchd_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5010_InspSchd_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5010", "InspSchd_Upd04",
			new MCItemDef[]{
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd")
			}
			,
			MCBlockDef.create("InspSchd_Upd04_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

