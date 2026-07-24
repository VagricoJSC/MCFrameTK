package mcframe.serverMGBB.MGBBL0010;

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
 * [MGBBL_InsScm2MgtIf]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL0010.Srch01.UP.BLOCK0")){
			return MG_MGBBL0010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0010.Srch01.UP.BLOCK1")){
			return MG_MGBBL0010_Srch01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBBL0010.Srch01.DOWN.BLOCK0")){
			return MG_MGBBL0010_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0010.Srch02.DOWN.BLOCK0")){
			return MG_MGBBL0010_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0010.Ins01.UP.BLOCK0")){
			return MG_MGBBL0010_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0010.Ins01.UP.BLOCK1")){
			return MG_MGBBL0010_Ins01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MG_MGBBL0010_Srch01_INFO = new MCOperationInfo("MG", "MGBBL0010", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0010_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}

	public static MCContainerDef MG_MGBBL0010_Srch01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ct_data_typ", "ct_data_typ"),
				MCItemDef.create("if_dtl_typ", "if_dtl_typ"),
				MCItemDef.create("is_enable", "is_enable")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0010_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("last_upd_dt", "last_upd_dt"),
				MCItemDef.create("no_imp_cnt", "no_imp_cnt"),
				MCItemDef.create("if_last_upd_dt", "if_last_upd_dt")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0010_Srch02_INFO = new MCOperationInfo("MG", "MGBBL0010", "Srch02", "000000", new PDef());


	public static MCContainerDef MG_MGBBL0010_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0010", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0010_Ins01_INFO = new MCOperationInfo("MG", "MGBBL0010", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0010_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("rerun", "rerun"),
				MCItemDef.create("non_mov", "non_mov")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}

	public static MCContainerDef MG_MGBBL0010_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ct_data_typ", "ct_data_typ")
			}
			,
			MCBlockDef.create("Ins01_Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

