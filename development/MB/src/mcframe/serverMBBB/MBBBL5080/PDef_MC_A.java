package mcframe.serverMBBB.MBBBL5080;

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
 * [MBBBL_SapSendAcService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBBL5080.SendAc_Ins01.UP.BLOCK0")){
			return MB_MBBBL5080_SendAc_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL5080.SendAc_Ins01.DOWN.BLOCK0")){
			return MB_MBBBL5080_SendAc_Ins01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MB_MBBBL5080_SendAc_Ins01_INFO = new MCOperationInfo("MB", "MBBBL5080", "SendAc_Ins01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL5080_SendAc_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL5080", "SendAc_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("jnl_his" + ".jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("jnl_his" + ".data_typ", "data_typ"),
				MCItemDef.create("jnl_his" + ".jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("jnl_his" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("SendAc_Ins01_Dtl")
		);
	}


	public static MCContainerDef MB_MBBBL5080_SendAc_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL5080", "SendAc_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("SendAc_Ins01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

