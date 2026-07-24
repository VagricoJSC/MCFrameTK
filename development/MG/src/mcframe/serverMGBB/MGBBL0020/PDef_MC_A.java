package mcframe.serverMGBB.MGBBL0020;

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
 * [MGBBL_InsMgtIf2Mgt]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL0020.Srch01.UP.BLOCK0")){
			return MG_MGBBL0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0020.Srch01.UP.BLOCK1")){
			return MG_MGBBL0020_Srch01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBBL0020.Srch01.DOWN.BLOCK0")){
			return MG_MGBBL0020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0020.Srch02.DOWN.BLOCK0")){
			return MG_MGBBL0020_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0020.Ins01.UP.BLOCK0")){
			return MG_MGBBL0020_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0020.Ins01.UP.BLOCK1")){
			return MG_MGBBL0020_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBBL0020.Ins02.UP.BLOCK0")){
			return MG_MGBBL0020_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0020.Ins02.UP.BLOCK1")){
			return MG_MGBBL0020_Ins02_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBBL0020.Ins03.UP.BLOCK0")){
			return MG_MGBBL0020_Ins03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0020.Ins03.UP.BLOCK1")){
			return MG_MGBBL0020_Ins03_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBBL0020.Del01.UP.BLOCK0")){
			return MG_MGBBL0020_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0020.Del01.UP.BLOCK1")){
			return MG_MGBBL0020_Del01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MG_MGBBL0020_Srch01_INFO = new MCOperationInfo("MG", "MGBBL0020", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0020_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}

	public static MCContainerDef MG_MGBBL0020_Srch01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cost_act_typ", "cost_act_typ")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0020_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("if_last_upd_dt", "if_last_upd_dt"),
				MCItemDef.create("last_upd_dt", "last_upd_dt")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0020_Srch02_INFO = new MCOperationInfo("MG", "MGBBL0020", "Srch02", "000000", new PDef());


	public static MCContainerDef MG_MGBBL0020_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0020", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym")
			}
			,
			MCBlockDef.create("Srch02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0020_Ins01_INFO = new MCOperationInfo("MG", "MGBBL0020", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0020_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0020", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}

	public static MCContainerDef MG_MGBBL0020_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0020", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("if_data_typ", "if_data_typ")
			}
			,
			MCBlockDef.create("Ins01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0020_Ins02_INFO = new MCOperationInfo("MG", "MGBBL0020", "Ins02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0020_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0020", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("non_mov_flg", "non_mov_flg")
			}
			,
			MCBlockDef.create("Ins02_Cnd")
		);
	}

	public static MCContainerDef MG_MGBBL0020_Ins02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0020", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("if_data_typ", "if_data_typ")
			}
			,
			MCBlockDef.create("Ins02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0020_Ins03_INFO = new MCOperationInfo("MG", "MGBBL0020", "Ins03", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0020_Ins03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0020", "Ins03",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("non_mov_flg", "non_mov_flg")
			}
			,
			MCBlockDef.create("Ins03_Cnd")
		);
	}

	public static MCContainerDef MG_MGBBL0020_Ins03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0020", "Ins03",
			new MCItemDef[]{
				MCItemDef.create("if_data_typ", "if_data_typ")
			}
			,
			MCBlockDef.create("Ins03_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0020_Del01_INFO = new MCOperationInfo("MG", "MGBBL0020", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0020_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd")
			}
			,
			MCBlockDef.create("Del01_Cnd")
		);
	}

	public static MCContainerDef MG_MGBBL0020_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0020", "Del01",
			new MCItemDef[]{
				MCItemDef.create("if_data_typ", "if_data_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

