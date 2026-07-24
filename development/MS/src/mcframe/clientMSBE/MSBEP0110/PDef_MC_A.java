package mcframe.clientMSBE.MSBEP0110;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_StkListPrnt]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL0110.Srch01.UP.BLOCK0")){
			return MS_MSBEL0110_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0110.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL0110_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0110.Prnt01.UP.BLOCK0")){
			return MS_MSBEL0110_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL0110.Prnt01.DOWN.BLOCK0")){
			return MS_MSBEL0110_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBEL0110_Srch01_INFO = new MCOperationInfo("MS", "MSBEL0110", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0110_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("dlv_inst_unit_cd", "dlv_inst_unit_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "", "sno1_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "", "sno2_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "", "sno3_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "", "sno4_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("fix_no_typ", "fix_no_typ"),
				MCItemDef.create("fix_no", "fix_no"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("yield_act_no", "yield_act_no")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL0110_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_alt_nm1", "itm_alt_nm1"),
				MCItemDef.create("itm_alt_nm2", "itm_alt_nm2"),
				MCItemDef.create("itm_alt_nm3", "itm_alt_nm3"),
				MCItemDef.create("itm_alt_nm4", "itm_alt_nm4"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("prnt_all_qty", "prnt_all_qty"),
				MCItemDef.create("rmndr_prnt_flg", "rmndr_prnt_flg"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("unit_cd_per_pckg_unit", "unit_cd_per_pckg_unit"),
				MCItemDef.create("unit_nm_per_pckg_unit", "unit_nm_per_pckg_unit"),
				MCItemDef.create("qty_per_pckg_unit_p" + ".qty", "qty_per_pckg_unit"),
				MCItemDef.create("rmndr_unit_cd", "rmndr_unit_cd"),
				MCItemDef.create("rmndr_unit_nm", "rmndr_unit_nm"),
				MCItemDef.create("rmndr_unit_qty_p" + ".qty", "rmndr_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("pack_unit_qty_p" + ".qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("dlv_inst_unit_cd", "dlv_inst_unit_cd"),
				MCItemDef.create("dlv_inst_unit_nm", "dlv_inst_unit_nm"),
				MCItemDef.create("dlv_inst_unit_dec_place", "dlv_inst_unit_dec_place"),
				MCItemDef.create("dlv_inst_qty_p" + ".qty", "dlv_inst_qty"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "", "sno1_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "", "sno2_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "", "sno3_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "", "sno4_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("unreg_lmt_flg", "unreg_lmt_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("in_xfr_typ_nm", "in_xfr_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
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
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_alt_nm1", "cst_alt_nm1"),
				MCItemDef.create("cst_alt_nm2", "cst_alt_nm2"),
				MCItemDef.create("cst_alt_nm3", "cst_alt_nm3"),
				MCItemDef.create("cst_alt_nm4", "cst_alt_nm4"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_alt_nm1", "dlv_alt_nm1"),
				MCItemDef.create("dlv_alt_nm2", "dlv_alt_nm2"),
				MCItemDef.create("dlv_alt_nm3", "dlv_alt_nm3"),
				MCItemDef.create("dlv_alt_nm4", "dlv_alt_nm4"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("byprod_flg", "byprod_flg"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("stk_lst_form_cd", "stk_lst_form_cd"),
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("co_nm", "co_nm"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("ship_act_d_sub_char1", "ship_act_d_sub_char1"),
				MCItemDef.create("ship_act_d_sub_char2", "ship_act_d_sub_char2"),
				MCItemDef.create("ship_act_d_sub_char3", "ship_act_d_sub_char3"),
				MCItemDef.create("ship_alloc_sts_sub_char1", "ship_alloc_sts_sub_char1"),
				MCItemDef.create("ship_alloc_sts_sub_char2", "ship_alloc_sts_sub_char2"),
				MCItemDef.create("ship_alloc_sts_sub_char3", "ship_alloc_sts_sub_char3"),
				MCItemDef.create("arr_act_sub_char1", "arr_act_sub_char1"),
				MCItemDef.create("arr_act_sub_char2", "arr_act_sub_char2"),
				MCItemDef.create("arr_act_sub_char3", "arr_act_sub_char3"),
				MCItemDef.create("yield_schd_sub_char1", "yield_schd_sub_char1"),
				MCItemDef.create("yield_schd_sub_char2", "yield_schd_sub_char2"),
				MCItemDef.create("yield_schd_sub_char3", "yield_schd_sub_char3"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("stk_sub_char1", "stk_sub_char1"),
				MCItemDef.create("stk_sub_char2", "stk_sub_char2"),
				MCItemDef.create("stk_sub_char3", "stk_sub_char3"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_id_alt_nm1", "dlv_id_alt_nm1"),
				MCItemDef.create("dlv_id_alt_nm2", "dlv_id_alt_nm2"),
				MCItemDef.create("dlv_id_alt_nm3", "dlv_id_alt_nm3"),
				MCItemDef.create("dlv_id_alt_nm4", "dlv_id_alt_nm4"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("arr_dpt_cd", "arr_dpt_cd"),
				MCItemDef.create("arr_dpt_nm", "arr_dpt_nm"),
				MCItemDef.create("arr_usr_cd", "arr_usr_cd"),
				MCItemDef.create("arr_usr_nm", "arr_usr_nm"),
				MCItemDef.create("acpt_dpt_cd", "acpt_dpt_cd"),
				MCItemDef.create("acpt_dpt_nm", "acpt_dpt_nm"),
				MCItemDef.create("acpt_usr_cd", "acpt_usr_cd"),
				MCItemDef.create("acpt_usr_nm", "acpt_usr_nm"),
				MCItemDef.create("lot_rmrks", "lot_rmrks")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL0110_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL0110", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL0110_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0110", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_alt_nm1", "itm_alt_nm1"),
				MCItemDef.create("itm_alt_nm2", "itm_alt_nm2"),
				MCItemDef.create("itm_alt_nm3", "itm_alt_nm3"),
				MCItemDef.create("itm_alt_nm4", "itm_alt_nm4"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("prnt_all_qty", "prnt_all_qty"),
				MCItemDef.create("rmndr_prnt_flg", "rmndr_prnt_flg"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("unit_cd_per_pckg_unit", "unit_cd_per_pckg_unit"),
				MCItemDef.create("unit_nm_per_pckg_unit", "unit_nm_per_pckg_unit"),
				MCItemDef.create("qty_per_pckg_unit_p" + ".qty", "qty_per_pckg_unit"),
				MCItemDef.create("rmndr_unit_cd", "rmndr_unit_cd"),
				MCItemDef.create("rmndr_unit_nm", "rmndr_unit_nm"),
				MCItemDef.create("rmndr_unit_qty_p" + ".qty", "rmndr_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_unit_dec_place", "pack_unit_dec_place"),
				MCItemDef.create("pack_unit_qty_p" + ".qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("dlv_inst_unit_cd", "dlv_inst_unit_cd"),
				MCItemDef.create("dlv_inst_unit_nm", "dlv_inst_unit_nm"),
				MCItemDef.create("dlv_inst_unit_dec_place", "dlv_inst_unit_dec_place"),
				MCItemDef.create("dlv_inst_qty_p" + ".qty", "dlv_inst_qty"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "", "sno1_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "", "sno2_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "", "sno3_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "", "sno4_null_flg"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("bp_lot_no", "bp_lot_no"),
				MCItemDef.create("unreg_lmt_flg", "unreg_lmt_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("lmt_dt", "lmt_dt"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("in_xfr_typ_nm", "in_xfr_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
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
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_alt_nm1", "cst_alt_nm1"),
				MCItemDef.create("cst_alt_nm2", "cst_alt_nm2"),
				MCItemDef.create("cst_alt_nm3", "cst_alt_nm3"),
				MCItemDef.create("cst_alt_nm4", "cst_alt_nm4"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_alt_nm1", "dlv_alt_nm1"),
				MCItemDef.create("dlv_alt_nm2", "dlv_alt_nm2"),
				MCItemDef.create("dlv_alt_nm3", "dlv_alt_nm3"),
				MCItemDef.create("dlv_alt_nm4", "dlv_alt_nm4"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_act_no", "mfg_act_no"),
				MCItemDef.create("yield_act_no", "yield_act_no"),
				MCItemDef.create("byprod_flg", "byprod_flg"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("stk_lst_form_cd", "stk_lst_form_cd"),
				MCItemDef.create("co_cd", "co_cd"),
				MCItemDef.create("co_nm", "co_nm"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("arr_act_sub_char1", "arr_act_sub_char1"),
				MCItemDef.create("arr_act_sub_char2", "arr_act_sub_char2"),
				MCItemDef.create("arr_act_sub_char3", "arr_act_sub_char3"),
				MCItemDef.create("ship_act_d_sub_char1", "ship_act_d_sub_char1"),
				MCItemDef.create("ship_act_d_sub_char2", "ship_act_d_sub_char2"),
				MCItemDef.create("ship_act_d_sub_char3", "ship_act_d_sub_char3"),
				MCItemDef.create("ship_alloc_sts_sub_char1", "ship_alloc_sts_sub_char1"),
				MCItemDef.create("ship_alloc_sts_sub_char2", "ship_alloc_sts_sub_char2"),
				MCItemDef.create("ship_alloc_sts_sub_char3", "ship_alloc_sts_sub_char3"),
				MCItemDef.create("yield_schd_sub_char1", "yield_schd_sub_char1"),
				MCItemDef.create("yield_schd_sub_char2", "yield_schd_sub_char2"),
				MCItemDef.create("yield_schd_sub_char3", "yield_schd_sub_char3"),
				MCItemDef.create("yield_act_sub_char1", "yield_act_sub_char1"),
				MCItemDef.create("yield_act_sub_char2", "yield_act_sub_char2"),
				MCItemDef.create("yield_act_sub_char3", "yield_act_sub_char3"),
				MCItemDef.create("stk_sub_char1", "stk_sub_char1"),
				MCItemDef.create("stk_sub_char2", "stk_sub_char2"),
				MCItemDef.create("stk_sub_char3", "stk_sub_char3"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_id_alt_nm1", "dlv_id_alt_nm1"),
				MCItemDef.create("dlv_id_alt_nm2", "dlv_id_alt_nm2"),
				MCItemDef.create("dlv_id_alt_nm3", "dlv_id_alt_nm3"),
				MCItemDef.create("dlv_id_alt_nm4", "dlv_id_alt_nm4"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("arr_dpt_cd", "arr_dpt_cd"),
				MCItemDef.create("arr_dpt_nm", "arr_dpt_nm"),
				MCItemDef.create("arr_usr_cd", "arr_usr_cd"),
				MCItemDef.create("arr_usr_nm", "arr_usr_nm"),
				MCItemDef.create("acpt_dpt_cd", "acpt_dpt_cd"),
				MCItemDef.create("acpt_dpt_nm", "acpt_dpt_nm"),
				MCItemDef.create("acpt_usr_cd", "acpt_usr_cd"),
				MCItemDef.create("acpt_usr_nm", "acpt_usr_nm"),
				MCItemDef.create("lot_rmrks", "lot_rmrks")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL0110_Prnt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL0110", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

