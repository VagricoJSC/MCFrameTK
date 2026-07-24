package mcframe.clientMABS.MABSP1100;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABSP_MfgItmReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL1100.Srch01.UP.BLOCK0")){
			return MA_MABSL1100_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1100.Srch01.DOWN.BLOCK0")){
			return MA_MABSL1100_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL1100.Srch01.DOWN.BLOCK1")){
			return MA_MABSL1100_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABSL1100.Srch01.DOWN.BLOCK2")){
			return MA_MABSL1100_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MABSL1100.Srch01.DOWN.BLOCK3")){
			return MA_MABSL1100_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MA.MABSL1100.Srch01.DOWN.BLOCK4")){
			return MA_MABSL1100_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MA.MABSL1100.Srch01.DOWN.BLOCK5")){
			return MA_MABSL1100_Srch01_DOWN_BLOCK5();
		}
		else if (id.equals("MA.MABSL1100.Srch01.DOWN.BLOCK6")){
			return MA_MABSL1100_Srch01_DOWN_BLOCK6();
		}
		else if (id.equals("MA.MABSL1100.Srch01.DOWN.BLOCK7")){
			return MA_MABSL1100_Srch01_DOWN_BLOCK7();
		}
		else if (id.equals("MA.MABSL1100.Srch01.DOWN.BLOCK8")){
			return MA_MABSL1100_Srch01_DOWN_BLOCK8();
		}
		else if (id.equals("MA.MABSL1100.Srch01.DOWN.BLOCK9")){
			return MA_MABSL1100_Srch01_DOWN_BLOCK9();
		}
		else if (id.equals("MA.MABSL1100.Srch01.DOWN.BLOCK10")){
			return MA_MABSL1100_Srch01_DOWN_BLOCK10();
		}
		else if (id.equals("MA.MABSL1100.Srch01.DOWN.BLOCK11")){
			return MA_MABSL1100_Srch01_DOWN_BLOCK11();
		}
		else if (id.equals("MA.MABSL1100.Srch01.DOWN.BLOCK12")){
			return MA_MABSL1100_Srch01_DOWN_BLOCK12();
		}
		else if (id.equals("MA.MABSL1100.Upd01.UP.BLOCK0")){
			return MA_MABSL1100_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1100.Upd01.UP.BLOCK1")){
			return MA_MABSL1100_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABSL1100.Upd01.UP.BLOCK2")){
			return MA_MABSL1100_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MA.MABSL1100.Upd01.UP.BLOCK3")){
			return MA_MABSL1100_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MA.MABSL1100.Upd01.UP.BLOCK4")){
			return MA_MABSL1100_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MA.MABSL1100.Upd01.UP.BLOCK5")){
			return MA_MABSL1100_Upd01_UP_BLOCK5();
		}
		else if (id.equals("MA.MABSL1100.Upd01.UP.BLOCK6")){
			return MA_MABSL1100_Upd01_UP_BLOCK6();
		}
		else if (id.equals("MA.MABSL1100.Upd01.UP.BLOCK7")){
			return MA_MABSL1100_Upd01_UP_BLOCK7();
		}
		else if (id.equals("MA.MABSL1100.Upd01.UP.BLOCK8")){
			return MA_MABSL1100_Upd01_UP_BLOCK8();
		}
		else if (id.equals("MA.MABSL1100.Upd01.UP.BLOCK9")){
			return MA_MABSL1100_Upd01_UP_BLOCK9();
		}
		else if (id.equals("MA.MABSL1100.Upd01.UP.BLOCK10")){
			return MA_MABSL1100_Upd01_UP_BLOCK10();
		}
		else if (id.equals("MA.MABSL1100.Upd01.UP.BLOCK11")){
			return MA_MABSL1100_Upd01_UP_BLOCK11();
		}
		else if (id.equals("MA.MABSL1100.Upd01.UP.BLOCK12")){
			return MA_MABSL1100_Upd01_UP_BLOCK12();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MA_MABSL1100_Srch01_INFO = new MCOperationInfo("MA", "MABSL1100", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1100_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dt" + ".st_dt_fr", "st_dt_fr"),
				MCItemDef.create("dt" + ".st_dt_to", "st_dt_to"),
				MCItemDef.create("dt" + ".end_dt_fr", "end_dt_fr"),
				MCItemDef.create("dt" + ".end_dt_to", "end_dt_to"),
				MCItemDef.create("itm" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABSL1100_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt0] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_mng_typ_nm", "stk_mng_typ_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("def_bom_ptn", "def_bom_ptn"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("def_mfg_aprv_flg", "def_mfg_aprv_flg"),
				MCItemDef.create("def_mfg_aprv_role_cd", "def_mfg_aprv_role_cd"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mrp_proc_typ", "mrp_proc_typ"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("prod_pln_typ", "prod_pln_typ"),
				MCItemDef.create("dmnd_date_div_mons", "dmnd_date_div_mons"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("mrp_alloc_margin_days", "mrp_alloc_margin_days"),
				MCItemDef.create("mrp_opn_xfr_days", "mrp_opn_xfr_days"),
				MCItemDef.create("rqmt_rstr_qty", "rqmt_rstr_qty"),
				MCItemDef.create("inpt_itm_add_flg", "inpt_itm_add_flg"),
				MCItemDef.create("inpt_itm_del_flg", "inpt_itm_del_flg"),
				MCItemDef.create("sch_flg", "sch_flg"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("mfg_input_flg", "mfg_input_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HdrAll")
		);
	}
	public static MCContainerDef MA_MABSL1100_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("loc_sppl_cd", "loc_sppl_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("mfg_lt", "mfg_lt"),
				MCItemDef.create("mfg_lt_add_qty_p" + ".qty", "mfg_lt_add_qty"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("purc_lt_add_qty_p" + ".qty", "purc_lt_add_qty"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("purc_basis_typ_nm", "purc_basis_typ_nm"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("buf_lt", "buf_lt"),
				MCItemDef.create("ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("sz_day_week_typ", "sz_day_week_typ"),
				MCItemDef.create("sz_day_week_typ_nm", "sz_day_week_typ_nm"),
				MCItemDef.create("sz_week", "sz_week"),
				MCItemDef.create("lot_sz_pd", "lot_sz_pd"),
				MCItemDef.create("min_lot_qty_p" + ".qty", "min_lot_qty"),
				MCItemDef.create("batch_lot_qty_p" + ".qty", "batch_lot_qty"),
				MCItemDef.create("max_lot_qty_p" + ".qty", "max_lot_qty"),
				MCItemDef.create("max_order", "max_order"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("order_ratio", "order_ratio"),
				MCItemDef.create("yield_schd_qty_p" + ".qty", "yield_schd_qty"),
				MCItemDef.create("mfg_inst_qty_p" + ".qty", "mfg_inst_qty"),
				MCItemDef.create("fxd_rqmt_qty_p" + ".qty", "fxd_rqmt_qty"),
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
				MCItemDef.create("rsrc_cd1", "rsrc_cd1"),
				MCItemDef.create("rsrc_nm1", "rsrc_nm1"),
				MCItemDef.create("rsrc_std_qty1", "rsrc_std_qty1"),
				MCItemDef.create("rsrc_unit_qty1_p" + ".qty", "rsrc_unit_qty1"),
				MCItemDef.create("rsrc_cd2", "rsrc_cd2"),
				MCItemDef.create("rsrc_nm2", "rsrc_nm2"),
				MCItemDef.create("rsrc_std_qty2", "rsrc_std_qty2"),
				MCItemDef.create("rsrc_unit_qty2_p" + ".qty", "rsrc_unit_qty2"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
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
			MCBlockDef.create("Wrk1Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1100_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("buf_lt", "buf_lt"),
				MCItemDef.create("ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("sz_day_week_typ", "sz_day_week_typ"),
				MCItemDef.create("sz_day_week_typ_nm", "sz_day_week_typ_nm"),
				MCItemDef.create("sz_week", "sz_week"),
				MCItemDef.create("lot_sz_pd", "lot_sz_pd"),
				MCItemDef.create("min_lot_qty_p" + ".qty", "min_lot_qty"),
				MCItemDef.create("batch_lot_qty_p" + ".qty", "batch_lot_qty"),
				MCItemDef.create("max_lot_qty_p" + ".qty", "max_lot_qty"),
				MCItemDef.create("max_order", "max_order"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("order_ratio", "order_ratio"),
				MCItemDef.create("pre_po_tgt_flg", "pre_po_tgt_flg"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("not_mrp_flg", "not_mrp_flg"),
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
			MCBlockDef.create("Wrk2Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1100_Srch01_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch01_Rslt3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_lt", "oper_lt"),
				MCItemDef.create("qty3_p" + ".qty", "oper_lt_add_qty"),
				MCItemDef.create("oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_offst_typ_nm", "oper_offst_typ_nm"),
				MCItemDef.create("oper_offst", "oper_offst"),
				MCItemDef.create("qty4_p" + ".qty", "oper_offst_add_qty"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_unit_nm", "oper_unit_nm"),
				MCItemDef.create("qty1_p" + ".qty", "oper_std_qty"),
				MCItemDef.create("qty2_p" + ".qty", "oper_conv_qty"),
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
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
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
			MCBlockDef.create("Wrk3Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1100_Srch01_DOWN_BLOCK4() {
	/** Ope.のBlock [Srch01_Rslt4] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bom_key", "bom_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("chd_itm_p" + ".itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_p" + ".itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_p" + ".itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_p" + ".itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("chd_itm_p" + ".itm_nm", "chd_itm_nm"),
				MCItemDef.create("chd_itm_typ", "chd_itm_typ"),
				MCItemDef.create("chd_itm_typ_nm", "chd_itm_typ_nm"),
				MCItemDef.create("chd_itm_typ_d_cd", "chd_itm_typ_d_cd"),
				MCItemDef.create("chd_itm_typ_d_nm", "chd_itm_typ_d_nm"),
				MCItemDef.create("chd_stk_mng_typ", "chd_stk_mng_typ"),
				MCItemDef.create("chd_asset_mng_typ", "chd_asset_mng_typ"),
				MCItemDef.create("chd_base_unit_cd", "chd_base_unit_cd"),
				MCItemDef.create("chd_base_unit_nm", "chd_base_unit_nm"),
				MCItemDef.create("chd_dec_place", "chd_dec_place"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("chd_sno1_mng_typ", "chd_sno1_mng_typ"),
				MCItemDef.create("chd_sno2_mng_typ", "chd_sno2_mng_typ"),
				MCItemDef.create("chd_sno3_mng_typ", "chd_sno3_mng_typ"),
				MCItemDef.create("chd_sno4_mng_typ", "chd_sno4_mng_typ"),
				MCItemDef.create("chd_def_bom_ptn", "chd_def_bom_ptn"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
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
				MCItemDef.create("min_sno_p" + ".sno1", "min_sno1"),
				MCItemDef.create("min_sno_p" + ".sno2", "min_sno2"),
				MCItemDef.create("min_sno_p" + ".sno3", "min_sno3"),
				MCItemDef.create("min_sno_p" + ".sno4", "min_sno4"),
				MCItemDef.create("max_sno_p" + ".sno1", "max_sno1"),
				MCItemDef.create("max_sno_p" + ".sno2", "max_sno2"),
				MCItemDef.create("max_sno_p" + ".sno3", "max_sno3"),
				MCItemDef.create("max_sno_p" + ".sno4", "max_sno4"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("qty1_p" + ".qty", "par_inst_qty"),
				MCItemDef.create("qty2_p" + ".qty", "chd_rqmt_qty"),
				MCItemDef.create("qty3_p" + ".qty", "chd_inpt_qty"),
				MCItemDef.create("qty4_p" + ".qty", "fxd_chd_rqmt_qty"),
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
			MCBlockDef.create("Wrk4Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1100_Srch01_DOWN_BLOCK5() {
	/** Ope.のBlock [Srch01_Rslt5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
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
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("qty_p" + ".qty", "base_qty"),
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
			MCBlockDef.create("Wrk5Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1100_Srch01_DOWN_BLOCK6() {
	/** Ope.のBlock [Srch01_Rslt6] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
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
			MCBlockDef.create("Wrk6Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1100_Srch01_DOWN_BLOCK7() {
	/** Ope.のBlock [Srch01_Rslt7] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("to_loc_cd", "to_loc_cd"),
				MCItemDef.create("to_loc_nm", "to_loc_nm"),
				MCItemDef.create("to_wg_cd", "to_wg_cd"),
				MCItemDef.create("to_wg_nm", "to_wg_nm"),
				MCItemDef.create("to_lg_grp_cd", "to_lg_grp_cd"),
				MCItemDef.create("fr_loc_cd", "fr_loc_cd"),
				MCItemDef.create("fr_loc_nm", "fr_loc_nm"),
				MCItemDef.create("fr_wg_cd", "fr_wg_cd"),
				MCItemDef.create("fr_lg_grp_cd", "fr_lg_grp_cd"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("xfr_lot_unit_qty_p" + ".qty", "xfr_lot_unit_qty"),
				MCItemDef.create("in_loc_flg", "in_loc_flg"),
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
			MCBlockDef.create("Wrk7Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1100_Srch01_DOWN_BLOCK8() {
	/** Ope.のBlock [Srch01_Rslt8] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("buf_qty_p" + ".qty", "buf_qty"),
				MCItemDef.create("rord_stk_qty_p" + ".qty", "rord_stk_qty"),
				MCItemDef.create("gi_schd_flg", "gi_schd_flg"),
				MCItemDef.create("rord_rqst_qty_p" + ".qty", "rord_rqst_qty"),
				MCItemDef.create("lot_sizing_flg", "lot_sizing_flg"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("str_ln1_p" + ".str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("str_ln1_p" + ".str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("inpt_gi_loc_cd", "inpt_gi_loc_cd"),
				MCItemDef.create("inpt_gi_loc_nm", "inpt_gi_loc_nm"),
				MCItemDef.create("inpt_gi_str_ln_tgt_flg", "inpt_gi_str_ln_tgt_flg"),
				MCItemDef.create("str_ln2_p" + ".str_ln_cd", "inpt_gi_str_ln_cd"),
				MCItemDef.create("str_ln2_p" + ".str_ln_nm", "inpt_gi_str_ln_nm"),
				MCItemDef.create("ship_gi_loc_cd", "ship_gi_loc_cd"),
				MCItemDef.create("ship_gi_loc_nm", "ship_gi_loc_nm"),
				MCItemDef.create("ship_gi_str_ln_tgt_flg", "ship_gi_str_ln_tgt_flg"),
				MCItemDef.create("str_ln3_p" + ".str_ln_cd", "ship_gi_str_ln_cd"),
				MCItemDef.create("str_ln3_p" + ".str_ln_nm", "ship_gi_str_ln_nm"),
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
			MCBlockDef.create("Wrk8Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1100_Srch01_DOWN_BLOCK9() {
	/** Ope.のBlock [Srch01_Rslt9] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("sppl_flg", "sppl_flg"),
				MCItemDef.create("cst_flg", "cst_flg"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("bp_itm_cd", "bp_itm_cd"),
				MCItemDef.create("bp_itm_nm", "bp_itm_nm"),
				MCItemDef.create("def_flg", "def_flg"),
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("pf_grp_nm", "pf_grp_nm"),
				MCItemDef.create("pf_fix_flg", "pf_fix_flg"),
				MCItemDef.create("purc_commit_flg", "purc_commit_flg"),
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
			MCBlockDef.create("Wrk9Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1100_Srch01_DOWN_BLOCK10() {
	/** Ope.のBlock [Srch01_Rslt10] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mfg_inst_unit_typ_wg", "mfg_inst_unit_typ_wg"),
				MCItemDef.create("mfg_inst_unit_typ_mst", "mfg_inst_unit_typ_mst"),
				MCItemDef.create("mfg_inst_unit_typ_mst_nm", "mfg_inst_unit_typ_mst_nm"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mfg_inst_unit_typ_nm", "mfg_inst_unit_typ_nm"),
				MCItemDef.create("mrp_proc_typ_wg", "mrp_proc_typ_wg"),
				MCItemDef.create("mrp_proc_typ_mst", "mrp_proc_typ_mst"),
				MCItemDef.create("mrp_proc_typ_mst_nm", "mrp_proc_typ_mst_nm"),
				MCItemDef.create("mrp_proc_typ", "mrp_proc_typ"),
				MCItemDef.create("mrp_proc_typ_nm", "mrp_proc_typ_nm"),
				MCItemDef.create("rqmt_typ_wg", "rqmt_typ_wg"),
				MCItemDef.create("rqmt_typ_mst", "rqmt_typ_mst"),
				MCItemDef.create("rqmt_typ_mst_nm", "rqmt_typ_mst_nm"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("rqmt_typ_nm", "rqmt_typ_nm"),
				MCItemDef.create("prod_pln_typ_wg", "prod_pln_typ_wg"),
				MCItemDef.create("prod_pln_typ_mst", "prod_pln_typ_mst"),
				MCItemDef.create("prod_pln_typ_mst_nm", "prod_pln_typ_mst_nm"),
				MCItemDef.create("prod_pln_typ", "prod_pln_typ"),
				MCItemDef.create("prod_pln_typ_nm", "prod_pln_typ_nm"),
				MCItemDef.create("dmnd_date_div_mons_wg", "dmnd_date_div_mons_wg"),
				MCItemDef.create("dmnd_date_div_mons_mst", "dmnd_date_div_mons_mst"),
				MCItemDef.create("dmnd_date_div_mons", "dmnd_date_div_mons"),
				MCItemDef.create("alloc_margin_days_wg", "alloc_margin_days_wg"),
				MCItemDef.create("alloc_margin_days_mst", "alloc_margin_days_mst"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("mrp_alloc_margin_days_wg", "mrp_alloc_margin_days_wg"),
				MCItemDef.create("mrp_alloc_margin_days_mst", "mrp_alloc_margin_days_mst"),
				MCItemDef.create("mrp_alloc_margin_days", "mrp_alloc_margin_days"),
				MCItemDef.create("mrp_opn_xfr_days_wg", "mrp_opn_xfr_days_wg"),
				MCItemDef.create("mrp_opn_xfr_days_mst", "mrp_opn_xfr_days_mst"),
				MCItemDef.create("mrp_opn_xfr_days", "mrp_opn_xfr_days"),
				MCItemDef.create("qty_mst_p" + ".qty", "rqmt_rstr_qty_mst"),
				MCItemDef.create("qty_p" + ".qty", "rqmt_rstr_qty"),
				MCItemDef.create("inpt_itm_add_flg", "inpt_itm_add_flg"),
				MCItemDef.create("inpt_itm_add_typ", "inpt_itm_add_typ"),
				MCItemDef.create("inpt_itm_add_typ_nm", "inpt_itm_add_typ_nm"),
				MCItemDef.create("inpt_itm_del_flg", "inpt_itm_del_flg"),
				MCItemDef.create("inpt_itm_del_typ", "inpt_itm_del_typ"),
				MCItemDef.create("inpt_itm_del_typ_nm", "inpt_itm_del_typ_nm"),
				MCItemDef.create("sch_flg", "sch_flg"),
				MCItemDef.create("sch_tgt_typ", "sch_tgt_typ"),
				MCItemDef.create("sch_tgt_typ_nm", "sch_tgt_typ_nm"),
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
			MCBlockDef.create("Wrk10Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1100_Srch01_DOWN_BLOCK11() {
	/** Ope.のBlock [Srch01_Rslt11] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("num_id", "num_id"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("plnt_aprv_role_cd", "plnt_aprv_role_cd"),
				MCItemDef.create("plnt_aprv_role_nm", "plnt_aprv_role_nm"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("insp_aprv_role_cd", "insp_aprv_role_cd"),
				MCItemDef.create("insp_aprv_role_nm", "insp_aprv_role_nm"),
				MCItemDef.create("mfg_aprv_flg", "mfg_aprv_flg"),
				MCItemDef.create("mfg_aprv_role_cd", "mfg_aprv_role_cd"),
				MCItemDef.create("mfg_aprv_role_nm", "mfg_aprv_role_nm"),
				MCItemDef.create("xfr_lot_flg", "xfr_lot_flg"),
				MCItemDef.create("so_prmt_insp_flg", "so_prmt_insp_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
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
			MCBlockDef.create("Wrk11Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1100_Srch01_DOWN_BLOCK12() {
	/** Ope.のBlock [Srch01_Rslt12] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "gr_loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
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
			MCBlockDef.create("Wrk12Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL1100_Upd01_INFO = new MCOperationInfo("MA", "MABSL1100", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1100_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl0] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_input_flg", "mfg_input_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HdrAll")
		);
	}

	public static MCContainerDef MA_MABSL1100_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("mfg_lt", "mfg_lt"),
				MCItemDef.create("mfg_lt_add_qty_p" + ".qty", "mfg_lt_add_qty"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("purc_lt_add_qty_p" + ".qty", "purc_lt_add_qty"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("buf_lt", "buf_lt"),
				MCItemDef.create("ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("sz_day_week_typ", "sz_day_week_typ"),
				MCItemDef.create("sz_week", "sz_week"),
				MCItemDef.create("lot_sz_pd", "lot_sz_pd"),
				MCItemDef.create("min_lot_qty_p" + ".qty", "min_lot_qty"),
				MCItemDef.create("batch_lot_qty_p" + ".qty", "batch_lot_qty"),
				MCItemDef.create("max_lot_qty_p" + ".qty", "max_lot_qty"),
				MCItemDef.create("max_order", "max_order"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("order_ratio", "order_ratio"),
				MCItemDef.create("yield_schd_qty_p" + ".qty", "yield_schd_qty"),
				MCItemDef.create("mfg_inst_qty_p" + ".qty", "mfg_inst_qty"),
				MCItemDef.create("fxd_rqmt_qty_p" + ".qty", "fxd_rqmt_qty"),
				MCItemDef.create("lot_issue_typ", "lot_issue_typ"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("ln_stk_flg", "ln_stk_flg"),
				MCItemDef.create("pre_po_tgt_flg", "pre_po_tgt_flg"),
				MCItemDef.create("inst_rec_issue_flg", "inst_rec_issue_flg"),
				MCItemDef.create("no_mfg_aprv_flg", "no_mfg_aprv_flg"),
				MCItemDef.create("itm_lower_yield", "itm_lower_yield"),
				MCItemDef.create("itm_std_yield", "itm_std_yield"),
				MCItemDef.create("itm_upper_yield", "itm_upper_yield"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("po_batch_flg", "po_batch_flg"),
				MCItemDef.create("rsrc_std_qty1", "rsrc_std_qty1"),
				MCItemDef.create("rsrc_unit_qty1_p" + ".qty", "rsrc_unit_qty1"),
				MCItemDef.create("rsrc_std_qty2", "rsrc_std_qty2"),
				MCItemDef.create("rsrc_unit_qty2_p" + ".qty", "rsrc_unit_qty2"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("not_mrp_flg", "not_mrp_flg"),
				MCItemDef.create("cost_ratio", "cost_ratio"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk1Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1100_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("buf_lt", "buf_lt"),
				MCItemDef.create("ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("sz_day_week_typ", "sz_day_week_typ"),
				MCItemDef.create("sz_week", "sz_week"),
				MCItemDef.create("lot_sz_pd", "lot_sz_pd"),
				MCItemDef.create("min_lot_qty_p" + ".qty", "min_lot_qty"),
				MCItemDef.create("batch_lot_qty_p" + ".qty", "batch_lot_qty"),
				MCItemDef.create("max_lot_qty_p" + ".qty", "max_lot_qty"),
				MCItemDef.create("max_order", "max_order"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("order_ratio", "order_ratio"),
				MCItemDef.create("pre_po_tgt_flg", "pre_po_tgt_flg"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("not_mrp_flg", "not_mrp_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk2Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1100_Upd01_UP_BLOCK3() {
		/** Ope.のBlock [Upd01_Dtl3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_lt", "oper_lt"),
				MCItemDef.create("qty3_p" + ".qty", "oper_lt_add_qty"),
				MCItemDef.create("oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_offst", "oper_offst"),
				MCItemDef.create("qty4_p" + ".qty", "oper_offst_add_qty"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("qty1_p" + ".qty", "oper_std_qty"),
				MCItemDef.create("qty2_p" + ".qty", "oper_conv_qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("unit_conv_rnd_typ", "unit_conv_rnd_typ"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio"),
				MCItemDef.create("oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("lmt_fr_dt_flg", "lmt_fr_dt_flg"),
				MCItemDef.create("oper_lower_yield", "oper_lower_yield"),
				MCItemDef.create("oper_std_yield", "oper_std_yield"),
				MCItemDef.create("oper_upper_yield", "oper_upper_yield"),
				MCItemDef.create("wip_rate", "wip_rate"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk3Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1100_Upd01_UP_BLOCK4() {
		/** Ope.のBlock [Upd01_Dtl4] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bom_key", "bom_key"),
				MCItemDef.create("itm_p" + ".itm_cd", "par_itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "par_itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "par_itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "par_itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("chd_itm_p" + ".itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_p" + ".itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_p" + ".itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_p" + ".itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("ph_flg", "ph_flg"),
				MCItemDef.create("ph_bom_ptn", "ph_bom_ptn"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("sno_typ1", "sno_typ1"),
				MCItemDef.create("sno_typ2", "sno_typ2"),
				MCItemDef.create("sno_typ3", "sno_typ3"),
				MCItemDef.create("sno_typ4", "sno_typ4"),
				MCItemDef.create("min_sno_p" + ".sno1", "min_sno1"),
				MCItemDef.create("min_sno_p" + ".sno2", "min_sno2"),
				MCItemDef.create("min_sno_p" + ".sno3", "min_sno3"),
				MCItemDef.create("min_sno_p" + ".sno4", "min_sno4"),
				MCItemDef.create("max_sno_p" + ".sno1", "max_sno1"),
				MCItemDef.create("max_sno_p" + ".sno2", "max_sno2"),
				MCItemDef.create("max_sno_p" + ".sno3", "max_sno3"),
				MCItemDef.create("max_sno_p" + ".sno4", "max_sno4"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("qty1_p" + ".qty", "par_inst_qty"),
				MCItemDef.create("qty2_p" + ".qty", "chd_rqmt_qty"),
				MCItemDef.create("qty3_p" + ".qty", "chd_inpt_qty"),
				MCItemDef.create("qty4_p" + ".qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("byprod_flg", "byprod_flg"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("chng_no", "chng_no"),
				MCItemDef.create("ext_sys_no_bom", "ext_sys_no_bom"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk4Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1100_Upd01_UP_BLOCK5() {
		/** Ope.のBlock [Upd01_Dtl5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("qty_p" + ".qty", "base_qty"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk5Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1100_Upd01_UP_BLOCK6() {
		/** Ope.のBlock [Upd01_Dtl6] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk6Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1100_Upd01_UP_BLOCK7() {
		/** Ope.のBlock [Upd01_Dtl7] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("to_loc_cd", "to_loc_cd"),
				MCItemDef.create("fr_loc_cd", "fr_loc_cd"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("xfr_lot_unit_qty_p" + ".qty", "xfr_lot_unit_qty"),
				MCItemDef.create("in_loc_flg", "in_loc_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk7Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1100_Upd01_UP_BLOCK8() {
		/** Ope.のBlock [Upd01_Dtl8] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("buf_qty_p" + ".qty", "buf_qty"),
				MCItemDef.create("rord_stk_qty_p" + ".qty", "rord_stk_qty"),
				MCItemDef.create("gi_schd_flg", "gi_schd_flg"),
				MCItemDef.create("rord_rqst_qty_p" + ".qty", "rord_rqst_qty"),
				MCItemDef.create("lot_sizing_flg", "lot_sizing_flg"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("str_ln1_p" + ".str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("inpt_gi_loc_cd", "inpt_gi_loc_cd"),
				MCItemDef.create("str_ln2_p" + ".str_ln_cd", "inpt_gi_str_ln_cd"),
				MCItemDef.create("ship_gi_loc_cd", "ship_gi_loc_cd"),
				MCItemDef.create("str_ln3_p" + ".str_ln_cd", "ship_gi_str_ln_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk8Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1100_Upd01_UP_BLOCK9() {
		/** Ope.のBlock [Upd01_Dtl9] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("bp_itm_cd", "bp_itm_cd"),
				MCItemDef.create("bp_itm_nm", "bp_itm_nm"),
				MCItemDef.create("def_flg", "def_flg"),
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("pf_fix_flg", "pf_fix_flg"),
				MCItemDef.create("purc_commit_flg", "purc_commit_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk9Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1100_Upd01_UP_BLOCK10() {
		/** Ope.のBlock [Upd01_Dtl10] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mrp_proc_typ", "mrp_proc_typ"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("prod_pln_typ", "prod_pln_typ"),
				MCItemDef.create("dmnd_date_div_mons", "dmnd_date_div_mons"),
				MCItemDef.create("alloc_margin_days", "alloc_margin_days"),
				MCItemDef.create("mrp_alloc_margin_days", "mrp_alloc_margin_days"),
				MCItemDef.create("mrp_opn_xfr_days", "mrp_opn_xfr_days"),
				MCItemDef.create("qty_p" + ".qty", "rqmt_rstr_qty"),
				MCItemDef.create("inpt_itm_add_typ", "inpt_itm_add_typ"),
				MCItemDef.create("inpt_itm_del_typ", "inpt_itm_del_typ"),
				MCItemDef.create("sch_tgt_typ", "sch_tgt_typ"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk10Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1100_Upd01_UP_BLOCK11() {
		/** Ope.のBlock [Upd01_Dtl11] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("plnt_aprv_role_cd", "plnt_aprv_role_cd"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("insp_aprv_role_cd", "insp_aprv_role_cd"),
				MCItemDef.create("mfg_aprv_flg", "mfg_aprv_flg"),
				MCItemDef.create("mfg_aprv_role_cd", "mfg_aprv_role_cd"),
				MCItemDef.create("xfr_lot_flg", "xfr_lot_flg"),
				MCItemDef.create("so_prmt_insp_flg", "so_prmt_insp_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("num_id", "num_id"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk11Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1100_Upd01_UP_BLOCK12() {
		/** Ope.のBlock [Upd01_Dtl12] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1100", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "gr_loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk12Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

