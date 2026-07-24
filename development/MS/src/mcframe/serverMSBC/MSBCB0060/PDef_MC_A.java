package mcframe.serverMSBC.MSBCB0060;

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
 * [MSBCB_OrdAutoFixBatch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCB0060.OrdAutoFix_Upd01.UP.BLOCK0")){
			return MS_MSBCB0060_OrdAutoFix_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCB0060.OrdAutoFix_Upd02.UP.BLOCK0")){
			return MS_MSBCB0060_OrdAutoFix_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCB0060.OrdAutoFix_Upd02.UP.BLOCK1")){
			return MS_MSBCB0060_OrdAutoFix_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCB0060.OrdAutoFix_Upd02.DOWN.BLOCK0")){
			return MS_MSBCB0060_OrdAutoFix_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBCB0060_OrdAutoFix_Upd01_INFO = new MCOperationInfo("MS", "MSBCB0060", "OrdAutoFix_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCB0060_OrdAutoFix_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCB0060", "OrdAutoFix_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("xfr_flg", "xfr_flg"),
				MCItemDef.create("wg_xfr_flg", "wg_xfr_flg"),
				MCItemDef.create("consider_holiday_flg", "consider_holiday_flg")
			}
			,
			MCBlockDef.create("OrdAutoFix_Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBCB0060_OrdAutoFix_Upd02_INFO = new MCOperationInfo("MS", "MSBCB0060", "OrdAutoFix_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCB0060_OrdAutoFix_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCB0060", "OrdAutoFix_Upd02",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("dt", "dt")
			}
			,
			MCBlockDef.create("OrdAutoFix_Upd02_Cnd")
		);
	}

	public static MCContainerDef MS_MSBCB0060_OrdAutoFix_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCB0060", "OrdAutoFix_Upd02",
			new MCItemDef[]{
				MCItemDef.create("itm_ord_no", "itm_ord_no")
			}
			,
			MCBlockDef.create("OrdAutoFix_Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCB0060_OrdAutoFix_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCB0060", "OrdAutoFix_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_cnt", "total_cnt"),
				MCItemDef.create("success_cnt", "success_cnt"),
				MCItemDef.create("error_cnt", "error_cnt")
			}
			,
			MCBlockDef.create("OrdAutoFix_Upd02_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

