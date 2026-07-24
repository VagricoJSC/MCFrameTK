package mcframe.clientMSBG.MSBGP0120;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBGP_ArDtlApplBalSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0120.Srch01.UP.BLOCK0")){
			return MS_MSBGL0120_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0120.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0120_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBGL0120_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0120", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0120_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_schd_dt_fr", "rcv_schd_dt_fr"),
				MCItemDef.create("rcv_schd_dt_to", "rcv_schd_dt_to"),
				MCItemDef.create("ac_dt_fr", "ac_dt_fr"),
				MCItemDef.create("ac_dt_to", "ac_dt_to"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("incl_not_bill_flg", "incl_not_bill_flg"),
				MCItemDef.create("incl_appl_flg", "incl_appl_flg"),
				MCItemDef.create("incl_can_flg", "incl_can_flg"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg1", "acst_grp_flg1"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd1", "acst_grp_cd1"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm1", "acst_grp_nm1"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg2", "acst_grp_flg2"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd2", "acst_grp_cd2"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm2", "acst_grp_nm2"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg3", "acst_grp_flg3"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd3", "acst_grp_cd3"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm3", "acst_grp_nm3"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg4", "acst_grp_flg4"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd4", "acst_grp_cd4"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm4", "acst_grp_nm4"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg5", "acst_grp_flg5"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd5", "acst_grp_cd5"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm5", "acst_grp_nm5"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg6", "acst_grp_flg6"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd6", "acst_grp_cd6"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm6", "acst_grp_nm6"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg7", "acst_grp_flg7"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd7", "acst_grp_cd7"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm7", "acst_grp_nm7"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg8", "acst_grp_flg8"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd8", "acst_grp_cd8"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm8", "acst_grp_nm8"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg9", "acst_grp_flg9"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd9", "acst_grp_cd9"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm9", "acst_grp_nm9"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg10", "acst_grp_flg10"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd10", "acst_grp_cd10"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm10", "acst_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0120_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ar_typ_nm", "ar_typ_nm"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("multi_flg", "multi_flg"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("appl_tgt_amt_p" + ".amt", "appl_tgt_amt"),
				MCItemDef.create("not_appl_bal_p" + ".amt", "not_appl_bal"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("dlv_dt", "dlv_dt"),
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("bill_dt", "bill_dt"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
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
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("old_wrk_no_p" + ".wrk_no", "old_wrk_no"),
				MCItemDef.create("old_wrk_no_p" + ".wrk_nm", "old_wrk_nm"),
				MCItemDef.create("arsw_ac_ym", "arsw_ac_ym"),
				MCItemDef.create("arsw_ac_dt", "arsw_ac_dt"),
				MCItemDef.create("arsw_trd_cd", "arsw_trd_cd"),
				MCItemDef.create("arsw_trd_nm", "arsw_trd_nm"),
				MCItemDef.create("arsw_act_no", "arsw_act_no"),
				MCItemDef.create("arsw_act_d_no", "arsw_act_d_no"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd1", "acst_grp_cd1"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm1", "acst_grp_nm1"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd2", "acst_grp_cd2"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm2", "acst_grp_nm2"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd3", "acst_grp_cd3"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm3", "acst_grp_nm3"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd4", "acst_grp_cd4"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm4", "acst_grp_nm4"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd5", "acst_grp_cd5"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm5", "acst_grp_nm5"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd6", "acst_grp_cd6"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm6", "acst_grp_nm6"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd7", "acst_grp_cd7"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm7", "acst_grp_nm7"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd8", "acst_grp_cd8"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm8", "acst_grp_nm8"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd9", "acst_grp_cd9"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm9", "acst_grp_nm9"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd10", "acst_grp_cd10"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm10", "acst_grp_nm10"),
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

