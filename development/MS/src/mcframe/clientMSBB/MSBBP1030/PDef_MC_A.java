package mcframe.clientMSBB.MSBBP1030;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBBP_WrkReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBL1030.Srch01.UP.BLOCK0")){
			return MS_MSBBL1030_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1030.Srch01.DOWN.BLOCK0")){
			return MS_MSBBL1030_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1030.Srch01.DOWN.BLOCK1")){
			return MS_MSBBL1030_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1030.Srch01.DOWN.BLOCK2")){
			return MS_MSBBL1030_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1030.Srch01.DOWN.BLOCK3")){
			return MS_MSBBL1030_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MS.MSBBL1030.Srch01.DOWN.BLOCK4")){
			return MS_MSBBL1030_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MS.MSBBL1030.Srch01.DOWN.BLOCK5")){
			return MS_MSBBL1030_Srch01_DOWN_BLOCK5();
		}
		else if (id.equals("MS.MSBBL1030.Ins01.UP.BLOCK0")){
			return MS_MSBBL1030_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1030.Ins01.UP.BLOCK1")){
			return MS_MSBBL1030_Ins01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1030.Ins01.UP.BLOCK2")){
			return MS_MSBBL1030_Ins01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1030.Ins01.UP.BLOCK3")){
			return MS_MSBBL1030_Ins01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBBL1030.Ins01.UP.BLOCK4")){
			return MS_MSBBL1030_Ins01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBBL1030.Ins01.DOWN.BLOCK0")){
			return MS_MSBBL1030_Ins01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1030.Ins01.DOWN.BLOCK1")){
			return MS_MSBBL1030_Ins01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1030.Upd01.UP.BLOCK0")){
			return MS_MSBBL1030_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1030.Upd01.UP.BLOCK1")){
			return MS_MSBBL1030_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBBL1030.Upd01.UP.BLOCK2")){
			return MS_MSBBL1030_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBBL1030.Upd01.UP.BLOCK3")){
			return MS_MSBBL1030_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MS.MSBBL1030.Upd01.UP.BLOCK4")){
			return MS_MSBBL1030_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MS.MSBBL1030.Upd01.DOWN.BLOCK0")){
			return MS_MSBBL1030_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBBL1030.Del01.UP.BLOCK0")){
			return MS_MSBBL1030_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBBL1030_Srch01_INFO = new MCOperationInfo("MS", "MSBBL1030", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1030_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBBL1030_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("wrk_desc", "wrk_desc"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("term_cond", "term_cond"),
				MCItemDef.create("wrk_sts_cd", "wrk_sts_cd"),
				MCItemDef.create("wrk_sts_nm", "wrk_sts_nm"),
				MCItemDef.create("slo_acc_cd", "slo_acc_cd"),
				MCItemDef.create("slo_acc_nm", "slo_acc_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("budget_p" + ".amt", "budget"),
				MCItemDef.create("wrk_ar_flg", "wrk_ar_flg"),
				MCItemDef.create("wrk_ap_flg", "wrk_ap_flg"),
				MCItemDef.create("slo_rsn", "slo_rsn"),
				MCItemDef.create("fail_rsn", "fail_rsn"),
				MCItemDef.create("wrk_rmrks", "wrk_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("can_flg", "can_flg"),
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
	public static MCContainerDef MS_MSBBL1030_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_sundry_flg", "cst_sundry_flg"),
				MCItemDef.create("cst_addr_p" + ".zip_cd", "zip_cd"),
				MCItemDef.create("cst_addr_p" + ".addr1", "addr1"),
				MCItemDef.create("cst_addr_p" + ".addr2", "addr2"),
				MCItemDef.create("cst_addr_p" + ".addr3", "addr3"),
				MCItemDef.create("cst_addr_p" + ".addr4", "addr4"),
				MCItemDef.create("cst_addr_p" + ".cntct_dpt", "cst_cntct_dpt"),
				MCItemDef.create("cst_addr_p" + ".cntct_psn", "cst_cntct_psn"),
				MCItemDef.create("cst_addr_p" + ".tel", "tel"),
				MCItemDef.create("cst_addr_p" + ".fax", "fax"),
				MCItemDef.create("capital", "capital"),
				MCItemDef.create("emp_num", "emp_num"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}
	public static MCContainerDef MS_MSBBL1030_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("hist_no", "hist_no"),
				MCItemDef.create("act_sts_cd", "act_sts_cd"),
				MCItemDef.create("act_sts_nm", "act_sts_nm"),
				MCItemDef.create("act_hist", "act_hist"),
				MCItemDef.create("act_schd_dt", "act_schd_dt"),
				MCItemDef.create("act_schd", "act_schd"),
				MCItemDef.create("act_act_dt", "act_act_dt"),
				MCItemDef.create("act_act", "act_act"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	public static MCContainerDef MS_MSBBL1030_Srch01_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch01_Dtl3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("comp_no", "comp_no"),
				MCItemDef.create("comp_dt", "comp_dt"),
				MCItemDef.create("comp_info", "comp_info"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl3")
		);
	}
	public static MCContainerDef MS_MSBBL1030_Srch01_DOWN_BLOCK4() {
	/** Ope.のBlock [Srch01_Dtl4] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("qtn_no", "qtn_no"),
				MCItemDef.create("qtn_rev", "qtn_rev"),
				MCItemDef.create("qtn_typ", "qtn_typ"),
				MCItemDef.create("qtn_typ_nm", "qtn_typ_nm"),
				MCItemDef.create("qtn_dt", "qtn_dt"),
				MCItemDef.create("valid_dt", "valid_dt"),
				MCItemDef.create("rcpt_dt", "rcpt_dt"),
				MCItemDef.create("rcpt_usr_cd", "rcpt_usr_cd"),
				MCItemDef.create("rcpt_usr_nm", "rcpt_usr_nm"),
				MCItemDef.create("qtn_rmrks", "qtn_rmrks"),
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
				MCItemDef.IGNORE_ITEM("upd_cntr")
			}
			,
			MCBlockDef.create("Dtl4")
		);
	}
	public static MCContainerDef MS_MSBBL1030_Srch01_DOWN_BLOCK5() {
	/** Ope.のBlock [Srch01_Dtl5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("qtn_flg", "qtn_flg"),
				MCItemDef.create("slo_flg", "slo_flg"),
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
			MCBlockDef.create("Dtl5")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1030_Ins01_INFO = new MCOperationInfo("MS", "MSBBL1030", "Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1030_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("wrk_desc", "wrk_desc"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("term_cond", "term_cond"),
				MCItemDef.create("wrk_sts_cd", "wrk_sts_cd"),
				MCItemDef.create("slo_acc_cd", "slo_acc_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("budget_p" + ".amt", "budget"),
				MCItemDef.create("wrk_ar_flg", "wrk_ar_flg"),
				MCItemDef.create("wrk_ap_flg", "wrk_ap_flg"),
				MCItemDef.create("slo_rsn", "slo_rsn"),
				MCItemDef.create("fail_rsn", "fail_rsn"),
				MCItemDef.create("wrk_rmrks", "wrk_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL1030_Ins01_UP_BLOCK1() {
		/** Ope.のBlock [Ins01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_sundry_flg", "cst_sundry_flg"),
				MCItemDef.create("cst_addr_p" + ".zip_cd", "zip_cd"),
				MCItemDef.create("cst_addr_p" + ".addr1", "addr1"),
				MCItemDef.create("cst_addr_p" + ".addr2", "addr2"),
				MCItemDef.create("cst_addr_p" + ".addr3", "addr3"),
				MCItemDef.create("cst_addr_p" + ".addr4", "addr4"),
				MCItemDef.create("cst_addr_p" + ".cntct_dpt", "cst_cntct_dpt"),
				MCItemDef.create("cst_addr_p" + ".cntct_psn", "cst_cntct_psn"),
				MCItemDef.create("cst_addr_p" + ".tel", "tel"),
				MCItemDef.create("cst_addr_p" + ".fax", "fax"),
				MCItemDef.create("capital", "capital"),
				MCItemDef.create("emp_num", "emp_num"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}

	public static MCContainerDef MS_MSBBL1030_Ins01_UP_BLOCK2() {
		/** Ope.のBlock [Ins01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("hist_no", "hist_no"),
				MCItemDef.create("act_sts_cd", "act_sts_cd"),
				MCItemDef.create("act_hist", "act_hist"),
				MCItemDef.create("act_schd_dt", "act_schd_dt"),
				MCItemDef.create("act_schd", "act_schd"),
				MCItemDef.create("act_act_dt", "act_act_dt"),
				MCItemDef.create("act_act", "act_act"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}

	public static MCContainerDef MS_MSBBL1030_Ins01_UP_BLOCK3() {
		/** Ope.のBlock [Ins01_Dtl3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("comp_no", "comp_no"),
				MCItemDef.create("comp_dt", "comp_dt"),
				MCItemDef.create("comp_info", "comp_info"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Dtl3")
		);
	}

	public static MCContainerDef MS_MSBBL1030_Ins01_UP_BLOCK4() {
		/** Ope.のBlock [Ins01_Dtl5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("sno1", "sno1")
			}
			,
			MCBlockDef.create("Dtl5")
		);
	}


	public static MCContainerDef MS_MSBBL1030_Ins01_DOWN_BLOCK0() {
	/** Ope.のBlock [Ins01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}
	public static MCContainerDef MS_MSBBL1030_Ins01_DOWN_BLOCK1() {
	/** Ope.のBlock [Ins01_Dtl5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("sno1", "sno1")
			}
			,
			MCBlockDef.create("Dtl5")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1030_Upd01_INFO = new MCOperationInfo("MS", "MSBBL1030", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1030_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("wrk_desc", "wrk_desc"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("term_cond", "term_cond"),
				MCItemDef.create("wrk_sts_cd", "wrk_sts_cd"),
				MCItemDef.create("slo_acc_cd", "slo_acc_cd"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("budget_p" + ".amt", "budget"),
				MCItemDef.create("wrk_ar_flg", "wrk_ar_flg"),
				MCItemDef.create("wrk_ap_flg", "wrk_ap_flg"),
				MCItemDef.create("slo_rsn", "slo_rsn"),
				MCItemDef.create("fail_rsn", "fail_rsn"),
				MCItemDef.create("wrk_rmrks", "wrk_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}

	public static MCContainerDef MS_MSBBL1030_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("cst_sundry_flg", "cst_sundry_flg"),
				MCItemDef.create("cst_addr_p" + ".zip_cd", "zip_cd"),
				MCItemDef.create("cst_addr_p" + ".addr1", "addr1"),
				MCItemDef.create("cst_addr_p" + ".addr2", "addr2"),
				MCItemDef.create("cst_addr_p" + ".addr3", "addr3"),
				MCItemDef.create("cst_addr_p" + ".addr4", "addr4"),
				MCItemDef.create("cst_addr_p" + ".cntct_dpt", "cst_cntct_dpt"),
				MCItemDef.create("cst_addr_p" + ".cntct_psn", "cst_cntct_psn"),
				MCItemDef.create("cst_addr_p" + ".tel", "tel"),
				MCItemDef.create("cst_addr_p" + ".fax", "fax"),
				MCItemDef.create("capital", "capital"),
				MCItemDef.create("emp_num", "emp_num"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl1")
		);
	}

	public static MCContainerDef MS_MSBBL1030_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("hist_no", "hist_no"),
				MCItemDef.create("act_sts_cd", "act_sts_cd"),
				MCItemDef.create("act_hist", "act_hist"),
				MCItemDef.create("act_schd_dt", "act_schd_dt"),
				MCItemDef.create("act_schd", "act_schd"),
				MCItemDef.create("act_act_dt", "act_act_dt"),
				MCItemDef.create("act_act", "act_act"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}

	public static MCContainerDef MS_MSBBL1030_Upd01_UP_BLOCK3() {
		/** Ope.のBlock [Upd01_Dtl3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("comp_no", "comp_no"),
				MCItemDef.create("comp_dt", "comp_dt"),
				MCItemDef.create("comp_info", "comp_info"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl3")
		);
	}

	public static MCContainerDef MS_MSBBL1030_Upd01_UP_BLOCK4() {
		/** Ope.のBlock [Upd01_Dtl5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("num_flg", "num_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl5")
		);
	}


	public static MCContainerDef MS_MSBBL1030_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Dtl5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sno1", "sno1")
			}
			,
			MCBlockDef.create("Dtl5")
		);
	}
	
	static final MCOperationInfo MS_MSBBL1030_Del01_INFO = new MCOperationInfo("MS", "MSBBL1030", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBBL1030_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Hdr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBBL1030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Hdr")
		);
	}


	//FMCB DEF_CLASSES END
}

