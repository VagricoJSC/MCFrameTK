package mcframe.serverMSLA.MSLAL7220;

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
 * [MSLAL_BillRecvConvService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSLAL7220.BillRecvConv_Conv01.UP.BLOCK0")){
			return MS_MSLAL7220_BillRecvConv_Conv01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7220.BillRecvConv_Conv01.DOWN.BLOCK0")){
			return MS_MSLAL7220_BillRecvConv_Conv01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7220.BillRecvConv_Conv02.UP.BLOCK0")){
			return MS_MSLAL7220_BillRecvConv_Conv02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7220.BillRecvConv_Conv02.DOWN.BLOCK0")){
			return MS_MSLAL7220_BillRecvConv_Conv02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7220.BillRecvConv_Conv03.UP.BLOCK0")){
			return MS_MSLAL7220_BillRecvConv_Conv03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSLAL7220.BillRecvConv_Conv03.UP.BLOCK1")){
			return MS_MSLAL7220_BillRecvConv_Conv03_UP_BLOCK1();
		}
		else if (id.equals("MS.MSLAL7220.BillRecvConv_Conv03.DOWN.BLOCK0")){
			return MS_MSLAL7220_BillRecvConv_Conv03_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSLAL7220_BillRecvConv_Conv01_INFO = new MCOperationInfo("MS", "MSLAL7220", "BillRecvConv_Conv01", "000000", new PDef());

	public static MCContainerDef MS_MSLAL7220_BillRecvConv_Conv01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7220", "BillRecvConv_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase01_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ConvDtl")
		);
	}


	public static MCContainerDef MS_MSLAL7220_BillRecvConv_Conv01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7220", "BillRecvConv_Conv01",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase01_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("ConvDtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL7220_BillRecvConv_Conv02_INFO = new MCOperationInfo("MS", "MSLAL7220", "BillRecvConv_Conv02", "000000", new PDef());

	public static MCContainerDef MS_MSLAL7220_BillRecvConv_Conv02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7220", "BillRecvConv_Conv02",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase03_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}


	public static MCContainerDef MS_MSLAL7220_BillRecvConv_Conv02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7220", "BillRecvConv_Conv02",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase03_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	
	static final MCOperationInfo MS_MSLAL7220_BillRecvConv_Conv03_INFO = new MCOperationInfo("MS", "MSLAL7220", "BillRecvConv_Conv03", "000000", new PDef());

	public static MCContainerDef MS_MSLAL7220_BillRecvConv_Conv03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7220", "BillRecvConv_Conv03",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase04_UP_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}

	public static MCContainerDef MS_MSLAL7220_BillRecvConv_Conv03_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSLAL7220", "BillRecvConv_Conv03",
			new MCItemDef[]{
				MCItemDef.create("data_lno", "data_lno"),
				MCItemDef.create("data_no", "data_no"),
				MCItemDef.create("trd_typ_cd", "trd_typ_cd"),
				MCItemDef.create("data_make_dt", "data_make_dt"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("bill_cl_dt", "bill_cl_dt"),
				MCItemDef.create("bill_dt", "bill_dt"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("pre_bill_no", "pre_bill_no"),
				MCItemDef.create("pre_bill_dt", "pre_bill_dt"),
				MCItemDef.create("bill_st_dt", "bill_st_dt"),
				MCItemDef.create("bill_end_dt", "bill_end_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("bill_co_cd", "bill_co_cd"),
				MCItemDef.create("bill_co_nm", "bill_co_nm"),
				MCItemDef.create("bill_co_ein", "bill_co_ein"),
				MCItemDef.create("bill_co_biz_co_no", "bill_co_biz_co_no"),
				MCItemDef.create("bill_co_zip_cd", "bill_co_zip_cd"),
				MCItemDef.create("bill_co_addr1", "bill_co_addr1"),
				MCItemDef.create("bill_co_addr2", "bill_co_addr2"),
				MCItemDef.create("bill_co_addr3", "bill_co_addr3"),
				MCItemDef.create("bill_co_addr4", "bill_co_addr4"),
				MCItemDef.create("bill_co_dpt", "bill_co_dpt"),
				MCItemDef.create("bill_co_tel", "bill_co_tel"),
				MCItemDef.create("bill_co_cntry_cd", "bill_co_cntry_cd"),
				MCItemDef.create("bill_rcpt_co_cd", "bill_rcpt_co_cd"),
				MCItemDef.create("bill_rcpt_co_nm", "bill_rcpt_co_nm"),
				MCItemDef.create("bill_bcst_nm", "bill_bcst_nm"),
				MCItemDef.create("bill_rcpt_co_ein", "bill_rcpt_co_ein"),
				MCItemDef.create("bill_rcpt_co_biz_co_no", "bill_rcpt_co_biz_co_no"),
				MCItemDef.create("bill_rcpt_co_zip_cd", "bill_rcpt_co_zip_cd"),
				MCItemDef.create("bill_rcpt_co_addr1", "bill_rcpt_co_addr1"),
				MCItemDef.create("bill_rcpt_co_addr2", "bill_rcpt_co_addr2"),
				MCItemDef.create("bill_rcpt_co_addr3", "bill_rcpt_co_addr3"),
				MCItemDef.create("bill_rcpt_co_addr4", "bill_rcpt_co_addr4"),
				MCItemDef.create("bill_bcst_dpt", "bill_bcst_dpt"),
				MCItemDef.create("bill_tel", "bill_tel"),
				MCItemDef.create("bill_rcpt_co_cntry_cd", "bill_rcpt_co_cntry_cd"),
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
				MCItemDef.create("rcv_schd_dt1", "rcv_schd_dt1"),
				MCItemDef.create("rcv_schd_amt1", "rcv_schd_amt1"),
				MCItemDef.create("rcv_mtd_cd1", "rcv_mtd_cd1"),
				MCItemDef.create("rcv_mtd_nm1", "rcv_mtd_nm1"),
				MCItemDef.create("rcv_schd_dt2", "rcv_schd_dt2"),
				MCItemDef.create("rcv_schd_amt2", "rcv_schd_amt2"),
				MCItemDef.create("rcv_mtd_cd2", "rcv_mtd_cd2"),
				MCItemDef.create("rcv_mtd_nm2", "rcv_mtd_nm2"),
				MCItemDef.create("rcv_schd_dt3", "rcv_schd_dt3"),
				MCItemDef.create("rcv_schd_amt3", "rcv_schd_amt3"),
				MCItemDef.create("rcv_mtd_cd3", "rcv_mtd_cd3"),
				MCItemDef.create("rcv_mtd_nm3", "rcv_mtd_nm3"),
				MCItemDef.create("rcv_schd_dt4", "rcv_schd_dt4"),
				MCItemDef.create("rcv_schd_amt4", "rcv_schd_amt4"),
				MCItemDef.create("rcv_mtd_cd4", "rcv_mtd_cd4"),
				MCItemDef.create("rcv_mtd_nm4", "rcv_mtd_nm4"),
				MCItemDef.create("rcv_schd_dt5", "rcv_schd_dt5"),
				MCItemDef.create("rcv_schd_amt5", "rcv_schd_amt5"),
				MCItemDef.create("rcv_mtd_cd5", "rcv_mtd_cd5"),
				MCItemDef.create("rcv_mtd_nm5", "rcv_mtd_nm5"),
				MCItemDef.create("rcv_schd_dt6", "rcv_schd_dt6"),
				MCItemDef.create("rcv_schd_amt6", "rcv_schd_amt6"),
				MCItemDef.create("rcv_mtd_cd6", "rcv_mtd_cd6"),
				MCItemDef.create("rcv_mtd_nm6", "rcv_mtd_nm6"),
				MCItemDef.create("rcv_schd_dt7", "rcv_schd_dt7"),
				MCItemDef.create("rcv_schd_amt7", "rcv_schd_amt7"),
				MCItemDef.create("rcv_mtd_cd7", "rcv_mtd_cd7"),
				MCItemDef.create("rcv_mtd_nm7", "rcv_mtd_nm7"),
				MCItemDef.create("rcv_schd_dt8", "rcv_schd_dt8"),
				MCItemDef.create("rcv_schd_amt8", "rcv_schd_amt8"),
				MCItemDef.create("rcv_mtd_cd8", "rcv_mtd_cd8"),
				MCItemDef.create("rcv_mtd_nm8", "rcv_mtd_nm8"),
				MCItemDef.create("rcv_schd_dt9", "rcv_schd_dt9"),
				MCItemDef.create("rcv_schd_amt9", "rcv_schd_amt9"),
				MCItemDef.create("rcv_mtd_cd9", "rcv_mtd_cd9"),
				MCItemDef.create("rcv_mtd_nm9", "rcv_mtd_nm9"),
				MCItemDef.create("rcv_schd_dt10", "rcv_schd_dt10"),
				MCItemDef.create("rcv_schd_amt10", "rcv_schd_amt10"),
				MCItemDef.create("rcv_mtd_cd10", "rcv_mtd_cd10"),
				MCItemDef.create("rcv_mtd_nm10", "rcv_mtd_nm10"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("bank_ac_typ", "bank_ac_typ"),
				MCItemDef.create("bank_ac_no", "bank_ac_no"),
				MCItemDef.create("bank_ac_holder", "bank_ac_holder"),
				MCItemDef.create("bank_ac_holder_sub", "bank_ac_holder_sub"),
				MCItemDef.create("bank_cd", "bank_cd"),
				MCItemDef.create("bank_nm", "bank_nm"),
				MCItemDef.create("branch_cd", "branch_cd"),
				MCItemDef.create("branch_nm", "branch_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("slip_sts_typ", "slip_sts_typ"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("ship_dlv_slip_d_no", "ship_dlv_slip_d_no"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_rev", "act_rev"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("dlv_dt", "dlv_dt"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_alt_nm1", "itm_alt_nm1"),
				MCItemDef.create("itm_alt_nm2", "itm_alt_nm2"),
				MCItemDef.create("itm_alt_nm3", "itm_alt_nm3"),
				MCItemDef.create("itm_alt_nm4", "itm_alt_nm4"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char4", "sub_char4"),
				MCItemDef.create("sub_char5", "sub_char5"),
				MCItemDef.create("sub_char6", "sub_char6"),
				MCItemDef.create("sub_char7", "sub_char7"),
				MCItemDef.create("sub_char8", "sub_char8"),
				MCItemDef.create("sub_char9", "sub_char9"),
				MCItemDef.create("sub_char10", "sub_char10"),
				MCItemDef.create("sub_char11", "sub_char11"),
				MCItemDef.create("sub_char12", "sub_char12"),
				MCItemDef.create("sub_char13", "sub_char13"),
				MCItemDef.create("sub_char14", "sub_char14"),
				MCItemDef.create("sub_char15", "sub_char15"),
				MCItemDef.create("sub_char16", "sub_char16")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MS_MSLAL7220_BillRecvConv_Conv03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSLAL7220", "BillRecvConv_Conv03",
			mcframe.serverPFUD.PFUDL5010.PDef.PF_PFUDL5010_ConvBase04_DOWN_BLOCK0(),
			new MCItemDef[]{
			}
			,
			MCBlockDef.create("SdrvDtl")
		);
	}
	//FMCB DEF_CLASSES END
}

