package mcframe.serverMGBD.MGBDL0030;

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
 * [MGBDL_ArgSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0030.Chk01.UP.BLOCK0")){
			return MG_MGBDL0030_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0030.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0030_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0030.Upd01.UP.BLOCK0")){
			return MG_MGBDL0030_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0030.Upd01.DOWN.BLOCK0")){
			return MG_MGBDL0030_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0030.Del01.UP.BLOCK0")){
			return MG_MGBDL0030_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0030.Del01.UP.BLOCK1")){
			return MG_MGBDL0030_Del01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0030.Srch01.UP.BLOCK0")){
			return MG_MGBDL0030_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0030.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0030_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0030.Srch02.UP.BLOCK0")){
			return MG_MGBDL0030_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0030.Srch02.DOWN.BLOCK0")){
			return MG_MGBDL0030_Srch02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MG_MGBDL0030_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0030", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0030_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0030_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0030_Upd01_INFO = new MCOperationInfo("MG", "MGBDL0030", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0030_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("non_del_flg", "non_del_flg"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0030_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0030_Del01_INFO = new MCOperationInfo("MG", "MGBDL0030", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0030_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MG_MGBDL0030_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0030_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0030", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0030_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("calc_usr_cd", "calc_usr_cd"),
				MCItemDef.create("calc_usr_nm", "calc_usr_nm"),
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("fix_true_flg", true, "fix_true_flg"),
				MCItemDef.create("fix_false_flg", true, "fix_false_flg"),
				MCItemDef.create("non_del_true_flg", true, "non_del_true_flg"),
				MCItemDef.create("non_del_false_flg", true, "non_del_false_flg"),
				MCItemDef.create("calc_err_true_flg", true, "calc_err_true_flg"),
				MCItemDef.create("calc_err_false_flg", true, "calc_err_false_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0030_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate_nm", "xrate_nm"),
				MCItemDef.create("calc_usr_cd", "calc_usr_cd"),
				MCItemDef.create("calc_usr_nm", "calc_usr_nm"),
				MCItemDef.create("calc_st", "calc_st"),
				MCItemDef.create("calc_fin", "calc_fin"),
				MCItemDef.create("alc_err_flg", "alc_err_flg"),
				MCItemDef.create("trd_amt_flg", "trd_amt_flg"),
				MCItemDef.create("adj_amt_flg", "adj_amt_flg"),
				MCItemDef.create("non_del_flg", "non_del_flg"),
				MCItemDef.create("minus_stk_flg", "minus_stk_flg"),
				MCItemDef.create("other_chk_flg", "other_chk_flg"),
				MCItemDef.create("itm_limit_flg", "itm_limit_flg"),
				MCItemDef.create("data_check_flg", "data_check_flg"),
				MCItemDef.create("rate_fix_flg", "rate_fix_flg"),
				MCItemDef.create("calc_err_flg", "calc_err_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("ins_srv_req_no", "ins_srv_req_no"),
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0030_Srch02_INFO = new MCOperationInfo("MG", "MGBDL0030", "Srch02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0030_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0030", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("menu_cd", "menu_cd")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0030_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0030", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("menu_no", "menu_no"),
				MCItemDef.create("module_id", "module_id"),
				MCItemDef.create("scrn_id", "scrn_id")
			}
			,
			MCBlockDef.create("Srch02_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

