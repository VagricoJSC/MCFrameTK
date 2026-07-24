package mcframe.serverPFUD.PFUDL5040;

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
 * [PFUDL_ODataLogicBase]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("PF.PFUDL5040.SrchBase01.UP.BLOCK0")){
			return PF_PFUDL5040_SrchBase01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo PF_PFUDL5040_SrchBase01_INFO = new MCOperationInfo("PF", "PFUDL5040", "SrchBase01", "000000", new PDef());

	public static MCContainerDef PF_PFUDL5040_SrchBase01_UP_BLOCK0() {

		return new MCGeneralContainerDef("PF", "PFUDL5040", "SrchBase01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("SrchBase01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

