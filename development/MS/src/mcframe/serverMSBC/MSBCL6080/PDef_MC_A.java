package mcframe.serverMSBC.MSBCL6080;

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
 * [MSBCL_MfgActRcptIFService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.UP.BLOCK0")){
			return MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.UP.BLOCK1")){
			return MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.UP.BLOCK2")){
			return MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.UP.BLOCK3")){
			return MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.UP.BLOCK4")){
			return MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.UP.BLOCK5")){
			return MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.UP.BLOCK6")){
			return MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK6();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.UP.BLOCK7")){
			return MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK7();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.UP.BLOCK8")){
			return MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK8();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.DOWN.BLOCK0")){
			return MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.DOWN.BLOCK1")){
			return MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.DOWN.BLOCK2")){
			return MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.DOWN.BLOCK3")){
			return MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.DOWN.BLOCK4")){
			return MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.DOWN.BLOCK5")){
			return MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd01.DOWN.BLOCK6")){
			return MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK6();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Del01.UP.BLOCK0")){
			return MS_MSBCL6080_MfgActIF_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Del01.UP.BLOCK1")){
			return MS_MSBCL6080_MfgActIF_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Del01.UP.BLOCK2")){
			return MS_MSBCL6080_MfgActIF_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Del01.UP.BLOCK3")){
			return MS_MSBCL6080_MfgActIF_Del01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Del01.UP.BLOCK4")){
			return MS_MSBCL6080_MfgActIF_Del01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Del01.DOWN.BLOCK0")){
			return MS_MSBCL6080_MfgActIF_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd02.UP.BLOCK0")){
			return MS_MSBCL6080_MfgActIF_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd02.UP.BLOCK1")){
			return MS_MSBCL6080_MfgActIF_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd02.DOWN.BLOCK0")){
			return MS_MSBCL6080_MfgActIF_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Del02.UP.BLOCK0")){
			return MS_MSBCL6080_MfgActIF_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Del02.UP.BLOCK1")){
			return MS_MSBCL6080_MfgActIF_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Del02.DOWN.BLOCK0")){
			return MS_MSBCL6080_MfgActIF_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd03.UP.BLOCK0")){
			return MS_MSBCL6080_MfgActIF_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd03.UP.BLOCK1")){
			return MS_MSBCL6080_MfgActIF_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd03.UP.BLOCK2")){
			return MS_MSBCL6080_MfgActIF_Upd03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd03.UP.BLOCK3")){
			return MS_MSBCL6080_MfgActIF_Upd03_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd03.DOWN.BLOCK0")){
			return MS_MSBCL6080_MfgActIF_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd03.DOWN.BLOCK1")){
			return MS_MSBCL6080_MfgActIF_Upd03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd03.DOWN.BLOCK2")){
			return MS_MSBCL6080_MfgActIF_Upd03_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd04.UP.BLOCK0")){
			return MS_MSBCL6080_MfgActIF_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd04.UP.BLOCK1")){
			return MS_MSBCL6080_MfgActIF_Upd04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL6080.MfgActIF_Upd04.DOWN.BLOCK0")){
			return MS_MSBCL6080_MfgActIF_Upd04_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBCL6080_MfgActIF_Upd01_INFO = new MCOperationInfo("MS", "MSBCL6080", "MfgActIF_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("st_ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("end_ac_dt", "end_ac_dt"),
				MCItemDef.create("base_unit_st_act_qty", "base_unit_st_act_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("act_immed_prnt_flg", "act_immed_prnt_flg"),
				MCItemDef.create("not_pd_chk_flg", "not_pd_chk_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("is_src_outsrc_srv_flg", "is_src_outsrc_srv_flg"),
				MCItemDef.create("is_src_md_mfg_srv_flg", "is_src_md_mfg_srv_flg"),
				MCItemDef.create("lst_reg_flg", "lst_reg_flg"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_unit_act_qty", "oper_unit_act_qty"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_act_intr_rmrks", "oper_act_intr_rmrks"),
				MCItemDef.create("oper_act_rpt_rmrks", "oper_act_rpt_rmrks"),
				MCItemDef.create("oper_act_sub_char1", "oper_act_sub_char1"),
				MCItemDef.create("oper_act_sub_char2", "oper_act_sub_char2"),
				MCItemDef.create("oper_act_sub_char3", "oper_act_sub_char3"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("wk_cost_upd_calc_flg", "wk_cost_upd_calc_flg"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bkf_not_ref_flg", "bkf_not_ref_flg"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("acxfr_act_qty", "acxfr_act_qty"),
				MCItemDef.create("acxfr_act_rsn_cd", "acxfr_act_rsn_cd"),
				MCItemDef.create("acxfr_act_bd_dpt_cd", "acxfr_act_bd_dpt_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_rsn_not_comp_flg", "inpt_rsn_not_comp_flg"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("inpt_act_intr_rmrks", "inpt_act_intr_rmrks"),
				MCItemDef.create("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inpt_act_sub_char1", "inpt_act_sub_char1"),
				MCItemDef.create("inpt_act_sub_char2", "inpt_act_sub_char2"),
				MCItemDef.create("inpt_act_sub_char3", "inpt_act_sub_char3"),
				MCItemDef.create("bkf_upd_flg", "bkf_upd_flg"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_inpt_act_no", "ext_inpt_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("loss_act_no", "loss_act_no"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("loss_qty", "loss_qty"),
				MCItemDef.create("cont_loss_qty", "cont_loss_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_DtlLoss")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("act_wk_cost", "act_wk_cost"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_usr_dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("wk_cost_calc_upd_flg", "wk_cost_calc_upd_flg"),
				MCItemDef.create("wk_act_intr_rmrks", "wk_act_intr_rmrks"),
				MCItemDef.create("wk_act_sub_char1", "wk_act_sub_char1"),
				MCItemDef.create("wk_act_sub_char2", "wk_act_sub_char2"),
				MCItemDef.create("wk_act_sub_char3", "wk_act_sub_char3"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_DtlWk")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("trd_unit_yield_act_qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK7() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_yield_act_qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_yield_act_qty", "base_unit_yield_act_qty"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("mes_id", "mes_id"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_DtlByProd")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_UP_BLOCK8() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("not_io_act_srv_exec_flg", "not_io_act_srv_exec_flg")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_IO_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inpt_act_no", "inpt_act_no")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("inpt_peg_no", "inpt_peg_no"),
				MCItemDef.create("loss_act_no", "loss_act_no")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_DtlLoss")
		);
	}
	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wk_act_no", "wk_act_no")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("yield_act_no", "yield_act_no")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd01_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("yield_act_no", "yield_act_no")
			}
			,
			MCBlockDef.create("MfgActIF_Upd01_DtlByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6080_MfgActIF_Del01_INFO = new MCOperationInfo("MS", "MSBCL6080", "MfgActIF_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Del01",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("lst_del_flg", "lst_del_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("not_commit_flg", "not_commit_flg")
			}
			,
			MCBlockDef.create("MfgActIF_Del01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg")
			}
			,
			MCBlockDef.create("MfgActIF_Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Del01",
			new MCItemDef[]{
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("MfgActIF_Del01_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Del01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Del01",
			new MCItemDef[]{
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("MfgActIF_Del01_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Del01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Del01",
			new MCItemDef[]{
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("MfgActIF_Del01_DtlByProd")
		);
	}


	public static MCContainerDef MS_MSBCL6080_MfgActIF_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgActIF_Del01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6080_MfgActIF_Upd02_INFO = new MCOperationInfo("MS", "MSBCL6080", "MfgActIF_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd02",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("not_commit_flg", "not_commit_flg")
			}
			,
			MCBlockDef.create("MfgActIF_Upd02_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inst_wk_act_flg", "inst_wk_act_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("st_tm", "st_tm"),
				MCItemDef.create("end_tm", "end_tm"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("act_wk_cost", "act_wk_cost"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("wk_usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_usr_dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("act_sub_char1", "act_sub_char1"),
				MCItemDef.create("act_sub_char2", "act_sub_char2"),
				MCItemDef.create("act_sub_char3", "act_sub_char3"),
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
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("wk_act_upd_cntr", "wk_act_upd_cntr"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no")
			}
			,
			MCBlockDef.create("MfgActIF_Upd02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("act_wk_cost", "act_wk_cost"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgActIF_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6080_MfgActIF_Del02_INFO = new MCOperationInfo("MS", "MSBCL6080", "MfgActIF_Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Del02",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("not_commit_flg", "not_commit_flg")
			}
			,
			MCBlockDef.create("MfgActIF_Del02_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Del02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Del02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("inst_wk_act_flg", "inst_wk_act_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("wk_act_upd_cntr", "wk_act_upd_cntr")
			}
			,
			MCBlockDef.create("MfgActIF_Del02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL6080_MfgActIF_Del02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Del02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgActIF_Del02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6080_MfgActIF_Upd03_INFO = new MCOperationInfo("MS", "MSBCL6080", "MfgActIF_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd03",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("oper_unit_flg", "oper_unit_flg"),
				MCItemDef.create("act_immed_prnt_flg", "act_immed_prnt_flg"),
				MCItemDef.create("not_bkf_upd_flg", "not_bkf_upd_flg"),
				MCItemDef.create("not_wk_cost_upd_calc_flg", "not_wk_cost_upd_calc_flg"),
				MCItemDef.create("not_io_act_srv_exec_flg", "not_io_act_srv_exec_flg"),
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("not_commit_flg", "not_commit_flg")
			}
			,
			MCBlockDef.create("MfgActIF_Upd03_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("st_ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("end_ac_dt", "end_ac_dt"),
				MCItemDef.create("base_unit_st_act_qty", "base_unit_st_act_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("mfg_act_rpt_rmrks", "mfg_act_rpt_rmrks"),
				MCItemDef.create("mfg_act_intr_rmrks", "mfg_act_intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("oper_unit_act_qty", "oper_unit_act_qty"),
				MCItemDef.create("oper_act_intr_rmrks", "oper_act_intr_rmrks"),
				MCItemDef.create("oper_act_rpt_rmrks", "oper_act_rpt_rmrks"),
				MCItemDef.create("oper_act_sub_char1", "oper_act_sub_char1"),
				MCItemDef.create("oper_act_sub_char2", "oper_act_sub_char2"),
				MCItemDef.create("oper_act_sub_char3", "oper_act_sub_char3"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg")
			}
			,
			MCBlockDef.create("MfgActIF_Upd03_Hdr1")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("st_ac_dt", "st_ac_dt"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("end_ac_dt", "end_ac_dt"),
				MCItemDef.create("base_unit_st_act_qty", "base_unit_st_act_qty"),
				MCItemDef.create("rem_abort_flg", "rem_abort_flg"),
				MCItemDef.create("act_usr_cd", "act_usr_cd"),
				MCItemDef.create("act_dpt_cd", "act_dpt_cd"),
				MCItemDef.create("mfg_act_rpt_rmrks", "mfg_act_rpt_rmrks"),
				MCItemDef.create("mfg_act_intr_rmrks", "mfg_act_intr_rmrks"),
				MCItemDef.create("mfg_act_sub_char1", "mfg_act_sub_char1"),
				MCItemDef.create("mfg_act_sub_char2", "mfg_act_sub_char2"),
				MCItemDef.create("mfg_act_sub_char3", "mfg_act_sub_char3"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr"),
				MCItemDef.create("mfg_act_upd_cntr", "mfg_act_upd_cntr"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg")
			}
			,
			MCBlockDef.create("MfgActIF_Upd03_Hdr2")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd03_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_yield_act_qty", "trd_unit_yield_act_qty"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no"),
				MCItemDef.create("all_oper_act_reg_flg", "all_oper_act_reg_flg")
			}
			,
			MCBlockDef.create("MfgActIF_Upd03_DtlYieldByProd")
		);
	}


	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt")
			}
			,
			MCBlockDef.create("MfgActIF_Upd03_Hdr1")
		);
	}
	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("bkf_tgt_cnt", "bkf_tgt_cnt"),
				MCItemDef.create("bkf_success_cnt", "bkf_success_cnt"),
				MCItemDef.create("bkf_failure_cnt", "bkf_failure_cnt")
			}
			,
			MCBlockDef.create("MfgActIF_Upd03_Hdr2")
		);
	}
	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd03_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd03",
			new MCItemDef[]{
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("yield_act_no", "yield_act_no")
			}
			,
			MCBlockDef.create("MfgActIF_Upd03_DtlYieldByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL6080_MfgActIF_Upd04_INFO = new MCOperationInfo("MS", "MSBCL6080", "MfgActIF_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd04",
			new MCItemDef[]{
				MCItemDef.create("is_src_batch_flg", "is_src_batch_flg"),
				MCItemDef.create("upd_cntr_chk_flg", "upd_cntr_chk_flg"),
				MCItemDef.create("not_commit_flg", "not_commit_flg")
			}
			,
			MCBlockDef.create("MfgActIF_Upd04_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_act_no", "oper_act_no")
			}
			,
			MCBlockDef.create("MfgActIF_Upd04_DtlOper")
		);
	}


	public static MCContainerDef MS_MSBCL6080_MfgActIF_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL6080", "MfgActIF_Upd04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("MfgActIF_Upd04_DtlOper")
		);
	}
	//FMCB DEF_CLASSES END
}

