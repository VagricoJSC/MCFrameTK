package mcframe.serverMGBB.MGBBL5010;

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
 * [MGBBL_PcmIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL5010.PcmIf_Chk01.UP.BLOCK0")){
			return MG_MGBBL5010_PcmIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL5010.PcmIf_Chk01.DOWN.BLOCK0")){
			return MG_MGBBL5010_PcmIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL5010.PcmIf_Upd01.UP.BLOCK0")){
			return MG_MGBBL5010_PcmIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL5010.PcmIf_Upd01.DOWN.BLOCK0")){
			return MG_MGBBL5010_PcmIf_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MG_MGBBL5010_PcmIf_Chk01_INFO = new MCOperationInfo("MG", "MGBBL5010", "PcmIf_Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL5010_PcmIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL5010", "PcmIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("io_flg", "io_flg"),
				MCItemDef.create("wk_flg", "wk_flg"),
				MCItemDef.create("wip_flg", "wip_flg"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("rerun_flg", "rerun_flg"),
				MCItemDef.create("non_mov_flg", "non_mov_flg")
			}
			,
			MCBlockDef.create("PcmIf_Chk01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL5010_PcmIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL5010", "PcmIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("io_flg", "io_flg"),
				MCItemDef.create("wk_flg", "wk_flg"),
				MCItemDef.create("wip_flg", "wip_flg"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("rerun_flg", "rerun_flg"),
				MCItemDef.create("non_mov_flg", "non_mov_flg"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PcmIf_Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL5010_PcmIf_Upd01_INFO = new MCOperationInfo("MG", "MGBBL5010", "PcmIf_Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL5010_PcmIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL5010", "PcmIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("io_flg", "io_flg"),
				MCItemDef.create("wk_flg", "wk_flg"),
				MCItemDef.create("wip_flg", "wip_flg"),
				MCItemDef.create("stk_flg", "stk_flg"),
				MCItemDef.create("rerun_flg", "rerun_flg"),
				MCItemDef.create("non_mov_flg", "non_mov_flg")
			}
			,
			MCBlockDef.create("PcmIf_Upd01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL5010_PcmIf_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL5010", "PcmIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PcmIf_Upd01_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

