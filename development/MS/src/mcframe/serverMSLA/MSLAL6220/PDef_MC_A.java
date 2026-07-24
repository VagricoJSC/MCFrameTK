package mcframe.serverMSLA.MSLAL6220;

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
 * [MSLAL_MfgActRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL6220_MfgActRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL6220_MfgActRecvIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Upd02.UP.BLOCK1")){
			return MS_MSLAL6220_MfgActRecvIf_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL6220_MfgActRecvIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Upd03.UP.BLOCK0")){
			return MS_MSLAL6220_MfgActRecvIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Upd03.UP.BLOCK1")){
			return MS_MSLAL6220_MfgActRecvIf_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Upd03.DOWN.BLOCK0")){
			return MS_MSLAL6220_MfgActRecvIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Upd04.UP.BLOCK0")){
			return MS_MSLAL6220_MfgActRecvIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Upd04.UP.BLOCK1")){
			return MS_MSLAL6220_MfgActRecvIf_Upd04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Upd04.DOWN.BLOCK0")){
			return MS_MSLAL6220_MfgActRecvIf_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Chk01.UP.BLOCK0")){
			return MS_MSLAL6220_MfgActRecvIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL6220_MfgActRecvIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Chk02.UP.BLOCK0")){
			return MS_MSLAL6220_MfgActRecvIf_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL6220.MfgActRecvIf_Chk02.DOWN.BLOCK0")){
			return MS_MSLAL6220_MfgActRecvIf_Chk02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSLAL6220_MfgActRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL6220", "MfgActRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6220_MfgActRecvIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL6220", "MfgActRecvIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Upd02_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("exe_unit_lump_flg", "exe_unit_lump_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg"),
				MCItemDef.create("not_bkf_upd_flg", "not_bkf_upd_flg")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_num", true, "total_num"),
				MCItemDef.create("ok_num", true, "ok_num"),
				MCItemDef.create("err_num", true, "err_num"),
				MCItemDef.create("skip_num", true, "skip_num")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6220_MfgActRecvIf_Upd03_INFO = new MCOperationInfo("MS", "MSLAL6220", "MfgActRecvIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_data_lno", "ext_data_lno"),
				MCItemDef.create("data_make_dt", "data_make_dt"),
				MCItemDef.create("imp_flg", "imp_flg"),
				MCItemDef.create("recv_dt", "recv_dt"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks"),
				MCItemDef.create("act_trd_rmrks", "act_trd_rmrks"),
				MCItemDef.create("wk_intr_rmrks", "wk_intr_rmrks"),
				MCItemDef.create("mfg_act_intr_rmrks", "mfg_act_intr_rmrks"),
				MCItemDef.create("mfg_act_rpt_rmrks", "mfg_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("oper_unit_qty", "oper_unit_qty"),
				MCItemDef.create("bkf_ctl_flg", "bkf_ctl_flg"),
				MCItemDef.create("wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("ext_inpt_act_no", "ext_inpt_act_no"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no"),
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
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("if_inpt_typ", "if_inpt_typ"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("old_loss_rsn_cd", "old_loss_rsn_cd"),
				MCItemDef.create("acxfr_qty", "acxfr_qty"),
				MCItemDef.create("acxfr_rsn_cd", "acxfr_rsn_cd"),
				MCItemDef.create("acxfr_bd_dpt_cd", "acxfr_bd_dpt_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("not_pd_chk_flg", "not_pd_chk_flg"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("wk_usr_dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("wk_usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("st_hm", "st_hm"),
				MCItemDef.create("end_hm", "end_hm"),
				MCItemDef.create("wk_cost_calc_upd_flg", "wk_cost_calc_upd_flg"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("all_oper_act_reg_flg", "all_oper_act_reg_flg"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("mfg_act_usr_cd", "mfg_act_usr_cd"),
				MCItemDef.create("mfg_act_dpt_cd", "mfg_act_dpt_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_itm_cd", "mfg_itm_cd"),
				MCItemDef.create("mfg_itm_sub1", "mfg_itm_sub1"),
				MCItemDef.create("mfg_itm_sub2", "mfg_itm_sub2"),
				MCItemDef.create("mfg_itm_sub3", "mfg_itm_sub3"),
				MCItemDef.create("ext_oper_act_cnt", "ext_oper_act_cnt"),
				MCItemDef.create("ext_act_cnt", "ext_act_cnt"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char4", "sub_char4"),
				MCItemDef.create("sub_char5", "sub_char5"),
				MCItemDef.create("sub_char6", "sub_char6"),
				MCItemDef.create("sub_char7", "sub_char7"),
				MCItemDef.create("sub_char8", "sub_char8"),
				MCItemDef.create("sub_char9", "sub_char9"),
				MCItemDef.create("sub_char10", "sub_char10"),
				MCItemDef.create("sub_char11", "sub_char11"),
				MCItemDef.create("sub_char12", "sub_char12"),
				MCItemDef.create("sub_char13", "sub_char13"),
				MCItemDef.create("sub_char14", "sub_char14"),
				MCItemDef.create("sub_char15", "sub_char15"),
				MCItemDef.create("sub_char16", "sub_char16"),
				MCItemDef.create("sub_char17", "sub_char17"),
				MCItemDef.create("sub_char18", "sub_char18"),
				MCItemDef.create("sub_char19", "sub_char19"),
				MCItemDef.create("sub_char20", "sub_char20"),
				MCItemDef.create("sub_char21", "sub_char21"),
				MCItemDef.create("sub_char22", "sub_char22"),
				MCItemDef.create("sub_char23", "sub_char23"),
				MCItemDef.create("sub_char24", "sub_char24"),
				MCItemDef.create("sub_char25", "sub_char25"),
				MCItemDef.create("sub_char26", "sub_char26"),
				MCItemDef.create("sub_char27", "sub_char27"),
				MCItemDef.create("sub_char28", "sub_char28"),
				MCItemDef.create("sub_char29", "sub_char29"),
				MCItemDef.create("sub_char30", "sub_char30"),
				MCItemDef.create("sub_num1", "sub_num1"),
				MCItemDef.create("sub_num2", "sub_num2"),
				MCItemDef.create("sub_num3", "sub_num3"),
				MCItemDef.create("sub_num4", "sub_num4"),
				MCItemDef.create("sub_num5", "sub_num5"),
				MCItemDef.create("sub_dt1", "sub_dt1"),
				MCItemDef.create("sub_dt2", "sub_dt2"),
				MCItemDef.create("sub_dt3", "sub_dt3"),
				MCItemDef.create("sub_dt4", "sub_dt4"),
				MCItemDef.create("sub_dt5", "sub_dt5"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("log_sub_key1", "log_sub_key1"),
				MCItemDef.create("log_sub_key2", "log_sub_key2"),
				MCItemDef.create("mfg_loc_cd_lasted", "mfg_loc_cd_lasted"),
				MCItemDef.create("site_cd_lasted", "site_cd_lasted"),
				MCItemDef.create("wg_cd_lasted", "wg_cd_lasted"),
				MCItemDef.create("mfg_mtd_typ_lasted", "mfg_mtd_typ_lasted"),
				MCItemDef.create("mfg_str_ln_cd_lasted", "mfg_str_ln_cd_lasted"),
				MCItemDef.create("mfg_itm_cd_lasted", "mfg_itm_cd_lasted"),
				MCItemDef.create("mfg_itm_sub1_lasted", "mfg_itm_sub1_lasted"),
				MCItemDef.create("mfg_itm_sub2_lasted", "mfg_itm_sub2_lasted"),
				MCItemDef.create("mfg_itm_sub3_lasted", "mfg_itm_sub3_lasted"),
				MCItemDef.create("mfg_strg_loc_cd", "mfg_strg_loc_cd"),
				MCItemDef.create("mfg_strg_str_ln_cd", "mfg_strg_str_ln_cd"),
				MCItemDef.create("mfg_inst_no_lasted", "mfg_inst_no_lasted"),
				MCItemDef.create("mfg_inst_rev_lasted", "mfg_inst_rev_lasted"),
				MCItemDef.create("oper_cd_lasted", "oper_cd_lasted"),
				MCItemDef.create("oper_seq_lasted", "oper_seq_lasted"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_dup_imp_flg", "not_dup_imp_flg"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg"),
				MCItemDef.create("skip_by_if_ctl_flg", "skip_by_if_ctl_flg"),
				MCItemDef.create("chk_add_flg", "chk_add_flg"),
				MCItemDef.create("skip_by_oper_del_flg", "skip_by_oper_del_flg"),
				MCItemDef.create("sno_recv_flg", "sno_recv_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Upd03_ActLst")
		);
	}

	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg"),
				MCItemDef.create("not_bkf_upd_flg", "not_bkf_upd_flg")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Upd03_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("total_num", true, "total_num"),
				MCItemDef.create("ok_num", true, "ok_num"),
				MCItemDef.create("err_num", true, "err_num"),
				MCItemDef.create("skip_num", true, "skip_num")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6220_MfgActRecvIf_Upd04_INFO = new MCOperationInfo("MS", "MSLAL6220", "MfgActRecvIf_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_data_lno", "ext_data_lno"),
				MCItemDef.create("data_make_dt", "data_make_dt"),
				MCItemDef.create("imp_flg", "imp_flg"),
				MCItemDef.create("recv_dt", "recv_dt"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks"),
				MCItemDef.create("act_trd_rmrks", "act_trd_rmrks"),
				MCItemDef.create("wk_intr_rmrks", "wk_intr_rmrks"),
				MCItemDef.create("mfg_act_intr_rmrks", "mfg_act_intr_rmrks"),
				MCItemDef.create("mfg_act_rpt_rmrks", "mfg_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("oper_unit_qty", "oper_unit_qty"),
				MCItemDef.create("bkf_ctl_flg", "bkf_ctl_flg"),
				MCItemDef.create("wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("ext_inpt_act_no", "ext_inpt_act_no"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no"),
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
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("if_inpt_typ", "if_inpt_typ"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("old_loss_rsn_cd", "old_loss_rsn_cd"),
				MCItemDef.create("acxfr_qty", "acxfr_qty"),
				MCItemDef.create("acxfr_rsn_cd", "acxfr_rsn_cd"),
				MCItemDef.create("acxfr_bd_dpt_cd", "acxfr_bd_dpt_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("not_pd_chk_flg", "not_pd_chk_flg"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("wk_usr_dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("wk_usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("st_hm", "st_hm"),
				MCItemDef.create("end_hm", "end_hm"),
				MCItemDef.create("wk_cost_calc_upd_flg", "wk_cost_calc_upd_flg"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("all_oper_act_reg_flg", "all_oper_act_reg_flg"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("mfg_act_usr_cd", "mfg_act_usr_cd"),
				MCItemDef.create("mfg_act_dpt_cd", "mfg_act_dpt_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_itm_cd", "mfg_itm_cd"),
				MCItemDef.create("mfg_itm_sub1", "mfg_itm_sub1"),
				MCItemDef.create("mfg_itm_sub2", "mfg_itm_sub2"),
				MCItemDef.create("mfg_itm_sub3", "mfg_itm_sub3"),
				MCItemDef.create("ext_oper_act_cnt", "ext_oper_act_cnt"),
				MCItemDef.create("ext_act_cnt", "ext_act_cnt"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char4", "sub_char4"),
				MCItemDef.create("sub_char5", "sub_char5"),
				MCItemDef.create("sub_char6", "sub_char6"),
				MCItemDef.create("sub_char7", "sub_char7"),
				MCItemDef.create("sub_char8", "sub_char8"),
				MCItemDef.create("sub_char9", "sub_char9"),
				MCItemDef.create("sub_char10", "sub_char10"),
				MCItemDef.create("sub_char11", "sub_char11"),
				MCItemDef.create("sub_char12", "sub_char12"),
				MCItemDef.create("sub_char13", "sub_char13"),
				MCItemDef.create("sub_char14", "sub_char14"),
				MCItemDef.create("sub_char15", "sub_char15"),
				MCItemDef.create("sub_char16", "sub_char16"),
				MCItemDef.create("sub_char17", "sub_char17"),
				MCItemDef.create("sub_char18", "sub_char18"),
				MCItemDef.create("sub_char19", "sub_char19"),
				MCItemDef.create("sub_char20", "sub_char20"),
				MCItemDef.create("sub_char21", "sub_char21"),
				MCItemDef.create("sub_char22", "sub_char22"),
				MCItemDef.create("sub_char23", "sub_char23"),
				MCItemDef.create("sub_char24", "sub_char24"),
				MCItemDef.create("sub_char25", "sub_char25"),
				MCItemDef.create("sub_char26", "sub_char26"),
				MCItemDef.create("sub_char27", "sub_char27"),
				MCItemDef.create("sub_char28", "sub_char28"),
				MCItemDef.create("sub_char29", "sub_char29"),
				MCItemDef.create("sub_char30", "sub_char30"),
				MCItemDef.create("sub_num1", "sub_num1"),
				MCItemDef.create("sub_num2", "sub_num2"),
				MCItemDef.create("sub_num3", "sub_num3"),
				MCItemDef.create("sub_num4", "sub_num4"),
				MCItemDef.create("sub_num5", "sub_num5"),
				MCItemDef.create("sub_dt1", "sub_dt1"),
				MCItemDef.create("sub_dt2", "sub_dt2"),
				MCItemDef.create("sub_dt3", "sub_dt3"),
				MCItemDef.create("sub_dt4", "sub_dt4"),
				MCItemDef.create("sub_dt5", "sub_dt5"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("log_sub_key1", "log_sub_key1"),
				MCItemDef.create("log_sub_key2", "log_sub_key2"),
				MCItemDef.create("mfg_loc_cd_lasted", "mfg_loc_cd_lasted"),
				MCItemDef.create("site_cd_lasted", "site_cd_lasted"),
				MCItemDef.create("wg_cd_lasted", "wg_cd_lasted"),
				MCItemDef.create("mfg_mtd_typ_lasted", "mfg_mtd_typ_lasted"),
				MCItemDef.create("mfg_str_ln_cd_lasted", "mfg_str_ln_cd_lasted"),
				MCItemDef.create("mfg_itm_cd_lasted", "mfg_itm_cd_lasted"),
				MCItemDef.create("mfg_itm_sub1_lasted", "mfg_itm_sub1_lasted"),
				MCItemDef.create("mfg_itm_sub2_lasted", "mfg_itm_sub2_lasted"),
				MCItemDef.create("mfg_itm_sub3_lasted", "mfg_itm_sub3_lasted"),
				MCItemDef.create("mfg_strg_loc_cd", "mfg_strg_loc_cd"),
				MCItemDef.create("mfg_strg_str_ln_cd", "mfg_strg_str_ln_cd"),
				MCItemDef.create("mfg_inst_no_lasted", "mfg_inst_no_lasted"),
				MCItemDef.create("mfg_inst_rev_lasted", "mfg_inst_rev_lasted"),
				MCItemDef.create("oper_cd_lasted", "oper_cd_lasted"),
				MCItemDef.create("oper_seq_lasted", "oper_seq_lasted"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_dup_imp_flg", "not_dup_imp_flg"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg"),
				MCItemDef.create("skip_by_if_ctl_flg", "skip_by_if_ctl_flg"),
				MCItemDef.create("chk_add_flg", "chk_add_flg"),
				MCItemDef.create("skip_by_oper_del_flg", "skip_by_oper_del_flg"),
				MCItemDef.create("sno_recv_flg", "sno_recv_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Upd04_ActLst")
		);
	}

	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Upd04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg"),
				MCItemDef.create("not_bkf_upd_flg", "not_bkf_upd_flg")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Upd04_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_data_lno", "ext_data_lno"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("log_sub_key1", "log_sub_key1"),
				MCItemDef.create("log_sub_key2", "log_sub_key2"),
				MCItemDef.create("chk_add_flg", "chk_add_flg"),
				MCItemDef.create("skip_by_oper_del_flg", "skip_by_oper_del_flg")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Upd04_ActLst")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6220_MfgActRecvIf_Chk01_INFO = new MCOperationInfo("MS", "MSLAL6220", "MfgActRecvIf_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_data_lno", "ext_data_lno"),
				MCItemDef.create("data_make_dt", "data_make_dt"),
				MCItemDef.create("imp_flg", "imp_flg"),
				MCItemDef.create("recv_dt", "recv_dt"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks"),
				MCItemDef.create("act_trd_rmrks", "act_trd_rmrks"),
				MCItemDef.create("wk_intr_rmrks", "wk_intr_rmrks"),
				MCItemDef.create("mfg_act_intr_rmrks", "mfg_act_intr_rmrks"),
				MCItemDef.create("mfg_act_rpt_rmrks", "mfg_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("oper_unit_qty", "oper_unit_qty"),
				MCItemDef.create("bkf_ctl_flg", "bkf_ctl_flg"),
				MCItemDef.create("wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("ext_inpt_act_no", "ext_inpt_act_no"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no"),
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
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("if_inpt_typ", "if_inpt_typ"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("old_loss_rsn_cd", "old_loss_rsn_cd"),
				MCItemDef.create("acxfr_qty", "acxfr_qty"),
				MCItemDef.create("acxfr_rsn_cd", "acxfr_rsn_cd"),
				MCItemDef.create("acxfr_bd_dpt_cd", "acxfr_bd_dpt_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("not_pd_chk_flg", "not_pd_chk_flg"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("wk_usr_dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("wk_usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("st_hm", "st_hm"),
				MCItemDef.create("end_hm", "end_hm"),
				MCItemDef.create("wk_cost_calc_upd_flg", "wk_cost_calc_upd_flg"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("all_oper_act_reg_flg", "all_oper_act_reg_flg"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("mfg_act_usr_cd", "mfg_act_usr_cd"),
				MCItemDef.create("mfg_act_dpt_cd", "mfg_act_dpt_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_itm_cd", "mfg_itm_cd"),
				MCItemDef.create("mfg_itm_sub1", "mfg_itm_sub1"),
				MCItemDef.create("mfg_itm_sub2", "mfg_itm_sub2"),
				MCItemDef.create("mfg_itm_sub3", "mfg_itm_sub3"),
				MCItemDef.create("ext_oper_act_cnt", "ext_oper_act_cnt"),
				MCItemDef.create("ext_act_cnt", "ext_act_cnt"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char4", "sub_char4"),
				MCItemDef.create("sub_char5", "sub_char5"),
				MCItemDef.create("sub_char6", "sub_char6"),
				MCItemDef.create("sub_char7", "sub_char7"),
				MCItemDef.create("sub_char8", "sub_char8"),
				MCItemDef.create("sub_char9", "sub_char9"),
				MCItemDef.create("sub_char10", "sub_char10"),
				MCItemDef.create("sub_char11", "sub_char11"),
				MCItemDef.create("sub_char12", "sub_char12"),
				MCItemDef.create("sub_char13", "sub_char13"),
				MCItemDef.create("sub_char14", "sub_char14"),
				MCItemDef.create("sub_char15", "sub_char15"),
				MCItemDef.create("sub_char16", "sub_char16"),
				MCItemDef.create("sub_char17", "sub_char17"),
				MCItemDef.create("sub_char18", "sub_char18"),
				MCItemDef.create("sub_char19", "sub_char19"),
				MCItemDef.create("sub_char20", "sub_char20"),
				MCItemDef.create("sub_char21", "sub_char21"),
				MCItemDef.create("sub_char22", "sub_char22"),
				MCItemDef.create("sub_char23", "sub_char23"),
				MCItemDef.create("sub_char24", "sub_char24"),
				MCItemDef.create("sub_char25", "sub_char25"),
				MCItemDef.create("sub_char26", "sub_char26"),
				MCItemDef.create("sub_char27", "sub_char27"),
				MCItemDef.create("sub_char28", "sub_char28"),
				MCItemDef.create("sub_char29", "sub_char29"),
				MCItemDef.create("sub_char30", "sub_char30"),
				MCItemDef.create("sub_num1", "sub_num1"),
				MCItemDef.create("sub_num2", "sub_num2"),
				MCItemDef.create("sub_num3", "sub_num3"),
				MCItemDef.create("sub_num4", "sub_num4"),
				MCItemDef.create("sub_num5", "sub_num5"),
				MCItemDef.create("sub_dt1", "sub_dt1"),
				MCItemDef.create("sub_dt2", "sub_dt2"),
				MCItemDef.create("sub_dt3", "sub_dt3"),
				MCItemDef.create("sub_dt4", "sub_dt4"),
				MCItemDef.create("sub_dt5", "sub_dt5"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("log_sub_key1", "log_sub_key1"),
				MCItemDef.create("log_sub_key2", "log_sub_key2"),
				MCItemDef.create("mfg_loc_cd_lasted", "mfg_loc_cd_lasted"),
				MCItemDef.create("site_cd_lasted", "site_cd_lasted"),
				MCItemDef.create("wg_cd_lasted", "wg_cd_lasted"),
				MCItemDef.create("mfg_mtd_typ_lasted", "mfg_mtd_typ_lasted"),
				MCItemDef.create("mfg_str_ln_cd_lasted", "mfg_str_ln_cd_lasted"),
				MCItemDef.create("mfg_itm_cd_lasted", "mfg_itm_cd_lasted"),
				MCItemDef.create("mfg_itm_sub1_lasted", "mfg_itm_sub1_lasted"),
				MCItemDef.create("mfg_itm_sub2_lasted", "mfg_itm_sub2_lasted"),
				MCItemDef.create("mfg_itm_sub3_lasted", "mfg_itm_sub3_lasted"),
				MCItemDef.create("mfg_strg_loc_cd", "mfg_strg_loc_cd"),
				MCItemDef.create("mfg_strg_str_ln_cd", "mfg_strg_str_ln_cd"),
				MCItemDef.create("mfg_inst_no_lasted", "mfg_inst_no_lasted"),
				MCItemDef.create("mfg_inst_rev_lasted", "mfg_inst_rev_lasted"),
				MCItemDef.create("oper_cd_lasted", "oper_cd_lasted"),
				MCItemDef.create("oper_seq_lasted", "oper_seq_lasted"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_dup_imp_flg", "not_dup_imp_flg"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg"),
				MCItemDef.create("skip_by_if_ctl_flg", "skip_by_if_ctl_flg"),
				MCItemDef.create("chk_add_flg", "chk_add_flg"),
				MCItemDef.create("skip_by_oper_del_flg", "skip_by_oper_del_flg"),
				MCItemDef.create("sno_recv_flg", "sno_recv_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Chk01_ActLst")
		);
	}


	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_data_lno", "ext_data_lno"),
				MCItemDef.create("data_make_dt", "data_make_dt"),
				MCItemDef.create("imp_flg", "imp_flg"),
				MCItemDef.create("recv_dt", "recv_dt"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_act_no", "oper_act_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("div_seq", "div_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("ext_oper_act_no", "ext_oper_act_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("act_rpt_rmrks", "act_rpt_rmrks"),
				MCItemDef.create("act_intr_rmrks", "act_intr_rmrks"),
				MCItemDef.create("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks"),
				MCItemDef.create("act_trd_rmrks", "act_trd_rmrks"),
				MCItemDef.create("wk_intr_rmrks", "wk_intr_rmrks"),
				MCItemDef.create("mfg_act_intr_rmrks", "mfg_act_intr_rmrks"),
				MCItemDef.create("mfg_act_rpt_rmrks", "mfg_act_rpt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("yield_act_intr_rmrks", "yield_act_intr_rmrks"),
				MCItemDef.create("yield_act_rpt_rmrks", "yield_act_rpt_rmrks"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_cmpl_flg", "not_cmpl_flg"),
				MCItemDef.create("st_act_tm", "st_act_tm"),
				MCItemDef.create("end_act_tm", "end_act_tm"),
				MCItemDef.create("oper_unit_qty", "oper_unit_qty"),
				MCItemDef.create("bkf_ctl_flg", "bkf_ctl_flg"),
				MCItemDef.create("wk_cost_calc_ctl_flg", "wk_cost_calc_ctl_flg"),
				MCItemDef.create("oper_yield", "oper_yield"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("ext_inpt_act_no", "ext_inpt_act_no"),
				MCItemDef.create("ext_wk_act_no", "ext_wk_act_no"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no"),
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
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("if_inpt_typ", "if_inpt_typ"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("loss_rsn_cd", "loss_rsn_cd"),
				MCItemDef.create("old_loss_rsn_cd", "old_loss_rsn_cd"),
				MCItemDef.create("acxfr_qty", "acxfr_qty"),
				MCItemDef.create("acxfr_rsn_cd", "acxfr_rsn_cd"),
				MCItemDef.create("acxfr_bd_dpt_cd", "acxfr_bd_dpt_cd"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("not_pd_chk_flg", "not_pd_chk_flg"),
				MCItemDef.create("brk_pd", "brk_pd"),
				MCItemDef.create("wk_usr_dpt_cd", "wk_usr_dpt_cd"),
				MCItemDef.create("wk_usr_cd", "wk_usr_cd"),
				MCItemDef.create("wk_day_cd", "wk_day_cd"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("fclty", "fclty"),
				MCItemDef.create("st_hm", "st_hm"),
				MCItemDef.create("end_hm", "end_hm"),
				MCItemDef.create("wk_cost_calc_upd_flg", "wk_cost_calc_upd_flg"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("all_oper_act_reg_flg", "all_oper_act_reg_flg"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("same_lot_flg", "same_lot_flg"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("mfg_act_usr_cd", "mfg_act_usr_cd"),
				MCItemDef.create("mfg_act_dpt_cd", "mfg_act_dpt_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_itm_cd", "mfg_itm_cd"),
				MCItemDef.create("mfg_itm_sub1", "mfg_itm_sub1"),
				MCItemDef.create("mfg_itm_sub2", "mfg_itm_sub2"),
				MCItemDef.create("mfg_itm_sub3", "mfg_itm_sub3"),
				MCItemDef.create("ext_oper_act_cnt", "ext_oper_act_cnt"),
				MCItemDef.create("ext_act_cnt", "ext_act_cnt"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char4", "sub_char4"),
				MCItemDef.create("sub_char5", "sub_char5"),
				MCItemDef.create("sub_char6", "sub_char6"),
				MCItemDef.create("sub_char7", "sub_char7"),
				MCItemDef.create("sub_char8", "sub_char8"),
				MCItemDef.create("sub_char9", "sub_char9"),
				MCItemDef.create("sub_char10", "sub_char10"),
				MCItemDef.create("sub_char11", "sub_char11"),
				MCItemDef.create("sub_char12", "sub_char12"),
				MCItemDef.create("sub_char13", "sub_char13"),
				MCItemDef.create("sub_char14", "sub_char14"),
				MCItemDef.create("sub_char15", "sub_char15"),
				MCItemDef.create("sub_char16", "sub_char16"),
				MCItemDef.create("sub_char17", "sub_char17"),
				MCItemDef.create("sub_char18", "sub_char18"),
				MCItemDef.create("sub_char19", "sub_char19"),
				MCItemDef.create("sub_char20", "sub_char20"),
				MCItemDef.create("sub_char21", "sub_char21"),
				MCItemDef.create("sub_char22", "sub_char22"),
				MCItemDef.create("sub_char23", "sub_char23"),
				MCItemDef.create("sub_char24", "sub_char24"),
				MCItemDef.create("sub_char25", "sub_char25"),
				MCItemDef.create("sub_char26", "sub_char26"),
				MCItemDef.create("sub_char27", "sub_char27"),
				MCItemDef.create("sub_char28", "sub_char28"),
				MCItemDef.create("sub_char29", "sub_char29"),
				MCItemDef.create("sub_char30", "sub_char30"),
				MCItemDef.create("sub_num1", "sub_num1"),
				MCItemDef.create("sub_num2", "sub_num2"),
				MCItemDef.create("sub_num3", "sub_num3"),
				MCItemDef.create("sub_num4", "sub_num4"),
				MCItemDef.create("sub_num5", "sub_num5"),
				MCItemDef.create("sub_dt1", "sub_dt1"),
				MCItemDef.create("sub_dt2", "sub_dt2"),
				MCItemDef.create("sub_dt3", "sub_dt3"),
				MCItemDef.create("sub_dt4", "sub_dt4"),
				MCItemDef.create("sub_dt5", "sub_dt5"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("batch_log_no", "batch_log_no"),
				MCItemDef.create("log_sub_key1", "log_sub_key1"),
				MCItemDef.create("log_sub_key2", "log_sub_key2"),
				MCItemDef.create("mfg_loc_cd_lasted", "mfg_loc_cd_lasted"),
				MCItemDef.create("site_cd_lasted", "site_cd_lasted"),
				MCItemDef.create("wg_cd_lasted", "wg_cd_lasted"),
				MCItemDef.create("mfg_mtd_typ_lasted", "mfg_mtd_typ_lasted"),
				MCItemDef.create("mfg_str_ln_cd_lasted", "mfg_str_ln_cd_lasted"),
				MCItemDef.create("mfg_itm_cd_lasted", "mfg_itm_cd_lasted"),
				MCItemDef.create("mfg_itm_sub1_lasted", "mfg_itm_sub1_lasted"),
				MCItemDef.create("mfg_itm_sub2_lasted", "mfg_itm_sub2_lasted"),
				MCItemDef.create("mfg_itm_sub3_lasted", "mfg_itm_sub3_lasted"),
				MCItemDef.create("mfg_strg_loc_cd", "mfg_strg_loc_cd"),
				MCItemDef.create("mfg_strg_str_ln_cd", "mfg_strg_str_ln_cd"),
				MCItemDef.create("mfg_inst_no_lasted", "mfg_inst_no_lasted"),
				MCItemDef.create("mfg_inst_rev_lasted", "mfg_inst_rev_lasted"),
				MCItemDef.create("oper_cd_lasted", "oper_cd_lasted"),
				MCItemDef.create("oper_seq_lasted", "oper_seq_lasted"),
				MCItemDef.create("inpt_act_no", "inpt_act_no"),
				MCItemDef.create("loss_act_no", "loss_act_no"),
				MCItemDef.create("wk_act_no", "wk_act_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("not_dup_imp_flg", "not_dup_imp_flg"),
				MCItemDef.create("if_auto_reg_flg", "if_auto_reg_flg"),
				MCItemDef.create("skip_by_if_ctl_flg", "skip_by_if_ctl_flg"),
				MCItemDef.create("chk_add_flg", "chk_add_flg"),
				MCItemDef.create("skip_by_oper_del_flg", "skip_by_oper_del_flg"),
				MCItemDef.create("sno_recv_flg", "sno_recv_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Chk01_ActLst")
		);
	}
	
	static final MCOperationInfo MS_MSLAL6220_MfgActRecvIf_Chk02_INFO = new MCOperationInfo("MS", "MSLAL6220", "MfgActRecvIf_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Chk02",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("recv_dt", "recv_dt"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("mfg_itm_cd", "mfg_itm_cd"),
				MCItemDef.create("mfg_itm_sub1", "mfg_itm_sub1"),
				MCItemDef.create("mfg_itm_sub2", "mfg_itm_sub2"),
				MCItemDef.create("mfg_itm_sub3", "mfg_itm_sub3"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("yield_typ", "yield_typ"),
				MCItemDef.create("yield_rate", "yield_rate"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("yield_rsn_cd", "yield_rsn_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("act_tm", "act_tm"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("itm_yield", "itm_yield"),
				MCItemDef.create("mfg_act_dpt_cd", "mfg_act_dpt_cd"),
				MCItemDef.create("mfg_act_usr_cd", "mfg_act_usr_cd"),
				MCItemDef.create("ext_yield_act_no", "ext_yield_act_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("org_oper_inst_no", "org_oper_inst_no"),
				MCItemDef.create("org_mfg_inst_no", "org_mfg_inst_no"),
				MCItemDef.create("org_mfg_inst_rev", "org_mfg_inst_rev"),
				MCItemDef.create("org_yield_schd_no", "org_yield_schd_no")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Chk02_ActLst")
		);
	}


	public static MCContainerDef MS_MSLAL6220_MfgActRecvIf_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL6220", "MfgActRecvIf_Chk02",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("MfgActRecvIf_Chk02_ActLst")
		);
	}
	//FMCB DEF_CLASSES END
}

