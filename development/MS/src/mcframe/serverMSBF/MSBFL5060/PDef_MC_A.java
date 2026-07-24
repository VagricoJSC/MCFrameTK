package mcframe.serverMSBF.MSBFL5060;

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
 * [MSBFL_StdInspActRcptIFService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL5060.StdInspActIF_Upd01.UP.BLOCK0")){
			return MS_MSBFL5060_StdInspActIF_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5060.StdInspActIF_Upd01.UP.BLOCK1")){
			return MS_MSBFL5060_StdInspActIF_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5060.StdInspActIF_Upd01.UP.BLOCK2")){
			return MS_MSBFL5060_StdInspActIF_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBFL5060.StdInspActIF_Upd01.DOWN.BLOCK0")){
			return MS_MSBFL5060_StdInspActIF_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5060.StdInspActIF_Del01.UP.BLOCK0")){
			return MS_MSBFL5060_StdInspActIF_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5060.StdInspActIF_Del01.UP.BLOCK1")){
			return MS_MSBFL5060_StdInspActIF_Del01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBFL5060_StdInspActIF_Upd01_INFO = new MCOperationInfo("MS", "MSBFL5060", "StdInspActIF_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5060_StdInspActIF_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5060", "StdInspActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("StdInspActIF_Upd01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBFL5060_StdInspActIF_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5060", "StdInspActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("act_cont_fctr_upd_flg", "act_cont_fctr_upd_flg"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("StdInspActIF_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBFL5060_StdInspActIF_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBFL5060", "StdInspActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("std_insp_act_no", "std_insp_act_no"),
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("qn_insp_val", "qn_insp_val"),
				MCItemDef.create("qn_insp_val_upd_flg", "qn_insp_val_upd_flg"),
				MCItemDef.create("ql_insp_val", "ql_insp_val"),
				MCItemDef.create("ql_insp_val_upd_flg", "ql_insp_val_upd_flg"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("st_tm_upd_flg", "st_tm_upd_flg"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("end_tm_upd_flg", "end_tm_upd_flg"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_cd_upd_flg", "usr_cd_upd_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_cd_upd_flg", "dpt_cd_upd_flg"),
				MCItemDef.create("std_insp_rslt_typ", "std_insp_rslt_typ"),
				MCItemDef.create("std_insp_rslt_typ_upd_flg", "std_insp_rslt_typ_upd_flg"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("act_intr_rmrks_upd_flg", "act_intr_rmrks_upd_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char1_upd_flg", "sub_char1_upd_flg"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char2_upd_flg", "sub_char2_upd_flg"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char3_upd_flg", "sub_char3_upd_flg")
			}
			,
			MCBlockDef.create("StdInspActIF_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBFL5060_StdInspActIF_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5060", "StdInspActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("std_insp_act_no", "std_insp_act_no"),
				MCItemDef.create("std_insp_inst_no", "std_insp_inst_no"),
				MCItemDef.create("insp_no", "insp_no")
			}
			,
			MCBlockDef.create("StdInspActIF_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5060_StdInspActIF_Del01_INFO = new MCOperationInfo("MS", "MSBFL5060", "StdInspActIF_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5060_StdInspActIF_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5060", "StdInspActIF_Del01",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("StdInspActIF_Del01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBFL5060_StdInspActIF_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5060", "StdInspActIF_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("insp_no", "insp_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("StdInspActIF_Del01_Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

