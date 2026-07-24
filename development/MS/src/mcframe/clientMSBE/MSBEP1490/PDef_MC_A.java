package mcframe.clientMSBE.MSBEP1490;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBEP_DlvSlipSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1490.Srch01.UP.BLOCK0")){
			return MS_MSBEL1490_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1490.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1490_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBEL1490_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1490", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1490_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1490", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("ship_dt_p" + ".ymd_fr", "ship_dt_fr"),
				MCItemDef.create("ship_dt_p" + ".hm_fr", "ship_hm_fr"),
				MCItemDef.create("ship_dt_p" + ".ymd_to", "ship_dt_to"),
				MCItemDef.create("ship_dt_p" + ".hm_to", "ship_hm_to"),
				MCItemDef.create("dlv_rqst_dt_p" + ".ymd_fr", "dlv_rqst_dt_fr"),
				MCItemDef.create("dlv_rqst_dt_p" + ".hm_fr", "dlv_rqst_hm_fr"),
				MCItemDef.create("dlv_rqst_dt_p" + ".ymd_to", "dlv_rqst_dt_to"),
				MCItemDef.create("dlv_rqst_dt_p" + ".hm_to", "dlv_rqst_hm_to"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("dlv_slip_inst_no", "dlv_slip_inst_no"),
				MCItemDef.create("dlv_slip_act_no", "dlv_slip_act_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("inc_past_flg", "inc_past_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1490_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBEL1490", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("dlv_slip_inst_no", "dlv_slip_inst_no"),
				MCItemDef.create("dlv_slip_act_no", "dlv_slip_act_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_rev", "po_rev"),
				MCItemDef.create("last_po_rev", "last_po_rev"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("ship_dt_p" + ".ymd", "ship_dt"),
				MCItemDef.create("ship_dt_p" + ".hm", "ship_hm"),
				MCItemDef.create("dlv_rqst_dt_p" + ".ymd", "dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_dt_p" + ".hm", "dlv_rqst_hm"),
				MCItemDef.create("dlv_dt_p" + ".ymd", "dlv_dt"),
				MCItemDef.create("dlv_dt_p" + ".hm", "dlv_hm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("trd_ptn_typ_nm", "trd_ptn_typ_nm"),
				MCItemDef.create("tax_calc_typ", "tax_calc_typ"),
				MCItemDef.create("tax_calc_typ_nm", "tax_calc_typ_nm"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt_p" + ".amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_tax_amt_p" + ".amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt_p" + ".amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt_p" + ".amt", "base_cur_dscnt_amt"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("arr_loc_cd", "arr_loc_cd"),
				MCItemDef.create("arr_loc_nm", "arr_loc_nm"),
				MCItemDef.create("sppl_id_typ", "sppl_id_typ"),
				MCItemDef.create("sppl_id_typ_nm", "sppl_id_typ_nm"),
				MCItemDef.create("sppl_id_cd", "sppl_id_cd"),
				MCItemDef.create("sppl_id_nm", "sppl_id_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("sls_basis_typ_nm", "sls_basis_typ_nm"),
				MCItemDef.create("slip_prnt_flg", "slip_prnt_flg"),
				MCItemDef.create("sls_prnt_flg", "sls_prnt_flg"),
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
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

