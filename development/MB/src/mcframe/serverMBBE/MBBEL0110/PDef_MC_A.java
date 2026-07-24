package mcframe.serverMBBE.MBBEL0110;

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
 * [MBBEL_SendMaster]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBEL0110.Ins01.UP.BLOCK0")){
			return MB_MBBEL0110_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0110.Del01.UP.BLOCK0")){
			return MB_MBBEL0110_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MB_MBBEL0110_Ins01_INFO = new MCOperationInfo("MB", "MBBEL0110", "Ins01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0110_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0110", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ext_master_typ", "ext_master_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0110_Del01_INFO = new MCOperationInfo("MB", "MBBEL0110", "Del01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0110_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0110", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ext_master_typ", "ext_master_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("Del01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

