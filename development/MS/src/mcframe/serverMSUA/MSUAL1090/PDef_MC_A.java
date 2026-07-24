package mcframe.serverMSUA.MSUAL1090;

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
 * [MSUAL_SetItm]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSUAL1090.Srch01.UP.BLOCK0")){
			return MS_MSUAL1090_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSUAL1090.Srch01.DOWN.BLOCK0")){
			return MS_MSUAL1090_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSUAL1090_Srch01_INFO = new MCOperationInfo("MS", "MSUAL1090", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSUAL1090_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUAL1090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("main_itm_cd", "main_itm_cd"),
				MCItemDef.create("main_itm_sub1", "main_itm_sub1"),
				MCItemDef.create("main_itm_sub2", "main_itm_sub2"),
				MCItemDef.create("main_itm_sub3", "main_itm_sub3"),
				MCItemDef.create("main_itm_unit_cd", "main_itm_unit_cd"),
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("set_grp_nm", "set_grp_nm"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("main_itm_qty", "main_itm_qty")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSUAL1090_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUAL1090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("set_grp_cd", "set_grp_cd"),
				MCItemDef.create("set_grp_nm", "set_grp_nm"),
				MCItemDef.create("ship_assort_flg", "ship_assort_flg"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("set_itm_cd", "set_itm_cd"),
				MCItemDef.create("set_itm_sub1", "set_itm_sub1"),
				MCItemDef.create("set_itm_sub2", "set_itm_sub2"),
				MCItemDef.create("set_itm_sub3", "set_itm_sub3"),
				MCItemDef.create("set_itm_nm", "set_itm_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("set_itm_unit_cd", "set_itm_unit_cd"),
				MCItemDef.create("set_itm_unit_nm", "set_itm_unit_nm"),
				MCItemDef.create("qty", "qty")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

