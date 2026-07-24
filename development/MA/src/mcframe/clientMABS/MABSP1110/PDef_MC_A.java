package mcframe.clientMABS.MABSP1110;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABSP_PurcItmReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL1110.Srch01.UP.BLOCK0")){
			return MA_MABSL1110_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1110.Srch01.DOWN.BLOCK0")){
			return MA_MABSL1110_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL1110.Srch01.DOWN.BLOCK1")){
			return MA_MABSL1110_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABSL1110.Srch01.DOWN.BLOCK2")){
			return MA_MABSL1110_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MABSL1110.Srch01.DOWN.BLOCK3")){
			return MA_MABSL1110_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MA.MABSL1110.Srch01.DOWN.BLOCK4")){
			return MA_MABSL1110_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MA.MABSL1110.Srch01.DOWN.BLOCK5")){
			return MA_MABSL1110_Srch01_DOWN_BLOCK5();
		}
		else if (id.equals("MA.MABSL1110.Srch01.DOWN.BLOCK6")){
			return MA_MABSL1110_Srch01_DOWN_BLOCK6();
		}
		else if (id.equals("MA.MABSL1110.Srch01.DOWN.BLOCK7")){
			return MA_MABSL1110_Srch01_DOWN_BLOCK7();
		}
		else if (id.equals("MA.MABSL1110.Srch01.DOWN.BLOCK8")){
			return MA_MABSL1110_Srch01_DOWN_BLOCK8();
		}
		else if (id.equals("MA.MABSL1110.Upd01.UP.BLOCK0")){
			return MA_MABSL1110_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1110.Upd01.UP.BLOCK1")){
			return MA_MABSL1110_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABSL1110.Upd01.UP.BLOCK2")){
			return MA_MABSL1110_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MA.MABSL1110.Upd01.UP.BLOCK3")){
			return MA_MABSL1110_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MA.MABSL1110.Upd01.UP.BLOCK4")){
			return MA_MABSL1110_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MA.MABSL1110.Upd01.UP.BLOCK5")){
			return MA_MABSL1110_Upd01_UP_BLOCK5();
		}
		else if (id.equals("MA.MABSL1110.Upd01.UP.BLOCK6")){
			return MA_MABSL1110_Upd01_UP_BLOCK6();
		}
		else if (id.equals("MA.MABSL1110.Upd01.UP.BLOCK7")){
			return MA_MABSL1110_Upd01_UP_BLOCK7();
		}
		else if (id.equals("MA.MABSL1110.Upd01.UP.BLOCK8")){
			return MA_MABSL1110_Upd01_UP_BLOCK8();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MA_MABSL1110_Srch01_INFO = new MCOperationInfo("MA", "MABSL1110", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1110_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Srch01",
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


	public static MCContainerDef MA_MABSL1110_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt0] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Srch01",
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
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("purc_input_flg", "purc_input_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HdrAll")
		);
	}
	public static MCContainerDef MA_MABSL1110_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_id_typ_nm", "purc_id_typ_nm"),
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
				MCItemDef.create("pre_po_tgt_flg", "pre_po_tgt_flg"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("po_batch_flg", "po_batch_flg"),
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
	public static MCContainerDef MA_MABSL1110_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Srch01",
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
	public static MCContainerDef MA_MABSL1110_Srch01_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch01_Rslt3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Srch01",
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
			MCBlockDef.create("Wrk3Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1110_Srch01_DOWN_BLOCK4() {
	/** Ope.のBlock [Srch01_Rslt4] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Srch01",
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
			MCBlockDef.create("Wrk4Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1110_Srch01_DOWN_BLOCK5() {
	/** Ope.のBlock [Srch01_Rslt5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Srch01",
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
			MCBlockDef.create("Wrk5Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1110_Srch01_DOWN_BLOCK6() {
	/** Ope.のBlock [Srch01_Rslt6] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("purc_lt_add_qty_p" + ".qty", "purc_lt_add_qty"),
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
	public static MCContainerDef MA_MABSL1110_Srch01_DOWN_BLOCK7() {
	/** Ope.のBlock [Srch01_Rslt7] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Srch01",
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
			MCBlockDef.create("Wrk7Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1110_Srch01_DOWN_BLOCK8() {
	/** Ope.のBlock [Srch01_Rslt8] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Srch01",
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
			MCBlockDef.create("Wrk8Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL1110_Upd01_INFO = new MCOperationInfo("MA", "MABSL1110", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1110_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl0] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("purc_input_flg", "purc_input_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HdrAll")
		);
	}

	public static MCContainerDef MA_MABSL1110_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
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
				MCItemDef.create("pre_po_tgt_flg", "pre_po_tgt_flg"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("po_batch_flg", "po_batch_flg"),
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

	public static MCContainerDef MA_MABSL1110_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Upd01",
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

	public static MCContainerDef MA_MABSL1110_Upd01_UP_BLOCK3() {
		/** Ope.のBlock [Upd01_Dtl3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Upd01",
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
			MCBlockDef.create("Wrk3Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1110_Upd01_UP_BLOCK4() {
		/** Ope.のBlock [Upd01_Dtl4] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Upd01",
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
			MCBlockDef.create("Wrk4Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1110_Upd01_UP_BLOCK5() {
		/** Ope.のBlock [Upd01_Dtl5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Upd01",
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
			MCBlockDef.create("Wrk5Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1110_Upd01_UP_BLOCK6() {
		/** Ope.のBlock [Upd01_Dtl6] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("purc_lt_add_qty_p" + ".qty", "purc_lt_add_qty"),
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

	public static MCContainerDef MA_MABSL1110_Upd01_UP_BLOCK7() {
		/** Ope.のBlock [Upd01_Dtl7] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Upd01",
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
			MCBlockDef.create("Wrk7Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1110_Upd01_UP_BLOCK8() {
		/** Ope.のBlock [Upd01_Dtl8] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1110", "Upd01",
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
			MCBlockDef.create("Wrk8Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

