package mcframe.clientMABC.MABCP0540;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABCP_CstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0540.Srch01.UP.BLOCK0")){
			return MA_MABCL0540_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0540.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0540_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0540.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0540_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0540.Srch01.DOWN.BLOCK2")){
			return MA_MABCL0540_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MABCL0540.Srch01.DOWN.BLOCK3")){
			return MA_MABCL0540_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MA.MABCL0540.Srch01.DOWN.BLOCK4")){
			return MA_MABCL0540_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MA.MABCL0540.Srch01.DOWN.BLOCK5")){
			return MA_MABCL0540_Srch01_DOWN_BLOCK5();
		}
		else if (id.equals("MA.MABCL0540.Srch01.DOWN.BLOCK6")){
			return MA_MABCL0540_Srch01_DOWN_BLOCK6();
		}
		else if (id.equals("MA.MABCL0540.Srch01.DOWN.BLOCK7")){
			return MA_MABCL0540_Srch01_DOWN_BLOCK7();
		}
		else if (id.equals("MA.MABCL0540.Upd01.UP.BLOCK0")){
			return MA_MABCL0540_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0540.Upd01.UP.BLOCK1")){
			return MA_MABCL0540_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0540.Upd01.UP.BLOCK2")){
			return MA_MABCL0540_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MA.MABCL0540.Upd01.UP.BLOCK3")){
			return MA_MABCL0540_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MA.MABCL0540.Upd01.UP.BLOCK4")){
			return MA_MABCL0540_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MA.MABCL0540.Upd01.UP.BLOCK5")){
			return MA_MABCL0540_Upd01_UP_BLOCK5();
		}
		else if (id.equals("MA.MABCL0540.Upd01.UP.BLOCK6")){
			return MA_MABCL0540_Upd01_UP_BLOCK6();
		}
		else if (id.equals("MA.MABCL0540.Upd01.UP.BLOCK7")){
			return MA_MABCL0540_Upd01_UP_BLOCK7();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MA_MABCL0540_Srch01_INFO = new MCOperationInfo("MA", "MABCL0540", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0540_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dt" + ".st_dt_fr", "st_dt_fr"),
				MCItemDef.create("dt" + ".st_dt_to", "st_dt_to"),
				MCItemDef.create("dt" + ".end_dt_fr", "end_dt_fr"),
				MCItemDef.create("dt" + ".end_dt_to", "end_dt_to"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0540_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("acst_flg", "acst_flg"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_typ", "ar_dpt_typ"),
				MCItemDef.create("ar_dpt_typ_nm", "ar_dpt_typ_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("cst_cntct_dpt", "cst_cntct_dpt"),
				MCItemDef.create("cst_cntct_psn", "cst_cntct_psn"),
				MCItemDef.create("cst_cntct_psn_title", "cst_cntct_psn_title"),
				MCItemDef.create("cst_sundry_flg", "cst_sundry_flg"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("sls_upri_req_typ_nm", "sls_upri_req_typ_nm"),
				MCItemDef.create("sls_upri_cng_flg", "sls_upri_cng_flg"),
				MCItemDef.create("sls_upri_rnd_typ", "sls_upri_rnd_typ"),
				MCItemDef.create("sls_upri_rnd_typ_nm", "sls_upri_rnd_typ_nm"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_amt_rnd_typ_nm", "sls_amt_rnd_typ_nm"),
				MCItemDef.create("sls_tax_calc_typ", "sls_tax_calc_typ"),
				MCItemDef.create("sls_tax_calc_typ_nm", "sls_tax_calc_typ_nm"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("sls_tax_rnd_typ_nm", "sls_tax_rnd_typ_nm"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("sls_basis_typ_nm", "sls_basis_typ_nm"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("ship_schd_split_typ_nm", "ship_schd_split_typ_nm"),
				MCItemDef.create("bill_basis_typ", "bill_basis_typ"),
				MCItemDef.create("bill_basis_typ_nm", "bill_basis_typ_nm"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("lot_back_stop_typ", "lot_back_stop_typ"),
				MCItemDef.create("lot_back_stop_typ_nm", "lot_back_stop_typ_nm"),
				MCItemDef.create("slip_each_lot_typ", "slip_each_lot_typ"),
				MCItemDef.create("slip_each_lot_typ_nm", "slip_each_lot_typ_nm"),
				MCItemDef.create("cst_ship_form_cd", "cst_ship_form_cd"),
				MCItemDef.create("cst_ship_form_nm", "cst_ship_form_nm"),
				MCItemDef.create("stk_lst_issue_flg", "stk_lst_issue_flg"),
				MCItemDef.create("stk_lst_form_cd", "stk_lst_form_cd"),
				MCItemDef.create("stk_lst_form_nm", "stk_lst_form_nm"),
				MCItemDef.create("sls_tax_cd", "sls_tax_cd"),
				MCItemDef.create("sls_tax_nm", "sls_tax_nm"),
				MCItemDef.create("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg"),
				MCItemDef.create("wrk_ar_flg", "wrk_ar_flg"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("ship_lt", "ship_lt"),
				MCItemDef.create("cst_tterm_cd1", "cst_tterm_cd1"),
				MCItemDef.create("cst_tterm_nm1", "cst_tterm_nm1"),
				MCItemDef.create("cst_tterm_cd2", "cst_tterm_cd2"),
				MCItemDef.create("cst_tterm_nm2", "cst_tterm_nm2"),
				MCItemDef.create("cst_tterm_cd3", "cst_tterm_cd3"),
				MCItemDef.create("cst_tterm_nm3", "cst_tterm_nm3"),
				MCItemDef.create("sls_anly_cd1", "sls_anly_cd1"),
				MCItemDef.create("sls_anly_nm1", "sls_anly_nm1"),
				MCItemDef.create("sls_anly_cd2", "sls_anly_cd2"),
				MCItemDef.create("sls_anly_nm2", "sls_anly_nm2"),
				MCItemDef.create("sls_anly_cd3", "sls_anly_cd3"),
				MCItemDef.create("sls_anly_nm3", "sls_anly_nm3"),
				MCItemDef.create("bcst_flg", "bcst_flg"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("cst_prnt_typ", "cst_prnt_typ"),
				MCItemDef.create("cst_prnt_typ_nm", "cst_prnt_typ_nm"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts"),
				MCItemDef.create("not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg")
			}
			,
			MCBlockDef.create("Wrk1HdrAll")
		);
	}
	public static MCContainerDef MA_MABCL0540_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Wrk2Dtl")
		);
	}
	public static MCContainerDef MA_MABCL0540_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Rslt3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("sls_upri_rank_cd", "sls_upri_rank_cd"),
				MCItemDef.create("sls_upri_rank_nm", "sls_upri_rank_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Wrk3Dtl")
		);
	}
	public static MCContainerDef MA_MABCL0540_Srch01_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch01_Rslt4] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Wrk4Dtl")
		);
	}
	public static MCContainerDef MA_MABCL0540_Srch01_DOWN_BLOCK4() {
	/** Ope.のBlock [Srch01_Rslt5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("ship_valid_grp_cd", "ship_valid_grp_cd"),
				MCItemDef.create("ship_valid_grp_nm", "ship_valid_grp_nm"),
				MCItemDef.create("valid_days", "valid_days"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Wrk5Dtl")
		);
	}
	public static MCContainerDef MA_MABCL0540_Srch01_DOWN_BLOCK5() {
	/** Ope.のBlock [Srch01_Rslt6] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("gd_nm", "gd_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Wrk6Dtl")
		);
	}
	public static MCContainerDef MA_MABCL0540_Srch01_DOWN_BLOCK6() {
	/** Ope.のBlock [Srch01_Rslt7] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("if_proc_typ_nm", "if_proc_typ_nm"),
				MCItemDef.create("not_onr_prov_flg", "not_onr_prov_flg"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Wrk7Dtl")
		);
	}
	public static MCContainerDef MA_MABCL0540_Srch01_DOWN_BLOCK7() {
	/** Ope.のBlock [Srch01_Rslt8] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("bp_itm_cd", "bp_itm_cd"),
				MCItemDef.create("bp_itm_nm", "bp_itm_nm"),
				MCItemDef.create("def_flg", "def_flg"),
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("pf_grp_nm", "pf_grp_nm"),
				MCItemDef.create("pf_fix_flg", "pf_fix_flg"),
				MCItemDef.create("purc_commit_flg", "purc_commit_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Wrk8Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0540_Upd01_INFO = new MCOperationInfo("MA", "MABCL0540", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0540_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("ar_dpt_typ", "ar_dpt_typ"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("check_ar_dpt_cd", "check_ar_dpt_cd"),
				MCItemDef.create("cst_cntct_dpt", "cst_cntct_dpt"),
				MCItemDef.create("cst_cntct_psn", "cst_cntct_psn"),
				MCItemDef.create("cst_cntct_psn_title", "cst_cntct_psn_title"),
				MCItemDef.create("cst_sundry_flg", "cst_sundry_flg"),
				MCItemDef.create("sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("sls_upri_cng_flg", "sls_upri_cng_flg"),
				MCItemDef.create("sls_upri_rnd_typ", "sls_upri_rnd_typ"),
				MCItemDef.create("sls_amt_rnd_typ", "sls_amt_rnd_typ"),
				MCItemDef.create("sls_tax_calc_typ", "sls_tax_calc_typ"),
				MCItemDef.create("sls_tax_rnd_typ", "sls_tax_rnd_typ"),
				MCItemDef.create("sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("bill_basis_typ", "bill_basis_typ"),
				MCItemDef.create("bill_crryovr_times", "bill_crryovr_times"),
				MCItemDef.create("lot_back_stop_typ", "lot_back_stop_typ"),
				MCItemDef.create("slip_each_lot_typ", "slip_each_lot_typ"),
				MCItemDef.create("cst_ship_form_cd", "cst_ship_form_cd"),
				MCItemDef.create("stk_lst_issue_flg", "stk_lst_issue_flg"),
				MCItemDef.create("stk_lst_form_cd", "stk_lst_form_cd"),
				MCItemDef.create("sls_tax_cd", "sls_tax_cd"),
				MCItemDef.create("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg"),
				MCItemDef.create("wrk_ar_flg", "wrk_ar_flg"),
				MCItemDef.create("cst_iv_flg", "cst_iv_flg"),
				MCItemDef.create("ship_lt", "ship_lt"),
				MCItemDef.create("cst_tterm_cd1", "cst_tterm_cd1"),
				MCItemDef.create("cst_tterm_cd2", "cst_tterm_cd2"),
				MCItemDef.create("cst_tterm_cd3", "cst_tterm_cd3"),
				MCItemDef.create("sls_anly_cd1", "sls_anly_cd1"),
				MCItemDef.create("sls_anly_cd2", "sls_anly_cd2"),
				MCItemDef.create("sls_anly_cd3", "sls_anly_cd3"),
				MCItemDef.create("bcst_flg", "bcst_flg"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("cst_prnt_typ", "cst_prnt_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("not_lg_mix_flg", "not_lg_mix_flg"),
				MCItemDef.create("not_lot_mix_flg", "not_lot_mix_flg"),
				MCItemDef.create("not_sublot_mix_flg", "not_sublot_mix_flg")
			}
			,
			MCBlockDef.create("Wrk1HdrAll")
		);
	}

	public static MCContainerDef MA_MABCL0540_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk2Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0540_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Dtl3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("sls_upri_rank_cd", "sls_upri_rank_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk3Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0540_Upd01_UP_BLOCK3() {
		/** Ope.のBlock [Upd01_Dtl4] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk4Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0540_Upd01_UP_BLOCK4() {
		/** Ope.のBlock [Upd01_Dtl5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("ship_valid_grp_cd", "ship_valid_grp_cd"),
				MCItemDef.create("valid_days", "valid_days"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk5Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0540_Upd01_UP_BLOCK5() {
		/** Ope.のBlock [Upd01_Dtl6] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("gd_cd", "gd_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk6Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0540_Upd01_UP_BLOCK6() {
		/** Ope.のBlock [Upd01_Dtl7] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("not_onr_prov_flg", "not_onr_prov_flg"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk7Dtl")
		);
	}

	public static MCContainerDef MA_MABCL0540_Upd01_UP_BLOCK7() {
		/** Ope.のBlock [Upd01_Dtl8] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABCL0540", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("bp_itm_cd", "bp_itm_cd"),
				MCItemDef.create("bp_itm_nm", "bp_itm_nm"),
				MCItemDef.create("def_flg", "def_flg"),
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("pf_fix_flg", "pf_fix_flg"),
				MCItemDef.create("purc_commit_flg", "purc_commit_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk8Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

