package mcframe.serverMBBB.MBBBB0030;

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
 * [MBBBB_AutoJnlBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBBB0030.AutoJnl_Upd01.UP.BLOCK0")){
			return MB_MBBBB0030_AutoJnl_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MB_MBBBB0030_AutoJnl_Upd01_INFO = new MCOperationInfo("MB", "MBBBB0030", "AutoJnl_Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBBB0030_AutoJnl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBB0030", "AutoJnl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("ac_slip_dt", "ac_slip_dt"),
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rerun_flg", "rerun_flg"),
				MCItemDef.create("jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("AutoJnl_Upd01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

