package mcframe.serverMSBE.MSBEL5730;

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
 * [MSBEL_IvRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5730.Iv_Chk01.UP.BLOCK0")){
			return MS_MSBEL5730_Iv_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk01.UP.BLOCK1")){
			return MS_MSBEL5730_Iv_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk01.UP.BLOCK2")){
			return MS_MSBEL5730_Iv_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk01.UP.BLOCK3")){
			return MS_MSBEL5730_Iv_Chk01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk01.UP.BLOCK4")){
			return MS_MSBEL5730_Iv_Chk01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL5730_Iv_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk01.DOWN.BLOCK1")){
			return MS_MSBEL5730_Iv_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk01.DOWN.BLOCK2")){
			return MS_MSBEL5730_Iv_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk01.DOWN.BLOCK3")){
			return MS_MSBEL5730_Iv_Chk01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk01.DOWN.BLOCK4")){
			return MS_MSBEL5730_Iv_Chk01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Ins01.UP.BLOCK0")){
			return MS_MSBEL5730_Iv_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Ins01.UP.BLOCK1")){
			return MS_MSBEL5730_Iv_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Ins01.UP.BLOCK2")){
			return MS_MSBEL5730_Iv_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Ins01.UP.BLOCK3")){
			return MS_MSBEL5730_Iv_Ins01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Ins01.UP.BLOCK4")){
			return MS_MSBEL5730_Iv_Ins01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Ins01.DOWN.BLOCK0")){
			return MS_MSBEL5730_Iv_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Ins01.DOWN.BLOCK1")){
			return MS_MSBEL5730_Iv_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd01.UP.BLOCK0")){
			return MS_MSBEL5730_Iv_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd01.UP.BLOCK1")){
			return MS_MSBEL5730_Iv_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd01.UP.BLOCK2")){
			return MS_MSBEL5730_Iv_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd01.UP.BLOCK3")){
			return MS_MSBEL5730_Iv_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd01.UP.BLOCK4")){
			return MS_MSBEL5730_Iv_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd01.DOWN.BLOCK0")){
			return MS_MSBEL5730_Iv_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd01.DOWN.BLOCK1")){
			return MS_MSBEL5730_Iv_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd02.UP.BLOCK0")){
			return MS_MSBEL5730_Iv_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd02.UP.BLOCK1")){
			return MS_MSBEL5730_Iv_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd03.UP.BLOCK0")){
			return MS_MSBEL5730_Iv_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd03.UP.BLOCK1")){
			return MS_MSBEL5730_Iv_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd03.DOWN.BLOCK0")){
			return MS_MSBEL5730_Iv_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd04.UP.BLOCK0")){
			return MS_MSBEL5730_Iv_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd05.UP.BLOCK0")){
			return MS_MSBEL5730_Iv_Upd05_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Upd05.UP.BLOCK1")){
			return MS_MSBEL5730_Iv_Upd05_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk02.UP.BLOCK0")){
			return MS_MSBEL5730_Iv_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk02.UP.BLOCK1")){
			return MS_MSBEL5730_Iv_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk02.UP.BLOCK2")){
			return MS_MSBEL5730_Iv_Chk02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk02.DOWN.BLOCK0")){
			return MS_MSBEL5730_Iv_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk02.DOWN.BLOCK1")){
			return MS_MSBEL5730_Iv_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Chk02.DOWN.BLOCK2")){
			return MS_MSBEL5730_Iv_Chk02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Del01.UP.BLOCK0")){
			return MS_MSBEL5730_Iv_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Del01.UP.BLOCK1")){
			return MS_MSBEL5730_Iv_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL5730.Iv_Del01.UP.BLOCK2")){
			return MS_MSBEL5730_Iv_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBEL5730.Iv_RevUpd01.UP.BLOCK0")){
			return MS_MSBEL5730_Iv_RevUpd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
										
	
	static final MCOperationInfo MS_MSBEL5730_Iv_Chk01_INFO = new MCOperationInfo("MS", "MSBEL5730", "Iv_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5730_Iv_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("iv_src_typ", "iv_src_typ"),
				MCItemDef.create("cmpl_schd_dt", "cmpl_schd_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("cmpl_dt", "cmpl_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("iv_dt", "iv_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
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
				MCItemDef.create("ttl_trd_cur_amt", "ttl_trd_cur_amt"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ttl_net_wt", "ttl_net_wt"),
				MCItemDef.create("ttl_grss_wt", "ttl_grss_wt"),
				MCItemDef.create("ttl_dim", "ttl_dim"),
				MCItemDef.create("iv_rmrks", "iv_rmrks"),
				MCItemDef.create("pl_rmrks", "pl_rmrks"),
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
				MCItemDef.create("purc_cmpl_flg", "purc_cmpl_flg"),
				MCItemDef.create("pre_rcpt_iv_flg", "pre_rcpt_iv_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("sls_cmpl_flg", "sls_cmpl_flg"),
				MCItemDef.create("iv_tax_cmpl_flg", "iv_tax_cmpl_flg"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Iv_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk01",
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
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("iv_upri", "iv_upri"),
				MCItemDef.create("iv_amt", "iv_amt"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("manual_add_flg", "manual_add_flg"),
				MCItemDef.create("existed_flg", "existed_flg"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("iv_d_rmrks", "iv_d_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
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
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Iv_Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk01",
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
			MCBlockDef.create("Iv_Chk01_MapDtl")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Chk01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Iv_Chk01_ShipInstMapDtl")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Chk01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Iv_Chk01_ShipActMapDtl")
		);
	}


	public static MCContainerDef MS_MSBEL5730_Iv_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("is_slo_iv_no", "is_slo_iv_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("iv_rev", "iv_rev"),
				MCItemDef.create("iv_src_typ", "iv_src_typ"),
				MCItemDef.create("cmpl_schd_dt", "cmpl_schd_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("cmpl_dt", "cmpl_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("iv_dt", "iv_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("via_dlv_typ", "via_dlv_typ"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
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
				MCItemDef.create("ttl_trd_cur_amt", "ttl_trd_cur_amt"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ttl_net_wt", "ttl_net_wt"),
				MCItemDef.create("ttl_grss_wt", "ttl_grss_wt"),
				MCItemDef.create("ttl_dim", "ttl_dim"),
				MCItemDef.create("iv_rmrks", "iv_rmrks"),
				MCItemDef.create("pl_rmrks", "pl_rmrks"),
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
				MCItemDef.create("purc_cmpl_flg", "purc_cmpl_flg"),
				MCItemDef.create("pre_rcpt_iv_flg", "pre_rcpt_iv_flg"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_cststk_flg", "sls_cststk_flg"),
				MCItemDef.create("sls_cmpl_flg", "sls_cmpl_flg"),
				MCItemDef.create("iv_tax_cmpl_flg", "iv_tax_cmpl_flg"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Iv_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5730_Iv_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk01",
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
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("iv_upri", "iv_upri"),
				MCItemDef.create("iv_amt", "iv_amt"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("manual_add_flg", "manual_add_flg"),
				MCItemDef.create("existed_flg", "existed_flg"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("iv_d_rmrks", "iv_d_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Iv_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL5730_Iv_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk01",
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
			MCBlockDef.create("Iv_Chk01_MapDtl")
		);
	}
	public static MCContainerDef MS_MSBEL5730_Iv_Chk01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Iv_Chk01_ShipInstMapDtl")
		);
	}
	public static MCContainerDef MS_MSBEL5730_Iv_Chk01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Iv_Chk01_ShipActMapDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5730_Iv_Ins01_INFO = new MCOperationInfo("MS", "MSBEL5730", "Iv_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5730_Iv_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Ins01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("is_slo_iv_no", "is_slo_iv_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("iv_rev", "iv_rev"),
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
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
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
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
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
				MCItemDef.create("iv_tax_cmpl_flg", "iv_tax_cmpl_flg"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Iv_Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Ins01",
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
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("iv_upri", "iv_upri"),
				MCItemDef.create("iv_amt", "iv_amt"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("manual_add_flg", "manual_add_flg"),
				MCItemDef.create("existed_flg", "existed_flg"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("iv_d_rmrks", "iv_d_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("purc_ddlv_flg", "purc_ddlv_flg"),
				MCItemDef.create("pr_sts_typ", "pr_sts_typ"),
				MCItemDef.create("ship_pr_no", "ship_pr_no"),
				MCItemDef.create("ship_inst_typ", "ship_inst_typ"),
				MCItemDef.create("ship_pr_upd_cntr", "ship_pr_upd_cntr"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("uplnd_flg", "uplnd_flg"),
				MCItemDef.create("ship_act_no", "ship_act_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Iv_Ins01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Ins01",
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
			MCBlockDef.create("Iv_Ins01_MapDtl")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Ins01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Ins01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Iv_Ins01_ShipInstMapDtl")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Ins01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Ins01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Iv_Ins01_ShipActMapDtl")
		);
	}


	public static MCContainerDef MS_MSBEL5730_Iv_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Ins01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_rev", "iv_rev")
			}
			,
			MCBlockDef.create("Iv_Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5730_Iv_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Ins01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Iv_Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5730_Iv_Upd01_INFO = new MCOperationInfo("MS", "MSBEL5730", "Iv_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5730_Iv_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("is_slo_iv_no", "is_slo_iv_no"),
				MCItemDef.create("iv_rev", "iv_rev"),
				MCItemDef.create("iv_src_typ", "iv_src_typ"),
				MCItemDef.create("cmpl_schd_dt", "cmpl_schd_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("cmpl_dt", "cmpl_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
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
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
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
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
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
				MCItemDef.create("iv_tax_cmpl_flg", "iv_tax_cmpl_flg"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Iv_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd01",
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
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("iv_upri", "iv_upri"),
				MCItemDef.create("iv_amt", "iv_amt"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("manual_add_flg", "manual_add_flg"),
				MCItemDef.create("existed_flg", "existed_flg"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("iv_d_rmrks", "iv_d_rmrks"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
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
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Iv_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd01",
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
			MCBlockDef.create("Iv_Upd01_MapDtl")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Iv_Upd01_ShipInstMapDtl")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Upd01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("index", "index")
			}
			,
			MCBlockDef.create("Iv_Upd01_ShipActMapDtl")
		);
	}


	public static MCContainerDef MS_MSBEL5730_Iv_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_rev", "iv_rev")
			}
			,
			MCBlockDef.create("Iv_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5730_Iv_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("disp_seq", "disp_seq")
			}
			,
			MCBlockDef.create("Iv_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5730_Iv_Upd02_INFO = new MCOperationInfo("MS", "MSBEL5730", "Iv_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5730_Iv_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd02",
			new MCItemDef[]{
				MCItemDef.create("iv_reg_flg", "iv_reg_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_inst_reg_flg", "ship_inst_reg_flg")
			}
			,
			MCBlockDef.create("Iv_Upd02_Ctrl1")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_inst_d_no", "ship_inst_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("ship_inst_fix_flg", "ship_inst_fix_flg"),
				MCItemDef.create("fix_flg", "fix_flg")
			}
			,
			MCBlockDef.create("Iv_Upd02_Ctrl2")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5730_Iv_Upd03_INFO = new MCOperationInfo("MS", "MSBEL5730", "Iv_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5730_Iv_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd03",
			new MCItemDef[]{
				MCItemDef.create("iv_reg_flg", "iv_reg_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ship_act_reg_flg", "ship_act_reg_flg")
			}
			,
			MCBlockDef.create("Iv_Upd03_Ctrl1")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd03",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("ship_act_fix_flg", "ship_act_fix_flg"),
				MCItemDef.create("can_ac_dt", "can_ac_dt")
			}
			,
			MCBlockDef.create("Iv_Upd03_Ctrl2")
		);
	}


	public static MCContainerDef MS_MSBEL5730_Iv_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd03",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Iv_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5730_Iv_Upd04_INFO = new MCOperationInfo("MS", "MSBEL5730", "Iv_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5730_Iv_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd04",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("ship_alloc_sts_no", "ship_alloc_sts_no"),
				MCItemDef.create("ship_act_d_no", "ship_act_d_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Iv_Upd04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5730_Iv_Upd05_INFO = new MCOperationInfo("MS", "MSBEL5730", "Iv_Upd05", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5730_Iv_Upd05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd05",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("org_ship_schd_no", "org_ship_schd_no")
			}
			,
			MCBlockDef.create("Iv_Upd05_Ctrl1")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Upd05_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Upd05",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("ship_schd_no", "ship_schd_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Iv_Upd05_Ctrl2")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5730_Iv_Chk02_INFO = new MCOperationInfo("MS", "MSBEL5730", "Iv_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5730_Iv_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk02",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Iv_Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk02",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
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
			MCBlockDef.create("Iv_Chk02_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Chk02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk02",
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
			MCBlockDef.create("Iv_Chk02_MapDtl")
		);
	}


	public static MCContainerDef MS_MSBEL5730_Iv_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk02",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("is_slo_iv_no", "is_slo_iv_no"),
				MCItemDef.create("iv_src_typ", "iv_src_typ"),
				MCItemDef.create("cmpl_schd_dt", "cmpl_schd_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pl_reg_flg", "pl_reg_flg"),
				MCItemDef.create("iv_ship_flg", "iv_ship_flg"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Iv_Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL5730_Iv_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk02",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("manual_add_flg", "manual_add_flg"),
				MCItemDef.create("existed_flg", "existed_flg"),
				MCItemDef.create("purc_schd_no", "purc_schd_no"),
				MCItemDef.create("err_flg", "err_flg"),
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
			MCBlockDef.create("Iv_Chk02_Dtl")
		);
	}
	public static MCContainerDef MS_MSBEL5730_Iv_Chk02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Chk02",
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
			MCBlockDef.create("Iv_Chk02_MapDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5730_Iv_Del01_INFO = new MCOperationInfo("MS", "MSBEL5730", "Iv_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5730_Iv_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Del01",
			new MCItemDef[]{
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("is_slo_iv_no", "is_slo_iv_no"),
				MCItemDef.create("iv_src_typ", "iv_src_typ"),
				MCItemDef.create("cmpl_schd_dt", "cmpl_schd_dt"),
				MCItemDef.create("arr_schd_dt", "arr_schd_dt"),
				MCItemDef.create("sls_schd_dt", "sls_schd_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pl_reg_flg", "pl_reg_flg"),
				MCItemDef.create("iv_ship_flg", "iv_ship_flg"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("iv_upd_cntr", "iv_upd_cntr"),
				MCItemDef.create("data_crud_typ", "data_crud_typ")
			}
			,
			MCBlockDef.create("Iv_Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Del01",
			new MCItemDef[]{
				MCItemDef.create("iv_d_no", "iv_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("bndl_flg", "bndl_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
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
			MCBlockDef.create("Iv_Del01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBEL5730_Iv_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_Del01",
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
			MCBlockDef.create("Iv_Del01_MapDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5730_Iv_RevUpd01_INFO = new MCOperationInfo("MS", "MSBEL5730", "Iv_RevUpd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5730_Iv_RevUpd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5730", "Iv_RevUpd01",
			new MCItemDef[]{
				MCItemDef.create("rev_data_src_no", "rev_data_src_no"),
				MCItemDef.create("rev_no", "rev_no")
			}
			,
			MCBlockDef.create("Slo_RevUpd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

