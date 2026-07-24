package mcframe.serverMABS.MABSL0010;

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
 * [MABSL_ItmDtlReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0010.ItmDtl_UpdChk01.UP.BLOCK0")){
			return MA_MABSL0010_ItmDtl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0010.ItmDtl_Upd01.UP.BLOCK0")){
			return MA_MABSL0010_ItmDtl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0010.ItmDtl_DelChk01.UP.BLOCK0")){
			return MA_MABSL0010_ItmDtl_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0010.ItmDtl_Del01.UP.BLOCK0")){
			return MA_MABSL0010_ItmDtl_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0010.Srch01.UP.BLOCK0")){
			return MA_MABSL0010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0010.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0010_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0010.Sprt01.UP.BLOCK0")){
			return MA_MABSL0010_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0010.Sprt01.DOWN.BLOCK0")){
			return MA_MABSL0010_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0010.Upd01.UP.BLOCK0")){
			return MA_MABSL0010_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0010.Del01.UP.BLOCK0")){
			return MA_MABSL0010_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MA_MABSL0010_ItmDtl_UpdChk01_INFO = new MCOperationInfo("MA", "MABSL0010", "ItmDtl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0010_ItmDtl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0010", "ItmDtl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
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
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ")
			}
			,
			MCBlockDef.create("ItmDtl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0010_ItmDtl_Upd01_INFO = new MCOperationInfo("MA", "MABSL0010", "ItmDtl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0010_ItmDtl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0010", "ItmDtl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
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
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ")
			}
			,
			MCBlockDef.create("ItmDtl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0010_ItmDtl_DelChk01_INFO = new MCOperationInfo("MA", "MABSL0010", "ItmDtl_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0010_ItmDtl_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0010", "ItmDtl_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmDtl_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0010_ItmDtl_Del01_INFO = new MCOperationInfo("MA", "MABSL0010", "ItmDtl_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0010_ItmDtl_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0010", "ItmDtl_Del01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmDtl_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0010_Srch01_INFO = new MCOperationInfo("MA", "MABSL0010", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0010_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_loc_wg_cd", "rqst_loc_wg_cd"),
				MCItemDef.create("rqst_loc_wg_nm", "rqst_loc_wg_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
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
				MCItemDef.create("nullval_wg_cd", "nullval_wg_cd")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0010_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0010", "Srch01",
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
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("def_bom_ptn", "def_bom_ptn"),
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
				MCItemDef.create("loc_sppl_cd", "loc_sppl_cd"),
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
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("purc_basis_typ_nm", "purc_basis_typ_nm"),
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
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MABSL0010_Sprt01_INFO = new MCOperationInfo("MA", "MABSL0010", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0010_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0010", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
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
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("def_bom_ptn", "def_bom_ptn"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_loc_wg_cd", "rqst_loc_wg_cd"),
				MCItemDef.create("rqst_loc_wg_nm", "rqst_loc_wg_nm"),
				MCItemDef.create("loc_sppl_cd", "loc_sppl_cd"),
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
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("purc_basis_typ_nm", "purc_basis_typ_nm"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("buf_lt", "buf_lt"),
				MCItemDef.create("ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("sz_day_week_typ", "sz_day_week_typ"),
				MCItemDef.create("sz_week", "sz_week"),
				MCItemDef.create("lot_sz_pd", "lot_sz_pd"),
				MCItemDef.create("min_lot_qty", "min_lot_qty"),
				MCItemDef.create("batch_lot_qty", "batch_lot_qty"),
				MCItemDef.create("max_lot_qty", "max_lot_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("max_order", "max_order"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("order_ratio", "order_ratio"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("mfg_inst_qty", "mfg_inst_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MA_MABSL0010_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0010", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
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
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("def_bom_ptn", "def_bom_ptn"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_loc_wg_cd", "rqst_loc_wg_cd"),
				MCItemDef.create("rqst_loc_wg_nm", "rqst_loc_wg_nm"),
				MCItemDef.create("loc_sppl_cd", "loc_sppl_cd"),
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
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("purc_basis_typ_nm", "purc_basis_typ_nm"),
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
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
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
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0010_Upd01_INFO = new MCOperationInfo("MA", "MABSL0010", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0010_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("mfg_lt", "mfg_lt"),
				MCItemDef.create("mfg_lt_add_qty", "mfg_lt_add_qty"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("purc_lt_add_qty", "purc_lt_add_qty"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("buf_lt", "buf_lt"),
				MCItemDef.create("ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("sz_day_week_typ", "sz_day_week_typ"),
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
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0010_Del01_INFO = new MCOperationInfo("MA", "MABSL0010", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0010_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

