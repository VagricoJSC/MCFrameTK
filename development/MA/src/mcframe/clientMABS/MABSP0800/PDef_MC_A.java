package mcframe.clientMABS.MABSP0800;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABSP_StkRplReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0800.Srch01.UP.BLOCK0")){
			return MA_MABSL0800_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0800.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0800_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0800.Sprt01.UP.BLOCK0")){
			return MA_MABSL0800_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0800.Sprt01.DOWN.BLOCK0")){
			return MA_MABSL0800_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0800.Upd01.UP.BLOCK0")){
			return MA_MABSL0800_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0800.Del01.UP.BLOCK0")){
			return MA_MABSL0800_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MA_MABSL0800_Srch01_INFO = new MCOperationInfo("MA", "MABSL0800", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0800_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0800", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dt_p" + ".st_dt_fr", "st_dt_fr"),
				MCItemDef.create("dt_p" + ".st_dt_to", "st_dt_to"),
				MCItemDef.create("dt_p" + ".end_dt_fr", "end_dt_fr"),
				MCItemDef.create("dt_p" + ".end_dt_to", "end_dt_to"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0800_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0800", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("Itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("Itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("Itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("Itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("Itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("qty1_p" + ".qty", "buf_qty"),
				MCItemDef.create("qty2_p" + ".qty", "rord_stk_qty"),
				MCItemDef.create("gi_schd_flg", "gi_schd_flg"),
				MCItemDef.create("qty3_p" + ".qty", "rord_rqst_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("lot_sizing_flg", "lot_sizing_flg"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("str_ln1_p" + ".str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("str_ln1_p" + ".str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("inpt_gi_loc_cd", "inpt_gi_loc_cd"),
				MCItemDef.create("inpt_gi_loc_nm", "inpt_gi_loc_nm"),
				MCItemDef.create("inpt_gi_str_ln_tgt_flg", "inpt_gi_str_ln_tgt_flg"),
				MCItemDef.create("str_ln2_p" + ".str_ln_cd", "inpt_gi_str_ln_cd"),
				MCItemDef.create("str_ln2_p" + ".str_ln_nm", "inpt_gi_str_ln_nm"),
				MCItemDef.create("ship_gi_loc_cd", "ship_gi_loc_cd"),
				MCItemDef.create("ship_gi_loc_nm", "ship_gi_loc_nm"),
				MCItemDef.create("ship_gi_str_ln_tgt_flg", "ship_gi_str_ln_tgt_flg"),
				MCItemDef.create("str_ln3_p" + ".str_ln_cd", "ship_gi_str_ln_cd"),
				MCItemDef.create("str_ln3_p" + ".str_ln_nm", "ship_gi_str_ln_nm"),
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
	
	static final MCOperationInfo MA_MABSL0800_Sprt01_INFO = new MCOperationInfo("MA", "MABSL0800", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0800_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0800", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("Itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("Itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("Itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("Itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("Itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("qty1_p" + ".qty", "buf_qty"),
				MCItemDef.create("qty2_p" + ".qty", "rord_stk_qty"),
				MCItemDef.create("gi_schd_flg", "gi_schd_flg"),
				MCItemDef.create("qty3_p" + ".qty", "rord_rqst_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("lot_sizing_flg", "lot_sizing_flg"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("str_ln1_p" + ".str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("str_ln1_p" + ".str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("inpt_gi_loc_cd", "inpt_gi_loc_cd"),
				MCItemDef.create("inpt_gi_loc_nm", "inpt_gi_loc_nm"),
				MCItemDef.create("inpt_gi_str_ln_tgt_flg", "inpt_gi_str_ln_tgt_flg"),
				MCItemDef.create("str_ln2_p" + ".str_ln_cd", "inpt_gi_str_ln_cd"),
				MCItemDef.create("str_ln2_p" + ".str_ln_nm", "inpt_gi_str_ln_nm"),
				MCItemDef.create("ship_gi_loc_cd", "ship_gi_loc_cd"),
				MCItemDef.create("ship_gi_loc_nm", "ship_gi_loc_nm"),
				MCItemDef.create("ship_gi_str_ln_tgt_flg", "ship_gi_str_ln_tgt_flg"),
				MCItemDef.create("str_ln3_p" + ".str_ln_cd", "ship_gi_str_ln_cd"),
				MCItemDef.create("str_ln3_p" + ".str_ln_nm", "ship_gi_str_ln_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MA_MABSL0800_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0800", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("Itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("Itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("Itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("Itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("Itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("qty1_p" + ".qty", "buf_qty"),
				MCItemDef.create("qty2_p" + ".qty", "rord_stk_qty"),
				MCItemDef.create("gi_schd_flg", "gi_schd_flg"),
				MCItemDef.create("qty3_p" + ".qty", "rord_rqst_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("lot_sizing_flg", "lot_sizing_flg"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gi_loc_nm", "gi_loc_nm"),
				MCItemDef.create("gi_str_ln_tgt_flg", "gi_str_ln_tgt_flg"),
				MCItemDef.create("str_ln1_p" + ".str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("str_ln1_p" + ".str_ln_nm", "gi_str_ln_nm"),
				MCItemDef.create("inpt_gi_loc_cd", "inpt_gi_loc_cd"),
				MCItemDef.create("inpt_gi_loc_nm", "inpt_gi_loc_nm"),
				MCItemDef.create("inpt_gi_str_ln_tgt_flg", "inpt_gi_str_ln_tgt_flg"),
				MCItemDef.create("str_ln2_p" + ".str_ln_cd", "inpt_gi_str_ln_cd"),
				MCItemDef.create("str_ln2_p" + ".str_ln_nm", "inpt_gi_str_ln_nm"),
				MCItemDef.create("ship_gi_loc_cd", "ship_gi_loc_cd"),
				MCItemDef.create("ship_gi_loc_nm", "ship_gi_loc_nm"),
				MCItemDef.create("ship_gi_str_ln_tgt_flg", "ship_gi_str_ln_tgt_flg"),
				MCItemDef.create("str_ln3_p" + ".str_ln_cd", "ship_gi_str_ln_cd"),
				MCItemDef.create("str_ln3_p" + ".str_ln_nm", "ship_gi_str_ln_nm"),
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
	
	static final MCOperationInfo MA_MABSL0800_Upd01_INFO = new MCOperationInfo("MA", "MABSL0800", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0800_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0800", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("Itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("Itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("Itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("Itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("qty1_p" + ".qty", "buf_qty"),
				MCItemDef.create("qty2_p" + ".qty", "rord_stk_qty"),
				MCItemDef.create("gi_schd_flg", "gi_schd_flg"),
				MCItemDef.create("qty3_p" + ".qty", "rord_rqst_qty"),
				MCItemDef.create("lot_sizing_flg", "lot_sizing_flg"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("str_ln1_p" + ".str_ln_cd", "gi_str_ln_cd"),
				MCItemDef.create("inpt_gi_loc_cd", "inpt_gi_loc_cd"),
				MCItemDef.create("str_ln2_p" + ".str_ln_cd", "inpt_gi_str_ln_cd"),
				MCItemDef.create("ship_gi_loc_cd", "ship_gi_loc_cd"),
				MCItemDef.create("str_ln3_p" + ".str_ln_cd", "ship_gi_str_ln_cd"),
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
	
	static final MCOperationInfo MA_MABSL0800_Del01_INFO = new MCOperationInfo("MA", "MABSL0800", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0800_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0800", "Del01",
			new MCItemDef[]{
				MCItemDef.create("Itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("Itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("Itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("Itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

