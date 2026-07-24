package mcframe.serverMSLA.MSLAL9110;

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
 * [MSLAL_PoRecvIfService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Chk01.UP.BLOCK0")){
			return MS_MSLAL9110_PoRecvIf_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Chk01.DOWN.BLOCK0")){
			return MS_MSLAL9110_PoRecvIf_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Chk01.DOWN.BLOCK1")){
			return MS_MSLAL9110_PoRecvIf_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Chk01.DOWN.BLOCK2")){
			return MS_MSLAL9110_PoRecvIf_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Chk01.DOWN.BLOCK3")){
			return MS_MSLAL9110_PoRecvIf_Chk01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Upd01.UP.BLOCK0")){
			return MS_MSLAL9110_PoRecvIf_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Upd02.UP.BLOCK0")){
			return MS_MSLAL9110_PoRecvIf_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Upd02.UP.BLOCK1")){
			return MS_MSLAL9110_PoRecvIf_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Upd02.DOWN.BLOCK0")){
			return MS_MSLAL9110_PoRecvIf_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Upd03.UP.BLOCK0")){
			return MS_MSLAL9110_PoRecvIf_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Upd03.DOWN.BLOCK0")){
			return MS_MSLAL9110_PoRecvIf_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Upd04.UP.BLOCK0")){
			return MS_MSLAL9110_PoRecvIf_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Upd04.DOWN.BLOCK0")){
			return MS_MSLAL9110_PoRecvIf_Upd04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL9110.PoRecvIf_Upd04.DOWN.BLOCK1")){
			return MS_MSLAL9110_PoRecvIf_Upd04_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSLAL9110_PoRecvIf_Chk01_INFO = new MCOperationInfo("MS", "MSLAL9110", "PoRecvIf_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("poif" + ".data_lno", "data_lno"),
				MCItemDef.create("poif" + ".data_no", "data_no"),
				MCItemDef.create("poif" + ".data_crud_typ", "data_crud_typ"),
				MCItemDef.create("poif" + ".exe_sts_typ", "exe_sts_typ"),
				MCItemDef.create("poif" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("poif" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("poif" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("poif" + ".data_make_dt", "data_make_dt"),
				MCItemDef.create("poif" + ".imp_flg", "imp_flg"),
				MCItemDef.create("poif" + ".recv_dt", "recv_dt"),
				MCItemDef.create("poif" + ".ext_po_no", "ext_po_no"),
				MCItemDef.create("poif" + ".ext_po_d_no", "ext_po_d_no"),
				MCItemDef.create("poif" + ".prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("poif" + ".prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("poif" + ".po_dt", "po_dt"),
				MCItemDef.create("poif" + ".trd_cd", "trd_cd"),
				MCItemDef.create("poif" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("poif" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("poif" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("poif" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("poif" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("poif" + ".xrate", "xrate"),
				MCItemDef.create("poif" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("poif" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("poif" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("poif" + ".po_print_cd", "po_print_cd"),
				MCItemDef.create("poif" + ".upd_po_print_schd_dt", "upd_po_print_schd_dt"),
				MCItemDef.create("poif" + ".crct_rsn_cd", "crct_rsn_cd"),
				MCItemDef.create("poif" + ".tterm_cd1", "tterm_cd1"),
				MCItemDef.create("poif" + ".tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("poif" + ".tterm_cd2", "tterm_cd2"),
				MCItemDef.create("poif" + ".tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("poif" + ".tterm_cd3", "tterm_cd3"),
				MCItemDef.create("poif" + ".tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("poif" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("poif" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("poif" + ".po_print_rmrks", "po_print_rmrks"),
				MCItemDef.create("poif" + ".dlv_slip_rmrks", "dlv_slip_rmrks"),
				MCItemDef.create("poif" + ".itm_cd", "itm_cd"),
				MCItemDef.create("poif" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("poif" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("poif" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("poif" + ".itm_nm", "itm_nm"),
				MCItemDef.create("poif" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("poif" + ".ver_no", "ver_no"),
				MCItemDef.create("poif" + ".sno1", "sno1"),
				MCItemDef.create("poif" + ".sno2", "sno2"),
				MCItemDef.create("poif" + ".sno3", "sno3"),
				MCItemDef.create("poif" + ".sno4", "sno4"),
				MCItemDef.create("poif" + ".purc_id_typ", "purc_id_typ"),
				MCItemDef.create("poif" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("poif" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("poif" + ".maker_cd", "maker_cd"),
				MCItemDef.create("poif" + ".bp_lot_no", "bp_lot_no"),
				MCItemDef.create("poif" + ".in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("poif" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("poif" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("poif" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("poif" + ".dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("poif" + ".rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("poif" + ".purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("poif" + ".sync_flg", "sync_flg"),
				MCItemDef.create("poif" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("poif" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("poif" + ".purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("poif" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("poif" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("poif" + ".interim_flg", "interim_flg"),
				MCItemDef.create("poif" + ".tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("poif" + ".tax_cd", "tax_cd"),
				MCItemDef.create("poif" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("poif" + ".dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("poif" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("poif" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("poif" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("poif" + ".purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("poif" + ".pri_print_flg", "pri_print_flg"),
				MCItemDef.create("poif" + ".po_conf_rcpt_flg", "po_conf_rcpt_flg"),
				MCItemDef.create("poif" + ".po_conf_rcpt_dt", "po_conf_rcpt_dt"),
				MCItemDef.create("poif" + ".pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("poif" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("poif" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("poif" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("poif" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("poif" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("poif" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("poif" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("poif" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("poif" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("poif" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("poif" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("poif" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("poif" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("poif" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("poif" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("poif" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("poif" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("poif" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("poif" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("poif" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("poif" + ".po_print_d_rmrks", "po_print_d_rmrks"),
				MCItemDef.create("poif" + ".arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("poif" + ".dlv_slip_d_rmrks", "dlv_slip_d_rmrks"),
				MCItemDef.create("poif" + ".edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("poif" + ".edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("poif" + ".edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("poif" + ".edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("poif" + ".edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("poif" + ".edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("poif" + ".edi_sub_dt1", "edi_sub_dt1"),
				MCItemDef.create("poif" + ".edi_sub_d_char1", "edi_sub_d_char1"),
				MCItemDef.create("poif" + ".edi_sub_d_char2", "edi_sub_d_char2"),
				MCItemDef.create("poif" + ".edi_sub_d_char3", "edi_sub_d_char3"),
				MCItemDef.create("poif" + ".edi_sub_d_char4", "edi_sub_d_char4"),
				MCItemDef.create("poif" + ".edi_sub_d_char5", "edi_sub_d_char5"),
				MCItemDef.create("poif" + ".edi_sub_d_num1", "edi_sub_d_num1"),
				MCItemDef.create("poif" + ".edi_sub_d_dt1", "edi_sub_d_dt1")
			}
			,
			MCBlockDef.create("PoRecvIf_Chk01_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PoRecvIf_Chk01_Cnd")
		);
	}
	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("trd_cur_ttl_amt", "trd_cur_ttl_amt"),
				MCItemDef.create("bef_po_rev", "bef_po_rev"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
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
				MCItemDef.create("po" + ".edi_sub_char1", "edi_sub_char1"),
				MCItemDef.create("po" + ".edi_sub_char2", "edi_sub_char2"),
				MCItemDef.create("po" + ".edi_sub_char3", "edi_sub_char3"),
				MCItemDef.create("po" + ".edi_sub_char4", "edi_sub_char4"),
				MCItemDef.create("po" + ".edi_sub_char5", "edi_sub_char5"),
				MCItemDef.create("po" + ".edi_sub_num1", "edi_sub_num1"),
				MCItemDef.create("po" + ".edi_sub_dt1", "edi_sub_dt1"),
				MCItemDef.create("po" + ".purc_if_flg", "purc_if_flg"),
				MCItemDef.create("po" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("po" + ".ext_po_no", "ext_po_no")
			}
			,
			MCBlockDef.create("PoRecvIf_Chk01_Hdr_Rslt")
		);
	}
	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Chk01",
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
				MCItemDef.create("pod" + ".dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("pod" + ".purc_lt", "purc_lt"),
				MCItemDef.create("pod" + ".rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("pod" + ".rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
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
				MCItemDef.create("pod" + ".pay_crryovr_times", "pay_crryovr_times"),
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
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("pod" + ".purc_basis_typ", "pod" + ".purc_basis_typ")
			}
			,
			MCBlockDef.create("PoRecvIf_Chk01_Dtl_Rslt")
		);
	}
	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Chk01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Chk01",
			new MCItemDef[]{
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("base_unit_qty", "base_unit_qty")
			}
			,
			MCBlockDef.create("PoRecvIf_Chk01_Dtl_Rslt2")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9110_PoRecvIf_Upd01_INFO = new MCOperationInfo("MS", "MSLAL9110", "PoRecvIf_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("PoRecvIf_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9110_PoRecvIf_Upd02_INFO = new MCOperationInfo("MS", "MSLAL9110", "PoRecvIf_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("ext_data_no", "ext_data_no"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd")
			}
			,
			MCBlockDef.create("PoRecvIf_Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("exe_unit_lump_flg", "exe_unit_lump_flg"),
				MCItemDef.create("if_upd_typ", "if_upd_typ"),
				MCItemDef.create("src_actlumprecv_flg", "src_actlumprecv_flg")
			}
			,
			MCBlockDef.create("PoRecvIf_Upd02_Cnd")
		);
	}


	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Upd02",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("PoRecvIf_Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9110_PoRecvIf_Upd03_INFO = new MCOperationInfo("MS", "MSLAL9110", "PoRecvIf_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("poif" + ".data_lno", "data_lno"),
				MCItemDef.create("poif" + ".data_no", "data_no"),
				MCItemDef.create("poif" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("poif" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("poif" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("poif" + ".ext_po_no", "ext_po_no"),
				MCItemDef.create("poif" + ".ext_po_d_no", "ext_po_d_no")
			}
			,
			MCBlockDef.create("PoRecvIf_Upd03_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Upd03",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("PoRecvIf_Upd03_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSLAL9110_PoRecvIf_Upd04_INFO = new MCOperationInfo("MS", "MSLAL9110", "PoRecvIf_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("poif" + ".data_lno", "data_lno"),
				MCItemDef.create("poif" + ".data_no", "data_no"),
				MCItemDef.create("poif" + ".ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("poif" + ".ext_data_no", "ext_data_no"),
				MCItemDef.create("poif" + ".ext_data_lno", "ext_data_lno"),
				MCItemDef.create("poif" + ".ext_po_no", "ext_po_no"),
				MCItemDef.create("poif" + ".ext_po_d_no", "ext_po_d_no")
			}
			,
			MCBlockDef.create("PoRecvIf_Upd04_Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Upd04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("poif" + ".data_lno", "data_lno"),
				MCItemDef.create("poif" + ".data_no", "data_no"),
				MCItemDef.create("poif" + ".exe_sts_typ", "exe_sts_typ")
			}
			,
			MCBlockDef.create("PoRecvIf_Upd04_Dtl")
		);
	}
	public static MCContainerDef MS_MSLAL9110_PoRecvIf_Upd04_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL9110", "PoRecvIf_Upd04",
			new MCItemDef[]{
				MCItemDef.create("total_num", "total_num"),
				MCItemDef.create("ok_num", "ok_num"),
				MCItemDef.create("err_num", "err_num"),
				MCItemDef.create("skip_num", "skip_num")
			}
			,
			MCBlockDef.create("RcvRecvIf_Upd04_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

