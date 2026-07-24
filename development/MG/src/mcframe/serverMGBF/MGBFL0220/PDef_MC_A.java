package mcframe.serverMGBF.MGBFL0220;

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
 * [MGBFL_IoSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBFL0220.Srch01.UP.BLOCK0")){
			return MG_MGBFL0220_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0220.Srch01.DOWN.BLOCK0")){
			return MG_MGBFL0220_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0220.Srch01.DOWN.BLOCK1")){
			return MG_MGBFL0220_Srch01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBFL0220_Srch01_INFO = new MCOperationInfo("MG", "MGBFL0220", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBFL0220_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0220", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
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
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_mng_flg", "asst_mng_flg"),
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
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("ym_flg", "ym_flg"),
				MCItemDef.create("dpt_flg", "dpt_flg"),
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
				MCItemDef.create("asst_flg", "asst_flg"),
				MCItemDef.create("qty_flg", "qty_flg"),
				MCItemDef.create("itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_flg10", "itm_grp_flg10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBFL0220_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0220", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
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
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("std_qty", "std_qty"),
				MCItemDef.create("ave_upri", "ave_upri"),
				MCItemDef.create("st_stk_qty", "st_stk_qty"),
				MCItemDef.create("st_stk_amt", "st_stk_amt"),
				MCItemDef.create("mfg_qty", "mfg_qty"),
				MCItemDef.create("mfg_amt", "mfg_amt"),
				MCItemDef.create("purc_qty", "purc_qty"),
				MCItemDef.create("purc_amt", "purc_amt"),
				MCItemDef.create("mfg_gr_qty", "mfg_gr_qty"),
				MCItemDef.create("mfg_gr_amt", "mfg_gr_amt"),
				MCItemDef.create("othr_gr_qty", "othr_gr_qty"),
				MCItemDef.create("othr_gr_amt", "othr_gr_amt"),
				MCItemDef.create("alc_amt", "alc_amt"),
				MCItemDef.create("inpt_qty", "inpt_qty"),
				MCItemDef.create("inpt_amt", "inpt_amt"),
				MCItemDef.create("plnt_gi_qty", "plnt_gi_qty"),
				MCItemDef.create("plnt_gi_amt", "plnt_gi_amt"),
				MCItemDef.create("othr_gi_qty", "othr_gi_qty"),
				MCItemDef.create("othr_gi_amt", "othr_gi_amt"),
				MCItemDef.create("prov_qty", "prov_qty"),
				MCItemDef.create("prov_amt", "prov_amt"),
				MCItemDef.create("sls_qty", "sls_qty"),
				MCItemDef.create("sls_amt", "sls_amt"),
				MCItemDef.create("end_stk_qty", "end_stk_qty"),
				MCItemDef.create("end_stk_amt", "end_stk_amt"),
				MCItemDef.create("diff_qty", "diff_qty"),
				MCItemDef.create("diff_amt", "diff_amt"),
				MCItemDef.create("xpns_inpt_qty", "xpns_inpt_qty"),
				MCItemDef.create("xpns_inpt_amt", "xpns_inpt_amt")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MG_MGBFL0220_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBFL0220", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_ym", "st_ym"),
				MCItemDef.create("end_ym", "end_ym")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	//FMCB DEF_CLASSES END
}

