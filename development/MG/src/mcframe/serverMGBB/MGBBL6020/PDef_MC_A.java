package mcframe.serverMGBB.MGBBL6020;

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
 * [MGBBL_IoActRecvIf]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL6020.IoActIf_Conv01.UP.BLOCK0")){
			return MG_MGBBL6020_IoActIf_Conv01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL6020.IoActIf_Conv01.DOWN.BLOCK0")){
			return MG_MGBBL6020_IoActIf_Conv01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBBL6020_IoActIf_Conv01_INFO = new MCOperationInfo("MG", "MGBBL6020", "IoActIf_Conv01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL6020_IoActIf_Conv01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6020", "IoActIf_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase03_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef MG_MGBBL6020_IoActIf_Conv01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6020", "IoActIf_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase03_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	//FMCB DEF_CLASSES END
}

