package mcframe.serverMGBB.MGBBL6010;

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
 * [MGBBL_PcmExtIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL6010.PcmExtIf_Chk01.UP.BLOCK0")){
			return MG_MGBBL6010_PcmExtIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL6010.PcmExtIf_Chk01.DOWN.BLOCK0")){
			return MG_MGBBL6010_PcmExtIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL6010.PcmExtIf_Upd01.UP.BLOCK0")){
			return MG_MGBBL6010_PcmExtIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL6010.PcmExtIf_Upd01.DOWN.BLOCK0")){
			return MG_MGBBL6010_PcmExtIf_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL6010.PcmExtIf_Upd02.UP.BLOCK0")){
			return MG_MGBBL6010_PcmExtIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL6010.PcmExtIf_Upd02.DOWN.BLOCK0")){
			return MG_MGBBL6010_PcmExtIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL6010.PcmExtIf_Upd03.UP.BLOCK0")){
			return MG_MGBBL6010_PcmExtIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL6010.PcmExtIf_Upd03.DOWN.BLOCK0")){
			return MG_MGBBL6010_PcmExtIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL6010.PcmExtIf_Upd04.UP.BLOCK0")){
			return MG_MGBBL6010_PcmExtIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL6010.PcmExtIf_Upd04.DOWN.BLOCK0")){
			return MG_MGBBL6010_PcmExtIf_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL6010.PcmExtIf_Upd05.UP.BLOCK0")){
			return MG_MGBBL6010_PcmExtIf_Upd05_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL6010.PcmExtIf_Upd05.DOWN.BLOCK0")){
			return MG_MGBBL6010_PcmExtIf_Upd05_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MG_MGBBL6010_PcmExtIf_Chk01_INFO = new MCOperationInfo("MG", "MGBBL6010", "PcmExtIf_Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL6010_PcmExtIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6010", "PcmExtIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("io_flg", "io_flg"),
				MCItemDef.create("wk_flg", "wk_flg"),
				MCItemDef.create("wip_flg", "wip_flg"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("rerun_flg", "rerun_flg")
			}
			,
			MCBlockDef.create("PcmExtIf_Chk01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL6010_PcmExtIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6010", "PcmExtIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("io_flg", "io_flg"),
				MCItemDef.create("wk_flg", "wk_flg"),
				MCItemDef.create("wip_flg", "wip_flg"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("rerun_flg", "rerun_flg"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PcmExtIf_Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL6010_PcmExtIf_Upd01_INFO = new MCOperationInfo("MG", "MGBBL6010", "PcmExtIf_Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL6010_PcmExtIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6010", "PcmExtIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("io_flg", "io_flg"),
				MCItemDef.create("wk_flg", "wk_flg"),
				MCItemDef.create("wip_flg", "wip_flg"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("rerun_flg", "rerun_flg")
			}
			,
			MCBlockDef.create("PcmExtIf_Upd01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL6010_PcmExtIf_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6010", "PcmExtIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PcmExtIf_Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL6010_PcmExtIf_Upd02_INFO = new MCOperationInfo("MG", "MGBBL6010", "PcmExtIf_Upd02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL6010_PcmExtIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6010", "PcmExtIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rerun_flg", "rerun_flg")
			}
			,
			MCBlockDef.create("PcmExtIf_Upd02_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL6010_PcmExtIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6010", "PcmExtIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PcmExtIf_Upd02_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL6010_PcmExtIf_Upd03_INFO = new MCOperationInfo("MG", "MGBBL6010", "PcmExtIf_Upd03", "000000", new PDef());

	public static MCContainerDef MG_MGBBL6010_PcmExtIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6010", "PcmExtIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rerun_flg", "rerun_flg")
			}
			,
			MCBlockDef.create("PcmExtIf_Upd03_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL6010_PcmExtIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6010", "PcmExtIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PcmExtIf_Upd03_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL6010_PcmExtIf_Upd04_INFO = new MCOperationInfo("MG", "MGBBL6010", "PcmExtIf_Upd04", "000000", new PDef());

	public static MCContainerDef MG_MGBBL6010_PcmExtIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6010", "PcmExtIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rerun_flg", "rerun_flg")
			}
			,
			MCBlockDef.create("PcmExtIf_Upd04_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL6010_PcmExtIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6010", "PcmExtIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PcmExtIf_Upd04_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL6010_PcmExtIf_Upd05_INFO = new MCOperationInfo("MG", "MGBBL6010", "PcmExtIf_Upd05", "000000", new PDef());

	public static MCContainerDef MG_MGBBL6010_PcmExtIf_Upd05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6010", "PcmExtIf_Upd05",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rerun_flg", "rerun_flg")
			}
			,
			MCBlockDef.create("PcmExtIf_Upd05_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL6010_PcmExtIf_Upd05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL6010", "PcmExtIf_Upd05",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PcmExtIf_Upd05_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

