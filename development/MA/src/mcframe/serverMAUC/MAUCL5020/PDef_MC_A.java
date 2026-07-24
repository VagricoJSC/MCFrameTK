package mcframe.serverMAUC.MAUCL5020;

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
 * [MAUCL_RevDataService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MAUCL5020.RevData_Ins01.UP.BLOCK0")){
			return MA_MAUCL5020_RevData_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL5020.RevData_Upd01.UP.BLOCK0")){
			return MA_MAUCL5020_RevData_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MAUCL5020_RevData_Ins01_INFO = new MCOperationInfo("MA", "MAUCL5020", "RevData_Ins01", "000000", new PDef());

	public static MCContainerDef MA_MAUCL5020_RevData_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL5020", "RevData_Ins01",
			new MCItemDef[]{
				MCItemDef.create("rev_data_src_no", "rev_data_src_no"),
				MCItemDef.create("rev_no", "rev_no"),
				MCItemDef.create("rev_data_typ", "rev_data_typ")
			}
			,
			MCBlockDef.create("RevData_Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MAUCL5020_RevData_Upd01_INFO = new MCOperationInfo("MA", "MAUCL5020", "RevData_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MAUCL5020_RevData_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL5020", "RevData_Upd01",
			new MCItemDef[]{
				MCItemDef.create("rev_data_src_no", "rev_data_src_no"),
				MCItemDef.create("rev_no", "rev_no")
			}
			,
			MCBlockDef.create("RevData_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MAUCL5020_RevData_Upd02_INFO = new MCOperationInfo("MA", "MAUCL5020", "RevData_Upd02", "000000", new PDef());


	//FMCB DEF_CLASSES END
}

