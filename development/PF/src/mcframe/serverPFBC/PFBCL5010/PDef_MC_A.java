package mcframe.serverPFBC.PFBCL5010;

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
 * [PFBCL_DSIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("PF.PFBCL5010.DSIf_Imp01.UP.BLOCK0")){
			return PF_PFBCL5010_DSIf_Imp01_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBCL5010.DSIf_Imp01.DOWN.BLOCK0")){
			return PF_PFBCL5010_DSIf_Imp01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo PF_PFBCL5010_DSIf_Imp01_INFO = new MCOperationInfo("PF", "PFBCL5010", "DSIf_Imp01", "000000", new PDef());

	public static MCContainerDef PF_PFBCL5010_DSIf_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBCL5010", "DSIf_Imp01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase07_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef PF_PFBCL5010_DSIf_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBCL5010", "DSIf_Imp01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase07_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	//FMCB DEF_CLASSES END
}

