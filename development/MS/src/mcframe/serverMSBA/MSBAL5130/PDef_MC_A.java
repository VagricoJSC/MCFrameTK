package mcframe.serverMSBA.MSBAL5130;

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
 * [MSBAL_ShipDmndRqstService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBAL5130.ShipDmndRqst_Chk01.UP.BLOCK0")){
			return MS_MSBAL5130_ShipDmndRqst_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5130.ShipDmndRqst_Chk01.DOWN.BLOCK0")){
			return MS_MSBAL5130_ShipDmndRqst_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5130.ShipDmndRqst_Upd01.UP.BLOCK0")){
			return MS_MSBAL5130_ShipDmndRqst_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5130.ShipDmndRqst_Upd01.DOWN.BLOCK0")){
			return MS_MSBAL5130_ShipDmndRqst_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5130.ShipDmndRqst_Upd02.UP.BLOCK0")){
			return MS_MSBAL5130_ShipDmndRqst_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL5130.ShipDmndRqst_Upd02.DOWN.BLOCK0")){
			return MS_MSBAL5130_ShipDmndRqst_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBAL5130_ShipDmndRqst_Chk01_INFO = new MCOperationInfo("MS", "MSBAL5130", "ShipDmndRqst_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBAL5130_ShipDmndRqst_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5130", "ShipDmndRqst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("wg_rqst_src_typ", "wg_rqst_src_typ"),
				MCItemDef.create("wg_rqst_src_no", "wg_rqst_src_no"),
				MCItemDef.create("rqst_dt", "rqst_dt"),
				MCItemDef.create("rqst_fr_wg_cd", "rqst_fr_wg_cd"),
				MCItemDef.create("rqst_fr_dpt_cd", "rqst_fr_dpt_cd"),
				MCItemDef.create("rqst_fr_usr_cd", "rqst_fr_usr_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_rqst_tm", "gr_rqst_tm"),
				MCItemDef.create("rqst_to_wg_cd", "rqst_to_wg_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_rqst_tm", "gi_rqst_tm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
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
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("upd_flg", "upd_flg"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("abort_can_flg", "abort_can_flg"),
				MCItemDef.create("cred_no_up_flg", "cred_no_up_flg")
			}
			,
			MCBlockDef.create("ShipDmndRqst_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBAL5130_ShipDmndRqst_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5130", "ShipDmndRqst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("inst_po_flg", "inst_po_flg")
			}
			,
			MCBlockDef.create("ShipDmndRqst_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBAL5130_ShipDmndRqst_Upd01_INFO = new MCOperationInfo("MS", "MSBAL5130", "ShipDmndRqst_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBAL5130_ShipDmndRqst_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5130", "ShipDmndRqst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("wg_rqst_src_typ", "wg_rqst_src_typ"),
				MCItemDef.create("wg_rqst_src_no", "wg_rqst_src_no"),
				MCItemDef.create("rqst_dt", "rqst_dt"),
				MCItemDef.create("rqst_fr_wg_cd", "rqst_fr_wg_cd"),
				MCItemDef.create("rqst_fr_dpt_cd", "rqst_fr_dpt_cd"),
				MCItemDef.create("rqst_fr_usr_cd", "rqst_fr_usr_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_rqst_tm", "gr_rqst_tm"),
				MCItemDef.create("rqst_to_wg_cd", "rqst_to_wg_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_rqst_tm", "gi_rqst_tm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
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
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("xpns_po_flg", "xpns_po_flg"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("wg_rqst_cnt_rmrks", "wg_rqst_cnt_rmrks"),
				MCItemDef.create("comp_cng_flg", "comp_cng_flg"),
				MCItemDef.create("spec_cng_flg", "spec_cng_flg"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("abort_can_flg", "abort_can_flg"),
				MCItemDef.create("cred_no_up_flg", "cred_no_up_flg"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("uplnd_outsrc_flg", "uplnd_outsrc_flg"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ")
			}
			,
			MCBlockDef.create("ShipDmndRqst_Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBAL5130_ShipDmndRqst_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5130", "ShipDmndRqst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("rqst_to_wg_cd", "rqst_to_wg_cd"),
				MCItemDef.create("gi_loc_wg_cd", "gi_loc_wg_cd"),
				MCItemDef.create("gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no"),
				MCItemDef.create("wg_rqst_no", "wg_rqst_no")
			}
			,
			MCBlockDef.create("ShipDmndRqst_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBAL5130_ShipDmndRqst_Upd02_INFO = new MCOperationInfo("MS", "MSBAL5130", "ShipDmndRqst_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBAL5130_ShipDmndRqst_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5130", "ShipDmndRqst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("wg_rqst_src_typ", "wg_rqst_src_typ"),
				MCItemDef.create("wg_rqst_src_no", "wg_rqst_src_no"),
				MCItemDef.create("rqst_dt", "rqst_dt"),
				MCItemDef.create("rqst_fr_wg_cd", "rqst_fr_wg_cd"),
				MCItemDef.create("rqst_fr_dpt_cd", "rqst_fr_dpt_cd"),
				MCItemDef.create("rqst_fr_usr_cd", "rqst_fr_usr_cd"),
				MCItemDef.create("gr_loc_cd", "gr_loc_cd"),
				MCItemDef.create("gr_str_ln_cd", "gr_str_ln_cd"),
				MCItemDef.create("gr_rqst_tm", "gr_rqst_tm"),
				MCItemDef.create("rqst_to_wg_cd", "rqst_to_wg_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("gi_rqst_tm", "gi_rqst_tm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno1_null_flg", "sno1_null_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno2_null_flg", "sno2_null_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno3_null_flg", "sno3_null_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno4_null_flg", "sno4_null_flg"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("vld_dt_fr", "vld_dt_fr"),
				MCItemDef.create("vld_dt_to", "vld_dt_to"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
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
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("itm_ord_no", "itm_ord_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("purc_rsn_cd", "purc_rsn_cd"),
				MCItemDef.create("xpns_po_flg", "xpns_po_flg"),
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
				MCItemDef.create("bd_ctg_cd", "bd_ctg_cd"),
				MCItemDef.create("bd_oper_cd", "bd_oper_cd"),
				MCItemDef.create("bd_slo_no", "bd_slo_no"),
				MCItemDef.create("bd_iv_no", "bd_iv_no"),
				MCItemDef.create("bd_po_no", "bd_po_no"),
				MCItemDef.create("wg_rqst_cnt_rmrks", "wg_rqst_cnt_rmrks"),
				MCItemDef.create("comp_cng_flg", "comp_cng_flg"),
				MCItemDef.create("spec_cng_flg", "spec_cng_flg"),
				MCItemDef.create("cred_no_up_flg", "cred_no_up_flg"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("mfg_st_schd_dt", "mfg_st_schd_dt"),
				MCItemDef.create("mfg_end_schd_dt", "mfg_end_schd_dt"),
				MCItemDef.create("gi_schd_dt", "gi_schd_dt"),
				MCItemDef.create("strg_schd_dt", "strg_schd_dt"),
				MCItemDef.create("accpt_schd_dt", "accpt_schd_dt"),
				MCItemDef.create("insp_st_schd_dt", "insp_st_schd_dt"),
				MCItemDef.create("insp_end_schd_dt", "insp_end_schd_dt"),
				MCItemDef.create("avl_schd_dt", "avl_schd_dt"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("wg_rqst_prms_no", "wg_rqst_prms_no"),
				MCItemDef.create("uplnd_outsrc_flg", "uplnd_outsrc_flg"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ")
			}
			,
			MCBlockDef.create("ShipDmndRqst_Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBAL5130_ShipDmndRqst_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBAL5130", "ShipDmndRqst_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("wg_rqst_typ", "wg_rqst_typ"),
				MCItemDef.create("rqst_to_wg_cd", "rqst_to_wg_cd"),
				MCItemDef.create("gi_loc_wg_cd", "gi_loc_wg_cd"),
				MCItemDef.create("gi_lg_grp_cd", "gi_lg_grp_cd"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("po_schd_no", "po_schd_no"),
				MCItemDef.create("xfr_schd_no", "xfr_schd_no")
			}
			,
			MCBlockDef.create("ShipDmndRqst_Upd02_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

