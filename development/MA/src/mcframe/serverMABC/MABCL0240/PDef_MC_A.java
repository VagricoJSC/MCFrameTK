package mcframe.serverMABC.MABCL0240;

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
 * [MABCL_UsrReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0240.Usr_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0240_Usr_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0240.Usr_Upd01.UP.BLOCK0")){
			return MA_MABCL0240_Usr_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0240.UsrLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0240_UsrLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0240.UsrLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0240_UsrLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0240.Usr_DelChk01.UP.BLOCK0")){
			return MA_MABCL0240_Usr_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0240.Usr_Del01.UP.BLOCK0")){
			return MA_MABCL0240_Usr_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0240.Srch01.UP.BLOCK0")){
			return MA_MABCL0240_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0240.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0240_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0240.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0240_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0240.Upd01.UP.BLOCK0")){
			return MA_MABCL0240_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0240.Upd01.UP.BLOCK1")){
			return MA_MABCL0240_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0240.Del01.UP.BLOCK0")){
			return MA_MABCL0240_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MA_MABCL0240_Usr_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0240", "Usr_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0240_Usr_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0240", "Usr_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("usr_alt_nm1", "usr_alt_nm1"),
				MCItemDef.create("usr_alt_nm2", "usr_alt_nm2"),
				MCItemDef.create("usr_alt_nm3", "usr_alt_nm3"),
				MCItemDef.create("usr_alt_nm4", "usr_alt_nm4"),
				MCItemDef.create("full_da_flg", "full_da_flg"),
				MCItemDef.create("email1", "email1"),
				MCItemDef.create("email2", "email2"),
				MCItemDef.create("email3", "email3"),
				MCItemDef.create("tel1", "tel1"),
				MCItemDef.create("tel2", "tel2"),
				MCItemDef.create("tel3", "tel3"),
				MCItemDef.create("th_image_flg", "th_image_flg"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("usr_com_typ", "usr_com_typ"),
				MCItemDef.create("usr_com", "usr_com"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
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
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Usr_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0240_Usr_Upd01_INFO = new MCOperationInfo("MA", "MABCL0240", "Usr_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0240_Usr_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0240", "Usr_Upd01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("usr_alt_nm1", "usr_alt_nm1"),
				MCItemDef.create("usr_alt_nm2", "usr_alt_nm2"),
				MCItemDef.create("usr_alt_nm3", "usr_alt_nm3"),
				MCItemDef.create("usr_alt_nm4", "usr_alt_nm4"),
				MCItemDef.create("full_da_flg", "full_da_flg"),
				MCItemDef.create("email1", "email1"),
				MCItemDef.create("email2", "email2"),
				MCItemDef.create("email3", "email3"),
				MCItemDef.create("tel1", "tel1"),
				MCItemDef.create("tel2", "tel2"),
				MCItemDef.create("tel3", "tel3"),
				MCItemDef.create("th_image_flg", "th_image_flg"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("usr_com_typ", "usr_com_typ"),
				MCItemDef.create("usr_com", "usr_com"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
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
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Usr_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0240_UsrLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0240", "UsrLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0240_UsrLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0240", "UsrLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("usr_alt_nm1", "usr_alt_nm1"),
				MCItemDef.create("usr_alt_nm2", "usr_alt_nm2"),
				MCItemDef.create("usr_alt_nm3", "usr_alt_nm3"),
				MCItemDef.create("usr_alt_nm4", "usr_alt_nm4"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("UsrLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0240_UsrLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0240", "UsrLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0240_UsrLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0240", "UsrLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("usr_alt_nm1", "usr_alt_nm1"),
				MCItemDef.create("usr_alt_nm2", "usr_alt_nm2"),
				MCItemDef.create("usr_alt_nm3", "usr_alt_nm3"),
				MCItemDef.create("usr_alt_nm4", "usr_alt_nm4"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("UsrLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0240_Usr_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0240", "Usr_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0240_Usr_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0240", "Usr_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Usr_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0240_Usr_Del01_INFO = new MCOperationInfo("MA", "MABCL0240", "Usr_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0240_Usr_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0240", "Usr_Del01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Usr_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0240_Srch01_INFO = new MCOperationInfo("MA", "MABCL0240", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0240_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm_lcl", "usr_nm_lcl"),
				MCItemDef.create("usr_alt_nm1", "usr_alt_nm1"),
				MCItemDef.create("usr_alt_nm2", "usr_alt_nm2"),
				MCItemDef.create("usr_alt_nm3", "usr_alt_nm3"),
				MCItemDef.create("usr_alt_nm4", "usr_alt_nm4"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("th_image_flg", "th_image_flg"),
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
				MCItemDef.create("usr_info20", "usr_info20")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0240_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm_lcl", "usr_nm_lcl"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("license_flg", "license_flg"),
				MCItemDef.create("usr_alt_nm1", "usr_alt_nm1"),
				MCItemDef.create("usr_alt_nm2", "usr_alt_nm2"),
				MCItemDef.create("usr_alt_nm3", "usr_alt_nm3"),
				MCItemDef.create("usr_alt_nm4", "usr_alt_nm4"),
				MCItemDef.create("full_da_flg", "full_da_flg"),
				MCItemDef.create("email1", "email1"),
				MCItemDef.create("email2", "email2"),
				MCItemDef.create("email3", "email3"),
				MCItemDef.create("tel1", "tel1"),
				MCItemDef.create("tel2", "tel2"),
				MCItemDef.create("tel3", "tel3"),
				MCItemDef.create("th_image_flg", "th_image_flg"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("usr_com_typ", "usr_com_typ"),
				MCItemDef.create("usr_com_typ_nm", "usr_com_typ_nm"),
				MCItemDef.create("usr_com", "usr_com"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
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
	public static MCContainerDef MA_MABCL0240_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("usr_alt_nm1", "usr_alt_nm1"),
				MCItemDef.create("usr_alt_nm2", "usr_alt_nm2"),
				MCItemDef.create("usr_alt_nm3", "usr_alt_nm3"),
				MCItemDef.create("usr_alt_nm4", "usr_alt_nm4"),
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
	
	static final MCOperationInfo MA_MABCL0240_Upd01_INFO = new MCOperationInfo("MA", "MABCL0240", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0240_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0240", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("usr_alt_nm1", "usr_alt_nm1"),
				MCItemDef.create("usr_alt_nm2", "usr_alt_nm2"),
				MCItemDef.create("usr_alt_nm3", "usr_alt_nm3"),
				MCItemDef.create("usr_alt_nm4", "usr_alt_nm4"),
				MCItemDef.create("full_da_flg", "full_da_flg"),
				MCItemDef.create("email1", "email1"),
				MCItemDef.create("email2", "email2"),
				MCItemDef.create("email3", "email3"),
				MCItemDef.create("tel1", "tel1"),
				MCItemDef.create("tel2", "tel2"),
				MCItemDef.create("tel3", "tel3"),
				MCItemDef.create("th_image_flg", "th_image_flg"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("usr_com_typ", "usr_com_typ"),
				MCItemDef.create("usr_com", "usr_com"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
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
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}

	public static MCContainerDef MA_MABCL0240_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0240", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("usr_alt_nm1", "usr_alt_nm1"),
				MCItemDef.create("usr_alt_nm2", "usr_alt_nm2"),
				MCItemDef.create("usr_alt_nm3", "usr_alt_nm3"),
				MCItemDef.create("usr_alt_nm4", "usr_alt_nm4"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl2")
		);
	}
	
	static final MCOperationInfo MA_MABCL0240_Del01_INFO = new MCOperationInfo("MA", "MABCL0240", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0240_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0240", "Del01",
			new MCItemDef[]{
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

