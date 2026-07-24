package mcframe.serverMABC.MABCL0260;

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
 * [MABCL_UsrImageReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0260.UsrImage_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0260_UsrImage_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0260.UsrImage_Upd01.UP.BLOCK0")){
			return MA_MABCL0260_UsrImage_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0260.Srch01.UP.BLOCK0")){
			return MA_MABCL0260_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0260.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0260_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0260.Upd01.UP.BLOCK0")){
			return MA_MABCL0260_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MA_MABCL0260_UsrImage_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0260", "UsrImage_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0260_UsrImage_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0260", "UsrImage_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("UsrImage_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0260_UsrImage_Upd01_INFO = new MCOperationInfo("MA", "MABCL0260", "UsrImage_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0260_UsrImage_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0260", "UsrImage_Upd01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("UsrImage_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0260_Srch01_INFO = new MCOperationInfo("MA", "MABCL0260", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0260_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0260", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0260_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0260", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	
	static final MCOperationInfo MA_MABCL0260_Upd01_INFO = new MCOperationInfo("MA", "MABCL0260", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0260_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0260", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

