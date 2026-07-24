package mcframe.serverMGBG.MGBGL0160;

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
 * [MGBGL_PreAlcRateReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MG.MGBGL0160.Srch01.UP.BLOCK0")){
			return MG_MGBGL0160_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBGL0160.Srch01.DOWN.BLOCK0")){
			return MG_MGBGL0160_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MG.MGBGL0160.Chk01.UP.BLOCK0")){
			return MG_MGBGL0160_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MG.MGBGL0160.Ins01.UP.BLOCK0")){
			return MG_MGBGL0160_Ins01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MG_MGBGL0160_Srch01_INFO = new MCOperationInfo("MG", "MGBGL0160", "Srch01", "000000", new PDef());

	public static MCContainerDef MG_MGBGL0160_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL0160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("pre_alc_rate_cd", "pre_alc_rate_cd"),
				MCItemDef.create("pre_alc_rate_nm", "pre_alc_rate_nm"),
				MCItemDef.create("pre_alc_set_typ", "pre_alc_set_typ"),
				MCItemDef.create("no_exist_flg", true, "no_exist_flg"),
				MCItemDef.create("sa_typ", "sa_typ"),
				MCItemDef.create("tgt_ym_fr", "tgt_ym_fr"),
				MCItemDef.create("tgt_ym_to", "tgt_ym_to")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MG_MGBGL0160_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL0160", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("exist_flg", "exist_flg"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("calc_ctg_nm", "calc_ctg_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("pre_alc_rate_cd", "pre_alc_rate_cd"),
				MCItemDef.create("pre_alc_rate_nm", "pre_alc_rate_nm"),
				MCItemDef.create("pre_alc_set_typ", "pre_alc_set_typ"),
				MCItemDef.create("pre_alc_set_typ_nm", "pre_alc_set_typ_nm"),
				MCItemDef.create("pln_mly_flg", "pln_mly_flg"),
				MCItemDef.create("act_mly_flg", "act_mly_flg"),
				MCItemDef.create("pln_rule_flg", "pln_rule_flg")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MG_MGBGL0160_Chk01_INFO = new MCOperationInfo("MG", "MGBGL0160", "Chk01", "000000", new PDef());

	public static MCContainerDef MG_MGBGL0160_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL0160", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("sa_typ", "sa_typ"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("pre_alc_rate_cd", "pre_alc_rate_cd"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MG_MGBGL0160_Ins01_INFO = new MCOperationInfo("MG", "MGBGL0160", "Ins01", "000000", new PDef());

	public static MCContainerDef MG_MGBGL0160_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MG", "MGBGL0160", "Ins01",
			new MCItemDef[]{
				MCItemDef.create("sa_typ", "sa_typ"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("calc_ctg_cd", "calc_ctg_cd"),
				MCItemDef.create("pre_alc_rate_cd", "pre_alc_rate_cd"),
				MCItemDef.create("wg_cd", "wg_cd")
			}
			,
			MCBlockDef.create("Ins01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

