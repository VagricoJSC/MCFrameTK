package mcframe.serverMSUC.MSUCL0120;

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
 * [MSUCL_BpUtil]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSUCL0120.BpUtil_Sprt01.UP.BLOCK0")){
			return MS_MSUCL0120_BpUtil_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSUCL0120.BpUtil_Sprt01.UP.BLOCK1")){
			return MS_MSUCL0120_BpUtil_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSUCL0120.BpUtil_Sprt01.DOWN.BLOCK0")){
			return MS_MSUCL0120_BpUtil_Sprt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSUCL0120_BpUtil_Sprt01_INFO = new MCOperationInfo("MS", "MSUCL0120", "BpUtil_Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSUCL0120_BpUtil_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0120", "BpUtil_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("bp_typ", "bp_typ")
			}
			,
			MCBlockDef.create("BpUtil_Sprt01_Cnd")
		);
	}

	public static MCContainerDef MS_MSUCL0120_BpUtil_Sprt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSUCL0120", "BpUtil_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd")
			}
			,
			MCBlockDef.create("BpUtil_Sprt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSUCL0120_BpUtil_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSUCL0120", "BpUtil_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("BpUtil_Sprt01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

