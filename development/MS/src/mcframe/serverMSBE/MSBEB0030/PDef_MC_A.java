package mcframe.serverMSBE.MSBEB0030;

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
 * [MSBEB_OPStkRplRegBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEB0030.OPStkRplReg_Ins01.UP.BLOCK0")){
			return MS_MSBEB0030_OPStkRplReg_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEB0030.OPStkRplReg_Ins02.UP.BLOCK0")){
			return MS_MSBEB0030_OPStkRplReg_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEB0030.OPStkRplReg_Ins02.DOWN.BLOCK0")){
			return MS_MSBEB0030_OPStkRplReg_Ins02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBEB0030_OPStkRplReg_Ins01_INFO = new MCOperationInfo("MS", "MSBEB0030", "OPStkRplReg_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEB0030_OPStkRplReg_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEB0030", "OPStkRplReg_Ins01",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("gr_schd_dt_to", "gr_schd_dt_to"),
				MCItemDef.create("gi_schd_dt_to", "gi_schd_dt_to"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10")
			}
			,
			MCBlockDef.create("OPStkRplReg_Ins01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBEB0030_OPStkRplReg_Ins02_INFO = new MCOperationInfo("MS", "MSBEB0030", "OPStkRplReg_Ins02", "000000", new PDef());

	public static MCContainerDef MS_MSBEB0030_OPStkRplReg_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEB0030", "OPStkRplReg_Ins02",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("op_rpl_mtd_typ", "op_rpl_mtd_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_str_ln_cd", "rqst_str_ln_cd"),
				MCItemDef.create("rqst_qty", "rqst_qty"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("gr_schd_dt_to", "gr_schd_dt_to"),
				MCItemDef.create("gi_schd_dt_to", "gi_schd_dt_to")
			}
			,
			MCBlockDef.create("OPStkRplReg_Ins02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEB0030_OPStkRplReg_Ins02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEB0030", "OPStkRplReg_Ins02",
			new MCItemDef[]{
				MCItemDef.create("total_cnt", "total_cnt"),
				MCItemDef.create("success_cnt", "success_cnt"),
				MCItemDef.create("error_cnt", "error_cnt")
			}
			,
			MCBlockDef.create("OPStkRplReg_Ins02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

