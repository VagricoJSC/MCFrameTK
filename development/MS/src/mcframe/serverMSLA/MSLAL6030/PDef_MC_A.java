package mcframe.serverMSLA.MSLAL6030;

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
 * [MSLAL_ArrSchdSendIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL6030.ArrSchdSendIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL6030_ArrSchdSendIf_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSLAL6030_ArrSchdSendIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL6030", "ArrSchdSendIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6030_ArrSchdSendIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6030", "ArrSchdSendIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("ArrSchdSendIf_Upd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

