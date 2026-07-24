package mcframe.clientMSBE.MSBEP1730;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_IvReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1730.Srch01.UP.BLOCK0")){
			return MS_MSBEL1730_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1730.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1730_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1730.Srch01.DOWN.BLOCK1")){
			return MS_MSBEL1730_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1730.Srch01.DOWN.BLOCK2")){
			return MS_MSBEL1730_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1730.Srch01.DOWN.BLOCK3")){
			return MS_MSBEL1730_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBEL1730.Srch01.DOWN.BLOCK4")){
			return MS_MSBEL1730_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBEL1730.Srch02.UP.BLOCK0")){
			return MS_MSBEL1730_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1730.Srch02.UP.BLOCK1")){
			return MS_MSBEL1730_Srch02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1730.Srch02.DOWN.BLOCK0")){
			return MS_MSBEL1730_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1730.Srch02.DOWN.BLOCK1")){
			return MS_MSBEL1730_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1730.Srch02.DOWN.BLOCK2")){
			return MS_MSBEL1730_Srch02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1730.Srch02.DOWN.BLOCK3")){
			return MS_MSBEL1730_Srch02_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBEL1730.Srch04.UP.BLOCK0")){
			return MS_MSBEL1730_Srch04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1730.Srch04.DOWN.BLOCK0")){
			return MS_MSBEL1730_Srch04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1730.Srch04.DOWN.BLOCK1")){
			return MS_MSBEL1730_Srch04_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1730.Srch04.DOWN.BLOCK2")){
			return MS_MSBEL1730_Srch04_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1730.Srch04.DOWN.BLOCK3")){
			return MS_MSBEL1730_Srch04_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBEL1730.Srch04.DOWN.BLOCK4")){
			return MS_MSBEL1730_Srch04_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBEL1730.Ins01.UP.BLOCK0")){
			return MS_MSBEL1730_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1730.Ins01.UP.BLOCK1")){
			return MS_MSBEL1730_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1730.Ins01.UP.BLOCK2")){
			return MS_MSBEL1730_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1730.Ins01.UP.BLOCK3")){
			return MS_MSBEL1730_Ins01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL1730.Ins01.UP.BLOCK4")){
			return MS_MSBEL1730_Ins01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBEL1730.Ins01.DOWN.BLOCK0")){
			return MS_MSBEL1730_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1730.Ins01.DOWN.BLOCK1")){
			return MS_MSBEL1730_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1730.Upd01.UP.BLOCK0")){
			return MS_MSBEL1730_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1730.Upd01.UP.BLOCK1")){
			return MS_MSBEL1730_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1730.Upd01.UP.BLOCK2")){
			return MS_MSBEL1730_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1730.Upd01.UP.BLOCK3")){
			return MS_MSBEL1730_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL1730.Upd01.UP.BLOCK4")){
			return MS_MSBEL1730_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBEL1730.Upd01.DOWN.BLOCK0")){
			return MS_MSBEL1730_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1730.Upd01.DOWN.BLOCK1")){
			return MS_MSBEL1730_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1730.Del01.UP.BLOCK0")){
			return MS_MSBEL1730_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1730.Del01.UP.BLOCK1")){
			return MS_MSBEL1730_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1730.Del01.UP.BLOCK2")){
			return MS_MSBEL1730_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL1730.Prnt01.UP.BLOCK0")){
			return MS_MSBEL1730_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1730.Sprt01.UP.BLOCK0")){
			return MS_MSBEL1730_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1730.Sprt01.DOWN.BLOCK0")){
			return MS_MSBEL1730_Sprt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBEL1730_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1730", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1730_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("srch_tgt_typ", "srch_tgt_typ"),
				MCItemDef.create("srch_tgt_no", "srch_tgt_no"),
				MCItemDef.create("srch_tgt_rev", "srch_tgt_rev"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("ref_ope_flg", "ref_ope_flg"),
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1730_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("is_slo_iv_no", "is_slo_iv_no"),
				MCItemDef.create("iv_rev", "iv_rev"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("iv_src_typ", "iv_src_typ"),
				MCItemDef.create("iv_src_typ_nm", "iv_src_typ_nm"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pl_skip_flg", "pl_skip_flg"),
				MCItemDef.create("pl_reg_flg", "pl_reg_flg"),
				MCItemDef.create("cmpl_schd_dt", "cmpl_schd_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("cmpl_dt", "cmpl_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("iv_dt", "iv_dt"),
				MCItemDef.create("non_cmpl_flg", "non_cmpl_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("old_iv_ship_flg", "old_iv_ship_flg"),
				MCItemDef.create("iv_ship_flg", "iv_ship_flg"),
				MCItemDef.create("iv_prnt_flg", "iv_prnt_flg"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
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
				MCItemDef.create("ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("ship_rqst_id_typ_nm", "ship_rqst_id_typ_nm"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("ship_rqst_id_nm", "ship_rqst_id_nm"),
				MCItemDef.create("sls_upri_cng_flg", "sls_upri_cng_flg"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("via_dlv_typ_nm", "via_dlv_typ_nm"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("trnspt_nm", "trnspt_nm"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("load_port_nm", "load_port_nm"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("tdlv_addr_p" + ".cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_addr_p" + ".cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_addr_p" + ".zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr_p" + ".addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr_p" + ".addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr_p" + ".addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr_p" + ".addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_addr_p" + ".tel", "tdlv_tel"),
				MCItemDef.create("tdlv_addr_p" + ".fax", "tdlv_fax"),
				MCItemDef.create("tdlv_addr_p" + ".lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("sls_cmpl_flg", "sls_cmpl_flg"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("dschrg_port_nm", "dschrg_port_nm"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_port_nm", "via_port_nm"),
				MCItemDef.create("via_schd_dt", "via_schd_dt"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_amt_rnd_typ", "trd_amt_rnd_typ"),
				MCItemDef.create("trd_tax_rnd_typ", "trd_tax_rnd_typ"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("lc_no", "lc_no"),
				MCItemDef.create("lc_dt", "lc_dt"),
				MCItemDef.create("lc_rmrks", "lc_rmrks"),
				MCItemDef.create("bl_no", "bl_no"),
				MCItemDef.create("bl_dt", "bl_dt"),
				MCItemDef.create("bl_rmrks", "bl_rmrks"),
				MCItemDef.create("iv_rmrks", "iv_rmrks"),
				MCItemDef.create("case_mrk1", "case_mrk1"),
				MCItemDef.create("case_mrk2", "case_mrk2"),
				MCItemDef.create("case_mrk3", "case_mrk3"),
				MCItemDef.create("case_mrk4", "case_mrk4"),
				MCItemDef.create("case_mrk5", "case_mrk5"),
				MCItemDef.create("case_mrk6", "case_mrk6"),
				MCItemDef.create("pre_rcpt_iv_flg", "pre_rcpt_iv_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("ar_dpt_typ", "ar_dpt_typ"),
				MCItemDef.create("lnk_ar_dpt_cd", "lnk_ar_dpt_cd"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
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
	public static MCContainerDef MS_MSBEL1730_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("exim_xpns_typ", "exim_xpns_typ"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("max_base_unit_qty", "max_base_unit_qty"),
				MCItemDef.create("max_trd_unit_qty", "max_trd_unit_qty"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("iv_upri_p" + ".upri", "iv_upri"),
				MCItemDef.create("iv_amt_p" + ".amt", "iv_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_nm", "tax_nm"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("multi_ship_fr_lg_grp_flg", "multi_ship_fr_lg_grp_flg"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("sls_acxfr_flg", "sls_acxfr_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "sls_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "sls_usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("iv_d_rmrks", "iv_d_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("ship_rqst_no", "ship_rqst_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("sls_upri_cng_flg", "sls_upri_cng_flg"),
				MCItemDef.create("dlv_rqst_dt_p" + ".ymd", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_dt_p" + ".hm", "dlv_rqst_hm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("manual_add_flg", "manual_add_flg"),
				MCItemDef.create("existed_flg", "existed_flg"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("ship_inst_qty", "ship_inst_qty"),
				MCItemDef.create("ship_act_qty", "ship_act_qty"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("index", "index"),
				MCItemDef.create("sls_dpt_wg_cd", "sls_dpt_wg_cd"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty"),
				MCItemDef.create("schd_trd_cur_dscnt_amt", "schd_trd_cur_dscnt_amt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL1730_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_MapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_inst_qty", "ship_inst_qty"),
				MCItemDef.create("ship_act_qty", "ship_act_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("MapDtl")
		);
	}
	public static MCContainerDef MS_MSBEL1730_Srch01_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch01_ShipInstMapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("ShipInstMapDtl")
		);
	}
	public static MCContainerDef MS_MSBEL1730_Srch01_DOWN_BLOCK4() {
	/** Ope.のBlock [Srch01_ShipActMapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("ShipActMapDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1730_Srch02_INFO = new MCOperationInfo("MS", "MSBEL1730", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1730_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no")
			}
			,
			MCBlockDef.create("Cnd2")
		);
	}

	public static MCContainerDef MS_MSBEL1730_Srch02_UP_BLOCK1() {
		/** Ope.のBlock [Srch02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("iv_src_typ", "iv_src_typ")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBEL1730_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("exim_xpns_typ", "exim_xpns_typ"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("max_base_unit_qty", "max_base_unit_qty"),
				MCItemDef.create("max_trd_unit_qty", "max_trd_unit_qty"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("iv_upri_p" + ".upri", "iv_upri"),
				MCItemDef.create("iv_amt_p" + ".amt", "iv_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_nm", "tax_nm"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("multi_ship_fr_lg_grp_flg", "multi_ship_fr_lg_grp_flg"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("sls_acxfr_flg", "sls_acxfr_flg"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "sls_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "sls_usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("iv_d_rmrks", "iv_d_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("ship_rqst_no", "ship_rqst_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("sls_upri_cng_flg", "sls_upri_cng_flg"),
				MCItemDef.create("dlv_rqst_dt_p" + ".ymd", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_dt_p" + ".hm", "dlv_rqst_hm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("existed_flg", "existed_flg"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("index", "index"),
				MCItemDef.create("sls_dpt_wg_cd", "sls_dpt_wg_cd"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty"),
				MCItemDef.create("schd_trd_cur_dscnt_amt", "schd_trd_cur_dscnt_amt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL1730_Srch02_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch02_MapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("MapDtl")
		);
	}
	public static MCContainerDef MS_MSBEL1730_Srch02_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch02_ShipInstMapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("ShipInstMapDtl")
		);
	}
	public static MCContainerDef MS_MSBEL1730_Srch02_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch02_ShipActMapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("ShipActMapDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1730_Srch04_INFO = new MCOperationInfo("MS", "MSBEL1730", "Srch04", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1730_Srch04_UP_BLOCK0() {
		/** Ope.のBlock [Srch04_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("srch_tgt_typ", "srch_tgt_typ"),
				MCItemDef.create("srch_tgt_no", "srch_tgt_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1730_Srch04_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch04_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("is_slo_iv_no", "is_slo_iv_no"),
				MCItemDef.create("iv_src_typ", "iv_src_typ"),
				MCItemDef.create("iv_src_typ_nm", "iv_src_typ_nm"),
				MCItemDef.create("cmpl_schd_dt", "cmpl_schd_dt"),
				MCItemDef.create("iv_dt", "iv_dt"),
				MCItemDef.create("non_cmpl_flg", "non_cmpl_flg"),
				MCItemDef.create("old_iv_ship_flg", "old_iv_ship_flg"),
				MCItemDef.create("iv_ship_flg", "iv_ship_flg"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
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
				MCItemDef.create("ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("ship_rqst_id_typ_nm", "ship_rqst_id_typ_nm"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("ship_rqst_id_nm", "ship_rqst_id_nm"),
				MCItemDef.create("sls_upri_cng_flg", "sls_upri_cng_flg"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("via_dlv_typ_nm", "via_dlv_typ_nm"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("trnspt_nm", "trnspt_nm"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("load_port_nm", "load_port_nm"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("tdlv_addr_p" + ".cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_addr_p" + ".cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_addr_p" + ".zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr_p" + ".addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr_p" + ".addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr_p" + ".addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr_p" + ".addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_addr_p" + ".tel", "tdlv_tel"),
				MCItemDef.create("tdlv_addr_p" + ".fax", "tdlv_fax"),
				MCItemDef.create("tdlv_addr_p" + ".lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("dschrg_port_nm", "dschrg_port_nm"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_port_nm", "via_port_nm"),
				MCItemDef.create("via_schd_dt", "via_schd_dt"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_amt_rnd_typ", "trd_amt_rnd_typ"),
				MCItemDef.create("trd_tax_rnd_typ", "trd_tax_rnd_typ"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("ar_dpt_typ", "ar_dpt_typ"),
				MCItemDef.create("lnk_ar_dpt_cd", "lnk_ar_dpt_cd"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1730_Srch04_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch04_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("exim_xpns_typ", "exim_xpns_typ"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("max_base_unit_qty", "max_base_unit_qty"),
				MCItemDef.create("max_trd_unit_qty", "max_trd_unit_qty"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("iv_upri_p" + ".upri", "iv_upri"),
				MCItemDef.create("iv_amt_p" + ".amt", "iv_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_nm", "tax_nm"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("multi_ship_fr_lg_grp_flg", "multi_ship_fr_lg_grp_flg"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("ship_fr_lg_grp_nm", "ship_fr_lg_grp_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("rsn_nm", "rsn_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("sls_acxfr_flg", "sls_acxfr_flg"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "sls_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "sls_usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("iv_d_rmrks", "iv_d_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("ship_rqst_no", "ship_rqst_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("ship_inst_no", "ship_inst_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("sls_upri_cng_flg", "sls_upri_cng_flg"),
				MCItemDef.create("dlv_rqst_dt_p" + ".ymd", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_dt_p" + ".hm", "dlv_rqst_hm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("existed_flg", "existed_flg"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("index", "index"),
				MCItemDef.create("sls_dpt_wg_cd", "sls_dpt_wg_cd"),
				MCItemDef.create("schd_base_unit_qty", "schd_base_unit_qty"),
				MCItemDef.create("schd_trd_cur_dscnt_amt", "schd_trd_cur_dscnt_amt")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL1730_Srch04_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch04_MapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("MapDtl")
		);
	}
	public static MCContainerDef MS_MSBEL1730_Srch04_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch04_ShipInstMapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("ShipInstMapDtl")
		);
	}
	public static MCContainerDef MS_MSBEL1730_Srch04_DOWN_BLOCK4() {
	/** Ope.のBlock [Srch04_ShipActMapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("ShipActMapDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1730_Ins01_INFO = new MCOperationInfo("MS", "MSBEL1730", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1730_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("is_slo_iv_no", "is_slo_iv_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("iv_src_typ", "iv_src_typ"),
				MCItemDef.create("cmpl_schd_dt", "cmpl_schd_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("cmpl_dt", "cmpl_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("iv_dt", "iv_dt"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("tdlv_addr_p" + ".cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_addr_p" + ".cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_addr_p" + ".zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr_p" + ".addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr_p" + ".addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr_p" + ".addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr_p" + ".addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_addr_p" + ".tel", "tdlv_tel"),
				MCItemDef.create("tdlv_addr_p" + ".fax", "tdlv_fax"),
				MCItemDef.create("tdlv_addr_p" + ".lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_addr_p" + ".cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_addr_p" + ".cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_addr_p" + ".zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr_p" + ".addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr_p" + ".addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr_p" + ".addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr_p" + ".addr4", "dlv_addr4"),
				MCItemDef.create("dlv_addr_p" + ".tel", "dlv_tel"),
				MCItemDef.create("dlv_addr_p" + ".fax", "dlv_fax"),
				MCItemDef.create("dlv_addr_p" + ".cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_schd_dt", "via_schd_dt"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_amt_rnd_typ", "trd_amt_rnd_typ"),
				MCItemDef.create("trd_tax_rnd_typ", "trd_tax_rnd_typ"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("iv_rmrks", "iv_rmrks"),
				MCItemDef.create("case_mrk1", "case_mrk1"),
				MCItemDef.create("case_mrk2", "case_mrk2"),
				MCItemDef.create("case_mrk3", "case_mrk3"),
				MCItemDef.create("case_mrk4", "case_mrk4"),
				MCItemDef.create("case_mrk5", "case_mrk5"),
				MCItemDef.create("case_mrk6", "case_mrk6"),
				MCItemDef.create("lc_no", "lc_no"),
				MCItemDef.create("lc_dt", "lc_dt"),
				MCItemDef.create("lc_rmrks", "lc_rmrks"),
				MCItemDef.create("bl_no", "bl_no"),
				MCItemDef.create("bl_dt", "bl_dt"),
				MCItemDef.create("bl_rmrks", "bl_rmrks"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("pl_reg_flg", "pl_reg_flg"),
				MCItemDef.create("pl_skip_flg", "pl_skip_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("non_cmpl_flg", "non_cmpl_flg"),
				MCItemDef.create("old_iv_ship_flg", "old_iv_ship_flg"),
				MCItemDef.create("iv_ship_flg", "iv_ship_flg"),
				MCItemDef.create("iv_immed_prnt_flg", "iv_immed_prnt_flg"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1730_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("iv_upri_p" + ".upri", "iv_upri"),
				MCItemDef.create("iv_amt_p" + ".amt", "iv_amt"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "sls_usr_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("manual_add_flg", "manual_add_flg"),
				MCItemDef.create("existed_flg", "existed_flg"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("dlv_rqst_dt_p" + ".ymd", "dlv_rqst_tm"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("iv_d_rmrks", "iv_d_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1730_Ins01_UP_BLOCK2() {
		/** Ope.のBlock [Ins01_MapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("MapDtl")
		);
	}

	public static MCContainerDef MS_MSBEL1730_Ins01_UP_BLOCK3() {
		/** Ope.のBlock [Ins01_ShipInstMapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("ShipInstMapDtl")
		);
	}

	public static MCContainerDef MS_MSBEL1730_Ins01_UP_BLOCK4() {
		/** Ope.のBlock [Ins01_ShipActMapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("ShipActMapDtl")
		);
	}


	public static MCContainerDef MS_MSBEL1730_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_rev", "iv_rev")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1730_Ins01_DOWN_BLOCK1() {
	/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1730_Upd01_INFO = new MCOperationInfo("MS", "MSBEL1730", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1730_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("is_slo_iv_no", "is_slo_iv_no"),
				MCItemDef.create("iv_src_typ", "iv_src_typ"),
				MCItemDef.create("cmpl_schd_dt", "cmpl_schd_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("cmpl_dt", "cmpl_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("iv_dt", "iv_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_addr_p" + ".cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_addr_p" + ".cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_addr_p" + ".zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr_p" + ".addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr_p" + ".addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr_p" + ".addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr_p" + ".addr4", "dlv_addr4"),
				MCItemDef.create("dlv_addr_p" + ".tel", "dlv_tel"),
				MCItemDef.create("dlv_addr_p" + ".fax", "dlv_fax"),
				MCItemDef.create("dlv_addr_p" + ".cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("vssl_flght", "vssl_flght"),
				MCItemDef.create("load_port_cd", "load_port_cd"),
				MCItemDef.create("etd_dt", "etd_dt"),
				MCItemDef.create("dschrg_port_cd", "dschrg_port_cd"),
				MCItemDef.create("eta_dt", "eta_dt"),
				MCItemDef.create("via_port_cd", "via_port_cd"),
				MCItemDef.create("via_schd_dt", "via_schd_dt"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_amt_rnd_typ", "trd_amt_rnd_typ"),
				MCItemDef.create("trd_tax_rnd_typ", "trd_tax_rnd_typ"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate_p" + ".xrate", "ptax_xrate"),
				MCItemDef.create("iv_rmrks", "iv_rmrks"),
				MCItemDef.create("case_mrk1", "case_mrk1"),
				MCItemDef.create("case_mrk2", "case_mrk2"),
				MCItemDef.create("case_mrk3", "case_mrk3"),
				MCItemDef.create("case_mrk4", "case_mrk4"),
				MCItemDef.create("case_mrk5", "case_mrk5"),
				MCItemDef.create("case_mrk6", "case_mrk6"),
				MCItemDef.create("lc_no", "lc_no"),
				MCItemDef.create("lc_dt", "lc_dt"),
				MCItemDef.create("lc_rmrks", "lc_rmrks"),
				MCItemDef.create("bl_no", "bl_no"),
				MCItemDef.create("bl_dt", "bl_dt"),
				MCItemDef.create("bl_rmrks", "bl_rmrks"),
				MCItemDef.create("pl_reg_flg", "pl_reg_flg"),
				MCItemDef.create("pl_skip_flg", "pl_skip_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("non_cmpl_flg", "non_cmpl_flg"),
				MCItemDef.create("old_iv_ship_flg", "old_iv_ship_flg"),
				MCItemDef.create("iv_ship_flg", "iv_ship_flg"),
				MCItemDef.create("iv_immed_prnt_flg", "iv_immed_prnt_flg"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("sls_cmpl_flg", "sls_cmpl_flg"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1730_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("iv_upri_p" + ".upri", "iv_upri"),
				MCItemDef.create("iv_amt_p" + ".amt", "iv_amt"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "sls_usr_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("manual_add_flg", "manual_add_flg"),
				MCItemDef.create("existed_flg", "existed_flg"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("dlv_rqst_dt_p" + ".ymd", "dlv_rqst_tm"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("iv_d_rmrks", "iv_d_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_inst_qty", "ship_inst_qty"),
				MCItemDef.create("ship_act_qty", "ship_act_qty"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1730_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_MapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_inst_qty", "ship_inst_qty"),
				MCItemDef.create("ship_act_qty", "ship_act_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("MapDtl")
		);
	}

	public static MCContainerDef MS_MSBEL1730_Upd01_UP_BLOCK3() {
		/** Ope.のBlock [Upd01_ShipInstMapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("ShipInstMapDtl")
		);
	}

	public static MCContainerDef MS_MSBEL1730_Upd01_UP_BLOCK4() {
		/** Ope.のBlock [Upd01_ShipActMapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("ShipActMapDtl")
		);
	}


	public static MCContainerDef MS_MSBEL1730_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_rev", "iv_rev")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1730_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1730_Del01_INFO = new MCOperationInfo("MS", "MSBEL1730", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1730_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Del01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1730_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Del01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty_p" + ".qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_upri_amt_p" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("manual_add_flg", "manual_add_flg"),
				MCItemDef.create("existed_flg", "existed_flg"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_inst_qty", "ship_inst_qty"),
				MCItemDef.create("ship_act_qty", "ship_act_qty"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL1730_Del01_UP_BLOCK2() {
		/** Ope.のBlock [Del01_MapDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Del01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("ship_inst_qty", "ship_inst_qty"),
				MCItemDef.create("ship_act_qty", "ship_act_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("MapDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1730_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL1730", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1730_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_rev", "iv_rev")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1730_Sprt01_INFO = new MCOperationInfo("MS", "MSBEL1730", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1730_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("trd_unit_cd", "unit_cd"),
				MCItemDef.create("trd_unit_qty", "qty"),
				MCItemDef.create("trd_cur_cd", "cur_cd"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("UpriSrch")
		);
	}


	public static MCContainerDef MS_MSBEL1730_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1730", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri", "sls_upri"),
				MCItemDef.create("interim_flg", "interim_flg")
			}
			,
			MCBlockDef.create("UpriSrch")
		);
	}
	//FMCB DEF_CLASSES END
}

