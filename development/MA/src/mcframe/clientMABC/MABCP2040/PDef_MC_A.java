package mcframe.clientMABC.MABCP2040;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_MenuConfigReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL2040.Srch01.UP.BLOCK0")){
			return MA_MABCL2040_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL2040.Srch01.DOWN.BLOCK0")){
			return MA_MABCL2040_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL2040.Srch01.DOWN.BLOCK1")){
			return MA_MABCL2040_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL2040.Upd01.UP.BLOCK0")){
			return MA_MABCL2040_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL2040.Upd01.UP.BLOCK1")){
			return MA_MABCL2040_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL2040.Del01.UP.BLOCK0")){
			return MA_MABCL2040_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABCL2040_Srch01_INFO = new MCOperationInfo("MA", "MABCL2040", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2040_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL2040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("menu_cd", "menu_cd")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABCL2040_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL2040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("menu_no", "menu_no"),
				MCItemDef.create("module_id", "module_id"),
				MCItemDef.create("scrn_id", "scrn_id"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Menu")
		);
	}
	public static MCContainerDef MA_MABCL2040_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Hdr1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL2040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("menu_cd", "menu_cd"),
				MCItemDef.create("menu_nm", "menu_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MA_MABCL2040_Upd01_INFO = new MCOperationInfo("MA", "MABCL2040", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2040_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL2040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("menu_cd", "menu_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MA_MABCL2040_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL2040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("menu_no", "menu_no"),
				MCItemDef.create("module_id", "module_id"),
				MCItemDef.create("scrn_id", "scrn_id")
			}
			,
			MCBlockDef.create("Menu")
		);
	}
	
	static final MCOperationInfo MA_MABCL2040_Del01_INFO = new MCOperationInfo("MA", "MABCL2040", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL2040_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL2040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("menu_cd", "menu_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

