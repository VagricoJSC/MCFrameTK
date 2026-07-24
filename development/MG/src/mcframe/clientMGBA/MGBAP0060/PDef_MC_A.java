package mcframe.clientMGBA.MGBAP0060;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MGBAP_PlnOtherWkReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBAL0060.Srch01.UP.BLOCK0")){
			return MG_MGBAL0060_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Srch01.DOWN.BLOCK0")){
			return MG_MGBAL0060_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Upd01.UP.BLOCK0")){
			return MG_MGBAL0060_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Upd01.DOWN.BLOCK0")){
			return MG_MGBAL0060_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Del01.UP.BLOCK0")){
			return MG_MGBAL0060_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Del01.DOWN.BLOCK0")){
			return MG_MGBAL0060_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Del02.UP.BLOCK0")){
			return MG_MGBAL0060_Del02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Imp01.UP.BLOCK0")){
			return MG_MGBAL0060_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Imp01.DOWN.BLOCK0")){
			return MG_MGBAL0060_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Ins01.UP.BLOCK0")){
			return MG_MGBAL0060_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Ins02.UP.BLOCK0")){
			return MG_MGBAL0060_Ins02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Ins02.UP.BLOCK1")){
			return MG_MGBAL0060_Ins02_UP_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MG_MGBAL0060_Srch01_INFO = new MCOperationInfo("MG", "MGBAL0060", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBAL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MG_MGBAL0060_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBAL0060", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("qty_p" + ".wk_cost_qty", "wk_cost"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("rmrks", "rmrks"),
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
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("mfg_flg", "mfg_flg")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Upd01_INFO = new MCOperationInfo("MG", "MGBAL0060", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBAL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("qty_p" + ".wk_cost_qty", "wk_cost"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MG_MGBAL0060_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBAL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Del01_INFO = new MCOperationInfo("MG", "MGBAL0060", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBAL0060", "Del01",
			new MCItemDef[]{
				MCItemDef.create("pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MG_MGBAL0060_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBAL0060", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Del02_INFO = new MCOperationInfo("MG", "MGBAL0060", "Del02", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Del02_UP_BLOCK0() {
		/** Ope.のBlock [Del02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBAL0060", "Del02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("DelCnd")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Imp01_INFO = new MCOperationInfo("MG", "MGBAL0060", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Imp01_UP_BLOCK0() {
		/** Ope.のBlock [Imp01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBAL0060", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("qty_p" + ".wk_cost_qty", "wk_cost"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MG_MGBAL0060_Imp01_DOWN_BLOCK0() {
	/** Ope.のBlock [Imp01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBAL0060", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("qty_p" + ".wk_cost_qty", "wk_cost"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("mfg_flg", "mfg_flg")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Ins01_INFO = new MCOperationInfo("MG", "MGBAL0060", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Ins01_UP_BLOCK0() {
		/** Ope.のBlock [Ins01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBAL0060", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("qty_p" + ".wk_cost_qty", "wk_cost"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Ins02_INFO = new MCOperationInfo("MG", "MGBAL0060", "Ins02", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Ins02_UP_BLOCK0() {
		/** Ope.のBlock [Ins02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBAL0060", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("loc_cd", "loc_cd")
			}
			,
			MCBlockDef.create("DelCnd")
		);
	}

	public static MCContainerDef MG_MGBAL0060_Ins02_UP_BLOCK1() {
		/** Ope.のBlock [Ins02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBAL0060", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("qty_p" + ".wk_cost_qty", "wk_cost"),
				MCItemDef.create("rmrks", "rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

