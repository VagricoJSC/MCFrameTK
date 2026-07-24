package mcframe.serverMBBE.MBBEL0060;

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
 * [MBBEL_SrchSQLReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBEL0060.Srch01.UP.BLOCK0")){
			return MB_MBBEL0060_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0060.Srch01.DOWN.BLOCK0")){
			return MB_MBBEL0060_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0060.Srch01.DOWN.BLOCK1")){
			return MB_MBBEL0060_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MB.MBBEL0060.Srch01.DOWN.BLOCK2")){
			return MB_MBBEL0060_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MB.MBBEL0060.Srch02.UP.BLOCK0")){
			return MB_MBBEL0060_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0060.Srch02.DOWN.BLOCK0")){
			return MB_MBBEL0060_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0060.Ins01.UP.BLOCK0")){
			return MB_MBBEL0060_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0060.Ins01.UP.BLOCK1")){
			return MB_MBBEL0060_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MB.MBBEL0060.Ins01.DOWN.BLOCK0")){
			return MB_MBBEL0060_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0060.Upd01.UP.BLOCK0")){
			return MB_MBBEL0060_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0060.Upd01.UP.BLOCK1")){
			return MB_MBBEL0060_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MB.MBBEL0060.Upd01.DOWN.BLOCK0")){
			return MB_MBBEL0060_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBEL0060.Del01.UP.BLOCK0")){
			return MB_MBBEL0060_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MB_MBBEL0060_Srch01_INFO = new MCOperationInfo("MB", "MBBEL0060", "Srch01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0060_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("screen_ope", "screen_ope"),
				MCItemDef.create("biz_dat_id", "biz_dat_id")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MB_MBBEL0060_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("biz_dat_id", "biz_dat_id"),
				MCItemDef.create("biz_dat_nm", "biz_dat_nm"),
				MCItemDef.create("module_id", "module_id"),
				MCItemDef.create("logic_id", "logic_id"),
				MCItemDef.create("func_actyp", "func_actyp"),
				MCItemDef.create("biz_dat_rmrks1", "biz_dat_rmrks1"),
				MCItemDef.create("biz_dat_rmrks2", "biz_dat_rmrks2"),
				MCItemDef.create("biz_dat_rmrks3", "biz_dat_rmrks3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("form_file_nm", "form_file_nm"),
				MCItemDef.create("cartridge", "cartridge"),
				MCItemDef.create("cartridge_nm", "cartridge_nm"),
				MCItemDef.create("print_flg", "print_flg"),
				MCItemDef.create("dwnld_flg", "dwnld_flg")
			}
			,
			MCBlockDef.create("Srch01_RsltBase")
		);
	}
	public static MCContainerDef MB_MBBEL0060_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBEL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("sql_src", "sql_src")
			}
			,
			MCBlockDef.create("Srch01_RsltSql")
		);
	}
	public static MCContainerDef MB_MBBEL0060_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MB", "MBBEL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cond_col", "cond_col")
			}
			,
			MCBlockDef.create("Srch01_RsltBind")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0060_Srch02_INFO = new MCOperationInfo("MB", "MBBEL0060", "Srch02", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0060_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0060", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("sql_src", "sql_src")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MB_MBBEL0060_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0060", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("cond_col", "cond_col")
			}
			,
			MCBlockDef.create("Srch02_RsltBind")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0060_Ins01_INFO = new MCOperationInfo("MB", "MBBEL0060", "Ins01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0060_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0060", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("biz_dat_id", "biz_dat_id"),
				MCItemDef.create("biz_dat_nm", "biz_dat_nm"),
				MCItemDef.create("module_id", "module_id"),
				MCItemDef.create("logic_id", "logic_id"),
				MCItemDef.create("func_actyp", "func_actyp"),
				MCItemDef.create("biz_dat_rmrks1", "biz_dat_rmrks1"),
				MCItemDef.create("biz_dat_rmrks2", "biz_dat_rmrks2"),
				MCItemDef.create("biz_dat_rmrks3", "biz_dat_rmrks3"),
				MCItemDef.create("form_file_nm", "form_file_nm"),
				MCItemDef.create("cartridge", "cartridge"),
				MCItemDef.create("print_flg", "print_flg"),
				MCItemDef.create("dwnld_flg", "dwnld_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_Base")
		);
	}

	public static MCContainerDef MB_MBBEL0060_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBEL0060", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("sql_src", "sql_src")
			}
			,
			MCBlockDef.create("Ins01_Sql")
		);
	}


	public static MCContainerDef MB_MBBEL0060_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0060", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("cond_col", "cond_col")
			}
			,
			MCBlockDef.create("Ins01_RsltBind")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0060_Upd01_INFO = new MCOperationInfo("MB", "MBBEL0060", "Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0060_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("biz_dat_id", "biz_dat_id"),
				MCItemDef.create("biz_dat_nm", "biz_dat_nm"),
				MCItemDef.create("module_id", "module_id"),
				MCItemDef.create("logic_id", "logic_id"),
				MCItemDef.create("func_actyp", "func_actyp"),
				MCItemDef.create("biz_dat_rmrks1", "biz_dat_rmrks1"),
				MCItemDef.create("biz_dat_rmrks2", "biz_dat_rmrks2"),
				MCItemDef.create("biz_dat_rmrks3", "biz_dat_rmrks3"),
				MCItemDef.create("form_file_nm", "form_file_nm"),
				MCItemDef.create("cartridge", "cartridge"),
				MCItemDef.create("print_flg", "print_flg"),
				MCItemDef.create("dwnld_flg", "dwnld_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Base")
		);
	}

	public static MCContainerDef MB_MBBEL0060_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBEL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sql_src", "sql_src")
			}
			,
			MCBlockDef.create("Upd01_Sql")
		);
	}


	public static MCContainerDef MB_MBBEL0060_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cond_col", "cond_col")
			}
			,
			MCBlockDef.create("Upd01_RsltBind")
		);
	}
	
	static final MCOperationInfo MB_MBBEL0060_Del01_INFO = new MCOperationInfo("MB", "MBBEL0060", "Del01", "000000", new PDef());

	public static MCContainerDef MB_MBBEL0060_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBEL0060", "Del01",
			new MCItemDef[]{
				MCItemDef.create("biz_dat_id", "biz_dat_id"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Base")
		);
	}


	//FMCB DEF_CLASSES END
}

