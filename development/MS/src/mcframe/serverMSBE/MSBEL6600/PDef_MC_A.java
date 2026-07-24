package mcframe.serverMSBE.MSBEL6600;

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
 * [MSBEL_StktkActService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL6600.StktkAct_Srch01.UP.BLOCK0")){
			return MS_MSBEL6600_StktkAct_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6600.StktkAct_Srch01.DOWN.BLOCK0")){
			return MS_MSBEL6600_StktkAct_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6600.StktkAct_Chk01.UP.BLOCK0")){
			return MS_MSBEL6600_StktkAct_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6600.StktkAct_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL6600_StktkAct_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6600.StktkAct_Chk02.UP.BLOCK0")){
			return MS_MSBEL6600_StktkAct_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6600.StktkAct_Chk02.DOWN.BLOCK0")){
			return MS_MSBEL6600_StktkAct_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6600.StktkAct_Upd01.UP.BLOCK0")){
			return MS_MSBEL6600_StktkAct_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6600.StktkAct_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL6600_StktkAct_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6600.StktkAct_Del01.UP.BLOCK0")){
			return MS_MSBEL6600_StktkAct_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL6600.StktkAct_Del01.DOWN.BLOCK0")){
			return MS_MSBEL6600_StktkAct_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBEL6600_StktkAct_Srch01_INFO = new MCOperationInfo("MS", "MSBEL6600", "StktkAct_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6600_StktkAct_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6600", "StktkAct_Srch01",
			new MCItemDef[]{
				MCItemDef.create("stktk_base_dt", "stktk_base_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("stktk_act_no", "stktk_act_no"),
				MCItemDef.create("stktk_act_rmrks", "stktk_act_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("only_enable_flg", "only_enable_flg"),
				MCItemDef.create("inc_entrd_flg", "inc_entrd_flg"),
				MCItemDef.create("only_stktk_flg", "only_stktk_flg"),
				MCItemDef.create("only_diff_flg", "only_diff_flg"),
				MCItemDef.create("only_own_flg", "only_own_flg"),
				MCItemDef.create("only_int_flg", "only_int_flg"),
				MCItemDef.create("itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("StktkAct_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL6600_StktkAct_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6600", "StktkAct_Srch01",
			new MCItemDef[]{
				MCItemDef.create("act_input_flg", "act_input_flg"),
				MCItemDef.create("stktk_base_dt", "stktk_base_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("stktk_amt_flg", "stktk_amt_flg"),
				MCItemDef.create("stktk_tor_disp_flg", "stktk_tor_disp_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("stk_arrv_bp_alt_nm1", "stk_arrv_bp_alt_nm1"),
				MCItemDef.create("stk_arrv_bp_alt_nm2", "stk_arrv_bp_alt_nm2"),
				MCItemDef.create("stk_arrv_bp_alt_nm3", "stk_arrv_bp_alt_nm3"),
				MCItemDef.create("stk_arrv_bp_alt_nm4", "stk_arrv_bp_alt_nm4"),
				MCItemDef.create("cnsgn_stktk_flg", "cnsgn_stktk_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_alt_nm1", "itm_alt_nm1"),
				MCItemDef.create("itm_alt_nm2", "itm_alt_nm2"),
				MCItemDef.create("itm_alt_nm3", "itm_alt_nm3"),
				MCItemDef.create("itm_alt_nm4", "itm_alt_nm4"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_flg", "fix_no_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("in_xfr_typ_nm", "in_xfr_typ_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("stk_bp_alt_nm1", "stk_bp_alt_nm1"),
				MCItemDef.create("stk_bp_alt_nm2", "stk_bp_alt_nm2"),
				MCItemDef.create("stk_bp_alt_nm3", "stk_bp_alt_nm3"),
				MCItemDef.create("stk_bp_alt_nm4", "stk_bp_alt_nm4"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_base_qty", "trd_unit_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("tor_qty", "tor_qty"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("act_diff_qty", "act_diff_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("std_upri", "std_upri"),
				MCItemDef.create("std_cost", "std_cost"),
				MCItemDef.create("act_diff_cost", "act_diff_cost"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("stktk_act_rmrks", "stktk_act_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_itm_spc_flg", "stktk_itm_spc_flg"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("stktkact_upd_cntr", "stktkact_upd_cntr"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("not_new_lot_flg", "not_new_lot_flg"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("StktkAct_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6600_StktkAct_Chk01_INFO = new MCOperationInfo("MS", "MSBEL6600", "StktkAct_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6600_StktkAct_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6600", "StktkAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("act_input_flg", "act_input_flg"),
				MCItemDef.create("stktk_base_dt", "stktk_base_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_make_flg", "lot_make_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_flg", "fix_no_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("tor_qty", "tor_qty"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("act_diff_qty", "act_diff_qty"),
				MCItemDef.create("use_diff_flg", "use_diff_flg"),
				MCItemDef.create("stktk_act_rmrks", "stktk_act_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_itm_spc_flg", "stktk_itm_spc_flg"),
				MCItemDef.create("stktkact_upd_cntr", "stktkact_upd_cntr"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr")
			}
			,
			MCBlockDef.create("StktkAct_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL6600_StktkAct_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6600", "StktkAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("act_input_flg", "act_input_flg"),
				MCItemDef.create("stktk_base_dt", "stktk_base_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("stktk_amt_flg", "stktk_amt_flg"),
				MCItemDef.create("stktk_tor_disp_flg", "stktk_tor_disp_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("cnsgn_stktk_flg", "cnsgn_stktk_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("not_new_lot_flg", "not_new_lot_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("lot_make_flg", "lot_make_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_flg", "fix_no_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("in_xfr_typ_nm", "in_xfr_typ_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_base_qty", "trd_unit_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("tor_qty", "tor_qty"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("act_diff_qty", "act_diff_qty"),
				MCItemDef.create("use_diff_flg", "use_diff_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("std_upri", "std_upri"),
				MCItemDef.create("std_cost", "std_cost"),
				MCItemDef.create("act_diff_cost", "act_diff_cost"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("stktk_act_rmrks", "stktk_act_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_itm_spc_flg", "stktk_itm_spc_flg"),
				MCItemDef.create("stktk_sts_typ", "stktk_sts_typ"),
				MCItemDef.create("stktk_sts_typ_nm", "stktk_sts_typ_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("stktkact_upd_cntr", "stktkact_upd_cntr"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("StktkAct_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6600_StktkAct_Chk02_INFO = new MCOperationInfo("MS", "MSBEL6600", "StktkAct_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6600_StktkAct_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6600", "StktkAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("stktk_base_dt", "stktk_base_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_flg", "fix_no_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("tor_qty", "tor_qty"),
				MCItemDef.create("stktk_itm_spc_flg", "stktk_itm_spc_flg")
			}
			,
			MCBlockDef.create("StktkAct_Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL6600_StktkAct_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6600", "StktkAct_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("stktk_base_dt", "stktk_base_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_flg", "fix_no_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("tor_qty", "tor_qty"),
				MCItemDef.create("stktk_itm_spc_flg", "stktk_itm_spc_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("StktkAct_Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6600_StktkAct_Upd01_INFO = new MCOperationInfo("MS", "MSBEL6600", "StktkAct_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6600_StktkAct_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6600", "StktkAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("act_input_flg", "act_input_flg"),
				MCItemDef.create("stktk_base_dt", "stktk_base_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_make_flg", "lot_make_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_flg", "fix_no_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("tor_qty", "tor_qty"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("act_diff_qty", "act_diff_qty"),
				MCItemDef.create("use_diff_flg", "use_diff_flg"),
				MCItemDef.create("stktk_act_rmrks", "stktk_act_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("stktk_itm_spc_flg", "stktk_itm_spc_flg"),
				MCItemDef.create("stktkact_upd_cntr", "stktkact_upd_cntr"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr")
			}
			,
			MCBlockDef.create("StktkAct_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL6600_StktkAct_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6600", "StktkAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("StktkAct_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL6600_StktkAct_Del01_INFO = new MCOperationInfo("MS", "MSBEL6600", "StktkAct_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL6600_StktkAct_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6600", "StktkAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("stktk_base_dt", "stktk_base_dt"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_no_flg", "fix_no_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("tor_qty", "tor_qty"),
				MCItemDef.create("stktk_itm_spc_flg", "stktk_itm_spc_flg"),
				MCItemDef.create("stktkact_upd_cntr", "stktkact_upd_cntr"),
				MCItemDef.create("stktk_upd_cntr", "stktk_upd_cntr")
			}
			,
			MCBlockDef.create("StktkAct_Del01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL6600_StktkAct_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL6600", "StktkAct_Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("StktkAct_Del01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

