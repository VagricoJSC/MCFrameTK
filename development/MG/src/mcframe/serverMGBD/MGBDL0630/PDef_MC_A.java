package mcframe.serverMGBD.MGBDL0630;

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
 * [MGBDL_StdAlcRateReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0630.Srch01.UP.BLOCK0")){
			return MG_MGBDL0630_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0630.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0630_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0630.Chk01.UP.BLOCK0")){
			return MG_MGBDL0630_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0630.Chk01.UP.BLOCK1")){
			return MG_MGBDL0630_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0630.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0630_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0630.Chk02.UP.BLOCK0")){
			return MG_MGBDL0630_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0630.Chk02.DOWN.BLOCK0")){
			return MG_MGBDL0630_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0630.Upd01.UP.BLOCK0")){
			return MG_MGBDL0630_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0630.Upd01.DOWN.BLOCK0")){
			return MG_MGBDL0630_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0630.Del01.UP.BLOCK0")){
			return MG_MGBDL0630_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0630.Del01.DOWN.BLOCK0")){
			return MG_MGBDL0630_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0630.Imp01.UP.BLOCK0")){
			return MG_MGBDL0630_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0630.Imp01.DOWN.BLOCK0")){
			return MG_MGBDL0630_Imp01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MG_MGBDL0630_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0630", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0630_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0630", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("term_fr", "term_fr"),
				MCItemDef.create("term_to", "term_to"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
				MCItemDef.create("alc_ac_grp_cd1", "alc_ac_grp_cd1"),
				MCItemDef.create("alc_ac_grp_nm1", "alc_ac_grp_nm1"),
				MCItemDef.create("alc_ac_grp_cd2", "alc_ac_grp_cd2"),
				MCItemDef.create("alc_ac_grp_nm2", "alc_ac_grp_nm2"),
				MCItemDef.create("alc_ac_grp_cd3", "alc_ac_grp_cd3"),
				MCItemDef.create("alc_ac_grp_nm3", "alc_ac_grp_nm3"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("no_dpt_flg", "no_dpt_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("no_loc_flg", "no_loc_flg"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("no_oper_flg", "no_oper_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("no_bp_flg", "no_bp_flg"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
				MCItemDef.create("no_ctg_flg", "no_ctg_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("no_itm_flg", "no_itm_flg"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("off_fix_flg", "off_fix_flg"),
				MCItemDef.create("on_fix_flg", "on_fix_flg"),
				MCItemDef.create("off_non_calc_flg", "off_non_calc_flg"),
				MCItemDef.create("on_non_calc_flg", "on_non_calc_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0630_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0630", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("term", "term"),
				MCItemDef.create("term_nm", "term_nm"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("alc_rate", "alc_rate"),
				MCItemDef.create("fix_alc_ptn_cd", "fix_alc_ptn_cd"),
				MCItemDef.create("fix_alc_ptn_nm", "fix_alc_ptn_nm"),
				MCItemDef.create("fix_expns_cd", "fix_expns_cd"),
				MCItemDef.create("fix_expns_nm", "fix_expns_nm"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("non_calc_flg", "non_calc_flg"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0630_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0630", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0630_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0630", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".bp_cd", "bp_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".alc_rate", "alc_rate"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBDL0630_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0630", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg")
			}
			,
			MCBlockDef.create("Chk01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBDL0630_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0630", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".bp_cd", "bp_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".alc_rate", "alc_rate"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("term_nm", "term_nm"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
				MCItemDef.create("itm_nm", "itm_nm")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0630_Chk02_INFO = new MCOperationInfo("MG", "MGBDL0630", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0630_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0630", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".bp_cd", "bp_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0630_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0630", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".bp_cd", "bp_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0630_Upd01_INFO = new MCOperationInfo("MG", "MGBDL0630", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0630_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0630", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".bp_cd", "bp_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".alc_rate", "alc_rate"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0630_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0630", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0630_Del01_INFO = new MCOperationInfo("MG", "MGBDL0630", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0630_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0630", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".bp_cd", "bp_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0630_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0630", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0630_Imp01_INFO = new MCOperationInfo("MG", "MGBDL0630", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0630_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0630", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".bp_cd", "bp_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".alc_rate", "alc_rate"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBDL0630_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0630", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".term", "term"),
				MCItemDef.create("dbc" + ".alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".bp_cd", "bp_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".alc_rate", "alc_rate"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".non_calc_flg", "non_calc_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("term_nm", "term_nm"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
				MCItemDef.create("itm_nm", "itm_nm")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

