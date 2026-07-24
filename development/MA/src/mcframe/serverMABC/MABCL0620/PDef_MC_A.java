package mcframe.serverMABC.MABCL0620;

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
 * [MABCL_DestReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0620.Bp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0620_Bp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0620.Bp_Upd01.UP.BLOCK0")){
			return MA_MABCL0620_Bp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0620.BpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0620_BpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0620.BpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0620_BpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0620.Bp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0620_Bp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0620.Bp_Del01.UP.BLOCK0")){
			return MA_MABCL0620_Bp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0620.Srch01.UP.BLOCK0")){
			return MA_MABCL0620_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0620.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0620_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0620.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0620_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0620.Upd01.UP.BLOCK0")){
			return MA_MABCL0620_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0620.Upd01.UP.BLOCK1")){
			return MA_MABCL0620_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0620.Del01.UP.BLOCK0")){
			return MA_MABCL0620_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MA_MABCL0620_Bp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0620", "Bp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0620_Bp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0620", "Bp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bp_alt_nm1", "bp_alt_nm1"),
				MCItemDef.create("bp_alt_nm2", "bp_alt_nm2"),
				MCItemDef.create("bp_alt_nm3", "bp_alt_nm3"),
				MCItemDef.create("bp_alt_nm4", "bp_alt_nm4"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("ein", "ein"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("dest_flg", "dest_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20")
			}
			,
			MCBlockDef.create("Bp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0620_Bp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0620", "Bp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0620_Bp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0620", "Bp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bp_alt_nm1", "bp_alt_nm1"),
				MCItemDef.create("bp_alt_nm2", "bp_alt_nm2"),
				MCItemDef.create("bp_alt_nm3", "bp_alt_nm3"),
				MCItemDef.create("bp_alt_nm4", "bp_alt_nm4"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("ein", "ein"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("dest_flg", "dest_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20")
			}
			,
			MCBlockDef.create("Bp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0620_BpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0620", "BpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0620_BpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0620", "BpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bp_alt_nm1", "bp_alt_nm1"),
				MCItemDef.create("bp_alt_nm2", "bp_alt_nm2"),
				MCItemDef.create("bp_alt_nm3", "bp_alt_nm3"),
				MCItemDef.create("bp_alt_nm4", "bp_alt_nm4"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20")
			}
			,
			MCBlockDef.create("BpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0620_BpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0620", "BpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0620_BpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0620", "BpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bp_alt_nm1", "bp_alt_nm1"),
				MCItemDef.create("bp_alt_nm2", "bp_alt_nm2"),
				MCItemDef.create("bp_alt_nm3", "bp_alt_nm3"),
				MCItemDef.create("bp_alt_nm4", "bp_alt_nm4"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20")
			}
			,
			MCBlockDef.create("BpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0620_Bp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0620", "Bp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0620_Bp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0620", "Bp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Bp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0620_Bp_Del01_INFO = new MCOperationInfo("MA", "MABCL0620", "Bp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0620_Bp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0620", "Bp_Del01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Bp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0620_Srch01_INFO = new MCOperationInfo("MA", "MABCL0620", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0620_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0620", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm_lcl", "bp_nm_lcl"),
				MCItemDef.create("ein", "ein"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("cntry_nm", "cntry_nm"),
				MCItemDef.create("foreign_flg", "foreign_flg"),
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("area_nm", "area_nm"),
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_nm10", "bp_grp_nm10"),
				MCItemDef.create("bp_alt_nm1", "bp_alt_nm1"),
				MCItemDef.create("bp_alt_nm2", "bp_alt_nm2"),
				MCItemDef.create("bp_alt_nm3", "bp_alt_nm3"),
				MCItemDef.create("bp_alt_nm4", "bp_alt_nm4"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0620_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0620", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm_lcl", "bp_nm_lcl"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bp_alt_nm1", "bp_alt_nm1"),
				MCItemDef.create("bp_alt_nm2", "bp_alt_nm2"),
				MCItemDef.create("bp_alt_nm3", "bp_alt_nm3"),
				MCItemDef.create("bp_alt_nm4", "bp_alt_nm4"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("ein", "ein"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("cntry_nm", "cntry_nm"),
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("area_nm", "area_nm"),
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_nm10", "bp_grp_nm10"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	public static MCContainerDef MA_MABCL0620_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0620", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bp_alt_nm1", "bp_alt_nm1"),
				MCItemDef.create("bp_alt_nm2", "bp_alt_nm2"),
				MCItemDef.create("bp_alt_nm3", "bp_alt_nm3"),
				MCItemDef.create("bp_alt_nm4", "bp_alt_nm4"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt2")
		);
	}
	
	static final MCOperationInfo MA_MABCL0620_Upd01_INFO = new MCOperationInfo("MA", "MABCL0620", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0620_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0620", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bp_alt_nm1", "bp_alt_nm1"),
				MCItemDef.create("bp_alt_nm2", "bp_alt_nm2"),
				MCItemDef.create("bp_alt_nm3", "bp_alt_nm3"),
				MCItemDef.create("bp_alt_nm4", "bp_alt_nm4"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("ein", "ein"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("area_cd", "area_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("dest_flg", "dest_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}

	public static MCContainerDef MA_MABCL0620_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0620", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bp_alt_nm1", "bp_alt_nm1"),
				MCItemDef.create("bp_alt_nm2", "bp_alt_nm2"),
				MCItemDef.create("bp_alt_nm3", "bp_alt_nm3"),
				MCItemDef.create("bp_alt_nm4", "bp_alt_nm4"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("memo4", "memo4"),
				MCItemDef.create("memo5", "memo5"),
				MCItemDef.create("memo6", "memo6"),
				MCItemDef.create("memo7", "memo7"),
				MCItemDef.create("memo8", "memo8"),
				MCItemDef.create("memo9", "memo9"),
				MCItemDef.create("memo10", "memo10"),
				MCItemDef.create("memo11", "memo11"),
				MCItemDef.create("memo12", "memo12"),
				MCItemDef.create("memo13", "memo13"),
				MCItemDef.create("memo14", "memo14"),
				MCItemDef.create("memo15", "memo15"),
				MCItemDef.create("memo16", "memo16"),
				MCItemDef.create("memo17", "memo17"),
				MCItemDef.create("memo18", "memo18"),
				MCItemDef.create("memo19", "memo19"),
				MCItemDef.create("memo20", "memo20")
			}
			,
			MCBlockDef.create("Upd01_Dtl2")
		);
	}
	
	static final MCOperationInfo MA_MABCL0620_Del01_INFO = new MCOperationInfo("MA", "MABCL0620", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0620_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0620", "Del01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

