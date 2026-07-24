package mcframe.serverMGBB.MGBBL0040;

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
 * [MGBBL_InstOperReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL0040.Srch01.UP.BLOCK0")){
			return MG_MGBBL0040_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Srch01.DOWN.BLOCK0")){
			return MG_MGBBL0040_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Chk01.UP.BLOCK0")){
			return MG_MGBBL0040_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Chk01.UP.BLOCK1")){
			return MG_MGBBL0040_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBBL0040.Chk01.DOWN.BLOCK0")){
			return MG_MGBBL0040_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Chk02.UP.BLOCK0")){
			return MG_MGBBL0040_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Chk02.DOWN.BLOCK0")){
			return MG_MGBBL0040_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Chk03.UP.BLOCK0")){
			return MG_MGBBL0040_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Chk03.DOWN.BLOCK0")){
			return MG_MGBBL0040_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Imp01.UP.BLOCK0")){
			return MG_MGBBL0040_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Imp01.DOWN.BLOCK0")){
			return MG_MGBBL0040_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Upd01.UP.BLOCK0")){
			return MG_MGBBL0040_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Upd01.DOWN.BLOCK0")){
			return MG_MGBBL0040_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Del01.UP.BLOCK0")){
			return MG_MGBBL0040_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Del01.DOWN.BLOCK0")){
			return MG_MGBBL0040_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Del02.UP.BLOCK0")){
			return MG_MGBBL0040_Del02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Ins01.UP.BLOCK0")){
			return MG_MGBBL0040_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Ins02.UP.BLOCK0")){
			return MG_MGBBL0040_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0040.Ins02.UP.BLOCK1")){
			return MG_MGBBL0040_Ins02_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
										
	
	static final MCOperationInfo MG_MGBBL0040_Srch01_INFO = new MCOperationInfo("MG", "MGBBL0040", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0040_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("schd_st_dt_fr", "schd_st_dt_fr"),
				MCItemDef.create("schd_st_dt_to", "schd_st_dt_to"),
				MCItemDef.create("schd_end_dt_fr", "schd_end_dt_fr"),
				MCItemDef.create("schd_end_dt_to", "schd_end_dt_to"),
				MCItemDef.create("act_st_dt_fr", "act_st_dt_fr"),
				MCItemDef.create("act_st_dt_to", "act_st_dt_to"),
				MCItemDef.create("act_end_dt_fr", "act_end_dt_fr"),
				MCItemDef.create("act_end_dt_to", "act_end_dt_to"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("this_term", "this_term")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL0040_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("per", "per"),
				MCItemDef.create("schd_st_dt", "schd_st_dt"),
				MCItemDef.create("schd_end_dt", "schd_end_dt"),
				MCItemDef.create("act_st_dt", "act_st_dt"),
				MCItemDef.create("act_end_dt", "act_end_dt"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0040_Chk01_INFO = new MCOperationInfo("MG", "MGBBL0040", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0040_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".schd_st_dt", "schd_st_dt"),
				MCItemDef.create("dbc" + ".schd_end_dt", "schd_end_dt"),
				MCItemDef.create("dbc" + ".act_st_dt", "act_st_dt"),
				MCItemDef.create("dbc" + ".act_end_dt", "act_end_dt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBBL0040_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg"),
				MCItemDef.create("file_ins_flg", "file_ins_flg")
			}
			,
			MCBlockDef.create("Chk01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBBL0040_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".schd_st_dt", "schd_st_dt"),
				MCItemDef.create("dbc" + ".schd_end_dt", "schd_end_dt"),
				MCItemDef.create("dbc" + ".act_st_dt", "act_st_dt"),
				MCItemDef.create("dbc" + ".act_end_dt", "act_end_dt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("per", "per")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0040_Chk02_INFO = new MCOperationInfo("MG", "MGBBL0040", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0040_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0040_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0040_Chk03_INFO = new MCOperationInfo("MG", "MGBBL0040", "Chk03", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0040_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL0040_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0040_Imp01_INFO = new MCOperationInfo("MG", "MGBBL0040", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0040_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".schd_st_dt", "schd_st_dt"),
				MCItemDef.create("dbc" + ".schd_end_dt", "schd_end_dt"),
				MCItemDef.create("dbc" + ".act_st_dt", "act_st_dt"),
				MCItemDef.create("dbc" + ".act_end_dt", "act_end_dt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0040_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".schd_st_dt", "schd_st_dt"),
				MCItemDef.create("dbc" + ".schd_end_dt", "schd_end_dt"),
				MCItemDef.create("dbc" + ".act_st_dt", "act_st_dt"),
				MCItemDef.create("dbc" + ".act_end_dt", "act_end_dt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("per", "per")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0040_Upd01_INFO = new MCOperationInfo("MG", "MGBBL0040", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0040_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".schd_st_dt", "schd_st_dt"),
				MCItemDef.create("dbc" + ".schd_end_dt", "schd_end_dt"),
				MCItemDef.create("dbc" + ".act_st_dt", "act_st_dt"),
				MCItemDef.create("dbc" + ".act_end_dt", "act_end_dt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0040_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0040_Del01_INFO = new MCOperationInfo("MG", "MGBBL0040", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0040_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0040_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0040_Del02_INFO = new MCOperationInfo("MG", "MGBBL0040", "Del02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0040_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Del02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd")
			}
			,
			MCBlockDef.create("Del02_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0040_Ins01_INFO = new MCOperationInfo("MG", "MGBBL0040", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0040_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".schd_st_dt", "schd_st_dt"),
				MCItemDef.create("dbc" + ".schd_end_dt", "schd_end_dt"),
				MCItemDef.create("dbc" + ".act_st_dt", "act_st_dt"),
				MCItemDef.create("dbc" + ".act_end_dt", "act_end_dt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0040_Ins02_INFO = new MCOperationInfo("MG", "MGBBL0040", "Ins02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0040_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd")
			}
			,
			MCBlockDef.create("Ins02_Cnd")
		);
	}

	public static MCContainerDef MG_MGBBL0040_Ins02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0040", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("dbc" + ".mfg_act_no", "mfg_act_no"),
				MCItemDef.create("dbc" + ".oper_act_no", "oper_act_no"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".oper_seq", "oper_seq"),
				MCItemDef.create("dbc" + ".disp_seq", "disp_seq"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".schd_st_dt", "schd_st_dt"),
				MCItemDef.create("dbc" + ".schd_end_dt", "schd_end_dt"),
				MCItemDef.create("dbc" + ".act_st_dt", "act_st_dt"),
				MCItemDef.create("dbc" + ".act_end_dt", "act_end_dt"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins02_Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

