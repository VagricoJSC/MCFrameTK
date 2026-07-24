package mcframe.serverMSBA.MSBAL5120;

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
 * [MSBAL_DlyDmndCrtService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBAL5120.DlyDmndCrt_Upd01.UP.BLOCK0")){
			return MS_MSBAL5120_DlyDmndCrt_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBAL5120_DlyDmndCrt_Upd01_INFO = new MCOperationInfo("MS", "MSBAL5120", "DlyDmndCrt_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBAL5120_DlyDmndCrt_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5120", "DlyDmndCrt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("reg_flg", "reg_flg"),
				MCItemDef.create("date_div_flg", "date_div_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("fr_screen_flg", "fr_screen_flg")
			}
			,
			MCBlockDef.create("DlyDmndCrt_Upd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

