package mcframe.clientMSBG.MSBGP0220;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBGP_ArDtlApplReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0220.Srch01.UP.BLOCK0")){
			return MS_MSBGL0220_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0220.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0220_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0220.Srch01.DOWN.BLOCK1")){
			return MS_MSBGL0220_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0220.Upd01.UP.BLOCK0")){
			return MS_MSBGL0220_Upd01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBGL0220_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0220", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0220_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0220", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("ar_appl_schd_no", "ar_appl_schd_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("ac_dt_fr", "ac_dt_fr"),
				MCItemDef.create("ac_dt_to", "ac_dt_to"),
				MCItemDef.create("inc_not_bill_flg", "inc_not_bill_flg"),
				MCItemDef.create("inc_otr_slo_flg", "inc_otr_slo_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0220_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_RcvActD] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0220", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("rcv_mtd_cd", "rcv_mtd_cd"),
				MCItemDef.create("rcv_mtd_nm", "rcv_mtd_nm"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ar_typ_nm", "ar_typ_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("appl_tgt_amt_p" + ".amt", "appl_tgt_amt"),
				MCItemDef.create("ttl_appl_amt_p" + ".amt", "ttl_appl_amt"),
				MCItemDef.create("not_appl_amt_p" + ".amt", "not_appl_amt"),
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
			MCBlockDef.create("RcvActD")
		);
	}
	public static MCContainerDef MS_MSBGL0220_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_ApplDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0220", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("check", "check"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("appl_tgt_amt_p" + ".amt", "appl_tgt_amt"),
				MCItemDef.create("ttl_appl_amt_p" + ".amt", "ttl_appl_amt"),
				MCItemDef.create("appl_amt_p" + ".amt", "appl_amt"),
				MCItemDef.create("not_appl_amt_p" + ".amt", "not_appl_amt"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ar_typ_nm", "ar_typ_nm"),
				MCItemDef.create("dlv_dt", "dlv_dt"),
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("bill_dt", "bill_dt"),
				MCItemDef.create("bill_no", "bill_no"),
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
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("qty_dec_place", "qty_dec_place"),
				MCItemDef.create("trd_unit_qty_p" + ".qty", "trd_unit_qty"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_upri_p" + ".upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt_p" + ".amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt_p" + ".amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
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
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("arsw_ac_ym", "arsw_ac_ym"),
				MCItemDef.create("arsw_ac_dt", "arsw_ac_dt"),
				MCItemDef.create("arsw_trd_cd", "arsw_trd_cd"),
				MCItemDef.create("arsw_trd_nm", "arsw_trd_nm"),
				MCItemDef.create("arsw_act_no", "arsw_act_no"),
				MCItemDef.create("arsw_act_d_no", "arsw_act_d_no"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("parent_bill_d_no", "parent_bill_d_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("bill_d_upd_cntr", "bill_d_upd_cntr"),
				MCItemDef.create("bill_d_appl_bal_upd_cntr", "bill_d_appl_bal_upd_cntr"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("rcv_act_upd_cntr", "rcv_act_upd_cntr")
			}
			,
			MCBlockDef.create("ApplDtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0220_Upd01_INFO = new MCOperationInfo("MS", "MSBGL0220", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0220_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_ApplDtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0220", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("check", "check"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("parent_bill_d_no", "parent_bill_d_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("appl_amt_p" + ".amt", "appl_amt"),
				MCItemDef.create("ttl_appl_amt_p" + ".amt", "ttl_appl_amt"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("bill_d_upd_cntr", "bill_d_upd_cntr"),
				MCItemDef.create("bill_d_appl_bal_upd_cntr", "bill_d_appl_bal_upd_cntr"),
				MCItemDef.create("rcv_act_upd_cntr", "rcv_act_upd_cntr")
			}
			,
			MCBlockDef.create("ApplDtl")
		);
	}


	//FMCB DEF_CLASSES END
}

