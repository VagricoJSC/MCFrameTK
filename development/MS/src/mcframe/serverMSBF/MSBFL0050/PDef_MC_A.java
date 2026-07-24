package mcframe.serverMSBF.MSBFL0050;

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
 * [MSBFL_StdInspActReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL0050.Srch01.UP.BLOCK0")){
			return MS_MSBFL0050_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Srch01.DOWN.BLOCK0")){
			return MS_MSBFL0050_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Srch01.DOWN.BLOCK1")){
			return MS_MSBFL0050_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0050.Chk01.UP.BLOCK0")){
			return MS_MSBFL0050_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Chk01.UP.BLOCK1")){
			return MS_MSBFL0050_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0050.Chk01.DOWN.BLOCK0")){
			return MS_MSBFL0050_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Chk01.DOWN.BLOCK1")){
			return MS_MSBFL0050_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0050.Chk02.UP.BLOCK0")){
			return MS_MSBFL0050_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Chk02.UP.BLOCK1")){
			return MS_MSBFL0050_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0050.Chk02.DOWN.BLOCK0")){
			return MS_MSBFL0050_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Chk02.DOWN.BLOCK1")){
			return MS_MSBFL0050_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0050.Chk03.UP.BLOCK0")){
			return MS_MSBFL0050_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Chk03.DOWN.BLOCK0")){
			return MS_MSBFL0050_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Chk04.UP.BLOCK0")){
			return MS_MSBFL0050_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Chk04.UP.BLOCK1")){
			return MS_MSBFL0050_Chk04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0050.Chk04.DOWN.BLOCK0")){
			return MS_MSBFL0050_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Chk04.DOWN.BLOCK1")){
			return MS_MSBFL0050_Chk04_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0050.Upd01.UP.BLOCK0")){
			return MS_MSBFL0050_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Upd01.UP.BLOCK1")){
			return MS_MSBFL0050_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0050.Upd01.DOWN.BLOCK0")){
			return MS_MSBFL0050_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Upd01.DOWN.BLOCK1")){
			return MS_MSBFL0050_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0050.Upd02.UP.BLOCK0")){
			return MS_MSBFL0050_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Upd02.UP.BLOCK1")){
			return MS_MSBFL0050_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0050.Del01.UP.BLOCK0")){
			return MS_MSBFL0050_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Del02.UP.BLOCK0")){
			return MS_MSBFL0050_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Del02.UP.BLOCK1")){
			return MS_MSBFL0050_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL0050.Prnt01.UP.BLOCK0")){
			return MS_MSBFL0050_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0050.Prnt01.DOWN.BLOCK0")){
			return MS_MSBFL0050_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
										
	
	static final MCOperationInfo MS_MSBFL0050_Srch01_INFO = new MCOperationInfo("MS", "MSBFL0050", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0050_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL0050_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_freq", "insp_freq"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("insp_typ_nm", "insp_typ_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("to_site_nm", "to_site_nm"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("insp_judg_rslt_typ", "insp_judg_rslt_typ"),
				MCItemDef.create("insp_judg_rslt_typ_nm", "insp_judg_rslt_typ_nm"),
				MCItemDef.create("judg_dt", "judg_dt"),
				MCItemDef.create("judg_usr_cd", "judg_usr_cd"),
				MCItemDef.create("judg_usr_nm", "judg_usr_nm"),
				MCItemDef.create("judg_dpt_cd", "judg_dpt_cd"),
				MCItemDef.create("judg_dpt_nm", "judg_dpt_nm"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
				MCItemDef.create("insp_rslt_prnt_flg", "insp_rslt_prnt_flg"),
				MCItemDef.create("insp_rslt_prnt_tm", "insp_rslt_prnt_tm"),
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
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0050_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_point_nm", "insp_point_nm"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("insp_qlqn_typ_nm", "insp_qlqn_typ_nm"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("ql_insp_val", "ql_insp_val"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("qn_out_min", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_min_typ_nm", "sign_out_min_typ_nm"),
				MCItemDef.create("qn_in_min", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_min_typ_nm", "sign_in_min_typ_nm"),
				MCItemDef.create("qn_insp_val", "qn_insp_val"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("sign_in_max_typ_nm", "sign_in_max_typ_nm"),
				MCItemDef.create("qn_in_max", "qn_in_max"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("sign_out_max_typ_nm", "sign_out_max_typ_nm"),
				MCItemDef.create("qn_out_max", "qn_out_max"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("st_hm", "st_hm"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("end_hm", "end_hm"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("std_insp_rslt_typ", "std_insp_rslt_typ"),
				MCItemDef.create("std_insp_rslt_typ_nm", "std_insp_rslt_typ_nm"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("cnf_flg", "cnf_flg"),
				MCItemDef.create("cnf_dt", "cnf_dt"),
				MCItemDef.create("cnf_usr_cd", "cnf_usr_cd"),
				MCItemDef.create("cnf_usr_nm", "cnf_usr_nm"),
				MCItemDef.create("cnf_dpt_cd", "cnf_dpt_cd"),
				MCItemDef.create("cnf_dpt_nm", "cnf_dpt_nm"),
				MCItemDef.create("cnf_intr_rmrks", "cnf_intr_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_sub_char1", "inst_sub_char1"),
				MCItemDef.create("inst_sub_char2", "inst_sub_char2"),
				MCItemDef.create("inst_sub_char3", "inst_sub_char3"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no"),
				MCItemDef.create("std_insp_act_no", "std_insp_act_no"),
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
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("auto_judg_flg", "auto_judg_flg")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0050_Chk01_INFO = new MCOperationInfo("MS", "MSBFL0050", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0050_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("prnt_flg", "prnt_flg")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0050_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("std_insp_act_no", "std_insp_act_no"),
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("qn_insp_val", "qn_insp_val"),
				MCItemDef.create("ql_insp_val", "ql_insp_val"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("std_insp_rslt_typ", "std_insp_rslt_typ"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL0050_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0050_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0050_Chk02_INFO = new MCOperationInfo("MS", "MSBFL0050", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0050_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0050_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("std_insp_act_no", "std_insp_act_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("cnf_flg", "cnf_flg"),
				MCItemDef.create("cnf_dt", "cnf_dt"),
				MCItemDef.create("cnf_usr_cd", "cnf_usr_cd"),
				MCItemDef.create("cnf_dpt_cd", "cnf_dpt_cd"),
				MCItemDef.create("cnf_intr_rmrks", "cnf_intr_rmrks")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL0050_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0050_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0050_Chk03_INFO = new MCOperationInfo("MS", "MSBFL0050", "Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0050_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk03_Hdr")
		);
	}


	public static MCContainerDef MS_MSBFL0050_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk03_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0050_Chk04_INFO = new MCOperationInfo("MS", "MSBFL0050", "Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0050_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk04_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0050_Chk04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("std_insp_act_no", "std_insp_act_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("cnf_flg", "cnf_flg"),
				MCItemDef.create("cnf_intr_rmrks", "cnf_intr_rmrks")
			}
			,
			MCBlockDef.create("Chk04_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL0050_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk04_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0050_Chk04_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0050_Upd01_INFO = new MCOperationInfo("MS", "MSBFL0050", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0050_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("prnt_flg", "prnt_flg")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0050_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("std_insp_act_no", "std_insp_act_no"),
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("qn_insp_val", "qn_insp_val"),
				MCItemDef.create("ql_insp_val", "ql_insp_val"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("std_insp_rslt_typ", "std_insp_rslt_typ"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL0050_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("insp_rslt_prnt_flg", "insp_rslt_prnt_flg"),
				MCItemDef.create("insp_rslt_prnt_tm", "insp_rslt_prnt_tm")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL0050_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("std_insp_act_no", "std_insp_act_no")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0050_Upd02_INFO = new MCOperationInfo("MS", "MSBFL0050", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0050_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Upd02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0050_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("std_insp_act_no", "std_insp_act_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("cnf_flg", "cnf_flg"),
				MCItemDef.create("cnf_dt", "cnf_dt"),
				MCItemDef.create("cnf_usr_cd", "cnf_usr_cd"),
				MCItemDef.create("cnf_dpt_cd", "cnf_dpt_cd"),
				MCItemDef.create("cnf_intr_rmrks", "cnf_intr_rmrks")
			}
			,
			MCBlockDef.create("Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0050_Del01_INFO = new MCOperationInfo("MS", "MSBFL0050", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0050_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Del01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0050_Del02_INFO = new MCOperationInfo("MS", "MSBFL0050", "Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0050_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Del02",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Del02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL0050_Del02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Del02",
			new MCItemDef[]{
				MCItemDef.create("std_insp_act_no", "std_insp_act_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("cnf_flg", "cnf_flg"),
				MCItemDef.create("cnf_intr_rmrks", "cnf_intr_rmrks")
			}
			,
			MCBlockDef.create("Del02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0050_Prnt01_INFO = new MCOperationInfo("MS", "MSBFL0050", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0050_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("Prnt01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBFL0050_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0050", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("insp_rslt_prnt_flg", "insp_rslt_prnt_flg"),
				MCItemDef.create("insp_rslt_prnt_tm", "insp_rslt_prnt_tm")
			}
			,
			MCBlockDef.create("Prnt01_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

