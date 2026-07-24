package mcframe.clientMSBA.MSBAP0050;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBAP_SdAdjst]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBAL0050.Srch01.UP.BLOCK0")){
			return MS_MSBAL0050_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0050.Srch01.DOWN.BLOCK0")){
			return MS_MSBAL0050_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0050.Srch01.DOWN.BLOCK1")){
			return MS_MSBAL0050_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBAL0050.Srch01.DOWN.BLOCK2")){
			return MS_MSBAL0050_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBAL0050.Srch01.DOWN.BLOCK3")){
			return MS_MSBAL0050_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBAL0050.Srch02.UP.BLOCK0")){
			return MS_MSBAL0050_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0050.Srch02.DOWN.BLOCK0")){
			return MS_MSBAL0050_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0050.Upd01.UP.BLOCK0")){
			return MS_MSBAL0050_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0050.Upd01.UP.BLOCK1")){
			return MS_MSBAL0050_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBAL0050.Upd01.DOWN.BLOCK0")){
			return MS_MSBAL0050_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0050.Upd01.DOWN.BLOCK1")){
			return MS_MSBAL0050_Upd01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBAL0050_Srch01_INFO = new MCOperationInfo("MS", "MSBAL0050", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBAL0050_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("dmndDtl", "dmnd_dtl"),
				MCItemDef.create("sim", "sim"),
				MCItemDef.create("oldSpply", "old_spply"),
				MCItemDef.create("selectDlyDisp", "select_dly_disp"),
				MCItemDef.create("dmnd_dt_fr", "dmnd_dt_fr"),
				MCItemDef.create("dmnd_dt_to", "dmnd_dt_to"),
				MCItemDef.create("adjst_tgt_flg", "adjst_tgt_flg"),
				MCItemDef.create("adjst_not_tgt_flg", "adjst_not_tgt_flg"),
				MCItemDef.create("dmnd_loc_cd", "dmnd_loc_cd"),
				MCItemDef.create("dmnd_loc_nm", "dmnd_loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("minus_stk_flg", "minus_stk_flg"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("buf_qty_flg", "buf_qty_flg"),
				MCItemDef.create("quality_typ_good_flg", "quality_typ_good_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBAL0050_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sd_adjst_dtl_typ", "sd_adjst_dtl_typ"),
				MCItemDef.create("sd_adjst_dtl_typ_nm", "sd_adjst_dtl_typ_nm"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("prod_pln_typ", "prod_pln_typ"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("schd_qty", "schd_qty"),
				MCItemDef.create("wrk_day_flg", "wrk_day_flg")
			}
			,
			MCBlockDef.create("Rslt1")
		);
	}
	public static MCContainerDef MS_MSBAL0050_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dly_sd_no", "dly_sd_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_wg_cd", "strg_wg_cd"),
				MCItemDef.create("strg_wg_nm", "strg_wg_nm"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("order_reg_qty_p" + ".qty", "order_reg_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("old_due_dt", "old_due_dt"),
				MCItemDef.create("old_base_unit_qty_p" + ".qty", "old_base_unit_qty"),
				MCItemDef.create("old_mfg_loc_cd", "old_mfg_loc_cd"),
				MCItemDef.create("old_mfg_loc_nm", "old_mfg_loc_nm"),
				MCItemDef.create("old_sppl_cd", "old_sppl_cd"),
				MCItemDef.create("old_sppl_nm", "old_sppl_nm"),
				MCItemDef.create("old_rqst_loc_cd", "old_rqst_loc_cd"),
				MCItemDef.create("old_rqst_loc_nm", "old_rqst_loc_nm"),
				MCItemDef.create("old_rqst_wg_cd", "old_rqst_wg_cd"),
				MCItemDef.create("old_rqst_wg_nm", "old_rqst_wg_nm"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("dly_sd_upd_cntr", "dly_sd_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Rslt3")
		);
	}
	public static MCContainerDef MS_MSBAL0050_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Rslt3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("itm_ord_typ_nm", "itm_ord_typ_nm"),
				MCItemDef.create("ord_gnrt_typ", "ord_gnrt_typ"),
				MCItemDef.create("ord_gnrt_typ_nm", "ord_gnrt_typ_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("inst_qty_p" + ".qty", "inst_qty"),
				MCItemDef.create("yeild_qty_p" + ".qty", "yeild_schd_qty"),
				MCItemDef.create("itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("itm_ord_sts_typ_nm", "itm_ord_sts_typ_nm"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Rslt4")
		);
	}
	public static MCContainerDef MS_MSBAL0050_Srch01_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch01_Rslt4] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dly_dmnd_no", "dly_dmnd_no"),
				MCItemDef.create("dmnd_no", "dmnd_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("dmnd_loc_cd", "dmnd_loc_cd"),
				MCItemDef.create("dmnd_loc_nm", "dmnd_loc_nm"),
				MCItemDef.create("dmnd_wg_cd", "dmnd_wg_cd"),
				MCItemDef.create("dmnd_wg_nm", "dmnd_wg_nm"),
				MCItemDef.create("dmnd_dt", "dmnd_dt"),
				MCItemDef.create("dmnd_st_dt", "dmnd_st_dt"),
				MCItemDef.create("dmnd_end_dt", "dmnd_end_dt"),
				MCItemDef.create("dlv_schd_st_dt", "dlv_schd_st_dt"),
				MCItemDef.create("dlv_schd_end_dt", "dlv_schd_end_dt"),
				MCItemDef.create("dmnd_period_typ", "dmnd_period_typ"),
				MCItemDef.create("dmnd_period_typ_nm", "dmnd_period_typ_nm"),
				MCItemDef.create("dmnd_typ", "dmnd_typ"),
				MCItemDef.create("dmnd_typ_nm", "dmnd_typ_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("dmnd_usr_cd", "dmnd_usr_cd"),
				MCItemDef.create("dmnd_usr_nm", "dmnd_usr_nm"),
				MCItemDef.create("dmnd_dpt_cd", "dmnd_dpt_cd"),
				MCItemDef.create("dmnd_dpt_nm", "dmnd_dpt_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("spln_vers", "spln_vers"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Rslt5")
		);
	}
	
	static final MCOperationInfo MS_MSBAL0050_Srch02_INFO = new MCOperationInfo("MS", "MSBAL0050", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBAL0050_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0050", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("dmndDtl", "dmnd_dtl"),
				MCItemDef.create("sim", "sim"),
				MCItemDef.create("oldSpply", "old_spply"),
				MCItemDef.create("selectDlyDisp", "select_dly_disp"),
				MCItemDef.create("dmnd_dt_fr", "dmnd_dt_fr"),
				MCItemDef.create("dmnd_dt_to", "dmnd_dt_to"),
				MCItemDef.create("adjst_tgt_flg", "adjst_tgt_flg"),
				MCItemDef.create("adjst_not_tgt_flg", "adjst_not_tgt_flg"),
				MCItemDef.create("dmnd_loc_cd", "dmnd_loc_cd"),
				MCItemDef.create("dmnd_loc_nm", "dmnd_loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBAL0050_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0050", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("dly_sd_no", "dly_sd_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_wg_cd", "strg_wg_cd"),
				MCItemDef.create("strg_wg_nm", "strg_wg_nm"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("order_reg_qty_p" + ".qty", "order_reg_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("old_due_dt", "old_due_dt"),
				MCItemDef.create("old_base_unit_qty_p" + ".qty", "old_base_unit_qty"),
				MCItemDef.create("old_mfg_loc_cd", "old_mfg_loc_cd"),
				MCItemDef.create("old_mfg_loc_nm", "old_mfg_loc_nm"),
				MCItemDef.create("old_sppl_cd", "old_sppl_cd"),
				MCItemDef.create("old_sppl_nm", "old_sppl_nm"),
				MCItemDef.create("old_rqst_loc_cd", "old_rqst_loc_cd"),
				MCItemDef.create("old_rqst_loc_nm", "old_rqst_loc_nm"),
				MCItemDef.create("old_rqst_wg_cd", "old_rqst_wg_cd"),
				MCItemDef.create("old_rqst_wg_nm", "old_rqst_wg_nm"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("dly_sd_upd_cntr", "dly_sd_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Rslt3")
		);
	}
	
	static final MCOperationInfo MS_MSBAL0050_Upd01_INFO = new MCOperationInfo("MS", "MSBAL0050", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBAL0050_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0050", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("DispRslt1")
		);
	}

	public static MCContainerDef MS_MSBAL0050_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0050", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dly_sd_no", "dly_sd_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dly_sd_upd_cntr", "dly_sd_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt3")
		);
	}


	public static MCContainerDef MS_MSBAL0050_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0050", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("DispRslt1")
		);
	}
	public static MCContainerDef MS_MSBAL0050_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0050", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dly_sd_no", "dly_sd_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt3")
		);
	}
	//FMCB DEF_CLASSES END
}

