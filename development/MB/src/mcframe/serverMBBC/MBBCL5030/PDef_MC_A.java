package mcframe.serverMBBC.MBBCL5030;

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
 * [MBBCL_InvoiceAgentLinkService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBCL5030.IALink_Srch01.UP.BLOCK0")){
			return MB_MBBCL5030_IALink_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBCL5030.IALink_Srch01.DOWN.BLOCK0")){
			return MB_MBBCL5030_IALink_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBCL5030.IALink_Copy01.UP.BLOCK0")){
			return MB_MBBCL5030_IALink_Copy01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBCL5030.IALink_Copy01.DOWN.BLOCK0")){
			return MB_MBBCL5030_IALink_Copy01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MB_MBBCL5030_IALink_Srch01_INFO = new MCOperationInfo("MB", "MBBCL5030", "IALink_Srch01", "000000", new PDef());

	public static MCContainerDef MB_MBBCL5030_IALink_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5030", "IALink_Srch01",
			new MCItemDef[]{
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("dir", "dir"),
				MCItemDef.create("inc_file_flg", "inc_file_flg")
			}
			,
			MCBlockDef.create("IALink_Srch01_Cnd")
		);
	}


	public static MCContainerDef MB_MBBCL5030_IALink_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5030", "IALink_Srch01",
			new MCItemDef[]{
				MCItemDef.create("id", "id"),
				MCItemDef.create("name", "name"),
				MCItemDef.create("type", "type"),
				MCItemDef.create("updatedate", "updatedate"),
				MCItemDef.create("filesize", "filesize")
			}
			,
			MCBlockDef.create("IALink_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MB_MBBCL5030_IALink_Copy01_INFO = new MCOperationInfo("MB", "MBBCL5030", "IALink_Copy01", "000000", new PDef());

	public static MCContainerDef MB_MBBCL5030_IALink_Copy01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5030", "IALink_Copy01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("src_file", "src_file"),
				MCItemDef.create("file_path", "file_path"),
				MCItemDef.create("file_name", "file_name"),
				MCItemDef.create("overwrite_flg", "overwrite_flg")
			}
			,
			MCBlockDef.create("IALink_Copy01_Dtl")
		);
	}


	public static MCContainerDef MB_MBBCL5030_IALink_Copy01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBCL5030", "IALink_Copy01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("file_name", "file_name"),
				MCItemDef.create("id", "id")
			}
			,
			MCBlockDef.create("IALink_Copy01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

