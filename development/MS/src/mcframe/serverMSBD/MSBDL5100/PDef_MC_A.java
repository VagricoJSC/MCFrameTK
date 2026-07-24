package mcframe.serverMSBD.MSBDL5100;

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
 * [MSBDL_PoRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL5100.Po_Ins01.UP.BLOCK0")){
			return MS_MSBDL5100_Po_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5100.Po_Ins01.UP.BLOCK1")){
			return MS_MSBDL5100_Po_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5100.Po_Ins01.UP.BLOCK2")){
			return MS_MSBDL5100_Po_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5100.Po_Ins01.DOWN.BLOCK0")){
			return MS_MSBDL5100_Po_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5100.Po_Ins01.DOWN.BLOCK1")){
			return MS_MSBDL5100_Po_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5100.Po_Ins01.DOWN.BLOCK2")){
			return MS_MSBDL5100_Po_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5100.Po_Upd01.UP.BLOCK0")){
			return MS_MSBDL5100_Po_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5100.Po_Upd01.UP.BLOCK1")){
			return MS_MSBDL5100_Po_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5100.Po_Upd01.UP.BLOCK2")){
			return MS_MSBDL5100_Po_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5100.Po_Upd01.DOWN.BLOCK0")){
			return MS_MSBDL5100_Po_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5100.Po_Upd01.DOWN.BLOCK1")){
			return MS_MSBDL5100_Po_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5100.Po_Del01.UP.BLOCK0")){
			return MS_MSBDL5100_Po_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5100.Po_Del01.UP.BLOCK1")){
			return MS_MSBDL5100_Po_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5100.Po_Del01.UP.BLOCK2")){
			return MS_MSBDL5100_Po_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5100.Po_Del01.DOWN.BLOCK0")){
			return MS_MSBDL5100_Po_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5100.Po_Del01.DOWN.BLOCK1")){
			return MS_MSBDL5100_Po_Del01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5100.Po_Chk01.UP.BLOCK0")){
			return MS_MSBDL5100_Po_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5100.Po_Chk01.UP.BLOCK1")){
			return MS_MSBDL5100_Po_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5100.Po_Chk01.UP.BLOCK2")){
			return MS_MSBDL5100_Po_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5100.Po_Chk01.DOWN.BLOCK0")){
			return MS_MSBDL5100_Po_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5100.Po_Chk01.DOWN.BLOCK1")){
			return MS_MSBDL5100_Po_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5100.Po_Chk01.DOWN.BLOCK2")){
			return MS_MSBDL5100_Po_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBDL5100.Po_RevUpd01.UP.BLOCK0")){
			return MS_MSBDL5100_Po_RevUpd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBDL5100_Po_Ins01_INFO = new MCOperationInfo("MS", "MSBDL5100", "Po_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5100_Po_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("trd_cur_ttl_amt", "trd_cur_ttl_amt"),
				MCItemDef.create("bef_po_rev", "bef_po_rev"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("prnt_purc_ddlv_dlv_flg", "prnt_purc_ddlv_dlv_flg"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("po" + ".trd_cd", "trd_cd"),
				MCItemDef.create("po" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("po" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("po" + ".wg_cd", "wg_cd"),
				MCItemDef.create("po" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("po" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("po" + ".sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("po" + ".sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("po" + ".sppl_zip_cd", "sppl_zip_cd"),
				MCItemDef.create("po" + ".sppl_addr1", "sppl_addr1"),
				MCItemDef.create("po" + ".sppl_addr2", "sppl_addr2"),
				MCItemDef.create("po" + ".sppl_addr3", "sppl_addr3"),
				MCItemDef.create("po" + ".sppl_addr4", "sppl_addr4"),
				MCItemDef.create("po" + ".sppl_tel", "sppl_tel"),
				MCItemDef.create("po" + ".sppl_fax", "sppl_fax"),
				MCItemDef.create("po" + ".po_dt", "po_dt"),
				MCItemDef.create("po" + ".upd_po_print_schd_dt", "upd_po_print_schd_dt"),
				MCItemDef.create("po" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("po" + ".xrate", "xrate"),
				MCItemDef.create("po" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("po" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("po" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("po" + ".crct_rsn_cd", "crct_rsn_cd"),
				MCItemDef.create("po" + ".po_print_cd", "po_print_cd"),
				MCItemDef.create("po" + ".wrk_no", "wrk_no"),
				MCItemDef.create("po" + ".tterm_cd1", "tterm_cd1"),
				MCItemDef.create("po" + ".tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("po" + ".tterm_cd2", "tterm_cd2"),
				MCItemDef.create("po" + ".tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("po" + ".tterm_cd3", "tterm_cd3"),
				MCItemDef.create("po" + ".tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("po" + ".can_flg", "can_flg"),
				MCItemDef.create("po" + ".edi_flg", "edi_flg"),
				MCItemDef.create("po" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("po" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("po" + ".po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("po" + ".dlv_slip_rmrks", "dlv_slip_rmrks"),
				MCItemDef.create("po" + ".sub_char1", "sub_char1"),
				MCItemDef.create("po" + ".sub_char2", "sub_char2"),
				MCItemDef.create("po" + ".sub_char3", "sub_char3"),
				MCItemDef.create("po" + ".edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("po" + ".edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("po" + ".edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("po" + ".edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("po" + ".edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("po" + ".edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("po" + ".edi_sub_dt1", "edi_sub_dt1"),
				MCItemDef.create("po" + ".purc_if_flg", "purc_if_flg"),
				MCItemDef.create("po" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("po" + ".ext_po_no", "ext_po_no"),
				MCItemDef.create("po" + ".dlv_slip_form_cd", "dlv_slip_form_cd"),
				MCItemDef.create("po" + ".sgl_form_flg", "sgl_form_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Po_Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5100_Po_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pod" + ".po_schd_no", "po_schd_no"),
				MCItemDef.create("pod" + ".disp_seq", "disp_seq"),
				MCItemDef.create("pod" + ".itm_cd", "itm_cd"),
				MCItemDef.create("pod" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("pod" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("pod" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("pod" + ".ver_no", "ver_no"),
				MCItemDef.create("pod" + ".itm_nm", "itm_nm"),
				MCItemDef.create("pod" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("pod" + ".sno1", "sno1"),
				MCItemDef.create("pod" + ".sno2", "sno2"),
				MCItemDef.create("pod" + ".sno3", "sno3"),
				MCItemDef.create("pod" + ".sno4", "sno4"),
				MCItemDef.create("pod" + ".purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("pod" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("pod" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("pod" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("pod" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("pod" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pod" + ".maker_cd", "maker_cd"),
				MCItemDef.create("pod" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("pod" + ".in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("pod" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("pod" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("pod" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("pod" + ".dlv_nm", "dlv_nm"),
				MCItemDef.create("pod" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("pod" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("pod" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("pod" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("pod" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("pod" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("pod" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("pod" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("pod" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("pod" + ".tdlv_cd", "tdlv_cd"),
				MCItemDef.create("pod" + ".tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("pod" + ".tdlv_nm", "tdlv_nm"),
				MCItemDef.create("pod" + ".tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("pod" + ".tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("pod" + ".tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("pod" + ".tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("pod" + ".tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("pod" + ".tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("pod" + ".tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("pod" + ".tdlv_tel", "tdlv_tel"),
				MCItemDef.create("pod" + ".tdlv_fax", "tdlv_fax"),
				MCItemDef.create("pod" + ".dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("pod" + ".purc_lt", "purc_lt"),
				MCItemDef.create("pod" + ".rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("pod" + ".purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("pod" + ".rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("pod" + ".sync_flg", "sync_flg"),
				MCItemDef.create("pod" + ".purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("pod" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pod" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pod" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pod" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pod" + ".interim_flg", "interim_flg"),
				MCItemDef.create("pod" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("pod" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("pod" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("pod" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("pod" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pod" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("pod" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("pod" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("pod" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("pod" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("pod" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("pod" + ".tax_cd", "tax_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("pod" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("pod" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("pod" + ".drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("pod" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("pod" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("pod" + ".bndl_flg", "bndl_flg"),
				MCItemDef.create("pod" + ".outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("pod" + ".outsrc_flg", "outsrc_flg"),
				MCItemDef.create("pod" + ".uplnd_flg", "uplnd_flg"),
				MCItemDef.create("pod" + ".schd_chg_flg", "schd_chg_flg"),
				MCItemDef.create("pod" + ".po_conf_rcpt_flg", "po_conf_rcpt_flg"),
				MCItemDef.create("pod" + ".po_conf_rcpt_dt", "po_conf_rcpt_dt"),
				MCItemDef.create("pod" + ".pri_print_flg", "pri_print_flg"),
				MCItemDef.create("pod" + ".dlv_slip_invalid_flg", "dlv_slip_invalid_flg"),
				MCItemDef.create("pod" + ".pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pod" + ".slo_no", "slo_no"),
				MCItemDef.create("pod" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("pod" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("pod" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("pod" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("pod" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("pod" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("pod" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("pod" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("pod" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("pod" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("pod" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("pod" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("pod" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("pod" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("pod" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("pod" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("pod" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("pod" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("pod" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("pod" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pod" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pod" + ".po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("pod" + ".dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("pod" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pod" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pod" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pod" + ".edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("pod" + ".edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("pod" + ".edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("pod" + ".edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("pod" + ".edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("pod" + ".edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("pod" + ".edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("pod" + ".rqst_can_flg", "rqst_can_flg"),
				MCItemDef.create("pod" + ".ext_po_d_no", "ext_po_d_no"),
				MCItemDef.create("pod" + ".purc_basis_typ", "purc_basis_typ")
			}
			,
			MCBlockDef.create("Po_Ins01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5100_Po_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Ins01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Po_Ins01_Bndl_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5100_Po_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po" + ".po_no", "po_no"),
				MCItemDef.create("po" + ".po_rev", "po_rev"),
				MCItemDef.create("po" + ".aprv_flg", "aprv_flg"),
				MCItemDef.create("po" + ".aprv_no", "aprv_no"),
				MCItemDef.create("po" + ".aprv_sts_typ", "aprv_sts_typ")
			}
			,
			MCBlockDef.create("Po_Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5100_Po_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pod" + ".po_d_no", "po_d_no"),
				MCItemDef.create("pod" + ".po_no", "po_no"),
				MCItemDef.create("pod" + ".po_rev", "po_rev"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev")
			}
			,
			MCBlockDef.create("Po_Ins01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5100_Po_Ins01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Ins01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Po_Ins01_Bndl_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5100_Po_Upd01_INFO = new MCOperationInfo("MS", "MSBDL5100", "Po_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5100_Po_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("trd_cur_ttl_amt", "trd_cur_ttl_amt"),
				MCItemDef.create("bef_po_rev", "bef_po_rev"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("prnt_purc_ddlv_dlv_flg", "prnt_purc_ddlv_dlv_flg"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("aprv_rvrs_flg", "aprv_rvrs_flg"),
				MCItemDef.create("po" + ".po_no", "po_no"),
				MCItemDef.create("po" + ".po_rev", "po_rev"),
				MCItemDef.create("po" + ".trd_cd", "trd_cd"),
				MCItemDef.create("po" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("po" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("po" + ".wg_cd", "wg_cd"),
				MCItemDef.create("po" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("po" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("po" + ".sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("po" + ".sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("po" + ".sppl_zip_cd", "sppl_zip_cd"),
				MCItemDef.create("po" + ".sppl_addr1", "sppl_addr1"),
				MCItemDef.create("po" + ".sppl_addr2", "sppl_addr2"),
				MCItemDef.create("po" + ".sppl_addr3", "sppl_addr3"),
				MCItemDef.create("po" + ".sppl_addr4", "sppl_addr4"),
				MCItemDef.create("po" + ".sppl_tel", "sppl_tel"),
				MCItemDef.create("po" + ".sppl_fax", "sppl_fax"),
				MCItemDef.create("po" + ".po_dt", "po_dt"),
				MCItemDef.create("po" + ".upd_po_print_schd_dt", "upd_po_print_schd_dt"),
				MCItemDef.create("po" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("po" + ".xrate", "xrate"),
				MCItemDef.create("po" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("po" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("po" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("po" + ".crct_rsn_cd", "crct_rsn_cd"),
				MCItemDef.create("po" + ".po_print_cd", "po_print_cd"),
				MCItemDef.create("po" + ".wrk_no", "wrk_no"),
				MCItemDef.create("po" + ".tterm_cd1", "tterm_cd1"),
				MCItemDef.create("po" + ".tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("po" + ".tterm_cd2", "tterm_cd2"),
				MCItemDef.create("po" + ".tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("po" + ".tterm_cd3", "tterm_cd3"),
				MCItemDef.create("po" + ".tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("po" + ".can_flg", "can_flg"),
				MCItemDef.create("po" + ".edi_flg", "edi_flg"),
				MCItemDef.create("po" + ".aprv_flg", "aprv_flg"),
				MCItemDef.create("po" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("po" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("po" + ".po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("po" + ".dlv_slip_rmrks", "dlv_slip_rmrks"),
				MCItemDef.create("po" + ".sub_char1", "sub_char1"),
				MCItemDef.create("po" + ".sub_char2", "sub_char2"),
				MCItemDef.create("po" + ".sub_char3", "sub_char3"),
				MCItemDef.create("po" + ".edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("po" + ".edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("po" + ".edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("po" + ".edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("po" + ".edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("po" + ".edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("po" + ".edi_sub_dt1", "edi_sub_dt1"),
				MCItemDef.create("po" + ".dlv_slip_form_cd", "dlv_slip_form_cd"),
				MCItemDef.create("po" + ".sgl_form_flg", "sgl_form_flg")
			}
			,
			MCBlockDef.create("Po_Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5100_Po_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("only_upd_pod_flg", "only_upd_pod_flg"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("bef_abort_flg", "bef_abort_flg"),
				MCItemDef.create("pod" + ".po_d_no", "po_d_no"),
				MCItemDef.create("pod" + ".po_no", "po_no"),
				MCItemDef.create("pod" + ".po_rev", "po_rev"),
				MCItemDef.create("pod" + ".po_schd_no", "po_schd_no"),
				MCItemDef.create("pod" + ".disp_seq", "disp_seq"),
				MCItemDef.create("pod" + ".itm_cd", "itm_cd"),
				MCItemDef.create("pod" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("pod" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("pod" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("pod" + ".ver_no", "ver_no"),
				MCItemDef.create("pod" + ".itm_nm", "itm_nm"),
				MCItemDef.create("pod" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("pod" + ".sno1", "sno1"),
				MCItemDef.create("pod" + ".sno2", "sno2"),
				MCItemDef.create("pod" + ".sno3", "sno3"),
				MCItemDef.create("pod" + ".sno4", "sno4"),
				MCItemDef.create("pod" + ".purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("pod" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("pod" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("pod" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("pod" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("pod" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pod" + ".maker_cd", "maker_cd"),
				MCItemDef.create("pod" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("pod" + ".in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("pod" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("pod" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("pod" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("pod" + ".dlv_nm", "dlv_nm"),
				MCItemDef.create("pod" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("pod" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("pod" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("pod" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("pod" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("pod" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("pod" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("pod" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("pod" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("pod" + ".tdlv_cd", "tdlv_cd"),
				MCItemDef.create("pod" + ".tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("pod" + ".tdlv_nm", "tdlv_nm"),
				MCItemDef.create("pod" + ".tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("pod" + ".tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("pod" + ".tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("pod" + ".tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("pod" + ".tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("pod" + ".tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("pod" + ".tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("pod" + ".tdlv_tel", "tdlv_tel"),
				MCItemDef.create("pod" + ".tdlv_fax", "tdlv_fax"),
				MCItemDef.create("pod" + ".dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("pod" + ".purc_lt", "purc_lt"),
				MCItemDef.create("pod" + ".rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("pod" + ".rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("pod" + ".purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("pod" + ".sync_flg", "sync_flg"),
				MCItemDef.create("pod" + ".purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("pod" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("pod" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("pod" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("pod" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("pod" + ".interim_flg", "interim_flg"),
				MCItemDef.create("pod" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("pod" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("pod" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("pod" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("pod" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pod" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("pod" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("pod" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("pod" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("pod" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("pod" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("pod" + ".tax_cd", "tax_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("pod" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("pod" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("pod" + ".drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("pod" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("pod" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("pod" + ".bndl_flg", "bndl_flg"),
				MCItemDef.create("pod" + ".outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("pod" + ".outsrc_flg", "outsrc_flg"),
				MCItemDef.create("pod" + ".uplnd_flg", "uplnd_flg"),
				MCItemDef.create("pod" + ".schd_chg_flg", "schd_chg_flg"),
				MCItemDef.create("pod" + ".po_conf_rcpt_flg", "po_conf_rcpt_flg"),
				MCItemDef.create("pod" + ".po_conf_rcpt_dt", "po_conf_rcpt_dt"),
				MCItemDef.create("pod" + ".pri_print_flg", "pri_print_flg"),
				MCItemDef.create("pod" + ".dlv_slip_invalid_flg", "dlv_slip_invalid_flg"),
				MCItemDef.create("pod" + ".pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("pod" + ".slo_no", "slo_no"),
				MCItemDef.create("pod" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("pod" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("pod" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("pod" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("pod" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("pod" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("pod" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("pod" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("pod" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("pod" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("pod" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("pod" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("pod" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("pod" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("pod" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("pod" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("pod" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("pod" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("pod" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("pod" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pod" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pod" + ".po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("pod" + ".dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("pod" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pod" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pod" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pod" + ".edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("pod" + ".edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("pod" + ".edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("pod" + ".edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("pod" + ".edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("pod" + ".edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("pod" + ".edi_sub_d_dt1", "edi_sub_d_dt1"),
				MCItemDef.create("pod" + ".rqst_can_flg", "rqst_can_flg"),
				MCItemDef.create("pod" + ".purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("arr_rem_abort_flg", "arr_rem_abort_flg"),
				MCItemDef.create("purc_rem_abort_flg", "purc_rem_abort_flg")
			}
			,
			MCBlockDef.create("Po_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5100_Po_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Upd01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("Po_Upd01_Bndl_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5100_Po_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po" + ".po_rev", "po_rev"),
				MCItemDef.create("po" + ".aprv_flg", "aprv_flg"),
				MCItemDef.create("po" + ".aprv_no", "aprv_no"),
				MCItemDef.create("po" + ".aprv_sts_typ", "aprv_sts_typ")
			}
			,
			MCBlockDef.create("Po_Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5100_Po_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pod" + ".po_d_no", "po_d_no"),
				MCItemDef.create("pod" + ".po_no", "po_no"),
				MCItemDef.create("pod" + ".po_rev", "po_rev"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("dlv_slip_mng_no", "dlv_slip_mng_no"),
				MCItemDef.create("dlv_slip_mng_seq", "dlv_slip_mng_seq"),
				MCItemDef.create("purc_ddlv_dlv_slip_no", "purc_ddlv_dlv_slip_no"),
				MCItemDef.create("purc_ddlv_dlv_slip_rev", "purc_ddlv_dlv_slip_rev")
			}
			,
			MCBlockDef.create("Po_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5100_Po_Del01_INFO = new MCOperationInfo("MS", "MSBDL5100", "Po_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5100_Po_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("prnt_purc_ddlv_dlv_flg", "prnt_purc_ddlv_dlv_flg"),
				MCItemDef.create("po" + ".po_no", "po_no"),
				MCItemDef.create("po" + ".po_rev", "po_rev"),
				MCItemDef.create("po" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("po" + ".po_print_cd", "po_print_cd"),
				MCItemDef.create("po" + ".crct_rsn_cd", "crct_rsn_cd"),
				MCItemDef.create("po" + ".edi_flg", "edi_flg")
			}
			,
			MCBlockDef.create("Po_Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5100_Po_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pod" + ".po_d_no", "po_d_no")
			}
			,
			MCBlockDef.create("Po_Del01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5100_Po_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Del01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_schd_no", "po_schd_no")
			}
			,
			MCBlockDef.create("Po_Del01_Bndl_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5100_Po_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Po_Del01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5100_Po_Del01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("Po_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5100_Po_Chk01_INFO = new MCOperationInfo("MS", "MSBDL5100", "Po_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5100_Po_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po" + ".po_no", "po_no")
			}
			,
			MCBlockDef.create("Po_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5100_Po_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pod" + ".po_no", "po_no"),
				MCItemDef.create("pod" + ".po_d_no", "po_d_no")
			}
			,
			MCBlockDef.create("Po_Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBDL5100_Po_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Chk01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("po_d_no", "po_d_no")
			}
			,
			MCBlockDef.create("Po_Chk01_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBDL5100_Po_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po" + ".po_no", "po_no")
			}
			,
			MCBlockDef.create("Po_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBDL5100_Po_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pod" + ".po_no", "po_no"),
				MCItemDef.create("pod" + ".po_d_no", "po_d_no"),
				MCItemDef.create("uplnd_outsrc_flg", "uplnd_outsrc_flg")
			}
			,
			MCBlockDef.create("Po_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5100_Po_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_Chk01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("po_d_no", "po_d_no")
			}
			,
			MCBlockDef.create("Po_Chk01_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5100_Po_RevUpd01_INFO = new MCOperationInfo("MS", "MSBDL5100", "Po_RevUpd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5100_Po_RevUpd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5100", "Po_RevUpd01",
			new MCItemDef[]{
				MCItemDef.create("rev_data_src_no", "rev_data_src_no"),
				MCItemDef.create("rev_no", "rev_no")
			}
			,
			MCBlockDef.create("Po_RevUpd01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

