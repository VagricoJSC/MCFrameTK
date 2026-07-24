package mcframe.clientMABG.MABGP0420;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABGP_RptConfReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABGL0420.Srch01.UP.BLOCK0")){
			return MA_MABGL0420_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0420.Srch01.DOWN.BLOCK0")){
			return MA_MABGL0420_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABGL0420.Srch01.DOWN.BLOCK1")){
			return MA_MABGL0420_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABGL0420.Upd01.UP.BLOCK0")){
			return MA_MABGL0420_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0420.Upd01.UP.BLOCK1")){
			return MA_MABGL0420_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABGL0420.Del01.UP.BLOCK0")){
			return MA_MABGL0420_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABGL0420_Srch01_INFO = new MCOperationInfo("MA", "MABGL0420", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0420_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0420", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABGL0420_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0420", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_ptn_nm", "rpt_ptn_nm"),
				MCItemDef.create("rpt_row_cd", "rpt_row_cd"),
				MCItemDef.create("rpt_pre_word", "rpt_pre_word"),
				MCItemDef.create("rpt_row_nm_lcl", "rpt_row_nm_lcl"),
				MCItemDef.create("rpt_row_nm", "rpt_row_nm"),
				MCItemDef.create("rpt_seq", "rpt_seq"),
				MCItemDef.create("sml_flg", "sml_flg"),
				MCItemDef.create("hdn_flg", "hdn_flg"),
				MCItemDef.create("rpt_tgt_typ", "rpt_tgt_typ"),
				MCItemDef.create("rpt_tgt_typ_nm", "rpt_tgt_typ_nm"),
				MCItemDef.create("cost_io_typ", "cost_io_typ"),
				MCItemDef.create("cost_io_typ_nm", "cost_io_typ_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("std_flg", "std_flg"),
				MCItemDef.create("qty_unit_typ", "qty_unit_typ"),
				MCItemDef.create("qty_unit_typ_nm", "qty_unit_typ_nm"),
				MCItemDef.create("alc_ac_grp_cd1", "alc_ac_grp_cd1"),
				MCItemDef.create("alc_ac_grp_nm1", "alc_ac_grp_nm1"),
				MCItemDef.create("alc_ac_grp_cd2", "alc_ac_grp_cd2"),
				MCItemDef.create("alc_ac_grp_nm2", "alc_ac_grp_nm2"),
				MCItemDef.create("alc_ac_grp_cd3", "alc_ac_grp_cd3"),
				MCItemDef.create("alc_ac_grp_nm3", "alc_ac_grp_nm3"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_slip_typ_nm", "ac_slip_typ_nm"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("expns_typ", "expns_typ"),
				MCItemDef.create("expns_typ_nm", "expns_typ_nm"),
				MCItemDef.create("direct_typ", "direct_typ"),
				MCItemDef.create("direct_typ_nm", "direct_typ_nm"),
				MCItemDef.create("var_typ", "var_typ"),
				MCItemDef.create("var_typ_nm", "var_typ_nm"),
				MCItemDef.create("expns_grp_cd", "expns_grp_cd"),
				MCItemDef.create("expns_grp_nm", "expns_grp_nm"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("expns_nm", "expns_nm"),
				MCItemDef.create("fg_p" + ".red", "fg_r"),
				MCItemDef.create("fg_p" + ".green", "fg_g"),
				MCItemDef.create("fg_p" + ".blue", "fg_b"),
				MCItemDef.create("bg_p" + ".red", "bg_r"),
				MCItemDef.create("bg_p" + ".green", "bg_g"),
				MCItemDef.create("bg_p" + ".blue", "bg_b"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	public static MCContainerDef MA_MABGL0420_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0420", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_row_cd", "rpt_row_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("rpt_row_nm", "rpt_row_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("LclAll")
		);
	}
	
	static final MCOperationInfo MA_MABGL0420_Upd01_INFO = new MCOperationInfo("MA", "MABGL0420", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0420_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0420", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_row_cd", "rpt_row_cd"),
				MCItemDef.create("rpt_pre_word", "rpt_pre_word"),
				MCItemDef.create("rpt_row_nm", "rpt_row_nm"),
				MCItemDef.create("rpt_seq", "rpt_seq"),
				MCItemDef.create("sml_flg", "sml_flg"),
				MCItemDef.create("hdn_flg", "hdn_flg"),
				MCItemDef.create("rpt_tgt_typ", "rpt_tgt_typ"),
				MCItemDef.create("cost_io_typ", "cost_io_typ"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("std_flg", "std_flg"),
				MCItemDef.create("qty_unit_typ", "qty_unit_typ"),
				MCItemDef.create("alc_ac_grp_cd1", "alc_ac_grp_cd1"),
				MCItemDef.create("alc_ac_grp_cd2", "alc_ac_grp_cd2"),
				MCItemDef.create("alc_ac_grp_cd3", "alc_ac_grp_cd3"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("expns_typ", "expns_typ"),
				MCItemDef.create("direct_typ", "direct_typ"),
				MCItemDef.create("var_typ", "var_typ"),
				MCItemDef.create("expns_grp_cd", "expns_grp_cd"),
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("fg_p" + ".red", "fg_r"),
				MCItemDef.create("fg_p" + ".green", "fg_g"),
				MCItemDef.create("fg_p" + ".blue", "fg_b"),
				MCItemDef.create("bg_p" + ".red", "bg_r"),
				MCItemDef.create("bg_p" + ".green", "bg_g"),
				MCItemDef.create("bg_p" + ".blue", "bg_b"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MA_MABGL0420_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0420", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_row_cd", "rpt_row_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("rpt_row_nm", "rpt_row_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LclAll")
		);
	}
	
	static final MCOperationInfo MA_MABGL0420_Del01_INFO = new MCOperationInfo("MA", "MABGL0420", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0420_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0420", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rpt_ptn_cd", "rpt_ptn_cd"),
				MCItemDef.create("rpt_row_cd", "rpt_row_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

