package mcframe.clientMSBH.MSBHP0180;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBHP_BillRcptDSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL0180.Srch01.UP.BLOCK0")){
			return MS_MSBHL0180_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0180.Srch01.DOWN.BLOCK0")){
			return MS_MSBHL0180_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL0180.Srch01.DOWN.BLOCK1")){
			return MS_MSBHL0180_Srch01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBHL0180_Srch01_INFO = new MCOperationInfo("MS", "MSBHL0180", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL0180_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0180", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_rcpt_no", "bill_rcpt_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBHL0180_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0180", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_cl_dt", "bill_cl_dt"),
				MCItemDef.create("bill_dt", "bill_dt"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("invalid_flg", "invalid_flg"),
				MCItemDef.create("pre_bill_no", "pre_bill_no"),
				MCItemDef.create("pre_bill_dt", "pre_bill_dt"),
				MCItemDef.create("bill_st_dt", "bill_st_dt"),
				MCItemDef.create("bill_end_dt", "bill_end_dt"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("bill_src_cd", "bill_src_cd"),
				MCItemDef.create("bill_src_nm", "bill_src_nm"),
				MCItemDef.create("bill_src_dpt", "bill_src_dpt"),
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
				MCItemDef.create("adv_amt_bal", "adv_amt_bal"),
				MCItemDef.create("adv_amt", "adv_amt"),
				MCItemDef.create("adv_setoff_amt", "adv_setoff_amt"),
				MCItemDef.create("adv_setoff_tax_amt", "adv_setoff_tax_amt"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr1")
		);
	}
	public static MCContainerDef MS_MSBHL0180_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBHL0180", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_rcpt_d_no", "bill_rcpt_d_no"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("dlv_dt", "dlv_dt"),
				MCItemDef.create("rcv_dt", "rcv_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("base_ac_dt", "base_ac_dt"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("ship_dlv_slip_d_no", "ship_dlv_slip_d_no"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_rev", "act_rev"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("po_d_no", "po_d_no"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_inc_tax_amt", "trd_inc_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("tax_nm", "tax_nm"),
				MCItemDef.create("tax_rate", "tax_rate"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("inc_tax_flg", "inc_tax_flg"),
				MCItemDef.create("trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
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
			MCBlockDef.create("Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

