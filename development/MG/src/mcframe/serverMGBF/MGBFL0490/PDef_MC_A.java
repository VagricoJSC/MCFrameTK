package mcframe.serverMGBF.MGBFL0490;

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
 * [MGBFL_MlyItmCostSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBFL0490.Srch01.UP.BLOCK0")){
			return MG_MGBFL0490_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0490.Srch01.DOWN.BLOCK0")){
			return MG_MGBFL0490_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0490.Srch01.DOWN.BLOCK1")){
			return MG_MGBFL0490_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MG.MGBFL0490.Srch01.DOWN.BLOCK2")){
			return MG_MGBFL0490_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MG.MGBFL0490.Srch01.DOWN.BLOCK3")){
			return MG_MGBFL0490_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MG.MGBFL0490.Srch01.DOWN.BLOCK4")){
			return MG_MGBFL0490_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MG.MGBFL0490.Srch01.DOWN.BLOCK5")){
			return MG_MGBFL0490_Srch01_DOWN_BLOCK5();
		}
		else if (id.equals("MG.MGBFL0490.Srch01.DOWN.BLOCK6")){
			return MG_MGBFL0490_Srch01_DOWN_BLOCK6();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBFL0490_Srch01_INFO = new MCOperationInfo("MG", "MGBFL0490", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBFL0490_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0490", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("pln_calc_grp_cd", "pln_calc_grp_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("inpt_oper_flg", "inpt_oper_flg"),
				MCItemDef.create("inpt_rsn_flg", "inpt_rsn_flg"),
				MCItemDef.create("wk_oper_flg", "wk_oper_flg"),
				MCItemDef.create("wk_rsn_flg", "wk_rsn_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("dpt_flg", "dpt_flg"),
				MCItemDef.create("loc_flg", "loc_flg"),
				MCItemDef.create("oper_flg", "oper_flg"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("ctg_flg", "ctg_flg"),
				MCItemDef.create("itm_flg", "itm_flg"),
				MCItemDef.create("lot_flg", "lot_flg"),
				MCItemDef.create("sublot_flg", "sublot_flg"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno4_flg", "sno4_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBFL0490_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBFL0490", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("act_cost", "act_cost")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	public static MCContainerDef MG_MGBFL0490_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBFL0490", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("dim", "dim"),
				MCItemDef.create("dim_unit_cd", "dim_unit_cd"),
				MCItemDef.create("dim_unit_nm", "dim_unit_nm"),
				MCItemDef.create("dim_dec_place", "dim_dec_place"),
				MCItemDef.create("wt", "wt"),
				MCItemDef.create("wt_unit_cd", "wt_unit_cd"),
				MCItemDef.create("wt_unit_nm", "wt_unit_nm"),
				MCItemDef.create("wt_dec_place", "wt_dec_place"),
				MCItemDef.create("conts", "conts"),
				MCItemDef.create("conts_unit_cd", "conts_unit_cd"),
				MCItemDef.create("conts_unit_nm", "conts_unit_nm"),
				MCItemDef.create("conts_dec_place", "conts_dec_place")
			}
			,
			MCBlockDef.create("Srch01_Qty")
		);
	}
	public static MCContainerDef MG_MGBFL0490_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MG", "MGBFL0490", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("pln_cost", "pln_cost"),
				MCItemDef.create("pln_qty", "pln_qty"),
				MCItemDef.create("pln_dim", "pln_dim"),
				MCItemDef.create("pln_wt", "pln_wt"),
				MCItemDef.create("pln_conts", "pln_conts")
			}
			,
			MCBlockDef.create("Srch01_Pln")
		);
	}
	public static MCContainerDef MG_MGBFL0490_Srch01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MG", "MGBFL0490", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
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
				MCItemDef.create("inpt_rsn_cd", "inpt_rsn_cd"),
				MCItemDef.create("inpt_rsn_nm", "inpt_rsn_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("act_cost", "act_cost"),
				MCItemDef.create("pln_qty", "pln_qty"),
				MCItemDef.create("pln_cost", "pln_cost")
			}
			,
			MCBlockDef.create("Srch01_Rslt2")
		);
	}
	public static MCContainerDef MG_MGBFL0490_Srch01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MG", "MGBFL0490", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("wk_cost_cd", "wk_cost_cd"),
				MCItemDef.create("wk_cost_nm", "wk_cost_nm"),
				MCItemDef.create("wk_rsn_cd", "wk_rsn_cd"),
				MCItemDef.create("wk_rsn_nm", "wk_rsn_nm"),
				MCItemDef.create("wk_cost_unit_nm", "wk_cost_unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("act_cost", "act_cost"),
				MCItemDef.create("pln_qty", "pln_qty"),
				MCItemDef.create("pln_cost", "pln_cost")
			}
			,
			MCBlockDef.create("Srch01_Rslt3")
		);
	}
	public static MCContainerDef MG_MGBFL0490_Srch01_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MG", "MGBFL0490", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("act_cost", "act_cost"),
				MCItemDef.create("pln_cost", "pln_cost")
			}
			,
			MCBlockDef.create("Srch01_Rslt4")
		);
	}
	public static MCContainerDef MG_MGBFL0490_Srch01_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MG", "MGBFL0490", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("dpt_cd", "dpt_cd"),
				MCItemDef.create("dpt_nm", "dpt_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("ctg_cd", "ctg_cd"),
				MCItemDef.create("ctg_nm", "ctg_nm"),
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
				MCItemDef.create("expns_cd", "expns_cd"),
				MCItemDef.create("expns_nm", "expns_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("act_cost", "act_cost"),
				MCItemDef.create("pln_cost", "pln_cost")
			}
			,
			MCBlockDef.create("Srch01_Rslt5")
		);
	}
	//FMCB DEF_CLASSES END
}

