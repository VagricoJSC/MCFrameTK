package mcframe.clientMABG.MABGP0500;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABGP_PreAlcPtnReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABGL0500.Srch01.UP.BLOCK0")){
			return MA_MABGL0500_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0500.Srch01.DOWN.BLOCK0")){
			return MA_MABGL0500_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABGL0500.Srch01.DOWN.BLOCK1")){
			return MA_MABGL0500_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABGL0500.Upd01.UP.BLOCK0")){
			return MA_MABGL0500_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABGL0500.Upd01.UP.BLOCK1")){
			return MA_MABGL0500_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABGL0500.Del01.UP.BLOCK0")){
			return MA_MABGL0500_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MA_MABGL0500_Srch01_INFO = new MCOperationInfo("MA", "MABGL0500", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0500_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0500", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pre_alc_ptn_cd", "pre_alc_ptn_cd"),
				MCItemDef.create("pre_alc_ptn_nm", "pre_alc_ptn_nm_lcl"),
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


	public static MCContainerDef MA_MABGL0500_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0500", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("pre_alc_ptn_cd", "pre_alc_ptn_cd"),
				MCItemDef.create("pre_alc_ptn_nm_lcl", "pre_alc_ptn_nm_lcl"),
				MCItemDef.create("pre_alc_ptn_nm", "pre_alc_ptn_nm"),
				MCItemDef.create("dpt_alc_typ", "dpt_alc_typ"),
				MCItemDef.create("dpt_alc_typ_nm", "dpt_alc_typ_nm"),
				MCItemDef.create("loc_alc_typ", "loc_alc_typ"),
				MCItemDef.create("loc_alc_typ_nm", "loc_alc_typ_nm"),
				MCItemDef.create("oper_alc_typ", "oper_alc_typ"),
				MCItemDef.create("oper_alc_typ_nm", "oper_alc_typ_nm"),
				MCItemDef.create("bp_alc_typ", "bp_alc_typ"),
				MCItemDef.create("bp_alc_typ_nm", "bp_alc_typ_nm"),
				MCItemDef.create("ctg_alc_typ", "ctg_alc_typ"),
				MCItemDef.create("ctg_alc_typ_nm", "ctg_alc_typ_nm"),
				MCItemDef.create("itm_alc_typ", "itm_alc_typ"),
				MCItemDef.create("itm_alc_typ_nm", "itm_alc_typ_nm"),
				MCItemDef.create("lot_alc_typ", "lot_alc_typ"),
				MCItemDef.create("lot_alc_typ_nm", "lot_alc_typ_nm"),
				MCItemDef.create("sublot_alc_typ", "sublot_alc_typ"),
				MCItemDef.create("sublot_alc_typ_nm", "sublot_alc_typ_nm"),
				MCItemDef.create("sno1_alc_typ", "sno1_alc_typ"),
				MCItemDef.create("sno1_alc_typ_nm", "sno1_alc_typ_nm"),
				MCItemDef.create("sno2_alc_typ", "sno2_alc_typ"),
				MCItemDef.create("sno2_alc_typ_nm", "sno2_alc_typ_nm"),
				MCItemDef.create("sno3_alc_typ", "sno3_alc_typ"),
				MCItemDef.create("sno3_alc_typ_nm", "sno3_alc_typ_nm"),
				MCItemDef.create("sno4_alc_typ", "sno4_alc_typ"),
				MCItemDef.create("sno4_alc_typ_nm", "sno4_alc_typ_nm"),
				MCItemDef.create("inst_alc_typ", "inst_alc_typ"),
				MCItemDef.create("inst_alc_typ_nm", "inst_alc_typ_nm"),
				MCItemDef.create("iv_alc_typ", "iv_alc_typ"),
				MCItemDef.create("iv_alc_typ_nm", "iv_alc_typ_nm"),
				MCItemDef.create("po_alc_typ", "po_alc_typ"),
				MCItemDef.create("po_alc_typ_nm", "po_alc_typ_nm"),
				MCItemDef.create("slo_alc_typ", "slo_alc_typ"),
				MCItemDef.create("slo_alc_typ_nm", "slo_alc_typ_nm"),
				MCItemDef.create("alc_ac_alc_typ", "alc_ac_alc_typ"),
				MCItemDef.create("alc_ac_alc_typ_nm", "alc_ac_alc_typ_nm"),
				MCItemDef.create("wg_alc_typ", "wg_alc_typ"),
				MCItemDef.create("wg_alc_typ_nm", "wg_alc_typ_nm"),
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
	public static MCContainerDef MA_MABGL0500_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0500", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pre_alc_ptn_cd", "pre_alc_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("pre_alc_ptn_nm", "pre_alc_ptn_nm"),
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
	
	static final MCOperationInfo MA_MABGL0500_Upd01_INFO = new MCOperationInfo("MA", "MABGL0500", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0500_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0500", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pre_alc_ptn_cd", "pre_alc_ptn_cd"),
				MCItemDef.create("pre_alc_ptn_nm", "pre_alc_ptn_nm"),
				MCItemDef.create("dpt_alc_typ", "dpt_alc_typ"),
				MCItemDef.create("loc_alc_typ", "loc_alc_typ"),
				MCItemDef.create("oper_alc_typ", "oper_alc_typ"),
				MCItemDef.create("bp_alc_typ", "bp_alc_typ"),
				MCItemDef.create("ctg_alc_typ", "ctg_alc_typ"),
				MCItemDef.create("itm_alc_typ", "itm_alc_typ"),
				MCItemDef.create("lot_alc_typ", "lot_alc_typ"),
				MCItemDef.create("sublot_alc_typ", "sublot_alc_typ"),
				MCItemDef.create("sno1_alc_typ", "sno1_alc_typ"),
				MCItemDef.create("sno2_alc_typ", "sno2_alc_typ"),
				MCItemDef.create("sno3_alc_typ", "sno3_alc_typ"),
				MCItemDef.create("sno4_alc_typ", "sno4_alc_typ"),
				MCItemDef.create("inst_alc_typ", "inst_alc_typ"),
				MCItemDef.create("iv_alc_typ", "iv_alc_typ"),
				MCItemDef.create("po_alc_typ", "po_alc_typ"),
				MCItemDef.create("slo_alc_typ", "slo_alc_typ"),
				MCItemDef.create("alc_ac_alc_typ", "alc_ac_alc_typ"),
				MCItemDef.create("wg_alc_typ", "wg_alc_typ"),
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

	public static MCContainerDef MA_MABGL0500_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0500", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("pre_alc_ptn_cd", "pre_alc_ptn_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("pre_alc_ptn_nm", "pre_alc_ptn_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LclAll")
		);
	}
	
	static final MCOperationInfo MA_MABGL0500_Del01_INFO = new MCOperationInfo("MA", "MABGL0500", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABGL0500_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABGL0500", "Del01",
			new MCItemDef[]{
				MCItemDef.create("pre_alc_ptn_cd", "pre_alc_ptn_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

