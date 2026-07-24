package mcframe.serverMGBD.MGBDL0100;

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
 * [MGBDL_ExpCalcSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBDL0100.Srch01.UP.BLOCK0")){
			return MG_MGBDL0100_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0100.Srch01.DOWN.BLOCK0")){
			return MG_MGBDL0100_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0100.Srch01.DOWN.BLOCK1")){
			return MG_MGBDL0100_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MG.MGBDL0100.Chk01.UP.BLOCK0")){
			return MG_MGBDL0100_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0100.Chk01.DOWN.BLOCK0")){
			return MG_MGBDL0100_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBDL0100.Ins01.UP.BLOCK0")){
			return MG_MGBDL0100_Ins01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MG_MGBDL0100_Srch01_INFO = new MCOperationInfo("MG", "MGBDL0100", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0100_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("no_loc_flg", "no_loc_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("no_sppl_flg", "no_sppl_flg"),
				MCItemDef.create("sppl_cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("sppl_area_cd", "sppl_area_cd"),
				MCItemDef.create("sppl_area_nm", "sppl_area_nm"),
				MCItemDef.create("alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("alc_dpt_nm", "alc_dpt_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
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
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("mng_dpt_flg", "mng_dpt_flg"),
				MCItemDef.create("itm_flg", "itm_flg"),
				MCItemDef.create("itm_typ_flg", "itm_typ_flg"),
				MCItemDef.create("itm_typ_d_flg", "itm_typ_d_flg"),
				MCItemDef.create("itm_jnl_flg", "itm_jnl_flg"),
				MCItemDef.create("lot_flg", "lot_flg"),
				MCItemDef.create("sublot_flg", "sublot_flg"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno4_flg", "sno4_flg"),
				MCItemDef.create("site_flg", "site_flg"),
				MCItemDef.create("loc_flg", "loc_flg"),
				MCItemDef.create("sppl_flg", "sppl_flg"),
				MCItemDef.create("sppl_cntry_flg", "sppl_cntry_flg"),
				MCItemDef.create("sppl_area_flg", "sppl_area_flg"),
				MCItemDef.create("alc_dpt_flg", "alc_dpt_flg"),
				MCItemDef.create("asst_flg", "asst_flg"),
				MCItemDef.create("itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("sppl_grp_flg1", "sppl_grp_flg1"),
				MCItemDef.create("sppl_grp_flg2", "sppl_grp_flg2"),
				MCItemDef.create("sppl_grp_flg3", "sppl_grp_flg3"),
				MCItemDef.create("sppl_grp_flg4", "sppl_grp_flg4"),
				MCItemDef.create("sppl_grp_flg5", "sppl_grp_flg5"),
				MCItemDef.create("sppl_grp_flg6", "sppl_grp_flg6"),
				MCItemDef.create("sppl_grp_flg7", "sppl_grp_flg7"),
				MCItemDef.create("sppl_grp_flg8", "sppl_grp_flg8"),
				MCItemDef.create("sppl_grp_flg9", "sppl_grp_flg9"),
				MCItemDef.create("sppl_grp_flg10", "sppl_grp_flg10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0100_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
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
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
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
				MCItemDef.create("sppl_cntry_cd", "sppl_cntry_cd"),
				MCItemDef.create("sppl_cntry_nm", "sppl_cntry_nm"),
				MCItemDef.create("sppl_area_cd", "sppl_area_cd"),
				MCItemDef.create("sppl_area_nm", "sppl_area_nm"),
				MCItemDef.create("alc_dpt_cd", "alc_dpt_cd"),
				MCItemDef.create("alc_dpt_nm", "alc_dpt_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("base_qty", "base_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("base_unit_nm", "base_unit_nm"),
				MCItemDef.create("base_unit_dec_place", "base_unit_dec_place"),
				MCItemDef.create("dim_qty", "dim_qty"),
				MCItemDef.create("dim_unit_cd", "dim_unit_cd"),
				MCItemDef.create("dim_unit_nm", "dim_unit_nm"),
				MCItemDef.create("dim_unit_dec_place", "dim_unit_dec_place"),
				MCItemDef.create("wt_qty", "wt_qty"),
				MCItemDef.create("wt_unit_cd", "wt_unit_cd"),
				MCItemDef.create("wt_unit_nm", "wt_unit_nm"),
				MCItemDef.create("wt_unit_dec_place", "wt_unit_dec_place"),
				MCItemDef.create("conts_qty", "conts_qty"),
				MCItemDef.create("conts_unit_cd", "conts_unit_cd"),
				MCItemDef.create("conts_unit_nm", "conts_unit_nm"),
				MCItemDef.create("conts_unit_dec_place", "conts_unit_dec_place"),
				MCItemDef.create("amt", "amt"),
				MCItemDef.create("bcur_cd", "bcur_cd"),
				MCItemDef.create("cur_nm", "cur_nm"),
				MCItemDef.create("amt_dec_place", "amt_dec_place")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MG_MGBDL0100_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBDL0100", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym")
			}
			,
			MCBlockDef.create("Srch01_Rslt2")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0100_Chk01_INFO = new MCOperationInfo("MG", "MGBDL0100", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0100_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0100", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("amt_flg", "amt_flg"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("purc_flg", "purc_flg")
			}
			,
			MCBlockDef.create("Chk01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBDL0100_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0100", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("amt_flg", "amt_flg"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("purc_flg", "purc_flg"),
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym")
			}
			,
			MCBlockDef.create("Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBDL0100_Ins01_INFO = new MCOperationInfo("MG", "MGBDL0100", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBDL0100_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBDL0100", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("amt_flg", "amt_flg"),
				MCItemDef.create("mfg_flg", "mfg_flg"),
				MCItemDef.create("purc_flg", "purc_flg")
			}
			,
			MCBlockDef.create("Ins01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

