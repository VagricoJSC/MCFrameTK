package mcframe.serverMGBG.MGBGB0030;

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
 * [MGBGB_PlnAlcBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBGB0030.PlnAlc_Upd01.UP.BLOCK0")){
			return MG_MGBGB0030_PlnAlc_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBGB0030_PlnAlc_Upd01_INFO = new MCOperationInfo("MG", "MGBGB0030", "PlnAlc_Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBGB0030_PlnAlc_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGB0030", "PlnAlc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd_fr", "calc_ctg_cd_fr"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("calc_ctg_cd_to", "calc_ctg_cd_to")
			}
			,
			MCBlockDef.create("PlnAlc_Upd01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

