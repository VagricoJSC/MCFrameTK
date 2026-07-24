package mcframe.clientMSBH.MSBHP0190;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBHP_PayNtcSaveHstSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL0190.Srch01.UP.BLOCK0")){
			return MS_MSBHL0190_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0190.Srch01.DOWN.BLOCK0")){
			return MS_MSBHL0190_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0190.Srch01.DOWN.BLOCK1")){
			return MS_MSBHL0190_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL0190.Srch01.DOWN.BLOCK2")){
			return MS_MSBHL0190_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBHL0190.Srch01.DOWN.BLOCK3")){
			return MS_MSBHL0190_Srch01_DOWN_BLOCK3();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBHL0190_Srch01_INFO = new MCOperationInfo("MS", "MSBHL0190", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0190_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0190", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pay_ntc_rev", "pay_ntc_rev"),
				MCItemDef.create("latest_flg", "latest_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0190_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0190", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pay_ntc_rev", "pay_ntc_rev"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("bsppl_cl_dt", "bsppl_cl_dt"),
				MCItemDef.create("reg_dt", "reg_dt"),
				MCItemDef.create("pay_spot_flg", "pay_spot_flg"),
				MCItemDef.create("rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("bsppl_dpt_nm", "bsppl_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("pay_xrate", "pay_xrate"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("last_pay_schd_amt", "last_pay_schd_amt"),
				MCItemDef.create("pay_amt", "pay_amt"),
				MCItemDef.create("sw_amt", "sw_amt"),
				MCItemDef.create("bfw_amt", "bfw_amt"),
				MCItemDef.create("purc_amt", "purc_amt"),
				MCItemDef.create("purc_dscnt_amt", "purc_dscnt_amt"),
				MCItemDef.create("purc_ret_amt", "purc_ret_amt"),
				MCItemDef.create("setoff_amt", "setoff_amt"),
				MCItemDef.create("tax_amt", "tax_amt"),
				MCItemDef.create("sw_to_amt", "sw_to_amt"),
				MCItemDef.create("schd_pay_amt", "schd_pay_amt"),
				MCItemDef.create("adv_pay_bal", "adv_pay_bal"),
				MCItemDef.create("adv_pay_amt", "adv_pay_amt"),
				MCItemDef.create("adv_pay_setoff_amt", "adv_pay_setoff_amt"),
				MCItemDef.create("adv_pay_setoff_tax_amt", "adv_pay_setoff_tax_amt"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL0190_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_RsltApd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0190", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ap_d_no", "ap_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("purc_act_no", "purc_act_no"),
				MCItemDef.create("purc_act_rev", "purc_act_rev"),
				MCItemDef.create("purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("act_dt", "act_dt"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("base_cur_upri", "base_cur_upri"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("pay_mtd_typ_nm", "pay_mtd_typ_nm"),
				MCItemDef.create("base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("DtlApd")
		);
	}
	public static MCContainerDef MS_MSBHL0190_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_RsltAct] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0190", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pay_act_no", "pay_act_no"),
				MCItemDef.create("pay_act_seq", "pay_act_seq"),
				MCItemDef.create("pay_act_d_no", "pay_act_d_no"),
				MCItemDef.create("pay_act_d_seq", "pay_act_d_seq"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("DtlAct")
		);
	}
	public static MCContainerDef MS_MSBHL0190_Srch01_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch01_RsltAdvPayAct] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0190", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("adv_pay_act_no", "adv_pay_act_no"),
				MCItemDef.create("adv_pay_act_seq", "adv_pay_act_seq"),
				MCItemDef.create("ap_sttl_cd", "ap_sttl_cd"),
				MCItemDef.create("ap_sttl_nm", "ap_sttl_nm"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("pay_act_dt", "pay_act_dt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("base_cur_inc_tax_amt", "base_cur_inc_tax_amt"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("DtlAdvPayAct")
		);
	}
	//FMCB DEF_CLASSES END
}

