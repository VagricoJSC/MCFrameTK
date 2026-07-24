package mcframe.serverMSBH.MSBHL5040;

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
 * [MSBHL_PayActRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL5040.PayAct_Chk01.UP.BLOCK0")){
			return MS_MSBHL5040_PayAct_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5040.PayAct_Chk01.UP.BLOCK1")){
			return MS_MSBHL5040_PayAct_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5040.PayAct_Chk01.DOWN.BLOCK0")){
			return MS_MSBHL5040_PayAct_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5040.PayAct_Chk01.DOWN.BLOCK1")){
			return MS_MSBHL5040_PayAct_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5040.PayAct_Upd01.UP.BLOCK0")){
			return MS_MSBHL5040_PayAct_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5040.PayAct_Upd01.UP.BLOCK1")){
			return MS_MSBHL5040_PayAct_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5040.PayAct_Upd01.DOWN.BLOCK0")){
			return MS_MSBHL5040_PayAct_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5040.PayAct_Upd01.DOWN.BLOCK1")){
			return MS_MSBHL5040_PayAct_Upd01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBHL5040_PayAct_Chk01_INFO = new MCOperationInfo("MS", "MSBHL5040", "PayAct_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5040_PayAct_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5040", "PayAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pa" + ".pay_act_no", "pay_act_no"),
				MCItemDef.create("pa" + ".pay_act_seq", "pay_act_seq"),
				MCItemDef.create("pa" + ".psppl_cd", "psppl_cd"),
				MCItemDef.create("pa" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pa" + ".pay_usr_cd", "pay_usr_cd"),
				MCItemDef.create("pa" + ".pay_act_dt", "pay_act_dt"),
				MCItemDef.create("pa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("pa" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pa" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pa" + ".xrate", "xrate"),
				MCItemDef.create("pa" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pa" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pa" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pa" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pa" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pa" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pa" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pa" + ".schd_act_flg", "schd_act_flg"),
				MCItemDef.create("pa" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("pa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pa" + ".par_pay_act_no", "par_pay_act_no"),
				MCItemDef.create("pa" + ".par_pay_act_seq", "par_pay_act_seq"),
				MCItemDef.create("pa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pn" + ".note_no", "note_no"),
				MCItemDef.create("pn" + ".note_typ", "note_typ"),
				MCItemDef.create("pn" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pn" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pn" + ".due_dt", "due_dt"),
				MCItemDef.create("pn" + ".note_days", "note_days"),
				MCItemDef.create("pn" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pn" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pn" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pn" + ".endrsr", "endrsr"),
				MCItemDef.create("pn" + ".accptr", "accptr"),
				MCItemDef.create("pn" + ".sub_char1", "note_sub_char1"),
				MCItemDef.create("pn" + ".sub_char2", "note_sub_char2"),
				MCItemDef.create("pn" + ".sub_char3", "note_sub_char3"),
				MCItemDef.create("upd_cntr_not_chk_flg", "upd_cntr_not_chk_flg"),
				MCItemDef.create("dac_not_chk_flg", "dac_not_chk_flg"),
				MCItemDef.create("pay_dpt_chng_flg", "pay_dpt_chng_flg")
			}
			,
			MCBlockDef.create("PayAct_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL5040_PayAct_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5040", "PayAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pad" + ".pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pad" + ".pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pad" + ".ap_appl_schd_no", "ap_appl_schd_no"),
				MCItemDef.create("pad" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pad" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("pad" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pad" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pad" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pad" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("pad" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pad" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pad" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pad" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pad" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pad" + ".base_cur_amt", "base_cur_amt"),
				MCItemDef.create("pad" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("pad" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pad" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pad" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pad" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pad" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pad" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pad" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pad" + ".wrk_no", "wrk_no"),
				MCItemDef.create("pad" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pad" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("pad" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pad" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("pad" + ".par_pay_act_d_no", "par_pay_act_d_no"),
				MCItemDef.create("pad" + ".par_pay_act_d_seq", "par_pay_act_d_seq"),
				MCItemDef.create("pad" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pad" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pad" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr"),
				MCItemDef.create("base_cur_amt_not_calc_flg", "base_cur_amt_not_calc_flg")
			}
			,
			MCBlockDef.create("PayAct_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBHL5040_PayAct_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5040", "PayAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pa" + ".pay_act_no", "pay_act_no"),
				MCItemDef.create("pa" + ".pay_act_seq", "pay_act_seq"),
				MCItemDef.create("pa" + ".psppl_cd", "psppl_cd"),
				MCItemDef.create("pa" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pa" + ".wg_cd", "wg_cd"),
				MCItemDef.create("pa" + ".pay_usr_cd", "pay_usr_cd"),
				MCItemDef.create("pa" + ".pay_act_dt", "pay_act_dt"),
				MCItemDef.create("pa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("pa" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pa" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pa" + ".xrate", "xrate"),
				MCItemDef.create("pa" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pa" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("pa" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pa" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pa" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pa" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pa" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pa" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pa" + ".schd_act_flg", "schd_act_flg"),
				MCItemDef.create("pa" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("pa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pa" + ".par_pay_act_no", "par_pay_act_no"),
				MCItemDef.create("pa" + ".par_pay_act_seq", "par_pay_act_seq"),
				MCItemDef.create("pa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pn" + ".pay_note_mng_no", "pay_note_mng_no"),
				MCItemDef.create("pn" + ".note_no", "note_no"),
				MCItemDef.create("pn" + ".note_typ", "note_typ"),
				MCItemDef.create("pn" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pn" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pn" + ".due_dt", "due_dt"),
				MCItemDef.create("pn" + ".note_days", "note_days"),
				MCItemDef.create("pn" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pn" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pn" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pn" + ".endrsr", "endrsr"),
				MCItemDef.create("pn" + ".accptr", "accptr"),
				MCItemDef.create("pn" + ".note_amt", "note_amt"),
				MCItemDef.create("pn" + ".sub_char1", "note_sub_char1"),
				MCItemDef.create("pn" + ".sub_char2", "note_sub_char2"),
				MCItemDef.create("pn" + ".sub_char3", "note_sub_char3"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PayAct_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL5040_PayAct_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5040", "PayAct_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pad" + ".pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pad" + ".pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pad" + ".pay_act_no", "pay_act_no"),
				MCItemDef.create("pad" + ".pay_act_seq", "pay_act_seq"),
				MCItemDef.create("pad" + ".ap_appl_schd_no", "ap_appl_schd_no"),
				MCItemDef.create("pad" + ".pay_schd_no", "pay_schd_no"),
				MCItemDef.create("pad" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pad" + ".pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pad" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("pad" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pad" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("pad" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("pad" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pad" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pad" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("pad" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pad" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pad" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pad" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pad" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pad" + ".base_cur_amt", "base_cur_amt"),
				MCItemDef.create("pad" + ".rcv_no", "rcv_no"),
				MCItemDef.create("pad" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("pad" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pad" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pad" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pad" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pad" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pad" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pad" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pad" + ".wrk_no", "wrk_no"),
				MCItemDef.create("pad" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pad" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("pad" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pad" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("pad" + ".par_pay_act_d_no", "par_pay_act_d_no"),
				MCItemDef.create("pad" + ".par_pay_act_d_seq", "par_pay_act_d_seq"),
				MCItemDef.create("pad" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pad" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pad" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pad" + ".disp_seq", "disp_seq"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr"),
				MCItemDef.create("base_cur_amt_not_calc_flg", "base_cur_amt_not_calc_flg"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PayAct_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5040_PayAct_Upd01_INFO = new MCOperationInfo("MS", "MSBHL5040", "PayAct_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5040_PayAct_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5040", "PayAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pa" + ".pay_act_no", "pay_act_no"),
				MCItemDef.create("pa" + ".pay_act_seq", "pay_act_seq"),
				MCItemDef.create("pa" + ".psppl_cd", "psppl_cd"),
				MCItemDef.create("pa" + ".pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pa" + ".wg_cd", "wg_cd"),
				MCItemDef.create("pa" + ".pay_usr_cd", "pay_usr_cd"),
				MCItemDef.create("pa" + ".pay_act_dt", "pay_act_dt"),
				MCItemDef.create("pa" + ".ac_dt", "ac_dt"),
				MCItemDef.create("pa" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("pa" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("pa" + ".xrate", "xrate"),
				MCItemDef.create("pa" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pa" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("pa" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pa" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pa" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pa" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pa" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pa" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pa" + ".schd_act_flg", "schd_act_flg"),
				MCItemDef.create("pa" + ".trd_rmrks", "trd_rmrks"),
				MCItemDef.create("pa" + ".intr_rmrks", "intr_rmrks"),
				MCItemDef.create("pa" + ".par_pay_act_no", "par_pay_act_no"),
				MCItemDef.create("pa" + ".par_pay_act_seq", "par_pay_act_seq"),
				MCItemDef.create("pa" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pa" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pa" + ".sub_char3", "sub_char3"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("pn" + ".pay_note_mng_no", "pay_note_mng_no"),
				MCItemDef.create("pn" + ".note_no", "note_no"),
				MCItemDef.create("pn" + ".note_typ", "note_typ"),
				MCItemDef.create("pn" + ".note_rsn_cd", "note_rsn_cd"),
				MCItemDef.create("pn" + ".draw_dt", "draw_dt"),
				MCItemDef.create("pn" + ".due_dt", "due_dt"),
				MCItemDef.create("pn" + ".note_days", "note_days"),
				MCItemDef.create("pn" + ".drawer_nm", "drawer_nm"),
				MCItemDef.create("pn" + ".draw_bank_cd", "draw_bank_cd"),
				MCItemDef.create("pn" + ".draw_branch_cd", "draw_branch_cd"),
				MCItemDef.create("pn" + ".endrsr", "endrsr"),
				MCItemDef.create("pn" + ".accptr", "accptr"),
				MCItemDef.create("pn" + ".sub_char1", "note_sub_char1"),
				MCItemDef.create("pn" + ".sub_char2", "note_sub_char2"),
				MCItemDef.create("pn" + ".sub_char3", "note_sub_char3")
			}
			,
			MCBlockDef.create("PayAct_Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL5040_PayAct_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5040", "PayAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("pad" + ".pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pad" + ".pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("pad" + ".pay_act_no", "pay_act_no"),
				MCItemDef.create("pad" + ".pay_act_seq", "pay_act_seq"),
				MCItemDef.create("pad" + ".ap_appl_schd_no", "ap_appl_schd_no"),
				MCItemDef.create("pad" + ".pay_schd_no", "pay_schd_no"),
				MCItemDef.create("pad" + ".pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pad" + ".pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pad" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("pad" + ".ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("pad" + ".ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("pad" + ".ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("pad" + ".bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("pad" + ".pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pad" + ".trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd"),
				MCItemDef.create("pad" + ".ap_setoff_typ", "ap_setoff_typ"),
				MCItemDef.create("pad" + ".setoff_cd", "setoff_cd"),
				MCItemDef.create("pad" + ".setoff_nm", "setoff_nm"),
				MCItemDef.create("pad" + ".so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("pad" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("pad" + ".base_cur_amt", "base_cur_amt"),
				MCItemDef.create("pad" + ".rcv_no", "rcv_no"),
				MCItemDef.create("pad" + ".adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("pad" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("pad" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pad" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("pad" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("pad" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("pad" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("pad" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("pad" + ".wrk_no", "wrk_no"),
				MCItemDef.create("pad" + ".ap_typ", "ap_typ"),
				MCItemDef.create("pad" + ".pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("pad" + ".trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("pad" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("pad" + ".par_pay_act_d_no", "par_pay_act_d_no"),
				MCItemDef.create("pad" + ".par_pay_act_d_seq", "par_pay_act_d_seq"),
				MCItemDef.create("pad" + ".sub_char1", "sub_char1"),
				MCItemDef.create("pad" + ".sub_char2", "sub_char2"),
				MCItemDef.create("pad" + ".sub_char3", "sub_char3"),
				MCItemDef.create("pad" + ".disp_seq", "disp_seq"),
				MCItemDef.create("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate"),
				MCItemDef.create("pay_chk_upd_cntr", "pay_chk_upd_cntr"),
				MCItemDef.create("base_cur_amt_not_calc_flg", "base_cur_amt_not_calc_flg")
			}
			,
			MCBlockDef.create("PayAct_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBHL5040_PayAct_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5040", "PayAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pa" + ".pay_act_no", "pay_act_no"),
				MCItemDef.create("pa" + ".pay_act_seq", "pay_act_seq"),
				MCItemDef.create("pa" + ".pay_act_rev", "pay_act_rev"),
				MCItemDef.create("pa" + ".ac_ym", "ac_ym"),
				MCItemDef.create("pa" + ".pay_basis_dt", "pay_basis_dt")
			}
			,
			MCBlockDef.create("PayAct_Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL5040_PayAct_Upd01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5040", "PayAct_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("pad" + ".pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pad" + ".pay_act_d_seq", "pay_act_d_seq")
			}
			,
			MCBlockDef.create("PayAct_Chk01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

