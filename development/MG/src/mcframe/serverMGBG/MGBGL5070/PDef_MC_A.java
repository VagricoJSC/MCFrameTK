package mcframe.serverMGBG.MGBGL5070;

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
 * [MGBGL_GaPlnAlcRecvIf]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBGL5070.GaPlnAlcIf_Conv01.UP.BLOCK0")){
			return MG_MGBGL5070_GaPlnAlcIf_Conv01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBGL5070.GaPlnAlcIf_Conv01.UP.BLOCK1")){
			return MG_MGBGL5070_GaPlnAlcIf_Conv01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBGL5070.GaPlnAlcIf_Conv01.DOWN.BLOCK0")){
			return MG_MGBGL5070_GaPlnAlcIf_Conv01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBGL5070_GaPlnAlcIf_Conv01_INFO = new MCOperationInfo("MG", "MGBGL5070", "GaPlnAlcIf_Conv01", "000000", new PDef());

	public static MCContainerDef MG_MGBGL5070_GaPlnAlcIf_Conv01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL5070", "GaPlnAlcIf_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase06_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}

	public static MCContainerDef MG_MGBGL5070_GaPlnAlcIf_Conv01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBGL5070", "GaPlnAlcIf_Conv01",
			new MCItemDef[]{
				MCItemDef.create("type", "type"),
				MCItemDef.create("budgetcode", "budgetcode"),
				MCItemDef.create("budgetname", "budgetname"),
				MCItemDef.create("extension", "extension"),
				MCItemDef.create("searchcharacter", "searchcharacter"),
				MCItemDef.create("deptcode", "deptcode"),
				MCItemDef.create("userno", "userno"),
				MCItemDef.create("memo", "memo"),
				MCItemDef.create("detail_usermaster", "detail_usermaster"),
				MCItemDef.create("accode", "accode"),
				MCItemDef.create("subcode", "subcode"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("budgetamount", "budgetamount")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBGL5070_GaPlnAlcIf_Conv01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL5070", "GaPlnAlcIf_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase06_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	//FMCB DEF_CLASSES END
}

