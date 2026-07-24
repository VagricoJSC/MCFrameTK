package mcframe.clientMSBG.MSBGP0250;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBGP_RcvActSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0250.Srch01.UP.BLOCK0")){
			return MS_MSBGL0250_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0250.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0250_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0250.Prnt01.UP.BLOCK0")){
			return MS_MSBGL0250_Prnt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0250.Prnt01.UP.BLOCK1")){
			return MS_MSBGL0250_Prnt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0250.Prnt01.DOWN.BLOCK0")){
			return MS_MSBGL0250_Prnt01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBGL0250_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0250", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0250_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0250", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("ar_appl_flg", "ar_appl_flg"),
				MCItemDef.create("susp_adv_flg", "susp_adv_flg"),
				MCItemDef.create("sw_flg", "sw_flg"),
				MCItemDef.create("tax_diff_flg", "tax_diff_flg"),
				MCItemDef.create("not_prnt_flg", "not_prnt_flg"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("rcv_dt_fr", "rcv_dt_fr"),
				MCItemDef.create("rcv_dt_to", "rcv_dt_to"),
				MCItemDef.create("ac_dt_fr", "ac_dt_fr"),
				MCItemDef.create("ac_dt_to", "ac_dt_to"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("sw_to_bcst_cd", "sw_to_bcst_cd"),
				MCItemDef.create("sw_to_bcst_nm", "sw_to_bcst_nm"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("gen_rcv_no", "gen_rcv_no"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("sw_to_rcv_act_no", "sw_to_rcv_act_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("rcv_auto_appl_flg", "rcv_auto_appl_flg"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_flg1", "rcst_grp_flg1"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd1", "rcst_grp_cd1"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm1", "rcst_grp_nm1"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_flg2", "rcst_grp_flg2"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd2", "rcst_grp_cd2"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm2", "rcst_grp_nm2"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_flg3", "rcst_grp_flg3"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd3", "rcst_grp_cd3"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm3", "rcst_grp_nm3"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_flg4", "rcst_grp_flg4"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd4", "rcst_grp_cd4"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm4", "rcst_grp_nm4"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_flg5", "rcst_grp_flg5"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd5", "rcst_grp_cd5"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm5", "rcst_grp_nm5"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_flg6", "rcst_grp_flg6"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd6", "rcst_grp_cd6"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm6", "rcst_grp_nm6"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_flg7", "rcst_grp_flg7"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd7", "rcst_grp_cd7"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm7", "rcst_grp_nm7"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_flg8", "rcst_grp_flg8"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd8", "rcst_grp_cd8"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm8", "rcst_grp_nm8"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_flg9", "rcst_grp_flg9"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd9", "rcst_grp_cd9"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm9", "rcst_grp_nm9"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_flg10", "rcst_grp_flg10"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd10", "rcst_grp_cd10"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm10", "rcst_grp_nm10"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_flg1", "bcst_grp_flg1"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd1", "bcst_grp_cd1"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm1", "bcst_grp_nm1"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_flg2", "bcst_grp_flg2"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd2", "bcst_grp_cd2"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm2", "bcst_grp_nm2"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_flg3", "bcst_grp_flg3"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd3", "bcst_grp_cd3"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm3", "bcst_grp_nm3"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_flg4", "bcst_grp_flg4"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd4", "bcst_grp_cd4"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm4", "bcst_grp_nm4"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_flg5", "bcst_grp_flg5"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd5", "bcst_grp_cd5"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm5", "bcst_grp_nm5"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_flg6", "bcst_grp_flg6"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd6", "bcst_grp_cd6"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm6", "bcst_grp_nm6"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_flg7", "bcst_grp_flg7"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd7", "bcst_grp_cd7"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm7", "bcst_grp_nm7"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_flg8", "bcst_grp_flg8"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd8", "bcst_grp_cd8"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm8", "bcst_grp_nm8"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_flg9", "bcst_grp_flg9"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd9", "bcst_grp_cd9"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm9", "bcst_grp_nm9"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_flg10", "bcst_grp_flg10"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd10", "bcst_grp_cd10"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm10", "bcst_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0250_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0250", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq"),
				MCItemDef.create("rcv_act_rev", "rcv_act_rev"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("rcst_nm", "rcst_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("ar_sttl_cd1", "ar_sttl_cd1"),
				MCItemDef.create("ar_sttl_nm1", "ar_sttl_nm1"),
				MCItemDef.create("rcv_no", "rcv_no"),
				MCItemDef.create("note_no", "note_no"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("bank_ac_no", "bank_ac_no"),
				MCItemDef.create("ar_sttl_cd2", "ar_sttl_cd2"),
				MCItemDef.create("ar_sttl_nm2", "ar_sttl_nm2"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("subttl1_p" + ".amt", "subttl1"),
				MCItemDef.create("subttl2_p" + ".amt", "subttl2"),
				MCItemDef.create("tax_amt_p" + ".amt", "tax_amt"),
				MCItemDef.create("tax_diff_amt_p" + ".amt", "tax_diff_amt"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("base_cur_amt_dec_place", "base_cur_amt_dec_place"),
				MCItemDef.create("base_cur_subttl1_p" + ".amt", "base_cur_subttl1"),
				MCItemDef.create("base_cur_subttl2_p" + ".amt", "base_cur_subttl2"),
				MCItemDef.create("base_cur_tax_amt_p" + ".amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_tax_diff_amt_p" + ".amt", "base_cur_tax_diff_amt"),
				MCItemDef.create("sw_to_rcv_act_no", "sw_to_rcv_act_no"),
				MCItemDef.create("sw_to_trd_cd", "sw_to_trd_cd"),
				MCItemDef.create("sw_to_trd_nm", "sw_to_trd_nm"),
				MCItemDef.create("sw_to_bcst_cd", "sw_to_bcst_cd"),
				MCItemDef.create("sw_to_bcst_nm", "sw_to_bcst_nm"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("gen_rcv_no", "gen_rcv_no"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("rcv_auto_appl_flg", "rcv_auto_appl_flg"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd1", "rcst_grp_cd1"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm1", "rcst_grp_nm1"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd2", "rcst_grp_cd2"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm2", "rcst_grp_nm2"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd3", "rcst_grp_cd3"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm3", "rcst_grp_nm3"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd4", "rcst_grp_cd4"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm4", "rcst_grp_nm4"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd5", "rcst_grp_cd5"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm5", "rcst_grp_nm5"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd6", "rcst_grp_cd6"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm6", "rcst_grp_nm6"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd7", "rcst_grp_cd7"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm7", "rcst_grp_nm7"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd8", "rcst_grp_cd8"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm8", "rcst_grp_nm8"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd9", "rcst_grp_cd9"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm9", "rcst_grp_nm9"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_cd10", "rcst_grp_cd10"),
				MCItemDef.create("rcst_grp_p" + ".bp_grp_nm10", "rcst_grp_nm10"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd1", "bcst_grp_cd1"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm1", "bcst_grp_nm1"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd2", "bcst_grp_cd2"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm2", "bcst_grp_nm2"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd3", "bcst_grp_cd3"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm3", "bcst_grp_nm3"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd4", "bcst_grp_cd4"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm4", "bcst_grp_nm4"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd5", "bcst_grp_cd5"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm5", "bcst_grp_nm5"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd6", "bcst_grp_cd6"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm6", "bcst_grp_nm6"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd7", "bcst_grp_cd7"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm7", "bcst_grp_nm7"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd8", "bcst_grp_cd8"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm8", "bcst_grp_nm8"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd9", "bcst_grp_cd9"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm9", "bcst_grp_nm9"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_cd10", "bcst_grp_cd10"),
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm10", "bcst_grp_nm10"),
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
	
	static final MCOperationInfo MS_MSBGL0250_Prnt01_INFO = new MCOperationInfo("MS", "MSBGL0250", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0250_Prnt01_UP_BLOCK0() {
		/** Ope.のBlock [Prnt01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0250", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rcv_act_no", "rcv_act_no"),
				MCItemDef.create("rcv_act_seq", "rcv_act_seq")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}

	public static MCContainerDef MS_MSBGL0250_Prnt01_UP_BLOCK1() {
		/** Ope.のBlock [Prnt01_RCnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0250", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("indiv_prnt_flg", "indiv_prnt_flg")
			}
			,
			MCBlockDef.create("Btn")
		);
	}


	public static MCContainerDef MS_MSBGL0250_Prnt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Prnt01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0250", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

