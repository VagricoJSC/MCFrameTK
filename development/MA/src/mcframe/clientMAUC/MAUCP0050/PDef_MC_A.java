package mcframe.clientMAUC.MAUCP0050;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MAUCP_InptChkUtil]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MAUCL0050.Srch01.UP.BLOCK0")){
			return MA_MAUCL0050_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0050.Srch01.DOWN.BLOCK0")){
			return MA_MAUCL0050_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0050.Srch02.UP.BLOCK0")){
			return MA_MAUCL0050_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0050.Srch02.DOWN.BLOCK0")){
			return MA_MAUCL0050_Srch02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MA_MAUCL0050_Srch01_INFO = new MCOperationInfo("MA", "MAUCL0050", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MAUCL0050_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("func_typ", "func_typ")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MAUCL0050_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("func_typ", "func_typ")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0050_Srch02_INFO = new MCOperationInfo("MA", "MAUCL0050", "Srch02", "000000", new PDef());

	public static MCContainerDef MA_MAUCL0050_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0050", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("func_typ", "func_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("num", "num"),
				MCItemDef.create("base_num", "base_num")
			}
			,
			MCBlockDef.create("Srch02_Dtl")
		);
	}


	public static MCContainerDef MA_MAUCL0050_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0050", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("up_rate_lmt", "up_rate_lmt"),
				MCItemDef.create("low_rate_lmt", "low_rate_lmt"),
				MCItemDef.create("up_lmt_rslt_flg", "up_lmt_rslt_flg"),
				MCItemDef.create("low_lmt_rslt_flg", "low_lmt_rslt_flg")
			}
			,
			MCBlockDef.create("Srch02_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

