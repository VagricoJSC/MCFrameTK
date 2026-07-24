package mcframe.serverMSBE.MSBEL2240;

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
 * [MSBEL_RcptIvDSel]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL2240.Srch01.UP.BLOCK0")){
			return MS_MSBEL2240_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL2240.Srch01.UP.BLOCK1")){
			return MS_MSBEL2240_Srch01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL2240.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL2240_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBEL2240_Srch01_INFO = new MCOperationInfo("MS", "MSBEL2240", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL2240_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcpt_iv_src_typ", "rcpt_iv_src_typ"),
				MCItemDef.create("in_to_id_typ", "in_to_id_typ"),
				MCItemDef.create("in_to_id_cd", "in_to_id_cd"),
				MCItemDef.create("in_to_id_nm", "in_to_id_nm"),
				MCItemDef.create("in_to_zip_cd", "in_to_zip_cd"),
				MCItemDef.create("in_to_addr1", "in_to_addr1"),
				MCItemDef.create("in_to_addr2", "in_to_addr2"),
				MCItemDef.create("in_to_addr3", "in_to_addr3"),
				MCItemDef.create("in_to_addr4", "in_to_addr4"),
				MCItemDef.create("in_to_tel", "in_to_tel"),
				MCItemDef.create("in_to_fax", "in_to_fax"),
				MCItemDef.create("in_to_cntct_dpt", "in_to_cntct_dpt"),
				MCItemDef.create("in_to_cntct_psn", "in_to_cntct_psn"),
				MCItemDef.create("in_to_cntry_cd", "in_to_cntry_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("slo_cur_cd", "slo_cur_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("slo_trd_ptn_typ", "slo_trd_ptn_typ"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("slo_tterm_cd1", "slo_tterm_cd1"),
				MCItemDef.create("slo_tterm_cd2", "slo_tterm_cd2"),
				MCItemDef.create("slo_tterm_cd3", "slo_tterm_cd3"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("has_arr_basis_flg", "has_arr_basis_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBEL2240_Srch01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL2240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_act_no", "arr_act_no")
			}
			,
			MCBlockDef.create("Srch01_Cnd2")
		);
	}


	public static MCContainerDef MS_MSBEL2240_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL2240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("pr_sts_typ_nm", "pr_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("arr_act_no", "arr_act_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("non_purc_flg", "non_purc_flg"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("arr_schd_hm", "arr_schd_hm"),
				MCItemDef.create("arr_dt", "arr_dt"),
				MCItemDef.create("arr_hm", "arr_hm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("exim_xpns_typ", "exim_xpns_typ"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_amt_dec_place", "trd_amt_dec_place"),
				MCItemDef.create("trd_upri_dec_place", "trd_upri_dec_place"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_inc_ctax_amt", "base_cur_inc_ctax_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_amt_dec_place", "base_amt_dec_place"),
				MCItemDef.create("base_upri_dec_place", "base_upri_dec_place"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_proc_upri", "ptax_cur_proc_upri"),
				MCItemDef.create("ptax_cur_onr_prov_upri", "ptax_cur_onr_prov_upri"),
				MCItemDef.create("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_inc_ctax_amt", "ptax_cur_inc_ctax_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_amt_dec_place", "ptax_amt_dec_place"),
				MCItemDef.create("ptax_upri_dec_place", "ptax_upri_dec_place"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_id_typ_nm", "purc_id_typ_nm"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("purc_rsn_nm", "purc_rsn_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_itm_nm", "bd_itm_nm"),
				MCItemDef.create("bd_lot_mng_typ", "bd_lot_mng_typ"),
				MCItemDef.create("bd_sublot_mng_typ", "bd_sublot_mng_typ"),
				MCItemDef.create("bd_lot_no_typ", "bd_lot_no_typ"),
				MCItemDef.create("bd_sublot_no_typ", "bd_sublot_no_typ"),
				MCItemDef.create("bd_sno1_mng_typ", "bd_sno1_mng_typ"),
				MCItemDef.create("bd_sno2_mng_typ", "bd_sno2_mng_typ"),
				MCItemDef.create("bd_sno3_mng_typ", "bd_sno3_mng_typ"),
				MCItemDef.create("bd_sno4_mng_typ", "bd_sno4_mng_typ"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_loc_nm", "bd_loc_nm"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_ctg_nm", "bd_ctg_nm"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_oper_nm", "bd_oper_nm"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("trnspt_nm", "trnspt_nm"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("load_port_nm", "load_port_nm"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("dschrg_port_nm", "dschrg_port_nm"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_port_nm", "via_port_nm"),
				MCItemDef.create("via_schd_dt", "via_schd_dt"),
				MCItemDef.create("purc_tterm_cd1", "purc_tterm_cd1"),
				MCItemDef.create("purc_tterm_nm1", "purc_tterm_nm1"),
				MCItemDef.create("purc_tterm_rmrks1", "purc_tterm_rmrks1"),
				MCItemDef.create("purc_tterm_cd2", "purc_tterm_cd2"),
				MCItemDef.create("purc_tterm_nm2", "purc_tterm_nm2"),
				MCItemDef.create("purc_tterm_rmrks2", "purc_tterm_rmrks2"),
				MCItemDef.create("purc_tterm_cd3", "purc_tterm_cd3"),
				MCItemDef.create("purc_tterm_nm3", "purc_tterm_nm3"),
				MCItemDef.create("purc_tterm_rmrks3", "purc_tterm_rmrks3"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("slo_xrate", "slo_xrate"),
				MCItemDef.create("slo_ptax_xrate", "slo_ptax_xrate"),
				MCItemDef.create("slo_tterm_rmrks1", "slo_tterm_rmrks1"),
				MCItemDef.create("slo_tterm_rmrks2", "slo_tterm_rmrks2"),
				MCItemDef.create("slo_tterm_rmrks3", "slo_tterm_rmrks3"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("purc_basis_typ_nm", "purc_basis_typ_nm"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("arr_schd_qty", "arr_schd_qty"),
				MCItemDef.create("arr_act_qty", "arr_act_qty"),
				MCItemDef.create("arr_loc_wg_cd", "arr_loc_wg_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("po_trd_cur_dscnt_amt", "po_trd_cur_dscnt_amt"),
				MCItemDef.create("po_base_unit_qty", "po_base_unit_qty"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

