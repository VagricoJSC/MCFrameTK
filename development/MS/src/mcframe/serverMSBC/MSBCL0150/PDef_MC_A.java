package mcframe.serverMSBC.MSBCL0150;

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
 * [MSBCL_SimRqmtReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL0150.Srch01.UP.BLOCK0")){
			return MS_MSBCL0150_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0150.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL0150_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0150.Srch01.DOWN.BLOCK1")){
			return MS_MSBCL0150_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0150.Sprt01.UP.BLOCK0")){
			return MS_MSBCL0150_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0150.Sprt01.DOWN.BLOCK0")){
			return MS_MSBCL0150_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0150.Chk01.UP.BLOCK0")){
			return MS_MSBCL0150_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0150.Chk01.UP.BLOCK1")){
			return MS_MSBCL0150_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0150.Chk01.UP.BLOCK2")){
			return MS_MSBCL0150_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL0150.Chk01.DOWN.BLOCK0")){
			return MS_MSBCL0150_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0150.Chk01.DOWN.BLOCK1")){
			return MS_MSBCL0150_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0150.Imp01.UP.BLOCK0")){
			return MS_MSBCL0150_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0150.Imp01.DOWN.BLOCK0")){
			return MS_MSBCL0150_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0150.Upd01.UP.BLOCK0")){
			return MS_MSBCL0150_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0150.Upd01.UP.BLOCK1")){
			return MS_MSBCL0150_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0150.Upd01.DOWN.BLOCK0")){
			return MS_MSBCL0150_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0150.Upd01.DOWN.BLOCK1")){
			return MS_MSBCL0150_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0150.Upd02.UP.BLOCK0")){
			return MS_MSBCL0150_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0150.Del01.UP.BLOCK0")){
			return MS_MSBCL0150_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0150.Del01.DOWN.BLOCK0")){
			return MS_MSBCL0150_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBCL0150_Srch01_INFO = new MCOperationInfo("MS", "MSBCL0150", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0150_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sim_usr_cd", "sim_usr_cd"),
				MCItemDef.create("sim_usr_nm", "sim_usr_nm"),
				MCItemDef.create("mrp_proc_dt_from", "mrp_proc_dt_from"),
				MCItemDef.create("mrp_proc_dt_to", "mrp_proc_dt_to"),
				MCItemDef.create("sim_mrp_intr_rmrks", "sim_mrp_intr_rmrks"),
				MCItemDef.create("sim_mrp_sub_char1", "sim_mrp_sub_char1"),
				MCItemDef.create("sim_mrp_sub_char2", "sim_mrp_sub_char2"),
				MCItemDef.create("sim_mrp_sub_char3", "sim_mrp_sub_char3")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0150_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no1", "peg_no1"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ"),
				MCItemDef.create("sim_mrp_typ_nm", "sim_mrp_typ_nm"),
				MCItemDef.create("sim_usr_cd", "sim_usr_cd"),
				MCItemDef.create("sim_usr_nm", "sim_usr_nm"),
				MCItemDef.create("mrp_proc_dt", "mrp_proc_dt"),
				MCItemDef.create("dly_rqmt_flg", "dly_rqmt_flg"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("gr_flg", "gr_flg"),
				MCItemDef.create("gi_flg", "gi_flg"),
				MCItemDef.create("ship_flg", "ship_flg"),
				MCItemDef.create("tree_lvl", "tree_lvl"),
				MCItemDef.create("exp_flg", "exp_flg"),
				MCItemDef.create("sim_mrp_intr_rmrks", "sim_mrp_intr_rmrks"),
				MCItemDef.create("sim_mrp_sub_char1", "sim_mrp_sub_char1"),
				MCItemDef.create("sim_mrp_sub_char2", "sim_mrp_sub_char2"),
				MCItemDef.create("sim_mrp_sub_char3", "sim_mrp_sub_char3"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	public static MCContainerDef MS_MSBCL0150_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no1", "peg_no1"),
				MCItemDef.create("peg_no2", "peg_no2"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("unit_dec_place", "unit_dec_place"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("rqmt_sno1_flg", "rqmt_sno1_flg"),
				MCItemDef.create("sno1_num_typ", "sno1_num_typ"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("rqmt_sno2_flg", "rqmt_sno2_flg"),
				MCItemDef.create("sno2_num_typ", "sno2_num_typ"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("rqmt_sno3_flg", "rqmt_sno3_flg"),
				MCItemDef.create("sno3_num_typ", "sno3_num_typ"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("rqmt_sno4_flg", "rqmt_sno4_flg"),
				MCItemDef.create("sno4_num_typ", "sno4_num_typ"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("rqmt_typ_nm", "rqmt_typ_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Rslt2")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0150_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL0150", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0150_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no2", "peg_no2"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno_sprt_flg", "sno_sprt_flg")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL0150_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no2", "peg_no2"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0150_Chk01_INFO = new MCOperationInfo("MS", "MSBCL0150", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0150_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no1", "peg_no1"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ"),
				MCItemDef.create("sim_usr_cd", "sim_usr_cd"),
				MCItemDef.create("tree_lvl", "tree_lvl"),
				MCItemDef.create("mrp_proc_dt", "mrp_proc_dt"),
				MCItemDef.create("exp_flg", "exp_flg"),
				MCItemDef.create("sim_mrp_intr_rmrks", "sim_mrp_intr_rmrks"),
				MCItemDef.create("sim_mrp_sub_char1", "sim_mrp_sub_char1"),
				MCItemDef.create("sim_mrp_sub_char2", "sim_mrp_sub_char2"),
				MCItemDef.create("sim_mrp_sub_char3", "sim_mrp_sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt1")
		);
	}

	public static MCContainerDef MS_MSBCL0150_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no1", "peg_no1"),
				MCItemDef.create("peg_no2", "peg_no2"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("rqmt_gnrt_typ", "rqmt_gnrt_typ"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no")
			}
			,
			MCBlockDef.create("Chk01_Rslt2")
		);
	}

	public static MCContainerDef MS_MSBCL0150_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg")
			}
			,
			MCBlockDef.create("Chk01_Crtl")
		);
	}


	public static MCContainerDef MS_MSBCL0150_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no1", "peg_no1"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ"),
				MCItemDef.create("sim_usr_cd", "sim_usr_cd"),
				MCItemDef.create("mrp_proc_dt", "mrp_proc_dt"),
				MCItemDef.create("exp_flg", "exp_flg"),
				MCItemDef.create("sim_mrp_intr_rmrks", "sim_mrp_intr_rmrks"),
				MCItemDef.create("sim_mrp_sub_char1", "sim_mrp_sub_char1"),
				MCItemDef.create("sim_mrp_sub_char2", "sim_mrp_sub_char2"),
				MCItemDef.create("sim_mrp_sub_char3", "sim_mrp_sub_char3"),
				MCItemDef.create("upd_dt", "upd_dt"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Rslt1")
		);
	}
	public static MCContainerDef MS_MSBCL0150_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no1", "peg_no1"),
				MCItemDef.create("peg_no2", "peg_no2"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("unit_dec_place", "unit_dec_place"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("rqmt_sno1_flg", "rqmt_sno1_flg"),
				MCItemDef.create("sno1_num_typ", "sno1_num_typ"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("rqmt_sno2_flg", "rqmt_sno2_flg"),
				MCItemDef.create("sno2_num_typ", "sno2_num_typ"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("rqmt_sno3_flg", "rqmt_sno3_flg"),
				MCItemDef.create("sno3_num_typ", "sno3_num_typ"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("rqmt_sno4_flg", "rqmt_sno4_flg"),
				MCItemDef.create("sno4_num_typ", "sno4_num_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("rqmt_typ_nm", "rqmt_typ_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ"),
				MCItemDef.create("rqmt_rtn_sts_typ", "rqmt_rtn_sts_typ"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Rslt2")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0150_Imp01_INFO = new MCOperationInfo("MS", "MSBCL0150", "Imp01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0150_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("peg_no1", "peg_no1"),
				MCItemDef.create("peg_no2", "peg_no2"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no")
			}
			,
			MCBlockDef.create("Imp01_Rslt1")
		);
	}


	public static MCContainerDef MS_MSBCL0150_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("peg_no1", "peg_no1"),
				MCItemDef.create("peg_no2", "peg_no2"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("unit_dec_place", "unit_dec_place"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("rqmt_sno1_flg", "rqmt_sno1_flg"),
				MCItemDef.create("sno1_num_typ", "sno1_num_typ"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("rqmt_sno2_flg", "rqmt_sno2_flg"),
				MCItemDef.create("sno2_num_typ", "sno2_num_typ"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("rqmt_sno3_flg", "rqmt_sno3_flg"),
				MCItemDef.create("sno3_num_typ", "sno3_num_typ"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("rqmt_sno4_flg", "rqmt_sno4_flg"),
				MCItemDef.create("sno4_num_typ", "sno4_num_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("rqmt_typ_nm", "rqmt_typ_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ"),
				MCItemDef.create("rqmt_rtn_sts_typ", "rqmt_rtn_sts_typ")
			}
			,
			MCBlockDef.create("Imp01_Rslt1")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0150_Upd01_INFO = new MCOperationInfo("MS", "MSBCL0150", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0150_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ"),
				MCItemDef.create("sim_usr_cd", "sim_usr_cd"),
				MCItemDef.create("dly_rqmt_flg", "dly_rqmt_flg"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("gr_flg", "gr_flg"),
				MCItemDef.create("gi_flg", "gi_flg"),
				MCItemDef.create("ship_flg", "ship_flg"),
				MCItemDef.create("tree_lvl", "tree_lvl"),
				MCItemDef.create("mrp_proc_dt", "mrp_proc_dt"),
				MCItemDef.create("exp_flg", "exp_flg"),
				MCItemDef.create("sim_mrp_intr_rmrks", "sim_mrp_intr_rmrks"),
				MCItemDef.create("sim_mrp_sub_char1", "sim_mrp_sub_char1"),
				MCItemDef.create("sim_mrp_sub_char2", "sim_mrp_sub_char2"),
				MCItemDef.create("sim_mrp_sub_char3", "sim_mrp_sub_char3"),
				MCItemDef.create("peg_no1", "peg_no1"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt1")
		);
	}

	public static MCContainerDef MS_MSBCL0150_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no1", "peg_no1"),
				MCItemDef.create("peg_no2", "peg_no2"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt2")
		);
	}


	public static MCContainerDef MS_MSBCL0150_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("peg_no1", "peg_no1"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt1")
		);
	}
	public static MCContainerDef MS_MSBCL0150_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no1", "peg_no1"),
				MCItemDef.create("peg_no2", "peg_no2"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("rqmt_rtn_sts_typ", "rqmt_rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt2")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0150_Upd02_INFO = new MCOperationInfo("MS", "MSBCL0150", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0150_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ")
			}
			,
			MCBlockDef.create("Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0150_Del01_INFO = new MCOperationInfo("MS", "MSBCL0150", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0150_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no1", "peg_no1"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	public static MCContainerDef MS_MSBCL0150_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0150", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}
	//FMCB DEF_CLASSES END
}

