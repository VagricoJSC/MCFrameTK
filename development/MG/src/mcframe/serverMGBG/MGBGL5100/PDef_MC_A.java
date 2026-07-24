package mcframe.serverMGBG.MGBGL5100;

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
 * [MGBGL_PlnAlcService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBGL5100.PlnAlc_Chk01.UP.BLOCK0")){
			return MG_MGBGL5100_PlnAlc_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBGL5100.PlnAlc_Chk01.DOWN.BLOCK0")){
			return MG_MGBGL5100_PlnAlc_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBGL5100.PlnAlc_Upd01.UP.BLOCK0")){
			return MG_MGBGL5100_PlnAlc_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBGL5100.PlnAlc_Upd01.DOWN.BLOCK0")){
			return MG_MGBGL5100_PlnAlc_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MG_MGBGL5100_PlnAlc_Chk01_INFO = new MCOperationInfo("MG", "MGBGL5100", "PlnAlc_Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBGL5100_PlnAlc_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL5100", "PlnAlc_Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd_fr", "calc_ctg_cd_fr"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("calc_ctg_cd_to", "calc_ctg_cd_to")
			}
			,
			MCBlockDef.create("PlnAlc_Chk01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBGL5100_PlnAlc_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL5100", "PlnAlc_Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd_fr", "calc_ctg_cd_fr"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("calc_ctg_cd_to", "calc_ctg_cd_to"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PlnAlc_Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBGL5100_PlnAlc_Upd01_INFO = new MCOperationInfo("MG", "MGBGL5100", "PlnAlc_Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBGL5100_PlnAlc_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL5100", "PlnAlc_Upd01",
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


	public static MCContainerDef MG_MGBGL5100_PlnAlc_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL5100", "PlnAlc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PlnAlc_Upd01_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

