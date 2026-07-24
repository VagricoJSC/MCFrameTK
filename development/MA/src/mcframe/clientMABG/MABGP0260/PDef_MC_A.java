package mcframe.clientMABG.MABGP0260;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABGP_CoefAutoReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABGL0260.Srch01.UP.BLOCK0")){
			return MA_MABGL0260_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0260.Srch01.DOWN.BLOCK0")){
			return MA_MABGL0260_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABGL0260.Upd01.UP.BLOCK0")){
			return MA_MABGL0260_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0260.Del01.UP.BLOCK0")){
			return MA_MABGL0260_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABGL0260_Srch01_INFO = new MCOperationInfo("MA", "MABGL0260", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0260_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0260", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("term_p" + ".term_fr", "term_fr"),
				MCItemDef.create("term_p" + ".term_to", "term_to"),
				MCItemDef.create("alc_coef_cd", "alc_coef_cd"),
				MCItemDef.create("alc_coef_nm", "alc_coef_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("itm_grp_nm", "itm_grp_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABGL0260_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0260", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("term_p" + ".term", "term"),
				MCItemDef.create("term_p" + ".term_nm", "term_nm"),
				MCItemDef.create("alc_coef_cd", "alc_coef_cd"),
				MCItemDef.create("alc_coef_nm", "alc_coef_nm"),
				MCItemDef.create("coef_config_typ", "coef_config_typ"),
				MCItemDef.create("coef_config_typ_nm", "coef_config_typ_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("qty_unit_typ", "qty_unit_typ"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_typ_nm", "itm_grp_typ_nm"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("itm_grp_nm", "itm_grp_nm"),
				MCItemDef.create("coef_val", "coef_val"),
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
	
	static final MCOperationInfo MA_MABGL0260_Upd01_INFO = new MCOperationInfo("MA", "MABGL0260", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0260_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0260", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("term_p" + ".term", "term"),
				MCItemDef.create("alc_coef_cd", "alc_coef_cd"),
				MCItemDef.create("coef_config_typ", "coef_config_typ"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("qty_unit_typ", "qty_unit_typ"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("coef_val", "coef_val"),
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
	
	static final MCOperationInfo MA_MABGL0260_Del01_INFO = new MCOperationInfo("MA", "MABGL0260", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0260_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0260", "Del01",
			new MCItemDef[]{
				MCItemDef.create("term_p" + ".term", "term"),
				MCItemDef.create("alc_coef_cd", "alc_coef_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_grp_typ", "itm_grp_typ"),
				MCItemDef.create("itm_grp_cd", "itm_grp_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

