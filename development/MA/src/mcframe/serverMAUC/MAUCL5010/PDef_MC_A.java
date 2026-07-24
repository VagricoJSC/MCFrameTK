package mcframe.serverMAUC.MAUCL5010;

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
 * [MAUCL_PushNtcRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MAUCL5010.PushNtc_Upd01.UP.BLOCK0")){
			return MA_MAUCL5010_PushNtc_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL5010.PushNtc_Upd01.UP.BLOCK1")){
			return MA_MAUCL5010_PushNtc_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MAUCL5010.PushNtc_Upd01.UP.BLOCK2")){
			return MA_MAUCL5010_PushNtc_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MA.MAUCL5010.PushNtc_Upd01.UP.BLOCK3")){
			return MA_MAUCL5010_PushNtc_Upd01_UP_BLOCK3();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MA_MAUCL5010_PushNtc_Upd01_INFO = new MCOperationInfo("MA", "MAUCL5010", "PushNtc_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MAUCL5010_PushNtc_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL5010", "PushNtc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("push_ntc_typ", "push_ntc_typ"),
				MCItemDef.create("msg_id", "msg_id"),
				MCItemDef.create("src_module_id", "src_module_id"),
				MCItemDef.create("src_logic_id", "src_logic_id"),
				MCItemDef.create("src_operation_id", "src_operation_id")
			}
			,
			MCBlockDef.create("PushNtc_Upd01_Dtl1")
		);
	}

	public static MCContainerDef MA_MAUCL5010_PushNtc_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MAUCL5010", "PushNtc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("ntc_wg_cd", "ntc_wg_cd"),
				MCItemDef.create("ntc_dpt_cd", "ntc_dpt_cd"),
				MCItemDef.create("ntc_aprv_role_cd", "ntc_aprv_role_cd"),
				MCItemDef.create("ntc_usr_cd", "ntc_usr_cd")
			}
			,
			MCBlockDef.create("PushNtc_Upd01_Dtl2")
		);
	}

	public static MCContainerDef MA_MAUCL5010_PushNtc_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MAUCL5010", "PushNtc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("bind_val", "bind_val")
			}
			,
			MCBlockDef.create("PushNtc_Upd01_Dtl3")
		);
	}

	public static MCContainerDef MA_MAUCL5010_PushNtc_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MA", "MAUCL5010", "PushNtc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_val", "data_val")
			}
			,
			MCBlockDef.create("PushNtc_Upd01_Dtl4")
		);
	}


	//FMCB DEF_CLASSES END
}

