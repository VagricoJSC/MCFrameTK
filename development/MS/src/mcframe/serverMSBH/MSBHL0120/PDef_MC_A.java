package mcframe.serverMSBH.MSBHL0120;

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
 * [MSBHL_ApLedgerSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL0120.Srch01.UP.BLOCK0")){
			return MS_MSBHL0120_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0120.Srch01.DOWN.BLOCK0")){
			return MS_MSBHL0120_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0120.Srch01.DOWN.BLOCK1")){
			return MS_MSBHL0120_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0120.Srch01.DOWN.BLOCK2")){
			return MS_MSBHL0120_Srch01_DOWN_BLOCK2();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBHL0120_Srch01_INFO = new MCOperationInfo("MS", "MSBHL0120", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0120_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("sign_rvrs_flg", "sign_rvrs_flg"),
				MCItemDef.create("asppl_grp_flg1", "asppl_grp_flg1"),
				MCItemDef.create("asppl_grp_cd1", "asppl_grp_cd1"),
				MCItemDef.create("asppl_grp_nm1", "asppl_grp_nm1"),
				MCItemDef.create("asppl_grp_flg2", "asppl_grp_flg2"),
				MCItemDef.create("asppl_grp_cd2", "asppl_grp_cd2"),
				MCItemDef.create("asppl_grp_nm2", "asppl_grp_nm2"),
				MCItemDef.create("asppl_grp_flg3", "asppl_grp_flg3"),
				MCItemDef.create("asppl_grp_cd3", "asppl_grp_cd3"),
				MCItemDef.create("asppl_grp_nm3", "asppl_grp_nm3"),
				MCItemDef.create("asppl_grp_flg4", "asppl_grp_flg4"),
				MCItemDef.create("asppl_grp_cd4", "asppl_grp_cd4"),
				MCItemDef.create("asppl_grp_nm4", "asppl_grp_nm4"),
				MCItemDef.create("asppl_grp_flg5", "asppl_grp_flg5"),
				MCItemDef.create("asppl_grp_cd5", "asppl_grp_cd5"),
				MCItemDef.create("asppl_grp_nm5", "asppl_grp_nm5"),
				MCItemDef.create("asppl_grp_flg6", "asppl_grp_flg6"),
				MCItemDef.create("asppl_grp_cd6", "asppl_grp_cd6"),
				MCItemDef.create("asppl_grp_nm6", "asppl_grp_nm6"),
				MCItemDef.create("asppl_grp_flg7", "asppl_grp_flg7"),
				MCItemDef.create("asppl_grp_cd7", "asppl_grp_cd7"),
				MCItemDef.create("asppl_grp_nm7", "asppl_grp_nm7"),
				MCItemDef.create("asppl_grp_flg8", "asppl_grp_flg8"),
				MCItemDef.create("asppl_grp_cd8", "asppl_grp_cd8"),
				MCItemDef.create("asppl_grp_nm8", "asppl_grp_nm8"),
				MCItemDef.create("asppl_grp_flg9", "asppl_grp_flg9"),
				MCItemDef.create("asppl_grp_cd9", "asppl_grp_cd9"),
				MCItemDef.create("asppl_grp_nm9", "asppl_grp_nm9"),
				MCItemDef.create("asppl_grp_flg10", "asppl_grp_flg10"),
				MCItemDef.create("asppl_grp_cd10", "asppl_grp_cd10"),
				MCItemDef.create("asppl_grp_nm10", "asppl_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0120_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("init_bal", "init_bal"),
				MCItemDef.create("purc_amt", "purc_amt"),
				MCItemDef.create("ret_amt", "ret_amt"),
				MCItemDef.create("dscnt_amt", "dscnt_amt"),
				MCItemDef.create("sw_to_amt", "sw_to_amt"),
				MCItemDef.create("tax_amt", "tax_amt"),
				MCItemDef.create("cash_amt", "cash_amt"),
				MCItemDef.create("note_amt", "note_amt"),
				MCItemDef.create("account_amt", "account_amt"),
				MCItemDef.create("setoff_amt", "setoff_amt"),
				MCItemDef.create("sw_amt", "sw_amt"),
				MCItemDef.create("end_bal", "end_bal"),
				MCItemDef.create("exc_gain_loss", "exc_gain_loss")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL0120_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("row_num", "row_num"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_rev", "act_rev"),
				MCItemDef.create("act_seq", "act_seq"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("act_d_seq", "act_d_seq"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_flg", "outsrc_flg"),
				MCItemDef.create("asppl_grp_cd1", "asppl_grp_cd1"),
				MCItemDef.create("asppl_grp_nm1", "asppl_grp_nm1"),
				MCItemDef.create("asppl_grp_cd2", "asppl_grp_cd2"),
				MCItemDef.create("asppl_grp_nm2", "asppl_grp_nm2"),
				MCItemDef.create("asppl_grp_cd3", "asppl_grp_cd3"),
				MCItemDef.create("asppl_grp_nm3", "asppl_grp_nm3"),
				MCItemDef.create("asppl_grp_cd4", "asppl_grp_cd4"),
				MCItemDef.create("asppl_grp_nm4", "asppl_grp_nm4"),
				MCItemDef.create("asppl_grp_cd5", "asppl_grp_cd5"),
				MCItemDef.create("asppl_grp_nm5", "asppl_grp_nm5"),
				MCItemDef.create("asppl_grp_cd6", "asppl_grp_cd6"),
				MCItemDef.create("asppl_grp_nm6", "asppl_grp_nm6"),
				MCItemDef.create("asppl_grp_cd7", "asppl_grp_cd7"),
				MCItemDef.create("asppl_grp_nm7", "asppl_grp_nm7"),
				MCItemDef.create("asppl_grp_cd8", "asppl_grp_cd8"),
				MCItemDef.create("asppl_grp_nm8", "asppl_grp_nm8"),
				MCItemDef.create("asppl_grp_cd9", "asppl_grp_cd9"),
				MCItemDef.create("asppl_grp_nm9", "asppl_grp_nm9"),
				MCItemDef.create("asppl_grp_cd10", "asppl_grp_cd10"),
				MCItemDef.create("asppl_grp_nm10", "asppl_grp_nm10"),
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
			MCBlockDef.create("Srch01_Dtl1")
		);
	}
	public static MCContainerDef MS_MSBHL0120_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MS", "MSBHL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_rev", "act_rev"),
				MCItemDef.create("act_seq", "act_seq"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("act_d_seq", "act_d_seq"),
				MCItemDef.create("ap_typ", "ap_typ"),
				MCItemDef.create("ap_typ_nm", "ap_typ_nm"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("ap_sttl_typ", "ap_sttl_typ"),
				MCItemDef.create("ap_sttl_typ_nm", "ap_sttl_typ_nm"),
				MCItemDef.create("adv_pay_ap_sttl_cd", "adv_pay_ap_sttl_cd"),
				MCItemDef.create("adv_pay_ap_sttl_nm", "adv_pay_ap_sttl_nm"),
				MCItemDef.create("adv_pay_ap_sttl_typ", "adv_pay_ap_sttl_typ"),
				MCItemDef.create("adv_pay_ap_sttl_typ_nm", "adv_pay_ap_sttl_typ_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("asppl_grp_cd1", "asppl_grp_cd1"),
				MCItemDef.create("asppl_grp_nm1", "asppl_grp_nm1"),
				MCItemDef.create("asppl_grp_cd2", "asppl_grp_cd2"),
				MCItemDef.create("asppl_grp_nm2", "asppl_grp_nm2"),
				MCItemDef.create("asppl_grp_cd3", "asppl_grp_cd3"),
				MCItemDef.create("asppl_grp_nm3", "asppl_grp_nm3"),
				MCItemDef.create("asppl_grp_cd4", "asppl_grp_cd4"),
				MCItemDef.create("asppl_grp_nm4", "asppl_grp_nm4"),
				MCItemDef.create("asppl_grp_cd5", "asppl_grp_cd5"),
				MCItemDef.create("asppl_grp_nm5", "asppl_grp_nm5"),
				MCItemDef.create("asppl_grp_cd6", "asppl_grp_cd6"),
				MCItemDef.create("asppl_grp_nm6", "asppl_grp_nm6"),
				MCItemDef.create("asppl_grp_cd7", "asppl_grp_cd7"),
				MCItemDef.create("asppl_grp_nm7", "asppl_grp_nm7"),
				MCItemDef.create("asppl_grp_cd8", "asppl_grp_cd8"),
				MCItemDef.create("asppl_grp_nm8", "asppl_grp_nm8"),
				MCItemDef.create("asppl_grp_cd9", "asppl_grp_cd9"),
				MCItemDef.create("asppl_grp_nm9", "asppl_grp_nm9"),
				MCItemDef.create("asppl_grp_cd10", "asppl_grp_cd10"),
				MCItemDef.create("asppl_grp_nm10", "asppl_grp_nm10"),
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
			MCBlockDef.create("Srch01_Dtl2")
		);
	}
	//FMCB DEF_CLASSES END
}

