package mcframe.serverMSBC.MSBCL1040;

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
 * [MSBCL_MfgInstListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL1040.Srch01.UP.BLOCK0")){
			return MS_MSBCL1040_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1040.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL1040_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1040.Upd01.UP.BLOCK0")){
			return MS_MSBCL1040_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1040.Upd01.UP.BLOCK1")){
			return MS_MSBCL1040_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1040.Upd01.DOWN.BLOCK0")){
			return MS_MSBCL1040_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1040.Upd02.UP.BLOCK0")){
			return MS_MSBCL1040_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1040.Upd02.UP.BLOCK1")){
			return MS_MSBCL1040_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1040.Upd02.DOWN.BLOCK0")){
			return MS_MSBCL1040_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1040.Del01.UP.BLOCK0")){
			return MS_MSBCL1040_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1040.Del01.DOWN.BLOCK0")){
			return MS_MSBCL1040_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1040.Del02.UP.BLOCK0")){
			return MS_MSBCL1040_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1040.Del02.UP.BLOCK1")){
			return MS_MSBCL1040_Del02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1040.Del02.DOWN.BLOCK0")){
			return MS_MSBCL1040_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1040.Sprt01.UP.BLOCK0")){
			return MS_MSBCL1040_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1040.Sprt01.UP.BLOCK1")){
			return MS_MSBCL1040_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1040.Sprt01.DOWN.BLOCK0")){
			return MS_MSBCL1040_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1040.Prnt01.UP.BLOCK0")){
			return MS_MSBCL1040_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1040.Prnt01.DOWN.BLOCK0")){
			return MS_MSBCL1040_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBCL1040_Srch01_INFO = new MCOperationInfo("MS", "MSBCL1040", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1040_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("srch_mode", "srch_mode"),
				MCItemDef.create("tmp_sts_yet_flg", "tmp_sts_yet_flg"),
				MCItemDef.create("tmp_sts_sav_flg", "tmp_sts_sav_flg"),
				MCItemDef.create("tmp_sts_ord_flg", "tmp_sts_ord_flg"),
				MCItemDef.create("tmp_sts_stt_flg", "tmp_sts_stt_flg"),
				MCItemDef.create("tmp_sts_cmpl_flg", "tmp_sts_cmpl_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("not_inst_prnt_flg", "not_inst_prnt_flg"),
				MCItemDef.create("stk_lst_issue_flg", "stk_lst_issue_flg"),
				MCItemDef.create("not_stk_lst_issue_flg", "not_stk_lst_issue_flg"),
				MCItemDef.create("mes_tgt_flg", "mes_tgt_flg"),
				MCItemDef.create("not_mes_tgt_flg", "not_mes_tgt_flg"),
				MCItemDef.create("not_unschd_act_flg", "not_unschd_act_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("before_frozen_flg", "before_frozen_flg"),
				MCItemDef.create("frozen_flg", "frozen_flg"),
				MCItemDef.create("st_schd_dt_fr", "st_schd_dt_fr"),
				MCItemDef.create("st_schd_hm_fr", "st_schd_hm_fr"),
				MCItemDef.create("st_schd_dt_to", "st_schd_dt_to"),
				MCItemDef.create("st_schd_hm_to", "st_schd_hm_to"),
				MCItemDef.create("end_schd_dt_fr", "end_schd_dt_fr"),
				MCItemDef.create("end_schd_hm_fr", "end_schd_hm_fr"),
				MCItemDef.create("end_schd_dt_to", "end_schd_dt_to"),
				MCItemDef.create("end_schd_hm_to", "end_schd_hm_to"),
				MCItemDef.create("comp_dt_from_oper_flg", "comp_dt_from_oper_flg"),
				MCItemDef.create("rqst_dlv_rqst_dt_fr", "rqst_dlv_rqst_dt_fr"),
				MCItemDef.create("rqst_dlv_rqst_hm_fr", "rqst_dlv_rqst_hm_fr"),
				MCItemDef.create("rqst_dlv_rqst_dt_to", "rqst_dlv_rqst_dt_to"),
				MCItemDef.create("rqst_dlv_rqst_hm_to", "rqst_dlv_rqst_hm_to"),
				MCItemDef.create("inst_dt_fr", "inst_dt_fr"),
				MCItemDef.create("inst_dt_to", "inst_dt_to"),
				MCItemDef.create("aprv_dt_fr", "aprv_dt_fr"),
				MCItemDef.create("aprv_dt_to", "aprv_dt_to"),
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_loc_site_cd", "mfg_loc_site_cd"),
				MCItemDef.create("mfg_loc_site_nm", "mfg_loc_site_nm"),
				MCItemDef.create("mfg_loc_wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("mfg_loc_wg_nm", "mfg_loc_wg_nm"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("mfg_loc_grp_nm", "mfg_loc_grp_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("mfg_str_ln_nm", "mfg_str_ln_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_loc_nm", "oper_loc_nm"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("oper_str_ln_nm", "oper_str_ln_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wkk_nm", "wkk_nm"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_usr_nm", "aprv_usr_nm"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_dpt_nm", "aprv_dpt_nm"),
				MCItemDef.create("oper_usr_cd", "oper_usr_cd"),
				MCItemDef.create("oper_usr_nm", "oper_usr_nm"),
				MCItemDef.create("oper_rsrc", "oper_rsrc"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("po_aprv_sts_typ", "po_aprv_sts_typ"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("not_alloc_srch_flg", "not_alloc_srch_flg"),
				MCItemDef.create("all_alloc_srch_flg", "all_alloc_srch_flg"),
				MCItemDef.create("not_srch_opn_flg", "not_srch_opn_flg"),
				MCItemDef.create("not_srch_sav_flg", "not_srch_sav_flg"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("disp_pd", "disp_pd"),
				MCItemDef.create("oper_inst_rpt_rmrks", "oper_inst_rpt_rmrks"),
				MCItemDef.create("oper_intr_rmrks", "oper_intr_rmrks"),
				MCItemDef.create("oper_inst_sub_char1", "oper_inst_sub_char1"),
				MCItemDef.create("oper_inst_sub_char2", "oper_inst_sub_char2"),
				MCItemDef.create("oper_inst_sub_char3", "oper_inst_sub_char3"),
				MCItemDef.create("itm_mfg_inst_sub_char1", "itm_mfg_inst_sub_char1"),
				MCItemDef.create("itm_mfg_inst_sub_char2", "itm_mfg_inst_sub_char2"),
				MCItemDef.create("itm_mfg_inst_sub_char3", "itm_mfg_inst_sub_char3"),
				MCItemDef.create("mfg_inst_sub_char1", "mfg_inst_sub_char1"),
				MCItemDef.create("mfg_inst_sub_char2", "mfg_inst_sub_char2"),
				MCItemDef.create("mfg_inst_sub_char3", "mfg_inst_sub_char3"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("sppl_grp_flg1", "sppl_grp_flg1"),
				MCItemDef.create("sppl_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_flg2", "sppl_grp_flg2"),
				MCItemDef.create("sppl_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_flg3", "sppl_grp_flg3"),
				MCItemDef.create("sppl_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_flg4", "sppl_grp_flg4"),
				MCItemDef.create("sppl_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_flg5", "sppl_grp_flg5"),
				MCItemDef.create("sppl_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_flg6", "sppl_grp_flg6"),
				MCItemDef.create("sppl_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_flg7", "sppl_grp_flg7"),
				MCItemDef.create("sppl_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_flg8", "sppl_grp_flg8"),
				MCItemDef.create("sppl_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_flg9", "sppl_grp_flg9"),
				MCItemDef.create("sppl_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_flg10", "sppl_grp_flg10"),
				MCItemDef.create("sppl_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL1040_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_mtd_typ_nm", "mfg_mtd_typ_nm"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("mfg_str_ln_tgt_flg", "mfg_str_ln_tgt_flg"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("mst_yield_schd_qty", "mst_yield_schd_qty"),
				MCItemDef.create("mst_mfg_inst_qty", "mst_mfg_inst_qty"),
				MCItemDef.create("mst_fxd_rqmt_qty", "mst_fxd_rqmt_qty"),
				MCItemDef.create("lot_issue_typ", "lot_issue_typ"),
				MCItemDef.create("ln_stk_flg", "ln_stk_flg"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("rqst_dlv_rqst_hm", "rqst_dlv_rqst_hm"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("st_schd_hm", "st_schd_hm"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("end_schd_hm", "end_schd_hm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("mfg_str_ln_nm", "mfg_str_ln_nm"),
				MCItemDef.create("mfg_str_ln_cd_none_flg", "mfg_str_ln_cd_none_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("po_locked_flg", "po_locked_flg"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oper_inst_rpt_rmrks", "oper_inst_rpt_rmrks"),
				MCItemDef.create("oper_intr_rmrks", "oper_intr_rmrks"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("disp_pd", "disp_pd"),
				MCItemDef.create("itm_lower_yield", "itm_lower_yield"),
				MCItemDef.create("itm_std_yield", "itm_std_yield"),
				MCItemDef.create("itm_upper_yield", "itm_upper_yield"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("inst_prnt_tm", "inst_prnt_tm"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mfg_inst_unit_typ_nm", "mfg_inst_unit_typ_nm"),
				MCItemDef.create("unschd_inst_flg", "unschd_inst_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("schd_chg_flg", "schd_chg_flg"),
				MCItemDef.create("base_unit_ord_qty", "base_unit_ord_qty"),
				MCItemDef.create("base_unit_not_inst_qty", "base_unit_not_inst_qty"),
				MCItemDef.create("ord_abort_flg", "ord_abort_flg"),
				MCItemDef.create("mfg_loc_wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("mfg_loc_wg_nm", "mfg_loc_wg_nm"),
				MCItemDef.create("mfg_loc_site_cd", "mfg_loc_site_cd"),
				MCItemDef.create("mfg_loc_site_nm", "mfg_loc_site_nm"),
				MCItemDef.create("mfg_loc_grp_cd", "mfg_loc_grp_cd"),
				MCItemDef.create("mfg_loc_grp_nm", "mfg_loc_grp_nm"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_aprv_sts_typ", "po_aprv_sts_typ"),
				MCItemDef.create("po_aprv_sts_typ_nm", "po_aprv_sts_typ_nm"),
				MCItemDef.create("po_auto_reg_flg", "po_auto_reg_flg"),
				MCItemDef.create("frst_mfg_inst_flg", "frst_mfg_inst_flg"),
				MCItemDef.create("itm_mfg_inst_sub_char1", "itm_mfg_inst_sub_char1"),
				MCItemDef.create("itm_mfg_inst_sub_char2", "itm_mfg_inst_sub_char2"),
				MCItemDef.create("itm_mfg_inst_sub_char3", "itm_mfg_inst_sub_char3"),
				MCItemDef.create("mfg_inst_sub_char1", "mfg_inst_sub_char1"),
				MCItemDef.create("mfg_inst_sub_char2", "mfg_inst_sub_char2"),
				MCItemDef.create("mfg_inst_sub_char3", "mfg_inst_sub_char3"),
				MCItemDef.create("tm_th_image", "tm_th_image"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_tm", "aprv_tm"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_dpt_nm", "aprv_dpt_nm"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_usr_nm", "aprv_usr_nm"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("aprv_tgt_flg", "aprv_tgt_flg"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("oper_base_unit_qty", "oper_base_unit_qty"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("oper_unit_qty", "oper_unit_qty"),
				MCItemDef.create("oper_unit_dec_place", "oper_unit_dec_place"),
				MCItemDef.create("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_unit_nm", "oper_unit_nm"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_loc_nm", "oper_loc_nm"),
				MCItemDef.create("oper_str_ln_tgt_flg", "oper_str_ln_tgt_flg"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("oper_str_ln_nm", "oper_str_ln_nm"),
				MCItemDef.create("oper_str_ln_cd_none_flg", "oper_str_ln_cd_none_flg"),
				MCItemDef.create("oper_lower_yield", "oper_lower_yield"),
				MCItemDef.create("oper_std_yield", "oper_std_yield"),
				MCItemDef.create("oper_upper_yield", "oper_upper_yield"),
				MCItemDef.create("oper_usr_cd", "oper_usr_cd"),
				MCItemDef.create("oper_usr_nm", "oper_usr_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_rsrc", "oper_rsrc"),
				MCItemDef.create("oper_inst_sub_char1", "oper_inst_sub_char1"),
				MCItemDef.create("oper_inst_sub_char2", "oper_inst_sub_char2"),
				MCItemDef.create("oper_inst_sub_char3", "oper_inst_sub_char3"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("last_mes_flg", "last_mes_flg"),
				MCItemDef.create("mes_tgt_flg", "mes_tgt_flg"),
				MCItemDef.create("oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
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
				MCItemDef.create("sppl_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10"),
				MCItemDef.create("for_scheduler_frozen_flg", "for_scheduler_frozen_flg"),
				MCItemDef.create("scheduler_frozen_flg", "scheduler_frozen_flg"),
				MCItemDef.create("scheduler_frozen_itm_flg", "scheduler_frozen_itm_flg"),
				MCItemDef.create("scheduler_frozen_oper_flg", "scheduler_frozen_oper_flg"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
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
	
	static final MCOperationInfo MS_MSBCL1040_Upd01_INFO = new MCOperationInfo("MS", "MSBCL1040", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1040_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("alloc_ope_flg", "alloc_ope_flg"),
				MCItemDef.create("oper_unit_flg", "oper_unit_flg"),
				MCItemDef.create("re_alloc_mode_flg", "re_alloc_mode_flg"),
				MCItemDef.create("inst_immed_prnt_flg", "inst_immed_prnt_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL1040_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("oper_base_unit_qty", "oper_base_unit_qty"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("oper_rsrc", "oper_rsrc"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("po_locked_flg", "po_locked_flg"),
				MCItemDef.create("ord_abort_flg", "ord_abort_flg"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("oper_inst_rpt_rmrks", "oper_inst_rpt_rmrks"),
				MCItemDef.create("oper_intr_rmrks", "oper_intr_rmrks"),
				MCItemDef.create("disp_pd", "disp_pd"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("mes_flg", "mes_flg"),
				MCItemDef.create("oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("itm_mfg_inst_sub_char1", "itm_mfg_inst_sub_char1"),
				MCItemDef.create("itm_mfg_inst_sub_char2", "itm_mfg_inst_sub_char2"),
				MCItemDef.create("itm_mfg_inst_sub_char3", "itm_mfg_inst_sub_char3"),
				MCItemDef.create("mfg_inst_sub_char1", "mfg_inst_sub_char1"),
				MCItemDef.create("mfg_inst_sub_char2", "mfg_inst_sub_char2"),
				MCItemDef.create("mfg_inst_sub_char3", "mfg_inst_sub_char3"),
				MCItemDef.create("oper_inst_sub_char1", "oper_inst_sub_char1"),
				MCItemDef.create("oper_inst_sub_char2", "oper_inst_sub_char2"),
				MCItemDef.create("oper_inst_sub_char3", "oper_inst_sub_char3"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBCL1040_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1040_Upd02_INFO = new MCOperationInfo("MS", "MSBCL1040", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1040_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_tm", "aprv_tm"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("Upd02_Dtl")
		);
	}

	public static MCContainerDef MS_MSBCL1040_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("aprv_rsn", "aprv_rsn")
			}
			,
			MCBlockDef.create("Upd02_BulkSet")
		);
	}


	public static MCContainerDef MS_MSBCL1040_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1040_Del01_INFO = new MCOperationInfo("MS", "MSBCL1040", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1040_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("frst_mfg_inst_flg", "frst_mfg_inst_flg"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("xfr_inst_del_enable_flg", "xfr_inst_del_enable_flg")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBCL1040_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1040_Del02_INFO = new MCOperationInfo("MS", "MSBCL1040", "Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1040_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Del02",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("Del02_Dtl")
		);
	}

	public static MCContainerDef MS_MSBCL1040_Del02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Del02",
			new MCItemDef[]{
				MCItemDef.create("aprv_rsn", "aprv_rsn")
			}
			,
			MCBlockDef.create("Del02_BulkSet")
		);
	}


	public static MCContainerDef MS_MSBCL1040_Del02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Del02",
			new MCItemDef[]{
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1040_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL1040", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1040_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("lot_issue_flg", "lot_issue_flg"),
				MCItemDef.create("sublot_issue_flg", "sublot_issue_flg")
			}
			,
			MCBlockDef.create("Sprt01_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBCL1040_Sprt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("lot_issue_typ", "lot_issue_typ"),
				MCItemDef.create("yield_dt", "yield_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("mfg_loc_site_cd", "mfg_loc_site_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg")
			}
			,
			MCBlockDef.create("Sprt01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBCL1040_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("Sprt01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1040_Prnt01_INFO = new MCOperationInfo("MS", "MSBCL1040", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1040_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL1040_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1040", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("inst_prnt_tm", "inst_prnt_tm"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Prnt01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

