package mcframe.clientMABG.MABGP0010;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABGP_CoParmReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABGL0010.Srch01.UP.BLOCK0")){
			return MA_MABGL0010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0010.Srch01.DOWN.BLOCK0")){
			return MA_MABGL0010_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABGL0010.Upd01.UP.BLOCK0")){
			return MA_MABGL0010_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0010.Del01.UP.BLOCK0")){
			return MA_MABGL0010_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABGL0010_Srch01_INFO = new MCOperationInfo("MA", "MABGL0010", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0010_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("co_nm", "co_nm"),
				MCItemDef.create("this_term", "this_term")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABGL0010_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("std_rnd_typ", "std_rnd_typ"),
				MCItemDef.create("std_rnd_typ_nm", "std_rnd_typ_nm"),
				MCItemDef.create("std_dec_place", "std_dec_place"),
				MCItemDef.create("amt_rnd_typ", "amt_rnd_typ"),
				MCItemDef.create("amt_rnd_typ_nm", "amt_rnd_typ_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("ave_rnd_typ", "ave_rnd_typ"),
				MCItemDef.create("ave_rnd_typ_nm", "ave_rnd_typ_nm"),
				MCItemDef.create("ave_dec_place", "ave_dec_place"),
				MCItemDef.create("adj_typ", "adj_typ"),
				MCItemDef.create("adj_typ_nm", "adj_typ_nm"),
				MCItemDef.create("mrgn_expns_cd", "mrgn_expns_cd"),
				MCItemDef.create("mrgn_expns_nm", "mrgn_expns_nm"),
				MCItemDef.create("purc_expns_cd", "purc_expns_cd"),
				MCItemDef.create("purc_expns_nm", "purc_expns_nm"),
				MCItemDef.create("out_expns_cd", "out_expns_cd"),
				MCItemDef.create("out_expns_nm", "out_expns_nm"),
				MCItemDef.create("inpt_expns_cd", "inpt_expns_cd"),
				MCItemDef.create("inpt_expns_nm", "inpt_expns_nm"),
				MCItemDef.create("ss_expns_cd", "ss_expns_cd"),
				MCItemDef.create("ss_expns_nm", "ss_expns_nm"),
				MCItemDef.create("prov_expns_cd", "prov_expns_cd"),
				MCItemDef.create("prov_expns_nm", "prov_expns_nm"),
				MCItemDef.create("pre_alc_max_lvl", "pre_alc_max_lvl"),
				MCItemDef.create("pre_alc_max_rec", "pre_alc_max_rec"),
				MCItemDef.create("diff_use_typ", "diff_use_typ"),
				MCItemDef.create("diff_use_typ_nm", "diff_use_typ_nm"),
				MCItemDef.create("lot_use_typ", "lot_use_typ"),
				MCItemDef.create("lot_use_typ_nm", "lot_use_typ_nm"),
				MCItemDef.create("sublot_use_typ", "sublot_use_typ"),
				MCItemDef.create("sublot_use_typ_nm", "sublot_use_typ_nm"),
				MCItemDef.create("sno1_use_typ", "sno1_use_typ"),
				MCItemDef.create("sno1_use_typ_nm", "sno1_use_typ_nm"),
				MCItemDef.create("sno2_use_typ", "sno2_use_typ"),
				MCItemDef.create("sno2_use_typ_nm", "sno2_use_typ_nm"),
				MCItemDef.create("sno3_use_typ", "sno3_use_typ"),
				MCItemDef.create("sno3_use_typ_nm", "sno3_use_typ_nm"),
				MCItemDef.create("sno4_use_typ", "sno4_use_typ"),
				MCItemDef.create("sno4_use_typ_nm", "sno4_use_typ_nm"),
				MCItemDef.create("def_calc_ctg_cd", "def_calc_ctg_cd"),
				MCItemDef.create("def_calc_ctg_nm", "def_calc_ctg_nm"),
				MCItemDef.create("fix_dpt_cd", "fix_dpt_cd"),
				MCItemDef.create("fix_dpt_nm", "fix_dpt_nm"),
				MCItemDef.create("trd_ratio_flg", "trd_ratio_flg"),
				MCItemDef.create("stop_slip_flg", "stop_slip_flg"),
				MCItemDef.create("non_prod_flg", "non_prod_flg"),
				MCItemDef.create("oper_sum_flg", "oper_sum_flg"),
				MCItemDef.create("non_sls_flg", "non_sls_flg"),
				MCItemDef.create("asst_flg", "asst_flg"),
				MCItemDef.create("stk_bp_flg", "stk_bp_flg"),
				MCItemDef.create("non_transit_flg", "non_transit_flg"),
				MCItemDef.create("wg_non_mov_flg", "wg_non_mov_flg"),
				MCItemDef.create("lot_non_mov_flg", "lot_non_mov_flg"),
				MCItemDef.create("sublot_non_mov_flg", "sublot_non_mov_flg"),
				MCItemDef.create("sno1_non_mov_flg", "sno1_non_mov_flg"),
				MCItemDef.create("sno2_non_mov_flg", "sno2_non_mov_flg"),
				MCItemDef.create("sno3_non_mov_flg", "sno3_non_mov_flg"),
				MCItemDef.create("sno4_non_mov_flg", "sno4_non_mov_flg"),
				MCItemDef.create("tmp_dpt_cd", "tmp_dpt_cd"),
				MCItemDef.create("tmp_dpt_nm", "tmp_dpt_nm"),
				MCItemDef.create("act_trd_calc_ctg_cd", "act_trd_calc_ctg_cd"),
				MCItemDef.create("act_trd_calc_ctg_nm", "act_trd_calc_ctg_nm"),
				MCItemDef.create("chk_mst_flg", "chk_mst_flg"),
				MCItemDef.create("stktk_sum_flg", "stktk_sum_flg"),
				MCItemDef.create("oth_ccn_sum_flg", "oth_ccn_sum_flg"),
				MCItemDef.create("std_disp_digit", "std_disp_digit"),
				MCItemDef.create("amt_disp_digit", "amt_disp_digit"),
				MCItemDef.create("unit_disp_digit", "unit_disp_digit"),
				MCItemDef.create("rate_disp_digit", "rate_disp_digit"),
				MCItemDef.create("excel_pln_flg", "excel_pln_flg"),
				MCItemDef.create("excel_act_flg", "excel_act_flg"),
				MCItemDef.create("excel_alc_flg", "excel_alc_flg"),
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
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0010_Upd01_INFO = new MCOperationInfo("MA", "MABGL0010", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0010_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("std_rnd_typ", "std_rnd_typ"),
				MCItemDef.create("std_dec_place", "std_dec_place"),
				MCItemDef.create("amt_rnd_typ", "amt_rnd_typ"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("ave_rnd_typ", "ave_rnd_typ"),
				MCItemDef.create("ave_dec_place", "ave_dec_place"),
				MCItemDef.create("adj_typ", "adj_typ"),
				MCItemDef.create("mrgn_expns_cd", "mrgn_expns_cd"),
				MCItemDef.create("purc_expns_cd", "purc_expns_cd"),
				MCItemDef.create("out_expns_cd", "out_expns_cd"),
				MCItemDef.create("inpt_expns_cd", "inpt_expns_cd"),
				MCItemDef.create("ss_expns_cd", "ss_expns_cd"),
				MCItemDef.create("prov_expns_cd", "prov_expns_cd"),
				MCItemDef.create("pre_alc_max_lvl", "pre_alc_max_lvl"),
				MCItemDef.create("pre_alc_max_rec", "pre_alc_max_rec"),
				MCItemDef.create("diff_use_typ", "diff_use_typ"),
				MCItemDef.create("lot_use_typ", "lot_use_typ"),
				MCItemDef.create("sublot_use_typ", "sublot_use_typ"),
				MCItemDef.create("sno1_use_typ", "sno1_use_typ"),
				MCItemDef.create("sno2_use_typ", "sno2_use_typ"),
				MCItemDef.create("sno3_use_typ", "sno3_use_typ"),
				MCItemDef.create("sno4_use_typ", "sno4_use_typ"),
				MCItemDef.create("def_calc_ctg_cd", "def_calc_ctg_cd"),
				MCItemDef.create("fix_dpt_cd", "fix_dpt_cd"),
				MCItemDef.create("trd_ratio_flg", "trd_ratio_flg"),
				MCItemDef.create("stop_slip_flg", "stop_slip_flg"),
				MCItemDef.create("non_prod_flg", "non_prod_flg"),
				MCItemDef.create("oper_sum_flg", "oper_sum_flg"),
				MCItemDef.create("non_sls_flg", "non_sls_flg"),
				MCItemDef.create("asst_flg", "asst_flg"),
				MCItemDef.create("stk_bp_flg", "stk_bp_flg"),
				MCItemDef.create("non_transit_flg", "non_transit_flg"),
				MCItemDef.create("wg_non_mov_flg", "wg_non_mov_flg"),
				MCItemDef.create("lot_non_mov_flg", "lot_non_mov_flg"),
				MCItemDef.create("sublot_non_mov_flg", "sublot_non_mov_flg"),
				MCItemDef.create("sno1_non_mov_flg", "sno1_non_mov_flg"),
				MCItemDef.create("sno2_non_mov_flg", "sno2_non_mov_flg"),
				MCItemDef.create("sno3_non_mov_flg", "sno3_non_mov_flg"),
				MCItemDef.create("sno4_non_mov_flg", "sno4_non_mov_flg"),
				MCItemDef.create("tmp_dpt_cd", "tmp_dpt_cd"),
				MCItemDef.create("act_trd_calc_ctg_cd", "act_trd_calc_ctg_cd"),
				MCItemDef.create("chk_mst_flg", "chk_mst_flg"),
				MCItemDef.create("stktk_sum_flg", "stktk_sum_flg"),
				MCItemDef.create("oth_ccn_sum_flg", "oth_ccn_sum_flg"),
				MCItemDef.create("std_disp_digit", "std_disp_digit"),
				MCItemDef.create("amt_disp_digit", "amt_disp_digit"),
				MCItemDef.create("unit_disp_digit", "unit_disp_digit"),
				MCItemDef.create("rate_disp_digit", "rate_disp_digit"),
				MCItemDef.create("excel_pln_flg", "excel_pln_flg"),
				MCItemDef.create("excel_act_flg", "excel_act_flg"),
				MCItemDef.create("excel_alc_flg", "excel_alc_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0010_Del01_INFO = new MCOperationInfo("MA", "MABGL0010", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0010_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

