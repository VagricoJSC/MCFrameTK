package mcframe.serverMSBF.MSBFL5030;

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
 * [MSBFL_StdInspActService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL5030.StdInspAct_Chk01.UP.BLOCK0")){
			return MS_MSBFL5030_StdInspAct_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Chk01.UP.BLOCK1")){
			return MS_MSBFL5030_StdInspAct_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Chk01.DOWN.BLOCK0")){
			return MS_MSBFL5030_StdInspAct_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Chk01.DOWN.BLOCK1")){
			return MS_MSBFL5030_StdInspAct_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Chk02.UP.BLOCK0")){
			return MS_MSBFL5030_StdInspAct_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Chk02.UP.BLOCK1")){
			return MS_MSBFL5030_StdInspAct_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Chk02.DOWN.BLOCK0")){
			return MS_MSBFL5030_StdInspAct_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Chk02.DOWN.BLOCK1")){
			return MS_MSBFL5030_StdInspAct_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Chk03.UP.BLOCK0")){
			return MS_MSBFL5030_StdInspAct_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Chk03.UP.BLOCK1")){
			return MS_MSBFL5030_StdInspAct_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Chk03.DOWN.BLOCK0")){
			return MS_MSBFL5030_StdInspAct_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Chk03.DOWN.BLOCK1")){
			return MS_MSBFL5030_StdInspAct_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Upd01.UP.BLOCK0")){
			return MS_MSBFL5030_StdInspAct_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Upd01.UP.BLOCK1")){
			return MS_MSBFL5030_StdInspAct_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Upd01.DOWN.BLOCK0")){
			return MS_MSBFL5030_StdInspAct_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Upd02.UP.BLOCK0")){
			return MS_MSBFL5030_StdInspAct_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Upd02.UP.BLOCK1")){
			return MS_MSBFL5030_StdInspAct_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Del01.UP.BLOCK0")){
			return MS_MSBFL5030_StdInspAct_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5030.StdInspAct_Del01.UP.BLOCK1")){
			return MS_MSBFL5030_StdInspAct_Del01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBFL5030_StdInspAct_Chk01_INFO = new MCOperationInfo("MS", "MSBFL5030", "StdInspAct_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5030_StdInspAct_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr")
			}
			,
			MCBlockDef.create("StdInspAct_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5030_StdInspAct_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Chk01",
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
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac")
			}
			,
			MCBlockDef.create("StdInspAct_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL5030_StdInspAct_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg")
			}
			,
			MCBlockDef.create("StdInspAct_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL5030_StdInspAct_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("StdInspAct_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5030_StdInspAct_Chk02_INFO = new MCOperationInfo("MS", "MSBFL5030", "StdInspAct_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5030_StdInspAct_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("StdInspAct_Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5030_StdInspAct_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Chk02",
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
			MCBlockDef.create("StdInspAct_Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL5030_StdInspAct_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("StdInspAct_Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL5030_StdInspAct_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("StdInspAct_Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5030_StdInspAct_Chk03_INFO = new MCOperationInfo("MS", "MSBFL5030", "StdInspAct_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5030_StdInspAct_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("StdInspAct_Chk03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5030_StdInspAct_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("std_insp_act_no", "std_insp_act_no"),
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("StdInspAct_Chk03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL5030_StdInspAct_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("StdInspAct_Chk03_Hdr")
		);
	}
	public static MCContainerDef MS_MSBFL5030_StdInspAct_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Chk03",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("StdInspAct_Chk03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5030_StdInspAct_Upd01_INFO = new MCOperationInfo("MS", "MSBFL5030", "StdInspAct_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5030_StdInspAct_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr")
			}
			,
			MCBlockDef.create("StdInspAct_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5030_StdInspAct_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Upd01",
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
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("StdInspAct_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL5030_StdInspAct_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("std_insp_act_no", "std_insp_act_no"),
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no"),
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("StdInspAct_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5030_StdInspAct_Upd02_INFO = new MCOperationInfo("MS", "MSBFL5030", "StdInspAct_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5030_StdInspAct_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("StdInspAct_Upd02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5030_StdInspAct_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Upd02",
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
			MCBlockDef.create("StdInspAct_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5030_StdInspAct_Del01_INFO = new MCOperationInfo("MS", "MSBFL5030", "StdInspAct_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5030_StdInspAct_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("StdInspAct_Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5030_StdInspAct_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5030", "StdInspAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("std_insp_act_no", "std_insp_act_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("cnf_flg", "cnf_flg"),
				MCItemDef.create("cnf_intr_rmrks", "cnf_intr_rmrks")
			}
			,
			MCBlockDef.create("StdInspAct_Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

