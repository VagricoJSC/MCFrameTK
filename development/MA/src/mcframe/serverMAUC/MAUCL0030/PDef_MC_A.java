package mcframe.serverMAUC.MAUCL0030;

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
 * [MAUCL_Dac]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MAUCL0030.Srch01.UP.BLOCK0")){
			return MA_MAUCL0030_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0030.Srch01.DOWN.BLOCK0")){
			return MA_MAUCL0030_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0030.Srch01.DOWN.BLOCK1")){
			return MA_MAUCL0030_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MAUCL0030.Srch02.UP.BLOCK0")){
			return MA_MAUCL0030_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0030.Srch02.DOWN.BLOCK0")){
			return MA_MAUCL0030_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0030.Srch02.DOWN.BLOCK1")){
			return MA_MAUCL0030_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MAUCL0030.Srch03.UP.BLOCK0")){
			return MA_MAUCL0030_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0030.Srch03.DOWN.BLOCK0")){
			return MA_MAUCL0030_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0030.Srch03.DOWN.BLOCK1")){
			return MA_MAUCL0030_Srch03_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MAUCL0030.Srch04.UP.BLOCK0")){
			return MA_MAUCL0030_Srch04_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0030.Srch04.DOWN.BLOCK0")){
			return MA_MAUCL0030_Srch04_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0030.Srch04.DOWN.BLOCK1")){
			return MA_MAUCL0030_Srch04_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MAUCL0030.Srch05.UP.BLOCK0")){
			return MA_MAUCL0030_Srch05_UP_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0030.Srch05.DOWN.BLOCK0")){
			return MA_MAUCL0030_Srch05_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0030.Srch05.DOWN.BLOCK1")){
			return MA_MAUCL0030_Srch05_DOWN_BLOCK1();
		}
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
		else if (id.equals("MA.MAUCL0030.Srch10.DOWN.BLOCK0")){
			return MA_MAUCL0030_Srch10_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0030.Srch10.DOWN.BLOCK1")){
			return MA_MAUCL0030_Srch10_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MAUCL0030.Srch10.DOWN.BLOCK2")){
			return MA_MAUCL0030_Srch10_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MAUCL0030.Srch10.DOWN.BLOCK3")){
			return MA_MAUCL0030_Srch10_DOWN_BLOCK3();
		}
		else if (id.equals("MA.MAUCL0030.Srch10.DOWN.BLOCK4")){
			return MA_MAUCL0030_Srch10_DOWN_BLOCK4();
		}
		else if (id.equals("MA.MAUCL0030.Srch10.DOWN.BLOCK5")){
			return MA_MAUCL0030_Srch10_DOWN_BLOCK5();
		}
		else if (id.equals("MA.MAUCL0030.Srch10.DOWN.BLOCK6")){
			return MA_MAUCL0030_Srch10_DOWN_BLOCK6();
		}
		else if (id.equals("MA.MAUCL0030.Srch10.DOWN.BLOCK7")){
			return MA_MAUCL0030_Srch10_DOWN_BLOCK7();
		}
		else if (id.equals("MA.MAUCL0030.Srch10.DOWN.BLOCK8")){
			return MA_MAUCL0030_Srch10_DOWN_BLOCK8();
		}
		else if (id.equals("MA.MAUCL0030.Srch10.DOWN.BLOCK9")){
			return MA_MAUCL0030_Srch10_DOWN_BLOCK9();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
													
	
	static final MCOperationInfo MA_MAUCL0030_Srch01_INFO = new MCOperationInfo("MA", "MAUCL0030", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MAUCL0030_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", true, "usr_cd"),
				MCItemDef.create("srch_only_flg", true, "srch_only_flg")
			}
			,
			MCBlockDef.create("LoginInfo")
		);
	}


	public static MCContainerDef MA_MAUCL0030_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm")
			}
			,
			MCBlockDef.create("Srch01_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm")
			}
			,
			MCBlockDef.create("Srch01_Rslt_Wr")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0030_Srch02_INFO = new MCOperationInfo("MA", "MAUCL0030", "Srch02", "000000", new PDef());

	public static MCContainerDef MA_MAUCL0030_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", true, "usr_cd"),
				MCItemDef.create("srch_only_flg", true, "srch_only_flg")
			}
			,
			MCBlockDef.create("LoginInfo")
		);
	}


	public static MCContainerDef MA_MAUCL0030_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm")
			}
			,
			MCBlockDef.create("Srch02_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm")
			}
			,
			MCBlockDef.create("Srch02_Rslt_Wr")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0030_Srch03_INFO = new MCOperationInfo("MA", "MAUCL0030", "Srch03", "000000", new PDef());

	public static MCContainerDef MA_MAUCL0030_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", true, "usr_cd"),
				MCItemDef.create("srch_only_flg", true, "srch_only_flg")
			}
			,
			MCBlockDef.create("LoginInfo")
		);
	}


	public static MCContainerDef MA_MAUCL0030_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm")
			}
			,
			MCBlockDef.create("Srch03_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm")
			}
			,
			MCBlockDef.create("Srch03_Rslt_Wr")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0030_Srch04_INFO = new MCOperationInfo("MA", "MAUCL0030", "Srch04", "000000", new PDef());

	public static MCContainerDef MA_MAUCL0030_Srch04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", true, "usr_cd"),
				MCItemDef.create("srch_only_flg", true, "srch_only_flg")
			}
			,
			MCBlockDef.create("LoginInfo")
		);
	}


	public static MCContainerDef MA_MAUCL0030_Srch04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm")
			}
			,
			MCBlockDef.create("Srch04_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch04_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm")
			}
			,
			MCBlockDef.create("Srch04_Rslt_Wr")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0030_Srch05_INFO = new MCOperationInfo("MA", "MAUCL0030", "Srch05", "000000", new PDef());

	public static MCContainerDef MA_MAUCL0030_Srch05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch05",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", true, "usr_cd"),
				MCItemDef.create("srch_only_flg", true, "srch_only_flg")
			}
			,
			MCBlockDef.create("LoginInfo")
		);
	}


	public static MCContainerDef MA_MAUCL0030_Srch05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch05",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm")
			}
			,
			MCBlockDef.create("Srch05_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch05_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch05",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm")
			}
			,
			MCBlockDef.create("Srch05_Rslt_Wr")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0030_Srch09_INFO = new MCOperationInfo("MA", "MAUCL0030", "Srch09", "000000", new PDef());

	public static MCContainerDef MA_MAUCL0030_Srch09_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", true, "usr_cd"),
				MCItemDef.create("srch_only_flg", true, "srch_only_flg")
			}
			,
			MCBlockDef.create("LoginInfo")
		);
	}


	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm")
			}
			,
			MCBlockDef.create("Srch01_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm")
			}
			,
			MCBlockDef.create("Srch01_Rslt_Wr")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm")
			}
			,
			MCBlockDef.create("Srch02_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm")
			}
			,
			MCBlockDef.create("Srch02_Rslt_Wr")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm")
			}
			,
			MCBlockDef.create("Srch03_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm")
			}
			,
			MCBlockDef.create("Srch03_Rslt_Wr")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm")
			}
			,
			MCBlockDef.create("Srch04_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK7() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm")
			}
			,
			MCBlockDef.create("Srch04_Rslt_Wr")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK8() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm")
			}
			,
			MCBlockDef.create("Srch05_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch09_DOWN_BLOCK9() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm")
			}
			,
			MCBlockDef.create("Srch05_Rslt_Wr")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0030_Srch10_INFO = new MCOperationInfo("MA", "MAUCL0030", "Srch10", "000000", new PDef());


	public static MCContainerDef MA_MAUCL0030_Srch10_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch10",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm")
			}
			,
			MCBlockDef.create("Srch01_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch10_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch10",
			new MCItemDef[]{
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm")
			}
			,
			MCBlockDef.create("Srch01_Rslt_Wr")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch10_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch10",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm")
			}
			,
			MCBlockDef.create("Srch02_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch10_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch10",
			new MCItemDef[]{
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm")
			}
			,
			MCBlockDef.create("Srch02_Rslt_Wr")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch10_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch10",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm")
			}
			,
			MCBlockDef.create("Srch03_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch10_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch10",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm")
			}
			,
			MCBlockDef.create("Srch03_Rslt_Wr")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch10_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch10",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm")
			}
			,
			MCBlockDef.create("Srch04_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch10_DOWN_BLOCK7() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch10",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm")
			}
			,
			MCBlockDef.create("Srch04_Rslt_Wr")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch10_DOWN_BLOCK8() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch10",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm")
			}
			,
			MCBlockDef.create("Srch05_Rslt_Rd")
		);
	}
	public static MCContainerDef MA_MAUCL0030_Srch10_DOWN_BLOCK9() {

		return new MCGeneralContainerDef("MA", "MAUCL0030", "Srch10",
			new MCItemDef[]{
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm")
			}
			,
			MCBlockDef.create("Srch05_Rslt_Wr")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0030_Del01_INFO = new MCOperationInfo("MA", "MAUCL0030", "Del01", "000000", new PDef());
	
	static final MCOperationInfo MA_MAUCL0030_Del02_INFO = new MCOperationInfo("MA", "MAUCL0030", "Del02", "000000", new PDef());
	
	static final MCOperationInfo MA_MAUCL0030_Del03_INFO = new MCOperationInfo("MA", "MAUCL0030", "Del03", "000000", new PDef());
	
	static final MCOperationInfo MA_MAUCL0030_Del04_INFO = new MCOperationInfo("MA", "MAUCL0030", "Del04", "000000", new PDef());
	
	static final MCOperationInfo MA_MAUCL0030_Del05_INFO = new MCOperationInfo("MA", "MAUCL0030", "Del05", "000000", new PDef());
	
	static final MCOperationInfo MA_MAUCL0030_Del09_INFO = new MCOperationInfo("MA", "MAUCL0030", "Del09", "000000", new PDef());


	//FMCB DEF_CLASSES END
}

