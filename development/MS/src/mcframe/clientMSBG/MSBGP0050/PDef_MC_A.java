package mcframe.clientMSBG.MSBGP0050;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBGP_BillAcstSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0050.Srch01.UP.BLOCK0")){
			return MS_MSBGL0050_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0050.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0050_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBGL0050_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0050", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0050_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_cl_ym_fr", "bill_cl_ym_fr"),
				MCItemDef.create("bill_cl_ym_to", "bill_cl_ym_to"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("rcv_schd_dt_fr", "rcv_schd_dt_fr"),
				MCItemDef.create("rcv_schd_dt_to", "rcv_schd_dt_to"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
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
				MCItemDef.create("bcst_grp_p" + ".bp_grp_nm10", "bcst_grp_nm10"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg1", "acst_grp_flg1"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd1", "acst_grp_cd1"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm1", "acst_grp_nm1"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg2", "acst_grp_flg2"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd2", "acst_grp_cd2"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm2", "acst_grp_nm2"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg3", "acst_grp_flg3"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd3", "acst_grp_cd3"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm3", "acst_grp_nm3"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg4", "acst_grp_flg4"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd4", "acst_grp_cd4"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm4", "acst_grp_nm4"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg5", "acst_grp_flg5"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd5", "acst_grp_cd5"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm5", "acst_grp_nm5"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg6", "acst_grp_flg6"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd6", "acst_grp_cd6"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm6", "acst_grp_nm6"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg7", "acst_grp_flg7"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd7", "acst_grp_cd7"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm7", "acst_grp_nm7"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg8", "acst_grp_flg8"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd8", "acst_grp_cd8"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm8", "acst_grp_nm8"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg9", "acst_grp_flg9"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd9", "acst_grp_cd9"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm9", "acst_grp_nm9"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_flg10", "acst_grp_flg10"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd10", "acst_grp_cd10"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm10", "acst_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0050_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0050", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_cl_ym", "bill_cl_ym"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("multi_flg", "multi_flg"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("bill_dt", "bill_dt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ar_typ_nm", "ar_typ_nm"),
				MCItemDef.create("lastBillAmt_p" + ".amt", "last_bill_amt"),
				MCItemDef.create("rcvAmt_p" + ".amt", "rcv_amt"),
				MCItemDef.create("bfwAmt_p" + ".amt", "bfw_amt"),
				MCItemDef.create("slsAmt_p" + ".amt", "sls_amt"),
				MCItemDef.create("retAmt_p" + ".amt", "ret_amt"),
				MCItemDef.create("setoffAmt_p" + ".amt", "setoff_amt"),
				MCItemDef.create("dscntAmt_p" + ".amt", "dscnt_amt"),
				MCItemDef.create("taxAmt_p" + ".amt", "tax_amt"),
				MCItemDef.create("swToAmt_p" + ".amt", "sw_to_amt"),
				MCItemDef.create("billAmt_p" + ".amt", "bill_amt"),
				MCItemDef.create("sort_ord_flg", "sort_ord_flg"),
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
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd1", "acst_grp_cd1"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm1", "acst_grp_nm1"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd2", "acst_grp_cd2"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm2", "acst_grp_nm2"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd3", "acst_grp_cd3"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm3", "acst_grp_nm3"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd4", "acst_grp_cd4"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm4", "acst_grp_nm4"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd5", "acst_grp_cd5"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm5", "acst_grp_nm5"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd6", "acst_grp_cd6"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm6", "acst_grp_nm6"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd7", "acst_grp_cd7"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm7", "acst_grp_nm7"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd8", "acst_grp_cd8"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm8", "acst_grp_nm8"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd9", "acst_grp_cd9"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm9", "acst_grp_nm9"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_cd10", "acst_grp_cd10"),
				MCItemDef.create("acst_grp_p" + ".bp_grp_nm10", "acst_grp_nm10"),
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

