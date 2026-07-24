package mcframe.serverMSBF.MSBFL5220;

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
 * [MSBFL_LotInhService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBFL5220.LotInh_Upd01.UP.BLOCK0")){
			return MS_MSBFL5220_LotInh_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5220.LotInh_Upd01.UP.BLOCK1")){
			return MS_MSBFL5220_LotInh_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBFL5220.LotInh_Upd01.DOWN.BLOCK0")){
			return MS_MSBFL5220_LotInh_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5220.LotInh_Upd02.UP.BLOCK0")){
			return MS_MSBFL5220_LotInh_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5220.LotInh_Upd02.DOWN.BLOCK0")){
			return MS_MSBFL5220_LotInh_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5220.LotInh_Upd03.UP.BLOCK0")){
			return MS_MSBFL5220_LotInh_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBFL5220.LotInh_Upd03.DOWN.BLOCK0")){
			return MS_MSBFL5220_LotInh_Upd03_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBFL5220_LotInh_Upd01_INFO = new MCOperationInfo("MS", "MSBFL5220", "LotInh_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5220_LotInh_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5220", "LotInh_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("silent_flg", "silent_flg"),
				MCItemDef.create("no_exception_flg", "no_exception_flg"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no")
			}
			,
			MCBlockDef.create("LotInh_Upd01_Cnd01")
		);
	}

	public static MCContainerDef MS_MSBFL5220_LotInh_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBFL5220", "LotInh_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("LotInh_Upd01_Cnd02")
		);
	}


	public static MCContainerDef MS_MSBFL5220_LotInh_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5220", "LotInh_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("LotInh_Upd01_Cnd01")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5220_LotInh_Upd02_INFO = new MCOperationInfo("MS", "MSBFL5220", "LotInh_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5220_LotInh_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5220", "LotInh_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("silent_flg", "silent_flg"),
				MCItemDef.create("no_exception_flg", "no_exception_flg"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no")
			}
			,
			MCBlockDef.create("LotInh_Upd02_Cnd01")
		);
	}


	public static MCContainerDef MS_MSBFL5220_LotInh_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5220", "LotInh_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("LotInh_Upd02_Cnd01")
		);
	}
	
	static final MCOperationInfo MS_MSBFL5220_LotInh_Upd03_INFO = new MCOperationInfo("MS", "MSBFL5220", "LotInh_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBFL5220_LotInh_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5220", "LotInh_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("silent_flg", "silent_flg"),
				MCItemDef.create("no_exception_flg", "no_exception_flg"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no")
			}
			,
			MCBlockDef.create("LotInh_Upd03_Cnd01")
		);
	}


	public static MCContainerDef MS_MSBFL5220_LotInh_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBFL5220", "LotInh_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("LotInh_Upd03_Cnd01")
		);
	}
	//FMCB DEF_CLASSES END
}

