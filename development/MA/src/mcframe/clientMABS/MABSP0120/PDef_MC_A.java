package mcframe.clientMABS.MABSP0120;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABSP_PurcUpriReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0120.Srch01.UP.BLOCK0")){
			return MA_MABSL0120_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0120.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0120_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0120.Sprt01.UP.BLOCK0")){
			return MA_MABSL0120_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0120.Sprt01.DOWN.BLOCK0")){
			return MA_MABSL0120_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0120.Upd01.UP.BLOCK0")){
			return MA_MABSL0120_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0120.Del01.UP.BLOCK0")){
			return MA_MABSL0120_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0120.Aprv_Srch01.UP.BLOCK0")){
			return MA_MABSL0120_Aprv_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0120.Aprv_Srch01.DOWN.BLOCK0")){
			return MA_MABSL0120_Aprv_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0120.Aprv_Upd01.UP.BLOCK0")){
			return MA_MABSL0120_Aprv_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0120.Aprv_Upd01.UP.BLOCK1")){
			return MA_MABSL0120_Aprv_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABSL0120.Aprv_Upd01.DOWN.BLOCK0")){
			return MA_MABSL0120_Aprv_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0120.Aprv_Del01.UP.BLOCK0")){
			return MA_MABSL0120_Aprv_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MA_MABSL0120_Srch01_INFO = new MCOperationInfo("MA", "MABSL0120", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0120_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("dt" + ".st_dt_fr", "st_dt_fr"),
				MCItemDef.create("dt" + ".st_dt_to", "st_dt_to"),
				MCItemDef.create("dt" + ".end_dt_fr", "end_dt_fr"),
				MCItemDef.create("dt" + ".end_dt_to", "end_dt_to"),
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
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("off_interim_flg", "off_interim_flg"),
				MCItemDef.create("on_interim_flg", "on_interim_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("sppl_cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("sppl_foreign_flg", "sppl_foreign_flg"),
				MCItemDef.create("sppl_area_cd", "sppl_area_cd"),
				MCItemDef.create("sppl_area_nm", "sppl_area_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
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
				MCItemDef.create("sppl_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10"),
				MCItemDef.create("maker_grp_cd1", "maker_grp_cd1"),
				MCItemDef.create("maker_grp_nm1", "maker_grp_nm1"),
				MCItemDef.create("maker_grp_cd2", "maker_grp_cd2"),
				MCItemDef.create("maker_grp_nm2", "maker_grp_nm2"),
				MCItemDef.create("maker_grp_cd3", "maker_grp_cd3"),
				MCItemDef.create("maker_grp_nm3", "maker_grp_nm3"),
				MCItemDef.create("maker_grp_cd4", "maker_grp_cd4"),
				MCItemDef.create("maker_grp_nm4", "maker_grp_nm4"),
				MCItemDef.create("maker_grp_cd5", "maker_grp_cd5"),
				MCItemDef.create("maker_grp_nm5", "maker_grp_nm5"),
				MCItemDef.create("maker_grp_cd6", "maker_grp_cd6"),
				MCItemDef.create("maker_grp_nm6", "maker_grp_nm6"),
				MCItemDef.create("maker_grp_cd7", "maker_grp_cd7"),
				MCItemDef.create("maker_grp_nm7", "maker_grp_nm7"),
				MCItemDef.create("maker_grp_cd8", "maker_grp_cd8"),
				MCItemDef.create("maker_grp_nm8", "maker_grp_nm8"),
				MCItemDef.create("maker_grp_cd9", "maker_grp_cd9"),
				MCItemDef.create("maker_grp_nm9", "maker_grp_nm9"),
				MCItemDef.create("maker_grp_cd10", "maker_grp_cd10"),
				MCItemDef.create("maker_grp_nm10", "maker_grp_nm10"),
				MCItemDef.create("dlv_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("apl_dt_fr", "apl_dt_fr"),
				MCItemDef.create("apl_dt_to", "apl_dt_to"),
				MCItemDef.create("apl_usr_cd", "apl_usr_cd"),
				MCItemDef.create("apl_usr_nm", "apl_usr_nm"),
				MCItemDef.create("apl_dpt_cd", "apl_dpt_cd"),
				MCItemDef.create("apl_dpt_nm", "apl_dpt_nm")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0120_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0120", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("qty_p" + ".qty", "lot_qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_nm", "purc_tax_nm"),
				MCItemDef.create("upri1_p" + ".upri", "upri"),
				MCItemDef.create("upri2_p" + ".upri", "upri_bf"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("upri3_p" + ".upri", "sub_upri1"),
				MCItemDef.create("upri4_p" + ".upri", "sub_upri2"),
				MCItemDef.create("upri5_p" + ".upri", "sub_upri3"),
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
	
	static final MCOperationInfo MA_MABSL0120_Sprt01_INFO = new MCOperationInfo("MA", "MABSL0120", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0120_Sprt01_UP_BLOCK0() {
		/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0120", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("qty_p" + ".qty", "lot_qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_nm", "purc_tax_nm"),
				MCItemDef.create("upri1_p" + ".upri", "upri"),
				MCItemDef.create("upri2_p" + ".upri", "upri_bf"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("upri3_p" + ".upri", "sub_upri1"),
				MCItemDef.create("upri4_p" + ".upri", "sub_upri2"),
				MCItemDef.create("upri5_p" + ".upri", "sub_upri3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	public static MCContainerDef MA_MABSL0120_Sprt01_DOWN_BLOCK0() {
	/** Ope.のBlock [Sprt01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0120", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("qty_p" + ".qty", "lot_qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_nm", "purc_tax_nm"),
				MCItemDef.create("upri1_p" + ".upri", "upri"),
				MCItemDef.create("upri2_p" + ".upri", "upri_bf"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("upri3_p" + ".upri", "sub_upri1"),
				MCItemDef.create("upri4_p" + ".upri", "sub_upri2"),
				MCItemDef.create("upri5_p" + ".upri", "sub_upri3"),
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
	
	static final MCOperationInfo MA_MABSL0120_Upd01_INFO = new MCOperationInfo("MA", "MABSL0120", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0120_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0120", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("qty_p" + ".qty", "lot_qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("upri1_p" + ".upri", "upri"),
				MCItemDef.create("upri2_p" + ".upri", "upri_bf"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("upri3_p" + ".upri", "sub_upri1"),
				MCItemDef.create("upri4_p" + ".upri", "sub_upri2"),
				MCItemDef.create("upri5_p" + ".upri", "sub_upri3"),
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
	
	static final MCOperationInfo MA_MABSL0120_Del01_INFO = new MCOperationInfo("MA", "MABSL0120", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0120_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0120", "Del01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("qty_p" + ".qty", "lot_qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0120_Aprv_Srch01_INFO = new MCOperationInfo("MA", "MABSL0120", "Aprv_Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0120_Aprv_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Aprv_Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0120", "Aprv_Srch01",
			new MCItemDef[]{
				MCItemDef.create("cmn_flg", "cmn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("dt" + ".st_dt_fr", "st_dt_fr"),
				MCItemDef.create("dt" + ".st_dt_to", "st_dt_to"),
				MCItemDef.create("dt" + ".end_dt_fr", "end_dt_fr"),
				MCItemDef.create("dt" + ".end_dt_to", "end_dt_to"),
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
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("off_interim_flg", "off_interim_flg"),
				MCItemDef.create("on_interim_flg", "on_interim_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("sppl_cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("sppl_foreign_flg", "sppl_foreign_flg"),
				MCItemDef.create("sppl_area_cd", "sppl_area_cd"),
				MCItemDef.create("sppl_area_nm", "sppl_area_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
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
				MCItemDef.create("sppl_grp_cd1", "sppl_grp_cd1"),
				MCItemDef.create("sppl_grp_nm1", "sppl_grp_nm1"),
				MCItemDef.create("sppl_grp_cd2", "sppl_grp_cd2"),
				MCItemDef.create("sppl_grp_nm2", "sppl_grp_nm2"),
				MCItemDef.create("sppl_grp_cd3", "sppl_grp_cd3"),
				MCItemDef.create("sppl_grp_nm3", "sppl_grp_nm3"),
				MCItemDef.create("sppl_grp_cd4", "sppl_grp_cd4"),
				MCItemDef.create("sppl_grp_nm4", "sppl_grp_nm4"),
				MCItemDef.create("sppl_grp_cd5", "sppl_grp_cd5"),
				MCItemDef.create("sppl_grp_nm5", "sppl_grp_nm5"),
				MCItemDef.create("sppl_grp_cd6", "sppl_grp_cd6"),
				MCItemDef.create("sppl_grp_nm6", "sppl_grp_nm6"),
				MCItemDef.create("sppl_grp_cd7", "sppl_grp_cd7"),
				MCItemDef.create("sppl_grp_nm7", "sppl_grp_nm7"),
				MCItemDef.create("sppl_grp_cd8", "sppl_grp_cd8"),
				MCItemDef.create("sppl_grp_nm8", "sppl_grp_nm8"),
				MCItemDef.create("sppl_grp_cd9", "sppl_grp_cd9"),
				MCItemDef.create("sppl_grp_nm9", "sppl_grp_nm9"),
				MCItemDef.create("sppl_grp_cd10", "sppl_grp_cd10"),
				MCItemDef.create("sppl_grp_nm10", "sppl_grp_nm10"),
				MCItemDef.create("maker_grp_cd1", "maker_grp_cd1"),
				MCItemDef.create("maker_grp_nm1", "maker_grp_nm1"),
				MCItemDef.create("maker_grp_cd2", "maker_grp_cd2"),
				MCItemDef.create("maker_grp_nm2", "maker_grp_nm2"),
				MCItemDef.create("maker_grp_cd3", "maker_grp_cd3"),
				MCItemDef.create("maker_grp_nm3", "maker_grp_nm3"),
				MCItemDef.create("maker_grp_cd4", "maker_grp_cd4"),
				MCItemDef.create("maker_grp_nm4", "maker_grp_nm4"),
				MCItemDef.create("maker_grp_cd5", "maker_grp_cd5"),
				MCItemDef.create("maker_grp_nm5", "maker_grp_nm5"),
				MCItemDef.create("maker_grp_cd6", "maker_grp_cd6"),
				MCItemDef.create("maker_grp_nm6", "maker_grp_nm6"),
				MCItemDef.create("maker_grp_cd7", "maker_grp_cd7"),
				MCItemDef.create("maker_grp_nm7", "maker_grp_nm7"),
				MCItemDef.create("maker_grp_cd8", "maker_grp_cd8"),
				MCItemDef.create("maker_grp_nm8", "maker_grp_nm8"),
				MCItemDef.create("maker_grp_cd9", "maker_grp_cd9"),
				MCItemDef.create("maker_grp_nm9", "maker_grp_nm9"),
				MCItemDef.create("maker_grp_cd10", "maker_grp_cd10"),
				MCItemDef.create("maker_grp_nm10", "maker_grp_nm10"),
				MCItemDef.create("dlv_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("apl_dt_fr", "apl_dt_fr"),
				MCItemDef.create("apl_dt_to", "apl_dt_to"),
				MCItemDef.create("apl_usr_cd", "apl_usr_cd"),
				MCItemDef.create("apl_usr_nm", "apl_usr_nm"),
				MCItemDef.create("apl_dpt_cd", "apl_dpt_cd"),
				MCItemDef.create("apl_dpt_nm", "apl_dpt_nm")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0120_Aprv_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Aprv_Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0120", "Aprv_Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("qty_p" + ".qty", "lot_qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("upri_dec_place", "upri_dec_place"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_nm", "purc_tax_nm"),
				MCItemDef.create("upri1_p" + ".upri", "upri"),
				MCItemDef.create("upri2_p" + ".upri", "upri_bf"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("upri3_p" + ".upri", "sub_upri1"),
				MCItemDef.create("upri4_p" + ".upri", "sub_upri2"),
				MCItemDef.create("upri5_p" + ".upri", "sub_upri3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("st_dt_bf", "st_dt_bf"),
				MCItemDef.create("apl_dt", "apl_dt"),
				MCItemDef.create("apl_usr_cd", "apl_usr_cd"),
				MCItemDef.create("apl_usr_nm", "apl_usr_nm"),
				MCItemDef.create("apl_dpt_cd", "apl_dpt_cd"),
				MCItemDef.create("apl_dpt_nm", "apl_dpt_nm"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("aprv_sts_typ", "aprv_sts_typ"),
				MCItemDef.create("aprv_sts_typ_nm", "aprv_sts_typ_nm"),
				MCItemDef.create("ref_flg", "ref_flg"),
				MCItemDef.create("mst_apl_memo", "mst_apl_memo"),
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
	
	static final MCOperationInfo MA_MABSL0120_Aprv_Upd01_INFO = new MCOperationInfo("MA", "MABSL0120", "Aprv_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0120_Aprv_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Aprv_Upd01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0120", "Aprv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("qty_p" + ".qty", "lot_qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("upri1_p" + ".upri", "upri"),
				MCItemDef.create("upri2_p" + ".upri", "upri_bf"),
				MCItemDef.create("interim_flg", "interim_flg"),
				MCItemDef.create("not_cost_flg", "not_cost_flg"),
				MCItemDef.create("upri3_p" + ".upri", "sub_upri1"),
				MCItemDef.create("upri4_p" + ".upri", "sub_upri2"),
				MCItemDef.create("upri5_p" + ".upri", "sub_upri3"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("apl_dt", "apl_dt"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("mst_apl_memo", "mst_apl_memo"),
				MCItemDef.create("st_dt_bf", "st_dt_bf"),
				MCItemDef.create("ref_flg", "ref_flg"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}

	public static MCContainerDef MA_MABSL0120_Aprv_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Aprv_Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0120", "Aprv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("apl_dt", "apl_dt"),
				MCItemDef.create("usr_dpt_p" + ".usr_cd", "apl_usr_cd"),
				MCItemDef.create("usr_dpt_p" + ".dpt_cd", "apl_dpt_cd"),
				MCItemDef.create("mst_apl_memo", "mst_apl_memo")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}


	public static MCContainerDef MA_MABSL0120_Aprv_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Aprv_Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0120", "Aprv_Upd01",
			new MCItemDef[]{
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no")
			}
			,
			MCBlockDef.create("Dtl2")
		);
	}
	
	static final MCOperationInfo MA_MABSL0120_Aprv_Del01_INFO = new MCOperationInfo("MA", "MABSL0120", "Aprv_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0120_Aprv_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Aprv_Del01_Dtl] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL0120", "Aprv_Del01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("qty_p" + ".qty", "lot_qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("apl_no", "apl_no"),
				MCItemDef.create("aprv_no", "aprv_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

