package mcframe.serverMSBD.MSBDL5290;

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
 * [MSBDL_PoBulkRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL5290.PoBulkReg_Chk01.UP.BLOCK0")){
			return MS_MSBDL5290_PoBulkReg_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5290.PoBulkReg_Chk01.UP.BLOCK1")){
			return MS_MSBDL5290_PoBulkReg_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5290.PoBulkReg_Chk01.DOWN.BLOCK0")){
			return MS_MSBDL5290_PoBulkReg_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5290.PoBulkReg_Chk01.DOWN.BLOCK1")){
			return MS_MSBDL5290_PoBulkReg_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5290.PoBulkReg_Chk02.UP.BLOCK0")){
			return MS_MSBDL5290_PoBulkReg_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5290.PoBulkReg_Chk02.DOWN.BLOCK0")){
			return MS_MSBDL5290_PoBulkReg_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5290.PoBulkReg_Ins01.UP.BLOCK0")){
			return MS_MSBDL5290_PoBulkReg_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5290.PoBulkReg_Ins01.UP.BLOCK1")){
			return MS_MSBDL5290_PoBulkReg_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5290.PoBulkReg_Ins01.DOWN.BLOCK0")){
			return MS_MSBDL5290_PoBulkReg_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5290.PoBulkReg_Ins02.UP.BLOCK0")){
			return MS_MSBDL5290_PoBulkReg_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5290.PoBulkReg_Ins02.UP.BLOCK1")){
			return MS_MSBDL5290_PoBulkReg_Ins02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5290.PoBulkReg_Ins02.DOWN.BLOCK0")){
			return MS_MSBDL5290_PoBulkReg_Ins02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBDL5290_PoBulkReg_Chk01_INFO = new MCOperationInfo("MS", "MSBDL5290", "PoBulkReg_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5290_PoBulkReg_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5290", "PoBulkReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("po_schd_dt_fr", "po_schd_dt_fr"),
				MCItemDef.create("po_schd_dt_to", "po_schd_dt_to"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("calc_schd_dt_flg", "calc_schd_dt_flg")
			}
			,
			MCBlockDef.create("PoBulkReg_Chk01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBDL5290_PoBulkReg_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5290", "PoBulkReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("PoBulkReg_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5290_PoBulkReg_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5290", "PoBulkReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("rqst_crrct_flg", "rqst_crrct_flg"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("rqst_can_flg", "rqst_can_flg"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_zip_cd", "sppl_zip_cd"),
				MCItemDef.create("sppl_addr1", "sppl_addr1"),
				MCItemDef.create("sppl_addr2", "sppl_addr2"),
				MCItemDef.create("sppl_addr3", "sppl_addr3"),
				MCItemDef.create("sppl_addr4", "sppl_addr4"),
				MCItemDef.create("sppl_tel", "sppl_tel"),
				MCItemDef.create("sppl_fax", "sppl_fax"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("pri_print_flg", "pri_print_flg"),
				MCItemDef.create("sppl_tterm_cd1", "sppl_tterm_cd1"),
				MCItemDef.create("sppl_tterm_cd2", "sppl_tterm_cd2"),
				MCItemDef.create("sppl_tterm_cd3", "sppl_tterm_cd3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ")
			}
			,
			MCBlockDef.create("PoBulkReg_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBDL5290_PoBulkReg_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5290", "PoBulkReg_Chk01",
			new MCItemDef[]{
				MCItemDef.create("total_cnt", "total_cnt")
			}
			,
			MCBlockDef.create("PoBulkReg_Chk01_Cnt")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5290_PoBulkReg_Chk02_INFO = new MCOperationInfo("MS", "MSBDL5290", "PoBulkReg_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5290_PoBulkReg_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5290", "PoBulkReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("rqst_crrct_flg", "rqst_crrct_flg"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("rqst_can_flg", "rqst_can_flg"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_zip_cd", "sppl_zip_cd"),
				MCItemDef.create("sppl_addr1", "sppl_addr1"),
				MCItemDef.create("sppl_addr2", "sppl_addr2"),
				MCItemDef.create("sppl_addr3", "sppl_addr3"),
				MCItemDef.create("sppl_addr4", "sppl_addr4"),
				MCItemDef.create("sppl_tel", "sppl_tel"),
				MCItemDef.create("sppl_fax", "sppl_fax"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("pri_print_flg", "pri_print_flg"),
				MCItemDef.create("sppl_tterm_cd1", "sppl_tterm_cd1"),
				MCItemDef.create("sppl_tterm_cd2", "sppl_tterm_cd2"),
				MCItemDef.create("sppl_tterm_cd3", "sppl_tterm_cd3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ")
			}
			,
			MCBlockDef.create("PoBulkReg_Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5290_PoBulkReg_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5290", "PoBulkReg_Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("rqst_crrct_flg", "rqst_crrct_flg"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("rqst_can_flg", "rqst_can_flg"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_zip_cd", "sppl_zip_cd"),
				MCItemDef.create("sppl_addr1", "sppl_addr1"),
				MCItemDef.create("sppl_addr2", "sppl_addr2"),
				MCItemDef.create("sppl_addr3", "sppl_addr3"),
				MCItemDef.create("sppl_addr4", "sppl_addr4"),
				MCItemDef.create("sppl_tel", "sppl_tel"),
				MCItemDef.create("sppl_fax", "sppl_fax"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("pri_print_flg", "pri_print_flg"),
				MCItemDef.create("sppl_tterm_cd1", "sppl_tterm_cd1"),
				MCItemDef.create("sppl_tterm_cd2", "sppl_tterm_cd2"),
				MCItemDef.create("sppl_tterm_cd3", "sppl_tterm_cd3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ")
			}
			,
			MCBlockDef.create("PoBulkReg_Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5290_PoBulkReg_Ins01_INFO = new MCOperationInfo("MS", "MSBDL5290", "PoBulkReg_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5290_PoBulkReg_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5290", "PoBulkReg_Ins01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("po_schd_dt_fr", "po_schd_dt_fr"),
				MCItemDef.create("po_schd_dt_to", "po_schd_dt_to"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_wg_cd", "purc_dpt_wg_cd"),
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("skip_err_flg", "skip_err_flg"),
				MCItemDef.create("calc_schd_dt_flg", "calc_schd_dt_flg")
			}
			,
			MCBlockDef.create("PoBulkReg_Ins01_Cnd")
		);
	}

	public static MCContainerDef MS_MSBDL5290_PoBulkReg_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5290", "PoBulkReg_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no")
			}
			,
			MCBlockDef.create("PoBulkReg_Ins01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5290_PoBulkReg_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5290", "PoBulkReg_Ins01",
			new MCItemDef[]{
				MCItemDef.create("po_schd_success_cnt", "po_schd_success_cnt"),
				MCItemDef.create("po_schd_error_cnt", "po_schd_error_cnt"),
				MCItemDef.create("total_cnt", "total_cnt")
			}
			,
			MCBlockDef.create("PoBulkReg_Ins01_Cnt")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5290_PoBulkReg_Ins02_INFO = new MCOperationInfo("MS", "MSBDL5290", "PoBulkReg_Ins02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5290_PoBulkReg_Ins02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5290", "PoBulkReg_Ins02",
			new MCItemDef[]{
				MCItemDef.create("prnt_po_flg", "prnt_po_flg"),
				MCItemDef.create("prnt_dlv_flg", "prnt_dlv_flg"),
				MCItemDef.create("skip_err_flg", "skip_err_flg")
			}
			,
			MCBlockDef.create("PoBulkReg_Ins02_Cnd")
		);
	}

	public static MCContainerDef MS_MSBDL5290_PoBulkReg_Ins02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5290", "PoBulkReg_Ins02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("rqst_crrct_flg", "rqst_crrct_flg"),
				MCItemDef.create("bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("bd_sno1", "bd_sno1"),
				MCItemDef.create("bd_sno2", "bd_sno2"),
				MCItemDef.create("bd_sno3", "bd_sno3"),
				MCItemDef.create("bd_sno4", "bd_sno4"),
				MCItemDef.create("bd_lot_no", "bd_lot_no"),
				MCItemDef.create("bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("rqst_can_flg", "rqst_can_flg"),
				MCItemDef.create("po_dt", "po_dt"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_zip_cd", "sppl_zip_cd"),
				MCItemDef.create("sppl_addr1", "sppl_addr1"),
				MCItemDef.create("sppl_addr2", "sppl_addr2"),
				MCItemDef.create("sppl_addr3", "sppl_addr3"),
				MCItemDef.create("sppl_addr4", "sppl_addr4"),
				MCItemDef.create("sppl_tel", "sppl_tel"),
				MCItemDef.create("sppl_fax", "sppl_fax"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("pri_print_flg", "pri_print_flg"),
				MCItemDef.create("sppl_tterm_cd1", "sppl_tterm_cd1"),
				MCItemDef.create("sppl_tterm_cd2", "sppl_tterm_cd2"),
				MCItemDef.create("sppl_tterm_cd3", "sppl_tterm_cd3"),
				MCItemDef.create("edi_flg", "edi_flg"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ")
			}
			,
			MCBlockDef.create("PoBulkReg_Ins02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5290_PoBulkReg_Ins02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5290", "PoBulkReg_Ins02",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no")
			}
			,
			MCBlockDef.create("PoBulkReg_Ins02_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

