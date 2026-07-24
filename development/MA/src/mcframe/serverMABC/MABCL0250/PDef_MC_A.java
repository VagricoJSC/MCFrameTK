package mcframe.serverMABC.MABCL0250;

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
 * [MABCL_UsrAclReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0250.UsrAcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0250_UsrAcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0250.UsrAcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0250_UsrAcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0250.UsrAcl_DelChk01.UP.BLOCK0")){
			return MA_MABCL0250_UsrAcl_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0250.UsrAcl_Del01.UP.BLOCK0")){
			return MA_MABCL0250_UsrAcl_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0250.Srch01.UP.BLOCK0")){
			return MA_MABCL0250_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0250.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0250_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0250.Srch02.UP.BLOCK0")){
			return MA_MABCL0250_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0250.Srch02.DOWN.BLOCK0")){
			return MA_MABCL0250_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0250.Srch03.UP.BLOCK0")){
			return MA_MABCL0250_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0250.Srch03.DOWN.BLOCK0")){
			return MA_MABCL0250_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0250.Sprt01.UP.BLOCK0")){
			return MA_MABCL0250_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0250.Sprt01.DOWN.BLOCK0")){
			return MA_MABCL0250_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0250.Upd01.UP.BLOCK0")){
			return MA_MABCL0250_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0250.Del01.UP.BLOCK0")){
			return MA_MABCL0250_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
										
	
	static final MCOperationInfo MA_MABCL0250_UsrAcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0250", "UsrAcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0250_UsrAcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "UsrAcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("da_cd", "da_cd"),
				MCItemDef.create("pre_cl_usr_flg", "pre_cl_usr_flg"),
				MCItemDef.create("cl_usr_flg", "cl_usr_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("add_dpt_cd1", "add_dpt_cd1"),
				MCItemDef.create("add_dpt_cd2", "add_dpt_cd2"),
				MCItemDef.create("add_dpt_cd3", "add_dpt_cd3"),
				MCItemDef.create("add_dpt_cd4", "add_dpt_cd4"),
				MCItemDef.create("add_dpt_cd5", "add_dpt_cd5"),
				MCItemDef.create("add_dpt_cd6", "add_dpt_cd6"),
				MCItemDef.create("add_dpt_cd7", "add_dpt_cd7"),
				MCItemDef.create("add_dpt_cd8", "add_dpt_cd8"),
				MCItemDef.create("add_dpt_cd9", "add_dpt_cd9"),
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("aprv_role_cd1", "aprv_role_cd1"),
				MCItemDef.create("aprv_role_cd2", "aprv_role_cd2"),
				MCItemDef.create("aprv_role_cd3", "aprv_role_cd3"),
				MCItemDef.create("aprv_role_cd4", "aprv_role_cd4"),
				MCItemDef.create("aprv_role_cd5", "aprv_role_cd5"),
				MCItemDef.create("aprv_role_cd6", "aprv_role_cd6"),
				MCItemDef.create("aprv_role_cd7", "aprv_role_cd7"),
				MCItemDef.create("aprv_role_cd8", "aprv_role_cd8"),
				MCItemDef.create("aprv_role_cd9", "aprv_role_cd9"),
				MCItemDef.create("sub_aprv_role_cd", "sub_aprv_role_cd"),
				MCItemDef.create("sub_aprv_role_cd1", "sub_aprv_role_cd1"),
				MCItemDef.create("sub_aprv_role_cd2", "sub_aprv_role_cd2"),
				MCItemDef.create("sub_aprv_role_cd3", "sub_aprv_role_cd3"),
				MCItemDef.create("sub_aprv_role_cd4", "sub_aprv_role_cd4"),
				MCItemDef.create("sub_aprv_role_cd5", "sub_aprv_role_cd5"),
				MCItemDef.create("sub_aprv_role_cd6", "sub_aprv_role_cd6"),
				MCItemDef.create("sub_aprv_role_cd7", "sub_aprv_role_cd7"),
				MCItemDef.create("sub_aprv_role_cd8", "sub_aprv_role_cd8"),
				MCItemDef.create("sub_aprv_role_cd9", "sub_aprv_role_cd9"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("UsrAcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0250_UsrAcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0250", "UsrAcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0250_UsrAcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "UsrAcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("da_cd", "da_cd"),
				MCItemDef.create("pre_cl_usr_flg", "pre_cl_usr_flg"),
				MCItemDef.create("cl_usr_flg", "cl_usr_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("add_dpt_cd1", "add_dpt_cd1"),
				MCItemDef.create("add_dpt_cd2", "add_dpt_cd2"),
				MCItemDef.create("add_dpt_cd3", "add_dpt_cd3"),
				MCItemDef.create("add_dpt_cd4", "add_dpt_cd4"),
				MCItemDef.create("add_dpt_cd5", "add_dpt_cd5"),
				MCItemDef.create("add_dpt_cd6", "add_dpt_cd6"),
				MCItemDef.create("add_dpt_cd7", "add_dpt_cd7"),
				MCItemDef.create("add_dpt_cd8", "add_dpt_cd8"),
				MCItemDef.create("add_dpt_cd9", "add_dpt_cd9"),
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("aprv_role_cd1", "aprv_role_cd1"),
				MCItemDef.create("aprv_role_cd2", "aprv_role_cd2"),
				MCItemDef.create("aprv_role_cd3", "aprv_role_cd3"),
				MCItemDef.create("aprv_role_cd4", "aprv_role_cd4"),
				MCItemDef.create("aprv_role_cd5", "aprv_role_cd5"),
				MCItemDef.create("aprv_role_cd6", "aprv_role_cd6"),
				MCItemDef.create("aprv_role_cd7", "aprv_role_cd7"),
				MCItemDef.create("aprv_role_cd8", "aprv_role_cd8"),
				MCItemDef.create("aprv_role_cd9", "aprv_role_cd9"),
				MCItemDef.create("sub_aprv_role_cd", "sub_aprv_role_cd"),
				MCItemDef.create("sub_aprv_role_cd1", "sub_aprv_role_cd1"),
				MCItemDef.create("sub_aprv_role_cd2", "sub_aprv_role_cd2"),
				MCItemDef.create("sub_aprv_role_cd3", "sub_aprv_role_cd3"),
				MCItemDef.create("sub_aprv_role_cd4", "sub_aprv_role_cd4"),
				MCItemDef.create("sub_aprv_role_cd5", "sub_aprv_role_cd5"),
				MCItemDef.create("sub_aprv_role_cd6", "sub_aprv_role_cd6"),
				MCItemDef.create("sub_aprv_role_cd7", "sub_aprv_role_cd7"),
				MCItemDef.create("sub_aprv_role_cd8", "sub_aprv_role_cd8"),
				MCItemDef.create("sub_aprv_role_cd9", "sub_aprv_role_cd9"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("UsrAcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0250_UsrAcl_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0250", "UsrAcl_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0250_UsrAcl_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "UsrAcl_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("UsrAcl_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0250_UsrAcl_Del01_INFO = new MCOperationInfo("MA", "MABCL0250", "UsrAcl_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0250_UsrAcl_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "UsrAcl_Del01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("UsrAcl_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0250_Srch01_INFO = new MCOperationInfo("MA", "MABCL0250", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0250_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("usr_dpt_cd", "usr_dpt_cd"),
				MCItemDef.create("usr_dpt_nm", "usr_dpt_nm"),
				MCItemDef.create("da_cd", "da_cd"),
				MCItemDef.create("da_nm", "da_nm"),
				MCItemDef.create("usr_aprv_role_cd", "usr_aprv_role_cd"),
				MCItemDef.create("usr_aprv_role_nm", "usr_aprv_role_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("usr_alt_nm1", "usr_alt_nm1"),
				MCItemDef.create("usr_alt_nm2", "usr_alt_nm2"),
				MCItemDef.create("usr_alt_nm3", "usr_alt_nm3"),
				MCItemDef.create("usr_alt_nm4", "usr_alt_nm4"),
				MCItemDef.create("usr_com_typ", "usr_com_typ"),
				MCItemDef.create("usr_com", "usr_com"),
				MCItemDef.create("usr_info1", "usr_info1"),
				MCItemDef.create("usr_info2", "usr_info2"),
				MCItemDef.create("usr_info3", "usr_info3"),
				MCItemDef.create("usr_info4", "usr_info4"),
				MCItemDef.create("usr_info5", "usr_info5"),
				MCItemDef.create("usr_info6", "usr_info6"),
				MCItemDef.create("usr_info7", "usr_info7"),
				MCItemDef.create("usr_info8", "usr_info8"),
				MCItemDef.create("usr_info9", "usr_info9"),
				MCItemDef.create("usr_info10", "usr_info10"),
				MCItemDef.create("usr_info11", "usr_info11"),
				MCItemDef.create("usr_info12", "usr_info12"),
				MCItemDef.create("usr_info13", "usr_info13"),
				MCItemDef.create("usr_info14", "usr_info14"),
				MCItemDef.create("usr_info15", "usr_info15"),
				MCItemDef.create("usr_info16", "usr_info16"),
				MCItemDef.create("usr_info17", "usr_info17"),
				MCItemDef.create("usr_info18", "usr_info18"),
				MCItemDef.create("usr_info19", "usr_info19"),
				MCItemDef.create("usr_info20", "usr_info20"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0250_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("license_flg", "license_flg"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("da_cd", "da_cd"),
				MCItemDef.create("da_nm", "da_nm"),
				MCItemDef.create("pre_cl_usr_flg", "pre_cl_usr_flg"),
				MCItemDef.create("cl_usr_flg", "cl_usr_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("add_dpt_cd1", "add_dpt_cd1"),
				MCItemDef.create("add_dpt_nm1", "add_dpt_nm1"),
				MCItemDef.create("add_dpt_cd2", "add_dpt_cd2"),
				MCItemDef.create("add_dpt_nm2", "add_dpt_nm2"),
				MCItemDef.create("add_dpt_cd3", "add_dpt_cd3"),
				MCItemDef.create("add_dpt_nm3", "add_dpt_nm3"),
				MCItemDef.create("add_dpt_cd4", "add_dpt_cd4"),
				MCItemDef.create("add_dpt_nm4", "add_dpt_nm4"),
				MCItemDef.create("add_dpt_cd5", "add_dpt_cd5"),
				MCItemDef.create("add_dpt_nm5", "add_dpt_nm5"),
				MCItemDef.create("add_dpt_cd6", "add_dpt_cd6"),
				MCItemDef.create("add_dpt_nm6", "add_dpt_nm6"),
				MCItemDef.create("add_dpt_cd7", "add_dpt_cd7"),
				MCItemDef.create("add_dpt_nm7", "add_dpt_nm7"),
				MCItemDef.create("add_dpt_cd8", "add_dpt_cd8"),
				MCItemDef.create("add_dpt_nm8", "add_dpt_nm8"),
				MCItemDef.create("add_dpt_cd9", "add_dpt_cd9"),
				MCItemDef.create("add_dpt_nm9", "add_dpt_nm9"),
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("aprv_role_nm", "aprv_role_nm"),
				MCItemDef.create("aprv_role_cd1", "aprv_role_cd1"),
				MCItemDef.create("aprv_role_nm1", "aprv_role_nm1"),
				MCItemDef.create("aprv_role_cd2", "aprv_role_cd2"),
				MCItemDef.create("aprv_role_nm2", "aprv_role_nm2"),
				MCItemDef.create("aprv_role_cd3", "aprv_role_cd3"),
				MCItemDef.create("aprv_role_nm3", "aprv_role_nm3"),
				MCItemDef.create("aprv_role_cd4", "aprv_role_cd4"),
				MCItemDef.create("aprv_role_nm4", "aprv_role_nm4"),
				MCItemDef.create("aprv_role_cd5", "aprv_role_cd5"),
				MCItemDef.create("aprv_role_nm5", "aprv_role_nm5"),
				MCItemDef.create("aprv_role_cd6", "aprv_role_cd6"),
				MCItemDef.create("aprv_role_nm6", "aprv_role_nm6"),
				MCItemDef.create("aprv_role_cd7", "aprv_role_cd7"),
				MCItemDef.create("aprv_role_nm7", "aprv_role_nm7"),
				MCItemDef.create("aprv_role_cd8", "aprv_role_cd8"),
				MCItemDef.create("aprv_role_nm8", "aprv_role_nm8"),
				MCItemDef.create("aprv_role_cd9", "aprv_role_cd9"),
				MCItemDef.create("aprv_role_nm9", "aprv_role_nm9"),
				MCItemDef.create("sub_aprv_role_cd", "sub_aprv_role_cd"),
				MCItemDef.create("sub_aprv_role_nm", "sub_aprv_role_nm"),
				MCItemDef.create("sub_aprv_role_cd1", "sub_aprv_role_cd1"),
				MCItemDef.create("sub_aprv_role_nm1", "sub_aprv_role_nm1"),
				MCItemDef.create("sub_aprv_role_cd2", "sub_aprv_role_cd2"),
				MCItemDef.create("sub_aprv_role_nm2", "sub_aprv_role_nm2"),
				MCItemDef.create("sub_aprv_role_cd3", "sub_aprv_role_cd3"),
				MCItemDef.create("sub_aprv_role_nm3", "sub_aprv_role_nm3"),
				MCItemDef.create("sub_aprv_role_cd4", "sub_aprv_role_cd4"),
				MCItemDef.create("sub_aprv_role_nm4", "sub_aprv_role_nm4"),
				MCItemDef.create("sub_aprv_role_cd5", "sub_aprv_role_cd5"),
				MCItemDef.create("sub_aprv_role_nm5", "sub_aprv_role_nm5"),
				MCItemDef.create("sub_aprv_role_cd6", "sub_aprv_role_cd6"),
				MCItemDef.create("sub_aprv_role_nm6", "sub_aprv_role_nm6"),
				MCItemDef.create("sub_aprv_role_cd7", "sub_aprv_role_cd7"),
				MCItemDef.create("sub_aprv_role_nm7", "sub_aprv_role_nm7"),
				MCItemDef.create("sub_aprv_role_cd8", "sub_aprv_role_cd8"),
				MCItemDef.create("sub_aprv_role_nm8", "sub_aprv_role_nm8"),
				MCItemDef.create("sub_aprv_role_cd9", "sub_aprv_role_cd9"),
				MCItemDef.create("sub_aprv_role_nm9", "sub_aprv_role_nm9"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	
	static final MCOperationInfo MA_MABCL0250_Srch02_INFO = new MCOperationInfo("MA", "MABCL0250", "Srch02", "000000", new PDef());

	public static MCContainerDef MA_MABCL0250_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("usr_aprv_role_cd", "usr_aprv_role_cd"),
				MCItemDef.create("usr_aprv_role_nm", "usr_aprv_role_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("usr_alt_nm1", "usr_alt_nm1"),
				MCItemDef.create("usr_alt_nm2", "usr_alt_nm2"),
				MCItemDef.create("usr_alt_nm3", "usr_alt_nm3"),
				MCItemDef.create("usr_alt_nm4", "usr_alt_nm4"),
				MCItemDef.create("usr_com_typ", "usr_com_typ"),
				MCItemDef.create("usr_com", "usr_com"),
				MCItemDef.create("usr_info1", "usr_info1"),
				MCItemDef.create("usr_info2", "usr_info2"),
				MCItemDef.create("usr_info3", "usr_info3"),
				MCItemDef.create("usr_info4", "usr_info4"),
				MCItemDef.create("usr_info5", "usr_info5"),
				MCItemDef.create("usr_info6", "usr_info6"),
				MCItemDef.create("usr_info7", "usr_info7"),
				MCItemDef.create("usr_info8", "usr_info8"),
				MCItemDef.create("usr_info9", "usr_info9"),
				MCItemDef.create("usr_info10", "usr_info10"),
				MCItemDef.create("usr_info11", "usr_info11"),
				MCItemDef.create("usr_info12", "usr_info12"),
				MCItemDef.create("usr_info13", "usr_info13"),
				MCItemDef.create("usr_info14", "usr_info14"),
				MCItemDef.create("usr_info15", "usr_info15"),
				MCItemDef.create("usr_info16", "usr_info16"),
				MCItemDef.create("usr_info17", "usr_info17"),
				MCItemDef.create("usr_info18", "usr_info18"),
				MCItemDef.create("usr_info19", "usr_info19"),
				MCItemDef.create("usr_info20", "usr_info20"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0250_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("aprv_role_nm", "aprv_role_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("main_flg", "main_flg"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Srch02_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MABCL0250_Srch03_INFO = new MCOperationInfo("MA", "MABCL0250", "Srch03", "000000", new PDef());

	public static MCContainerDef MA_MABCL0250_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("usr_dpt_cd", "usr_dpt_cd"),
				MCItemDef.create("usr_dpt_nm", "usr_dpt_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("usr_alt_nm1", "usr_alt_nm1"),
				MCItemDef.create("usr_alt_nm2", "usr_alt_nm2"),
				MCItemDef.create("usr_alt_nm3", "usr_alt_nm3"),
				MCItemDef.create("usr_alt_nm4", "usr_alt_nm4"),
				MCItemDef.create("usr_com_typ", "usr_com_typ"),
				MCItemDef.create("usr_com", "usr_com"),
				MCItemDef.create("usr_info1", "usr_info1"),
				MCItemDef.create("usr_info2", "usr_info2"),
				MCItemDef.create("usr_info3", "usr_info3"),
				MCItemDef.create("usr_info4", "usr_info4"),
				MCItemDef.create("usr_info5", "usr_info5"),
				MCItemDef.create("usr_info6", "usr_info6"),
				MCItemDef.create("usr_info7", "usr_info7"),
				MCItemDef.create("usr_info8", "usr_info8"),
				MCItemDef.create("usr_info9", "usr_info9"),
				MCItemDef.create("usr_info10", "usr_info10"),
				MCItemDef.create("usr_info11", "usr_info11"),
				MCItemDef.create("usr_info12", "usr_info12"),
				MCItemDef.create("usr_info13", "usr_info13"),
				MCItemDef.create("usr_info14", "usr_info14"),
				MCItemDef.create("usr_info15", "usr_info15"),
				MCItemDef.create("usr_info16", "usr_info16"),
				MCItemDef.create("usr_info17", "usr_info17"),
				MCItemDef.create("usr_info18", "usr_info18"),
				MCItemDef.create("usr_info19", "usr_info19"),
				MCItemDef.create("usr_info20", "usr_info20"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Srch03_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0250_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("main_flg", "main_flg"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Srch03_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MABCL0250_Sprt01_INFO = new MCOperationInfo("MA", "MABCL0250", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0250_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("da_cd", "da_cd"),
				MCItemDef.create("da_nm", "da_nm"),
				MCItemDef.create("pre_cl_usr_flg", "pre_cl_usr_flg"),
				MCItemDef.create("cl_usr_flg", "cl_usr_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("add_dpt_cd1", "add_dpt_cd1"),
				MCItemDef.create("add_dpt_nm1", "add_dpt_nm1"),
				MCItemDef.create("add_dpt_cd2", "add_dpt_cd2"),
				MCItemDef.create("add_dpt_nm2", "add_dpt_nm2"),
				MCItemDef.create("add_dpt_cd3", "add_dpt_cd3"),
				MCItemDef.create("add_dpt_nm3", "add_dpt_nm3"),
				MCItemDef.create("add_dpt_cd4", "add_dpt_cd4"),
				MCItemDef.create("add_dpt_nm4", "add_dpt_nm4"),
				MCItemDef.create("add_dpt_cd5", "add_dpt_cd5"),
				MCItemDef.create("add_dpt_nm5", "add_dpt_nm5"),
				MCItemDef.create("add_dpt_cd6", "add_dpt_cd6"),
				MCItemDef.create("add_dpt_nm6", "add_dpt_nm6"),
				MCItemDef.create("add_dpt_cd7", "add_dpt_cd7"),
				MCItemDef.create("add_dpt_nm7", "add_dpt_nm7"),
				MCItemDef.create("add_dpt_cd8", "add_dpt_cd8"),
				MCItemDef.create("add_dpt_nm8", "add_dpt_nm8"),
				MCItemDef.create("add_dpt_cd9", "add_dpt_cd9"),
				MCItemDef.create("add_dpt_nm9", "add_dpt_nm9"),
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("aprv_role_nm", "aprv_role_nm"),
				MCItemDef.create("aprv_role_cd1", "aprv_role_cd1"),
				MCItemDef.create("aprv_role_nm1", "aprv_role_nm1"),
				MCItemDef.create("aprv_role_cd2", "aprv_role_cd2"),
				MCItemDef.create("aprv_role_nm2", "aprv_role_nm2"),
				MCItemDef.create("aprv_role_cd3", "aprv_role_cd3"),
				MCItemDef.create("aprv_role_nm3", "aprv_role_nm3"),
				MCItemDef.create("aprv_role_cd4", "aprv_role_cd4"),
				MCItemDef.create("aprv_role_nm4", "aprv_role_nm4"),
				MCItemDef.create("aprv_role_cd5", "aprv_role_cd5"),
				MCItemDef.create("aprv_role_nm5", "aprv_role_nm5"),
				MCItemDef.create("aprv_role_cd6", "aprv_role_cd6"),
				MCItemDef.create("aprv_role_nm6", "aprv_role_nm6"),
				MCItemDef.create("aprv_role_cd7", "aprv_role_cd7"),
				MCItemDef.create("aprv_role_nm7", "aprv_role_nm7"),
				MCItemDef.create("aprv_role_cd8", "aprv_role_cd8"),
				MCItemDef.create("aprv_role_nm8", "aprv_role_nm8"),
				MCItemDef.create("aprv_role_cd9", "aprv_role_cd9"),
				MCItemDef.create("aprv_role_nm9", "aprv_role_nm9"),
				MCItemDef.create("sub_aprv_role_cd", "sub_aprv_role_cd"),
				MCItemDef.create("sub_aprv_role_nm", "sub_aprv_role_nm"),
				MCItemDef.create("sub_aprv_role_cd1", "sub_aprv_role_cd1"),
				MCItemDef.create("sub_aprv_role_nm1", "sub_aprv_role_nm1"),
				MCItemDef.create("sub_aprv_role_cd2", "sub_aprv_role_cd2"),
				MCItemDef.create("sub_aprv_role_nm2", "sub_aprv_role_nm2"),
				MCItemDef.create("sub_aprv_role_cd3", "sub_aprv_role_cd3"),
				MCItemDef.create("sub_aprv_role_nm3", "sub_aprv_role_nm3"),
				MCItemDef.create("sub_aprv_role_cd4", "sub_aprv_role_cd4"),
				MCItemDef.create("sub_aprv_role_nm4", "sub_aprv_role_nm4"),
				MCItemDef.create("sub_aprv_role_cd5", "sub_aprv_role_cd5"),
				MCItemDef.create("sub_aprv_role_nm5", "sub_aprv_role_nm5"),
				MCItemDef.create("sub_aprv_role_cd6", "sub_aprv_role_cd6"),
				MCItemDef.create("sub_aprv_role_nm6", "sub_aprv_role_nm6"),
				MCItemDef.create("sub_aprv_role_cd7", "sub_aprv_role_cd7"),
				MCItemDef.create("sub_aprv_role_nm7", "sub_aprv_role_nm7"),
				MCItemDef.create("sub_aprv_role_cd8", "sub_aprv_role_cd8"),
				MCItemDef.create("sub_aprv_role_nm8", "sub_aprv_role_nm8"),
				MCItemDef.create("sub_aprv_role_cd9", "sub_aprv_role_cd9"),
				MCItemDef.create("sub_aprv_role_nm9", "sub_aprv_role_nm9"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MA_MABCL0250_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("license_flg", "license_flg"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("da_cd", "da_cd"),
				MCItemDef.create("da_nm", "da_nm"),
				MCItemDef.create("pre_cl_usr_flg", "pre_cl_usr_flg"),
				MCItemDef.create("cl_usr_flg", "cl_usr_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("add_dpt_cd1", "add_dpt_cd1"),
				MCItemDef.create("add_dpt_nm1", "add_dpt_nm1"),
				MCItemDef.create("add_dpt_cd2", "add_dpt_cd2"),
				MCItemDef.create("add_dpt_nm2", "add_dpt_nm2"),
				MCItemDef.create("add_dpt_cd3", "add_dpt_cd3"),
				MCItemDef.create("add_dpt_nm3", "add_dpt_nm3"),
				MCItemDef.create("add_dpt_cd4", "add_dpt_cd4"),
				MCItemDef.create("add_dpt_nm4", "add_dpt_nm4"),
				MCItemDef.create("add_dpt_cd5", "add_dpt_cd5"),
				MCItemDef.create("add_dpt_nm5", "add_dpt_nm5"),
				MCItemDef.create("add_dpt_cd6", "add_dpt_cd6"),
				MCItemDef.create("add_dpt_nm6", "add_dpt_nm6"),
				MCItemDef.create("add_dpt_cd7", "add_dpt_cd7"),
				MCItemDef.create("add_dpt_nm7", "add_dpt_nm7"),
				MCItemDef.create("add_dpt_cd8", "add_dpt_cd8"),
				MCItemDef.create("add_dpt_nm8", "add_dpt_nm8"),
				MCItemDef.create("add_dpt_cd9", "add_dpt_cd9"),
				MCItemDef.create("add_dpt_nm9", "add_dpt_nm9"),
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("aprv_role_nm", "aprv_role_nm"),
				MCItemDef.create("aprv_role_cd1", "aprv_role_cd1"),
				MCItemDef.create("aprv_role_nm1", "aprv_role_nm1"),
				MCItemDef.create("aprv_role_cd2", "aprv_role_cd2"),
				MCItemDef.create("aprv_role_nm2", "aprv_role_nm2"),
				MCItemDef.create("aprv_role_cd3", "aprv_role_cd3"),
				MCItemDef.create("aprv_role_nm3", "aprv_role_nm3"),
				MCItemDef.create("aprv_role_cd4", "aprv_role_cd4"),
				MCItemDef.create("aprv_role_nm4", "aprv_role_nm4"),
				MCItemDef.create("aprv_role_cd5", "aprv_role_cd5"),
				MCItemDef.create("aprv_role_nm5", "aprv_role_nm5"),
				MCItemDef.create("aprv_role_cd6", "aprv_role_cd6"),
				MCItemDef.create("aprv_role_nm6", "aprv_role_nm6"),
				MCItemDef.create("aprv_role_cd7", "aprv_role_cd7"),
				MCItemDef.create("aprv_role_nm7", "aprv_role_nm7"),
				MCItemDef.create("aprv_role_cd8", "aprv_role_cd8"),
				MCItemDef.create("aprv_role_nm8", "aprv_role_nm8"),
				MCItemDef.create("aprv_role_cd9", "aprv_role_cd9"),
				MCItemDef.create("aprv_role_nm9", "aprv_role_nm9"),
				MCItemDef.create("sub_aprv_role_cd", "sub_aprv_role_cd"),
				MCItemDef.create("sub_aprv_role_nm", "sub_aprv_role_nm"),
				MCItemDef.create("sub_aprv_role_cd1", "sub_aprv_role_cd1"),
				MCItemDef.create("sub_aprv_role_nm1", "sub_aprv_role_nm1"),
				MCItemDef.create("sub_aprv_role_cd2", "sub_aprv_role_cd2"),
				MCItemDef.create("sub_aprv_role_nm2", "sub_aprv_role_nm2"),
				MCItemDef.create("sub_aprv_role_cd3", "sub_aprv_role_cd3"),
				MCItemDef.create("sub_aprv_role_nm3", "sub_aprv_role_nm3"),
				MCItemDef.create("sub_aprv_role_cd4", "sub_aprv_role_cd4"),
				MCItemDef.create("sub_aprv_role_nm4", "sub_aprv_role_nm4"),
				MCItemDef.create("sub_aprv_role_cd5", "sub_aprv_role_cd5"),
				MCItemDef.create("sub_aprv_role_nm5", "sub_aprv_role_nm5"),
				MCItemDef.create("sub_aprv_role_cd6", "sub_aprv_role_cd6"),
				MCItemDef.create("sub_aprv_role_nm6", "sub_aprv_role_nm6"),
				MCItemDef.create("sub_aprv_role_cd7", "sub_aprv_role_cd7"),
				MCItemDef.create("sub_aprv_role_nm7", "sub_aprv_role_nm7"),
				MCItemDef.create("sub_aprv_role_cd8", "sub_aprv_role_cd8"),
				MCItemDef.create("sub_aprv_role_nm8", "sub_aprv_role_nm8"),
				MCItemDef.create("sub_aprv_role_cd9", "sub_aprv_role_cd9"),
				MCItemDef.create("sub_aprv_role_nm9", "sub_aprv_role_nm9"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0250_Upd01_INFO = new MCOperationInfo("MA", "MABCL0250", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0250_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("da_cd", "da_cd"),
				MCItemDef.create("pre_cl_usr_flg", "pre_cl_usr_flg"),
				MCItemDef.create("cl_usr_flg", "cl_usr_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("add_dpt_cd1", "add_dpt_cd1"),
				MCItemDef.create("add_dpt_cd2", "add_dpt_cd2"),
				MCItemDef.create("add_dpt_cd3", "add_dpt_cd3"),
				MCItemDef.create("add_dpt_cd4", "add_dpt_cd4"),
				MCItemDef.create("add_dpt_cd5", "add_dpt_cd5"),
				MCItemDef.create("add_dpt_cd6", "add_dpt_cd6"),
				MCItemDef.create("add_dpt_cd7", "add_dpt_cd7"),
				MCItemDef.create("add_dpt_cd8", "add_dpt_cd8"),
				MCItemDef.create("add_dpt_cd9", "add_dpt_cd9"),
				MCItemDef.create("aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("aprv_role_cd1", "aprv_role_cd1"),
				MCItemDef.create("aprv_role_cd2", "aprv_role_cd2"),
				MCItemDef.create("aprv_role_cd3", "aprv_role_cd3"),
				MCItemDef.create("aprv_role_cd4", "aprv_role_cd4"),
				MCItemDef.create("aprv_role_cd5", "aprv_role_cd5"),
				MCItemDef.create("aprv_role_cd6", "aprv_role_cd6"),
				MCItemDef.create("aprv_role_cd7", "aprv_role_cd7"),
				MCItemDef.create("aprv_role_cd8", "aprv_role_cd8"),
				MCItemDef.create("aprv_role_cd9", "aprv_role_cd9"),
				MCItemDef.create("sub_aprv_role_cd", "sub_aprv_role_cd"),
				MCItemDef.create("sub_aprv_role_cd1", "sub_aprv_role_cd1"),
				MCItemDef.create("sub_aprv_role_cd2", "sub_aprv_role_cd2"),
				MCItemDef.create("sub_aprv_role_cd3", "sub_aprv_role_cd3"),
				MCItemDef.create("sub_aprv_role_cd4", "sub_aprv_role_cd4"),
				MCItemDef.create("sub_aprv_role_cd5", "sub_aprv_role_cd5"),
				MCItemDef.create("sub_aprv_role_cd6", "sub_aprv_role_cd6"),
				MCItemDef.create("sub_aprv_role_cd7", "sub_aprv_role_cd7"),
				MCItemDef.create("sub_aprv_role_cd8", "sub_aprv_role_cd8"),
				MCItemDef.create("sub_aprv_role_cd9", "sub_aprv_role_cd9"),
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
	
	static final MCOperationInfo MA_MABCL0250_Del01_INFO = new MCOperationInfo("MA", "MABCL0250", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0250_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0250", "Del01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

