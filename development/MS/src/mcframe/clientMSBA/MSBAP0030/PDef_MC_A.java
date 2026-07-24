package mcframe.clientMSBA.MSBAP0030;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MSBAP_DmndListReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBAL0030.Srch01.UP.BLOCK0")){
			return MS_MSBAL0030_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0030.Srch01.DOWN.BLOCK0")){
			return MS_MSBAL0030_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0030.Srch02.UP.BLOCK0")){
			return MS_MSBAL0030_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0030.Srch02.DOWN.BLOCK0")){
			return MS_MSBAL0030_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0030.Imp01.UP.BLOCK0")){
			return MS_MSBAL0030_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0030.Imp01.DOWN.BLOCK0")){
			return MS_MSBAL0030_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0030.Upd01.UP.BLOCK0")){
			return MS_MSBAL0030_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0030.Upd01.DOWN.BLOCK0")){
			return MS_MSBAL0030_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0030.Del01.UP.BLOCK0")){
			return MS_MSBAL0030_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0030.Del01.DOWN.BLOCK0")){
			return MS_MSBAL0030_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBAL0030.Upd02.UP.BLOCK0")){
			return MS_MSBAL0030_Upd02_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBAL0030_Srch01_INFO = new MCOperationInfo("MS", "MSBAL0030", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBAL0030_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("misc", "misc"),
				MCItemDef.create("othr", "othr"),
				MCItemDef.create("dmnd_dt_fr", "dmnd_dt_fr"),
				MCItemDef.create("dmnd_dt_to", "dmnd_dt_to"),
				MCItemDef.create("dmnd_period_typ", "dmnd_period_typ"),
				MCItemDef.create("dmnd_typ", "dmnd_typ"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dmnd_loc_cd", "dmnd_loc_cd"),
				MCItemDef.create("dmnd_loc_nm", "dmnd_loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("spln_vers", "spln_vers"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg1", "dlv_grp_flg1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg2", "dlv_grp_flg2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg3", "dlv_grp_flg3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg4", "dlv_grp_flg4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg5", "dlv_grp_flg5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg6", "dlv_grp_flg6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg7", "dlv_grp_flg7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg8", "dlv_grp_flg8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg9", "dlv_grp_flg9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg10", "dlv_grp_flg10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg1", "cst_grp_flg1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg2", "cst_grp_flg2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg3", "cst_grp_flg3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg4", "cst_grp_flg4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg5", "cst_grp_flg5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg6", "cst_grp_flg6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg7", "cst_grp_flg7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg8", "cst_grp_flg8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg9", "cst_grp_flg9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg10", "cst_grp_flg10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm10", "cst_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBAL0030_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dly_div_flg", "dly_div_flg"),
				MCItemDef.create("dmnd_no", "dmnd_no"),
				MCItemDef.create("dmnd_dt", "dmnd_dt"),
				MCItemDef.create("dmnd_st_dt", "dmnd_st_dt"),
				MCItemDef.create("dmnd_end_dt", "dmnd_end_dt"),
				MCItemDef.create("dlv_schd_st_dt", "dlv_schd_st_dt"),
				MCItemDef.create("dlv_schd_end_dt", "dlv_schd_end_dt"),
				MCItemDef.create("dmnd_period_typ", "dmnd_period_typ"),
				MCItemDef.create("dmnd_period_typ_nm", "dmnd_period_typ_nm"),
				MCItemDef.create("dmnd_typ", "dmnd_typ"),
				MCItemDef.create("dmnd_typ_nm", "dmnd_typ_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("input_qty_p" + ".qty", "input_qty"),
				MCItemDef.create("dmnd_qty_p" + ".qty", "dmnd_qty"),
				MCItemDef.create("rec_qty_p" + ".qty", "rec_qty"),
				MCItemDef.create("dmnd_loc_cd", "dmnd_loc_cd"),
				MCItemDef.create("dmnd_loc_nm", "dmnd_loc_nm"),
				MCItemDef.create("dmnd_loc_grp_cd", "dmnd_loc_grp_cd"),
				MCItemDef.create("dmnd_loc_grp_nm", "dmnd_loc_grp_nm"),
				MCItemDef.create("dmnd_lg_grp_cd", "dmnd_lg_grp_cd"),
				MCItemDef.create("dmnd_lg_grp_nm", "dmnd_lg_grp_nm"),
				MCItemDef.create("dmnd_wg_cd", "dmnd_wg_cd"),
				MCItemDef.create("dmnd_wg_nm", "dmnd_wg_nm"),
				MCItemDef.create("dmnd_site_cd", "dmnd_site_cd"),
				MCItemDef.create("dmnd_site_nm", "dmnd_site_nm"),
				MCItemDef.create("to_lg_grp_cd", "to_lg_grp_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("bp_ship_lt", "bp_ship_lt"),
				MCItemDef.create("xfr_lt", "xfr_lt"),
				MCItemDef.create("non_dmnd_lt_flg", "non_dmnd_lt_flg"),
				MCItemDef.create("ship_lt", "ship_lt"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".dpt_cd", "dmnd_dpt_cd"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".dpt_nm", "dmnd_dpt_nm"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".usr_cd", "dmnd_usr_cd"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".usr_nm", "dmnd_usr_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("spln_vers", "spln_vers"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm10", "cst_grp_nm10"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("dmnd_upd_cntr", "dmnd_upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBAL0030_Srch02_INFO = new MCOperationInfo("MS", "MSBAL0030", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBAL0030_Srch02_UP_BLOCK0() {
		/** Ope.のBlock [Srch02_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0030", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("misc", "misc"),
				MCItemDef.create("othr", "othr"),
				MCItemDef.create("dmnd_dt_fr", "dmnd_dt_fr"),
				MCItemDef.create("dmnd_dt_to", "dmnd_dt_to"),
				MCItemDef.create("dmnd_period_typ", "dmnd_period_typ"),
				MCItemDef.create("dmnd_typ", "dmnd_typ"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dmnd_loc_cd", "dmnd_loc_cd"),
				MCItemDef.create("dmnd_loc_nm", "dmnd_loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sno_p" + ".sno1", "sno1"),
				MCItemDef.create("sno_p" + ".sno2", "sno2"),
				MCItemDef.create("sno_p" + ".sno3", "sno3"),
				MCItemDef.create("sno_p" + ".sno4", "sno4"),
				MCItemDef.create("sno_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("usr_nm", "usr_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("spln_vers", "spln_vers"),
				MCItemDef.create("spln_itm_cd", "spln_itm_cd"),
				MCItemDef.create("spln_itm_nm", "spln_itm_nm"),
				MCItemDef.create("cst_frcst_no", "cst_frcst_no"),
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("slo_d_no", "slo_d_no"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_p" + ".itm_grp_nm10", "itm_grp_nm10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg1", "dlv_grp_flg1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg2", "dlv_grp_flg2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg3", "dlv_grp_flg3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg4", "dlv_grp_flg4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg5", "dlv_grp_flg5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg6", "dlv_grp_flg6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg7", "dlv_grp_flg7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg8", "dlv_grp_flg8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg9", "dlv_grp_flg9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_flg10", "dlv_grp_flg10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_p" + ".bp_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg1", "cst_grp_flg1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg2", "cst_grp_flg2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg3", "cst_grp_flg3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg4", "cst_grp_flg4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg5", "cst_grp_flg5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg6", "cst_grp_flg6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg7", "cst_grp_flg7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg8", "cst_grp_flg8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg9", "cst_grp_flg9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_flg10", "cst_grp_flg10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_p" + ".bp_grp_nm10", "cst_grp_nm10")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MS_MSBAL0030_Srch02_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0030", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".dpt_cd", "dmnd_dpt_cd"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".dpt_nm", "dmnd_dpt_nm"),
				MCItemDef.create("dmnd_date_div_mons", "dmnd_date_div_mons"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBAL0030_Imp01_INFO = new MCOperationInfo("MS", "MSBAL0030", "Imp01", "000000", new PDef());

	public static MCContainerDef MS_MSBAL0030_Imp01_UP_BLOCK0() {
		/** Ope.のBlock [Imp01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0030", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dmnd_no", "dmnd_no"),
				MCItemDef.create("dmnd_dt", "dmnd_dt"),
				MCItemDef.create("dmnd_st_dt", "dmnd_st_dt"),
				MCItemDef.create("dmnd_period_typ", "dmnd_period_typ"),
				MCItemDef.create("dmnd_typ", "dmnd_typ"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("input_qty_p" + ".qty", "input_qty"),
				MCItemDef.create("dmnd_qty_p" + ".qty", "dmnd_qty"),
				MCItemDef.create("rec_qty_p" + ".qty", "rec_qty"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".usr_cd", "dmnd_usr_cd"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".dpt_cd", "dmnd_dpt_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dmnd_loc_cd", "dmnd_loc_cd"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MS_MSBAL0030_Imp01_DOWN_BLOCK0() {
	/** Ope.のBlock [Imp01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0030", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dmnd_no", "dmnd_no"),
				MCItemDef.create("dmnd_dt", "dmnd_dt"),
				MCItemDef.create("dmnd_st_dt", "dmnd_st_dt"),
				MCItemDef.create("dmnd_end_dt", "dmnd_end_dt"),
				MCItemDef.create("dlv_schd_st_dt", "dlv_schd_st_dt"),
				MCItemDef.create("dlv_schd_end_dt", "dlv_schd_end_dt"),
				MCItemDef.create("dmnd_period_typ", "dmnd_period_typ"),
				MCItemDef.create("dmnd_period_typ_nm", "dmnd_period_typ_nm"),
				MCItemDef.create("dmnd_typ", "dmnd_typ"),
				MCItemDef.create("dmnd_typ_nm", "dmnd_typ_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("input_qty_p" + ".qty", "input_qty"),
				MCItemDef.create("dmnd_qty_p" + ".qty", "dmnd_qty"),
				MCItemDef.create("rec_qty_p" + ".qty", "rec_qty"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".usr_cd", "dmnd_usr_cd"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".usr_nm", "dmnd_usr_nm"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".dpt_cd", "dmnd_dpt_cd"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".dpt_nm", "dmnd_dpt_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("dmnd_loc_cd", "dmnd_loc_cd"),
				MCItemDef.create("dmnd_loc_nm", "dmnd_loc_nm"),
				MCItemDef.create("dmnd_loc_grp_cd", "dmnd_loc_grp_cd"),
				MCItemDef.create("dmnd_loc_grp_nm", "dmnd_loc_grp_nm"),
				MCItemDef.create("dmnd_lg_grp_cd", "dmnd_lg_grp_cd"),
				MCItemDef.create("dmnd_lg_grp_nm", "dmnd_lg_grp_nm"),
				MCItemDef.create("dmnd_wg_cd", "dmnd_wg_cd"),
				MCItemDef.create("dmnd_wg_nm", "dmnd_wg_nm"),
				MCItemDef.create("dmnd_site_cd", "dmnd_site_cd"),
				MCItemDef.create("dmnd_site_nm", "dmnd_site_nm"),
				MCItemDef.create("to_lg_grp_cd", "to_lg_grp_cd"),
				MCItemDef.create("ship_term_cd", "ship_term_cd"),
				MCItemDef.create("bp_ship_lt", "bp_ship_lt"),
				MCItemDef.create("xfr_lt", "xfr_lt"),
				MCItemDef.create("non_dmnd_lt_flg", "non_dmnd_lt_flg"),
				MCItemDef.create("ship_lt", "ship_lt"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_no", "wrk_no"),
				MCItemDef.create("sno_wrk_no_p" + ".wrk_nm", "wrk_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dmnd_upd_cntr", "dmnd_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBAL0030_Upd01_INFO = new MCOperationInfo("MS", "MSBAL0030", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBAL0030_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dmnd_no", "dmnd_no"),
				MCItemDef.create("dmnd_dt", "dmnd_dt"),
				MCItemDef.create("dmnd_st_dt", "dmnd_st_dt"),
				MCItemDef.create("dmnd_period_typ", "dmnd_period_typ"),
				MCItemDef.create("dmnd_typ", "dmnd_typ"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("input_qty_p" + ".qty", "input_qty"),
				MCItemDef.create("dmnd_qty_p" + ".qty", "dmnd_qty"),
				MCItemDef.create("rec_qty_p" + ".qty", "rec_qty"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".usr_cd", "dmnd_usr_cd"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".dpt_cd", "dmnd_dpt_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("dmnd_loc_cd", "dmnd_loc_cd"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "", "sno1"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "", "sno2"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "", "sno3"),
				MCItemDef.create("sno_wrk_no_p" + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "", "sno4"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("dmnd_upd_cntr", "dmnd_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MS_MSBAL0030_Upd01_DOWN_BLOCK0() {
	/** Ope.のBlock [Upd01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dmnd_no", "dmnd_no"),
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBAL0030_Del01_INFO = new MCOperationInfo("MS", "MSBAL0030", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBAL0030_Del01_UP_BLOCK0() {
		/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dmnd_no", "dmnd_no"),
				MCItemDef.create("dmnd_upd_cntr", "dmnd_upd_cntr")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	public static MCContainerDef MS_MSBAL0030_Del01_DOWN_BLOCK0() {
	/** Ope.のBlock [Del01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rts_msg_p" + ".rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBAL0030_Upd02_INFO = new MCOperationInfo("MS", "MSBAL0030", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBAL0030_Upd02_UP_BLOCK0() {
		/** Ope.のBlock [Upd02_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MS", "MSBAL0030", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("dly_div_flg", "dly_div_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dmnd_usr_dpt_p" + ".dpt_cd", "dmnd_dpt_cd"),
				MCItemDef.create("dmnd_date_div_mons", "dmnd_date_div_mons")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}


	//FMCB DEF_CLASSES END
}

