package mcframe.clientMGBF.MGBFP0260;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MGBFP_CostIoSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBFL0260.Srch01.UP.BLOCK0")){
			return MG_MGBFL0260_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0260.Srch01.DOWN.BLOCK0")){
			return MG_MGBFL0260_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBFL0260.Srch01.DOWN.BLOCK1")){
			return MG_MGBFL0260_Srch01_DOWN_BLOCK1();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBFL0260_Srch01_INFO = new MCOperationInfo("MG", "MGBFL0260", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBFL0260_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBFL0260", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no_p" + ".calc_no", "calc_no"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("cost_io_id", "cost_io_id"),
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
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("itm_typ_p" + ".itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_p" + ".itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("no_bp_flg", "no_bp_flg"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("except_other_flg", "except_other_flg"),
				MCItemDef.create("wg_flg", "wg_flg"),
				MCItemDef.create("mng_dpt_flg", "mng_dpt_flg"),
				MCItemDef.create("lot_flg", "lot_flg"),
				MCItemDef.create("sublot_flg", "sublot_flg"),
				MCItemDef.create("sno1_flg", "sno1_flg"),
				MCItemDef.create("sno2_flg", "sno2_flg"),
				MCItemDef.create("sno3_flg", "sno3_flg"),
				MCItemDef.create("sno4_flg", "sno4_flg"),
				MCItemDef.create("bp_flg", "bp_flg"),
				MCItemDef.create("asst_typ_flg", "asst_typ_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MG_MGBFL0260_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBFL0260", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_no", "calc_no"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("qty01_p" + ".qty", "qty01"),
				MCItemDef.create("amt01", "amt01"),
				MCItemDef.create("std01", "std01"),
				MCItemDef.create("qty02_p" + ".qty", "qty02"),
				MCItemDef.create("amt02", "amt02"),
				MCItemDef.create("std02", "std02"),
				MCItemDef.create("qty03_p" + ".qty", "qty03"),
				MCItemDef.create("amt03", "amt03"),
				MCItemDef.create("std03", "std03"),
				MCItemDef.create("qty04_p" + ".qty", "qty04"),
				MCItemDef.create("amt04", "amt04"),
				MCItemDef.create("std04", "std04"),
				MCItemDef.create("qty05_p" + ".qty", "qty05"),
				MCItemDef.create("amt05", "amt05"),
				MCItemDef.create("std05", "std05"),
				MCItemDef.create("qty06_p" + ".qty", "qty06"),
				MCItemDef.create("amt06", "amt06"),
				MCItemDef.create("std06", "std06"),
				MCItemDef.create("qty07_p" + ".qty", "qty07"),
				MCItemDef.create("amt07", "amt07"),
				MCItemDef.create("std07", "std07"),
				MCItemDef.create("qty08_p" + ".qty", "qty08"),
				MCItemDef.create("amt08", "amt08"),
				MCItemDef.create("std08", "std08"),
				MCItemDef.create("qty09_p" + ".qty", "qty09"),
				MCItemDef.create("amt09", "amt09"),
				MCItemDef.create("std09", "std09"),
				MCItemDef.create("qty10_p" + ".qty", "qty10"),
				MCItemDef.create("amt10", "amt10"),
				MCItemDef.create("std10", "std10"),
				MCItemDef.create("qty11_p" + ".qty", "qty11"),
				MCItemDef.create("amt11", "amt11"),
				MCItemDef.create("std11", "std11"),
				MCItemDef.create("qty12_p" + ".qty", "qty12"),
				MCItemDef.create("amt12", "amt12"),
				MCItemDef.create("std12", "std12"),
				MCItemDef.create("qty13_p" + ".qty", "qty13"),
				MCItemDef.create("amt13", "amt13"),
				MCItemDef.create("std13", "std13"),
				MCItemDef.create("qty14_p" + ".qty", "qty14"),
				MCItemDef.create("amt14", "amt14"),
				MCItemDef.create("std14", "std14"),
				MCItemDef.create("qty15_p" + ".qty", "qty15"),
				MCItemDef.create("amt15", "amt15"),
				MCItemDef.create("std15", "std15"),
				MCItemDef.create("qty16_p" + ".qty", "qty16"),
				MCItemDef.create("amt16", "amt16"),
				MCItemDef.create("std16", "std16"),
				MCItemDef.create("qty17_p" + ".qty", "qty17"),
				MCItemDef.create("amt17", "amt17"),
				MCItemDef.create("std17", "std17"),
				MCItemDef.create("qty18_p" + ".qty", "qty18"),
				MCItemDef.create("amt18", "amt18"),
				MCItemDef.create("std18", "std18"),
				MCItemDef.create("qty19_p" + ".qty", "qty19"),
				MCItemDef.create("amt19", "amt19"),
				MCItemDef.create("std19", "std19"),
				MCItemDef.create("qty20_p" + ".qty", "qty20"),
				MCItemDef.create("amt20", "amt20"),
				MCItemDef.create("std20", "std20"),
				MCItemDef.create("qty21_p" + ".qty", "qty21"),
				MCItemDef.create("amt21", "amt21"),
				MCItemDef.create("std21", "std21"),
				MCItemDef.create("qty22_p" + ".qty", "qty22"),
				MCItemDef.create("amt22", "amt22"),
				MCItemDef.create("std22", "std22"),
				MCItemDef.create("qty23_p" + ".qty", "qty23"),
				MCItemDef.create("amt23", "amt23"),
				MCItemDef.create("std23", "std23"),
				MCItemDef.create("qty24_p" + ".qty", "qty24"),
				MCItemDef.create("amt24", "amt24"),
				MCItemDef.create("std24", "std24"),
				MCItemDef.create("qty25_p" + ".qty", "qty25"),
				MCItemDef.create("amt25", "amt25"),
				MCItemDef.create("std25", "std25"),
				MCItemDef.create("qty26_p" + ".qty", "qty26"),
				MCItemDef.create("amt26", "amt26"),
				MCItemDef.create("std26", "std26"),
				MCItemDef.create("qty27_p" + ".qty", "qty27"),
				MCItemDef.create("amt27", "amt27"),
				MCItemDef.create("std27", "std27"),
				MCItemDef.create("qty28_p" + ".qty", "qty28"),
				MCItemDef.create("amt28", "amt28"),
				MCItemDef.create("std28", "std28"),
				MCItemDef.create("qty29_p" + ".qty", "qty29"),
				MCItemDef.create("amt29", "amt29"),
				MCItemDef.create("std29", "std29"),
				MCItemDef.create("qty30_p" + ".qty", "qty30"),
				MCItemDef.create("amt30", "amt30"),
				MCItemDef.create("std30", "std30"),
				MCItemDef.create("diff_qty_p" + ".qty", "diff_qty"),
				MCItemDef.create("diff_amt", "diff_amt"),
				MCItemDef.create("diff_std", "diff_std"),
				MCItemDef.create("ave_tgt", "ave_tgt")
			}
			,
			MCBlockDef.create("Rslt")
		);
	}
	public static MCContainerDef MG_MGBFL0260_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Mstr] に対する電文項目定義 */
		return new MCGeneralContainerDef("MG", "MGBFL0260", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("io_col_cd", "io_col_cd"),
				MCItemDef.create("io_col_nm", "io_col_nm"),
				MCItemDef.create("io_seq", "io_seq"),
				MCItemDef.create("io_tgt_typ", "io_tgt_typ"),
				MCItemDef.create("unit_flg", "unit_flg"),
				MCItemDef.create("qty_flg", "qty_flg"),
				MCItemDef.create("amt_flg", "amt_flg"),
				MCItemDef.create("std_flg", "std_flg"),
				MCItemDef.create("diff_flg", "diff_flg"),
				MCItemDef.create("fg_r", "fg_r"),
				MCItemDef.create("fg_g", "fg_g"),
				MCItemDef.create("fg_b", "fg_b"),
				MCItemDef.create("bg_r", "bg_r"),
				MCItemDef.create("bg_g", "bg_g"),
				MCItemDef.create("bg_b", "bg_b"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd")
			}
			,
			MCBlockDef.create("Mstr")
		);
	}
	//FMCB DEF_CLASSES END
}

