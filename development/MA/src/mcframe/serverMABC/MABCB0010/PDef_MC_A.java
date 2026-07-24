package mcframe.serverMABC.MABCB0010;

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
 * [MABCB_SendIfBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCB0010.SendIf_Ins01.UP.BLOCK0")){
			return MA_MABCB0010_SendIf_Ins01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MA_MABCB0010_SendIf_Ins01_INFO = new MCOperationInfo("MA", "MABCB0010", "SendIf_Ins01", "000000", new PDef());

	public static MCContainerDef MA_MABCB0010_SendIf_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCB0010", "SendIf_Ins01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("cfp_flg", "cfp_flg")
			}
			,
			MCBlockDef.create("SendIf_Ins01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

