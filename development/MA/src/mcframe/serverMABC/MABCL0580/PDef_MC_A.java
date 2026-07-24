package mcframe.serverMABC.MABCL0580;

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
 * [MABCL_BspplPspplReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0580.BpBsppl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0580_BpBsppl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0580.BpBsppl_Upd01.UP.BLOCK0")){
			return MA_MABCL0580_BpBsppl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0580.Srch01.UP.BLOCK0")){
			return MA_MABCL0580_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0580.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0580_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0580.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0580_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0580.Srch01.DOWN.BLOCK2")){
			return MA_MABCL0580_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MABCL0580.Upd01.UP.BLOCK0")){
			return MA_MABCL0580_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0580.Upd01.UP.BLOCK1")){
			return MA_MABCL0580_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0580.Upd01.UP.BLOCK2")){
			return MA_MABCL0580_Upd01_UP_BLOCK2();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MA_MABCL0580_BpBsppl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0580", "BpBsppl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0580_BpBsppl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0580", "BpBsppl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bsppl_flg", "bsppl_flg"),
				MCItemDef.create("psppl_flg", "psppl_flg"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("ap_cred_cd", "ap_cred_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("check_bsppl_dpt_cd", "check_bsppl_dpt_cd"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("psppl_cl_day1", "psppl_cl_day1"),
				MCItemDef.create("psppl_cl_day2", "psppl_cl_day2"),
				MCItemDef.create("psppl_cl_day3", "psppl_cl_day3"),
				MCItemDef.create("psppl_cl_day4", "psppl_cl_day4"),
				MCItemDef.create("psppl_cl_day5", "psppl_cl_day5"),
				MCItemDef.create("purc_interim_cl_flg", "purc_interim_cl_flg"),
				MCItemDef.create("ap_setoff_grp_cd", "ap_setoff_grp_cd"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("tax_on_pay_flg", "tax_on_pay_flg"),
				MCItemDef.create("pay_tax_rnd_typ", "pay_tax_rnd_typ"),
				MCItemDef.create("pay_schd_ba_typ", "pay_schd_ba_typ"),
				MCItemDef.create("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg"),
				MCItemDef.create("pay_schd_cl_delay_days", "pay_schd_cl_delay_days"),
				MCItemDef.create("pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ"),
				MCItemDef.create("pay_ntc_prnt_flg", "pay_ntc_prnt_flg"),
				MCItemDef.create("pay_ntc_zip_cd", "pay_ntc_zip_cd"),
				MCItemDef.create("pay_ntc_addr1", "pay_ntc_addr1"),
				MCItemDef.create("pay_ntc_addr2", "pay_ntc_addr2"),
				MCItemDef.create("pay_ntc_addr3", "pay_ntc_addr3"),
				MCItemDef.create("pay_ntc_addr4", "pay_ntc_addr4"),
				MCItemDef.create("pay_ntc_tel", "pay_ntc_tel"),
				MCItemDef.create("pay_ntc_bsppl_nm", "pay_ntc_bsppl_nm"),
				MCItemDef.create("pay_ntc_bsppl_dpt", "pay_ntc_bsppl_dpt"),
				MCItemDef.create("pay_ntc_bsppl_psn", "pay_ntc_bsppl_psn"),
				MCItemDef.create("pay_ntc_bsppl_psn_title", "pay_ntc_bsppl_psn_title"),
				MCItemDef.create("pay_ntc_dtl_outp_flg", "pay_ntc_dtl_outp_flg"),
				MCItemDef.create("pay_ntc_bfw_bal_disp_flg", "pay_ntc_bfw_bal_disp_flg"),
				MCItemDef.create("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg"),
				MCItemDef.create("pay_ntc_dtl_pay_flg", "pay_ntc_dtl_pay_flg"),
				MCItemDef.create("pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ"),
				MCItemDef.create("pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ"),
				MCItemDef.create("pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ"),
				MCItemDef.create("pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ"),
				MCItemDef.create("psppl_rmrks", "psppl_rmrks"),
				MCItemDef.create("note_days", "note_days"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("check_pay_dpt_cd", "check_pay_dpt_cd"),
				MCItemDef.create("bsppl_prnt_typ", "bsppl_prnt_typ"),
				MCItemDef.create("psppl_prnt_typ", "psppl_prnt_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BpBsppl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0580_BpBsppl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0580", "BpBsppl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0580_BpBsppl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0580", "BpBsppl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bsppl_flg", "bsppl_flg"),
				MCItemDef.create("psppl_flg", "psppl_flg"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("ap_cred_cd", "ap_cred_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("psppl_cl_day1", "psppl_cl_day1"),
				MCItemDef.create("psppl_cl_day2", "psppl_cl_day2"),
				MCItemDef.create("psppl_cl_day3", "psppl_cl_day3"),
				MCItemDef.create("psppl_cl_day4", "psppl_cl_day4"),
				MCItemDef.create("psppl_cl_day5", "psppl_cl_day5"),
				MCItemDef.create("purc_interim_cl_flg", "purc_interim_cl_flg"),
				MCItemDef.create("ap_setoff_grp_cd", "ap_setoff_grp_cd"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("tax_on_pay_flg", "tax_on_pay_flg"),
				MCItemDef.create("pay_tax_rnd_typ", "pay_tax_rnd_typ"),
				MCItemDef.create("pay_schd_ba_typ", "pay_schd_ba_typ"),
				MCItemDef.create("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg"),
				MCItemDef.create("pay_schd_cl_delay_days", "pay_schd_cl_delay_days"),
				MCItemDef.create("pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ"),
				MCItemDef.create("pay_ntc_prnt_flg", "pay_ntc_prnt_flg"),
				MCItemDef.create("pay_ntc_zip_cd", "pay_ntc_zip_cd"),
				MCItemDef.create("pay_ntc_addr1", "pay_ntc_addr1"),
				MCItemDef.create("pay_ntc_addr2", "pay_ntc_addr2"),
				MCItemDef.create("pay_ntc_addr3", "pay_ntc_addr3"),
				MCItemDef.create("pay_ntc_addr4", "pay_ntc_addr4"),
				MCItemDef.create("pay_ntc_tel", "pay_ntc_tel"),
				MCItemDef.create("pay_ntc_bsppl_nm", "pay_ntc_bsppl_nm"),
				MCItemDef.create("pay_ntc_bsppl_dpt", "pay_ntc_bsppl_dpt"),
				MCItemDef.create("pay_ntc_bsppl_psn", "pay_ntc_bsppl_psn"),
				MCItemDef.create("pay_ntc_bsppl_psn_title", "pay_ntc_bsppl_psn_title"),
				MCItemDef.create("pay_ntc_dtl_outp_flg", "pay_ntc_dtl_outp_flg"),
				MCItemDef.create("pay_ntc_bfw_bal_disp_flg", "pay_ntc_bfw_bal_disp_flg"),
				MCItemDef.create("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg"),
				MCItemDef.create("pay_ntc_dtl_pay_flg", "pay_ntc_dtl_pay_flg"),
				MCItemDef.create("pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ"),
				MCItemDef.create("pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ"),
				MCItemDef.create("pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ"),
				MCItemDef.create("pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ"),
				MCItemDef.create("psppl_rmrks", "psppl_rmrks"),
				MCItemDef.create("note_days", "note_days"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("bsppl_prnt_typ", "bsppl_prnt_typ"),
				MCItemDef.create("psppl_prnt_typ", "psppl_prnt_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BpBsppl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0580_Srch01_INFO = new MCOperationInfo("MA", "MABCL0580", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0580_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0580", "Srch01",
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


	public static MCContainerDef MA_MABCL0580_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0580", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("bsppl_flg", "bsppl_flg"),
				MCItemDef.create("psppl_flg", "psppl_flg"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("psppl_nm", "psppl_nm"),
				MCItemDef.create("ap_cred_cd", "ap_cred_cd"),
				MCItemDef.create("ap_cred_nm", "ap_cred_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("psppl_cl_day1", "psppl_cl_day1"),
				MCItemDef.create("psppl_cl_day2", "psppl_cl_day2"),
				MCItemDef.create("psppl_cl_day3", "psppl_cl_day3"),
				MCItemDef.create("psppl_cl_day4", "psppl_cl_day4"),
				MCItemDef.create("psppl_cl_day5", "psppl_cl_day5"),
				MCItemDef.create("purc_interim_cl_flg", "purc_interim_cl_flg"),
				MCItemDef.create("ap_setoff_grp_cd", "ap_setoff_grp_cd"),
				MCItemDef.create("ap_setoff_grp_nm", "ap_setoff_grp_nm"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("pay_bank_ac_nm", "pay_bank_ac_nm"),
				MCItemDef.create("tax_on_pay_flg", "tax_on_pay_flg"),
				MCItemDef.create("pay_tax_rnd_typ", "pay_tax_rnd_typ"),
				MCItemDef.create("pay_tax_rnd_typ_nm", "pay_tax_rnd_typ_nm"),
				MCItemDef.create("pay_schd_ba_typ", "pay_schd_ba_typ"),
				MCItemDef.create("pay_schd_ba_typ_nm", "pay_schd_ba_typ_nm"),
				MCItemDef.create("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg"),
				MCItemDef.create("pay_schd_cl_delay_days", "pay_schd_cl_delay_days"),
				MCItemDef.create("pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ"),
				MCItemDef.create("pay_schd_cl_ba_typ_nm", "pay_schd_cl_ba_typ_nm"),
				MCItemDef.create("pay_ntc_prnt_flg", "pay_ntc_prnt_flg"),
				MCItemDef.create("pay_ntc_zip_cd", "pay_ntc_zip_cd"),
				MCItemDef.create("pay_ntc_addr1", "pay_ntc_addr1"),
				MCItemDef.create("pay_ntc_addr2", "pay_ntc_addr2"),
				MCItemDef.create("pay_ntc_addr3", "pay_ntc_addr3"),
				MCItemDef.create("pay_ntc_addr4", "pay_ntc_addr4"),
				MCItemDef.create("pay_ntc_tel", "pay_ntc_tel"),
				MCItemDef.create("pay_ntc_bsppl_nm", "pay_ntc_bsppl_nm"),
				MCItemDef.create("pay_ntc_bsppl_dpt", "pay_ntc_bsppl_dpt"),
				MCItemDef.create("pay_ntc_bsppl_psn", "pay_ntc_bsppl_psn"),
				MCItemDef.create("pay_ntc_bsppl_psn_title", "pay_ntc_bsppl_psn_title"),
				MCItemDef.create("pay_ntc_dtl_outp_flg", "pay_ntc_dtl_outp_flg"),
				MCItemDef.create("pay_ntc_bfw_bal_disp_flg", "pay_ntc_bfw_bal_disp_flg"),
				MCItemDef.create("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg"),
				MCItemDef.create("pay_ntc_dtl_pay_flg", "pay_ntc_dtl_pay_flg"),
				MCItemDef.create("pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ"),
				MCItemDef.create("pay_ntc_dtl_subttl_typ_nm", "pay_ntc_dtl_subttl_typ_nm"),
				MCItemDef.create("pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ"),
				MCItemDef.create("pay_ntc_dtl_brk_typ_nm", "pay_ntc_dtl_brk_typ_nm"),
				MCItemDef.create("pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ"),
				MCItemDef.create("pay_ntc_dtl_sort_typ_nm", "pay_ntc_dtl_sort_typ_nm"),
				MCItemDef.create("pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ"),
				MCItemDef.create("pay_ntc_can_slip_typ_nm", "pay_ntc_can_slip_typ_nm"),
				MCItemDef.create("psppl_rmrks", "psppl_rmrks"),
				MCItemDef.create("note_days", "note_days"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("pay_dpt_nm", "pay_dpt_nm"),
				MCItemDef.create("bsppl_prnt_typ", "bsppl_prnt_typ"),
				MCItemDef.create("bsppl_prnt_typ_nm", "bsppl_prnt_typ_nm"),
				MCItemDef.create("psppl_prnt_typ", "psppl_prnt_typ"),
				MCItemDef.create("psppl_prnt_typ_nm", "psppl_prnt_typ_nm"),
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
	public static MCContainerDef MA_MABCL0580_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0580", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("psppl_cl_day1", "psppl_cl_day1"),
				MCItemDef.create("psppl_cl_day2", "psppl_cl_day2"),
				MCItemDef.create("psppl_cl_day3", "psppl_cl_day3"),
				MCItemDef.create("psppl_cl_day4", "psppl_cl_day4"),
				MCItemDef.create("psppl_cl_day5", "psppl_cl_day5"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("min_amt", "min_amt"),
				MCItemDef.create("sttl_cd", "sttl_cd"),
				MCItemDef.create("sttl_nm", "sttl_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("rate", "rate"),
				MCItemDef.create("crryovr_mons_typ", "crryovr_mons_typ"),
				MCItemDef.create("crryovr_mons_typ_nm", "crryovr_mons_typ_nm"),
				MCItemDef.create("pay_day1", "pay_day1"),
				MCItemDef.create("pay_day2", "pay_day2"),
				MCItemDef.create("pay_day3", "pay_day3"),
				MCItemDef.create("pay_day4", "pay_day4"),
				MCItemDef.create("pay_day5", "pay_day5"),
				MCItemDef.create("pay_crryovr_mons1", "pay_crryovr_mons1"),
				MCItemDef.create("pay_crryovr_mons2", "pay_crryovr_mons2"),
				MCItemDef.create("pay_crryovr_mons3", "pay_crryovr_mons3"),
				MCItemDef.create("pay_crryovr_mons4", "pay_crryovr_mons4"),
				MCItemDef.create("pay_crryovr_mons5", "pay_crryovr_mons5"),
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
	public static MCContainerDef MA_MABCL0580_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MABCL0580", "Srch01",
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
			MCBlockDef.create("Srch01_Rslt3")
		);
	}
	
	static final MCOperationInfo MA_MABCL0580_Upd01_INFO = new MCOperationInfo("MA", "MABCL0580", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0580_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0580", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bsppl_flg", "bsppl_flg"),
				MCItemDef.create("psppl_flg", "psppl_flg"),
				MCItemDef.create("psppl_cd", "psppl_cd"),
				MCItemDef.create("ap_cred_cd", "ap_cred_cd"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("check_bsppl_dpt_cd", "check_bsppl_dpt_cd"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("psppl_cl_day1", "psppl_cl_day1"),
				MCItemDef.create("psppl_cl_day2", "psppl_cl_day2"),
				MCItemDef.create("psppl_cl_day3", "psppl_cl_day3"),
				MCItemDef.create("psppl_cl_day4", "psppl_cl_day4"),
				MCItemDef.create("psppl_cl_day5", "psppl_cl_day5"),
				MCItemDef.create("purc_interim_cl_flg", "purc_interim_cl_flg"),
				MCItemDef.create("ap_setoff_grp_cd", "ap_setoff_grp_cd"),
				MCItemDef.create("pay_bank_ac_cd", "pay_bank_ac_cd"),
				MCItemDef.create("tax_on_pay_flg", "tax_on_pay_flg"),
				MCItemDef.create("pay_tax_rnd_typ", "pay_tax_rnd_typ"),
				MCItemDef.create("pay_schd_ba_typ", "pay_schd_ba_typ"),
				MCItemDef.create("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg"),
				MCItemDef.create("pay_schd_cl_delay_days", "pay_schd_cl_delay_days"),
				MCItemDef.create("pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ"),
				MCItemDef.create("pay_ntc_prnt_flg", "pay_ntc_prnt_flg"),
				MCItemDef.create("pay_ntc_zip_cd", "pay_ntc_zip_cd"),
				MCItemDef.create("pay_ntc_addr1", "pay_ntc_addr1"),
				MCItemDef.create("pay_ntc_addr2", "pay_ntc_addr2"),
				MCItemDef.create("pay_ntc_addr3", "pay_ntc_addr3"),
				MCItemDef.create("pay_ntc_addr4", "pay_ntc_addr4"),
				MCItemDef.create("pay_ntc_tel", "pay_ntc_tel"),
				MCItemDef.create("pay_ntc_bsppl_nm", "pay_ntc_bsppl_nm"),
				MCItemDef.create("pay_ntc_bsppl_dpt", "pay_ntc_bsppl_dpt"),
				MCItemDef.create("pay_ntc_bsppl_psn", "pay_ntc_bsppl_psn"),
				MCItemDef.create("pay_ntc_bsppl_psn_title", "pay_ntc_bsppl_psn_title"),
				MCItemDef.create("pay_ntc_dtl_outp_flg", "pay_ntc_dtl_outp_flg"),
				MCItemDef.create("pay_ntc_bfw_bal_disp_flg", "pay_ntc_bfw_bal_disp_flg"),
				MCItemDef.create("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg"),
				MCItemDef.create("pay_ntc_dtl_pay_flg", "pay_ntc_dtl_pay_flg"),
				MCItemDef.create("pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ"),
				MCItemDef.create("pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ"),
				MCItemDef.create("pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ"),
				MCItemDef.create("pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ"),
				MCItemDef.create("psppl_rmrks", "psppl_rmrks"),
				MCItemDef.create("note_days", "note_days"),
				MCItemDef.create("pay_dpt_cd", "pay_dpt_cd"),
				MCItemDef.create("check_pay_dpt_cd", "check_pay_dpt_cd"),
				MCItemDef.create("bsppl_prnt_typ", "bsppl_prnt_typ"),
				MCItemDef.create("psppl_prnt_typ", "psppl_prnt_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}

	public static MCContainerDef MA_MABCL0580_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0580", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("min_amt", "min_amt"),
				MCItemDef.create("sttl_cd", "sttl_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rate", "rate"),
				MCItemDef.create("crryovr_mons_typ", "crryovr_mons_typ"),
				MCItemDef.create("pay_day1", "pay_day1"),
				MCItemDef.create("pay_day2", "pay_day2"),
				MCItemDef.create("pay_day3", "pay_day3"),
				MCItemDef.create("pay_day4", "pay_day4"),
				MCItemDef.create("pay_day5", "pay_day5"),
				MCItemDef.create("pay_crryovr_mons1", "pay_crryovr_mons1"),
				MCItemDef.create("pay_crryovr_mons2", "pay_crryovr_mons2"),
				MCItemDef.create("pay_crryovr_mons3", "pay_crryovr_mons3"),
				MCItemDef.create("pay_crryovr_mons4", "pay_crryovr_mons4"),
				MCItemDef.create("pay_crryovr_mons5", "pay_crryovr_mons5"),
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

	public static MCContainerDef MA_MABCL0580_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MABCL0580", "Upd01",
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
			MCBlockDef.create("Upd01_Dtl3")
		);
	}


	//FMCB DEF_CLASSES END
}

