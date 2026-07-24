package mcframe.serverMSBE.MSBEL1010;

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
 * [MSBEL_XfrInstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1010.Srch01.UP.BLOCK0")){
			return MS_MSBEL1010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1010_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Srch01.DOWN.BLOCK1")){
			return MS_MSBEL1010_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Srch02.UP.BLOCK0")){
			return MS_MSBEL1010_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Srch02.DOWN.BLOCK0")){
			return MS_MSBEL1010_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Srch02.DOWN.BLOCK1")){
			return MS_MSBEL1010_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Chk01.UP.BLOCK0")){
			return MS_MSBEL1010_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Chk01.UP.BLOCK1")){
			return MS_MSBEL1010_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Chk01.DOWN.BLOCK0")){
			return MS_MSBEL1010_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Chk01.DOWN.BLOCK1")){
			return MS_MSBEL1010_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Chk02.UP.BLOCK0")){
			return MS_MSBEL1010_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Chk02.UP.BLOCK1")){
			return MS_MSBEL1010_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Chk02.DOWN.BLOCK0")){
			return MS_MSBEL1010_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Chk02.DOWN.BLOCK1")){
			return MS_MSBEL1010_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Chk03.UP.BLOCK0")){
			return MS_MSBEL1010_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Chk03.UP.BLOCK1")){
			return MS_MSBEL1010_Chk03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Chk03.DOWN.BLOCK0")){
			return MS_MSBEL1010_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Chk03.DOWN.BLOCK1")){
			return MS_MSBEL1010_Chk03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Chk04.UP.BLOCK0")){
			return MS_MSBEL1010_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Chk04.UP.BLOCK1")){
			return MS_MSBEL1010_Chk04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Chk04.DOWN.BLOCK0")){
			return MS_MSBEL1010_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Ins01.UP.BLOCK0")){
			return MS_MSBEL1010_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Ins01.UP.BLOCK1")){
			return MS_MSBEL1010_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Ins01.UP.BLOCK2")){
			return MS_MSBEL1010_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1010.Ins01.DOWN.BLOCK0")){
			return MS_MSBEL1010_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Ins01.DOWN.BLOCK1")){
			return MS_MSBEL1010_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Upd01.UP.BLOCK0")){
			return MS_MSBEL1010_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Upd01.UP.BLOCK1")){
			return MS_MSBEL1010_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Upd01.UP.BLOCK2")){
			return MS_MSBEL1010_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1010.Upd01.DOWN.BLOCK0")){
			return MS_MSBEL1010_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Upd01.DOWN.BLOCK1")){
			return MS_MSBEL1010_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Del01.UP.BLOCK0")){
			return MS_MSBEL1010_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Del01.UP.BLOCK1")){
			return MS_MSBEL1010_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Del01.UP.BLOCK2")){
			return MS_MSBEL1010_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1010.Prnt01.UP.BLOCK0")){
			return MS_MSBEL1010_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Prnt01.UP.BLOCK1")){
			return MS_MSBEL1010_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Prnt01.UP.BLOCK2")){
			return MS_MSBEL1010_Prnt01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1010.Prnt01.DOWN.BLOCK0")){
			return MS_MSBEL1010_Prnt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Sprt01.UP.BLOCK0")){
			return MS_MSBEL1010_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Sprt01.UP.BLOCK1")){
			return MS_MSBEL1010_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Sprt01.DOWN.BLOCK0")){
			return MS_MSBEL1010_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Sprt02.UP.BLOCK0")){
			return MS_MSBEL1010_Sprt02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1010.Sprt02.UP.BLOCK1")){
			return MS_MSBEL1010_Sprt02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1010.Sprt02.DOWN.BLOCK0")){
			return MS_MSBEL1010_Sprt02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
												
	
	static final MCOperationInfo MS_MSBEL1010_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1010", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1010_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("srch_tgt_no", "srch_tgt_no")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1010_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_tgt_flg", "gr_str_ln_tgt_flg"),
				MCItemDef.create("gr_sppl_cd", "gr_sppl_cd"),
				MCItemDef.create("gr_cur_cd", "gr_cur_cd"),
				MCItemDef.create("gr_onr_prsppl_flg", "gr_onr_prsppl_flg"),
				MCItemDef.create("gr_prov_basis_typ", "gr_prov_basis_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("pick_print", "pick_print"),
				MCItemDef.create("inst_print", "inst_print"),
				MCItemDef.create("dlv_print", "dlv_print"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1010_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("def_ver_flg", "def_ver_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_act_qty", "base_unit_act_qty"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("pckg_unit_conv_base_qty", "pckg_unit_conv_base_qty"),
				MCItemDef.create("pckg_unit_conv_qty", "pckg_unit_conv_qty"),
				MCItemDef.create("pckg_unit_dec_place", "pckg_unit_dec_place"),
				MCItemDef.create("pckg_unit_qty", "pckg_unit_qty"),
				MCItemDef.create("schd_unit_cd", "schd_unit_cd"),
				MCItemDef.create("schd_unit_nm", "schd_unit_nm"),
				MCItemDef.create("schd_unit_dec_place", "schd_unit_dec_place"),
				MCItemDef.create("schd_qty", "schd_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("act_cont_qty", "act_cont_qty"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("std_cont_qty", "std_cont_qty"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_site_cd", "gi_site_cd"),
				MCItemDef.create("gi_sppl_cd", "gi_sppl_cd"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_str_ln_cd_none_flg", "gi_str_ln_cd_none_flg"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_str_ln_nm", "gr_str_ln_nm"),
				MCItemDef.create("gr_str_ln_cd_none_flg", "gr_str_ln_cd_none_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("acxfr_gi_flg", "acxfr_gi_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_basis_typ_nm", "prov_basis_typ_nm"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("ret_prov_typ_nm", "ret_prov_typ_nm"),
				MCItemDef.create("ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("ret_prov_basis_typ_nm", "ret_prov_basis_typ_nm"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("last_wms_flg", "last_wms_flg"),
				MCItemDef.create("wms_tgt_flg", "wms_tgt_flg"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xfr_src_typ_nm", "xfr_src_typ_nm"),
				MCItemDef.create("xfr_src_no", "xfr_src_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1010_Srch02_INFO = new MCOperationInfo("MS", "MSBEL1010", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1010_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("srch_tgt_no", "srch_tgt_no")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1010_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_tgt_flg", "gr_str_ln_tgt_flg"),
				MCItemDef.create("gr_sppl_cd", "gr_sppl_cd"),
				MCItemDef.create("gr_cur_cd", "gr_cur_cd"),
				MCItemDef.create("gr_onr_prsppl_flg", "gr_onr_prsppl_flg"),
				MCItemDef.create("gr_prov_basis_typ", "gr_prov_basis_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("pick_print", "pick_print"),
				MCItemDef.create("inst_print", "inst_print"),
				MCItemDef.create("dlv_print", "dlv_print"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("non_dlv_prnt_flg", "non_dlv_prnt_flg"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1010_Srch02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("def_ver_flg", "def_ver_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_act_qty", "base_unit_act_qty"),
				MCItemDef.create("pckg_unit_cd", "pckg_unit_cd"),
				MCItemDef.create("pckg_unit_nm", "pckg_unit_nm"),
				MCItemDef.create("pckg_unit_conv_base_qty", "pckg_unit_conv_base_qty"),
				MCItemDef.create("pckg_unit_conv_qty", "pckg_unit_conv_qty"),
				MCItemDef.create("pckg_unit_dec_place", "pckg_unit_dec_place"),
				MCItemDef.create("pckg_unit_qty", "pckg_unit_qty"),
				MCItemDef.create("schd_unit_cd", "schd_unit_cd"),
				MCItemDef.create("schd_unit_nm", "schd_unit_nm"),
				MCItemDef.create("schd_unit_dec_place", "schd_unit_dec_place"),
				MCItemDef.create("schd_qty", "schd_qty"),
				MCItemDef.create("cont_fctr_flg", "cont_fctr_flg"),
				MCItemDef.create("cont_fctr_unit_cd", "cont_fctr_unit_cd"),
				MCItemDef.create("cont_fctr_unit_nm", "cont_fctr_unit_nm"),
				MCItemDef.create("cont_fctr_dec_place", "cont_fctr_dec_place"),
				MCItemDef.create("cont_fctr_rnd_typ", "cont_fctr_rnd_typ"),
				MCItemDef.create("act_cont_fctr", "act_cont_fctr"),
				MCItemDef.create("act_cont_qty", "act_cont_qty"),
				MCItemDef.create("std_cont_fctr", "std_cont_fctr"),
				MCItemDef.create("std_cont_qty", "std_cont_qty"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_site_cd", "gi_site_cd"),
				MCItemDef.create("gi_sppl_cd", "gi_sppl_cd"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_str_ln_cd_none_flg", "gi_str_ln_cd_none_flg"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_str_ln_nm", "gr_str_ln_nm"),
				MCItemDef.create("gr_str_ln_cd_none_flg", "gr_str_ln_cd_none_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("acxfr_gi_flg", "acxfr_gi_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_basis_typ_nm", "prov_basis_typ_nm"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("ret_prov_typ_nm", "ret_prov_typ_nm"),
				MCItemDef.create("ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("ret_prov_basis_typ_nm", "ret_prov_basis_typ_nm"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("last_wms_flg", "last_wms_flg"),
				MCItemDef.create("wms_tgt_flg", "wms_tgt_flg"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xfr_src_typ_nm", "xfr_src_typ_nm"),
				MCItemDef.create("xfr_src_no", "xfr_src_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr")
			}
			,
			MCBlockDef.create("Srch02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1010_Chk01_INFO = new MCOperationInfo("MS", "MSBEL1010", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1010_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("pick_print", "pick_print"),
				MCItemDef.create("inst_print", "inst_print"),
				MCItemDef.create("dlv_print", "dlv_print"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("inst_bndl_src_flg", "inst_bndl_src_flg"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr"),
				MCItemDef.create("inst_bndl_peg_no", "inst_bndl_peg_no"),
				MCItemDef.create("inst_bndl_to_peg_no", "inst_bndl_to_peg_no")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1010_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_tgt_flg", "gr_str_ln_tgt_flg"),
				MCItemDef.create("gr_sppl_cd", "gr_sppl_cd"),
				MCItemDef.create("gr_cur_cd", "gr_cur_cd"),
				MCItemDef.create("gr_onr_prsppl_flg", "gr_onr_prsppl_flg"),
				MCItemDef.create("gr_prov_basis_typ", "gr_prov_basis_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("pick_print", "pick_print"),
				MCItemDef.create("inst_print", "inst_print"),
				MCItemDef.create("dlv_print", "dlv_print"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1010_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("def_ver_flg", "def_ver_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("inst_bndl_src_flg", "inst_bndl_src_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_act_qty", "base_unit_act_qty"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_site_cd", "gi_site_cd"),
				MCItemDef.create("gi_sppl_cd", "gi_sppl_cd"),
				MCItemDef.create("gi_sppl_nm", "gi_sppl_nm"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_str_ln_nm", "gr_str_ln_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("acxfr_gi_flg", "acxfr_gi_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_basis_typ_nm", "prov_basis_typ_nm"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("ret_prov_typ_nm", "ret_prov_typ_nm"),
				MCItemDef.create("ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("ret_prov_basis_typ_nm", "ret_prov_basis_typ_nm"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr"),
				MCItemDef.create("inst_bndl_peg_no", "inst_bndl_peg_no"),
				MCItemDef.create("inst_bndl_to_peg_no", "inst_bndl_to_peg_no")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1010_Chk02_INFO = new MCOperationInfo("MS", "MSBEL1010", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1010_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("pick_print", "pick_print"),
				MCItemDef.create("inst_print", "inst_print"),
				MCItemDef.create("dlv_print", "dlv_print"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("inst_bndl_src_flg", "inst_bndl_src_flg"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("inst_bndl_peg_no", "inst_bndl_peg_no"),
				MCItemDef.create("inst_bndl_to_peg_no", "inst_bndl_to_peg_no")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1010_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_loc_nm", "gr_loc_nm"),
				MCItemDef.create("gr_str_ln_tgt_flg", "gr_str_ln_tgt_flg"),
				MCItemDef.create("gr_sppl_cd", "gr_sppl_cd"),
				MCItemDef.create("gr_cur_cd", "gr_cur_cd"),
				MCItemDef.create("gr_onr_prsppl_flg", "gr_onr_prsppl_flg"),
				MCItemDef.create("gr_prov_basis_typ", "gr_prov_basis_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_usr_nm", "inst_usr_nm"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("inst_dpt_nm", "inst_dpt_nm"),
				MCItemDef.create("pick_print", "pick_print"),
				MCItemDef.create("inst_print", "inst_print"),
				MCItemDef.create("dlv_print", "dlv_print"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1010_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("def_ver_flg", "def_ver_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("inst_bndl_src_flg", "inst_bndl_src_flg"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_act_qty", "base_unit_act_qty"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_site_cd", "gi_site_cd"),
				MCItemDef.create("gi_sppl_cd", "gi_sppl_cd"),
				MCItemDef.create("gi_sppl_nm", "gi_sppl_nm"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_str_ln_nm", "gr_str_ln_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("acxfr_gi_flg", "acxfr_gi_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_typ_nm", "prov_typ_nm"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_basis_typ_nm", "prov_basis_typ_nm"),
				MCItemDef.create("ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("ret_prov_typ_nm", "ret_prov_typ_nm"),
				MCItemDef.create("ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("ret_prov_basis_typ_nm", "ret_prov_basis_typ_nm"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("inst_bndl_peg_no", "inst_bndl_peg_no"),
				MCItemDef.create("inst_bndl_to_peg_no", "inst_bndl_to_peg_no")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1010_Chk03_INFO = new MCOperationInfo("MS", "MSBEL1010", "Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1010_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("dlv_print", "dlv_print"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Chk03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("Chk03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1010_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("dlv_print", "dlv_print"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk03_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1010_Chk03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("Chk03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1010_Chk04_INFO = new MCOperationInfo("MS", "MSBEL1010", "Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1010_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Chk04_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Chk04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("Chk04_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1010_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk04_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1010_Ins01_INFO = new MCOperationInfo("MS", "MSBEL1010", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1010_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("pick_print", "pick_print"),
				MCItemDef.create("inst_print", "inst_print"),
				MCItemDef.create("dlv_print", "dlv_print"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("inst_bndl_src_flg", "inst_bndl_src_flg"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr"),
				MCItemDef.create("inst_bndl_peg_no", "inst_bndl_peg_no"),
				MCItemDef.create("inst_bndl_to_peg_no", "inst_bndl_to_peg_no")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1010_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1010_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1010_Upd01_INFO = new MCOperationInfo("MS", "MSBEL1010", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1010_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xfr_inst_dt", "xfr_inst_dt"),
				MCItemDef.create("inst_usr_cd", "inst_usr_cd"),
				MCItemDef.create("inst_dpt_cd", "inst_dpt_cd"),
				MCItemDef.create("pick_print", "pick_print"),
				MCItemDef.create("inst_print", "inst_print"),
				MCItemDef.create("dlv_print", "dlv_print"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inst_rmrks", "inst_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("inst_bndl_src_flg", "inst_bndl_src_flg"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr"),
				MCItemDef.create("inst_bndl_peg_no", "inst_bndl_peg_no"),
				MCItemDef.create("inst_bndl_to_peg_no", "inst_bndl_to_peg_no")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Upd01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1010_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1010_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1010_Del01_INFO = new MCOperationInfo("MS", "MSBEL1010", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1010_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("dlv_print", "dlv_print"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("alloc_sts_upd_cntr", "alloc_sts_upd_cntr"),
				MCItemDef.create("wms_flg", "wms_flg")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Del01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Del01_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1010_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL1010", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1010_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("xfr_inst_no", "xfr_inst_no"),
				MCItemDef.create("pick_print", "pick_print"),
				MCItemDef.create("inst_print", "inst_print"),
				MCItemDef.create("dlv_print", "dlv_print"),
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg"),
				MCItemDef.create("inst_upd_cntr", "inst_upd_cntr")
			}
			,
			MCBlockDef.create("Prnt01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Prnt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Prnt01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Prnt01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("Prnt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1010_Prnt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("pick_prnt_flg", "pick_prnt_flg"),
				MCItemDef.create("inst_prnt_flg", "inst_prnt_flg"),
				MCItemDef.create("dlv_prnt_flg", "dlv_prnt_flg")
			}
			,
			MCBlockDef.create("Prnt01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1010_Sprt01_INFO = new MCOperationInfo("MS", "MSBEL1010", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1010_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xfr_schd_dt", "xfr_schd_dt")
			}
			,
			MCBlockDef.create("Sprt01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Sprt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("check", "check"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("alloc_flg", "alloc_flg"),
				MCItemDef.create("lot_none_flg", "lot_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_cd_none_flg", "gi_str_ln_cd_none_flg"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("prov_typ", "prov_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("stk_info_loc_typ", "stk_info_loc_typ"),
				MCItemDef.create("skip_chk_ship_flg", "skip_chk_ship_flg")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1010_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("gi_str_ln_cd_none_flg", "gi_str_ln_cd_none_flg"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("gi_stk_arrv_bp_nm", "gi_stk_arrv_bp_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("quality_typ_nm", "quality_typ_nm"),
				MCItemDef.create("alloc_sno1", "alloc_sno1"),
				MCItemDef.create("alloc_sno2", "alloc_sno2"),
				MCItemDef.create("alloc_sno3", "alloc_sno3"),
				MCItemDef.create("alloc_sno4", "alloc_sno4"),
				MCItemDef.create("stk_id_typ", "stk_id_typ"),
				MCItemDef.create("stk_id_typ_nm", "stk_id_typ_nm"),
				MCItemDef.create("stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("stk_bp_nm", "stk_bp_nm"),
				MCItemDef.create("wms_flg", "wms_flg"),
				MCItemDef.create("wms_tgt_flg", "wms_tgt_flg"),
				MCItemDef.create("no_alloc_flg", "no_alloc_flg")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1010_Sprt02_INFO = new MCOperationInfo("MS", "MSBEL1010", "Sprt02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1010_Sprt02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ")
			}
			,
			MCBlockDef.create("Sprt02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1010_Sprt02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("check", "check"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("Sprt02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1010_Sprt02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1010", "Sprt02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("base_ac_dt", "base_ac_dt")
			}
			,
			MCBlockDef.create("Sprt02_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

