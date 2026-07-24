package mcframe.serverMGBB.MGBBL0370;

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
 * [MGBBL_ActSlsIfReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL0370.Srch01.UP.BLOCK0")){
			return MG_MGBBL0370_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Srch01.DOWN.BLOCK0")){
			return MG_MGBBL0370_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Chk01.UP.BLOCK0")){
			return MG_MGBBL0370_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Chk01.UP.BLOCK1")){
			return MG_MGBBL0370_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBBL0370.Chk01.DOWN.BLOCK0")){
			return MG_MGBBL0370_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Chk02.UP.BLOCK0")){
			return MG_MGBBL0370_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Chk02.DOWN.BLOCK0")){
			return MG_MGBBL0370_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Chk03.UP.BLOCK0")){
			return MG_MGBBL0370_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Chk03.DOWN.BLOCK0")){
			return MG_MGBBL0370_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Imp01.UP.BLOCK0")){
			return MG_MGBBL0370_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Imp01.DOWN.BLOCK0")){
			return MG_MGBBL0370_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Upd01.UP.BLOCK0")){
			return MG_MGBBL0370_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Upd01.DOWN.BLOCK0")){
			return MG_MGBBL0370_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Del01.UP.BLOCK0")){
			return MG_MGBBL0370_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Del01.DOWN.BLOCK0")){
			return MG_MGBBL0370_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Del02.UP.BLOCK0")){
			return MG_MGBBL0370_Del02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Ins01.UP.BLOCK0")){
			return MG_MGBBL0370_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Ins02.UP.BLOCK0")){
			return MG_MGBBL0370_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0370.Ins02.UP.BLOCK1")){
			return MG_MGBBL0370_Ins02_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
										
	
	static final MCOperationInfo MG_MGBBL0370_Srch01_INFO = new MCOperationInfo("MG", "MGBBL0370", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0370_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("slip_no", "slip_no"),
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
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("no_ac_rsn_flg", "no_ac_rsn_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_cntry_cd", "cst_cntry_cd"),
				MCItemDef.create("cst_cntry_nm", "cst_cntry_nm"),
				MCItemDef.create("cst_area_cd", "cst_area_cd"),
				MCItemDef.create("cst_area_nm", "cst_area_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("dlv_area_cd", "dlv_area_cd"),
				MCItemDef.create("dlv_area_nm", "dlv_area_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("no_slo_no_flg", "no_slo_no_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("no_iv_no_flg", "no_iv_no_flg"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("no_stk_bp_flg", "no_stk_bp_flg"),
				MCItemDef.create("alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("alc_dpt_nm", "alc_dpt_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("cost_sls_nm1", "cost_sls_nm1"),
				MCItemDef.create("cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("cost_sls_nm2", "cost_sls_nm2"),
				MCItemDef.create("cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("cost_sls_nm3", "cost_sls_nm3"),
				MCItemDef.create("cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("cost_sls_nm4", "cost_sls_nm4"),
				MCItemDef.create("cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("cost_sls_nm5", "cost_sls_nm5"),
				MCItemDef.create("rec_eval_typ", "rec_eval_typ"),
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
				MCItemDef.create("cst_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_nm10", "cst_grp_nm10"),
				MCItemDef.create("dlv_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_nm10", "dlv_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL0370_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
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
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_slip_typ_nm", "ac_slip_typ_nm"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("amt", "amt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_amt_dec_place", "trd_amt_dec_place"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("alc_dpt_nm", "alc_dpt_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("cost_sls_nm1", "cost_sls_nm1"),
				MCItemDef.create("cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("cost_sls_nm2", "cost_sls_nm2"),
				MCItemDef.create("cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("cost_sls_nm3", "cost_sls_nm3"),
				MCItemDef.create("cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("cost_sls_nm4", "cost_sls_nm4"),
				MCItemDef.create("cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("cost_sls_nm5", "cost_sls_nm5"),
				MCItemDef.create("alc_val1", "alc_val1"),
				MCItemDef.create("alc_val2", "alc_val2"),
				MCItemDef.create("alc_val3", "alc_val3"),
				MCItemDef.create("alc_val4", "alc_val4"),
				MCItemDef.create("alc_val5", "alc_val5"),
				MCItemDef.create("rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("rec_eval_typ_nm", "rec_eval_typ_nm"),
				MCItemDef.create("no_pln_flg", "no_pln_flg"),
				MCItemDef.create("no_itm_info_flg", "no_itm_info_flg"),
				MCItemDef.create("no_eval_flg", "no_eval_flg"),
				MCItemDef.create("zero_effect_flg", "zero_effect_flg"),
				MCItemDef.create("slip_no", "slip_no"),
				MCItemDef.create("slip_seq_no", "slip_seq_no"),
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
	
	static final MCOperationInfo MG_MGBBL0370_Chk01_INFO = new MCOperationInfo("MG", "MGBBL0370", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0370_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".ac_dt", "ac_dt"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("dbc" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("dbc" + ".xrate", "xrate"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".slo_no", "slo_no"),
				MCItemDef.create("dbc" + ".iv_no", "iv_no"),
				MCItemDef.create("dbc" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".alc_val1", "alc_val1"),
				MCItemDef.create("dbc" + ".alc_val2", "alc_val2"),
				MCItemDef.create("dbc" + ".alc_val3", "alc_val3"),
				MCItemDef.create("dbc" + ".alc_val4", "alc_val4"),
				MCItemDef.create("dbc" + ".alc_val5", "alc_val5"),
				MCItemDef.create("dbc" + ".rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("dbc" + ".no_pln_flg", "no_pln_flg"),
				MCItemDef.create("dbc" + ".no_itm_info_flg", "no_itm_info_flg"),
				MCItemDef.create("dbc" + ".no_eval_flg", "no_eval_flg"),
				MCItemDef.create("dbc" + ".zero_effect_flg", "zero_effect_flg"),
				MCItemDef.create("dbc" + ".slip_no", "slip_no"),
				MCItemDef.create("dbc" + ".slip_seq_no", "slip_seq_no"),
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

	public static MCContainerDef MG_MGBBL0370_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg"),
				MCItemDef.create("file_ins_flg", "file_ins_flg")
			}
			,
			MCBlockDef.create("Chk01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBBL0370_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".ac_dt", "ac_dt"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("dbc" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("dbc" + ".xrate", "xrate"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".slo_no", "slo_no"),
				MCItemDef.create("dbc" + ".iv_no", "iv_no"),
				MCItemDef.create("dbc" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".alc_val1", "alc_val1"),
				MCItemDef.create("dbc" + ".alc_val2", "alc_val2"),
				MCItemDef.create("dbc" + ".alc_val3", "alc_val3"),
				MCItemDef.create("dbc" + ".alc_val4", "alc_val4"),
				MCItemDef.create("dbc" + ".alc_val5", "alc_val5"),
				MCItemDef.create("dbc" + ".rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("dbc" + ".no_pln_flg", "no_pln_flg"),
				MCItemDef.create("dbc" + ".no_itm_info_flg", "no_itm_info_flg"),
				MCItemDef.create("dbc" + ".no_eval_flg", "no_eval_flg"),
				MCItemDef.create("dbc" + ".zero_effect_flg", "zero_effect_flg"),
				MCItemDef.create("dbc" + ".slip_no", "slip_no"),
				MCItemDef.create("dbc" + ".slip_seq_no", "slip_seq_no"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
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
				MCItemDef.create("trd_amt_dec_place", "trd_amt_dec_place"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("alc_dpt_nm", "alc_dpt_nm"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("cost_sls_nm1", "cost_sls_nm1"),
				MCItemDef.create("cost_sls_nm2", "cost_sls_nm2"),
				MCItemDef.create("cost_sls_nm3", "cost_sls_nm3"),
				MCItemDef.create("cost_sls_nm4", "cost_sls_nm4"),
				MCItemDef.create("cost_sls_nm5", "cost_sls_nm5")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0370_Chk02_INFO = new MCOperationInfo("MG", "MGBBL0370", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0370_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0370_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0370_Chk03_INFO = new MCOperationInfo("MG", "MGBBL0370", "Chk03", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0370_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL0370_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0370_Imp01_INFO = new MCOperationInfo("MG", "MGBBL0370", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0370_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".ac_dt", "ac_dt"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("dbc" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("dbc" + ".xrate", "xrate"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".slo_no", "slo_no"),
				MCItemDef.create("dbc" + ".iv_no", "iv_no"),
				MCItemDef.create("dbc" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".alc_val1", "alc_val1"),
				MCItemDef.create("dbc" + ".alc_val2", "alc_val2"),
				MCItemDef.create("dbc" + ".alc_val3", "alc_val3"),
				MCItemDef.create("dbc" + ".alc_val4", "alc_val4"),
				MCItemDef.create("dbc" + ".alc_val5", "alc_val5"),
				MCItemDef.create("dbc" + ".rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("dbc" + ".no_pln_flg", "no_pln_flg"),
				MCItemDef.create("dbc" + ".no_itm_info_flg", "no_itm_info_flg"),
				MCItemDef.create("dbc" + ".no_eval_flg", "no_eval_flg"),
				MCItemDef.create("dbc" + ".zero_effect_flg", "zero_effect_flg"),
				MCItemDef.create("dbc" + ".slip_no", "slip_no"),
				MCItemDef.create("dbc" + ".slip_seq_no", "slip_seq_no"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0370_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".ac_dt", "ac_dt"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("dbc" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("dbc" + ".xrate", "xrate"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".slo_no", "slo_no"),
				MCItemDef.create("dbc" + ".iv_no", "iv_no"),
				MCItemDef.create("dbc" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".alc_val1", "alc_val1"),
				MCItemDef.create("dbc" + ".alc_val2", "alc_val2"),
				MCItemDef.create("dbc" + ".alc_val3", "alc_val3"),
				MCItemDef.create("dbc" + ".alc_val4", "alc_val4"),
				MCItemDef.create("dbc" + ".alc_val5", "alc_val5"),
				MCItemDef.create("dbc" + ".rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("dbc" + ".no_pln_flg", "no_pln_flg"),
				MCItemDef.create("dbc" + ".no_itm_info_flg", "no_itm_info_flg"),
				MCItemDef.create("dbc" + ".no_eval_flg", "no_eval_flg"),
				MCItemDef.create("dbc" + ".zero_effect_flg", "zero_effect_flg"),
				MCItemDef.create("dbc" + ".slip_no", "slip_no"),
				MCItemDef.create("dbc" + ".slip_seq_no", "slip_seq_no"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
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
				MCItemDef.create("trd_amt_dec_place", "trd_amt_dec_place"),
				MCItemDef.create("ac_slip_typ_nm", "ac_slip_typ_nm"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("alc_dpt_nm", "alc_dpt_nm"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("cost_sls_nm1", "cost_sls_nm1"),
				MCItemDef.create("cost_sls_nm2", "cost_sls_nm2"),
				MCItemDef.create("cost_sls_nm3", "cost_sls_nm3"),
				MCItemDef.create("cost_sls_nm4", "cost_sls_nm4"),
				MCItemDef.create("cost_sls_nm5", "cost_sls_nm5"),
				MCItemDef.create("rec_eval_typ_nm", "rec_eval_typ_nm")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0370_Upd01_INFO = new MCOperationInfo("MG", "MGBBL0370", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0370_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".ac_dt", "ac_dt"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("dbc" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("dbc" + ".xrate", "xrate"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".slo_no", "slo_no"),
				MCItemDef.create("dbc" + ".iv_no", "iv_no"),
				MCItemDef.create("dbc" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".alc_val1", "alc_val1"),
				MCItemDef.create("dbc" + ".alc_val2", "alc_val2"),
				MCItemDef.create("dbc" + ".alc_val3", "alc_val3"),
				MCItemDef.create("dbc" + ".alc_val4", "alc_val4"),
				MCItemDef.create("dbc" + ".alc_val5", "alc_val5"),
				MCItemDef.create("dbc" + ".rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("dbc" + ".no_pln_flg", "no_pln_flg"),
				MCItemDef.create("dbc" + ".no_itm_info_flg", "no_itm_info_flg"),
				MCItemDef.create("dbc" + ".no_eval_flg", "no_eval_flg"),
				MCItemDef.create("dbc" + ".zero_effect_flg", "zero_effect_flg"),
				MCItemDef.create("dbc" + ".slip_no", "slip_no"),
				MCItemDef.create("dbc" + ".slip_seq_no", "slip_seq_no"),
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


	public static MCContainerDef MG_MGBBL0370_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0370_Del01_INFO = new MCOperationInfo("MG", "MGBBL0370", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0370_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0370_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0370_Del02_INFO = new MCOperationInfo("MG", "MGBBL0370", "Del02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0370_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Del02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd")
			}
			,
			MCBlockDef.create("Del02_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0370_Ins01_INFO = new MCOperationInfo("MG", "MGBBL0370", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0370_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".ac_dt", "ac_dt"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("dbc" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("dbc" + ".xrate", "xrate"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".slo_no", "slo_no"),
				MCItemDef.create("dbc" + ".iv_no", "iv_no"),
				MCItemDef.create("dbc" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".alc_val1", "alc_val1"),
				MCItemDef.create("dbc" + ".alc_val2", "alc_val2"),
				MCItemDef.create("dbc" + ".alc_val3", "alc_val3"),
				MCItemDef.create("dbc" + ".alc_val4", "alc_val4"),
				MCItemDef.create("dbc" + ".alc_val5", "alc_val5"),
				MCItemDef.create("dbc" + ".rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("dbc" + ".no_pln_flg", "no_pln_flg"),
				MCItemDef.create("dbc" + ".no_itm_info_flg", "no_itm_info_flg"),
				MCItemDef.create("dbc" + ".no_eval_flg", "no_eval_flg"),
				MCItemDef.create("dbc" + ".zero_effect_flg", "zero_effect_flg"),
				MCItemDef.create("dbc" + ".slip_no", "slip_no"),
				MCItemDef.create("dbc" + ".slip_seq_no", "slip_seq_no"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0370_Ins02_INFO = new MCOperationInfo("MG", "MGBBL0370", "Ins02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0370_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd")
			}
			,
			MCBlockDef.create("Ins02_Cnd")
		);
	}

	public static MCContainerDef MG_MGBBL0370_Ins02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0370", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".data_lno", "data_lno"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".ac_dt", "ac_dt"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("dbc" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".amt", "amt"),
				MCItemDef.create("dbc" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("dbc" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("dbc" + ".xrate", "xrate"),
				MCItemDef.create("dbc" + ".cst_cd", "cst_cd"),
				MCItemDef.create("dbc" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("dbc" + ".sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("dbc" + ".sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dbc" + ".slo_no", "slo_no"),
				MCItemDef.create("dbc" + ".iv_no", "iv_no"),
				MCItemDef.create("dbc" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("dbc" + ".alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("dbc" + ".dest_cd1", "dest_cd1"),
				MCItemDef.create("dbc" + ".dest_cd2", "dest_cd2"),
				MCItemDef.create("dbc" + ".dest_cd3", "dest_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd1", "cost_sls_cd1"),
				MCItemDef.create("dbc" + ".cost_sls_cd2", "cost_sls_cd2"),
				MCItemDef.create("dbc" + ".cost_sls_cd3", "cost_sls_cd3"),
				MCItemDef.create("dbc" + ".cost_sls_cd4", "cost_sls_cd4"),
				MCItemDef.create("dbc" + ".cost_sls_cd5", "cost_sls_cd5"),
				MCItemDef.create("dbc" + ".alc_val1", "alc_val1"),
				MCItemDef.create("dbc" + ".alc_val2", "alc_val2"),
				MCItemDef.create("dbc" + ".alc_val3", "alc_val3"),
				MCItemDef.create("dbc" + ".alc_val4", "alc_val4"),
				MCItemDef.create("dbc" + ".alc_val5", "alc_val5"),
				MCItemDef.create("dbc" + ".rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("dbc" + ".no_pln_flg", "no_pln_flg"),
				MCItemDef.create("dbc" + ".no_itm_info_flg", "no_itm_info_flg"),
				MCItemDef.create("dbc" + ".no_eval_flg", "no_eval_flg"),
				MCItemDef.create("dbc" + ".zero_effect_flg", "zero_effect_flg"),
				MCItemDef.create("dbc" + ".slip_no", "slip_no"),
				MCItemDef.create("dbc" + ".slip_seq_no", "slip_seq_no"),
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

