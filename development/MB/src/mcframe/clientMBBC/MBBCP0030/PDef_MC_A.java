package mcframe.clientMBBC.MBBCP0030;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MBBCP_FileSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBCL0030.Srch01.UP.BLOCK0")){
			return MB_MBBCL0030_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBCL0030.Srch01.DOWN.BLOCK0")){
			return MB_MBBCL0030_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MB_MBBCL0030_Srch01_INFO = new MCOperationInfo("MB", "MBBCL0030", "Srch01", "000000", new PDef());

	public static MCContainerDef MB_MBBCL0030_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBCL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("file_path", "file_path"),
				MCItemDef.create("folder_select_mode_flg", "folder_select_mode_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MB_MBBCL0030_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MB", "MBBCL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("typ_nm", "typ_nm"),
				MCItemDef.create("file_nm", "file_nm"),
				MCItemDef.create("file_path", "file_path")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

