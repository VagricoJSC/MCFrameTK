package mcframe.clientMSBG.MSBGP0020;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBGP_BillDSel]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0020.Srch01.UP.BLOCK0")){
			return MS_MSBGL0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0020.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0020.Srch01.DOWN.BLOCK1")){
			return MS_MSBGL0020_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0020.Srch01.DOWN.BLOCK2")){
			return MS_MSBGL0020_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0020.Srch01.DOWN.BLOCK3")){
			return MS_MSBGL0020_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBGL0020.Srch01.DOWN.BLOCK4")){
			return MS_MSBGL0020_Srch01_DOWN_BLOCK4();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBGL0020_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0020", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0020_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("wrkno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrkno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_upri_dec_place", "base_cur_upri_dec_place"),
				MCItemDef.create("iv_no", "iv_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0020_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("lastBillAmt_p" + ".amt", "last_bill_amt"),
				MCItemDef.create("amt_dec_place", "amt_dec_place")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL0020_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_DtlSls] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("amt_p" + ".tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("dscntAmt_p" + ".amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("incTaxAmt_p" + ".amt", "inc_tax_amt"),
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ar_typ_nm", "ar_typ_nm"),
				MCItemDef.create("base_sls_ac_dt", "base_sls_ac_dt"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_seq", "act_seq"),
				MCItemDef.create("act_rev", "act_rev"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("act_d_seq", "act_d_seq"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("unitQty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("curUpri_p" + ".upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt_p" + ".amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_inc_tax_amt_p" + ".amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_upri_p" + ".upri", "base_cur_upri"),
				MCItemDef.create("dlv_dt", "dlv_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("scst_cd", "scst_cd"),
				MCItemDef.create("scst_nm", "scst_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("ship_dlv_slip_d_no", "ship_dlv_slip_d_no"),
				MCItemDef.create("ship_dlv_slip_multi_flg", "ship_dlv_slip_multi_flg"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("sls_wrk_no", "sls_wrk_no"),
				MCItemDef.create("sls_wrk_nm", "sls_wrk_nm"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.IGNORE_ITEM("bill_d_typ"),
				MCItemDef.create("ar_trd_grp_typ", "ar_trd_grp_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("schd_bill_dt", "schd_bill_dt"),
				MCItemDef.create("bill_can_slip_typ", "bill_can_slip_typ"),
				MCItemDef.create("sls_interim_cl_flg", "sls_interim_cl_flg"),
				MCItemDef.create("row_num", "row_num"),
				MCItemDef.create("crryovr_flg", "crryovr_flg"),
				MCItemDef.create("bill_dtl_subttl_typ", "bill_dtl_subttl_typ"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("sls_dtl_outp_typ", "sls_dtl_outp_typ")
			}
			,
			MCBlockDef.create("DtlSls")
		);
	}
	public static MCContainerDef MS_MSBGL0020_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_DtlSlsSub] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("inc_tax_amt", "inc_tax_amt"),
				MCItemDef.create("ar_trd_grp_typ", "ar_trd_grp_typ"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("schd_bill_dt", "schd_bill_dt"),
				MCItemDef.create("row_num", "row_num")
			}
			,
			MCBlockDef.create("DtlSlsSub")
		);
	}
	public static MCContainerDef MS_MSBGL0020_Srch01_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch01_DtlRcv] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("ar_trd_grp_typ", "ar_trd_grp_typ"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ar_typ_nm", "ar_typ_nm"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_seq", "act_seq"),
				MCItemDef.create("act_rev", "act_rev"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("act_d_seq", "act_d_seq"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv_mtd_nm", "rcv_mtd_nm"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("bill_d_rmrks", "bill_d_rmrks"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("schd_bill_dt", "schd_bill_dt"),
				MCItemDef.create("bill_can_slip_typ", "bill_can_slip_typ"),
				MCItemDef.create("sls_interim_cl_flg", "sls_interim_cl_flg"),
				MCItemDef.create("setoffAmt_p" + ".amt", "setoff_amt"),
				MCItemDef.create("setoffTaxAmt_p" + ".amt", "setoff_tax_amt"),
				MCItemDef.create("setoff_tax_cd", "setoff_tax_cd"),
				MCItemDef.create("setoff_tax_nm", "setoff_tax_nm"),
				MCItemDef.create("setoff_tax_rate", "setoff_tax_rate"),
				MCItemDef.create("bill_tax_disp_flg", "bill_tax_disp_flg")
			}
			,
			MCBlockDef.create("DtlRcv")
		);
	}
	public static MCContainerDef MS_MSBGL0020_Srch01_DOWN_BLOCK4() {
	/** Ope.のBlock [Srch01_DtlAdv] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("ar_trd_grp_typ", "ar_trd_grp_typ"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_rev", "rcv_act_rev"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("rcv_act_upd_cntr", "rcv_act_upd_cntr"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("setoffAmt_p" + ".amt", "setoff_amt"),
				MCItemDef.create("setoffTaxAmt_p" + ".amt", "setoff_tax_amt"),
				MCItemDef.create("setoff_tax_cd", "setoff_tax_cd"),
				MCItemDef.create("setoff_tax_nm", "setoff_tax_nm"),
				MCItemDef.create("setoff_tax_rate", "setoff_tax_rate"),
				MCItemDef.create("bill_tax_disp_flg", "bill_tax_disp_flg")
			}
			,
			MCBlockDef.create("DtlAdv")
		);
	}
	//FMCB DEF_CLASSES END
}

