package mcframe.serverMGBG.MGBGL0150;

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
 * [MGBGL_PreAlcRateSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBGL0150.Srch01.UP.BLOCK0")){
			return MG_MGBGL0150_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBGL0150.Srch01.DOWN.BLOCK0")){
			return MG_MGBGL0150_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MG_MGBGL0150_Srch01_INFO = new MCOperationInfo("MG", "MGBGL0150", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBGL0150_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL0150", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("typ", "typ"),
				MCItemDef.create("term_fr", "term_fr"),
				MCItemDef.create("term_to", "term_to"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("pln_calc_ctg_cd", "pln_calc_ctg_cd"),
				MCItemDef.create("act_calc_ctg_cd", "act_calc_ctg_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("pre_alc_rate_cd", "pre_alc_rate_cd")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBGL0150_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL0150", "Srch01",
			new MCItemDef[]{
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
				MCItemDef.create("itm_mfg_inst_no", "itm_mfg_inst_no"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("alc_ac_cd", "alc_ac_cd"),
				MCItemDef.create("alc_ac_nm", "alc_ac_nm"),
				MCItemDef.create("trd_wg_cd", "trd_wg_cd"),
				MCItemDef.create("trd_wg_nm", "trd_wg_nm"),
				MCItemDef.create("term00", "term00"),
				MCItemDef.create("term01", "term01"),
				MCItemDef.create("term02", "term02"),
				MCItemDef.create("term03", "term03"),
				MCItemDef.create("term04", "term04"),
				MCItemDef.create("pln00", "pln00"),
				MCItemDef.create("pln01", "pln01"),
				MCItemDef.create("pln02", "pln02"),
				MCItemDef.create("pln03", "pln03"),
				MCItemDef.create("pln04", "pln04"),
				MCItemDef.create("pln05", "pln05"),
				MCItemDef.create("pln06", "pln06"),
				MCItemDef.create("pln07", "pln07"),
				MCItemDef.create("pln08", "pln08"),
				MCItemDef.create("pln09", "pln09"),
				MCItemDef.create("pln10", "pln10"),
				MCItemDef.create("pln11", "pln11"),
				MCItemDef.create("pln12", "pln12"),
				MCItemDef.create("pln13", "pln13"),
				MCItemDef.create("pln14", "pln14"),
				MCItemDef.create("pln15", "pln15"),
				MCItemDef.create("pln16", "pln16"),
				MCItemDef.create("pln17", "pln17"),
				MCItemDef.create("pln18", "pln18"),
				MCItemDef.create("pln19", "pln19"),
				MCItemDef.create("pln20", "pln20"),
				MCItemDef.create("pln21", "pln21"),
				MCItemDef.create("pln22", "pln22"),
				MCItemDef.create("pln23", "pln23"),
				MCItemDef.create("pln24", "pln24"),
				MCItemDef.create("pln25", "pln25"),
				MCItemDef.create("pln26", "pln26"),
				MCItemDef.create("pln27", "pln27"),
				MCItemDef.create("pln28", "pln28"),
				MCItemDef.create("pln29", "pln29"),
				MCItemDef.create("pln30", "pln30"),
				MCItemDef.create("pln31", "pln31"),
				MCItemDef.create("pln32", "pln32"),
				MCItemDef.create("pln33", "pln33"),
				MCItemDef.create("pln34", "pln34"),
				MCItemDef.create("pln35", "pln35"),
				MCItemDef.create("pln36", "pln36"),
				MCItemDef.create("pln37", "pln37"),
				MCItemDef.create("pln38", "pln38"),
				MCItemDef.create("pln39", "pln39"),
				MCItemDef.create("pln40", "pln40"),
				MCItemDef.create("pln41", "pln41"),
				MCItemDef.create("pln42", "pln42"),
				MCItemDef.create("pln43", "pln43"),
				MCItemDef.create("pln44", "pln44"),
				MCItemDef.create("pln45", "pln45"),
				MCItemDef.create("pln46", "pln46"),
				MCItemDef.create("pln47", "pln47"),
				MCItemDef.create("pln48", "pln48"),
				MCItemDef.create("pln49", "pln49"),
				MCItemDef.create("pln50", "pln50"),
				MCItemDef.create("pln51", "pln51"),
				MCItemDef.create("pln52", "pln52"),
				MCItemDef.create("pln53", "pln53"),
				MCItemDef.create("pln54", "pln54"),
				MCItemDef.create("pln55", "pln55"),
				MCItemDef.create("pln56", "pln56"),
				MCItemDef.create("pln57", "pln57"),
				MCItemDef.create("pln58", "pln58"),
				MCItemDef.create("pln59", "pln59"),
				MCItemDef.create("act00", "act00"),
				MCItemDef.create("act01", "act01"),
				MCItemDef.create("act02", "act02"),
				MCItemDef.create("act03", "act03"),
				MCItemDef.create("act04", "act04"),
				MCItemDef.create("act05", "act05"),
				MCItemDef.create("act06", "act06"),
				MCItemDef.create("act07", "act07"),
				MCItemDef.create("act08", "act08"),
				MCItemDef.create("act09", "act09"),
				MCItemDef.create("act10", "act10"),
				MCItemDef.create("act11", "act11"),
				MCItemDef.create("act12", "act12"),
				MCItemDef.create("act13", "act13"),
				MCItemDef.create("act14", "act14"),
				MCItemDef.create("act15", "act15"),
				MCItemDef.create("act16", "act16"),
				MCItemDef.create("act17", "act17"),
				MCItemDef.create("act18", "act18"),
				MCItemDef.create("act19", "act19"),
				MCItemDef.create("act20", "act20"),
				MCItemDef.create("act21", "act21"),
				MCItemDef.create("act22", "act22"),
				MCItemDef.create("act23", "act23"),
				MCItemDef.create("act24", "act24"),
				MCItemDef.create("act25", "act25"),
				MCItemDef.create("act26", "act26"),
				MCItemDef.create("act27", "act27"),
				MCItemDef.create("act28", "act28"),
				MCItemDef.create("act29", "act29"),
				MCItemDef.create("act30", "act30"),
				MCItemDef.create("act31", "act31"),
				MCItemDef.create("act32", "act32"),
				MCItemDef.create("act33", "act33"),
				MCItemDef.create("act34", "act34"),
				MCItemDef.create("act35", "act35"),
				MCItemDef.create("act36", "act36"),
				MCItemDef.create("act37", "act37"),
				MCItemDef.create("act38", "act38"),
				MCItemDef.create("act39", "act39"),
				MCItemDef.create("act40", "act40"),
				MCItemDef.create("act41", "act41"),
				MCItemDef.create("act42", "act42"),
				MCItemDef.create("act43", "act43"),
				MCItemDef.create("act44", "act44"),
				MCItemDef.create("act45", "act45"),
				MCItemDef.create("act46", "act46"),
				MCItemDef.create("act47", "act47"),
				MCItemDef.create("act48", "act48"),
				MCItemDef.create("act49", "act49"),
				MCItemDef.create("act50", "act50"),
				MCItemDef.create("act51", "act51"),
				MCItemDef.create("act52", "act52"),
				MCItemDef.create("act53", "act53"),
				MCItemDef.create("act54", "act54"),
				MCItemDef.create("act55", "act55"),
				MCItemDef.create("act56", "act56"),
				MCItemDef.create("act57", "act57"),
				MCItemDef.create("act58", "act58"),
				MCItemDef.create("act59", "act59")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

