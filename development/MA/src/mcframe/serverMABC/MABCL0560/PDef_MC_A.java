package mcframe.serverMABC.MABCL0560;

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
 * [MABCL_BcstRcstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0560.BpBcst_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0560_BpBcst_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0560.BpBcst_Upd01.UP.BLOCK0")){
			return MA_MABCL0560_BpBcst_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0560.Srch01.UP.BLOCK0")){
			return MA_MABCL0560_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0560.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0560_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0560.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0560_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0560.Srch01.DOWN.BLOCK2")){
			return MA_MABCL0560_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MABCL0560.Srch01.DOWN.BLOCK3")){
			return MA_MABCL0560_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MA.MABCL0560.Srch01.DOWN.BLOCK4")){
			return MA_MABCL0560_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MA.MABCL0560.Upd01.UP.BLOCK0")){
			return MA_MABCL0560_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0560.Upd01.UP.BLOCK1")){
			return MA_MABCL0560_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0560.Upd01.UP.BLOCK2")){
			return MA_MABCL0560_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MA.MABCL0560.Upd01.UP.BLOCK3")){
			return MA_MABCL0560_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MA.MABCL0560.Upd01.UP.BLOCK4")){
			return MA_MABCL0560_Upd01_UP_BLOCK4();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MA_MABCL0560_BpBcst_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0560", "BpBcst_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0560_BpBcst_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0560", "BpBcst_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bcst_flg", "bcst_flg"),
				MCItemDef.create("rcst_flg", "rcst_flg"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("ar_cred_cd", "ar_cred_cd"),
				MCItemDef.create("bill_dpt_typ", "bill_dpt_typ"),
				MCItemDef.create("bcst_dpt_cd", "bcst_dpt_cd"),
				MCItemDef.create("check_bcst_dpt_cd", "check_bcst_dpt_cd"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("bill_cl_day1", "bill_cl_day1"),
				MCItemDef.create("bill_cl_day2", "bill_cl_day2"),
				MCItemDef.create("bill_cl_day3", "bill_cl_day3"),
				MCItemDef.create("bill_cl_day4", "bill_cl_day4"),
				MCItemDef.create("bill_cl_day5", "bill_cl_day5"),
				MCItemDef.create("tax_on_bill_flg", "tax_on_bill_flg"),
				MCItemDef.create("bill_tax_rnd_typ", "bill_tax_rnd_typ"),
				MCItemDef.create("bill_cl_delay_days", "bill_cl_delay_days"),
				MCItemDef.create("bill_cl_ba_typ", "bill_cl_ba_typ"),
				MCItemDef.create("bill_cal_cd", "bill_cal_cd"),
				MCItemDef.create("rcv_ba_typ", "rcv_ba_typ"),
				MCItemDef.create("auto_line_appl_flg", "auto_line_appl_flg"),
				MCItemDef.create("sls_interim_cl_flg", "sls_interim_cl_flg"),
				MCItemDef.create("ar_setoff_grp_cd", "ar_setoff_grp_cd"),
				MCItemDef.create("bill_zip_cd", "bill_zip_cd"),
				MCItemDef.create("bill_addr1", "bill_addr1"),
				MCItemDef.create("bill_addr2", "bill_addr2"),
				MCItemDef.create("bill_addr3", "bill_addr3"),
				MCItemDef.create("bill_addr4", "bill_addr4"),
				MCItemDef.create("bill_tel", "bill_tel"),
				MCItemDef.create("bill_bcst_nm", "bill_bcst_nm"),
				MCItemDef.create("bill_bcst_dpt", "bill_bcst_dpt"),
				MCItemDef.create("bill_bcst_psn", "bill_bcst_psn"),
				MCItemDef.create("bill_bcst_psn_title", "bill_bcst_psn_title"),
				MCItemDef.create("bill_prnt_typ", "bill_prnt_typ"),
				MCItemDef.create("sls_dtl_outp_typ", "sls_dtl_outp_typ"),
				MCItemDef.create("bill_dtl_outp_flg", "bill_dtl_outp_flg"),
				MCItemDef.create("bfw_bal_disp_flg", "bfw_bal_disp_flg"),
				MCItemDef.create("bill_dtl_adv_flg", "bill_dtl_adv_flg"),
				MCItemDef.create("bill_dtl_rcv_flg", "bill_dtl_rcv_flg"),
				MCItemDef.create("bill_dtl_subttl_typ", "bill_dtl_subttl_typ"),
				MCItemDef.create("bill_dtl_brk_typ", "bill_dtl_brk_typ"),
				MCItemDef.create("bill_dtl_sort_typ", "bill_dtl_sort_typ"),
				MCItemDef.create("bill_can_slip_typ", "bill_can_slip_typ"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("rcv_amt_match_flg", "rcv_amt_match_flg"),
				MCItemDef.create("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg"),
				MCItemDef.create("calc_com_paid_flg", "calc_com_paid_flg"),
				MCItemDef.create("auto_appl_delay_days", "auto_appl_delay_days"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("bcst_prnt_typ", "bcst_prnt_typ"),
				MCItemDef.create("rcst_prnt_typ", "rcst_prnt_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BpBcst_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0560_BpBcst_Upd01_INFO = new MCOperationInfo("MA", "MABCL0560", "BpBcst_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0560_BpBcst_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0560", "BpBcst_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bcst_flg", "bcst_flg"),
				MCItemDef.create("rcst_flg", "rcst_flg"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("ar_cred_cd", "ar_cred_cd"),
				MCItemDef.create("bill_dpt_typ", "bill_dpt_typ"),
				MCItemDef.create("bcst_dpt_cd", "bcst_dpt_cd"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("bill_cl_day1", "bill_cl_day1"),
				MCItemDef.create("bill_cl_day2", "bill_cl_day2"),
				MCItemDef.create("bill_cl_day3", "bill_cl_day3"),
				MCItemDef.create("bill_cl_day4", "bill_cl_day4"),
				MCItemDef.create("bill_cl_day5", "bill_cl_day5"),
				MCItemDef.create("tax_on_bill_flg", "tax_on_bill_flg"),
				MCItemDef.create("bill_tax_rnd_typ", "bill_tax_rnd_typ"),
				MCItemDef.create("bill_cl_delay_days", "bill_cl_delay_days"),
				MCItemDef.create("bill_cl_ba_typ", "bill_cl_ba_typ"),
				MCItemDef.create("bill_cal_cd", "bill_cal_cd"),
				MCItemDef.create("rcv_ba_typ", "rcv_ba_typ"),
				MCItemDef.create("auto_line_appl_flg", "auto_line_appl_flg"),
				MCItemDef.create("sls_interim_cl_flg", "sls_interim_cl_flg"),
				MCItemDef.create("ar_setoff_grp_cd", "ar_setoff_grp_cd"),
				MCItemDef.create("bill_zip_cd", "bill_zip_cd"),
				MCItemDef.create("bill_addr1", "bill_addr1"),
				MCItemDef.create("bill_addr2", "bill_addr2"),
				MCItemDef.create("bill_addr3", "bill_addr3"),
				MCItemDef.create("bill_addr4", "bill_addr4"),
				MCItemDef.create("bill_tel", "bill_tel"),
				MCItemDef.create("bill_bcst_nm", "bill_bcst_nm"),
				MCItemDef.create("bill_bcst_dpt", "bill_bcst_dpt"),
				MCItemDef.create("bill_bcst_psn", "bill_bcst_psn"),
				MCItemDef.create("bill_bcst_psn_title", "bill_bcst_psn_title"),
				MCItemDef.create("bill_prnt_typ", "bill_prnt_typ"),
				MCItemDef.create("sls_dtl_outp_typ", "sls_dtl_outp_typ"),
				MCItemDef.create("bill_dtl_outp_flg", "bill_dtl_outp_flg"),
				MCItemDef.create("bfw_bal_disp_flg", "bfw_bal_disp_flg"),
				MCItemDef.create("bill_dtl_adv_flg", "bill_dtl_adv_flg"),
				MCItemDef.create("bill_dtl_rcv_flg", "bill_dtl_rcv_flg"),
				MCItemDef.create("bill_dtl_subttl_typ", "bill_dtl_subttl_typ"),
				MCItemDef.create("bill_dtl_brk_typ", "bill_dtl_brk_typ"),
				MCItemDef.create("bill_dtl_sort_typ", "bill_dtl_sort_typ"),
				MCItemDef.create("bill_can_slip_typ", "bill_can_slip_typ"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("rcv_amt_match_flg", "rcv_amt_match_flg"),
				MCItemDef.create("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg"),
				MCItemDef.create("calc_com_paid_flg", "calc_com_paid_flg"),
				MCItemDef.create("auto_appl_delay_days", "auto_appl_delay_days"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("bcst_prnt_typ", "bcst_prnt_typ"),
				MCItemDef.create("rcst_prnt_typ", "rcst_prnt_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BpBcst_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0560_Srch01_INFO = new MCOperationInfo("MA", "MABCL0560", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0560_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0560", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0560_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0560", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bcst_flg", "bcst_flg"),
				MCItemDef.create("rcst_flg", "rcst_flg"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("ar_cred_cd", "ar_cred_cd"),
				MCItemDef.create("ar_cred_nm", "ar_cred_nm"),
				MCItemDef.create("bill_dpt_typ", "bill_dpt_typ"),
				MCItemDef.create("bill_dpt_typ_nm", "bill_dpt_typ_nm"),
				MCItemDef.create("bcst_dpt_cd", "bcst_dpt_cd"),
				MCItemDef.create("bcst_dpt_nm", "bcst_dpt_nm"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("bill_cl_typ_nm", "bill_cl_typ_nm"),
				MCItemDef.create("bill_cl_day1", "bill_cl_day1"),
				MCItemDef.create("bill_cl_day2", "bill_cl_day2"),
				MCItemDef.create("bill_cl_day3", "bill_cl_day3"),
				MCItemDef.create("bill_cl_day4", "bill_cl_day4"),
				MCItemDef.create("bill_cl_day5", "bill_cl_day5"),
				MCItemDef.create("tax_on_bill_flg", "tax_on_bill_flg"),
				MCItemDef.create("bill_tax_rnd_typ", "bill_tax_rnd_typ"),
				MCItemDef.create("bill_tax_rnd_typ_nm", "bill_tax_rnd_typ_nm"),
				MCItemDef.create("bill_cl_delay_days", "bill_cl_delay_days"),
				MCItemDef.create("bill_cl_ba_typ", "bill_cl_ba_typ"),
				MCItemDef.create("bill_cl_ba_typ_nm", "bill_cl_ba_typ_nm"),
				MCItemDef.create("bill_cal_cd", "bill_cal_cd"),
				MCItemDef.create("bill_cal_nm", "bill_cal_nm"),
				MCItemDef.create("rcv_ba_typ", "rcv_ba_typ"),
				MCItemDef.create("rcv_ba_typ_nm", "rcv_ba_typ_nm"),
				MCItemDef.create("auto_line_appl_flg", "auto_line_appl_flg"),
				MCItemDef.create("sls_interim_cl_flg", "sls_interim_cl_flg"),
				MCItemDef.create("ar_setoff_grp_cd", "ar_setoff_grp_cd"),
				MCItemDef.create("ar_setoff_grp_nm", "ar_setoff_grp_nm"),
				MCItemDef.create("bill_zip_cd", "bill_zip_cd"),
				MCItemDef.create("bill_addr1", "bill_addr1"),
				MCItemDef.create("bill_addr2", "bill_addr2"),
				MCItemDef.create("bill_addr3", "bill_addr3"),
				MCItemDef.create("bill_addr4", "bill_addr4"),
				MCItemDef.create("bill_tel", "bill_tel"),
				MCItemDef.create("bill_bcst_nm", "bill_bcst_nm"),
				MCItemDef.create("bill_bcst_dpt", "bill_bcst_dpt"),
				MCItemDef.create("bill_bcst_psn", "bill_bcst_psn"),
				MCItemDef.create("bill_bcst_psn_title", "bill_bcst_psn_title"),
				MCItemDef.create("bill_prnt_typ", "bill_prnt_typ"),
				MCItemDef.create("bill_prnt_typ_nm", "bill_prnt_typ_nm"),
				MCItemDef.create("sls_dtl_outp_typ", "sls_dtl_outp_typ"),
				MCItemDef.create("sls_dtl_outp_typ_nm", "sls_dtl_outp_typ_nm"),
				MCItemDef.create("bill_dtl_outp_flg", "bill_dtl_outp_flg"),
				MCItemDef.create("bfw_bal_disp_flg", "bfw_bal_disp_flg"),
				MCItemDef.create("bill_dtl_adv_flg", "bill_dtl_adv_flg"),
				MCItemDef.create("bill_dtl_rcv_flg", "bill_dtl_rcv_flg"),
				MCItemDef.create("bill_dtl_subttl_typ", "bill_dtl_subttl_typ"),
				MCItemDef.create("bill_dtl_subttl_typ_nm", "bill_dtl_subttl_typ_nm"),
				MCItemDef.create("bill_dtl_brk_typ", "bill_dtl_brk_typ"),
				MCItemDef.create("bill_dtl_brk_typ_nm", "bill_dtl_brk_typ_nm"),
				MCItemDef.create("bill_dtl_sort_typ", "bill_dtl_sort_typ"),
				MCItemDef.create("bill_dtl_sort_typ_nm", "bill_dtl_sort_typ_nm"),
				MCItemDef.create("bill_can_slip_typ", "bill_can_slip_typ"),
				MCItemDef.create("bill_can_slip_typ_nm", "bill_can_slip_typ_nm"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("rcv_amt_match_flg", "rcv_amt_match_flg"),
				MCItemDef.create("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg"),
				MCItemDef.create("calc_com_paid_flg", "calc_com_paid_flg"),
				MCItemDef.create("auto_appl_delay_days", "auto_appl_delay_days"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("bcst_prnt_typ", "bcst_prnt_typ"),
				MCItemDef.create("bcst_prnt_typ_nm", "bcst_prnt_typ_nm"),
				MCItemDef.create("rcst_prnt_typ", "rcst_prnt_typ"),
				MCItemDef.create("rcst_prnt_typ_nm", "rcst_prnt_typ_nm"),
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
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	public static MCContainerDef MA_MABCL0560_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0560", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_cl_day1", "bill_cl_day1"),
				MCItemDef.create("bill_cl_day2", "bill_cl_day2"),
				MCItemDef.create("bill_cl_day3", "bill_cl_day3"),
				MCItemDef.create("bill_cl_day4", "bill_cl_day4"),
				MCItemDef.create("bill_cl_day5", "bill_cl_day5"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("min_amt", "min_amt"),
				MCItemDef.create("sttl_cd", "sttl_cd"),
				MCItemDef.create("sttl_nm", "sttl_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("rate", "rate"),
				MCItemDef.create("crryovr_mons_typ", "crryovr_mons_typ"),
				MCItemDef.create("crryovr_mons_typ_nm", "crryovr_mons_typ_nm"),
				MCItemDef.create("rcv_day1", "rcv_day1"),
				MCItemDef.create("rcv_day2", "rcv_day2"),
				MCItemDef.create("rcv_day3", "rcv_day3"),
				MCItemDef.create("rcv_day4", "rcv_day4"),
				MCItemDef.create("rcv_day5", "rcv_day5"),
				MCItemDef.create("rcv_crryovr_mons1", "rcv_crryovr_mons1"),
				MCItemDef.create("rcv_crryovr_mons2", "rcv_crryovr_mons2"),
				MCItemDef.create("rcv_crryovr_mons3", "rcv_crryovr_mons3"),
				MCItemDef.create("rcv_crryovr_mons4", "rcv_crryovr_mons4"),
				MCItemDef.create("rcv_crryovr_mons5", "rcv_crryovr_mons5"),
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
			MCBlockDef.create("Srch01_Rslt2")
		);
	}
	public static MCContainerDef MA_MABCL0560_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MABCL0560", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("min_amt", "min_amt"),
				MCItemDef.create("max_amt", "max_amt"),
				MCItemDef.create("com_paid", "com_paid"),
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
			MCBlockDef.create("Srch01_Rslt3")
		);
	}
	public static MCContainerDef MA_MABCL0560_Srch01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MA", "MABCL0560", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_cd_null_flg", "bp_cd_null_flg"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("if_proc_typ_nm", "if_proc_typ_nm"),
				MCItemDef.create("ar_sttl_typ", "ar_sttl_typ"),
				MCItemDef.create("ar_sttl_typ_nm", "ar_sttl_typ_nm"),
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("bank_nm", "bank_nm"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
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
			MCBlockDef.create("Srch01_Rslt4")
		);
	}
	public static MCContainerDef MA_MABCL0560_Srch01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MA", "MABCL0560", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("if_proc_typ_nm", "if_proc_typ_nm"),
				MCItemDef.create("not_onr_prov_flg", "not_onr_prov_flg"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
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
			MCBlockDef.create("Srch01_Rslt5")
		);
	}
	
	static final MCOperationInfo MA_MABCL0560_Upd01_INFO = new MCOperationInfo("MA", "MABCL0560", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0560_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0560", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bcst_flg", "bcst_flg"),
				MCItemDef.create("rcst_flg", "rcst_flg"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("ar_cred_cd", "ar_cred_cd"),
				MCItemDef.create("bill_dpt_typ", "bill_dpt_typ"),
				MCItemDef.create("bcst_dpt_cd", "bcst_dpt_cd"),
				MCItemDef.create("check_bcst_dpt_cd", "check_bcst_dpt_cd"),
				MCItemDef.create("bill_cl_typ", "bill_cl_typ"),
				MCItemDef.create("bill_cl_day1", "bill_cl_day1"),
				MCItemDef.create("bill_cl_day2", "bill_cl_day2"),
				MCItemDef.create("bill_cl_day3", "bill_cl_day3"),
				MCItemDef.create("bill_cl_day4", "bill_cl_day4"),
				MCItemDef.create("bill_cl_day5", "bill_cl_day5"),
				MCItemDef.create("tax_on_bill_flg", "tax_on_bill_flg"),
				MCItemDef.create("bill_tax_rnd_typ", "bill_tax_rnd_typ"),
				MCItemDef.create("bill_cl_delay_days", "bill_cl_delay_days"),
				MCItemDef.create("bill_cl_ba_typ", "bill_cl_ba_typ"),
				MCItemDef.create("bill_cal_cd", "bill_cal_cd"),
				MCItemDef.create("rcv_ba_typ", "rcv_ba_typ"),
				MCItemDef.create("auto_line_appl_flg", "auto_line_appl_flg"),
				MCItemDef.create("sls_interim_cl_flg", "sls_interim_cl_flg"),
				MCItemDef.create("ar_setoff_grp_cd", "ar_setoff_grp_cd"),
				MCItemDef.create("bill_zip_cd", "bill_zip_cd"),
				MCItemDef.create("bill_addr1", "bill_addr1"),
				MCItemDef.create("bill_addr2", "bill_addr2"),
				MCItemDef.create("bill_addr3", "bill_addr3"),
				MCItemDef.create("bill_addr4", "bill_addr4"),
				MCItemDef.create("bill_tel", "bill_tel"),
				MCItemDef.create("bill_bcst_nm", "bill_bcst_nm"),
				MCItemDef.create("bill_bcst_dpt", "bill_bcst_dpt"),
				MCItemDef.create("bill_bcst_psn", "bill_bcst_psn"),
				MCItemDef.create("bill_bcst_psn_title", "bill_bcst_psn_title"),
				MCItemDef.create("bill_prnt_typ", "bill_prnt_typ"),
				MCItemDef.create("sls_dtl_outp_typ", "sls_dtl_outp_typ"),
				MCItemDef.create("bill_dtl_outp_flg", "bill_dtl_outp_flg"),
				MCItemDef.create("bfw_bal_disp_flg", "bfw_bal_disp_flg"),
				MCItemDef.create("bill_dtl_adv_flg", "bill_dtl_adv_flg"),
				MCItemDef.create("bill_dtl_rcv_flg", "bill_dtl_rcv_flg"),
				MCItemDef.create("bill_dtl_subttl_typ", "bill_dtl_subttl_typ"),
				MCItemDef.create("bill_dtl_brk_typ", "bill_dtl_brk_typ"),
				MCItemDef.create("bill_dtl_sort_typ", "bill_dtl_sort_typ"),
				MCItemDef.create("bill_can_slip_typ", "bill_can_slip_typ"),
				MCItemDef.create("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg"),
				MCItemDef.create("rcv_amt_match_flg", "rcv_amt_match_flg"),
				MCItemDef.create("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg"),
				MCItemDef.create("calc_com_paid_flg", "calc_com_paid_flg"),
				MCItemDef.create("auto_appl_delay_days", "auto_appl_delay_days"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("bcst_prnt_typ", "bcst_prnt_typ"),
				MCItemDef.create("rcst_prnt_typ", "rcst_prnt_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}

	public static MCContainerDef MA_MABCL0560_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0560", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("min_amt", "min_amt"),
				MCItemDef.create("sttl_cd", "sttl_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rate", "rate"),
				MCItemDef.create("crryovr_mons_typ", "crryovr_mons_typ"),
				MCItemDef.create("rcv_day1", "rcv_day1"),
				MCItemDef.create("rcv_day2", "rcv_day2"),
				MCItemDef.create("rcv_day3", "rcv_day3"),
				MCItemDef.create("rcv_day4", "rcv_day4"),
				MCItemDef.create("rcv_day5", "rcv_day5"),
				MCItemDef.create("rcv_crryovr_mons1", "rcv_crryovr_mons1"),
				MCItemDef.create("rcv_crryovr_mons2", "rcv_crryovr_mons2"),
				MCItemDef.create("rcv_crryovr_mons3", "rcv_crryovr_mons3"),
				MCItemDef.create("rcv_crryovr_mons4", "rcv_crryovr_mons4"),
				MCItemDef.create("rcv_crryovr_mons5", "rcv_crryovr_mons5"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl2")
		);
	}

	public static MCContainerDef MA_MABCL0560_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MABCL0560", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("min_amt", "min_amt"),
				MCItemDef.create("max_amt", "max_amt"),
				MCItemDef.create("com_paid", "com_paid"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl3")
		);
	}

	public static MCContainerDef MA_MABCL0560_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MA", "MABCL0560", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_cd_null_flg", "bp_cd_null_flg"),
				MCItemDef.create("ar_sttl_typ", "ar_sttl_typ"),
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl4")
		);
	}

	public static MCContainerDef MA_MABCL0560_Upd01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MA", "MABCL0560", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("not_onr_prov_flg", "not_onr_prov_flg"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl5")
		);
	}


	//FMCB DEF_CLASSES END
}

