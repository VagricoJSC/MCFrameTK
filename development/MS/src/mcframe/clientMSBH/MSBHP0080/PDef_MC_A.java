package mcframe.clientMSBH.MSBHP0080;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBHP_AdvPaySrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL0080.Srch01.UP.BLOCK0")){
			return MS_MSBHL0080_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0080.Srch01.DOWN.BLOCK0")){
			return MS_MSBHL0080_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBHL0080_Srch01_INFO = new MCOperationInfo("MS", "MSBHL0080", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0080_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("psppl_nm", "psppl_nm"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("pay_usr_cd", "pay_usr_cd"),
				MCItemDef.create("pay_usr_nm", "pay_usr_nm"),
				MCItemDef.create("pay_act_dt_fr", "pay_act_dt_fr"),
				MCItemDef.create("pay_act_dt_to", "pay_act_dt_to"),
				MCItemDef.create("ac_dt_fr", "ac_dt_fr"),
				MCItemDef.create("ac_dt_to", "ac_dt_to"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("incl_appl_flg", "incl_appl_flg"),
				MCItemDef.create("incl_can_red_flg", "incl_can_red_flg"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_flg1", "psppl_grp_flg1"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd1", "psppl_grp_cd1"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm1", "psppl_grp_nm1"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_flg2", "psppl_grp_flg2"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd2", "psppl_grp_cd2"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm2", "psppl_grp_nm2"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_flg3", "psppl_grp_flg3"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd3", "psppl_grp_cd3"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm3", "psppl_grp_nm3"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_flg4", "psppl_grp_flg4"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd4", "psppl_grp_cd4"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm4", "psppl_grp_nm4"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_flg5", "psppl_grp_flg5"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd5", "psppl_grp_cd5"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm5", "psppl_grp_nm5"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_flg6", "psppl_grp_flg6"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd6", "psppl_grp_cd6"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm6", "psppl_grp_nm6"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_flg7", "psppl_grp_flg7"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd7", "psppl_grp_cd7"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm7", "psppl_grp_nm7"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_flg8", "psppl_grp_flg8"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd8", "psppl_grp_cd8"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm8", "psppl_grp_nm8"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_flg9", "psppl_grp_flg9"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd9", "psppl_grp_cd9"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm9", "psppl_grp_nm9"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_flg10", "psppl_grp_flg10"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd10", "psppl_grp_cd10"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm10", "psppl_grp_nm10"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_flg1", "bsppl_grp_flg1"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd1", "bsppl_grp_cd1"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm1", "bsppl_grp_nm1"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_flg2", "bsppl_grp_flg2"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd2", "bsppl_grp_cd2"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm2", "bsppl_grp_nm2"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_flg3", "bsppl_grp_flg3"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd3", "bsppl_grp_cd3"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm3", "bsppl_grp_nm3"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_flg4", "bsppl_grp_flg4"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd4", "bsppl_grp_cd4"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm4", "bsppl_grp_nm4"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_flg5", "bsppl_grp_flg5"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd5", "bsppl_grp_cd5"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm5", "bsppl_grp_nm5"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_flg6", "bsppl_grp_flg6"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd6", "bsppl_grp_cd6"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm6", "bsppl_grp_nm6"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_flg7", "bsppl_grp_flg7"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd7", "bsppl_grp_cd7"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm7", "bsppl_grp_nm7"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_flg8", "bsppl_grp_flg8"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd8", "bsppl_grp_cd8"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm8", "bsppl_grp_nm8"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_flg9", "bsppl_grp_flg9"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd9", "bsppl_grp_cd9"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm9", "bsppl_grp_nm9"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_flg10", "bsppl_grp_flg10"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd10", "bsppl_grp_cd10"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm10", "bsppl_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0080_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act_rev", "adv_pay_act_rev"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("psppl_nm", "psppl_nm"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("pay_usr_cd", "pay_usr_cd"),
				MCItemDef.create("pay_usr_nm", "pay_usr_nm"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("com_paid_ap_sttl_cd", "com_paid_ap_sttl_cd"),
				MCItemDef.create("com_paid_ap_sttl_nm", "com_paid_ap_sttl_nm"),
				MCItemDef.create("com_paid_ap_sttl_typ", "com_paid_ap_sttl_typ"),
				MCItemDef.create("com_paid_ap_sttl_typ_nm", "com_paid_ap_sttl_typ_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_nm", "pay_bank_ac_nm"),
				MCItemDef.create("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg"),
				MCItemDef.create("trd_cur_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid_p" + ".amt", "trd_cur_com_paid"),
				MCItemDef.create("trd_cur_com_paid_tax_amt_p" + ".amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("trd_cur_exc_com_paid_p" + ".amt", "trd_cur_exc_com_paid"),
				MCItemDef.create("trd_cur_setoff_tgt_amt_p" + ".amt", "trd_cur_setoff_tgt_amt"),
				MCItemDef.create("trd_cur_setoff_schd_amt_p" + ".amt", "trd_cur_setoff_schd_amt"),
				MCItemDef.create("trd_cur_setoff_act_amt_p" + ".amt", "trd_cur_setoff_act_amt"),
				MCItemDef.create("trd_cur_not_proc_bal_p" + ".amt", "trd_cur_not_proc_bal"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_com_paid_p" + ".amt", "base_cur_com_paid"),
				MCItemDef.create("base_cur_com_paid_tax_amt_p" + ".amt", "base_cur_com_paid_tax_amt"),
				MCItemDef.create("base_cur_exc_com_paid_p" + ".amt", "base_cur_exc_com_paid"),
				MCItemDef.create("base_cur_setoff_tgt_amt_p" + ".amt", "base_cur_setoff_tgt_amt"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("note_typ_nm", "note_typ_nm"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("note_rsn_nm", "note_rsn_nm"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("note_days", "note_days"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_bank_nm", "draw_bank_nm"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("draw_branch_nm", "draw_branch_nm"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd1", "psppl_grp_cd1"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm1", "psppl_grp_nm1"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd2", "psppl_grp_cd2"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm2", "psppl_grp_nm2"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd3", "psppl_grp_cd3"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm3", "psppl_grp_nm3"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd4", "psppl_grp_cd4"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm4", "psppl_grp_nm4"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd5", "psppl_grp_cd5"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm5", "psppl_grp_nm5"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd6", "psppl_grp_cd6"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm6", "psppl_grp_nm6"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd7", "psppl_grp_cd7"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm7", "psppl_grp_nm7"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd8", "psppl_grp_cd8"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm8", "psppl_grp_nm8"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd9", "psppl_grp_cd9"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm9", "psppl_grp_nm9"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_cd10", "psppl_grp_cd10"),
				MCItemDef.create("psppl_grp_p" + ".bp_grp_nm10", "psppl_grp_nm10"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd1", "bsppl_grp_cd1"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm1", "bsppl_grp_nm1"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd2", "bsppl_grp_cd2"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm2", "bsppl_grp_nm2"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd3", "bsppl_grp_cd3"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm3", "bsppl_grp_nm3"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd4", "bsppl_grp_cd4"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm4", "bsppl_grp_nm4"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd5", "bsppl_grp_cd5"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm5", "bsppl_grp_nm5"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd6", "bsppl_grp_cd6"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm6", "bsppl_grp_nm6"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd7", "bsppl_grp_cd7"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm7", "bsppl_grp_nm7"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd8", "bsppl_grp_cd8"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm8", "bsppl_grp_nm8"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd9", "bsppl_grp_cd9"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm9", "bsppl_grp_nm9"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_cd10", "bsppl_grp_cd10"),
				MCItemDef.create("bsppl_grp_p" + ".bp_grp_nm10", "bsppl_grp_nm10"),
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

