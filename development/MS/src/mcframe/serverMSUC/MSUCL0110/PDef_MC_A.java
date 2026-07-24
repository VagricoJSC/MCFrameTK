package mcframe.serverMSUC.MSUCL0110;

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
 * [MSUCL_StrLnUtil]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSUCL0110.StrLnUtil_Srch01.UP.BLOCK0")){
			return MS_MSUCL0110_StrLnUtil_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0110.StrLnUtil_Srch01.DOWN.BLOCK0")){
			return MS_MSUCL0110_StrLnUtil_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSUCL0110_StrLnUtil_Srch01_INFO = new MCOperationInfo("MS", "MSUCL0110", "StrLnUtil_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSUCL0110_StrLnUtil_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0110", "StrLnUtil_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("StrLnUtil_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSUCL0110_StrLnUtil_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0110", "StrLnUtil_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm")
			}
			,
			MCBlockDef.create("StrLnUtil_Srch01_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

