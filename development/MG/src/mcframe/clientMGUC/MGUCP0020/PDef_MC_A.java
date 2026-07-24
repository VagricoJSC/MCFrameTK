package mcframe.clientMGUC.MGUCP0020;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MGUCP_AppSys]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGUCL0020.Srch01.DOWN.BLOCK0")){
			return MG_MGUCL0020_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGUCL0020_Srch01_INFO = new MCOperationInfo("MG", "MGUCL0020", "Srch01", "000000", new PDef());


	public static MCContainerDef MG_MGUCL0020_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Expns] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGUCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("expns_nm", "expns_nm"),
				MCItemDef.create("expns_typ", "expns_typ"),
				MCItemDef.create("expns_seq", "expns_seq"),
				MCItemDef.create("direct_typ", "direct_typ"),
				MCItemDef.create("var_typ", "var_typ"),
				MCItemDef.create("expns_grp_cd", "expns_grp_cd"),
				MCItemDef.create("expns_grp_nm", "expns_grp_nm"),
				MCItemDef.create("expns_grp_seq", "expns_grp_seq")
			}
			,
			MCBlockDef.create("Expns")
		);
	}
	//FMCB DEF_CLASSES END
}

