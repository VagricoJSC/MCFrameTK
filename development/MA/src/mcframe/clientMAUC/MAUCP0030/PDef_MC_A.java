package mcframe.clientMAUC.MAUCP0030;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MAUCP_Dac]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MAUCL0030.Srch09.UP.BLOCK0")){
			return MA_MAUCL0030_Srch09_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0030.Srch09.DOWN.BLOCK0")){
			return MA_MAUCL0030_Srch09_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0030.Srch09.DOWN.BLOCK1")){
			return MA_MAUCL0030_Srch09_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MAUCL0030.Srch09.DOWN.BLOCK2")){
			return MA_MAUCL0030_Srch09_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MAUCL0030.Srch09.DOWN.BLOCK3")){
			return MA_MAUCL0030_Srch09_DOWN_BLOCK3();
		}
		else if (id.equals("MA.MAUCL0030.Srch09.DOWN.BLOCK4")){
			return MA_MAUCL0030_Srch09_DOWN_BLOCK4();
		}
		else if (id.equals("MA.MAUCL0030.Srch09.DOWN.BLOCK5")){
			return MA_MAUCL0030_Srch09_DOWN_BLOCK5();
		}
		else if (id.equals("MA.MAUCL0030.Srch09.DOWN.BLOCK6")){
			return MA_MAUCL0030_Srch09_DOWN_BLOCK6();
		}
		else if (id.equals("MA.MAUCL0030.Srch09.DOWN.BLOCK7")){
			return MA_MAUCL0030_Srch09_DOWN_BLOCK7();
		}
		else if (id.equals("MA.MAUCL0030.Srch09.DOWN.BLOCK8")){
			return MA_MAUCL0030_Srch09_DOWN_BLOCK8();
		}
		else if (id.equals("MA.MAUCL0030.Srch09.DOWN.BLOCK9")){
			return MA_MAUCL0030_Srch09_DOWN_BLOCK9();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MA_MAUCL0030_Srch09_INFO = new MCOperationInfo("MA", "MAUCL0030", "Srch09", "000000", new PDef());

	public static MCContainerDef MA_MAUCL0030_Srch09_UP_BLOCK0() {
		/** Ope.のBlock [LoginInfo] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("srch_only_flg", "srch_only_flg")
			}
			,
			MCBlockDef.create("LoginInfo")
		);
	}


	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt_Rd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm")
			}
			,
			MCBlockDef.create("RdDptDac")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt_Wr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm")
			}
			,
			MCBlockDef.create("WrDptDac")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch02_Rslt_Rd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm")
			}
			,
			MCBlockDef.create("RdLgGrpDac")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch02_Rslt_Wr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm")
			}
			,
			MCBlockDef.create("WrLgGrpDac")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK4() {
	/** Ope.のBlock [Srch03_Rslt_Rd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm")
			}
			,
			MCBlockDef.create("RdLocDac")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK5() {
	/** Ope.のBlock [Srch03_Rslt_Wr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm")
			}
			,
			MCBlockDef.create("WrLocDac")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK6() {
	/** Ope.のBlock [Srch04_Rslt_Rd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm")
			}
			,
			MCBlockDef.create("RdWgDac")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK7() {
	/** Ope.のBlock [Srch04_Rslt_Wr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm")
			}
			,
			MCBlockDef.create("WrWgDac")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK8() {
	/** Ope.のBlock [Srch05_Rslt_Rd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm")
			}
			,
			MCBlockDef.create("RdAlcGrpDac")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK9() {
	/** Ope.のBlock [Srch05_Rslt_Wr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm")
			}
			,
			MCBlockDef.create("WrAlcGrpDac")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0030_Del09_INFO = new MCOperationInfo("MA", "MAUCL0030", "Del09", "000000", new PDef());


	//FMCB DEF_CLASSES END
}

