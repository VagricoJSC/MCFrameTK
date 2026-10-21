package mcframe.serverMSBB.MSBBLA0020;

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
 * [MSBBLA_ShipItmCompSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBLA0020.Srch01.UP.BLOCK0")){
			return MS_MSBBLA0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBLA0020.Srch01.DOWN.BLOCK0")){
			return MS_MSBBLA0020_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBBLA0020_Srch01_INFO = new MCOperationInfo("MS", "MSBBLA0020", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBLA0020_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBLA0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("prod_itm_cd", "prod_itm_cd"),
				MCItemDef.create("prod_itm_sub1", "prod_itm_sub1"),
				MCItemDef.create("prod_itm_sub2", "prod_itm_sub2"),
				MCItemDef.create("prod_itm_sub3", "prod_itm_sub3"),
				MCItemDef.create("prod_itm_nm", "prod_itm_nm"),
				MCItemDef.create("diameter", "diameter"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBLA0020_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBLA0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("prod_itm_cd", "prod_itm_cd"),
				MCItemDef.create("prod_itm_sub1", "prod_itm_sub1"),
				MCItemDef.create("prod_itm_sub2", "prod_itm_sub2"),
				MCItemDef.create("prod_itm_sub3", "prod_itm_sub3"),
				MCItemDef.create("prod_itm_nm", "prod_itm_nm"),
				MCItemDef.create("surv_line_qty", "surv_line_qty"),
				MCItemDef.create("diameter", "diameter"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("spec_cd", "spec_cd"),
				MCItemDef.create("body_flg", "body_flg"),
				MCItemDef.create("comp_flg", "comp_flg"),
				MCItemDef.create("ship_prnt_flg", "ship_prnt_flg")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

