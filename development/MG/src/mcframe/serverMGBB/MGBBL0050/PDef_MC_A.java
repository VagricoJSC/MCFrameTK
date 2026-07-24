package mcframe.serverMGBB.MGBBL0050;

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
 * [MGBBL_InstInfoReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL0050.Chk01.UP.BLOCK0")){
			return MG_MGBBL0050_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0050.Upd01.UP.BLOCK0")){
			return MG_MGBBL0050_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MG_MGBBL0050_Chk01_INFO = new MCOperationInfo("MG", "MGBBL0050", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0050_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0050", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("itm_mfg_inst_flg", "itm_mfg_inst_flg"),
				MCItemDef.create("inst_oper_flg", "inst_oper_flg")
			}
			,
			MCBlockDef.create("Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0050_Upd01_INFO = new MCOperationInfo("MG", "MGBBL0050", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0050_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0050", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("itm_mfg_inst_flg", "itm_mfg_inst_flg"),
				MCItemDef.create("inst_oper_flg", "inst_oper_flg")
			}
			,
			MCBlockDef.create("Upd01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

