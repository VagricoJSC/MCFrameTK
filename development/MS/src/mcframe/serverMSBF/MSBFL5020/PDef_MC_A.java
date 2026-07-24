package mcframe.serverMSBF.MSBFL5020;

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
 * [MSBFL_InspInstService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL5020.InspInst_Srch01.UP.BLOCK0")){
			return MS_MSBFL5020_InspInst_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Srch01.DOWN.BLOCK0")){
			return MS_MSBFL5020_InspInst_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Srch01.DOWN.BLOCK1")){
			return MS_MSBFL5020_InspInst_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Chk04.UP.BLOCK0")){
			return MS_MSBFL5020_InspInst_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Chk04.DOWN.BLOCK0")){
			return MS_MSBFL5020_InspInst_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Chk05.UP.BLOCK0")){
			return MS_MSBFL5020_InspInst_Chk05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Chk05.DOWN.BLOCK0")){
			return MS_MSBFL5020_InspInst_Chk05_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Ins01.UP.BLOCK0")){
			return MS_MSBFL5020_InspInst_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Ins01.UP.BLOCK1")){
			return MS_MSBFL5020_InspInst_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Ins01.UP.BLOCK2")){
			return MS_MSBFL5020_InspInst_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Ins01.DOWN.BLOCK0")){
			return MS_MSBFL5020_InspInst_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Ins01.DOWN.BLOCK1")){
			return MS_MSBFL5020_InspInst_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Ins01.DOWN.BLOCK2")){
			return MS_MSBFL5020_InspInst_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Upd01.UP.BLOCK0")){
			return MS_MSBFL5020_InspInst_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Upd01.UP.BLOCK1")){
			return MS_MSBFL5020_InspInst_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Upd01.UP.BLOCK2")){
			return MS_MSBFL5020_InspInst_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Upd01.DOWN.BLOCK0")){
			return MS_MSBFL5020_InspInst_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Upd01.DOWN.BLOCK1")){
			return MS_MSBFL5020_InspInst_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Upd01.DOWN.BLOCK2")){
			return MS_MSBFL5020_InspInst_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Upd02.UP.BLOCK0")){
			return MS_MSBFL5020_InspInst_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Upd02.DOWN.BLOCK0")){
			return MS_MSBFL5020_InspInst_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Del01.UP.BLOCK0")){
			return MS_MSBFL5020_InspInst_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5020.InspInst_Del01.DOWN.BLOCK0")){
			return MS_MSBFL5020_InspInst_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBFL5020_InspInst_Srch01_INFO = new MCOperationInfo("MS", "MSBFL5020", "InspInst_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5020_InspInst_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("insp_typ", "insp_typ"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd")
			}
			,
			MCBlockDef.create("InspInst_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL5020_InspInst_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Srch01",
			new MCItemDef[]{
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_mtd_typ_nm", "insp_mtd_typ_nm"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("insp_bind_typ", "insp_bind_typ"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("spl_qty", "spl_qty"),
				MCItemDef.create("insp_lt", "insp_lt")
			}
			,
			MCBlockDef.create("InspInst_Srch01_Rslt")
		);
	}
	public static MCContainerDef MS_MSBFL5020_InspInst_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Srch01",
			new MCItemDef[]{
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_point_nm", "insp_point_nm"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("insp_qlqn_typ_nm", "insp_qlqn_typ_nm"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_min_typ_nm", "sign_out_min_typ_nm"),
				MCItemDef.create("qn_in_min", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_min_typ_nm", "sign_in_min_typ_nm"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("sign_in_max_typ_nm", "sign_in_max_typ_nm"),
				MCItemDef.create("qn_in_max", "qn_in_max"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("sign_out_max_typ_nm", "sign_out_max_typ_nm"),
				MCItemDef.create("qn_out_max", "qn_out_max")
			}
			,
			MCBlockDef.create("InspInst_Srch01_DtlStd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5020_InspInst_Chk04_INFO = new MCOperationInfo("MS", "MSBFL5020", "InspInst_Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5020_InspInst_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("InspInst_Chk04_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL5020_InspInst_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("InspInst_Chk04_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5020_InspInst_Chk05_INFO = new MCOperationInfo("MS", "MSBFL5020", "InspInst_Chk05", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5020_InspInst_Chk05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Chk05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_freq", "insp_freq")
			}
			,
			MCBlockDef.create("InspInst_Chk05_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL5020_InspInst_Chk05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Chk05",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("InspInst_Chk05_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5020_InspInst_Ins01_INFO = new MCOperationInfo("MS", "MSBFL5020", "InspInst_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5020_InspInst_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("InspInst_Ins01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBFL5020_InspInst_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no_hdr", "peg_no_hdr"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("qn_in_min", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("qn_in_max", "qn_in_max"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("qn_out_max", "qn_out_max"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("add_point_flg", "add_point_flg")
			}
			,
			MCBlockDef.create("InspInst_Ins01_RsltStd")
		);
	}

	public static MCContainerDef MS_MSBFL5020_InspInst_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no_hdr", "peg_no_hdr"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("smpl_inst_qty", "smpl_inst_qty")
			}
			,
			MCBlockDef.create("InspInst_Ins01_RsltSchd")
		);
	}


	public static MCContainerDef MS_MSBFL5020_InspInst_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("inst_rslt_issue_flg", "inst_rslt_issue_flg")
			}
			,
			MCBlockDef.create("InspInst_Ins01_Rslt")
		);
	}
	public static MCContainerDef MS_MSBFL5020_InspInst_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no_hdr", "peg_no_hdr"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ")
			}
			,
			MCBlockDef.create("InspInst_Ins01_RsltStd")
		);
	}
	public static MCContainerDef MS_MSBFL5020_InspInst_Ins01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no_hdr", "peg_no_hdr"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("InspInst_Ins01_RsltSchd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5020_InspInst_Upd01_INFO = new MCOperationInfo("MS", "MSBFL5020", "InspInst_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5020_InspInst_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("InspInst_Upd01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBFL5020_InspInst_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no_hdr", "peg_no_hdr"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("qn_in_min", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("qn_in_max", "qn_in_max"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("qn_out_max", "qn_out_max"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("add_point_flg", "add_point_flg")
			}
			,
			MCBlockDef.create("InspInst_Upd01_RsltStd")
		);
	}

	public static MCContainerDef MS_MSBFL5020_InspInst_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no_hdr", "peg_no_hdr"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("insp_schd_no", "insp_schd_no"),
				MCItemDef.create("smpl_inst_qty", "smpl_inst_qty")
			}
			,
			MCBlockDef.create("InspInst_Upd01_RsltSchd")
		);
	}


	public static MCContainerDef MS_MSBFL5020_InspInst_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inst_rslt_issue_flg", "inst_rslt_issue_flg")
			}
			,
			MCBlockDef.create("InspInst_Upd01_Rslt")
		);
	}
	public static MCContainerDef MS_MSBFL5020_InspInst_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no_hdr", "peg_no_hdr"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no")
			}
			,
			MCBlockDef.create("InspInst_Upd01_RsltStd")
		);
	}
	public static MCContainerDef MS_MSBFL5020_InspInst_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no_hdr", "peg_no_hdr"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("InspInst_Upd01_RsltSchd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5020_InspInst_Upd02_INFO = new MCOperationInfo("MS", "MSBFL5020", "InspInst_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5020_InspInst_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_tm", "aprv_tm"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("master_dt", "master_dt")
			}
			,
			MCBlockDef.create("InspInst_Upd02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL5020_InspInst_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("InspInst_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5020_InspInst_Del01_INFO = new MCOperationInfo("MS", "MSBFL5020", "InspInst_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5020_InspInst_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("lims_flg", "lims_flg"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ")
			}
			,
			MCBlockDef.create("InspInst_Del01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBFL5020_InspInst_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5020", "InspInst_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_sts_typ", "insp_sts_typ"),
				MCItemDef.create("insp_sts_typ_nm", "insp_sts_typ_nm"),
				MCItemDef.create("insp_aprv_sts_typ", "insp_aprv_sts_typ"),
				MCItemDef.create("insp_aprv_sts_typ_nm", "insp_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("InspInst_Del01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

