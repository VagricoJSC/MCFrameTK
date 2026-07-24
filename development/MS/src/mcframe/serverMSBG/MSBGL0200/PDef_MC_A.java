package mcframe.serverMSBG.MSBGL0200;

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
 * [MSBGL_AdvRcvReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0200.Srch01.UP.BLOCK0")){
			return MS_MSBGL0200_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0200.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0200_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0200.Srch01.DOWN.BLOCK1")){
			return MS_MSBGL0200_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0200.Srch01.DOWN.BLOCK2")){
			return MS_MSBGL0200_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0200.Srch02.UP.BLOCK0")){
			return MS_MSBGL0200_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0200.Srch02.DOWN.BLOCK0")){
			return MS_MSBGL0200_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0200.Chk01.UP.BLOCK0")){
			return MS_MSBGL0200_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0200.Chk01.UP.BLOCK1")){
			return MS_MSBGL0200_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0200.Chk01.UP.BLOCK2")){
			return MS_MSBGL0200_Chk01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0200.Chk01.DOWN.BLOCK0")){
			return MS_MSBGL0200_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0200.Chk01.DOWN.BLOCK1")){
			return MS_MSBGL0200_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0200.Chk01.DOWN.BLOCK2")){
			return MS_MSBGL0200_Chk01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0200.Chk02.UP.BLOCK0")){
			return MS_MSBGL0200_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0200.Chk02.UP.BLOCK1")){
			return MS_MSBGL0200_Chk02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0200.Chk02.DOWN.BLOCK0")){
			return MS_MSBGL0200_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0200.Chk02.DOWN.BLOCK1")){
			return MS_MSBGL0200_Chk02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0200.Ins01.UP.BLOCK0")){
			return MS_MSBGL0200_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0200.Ins01.UP.BLOCK1")){
			return MS_MSBGL0200_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0200.Ins01.UP.BLOCK2")){
			return MS_MSBGL0200_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0200.Ins01.DOWN.BLOCK0")){
			return MS_MSBGL0200_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0200.Ins01.DOWN.BLOCK1")){
			return MS_MSBGL0200_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0200.Upd01.UP.BLOCK0")){
			return MS_MSBGL0200_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0200.Upd01.UP.BLOCK1")){
			return MS_MSBGL0200_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0200.Upd01.UP.BLOCK2")){
			return MS_MSBGL0200_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0200.Upd01.DOWN.BLOCK0")){
			return MS_MSBGL0200_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0200.Upd01.DOWN.BLOCK1")){
			return MS_MSBGL0200_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0200.Del01.UP.BLOCK0")){
			return MS_MSBGL0200_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0200.Del01.UP.BLOCK1")){
			return MS_MSBGL0200_Del01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0200.Del01.DOWN.BLOCK0")){
			return MS_MSBGL0200_Del01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBGL0200_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0200", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0200_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_rev", "rcv_act_rev"),
				MCItemDef.create("latest_flg", "latest_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0200_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_rev", "rcv_act_rev"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
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
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL0200_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("div_flg", "div_flg"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("not_proc_bal", "not_proc_bal"),
				MCItemDef.create("not_proc_bal_w", "not_proc_bal_w"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_typ1", "ar_sttl_typ1"),
				MCItemDef.create("ar_sttl_nm1", "ar_sttl_nm1"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("ar_sttl_cd2", "ar_sttl_cd2"),
				MCItemDef.create("ar_sttl_nm2", "ar_sttl_nm2"),
				MCItemDef.create("sls_purc_typ2", "sls_purc_typ2"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("debtor_id_typ", "debtor_id_typ"),
				MCItemDef.create("debtor_id_typ_nm", "debtor_id_typ_nm"),
				MCItemDef.create("debtor_id_cd", "debtor_id_cd"),
				MCItemDef.create("debtor_nm", "debtor_nm"),
				MCItemDef.create("debt_bd_dpt_cd", "debt_bd_dpt_cd"),
				MCItemDef.create("debt_bd_dpt_nm", "debt_bd_dpt_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("old_rcst_cd", "old_rcst_cd"),
				MCItemDef.create("old_bcst_cd", "old_bcst_cd"),
				MCItemDef.create("old_bill_dpt_cd", "old_bill_dpt_cd"),
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
				MCItemDef.create("ar_sttl_cd3", "ar_sttl_cd3"),
				MCItemDef.create("ar_sttl_nm3", "ar_sttl_nm3"),
				MCItemDef.create("creditor_id_typ", "creditor_id_typ"),
				MCItemDef.create("creditor_id_typ_nm", "creditor_id_typ_nm"),
				MCItemDef.create("creditor_id_cd", "creditor_id_cd"),
				MCItemDef.create("creditor_nm", "creditor_nm"),
				MCItemDef.create("cred_bd_dpt_cd", "cred_bd_dpt_cd"),
				MCItemDef.create("cred_bd_dpt_nm", "cred_bd_dpt_nm"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("bill_dtl_adv_flg", "bill_dtl_adv_flg")
			}
			,
			MCBlockDef.create("Srch01_Rcv")
		);
	}
	public static MCContainerDef MS_MSBGL0200_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("amt1", "amt1"),
				MCItemDef.create("amt2", "amt2"),
				MCItemDef.create("appl_amt", "appl_amt"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0200_Srch02_INFO = new MCOperationInfo("MS", "MSBGL0200", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0200_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("rcv_no", "rcv_no")
			}
			,
			MCBlockDef.create("Srch02_Rcv")
		);
	}


	public static MCContainerDef MS_MSBGL0200_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("dat_typ", "dat_typ"),
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
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("not_proc_bal", "not_proc_bal"),
				MCItemDef.create("not_proc_bal_w", "not_proc_bal_w"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_typ1", "ar_sttl_typ1"),
				MCItemDef.create("ar_sttl_nm1", "ar_sttl_nm1"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("ar_sttl_cd2", "ar_sttl_cd2"),
				MCItemDef.create("ar_sttl_nm2", "ar_sttl_nm2"),
				MCItemDef.create("sls_purc_typ2", "sls_purc_typ2"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("sls_flg", "sls_flg"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("debtor_id_typ", "debtor_id_typ"),
				MCItemDef.create("debtor_id_typ_nm", "debtor_id_typ_nm"),
				MCItemDef.create("debtor_id_cd", "debtor_id_cd"),
				MCItemDef.create("debtor_nm", "debtor_nm"),
				MCItemDef.create("old_rcst_cd", "old_rcst_cd"),
				MCItemDef.create("old_bcst_cd", "old_bcst_cd"),
				MCItemDef.create("old_bill_dpt_cd", "old_bill_dpt_cd"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
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
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("bill_dtl_adv_flg", "bill_dtl_adv_flg")
			}
			,
			MCBlockDef.create("Srch02_Rcv")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0200_Chk01_INFO = new MCOperationInfo("MS", "MSBGL0200", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0200_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_upd_cntr", "rcv_act_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL0200_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_cd2", "ar_sttl_cd2"),
				MCItemDef.create("ar_sttl_cd3", "ar_sttl_cd3"),
				MCItemDef.create("tax_cd1", "tax_cd1"),
				MCItemDef.create("tax_cd2", "tax_cd2"),
				MCItemDef.create("tax_cd3", "tax_cd3"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("debtor_id_typ", "debtor_id_typ"),
				MCItemDef.create("debtor_id_cd", "debtor_id_cd"),
				MCItemDef.create("debtor_nm", "debtor_nm"),
				MCItemDef.create("debt_bd_dpt_cd", "debt_bd_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("creditor_id_typ", "creditor_id_typ"),
				MCItemDef.create("creditor_id_cd", "creditor_id_cd"),
				MCItemDef.create("creditor_nm", "creditor_nm"),
				MCItemDef.create("cred_bd_dpt_cd", "cred_bd_dpt_cd"),
				MCItemDef.create("bill_dtl_adv_flg", "bill_dtl_adv_flg")
			}
			,
			MCBlockDef.create("Rcv")
		);
	}

	public static MCContainerDef MS_MSBGL0200_Chk01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("amt1", "amt1"),
				MCItemDef.create("amt2", "amt2"),
				MCItemDef.create("amt3", "amt3")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBGL0200_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("ar_trd_grp_typ", "ar_trd_grp_typ"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL0200_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_typ1", "ar_sttl_typ1"),
				MCItemDef.create("ar_sttl_cd2", "ar_sttl_cd2"),
				MCItemDef.create("ar_sttl_typ2", "ar_sttl_typ2"),
				MCItemDef.create("ar_sttl_cd3", "ar_sttl_cd3"),
				MCItemDef.create("ar_sttl_typ3", "ar_sttl_typ3"),
				MCItemDef.create("tax_cd1", "tax_cd1"),
				MCItemDef.create("tax_rate1", "tax_rate1"),
				MCItemDef.create("tax_typ1", "tax_typ1"),
				MCItemDef.create("tax_cd2", "tax_cd2"),
				MCItemDef.create("tax_rate2", "tax_rate2"),
				MCItemDef.create("tax_typ2", "tax_typ2"),
				MCItemDef.create("tax_cd3", "tax_cd3"),
				MCItemDef.create("tax_rate3", "tax_rate3"),
				MCItemDef.create("tax_typ3", "tax_typ3"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("debtor_id_typ", "debtor_id_typ"),
				MCItemDef.create("debtor_id_cd", "debtor_id_cd"),
				MCItemDef.create("debtor_nm", "debtor_nm"),
				MCItemDef.create("debt_bd_dpt_cd", "debt_bd_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("creditor_id_typ", "creditor_id_typ"),
				MCItemDef.create("creditor_id_cd", "creditor_id_cd"),
				MCItemDef.create("creditor_nm", "creditor_nm"),
				MCItemDef.create("cred_bd_dpt_cd", "cred_bd_dpt_cd"),
				MCItemDef.create("bill_dtl_adv_flg", "bill_dtl_adv_flg")
			}
			,
			MCBlockDef.create("Rcv")
		);
	}
	public static MCContainerDef MS_MSBGL0200_Chk01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("amt1", "amt1"),
				MCItemDef.create("amt2", "amt2"),
				MCItemDef.create("amt3", "amt3"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0200_Chk02_INFO = new MCOperationInfo("MS", "MSBGL0200", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0200_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_upd_cntr", "rcv_act_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL0200_Chk02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rcv")
		);
	}


	public static MCContainerDef MS_MSBGL0200_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq")
			}
			,
			MCBlockDef.create("Chk02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL0200_Chk02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("slo_no", "slo_no")
			}
			,
			MCBlockDef.create("Chk02_Rcv")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0200_Ins01_INFO = new MCOperationInfo("MS", "MSBGL0200", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0200_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("ac_dt", "ac_dt")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL0200_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_cd2", "ar_sttl_cd2"),
				MCItemDef.create("ar_sttl_cd3", "ar_sttl_cd3"),
				MCItemDef.create("tax_cd1", "tax_cd1"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("debtor_id_typ", "debtor_id_typ"),
				MCItemDef.create("debtor_id_cd", "debtor_id_cd"),
				MCItemDef.create("debtor_nm", "debtor_nm"),
				MCItemDef.create("debt_bd_dpt_cd", "debt_bd_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("creditor_id_typ", "creditor_id_typ"),
				MCItemDef.create("creditor_id_cd", "creditor_id_cd"),
				MCItemDef.create("creditor_nm", "creditor_nm"),
				MCItemDef.create("cred_bd_dpt_cd", "cred_bd_dpt_cd"),
				MCItemDef.create("bill_dtl_adv_flg", "bill_dtl_adv_flg")
			}
			,
			MCBlockDef.create("Ins01_Rcv")
		);
	}

	public static MCContainerDef MS_MSBGL0200_Ins01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("amt1", "amt1"),
				MCItemDef.create("amt2", "amt2")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBGL0200_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_rev", "rcv_act_rev")
			}
			,
			MCBlockDef.create("Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL0200_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0200_Upd01_INFO = new MCOperationInfo("MS", "MSBGL0200", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0200_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_upd_cntr", "rcv_act_upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL0200_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_cd2", "ar_sttl_cd2"),
				MCItemDef.create("ar_sttl_cd3", "ar_sttl_cd3"),
				MCItemDef.create("tax_cd1", "tax_cd1"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("debtor_id_typ", "debtor_id_typ"),
				MCItemDef.create("debtor_id_cd", "debtor_id_cd"),
				MCItemDef.create("debtor_nm", "debtor_nm"),
				MCItemDef.create("debt_bd_dpt_cd", "debt_bd_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr"),
				MCItemDef.create("creditor_id_typ", "creditor_id_typ"),
				MCItemDef.create("creditor_id_cd", "creditor_id_cd"),
				MCItemDef.create("creditor_nm", "creditor_nm"),
				MCItemDef.create("cred_bd_dpt_cd", "cred_bd_dpt_cd"),
				MCItemDef.create("bill_dtl_adv_flg", "bill_dtl_adv_flg")
			}
			,
			MCBlockDef.create("Upd01_Rcv")
		);
	}

	public static MCContainerDef MS_MSBGL0200_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("amt1", "amt1"),
				MCItemDef.create("amt2", "amt2"),
				MCItemDef.create("rcv_act_d_no", "rcv_act_d_no"),
				MCItemDef.create("rcv_act_d_seq", "rcv_act_d_seq")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBGL0200_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_rev", "rcv_act_rev")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL0200_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0200_Del01_INFO = new MCOperationInfo("MS", "MSBGL0200", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0200_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Del01",
			new MCItemDef[]{
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_upd_cntr", "rcv_act_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL0200_Del01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("rcv_upd_cntr", "rcv_upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rcv")
		);
	}


	public static MCContainerDef MS_MSBGL0200_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBGL0200", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

