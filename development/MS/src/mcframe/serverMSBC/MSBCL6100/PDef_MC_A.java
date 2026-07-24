package mcframe.serverMSBC.MSBCL6100;

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
 * [MSBCL_VerChgUpdService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6100.VerChg_Upd01.UP.BLOCK0")){
			return MS_MSBCL6100_VerChg_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBCL6100_VerChg_Upd01_INFO = new MCOperationInfo("MS", "MSBCL6100", "VerChg_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6100_VerChg_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6100", "VerChg_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ver_chg_p" + ".par_itm_cd", "par_itm_cd"),
				MCItemDef.create("ver_chg_p" + ".par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("ver_chg_p" + ".par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("ver_chg_p" + ".par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("ver_chg_p" + ".chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("ver_chg_p" + ".chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("ver_chg_p" + ".chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("ver_chg_p" + ".chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("ver_chg_p" + ".ver_no", "ver_no"),
				MCItemDef.create("ver_chg_p" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("ver_chg_p" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ver_chg_p" + ".site_cd", "site_cd")
			}
			,
			MCBlockDef.create("VerChgUpd_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

