package mcframe.clientMSBG.MSBGP0210;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBGP_ArApplReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0210.Srch01.UP.BLOCK0")){
			return MS_MSBGL0210_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0210.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0210_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0210.Srch01.DOWN.BLOCK1")){
			return MS_MSBGL0210_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0210.Srch01.DOWN.BLOCK2")){
			return MS_MSBGL0210_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0210.Srch02.UP.BLOCK0")){
			return MS_MSBGL0210_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0210.Srch02.DOWN.BLOCK0")){
			return MS_MSBGL0210_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0210.Srch03.UP.BLOCK0")){
			return MS_MSBGL0210_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0210.Srch03.DOWN.BLOCK0")){
			return MS_MSBGL0210_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0210.Srch04.UP.BLOCK0")){
			return MS_MSBGL0210_Srch04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0210.Srch04.DOWN.BLOCK0")){
			return MS_MSBGL0210_Srch04_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0210.Ins01.UP.BLOCK0")){
			return MS_MSBGL0210_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0210.Ins01.UP.BLOCK1")){
			return MS_MSBGL0210_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0210.Ins01.UP.BLOCK2")){
			return MS_MSBGL0210_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0210.Ins01.UP.BLOCK3")){
			return MS_MSBGL0210_Ins01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBGL0210.Ins01.DOWN.BLOCK0")){
			return MS_MSBGL0210_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0210.Ins01.DOWN.BLOCK1")){
			return MS_MSBGL0210_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0210.Upd01.UP.BLOCK0")){
			return MS_MSBGL0210_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0210.Upd01.UP.BLOCK1")){
			return MS_MSBGL0210_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0210.Upd01.UP.BLOCK2")){
			return MS_MSBGL0210_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0210.Upd01.UP.BLOCK3")){
			return MS_MSBGL0210_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBGL0210.Upd01.DOWN.BLOCK0")){
			return MS_MSBGL0210_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0210.Upd01.DOWN.BLOCK1")){
			return MS_MSBGL0210_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0210.Del01.UP.BLOCK0")){
			return MS_MSBGL0210_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0210.Del01.UP.BLOCK1")){
			return MS_MSBGL0210_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0210.Del01.UP.BLOCK2")){
			return MS_MSBGL0210_Del01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0210.Del01.UP.BLOCK3")){
			return MS_MSBGL0210_Del01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBGL0210.Del01.DOWN.BLOCK0")){
			return MS_MSBGL0210_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBGL0210_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0210", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0210_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_rev", "rcv_act_rev"),
				MCItemDef.create("latest_flg", "latest_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0210_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_rev", "rcv_act_rev"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "dpt_nm"),
				MCItemDef.create("def_bank_ac_cd", "def_bank_ac_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("rcv_act_upd_cntr", "rcv_act_upd_cntr"),
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
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL0210_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rcv] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("rcv_amt_p" + ".amt", "rcv_amt"),
				MCItemDef.create("not_proc_bal_p" + ".amt", "not_proc_bal"),
				MCItemDef.create("not_proc_bal_w_p" + ".amt", "not_proc_bal_w"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_typ1", "ar_sttl_typ1"),
				MCItemDef.create("ar_sttl_nm1", "ar_sttl_nm1"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("ar_sttl_cd2", "ar_sttl_cd2"),
				MCItemDef.create("ar_sttl_typ2", "ar_sttl_typ2"),
				MCItemDef.create("ar_sttl_nm2", "ar_sttl_nm2"),
				MCItemDef.create("sls_purc_typ2", "sls_purc_typ2"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("debt_cred_id_typ", "debt_cred_id_typ"),
				MCItemDef.create("debt_cred_id_typ_nm", "debt_cred_id_typ_nm"),
				MCItemDef.create("debt_cred_id_cd", "debt_cred_id_cd"),
				MCItemDef.create("debt_cred_nm", "debt_cred_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("rcv_dat_typ", "rcv_dat_typ"),
				MCItemDef.create("rcv_dat_typ_nm", "rcv_dat_typ_nm"),
				MCItemDef.create("adv_trd_cd", "adv_trd_cd"),
				MCItemDef.create("adv_trd_nm", "adv_trd_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("old_rcst_cd", "old_rcst_cd"),
				MCItemDef.create("old_bcst_cd", "old_bcst_cd"),
				MCItemDef.create("old_bill_dpt_cd", "old_bill_dpt_cd"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("note_mng_no", "note_mng_no"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("note_typ_nm", "note_typ_nm"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_bank_nm", "draw_bank_nm"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("draw_branch_nm", "draw_branch_nm"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("note_rsn_nm", "note_rsn_nm"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3"),
				MCItemDef.create("setoff_rcv_no", "setoff_rcv_no"),
				MCItemDef.create("setoff_bcst_cd", "setoff_bcst_cd"),
				MCItemDef.create("setoff_bcst_nm", "setoff_bcst_nm"),
				MCItemDef.create("setoff_dt", "setoff_dt"),
				MCItemDef.create("setoff_trd_cur_cd", "setoff_trd_cur_cd"),
				MCItemDef.create("setoff_trd_cur_nm", "setoff_trd_cur_nm"),
				MCItemDef.create("setoff_xrate_p" + ".xrate", "setoff_xrate"),
				MCItemDef.create("setoff_rcv_amt_p" + ".amt", "setoff_rcv_amt"),
				MCItemDef.create("setoff_not_proc_bal_p" + ".amt", "setoff_not_proc_bal"),
				MCItemDef.create("setoff_not_proc_bal_w_p" + ".amt", "setoff_not_proc_bal_w"),
				MCItemDef.create("setoff_sttl_cd1", "setoff_sttl_cd"),
				MCItemDef.create("setoff_sttl_typ1", "setoff_sttl_typ"),
				MCItemDef.create("setoff_sttl_nm1", "setoff_sttl_nm"),
				MCItemDef.create("setoff_sls_purc_typ", "setoff_sls_purc_typ"),
				MCItemDef.create("setoff_purc_flg", "setoff_purc_flg"),
				MCItemDef.create("setoff_sls_flg", "setoff_sls_flg"),
				MCItemDef.create("setoff_tax_cd", "setoff_tax_cd"),
				MCItemDef.create("setoff_tax_nm", "setoff_tax_nm"),
				MCItemDef.create("setoff_tax_rate", "setoff_tax_rate"),
				MCItemDef.create("setoff_debt_cred_id_typ", "setoff_debt_cred_id_typ"),
				MCItemDef.create("setoff_debt_cred_id_typ_nm", "setoff_debt_cred_id_typ_nm"),
				MCItemDef.create("setoff_debt_cred_id_cd", "setoff_debt_cred_id_cd"),
				MCItemDef.create("setoff_debt_cred_nm", "setoff_debt_cred_nm"),
				MCItemDef.create("setoff_bd_dpt_cd", "setoff_bd_dpt_cd"),
				MCItemDef.create("setoff_bd_dpt_nm", "setoff_bd_dpt_nm"),
				MCItemDef.create("setoff_rcv_dat_typ", "setoff_rcv_dat_typ"),
				MCItemDef.create("setoff_rcv_dat_typ_nm", "setoff_rcv_dat_typ_nm"),
				MCItemDef.create("setoff_trd_rmrks", "setoff_trd_rmrks"),
				MCItemDef.create("setoff_sub_char1", "setoff_sub_char1"),
				MCItemDef.create("setoff_sub_char2", "setoff_sub_char2"),
				MCItemDef.create("setoff_sub_char3", "setoff_sub_char3"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("old_setoff_bcst_cd", "old_setoff_bcst_cd")
			}
			,
			MCBlockDef.create("Rcv")
		);
	}
	public static MCContainerDef MS_MSBGL0210_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("appl_tgt_amt_p" + ".amt", "appl_tgt_amt"),
				MCItemDef.create("appl_ttl_amt_p" + ".amt", "appl_ttl_amt"),
				MCItemDef.create("appl_ttl_amt_w_p" + ".amt", "appl_ttl_amt_w"),
				MCItemDef.create("amt1_p" + ".amt", "amt1"),
				MCItemDef.create("amt1_w_p" + ".amt", "amt1_w"),
				MCItemDef.create("amt2_p" + ".amt", "amt2"),
				MCItemDef.create("amt2_w_p" + ".amt", "amt2_w"),
				MCItemDef.create("amt3_p" + ".amt", "amt3"),
				MCItemDef.create("amt3_w_p" + ".amt", "amt3_w"),
				MCItemDef.create("not_appl_bal_p" + ".amt", "not_appl_bal"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_nm1", "ar_sttl_nm1"),
				MCItemDef.create("ar_sttl_typ1", "ar_sttl_typ1"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ar_typ_nm", "ar_typ_nm"),
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("bill_d_rmrks", "bill_d_rmrks"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("other_slo_flg", "other_slo_flg"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("ar_appl_schd_no", "ar_appl_schd_no"),
				MCItemDef.create("ar_appl_schd_upd_cntr", "ar_appl_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0210_Srch02_INFO = new MCOperationInfo("MS", "MSBGL0210", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0210_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("rcv_no", "rcv_no")
			}
			,
			MCBlockDef.create("Rcv")
		);
	}


	public static MCContainerDef MS_MSBGL0210_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_dat_typ", "rcv_dat_typ"),
				MCItemDef.create("rcv_dat_typ_nm", "rcv_dat_typ_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("rcv_amt_p" + ".amt", "rcv_amt"),
				MCItemDef.create("not_proc_bal_p" + ".amt", "not_proc_bal"),
				MCItemDef.create("not_proc_bal_w_p" + ".amt", "not_proc_bal_w"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_typ1", "ar_sttl_typ1"),
				MCItemDef.create("ar_sttl_nm1", "ar_sttl_nm1"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("ar_sttl_cd2", "ar_sttl_cd2"),
				MCItemDef.create("ar_sttl_typ2", "ar_sttl_typ2"),
				MCItemDef.create("ar_sttl_nm2", "ar_sttl_nm2"),
				MCItemDef.create("sls_purc_typ2", "sls_purc_typ2"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("debt_cred_id_typ", "debt_cred_id_typ"),
				MCItemDef.create("debt_cred_id_typ_nm", "debt_cred_id_typ_nm"),
				MCItemDef.create("debt_cred_id_cd", "debt_cred_id_cd"),
				MCItemDef.create("debt_cred_nm", "debt_cred_nm"),
				MCItemDef.create("adv_trd_cd", "adv_trd_cd"),
				MCItemDef.create("adv_trd_nm", "adv_trd_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("note_mng_no", "note_mng_no"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("note_typ_nm", "note_typ_nm"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_bank_nm", "draw_bank_nm"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("draw_branch_nm", "draw_branch_nm"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("note_rsn_nm", "note_rsn_nm"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place")
			}
			,
			MCBlockDef.create("Rcv")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0210_Srch03_INFO = new MCOperationInfo("MS", "MSBGL0210", "Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0210_Srch03_UP_BLOCK0() {
		/** Ope.のBlock [Srch03_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("setoff_rcv_no", "setoff_rcv_no"),
				MCItemDef.create("setoff_bcst_cd", "setoff_bcst_cd"),
				MCItemDef.create("setoff_trd_cur_cd", "setoff_trd_cur_cd"),
				MCItemDef.create("setoff_sttl_cd1", "setoff_sttl_cd"),
				MCItemDef.create("narrow_down_flg", "narrow_down_flg"),
				MCItemDef.create("not_bill_flg", "not_bill_flg"),
				MCItemDef.create("incl_appl_flg", "incl_appl_flg"),
				MCItemDef.create("zero_flg", "zero_flg"),
				MCItemDef.create("slo_flg", "slo_flg"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ")
			}
			,
			MCBlockDef.create("DtlCnd")
		);
	}


	public static MCContainerDef MS_MSBGL0210_Srch03_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch03_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("appl_tgt_amt_p" + ".amt", "appl_tgt_amt"),
				MCItemDef.create("appl_ttl_amt_p" + ".amt", "appl_ttl_amt"),
				MCItemDef.create("appl_ttl_amt_w_p" + ".amt", "appl_ttl_amt_w"),
				MCItemDef.create("amt1_p" + ".amt", "amt1"),
				MCItemDef.create("amt1_w_p" + ".amt", "amt1_w"),
				MCItemDef.create("amt2_p" + ".amt", "amt2"),
				MCItemDef.create("amt2_w_p" + ".amt", "amt2_w"),
				MCItemDef.create("amt3_p" + ".amt", "amt3"),
				MCItemDef.create("amt3_w_p" + ".amt", "amt3_w"),
				MCItemDef.create("not_appl_bal_p" + ".amt", "not_appl_bal"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_nm1", "ar_sttl_nm1"),
				MCItemDef.create("ar_sttl_typ1", "ar_sttl_typ1"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ar_typ_nm", "ar_typ_nm"),
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("bill_d_rmrks", "bill_d_rmrks"),
				MCItemDef.create("ar_appl_schd_no", "ar_appl_schd_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("other_slo_flg", "other_slo_flg"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("ar_appl_schd_upd_cntr", "ar_appl_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0210_Srch04_INFO = new MCOperationInfo("MS", "MSBGL0210", "Srch04", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0210_Srch04_UP_BLOCK0() {
		/** Ope.のBlock [Srch04_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("setoff_rcv_no", "setoff_rcv_no")
			}
			,
			MCBlockDef.create("Rcv")
		);
	}


	public static MCContainerDef MS_MSBGL0210_Srch04_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch04_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("setoff_rcv_no", "setoff_rcv_no"),
				MCItemDef.create("setoff_rcv_dat_typ", "setoff_rcv_dat_typ"),
				MCItemDef.create("setoff_rcv_dat_typ_nm", "setoff_rcv_dat_typ_nm"),
				MCItemDef.create("setoff_bcst_cd", "setoff_bcst_cd"),
				MCItemDef.create("setoff_bcst_nm", "setoff_bcst_nm"),
				MCItemDef.create("setoff_dt", "setoff_dt"),
				MCItemDef.create("ac_dt", "setoff_ac_dt"),
				MCItemDef.create("setoff_trd_cur_cd", "setoff_trd_cur_cd"),
				MCItemDef.create("setoff_trd_cur_nm", "setoff_trd_cur_nm"),
				MCItemDef.create("setoff_xrate_p" + ".xrate", "setoff_xrate"),
				MCItemDef.create("setoff_rcv_amt_p" + ".amt", "setoff_rcv_amt"),
				MCItemDef.create("setoff_not_proc_bal_p" + ".amt", "setoff_not_proc_bal"),
				MCItemDef.create("setoff_sttl_cd1", "setoff_sttl_cd1"),
				MCItemDef.create("setoff_sttl_nm1", "setoff_sttl_nm1"),
				MCItemDef.create("setoff_sls_purc_typ", "setoff_sls_purc_typ"),
				MCItemDef.create("setoff_purc_flg", "setoff_purc_flg"),
				MCItemDef.create("setoff_sls_flg", "setoff_sls_flg"),
				MCItemDef.create("setoff_tax_cd", "setoff_tax_cd"),
				MCItemDef.create("setoff_tax_nm", "setoff_tax_nm"),
				MCItemDef.create("setoff_tax_rate", "setoff_tax_rate"),
				MCItemDef.create("setoff_debt_cred_id_typ", "setoff_debt_cred_id_typ"),
				MCItemDef.create("setoff_debt_cred_id_typ_nm", "setoff_debt_cred_id_typ_nm"),
				MCItemDef.create("setoff_debt_cred_id_cd", "setoff_debt_cred_id_cd"),
				MCItemDef.create("setoff_debt_cred_nm", "setoff_debt_cred_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr")
			}
			,
			MCBlockDef.create("Rcv")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0210_Ins01_INFO = new MCOperationInfo("MS", "MSBGL0210", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0210_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "usr_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL0210_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_Rcv] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_cd2", "ar_sttl_cd2"),
				MCItemDef.create("tax_cd", "tax_cd1"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("rcv_amt_p" + ".amt", "rcv_amt"),
				MCItemDef.create("not_proc_bal_p" + ".amt", "not_proc_bal"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("debt_cred_id_typ", "debt_cred_id_typ"),
				MCItemDef.create("debt_cred_id_cd", "debt_cred_id_cd"),
				MCItemDef.create("debt_cred_nm", "debt_cred_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("note_mng_no", "note_mng_no"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3"),
				MCItemDef.create("setoff_rcv_no", "setoff_rcv_no"),
				MCItemDef.create("setoff_trd_cur_cd", "setoff_trd_cur_cd"),
				MCItemDef.create("setoff_xrate_p" + ".xrate", "setoff_xrate"),
				MCItemDef.create("setoff_rcv_amt_p" + ".amt", "setoff_rcv_amt"),
				MCItemDef.create("setoff_not_proc_bal_p" + ".amt", "setoff_not_proc_bal"),
				MCItemDef.create("setoff_dt", "setoff_dt"),
				MCItemDef.create("setoff_bcst_cd", "setoff_bcst_cd"),
				MCItemDef.create("setoff_trd_rmrks", "setoff_trd_rmrks"),
				MCItemDef.create("setoff_sub_char1", "setoff_sub_char1"),
				MCItemDef.create("setoff_sub_char2", "setoff_sub_char2"),
				MCItemDef.create("setoff_sub_char3", "setoff_sub_char3"),
				MCItemDef.create("setoff_sttl_cd1", "setoff_sttl_cd1"),
				MCItemDef.create("setoff_tax_cd", "setoff_tax_cd1"),
				MCItemDef.create("setoff_debt_cred_id_typ", "setoff_debt_cred_id_typ"),
				MCItemDef.create("setoff_debt_cred_id_cd", "setoff_debt_cred_id_cd"),
				MCItemDef.create("setoff_debt_cred_nm", "setoff_debt_cred_nm"),
				MCItemDef.create("setoff_bd_dpt_cd", "setoff_bd_dpt_cd")
			}
			,
			MCBlockDef.create("Rcv")
		);
	}

	public static MCContainerDef MS_MSBGL0210_Ins01_UP_BLOCK2() {
		/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("check", "check"),
				MCItemDef.create("grp_seq", "grp_seq"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("amt1_p" + ".amt", "amt1"),
				MCItemDef.create("amt2_p" + ".amt", "amt2"),
				MCItemDef.create("amt3_p" + ".amt", "amt3"),
				MCItemDef.create("bill_d_rmrks", "bill_d_rmrks"),
				MCItemDef.create("ar_appl_schd_no", "ar_appl_schd_no"),
				MCItemDef.create("ar_appl_schd_upd_cntr", "ar_appl_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBGL0210_Ins01_UP_BLOCK3() {
		/** Ope.のBlock [Ins01_BillD] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("grp_seq", "grp_seq"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("parent_bill_d_no", "parent_bill_d_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("appl_tgt_amt", "appl_tgt_amt"),
				MCItemDef.create("ttl_appl_amt", "ttl_appl_amt"),
				MCItemDef.create("appl_amt", "appl_amt")
			}
			,
			MCBlockDef.create("BillD")
		);
	}


	public static MCContainerDef MS_MSBGL0210_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_rev", "rcv_act_rev"),
				MCItemDef.create("ac_ym", "ac_ym")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL0210_Ins01_DOWN_BLOCK1() {
	/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0210_Upd01_INFO = new MCOperationInfo("MS", "MSBGL0210", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0210_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "usr_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("rcv_act_upd_cntr", "rcv_act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL0210_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Rcv] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_cd2", "ar_sttl_cd2"),
				MCItemDef.create("tax_cd", "tax_cd1"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("rcv_amt_p" + ".amt", "rcv_amt"),
				MCItemDef.create("not_proc_bal_p" + ".amt", "not_proc_bal"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("debt_cred_id_typ", "debt_cred_id_typ"),
				MCItemDef.create("debt_cred_id_cd", "debt_cred_id_cd"),
				MCItemDef.create("debt_cred_nm", "debt_cred_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("note_mng_no", "note_mng_no"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3"),
				MCItemDef.create("setoff_rcv_no", "setoff_rcv_no"),
				MCItemDef.create("setoff_trd_cur_cd", "setoff_trd_cur_cd"),
				MCItemDef.create("setoff_xrate_p" + ".xrate", "setoff_xrate"),
				MCItemDef.create("setoff_rcv_amt_p" + ".amt", "setoff_rcv_amt"),
				MCItemDef.create("setoff_not_proc_bal_p" + ".amt", "setoff_not_proc_bal"),
				MCItemDef.create("setoff_dt", "setoff_dt"),
				MCItemDef.create("setoff_bcst_cd", "setoff_bcst_cd"),
				MCItemDef.create("setoff_trd_rmrks", "setoff_trd_rmrks"),
				MCItemDef.create("setoff_sub_char1", "setoff_sub_char1"),
				MCItemDef.create("setoff_sub_char2", "setoff_sub_char2"),
				MCItemDef.create("setoff_sub_char3", "setoff_sub_char3"),
				MCItemDef.create("setoff_sttl_cd1", "setoff_sttl_cd1"),
				MCItemDef.create("setoff_tax_cd", "setoff_tax_cd1"),
				MCItemDef.create("setoff_debt_cred_id_typ", "setoff_debt_cred_id_typ"),
				MCItemDef.create("setoff_debt_cred_id_cd", "setoff_debt_cred_id_cd"),
				MCItemDef.create("setoff_debt_cred_nm", "setoff_debt_cred_nm"),
				MCItemDef.create("setoff_bd_dpt_cd", "setoff_bd_dpt_cd")
			}
			,
			MCBlockDef.create("Rcv")
		);
	}

	public static MCContainerDef MS_MSBGL0210_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("check", "check"),
				MCItemDef.create("grp_seq", "grp_seq"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("amt1_p" + ".amt", "amt1"),
				MCItemDef.create("amt2_p" + ".amt", "amt2"),
				MCItemDef.create("amt3_p" + ".amt", "amt3"),
				MCItemDef.create("bill_d_rmrks", "bill_d_rmrks"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq"),
				MCItemDef.create("ar_appl_schd_no", "ar_appl_schd_no"),
				MCItemDef.create("ar_appl_schd_upd_cntr", "ar_appl_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBGL0210_Upd01_UP_BLOCK3() {
		/** Ope.のBlock [Upd01_BillD] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("grp_seq", "grp_seq"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("parent_bill_d_no", "parent_bill_d_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("appl_tgt_amt", "appl_tgt_amt"),
				MCItemDef.create("ttl_appl_amt", "ttl_appl_amt"),
				MCItemDef.create("appl_amt", "appl_amt"),
				MCItemDef.create("bill_d_upd_cntr", "bill_d_upd_cntr"),
				MCItemDef.create("bill_d_appl_bal_upd_cntr", "bill_d_appl_bal_upd_cntr")
			}
			,
			MCBlockDef.create("BillD")
		);
	}


	public static MCContainerDef MS_MSBGL0210_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_rev", "rcv_act_rev"),
				MCItemDef.create("ac_ym", "ac_ym")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL0210_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0210_Del01_INFO = new MCOperationInfo("MS", "MSBGL0210", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0210_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("rcv_act_upd_cntr", "rcv_act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL0210_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_Rcv] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("setoff_rcv_no", "setoff_rcv_no"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr")
			}
			,
			MCBlockDef.create("Rcv")
		);
	}

	public static MCContainerDef MS_MSBGL0210_Del01_UP_BLOCK2() {
		/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Del01",
			new MCItemDef[]{
				MCItemDef.create("check", "check"),
				MCItemDef.create("grp_seq", "grp_seq"),
				MCItemDef.create("ar_appl_schd_no", "ar_appl_schd_no"),
				MCItemDef.create("ar_appl_schd_upd_cntr", "ar_appl_schd_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MS_MSBGL0210_Del01_UP_BLOCK3() {
		/** Ope.のBlock [Del01_BillD] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Del01",
			new MCItemDef[]{
				MCItemDef.create("grp_seq", "grp_seq"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("parent_bill_d_no", "parent_bill_d_no"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("bill_d_upd_cntr", "bill_d_upd_cntr"),
				MCItemDef.create("bill_d_appl_bal_upd_cntr", "bill_d_appl_bal_upd_cntr")
			}
			,
			MCBlockDef.create("BillD")
		);
	}


	public static MCContainerDef MS_MSBGL0210_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0210", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

