package mcframe.serverMAUC.MAUCL5030;

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
 * [MAUCL_IfCmnService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MAUCL5030.MultiExec_Upd01.UP.BLOCK0")){
			return MA_MAUCL5030_MultiExec_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL5030.MultiExec_Upd01.DOWN.BLOCK0")){
			return MA_MAUCL5030_MultiExec_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL5030.MultiExec_Upd02.UP.BLOCK0")){
			return MA_MAUCL5030_MultiExec_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL5030.MultiExec_Upd02.DOWN.BLOCK0")){
			return MA_MAUCL5030_MultiExec_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MA_MAUCL5030_MultiExec_Upd01_INFO = new MCOperationInfo("MA", "MAUCL5030", "MultiExec_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MAUCL5030_MultiExec_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL5030", "MultiExec_Upd01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("exec_co_cd", "exec_co_cd"),
				MCItemDef.create("data_ref_ctl", "data_ref_ctl")
			}
			,
			MCBlockDef.create("MultiExec_Upd01_Dtl")
		);
	}


	public static MCContainerDef MA_MAUCL5030_MultiExec_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL5030", "MultiExec_Upd01",
			new MCItemDef[]{
				MCItemDef.create("rslt_flg", "rslt_flg")
			}
			,
			MCBlockDef.create("MultiExec_Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MAUCL5030_MultiExec_Upd02_INFO = new MCOperationInfo("MA", "MAUCL5030", "MultiExec_Upd02", "000000", new PDef());

	public static MCContainerDef MA_MAUCL5030_MultiExec_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL5030", "MultiExec_Upd02",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("exec_co_cd", "exec_co_cd"),
				MCItemDef.create("data_ref_ctl", "data_ref_ctl")
			}
			,
			MCBlockDef.create("MultiExec_Upd02_Dtl")
		);
	}


	public static MCContainerDef MA_MAUCL5030_MultiExec_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL5030", "MultiExec_Upd02",
			new MCItemDef[]{
				MCItemDef.create("rslt_flg", "rslt_flg")
			}
			,
			MCBlockDef.create("MultiExec_Upd02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

