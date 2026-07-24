package mcframe.serverMSBH.MSBHL5140;

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
 * [MSBHL_BillRecvReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL5140.BillRcpt_Chk01.UP.BLOCK0")){
			return MS_MSBHL5140_BillRcpt_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5140.BillRcpt_Chk01.UP.BLOCK1")){
			return MS_MSBHL5140_BillRcpt_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5140.BillRcpt_Chk01.DOWN.BLOCK0")){
			return MS_MSBHL5140_BillRcpt_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5140.BillRcpt_Chk01.DOWN.BLOCK1")){
			return MS_MSBHL5140_BillRcpt_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5140.BillRcpt_Ins01.UP.BLOCK0")){
			return MS_MSBHL5140_BillRcpt_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5140.BillRcpt_Ins01.UP.BLOCK1")){
			return MS_MSBHL5140_BillRcpt_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBHL5140.BillRcpt_Ins01.DOWN.BLOCK0")){
			return MS_MSBHL5140_BillRcpt_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5140.BillRcpt_Ins01.DOWN.BLOCK1")){
			return MS_MSBHL5140_BillRcpt_Ins01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBHL5140_BillRcpt_Chk01_INFO = new MCOperationInfo("MS", "MSBHL5140", "BillRcpt_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5140_BillRcpt_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5140", "BillRcpt_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
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
				MCItemDef.create("bill_src_ein", "bill_src_ein"),
				MCItemDef.create("bill_src_biz_co_no", "bill_src_biz_co_no"),
				MCItemDef.create("bill_src_zip_cd", "bill_src_zip_cd"),
				MCItemDef.create("bill_src_addr1", "bill_src_addr1"),
				MCItemDef.create("bill_src_addr2", "bill_src_addr2"),
				MCItemDef.create("bill_src_addr3", "bill_src_addr3"),
				MCItemDef.create("bill_src_addr4", "bill_src_addr4"),
				MCItemDef.create("bill_src_dpt", "bill_src_dpt"),
				MCItemDef.create("bill_src_tel", "bill_src_tel"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("bill_xrate", "bill_xrate"),
				MCItemDef.create("last_bill_amt", "last_bill_amt"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("sw_amt", "sw_amt"),
				MCItemDef.create("setoff_amt", "setoff_amt"),
				MCItemDef.create("bfw_amt", "bfw_amt"),
				MCItemDef.create("sls_amt", "sls_amt"),
				MCItemDef.create("dscnt_amt", "dscnt_amt"),
				MCItemDef.create("ret_amt", "ret_amt"),
				MCItemDef.create("tax_amt", "tax_amt"),
				MCItemDef.create("sw_to_amt", "sw_to_amt"),
				MCItemDef.create("bill_amt", "bill_amt"),
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
				MCItemDef.create("pay_schd_dt2", "pay_schd_dt2"),
				MCItemDef.create("pay_schd_amt2", "pay_schd_amt2"),
				MCItemDef.create("pay_mtd_cd2", "pay_mtd_cd2"),
				MCItemDef.create("pay_schd_dt3", "pay_schd_dt3"),
				MCItemDef.create("pay_schd_amt3", "pay_schd_amt3"),
				MCItemDef.create("pay_mtd_cd3", "pay_mtd_cd3"),
				MCItemDef.create("pay_schd_dt4", "pay_schd_dt4"),
				MCItemDef.create("pay_schd_amt4", "pay_schd_amt4"),
				MCItemDef.create("pay_mtd_cd4", "pay_mtd_cd4"),
				MCItemDef.create("pay_schd_dt5", "pay_schd_dt5"),
				MCItemDef.create("pay_schd_amt5", "pay_schd_amt5"),
				MCItemDef.create("pay_mtd_cd5", "pay_mtd_cd5"),
				MCItemDef.create("pay_schd_dt6", "pay_schd_dt6"),
				MCItemDef.create("pay_schd_amt6", "pay_schd_amt6"),
				MCItemDef.create("pay_mtd_cd6", "pay_mtd_cd6"),
				MCItemDef.create("pay_schd_dt7", "pay_schd_dt7"),
				MCItemDef.create("pay_schd_amt7", "pay_schd_amt7"),
				MCItemDef.create("pay_mtd_cd7", "pay_mtd_cd7"),
				MCItemDef.create("pay_schd_dt8", "pay_schd_dt8"),
				MCItemDef.create("pay_schd_amt8", "pay_schd_amt8"),
				MCItemDef.create("pay_mtd_cd8", "pay_mtd_cd8"),
				MCItemDef.create("pay_schd_dt9", "pay_schd_dt9"),
				MCItemDef.create("pay_schd_amt9", "pay_schd_amt9"),
				MCItemDef.create("pay_mtd_cd9", "pay_mtd_cd9"),
				MCItemDef.create("pay_schd_dt10", "pay_schd_dt10"),
				MCItemDef.create("pay_schd_amt10", "pay_schd_amt10"),
				MCItemDef.create("pay_mtd_cd10", "pay_mtd_cd10"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL5140_BillRcpt_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5140", "BillRcpt_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("ship_dlv_slip_d_no", "ship_dlv_slip_d_no"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_rev", "act_rev"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("dlv_dt", "dlv_dt"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBHL5140_BillRcpt_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5140", "BillRcpt_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
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
				MCItemDef.create("bill_src_ein", "bill_src_ein"),
				MCItemDef.create("bill_src_biz_co_no", "bill_src_biz_co_no"),
				MCItemDef.create("bill_src_zip_cd", "bill_src_zip_cd"),
				MCItemDef.create("bill_src_addr1", "bill_src_addr1"),
				MCItemDef.create("bill_src_addr2", "bill_src_addr2"),
				MCItemDef.create("bill_src_addr3", "bill_src_addr3"),
				MCItemDef.create("bill_src_addr4", "bill_src_addr4"),
				MCItemDef.create("bill_src_dpt", "bill_src_dpt"),
				MCItemDef.create("bill_src_tel", "bill_src_tel"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("bill_xrate", "bill_xrate"),
				MCItemDef.create("last_bill_amt", "last_bill_amt"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("sw_amt", "sw_amt"),
				MCItemDef.create("setoff_amt", "setoff_amt"),
				MCItemDef.create("bfw_amt", "bfw_amt"),
				MCItemDef.create("sls_amt", "sls_amt"),
				MCItemDef.create("dscnt_amt", "dscnt_amt"),
				MCItemDef.create("ret_amt", "ret_amt"),
				MCItemDef.create("tax_amt", "tax_amt"),
				MCItemDef.create("sw_to_amt", "sw_to_amt"),
				MCItemDef.create("bill_amt", "bill_amt"),
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
				MCItemDef.create("pay_schd_dt2", "pay_schd_dt2"),
				MCItemDef.create("pay_schd_amt2", "pay_schd_amt2"),
				MCItemDef.create("pay_mtd_cd2", "pay_mtd_cd2"),
				MCItemDef.create("pay_schd_dt3", "pay_schd_dt3"),
				MCItemDef.create("pay_schd_amt3", "pay_schd_amt3"),
				MCItemDef.create("pay_mtd_cd3", "pay_mtd_cd3"),
				MCItemDef.create("pay_schd_dt4", "pay_schd_dt4"),
				MCItemDef.create("pay_schd_amt4", "pay_schd_amt4"),
				MCItemDef.create("pay_mtd_cd4", "pay_mtd_cd4"),
				MCItemDef.create("pay_schd_dt5", "pay_schd_dt5"),
				MCItemDef.create("pay_schd_amt5", "pay_schd_amt5"),
				MCItemDef.create("pay_mtd_cd5", "pay_mtd_cd5"),
				MCItemDef.create("pay_schd_dt6", "pay_schd_dt6"),
				MCItemDef.create("pay_schd_amt6", "pay_schd_amt6"),
				MCItemDef.create("pay_mtd_cd6", "pay_mtd_cd6"),
				MCItemDef.create("pay_schd_dt7", "pay_schd_dt7"),
				MCItemDef.create("pay_schd_amt7", "pay_schd_amt7"),
				MCItemDef.create("pay_mtd_cd7", "pay_mtd_cd7"),
				MCItemDef.create("pay_schd_dt8", "pay_schd_dt8"),
				MCItemDef.create("pay_schd_amt8", "pay_schd_amt8"),
				MCItemDef.create("pay_mtd_cd8", "pay_mtd_cd8"),
				MCItemDef.create("pay_schd_dt9", "pay_schd_dt9"),
				MCItemDef.create("pay_schd_amt9", "pay_schd_amt9"),
				MCItemDef.create("pay_mtd_cd9", "pay_mtd_cd9"),
				MCItemDef.create("pay_schd_dt10", "pay_schd_dt10"),
				MCItemDef.create("pay_schd_amt10", "pay_schd_amt10"),
				MCItemDef.create("pay_mtd_cd10", "pay_mtd_cd10"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL5140_BillRcpt_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5140", "BillRcpt_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("ship_dlv_slip_d_no", "ship_dlv_slip_d_no"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_rev", "act_rev"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("dlv_dt", "dlv_dt"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5140_BillRcpt_Ins01_INFO = new MCOperationInfo("MS", "MSBHL5140", "BillRcpt_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5140_BillRcpt_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5140", "BillRcpt_Ins01",
			new MCItemDef[]{
				MCItemDef.create("bill_rcpt_no", "bill_rcpt_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
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
				MCItemDef.create("bill_src_ein", "bill_src_ein"),
				MCItemDef.create("bill_src_biz_co_no", "bill_src_biz_co_no"),
				MCItemDef.create("bill_src_zip_cd", "bill_src_zip_cd"),
				MCItemDef.create("bill_src_addr1", "bill_src_addr1"),
				MCItemDef.create("bill_src_addr2", "bill_src_addr2"),
				MCItemDef.create("bill_src_addr3", "bill_src_addr3"),
				MCItemDef.create("bill_src_addr4", "bill_src_addr4"),
				MCItemDef.create("bill_src_dpt", "bill_src_dpt"),
				MCItemDef.create("bill_src_tel", "bill_src_tel"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("bill_xrate", "bill_xrate"),
				MCItemDef.create("last_bill_amt", "last_bill_amt"),
				MCItemDef.create("rcv_amt", "rcv_amt"),
				MCItemDef.create("sw_amt", "sw_amt"),
				MCItemDef.create("setoff_amt", "setoff_amt"),
				MCItemDef.create("bfw_amt", "bfw_amt"),
				MCItemDef.create("sls_amt", "sls_amt"),
				MCItemDef.create("dscnt_amt", "dscnt_amt"),
				MCItemDef.create("ret_amt", "ret_amt"),
				MCItemDef.create("tax_amt", "tax_amt"),
				MCItemDef.create("sw_to_amt", "sw_to_amt"),
				MCItemDef.create("bill_amt", "bill_amt"),
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
				MCItemDef.create("pay_schd_dt2", "pay_schd_dt2"),
				MCItemDef.create("pay_schd_amt2", "pay_schd_amt2"),
				MCItemDef.create("pay_mtd_cd2", "pay_mtd_cd2"),
				MCItemDef.create("pay_schd_dt3", "pay_schd_dt3"),
				MCItemDef.create("pay_schd_amt3", "pay_schd_amt3"),
				MCItemDef.create("pay_mtd_cd3", "pay_mtd_cd3"),
				MCItemDef.create("pay_schd_dt4", "pay_schd_dt4"),
				MCItemDef.create("pay_schd_amt4", "pay_schd_amt4"),
				MCItemDef.create("pay_mtd_cd4", "pay_mtd_cd4"),
				MCItemDef.create("pay_schd_dt5", "pay_schd_dt5"),
				MCItemDef.create("pay_schd_amt5", "pay_schd_amt5"),
				MCItemDef.create("pay_mtd_cd5", "pay_mtd_cd5"),
				MCItemDef.create("pay_schd_dt6", "pay_schd_dt6"),
				MCItemDef.create("pay_schd_amt6", "pay_schd_amt6"),
				MCItemDef.create("pay_mtd_cd6", "pay_mtd_cd6"),
				MCItemDef.create("pay_schd_dt7", "pay_schd_dt7"),
				MCItemDef.create("pay_schd_amt7", "pay_schd_amt7"),
				MCItemDef.create("pay_mtd_cd7", "pay_mtd_cd7"),
				MCItemDef.create("pay_schd_dt8", "pay_schd_dt8"),
				MCItemDef.create("pay_schd_amt8", "pay_schd_amt8"),
				MCItemDef.create("pay_mtd_cd8", "pay_mtd_cd8"),
				MCItemDef.create("pay_schd_dt9", "pay_schd_dt9"),
				MCItemDef.create("pay_schd_amt9", "pay_schd_amt9"),
				MCItemDef.create("pay_mtd_cd9", "pay_mtd_cd9"),
				MCItemDef.create("pay_schd_dt10", "pay_schd_dt10"),
				MCItemDef.create("pay_schd_amt10", "pay_schd_amt10"),
				MCItemDef.create("pay_mtd_cd10", "pay_mtd_cd10"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BillRcpt_Ins01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBHL5140_BillRcpt_Ins01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5140", "BillRcpt_Ins01",
			new MCItemDef[]{
				MCItemDef.create("bill_rcpt_d_no", "bill_rcpt_d_no"),
				MCItemDef.create("bill_rcpt_no", "bill_rcpt_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("hdr_peg_no", "hdr_peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("ship_dlv_slip_d_no", "ship_dlv_slip_d_no"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_rev", "act_rev"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("dlv_dt", "dlv_dt"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("BillRcpt_Ins01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBHL5140_BillRcpt_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5140", "BillRcpt_Ins01",
			new MCItemDef[]{
				MCItemDef.create("bill_rcpt_no", "bill_rcpt_no"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("BillRcpt_Ins01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBHL5140_BillRcpt_Ins01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBHL5140", "BillRcpt_Ins01",
			new MCItemDef[]{
				MCItemDef.create("bill_rcpt_d_no", "bill_rcpt_d_no"),
				MCItemDef.create("bill_rcpt_no", "bill_rcpt_no"),
				MCItemDef.create("peg_no", "peg_no")
			}
			,
			MCBlockDef.create("BillRcpt_Ins01_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

