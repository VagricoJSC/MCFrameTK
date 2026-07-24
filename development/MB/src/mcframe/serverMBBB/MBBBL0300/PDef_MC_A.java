package mcframe.serverMBBB.MBBBL0300;

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
 * [MBBBL_SendMaster]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBBL0300.Upd01.UP.BLOCK0")){
			return MB_MBBBL0300_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL0300.Del01.UP.BLOCK0")){
			return MB_MBBBL0300_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MB_MBBBL0300_Upd01_INFO = new MCOperationInfo("MB", "MBBBL0300", "Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0300_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0300", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("master_typ", "master_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MB_MBBBL0300_Del01_INFO = new MCOperationInfo("MB", "MBBBL0300", "Del01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0300_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0300", "Del01",
			new MCItemDef[]{
				MCItemDef.create("master_typ", "master_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("Del01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

