package mcframe.serverMGBD.MGBDL0040;

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
 * [MGBDL_ArgReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0040.Chk01.UP.BLOCK0")){
			return MG_MGBDL0040_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0040_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Chk02.UP.BLOCK0")){
			return MG_MGBDL0040_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Chk02.DOWN.BLOCK0")){
			return MG_MGBDL0040_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Chk03.UP.BLOCK0")){
			return MG_MGBDL0040_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Chk03.DOWN.BLOCK0")){
			return MG_MGBDL0040_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Chk04.UP.BLOCK0")){
			return MG_MGBDL0040_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Chk04.DOWN.BLOCK0")){
			return MG_MGBDL0040_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Ins01.UP.BLOCK0")){
			return MG_MGBDL0040_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Ins01.DOWN.BLOCK0")){
			return MG_MGBDL0040_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Del01.UP.BLOCK0")){
			return MG_MGBDL0040_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Del01.DOWN.BLOCK0")){
			return MG_MGBDL0040_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Ins02.UP.BLOCK0")){
			return MG_MGBDL0040_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Ins02.DOWN.BLOCK0")){
			return MG_MGBDL0040_Ins02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Del02.UP.BLOCK0")){
			return MG_MGBDL0040_Del02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Del02.DOWN.BLOCK0")){
			return MG_MGBDL0040_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Srch01.UP.BLOCK0")){
			return MG_MGBDL0040_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0040_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0040.Srch01.DOWN.BLOCK1")){
			return MG_MGBDL0040_Srch01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MG_MGBDL0040_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0040", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0040_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ac_if_flg", "ac_if_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("fix_upd_cntr", "fix_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0040_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0040_Chk02_INFO = new MCOperationInfo("MG", "MGBDL0040", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0040_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ac_if_flg", "ac_if_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("fix_upd_cntr", "fix_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0040_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0040_Chk03_INFO = new MCOperationInfo("MG", "MGBDL0040", "Chk03", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0040_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ac_if_flg", "ac_if_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("fix_upd_cntr", "fix_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0040_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0040_Chk04_INFO = new MCOperationInfo("MG", "MGBDL0040", "Chk04", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0040_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ac_if_flg", "ac_if_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("fix_upd_cntr", "fix_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0040_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0040_Ins01_INFO = new MCOperationInfo("MG", "MGBDL0040", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0040_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ac_if_flg", "ac_if_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("fix_upd_cntr", "fix_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0040_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0040_Del01_INFO = new MCOperationInfo("MG", "MGBDL0040", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0040_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ac_if_flg", "ac_if_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("fix_upd_cntr", "fix_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0040_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0040_Ins02_INFO = new MCOperationInfo("MG", "MGBDL0040", "Ins02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0040_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ac_if_flg", "ac_if_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("fix_upd_cntr", "fix_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0040_Ins02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0040_Del02_INFO = new MCOperationInfo("MG", "MGBDL0040", "Del02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0040_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Del02",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ac_if_flg", "ac_if_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("fix_upd_cntr", "fix_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MG_MGBDL0040_Del02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Del02",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0040_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0040", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0040_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0040_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ac_if_flg", "ac_if_flg"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MG_MGBDL0040_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ac_if_flg", "ac_if_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym"),
				MCItemDef.create("calc_usr_cd", "calc_usr_cd"),
				MCItemDef.create("calc_usr_nm", "calc_usr_nm"),
				MCItemDef.create("calc_st", "calc_st"),
				MCItemDef.create("calc_fin", "calc_fin"),
				MCItemDef.create("ins_srv_req_no", "ins_srv_req_no"),
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
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("fix_upd_cntr", "fix_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

