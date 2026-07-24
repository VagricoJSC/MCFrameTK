package mcframe.serverMBBB.MBBBL0010;

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
 * [MBBBL_ImpAc]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBBL0010.Ins01.UP.BLOCK0")){
			return MB_MBBBL0010_Ins01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MB_MBBBL0010_Ins01_INFO = new MCOperationInfo("MB", "MBBBL0010", "Ins01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL0010_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("io_flg", "io_flg"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("rcv_flg", "rcv_flg"),
				MCItemDef.create("pay_flg", "pay_flg"),
				MCItemDef.create("schdpay_flg", "schdpay_flg"),
				MCItemDef.create("note_flg", "note_flg"),
				MCItemDef.create("rerun_flg", "rerun_flg"),
				MCItemDef.create("reget_flg", "reget_flg")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

