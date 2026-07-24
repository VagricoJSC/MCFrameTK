package mcframe.serverMSBE.MSBEL5200;

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
 * [MSBEL_XfrSchdService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5200.XfrSchd_Chk02.UP.BLOCK0")){
			return MS_MSBEL5200_XfrSchd_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Chk02.UP.BLOCK1")){
			return MS_MSBEL5200_XfrSchd_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Chk02.DOWN.BLOCK0")){
			return MS_MSBEL5200_XfrSchd_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Chk02.DOWN.BLOCK1")){
			return MS_MSBEL5200_XfrSchd_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Chk04.UP.BLOCK0")){
			return MS_MSBEL5200_XfrSchd_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Chk04.UP.BLOCK1")){
			return MS_MSBEL5200_XfrSchd_Chk04_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Chk04.DOWN.BLOCK0")){
			return MS_MSBEL5200_XfrSchd_Chk04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Chk04.DOWN.BLOCK1")){
			return MS_MSBEL5200_XfrSchd_Chk04_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Upd01.UP.BLOCK0")){
			return MS_MSBEL5200_XfrSchd_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Upd01.UP.BLOCK1")){
			return MS_MSBEL5200_XfrSchd_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Upd01.UP.BLOCK2")){
			return MS_MSBEL5200_XfrSchd_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL5200_XfrSchd_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Upd02.UP.BLOCK0")){
			return MS_MSBEL5200_XfrSchd_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Upd02.UP.BLOCK1")){
			return MS_MSBEL5200_XfrSchd_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Upd02.DOWN.BLOCK0")){
			return MS_MSBEL5200_XfrSchd_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Upd03.UP.BLOCK0")){
			return MS_MSBEL5200_XfrSchd_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Sprt01.UP.BLOCK0")){
			return MS_MSBEL5200_XfrSchd_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5200.XfrSchd_Sprt01.DOWN.BLOCK0")){
			return MS_MSBEL5200_XfrSchd_Sprt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBEL5200_XfrSchd_Chk02_INFO = new MCOperationInfo("MS", "MSBEL5200", "XfrSchd_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5200_XfrSchd_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xas" + ".xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("xas" + ".pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("xas" + ".xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xas" + ".xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xas" + ".trd_cd", "trd_cd"),
				MCItemDef.create("xas" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("xas" + ".wg_cd", "wg_cd"),
				MCItemDef.create("xas" + ".lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("xas" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("xas" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("xas" + ".gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("xas" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xas" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("xas" + ".lot_no", "lot_no"),
				MCItemDef.create("xas" + ".sublot_no", "sublot_no"),
				MCItemDef.create("xas" + ".sno1", "sno1"),
				MCItemDef.create("xas" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("xas" + ".sno2", "sno2"),
				MCItemDef.create("xas" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("xas" + ".sno3", "sno3"),
				MCItemDef.create("xas" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("xas" + ".sno4", "sno4"),
				MCItemDef.create("xas" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("xas" + ".alloc_sno1", "alloc_sno1"),
				MCItemDef.create("xas" + ".alloc_sno2", "alloc_sno2"),
				MCItemDef.create("xas" + ".alloc_sno3", "alloc_sno3"),
				MCItemDef.create("xas" + ".alloc_sno4", "alloc_sno4"),
				MCItemDef.create("xas" + ".ver_no", "ver_no"),
				MCItemDef.create("xas" + ".gd_cd", "gd_cd"),
				MCItemDef.create("xas" + ".quality_typ", "quality_typ"),
				MCItemDef.create("xas" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("xas" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("xas" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xas" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xas" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xas" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("xas" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("xas" + ".xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xas" + ".alloc_flg", "alloc_flg"),
				MCItemDef.create("xas" + ".abort_flg", "abort_flg"),
				MCItemDef.create("xas" + ".not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("xas" + ".not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("xas" + ".vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("xas" + ".vld_dt_to", "vld_dt_to"),
				MCItemDef.create("xas" + ".prov_typ", "prov_typ"),
				MCItemDef.create("xas" + ".prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("xas" + ".ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("xas" + ".ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("ret_xrate", "ret_xrate"),
				MCItemDef.create("ret_ptax_xrate", "ret_ptax_xrate"),
				MCItemDef.create("ret_trd_cur_cd", "ret_trd_cur_cd"),
				MCItemDef.create("ret_tax_cd", "ret_tax_cd"),
				MCItemDef.create("ret_trd_cur_upri", "ret_trd_cur_upri"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("inst_rem_abort_flg", "inst_rem_abort_flg")
			}
			,
			MCBlockDef.create("XfrSchdChk02_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5200_XfrSchd_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("schd_flg", "schd_flg"),
				MCItemDef.create("inst_flg", "inst_flg"),
				MCItemDef.create("act_flg", "act_flg"),
				MCItemDef.create("re_call_flg", "re_call_flg"),
				MCItemDef.create("alloc_off_flg", "alloc_off_flg")
			}
			,
			MCBlockDef.create("XfrSchdChk02_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBEL5200_XfrSchd_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("XfrSchdChk02_Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL5200_XfrSchd_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("pack_unit_cd", "pack_unit_cd"),
				MCItemDef.create("pack_unit_qty", "pack_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("XfrSchdChk02_AllocRslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5200_XfrSchd_Chk04_INFO = new MCOperationInfo("MS", "MSBEL5200", "XfrSchd_Chk04", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5200_XfrSchd_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xs" + ".xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xs" + ".xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xs" + ".xfr_src_no", "xfr_src_no"),
				MCItemDef.create("xs" + ".trd_cd", "trd_cd"),
				MCItemDef.create("xs" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("xs" + ".gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("xs" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("xs" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("xs" + ".gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("xs" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xs" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("xs" + ".itm_cd", "itm_cd"),
				MCItemDef.create("xs" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("xs" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("xs" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("xs" + ".lot_no", "lot_no"),
				MCItemDef.create("xs" + ".sublot_no", "sublot_no"),
				MCItemDef.create("xs" + ".ver_no", "ver_no"),
				MCItemDef.create("xs" + ".sno1", "sno1"),
				MCItemDef.create("xs" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("xs" + ".sno2", "sno2"),
				MCItemDef.create("xs" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("xs" + ".sno3", "sno3"),
				MCItemDef.create("xs" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("xs" + ".sno4", "sno4"),
				MCItemDef.create("xs" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("xs" + ".gd_cd", "gd_cd"),
				MCItemDef.create("xs" + ".quality_typ", "quality_typ"),
				MCItemDef.create("xs" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("xs" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xs" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xs" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xs" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("xs" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("xs" + ".gi_rqst_tm", "gi_rqst_tm"),
				MCItemDef.create("xs" + ".gr_rqst_tm", "gr_rqst_tm"),
				MCItemDef.create("xs" + ".rcpt_dt", "rcpt_dt"),
				MCItemDef.create("xs" + ".ship_term_cd", "ship_term_cd"),
				MCItemDef.create("xs" + ".ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("xs" + ".ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("xs" + ".ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("xs" + ".ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("xs" + ".ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("xs" + ".ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("xs" + ".ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("xs" + ".ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("xs" + ".ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("xs" + ".ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("xs" + ".ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("xs" + ".ship_to_tel", "ship_to_tel"),
				MCItemDef.create("xs" + ".ship_to_fax", "ship_to_fax"),
				MCItemDef.create("xs" + ".ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("xs" + ".via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("xs" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("xs" + ".not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("xs" + ".not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("xs" + ".vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("xs" + ".vld_dt_to", "vld_dt_to"),
				MCItemDef.create("xs" + ".prov_typ", "prov_typ"),
				MCItemDef.create("xs" + ".prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("xs" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xs" + ".xrate", "xrate"),
				MCItemDef.create("xs" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("xs" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("xs" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xs" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("xs" + ".tax_cd", "tax_cd"),
				MCItemDef.create("xs" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("xs" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("xs" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("xs" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("xs" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("xs" + ".ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("xs" + ".ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("xs" + ".ret_xrate_inpt_flg", "ret_xrate_inpt_flg"),
				MCItemDef.create("xs" + ".ret_xrate", "ret_xrate"),
				MCItemDef.create("xs" + ".ret_ptax_xrate_inpt_flg", "ret_ptax_xrate_inpt_flg"),
				MCItemDef.create("xs" + ".ret_ptax_xrate", "ret_ptax_xrate"),
				MCItemDef.create("xs" + ".ret_trd_cur_cd", "ret_trd_cur_cd"),
				MCItemDef.create("xs" + ".ret_tax_fix_flg", "ret_tax_fix_flg"),
				MCItemDef.create("xs" + ".ret_tax_cd", "ret_tax_cd"),
				MCItemDef.create("xs" + ".ret_trd_cur_upri", "ret_trd_cur_upri"),
				MCItemDef.create("xs" + ".ret_trd_cur_amt", "ret_trd_cur_amt"),
				MCItemDef.create("xs" + ".ret_trd_cur_tax_amt", "ret_trd_cur_tax_amt"),
				MCItemDef.create("xs" + ".ret_wtax_rate", "ret_wtax_rate"),
				MCItemDef.create("xs" + ".ret_wtax_amt", "ret_wtax_amt"),
				MCItemDef.create("xs" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("alloc_flg", "alloc_flg")
			}
			,
			MCBlockDef.create("XfrSchdChk04_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5200_XfrSchd_Chk04_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Chk04",
			new MCItemDef[]{
				MCItemDef.create("screen_flg", "screen_flg"),
				MCItemDef.create("alloc_check_exec_flg", "alloc_check_exec_flg"),
				MCItemDef.create("file_imp_flg", "file_imp_flg")
			}
			,
			MCBlockDef.create("XfrSchdChk04_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBEL5200_XfrSchd_Chk04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("xs" + ".ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("xs" + ".ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("xs" + ".ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("xs" + ".ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("xs" + ".ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("xs" + ".ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("xs" + ".ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("xs" + ".ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("xs" + ".ship_to_tel", "ship_to_tel"),
				MCItemDef.create("xs" + ".ship_to_fax", "ship_to_fax"),
				MCItemDef.create("xs" + ".ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("xs" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xs" + ".xrate", "xrate"),
				MCItemDef.create("xs" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("xs" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("xs" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xs" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("xs" + ".tax_cd", "tax_cd"),
				MCItemDef.create("xs" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("xs" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("xs" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("xs" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("xs" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("xs" + ".ret_xrate_inpt_flg", "ret_xrate_inpt_flg"),
				MCItemDef.create("xs" + ".ret_xrate", "ret_xrate"),
				MCItemDef.create("xs" + ".ret_ptax_xrate_inpt_flg", "ret_ptax_xrate_inpt_flg"),
				MCItemDef.create("xs" + ".ret_ptax_xrate", "ret_ptax_xrate"),
				MCItemDef.create("xs" + ".ret_trd_cur_cd", "ret_trd_cur_cd"),
				MCItemDef.create("xs" + ".ret_tax_fix_flg", "ret_tax_fix_flg"),
				MCItemDef.create("xs" + ".ret_tax_cd", "ret_tax_cd"),
				MCItemDef.create("xs" + ".ret_trd_cur_upri", "ret_trd_cur_upri"),
				MCItemDef.create("xs" + ".ret_trd_cur_amt", "ret_trd_cur_amt"),
				MCItemDef.create("xs" + ".ret_trd_cur_tax_amt", "ret_trd_cur_tax_amt"),
				MCItemDef.create("xs" + ".ret_wtax_rate", "ret_wtax_rate"),
				MCItemDef.create("xs" + ".ret_wtax_amt", "ret_wtax_amt"),
				MCItemDef.create("xs" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("inst_flg", "inst_flg"),
				MCItemDef.create("act_flg", "act_flg"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("XfrSchdChk04_Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL5200_XfrSchd_Chk04_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Chk04",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("xs" + ".lot_no", "lot_no"),
				MCItemDef.create("xs" + ".sublot_no", "sublot_no"),
				MCItemDef.create("xs" + ".ver_no", "ver_no"),
				MCItemDef.create("xs" + ".sno1", "sno1"),
				MCItemDef.create("xs" + ".sno2", "sno2"),
				MCItemDef.create("xs" + ".sno3", "sno3"),
				MCItemDef.create("xs" + ".sno4", "sno4"),
				MCItemDef.create("xs" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xs" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xs" + ".base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("XfrSchdChk04_AllocRslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5200_XfrSchd_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5200", "XfrSchd_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5200_XfrSchd_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xs" + ".xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xs" + ".xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xs" + ".xfr_src_no", "xfr_src_no"),
				MCItemDef.create("xs" + ".trd_cd", "trd_cd"),
				MCItemDef.create("xs" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("xs" + ".gi_wg_cd", "gi_wg_cd"),
				MCItemDef.create("xs" + ".gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("xs" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("xs" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("xs" + ".gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("xs" + ".gr_wg_cd", "gr_wg_cd"),
				MCItemDef.create("xs" + ".gr_lg_grp_cd", "gr_lg_grp_cd"),
				MCItemDef.create("xs" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xs" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("xs" + ".gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("xs" + ".itm_cd", "itm_cd"),
				MCItemDef.create("xs" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("xs" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("xs" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("xs" + ".lot_no", "lot_no"),
				MCItemDef.create("xs" + ".sublot_no", "sublot_no"),
				MCItemDef.create("xs" + ".sno1", "sno1"),
				MCItemDef.create("xs" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("xs" + ".sno2", "sno2"),
				MCItemDef.create("xs" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("xs" + ".sno3", "sno3"),
				MCItemDef.create("xs" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("xs" + ".sno4", "sno4"),
				MCItemDef.create("xs" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("xs" + ".ver_no", "ver_no"),
				MCItemDef.create("xs" + ".gd_cd", "gd_cd"),
				MCItemDef.create("xs" + ".quality_typ", "quality_typ"),
				MCItemDef.create("xs" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("xs" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xs" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xs" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xs" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("xs" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("xs" + ".gi_rqst_tm", "gi_rqst_tm"),
				MCItemDef.create("xs" + ".gr_rqst_tm", "gr_rqst_tm"),
				MCItemDef.create("xs" + ".rcpt_dt", "rcpt_dt"),
				MCItemDef.create("xs" + ".rqst_usr_cd", "rqst_usr_cd"),
				MCItemDef.create("xs" + ".rqst_dpt_cd", "rqst_dpt_cd"),
				MCItemDef.create("xs" + ".ship_term_cd", "ship_term_cd"),
				MCItemDef.create("xs" + ".ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("xs" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("xs" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("xs" + ".ship_block_flg", "ship_block_flg"),
				MCItemDef.create("xs" + ".ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("xs" + ".ship_to_id_cd", "ship_to_id_cd"),
				MCItemDef.create("xs" + ".ship_to_id_nm", "ship_to_id_nm"),
				MCItemDef.create("xs" + ".ship_to_zip_cd", "ship_to_zip_cd"),
				MCItemDef.create("xs" + ".ship_to_addr1", "ship_to_addr1"),
				MCItemDef.create("xs" + ".ship_to_addr2", "ship_to_addr2"),
				MCItemDef.create("xs" + ".ship_to_addr3", "ship_to_addr3"),
				MCItemDef.create("xs" + ".ship_to_addr4", "ship_to_addr4"),
				MCItemDef.create("xs" + ".ship_to_cntct_dpt", "ship_to_cntct_dpt"),
				MCItemDef.create("xs" + ".ship_to_cntct_psn", "ship_to_cntct_psn"),
				MCItemDef.create("xs" + ".ship_to_tel", "ship_to_tel"),
				MCItemDef.create("xs" + ".ship_to_fax", "ship_to_fax"),
				MCItemDef.create("xs" + ".ship_to_sundry_flg", "ship_to_sundry_flg"),
				MCItemDef.create("xs" + ".via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("xs" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("xs" + ".mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("xs" + ".oper_inst_no", "oper_inst_no"),
				MCItemDef.create("xs" + ".inpt_schd_no", "inpt_schd_no"),
				MCItemDef.create("xs" + ".slo_no", "slo_no"),
				MCItemDef.create("xs" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("xs" + ".cont_qty", "cont_qty"),
				MCItemDef.create("xs" + ".rqst_mod_flg", "rqst_mod_flg"),
				MCItemDef.create("xs" + ".rqst_can_flg", "rqst_can_flg"),
				MCItemDef.create("xs" + ".not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("xs" + ".not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("xs" + ".vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("xs" + ".vld_dt_to", "vld_dt_to"),
				MCItemDef.create("xs" + ".prov_typ", "prov_typ"),
				MCItemDef.create("xs" + ".prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("xs" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xs" + ".xrate", "xrate"),
				MCItemDef.create("xs" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("xs" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("xs" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xs" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("xs" + ".tax_cd", "tax_cd"),
				MCItemDef.create("xs" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("xs" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("xs" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("xs" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("xs" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("xs" + ".ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("xs" + ".ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("xs" + ".ret_xrate_inpt_flg", "ret_xrate_inpt_flg"),
				MCItemDef.create("xs" + ".ret_xrate", "ret_xrate"),
				MCItemDef.create("xs" + ".ret_ptax_xrate_inpt_flg", "ret_ptax_xrate_inpt_flg"),
				MCItemDef.create("xs" + ".ret_ptax_xrate", "ret_ptax_xrate"),
				MCItemDef.create("xs" + ".ret_trd_cur_cd", "ret_trd_cur_cd"),
				MCItemDef.create("xs" + ".ret_tax_fix_flg", "ret_tax_fix_flg"),
				MCItemDef.create("xs" + ".ret_tax_cd", "ret_tax_cd"),
				MCItemDef.create("xs" + ".ret_trd_cur_upri", "ret_trd_cur_upri"),
				MCItemDef.create("xs" + ".ret_trd_cur_amt", "ret_trd_cur_amt"),
				MCItemDef.create("xs" + ".ret_trd_cur_tax_amt", "ret_trd_cur_tax_amt"),
				MCItemDef.create("xs" + ".ret_wtax_rate", "ret_wtax_rate"),
				MCItemDef.create("xs" + ".ret_wtax_amt", "ret_wtax_amt"),
				MCItemDef.create("xs" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("xs" + ".base_dlv_slip_no", "base_dlv_slip_no"),
				MCItemDef.create("xs" + ".base_prov_act_no", "base_prov_act_no"),
				MCItemDef.create("xs" + ".base_ac_dt", "base_ac_dt"),
				MCItemDef.create("xs" + ".rqst_cnt_rmrks", "rqst_cnt_rmrks"),
				MCItemDef.create("xs" + ".ship_cnt_rmrks", "ship_cnt_rmrks"),
				MCItemDef.create("xs" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("xs" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("xs" + ".sub_char1", "sub_char1"),
				MCItemDef.create("xs" + ".sub_char2", "sub_char2"),
				MCItemDef.create("xs" + ".sub_char3", "sub_char3"),
				MCItemDef.create("alloc_flg", "alloc_flg")
			}
			,
			MCBlockDef.create("XfrSchd_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5200_XfrSchd_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("screen_flg", "screen_flg")
			}
			,
			MCBlockDef.create("XfrSchd_Ctrl")
		);
	}

	public static MCContainerDef MS_MSBEL5200_XfrSchd_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("xs" + ".lot_no", "lot_no"),
				MCItemDef.create("xs" + ".sublot_no", "sublot_no"),
				MCItemDef.create("xs" + ".ver_no", "ver_no"),
				MCItemDef.create("xs" + ".sno1", "sno1"),
				MCItemDef.create("xs" + ".sno2", "sno2"),
				MCItemDef.create("xs" + ".sno3", "sno3"),
				MCItemDef.create("xs" + ".sno4", "sno4"),
				MCItemDef.create("xs" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xs" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xs" + ".base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("XfrSchd_AllocRslt")
		);
	}


	public static MCContainerDef MS_MSBEL5200_XfrSchd_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xs" + ".xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xs" + ".xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xs" + ".xfr_src_no", "xfr_src_no")
			}
			,
			MCBlockDef.create("XfrSchd_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5200_XfrSchd_Upd02_INFO = new MCOperationInfo("MS", "MSBEL5200", "XfrSchd_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5200_XfrSchd_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("xas" + ".xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("xas" + ".pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("xas" + ".xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("xas" + ".xfr_inst_d_no", "xfr_inst_d_no"),
				MCItemDef.create("xas" + ".trd_cd", "trd_cd"),
				MCItemDef.create("xas" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("xas" + ".wg_cd", "wg_cd"),
				MCItemDef.create("xas" + ".lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("xas" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("xas" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("xas" + ".gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("xas" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("xas" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("xas" + ".gr_stk_arrv_bp_cd", "gr_stk_arrv_bp_cd"),
				MCItemDef.create("xas" + ".lot_no", "lot_no"),
				MCItemDef.create("xas" + ".sublot_no", "sublot_no"),
				MCItemDef.create("xas" + ".sno1", "sno1"),
				MCItemDef.create("xas" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("xas" + ".sno2", "sno2"),
				MCItemDef.create("xas" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("xas" + ".sno3", "sno3"),
				MCItemDef.create("xas" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("xas" + ".sno4", "sno4"),
				MCItemDef.create("xas" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("xas" + ".alloc_sno1", "alloc_sno1"),
				MCItemDef.create("xas" + ".alloc_sno2", "alloc_sno2"),
				MCItemDef.create("xas" + ".alloc_sno3", "alloc_sno3"),
				MCItemDef.create("xas" + ".alloc_sno4", "alloc_sno4"),
				MCItemDef.create("xas" + ".ver_no", "ver_no"),
				MCItemDef.create("xas" + ".gd_cd", "gd_cd"),
				MCItemDef.create("xas" + ".quality_typ", "quality_typ"),
				MCItemDef.create("xas" + ".stk_insp_typ", "stk_insp_typ"),
				MCItemDef.create("xas" + ".stk_id_typ", "stk_id_typ"),
				MCItemDef.create("xas" + ".stk_bp_cd", "stk_bp_cd"),
				MCItemDef.create("xas" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("xas" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("xas" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("xas" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("xas" + ".act_qty", "act_qty"),
				MCItemDef.create("xas" + ".xfr_schd_dt", "xfr_schd_dt"),
				MCItemDef.create("xas" + ".ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("xas" + ".rsn_cd", "rsn_cd"),
				MCItemDef.create("xas" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("xas" + ".inst_bndl_flg", "inst_bndl_flg"),
				MCItemDef.create("xas" + ".fix_flg", "fix_flg"),
				MCItemDef.create("xas" + ".abort_flg", "abort_flg"),
				MCItemDef.create("xas" + ".cmpl_flg", "cmpl_flg"),
				MCItemDef.create("xas" + ".alloc_flg", "alloc_flg"),
				MCItemDef.create("xas" + ".not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("xas" + ".not_sublot_mix_flg", "not_sublot_mix_flg"),
				MCItemDef.create("xas" + ".vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("xas" + ".vld_dt_to", "vld_dt_to"),
				MCItemDef.create("xas" + ".prov_typ", "prov_typ"),
				MCItemDef.create("xas" + ".prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("xas" + ".ret_prov_typ", "ret_prov_typ"),
				MCItemDef.create("xas" + ".ret_prov_basis_typ", "ret_prov_basis_typ"),
				MCItemDef.create("xas" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("xas" + ".sub_char1", "sub_char1"),
				MCItemDef.create("xas" + ".sub_char2", "sub_char2"),
				MCItemDef.create("xas" + ".sub_char3", "sub_char3"),
				MCItemDef.create("xas" + ".disp_seq", "disp_seq"),
				MCItemDef.create("xas" + ".dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("xas" + ".dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("xas" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("xas" + ".inst_d_rmrks", "inst_d_rmrks"),
				MCItemDef.create("xas" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("xas" + ".wms_flg", "wms_flg"),
				MCItemDef.create("old_xfr_alloc_sts_no", "old_xfr_alloc_sts_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cont_qty", "cont_qty"),
				MCItemDef.create("gi_def_loc_cd", "gi_def_loc_cd"),
				MCItemDef.create("inst_rem_abort_flg", "inst_rem_abort_flg"),
				MCItemDef.create("xs" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xs" + ".xrate", "xrate"),
				MCItemDef.create("xs" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("xs" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("xs" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xs" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("xs" + ".tax_cd", "tax_cd"),
				MCItemDef.create("xs" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("xs" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("xs" + ".ret_xrate_inpt_flg", "ret_xrate_inpt_flg"),
				MCItemDef.create("xs" + ".ret_xrate", "ret_xrate"),
				MCItemDef.create("xs" + ".ret_ptax_xrate_inpt_flg", "ret_ptax_xrate_inpt_flg"),
				MCItemDef.create("xs" + ".ret_ptax_xrate", "ret_ptax_xrate"),
				MCItemDef.create("xs" + ".ret_trd_cur_cd", "ret_trd_cur_cd"),
				MCItemDef.create("xs" + ".ret_tax_fix_flg", "ret_tax_fix_flg"),
				MCItemDef.create("xs" + ".ret_tax_cd", "ret_tax_cd"),
				MCItemDef.create("xs" + ".ret_trd_cur_upri", "ret_trd_cur_upri"),
				MCItemDef.create("xs" + ".ret_wtax_rate", "ret_wtax_rate")
			}
			,
			MCBlockDef.create("XfrPr_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5200_XfrSchd_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("schd_flg", "schd_flg"),
				MCItemDef.create("inst_flg", "inst_flg"),
				MCItemDef.create("act_flg", "act_flg"),
				MCItemDef.create("re_call_flg", "re_call_flg")
			}
			,
			MCBlockDef.create("XfrPr_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBEL5200_XfrSchd_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("xas" + ".xfr_alloc_sts_no", "xfr_alloc_sts_no"),
				MCItemDef.create("prov_schd_no", "prov_schd_no"),
				MCItemDef.create("ret_prov_schd_no", "ret_prov_schd_no")
			}
			,
			MCBlockDef.create("XfrPr_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5200_XfrSchd_Upd03_INFO = new MCOperationInfo("MS", "MSBEL5200", "XfrSchd_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5200_XfrSchd_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Upd03",
			new MCItemDef[]{
				MCItemDef.create("xfr_src_typ", "xfr_src_typ"),
				MCItemDef.create("xfr_src_no", "xfr_src_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("rqst_mod_flg", "rqst_mod_flg"),
				MCItemDef.create("rqst_can_flg", "rqst_can_flg")
			}
			,
			MCBlockDef.create("XfrSchdMod_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5200_XfrSchd_Sprt01_INFO = new MCOperationInfo("MS", "MSBEL5200", "XfrSchd_Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5200_XfrSchd_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gr_lg_grp_cd", "gr_lg_grp_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("gr_schd_dt", "gr_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt")
			}
			,
			MCBlockDef.create("XfrSchdEx_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL5200_XfrSchd_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5200", "XfrSchd_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_cd"),
				MCItemDef.create("iv_trd_flg", "iv_trd_flg"),
				MCItemDef.create("ex_cmpl_schd_dt", "ex_cmpl_schd_dt"),
				MCItemDef.create("ship_to_id_typ", "ship_to_id_typ"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("io_schd_typ", "io_schd_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("XfrSchdEx_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

