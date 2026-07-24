package mcframe.serverMBBE.MBBEL0080;

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
 * [MBBEL_BatchIfDataConfirm]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBEL0080.Srch01.UP.BLOCK0")){
			return MB_MBBEL0080_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0080.Srch01.DOWN.BLOCK0")){
			return MB_MBBEL0080_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0080.Upd01.UP.BLOCK0")){
			return MB_MBBEL0080_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0080.Upd01.UP.BLOCK1")){
			return MB_MBBEL0080_Upd01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MB_MBBEL0080_Srch01_INFO = new MCOperationInfo("MB", "MBBEL0080", "Srch01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0080_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("log_sub_key1", "log_sub_key1"),
				MCItemDef.create("log_sub_key2", "log_sub_key2")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MB_MBBEL0080_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("seq", "seq"),
				MCItemDef.create("log_sub_key1", "log_sub_key1"),
				MCItemDef.create("log_sub_key2", "log_sub_key2"),
				MCItemDef.create("batch_log_typ", "batch_log_typ"),
				MCItemDef.create("batch_log_typ_nm", "batch_log_typ_nm"),
				MCItemDef.create("msg_id", "msg_id"),
				MCItemDef.create("msg_lvl", "msg_lvl"),
				MCItemDef.create("msg_txt", "msg_txt"),
				MCItemDef.create("log_ts", "log_ts")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0080_Upd01_INFO = new MCOperationInfo("MB", "MBBEL0080", "Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0080_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0080", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("imp_ope", "imp_ope"),
				MCItemDef.create("moduleid", "moduleid"),
				MCItemDef.create("screenid", "screenid"),
				MCItemDef.create("table", "table"),
				MCItemDef.create("if_proc_typ", "if_proc_typ")
			}
			,
			MCBlockDef.create("Upd01_Cnd")
		);
	}

	public static MCContainerDef MB_MBBEL0080_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBEL0080", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rowno", true, "rowno"),
				MCItemDef.create("id", true, "id"),
				MCItemDef.create("type", true, "type"),
				MCItemDef.create("STRING", "STRING"),
				MCItemDef.create("NUMBER", "NUMBER"),
				MCItemDef.create("BOOLEAN", "BOOLEAN"),
				MCItemDef.create("DATE", "DATE"),
				MCItemDef.create("TIMESTAMP", "TIMESTAMP"),
				MCItemDef.create("BINARY", "BINARY")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

