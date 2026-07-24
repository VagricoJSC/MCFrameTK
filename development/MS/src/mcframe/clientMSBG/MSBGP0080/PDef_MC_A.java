package mcframe.clientMSBG.MSBGP0080;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBGP_RcvSchdAdjstReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0080.Srch01.UP.BLOCK0")){
			return MS_MSBGL0080_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0080.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0080_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0080.Srch01.DOWN.BLOCK1")){
			return MS_MSBGL0080_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0080.Srch01.DOWN.BLOCK2")){
			return MS_MSBGL0080_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0080.Upd01.UP.BLOCK0")){
			return MS_MSBGL0080_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0080.Upd01.UP.BLOCK1")){
			return MS_MSBGL0080_Upd01_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MS_MSBGL0080_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0080", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0080_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_no", "bill_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0080_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("prnt_flg", "prnt_flg"),
				MCItemDef.create("bfw_bal_disp_flg", "bfw_bal_disp_flg"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bcst_nm", "bcst_nm"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_nm", "trd_cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("sls_amt_p" + ".amt", "sls_amt"),
				MCItemDef.create("ret_amt_p" + ".amt", "ret_amt"),
				MCItemDef.create("dscnt_amt_p" + ".amt", "dscnt_amt"),
				MCItemDef.create("tax_amt_p" + ".amt", "tax_amt"),
				MCItemDef.create("sw_to_amt_p" + ".amt", "sw_to_amt"),
				MCItemDef.create("rcv_schd_amt_total_p" + ".amt", "rcv_schd_amt_total"),
				MCItemDef.create("rcv_act_amt_total_p" + ".amt", "rcv_act_amt_total"),
				MCItemDef.create("rcv_schd_amt_bal_p" + ".amt", "rcv_schd_amt_bal"),
				MCItemDef.create("rcv_schd_adjst_flg", "rcv_schd_adjst_flg"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
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
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBGL0080_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("rcv_cd", "rcv_cd"),
				MCItemDef.create("rcv_nm", "rcv_nm"),
				MCItemDef.create("rcv_typ", "rcv_typ"),
				MCItemDef.create("rcv_schd_amt_p" + ".amt", "rcv_schd_amt"),
				MCItemDef.create("rcv_schd_no", "rcv_schd_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
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
			MCBlockDef.create("Dtl1")
		);
	}
	public static MCContainerDef MS_MSBGL0080_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Dtl3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0080", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rcv_cd", "rcv_cd"),
				MCItemDef.create("rcv_nm", "rcv_nm"),
				MCItemDef.create("rcv_act_dt", "rcv_act_dt"),
				MCItemDef.create("rcv_act_amt_p" + ".amt", "rcv_act_amt"),
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
			MCBlockDef.create("Dtl3")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0080_Upd01_INFO = new MCOperationInfo("MS", "MSBGL0080", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0080_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0080", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_schd_adjst_flg", "rcv_schd_adjst_flg"),
				MCItemDef.create("bill_mng_no", "bill_mng_no"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBGL0080_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0080", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rcv_schd_dt", "rcv_schd_dt"),
				MCItemDef.create("rcv_cd", "rcv_cd"),
				MCItemDef.create("rcv_typ", "rcv_typ"),
				MCItemDef.create("rcv_schd_amt_p" + ".amt", "rcv_schd_amt"),
				MCItemDef.create("rcv_schd_no", "rcv_schd_no"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}


	//FMCB DEF_CLASSES END
}

