package mcframe.serverMAUC.MAUCL0080;

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
 * [MAUCL_StdUpriUtil]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MAUCL0080.Srch01.UP.BLOCK0")){
			return MA_MAUCL0080_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0080.Srch01.DOWN.BLOCK0")){
			return MA_MAUCL0080_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0080.Srch02.UP.BLOCK0")){
			return MA_MAUCL0080_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0080.Srch02.DOWN.BLOCK0")){
			return MA_MAUCL0080_Srch02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MA_MAUCL0080_Srch01_INFO = new MCOperationInfo("MA", "MAUCL0080", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MAUCL0080_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("std_upri_sel_typ", "std_upri_sel_typ")
			}
			,
			MCBlockDef.create("StdCost")
		);
	}


	public static MCContainerDef MA_MAUCL0080_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("std_upri", "std_upri")
			}
			,
			MCBlockDef.create("StdCost")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0080_Srch02_INFO = new MCOperationInfo("MA", "MAUCL0080", "Srch02", "000000", new PDef());

	public static MCContainerDef MA_MAUCL0080_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0080", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("std_upri_sel_typ", "std_upri_sel_typ")
			}
			,
			MCBlockDef.create("StdCostList")
		);
	}


	public static MCContainerDef MA_MAUCL0080_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0080", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("std_upri", "std_upri")
			}
			,
			MCBlockDef.create("StdCostList")
		);
	}
	//FMCB DEF_CLASSES END
}

