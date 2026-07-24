package mcframe.serverMSBC.MSBCL1010;

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
 * [MSBCL_MfgInstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL1010.Srch01.UP.BLOCK0")){
			return MS_MSBCL1010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL1010_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Srch01.DOWN.BLOCK1")){
			return MS_MSBCL1010_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1010.Srch01.DOWN.BLOCK2")){
			return MS_MSBCL1010_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1010.Srch01.DOWN.BLOCK3")){
			return MS_MSBCL1010_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL1010.Srch01.DOWN.BLOCK4")){
			return MS_MSBCL1010_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL1010.Srch01.DOWN.BLOCK5")){
			return MS_MSBCL1010_Srch01_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBCL1010.Srch01.DOWN.BLOCK6")){
			return MS_MSBCL1010_Srch01_DOWN_BLOCK6();
		}
		else if (id.equals("MS.MSBCL1010.Upd01.UP.BLOCK0")){
			return MS_MSBCL1010_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Upd01.UP.BLOCK1")){
			return MS_MSBCL1010_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1010.Upd01.UP.BLOCK2")){
			return MS_MSBCL1010_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1010.Upd01.UP.BLOCK3")){
			return MS_MSBCL1010_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBCL1010.Upd01.UP.BLOCK4")){
			return MS_MSBCL1010_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBCL1010.Upd01.UP.BLOCK5")){
			return MS_MSBCL1010_Upd01_UP_BLOCK5();
		}
		else if (id.equals("MS.MSBCL1010.Upd01.UP.BLOCK6")){
			return MS_MSBCL1010_Upd01_UP_BLOCK6();
		}
		else if (id.equals("MS.MSBCL1010.Upd01.DOWN.BLOCK0")){
			return MS_MSBCL1010_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Upd01.DOWN.BLOCK1")){
			return MS_MSBCL1010_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1010.Upd01.DOWN.BLOCK2")){
			return MS_MSBCL1010_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1010.Upd01.DOWN.BLOCK3")){
			return MS_MSBCL1010_Upd01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL1010.Upd01.DOWN.BLOCK4")){
			return MS_MSBCL1010_Upd01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL1010.Upd01.DOWN.BLOCK5")){
			return MS_MSBCL1010_Upd01_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBCL1010.Upd02.UP.BLOCK0")){
			return MS_MSBCL1010_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Upd02.DOWN.BLOCK0")){
			return MS_MSBCL1010_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Del01.UP.BLOCK0")){
			return MS_MSBCL1010_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Del01.UP.BLOCK1")){
			return MS_MSBCL1010_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1010.Del02.UP.BLOCK0")){
			return MS_MSBCL1010_Del02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Del02.DOWN.BLOCK0")){
			return MS_MSBCL1010_Del02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Prnt01.UP.BLOCK0")){
			return MS_MSBCL1010_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Prnt01.DOWN.BLOCK0")){
			return MS_MSBCL1010_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Prnt02.UP.BLOCK0")){
			return MS_MSBCL1010_Prnt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Sprt01.UP.BLOCK0")){
			return MS_MSBCL1010_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Sprt01.DOWN.BLOCK0")){
			return MS_MSBCL1010_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Sprt02.UP.BLOCK0")){
			return MS_MSBCL1010_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Sprt02.DOWN.BLOCK0")){
			return MS_MSBCL1010_Sprt02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Sprt02.DOWN.BLOCK1")){
			return MS_MSBCL1010_Sprt02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1010.Sprt02.DOWN.BLOCK2")){
			return MS_MSBCL1010_Sprt02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1010.Sprt02.DOWN.BLOCK3")){
			return MS_MSBCL1010_Sprt02_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL1010.Sprt02.DOWN.BLOCK4")){
			return MS_MSBCL1010_Sprt02_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBCL1010.Sprt03.UP.BLOCK0")){
			return MS_MSBCL1010_Sprt03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Sprt03.UP.BLOCK1")){
			return MS_MSBCL1010_Sprt03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1010.Sprt03.UP.BLOCK2")){
			return MS_MSBCL1010_Sprt03_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1010.Sprt03.DOWN.BLOCK0")){
			return MS_MSBCL1010_Sprt03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Sprt03.DOWN.BLOCK1")){
			return MS_MSBCL1010_Sprt03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1010.Sprt03.DOWN.BLOCK2")){
			return MS_MSBCL1010_Sprt03_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1010.Sprt03.DOWN.BLOCK3")){
			return MS_MSBCL1010_Sprt03_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBCL1010.Sprt07.UP.BLOCK0")){
			return MS_MSBCL1010_Sprt07_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Sprt07.UP.BLOCK1")){
			return MS_MSBCL1010_Sprt07_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1010.Sprt07.UP.BLOCK2")){
			return MS_MSBCL1010_Sprt07_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1010.Sprt07.DOWN.BLOCK0")){
			return MS_MSBCL1010_Sprt07_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Sprt08.UP.BLOCK0")){
			return MS_MSBCL1010_Sprt08_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Sprt08.UP.BLOCK1")){
			return MS_MSBCL1010_Sprt08_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL1010.Sprt08.UP.BLOCK2")){
			return MS_MSBCL1010_Sprt08_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBCL1010.Sprt08.DOWN.BLOCK0")){
			return MS_MSBCL1010_Sprt08_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Sprt09.UP.BLOCK0")){
			return MS_MSBCL1010_Sprt09_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL1010.Sprt09.DOWN.BLOCK0")){
			return MS_MSBCL1010_Sprt09_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
													
	
	static final MCOperationInfo MS_MSBCL1010_Srch01_INFO = new MCOperationInfo("MS", "MSBCL1010", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1010_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("srch_tgt_typ", "srch_tgt_typ"),
				MCItemDef.create("srch_tgt_no", "srch_tgt_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL1010_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Srch01",
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
				MCItemDef.create("inpt_itm_add_flg", "inpt_itm_add_flg"),
				MCItemDef.create("inpt_itm_del_flg", "inpt_itm_del_flg"),
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
				MCItemDef.create("org_inst_abort_flg", "org_inst_abort_flg"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("disp_pd", "disp_pd"),
				MCItemDef.create("itm_lower_yield", "itm_lower_yield"),
				MCItemDef.create("itm_std_yield", "itm_std_yield"),
				MCItemDef.create("itm_upper_yield", "itm_upper_yield"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("latest_flg", "latest_flg"),
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
				MCItemDef.create("ord_mfg_st_schd_dt", "ord_mfg_st_schd_dt"),
				MCItemDef.create("ord_mfg_end_schd_dt", "ord_mfg_end_schd_dt"),
				MCItemDef.create("itm_ord_sts_typ", "itm_ord_sts_typ"),
				MCItemDef.create("mfg_loc_wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("mfg_loc_wg_nm", "mfg_loc_wg_nm"),
				MCItemDef.create("mfg_loc_site_cd", "mfg_loc_site_cd"),
				MCItemDef.create("mfg_loc_site_nm", "mfg_loc_site_nm"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_aprv_sts_typ", "po_aprv_sts_typ"),
				MCItemDef.create("po_aprv_sts_typ_nm", "po_aprv_sts_typ_nm"),
				MCItemDef.create("po_auto_reg_flg", "po_auto_reg_flg"),
				MCItemDef.create("for_scheduler_frozen_flg", "for_scheduler_frozen_flg"),
				MCItemDef.create("itm_mfg_inst_sub_char1", "itm_mfg_inst_sub_char1"),
				MCItemDef.create("itm_mfg_inst_sub_char2", "itm_mfg_inst_sub_char2"),
				MCItemDef.create("itm_mfg_inst_sub_char3", "itm_mfg_inst_sub_char3"),
				MCItemDef.create("mfg_inst_sub_char1", "mfg_inst_sub_char1"),
				MCItemDef.create("mfg_inst_sub_char2", "mfg_inst_sub_char2"),
				MCItemDef.create("mfg_inst_sub_char3", "mfg_inst_sub_char3"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_tm", "aprv_tm"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_dpt_nm", "aprv_dpt_nm"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_usr_nm", "aprv_usr_nm"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("frst_mfg_inst_flg", "frst_mfg_inst_flg")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("st_schd_hm", "st_schd_hm"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("end_schd_hm", "end_schd_hm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("oper_unit_qty", "oper_unit_qty"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ"),
				MCItemDef.create("oper_unit_dec_place", "oper_unit_dec_place"),
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
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("oper_abort_flg", "oper_abort_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_rsrc", "oper_rsrc"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("scheduler_frozen_flg", "scheduler_frozen_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("unschd_inst_flg", "unschd_inst_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio"),
				MCItemDef.create("last_mes_flg", "last_mes_flg"),
				MCItemDef.create("mes_tgt_flg", "mes_tgt_flg")
			}
			,
			MCBlockDef.create("Srch01_DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("base_unit_alt_qty", "base_unit_alt_qty"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("base_unit_rqmt_qty", "base_unit_rqmt_qty"),
				MCItemDef.create("base_unit_fxd_rqmt_qty", "base_unit_fxd_rqmt_qty"),
				MCItemDef.create("base_unit_sum_rqmt_qty", "base_unit_sum_rqmt_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("sum_cont_rqmt_qty", "sum_cont_rqmt_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("schd_hm", "schd_hm"),
				MCItemDef.create("lot_prop_tgt_flg", "lot_prop_tgt_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("no_lot_fix_flg", "no_lot_fix_flg"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_loc_nm", "inpt_loc_nm"),
				MCItemDef.create("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_str_ln_nm", "inpt_str_ln_nm"),
				MCItemDef.create("inpt_str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_rsn_nm", "inpt_rsn_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("bkf_typ_nm", "bkf_typ_nm"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("bom_id_no", "bom_id_no"),
				MCItemDef.create("chd_itm_seq", "chd_itm_seq"),
				MCItemDef.create("bom_memo1", "bom_memo1"),
				MCItemDef.create("bom_memo2", "bom_memo2"),
				MCItemDef.create("bom_memo3", "bom_memo3"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
				MCItemDef.create("split_row_flg", "split_row_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("alloc_ctl_typ_nm", "alloc_ctl_typ_nm"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ_nm", "inpt_ctl_typ_nm"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst_typ_nm", "in_offst_typ_nm"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_mng_typ_nm", "stk_mng_typ_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_typ_nm", "alt_itm_typ_nm"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("fxd_loss_rsn_none_flg", "fxd_loss_rsn_none_flg")
			}
			,
			MCBlockDef.create("Srch01_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Srch01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("sum_wk_cost", "sum_wk_cost"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_dec_place", "wk_cost_dec_place"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Srch01_DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Srch01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("schd_hm", "schd_hm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Srch01_DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Srch01_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("th_image", "th_image"),
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
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("schd_hm", "schd_hm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Srch01_DtlByProd")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Srch01_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ref_ord", "ref_ord"),
				MCItemDef.create("chng_no", "chng_no"),
				MCItemDef.create("re_ext_typ", "re_ext_typ"),
				MCItemDef.create("re_ext_typ_nm", "re_ext_typ_nm"),
				MCItemDef.create("unneces_flg", "unneces_flg"),
				MCItemDef.create("oper_chng_flg", "oper_chng_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("plm_cnt_rmrks", "plm_cnt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Srch01_DtlReExt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1010_Upd01_INFO = new MCOperationInfo("MS", "MSBCL1010", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1010_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("inst_dt", "inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("po_locked_flg", "po_locked_flg"),
				MCItemDef.create("inst_abort_flg", "inst_abort_flg"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("disp_pd", "disp_pd"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("inst_immed_prnt_flg", "inst_immed_prnt_flg"),
				MCItemDef.create("chg_list_immed_prnt_flg", "chg_list_immed_prnt_flg"),
				MCItemDef.create("xfr_inst_del_enable_flg", "xfr_inst_del_enable_flg"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("ord_abort_flg", "ord_abort_flg"),
				MCItemDef.create("itm_mfg_inst_sub_char1", "itm_mfg_inst_sub_char1"),
				MCItemDef.create("itm_mfg_inst_sub_char2", "itm_mfg_inst_sub_char2"),
				MCItemDef.create("itm_mfg_inst_sub_char3", "itm_mfg_inst_sub_char3"),
				MCItemDef.create("mfg_inst_sub_char1", "mfg_inst_sub_char1"),
				MCItemDef.create("mfg_inst_sub_char2", "mfg_inst_sub_char2"),
				MCItemDef.create("mfg_inst_sub_char3", "mfg_inst_sub_char3"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("comp_dt_from_oper_flg", "comp_dt_from_oper_flg")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL1010_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("st_schd_tm", "st_schd_tm"),
				MCItemDef.create("end_schd_tm", "end_schd_tm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("oper_abort_flg", "oper_abort_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_rsrc", "oper_rsrc"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mes_flg", "mes_flg")
			}
			,
			MCBlockDef.create("Upd01_DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL1010_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("base_unit_alt_qty", "base_unit_alt_qty"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("base_unit_rqmt_qty", "base_unit_rqmt_qty"),
				MCItemDef.create("base_unit_fxd_rqmt_qty", "base_unit_fxd_rqmt_qty"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("schd_tm", "schd_tm"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("no_lot_fix_flg", "no_lot_fix_flg"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("bom_id_no", "bom_id_no"),
				MCItemDef.create("chd_itm_seq", "chd_itm_seq"),
				MCItemDef.create("bom_memo1", "bom_memo1"),
				MCItemDef.create("bom_memo2", "bom_memo2"),
				MCItemDef.create("bom_memo3", "bom_memo3"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no")
			}
			,
			MCBlockDef.create("Upd01_DtlInpt")
		);
	}

	public static MCContainerDef MS_MSBCL1010_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("wk_schd_no", "wk_schd_no")
			}
			,
			MCBlockDef.create("Upd01_DtlWk")
		);
	}

	public static MCContainerDef MS_MSBCL1010_Upd01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("schd_tm", "schd_tm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no")
			}
			,
			MCBlockDef.create("Upd01_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL1010_Upd01_UP_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("schd_tm", "schd_tm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no")
			}
			,
			MCBlockDef.create("Upd01_DtlByProd")
		);
	}

	public static MCContainerDef MS_MSBCL1010_Upd01_UP_BLOCK6() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ref_ord", "ref_ord"),
				MCItemDef.create("re_ext_typ", "re_ext_typ"),
				MCItemDef.create("unneces_flg", "unneces_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Upd01_DtlReExt")
		);
	}


	public static MCContainerDef MS_MSBCL1010_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("itm_ord_no", "itm_ord_no")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("oper_inst_no", "oper_inst_no")
			}
			,
			MCBlockDef.create("Upd01_DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("inpt_str_ln_nm", "inpt_str_ln_nm"),
				MCItemDef.create("inpt_str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg")
			}
			,
			MCBlockDef.create("Upd01_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Upd01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Upd01_DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Upd01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Upd01_DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Upd01_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Upd01_DtlByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1010_Upd02_INFO = new MCOperationInfo("MS", "MSBCL1010", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1010_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("aprv_dt", "aprv_dt"),
				MCItemDef.create("aprv_dpt_cd", "aprv_dpt_cd"),
				MCItemDef.create("aprv_usr_cd", "aprv_usr_cd"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr")
			}
			,
			MCBlockDef.create("Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL1010_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1010_Del01_INFO = new MCOperationInfo("MS", "MSBCL1010", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1010_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_ord_upd_cntr", "itm_ord_upd_cntr"),
				MCItemDef.create("itm_mfg_inst_upd_cntr", "itm_mfg_inst_upd_cntr"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr"),
				MCItemDef.create("xfr_inst_del_enable_flg", "xfr_inst_del_enable_flg")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL1010_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mes_flg", "mes_flg")
			}
			,
			MCBlockDef.create("Del01_DtlOper")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1010_Del02_INFO = new MCOperationInfo("MS", "MSBCL1010", "Del02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1010_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Del02",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("aprv_rsn", "aprv_rsn"),
				MCItemDef.create("mfg_inst_upd_cntr", "mfg_inst_upd_cntr")
			}
			,
			MCBlockDef.create("Del02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL1010_Del02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Del02",
			new MCItemDef[]{
				MCItemDef.create("mfg_aprv_sts_typ", "mfg_aprv_sts_typ"),
				MCItemDef.create("mfg_aprv_sts_typ_nm", "mfg_aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Del02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1010_Prnt01_INFO = new MCOperationInfo("MS", "MSBCL1010", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1010_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev")
			}
			,
			MCBlockDef.create("Prnt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBCL1010_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("inst_prnt_tm", "inst_prnt_tm")
			}
			,
			MCBlockDef.create("Prnt01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1010_Prnt02_INFO = new MCOperationInfo("MS", "MSBCL1010", "Prnt02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1010_Prnt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Prnt02",
			new MCItemDef[]{
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev")
			}
			,
			MCBlockDef.create("Prnt02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1010_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL1010", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1010_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("base_unit_alt_qty", "base_unit_alt_qty"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("base_unit_rqmt_qty", "base_unit_rqmt_qty"),
				MCItemDef.create("base_unit_fxd_rqmt_qty", "base_unit_fxd_rqmt_qty"),
				MCItemDef.create("base_unit_sum_rqmt_qty", "base_unit_sum_rqmt_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("sum_cont_rqmt_qty", "sum_cont_rqmt_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("lot_prop_tgt_flg", "lot_prop_tgt_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("no_lot_fix_flg", "no_lot_fix_flg"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("set_stk_str_ln_flg", "set_stk_str_ln_flg")
			}
			,
			MCBlockDef.create("Srch01_DtlInpt")
		);
	}


	public static MCContainerDef MS_MSBCL1010_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("base_unit_rqmt_qty", "base_unit_rqmt_qty"),
				MCItemDef.create("base_unit_fxd_rqmt_qty", "base_unit_fxd_rqmt_qty"),
				MCItemDef.create("base_unit_sum_rqmt_qty", "base_unit_sum_rqmt_qty"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("sum_cont_rqmt_qty", "sum_cont_rqmt_qty"),
				MCItemDef.create("lot_prop_tgt_flg", "lot_prop_tgt_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("no_lot_fix_flg", "no_lot_fix_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_str_ln_nm", "inpt_str_ln_nm"),
				MCItemDef.create("inpt_str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("oper_inst_no", "oper_inst_no")
			}
			,
			MCBlockDef.create("Srch01_DtlInpt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1010_Sprt02_INFO = new MCOperationInfo("MS", "MSBCL1010", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1010_Sprt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_loc_wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("mfg_inst_unit_typ", "mfg_inst_unit_typ"),
				MCItemDef.create("mfg_str_ln_cd", "mfg_str_ln_cd"),
				MCItemDef.create("mfg_str_ln_nm", "mfg_str_ln_nm"),
				MCItemDef.create("mfg_str_ln_cd_none_flg", "mfg_str_ln_cd_none_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg")
			}
			,
			MCBlockDef.create("Sprt02_Hdr")
		);
	}


	public static MCContainerDef MS_MSBCL1010_Sprt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("st_schd_hm", "st_schd_hm"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("end_schd_hm", "end_schd_hm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("oper_unit_qty", "oper_unit_qty"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ"),
				MCItemDef.create("oper_unit_dec_place", "oper_unit_dec_place"),
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
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("oper_abort_flg", "oper_abort_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_rsrc", "oper_rsrc"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bkf_flg", "bkf_flg"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("oper_inst_grp", "oper_inst_grp"),
				MCItemDef.create("oper_ord_no", "oper_ord_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("unschd_inst_flg", "unschd_inst_flg"),
				MCItemDef.create("unschd_act_flg", "unschd_act_flg"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio"),
				MCItemDef.create("last_mes_flg", "last_mes_flg"),
				MCItemDef.create("mes_tgt_flg", "mes_tgt_flg")
			}
			,
			MCBlockDef.create("Srch01_DtlOper")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Sprt02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("base_unit_alt_qty", "base_unit_alt_qty"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("base_unit_rqmt_qty", "base_unit_rqmt_qty"),
				MCItemDef.create("base_unit_fxd_rqmt_qty", "base_unit_fxd_rqmt_qty"),
				MCItemDef.create("base_unit_sum_rqmt_qty", "base_unit_sum_rqmt_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("sum_cont_rqmt_qty", "sum_cont_rqmt_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("schd_hm", "schd_hm"),
				MCItemDef.create("lot_prop_tgt_flg", "lot_prop_tgt_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("no_lot_fix_flg", "no_lot_fix_flg"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_loc_nm", "inpt_loc_nm"),
				MCItemDef.create("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_str_ln_nm", "inpt_str_ln_nm"),
				MCItemDef.create("inpt_str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_rsn_nm", "inpt_rsn_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("bkf_typ_nm", "bkf_typ_nm"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("bom_id_no", "bom_id_no"),
				MCItemDef.create("chd_itm_seq", "chd_itm_seq"),
				MCItemDef.create("bom_memo1", "bom_memo1"),
				MCItemDef.create("bom_memo2", "bom_memo2"),
				MCItemDef.create("bom_memo3", "bom_memo3"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
				MCItemDef.create("split_row_flg", "split_row_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("alloc_ctl_typ_nm", "alloc_ctl_typ_nm"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ_nm", "inpt_ctl_typ_nm"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst_typ_nm", "in_offst_typ_nm"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_mng_typ_nm", "stk_mng_typ_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_typ_nm", "alt_itm_typ_nm"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("fxd_loss_rsn_none_flg", "fxd_loss_rsn_none_flg")
			}
			,
			MCBlockDef.create("Srch01_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Sprt02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("sum_wk_cost", "sum_wk_cost"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_dec_place", "wk_cost_dec_place"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Srch01_DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Sprt02_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("schd_hm", "schd_hm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Srch01_DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Sprt02_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("th_image", "th_image"),
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
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("schd_hm", "schd_hm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Srch01_DtlByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1010_Sprt03_INFO = new MCOperationInfo("MS", "MSBCL1010", "Sprt03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1010_Sprt03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("oper_ptn", "oper_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("base_unit_inst_qty", "base_unit_inst_qty"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_inst_rev", "mfg_inst_rev"),
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg")
			}
			,
			MCBlockDef.create("Sprt03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL1010_Sprt03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("oper_loc_cd", "oper_loc_cd"),
				MCItemDef.create("oper_str_ln_cd", "oper_str_ln_cd"),
				MCItemDef.create("oper_str_ln_nm", "oper_str_ln_nm"),
				MCItemDef.create("oper_str_ln_cd_none_flg", "oper_str_ln_cd_none_flg"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("yield_oper_flg", "yield_oper_flg"),
				MCItemDef.create("yield_oper_ratio", "yield_oper_ratio")
			}
			,
			MCBlockDef.create("Srch01_DtlOper")
		);
	}

	public static MCContainerDef MS_MSBCL1010_Sprt03_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("inpt_re_ext_flg", "inpt_re_ext_flg"),
				MCItemDef.create("wk_re_ext_flg", "wk_re_ext_flg"),
				MCItemDef.create("byprod_re_ext_flg", "byprod_re_ext_flg")
			}
			,
			MCBlockDef.create("Sprt03_HdrFlg")
		);
	}


	public static MCContainerDef MS_MSBCL1010_Sprt03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("th_image", "th_image"),
				MCItemDef.create("alt_grp_cd", "alt_grp_cd"),
				MCItemDef.create("alt_grp_nm", "alt_grp_nm"),
				MCItemDef.create("alt_grp_seq", "alt_grp_seq"),
				MCItemDef.create("alt_itm_fix_flg", "alt_itm_fix_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("base_unit_alt_qty", "base_unit_alt_qty"),
				MCItemDef.create("base_unit_inpt_qty", "base_unit_inpt_qty"),
				MCItemDef.create("base_unit_rqmt_qty", "base_unit_rqmt_qty"),
				MCItemDef.create("base_unit_fxd_rqmt_qty", "base_unit_fxd_rqmt_qty"),
				MCItemDef.create("base_unit_sum_rqmt_qty", "base_unit_sum_rqmt_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("cont_inpt_qty", "cont_inpt_qty"),
				MCItemDef.create("cont_rqmt_qty", "cont_rqmt_qty"),
				MCItemDef.create("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty"),
				MCItemDef.create("sum_cont_rqmt_qty", "sum_cont_rqmt_qty"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("schd_hm", "schd_hm"),
				MCItemDef.create("lot_prop_tgt_flg", "lot_prop_tgt_flg"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("no_lot_fix_flg", "no_lot_fix_flg"),
				MCItemDef.create("inst_lot_fix_flg", "inst_lot_fix_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("inpt_loc_cd", "inpt_loc_cd"),
				MCItemDef.create("inpt_loc_nm", "inpt_loc_nm"),
				MCItemDef.create("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg"),
				MCItemDef.create("inpt_str_ln_cd", "inpt_str_ln_cd"),
				MCItemDef.create("inpt_str_ln_nm", "inpt_str_ln_nm"),
				MCItemDef.create("inpt_str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_rsn_nm", "inpt_rsn_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("bkf_typ_nm", "bkf_typ_nm"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("bom_id_no", "bom_id_no"),
				MCItemDef.create("chd_itm_seq", "chd_itm_seq"),
				MCItemDef.create("bom_memo1", "bom_memo1"),
				MCItemDef.create("bom_memo2", "bom_memo2"),
				MCItemDef.create("bom_memo3", "bom_memo3"),
				MCItemDef.create("yield_calc_flg", "yield_calc_flg"),
				MCItemDef.create("split_row_flg", "split_row_flg"),
				MCItemDef.create("alloc_ctl_typ", "alloc_ctl_typ"),
				MCItemDef.create("alloc_ctl_typ_nm", "alloc_ctl_typ_nm"),
				MCItemDef.create("inpt_ctl_typ", "inpt_ctl_typ"),
				MCItemDef.create("inpt_ctl_typ_nm", "inpt_ctl_typ_nm"),
				MCItemDef.create("in_offst_typ", "in_offst_typ"),
				MCItemDef.create("in_offst_typ_nm", "in_offst_typ_nm"),
				MCItemDef.create("in_offst", "in_offst"),
				MCItemDef.create("lot_mix_flg", "lot_mix_flg"),
				MCItemDef.create("sublot_mix_flg", "sublot_mix_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("stk_mng_typ_nm", "stk_mng_typ_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("alt_itm_typ", "alt_itm_typ"),
				MCItemDef.create("alt_itm_typ_nm", "alt_itm_typ_nm"),
				MCItemDef.create("alt_alloc_prio", "alt_alloc_prio"),
				MCItemDef.create("alt_itm_ratio", "alt_itm_ratio"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("fxd_loss_rsn_none_flg", "fxd_loss_rsn_none_flg")
			}
			,
			MCBlockDef.create("Srch01_DtlInpt")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Sprt03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_cost", "wk_cost"),
				MCItemDef.create("fxd_wk_cost", "fxd_wk_cost"),
				MCItemDef.create("sum_wk_cost", "sum_wk_cost"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("wk_cost_dec_place", "wk_cost_dec_place"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("wk_cost_calc_flg", "wk_cost_calc_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("wk_schd_no", "wk_schd_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Srch01_DtlWk")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Sprt03_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("schd_hm", "schd_hm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("insp_cnt_rmrks", "insp_cnt_rmrks"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Srch01_DtlYield")
		);
	}
	public static MCContainerDef MS_MSBCL1010_Sprt03_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt03",
			new MCItemDef[]{
				MCItemDef.create("tgt_oper_flg", "tgt_oper_flg"),
				MCItemDef.create("oper_peg_no", "oper_peg_no"),
				MCItemDef.create("th_image", "th_image"),
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
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_yield_qty", "trd_unit_yield_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ"),
				MCItemDef.create("conv_base_qty", "conv_base_qty"),
				MCItemDef.create("conv_qty", "conv_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_yield_qty", "base_unit_yield_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("schd_dt", "schd_dt"),
				MCItemDef.create("schd_hm", "schd_hm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg"),
				MCItemDef.create("strg_str_ln_cd", "strg_str_ln_cd"),
				MCItemDef.create("strg_str_ln_nm", "strg_str_ln_nm"),
				MCItemDef.create("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg"),
				MCItemDef.create("bkf_typ", "bkf_typ"),
				MCItemDef.create("par_inst_qty", "par_inst_qty"),
				MCItemDef.create("chd_inpt_qty", "chd_inpt_qty"),
				MCItemDef.create("chd_rqmt_qty", "chd_rqmt_qty"),
				MCItemDef.create("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("inst_rpt_rmrks", "inst_rpt_rmrks"),
				MCItemDef.create("stk_lst_prnt_flg", "stk_lst_prnt_flg"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("yield_schd_no", "yield_schd_no"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("oper_inst_no", "oper_inst_no"),
				MCItemDef.create("mfg_sts_typ", "mfg_sts_typ"),
				MCItemDef.create("mfg_sts_typ_nm", "mfg_sts_typ_nm"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Srch01_DtlByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1010_Sprt07_INFO = new MCOperationInfo("MS", "MSBCL1010", "Sprt07", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1010_Sprt07_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt07",
			new MCItemDef[]{
				MCItemDef.create("lot_issue_flg", "lot_issue_flg"),
				MCItemDef.create("sublot_issue_flg", "sublot_issue_flg"),
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
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("mfg_loc_site_cd", "mfg_loc_site_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("Sprt07_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL1010_Sprt07_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt07",
			new MCItemDef[]{
				MCItemDef.create("schd_dt", "schd_dt")
			}
			,
			MCBlockDef.create("Sprt07_DtlYield")
		);
	}

	public static MCContainerDef MS_MSBCL1010_Sprt07_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt07",
			new MCItemDef[]{
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq")
			}
			,
			MCBlockDef.create("Sprt07_DtlInpt")
		);
	}


	public static MCContainerDef MS_MSBCL1010_Sprt07_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt07",
			new MCItemDef[]{
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("Sprt07_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1010_Sprt08_INFO = new MCOperationInfo("MS", "MSBCL1010", "Sprt08", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1010_Sprt08_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt08",
			new MCItemDef[]{
				MCItemDef.create("lot_issue_flg", "lot_issue_flg"),
				MCItemDef.create("sublot_issue_flg", "sublot_issue_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_wg_cd", "mfg_loc_wg_cd"),
				MCItemDef.create("mfg_loc_site_cd", "mfg_loc_site_cd")
			}
			,
			MCBlockDef.create("Sprt08_Hdr")
		);
	}

	public static MCContainerDef MS_MSBCL1010_Sprt08_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt08",
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
				MCItemDef.create("lot_no_ptn_cd", "lot_no_ptn_cd"),
				MCItemDef.create("sublot_no_ptn_cd", "sublot_no_ptn_cd"),
				MCItemDef.create("yield_dt", "yield_dt"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("Sprt08_DtlByProd")
		);
	}

	public static MCContainerDef MS_MSBCL1010_Sprt08_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt08",
			new MCItemDef[]{
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("main_itm_flg", "main_itm_flg"),
				MCItemDef.create("vld_dt", "vld_dt"),
				MCItemDef.create("first_gr_dt", "first_gr_dt"),
				MCItemDef.create("lot_seq", "lot_seq")
			}
			,
			MCBlockDef.create("Sprt08_DtlInpt")
		);
	}


	public static MCContainerDef MS_MSBCL1010_Sprt08_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt08",
			new MCItemDef[]{
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no")
			}
			,
			MCBlockDef.create("Sprt08_DtlByProd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL1010_Sprt09_INFO = new MCOperationInfo("MS", "MSBCL1010", "Sprt09", "000000", new PDef());

	public static MCContainerDef MS_MSBCL1010_Sprt09_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt09",
			new MCItemDef[]{
				MCItemDef.create("mfg_mtd_typ", "mfg_mtd_typ"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("base_unit_inst_qty", "base_unit_inst_qty")
			}
			,
			MCBlockDef.create("Sprt09_Hdr")
		);
	}


	public static MCContainerDef MS_MSBCL1010_Sprt09_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL1010", "Sprt09",
			new MCItemDef[]{
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("st_schd_dt", "st_schd_dt")
			}
			,
			MCBlockDef.create("Sprt09_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

