package mcframe.clientMSBG.MSBGP0240;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBGP_SwArBalReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBGL0240.Srch01.UP.BLOCK0")){
			return MS_MSBGL0240_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0240.Srch01.DOWN.BLOCK0")){
			return MS_MSBGL0240_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0240.Srch01.DOWN.BLOCK1")){
			return MS_MSBGL0240_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0240.Srch02.UP.BLOCK0")){
			return MS_MSBGL0240_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0240.Srch02.DOWN.BLOCK0")){
			return MS_MSBGL0240_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0240.Srch02.DOWN.BLOCK1")){
			return MS_MSBGL0240_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0240.Upd01.UP.BLOCK0")){
			return MS_MSBGL0240_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0240.Upd01.UP.BLOCK1")){
			return MS_MSBGL0240_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0240.Upd01.UP.BLOCK2")){
			return MS_MSBGL0240_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MS.MSBGL0240.Upd02.UP.BLOCK0")){
			return MS_MSBGL0240_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBGL0240.Upd02.UP.BLOCK1")){
			return MS_MSBGL0240_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBGL0240.Upd02.UP.BLOCK2")){
			return MS_MSBGL0240_Upd02_UP_BLOCK2();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBGL0240_Srch01_INFO = new MCOperationInfo("MS", "MSBGL0240", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0240_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("not_bill_inc_flg", "not_bill_inc_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0240_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.IGNORE_ITEM("slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_rev", "act_rev"),
				MCItemDef.create("act_seq", "act_seq"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("act_d_seq", "act_d_seq"),
				MCItemDef.create("inc_tax_amt_p" + ".amt", "inc_tax_amt"),
				MCItemDef.create("tgt_sw_amt_p" + ".amt", "tgt_sw_amt"),
				MCItemDef.create("not_appl_wtax_amt_p" + ".amt", "not_appl_wtax_amt"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("sls_wrk_no", "sls_wrk_no"),
				MCItemDef.create("sls_wrk_nm", "sls_wrk_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ar_typ_nm", "ar_typ_nm"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("dlv_dt", "dlv_dt"),
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("bill_dt", "bill_dt"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("ship_dlv_slip_d_no", "ship_dlv_slip_d_no"),
				MCItemDef.create("ship_dlv_slip_multi_flg", "ship_dlv_slip_multi_flg"),
				MCItemDef.create("bill_flg", "bill_flg"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("parent_bill_d_no", "parent_bill_d_no"),
				MCItemDef.create("bill_d_appl_bal_upd_cntr", "bill_d_appl_bal_upd_cntr"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place")
			}
			,
			MCBlockDef.create("SwFr")
		);
	}
	public static MCContainerDef MS_MSBGL0240_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0240", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd")
			}
			,
			MCBlockDef.create("Sw")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0240_Srch02_INFO = new MCOperationInfo("MS", "MSBGL0240", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0240_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0240", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("ar_typ", "ar_typ")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBGL0240_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0240", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("acst_nm", "acst_nm"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("ar_dpt_nm", "ar_dpt_nm"),
				MCItemDef.create("bcst_cd", "bcst_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("bill_dpt_nm", "bill_dpt_nm"),
				MCItemDef.IGNORE_ITEM("slip_sts_typ"),
				MCItemDef.create("slip_sts_typ_nm", "slip_sts_typ_nm"),
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("trd_nm", "trd_nm"),
				MCItemDef.create("act_no", "act_no"),
				MCItemDef.create("act_rev", "act_rev"),
				MCItemDef.create("act_seq", "act_seq"),
				MCItemDef.create("act_d_no", "act_d_no"),
				MCItemDef.create("act_d_seq", "act_d_seq"),
				MCItemDef.create("inc_tax_amt_p" + ".amt", "inc_tax_amt"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("sls_wrk_no", "sls_wrk_no"),
				MCItemDef.create("sls_wrk_nm", "sls_wrk_nm"),
				MCItemDef.create("ar_typ", "ar_typ"),
				MCItemDef.create("ar_typ_nm", "ar_typ_nm"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("dlv_dt", "dlv_dt"),
				MCItemDef.create("bill_ym", "bill_ym"),
				MCItemDef.create("bill_cl_day", "bill_cl_day"),
				MCItemDef.create("bill_dt", "bill_dt"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dest_cd1", "dest_cd1"),
				MCItemDef.create("dest_nm1", "dest_nm1"),
				MCItemDef.create("dest_cd2", "dest_cd2"),
				MCItemDef.create("dest_nm2", "dest_nm2"),
				MCItemDef.create("dest_cd3", "dest_cd3"),
				MCItemDef.create("dest_nm3", "dest_nm3"),
				MCItemDef.create("sls_usr_cd", "sls_usr_cd"),
				MCItemDef.create("sls_usr_nm", "sls_usr_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("dlv_slip_no", "dlv_slip_no"),
				MCItemDef.create("dlv_slip_d_no", "dlv_slip_d_no"),
				MCItemDef.create("ship_dlv_slip_no", "ship_dlv_slip_no"),
				MCItemDef.create("ship_dlv_slip_d_no", "ship_dlv_slip_d_no"),
				MCItemDef.create("ship_dlv_slip_multi_flg", "ship_dlv_slip_multi_flg"),
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.IGNORE_ITEM("parent_bill_d_no"),
				MCItemDef.create("bill_d_upd_cntr", "bill_d_upd_cntr"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("amt_dec_place", "amt_dec_place"),
				MCItemDef.create("upri_dec_place", "upri_dec_place")
			}
			,
			MCBlockDef.create("SwFr")
		);
	}
	public static MCContainerDef MS_MSBGL0240_Srch02_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch02_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0240", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd")
			}
			,
			MCBlockDef.create("Sw")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0240_Upd01_INFO = new MCOperationInfo("MS", "MSBGL0240", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0240_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_SwFr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0240", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("parent_bill_d_no", "parent_bill_d_no"),
				MCItemDef.create("bill_d_appl_bal_upd_cntr", "bill_d_appl_bal_upd_cntr")
			}
			,
			MCBlockDef.create("SwFr")
		);
	}

	public static MCContainerDef MS_MSBGL0240_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_SwBase] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0240", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "usr_cd"),
				MCItemDef.create("sw_dt", "sw_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("bill_basis_dt", "bill_basis_dt"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Sw")
		);
	}

	public static MCContainerDef MS_MSBGL0240_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_SwTo] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0240", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("ar_dpt_cd", "to_ar_dpt_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("wrk_ope_typ", "wrk_ope_typ"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no")
			}
			,
			MCBlockDef.create("SwTo")
		);
	}
	
	static final MCOperationInfo MS_MSBGL0240_Upd02_INFO = new MCOperationInfo("MS", "MSBGL0240", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBGL0240_Upd02_UP_BLOCK0() {
		/** Ope.のBlock [Upd02_SwFr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0240", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("bill_d_no", "bill_d_no"),
				MCItemDef.create("bill_d_upd_cntr", "bill_d_upd_cntr")
			}
			,
			MCBlockDef.create("SwFr")
		);
	}

	public static MCContainerDef MS_MSBGL0240_Upd02_UP_BLOCK1() {
		/** Ope.のBlock [Upd02_SwBase] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0240", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("trd_cd", "trd_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "usr_cd"),
				MCItemDef.create("sw_dt", "sw_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Sw")
		);
	}

	public static MCContainerDef MS_MSBGL0240_Upd02_UP_BLOCK2() {
		/** Ope.のBlock [Upd02_SwTo] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBGL0240", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("ar_dpt_cd", "to_ar_dpt_cd"),
				MCItemDef.create("bill_dpt_cd", "bill_dpt_cd"),
				MCItemDef.create("wrk_ope_typ", "wrk_ope_typ"),
				MCItemDef.create("wrk_no_p" + ".wrk_no", "wrk_no")
			}
			,
			MCBlockDef.create("SwTo")
		);
	}


	//FMCB DEF_CLASSES END
}

