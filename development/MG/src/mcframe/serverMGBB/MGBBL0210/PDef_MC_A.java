package mcframe.serverMGBB.MGBBL0210;

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
 * [MGBBL_StStkReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBBL0210.Srch01.UP.BLOCK0")){
			return MG_MGBBL0210_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Srch01.DOWN.BLOCK0")){
			return MG_MGBBL0210_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Chk01.UP.BLOCK0")){
			return MG_MGBBL0210_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Chk01.UP.BLOCK1")){
			return MG_MGBBL0210_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MG.MGBBL0210.Chk01.DOWN.BLOCK0")){
			return MG_MGBBL0210_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Chk02.UP.BLOCK0")){
			return MG_MGBBL0210_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Chk02.DOWN.BLOCK0")){
			return MG_MGBBL0210_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Chk03.UP.BLOCK0")){
			return MG_MGBBL0210_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Chk03.DOWN.BLOCK0")){
			return MG_MGBBL0210_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Chk04.UP.BLOCK0")){
			return MG_MGBBL0210_Chk04_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Chk05.UP.BLOCK0")){
			return MG_MGBBL0210_Chk05_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Imp01.UP.BLOCK0")){
			return MG_MGBBL0210_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Imp01.DOWN.BLOCK0")){
			return MG_MGBBL0210_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Upd01.UP.BLOCK0")){
			return MG_MGBBL0210_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Upd01.DOWN.BLOCK0")){
			return MG_MGBBL0210_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Del01.UP.BLOCK0")){
			return MG_MGBBL0210_Del01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Del01.DOWN.BLOCK0")){
			return MG_MGBBL0210_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Del02.UP.BLOCK0")){
			return MG_MGBBL0210_Del02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Upd02.UP.BLOCK0")){
			return MG_MGBBL0210_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBBL0210.Upd03.UP.BLOCK0")){
			return MG_MGBBL0210_Upd03_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
												
	
	static final MCOperationInfo MG_MGBBL0210_Srch01_INFO = new MCOperationInfo("MG", "MGBBL0210", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0210_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
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
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("no_bp_flg", "no_bp_flg"),
				MCItemDef.create("bp_cntry_cd", "bp_cntry_cd"),
				MCItemDef.create("bp_cntry_nm", "bp_cntry_nm"),
				MCItemDef.create("bp_area_cd", "bp_area_cd"),
				MCItemDef.create("bp_area_nm", "bp_area_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("except_oth_flg", "except_oth_flg"),
				MCItemDef.create("eval_typ", "eval_typ"),
				MCItemDef.create("std_bf_flg", "std_bf_flg"),
				MCItemDef.create("std_af_flg", "std_af_flg"),
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
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_nm10", "bp_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL0210_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_stk_key", "st_stk_key"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("std_flg", "std_flg"),
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("gr_dt", "gr_dt"),
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
				MCItemDef.create("lot_no", "lot_no"),
				MCItemDef.create("sublot_no", "sublot_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("ttl", "ttl"),
				MCItemDef.create("col_000", "col_000"),
				MCItemDef.create("col_001", "col_001"),
				MCItemDef.create("col_002", "col_002"),
				MCItemDef.create("col_003", "col_003"),
				MCItemDef.create("col_004", "col_004"),
				MCItemDef.create("col_005", "col_005"),
				MCItemDef.create("col_006", "col_006"),
				MCItemDef.create("col_007", "col_007"),
				MCItemDef.create("col_008", "col_008"),
				MCItemDef.create("col_009", "col_009"),
				MCItemDef.create("col_010", "col_010"),
				MCItemDef.create("col_011", "col_011"),
				MCItemDef.create("col_012", "col_012"),
				MCItemDef.create("col_013", "col_013"),
				MCItemDef.create("col_014", "col_014"),
				MCItemDef.create("col_015", "col_015"),
				MCItemDef.create("col_016", "col_016"),
				MCItemDef.create("col_017", "col_017"),
				MCItemDef.create("col_018", "col_018"),
				MCItemDef.create("col_019", "col_019"),
				MCItemDef.create("col_020", "col_020"),
				MCItemDef.create("col_021", "col_021"),
				MCItemDef.create("col_022", "col_022"),
				MCItemDef.create("col_023", "col_023"),
				MCItemDef.create("col_024", "col_024"),
				MCItemDef.create("col_025", "col_025"),
				MCItemDef.create("col_026", "col_026"),
				MCItemDef.create("col_027", "col_027"),
				MCItemDef.create("col_028", "col_028"),
				MCItemDef.create("col_029", "col_029"),
				MCItemDef.create("col_030", "col_030"),
				MCItemDef.create("col_031", "col_031"),
				MCItemDef.create("col_032", "col_032"),
				MCItemDef.create("col_033", "col_033"),
				MCItemDef.create("col_034", "col_034"),
				MCItemDef.create("col_035", "col_035"),
				MCItemDef.create("col_036", "col_036"),
				MCItemDef.create("col_037", "col_037"),
				MCItemDef.create("col_038", "col_038"),
				MCItemDef.create("col_039", "col_039"),
				MCItemDef.create("col_040", "col_040"),
				MCItemDef.create("col_041", "col_041"),
				MCItemDef.create("col_042", "col_042"),
				MCItemDef.create("col_043", "col_043"),
				MCItemDef.create("col_044", "col_044"),
				MCItemDef.create("col_045", "col_045"),
				MCItemDef.create("col_046", "col_046"),
				MCItemDef.create("col_047", "col_047"),
				MCItemDef.create("col_048", "col_048"),
				MCItemDef.create("col_049", "col_049"),
				MCItemDef.create("col_050", "col_050"),
				MCItemDef.create("col_051", "col_051"),
				MCItemDef.create("col_052", "col_052"),
				MCItemDef.create("col_053", "col_053"),
				MCItemDef.create("col_054", "col_054"),
				MCItemDef.create("col_055", "col_055"),
				MCItemDef.create("col_056", "col_056"),
				MCItemDef.create("col_057", "col_057"),
				MCItemDef.create("col_058", "col_058"),
				MCItemDef.create("col_059", "col_059"),
				MCItemDef.create("col_060", "col_060"),
				MCItemDef.create("col_061", "col_061"),
				MCItemDef.create("col_062", "col_062"),
				MCItemDef.create("col_063", "col_063"),
				MCItemDef.create("col_064", "col_064"),
				MCItemDef.create("col_065", "col_065"),
				MCItemDef.create("col_066", "col_066"),
				MCItemDef.create("col_067", "col_067"),
				MCItemDef.create("col_068", "col_068"),
				MCItemDef.create("col_069", "col_069"),
				MCItemDef.create("col_070", "col_070"),
				MCItemDef.create("col_071", "col_071"),
				MCItemDef.create("col_072", "col_072"),
				MCItemDef.create("col_073", "col_073"),
				MCItemDef.create("col_074", "col_074"),
				MCItemDef.create("col_075", "col_075"),
				MCItemDef.create("col_076", "col_076"),
				MCItemDef.create("col_077", "col_077"),
				MCItemDef.create("col_078", "col_078"),
				MCItemDef.create("col_079", "col_079"),
				MCItemDef.create("col_080", "col_080"),
				MCItemDef.create("col_081", "col_081"),
				MCItemDef.create("col_082", "col_082"),
				MCItemDef.create("col_083", "col_083"),
				MCItemDef.create("col_084", "col_084"),
				MCItemDef.create("col_085", "col_085"),
				MCItemDef.create("col_086", "col_086"),
				MCItemDef.create("col_087", "col_087"),
				MCItemDef.create("col_088", "col_088"),
				MCItemDef.create("col_089", "col_089"),
				MCItemDef.create("col_090", "col_090"),
				MCItemDef.create("col_091", "col_091"),
				MCItemDef.create("col_092", "col_092"),
				MCItemDef.create("col_093", "col_093"),
				MCItemDef.create("col_094", "col_094"),
				MCItemDef.create("col_095", "col_095"),
				MCItemDef.create("col_096", "col_096"),
				MCItemDef.create("col_097", "col_097"),
				MCItemDef.create("col_098", "col_098"),
				MCItemDef.create("col_099", "col_099")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0210_Chk01_INFO = new MCOperationInfo("MG", "MGBBL0210", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0210_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".st_stk_key", "st_stk_key"),
				MCItemDef.create("dbc" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".gr_dt", "gr_dt"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".bp_cd", "bp_cd"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".std_flg", "std_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("col_000", "col_000"),
				MCItemDef.create("col_001", "col_001"),
				MCItemDef.create("col_002", "col_002"),
				MCItemDef.create("col_003", "col_003"),
				MCItemDef.create("col_004", "col_004"),
				MCItemDef.create("col_005", "col_005"),
				MCItemDef.create("col_006", "col_006"),
				MCItemDef.create("col_007", "col_007"),
				MCItemDef.create("col_008", "col_008"),
				MCItemDef.create("col_009", "col_009"),
				MCItemDef.create("col_010", "col_010"),
				MCItemDef.create("col_011", "col_011"),
				MCItemDef.create("col_012", "col_012"),
				MCItemDef.create("col_013", "col_013"),
				MCItemDef.create("col_014", "col_014"),
				MCItemDef.create("col_015", "col_015"),
				MCItemDef.create("col_016", "col_016"),
				MCItemDef.create("col_017", "col_017"),
				MCItemDef.create("col_018", "col_018"),
				MCItemDef.create("col_019", "col_019"),
				MCItemDef.create("col_020", "col_020"),
				MCItemDef.create("col_021", "col_021"),
				MCItemDef.create("col_022", "col_022"),
				MCItemDef.create("col_023", "col_023"),
				MCItemDef.create("col_024", "col_024"),
				MCItemDef.create("col_025", "col_025"),
				MCItemDef.create("col_026", "col_026"),
				MCItemDef.create("col_027", "col_027"),
				MCItemDef.create("col_028", "col_028"),
				MCItemDef.create("col_029", "col_029"),
				MCItemDef.create("col_030", "col_030"),
				MCItemDef.create("col_031", "col_031"),
				MCItemDef.create("col_032", "col_032"),
				MCItemDef.create("col_033", "col_033"),
				MCItemDef.create("col_034", "col_034"),
				MCItemDef.create("col_035", "col_035"),
				MCItemDef.create("col_036", "col_036"),
				MCItemDef.create("col_037", "col_037"),
				MCItemDef.create("col_038", "col_038"),
				MCItemDef.create("col_039", "col_039"),
				MCItemDef.create("col_040", "col_040"),
				MCItemDef.create("col_041", "col_041"),
				MCItemDef.create("col_042", "col_042"),
				MCItemDef.create("col_043", "col_043"),
				MCItemDef.create("col_044", "col_044"),
				MCItemDef.create("col_045", "col_045"),
				MCItemDef.create("col_046", "col_046"),
				MCItemDef.create("col_047", "col_047"),
				MCItemDef.create("col_048", "col_048"),
				MCItemDef.create("col_049", "col_049"),
				MCItemDef.create("col_050", "col_050"),
				MCItemDef.create("col_051", "col_051"),
				MCItemDef.create("col_052", "col_052"),
				MCItemDef.create("col_053", "col_053"),
				MCItemDef.create("col_054", "col_054"),
				MCItemDef.create("col_055", "col_055"),
				MCItemDef.create("col_056", "col_056"),
				MCItemDef.create("col_057", "col_057"),
				MCItemDef.create("col_058", "col_058"),
				MCItemDef.create("col_059", "col_059"),
				MCItemDef.create("col_060", "col_060"),
				MCItemDef.create("col_061", "col_061"),
				MCItemDef.create("col_062", "col_062"),
				MCItemDef.create("col_063", "col_063"),
				MCItemDef.create("col_064", "col_064"),
				MCItemDef.create("col_065", "col_065"),
				MCItemDef.create("col_066", "col_066"),
				MCItemDef.create("col_067", "col_067"),
				MCItemDef.create("col_068", "col_068"),
				MCItemDef.create("col_069", "col_069"),
				MCItemDef.create("col_070", "col_070"),
				MCItemDef.create("col_071", "col_071"),
				MCItemDef.create("col_072", "col_072"),
				MCItemDef.create("col_073", "col_073"),
				MCItemDef.create("col_074", "col_074"),
				MCItemDef.create("col_075", "col_075"),
				MCItemDef.create("col_076", "col_076"),
				MCItemDef.create("col_077", "col_077"),
				MCItemDef.create("col_078", "col_078"),
				MCItemDef.create("col_079", "col_079"),
				MCItemDef.create("col_080", "col_080"),
				MCItemDef.create("col_081", "col_081"),
				MCItemDef.create("col_082", "col_082"),
				MCItemDef.create("col_083", "col_083"),
				MCItemDef.create("col_084", "col_084"),
				MCItemDef.create("col_085", "col_085"),
				MCItemDef.create("col_086", "col_086"),
				MCItemDef.create("col_087", "col_087"),
				MCItemDef.create("col_088", "col_088"),
				MCItemDef.create("col_089", "col_089"),
				MCItemDef.create("col_090", "col_090"),
				MCItemDef.create("col_091", "col_091"),
				MCItemDef.create("col_092", "col_092"),
				MCItemDef.create("col_093", "col_093"),
				MCItemDef.create("col_094", "col_094"),
				MCItemDef.create("col_095", "col_095"),
				MCItemDef.create("col_096", "col_096"),
				MCItemDef.create("col_097", "col_097"),
				MCItemDef.create("col_098", "col_098"),
				MCItemDef.create("col_099", "col_099")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}

	public static MCContainerDef MG_MGBBL0210_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg")
			}
			,
			MCBlockDef.create("Chk01_Crtl")
		);
	}


	public static MCContainerDef MG_MGBBL0210_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".st_stk_key", "st_stk_key"),
				MCItemDef.create("dbc" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".gr_dt", "gr_dt"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".bp_cd", "bp_cd"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".std_flg", "std_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("ttl", "ttl"),
				MCItemDef.create("col_000", "col_000"),
				MCItemDef.create("col_001", "col_001"),
				MCItemDef.create("col_002", "col_002"),
				MCItemDef.create("col_003", "col_003"),
				MCItemDef.create("col_004", "col_004"),
				MCItemDef.create("col_005", "col_005"),
				MCItemDef.create("col_006", "col_006"),
				MCItemDef.create("col_007", "col_007"),
				MCItemDef.create("col_008", "col_008"),
				MCItemDef.create("col_009", "col_009"),
				MCItemDef.create("col_010", "col_010"),
				MCItemDef.create("col_011", "col_011"),
				MCItemDef.create("col_012", "col_012"),
				MCItemDef.create("col_013", "col_013"),
				MCItemDef.create("col_014", "col_014"),
				MCItemDef.create("col_015", "col_015"),
				MCItemDef.create("col_016", "col_016"),
				MCItemDef.create("col_017", "col_017"),
				MCItemDef.create("col_018", "col_018"),
				MCItemDef.create("col_019", "col_019"),
				MCItemDef.create("col_020", "col_020"),
				MCItemDef.create("col_021", "col_021"),
				MCItemDef.create("col_022", "col_022"),
				MCItemDef.create("col_023", "col_023"),
				MCItemDef.create("col_024", "col_024"),
				MCItemDef.create("col_025", "col_025"),
				MCItemDef.create("col_026", "col_026"),
				MCItemDef.create("col_027", "col_027"),
				MCItemDef.create("col_028", "col_028"),
				MCItemDef.create("col_029", "col_029"),
				MCItemDef.create("col_030", "col_030"),
				MCItemDef.create("col_031", "col_031"),
				MCItemDef.create("col_032", "col_032"),
				MCItemDef.create("col_033", "col_033"),
				MCItemDef.create("col_034", "col_034"),
				MCItemDef.create("col_035", "col_035"),
				MCItemDef.create("col_036", "col_036"),
				MCItemDef.create("col_037", "col_037"),
				MCItemDef.create("col_038", "col_038"),
				MCItemDef.create("col_039", "col_039"),
				MCItemDef.create("col_040", "col_040"),
				MCItemDef.create("col_041", "col_041"),
				MCItemDef.create("col_042", "col_042"),
				MCItemDef.create("col_043", "col_043"),
				MCItemDef.create("col_044", "col_044"),
				MCItemDef.create("col_045", "col_045"),
				MCItemDef.create("col_046", "col_046"),
				MCItemDef.create("col_047", "col_047"),
				MCItemDef.create("col_048", "col_048"),
				MCItemDef.create("col_049", "col_049"),
				MCItemDef.create("col_050", "col_050"),
				MCItemDef.create("col_051", "col_051"),
				MCItemDef.create("col_052", "col_052"),
				MCItemDef.create("col_053", "col_053"),
				MCItemDef.create("col_054", "col_054"),
				MCItemDef.create("col_055", "col_055"),
				MCItemDef.create("col_056", "col_056"),
				MCItemDef.create("col_057", "col_057"),
				MCItemDef.create("col_058", "col_058"),
				MCItemDef.create("col_059", "col_059"),
				MCItemDef.create("col_060", "col_060"),
				MCItemDef.create("col_061", "col_061"),
				MCItemDef.create("col_062", "col_062"),
				MCItemDef.create("col_063", "col_063"),
				MCItemDef.create("col_064", "col_064"),
				MCItemDef.create("col_065", "col_065"),
				MCItemDef.create("col_066", "col_066"),
				MCItemDef.create("col_067", "col_067"),
				MCItemDef.create("col_068", "col_068"),
				MCItemDef.create("col_069", "col_069"),
				MCItemDef.create("col_070", "col_070"),
				MCItemDef.create("col_071", "col_071"),
				MCItemDef.create("col_072", "col_072"),
				MCItemDef.create("col_073", "col_073"),
				MCItemDef.create("col_074", "col_074"),
				MCItemDef.create("col_075", "col_075"),
				MCItemDef.create("col_076", "col_076"),
				MCItemDef.create("col_077", "col_077"),
				MCItemDef.create("col_078", "col_078"),
				MCItemDef.create("col_079", "col_079"),
				MCItemDef.create("col_080", "col_080"),
				MCItemDef.create("col_081", "col_081"),
				MCItemDef.create("col_082", "col_082"),
				MCItemDef.create("col_083", "col_083"),
				MCItemDef.create("col_084", "col_084"),
				MCItemDef.create("col_085", "col_085"),
				MCItemDef.create("col_086", "col_086"),
				MCItemDef.create("col_087", "col_087"),
				MCItemDef.create("col_088", "col_088"),
				MCItemDef.create("col_089", "col_089"),
				MCItemDef.create("col_090", "col_090"),
				MCItemDef.create("col_091", "col_091"),
				MCItemDef.create("col_092", "col_092"),
				MCItemDef.create("col_093", "col_093"),
				MCItemDef.create("col_094", "col_094"),
				MCItemDef.create("col_095", "col_095"),
				MCItemDef.create("col_096", "col_096"),
				MCItemDef.create("col_097", "col_097"),
				MCItemDef.create("col_098", "col_098"),
				MCItemDef.create("col_099", "col_099")
			}
			,
			MCBlockDef.create("Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0210_Chk02_INFO = new MCOperationInfo("MG", "MGBBL0210", "Chk02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0210_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("dbc" + ".st_stk_key", "st_stk_key"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0210_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".st_stk_key", "st_stk_key"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0210_Chk03_INFO = new MCOperationInfo("MG", "MGBBL0210", "Chk03", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0210_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}


	public static MCContainerDef MG_MGBBL0210_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0210_Chk04_INFO = new MCOperationInfo("MG", "MGBBL0210", "Chk04", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0210_Chk04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Chk04",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".st_stk_key", "st_stk_key"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("Chk04_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0210_Chk05_INFO = new MCOperationInfo("MG", "MGBBL0210", "Chk05", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0210_Chk05_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Chk05",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("std_bf_flg", "std_bf_flg"),
				MCItemDef.create("std_af_flg", "std_af_flg")
			}
			,
			MCBlockDef.create("Chk05_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0210_Imp01_INFO = new MCOperationInfo("MG", "MGBBL0210", "Imp01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0210_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".st_stk_key", "st_stk_key"),
				MCItemDef.create("dbc" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".gr_dt", "gr_dt"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".bp_cd", "bp_cd"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("col_000", "col_000"),
				MCItemDef.create("col_001", "col_001"),
				MCItemDef.create("col_002", "col_002"),
				MCItemDef.create("col_003", "col_003"),
				MCItemDef.create("col_004", "col_004"),
				MCItemDef.create("col_005", "col_005"),
				MCItemDef.create("col_006", "col_006"),
				MCItemDef.create("col_007", "col_007"),
				MCItemDef.create("col_008", "col_008"),
				MCItemDef.create("col_009", "col_009"),
				MCItemDef.create("col_010", "col_010"),
				MCItemDef.create("col_011", "col_011"),
				MCItemDef.create("col_012", "col_012"),
				MCItemDef.create("col_013", "col_013"),
				MCItemDef.create("col_014", "col_014"),
				MCItemDef.create("col_015", "col_015"),
				MCItemDef.create("col_016", "col_016"),
				MCItemDef.create("col_017", "col_017"),
				MCItemDef.create("col_018", "col_018"),
				MCItemDef.create("col_019", "col_019"),
				MCItemDef.create("col_020", "col_020"),
				MCItemDef.create("col_021", "col_021"),
				MCItemDef.create("col_022", "col_022"),
				MCItemDef.create("col_023", "col_023"),
				MCItemDef.create("col_024", "col_024"),
				MCItemDef.create("col_025", "col_025"),
				MCItemDef.create("col_026", "col_026"),
				MCItemDef.create("col_027", "col_027"),
				MCItemDef.create("col_028", "col_028"),
				MCItemDef.create("col_029", "col_029"),
				MCItemDef.create("col_030", "col_030"),
				MCItemDef.create("col_031", "col_031"),
				MCItemDef.create("col_032", "col_032"),
				MCItemDef.create("col_033", "col_033"),
				MCItemDef.create("col_034", "col_034"),
				MCItemDef.create("col_035", "col_035"),
				MCItemDef.create("col_036", "col_036"),
				MCItemDef.create("col_037", "col_037"),
				MCItemDef.create("col_038", "col_038"),
				MCItemDef.create("col_039", "col_039"),
				MCItemDef.create("col_040", "col_040"),
				MCItemDef.create("col_041", "col_041"),
				MCItemDef.create("col_042", "col_042"),
				MCItemDef.create("col_043", "col_043"),
				MCItemDef.create("col_044", "col_044"),
				MCItemDef.create("col_045", "col_045"),
				MCItemDef.create("col_046", "col_046"),
				MCItemDef.create("col_047", "col_047"),
				MCItemDef.create("col_048", "col_048"),
				MCItemDef.create("col_049", "col_049"),
				MCItemDef.create("col_050", "col_050"),
				MCItemDef.create("col_051", "col_051"),
				MCItemDef.create("col_052", "col_052"),
				MCItemDef.create("col_053", "col_053"),
				MCItemDef.create("col_054", "col_054"),
				MCItemDef.create("col_055", "col_055"),
				MCItemDef.create("col_056", "col_056"),
				MCItemDef.create("col_057", "col_057"),
				MCItemDef.create("col_058", "col_058"),
				MCItemDef.create("col_059", "col_059"),
				MCItemDef.create("col_060", "col_060"),
				MCItemDef.create("col_061", "col_061"),
				MCItemDef.create("col_062", "col_062"),
				MCItemDef.create("col_063", "col_063"),
				MCItemDef.create("col_064", "col_064"),
				MCItemDef.create("col_065", "col_065"),
				MCItemDef.create("col_066", "col_066"),
				MCItemDef.create("col_067", "col_067"),
				MCItemDef.create("col_068", "col_068"),
				MCItemDef.create("col_069", "col_069"),
				MCItemDef.create("col_070", "col_070"),
				MCItemDef.create("col_071", "col_071"),
				MCItemDef.create("col_072", "col_072"),
				MCItemDef.create("col_073", "col_073"),
				MCItemDef.create("col_074", "col_074"),
				MCItemDef.create("col_075", "col_075"),
				MCItemDef.create("col_076", "col_076"),
				MCItemDef.create("col_077", "col_077"),
				MCItemDef.create("col_078", "col_078"),
				MCItemDef.create("col_079", "col_079"),
				MCItemDef.create("col_080", "col_080"),
				MCItemDef.create("col_081", "col_081"),
				MCItemDef.create("col_082", "col_082"),
				MCItemDef.create("col_083", "col_083"),
				MCItemDef.create("col_084", "col_084"),
				MCItemDef.create("col_085", "col_085"),
				MCItemDef.create("col_086", "col_086"),
				MCItemDef.create("col_087", "col_087"),
				MCItemDef.create("col_088", "col_088"),
				MCItemDef.create("col_089", "col_089"),
				MCItemDef.create("col_090", "col_090"),
				MCItemDef.create("col_091", "col_091"),
				MCItemDef.create("col_092", "col_092"),
				MCItemDef.create("col_093", "col_093"),
				MCItemDef.create("col_094", "col_094"),
				MCItemDef.create("col_095", "col_095"),
				MCItemDef.create("col_096", "col_096"),
				MCItemDef.create("col_097", "col_097"),
				MCItemDef.create("col_098", "col_098"),
				MCItemDef.create("col_099", "col_099")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0210_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("dbc" + ".st_stk_key", "st_stk_key"),
				MCItemDef.create("dbc" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".gr_dt", "gr_dt"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".bp_cd", "bp_cd"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".std_flg", "std_flg"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("mng_dpt_nm", "mng_dpt_nm"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("itm_jnl_nm", "itm_jnl_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("asst_typ_nm", "asst_typ_nm"),
				MCItemDef.create("ttl", "ttl"),
				MCItemDef.create("col_000", "col_000"),
				MCItemDef.create("col_001", "col_001"),
				MCItemDef.create("col_002", "col_002"),
				MCItemDef.create("col_003", "col_003"),
				MCItemDef.create("col_004", "col_004"),
				MCItemDef.create("col_005", "col_005"),
				MCItemDef.create("col_006", "col_006"),
				MCItemDef.create("col_007", "col_007"),
				MCItemDef.create("col_008", "col_008"),
				MCItemDef.create("col_009", "col_009"),
				MCItemDef.create("col_010", "col_010"),
				MCItemDef.create("col_011", "col_011"),
				MCItemDef.create("col_012", "col_012"),
				MCItemDef.create("col_013", "col_013"),
				MCItemDef.create("col_014", "col_014"),
				MCItemDef.create("col_015", "col_015"),
				MCItemDef.create("col_016", "col_016"),
				MCItemDef.create("col_017", "col_017"),
				MCItemDef.create("col_018", "col_018"),
				MCItemDef.create("col_019", "col_019"),
				MCItemDef.create("col_020", "col_020"),
				MCItemDef.create("col_021", "col_021"),
				MCItemDef.create("col_022", "col_022"),
				MCItemDef.create("col_023", "col_023"),
				MCItemDef.create("col_024", "col_024"),
				MCItemDef.create("col_025", "col_025"),
				MCItemDef.create("col_026", "col_026"),
				MCItemDef.create("col_027", "col_027"),
				MCItemDef.create("col_028", "col_028"),
				MCItemDef.create("col_029", "col_029"),
				MCItemDef.create("col_030", "col_030"),
				MCItemDef.create("col_031", "col_031"),
				MCItemDef.create("col_032", "col_032"),
				MCItemDef.create("col_033", "col_033"),
				MCItemDef.create("col_034", "col_034"),
				MCItemDef.create("col_035", "col_035"),
				MCItemDef.create("col_036", "col_036"),
				MCItemDef.create("col_037", "col_037"),
				MCItemDef.create("col_038", "col_038"),
				MCItemDef.create("col_039", "col_039"),
				MCItemDef.create("col_040", "col_040"),
				MCItemDef.create("col_041", "col_041"),
				MCItemDef.create("col_042", "col_042"),
				MCItemDef.create("col_043", "col_043"),
				MCItemDef.create("col_044", "col_044"),
				MCItemDef.create("col_045", "col_045"),
				MCItemDef.create("col_046", "col_046"),
				MCItemDef.create("col_047", "col_047"),
				MCItemDef.create("col_048", "col_048"),
				MCItemDef.create("col_049", "col_049"),
				MCItemDef.create("col_050", "col_050"),
				MCItemDef.create("col_051", "col_051"),
				MCItemDef.create("col_052", "col_052"),
				MCItemDef.create("col_053", "col_053"),
				MCItemDef.create("col_054", "col_054"),
				MCItemDef.create("col_055", "col_055"),
				MCItemDef.create("col_056", "col_056"),
				MCItemDef.create("col_057", "col_057"),
				MCItemDef.create("col_058", "col_058"),
				MCItemDef.create("col_059", "col_059"),
				MCItemDef.create("col_060", "col_060"),
				MCItemDef.create("col_061", "col_061"),
				MCItemDef.create("col_062", "col_062"),
				MCItemDef.create("col_063", "col_063"),
				MCItemDef.create("col_064", "col_064"),
				MCItemDef.create("col_065", "col_065"),
				MCItemDef.create("col_066", "col_066"),
				MCItemDef.create("col_067", "col_067"),
				MCItemDef.create("col_068", "col_068"),
				MCItemDef.create("col_069", "col_069"),
				MCItemDef.create("col_070", "col_070"),
				MCItemDef.create("col_071", "col_071"),
				MCItemDef.create("col_072", "col_072"),
				MCItemDef.create("col_073", "col_073"),
				MCItemDef.create("col_074", "col_074"),
				MCItemDef.create("col_075", "col_075"),
				MCItemDef.create("col_076", "col_076"),
				MCItemDef.create("col_077", "col_077"),
				MCItemDef.create("col_078", "col_078"),
				MCItemDef.create("col_079", "col_079"),
				MCItemDef.create("col_080", "col_080"),
				MCItemDef.create("col_081", "col_081"),
				MCItemDef.create("col_082", "col_082"),
				MCItemDef.create("col_083", "col_083"),
				MCItemDef.create("col_084", "col_084"),
				MCItemDef.create("col_085", "col_085"),
				MCItemDef.create("col_086", "col_086"),
				MCItemDef.create("col_087", "col_087"),
				MCItemDef.create("col_088", "col_088"),
				MCItemDef.create("col_089", "col_089"),
				MCItemDef.create("col_090", "col_090"),
				MCItemDef.create("col_091", "col_091"),
				MCItemDef.create("col_092", "col_092"),
				MCItemDef.create("col_093", "col_093"),
				MCItemDef.create("col_094", "col_094"),
				MCItemDef.create("col_095", "col_095"),
				MCItemDef.create("col_096", "col_096"),
				MCItemDef.create("col_097", "col_097"),
				MCItemDef.create("col_098", "col_098"),
				MCItemDef.create("col_099", "col_099")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0210_Upd01_INFO = new MCOperationInfo("MG", "MGBBL0210", "Upd01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0210_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".st_stk_key", "st_stk_key"),
				MCItemDef.create("dbc" + ".calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd"),
				MCItemDef.create("dbc" + ".ym", "ym"),
				MCItemDef.create("dbc" + ".gr_dt", "gr_dt"),
				MCItemDef.create("dbc" + ".mng_dpt_cd", "mng_dpt_cd"),
				MCItemDef.create("dbc" + ".itm_cd", "itm_cd"),
				MCItemDef.create("dbc" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("dbc" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("dbc" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("dbc" + ".lot_no", "lot_no"),
				MCItemDef.create("dbc" + ".sublot_no", "sublot_no"),
				MCItemDef.create("dbc" + ".sno1", "sno1"),
				MCItemDef.create("dbc" + ".sno2", "sno2"),
				MCItemDef.create("dbc" + ".sno3", "sno3"),
				MCItemDef.create("dbc" + ".sno4", "sno4"),
				MCItemDef.create("dbc" + ".bp_cd", "bp_cd"),
				MCItemDef.create("dbc" + ".asst_typ", "asst_typ"),
				MCItemDef.create("dbc" + ".repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("dbc" + ".qty", "qty"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr"),
				MCItemDef.create("col_000", "col_000"),
				MCItemDef.create("col_001", "col_001"),
				MCItemDef.create("col_002", "col_002"),
				MCItemDef.create("col_003", "col_003"),
				MCItemDef.create("col_004", "col_004"),
				MCItemDef.create("col_005", "col_005"),
				MCItemDef.create("col_006", "col_006"),
				MCItemDef.create("col_007", "col_007"),
				MCItemDef.create("col_008", "col_008"),
				MCItemDef.create("col_009", "col_009"),
				MCItemDef.create("col_010", "col_010"),
				MCItemDef.create("col_011", "col_011"),
				MCItemDef.create("col_012", "col_012"),
				MCItemDef.create("col_013", "col_013"),
				MCItemDef.create("col_014", "col_014"),
				MCItemDef.create("col_015", "col_015"),
				MCItemDef.create("col_016", "col_016"),
				MCItemDef.create("col_017", "col_017"),
				MCItemDef.create("col_018", "col_018"),
				MCItemDef.create("col_019", "col_019"),
				MCItemDef.create("col_020", "col_020"),
				MCItemDef.create("col_021", "col_021"),
				MCItemDef.create("col_022", "col_022"),
				MCItemDef.create("col_023", "col_023"),
				MCItemDef.create("col_024", "col_024"),
				MCItemDef.create("col_025", "col_025"),
				MCItemDef.create("col_026", "col_026"),
				MCItemDef.create("col_027", "col_027"),
				MCItemDef.create("col_028", "col_028"),
				MCItemDef.create("col_029", "col_029"),
				MCItemDef.create("col_030", "col_030"),
				MCItemDef.create("col_031", "col_031"),
				MCItemDef.create("col_032", "col_032"),
				MCItemDef.create("col_033", "col_033"),
				MCItemDef.create("col_034", "col_034"),
				MCItemDef.create("col_035", "col_035"),
				MCItemDef.create("col_036", "col_036"),
				MCItemDef.create("col_037", "col_037"),
				MCItemDef.create("col_038", "col_038"),
				MCItemDef.create("col_039", "col_039"),
				MCItemDef.create("col_040", "col_040"),
				MCItemDef.create("col_041", "col_041"),
				MCItemDef.create("col_042", "col_042"),
				MCItemDef.create("col_043", "col_043"),
				MCItemDef.create("col_044", "col_044"),
				MCItemDef.create("col_045", "col_045"),
				MCItemDef.create("col_046", "col_046"),
				MCItemDef.create("col_047", "col_047"),
				MCItemDef.create("col_048", "col_048"),
				MCItemDef.create("col_049", "col_049"),
				MCItemDef.create("col_050", "col_050"),
				MCItemDef.create("col_051", "col_051"),
				MCItemDef.create("col_052", "col_052"),
				MCItemDef.create("col_053", "col_053"),
				MCItemDef.create("col_054", "col_054"),
				MCItemDef.create("col_055", "col_055"),
				MCItemDef.create("col_056", "col_056"),
				MCItemDef.create("col_057", "col_057"),
				MCItemDef.create("col_058", "col_058"),
				MCItemDef.create("col_059", "col_059"),
				MCItemDef.create("col_060", "col_060"),
				MCItemDef.create("col_061", "col_061"),
				MCItemDef.create("col_062", "col_062"),
				MCItemDef.create("col_063", "col_063"),
				MCItemDef.create("col_064", "col_064"),
				MCItemDef.create("col_065", "col_065"),
				MCItemDef.create("col_066", "col_066"),
				MCItemDef.create("col_067", "col_067"),
				MCItemDef.create("col_068", "col_068"),
				MCItemDef.create("col_069", "col_069"),
				MCItemDef.create("col_070", "col_070"),
				MCItemDef.create("col_071", "col_071"),
				MCItemDef.create("col_072", "col_072"),
				MCItemDef.create("col_073", "col_073"),
				MCItemDef.create("col_074", "col_074"),
				MCItemDef.create("col_075", "col_075"),
				MCItemDef.create("col_076", "col_076"),
				MCItemDef.create("col_077", "col_077"),
				MCItemDef.create("col_078", "col_078"),
				MCItemDef.create("col_079", "col_079"),
				MCItemDef.create("col_080", "col_080"),
				MCItemDef.create("col_081", "col_081"),
				MCItemDef.create("col_082", "col_082"),
				MCItemDef.create("col_083", "col_083"),
				MCItemDef.create("col_084", "col_084"),
				MCItemDef.create("col_085", "col_085"),
				MCItemDef.create("col_086", "col_086"),
				MCItemDef.create("col_087", "col_087"),
				MCItemDef.create("col_088", "col_088"),
				MCItemDef.create("col_089", "col_089"),
				MCItemDef.create("col_090", "col_090"),
				MCItemDef.create("col_091", "col_091"),
				MCItemDef.create("col_092", "col_092"),
				MCItemDef.create("col_093", "col_093"),
				MCItemDef.create("col_094", "col_094"),
				MCItemDef.create("col_095", "col_095"),
				MCItemDef.create("col_096", "col_096"),
				MCItemDef.create("col_097", "col_097"),
				MCItemDef.create("col_098", "col_098"),
				MCItemDef.create("col_099", "col_099")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0210_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0210_Del01_INFO = new MCOperationInfo("MG", "MGBBL0210", "Del01", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0210_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Del01",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".st_stk_key", "st_stk_key"),
				MCItemDef.create("dbc" + ".upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MG_MGBBL0210_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0210_Del02_INFO = new MCOperationInfo("MG", "MGBBL0210", "Del02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0210_Del02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Del02",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("mng_dpt_cd", "mng_dpt_cd")
			}
			,
			MCBlockDef.create("Del02_Cnd")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0210_Upd02_INFO = new MCOperationInfo("MG", "MGBBL0210", "Upd02", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0210_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("dbc" + ".st_stk_key", "st_stk_key"),
				MCItemDef.create("dbc" + ".wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("Upd02_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBBL0210_Upd03_INFO = new MCOperationInfo("MG", "MGBBL0210", "Upd03", "000000", new PDef());

	public static MCContainerDef MG_MGBBL0210_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBBL0210", "Upd03",
			new MCItemDef[]{
				MCItemDef.create("calc_grp_cd", "calc_grp_cd"),
				MCItemDef.create("calc_grp_nm", "calc_grp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
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
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("no_bp_flg", "no_bp_flg"),
				MCItemDef.create("bp_cntry_cd", "bp_cntry_cd"),
				MCItemDef.create("bp_cntry_nm", "bp_cntry_nm"),
				MCItemDef.create("bp_area_cd", "bp_area_cd"),
				MCItemDef.create("bp_area_nm", "bp_area_nm"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("except_oth_flg", "except_oth_flg"),
				MCItemDef.create("eval_typ", "eval_typ"),
				MCItemDef.create("std_bf_flg", "std_bf_flg"),
				MCItemDef.create("std_af_flg", "std_af_flg"),
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
				MCItemDef.create("bp_grp_cd1", "bp_grp_cd1"),
				MCItemDef.create("bp_grp_nm1", "bp_grp_nm1"),
				MCItemDef.create("bp_grp_cd2", "bp_grp_cd2"),
				MCItemDef.create("bp_grp_nm2", "bp_grp_nm2"),
				MCItemDef.create("bp_grp_cd3", "bp_grp_cd3"),
				MCItemDef.create("bp_grp_nm3", "bp_grp_nm3"),
				MCItemDef.create("bp_grp_cd4", "bp_grp_cd4"),
				MCItemDef.create("bp_grp_nm4", "bp_grp_nm4"),
				MCItemDef.create("bp_grp_cd5", "bp_grp_cd5"),
				MCItemDef.create("bp_grp_nm5", "bp_grp_nm5"),
				MCItemDef.create("bp_grp_cd6", "bp_grp_cd6"),
				MCItemDef.create("bp_grp_nm6", "bp_grp_nm6"),
				MCItemDef.create("bp_grp_cd7", "bp_grp_cd7"),
				MCItemDef.create("bp_grp_nm7", "bp_grp_nm7"),
				MCItemDef.create("bp_grp_cd8", "bp_grp_cd8"),
				MCItemDef.create("bp_grp_nm8", "bp_grp_nm8"),
				MCItemDef.create("bp_grp_cd9", "bp_grp_cd9"),
				MCItemDef.create("bp_grp_nm9", "bp_grp_nm9"),
				MCItemDef.create("bp_grp_cd10", "bp_grp_cd10"),
				MCItemDef.create("bp_grp_nm10", "bp_grp_nm10")
			}
			,
			MCBlockDef.create("Upd03_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

