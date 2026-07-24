package mcframe.serverPFBE.PFBEL5110;

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
 * [PFBEL_ItmProdIf]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("PF.PFBEL5110.ItmProdIf_Conv01.UP.BLOCK0")){
			return PF_PFBEL5110_ItmProdIf_Conv01_UP_BLOCK0();
		}
		else if (id.equals("PF.PFBEL5110.ItmProdIf_Conv01.DOWN.BLOCK0")){
			return PF_PFBEL5110_ItmProdIf_Conv01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo PF_PFBEL5110_ItmProdIf_Conv01_INFO = new MCOperationInfo("PF", "PFBEL5110", "ItmProdIf_Conv01", "000000", new PDef());

	public static MCContainerDef PF_PFBEL5110_ItmProdIf_Conv01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBEL5110", "ItmProdIf_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase02_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef PF_PFBEL5110_ItmProdIf_Conv01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFBEL5110", "ItmProdIf_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase02_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	//FMCB DEF_CLASSES END
}

