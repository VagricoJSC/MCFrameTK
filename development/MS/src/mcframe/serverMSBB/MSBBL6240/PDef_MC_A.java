package mcframe.serverMSBB.MSBBL6240;

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
 * [MSBBL_SlsDscntService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Chk01.UP.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Chk01.UP.BLOCK1")){
			return MS_MSBBL6240_Sls_Dscnt_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Chk01.DOWN.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Chk01.DOWN.BLOCK1")){
			return MS_MSBBL6240_Sls_Dscnt_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Chk02.UP.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Chk02.DOWN.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Ins01.UP.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Ins01.UP.BLOCK1")){
			return MS_MSBBL6240_Sls_Dscnt_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Ins01.UP.BLOCK2")){
			return MS_MSBBL6240_Sls_Dscnt_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Ins01.DOWN.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Ins01.DOWN.BLOCK1")){
			return MS_MSBBL6240_Sls_Dscnt_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Upd01.UP.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Upd01.UP.BLOCK1")){
			return MS_MSBBL6240_Sls_Dscnt_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Upd01.DOWN.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Upd01.DOWN.BLOCK1")){
			return MS_MSBBL6240_Sls_Dscnt_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_Del01.UP.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_BulkImp_Chk01.UP.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_BulkImp_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_BulkImp_Chk01.DOWN.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_BulkImp_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_BulkImp_Chk02.UP.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_BulkImp_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_BulkImp_Chk02.DOWN.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_BulkImp_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_BulkImp_Ins01.UP.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_BulkImp_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL6240.Sls_Dscnt_BulkImp_Del01.UP.BLOCK0")){
			return MS_MSBBL6240_Sls_Dscnt_BulkImp_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
									
	
	static final MCOperationInfo MS_MSBBL6240_Sls_Dscnt_Chk01_INFO = new MCOperationInfo("MS", "MSBBL6240", "Sls_Dscnt_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
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
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
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
				MCItemDef.create("rsn_cd", "rsn_cd"),
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
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dt", "sls_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
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
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("sls_tax_calc_typ", "sls_tax_calc_typ"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
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
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
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
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("trd_unit_std_qty", "trd_unit_std_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("sls_act_io_seq", "sls_act_io_seq"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6240_Sls_Dscnt_Chk02_INFO = new MCOperationInfo("MS", "MSBBL6240", "Sls_Dscnt_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Del")
		);
	}


	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Del")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6240_Sls_Dscnt_Ins01_INFO = new MCOperationInfo("MS", "MSBBL6240", "Sls_Dscnt_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dt", "sls_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
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
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("sls_tax_calc_typ", "sls_tax_calc_typ"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
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
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
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
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("trd_unit_std_qty", "trd_unit_std_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("sls_act_io_seq", "sls_act_io_seq"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Dtl")
		);
	}

	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Ins01",
			new MCItemDef[]{
				MCItemDef.create("bulk_imp_flg", "bulk_imp_flg")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Rslt_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("sls_act_d_seq", "sls_act_d_seq"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Rslt_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6240_Sls_Dscnt_Upd01_INFO = new MCOperationInfo("MS", "MSBBL6240", "Sls_Dscnt_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dt", "sls_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
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
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_calc_typ", "sls_tax_calc_typ"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
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
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
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
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("trd_unit_std_qty", "trd_unit_std_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("sls_act_io_seq", "sls_act_io_seq"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("dscnt_itm_flg", "dscnt_itm_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Rslt_Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("sls_act_d_no", "sls_act_d_no"),
				MCItemDef.create("sls_act_d_seq", "sls_act_d_seq"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Rslt_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6240_Sls_Dscnt_Del01_INFO = new MCOperationInfo("MS", "MSBBL6240", "Sls_Dscnt_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Del")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6240_Sls_Dscnt_BulkImp_Chk01_INFO = new MCOperationInfo("MS", "MSBBL6240", "Sls_Dscnt_BulkImp_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_BulkImp_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_BulkImp_Chk01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
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
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
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
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3")
			}
			,
			MCBlockDef.create("Sls_Dscnt_BulkImp_Dtl")
		);
	}


	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_BulkImp_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_BulkImp_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dt", "sls_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
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
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("sls_tax_calc_typ", "sls_tax_calc_typ"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("hdr_err_flg", "hdr_err_flg"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
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
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("trd_unit_std_qty", "trd_unit_std_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("sls_act_io_seq", "sls_act_io_seq"),
				MCItemDef.create("dtl_err_flg", "dtl_err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_BulkImp_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6240_Sls_Dscnt_BulkImp_Chk02_INFO = new MCOperationInfo("MS", "MSBBL6240", "Sls_Dscnt_BulkImp_Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_BulkImp_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_BulkImp_Chk02",
			new MCItemDef[]{
				MCItemDef.create("sls_act_no", "sls_act_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_BulkImp_Del")
		);
	}


	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_BulkImp_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_BulkImp_Chk02",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Sls_Dscnt_BulkImp_Del")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6240_Sls_Dscnt_BulkImp_Ins01_INFO = new MCOperationInfo("MS", "MSBBL6240", "Sls_Dscnt_BulkImp_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_BulkImp_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_BulkImp_Ins01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dt", "sls_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ref_iv_no", "ref_iv_no"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
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
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("cred_cd", "cred_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("sls_tax_calc_typ", "sls_tax_calc_typ"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("hdr_err_flg", "hdr_err_flg"),
				MCItemDef.create("dtl_peg_no", "dtl_peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("tax_typ", "tax_typ"),
				MCItemDef.create("rsn_cd", "rsn_cd"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
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
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("d_sub_char1", "d_sub_char1"),
				MCItemDef.create("d_sub_char2", "d_sub_char2"),
				MCItemDef.create("d_sub_char3", "d_sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("trd_unit_std_qty", "trd_unit_std_qty"),
				MCItemDef.create("trd_unit_conv_qty", "trd_unit_conv_qty"),
				MCItemDef.create("pack_flg", "pack_flg"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_rnd_typ", "base_unit_rnd_typ"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("sls_act_io_no", "sls_act_io_no"),
				MCItemDef.create("sls_act_io_seq", "sls_act_io_seq"),
				MCItemDef.create("dtl_err_flg", "dtl_err_flg"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_BulkImp_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBBL6240_Sls_Dscnt_BulkImp_Del01_INFO = new MCOperationInfo("MS", "MSBBL6240", "Sls_Dscnt_BulkImp_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL6240_Sls_Dscnt_BulkImp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBL6240", "Sls_Dscnt_BulkImp_Del01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("aprv_flg", "aprv_flg"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("sls_slip_out_flg", "sls_slip_out_flg"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("Sls_Dscnt_Del")
		);
	}


	//FMCB DEF_CLASSES END
}

