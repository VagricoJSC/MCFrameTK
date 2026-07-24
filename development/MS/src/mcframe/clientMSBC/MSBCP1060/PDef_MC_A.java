package mcframe.clientMSBC.MSBCP1060;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBCP_InptTrgtSel]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL1060.Srch01.UP.BLOCK0")){
			return MS_MSBCL1060_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1060.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL1060_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBCL1060_Srch01_INFO = new MCOperationInfo("MS", "MSBCL1060", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1060_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("only_int_flg", "only_int_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
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
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("sno_p" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("lmt_dt_fr", "lmt_dt_fr"),
				MCItemDef.create("lmt_dt_to", "lmt_dt_to"),
				MCItemDef.create("unreg_lmt_flg", "unreg_lmt_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("positive_flg", "positive_flg"),
				MCItemDef.create("except_alloc_wait_flg", "except_alloc_wait_flg"),
				MCItemDef.create("stk_schd_flg", "stk_schd_flg"),
				MCItemDef.create("grs_alloc_flg", "grs_alloc_flg"),
				MCItemDef.create("quality_typ_good_flg", "quality_typ_good_flg"),
				MCItemDef.create("quality_typ_dfct_oper_flg", "quality_typ_dfct_oper_flg"),
				MCItemDef.create("quality_typ_dfct_insp_flg", "quality_typ_dfct_insp_flg"),
				MCItemDef.create("quality_typ_sspnd_flg", "quality_typ_sspnd_flg"),
				MCItemDef.create("stk_insp_typ_yet_flg", "stk_insp_typ_yet_flg"),
				MCItemDef.create("stk_insp_typ_ing_flg", "stk_insp_typ_ing_flg"),
				MCItemDef.create("stk_insp_typ_wait_judg_flg", "stk_insp_typ_wait_judg_flg"),
				MCItemDef.create("stk_insp_typ_fin_flg", "stk_insp_typ_fin_flg"),
				MCItemDef.create("stk_id_typ_costk_flg", "stk_id_typ_costk_flg"),
				MCItemDef.create("stk_id_typ_rtn_pre_accpt_flg", "stk_id_typ_rtn_pre_accpt_flg"),
				MCItemDef.create("stk_id_typ_cststk_flg", "stk_id_typ_cststk_flg"),
				MCItemDef.create("stk_id_typ_rnt_rcv_flg", "stk_id_typ_rnt_rcv_flg"),
				MCItemDef.create("stk_id_typ_purc_pre_accpt_flg", "stk_id_typ_purc_pre_accpt_flg"),
				MCItemDef.create("stk_id_typ_accpt_dfct_flg", "stk_id_typ_accpt_dfct_flg"),
				MCItemDef.create("stk_id_typ_ncv_rcv_flg", "stk_id_typ_ncv_rcv_flg"),
				MCItemDef.create("stk_id_typ_onr_prov_flg", "stk_id_typ_onr_prov_flg"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("first_gr_dt_fr", "first_gr_dt_fr"),
				MCItemDef.create("first_gr_dt_to", "first_gr_dt_to"),
				MCItemDef.create("schd_dt_fr", "schd_dt_fr"),
				MCItemDef.create("schd_dt_to", "schd_dt_to"),
				MCItemDef.create("plnt_aprv_sts_typ_opn_flg", "plnt_aprv_sts_typ_opn_flg"),
				MCItemDef.create("plnt_aprv_sts_typ_acpt_flg", "plnt_aprv_sts_typ_acpt_flg"),
				MCItemDef.create("plnt_aprv_sts_typ_rjct_flg", "plnt_aprv_sts_typ_rjct_flg"),
				MCItemDef.create("plnt_aprv_sts_typ_non_flg", "plnt_aprv_sts_typ_non_flg"),
				MCItemDef.create("mrkt_judg_sts_typ_opn_flg", "mrkt_judg_sts_typ_opn_flg"),
				MCItemDef.create("mrkt_judg_sts_typ_acpt_flg", "mrkt_judg_sts_typ_acpt_flg"),
				MCItemDef.create("mrkt_judg_sts_typ_not_acpt_flg", "mrkt_judg_sts_typ_not_acpt_flg"),
				MCItemDef.create("mrkt_judg_sts_typ_non_flg", "mrkt_judg_sts_typ_non_flg"),
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
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("lot_flg", "lot_flg"),
				MCItemDef.create("loc_flg", "loc_flg"),
				MCItemDef.create("site_flg", "site_flg"),
				MCItemDef.create("lg_grp_flg", "lg_grp_flg"),
				MCItemDef.create("alloc_grp_flg", "alloc_grp_flg"),
				MCItemDef.create("loc_grp_flg", "loc_grp_flg"),
				MCItemDef.create("gd_flg", "gd_flg"),
				MCItemDef.create("sno_flg_p" + ".sno1_flg", "sno1_flg"),
				MCItemDef.create("sno_flg_p" + ".sno2_flg", "sno2_flg"),
				MCItemDef.create("sno_flg_p" + ".sno3_flg", "sno3_flg"),
				MCItemDef.create("sno_flg_p" + ".sno4_flg", "sno4_flg"),
				MCItemDef.create("stk_id_flg", "stk_id_flg"),
				MCItemDef.create("fix_no_flg", "fix_no_flg"),
				MCItemDef.create("schd_dt_flg", "schd_dt_flg"),
				MCItemDef.create("slo_wg_cd", "slo_wg_cd"),
				MCItemDef.create("slo_lg_grp_cd", "slo_lg_grp_cd"),
				MCItemDef.create("stk_info_srch_typ", "stk_info_srch_typ"),
				MCItemDef.create("stk_info_itm_typ", "stk_info_itm_typ"),
				MCItemDef.create("stk_info_loc_typ", "stk_info_loc_typ")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL1060_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL1060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("in_xfr_typ_nm", "in_xfr_typ_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no_typ_nm", "fix_no_typ_nm"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("pack_stk_qty_p" + ".qty", "pack_stk_qty"),
				MCItemDef.create("pack_gr_schd_qty_p" + ".qty", "pack_gr_schd_qty"),
				MCItemDef.create("pack_alloc_qty_p" + ".qty", "pack_alloc_qty"),
				MCItemDef.create("pack_wait_qty_p" + ".qty", "pack_wait_qty"),
				MCItemDef.create("pack_lot_alloc_avl_qty_p" + ".qty", "pack_lot_alloc_avl_qty"),
				MCItemDef.create("pack_alloc_avl_qty_p" + ".qty", "pack_alloc_avl_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("pack_unit_rnd_typ", "pack_unit_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_stk_qty_p" + ".qty", "base_stk_qty"),
				MCItemDef.create("base_gr_schd_qty_p" + ".qty", "base_gr_schd_qty"),
				MCItemDef.create("base_alloc_qty_p" + ".qty", "base_alloc_qty"),
				MCItemDef.create("base_wait_qty_p" + ".qty", "base_wait_qty"),
				MCItemDef.create("base_lot_alloc_avl_qty_p" + ".qty", "base_lot_alloc_avl_qty"),
				MCItemDef.create("base_alloc_avl_qty_p" + ".qty", "base_alloc_avl_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("stk_act_cont_qty_p" + ".cont_qty", "stk_act_cont_qty"),
				MCItemDef.create("schd_act_cont_qty_p" + ".cont_qty", "schd_act_cont_qty"),
				MCItemDef.create("alloc_act_cont_qty_p" + ".cont_qty", "alloc_act_cont_qty"),
				MCItemDef.create("wait_act_cont_qty_p" + ".cont_qty", "wait_act_cont_qty"),
				MCItemDef.create("lot_avl_act_cont_qty_p" + ".cont_qty", "lot_avl_act_cont_qty"),
				MCItemDef.create("avl_act_cont_qty_p" + ".cont_qty", "avl_act_cont_qty"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("stk_std_cont_qty_p" + ".cont_qty", "stk_std_cont_qty"),
				MCItemDef.create("schd_std_cont_qty_p" + ".cont_qty", "schd_std_cont_qty"),
				MCItemDef.create("alloc_std_cont_qty_p" + ".cont_qty", "alloc_std_cont_qty"),
				MCItemDef.create("wait_std_cont_qty_p" + ".cont_qty", "wait_std_cont_qty"),
				MCItemDef.create("lot_avl_std_cont_qty_p" + ".cont_qty", "lot_avl_std_cont_qty"),
				MCItemDef.create("avl_std_cont_qty_p" + ".cont_qty", "avl_std_cont_qty"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("unreg_lmt_flg", "unreg_lmt_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("plnt_aprv_sts_typ", "plnt_aprv_sts_typ"),
				MCItemDef.create("plnt_aprv_sts_typ_nm", "plnt_aprv_sts_typ_nm"),
				MCItemDef.create("mrkt_judg_sts_typ", "mrkt_judg_sts_typ"),
				MCItemDef.create("mrkt_judg_sts_typ_nm", "mrkt_judg_sts_typ_nm"),
				MCItemDef.create("schd_dt", "schd_dt")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

