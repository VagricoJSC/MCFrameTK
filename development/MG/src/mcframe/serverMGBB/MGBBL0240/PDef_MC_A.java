package mcframe.serverMGBB.MGBBL0240;

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
 * [MGBBL_StInfoCopyReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL0240.Chk01.UP.BLOCK0")){
			return MG_MGBBL0240_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0240.Ins01.UP.BLOCK0")){
			return MG_MGBBL0240_Ins01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MG_MGBBL0240_Chk01_INFO = new MCOperationInfo("MG", "MGBBL0240", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0240_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0240", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd_fr", "calc_grp_cd_fr"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("calc_grp_cd_to", "calc_grp_cd_to"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("wip_flg", "wip_flg"),
				MCItemDef.create("lot_no_flg", "lot_no_flg"),
				MCItemDef.create("sublot_no_flg", "sublot_no_flg"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno4_flg", "sno4_flg"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("asst_flg", "asst_flg"),
				MCItemDef.create("del_flg", "del_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0240_Ins01_INFO = new MCOperationInfo("MG", "MGBBL0240", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0240_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0240", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd_fr", "calc_grp_cd_fr"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("calc_grp_cd_to", "calc_grp_cd_to"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("wip_flg", "wip_flg"),
				MCItemDef.create("lot_no_flg", "lot_no_flg"),
				MCItemDef.create("sublot_no_flg", "sublot_no_flg"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno4_flg", "sno4_flg"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("asst_flg", "asst_flg"),
				MCItemDef.create("del_flg", "del_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

