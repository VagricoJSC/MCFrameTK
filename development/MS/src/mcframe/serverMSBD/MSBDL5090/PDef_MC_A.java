package mcframe.serverMSBD.MSBDL5090;

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
 * [MSBDL_PoSchdRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL5090.PoSchd_Upd01.UP.BLOCK0")){
			return MS_MSBDL5090_PoSchd_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5090.PoSchd_Upd01.DOWN.BLOCK0")){
			return MS_MSBDL5090_PoSchd_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5090.PoSchd_Upd02.UP.BLOCK0")){
			return MS_MSBDL5090_PoSchd_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5090.PoSchd_Upd02.DOWN.BLOCK0")){
			return MS_MSBDL5090_PoSchd_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5090.PoSchd_Upd03.UP.BLOCK0")){
			return MS_MSBDL5090_PoSchd_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5090.PoSchd_Upd03.UP.BLOCK1")){
			return MS_MSBDL5090_PoSchd_Upd03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBDL5090.PoSchd_Upd03.DOWN.BLOCK0")){
			return MS_MSBDL5090_PoSchd_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5090.PoSchd_Upd04.UP.BLOCK0")){
			return MS_MSBDL5090_PoSchd_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5090.PoSchd_Chk01.UP.BLOCK0")){
			return MS_MSBDL5090_PoSchd_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5090.PoSchd_Chk01.DOWN.BLOCK0")){
			return MS_MSBDL5090_PoSchd_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5090.PoSchd_Chk02.UP.BLOCK0")){
			return MS_MSBDL5090_PoSchd_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5090.PoSchd_Chk02.DOWN.BLOCK0")){
			return MS_MSBDL5090_PoSchd_Chk02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBDL5090_PoSchd_Upd01_INFO = new MCOperationInfo("MS", "MSBDL5090", "PoSchd_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5090_PoSchd_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5090", "PoSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("fr_pnl_flg", "fr_pnl_flg"),
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd" + ".po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd" + ".po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("po_schd" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("po_schd" + ".trd_cd", "trd_cd"),
				MCItemDef.create("po_schd" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("po_schd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("po_schd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("po_schd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("po_schd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("po_schd" + ".itm_nm", "itm_nm"),
				MCItemDef.create("po_schd" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("po_schd" + ".ver_no", "ver_no"),
				MCItemDef.create("po_schd" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("po_schd" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("po_schd" + ".sno1", "sno1"),
				MCItemDef.create("po_schd" + ".sno2", "sno2"),
				MCItemDef.create("po_schd" + ".sno3", "sno3"),
				MCItemDef.create("po_schd" + ".sno4", "sno4"),
				MCItemDef.create("po_schd" + ".purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("po_schd" + ".in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("po_schd" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("po_schd" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("po_schd" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("po_schd" + ".dlv_nm", "dlv_nm"),
				MCItemDef.create("po_schd" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("po_schd" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("po_schd" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("po_schd" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("po_schd" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("po_schd" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("po_schd" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("po_schd" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("po_schd" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("po_schd" + ".tdlv_cd", "tdlv_cd"),
				MCItemDef.create("po_schd" + ".tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("po_schd" + ".tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("po_schd" + ".tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("po_schd" + ".tdlv_nm", "tdlv_nm"),
				MCItemDef.create("po_schd" + ".tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("po_schd" + ".tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("po_schd" + ".tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("po_schd" + ".tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("po_schd" + ".tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("po_schd" + ".tdlv_tel", "tdlv_tel"),
				MCItemDef.create("po_schd" + ".tdlv_fax", "tdlv_fax"),
				MCItemDef.create("po_schd" + ".reg_dt", "reg_dt"),
				MCItemDef.create("po_schd" + ".rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("po_schd" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("po_schd" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("po_schd" + ".wg_cd", "wg_cd"),
				MCItemDef.create("po_schd" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("po_schd" + ".maker_cd", "maker_cd"),
				MCItemDef.create("po_schd" + ".outsrc_flg", "outsrc_flg"),
				MCItemDef.create("po_schd" + ".outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("po_schd" + ".pln_itm_ord_no", "pln_itm_ord_no"),
				MCItemDef.create("po_schd" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("po_schd" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("po_schd" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("po_schd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("po_schd" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("po_schd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("po_schd" + ".purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("po_schd" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("po_schd" + ".tax_cd", "tax_cd"),
				MCItemDef.create("po_schd" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("po_schd" + ".xrate", "xrate"),
				MCItemDef.create("po_schd" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("po_schd" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("po_schd" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("po_schd" + ".interim_flg", "interim_flg"),
				MCItemDef.create("po_schd" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("po_schd" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("po_schd" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("po_schd" + ".po_schd_dt", "po_schd_dt"),
				MCItemDef.create("po_schd" + ".purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("po_schd" + ".rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("po_schd" + ".rqst_upd_stop_flg", "rqst_upd_stop_flg"),
				MCItemDef.create("po_schd" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("po_schd" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("po_schd" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("po_schd" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("po_schd" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("po_schd" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("po_schd" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("po_schd" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("po_schd" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("po_schd" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("po_schd" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("po_schd" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("po_schd" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("po_schd" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("po_schd" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("po_schd" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("po_schd" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("po_schd" + ".abort_flg", "abort_flg"),
				MCItemDef.create("po_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("po_schd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_schd" + ".po_cnt_rmrks", "po_cnt_rmrks"),
				MCItemDef.create("po_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("po_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("po_schd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("po_schd" + ".dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("po_schd" + ".rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("po_schd" + ".rqst_crrct_flg", "rqst_crrct_flg"),
				MCItemDef.create("po_schd" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("po_schd" + ".outsrc_itm_ord_crt_flg", "outsrc_itm_ord_crt_flg"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("po_schd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("po_schd" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("po_schd" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("po_schd" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("po_schd" + ".purc_lt", "purc_lt"),
				MCItemDef.create("po_schd" + ".drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("po_schd" + ".split_src_schd_no", "split_src_schd_no"),
				MCItemDef.create("po_schd" + ".base_unit_po_qty", "base_unit_po_qty"),
				MCItemDef.create("po_schd" + ".slo_no", "slo_no"),
				MCItemDef.create("po_schd" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("po_schd" + ".add_flg", "add_flg"),
				MCItemDef.create("po_schd" + ".rqst_fr_dpt_cd", "rqst_fr_dpt_cd"),
				MCItemDef.create("po_schd" + ".rqst_fr_usr_cd", "rqst_fr_usr_cd"),
				MCItemDef.create("cred_no_up_flg", "cred_no_up_flg")
			}
			,
			MCBlockDef.create("PoSchd_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5090_PoSchd_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5090", "PoSchd_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd" + ".po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd" + ".po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("po_schd" + ".io_schd_pr_no", "io_schd_pr_no")
			}
			,
			MCBlockDef.create("PoSchd_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5090_PoSchd_Upd02_INFO = new MCOperationInfo("MS", "MSBDL5090", "PoSchd_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5090_PoSchd_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5090", "PoSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd" + ".po_no", "po_no"),
				MCItemDef.create("po_schd" + ".po_d_no", "po_d_no"),
				MCItemDef.create("po_schd" + ".po_flg", "po_flg"),
				MCItemDef.create("po_schd" + ".base_unit_po_qty", "base_unit_po_qty")
			}
			,
			MCBlockDef.create("PoSchd_Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5090_PoSchd_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5090", "PoSchd_Upd02",
			new MCItemDef[]{
				MCItemDef.create("po_schd" + ".io_schd_pr_no", "io_schd_pr_no")
			}
			,
			MCBlockDef.create("PoSchd_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5090_PoSchd_Upd03_INFO = new MCOperationInfo("MS", "MSBDL5090", "PoSchd_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5090_PoSchd_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5090", "PoSchd_Upd03",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd" + ".po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd" + ".po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("po_schd" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("po_schd" + ".pln_itm_ord_no", "pln_itm_ord_no"),
				MCItemDef.create("po_schd" + ".split_src_schd_no", "split_src_schd_no")
			}
			,
			MCBlockDef.create("PoSchd_Upd03_Hdr")
		);
	}

	public static MCContainerDef MS_MSBDL5090_PoSchd_Upd03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBDL5090", "PoSchd_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd" + ".po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd" + ".po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("po_schd" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("po_schd" + ".trd_cd", "trd_cd"),
				MCItemDef.create("po_schd" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("po_schd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("po_schd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("po_schd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("po_schd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("po_schd" + ".itm_nm", "itm_nm"),
				MCItemDef.create("po_schd" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("po_schd" + ".ver_no", "ver_no"),
				MCItemDef.create("po_schd" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("po_schd" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("po_schd" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("po_schd" + ".sno1", "sno1"),
				MCItemDef.create("po_schd" + ".sno2", "sno2"),
				MCItemDef.create("po_schd" + ".sno3", "sno3"),
				MCItemDef.create("po_schd" + ".sno4", "sno4"),
				MCItemDef.create("po_schd" + ".purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("po_schd" + ".in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("po_schd" + ".str_ln_cd", "str_ln_cd"),
				MCItemDef.create("po_schd" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("po_schd" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("po_schd" + ".dlv_nm", "dlv_nm"),
				MCItemDef.create("po_schd" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("po_schd" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("po_schd" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("po_schd" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("po_schd" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("po_schd" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("po_schd" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("po_schd" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("po_schd" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("po_schd" + ".tdlv_cd", "tdlv_cd"),
				MCItemDef.create("po_schd" + ".tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("po_schd" + ".tdlv_nm", "tdlv_nm"),
				MCItemDef.create("po_schd" + ".tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("po_schd" + ".tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("po_schd" + ".tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("po_schd" + ".tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("po_schd" + ".tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("po_schd" + ".tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("po_schd" + ".tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("po_schd" + ".tdlv_tel", "tdlv_tel"),
				MCItemDef.create("po_schd" + ".tdlv_fax", "tdlv_fax"),
				MCItemDef.create("po_schd" + ".reg_dt", "reg_dt"),
				MCItemDef.create("po_schd" + ".rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("po_schd" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("po_schd" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("po_schd" + ".wg_cd", "wg_cd"),
				MCItemDef.create("po_schd" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("po_schd" + ".maker_cd", "maker_cd"),
				MCItemDef.create("po_schd" + ".outsrc_flg", "outsrc_flg"),
				MCItemDef.create("po_schd" + ".outsrc_itm_ord_crt_flg", "outsrc_itm_ord_crt_flg"),
				MCItemDef.create("po_schd" + ".outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("po_schd" + ".pln_itm_ord_no", "pln_itm_ord_no"),
				MCItemDef.create("po_schd" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("po_schd" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("po_schd" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("po_schd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("po_schd" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("po_schd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("po_schd" + ".purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("po_schd" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("po_schd" + ".tax_cd", "tax_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("po_schd" + ".xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("po_schd" + ".xrate", "xrate"),
				MCItemDef.create("po_schd" + ".ptax_xrate", "ptax_xrate"),
				MCItemDef.create("po_schd" + ".ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("po_schd" + ".upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("po_schd" + ".interim_flg", "interim_flg"),
				MCItemDef.create("po_schd" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("po_schd" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("po_schd" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("po_schd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("po_schd" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("po_schd" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("po_schd" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("po_schd" + ".po_schd_dt", "po_schd_dt"),
				MCItemDef.create("po_schd" + ".rqst_dlv_rqst_tm", "rqst_dlv_rqst_tm"),
				MCItemDef.create("po_schd" + ".dlv_rqst_tm", "dlv_rqst_tm"),
				MCItemDef.create("po_schd" + ".rqst_avl_rqst_dt", "rqst_avl_rqst_dt"),
				MCItemDef.create("po_schd" + ".purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("po_schd" + ".purc_lt", "purc_lt"),
				MCItemDef.create("po_schd" + ".drct_dlv_typ", "drct_dlv_typ"),
				MCItemDef.create("po_schd" + ".po_schd_chg_typ", "po_schd_chg_typ"),
				MCItemDef.create("po_schd" + ".rqst_upd_stop_flg", "rqst_upd_stop_flg"),
				MCItemDef.create("po_schd" + ".rqst_crrct_flg", "rqst_crrct_flg"),
				MCItemDef.create("po_schd" + ".split_src_schd_no", "split_src_schd_no"),
				MCItemDef.create("po_schd" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("po_schd" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("po_schd" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("po_schd" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("po_schd" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("po_schd" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("po_schd" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("po_schd" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("po_schd" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("po_schd" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("po_schd" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("po_schd" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("po_schd" + ".bd_wg_cd", "bd_wg_cd"),
				MCItemDef.create("po_schd" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("po_schd" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("po_schd" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("po_schd" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("po_schd" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("po_schd" + ".bd_bp_cd", "bd_bp_cd"),
				MCItemDef.create("po_schd" + ".add_flg", "add_flg"),
				MCItemDef.create("po_schd" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("po_schd" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("po_schd" + ".po_cnt_rmrks", "po_cnt_rmrks"),
				MCItemDef.create("po_schd" + ".slo_no", "slo_no"),
				MCItemDef.create("po_schd" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("po_schd" + ".sub_char1", "sub_char1"),
				MCItemDef.create("po_schd" + ".sub_char2", "sub_char2"),
				MCItemDef.create("po_schd" + ".sub_char3", "sub_char3"),
				MCItemDef.create("po_schd" + ".rqst_fr_dpt_cd", "rqst_fr_dpt_cd"),
				MCItemDef.create("po_schd" + ".rqst_fr_usr_cd", "rqst_fr_usr_cd")
			}
			,
			MCBlockDef.create("PoSchd_Upd03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5090_PoSchd_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5090", "PoSchd_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd" + ".po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd" + ".po_schd_src_no", "po_schd_src_no")
			}
			,
			MCBlockDef.create("PoSchd_Upd03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5090_PoSchd_Upd04_INFO = new MCOperationInfo("MS", "MSBDL5090", "PoSchd_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5090_PoSchd_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5090", "PoSchd_Upd04",
			new MCItemDef[]{
				MCItemDef.create("only_own_upd_flg", "only_own_upd_flg"),
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd" + ".po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd" + ".po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("po_schd" + ".rqst_crrct_flg", "rqst_crrct_flg"),
				MCItemDef.create("po_schd" + ".rqst_can_flg", "rqst_can_flg")
			}
			,
			MCBlockDef.create("PoSchd_Upd04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5090_PoSchd_Chk01_INFO = new MCOperationInfo("MS", "MSBDL5090", "PoSchd_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5090_PoSchd_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5090", "PoSchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("fr_mfg_inst_flg", "fr_mfg_inst_flg"),
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no"),
				MCItemDef.create("po_schd" + ".po_schd_src_typ", "po_schd_src_typ"),
				MCItemDef.create("po_schd" + ".po_schd_src_no", "po_schd_src_no"),
				MCItemDef.create("po_schd" + ".outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("po_schd" + ".trd_cd", "trd_cd"),
				MCItemDef.create("po_schd" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("po_schd" + ".rqst_crrct_flg", "rqst_crrct_flg"),
				MCItemDef.create("po_schd" + ".abort_flg", "abort_flg"),
				MCItemDef.create("po_schd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("po_schd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("po_schd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("po_schd" + ".itm_sub3", "itm_sub3")
			}
			,
			MCBlockDef.create("PoSchd_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5090_PoSchd_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5090", "PoSchd_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("po_flg", "po_flg"),
				MCItemDef.create("act_flg", "act_flg"),
				MCItemDef.create("fr_mfg_inst_flg", "fr_mfg_inst_flg")
			}
			,
			MCBlockDef.create("PoSchd_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5090_PoSchd_Chk02_INFO = new MCOperationInfo("MS", "MSBDL5090", "PoSchd_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5090_PoSchd_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5090", "PoSchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("po_schd" + ".po_schd_no", "po_schd_no")
			}
			,
			MCBlockDef.create("PoSchd_Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5090_PoSchd_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5090", "PoSchd_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PoSchd_Chk02_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

