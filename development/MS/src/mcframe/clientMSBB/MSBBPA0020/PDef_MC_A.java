package mcframe.clientMSBB.MSBBPA0020;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBBPA_ShipItmCompSrch]の入出力情報となる電文（上り・下り電文）と
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
		/** Ope.のBlock [Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBLA0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("par_itm_p" + ".itm_cd", "prod_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "prod_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "prod_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "prod_itm_sub3"),
				MCItemDef.create("par_itm_p" + ".itm_nm", "prod_itm_nm"),
				MCItemDef.IGNORE_ITEM("surv_line_qty"),
				MCItemDef.IGNORE_ITEM("diameter"),
				MCItemDef.IGNORE_ITEM("itm_cd"),
				MCItemDef.IGNORE_ITEM("itm_sub1"),
				MCItemDef.IGNORE_ITEM("itm_sub2"),
				MCItemDef.IGNORE_ITEM("itm_sub3"),
				MCItemDef.IGNORE_ITEM("itm_nm")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBLA0020_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBLA0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("par_itm_p" + ".itm_cd", "prod_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "prod_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "prod_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "prod_itm_sub3"),
				MCItemDef.create("par_itm_p" + ".itm_nm", "prod_itm_nm"),
				MCItemDef.IGNORE_ITEM("surv_line_qty"),
				MCItemDef.IGNORE_ITEM("diameter"),
				MCItemDef.create("chd_itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("chd_itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("chd_itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("chd_itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("chd_itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.IGNORE_ITEM("base_unit_cd"),
				MCItemDef.IGNORE_ITEM("base_unit_nm"),
				MCItemDef.IGNORE_ITEM("qty"),
				MCItemDef.IGNORE_ITEM("spec_cd"),
				MCItemDef.IGNORE_ITEM("body_flg"),
				MCItemDef.IGNORE_ITEM("comp_flg"),
				MCItemDef.IGNORE_ITEM("ship_prnt_flg")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

