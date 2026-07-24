package mcframe.clientMSBC.MSBCP0070;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBCP_OrdExtInfSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL0070.Srch01.UP.BLOCK0")){
			return MS_MSBCL0070_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0070.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL0070_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBCL0070_Srch01_INFO = new MCOperationInfo("MS", "MSBCL0070", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0070_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("max_hrrchy", "max_hrrchy")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0070_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBCL0070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("hrrchy_p" + ".hrrchy", "hrrchy"),
				MCItemDef.create("hrrchy_p" + ".extno", "extno"),
				MCItemDef.create("hrrchy_p" + ".par_extno", "par_extno"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("ord_ext_dat_typ_nm", "ord_ext_dat_typ_nm"),
				MCItemDef.create("ord_ext_dat_no", "ord_ext_dat_no"),
				MCItemDef.create("strg_dlv_cd", "strg_dlv_cd"),
				MCItemDef.create("strg_dlv_nm", "strg_dlv_nm"),
				MCItemDef.create("trd_loc_bp_cd", "trd_loc_bp_cd"),
				MCItemDef.create("trd_loc_bp_nm", "trd_loc_bp_nm"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("schd_alloc_qty_p" + ".qty", "schd_alloc_qty"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("itm_ord_typ_nm", "itm_ord_typ_nm"),
				MCItemDef.create("itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("itm_ord_sts_typ_nm", "itm_ord_sts_typ_nm"),
				MCItemDef.create("not_fix_flg", "not_fix_flg"),
				MCItemDef.create("blk_flg", "blk_flg"),
				MCItemDef.create("inst_qty_p" + ".qty", "inst_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("yield_schd_qty_p" + ".qty", "yield_schd_qty"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("io_schd_no", "io_schd_no"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("io_schd_typ_nm", "io_schd_typ_nm"),
				MCItemDef.create("io_schd_sts_typ", "io_schd_sts_typ"),
				MCItemDef.create("io_schd_sts_typ_nm", "io_schd_sts_typ_nm"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_nm", "pack_unit_nm"),
				MCItemDef.create("pack_unit_qty_p" + ".qty", "pack_unit_qty"),
				MCItemDef.create("stk_loc_cd", "stk_loc_cd"),
				MCItemDef.create("stk_loc_nm", "stk_loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("in_xfr_typ", "in_xfr_typ"),
				MCItemDef.create("in_xfr_typ_nm", "in_xfr_typ_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("stk_insp_typ_nm", "stk_insp_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("pack_dec_place", "pack_dec_place")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

