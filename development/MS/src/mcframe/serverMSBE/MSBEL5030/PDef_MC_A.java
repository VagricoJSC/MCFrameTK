package mcframe.serverMSBE.MSBEL5030;

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
 * [MSBEL_StkMngService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5030.Stk_Upd01.UP.BLOCK0")){
			return MS_MSBEL5030_Stk_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5030.Stk_Upd02.UP.BLOCK0")){
			return MS_MSBEL5030_Stk_Upd02_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBEL5030_Stk_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5030", "Stk_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5030_Stk_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5030", "Stk_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("io_act_typ", "io_act_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("minus_stk_flg", "minus_stk_flg")
			}
			,
			MCBlockDef.create("Stk_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5030_Stk_Upd02_INFO = new MCOperationInfo("MS", "MSBEL5030", "Stk_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5030_Stk_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5030", "Stk_Upd02",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym")
			}
			,
			MCBlockDef.create("Stk_Upd02_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

