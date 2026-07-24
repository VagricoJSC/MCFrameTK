package mcframe.clientMSBH.MSBHP0070;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBHP_AdvPayReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL0070.Srch01.UP.BLOCK0")){
			return MS_MSBHL0070_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0070.Srch01.DOWN.BLOCK0")){
			return MS_MSBHL0070_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0070.Ins01.UP.BLOCK0")){
			return MS_MSBHL0070_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0070.Ins01.DOWN.BLOCK0")){
			return MS_MSBHL0070_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0070.Upd01.UP.BLOCK0")){
			return MS_MSBHL0070_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0070.Upd01.DOWN.BLOCK0")){
			return MS_MSBHL0070_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0070.Del01.UP.BLOCK0")){
			return MS_MSBHL0070_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBHL0070_Srch01_INFO = new MCOperationInfo("MS", "MSBHL0070", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0070_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_rev", "adv_pay_act_rev"),
				MCItemDef.create("latest_flg", "latest_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0070_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0070", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act_rev", "adv_pay_act_rev"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("psppl_nm", "psppl_nm"),
				MCItemDef.create("psppl_rmrks", "psppl_rmrks"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "pay_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "pay_usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("bd_dpt_nm", "bd_dpt_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("trd_cur_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_setoff_tgt_amt_p" + ".amt", "trd_cur_setoff_tgt_amt"),
				MCItemDef.create("trd_cur_setoff_schd_amt_p" + ".amt", "trd_cur_setoff_schd_amt"),
				MCItemDef.create("trd_cur_setoff_act_amt_p" + ".amt", "trd_cur_setoff_act_amt"),
				MCItemDef.create("trd_cur_not_proc_bal_p" + ".amt", "trd_cur_not_proc_bal"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_nm", "pay_bank_ac_nm"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("com_paid_ap_sttl_cd", "com_paid_ap_sttl_cd"),
				MCItemDef.create("com_paid_ap_sttl_nm", "com_paid_ap_sttl_nm"),
				MCItemDef.create("com_paid_ap_sttl_typ", "com_paid_ap_sttl_typ"),
				MCItemDef.create("com_paid_ap_sttl_typ_nm", "com_paid_ap_sttl_typ_nm"),
				MCItemDef.create("trd_cur_com_paid_p" + ".amt", "trd_cur_com_paid"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("trd_cur_com_paid_tax_amt_p" + ".amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("note_typ_nm", "note_typ_nm"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("note_days", "note_days"),
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
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("adv_pay_upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0070_Ins01_INFO = new MCOperationInfo("MS", "MSBHL0070", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0070_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0070", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "pay_usr_cd"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("com_paid_ap_sttl_cd", "com_paid_ap_sttl_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("trd_cur_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid_p" + ".amt", "trd_cur_com_paid"),
				MCItemDef.create("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("note_days", "note_days"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBHL0070_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0070", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act_rev", "adv_pay_act_rev"),
				MCItemDef.create("ac_ym", "ac_ym")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0070_Upd01_INFO = new MCOperationInfo("MS", "MSBHL0070", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0070_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0070", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "pay_usr_cd"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("com_paid_ap_sttl_cd", "com_paid_ap_sttl_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("trd_cur_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid_p" + ".amt", "trd_cur_com_paid"),
				MCItemDef.create("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("note_days", "note_days"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3"),
				MCItemDef.create("adv_pay_upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	public static MCContainerDef MS_MSBHL0070_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0070", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("adv_pay_act_rev", "adv_pay_act_rev"),
				MCItemDef.create("ac_ym", "ac_ym")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0070_Del01_INFO = new MCOperationInfo("MS", "MSBHL0070", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0070_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0070", "Del01",
			new MCItemDef[]{
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("adv_pay_upd_cntr", "adv_pay_upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

