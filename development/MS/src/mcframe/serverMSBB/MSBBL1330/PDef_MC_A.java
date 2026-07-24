package mcframe.serverMSBB.MSBBL1330;

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
 * [MSBBL_SlsRetSchdReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL1330.Srch01.UP.BLOCK0")){
			return MS_MSBBL1330_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL1330_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Srch01.DOWN.BLOCK1")){
			return MS_MSBBL1330_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1330.Srch01.DOWN.BLOCK2")){
			return MS_MSBBL1330_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1330.Srch03.UP.BLOCK0")){
			return MS_MSBBL1330_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Srch03.DOWN.BLOCK0")){
			return MS_MSBBL1330_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Srch03.DOWN.BLOCK1")){
			return MS_MSBBL1330_Srch03_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1330.Srch03.DOWN.BLOCK2")){
			return MS_MSBBL1330_Srch03_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1330.Srch04.UP.BLOCK0")){
			return MS_MSBBL1330_Srch04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Srch04.DOWN.BLOCK0")){
			return MS_MSBBL1330_Srch04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Srch04.DOWN.BLOCK1")){
			return MS_MSBBL1330_Srch04_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1330.Srch04.DOWN.BLOCK2")){
			return MS_MSBBL1330_Srch04_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1330.Chk01.UP.BLOCK0")){
			return MS_MSBBL1330_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Chk01.UP.BLOCK1")){
			return MS_MSBBL1330_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1330.Chk01.UP.BLOCK2")){
			return MS_MSBBL1330_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1330.Chk01.DOWN.BLOCK0")){
			return MS_MSBBL1330_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Chk01.DOWN.BLOCK1")){
			return MS_MSBBL1330_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1330.Chk01.DOWN.BLOCK2")){
			return MS_MSBBL1330_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1330.Ins01.UP.BLOCK0")){
			return MS_MSBBL1330_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Ins01.UP.BLOCK1")){
			return MS_MSBBL1330_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1330.Ins01.UP.BLOCK2")){
			return MS_MSBBL1330_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1330.Ins01.DOWN.BLOCK0")){
			return MS_MSBBL1330_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Ins01.DOWN.BLOCK1")){
			return MS_MSBBL1330_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1330.Ins01.DOWN.BLOCK2")){
			return MS_MSBBL1330_Ins01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1330.Chk02.UP.BLOCK0")){
			return MS_MSBBL1330_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Chk02.UP.BLOCK1")){
			return MS_MSBBL1330_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1330.Chk02.UP.BLOCK2")){
			return MS_MSBBL1330_Chk02_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1330.Chk02.DOWN.BLOCK0")){
			return MS_MSBBL1330_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Chk02.DOWN.BLOCK1")){
			return MS_MSBBL1330_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1330.Chk02.DOWN.BLOCK2")){
			return MS_MSBBL1330_Chk02_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1330.Upd01.UP.BLOCK0")){
			return MS_MSBBL1330_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Upd01.UP.BLOCK1")){
			return MS_MSBBL1330_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1330.Upd01.UP.BLOCK2")){
			return MS_MSBBL1330_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1330.Upd01.DOWN.BLOCK0")){
			return MS_MSBBL1330_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Upd01.DOWN.BLOCK1")){
			return MS_MSBBL1330_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1330.Upd01.DOWN.BLOCK2")){
			return MS_MSBBL1330_Upd01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1330.Del01.UP.BLOCK0")){
			return MS_MSBBL1330_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Del01.UP.BLOCK1")){
			return MS_MSBBL1330_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1330.Del01.UP.BLOCK2")){
			return MS_MSBBL1330_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1330.Sprt01.UP.BLOCK0")){
			return MS_MSBBL1330_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1330.Sprt01.DOWN.BLOCK0")){
			return MS_MSBBL1330_Sprt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MS_MSBBL1330_Srch01_INFO = new MCOperationInfo("MS", "MSBBL1330", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1330_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("screen_ope", "screen_ope"),
				MCItemDef.create("srch_tgt_typ", "srch_tgt_typ"),
				MCItemDef.create("srch_tgt_no", "srch_tgt_no")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1330_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("sls_ret_schd_dt", "sls_ret_schd_dt"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("cst_usr_cd", "cst_usr_cd"),
				MCItemDef.create("cst_dpt_cd", "cst_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("prof_rate", "prof_rate"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("ttl_amt", "ttl_amt"),
				MCItemDef.create("ttl_amt_no_cost", "ttl_amt_no_cost"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_upri_rnd_typ", "sls_upri_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("sls_upri_cng_flg", "sls_upri_cng_flg"),
				MCItemDef.create("ar_dpt_typ", "ar_dpt_typ"),
				MCItemDef.create("cst_bill_crryovr_times", "cst_bill_crryovr_times"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("lnk_ar_dpt_cd", "lnk_ar_dpt_cd"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sret_schd_sts_typ", "sret_schd_sts_typ"),
				MCItemDef.create("sret_schd_sts_typ_nm", "sret_schd_sts_typ_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("cntry_nm", "cntry_nm"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("arr_qty", "arr_qty"),
				MCItemDef.create("sls_ret_qty", "sls_ret_qty"),
				MCItemDef.create("arr_cmpl_flg", "arr_cmpl_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("cost_amt", "cost_amt"),
				MCItemDef.create("prof_rate", "prof_rate"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("cnsgn_gd_nm", "cnsgn_gd_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_loc_nm", "cnsgn_loc_nm"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("cnsgn_str_ln_nm", "cnsgn_str_ln_nm"),
				MCItemDef.create("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ref_dlv_slip_no", "ref_dlv_slip_no"),
				MCItemDef.create("ref_dlv_slip_d_no", "ref_dlv_slip_d_no"),
				MCItemDef.create("ref_sls_act_no", "ref_sls_act_no"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("cnsgn_str_ln_tgt_flg", "cnsgn_str_ln_tgt_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("cnsgn_site_cd", "cnsgn_site_cd"),
				MCItemDef.create("ref_sls_act_seq", "ref_sls_act_seq"),
				MCItemDef.create("ref_sls_act_d_seq", "ref_sls_act_d_seq"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dtl_row_id", "dtl_row_id"),
				MCItemDef.create("itm_sls_upri_cng_flg", "itm_sls_upri_cng_flg"),
				MCItemDef.create("itm_bill_crryovr_times", "itm_bill_crryovr_times"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("init_schd_qty", "init_schd_qty"),
				MCItemDef.create("init_schd_dscnt_amt", "init_schd_dscnt_amt"),
				MCItemDef.create("init_schd_amt", "init_schd_amt"),
				MCItemDef.create("schd_trd_unit_conv_base_qty", "schd_trd_unit_conv_base_qty"),
				MCItemDef.create("schd_trd_unit_conv_qty", "schd_trd_unit_conv_qty")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg"),
				MCItemDef.create("arr_qty", "arr_qty"),
				MCItemDef.create("sls_ret_qty", "sls_ret_qty"),
				MCItemDef.create("abort_qty", "abort_qty"),
				MCItemDef.create("sls_ret_schd_abort_qty", "sls_ret_schd_abort_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("cnsgn_gd_nm", "cnsgn_gd_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_loc_nm", "cnsgn_loc_nm"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("cnsgn_str_ln_nm", "cnsgn_str_ln_nm"),
				MCItemDef.create("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("cnsgn_str_ln_tgt_flg", "cnsgn_str_ln_tgt_flg"),
				MCItemDef.create("ref_dlv_slip_d_no", "ref_dlv_slip_d_no"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Srch01_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1330_Srch03_INFO = new MCOperationInfo("MS", "MSBBL1330", "Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1330_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("screen_ope", "screen_ope"),
				MCItemDef.create("srch_tgt_no", "srch_tgt_no")
			}
			,
			MCBlockDef.create("Srch03_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1330_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("sls_ret_schd_dt", "sls_ret_schd_dt"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("cst_usr_cd", "cst_usr_cd"),
				MCItemDef.create("cst_dpt_cd", "cst_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("prof_rate", "prof_rate"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("ttl_amt", "ttl_amt"),
				MCItemDef.create("ttl_amt_no_cost", "ttl_amt_no_cost"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_upri_rnd_typ", "sls_upri_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("sls_upri_cng_flg", "sls_upri_cng_flg"),
				MCItemDef.create("ar_dpt_typ", "ar_dpt_typ"),
				MCItemDef.create("cst_bill_crryovr_times", "cst_bill_crryovr_times"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("lnk_ar_dpt_cd", "lnk_ar_dpt_cd"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch03_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Srch03_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sret_schd_sts_typ", "sret_schd_sts_typ"),
				MCItemDef.create("sret_schd_sts_typ_nm", "sret_schd_sts_typ_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("cntry_nm", "cntry_nm"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("arr_qty", "arr_qty"),
				MCItemDef.create("sls_ret_qty", "sls_ret_qty"),
				MCItemDef.create("arr_cmpl_flg", "arr_cmpl_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("cost_amt", "cost_amt"),
				MCItemDef.create("prof_rate", "prof_rate"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("cnsgn_gd_nm", "cnsgn_gd_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_loc_nm", "cnsgn_loc_nm"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("cnsgn_str_ln_nm", "cnsgn_str_ln_nm"),
				MCItemDef.create("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ref_dlv_slip_no", "ref_dlv_slip_no"),
				MCItemDef.create("ref_dlv_slip_d_no", "ref_dlv_slip_d_no"),
				MCItemDef.create("ref_sls_act_no", "ref_sls_act_no"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("cnsgn_str_ln_tgt_flg", "cnsgn_str_ln_tgt_flg"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("cnsgn_site_cd", "cnsgn_site_cd"),
				MCItemDef.create("ref_sls_act_seq", "ref_sls_act_seq"),
				MCItemDef.create("ref_sls_act_d_seq", "ref_sls_act_d_seq"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dtl_row_id", "dtl_row_id"),
				MCItemDef.create("itm_sls_upri_cng_flg", "itm_sls_upri_cng_flg"),
				MCItemDef.create("itm_bill_crryovr_times", "itm_bill_crryovr_times"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("init_schd_qty", "init_schd_qty"),
				MCItemDef.create("init_schd_dscnt_amt", "init_schd_dscnt_amt"),
				MCItemDef.create("init_schd_amt", "init_schd_amt"),
				MCItemDef.create("schd_trd_unit_conv_base_qty", "schd_trd_unit_conv_base_qty"),
				MCItemDef.create("schd_trd_unit_conv_qty", "schd_trd_unit_conv_qty")
			}
			,
			MCBlockDef.create("Srch03_Dtl")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Srch03_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg"),
				MCItemDef.create("arr_qty", "arr_qty"),
				MCItemDef.create("sls_ret_qty", "sls_ret_qty"),
				MCItemDef.create("abort_qty", "abort_qty"),
				MCItemDef.create("sls_ret_schd_abort_qty", "sls_ret_schd_abort_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("cnsgn_gd_nm", "cnsgn_gd_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_loc_nm", "cnsgn_loc_nm"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("cnsgn_str_ln_nm", "cnsgn_str_ln_nm"),
				MCItemDef.create("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("cnsgn_str_ln_tgt_flg", "cnsgn_str_ln_tgt_flg"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Srch03_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1330_Srch04_INFO = new MCOperationInfo("MS", "MSBBL1330", "Srch04", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1330_Srch04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("screen_ope", "screen_ope"),
				MCItemDef.create("srch_tgt_no", "srch_tgt_no")
			}
			,
			MCBlockDef.create("Srch04_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1330_Srch04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("sls_ret_schd_dt", "sls_ret_schd_dt"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("cst_usr_cd", "cst_usr_cd"),
				MCItemDef.create("cst_dpt_cd", "cst_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_nm", "ptax_cur_nm"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("prof_rate", "prof_rate"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("ttl_amt", "ttl_amt"),
				MCItemDef.create("ttl_amt_no_cost", "ttl_amt_no_cost"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_nm1", "tterm_nm1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_nm2", "tterm_nm2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_nm3", "tterm_nm3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_upri_rnd_typ", "sls_upri_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("sls_upri_cng_flg", "sls_upri_cng_flg"),
				MCItemDef.create("ar_dpt_typ", "ar_dpt_typ"),
				MCItemDef.create("cst_bill_crryovr_times", "cst_bill_crryovr_times"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place"),
				MCItemDef.create("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("lnk_ar_dpt_cd", "lnk_ar_dpt_cd"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Srch04_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Srch04_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sret_schd_sts_typ", "sret_schd_sts_typ"),
				MCItemDef.create("sret_schd_sts_typ_nm", "sret_schd_sts_typ_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("cntry_nm", "cntry_nm"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("arr_qty", "arr_qty"),
				MCItemDef.create("sls_ret_qty", "sls_ret_qty"),
				MCItemDef.create("arr_cmpl_flg", "arr_cmpl_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("dscnt_rsn_nm", "dscnt_rsn_nm"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("cost_amt", "cost_amt"),
				MCItemDef.create("prof_rate", "prof_rate"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("ptax_cur_upri", "ptax_cur_upri"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_inc_tax_amt", "ptax_cur_inc_tax_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("cnsgn_gd_nm", "cnsgn_gd_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_loc_nm", "cnsgn_loc_nm"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("cnsgn_str_ln_nm", "cnsgn_str_ln_nm"),
				MCItemDef.create("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("ret_rsn_nm", "ret_rsn_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ref_dlv_slip_no", "ref_dlv_slip_no"),
				MCItemDef.create("ref_dlv_slip_d_no", "ref_dlv_slip_d_no"),
				MCItemDef.create("ref_sls_act_no", "ref_sls_act_no"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("cnsgn_str_ln_tgt_flg", "cnsgn_str_ln_tgt_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("cnsgn_site_cd", "cnsgn_site_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("ref_sls_act_seq", "ref_sls_act_seq"),
				MCItemDef.create("ref_sls_act_d_seq", "ref_sls_act_d_seq"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("sls_acxfr_flg", "sls_acxfr_flg"),
				MCItemDef.create("dtl_row_id", "dtl_row_id"),
				MCItemDef.create("itm_sls_upri_cng_flg", "itm_sls_upri_cng_flg"),
				MCItemDef.create("itm_bill_crryovr_times", "itm_bill_crryovr_times"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("init_schd_qty", "init_schd_qty"),
				MCItemDef.create("init_schd_dscnt_amt", "init_schd_dscnt_amt"),
				MCItemDef.create("init_schd_amt", "init_schd_amt"),
				MCItemDef.create("schd_trd_unit_conv_base_qty", "schd_trd_unit_conv_base_qty"),
				MCItemDef.create("schd_trd_unit_conv_qty", "schd_trd_unit_conv_qty")
			}
			,
			MCBlockDef.create("Srch04_Dtl")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Srch04_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg"),
				MCItemDef.create("arr_qty", "arr_qty"),
				MCItemDef.create("sls_ret_qty", "sls_ret_qty"),
				MCItemDef.create("abort_qty", "abort_qty"),
				MCItemDef.create("sls_ret_schd_abort_qty", "sls_ret_schd_abort_qty"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("cnsgn_gd_nm", "cnsgn_gd_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_loc_nm", "cnsgn_loc_nm"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("cnsgn_str_ln_nm", "cnsgn_str_ln_nm"),
				MCItemDef.create("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("trd_unit_rnd_typ", "trd_unit_rnd_typ"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("lot_no_typ", "lot_no_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("sublot_no_typ", "sublot_no_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("cnsgn_str_ln_tgt_flg", "cnsgn_str_ln_tgt_flg"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Srch04_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1330_Chk01_INFO = new MCOperationInfo("MS", "MSBBL1330", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1330_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("sls_ret_schd_dt", "sls_ret_schd_dt"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL1330_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ref_dlv_slip_no", "ref_dlv_slip_no"),
				MCItemDef.create("ref_dlv_slip_d_no", "ref_dlv_slip_d_no"),
				MCItemDef.create("ref_sls_act_no", "ref_sls_act_no"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("ref_sls_act_seq", "ref_sls_act_seq"),
				MCItemDef.create("ref_sls_act_d_seq", "ref_sls_act_d_seq"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL1330_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Chk01_Io")
		);
	}


	public static MCContainerDef MS_MSBBL1330_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("sls_ret_schd_dt", "sls_ret_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("old_iv_no", "old_iv_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("trd_cur_upri_dec_place", "trd_cur_upri_dec_place"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sret_schd_sts_typ", "sret_schd_sts_typ"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("wtax_amt", "wtax_amt"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ref_dlv_slip_no", "ref_dlv_slip_no"),
				MCItemDef.create("ref_dlv_slip_d_no", "ref_dlv_slip_d_no"),
				MCItemDef.create("ref_sls_act_no", "ref_sls_act_no"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("ref_sls_act_seq", "ref_sls_act_seq"),
				MCItemDef.create("ref_sls_act_d_seq", "ref_sls_act_d_seq"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("old_abort_flg", "old_abort_flg"),
				MCItemDef.create("comp_spec_typ", "comp_spec_typ"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("trd_unit_conv_base_qty", "trd_unit_conv_base_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("old_abort_flg", "old_abort_flg"),
				MCItemDef.create("old_sls_ret_schd_abort_flg", "old_sls_ret_schd_abort_flg"),
				MCItemDef.create("dtl_row_id", "dtl_row_id"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("Chk01_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1330_Ins01_INFO = new MCOperationInfo("MS", "MSBBL1330", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1330_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("sls_ret_schd_dt", "sls_ret_schd_dt"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL1330_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ref_dlv_slip_no", "ref_dlv_slip_no"),
				MCItemDef.create("ref_dlv_slip_d_no", "ref_dlv_slip_d_no"),
				MCItemDef.create("ref_sls_act_no", "ref_sls_act_no"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("ref_sls_act_seq", "ref_sls_act_seq"),
				MCItemDef.create("ref_sls_act_d_seq", "ref_sls_act_d_seq"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL1330_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Ins01_Io")
		);
	}


	public static MCContainerDef MS_MSBBL1330_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("iv_no", "iv_no")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("sret_schd_sts_typ", "sret_schd_sts_typ"),
				MCItemDef.create("sret_schd_sts_typ_nm", "sret_schd_sts_typ_nm"),
				MCItemDef.create("sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Ins01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("arr_schd_no", "arr_schd_no")
			}
			,
			MCBlockDef.create("Ins01_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1330_Chk02_INFO = new MCOperationInfo("MS", "MSBBL1330", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1330_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL1330_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL1330_Chk02_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Chk02_Io")
		);
	}


	public static MCContainerDef MS_MSBBL1330_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Chk02_Dtl")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Chk02_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Chk02_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1330_Upd01_INFO = new MCOperationInfo("MS", "MSBBL1330", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1330_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("sls_ret_schd_dt", "sls_ret_schd_dt"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("sync_flg", "sync_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_inpt_flg", "xrate_inpt_flg"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("tterm_cd1", "tterm_cd1"),
				MCItemDef.create("tterm_rmrks1", "tterm_rmrks1"),
				MCItemDef.create("tterm_cd2", "tterm_cd2"),
				MCItemDef.create("tterm_rmrks2", "tterm_rmrks2"),
				MCItemDef.create("tterm_cd3", "tterm_cd3"),
				MCItemDef.create("tterm_rmrks3", "tterm_rmrks3"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL1330_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("upri_not_tgt_flg", "upri_not_tgt_flg"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("dscnt_rsn_cd", "dscnt_rsn_cd"),
				MCItemDef.create("cost_upri", "cost_upri"),
				MCItemDef.create("tax_fix_flg", "tax_fix_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("vmi_flg", "vmi_flg"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("ret_rsn_cd", "ret_rsn_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("wtax_rate", "wtax_rate"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("ref_dlv_slip_no", "ref_dlv_slip_no"),
				MCItemDef.create("ref_dlv_slip_d_no", "ref_dlv_slip_d_no"),
				MCItemDef.create("ref_sls_act_no", "ref_sls_act_no"),
				MCItemDef.create("ref_sls_act_d_no", "ref_sls_act_d_no"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("ref_sls_act_seq", "ref_sls_act_seq"),
				MCItemDef.create("ref_sls_act_d_seq", "ref_sls_act_d_seq"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL1330_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("abort_flg", "abort_flg"),
				MCItemDef.create("sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("cnsgn_gd_cd", "cnsgn_gd_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("cnsgn_loc_cd", "cnsgn_loc_cd"),
				MCItemDef.create("cnsgn_str_ln_cd", "cnsgn_str_ln_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("arr_cnt_rmrks", "arr_cnt_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Upd01_Io")
		);
	}


	public static MCContainerDef MS_MSBBL1330_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("iv_no", "iv_no")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sret_schd_sts_typ", "sret_schd_sts_typ"),
				MCItemDef.create("sret_schd_sts_typ_nm", "sret_schd_sts_typ_nm"),
				MCItemDef.create("sls_ret_schd_d_no", "sls_ret_schd_d_no"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("io_schd_pr_no", "io_schd_pr_no")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	public static MCContainerDef MS_MSBBL1330_Upd01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("arr_schd_no", "arr_schd_no")
			}
			,
			MCBlockDef.create("Upd01_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1330_Del01_INFO = new MCOperationInfo("MS", "MSBBL1330", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1330_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Del01",
			new MCItemDef[]{
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL1330_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Del01",
			new MCItemDef[]{
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("arr_pr_no", "arr_pr_no"),
				MCItemDef.create("arr_pr_upd_cntr", "arr_pr_upd_cntr"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Del01_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL1330_Del01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Del01",
			new MCItemDef[]{
				MCItemDef.create("arr_schd_no", "arr_schd_no"),
				MCItemDef.create("dtl_row_id", "dtl_row_id")
			}
			,
			MCBlockDef.create("Del01_Io")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1330_Sprt01_INFO = new MCOperationInfo("MS", "MSBBL1330", "Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1330_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Sprt01",
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
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("dt", "dt"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL1330_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL1330", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("sls_upri", "sls_upri"),
				MCItemDef.create("interim_flg", "interim_flg")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

