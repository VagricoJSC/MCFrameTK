package mcframe.serverMSBC.MSBCL0290;

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
 * [MSBCL_ItmOrdGanttChart]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL0290.Srch01.UP.BLOCK0")){
			return MS_MSBCL0290_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0290.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL0290_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0290.Srch01.DOWN.BLOCK1")){
			return MS_MSBCL0290_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0290.Srch01.DOWN.BLOCK2")){
			return MS_MSBCL0290_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL0290.Srch01.DOWN.BLOCK3")){
			return MS_MSBCL0290_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL0290.Srch01.DOWN.BLOCK4")){
			return MS_MSBCL0290_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL0290.Chk01.UP.BLOCK0")){
			return MS_MSBCL0290_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0290.Chk01.DOWN.BLOCK0")){
			return MS_MSBCL0290_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0290.Upd01.UP.BLOCK0")){
			return MS_MSBCL0290_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBCL0290_Srch01_INFO = new MCOperationInfo("MS", "MSBCL0290", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0290_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0290", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("opn_flg", "opn_flg"),
				MCItemDef.create("sav_flg", "sav_flg"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("inst_flg", "inst_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("prcd_flg", "prcd_flg"),
				MCItemDef.create("sim_flg", "sim_flg"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("alloc_pln_mrp_typ", "alloc_pln_mrp_typ"),
				MCItemDef.create("itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0290_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0290", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("itm_ord_typ_nm", "itm_ord_typ_nm"),
				MCItemDef.create("itm_ord_ld_sts_typ", "itm_ord_ld_sts_typ"),
				MCItemDef.create("itm_ord_ld_sts_typ_nm", "itm_ord_ld_sts_typ_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("mfg_st_dt", "mfg_st_dt"),
				MCItemDef.create("mfg_end_dt", "mfg_end_dt"),
				MCItemDef.create("mfg_lt", "mfg_lt"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rsrc_cd1", "rsrc_cd1"),
				MCItemDef.create("rsrc_nm1", "rsrc_nm1"),
				MCItemDef.create("rsrc_act_qty1", "rsrc_act_qty1"),
				MCItemDef.create("rsrc_unit_nm1", "rsrc_unit_nm1"),
				MCItemDef.create("rsrc_dec_place1", "rsrc_dec_place1"),
				MCItemDef.create("rsrc_rnd_typ1", "rsrc_rnd_typ1"),
				MCItemDef.create("rsrc_cd2", "rsrc_cd2"),
				MCItemDef.create("rsrc_nm2", "rsrc_nm2"),
				MCItemDef.create("rsrc_act_qty2", "rsrc_act_qty2"),
				MCItemDef.create("rsrc_unit_nm2", "rsrc_unit_nm2"),
				MCItemDef.create("rsrc_dec_place2", "rsrc_dec_place2"),
				MCItemDef.create("rsrc_rnd_typ2", "rsrc_rnd_typ2"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("not_fix_flg", "not_fix_flg"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
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
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MS_MSBCL0290_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0290", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("rsrc_cd1", "rsrc_cd1"),
				MCItemDef.create("rsrc_nm1", "rsrc_nm1"),
				MCItemDef.create("rsrc_unit_nm1", "rsrc_unit_nm1"),
				MCItemDef.create("rsrc_dec_place1", "rsrc_dec_place1"),
				MCItemDef.create("rsrc_rnd_typ1", "rsrc_rnd_typ1"),
				MCItemDef.create("rsrc_cd2", "rsrc_cd2"),
				MCItemDef.create("rsrc_nm2", "rsrc_nm2"),
				MCItemDef.create("rsrc_unit_nm2", "rsrc_unit_nm2"),
				MCItemDef.create("rsrc_dec_place2", "rsrc_dec_place2"),
				MCItemDef.create("rsrc_rnd_typ2", "rsrc_rnd_typ2"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Srch01_Loc")
		);
	}
	public static MCContainerDef MS_MSBCL0290_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL0290", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("rsrc_cd", "rsrc_cd"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("act_qty", "act_qty")
			}
			,
			MCBlockDef.create("Srch01_RsrcLoc")
		);
	}
	public static MCContainerDef MS_MSBCL0290_Srch01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL0290", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("off_dt", "off_dt")
			}
			,
			MCBlockDef.create("Srch01_Cal")
		);
	}
	public static MCContainerDef MS_MSBCL0290_Srch01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL0290", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no")
			}
			,
			MCBlockDef.create("Srch01_AllocPln")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0290_Chk01_INFO = new MCOperationInfo("MS", "MSBCL0290", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0290_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0290", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("old_itm_ord_ld_sts_typ", "old_itm_ord_ld_sts_typ"),
				MCItemDef.create("itm_ord_ld_sts_typ", "itm_ord_ld_sts_typ"),
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("ord" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("ord" + ".mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("ord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ord" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL0290_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0290", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("old_itm_ord_ld_sts_typ", "old_itm_ord_ld_sts_typ"),
				MCItemDef.create("itm_ord_ld_sts_typ", "itm_ord_ld_sts_typ"),
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("ord" + ".ord_gnrt_typ", "ord_gnrt_typ"),
				MCItemDef.create("ord" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ord" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ord" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ord" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ord" + ".ver_no", "ver_no"),
				MCItemDef.create("ord" + ".strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("ord" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("ord" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("ord" + ".maker_cd", "maker_cd"),
				MCItemDef.create("ord" + ".rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("ord" + ".rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("ord" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("ord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("ord" + ".inst_qty", "inst_qty"),
				MCItemDef.create("ord" + ".yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("ord" + ".nmr_qty", "nmr_qty"),
				MCItemDef.create("ord" + ".dnm_qty", "dnm_qty"),
				MCItemDef.create("ord" + ".fxd_yield_qty", "fxd_yield_qty"),
				MCItemDef.create("ord" + ".itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("ord" + ".fix_dt", "fix_dt"),
				MCItemDef.create("ord" + ".po_schd_dt", "po_schd_dt"),
				MCItemDef.create("ord" + ".purc_lt", "purc_lt"),
				MCItemDef.create("ord" + ".mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".mfg_lt", "mfg_lt"),
				MCItemDef.create("ord" + ".gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("ord" + ".strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("ord" + ".xfr_lt", "xfr_lt"),
				MCItemDef.create("ord" + ".accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ord" + ".accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("ord" + ".insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("ord" + ".insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("ord" + ".insp_lt", "insp_lt"),
				MCItemDef.create("ord" + ".insp_offst", "insp_offst"),
				MCItemDef.create("ord" + ".avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("ord" + ".master_dt", "master_dt"),
				MCItemDef.create("ord" + ".sno1", "sno1"),
				MCItemDef.create("ord" + ".sno_typ1", "sno_typ1"),
				MCItemDef.create("ord" + ".sno2", "sno2"),
				MCItemDef.create("ord" + ".sno_typ2", "sno_typ2"),
				MCItemDef.create("ord" + ".sno3", "sno3"),
				MCItemDef.create("ord" + ".sno_typ3", "sno_typ3"),
				MCItemDef.create("ord" + ".sno4", "sno4"),
				MCItemDef.create("ord" + ".sno_typ4", "sno_typ4"),
				MCItemDef.create("ord" + ".lmt_dt", "lmt_dt"),
				MCItemDef.create("ord" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ord" + ".not_fix_flg", "not_fix_flg"),
				MCItemDef.create("ord" + ".ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("ord" + ".rqmt_no", "rqmt_no"),
				MCItemDef.create("ord" + ".inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("ord" + ".sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("ord" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("ord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ord" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0290_Upd01_INFO = new MCOperationInfo("MS", "MSBCL0290", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0290_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0290", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("old_itm_ord_ld_sts_typ", "old_itm_ord_ld_sts_typ"),
				MCItemDef.create("itm_ord_ld_sts_typ", "itm_ord_ld_sts_typ"),
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("ord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("ord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("ord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("ord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("ord" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

