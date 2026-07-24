package mcframe.clientMSBH.MSBHP0110;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBHP_MlyApBalSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL0110.Srch01.UP.BLOCK0")){
			return MS_MSBHL0110_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0110.Srch01.DOWN.BLOCK0")){
			return MS_MSBHL0110_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBHL0110_Srch01_INFO = new MCOperationInfo("MS", "MSBHL0110", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0110_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym_fr", "ac_ym_fr"),
				MCItemDef.create("ac_ym_to", "ac_ym_to"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("ap_typ_ap", "ap_typ_ap"),
				MCItemDef.create("ap_typ_ac", "ap_typ_ac"),
				MCItemDef.create("ap_typ_temp_ap", "ap_typ_temp_ap"),
				MCItemDef.create("ap_dpt_flg", "ap_dpt_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("asppl_flg", "asppl_flg"),
				MCItemDef.create("purc_act_no_flg", "purc_act_no_flg"),
				MCItemDef.create("rcpt_iv_no_flg", "rcpt_iv_no_flg"),
				MCItemDef.create("rcpt_iv_mng_no_flg", "rcpt_iv_mng_no_flg"),
				MCItemDef.create("trd_cur_flg", "trd_cur_flg"),
				MCItemDef.create("wrk_no_flg", "wrk_no_flg"),
				MCItemDef.create("ap_typ_flg", "ap_typ_flg"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg1", "asppl_grp_flg1"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd1", "asppl_grp_cd1"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm1", "asppl_grp_nm1"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg2", "asppl_grp_flg2"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd2", "asppl_grp_cd2"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm2", "asppl_grp_nm2"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg3", "asppl_grp_flg3"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd3", "asppl_grp_cd3"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm3", "asppl_grp_nm3"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg4", "asppl_grp_flg4"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd4", "asppl_grp_cd4"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm4", "asppl_grp_nm4"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg5", "asppl_grp_flg5"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd5", "asppl_grp_cd5"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm5", "asppl_grp_nm5"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg6", "asppl_grp_flg6"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd6", "asppl_grp_cd6"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm6", "asppl_grp_nm6"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg7", "asppl_grp_flg7"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd7", "asppl_grp_cd7"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm7", "asppl_grp_nm7"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg8", "asppl_grp_flg8"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd8", "asppl_grp_cd8"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm8", "asppl_grp_nm8"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg9", "asppl_grp_flg9"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd9", "asppl_grp_cd9"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm9", "asppl_grp_nm9"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_flg10", "asppl_grp_flg10"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd10", "asppl_grp_cd10"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm10", "asppl_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0110_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0110", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("trd_cur_amt_dec_place", "trd_cur_amt_dec_place"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("init_bal_p" + ".amt", "init_bal"),
				MCItemDef.create("purc_amt_p" + ".amt", "purc_amt"),
				MCItemDef.create("ret_amt_p" + ".amt", "ret_amt"),
				MCItemDef.create("dscnt_amt_p" + ".amt", "dscnt_amt"),
				MCItemDef.create("sw_to_amt_p" + ".amt", "sw_to_amt"),
				MCItemDef.create("tax_amt_p" + ".amt", "tax_amt"),
				MCItemDef.create("cash_amt_p" + ".amt", "cash_amt"),
				MCItemDef.create("note_amt_p" + ".amt", "note_amt"),
				MCItemDef.create("account_amt_p" + ".amt", "account_amt"),
				MCItemDef.create("setoff_amt_p" + ".amt", "setoff_amt"),
				MCItemDef.create("sw_amt_p" + ".amt", "sw_amt"),
				MCItemDef.create("end_bal_p" + ".amt", "end_bal"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_init_bal_p" + ".amt", "base_cur_init_bal"),
				MCItemDef.create("base_cur_purc_amt_p" + ".amt", "base_cur_purc_amt"),
				MCItemDef.create("base_cur_ret_amt_p" + ".amt", "base_cur_ret_amt"),
				MCItemDef.create("base_cur_dscnt_amt_p" + ".amt", "base_cur_dscnt_amt"),
				MCItemDef.create("base_cur_sw_to_amt_p" + ".amt", "base_cur_sw_to_amt"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_cash_amt_p" + ".amt", "base_cur_cash_amt"),
				MCItemDef.create("base_cur_note_amt_p" + ".amt", "base_cur_note_amt"),
				MCItemDef.create("base_cur_account_amt_p" + ".amt", "base_cur_account_amt"),
				MCItemDef.create("base_cur_setoff_amt_p" + ".amt", "base_cur_setoff_amt"),
				MCItemDef.create("base_cur_sw_amt_p" + ".amt", "base_cur_sw_amt"),
				MCItemDef.create("base_cur_end_bal_p" + ".amt", "base_cur_end_bal"),
				MCItemDef.create("exc_gain_loss_p" + ".amt", "exc_gain_loss"),
				MCItemDef.create("total_exc_gain_loss_p" + ".amt", "total_exc_gain_loss"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd1", "asppl_grp_cd1"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm1", "asppl_grp_nm1"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd2", "asppl_grp_cd2"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm2", "asppl_grp_nm2"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd3", "asppl_grp_cd3"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm3", "asppl_grp_nm3"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd4", "asppl_grp_cd4"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm4", "asppl_grp_nm4"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd5", "asppl_grp_cd5"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm5", "asppl_grp_nm5"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd6", "asppl_grp_cd6"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm6", "asppl_grp_nm6"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd7", "asppl_grp_cd7"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm7", "asppl_grp_nm7"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd8", "asppl_grp_cd8"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm8", "asppl_grp_nm8"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd9", "asppl_grp_cd9"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm9", "asppl_grp_nm9"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_cd10", "asppl_grp_cd10"),
				MCItemDef.create("asppl_grp_p" + ".bp_grp_nm10", "asppl_grp_nm10"),
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

