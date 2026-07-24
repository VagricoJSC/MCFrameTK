package mcframe.serverMSBC.MSBCL5010;

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
 * [MSBCL_OrdRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL5010.Ord_Upd01.UP.BLOCK0")){
			return MS_MSBCL5010_Ord_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Upd01.UP.BLOCK1")){
			return MS_MSBCL5010_Ord_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Upd01.DOWN.BLOCK0")){
			return MS_MSBCL5010_Ord_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Upd01.DOWN.BLOCK1")){
			return MS_MSBCL5010_Ord_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Sprt01.UP.BLOCK0")){
			return MS_MSBCL5010_Ord_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Sprt01.DOWN.BLOCK0")){
			return MS_MSBCL5010_Ord_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Sprt02.UP.BLOCK0")){
			return MS_MSBCL5010_Ord_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Sprt02.UP.BLOCK1")){
			return MS_MSBCL5010_Ord_Sprt02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Sprt02.DOWN.BLOCK0")){
			return MS_MSBCL5010_Ord_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Sprt03.UP.BLOCK0")){
			return MS_MSBCL5010_Ord_Sprt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Sprt03.DOWN.BLOCK0")){
			return MS_MSBCL5010_Ord_Sprt03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Sprt04.UP.BLOCK0")){
			return MS_MSBCL5010_Ord_Sprt04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Sprt04.DOWN.BLOCK0")){
			return MS_MSBCL5010_Ord_Sprt04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Chk01.UP.BLOCK0")){
			return MS_MSBCL5010_Ord_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Chk01.UP.BLOCK1")){
			return MS_MSBCL5010_Ord_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Chk01.DOWN.BLOCK0")){
			return MS_MSBCL5010_Ord_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Chk02.UP.BLOCK0")){
			return MS_MSBCL5010_Ord_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Chk02.DOWN.BLOCK0")){
			return MS_MSBCL5010_Ord_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Upd02.UP.BLOCK0")){
			return MS_MSBCL5010_Ord_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Upd02.DOWN.BLOCK0")){
			return MS_MSBCL5010_Ord_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Upd03.UP.BLOCK0")){
			return MS_MSBCL5010_Ord_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Upd04.UP.BLOCK0")){
			return MS_MSBCL5010_Ord_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Upd05.UP.BLOCK0")){
			return MS_MSBCL5010_Ord_Upd05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Imp01.UP.BLOCK0")){
			return MS_MSBCL5010_Ord_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Imp01.DOWN.BLOCK0")){
			return MS_MSBCL5010_Ord_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Imp02.UP.BLOCK0")){
			return MS_MSBCL5010_Ord_Imp02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5010.Ord_Imp02.DOWN.BLOCK0")){
			return MS_MSBCL5010_Ord_Imp02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
													
	
	static final MCOperationInfo MS_MSBCL5010_Ord_Upd01_INFO = new MCOperationInfo("MS", "MSBCL5010", "Ord_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5010_Ord_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
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
				MCItemDef.create("ord" + ".mst_mfg_loc_cd", "mst_mfg_loc_cd"),
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
				MCItemDef.create("ord" + ".mrp_po_schd_dt", "mrp_po_schd_dt"),
				MCItemDef.create("ord" + ".mrp_purc_lt", "mrp_purc_lt"),
				MCItemDef.create("ord" + ".purc_lt", "purc_lt"),
				MCItemDef.create("ord" + ".mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mrp_mfg_st_schd_dt", "mrp_mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".mrp_mfg_end_schd_dt", "mrp_mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".mrp_mfg_lt", "mrp_mfg_lt"),
				MCItemDef.create("ord" + ".mfg_lt", "mfg_lt"),
				MCItemDef.create("ord" + ".gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("ord" + ".mrp_gi_schd_dt", "mrp_gi_schd_dt"),
				MCItemDef.create("ord" + ".strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("ord" + ".mrp_strg_schd_dt", "mrp_strg_schd_dt"),
				MCItemDef.create("ord" + ".xfr_lt", "xfr_lt"),
				MCItemDef.create("ord" + ".accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ord" + ".mrp_accpt_schd_dt", "mrp_accpt_schd_dt"),
				MCItemDef.create("ord" + ".accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("ord" + ".insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("ord" + ".mrp_insp_st_schd_dt", "mrp_insp_st_schd_dt"),
				MCItemDef.create("ord" + ".insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("ord" + ".mrp_insp_end_schd_dt", "mrp_insp_end_schd_dt"),
				MCItemDef.create("ord" + ".insp_lt", "insp_lt"),
				MCItemDef.create("ord" + ".insp_offst", "insp_offst"),
				MCItemDef.create("ord" + ".avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("ord" + ".mrp_avl_schd_dt", "mrp_avl_schd_dt"),
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
				MCItemDef.create("strg_lg_grp_cd", "strg_lg_grp_cd"),
				MCItemDef.create("strg_sppl_cd", "strg_sppl_cd"),
				MCItemDef.create("rqst_to_lg_grp_cd", "rqst_to_lg_grp_cd"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("oper_ord_pr_flg", "oper_ord_pr_flg"),
				MCItemDef.create("io_schd_pr_flg", "io_schd_pr_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("uplnd_outsrc_flg", "uplnd_outsrc_flg"),
				MCItemDef.create("ord" + ".ord_rcv_flg", "ord_rcv_flg"),
				MCItemDef.create("ord" + ".ord_snd_flg", "ord_snd_flg"),
				MCItemDef.create("ord" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ord" + ".ext_itm_ord_no", "ext_itm_ord_no"),
				MCItemDef.create("ord" + ".for_scheduler_frozen_flg", "for_scheduler_frozen_flg")
			}
			,
			MCBlockDef.create("Ord_Upd01_Dtl1")
		);
	}

	public static MCContainerDef MS_MSBCL5010_Ord_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("peg_no_d", "peg_no_d"),
				MCItemDef.create("oord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oord" + ".oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".oper_lt", "oper_lt"),
				MCItemDef.create("oord" + ".oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oord" + ".oper_offst", "oper_offst"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".disp_seq", "disp_seq"),
				MCItemDef.create("oord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oord" + ".itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("oord" + ".wg_cd", "wg_cd"),
				MCItemDef.create("oord" + ".yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("oord" + ".oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oord" + ".sub_char3", "sub_char3"),
				MCItemDef.create("oord" + ".ext_oper_ord_no", "ext_oper_ord_no"),
				MCItemDef.create("oord" + ".scheduler_frozen_flg", "scheduler_frozen_flg")
			}
			,
			MCBlockDef.create("Ord_Upd01_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBCL5010_Ord_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no")
			}
			,
			MCBlockDef.create("Ord_Upd01_Rslt1")
		);
	}
	public static MCContainerDef MS_MSBCL5010_Ord_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("peg_no_d", "peg_no_d"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_lt", "oper_lt"),
				MCItemDef.create("oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_offst", "oper_offst"),
				MCItemDef.create("oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg")
			}
			,
			MCBlockDef.create("Ord_Upd01_Rslt2")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5010_Ord_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL5010", "Ord_Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5010_Ord_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt")
			}
			,
			MCBlockDef.create("Ord_Sprt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL5010_Ord_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_lt", "oper_lt"),
				MCItemDef.create("mst_oper_lt", "mst_oper_lt"),
				MCItemDef.create("oper_lt_add_qty", "oper_lt_add_qty"),
				MCItemDef.create("oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oper_offst", "oper_offst"),
				MCItemDef.create("mst_oper_offst", "mst_oper_offst"),
				MCItemDef.create("oper_offst_add_qty", "oper_offst_add_qty"),
				MCItemDef.create("oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("mst_mfg_loc_cd", "mst_mfg_loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_dec_place", "base_dec_place"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_unit_nm", "oper_unit_nm"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("unit_conv_rnd_typ", "unit_conv_rnd_typ"),
				MCItemDef.create("oper_conv_schd_qty", "oper_conv_schd_qty"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio"),
				MCItemDef.create("oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_loc_nm", "oper_loc_nm"),
				MCItemDef.create("oper_str_ln_tgt_flg", "oper_str_ln_tgt_flg"),
				MCItemDef.create("lmt_fr_dt_flg", "lmt_fr_dt_flg"),
				MCItemDef.create("oper_lower_yield", "oper_lower_yield"),
				MCItemDef.create("oper_std_yield", "oper_std_yield"),
				MCItemDef.create("oper_upper_yield", "oper_upper_yield"),
				MCItemDef.create("wip_rate", "wip_rate"),
				MCItemDef.create("bkf_flg", "bkf_flg")
			}
			,
			MCBlockDef.create("Ord_Sprt01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5010_Ord_Sprt02_INFO = new MCOperationInfo("MS", "MSBCL5010", "Ord_Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5010_Ord_Sprt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("inst_exp_flg", "inst_exp_flg"),
				MCItemDef.create("get_prov_upri_flg", "get_prov_upri_flg")
			}
			,
			MCBlockDef.create("Ord_Sprt02_Cnd")
		);
	}

	public static MCContainerDef MS_MSBCL5010_Ord_Sprt02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("cur_cd", "cur_cd")
			}
			,
			MCBlockDef.create("Ord_Sprt02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL5010_Ord_Sprt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Sprt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("bom_id", "bom_id"),
				MCItemDef.create("itm_seq", "itm_seq"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("mst_wg_cd", "mst_wg_cd"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("schd_in_dt", "schd_in_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("loss_rqmt_qty", "loss_rqmt_qty"),
				MCItemDef.create("inpt_qty", "inpt_qty"),
				MCItemDef.create("fxd_rqmt_qty", "fxd_rqmt_qty"),
				MCItemDef.create("alt_qty", "alt_qty"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno_typ1", "sno_typ1"),
				MCItemDef.create("sno_typ2", "sno_typ2"),
				MCItemDef.create("sno_typ3", "sno_typ3"),
				MCItemDef.create("sno_typ4", "sno_typ4"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_ratio", "chd_rqmt_ratio"),
				MCItemDef.create("chd_inpt_ratio", "chd_inpt_ratio"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
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
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("unit_conv_rnd_typ", "unit_conv_rnd_typ"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_upri", "prov_upri"),
				MCItemDef.create("prov_cur_cd", "prov_cur_cd"),
				MCItemDef.create("calc_inpt_qty", "calc_inpt_qty")
			}
			,
			MCBlockDef.create("Ord_Sprt02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5010_Ord_Sprt03_INFO = new MCOperationInfo("MS", "MSBCL5010", "Ord_Sprt03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5010_Ord_Sprt03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("dlv_cd", "dlv_cd")
			}
			,
			MCBlockDef.create("Ord_Sprt03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL5010_Ord_Sprt03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Sprt03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_lt", "mfg_lt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("xfr_lt", "xfr_lt"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("insp_offst", "insp_offst"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_lt", "insp_lt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("insp_flg", "insp_flg")
			}
			,
			MCBlockDef.create("Ord_Sprt03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5010_Ord_Sprt04_INFO = new MCOperationInfo("MS", "MSBCL5010", "Ord_Sprt04", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5010_Ord_Sprt04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Sprt04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ord" + ".itm_ord_typ", "itm_ord_typ"),
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
				MCItemDef.create("ord" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("ord" + ".inst_qty", "inst_qty"),
				MCItemDef.create("ord" + ".yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("ord" + ".po_schd_dt", "po_schd_dt"),
				MCItemDef.create("ord" + ".mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("ord" + ".mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("ord" + ".gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("ord" + ".strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("ord" + ".accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("ord" + ".insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("ord" + ".insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("ord" + ".avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("ord" + ".master_dt", "master_dt"),
				MCItemDef.create("ord" + ".sno1", "sno1"),
				MCItemDef.create("ord" + ".sno2", "sno2"),
				MCItemDef.create("ord" + ".sno3", "sno3"),
				MCItemDef.create("ord" + ".sno4", "sno4"),
				MCItemDef.create("ord" + ".rqmt_no", "rqmt_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Ord_Sprt04_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL5010_Ord_Sprt04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Sprt04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ord" + ".itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("ord" + ".itm_cd", "itm_cd"),
				MCItemDef.create("ord" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("ord" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("ord" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ord" + ".ver_no", "ver_no"),
				MCItemDef.create("ord" + ".strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("ord" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("ord" + ".mst_mfg_loc_cd", "mst_mfg_loc_cd"),
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
				MCItemDef.create("ord" + ".wg_cd", "wg_cd"),
				MCItemDef.create("ord" + ".ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("ord" + ".rqmt_no", "rqmt_no"),
				MCItemDef.create("strg_lg_grp_cd", "strg_lg_grp_cd"),
				MCItemDef.create("strg_sppl_cd", "strg_sppl_cd"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("rqst_lg_grp_cd", "rqst_lg_grp_cd"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_inst_qty", "cont_fctr_inst_qty"),
				MCItemDef.create("cont_fctr_schd_yield", "cont_fctr_schd_yield"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("strg_site_cd", "strg_site_cd"),
				MCItemDef.create("strg_site_nm", "strg_site_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("strg_lg_grp_nm", "strg_lg_grp_nm"),
				MCItemDef.create("strg_alloc_grp_cd", "strg_alloc_grp_cd"),
				MCItemDef.create("strg_alloc_grp_nm", "strg_alloc_grp_nm"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("mfg_site_cd", "mfg_site_cd"),
				MCItemDef.create("mfg_site_nm", "mfg_site_nm"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("mfg_loc_grp_nm", "mfg_loc_grp_nm"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_site_cd", "rqst_site_cd"),
				MCItemDef.create("rqst_site_nm", "rqst_site_nm"),
				MCItemDef.create("rqst_loc_grp_cd", "rqst_loc_grp_cd"),
				MCItemDef.create("rqst_loc_grp_nm", "rqst_loc_grp_nm"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm")
			}
			,
			MCBlockDef.create("Ord_Sprt04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5010_Ord_Chk01_INFO = new MCOperationInfo("MS", "MSBCL5010", "Ord_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5010_Ord_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("oper_ord_pr_flg", "oper_ord_pr_flg"),
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
				MCItemDef.create("ord" + ".mst_mfg_loc_cd", "mst_mfg_loc_cd"),
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
				MCItemDef.create("uplnd_outsrc_flg", "uplnd_outsrc_flg"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd")
			}
			,
			MCBlockDef.create("Ord_Chk01_Dtl1")
		);
	}

	public static MCContainerDef MS_MSBCL5010_Ord_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oord" + ".oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".oper_lt", "oper_lt"),
				MCItemDef.create("oord" + ".oper_offst_typ", "oper_offst_typ"),
				MCItemDef.create("oord" + ".oper_offst", "oper_offst"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".disp_seq", "disp_seq"),
				MCItemDef.create("oord" + ".oper_ptn", "oper_ptn"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oord" + ".itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("oord" + ".wg_cd", "wg_cd"),
				MCItemDef.create("oord" + ".yield_oper_flg", "yield_oper_flg")
			}
			,
			MCBlockDef.create("Ord_Chk01_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBCL5010_Ord_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ")
			}
			,
			MCBlockDef.create("Ord_Chk01_Dtl1")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5010_Ord_Chk02_INFO = new MCOperationInfo("MS", "MSBCL5010", "Ord_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5010_Ord_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("ord" + ".for_scheduler_frozen_flg", "for_scheduler_frozen_flg")
			}
			,
			MCBlockDef.create("Ord_Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL5010_Ord_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord" + ".itm_ord_typ", "itm_ord_typ"),
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
				MCItemDef.create("ord" + ".rqmt_no", "rqmt_no"),
				MCItemDef.create("ord" + ".inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("ord" + ".for_scheduler_frozen_flg", "for_scheduler_frozen_flg"),
				MCItemDef.create("strg_lg_grp_cd", "strg_lg_grp_cd"),
				MCItemDef.create("strg_sppl_cd", "strg_sppl_cd"),
				MCItemDef.create("rqst_to_lg_grp_cd", "rqst_to_lg_grp_cd"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ")
			}
			,
			MCBlockDef.create("Ord_Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5010_Ord_Upd02_INFO = new MCOperationInfo("MS", "MSBCL5010", "Ord_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5010_Ord_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("a_itm_ord_sts_typ", "a_itm_ord_sts_typ"),
				MCItemDef.create("b_itm_ord_sts_typ", "b_itm_ord_sts_typ"),
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
				MCItemDef.create("ord" + ".mst_mfg_loc_cd", "mst_mfg_loc_cd"),
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
				MCItemDef.create("ord" + ".rqmt_no", "rqmt_no"),
				MCItemDef.create("ord" + ".inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("ord" + ".sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("ord" + ".for_scheduler_frozen_flg", "for_scheduler_frozen_flg"),
				MCItemDef.create("is_src_mfg_inst_flg", "is_src_mfg_inst_flg"),
				MCItemDef.create("strg_lg_grp_cd", "strg_lg_grp_cd"),
				MCItemDef.create("strg_sppl_cd", "strg_sppl_cd"),
				MCItemDef.create("rqst_to_lg_grp_cd", "rqst_to_lg_grp_cd"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ")
			}
			,
			MCBlockDef.create("Ord_Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL5010_Ord_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Upd02",
			new MCItemDef[]{
				MCItemDef.create("a_itm_ord_sts_typ", "a_itm_ord_sts_typ"),
				MCItemDef.create("ord" + ".itm_ord_no", "itm_ord_no")
			}
			,
			MCBlockDef.create("Ord_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5010_Ord_Upd03_INFO = new MCOperationInfo("MS", "MSBCL5010", "Ord_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5010_Ord_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Upd03",
			new MCItemDef[]{
				MCItemDef.create("wk" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("wk" + ".oper_cd", "oper_cd"),
				MCItemDef.create("wk" + ".oper_seq", "oper_seq"),
				MCItemDef.create("wk" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("wk" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("wk" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("wk" + ".oper_schd_qty", "oper_schd_qty")
			}
			,
			MCBlockDef.create("Ord_Upd03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5010_Ord_Upd04_INFO = new MCOperationInfo("MS", "MSBCL5010", "Ord_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5010_Ord_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Upd04",
			new MCItemDef[]{
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("abort_flg", "abort_flg")
			}
			,
			MCBlockDef.create("Ord_Upd04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5010_Ord_Upd05_INFO = new MCOperationInfo("MS", "MSBCL5010", "Ord_Upd05", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5010_Ord_Upd05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Upd05",
			new MCItemDef[]{
				MCItemDef.create("itm_ord_no", "itm_ord_no")
			}
			,
			MCBlockDef.create("Ord_Upd05_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5010_Ord_Imp01_INFO = new MCOperationInfo("MS", "MSBCL5010", "Ord_Imp01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5010_Ord_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Imp01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("ord_gnrt_typ", "ord_gnrt_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4")
			}
			,
			MCBlockDef.create("Ord_Imp01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL5010_Ord_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Imp01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("ord_gnrt_typ", "ord_gnrt_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("nmr_qty", "nmr_qty"),
				MCItemDef.create("dnm_qty", "dnm_qty"),
				MCItemDef.create("fxd_yield_qty", "fxd_yield_qty"),
				MCItemDef.create("itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("mfg_lt", "mfg_lt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("xfr_lt", "xfr_lt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("insp_lt", "insp_lt"),
				MCItemDef.create("insp_offst", "insp_offst"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("not_fix_flg", "not_fix_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_inst_qty", "cont_fctr_inst_qty"),
				MCItemDef.create("cont_fctr_schd_yield", "cont_fctr_schd_yield"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("strg_site_cd", "strg_site_cd"),
				MCItemDef.create("strg_site_nm", "strg_site_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("strg_lg_grp_cd", "strg_lg_grp_cd"),
				MCItemDef.create("strg_lg_grp_nm", "strg_lg_grp_nm"),
				MCItemDef.create("strg_alloc_grp_cd", "strg_alloc_grp_cd"),
				MCItemDef.create("strg_alloc_grp_nm", "strg_alloc_grp_nm"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("mfg_site_cd", "mfg_site_cd"),
				MCItemDef.create("mfg_site_nm", "mfg_site_nm"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("mfg_loc_grp_nm", "mfg_loc_grp_nm"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_site_cd", "rqst_site_cd"),
				MCItemDef.create("rqst_site_nm", "rqst_site_nm"),
				MCItemDef.create("rqst_loc_grp_cd", "rqst_loc_grp_cd"),
				MCItemDef.create("rqst_loc_grp_nm", "rqst_loc_grp_nm"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm")
			}
			,
			MCBlockDef.create("Ord_Imp01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5010_Ord_Imp02_INFO = new MCOperationInfo("MS", "MSBCL5010", "Ord_Imp02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5010_Ord_Imp02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Imp02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oord" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ord_Imp02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL5010_Ord_Imp02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5010", "Ord_Imp02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_ord_typ", "itm_ord_typ"),
				MCItemDef.create("ord_gnrt_typ", "ord_gnrt_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("yield_schd_qty", "yield_schd_qty"),
				MCItemDef.create("inst_qty", "inst_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("nmr_qty", "nmr_qty"),
				MCItemDef.create("dnm_qty", "dnm_qty"),
				MCItemDef.create("fxd_yield_qty", "fxd_yield_qty"),
				MCItemDef.create("itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("mfg_lt", "mfg_lt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("xfr_lt", "xfr_lt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("insp_lt", "insp_lt"),
				MCItemDef.create("insp_offst", "insp_offst"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("not_fix_flg", "not_fix_flg"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_inst_qty", "cont_fctr_inst_qty"),
				MCItemDef.create("cont_fctr_schd_yield", "cont_fctr_schd_yield"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("strg_site_cd", "strg_site_cd"),
				MCItemDef.create("strg_site_nm", "strg_site_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("strg_lg_grp_cd", "strg_lg_grp_cd"),
				MCItemDef.create("strg_lg_grp_nm", "strg_lg_grp_nm"),
				MCItemDef.create("strg_alloc_grp_cd", "strg_alloc_grp_cd"),
				MCItemDef.create("strg_alloc_grp_nm", "strg_alloc_grp_nm"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("mfg_site_cd", "mfg_site_cd"),
				MCItemDef.create("mfg_site_nm", "mfg_site_nm"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("mfg_loc_grp_nm", "mfg_loc_grp_nm"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_site_cd", "rqst_site_cd"),
				MCItemDef.create("rqst_site_nm", "rqst_site_nm"),
				MCItemDef.create("rqst_loc_grp_cd", "rqst_loc_grp_cd"),
				MCItemDef.create("rqst_loc_grp_nm", "rqst_loc_grp_nm"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_order_upd_cntr", "itm_order_upd_cntr"),
				MCItemDef.create("oord" + ".oper_ord_sts_typ", "oper_ord_sts_typ"),
				MCItemDef.create("oord" + ".oper_cd", "oper_cd"),
				MCItemDef.create("oord" + ".oper_seq", "oper_seq"),
				MCItemDef.create("oord" + ".loc_cd", "loc_cd"),
				MCItemDef.create("oord" + ".oper_schd_qty", "oper_schd_qty"),
				MCItemDef.create("oord" + ".st_schd_tm", "st_schd_tm"),
				MCItemDef.create("oord" + ".end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oord" + ".oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oord" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oord" + ".sub_char1", "sub_char1"),
				MCItemDef.create("oord" + ".sub_char2", "sub_char2"),
				MCItemDef.create("oord" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ord_Imp02_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

