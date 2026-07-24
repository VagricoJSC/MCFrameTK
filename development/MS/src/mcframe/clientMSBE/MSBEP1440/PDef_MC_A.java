package mcframe.clientMSBE.MSBEP1440;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_ShipActReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1440.Srch01.UP.BLOCK0")){
			return MS_MSBEL1440_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1440_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Srch01.DOWN.BLOCK1")){
			return MS_MSBEL1440_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1440.Srch01.DOWN.BLOCK2")){
			return MS_MSBEL1440_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1440.Srch02.UP.BLOCK0")){
			return MS_MSBEL1440_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Srch02.DOWN.BLOCK0")){
			return MS_MSBEL1440_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Srch02.DOWN.BLOCK1")){
			return MS_MSBEL1440_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1440.Srch02.DOWN.BLOCK2")){
			return MS_MSBEL1440_Srch02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1440.Srch03.UP.BLOCK0")){
			return MS_MSBEL1440_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Srch03.DOWN.BLOCK0")){
			return MS_MSBEL1440_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Srch03.DOWN.BLOCK1")){
			return MS_MSBEL1440_Srch03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1440.Srch03.DOWN.BLOCK2")){
			return MS_MSBEL1440_Srch03_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1440.Ins01.UP.BLOCK0")){
			return MS_MSBEL1440_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Ins01.UP.BLOCK1")){
			return MS_MSBEL1440_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1440.Ins01.UP.BLOCK2")){
			return MS_MSBEL1440_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1440.Ins01.UP.BLOCK3")){
			return MS_MSBEL1440_Ins01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL1440.Ins01.DOWN.BLOCK0")){
			return MS_MSBEL1440_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Ins01.DOWN.BLOCK1")){
			return MS_MSBEL1440_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1440.Upd01.UP.BLOCK0")){
			return MS_MSBEL1440_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Upd01.UP.BLOCK1")){
			return MS_MSBEL1440_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1440.Upd01.UP.BLOCK2")){
			return MS_MSBEL1440_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1440.Upd01.UP.BLOCK3")){
			return MS_MSBEL1440_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL1440.Upd01.DOWN.BLOCK0")){
			return MS_MSBEL1440_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Upd01.DOWN.BLOCK1")){
			return MS_MSBEL1440_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1440.Del01.UP.BLOCK0")){
			return MS_MSBEL1440_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Del01.UP.BLOCK1")){
			return MS_MSBEL1440_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1440.Del01.UP.BLOCK2")){
			return MS_MSBEL1440_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1440.Prnt01.UP.BLOCK0")){
			return MS_MSBEL1440_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Prnt01.UP.BLOCK1")){
			return MS_MSBEL1440_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1440.Prnt01.UP.BLOCK2")){
			return MS_MSBEL1440_Prnt01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1440.Prnt01.DOWN.BLOCK0")){
			return MS_MSBEL1440_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Sprt01.UP.BLOCK0")){
			return MS_MSBEL1440_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1440.Sprt01.DOWN.BLOCK0")){
			return MS_MSBEL1440_Sprt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBEL1440_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1440", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1440_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("srch_tgt_no", "ship_inst_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1440_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ss_ymdhm_p" + ".ymd", "ship_schd_dt"),
				MCItemDef.create("ss_ymdhm_p" + ".hm", "ship_schd_hm"),
				MCItemDef.create("ds_ymdhm_p" + ".ymd", "dlv_schd_dt"),
				MCItemDef.create("ds_ymdhm_p" + ".hm", "dlv_schd_hm"),
				MCItemDef.create("inst_ymdhm_p" + ".ymd", "ship_inst_dt"),
				MCItemDef.create("inst_ymdhm_p" + ".hm", "ship_inst_hm"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_typ_nm", "ship_to_id_typ_nm"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_addr_p" + ".cntry_cd", "ship_to_cntry_cd"),
				MCItemDef.create("ship_to_addr_p" + ".cntry_nm", "ship_to_cntry_nm"),
				MCItemDef.create("ship_to_addr_p" + ".zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr_p" + ".addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr_p" + ".addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr_p" + ".addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr_p" + ".addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_addr_p" + ".cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_addr_p" + ".cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_addr_p" + ".tel", "ship_to_tel"),
				MCItemDef.create("ship_to_addr_p" + ".fax", "ship_to_fax"),
				MCItemDef.create("ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("ship_to_addr_p" + ".lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("ship_to_addr_p" + ".lg_grp_nm", "ship_to_lg_grp_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("via_dlv_typ_nm", "via_dlv_typ_nm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("ship_wt", "ship_wt"),
				MCItemDef.create("ship_dim", "ship_dim"),
				MCItemDef.create("inst_dlv_prnted_flg", "inst_dlv_prnted_flg"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("ship_adv_prnt_flg", "ship_adv_prnt_flg"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
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
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1440_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("cststk_flg", "cststk_flg"),
				MCItemDef.create("loan_flg", "loan_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("schd_qty_p" + ".qty", "schd_qty"),
				MCItemDef.create("inst_qty_p" + ".qty", "inst_qty"),
				MCItemDef.create("ship_qty_p" + ".qty", "ship_qty"),
				MCItemDef.create("ret_qty_p" + ".qty", "ret_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("act_cont_qty_p" + ".cont_qty", "act_cont_qty"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_qty_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("loc_mng_typ", "loc_mng_typ"),
				MCItemDef.create("ship_str_ln_tgt_flg", "ship_str_ln_tgt_flg"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "ship_str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "ship_str_ln_cd_none_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "", "sno1_null_flg"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "", "sno2_null_flg"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "", "sno3_null_flg"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "", "sno4_null_flg"),
				MCItemDef.create("schd_sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "schd_sno1"),
				MCItemDef.create("schd_sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "schd_sno2"),
				MCItemDef.create("schd_sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "schd_sno3"),
				MCItemDef.create("schd_sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "schd_sno4"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("ship_wt", "ship_wt"),
				MCItemDef.create("ship_dim", "ship_dim"),
				MCItemDef.create("unit_wt", "unit_wt"),
				MCItemDef.create("unit_dim", "unit_dim"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_str_ln_tgt_flg", "dlv_str_ln_tgt_flg"),
				MCItemDef.create("dlv_str_ln_p" + ".str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_p" + ".str_ln_nm", "dlv_str_ln_nm"),
				MCItemDef.create("dlv_str_ln_p" + ".str_ln_cd_none_flg", "dlv_str_ln_cd_none_flg"),
				MCItemDef.create("dlv_addr_p" + ".cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_addr_p" + ".cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("dlv_addr_p" + ".zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr_p" + ".addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr_p" + ".addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr_p" + ".addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr_p" + ".addr4", "dlv_addr4"),
				MCItemDef.create("dlv_addr_p" + ".cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_addr_p" + ".cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_addr_p" + ".tel", "dlv_tel"),
				MCItemDef.create("dlv_addr_p" + ".fax", "dlv_fax"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("iv_trd_flg", "iv_trd_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("sls_acxfr_flg", "sls_acxfr_flg"),
				MCItemDef.create("acxfr_gi_flg", "acxfr_gi_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("iv_no", "dtl_iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_schd_loc_cd", "ship_schd_loc_cd"),
				MCItemDef.create("ship_schd_loc_sppl_cd", "ship_schd_loc_sppl_cd"),
				MCItemDef.create("ship_schd_str_ln_cd", "ship_schd_str_ln_cd"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("base_unit_qty_bef", "base_unit_qty_bef")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL1440_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Cntr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1440_Srch02_INFO = new MCOperationInfo("MS", "MSBEL1440", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1440_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("srch_tgt_no", "iv_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1440_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ss_ymdhm_p" + ".ymd", "ship_schd_dt"),
				MCItemDef.create("ss_ymdhm_p" + ".hm", "ship_schd_hm"),
				MCItemDef.create("ds_ymdhm_p" + ".ymd", "dlv_schd_dt"),
				MCItemDef.create("ds_ymdhm_p" + ".hm", "dlv_schd_hm"),
				MCItemDef.create("inst_ymdhm_p" + ".ymd", "ship_inst_dt"),
				MCItemDef.create("inst_ymdhm_p" + ".hm", "ship_inst_hm"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_typ_nm", "ship_to_id_typ_nm"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_addr_p" + ".cntry_cd", "ship_to_cntry_cd"),
				MCItemDef.create("ship_to_addr_p" + ".cntry_nm", "ship_to_cntry_nm"),
				MCItemDef.create("ship_to_addr_p" + ".zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr_p" + ".addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr_p" + ".addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr_p" + ".addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr_p" + ".addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_addr_p" + ".cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_addr_p" + ".cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_addr_p" + ".tel", "ship_to_tel"),
				MCItemDef.create("ship_to_addr_p" + ".fax", "ship_to_fax"),
				MCItemDef.create("ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("ship_to_addr_p" + ".lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("ship_to_addr_p" + ".lg_grp_nm", "ship_to_lg_grp_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("via_dlv_typ_nm", "via_dlv_typ_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("ship_wt", "ship_wt"),
				MCItemDef.create("ship_dim", "ship_dim"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("ship_adv_prnt_flg", "ship_adv_prnt_flg"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
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
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1440_Srch02_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("cststk_flg", "cststk_flg"),
				MCItemDef.create("loan_flg", "loan_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("schd_qty_p" + ".qty", "schd_qty"),
				MCItemDef.create("ship_qty_p" + ".qty", "ship_qty"),
				MCItemDef.create("ret_qty_p" + ".qty", "ret_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("act_cont_qty_p" + ".cont_qty", "act_cont_qty"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_qty_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("loc_mng_typ", "loc_mng_typ"),
				MCItemDef.create("ship_str_ln_tgt_flg", "ship_str_ln_tgt_flg"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "ship_str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "ship_str_ln_cd_none_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "", "sno1_null_flg"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "", "sno2_null_flg"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "", "sno3_null_flg"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "", "sno4_null_flg"),
				MCItemDef.create("schd_sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "schd_sno1"),
				MCItemDef.create("schd_sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "schd_sno2"),
				MCItemDef.create("schd_sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "schd_sno3"),
				MCItemDef.create("schd_sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "schd_sno4"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("ship_wt", "ship_wt"),
				MCItemDef.create("ship_dim", "ship_dim"),
				MCItemDef.create("unit_wt", "unit_wt"),
				MCItemDef.create("unit_dim", "unit_dim"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_str_ln_tgt_flg", "dlv_str_ln_tgt_flg"),
				MCItemDef.create("dlv_str_ln_p" + ".str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_p" + ".str_ln_nm", "dlv_str_ln_nm"),
				MCItemDef.create("dlv_str_ln_p" + ".str_ln_cd_none_flg", "dlv_str_ln_cd_none_flg"),
				MCItemDef.create("dlv_addr_p" + ".cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_addr_p" + ".cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("dlv_addr_p" + ".zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr_p" + ".addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr_p" + ".addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr_p" + ".addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr_p" + ".addr4", "dlv_addr4"),
				MCItemDef.create("dlv_addr_p" + ".cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_addr_p" + ".cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_addr_p" + ".tel", "dlv_tel"),
				MCItemDef.create("dlv_addr_p" + ".fax", "dlv_fax"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("iv_trd_flg", "iv_trd_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("sls_acxfr_flg", "sls_acxfr_flg"),
				MCItemDef.create("acxfr_gi_flg", "acxfr_gi_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("iv_no", "dtl_iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_schd_loc_cd", "ship_schd_loc_cd"),
				MCItemDef.create("ship_schd_loc_sppl_cd", "ship_schd_loc_sppl_cd"),
				MCItemDef.create("ship_schd_str_ln_cd", "ship_schd_str_ln_cd"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("base_unit_qty_bef", "base_unit_qty_bef")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL1440_Srch02_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Cntr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1440_Srch03_INFO = new MCOperationInfo("MS", "MSBEL1440", "Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1440_Srch03_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_rev", "ship_act_rev"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1440_Srch03_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_rev", "ship_act_rev"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("ship_ymdhm_p" + ".ymd", "ship_dt"),
				MCItemDef.create("ship_ymdhm_p" + ".hm", "ship_hm"),
				MCItemDef.create("dlv_ymdhm_p" + ".ymd", "dlv_dt"),
				MCItemDef.create("dlv_ymdhm_p" + ".hm", "dlv_hm"),
				MCItemDef.create("inst_ymdhm_p" + ".ymd", "ship_inst_dt"),
				MCItemDef.create("inst_ymdhm_p" + ".hm", "ship_inst_hm"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_typ_nm", "ship_to_id_typ_nm"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_addr_p" + ".cntry_cd", "ship_to_cntry_cd"),
				MCItemDef.create("ship_to_addr_p" + ".cntry_nm", "ship_to_cntry_nm"),
				MCItemDef.create("ship_to_addr_p" + ".zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr_p" + ".addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr_p" + ".addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr_p" + ".addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr_p" + ".addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_addr_p" + ".cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_addr_p" + ".cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_addr_p" + ".tel", "ship_to_tel"),
				MCItemDef.create("ship_to_addr_p" + ".fax", "ship_to_fax"),
				MCItemDef.create("ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("ship_to_addr_p" + ".lg_grp_cd", "ship_to_lg_grp_cd"),
				MCItemDef.create("ship_to_addr_p" + ".lg_grp_nm", "ship_to_lg_grp_nm"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("via_dlv_typ_nm", "via_dlv_typ_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("rqst_usr_dpt_p" + ".usr_cd", "rqst_usr_cd"),
				MCItemDef.create("rqst_usr_dpt_p" + ".usr_nm", "rqst_usr_nm"),
				MCItemDef.create("rqst_usr_dpt_p" + ".dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_usr_dpt_p" + ".dpt_nm", "rqst_dpt_nm"),
				MCItemDef.create("ship_usr_dpt_p" + ".usr_cd", "ship_usr_cd"),
				MCItemDef.create("ship_usr_dpt_p" + ".usr_nm", "ship_usr_nm"),
				MCItemDef.create("ship_usr_dpt_p" + ".dpt_cd", "ship_dpt_cd"),
				MCItemDef.create("ship_usr_dpt_p" + ".dpt_nm", "ship_dpt_nm"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("ship_term_nm", "ship_term_nm"),
				MCItemDef.create("ship_wt", "ship_wt"),
				MCItemDef.create("ship_dim", "ship_dim"),
				MCItemDef.create("inst_dlv_prnted_flg", "inst_dlv_prnted_flg"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("ship_adv_prnt_flg", "ship_adv_prnt_flg"),
				MCItemDef.create("dlv_slip_prnted_flg", "dlv_slip_prnted_flg"),
				MCItemDef.create("ship_adv_prnted_flg", "ship_adv_prnted_flg"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("non_dlv_prnt_flg", "non_dlv_prnt_flg"),
				MCItemDef.create("non_adv_prnt_flg", "non_adv_prnt_flg"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ship_act_upd_cntr", "ship_act_upd_cntr"),
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
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1440_Srch03_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("cststk_flg", "cststk_flg"),
				MCItemDef.create("loan_flg", "loan_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("schd_qty_p" + ".qty", "schd_qty"),
				MCItemDef.create("inst_qty_p" + ".qty", "inst_qty"),
				MCItemDef.create("ship_qty_p" + ".qty", "ship_qty"),
				MCItemDef.create("sls_qty_p" + ".qty", "sls_qty"),
				MCItemDef.create("arr_qty_p" + ".qty", "arr_qty"),
				MCItemDef.create("iv_qty_p" + ".qty", "iv_qty"),
				MCItemDef.create("ret_qty_p" + ".qty", "ret_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("act_cont_qty_p" + ".cont_qty", "act_cont_qty"),
				MCItemDef.create("act_cont_fctr_p" + ".act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("std_cont_qty_p" + ".cont_qty", "std_cont_qty"),
				MCItemDef.create("std_cont_fctr_p" + ".std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_p" + ".cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("ship_loc_nm", "ship_loc_nm"),
				MCItemDef.create("loc_mng_typ", "loc_mng_typ"),
				MCItemDef.create("ship_str_ln_tgt_flg", "ship_str_ln_tgt_flg"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_nm", "ship_str_ln_nm"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd_none_flg", "ship_str_ln_cd_none_flg"),
				MCItemDef.create("ship_loc_sppl_cd", "ship_loc_sppl_cd"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "", "sno1_null_flg"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "", "sno2_null_flg"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "", "sno3_null_flg"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "", "sno4_null_flg"),
				MCItemDef.create("schd_sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "schd_sno1"),
				MCItemDef.create("schd_sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "schd_sno2"),
				MCItemDef.create("schd_sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "schd_sno3"),
				MCItemDef.create("schd_sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "schd_sno4"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("stk_arrv_bp_nm", "stk_arrv_bp_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("ship_wt", "ship_wt"),
				MCItemDef.create("ship_dim", "ship_dim"),
				MCItemDef.create("unit_wt", "unit_wt"),
				MCItemDef.create("unit_dim", "unit_dim"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_str_ln_tgt_flg", "dlv_str_ln_tgt_flg"),
				MCItemDef.create("dlv_str_ln_p" + ".str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("dlv_str_ln_p" + ".str_ln_nm", "dlv_str_ln_nm"),
				MCItemDef.create("dlv_str_ln_p" + ".str_ln_cd_none_flg", "dlv_str_ln_cd_none_flg"),
				MCItemDef.create("dlv_addr_p" + ".cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_addr_p" + ".cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("dlv_addr_p" + ".zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr_p" + ".addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr_p" + ".addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr_p" + ".addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr_p" + ".addr4", "dlv_addr4"),
				MCItemDef.create("dlv_addr_p" + ".cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_addr_p" + ".cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_addr_p" + ".tel", "dlv_tel"),
				MCItemDef.create("dlv_addr_p" + ".fax", "dlv_fax"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_sppl_cd", "dlv_sppl_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("iv_trd_flg", "iv_trd_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("sls_acxfr_flg", "sls_acxfr_flg"),
				MCItemDef.create("acxfr_gi_flg", "acxfr_gi_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("iv_no", "dtl_iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("ext_ship_act_no", "ext_ship_act_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("assort_typ", "assort_typ"),
				MCItemDef.create("set_itm_grp_no", "set_itm_grp_no"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_schd_loc_cd", "ship_schd_loc_cd"),
				MCItemDef.create("ship_schd_loc_sppl_cd", "ship_schd_loc_sppl_cd"),
				MCItemDef.create("ship_schd_str_ln_cd", "ship_schd_str_ln_cd"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("base_unit_qty_bef", "base_unit_qty_bef")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL1440_Srch03_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Cntr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1440_Ins01_INFO = new MCOperationInfo("MS", "MSBEL1440", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1440_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [ShipAct_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("ship_ymdhm_p" + ".ymd", "ship_tm"),
				MCItemDef.create("dlv_ymdhm_p" + ".ymd", "dlv_tm"),
				MCItemDef.create("rqst_usr_dpt_p" + ".dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_usr_dpt_p" + ".usr_cd", "rqst_usr_cd"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_usr_dpt_p" + ".dpt_cd", "ship_dpt_cd"),
				MCItemDef.create("ship_usr_dpt_p" + ".usr_cd", "ship_usr_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_addr_p" + ".zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr_p" + ".addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr_p" + ".addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr_p" + ".addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr_p" + ".addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_addr_p" + ".cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_addr_p" + ".cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_addr_p" + ".tel", "ship_to_tel"),
				MCItemDef.create("ship_to_addr_p" + ".fax", "ship_to_fax"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("ship_adv_prnt_flg", "ship_adv_prnt_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1440_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [ShipAct_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_addr_p" + ".zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr_p" + ".addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr_p" + ".addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr_p" + ".addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr_p" + ".addr4", "dlv_addr4"),
				MCItemDef.create("dlv_addr_p" + ".cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_addr_p" + ".cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_addr_p" + ".tel", "dlv_tel"),
				MCItemDef.create("dlv_addr_p" + ".fax", "dlv_fax"),
				MCItemDef.create("dlv_str_ln_p" + ".str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1440_Ins01_UP_BLOCK2() {
		/** Ope.のBlock [ShipPr_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}

	public static MCContainerDef MS_MSBEL1440_Ins01_UP_BLOCK3() {
		/** Ope.のBlock [Ins01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}


	public static MCContainerDef MS_MSBEL1440_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [ShipAct_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_rev", "ship_act_rev"),
				MCItemDef.create("dlv_slip_prnted_flg", "dlv_slip_prnted_flg"),
				MCItemDef.create("ship_adv_prnted_flg", "ship_adv_prnted_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1440_Ins01_DOWN_BLOCK1() {
	/** Ope.のBlock [ShipAct_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1440_Upd01_INFO = new MCOperationInfo("MS", "MSBEL1440", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1440_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [ShipAct_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_input", "can_ac_dt"),
				MCItemDef.create("ship_ymdhm_p" + ".ymd", "ship_tm"),
				MCItemDef.create("dlv_ymdhm_p" + ".ymd", "dlv_tm"),
				MCItemDef.create("rqst_usr_dpt_p" + ".dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("rqst_usr_dpt_p" + ".usr_cd", "rqst_usr_cd"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_usr_dpt_p" + ".dpt_cd", "ship_dpt_cd"),
				MCItemDef.create("ship_usr_dpt_p" + ".usr_cd", "ship_usr_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("ship_to_addr_p" + ".zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("ship_to_addr_p" + ".addr1", "ship_to_addr1"),
				MCItemDef.create("ship_to_addr_p" + ".addr2", "ship_to_addr2"),
				MCItemDef.create("ship_to_addr_p" + ".addr3", "ship_to_addr3"),
				MCItemDef.create("ship_to_addr_p" + ".addr4", "ship_to_addr4"),
				MCItemDef.create("ship_to_addr_p" + ".cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("ship_to_addr_p" + ".cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("ship_to_addr_p" + ".tel", "ship_to_tel"),
				MCItemDef.create("ship_to_addr_p" + ".fax", "ship_to_fax"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("ship_adv_prnt_flg", "ship_adv_prnt_flg"),
				MCItemDef.create("lot_chk_off_flg", "lot_chk_off_flg"),
				MCItemDef.create("ship_act_upd_cntr", "ship_act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1440_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [ShipAct_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("ship_loc_cd", "ship_loc_cd"),
				MCItemDef.create("str_ln_p" + ".str_ln_cd", "ship_str_ln_cd"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_addr_p" + ".zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr_p" + ".addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr_p" + ".addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr_p" + ".addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr_p" + ".addr4", "dlv_addr4"),
				MCItemDef.create("dlv_addr_p" + ".cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_addr_p" + ".cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_addr_p" + ".tel", "dlv_tel"),
				MCItemDef.create("dlv_addr_p" + ".fax", "dlv_fax"),
				MCItemDef.create("dlv_str_ln_p" + ".str_ln_cd", "dlv_str_ln_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("lot_no_p" + ".lot_no", "lot_no"),
				MCItemDef.create("lot_no_p" + ".sublot_no", "sublot_no"),
				MCItemDef.create("ver_no_p" + ".ver_no", "ver_no"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("stk_arrv_bp_cd", "stk_arrv_bp_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_p" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_dlv_inst_no", "cst_dlv_inst_no"),
				MCItemDef.create("cst_dlv_inst_d_no", "cst_dlv_inst_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1440_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [ShipPr_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}

	public static MCContainerDef MS_MSBEL1440_Upd01_UP_BLOCK3() {
		/** Ope.のBlock [Upd01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}


	public static MCContainerDef MS_MSBEL1440_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [ShipAct_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_rev", "ship_act_rev"),
				MCItemDef.create("dlv_slip_prnted_flg", "dlv_slip_prnted_flg"),
				MCItemDef.create("ship_adv_prnted_flg", "ship_adv_prnted_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1440_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [ShipAct_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1440_Del01_INFO = new MCOperationInfo("MS", "MSBEL1440", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1440_Del01_UP_BLOCK0() {
		/** Ope.のBlock [ShipAct_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_input", "can_ac_dt"),
				MCItemDef.create("dlv_slip_prnt_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("ship_act_upd_cntr", "ship_act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1440_Del01_UP_BLOCK1() {
		/** Ope.のBlock [ShipPr_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}

	public static MCContainerDef MS_MSBEL1440_Del01_UP_BLOCK2() {
		/** Ope.のBlock [Del01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Del01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1440_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL1440", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1440_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_rev", "ship_act_rev"),
				MCItemDef.create("dlv_slip_prnt_btn_flg", "dlv_slip_prnt_flg"),
				MCItemDef.create("ship_adv_prnt_btn_flg", "ship_adv_prnt_flg"),
				MCItemDef.create("ship_act_upd_cntr", "ship_act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1440_Prnt01_UP_BLOCK1() {
		/** Ope.のBlock [Prnt01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}

	public static MCContainerDef MS_MSBEL1440_Prnt01_UP_BLOCK2() {
		/** Ope.のBlock [Prnt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1440_Prnt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_prnted_flg", "dlv_slip_prnted_flg"),
				MCItemDef.create("ship_adv_prnted_flg", "ship_adv_prnted_flg")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1440_Sprt01_INFO = new MCOperationInfo("MS", "MSBEL1440", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1440_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1440_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1440", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

