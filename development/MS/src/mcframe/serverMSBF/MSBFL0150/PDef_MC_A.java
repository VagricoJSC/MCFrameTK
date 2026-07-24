package mcframe.serverMSBF.MSBFL0150;

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
 * [MSBFL_LotInhExecute]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL0150.Chk01.UP.BLOCK0")){
			return MS_MSBFL0150_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0150.Chk01.DOWN.BLOCK0")){
			return MS_MSBFL0150_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL0150.Upd01.UP.BLOCK0")){
			return MS_MSBFL0150_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBFL0150_Chk01_INFO = new MCOperationInfo("MS", "MSBFL0150", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0150_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0150", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("Chk01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBFL0150_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0150", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("org_sublot_no", "org_sublot_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no")
			}
			,
			MCBlockDef.create("Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBFL0150_Upd01_INFO = new MCOperationInfo("MS", "MSBFL0150", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL0150_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL0150", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("Upd01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

