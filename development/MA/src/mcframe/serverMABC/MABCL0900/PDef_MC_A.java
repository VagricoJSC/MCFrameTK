package mcframe.serverMABC.MABCL0900;

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
 * [MABCL_GpReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0900.Gp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0900_Gp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0900.Gp_Upd01.UP.BLOCK0")){
			return MA_MABCL0900_Gp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0900.GpLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0900_GpLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0900.GpLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0900_GpLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0900.Gp_DelChk01.UP.BLOCK0")){
			return MA_MABCL0900_Gp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0900.Gp_Del01.UP.BLOCK0")){
			return MA_MABCL0900_Gp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0900.Srch01.UP.BLOCK0")){
			return MA_MABCL0900_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0900.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0900_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0900.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0900_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0900.Upd01.UP.BLOCK0")){
			return MA_MABCL0900_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0900.Upd01.UP.BLOCK1")){
			return MA_MABCL0900_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0900.Del01.UP.BLOCK0")){
			return MA_MABCL0900_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MA_MABCL0900_Gp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0900", "Gp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0900_Gp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0900", "Gp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("gp_grp_cd", "gp_grp_cd"),
				MCItemDef.create("key1", "key1"),
				MCItemDef.create("key2", "key2"),
				MCItemDef.create("key3", "key3"),
				MCItemDef.create("key4", "key4"),
				MCItemDef.create("key5", "key5"),
				MCItemDef.create("key6", "key6"),
				MCItemDef.create("key7", "key7"),
				MCItemDef.create("key8", "key8"),
				MCItemDef.create("key9", "key9"),
				MCItemDef.create("key10", "key10"),
				MCItemDef.create("char1", "char1"),
				MCItemDef.create("char2", "char2"),
				MCItemDef.create("char3", "char3"),
				MCItemDef.create("char4", "char4"),
				MCItemDef.create("char5", "char5"),
				MCItemDef.create("char6", "char6"),
				MCItemDef.create("char7", "char7"),
				MCItemDef.create("char8", "char8"),
				MCItemDef.create("char9", "char9"),
				MCItemDef.create("char10", "char10"),
				MCItemDef.create("char11", "char11"),
				MCItemDef.create("char12", "char12"),
				MCItemDef.create("char13", "char13"),
				MCItemDef.create("char14", "char14"),
				MCItemDef.create("char15", "char15"),
				MCItemDef.create("char16", "char16"),
				MCItemDef.create("char17", "char17"),
				MCItemDef.create("char18", "char18"),
				MCItemDef.create("char19", "char19"),
				MCItemDef.create("char20", "char20"),
				MCItemDef.create("num1", "num1"),
				MCItemDef.create("num2", "num2"),
				MCItemDef.create("num3", "num3"),
				MCItemDef.create("num4", "num4"),
				MCItemDef.create("num5", "num5"),
				MCItemDef.create("num6", "num6"),
				MCItemDef.create("num7", "num7"),
				MCItemDef.create("num8", "num8"),
				MCItemDef.create("num9", "num9"),
				MCItemDef.create("num10", "num10"),
				MCItemDef.create("dt1", "dt1"),
				MCItemDef.create("dt2", "dt2"),
				MCItemDef.create("dt3", "dt3"),
				MCItemDef.create("dt4", "dt4"),
				MCItemDef.create("dt5", "dt5"),
				MCItemDef.create("dt6", "dt6"),
				MCItemDef.create("dt7", "dt7"),
				MCItemDef.create("dt8", "dt8"),
				MCItemDef.create("dt9", "dt9"),
				MCItemDef.create("dt10", "dt10"),
				MCItemDef.create("flg1", "flg1"),
				MCItemDef.create("flg2", "flg2"),
				MCItemDef.create("flg3", "flg3"),
				MCItemDef.create("flg4", "flg4"),
				MCItemDef.create("flg5", "flg5"),
				MCItemDef.create("flg6", "flg6"),
				MCItemDef.create("flg7", "flg7"),
				MCItemDef.create("flg8", "flg8"),
				MCItemDef.create("flg9", "flg9"),
				MCItemDef.create("flg10", "flg10"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Gp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0900_Gp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0900", "Gp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0900_Gp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0900", "Gp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("gp_grp_cd", "gp_grp_cd"),
				MCItemDef.create("key1", "key1"),
				MCItemDef.create("key2", "key2"),
				MCItemDef.create("key3", "key3"),
				MCItemDef.create("key4", "key4"),
				MCItemDef.create("key5", "key5"),
				MCItemDef.create("key6", "key6"),
				MCItemDef.create("key7", "key7"),
				MCItemDef.create("key8", "key8"),
				MCItemDef.create("key9", "key9"),
				MCItemDef.create("key10", "key10"),
				MCItemDef.create("char1", "char1"),
				MCItemDef.create("char2", "char2"),
				MCItemDef.create("char3", "char3"),
				MCItemDef.create("char4", "char4"),
				MCItemDef.create("char5", "char5"),
				MCItemDef.create("char6", "char6"),
				MCItemDef.create("char7", "char7"),
				MCItemDef.create("char8", "char8"),
				MCItemDef.create("char9", "char9"),
				MCItemDef.create("char10", "char10"),
				MCItemDef.create("char11", "char11"),
				MCItemDef.create("char12", "char12"),
				MCItemDef.create("char13", "char13"),
				MCItemDef.create("char14", "char14"),
				MCItemDef.create("char15", "char15"),
				MCItemDef.create("char16", "char16"),
				MCItemDef.create("char17", "char17"),
				MCItemDef.create("char18", "char18"),
				MCItemDef.create("char19", "char19"),
				MCItemDef.create("char20", "char20"),
				MCItemDef.create("num1", "num1"),
				MCItemDef.create("num2", "num2"),
				MCItemDef.create("num3", "num3"),
				MCItemDef.create("num4", "num4"),
				MCItemDef.create("num5", "num5"),
				MCItemDef.create("num6", "num6"),
				MCItemDef.create("num7", "num7"),
				MCItemDef.create("num8", "num8"),
				MCItemDef.create("num9", "num9"),
				MCItemDef.create("num10", "num10"),
				MCItemDef.create("dt1", "dt1"),
				MCItemDef.create("dt2", "dt2"),
				MCItemDef.create("dt3", "dt3"),
				MCItemDef.create("dt4", "dt4"),
				MCItemDef.create("dt5", "dt5"),
				MCItemDef.create("dt6", "dt6"),
				MCItemDef.create("dt7", "dt7"),
				MCItemDef.create("dt8", "dt8"),
				MCItemDef.create("dt9", "dt9"),
				MCItemDef.create("dt10", "dt10"),
				MCItemDef.create("flg1", "flg1"),
				MCItemDef.create("flg2", "flg2"),
				MCItemDef.create("flg3", "flg3"),
				MCItemDef.create("flg4", "flg4"),
				MCItemDef.create("flg5", "flg5"),
				MCItemDef.create("flg6", "flg6"),
				MCItemDef.create("flg7", "flg7"),
				MCItemDef.create("flg8", "flg8"),
				MCItemDef.create("flg9", "flg9"),
				MCItemDef.create("flg10", "flg10"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Gp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0900_GpLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0900", "GpLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0900_GpLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0900", "GpLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("gp_grp_cd", "gp_grp_cd"),
				MCItemDef.create("key1", "key1"),
				MCItemDef.create("key2", "key2"),
				MCItemDef.create("key3", "key3"),
				MCItemDef.create("key4", "key4"),
				MCItemDef.create("key5", "key5"),
				MCItemDef.create("key6", "key6"),
				MCItemDef.create("key7", "key7"),
				MCItemDef.create("key8", "key8"),
				MCItemDef.create("key9", "key9"),
				MCItemDef.create("key10", "key10"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("char1", "char1"),
				MCItemDef.create("char2", "char2"),
				MCItemDef.create("char3", "char3"),
				MCItemDef.create("char4", "char4"),
				MCItemDef.create("char5", "char5"),
				MCItemDef.create("char6", "char6"),
				MCItemDef.create("char7", "char7"),
				MCItemDef.create("char8", "char8"),
				MCItemDef.create("char9", "char9"),
				MCItemDef.create("char10", "char10"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("GpLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0900_GpLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0900", "GpLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0900_GpLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0900", "GpLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("gp_grp_cd", "gp_grp_cd"),
				MCItemDef.create("key1", "key1"),
				MCItemDef.create("key2", "key2"),
				MCItemDef.create("key3", "key3"),
				MCItemDef.create("key4", "key4"),
				MCItemDef.create("key5", "key5"),
				MCItemDef.create("key6", "key6"),
				MCItemDef.create("key7", "key7"),
				MCItemDef.create("key8", "key8"),
				MCItemDef.create("key9", "key9"),
				MCItemDef.create("key10", "key10"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("char1", "char1"),
				MCItemDef.create("char2", "char2"),
				MCItemDef.create("char3", "char3"),
				MCItemDef.create("char4", "char4"),
				MCItemDef.create("char5", "char5"),
				MCItemDef.create("char6", "char6"),
				MCItemDef.create("char7", "char7"),
				MCItemDef.create("char8", "char8"),
				MCItemDef.create("char9", "char9"),
				MCItemDef.create("char10", "char10"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("GpLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0900_Gp_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0900", "Gp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0900_Gp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0900", "Gp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("gp_grp_cd", "gp_grp_cd"),
				MCItemDef.create("key1", "key1"),
				MCItemDef.create("key2", "key2"),
				MCItemDef.create("key3", "key3"),
				MCItemDef.create("key4", "key4"),
				MCItemDef.create("key5", "key5"),
				MCItemDef.create("key6", "key6"),
				MCItemDef.create("key7", "key7"),
				MCItemDef.create("key8", "key8"),
				MCItemDef.create("key9", "key9"),
				MCItemDef.create("key10", "key10"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Gp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0900_Gp_Del01_INFO = new MCOperationInfo("MA", "MABCL0900", "Gp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0900_Gp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0900", "Gp_Del01",
			new MCItemDef[]{
				MCItemDef.create("gp_grp_cd", "gp_grp_cd"),
				MCItemDef.create("key1", "key1"),
				MCItemDef.create("key2", "key2"),
				MCItemDef.create("key3", "key3"),
				MCItemDef.create("key4", "key4"),
				MCItemDef.create("key5", "key5"),
				MCItemDef.create("key6", "key6"),
				MCItemDef.create("key7", "key7"),
				MCItemDef.create("key8", "key8"),
				MCItemDef.create("key9", "key9"),
				MCItemDef.create("key10", "key10"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Gp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0900_Srch01_INFO = new MCOperationInfo("MA", "MABCL0900", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0900_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0900", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("gp_grp_cd", "gp_grp_cd"),
				MCItemDef.create("key1", "key1"),
				MCItemDef.create("key2", "key2"),
				MCItemDef.create("key3", "key3"),
				MCItemDef.create("key4", "key4"),
				MCItemDef.create("key5", "key5"),
				MCItemDef.create("key6", "key6"),
				MCItemDef.create("key7", "key7"),
				MCItemDef.create("key8", "key8"),
				MCItemDef.create("key9", "key9"),
				MCItemDef.create("key10", "key10"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0900_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0900", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("gp_grp_cd", "gp_grp_cd"),
				MCItemDef.create("key1", "key1"),
				MCItemDef.create("key2", "key2"),
				MCItemDef.create("key3", "key3"),
				MCItemDef.create("key4", "key4"),
				MCItemDef.create("key5", "key5"),
				MCItemDef.create("key6", "key6"),
				MCItemDef.create("key7", "key7"),
				MCItemDef.create("key8", "key8"),
				MCItemDef.create("key9", "key9"),
				MCItemDef.create("key10", "key10"),
				MCItemDef.create("char1", "char1"),
				MCItemDef.create("char2", "char2"),
				MCItemDef.create("char3", "char3"),
				MCItemDef.create("char4", "char4"),
				MCItemDef.create("char5", "char5"),
				MCItemDef.create("char6", "char6"),
				MCItemDef.create("char7", "char7"),
				MCItemDef.create("char8", "char8"),
				MCItemDef.create("char9", "char9"),
				MCItemDef.create("char10", "char10"),
				MCItemDef.create("char11", "char11"),
				MCItemDef.create("char12", "char12"),
				MCItemDef.create("char13", "char13"),
				MCItemDef.create("char14", "char14"),
				MCItemDef.create("char15", "char15"),
				MCItemDef.create("char16", "char16"),
				MCItemDef.create("char17", "char17"),
				MCItemDef.create("char18", "char18"),
				MCItemDef.create("char19", "char19"),
				MCItemDef.create("char20", "char20"),
				MCItemDef.create("num1", "num1"),
				MCItemDef.create("num2", "num2"),
				MCItemDef.create("num3", "num3"),
				MCItemDef.create("num4", "num4"),
				MCItemDef.create("num5", "num5"),
				MCItemDef.create("num6", "num6"),
				MCItemDef.create("num7", "num7"),
				MCItemDef.create("num8", "num8"),
				MCItemDef.create("num9", "num9"),
				MCItemDef.create("num10", "num10"),
				MCItemDef.create("dt1", "dt1"),
				MCItemDef.create("dt2", "dt2"),
				MCItemDef.create("dt3", "dt3"),
				MCItemDef.create("dt4", "dt4"),
				MCItemDef.create("dt5", "dt5"),
				MCItemDef.create("dt6", "dt6"),
				MCItemDef.create("dt7", "dt7"),
				MCItemDef.create("dt8", "dt8"),
				MCItemDef.create("dt9", "dt9"),
				MCItemDef.create("dt10", "dt10"),
				MCItemDef.create("flg1", "flg1"),
				MCItemDef.create("flg2", "flg2"),
				MCItemDef.create("flg3", "flg3"),
				MCItemDef.create("flg4", "flg4"),
				MCItemDef.create("flg5", "flg5"),
				MCItemDef.create("flg6", "flg6"),
				MCItemDef.create("flg7", "flg7"),
				MCItemDef.create("flg8", "flg8"),
				MCItemDef.create("flg9", "flg9"),
				MCItemDef.create("flg10", "flg10"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
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
	public static MCContainerDef MA_MABCL0900_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0900", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("gp_grp_cd", "gp_grp_cd"),
				MCItemDef.create("key1", "key1"),
				MCItemDef.create("key2", "key2"),
				MCItemDef.create("key3", "key3"),
				MCItemDef.create("key4", "key4"),
				MCItemDef.create("key5", "key5"),
				MCItemDef.create("key6", "key6"),
				MCItemDef.create("key7", "key7"),
				MCItemDef.create("key8", "key8"),
				MCItemDef.create("key9", "key9"),
				MCItemDef.create("key10", "key10"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("char1", "char1"),
				MCItemDef.create("char2", "char2"),
				MCItemDef.create("char3", "char3"),
				MCItemDef.create("char4", "char4"),
				MCItemDef.create("char5", "char5"),
				MCItemDef.create("char6", "char6"),
				MCItemDef.create("char7", "char7"),
				MCItemDef.create("char8", "char8"),
				MCItemDef.create("char9", "char9"),
				MCItemDef.create("char10", "char10"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
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
	
	static final MCOperationInfo MA_MABCL0900_Upd01_INFO = new MCOperationInfo("MA", "MABCL0900", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0900_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0900", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("gp_grp_cd", "gp_grp_cd"),
				MCItemDef.create("key1", "key1"),
				MCItemDef.create("key2", "key2"),
				MCItemDef.create("key3", "key3"),
				MCItemDef.create("key4", "key4"),
				MCItemDef.create("key5", "key5"),
				MCItemDef.create("key6", "key6"),
				MCItemDef.create("key7", "key7"),
				MCItemDef.create("key8", "key8"),
				MCItemDef.create("key9", "key9"),
				MCItemDef.create("key10", "key10"),
				MCItemDef.create("char1", "char1"),
				MCItemDef.create("char2", "char2"),
				MCItemDef.create("char3", "char3"),
				MCItemDef.create("char4", "char4"),
				MCItemDef.create("char5", "char5"),
				MCItemDef.create("char6", "char6"),
				MCItemDef.create("char7", "char7"),
				MCItemDef.create("char8", "char8"),
				MCItemDef.create("char9", "char9"),
				MCItemDef.create("char10", "char10"),
				MCItemDef.create("char11", "char11"),
				MCItemDef.create("char12", "char12"),
				MCItemDef.create("char13", "char13"),
				MCItemDef.create("char14", "char14"),
				MCItemDef.create("char15", "char15"),
				MCItemDef.create("char16", "char16"),
				MCItemDef.create("char17", "char17"),
				MCItemDef.create("char18", "char18"),
				MCItemDef.create("char19", "char19"),
				MCItemDef.create("char20", "char20"),
				MCItemDef.create("num1", "num1"),
				MCItemDef.create("num2", "num2"),
				MCItemDef.create("num3", "num3"),
				MCItemDef.create("num4", "num4"),
				MCItemDef.create("num5", "num5"),
				MCItemDef.create("num6", "num6"),
				MCItemDef.create("num7", "num7"),
				MCItemDef.create("num8", "num8"),
				MCItemDef.create("num9", "num9"),
				MCItemDef.create("num10", "num10"),
				MCItemDef.create("dt1", "dt1"),
				MCItemDef.create("dt2", "dt2"),
				MCItemDef.create("dt3", "dt3"),
				MCItemDef.create("dt4", "dt4"),
				MCItemDef.create("dt5", "dt5"),
				MCItemDef.create("dt6", "dt6"),
				MCItemDef.create("dt7", "dt7"),
				MCItemDef.create("dt8", "dt8"),
				MCItemDef.create("dt9", "dt9"),
				MCItemDef.create("dt10", "dt10"),
				MCItemDef.create("flg1", "flg1"),
				MCItemDef.create("flg2", "flg2"),
				MCItemDef.create("flg3", "flg3"),
				MCItemDef.create("flg4", "flg4"),
				MCItemDef.create("flg5", "flg5"),
				MCItemDef.create("flg6", "flg6"),
				MCItemDef.create("flg7", "flg7"),
				MCItemDef.create("flg8", "flg8"),
				MCItemDef.create("flg9", "flg9"),
				MCItemDef.create("flg10", "flg10"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}

	public static MCContainerDef MA_MABCL0900_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0900", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("gp_grp_cd", "gp_grp_cd"),
				MCItemDef.create("key1", "key1"),
				MCItemDef.create("key2", "key2"),
				MCItemDef.create("key3", "key3"),
				MCItemDef.create("key4", "key4"),
				MCItemDef.create("key5", "key5"),
				MCItemDef.create("key6", "key6"),
				MCItemDef.create("key7", "key7"),
				MCItemDef.create("key8", "key8"),
				MCItemDef.create("key9", "key9"),
				MCItemDef.create("key10", "key10"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("char1", "char1"),
				MCItemDef.create("char2", "char2"),
				MCItemDef.create("char3", "char3"),
				MCItemDef.create("char4", "char4"),
				MCItemDef.create("char5", "char5"),
				MCItemDef.create("char6", "char6"),
				MCItemDef.create("char7", "char7"),
				MCItemDef.create("char8", "char8"),
				MCItemDef.create("char9", "char9"),
				MCItemDef.create("char10", "char10"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl2")
		);
	}
	
	static final MCOperationInfo MA_MABCL0900_Del01_INFO = new MCOperationInfo("MA", "MABCL0900", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0900_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0900", "Del01",
			new MCItemDef[]{
				MCItemDef.create("gp_grp_cd", "gp_grp_cd"),
				MCItemDef.create("key1", "key1"),
				MCItemDef.create("key2", "key2"),
				MCItemDef.create("key3", "key3"),
				MCItemDef.create("key4", "key4"),
				MCItemDef.create("key5", "key5"),
				MCItemDef.create("key6", "key6"),
				MCItemDef.create("key7", "key7"),
				MCItemDef.create("key8", "key8"),
				MCItemDef.create("key9", "key9"),
				MCItemDef.create("key10", "key10"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

