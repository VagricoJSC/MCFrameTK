package mcframe.serverMGBG.MGBGL5200;

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
 * [MGBGL_PreAlcRateService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBGL5200.PreAlcRate_Chk01.UP.BLOCK0")){
			return MG_MGBGL5200_PreAlcRate_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBGL5200.PreAlcRate_Upd01.UP.BLOCK0")){
			return MG_MGBGL5200_PreAlcRate_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MG_MGBGL5200_PreAlcRate_Chk01_INFO = new MCOperationInfo("MG", "MGBGL5200", "PreAlcRate_Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBGL5200_PreAlcRate_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL5200", "PreAlcRate_Chk01",
			new MCItemDef[]{
				MCItemDef.create("sa_typ", "sa_typ"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("pre_alc_rate_cd", "pre_alc_rate_cd"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("PreAlcRate_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBGL5200_PreAlcRate_Upd01_INFO = new MCOperationInfo("MG", "MGBGL5200", "PreAlcRate_Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBGL5200_PreAlcRate_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL5200", "PreAlcRate_Upd01",
			new MCItemDef[]{
				MCItemDef.create("sa_typ", "sa_typ"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("pre_alc_rate_cd", "pre_alc_rate_cd"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("PreAlcRate_Upd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

