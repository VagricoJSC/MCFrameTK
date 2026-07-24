package mcframe.serverPFBA.PFBAL5830;

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
 * [PFBAL_SapMasterSrchService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("PF.PFBAL5830.CostCenter_Srch01.UP.BLOCK0")){
			return PF_PFBAL5830_CostCenter_Srch01_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBAL5830.CostCenter_Srch01.DOWN.BLOCK0")){
			return PF_PFBAL5830_CostCenter_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo PF_PFBAL5830_CostCenter_Srch01_INFO = new MCOperationInfo("PF", "PFBAL5830", "CostCenter_Srch01", "000000", new PDef());

	public static MCContainerDef PF_PFBAL5830_CostCenter_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBAL5830", "CostCenter_Srch01",
			mcframe.serverPFUD.PFUDL5040.PDef.PF_PFUDL5040_SrchBase01_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SrchBase01_Cnd")
		);
	}


	public static MCContainerDef PF_PFBAL5830_CostCenter_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBAL5830", "CostCenter_Srch01",
			new MCItemDef[]{
				MCItemDef.create("cost_center", "cost_center"),
				MCItemDef.create("validity_start_date", "validity_start_date"),
				MCItemDef.create("validity_end_date", "validity_end_date"),
				MCItemDef.create("profit_center", "profit_center")
			}
			,
			MCBlockDef.create("CostCenter_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

