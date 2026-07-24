package mcframe.clientMSBB.MSBBP1420;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBBP_SlsSlipPrnt]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL1420.Srch01.UP.BLOCK0")){
			return MS_MSBBL1420_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1420.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL1420_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1420.Prnt01.UP.BLOCK0")){
			return MS_MSBBL1420_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1420.Prnt01.UP.BLOCK1")){
			return MS_MSBBL1420_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1420.Prnt01.DOWN.BLOCK0")){
			return MS_MSBBL1420_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBBL1420_Srch01_INFO = new MCOperationInfo("MS", "MSBBL1420", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1420_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1420", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("sls_dt_fr", "sls_dt_fr"),
				MCItemDef.create("sls_dt_to", "sls_dt_to"),
				MCItemDef.create("ac_dt_fr", "ac_dt_fr"),
				MCItemDef.create("ac_dt_to", "ac_dt_to"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("inv_can_flg", "inv_can_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg1", "cst_grp_flg1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg2", "cst_grp_flg2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg3", "cst_grp_flg3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg4", "cst_grp_flg4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg5", "cst_grp_flg5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg6", "cst_grp_flg6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg7", "cst_grp_flg7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg8", "cst_grp_flg8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg9", "cst_grp_flg9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg10", "cst_grp_flg10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm10", "cst_grp_nm10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg1", "dlv_grp_flg1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg2", "dlv_grp_flg2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg3", "dlv_grp_flg3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg4", "dlv_grp_flg4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg5", "dlv_grp_flg5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg6", "dlv_grp_flg6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg7", "dlv_grp_flg7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg8", "dlv_grp_flg8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg9", "dlv_grp_flg9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg10", "dlv_grp_flg10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm10", "dlv_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1420_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1420", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("sls_act_no", "sls_act_no"),
				MCItemDef.create("sls_act_seq", "sls_act_seq"),
				MCItemDef.create("sls_act_rev", "sls_act_rev"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq"),
				MCItemDef.create("dlv_slip_rev", "dlv_slip_rev"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("sls_dt", "sls_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("sls_ret_schd_no", "sls_ret_schd_no"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm10", "cst_grp_nm10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm10", "dlv_grp_nm10"),
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
	
	static final MCOperationInfo MS_MSBBL1420_Prnt01_INFO = new MCOperationInfo("MS", "MSBBL1420", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1420_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1420", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_seq", "dlv_slip_seq")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBBL1420_Prnt01_UP_BLOCK1() {
		/** Ope.のBlock [Prnt01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1420", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}


	public static MCContainerDef MS_MSBBL1420_Prnt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1420", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

