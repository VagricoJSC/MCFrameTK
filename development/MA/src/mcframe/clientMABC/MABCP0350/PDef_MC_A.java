package mcframe.clientMABC.MABCP0350;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_ItmTypDtlReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0350.Srch01.UP.BLOCK0")){
			return MA_MABCL0350_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0350.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0350_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0350.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0350_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0350.Upd01.UP.BLOCK0")){
			return MA_MABCL0350_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0350.Upd01.UP.BLOCK1")){
			return MA_MABCL0350_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0350.Del01.UP.BLOCK0")){
			return MA_MABCL0350_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABCL0350_Srch01_INFO = new MCOperationInfo("MA", "MABCL0350", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0350_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0350", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm_lcl"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0350_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0350", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm_lcl", "itm_typ_d_nm_lcl"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("def_sls_flg", "def_sls_flg"),
				MCItemDef.create("def_mfg_flg", "def_mfg_flg"),
				MCItemDef.create("def_purc_flg", "def_purc_flg"),
				MCItemDef.create("def_insp_flg", "def_insp_flg"),
				MCItemDef.create("def_itm_jnl_cd", "def_itm_jnl_cd"),
				MCItemDef.create("def_itm_jnl_nm", "def_itm_jnl_nm"),
				MCItemDef.create("def_ac_itm_grp_cd", "def_ac_itm_grp_cd"),
				MCItemDef.create("def_ac_itm_grp_nm", "def_ac_itm_grp_nm"),
				MCItemDef.create("def_minus_stk_flg", "def_minus_stk_flg"),
				MCItemDef.create("def_not_new_lot_flg", "def_not_new_lot_flg"),
				MCItemDef.create("def_gi_alloc_flg", "def_gi_alloc_flg"),
				MCItemDef.create("def_pack_alloc_flg", "def_pack_alloc_flg"),
				MCItemDef.create("def_bp_lot_flg", "def_bp_lot_flg"),
				MCItemDef.create("def_comp_spec_typ", "def_comp_spec_typ"),
				MCItemDef.create("def_comp_spec_typ_nm", "def_comp_spec_typ_nm"),
				MCItemDef.create("def_comp_rev_at_slo_flg", "def_comp_rev_at_slo_flg"),
				MCItemDef.create("def_comp_core_itm_flg", "def_comp_core_itm_flg"),
				MCItemDef.create("def_insp_bind_typ", "def_insp_bind_typ"),
				MCItemDef.create("def_insp_bind_typ_nm", "def_insp_bind_typ_nm"),
				MCItemDef.create("def_skip_chk_ship_flg", "def_skip_chk_ship_flg"),
				MCItemDef.create("def_itm_spec_grp_cd", "def_itm_spec_grp_cd"),
				MCItemDef.create("def_itm_spec_grp_nm", "def_itm_spec_grp_nm"),
				MCItemDef.create("def_lmt_ctl_flg", "def_lmt_ctl_flg"),
				MCItemDef.create("def_lmt_ctl_categ", "def_lmt_ctl_categ"),
				MCItemDef.create("def_sls_upri_grp_cd", "def_sls_upri_grp_cd"),
				MCItemDef.create("def_sls_upri_grp_nm", "def_sls_upri_grp_nm"),
				MCItemDef.create("def_slo_proc_flg", "def_slo_proc_flg"),
				MCItemDef.create("def_slo_proc_typ", "def_slo_proc_typ"),
				MCItemDef.create("def_slo_proc_typ_nm", "def_slo_proc_typ_nm"),
				MCItemDef.create("def_ship_inst_typ", "def_ship_inst_typ"),
				MCItemDef.create("def_ship_inst_typ_nm", "def_ship_inst_typ_nm"),
				MCItemDef.create("def_ship_lot_back_stop_flg", "def_ship_lot_back_stop_flg"),
				MCItemDef.create("def_itm_ship_grp_cd", "def_itm_ship_grp_cd"),
				MCItemDef.create("def_itm_ship_grp_nm", "def_itm_ship_grp_nm"),
				MCItemDef.create("def_ship_valid_grp_cd", "def_ship_valid_grp_cd"),
				MCItemDef.create("def_ship_valid_grp_nm", "def_ship_valid_grp_nm"),
				MCItemDef.create("def_arr_skip_flg", "def_arr_skip_flg"),
				MCItemDef.create("def_ship_term_cd", "def_ship_term_cd"),
				MCItemDef.create("def_ship_term_nm", "def_ship_term_nm"),
				MCItemDef.create("def_stk_lst_flg", "def_stk_lst_flg"),
				MCItemDef.create("def_ver_flg", "def_ver_flg"),
				MCItemDef.create("def_mfg_inst_unit_typ", "def_mfg_inst_unit_typ"),
				MCItemDef.create("def_mfg_inst_unit_typ_nm", "def_mfg_inst_unit_typ_nm"),
				MCItemDef.create("def_sls_upri_cng_flg", "def_sls_upri_cng_flg"),
				MCItemDef.create("def_purc_upri_cng_flg", "def_purc_upri_cng_flg"),
				MCItemDef.create("def_prov_upri_cng_flg", "def_prov_upri_cng_flg"),
				MCItemDef.create("def_mrp_proc_typ", "def_mrp_proc_typ"),
				MCItemDef.create("def_mrp_proc_typ_nm", "def_mrp_proc_typ_nm"),
				MCItemDef.create("def_rqmt_typ", "def_rqmt_typ"),
				MCItemDef.create("def_rqmt_typ_nm", "def_rqmt_typ_nm"),
				MCItemDef.create("def_prod_pln_typ", "def_prod_pln_typ"),
				MCItemDef.create("def_prod_pln_typ_nm", "def_prod_pln_typ_nm"),
				MCItemDef.create("def_dmnd_date_div_mons", "def_dmnd_date_div_mons"),
				MCItemDef.create("def_alloc_margin_days", "def_alloc_margin_days"),
				MCItemDef.create("def_mrp_alloc_margin_days", "def_mrp_alloc_margin_days"),
				MCItemDef.create("def_mrp_opn_xfr_days", "def_mrp_opn_xfr_days"),
				MCItemDef.create("def_inpt_itm_add_flg", "def_inpt_itm_add_flg"),
				MCItemDef.create("def_inpt_itm_del_flg", "def_inpt_itm_del_flg"),
				MCItemDef.create("def_sch_flg", "def_sch_flg"),
				MCItemDef.create("def_lot_mng_typ", "def_lot_mng_typ"),
				MCItemDef.create("def_lot_mng_typ_nm", "def_lot_mng_typ_nm"),
				MCItemDef.create("def_lot_no_typ", "def_lot_no_typ"),
				MCItemDef.create("def_lot_no_typ_nm", "def_lot_no_typ_nm"),
				MCItemDef.create("def_lot_no_ptn_cd", "def_lot_no_ptn_cd"),
				MCItemDef.create("def_lot_no_ptn_nm", "def_lot_no_ptn_nm"),
				MCItemDef.create("def_sublot_mng_typ", "def_sublot_mng_typ"),
				MCItemDef.create("def_sublot_mng_typ_nm", "def_sublot_mng_typ_nm"),
				MCItemDef.create("def_sublot_no_typ", "def_sublot_no_typ"),
				MCItemDef.create("def_sublot_no_typ_nm", "def_sublot_no_typ_nm"),
				MCItemDef.create("def_sublot_no_ptn_cd", "def_sublot_no_ptn_cd"),
				MCItemDef.create("def_sublot_no_ptn_nm", "def_sublot_no_ptn_nm"),
				MCItemDef.create("def_sno1_mng_typ", "def_sno1_mng_typ"),
				MCItemDef.create("def_sno1_mng_typ_nm", "def_sno1_mng_typ_nm"),
				MCItemDef.create("def_slo_sno1_flg", "def_slo_sno1_flg"),
				MCItemDef.create("def_rqmt_sno1_flg", "def_rqmt_sno1_flg"),
				MCItemDef.create("def_sno1_num_typ", "def_sno1_num_typ"),
				MCItemDef.create("def_sno1_num_typ_nm", "def_sno1_num_typ_nm"),
				MCItemDef.create("def_sno1_ptn_cd", "def_sno1_ptn_cd"),
				MCItemDef.create("def_sno1_ptn_nm", "def_sno1_ptn_nm"),
				MCItemDef.create("def_sno2_mng_typ", "def_sno2_mng_typ"),
				MCItemDef.create("def_sno2_mng_typ_nm", "def_sno2_mng_typ_nm"),
				MCItemDef.create("def_slo_sno2_flg", "def_slo_sno2_flg"),
				MCItemDef.create("def_rqmt_sno2_flg", "def_rqmt_sno2_flg"),
				MCItemDef.create("def_sno2_num_typ", "def_sno2_num_typ"),
				MCItemDef.create("def_sno2_num_typ_nm", "def_sno2_num_typ_nm"),
				MCItemDef.create("def_sno2_ptn_cd", "def_sno2_ptn_cd"),
				MCItemDef.create("def_sno2_ptn_nm", "def_sno2_ptn_nm"),
				MCItemDef.create("def_sno3_mng_typ", "def_sno3_mng_typ"),
				MCItemDef.create("def_sno3_mng_typ_nm", "def_sno3_mng_typ_nm"),
				MCItemDef.create("def_slo_sno3_flg", "def_slo_sno3_flg"),
				MCItemDef.create("def_rqmt_sno3_flg", "def_rqmt_sno3_flg"),
				MCItemDef.create("def_sno3_num_typ", "def_sno3_num_typ"),
				MCItemDef.create("def_sno3_num_typ_nm", "def_sno3_num_typ_nm"),
				MCItemDef.create("def_sno3_ptn_cd", "def_sno3_ptn_cd"),
				MCItemDef.create("def_sno3_ptn_nm", "def_sno3_ptn_nm"),
				MCItemDef.create("def_sno4_mng_typ", "def_sno4_mng_typ"),
				MCItemDef.create("def_sno4_mng_typ_nm", "def_sno4_mng_typ_nm"),
				MCItemDef.create("def_slo_sno4_flg", "def_slo_sno4_flg"),
				MCItemDef.create("def_rqmt_sno4_flg", "def_rqmt_sno4_flg"),
				MCItemDef.create("def_sno4_num_typ", "def_sno4_num_typ"),
				MCItemDef.create("def_sno4_num_typ_nm", "def_sno4_num_typ_nm"),
				MCItemDef.create("def_sno4_ptn_cd", "def_sno4_ptn_cd"),
				MCItemDef.create("def_sno4_ptn_nm", "def_sno4_ptn_nm"),
				MCItemDef.create("def_mrkt_judg_flg", "def_mrkt_judg_flg"),
				MCItemDef.create("def_mrkt_judg_role_cd", "def_mrkt_judg_role_cd"),
				MCItemDef.create("def_mrkt_judg_role_nm", "def_mrkt_judg_role_nm"),
				MCItemDef.create("def_mrkt_judg_upd_role_cd", "def_mrkt_judg_upd_role_cd"),
				MCItemDef.create("def_mrkt_judg_upd_role_nm", "def_mrkt_judg_upd_role_nm"),
				MCItemDef.create("def_plnt_aprv_flg", "def_plnt_aprv_flg"),
				MCItemDef.create("def_plnt_aprv_role_cd", "def_plnt_aprv_role_cd"),
				MCItemDef.create("def_plnt_aprv_role_nm", "def_plnt_aprv_role_nm"),
				MCItemDef.create("def_insp_aprv_flg", "def_insp_aprv_flg"),
				MCItemDef.create("def_insp_aprv_role_cd", "def_insp_aprv_role_cd"),
				MCItemDef.create("def_insp_aprv_role_nm", "def_insp_aprv_role_nm"),
				MCItemDef.create("def_mfg_aprv_flg", "def_mfg_aprv_flg"),
				MCItemDef.create("def_mfg_aprv_role_cd", "def_mfg_aprv_role_cd"),
				MCItemDef.create("def_mfg_aprv_role_nm", "def_mfg_aprv_role_nm"),
				MCItemDef.create("def_sno_typ1", "def_sno_typ1"),
				MCItemDef.create("def_sno_typ_nm1", "def_sno_typ_nm1"),
				MCItemDef.create("def_sno_typ2", "def_sno_typ2"),
				MCItemDef.create("def_sno_typ_nm2", "def_sno_typ_nm2"),
				MCItemDef.create("def_sno_typ3", "def_sno_typ3"),
				MCItemDef.create("def_sno_typ_nm3", "def_sno_typ_nm3"),
				MCItemDef.create("def_sno_typ4", "def_sno_typ4"),
				MCItemDef.create("def_sno_typ_nm4", "def_sno_typ_nm4"),
				MCItemDef.create("def_inst_lot_fix_flg", "def_inst_lot_fix_flg"),
				MCItemDef.create("def_lot_mix_flg", "def_lot_mix_flg"),
				MCItemDef.create("def_sublot_mix_flg", "def_sublot_mix_flg"),
				MCItemDef.create("def_alloc_ctl_typ", "def_alloc_ctl_typ"),
				MCItemDef.create("def_alloc_ctl_typ_nm", "def_alloc_ctl_typ_nm"),
				MCItemDef.create("def_inpt_ctl_typ", "def_inpt_ctl_typ"),
				MCItemDef.create("def_inpt_ctl_typ_nm", "def_inpt_ctl_typ_nm"),
				MCItemDef.create("def_bkf_typ", "def_bkf_typ"),
				MCItemDef.create("def_bkf_typ_nm", "def_bkf_typ_nm"),
				MCItemDef.create("def_main_itm_flg", "def_main_itm_flg"),
				MCItemDef.create("def_byprod_flg", "def_byprod_flg"),
				MCItemDef.create("def_not_cost_bom_flg", "def_not_cost_bom_flg"),
				MCItemDef.create("def_calc_ptn_cd", "def_calc_ptn_cd"),
				MCItemDef.create("def_calc_ptn_nm", "def_calc_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MA_MABCL0350_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0350", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("LclAll")
		);
	}
	
	static final MCOperationInfo MA_MABCL0350_Upd01_INFO = new MCOperationInfo("MA", "MABCL0350", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0350_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0350", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("def_sls_flg", "def_sls_flg"),
				MCItemDef.create("def_mfg_flg", "def_mfg_flg"),
				MCItemDef.create("def_purc_flg", "def_purc_flg"),
				MCItemDef.create("def_insp_flg", "def_insp_flg"),
				MCItemDef.create("def_itm_jnl_cd", "def_itm_jnl_cd"),
				MCItemDef.create("def_ac_itm_grp_cd", "def_ac_itm_grp_cd"),
				MCItemDef.create("def_minus_stk_flg", "def_minus_stk_flg"),
				MCItemDef.create("def_not_new_lot_flg", "def_not_new_lot_flg"),
				MCItemDef.create("def_gi_alloc_flg", "def_gi_alloc_flg"),
				MCItemDef.create("def_pack_alloc_flg", "def_pack_alloc_flg"),
				MCItemDef.create("def_bp_lot_flg", "def_bp_lot_flg"),
				MCItemDef.create("def_comp_spec_typ", "def_comp_spec_typ"),
				MCItemDef.create("def_comp_rev_at_slo_flg", "def_comp_rev_at_slo_flg"),
				MCItemDef.create("def_comp_core_itm_flg", "def_comp_core_itm_flg"),
				MCItemDef.create("def_insp_bind_typ", "def_insp_bind_typ"),
				MCItemDef.create("def_skip_chk_ship_flg", "def_skip_chk_ship_flg"),
				MCItemDef.create("def_itm_spec_grp_cd", "def_itm_spec_grp_cd"),
				MCItemDef.create("def_lmt_ctl_flg", "def_lmt_ctl_flg"),
				MCItemDef.create("def_lmt_ctl_categ", "def_lmt_ctl_categ"),
				MCItemDef.create("def_sls_upri_grp_cd", "def_sls_upri_grp_cd"),
				MCItemDef.create("def_slo_proc_flg", "def_slo_proc_flg"),
				MCItemDef.create("def_slo_proc_typ", "def_slo_proc_typ"),
				MCItemDef.create("def_ship_inst_typ", "def_ship_inst_typ"),
				MCItemDef.create("def_ship_lot_back_stop_flg", "def_ship_lot_back_stop_flg"),
				MCItemDef.create("def_itm_ship_grp_cd", "def_itm_ship_grp_cd"),
				MCItemDef.create("def_ship_valid_grp_cd", "def_ship_valid_grp_cd"),
				MCItemDef.create("def_arr_skip_flg", "def_arr_skip_flg"),
				MCItemDef.create("def_ship_term_cd", "def_ship_term_cd"),
				MCItemDef.create("def_stk_lst_flg", "def_stk_lst_flg"),
				MCItemDef.create("def_ver_flg", "def_ver_flg"),
				MCItemDef.create("def_mfg_inst_unit_typ", "def_mfg_inst_unit_typ"),
				MCItemDef.create("def_sls_upri_cng_flg", "def_sls_upri_cng_flg"),
				MCItemDef.create("def_purc_upri_cng_flg", "def_purc_upri_cng_flg"),
				MCItemDef.create("def_prov_upri_cng_flg", "def_prov_upri_cng_flg"),
				MCItemDef.create("def_mrp_proc_typ", "def_mrp_proc_typ"),
				MCItemDef.create("def_rqmt_typ", "def_rqmt_typ"),
				MCItemDef.create("def_prod_pln_typ", "def_prod_pln_typ"),
				MCItemDef.create("def_dmnd_date_div_mons", "def_dmnd_date_div_mons"),
				MCItemDef.create("def_alloc_margin_days", "def_alloc_margin_days"),
				MCItemDef.create("def_mrp_alloc_margin_days", "def_mrp_alloc_margin_days"),
				MCItemDef.create("def_mrp_opn_xfr_days", "def_mrp_opn_xfr_days"),
				MCItemDef.create("def_inpt_itm_add_flg", "def_inpt_itm_add_flg"),
				MCItemDef.create("def_inpt_itm_del_flg", "def_inpt_itm_del_flg"),
				MCItemDef.create("def_sch_flg", "def_sch_flg"),
				MCItemDef.create("def_lot_mng_typ", "def_lot_mng_typ"),
				MCItemDef.create("def_lot_no_typ", "def_lot_no_typ"),
				MCItemDef.create("def_lot_no_ptn_cd", "def_lot_no_ptn_cd"),
				MCItemDef.create("def_sublot_mng_typ", "def_sublot_mng_typ"),
				MCItemDef.create("def_sublot_no_typ", "def_sublot_no_typ"),
				MCItemDef.create("def_sublot_no_ptn_cd", "def_sublot_no_ptn_cd"),
				MCItemDef.create("def_sno1_mng_typ", "def_sno1_mng_typ"),
				MCItemDef.create("def_slo_sno1_flg", "def_slo_sno1_flg"),
				MCItemDef.create("def_rqmt_sno1_flg", "def_rqmt_sno1_flg"),
				MCItemDef.create("def_sno1_num_typ", "def_sno1_num_typ"),
				MCItemDef.create("def_sno1_ptn_cd", "def_sno1_ptn_cd"),
				MCItemDef.create("def_sno2_mng_typ", "def_sno2_mng_typ"),
				MCItemDef.create("def_slo_sno2_flg", "def_slo_sno2_flg"),
				MCItemDef.create("def_rqmt_sno2_flg", "def_rqmt_sno2_flg"),
				MCItemDef.create("def_sno2_num_typ", "def_sno2_num_typ"),
				MCItemDef.create("def_sno2_ptn_cd", "def_sno2_ptn_cd"),
				MCItemDef.create("def_sno3_mng_typ", "def_sno3_mng_typ"),
				MCItemDef.create("def_slo_sno3_flg", "def_slo_sno3_flg"),
				MCItemDef.create("def_rqmt_sno3_flg", "def_rqmt_sno3_flg"),
				MCItemDef.create("def_sno3_num_typ", "def_sno3_num_typ"),
				MCItemDef.create("def_sno3_ptn_cd", "def_sno3_ptn_cd"),
				MCItemDef.create("def_sno4_mng_typ", "def_sno4_mng_typ"),
				MCItemDef.create("def_slo_sno4_flg", "def_slo_sno4_flg"),
				MCItemDef.create("def_rqmt_sno4_flg", "def_rqmt_sno4_flg"),
				MCItemDef.create("def_sno4_num_typ", "def_sno4_num_typ"),
				MCItemDef.create("def_sno4_ptn_cd", "def_sno4_ptn_cd"),
				MCItemDef.create("def_mrkt_judg_flg", "def_mrkt_judg_flg"),
				MCItemDef.create("def_mrkt_judg_role_cd", "def_mrkt_judg_role_cd"),
				MCItemDef.create("def_mrkt_judg_upd_role_cd", "def_mrkt_judg_upd_role_cd"),
				MCItemDef.create("def_plnt_aprv_flg", "def_plnt_aprv_flg"),
				MCItemDef.create("def_plnt_aprv_role_cd", "def_plnt_aprv_role_cd"),
				MCItemDef.create("def_insp_aprv_flg", "def_insp_aprv_flg"),
				MCItemDef.create("def_insp_aprv_role_cd", "def_insp_aprv_role_cd"),
				MCItemDef.create("def_mfg_aprv_flg", "def_mfg_aprv_flg"),
				MCItemDef.create("def_mfg_aprv_role_cd", "def_mfg_aprv_role_cd"),
				MCItemDef.create("def_sno_typ1", "def_sno_typ1"),
				MCItemDef.create("def_sno_typ2", "def_sno_typ2"),
				MCItemDef.create("def_sno_typ3", "def_sno_typ3"),
				MCItemDef.create("def_sno_typ4", "def_sno_typ4"),
				MCItemDef.create("def_inst_lot_fix_flg", "def_inst_lot_fix_flg"),
				MCItemDef.create("def_lot_mix_flg", "def_lot_mix_flg"),
				MCItemDef.create("def_sublot_mix_flg", "def_sublot_mix_flg"),
				MCItemDef.create("def_alloc_ctl_typ", "def_alloc_ctl_typ"),
				MCItemDef.create("def_inpt_ctl_typ", "def_inpt_ctl_typ"),
				MCItemDef.create("def_bkf_typ", "def_bkf_typ"),
				MCItemDef.create("def_main_itm_flg", "def_main_itm_flg"),
				MCItemDef.create("def_byprod_flg", "def_byprod_flg"),
				MCItemDef.create("def_not_cost_bom_flg", "def_not_cost_bom_flg"),
				MCItemDef.create("def_calc_ptn_cd", "def_calc_ptn_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0350_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0350", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LclAll")
		);
	}
	
	static final MCOperationInfo MA_MABCL0350_Del01_INFO = new MCOperationInfo("MA", "MABCL0350", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0350_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0350", "Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

