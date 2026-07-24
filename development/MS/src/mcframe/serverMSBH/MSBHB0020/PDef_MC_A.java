package mcframe.serverMSBH.MSBHB0020;

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
 * [MSBHB_PayActBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHB0020.Ins01.UP.BLOCK0")){
			return MS_MSBHB0020_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHB0020.Ins02.UP.BLOCK0")){
			return MS_MSBHB0020_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHB0020.Ins02.UP.BLOCK1")){
			return MS_MSBHB0020_Ins02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHB0020.Ins02.DOWN.BLOCK0")){
			return MS_MSBHB0020_Ins02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBHB0020_Ins01_INFO = new MCOperationInfo("MS", "MSBHB0020", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBHB0020_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHB0020", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("not_pay_schd_dt_flg", "not_pay_schd_dt_flg")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBHB0020_Ins02_INFO = new MCOperationInfo("MS", "MSBHB0020", "Ins02", "000000", new PDef());

	public static MCContainerDef MS_MSBHB0020_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHB0020", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("not_pay_schd_dt_flg", "not_pay_schd_dt_flg")
			}
			,
			MCBlockDef.create("Ins02_Cnd")
		);
	}

	public static MCContainerDef MS_MSBHB0020_Ins02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHB0020", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("psppl_cd", "psppl_cd")
			}
			,
			MCBlockDef.create("Ins02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBHB0020_Ins02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHB0020", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("total_cnt", "total_cnt"),
				MCItemDef.create("success_cnt", "success_cnt"),
				MCItemDef.create("error_cnt", "error_cnt")
			}
			,
			MCBlockDef.create("Ins02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

