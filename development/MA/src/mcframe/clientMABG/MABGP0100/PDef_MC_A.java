package mcframe.clientMABG.MABGP0100;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABGP_CalcPtnReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABGL0100.Srch01.UP.BLOCK0")){
			return MA_MABGL0100_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0100.Srch01.DOWN.BLOCK0")){
			return MA_MABGL0100_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABGL0100.Srch01.DOWN.BLOCK1")){
			return MA_MABGL0100_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABGL0100.Upd01.UP.BLOCK0")){
			return MA_MABGL0100_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0100.Upd01.UP.BLOCK1")){
			return MA_MABGL0100_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABGL0100.Del01.UP.BLOCK0")){
			return MA_MABGL0100_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABGL0100_Srch01_INFO = new MCOperationInfo("MA", "MABGL0100", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0100_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ptn_cd", "calc_ptn_cd"),
				MCItemDef.create("calc_ptn_nm", "calc_ptn_nm_lcl"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABGL0100_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("calc_ptn_cd", "calc_ptn_cd"),
				MCItemDef.create("calc_ptn_nm_lcl", "calc_ptn_nm_lcl"),
				MCItemDef.create("calc_ptn_nm", "calc_ptn_nm"),
				MCItemDef.create("mfg_purc_typ", "mfg_purc_typ"),
				MCItemDef.create("mfg_purc_typ_nm", "mfg_purc_typ_nm"),
				MCItemDef.create("eval_typ", "eval_typ"),
				MCItemDef.create("eval_typ_nm", "eval_typ_nm"),
				MCItemDef.create("dpt_typ", "dpt_typ"),
				MCItemDef.create("dpt_typ_nm", "dpt_typ_nm"),
				MCItemDef.create("lot_typ", "lot_typ"),
				MCItemDef.create("lot_typ_nm", "lot_typ_nm"),
				MCItemDef.create("sublot_typ", "sublot_typ"),
				MCItemDef.create("sublot_typ_nm", "sublot_typ_nm"),
				MCItemDef.create("sno1_typ", "sno1_typ"),
				MCItemDef.create("sno1_typ_nm", "sno1_typ_nm"),
				MCItemDef.create("sno2_typ", "sno2_typ"),
				MCItemDef.create("sno2_typ_nm", "sno2_typ_nm"),
				MCItemDef.create("sno3_typ", "sno3_typ"),
				MCItemDef.create("sno3_typ_nm", "sno3_typ_nm"),
				MCItemDef.create("sno4_typ", "sno4_typ"),
				MCItemDef.create("sno4_typ_nm", "sno4_typ_nm"),
				MCItemDef.create("lot_act_typ", "lot_act_typ"),
				MCItemDef.create("lot_act_typ_nm", "lot_act_typ_nm"),
				MCItemDef.create("sublot_act_typ", "sublot_act_typ"),
				MCItemDef.create("sublot_act_typ_nm", "sublot_act_typ_nm"),
				MCItemDef.create("sno1_act_typ", "sno1_act_typ"),
				MCItemDef.create("sno1_act_typ_nm", "sno1_act_typ_nm"),
				MCItemDef.create("sno2_act_typ", "sno2_act_typ"),
				MCItemDef.create("sno2_act_typ_nm", "sno2_act_typ_nm"),
				MCItemDef.create("sno3_act_typ", "sno3_act_typ"),
				MCItemDef.create("sno3_act_typ_nm", "sno3_act_typ_nm"),
				MCItemDef.create("sno4_act_typ", "sno4_act_typ"),
				MCItemDef.create("sno4_act_typ_nm", "sno4_act_typ_nm"),
				MCItemDef.create("itm_mfg_inst_no_set_typ", "itm_mfg_inst_no_set_typ"),
				MCItemDef.create("itm_mfg_inst_no_set_typ_nm", "itm_mfg_inst_no_set_typ_nm"),
				MCItemDef.create("mfg_act_no_set_typ", "mfg_act_no_set_typ"),
				MCItemDef.create("mfg_act_no_set_typ_nm", "mfg_act_no_set_typ_nm"),
				MCItemDef.create("oper_act_no_set_typ", "oper_act_no_set_typ"),
				MCItemDef.create("oper_act_no_set_typ_nm", "oper_act_no_set_typ_nm"),
				MCItemDef.create("lot_exp_typ", "lot_exp_typ"),
				MCItemDef.create("lot_exp_typ_nm", "lot_exp_typ_nm"),
				MCItemDef.create("sublot_exp_typ", "sublot_exp_typ"),
				MCItemDef.create("sublot_exp_typ_nm", "sublot_exp_typ_nm"),
				MCItemDef.create("sno1_exp_typ", "sno1_exp_typ"),
				MCItemDef.create("sno1_exp_typ_nm", "sno1_exp_typ_nm"),
				MCItemDef.create("sno2_exp_typ", "sno2_exp_typ"),
				MCItemDef.create("sno2_exp_typ_nm", "sno2_exp_typ_nm"),
				MCItemDef.create("sno3_exp_typ", "sno3_exp_typ"),
				MCItemDef.create("sno3_exp_typ_nm", "sno3_exp_typ_nm"),
				MCItemDef.create("sno4_exp_typ", "sno4_exp_typ"),
				MCItemDef.create("sno4_exp_typ_nm", "sno4_exp_typ_nm"),
				MCItemDef.create("dpt_loss_eval_typ", "dpt_loss_eval_typ"),
				MCItemDef.create("dpt_loss_eval_typ_nm", "dpt_loss_eval_typ_nm"),
				MCItemDef.create("lot_loss_eval_typ", "lot_loss_eval_typ"),
				MCItemDef.create("lot_loss_eval_typ_nm", "lot_loss_eval_typ_nm"),
				MCItemDef.create("sublot_loss_eval_typ", "sublot_loss_eval_typ"),
				MCItemDef.create("sublot_loss_eval_typ_nm", "sublot_loss_eval_typ_nm"),
				MCItemDef.create("sno1_loss_eval_typ", "sno1_loss_eval_typ"),
				MCItemDef.create("sno1_loss_eval_typ_nm", "sno1_loss_eval_typ_nm"),
				MCItemDef.create("sno2_loss_eval_typ", "sno2_loss_eval_typ"),
				MCItemDef.create("sno2_loss_eval_typ_nm", "sno2_loss_eval_typ_nm"),
				MCItemDef.create("sno3_loss_eval_typ", "sno3_loss_eval_typ"),
				MCItemDef.create("sno3_loss_eval_typ_nm", "sno3_loss_eval_typ_nm"),
				MCItemDef.create("sno4_loss_eval_typ", "sno4_loss_eval_typ"),
				MCItemDef.create("sno4_loss_eval_typ_nm", "sno4_loss_eval_typ_nm"),
				MCItemDef.create("asst_loss_eval_typ", "asst_loss_eval_typ"),
				MCItemDef.create("asst_loss_eval_typ_nm", "asst_loss_eval_typ_nm"),
				MCItemDef.create("std_rnd_typ", "std_rnd_typ"),
				MCItemDef.create("std_rnd_typ_nm", "std_rnd_typ_nm"),
				MCItemDef.create("std_dec_place", "std_dec_place"),
				MCItemDef.create("ave_rnd_typ", "ave_rnd_typ"),
				MCItemDef.create("ave_rnd_typ_nm", "ave_rnd_typ_nm"),
				MCItemDef.create("ave_dec_place", "ave_dec_place"),
				MCItemDef.create("adj_typ", "adj_typ"),
				MCItemDef.create("adj_typ_nm", "adj_typ_nm"),
				MCItemDef.create("wip_typ", "wip_typ"),
				MCItemDef.create("wip_typ_nm", "wip_typ_nm"),
				MCItemDef.create("bd_agg_typ", "bd_agg_typ"),
				MCItemDef.create("bd_agg_typ_nm", "bd_agg_typ_nm"),
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
				MCItemDef.create("exp_alloc_typ", "exp_alloc_typ"),
				MCItemDef.create("exp_alloc_typ_nm", "exp_alloc_typ_nm"),
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
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MA_MABGL0100_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ptn_cd", "calc_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("calc_ptn_nm", "calc_ptn_nm"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("LclAll")
		);
	}
	
	static final MCOperationInfo MA_MABGL0100_Upd01_INFO = new MCOperationInfo("MA", "MABGL0100", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0100_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_ptn_cd", "calc_ptn_cd"),
				MCItemDef.create("calc_ptn_nm", "calc_ptn_nm"),
				MCItemDef.create("mfg_purc_typ", "mfg_purc_typ"),
				MCItemDef.create("eval_typ", "eval_typ"),
				MCItemDef.create("dpt_typ", "dpt_typ"),
				MCItemDef.create("lot_typ", "lot_typ"),
				MCItemDef.create("sublot_typ", "sublot_typ"),
				MCItemDef.create("sno1_typ", "sno1_typ"),
				MCItemDef.create("sno2_typ", "sno2_typ"),
				MCItemDef.create("sno3_typ", "sno3_typ"),
				MCItemDef.create("sno4_typ", "sno4_typ"),
				MCItemDef.create("lot_act_typ", "lot_act_typ"),
				MCItemDef.create("sublot_act_typ", "sublot_act_typ"),
				MCItemDef.create("sno1_act_typ", "sno1_act_typ"),
				MCItemDef.create("sno2_act_typ", "sno2_act_typ"),
				MCItemDef.create("sno3_act_typ", "sno3_act_typ"),
				MCItemDef.create("sno4_act_typ", "sno4_act_typ"),
				MCItemDef.create("itm_mfg_inst_no_set_typ", "itm_mfg_inst_no_set_typ"),
				MCItemDef.create("mfg_act_no_set_typ", "mfg_act_no_set_typ"),
				MCItemDef.create("oper_act_no_set_typ", "oper_act_no_set_typ"),
				MCItemDef.create("lot_exp_typ", "lot_exp_typ"),
				MCItemDef.create("sublot_exp_typ", "sublot_exp_typ"),
				MCItemDef.create("sno1_exp_typ", "sno1_exp_typ"),
				MCItemDef.create("sno2_exp_typ", "sno2_exp_typ"),
				MCItemDef.create("sno3_exp_typ", "sno3_exp_typ"),
				MCItemDef.create("sno4_exp_typ", "sno4_exp_typ"),
				MCItemDef.create("dpt_loss_eval_typ", "dpt_loss_eval_typ"),
				MCItemDef.create("lot_loss_eval_typ", "lot_loss_eval_typ"),
				MCItemDef.create("sublot_loss_eval_typ", "sublot_loss_eval_typ"),
				MCItemDef.create("sno1_loss_eval_typ", "sno1_loss_eval_typ"),
				MCItemDef.create("sno2_loss_eval_typ", "sno2_loss_eval_typ"),
				MCItemDef.create("sno3_loss_eval_typ", "sno3_loss_eval_typ"),
				MCItemDef.create("sno4_loss_eval_typ", "sno4_loss_eval_typ"),
				MCItemDef.create("asst_loss_eval_typ", "asst_loss_eval_typ"),
				MCItemDef.create("std_rnd_typ", "std_rnd_typ"),
				MCItemDef.create("std_dec_place", "std_dec_place"),
				MCItemDef.create("ave_rnd_typ", "ave_rnd_typ"),
				MCItemDef.create("ave_dec_place", "ave_dec_place"),
				MCItemDef.create("adj_typ", "adj_typ"),
				MCItemDef.create("wip_typ", "wip_typ"),
				MCItemDef.create("bd_agg_typ", "bd_agg_typ"),
				MCItemDef.create("mrgn_expns_cd", "mrgn_expns_cd"),
				MCItemDef.create("purc_expns_cd", "purc_expns_cd"),
				MCItemDef.create("out_expns_cd", "out_expns_cd"),
				MCItemDef.create("inpt_expns_cd", "inpt_expns_cd"),
				MCItemDef.create("ss_expns_cd", "ss_expns_cd"),
				MCItemDef.create("prov_expns_cd", "prov_expns_cd"),
				MCItemDef.create("exp_alloc_typ", "exp_alloc_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MA_MABGL0100_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("calc_ptn_cd", "calc_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("calc_ptn_nm", "calc_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LclAll")
		);
	}
	
	static final MCOperationInfo MA_MABGL0100_Del01_INFO = new MCOperationInfo("MA", "MABGL0100", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0100_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0100", "Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_ptn_cd", "calc_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

