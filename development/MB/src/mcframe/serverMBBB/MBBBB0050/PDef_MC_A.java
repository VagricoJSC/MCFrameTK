package mcframe.serverMBBB.MBBBB0050;

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
 * [MBBBB_SendNoteBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBBB0050.SendNote_Upd01.UP.BLOCK0")){
			return MB_MBBBB0050_SendNote_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MB_MBBBB0050_SendNote_Upd01_INFO = new MCOperationInfo("MB", "MBBBB0050", "SendNote_Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBBB0050_SendNote_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBB0050", "SendNote_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd")
			}
			,
			MCBlockDef.create("SendNote_Upd01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

