package mcframe.clientMSBH.MSBHP0090;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBHP_PayActReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL0090.Srch01.UP.BLOCK0")){
			return MS_MSBHL0090_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0090.Srch01.DOWN.BLOCK0")){
			return MS_MSBHL0090_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0090.Srch01.DOWN.BLOCK1")){
			return MS_MSBHL0090_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0090.Srch02.UP.BLOCK0")){
			return MS_MSBHL0090_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0090.Srch02.UP.BLOCK1")){
			return MS_MSBHL0090_Srch02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0090.Srch02.DOWN.BLOCK0")){
			return MS_MSBHL0090_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0090.Srch02.DOWN.BLOCK1")){
			return MS_MSBHL0090_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0090.Ins01.UP.BLOCK0")){
			return MS_MSBHL0090_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0090.Ins01.UP.BLOCK1")){
			return MS_MSBHL0090_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0090.Ins01.DOWN.BLOCK0")){
			return MS_MSBHL0090_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0090.Ins01.DOWN.BLOCK1")){
			return MS_MSBHL0090_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0090.Upd01.UP.BLOCK0")){
			return MS_MSBHL0090_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0090.Upd01.UP.BLOCK1")){
			return MS_MSBHL0090_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0090.Upd01.DOWN.BLOCK0")){
			return MS_MSBHL0090_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0090.Upd01.DOWN.BLOCK1")){
			return MS_MSBHL0090_Upd01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0090.Del01.UP.BLOCK0")){
			return MS_MSBHL0090_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0090.Del01.UP.BLOCK1")){
			return MS_MSBHL0090_Del01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
					
	
	static final MCOperationInfo MS_MSBHL0090_Srch01_INFO = new MCOperationInfo("MS", "MSBHL0090", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0090_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("pay_act_rev", "pay_act_rev"),
				MCItemDef.create("latest_flg", "latest_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0090_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("pay_act_seq", "pay_act_seq"),
				MCItemDef.create("pay_act_rev", "pay_act_rev"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "pay_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_nm", "pay_usr_nm"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
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
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("psppl_nm", "psppl_nm"),
				MCItemDef.create("psppl_rmrks", "psppl_rmrks"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_nm", "pay_bank_ac_nm"),
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("ap_setoff_typ_nm", "ap_setoff_typ_nm"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("so_dpt_nm", "so_dpt_nm"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("note_sub_char3", "note_sub_char3")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL0090_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("check", "check"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pay_schd_amt_p" + ".amt", "pay_schd_amt"),
				MCItemDef.create("pay_schd_com_paid_tax_amt_p" + ".amt", "pay_schd_com_paid_tax_amt"),
				MCItemDef.create("appl_ttl_amt_p" + ".amt", "appl_ttl_amt"),
				MCItemDef.create("trd_cur_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("trd_cur_com_paid_tax_amt_p" + ".amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_nm", "pay_bank_ac_nm"),
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("ap_setoff_typ_nm", "ap_setoff_typ_nm"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("so_dpt_nm", "so_dpt_nm"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_com_paid_tax_amt_p" + ".amt", "base_cur_com_paid_tax_amt"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_schd_no", "pay_schd_no"),
				MCItemDef.create("ap_appl_schd_no", "ap_appl_schd_no"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("schd_ap_sttl_cd", "schd_ap_sttl_cd"),
				MCItemDef.create("schd_ap_sttl_nm", "schd_ap_sttl_nm"),
				MCItemDef.create("schd_ap_sttl_typ", "schd_ap_sttl_typ"),
				MCItemDef.create("schd_ap_sttl_typ_nm", "schd_ap_sttl_typ_nm"),
				MCItemDef.create("sw_flg", "sw_flg"),
				MCItemDef.create("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0090_Srch02_INFO = new MCOperationInfo("MS", "MSBHL0090", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0090_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("pay_act_seq", "pay_act_seq"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pay_dpt_narrow_down_flg", "pay_dpt_narrow_down_flg"),
				MCItemDef.create("ap_sttl_narrow_down_flg", "ap_sttl_narrow_down_flg"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL0090_Srch02_UP_BLOCK1() {
		/** Ope.のBlock [Srch02_Cnd2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("pay_schd_no", "pay_schd_no")
			}
			,
			MCBlockDef.create("PaySchdTgt")
		);
	}


	public static MCContainerDef MS_MSBHL0090_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_nm", "pay_bank_ac_nm"),
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("ap_setoff_typ_nm", "ap_setoff_typ_nm"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("so_dpt_nm", "so_dpt_nm"),
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
				MCItemDef.create("note_rsn_nm", "note_rsn_nm")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL0090_Srch02_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch02_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("check", "check"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("pay_schd_amt_p" + ".amt", "pay_schd_amt"),
				MCItemDef.create("pay_schd_com_paid_tax_amt_p" + ".amt", "pay_schd_com_paid_tax_amt"),
				MCItemDef.create("appl_ttl_amt_p" + ".amt", "appl_ttl_amt"),
				MCItemDef.create("trd_cur_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("trd_cur_com_paid_tax_amt_p" + ".amt", "trd_cur_com_paid_tax_amt"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_nm", "pay_bank_ac_nm"),
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("ap_setoff_typ_nm", "ap_setoff_typ_nm"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("so_dpt_nm", "so_dpt_nm"),
				MCItemDef.create("base_cur_amt_p" + ".amt", "base_cur_amt"),
				MCItemDef.create("base_cur_com_paid_tax_amt_p" + ".amt", "base_cur_com_paid_tax_amt"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_schd_no", "pay_schd_no"),
				MCItemDef.create("ap_appl_schd_no", "ap_appl_schd_no"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("schd_ap_sttl_cd", "schd_ap_sttl_cd"),
				MCItemDef.create("schd_ap_sttl_nm", "schd_ap_sttl_nm"),
				MCItemDef.create("schd_ap_sttl_typ", "schd_ap_sttl_typ"),
				MCItemDef.create("schd_ap_sttl_typ_nm", "schd_ap_sttl_typ_nm"),
				MCItemDef.create("sw_flg", "sw_flg"),
				MCItemDef.create("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0090_Ins01_INFO = new MCOperationInfo("MS", "MSBHL0090", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0090_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "pay_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("note_days", "note_days"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL0090_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("trd_cur_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ap_appl_schd_no", "ap_appl_schd_no"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBHL0090_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("pay_act_seq", "pay_act_seq"),
				MCItemDef.create("pay_act_rev", "pay_act_rev"),
				MCItemDef.create("ac_ym", "ac_ym")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL0090_Ins01_DOWN_BLOCK1() {
	/** Ope.のBlock [Ins01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0090_Upd01_INFO = new MCOperationInfo("MS", "MSBHL0090", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0090_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("pay_act_seq", "pay_act_seq"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("ac_dt_p" + ".ac_dt", "ac_dt"),
				MCItemDef.create("pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "pay_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("xrate_p" + ".xrate", "xrate"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("note_typ", "note_typ"),
				MCItemDef.create("draw_dt", "draw_dt"),
				MCItemDef.create("note_days", "note_days"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("drawer_nm", "drawer_nm"),
				MCItemDef.create("endrsr", "endrsr"),
				MCItemDef.create("accptr", "accptr"),
				MCItemDef.create("draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("note_sub_char1", "note_sub_char1"),
				MCItemDef.create("note_sub_char2", "note_sub_char2"),
				MCItemDef.create("note_sub_char3", "note_sub_char3")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL0090_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("trd_cur_amt_p" + ".amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ap_appl_schd_no", "ap_appl_schd_no"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSBHL0090_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("pay_act_seq", "pay_act_seq"),
				MCItemDef.create("pay_act_rev", "pay_act_rev"),
				MCItemDef.create("ac_ym", "ac_ym")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL0090_Upd01_DOWN_BLOCK1() {
	/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBHL0090_Del01_INFO = new MCOperationInfo("MS", "MSBHL0090", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0090_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Del01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("pay_act_seq", "pay_act_seq"),
				MCItemDef.create("can_ac_dt_p" + ".can_ac_dt_for_call", "can_ac_dt")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL0090_Del01_UP_BLOCK1() {
		/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0090", "Del01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

