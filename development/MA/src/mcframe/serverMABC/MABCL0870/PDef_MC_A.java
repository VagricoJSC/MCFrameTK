package mcframe.serverMABC.MABCL0870;

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
 * [MABCL_ItmCopyReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0870.ItmCopy_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0870_ItmCopy_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0870.ItmCopy_UpdChk01.UP.BLOCK1")){
			return MA_MABCL0870_ItmCopy_UpdChk01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0870.ItmCopy_Upd01.UP.BLOCK0")){
			return MA_MABCL0870_ItmCopy_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0870.ItmCopy_Upd01.UP.BLOCK1")){
			return MA_MABCL0870_ItmCopy_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0870.ItmCopy_DelChk01.UP.BLOCK0")){
			return MA_MABCL0870_ItmCopy_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0870.ItmCopy_Del01.UP.BLOCK0")){
			return MA_MABCL0870_ItmCopy_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0870.Srch01.UP.BLOCK0")){
			return MA_MABCL0870_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0870.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0870_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0870.Srch02.UP.BLOCK0")){
			return MA_MABCL0870_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0870.Srch02.DOWN.BLOCK0")){
			return MA_MABCL0870_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0870.Upd01.UP.BLOCK0")){
			return MA_MABCL0870_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0870.Upd01.UP.BLOCK1")){
			return MA_MABCL0870_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0870.Del01.UP.BLOCK0")){
			return MA_MABCL0870_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MA_MABCL0870_ItmCopy_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0870", "ItmCopy_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0870_ItmCopy_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0870", "ItmCopy_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dest_itm_cd", "dest_itm_cd"),
				MCItemDef.create("dest_itm_sub1", "dest_itm_sub1"),
				MCItemDef.create("dest_itm_sub2", "dest_itm_sub2"),
				MCItemDef.create("dest_itm_sub3", "dest_itm_sub3"),
				MCItemDef.create("dest_itm_nm", "dest_itm_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("itm_flg", "itm_flg"),
				MCItemDef.create("itm_sub_flg", "itm_sub_flg"),
				MCItemDef.create("itm_unit_flg", "itm_unit_flg"),
				MCItemDef.create("attach_info_flg", "attach_info_flg"),
				MCItemDef.create("itm_stop_flg", "itm_stop_flg"),
				MCItemDef.create("itm_not_fix_flg", "itm_not_fix_flg"),
				MCItemDef.create("stdcost_flg", "stdcost_flg"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_strg_flg", "itm_strg_flg"),
				MCItemDef.create("alloc_ctl_flg", "alloc_ctl_flg"),
				MCItemDef.create("stk_rpl_flg", "stk_rpl_flg"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("itm_wg_flg", "itm_wg_flg"),
				MCItemDef.create("itm_dtl_flg", "itm_dtl_flg"),
				MCItemDef.create("itm_oper_flg", "itm_oper_flg"),
				MCItemDef.create("bom_par_flg", "bom_par_flg"),
				MCItemDef.create("bom_chd_flg", "bom_chd_flg"),
				MCItemDef.create("oper_wk_cost_flg", "oper_wk_cost_flg"),
				MCItemDef.create("itm_insp_ptn_flg", "itm_insp_ptn_flg"),
				MCItemDef.create("itm_insp_flg", "itm_insp_flg"),
				MCItemDef.create("insp_spec_flg", "insp_spec_flg"),
				MCItemDef.create("itm_site_flg", "itm_site_flg"),
				MCItemDef.create("itm_ver_flg", "itm_ver_flg"),
				MCItemDef.create("lot_inh_dest_flg", "lot_inh_dest_flg"),
				MCItemDef.create("lot_inh_src_flg", "lot_inh_src_flg"),
				MCItemDef.create("itm_spec_flg", "itm_spec_flg"),
				MCItemDef.create("itm_spec_desc_flg", "itm_spec_desc_flg"),
				MCItemDef.create("itm_comp_core_flg", "itm_comp_core_flg"),
				MCItemDef.create("itm_comp_comp_flg", "itm_comp_comp_flg"),
				MCItemDef.create("mps_itm_flg", "mps_itm_flg"),
				MCItemDef.create("spln_itm_conf_flg", "spln_itm_conf_flg"),
				MCItemDef.create("purc_ddlv_lt_flg", "purc_ddlv_lt_flg"),
				MCItemDef.create("bp_itm_flg", "bp_itm_flg"),
				MCItemDef.create("proc_upri_flg", "proc_upri_flg"),
				MCItemDef.create("prov_upri_flg", "prov_upri_flg"),
				MCItemDef.create("purc_upri_flg", "purc_upri_flg"),
				MCItemDef.create("std_sls_upri_flg", "std_sls_upri_flg"),
				MCItemDef.create("itm_sls_upri_flg", "itm_sls_upri_flg"),
				MCItemDef.create("cst_sls_upri_flg", "cst_sls_upri_flg"),
				MCItemDef.create("set_itm_main_flg", "set_itm_main_flg"),
				MCItemDef.create("set_itm_set_flg", "set_itm_set_flg"),
				MCItemDef.create("if_x_flg", "if_x_flg"),
				MCItemDef.create("ctg_config_flg", "ctg_config_flg"),
				MCItemDef.create("jnl_ptn_flg", "jnl_ptn_flg"),
				MCItemDef.create("coef_config_flg", "coef_config_flg"),
				MCItemDef.create("alc_expns_flg", "alc_expns_flg"),
				MCItemDef.create("alc_inpt_flg", "alc_inpt_flg"),
				MCItemDef.create("cost_itm_out_flg", "cost_itm_out_flg"),
				MCItemDef.create("xpns_purc_alc_flg", "xpns_purc_alc_flg"),
				MCItemDef.create("itm_lg_grp_flg", "itm_lg_grp_flg"),
				MCItemDef.create("itm_str_ln_flg", "itm_str_ln_flg")
			}
			,
			MCBlockDef.create("ItmCopy_UpdChk01_Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0870_ItmCopy_UpdChk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0870", "ItmCopy_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("ex_on_del_flg", "ex_on_del_flg"),
				MCItemDef.create("ex_past_end_dt", "ex_past_end_dt")
			}
			,
			MCBlockDef.create("ItmCopy_UpdChk01_Cnd")
		);
	}
	
	static final MCOperationInfo MA_MABCL0870_ItmCopy_Upd01_INFO = new MCOperationInfo("MA", "MABCL0870", "ItmCopy_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0870_ItmCopy_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0870", "ItmCopy_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dest_itm_cd", "dest_itm_cd"),
				MCItemDef.create("dest_itm_sub1", "dest_itm_sub1"),
				MCItemDef.create("dest_itm_sub2", "dest_itm_sub2"),
				MCItemDef.create("dest_itm_sub3", "dest_itm_sub3"),
				MCItemDef.create("dest_itm_nm", "dest_itm_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("itm_flg", "itm_flg"),
				MCItemDef.create("itm_sub_flg", "itm_sub_flg"),
				MCItemDef.create("itm_unit_flg", "itm_unit_flg"),
				MCItemDef.create("attach_info_flg", "attach_info_flg"),
				MCItemDef.create("itm_stop_flg", "itm_stop_flg"),
				MCItemDef.create("itm_not_fix_flg", "itm_not_fix_flg"),
				MCItemDef.create("stdcost_flg", "stdcost_flg"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_strg_flg", "itm_strg_flg"),
				MCItemDef.create("alloc_ctl_flg", "alloc_ctl_flg"),
				MCItemDef.create("stk_rpl_flg", "stk_rpl_flg"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("itm_wg_flg", "itm_wg_flg"),
				MCItemDef.create("itm_dtl_flg", "itm_dtl_flg"),
				MCItemDef.create("itm_oper_flg", "itm_oper_flg"),
				MCItemDef.create("bom_par_flg", "bom_par_flg"),
				MCItemDef.create("bom_chd_flg", "bom_chd_flg"),
				MCItemDef.create("oper_wk_cost_flg", "oper_wk_cost_flg"),
				MCItemDef.create("itm_insp_ptn_flg", "itm_insp_ptn_flg"),
				MCItemDef.create("itm_insp_flg", "itm_insp_flg"),
				MCItemDef.create("insp_spec_flg", "insp_spec_flg"),
				MCItemDef.create("itm_site_flg", "itm_site_flg"),
				MCItemDef.create("itm_ver_flg", "itm_ver_flg"),
				MCItemDef.create("lot_inh_dest_flg", "lot_inh_dest_flg"),
				MCItemDef.create("lot_inh_src_flg", "lot_inh_src_flg"),
				MCItemDef.create("itm_spec_flg", "itm_spec_flg"),
				MCItemDef.create("itm_spec_desc_flg", "itm_spec_desc_flg"),
				MCItemDef.create("itm_comp_core_flg", "itm_comp_core_flg"),
				MCItemDef.create("itm_comp_comp_flg", "itm_comp_comp_flg"),
				MCItemDef.create("mps_itm_flg", "mps_itm_flg"),
				MCItemDef.create("spln_itm_conf_flg", "spln_itm_conf_flg"),
				MCItemDef.create("purc_ddlv_lt_flg", "purc_ddlv_lt_flg"),
				MCItemDef.create("bp_itm_flg", "bp_itm_flg"),
				MCItemDef.create("proc_upri_flg", "proc_upri_flg"),
				MCItemDef.create("prov_upri_flg", "prov_upri_flg"),
				MCItemDef.create("purc_upri_flg", "purc_upri_flg"),
				MCItemDef.create("std_sls_upri_flg", "std_sls_upri_flg"),
				MCItemDef.create("itm_sls_upri_flg", "itm_sls_upri_flg"),
				MCItemDef.create("cst_sls_upri_flg", "cst_sls_upri_flg"),
				MCItemDef.create("set_itm_main_flg", "set_itm_main_flg"),
				MCItemDef.create("set_itm_set_flg", "set_itm_set_flg"),
				MCItemDef.create("if_x_flg", "if_x_flg"),
				MCItemDef.create("ctg_config_flg", "ctg_config_flg"),
				MCItemDef.create("jnl_ptn_flg", "jnl_ptn_flg"),
				MCItemDef.create("coef_config_flg", "coef_config_flg"),
				MCItemDef.create("alc_expns_flg", "alc_expns_flg"),
				MCItemDef.create("alc_inpt_flg", "alc_inpt_flg"),
				MCItemDef.create("cost_itm_out_flg", "cost_itm_out_flg"),
				MCItemDef.create("xpns_purc_alc_flg", "xpns_purc_alc_flg"),
				MCItemDef.create("itm_lg_grp_flg", "itm_lg_grp_flg"),
				MCItemDef.create("itm_str_ln_flg", "itm_str_ln_flg")
			}
			,
			MCBlockDef.create("ItmCopy_Upd01_Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0870_ItmCopy_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0870", "ItmCopy_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ex_on_del_flg", "ex_on_del_flg"),
				MCItemDef.create("ex_past_end_dt", "ex_past_end_dt")
			}
			,
			MCBlockDef.create("ItmCopy_Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MA_MABCL0870_ItmCopy_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0870", "ItmCopy_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0870_ItmCopy_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0870", "ItmCopy_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_flg", "itm_flg"),
				MCItemDef.create("itm_sub_flg", "itm_sub_flg"),
				MCItemDef.create("itm_unit_flg", "itm_unit_flg"),
				MCItemDef.create("attach_info_flg", "attach_info_flg"),
				MCItemDef.create("itm_stop_flg", "itm_stop_flg"),
				MCItemDef.create("itm_not_fix_flg", "itm_not_fix_flg"),
				MCItemDef.create("stdcost_flg", "stdcost_flg"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_strg_flg", "itm_strg_flg"),
				MCItemDef.create("alloc_ctl_flg", "alloc_ctl_flg"),
				MCItemDef.create("stk_rpl_flg", "stk_rpl_flg"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("itm_wg_flg", "itm_wg_flg"),
				MCItemDef.create("itm_dtl_flg", "itm_dtl_flg"),
				MCItemDef.create("itm_oper_flg", "itm_oper_flg"),
				MCItemDef.create("bom_par_flg", "bom_par_flg"),
				MCItemDef.create("bom_chd_flg", "bom_chd_flg"),
				MCItemDef.create("oper_wk_cost_flg", "oper_wk_cost_flg"),
				MCItemDef.create("itm_insp_ptn_flg", "itm_insp_ptn_flg"),
				MCItemDef.create("itm_insp_flg", "itm_insp_flg"),
				MCItemDef.create("insp_spec_flg", "insp_spec_flg"),
				MCItemDef.create("itm_site_flg", "itm_site_flg"),
				MCItemDef.create("itm_ver_flg", "itm_ver_flg"),
				MCItemDef.create("lot_inh_dest_flg", "lot_inh_dest_flg"),
				MCItemDef.create("lot_inh_src_flg", "lot_inh_src_flg"),
				MCItemDef.create("itm_spec_flg", "itm_spec_flg"),
				MCItemDef.create("itm_spec_desc_flg", "itm_spec_desc_flg"),
				MCItemDef.create("itm_comp_core_flg", "itm_comp_core_flg"),
				MCItemDef.create("itm_comp_comp_flg", "itm_comp_comp_flg"),
				MCItemDef.create("mps_itm_flg", "mps_itm_flg"),
				MCItemDef.create("spln_itm_conf_flg", "spln_itm_conf_flg"),
				MCItemDef.create("purc_ddlv_lt_flg", "purc_ddlv_lt_flg"),
				MCItemDef.create("bp_itm_flg", "bp_itm_flg"),
				MCItemDef.create("proc_upri_flg", "proc_upri_flg"),
				MCItemDef.create("prov_upri_flg", "prov_upri_flg"),
				MCItemDef.create("purc_upri_flg", "purc_upri_flg"),
				MCItemDef.create("std_sls_upri_flg", "std_sls_upri_flg"),
				MCItemDef.create("itm_sls_upri_flg", "itm_sls_upri_flg"),
				MCItemDef.create("cst_sls_upri_flg", "cst_sls_upri_flg"),
				MCItemDef.create("set_itm_main_flg", "set_itm_main_flg"),
				MCItemDef.create("set_itm_set_flg", "set_itm_set_flg"),
				MCItemDef.create("if_x_flg", "if_x_flg"),
				MCItemDef.create("ctg_config_flg", "ctg_config_flg"),
				MCItemDef.create("jnl_ptn_flg", "jnl_ptn_flg"),
				MCItemDef.create("coef_config_flg", "coef_config_flg"),
				MCItemDef.create("alc_expns_flg", "alc_expns_flg"),
				MCItemDef.create("alc_inpt_flg", "alc_inpt_flg"),
				MCItemDef.create("cost_itm_out_flg", "cost_itm_out_flg"),
				MCItemDef.create("xpns_purc_alc_flg", "xpns_purc_alc_flg"),
				MCItemDef.create("itm_lg_grp_flg", "itm_lg_grp_flg"),
				MCItemDef.create("itm_str_ln_flg", "itm_str_ln_flg")
			}
			,
			MCBlockDef.create("ItmCopy_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0870_ItmCopy_Del01_INFO = new MCOperationInfo("MA", "MABCL0870", "ItmCopy_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0870_ItmCopy_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0870", "ItmCopy_Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_flg", "itm_flg"),
				MCItemDef.create("itm_sub_flg", "itm_sub_flg"),
				MCItemDef.create("itm_unit_flg", "itm_unit_flg"),
				MCItemDef.create("attach_info_flg", "attach_info_flg"),
				MCItemDef.create("itm_stop_flg", "itm_stop_flg"),
				MCItemDef.create("itm_not_fix_flg", "itm_not_fix_flg"),
				MCItemDef.create("stdcost_flg", "stdcost_flg"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_strg_flg", "itm_strg_flg"),
				MCItemDef.create("alloc_ctl_flg", "alloc_ctl_flg"),
				MCItemDef.create("stk_rpl_flg", "stk_rpl_flg"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("itm_wg_flg", "itm_wg_flg"),
				MCItemDef.create("itm_dtl_flg", "itm_dtl_flg"),
				MCItemDef.create("itm_oper_flg", "itm_oper_flg"),
				MCItemDef.create("bom_par_flg", "bom_par_flg"),
				MCItemDef.create("bom_chd_flg", "bom_chd_flg"),
				MCItemDef.create("oper_wk_cost_flg", "oper_wk_cost_flg"),
				MCItemDef.create("itm_insp_ptn_flg", "itm_insp_ptn_flg"),
				MCItemDef.create("itm_insp_flg", "itm_insp_flg"),
				MCItemDef.create("insp_spec_flg", "insp_spec_flg"),
				MCItemDef.create("itm_site_flg", "itm_site_flg"),
				MCItemDef.create("itm_ver_flg", "itm_ver_flg"),
				MCItemDef.create("lot_inh_dest_flg", "lot_inh_dest_flg"),
				MCItemDef.create("lot_inh_src_flg", "lot_inh_src_flg"),
				MCItemDef.create("itm_spec_flg", "itm_spec_flg"),
				MCItemDef.create("itm_spec_desc_flg", "itm_spec_desc_flg"),
				MCItemDef.create("itm_comp_core_flg", "itm_comp_core_flg"),
				MCItemDef.create("itm_comp_comp_flg", "itm_comp_comp_flg"),
				MCItemDef.create("mps_itm_flg", "mps_itm_flg"),
				MCItemDef.create("spln_itm_conf_flg", "spln_itm_conf_flg"),
				MCItemDef.create("purc_ddlv_lt_flg", "purc_ddlv_lt_flg"),
				MCItemDef.create("bp_itm_flg", "bp_itm_flg"),
				MCItemDef.create("proc_upri_flg", "proc_upri_flg"),
				MCItemDef.create("prov_upri_flg", "prov_upri_flg"),
				MCItemDef.create("purc_upri_flg", "purc_upri_flg"),
				MCItemDef.create("std_sls_upri_flg", "std_sls_upri_flg"),
				MCItemDef.create("itm_sls_upri_flg", "itm_sls_upri_flg"),
				MCItemDef.create("cst_sls_upri_flg", "cst_sls_upri_flg"),
				MCItemDef.create("set_itm_main_flg", "set_itm_main_flg"),
				MCItemDef.create("set_itm_set_flg", "set_itm_set_flg"),
				MCItemDef.create("if_x_flg", "if_x_flg"),
				MCItemDef.create("ctg_config_flg", "ctg_config_flg"),
				MCItemDef.create("jnl_ptn_flg", "jnl_ptn_flg"),
				MCItemDef.create("coef_config_flg", "coef_config_flg"),
				MCItemDef.create("alc_expns_flg", "alc_expns_flg"),
				MCItemDef.create("alc_inpt_flg", "alc_inpt_flg"),
				MCItemDef.create("cost_itm_out_flg", "cost_itm_out_flg"),
				MCItemDef.create("xpns_purc_alc_flg", "xpns_purc_alc_flg"),
				MCItemDef.create("itm_lg_grp_flg", "itm_lg_grp_flg"),
				MCItemDef.create("itm_str_ln_flg", "itm_str_ln_flg")
			}
			,
			MCBlockDef.create("ItmCopy_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0870_Srch01_INFO = new MCOperationInfo("MA", "MABCL0870", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0870_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0870", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("chng_no", "chng_no"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("release_flg_on", "release_flg_on"),
				MCItemDef.create("release_flg_off", "release_flg_off"),
				MCItemDef.create("memo1_c", "memo1_c"),
				MCItemDef.create("memo2_c", "memo2_c"),
				MCItemDef.create("memo3_c", "memo3_c"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ref_itm_cd", "ref_itm_cd"),
				MCItemDef.create("ref_itm_sub1", "ref_itm_sub1"),
				MCItemDef.create("ref_itm_sub2", "ref_itm_sub2"),
				MCItemDef.create("ref_itm_sub3", "ref_itm_sub3"),
				MCItemDef.create("ref_itm_nm", "ref_itm_nm"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0870_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0870", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("base_itm_nm", "base_itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("chng_no", "chng_no"),
				MCItemDef.create("itm_cnt", "itm_cnt"),
				MCItemDef.create("itm_sub_cnt", "itm_sub_cnt"),
				MCItemDef.create("itm_unit_cnt", "itm_unit_cnt"),
				MCItemDef.create("attach_info_cnt", "attach_info_cnt"),
				MCItemDef.create("itm_stop_cnt", "itm_stop_cnt"),
				MCItemDef.create("itm_not_fix_cnt", "itm_not_fix_cnt"),
				MCItemDef.create("stdcost_cnt", "stdcost_cnt"),
				MCItemDef.create("sundry_itm_cnt", "sundry_itm_cnt"),
				MCItemDef.create("itm_strg_cnt", "itm_strg_cnt"),
				MCItemDef.create("alloc_ctl_cnt", "alloc_ctl_cnt"),
				MCItemDef.create("stk_rpl_cnt", "stk_rpl_cnt"),
				MCItemDef.create("alt_itm_cnt", "alt_itm_cnt"),
				MCItemDef.create("itm_wg_cnt", "itm_wg_cnt"),
				MCItemDef.create("itm_dtl_cnt", "itm_dtl_cnt"),
				MCItemDef.create("itm_oper_cnt", "itm_oper_cnt"),
				MCItemDef.create("bom_par_cnt", "bom_par_cnt"),
				MCItemDef.create("bom_chd_cnt", "bom_chd_cnt"),
				MCItemDef.create("oper_wk_cost_cnt", "oper_wk_cost_cnt"),
				MCItemDef.create("itm_insp_ptn_cnt", "itm_insp_ptn_cnt"),
				MCItemDef.create("itm_insp_cnt", "itm_insp_cnt"),
				MCItemDef.create("insp_spec_cnt", "insp_spec_cnt"),
				MCItemDef.create("itm_site_cnt", "itm_site_cnt"),
				MCItemDef.create("itm_ver_cnt", "itm_ver_cnt"),
				MCItemDef.create("lot_inh_dest_cnt", "lot_inh_dest_cnt"),
				MCItemDef.create("lot_inh_src_cnt", "lot_inh_src_cnt"),
				MCItemDef.create("itm_spec_cnt", "itm_spec_cnt"),
				MCItemDef.create("itm_spec_desc_cnt", "itm_spec_desc_cnt"),
				MCItemDef.create("itm_comp_core_cnt", "itm_comp_core_cnt"),
				MCItemDef.create("itm_comp_comp_cnt", "itm_comp_comp_cnt"),
				MCItemDef.create("mps_itm_cnt", "mps_itm_cnt"),
				MCItemDef.create("spln_itm_conf_cnt", "spln_itm_conf_cnt"),
				MCItemDef.create("purc_ddlv_lt_cnt", "purc_ddlv_lt_cnt"),
				MCItemDef.create("bp_itm_cnt", "bp_itm_cnt"),
				MCItemDef.create("proc_upri_cnt", "proc_upri_cnt"),
				MCItemDef.create("prov_upri_cnt", "prov_upri_cnt"),
				MCItemDef.create("purc_upri_cnt", "purc_upri_cnt"),
				MCItemDef.create("std_sls_upri_cnt", "std_sls_upri_cnt"),
				MCItemDef.create("itm_sls_upri_cnt", "itm_sls_upri_cnt"),
				MCItemDef.create("cst_sls_upri_cnt", "cst_sls_upri_cnt"),
				MCItemDef.create("set_itm_main_cnt", "set_itm_main_cnt"),
				MCItemDef.create("set_itm_set_cnt", "set_itm_set_cnt"),
				MCItemDef.create("if_x_cnt", "if_x_cnt"),
				MCItemDef.create("ctg_config_cnt", "ctg_config_cnt"),
				MCItemDef.create("jnl_ptn_cnt", "jnl_ptn_cnt"),
				MCItemDef.create("coef_config_cnt", "coef_config_cnt"),
				MCItemDef.create("alc_expns_cnt", "alc_expns_cnt"),
				MCItemDef.create("alc_inpt_cnt", "alc_inpt_cnt"),
				MCItemDef.create("cost_itm_out_cnt", "cost_itm_out_cnt"),
				MCItemDef.create("xpns_purc_alc_cnt", "xpns_purc_alc_cnt"),
				MCItemDef.create("itm_lg_grp_cnt", "itm_lg_grp_cnt"),
				MCItemDef.create("itm_str_ln_cnt", "itm_str_ln_cnt"),
				MCItemDef.create("itm_flg", "itm_flg"),
				MCItemDef.create("itm_sub_flg", "itm_sub_flg"),
				MCItemDef.create("itm_unit_flg", "itm_unit_flg"),
				MCItemDef.create("attach_info_flg", "attach_info_flg"),
				MCItemDef.create("itm_stop_flg", "itm_stop_flg"),
				MCItemDef.create("itm_not_fix_flg", "itm_not_fix_flg"),
				MCItemDef.create("stdcost_flg", "stdcost_flg"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_strg_flg", "itm_strg_flg"),
				MCItemDef.create("alloc_ctl_flg", "alloc_ctl_flg"),
				MCItemDef.create("stk_rpl_flg", "stk_rpl_flg"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("itm_wg_flg", "itm_wg_flg"),
				MCItemDef.create("itm_dtl_flg", "itm_dtl_flg"),
				MCItemDef.create("itm_oper_flg", "itm_oper_flg"),
				MCItemDef.create("bom_par_flg", "bom_par_flg"),
				MCItemDef.create("bom_chd_flg", "bom_chd_flg"),
				MCItemDef.create("oper_wk_cost_flg", "oper_wk_cost_flg"),
				MCItemDef.create("itm_insp_ptn_flg", "itm_insp_ptn_flg"),
				MCItemDef.create("itm_insp_flg", "itm_insp_flg"),
				MCItemDef.create("insp_spec_flg", "insp_spec_flg"),
				MCItemDef.create("itm_site_flg", "itm_site_flg"),
				MCItemDef.create("itm_ver_flg", "itm_ver_flg"),
				MCItemDef.create("lot_inh_dest_flg", "lot_inh_dest_flg"),
				MCItemDef.create("lot_inh_src_flg", "lot_inh_src_flg"),
				MCItemDef.create("itm_spec_flg", "itm_spec_flg"),
				MCItemDef.create("itm_spec_desc_flg", "itm_spec_desc_flg"),
				MCItemDef.create("itm_comp_core_flg", "itm_comp_core_flg"),
				MCItemDef.create("itm_comp_comp_flg", "itm_comp_comp_flg"),
				MCItemDef.create("mps_itm_flg", "mps_itm_flg"),
				MCItemDef.create("spln_itm_conf_flg", "spln_itm_conf_flg"),
				MCItemDef.create("purc_ddlv_lt_flg", "purc_ddlv_lt_flg"),
				MCItemDef.create("bp_itm_flg", "bp_itm_flg"),
				MCItemDef.create("proc_upri_flg", "proc_upri_flg"),
				MCItemDef.create("prov_upri_flg", "prov_upri_flg"),
				MCItemDef.create("purc_upri_flg", "purc_upri_flg"),
				MCItemDef.create("std_sls_upri_flg", "std_sls_upri_flg"),
				MCItemDef.create("itm_sls_upri_flg", "itm_sls_upri_flg"),
				MCItemDef.create("cst_sls_upri_flg", "cst_sls_upri_flg"),
				MCItemDef.create("set_itm_main_flg", "set_itm_main_flg"),
				MCItemDef.create("set_itm_set_flg", "set_itm_set_flg"),
				MCItemDef.create("if_x_flg", "if_x_flg"),
				MCItemDef.create("ctg_config_flg", "ctg_config_flg"),
				MCItemDef.create("jnl_ptn_flg", "jnl_ptn_flg"),
				MCItemDef.create("coef_config_flg", "coef_config_flg"),
				MCItemDef.create("alc_expns_flg", "alc_expns_flg"),
				MCItemDef.create("alc_inpt_flg", "alc_inpt_flg"),
				MCItemDef.create("cost_itm_out_flg", "cost_itm_out_flg"),
				MCItemDef.create("xpns_purc_alc_flg", "xpns_purc_alc_flg"),
				MCItemDef.create("itm_lg_grp_flg", "itm_lg_grp_flg"),
				MCItemDef.create("itm_str_ln_flg", "itm_str_ln_flg")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MABCL0870_Srch02_INFO = new MCOperationInfo("MA", "MABCL0870", "Srch02", "000000", new PDef());

	public static MCContainerDef MA_MABCL0870_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0870", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("chng_no", "chng_no"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("release_flg_on", "release_flg_on"),
				MCItemDef.create("release_flg_off", "release_flg_off"),
				MCItemDef.create("memo1_c", "memo1_c"),
				MCItemDef.create("memo2_c", "memo2_c"),
				MCItemDef.create("memo3_c", "memo3_c"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ref_itm_cd", "ref_itm_cd"),
				MCItemDef.create("ref_itm_sub1", "ref_itm_sub1"),
				MCItemDef.create("ref_itm_sub2", "ref_itm_sub2"),
				MCItemDef.create("ref_itm_sub3", "ref_itm_sub3"),
				MCItemDef.create("ref_itm_nm", "ref_itm_nm"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0870_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0870", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ref_del_flg", "ref_del_flg"),
				MCItemDef.create("ref_itm_cd", "ref_itm_cd"),
				MCItemDef.create("ref_itm_sub1", "ref_itm_sub1"),
				MCItemDef.create("ref_itm_sub2", "ref_itm_sub2"),
				MCItemDef.create("ref_itm_sub3", "ref_itm_sub3"),
				MCItemDef.create("ref_itm_nm", "ref_itm_nm"),
				MCItemDef.create("ref_base_itm_nm", "ref_base_itm_nm"),
				MCItemDef.create("ref_itm_typ", "ref_itm_typ"),
				MCItemDef.create("ref_itm_typ_nm", "ref_itm_typ_nm"),
				MCItemDef.create("ref_itm_typ_d_cd", "ref_itm_typ_d_cd"),
				MCItemDef.create("ref_itm_typ_d_nm", "ref_itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("chng_no", "chng_no"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("itm_cnt", "itm_cnt"),
				MCItemDef.create("itm_sub_cnt", "itm_sub_cnt"),
				MCItemDef.create("itm_unit_cnt", "itm_unit_cnt"),
				MCItemDef.create("attach_info_cnt", "attach_info_cnt"),
				MCItemDef.create("itm_stop_cnt", "itm_stop_cnt"),
				MCItemDef.create("itm_not_fix_cnt", "itm_not_fix_cnt"),
				MCItemDef.create("stdcost_cnt", "stdcost_cnt"),
				MCItemDef.create("sundry_itm_cnt", "sundry_itm_cnt"),
				MCItemDef.create("itm_strg_cnt", "itm_strg_cnt"),
				MCItemDef.create("alloc_ctl_cnt", "alloc_ctl_cnt"),
				MCItemDef.create("stk_rpl_cnt", "stk_rpl_cnt"),
				MCItemDef.create("alt_itm_cnt", "alt_itm_cnt"),
				MCItemDef.create("itm_wg_cnt", "itm_wg_cnt"),
				MCItemDef.create("itm_dtl_cnt", "itm_dtl_cnt"),
				MCItemDef.create("itm_oper_cnt", "itm_oper_cnt"),
				MCItemDef.create("bom_par_cnt", "bom_par_cnt"),
				MCItemDef.create("bom_chd_cnt", "bom_chd_cnt"),
				MCItemDef.create("oper_wk_cost_cnt", "oper_wk_cost_cnt"),
				MCItemDef.create("itm_insp_ptn_cnt", "itm_insp_ptn_cnt"),
				MCItemDef.create("itm_insp_cnt", "itm_insp_cnt"),
				MCItemDef.create("insp_spec_cnt", "insp_spec_cnt"),
				MCItemDef.create("itm_site_cnt", "itm_site_cnt"),
				MCItemDef.create("itm_ver_cnt", "itm_ver_cnt"),
				MCItemDef.create("lot_inh_dest_cnt", "lot_inh_dest_cnt"),
				MCItemDef.create("lot_inh_src_cnt", "lot_inh_src_cnt"),
				MCItemDef.create("itm_spec_cnt", "itm_spec_cnt"),
				MCItemDef.create("itm_spec_desc_cnt", "itm_spec_desc_cnt"),
				MCItemDef.create("itm_comp_core_cnt", "itm_comp_core_cnt"),
				MCItemDef.create("itm_comp_comp_cnt", "itm_comp_comp_cnt"),
				MCItemDef.create("mps_itm_cnt", "mps_itm_cnt"),
				MCItemDef.create("spln_itm_conf_cnt", "spln_itm_conf_cnt"),
				MCItemDef.create("purc_ddlv_lt_cnt", "purc_ddlv_lt_cnt"),
				MCItemDef.create("bp_itm_cnt", "bp_itm_cnt"),
				MCItemDef.create("proc_upri_cnt", "proc_upri_cnt"),
				MCItemDef.create("prov_upri_cnt", "prov_upri_cnt"),
				MCItemDef.create("purc_upri_cnt", "purc_upri_cnt"),
				MCItemDef.create("std_sls_upri_cnt", "std_sls_upri_cnt"),
				MCItemDef.create("itm_sls_upri_cnt", "itm_sls_upri_cnt"),
				MCItemDef.create("cst_sls_upri_cnt", "cst_sls_upri_cnt"),
				MCItemDef.create("set_itm_main_cnt", "set_itm_main_cnt"),
				MCItemDef.create("set_itm_set_cnt", "set_itm_set_cnt"),
				MCItemDef.create("if_x_cnt", "if_x_cnt"),
				MCItemDef.create("ctg_config_cnt", "ctg_config_cnt"),
				MCItemDef.create("jnl_ptn_cnt", "jnl_ptn_cnt"),
				MCItemDef.create("coef_config_cnt", "coef_config_cnt"),
				MCItemDef.create("alc_expns_cnt", "alc_expns_cnt"),
				MCItemDef.create("alc_inpt_cnt", "alc_inpt_cnt"),
				MCItemDef.create("cost_itm_out_cnt", "cost_itm_out_cnt"),
				MCItemDef.create("xpns_purc_alc_cnt", "xpns_purc_alc_cnt"),
				MCItemDef.create("itm_lg_grp_cnt", "itm_lg_grp_cnt"),
				MCItemDef.create("itm_str_ln_cnt", "itm_str_ln_cnt"),
				MCItemDef.create("itm_flg", "itm_flg"),
				MCItemDef.create("itm_sub_flg", "itm_sub_flg"),
				MCItemDef.create("itm_unit_flg", "itm_unit_flg"),
				MCItemDef.create("attach_info_flg", "attach_info_flg"),
				MCItemDef.create("itm_stop_flg", "itm_stop_flg"),
				MCItemDef.create("itm_not_fix_flg", "itm_not_fix_flg"),
				MCItemDef.create("stdcost_flg", "stdcost_flg"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_strg_flg", "itm_strg_flg"),
				MCItemDef.create("alloc_ctl_flg", "alloc_ctl_flg"),
				MCItemDef.create("stk_rpl_flg", "stk_rpl_flg"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("itm_wg_flg", "itm_wg_flg"),
				MCItemDef.create("itm_dtl_flg", "itm_dtl_flg"),
				MCItemDef.create("itm_oper_flg", "itm_oper_flg"),
				MCItemDef.create("bom_par_flg", "bom_par_flg"),
				MCItemDef.create("bom_chd_flg", "bom_chd_flg"),
				MCItemDef.create("oper_wk_cost_flg", "oper_wk_cost_flg"),
				MCItemDef.create("itm_insp_ptn_flg", "itm_insp_ptn_flg"),
				MCItemDef.create("itm_insp_flg", "itm_insp_flg"),
				MCItemDef.create("insp_spec_flg", "insp_spec_flg"),
				MCItemDef.create("itm_site_flg", "itm_site_flg"),
				MCItemDef.create("itm_ver_flg", "itm_ver_flg"),
				MCItemDef.create("lot_inh_dest_flg", "lot_inh_dest_flg"),
				MCItemDef.create("lot_inh_src_flg", "lot_inh_src_flg"),
				MCItemDef.create("itm_spec_flg", "itm_spec_flg"),
				MCItemDef.create("itm_spec_desc_flg", "itm_spec_desc_flg"),
				MCItemDef.create("itm_comp_core_flg", "itm_comp_core_flg"),
				MCItemDef.create("itm_comp_comp_flg", "itm_comp_comp_flg"),
				MCItemDef.create("mps_itm_flg", "mps_itm_flg"),
				MCItemDef.create("spln_itm_conf_flg", "spln_itm_conf_flg"),
				MCItemDef.create("purc_ddlv_lt_flg", "purc_ddlv_lt_flg"),
				MCItemDef.create("bp_itm_flg", "bp_itm_flg"),
				MCItemDef.create("proc_upri_flg", "proc_upri_flg"),
				MCItemDef.create("prov_upri_flg", "prov_upri_flg"),
				MCItemDef.create("purc_upri_flg", "purc_upri_flg"),
				MCItemDef.create("std_sls_upri_flg", "std_sls_upri_flg"),
				MCItemDef.create("itm_sls_upri_flg", "itm_sls_upri_flg"),
				MCItemDef.create("cst_sls_upri_flg", "cst_sls_upri_flg"),
				MCItemDef.create("set_itm_main_flg", "set_itm_main_flg"),
				MCItemDef.create("set_itm_set_flg", "set_itm_set_flg"),
				MCItemDef.create("if_x_flg", "if_x_flg"),
				MCItemDef.create("ctg_config_flg", "ctg_config_flg"),
				MCItemDef.create("jnl_ptn_flg", "jnl_ptn_flg"),
				MCItemDef.create("coef_config_flg", "coef_config_flg"),
				MCItemDef.create("alc_expns_flg", "alc_expns_flg"),
				MCItemDef.create("alc_inpt_flg", "alc_inpt_flg"),
				MCItemDef.create("cost_itm_out_flg", "cost_itm_out_flg"),
				MCItemDef.create("xpns_purc_alc_flg", "xpns_purc_alc_flg"),
				MCItemDef.create("itm_lg_grp_flg", "itm_lg_grp_flg"),
				MCItemDef.create("itm_str_ln_flg", "itm_str_ln_flg")
			}
			,
			MCBlockDef.create("Srch02_Rslt")
		);
	}
	
	static final MCOperationInfo MA_MABCL0870_Upd01_INFO = new MCOperationInfo("MA", "MABCL0870", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0870_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0870", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("dest_itm_cd", "dest_itm_cd"),
				MCItemDef.create("dest_itm_sub1", "dest_itm_sub1"),
				MCItemDef.create("dest_itm_sub2", "dest_itm_sub2"),
				MCItemDef.create("dest_itm_sub3", "dest_itm_sub3"),
				MCItemDef.create("dest_itm_nm", "dest_itm_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("itm_flg", "itm_flg"),
				MCItemDef.create("itm_sub_flg", "itm_sub_flg"),
				MCItemDef.create("itm_unit_flg", "itm_unit_flg"),
				MCItemDef.create("attach_info_flg", "attach_info_flg"),
				MCItemDef.create("itm_stop_flg", "itm_stop_flg"),
				MCItemDef.create("itm_not_fix_flg", "itm_not_fix_flg"),
				MCItemDef.create("stdcost_flg", "stdcost_flg"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_strg_flg", "itm_strg_flg"),
				MCItemDef.create("alloc_ctl_flg", "alloc_ctl_flg"),
				MCItemDef.create("stk_rpl_flg", "stk_rpl_flg"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("itm_wg_flg", "itm_wg_flg"),
				MCItemDef.create("itm_dtl_flg", "itm_dtl_flg"),
				MCItemDef.create("itm_oper_flg", "itm_oper_flg"),
				MCItemDef.create("bom_par_flg", "bom_par_flg"),
				MCItemDef.create("bom_chd_flg", "bom_chd_flg"),
				MCItemDef.create("oper_wk_cost_flg", "oper_wk_cost_flg"),
				MCItemDef.create("itm_insp_ptn_flg", "itm_insp_ptn_flg"),
				MCItemDef.create("itm_insp_flg", "itm_insp_flg"),
				MCItemDef.create("insp_spec_flg", "insp_spec_flg"),
				MCItemDef.create("itm_site_flg", "itm_site_flg"),
				MCItemDef.create("itm_ver_flg", "itm_ver_flg"),
				MCItemDef.create("lot_inh_dest_flg", "lot_inh_dest_flg"),
				MCItemDef.create("lot_inh_src_flg", "lot_inh_src_flg"),
				MCItemDef.create("itm_spec_flg", "itm_spec_flg"),
				MCItemDef.create("itm_spec_desc_flg", "itm_spec_desc_flg"),
				MCItemDef.create("itm_comp_core_flg", "itm_comp_core_flg"),
				MCItemDef.create("itm_comp_comp_flg", "itm_comp_comp_flg"),
				MCItemDef.create("mps_itm_flg", "mps_itm_flg"),
				MCItemDef.create("spln_itm_conf_flg", "spln_itm_conf_flg"),
				MCItemDef.create("purc_ddlv_lt_flg", "purc_ddlv_lt_flg"),
				MCItemDef.create("bp_itm_flg", "bp_itm_flg"),
				MCItemDef.create("proc_upri_flg", "proc_upri_flg"),
				MCItemDef.create("prov_upri_flg", "prov_upri_flg"),
				MCItemDef.create("purc_upri_flg", "purc_upri_flg"),
				MCItemDef.create("std_sls_upri_flg", "std_sls_upri_flg"),
				MCItemDef.create("itm_sls_upri_flg", "itm_sls_upri_flg"),
				MCItemDef.create("cst_sls_upri_flg", "cst_sls_upri_flg"),
				MCItemDef.create("set_itm_main_flg", "set_itm_main_flg"),
				MCItemDef.create("set_itm_set_flg", "set_itm_set_flg"),
				MCItemDef.create("if_x_flg", "if_x_flg"),
				MCItemDef.create("ctg_config_flg", "ctg_config_flg"),
				MCItemDef.create("jnl_ptn_flg", "jnl_ptn_flg"),
				MCItemDef.create("coef_config_flg", "coef_config_flg"),
				MCItemDef.create("alc_expns_flg", "alc_expns_flg"),
				MCItemDef.create("alc_inpt_flg", "alc_inpt_flg"),
				MCItemDef.create("cost_itm_out_flg", "cost_itm_out_flg"),
				MCItemDef.create("xpns_purc_alc_flg", "xpns_purc_alc_flg"),
				MCItemDef.create("itm_lg_grp_flg", "itm_lg_grp_flg"),
				MCItemDef.create("itm_str_ln_flg", "itm_str_ln_flg")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0870_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0870", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ex_on_del_flg", "ex_on_del_flg"),
				MCItemDef.create("ex_past_end_dt", "ex_past_end_dt")
			}
			,
			MCBlockDef.create("Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MA_MABCL0870_Del01_INFO = new MCOperationInfo("MA", "MABCL0870", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0870_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0870", "Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_flg", "itm_flg"),
				MCItemDef.create("itm_sub_flg", "itm_sub_flg"),
				MCItemDef.create("itm_unit_flg", "itm_unit_flg"),
				MCItemDef.create("attach_info_flg", "attach_info_flg"),
				MCItemDef.create("itm_stop_flg", "itm_stop_flg"),
				MCItemDef.create("itm_not_fix_flg", "itm_not_fix_flg"),
				MCItemDef.create("stdcost_flg", "stdcost_flg"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_strg_flg", "itm_strg_flg"),
				MCItemDef.create("alloc_ctl_flg", "alloc_ctl_flg"),
				MCItemDef.create("stk_rpl_flg", "stk_rpl_flg"),
				MCItemDef.create("alt_itm_flg", "alt_itm_flg"),
				MCItemDef.create("itm_wg_flg", "itm_wg_flg"),
				MCItemDef.create("itm_dtl_flg", "itm_dtl_flg"),
				MCItemDef.create("itm_oper_flg", "itm_oper_flg"),
				MCItemDef.create("bom_par_flg", "bom_par_flg"),
				MCItemDef.create("bom_chd_flg", "bom_chd_flg"),
				MCItemDef.create("oper_wk_cost_flg", "oper_wk_cost_flg"),
				MCItemDef.create("itm_insp_ptn_flg", "itm_insp_ptn_flg"),
				MCItemDef.create("itm_insp_flg", "itm_insp_flg"),
				MCItemDef.create("insp_spec_flg", "insp_spec_flg"),
				MCItemDef.create("itm_site_flg", "itm_site_flg"),
				MCItemDef.create("itm_ver_flg", "itm_ver_flg"),
				MCItemDef.create("lot_inh_dest_flg", "lot_inh_dest_flg"),
				MCItemDef.create("lot_inh_src_flg", "lot_inh_src_flg"),
				MCItemDef.create("itm_spec_flg", "itm_spec_flg"),
				MCItemDef.create("itm_spec_desc_flg", "itm_spec_desc_flg"),
				MCItemDef.create("itm_comp_core_flg", "itm_comp_core_flg"),
				MCItemDef.create("itm_comp_comp_flg", "itm_comp_comp_flg"),
				MCItemDef.create("mps_itm_flg", "mps_itm_flg"),
				MCItemDef.create("spln_itm_conf_flg", "spln_itm_conf_flg"),
				MCItemDef.create("purc_ddlv_lt_flg", "purc_ddlv_lt_flg"),
				MCItemDef.create("bp_itm_flg", "bp_itm_flg"),
				MCItemDef.create("proc_upri_flg", "proc_upri_flg"),
				MCItemDef.create("prov_upri_flg", "prov_upri_flg"),
				MCItemDef.create("purc_upri_flg", "purc_upri_flg"),
				MCItemDef.create("std_sls_upri_flg", "std_sls_upri_flg"),
				MCItemDef.create("itm_sls_upri_flg", "itm_sls_upri_flg"),
				MCItemDef.create("cst_sls_upri_flg", "cst_sls_upri_flg"),
				MCItemDef.create("set_itm_main_flg", "set_itm_main_flg"),
				MCItemDef.create("set_itm_set_flg", "set_itm_set_flg"),
				MCItemDef.create("if_x_flg", "if_x_flg"),
				MCItemDef.create("ctg_config_flg", "ctg_config_flg"),
				MCItemDef.create("jnl_ptn_flg", "jnl_ptn_flg"),
				MCItemDef.create("coef_config_flg", "coef_config_flg"),
				MCItemDef.create("alc_expns_flg", "alc_expns_flg"),
				MCItemDef.create("alc_inpt_flg", "alc_inpt_flg"),
				MCItemDef.create("cost_itm_out_flg", "cost_itm_out_flg"),
				MCItemDef.create("xpns_purc_alc_flg", "xpns_purc_alc_flg"),
				MCItemDef.create("itm_lg_grp_flg", "itm_lg_grp_flg"),
				MCItemDef.create("itm_str_ln_flg", "itm_str_ln_flg")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

