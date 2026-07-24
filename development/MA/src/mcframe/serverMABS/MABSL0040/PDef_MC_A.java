package mcframe.serverMABS.MABSL0040;

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
 * [MABSL_BomExSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0040.Srch01.UP.BLOCK0")){
			return MA_MABSL0040_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0040.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0040_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0040.Srch02.UP.BLOCK0")){
			return MA_MABSL0040_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0040.Srch02.DOWN.BLOCK0")){
			return MA_MABSL0040_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0040.Srch02.DOWN.BLOCK1")){
			return MA_MABSL0040_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABSL0040.Srch02.DOWN.BLOCK2")){
			return MA_MABSL0040_Srch02_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MABSL0040.Srch02.DOWN.BLOCK3")){
			return MA_MABSL0040_Srch02_DOWN_BLOCK3();
		}
		else if (id.equals("MA.MABSL0040.Srch02.DOWN.BLOCK4")){
			return MA_MABSL0040_Srch02_DOWN_BLOCK4();
		}
		else if (id.equals("MA.MABSL0040.Srch02.DOWN.BLOCK5")){
			return MA_MABSL0040_Srch02_DOWN_BLOCK5();
		}
		else if (id.equals("MA.MABSL0040.Srch02.DOWN.BLOCK6")){
			return MA_MABSL0040_Srch02_DOWN_BLOCK6();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MA_MABSL0040_Srch01_INFO = new MCOperationInfo("MA", "MABSL0040", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0040_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("bom_ptn_flg", "bom_ptn_flg"),
				MCItemDef.create("ph_ex_flg", "ph_ex_flg"),
				MCItemDef.create("max_hrrchy", "max_hrrchy"),
				MCItemDef.create("base_qty", "base_qty")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0040_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bom_lvl", "bom_lvl"),
				MCItemDef.create("extno", "extno"),
				MCItemDef.create("par_extno", "par_extno"),
				MCItemDef.create("bottom_flg", "bottom_flg"),
				MCItemDef.create("loop_flg", "loop_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("ph_flg", "ph_flg"),
				MCItemDef.create("ph_bom_ptn", "ph_bom_ptn"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_typ_nm", "alt_itm_typ_nm"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("sno_typ1", "sno_typ1"),
				MCItemDef.create("sno_typ_nm1", "sno_typ_nm1"),
				MCItemDef.create("sno_typ2", "sno_typ2"),
				MCItemDef.create("sno_typ_nm2", "sno_typ_nm2"),
				MCItemDef.create("sno_typ3", "sno_typ3"),
				MCItemDef.create("sno_typ_nm3", "sno_typ_nm3"),
				MCItemDef.create("sno_typ4", "sno_typ4"),
				MCItemDef.create("sno_typ_nm4", "sno_typ_nm4"),
				MCItemDef.create("min_sno1", "min_sno1"),
				MCItemDef.create("min_sno2", "min_sno2"),
				MCItemDef.create("min_sno3", "min_sno3"),
				MCItemDef.create("min_sno4", "min_sno4"),
				MCItemDef.create("max_sno1", "max_sno1"),
				MCItemDef.create("max_sno2", "max_sno2"),
				MCItemDef.create("max_sno3", "max_sno3"),
				MCItemDef.create("max_sno4", "max_sno4"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("chd_unit_cd", "chd_unit_cd"),
				MCItemDef.create("chd_unit_nm", "chd_unit_nm"),
				MCItemDef.create("chd_dec_place", "chd_dec_place"),
				MCItemDef.create("conv_rqmt_qty", "conv_rqmt_qty"),
				MCItemDef.create("conv_inpt_qty", "conv_inpt_qty"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("byprod_flg", "byprod_flg"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst_typ_nm", "in_offst_typ_nm"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("bkf_typ_nm", "bkf_typ_nm"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("alloc_ctl_typ_nm", "alloc_ctl_typ_nm"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ_nm", "inpt_ctl_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("chng_no", "chng_no"),
				MCItemDef.create("ext_sys_no_bom", "ext_sys_no_bom"),
				MCItemDef.create("not_cost_flg", "not_cost_flg")
			}
			,
			MCBlockDef.create("Srch01_Rslt0")
		);
	}
	
	static final MCOperationInfo MA_MABSL0040_Srch02_INFO = new MCOperationInfo("MA", "MABSL0040", "Srch02", "000000", new PDef());

	public static MCContainerDef MA_MABSL0040_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0040_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_loc_wg_cd", "rqst_loc_wg_cd"),
				MCItemDef.create("rqst_loc_wg_nm", "rqst_loc_wg_nm"),
				MCItemDef.create("rsrc_cd1", "rsrc_cd1"),
				MCItemDef.create("rsrc_nm1", "rsrc_nm1"),
				MCItemDef.create("rsrc_unit_nm1", "rsrc_unit_nm1"),
				MCItemDef.create("rsrc_cd2", "rsrc_cd2"),
				MCItemDef.create("rsrc_nm2", "rsrc_nm2"),
				MCItemDef.create("rsrc_unit_nm2", "rsrc_unit_nm2"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("mfg_lt", "mfg_lt"),
				MCItemDef.create("mfg_lt_add_qty", "mfg_lt_add_qty"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("purc_lt_add_qty", "purc_lt_add_qty"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("buf_lt", "buf_lt"),
				MCItemDef.create("ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("sz_day_week_typ", "sz_day_week_typ"),
				MCItemDef.create("sz_day_week_typ_nm", "sz_day_week_typ_nm"),
				MCItemDef.create("sz_week", "sz_week"),
				MCItemDef.create("lot_sz_pd", "lot_sz_pd"),
				MCItemDef.create("min_lot_qty", "min_lot_qty"),
				MCItemDef.create("batch_lot_qty", "batch_lot_qty"),
				MCItemDef.create("max_lot_qty", "max_lot_qty"),
				MCItemDef.create("max_order", "max_order"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("order_ratio", "order_ratio"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("mfg_inst_qty", "mfg_inst_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("lot_issue_typ", "lot_issue_typ"),
				MCItemDef.create("lot_issue_typ_nm", "lot_issue_typ_nm"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("ln_stk_flg", "ln_stk_flg"),
				MCItemDef.create("pre_po_tgt_flg", "pre_po_tgt_flg"),
				MCItemDef.create("inst_rec_issue_flg", "inst_rec_issue_flg"),
				MCItemDef.create("no_mfg_aprv_flg", "no_mfg_aprv_flg"),
				MCItemDef.create("itm_lower_yield", "itm_lower_yield"),
				MCItemDef.create("itm_std_yield", "itm_std_yield"),
				MCItemDef.create("itm_upper_yield", "itm_upper_yield"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_id_typ_nm", "purc_id_typ_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("po_batch_flg", "po_batch_flg"),
				MCItemDef.create("rsrc_std_qty1", "rsrc_std_qty1"),
				MCItemDef.create("rsrc_unit_qty1", "rsrc_unit_qty1"),
				MCItemDef.create("rsrc_std_qty2", "rsrc_std_qty2"),
				MCItemDef.create("rsrc_unit_qty2", "rsrc_unit_qty2"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("not_mrp_flg", "not_mrp_flg"),
				MCItemDef.create("cost_ratio", "cost_ratio"),
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
			MCBlockDef.create("Srch02_Rslt1")
		);
	}
	public static MCContainerDef MA_MABSL0040_Srch02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABSL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_unit_cd", "itm_unit_cd"),
				MCItemDef.create("itm_dec_place", "itm_dec_place"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_lt", "oper_lt"),
				MCItemDef.create("oper_lt_add_qty", "oper_lt_add_qty"),
				MCItemDef.create("oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_offst_typ_nm", "oper_offst_typ_nm"),
				MCItemDef.create("oper_offst", "oper_offst"),
				MCItemDef.create("oper_offst_add_qty", "oper_offst_add_qty"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_unit_nm", "oper_unit_nm"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("unit_conv_rnd_typ", "unit_conv_rnd_typ"),
				MCItemDef.create("unit_conv_rnd_typ_nm", "unit_conv_rnd_typ_nm"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio"),
				MCItemDef.create("oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_loc_nm", "oper_loc_nm"),
				MCItemDef.create("lmt_fr_dt_flg", "lmt_fr_dt_flg"),
				MCItemDef.create("oper_lower_yield", "oper_lower_yield"),
				MCItemDef.create("oper_std_yield", "oper_std_yield"),
				MCItemDef.create("oper_upper_yield", "oper_upper_yield"),
				MCItemDef.create("wip_rate", "wip_rate"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
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
			MCBlockDef.create("Srch02_Rslt2")
		);
	}
	public static MCContainerDef MA_MABSL0040_Srch02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MABSL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_unit_dec_place", "wk_cost_unit_dec_place"),
				MCItemDef.create("wk_cost_unit_rnd_typ", "wk_cost_unit_rnd_typ"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("itm_dec_place", "itm_dec_place"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
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
			MCBlockDef.create("Srch02_Rslt3")
		);
	}
	public static MCContainerDef MA_MABSL0040_Srch02_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MA", "MABSL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("prio", "prio"),
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
			MCBlockDef.create("Srch02_Rslt4")
		);
	}
	public static MCContainerDef MA_MABSL0040_Srch02_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MA", "MABSL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("buf_qty", "buf_qty"),
				MCItemDef.create("rord_stk_qty", "rord_stk_qty"),
				MCItemDef.create("gi_schd_flg", "gi_schd_flg"),
				MCItemDef.create("rord_rqst_qty", "rord_rqst_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("lot_sizing_flg", "lot_sizing_flg"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("inpt_gi_loc_cd", "inpt_gi_loc_cd"),
				MCItemDef.create("inpt_gi_loc_nm", "inpt_gi_loc_nm"),
				MCItemDef.create("inpt_gi_str_ln_tgt_flg", "inpt_gi_str_ln_tgt_flg"),
				MCItemDef.create("inpt_gi_str_ln_cd", "inpt_gi_str_ln_cd"),
				MCItemDef.create("inpt_gi_str_ln_nm", "inpt_gi_str_ln_nm"),
				MCItemDef.create("ship_gi_loc_cd", "ship_gi_loc_cd"),
				MCItemDef.create("ship_gi_loc_nm", "ship_gi_loc_nm"),
				MCItemDef.create("ship_gi_str_ln_tgt_flg", "ship_gi_str_ln_tgt_flg"),
				MCItemDef.create("ship_gi_str_ln_cd", "ship_gi_str_ln_cd"),
				MCItemDef.create("ship_gi_str_ln_nm", "ship_gi_str_ln_nm"),
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
			MCBlockDef.create("Srch02_Rslt5")
		);
	}
	public static MCContainerDef MA_MABSL0040_Srch02_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MA", "MABSL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_mtd_typ_nm", "insp_mtd_typ_nm"),
				MCItemDef.create("insp_lt", "insp_lt"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("spl_qty", "spl_qty"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
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
			MCBlockDef.create("Srch02_Rslt6")
		);
	}
	public static MCContainerDef MA_MABSL0040_Srch02_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MA", "MABSL0040", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("lmt_ctl_flg", "lmt_ctl_flg"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("from_site_nm", "from_site_nm"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("to_site_nm", "to_site_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("no_insp_flg", "no_insp_flg"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("no_mrkt_judg_flg", "no_mrkt_judg_flg"),
				MCItemDef.create("no_plnt_aprv_flg", "no_plnt_aprv_flg"),
				MCItemDef.create("no_insp_aprv_flg", "no_insp_aprv_flg"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm_typ_nm", "lmt_dt_frm_typ_nm"),
				MCItemDef.create("vld_pd", "vld_pd"),
				MCItemDef.create("lmt_pd", "lmt_pd"),
				MCItemDef.create("lot_insp_vld_pd", "lot_insp_vld_pd"),
				MCItemDef.create("calc_pd_typ", "calc_pd_typ"),
				MCItemDef.create("calc_pd_typ_nm", "calc_pd_typ_nm"),
				MCItemDef.create("lot_insp_lmt_dt_frm_typ", "lot_insp_lmt_dt_frm_typ"),
				MCItemDef.create("lot_insp_lmt_dt_frm_typ_nm", "lot_insp_lmt_dt_frm_typ_nm"),
				MCItemDef.create("insp_inst_issue_typ", "insp_inst_issue_typ"),
				MCItemDef.create("insp_inst_issue_typ_nm", "insp_inst_issue_typ_nm"),
				MCItemDef.create("insp_offst", "insp_offst"),
				MCItemDef.create("inst_rslt_issue_flg", "inst_rslt_issue_flg"),
				MCItemDef.create("pre_insp_valid_flg", "pre_insp_valid_flg"),
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
			MCBlockDef.create("Srch02_Rslt7")
		);
	}
	//FMCB DEF_CLASSES END
}

