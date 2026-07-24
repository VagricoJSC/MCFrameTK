package mcframe.serverMSBA.MSBAL5100;

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
 * [MSBAL_WgRqstService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBAL5100.WgRqst_Chk01.UP.BLOCK0")){
			return MS_MSBAL5100_WgRqst_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Chk01.UP.BLOCK1")){
			return MS_MSBAL5100_WgRqst_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Chk01.DOWN.BLOCK0")){
			return MS_MSBAL5100_WgRqst_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Chk01.DOWN.BLOCK1")){
			return MS_MSBAL5100_WgRqst_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Chk01.DOWN.BLOCK2")){
			return MS_MSBAL5100_WgRqst_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Upd01.UP.BLOCK0")){
			return MS_MSBAL5100_WgRqst_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Upd01.DOWN.BLOCK0")){
			return MS_MSBAL5100_WgRqst_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Chk02.UP.BLOCK0")){
			return MS_MSBAL5100_WgRqst_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Chk02.DOWN.BLOCK0")){
			return MS_MSBAL5100_WgRqst_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Upd02.UP.BLOCK0")){
			return MS_MSBAL5100_WgRqst_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Upd02.UP.BLOCK1")){
			return MS_MSBAL5100_WgRqst_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Upd02.DOWN.BLOCK0")){
			return MS_MSBAL5100_WgRqst_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Upd02.DOWN.BLOCK1")){
			return MS_MSBAL5100_WgRqst_Upd02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Upd03.UP.BLOCK0")){
			return MS_MSBAL5100_WgRqst_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Upd04.UP.BLOCK0")){
			return MS_MSBAL5100_WgRqst_Upd04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5100.WgRqst_Upd05.UP.BLOCK0")){
			return MS_MSBAL5100_WgRqst_Upd05_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBAL5100_WgRqst_Chk01_INFO = new MCOperationInfo("MS", "MSBAL5100", "WgRqst_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBAL5100_WgRqst_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_rqst" + ".wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("wg_rqst" + ".wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("wg_rqst" + ".wg_rqst_src_typ", "wg_rqst_src_typ"),
				MCItemDef.create("wg_rqst" + ".wg_rqst_src_no", "wg_rqst_src_no"),
				MCItemDef.create("wg_rqst" + ".rqst_dt", "rqst_dt"),
				MCItemDef.create("wg_rqst" + ".rqst_fr_wg_cd", "rqst_fr_wg_cd"),
				MCItemDef.create("wg_rqst" + ".rqst_fr_dpt_cd", "rqst_fr_dpt_cd"),
				MCItemDef.create("wg_rqst" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("wg_rqst" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("wg_rqst" + ".gr_rqst_tm", "gr_rqst_tm"),
				MCItemDef.create("wg_rqst" + ".rqst_to_wg_cd", "rqst_to_wg_cd"),
				MCItemDef.create("wg_rqst" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("wg_rqst" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("wg_rqst" + ".gi_rqst_tm", "gi_rqst_tm"),
				MCItemDef.create("wg_rqst" + ".itm_cd", "itm_cd"),
				MCItemDef.create("wg_rqst" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("wg_rqst" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("wg_rqst" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_rqst" + ".itm_nm", "itm_nm"),
				MCItemDef.create("wg_rqst" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("wg_rqst" + ".sno1", "sno1"),
				MCItemDef.create("wg_rqst" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("wg_rqst" + ".sno2", "sno2"),
				MCItemDef.create("wg_rqst" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("wg_rqst" + ".sno3", "sno3"),
				MCItemDef.create("wg_rqst" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("wg_rqst" + ".sno4", "sno4"),
				MCItemDef.create("wg_rqst" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("wg_rqst" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("wg_rqst" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("wg_rqst" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("wg_rqst" + ".maker_cd", "maker_cd"),
				MCItemDef.create("wg_rqst" + ".slo_no", "slo_no"),
				MCItemDef.create("wg_rqst" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("wg_rqst" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("wg_rqst" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("wg_rqst" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("wg_rqst" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("upd_flg", "upd_flg"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("abort_can_flg", "abort_can_flg"),
				MCItemDef.create("cred_no_up_flg", "cred_no_up_flg"),
				MCItemDef.create("screen_crct_flg", "screen_crct_flg")
			}
			,
			MCBlockDef.create("WgRqst_Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBAL5100_WgRqst_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("start_peg_no", "start_peg_no")
			}
			,
			MCBlockDef.create("WgRqst_Chk01_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBAL5100_WgRqst_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("inst_po_flg", "inst_po_flg")
			}
			,
			MCBlockDef.create("WgRqst_Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBAL5100_WgRqst_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("poSchdChk01", mcframe.serverMSBD.MSBDL5090.PDef.MS_MSBDL5090_PoSchd_Upd01_DOWN_BLOCK0(), "poSchdChk01")
			}
			,
			MCBlockDef.create("WgRqst_Chk01_Dtl2")
		);
	}
	public static MCContainerDef MS_MSBAL5100_WgRqst_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("xfrSchdChk04", mcframe.serverMSBE.MSBEL5200.PDef.MS_MSBEL5200_XfrSchd_Chk04_DOWN_BLOCK0(), "xfrSchdChk04")
			}
			,
			MCBlockDef.create("WgRqst_Chk01_Dtl3")
		);
	}
	
	static final MCOperationInfo MS_MSBAL5100_WgRqst_Upd01_INFO = new MCOperationInfo("MS", "MSBAL5100", "WgRqst_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBAL5100_WgRqst_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_rqst" + ".wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("wg_rqst" + ".last_wg_rqst_no", "last_wg_rqst_no"),
				MCItemDef.create("wg_rqst" + ".wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("wg_rqst" + ".wg_rqst_src_typ", "wg_rqst_src_typ"),
				MCItemDef.create("wg_rqst" + ".wg_rqst_src_no", "wg_rqst_src_no"),
				MCItemDef.create("wg_rqst" + ".rqst_dt", "rqst_dt"),
				MCItemDef.create("wg_rqst" + ".prms_uncn_flg", "prms_uncn_flg"),
				MCItemDef.create("wg_rqst" + ".re_rqst_flg", "re_rqst_flg"),
				MCItemDef.create("wg_rqst" + ".re_rqst_dt", "re_rqst_dt"),
				MCItemDef.create("wg_rqst" + ".dlv_inst_rcpt_flg", "dlv_inst_rcpt_flg"),
				MCItemDef.create("wg_rqst" + ".rqst_fr_wg_cd", "rqst_fr_wg_cd"),
				MCItemDef.create("wg_rqst" + ".rqst_fr_dpt_cd", "rqst_fr_dpt_cd"),
				MCItemDef.create("wg_rqst" + ".rqst_fr_usr_cd", "rqst_fr_usr_cd"),
				MCItemDef.create("wg_rqst" + ".gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("wg_rqst" + ".gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("wg_rqst" + ".gr_rqst_tm", "gr_rqst_tm"),
				MCItemDef.create("wg_rqst" + ".rqst_to_wg_cd", "rqst_to_wg_cd"),
				MCItemDef.create("wg_rqst" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("wg_rqst" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("wg_rqst" + ".gi_rqst_tm", "gi_rqst_tm"),
				MCItemDef.create("wg_rqst" + ".itm_cd", "itm_cd"),
				MCItemDef.create("wg_rqst" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("wg_rqst" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("wg_rqst" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_rqst" + ".itm_nm", "itm_nm"),
				MCItemDef.create("wg_rqst" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("wg_rqst" + ".lot_no", "lot_no"),
				MCItemDef.create("wg_rqst" + ".sublot_no", "sublot_no"),
				MCItemDef.create("wg_rqst" + ".sno1", "sno1"),
				MCItemDef.create("wg_rqst" + ".sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("wg_rqst" + ".sno2", "sno2"),
				MCItemDef.create("wg_rqst" + ".sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("wg_rqst" + ".sno3", "sno3"),
				MCItemDef.create("wg_rqst" + ".sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("wg_rqst" + ".sno4", "sno4"),
				MCItemDef.create("wg_rqst" + ".sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("wg_rqst" + ".ver_no", "ver_no"),
				MCItemDef.create("wg_rqst" + ".gd_cd", "gd_cd"),
				MCItemDef.create("wg_rqst" + ".vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("wg_rqst" + ".vld_dt_to", "vld_dt_to"),
				MCItemDef.create("wg_rqst" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("wg_rqst" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("wg_rqst" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("wg_rqst" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("wg_rqst" + ".not_cmpl_qty", "not_cmpl_qty"),
				MCItemDef.create("wg_rqst" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("wg_rqst" + ".maker_cd", "maker_cd"),
				MCItemDef.create("wg_rqst" + ".io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("wg_rqst" + ".slo_no", "slo_no"),
				MCItemDef.create("wg_rqst" + ".slo_d_no", "slo_d_no"),
				MCItemDef.create("wg_rqst" + ".dlv_cd", "dlv_cd"),
				MCItemDef.create("wg_rqst" + ".dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("wg_rqst" + ".dlv_nm", "dlv_nm"),
				MCItemDef.create("wg_rqst" + ".dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("wg_rqst" + ".dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("wg_rqst" + ".dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("wg_rqst" + ".dlv_addr1", "dlv_addr1"),
				MCItemDef.create("wg_rqst" + ".dlv_addr2", "dlv_addr2"),
				MCItemDef.create("wg_rqst" + ".dlv_addr3", "dlv_addr3"),
				MCItemDef.create("wg_rqst" + ".dlv_addr4", "dlv_addr4"),
				MCItemDef.create("wg_rqst" + ".dlv_tel", "dlv_tel"),
				MCItemDef.create("wg_rqst" + ".dlv_fax", "dlv_fax"),
				MCItemDef.create("wg_rqst" + ".tdlv_cd", "tdlv_cd"),
				MCItemDef.create("wg_rqst" + ".tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("wg_rqst" + ".tdlv_nm", "tdlv_nm"),
				MCItemDef.create("wg_rqst" + ".tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("wg_rqst" + ".tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("wg_rqst" + ".tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("wg_rqst" + ".tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("wg_rqst" + ".tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("wg_rqst" + ".tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("wg_rqst" + ".tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("wg_rqst" + ".tdlv_tel", "tdlv_tel"),
				MCItemDef.create("wg_rqst" + ".tdlv_fax", "tdlv_fax"),
				MCItemDef.create("wg_rqst" + ".itm_ord_no", "itm_ord_no"),
				MCItemDef.create("wg_rqst" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("wg_rqst" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("wg_rqst" + ".purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("wg_rqst" + ".xpns_po_flg", "xpns_po_flg"),
				MCItemDef.create("wg_rqst" + ".trd_cd", "trd_cd"),
				MCItemDef.create("wg_rqst" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("wg_rqst" + ".bd_itm_cd", "bd_itm_cd"),
				MCItemDef.create("wg_rqst" + ".bd_itm_sub1", "bd_itm_sub1"),
				MCItemDef.create("wg_rqst" + ".bd_itm_sub2", "bd_itm_sub2"),
				MCItemDef.create("wg_rqst" + ".bd_itm_sub3", "bd_itm_sub3"),
				MCItemDef.create("wg_rqst" + ".bd_sno1", "bd_sno1"),
				MCItemDef.create("wg_rqst" + ".bd_sno2", "bd_sno2"),
				MCItemDef.create("wg_rqst" + ".bd_sno3", "bd_sno3"),
				MCItemDef.create("wg_rqst" + ".bd_sno4", "bd_sno4"),
				MCItemDef.create("wg_rqst" + ".bd_lot_no", "bd_lot_no"),
				MCItemDef.create("wg_rqst" + ".bd_sublot_no", "bd_sublot_no"),
				MCItemDef.create("wg_rqst" + ".bd_loc_cd", "bd_loc_cd"),
				MCItemDef.create("wg_rqst" + ".bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("wg_rqst" + ".bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("wg_rqst" + ".bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("wg_rqst" + ".bd_slo_no", "bd_slo_no"),
				MCItemDef.create("wg_rqst" + ".bd_iv_no", "bd_iv_no"),
				MCItemDef.create("wg_rqst" + ".bd_po_no", "bd_po_no"),
				MCItemDef.create("wg_rqst" + ".wg_rqst_cnt_rmrks", "wg_rqst_cnt_rmrks"),
				MCItemDef.create("wg_rqst" + ".wg_re_rqst_cnt_rmrks", "wg_re_rqst_cnt_rmrks"),
				MCItemDef.create("wg_rqst" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("wg_rqst" + ".comp_cng_flg", "comp_cng_flg"),
				MCItemDef.create("wg_rqst" + ".spec_cng_flg", "spec_cng_flg"),
				MCItemDef.create("wg_rqst" + ".sub_char1", "sub_char1"),
				MCItemDef.create("wg_rqst" + ".sub_char2", "sub_char2"),
				MCItemDef.create("wg_rqst" + ".sub_char3", "sub_char3"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("auto_prms_tgt_flg", "auto_prms_tgt_flg"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("abort_can_flg", "abort_can_flg"),
				MCItemDef.create("cred_no_up_flg", "cred_no_up_flg"),
				MCItemDef.create("screen_crct_flg", "screen_crct_flg"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt")
			}
			,
			MCBlockDef.create("WgRqst_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBAL5100_WgRqst_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_rqst" + ".wg_rqst_no", "wg_rqst_no")
			}
			,
			MCBlockDef.create("WgRqst_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBAL5100_WgRqst_Chk02_INFO = new MCOperationInfo("MS", "MSBAL5100", "WgRqst_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBAL5100_WgRqst_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Chk02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_rqst_prms_no", "wg_rqst_prms_no"),
				MCItemDef.create("wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("fix_dt", "fix_dt"),
				MCItemDef.create("prms_trd_unit_cd", "prms_trd_unit_cd"),
				MCItemDef.create("prms_trd_unit_qty", "prms_trd_unit_qty"),
				MCItemDef.create("prms_base_unit_cd", "prms_base_unit_cd"),
				MCItemDef.create("prms_base_unit_qty", "prms_base_unit_qty"),
				MCItemDef.create("gr_schd_tm", "gr_schd_tm"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_rqst_tm", "gi_rqst_tm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("last_fix_flg", "last_fix_flg"),
				MCItemDef.create("schd_cng_flg", "schd_cng_flg")
			}
			,
			MCBlockDef.create("WgRqst_Chk02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBAL5100_WgRqst_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("inst_po_flg", "inst_po_flg")
			}
			,
			MCBlockDef.create("WgRqst_Chk02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBAL5100_WgRqst_Upd02_INFO = new MCOperationInfo("MS", "MSBAL5100", "WgRqst_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBAL5100_WgRqst_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("prms_ntc_flg", "prms_ntc_flg"),
				MCItemDef.create("prms_dt", "prms_dt"),
				MCItemDef.create("re_prms_ntc_flg", "re_prms_ntc_flg"),
				MCItemDef.create("re_prms_dt", "re_prms_dt"),
				MCItemDef.create("man_prms_flg", "man_prms_flg"),
				MCItemDef.create("auto_prms_flg", "auto_prms_flg"),
				MCItemDef.create("auto_prms_tgt_flg", "auto_prms_tgt_flg")
			}
			,
			MCBlockDef.create("WgRqst_Upd02_Dtl1")
		);
	}

	public static MCContainerDef MS_MSBAL5100_WgRqst_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_rqst_prms" + ".wg_rqst_prms_no", "wg_rqst_prms_no"),
				MCItemDef.create("wg_rqst_prms" + ".wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("wg_rqst_prms" + ".wg_cd", "wg_cd"),
				MCItemDef.create("wg_rqst_prms" + ".fix_flg", "fix_flg"),
				MCItemDef.create("wg_rqst_prms" + ".fix_dt", "fix_dt"),
				MCItemDef.create("wg_rqst_prms" + ".prms_trd_unit_cd", "prms_trd_unit_cd"),
				MCItemDef.create("wg_rqst_prms" + ".prms_trd_unit_qty", "prms_trd_unit_qty"),
				MCItemDef.create("wg_rqst_prms" + ".prms_base_unit_cd", "prms_base_unit_cd"),
				MCItemDef.create("wg_rqst_prms" + ".prms_base_unit_qty", "prms_base_unit_qty"),
				MCItemDef.create("wg_rqst_prms" + ".gr_schd_tm", "gr_schd_tm"),
				MCItemDef.create("wg_rqst_prms" + ".gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("wg_rqst_prms" + ".gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("wg_rqst_prms" + ".gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("wg_rqst_prms" + ".gi_rqst_tm", "gi_rqst_tm"),
				MCItemDef.create("wg_rqst_prms" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("wg_rqst_prms" + ".maker_cd", "maker_cd"),
				MCItemDef.create("wg_rqst_prms" + ".mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("wg_rqst_prms" + ".bom_ptn", "bom_ptn"),
				MCItemDef.create("wg_rqst_prms" + ".prms_rmrks", "prms_rmrks"),
				MCItemDef.create("wg_rqst_prms" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("wg_rqst_prms" + ".sub_char1", "sub_char1"),
				MCItemDef.create("wg_rqst_prms" + ".sub_char2", "sub_char2"),
				MCItemDef.create("wg_rqst_prms" + ".sub_char3", "sub_char3"),
				MCItemDef.create("wg_rqst_prms" + ".can_flg", "can_flg"),
				MCItemDef.create("auto_prms_flg", "auto_prms_flg"),
				MCItemDef.create("cred_no_up_flg", "cred_no_up_flg"),
				MCItemDef.create("prms_ntc_flg", "prms_ntc_flg"),
				MCItemDef.create("prms_dt", "prms_dt"),
				MCItemDef.create("re_prms_ntc_flg", "re_prms_ntc_flg"),
				MCItemDef.create("re_prms_dt", "re_prms_dt"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("last_fix_flg", "last_fix_flg"),
				MCItemDef.create("schd_cng_flg", "schd_cng_flg"),
				MCItemDef.create("screen_crct_flg", "screen_crct_flg"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ")
			}
			,
			MCBlockDef.create("WgRqst_Upd02_Dtl2")
		);
	}


	public static MCContainerDef MS_MSBAL5100_WgRqst_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("WgRqst_Upd02_Dtl1")
		);
	}
	public static MCContainerDef MS_MSBAL5100_WgRqst_Upd02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_rqst_prms" + ".wg_rqst_prms_no", "wg_rqst_prms_no")
			}
			,
			MCBlockDef.create("WgRqst_Upd02_Dtl2")
		);
	}
	
	static final MCOperationInfo MS_MSBAL5100_WgRqst_Upd03_INFO = new MCOperationInfo("MS", "MSBAL5100", "WgRqst_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBAL5100_WgRqst_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Upd03",
			new MCItemDef[]{
				MCItemDef.create("wg_rqst_prms_no", "wg_rqst_prms_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("wg_rqst_no", "wg_rqst_no")
			}
			,
			MCBlockDef.create("WgRqst_Upd03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBAL5100_WgRqst_Upd04_INFO = new MCOperationInfo("MS", "MSBAL5100", "WgRqst_Upd04", "000000", new PDef());

	public static MCContainerDef MS_MSBAL5100_WgRqst_Upd04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Upd04",
			new MCItemDef[]{
				MCItemDef.create("wg_rqst_no", "wg_rqst_no"),
				MCItemDef.create("re_rqst_flg", "re_rqst_flg"),
				MCItemDef.create("re_rqst_dt", "re_rqst_dt"),
				MCItemDef.create("wg_re_rqst_cnt_rmrks", "wg_re_rqst_cnt_rmrks"),
				MCItemDef.create("prms_uncn_flg", "prms_uncn_flg"),
				MCItemDef.create("dlv_inst_rcpt_flg", "dlv_inst_rcpt_flg")
			}
			,
			MCBlockDef.create("WgRqst_Upd04_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBAL5100_WgRqst_Upd05_INFO = new MCOperationInfo("MS", "MSBAL5100", "WgRqst_Upd05", "000000", new PDef());

	public static MCContainerDef MS_MSBAL5100_WgRqst_Upd05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5100", "WgRqst_Upd05",
			new MCItemDef[]{
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("auto_prms_flg", "auto_prms_flg")
			}
			,
			MCBlockDef.create("WgRqst_Upd05_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

