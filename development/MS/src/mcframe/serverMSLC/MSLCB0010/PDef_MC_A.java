package mcframe.serverMSLC.MSLCB0010;

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
 * [MSLCB_ScmDataSendIfBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLCB0010.SendIf_Upd01.UP.BLOCK0")){
			return MS_MSLCB0010_SendIf_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSLCB0010_SendIf_Upd01_INFO = new MCOperationInfo("MS", "MSLCB0010", "SendIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLCB0010_SendIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLCB0010", "SendIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("non_mov_cmp_dt", "non_mov_cmp_dt"),
				MCItemDef.create("non_mov_base_days", "non_mov_base_days"),
				MCItemDef.create("co_cd", "co_cd")
			}
			,
			MCBlockDef.create("SendIf_Upd01_Dtl_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

