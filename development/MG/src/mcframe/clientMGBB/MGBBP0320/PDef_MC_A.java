package mcframe.clientMGBB.MGBBP0320;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MGBBP_ActInptIfReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL0320.Srch01.UP.BLOCK0")){
			return MG_MGBBL0320_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0320.Srch01.DOWN.BLOCK0")){
			return MG_MGBBL0320_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0320.Upd01.UP.BLOCK0")){
			return MG_MGBBL0320_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0320.Upd01.DOWN.BLOCK0")){
			return MG_MGBBL0320_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0320.Del01.UP.BLOCK0")){
			return MG_MGBBL0320_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0320.Del01.DOWN.BLOCK0")){
			return MG_MGBBL0320_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0320.Del02.UP.BLOCK0")){
			return MG_MGBBL0320_Del02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0320.Imp01.UP.BLOCK0")){
			return MG_MGBBL0320_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0320.Imp01.DOWN.BLOCK0")){
			return MG_MGBBL0320_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0320.Ins01.UP.BLOCK0")){
			return MG_MGBBL0320_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0320.Ins02.UP.BLOCK0")){
			return MG_MGBBL0320_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0320.Ins02.UP.BLOCK1")){
			return MG_MGBBL0320_Ins02_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MG_MGBBL0320_Srch01_INFO = new MCOperationInfo("MG", "MGBBL0320", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0320_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBBL0320", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("par_itm_typ_p" + ".itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_p" + ".itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_p" + ".itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("par_itm_jnl_cd", "par_itm_jnl_cd"),
				MCItemDef.create("par_itm_jnl_nm", "par_itm_jnl_nm"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_p" + ".itm_nm", "par_itm_nm"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("slip_no", "slip_no"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
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
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("no_stk_bp_flg", "no_stk_bp_flg"),
				MCItemDef.create("rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("par_itm_grp_cd1", "par_itm_grp_cd1"),
				MCItemDef.create("par_itm_grp_nm1", "par_itm_grp_nm1"),
				MCItemDef.create("par_itm_grp_cd2", "par_itm_grp_cd2"),
				MCItemDef.create("par_itm_grp_nm2", "par_itm_grp_nm2"),
				MCItemDef.create("par_itm_grp_cd3", "par_itm_grp_cd3"),
				MCItemDef.create("par_itm_grp_nm3", "par_itm_grp_nm3"),
				MCItemDef.create("par_itm_grp_cd4", "par_itm_grp_cd4"),
				MCItemDef.create("par_itm_grp_nm4", "par_itm_grp_nm4"),
				MCItemDef.create("par_itm_grp_cd5", "par_itm_grp_cd5"),
				MCItemDef.create("par_itm_grp_nm5", "par_itm_grp_nm5"),
				MCItemDef.create("par_itm_grp_cd6", "par_itm_grp_cd6"),
				MCItemDef.create("par_itm_grp_nm6", "par_itm_grp_nm6"),
				MCItemDef.create("par_itm_grp_cd7", "par_itm_grp_cd7"),
				MCItemDef.create("par_itm_grp_nm7", "par_itm_grp_nm7"),
				MCItemDef.create("par_itm_grp_cd8", "par_itm_grp_cd8"),
				MCItemDef.create("par_itm_grp_nm8", "par_itm_grp_nm8"),
				MCItemDef.create("par_itm_grp_cd9", "par_itm_grp_cd9"),
				MCItemDef.create("par_itm_grp_nm9", "par_itm_grp_nm9"),
				MCItemDef.create("par_itm_grp_cd10", "par_itm_grp_cd10"),
				MCItemDef.create("par_itm_grp_nm10", "par_itm_grp_nm10"),
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
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL0320_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBBL0320", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_p" + ".itm_nm", "par_itm_nm"),
				MCItemDef.create("par_itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_nm", "par_itm_typ_nm"),
				MCItemDef.create("par_itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("par_itm_jnl_cd", "par_itm_jnl_cd"),
				MCItemDef.create("par_itm_jnl_nm", "par_itm_jnl_nm"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_slip_typ_nm", "ac_slip_typ_nm"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("qty_p" + ".qty", "qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_amt_dec_place", "trd_amt_dec_place"),
				MCItemDef.create("trd_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("amt_p" + ".amt", "amt"),
				MCItemDef.create("rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("rec_eval_typ_nm", "rec_eval_typ_nm"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("expns_nm", "expns_nm"),
				MCItemDef.create("no_pln_flg", "no_pln_flg"),
				MCItemDef.create("no_itm_info_flg", "no_itm_info_flg"),
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
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0320_Upd01_INFO = new MCOperationInfo("MG", "MGBBL0320", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0320_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBBL0320", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("qty_p" + ".qty", "qty"),
				MCItemDef.create("amt_p" + ".amt", "amt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("no_pln_flg", "no_pln_flg"),
				MCItemDef.create("no_itm_info_flg", "no_itm_info_flg"),
				MCItemDef.create("zero_effect_flg", "zero_effect_flg"),
				MCItemDef.create("slip_no", "slip_no"),
				MCItemDef.create("slip_seq_no", "slip_seq_no"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0320_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBBL0320", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0320_Del01_INFO = new MCOperationInfo("MG", "MGBBL0320", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0320_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBBL0320", "Del01",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0320_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBBL0320", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0320_Del02_INFO = new MCOperationInfo("MG", "MGBBL0320", "Del02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0320_Del02_UP_BLOCK0() {
		/** Ope.のBlock [Del02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBBL0320", "Del02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("DelCnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0320_Imp01_INFO = new MCOperationInfo("MG", "MGBBL0320", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0320_Imp01_UP_BLOCK0() {
		/** Ope.のBlock [Imp01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBBL0320", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("qty_p" + ".qty", "qty"),
				MCItemDef.create("amt_p" + ".amt", "amt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("no_pln_flg", "no_pln_flg"),
				MCItemDef.create("no_itm_info_flg", "no_itm_info_flg"),
				MCItemDef.create("zero_effect_flg", "zero_effect_flg"),
				MCItemDef.create("slip_no", "slip_no"),
				MCItemDef.create("slip_seq_no", "slip_seq_no"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0320_Imp01_DOWN_BLOCK0() {
	/** Ope.のBlock [Imp01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBBL0320", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("qty_p" + ".qty", "qty"),
				MCItemDef.create("amt_p" + ".amt", "amt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("no_pln_flg", "no_pln_flg"),
				MCItemDef.create("no_itm_info_flg", "no_itm_info_flg"),
				MCItemDef.create("zero_effect_flg", "zero_effect_flg"),
				MCItemDef.create("slip_no", "slip_no"),
				MCItemDef.create("slip_seq_no", "slip_seq_no"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("par_itm_p" + ".itm_nm", "par_itm_nm"),
				MCItemDef.create("par_itm_typ", "par_itm_typ"),
				MCItemDef.create("par_itm_typ_nm", "par_itm_typ_nm"),
				MCItemDef.create("par_itm_typ_d_cd", "par_itm_typ_d_cd"),
				MCItemDef.create("par_itm_typ_d_nm", "par_itm_typ_d_nm"),
				MCItemDef.create("par_itm_jnl_cd", "par_itm_jnl_cd"),
				MCItemDef.create("par_itm_jnl_nm", "par_itm_jnl_nm"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("ac_slip_typ_nm", "ac_slip_typ_nm"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_amt_dec_place", "trd_amt_dec_place"),
				MCItemDef.create("rec_eval_typ_nm", "rec_eval_typ_nm"),
				MCItemDef.create("expns_nm", "expns_nm")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0320_Ins01_INFO = new MCOperationInfo("MG", "MGBBL0320", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0320_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBBL0320", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("qty_p" + ".qty", "qty"),
				MCItemDef.create("amt_p" + ".amt", "amt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("no_pln_flg", "no_pln_flg"),
				MCItemDef.create("no_itm_info_flg", "no_itm_info_flg"),
				MCItemDef.create("zero_effect_flg", "zero_effect_flg"),
				MCItemDef.create("slip_no", "slip_no"),
				MCItemDef.create("slip_seq_no", "slip_seq_no"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0320_Ins02_INFO = new MCOperationInfo("MG", "MGBBL0320", "Ins02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0320_Ins02_UP_BLOCK0() {
		/** Ope.のBlock [Ins02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBBL0320", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("DelCnd")
		);
	}

	public static MCContainerDef MG_MGBBL0320_Ins02_UP_BLOCK1() {
		/** Ope.のBlock [Ins02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBBL0320", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("par_itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("qty_p" + ".qty", "qty"),
				MCItemDef.create("amt_p" + ".amt", "amt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("rec_eval_typ", "rec_eval_typ"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("no_pln_flg", "no_pln_flg"),
				MCItemDef.create("no_itm_info_flg", "no_itm_info_flg"),
				MCItemDef.create("zero_effect_flg", "zero_effect_flg"),
				MCItemDef.create("slip_no", "slip_no"),
				MCItemDef.create("slip_seq_no", "slip_seq_no"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

