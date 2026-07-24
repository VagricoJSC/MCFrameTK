package mcframe.serverMGBA.MGBAL0060;

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
 * [MGBAL_PlnOtherWkReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBAL0060.Chk01.UP.BLOCK0")){
			return MG_MGBAL0060_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Chk01.UP.BLOCK1")){
			return MG_MGBAL0060_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBAL0060.Chk01.DOWN.BLOCK0")){
			return MG_MGBAL0060_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Chk02.UP.BLOCK0")){
			return MG_MGBAL0060_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Chk02.DOWN.BLOCK0")){
			return MG_MGBAL0060_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Chk03.UP.BLOCK0")){
			return MG_MGBAL0060_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Chk03.DOWN.BLOCK0")){
			return MG_MGBAL0060_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Imp01.UP.BLOCK0")){
			return MG_MGBAL0060_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBAL0060.Imp01.DOWN.BLOCK0")){
			return MG_MGBAL0060_Imp01_DOWN_BLOCK0();
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
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBAL0060_Srch01_DOWN_BLOCK0() {

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
				MCItemDef.create("wk_cost", "wk_cost"),
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
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Chk01_INFO = new MCOperationInfo("MG", "MGBAL0060", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("dbc" + ".wk_cost", "wk_cost"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBAL0060_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg"),
				MCItemDef.create("file_ins_flg", "file_ins_flg")
			}
			,
			MCBlockDef.create("Chk01_Ctrl")
		);
	}


	public static MCContainerDef MG_MGBAL0060_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("dbc" + ".wk_cost", "wk_cost"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
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
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Chk02_INFO = new MCOperationInfo("MG", "MGBAL0060", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MG_MGBAL0060_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Chk03_INFO = new MCOperationInfo("MG", "MGBAL0060", "Chk03", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Chk03",
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
			MCBlockDef.create("Chk03_Cnd")
		);
	}


	public static MCContainerDef MG_MGBAL0060_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Chk03",
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
			MCBlockDef.create("Chk03_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Imp01_INFO = new MCOperationInfo("MG", "MGBAL0060", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("dbc" + ".wk_cost", "wk_cost"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBAL0060_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("dbc" + ".wk_cost", "wk_cost"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
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
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Upd01_INFO = new MCOperationInfo("MG", "MGBAL0060", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("dbc" + ".wk_cost", "wk_cost"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBAL0060_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Del01_INFO = new MCOperationInfo("MG", "MGBAL0060", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBAL0060_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Del02_INFO = new MCOperationInfo("MG", "MGBAL0060", "Del02", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Del02_UP_BLOCK0() {

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
			MCBlockDef.create("Del02_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Ins01_INFO = new MCOperationInfo("MG", "MGBAL0060", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("dbc" + ".wk_cost", "wk_cost"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBAL0060_Ins02_INFO = new MCOperationInfo("MG", "MGBAL0060", "Ins02", "000000", new PDef());

	public static MCContainerDef MG_MGBAL0060_Ins02_UP_BLOCK0() {

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
			MCBlockDef.create("Ins02_Cnd")
		);
	}

	public static MCContainerDef MG_MGBAL0060_Ins02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBAL0060", "Ins02",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".pln_other_wk_key", "pln_other_wk_key"),
				MCItemDef.create("dbc" + ".calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("dbc" + ".ctg_cd", "ctg_cd"),
				MCItemDef.create("dbc" + ".loc_cd", "loc_cd"),
				MCItemDef.create("dbc" + ".oper_cd", "oper_cd"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("dbc" + ".wk_cost", "wk_cost"),
				MCItemDef.create("dbc" + ".rmrks", "rmrks"),
				MCItemDef.create("dbc" + ".sub_char1", "sub_char1"),
				MCItemDef.create("dbc" + ".sub_char2", "sub_char2"),
				MCItemDef.create("dbc" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Ins02_Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

