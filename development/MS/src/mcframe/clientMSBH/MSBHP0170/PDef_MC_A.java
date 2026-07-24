package mcframe.clientMSBH.MSBHP0170;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBHP_BillRcptSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL0170.Srch01.UP.BLOCK0")){
			return MS_MSBHL0170_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0170.Srch01.DOWN.BLOCK0")){
			return MS_MSBHL0170_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBHL0170_Srch01_INFO = new MCOperationInfo("MS", "MSBHL0170", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0170_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0170", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_cl_dt_from", "bill_cl_dt_from"),
				MCItemDef.create("bill_cl_dt_to", "bill_cl_dt_to"),
				MCItemDef.create("bill_rcpt_no", "bill_rcpt_no"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("bill_src_cd", "bill_src_cd"),
				MCItemDef.create("bill_src_nm", "bill_src_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("pay_schd_dt_from", "pay_schd_dt_from"),
				MCItemDef.create("pay_schd_dt_to", "pay_schd_dt_to"),
				MCItemDef.create("inc_invalid_flg", "inc_invalid_flg"),
				MCItemDef.create("inc_not_bill_flg", "inc_not_bill_flg"),
				MCItemDef.create("billGrp_p" + ".bp_grp_flg1", "bp_grp_flg1"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("billGrp_p" + ".bp_grp_flg2", "bp_grp_flg2"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("billGrp_p" + ".bp_grp_flg3", "bp_grp_flg3"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("billGrp_p" + ".bp_grp_flg4", "bp_grp_flg4"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("billGrp_p" + ".bp_grp_flg5", "bp_grp_flg5"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("billGrp_p" + ".bp_grp_flg6", "bp_grp_flg6"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("billGrp_p" + ".bp_grp_flg7", "bp_grp_flg7"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("billGrp_p" + ".bp_grp_flg8", "bp_grp_flg8"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("billGrp_p" + ".bp_grp_flg9", "bp_grp_flg9"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("billGrp_p" + ".bp_grp_flg10", "bp_grp_flg10"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm10", "bp_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0170_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0170", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_rcpt_no", "bill_rcpt_no"),
				MCItemDef.create("invalid_flg", "invalid_flg"),
				MCItemDef.create("bill_cl_dt", "bill_cl_dt"),
				MCItemDef.create("bill_dt", "bill_dt"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("pre_bill_no", "pre_bill_no"),
				MCItemDef.create("pre_bill_dt", "pre_bill_dt"),
				MCItemDef.create("bill_st_dt", "bill_st_dt"),
				MCItemDef.create("bill_end_dt", "bill_end_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("bill_src_cd", "bill_src_cd"),
				MCItemDef.create("bill_src_nm", "bill_src_nm"),
				MCItemDef.create("bill_src_ein", "bill_src_ein"),
				MCItemDef.create("bill_src_biz_co_no", "bill_src_biz_co_no"),
				MCItemDef.create("bill_src_zip_cd", "bill_src_zip_cd"),
				MCItemDef.create("bill_src_addr1", "bill_src_addr1"),
				MCItemDef.create("bill_src_addr2", "bill_src_addr2"),
				MCItemDef.create("bill_src_addr3", "bill_src_addr3"),
				MCItemDef.create("bill_src_addr4", "bill_src_addr4"),
				MCItemDef.create("bill_src_dpt", "bill_src_dpt"),
				MCItemDef.create("bill_src_tel", "bill_src_tel"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("billGrp_p" + ".bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("billGrp_p" + ".bp_grp_nm10", "bp_grp_nm10"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_nm", "base_cur_nm"),
				MCItemDef.create("bill_xrate", "bill_xrate"),
				MCItemDef.create("last_bill_amt", "last_bill_amt"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("sw_amt", "sw_amt"),
				MCItemDef.create("bfw_amt", "bfw_amt"),
				MCItemDef.create("sls_amt", "sls_amt"),
				MCItemDef.create("dscnt_amt", "dscnt_amt"),
				MCItemDef.create("ret_amt", "ret_amt"),
				MCItemDef.create("setoff_amt", "setoff_amt"),
				MCItemDef.create("tax_amt", "tax_amt"),
				MCItemDef.create("sw_to_amt", "sw_to_amt"),
				MCItemDef.create("bill_amt", "bill_amt"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_nm", "bank_ac_nm"),
				MCItemDef.create("bank_ac_typ", "bank_ac_typ"),
				MCItemDef.create("bank_ac_no", "bank_ac_no"),
				MCItemDef.create("bank_ac_holder", "bank_ac_holder"),
				MCItemDef.create("bank_ac_holder_sub", "bank_ac_holder_sub"),
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("bank_nm", "bank_nm"),
				MCItemDef.create("branch_cd", "branch_cd"),
				MCItemDef.create("branch_nm", "branch_nm"),
				MCItemDef.create("tax_rate1", "tax_rate1"),
				MCItemDef.create("tax_rate_sls_amt1", "tax_rate_sls_amt1"),
				MCItemDef.create("tax_rate_tax_amt1", "tax_rate_tax_amt1"),
				MCItemDef.create("tax_rate_base_tax_amt1", "tax_rate_base_tax_amt1"),
				MCItemDef.create("tax_rate2", "tax_rate2"),
				MCItemDef.create("tax_rate_sls_amt2", "tax_rate_sls_amt2"),
				MCItemDef.create("tax_rate_tax_amt2", "tax_rate_tax_amt2"),
				MCItemDef.create("tax_rate_base_tax_amt2", "tax_rate_base_tax_amt2"),
				MCItemDef.create("tax_rate3", "tax_rate3"),
				MCItemDef.create("tax_rate_sls_amt3", "tax_rate_sls_amt3"),
				MCItemDef.create("tax_rate_tax_amt3", "tax_rate_tax_amt3"),
				MCItemDef.create("tax_rate_base_tax_amt3", "tax_rate_base_tax_amt3"),
				MCItemDef.create("tax_rate4", "tax_rate4"),
				MCItemDef.create("tax_rate_sls_amt4", "tax_rate_sls_amt4"),
				MCItemDef.create("tax_rate_tax_amt4", "tax_rate_tax_amt4"),
				MCItemDef.create("tax_rate_base_tax_amt4", "tax_rate_base_tax_amt4"),
				MCItemDef.create("tax_rate5", "tax_rate5"),
				MCItemDef.create("tax_rate_sls_amt5", "tax_rate_sls_amt5"),
				MCItemDef.create("tax_rate_tax_amt5", "tax_rate_tax_amt5"),
				MCItemDef.create("tax_rate_base_tax_amt5", "tax_rate_base_tax_amt5"),
				MCItemDef.create("tax_rate6", "tax_rate6"),
				MCItemDef.create("tax_rate_sls_amt6", "tax_rate_sls_amt6"),
				MCItemDef.create("tax_rate_tax_amt6", "tax_rate_tax_amt6"),
				MCItemDef.create("tax_rate_base_tax_amt6", "tax_rate_base_tax_amt6"),
				MCItemDef.create("tax_rate7", "tax_rate7"),
				MCItemDef.create("tax_rate_sls_amt7", "tax_rate_sls_amt7"),
				MCItemDef.create("tax_rate_tax_amt7", "tax_rate_tax_amt7"),
				MCItemDef.create("tax_rate_base_tax_amt7", "tax_rate_base_tax_amt7"),
				MCItemDef.create("tax_rate8", "tax_rate8"),
				MCItemDef.create("tax_rate_sls_amt8", "tax_rate_sls_amt8"),
				MCItemDef.create("tax_rate_tax_amt8", "tax_rate_tax_amt8"),
				MCItemDef.create("tax_rate_base_tax_amt8", "tax_rate_base_tax_amt8"),
				MCItemDef.create("tax_rate9", "tax_rate9"),
				MCItemDef.create("tax_rate_sls_amt9", "tax_rate_sls_amt9"),
				MCItemDef.create("tax_rate_tax_amt9", "tax_rate_tax_amt9"),
				MCItemDef.create("tax_rate_base_tax_amt9", "tax_rate_base_tax_amt9"),
				MCItemDef.create("tax_rate10", "tax_rate10"),
				MCItemDef.create("tax_rate_sls_amt10", "tax_rate_sls_amt10"),
				MCItemDef.create("tax_rate_tax_amt10", "tax_rate_tax_amt10"),
				MCItemDef.create("tax_rate_base_tax_amt10", "tax_rate_base_tax_amt10"),
				MCItemDef.create("adv_amt_bal", "adv_amt_bal"),
				MCItemDef.create("adv_amt", "adv_amt"),
				MCItemDef.create("adv_setoff_amt", "adv_setoff_amt"),
				MCItemDef.create("adv_setoff_tax_amt", "adv_setoff_tax_amt"),
				MCItemDef.create("pay_schd_dt1", "pay_schd_dt1"),
				MCItemDef.create("pay_schd_amt1", "pay_schd_amt1"),
				MCItemDef.create("pay_mtd_cd1", "pay_mtd_cd1"),
				MCItemDef.create("pay_mtd_nm1", "pay_mtd_nm1"),
				MCItemDef.create("pay_schd_dt2", "pay_schd_dt2"),
				MCItemDef.create("pay_schd_amt2", "pay_schd_amt2"),
				MCItemDef.create("pay_mtd_cd2", "pay_mtd_cd2"),
				MCItemDef.create("pay_mtd_nm2", "pay_mtd_nm2"),
				MCItemDef.create("pay_schd_dt3", "pay_schd_dt3"),
				MCItemDef.create("pay_schd_amt3", "pay_schd_amt3"),
				MCItemDef.create("pay_mtd_cd3", "pay_mtd_cd3"),
				MCItemDef.create("pay_mtd_nm3", "pay_mtd_nm3"),
				MCItemDef.create("pay_schd_dt4", "pay_schd_dt4"),
				MCItemDef.create("pay_schd_amt4", "pay_schd_amt4"),
				MCItemDef.create("pay_mtd_cd4", "pay_mtd_cd4"),
				MCItemDef.create("pay_mtd_nm4", "pay_mtd_nm4"),
				MCItemDef.create("pay_schd_dt5", "pay_schd_dt5"),
				MCItemDef.create("pay_schd_amt5", "pay_schd_amt5"),
				MCItemDef.create("pay_mtd_cd5", "pay_mtd_cd5"),
				MCItemDef.create("pay_mtd_nm5", "pay_mtd_nm5"),
				MCItemDef.create("pay_schd_dt6", "pay_schd_dt6"),
				MCItemDef.create("pay_schd_amt6", "pay_schd_amt6"),
				MCItemDef.create("pay_mtd_cd6", "pay_mtd_cd6"),
				MCItemDef.create("pay_mtd_nm6", "pay_mtd_nm6"),
				MCItemDef.create("pay_schd_dt7", "pay_schd_dt7"),
				MCItemDef.create("pay_schd_amt7", "pay_schd_amt7"),
				MCItemDef.create("pay_mtd_cd7", "pay_mtd_cd7"),
				MCItemDef.create("pay_mtd_nm7", "pay_mtd_nm7"),
				MCItemDef.create("pay_schd_dt8", "pay_schd_dt8"),
				MCItemDef.create("pay_schd_amt8", "pay_schd_amt8"),
				MCItemDef.create("pay_mtd_cd8", "pay_mtd_cd8"),
				MCItemDef.create("pay_mtd_nm8", "pay_mtd_nm8"),
				MCItemDef.create("pay_schd_dt9", "pay_schd_dt9"),
				MCItemDef.create("pay_schd_amt9", "pay_schd_amt9"),
				MCItemDef.create("pay_mtd_cd9", "pay_mtd_cd9"),
				MCItemDef.create("pay_mtd_nm9", "pay_mtd_nm9"),
				MCItemDef.create("pay_schd_dt10", "pay_schd_dt10"),
				MCItemDef.create("pay_schd_amt10", "pay_schd_amt10"),
				MCItemDef.create("pay_mtd_cd10", "pay_mtd_cd10"),
				MCItemDef.create("pay_mtd_nm10", "pay_mtd_nm10"),
				MCItemDef.create("bill_bcst_nm", "bill_bcst_nm"),
				MCItemDef.create("bill_ein", "bill_ein"),
				MCItemDef.create("bill_biz_co_no", "bill_biz_co_no"),
				MCItemDef.create("bill_zip_cd", "bill_zip_cd"),
				MCItemDef.create("bill_addr1", "bill_addr1"),
				MCItemDef.create("bill_addr2", "bill_addr2"),
				MCItemDef.create("bill_addr3", "bill_addr3"),
				MCItemDef.create("bill_addr4", "bill_addr4"),
				MCItemDef.create("bill_bcst_dpt", "bill_bcst_dpt"),
				MCItemDef.create("bill_tel", "bill_tel"),
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

