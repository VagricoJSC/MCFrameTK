package mcframe.serverMGBE.MGBEL0020;

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
 * [MGBEL_StdItmOperCostSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBEL0020.Srch01.UP.BLOCK0")){
			return MG_MGBEL0020_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBEL0020.Srch01.DOWN.BLOCK0")){
			return MG_MGBEL0020_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBEL0020_Srch01_INFO = new MCOperationInfo("MG", "MGBEL0020", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBEL0020_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBEL0020", "Srch01",
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
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("par_itm_cd", "par_itm_cd"),
				MCItemDef.create("par_itm_sub1", "par_itm_sub1"),
				MCItemDef.create("par_itm_sub2", "par_itm_sub2"),
				MCItemDef.create("par_itm_sub3", "par_itm_sub3"),
				MCItemDef.create("par_itm_nm", "par_itm_nm"),
				MCItemDef.create("chd_itm_cd", "chd_itm_cd"),
				MCItemDef.create("chd_itm_sub1", "chd_itm_sub1"),
				MCItemDef.create("chd_itm_sub2", "chd_itm_sub2"),
				MCItemDef.create("chd_itm_sub3", "chd_itm_sub3"),
				MCItemDef.create("chd_itm_nm", "chd_itm_nm"),
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
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBEL0020_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBEL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
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
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("oper_cd", "oper_cd"),
				MCItemDef.create("oper_nm", "oper_nm"),
				MCItemDef.create("oper_seq", "oper_seq"),
				MCItemDef.create("std_qty", "std_qty"),
				MCItemDef.create("the_qty", "the_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("oper_unit_cd", "oper_unit_cd"),
				MCItemDef.create("oper_unit_nm", "oper_unit_nm"),
				MCItemDef.create("oper_std_qty", "oper_std_qty"),
				MCItemDef.create("oper_conv_qty", "oper_conv_qty"),
				MCItemDef.create("std_mfg_cost", "std_mfg_cost"),
				MCItemDef.create("the_mfg_cost", "the_mfg_cost"),
				MCItemDef.create("column_id", "column_id"),
				MCItemDef.create("all_ttl", "all_ttl"),
				MCItemDef.create("ttl", "ttl"),
				MCItemDef.create("var_cost", "var_cost"),
				MCItemDef.create("fxd_cost", "fxd_cost"),
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
	//FMCB DEF_CLASSES END
}

