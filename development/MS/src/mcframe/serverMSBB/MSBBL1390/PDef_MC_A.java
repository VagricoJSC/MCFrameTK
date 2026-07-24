package mcframe.serverMSBB.MSBBL1390;

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
 * [MSBBL_SlsBdgListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL1390.Srch01.UP.BLOCK0")){
			return MS_MSBBL1390_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1390.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL1390_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1390.Chk01.UP.BLOCK0")){
			return MS_MSBBL1390_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1390.Chk01.UP.BLOCK1")){
			return MS_MSBBL1390_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1390.Chk01.DOWN.BLOCK0")){
			return MS_MSBBL1390_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1390.Chk02.UP.BLOCK0")){
			return MS_MSBBL1390_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1390.Chk02.DOWN.BLOCK0")){
			return MS_MSBBL1390_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1390.Upd01.UP.BLOCK0")){
			return MS_MSBBL1390_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1390.Upd01.DOWN.BLOCK0")){
			return MS_MSBBL1390_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1390.Imp01.UP.BLOCK0")){
			return MS_MSBBL1390_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1390.Imp01.DOWN.BLOCK0")){
			return MS_MSBBL1390_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1390.Del01.UP.BLOCK0")){
			return MS_MSBBL1390_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1390.Del01.DOWN.BLOCK0")){
			return MS_MSBBL1390_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBBL1390_Srch01_INFO = new MCOperationInfo("MS", "MSBBL1390", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1390_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1390", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sls_itm_grp_cd", "sls_itm_grp_cd"),
				MCItemDef.create("sls_itm_grp_nm", "sls_itm_grp_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("sls_bdg_grp", "sls_bdg_grp"),
				MCItemDef.create("sum_flg", "sum_flg"),
				MCItemDef.create("not_sum_flg", "not_sum_flg"),
				MCItemDef.create("sls_itm_grp_sum_flg", "sls_itm_grp_sum_flg"),
				MCItemDef.create("sls_itm_grp_not_sum_flg", "sls_itm_grp_not_sum_flg"),
				MCItemDef.create("mesh_srch_flg", "mesh_srch_flg"),
				MCItemDef.create("mesh_sls_dpt_flg", "mesh_sls_dpt_flg"),
				MCItemDef.create("mesh_sls_itm_grp_flg", "mesh_sls_itm_grp_flg"),
				MCItemDef.create("mesh_cst_flg", "mesh_cst_flg"),
				MCItemDef.create("mesh_sls_usr_flg", "mesh_sls_usr_flg"),
				MCItemDef.create("mesh_wrk_no_flg", "mesh_wrk_no_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bp_grp_flg1", "bp_grp_flg1"),
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_flg2", "bp_grp_flg2"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_flg3", "bp_grp_flg3"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_flg4", "bp_grp_flg4"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_flg5", "bp_grp_flg5"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_flg6", "bp_grp_flg6"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_flg7", "bp_grp_flg7"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_flg8", "bp_grp_flg8"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_flg9", "bp_grp_flg9"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_flg10", "bp_grp_flg10"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_nm10", "bp_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1390_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1390", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sls_itm_grp_cd", "sls_itm_grp_cd"),
				MCItemDef.create("sls_itm_grp_nm", "sls_itm_grp_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("sls_bdg_grp", "sls_bdg_grp"),
				MCItemDef.create("bdg_sls_amt", "bdg_sls_amt"),
				MCItemDef.create("bdg_sls_prof_rate", "bdg_sls_prof_rate"),
				MCItemDef.create("bdg_sls_prof_amt", "bdg_sls_prof_amt"),
				MCItemDef.create("not_sum_flg", "not_sum_flg"),
				MCItemDef.create("sls_itm_grp_not_sum_flg", "sls_itm_grp_not_sum_flg"),
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
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1390_Chk01_INFO = new MCOperationInfo("MS", "MSBBL1390", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1390_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1390", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sls_itm_grp_cd", "sls_itm_grp_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("sls_bdg_grp", "sls_bdg_grp"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL1390_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1390", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg")
			}
			,
			MCBlockDef.create("Chk01_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBBL1390_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1390", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sls_itm_grp_cd", "sls_itm_grp_cd"),
				MCItemDef.create("sls_itm_grp_nm", "sls_itm_grp_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1390_Chk02_INFO = new MCOperationInfo("MS", "MSBBL1390", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1390_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1390", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sls_itm_grp_cd", "sls_itm_grp_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("sls_bdg_grp", "sls_bdg_grp"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1390_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1390", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1390_Upd01_INFO = new MCOperationInfo("MS", "MSBBL1390", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1390_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1390", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sls_itm_grp_cd", "sls_itm_grp_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("sls_bdg_grp", "sls_bdg_grp"),
				MCItemDef.create("bdg_sls_amt", "bdg_sls_amt"),
				MCItemDef.create("bdg_sls_prof_rate", "bdg_sls_prof_rate"),
				MCItemDef.create("bdg_sls_prof_amt", "bdg_sls_prof_amt"),
				MCItemDef.create("not_sum_flg", "not_sum_flg"),
				MCItemDef.create("sls_itm_grp_not_sum_flg", "sls_itm_grp_not_sum_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1390_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1390", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1390_Imp01_INFO = new MCOperationInfo("MS", "MSBBL1390", "Imp01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1390_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1390", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sls_itm_grp_cd", "sls_itm_grp_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("sls_bdg_grp", "sls_bdg_grp"),
				MCItemDef.create("bdg_sls_amt", "bdg_sls_amt"),
				MCItemDef.create("bdg_sls_prof_rate", "bdg_sls_prof_rate"),
				MCItemDef.create("bdg_sls_prof_amt", "bdg_sls_prof_amt"),
				MCItemDef.create("not_sum_flg", "not_sum_flg"),
				MCItemDef.create("sls_itm_grp_not_sum_flg", "sls_itm_grp_not_sum_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Imp01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1390_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1390", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sls_itm_grp_cd", "sls_itm_grp_cd"),
				MCItemDef.create("sls_itm_grp_nm", "sls_itm_grp_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("sls_bdg_grp", "sls_bdg_grp"),
				MCItemDef.create("bdg_sls_amt", "bdg_sls_amt"),
				MCItemDef.create("bdg_sls_prof_rate", "bdg_sls_prof_rate"),
				MCItemDef.create("bdg_sls_prof_amt", "bdg_sls_prof_amt"),
				MCItemDef.create("not_sum_flg", "not_sum_flg"),
				MCItemDef.create("sls_itm_grp_not_sum_flg", "sls_itm_grp_not_sum_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Imp01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1390_Del01_INFO = new MCOperationInfo("MS", "MSBBL1390", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1390_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1390", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sls_itm_grp_cd", "sls_itm_grp_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("sls_bdg_grp", "sls_bdg_grp"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1390_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1390", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

