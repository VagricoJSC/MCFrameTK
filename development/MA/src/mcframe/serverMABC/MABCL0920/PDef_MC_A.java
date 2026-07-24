package mcframe.serverMABC.MABCL0920;

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
 * [MABCL_InptChkReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0920.InptChk_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0920_InptChk_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0920.InptChk_Upd01.UP.BLOCK0")){
			return MA_MABCL0920_InptChk_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0920.InptChk_DelChk01.UP.BLOCK0")){
			return MA_MABCL0920_InptChk_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0920.InptChk_Del01.UP.BLOCK0")){
			return MA_MABCL0920_InptChk_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0920.Srch01.UP.BLOCK0")){
			return MA_MABCL0920_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0920.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0920_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0920.Upd01.UP.BLOCK0")){
			return MA_MABCL0920_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0920.Del01.UP.BLOCK0")){
			return MA_MABCL0920_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MA_MABCL0920_InptChk_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0920", "InptChk_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0920_InptChk_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0920", "InptChk_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("func_typ", "func_typ"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("low_rate_lmt", "low_rate_lmt"),
				MCItemDef.create("up_rate_lmt", "up_rate_lmt"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InptChk_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0920_InptChk_Upd01_INFO = new MCOperationInfo("MA", "MABCL0920", "InptChk_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0920_InptChk_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0920", "InptChk_Upd01",
			new MCItemDef[]{
				MCItemDef.create("func_typ", "func_typ"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("low_rate_lmt", "low_rate_lmt"),
				MCItemDef.create("up_rate_lmt", "up_rate_lmt"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InptChk_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0920_InptChk_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0920", "InptChk_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0920_InptChk_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0920", "InptChk_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("func_typ", "func_typ"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InptChk_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0920_InptChk_Del01_INFO = new MCOperationInfo("MA", "MABCL0920", "InptChk_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0920_InptChk_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0920", "InptChk_Del01",
			new MCItemDef[]{
				MCItemDef.create("func_typ", "func_typ"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("InptChk_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0920_Srch01_INFO = new MCOperationInfo("MA", "MABCL0920", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0920_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0920", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("func_typ", "func_typ"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("itm_grp_nm", "itm_grp_nm"),
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


	public static MCContainerDef MA_MABCL0920_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0920", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("func_typ", "func_typ"),
				MCItemDef.create("func_typ_nm", "func_typ_nm"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_typ_nm", "itm_grp_typ_nm"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("itm_grp_nm", "itm_grp_nm"),
				MCItemDef.create("low_rate_lmt", "low_rate_lmt"),
				MCItemDef.create("up_rate_lmt", "up_rate_lmt"),
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
	
	static final MCOperationInfo MA_MABCL0920_Upd01_INFO = new MCOperationInfo("MA", "MABCL0920", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0920_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0920", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("func_typ", "func_typ"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("low_rate_lmt", "low_rate_lmt"),
				MCItemDef.create("up_rate_lmt", "up_rate_lmt"),
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
	
	static final MCOperationInfo MA_MABCL0920_Del01_INFO = new MCOperationInfo("MA", "MABCL0920", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0920_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0920", "Del01",
			new MCItemDef[]{
				MCItemDef.create("func_typ", "func_typ"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

