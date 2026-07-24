package mcframe.clientMGBE.MGBEP0120;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MGBEP_FxdStdUpriRef]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBEL0120.Ins01.UP.BLOCK0")){
			return MG_MGBEL0120_Ins01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBEL0120_Ins01_INFO = new MCOperationInfo("MG", "MGBEL0120", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBEL0120_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBEL0120", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("term_p" + ".term", "term"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ref", "ref")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

