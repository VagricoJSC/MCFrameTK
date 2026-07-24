package mcframe.serverMSBD.MSBDL5030;

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
 * [MSBDL_PurcSchdRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL5030.PurcSchd_Upd01.UP.BLOCK0")){
			return MS_MSBDL5030_PurcSchd_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5030.PurcSchd_Upd01.DOWN.BLOCK0")){
			return MS_MSBDL5030_PurcSchd_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5030.PurcSchd_Upd02.UP.BLOCK0")){
			return MS_MSBDL5030_PurcSchd_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5030.PurcSchd_Upd02.DOWN.BLOCK0")){
			return MS_MSBDL5030_PurcSchd_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5030.PurcSchd_Chk01.UP.BLOCK0")){
			return MS_MSBDL5030_PurcSchd_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5030.PurcSchd_Chk01.DOWN.BLOCK0")){
			return MS_MSBDL5030_PurcSchd_Chk01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBDL5030_PurcSchd_Upd01_INFO = new MCOperationInfo("MS", "MSBDL5030", "PurcSchd_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5030_PurcSchd_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5030", "PurcSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("no_cred_upd_flg", "no_cred_upd_flg"),
				MCItemDef.create("purc_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("purc_schd" + ".arr_pr_no", "arr_pr_no"),
				MCItemDef.create("purc_schd" + ".purc_schd_no", "purc_schd_no"),
				MCItemDef.create("purc_schd" + ".purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("purc_schd" + ".trd_unit_schd_qty", "trd_unit_schd_qty"),
				MCItemDef.create("purc_schd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("purc_schd" + ".base_unit_schd_qty", "base_unit_schd_qty"),
				MCItemDef.create("purc_schd" + ".base_unit_purc_qty", "base_unit_purc_qty"),
				MCItemDef.create("purc_schd" + ".base_unit_accpt_dfct_qty", "base_unit_accpt_dfct_qty"),
				MCItemDef.create("purc_schd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("purc_schd" + ".non_purc_flg", "non_purc_flg"),
				MCItemDef.create("purc_schd" + ".abort_flg", "abort_flg"),
				MCItemDef.create("purc_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("purc_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("purc_schd" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("PurcSchd_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5030_PurcSchd_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5030", "PurcSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("purc_schd" + ".purc_schd_no", "purc_schd_no")
			}
			,
			MCBlockDef.create("PurcSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5030_PurcSchd_Upd02_INFO = new MCOperationInfo("MS", "MSBDL5030", "PurcSchd_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5030_PurcSchd_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5030", "PurcSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("no_cred_upd_flg", "no_cred_upd_flg"),
				MCItemDef.create("purc_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("purc_schd" + ".purc_schd_no", "purc_schd_no"),
				MCItemDef.create("purc_schd" + ".abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("PurcSchd_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5030_PurcSchd_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5030", "PurcSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_schd" + ".arr_schd_no", "arr_schd_no")
			}
			,
			MCBlockDef.create("PurcSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5030_PurcSchd_Chk01_INFO = new MCOperationInfo("MS", "MSBDL5030", "PurcSchd_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5030_PurcSchd_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5030", "PurcSchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("purc_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("purc_schd" + ".purc_schd_no", "purc_schd_no"),
				MCItemDef.create("purc_schd" + ".base_unit_purc_qty", "base_unit_purc_qty"),
				MCItemDef.create("purc_schd" + ".base_unit_accpt_dfct_qty", "base_unit_accpt_dfct_qty"),
				MCItemDef.create("purc_schd" + ".abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("PurcSchd_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5030_PurcSchd_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5030", "PurcSchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("purc_schd" + ".arr_schd_no", "arr_schd_no"),
				MCItemDef.create("purc_schd" + ".purc_schd_no", "purc_schd_no")
			}
			,
			MCBlockDef.create("PurcSchd_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

