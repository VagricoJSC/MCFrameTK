package mcframe.serverMSBB.MSBBL1380;

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
 * [MSBBL_SlsDscntReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL1380.Srch01.UP.BLOCK0")){
			return MS_MSBBL1380_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1380.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL1380_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1380.Srch01.DOWN.BLOCK1")){
			return MS_MSBBL1380_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1380.Srch02.UP.BLOCK0")){
			return MS_MSBBL1380_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1380.Srch02.DOWN.BLOCK0")){
			return MS_MSBBL1380_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1380.Srch02.DOWN.BLOCK1")){
			return MS_MSBBL1380_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1380.Ins01.UP.BLOCK0")){
			return MS_MSBBL1380_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1380.Ins01.UP.BLOCK1")){
			return MS_MSBBL1380_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1380.Ins01.DOWN.BLOCK0")){
			return MS_MSBBL1380_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1380.Upd01.UP.BLOCK0")){
			return MS_MSBBL1380_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1380.Upd01.UP.BLOCK1")){
			return MS_MSBBL1380_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1380.Upd01.DOWN.BLOCK0")){
			return MS_MSBBL1380_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1380.Del01.UP.BLOCK0")){
			return MS_MSBBL1380_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1380.Del01.DOWN.BLOCK0")){
			return MS_MSBBL1380_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1380.Prnt01.UP.BLOCK0")){
			return MS_MSBBL1380_Prnt01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBBL1380_Srch01_INFO = new MCOperationInfo("MS", "MSBBL1380", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1380_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("srch_tgt_no", "srch_tgt_no"),
				MCItemDef.create("srch_tgt_rev", "srch_tgt_rev"),
				MCItemDef.create("latest_flg", "latest_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1380_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("sls_dt", "sls_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("sls_slip_prnted_flg", "sls_slip_prnted_flg"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_ret_flg", "aprv_ret_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("aprv_upd_flg", "aprv_upd_flg"),
				MCItemDef.create("aprv_can_flg", "aprv_can_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cred_bal", "cred_bal"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("cst_usr_cd", "cst_usr_cd"),
				MCItemDef.create("cst_dpt_cd", "cst_dpt_cd"),
				MCItemDef.create("ar_dpt_typ", "ar_dpt_typ"),
				MCItemDef.create("cst_bill_crryovr_times", "cst_bill_crryovr_times"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1380_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("sls_act_d_seq", "sls_act_d_seq"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ref_sls_act_no", "ref_sls_act_no"),
				MCItemDef.create("ref_sls_act_rev", "ref_sls_act_rev"),
				MCItemDef.create("ref_sls_act_seq", "ref_sls_act_seq"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("ref_sls_act_d_seq", "ref_sls_act_d_seq"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("ref_ac_dt", "ref_ac_dt"),
				MCItemDef.create("ref_trd_unit_qty", "ref_trd_unit_qty"),
				MCItemDef.create("ref_trd_unit_cd", "ref_trd_unit_cd"),
				MCItemDef.create("ref_trd_unit_nm", "ref_trd_unit_nm"),
				MCItemDef.create("ref_trd_unit_dec_place", "ref_trd_unit_dec_place"),
				MCItemDef.create("ref_trd_cur_upri", "ref_trd_cur_upri"),
				MCItemDef.create("ref_trd_cur_amt", "ref_trd_cur_amt"),
				MCItemDef.create("ref_trd_cur_inc_tax_amt", "ref_trd_cur_inc_tax_amt"),
				MCItemDef.create("ref_tax_cd", "ref_tax_cd"),
				MCItemDef.create("ref_tax_nm", "ref_tax_nm"),
				MCItemDef.create("ref_tax_rate", "ref_tax_rate"),
				MCItemDef.create("ref_trd_cur_tax_amt", "ref_trd_cur_tax_amt"),
				MCItemDef.create("ref_base_cur_upri", "ref_base_cur_upri"),
				MCItemDef.create("ref_base_cur_amt", "ref_base_cur_amt"),
				MCItemDef.create("ref_base_cur_inc_tax_amt", "ref_base_cur_inc_tax_amt"),
				MCItemDef.create("ref_base_cur_tax_amt", "ref_base_cur_tax_amt"),
				MCItemDef.create("ref_ptax_cur_upri", "ref_ptax_cur_upri"),
				MCItemDef.create("ref_ptax_cur_amt", "ref_ptax_cur_amt"),
				MCItemDef.create("ref_ptax_cur_inc_tax_amt", "ref_ptax_cur_inc_tax_amt"),
				MCItemDef.create("ref_ptax_cur_tax_amt", "ref_ptax_cur_tax_amt"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_bill_crryovr_times", "itm_bill_crryovr_times")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1380_Srch02_INFO = new MCOperationInfo("MS", "MSBBL1380", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1380_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("srch_tgt_no", "srch_tgt_no")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1380_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cred_bal", "cred_bal"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("cst_usr_cd", "cst_usr_cd"),
				MCItemDef.create("cst_dpt_cd", "cst_dpt_cd"),
				MCItemDef.create("ar_dpt_typ", "ar_dpt_typ"),
				MCItemDef.create("cst_bill_crryovr_times", "cst_bill_crryovr_times"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ")
			}
			,
			MCBlockDef.create("Srch02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1380_Srch02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ref_sls_act_no", "ref_sls_act_no"),
				MCItemDef.create("ref_sls_act_rev", "ref_sls_act_rev"),
				MCItemDef.create("ref_sls_act_seq", "ref_sls_act_seq"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("ref_sls_act_d_seq", "ref_sls_act_d_seq"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("ref_ac_dt", "ref_ac_dt"),
				MCItemDef.create("ref_trd_unit_qty", "ref_trd_unit_qty"),
				MCItemDef.create("ref_trd_unit_cd", "ref_trd_unit_cd"),
				MCItemDef.create("ref_trd_unit_nm", "ref_trd_unit_nm"),
				MCItemDef.create("ref_trd_cur_upri", "ref_trd_cur_upri"),
				MCItemDef.create("ref_trd_unit_dec_place", "ref_trd_unit_dec_place"),
				MCItemDef.create("ref_trd_cur_amt", "ref_trd_cur_amt"),
				MCItemDef.create("ref_trd_cur_inc_tax_amt", "ref_trd_cur_inc_tax_amt"),
				MCItemDef.create("ref_tax_cd", "ref_tax_cd"),
				MCItemDef.create("ref_tax_nm", "ref_tax_nm"),
				MCItemDef.create("ref_tax_rate", "ref_tax_rate"),
				MCItemDef.create("ref_trd_cur_tax_amt", "ref_trd_cur_tax_amt"),
				MCItemDef.create("ref_base_cur_upri", "ref_base_cur_upri"),
				MCItemDef.create("ref_base_cur_amt", "ref_base_cur_amt"),
				MCItemDef.create("ref_base_cur_inc_tax_amt", "ref_base_cur_inc_tax_amt"),
				MCItemDef.create("ref_base_cur_tax_amt", "ref_base_cur_tax_amt"),
				MCItemDef.create("ref_ptax_cur_upri", "ref_ptax_cur_upri"),
				MCItemDef.create("ref_ptax_cur_amt", "ref_ptax_cur_amt"),
				MCItemDef.create("ref_ptax_cur_inc_tax_amt", "ref_ptax_cur_inc_tax_amt"),
				MCItemDef.create("ref_ptax_cur_tax_amt", "ref_ptax_cur_tax_amt"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("itm_bill_crryovr_times", "itm_bill_crryovr_times")
			}
			,
			MCBlockDef.create("Srch02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1380_Ins01_INFO = new MCOperationInfo("MS", "MSBBL1380", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1380_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dt", "sls_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL1380_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("sls_act_d_seq", "sls_act_d_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ref_sls_act_no", "ref_sls_act_no"),
				MCItemDef.create("ref_sls_act_seq", "ref_sls_act_seq"),
				MCItemDef.create("ref_sls_act_rev", "ref_sls_act_rev"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("ref_sls_act_d_seq", "ref_sls_act_d_seq"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1380_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("cred_bal", "cred_bal"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1380_Upd01_INFO = new MCOperationInfo("MS", "MSBBL1380", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1380_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dt", "sls_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("aprv_ret_flg", "aprv_ret_flg"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL1380_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("sls_act_d_seq", "sls_act_d_seq"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ref_sls_act_no", "ref_sls_act_no"),
				MCItemDef.create("ref_sls_act_seq", "ref_sls_act_seq"),
				MCItemDef.create("ref_sls_act_rev", "ref_sls_act_rev"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("ref_sls_act_d_seq", "ref_sls_act_d_seq"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1380_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("cred_bal", "cred_bal"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1380_Del01_INFO = new MCOperationInfo("MS", "MSBBL1380", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1380_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Del01",
			new MCItemDef[]{
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}


	public static MCContainerDef MS_MSBBL1380_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Del01",
			new MCItemDef[]{
				MCItemDef.create("cred_bal", "cred_bal")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1380_Prnt01_INFO = new MCOperationInfo("MS", "MSBBL1380", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1380_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1380", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq")
			}
			,
			MCBlockDef.create("Prnt01_Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

