package mcframe.serverMBBE.MBBEL0090;

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
 * [MBBEL_BulkImpReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBEL0090.Srch01.UP.BLOCK0")){
			return MB_MBBEL0090_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0090.Srch01.DOWN.BLOCK0")){
			return MB_MBBEL0090_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0090.Upd01.UP.BLOCK0")){
			return MB_MBBEL0090_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0090.Upd01.UP.BLOCK1")){
			return MB_MBBEL0090_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MB.MBBEL0090.Upd02.UP.BLOCK0")){
			return MB_MBBEL0090_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0090.Upd02.UP.BLOCK1")){
			return MB_MBBEL0090_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MB.MBBEL0090.Upd03.UP.BLOCK0")){
			return MB_MBBEL0090_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0090.Upd03.UP.BLOCK1")){
			return MB_MBBEL0090_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MB.MBBEL0090.Upd03.DOWN.BLOCK0")){
			return MB_MBBEL0090_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0090.Prnt01.UP.BLOCK0")){
			return MB_MBBEL0090_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0090.Prnt01.DOWN.BLOCK0")){
			return MB_MBBEL0090_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0090.Prnt02.UP.BLOCK0")){
			return MB_MBBEL0090_Prnt02_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0090.Prnt02.UP.BLOCK1")){
			return MB_MBBEL0090_Prnt02_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MB_MBBEL0090_Srch01_INFO = new MCOperationInfo("MB", "MBBEL0090", "Srch01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0090_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("table_ctg", "table_ctg"),
				MCItemDef.create("table_ctg_nm", "table_ctg_nm"),
				MCItemDef.create("table_id", "table_id"),
				MCItemDef.create("table_nm", "table_nm")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MB_MBBEL0090_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("table_ctg", "table_ctg"),
				MCItemDef.create("table_ctg_nm", "table_ctg_nm"),
				MCItemDef.create("table_ctg_seq", "table_ctg_seq"),
				MCItemDef.create("table_id", "table_id"),
				MCItemDef.create("table_nm", "table_nm"),
				MCItemDef.create("table_seq", "table_seq")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0090_Upd01_INFO = new MCOperationInfo("MB", "MBBEL0090", "Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0090_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0090", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("table_id", "table_id"),
				MCItemDef.create("file_nm", "file_nm"),
				MCItemDef.create("file_dat", "file_dat")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}

	public static MCContainerDef MB_MBBEL0090_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBEL0090", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ins_only_flg", "ins_only_flg"),
				MCItemDef.create("remake_flg", "remake_flg"),
				MCItemDef.create("crud_flg", "crud_flg"),
				MCItemDef.create("err_continue_flg", "err_continue_flg"),
				MCItemDef.create("fmt_typ", "fmt_typ"),
				MCItemDef.create("data_start_row", "data_start_row")
			}
			,
			MCBlockDef.create("Upd01_Ctrl")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0090_Upd02_INFO = new MCOperationInfo("MB", "MBBEL0090", "Upd02", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0090_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0090", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("table_id", "table_id"),
				MCItemDef.create("file_nm", "file_nm"),
				MCItemDef.create("file_dat", "file_dat")
			}
			,
			MCBlockDef.create("Upd02_Dtl")
		);
	}

	public static MCContainerDef MB_MBBEL0090_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBEL0090", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("ins_only_flg", "ins_only_flg"),
				MCItemDef.create("remake_flg", "remake_flg"),
				MCItemDef.create("crud_flg", "crud_flg"),
				MCItemDef.create("err_continue_flg", "err_continue_flg"),
				MCItemDef.create("fmt_typ", "fmt_typ"),
				MCItemDef.create("data_start_row", "data_start_row")
			}
			,
			MCBlockDef.create("Upd02_Ctrl")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0090_Upd03_INFO = new MCOperationInfo("MB", "MBBEL0090", "Upd03", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0090_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0090", "Upd03",
			new MCItemDef[]{
				MCItemDef.create("table_ctg", "table_ctg"),
				MCItemDef.create("table_ctg_seq", "table_ctg_seq"),
				MCItemDef.create("table_id", "table_id"),
				MCItemDef.create("table_seq", "table_seq"),
				MCItemDef.create("file_nm", "file_nm"),
				MCItemDef.create("file_path", "file_path"),
				MCItemDef.create("db_class_path", "db_class_path"),
				MCItemDef.create("chk_ope", "chk_ope"),
				MCItemDef.create("upd_ope", "upd_ope")
			}
			,
			MCBlockDef.create("Upd03_Dtl")
		);
	}

	public static MCContainerDef MB_MBBEL0090_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBEL0090", "Upd03",
			new MCItemDef[]{
				MCItemDef.create("chk_only_flg", "chk_only_flg"),
				MCItemDef.create("ins_only_flg", "ins_only_flg"),
				MCItemDef.create("remake_flg", "remake_flg"),
				MCItemDef.create("crud_flg", "crud_flg"),
				MCItemDef.create("err_continue_flg", "err_continue_flg"),
				MCItemDef.create("dt_fmt", "dt_fmt"),
				MCItemDef.create("ts_fmt", "ts_fmt"),
				MCItemDef.create("data_start_row", "data_start_row")
			}
			,
			MCBlockDef.create("Upd03_Ctrl")
		);
	}


	public static MCContainerDef MB_MBBEL0090_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0090", "Upd03",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("fin_flg", "fin_flg")
			}
			,
			MCBlockDef.create("Upd03_Dtl")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0090_Prnt01_INFO = new MCOperationInfo("MB", "MBBEL0090", "Prnt01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0090_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0090", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("table_id", "table_id"),
				MCItemDef.create("file_nm", "file_nm")
			}
			,
			MCBlockDef.create("Prnt01_Dtl")
		);
	}


	public static MCContainerDef MB_MBBEL0090_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0090", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("table_id", "table_id"),
				MCItemDef.create("file_path", "file_path")
			}
			,
			MCBlockDef.create("Prnt01_Dtl")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0090_Prnt02_INFO = new MCOperationInfo("MB", "MBBEL0090", "Prnt02", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0090_Prnt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0090", "Prnt02",
			new MCItemDef[]{
				MCItemDef.create("table_id", "table_id"),
				MCItemDef.create("file_nm", "file_nm")
			}
			,
			MCBlockDef.create("Prnt02_Dtl")
		);
	}

	public static MCContainerDef MB_MBBEL0090_Prnt02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBEL0090", "Prnt02",
			new MCItemDef[]{
				MCItemDef.create("fmt_typ", "fmt_typ"),
				MCItemDef.create("data_start_row", "data_start_row")
			}
			,
			MCBlockDef.create("Prnt02_Ctrl")
		);
	}


	//FMCB DEF_CLASSES END
}

