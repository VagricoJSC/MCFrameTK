package mcframe.serverMABG.MABGL0630;

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
 * [MABGL_XpnsPurcAlcReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABGL0630.XpnsPurcAlc_UpdChk01.UP.BLOCK0")){
			return MA_MABGL0630_XpnsPurcAlc_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0630.XpnsPurcAlc_Upd01.UP.BLOCK0")){
			return MA_MABGL0630_XpnsPurcAlc_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0630.XpnsPurcAlc_DelChk01.UP.BLOCK0")){
			return MA_MABGL0630_XpnsPurcAlc_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0630.XpnsPurcAlc_Del01.UP.BLOCK0")){
			return MA_MABGL0630_XpnsPurcAlc_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0630.Srch01.UP.BLOCK0")){
			return MA_MABGL0630_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0630.Srch01.DOWN.BLOCK0")){
			return MA_MABGL0630_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABGL0630.Sprt01.UP.BLOCK0")){
			return MA_MABGL0630_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0630.Sprt01.DOWN.BLOCK0")){
			return MA_MABGL0630_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABGL0630.Upd01.UP.BLOCK0")){
			return MA_MABGL0630_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0630.Del01.UP.BLOCK0")){
			return MA_MABGL0630_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MA_MABGL0630_XpnsPurcAlc_UpdChk01_INFO = new MCOperationInfo("MA", "MABGL0630", "XpnsPurcAlc_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0630_XpnsPurcAlc_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0630", "XpnsPurcAlc_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("xpns_itm_cd", "xpns_itm_cd"),
				MCItemDef.create("xpns_itm_sub1", "xpns_itm_sub1"),
				MCItemDef.create("xpns_itm_sub2", "xpns_itm_sub2"),
				MCItemDef.create("xpns_itm_sub3", "xpns_itm_sub3"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_wg_cd", "alc_wg_cd"),
				MCItemDef.create("dpt_flg", "dpt_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("lot_no_flg", "lot_no_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no_flg", "sublot_no_flg"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_flg", "sno4_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("po_no_flg", "po_no_flg"),
				MCItemDef.create("slo_no_flg", "slo_no_flg"),
				MCItemDef.create("iv_no_flg", "iv_no_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("XpnsPurcAlc_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0630_XpnsPurcAlc_Upd01_INFO = new MCOperationInfo("MA", "MABGL0630", "XpnsPurcAlc_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0630_XpnsPurcAlc_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0630", "XpnsPurcAlc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("xpns_itm_cd", "xpns_itm_cd"),
				MCItemDef.create("xpns_itm_sub1", "xpns_itm_sub1"),
				MCItemDef.create("xpns_itm_sub2", "xpns_itm_sub2"),
				MCItemDef.create("xpns_itm_sub3", "xpns_itm_sub3"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_wg_cd", "alc_wg_cd"),
				MCItemDef.create("dpt_flg", "dpt_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("lot_no_flg", "lot_no_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no_flg", "sublot_no_flg"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_flg", "sno4_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("po_no_flg", "po_no_flg"),
				MCItemDef.create("slo_no_flg", "slo_no_flg"),
				MCItemDef.create("iv_no_flg", "iv_no_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("XpnsPurcAlc_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0630_XpnsPurcAlc_DelChk01_INFO = new MCOperationInfo("MA", "MABGL0630", "XpnsPurcAlc_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0630_XpnsPurcAlc_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0630", "XpnsPurcAlc_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("xpns_itm_cd", "xpns_itm_cd"),
				MCItemDef.create("xpns_itm_sub1", "xpns_itm_sub1"),
				MCItemDef.create("xpns_itm_sub2", "xpns_itm_sub2"),
				MCItemDef.create("xpns_itm_sub3", "xpns_itm_sub3"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("XpnsPurcAlc_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0630_XpnsPurcAlc_Del01_INFO = new MCOperationInfo("MA", "MABGL0630", "XpnsPurcAlc_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0630_XpnsPurcAlc_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0630", "XpnsPurcAlc_Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("xpns_itm_cd", "xpns_itm_cd"),
				MCItemDef.create("xpns_itm_sub1", "xpns_itm_sub1"),
				MCItemDef.create("xpns_itm_sub2", "xpns_itm_sub2"),
				MCItemDef.create("xpns_itm_sub3", "xpns_itm_sub3"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("XpnsPurcAlc_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0630_Srch01_INFO = new MCOperationInfo("MA", "MABGL0630", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0630_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0630", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("xpns_itm_cd", "xpns_itm_cd"),
				MCItemDef.create("xpns_itm_sub1", "xpns_itm_sub1"),
				MCItemDef.create("xpns_itm_sub2", "xpns_itm_sub2"),
				MCItemDef.create("xpns_itm_sub3", "xpns_itm_sub3"),
				MCItemDef.create("xpns_itm_nm", "xpns_itm_nm"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
				MCItemDef.create("alc_ac_grp_cd1", "alc_ac_grp_cd1"),
				MCItemDef.create("alc_ac_grp_cd2", "alc_ac_grp_cd2"),
				MCItemDef.create("alc_ac_grp_cd3", "alc_ac_grp_cd3"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABGL0630_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0630", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("xpns_itm_cd", "xpns_itm_cd"),
				MCItemDef.create("xpns_itm_sub1", "xpns_itm_sub1"),
				MCItemDef.create("xpns_itm_sub2", "xpns_itm_sub2"),
				MCItemDef.create("xpns_itm_sub3", "xpns_itm_sub3"),
				MCItemDef.create("xpns_itm_nm", "xpns_itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
				MCItemDef.create("alc_wg_cd", "alc_wg_cd"),
				MCItemDef.create("alc_wg_nm", "alc_wg_nm"),
				MCItemDef.create("dpt_flg", "dpt_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("lot_no_flg", "lot_no_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no_flg", "sublot_no_flg"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_flg", "sno4_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("po_no_flg", "po_no_flg"),
				MCItemDef.create("slo_no_flg", "slo_no_flg"),
				MCItemDef.create("iv_no_flg", "iv_no_flg"),
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
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	
	static final MCOperationInfo MA_MABGL0630_Sprt01_INFO = new MCOperationInfo("MA", "MABGL0630", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0630_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0630", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("xpns_itm_cd", "xpns_itm_cd"),
				MCItemDef.create("xpns_itm_sub1", "xpns_itm_sub1"),
				MCItemDef.create("xpns_itm_sub2", "xpns_itm_sub2"),
				MCItemDef.create("xpns_itm_sub3", "xpns_itm_sub3"),
				MCItemDef.create("xpns_itm_nm", "xpns_itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
				MCItemDef.create("alc_wg_cd", "alc_wg_cd"),
				MCItemDef.create("alc_wg_nm", "alc_wg_nm"),
				MCItemDef.create("dpt_flg", "dpt_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("lot_no_flg", "lot_no_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no_flg", "sublot_no_flg"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_flg", "sno4_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("po_no_flg", "po_no_flg"),
				MCItemDef.create("slo_no_flg", "slo_no_flg"),
				MCItemDef.create("iv_no_flg", "iv_no_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MA_MABGL0630_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0630", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("xpns_itm_cd", "xpns_itm_cd"),
				MCItemDef.create("xpns_itm_sub1", "xpns_itm_sub1"),
				MCItemDef.create("xpns_itm_sub2", "xpns_itm_sub2"),
				MCItemDef.create("xpns_itm_sub3", "xpns_itm_sub3"),
				MCItemDef.create("xpns_itm_nm", "xpns_itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("ac_rsn_nm", "ac_rsn_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
				MCItemDef.create("alc_wg_cd", "alc_wg_cd"),
				MCItemDef.create("alc_wg_nm", "alc_wg_nm"),
				MCItemDef.create("dpt_flg", "dpt_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("lot_no_flg", "lot_no_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no_flg", "sublot_no_flg"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_flg", "sno4_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("po_no_flg", "po_no_flg"),
				MCItemDef.create("slo_no_flg", "slo_no_flg"),
				MCItemDef.create("iv_no_flg", "iv_no_flg"),
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
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABGL0630_Upd01_INFO = new MCOperationInfo("MA", "MABGL0630", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0630_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0630", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("xpns_itm_cd", "xpns_itm_cd"),
				MCItemDef.create("xpns_itm_sub1", "xpns_itm_sub1"),
				MCItemDef.create("xpns_itm_sub2", "xpns_itm_sub2"),
				MCItemDef.create("xpns_itm_sub3", "xpns_itm_sub3"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_wg_cd", "alc_wg_cd"),
				MCItemDef.create("dpt_flg", "dpt_flg"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("lot_no_flg", "lot_no_flg"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no_flg", "sublot_no_flg"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4_flg", "sno4_flg"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("po_no_flg", "po_no_flg"),
				MCItemDef.create("slo_no_flg", "slo_no_flg"),
				MCItemDef.create("iv_no_flg", "iv_no_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}
	
	static final MCOperationInfo MA_MABGL0630_Del01_INFO = new MCOperationInfo("MA", "MABGL0630", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0630_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABGL0630", "Del01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("xpns_itm_cd", "xpns_itm_cd"),
				MCItemDef.create("xpns_itm_sub1", "xpns_itm_sub1"),
				MCItemDef.create("xpns_itm_sub2", "xpns_itm_sub2"),
				MCItemDef.create("xpns_itm_sub3", "xpns_itm_sub3"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

