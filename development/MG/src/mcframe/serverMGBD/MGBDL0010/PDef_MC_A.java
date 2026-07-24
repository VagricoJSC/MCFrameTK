package mcframe.serverMGBD.MGBDL0010;

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
 * [MGBDL_CalcCost]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0010.Chk01.UP.BLOCK0")){
			return MG_MGBDL0010_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0010.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0010_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0010.Ins01.UP.BLOCK0")){
			return MG_MGBDL0010_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0010.Ins01.DOWN.BLOCK0")){
			return MG_MGBDL0010_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0010.Srch01.UP.BLOCK0")){
			return MG_MGBDL0010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0010.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0010_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MG_MGBDL0010_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0010", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0010_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to")
			}
			,
			MCBlockDef.create("Chk01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0010_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0010_Ins01_INFO = new MCOperationInfo("MG", "MGBDL0010", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0010_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("itm_limit_flg", "itm_limit_flg"),
				MCItemDef.create("data_check_flg", "data_check_flg"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0010_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("calc_no", "calc_no")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0010_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0010", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0010_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0010_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ym", "ym")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

