package mcframe.serverMAUD.MAUDL1030;

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
 * [MAUDL_LogicBase]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MAUDL1030.Upd01.UP.BLOCK0")){
			return MA_MAUDL1030_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUDL1030.Upd02.UP.BLOCK0")){
			return MA_MAUDL1030_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUDL1030.Upd02.DOWN.BLOCK0")){
			return MA_MAUDL1030_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MA_MAUDL1030_Upd01_INFO = new MCOperationInfo("MA", "MAUDL1030", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MAUDL1030_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUDL1030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("co_cd", "co_cd")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MAUDL1030_Upd02_INFO = new MCOperationInfo("MA", "MAUDL1030", "Upd02", "000000", new PDef());

	public static MCContainerDef MA_MAUDL1030_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUDL1030", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("exec_co_cd", "exec_co_cd")
			}
			,
			MCBlockDef.create("Upd02_Dtl")
		);
	}


	public static MCContainerDef MA_MAUDL1030_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUDL1030", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num"),
				MCItemDef.create("cancel_num", "cancel_num")
			}
			,
			MCBlockDef.create("Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MAUDL1030_Upd03_INFO = new MCOperationInfo("MA", "MAUDL1030", "Upd03", "000000", new PDef());
	
	static final MCOperationInfo MA_MAUDL1030_Upd04_INFO = new MCOperationInfo("MA", "MAUDL1030", "Upd04", "000000", new PDef());


	//FMCB DEF_CLASSES END
}

