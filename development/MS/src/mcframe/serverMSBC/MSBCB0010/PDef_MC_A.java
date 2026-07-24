package mcframe.serverMSBC.MSBCB0010;

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
 * [MSBCB_MrpExecute]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCB0010.MrpExecute_Upd01.UP.BLOCK0")){
			return MS_MSBCB0010_MrpExecute_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBCB0010_MrpExecute_Upd01_INFO = new MCOperationInfo("MS", "MSBCB0010", "MrpExecute_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCB0010_MrpExecute_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCB0010", "MrpExecute_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("gi_schd_fr", "gi_schd_fr"),
				MCItemDef.create("irqmt_fr", "irqmt_fr")
			}
			,
			MCBlockDef.create("Mrp_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

