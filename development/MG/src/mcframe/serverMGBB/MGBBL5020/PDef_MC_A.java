package mcframe.serverMGBB.MGBBL5020;

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
 * [MGBBL_PcmActService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL5020.PcmAct_Chk01.UP.BLOCK0")){
			return MG_MGBBL5020_PcmAct_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL5020.PcmAct_Chk01.DOWN.BLOCK0")){
			return MG_MGBBL5020_PcmAct_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL5020.PcmAct_Upd01.UP.BLOCK0")){
			return MG_MGBBL5020_PcmAct_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL5020.PcmAct_Upd01.DOWN.BLOCK0")){
			return MG_MGBBL5020_PcmAct_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MG_MGBBL5020_PcmAct_Chk01_INFO = new MCOperationInfo("MG", "MGBBL5020", "PcmAct_Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL5020_PcmAct_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL5020", "PcmAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("io_flg", "io_flg"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("del_flg", "del_flg")
			}
			,
			MCBlockDef.create("PcmAct_Chk01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL5020_PcmAct_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL5020", "PcmAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("io_flg", "io_flg"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PcmAct_Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL5020_PcmAct_Upd01_INFO = new MCOperationInfo("MG", "MGBBL5020", "PcmAct_Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL5020_PcmAct_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL5020", "PcmAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("io_flg", "io_flg"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("del_flg", "del_flg")
			}
			,
			MCBlockDef.create("PcmAct_Upd01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL5020_PcmAct_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL5020", "PcmAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PcmAct_Upd01_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

